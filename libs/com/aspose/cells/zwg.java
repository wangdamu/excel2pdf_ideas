package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.za;
import com.aspose.cells.b.a.b.a.zd;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zu;

class zwg
  implements zwf
{
  public void a(zr paramzr, zs paramzs, zd paramzd1, zd paramzd2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    paramzr.a(paramzs, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public void a(zr paramzr, zs paramzs, zd paramzd1, zd paramzd2, zo[] paramArrayOfzo, int paramInt1, int paramInt2, float paramFloat)
  {
    paramzr.a(paramzs, paramArrayOfzo, paramInt1, paramInt2, paramFloat);
  }
  
  public void a(zr paramzr, zs paramzs, zd paramzd1, zd paramzd2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    com.aspose.cells.b.a.b.a.ze localze1 = a(paramzd1, paramzs);
    com.aspose.cells.b.a.b.a.ze localze2 = a(paramzd2, paramzs);
    com.aspose.cells.b.a.b.a.ze localze3 = b(paramzd1, paramzs);
    com.aspose.cells.b.a.b.a.ze localze4 = b(paramzd2, paramzs);
    double d1 = Math.atan2(paramFloat2 - paramFloat4, paramFloat1 - paramFloat3);
    double d2 = Math.atan2(paramFloat4 - paramFloat2, paramFloat3 - paramFloat1);
    zo[] arrayOfzo = new zo[2];
    arrayOfzo[0] = new zo(paramFloat1, paramFloat2);
    arrayOfzo[1] = new zo(paramFloat3, paramFloat4);
    a(paramzr, paramzs, localze1, localze2, localze3, localze4, d1, d2, paramzd1, paramzd2, 0, 0, arrayOfzo);
    paramzr.a(paramzs, arrayOfzo[0], arrayOfzo[1]);
  }
  
  public void a(zr paramzr, zs paramzs, zd paramzd1, zd paramzd2, com.aspose.cells.b.a.b.a.ze paramze)
  {
    if ((paramze == null) || (paramze.e() == 0)) {
      return;
    }
    zo[] arrayOfzo = paramze.c();
    byte[] arrayOfByte = paramze.d();
    if ((arrayOfzo == null) || (arrayOfzo.length < 2)) {
      return;
    }
    com.aspose.cells.b.a.b.a.ze localze1 = a(paramzd1, paramzs);
    com.aspose.cells.b.a.b.a.ze localze2 = a(paramzd2, paramzs);
    com.aspose.cells.b.a.b.a.ze localze3 = b(paramzd1, paramzs);
    com.aspose.cells.b.a.b.a.ze localze4 = b(paramzd2, paramzs);
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    if (2 > arrayOfzo.length) {
      return;
    }
    if (2 == arrayOfzo.length)
    {
      d1 = Math.atan2(arrayOfzo[0].e() - arrayOfzo[1].e(), arrayOfzo[0].d() - arrayOfzo[1].d());
      d2 = Math.atan2(arrayOfzo[1].e() - arrayOfzo[0].e(), arrayOfzo[1].d() - arrayOfzo[0].d());
      a(paramzr, paramzs, localze1, localze2, localze3, localze4, d1, d2, paramzd1, paramzd2, i, j, arrayOfzo);
    }
    else
    {
      localObject = new double[] { d1 };
      int[] arrayOfInt1 = { i };
      a(paramzs, arrayOfzo[0], arrayOfzo[1], arrayOfzo[2], paramzd1, (double[])localObject, arrayOfInt1);
      d1 = localObject[0];
      i = arrayOfInt1[0];
      int k = arrayOfzo.length - 1;
      double[] arrayOfDouble = { d2 };
      int[] arrayOfInt2 = { j };
      a(paramzs, arrayOfzo[k], arrayOfzo[(k - 1)], arrayOfzo[(k - 2)], paramzd2, arrayOfDouble, arrayOfInt2);
      d2 = arrayOfDouble[0];
      j = arrayOfInt2[0];
      a(paramzr, paramzs, localze1, localze2, localze3, localze4, d1, d2, paramzd1, paramzd2, i, j, arrayOfzo);
    }
    Object localObject = new com.aspose.cells.b.a.b.a.ze(arrayOfzo, arrayOfByte);
    paramzr.a(paramzs, (com.aspose.cells.b.a.b.a.ze)localObject);
  }
  
  private void a(zs paramzs, zo paramzo1, zo paramzo2, zo paramzo3, zd paramzd, double[] paramArrayOfDouble, int[] paramArrayOfInt)
  {
    double d1 = paramzo1.d() - paramzo2.d();
    double d2 = paramzo1.e() - paramzo2.e();
    float f = 0.0F;
    if ((paramzd instanceof za))
    {
      f = ((za)paramzd).b();
      f = paramzs.p() + f * 2.0F;
    }
    else if ((paramzd instanceof com.aspose.cells.a.d.ze))
    {
      f = paramzs.p();
    }
    if ((0.0D == d1) && (0.0D == d2))
    {
      if ((paramzo2.d() == paramzo3.d()) && (paramzo2.e() < paramzo3.e())) {
        paramArrayOfDouble[0] = -1.5707963267948966D;
      } else if ((paramzo2.d() == paramzo3.d()) && (paramzo2.e() > paramzo3.e())) {
        paramArrayOfDouble[0] = 1.5707963267948966D;
      } else if ((paramzo2.e() == paramzo3.e()) && (paramzo2.d() < paramzo3.d())) {
        paramArrayOfDouble[0] = 0.0D;
      } else if ((paramzo2.e() == paramzo3.e()) && (paramzo2.d() > paramzo3.d())) {
        paramArrayOfDouble[0] = 3.141592653589793D;
      }
      paramArrayOfInt[0] = 3;
    }
    else if ((0.0D == d1) && (0.0D != d2) && (Math.abs(d2) < f))
    {
      paramArrayOfDouble[0] = Math.asin(d2 / f);
      paramArrayOfInt[0] = 1;
    }
    else if ((0.0D == d2) && (Math.abs(d1) < f))
    {
      paramArrayOfDouble[0] = Math.acos(d1 / f);
      paramArrayOfInt[0] = 2;
    }
    else
    {
      paramArrayOfDouble[0] = Math.atan2(d2, d1);
    }
  }
  
  private void a(zr paramzr, zs paramzs, com.aspose.cells.b.a.b.a.ze paramze1, com.aspose.cells.b.a.b.a.ze paramze2, com.aspose.cells.b.a.b.a.ze paramze3, com.aspose.cells.b.a.b.a.ze paramze4, double paramDouble1, double paramDouble2, zd paramzd1, zd paramzd2, int paramInt1, int paramInt2, zo[] paramArrayOfzo)
  {
    zo localzo1 = new zo();
    zo localzo2 = new zo();
    localzo1 = paramArrayOfzo[0];
    localzo2 = paramArrayOfzo[1];
    zo[] arrayOfzo1 = { localzo1 };
    zo[] arrayOfzo2 = { localzo2 };
    a(paramzr, paramzs, paramze1, paramze3, paramDouble1, paramzd1, paramInt1, arrayOfzo1, arrayOfzo2);
    localzo1 = arrayOfzo1[0];
    localzo2 = arrayOfzo2[0];
    paramArrayOfzo[0] = localzo1;
    paramArrayOfzo[1] = localzo2;
    localzo1 = paramArrayOfzo[(paramArrayOfzo.length - 1)];
    localzo2 = paramArrayOfzo[(paramArrayOfzo.length - 2)];
    arrayOfzo1[0] = localzo1;
    arrayOfzo2[0] = localzo2;
    a(paramzr, paramzs, paramze2, paramze4, paramDouble2, paramzd2, paramInt2, arrayOfzo1, arrayOfzo2);
    localzo1 = arrayOfzo1[0];
    localzo2 = arrayOfzo2[0];
    paramArrayOfzo[(paramArrayOfzo.length - 1)] = localzo1;
    paramArrayOfzo[(paramArrayOfzo.length - 2)] = localzo2;
  }
  
  private void a(zr paramzr, zs paramzs, com.aspose.cells.b.a.b.a.ze paramze1, com.aspose.cells.b.a.b.a.ze paramze2, double paramDouble, zd paramzd, int paramInt, zo[] paramArrayOfzo1, zo[] paramArrayOfzo2)
  {
    zo localzo = paramArrayOfzo1[0];
    double d = paramDouble / 0.017453292519943295D;
    float f1 = 0.0F;
    if ((paramzd instanceof za))
    {
      f1 = ((za)paramzd).b();
      f1 = paramzs.p() + f1;
    }
    else if ((paramzd instanceof com.aspose.cells.a.d.ze))
    {
      f1 = paramzs.p();
    }
    float f2 = paramzs.p();
    if (paramzs.p() <= 1.0F) {
      f2 = 1.0F;
    }
    if (paramze1 != null)
    {
      float f3 = 1000.0F;
      zi localzi2 = new zi();
      localzi2.a(f2 * f3, f2 * f3);
      localzi2.a((float)(-90.0D + d));
      paramze1.a(localzi2);
      paramzr.a(1.0F / f3, 1.0F / f3);
      paramzr.b(localzo.d() * f3, localzo.e() * f3);
      float f4 = paramzs.p();
      paramzs.b(1.0F);
      if (d == 0.0D) {
        paramzr.a(paramzs, paramze1);
      }
      paramzr.a(new zu(paramzs.c()), paramze1);
      paramzs.b(f4);
      paramzr.b(-localzo.d() * f3, -localzo.e() * f3);
      paramzr.a(f3, f3);
    }
    if (paramze2 != null)
    {
      zi localzi1 = new zi();
      localzi1.a(f2, f2);
      localzi1.a((float)(-90.0D + d));
      paramze2.a(localzi1);
      paramzr.b(localzo.d(), localzo.e());
      int i = paramzs.o();
      int j = paramzs.k();
      int k = paramzs.l();
      if (paramzd != null)
      {
        int m = 0;
        int n = 0;
        int[] arrayOfInt1 = { m };
        int[] arrayOfInt2 = { n };
        paramzd.a(arrayOfInt1, arrayOfInt2);
        m = arrayOfInt1[0];
        n = arrayOfInt2[0];
        paramzs.e(m);
        paramzs.c(n);
        paramzs.d(paramzd.e());
      }
      paramzr.a(paramzs, paramze2);
      paramzs.e(i);
      paramzs.c(j);
      paramzs.d(k);
      paramzr.b(-localzo.d(), -localzo.e());
    }
    switch (paramInt)
    {
    case 0: 
    case 3: 
      paramArrayOfzo1[0].a((float)(paramArrayOfzo1[0].d() - f1 * Math.cos(paramDouble)));
      paramArrayOfzo1[0].b((float)(paramArrayOfzo1[0].e() - f1 * Math.sin(paramDouble)));
      if (3 == paramInt) {
        paramArrayOfzo2[0] = paramArrayOfzo1[0];
      }
      break;
    case 1: 
      paramArrayOfzo2[0].a((float)(paramArrayOfzo2[0].d() - f1 * Math.cos(paramDouble)));
      paramArrayOfzo1[0] = paramArrayOfzo2[0];
      break;
    case 2: 
      paramArrayOfzo2[0].b((float)(paramArrayOfzo2[0].e() - f1 * Math.sin(paramDouble)));
      paramArrayOfzo1[0] = paramArrayOfzo2[0];
      break;
    }
  }
  
  private com.aspose.cells.b.a.b.a.ze a(zd paramzd, zs paramzs)
  {
    if (paramzd == null) {
      return null;
    }
    if ((paramzd instanceof za))
    {
      za localza = (za)paramzd;
      if (localza.c())
      {
        com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
        zo[] arrayOfzo;
        if (localza.d() == 0.0F)
        {
          arrayOfzo = new zo[3];
          arrayOfzo[0] = new zo(-localza.a() / 2.0F, -localza.b());
          arrayOfzo[1] = new zo(localza.a() / 2.0F, -localza.b());
          arrayOfzo[2] = new zo(0.0F, 0.0F);
          localze.b(arrayOfzo);
        }
        else
        {
          arrayOfzo = new zo[5];
          double d1 = Math.atan2(localza.a() / 2.0F, localza.b());
          double d2 = (localza.a() / 2.0F - 0.5D) / Math.tan(d1);
          double d3 = d2 * localza.d() / localza.b();
          arrayOfzo[0] = new zo(-localza.a() / 2.0F, -localza.b());
          arrayOfzo[1] = new zo(-0.5F, (float)(-localza.b() + d3));
          arrayOfzo[2] = new zo(0.5F, (float)(-localza.b() + d3));
          arrayOfzo[3] = new zo(localza.a() / 2.0F, -localza.b());
          arrayOfzo[4] = new zo(0.0F, 0.0F);
          localze.b(arrayOfzo);
        }
        if (paramzs.p() <= 1.0F) {
          localze.a(new zi(2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F));
        }
        return localze;
      }
      return null;
    }
    if ((paramzd instanceof com.aspose.cells.a.d.ze)) {
      return ((com.aspose.cells.a.d.ze)paramzd).a();
    }
    throw new IllegalArgumentException("You should use ApsCustomLineCap instead of CustomLineCap");
  }
  
  private com.aspose.cells.b.a.b.a.ze b(zd paramzd, zs paramzs)
  {
    if (paramzd == null) {
      return null;
    }
    if ((paramzd instanceof za))
    {
      za localza = (za)paramzd;
      if (localza.c()) {
        return null;
      }
      com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
      localze.a(new zo(localza.a() / 2.0F, -localza.b()), new zo(0.0F, 0.0F));
      localze.a(new zo(-localza.a() / 2.0F, -localza.b()), new zo(0.0F, 0.0F));
      if (paramzs.p() <= 1.0F) {
        localze.a(new zi(2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F));
      }
      return localze;
    }
    if ((paramzd instanceof com.aspose.cells.a.d.ze)) {
      return ((com.aspose.cells.a.d.ze)paramzd).b();
    }
    throw new IllegalArgumentException("You should use ApsCustomLineCap instead of CustomLineCap");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */