package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbg
  extends zcd
{
  zbg()
  {
    c(545);
  }
  
  void a(zbf paramzbf)
  {
    CellArea localCellArea = paramzbf.a();
    byte[] arrayOfByte = paramzbf.c();
    a((short)(12 + arrayOfByte.length));
    this.b = new byte[d()];
    System.arraycopy(arrayOfByte, 0, this.b, 12, arrayOfByte.length);
    System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, 0, 2);
    System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, 2, 2);
    this.b[4] = ((byte)localCellArea.StartColumn);
    this.b[5] = ((byte)localCellArea.EndColumn);
    this.b[6] = 2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */