package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcau
  extends zche
{
  zcau(int paramInt, Comment paramComment)
  {
    this.d = 635;
    this.c = new byte[36];
    CellArea localCellArea = new CellArea();
    localCellArea.StartColumn = paramComment.getColumn();
    localCellArea.EndColumn = paramComment.getColumn();
    localCellArea.StartRow = paramComment.getRow();
    localCellArea.EndRow = paramComment.getRow();
    System.arraycopy(zc.a(paramInt), 0, this.c, 0, 4);
    zcgj.a(localCellArea, this.c, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */