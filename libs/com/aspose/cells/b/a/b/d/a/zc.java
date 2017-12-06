package com.aspose.cells.b.a.b.d.a;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.b.zv;
import java.awt.FontMetrics;
import java.awt.Graphics2D;

public class zc
{
  private float a;
  private zd b;
  private final String c;
  private final zg d;
  private zgs e;
  
  public zc(zd paramzd, float paramFloat, String paramString, zg paramzg)
  {
    this.b = paramzd;
    this.a = paramFloat;
    this.c = paramString;
    this.d = paramzg;
    this.e = paramzd.c();
  }
  
  public final float a()
  {
    return this.a;
  }
  
  public final float b()
  {
    return h() + this.b.h() * 2.0F;
  }
  
  public final float c()
  {
    try
    {
      return this.b.b().getAscent();
    }
    catch (Exception localException) {}
    return this.d.b().c(this.d.k()) * this.d.d() / this.d.b().e(this.d.k());
  }
  
  public final float d()
  {
    try
    {
      return this.b.b().getDescent();
    }
    catch (Exception localException) {}
    return this.d.b().d(this.d.k()) * this.d.d() / this.d.b().e(this.d.k());
  }
  
  public final float e()
  {
    try
    {
      return this.b.b().getLeading();
    }
    catch (Exception localException) {}
    return this.e.i() * this.d.h() / this.e.x();
  }
  
  public final float f()
  {
    if (this.b.g().g())
    {
      float f = this.b.f();
      if ((Float.isInfinite(f)) && (f > 0.0F)) {
        f = 0.0F;
      }
      switch (this.b.g().a())
      {
      case 1: 
        return (f - h()) / 2.0F;
      case 2: 
        return f - h() - i();
      }
      return i();
    }
    return a() + c();
  }
  
  public final float g()
  {
    float f1 = this.b.e();
    if ((Float.isInfinite(f1)) && (f1 > 0.0F)) {
      f1 = 0.0F;
    }
    if (this.b.g().g()) {
      return this.b.g().h() ? f1 - a() - c() : a() + e() + d();
    }
    float f2;
    switch (this.b.g().a())
    {
    case 1: 
      f2 = (f1 - h()) / 2.0F;
      break;
    case 2: 
      if (this.b.g().h()) {
        f2 = i() / 2.0F;
      } else {
        f2 = f1 - h() - i() / 2.0F;
      }
      break;
    default: 
      if (this.b.g().h()) {
        f2 = f1 - h() - i() / 2.0F;
      } else {
        f2 = i() / 2.0F;
      }
      break;
    }
    return f2;
  }
  
  public final float h()
  {
    float f = zn.a(this.b.b(), this.e, this.c, this.d.g(), this.d.i(), this.d.k());
    return f;
  }
  
  public float i()
  {
    return this.b.a(h()) - h();
  }
  
  public void a(Graphics2D paramGraphics2D, float paramFloat1, float paramFloat2)
  {
    if (this.b.g().g()) {
      paramGraphics2D.drawString(this.c, paramFloat2 + f(), -(paramFloat1 + g()));
    } else {
      paramGraphics2D.drawString(this.c, paramFloat1 + g(), paramFloat2 + f());
    }
  }
  
  public String j()
  {
    return this.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/d/a/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */