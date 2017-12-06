package com.aspose.cells;

class zazc
  extends zayz
{
  private int j;
  private int k;
  private boolean l;
  private int m;
  private int n;
  private int o;
  private int p;
  
  public zazc(zaiw[] paramArrayOfzaiw, zaht paramzaht, zaca paramzaca)
  {
    super(paramArrayOfzaiw, paramzaht, paramzaca);
    this.j = paramArrayOfzaiw[0].c();
    this.k = paramArrayOfzaiw[0].d();
    this.l = false;
  }
  
  private zazc(zazc paramzazc, zaca paramzaca)
  {
    super(paramzazc.e(paramzaca), (zaht)paramzazc.c.a(paramzaca), paramzaca);
    this.d = paramzazc.d;
    this.j = paramzazc.j;
    this.k = paramzazc.k;
    if (paramzazc.l)
    {
      this.l = true;
      this.m = paramzazc.m;
      this.o = paramzazc.o;
      this.n = paramzazc.n;
      this.p = paramzazc.p;
    }
    else
    {
      this.l = false;
    }
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazc(this, paramzaca);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    zaiw localzaiw;
    if (this.g < this.b.length)
    {
      localzaiw = this.b[this.g];
      if ((paramInt1 == localzaiw.i()) && (paramInt2 == localzaiw.j())) {
        return true;
      }
    }
    this.h = null;
    int i = this.j;
    int i1 = this.k;
    this.g = 0;
    for (int i3 = 0; i3 < this.b.length; i3++)
    {
      localzaiw = this.b[i3];
      if (localzaiw.b(paramInt1, paramInt2))
      {
        this.f[i3] = true;
        int i2 = localzaiw.i() - i;
        if (i2 == 0) {
          i2 = localzaiw.j() - i1;
        }
        if (i2 > 0)
        {
          this.e[i3] = false;
        }
        else
        {
          this.e[i3] = true;
          if ((i2 < 0) && (this.g < i3)) {
            do
            {
              this.e[this.g] = false;
              this.g += 1;
            } while (this.g != i3);
          }
        }
      }
      else
      {
        this.f[i3] = false;
        this.e[i3] = false;
        if (this.g == i3) {
          this.g += 1;
        }
      }
    }
    return this.g < this.b.length;
  }
  
  public boolean a(int paramInt)
  {
    return b(paramInt / this.k, paramInt % this.k);
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
        return b(localzaiw.i(), localzaiw.j());
      }
      this.i = -1;
      return false;
    }
    this.h = null;
    int i = this.j;
    int i1 = this.k;
    this.g = 0;
    for (int i3 = 0; i3 < this.b.length; i3++)
    {
      localzaiw = this.b[i3];
      int i2;
      if (this.e[i3] != 0)
      {
        if (localzaiw.g())
        {
          i2 = localzaiw.i() - i;
          if (i2 == 0) {
            i2 = localzaiw.j() - i1;
          }
          if (i2 > 0) {
            this.e[i3] = false;
          } else if ((i2 < 0) && (this.g < i3)) {
            do
            {
              this.e[this.g] = false;
              this.g += 1;
            } while (this.g != i3);
          }
        }
        else
        {
          this.f[i3] = false;
          this.e[i3] = false;
        }
      }
      else
      {
        i2 = localzaiw.i() - i;
        if (i2 == 0) {
          i2 = localzaiw.j() - i1;
        }
        if (i2 == 0)
        {
          this.e[i3] = true;
        }
        else if ((i2 < 0) && (this.g < i3))
        {
          this.e[i3] = true;
          for (;;)
          {
            this.e[this.g] = false;
            this.g += 1;
            if (this.g == i3) {
              break;
            }
          }
        }
      }
    }
    return this.g < this.b.length;
  }
  
  public zaiw b(int paramInt)
  {
    zaiw[] arrayOfzaiw = new zaiw[this.b.length];
    for (int i = 0; i < this.b.length; i++) {
      arrayOfzaiw[i] = this.b[i].b(paramInt);
    }
    return new zazb(arrayOfzaiw, this.c, this.a, this.d);
  }
  
  public zaiw c(int paramInt)
  {
    zaiw[] arrayOfzaiw = new zaiw[this.b.length];
    for (int i = 0; i < this.b.length; i++) {
      arrayOfzaiw[i] = this.b[i].c(paramInt);
    }
    return new zazb(arrayOfzaiw, this.c, this.a, this.d);
  }
  
  public zaiw c(zaca paramzaca)
  {
    if (!this.l) {
      C();
    }
    zbzd localzbzd = new zbzd(this, this.d, this.m, this.o, this.n, this.p, this.j, this.k);
    return new zazi(new zazc(this, paramzaca), localzbzd, paramzaca);
  }
  
  public boolean m()
  {
    return false;
  }
  
  public boolean n()
  {
    return false;
  }
  
  public int c()
  {
    return this.j;
  }
  
  public int d()
  {
    return this.k;
  }
  
  public int e()
  {
    return this.j * this.k;
  }
  
  public boolean q()
  {
    return this.l;
  }
  
  public int r()
  {
    if (!this.l) {
      C();
    }
    return this.m;
  }
  
  public int s()
  {
    if (!this.l) {
      C();
    }
    return this.n;
  }
  
  public int t()
  {
    if (!this.l) {
      C();
    }
    return this.o;
  }
  
  public int u()
  {
    if (!this.l) {
      C();
    }
    return this.p;
  }
  
  private void C()
  {
    this.l = true;
    zaiw localzaiw = this.b[0];
    this.m = localzaiw.r();
    this.o = localzaiw.t();
    this.n = localzaiw.s();
    this.p = localzaiw.u();
    for (int i = 1; i < this.b.length; i++)
    {
      localzaiw = this.b[i];
      int i1;
      if (this.m < 0)
      {
        this.m = localzaiw.r();
      }
      else
      {
        i1 = localzaiw.r();
        if ((i1 > -1) && (i1 < this.m)) {
          this.m = i1;
        }
      }
      if (this.o < 0)
      {
        this.o = localzaiw.t();
      }
      else
      {
        i1 = localzaiw.t();
        if ((i1 > -1) && (i1 < this.o)) {
          this.o = i1;
        }
      }
      this.n = Math.max(this.n, localzaiw.s());
      this.p = Math.max(this.p, localzaiw.u());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */