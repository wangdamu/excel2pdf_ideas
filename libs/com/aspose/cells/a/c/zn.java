package com.aspose.cells.a.c;

import com.aspose.cells.a.d.zap;
import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zbx;
import com.aspose.cells.a.d.zcq;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.d.zh;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class zn
{
  public static zs a(zs paramzs)
  {
    return new zs(paramzs.b(), paramzs.c());
  }
  
  public static zq a(zp paramzp)
  {
    return new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
  }
  
  public static zp b(zp paramzp)
  {
    return new zp(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
  }
  
  public static zq a(zq paramzq)
  {
    return new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  public static zq a(ze paramze)
  {
    Rectangle localRectangle = paramze.getBounds();
    return new zq((float)localRectangle.getX(), (float)localRectangle.getY(), (float)localRectangle.getWidth(), (float)localRectangle.getHeight());
  }
  
  public static int[] a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    int[] arrayOfInt = new int[2];
    try
    {
      zh localzh = new zh(paramArrayOfByte);
      zj localzj = zj.a(localzh);
      int i = (localzj.g() & 0x1000) == 4096 ? 1 : 0;
      double d1 = 96.0D;
      double d2 = 96.0D;
      if (i != 0)
      {
        d1 = localzj.j();
        d2 = localzj.k();
      }
      if (paramBoolean)
      {
        if (i != 0)
        {
          arrayOfInt[0] = ((int)(localzj.i() * paramInt / d1 + 0.5D));
          arrayOfInt[1] = ((int)(localzj.h() * paramInt / d2 + 0.5D));
        }
        else
        {
          arrayOfInt[0] = localzj.i();
          arrayOfInt[1] = localzj.h();
        }
      }
      else
      {
        arrayOfInt[0] = ((int)(localzj.i() * paramInt / d1 + 0.5D));
        arrayOfInt[1] = ((int)(localzj.h() * paramInt / d2 + 0.5D));
      }
      localzj.d();
      localzh.a();
    }
    catch (Exception localException) {}
    return arrayOfInt;
  }
  
  public static zgs a(String paramString, int paramInt)
  {
    try
    {
      return zav.a().b(paramString, paramInt, false);
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException(localException);
    }
  }
  
  public static double a(String paramString, zgs paramzgs, float paramFloat, boolean paramBoolean)
  {
    try
    {
      if (paramBoolean) {
        return paramzgs.c(paramString, paramFloat) * zap.b() / 72.0F;
      }
      return paramzgs.b(paramString, paramFloat);
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException(localException);
    }
  }
  
  public static double a(char paramChar, zgs paramzgs, float paramFloat, boolean paramBoolean)
  {
    try
    {
      if (paramBoolean) {
        return paramzgs.a(paramChar, paramFloat);
      }
      return paramzgs.b(paramChar, paramFloat);
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException(localException);
    }
  }
  
  public static int[] a(String paramString, double paramDouble, int paramInt)
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 17;
    try
    {
      zs localzs = zgs.a(paramString, (float)paramDouble, "|", paramInt);
      arrayOfInt[0] = localzs.c();
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException(localException);
    }
    arrayOfInt[1] = ((int)(a(paramString, (int)Math.ceil(paramDouble), paramInt) + 0.5D));
    return arrayOfInt;
  }
  
  public static float a(String paramString, int paramInt1, int paramInt2)
  {
    try
    {
      zgs localzgs = zav.a().b(paramString, paramInt2, false);
      float f1 = -1.0F;
      for (int i = 0; i < 10; i++)
      {
        float f2 = localzgs.b((char)(48 + i), paramInt1);
        if (f2 > f1) {
          f1 = f2;
        }
      }
      return f1;
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException(localException);
    }
  }
  
  public static float a(FontMetrics paramFontMetrics, zgs paramzgs, String paramString1, String paramString2, float paramFloat, int paramInt)
  {
    if ((paramString1.equals(null)) || (paramString1.equals(""))) {
      return 0.0F;
    }
    float f = 0.0F;
    try
    {
      if (paramzgs == null) {
        paramzgs = zav.a().b(paramString2, paramInt, false);
      }
      f = paramzgs.b(paramString1, paramFloat);
    }
    catch (Exception localException)
    {
      if (paramFontMetrics == null)
      {
        zg localzg = new zg(paramString2, paramFloat, paramInt);
        Font localFont = localzg.a();
        BufferedImage localBufferedImage = new BufferedImage(1, 1, 1);
        Graphics2D localGraphics2D = (Graphics2D)localBufferedImage.getGraphics();
        paramFontMetrics = localGraphics2D.getFontMetrics(localFont);
      }
      f = paramFontMetrics.stringWidth(paramString1);
    }
    return f;
  }
  
  public static zbx a(String paramString)
  {
    return new zcq();
  }
  
  public static void a(zi paramzi)
  {
    paramzi.a(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */