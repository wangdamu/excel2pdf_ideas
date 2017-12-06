package com.aspose.cells;

abstract class zazf
  extends zayp
{
  protected zaiw a;
  protected zaiw b;
  protected zahv c;
  protected zaca d;
  protected zaie e;
  protected boolean f;
  protected boolean g;
  protected boolean h;
  protected boolean i;
  protected zaie j;
  protected boolean k;
  
  public zazf(zaiw paramzaiw1, zaiw paramzaiw2, zahv paramzahv, zaca paramzaca)
  {
    this.a = paramzaiw1;
    this.b = paramzaiw2;
    this.c = paramzahv;
    this.d = paramzaca;
  }
  
  public int b()
  {
    return this.c.b();
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    zaie localzaie1 = this.a.a(paramInt1, paramInt2);
    if (this.c.a(localzaie1)) {
      return this.c.e();
    }
    zaie localzaie2 = this.b.a(paramInt1, paramInt2);
    if ((this.a.a(localzaie1)) && (this.b.a(localzaie2)))
    {
      if (this.e == null)
      {
        if (this.c.b(localzaie2)) {
          this.e = this.c.e();
        } else {
          this.e = this.c.d();
        }
        this.e.a(false);
      }
      return this.e;
    }
    if (this.c.b(localzaie2)) {
      return this.c.e();
    }
    return this.c.d();
  }
  
  public void f()
  {
    this.a.f();
    this.b.f();
    this.h = true;
    this.i = true;
    this.f = true;
    this.g = true;
    this.k = false;
  }
  
  public zaie h()
  {
    if (this.j != null) {
      return this.j;
    }
    if (this.f)
    {
      if (this.c.a(this.a.h()))
      {
        this.j = this.c.e();
        return this.j;
      }
      if (this.g)
      {
        if (this.c.b(this.b.h()))
        {
          this.j = this.c.e();
          return this.j;
        }
      }
      else if (this.c.b(this.b.o()))
      {
        if (this.c.f()) {
          this.k = true;
        }
        this.j = this.c.e();
        return this.j;
      }
    }
    else
    {
      if (this.c.a(this.a.o()))
      {
        if (this.c.f()) {
          this.k = true;
        }
        this.j = this.c.e();
        return this.j;
      }
      if (this.c.b(this.b.h()))
      {
        this.j = this.c.e();
        return this.j;
      }
    }
    this.j = this.c.d();
    return this.j;
  }
  
  public zaie o()
  {
    if (this.e == null)
    {
      if ((this.c.a(this.a.o())) || (this.c.b(this.b.o()))) {
        this.e = this.c.e();
      } else {
        this.e = this.c.b(false);
      }
      this.e.a(false);
    }
    return this.e;
  }
  
  public zaie p()
  {
    if (this.e == null)
    {
      zaie localzaie = this.a.p();
      if (localzaie == null) {
        return null;
      }
      if (this.c.a(localzaie))
      {
        this.e = this.c.e();
      }
      else
      {
        localzaie = this.b.p();
        if (localzaie == null) {
          return null;
        }
        if (this.c.b(localzaie))
        {
          this.e = this.c.e();
        }
        else
        {
          this.e = this.c.b(true);
          if (this.e == null) {
            return null;
          }
        }
      }
      this.e.a(false);
    }
    return this.e;
  }
  
  public boolean a(zaie paramzaie)
  {
    return paramzaie == this.e;
  }
  
  public boolean z()
  {
    if (!this.c.a()) {
      return false;
    }
    if (!this.a.z()) {
      return false;
    }
    return this.b.z();
  }
  
  public void b(boolean paramBoolean)
  {
    this.c.a(paramBoolean);
    this.a.b(paramBoolean);
    this.b.b(paramBoolean);
  }
  
  public void a(zaca paramzaca)
  {
    if (this.d != paramzaca)
    {
      this.d.d = paramzaca.d;
      this.d.e = paramzaca.e;
    }
    this.a.a(this.d);
    this.b.a(this.d);
    this.c.b(this.d);
  }
  
  public boolean x()
  {
    return this.a.x();
  }
  
  public boolean y()
  {
    return this.a.y();
  }
  
  public boolean l()
  {
    return false;
  }
  
  public boolean a(zaca paramzaca, int[] paramArrayOfInt)
  {
    this.a.a(paramzaca, paramArrayOfInt);
    int m = paramArrayOfInt[0];
    int n = paramArrayOfInt[1];
    int i1 = paramArrayOfInt[2];
    int i2 = paramArrayOfInt[3];
    this.b.a(paramzaca, paramArrayOfInt);
    if (m < paramArrayOfInt[0]) {
      paramArrayOfInt[0] = m;
    }
    if (n < paramArrayOfInt[1]) {
      paramArrayOfInt[1] = n;
    }
    if (i1 > paramArrayOfInt[2]) {
      paramArrayOfInt[2] = i1;
    }
    if (i2 > paramArrayOfInt[3]) {
      paramArrayOfInt[3] = i2;
    }
    return true;
  }
  
  public boolean b(zaca paramzaca, int[] paramArrayOfInt)
  {
    this.a.b(paramzaca, paramArrayOfInt);
    int m = paramArrayOfInt[0];
    int n = paramArrayOfInt[1];
    this.b.b(paramzaca, paramArrayOfInt);
    if (m < paramArrayOfInt[0]) {
      paramArrayOfInt[0] = m;
    }
    if (n > paramArrayOfInt[1]) {
      paramArrayOfInt[1] = n;
    }
    return true;
  }
  
  public boolean a()
  {
    return (this.a.a()) && (this.b.a());
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
    this.b.a(paramBoolean);
  }
  
  public boolean A()
  {
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */