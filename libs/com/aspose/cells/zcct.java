package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcct
  extends zche
{
  zcct(zbur paramzbur)
  {
    a(paramzbur, false);
  }
  
  zcct(zbur paramzbur, boolean paramBoolean)
  {
    a(paramzbur, paramBoolean);
  }
  
  void a(zbur paramzbur, boolean paramBoolean)
  {
    this.d = 247;
    int i = 8;
    if (paramzbur.j()) {
      i += 16;
    }
    this.c = new byte[i];
    if (paramBoolean) {
      System.arraycopy(zc.a(-1), 0, this.c, 0, 4);
    } else if ((paramzbur.b & 0xFF) == 255) {
      System.arraycopy(zc.a(-1), 0, this.c, 0, 4);
    } else if ((paramzbur.b & 0xFF) == 254) {
      System.arraycopy(zc.a(-2), 0, this.c, 0, 4);
    } else {
      System.arraycopy(zc.a((short)paramzbur.b), 0, this.c, 0, 1);
    }
    this.c[4] = paramzbur.g();
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
    this.c[5] = j;
    int k = (paramzbur.f() & 0xFF & 0xF) + ((paramzbur.a & 0xFF) << 4);
    System.arraycopy(zc.a(k), 0, this.c, 6, 2);
    if (paramzbur.j())
    {
      this.c[8] = paramzbur.f;
      this.c[12] = paramzbur.g;
      this.c[16] = paramzbur.h;
      this.c[20] = paramzbur.i;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */