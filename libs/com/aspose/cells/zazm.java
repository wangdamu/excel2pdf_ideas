package com.aspose.cells;

class zazm
  extends zazk
{
  private zwr c;
  private int d;
  private int e;
  private short f;
  private int g;
  private int h = -1;
  private boolean i = false;
  private int j;
  private int k;
  private int l;
  private int m;
  private zaie n;
  
  public zazm(zaca paramzaca, zwr paramzwr, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramzaca);
    this.c = paramzwr;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = ((short)paramInt1);
    this.j = paramzwr.d(paramInt2);
    if (this.j < 0) {
      this.j = (-this.j - 1);
    }
    this.k = paramzwr.d(paramInt3);
    if (this.k < 0) {
      this.k = (-this.k - 2);
    }
    if (this.k < this.j)
    {
      this.i = true;
      this.j = -1;
      this.k = -1;
      this.l = -1;
      this.m = -1;
    }
    else if (this.k == this.j)
    {
      this.i = true;
      zwn localzwn = paramzwr.b(this.j);
      this.n = a(localzwn, paramInt1);
      if (this.n != zabg.a)
      {
        this.l = (localzwn.a() - this.d);
        this.m = this.l;
        this.h = this.l;
      }
      else
      {
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
      }
    }
    else
    {
      this.l = (paramzwr.b(this.j).a() - this.d);
      this.m = (paramzwr.b(this.k).a() - this.d);
      this.g = (this.j - 1);
    }
  }
  
  private zazm(zazm paramzazm, zaca paramzaca)
  {
    super(paramzaca == null ? paramzazm.a : paramzaca);
    this.c = paramzazm.c;
    this.d = paramzazm.d;
    this.e = paramzazm.e;
    this.f = paramzazm.f;
    this.h = paramzazm.h;
    this.i = paramzazm.i;
    this.j = paramzazm.j;
    this.k = paramzazm.k;
    this.l = paramzazm.l;
    this.m = paramzazm.m;
    this.n = paramzazm.n;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazm(this, paramzaca);
  }
  
  public int c()
  {
    return this.e - this.d + 1;
  }
  
  public int d()
  {
    return 1;
  }
  
  public int e()
  {
    return c();
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
    return true;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < this.l) || (paramInt1 > this.m)) {
      return null;
    }
    if (this.l == this.m) {
      return this.n;
    }
    int i1 = this.c.d(paramInt1 + this.d);
    if (i1 < 0) {
      return zabg.a;
    }
    return a(this.c.b(i1), this.f);
  }
  
  public void f()
  {
    if (this.j > -1) {
      this.g = (this.j - 1);
    } else {
      this.g = 0;
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return a(paramInt1);
  }
  
  public boolean a(int paramInt)
  {
    if (paramInt > this.m) {
      return false;
    }
    if (this.l == this.m)
    {
      this.g = 0;
      return true;
    }
    if (this.h == paramInt) {
      return true;
    }
    if (this.h > paramInt) {
      this.g = this.j;
    } else {
      this.g += 1;
    }
    paramInt += this.d;
    while (this.g <= this.k)
    {
      zwn localzwn = this.c.b(this.g);
      if (localzwn.a() >= paramInt)
      {
        this.n = a(localzwn, this.f);
        if (this.n != zabg.a)
        {
          this.h = (localzwn.a() - this.d);
          return true;
        }
      }
      this.g += 1;
    }
    return false;
  }
  
  public boolean g()
  {
    if (this.l < 0) {
      return false;
    }
    if (this.l == this.m)
    {
      if (this.g < 0) {
        return false;
      }
      this.g = -1;
      return true;
    }
    if (this.g >= this.k) {
      return false;
    }
    this.g += 1;
    zwn localzwn = this.c.b(this.g);
    this.n = a(localzwn, this.f);
    if (this.n != zabg.a)
    {
      this.h = (localzwn.a() - this.d);
      return true;
    }
    for (this.g += 1; this.g <= this.k; this.g += 1)
    {
      localzwn = this.c.b(this.g);
      this.n = a(localzwn, this.f);
      if (this.n != zabg.a)
      {
        this.h = (localzwn.a() - this.d);
        return true;
      }
    }
    return false;
  }
  
  public zaie h()
  {
    return this.n;
  }
  
  public int i()
  {
    return this.h;
  }
  
  public int j()
  {
    return 0;
  }
  
  public int k()
  {
    return this.h;
  }
  
  public zaiw b(int paramInt)
  {
    int i1 = this.c.d(paramInt + this.d);
    if (i1 < 0) {
      return new zbak(null);
    }
    return new zbak(a(this.c.b(i1), this.f));
  }
  
  public zaiw c(int paramInt)
  {
    return this;
  }
  
  public boolean q()
  {
    return this.i;
  }
  
  public int r()
  {
    if (!this.i) {
      C();
    }
    return this.l;
  }
  
  public int s()
  {
    if (!this.i) {
      C();
    }
    return this.m;
  }
  
  public int t()
  {
    if (!this.i) {
      C();
    }
    return this.l < 0 ? -1 : 0;
  }
  
  public int u()
  {
    if (!this.i) {
      C();
    }
    return this.l < 0 ? -1 : 0;
  }
  
  public int v()
  {
    if (!this.i) {
      C();
    }
    return this.l;
  }
  
  public int w()
  {
    if (!this.i) {
      C();
    }
    return this.m;
  }
  
  private void C()
  {
    this.i = true;
    for (this.g = this.j; this.g <= this.k; this.g += 1)
    {
      zwn localzwn = this.c.b(this.g);
      this.n = a(localzwn, this.f);
      if (this.n != zabg.a)
      {
        this.j = this.g;
        this.l = (localzwn.a() - this.d);
        if (this.g < this.k) {
          for (this.g = this.k; this.g > this.j; this.g -= 1)
          {
            localzwn = this.c.b(this.g);
            this.n = a(localzwn, this.f);
            if (this.n != zabg.a)
            {
              this.k = this.g;
              this.m = (localzwn.a() - this.d);
              return;
            }
          }
        }
        this.k = this.j;
        this.m = this.l;
        this.h = this.l;
        return;
      }
    }
    this.j = -1;
    this.k = -1;
    this.l = -1;
    this.m = -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */