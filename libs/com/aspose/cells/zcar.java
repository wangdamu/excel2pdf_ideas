package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcar
  extends zche
{
  zcar()
  {
    this.d = 396;
  }
  
  void a(HorizontalPageBreak paramHorizontalPageBreak)
  {
    this.c = new byte[20];
    System.arraycopy(zc.a(paramHorizontalPageBreak.getRow()), 0, this.c, 0, 4);
    System.arraycopy(zc.a(paramHorizontalPageBreak.getStartColumn()), 0, this.c, 4, 4);
    System.arraycopy(zc.a(paramHorizontalPageBreak.getEndColumn()), 0, this.c, 8, 4);
    this.c[12] = 1;
  }
  
  void a(VerticalPageBreak paramVerticalPageBreak)
  {
    this.c = new byte[20];
    System.arraycopy(zc.a(paramVerticalPageBreak.getColumn()), 0, this.c, 0, 4);
    System.arraycopy(zc.a(paramVerticalPageBreak.getStartRow()), 0, this.c, 4, 4);
    System.arraycopy(zc.a(paramVerticalPageBreak.getEndRow()), 0, this.c, 8, 4);
    this.c[12] = 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */