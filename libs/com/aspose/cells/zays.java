package com.aspose.cells;

class zays
  extends zayo
{
  private zaie[][] g;
  private int h;
  private int i;
  private int[] j;
  private int k;
  private boolean l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private boolean s;
  private boolean t;
  private int u;
  private int v;
  private zaie[] w;
  private zaie x;
  private int y;
  private int z;
  private int A;
  
  public zays(zaie[][] paramArrayOfzaie)
  {
    this(paramArrayOfzaie, 0, 0, null, paramArrayOfzaie.length, paramArrayOfzaie[0].length, 6, zabg.a, 0, 0, false, false, paramArrayOfzaie[0].length);
  }
  
  public zays(zaie[][] paramArrayOfzaie, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, zaie paramzaie, int paramInt6, int paramInt7, boolean paramBoolean1, boolean paramBoolean2, int paramInt8)
  {
    super(paramInt5, paramzaie, paramInt6, paramInt7, paramBoolean1, paramBoolean2);
    this.g = paramArrayOfzaie;
    this.h = paramInt3;
    this.i = paramInt4;
    this.j = paramArrayOfInt;
    this.k = paramInt8;
    this.l = ((paramInt3 < 2) && (paramInt4 < 2));
    this.m = paramInt1;
    this.n = paramInt2;
    H();
  }
  
  zays(zays paramzays)
  {
    super(paramzays.b, paramzays.a, paramzays.e, paramzays.f, paramzays.c, paramzays.d);
    this.g = paramzays.g;
    this.h = paramzays.h;
    this.i = paramzays.i;
    this.j = paramzays.j;
    this.k = paramzays.k;
    this.l = paramzays.l;
    this.m = paramzays.m;
    this.n = paramzays.n;
    this.o = paramzays.o;
    this.p = paramzays.p;
    this.q = paramzays.q;
    this.r = paramzays.r;
    this.s = paramzays.s;
    this.t = paramzays.t;
    this.u = paramzays.u;
    this.v = paramzays.v;
    this.w = paramzays.w;
    this.x = paramzays.x;
    this.y = paramzays.y;
    this.z = paramzays.z;
    this.A = paramzays.A;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zays(this);
  }
  
  public int c()
  {
    return this.h;
  }
  
  public int d()
  {
    return this.i;
  }
  
  public int e()
  {
    return this.i < 2 ? this.h : this.h < 2 ? this.i : this.l ? 1 : this.h * this.i;
  }
  
  public boolean l()
  {
    return this.l;
  }
  
  public boolean m()
  {
    return (this.l) || (this.h < 2);
  }
  
  public boolean n()
  {
    return (this.l) || (this.i < 2);
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (this.l) {
      return this.x;
    }
    if (this.t) {
      return this.a;
    }
    paramInt1 += this.m;
    if ((paramInt1 < this.o) || (paramInt1 > this.p)) {
      return this.a;
    }
    zaie[] arrayOfzaie = this.g[paramInt1];
    if (arrayOfzaie != null)
    {
      if (this.i == 1) {
        paramInt2 = this.n;
      } else {
        paramInt2 += this.n;
      }
      if ((this.j != null) && (paramInt1 < this.j.length)) {
        paramInt2 -= this.j[paramInt1];
      }
      if ((paramInt2 >= 0) && (paramInt2 < arrayOfzaie.length)) {
        return arrayOfzaie[paramInt2];
      }
    }
    return this.a;
  }
  
  public void f()
  {
    if ((this.l) || (this.t)) {
      return;
    }
    if (this.p == this.o)
    {
      this.v = (this.y - 1);
    }
    else
    {
      this.u = (this.o - 1);
      if (D())
      {
        this.v -= 1;
      }
      else
      {
        this.s = true;
        G();
      }
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if ((this.l) || (this.t)) {
      return false;
    }
    paramInt1 += this.m;
    if (paramInt1 > this.p) {
      return false;
    }
    if (paramInt1 < this.o)
    {
      paramInt1 = this.o;
      paramInt2 = 0;
    }
    if (this.u != paramInt1)
    {
      this.u = paramInt1;
      if (!C()) {
        return D();
      }
    }
    paramInt2 += this.A;
    if ((paramInt2 == this.v) && (this.v < this.z)) {
      return true;
    }
    this.v = (Math.max(paramInt2, this.y) - 1);
    return g();
  }
  
  public boolean a(int paramInt)
  {
    if ((this.l) || (this.t)) {
      return false;
    }
    if (this.h < 2)
    {
      paramInt += this.A;
      if ((paramInt == this.v) && (this.v < this.z)) {
        return true;
      }
      this.v = (Math.max(paramInt, this.y) - 1);
      return g();
    }
    if (this.i < 2) {
      return b(paramInt, 0);
    }
    return b(paramInt % this.i, paramInt / this.i);
  }
  
  public boolean g()
  {
    if ((this.l) || (this.t)) {
      return false;
    }
    if (this.o == this.p)
    {
      this.v += 1;
      if (this.v < this.z)
      {
        this.x = this.w[this.v];
        if (!a(this.x, this.a)) {
          return true;
        }
        return E();
      }
    }
    else if (this.u <= this.p)
    {
      this.v += 1;
      if (this.v < this.z)
      {
        this.x = this.w[this.v];
        if (!a(this.x, this.a)) {
          return true;
        }
        if (E()) {
          return true;
        }
      }
      return D();
    }
    return false;
  }
  
  private boolean C()
  {
    this.w = this.g[this.u];
    if (this.w == null) {
      return false;
    }
    if (this.j != null) {
      if (this.u < this.j.length) {
        this.A = (this.n - this.j[this.u]);
      } else {
        this.A = this.n;
      }
    }
    if (this.s)
    {
      this.y = Math.max(0, this.q + this.A);
      if (this.y >= this.w.length) {
        return false;
      }
      this.z = Math.min(this.w.length, this.r + this.A + 1);
      if (this.z <= this.y) {
        return false;
      }
      this.v = this.y;
    }
    else
    {
      this.z = Math.min(this.w.length, this.i + this.A);
      if (this.z < 1) {
        return false;
      }
      if (this.A < 0)
      {
        this.y = 0;
        this.v = 0;
      }
      else
      {
        this.y = this.A;
        if (this.y >= this.z) {
          return false;
        }
        this.v = this.y;
      }
    }
    this.x = this.w[this.v];
    if (!a(this.x, this.a)) {
      return true;
    }
    return E();
  }
  
  private boolean D()
  {
    do
    {
      this.u += 1;
      if (this.u > this.p) {
        break;
      }
    } while (!C());
    return true;
    return false;
  }
  
  private boolean E()
  {
    do
    {
      this.v += 1;
      if (this.v >= this.z) {
        break;
      }
      this.x = this.w[this.v];
    } while (a(this.x, this.a));
    return true;
    return false;
  }
  
  public zaie h()
  {
    if (this.x.b() == 13)
    {
      zabd localzabd = (zabd)this.x;
      if (localzabd.o().c() == 2)
      {
        this.x = localzabd.o().m();
        this.g[this.u][this.v] = this.x;
      }
    }
    return this.x;
  }
  
  public int i()
  {
    return this.l ? 0 : this.u - this.m;
  }
  
  public int j()
  {
    return this.l ? 0 : this.v - this.A;
  }
  
  public int k()
  {
    if (this.l) {
      return 0;
    }
    if (this.h < 2) {
      return this.v - this.A;
    }
    if (this.i < 2) {
      return this.u - this.m;
    }
    return (this.u - this.m) * this.i + this.v - this.A;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.t) {
      return new zazj(this.a, 1, this.i);
    }
    if (this.h < 2) {
      return this;
    }
    paramInt += this.m;
    if ((paramInt < 0) || (paramInt > this.g.length) || (this.g[paramInt] == null)) {
      return new zazj(this.a, this.b, 1, this.i);
    }
    int i1 = this.n;
    if ((this.j != null) && (paramInt < this.j.length)) {
      i1 -= this.j[paramInt];
    }
    zaie[] arrayOfzaie = this.g[paramInt];
    if ((i1 >= arrayOfzaie.length) || (i1 <= -this.i)) {
      return new zazj(this.a, this.b, 1, this.i);
    }
    return new zayq(arrayOfzaie, false, i1, this.i, this.b, this.a, this.f, this.d);
  }
  
  public zaiw c(int paramInt)
  {
    if (this.t) {
      return new zazj(this.a, 1, this.i);
    }
    paramInt += this.n;
    if ((paramInt < 0) || (paramInt >= this.k)) {
      return new zazj(this.a, this.b, this.h, 1);
    }
    return new zayr(this.g, this.m, paramInt, this.j, this.h, this.b, this.a, this.e, this.f, this.c, false, this.k);
  }
  
  public boolean a(zaie paramzaie)
  {
    return a(paramzaie, this.l ? this.x : this.a);
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
      H();
    }
    else if ((this.d) && (paramzaca.e != this.f))
    {
      this.n += paramzaca.e - this.f;
      this.f = paramzaca.e;
      H();
    }
  }
  
  public boolean q()
  {
    return this.s;
  }
  
  public int r()
  {
    if (!this.s) {
      F();
    }
    return this.t ? -1 : this.o - this.m;
  }
  
  public int s()
  {
    if (!this.s) {
      F();
    }
    return this.t ? -1 : this.p - this.m;
  }
  
  public int t()
  {
    if (!this.s) {
      F();
    }
    return this.q;
  }
  
  public int u()
  {
    if (!this.s) {
      F();
    }
    return this.r;
  }
  
  private void F()
  {
    this.s = true;
    if (this.o == this.p)
    {
      do
      {
        if (!a(this.w[this.y], this.a))
        {
          this.q = (this.y - this.A);
          this.r = this.q;
          this.z -= 1;
          if (this.y < this.z) {
            for (;;)
            {
              if (!a(this.w[this.z], this.a))
              {
                this.r = (this.z - this.A);
              }
              else
              {
                this.z -= 1;
                if (this.z == this.y) {
                  break;
                }
              }
            }
          }
          this.z += 1;
          break;
        }
        this.q += 1;
      } while (this.q <= this.r);
      G();
      return;
    }
    int[] arrayOfInt = new int[4];
    if (a(this.g, this.m, this.n, this.j, this.h, this.i, this.a, arrayOfInt))
    {
      this.o = (arrayOfInt[0] + this.m);
      this.q = arrayOfInt[1];
      this.p = (arrayOfInt[2] + this.m);
      this.r = arrayOfInt[3];
    }
    else
    {
      G();
    }
  }
  
  static boolean a(zaie[][] paramArrayOfzaie, int paramInt1, int paramInt2, int[] paramArrayOfInt1, int paramInt3, int paramInt4, zaie paramzaie, int[] paramArrayOfInt2)
  {
    int i1 = -1;
    int i2 = -1;
    int i3 = paramInt2;
    int i6 = Math.min(paramArrayOfzaie.length, paramInt1 + paramInt3) - 1;
    for (int i7 = Math.max(0, paramInt1); i7 <= i6; i7++)
    {
      zaie[] arrayOfzaie = paramArrayOfzaie[i7];
      if (arrayOfzaie != null)
      {
        if (paramArrayOfInt1 != null) {
          if (i7 < paramArrayOfInt1.length) {
            i3 = paramInt2 - paramArrayOfInt1[i7];
          } else {
            i3 = paramInt2;
          }
        }
        int i4 = Math.min(i3 + paramInt4, arrayOfzaie.length) - 1;
        int i5 = Math.max(0, i3);
        if (i5 <= i4) {
          for (;;)
          {
            if (!a(arrayOfzaie[i5], paramzaie))
            {
              paramArrayOfInt2[0] = (i7 - paramInt1);
              i1 = i5 - i3;
              i2 = i1;
              if (i4 > i5) {
                do
                {
                  if (!a(arrayOfzaie[i4], paramzaie))
                  {
                    i2 = i4 - i3;
                    break;
                  }
                  i4--;
                } while (i4 != i5);
              }
            }
            else
            {
              i5++;
              if (i5 > i4) {
                break;
              }
            }
          }
        }
        if (i2 >= 0)
        {
          if (i6 == i7)
          {
            paramArrayOfInt2[1] = i1;
            paramArrayOfInt2[2] = paramArrayOfInt2[0];
            paramArrayOfInt2[3] = i2;
            return true;
          }
          do
          {
            do
            {
              arrayOfzaie = paramArrayOfzaie[i6];
              if (arrayOfzaie != null) {
                break;
              }
              i6--;
            } while (i7 != i6);
            paramArrayOfInt2[1] = i1;
            paramArrayOfInt2[3] = i2;
            return true;
            if (paramArrayOfInt1 != null) {
              if (i6 < paramArrayOfInt1.length) {
                i3 = paramInt2 - paramArrayOfInt1[i6];
              } else {
                i3 = paramInt2;
              }
            }
            i4 = Math.min(i3 + paramInt4, arrayOfzaie.length) - 1;
            i5 = Math.max(0, i3);
            if (i5 <= i4) {
              for (;;)
              {
                if (!a(arrayOfzaie[i5], paramzaie))
                {
                  paramArrayOfInt2[2] = (i6 - paramInt1);
                  int i8 = paramInt4 - 1;
                  if ((i1 == 0) && (i2 == i8))
                  {
                    paramArrayOfInt2[1] = 0;
                    paramArrayOfInt2[3] = i8;
                    return true;
                  }
                  int i9 = i5 - i3;
                  if (i9 < i1)
                  {
                    if ((i9 == 0) && (i2 == i8))
                    {
                      paramArrayOfInt2[1] = 0;
                      paramArrayOfInt2[3] = i8;
                      return true;
                    }
                    i1 = i9;
                  }
                  else if (i9 > i2)
                  {
                    if ((i1 == 0) && (i9 == i8))
                    {
                      paramArrayOfInt2[1] = 0;
                      paramArrayOfInt2[3] = i8;
                      return true;
                    }
                    i2 = i9;
                  }
                  i5 = Math.max(i5, i2 + i3);
                  if (i4 > i5) {
                    for (;;)
                    {
                      if (!a(arrayOfzaie[i4], paramzaie))
                      {
                        i2 = i4 - i3;
                        if ((i1 == 0) && (i2 == i8))
                        {
                          paramArrayOfInt2[1] = 0;
                          paramArrayOfInt2[3] = i8;
                          return true;
                        }
                      }
                      else
                      {
                        i4--;
                        if (i4 == i5) {
                          break;
                        }
                      }
                    }
                  }
                  i6--;
                  if (i7 == i6)
                  {
                    paramArrayOfInt2[1] = i1;
                    paramArrayOfInt2[3] = i2;
                    return true;
                  }
                  do
                  {
                    arrayOfzaie = paramArrayOfzaie[i6];
                    if (arrayOfzaie != null)
                    {
                      if (paramArrayOfInt1 != null) {
                        if (i7 < paramArrayOfInt1.length) {
                          i3 = paramInt2 - paramArrayOfInt1[i7];
                        } else {
                          i3 = paramInt2;
                        }
                      }
                      i4 = Math.min(i3 + paramInt4, arrayOfzaie.length) - 1;
                      i5 = Math.max(0, i3);
                      if (i5 <= i4)
                      {
                        int i10 = i3 + i1;
                        while (a(arrayOfzaie[i5], paramzaie)) {}
                        i1 = i5 - i3;
                        if ((i1 == 0) && (i2 == i8))
                        {
                          paramArrayOfInt2[1] = 0;
                          paramArrayOfInt2[3] = i8;
                          return true;
                        }
                        i5++;
                        if (i5 == i10) {
                          break;
                        }
                        i5 = i3 + i2;
                        if (i4 > i5)
                        {
                          while (a(arrayOfzaie[i4], paramzaie)) {}
                          i2 = i4 - i3;
                          if ((i1 == 0) && (i2 == i8))
                          {
                            paramArrayOfInt2[1] = 0;
                            paramArrayOfInt2[3] = i8;
                            return true;
                          }
                          i4--;
                          if (i4 == i5) {
                            break;
                          }
                        }
                        else
                        {
                          if ((i1 == 0) && (i2 == i8)) {
                            break;
                          }
                        }
                      }
                    }
                    i6--;
                  } while (i7 != i6);
                  paramArrayOfInt2[1] = i1;
                  paramArrayOfInt2[3] = i2;
                  return true;
                }
                i5++;
                if (i5 > i4) {
                  break;
                }
              }
            }
            i6--;
          } while (i6 != i7);
          paramArrayOfInt2[1] = i1;
          paramArrayOfInt2[2] = paramArrayOfInt2[0];
          paramArrayOfInt2[3] = i2;
          return true;
        }
      }
    }
    return false;
  }
  
  private void G()
  {
    this.t = true;
    this.p = -1;
    this.o = -1;
    this.r = -1;
    this.q = -1;
  }
  
  private void H()
  {
    this.A = this.n;
    this.u = (this.m - 1);
    this.v = this.k;
    this.s = false;
    this.t = false;
    if ((this.m >= this.g.length) || (this.n >= this.k) || (this.m <= -this.h) || (this.n <= -this.i))
    {
      this.s = true;
      G();
    }
    else
    {
      if ((this.h == 1) || (this.m == this.g.length - 1)) {
        this.u = this.m;
      } else if (this.m + this.h == 1) {
        this.u = 0;
      }
      if (this.u >= this.m)
      {
        this.w = this.g[this.u];
        if (this.w == null)
        {
          this.s = true;
          G();
        }
        else
        {
          if ((this.j != null) && (this.u < this.j.length)) {
            this.A -= this.j[this.u];
          }
          if ((this.A >= this.w.length) || (this.A <= -this.i))
          {
            this.s = true;
            G();
          }
          else if (this.l)
          {
            this.s = true;
            G();
            this.x = this.w[this.A];
          }
          else
          {
            this.s = false;
            this.y = Math.max(0, this.A);
            this.z = Math.min(this.w.length, this.i + this.A);
            this.q = (this.y - this.A);
            this.r = (this.z - this.A - 1);
            this.o = this.u;
            this.p = this.o;
          }
        }
      }
      else
      {
        this.s = false;
        this.q = 0;
        this.r = (this.i - 1);
        this.o = Math.max(0, this.m);
        this.p = (Math.min(this.m + this.h, this.g.length) - 1);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zays.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */