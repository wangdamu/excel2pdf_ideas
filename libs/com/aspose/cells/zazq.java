package com.aspose.cells;

import com.aspose.cells.b.a.za;

class zazq
  extends zayp
{
  private zaie a;
  private zaie b;
  private int c;
  private int[] d;
  private int[] e;
  private boolean f;
  private int g;
  private boolean h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  
  public zazq(zaie paramzaie1, zaie paramzaie2, int paramInt1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, boolean paramBoolean2)
  {
    this.a = paramzaie1;
    this.b = paramzaie2;
    this.c = paramInt1;
    this.d = paramArrayOfInt1;
    this.e = paramArrayOfInt2;
    this.j = paramInt2;
    this.i = paramInt4;
    this.h = paramBoolean2;
    this.g = paramInt3;
    this.f = paramBoolean1;
    C();
  }
  
  zazq(zazq paramzazq)
  {
    this.a = paramzazq.a;
    this.b = paramzazq.b;
    this.c = paramzazq.c;
    this.d = paramzazq.d;
    this.e = paramzazq.e;
    this.f = paramzazq.f;
    this.g = paramzazq.g;
    this.h = paramzazq.h;
    this.i = paramzazq.i;
    this.j = paramzazq.j;
    this.k = paramzazq.k;
    this.l = paramzazq.l;
    this.m = paramzazq.m;
    this.o = paramzazq.o;
    this.n = paramzazq.n;
    this.p = paramzazq.p;
    this.q = paramzazq.q;
    this.r = paramzazq.r;
    this.s = paramzazq.s;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazq(this);
  }
  
  public int c()
  {
    return this.f ? this.g : 1;
  }
  
  public int d()
  {
    return this.f ? 1 : this.g;
  }
  
  public int e()
  {
    return this.g;
  }
  
  public boolean l()
  {
    return this.g == 1;
  }
  
  public boolean m()
  {
    return !this.f;
  }
  
  public boolean n()
  {
    return this.f;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (this.m < 1) {
      return this.a;
    }
    int i1 = (this.f ? paramInt1 : paramInt2) + this.j;
    int i2 = za.a(this.d, this.k, this.m, i1);
    if (i2 < 0)
    {
      if (i2 == -1) {
        return this.a;
      }
      i2 = -i2 - 2;
      if (this.e[i2] <= i1) {
        return this.a;
      }
    }
    return this.b;
  }
  
  public void f()
  {
    this.p = this.k;
    if (this.m < 1)
    {
      this.q = this.g;
      return;
    }
    this.r = this.o;
    if (this.k < this.l) {
      this.s = (this.e[this.p] - this.j);
    } else {
      this.s = this.n;
    }
    this.q = (this.o - 1);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return a(this.f ? paramInt1 : paramInt2);
  }
  
  public boolean a(int paramInt)
  {
    if (this.m < 1) {
      return false;
    }
    if (paramInt == this.q) {
      return true;
    }
    if (this.p <= this.l)
    {
      if (paramInt < this.s)
      {
        if (paramInt < this.r)
        {
          this.p = za.a(this.d, this.k, this.p - this.k, paramInt + this.j);
          if (this.p < 0)
          {
            if (this.p == -1)
            {
              this.p = 0;
              this.r = this.o;
              this.s = (this.e[this.p] - this.j);
              this.q = this.r;
            }
            else
            {
              this.p = (-this.p - 2);
              this.s = (this.e[this.p] - this.j);
              if (this.s <= paramInt)
              {
                this.p += 1;
                this.r = (this.d[this.p] - this.j);
                this.s = (this.e[this.p] - this.j);
                this.q = this.r;
              }
              else
              {
                this.r = (this.d[this.p] - this.j);
                this.q = paramInt;
              }
            }
          }
          else
          {
            this.r = (this.d[this.p] - this.j);
            this.s = (this.e[this.p] - this.j);
            this.q = paramInt;
          }
        }
        else
        {
          this.q = paramInt;
        }
        return true;
      }
      if (paramInt == this.s)
      {
        this.p += 1;
        if (this.p < this.l)
        {
          this.s = (this.e[this.p] - this.j);
        }
        else
        {
          if (this.p > this.l)
          {
            this.q = -1;
            return false;
          }
          this.s = this.n;
        }
        this.r = (this.d[this.p] - this.j);
        this.q = this.r;
        return true;
      }
      this.p += 1;
      if (this.p <= this.l)
      {
        this.p = za.a(this.d, this.p, this.l - this.p + 1, paramInt + this.j);
        if (this.p < 0)
        {
          this.p = (-this.p - 2);
          this.s = (this.e[this.p] - this.j);
          if (this.s <= paramInt)
          {
            this.p += 1;
            if (this.p < this.l)
            {
              this.s = (this.e[this.p] - this.j);
            }
            else
            {
              if (this.p > this.l)
              {
                this.q = -1;
                return false;
              }
              this.s = this.n;
            }
            this.r = (this.d[this.p] - this.j);
            this.q = this.r;
          }
          else
          {
            this.r = (this.d[this.p] - this.j);
            this.q = paramInt;
          }
        }
        else
        {
          if (this.p < this.l) {
            this.s = (this.e[this.p] - this.j);
          } else {
            this.s = this.n;
          }
          this.r = (this.d[this.p] - this.j);
          this.q = paramInt;
        }
        return true;
      }
      this.q = -1;
      return false;
    }
    this.p = za.a(this.d, this.k, this.m, paramInt + this.j);
    if (this.p < 0)
    {
      if (this.p == -1)
      {
        this.p = 0;
        this.r = this.o;
        this.s = (this.e[this.p] - this.j);
        this.q = this.r;
      }
      else
      {
        this.p = (-this.p - 2);
        this.s = (this.e[this.p] - this.j);
        if (this.s <= paramInt)
        {
          this.p += 1;
          if (this.p < this.l)
          {
            this.s = (this.e[this.p] - this.j);
          }
          else
          {
            if (this.p > this.l)
            {
              this.q = -1;
              return false;
            }
            this.s = this.n;
          }
          this.r = (this.d[this.p] - this.j);
          this.q = this.r;
        }
        else
        {
          this.r = (this.d[this.p] - this.j);
          this.q = paramInt;
        }
      }
    }
    else
    {
      if (this.p < this.l) {
        this.s = (this.e[this.p] - this.j);
      } else {
        this.s = this.n;
      }
      this.r = (this.d[this.p] - this.j);
      this.q = paramInt;
    }
    return true;
  }
  
  public boolean g()
  {
    this.q += 1;
    if (this.q < this.s) {
      return true;
    }
    this.p += 1;
    if (this.p < this.l)
    {
      this.s = (this.e[this.p] - this.j);
    }
    else if (this.p == this.l)
    {
      this.s = this.n;
    }
    else
    {
      this.q = this.g;
      return false;
    }
    this.r = (this.d[this.p] - this.j);
    this.q = this.r;
    return true;
  }
  
  public zaie h()
  {
    return this.b;
  }
  
  public int i()
  {
    return this.f ? this.q : 0;
  }
  
  public int j()
  {
    return this.f ? 0 : this.q;
  }
  
  public int k()
  {
    return this.q;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.f) {
      return new zbak(a(paramInt, 0));
    }
    return this;
  }
  
  public zaiw c(int paramInt)
  {
    if (this.f) {
      return this;
    }
    return new zbak(a(0, paramInt));
  }
  
  public zaie o()
  {
    return (this.g == 1) && (this.m > 0) ? this.b : this.a;
  }
  
  public zaie p()
  {
    return (this.g == 1) && (this.m > 0) ? this.b : this.a;
  }
  
  public boolean x()
  {
    return (this.h) && (this.f);
  }
  
  public boolean y()
  {
    return (this.h) && (!this.f);
  }
  
  public void a(zaca paramzaca)
  {
    if (!this.h) {
      return;
    }
    if (this.f)
    {
      if (paramzaca.d == this.i) {
        return;
      }
      this.j += this.i - paramzaca.d;
      this.i = paramzaca.d;
    }
    else
    {
      if (paramzaca.e == this.i) {
        return;
      }
      this.j += this.i - paramzaca.e;
      this.i = paramzaca.e;
    }
    C();
  }
  
  private void C()
  {
    this.k = za.a(this.d, 0, this.d.length, this.j);
    if (this.k < 0) {
      if (this.k == -1)
      {
        this.k = 0;
      }
      else
      {
        this.k = (-this.k - 2);
        if (this.e[this.k] <= this.j) {
          this.k += 1;
        }
      }
    }
    this.l = za.a(this.d, this.k, this.d.length, this.j + this.g);
    if (this.l < 0) {
      this.l = (-this.l - 2);
    } else {
      this.l -= 1;
    }
    if (this.k <= this.l)
    {
      this.m = (this.l - this.k + 1);
      this.o = Math.max(this.d[this.k] - this.j, 0);
      this.n = Math.min(this.g, this.e[this.l] - this.j);
    }
    else
    {
      this.m = 0;
    }
  }
  
  public boolean q()
  {
    return true;
  }
  
  public int r()
  {
    return this.m > 0 ? 0 : this.f ? this.o : -1;
  }
  
  public int s()
  {
    return this.m > 0 ? 0 : this.f ? this.n : -1;
  }
  
  public int t()
  {
    return this.m > 0 ? this.o : this.f ? 0 : -1;
  }
  
  public int u()
  {
    return this.m > 0 ? this.n : this.f ? 0 : -1;
  }
  
  public int v()
  {
    return this.m > 0 ? this.o : -1;
  }
  
  public int w()
  {
    return this.m > 0 ? this.n : -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */