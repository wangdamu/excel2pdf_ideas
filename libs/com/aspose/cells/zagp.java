package com.aspose.cells;

import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zb;

class zagp
{
  int a;
  int b;
  int c;
  int d;
  int e;
  int f;
  long g;
  long h;
  long i;
  int j;
  long k;
  int l;
  
  zagp()
  {
    this.a = 33;
    this.b = 3;
    this.c = 9;
    this.d = 6;
    this.h = 4096L;
  }
  
  zagp(za paramza)
    throws Exception
  {
    long l1 = paramza.s();
    if (l1 != -2226271756974174256L) {
      throw new IllegalStateException("This is not a structured storage file.");
    }
    paramza.f(16);
    this.a = paramza.p();
    this.b = paramza.p();
    if ((this.b & 0xFFFF) > 3) {
      throw new UnsupportedOperationException("This structured storage version is not supported.");
    }
    paramza.p();
    this.c = paramza.p();
    this.d = paramza.p();
    paramza.p();
    paramza.r();
    this.e = paramza.q();
    this.f = paramza.q();
    this.g = paramza.r();
    paramza.r();
    this.h = paramza.r();
    this.i = paramza.r();
    this.j = paramza.q();
    this.k = paramza.r();
    this.l = paramza.q();
  }
  
  void a(zb paramzb)
    throws Exception
  {
    paramzb.b(-2226271756974174256L);
    paramzb.a(new byte[16]);
    paramzb.a(this.a & 0xFFFF);
    paramzb.a(this.b & 0xFFFF);
    paramzb.a(65534);
    paramzb.a(this.c & 0xFFFF);
    paramzb.a(this.d & 0xFFFF);
    paramzb.a((short)0);
    paramzb.b(0);
    paramzb.b(this.e);
    paramzb.b(this.f);
    paramzb.a(this.g & 0xFFFFFFFF);
    paramzb.b(0);
    paramzb.a(this.h & 0xFFFFFFFF);
    paramzb.a(this.i & 0xFFFFFFFF);
    paramzb.b(this.j);
    paramzb.a(this.k & 0xFFFFFFFF);
    paramzb.b(this.l);
  }
  
  boolean a(long paramLong)
  {
    return paramLong >= (this.h & 0xFFFFFFFF);
  }
  
  int a()
  {
    return this.j * 512;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */