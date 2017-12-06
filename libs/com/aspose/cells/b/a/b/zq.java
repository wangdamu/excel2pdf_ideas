package com.aspose.cells.b.a.b;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;

public final class zq
{
  private float a;
  private float b;
  private float c;
  private float d;
  
  public zq(Rectangle2D paramRectangle2D)
  {
    this.a = ((float)paramRectangle2D.getX());
    this.b = ((float)paramRectangle2D.getY());
    this.c = ((float)paramRectangle2D.getWidth());
    this.d = ((float)paramRectangle2D.getHeight());
  }
  
  public zq a()
  {
    return new zq(this.a, this.b, this.c, this.d);
  }
  
  public final Rectangle2D b()
  {
    return new Rectangle2D.Float(f(), g(), h(), i());
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.a -= paramFloat1;
    this.b -= paramFloat2;
    this.c += paramFloat1 * 2.0F;
    this.d += paramFloat2 * 2.0F;
  }
  
  public static zq a(zq paramzq1, zq paramzq2)
  {
    return a(Math.min(paramzq1.j(), paramzq2.j()), Math.min(paramzq1.k(), paramzq2.k()), Math.max(paramzq1.l(), paramzq2.l()), Math.max(paramzq1.m(), paramzq2.m()));
  }
  
  public void a(float paramFloat)
  {
    this.a = paramFloat;
  }
  
  public void b(float paramFloat)
  {
    this.b = paramFloat;
  }
  
  public void c(float paramFloat)
  {
    this.c = paramFloat;
  }
  
  public void d(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public void a(zt paramzt)
  {
    this.c = paramzt.b();
    this.d = paramzt.c();
  }
  
  public void a(zo paramzo)
  {
    this.a = paramzo.d();
    this.b = paramzo.e();
  }
  
  public static zq c()
  {
    return new zq(0.0F, 0.0F, 0.0F, 0.0F);
  }
  
  public zq()
  {
    this.a = 0.0F;
    this.b = 0.0F;
    this.c = 0.0F;
    this.d = 0.0F;
  }
  
  public zq(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
  }
  
  public zq(zo paramzo, zt paramzt)
  {
    this.a = paramzo.d();
    this.b = paramzo.e();
    this.c = paramzt.b();
    this.d = paramzt.c();
  }
  
  public static zq a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return new zq(paramFloat1, paramFloat2, paramFloat3 - paramFloat1, paramFloat4 - paramFloat2);
  }
  
  public zo d()
  {
    return new zo(this.a, this.b);
  }
  
  public zt e()
  {
    return new zt(this.c, this.d);
  }
  
  public float f()
  {
    return this.a;
  }
  
  public float g()
  {
    return this.b;
  }
  
  public float h()
  {
    return this.c;
  }
  
  public float i()
  {
    return this.d;
  }
  
  public float j()
  {
    return this.a;
  }
  
  public float k()
  {
    return this.b;
  }
  
  public float l()
  {
    return this.a + this.c;
  }
  
  public float m()
  {
    return this.b + this.d;
  }
  
  public boolean n()
  {
    return (this.c <= 0.0F) || (this.d <= 0.0F);
  }
  
  public int hashCode()
  {
    return (int)(this.a ^ (this.b << 13 | this.b >> 19) ^ (this.c << 26 | this.c >> 6) ^ (this.d << 7 | this.d >> 25));
  }
  
  public boolean equals(Object obj)
  {
    return ((obj instanceof zq)) && (b(this, (zq)obj));
  }
  
  public static boolean b(zq paramzq1, zq paramzq2)
  {
    if (paramzq1 == paramzq2) {
      return true;
    }
    return (paramzq1 != null) && (paramzq2 != null) && (paramzq1.a == paramzq2.a) && (paramzq1.b == paramzq2.b) && (paramzq1.c == paramzq2.c) && (paramzq1.d == paramzq2.d);
  }
  
  public String toString()
  {
    return "{X=" + this.a + ",Y=" + this.b + ",Width=" + this.c + ",Height=" + this.d + "}";
  }
  
  public void a(zq paramzq)
  {
    Rectangle2D.Float localFloat1 = new Rectangle2D.Float(paramzq.a, paramzq.b, paramzq.c, paramzq.d);
    Rectangle2D.Float localFloat2 = new Rectangle2D.Float(this.a, this.b, this.c, this.d);
    Rectangle2D.intersect(localFloat1, localFloat2, localFloat1);
    if ((localFloat1.getHeight() <= 0.0D) || (localFloat1.getWidth() <= 0.0D))
    {
      this.a = 0.0F;
      this.b = 0.0F;
      this.c = 0.0F;
      this.d = 0.0F;
    }
    else
    {
      this.a = ((float)localFloat1.getX());
      this.b = ((float)localFloat1.getY());
      this.c = ((float)localFloat1.getWidth());
      this.d = ((float)localFloat1.getHeight());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */