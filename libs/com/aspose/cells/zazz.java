package com.aspose.cells;

class zazz
  extends zazy
{
  public zazz(zaiw paramzaiw, int paramInt1, int paramInt2)
  {
    super(paramzaiw, paramInt1, paramInt2);
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazz(this.k.b(paramzaca), this.c, this.d);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    this.i = paramInt1;
    this.j = paramInt2;
    if (paramInt1 >= this.a) {
      return false;
    }
    if (this.k.b(paramInt1, paramInt2))
    {
      this.g = true;
      this.e = this.k.i();
      this.f = this.k.j();
      this.h = ((this.e == this.i) && (this.f == this.j));
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
    if (this.j >= this.b)
    {
      this.i += 1;
      if (this.i >= this.a) {
        return false;
      }
      this.j = 0;
    }
    if (this.h)
    {
      if (this.k.g())
      {
        this.e = this.k.i();
        this.f = this.k.j();
        if ((this.f != this.j) || (this.e != this.i)) {
          this.h = false;
        }
      }
      else
      {
        this.g = false;
        this.h = false;
      }
    }
    else if ((this.g) && (this.f == this.j) && (this.e == this.i)) {
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
    return this.a - 1;
  }
  
  public int t()
  {
    return 0;
  }
  
  public int u()
  {
    return this.b - 1;
  }
  
  public int v()
  {
    return 0;
  }
  
  public int w()
  {
    return this.a * this.b - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */