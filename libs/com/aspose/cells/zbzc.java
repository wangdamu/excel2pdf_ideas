package com.aspose.cells;

class zbzc
  implements zajw
{
  private zaiw a;
  private zaie[][] b;
  private zbza c;
  private int d;
  private int e;
  private boolean f;
  private boolean g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private boolean p = true;
  private zaie q;
  private zaie r;
  
  public zbzc(zaie[][] paramArrayOfzaie, zaiw paramzaiw, zaie paramzaie, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean1, boolean paramBoolean2, zbza paramzbza)
  {
    this.b = paramArrayOfzaie;
    this.a = paramzaiw;
    if (paramzaie != null) {
      b(paramzaie);
    } else {
      this.p = true;
    }
    this.j = paramInt1;
    this.k = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
    this.h = paramInt5;
    this.i = paramInt6;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    this.c = paramzbza;
    this.n = Math.max(0, this.j);
    this.o = Math.min(this.b.length, this.j + this.d);
    if ((this.k < 0) || (this.k >= this.e)) {
      this.o = this.n;
    }
  }
  
  public zajw a(zaiw paramzaiw)
  {
    return new zbzc(this.b, paramzaiw, this.q, this.j, this.k, this.d, this.e, this.h, this.i, this.f, this.g, this.c);
  }
  
  public void a()
  {
    this.l = (this.n - 1);
  }
  
  public boolean b()
  {
    this.l += 1;
    if (this.l >= this.o) {
      return false;
    }
    if (this.b[this.l] == null)
    {
      this.b[this.l] = new zaie[this.e];
      this.r = null;
      return true;
    }
    this.r = this.b[this.l][this.m];
    if ((this.p) || (this.r != this.q)) {
      return true;
    }
    this.l += 1;
    if (this.l < this.o)
    {
      do
      {
        if (this.b[this.l] == null)
        {
          this.b[this.l] = new zaie[this.e];
          this.r = null;
          return true;
        }
        this.r = this.b[this.l][this.m];
        if ((this.p) || (this.r != this.q)) {
          return true;
        }
        this.l += 1;
      } while (this.l != this.o);
      return false;
    }
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return a(paramInt1);
  }
  
  public boolean a(int paramInt)
  {
    paramInt += this.j;
    if (paramInt > this.o)
    {
      this.l = this.o;
      return false;
    }
    if (paramInt < this.n)
    {
      this.l = (this.n - 1);
      return b();
    }
    if (paramInt == this.l) {
      return this.l < this.o;
    }
    this.l = (paramInt - 1);
    return b();
  }
  
  public zaie c()
  {
    return this.r;
  }
  
  public int d()
  {
    return this.l - this.j;
  }
  
  public int e()
  {
    return 0;
  }
  
  public int f()
  {
    return this.l - this.j;
  }
  
  public zaiw a(zaca paramzaca, int paramInt)
  {
    if (this.c.a()) {
      return zbzd.a(paramInt, this.b, this.e, this.q, this.j, this.k, this.d, 1, this.h, this.i, this.f, this.g);
    }
    int i1 = this.n;
    for (i1 = this.n; i1 < this.o; i1++) {
      if ((this.b[i1] == null) || (this.b[i1][this.m] == null)) {
        return null;
      }
    }
    if (this.n >= this.o) {
      return new zazj(this.q, paramInt, this.d, 1);
    }
    i1 = this.n;
    while (this.b[i1][this.m] == this.q)
    {
      i1++;
      if (i1 == this.o) {
        return new zazj(this.q, paramInt, this.d, 1);
      }
    }
    int i2 = this.o - 1;
    if (i1 == i2) {
      return new zazr(this.b[i1][this.m], this.q, paramInt, this.d, 1, i1 - this.j, 0, this.h, this.i, this.f, this.g);
    }
    while (this.b[i2][this.m] == this.q)
    {
      i2--;
      if (i2 == i1) {
        return new zazr(this.b[i1][this.m], this.q, paramInt, this.d, 1, i1 - this.j, 0, this.h, this.i, this.f, this.g);
      }
    }
    zaie[] arrayOfzaie = new zaie[i2 - i1 + 1];
    arrayOfzaie[0] = this.b[i1][this.m];
    arrayOfzaie[(i2 - i1)] = this.b[i2][this.m];
    i2--;
    if (i2 > i1) {
      for (;;)
      {
        arrayOfzaie[(i2 - i1)] = this.b[i2][this.m];
        i2--;
        if (i2 == i1) {
          break;
        }
      }
    }
    return new zayq(arrayOfzaie, true, this.j - i1, this.d, paramInt, this.q, this.h, this.f);
  }
  
  public zajw b(int paramInt)
  {
    paramInt += this.j;
    if ((paramInt < this.n) || (paramInt >= this.o)) {
      return new zbze(this.q, 1, 1);
    }
    return new zbzb(this.b[paramInt], this.a, this.q, this.k, 1, this.i, false, this.g, this.c);
  }
  
  public zajw c(int paramInt)
  {
    return this;
  }
  
  public void a(zaca paramzaca)
  {
    if ((this.f) && (paramzaca.d != this.h))
    {
      this.j += paramzaca.d - this.h;
      this.n = Math.max(0, this.j);
      this.o = Math.min(this.b.length, this.j + this.d);
    }
    if ((this.g) && (paramzaca.e != this.i))
    {
      this.k += paramzaca.e - this.i;
      if ((this.k < 0) || (this.k >= this.e)) {
        this.o = this.n;
      }
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    d(paramInt1);
  }
  
  public void d(int paramInt)
  {
    paramInt += this.j;
    if (paramInt <= this.l) {
      return;
    }
    if (this.p) {
      b(this.a.o());
    }
    this.b[this.l][this.m] = this.q;
    this.c.c();
    this.l += 1;
    if (this.l < paramInt) {
      for (;;)
      {
        if (this.b[this.l][this.m] == null)
        {
          this.b[this.l][this.m] = this.q;
          this.c.c();
        }
        this.l += 1;
        if (this.l == paramInt) {
          break;
        }
      }
    }
    this.r = this.b[this.l][this.m];
  }
  
  public void g()
  {
    if (this.l >= this.o) {
      return;
    }
    if (this.p) {
      b(this.a.o());
    }
    this.b[this.l][this.m] = this.q;
    this.c.c();
    this.l += 1;
    if (this.l >= this.o) {
      return;
    }
    for (;;)
    {
      if (this.b[this.l][this.m] == null)
      {
        this.b[this.l][this.m] = this.q;
        this.c.c();
      }
      this.l += 1;
      if (this.l == this.o) {
        break;
      }
    }
  }
  
  public void a(zaie paramzaie)
  {
    this.r = this.c.b(paramzaie);
    this.b[this.l][this.m] = this.r;
  }
  
  public zaie c(int paramInt1, int paramInt2)
  {
    return e(paramInt1);
  }
  
  public zaie e(int paramInt)
  {
    paramInt += this.j;
    if ((paramInt < this.n) || (paramInt >= this.o))
    {
      if (this.p) {
        b(this.a.o());
      }
      return this.q;
    }
    if (this.b[paramInt] == null)
    {
      this.b[paramInt] = new zaie[this.e];
      return null;
    }
    return this.b[paramInt][this.m];
  }
  
  public void a(int paramInt1, int paramInt2, zaie paramzaie)
  {
    this.b[(paramInt1 + this.j)][this.m] = this.c.b(paramzaie);
  }
  
  private void b(zaie paramzaie)
  {
    this.p = false;
    this.q = this.c.a(paramzaie);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */