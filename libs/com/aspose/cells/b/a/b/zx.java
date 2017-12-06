package com.aspose.cells.b.a.b;

import com.aspose.cells.b.a.b.a.zi;
import java.awt.Paint;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D.Float;

public class zx
  extends zc
{
  private zj a;
  private zi b = null;
  private int c;
  private float d;
  private float e;
  private float f;
  private float g;
  
  public zx(zj paramzj)
  {
    this(paramzj, 0, 0.0F, 0.0F, paramzj.i(), paramzj.h());
  }
  
  public zx(zj paramzj, int paramInt, zq paramzq)
  {
    this(paramzj, paramInt, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  public zx(zj paramzj, zq paramzq)
  {
    this(paramzj, 0, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  public zx(zj paramzj, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.a = paramzj;
    this.c = paramInt;
    this.d = paramFloat1;
    this.e = paramFloat2;
    this.f = paramFloat3;
    this.g = paramFloat4;
  }
  
  public Object e()
  {
    zx localzx = new zx(this.a.a(), this.c, this.d, this.e, this.f, this.g);
    if (this.b != null) {
      localzx.b = this.b.b();
    }
    return localzx;
  }
  
  public void f() {}
  
  public Paint g()
  {
    Rectangle2D.Float localFloat = new Rectangle2D.Float(this.d, this.e, this.f, this.g);
    if (this.a != null) {
      return new TexturePaint(this.a.a, localFloat);
    }
    return null;
  }
  
  public void h() {}
  
  public zj a()
  {
    return this.a;
  }
  
  public zi b()
  {
    return this.b;
  }
  
  public void b(zi paramzi)
  {
    this.b = paramzi.b();
  }
  
  public int c()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */