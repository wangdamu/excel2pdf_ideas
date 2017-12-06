package com.aspose.cells;

class zazv
  extends zazu
{
  public zazv(zaiw paramzaiw, int paramInt)
  {
    super(paramzaiw, paramInt);
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazv(this.k.b(paramzaca), this.b);
  }
  
  public boolean a(int paramInt)
  {
    this.f = paramInt;
    if (paramInt < this.a)
    {
      if (this.k.a(paramInt))
      {
        this.d = true;
        this.e = this.k.k();
      }
      else
      {
        this.d = false;
      }
      return true;
    }
    return false;
  }
  
  public boolean g()
  {
    this.f += 1;
    if (this.f >= this.a) {
      return false;
    }
    if ((this.d) && (this.f > this.e)) {
      if (this.k.g()) {
        this.e = this.k.k();
      } else {
        this.d = false;
      }
    }
    return true;
  }
  
  public zaie h()
  {
    return (this.d) && (this.f == this.e) ? this.k.h() : this.k.o();
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
    return this.c ? this.a - 1 : 0;
  }
  
  public int t()
  {
    return 0;
  }
  
  public int u()
  {
    return this.c ? 0 : this.a - 1;
  }
  
  public int v()
  {
    return 0;
  }
  
  public int w()
  {
    return this.a - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */