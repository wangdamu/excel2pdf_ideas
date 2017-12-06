package com.aspose.cells;

class zcjq
{
  private Worksheet a;
  private CellArea b;
  
  zcjq(Worksheet paramWorksheet, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramWorksheet;
    this.b = new CellArea();
    this.b.StartRow = paramInt1;
    this.b.StartColumn = paramInt2;
    this.b.EndRow = paramInt3;
    this.b.EndColumn = paramInt4;
  }
  
  int a()
  {
    if (c()) {
      return 1;
    }
    return this.b.EndRow - this.b.StartRow;
  }
  
  String a(int paramInt)
  {
    int i;
    if (c()) {
      i = this.b.StartRow;
    } else {
      i = this.b.StartRow + 1 + paramInt;
    }
    Cell localCell = this.a.getCells().a(i, this.b.StartColumn, true);
    if (a(localCell)) {
      return localCell.getStringValue();
    }
    return null;
  }
  
  boolean b()
  {
    if (c())
    {
      Cell localCell = this.a.getCells().a(this.b.StartRow, this.b.StartColumn, true);
      return a(localCell);
    }
    return true;
  }
  
  private boolean c()
  {
    return (this.b.StartRow == this.b.EndRow) && (this.b.StartColumn == this.b.EndColumn);
  }
  
  private static boolean a(Cell paramCell)
  {
    if (paramCell == null) {
      return false;
    }
    String str = paramCell.getStringValue();
    return (str != null) && (str.length() != 0);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */