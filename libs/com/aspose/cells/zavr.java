package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;

class zavr
{
  long[] a;
  byte[] b;
  long c = 0L;
  long d = 0L;
  byte e = 1;
  boolean f = true;
  boolean g = true;
  
  zavr(byte[] paramArrayOfByte, long[] paramArrayOfLong, long paramLong1, long paramLong2, byte paramByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c = paramLong1;
    this.d = paramLong2;
    this.b = paramArrayOfByte;
    this.a = paramArrayOfLong;
    this.e = paramByte;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
  }
  
  public ze a(zadg paramzadg, double[] paramArrayOfDouble, byte[] paramArrayOfByte, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean[] paramArrayOfBoolean)
  {
    ze localze = new ze();
    int i = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    long l1 = a();
    long l2 = b();
    float f9 = 1.0F;
    float f10 = 1.0F;
    if (this.c > 0L) {
      f9 = paramFloat3 / (float)l1;
    }
    if (this.d > 0L) {
      f10 = paramFloat4 / (float)l2;
    }
    paramArrayOfBoolean[0] = false;
    for (int m : this.b)
    {
      float f3;
      float f4;
      float f5;
      float f6;
      switch (m)
      {
      case 0: 
        localze.j();
        paramArrayOfBoolean[0] = true;
        break;
      case 1: 
        localze.k();
        f1 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f9 + paramFloat1;
        f2 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f10 + paramFloat2;
        break;
      case 2: 
        f3 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f9 + paramFloat1;
        f4 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f10 + paramFloat2;
        localze.b(f1, f2, f3, f4);
        f1 = f3;
        f2 = f4;
        break;
      case 3: 
        float f11 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f9;
        float f12 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f10;
        float f13 = paramzadg.b(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]);
        float f14 = paramzadg.b(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]);
        if (0.0F == f12) {
          f12 = 0.5F;
        }
        if (Math.abs(f11) + Math.abs(f12) >= 0.005D)
        {
          double d1 = f13 / 180.0F * 3.141592653589793D;
          if ((f9 / f10 < 0.9999D) || (f9 / f10 > 1.0001D))
          {
            d2 = (f13 + f14) / 180.0F * 3.141592653589793D;
            d3 = Math.cos(d1) * f9;
            d4 = Math.sin(d1) * f10;
            d1 = Math.atan2(d4, d3);
            f13 = (float)(d1 * 180.0D / 3.141592653589793D);
            d3 = Math.cos(d2) * f9;
            d4 = Math.sin(d2) * f10;
            d2 = Math.atan2(d4, d3);
            float f15 = (float)(d2 * 180.0D / 3.141592653589793D) - f13;
            if ((f14 < 0.0F) && (f15 > 0.0F)) {
              f14 = f15 - 360.0F;
            } else if ((f14 > 0.0F) && (f15 < 0.0F)) {
              f14 = f15 + 360.0F;
            } else {
              f14 = f15;
            }
          }
          double d2 = Math.cos(d1);
          double d3 = Math.sin(d1);
          double d4 = Math.sqrt(1.0D / (d2 * d2 / f11 / f11 + d3 * d3 / f12 / f12));
          f3 = (float)(f1 - d2 * d4);
          f4 = (float)(f2 - d3 * d4);
          localze.a(f3 - f11, f4 - f12, f11 * 2.0F, f12 * 2.0F, f13, f14);
          if (localze.e() < 2)
          {
            f1 = f2 = 0.0F;
          }
          else
          {
            zo[] arrayOfzo = localze.c();
            int n = localze.e();
            zo localzo = arrayOfzo[(n - 1)];
            f1 = localzo.d();
            f2 = localzo.e();
          }
        }
        break;
      case 4: 
        f3 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f9 + paramFloat1;
        f4 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f10 + paramFloat2;
        f5 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f9 + paramFloat1;
        f6 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f10 + paramFloat2;
        localze.a(f1, f2, f1 + (f3 - f1) * 2.0F / 3.0F, f2 + (f4 - f2) * 2.0F / 3.0F, f5 + (f3 - f5) * 2.0F / 3.0F, f6 + (f4 - f6) * 2.0F / 3.0F, f5, f6);
        f1 = f5;
        f2 = f6;
        break;
      case 5: 
        f3 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f9 + paramFloat1;
        f4 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f10 + paramFloat2;
        f5 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f9 + paramFloat1;
        f6 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f10 + paramFloat2;
        float f7 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f9 + paramFloat1;
        float f8 = paramzadg.a(paramArrayOfDouble, paramArrayOfByte, this.a[(i++)]) * f10 + paramFloat2;
        localze.a(f1, f2, f3, f4, f5, f6, f7, f8);
        f1 = f7;
        f2 = f8;
      }
    }
    return localze;
  }
  
  long a()
  {
    return this.c > 0L ? this.c : 1L;
  }
  
  long b()
  {
    return this.d > 0L ? this.d : 1L;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */