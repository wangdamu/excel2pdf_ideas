package com.aspose.cells;

class zazd
  extends zaze
{
  private zahu c;
  private zaie d;
  private zaie e;
  
  public zazd(zaiw paramzaiw, zahu paramzahu, zaca paramzaca)
  {
    super(paramzaiw, paramzaca);
    this.c = paramzahu;
  }
  
  private zazd(zaiw paramzaiw, zahu paramzahu, zaca paramzaca, zaie paramzaie)
  {
    super(paramzaiw, paramzaca);
    this.c = paramzahu;
    this.d = paramzaie;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazd(this.a.b(paramzaca), (zahu)this.c.a(paramzaca), paramzaca, this.d);
  }
  
  public int b()
  {
    return this.c.b();
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    zaie localzaie = this.a.a(paramInt1, paramInt2);
    if (this.a.a(localzaie))
    {
      if (this.d == null)
      {
        this.d = this.c.a(localzaie, false);
        this.d.a(false);
      }
      return this.d;
    }
    return this.c.a(localzaie);
  }
  
  public void f()
  {
    this.a.f();
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    this.e = null;
    return this.a.b(paramInt1, paramInt2);
  }
  
  public boolean a(int paramInt)
  {
    this.e = null;
    return this.a.a(paramInt);
  }
  
  public boolean g()
  {
    this.e = null;
    return this.a.g();
  }
  
  public zaie h()
  {
    if (this.e != null) {
      return this.e;
    }
    this.e = this.c.a(this.a.h());
    return this.e;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.a.m()) {
      return this;
    }
    if (this.a.n()) {
      return new zbak(a(paramInt, 0));
    }
    return new zazd(this.a.b(paramInt), this.c, this.b, this.d);
  }
  
  public zaiw c(int paramInt)
  {
    if (this.a.n()) {
      return this;
    }
    if (this.a.m()) {
      return new zbak(a(0, paramInt));
    }
    return new zazd(this.a.c(paramInt), this.c, this.b, this.d);
  }
  
  public zaiw c(zaca paramzaca)
  {
    Object localObject;
    if (this.a.c() == 1) {
      localObject = new zbzb(this, this.d, this.a.t(), this.a.u(), this.a.d(), false);
    } else if (this.a.d() == 1) {
      localObject = new zbzb(this, this.d, this.a.r(), this.a.s(), this.a.c(), true);
    } else {
      localObject = new zbzd(this, this.d, this.a.r(), this.a.t(), this.a.s(), this.a.u(), this.a.c(), this.a.d());
    }
    return new zazi(b(paramzaca), (zajw)localObject, paramzaca);
  }
  
  public zaie o()
  {
    if (this.d == null)
    {
      this.d = this.c.a(this.a.o(), false);
      this.d.a(false);
    }
    return this.d;
  }
  
  public zaie p()
  {
    if (this.d != null) {
      return this.d;
    }
    zaie localzaie = this.a.p();
    if (localzaie == null) {
      return null;
    }
    this.d = this.c.a(localzaie, true);
    if (this.d != null) {
      this.d.a(false);
    }
    return this.d;
  }
  
  public boolean a(zaie paramzaie)
  {
    return paramzaie == this.d;
  }
  
  public boolean z()
  {
    if (!this.c.a()) {
      return false;
    }
    return this.a.z();
  }
  
  public void b(boolean paramBoolean)
  {
    this.c.a(paramBoolean);
    this.a.b(paramBoolean);
  }
  
  public void a(zaca paramzaca)
  {
    super.a(paramzaca);
    this.c.b(this.b);
  }
  
  public boolean A()
  {
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */