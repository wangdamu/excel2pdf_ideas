package com.aspose.cells;

abstract class zcq
{
  public static double a(double paramDouble1, double paramDouble2)
  {
    return Math.exp(zacz.a(paramDouble1) + zacz.a(paramDouble2) - zacz.a(paramDouble1 + paramDouble2));
  }
  
  public static double b(double paramDouble1, double paramDouble2)
  {
    return zacz.a(paramDouble1) + zacz.a(paramDouble2) - zacz.a(paramDouble1 + paramDouble2);
  }
  
  public static double a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (paramDouble1 <= 0.0D) {
      return 0.0D;
    }
    if (paramDouble1 >= 1.0D) {
      return 1.0D;
    }
    return a(1.0D, 0.0D, paramDouble2, paramDouble3, paramDouble1);
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    double d1 = Double.NEGATIVE_INFINITY;
    if (paramDouble1 == -1.0D) {
      return NaN.0D;
    }
    double d2 = 1.0D - (paramDouble1 + paramDouble2) * paramDouble3 / (paramDouble1 + 1.0D);
    if ((Math.abs(d2) < d1) || (d2 == 0.0D)) {
      return NaN.0D;
    }
    d2 = 1.0D / d2;
    int i = 512;
    int j = 0;
    double d4 = 1.0D;
    double d3 = d2;
    while (j < i)
    {
      int k = j + 1;
      double d5 = k * (paramDouble2 - k) * paramDouble3 / ((paramDouble1 - 1.0D + 2 * k) * (paramDouble1 + 2 * k));
      d2 = 1.0D + d5 * d2;
      d4 = 1.0D + d5 / d4;
      if ((Math.abs(d2) < d1) || (Math.abs(d4) < d1)) {
        return NaN.0D;
      }
      d2 = 1.0D / d2;
      double d6 = d2 * d4;
      d3 *= d6;
      d5 = -(paramDouble1 + k) * (paramDouble1 + paramDouble2 + k) * paramDouble3 / ((paramDouble1 + 2 * k) * (paramDouble1 + 2 * k + 1.0D));
      d2 = 1.0D + d5 * d2;
      d4 = 1.0D + d5 / d4;
      if ((Math.abs(d2) < d1) || (Math.abs(d4) < d1)) {
        return NaN.0D;
      }
      d2 = 1.0D / d2;
      d6 = d2 * d4;
      d3 *= d6;
      if ((Math.abs(d6 - 1.0D) < 1.0E-323D) || (d3 * Math.abs(d6 - 1.0D) < paramDouble4)) {
        break;
      }
      j++;
    }
    if (j >= i) {
      return NaN.0D;
    }
    return d3;
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    if (paramDouble5 == 0.0D) {
      return paramDouble1 * 0.0D + paramDouble2;
    }
    if (paramDouble5 == 1.0D) {
      return paramDouble1 * 1.0D + paramDouble2;
    }
    if ((paramDouble3 > 100000.0D) && (paramDouble4 < 10.0D) && (paramDouble5 > paramDouble3 / (paramDouble3 + paramDouble4)))
    {
      d1 = paramDouble3 + (paramDouble4 - 1.0D) / 2.0D;
      return paramDouble1 * (1.0D - zacz.b(paramDouble4, -d1 * Math.log(paramDouble5))) + paramDouble2;
    }
    if ((paramDouble4 > 100000.0D) && (paramDouble3 < 10.0D) && (paramDouble5 < paramDouble4 / (paramDouble3 + paramDouble4)))
    {
      d1 = paramDouble4 + (paramDouble3 - 1.0D) / 2.0D;
      return paramDouble1 * zacz.b(paramDouble3, -d1 * Math.log(1.0D - paramDouble5)) + paramDouble2;
    }
    double d1 = b(paramDouble3, paramDouble4);
    double d2 = -d1 + paramDouble3 * Math.log(paramDouble5) + paramDouble4 * Math.log(1.0D - paramDouble5);
    double d3 = Math.exp(d2);
    if (paramDouble5 < (paramDouble3 + 1.0D) / (paramDouble3 + paramDouble4 + 2.0D))
    {
      d4 = Math.abs(paramDouble2 / (paramDouble1 * d3 / paramDouble3)) * Double.MIN_VALUE;
      d5 = a(paramDouble3, paramDouble4, paramDouble5, d4);
      return paramDouble1 * (d3 * d5 / paramDouble3) + paramDouble2;
    }
    double d4 = Math.abs((paramDouble1 + paramDouble2) / (paramDouble1 * d3 / paramDouble4)) * Double.MIN_VALUE;
    double d5 = a(paramDouble4, paramDouble3, 1.0D - paramDouble5, d4);
    double d6 = d3 * d5 / paramDouble4;
    if (paramDouble1 == -paramDouble2) {
      return -paramDouble1 * d6;
    }
    return paramDouble1 * (1.0D - d6) + paramDouble2;
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    double d1 = 0.0D;
    double d2 = 1.0D;
    while (Math.abs(d2 - d1) > paramDouble5)
    {
      double d3 = a(paramDouble1, paramDouble3, paramDouble4);
      if (Math.abs(d3 - paramDouble2) < paramDouble6) {
        return paramDouble1;
      }
      if (d3 < paramDouble2) {
        d1 = paramDouble1;
      } else if (d3 > paramDouble2) {
        d2 = paramDouble1;
      }
      paramDouble1 = 0.5D * (d1 + d2);
    }
    return paramDouble1;
  }
  
  static double b(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble1 > 1.0D)) {
      return 0.0D;
    }
    double d2 = zacz.a(paramDouble2 + paramDouble3);
    double d3 = zacz.a(paramDouble2);
    double d4 = zacz.a(paramDouble3);
    double d1;
    if ((paramDouble1 == 0.0D) || (paramDouble1 == 1.0D)) {
      d1 = Math.exp(d2 - d3 - d4) * Math.pow(paramDouble1, paramDouble2 - 1.0D) * Math.pow(1.0D - paramDouble1, paramDouble3 - 1.0D);
    } else {
      d1 = Math.exp(d2 - d3 - d4 + Math.log(paramDouble1) * (paramDouble2 - 1.0D) + Math.log(1.0D - paramDouble1) * (paramDouble3 - 1.0D));
    }
    return d1;
  }
  
  public static double c(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble1 > 1.0D)) {
      throw new IllegalArgumentException("CDFBETAPINV: P must be in range 0 < P < 1");
    }
    if (paramDouble2 < 0.0D) {
      throw new IllegalArgumentException("CDFBETAPINV: a < 0");
    }
    if (paramDouble3 < 0.0D) {
      throw new IllegalArgumentException("CDFBETAPINV: b < 0");
    }
    if (paramDouble1 == 0.0D) {
      return 0.0D;
    }
    if (paramDouble1 == 1.0D) {
      return 1.0D;
    }
    if (paramDouble1 > 0.5D) {
      return d(1.0D - paramDouble1, paramDouble2, paramDouble3);
    }
    double d2 = paramDouble2 / (paramDouble2 + paramDouble3);
    double d3;
    double d4;
    double d5;
    if (paramDouble1 < 0.1D)
    {
      d3 = zacz.a(paramDouble2 + paramDouble3);
      d4 = zacz.a(paramDouble2);
      d5 = zacz.a(paramDouble3);
      double d6 = (Math.log(paramDouble2) + d4 + d5 - d3 + Math.log(paramDouble1)) / paramDouble2;
      if (d6 <= 0.0D)
      {
        d1 = Math.exp(d6);
        d1 *= Math.pow(1.0D - d1, -(paramDouble3 - 1.0D) / paramDouble2);
      }
      else
      {
        d1 = d2;
      }
      if (d1 > d2) {
        d1 = d2;
      }
    }
    else
    {
      d1 = d2;
    }
    double d1 = a(d1, paramDouble1, paramDouble2, paramDouble3, 0.01D, 0.01D);
    int i = 0;
    double d7;
    do
    {
      d4 = paramDouble1 - a(d1, paramDouble2, paramDouble3);
      d5 = b(d1, paramDouble2, paramDouble3);
      if ((d4 == 0.0D) || (i++ > 64)) {
        break;
      }
      d3 = d4 / Math.max(2.0D * Math.abs(d4 / d1), d5);
      d7 = d3;
      double d8 = -((paramDouble2 - 1.0D) / d1 - (paramDouble3 - 1.0D) / (1.0D - d1)) * d3 * d3 / 2.0D;
      double d9 = d7;
      if (Math.abs(d8) < Math.abs(d7)) {
        d9 += d8;
      } else {
        d9 *= 2.0D * Math.abs(d7 / d8);
      }
      if ((d1 + d9 > 0.0D) && (d1 + d9 < 1.0D)) {
        d1 += d9;
      } else {
        d1 = Math.sqrt(d1) * Math.sqrt(d2);
      }
    } while (Math.abs(d7) > 1.0E-10D * d1);
    if (Math.abs(d4) > 1.0E-10D * paramDouble1) {
      throw new IllegalArgumentException("CDFBETAPINV: inverse failed to converge");
    }
    return d1;
  }
  
  public static double d(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble1 > 1.0D)) {
      throw new IllegalArgumentException("CDFBETAPINV: Q must be inside range 0 < Q < 1");
    }
    if (paramDouble2 < 0.0D) {
      throw new IllegalArgumentException("CDFBETAPINV: a < 0");
    }
    if (paramDouble3 < 0.0D) {
      throw new IllegalArgumentException("CDFBETAPINV: b < 0");
    }
    if (paramDouble1 == 0.0D) {
      return 1.0D;
    }
    if (paramDouble1 == 1.0D) {
      return 0.0D;
    }
    if (paramDouble1 > 0.5D) {
      return c(1.0D - paramDouble1, paramDouble2, paramDouble3);
    }
    return 1.0D - c(paramDouble1, paramDouble3, paramDouble2);
  }
  
  static double b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    return zacz.b(paramDouble2 + paramDouble3) / zacz.b(paramDouble2) / zacz.b(paramDouble3) * (Math.pow(paramDouble1 - paramDouble4, paramDouble2 - 1.0D) * Math.pow(paramDouble5 - paramDouble1, paramDouble3 - 1.0D) / Math.pow(paramDouble5 - paramDouble4, paramDouble2 + paramDouble3 - 1.0D));
  }
  
  public static double e(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return c(paramDouble1, paramDouble2, paramDouble3, 0.0D, 1.0D);
  }
  
  public static double c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    if ((paramDouble1 < paramDouble4) || (paramDouble1 > paramDouble5) || (paramDouble5 <= paramDouble4)) {
      return 0.0D;
    }
    if ((paramDouble2 < 0.0D) || (paramDouble3 < 0.0D)) {
      return 0.0D;
    }
    paramDouble1 = (paramDouble1 - paramDouble4) / (paramDouble5 - paramDouble4);
    try
    {
      return a(paramDouble1, paramDouble2, paramDouble3);
    }
    catch (Exception localException) {}
    return 0.0D;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */