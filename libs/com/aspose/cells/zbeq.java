package com.aspose.cells;

class zbeq
{
  int a = 46;
  int b = 100000;
  int c;
  int d;
  int e;
  int f;
  byte g;
  
  void a(zbeq paramzbeq)
  {
    this.a = paramzbeq.a;
    this.c = paramzbeq.c;
    this.b = paramzbeq.b;
    this.d = paramzbeq.d;
    this.e = paramzbeq.e;
    this.f = paramzbeq.f;
    this.g = paramzbeq.g;
  }
  
  boolean b(zbeq paramzbeq)
  {
    if (this.a != paramzbeq.a) {
      return false;
    }
    if (this.c != paramzbeq.c) {
      return false;
    }
    if (this.b != paramzbeq.b) {
      return false;
    }
    if (this.d != paramzbeq.d) {
      return false;
    }
    if (this.e != paramzbeq.e) {
      return false;
    }
    if (this.f != (paramzbeq.g & 0xFF)) {
      return false;
    }
    return this.g == paramzbeq.g;
  }
  
  int a()
  {
    return this.a;
  }
  
  void a(int paramInt)
  {
    this.a = paramInt;
    i(1);
  }
  
  void b(int paramInt)
  {
    f();
    switch (paramInt)
    {
    }
    this.d = (this.e = this.f = this.c = 0);
  }
  
  void c(int paramInt)
  {
    this.b = paramInt;
    i(2);
  }
  
  int b()
  {
    return this.c;
  }
  
  void d(int paramInt)
  {
    this.c = paramInt;
    i(4);
  }
  
  int c()
  {
    return this.d;
  }
  
  void e(int paramInt)
  {
    this.d = paramInt;
    i(8);
  }
  
  int d()
  {
    return this.e;
  }
  
  void f(int paramInt)
  {
    this.e = paramInt;
    i(16);
  }
  
  int e()
  {
    return this.f;
  }
  
  void g(int paramInt)
  {
    this.f = paramInt;
    i(32);
  }
  
  boolean h(int paramInt)
  {
    return (this.g & 0xFF & paramInt) != 0;
  }
  
  void i(int paramInt)
  {
    this.g = ((byte)(this.g | (byte)paramInt));
  }
  
  void f()
  {
    this.g = 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */