package com.aspose.cells;

class zazl
  extends zazk
{
  private zwr c;
  private int d;
  private int e;
  private short f;
  private short g;
  private zwk h;
  private int i;
  private int j = -1;
  private int k = -1;
  private boolean l = false;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private zgs s;
  private zaie t;
  
  public zazl(zaca paramzaca, zwr paramzwr, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramzaca);
    this.c = paramzwr;
    this.d = paramInt1;
    this.f = ((short)paramInt2);
    this.e = paramInt3;
    this.g = ((short)paramInt4);
    this.q = this.f;
    this.r = this.g;
    this.m = paramzwr.d(paramInt1);
    if (this.m < 0) {
      this.m = (-this.m - 1);
    }
    this.n = paramzwr.d(paramInt3);
    if (this.n < 0) {
      this.n = (-this.n - 2);
    }
    if (this.n < this.m)
    {
      this.l = true;
      this.m = -1;
      this.n = -1;
      this.o = -1;
      this.p = -1;
    }
    else
    {
      zwn localzwn = paramzwr.b(this.m);
      this.o = (localzwn.a() - this.d);
      if (this.n > this.m)
      {
        this.p = (paramzwr.b(this.n).a() - this.d);
      }
      else
      {
        this.p = this.o;
        this.h = localzwn.c(paramInt2, paramInt4);
      }
      this.i = (this.m - 1);
    }
  }
  
  private zazl(zazl paramzazl, zaca paramzaca)
  {
    super(paramzaca == null ? paramzazl.a : paramzaca);
    this.c = paramzazl.c;
    this.d = paramzazl.d;
    this.f = paramzazl.f;
    this.e = paramzazl.e;
    this.g = paramzazl.g;
    this.l = paramzazl.l;
    this.m = paramzazl.m;
    this.n = paramzazl.n;
    this.o = paramzazl.o;
    this.p = paramzazl.p;
    this.q = paramzazl.q;
    this.r = paramzazl.r;
    this.s = paramzazl.s;
    this.t = paramzazl.t;
    this.i = paramzazl.i;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazl(this, paramzaca);
  }
  
  public int c()
  {
    return this.e - this.d + 1;
  }
  
  public int d()
  {
    return this.g - this.f + 1;
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
    if ((paramInt1 < this.o) || (paramInt1 > this.p)) {
      return zabg.a;
    }
    paramInt2 += this.f;
    if (this.l)
    {
      if ((paramInt2 < this.q) || (paramInt2 > this.r)) {
        return zabg.a;
      }
      if ((this.o == this.p) && (this.q == this.r)) {
        return this.t;
      }
    }
    int i1 = this.c.d(paramInt1 + this.d);
    if (i1 < 0) {
      return zabg.a;
    }
    return a(this.c.b(i1), paramInt2);
  }
  
  public void f()
  {
    if (this.o < 0) {
      return;
    }
    if (this.o == this.p)
    {
      if ((this.l) && (this.q == this.r))
      {
        this.i = -1;
      }
      else
      {
        this.i = this.m;
        this.h.b();
      }
      return;
    }
    this.i = this.m;
    zwn localzwn = this.c.b(this.i);
    this.j = (localzwn.a() - this.d);
    this.h = localzwn.c(this.q, this.r);
  }
  
  public boolean g()
  {
    if (this.i > this.n) {
      return false;
    }
    if (this.i < 0)
    {
      this.i = (this.n + 1);
      return true;
    }
    if (C()) {
      return true;
    }
    this.i += 1;
    if (this.i > this.n) {
      return false;
    }
    return D();
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (paramInt1 > this.p)
    {
      this.i = (this.n + 1);
      return false;
    }
    if (paramInt1 < this.o)
    {
      f();
      return g();
    }
    if (paramInt1 == this.j)
    {
      if (paramInt2 == this.k) {
        return true;
      }
      paramInt2 += this.f;
      if (this.h.a(paramInt2))
      {
        this.s = this.h.a();
        if (this.s.c != 0)
        {
          this.k = (this.s.a - this.f);
          this.t = null;
          return true;
        }
      }
      if (C()) {
        return true;
      }
      this.i += 1;
      if (paramInt1 == this.p) {
        return false;
      }
    }
    else
    {
      this.i = this.c.d(paramInt1 + this.d);
      if (this.i < 0)
      {
        this.i = (-this.i - 1);
        if (this.i > this.n) {
          return false;
        }
      }
    }
    return D();
  }
  
  public boolean a(int paramInt)
  {
    int i1 = d();
    int i2 = paramInt % i1;
    int i3 = paramInt / i1;
    return b(i3, i2);
  }
  
  private boolean C()
  {
    if (!this.h.hasNext()) {
      return false;
    }
    this.s = this.h.a();
    if (this.s.c != 0)
    {
      this.k = (this.s.a - this.f);
      this.t = null;
      return true;
    }
    while (this.h.hasNext())
    {
      this.s = this.h.a();
      if (this.s.c != 0)
      {
        this.k = (this.s.a - this.f);
        this.t = null;
        return true;
      }
    }
    return false;
  }
  
  private boolean D()
  {
    zwn localzwn = this.c.b(this.i);
    this.h = localzwn.c(this.q, this.r);
    if (C())
    {
      this.j = (localzwn.a() - this.d);
      return true;
    }
    for (this.i += 1; this.i <= this.n; this.i += 1)
    {
      localzwn = this.c.b(this.i);
      this.h = localzwn.c(this.q, this.r);
      if (C())
      {
        this.j = (localzwn.a() - this.d);
        return true;
      }
    }
    return false;
  }
  
  public zaie h()
  {
    if (this.t == null) {
      this.t = zabt.a(this.s, this.a);
    }
    return this.t;
  }
  
  public int i()
  {
    return this.j;
  }
  
  public int j()
  {
    return this.k;
  }
  
  public int k()
  {
    return this.j * (this.g - this.f + 1) + this.k;
  }
  
  public zaiw b(int paramInt)
  {
    paramInt += this.d;
    int i1 = this.c.d(paramInt + this.d);
    if (i1 < 0) {
      return new zazj(null, 9, 1, d());
    }
    return new zazn(this.a, this.c.b(i1), this.f, this.g);
  }
  
  public zaiw c(int paramInt)
  {
    return new zazm(this.a, this.c, paramInt + this.f, this.d, this.e);
  }
  
  public boolean q()
  {
    return this.l;
  }
  
  public int r()
  {
    if (!this.l) {
      E();
    }
    return this.o;
  }
  
  public int s()
  {
    if (!this.l) {
      E();
    }
    return this.p;
  }
  
  public int t()
  {
    if (!this.l) {
      E();
    }
    return this.q - this.f;
  }
  
  public int u()
  {
    if (!this.l) {
      E();
    }
    return this.r - this.f;
  }
  
  public int v()
  {
    if (!this.l) {
      E();
    }
    return this.o * (this.g - this.f + 1) + this.q - this.f;
  }
  
  public int w()
  {
    if (!this.l) {
      E();
    }
    return this.p * (this.g - this.f + 1) + this.r - this.f;
  }
  
  private void E()
  {
    this.l = true;
    this.q = (this.g + 1);
    this.r = (this.f - 1);
    this.o = -1;
    int i1 = 0;
    for (int i2 = this.m; i2 <= this.n; i2++)
    {
      zwn localzwn2 = this.c.b(i2);
      int i3;
      if (this.q > this.f)
      {
        this.b.a = this.f;
        i3 = localzwn2.a(this.b, -1, (short)-1, true, false);
        if (i3 > -1)
        {
          if (this.q > this.b.a) {
            this.q = this.b.a;
          }
          if (this.o < 0)
          {
            this.o = localzwn2.a();
            this.m = i2;
            this.r = this.q;
          }
          this.p = localzwn2.a();
          i1 = i2;
          if (this.r < this.g)
          {
            short s1 = this.b.a;
            this.b.a = this.g;
            localzwn2.a(this.b, i3, s1, true, true);
            if (this.r < this.b.a) {
              this.r = this.b.a;
            }
          }
        }
      }
      else
      {
        this.b.a = this.g;
        i3 = localzwn2.a(this.b, -1, (short)-1, true, true);
        if (i3 > -1)
        {
          if (this.r < this.b.a) {
            this.r = this.b.a;
          }
          if (this.o < 0)
          {
            this.o = localzwn2.a();
            this.m = i2;
          }
          this.p = localzwn2.a();
          i1 = i2;
        }
      }
    }
    if (this.o < 0)
    {
      this.p = -1;
      this.q = -1;
      this.r = -1;
    }
    else
    {
      this.n = i1;
      if (this.o == this.p)
      {
        if (this.q == this.r)
        {
          this.s = this.c.a(this.o, this.q);
          this.t = zabt.a(this.s, this.a);
        }
        else
        {
          zwn localzwn1 = this.c.b(this.m);
          this.h = localzwn1.c(this.f, this.g);
        }
        this.o -= this.d;
        this.p = this.o;
      }
      else
      {
        this.o -= this.d;
        this.p -= this.d;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */