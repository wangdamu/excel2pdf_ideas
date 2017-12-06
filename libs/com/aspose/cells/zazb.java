package com.aspose.cells;

class zazb
  extends zayz
{
  private boolean j;
  private int k;
  private boolean l;
  private int m;
  private int n;
  
  public zazb(zaiw[] paramArrayOfzaiw, zaht paramzaht, zaca paramzaca)
  {
    super(paramArrayOfzaiw, paramzaht, paramzaca);
    this.j = this.b[0].n();
    this.k = this.b[0].e();
    this.l = false;
  }
  
  public zazb(zaiw[] paramArrayOfzaiw, zaht paramzaht, zaca paramzaca, zaie paramzaie)
  {
    super(paramArrayOfzaiw, paramzaht, paramzaca);
    this.d = paramzaie;
    this.j = this.b[0].n();
    this.k = this.b[0].e();
    this.l = false;
  }
  
  zazb(zazb paramzazb, zaca paramzaca)
  {
    super(paramzazb.e(paramzaca), (zaht)paramzazb.c.a(paramzaca), paramzaca);
    this.d = paramzazb.d;
    this.j = paramzazb.j;
    this.k = paramzazb.k;
    if (paramzazb.l)
    {
      this.l = true;
      this.m = paramzazb.m;
      this.n = paramzazb.n;
    }
    else
    {
      this.l = false;
    }
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazb(this, paramzaca);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return a(this.j ? paramInt1 : paramInt2);
  }
  
  public boolean a(int paramInt)
  {
    if ((this.g < this.b.length) && (paramInt == this.b[this.g].k())) {
      return true;
    }
    this.h = null;
    int i = this.k;
    this.g = 0;
    for (int i2 = 0; i2 < this.b.length; i2++)
    {
      zaiw localzaiw = this.b[i2];
      if (localzaiw.a(paramInt))
      {
        this.f[i2] = true;
        int i1 = localzaiw.k() - i;
        if (i1 > 0)
        {
          this.e[i2] = false;
        }
        else
        {
          this.e[i2] = true;
          if (i1 < 0)
          {
            i += i1;
            if (this.g < i2) {
              do
              {
                this.e[this.g] = false;
                this.g += 1;
              } while (this.g != i2);
            }
          }
        }
      }
      else
      {
        this.f[i2] = false;
        this.e[i2] = false;
        if (this.g == i2) {
          this.g += 1;
        }
      }
    }
    return this.g < this.b.length;
  }
  
  public boolean g()
  {
    zaiw localzaiw;
    if (this.i > -1)
    {
      localzaiw = this.b[this.i];
      if (this.f[this.i] != 0)
      {
        this.i = -1;
        return a(localzaiw.k());
      }
      this.i = -1;
      return false;
    }
    this.h = null;
    int i = this.k;
    this.g = 0;
    for (int i2 = 0; i2 < this.b.length; i2++)
    {
      localzaiw = this.b[i2];
      int i1;
      if (this.e[i2] != 0)
      {
        if (localzaiw.g())
        {
          i1 = localzaiw.k() - i;
          if (i1 > 0)
          {
            this.e[i2] = false;
          }
          else if (i1 < 0)
          {
            i += i1;
            if (this.g < i2) {
              do
              {
                this.e[this.g] = false;
                this.g += 1;
              } while (this.g != i2);
            }
          }
        }
        else
        {
          this.f[i2] = false;
          this.e[i2] = false;
          if (this.g == i2) {
            this.g += 1;
          }
        }
      }
      else if (this.f[i2] != 0)
      {
        i1 = localzaiw.k() - i;
        if (i1 == 0)
        {
          this.e[i2] = true;
        }
        else if (i1 < 0)
        {
          this.e[i2] = true;
          i += i1;
          if (this.g < i2) {
            do
            {
              this.e[this.g] = false;
              this.g += 1;
            } while (this.g != i2);
          }
        }
      }
      else if (this.g == i2)
      {
        this.g += 1;
      }
    }
    return this.g < this.b.length;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.j) {
      return new zbak(a(paramInt, 0));
    }
    return this;
  }
  
  public zaiw c(int paramInt)
  {
    if (this.j) {
      return this;
    }
    return new zbak(a(0, paramInt));
  }
  
  public zaiw c(zaca paramzaca)
  {
    if (!this.l) {
      C();
    }
    zbzb localzbzb = new zbzb(this, this.d, this.m, this.n, this.k, this.j);
    return new zazi(new zazb(this, paramzaca), localzbzb, paramzaca);
  }
  
  public boolean m()
  {
    return !this.j;
  }
  
  public boolean n()
  {
    return this.j;
  }
  
  public int c()
  {
    return this.j ? this.k : 1;
  }
  
  public int d()
  {
    return this.j ? 1 : this.k;
  }
  
  public int e()
  {
    return this.k;
  }
  
  public boolean q()
  {
    return this.l;
  }
  
  public int r()
  {
    if (!this.j) {
      return 0;
    }
    if (!this.l) {
      C();
    }
    return this.m;
  }
  
  public int s()
  {
    if (!this.j) {
      return 0;
    }
    if (!this.l) {
      C();
    }
    return this.n;
  }
  
  public int t()
  {
    if (this.j) {
      return 0;
    }
    if (!this.l) {
      C();
    }
    return this.m;
  }
  
  public int u()
  {
    if (this.j) {
      return 0;
    }
    if (!this.l) {
      C();
    }
    return this.n;
  }
  
  public int v()
  {
    return this.m;
  }
  
  public int w()
  {
    return this.n;
  }
  
  private void C()
  {
    this.l = true;
    zaiw localzaiw = this.b[0];
    this.m = localzaiw.v();
    this.n = localzaiw.w();
    for (int i = 1; i < this.b.length; i++)
    {
      localzaiw = this.b[i];
      if (this.m < 0)
      {
        this.m = localzaiw.v();
      }
      else
      {
        int i1 = localzaiw.v();
        if ((i1 > -1) && (i1 < this.m)) {
          this.m = i1;
        }
      }
      this.n = Math.max(this.n, localzaiw.w());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */