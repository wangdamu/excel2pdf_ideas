package com.aspose.cells;

class zazo
  extends zaze
{
  private int c;
  private int d;
  private int e;
  
  zazo(zaiw paramzaiw, zaca paramzaca, int paramInt)
  {
    super(paramzaiw, paramzaca);
    this.c = paramInt;
    this.d = (this.a.c() - 1);
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazo(this.a.b(paramzaca), paramzaca, this.c);
  }
  
  public int b()
  {
    return this.a.b();
  }
  
  public int c()
  {
    return this.d + 1;
  }
  
  public int d()
  {
    return 1;
  }
  
  public int e()
  {
    return this.d + 1;
  }
  
  public int i()
  {
    return this.e;
  }
  
  public int j()
  {
    return 0;
  }
  
  public int k()
  {
    return this.e;
  }
  
  public int u()
  {
    return 0;
  }
  
  public int t()
  {
    return 0;
  }
  
  public int s()
  {
    return this.a.s();
  }
  
  public int r()
  {
    return this.a.r();
  }
  
  public int w()
  {
    return this.a.s();
  }
  
  public int v()
  {
    return this.a.r();
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    return this.a.a(paramInt1, this.c);
  }
  
  public boolean a(int paramInt)
  {
    if (paramInt == this.e) {
      return true;
    }
    this.e = (paramInt - 1);
    return g();
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return a(paramInt1);
  }
  
  public void f()
  {
    this.e = -1;
    this.a.f();
  }
  
  public boolean g()
  {
    if (this.e == this.d) {
      return false;
    }
    this.e += 1;
    if (this.a.b(this.e, this.c))
    {
      this.e = this.a.i();
      if (this.a.j() == this.c) {
        return true;
      }
      if (this.e == this.d) {
        return false;
      }
      do
      {
        if (this.a.j() > this.c) {
          this.e += 1;
        }
        if (!this.a.b(this.e, this.c)) {
          return false;
        }
        this.e = this.a.i();
        if (this.a.j() == this.c) {
          return true;
        }
      } while (this.e != this.d);
      return false;
    }
    return false;
  }
  
  public zaie h()
  {
    return this.a.h();
  }
  
  public zaiw b(int paramInt)
  {
    return new zbak(this.a.a(paramInt, this.c), this.a.b());
  }
  
  public zaiw c(int paramInt)
  {
    return this;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */