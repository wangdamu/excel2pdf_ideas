package com.aspose.cells;

class zbzb
  implements zajw
{
  private zaiw a;
  private zaie[] b;
  private zbza c;
  private boolean d;
  private boolean e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private zaie k;
  private boolean l = true;
  private zaie m;
  
  public zbzb(zaiw paramzaiw, zaie paramzaie, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.a = paramzaiw;
    this.b = new zaie[paramInt2 - paramInt1 + 1];
    this.c = new zbza(this.b.length);
    if (paramzaie != null) {
      b(paramzaie);
    } else {
      this.l = true;
    }
    this.f = paramInt3;
    this.d = paramBoolean;
    this.e = false;
    this.h = (-paramInt1);
    this.g = 0;
    this.i = Math.min(this.b.length, this.h + this.f);
  }
  
  public zbzb(zaie[] paramArrayOfzaie, zaiw paramzaiw, zaie paramzaie, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, zbza paramzbza)
  {
    this.b = paramArrayOfzaie;
    this.a = paramzaiw;
    this.c = paramzbza;
    if (paramzaie != null) {
      b(paramzaie);
    } else {
      this.l = true;
    }
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.g = paramInt3;
    this.f = paramInt2;
    this.h = paramInt1;
    this.i = Math.min(this.b.length, this.h + this.f);
  }
  
  public zajw a(zaiw paramzaiw)
  {
    return new zbzb(this.b, paramzaiw, this.k, this.h, this.f, this.g, this.d, this.e, this.c);
  }
  
  public void a()
  {
    this.j = Math.max(this.h - 1, -1);
  }
  
  public boolean b()
  {
    this.j += 1;
    if (this.j < this.i)
    {
      this.m = this.b[this.j];
      if ((this.l) || (this.m != this.k)) {
        return true;
      }
      this.j += 1;
      if (this.j < this.i)
      {
        do
        {
          this.m = this.b[this.j];
          if ((this.l) || (this.m != this.k)) {
            return true;
          }
          this.j += 1;
        } while (this.j != this.i);
        return false;
      }
    }
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return a(this.d ? paramInt1 : paramInt2);
  }
  
  public boolean a(int paramInt)
  {
    paramInt += this.h;
    if (paramInt <= 0)
    {
      this.j = -1;
    }
    else
    {
      if (paramInt == this.j) {
        return this.j < this.i;
      }
      if (paramInt >= this.i)
      {
        this.j = this.i;
        return false;
      }
      this.j = (paramInt - 1);
    }
    return b();
  }
  
  public zaie c()
  {
    return this.m;
  }
  
  public int d()
  {
    return this.d ? this.j - this.h : 0;
  }
  
  public int e()
  {
    return this.d ? 0 : this.j - this.h;
  }
  
  public int f()
  {
    return this.j - this.h;
  }
  
  public zaiw a(zaca paramzaca, int paramInt)
  {
    if (!this.c.a()) {
      return null;
    }
    zaie localzaie = null;
    int i1 = this.f;
    if (paramzaca.j) {
      if (this.d)
      {
        if ((this.a.x()) && (!paramzaca.l.d())) {
          i1 += paramzaca.l.f() - 1;
        }
      }
      else if ((this.a.y()) && (!paramzaca.l.e())) {
        i1 += paramzaca.l.g() - 1;
      }
    }
    int n;
    if (i1 > this.c.b())
    {
      if (this.k == null)
      {
        this.k = this.a.p();
        if (this.k == null) {
          return null;
        }
      }
      localzaie = this.k;
      n = i1 - this.c.b() + this.c.c(localzaie);
    }
    else
    {
      localzaie = this.c.d();
      if (localzaie == null) {
        localzaie = this.k;
      }
      n = this.c.c(localzaie);
      if (localzaie == null) {
        localzaie = this.k;
      }
    }
    if (n >= i1)
    {
      if (this.d) {
        return new zazj(localzaie, paramInt, this.f, 1);
      }
      return new zazj(localzaie, paramInt, 1, this.f);
    }
    if (localzaie == zaba.a)
    {
      i2 = this.c.c(zaba.b);
      if (n + i2 >= i1) {
        return zbam.a(this.b, zaba.b, zaba.a, paramInt, i2, 0, this.b.length, this.h, this.f, this.d, this.g, this.e);
      }
    }
    else if (localzaie == zaba.b)
    {
      i2 = this.c.c(zaba.a);
      if (n + i2 >= i1) {
        return zbam.a(this.b, zaba.a, zaba.b, paramInt, i2, 0, this.b.length, this.h, this.f, this.d, this.g, this.e);
      }
    }
    for (int i2 = 0; i2 < this.b.length; i2++) {
      if (this.b[i2] != localzaie)
      {
        for (int i3 = this.b.length - 1; i3 > i2; i3--) {
          if (this.b[i3] != localzaie)
          {
            zaie[] arrayOfzaie = new zaie[i3 - i2 + 1];
            while (i3 >= i2)
            {
              arrayOfzaie[(i3 - i2)] = this.b[i3];
              i3--;
            }
            return new zayq(arrayOfzaie, this.d, this.h - i2, this.f, paramInt, localzaie, this.g, this.e);
          }
        }
        if (this.d) {
          return new zazr(this.b[i2], localzaie, paramInt, this.f, 1, i2 - this.h, 0, this.g, 0, this.e, false);
        }
        return new zazr(this.b[i2], localzaie, paramInt, 1, this.f, 0, i2 - this.h, 0, this.g, false, this.e);
      }
    }
    if (this.d) {
      return new zazj(localzaie, paramInt, this.f, 1);
    }
    return new zazj(localzaie, paramInt, 1, this.f);
  }
  
  public zajw b(int paramInt)
  {
    return this;
  }
  
  public zajw c(int paramInt)
  {
    return this;
  }
  
  public void a(zaca paramzaca)
  {
    if (this.e) {
      if (this.d)
      {
        if (paramzaca.d != this.g)
        {
          this.h += paramzaca.d - this.g;
          this.g = paramzaca.d;
          this.i = Math.min(this.b.length, this.h + this.f);
        }
      }
      else if (paramzaca.e != this.g)
      {
        this.h += paramzaca.e - this.g;
        this.g = paramzaca.e;
        this.i = Math.min(this.b.length, this.h + this.f);
      }
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    d(this.d ? paramInt1 : paramInt2);
  }
  
  public void d(int paramInt)
  {
    paramInt += this.h;
    if (paramInt > this.j)
    {
      if (this.l) {
        b(this.a.o());
      }
      this.b[this.j] = this.k;
      this.c.c();
      this.j += 1;
      if (paramInt > this.j) {
        for (;;)
        {
          if (this.b[this.j] == null)
          {
            this.b[this.j] = this.k;
            this.c.c();
          }
          this.j += 1;
          if (this.j == paramInt) {
            break;
          }
        }
      }
      this.m = this.b[paramInt];
    }
  }
  
  public void g()
  {
    if (this.j < this.i)
    {
      if (this.l) {
        b(this.a.o());
      }
      this.b[this.j] = this.k;
      this.c.c();
      this.j += 1;
      if (this.j < this.i) {
        for (;;)
        {
          if (this.b[this.j] == null)
          {
            this.b[this.j] = this.k;
            this.c.c();
          }
          this.j += 1;
          if (this.j == this.i) {
            break;
          }
        }
      }
    }
  }
  
  public void a(zaie paramzaie)
  {
    this.m = this.c.b(paramzaie);
    this.b[this.j] = this.m;
  }
  
  public zaie c(int paramInt1, int paramInt2)
  {
    return e(this.d ? paramInt1 : paramInt2);
  }
  
  public zaie e(int paramInt)
  {
    paramInt += this.h;
    if ((paramInt < 0) || (paramInt >= this.i))
    {
      if (this.l) {
        b(this.a.o());
      }
      return this.k;
    }
    return this.b[paramInt];
  }
  
  public void a(int paramInt1, int paramInt2, zaie paramzaie)
  {
    if (this.d) {
      this.b[(paramInt1 + this.h)] = this.c.b(paramzaie);
    } else {
      this.b[(paramInt2 + this.h)] = this.c.b(paramzaie);
    }
  }
  
  private void b(zaie paramzaie)
  {
    this.l = false;
    this.k = this.c.a(paramzaie);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */