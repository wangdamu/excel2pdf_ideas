package com.aspose.cells;

class zaun
  extends zw
{
  int e;
  int f = 0;
  int g;
  int h;
  boolean i = true;
  int j = 100000;
  int k = 100000;
  
  zaun(ShadowEffect paramShadowEffect)
  {
    super(paramShadowEffect);
  }
  
  int a()
  {
    return 2;
  }
  
  void a(zw paramzw, CopyOptions paramCopyOptions)
  {
    zaun localzaun = (zaun)paramzw;
    super.a(localzaun, paramCopyOptions);
    this.e = localzaun.e;
    this.j = localzaun.j;
    this.g = localzaun.g;
    this.f = localzaun.f;
    this.k = localzaun.k;
    this.h = localzaun.h;
    this.i = localzaun.i;
  }
  
  boolean a(zw paramzw)
  {
    zaun localzaun = (zaun)paramzw;
    if (this.e != localzaun.e) {
      return false;
    }
    if (this.j != localzaun.j) {
      return false;
    }
    if (this.g != localzaun.g) {
      return false;
    }
    if (this.f != localzaun.f) {
      return false;
    }
    if (this.k != localzaun.k) {
      return false;
    }
    if (this.h != localzaun.h) {
      return false;
    }
    if (this.i != localzaun.i) {
      return false;
    }
    return super.a(paramzw);
  }
  
  public double e()
  {
    return zbxp.c(this.e);
  }
  
  public void c(double paramDouble)
  {
    this.e = zbxp.f(paramDouble);
  }
  
  public double f()
  {
    return zbxp.k(this.j);
  }
  
  public void d(double paramDouble)
  {
    this.j = zbxp.j(paramDouble);
    this.k = this.j;
  }
  
  int g()
  {
    return this.f;
  }
  
  void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  int h()
  {
    return this.g;
  }
  
  void b(int paramInt)
  {
    this.g = paramInt;
  }
  
  int i()
  {
    return this.h;
  }
  
  void c(int paramInt)
  {
    this.h = paramInt;
  }
  
  boolean j()
  {
    return this.i;
  }
  
  int k()
  {
    return this.j;
  }
  
  void d(int paramInt)
  {
    this.j = paramInt;
  }
  
  int l()
  {
    return this.k;
  }
  
  void e(int paramInt)
  {
    this.k = paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */