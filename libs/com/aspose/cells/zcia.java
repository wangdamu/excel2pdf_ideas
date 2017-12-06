package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcia
  extends zche
{
  zcia(zbti paramzbti)
    throws Exception
  {
    this.d = 359;
    int i = paramzbti.c().length;
    int j = 4;
    for (int k = 0; k < i; k++) {
      j += paramzbti.c()[k].length() * 2 + 4;
    }
    this.c = new byte[j];
    System.arraycopy(zc.a(i), 0, this.c, 0, 4);
    k = 4;
    for (int m = 0; m < i; m++) {
      k = zcgj.a(this.c, k, paramzbti.c()[m]);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */