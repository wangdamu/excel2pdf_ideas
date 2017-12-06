package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaug
  extends zcd
{
  public zaug(CellArea paramCellArea)
  {
    c(222);
    b(8);
    this.b = new byte[8];
    this.b[0] = 12;
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, this.b, 2, 2);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, this.b, 4, 2);
    this.b[6] = ((byte)paramCellArea.StartColumn);
    this.b[7] = ((byte)paramCellArea.EndColumn);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */