package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;

class zbxu
  extends zcd
{
  zbxu()
  {
    c(425);
  }
  
  void a(zoj paramzoj)
  {
    byte[] arrayOfByte = zct.c(paramzoj.j);
    a((short)(53 + arrayOfByte.length));
    this.b = new byte[d()];
    int i = 4;
    System.arraycopy(zc.a(paramzoj.a), 0, this.b, i, 2);
    i += 4;
    System.arraycopy(paramzoj.b.a(), 0, this.b, i, 16);
    i += 16;
    System.arraycopy(zc.a(paramzoj.c), 0, this.b, i, 4);
    System.arraycopy(zc.a(paramzoj.d), 0, this.b, i + 4, 4);
    System.arraycopy(zc.a(paramzoj.e), 0, this.b, i + 8, 4);
    System.arraycopy(zc.a(paramzoj.f), 0, this.b, i + 12, 4);
    i += 16;
    System.arraycopy(zc.a(paramzoj.h), 0, this.b, i, 2);
    i += 2;
    int j = 0;
    if (paramzoj.a()) {
      j |= 0x1;
    }
    if (paramzoj.b()) {
      j |= 0x2;
    }
    switch (paramzoj.c())
    {
    case 2: 
      break;
    case 1: 
      j |= 0x4;
      break;
    case 0: 
      j |= 0x8;
    }
    if (paramzoj.p()) {
      j |= 0x10;
    }
    if (paramzoj.d()) {
      j |= 0x20;
    }
    if (paramzoj.e()) {
      j |= 0x40;
    }
    if (paramzoj.o()) {
      j |= 0x80;
    }
    switch (paramzoj.f())
    {
    case 0: 
      break;
    case 2: 
      j |= 0x100;
      break;
    case 1: 
      j |= 0x200;
    }
    if (paramzoj.g()) {
      j |= 0x400;
    }
    if (paramzoj.h()) {
      j |= 0x800;
    }
    if (paramzoj.i()) {
      j |= 0x1000;
    }
    if (paramzoj.j()) {
      j |= 0x2000;
    }
    if (paramzoj.k()) {
      j |= 0x4000;
    }
    if (paramzoj.l()) {
      j |= 0x8000;
    }
    System.arraycopy(zc.a(j), 0, this.b, i, 2);
    i += 4;
    j = 0;
    if (paramzoj.m()) {
      j |= 0x1;
    }
    if (paramzoj.n()) {
      j |= 0x2;
    }
    System.arraycopy(zc.a(j), 0, this.b, i, 2);
    i += 2;
    System.arraycopy(zc.a(paramzoj.i), 0, this.b, i, 2);
    i += 2;
    zct.a(this.b, i, arrayOfByte, paramzoj.j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */