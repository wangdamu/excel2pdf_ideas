package com.aspose.cells;

import com.aspose.cells.a.c.zc;

class zbzd
  implements zajw
{
  private zaiw a;
  private zaie[][] b;
  private zbza c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private boolean h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private zaie s;
  private boolean t = true;
  private zaie[] u;
  private zaie v;
  
  public zbzd(zaiw paramzaiw, zaie paramzaie, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.a = paramzaiw;
    this.b = new zaie[paramInt3 - paramInt1 + 1][];
    this.c = new zbza(this.b.length * this.f);
    this.d = paramInt5;
    this.e = paramInt6;
    if (paramzaie != null) {
      b(paramzaie);
    } else {
      this.t = true;
    }
    this.f = (paramInt4 - paramInt2 + 1);
    this.g = false;
    this.h = false;
    this.k = (-paramInt1);
    this.l = (-paramInt2);
    this.i = 0;
    this.j = 0;
    this.o = Math.max(0, this.k);
    this.q = Math.max(this.l, 0);
    this.r = Math.min(this.f, this.l + this.e);
    if (this.q < this.r) {
      this.p = Math.min(this.b.length, this.k + this.d);
    } else {
      this.p = this.o;
    }
  }
  
  public zbzd(zaie[][] paramArrayOfzaie, zaiw paramzaiw, zaie paramzaie, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = paramArrayOfzaie;
    this.a = paramzaiw;
    if (paramzaie != null) {
      b(paramzaie);
    } else {
      this.t = true;
    }
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt1;
    this.c = new zbza(this.b.length * this.f);
    this.k = paramInt4;
    this.l = paramInt5;
    this.g = paramBoolean1;
    this.h = paramBoolean2;
    this.i = paramInt6;
    this.j = paramInt7;
    this.o = Math.max(0, this.k);
    this.q = Math.max(this.l, 0);
    this.r = Math.min(this.f, this.l + this.e);
    if (this.q < this.r) {
      this.p = Math.min(this.b.length, this.k + this.d);
    } else {
      this.p = this.o;
    }
  }
  
  public zajw a(zaiw paramzaiw)
  {
    return new zbzd(this.b, paramzaiw, this.s, this.f, this.d, this.e, this.k, this.l, this.i, this.j, this.g, this.h);
  }
  
  public void a()
  {
    this.m = this.o;
    if (this.m >= this.p)
    {
      this.n = this.r;
      return;
    }
    this.u = this.b[this.m];
    if (this.u == null)
    {
      this.u = new zaie[this.f];
      this.b[this.m] = this.u;
    }
    this.n = (this.q - 1);
  }
  
  public boolean b()
  {
    if (h()) {
      return true;
    }
    this.m += 1;
    if (this.m >= this.p) {
      return false;
    }
    this.u = this.b[this.m];
    this.n = this.q;
    if (this.u == null)
    {
      this.u = new zaie[this.f];
      this.b[this.m] = this.u;
      this.v = null;
      return true;
    }
    this.v = this.u[this.n];
    if (this.t) {
      b(this.a.o());
    }
    if (this.v != this.s) {
      return true;
    }
    if (h()) {
      return true;
    }
    this.m += 1;
    if (this.m == this.p) {
      return false;
    }
    do
    {
      this.u = this.b[this.m];
      this.n = this.q;
      if (this.u == null)
      {
        this.u = new zaie[this.f];
        this.b[this.m] = this.u;
        this.v = null;
        return true;
      }
      this.v = this.u[this.n];
      if (this.v != this.s) {
        return true;
      }
      if (h()) {
        return true;
      }
      this.m += 1;
    } while (this.m != this.p);
    return false;
  }
  
  private boolean h()
  {
    this.n += 1;
    if (this.n >= this.r) {
      return false;
    }
    this.v = this.u[this.n];
    if (this.t) {
      b(this.a.o());
    }
    if (this.v != this.s) {
      return true;
    }
    this.n += 1;
    if (this.n == this.r) {
      return false;
    }
    do
    {
      this.v = this.u[this.n];
      if (this.v != this.s) {
        return true;
      }
      this.n += 1;
    } while (this.n != this.r);
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    paramInt1 += this.k;
    if (paramInt1 >= this.p)
    {
      this.n = this.r;
      return false;
    }
    if (paramInt1 < this.o)
    {
      paramInt1 = this.o;
      paramInt2 = this.l;
    }
    else
    {
      paramInt2 += this.l;
      if (paramInt2 >= this.r)
      {
        paramInt1++;
        paramInt2 = this.l;
      }
    }
    if (paramInt2 < this.q) {
      paramInt2 = this.q;
    }
    if (paramInt1 == this.m)
    {
      if (paramInt2 == this.n) {
        return true;
      }
      this.n = paramInt2;
    }
    else
    {
      this.m = paramInt1;
      this.u = this.b[paramInt1];
      this.n = paramInt2;
      if (this.u == null)
      {
        this.u = new zaie[this.f];
        this.v = null;
        return true;
      }
    }
    this.v = this.u[this.n];
    if (this.t) {
      b(this.a.o());
    }
    if (this.v != this.s) {
      return true;
    }
    return b();
  }
  
  public boolean a(int paramInt)
  {
    return a(paramInt / this.e, paramInt % this.e);
  }
  
  public zaie c()
  {
    return this.v;
  }
  
  public int d()
  {
    return this.m - this.k;
  }
  
  public int e()
  {
    return this.n - this.l;
  }
  
  public int f()
  {
    return (this.m - this.k) * this.e + this.n - this.l;
  }
  
  public zaiw a(zaca paramzaca, int paramInt)
  {
    if (!this.c.a()) {
      return null;
    }
    zaie localzaie = null;
    int i2;
    if (paramzaca.j)
    {
      int i3 = this.a.c();
      int i4 = this.a.d();
      if ((this.a.x()) && (!paramzaca.l.d())) {
        i3 += paramzaca.l.f() - 1;
      }
      if ((this.a.y()) && (!paramzaca.l.e())) {
        i4 += paramzaca.l.g() - 1;
      }
      i2 = i3 * i4;
    }
    else
    {
      i2 = this.a.e();
    }
    int i1;
    if (i2 > this.c.b())
    {
      if (this.s == null)
      {
        this.s = this.a.p();
        if (this.s == null) {
          return null;
        }
      }
      localzaie = this.s;
      i1 = i2 - this.c.b() + this.c.c(localzaie);
    }
    else
    {
      localzaie = this.c.d();
      if (localzaie == null) {
        localzaie = this.s;
      }
      i1 = this.c.c(localzaie);
    }
    if (i1 << 1 < this.c.b()) {
      return new zays(this.b, this.k, this.l, null, this.d, this.e, paramInt, localzaie, this.i, this.j, this.g, this.h, this.f);
    }
    if (localzaie == null) {
      localzaie = this.s;
    }
    return a(paramInt, this.b, this.f, localzaie, this.k, this.l, this.d, this.e, this.i, this.j, this.g, this.h);
  }
  
  static zaiw a(int paramInt1, zaie[][] paramArrayOfzaie, int paramInt2, zaie paramzaie, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = -1;
    int i2 = 0;
    zaie[] arrayOfzaie1;
    do
    {
      arrayOfzaie1 = paramArrayOfzaie[i2];
      for (int i3 = 0; i3 < paramInt2; i3++) {
        if (arrayOfzaie1[i3] != paramzaie)
        {
          i1 = i3;
          break;
        }
      }
      if (i1 > -1) {
        break;
      }
      i2++;
    } while (i2 != paramArrayOfzaie.length);
    return new zazj(paramzaie, paramInt1, paramInt5, paramInt6);
    Object localObject1 = new zaie[paramArrayOfzaie.length - i2][];
    zaie[] arrayOfzaie2 = a(i1, arrayOfzaie1, paramInt2, paramzaie);
    int i4 = arrayOfzaie2.length;
    localObject1[0] = arrayOfzaie2;
    Object localObject2 = null;
    int i5 = i2;
    for (int i6 = i2 + 1; i6 < paramArrayOfzaie.length; i6++)
    {
      arrayOfzaie1 = paramArrayOfzaie[i6];
      for (int i7 = 0; i7 < paramInt2; i7++) {
        if (arrayOfzaie1[i7] != paramzaie)
        {
          i5 = i6;
          if (localObject2 != null)
          {
            localObject2[(i6 - i2)] = i7;
          }
          else if (i7 != i1)
          {
            localObject2 = new int[paramArrayOfzaie.length - i2];
            zc.a((int[])localObject2, 0, i6 - i2, i1);
            localObject2[(i6 - i2)] = i7;
            i4 += i1;
          }
          arrayOfzaie2 = a(i7, arrayOfzaie1, paramInt2, paramzaie);
          localObject1[(i6 - i2)] = arrayOfzaie2;
          i4 = Math.max(i4, i7 + arrayOfzaie2.length);
          break;
        }
      }
    }
    if (i5 == i2) {
      return new zayt(localObject1[0], false, paramInt4 - i1, paramInt6, i2 - paramInt3, paramInt5, paramInt1, paramzaie, paramInt7, paramInt8, paramBoolean1, paramBoolean2);
    }
    if (i5 < paramArrayOfzaie.length - 1)
    {
      zaie[][] arrayOfzaie = new zaie[i5 - i2 + 1][];
      System.arraycopy(localObject1, 0, arrayOfzaie, 0, arrayOfzaie.length);
      localObject1 = arrayOfzaie;
      if (localObject2 != null)
      {
        int[] arrayOfInt = new int[localObject1.length];
        System.arraycopy(localObject2, 0, arrayOfInt, 0, arrayOfInt.length);
        localObject2 = arrayOfInt;
      }
    }
    if (paramInt6 == 1) {
      return new zayr((zaie[][])localObject1, paramInt3 - i2, localObject2 == null ? paramInt4 - i1 : paramInt4, (int[])localObject2, paramInt5, paramInt1, paramzaie, paramInt7, paramInt8, paramBoolean1, paramBoolean2, i4);
    }
    return new zays((zaie[][])localObject1, paramInt3 - i2, localObject2 == null ? paramInt4 - i1 : paramInt4, (int[])localObject2, paramInt5, paramInt6, paramInt1, paramzaie, paramInt7, paramInt8, paramBoolean1, paramBoolean2, i4);
  }
  
  private static zaie[] a(int paramInt1, zaie[] paramArrayOfzaie, int paramInt2, zaie paramzaie)
  {
    int i1 = paramInt2 - 1;
    if (i1 > paramInt1)
    {
      if (paramArrayOfzaie[i1] != paramzaie)
      {
        if (paramInt1 == 0) {
          return paramArrayOfzaie;
        }
        arrayOfzaie = new zaie[i1 - paramInt1 + 1];
        System.arraycopy(paramArrayOfzaie, paramInt1, arrayOfzaie, 0, arrayOfzaie.length);
        return arrayOfzaie;
      }
      do
      {
        i1--;
        if (i1 == paramInt1) {
          return new zaie[] { paramArrayOfzaie[i1] };
        }
      } while (paramArrayOfzaie[i1] == paramzaie);
      zaie[] arrayOfzaie = new zaie[i1 - paramInt1 + 1];
      System.arraycopy(paramArrayOfzaie, paramInt1, arrayOfzaie, 0, arrayOfzaie.length);
      return arrayOfzaie;
    }
    if (paramInt1 == 0) {
      return paramArrayOfzaie;
    }
    return new zaie[] { paramArrayOfzaie[i1] };
  }
  
  public zajw b(int paramInt)
  {
    paramInt += this.k;
    if ((paramInt < this.o) || (paramInt >= this.p)) {
      return new zbze(this.s, 1, this.e);
    }
    return new zbzb(this.b[paramInt], this.a, this.s, this.l, this.e, this.j, false, this.h, this.c);
  }
  
  public zajw c(int paramInt)
  {
    paramInt += this.l;
    if ((paramInt < this.q) || (paramInt >= this.q)) {
      return new zbze(this.s, this.d, 1);
    }
    return new zbzc(this.b, this.a, this.s, this.k, this.l, this.d, this.f, this.i, this.j, this.g, this.h, this.c);
  }
  
  public void a(zaca paramzaca)
  {
    if ((this.g) && (paramzaca.d != this.i))
    {
      this.k += paramzaca.d - this.i;
      this.i = paramzaca.d;
      this.o = Math.max(0, this.k);
      this.p = Math.min(this.b.length, this.k + this.d);
    }
    if ((this.h) && (paramzaca.e != this.j))
    {
      this.l += paramzaca.e - this.j;
      this.j = paramzaca.e;
      this.q = Math.max(this.l, 0);
      this.r = Math.min(this.f, this.l + this.e);
      if (this.q >= this.r) {
        this.p = this.o;
      }
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    paramInt1 += this.k;
    if (paramInt1 > this.m)
    {
      if (this.t) {
        b(this.a.o());
      }
      this.u[this.n] = this.s;
      this.n += 1;
      this.c.c();
      if (this.n < this.r) {
        for (;;)
        {
          if (this.u[this.n] == null)
          {
            this.u[this.n] = this.s;
            this.c.c();
          }
          this.n += 1;
          if (this.n == this.r) {
            break;
          }
        }
      }
      this.m += 1;
      this.n = this.q;
      if (this.m < paramInt1) {
        for (;;)
        {
          this.u = this.b[this.m];
          if (this.u == null)
          {
            this.u = new zaie[this.f];
            this.b[this.m] = this.u;
            zc.a(this.u, this.q, this.r, this.s);
            this.c.a(this.r - this.q);
          }
          else
          {
            for (;;)
            {
              if (this.u[this.n] == null)
              {
                this.u[this.n] = this.s;
                this.c.c();
              }
              this.n += 1;
              if (this.n == this.r) {
                break;
              }
            }
            this.n = this.q;
          }
          this.m += 1;
          if (this.m == paramInt1) {
            break;
          }
        }
      }
      if (this.m >= this.b.length) {
        return;
      }
      this.u = this.b[this.m];
      if (this.u == null)
      {
        this.u = new zaie[this.f];
        this.b[this.m] = this.u;
      }
    }
    paramInt2 += this.l;
    if (this.n < paramInt2)
    {
      if (this.t) {
        b(this.a.o());
      }
      for (;;)
      {
        if (this.u[this.n] == null)
        {
          this.u[this.n] = this.s;
          this.c.c();
        }
        this.n += 1;
        if (this.n == paramInt2) {
          break;
        }
      }
    }
    if (this.n >= this.u.length) {
      return;
    }
    this.v = this.u[this.n];
  }
  
  public void d(int paramInt)
  {
    b(paramInt / this.e, paramInt % this.e);
  }
  
  public void g()
  {
    if (this.n < this.r)
    {
      if (this.t) {
        b(this.a.o());
      }
      for (;;)
      {
        if (this.u[this.n] == null)
        {
          this.u[this.n] = this.s;
          this.c.c();
        }
        this.n += 1;
        if (this.n == this.r) {
          break;
        }
      }
    }
    this.m += 1;
    this.n = this.q;
    if (this.m < this.p)
    {
      if (this.t) {
        b(this.a.o());
      }
      for (;;)
      {
        this.u = this.b[this.m];
        if (this.u == null)
        {
          this.u = new zaie[this.f];
          this.b[this.m] = this.u;
          zc.a(this.u, this.q, this.r, this.s);
          this.c.a(this.r - this.q);
        }
        else
        {
          for (;;)
          {
            if (this.u[this.n] == null)
            {
              this.u[this.n] = this.s;
              this.c.c();
            }
            this.n += 1;
            if (this.n == this.r) {
              break;
            }
          }
          this.n = this.q;
        }
        this.m += 1;
        if (this.m == this.p) {
          break;
        }
      }
    }
  }
  
  public void a(zaie paramzaie)
  {
    this.v = this.c.b(paramzaie);
    this.u[this.n] = this.v;
  }
  
  public zaie c(int paramInt1, int paramInt2)
  {
    paramInt1 += this.k;
    if ((paramInt1 < 0) || (paramInt1 >= this.p))
    {
      if (this.t) {
        b(this.a.o());
      }
      return this.s;
    }
    paramInt2 += this.l;
    if ((paramInt2 < this.q) || (paramInt2 > this.r))
    {
      if (this.t) {
        b(this.a.o());
      }
      return this.s;
    }
    if (this.b[paramInt1] == null)
    {
      this.b[paramInt1] = new zaie[this.f];
      return null;
    }
    return this.b[paramInt1][paramInt2];
  }
  
  public void a(int paramInt1, int paramInt2, zaie paramzaie)
  {
    this.b[(paramInt1 + this.k)][(paramInt2 + this.l)] = this.c.b(paramzaie);
  }
  
  private void b(zaie paramzaie)
  {
    this.t = false;
    this.s = this.c.a(paramzaie);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */