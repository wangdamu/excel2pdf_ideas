package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;

class zet
  extends zche
{
  zet(zoj paramzoj)
    throws Exception
  {
    int i = 50 + paramzoj.j.length() * 2;
    this.c = new byte[i];
    this.d = 397;
    int j = 0;
    System.arraycopy(zc.a(paramzoj.c), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(paramzoj.e + paramzoj.c), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(paramzoj.d), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(paramzoj.f + paramzoj.d), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(paramzoj.a), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(paramzoj.h), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(paramzoj.b.a(), 0, this.c, j, 16);
    j += 16;
    System.arraycopy(zc.a(paramzoj.i), 0, this.c, j, 2);
    j += 2;
    int k = 0;
    k |= (paramzoj.n() ? 1 : 0);
    k |= (paramzoj.p() ? 2 : 0);
    k |= (paramzoj.d() ? 4 : 0);
    k |= (paramzoj.e() ? 8 : 0);
    k |= (paramzoj.o() ? 16 : 0);
    k |= (paramzoj.a() ? 32 : 0);
    k |= (paramzoj.b() ? 64 : 0);
    k |= (paramzoj.c() == 1 ? 128 : paramzoj.c() == 2 ? 0 : 256);
    k |= (paramzoj.f() == 2 ? 512 : paramzoj.f() == 0 ? 0 : 1024);
    k |= (paramzoj.g() ? 2048 : 0);
    k |= (paramzoj.h() ? 4096 : 0);
    k |= (paramzoj.j() ? 8192 : 0);
    k |= (paramzoj.k() ? 16384 : 0);
    k |= (paramzoj.l() ? 32768 : 0);
    k |= (paramzoj.m() ? 65536 : 0);
    System.arraycopy(zc.a(k), 0, this.c, j, 4);
    j += 4;
    j = zcgj.a(this.c, j, paramzoj.j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */