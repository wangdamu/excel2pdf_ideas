package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zccc
  extends zche
{
  zccc(SxRng paramSxRng)
  {
    this.d = 223;
    this.c = new byte[26];
    this.c[0] = ((byte)zcij.Q(paramSxRng.c));
    int i = 0;
    if (paramSxRng.a) {
      i = (byte)(i & 0x1);
    }
    if (paramSxRng.b) {
      i = (byte)(i & 0x2);
    }
    if (paramSxRng.c != 0) {
      i = (byte)(i & 0x4);
    }
    this.c[1] = i;
    if (paramSxRng.c != 0)
    {
      System.arraycopy(zc.a(CellsHelper.getDoubleFromDateTime(paramSxRng.f, false)), 0, this.c, 2, 8);
      System.arraycopy(zc.a(CellsHelper.getDoubleFromDateTime(paramSxRng.g, false)), 0, this.c, 2, 8);
    }
    else
    {
      System.arraycopy(zc.a(paramSxRng.h), 0, this.c, 2, 8);
      System.arraycopy(zc.a(paramSxRng.i), 0, this.c, 2, 8);
    }
    System.arraycopy(zc.a(paramSxRng.j), 0, this.c, 18, 8);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zccc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */