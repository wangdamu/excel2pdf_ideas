package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

class zbee
{
  private static final com.aspose.cells.b.c.a.za b = new com.aspose.cells.b.c.a.za(new String[] { "Title", "Subject", "Author", "Keywords", "Comments", "Last Author", "Revision Number", "Application Name", "Total Editing Time", "Last Print Date", "Number of Pages", "Number of Words", "Number of Characters", "Category", "Format", "Manager", "Company", "HyperlinkBase", "Number of Bytes", "Number of Lines", "Number of Paragraphs" });
  
  private static void a(WorksheetCollection paramWorksheetCollection, HashMap paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      long l = ((Long)localIterator.next()).longValue();
      int i = ((Integer)paramHashMap.get(Long.valueOf(l))).intValue();
      int j = Cell.a(l);
      int k = Cell.b(l);
      int m = Cell.c(l);
      paramWorksheetCollection.get(j).getCells().get(k, m).b(i);
    }
  }
  
  private static void b(WorksheetCollection paramWorksheetCollection, HashMap paramHashMap)
  {
    for (int i = 0; i < paramWorksheetCollection.getCount(); i++)
    {
      Cells localCells = paramWorksheetCollection.get(i).getCells();
      ArrayList localArrayList = localCells.getMergedCells();
      for (int j = 0; j < localArrayList.size(); j++)
      {
        CellArea localCellArea = (CellArea)localArrayList.get(j);
        int k = localCells.d(localCellArea.StartRow, localCellArea.StartColumn);
        if (k == -1) {
          k = 15;
        }
        int m = k;
        int n = k;
        if ((localCellArea.StartRow != localCellArea.EndRow) || (localCellArea.StartColumn != localCellArea.EndColumn))
        {
          m = localCells.d(localCellArea.EndRow, localCellArea.EndColumn);
          if (m == -1) {
            m = 15;
          }
        }
        if (k == m)
        {
          n = m;
        }
        else
        {
          Style localStyle1 = paramWorksheetCollection.e(k);
          Style localStyle2 = paramWorksheetCollection.e(m);
          if (localStyle1.f()) {
            if (localStyle2.f())
            {
              Style localStyle3 = new Style(paramWorksheetCollection);
              localStyle3.copy(localStyle1);
              localStyle3.getBorders().getByBorderType(2).a(localStyle2.getBorders().getByBorderType(2));
              localStyle3.getBorders().getByBorderType(8).a(localStyle2.getBorders().getByBorderType(8));
              n = paramWorksheetCollection.a(localStyle3);
            }
            else
            {
              n = k;
            }
          }
        }
        if (n != k)
        {
          long l = Cell.a(i, localCellArea.StartRow, localCellArea.StartColumn);
          paramHashMap.put(Long.valueOf(l), Integer.valueOf(k));
          localCells.a(localCellArea.StartRow, localCellArea.StartColumn, false).b(n);
        }
      }
    }
  }
  
  static void a(Workbook paramWorkbook, zm paramzm, SaveOptions paramSaveOptions)
    throws Exception
  {
    WorksheetCollection localWorksheetCollection = paramWorkbook.getWorksheets();
    zug.b(localWorksheetCollection);
    HashMap localHashMap = new HashMap();
    b(localWorksheetCollection, localHashMap);
    localWorksheetCollection.a(paramSaveOptions);
    zcjz localzcjz = new zcjz(paramzm, Encoding.getUTF8());
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = false;
    if ((paramSaveOptions != null) && ((paramSaveOptions instanceof SpreadsheetML2003SaveOptions)))
    {
      bool1 = ((SpreadsheetML2003SaveOptions)paramSaveOptions).isIndentedFormatting();
      bool2 = ((SpreadsheetML2003SaveOptions)paramSaveOptions).getLimitAsXls();
      bool3 = ((SpreadsheetML2003SaveOptions)paramSaveOptions).getExportColumnIndexOfCell();
    }
    if (bool1) {
      localzcjz.a(1);
    }
    localzcjz.c();
    localzcjz.d("<?mso-application progid=\"Excel.Sheet\"?>");
    localzcjz.b("Workbook");
    localzcjz.a("xmlns", "o", null, "urn:schemas-microsoft-com:office:office");
    localzcjz.a("xmlns", "x", null, "urn:schemas-microsoft-com:office:excel");
    localzcjz.a("xmlns", "ss", null, "urn:schemas-microsoft-com:office:spreadsheet");
    localzcjz.a(null, "xmlns", null, "urn:schemas-microsoft-com:office:spreadsheet");
    localzcjz.a("xmlns", "x2", null, "urn:schemas-microsoft-com:office:excel2");
    localzcjz.a("xmlns", "html", null, "http://www.w3.org/TR/REC-html40");
    localzcjz.a("xmlns", "dt", null, "uuid:C2F41010-65B3-11d1-A29F-00AA00C14882");
    a(localzcjz, paramWorkbook);
    Cells localCells = null;
    try
    {
      Iterator localIterator = paramWorkbook.getWorksheets().iterator();
      while (localIterator.hasNext())
      {
        Worksheet localWorksheet = (Worksheet)localIterator.next();
        localCells = localWorksheet.getCells();
        localCells.c = new zlt(localCells, 16383);
        localCells.b = new zlx(localCells, 16383);
        a(localzcjz, localWorksheet, bool1, bool2, bool3);
        if (paramSaveOptions.getClearData()) {
          localWorksheet.getCells().clear();
        }
        localCells.l();
        localCells.k();
        localCells = null;
      }
    }
    finally
    {
      if (localCells != null)
      {
        localCells.l();
        localCells.k();
      }
    }
    localzcjz.b();
    localzcjz.d();
    localzcjz.e();
    a(localWorksheetCollection, localHashMap);
  }
  
  private static void a(zcjz paramzcjz, Workbook paramWorkbook)
    throws Exception
  {
    paramzcjz.c("x:ExcelWorkbook", null);
    paramzcjz.b("x:ActiveSheet", null, zcjj.a(paramWorkbook.getWorksheets().getActiveSheetIndex()));
    if (!paramWorkbook.getSettings().getShowTabs()) {
      paramzcjz.b("x:HideWorkbookTabs", null, null);
    }
    if (!paramWorkbook.getSettings().isHScrollBarVisible()) {
      paramzcjz.b("x:HideHorizontalScrollBar", null, null);
    }
    if (!paramWorkbook.getSettings().isVScrollBarVisible()) {
      paramzcjz.b("x:HideVerticalScrollBar", null, null);
    }
    switch (paramWorkbook.getSettings().getCalcMode())
    {
    case 1: 
      paramzcjz.b("x:Calculation", null, "SemiAutomaticCalculation");
      break;
    case 2: 
      paramzcjz.b("x:Calculation", null, "ManualCalculation");
    }
    if (!paramWorkbook.getSettings().getRecalculateBeforeSave()) {
      paramzcjz.b("x:DoNotCalculateBeforeSave", null, null);
    }
    paramzcjz.b();
    Object localObject2;
    String str1;
    if (paramWorkbook.getWorksheets().getBuiltInDocumentProperties().getCount() != 0)
    {
      paramzcjz.c("o:DocumentProperties", null);
      Iterator localIterator = paramWorkbook.getWorksheets().getBuiltInDocumentProperties().iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (DocumentProperty)localIterator.next();
        localObject2 = null;
        switch (b.a(((DocumentProperty)localObject1).getName()))
        {
        case 0: 
          localObject2 = "Title";
          break;
        case 1: 
          localObject2 = "Subject";
          break;
        case 2: 
          localObject2 = "Author";
          break;
        case 3: 
          localObject2 = "Keywords";
          break;
        case 4: 
          localObject2 = "Description";
          break;
        case 5: 
          localObject2 = "LastAuthor";
          break;
        case 6: 
          localObject2 = "Revision";
          break;
        case 7: 
          localObject2 = "AppName";
          break;
        case 8: 
          localObject2 = "TotalTime";
          break;
        case 9: 
          localObject2 = "LastPrinted";
          break;
        case 10: 
          localObject2 = "Pages";
          break;
        case 11: 
          localObject2 = "Words";
          break;
        case 12: 
          localObject2 = "Characters";
          break;
        case 13: 
          localObject2 = "Category";
          break;
        case 14: 
          localObject2 = "PresentationFormat";
          break;
        case 15: 
          localObject2 = "Manager";
          break;
        case 16: 
          localObject2 = "Company";
          break;
        case 17: 
          localObject2 = "HyperlinkBase";
          break;
        case 18: 
          localObject2 = "Bytes";
          break;
        case 19: 
          localObject2 = "Lines";
          break;
        case 20: 
          localObject2 = "Paragraphs";
          break;
        default: 
          localObject2 = null;
        }
        if ((localObject2 != null) && (((DocumentProperty)localObject1).getValue() != null))
        {
          str1 = zs.a(((DocumentProperty)localObject1).getValue());
          if (!"".equals(str1)) {
            paramzcjz.b("o:" + (String)localObject2, null, zs.a(((DocumentProperty)localObject1).getValue()));
          }
        }
      }
      paramzcjz.b();
      if (paramWorkbook.getWorksheets().getCustomDocumentProperties().getCount() != 0)
      {
        paramzcjz.c(true);
        paramzcjz.c("o:CustomDocumentProperties", null);
        localIterator = paramWorkbook.getWorksheets().getCustomDocumentProperties().iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (DocumentProperty)localIterator.next();
          if ((((DocumentProperty)localObject1).getType() != 5) && (!zy.a(((DocumentProperty)localObject1).getName(), "_PID_LINKBASE")) && (!((DocumentProperty)localObject1).c()))
          {
            localObject2 = ((DocumentProperty)localObject1).getName();
            paramzcjz.a("o", (String)localObject2, true);
            if (((DocumentProperty)localObject1).isLinkedToContent()) {
              paramzcjz.a("link", ((DocumentProperty)localObject1).getSource());
            }
            str1 = null;
            String str2 = null;
            switch (((DocumentProperty)localObject1).getType())
            {
            case 0: 
              str1 = "boolean";
              break;
            case 1: 
              str1 = "dateTime.tz";
              str2 = ((DateTime)((DocumentProperty)localObject1).getValue()).toUniversalTime().a("yyyy-MM-dd\\THH:mm:ss.fff", com.aspose.cells.b.a.c.za.b());
              break;
            case 3: 
              str1 = "float";
              str2 = zauj.z(((DocumentProperty)localObject1).toInt());
              break;
            case 2: 
              str1 = "float";
              str2 = zauj.b(((DocumentProperty)localObject1).toDouble());
            }
            if (str1 != null) {
              paramzcjz.a("dt:dt", null, str1);
            }
            if (str2 == null) {
              str2 = zs.a(((DocumentProperty)localObject1).getValue());
            }
            paramzcjz.a(str2);
            paramzcjz.a(true);
          }
        }
        paramzcjz.b();
        paramzcjz.c(false);
      }
    }
    b(paramzcjz, paramWorkbook);
    int i = 0;
    Object localObject1 = paramWorkbook.getWorksheets().getNames().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Name)((Iterator)localObject1).next();
      if ((((Name)localObject2).getRefersTo() != null) && (((Name)localObject2).getRefersTo().length() != 0) && (((Name)localObject2).getSheetIndex() == 0))
      {
        if (i == 0)
        {
          paramzcjz.c("ss:Names", null);
          i = 1;
        }
        paramzcjz.c("ss:NamedRange", null);
        paramzcjz.a("ss:Name", null, ((Name)localObject2).getText());
        if (((Name)localObject2).n()) {
          paramzcjz.a("ss:Hidden", null, "1");
        }
        try
        {
          str1 = ((Name)localObject2).getR1C1RefersTo();
          paramzcjz.a("ss:RefersTo", null, str1);
        }
        catch (Exception localException)
        {
          throw new CellsException(6, ((Name)localObject2).getText() + ((Name)localObject2).getRefersTo());
        }
        paramzcjz.b();
      }
    }
    if (i != 0) {
      paramzcjz.b();
    }
    a(paramWorkbook, paramzcjz);
  }
  
  private static void b(zcjz paramzcjz, Workbook paramWorkbook)
    throws Exception
  {
    int i = 0;
    for (int j = 8; j < 64; j++) {
      if (((Integer)paramWorkbook.getWorksheets().o().b().d(Integer.valueOf(j))).intValue() != zbek.c[(j - 8)])
      {
        i = 1;
        break;
      }
    }
    if (i == 0) {
      return;
    }
    paramzcjz.b("o:OfficeDocumentSettings");
    paramzcjz.b("o:Colors");
    for (j = 8; j < 64; j++) {
      if (((Integer)paramWorkbook.getWorksheets().o().b().d(Integer.valueOf(j))).intValue() != zbek.c[(j - 8)])
      {
        Color localColor = paramWorkbook.getWorksheets().o().e(j);
        int k = localColor.toArgb();
        String str = "#" + com.aspose.cells.a.c.zp.d(k).substring(2);
        paramzcjz.b("o:Color");
        paramzcjz.b("o:Index");
        paramzcjz.a(com.aspose.cells.b.a.zp.a(j - 8));
        paramzcjz.b();
        paramzcjz.b("o:RGB");
        paramzcjz.a(str);
        paramzcjz.b();
        paramzcjz.b();
      }
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, Worksheet paramWorksheet, Workbook paramWorkbook)
    throws Exception
  {
    paramzcjz.c("ss:Names", null);
    Iterator localIterator = paramWorkbook.getWorksheets().getNames().iterator();
    while (localIterator.hasNext())
    {
      Name localName = (Name)localIterator.next();
      if ((localName.getRefersTo() != null) && ((localName.getRefersTo().length() != 0) || (localName.b() == null)) && (localName.getSheetIndex() == paramWorksheet.getIndex() + 1))
      {
        paramzcjz.c("ss:NamedRange", null);
        paramzcjz.a("ss:Name", null, localName.getText());
        if (localName.n()) {
          paramzcjz.a("ss:Hidden", null, "1");
        }
        String str = paramWorkbook.getWorksheets().e().a(-1, -1, localName.b(), 0, 0, true);
        paramzcjz.a("ss:RefersTo", null, str);
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, Worksheet paramWorksheet, Workbook paramWorkbook)
    throws Exception
  {
    HorizontalPageBreakCollection localHorizontalPageBreakCollection = paramWorksheet.getHorizontalPageBreaks();
    VerticalPageBreakCollection localVerticalPageBreakCollection = paramWorksheet.getVerticalPageBreaks();
    if ((localHorizontalPageBreakCollection.getCount() != 0) || (localVerticalPageBreakCollection.getCount() != 0))
    {
      paramzcjz.c("x:PageBreaks", null);
      Iterator localIterator;
      Object localObject;
      int i;
      if (localHorizontalPageBreakCollection.getCount() != 0)
      {
        paramzcjz.c("x:RowBreaks", null);
        localIterator = localHorizontalPageBreakCollection.iterator();
        while (localIterator.hasNext())
        {
          localObject = (HorizontalPageBreak)localIterator.next();
          paramzcjz.c("x:RowBreak", null);
          paramzcjz.c("x:Row", null);
          paramzcjz.a(zauj.z(((HorizontalPageBreak)localObject).getRow()));
          paramzcjz.b();
          if (((HorizontalPageBreak)localObject).getStartColumn() != 1)
          {
            paramzcjz.c("x:ColStart", null);
            paramzcjz.a(zauj.z(((HorizontalPageBreak)localObject).getStartColumn()));
            paramzcjz.b();
          }
          i = ((HorizontalPageBreak)localObject).getEndColumn() > 255 ? 255 : ((HorizontalPageBreak)localObject).getEndColumn();
          if (i != 255)
          {
            paramzcjz.c("x:ColEnd", null);
            paramzcjz.a(zauj.z(i));
            paramzcjz.b();
          }
          paramzcjz.b();
        }
        paramzcjz.b();
      }
      if (localVerticalPageBreakCollection.getCount() != 0)
      {
        paramzcjz.c("x:ColBreaks", null);
        localIterator = localVerticalPageBreakCollection.iterator();
        while (localIterator.hasNext())
        {
          localObject = (VerticalPageBreak)localIterator.next();
          paramzcjz.c("x:ColBreak", null);
          paramzcjz.c("x:Column", null);
          paramzcjz.a(zauj.z(((VerticalPageBreak)localObject).getColumn()));
          paramzcjz.b();
          if (((VerticalPageBreak)localObject).getStartRow() != 1)
          {
            paramzcjz.c("x:RowStart", null);
            paramzcjz.a(zauj.z(((VerticalPageBreak)localObject).getStartRow()));
            paramzcjz.b();
          }
          i = ((VerticalPageBreak)localObject).getEndRow() > 65535 ? 65535 : ((VerticalPageBreak)localObject).getEndRow();
          if (i != 65535)
          {
            paramzcjz.c("x:RowEnd", null);
            paramzcjz.a(zauj.z(i));
            paramzcjz.b();
          }
          paramzcjz.b();
        }
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void c(zcjz paramzcjz, Worksheet paramWorksheet, Workbook paramWorkbook)
    throws Exception
  {
    for (int i = 0; i < paramWorksheet.getValidations().getCount(); i++)
    {
      Validation localValidation = paramWorksheet.getValidations().get(i);
      String[] arrayOfString = zauw.a(localValidation, paramWorksheet);
      StringBuilder localStringBuilder = new StringBuilder();
      paramzcjz.c("DataValidation", null);
      CellArea localCellArea1 = new CellArea();
      if (localValidation.getAreaList().size() > 0) {
        localCellArea1 = (CellArea)localValidation.getAreaList().get(0);
      }
      paramzcjz.c("Range", null);
      for (int j = 0; j < localValidation.getAreaList().size(); j++)
      {
        if (j != 0) {
          localStringBuilder.append(',');
        }
        CellArea localCellArea2 = (CellArea)localValidation.getAreaList().get(j);
        localStringBuilder.append('R');
        localStringBuilder.append(localCellArea2.StartRow + 1);
        localStringBuilder.append('C');
        localStringBuilder.append(localCellArea2.StartColumn + 1);
        if ((localCellArea2.StartRow != localCellArea2.EndRow) || (localCellArea2.StartColumn != localCellArea2.EndColumn))
        {
          localStringBuilder.append(':');
          localStringBuilder.append('R');
          localStringBuilder.append(localCellArea2.EndRow + 1);
          localStringBuilder.append('C');
          localStringBuilder.append(localCellArea2.EndColumn + 1);
        }
      }
      paramzcjz.a(zs.a(localStringBuilder));
      paramzcjz.b();
      if (localValidation.getType() != 0)
      {
        paramzcjz.c("Type", null);
        switch (localValidation.getType())
        {
        case 7: 
          paramzcjz.a("InnerCustom");
          break;
        case 4: 
          paramzcjz.a("Date");
          break;
        case 2: 
          paramzcjz.a("Decimal");
          break;
        case 3: 
          paramzcjz.a("List");
          break;
        case 6: 
          paramzcjz.a("TextLength");
          break;
        case 5: 
          paramzcjz.a("Time");
          break;
        case 1: 
          paramzcjz.a("Whole");
          break;
        case 0: 
          paramzcjz.a("AnyValue");
        }
        paramzcjz.b();
      }
      String str;
      if (localValidation.getType() == 3)
      {
        if ((arrayOfString[0] != null) && (arrayOfString[0].endsWith("\"")) && ((arrayOfString[0].startsWith("\"")) || (arrayOfString[0].startsWith("=\""))))
        {
          paramzcjz.b("CellRangeList");
          paramzcjz.b();
        }
        if (arrayOfString[0] != null)
        {
          paramzcjz.c("Value", null);
          str = arrayOfString[0];
          if (str.charAt(0) == '=') {
            str = str.substring(1);
          }
          if ((str.charAt(0) == '"') && (str.charAt(str.length() - 1) == '"')) {
            str = str.replace('\000', ',');
          }
          paramzcjz.a(str);
          paramzcjz.b();
        }
      }
      else
      {
        if (localValidation.getOperator() != 6)
        {
          paramzcjz.c("Qualifier", null);
          switch (localValidation.getOperator())
          {
          case 0: 
            paramzcjz.a("Between");
            break;
          case 7: 
            paramzcjz.a("NotBetween");
            break;
          case 1: 
            paramzcjz.a("Equal");
            break;
          case 8: 
            paramzcjz.a("NotEqual");
            break;
          case 2: 
            paramzcjz.a("Greater");
            break;
          case 4: 
            paramzcjz.a("Less");
            break;
          case 3: 
            paramzcjz.a("GreaterOrEqual");
            break;
          case 5: 
            paramzcjz.a("LessOrEqual");
            break;
          }
          paramzcjz.b();
        }
        if (((localValidation.getOperator() == 0) || (localValidation.getOperator() == 7)) && (arrayOfString[0] != null))
        {
          paramzcjz.c("Min", null);
          str = arrayOfString[0];
          if (str.charAt(0) == '=') {
            str = str.substring(1);
          }
          paramzcjz.a(str);
          paramzcjz.b();
        }
        if (((localValidation.getOperator() == 0) || (localValidation.getOperator() == 7)) && (localValidation.getFormula2() != null))
        {
          paramzcjz.c("Max", null);
          str = arrayOfString[1];
          if (str.charAt(0) == '=') {
            str = str.substring(1);
          }
          paramzcjz.a(str);
          paramzcjz.b();
        }
        if ((localValidation.getOperator() != 0) && (localValidation.getOperator() != 7) && (arrayOfString[0] != null))
        {
          paramzcjz.c("Value", null);
          str = arrayOfString[0];
          if (str.charAt(0) == '=') {
            str = str.substring(1);
          }
          paramzcjz.a(str);
          paramzcjz.b();
        }
      }
      if (!localValidation.getIgnoreBlank())
      {
        paramzcjz.c("UseBlank", null);
        paramzcjz.b();
      }
      if (!localValidation.getInCellDropDown())
      {
        paramzcjz.c("ComboHide", null);
        paramzcjz.b();
      }
      if (localValidation.c() != 0)
      {
        paramzcjz.c("IMEMode", null);
        switch (localValidation.c())
        {
        case 1: 
          paramzcjz.a("1");
          break;
        case 2: 
          paramzcjz.a("2");
          break;
        }
        paramzcjz.b();
      }
      if (!localValidation.getShowInput())
      {
        paramzcjz.c("InputHide", null);
        paramzcjz.b();
      }
      if (!zauw.b(localValidation.getInputTitle()))
      {
        paramzcjz.c("InputTitle", null);
        paramzcjz.a(localValidation.getInputTitle());
        paramzcjz.b();
      }
      if (!zauw.b(localValidation.getInputMessage()))
      {
        paramzcjz.c("InputMessage", null);
        paramzcjz.a(localValidation.getInputMessage());
        paramzcjz.b();
      }
      if (!localValidation.getShowError())
      {
        paramzcjz.c("ErrorHide", null);
        paramzcjz.b();
      }
      if (localValidation.getAlertStyle() != 1)
      {
        paramzcjz.c("ErrorStyle", null);
        switch (localValidation.getAlertStyle())
        {
        case 0: 
          paramzcjz.a("Info");
          break;
        case 2: 
          paramzcjz.a("Warn");
        }
        paramzcjz.b();
      }
      if (!zauw.b(localValidation.getErrorMessage()))
      {
        paramzcjz.c("ErrorMessage", null);
        paramzcjz.a(localValidation.getErrorMessage());
        paramzcjz.b();
      }
      if (!zauw.b(localValidation.getErrorTitle()))
      {
        paramzcjz.c("ErrorTitle", null);
        paramzcjz.a(localValidation.getErrorTitle());
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void d(zcjz paramzcjz, Worksheet paramWorksheet, Workbook paramWorkbook)
    throws Exception
  {
    paramzcjz.c("WorksheetOptions", null);
    paramzcjz.a("xmlns", null, null, "urn:schemas-microsoft-com:office:excel");
    if (!paramWorksheet.isVisible())
    {
      paramzcjz.c("Visible", null);
      paramzcjz.a("SheetHidden");
      paramzcjz.b();
    }
    if (!paramWorksheet.isRowColumnHeadersVisible())
    {
      paramzcjz.c("DoNotDisplayHeadings", null);
      paramzcjz.b();
    }
    if (paramWorksheet.getZoom() != 100)
    {
      paramzcjz.c("Zoom", null);
      paramzcjz.a(zauj.z(paramWorksheet.getZoom()));
      paramzcjz.b();
    }
    PageSetup localPageSetup = paramWorksheet.getPageSetup();
    paramzcjz.c("PageSetup", null);
    if ((localPageSetup.getOrientation() != 1) || (localPageSetup.getCenterHorizontally()) || (localPageSetup.getCenterVertically()) || (!localPageSetup.isAutoFirstPageNumber()))
    {
      paramzcjz.c("Layout", null);
      if (localPageSetup.getOrientation() != 1) {
        paramzcjz.a("x:Orientation", null, "Landscape");
      }
      if (localPageSetup.getCenterHorizontally()) {
        paramzcjz.a("x:CenterHorizontal", null, "1");
      }
      if (localPageSetup.getCenterVertically()) {
        paramzcjz.a("x:CenterVertical", null, "1");
      }
      if (!localPageSetup.isAutoFirstPageNumber()) {
        paramzcjz.a("x:StartPageNumber", null, zauj.z(localPageSetup.getFirstPageNumber()));
      }
      paramzcjz.b();
    }
    String str1 = localPageSetup.a(true, 1);
    if ((localPageSetup.getHeaderMargin() != 1.27D) || ((str1 != null) && (str1.length() > 0)))
    {
      paramzcjz.c("Header", null);
      if (localPageSetup.getHeaderMargin() != 1.27D) {
        paramzcjz.a("x:Margin", null, zauj.b(localPageSetup.getHeaderMargin() / 2.54D));
      }
      if ((str1 != null) && (str1.length() > 0)) {
        paramzcjz.a("x:Data", null, str1);
      }
      paramzcjz.b();
    }
    String str2 = localPageSetup.a(false, 1);
    if ((localPageSetup.getFooterMargin() != 1.27D) || ((str2 != null) && (str2.length() > 0)))
    {
      paramzcjz.c("Footer", null);
      if (localPageSetup.getFooterMargin() != 1.27D) {
        paramzcjz.a("x:Margin", null, zauj.b(localPageSetup.getFooterMargin() / 2.54D));
      }
      if ((str2 != null) && (str2.length() > 0)) {
        paramzcjz.a("x:Data", null, str2);
      }
      paramzcjz.b();
    }
    if ((localPageSetup.getTopMargin() != 2.54D) || (localPageSetup.getBottomMargin() != 2.54D) || (localPageSetup.getLeftMargin() != 1.905D) || (localPageSetup.getRightMargin() != 1.905D))
    {
      paramzcjz.c("PageMargins", null);
      if (localPageSetup.getTopMargin() != 2.54D) {
        paramzcjz.a("x:Top", null, zauj.b(localPageSetup.getTopMargin() / 2.54D));
      }
      if (localPageSetup.getBottomMargin() != 2.54D) {
        paramzcjz.a("x:Bottom", null, zauj.b(localPageSetup.getBottomMargin() / 2.54D));
      }
      if (localPageSetup.getLeftMargin() != 1.905D) {
        paramzcjz.a("x:Left", null, zauj.b(localPageSetup.getLeftMargin() / 2.54D));
      }
      if (localPageSetup.getRightMargin() != 1.905D) {
        paramzcjz.a("x:Right", null, zauj.b(localPageSetup.getRightMargin() / 2.54D));
      }
      paramzcjz.b();
    }
    paramzcjz.b();
    if (!localPageSetup.isPercentScale())
    {
      paramzcjz.c("FitToPage", null);
      paramzcjz.b();
    }
    paramzcjz.c("Print", null);
    if (localPageSetup.e()) {
      paramzcjz.b("ValidPrinterInfo", null);
    }
    if (localPageSetup.getFitToPagesWide() != 1)
    {
      paramzcjz.c("FitWidth", null);
      paramzcjz.a(zauj.z(localPageSetup.getFitToPagesWide()));
      paramzcjz.b();
    }
    if (localPageSetup.getFitToPagesTall() != 1)
    {
      paramzcjz.c("FitHeight", null);
      paramzcjz.a(zauj.z(localPageSetup.getFitToPagesTall()));
      paramzcjz.b();
    }
    if (localPageSetup.getOrder() == 1)
    {
      paramzcjz.c("LeftToRight", null);
      paramzcjz.b();
    }
    if (localPageSetup.getBlackAndWhite())
    {
      paramzcjz.c("BlackAndWhite", null);
      paramzcjz.b();
    }
    if (localPageSetup.getPrintDraft())
    {
      paramzcjz.c("DraftQuality", null);
      paramzcjz.b();
    }
    if (localPageSetup.getPrintComments() != 1)
    {
      paramzcjz.c("CommentsLayout", null);
      if (localPageSetup.getPrintComments() == 2) {
        paramzcjz.a("SheetEnd");
      } else if (localPageSetup.getPrintComments() == 0) {
        paramzcjz.a("InPlace");
      }
      paramzcjz.b();
    }
    if (localPageSetup.getPrintErrors() != 2)
    {
      paramzcjz.c("PrintErrors", null);
      switch (localPageSetup.getPrintErrors())
      {
      case 0: 
        paramzcjz.a("Blank");
        break;
      case 1: 
        paramzcjz.a("Dash");
        break;
      case 3: 
        paramzcjz.a("NA");
      }
      paramzcjz.b();
    }
    if (localPageSetup.getZoom() != 100)
    {
      paramzcjz.c("Scale", null);
      paramzcjz.a(zauj.z(localPageSetup.getZoom()));
      paramzcjz.b();
    }
    paramzcjz.c("PaperSizeIndex", null);
    switch (localPageSetup.a())
    {
    case 1: 
      paramzcjz.a("119");
      break;
    default: 
      paramzcjz.a(zauj.z(localPageSetup.a()));
    }
    paramzcjz.b();
    int i = localPageSetup.getPrintQuality();
    if (i != 300)
    {
      if (i < 0) {
        i = 600;
      }
      paramzcjz.c("HorizontalResolution", null);
      paramzcjz.a(zauj.z(i));
      paramzcjz.b();
      paramzcjz.c("VerticalResolution", null);
      paramzcjz.a(zauj.z(i));
      paramzcjz.b();
    }
    if (localPageSetup.getPrintGridlines())
    {
      paramzcjz.c("Gridlines", null);
      paramzcjz.b();
    }
    if (localPageSetup.getPrintHeadings())
    {
      paramzcjz.c("RowColHeadings", null);
      paramzcjz.b();
    }
    paramzcjz.b();
    if (!paramWorksheet.isGridlinesVisible())
    {
      paramzcjz.c("DoNotDisplayGridlines", null);
      paramzcjz.b();
    }
    if (!paramWorksheet.getDisplayZeros())
    {
      paramzcjz.c("DoNotDisplayZeros", null);
      paramzcjz.b();
    }
    if ((paramWorksheet.z() != -1) && (paramWorksheet.z() < 64))
    {
      paramzcjz.c("TabColorIndex", null);
      paramzcjz.a(zauj.z(paramWorksheet.z()));
      paramzcjz.b();
    }
    a(paramzcjz, paramWorksheet);
    if (paramWorksheet.isProtected())
    {
      if (!paramWorksheet.getProtection().getAllowEditingObject()) {
        paramzcjz.d("<ProtectObjects>False</ProtectObjects>");
      }
      if (!paramWorksheet.getProtection().getAllowEditingScenario()) {
        paramzcjz.d("<ProtectScenarios>False</ProtectScenarios>");
      }
      if (paramWorksheet.getProtection().getAllowFiltering()) {
        paramzcjz.d("<AllowFilter/>");
      }
      if (paramWorksheet.getProtection().getAllowSorting()) {
        paramzcjz.d("<AllowSort/>");
      }
      if (paramWorksheet.getProtection().getAllowFormattingColumn()) {
        paramzcjz.d("<AllowSizeCols/>");
      }
      if (paramWorksheet.getProtection().getAllowFormattingRow()) {
        paramzcjz.d("<AllowSizeRows/>");
      }
      if (paramWorksheet.getProtection().getAllowDeletingRow()) {
        paramzcjz.d("<AllowDeleteRows/>");
      }
      if (paramWorksheet.getProtection().getAllowFormattingCell()) {
        paramzcjz.d("<AllowFormatCells/>");
      }
      if (paramWorksheet.getProtection().getAllowDeletingColumn()) {
        paramzcjz.d("<AllowDeleteCols/>");
      }
      if (paramWorksheet.getProtection().getAllowInsertingColumn()) {
        paramzcjz.d("<AllowInsertCols/>");
      }
      if (paramWorksheet.getProtection().getAllowInsertingRow()) {
        paramzcjz.d("<AllowInsertRows/>");
      }
      if (paramWorksheet.getProtection().getAllowInsertingHyperlink()) {
        paramzcjz.d("<AllowInsertHyperlinks/>");
      }
      if (paramWorksheet.getProtection().getAllowUsingPivotTable()) {
        paramzcjz.d("<AllowUsePivotTables/>");
      }
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, Worksheet paramWorksheet)
    throws Exception
  {
    if (paramWorksheet.getFirstVisibleRow() != 0) {
      paramzcjz.b("TopRowVisible", zauj.z(paramWorksheet.getFirstVisibleRow()));
    }
    if (paramWorksheet.getFirstVisibleColumn() != 0) {
      paramzcjz.b("LeftColumnVisible", zauj.z(paramWorksheet.getFirstVisibleColumn()));
    }
    if (paramWorksheet.getPanes() != null)
    {
      PaneCollection localPaneCollection = paramWorksheet.b();
      int j = paramWorksheet.i() ? 0 : 1;
      if (j == 0)
      {
        paramzcjz.b("FreezePanes", null);
        paramzcjz.b("FrozenNoSplit", null);
      }
      if (localPaneCollection.d() != 0.0D)
      {
        paramzcjz.b("SplitHorizontal", zauj.z(localPaneCollection.d()));
        paramzcjz.b("TopRowBottomPane", zauj.z(localPaneCollection.b()));
      }
      if (localPaneCollection.e() != 0.0D)
      {
        paramzcjz.b("SplitVertical", zauj.z(localPaneCollection.e()));
        paramzcjz.b("LeftColumnRightPane", zauj.z(localPaneCollection.c()));
      }
      paramzcjz.b("ActivePane", zauj.a(localPaneCollection.a()));
    }
    if ((paramWorksheet.t() != null) && (paramWorksheet.t().size() != 0))
    {
      paramzcjz.b("Panes");
      for (int i = 0; i < paramWorksheet.t().size(); i++)
      {
        zbev localzbev = (zbev)paramWorksheet.t().get(i);
        paramzcjz.b("Pane");
        paramzcjz.b("Number", zauj.a(localzbev.a()));
        if (localzbev.c() != 0) {
          paramzcjz.b("ActiveRow", zauj.z(localzbev.c()));
        }
        if (localzbev.d() != 0) {
          paramzcjz.b("ActiveCol", zauj.z(localzbev.d()));
        }
        String str = zauj.a(localzbev.b(), 0, localzbev.b().size());
        paramzcjz.b("RangeSelection", str);
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static zbec a(Cells paramCells, int paramInt1, int paramInt2, Cell paramCell, ArrayList paramArrayList, int paramInt3)
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramInt3 < paramArrayList.size())
    {
      localObject3 = (zgr)paramArrayList.get(paramInt3);
      if ((((zgr)localObject3).a == paramInt1) && (((zgr)localObject3).b == paramInt2)) {
        bool = true;
      }
    }
    Object localObject3 = paramCells.g().getHyperlinks();
    for (int i = 0; i < ((HyperlinkCollection)localObject3).getCount(); i++)
    {
      Hyperlink localHyperlink = paramCells.g().getHyperlinks().get(i);
      if ((localHyperlink.getArea().StartColumn <= paramInt2) && (paramInt2 <= localHyperlink.getArea().EndColumn) && (localHyperlink.getArea().StartRow <= paramInt1) && (paramInt1 <= localHyperlink.getArea().EndRow))
      {
        localObject1 = localHyperlink;
        break;
      }
    }
    CommentCollection localCommentCollection = paramCells.g().getComments();
    for (int j = 0; j < localCommentCollection.getCount(); j++)
    {
      Comment localComment = localCommentCollection.get(j);
      if ((localComment.getRow() == paramInt1) && (localComment.getColumn() == paramInt2))
      {
        localObject2 = localComment;
        break;
      }
    }
    if ((bool) || (paramCell != null) || (localObject1 != null) || (localObject2 != null))
    {
      zbec localzbec = new zbec();
      localzbec.d = bool;
      if (bool) {
        localzbec.a = ((zgr)paramArrayList.get(paramInt3));
      }
      localzbec.c = paramCell;
      localzbec.b = ((Hyperlink)localObject1);
      localzbec.e = ((Comment)localObject2);
      return localzbec;
    }
    return null;
  }
  
  private static boolean a(Worksheet paramWorksheet, int paramInt1, ArrayList paramArrayList, int paramInt2)
  {
    for (int i = paramInt2; i < paramArrayList.size(); i++)
    {
      zgr localzgr = (zgr)paramArrayList.get(paramInt2);
      if (localzgr.a == paramInt1) {
        return true;
      }
      if (localzgr.a > paramInt1) {
        break;
      }
    }
    HyperlinkCollection localHyperlinkCollection = paramWorksheet.getHyperlinks();
    for (int j = 0; j < localHyperlinkCollection.getCount(); j++)
    {
      Hyperlink localHyperlink = localHyperlinkCollection.get(j);
      if ((localHyperlink.getArea().StartRow <= paramInt1) && (localHyperlink.getArea().EndRow >= paramInt1)) {
        return true;
      }
    }
    CommentCollection localCommentCollection = paramWorksheet.getComments();
    for (int k = 0; k < localCommentCollection.getCount(); k++)
    {
      Comment localComment = localCommentCollection.get(k);
      if (localComment.getRow() == paramInt1) {
        return true;
      }
    }
    return false;
  }
  
  private static void a(Worksheet paramWorksheet, ArrayList paramArrayList, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    paramArrayOfInt1[0] = -1;
    if (paramWorksheet.getCells().getRows().getCount() > 0) {
      paramArrayOfInt1[0] = paramWorksheet.getCells().getRows().getRowByIndex(paramWorksheet.getCells().getRows().getCount() - 1).getIndex();
    }
    paramArrayOfInt2[0] = paramWorksheet.getCells().b(0);
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      zgr localzgr = (zgr)paramArrayList.get(i);
      if (paramBoolean1)
      {
        if (localzgr.c > paramArrayOfInt1[0]) {
          paramArrayOfInt1[0] = localzgr.c;
        }
        if (localzgr.d > paramArrayOfInt2[0]) {
          paramArrayOfInt2[0] = localzgr.d;
        }
      }
      else
      {
        if (localzgr.a > paramArrayOfInt1[0]) {
          paramArrayOfInt1[0] = localzgr.a;
        }
        if (localzgr.b > paramArrayOfInt2[0]) {
          paramArrayOfInt2[0] = localzgr.b;
        }
      }
    }
    HyperlinkCollection localHyperlinkCollection = paramWorksheet.getHyperlinks();
    for (int j = 0; j < localHyperlinkCollection.getCount(); j++)
    {
      Hyperlink localHyperlink = localHyperlinkCollection.get(j);
      if (localHyperlink.getArea().EndRow > paramArrayOfInt1[0]) {
        paramArrayOfInt1[0] = localHyperlink.getArea().EndRow;
      }
      if (localHyperlink.getArea().EndColumn > paramArrayOfInt2[0]) {
        paramArrayOfInt2[0] = localHyperlink.getArea().EndColumn;
      }
    }
    CommentCollection localCommentCollection = paramWorksheet.getComments();
    for (int k = 0; k < localCommentCollection.getCount(); k++)
    {
      Comment localComment = localCommentCollection.get(k);
      if (localComment.getRow() > paramArrayOfInt1[0]) {
        paramArrayOfInt1[0] = localComment.getRow();
      }
      if (localComment.getColumn() > paramArrayOfInt2[0]) {
        paramArrayOfInt2[0] = localComment.getColumn();
      }
    }
    if ((paramBoolean2) && (paramArrayOfInt2[0] > 255)) {
      paramArrayOfInt2[0] = 255;
    }
  }
  
  private static void a(zcjz paramzcjz, Worksheet paramWorksheet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    throws Exception
  {
    Workbook localWorkbook = paramWorksheet.d();
    paramzcjz.b("Worksheet");
    paramzcjz.a("ss:Name", null, paramWorksheet.getName());
    Cells localCells = paramWorksheet.getCells();
    if (paramBoolean2) {
      localCells.j();
    }
    if ((paramWorksheet.a() != null) && (!paramWorksheet.getProtection().getAllowEditingObject())) {
      paramzcjz.a("ss:Protected", null, "1");
    }
    a(paramzcjz, paramWorksheet, localWorkbook);
    paramzcjz.c("ss:Table", null);
    zapd localzapd = paramWorksheet.getCells().o();
    ArrayList localArrayList = new ArrayList(localzapd.getCount());
    for (int i = 0; i < localzapd.getCount(); i++) {
      zf.a(localArrayList, new zgr(localzapd.a(i)));
    }
    Collections.sort(localArrayList);
    i = (short)(int)(localCells.getStandardHeight() * 20.0D);
    a(paramzcjz, paramWorksheet, localWorkbook, localArrayList, paramBoolean2);
    int j = -1;
    zgr localzgr1 = new zgr();
    HashMap localHashMap = new HashMap();
    int k = 0;
    int m = -1;
    int n = -1;
    int[] arrayOfInt1 = { m };
    int[] arrayOfInt2 = { n };
    a(paramWorksheet, localArrayList, false, paramBoolean2, arrayOfInt1, arrayOfInt2);
    m = arrayOfInt1[0];
    n = arrayOfInt2[0];
    RowCollection localRowCollection = localCells.getRows();
    zbdx localzbdx1 = new zbdx();
    Row localRow2 = null;
    int i2 = -1;
    zv localzv = localCells.e();
    zaiv localzaiv1 = null;
    zaiv localzaiv2 = null;
    Cell localCell2 = null;
    int i3 = -1;
    int i4 = -1;
    if (localzv.a() > 0)
    {
      localzaiv1 = localzv.a(-1, -1, false);
      i4 = localzaiv1.a();
      localRow2 = new Row(localCells, localRowCollection, localzv.f(i4), false);
      i2 = localRow2.getIndex();
    }
    for (int i5 = 0; i5 <= m; i5++)
    {
      Row localRow1 = null;
      zbdx localzbdx2 = null;
      int i1 = -1;
      int i6;
      if (i2 == i5)
      {
        localRow1 = localRow2;
        i4 = localzaiv1.a();
        if (i4 < 0)
        {
          localRow2 = null;
          i2 = -1;
        }
        else
        {
          localRow2 = new Row(localCells, localRowCollection, localzv.f(i4), false);
          i2 = localRow2.getIndex();
        }
      }
      else if ((i5 > i2) && (i2 > -1))
      {
        do
        {
          i4 = localzaiv1.a();
          if (i4 < 0)
          {
            localRow2 = null;
            i2 = -1;
            break;
          }
          i6 = localzv.a(i4);
          if (i6 == i5)
          {
            localRow1 = new Row(localCells, localRowCollection, localzv.f(i4), false);
            i4 = localzaiv1.a();
            if (i4 < 0)
            {
              localRow2 = null;
              i2 = -1;
              break;
            }
            localRow2 = new Row(localCells, localRowCollection, localzv.f(i4), false);
            i2 = localRow2.getIndex();
            break;
          }
        } while (i6 <= i5);
        localRow2 = new Row(localCells, localRowCollection, localzv.f(i4), false);
        i2 = localRow2.getIndex();
      }
      if (localRow1 != null)
      {
        localzbdx2 = localRow1.c.a(localzbdx1, 15);
        i1 = localzbdx2.d() ? localzbdx2.d : -1;
      }
      if (((localRow1 != null) && ((localRow1.a() != 0) || (i1 >= 0) || (localzbdx2.b()) || (localzbdx2.e != i))) || (a(paramWorksheet, i5, localArrayList, k)))
      {
        paramzcjz.c("Row", null);
        paramzcjz.a("ss:Index", null, zauj.z(i5 + 1));
        if (localRow1 != null)
        {
          if (localzbdx2.e != i) {
            paramzcjz.a("ss:Height", null, zauj.b(localzbdx2.e / 20.0D));
          }
          if (i1 > -1) {
            paramzcjz.a("ss:StyleID", null, "S" + zauj.z(i1));
          }
          if (localzbdx2.b()) {
            paramzcjz.a("ss:Hidden", null, "1");
          }
        }
        j = -1;
        i3 = -1;
        if ((localRow1 != null) && (localRow1.a() > 0))
        {
          localzaiv2 = localRow1.c.a(-1, -1, false);
          i4 = localzaiv2.a();
          localCell2 = new Cell(localRow1, i4);
          i3 = localCell2.getColumn();
        }
        for (i6 = 0; i6 <= n; i6++)
        {
          if (localHashMap.get(Integer.valueOf(i6)) != null)
          {
            zgr localzgr2 = (zgr)localHashMap.get(Integer.valueOf(i6));
            if (i5 > localzgr2.c)
            {
              localHashMap.remove(Integer.valueOf(i6));
            }
            else if ((i5 <= localzgr2.c) && (i5 >= localzgr2.a))
            {
              i6 = localzgr2.d;
              continue;
            }
          }
          Cell localCell1;
          int i7;
          if (i6 == i3)
          {
            localCell1 = localCell2;
            i4 = localzaiv2.a();
            if (i4 < 0)
            {
              localCell2 = null;
              i3 = -1;
            }
            else
            {
              localCell2 = new Cell(localRow1, i4);
              i3 = localCell2.c.a;
            }
          }
          else
          {
            localCell1 = null;
            if ((i3 > -1) && (i3 < i6))
            {
              do
              {
                i4 = localzaiv2.a();
                if (i4 < 0)
                {
                  localCell2 = null;
                  i3 = -1;
                  break;
                }
                i7 = localRow1.c.a(i4);
                if (i7 == i6)
                {
                  localCell1 = new Cell(localRow1, i4);
                  i4 = localzaiv2.a();
                  if (i4 < 0)
                  {
                    localCell2 = null;
                    i3 = -1;
                    break;
                  }
                  localCell2 = new Cell(localRow1, i4);
                  i3 = localCell2.c.a;
                  break;
                }
              } while (i7 <= i6);
              localCell2 = new Cell(localRow1, i4);
              i3 = localCell2.c.a;
            }
          }
          zbec localzbec = a(localCells, i5, i6, localCell1, localArrayList, k);
          if (localzbec != null)
          {
            paramzcjz.c("Cell", null);
            if ((paramBoolean3) || (i6 - j > 1)) {
              paramzcjz.a("ss:Index", null, zauj.z(i6 + 1));
            }
            j = i6;
            if (localzbec.d)
            {
              localzgr1 = localzbec.a;
              localHashMap.put(Integer.valueOf(i6), localzgr1);
              paramzcjz.a("ss:MergeAcross", null, zauj.z(localzgr1.d - i6));
              i6 = localzgr1.d;
              paramzcjz.a("ss:MergeDown", null, zauj.z(localzgr1.c - i5));
              k++;
            }
            i7 = 15;
            int i8 = -1;
            boolean bool1 = false;
            if (localzbec.c != null)
            {
              i7 = localzbec.c.r();
              i8 = localzbec.c.s();
              if (i8 != -1) {
                bool1 = paramWorksheet.c().C().a(i8).getQuotePrefix();
              }
            }
            int i9 = 0;
            int i10;
            if (i7 != 15)
            {
              if (i1 > -1)
              {
                if (i7 != i1) {
                  i9 = 1;
                }
              }
              else
              {
                i10 = localCells.c.a(i6);
                if (i10 < 0) {
                  i10 = 15;
                }
                if (i7 != i10) {
                  i9 = 1;
                }
              }
            }
            else if (i8 == 15)
            {
              if (localRow1.k()) {
                i9 = 1;
              }
              if (i9 == 0)
              {
                i10 = localCells.c.a(i6);
                i9 = (i10 != -1) && (i10 != 15) ? 1 : 0;
              }
            }
            if (i9 != 0) {
              if (i8 == 15) {
                paramzcjz.a("ss:StyleID", null, "Default");
              } else {
                paramzcjz.a("ss:StyleID", null, "S" + i7);
              }
            }
            String str1;
            if (localzbec.b != null)
            {
              str1 = localzbec.b.getAddress();
              if (localzbec.b.a(paramWorksheet.c()) == 2) {
                str1 = "#" + str1;
              }
              paramzcjz.a("ss:HRef", null, str1);
              if ((localzbec.b.getScreenTip() != null) && (!"".equals(localzbec.b.getScreenTip()))) {
                paramzcjz.a("x:HRefScreenTip", null, localzbec.b.getScreenTip());
              }
            }
            if (localzbec.c != null)
            {
              localCell1 = localzbec.c;
              str1 = "String";
              String str2 = null;
              zgs localzgs = localCell1.c.e();
              if (localCell1.getType() == 1)
              {
                if (localCell1.getDoubleValue() < 0.0D)
                {
                  str1 = "Number";
                  str2 = zauj.b(localCell1.getDoubleValue());
                }
                else
                {
                  str1 = "DateTime";
                  str2 = localCell1.getDateTimeValue().a("yyyy-MM-dd\\THH:mm:ss.fff", com.aspose.cells.b.a.c.za.b());
                }
              }
              else {
                switch (localzgs.c)
                {
                case 2: 
                  str1 = "Boolean";
                  str2 = ((Boolean)localzgs.d).booleanValue() ? "1" : "0";
                  break;
                case 6: 
                  str1 = "Number";
                  str2 = com.aspose.cells.b.a.zp.a(((Integer)localzgs.d).intValue());
                  break;
                case 1: 
                  str1 = "Number";
                  str2 = localCell1.c.a(true, paramWorksheet.c().p().getSettings());
                  break;
                case 3: 
                  str2 = localzgs.g();
                  break;
                case 4: 
                  str2 = (String)localzgs.d;
                }
              }
              Object localObject;
              if ((localCell1.g()) && (((zaai)localCell1.c.d).b != null)) {
                if (localCell1.z())
                {
                  if (localCell1.isArrayHeader())
                  {
                    CellArea localCellArea = localCell1.F().a();
                    if ((!a) && (localCellArea.StartRow != localCell1.getRow())) {
                      throw new AssertionError();
                    }
                    if ((!a) && (localCellArea.StartColumn != localCell1.getColumn())) {
                      throw new AssertionError();
                    }
                    localObject = new StringBuilder();
                    ((StringBuilder)localObject).append("RC:");
                    ((StringBuilder)localObject).append('R');
                    if (localCellArea.EndRow != localCell1.getRow())
                    {
                      ((StringBuilder)localObject).append('[');
                      ((StringBuilder)localObject).append(localCellArea.EndRow - localCell1.getRow());
                      ((StringBuilder)localObject).append(']');
                    }
                    ((StringBuilder)localObject).append('C');
                    if (localCellArea.EndColumn != localCell1.getColumn())
                    {
                      ((StringBuilder)localObject).append('[');
                      ((StringBuilder)localObject).append(localCellArea.EndColumn - localCell1.getColumn());
                      ((StringBuilder)localObject).append(']');
                    }
                    paramzcjz.a("ss:ArrayRange", null, zs.a(localObject));
                    paramzcjz.a("ss:Formula", null, localWorkbook.getWorksheets().e().a(localCell1));
                  }
                }
                else {
                  paramzcjz.a("ss:Formula", null, localWorkbook.getWorksheets().e().a(localCell1));
                }
              }
              if ((str2 != null) && (str2.length() > 0))
              {
                paramzcjz.a(0);
                boolean bool2 = localCell1.H();
                if (bool2) {
                  paramzcjz.c("ss:Data", null);
                } else {
                  paramzcjz.c("Data", null);
                }
                paramzcjz.a("ss:Type", null, str1);
                if (bool1) {
                  paramzcjz.a("x:Ticked", null, "1");
                }
                if (bool2)
                {
                  paramzcjz.a(null, "xmlns", null, "http://www.w3.org/TR/REC-html40");
                  localObject = localCell1.getCharacters();
                  for (int i11 = 0; i11 < localObject.length; i11++)
                  {
                    FontSetting localFontSetting = localObject[i11];
                    a(paramzcjz, localFontSetting, str2.substring(localFontSetting.getStartIndex(), localFontSetting.getStartIndex() + localFontSetting.getLength()));
                  }
                }
                else if ("String".equals(str1))
                {
                  if (str2.indexOf('\n') != -1)
                  {
                    str2 = zagn.a(str2);
                    paramzcjz.d(str2);
                  }
                  else
                  {
                    paramzcjz.a(str2);
                  }
                }
                else
                {
                  paramzcjz.a(str2);
                }
                paramzcjz.b();
                if (paramBoolean1) {
                  paramzcjz.a(1);
                }
              }
            }
            if (localzbec.e != null) {
              a(paramzcjz, localzbec.e);
            }
            paramzcjz.b();
          }
        }
        paramzcjz.b();
      }
    }
    paramzcjz.b();
    d(paramzcjz, paramWorksheet, localWorkbook);
    b(paramzcjz, paramWorksheet, localWorkbook);
    c(paramzcjz, paramWorksheet, localWorkbook);
    b(paramzcjz, paramWorksheet);
    zbed localzbed = new zbed(paramzcjz, paramWorksheet, localWorkbook);
    localzbed.a();
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, Comment paramComment)
    throws Exception
  {
    if ((paramComment.getNote() != null) && (!"".equals(paramComment.getNote())))
    {
      paramzcjz.c("ss:Comment", null);
      if (paramComment.isVisible()) {
        paramzcjz.a("ss:ShowAlways", null, "1");
      }
      paramzcjz.a(0);
      paramzcjz.c("ss:Data", null);
      FontSettingCollection localFontSettingCollection = paramComment.b();
      String str = localFontSettingCollection.getText();
      ArrayList localArrayList1 = localFontSettingCollection.a(false, false);
      if ((localArrayList1 == null) || (localArrayList1.size() <= 1))
      {
        if (str.indexOf('\n') != -1)
        {
          str = zagn.a(str);
          paramzcjz.d(str);
        }
        else
        {
          paramzcjz.a(str);
        }
      }
      else
      {
        paramzcjz.a(null, "xmlns", null, "http://www.w3.org/TR/REC-html40");
        ArrayList localArrayList2 = localFontSettingCollection.a(false, false);
        for (int i = 0; i < localArrayList2.size(); i++)
        {
          FontSetting localFontSetting = (FontSetting)localArrayList2.get(i);
          a(paramzcjz, localFontSetting, str.substring(localFontSetting.getStartIndex(), localFontSetting.getStartIndex() + localFontSetting.getLength()));
        }
      }
      paramzcjz.b();
      paramzcjz.a(1);
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, FontSetting paramFontSetting, String paramString)
    throws Exception
  {
    Font localFont = paramFontSetting.getFont();
    if (localFont != null)
    {
      int i = 0;
      if (localFont.isBold())
      {
        paramzcjz.c("B", null);
        i++;
      }
      if (localFont.isItalic())
      {
        paramzcjz.c("I", null);
        i++;
      }
      if (localFont.isSubscript())
      {
        paramzcjz.c("Sub", null);
        i++;
      }
      if (localFont.isSuperscript())
      {
        paramzcjz.c("Sup", null);
        i++;
      }
      if (localFont.isStrikeout())
      {
        paramzcjz.c("S", null);
        i++;
      }
      if (localFont.getUnderline() != 0)
      {
        paramzcjz.c("U", null);
        switch (localFont.getUnderline())
        {
        case 2: 
          paramzcjz.a("html:Style", null, "text-underline:double");
          break;
        case 3: 
          paramzcjz.a("html:Style", null, "text-underline:single-accounting");
          break;
        case 4: 
          paramzcjz.a("html:Style", null, "text-underline:double-accounting");
        }
        i++;
      }
      paramzcjz.c("Font", null);
      paramzcjz.a("html:Face", null, localFont.getName());
      paramzcjz.a("html:Color", null, zauw.a(localFont.getColor()));
      paramzcjz.a("html:Size", null, zauj.b(localFont.getDoubleSize()));
      if (paramString.indexOf('\n') != -1)
      {
        paramString = zagn.a(paramString);
        paramzcjz.d(paramString);
      }
      else
      {
        paramzcjz.a(paramString);
      }
      paramzcjz.b();
      for (int j = 0; j < i; j++) {
        paramzcjz.b();
      }
    }
    else
    {
      paramzcjz.c("Font", null);
      if (paramString.indexOf('\n') != -1)
      {
        paramString = zagn.a(paramString);
        paramzcjz.d(paramString);
      }
      else
      {
        paramzcjz.a(paramString);
      }
      paramzcjz.b();
    }
  }
  
  private static void b(zcjz paramzcjz, Worksheet paramWorksheet)
    throws Exception
  {
    if (!paramWorksheet.hasAutofilter()) {
      return;
    }
    AutoFilter localAutoFilter = paramWorksheet.getAutoFilter();
    String str1 = zauj.b(localAutoFilter.i());
    paramzcjz.b("AutoFilter");
    paramzcjz.a("x:Range", null, str1);
    paramzcjz.a(null, "xmlns", null, "urn:schemas-microsoft-com:office:excel");
    if ((paramWorksheet.getAutoFilter().c != null) && (paramWorksheet.getAutoFilter().c.getCount() > 0))
    {
      FilterColumnCollection localFilterColumnCollection = paramWorksheet.getAutoFilter().c;
      for (int i = 0; i < localFilterColumnCollection.getCount(); i++)
      {
        FilterColumn localFilterColumn = localFilterColumnCollection.getByIndex(i);
        if (localFilterColumn != null)
        {
          zxm localzxm = new zxm(localFilterColumn);
          if (localzxm.d())
          {
            paramzcjz.b("AutoFilterColumn");
            paramzcjz.a("x:Index", zauj.z(localFilterColumn.getFieldIndex() + 1));
            String str2 = "Top";
            int j = 0;
            int k = 0;
            int m = 0;
            boolean[] arrayOfBoolean1 = { j };
            boolean[] arrayOfBoolean2 = { k };
            int[] arrayOfInt = { m };
            localzxm.a(arrayOfBoolean1, arrayOfBoolean2, arrayOfInt);
            j = arrayOfBoolean1[0];
            k = arrayOfBoolean2[0];
            m = arrayOfInt[0];
            if (j != 0)
            {
              if (k != 0) {
                str2 = "TopPercent";
              } else {
                str2 = "Top";
              }
            }
            else if (k != 0) {
              str2 = "BottomPercent";
            } else {
              str2 = "Bottom";
            }
            paramzcjz.a("x:Type", str2);
            paramzcjz.a("x:Value", zauj.z(m));
            paramzcjz.b();
          }
          else if ((localzxm.c != 6) || (localzxm.d != 6))
          {
            paramzcjz.b("AutoFilterColumn");
            paramzcjz.a("x:Index", zauj.z(localFilterColumn.getFieldIndex() + 1));
            if (localzxm.d == 6)
            {
              if ((localzxm.f == null) && ((localzxm.c == 2) || (localzxm.d == 4)))
              {
                if (localzxm.c == 2) {
                  paramzcjz.a("x:Type", "Blanks");
                } else {
                  paramzcjz.a("x:Type", "NonBlanks");
                }
              }
              else
              {
                paramzcjz.a("x:Type", "Custom");
                paramzcjz.b("AutoFilterCondition");
                paramzcjz.a("x:Operator", a(localzxm.c));
                if (localzxm.f != null) {
                  paramzcjz.a("x:Value", AutoFilter.b(localzxm.f));
                }
                paramzcjz.b();
              }
            }
            else
            {
              paramzcjz.a("x:Type", "Custom");
              if (localzxm.a()) {
                paramzcjz.b("AutoFilterAnd");
              } else {
                paramzcjz.b("AutoFilterOr");
              }
              paramzcjz.b("AutoFilterCondition");
              paramzcjz.a("x:Operator", a(localzxm.c));
              if (localzxm.f != null) {
                paramzcjz.a("x:Value", AutoFilter.b(localzxm.f));
              }
              paramzcjz.b();
              paramzcjz.b("AutoFilterCondition");
              paramzcjz.a("x:Operator", a(localzxm.d));
              if (localzxm.e != null) {
                paramzcjz.a("x:Value", AutoFilter.b(localzxm.e));
              }
              paramzcjz.b();
              paramzcjz.b();
            }
            paramzcjz.b();
          }
        }
      }
    }
    paramzcjz.b();
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return "GreaterThan";
    case 5: 
      return "GreaterThanOrEqual";
    case 1: 
      return "LessThan";
    case 0: 
      return "LessThanOrEqual";
    case 4: 
      return "DoesNotEqual";
    case 2: 
      return "Equals";
    }
    return "Equals";
  }
  
  private static void a(zcjz paramzcjz, Worksheet paramWorksheet, Column paramColumn, int paramInt)
    throws Exception
  {
    int i = paramColumn.c();
    double d = zlp.b(paramColumn.a, paramWorksheet.c()) * 72.0F / zbxp.a();
    paramzcjz.c("Column", null);
    paramzcjz.a("ss:Index", null, zauj.z(paramColumn.getIndex() + 1));
    if (paramInt != 0) {
      paramzcjz.a("ss:Span", null, zauj.z(paramInt));
    }
    if ((i >= 0) && (i != 15)) {
      paramzcjz.a("ss:StyleID", null, "S" + zauj.z(i));
    }
    if (paramColumn.isHidden()) {
      paramzcjz.a("ss:Hidden", null, "1");
    }
    if (d >= 0.0D)
    {
      paramzcjz.a("ss:AutoFitWidth", null, "0");
      paramzcjz.a("ss:Width", null, zauj.b(d));
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, Worksheet paramWorksheet, Workbook paramWorkbook, ArrayList paramArrayList, boolean paramBoolean)
    throws Exception
  {
    Cells localCells = paramWorksheet.getCells();
    paramzcjz.a("ss:DefaultRowHeight", null, zauj.b(localCells.getStandardHeight()));
    int i = -1;
    int j = -1;
    int[] arrayOfInt1 = { j };
    int[] arrayOfInt2 = { i };
    a(paramWorksheet, paramArrayList, true, paramBoolean, arrayOfInt1, arrayOfInt2);
    j = arrayOfInt1[0];
    i = arrayOfInt2[0];
    ColumnCollection localColumnCollection = paramWorksheet.getCells().getColumns();
    if (localColumnCollection.getCount() > 0)
    {
      Column localColumn1 = localColumnCollection.getColumnByIndex(localColumnCollection.getCount() - 1);
      if (localColumn1.getIndex() > i) {
        i = localColumn1.getIndex();
      }
    }
    double d = zlp.b(localColumnCollection.b(), paramWorkbook.getWorksheets());
    if ((localColumnCollection.a != null) && (localColumnCollection.a.isHidden())) {
      paramzcjz.a("ss:DefaultColumnWidth", null, "0");
    } else {
      paramzcjz.a("ss:DefaultColumnWidth", null, zauj.b(d * 72.0D / zbxp.a()));
    }
    if (paramBoolean)
    {
      i = i > 255 ? 255 : i;
      j = j > 65535 ? 65535 : j;
    }
    if (j > 0) {
      paramzcjz.a("ss:ExpandedRowCount", null, zauj.z(j + 1));
    }
    if (i > 0) {
      paramzcjz.a("ss:ExpandedColumnCount", null, zauj.z(i + 1));
    }
    if ((localColumnCollection.a != null) && (localColumnCollection.a.c() > 15)) {
      paramzcjz.a("ss:StyleID", null, "S" + zauj.z(localColumnCollection.a.c()));
    }
    int k = 16383;
    if (paramBoolean) {
      k = 255;
    }
    Column localColumn2 = null;
    if ((localColumnCollection.a != null) && (localColumnCollection.a.getIndex() != 0) && (localColumnCollection.a.j()))
    {
      k = localColumnCollection.a.getIndex();
      localColumn2 = new Column(0, paramWorksheet, localColumnCollection.b());
    }
    int m = 0;
    for (int n = 0; n < localColumnCollection.getCount(); n++)
    {
      Column localColumn3 = localColumnCollection.getColumnByIndex(n);
      if ((localColumn3.getIndex() - m != 0) && (localColumn2 != null) && (m < k))
      {
        i1 = k > localColumn3.getIndex() ? localColumn3.getIndex() : k;
        localColumn2.a(m);
        a(paramzcjz, paramWorksheet, localColumn2, i1 - m - 1);
        m = i1;
      }
      int i1 = 0;
      for (int i2 = n + 1; i2 < localColumnCollection.getCount(); i2++)
      {
        Column localColumn4 = localColumnCollection.getColumnByIndex(i2);
        if ((localColumn4.getIndex() != localColumn3.getIndex() + 1 + i1) || (!localColumn3.b(localColumn4))) {
          break;
        }
        i1++;
      }
      a(paramzcjz, paramWorksheet, localColumn3, i1);
      n += i1;
      m = localColumn3.getIndex() + 1 + i1;
    }
  }
  
  private static void a(Workbook paramWorkbook, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("Styles", null);
    HashMap localHashMap = new HashMap();
    zajm localzajm = paramWorkbook.getWorksheets().C();
    int i = localzajm.b();
    for (int j = 0; j < i; j++)
    {
      Style localStyle1 = localzajm.a(j);
      if (localStyle1.g())
      {
        localHashMap.put(Integer.valueOf(j), null);
        for (localObject1 = localStyle1; (((Style)localObject1).h() != 4095) && (((Style)localObject1).h() > 0) && (!localHashMap.containsKey(Integer.valueOf(((Style)localObject1).h()))); localObject1 = localzajm.a(((Style)localObject1).h())) {
          localHashMap.put(Integer.valueOf(((Style)localObject1).h()), null);
        }
      }
    }
    StyleCollection localStyleCollection = paramWorkbook.getStyles();
    for (int k = 0; k < localStyleCollection.getCount(); k++)
    {
      localObject1 = localStyleCollection.get(k);
      localObject2 = localObject1;
      while ((((Style)localObject2).h() != 4095) && (((Style)localObject2).h() > 0) && (!localHashMap.containsKey(Integer.valueOf(((Style)localObject2).h()))))
      {
        localHashMap.put(Integer.valueOf(((Style)localObject2).h()), null);
        if (((Style)localObject2).h() < localzajm.b()) {
          localObject2 = localzajm.a(((Style)localObject2).h());
        } else {
          localObject2 = localStyleCollection.get(((Style)localObject2).h() - localzajm.b());
        }
      }
    }
    ArrayList localArrayList = new ArrayList(localHashMap.size());
    Object localObject1 = zg.a(localHashMap);
    while (((zc)localObject1).c()) {
      zf.a(localArrayList, ((zc)localObject1).a());
    }
    Collections.sort(localArrayList);
    Object localObject2 = new HashMap();
    for (int m = 0; m < localArrayList.size(); m++)
    {
      int n = ((Integer)localArrayList.get(m)).intValue();
      Style localStyle2;
      if (n >= localzajm.b()) {
        localStyle2 = paramWorkbook.getStyles().get(n - localzajm.b());
      } else {
        localStyle2 = localzajm.a(n);
      }
      if (localStyle2.g())
      {
        Style localStyle3 = localzajm.a(localStyle2.h());
        if (localStyle3.e(localStyle2))
        {
          if ((localStyle3.getName() != null) && (!"".equals(localStyle3.getName()))) {
            if (((HashMap)localObject2).get(localStyle3.getName()) == null)
            {
              localStyle2.a(localStyle3.getName());
              ((HashMap)localObject2).put(localStyle3.getName(), Integer.valueOf(0));
            }
            else
            {
              localStyle2.a(null);
            }
          }
        }
        else if ((localStyle2.getName() != null) && (!"".equals(localStyle2.getName())) && (((HashMap)localObject2).get(localStyle2.getName()) != null)) {
          localStyle2.a(null);
        }
      }
      a(paramWorkbook, localStyle2, n, paramzcjz);
    }
    paramzcjz.b();
  }
  
  private static void a(Workbook paramWorkbook, Style paramStyle, int paramInt, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("Style", null);
    String str = "S" + paramInt;
    paramzcjz.a("ss:ID", null, str);
    int i = paramStyle.h();
    int j = 0;
    Object localObject;
    if (paramInt == 15)
    {
      localObject = paramWorkbook.getWorksheets().C().a(0);
      if (paramStyle.getFont().a(((Style)localObject).getFont())) {
        paramzcjz.a("ss:Name", null, "Normal");
      }
    }
    else if ((i != 4095) && (i > 0) && (i != 15))
    {
      j = 1;
      paramzcjz.a("ss:Parent", null, "S" + i);
    }
    else if ((paramStyle.getName() != null) && (paramStyle.getName().length() != 0))
    {
      paramzcjz.a("ss:Name", null, paramStyle.getName());
    }
    if ((paramStyle.l()) || (paramStyle.getHorizontalAlignment() != 5) || (paramStyle.getVerticalAlignment() != 1) || (paramStyle.isTextWrapped()) || (paramStyle.getIndentLevel() != 0) || (paramStyle.getShrinkToFit()) || (paramStyle.getRotationAngle() != 0) || (paramStyle.getTextDirection() != 0))
    {
      paramzcjz.c("ss:Alignment", null);
      if (paramStyle.getHorizontalAlignment() != 5)
      {
        switch (paramStyle.getHorizontalAlignment())
        {
        case 2: 
          localObject = "CenterAcrossSelection";
          break;
        case 4: 
          localObject = "Fill";
          break;
        case 7: 
          localObject = "Left";
          break;
        case 8: 
          localObject = "Right";
          break;
        case 6: 
          localObject = "Justify";
          break;
        case 3: 
          localObject = "Distributed";
          break;
        case 1: 
          localObject = "Center";
          break;
        case 5: 
        default: 
          localObject = "Automatic";
        }
        paramzcjz.a("ss:Horizontal", null, (String)localObject);
      }
      if ((paramStyle.isModified(26)) || (paramStyle.getVerticalAlignment() != 1))
      {
        switch (paramStyle.getVerticalAlignment())
        {
        case 1: 
          localObject = "Center";
          break;
        case 9: 
          localObject = "Top";
          break;
        case 0: 
          localObject = "Bottom";
          break;
        case 6: 
          localObject = "Justify";
          break;
        case 3: 
          localObject = "Distributed";
          break;
        case 2: 
        case 4: 
        case 5: 
        case 7: 
        case 8: 
        default: 
          localObject = "Automatic";
        }
        paramzcjz.a("ss:Vertical", null, (String)localObject);
      }
      if (paramStyle.isTextWrapped()) {
        paramzcjz.a("ss:WrapText", null, "1");
      }
      if (paramStyle.getIndentLevel() != 0) {
        paramzcjz.a("ss:Indent", null, zauj.z(paramStyle.getIndentLevel()));
      }
      if (paramStyle.getShrinkToFit()) {
        paramzcjz.a("ss:ShrinkToFit", null, "1");
      }
      if (paramStyle.getRotationAngle() == 255) {
        paramzcjz.a("ss:VerticalText", null, "1");
      } else if (paramStyle.getRotationAngle() != 0) {
        paramzcjz.a("ss:Rotate", null, zauj.z(paramStyle.getRotationAngle()));
      }
      switch (paramStyle.getTextDirection())
      {
      case 1: 
        paramzcjz.a("ss:ReadingOrder", null, "LeftToRight");
        break;
      case 2: 
        paramzcjz.a("ss:ReadingOrder", null, "RightToLeft");
      }
      paramzcjz.b();
    }
    if (a(paramStyle))
    {
      paramzcjz.c("ss:Borders", null);
      localObject = paramStyle.getBorders();
      if (((BorderCollection)localObject).getByBorderType(1).getLineStyle() != 0) {
        a(((BorderCollection)localObject).getByBorderType(1), paramzcjz, "Left");
      }
      if (((BorderCollection)localObject).getByBorderType(4).getLineStyle() != 0) {
        a(((BorderCollection)localObject).getByBorderType(4), paramzcjz, "Top");
      }
      if (((BorderCollection)localObject).getByBorderType(2).getLineStyle() != 0) {
        a(((BorderCollection)localObject).getByBorderType(2), paramzcjz, "Right");
      }
      if (((BorderCollection)localObject).getByBorderType(8).getLineStyle() != 0) {
        a(((BorderCollection)localObject).getByBorderType(8), paramzcjz, "Bottom");
      }
      if (((BorderCollection)localObject).f() != 0)
      {
        if (((BorderCollection)localObject).getByBorderType(32).getLineStyle() != 0) {
          a(((BorderCollection)localObject).getByBorderType(32), paramzcjz, "DiagonalRight");
        }
        if (((BorderCollection)localObject).getByBorderType(16).getLineStyle() != 0) {
          a(((BorderCollection)localObject).getByBorderType(16), paramzcjz, "DiagonalLeft");
        }
      }
      paramzcjz.b();
    }
    else if (((paramStyle.getName() != null) && (!"".equals(paramStyle.getName()))) || ((j != 0) && (paramStyle.m())))
    {
      paramzcjz.c("ss:Borders", null);
      paramzcjz.b();
    }
    a(paramStyle.getFont(), paramzcjz);
    if (paramStyle.getPattern() != 0)
    {
      b(paramStyle, paramzcjz);
    }
    else if ((paramStyle.getName() != null) && (!"".equals(paramStyle.getName())) && ((paramStyle.i() & 0xFF & 0x40) != 0))
    {
      paramzcjz.c("ss:Interior", null);
      paramzcjz.b();
    }
    if ((paramStyle.getNumber() != 0) || ((paramStyle.s() != null) && (paramStyle.s().length() != 0))) {
      a(paramStyle, paramzcjz);
    } else if (paramStyle.j()) {
      if ((paramStyle.getName() != null) && (!"".equals(paramStyle.getName())))
      {
        paramzcjz.c("ss:NumberFormat", null);
        paramzcjz.b();
      }
      else if ((paramStyle.h() != 4095) && (paramStyle.h() != -1))
      {
        paramzcjz.c("ss:NumberFormat", null);
        paramzcjz.b();
      }
    }
    if (paramStyle.o())
    {
      paramzcjz.c("ss:Protection", null);
      paramzcjz.a("ss:Protected", null, paramStyle.isLocked() ? "1" : "0");
      paramzcjz.a("x:HideFormula", null, paramStyle.isFormulaHidden() ? "1" : "0");
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private static void a(Style paramStyle, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("ss:NumberFormat", null);
    String str = "General";
    if ((paramStyle.s() != null) && (paramStyle.s().length() != 0))
    {
      str = paramStyle.s();
    }
    else if (paramStyle.getNumber() != 0)
    {
      str = paramStyle.e().p().getSettings().f().d(paramStyle.getNumber());
      if (str == null) {
        str = "General";
      }
    }
    paramzcjz.a("ss:Format", null, str);
    paramzcjz.b();
  }
  
  private static void b(Style paramStyle, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("ss:Interior", null);
    if (paramStyle.getPattern() != 1)
    {
      if (!paramStyle.getForegroundColor().isEmpty()) {
        paramzcjz.a("ss:PatternColor", null, zauw.a(paramStyle.getForegroundColor()));
      }
      if (!paramStyle.getBackgroundColor().isEmpty()) {
        paramzcjz.a("ss:Color", null, zauw.a(paramStyle.getBackgroundColor()));
      }
    }
    else if (!paramStyle.getForegroundColor().isEmpty())
    {
      paramzcjz.a("ss:Color", null, zauw.a(paramStyle.getForegroundColor()));
    }
    String str = null;
    switch (paramStyle.getPattern())
    {
    case 1: 
      str = "Solid";
      break;
    case 3: 
      str = "Gray75";
      break;
    case 2: 
      str = "Gray50";
      break;
    case 4: 
      str = "Gray25";
      break;
    case 18: 
      str = "Gray0625";
      break;
    case 17: 
      str = "Gray125";
      break;
    case 5: 
      str = "HorzStripe";
      break;
    case 6: 
      str = "VertStripe";
      break;
    case 7: 
      str = "ReverseDiagStripe";
      break;
    case 8: 
      str = "DiagStripe";
      break;
    case 9: 
      str = "DiagCross";
      break;
    case 10: 
      str = "ThickDiagCross";
      break;
    case 11: 
      str = "ThinHorzStripe";
      break;
    case 12: 
      str = "ThinVertStripe";
      break;
    case 13: 
      str = "ThinReverseDiagStripe";
      break;
    case 14: 
      str = "ThinDiagStripe";
      break;
    case 15: 
      str = "ThinHorzCross";
      break;
    case 16: 
      str = "ThinDiagCross";
    }
    if (str != null) {
      paramzcjz.a("ss:Pattern", null, str);
    }
    paramzcjz.b();
  }
  
  private static void a(Font paramFont, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("ss:Font", null);
    if (paramFont.isBold()) {
      paramzcjz.a("ss:Bold", null, "1");
    }
    if ((!paramFont.getColor().isEmpty()) && (paramFont.getColor() != Color.getBlack())) {
      paramzcjz.a("ss:Color", null, zauw.a(paramFont.getColor()));
    }
    paramzcjz.a("ss:FontName", null, paramFont.getName());
    paramzcjz.a("ss:Size", null, zauj.z(paramFont.getSize()));
    if (paramFont.isItalic()) {
      paramzcjz.a("ss:Italic", null, "1");
    }
    if (paramFont.isStrikeout()) {
      paramzcjz.a("ss:StrikeThrough", null, "1");
    }
    String str = null;
    switch (paramFont.getUnderline())
    {
    case 3: 
      str = "SingleAccounting";
      break;
    case 2: 
      str = "Double";
      break;
    case 4: 
      str = "DoubleAccounting";
      break;
    case 1: 
      str = "Single";
    }
    if (str != null) {
      paramzcjz.a("ss:Underline", null, str);
    }
    if (paramFont.isSubscript()) {
      paramzcjz.a("ss:VerticalAlign", null, "Subscript");
    } else if (paramFont.isSuperscript()) {
      paramzcjz.a("ss:VerticalAlign", null, "Superscript");
    }
    paramzcjz.b();
  }
  
  private static boolean a(Style paramStyle)
  {
    BorderCollection localBorderCollection = paramStyle.getBorders();
    return (localBorderCollection.getByBorderType(8).getLineStyle() != 0) || (localBorderCollection.getByBorderType(16).getLineStyle() != 0) || (localBorderCollection.getByBorderType(32).getLineStyle() != 0) || (localBorderCollection.getByBorderType(1).getLineStyle() != 0) || (localBorderCollection.getByBorderType(2).getLineStyle() != 0) || (localBorderCollection.getByBorderType(4).getLineStyle() != 0);
  }
  
  private static void a(Border paramBorder, zcjz paramzcjz, String paramString)
    throws Exception
  {
    paramzcjz.c("ss:Border", null);
    paramzcjz.a("ss:Position", null, paramString);
    paramzcjz.a("ss:Color", null, zauw.a(paramBorder.getColor()));
    String str = null;
    double d = 0.0D;
    String[] arrayOfString = { str };
    double[] arrayOfDouble = { d };
    a(paramBorder.getLineStyle(), arrayOfString, arrayOfDouble);
    str = arrayOfString[0];
    d = arrayOfDouble[0];
    paramzcjz.a("ss:LineStyle", null, str);
    paramzcjz.a("ss:Weight", null, zauj.b(d));
    paramzcjz.b();
  }
  
  private static void a(int paramInt, String[] paramArrayOfString, double[] paramArrayOfDouble)
  {
    paramArrayOfString[0] = "Continuous";
    paramArrayOfDouble[0] = 1.0D;
    switch (paramInt)
    {
    case 0: 
      paramArrayOfString[0] = "None";
      paramArrayOfDouble[0] = 0.0D;
      break;
    case 7: 
      paramArrayOfString[0] = "Continuous";
      paramArrayOfDouble[0] = 0.0D;
      break;
    case 4: 
      paramArrayOfString[0] = "Dot";
      paramArrayOfDouble[0] = 1.0D;
      break;
    case 11: 
      paramArrayOfString[0] = "DashDotDot";
      paramArrayOfDouble[0] = 1.0D;
      break;
    case 9: 
      paramArrayOfString[0] = "DashDot";
      paramArrayOfDouble[0] = 1.0D;
      break;
    case 3: 
      paramArrayOfString[0] = "Dash";
      paramArrayOfDouble[0] = 1.0D;
      break;
    case 1: 
      paramArrayOfString[0] = "Continuous";
      paramArrayOfDouble[0] = 1.0D;
      break;
    case 12: 
      paramArrayOfString[0] = "DashDotDot";
      paramArrayOfDouble[0] = 2.0D;
      break;
    case 13: 
      paramArrayOfString[0] = "SlantDashDot";
      paramArrayOfDouble[0] = 2.0D;
      break;
    case 10: 
      paramArrayOfString[0] = "DashDot";
      paramArrayOfDouble[0] = 2.0D;
      break;
    case 8: 
      paramArrayOfString[0] = "Dash";
      paramArrayOfDouble[0] = 2.0D;
      break;
    case 2: 
      paramArrayOfString[0] = "Continuous";
      paramArrayOfDouble[0] = 2.0D;
      break;
    case 5: 
      paramArrayOfString[0] = "Continuous";
      paramArrayOfDouble[0] = 3.0D;
      break;
    case 6: 
      paramArrayOfString[0] = "Double";
      paramArrayOfDouble[0] = 3.0D;
      break;
    default: 
      if (!a) {
        throw new AssertionError("unknown border type.");
      }
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */