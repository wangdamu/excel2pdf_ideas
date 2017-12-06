package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcit
  extends zche
{
  zcit()
  {
    this.d = 47;
  }
  
  void a(zrv paramzrv)
  {
    this.c = new byte[16];
    if (!paramzrv.b)
    {
      this.c[0] = -1;
      this.c[1] = -1;
    }
    else
    {
      System.arraycopy(zc.a(paramzrv.i), 0, this.c, 0, 2);
    }
    System.arraycopy(zc.a(paramzrv.e), 0, this.c, 2, 2);
    if (paramzrv.f > 4) {
      System.arraycopy(zc.a(paramzrv.f - 1), 0, this.c, 4, 2);
    } else {
      System.arraycopy(zc.a(paramzrv.f), 0, this.c, 4, 2);
    }
    System.arraycopy(zc.a(paramzrv.g), 0, this.c, 6, 2);
    System.arraycopy(zc.a(paramzrv.h), 0, this.c, 8, 2);
    int i = 0;
    Style localStyle = paramzrv.r;
    if (paramzrv.c != null)
    {
      this.c[10] = ((byte)paramzrv.c.a());
      this.c[11] = ((byte)paramzrv.c.c());
      i |= zcij.h(paramzrv.c.e);
      i |= zcij.f(paramzrv.c.f) << 3;
      if (paramzrv.c.b()) {
        i |= 0x40;
      }
      this.c[12] = ((byte)i);
      i = 0;
      if (paramzrv.c.d()) {
        i |= 0x1;
      }
      if (paramzrv.c.e() == 1) {
        i |= 0x4;
      } else if (paramzrv.c.e() == 2) {
        i |= 0x8;
      }
    }
    else
    {
      int j = localStyle.getHorizontalAlignment();
      int k = localStyle.getVerticalAlignment();
      i |= zcij.h(j);
      i |= zcij.f(k) << 3;
      this.c[12] = ((byte)i);
      i = 0;
      if (localStyle.getShrinkToFit()) {
        i |= 0x1;
      }
      if (localStyle.getTextDirection() == 1) {
        i |= 0x4;
      } else if (localStyle.getTextDirection() == 2) {
        i |= 0x8;
      }
    }
    if (paramzrv.d != null)
    {
      if (paramzrv.d.a) {
        i |= 0x10;
      }
      if (paramzrv.d.b) {
        i |= 0x20;
      }
    }
    else
    {
      i |= 0x10;
    }
    this.c[13] = ((byte)i);
    i = 0;
    if (paramzrv.b)
    {
      if (paramzrv.l) {
        i |= 0x1;
      }
      if (paramzrv.m) {
        i |= 0x2;
      }
      if (paramzrv.p) {
        i |= 0x4;
      }
      if (paramzrv.q) {
        i |= 0x20;
      }
    }
    else
    {
      if (!paramzrv.l) {
        i |= 0x1;
      }
      if (!paramzrv.m) {
        i |= 0x2;
      }
      if (!paramzrv.p) {
        i |= 0x4;
      }
      if (!paramzrv.o) {
        i |= 0x8;
      }
      if (!paramzrv.n) {
        i |= 0x10;
      }
      if (!paramzrv.q) {
        i |= 0x20;
      }
    }
    this.c[14] = ((byte)i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */