package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcgo
  extends zche
{
  zcgo(CellArea paramCellArea)
  {
    this.d = 176;
    this.c = new byte[16];
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, this.c, 0, 4);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, this.c, 4, 4);
    System.arraycopy(zc.a(paramCellArea.StartColumn), 0, this.c, 8, 4);
    System.arraycopy(zc.a(paramCellArea.EndColumn), 0, this.c, 12, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */