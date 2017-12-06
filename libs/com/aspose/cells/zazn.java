package com.aspose.cells;

class zazn
  extends zazk
{
  private zwn c;
  private zwk d;
  private short e;
  private short f;
  private int g = -1;
  private boolean h = false;
  private int i = -1;
  private int j = -1;
  private zgs k;
  private zaie l;
  
  public zazn(zaca paramzaca, zwn paramzwn, int paramInt1, int paramInt2)
  {
    super(paramzaca);
    this.c = paramzwn;
    this.e = ((short)paramInt1);
    this.f = ((short)paramInt2);
    this.d = paramzwn.c(paramInt1, paramInt2);
  }
  
  public zaiw b(zaca paramzaca)
  {
    zazn localzazn = new zazn(paramzaca == null ? this.a : paramzaca, this.c, this.e, this.f);
    if (this.h)
    {
      localzazn.h = true;
      localzazn.i = this.i;
      localzazn.j = this.j;
    }
    localzazn.k = this.k;
    localzazn.l = this.l;
    return localzazn;
  }
  
  public int c()
  {
    return 1;
  }
  
  public int d()
  {
    return this.f - this.e + 1;
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
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (this.h)
    {
      if ((paramInt2 < this.i) || (paramInt2 > this.j)) {
        return zabg.a;
      }
      if (this.i == this.j) {
        return this.l;
      }
    }
    return a(this.c, paramInt2 + this.e);
  }
  
  public void f()
  {
    if (this.h)
    {
      if (this.i < this.j) {
        this.d.b();
      } else if (this.i > -1) {
        this.b.a = 0;
      }
    }
    else {
      this.d.b();
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return a(paramInt2);
  }
  
  public boolean a(int paramInt)
  {
    if (this.h)
    {
      if (this.i < 0) {
        return false;
      }
      if (paramInt <= this.i)
      {
        if (this.i < this.j)
        {
          this.d.b();
          return g();
        }
        this.b.a = 0;
        return true;
      }
      if (paramInt > this.j) {
        return false;
      }
      paramInt += this.e;
    }
    else
    {
      if (paramInt <= 0)
      {
        this.d.b();
        return g();
      }
      paramInt += this.e;
      if (paramInt > this.f) {
        return false;
      }
    }
    if (this.g == paramInt) {
      return true;
    }
    if (!this.d.a(paramInt)) {
      return false;
    }
    this.k = this.d.a();
    if (this.k.c != 0)
    {
      this.g = (this.k.a - this.e);
      this.l = null;
      return true;
    }
    while (this.d.hasNext())
    {
      this.k = this.d.a();
      if (this.k.c != 0)
      {
        this.g = (this.k.a - this.e);
        this.l = null;
        return true;
      }
    }
    return false;
  }
  
  public boolean g()
  {
    if (this.h)
    {
      if (this.i < 0) {
        return false;
      }
      if (this.i == this.j)
      {
        if (this.b.a < 0) {
          return false;
        }
        this.b.a = -1;
        return true;
      }
    }
    if (this.d.hasNext())
    {
      this.k = this.d.a();
      if (this.k.c != 0)
      {
        this.g = (this.k.a - this.e);
        this.l = null;
        return true;
      }
      while (this.d.hasNext())
      {
        this.k = this.d.a();
        if (this.k.c != 0)
        {
          this.g = (this.k.a - this.e);
          this.l = null;
          return true;
        }
      }
    }
    return false;
  }
  
  public zaie h()
  {
    if (this.l == null) {
      this.l = zabt.a(this.k, this.a);
    }
    return this.l;
  }
  
  public int i()
  {
    return 0;
  }
  
  public int j()
  {
    return this.g;
  }
  
  public int k()
  {
    return this.g;
  }
  
  public zaiw b(int paramInt)
  {
    return this;
  }
  
  public zaiw c(int paramInt)
  {
    return new zbak(a(this.c, paramInt + this.e));
  }
  
  public boolean q()
  {
    return this.h;
  }
  
  public int t()
  {
    if (!this.h) {
      C();
    }
    return this.i;
  }
  
  public int u()
  {
    if (!this.h) {
      C();
    }
    return this.j;
  }
  
  public int r()
  {
    if (!this.h) {
      C();
    }
    return this.i < 0 ? -1 : 0;
  }
  
  public int s()
  {
    if (!this.h) {
      C();
    }
    return this.i < 0 ? -1 : 0;
  }
  
  public int v()
  {
    if (!this.h) {
      C();
    }
    return this.i;
  }
  
  public int w()
  {
    if (!this.h) {
      C();
    }
    return this.j;
  }
  
  private void C()
  {
    this.h = true;
    this.b.a = this.e;
    int m = this.c.a(this.b, -1, (short)-1, true, false);
    if (m < 0)
    {
      this.i = -1;
      this.j = -1;
    }
    else
    {
      this.i = this.b.a;
      this.b.a = this.f;
      m = this.c.a(this.b, m, (short)this.i, true, true);
      if (this.i == this.j)
      {
        this.k = new zgs();
        this.c.a(m, this.k);
        this.l = zabt.a(this.k, this.a);
      }
      this.j = (this.b.a - this.e);
      this.i -= this.e;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */