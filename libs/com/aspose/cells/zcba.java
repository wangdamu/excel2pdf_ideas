package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcba
  extends zche
{
  zcba(FilterColumn paramFilterColumn)
  {
    this.d = 163;
    this.c = new byte[6];
    System.arraycopy(zc.a(paramFilterColumn.getFieldIndex()), 0, this.c, 0, 4);
    int i = 0;
    if (paramFilterColumn.a()) {
      i = (byte)(i | 0x1);
    }
    if (!paramFilterColumn.b()) {
      i = (byte)(i | 0x2);
    }
    this.c[4] = i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */