package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zchx
  extends zche
{
  zchx(zbti paramzbti, zwh paramzwh)
  {
    this.d = 586;
    this.c = new byte[7];
    if (paramzbti.a() == 0)
    {
      System.arraycopy(zc.a(paramzwh.g()), 0, this.c, 0, 2);
      System.arraycopy(zc.a(paramzwh.d()), 0, this.c, 2, 2);
    }
    else if (paramzbti.a() == 4)
    {
      System.arraycopy(zc.a(paramzwh.g()), 0, this.c, 0, 2);
      this.c[6] = 1;
    }
    else
    {
      System.arraycopy(zc.a(paramzwh.g()), 0, this.c, 0, 2);
      this.c[6] = 1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */