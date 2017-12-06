package com.aspose.cells;

class zgu
  implements LightCellsDataHandler
{
  private CellHandler a;
  private LightCell b = new LightCell();
  private int c;
  private String d;
  
  zgu(CellHandler paramCellHandler, int paramInt)
  {
    this.a = paramCellHandler;
    this.c = paramInt;
  }
  
  zgu(CellHandler paramCellHandler, String paramString)
  {
    this.a = paramCellHandler;
    this.c = -1;
    this.d = paramString;
  }
  
  public boolean startSheet(Worksheet sheet)
  {
    if (!this.a.startSheet(sheet.getIndex())) {
      return false;
    }
    if ((this.c > -1) && (this.c != sheet.getIndex())) {
      return false;
    }
    return (this.d == null) || (this.d.equals(sheet.getName()));
  }
  
  public boolean startRow(int rowIndex)
  {
    this.b.b = rowIndex;
    return true;
  }
  
  public boolean processRow(Row row)
  {
    return true;
  }
  
  public boolean startCell(int column)
  {
    return this.a.startCell(this.b.b, column);
  }
  
  public boolean processCell(Cell cell)
  {
    this.b.a(cell);
    this.a.process(this.b);
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */