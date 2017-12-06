package com.github.caryyu.excel2pdf;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cary on 6/15/17.
 */
public class Excel {

    protected Workbook wb;
    protected Sheet sheet;

    protected Metadata metadata;

    public Excel(InputStream is) {
        try {
            this.wb = new HSSFWorkbook(is);
            this.sheet = wb.getSheetAt(wb.getActiveSheetIndex());
            this.calMetadata();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Metadata getMetadata() {
        return metadata;
    }

    private void calMetadata(){
        Metadata metadata = new Metadata();
        int lastRowNum = this.sheet.getLastRowNum();
        int firstRowNum = this.sheet.getFirstRowNum();
        int rowCount = 0;
        int columnCount = 0;
        for(int i = firstRowNum; i <= lastRowNum; i++){
            Row row = this.sheet.getRow(i);
            if(row == null){
                continue;
            }
            metadata.getRowHeightMap().put(i, (int)row.getHeight());

            int firstCellNum = row.getFirstCellNum();
            int lastCellNum = row.getLastCellNum();
            boolean isRowValid = false;
            for(int j = 0; j <= lastCellNum; j++){
                metadata.getColumnWidthMap().put(j, this.sheet.getColumnWidthInPixels(j));
                Cell cell = row.getCell(j);
                if(cell == null){
                    continue;
                }
                isRowValid = isRowValid || (cell.getCellTypeEnum() != CellType.BLANK);
                if(columnCount < j && cell.getCellTypeEnum() != CellType.BLANK){
                    columnCount = j;
                }
            }

            if(isRowValid) {
                rowCount = i;
            }
        }

        metadata.setRowCount(rowCount + 1);
        metadata.setColumnCount(columnCount + 1);
        this.metadata = metadata;

    }

    public Sheet getSheet() {
        return sheet;
    }

    public Workbook getWorkbook(){
        return wb;
    }

    public static class Metadata{
        private int rowCount;
        private int columnCount;
        private Map<Integer, Integer> rowHeightMap = new HashMap<>();
        private Map<Integer, Float> columnWidthMap = new HashMap<>();

        public int getRowCount() {
            return rowCount;
        }

        public void setRowCount(int rowCount) {
            this.rowCount = rowCount;
        }

        public int getColumnCount() {
            return columnCount;
        }

        public void setColumnCount(int columnCount) {
            this.columnCount = columnCount;
        }

        public Map<Integer, Integer> getRowHeightMap() {
            return rowHeightMap;
        }

        public void setRowHeightMap(Map<Integer, Integer> rowHeightMap) {
            this.rowHeightMap = rowHeightMap;
        }

        public Map<Integer, Float> getColumnWidthMap() {
            return columnWidthMap;
        }

        public void setColumnWidthMap(Map<Integer, Float> columnWidthMap) {
            this.columnWidthMap = columnWidthMap;
        }
    }
}
