package com.aspose.cells;

class zazt
  extends zayp
{
  private zaiw[] a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private zaiw i;
  
  public zazt(zaiw[] paramArrayOfzaiw, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfzaiw;
    this.b = paramInt1;
    this.c = paramInt2;
    int j = -1;
    int k = -1;
    int m = Integer.MAX_VALUE;
    int n = -1;
    paramInt2--;
    for (int i2 = 0; i2 < paramArrayOfzaiw.length; i2++)
    {
      this.i = paramArrayOfzaiw[i2];
      if (this.i != null)
      {
        int i1 = this.i.s();
        if (i1 > -1)
        {
          k = i2 * paramInt1 + i1;
          if (j < 0) {
            j = i2 * paramInt1 + this.i.r();
          }
          if (m > 0) {
            m = Math.min(this.i.t(), m);
          }
          if (n < paramInt2) {
            n = Math.max(this.i.u(), n);
          }
        }
        else
        {
          paramArrayOfzaiw[i2] = null;
        }
      }
    }
    if (k < 0)
    {
      this.e = -1;
      this.d = -1;
      this.g = -1;
      this.f = -1;
    }
    else
    {
      this.e = k;
      this.d = j;
      this.g = n;
      this.f = m;
    }
    this.h = paramArrayOfzaiw.length;
  }
  
  zazt(zazt paramzazt, zaca paramzaca)
  {
    this.a = new zaiw[paramzazt.a.length];
    for (int j = 0; j < this.a.length; j++) {
      this.a[j] = paramzazt.a[j].b(paramzaca);
    }
    this.b = paramzazt.b;
    this.c = paramzazt.c;
    this.d = paramzazt.d;
    this.e = paramzazt.e;
    this.f = paramzazt.f;
    this.g = paramzazt.g;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazt(this, paramzaca);
  }
  
  public int c()
  {
    return this.b * this.a.length;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public int e()
  {
    return c() * this.c;
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
    return this.c < 2;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    zaiw localzaiw = this.a[(paramInt1 / this.b)];
    if (localzaiw == null) {
      return null;
    }
    return localzaiw.a(paramInt1 % this.b, paramInt2);
  }
  
  public int b()
  {
    return 9;
  }
  
  public void f()
  {
    if (this.e < 0) {
      return;
    }
    this.h = 0;
    this.i = this.a[this.h];
    if (this.i != null)
    {
      this.i.f();
      return;
    }
    do
    {
      this.h += 1;
      if (this.h == this.a.length) {
        break;
      }
      this.i = this.a[this.h];
    } while (this.i == null);
    this.i.f();
    return;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    this.h = (paramInt1 / this.b);
    this.i = this.a[this.h];
    if ((this.i != null) && (this.i.b(paramInt1 % this.b, paramInt2))) {
      return true;
    }
    return C();
  }
  
  public boolean a(int paramInt)
  {
    int j = paramInt % this.c;
    int k = paramInt / this.c;
    return b(k, j);
  }
  
  public boolean g()
  {
    if (this.h < this.a.length)
    {
      if (this.i.g()) {
        return true;
      }
      return C();
    }
    return false;
  }
  
  private boolean C()
  {
    do
    {
      do
      {
        this.h += 1;
        if (this.h == this.a.length) {
          return false;
        }
        this.i = this.a[this.h];
      } while (this.i == null);
      this.i.f();
    } while (!this.i.g());
    return true;
  }
  
  public zaie h()
  {
    return this.i.h();
  }
  
  public int i()
  {
    return this.b * this.h + this.i.i();
  }
  
  public int j()
  {
    return this.i.j();
  }
  
  public int k()
  {
    return (this.b * this.h + this.i.i()) * this.c + this.i.j();
  }
  
  public zaiw b(int paramInt)
  {
    zaiw localzaiw = this.a[(paramInt / this.b)];
    if (localzaiw == null) {
      return new zazj(null, 9, 1, this.c);
    }
    return localzaiw.b(paramInt % this.b);
  }
  
  public zaiw c(int paramInt)
  {
    zaiw[] arrayOfzaiw = new zaiw[this.a.length];
    for (int j = 0; j < arrayOfzaiw.length; j++) {
      if (this.a[j] != null) {
        arrayOfzaiw[j] = this.a[j].c(paramInt);
      }
    }
    return new zazt(arrayOfzaiw, this.b, 1);
  }
  
  public zaiw c(zaca paramzaca)
  {
    zaiw[] arrayOfzaiw = null;
    for (int j = 0; j < this.a.length; j++) {
      if (this.a[j] != null)
      {
        zaiw localzaiw = this.a[j].c(paramzaca);
        if (localzaiw != this.a[j])
        {
          arrayOfzaiw = new zaiw[this.a.length];
          System.arraycopy(this.a, 0, arrayOfzaiw, 0, j);
          arrayOfzaiw[j] = localzaiw;
          j++;
          while (j < this.a.length)
          {
            if (this.a[j] != null) {
              arrayOfzaiw[j] = this.a[j].c(paramzaca);
            }
            j++;
          }
          return new zazt(arrayOfzaiw, this.b, this.c);
        }
      }
    }
    return this;
  }
  
  public boolean a()
  {
    for (int j = 0; j < this.a.length; j++) {
      if ((this.a[j] != null) && (!this.a[j].a())) {
        return false;
      }
    }
    return true;
  }
  
  public void a(boolean paramBoolean)
  {
    for (int j = 0; j < this.a.length; j++) {
      if (this.a[j] != null) {
        this.a[j].a(paramBoolean);
      }
    }
  }
  
  public boolean x()
  {
    for (int j = 0; j < this.a.length; j++) {
      if ((this.a[j] != null) && (!this.a[j].x())) {
        return true;
      }
    }
    return false;
  }
  
  public boolean y()
  {
    for (int j = 0; j < this.a.length; j++) {
      if ((this.a[j] != null) && (!this.a[j].y())) {
        return true;
      }
    }
    return false;
  }
  
  public boolean q()
  {
    return true;
  }
  
  public int r()
  {
    return this.d;
  }
  
  public int s()
  {
    return this.e;
  }
  
  public int t()
  {
    return this.f;
  }
  
  public int u()
  {
    return this.g;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */