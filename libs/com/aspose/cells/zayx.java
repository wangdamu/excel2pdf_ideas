package com.aspose.cells;

import com.aspose.cells.a.c.zc;

class zayx
  extends zayu
{
  private int f;
  private int g;
  private zgs h = new zgs();
  private boolean i = false;
  private int j = -1;
  private int k = -1;
  private zahb l;
  private zaja m;
  private int n = -1;
  
  public zayx(zaca paramzaca, Worksheet paramWorksheet, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramzaca, paramWorksheet);
    this.l = paramWorksheet.getCells().getRows().a;
    this.h.a = ((short)paramInt1);
    this.f = paramInt2;
    this.g = paramInt3;
  }
  
  public zaiw b(zaca paramzaca)
  {
    zayx localzayx = new zayx(this.b, this.a, this.h.a, this.f, this.g);
    localzayx.a(this);
    localzayx.n = this.n;
    if (this.i)
    {
      localzayx.j = this.j;
      localzayx.k = this.k;
      if (this.k > -1) {
        this.m = this.l.a(this.f + this.j, this.f + this.k, false);
      }
    }
    return localzayx;
  }
  
  public int c()
  {
    return this.g - this.f + 1;
  }
  
  public int d()
  {
    return 1;
  }
  
  public int e()
  {
    return c();
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
    return true;
  }
  
  public zgs c(int paramInt1, int paramInt2)
  {
    if (this.i)
    {
      if ((paramInt1 < this.j) || (paramInt1 > this.k)) {
        return null;
      }
      if (this.j == this.k) {
        return this.c;
      }
    }
    return this.l.a(this.f + paramInt1, this.h, this.e);
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (this.i)
    {
      if ((paramInt1 < this.j) || (paramInt1 > this.k)) {
        return zabg.a;
      }
      if (this.j == this.k)
      {
        if (this.d != null) {
          return this.d;
        }
        this.d = C();
        return this.d;
      }
    }
    zgs localzgs = this.l.a(this.f + paramInt1, this.h, 4);
    if (localzgs == null) {
      return zabg.a;
    }
    return a(localzgs);
  }
  
  public void f()
  {
    if (this.m != null)
    {
      this.m.b();
      return;
    }
    if (this.i)
    {
      if (this.k == this.j)
      {
        this.n = -1;
        return;
      }
      if (this.k > -1) {
        this.m = this.l.a(this.f + this.j, this.f + this.k, false);
      }
    }
    else
    {
      this.m = this.l.a(this.f, this.g, false);
      if (this.m == null)
      {
        this.i = true;
        return;
      }
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return a(paramInt1);
  }
  
  public boolean a(int paramInt)
  {
    if (this.i)
    {
      if (paramInt > this.k) {
        return false;
      }
      if (this.j == this.k)
      {
        this.n = -1;
        return true;
      }
      if (paramInt < this.j) {
        paramInt = this.j;
      }
      if (this.m == null) {
        this.m = this.l.a(this.f + this.j, this.f + this.k, false);
      }
    }
    else if (this.m == null)
    {
      this.m = this.l.a(this.f, this.g, false);
      if (this.m == null)
      {
        this.i = true;
        return false;
      }
    }
    this.m.a(paramInt + this.f);
    return g();
  }
  
  public boolean g()
  {
    if (this.m == null)
    {
      if ((this.j == this.k) && (this.n < this.j))
      {
        this.n = this.j;
        return true;
      }
      return false;
    }
    while (this.m.hasNext())
    {
      zt localzt = this.m.e();
      int i1 = localzt.b(this.h.a);
      if ((i1 > -1) && (localzt.h(i1) != 0))
      {
        this.n = (localzt.i() - this.f);
        this.c = localzt.a(i1, this.h, this.e);
        this.d = null;
        return true;
      }
    }
    this.c = null;
    return false;
  }
  
  public int i()
  {
    return this.n;
  }
  
  public int j()
  {
    return 0;
  }
  
  public int k()
  {
    return this.n;
  }
  
  public zaiw b(int paramInt)
  {
    return new zayw(this.b, this.a, c(paramInt, 0));
  }
  
  public zaiw c(int paramInt)
  {
    return this;
  }
  
  public zaiw c(zaca paramzaca)
  {
    if (!this.i) {
      D();
    }
    if (this.k < 0) {
      return new zazj(zabg.a, 9, c(), 1);
    }
    zaie[] arrayOfzaie;
    if (this.j == this.k)
    {
      if (this.d == null) {
        this.d = C();
      }
      arrayOfzaie = new zaie[] { this.d };
    }
    else
    {
      arrayOfzaie = new zaie[this.k - this.j + 1];
      zc.a(arrayOfzaie, 0, arrayOfzaie.length, zabg.a);
      if (this.m == null) {
        this.m = this.l.a(this.f + this.j, this.f + this.k, false);
      } else {
        this.m.b();
      }
      while (this.m.hasNext())
      {
        zt localzt = this.m.e();
        if (localzt.a() >= 1)
        {
          int i1 = localzt.b(this.h.a);
          if (i1 >= 0) {
            if (localzt.h(i1) != 0)
            {
              zgs localzgs = localzt.a(i1, this.h, 4);
              arrayOfzaie[(localzt.i() - this.f - this.j)] = a(localzgs);
            }
          }
        }
      }
      if (this.n > -1) {
        this.m.a(this.n + 1);
      } else {
        this.m.b();
      }
    }
    return new zayq(arrayOfzaie, true, -this.j, c(), 9, zabg.a, -1, false);
  }
  
  public boolean q()
  {
    return this.i;
  }
  
  public int r()
  {
    if (!this.i) {
      D();
    }
    return this.j;
  }
  
  public int s()
  {
    if (!this.i) {
      D();
    }
    return this.k;
  }
  
  public int t()
  {
    if (!this.i) {
      D();
    }
    return this.j < 0 ? -1 : 0;
  }
  
  public int u()
  {
    if (!this.i) {
      D();
    }
    return this.j < 0 ? -1 : 0;
  }
  
  public int v()
  {
    if (!this.i) {
      D();
    }
    return this.j;
  }
  
  public int w()
  {
    if (!this.i) {
      D();
    }
    return this.k;
  }
  
  private void D()
  {
    this.i = true;
    zaja localzaja1 = this.l.a(this.f, this.g, false);
    while (localzaja1.hasNext())
    {
      zt localzt1 = localzaja1.e();
      if (localzt1.a() >= 1)
      {
        int i1 = localzt1.b(this.h.a);
        if ((i1 >= 0) && (localzt1.h(i1) != 0))
        {
          this.j = localzt1.i();
          if (localzaja1.hasNext())
          {
            zaja localzaja2 = this.l.a(this.j + 1, this.g, true);
            while (localzaja2.hasNext())
            {
              zt localzt2 = localzaja2.e();
              if (localzt2.a() >= 1)
              {
                int i2 = localzt2.b(this.h.a);
                if ((i2 >= 0) && (localzt2.h(i2) != 0))
                {
                  this.k = localzt2.i();
                  if ((this.j != this.f) || (this.k != this.g))
                  {
                    if (this.m == null)
                    {
                      this.m = this.l.a(this.j, this.k, false);
                      if (this.n > -1) {
                        this.m.a(this.n + 1);
                      }
                    }
                  }
                  else if (this.m == null)
                  {
                    this.m = localzaja1;
                    localzaja1.b();
                  }
                  this.j -= this.f;
                  this.k -= this.f;
                  return;
                }
              }
            }
          }
          this.j -= this.f;
          this.k = this.j;
          if (this.c == null) {
            this.c = localzt1.a(i1, this.h, 7);
          }
          this.m = null;
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */