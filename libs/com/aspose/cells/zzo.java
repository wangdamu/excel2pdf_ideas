package com.aspose.cells;

class zzo
  implements zaid
{
  private boolean a = false;
  private boolean b = false;
  private boolean c = false;
  private boolean d = false;
  private double e = 0.0D;
  private boolean f = false;
  private boolean g = false;
  private boolean h = false;
  
  public boolean a()
  {
    return this.a;
  }
  
  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
    if (this.a) {
      this.b = false;
    }
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public void b(boolean paramBoolean)
  {
    this.b = paramBoolean;
    if (this.b) {
      this.a = false;
    }
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  public void c(boolean paramBoolean)
  {
    this.c = paramBoolean;
    if (this.c) {
      this.d = false;
    }
  }
  
  public boolean d()
  {
    return this.d;
  }
  
  public void d(boolean paramBoolean)
  {
    this.d = paramBoolean;
    if (this.d) {
      this.c = false;
    }
  }
  
  public double e()
  {
    if ((d()) && (this.e < 0.0D)) {
      return this.e;
    }
    if ((c()) && (this.e > 0.0D)) {
      return this.e;
    }
    return 0.0D;
  }
  
  public void a(double paramDouble)
  {
    this.e = paramDouble;
  }
  
  public boolean f()
  {
    return this.f;
  }
  
  public void e(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if (this.f) {
      this.g = false;
    }
  }
  
  public boolean g()
  {
    return this.g;
  }
  
  public void f(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (this.g) {
      this.f = false;
    }
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public void g(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  boolean i()
  {
    if (this.b) {
      return false;
    }
    if (((this.c) || (this.d)) && (this.e != 0.0D)) {
      return false;
    }
    if (this.f) {
      return false;
    }
    if (this.g) {
      return false;
    }
    return !this.h;
  }
  
  static void a(zaid paramzaid1, zaid paramzaid2)
  {
    paramzaid2.a(paramzaid1.a());
    paramzaid2.b(paramzaid1.b());
    paramzaid2.c(paramzaid1.c());
    paramzaid2.d(paramzaid1.d());
    paramzaid2.a(paramzaid1.e());
    paramzaid2.e(paramzaid1.f());
    paramzaid2.f(paramzaid1.g());
    paramzaid2.g(paramzaid1.h());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */