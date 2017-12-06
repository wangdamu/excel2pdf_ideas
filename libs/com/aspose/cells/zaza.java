package com.aspose.cells;

import com.aspose.cells.a.c.zc;

class zaza
  extends zayz
{
  private int j;
  private int k;
  private int l;
  private int m;
  private boolean n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  
  public zaza(zaiw[] paramArrayOfzaiw, zaht paramzaht, zaca paramzaca, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramArrayOfzaiw, paramzaht, paramzaca);
    this.j = paramInt1;
    this.k = paramInt2;
    this.l = paramInt3;
    this.m = paramInt4;
    this.n = false;
  }
  
  private zaza(zaza paramzaza, zaca paramzaca)
  {
    super(paramzaza.e(paramzaca), (zaht)paramzaza.c.a(paramzaca), paramzaca);
    this.d = paramzaza.d;
    this.j = paramzaza.j;
    this.k = paramzaza.k;
    this.m = paramzaza.m;
    this.l = paramzaza.l;
    this.n = paramzaza.n;
    this.o = paramzaza.o;
    this.q = paramzaza.q;
    this.p = paramzaza.p;
    this.r = paramzaza.r;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zaza(this, paramzaca);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if ((this.s == paramInt1) && (this.t == paramInt2)) {
      return true;
    }
    this.h = null;
    this.s = this.j;
    this.t = this.k;
    this.g = 0;
    zaiw localzaiw;
    for (int i = 0; i < this.l; i++)
    {
      localzaiw = this.b[i];
      if (localzaiw.b(paramInt1, paramInt2))
      {
        this.f[i] = true;
        a(localzaiw, i);
      }
      else
      {
        this.f[i] = false;
        this.e[i] = false;
        if (this.g == i) {
          this.g += 1;
        }
      }
    }
    if (this.m > this.l) {
      for (i = this.l; i < this.m; i++)
      {
        localzaiw = this.b[i];
        if (localzaiw.a(paramInt2))
        {
          this.f[i] = true;
          a(paramInt1, localzaiw.j(), i);
        }
        else
        {
          this.f[i] = false;
          this.e[i] = false;
          if (this.g == i) {
            this.g += 1;
          }
        }
      }
    }
    if (this.m < this.b.length) {
      for (i = this.m; i < this.b.length; i++)
      {
        localzaiw = this.b[i];
        if (localzaiw.a(paramInt1))
        {
          this.f[i] = true;
          b(localzaiw.i(), paramInt2, i);
        }
        else
        {
          this.f[i] = false;
          this.e[i] = false;
          if (this.g == i) {
            this.g += 1;
          }
        }
      }
    }
    if ((this.s > paramInt1) && (this.m > this.l))
    {
      if (this.s > paramInt1 + 1)
      {
        this.s = (paramInt1 + 1);
        if (this.g < this.b.length) {
          zc.a(this.e, this.g, this.b.length, false);
        }
        this.t = this.k;
      }
      C();
      return true;
    }
    return this.g < this.b.length;
  }
  
  private void a(zaiw paramzaiw, int paramInt)
  {
    int i = paramzaiw.i();
    if (i == this.s)
    {
      i = paramzaiw.j();
      if (i == this.t)
      {
        this.e[paramInt] = true;
        return;
      }
      if (i > this.t)
      {
        this.e[paramInt] = false;
        return;
      }
      this.t = i;
    }
    else if (i < this.s)
    {
      this.s = i;
      this.t = paramzaiw.j();
    }
    else
    {
      this.e[paramInt] = false;
      return;
    }
    this.e[paramInt] = true;
    if (this.g < paramInt)
    {
      zc.a(this.e, this.g, paramInt, false);
      this.g = paramInt;
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.s > paramInt1)
    {
      this.s = paramInt1;
      this.t = paramInt2;
      this.e[paramInt3] = true;
      if (this.g < paramInt3)
      {
        zc.a(this.e, this.g, paramInt3, false);
        this.g = paramInt3;
      }
    }
    else if (paramInt2 > this.t)
    {
      this.e[paramInt3] = false;
    }
    else
    {
      this.e[paramInt3] = true;
      if (paramInt2 < this.t)
      {
        this.t = paramInt2;
        if (this.g < paramInt3)
        {
          zc.a(this.e, this.g, paramInt3, false);
          this.g = paramInt3;
        }
      }
    }
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > this.s)
    {
      this.e[paramInt3] = false;
    }
    else
    {
      this.e[paramInt3] = true;
      if (paramInt1 < this.s)
      {
        this.s = paramInt1;
        this.t = paramInt2;
        if (this.g < paramInt3)
        {
          zc.a(this.e, this.g, paramInt3, false);
          this.g = paramInt3;
        }
      }
      else if (paramInt2 < this.t)
      {
        this.t = paramInt2;
        if (this.g < paramInt3)
        {
          zc.a(this.e, this.g, paramInt3, false);
          this.g = paramInt3;
        }
      }
    }
  }
  
  private void C()
  {
    this.g = this.l;
    for (int i = this.l; i < this.m; i++)
    {
      zaiw localzaiw = this.b[i];
      localzaiw.f();
      if (localzaiw.g())
      {
        this.f[i] = true;
        int i1 = localzaiw.j();
        if (i1 == this.t)
        {
          this.e[i] = true;
        }
        else if (i1 < this.t)
        {
          this.t = i1;
          this.e[i] = true;
          if (this.g < i)
          {
            zc.a(this.e, this.g, i, false);
            this.g = i;
          }
        }
        else if (this.g == i)
        {
          this.g += 1;
        }
      }
      else
      {
        this.f[i] = false;
        this.e[i] = false;
        if (this.g == i) {
          this.g += 1;
        }
      }
    }
  }
  
  public boolean a(int paramInt)
  {
    return b(paramInt / this.k, paramInt % this.k);
  }
  
  public void f()
  {
    super.f();
    this.s = -1;
    this.t = this.k;
  }
  
  public boolean g()
  {
    zaiw localzaiw;
    if (this.i > -1)
    {
      localzaiw = this.b[this.i];
      if (localzaiw.m())
      {
        if (this.f[this.i] != 0)
        {
          this.i = -1;
          return b(this.s, localzaiw.j());
        }
        this.s += 1;
        if (this.s < this.j)
        {
          localzaiw.f();
          if (localzaiw.g())
          {
            this.i = -1;
            return b(this.s, localzaiw.j());
          }
        }
      }
      else if (localzaiw.n())
      {
        if (this.f[this.i] != 0)
        {
          this.i = -1;
          return b(localzaiw.i(), 0);
        }
      }
      else if (this.f[this.i] != 0)
      {
        this.i = -1;
        return b(localzaiw.i(), localzaiw.j());
      }
      this.i = -1;
      return false;
    }
    this.h = null;
    int i = this.t + 1;
    int i1;
    int i2;
    if (i >= this.k)
    {
      i1 = this.s + 1;
      if (i1 >= this.j) {
        return false;
      }
      i2 = 1;
      i = 0;
    }
    else
    {
      i1 = this.s;
      i2 = 0;
    }
    this.s = this.j;
    this.t = this.k;
    this.g = 0;
    for (int i3 = 0; i3 < this.l; i3++)
    {
      localzaiw = this.b[i3];
      if (this.e[i3] != 0)
      {
        if (localzaiw.g())
        {
          a(localzaiw, i3);
        }
        else
        {
          this.f[i3] = false;
          this.e[i3] = false;
          if (this.g == i3) {
            this.g += 1;
          }
        }
      }
      else if (this.f[i3] != 0) {
        a(localzaiw, i3);
      } else if (this.g == i3) {
        this.g += 1;
      }
    }
    if (this.m > this.l) {
      for (i3 = this.l; i3 < this.m; i3++)
      {
        localzaiw = this.b[i3];
        if (i2 != 0)
        {
          localzaiw.f();
          if (localzaiw.g())
          {
            this.f[i3] = true;
            a(i1, localzaiw.j(), i3);
          }
          else
          {
            this.f[i3] = false;
            this.e[i3] = false;
            if (this.g == i3) {
              this.g += 1;
            }
          }
        }
        else if (this.e[i3] != 0)
        {
          if (localzaiw.g())
          {
            a(i1, localzaiw.j(), i3);
          }
          else
          {
            this.f[i3] = false;
            this.e[i3] = false;
            if (this.g == i3) {
              this.g += 1;
            }
          }
        }
        else if (this.f[i3] != 0)
        {
          a(i1, localzaiw.j(), i3);
        }
        else if (this.g == i3)
        {
          this.g += 1;
        }
      }
    }
    if (((i2 != 0) || (this.s > i1)) && (this.m < this.b.length)) {
      for (i3 = this.m; i3 < this.b.length; i3++)
      {
        localzaiw = this.b[i3];
        if (this.e[i3] != 0)
        {
          if (localzaiw.g())
          {
            b(localzaiw.i(), i, i3);
          }
          else
          {
            this.f[i3] = false;
            this.e[i3] = false;
            if (this.g == i3) {
              this.g += 1;
            }
          }
        }
        else if (this.f[i3] != 0) {
          b(localzaiw.i(), i, i3);
        } else if (this.g == i3) {
          this.g += 1;
        }
      }
    }
    if ((this.s > i1) && (this.m > this.l))
    {
      if (this.s > i1 + 1)
      {
        this.s = (i1 + 1);
        if (this.g < this.b.length) {
          zc.a(this.e, this.g, this.b.length, false);
        }
        this.t = this.k;
      }
      C();
      return true;
    }
    return this.g < this.b.length;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.m < this.b.length) {
      return new zazp(this, this.a, paramInt);
    }
    zaiw[] arrayOfzaiw = new zaiw[this.b.length];
    for (int i = 0; i < this.b.length; i++) {
      arrayOfzaiw[i] = this.b[i].b(paramInt);
    }
    return new zazb(arrayOfzaiw, this.c, this.a);
  }
  
  public zaiw c(int paramInt)
  {
    if (this.m > this.l) {
      return new zazo(this, this.a, paramInt);
    }
    zaiw[] arrayOfzaiw = new zaiw[this.b.length];
    for (int i = 0; i < this.b.length; i++) {
      arrayOfzaiw[i] = this.b[i].c(paramInt);
    }
    return new zazb(arrayOfzaiw, this.c, this.a);
  }
  
  public zaiw c(zaca paramzaca)
  {
    if (!this.n) {
      D();
    }
    zaza localzaza = new zaza(this, null);
    zbzd localzbzd = new zbzd(localzaza, this.d, this.o, this.q, this.p, this.r, this.j, this.k);
    return new zazi(localzaza, localzbzd, paramzaca);
  }
  
  public boolean m()
  {
    return false;
  }
  
  public boolean n()
  {
    return false;
  }
  
  public int c()
  {
    return this.j;
  }
  
  public int d()
  {
    return this.k;
  }
  
  public int e()
  {
    return this.j * this.k;
  }
  
  public int i()
  {
    return this.s;
  }
  
  public int j()
  {
    return this.t;
  }
  
  public int k()
  {
    return this.s * this.k + this.t;
  }
  
  public boolean q()
  {
    return this.n;
  }
  
  public int r()
  {
    if (!this.n) {
      D();
    }
    return this.o;
  }
  
  public int s()
  {
    if (!this.n) {
      D();
    }
    return this.p;
  }
  
  public int t()
  {
    if (!this.n) {
      D();
    }
    return this.q;
  }
  
  public int u()
  {
    if (!this.n) {
      D();
    }
    return this.r;
  }
  
  private void D()
  {
    this.n = true;
    zaiw localzaiw;
    int i;
    int i1;
    if (this.m > this.l)
    {
      this.o = 0;
      this.p = (this.j - 1);
      if (this.m < this.b.length)
      {
        this.q = 0;
        this.r = (this.k - 1);
        return;
      }
      localzaiw = this.b[0];
      this.q = localzaiw.t();
      this.r = localzaiw.u();
      for (i = 1; i < this.b.length; i++)
      {
        localzaiw = this.b[i];
        if (this.q < 0)
        {
          this.q = localzaiw.t();
        }
        else
        {
          i1 = localzaiw.t();
          if ((i1 > -1) && (i1 < this.q)) {
            this.q = i1;
          }
        }
        this.r = Math.max(this.r, localzaiw.u());
      }
    }
    else
    {
      this.q = 0;
      this.r = (this.k - 1);
      localzaiw = this.b[0];
      this.o = localzaiw.r();
      this.p = localzaiw.s();
      for (i = 1; i < this.b.length; i++)
      {
        localzaiw = this.b[i];
        if (this.o < 0)
        {
          this.o = localzaiw.r();
        }
        else
        {
          i1 = localzaiw.r();
          if ((i1 > -1) && (i1 < this.o)) {
            this.o = i1;
          }
        }
        this.p = Math.max(this.p, localzaiw.s());
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */