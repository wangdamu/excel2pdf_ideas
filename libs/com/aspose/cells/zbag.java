package com.aspose.cells;

class zbag
  extends zbaf
{
  private int d;
  private int e;
  
  public zbag(zaiw paramzaiw, int paramInt)
  {
    super(paramzaiw, paramInt);
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zbag(this.k.b(paramzaca), this.a);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    this.i = paramInt1;
    this.j = paramInt2;
    if (paramInt1 >= this.b) {
      return false;
    }
    if (this.k.b(paramInt1, paramInt2))
    {
      this.g = true;
      this.d = this.k.i();
      this.e = this.k.j();
      this.h = ((this.d == this.i) && (this.e == this.j));
    }
    else
    {
      this.g = false;
      this.h = false;
    }
    return true;
  }
  
  public boolean g()
  {
    this.j += 1;
    if (this.j >= this.c)
    {
      this.i += 1;
      if (this.i >= this.b) {
        return false;
      }
      this.j = 0;
    }
    if (this.h)
    {
      if (this.k.g())
      {
        this.d = this.k.i();
        this.e = this.k.j();
        if ((this.e != this.j) || (this.d != this.i)) {
          this.h = false;
        }
      }
      else
      {
        this.g = false;
        this.h = false;
      }
    }
    else if ((this.g) && (this.e == this.j) && (this.d == this.i)) {
      this.h = true;
    }
    return true;
  }
  
  public zaie h()
  {
    return this.h ? this.k.h() : this.k.o();
  }
  
  public zaie o()
  {
    return zabc.g;
  }
  
  public zaie p()
  {
    return zabc.g;
  }
  
  public boolean q()
  {
    return true;
  }
  
  public int r()
  {
    return 0;
  }
  
  public int s()
  {
    return this.b - 1;
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
    return 0;
  }
  
  public int w()
  {
    return this.b * this.c - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */