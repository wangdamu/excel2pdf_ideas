package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcej
  extends zche
{
  zcej(zbct paramzbct)
  {
    this.d = 400;
    int i = 32;
    if (paramzbct.d != null) {
      i += paramzbct.d.length() * 2;
    }
    this.c = new byte[i];
    int j = 0;
    System.arraycopy(zc.a(paramzbct.c), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(paramzbct.b, 0, this.c, j, 16);
    j += 16;
    a(paramzbct.a, j);
    j += 8;
    a(paramzbct.d, j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */