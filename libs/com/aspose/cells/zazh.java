package com.aspose.cells;

class zazh
  extends zazf
{
  private boolean l;
  
  public zazh(zaiw paramzaiw1, zaiw paramzaiw2, zahv paramzahv, zaca paramzaca)
  {
    super(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
    this.l = ((this.a.m()) || (this.a.n()));
  }
  
  zazh(zaiw paramzaiw1, zaiw paramzaiw2, zazh paramzazh, zaca paramzaca)
  {
    super(paramzaiw1, paramzaiw2, (zahv)paramzazh.c.a(paramzaca), paramzaca);
    this.l = paramzazh.l;
    this.e = paramzazh.e;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazh(this.a.b(paramzaca), this.b.b(paramzaca), this, paramzaca);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (this.j != null)
    {
      if (this.f)
      {
        if ((paramInt1 == this.a.i()) && (paramInt2 == this.a.j())) {
          return true;
        }
      }
      else if ((this.g) && (paramInt1 == this.b.i()) && (paramInt2 == this.b.j())) {
        return true;
      }
      this.j = null;
    }
    this.h = this.a.b(paramInt1, paramInt2);
    this.i = this.b.b(paramInt1, paramInt2);
    return C();
  }
  
  public boolean a(int paramInt)
  {
    if (this.j != null)
    {
      if (this.f)
      {
        if (paramInt == this.a.k()) {
          return true;
        }
      }
      else if ((this.g) && (paramInt == this.b.k())) {
        return true;
      }
      this.j = null;
    }
    this.h = this.a.a(paramInt);
    this.i = this.b.a(paramInt);
    return C();
  }
  
  private boolean C()
  {
    if (this.h)
    {
      if (this.i)
      {
        int i;
        if (this.l)
        {
          i = this.a.k() - this.b.k();
        }
        else
        {
          i = this.a.i() - this.b.i();
          if (i == 0) {
            i = this.a.j() - this.b.j();
          }
        }
        if (i > 0)
        {
          this.f = false;
          this.g = true;
        }
        else
        {
          this.f = true;
          this.g = (i == 0);
        }
      }
      else
      {
        this.f = true;
        this.g = false;
      }
      return true;
    }
    if (this.i)
    {
      this.f = false;
      this.g = true;
      return true;
    }
    return false;
  }
  
  public boolean g()
  {
    if (this.k)
    {
      this.k = false;
      this.j = null;
      if (this.f)
      {
        if (this.i)
        {
          if (this.l) {
            this.h = this.a.a(this.b.k());
          } else {
            this.h = this.a.b(this.b.i(), this.b.j());
          }
          return C();
        }
      }
      else if (this.h)
      {
        if (this.l) {
          this.i = this.b.a(this.a.k());
        } else {
          this.i = this.b.b(this.a.i(), this.a.j());
        }
        return C();
      }
      return false;
    }
    this.j = null;
    if (this.f)
    {
      this.h = this.a.g();
      if (this.g) {
        this.i = this.b.g();
      }
      return C();
    }
    if (this.g)
    {
      this.i = this.b.g();
      return C();
    }
    return false;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.a.m()) {
      return this;
    }
    if (this.a.n()) {
      return new zbak(a(paramInt, 0));
    }
    return new zazh(this.a.b(paramInt), this.b.b(paramInt), this, null);
  }
  
  public zaiw c(int paramInt)
  {
    if (this.a.n()) {
      return this;
    }
    if (this.a.m()) {
      return new zbak(a(0, paramInt));
    }
    return new zazh(this.a.c(paramInt), this.b.c(paramInt), this, null);
  }
  
  public zaiw c(zaca paramzaca)
  {
    Object localObject;
    if (this.l) {
      localObject = new zbzb(this, this.e, Math.min(this.a.v(), this.b.v()), Math.max(this.a.w(), this.b.w()), this.a.m() ? this.a.d() : this.a.c(), this.a.n());
    } else {
      localObject = new zbzd(this, this.e, Math.min(this.a.r(), this.b.r()), Math.min(this.a.t(), this.b.t()), Math.max(this.a.s(), this.b.s()), Math.max(this.a.u(), this.b.u()), this.a.c(), this.a.d());
    }
    return new zazi(new zazh(this.a, this.b, this, paramzaca), (zajw)localObject, paramzaca);
  }
  
  public int i()
  {
    return this.f ? this.a.i() : this.b.i();
  }
  
  public int j()
  {
    return this.f ? this.a.j() : this.b.j();
  }
  
  public int k()
  {
    return this.f ? this.a.k() : this.b.k();
  }
  
  public boolean m()
  {
    return this.a.m();
  }
  
  public boolean n()
  {
    return this.a.n();
  }
  
  public int c()
  {
    return this.a.c();
  }
  
  public int d()
  {
    return this.a.d();
  }
  
  public int e()
  {
    return this.a.e();
  }
  
  public boolean q()
  {
    return (this.a.q()) && (this.b.q());
  }
  
  public int r()
  {
    int i = this.a.r();
    if (i < 0) {
      return this.b.r();
    }
    int j = this.b.r();
    if ((j < 0) || (j > i)) {
      return i;
    }
    return j;
  }
  
  public int s()
  {
    return Math.max(this.a.s(), this.b.s());
  }
  
  public int t()
  {
    int i = this.a.t();
    if (i < 0) {
      return this.b.t();
    }
    int j = this.b.t();
    if ((j < 0) || (j > i)) {
      return i;
    }
    return j;
  }
  
  public int u()
  {
    return Math.max(this.a.u(), this.b.u());
  }
  
  public int v()
  {
    int i = this.a.v();
    if (i < 0) {
      return this.b.v();
    }
    int j = this.b.v();
    if ((j < 0) || (j > i)) {
      return i;
    }
    return j;
  }
  
  public int w()
  {
    return Math.max(this.a.w(), this.b.w());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */