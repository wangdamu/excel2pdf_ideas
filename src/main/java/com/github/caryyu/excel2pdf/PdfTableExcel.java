package com.github.caryyu.excel2pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import static org.apache.poi.ss.usermodel.Row.MissingCellPolicy.CREATE_NULL_AS_BLANK;

/**
 * Created by cary on 6/15/17.
 */
public class PdfTableExcel {
    //ExcelObject
    protected ExcelObject excelObject;
    //excel
    protected Excel excel;
    //
    protected boolean setting = false;

    private DataFormatter dataFormatter = new DataFormatter();

    /**
     * <p>Description: Constructor</p>
     * @param excelObject
     */
    public PdfTableExcel(ExcelObject excelObject){
        this.excelObject = excelObject;
        this.excel = excelObject.getExcel();
    }

    /**
     * <p>Description: 获取转换过的Excel内容Table</p>
     * @return PdfPTable
     * @throws BadElementException
     * @throws MalformedURLException
     * @throws IOException
     */
    public PdfPTable getTable() throws DocumentException, MalformedURLException, IOException {
        Sheet sheet = this.excel.getSheet();
        return toParseContent(sheet, this.excel.getMetadata());
    }

    protected PdfPTable toParseContent(Sheet sheet, Excel.Metadata metadata) throws DocumentException, MalformedURLException, IOException{
        int rowlength = metadata.getRowCount();
        List<PdfPCell> cells = new ArrayList<PdfPCell>();
        float[] widths = null;
        float mw = 0;
        DataFormatter dataFormat = new DataFormatter();
        for (int i = 0; i < rowlength; i++) {
            Row row = sheet.getRow(i);
            float[] cws = new float[metadata.getColumnCount()];
            for (int j = 0; j < metadata.getColumnCount(); j++) {
                Cell cell = row.getCell(j, CREATE_NULL_AS_BLANK);
                float cw = getPOIColumnWidth(cell, metadata);
                cws[cell.getColumnIndex()] = cw;
                if(isUsed(cell.getColumnIndex(), row.getRowNum())){
                    continue;
                }
                CellRangeAddress range = getColspanRowspanByExcel(row.getRowNum(), cell.getColumnIndex());
                //
                int rowspan = 1;
                int colspan = 1;
                if (range != null) {
                    rowspan = range.getLastRow() - range.getFirstRow() + 1;
                    colspan = range.getLastColumn() - range.getFirstColumn() + 1;
                }
                //PDF单元格
                PdfPCell pdfpCell = new PdfPCell();
                pdfpCell.setBackgroundColor(new BaseColor(getBackgroundColorByExcel(cell.getCellStyle())));
                pdfpCell.setColspan(colspan);
                pdfpCell.setRowspan(rowspan);
                pdfpCell.setVerticalAlignment(getVAlignByExcel(cell.getCellStyle().getVerticalAlignmentEnum()));
                pdfpCell.setHorizontalAlignment(getHAlignByExcel(cell.getCellStyle().getAlignmentEnum()));
                pdfpCell.setPhrase(getPhrase(cell));
//                pdfpCell.setFixedHeight();
                pdfpCell.setFixedHeight(this.getPixelHeight(row.getHeightInPoints()));
                addBorderByExcel(pdfpCell, cell.getCellStyle());
                addImageByPOICell(pdfpCell , cell , cw);
                //
                cells.add(pdfpCell);
                j += colspan - 1;
            }
            float rw = 0;
            for (int j = 0; j < cws.length; j++) {
                rw += cws[j];
            }
            if (rw > mw ||  mw == 0) {
                widths = cws;
                mw = rw;

                for(int w = 0; w < widths.length; w++){
                    widths[w] = widths[w] / mw * PageSize.A4.getWidth() * 0.9F;
                }
            }
        }
        //
        PdfPTable table = new PdfPTable(widths);
        table.setWidthPercentage(100);
//        table.setLockedWidth(true);
        for (PdfPCell pdfpCell : cells) {
            table.addCell(pdfpCell);
        }
        table.setTotalWidth(widths);
        table.setLockedWidth(true);
        return table;
    }

    protected Phrase getPhrase(Cell cell) throws IOException, DocumentException {
        String cellValue = getCellStringValue(cell);
        if(this.setting || this.excelObject.getAnchorName() == null){
            return new Phrase(cellValue, getFontByExcel(cell));
        }
        Anchor anchor = new Anchor(cellValue , getFontByExcel(cell));
        anchor.setName(this.excelObject.getAnchorName());
        this.setting = true;
        return anchor;
    }

    /**
     * 获取cell的字符串值
     * @param cell
     * @return
     */
    private String getCellStringValue(Cell cell){
        if(cell.getCellTypeEnum() == CellType.FORMULA){
            cell.setCellType(CellType.NUMERIC);
        }
        return dataFormatter.formatCellValue(cell);
    }

    protected void addImageByPOICell(PdfPCell pdfpCell , Cell cell , float cellWidth) throws BadElementException, MalformedURLException, IOException{
        POIImage poiImage = new POIImage().getCellImage(cell);
        byte[] bytes = poiImage.getBytes();
        if(bytes != null){
//           double cw = cellWidth;
//           double ch = pdfpCell.getFixedHeight();
//
//           double iw = poiImage.getDimension().getWidth();
//           double ih = poiImage.getDimension().getHeight();
//
//           double scale = cw / ch;
//
//           double nw = iw * scale;
//           double nh = ih - (iw - nw);
//
//            bytes = POIUtil.scale(bytes , nw  , nh);
//            ClientAnchor clientAnchor = poiImage.getAnchor();
//            pdfpCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//            pdfpCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //Image image = Image.getInstance(clientAnchor.getDx2() - clientAnchor.getDx1(), clientAnchor.getDy1() - clientAnchor.getDy2(), 3, 1, bytes);
            Image image = Image.getInstance(bytes);
//            image.setBottom(clientAnchor.getDy2());
            pdfpCell.setImage(image);

        }
    }

    protected float getPixelHeight(float poiHeight){
        float pixel = poiHeight / 28.6f * 26f;
        return pixel;
    }

    /**
     * <p>Description: 此处获取Excel的列宽像素(无法精确实现,期待有能力的朋友进行改善此处)</p>
     * @param cell
     * @param metadata
     * @return 像素宽
     */
    protected int getPOIColumnWidth(Cell cell, Excel.Metadata metadata) {
        return (int)(float) metadata.getColumnWidthMap().get(cell.getColumnIndex());
//        int poiCWidth = metadata.getColumnWidthMap().get(cell.getColumnIndex());
//        int colWidthpoi = poiCWidth;
//        int widthPixel = 0;
//        if (colWidthpoi >= 416) {
//            widthPixel = (int) (((colWidthpoi - 416.0) / 256.0) * 8.0 + 13.0 + 0.5);
//        } else {
//            widthPixel = (int) (colWidthpoi / 416.0 * 13.0 + 0.5);
//        }
//        return widthPixel;
    }

    protected CellRangeAddress getColspanRowspanByExcel(int rowIndex, int colIndex) {
        CellRangeAddress result = null;
        Sheet sheet = excel.getSheet();
        int num = sheet.getNumMergedRegions();
        for (int i = 0; i < num; i++) {
            CellRangeAddress range = sheet.getMergedRegion(i);
            if (range.getFirstColumn() == colIndex && range.getFirstRow() == rowIndex) {
                result = range;
            }
        }
        return result;
    }

    protected boolean isUsed(int colIndex , int rowIndex){
        boolean result = false;
        Sheet sheet = excel.getSheet();
        int num = sheet.getNumMergedRegions();
        for (int i = 0; i < num; i++) {
            CellRangeAddress range = sheet.getMergedRegion(i);
            int firstRow = range.getFirstRow();
            int lastRow = range.getLastRow();
            int firstColumn = range.getFirstColumn();
            int lastColumn = range.getLastColumn();
            if (firstRow < rowIndex && lastRow >= rowIndex) {
                if(firstColumn <= colIndex && lastColumn >= colIndex){
                    result = true;
                }
            }
        }
        return result;
    }

    protected Font getFontByExcel(Cell cell) throws IOException, DocumentException {
        CellStyle style = cell.getCellStyle();
        Workbook wb = excel.getWorkbook();
        //字体样式索引
        short index = style.getFontIndex();
        org.apache.poi.ss.usermodel.Font font = wb.getFontAt(index);

        Font result = new Font(Resource.getBaseFont(font.getFontName()), 8 , Font.NORMAL);


//        System.out.println(font.getFontName() + "   " + font.getFontHeightInPoints());
        //字体颜色
        int colorIndex = font.getColor();
        if(font.getBold()){
            result.setStyle(Font.BOLD);
        }

        float fontSizeInPoint = font.getFontHeightInPoints();

        if(cell.getCellTypeEnum() != CellType.BLANK){
            if("arial".equalsIgnoreCase(font.getFontName()) && (14 == fontSizeInPoint || 11 == fontSizeInPoint)){
                fontSizeInPoint = 11;
            }
            result.setSize(fontSizeInPoint);
        }else{
            result.setSize(8);
        }
        result.setSize(11);

        HSSFColor color = HSSFColor.getIndexHash().get(colorIndex);
        if(color != null){
            int rbg = POIUtil.getRGB(color);
            result.setColor(new BaseColor(rbg));
        }
        //下划线
        FontUnderline underline = FontUnderline.valueOf(font.getUnderline());
        if(underline == FontUnderline.SINGLE){
            String ulString = Font.FontStyle.UNDERLINE.getValue();
            result.setStyle(ulString);
        }
        return result;
    }

    protected int getBackgroundColorByExcel(CellStyle style) {
        Color color = style.getFillForegroundColorColor();
        return POIUtil.getRGB(color);
    }

    protected void addBorderByExcel(PdfPCell cell , CellStyle style) {
        Workbook wb = excel.getWorkbook();
        BorderStyle leftBorderStyle = style.getBorderLeftEnum();
        if(style.getBorderLeftEnum() != BorderStyle.NONE) {
            cell.setBorderColorLeft(new BaseColor(POIUtil.getBorderRBG(wb, style.getLeftBorderColor())));
        }else {
//            cell.setBorderWidthLeft(0);
        }
        if(style.getBorderRightEnum() != BorderStyle.NONE) {
            cell.setBorderColorRight(new BaseColor(POIUtil.getBorderRBG(wb, style.getRightBorderColor())));
        }else {
//            cell.setBorderWidthRight(0);
        }
        if(style.getBorderTopEnum() != BorderStyle.NONE) {
            cell.setBorderColorTop(new BaseColor(POIUtil.getBorderRBG(wb,style.getTopBorderColor())));
        }else {
//            cell.setBorderWidthTop(0);
        }
        if(style.getBorderBottomEnum() != BorderStyle.NONE) {
            cell.setBorderColorBottom(new BaseColor(POIUtil.getBorderRBG(wb, style.getBottomBorderColor())));
        }else {
//            cell.setBorderWidthBottom(0);
        }
    }

    protected int getVAlignByExcel(VerticalAlignment align) {
        int result = 0;
        if (align == VerticalAlignment.BOTTOM) {
            result = Element.ALIGN_BOTTOM;
        }
        if (align == VerticalAlignment.CENTER) {
            result = Element.ALIGN_MIDDLE;
        }
        if (align == VerticalAlignment.JUSTIFY) {
            result = Element.ALIGN_JUSTIFIED;
        }
        if (align == VerticalAlignment.TOP) {
            result = Element.ALIGN_TOP;
        }
        return result;
    }

    protected int getHAlignByExcel(HorizontalAlignment align) {
        int result = 0;
        if (align == HorizontalAlignment.LEFT) {
            result = Element.ALIGN_LEFT;
        }
        if (align == HorizontalAlignment.RIGHT) {
            result = Element.ALIGN_RIGHT;
        }
        if (align == HorizontalAlignment.JUSTIFY) {
            result = Element.ALIGN_JUSTIFIED;
        }
        if (align == HorizontalAlignment.CENTER) {
            result = Element.ALIGN_CENTER;
        }
        return result;
    }
}