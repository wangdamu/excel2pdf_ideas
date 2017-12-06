package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zj;
import com.aspose.cells.b.a.b.zo;

class zacy
{
  public static boolean a(zr paramzr, ze paramze, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if (paramze.b().a().length <= 0) {
      return false;
    }
    float f1 = paramze.b().a()[0].d();
    float f2 = paramze.b().a()[0].e();
    float f3 = paramze.b().a()[0].d();
    float f4 = paramze.b().a()[0].e();
    int i = paramze.b().a().length;
    zo[] arrayOfzo = paramze.b().a();
    for (int j = 1; j < i; j++)
    {
      if (arrayOfzo[j].d() < f3) {
        f3 = arrayOfzo[j].d();
      }
      if (arrayOfzo[j].e() < f4) {
        f4 = arrayOfzo[j].e();
      }
      if (arrayOfzo[j].d() > f1) {
        f1 = arrayOfzo[j].d();
      }
      if (arrayOfzo[j].e() > f2) {
        f2 = arrayOfzo[j].e();
      }
    }
    if (f3 < 0.0F) {
      f3 = -f3;
    } else {
      f3 = 0.0F;
    }
    if (f4 < 0.0F) {
      f4 = -f4;
    } else {
      f4 = 0.0F;
    }
    boolean bool = a(paramzr, f3 + f1 - paramArrayOfFloat1[0], f4 + f2 - paramArrayOfFloat2[0], paramArrayOfFloat1, paramArrayOfFloat2);
    return bool;
  }
  
  public static boolean a(zr paramzr, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    int i = paramzr.h();
    float f1 = paramzr.f();
    float f2 = paramzr.g();
    if (i == 0) {
      return false;
    }
    if ((i == 1) || (i == 2))
    {
      paramArrayOfFloat1[0] = paramFloat1;
      paramArrayOfFloat2[0] = paramFloat2;
      return true;
    }
    if (i == 3)
    {
      paramArrayOfFloat1[0] = (0.013888889F * f1 * paramFloat1);
      paramArrayOfFloat2[0] = (0.013888889F * f2 * paramFloat2);
      return true;
    }
    if (i == 4)
    {
      paramArrayOfFloat1[0] = (f1 * paramFloat1);
      paramArrayOfFloat2[0] = (f2 * paramFloat2);
      return true;
    }
    if (i == 5)
    {
      paramArrayOfFloat1[0] = (0.0033333334F * f1 * paramFloat1);
      paramArrayOfFloat2[0] = (0.0033333334F * f2 * paramFloat2);
      return true;
    }
    if (i == 6)
    {
      paramArrayOfFloat1[0] = (0.03937008F * f1 * paramFloat1);
      paramArrayOfFloat2[0] = (0.03937008F * f2 * paramFloat2);
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */