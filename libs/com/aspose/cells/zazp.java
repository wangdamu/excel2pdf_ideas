package com.aspose.cells;

class zazp
  extends zaze
{
  private int c;
  private boolean d = false;
  
  zazp(zaiw paramzaiw, zaca paramzaca, int paramInt)
  {
    super(paramzaiw, paramzaca);
    this.c = paramInt;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazp(this.a.b(paramzaca), paramzaca, this.c);
  }
  
  public int b()
  {
    return this.a.b();
  }
  
  public int c()
  {
    return 1;
  }
  
  public int e()
  {
    return this.a.d();
  }
  
  public int i()
  {
    return 0;
  }
  
  public int k()
  {
    return this.a.j();
  }
  
  public int s()
  {
    return 0;
  }
  
  public int r()
  {
    return 0;
  }
  
  public int u()
  {
    return this.a.u();
  }
  
  public int t()
  {
    return this.a.t();
  }
  
  public int w()
  {
    return this.a.u();
  }
  
  public int v()
  {
    return this.a.t();
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    return this.a.a(this.c, paramInt2);
  }
  
  public boolean a(int paramInt)
  {
    if (this.a.b(this.c, paramInt)) {
      return this.a.i() == this.c;
    }
    return false;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return a(paramInt2);
  }
  
  public void f()
  {
    this.d = false;
    this.a.f();
  }
  
  public boolean g()
  {
    if (this.d)
    {
      if (this.a.g()) {
        return this.a.i() == this.c;
      }
      return false;
    }
    this.d = true;
    return (this.a.b(this.c, 0)) && (this.a.i() == this.c);
  }
  
  public zaie h()
  {
    return this.a.h();
  }
  
  public zaiw b(int paramInt)
  {
    return this;
  }
  
  public zaiw c(int paramInt)
  {
    return new zbak(this.a.a(this.c, paramInt), this.a.b());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */