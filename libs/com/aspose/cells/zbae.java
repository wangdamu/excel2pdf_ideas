package com.aspose.cells;

class zbae
  extends zbac
{
  public zbae(zaiw paramzaiw, int paramInt)
  {
    super(paramzaiw, paramInt);
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zbae(this.k.b(paramzaca), this.a);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (paramInt2 < this.b)
    {
      if (this.k.b(paramInt1, paramInt2))
      {
        this.g = true;
        this.d = this.k.i();
        this.e = this.k.j();
        if (this.d == paramInt1)
        {
          this.i = this.d;
          this.j = this.e;
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
      this.i = paramInt1;
      this.j = paramInt2;
      this.h = false;
      paramInt1++;
      if ((paramInt1 < this.c) && (this.k.b(paramInt1, 0)))
      {
        this.g = true;
        this.d = this.k.i();
        this.e = this.k.j();
      }
      else
      {
        this.g = false;
      }
    }
    return true;
  }
  
  public boolean g()
  {
    if (this.h)
    {
      if (this.k.g())
      {
        this.d = this.k.i();
        this.e = this.k.j();
        if (this.d == this.i)
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
      if (this.j >= this.a)
      {
        this.i += 1;
        if (this.i >= this.c) {
          return false;
        }
        if ((this.g) && (this.i == this.d))
        {
          this.j = this.e;
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
    return this.a - 1;
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
    return this.a * this.c - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */