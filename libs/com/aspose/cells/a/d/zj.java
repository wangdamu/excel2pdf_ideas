package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.ImageFormat;
import com.aspose.cells.b.a.b.a.zc;
import com.aspose.cells.b.a.b.b.zf;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;

public class zj
{
  public static ArrayList a(Color paramColor1, Color paramColor2, zq paramzq, int paramInt1, int paramInt2)
  {
    return zag.a(paramColor1, paramColor2, paramzq, paramInt1, paramInt2);
  }
  
  public static zb a(com.aspose.cells.b.a.b.a.zh paramzh)
  {
    zb localzb = new zb();
    zc localzc = paramzh.m();
    if (localzc != null)
    {
      zq localzq1 = paramzh.o();
      zq localzq2 = new zq((float)zao.c(localzq1.f()), (float)zao.c(localzq1.g()), (float)zao.c(localzq1.h()), (float)zao.c(localzq1.i()));
      double d1 = paramzh.b().doubleValue();
      Point2D.Double localDouble = new Point2D.Double(localzq2.f() + localzq2.h() / 2.0F, localzq2.g() + localzq2.i() / 2.0F);
      double d2 = localzq2.h() * Math.abs(Math.cos(d1 * 3.141592653589793D / 180.0D)) + localzq2.i() * Math.abs(Math.sin(d1 * 3.141592653589793D / 180.0D));
      double d3 = localzq2.i() * Math.abs(Math.cos(d1 * 3.141592653589793D / 180.0D)) + localzq2.h() * Math.abs(Math.sin(d1 * 3.141592653589793D / 180.0D));
      Rectangle2D.Double localDouble1 = new Rectangle2D.Double(localDouble.getX() - d2 / 2.0D, localDouble.getY() - d3 / 2.0D, d2, d3);
      com.aspose.cells.b.a.b.a.zi localzi = new com.aspose.cells.b.a.b.a.zi();
      localzi.a((float)d1, new zo(localDouble.getX(), localDouble.getY()));
      double d4 = localDouble1.getX();
      Color[] arrayOfColor = localzc.b();
      float[] arrayOfFloat = localzc.a();
      for (int i = 1; i < localzc.b().length; i++)
      {
        double d5 = localDouble1.getWidth() * (arrayOfFloat[i] - arrayOfFloat[(i - 1)]);
        double d6 = d5;
        if (i != localzc.b().length - 1) {
          d6 += 1.0D;
        }
        Rectangle2D.Double localDouble2 = new Rectangle2D.Double(d4, localDouble1.getY(), d6, d3);
        zo[] arrayOfzo1 = { new zo(localDouble2.getX(), localDouble2.getY()), new zo(localDouble2.getX(), localDouble2.getY() + localDouble2.getHeight()), new zo(localDouble2.getX() + localDouble2.getWidth(), localDouble2.getY() + localDouble2.getHeight()), new zo(localDouble2.getX() + localDouble2.getWidth(), localDouble2.getY()), new zo(localDouble2.getX(), localDouble.getY()), new zo(localDouble2.getX() + localDouble2.getWidth(), localDouble.getY()) };
        localzi.a(arrayOfzo1);
        zo[] arrayOfzo2 = { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[3] };
        zp localzp = zp.a(arrayOfzo2, true);
        zi localzi1 = new zi(arrayOfzo1[4], arrayOfzo1[5], arrayOfColor[(i - 1)], arrayOfColor[i], 1.0F);
        localzp.a(localzi1);
        localzb.a(localzp);
        d4 += d5;
      }
    }
    return localzb;
  }
  
  public static zb a(zr paramzr)
  {
    return b(paramzr);
  }
  
  private static zb b(zr paramzr)
  {
    zb localzb = new zb();
    zc localzc = paramzr.b();
    if (localzc != null)
    {
      zq localzq1 = paramzr.c();
      zq localzq2 = new zq((float)zao.c(localzq1.f()), (float)zao.c(localzq1.g()), (float)zao.c(localzq1.h()), (float)zao.c(localzq1.i()));
      int i = localzc.b().length;
      Color[] arrayOfColor = new Color[i];
      float[] arrayOfFloat = new float[i];
      int j = 1;
      for (int k = 0; k < i; k++)
      {
        int m = k;
        if (j != 0) {
          m = i - 1 - k;
        }
        arrayOfColor[k] = localzc.b()[m];
        float f2 = localzc.a()[m];
        arrayOfFloat[k] = (j != 0 ? 1.0F - f2 : f2);
      }
      zo localzo = new zo(localzq2.f() + localzq2.h() / 2.0F, localzq2.g() + localzq2.i() / 2.0F);
      float f1;
      if (localzq2.h() < localzq2.i()) {
        f1 = localzq2.i() / 2.0F;
      } else {
        f1 = localzq2.h() / 2.0F;
      }
      localzb.a(a(localzo, f1, arrayOfFloat, arrayOfColor, paramzr));
    }
    return localzb;
  }
  
  public static zb a(zo paramzo, float paramFloat, float[] paramArrayOfFloat, Color[] paramArrayOfColor, zr paramzr)
  {
    zb localzb1 = new zb();
    try
    {
      double d1 = 0.0D;
      double d2 = paramzo.d() - d1;
      double d3 = paramzo.e() - d1;
      double d4 = 30.0D;
      double d5 = 1.5D;
      for (int i = 1; i < paramArrayOfColor.length; i++)
      {
        Color localColor1 = paramArrayOfColor[(i - 1)];
        Color localColor2 = paramArrayOfColor[i];
        int j = localColor1.getR() & 0xFF;
        int k = localColor1.getG() & 0xFF;
        int m = localColor1.getB() & 0xFF;
        int n = localColor2.getR() & 0xFF;
        int i1 = localColor2.getG() & 0xFF;
        int i2 = localColor2.getB() & 0xFF;
        double d6 = (paramArrayOfFloat[i] - paramArrayOfFloat[(i - 1)]) * paramFloat;
        double d7 = 1.0D;
        if (d6 < d4) {
          d7 = d6 / d4;
        }
        double d8 = 0.0D;
        while (d8 < d6 + d7 / 2.0D)
        {
          int i3 = (int)(j + (n - j) * (d8 / d6));
          int i4 = (int)(k + (i1 - k) * (d8 / d6));
          int i5 = (int)(m + (i2 - m) * (d8 / d6));
          Color localColor3 = a(i3, i4, i5);
          if (d1 > 0.0D)
          {
            float f1 = (float)(d1 / paramFloat);
            float f2 = (float)Math.abs(d7 * d5 / f1);
            zx localzx = new zx(localColor3, f2);
            zb localzb2 = new zb();
            localzb2.a(new com.aspose.cells.b.a.b.a.zi(f1, 0.0F, 0.0F, f1, paramzo.d() * (1.0F - f1), paramzo.e() * (1.0F - f1)));
            zp localzp = paramzr.k();
            localzp.a(localzx);
            localzb2.a(localzp);
            localzb1.a(localzb2);
          }
          d8 += d7;
          d2 -= d7;
          d3 -= d7;
          d1 += d7;
        }
      }
    }
    catch (Exception localException)
    {
      localException = localException;
      com.aspose.cells.a.c.zl.b(localException);
    }
    finally {}
    return localzb1;
  }
  
  private static Color a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt1 > 255) {
      paramInt1 = 255;
    }
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    if (paramInt2 > 255) {
      paramInt2 = 255;
    }
    if (paramInt3 < 0) {
      paramInt3 = 0;
    }
    if (paramInt3 > 255) {
      paramInt3 = 255;
    }
    return Color.fromArgb(paramInt1, paramInt2, paramInt3);
  }
  
  public static zb a(zv paramzv)
  {
    zb localzb = new zb();
    com.aspose.cells.b.a.b.zj localzj = paramzv.a();
    zq localzq1 = paramzv.c();
    zq localzq2 = new zq((float)zao.c(localzq1.f()), (float)zao.c(localzq1.g()), (float)zao.c(localzq1.h()), (float)zao.c(localzq1.i()));
    int i = (int)Math.ceil(localzq1.h() / localzj.i());
    int j = (int)Math.ceil(localzq1.i() / localzj.h());
    Object localObject2;
    Object localObject3;
    if ((localzj instanceof za))
    {
      com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
      za localza = new za((int)localzq1.h(), (int)localzq1.i());
      localza.a(localzj.j(), localzj.k());
      com.aspose.cells.b.a.b.zi localzi = com.aspose.cells.b.a.b.zi.a(localza);
      Object localObject1;
      if (paramzv.b() == 0)
      {
        int m = 0;
        int i1 = 0;
        for (int i2 = 0; i2 < i; i2++)
        {
          i1 = 0;
          for (int i3 = 0; i3 < j; i3++)
          {
            localzi.a(localzj, new com.aspose.cells.b.a.b.zp(m, i1, localzj.i(), localzj.h()));
            i1 += localzj.h();
          }
          m += localzj.i();
        }
      }
      else
      {
        localObject1 = new zq(0.0F, 0.0F, localza.i(), localza.h());
        localObject2 = new zq(0.0F, 0.0F, localzj.i(), localzj.h());
        localzi.a(localzj, (zq)localObject1, (zq)localObject2, 2);
      }
      localzi.e();
      try
      {
        localza.a(localzh, ImageFormat.getPng());
        localza.d();
        localObject1 = new zo(localzq2.f(), localzq2.g());
        localObject2 = new zt(localzq2.h(), localzq2.i());
        localObject3 = zl.a((zo)localObject1, (zt)localObject2, localzh);
        localzh.g_();
        localzb.a((zn)localObject3);
      }
      catch (Exception localException)
      {
        com.aspose.cells.a.c.zl.b(localException);
      }
    }
    else if ((localzj instanceof zf))
    {
      if (paramzv.b() == 0)
      {
        float f1 = localzq2.f();
        float f2 = 0.0F;
        for (int k = 0; k < i; k++)
        {
          f2 = localzq2.g();
          for (int n = 0; n < j; n++)
          {
            localObject2 = new zo(f1, f2);
            localObject3 = new zt(localzj.i(), localzj.h());
            zl localzl2 = new zl((zo)localObject2, (zt)localObject3, localzj.f);
            localzb.a(localzl2);
            f2 += localzj.h();
          }
          f1 += localzj.i();
        }
      }
      else
      {
        zo localzo = new zo(localzq2.f(), localzq2.g());
        zt localzt = new zt(localzq2.h(), localzq2.i());
        zl localzl1 = new zl(localzo, localzt, localzj.f);
        localzb.a(localzl1);
      }
    }
    return localzb;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */