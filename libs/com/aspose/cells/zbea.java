package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbea
  extends zcd
{
  zbea()
  {
    c(1212);
  }
  
  void a(zbf paramzbf)
  {
    byte[] arrayOfByte = paramzbf.c();
    a((short)(arrayOfByte.length + 8));
    this.b = new byte[d()];
    CellArea localCellArea = paramzbf.a();
    System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, 0, 2);
    System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, 2, 2);
    this.b[4] = ((byte)localCellArea.StartColumn);
    this.b[5] = ((byte)localCellArea.EndColumn);
    this.b[7] = ((byte)((localCellArea.EndRow - localCellArea.StartRow + 1) * (localCellArea.EndColumn - localCellArea.StartColumn + 1)));
    System.arraycopy(arrayOfByte, 0, this.b, 8, arrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */