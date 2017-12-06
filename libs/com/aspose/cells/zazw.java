package com.aspose.cells;

class zazw
  extends zazu
{
  public zazw(zaiw paramzaiw, int paramInt)
  {
    super(paramzaiw, paramInt);
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazw(this.k.b(paramzaca), this.b);
  }
  
  public boolean a(int paramInt)
  {
    if (paramInt < this.a)
    {
      if (this.k.a(paramInt))
      {
        this.d = true;
        this.e = this.k.k();
        this.f = this.e;
      }
      else
      {
        this.d = false;
        this.f = this.a;
      }
    }
    else
    {
      this.d = false;
      this.f = paramInt;
    }
    return true;
  }
  
  public boolean g()
  {
    if (this.d)
    {
      if (this.k.g())
      {
        this.e = this.k.k();
        this.f = this.e;
      }
      else
      {
        this.d = false;
        this.f = this.a;
      }
      return true;
    }
    this.f += 1;
    return this.f < this.b;
  }
  
  public zaie h()
  {
    return this.f < this.a ? this.k.o() : (this.d) && (this.f == this.e) ? this.k.h() : zabc.g;
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
    return this.c ? this.k.r() : 0;
  }
  
  public int s()
  {
    return this.c ? this.b - 1 : 0;
  }
  
  public int t()
  {
    return this.c ? 0 : this.k.t();
  }
  
  public int u()
  {
    return this.c ? 0 : this.b - 1;
  }
  
  public int v()
  {
    return this.k.v();
  }
  
  public int w()
  {
    return this.b - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */