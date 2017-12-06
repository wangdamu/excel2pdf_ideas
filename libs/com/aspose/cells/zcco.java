package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcco
  extends zche
{
  zcco(zbtz paramzbtz)
  {
    this.d = 1165;
    this.c = new byte[15];
    System.arraycopy(zc.a(paramzbtz.b()), 0, this.c, 4, 2);
    if ((paramzbtz.b() & 0xFFFF) == 65534)
    {
      this.c[6] = -1;
      this.c[7] = -1;
    }
    if (paramzbtz.c != null) {
      System.arraycopy(zc.a(paramzbtz.c.size()), 0, this.c, 8, 4);
    }
    short s = 0;
    if (!paramzbtz.q) {
      s = (short)(s | 0x1);
    }
    if (paramzbtz.e) {
      s = (short)(s | 0x2);
    }
    if (paramzbtz.f) {
      s = (short)(s | 0x4);
    }
    if (paramzbtz.g) {
      s = (short)(s | 0x8);
    }
    if (paramzbtz.h) {
      s = (short)(s | 0x10);
    }
    if (paramzbtz.i) {
      s = (short)(s | 0x20);
    }
    if (paramzbtz.j) {
      s = (short)(s | 0x40);
    }
    if (paramzbtz.k) {
      s = (short)(s | 0x80);
    }
    if (paramzbtz.l) {
      s = (short)(s | 0x100);
    }
    if (paramzbtz.m) {
      s = (short)(s | 0x200);
    }
    if (paramzbtz.n) {
      s = (short)(s | 0x400);
    }
    if (paramzbtz.o) {
      s = (short)(s | 0x800);
    }
    if (paramzbtz.p) {
      s = (short)(s | 0x1000);
    }
    System.arraycopy(zc.a(s), 0, this.c, 12, 2);
    int i = 0;
    if (paramzbtz.c()) {
      i = (byte)(i | 0x1);
    }
    this.c[14] = i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */