package com.aspose.cells.b.a.b;

import java.awt.Rectangle;

public final class zp
{
  private int a;
  private int b;
  private int c;
  private int d;
  
  public zp()
  {
    this.a = 0;
    this.b = 0;
    this.c = 0;
    this.d = 0;
  }
  
  public zp(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public static zp a()
  {
    return new zp(0, 0, 0, 0);
  }
  
  public static zp a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new zp(paramInt1, paramInt2, paramInt3 - paramInt1, paramInt4 - paramInt2);
  }
  
  public zs b()
  {
    return new zs(this.c, this.d);
  }
  
  public int c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.b;
  }
  
  public int e()
  {
    return this.c;
  }
  
  public int f()
  {
    return this.d;
  }
  
  public int g()
  {
    return this.a;
  }
  
  public int h()
  {
    return this.b;
  }
  
  public int i()
  {
    return this.a + this.c;
  }
  
  public int j()
  {
    return this.b + this.d;
  }
  
  public boolean k()
  {
    return (this.d == 0) && (this.c == 0) && (this.a == 0) && (this.b == 0);
  }
  
  public static zp a(zq paramzq)
  {
    int i = Math.round(paramzq.f());
    int j = Math.round(paramzq.g());
    int k = Math.round(paramzq.h());
    int m = Math.round(paramzq.i());
    return new zp(i, j, k, m);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a -= paramInt1;
    this.b -= paramInt2;
    this.c += paramInt1 * 2;
    this.d += paramInt2 * 2;
  }
  
  public void a(zs paramzs)
  {
    this.c = paramzs.b();
    this.d = paramzs.c();
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void c(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void d(int paramInt)
  {
    this.d = paramInt;
  }
  
  public Rectangle l()
  {
    return new Rectangle(this.a, this.b, this.c, this.d);
  }
  
  public int hashCode()
  {
    return (int)(this.a ^ (this.b << 13 | this.b >> 19) ^ (this.c << 26 | this.c >> 6) ^ (this.d << 7 | this.d >> 25));
  }
  
  public boolean equals(Object obj)
  {
    return ((obj instanceof zp)) && (a(this, (zp)obj));
  }
  
  public static boolean a(zp paramzp1, zp paramzp2)
  {
    if (paramzp1 == paramzp2) {
      return true;
    }
    return (paramzp1 != null) && (paramzp2 != null) && (paramzp1.a == paramzp2.a) && (paramzp1.b == paramzp2.b) && (paramzp1.c == paramzp2.c) && (paramzp1.d == paramzp2.d);
  }
  
  public boolean a(zp paramzp)
  {
    return (paramzp.a < this.a + this.c) && (this.a < paramzp.a + paramzp.c) && (paramzp.b < this.b + this.d) && (this.b < paramzp.b + paramzp.d);
  }
  
  public String toString()
  {
    return "{X=" + this.a + ",Y=" + this.b + ",Width=" + this.c + ",Height=" + this.d + "}";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */