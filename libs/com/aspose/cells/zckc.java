package com.aspose.cells;

final class zckc
{
  public byte[] a;
  public int b;
  public int c;
  public long d;
  public byte[] e;
  public int f;
  public int g;
  public long h;
  public String i;
  zrz j;
  zamf k;
  int l;
  public long m;
  zap n = new zap();
  
  public int a(boolean paramBoolean)
  {
    return a(15, paramBoolean);
  }
  
  public int a(int paramInt, boolean paramBoolean)
  {
    this.k = new zamf();
    return this.k.a(this, paramBoolean ? -paramInt : paramInt);
  }
  
  public int a(int paramInt)
  {
    if (this.k == null) {
      return -2;
    }
    return this.k.b(this, paramInt);
  }
  
  public int a()
  {
    if (this.k == null) {
      return -2;
    }
    int i1 = this.k.b(this);
    this.k = null;
    return i1;
  }
  
  public int b(int paramInt, boolean paramBoolean)
  {
    return a(paramInt, 15, paramBoolean);
  }
  
  public int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.j = new zrz();
    return this.j.a(this, paramInt1, paramBoolean ? -paramInt2 : paramInt2);
  }
  
  public int b(int paramInt)
  {
    if (this.j == null) {
      return -2;
    }
    return this.j.a(this, paramInt);
  }
  
  public int b()
  {
    if (this.j == null) {
      return -2;
    }
    int i1 = this.j.j();
    this.j = null;
    return i1;
  }
  
  void c()
  {
    int i1 = this.j.f;
    if (i1 > this.g) {
      i1 = this.g;
    }
    if (i1 == 0) {
      return;
    }
    if ((this.j.c.length > this.j.e) && (this.e.length > this.f) && (this.j.c.length >= this.j.e + i1) && (this.e.length < this.f + i1)) {}
    System.arraycopy(this.j.c, this.j.e, this.e, this.f, i1);
    this.f += i1;
    this.j.e += i1;
    this.h += i1;
    this.g -= i1;
    this.j.f -= i1;
    if (this.j.f == 0) {
      this.j.e = 0;
    }
  }
  
  int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = this.c;
    if (i1 > paramInt2) {
      i1 = paramInt2;
    }
    if (i1 == 0) {
      return 0;
    }
    this.c -= i1;
    if (this.j.g == 0) {
      this.m = this.n.a(this.m, this.a, this.b, i1);
    }
    System.arraycopy(this.a, this.b, paramArrayOfByte, paramInt1, i1);
    this.b += i1;
    this.d += i1;
    return i1;
  }
  
  public void d()
  {
    this.a = null;
    this.e = null;
    this.i = null;
    this.n = null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zckc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */