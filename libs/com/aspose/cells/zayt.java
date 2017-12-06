package com.aspose.cells;

class zayt
  extends zayo
{
  private zaie[] g;
  private int h;
  private int i;
  private boolean j;
  private boolean k;
  private int l;
  private int m;
  private int n;
  private int o;
  private boolean p;
  private boolean q;
  private int r;
  private zaie s;
  
  public zayt(zaie[] paramArrayOfzaie, boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, zaie paramzaie, int paramInt6, int paramInt7, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramInt5, paramzaie, paramInt6, paramInt7, paramBoolean2, paramBoolean3);
    this.g = paramArrayOfzaie;
    this.j = paramBoolean1;
    this.h = paramInt2;
    this.i = paramInt4;
    this.k = ((this.h < 2) && (this.i < 2));
    this.m = paramInt1;
    this.l = paramInt3;
    E();
  }
  
  zayt(zayt paramzayt)
  {
    super(paramzayt.b, paramzayt.a, paramzayt.e, paramzayt.f, paramzayt.c, paramzayt.d);
    this.g = paramzayt.g;
    this.h = paramzayt.h;
    this.i = paramzayt.i;
    this.j = paramzayt.j;
    this.k = paramzayt.k;
    this.l = paramzayt.l;
    this.m = paramzayt.m;
    this.n = paramzayt.n;
    this.o = paramzayt.o;
    this.p = paramzayt.p;
    this.q = paramzayt.q;
    this.r = paramzayt.r;
    this.s = paramzayt.s;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zayt(this);
  }
  
  public int c()
  {
    return this.j ? this.h : this.i;
  }
  
  public int d()
  {
    return this.j ? this.i : this.h;
  }
  
  public int e()
  {
    return this.i == 1 ? this.h : this.h == 1 ? this.i : this.k ? 1 : this.h * this.i;
  }
  
  public boolean l()
  {
    return this.k;
  }
  
  public boolean m()
  {
    return this.k;
  }
  
  public boolean n()
  {
    return this.k;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (this.k) {
      return this.s;
    }
    if (this.q) {
      return this.a;
    }
    if (this.j)
    {
      if (paramInt2 == this.l)
      {
        paramInt1 += this.m;
        if ((paramInt1 >= this.n) && (paramInt1 <= this.o)) {
          return this.g[paramInt1];
        }
      }
    }
    else if (paramInt1 == this.l)
    {
      paramInt2 += this.m;
      if ((paramInt2 >= this.n) && (paramInt2 <= this.o)) {
        return this.g[paramInt2];
      }
    }
    return this.a;
  }
  
  public void f()
  {
    if ((this.k) || (this.q)) {
      return;
    }
    this.r = (this.n - 1);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if ((this.k) || (this.q)) {
      return false;
    }
    if (this.j)
    {
      if (paramInt2 > this.l) {
        paramInt1++;
      }
      paramInt1 += this.m;
      if (paramInt1 <= this.n)
      {
        if (this.p)
        {
          this.r = this.n;
          this.s = this.g[this.r];
          return true;
        }
        this.r = (this.n - 1);
      }
      else
      {
        if ((paramInt1 == this.r) && (this.r <= this.o)) {
          return true;
        }
        this.r = (paramInt1 - 1);
      }
    }
    else
    {
      if (paramInt1 > this.l)
      {
        this.r = this.o;
        return false;
      }
      if (paramInt1 < this.l)
      {
        if (this.p)
        {
          this.r = this.n;
          this.s = this.g[this.r];
          return true;
        }
        this.r = (this.n - 1);
      }
      else
      {
        paramInt2 += this.m;
        if (paramInt2 <= this.n)
        {
          if (this.p)
          {
            this.r = this.n;
            this.s = this.g[this.r];
            return true;
          }
          this.r = (this.n - 1);
        }
        else
        {
          if ((paramInt2 == this.r) && (this.r <= this.o)) {
            return true;
          }
          this.r = (paramInt2 - 1);
        }
      }
    }
    return g();
  }
  
  public boolean a(int paramInt)
  {
    if ((this.k) || (this.q)) {
      return false;
    }
    int i2;
    int i1;
    if (this.j)
    {
      i2 = paramInt % this.i;
      i1 = paramInt / this.i;
    }
    else
    {
      i2 = paramInt % this.h;
      i1 = paramInt / this.h;
    }
    return b(i1, i2);
  }
  
  public boolean g()
  {
    if ((this.k) || (this.q)) {
      return false;
    }
    this.r += 1;
    if (this.r <= this.o)
    {
      this.s = this.g[this.r];
      if (!a(this.s, this.a)) {
        return true;
      }
      do
      {
        this.r += 1;
        if (this.r > this.o) {
          return false;
        }
        this.s = this.g[this.r];
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
        this.g[this.r] = this.s;
      }
    }
    return this.s;
  }
  
  public int i()
  {
    return this.j ? this.r - this.m : this.l;
  }
  
  public int j()
  {
    return this.j ? this.l : this.r - this.m;
  }
  
  public int k()
  {
    return this.j ? (this.r - this.m) * this.i + this.l : this.l * this.h + (this.r - this.m);
  }
  
  public zaiw b(int paramInt)
  {
    if (this.j)
    {
      paramInt += this.m;
      if (this.i > 1)
      {
        if ((paramInt < this.n) || (paramInt > this.o) || (a(this.g[paramInt], this.a))) {
          return new zazj(this.a, this.b, 1, this.i);
        }
        return new zazr(this.g[paramInt], this.a, this.b, 1, this.i, 0, this.l, -1, -1, this.c, this.d);
      }
      zaie localzaie;
      if ((paramInt < this.n) || (paramInt > this.o)) {
        localzaie = this.a;
      } else {
        localzaie = this.g[paramInt];
      }
      return new zbak(localzaie, this.b);
    }
    if ((paramInt == this.l) || (this.i == 1)) {
      return this;
    }
    return new zazj(this.a, this.b, 1, this.h);
  }
  
  public zaiw c(int paramInt)
  {
    if (this.j)
    {
      if ((paramInt == this.l) || (this.i == 1)) {
        return this;
      }
      return new zazj(this.a, this.b, 1, this.h);
    }
    paramInt += this.m;
    if (this.i > 1)
    {
      if ((paramInt < this.n) || (paramInt > this.o) || (a(this.g[paramInt], this.a))) {
        return new zazj(this.a, this.b, 1, this.i);
      }
      return new zazr(this.g[paramInt], this.a, this.b, this.i, 1, this.l, 0, -1, -1, this.c, this.d);
    }
    zaie localzaie;
    if ((paramInt < this.n) || (paramInt > this.o)) {
      localzaie = this.a;
    } else {
      localzaie = this.g[paramInt];
    }
    return new zbak(localzaie, this.b);
  }
  
  public boolean a(zaie paramzaie)
  {
    return a(paramzaie, this.k ? this.s : this.a);
  }
  
  public void a(zaca paramzaca)
  {
    if ((!this.c) && (!this.d)) {
      return;
    }
    if (this.j)
    {
      if ((this.d) && (paramzaca.e != this.f))
      {
        this.l -= paramzaca.e - this.f;
        this.f = paramzaca.e;
      }
      if ((this.c) && (paramzaca.d != this.e))
      {
        this.m += paramzaca.d - this.e;
        this.e = paramzaca.d;
      }
    }
    else
    {
      if ((this.c) && (paramzaca.d != this.e))
      {
        this.l -= paramzaca.d - this.e;
        this.e = paramzaca.d;
      }
      if ((this.d) && (paramzaca.e != this.f))
      {
        this.m += paramzaca.e - this.f;
        this.f = paramzaca.e;
      }
    }
    E();
  }
  
  public boolean q()
  {
    return this.p;
  }
  
  public int r()
  {
    if (!this.p) {
      C();
    }
    return this.j ? this.n - this.m : this.q ? -1 : this.l;
  }
  
  public int s()
  {
    if (!this.p) {
      C();
    }
    return this.j ? this.o - this.m : this.q ? -1 : this.l;
  }
  
  public int t()
  {
    if (!this.p) {
      C();
    }
    return this.j ? this.l : this.q ? -1 : this.n - this.m;
  }
  
  public int u()
  {
    if (!this.p) {
      C();
    }
    return this.j ? this.l : this.q ? -1 : this.o - this.m;
  }
  
  public boolean a(zaca paramzaca, int[] paramArrayOfInt)
  {
    if (this.j)
    {
      if (this.d)
      {
        paramArrayOfInt[1] = Math.max(0, this.l - paramzaca.l.EndColumn + this.f);
        paramArrayOfInt[3] = Math.min(paramzaca.l.g() + this.i - 1, this.l - paramzaca.l.StartColumn + this.f);
        if (paramArrayOfInt[1] > paramArrayOfInt[3]) {
          return false;
        }
      }
      else
      {
        if ((this.l < 0) || (this.l >= this.i)) {
          return false;
        }
        paramArrayOfInt[1] = this.l;
        paramArrayOfInt[3] = this.l;
      }
      if (!this.c)
      {
        if (!this.p) {
          C();
        }
        if (this.q) {
          return false;
        }
        paramArrayOfInt[0] = (this.n - this.m);
        paramArrayOfInt[2] = (this.o - this.m);
        return true;
      }
      i1 = Math.max(0, this.m + paramzaca.l.StartRow - this.e);
      i2 = Math.min(this.g.length, this.m + paramzaca.l.EndRow - this.e + this.h);
      if (i1 >= i2) {
        return false;
      }
      do
      {
        if (!a(this.g[i1], this.a))
        {
          paramArrayOfInt[0] = (i1 - this.m);
          i2--;
          if (i1 < i2) {
            for (;;)
            {
              if (!a(this.g[i2], this.a))
              {
                paramArrayOfInt[2] = (i2 - this.m);
                return true;
              }
              i2--;
              if (i2 == i1) {
                break;
              }
            }
          }
          paramArrayOfInt[2] = paramArrayOfInt[0];
          return true;
        }
        i1++;
      } while (i1 != i2);
      if (!this.p)
      {
        this.p = true;
        D();
      }
      return false;
    }
    if (this.c)
    {
      paramArrayOfInt[0] = Math.max(0, this.l - paramzaca.l.EndRow + this.e);
      paramArrayOfInt[2] = Math.min(paramzaca.l.f() + this.i - 1, this.l - paramzaca.l.StartRow + this.e);
      if (paramArrayOfInt[0] > paramArrayOfInt[2]) {
        return false;
      }
    }
    else
    {
      if ((this.l < 0) || (this.l >= this.i)) {
        return false;
      }
      paramArrayOfInt[0] = this.l;
      paramArrayOfInt[2] = this.l;
    }
    if (!this.d)
    {
      if (!this.p) {
        C();
      }
      if (this.q) {
        return false;
      }
      paramArrayOfInt[1] = (this.n - this.m);
      paramArrayOfInt[3] = (this.o - this.m);
      return true;
    }
    int i1 = Math.max(0, this.m + paramzaca.l.StartColumn - this.f);
    int i2 = Math.min(this.g.length, this.m + paramzaca.l.EndColumn - this.f + this.h);
    if (i1 >= i2) {
      return false;
    }
    do
    {
      if (!a(this.g[i1], this.a))
      {
        paramArrayOfInt[1] = (i1 - this.m);
        i2--;
        if (i1 < i2) {
          for (;;)
          {
            if (!a(this.g[i2], this.a))
            {
              paramArrayOfInt[3] = (i2 - this.m);
              return true;
            }
            i2--;
            if (i2 == i1) {
              break;
            }
          }
        }
        paramArrayOfInt[3] = paramArrayOfInt[1];
        return true;
      }
      i1++;
    } while (i1 != i2);
    if (!this.p)
    {
      this.p = true;
      D();
    }
    return false;
  }
  
  public boolean b(zaca paramzaca, int[] paramArrayOfInt)
  {
    int[] arrayOfInt = new int[4];
    if (a(paramzaca, arrayOfInt))
    {
      int i1 = this.j ? this.i : this.h;
      if (this.d) {
        i1 += paramzaca.l.g() - 1;
      }
      paramArrayOfInt[0] = (arrayOfInt[0] * i1 + arrayOfInt[1]);
      paramArrayOfInt[1] = (arrayOfInt[2] * i1 + arrayOfInt[3]);
      return true;
    }
    return false;
  }
  
  private void C()
  {
    this.p = true;
    do
    {
      if (!a(this.g[this.n], this.a))
      {
        if (this.n >= this.o) {
          break;
        }
        while (a(this.g[this.o], this.a))
        {
          this.o -= 1;
          if (this.n == this.o)
          {
            this.s = this.g[this.n];
            if (a(this.s, this.a)) {
              D();
            }
          }
        }
      }
      this.n += 1;
    } while (this.n <= this.o);
    D();
  }
  
  private void D()
  {
    this.q = true;
    this.n = -1;
    this.o = -1;
  }
  
  private void E()
  {
    this.r = (this.m - 1);
    this.p = false;
    this.q = false;
    if ((this.l < 0) || (this.l >= this.i) || (this.m >= this.h) || (this.m <= -this.h))
    {
      this.p = true;
      D();
    }
    else
    {
      if ((this.k) || (this.m == this.g.length - 1)) {
        this.r = this.m;
      } else if (this.m + this.h == 1) {
        this.r = 0;
      }
      if (this.r >= this.m)
      {
        this.p = true;
        this.s = this.g[this.r];
        if (a(this.s, this.a))
        {
          D();
        }
        else
        {
          this.n = this.r;
          this.o = this.r;
        }
      }
      else
      {
        this.n = Math.max(0, this.m);
        this.o = (Math.min(this.g.length, this.m + this.h) - 1);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */