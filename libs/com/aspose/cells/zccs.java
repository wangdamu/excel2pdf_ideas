package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zccs
  extends zche
{
  zccs(zbur paramzbur)
  {
    this.d = 1161;
    int i = 12;
    if (paramzbur.j()) {
      i += 16;
    }
    this.c = new byte[i];
    if ((paramzbur.b & 0xFF) == 255) {
      System.arraycopy(zc.a(-1), 0, this.c, 4, 4);
    } else if ((paramzbur.b & 0xFF) == 254) {
      System.arraycopy(zc.a(-2), 0, this.c, 4, 4);
    } else {
      System.arraycopy(zc.a((short)paramzbur.b), 0, this.c, 4, 1);
    }
    this.c[8] = paramzbur.g();
    int j = 0;
    if (paramzbur.a()) {
      j = (byte)(j | 0x1);
    }
    if (paramzbur.b()) {
      j = (byte)(j | 0x2);
    }
    if (paramzbur.c()) {
      j = (byte)(j | 0x4);
    }
    if (paramzbur.d()) {
      j = (byte)(j | 0x8);
    }
    if (paramzbur.e()) {
      j = (byte)(j | 0x10);
    }
    if (paramzbur.h()) {
      j = (byte)(j | 0x20);
    }
    if (paramzbur.j()) {
      j = (byte)(j | 0x40);
    }
    if (paramzbur.i()) {
      j = (byte)(j | 0x80);
    }
    this.c[9] = j;
    int k = paramzbur.f() & 0xFF & 15 + (paramzbur.a & 0xFF) << 4;
    System.arraycopy(zc.a(k), 0, this.c, 10, 2);
    if (paramzbur.j())
    {
      this.c[12] = paramzbur.f;
      this.c[16] = paramzbur.g;
      this.c[20] = paramzbur.h;
      this.c[24] = paramzbur.i;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zccs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */