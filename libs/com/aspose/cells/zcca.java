package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcca
  extends zche
{
  zcca(zaxa paramzaxa)
  {
    this.d = 245;
    int i = 4;
    if (paramzaxa.c != null) {
      i += 4 + paramzaxa.c.length + 4;
    } else {
      i += 8;
    }
    this.c = new byte[i];
    System.arraycopy(zc.a(-1), 0, this.c, 0, 4);
    if (paramzaxa.c != null)
    {
      System.arraycopy(zc.a(paramzaxa.c.length), 0, this.c, 4, 4);
      System.arraycopy(paramzaxa.c, 0, this.c, 8, paramzaxa.c.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */