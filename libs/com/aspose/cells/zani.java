package com.aspose.cells;

class zani
{
  private int b;
  private int c;
  private int d;
  private int e = 25;
  private int f = 5;
  byte a;
  
  int a()
  {
    return this.e;
  }
  
  void a(int paramInt)
  {
    this.e = paramInt;
    g(1);
  }
  
  int b()
  {
    return this.f;
  }
  
  void b(int paramInt)
  {
    this.f = paramInt;
    g(2);
  }
  
  int c()
  {
    return this.b;
  }
  
  void c(int paramInt)
  {
    this.b = paramInt;
    g(8);
  }
  
  int d()
  {
    return this.c;
  }
  
  void d(int paramInt)
  {
    this.c = paramInt;
    g(16);
  }
  
  int e()
  {
    return this.d;
  }
  
  void e(int paramInt)
  {
    this.d = paramInt;
    g(32);
  }
  
  void a(zani paramzani)
  {
    this.e = paramzani.e;
    this.f = paramzani.f;
    this.b = paramzani.b;
    this.c = paramzani.c;
    this.d = paramzani.d;
    this.a = paramzani.a;
  }
  
  boolean b(zani paramzani)
  {
    if (this.e != paramzani.e) {
      return false;
    }
    if (this.f != paramzani.f) {
      return false;
    }
    if (this.b != paramzani.b) {
      return false;
    }
    if (this.c != paramzani.c) {
      return false;
    }
    if (this.d != (paramzani.a & 0xFF)) {
      return false;
    }
    return this.a == paramzani.a;
  }
  
  boolean f(int paramInt)
  {
    return (this.a & 0xFF & paramInt) != 0;
  }
  
  void g(int paramInt)
  {
    this.a = ((byte)(this.a | (byte)paramInt));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zani.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */