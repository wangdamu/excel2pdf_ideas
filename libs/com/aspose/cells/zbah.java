package com.aspose.cells;

class zbah
  extends zbaf
{
  public zbah(zaiw paramzaiw, int paramInt)
  {
    super(paramzaiw, paramInt);
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zbah(this.k.b(paramzaca), this.a);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (paramInt1 < this.b)
    {
      if (this.k.b(paramInt1, paramInt2))
      {
        this.g = true;
        this.i = this.k.i();
        this.j = this.k.j();
      }
      else
      {
        this.g = false;
        this.i = this.b;
        this.j = 0;
      }
    }
    else
    {
      this.i = paramInt1;
      this.j = paramInt2;
      this.g = false;
    }
    return true;
  }
  
  public boolean g()
  {
    if (this.g)
    {
      if (this.k.g())
      {
        this.i = this.k.i();
        this.j = this.k.j();
      }
      else
      {
        this.g = false;
        this.i = this.b;
        this.j = 0;
      }
    }
    else
    {
      this.j += 1;
      if (this.j >= this.c)
      {
        this.i += 1;
        if (this.i >= this.a) {
          return false;
        }
        this.j = 0;
      }
    }
    return true;
  }
  
  public zaie h()
  {
    return this.g ? this.k.h() : zabc.g;
  }
  
  public zaie o()
  {
    return this.k.o();
  }
  
  public zaie p()
  {
    return this.k.p();
  }
  
  public boolean q()
  {
    return this.k.q();
  }
  
  public int r()
  {
    int i = this.k.r();
    if (i < 0) {
      return this.b;
    }
    return i;
  }
  
  public int s()
  {
    return this.a - 1;
  }
  
  public int t()
  {
    return 0;
  }
  
  public int u()
  {
    return this.c - 1;
  }
  
  public int v()
  {
    int i = this.k.v();
    if (i < 0) {
      return this.b * this.c;
    }
    return i;
  }
  
  public int w()
  {
    return this.a * this.c - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */