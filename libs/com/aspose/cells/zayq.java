package com.aspose.cells;

class zayq
  extends zayp
{
  private zaie[] a;
  private int b;
  private zaie c;
  private int d;
  private boolean e;
  private boolean f;
  private boolean g;
  private int h;
  private int i;
  private int j;
  private int k;
  private boolean l;
  private boolean m;
  private int n;
  private zaie o;
  
  public zayq(zaie[] paramArrayOfzaie)
  {
    this(paramArrayOfzaie, false, 0, paramArrayOfzaie.length, 6, zabg.a, 0, false);
  }
  
  public zayq(zaie[] paramArrayOfzaie, boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, zaie paramzaie, int paramInt4, boolean paramBoolean2)
  {
    this.a = paramArrayOfzaie;
    this.b = paramInt3;
    this.c = paramzaie;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    this.d = paramInt2;
    this.e = (this.d < 2);
    this.i = paramInt1;
    this.h = paramInt4;
    E();
  }
  
  zayq(zayq paramzayq)
  {
    this.a = paramzayq.a;
    this.b = paramzayq.b;
    this.c = paramzayq.c;
    this.d = paramzayq.d;
    this.e = paramzayq.e;
    this.f = paramzayq.f;
    this.g = paramzayq.g;
    this.h = paramzayq.h;
    this.i = paramzayq.i;
    this.j = paramzayq.j;
    this.k = paramzayq.k;
    this.l = paramzayq.l;
    this.m = paramzayq.m;
    this.n = paramzayq.n;
    this.o = paramzayq.o;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zayq(this);
  }
  
  public int c()
  {
    return this.f ? this.d : 1;
  }
  
  public int d()
  {
    return this.f ? 1 : this.d;
  }
  
  public int e()
  {
    return this.d;
  }
  
  public boolean l()
  {
    return this.e;
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
    return this.b;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (this.e) {
      return this.o;
    }
    if (this.m) {
      return this.c;
    }
    if (this.f)
    {
      paramInt1 += this.i;
      if ((paramInt1 >= this.j) && (paramInt1 <= this.k)) {
        return this.a[paramInt1];
      }
    }
    else
    {
      paramInt2 += this.i;
      if ((paramInt2 >= this.j) && (paramInt2 <= this.k)) {
        return this.a[paramInt2];
      }
    }
    return this.c;
  }
  
  public void f()
  {
    if ((this.e) || (this.m)) {
      return;
    }
    this.n = (this.j - 1);
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if ((this.e) || (this.m)) {
      return false;
    }
    return a(this.f ? paramInt1 : paramInt2);
  }
  
  public boolean a(int paramInt)
  {
    if ((this.e) || (this.m)) {
      return false;
    }
    paramInt += this.i;
    if (paramInt <= this.j)
    {
      if (this.l)
      {
        this.n = this.j;
        this.o = this.a[this.n];
        return true;
      }
      if (this.n == this.j) {
        return true;
      }
      this.n = (this.j - 1);
    }
    else
    {
      if (paramInt == this.n) {
        return this.n <= this.k;
      }
      if (paramInt > this.k)
      {
        this.n = (this.k + 1);
        return false;
      }
      this.n = (paramInt - 1);
    }
    return g();
  }
  
  public boolean g()
  {
    if ((this.e) || (this.m)) {
      return false;
    }
    this.n += 1;
    if (this.n <= this.k)
    {
      this.o = this.a[this.n];
      if (!a(this.o, this.c)) {
        return true;
      }
      do
      {
        this.n += 1;
        if (this.n > this.k) {
          return false;
        }
        this.o = this.a[this.n];
      } while (a(this.o, this.c));
      return true;
    }
    return false;
  }
  
  public zaie h()
  {
    if (this.o.b() == 13)
    {
      zabd localzabd = (zabd)this.o;
      if (localzabd.o().c() == 2)
      {
        this.o = localzabd.o().m();
        this.a[this.n] = this.o;
      }
    }
    return this.o;
  }
  
  public int i()
  {
    return this.f ? this.n - this.i : 0;
  }
  
  public int j()
  {
    return this.f ? 0 : this.n - this.i;
  }
  
  public int k()
  {
    return this.n - this.i;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.f)
    {
      paramInt += this.i;
      zaie localzaie;
      if ((paramInt < this.j) || (paramInt > this.k)) {
        localzaie = this.c;
      } else {
        localzaie = this.a[paramInt];
      }
      return new zbak(localzaie, this.b);
    }
    return this;
  }
  
  public zaiw c(int paramInt)
  {
    if (this.f) {
      return this;
    }
    paramInt += this.i;
    zaie localzaie;
    if ((paramInt < this.j) || (paramInt > this.k)) {
      localzaie = this.c;
    } else {
      localzaie = this.a[paramInt];
    }
    return new zbak(localzaie, this.b);
  }
  
  public boolean a(zaie paramzaie)
  {
    return a(paramzaie, this.e ? this.o : this.c);
  }
  
  public zaie o()
  {
    return this.e ? this.o : this.c;
  }
  
  public boolean x()
  {
    return (this.g) && (this.f);
  }
  
  public boolean y()
  {
    return (this.g) && (!this.f);
  }
  
  public void a(zaca paramzaca)
  {
    if (!this.g) {
      return;
    }
    if (this.f)
    {
      if (paramzaca.d == this.h) {
        return;
      }
      this.i += paramzaca.d - this.h;
      this.h = paramzaca.d;
    }
    else
    {
      if (paramzaca.e == this.h) {
        return;
      }
      this.i += paramzaca.e - this.h;
      this.h = paramzaca.e;
    }
    E();
  }
  
  public boolean q()
  {
    return this.l;
  }
  
  public int r()
  {
    if (!this.l) {
      C();
    }
    return this.f ? this.j - this.i : this.m ? -1 : 0;
  }
  
  public int s()
  {
    if (!this.l) {
      C();
    }
    return this.f ? this.k - this.i : this.m ? -1 : 0;
  }
  
  public int t()
  {
    if (!this.l) {
      C();
    }
    return this.f ? 0 : this.m ? -1 : this.j - this.i;
  }
  
  public int u()
  {
    if (!this.l) {
      C();
    }
    return this.f ? 0 : this.m ? -1 : this.k - this.i;
  }
  
  public int v()
  {
    if (!this.l) {
      C();
    }
    return this.m ? -1 : this.j;
  }
  
  public int w()
  {
    if (!this.l) {
      C();
    }
    return this.m ? -1 : this.k;
  }
  
  public boolean a(zaca paramzaca, int[] paramArrayOfInt)
  {
    if (b(paramzaca, paramArrayOfInt))
    {
      if (this.f)
      {
        paramArrayOfInt[2] = paramArrayOfInt[1];
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[3] = 0;
      }
      else
      {
        paramArrayOfInt[3] = paramArrayOfInt[1];
        paramArrayOfInt[1] = paramArrayOfInt[0];
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[2] = 0;
      }
      return true;
    }
    return false;
  }
  
  public boolean b(zaca paramzaca, int[] paramArrayOfInt)
  {
    if (!this.g)
    {
      if (!this.l) {
        C();
      }
      if (this.m) {
        return false;
      }
      paramArrayOfInt[0] = (this.j - this.i);
      paramArrayOfInt[1] = (this.k - this.i);
      return true;
    }
    int i1 = Math.min(this.a.length, this.i + this.d + (this.f ? paramzaca.l.EndRow : paramzaca.l.EndColumn) - this.h);
    int i2 = this.i + (this.f ? paramzaca.l.StartRow : paramzaca.l.StartColumn) - this.h;
    for (int i3 = Math.max(0, i2); i3 < i1; i3++) {
      if (!a(this.a[i3], this.c))
      {
        paramArrayOfInt[0] = (i3 - i2);
        i1--;
        if (i3 < i1)
        {
          do
          {
            if (!a(this.a[i1], this.c))
            {
              paramArrayOfInt[1] = (i1 - i2);
              return true;
            }
            i1--;
          } while (i1 != i3);
          paramArrayOfInt[1] = (i3 - i2);
          return true;
        }
        paramArrayOfInt[1] = (i3 - i2);
        return true;
      }
    }
    return false;
  }
  
  private void C()
  {
    this.l = true;
    do
    {
      if (!a(this.a[this.j], this.c))
      {
        if (this.j < this.k)
        {
          do
          {
            if (!a(this.a[this.k], this.c)) {
              break;
            }
            this.k -= 1;
          } while (this.j != this.k);
          this.o = this.a[this.j];
          break;
        }
        this.o = this.a[this.j];
        break;
      }
      this.j += 1;
    } while (this.j <= this.k);
    D();
  }
  
  private void D()
  {
    this.m = true;
    this.j = -1;
    this.k = -1;
  }
  
  private void E()
  {
    this.n = (this.i - 1);
    this.l = false;
    this.m = false;
    if ((this.i >= this.a.length) || (this.i <= -this.d))
    {
      this.l = true;
      D();
    }
    else
    {
      if ((this.e) || (this.i == this.a.length - 1)) {
        this.n = this.i;
      } else if (this.i + this.d == 1) {
        this.n = 0;
      }
      if (this.n >= this.i)
      {
        this.l = true;
        this.o = this.a[this.n];
        if (a(this.o, this.c))
        {
          D();
        }
        else
        {
          this.j = this.n;
          this.k = this.n;
        }
      }
      else
      {
        this.j = Math.max(0, this.i);
        this.k = (Math.min(this.a.length, this.i + this.d) - 1);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */