package com.aspose.cells.b.a.b.e;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zh;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.awt.GradientPaint;
import java.awt.Paint;

public class zd
  implements zc
{
  public Paint a(zh paramzh)
  {
    zq localzq = paramzh.a();
    float f1 = localzq.f();
    float f2 = localzq.g();
    float f3 = localzq.f() + localzq.h();
    float f4 = localzq.g() + localzq.i();
    com.aspose.cells.b.a.b.a.zc localzc = paramzh.m();
    if (paramzh.j() == null) {
      return a(f1, f2, paramzh.c(), f3, f4, paramzh.d(), paramzh.j());
    }
    if (paramzh.b() != null)
    {
      zo[] arrayOfzo = a(f1, f2, 0.0F, f3, f4, 1.0F, paramzh.b().floatValue());
      return new GradientPaint(arrayOfzo[0].d(), arrayOfzo[0].e(), paramzh.c().d(), arrayOfzo[1].d(), arrayOfzo[1].e(), paramzh.d().d(), paramzh.i());
    }
    return new GradientPaint(f1, f2, paramzh.c().d(), f3, f4, paramzh.d().d(), paramzh.i());
  }
  
  private Paint a(float paramFloat1, float paramFloat2, Color paramColor1, float paramFloat3, float paramFloat4, Color paramColor2, Integer paramInteger)
  {
    if (paramInteger == null) {
      return new GradientPaint(paramFloat1, paramFloat2, paramColor1.d(), paramFloat3, paramFloat4, paramColor2.d(), false);
    }
    zo[] arrayOfzo;
    switch (paramInteger.intValue())
    {
    case 0: 
      return new GradientPaint(paramFloat1, paramFloat2, paramColor1.d(), paramFloat3, paramFloat2, paramColor2.d(), false);
    case 1: 
      return new GradientPaint(paramFloat1, paramFloat2, paramColor1.d(), paramFloat1, paramFloat4, paramColor2.d(), false);
    case 3: 
      arrayOfzo = a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, false);
      return new GradientPaint(arrayOfzo[0].d(), arrayOfzo[0].e(), paramColor2.d(), arrayOfzo[1].d(), arrayOfzo[1].e(), paramColor1.d(), false);
    case 2: 
      arrayOfzo = a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, true);
      return new GradientPaint(arrayOfzo[0].d(), arrayOfzo[0].e(), paramColor1.d(), arrayOfzo[1].d(), arrayOfzo[1].e(), paramColor2.d(), false);
    }
    return new GradientPaint(paramFloat1, paramFloat2, paramColor1.d(), paramFloat3, paramFloat4, paramColor2.d(), false);
  }
  
  private zo[] a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    float f1 = paramFloat4 - paramFloat1;
    float f2 = paramFloat5 - paramFloat2;
    zo localzo = new zo(paramFloat1 + f1 / 2.0F, paramFloat2 + f2 / 2.0F);
    float f3 = f1 * Math.abs((float)Math.cos(paramFloat7 * 3.141592653589793D / 180.0D)) + f2 * Math.abs((float)Math.sin(paramFloat7 * 3.141592653589793D / 180.0D));
    zo[] arrayOfzo = { new zo(localzo.d() - f3 / 2.0F + f3 * paramFloat3, localzo.e()), new zo(localzo.d() + f3 / 2.0F - f3 * (1.0F - paramFloat6), localzo.e()) };
    zi localzi = new zi();
    localzi.a(paramFloat7, localzo);
    localzi.a(arrayOfzo);
    return arrayOfzo;
  }
  
  private zo[] a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean)
  {
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat4 - paramFloat2;
    zo localzo = new zo(paramFloat1 + f1 / 2.0F, paramFloat2 + f2 / 2.0F);
    float f3 = (float)Math.atan2(f1, f2);
    float f4 = f1 * (float)Math.cos(f3);
    if (!paramBoolean) {
      f3 = -f3;
    }
    zo[] arrayOfzo = { new zo(localzo.d() - f4, localzo.e()), new zo(localzo.d() + f4, localzo.e()) };
    zi localzi = new zi();
    localzi.a(f3 * 57.29578F, localzo);
    localzi.a(arrayOfzo);
    return arrayOfzo;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/e/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */