package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.zr;

abstract class zacz
{
  public static double a(double paramDouble)
  {
    double[] arrayOfDouble = { 76.18009172947146D, -86.50532032941678D, 24.01409824083091D, -1.231739572450155D, 0.001208650973866179D, -5.395239384953E-6D };
    double d1;
    double d2 = d1 = paramDouble;
    double d4 = d1 + 5.5D;
    d4 -= (d1 + 0.5D) * Math.log(d4);
    double d3 = 1.000000000190015D;
    for (int i = 0; i <= 5; i++) {
      d3 += arrayOfDouble[i] / ++d2;
    }
    return -d4 + Math.log(2.5066282746310007D * d3 / d1);
  }
  
  public static double b(double paramDouble)
  {
    if (paramDouble > 0.0D) {
      return Math.exp(a(paramDouble));
    }
    double d1 = 1.0D - paramDouble;
    double d2 = Math.sin(3.141592653589793D * d1);
    if (zare.a(0.0D, d2)) {
      return NaN.0D;
    }
    return 3.141592653589793D / (d2 * Math.exp(a(d1)));
  }
  
  public static double a(double paramDouble1, double paramDouble2)
  {
    int i = 1000;
    double d1 = zare.a;
    double d2 = Double.MIN_VALUE / d1;
    if ((paramDouble1 < 0.0D) || (paramDouble2 < 0.0D)) {
      throw new IllegalArgumentException("Parameter name: GammaRegularized: " + paramDouble1 + " " + paramDouble2);
    }
    double d3 = a(paramDouble1);
    double d4;
    double d5;
    double d6;
    if (paramDouble2 < paramDouble1 + 1.0D)
    {
      if (paramDouble2 <= 0.0D) {
        return 0.0D;
      }
      d4 = paramDouble1;
      d6 = d5 = 1.0D / paramDouble1;
      for (int j = 0; j < i; j++)
      {
        d4 += 1.0D;
        d5 *= paramDouble2 / d4;
        d6 += d5;
        if ((Math.abs(d5) < Math.abs(d6) * d1) || (j == i - 1)) {
          return d6 * Math.exp(-paramDouble2 + paramDouble1 * Math.log(paramDouble2) - d3);
        }
      }
    }
    else
    {
      d4 = paramDouble2 + 1.0D - paramDouble1;
      d5 = 1.0D / d2;
      d6 = 1.0D / d4;
      double d7 = d6;
      for (int k = 1; k <= i; k++)
      {
        double d8 = -k * (k - paramDouble1);
        d4 += 2.0D;
        d6 = d8 * d6 + d4;
        if (Math.abs(d6) < d2) {
          d6 = d2;
        }
        d5 = d4 + d8 / d5;
        if (Math.abs(d5) < d2) {
          d5 = d2;
        }
        d6 = 1.0D / d6;
        double d9 = d6 * d5;
        d7 *= d9;
        if ((Math.abs(d9 - 1.0D) <= d1) || (k == i - 1)) {
          return 1.0D - Math.exp(-paramDouble2 + paramDouble1 * Math.log(paramDouble2) - d3) * d7;
        }
      }
    }
    throw new IllegalArgumentException("GammaRegularized: ArgumentTooLargeForIterationLimit");
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (paramDouble1 < 0.0D) {
      return 0.0D;
    }
    if (paramDouble1 == 0.0D)
    {
      if (paramDouble2 == 1.0D) {
        return 1.0D / paramDouble3;
      }
      return 0.0D;
    }
    if (paramDouble2 == 1.0D) {
      return Math.exp(-paramDouble1 / paramDouble3) / paramDouble3;
    }
    double d2 = a(paramDouble2);
    double d1 = Math.exp((paramDouble2 - 1.0D) * Math.log(paramDouble1 / paramDouble3) - paramDouble1 / paramDouble3 - d2) / paramDouble3;
    return d1;
  }
  
  public static double b(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (paramDouble1 == 1.0D) {
      paramDouble1 -= 1.0E-6D;
    } else if (paramDouble1 == 0.0D) {
      return 0.0D;
    }
    double d2;
    double d1;
    double d3;
    if (paramDouble1 < 0.05D)
    {
      d2 = Math.exp((a(paramDouble2) + Math.log(paramDouble1)) / paramDouble2);
      d1 = d2;
    }
    else if (paramDouble1 > 0.95D)
    {
      d2 = -zr.a(1.0D - paramDouble1, 2.718281828459045D) + a(paramDouble2);
      d1 = d2;
    }
    else
    {
      d2 = zada.d(paramDouble1);
      d3 = d2 < -0.5D * Math.sqrt(paramDouble2) ? paramDouble2 : Math.sqrt(paramDouble2) * d2 + paramDouble2;
      d1 = d3;
    }
    int i = 0;
    double d5;
    do
    {
      d3 = paramDouble1 - d(d1, paramDouble2, 1.0D);
      double d4 = a(d1, paramDouble2, 1.0D);
      if ((d3 == 0.0D) || (i++ > 64)) {
        break;
      }
      d2 = d3 / Math.max(2.0D * Math.abs(d3 / d1), d4);
      d5 = d2;
      double d6 = -((paramDouble2 - 1.0D) / d1 - 1.0D) * d2 * d2 / 4.0D;
      double d7 = d5;
      if (Math.abs(d6) < 0.5D * Math.abs(d5)) {
        d7 += d6;
      }
      if (d1 + d7 > 0.0D) {
        d1 += d7;
      } else {
        d1 /= 2.0D;
      }
    } while (Math.abs(d5) > 1.0E-10D * d1);
    if (Math.abs(d3) > 1.0E-10D * paramDouble1) {
      zl.a("inverse failed to converge");
    }
    return paramDouble3 * d1;
  }
  
  static double c(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (paramDouble1 <= 0.0D) {
      return 0.0D;
    }
    double d1 = 171.624376956302D;
    try
    {
      double d2 = paramDouble1 / paramDouble3;
      if (d2 > 1.0D)
      {
        double d3 = Math.log(Double.MAX_VALUE);
        if ((Math.log(d2) * (paramDouble2 - 1.0D) < d3) && (paramDouble2 < d1)) {
          return Math.pow(d2, paramDouble2 - 1.0D) * Math.exp(-d2) / paramDouble3 / b(paramDouble2);
        }
        return Math.exp((paramDouble2 - 1.0D) * Math.log(d2) - d2 - Math.log(paramDouble3) - a(paramDouble2));
      }
      if (paramDouble2 < d1) {
        return Math.pow(d2, paramDouble2 - 1.0D) * Math.exp(-d2) / paramDouble3 / b(paramDouble2);
      }
      return Math.pow(d2, paramDouble2 - 1.0D) * Math.exp(-d2) / paramDouble3 / Math.exp(a(paramDouble2));
    }
    catch (Exception localException) {}
    return 0.0D;
  }
  
  public static double b(double paramDouble1, double paramDouble2)
  {
    if (paramDouble1 <= 0.0D) {
      return 0.0D;
    }
    try
    {
      return e(paramDouble2, paramDouble1 / 1.0D);
    }
    catch (Exception localException) {}
    return 0.0D;
  }
  
  public static double d(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (paramDouble1 <= 0.0D) {
      return 0.0D;
    }
    try
    {
      return e(paramDouble2, paramDouble1 / paramDouble3);
    }
    catch (Exception localException) {}
    return 0.0D;
  }
  
  static double c(double paramDouble1, double paramDouble2)
  {
    double d1 = Double.MIN_VALUE;
    double d2 = 1.0D / d1;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 1.0D - paramDouble1;
    double d6 = paramDouble2 + 2.0D - paramDouble1;
    double d7 = 0.0D;
    double d8 = paramDouble2 + 1.0D;
    double d9 = 1.0D;
    double d10 = 1.0D;
    double d11 = d6 * paramDouble2;
    double d12 = paramDouble2;
    double d13 = d8 / d11;
    int i = 0;
    double d14 = 0.0D;
    do
    {
      d3 += 1.0D;
      d5 += 1.0D;
      d4 = d5 * d3;
      d6 += 2.0D;
      d7 = d8 * d6 - d9 * d4;
      d10 = d11 * d6 - d12 * d4;
      if (d10 != 0.0D)
      {
        d14 = d7 / d10;
        i = Math.abs((d13 - d14) / d14) <= 0.0D ? 1 : 0;
        d13 = d14;
      }
      d9 = d8;
      d8 = d7;
      d12 = d11;
      d11 = d10;
      if (Math.abs(d7) > d2)
      {
        d9 *= d1;
        d8 *= d1;
        d12 *= d1;
        d11 *= d1;
      }
    } while ((i == 0) && (d3 < 10000.0D));
    if (i == 0) {
      return 0.0D;
    }
    return d13;
  }
  
  static double d(double paramDouble1, double paramDouble2)
  {
    double d1 = paramDouble1;
    double d2 = 1.0D / paramDouble1;
    double d3 = d2;
    int i = 1;
    do
    {
      d1 += 1.0D;
      d2 = d2 * paramDouble2 / d1;
      d3 += d2;
      i += 1;
    } while ((d2 / d3 > 0.0D) && (i <= 10000));
    if (i > 10000) {
      return 0.0D;
    }
    return d3;
  }
  
  static double e(double paramDouble1, double paramDouble2)
  {
    double d1 = paramDouble1 * Math.log(paramDouble2) - paramDouble2 - a(paramDouble1);
    double d2 = Math.exp(d1);
    if (paramDouble2 > paramDouble1 + 1.0D) {
      return 1.0D - d2 * c(paramDouble1, paramDouble2);
    }
    return d2 * d(paramDouble1, paramDouble2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */