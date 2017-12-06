package com.aspose.cells;

class zazg
  extends zazf
{
  private int l;
  private int m;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;
  private int r;
  private int s;
  
  public zazg(zaiw paramzaiw1, zaiw paramzaiw2, zahv paramzahv, zaca paramzaca, int paramInt1, int paramInt2)
  {
    super(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
    this.l = paramInt1;
    this.m = paramInt2;
    if (paramzaiw1.m())
    {
      this.n = true;
      this.o = false;
      this.p = false;
      this.q = paramzaiw2.n();
    }
    else
    {
      this.n = false;
      if (paramzaiw1.n())
      {
        this.o = true;
        this.q = false;
        this.p = paramzaiw2.m();
      }
      else
      {
        this.o = false;
        if (paramzaiw2.m())
        {
          this.p = true;
          this.q = false;
        }
        else
        {
          this.p = false;
          this.q = paramzaiw2.n();
        }
      }
    }
  }
  
  zazg(zazg paramzazg, zaca paramzaca)
  {
    super(paramzazg.a.b(paramzaca), paramzazg.b.b(paramzaca), (zahv)paramzazg.c.a(paramzaca), paramzaca);
    this.e = paramzazg.e;
    this.l = paramzazg.l;
    this.m = paramzazg.m;
    this.n = paramzazg.n;
    this.p = paramzazg.p;
    this.o = paramzazg.o;
    this.q = paramzazg.q;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazg(this, paramzaca);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == this.r) && (paramInt2 == this.s)) {
      return true;
    }
    this.j = null;
    if (this.n)
    {
      this.h = this.a.a(paramInt2);
      if (this.h)
      {
        this.r = paramInt1;
        this.s = this.a.j();
      }
    }
    else if (this.o)
    {
      this.h = this.a.a(paramInt1);
      if (this.h)
      {
        this.r = this.a.i();
        this.s = paramInt2;
      }
    }
    else
    {
      this.h = this.a.b(paramInt1, paramInt2);
      if (this.h)
      {
        this.r = this.a.i();
        this.s = this.a.j();
      }
    }
    this.f = this.h;
    if (this.p)
    {
      this.i = this.b.a(paramInt2);
      if (this.i)
      {
        d(paramInt1);
      }
      else if (this.r > paramInt1)
      {
        this.b.f();
        this.i = this.b.g();
        d(this.r);
      }
      else
      {
        this.g = false;
        if (!this.f) {
          return false;
        }
      }
    }
    else if (this.q)
    {
      this.i = this.b.a(paramInt1);
      if (this.i)
      {
        e(paramInt2);
      }
      else
      {
        this.g = false;
        if (!this.f) {
          return false;
        }
      }
    }
    else if (this.b.b(paramInt1, paramInt2))
    {
      this.i = true;
      C();
    }
    else
    {
      this.i = false;
      this.g = false;
      if (!this.f) {
        return false;
      }
    }
    return true;
  }
  
  private void d(int paramInt)
  {
    if (this.f)
    {
      if (this.r > paramInt)
      {
        this.f = false;
        this.g = true;
        this.r = paramInt;
        this.s = this.b.j();
      }
      else
      {
        int i = this.b.j();
        if (i == this.s)
        {
          this.g = true;
        }
        else if (i < this.s)
        {
          this.f = false;
          this.g = true;
          this.s = i;
        }
        else
        {
          this.g = false;
        }
      }
    }
    else
    {
      this.g = true;
      this.r = paramInt;
      this.s = this.b.j();
    }
  }
  
  private void e(int paramInt)
  {
    if (this.f)
    {
      int i = this.b.i();
      if (i == this.r)
      {
        this.g = true;
        if (this.s > paramInt)
        {
          this.f = false;
          this.s = paramInt;
        }
      }
      else if (i < this.r)
      {
        this.g = true;
        this.f = false;
        this.r = i;
        this.s = paramInt;
      }
      else
      {
        this.g = false;
      }
    }
    else
    {
      this.g = true;
      this.r = this.b.i();
      this.s = paramInt;
    }
  }
  
  private void C()
  {
    if (this.f)
    {
      int i = this.b.i();
      if (i == this.r)
      {
        int j = this.b.j();
        if (j == this.s)
        {
          this.g = true;
        }
        else if (j < this.s)
        {
          this.g = true;
          this.f = false;
          this.s = j;
        }
        else
        {
          this.g = false;
        }
      }
      else if (i < this.r)
      {
        this.f = false;
        this.g = true;
        this.r = i;
        this.s = this.b.j();
      }
      else
      {
        this.g = false;
      }
    }
    else
    {
      this.g = true;
      this.r = this.b.i();
      this.s = this.b.j();
    }
  }
  
  public boolean a(int paramInt)
  {
    this.j = null;
    return b(paramInt / this.l, paramInt % this.l);
  }
  
  public void f()
  {
    super.f();
    this.r = -1;
    this.s = this.m;
  }
  
  public boolean g()
  {
    if (this.k)
    {
      this.k = false;
      if (this.f)
      {
        if (this.p)
        {
          if (this.i) {
            return b(this.r, this.b.j());
          }
          this.r += 1;
          if (this.r < this.l)
          {
            this.b.f();
            if (this.b.g()) {
              return b(this.r, this.b.j());
            }
          }
          return false;
        }
        if (this.q) {
          return (this.i) && (b(this.b.i(), 0));
        }
        return (this.i) && (b(this.b.i(), this.b.j()));
      }
      if (this.n)
      {
        if (this.h) {
          return b(this.r, this.a.j());
        }
        this.r += 1;
        if (this.r < this.l)
        {
          this.a.f();
          if (this.a.g()) {
            return b(this.r, this.a.j());
          }
        }
        return false;
      }
      if (this.o) {
        return (this.h) && (b(this.a.i(), 0));
      }
      return (this.h) && (b(this.a.i(), this.a.j()));
    }
    this.j = null;
    int i = this.s + 1;
    int j;
    if (i >= this.m)
    {
      j = this.r + 1;
      if (j >= this.l) {
        return false;
      }
      i = 0;
      if (this.n)
      {
        this.a.f();
        this.h = this.a.g();
        this.f = false;
        if (this.q) {
          if (this.g)
          {
            if (this.b.g())
            {
              this.i = true;
              this.g = (this.b.i() == j);
            }
            else
            {
              this.i = false;
              this.g = false;
            }
          }
          else if (this.i) {
            this.g = (this.b.i() == j);
          }
        }
      }
      else if (this.o)
      {
        if (this.f)
        {
          if (this.a.g())
          {
            this.h = true;
            this.f = (this.a.i() == j);
          }
          else
          {
            this.h = false;
            this.f = false;
          }
        }
        else if (this.h) {
          this.f = (this.a.i() == j);
        }
        if (this.p)
        {
          this.b.f();
          this.i = this.b.g();
          this.g = false;
        }
      }
      else if (this.q)
      {
        if (this.g)
        {
          if (this.b.g())
          {
            this.i = true;
            this.g = (this.b.i() == j);
          }
          else
          {
            this.i = false;
            this.g = false;
          }
        }
        else if (this.i) {
          this.g = (this.b.i() == j);
        }
      }
      else if (this.p)
      {
        this.b.f();
        this.i = this.b.g();
        this.g = false;
      }
    }
    else
    {
      j = this.r;
    }
    this.r = this.l;
    this.s = this.m;
    if (this.f)
    {
      if (this.n)
      {
        if (this.a.g())
        {
          this.f = true;
          this.r = j;
          this.s = this.a.j();
        }
        else
        {
          if (!this.i) {
            return false;
          }
          if ((this.q) && (!this.g))
          {
            this.g = true;
            this.r = this.b.i();
            this.s = 0;
            this.a.f();
            if (this.a.g())
            {
              this.h = true;
              this.f = (this.a.j() == 0);
            }
            else
            {
              this.h = false;
              this.f = false;
            }
            return true;
          }
          this.h = false;
        }
      }
      else if (this.o)
      {
        this.r = j;
        this.s = i;
      }
      else if (this.a.g())
      {
        this.h = true;
        this.f = true;
        this.r = this.a.i();
        this.s = this.a.j();
      }
      else
      {
        if (!this.i) {
          return false;
        }
        this.h = false;
        this.f = false;
      }
    }
    else if (this.h)
    {
      this.f = true;
      if (this.n)
      {
        this.r = j;
        this.s = this.a.j();
      }
      else
      {
        this.r = this.a.i();
        if (this.o) {
          this.s = 0;
        } else {
          this.s = this.a.j();
        }
      }
    }
    if (this.g)
    {
      if (this.p)
      {
        if (this.b.g())
        {
          d(j);
        }
        else if (this.r > j)
        {
          this.b.f();
          if (this.b.g())
          {
            d(this.r);
          }
          else
          {
            if (!this.h) {
              return false;
            }
            this.i = false;
            this.g = false;
          }
        }
        else
        {
          if (!this.h) {
            return false;
          }
          this.i = false;
          this.g = false;
        }
      }
      else if (this.q)
      {
        if (this.f)
        {
          if (this.r > j)
          {
            this.f = false;
            this.r = j;
            this.s = i;
          }
          else if (this.s > i)
          {
            this.f = false;
            this.s = i;
          }
        }
        else
        {
          this.r = j;
          this.s = i;
        }
      }
      else if (this.b.g())
      {
        this.i = true;
        C();
      }
      else
      {
        if (!this.h) {
          return false;
        }
        this.i = false;
        this.g = false;
      }
    }
    else if (this.i)
    {
      if (this.p) {
        d(j);
      } else if (this.q) {
        e(this.s);
      } else {
        C();
      }
    }
    else if (!this.h) {
      return false;
    }
    return true;
  }
  
  public zaiw b(int paramInt)
  {
    if ((this.a.n()) || (this.b.n())) {
      return new zazp(this, this.d, paramInt);
    }
    return new zazh(this.a.b(paramInt), this.b.b(paramInt), this.c, this.d);
  }
  
  public zaiw c(int paramInt)
  {
    if ((this.a.m()) || (this.b.m())) {
      return new zazo(this, this.d, paramInt);
    }
    return new zazh(this.a.c(paramInt), this.b.c(paramInt), this.c, this.d);
  }
  
  public zaiw c(zaca paramzaca)
  {
    zbzd localzbzd = new zbzd(this, this.e, r(), t(), s(), u(), this.l, this.m);
    return new zazi(new zazg(this, paramzaca), localzbzd, paramzaca);
  }
  
  public int i()
  {
    return this.r;
  }
  
  public int j()
  {
    return this.s;
  }
  
  public int k()
  {
    return this.r * this.m + this.s;
  }
  
  public boolean m()
  {
    return (this.n) && (this.p);
  }
  
  public boolean n()
  {
    return (this.o) && (this.q);
  }
  
  public int c()
  {
    return this.l;
  }
  
  public int d()
  {
    return this.m;
  }
  
  public int e()
  {
    return this.l * this.m;
  }
  
  public boolean q()
  {
    return (this.a.q()) && (this.b.q());
  }
  
  public int r()
  {
    if ((this.n) || (this.p)) {
      return 0;
    }
    int i = this.a.r();
    if (i < 0) {
      return this.b.r();
    }
    int j = this.b.r();
    if ((j > -1) && (j < i)) {
      return j;
    }
    return i;
  }
  
  public int s()
  {
    return (this.n) || (this.p) ? this.l - 1 : Math.min(this.a.s(), this.b.s());
  }
  
  public int t()
  {
    if ((this.o) || (this.q)) {
      return 0;
    }
    int i = this.a.t();
    if (i < 0) {
      return this.b.t();
    }
    int j = this.b.t();
    if ((j > -1) && (j < i)) {
      return j;
    }
    return i;
  }
  
  public int u()
  {
    return (this.o) || (this.q) ? this.m - 1 : Math.max(this.a.u(), this.b.u());
  }
  
  public int v()
  {
    if (this.n)
    {
      if (this.q) {
        return 0;
      }
      i = this.a.t();
      if (i < 0) {
        return this.b.t();
      }
      j = this.b.t();
      if ((j > -1) && (j < i)) {
        return j;
      }
      return i;
    }
    if (this.p)
    {
      if (this.o) {
        return 0;
      }
      i = this.a.t();
      if (i < 0) {
        return this.b.t();
      }
      j = this.b.t();
      if ((j > -1) && (j < i)) {
        return j;
      }
      return i;
    }
    if ((this.o) || (this.q))
    {
      i = this.a.r();
      if (i < 0) {
        return this.b.r() * this.m;
      }
      j = this.b.r();
      if ((j > -1) && (j < i)) {
        return j * this.m;
      }
      return i * this.m;
    }
    int i = this.a.v();
    if (i < 0) {
      return this.b.v();
    }
    int j = this.b.v();
    if ((j > -1) && (j < i)) {
      return j;
    }
    return i;
  }
  
  public int w()
  {
    if (this.n)
    {
      if (this.q) {
        return 0;
      }
      return (this.l - 1) * this.m + Math.max(this.a.u(), this.b.u());
    }
    if (this.p)
    {
      if (this.o) {
        return 0;
      }
      return (this.l - 1) * this.m + Math.max(this.a.u(), this.b.u());
    }
    if ((this.o) || (this.q)) {
      return Math.max(this.a.s(), this.b.s()) * this.m + this.m - 1;
    }
    return Math.max(this.a.w(), this.b.w());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */