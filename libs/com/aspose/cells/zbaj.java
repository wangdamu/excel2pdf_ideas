package com.aspose.cells;

class zbaj
  extends zayp
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private zwp h;
  private int i;
  private int j;
  private int k;
  
  public zbaj(zbap paramzbap)
  {
    this.h = paramzbap.a();
    if (this.h != null)
    {
      this.e = (this.h.b & 0xFFFF);
      this.f = (this.h.c & 0xFFFF);
      if (this.f > this.e) {
        this.h = new zwp(this.h.a & 0xFFFF, this.e & 0xFFFF, this.e & 0xFFFF);
      }
    }
    else
    {
      this.e = -1;
      this.f = -1;
    }
    this.a = paramzbap.b();
    this.b = paramzbap.f();
    this.c = paramzbap.d();
    this.d = paramzbap.h();
    this.g = (this.b - this.a + 1);
    f();
  }
  
  zbaj(zbaj paramzbaj)
  {
    this.a = paramzbaj.a;
    this.b = paramzbaj.b;
    this.c = paramzbaj.c;
    this.d = paramzbaj.d;
    this.e = paramzbaj.e;
    this.f = paramzbaj.f;
    this.g = paramzbaj.g;
    this.h = paramzbaj.h;
    this.i = paramzbaj.i;
    this.j = paramzbaj.j;
    this.k = paramzbaj.k;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zbaj(this);
  }
  
  public int c()
  {
    return this.g * (this.f - this.e + 1);
  }
  
  public int d()
  {
    return this.d - this.c + 1;
  }
  
  public boolean l()
  {
    return (this.a == this.b) && (this.c == this.d) && (this.f == this.e);
  }
  
  public boolean m()
  {
    return (this.g < 2) && (this.f == this.e);
  }
  
  public boolean n()
  {
    return this.c == this.d;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if ((this.g == 1) && (this.f == this.e)) {
      paramInt1 = 0;
    }
    if (this.c == this.d) {
      paramInt2 = 0;
    }
    zwp localzwp = this.h;
    if (this.e < this.f)
    {
      int m;
      if (paramInt1 < this.g)
      {
        m = this.e;
      }
      else
      {
        m = this.e + paramInt1 / this.g;
        paramInt1 %= this.g;
      }
      localzwp = new zwp(this.h.a & 0xFFFF, m & 0xFFFF, m & 0xFFFF);
    }
    return new zabo(64, new zbap(this.h, this.a + paramInt1, this.c + paramInt2, this.a + paramInt1, this.c + paramInt2));
  }
  
  public int b()
  {
    return 9;
  }
  
  public void f()
  {
    this.i = this.e;
    this.j = this.a;
    this.k = (this.c - 1);
    if (this.e < this.f) {
      this.h.b = (this.h.c = this.e);
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    this.i = (this.e + paramInt1 / this.g);
    this.j = (this.a + paramInt1 % this.g);
    this.k = (this.c + paramInt2);
    if (this.k > this.d)
    {
      this.j += 1;
      if (this.j > this.b)
      {
        this.i += 1;
        if (this.i > this.f) {
          return false;
        }
        this.j = this.a;
      }
      this.k = this.c;
    }
    return true;
  }
  
  public boolean a(int paramInt)
  {
    int m = d();
    int n = paramInt % m;
    int i1 = paramInt / m;
    return b(i1, n);
  }
  
  public boolean g()
  {
    if (this.i <= this.f)
    {
      if (this.j <= this.b)
      {
        if (this.k < this.d)
        {
          this.k += 1;
          return true;
        }
        this.j += 1;
        if (this.j <= this.b)
        {
          this.k = this.c;
          return true;
        }
      }
      this.i += 1;
      if (this.i <= this.f)
      {
        if (this.e < this.f) {
          this.h.b = (this.h.c = this.i);
        }
        this.j = this.a;
        this.k = this.c;
        return true;
      }
    }
    return false;
  }
  
  public zaie h()
  {
    return new zabo(64, new zbap(this.h, this.j, this.k, this.j, this.k));
  }
  
  public int i()
  {
    return this.j - this.a + this.g * (this.i - this.e);
  }
  
  public int j()
  {
    return this.k - this.c;
  }
  
  public int k()
  {
    return (this.j - this.a + this.g * (this.i - this.e)) * (this.d - this.c + 1) + this.k - this.c;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.a == this.b) {
      return this;
    }
    zwp localzwp;
    if (this.e < this.f)
    {
      m = this.e + paramInt / this.g;
      localzwp = new zwp(this.h.a & 0xFFFF, m & 0xFFFF, m & 0xFFFF);
      paramInt %= this.g;
    }
    else
    {
      localzwp = this.h;
    }
    int m = this.a + paramInt;
    return new zbaj(new zbap(localzwp, m, this.c, m, this.d));
  }
  
  public zaiw c(int paramInt)
  {
    if (this.c == this.d) {
      return this;
    }
    zwp localzwp;
    if (this.e < this.f) {
      localzwp = new zwp(this.h.a & 0xFFFF, this.e & 0xFFFF, this.f & 0xFFFF);
    } else {
      localzwp = this.h;
    }
    int m = this.c + paramInt;
    return new zbaj(new zbap(localzwp, this.a, m, this.b, m));
  }
  
  public boolean q()
  {
    return true;
  }
  
  public int r()
  {
    return 0;
  }
  
  public int t()
  {
    return 0;
  }
  
  public int s()
  {
    return c() - 1;
  }
  
  public int u()
  {
    return d() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */