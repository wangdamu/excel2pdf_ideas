package com.aspose.cells;

abstract class zazu
  extends zbai
{
  protected int a;
  protected int b;
  protected boolean c;
  protected boolean d;
  protected int e;
  protected int f;
  
  public zazu(zaiw paramzaiw, int paramInt)
  {
    super(paramzaiw);
    this.b = paramInt;
    this.c = this.k.n();
    this.a = paramzaiw.e();
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (this.c)
    {
      if (paramInt1 < this.a) {
        return this.k.a(paramInt1, 0);
      }
    }
    else if (paramInt2 < this.a) {
      return this.k.a(0, paramInt2);
    }
    return zabc.g;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return a(this.c ? paramInt1 : paramInt2);
  }
  
  public void f()
  {
    this.k.f();
    this.f = -1;
    this.d = true;
    this.e = -1;
  }
  
  public int c()
  {
    return this.c ? this.b : 1;
  }
  
  public int d()
  {
    return this.c ? 1 : this.b;
  }
  
  public int e()
  {
    return this.b;
  }
  
  public int i()
  {
    return this.c ? this.f : 0;
  }
  
  public int j()
  {
    return this.c ? 0 : this.f;
  }
  
  public int k()
  {
    return this.f;
  }
  
  public boolean l()
  {
    return false;
  }
  
  public boolean m()
  {
    return !this.c;
  }
  
  public boolean n()
  {
    return this.c;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.c) {
      return new zbak(a(paramInt, 0));
    }
    return this;
  }
  
  public zaiw c(int paramInt)
  {
    if (this.c) {
      return this;
    }
    return new zbak(a(0, paramInt));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */