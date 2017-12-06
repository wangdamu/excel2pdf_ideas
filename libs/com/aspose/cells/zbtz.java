package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbtz
{
  int a = 0;
  int b = 1024;
  ArrayList c = new ArrayList();
  boolean d = false;
  boolean e = false;
  boolean f = false;
  boolean g = false;
  boolean h = false;
  boolean i = false;
  boolean j = false;
  boolean k = false;
  boolean l = false;
  boolean m = false;
  boolean n = false;
  boolean o = false;
  boolean p = false;
  boolean q = false;
  
  void a(zbtz paramzbtz)
  {
    this.a = paramzbtz.a;
    this.b = paramzbtz.b;
    this.d = paramzbtz.d;
    this.e = paramzbtz.e;
    this.f = paramzbtz.f;
    this.g = paramzbtz.g;
    this.h = paramzbtz.h;
    this.i = paramzbtz.i;
    this.j = paramzbtz.j;
    this.k = paramzbtz.k;
    this.l = paramzbtz.l;
    this.m = paramzbtz.m;
    this.n = paramzbtz.n;
    this.o = paramzbtz.o;
    this.p = paramzbtz.p;
    this.q = paramzbtz.q;
    for (int i1 = 0; i1 < paramzbtz.c.size(); i1++) {
      zf.a(this.c, paramzbtz.c.get(i1));
    }
  }
  
  private void d()
  {
    this.d = false;
    this.e = false;
    this.f = false;
    this.g = false;
    this.h = false;
    this.i = false;
    this.j = false;
    this.k = false;
    this.l = false;
    this.m = false;
    this.n = false;
    this.o = false;
    this.p = false;
    this.q = false;
  }
  
  int a()
  {
    int i1 = 0;
    if (this.d) {
      i1 |= 0x1;
    }
    if (this.e) {
      i1 |= 0x2;
    }
    if (this.f) {
      i1 |= 0x4;
    }
    if (this.g) {
      i1 |= 0x8;
    }
    if (this.h) {
      i1 |= 0x10;
    }
    if (this.i) {
      i1 |= 0x20;
    }
    if (this.j) {
      i1 |= 0x40;
    }
    if (this.k) {
      i1 |= 0x80;
    }
    if (this.l) {
      i1 |= 0x100;
    }
    if (this.m) {
      i1 |= 0x200;
    }
    if (this.n) {
      i1 |= 0x400;
    }
    if (this.o) {
      i1 |= 0x800;
    }
    if (this.p) {
      i1 |= 0x1000;
    }
    if (this.q) {
      i1 |= 0x4000;
    }
    return i1;
  }
  
  void a(int paramInt)
  {
    d();
    if ((paramInt & 0xFFFF & 0x1) > 0) {
      this.d = true;
    }
    if ((paramInt & 0xFFFF & 0x2) > 0) {
      this.e = true;
    }
    if ((paramInt & 0xFFFF & 0x4) > 0) {
      this.f = true;
    }
    if ((paramInt & 0xFFFF & 0x8) > 0) {
      this.g = true;
    }
    if ((paramInt & 0xFFFF & 0x10) > 0) {
      this.h = true;
    }
    if ((paramInt & 0xFFFF & 0x20) > 0) {
      this.i = true;
    }
    if ((paramInt & 0xFFFF & 0x40) > 0) {
      this.j = true;
    }
    if ((paramInt & 0xFFFF & 0x80) > 0) {
      this.k = true;
    }
    if ((paramInt & 0xFFFF & 0x100) > 0) {
      this.l = true;
    }
    if ((paramInt & 0xFFFF & 0x200) > 0) {
      this.m = true;
    }
    if ((paramInt & 0xFFFF & 0x400) > 0) {
      this.n = true;
    }
    if ((paramInt & 0xFFFF & 0x800) > 0) {
      this.o = true;
    }
    if ((paramInt & 0xFFFF & 0x1000) > 0) {
      this.p = true;
    }
    if ((paramInt & 0xFFFF & 0x4000) > 0) {
      this.q = true;
    }
  }
  
  int b()
  {
    int i1 = this.b & 0xFFFF & 0x3FF;
    if ((i1 & 0xFFFF) > 255)
    {
      int i2 = -2;
      return i2;
    }
    return i1;
  }
  
  void b(int paramInt)
  {
    this.b |= paramInt & 0xFFFF & 0x3FF;
  }
  
  void a(byte paramByte)
  {
    this.a |= paramByte;
  }
  
  void b(byte paramByte)
  {
    this.a |= (paramByte & 0xFF) << 6;
  }
  
  boolean c()
  {
    return (this.b & 0xFFFF & 0x400) > 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b |= 0x400;
    }
    else
    {
      int i1 = 64511;
      this.b &= i1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */