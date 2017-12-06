package com.aspose.cells;

class zbaa
  extends zazy
{
  public zbaa(zaiw paramzaiw, int paramInt1, int paramInt2)
  {
    super(paramzaiw, paramInt1, paramInt2);
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zbaa(this.k.b(paramzaca), this.c, this.d);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (paramInt1 < this.a)
    {
      if (paramInt2 < this.b)
      {
        if (this.k.b(paramInt1, paramInt2))
        {
          this.g = true;
          this.e = this.k.i();
          this.f = this.k.j();
          if (this.e == paramInt1)
          {
            this.i = this.e;
            this.j = this.f;
            this.h = true;
          }
          else
          {
            this.i = paramInt1;
            this.j = this.b;
            this.h = false;
          }
        }
        else
        {
          this.g = false;
          this.h = false;
          this.i = paramInt1;
          this.j = this.b;
        }
      }
      else
      {
        this.h = false;
        this.i = paramInt1;
        this.j = paramInt2;
        paramInt1++;
        if (paramInt1 < this.a)
        {
          if (this.k.b(paramInt1, 0))
          {
            this.g = true;
            this.e = this.k.i();
            this.f = this.k.j();
          }
          else
          {
            this.g = false;
          }
        }
        else {
          this.g = false;
        }
      }
    }
    else
    {
      this.h = false;
      this.i = paramInt1;
      this.j = paramInt2;
      this.g = false;
    }
    return true;
  }
  
  public boolean g()
  {
    if (this.h)
    {
      if (this.k.g())
      {
        this.e = this.k.i();
        this.f = this.k.j();
        if (this.e == this.i)
        {
          this.j = this.k.j();
        }
        else
        {
          this.h = false;
          this.j = this.b;
        }
      }
      else
      {
        this.g = false;
        this.h = false;
        this.j = this.b;
      }
    }
    else
    {
      this.j += 1;
      if (this.j >= this.d)
      {
        this.i += 1;
        if (this.i >= this.c) {
          return false;
        }
        if ((this.g) && (this.i == this.e))
        {
          this.j = this.f;
          this.h = true;
        }
        else
        {
          this.j = this.b;
        }
      }
    }
    return true;
  }
  
  public zaie h()
  {
    return this.h ? this.k.h() : zabc.g;
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
    return 0;
  }
  
  public int s()
  {
    return this.c - 1;
  }
  
  public int t()
  {
    int i = this.k.t();
    if (i < 0) {
      return this.b;
    }
    return i;
  }
  
  public int u()
  {
    return this.d - 1;
  }
  
  public int v()
  {
    int i = this.k.v();
    if (i < 0) {
      return this.b;
    }
    return i;
  }
  
  public int w()
  {
    return this.c * this.d - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */