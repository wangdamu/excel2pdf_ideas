package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbvm
  extends zcd
{
  zbvm(zacb paramzacb)
  {
    c(566);
    this.b = new byte[16];
    b(16);
    CellArea localCellArea = paramzacb.a;
    System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, 0, 2);
    System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, 2, 2);
    this.b[4] = ((byte)localCellArea.StartColumn);
    this.b[5] = ((byte)localCellArea.EndColumn);
    this.b[6] = paramzacb.a();
    if (paramzacb.d())
    {
      System.arraycopy(zc.a(paramzacb.b), 0, this.b, 8, 2);
      System.arraycopy(zc.a(paramzacb.c), 0, this.b, 10, 2);
      System.arraycopy(zc.a(paramzacb.d), 0, this.b, 12, 2);
      System.arraycopy(zc.a(paramzacb.e), 0, this.b, 14, 2);
    }
    else if (paramzacb.e())
    {
      System.arraycopy(zc.a(paramzacb.b), 0, this.b, 8, 2);
      System.arraycopy(zc.a(paramzacb.c), 0, this.b, 10, 2);
    }
    else
    {
      System.arraycopy(zc.a(paramzacb.d), 0, this.b, 8, 2);
      System.arraycopy(zc.a(paramzacb.e), 0, this.b, 10, 2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */