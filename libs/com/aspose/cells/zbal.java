package com.aspose.cells;

import com.aspose.cells.b.a.za;

class zbal
  extends zayp
{
  private zaie a;
  private zaie b;
  private int c;
  private int[] d;
  private boolean e;
  private int f;
  private boolean g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  
  public zbal(zaie paramzaie1, zaie paramzaie2, int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, boolean paramBoolean2)
  {
    this.a = paramzaie1;
    this.b = paramzaie2;
    this.c = paramInt1;
    this.d = paramArrayOfInt;
    this.i = paramInt2;
    this.h = paramInt4;
    this.g = paramBoolean2;
    this.f = paramInt3;
    this.e = paramBoolean1;
    this.j = za.a(this.d, 0, this.d.length, this.i);
    if (this.j < 0) {
      this.j = (-this.j - 1);
    }
    this.k = za.a(this.d, this.j, this.d.length, this.i + paramInt3);
    if (this.k < 0) {
      this.k = (-this.k - 1);
    }
    this.l = (this.k - this.j);
  }
  
  zbal(zbal paramzbal)
  {
    this.a = paramzbal.a;
    this.b = paramzbal.b;
    this.c = paramzbal.c;
    this.d = paramzbal.d;
    this.e = paramzbal.e;
    this.f = paramzbal.f;
    this.g = paramzbal.g;
    this.h = paramzbal.h;
    this.i = paramzbal.i;
    this.j = paramzbal.j;
    this.k = paramzbal.k;
    this.l = paramzbal.l;
    this.m = paramzbal.m;
    this.n = paramzbal.n;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zbal(this);
  }
  
  public int c()
  {
    return this.e ? this.f : 1;
  }
  
  public int d()
  {
    return this.e ? 1 : this.f;
  }
  
  public int e()
  {
    return this.f;
  }
  
  public boolean l()
  {
    return this.f == 1;
  }
  
  public boolean m()
  {
    return !this.e;
  }
  
  public boolean n()
  {
    return this.e;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    return za.a(this.d, this.j, this.l, (this.e ? paramInt1 : paramInt2) + this.i) > -1 ? this.b : this.a;
  }
  
  public void f()
  {
    this.m = (this.j - 1);
    this.n = -1;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return a(this.e ? paramInt1 : paramInt2);
  }
  
  public boolean a(int paramInt)
  {
    if (paramInt == this.n) {
      return true;
    }
    paramInt += this.i;
    this.m += 1;
    if (this.m < this.k)
    {
      if (this.d[this.m] > paramInt)
      {
        if ((this.m > 0) && (this.d[(this.m - 1)] > paramInt))
        {
          this.m = za.a(this.d, this.j, this.m - this.j - 1, paramInt);
          if (this.m < 0) {
            this.m = (-this.m - 1);
          }
        }
        this.n = (this.d[this.m] - this.i);
        return true;
      }
      if (this.d[this.m] == paramInt)
      {
        this.n = (paramInt - this.i);
        return true;
      }
      this.m += 1;
      if (this.m < this.k)
      {
        this.m = za.a(this.d, this.m, this.k - this.m, paramInt);
      }
      else
      {
        this.n = -1;
        return false;
      }
    }
    else
    {
      this.m = za.a(this.d, this.j, this.l, paramInt);
    }
    if (this.m < 0)
    {
      this.m = (-this.m - 1);
      if (this.m >= this.k)
      {
        this.n = -1;
        return false;
      }
    }
    this.n = (this.d[this.m] - this.i);
    return true;
  }
  
  public boolean g()
  {
    this.m += 1;
    if (this.m < this.k)
    {
      this.n = (this.d[this.m] - this.i);
      return true;
    }
    this.n = -1;
    return false;
  }
  
  public zaie h()
  {
    return this.b;
  }
  
  public int i()
  {
    return this.e ? this.n : 0;
  }
  
  public int j()
  {
    return this.e ? 0 : this.n;
  }
  
  public int k()
  {
    return this.n;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.e) {
      return new zbak(za.a(this.d, this.j, this.j, paramInt + this.i) > -1 ? this.b : this.a, this.c);
    }
    return this;
  }
  
  public zaiw c(int paramInt)
  {
    if (this.e) {
      return this;
    }
    return new zbak(za.a(this.d, this.j, this.j, paramInt + this.i) > -1 ? this.b : this.a, this.c);
  }
  
  public zaie o()
  {
    return (this.f == 1) && (this.l > 0) ? this.b : this.a;
  }
  
  public zaie p()
  {
    return (this.f == 1) && (this.l > 0) ? this.b : this.a;
  }
  
  public boolean x()
  {
    return (this.g) && (this.e);
  }
  
  public boolean y()
  {
    return (this.g) && (!this.e);
  }
  
  public void a(zaca paramzaca)
  {
    if (!this.g) {
      return;
    }
    if (this.e)
    {
      if (paramzaca.d == this.h) {
        return;
      }
      this.i += this.h - paramzaca.d;
      this.h = paramzaca.d;
    }
    else
    {
      if (paramzaca.e == this.h) {
        return;
      }
      this.i += this.h - paramzaca.e;
      this.h = paramzaca.e;
    }
    this.j = za.a(this.d, 0, this.d.length, this.i);
    if (this.j < 0) {
      this.j = (-this.j - 1);
    }
    this.k = za.a(this.d, this.j, this.d.length, this.i + this.f);
    if (this.k < 0) {
      this.k = (-this.k - 1);
    }
    this.l = (this.k - this.j);
  }
  
  public boolean q()
  {
    return true;
  }
  
  public int r()
  {
    return this.l > 0 ? 0 : this.e ? this.d[this.j] - this.i : -1;
  }
  
  public int s()
  {
    return this.l > 0 ? 0 : this.e ? this.d[(this.k - 1)] - this.i : -1;
  }
  
  public int t()
  {
    return this.l > 0 ? this.d[this.j] - this.i : this.e ? 0 : -1;
  }
  
  public int u()
  {
    return this.l > 0 ? this.d[(this.k - 1)] - this.i : this.e ? 0 : -1;
  }
  
  public int v()
  {
    return this.l > 0 ? this.d[this.j] - this.i : -1;
  }
  
  public int w()
  {
    return this.l > 0 ? this.d[(this.k - 1)] - this.i : -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */