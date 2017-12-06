package com.aspose.cells.b.a.b.a;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.za;
import java.awt.Paint;

public class zh
  extends com.aspose.cells.b.a.b.zc
{
  zq a;
  zc b;
  zb c;
  Color d;
  Color e;
  boolean f = false;
  Paint g = null;
  Float h = null;
  Integer i;
  
  private zh() {}
  
  zh(float paramFloat1, float paramFloat2, Color paramColor1, float paramFloat3, float paramFloat4, Color paramColor2, boolean paramBoolean)
  {
    this.a = new zq(paramFloat1, paramFloat2, paramFloat3 - paramFloat1, paramFloat4 - paramFloat2);
    this.d = paramColor1;
    this.e = paramColor2;
    this.f = paramBoolean;
    this.i = null;
  }
  
  zh(float paramFloat1, float paramFloat2, Color paramColor1, float paramFloat3, float paramFloat4, Color paramColor2, int paramInt)
  {
    this(paramFloat1, paramFloat2, paramColor1, paramFloat3, paramFloat4, paramColor2, false);
    this.i = Integer.valueOf(paramInt);
  }
  
  public zh(zo paramzo1, zo paramzo2, Color paramColor1, Color paramColor2)
  {
    this(paramzo1.d(), paramzo1.e(), paramColor1, paramzo2.d(), paramzo2.e(), paramColor2, false);
  }
  
  public zh(zq paramzq, Color paramColor1, Color paramColor2, int paramInt)
  {
    this(paramzq.f(), paramzq.g(), paramColor1, paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i(), paramColor2, paramInt);
  }
  
  public zh(zq paramzq, Color paramColor1, Color paramColor2, float paramFloat)
  {
    this(paramzq.f(), paramzq.g(), paramColor1, paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i(), paramColor2, false);
    this.h = Float.valueOf(paramFloat);
  }
  
  public zq a()
  {
    return this.a;
  }
  
  public Float b()
  {
    return this.h;
  }
  
  public Color c()
  {
    return this.d;
  }
  
  public Color d()
  {
    return this.e;
  }
  
  public boolean i()
  {
    return this.f;
  }
  
  public Integer j()
  {
    return this.i;
  }
  
  public Paint g()
  {
    if (this.g == null)
    {
      com.aspose.cells.b.a.b.e.zc localzc = com.aspose.cells.b.a.b.e.zb.a().b();
      this.g = localzc.a(this);
    }
    return this.g;
  }
  
  public zh k()
  {
    zh localzh = new zh();
    if (this.a != null) {
      localzh.a = this.a.a();
    }
    localzh.d = this.d.a();
    localzh.e = this.e.a();
    localzh.h = this.h;
    localzh.i = this.i;
    if (l() != null) {
      localzh.a(l().b());
    }
    localzh.g = null;
    if (this.b != null)
    {
      localzh.b = new zc();
      if (this.b.b() != null) {
        localzh.b.a(za.a(this.b.b()));
      }
      if (this.b.a() != null) {
        localzh.b.a(za.a(this.b.a()));
      }
    }
    if (this.c != null) {
      localzh.c = this.c.a();
    }
    return localzh;
  }
  
  public void f() {}
  
  public void h() {}
  
  public zc m()
  {
    return this.b;
  }
  
  public void a(zc paramzc)
  {
    if (paramzc == null) {
      throw new IllegalArgumentException("ColorBlend");
    }
    if ((paramzc.b() == null) || (paramzc.b().length == 0)) {
      throw new IllegalArgumentException("ColorBlend");
    }
    this.b = paramzc;
    this.g = null;
  }
  
  public zi n()
  {
    return l();
  }
  
  public zq o()
  {
    return this.a;
  }
  
  public Color[] p()
  {
    Color[] arrayOfColor = new Color[2];
    arrayOfColor[0] = this.d;
    arrayOfColor[1] = this.e;
    return arrayOfColor;
  }
  
  public void a(Color[] paramArrayOfColor)
  {
    if ((paramArrayOfColor == null) || (paramArrayOfColor.length < 2)) {
      return;
    }
    this.d = paramArrayOfColor[0];
    this.e = paramArrayOfColor[1];
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/a/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */