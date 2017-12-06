package com.aspose.cells;

class zazi
  extends zaze
{
  private zajw c;
  private boolean d;
  
  public zazi(zaiw paramzaiw, zajw paramzajw, zaca paramzaca)
  {
    super(paramzaiw, paramzaca);
    this.c = paramzajw;
  }
  
  public zaiw b(zaca paramzaca)
  {
    zaiw localzaiw = this.a.b(paramzaca);
    return new zazi(localzaiw, this.c.a(localzaiw), paramzaca);
  }
  
  public int b()
  {
    return this.a.b();
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    zaie localzaie = this.c.c(paramInt1, paramInt2);
    if (localzaie != null) {
      return localzaie;
    }
    localzaie = this.a.a(paramInt1, paramInt2);
    if (localzaie.b(this.b, false) == 3)
    {
      localzaie = localzaie.e(this.b);
    }
    else
    {
      if (!this.a.z()) {
        localzaie = localzaie.m();
      }
      localzaie.a(false);
    }
    this.c.a(paramInt1, paramInt2, localzaie);
    return localzaie;
  }
  
  public void f()
  {
    this.c.a();
    this.a.f();
    this.d = false;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (this.c.a(paramInt1, paramInt2))
    {
      if (this.c.c() != null)
      {
        this.d = true;
        return true;
      }
      if (this.a.b(paramInt1, paramInt2))
      {
        this.c.b(this.a.i(), this.a.j());
        this.d = false;
        return true;
      }
      this.c.g();
    }
    return false;
  }
  
  public boolean a(int paramInt)
  {
    if (this.c.a(paramInt))
    {
      if (this.c.c() != null)
      {
        this.d = true;
        return true;
      }
      if (this.a.a(paramInt))
      {
        this.c.d(this.a.k());
        this.d = false;
        return true;
      }
      this.c.g();
    }
    return false;
  }
  
  public boolean g()
  {
    if (this.c.b())
    {
      if (this.c.c() != null)
      {
        this.d = true;
        return true;
      }
      if (this.d)
      {
        if (this.a.b(this.c.d(), this.c.e()))
        {
          this.c.b(this.a.i(), this.a.j());
          this.d = false;
          return true;
        }
      }
      else if (this.a.g())
      {
        int i = this.a.i();
        int j = this.a.j();
        if (i == this.c.d())
        {
          if (j < this.c.e())
          {
            if (this.a.b(this.c.d(), this.c.e()))
            {
              this.c.b(this.a.i(), this.a.j());
              return true;
            }
          }
          else
          {
            if (j > this.c.e()) {
              this.c.b(i, j);
            }
            return true;
          }
        }
        else if (i < this.c.d())
        {
          if (this.a.b(this.c.d(), this.c.e()))
          {
            this.c.b(this.a.i(), this.a.j());
            return true;
          }
        }
        else
        {
          this.c.b(i, j);
          return true;
        }
      }
      this.c.g();
    }
    return false;
  }
  
  public zaie h()
  {
    if (this.c.c() == null)
    {
      zaie localzaie = this.a.h();
      if (localzaie.b(this.b, false) == 3)
      {
        localzaie = localzaie.e(this.b);
      }
      else
      {
        if (!this.a.z()) {
          localzaie = localzaie.m();
        }
        localzaie.a(false);
      }
      this.c.a(localzaie);
    }
    return this.c.c();
  }
  
  public int i()
  {
    return this.c.d();
  }
  
  public int j()
  {
    return this.c.e();
  }
  
  public int k()
  {
    return this.c.f();
  }
  
  public zaiw b(int paramInt)
  {
    if (this.a.m()) {
      return this;
    }
    if (this.a.n()) {
      return new zbak(a(paramInt, 0));
    }
    return new zazi(this.a.b(paramInt), this.c.b(paramInt), this.b);
  }
  
  public zaiw c(int paramInt)
  {
    if (this.a.n()) {
      return this;
    }
    if (this.a.m()) {
      return new zbak(a(0, paramInt));
    }
    return new zazi(this.a.c(paramInt), this.c.c(paramInt), this.b);
  }
  
  public zaiw c(zaca paramzaca)
  {
    zaiw localzaiw = this.c.a(paramzaca, this.a.b());
    if (localzaiw != null)
    {
      localzaiw.a(true);
      return localzaiw;
    }
    return this;
  }
  
  public boolean z()
  {
    return this.a.z();
  }
  
  public void b(boolean paramBoolean)
  {
    this.a.b(paramBoolean);
  }
  
  public void a(zaca paramzaca)
  {
    super.a(paramzaca);
    this.c.a(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */