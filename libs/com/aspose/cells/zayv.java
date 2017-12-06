package com.aspose.cells;

class zayv
  extends zayu
{
  private int f;
  private int g;
  private int h;
  private int i;
  private zgs j = new zgs();
  private zahb k;
  private zaja l;
  private boolean m = false;
  private int n = -1;
  private int o = -1;
  private int p = -1;
  private int q = -1;
  private zaiv r;
  private zt s;
  
  public zayv(zaca paramzaca, Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramzaca, paramCells.g());
    this.k = paramCells.getRows().a;
    this.f = paramInt1;
    this.h = paramInt2;
    this.g = paramInt3;
    this.i = paramInt4;
  }
  
  public zaiw b(zaca paramzaca)
  {
    zayv localzayv = new zayv(this.b, this.a.getCells(), this.f, this.h, this.g, this.i);
    localzayv.a(this);
    if (this.m)
    {
      localzayv.m = true;
      localzayv.n = this.n;
      localzayv.p = this.p;
      localzayv.o = this.o;
      localzayv.q = this.q;
    }
    return localzayv;
  }
  
  public int c()
  {
    return this.g - this.f + 1;
  }
  
  public int d()
  {
    return this.i - this.h + 1;
  }
  
  public int e()
  {
    return c() * d();
  }
  
  public boolean l()
  {
    return false;
  }
  
  public boolean m()
  {
    return false;
  }
  
  public boolean n()
  {
    return false;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if ((this.m) && ((paramInt1 < this.n) || (paramInt1 > this.o) || (paramInt2 < this.p) || (paramInt2 > this.q))) {
      return zabg.a;
    }
    this.j.a = ((short)(this.h + paramInt2));
    zgs localzgs = this.k.a(this.f + paramInt1, this.j, 4);
    if (localzgs == null) {
      return zabg.a;
    }
    return a(localzgs);
  }
  
  public void f()
  {
    if (this.l != null)
    {
      this.l.b();
    }
    else if (this.m)
    {
      if (this.o < 0) {
        return;
      }
      this.l = this.k.a(this.f + this.n, this.f + this.o, false);
    }
    else
    {
      this.l = this.k.a(this.f, this.g, false);
      if (this.l == null)
      {
        this.m = true;
        return;
      }
    }
    if (this.l.hasNext())
    {
      D();
      if (this.r != null) {
        return;
      }
      while (this.l.hasNext())
      {
        D();
        if (this.r != null) {
          return;
        }
      }
    }
    this.l = null;
    this.m = true;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (this.m)
    {
      if (paramInt1 > this.o) {
        return false;
      }
      if (paramInt1 < this.n)
      {
        paramInt1 = this.n;
        paramInt2 = this.p;
      }
      else if (paramInt2 > this.q)
      {
        paramInt1++;
        if (paramInt1 > this.o) {
          return false;
        }
        paramInt2 = this.p;
      }
      if (this.l == null) {
        this.l = this.k.a(this.f + this.n, this.f + this.o, false);
      }
    }
    else if (this.l == null)
    {
      this.l = this.k.a(this.f, this.g, false);
      if (this.l == null)
      {
        this.m = true;
        return false;
      }
    }
    if ((this.s == null) || (this.s.i() != paramInt1 + this.f))
    {
      this.l.a(paramInt1 + this.f);
      if (!this.l.hasNext()) {
        return false;
      }
      this.s = this.l.e();
      this.r = this.s.b(paramInt2 + this.h, this.m ? this.q + this.h : this.i, false);
    }
    if ((this.r != null) && (E())) {
      return true;
    }
    while (this.l.hasNext())
    {
      D();
      if ((this.r != null) && (E())) {
        return true;
      }
    }
    return false;
  }
  
  public boolean a(int paramInt)
  {
    int i1 = d();
    int i2 = paramInt % i1;
    int i3 = paramInt / i1;
    return b(i3, i2);
  }
  
  public boolean g()
  {
    if ((this.m) && (this.n < 0)) {
      return false;
    }
    if (E()) {
      return true;
    }
    while (this.l.hasNext())
    {
      D();
      if ((this.r != null) && (E())) {
        return true;
      }
    }
    return false;
  }
  
  private void D()
  {
    this.s = this.l.e();
    if (this.m) {
      this.r = this.s.b(this.p + this.h, this.q + this.h, false);
    } else {
      this.r = this.s.b(this.h, this.i, false);
    }
  }
  
  private boolean E()
  {
    int i1 = this.r.a();
    if (i1 < 0) {
      return false;
    }
    if (e(i1)) {
      return true;
    }
    do
    {
      i1 = this.r.a();
      if (i1 < 0) {
        return false;
      }
    } while (!e(i1));
    return true;
  }
  
  private boolean e(int paramInt)
  {
    if (this.s.h(paramInt) == 0) {
      return false;
    }
    this.c = this.s.a(paramInt, this.j, this.e);
    this.d = null;
    return true;
  }
  
  public int i()
  {
    return this.s.i() - this.f;
  }
  
  public int j()
  {
    return this.c.a - this.h;
  }
  
  public int k()
  {
    return (this.s.i() - this.f) * (this.i - this.h + 1) + (this.c.a - this.h);
  }
  
  public zaiw b(int paramInt)
  {
    paramInt += this.f;
    zt localzt = this.k.a(paramInt);
    if (localzt == null) {
      return new zazj(null, 9, 1, d());
    }
    return new zayy(this.b, this.a, localzt, this.h, this.i);
  }
  
  public zaiw c(int paramInt)
  {
    return new zayx(this.b, this.a, paramInt + this.h, this.f, this.g);
  }
  
  public boolean q()
  {
    return this.m;
  }
  
  public int r()
  {
    if (!this.m) {
      F();
    }
    return this.n;
  }
  
  public int s()
  {
    if (!this.m) {
      F();
    }
    return this.o;
  }
  
  public int t()
  {
    if (!this.m) {
      F();
    }
    return this.p;
  }
  
  public int u()
  {
    if (!this.m) {
      F();
    }
    return this.q;
  }
  
  public int v()
  {
    if (!this.m) {
      F();
    }
    return this.n * (this.i - this.h + 1) + this.p;
  }
  
  public int w()
  {
    if (!this.m) {
      F();
    }
    return this.o * (this.i - this.h + 1) + this.q;
  }
  
  private void F()
  {
    this.m = true;
    int[] arrayOfInt = { -1, -1 };
    zaja localzaja = this.k.a(this.f, this.g, false);
    zaiv localzaiv = null;
    this.p = (this.i + 1);
    while (localzaja.hasNext())
    {
      zt localzt = localzaja.e();
      if ((localzt.a() > 0) && (localzt.a(this.h, this.i, arrayOfInt)))
      {
        int i1;
        int i2;
        if (this.p > this.h)
        {
          localzaiv = localzt.a(this.h, arrayOfInt[0], this.i, arrayOfInt[1], false);
          do
          {
            i1 = localzaiv.a();
            if (i1 < 0) {
              break;
            }
          } while (localzt.h(i1) == 0);
          this.o = localzt.i();
          if (this.n < 0) {
            this.n = this.o;
          }
          i2 = localzt.a(i1);
          if (i2 < this.p) {
            this.p = i2;
          }
          if (this.q < this.i) {
            if (i1 < arrayOfInt[1])
            {
              localzaiv = localzt.a(i2, i1, this.i, arrayOfInt[1], true);
              do
              {
                i1 = localzaiv.a();
                i2 = localzt.a(i1);
                if (i2 < this.q) {
                  break;
                }
              } while (localzt.h(i1) == 0);
              this.q = i2;
            }
            else if (this.q < i2)
            {
              this.q = i2;
            }
          }
        }
        else if (this.q < this.i)
        {
          localzaiv = localzt.a(this.h, arrayOfInt[0], this.i, arrayOfInt[1], true);
          do
          {
            i1 = localzaiv.a();
            if (i1 < 0) {
              break;
            }
          } while (localzt.h(i1) == 0);
          this.o = localzt.i();
          i2 = localzt.a(i1);
          if (this.q < i2) {
            this.q = i2;
          }
        }
        else
        {
          localzaiv = localzt.a(this.h, arrayOfInt[0], this.i, arrayOfInt[1], false);
          do
          {
            i1 = localzaiv.a();
            if (i1 < 0) {
              break;
            }
          } while (localzt.h(i1) == 0);
          this.o = localzt.i();
          if (!localzaja.hasNext()) {
            break;
          }
          localzaja = this.k.a(this.o + 1, this.g, true);
          int i3 = 0;
          while (localzaja.hasNext())
          {
            localzt = localzaja.e();
            localzaiv = localzt.b(this.h, this.i, false);
            if (localzaiv != null)
            {
              do
              {
                i1 = localzaiv.a();
                if (i1 < 0) {
                  break;
                }
              } while (localzt.h(i1) == 0);
              this.o = localzt.i();
              i3 = 1;
            }
            if (i3 != 0) {
              break;
            }
          }
          break;
        }
      }
    }
    if (this.p > this.i)
    {
      this.p = -1;
    }
    else
    {
      this.p -= this.h;
      this.q -= this.h;
      this.n -= this.f;
      this.o -= this.f;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */