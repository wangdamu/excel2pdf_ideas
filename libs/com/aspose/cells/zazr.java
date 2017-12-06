package com.aspose.cells;

class zazr
  extends zayo
{
  private zaie g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private boolean n;
  private boolean o;
  
  public zazr(zaie paramzaie1, zaie paramzaie2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, paramzaie2, paramInt6, paramInt7, paramBoolean1, paramBoolean2);
    this.g = paramzaie1;
    this.h = paramInt2;
    this.i = paramInt3;
    this.j = (paramInt2 * paramInt3);
    this.k = paramInt4;
    this.l = paramInt5;
    C();
    this.o = true;
  }
  
  zazr(zazr paramzazr)
  {
    super(paramzazr.b, paramzazr.a, paramzazr.e, paramzazr.f, paramzazr.c, paramzazr.d);
    this.g = paramzazr.g;
    this.h = paramzazr.h;
    this.i = paramzazr.i;
    this.j = paramzazr.j;
    this.k = paramzazr.k;
    this.l = paramzazr.l;
    this.m = paramzazr.m;
    this.n = paramzazr.n;
    this.o = paramzazr.o;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazr(this);
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
    return this.j;
  }
  
  public boolean l()
  {
    return (this.h == 1) && (this.i == 1);
  }
  
  public boolean m()
  {
    return this.h == 1;
  }
  
  public boolean n()
  {
    return this.i == 1;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if ((!this.n) && (paramInt1 == this.k) && (paramInt2 == this.l)) {
      return this.g;
    }
    return this.a;
  }
  
  public void f()
  {
    if (this.n) {
      return;
    }
    this.o = false;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (this.n) {
      return false;
    }
    this.o = true;
    return (paramInt1 < this.k) || ((paramInt1 == this.k) && (paramInt2 <= this.l));
  }
  
  public boolean a(int paramInt)
  {
    if (this.n) {
      return false;
    }
    if (paramInt <= this.m)
    {
      this.o = false;
      return true;
    }
    return false;
  }
  
  public boolean g()
  {
    if (this.o) {
      return false;
    }
    this.o = true;
    return true;
  }
  
  public zaie h()
  {
    return this.g;
  }
  
  public int i()
  {
    return this.k;
  }
  
  public int j()
  {
    return this.l;
  }
  
  public int k()
  {
    return this.m;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.h == 1) {
      return this;
    }
    if (paramInt != this.k) {
      return new zazj(this.a, this.b, 1, this.i);
    }
    return new zazr(this.g, this.a, this.b, 1, this.i, 0, this.l, this.e, this.f, false, false);
  }
  
  public zaiw c(int paramInt)
  {
    if (this.i == 1) {
      return this;
    }
    if (paramInt != this.l) {
      return new zazj(this.a, this.b, this.h, 1);
    }
    return new zazr(this.g, this.a, this.b, this.h, 1, this.k, 0, this.e, this.f, false, false);
  }
  
  public void a(zaca paramzaca)
  {
    if (this.c)
    {
      if (paramzaca.d != this.e)
      {
        this.k -= paramzaca.d - this.e;
        this.e = paramzaca.d;
      }
      if ((this.d) && (paramzaca.e != this.f))
      {
        this.l -= paramzaca.e - this.f;
        this.f = paramzaca.e;
      }
      C();
    }
    else if ((this.d) && (paramzaca.e != this.f))
    {
      this.l -= paramzaca.e - this.f;
      this.f = paramzaca.e;
      C();
    }
  }
  
  public boolean q()
  {
    return true;
  }
  
  public int s()
  {
    return this.n ? -1 : this.k;
  }
  
  public int r()
  {
    return this.n ? -1 : this.k;
  }
  
  public int u()
  {
    return this.n ? -1 : this.l;
  }
  
  public int t()
  {
    return this.n ? -1 : this.l;
  }
  
  private void C()
  {
    if ((this.k < 0) || (this.l < 0) || (this.h <= this.k) || (this.i <= this.l))
    {
      this.n = true;
      this.m = -1;
    }
    else
    {
      this.m = (this.k * this.i + this.l);
      this.n = false;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */