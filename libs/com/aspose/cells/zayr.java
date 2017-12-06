package com.aspose.cells;

class zayr
  extends zayo
{
  private zaie[][] g;
  private int h;
  private int[] i;
  private boolean j;
  private int k;
  private boolean l;
  private int m;
  private int n;
  private boolean o;
  private boolean p;
  private int q;
  private int r;
  private zaie s;
  private int t;
  private int u;
  
  public zayr(zaie[][] paramArrayOfzaie, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, zaie paramzaie, int paramInt5, int paramInt6, boolean paramBoolean1, boolean paramBoolean2, int paramInt7)
  {
    super(paramInt4, paramzaie, paramInt5, paramInt6, paramBoolean1, paramBoolean2);
    this.g = paramArrayOfzaie;
    this.h = paramInt3;
    this.l = (this.h < 2);
    this.i = paramArrayOfInt;
    this.j = (paramArrayOfInt != null);
    this.k = paramInt7;
    this.m = paramInt1;
    this.n = paramInt2;
    E();
  }
  
  zayr(zayr paramzayr)
  {
    super(paramzayr.b, paramzayr.a, paramzayr.e, paramzayr.f, paramzayr.c, paramzayr.d);
    this.g = paramzayr.g;
    this.h = paramzayr.h;
    this.i = paramzayr.i;
    this.j = paramzayr.j;
    this.k = paramzayr.k;
    this.l = paramzayr.l;
    this.m = paramzayr.m;
    this.n = paramzayr.n;
    this.o = paramzayr.o;
    this.p = paramzayr.p;
    this.q = paramzayr.q;
    this.r = paramzayr.r;
    this.s = paramzayr.s;
    this.t = paramzayr.t;
    this.u = paramzayr.u;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zayr(this);
  }
  
  public int c()
  {
    return this.h;
  }
  
  public int d()
  {
    return 1;
  }
  
  public int e()
  {
    return this.h;
  }
  
  public boolean l()
  {
    return this.l;
  }
  
  public boolean m()
  {
    return this.l;
  }
  
  public boolean n()
  {
    return true;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (this.l) {
      return this.s;
    }
    if (this.p) {
      return this.a;
    }
    paramInt1 += this.m;
    if ((paramInt1 >= this.q) && (paramInt1 <= this.r))
    {
      if (this.q == this.r) {
        return this.s;
      }
      zaie[] arrayOfzaie = this.g[paramInt1];
      if (arrayOfzaie != null)
      {
        paramInt2 += this.n;
        if ((this.j) && (paramInt1 < this.i.length)) {
          paramInt2 -= this.i[paramInt1];
        }
        if ((paramInt2 > -1) && (paramInt2 < arrayOfzaie.length)) {
          return arrayOfzaie[paramInt2];
        }
      }
    }
    return this.a;
  }
  
  public void f()
  {
    if ((this.l) || (this.p)) {
      return;
    }
    this.t = (this.q - 1);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if ((this.l) || (this.p)) {
      return false;
    }
    paramInt1 += this.m;
    if (paramInt1 <= this.q)
    {
      if (this.o)
      {
        this.t = this.q;
        return true;
      }
      if (this.t == this.q) {
        return true;
      }
      this.t = (this.q - 1);
    }
    else
    {
      if ((paramInt1 == this.t) && (this.t <= this.r)) {
        return true;
      }
      this.t = (paramInt1 - 1);
    }
    return g();
  }
  
  public boolean a(int paramInt)
  {
    return b(paramInt, 0);
  }
  
  public boolean g()
  {
    if ((this.l) || (this.p)) {
      return false;
    }
    this.t += 1;
    if (this.t <= this.r)
    {
      if (this.q == this.r) {
        return true;
      }
      zaie[] arrayOfzaie = this.g[this.t];
      if (arrayOfzaie != null)
      {
        if (this.j) {
          if (this.t < this.i.length) {
            this.u = (this.n - this.i[this.t]);
          } else {
            this.u = this.n;
          }
        }
        if ((this.u > -1) && (this.u < arrayOfzaie.length))
        {
          this.s = arrayOfzaie[this.u];
          if (!a(this.s, this.a)) {
            return true;
          }
        }
      }
      do
      {
        do
        {
          do
          {
            this.t += 1;
            if (this.t > this.r) {
              return false;
            }
            arrayOfzaie = this.g[this.t];
          } while (arrayOfzaie == null);
          if (this.j) {
            if (this.t < this.i.length) {
              this.u = (this.n - this.i[this.t]);
            } else {
              this.u = this.n;
            }
          }
        } while ((this.u <= -1) || (this.u >= arrayOfzaie.length));
        this.s = arrayOfzaie[this.u];
      } while (a(this.s, this.a));
      return true;
    }
    return false;
  }
  
  public zaie h()
  {
    if (this.s.b() == 13)
    {
      zabd localzabd = (zabd)this.s;
      if (localzabd.o().c() == 2)
      {
        this.s = localzabd.o().m();
        this.g[this.t][this.u] = this.s;
      }
    }
    return this.s;
  }
  
  public int i()
  {
    return this.t - this.m;
  }
  
  public int j()
  {
    return 0;
  }
  
  public int k()
  {
    return this.t - this.m;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.l) {
      return new zbak(this.s);
    }
    return new zbak(a(paramInt, 0));
  }
  
  public zaiw c(int paramInt)
  {
    return this;
  }
  
  public boolean a(zaie paramzaie)
  {
    return a(paramzaie, this.l ? this.s : this.a);
  }
  
  public void a(zaca paramzaca)
  {
    if ((this.c) && (paramzaca.d != this.e))
    {
      this.m += paramzaca.d - this.e;
      this.e = paramzaca.d;
      if ((this.d) && (paramzaca.e != this.f))
      {
        this.n += paramzaca.e - this.f;
        this.f = paramzaca.e;
      }
      E();
    }
    else if ((this.d) && (paramzaca.e != this.f))
    {
      this.n += paramzaca.e - this.f;
      this.f = paramzaca.e;
      E();
    }
  }
  
  public boolean q()
  {
    return this.o;
  }
  
  public int r()
  {
    if (!this.o) {
      C();
    }
    return this.p ? -1 : this.q - this.m;
  }
  
  public int s()
  {
    if (!this.o) {
      C();
    }
    return this.p ? -1 : this.r - this.m;
  }
  
  public int t()
  {
    if (!this.o) {
      C();
    }
    return this.p ? -1 : 0;
  }
  
  public int u()
  {
    if (!this.o) {
      C();
    }
    return this.p ? -1 : 0;
  }
  
  public int v()
  {
    if (!this.o) {
      C();
    }
    return this.p ? -1 : this.q - this.m;
  }
  
  public int w()
  {
    if (!this.o) {
      C();
    }
    return this.p ? -1 : this.r - this.m;
  }
  
  public boolean a(zaca paramzaca, int[] paramArrayOfInt)
  {
    if ((this.c) || (this.d))
    {
      int i1;
      int i2;
      if (this.c)
      {
        i1 = this.m + paramzaca.l.StartRow - this.e;
        i2 = paramzaca.l.f() + this.h - 1;
      }
      else
      {
        i1 = this.m;
        i2 = this.h;
      }
      int i3;
      int i4;
      if (this.d)
      {
        i3 = this.n + paramzaca.l.StartColumn - this.f;
        i4 = paramzaca.l.g();
      }
      else
      {
        i3 = this.n;
        i4 = 1;
      }
      return zays.a(this.g, i1, i3, this.i, i2, i4, this.a, paramArrayOfInt);
    }
    if (!this.o) {
      C();
    }
    if (this.p) {
      return false;
    }
    paramArrayOfInt[0] = (this.q - this.m);
    paramArrayOfInt[1] = 0;
    paramArrayOfInt[2] = (this.r - this.m);
    paramArrayOfInt[3] = 0;
    return true;
  }
  
  public boolean b(zaca paramzaca, int[] paramArrayOfInt)
  {
    if ((this.c) || (this.d))
    {
      int[] arrayOfInt = new int[4];
      int i1;
      int i2;
      if (this.c)
      {
        i1 = this.m + paramzaca.l.StartRow - this.e;
        i2 = paramzaca.l.f() + this.h - 1;
      }
      else
      {
        i1 = this.m;
        i2 = this.h;
      }
      int i3;
      int i4;
      if (this.d)
      {
        i3 = this.n + paramzaca.l.StartColumn - this.f;
        i4 = paramzaca.l.g();
      }
      else
      {
        i3 = this.n;
        i4 = 1;
      }
      if (zays.a(this.g, i1, i3, this.i, i2, i4, this.a, arrayOfInt))
      {
        paramArrayOfInt[0] = (arrayOfInt[0] * i4 + arrayOfInt[1]);
        paramArrayOfInt[1] = (arrayOfInt[2] * i4 + arrayOfInt[3]);
        return true;
      }
      return false;
    }
    if (!this.o) {
      C();
    }
    if (this.r < 0) {
      return false;
    }
    paramArrayOfInt[0] = (this.q - this.m);
    paramArrayOfInt[1] = (this.r - this.m);
    return true;
  }
  
  private void C()
  {
    this.o = true;
    int i1 = this.n;
    do
    {
      zaie[] arrayOfzaie = this.g[this.q];
      if (arrayOfzaie != null)
      {
        if (this.j) {
          if (this.q < this.i.length) {
            i1 = this.n - this.i[this.q];
          } else {
            i1 = this.n;
          }
        }
        if ((i1 > -1) && (i1 < arrayOfzaie.length) && (!a(arrayOfzaie[i1], this.a)))
        {
          if (this.r > this.q)
          {
            do
            {
              arrayOfzaie = this.g[this.r];
              if (arrayOfzaie != null)
              {
                if (this.j) {
                  if (this.r < this.i.length) {
                    i1 = this.n - this.i[this.r];
                  } else {
                    i1 = this.n;
                  }
                }
                if ((i1 > -1) && (i1 < arrayOfzaie.length) && (!a(arrayOfzaie[i1], this.a))) {
                  break;
                }
              }
              this.r -= 1;
            } while (this.r != this.q);
            if (this.j) {
              if (this.q < this.i.length) {
                i1 = this.n - this.i[this.q];
              } else {
                i1 = this.n;
              }
            }
            this.s = this.g[this.q][i1];
            break;
          }
          this.s = arrayOfzaie[i1];
          break;
        }
      }
      this.q += 1;
    } while (this.q <= this.r);
    D();
  }
  
  private void D()
  {
    this.p = true;
    this.q = -1;
    this.r = -1;
  }
  
  private void E()
  {
    this.t = (this.m - 1);
    this.u = this.n;
    this.o = false;
    this.p = false;
    if ((this.m >= this.g.length) || (this.n >= this.k) || (this.m <= -this.h) || (this.n < 0))
    {
      this.o = true;
      D();
    }
    else
    {
      if ((this.l) || (this.m == this.g.length - 1)) {
        this.t = this.m;
      } else if (this.m + this.h == 1) {
        this.t = 0;
      }
      if (this.t >= this.m)
      {
        this.o = true;
        if ((this.j) && (this.t < this.i.length)) {
          this.u -= this.i[this.t];
        }
        if ((this.u < 0) || (this.u >= this.g[this.t].length))
        {
          D();
        }
        else if (this.l)
        {
          D();
          this.s = this.g[this.t][this.u];
        }
        else
        {
          this.s = this.g[this.t][this.u];
          if (a(this.s, this.a))
          {
            D();
          }
          else
          {
            this.q = this.t;
            this.r = this.t;
          }
        }
      }
      else
      {
        this.o = false;
        this.q = Math.max(0, this.m);
        this.r = (Math.min(this.m + this.h, this.g.length) - 1);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */