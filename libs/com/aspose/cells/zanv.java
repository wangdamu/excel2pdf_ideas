package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;

final class zanv
{
  public static void a(zr paramzr, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, zanq paramzanq)
  {
    if (paramzanq.e())
    {
      zs localzs = a(paramzanq);
      try
      {
        paramzr.b(localzs, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      }
      finally
      {
        if (localzs != null) {
          localzs.s();
        }
      }
    }
  }
  
  public static void a(zr paramzr, zo paramzo1, zo paramzo2, zanq paramzanq)
  {
    a(paramzr, paramzo1.d(), paramzo1.e(), paramzo2.d(), paramzo2.e(), paramzanq);
  }
  
  public static void a(zr paramzr, zq paramzq, zanq paramzanq)
  {
    b(paramzr, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramzanq);
  }
  
  public static boolean a(zo paramzo, zq paramzq)
  {
    return (paramzo.d() < paramzq.f()) || (paramzo.d() > paramzq.l()) || (paramzo.e() < paramzq.g()) || (paramzo.e() > paramzq.m());
  }
  
  public static void b(zr paramzr, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, zanq paramzanq)
  {
    if (paramzanq.f())
    {
      zs localzs = a(paramzanq);
      try
      {
        paramzr.c(localzs, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      }
      finally
      {
        if (localzs != null) {
          localzs.s();
        }
      }
    }
  }
  
  public static zs a(zanq paramzanq)
  {
    float f = (float)paramzanq.b().a();
    zs localzs = new zs(paramzanq.a(), f);
    if (paramzanq.b().b() == 6)
    {
      localzs.b(0);
    }
    else if (paramzanq.b().b() == 0)
    {
      localzs.b(5);
      if (f < 2.0F) {
        localzs.b(new float[] { 19.0F, 5.0F });
      } else {
        localzs.b(new float[] { 7.0F, 4.0F });
      }
    }
    else if (paramzanq.b().b() == 10)
    {
      localzs.b(5);
      if (f < 2.0F)
      {
        if (f < 1.25F) {
          localzs.b(new float[] { 3.0F * f, 1.2F * f });
        } else {
          localzs.b(new float[] { 3.0F, 1.0F });
        }
      }
      else {
        localzs.b(new float[] { 2.0F, 4.0F });
      }
    }
    else if (paramzanq.b().b() == 1)
    {
      localzs.b(5);
      if (f < 2.0F) {
        localzs.b(new float[] { 9.0F, 6.0F, 3.0F, 6.0F });
      } else {
        localzs.b(new float[] { 7.0F, 4.0F, 2.0F, 4.0F });
      }
    }
    else if (paramzanq.b().b() == 9)
    {
      localzs.b(5);
      if (f < 2.0F) {
        localzs.b(new float[] { 9.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
      } else {
        localzs.b(new float[] { 7.0F, 4.0F, 2.0F, 4.0F, 2.0F, 4.0F });
      }
    }
    else
    {
      Color localColor1;
      Color localColor2;
      zg localzg;
      if (paramzanq.b().b() == 8)
      {
        localColor1 = Color.getBlack();
        localColor2 = Color.getWhite();
        localzg = new zg(14, localColor1, localColor2);
        localzs = new zs(localzg, f);
      }
      else if (paramzanq.b().b() == 12)
      {
        localColor1 = Color.getBlack();
        localColor2 = Color.getWhite();
        localzg = new zg(12, localColor1, localColor2);
        localzs = new zs(localzg, f);
      }
      else if (paramzanq.b().b() == 11)
      {
        localColor1 = Color.getBlack();
        localColor2 = Color.getWhite();
        localzg = new zg(9, localColor1, localColor2);
        localzs = new zs(localzg, f);
      }
      else
      {
        localzs.b(0);
      }
    }
    return localzs;
  }
  
  public static void a(zr paramzr, zp paramzp, zanq paramzanq)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(paramzr, localzq, paramzanq);
  }
  
  public static boolean a(zo paramzo, zp paramzp)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    return a(paramzo, localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zanv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */