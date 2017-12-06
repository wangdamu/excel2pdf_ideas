package com.aspose.cells;

class zls
  implements zahp
{
  private ColumnCollection a;
  
  zls(Cells paramCells)
  {
    this.a = paramCells.getColumns();
  }
  
  public int a(int paramInt)
  {
    int i = this.a.e(paramInt);
    if (i > -1)
    {
      Column localColumn = this.a.getColumnByIndex(i);
      if (localColumn.e()) {
        return localColumn.c();
      }
    }
    else
    {
      return this.a.a(paramInt);
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */