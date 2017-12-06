package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.d.zh;

final class zbwi
{
  static int[] a(Shape paramShape)
    throws Exception
  {
    MsoTextFrame localMsoTextFrame = paramShape.getTextFrame();
    int i = a(a(paramShape, localMsoTextFrame.getLeftMarginPt()));
    int j = a(a(paramShape, localMsoTextFrame.getRightMarginPt()));
    int k = a(a(paramShape, localMsoTextFrame.getTopMarginPt()));
    int m = a(a(paramShape, localMsoTextFrame.getBottomMarginPt()));
    int n = paramShape.getWidth() - i - j;
    if (!paramShape.getTextBody().getTextAlignment().isTextWrapped()) {
      n = Integer.MAX_VALUE;
    }
    zt localzt = new zt(0.0F, 0.0F);
    FontSettingCollection localFontSettingCollection = paramShape.getTextBody();
    zg localzg = a(localFontSettingCollection.c());
    Object localObject1;
    Object localObject2;
    if (!localFontSettingCollection.j())
    {
      localObject1 = new za(1, 1);
      try
      {
        localObject2 = zi.a((zj)localObject1);
        try
        {
          zv localzv = new zv(zv.c());
          localzt = ((zi)localObject2).a(localFontSettingCollection.getText(), localzg, n, localzv);
        }
        finally
        {
          if (localObject2 != null) {
            ((zi)localObject2).d();
          }
        }
      }
      finally
      {
        if (localObject1 != null) {
          ((za)localObject1).b();
        }
      }
    }
    else
    {
      localObject1 = new zbda();
      localObject2 = new zkq(null);
      boolean bool = ((zkq)localObject2).a(localFontSettingCollection.a(false, false), localFontSettingCollection.getText(), paramShape.getTextDirection(), (zaiz)localObject1);
      Object localObject4;
      Object localObject6;
      Object localObject7;
      if (bool)
      {
        localObject4 = new za(1, 1);
        try
        {
          localObject6 = zi.a((zj)localObject4);
          try
          {
            localObject7 = new zv(zv.c());
            localzt = ((zi)localObject6).a(localFontSettingCollection.getText(), localzg, n, (zv)localObject7);
          }
          finally
          {
            if (localObject6 != null) {
              ((zi)localObject6).d();
            }
          }
        }
        finally
        {
          if (localObject4 != null) {
            ((za)localObject4).b();
          }
        }
      }
      else
      {
        localObject4 = new zbcw();
        ((zbcw)localObject4).a(0);
        ((zbcw)localObject4).b(0);
        localObject6 = new zq(0.0F, 0.0F, n, 2.14748365E9F);
        localObject7 = new zbde((zq)localObject6, (zbcw)localObject4, (zaiz)localObject1, localzg, false);
        int i3 = zaed.b;
        zbni localzbni = new zbni(6);
        zh localzh = new zh();
        try
        {
          zr localzr = zaed.a(i3, 1, 1, ImageFormat.getBmp(), null, localzh, localzbni, new zis());
          zq localzq = ((zbde)localObject7).a(localzr, paramShape.u);
          localzt = localzq.e();
        }
        finally
        {
          if (localzh != null) {
            localzh.a();
          }
        }
      }
    }
    int i1 = paramShape.getWidth();
    if (!paramShape.getTextBody().getTextAlignment().isTextWrapped())
    {
      i1 = a(i + j + localzt.b());
      if (i + j != 0) {
        i1 += 3;
      }
    }
    int i2 = a(k + m + localzt.c());
    if (k + m != 0) {
      i2 += 3;
    }
    return new int[] { i1, i2 };
  }
  
  private static zg a(Font paramFont)
    throws Exception
  {
    int i = 0;
    if (paramFont.isBold()) {
      i |= 0x1;
    }
    if (paramFont.isItalic()) {
      i |= 0x2;
    }
    if (paramFont.isStrikeout()) {
      i |= 0x8;
    }
    if (paramFont.getUnderline() != 0) {
      i |= 0x4;
    }
    double d = paramFont.getDoubleSize();
    try
    {
      return new zg(paramFont.getName(), (float)d, i);
    }
    catch (Exception localException)
    {
      zgs localzgs = zav.a().b(paramFont.getName(), i, false);
      return new zg(paramFont.getName(), (float)d, localzgs.f());
    }
  }
  
  private static double a(Shape paramShape, double paramDouble)
  {
    return paramDouble * (zbxp.a() / 72);
  }
  
  static int a(double paramDouble)
  {
    return (int)Math.ceil(paramDouble);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */