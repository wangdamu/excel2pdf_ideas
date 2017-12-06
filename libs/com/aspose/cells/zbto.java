package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbto
  extends zcd
{
  zbto(zawp paramzawp)
  {
    c(290);
    b(12);
    this.b = new byte[12];
    if (paramzawp.l > 0.0D)
    {
      System.arraycopy(zc.a(paramzawp.l), 0, this.b, 0, 8);
    }
    else
    {
      double d = CellsHelper.getDoubleFromDateTime(paramzawp.k, false);
      System.arraycopy(zc.a(d), 0, this.b, 0, 8);
    }
    int i = paramzawp.m == null ? 0 : paramzawp.m.getCount();
    System.arraycopy(zc.a(i), 0, this.b, 8, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbto.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */