package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.zc;

public class zx
{
  public Color a;
  public float b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  private float[] n;
  public float h;
  public int i;
  public zc j;
  private zc o;
  public float k;
  public boolean l = true;
  public float[] m;
  
  public zc a()
  {
    return this.o;
  }
  
  public void a(zc paramzc)
  {
    this.o = paramzc;
  }
  
  public static zs a(zx paramzx)
  {
    return a(paramzx, 72.0F);
  }
  
  public static zs a(zx paramzx, float paramFloat)
  {
    zs localzs = null;
    if (paramzx.i == 0) {
      localzs = new zs(paramzx.a);
    } else {
      localzs = new zs(paramzx.j);
    }
    localzs.b(paramzx.b * paramFloat / 72.0F);
    localzs.e(paramzx.c);
    localzs.c(paramzx.d);
    localzs.a(paramzx.e);
    localzs.a(paramzx.k);
    localzs.b(paramzx.g);
    if (paramzx.g != 0) {
      localzs.b(paramzx.b());
    }
    if ((paramzx.m != null) && (paramzx.m.length != 0)) {
      localzs.a(paramzx.m);
    }
    return localzs;
  }
  
  public static zx a(zs paramzs)
  {
    return a(paramzs, 72.0F);
  }
  
  public static zx a(zs paramzs, float paramFloat)
  {
    zx localzx = null;
    if (paramzs == null) {
      return null;
    }
    float f1 = paramzs.p() * 72.0F / paramFloat;
    try
    {
      if (paramzs.n() == 0) {
        localzx = new zx(paramzs.c(), f1);
      } else {
        localzx = new zx(paramzs.b(), f1);
      }
      if (paramzs.b() != null) {
        localzx.j = paramzs.b();
      }
      if (paramzs.a() != null)
      {
        localzx.a(paramzs.a());
        localzx.i = paramzs.n();
      }
      localzx.c = paramzs.o();
      localzx.d = paramzs.k();
      localzx.e = paramzs.g();
      localzx.k = paramzs.h();
      if (paramzs.j() != 0) {
        localzx.a(paramzs.i());
      }
      localzx.g = paramzs.j();
      localzx.f = paramzs.l();
      localzx.h = paramzs.m();
      localzx.i = paramzs.n();
      if ((paramzs.d() != null) && (paramzs.d().length != 0)) {
        localzx.m = paramzs.d();
      }
    }
    catch (Exception localException) {}
    return localzx;
  }
  
  public zx(zc paramzc, float paramFloat)
  {
    this.j = paramzc;
    this.b = paramFloat;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = 0;
    a(null);
    this.h = 1.0F;
    this.i = 0;
    this.k = 0.0F;
    this.m = null;
  }
  
  public zx(Color paramColor, float paramFloat)
  {
    this.a = paramColor;
    this.b = paramFloat;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = 0;
    a(null);
    this.h = 1.0F;
    this.i = 0;
    this.j = null;
    this.k = 0.0F;
    this.m = null;
  }
  
  public zx(Color paramColor)
  {
    this.a = paramColor;
    this.b = 1.0F;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = 0;
    a(null);
    this.h = 1.0F;
    this.i = 0;
    this.j = null;
    this.k = 0.0F;
    this.m = null;
  }
  
  public float[] b()
  {
    return this.n;
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat != null)
    {
      this.n = paramArrayOfFloat;
      this.g = 5;
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */