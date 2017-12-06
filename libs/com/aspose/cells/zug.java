package com.aspose.cells;

abstract class zug
{
  static void a(Workbook paramWorkbook)
  {
    if (a(paramWorkbook.getWorksheets()))
    {
      zcu.a += 1;
      if (zcu.a > 100) {
        throw new CellsException(10, "You are using an evaluation copy and have opened files exceeding limitation.");
      }
    }
  }
  
  static boolean a(WorksheetCollection paramWorksheetCollection)
  {
    return paramWorksheetCollection.p().l();
  }
  
  static void b(WorksheetCollection paramWorksheetCollection)
  {
    String str1 = paramWorksheetCollection.p().m();
    if (str1 == null) {
      return;
    }
    String str2 = zamm.a(paramWorksheetCollection);
    Worksheet localWorksheet = paramWorksheetCollection.add(str2);
    Style localStyle = new Style(localWorksheet.c());
    localStyle.getFont().setName("Arial");
    localStyle.getFont().setSize(18);
    localStyle.getFont().setColor(Color.getBlue());
    localStyle.getFont().setBold(true);
    localStyle.getFont().setItalic(true);
    Cell localCell = localWorksheet.getCells().get("A5");
    localCell.putValue(str1);
    localCell.setStyle(localStyle);
    localWorksheet.getCells().setRowHeight(4, 23.25D);
    for (int i = 0; i < paramWorksheetCollection.getCount() - 1; i++) {
      paramWorksheetCollection.get(i).setSelected(false);
    }
    paramWorksheetCollection.setActiveSheetIndex(localWorksheet.getIndex());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */