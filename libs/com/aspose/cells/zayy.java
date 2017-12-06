package com.aspose.cells;

import com.aspose.cells.a.c.zc;

class zayy
  extends zayu
{
  private int f;
  private int g;
  private int h;
  private int i;
  private zt j;
  private zaiv k;
  private zgs l = new zgs();
  private int m = -1;
  
  public zayy(zaca paramzaca, Worksheet paramWorksheet, zt paramzt, int paramInt1, int paramInt2)
  {
    super(paramzaca, paramWorksheet);
    this.j = paramzt;
    this.f = paramInt1;
    this.g = paramInt2;
    int n = -1;
    int i1 = -1;
    zaiv localzaiv1 = null;
    int[] arrayOfInt = { -1, -1 };
    if (paramzt.a(this.f, this.g, arrayOfInt))
    {
      this.m = arrayOfInt[0];
      localzaiv1 = this.j.a(this.f, this.m, this.g, arrayOfInt[1], false);
      int i2 = 0;
      if (this.j.h(this.m) != 0)
      {
        this.c = this.j.a(this.m, this.l, 7);
        n = this.c.a;
      }
      else
      {
        i2 = 1;
        localzaiv1.a();
        do
        {
          this.m = localzaiv1.a();
          if (this.m < 0)
          {
            this.k = null;
            break;
          }
        } while (this.j.h(this.m) == 0);
        this.c = this.j.a(this.m, this.l, 7);
        n = this.c.a;
        arrayOfInt[0] = this.m;
      }
      if (n > -1) {
        if (arrayOfInt[1] > this.m)
        {
          if (this.j.h(arrayOfInt[1]) != 0)
          {
            i1 = this.j.a(arrayOfInt[1]);
          }
          else
          {
            i2 = 1;
            zaiv localzaiv2 = this.j.a(n, this.m, this.g, arrayOfInt[1], true);
            localzaiv2.a();
            do
            {
              this.m = localzaiv2.a();
            } while (this.j.h(this.m) == 0);
            i1 = this.j.a(this.m);
            arrayOfInt[1] = this.m;
            this.m = arrayOfInt[0];
          }
          if (i2 != 0) {
            if (n < i1) {
              localzaiv1 = this.j.a(n, this.m, i1, arrayOfInt[1], false);
            } else {
              localzaiv1 = null;
            }
          }
          n -= this.f;
          i1 -= this.f;
        }
        else
        {
          n -= this.f;
          i1 = n;
          localzaiv1 = null;
        }
      }
    }
    this.k = localzaiv1;
    this.h = n;
    this.i = i1;
  }
  
  private zayy(zaca paramzaca, Worksheet paramWorksheet, zt paramzt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramzaca, paramWorksheet);
    this.j = paramzt;
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramInt3;
    this.i = paramInt4;
    if (paramInt4 > -1) {
      this.k = this.j.b(paramInt1 + paramInt3, paramInt1 + paramInt4, false);
    }
  }
  
  public zaiw b(zaca paramzaca)
  {
    zayy localzayy = new zayy(this.b, this.a, this.j, this.f, this.g, this.h, this.i);
    localzayy.a(this);
    localzayy.m = this.m;
    return localzayy;
  }
  
  public int c()
  {
    return 1;
  }
  
  public int d()
  {
    return this.g - this.f + 1;
  }
  
  public int e()
  {
    return d();
  }
  
  public boolean l()
  {
    return false;
  }
  
  public boolean m()
  {
    return true;
  }
  
  public boolean n()
  {
    return false;
  }
  
  public zgs c(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < this.h) || (paramInt2 > this.i)) {
      return null;
    }
    if (this.h == this.i) {
      return this.c;
    }
    this.m = this.j.a(paramInt2 + this.f, this.m);
    if (this.m < 0)
    {
      this.m = (-this.m - 1);
      return null;
    }
    return this.j.a(this.m, this.l, this.e);
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < this.h) || (paramInt2 > this.i)) {
      return zabg.a;
    }
    if (this.h == this.i)
    {
      if (this.d != null) {
        return this.d;
      }
      this.d = C();
      return this.d;
    }
    this.m = this.j.a(paramInt2 + this.f, this.m);
    if (this.m < 0)
    {
      this.m = (-this.m - 1);
      return zabg.a;
    }
    return a(this.j.a(this.m, this.l, 4));
  }
  
  public void f()
  {
    if (this.i > this.h) {
      this.k.b();
    } else if (this.h > -1) {
      this.m = -1;
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return a(paramInt2);
  }
  
  public boolean a(int paramInt)
  {
    if (this.h < 0) {
      return false;
    }
    if (paramInt <= this.h)
    {
      if (this.h < this.i)
      {
        this.k.b();
        this.c = this.j.a(this.k.a(), this.l, this.e);
        this.d = null;
      }
      return true;
    }
    if (paramInt > this.i) {
      return false;
    }
    this.k.b(paramInt + this.f);
    return g();
  }
  
  public boolean g()
  {
    if (this.h < 0) {
      return false;
    }
    if (this.h == this.i)
    {
      if (this.m > -1) {
        return false;
      }
      this.m = 0;
      return true;
    }
    int n = this.k.a();
    if (n < 0) {
      return false;
    }
    if (this.j.h(n) != 0)
    {
      this.c = this.j.a(n, this.l, this.e);
      this.d = null;
      return true;
    }
    do
    {
      n = this.k.a();
      if (n < 0) {
        return false;
      }
    } while (this.j.h(n) == 0);
    this.c = this.j.a(n, this.l, this.e);
    this.d = null;
    return true;
  }
  
  public int i()
  {
    return 0;
  }
  
  public int j()
  {
    return this.c.a - this.f;
  }
  
  public int k()
  {
    return this.c.a - this.f;
  }
  
  public zaiw b(int paramInt)
  {
    return this;
  }
  
  public zaiw c(int paramInt)
  {
    return new zayw(this.b, this.a, c(0, paramInt));
  }
  
  public zaiw c(zaca paramzaca)
  {
    if (this.i < 0) {
      return new zazj(zabg.a, 9, 1, d());
    }
    zaie[] arrayOfzaie;
    if (this.i == this.h)
    {
      if (this.d == null) {
        this.d = C();
      }
      arrayOfzaie = new zaie[] { this.d };
    }
    else
    {
      arrayOfzaie = new zaie[this.i - this.h + 1];
      zc.a(arrayOfzaie, 0, arrayOfzaie.length, zabg.a);
      this.k.b();
      for (;;)
      {
        int n = this.k.a();
        if (n < 0) {
          break;
        }
        if (this.j.h(n) != 0)
        {
          zgs localzgs = this.j.a(n, this.l, 5);
          arrayOfzaie[(localzgs.a - this.f - this.h)] = a(localzgs);
        }
      }
      if (this.c != null) {
        this.k.b(this.c.a + 1);
      }
    }
    return new zayq(arrayOfzaie, false, -this.h, d(), 9, zabg.a, -1, false);
  }
  
  public boolean q()
  {
    return true;
  }
  
  public int r()
  {
    return this.h < 0 ? -1 : 0;
  }
  
  public int s()
  {
    return this.i < 0 ? -1 : 0;
  }
  
  public int t()
  {
    return this.h;
  }
  
  public int u()
  {
    return this.i;
  }
  
  public int w()
  {
    return this.i;
  }
  
  public int v()
  {
    return this.h;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */