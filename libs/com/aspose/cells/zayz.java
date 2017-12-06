package com.aspose.cells;

abstract class zayz
  extends zayp
{
  protected zaca a;
  protected zaiw[] b;
  protected zaht c;
  protected zaie d;
  protected boolean[] e;
  protected boolean[] f;
  protected int g;
  protected zaie h;
  protected int i;
  
  public zayz(zaiw[] paramArrayOfzaiw, zaht paramzaht, zaca paramzaca)
  {
    this.b = paramArrayOfzaiw;
    this.c = paramzaht;
    this.a = paramzaca;
    this.e = new boolean[paramArrayOfzaiw.length];
    this.f = new boolean[paramArrayOfzaiw.length];
    this.g = paramArrayOfzaiw.length;
  }
  
  zaiw[] e(zaca paramzaca)
  {
    zaiw[] arrayOfzaiw = new zaiw[this.b.length];
    for (int j = 0; j < arrayOfzaiw.length; j++) {
      arrayOfzaiw[j] = this.b[j].b(paramzaca);
    }
    return arrayOfzaiw;
  }
  
  public int b()
  {
    return this.c.b();
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    int j = 1;
    for (int k = 0; k < this.b.length; k++)
    {
      zaiw localzaiw = this.b[k];
      zaie localzaie = localzaiw.a(paramInt1, paramInt2);
      if (j != 0)
      {
        if (localzaiw.a(localzaie)) {
          continue;
        }
        j = 0;
        this.c.c();
        if (k > 0) {
          for (int m = 0; m < k; m++) {
            if (this.c.a(m, this.b[m].o())) {
              return this.c.e();
            }
          }
        }
      }
      if (this.c.a(k, localzaie)) {
        return this.c.e();
      }
    }
    if (j != 0) {
      return o();
    }
    return this.c.d();
  }
  
  public void f()
  {
    for (int j = 0; j < this.b.length; j++)
    {
      this.b[j].f();
      this.e[j] = true;
      this.f[j] = true;
    }
    this.i = -1;
    this.g = this.b.length;
  }
  
  public zaie h()
  {
    if (this.h != null) {
      return this.h;
    }
    this.c.c();
    for (int j = 0; j < this.b.length; j++) {
      if (this.e[j] != 0)
      {
        if (this.c.a(j, this.b[j].h()))
        {
          this.h = this.c.e();
          return this.h;
        }
      }
      else if (this.c.a(j, this.b[j].o()))
      {
        if (this.c.f()) {
          this.i = j;
        }
        this.h = this.c.e();
        return this.h;
      }
    }
    this.h = this.c.d();
    return this.h;
  }
  
  public zaie o()
  {
    if (this.d == null)
    {
      this.c.c();
      for (int j = 0; j < this.b.length; j++) {
        if (this.c.a(j, this.b[j].o()))
        {
          this.d = this.c.e();
          this.d.a(false);
          return this.d;
        }
      }
      this.d = this.c.b(false);
      this.d.a(false);
    }
    return this.d;
  }
  
  public zaie p()
  {
    if (this.d == null)
    {
      this.c.c();
      for (int j = 0; j < this.b.length; j++)
      {
        zaie localzaie = this.b[j].p();
        if (localzaie == null) {
          return null;
        }
        if (this.c.a(j, localzaie))
        {
          this.d = this.c.e();
          this.d.a(false);
          return this.d;
        }
      }
      this.d = this.c.b(true);
      if (this.d != null) {
        this.d.a(false);
      }
    }
    return this.d;
  }
  
  public boolean a(zaie paramzaie)
  {
    return paramzaie == this.d;
  }
  
  public void a(zaca paramzaca)
  {
    if (this.a != paramzaca)
    {
      this.a.d = paramzaca.d;
      this.a.e = paramzaca.e;
    }
    for (int j = 0; j < this.b.length; j++) {
      this.b[j].a(this.a);
    }
    this.c.b(this.a);
  }
  
  public boolean x()
  {
    return this.b[0].x();
  }
  
  public boolean y()
  {
    return this.b[0].y();
  }
  
  public boolean l()
  {
    return false;
  }
  
  public boolean a(zaca paramzaca, int[] paramArrayOfInt)
  {
    this.b[0].a(paramzaca, paramArrayOfInt);
    int j = paramArrayOfInt[0];
    int k = paramArrayOfInt[1];
    int m = paramArrayOfInt[2];
    int n = paramArrayOfInt[3];
    for (int i1 = 1; i1 < this.b.length; i1++)
    {
      this.b[i1].a(paramzaca, paramArrayOfInt);
      if (j < paramArrayOfInt[0]) {
        paramArrayOfInt[0] = j;
      }
      if (k < paramArrayOfInt[1]) {
        paramArrayOfInt[1] = k;
      }
      if (m > paramArrayOfInt[2]) {
        paramArrayOfInt[2] = m;
      }
      if (n > paramArrayOfInt[3]) {
        paramArrayOfInt[3] = n;
      }
    }
    return true;
  }
  
  public boolean b(zaca paramzaca, int[] paramArrayOfInt)
  {
    this.b[0].b(paramzaca, paramArrayOfInt);
    int j = paramArrayOfInt[0];
    int k = paramArrayOfInt[1];
    for (int m = 1; m < this.b.length; m++)
    {
      this.b[m].b(paramzaca, paramArrayOfInt);
      if (j < paramArrayOfInt[0]) {
        paramArrayOfInt[0] = j;
      }
      if (k > paramArrayOfInt[1]) {
        paramArrayOfInt[1] = k;
      }
    }
    return true;
  }
  
  public boolean z()
  {
    if (!this.c.a()) {
      return false;
    }
    for (int j = 0; j < this.b.length; j++) {
      if (!this.b[j].z()) {
        return false;
      }
    }
    return true;
  }
  
  public void b(boolean paramBoolean)
  {
    this.c.a(paramBoolean);
    for (int j = 0; j < this.b.length; j++) {
      this.b[j].b(paramBoolean);
    }
  }
  
  public boolean a()
  {
    for (int j = 0; j < this.b.length; j++) {
      if (!this.b[j].a()) {
        return false;
      }
    }
    return false;
  }
  
  public void a(boolean paramBoolean)
  {
    for (int j = 0; j < this.b.length; j++) {
      this.b[j].a(paramBoolean);
    }
  }
  
  public int i()
  {
    return this.b[this.g].i();
  }
  
  public int j()
  {
    return this.b[this.g].j();
  }
  
  public int k()
  {
    return this.b[this.g].k();
  }
  
  public boolean A()
  {
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */