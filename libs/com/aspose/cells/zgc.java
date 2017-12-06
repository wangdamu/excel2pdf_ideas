package com.aspose.cells;

import com.aspose.cells.b.a.za;

class zgc
{
  static double a(double[] paramArrayOfDouble, int paramInt, double paramDouble)
  {
    int i = za.a(paramArrayOfDouble, 0, paramInt, paramDouble);
    if (i < 0)
    {
      i = -i - 2;
      return (i + (paramDouble - paramArrayOfDouble[i]) / (paramArrayOfDouble[(i + 1)] - paramArrayOfDouble[i])) / (paramInt - 1);
    }
    if ((i > 0) && (paramArrayOfDouble[(i - 1)] == paramDouble))
    {
      i--;
      while ((i > 0) && (paramArrayOfDouble[(i - 1)] == paramDouble)) {
        i--;
      }
    }
    return i / (paramInt - 1);
  }
  
  static double b(double[] paramArrayOfDouble, int paramInt, double paramDouble)
  {
    int i = za.a(paramArrayOfDouble, 0, paramInt, paramDouble);
    if (i < 0)
    {
      i = -i - 2;
      return (i + 1.0D + (paramDouble - paramArrayOfDouble[i]) / (paramArrayOfDouble[(i + 1)] - paramArrayOfDouble[i])) / (paramInt + 1);
    }
    if ((i > 0) && (paramArrayOfDouble[(i - 1)] == paramDouble))
    {
      i--;
      while ((i > 0) && (paramArrayOfDouble[(i - 1)] == paramDouble)) {
        i--;
      }
    }
    return (i + 1) / (paramInt + 1);
  }
  
  static double a(double[] paramArrayOfDouble, double paramDouble)
  {
    int i = (int)paramDouble;
    double d = paramDouble - i;
    if (d == 0.0D) {
      return paramArrayOfDouble[i];
    }
    return (1.0D - d) * paramArrayOfDouble[i] + d * paramArrayOfDouble[(i + 1)];
  }
  
  public static zaie a(double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble2 < 1.0D) || (paramDouble3 < 1.0D) || (paramDouble2 >= 1.0E10D) || (paramDouble3 >= 1.0E10D)) {
      return zabc.b;
    }
    if (paramDouble1 == 0.0D) {
      return new zabb(1.0D);
    }
    try
    {
      return a(paramDouble3 / (paramDouble3 + paramDouble2 * paramDouble1), paramDouble3 / 2.0D, paramDouble2 / 2.0D, 0.0D, 1.0D, paramBoolean);
    }
    catch (Exception localException) {}
    return zabc.b;
  }
  
  public static zaie a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, boolean paramBoolean)
  {
    if ((paramDouble1 < paramDouble4) || (paramDouble1 > paramDouble5) || (paramDouble5 <= paramDouble4) || (paramDouble2 <= 0.0D) || (paramDouble3 <= 0.0D)) {
      return zabc.b;
    }
    double d;
    if (paramBoolean)
    {
      paramDouble1 = (paramDouble1 - paramDouble4) / (paramDouble5 - paramDouble4);
      d = zcq.a(paramDouble1, paramDouble2, paramDouble3);
    }
    else
    {
      d = zcq.b(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5);
    }
    if ((Double.isNaN(d)) || (Double.isInfinite(d))) {
      return zabc.b;
    }
    return new zabb(d);
  }
  
  public static zaie a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    if ((paramDouble1 <= 0.0D) || (paramDouble1 > 1.0D) || (paramDouble2 <= 0.0D) || (paramDouble3 <= 0.0D) || (paramDouble5 <= paramDouble4)) {
      return zabc.b;
    }
    double d = 0.0D;
    d = zcq.c(paramDouble1, paramDouble2, paramDouble3);
    d = d * (paramDouble5 - paramDouble4) + paramDouble4;
    return new zabb(d);
  }
  
  public static zaie a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    int i = 1;
    boolean[] arrayOfBoolean = { i };
    double d = zwx.a(paramDouble1, paramDouble2, paramDouble3, arrayOfBoolean);
    i = arrayOfBoolean[0];
    if (i != 0) {
      return zabc.b;
    }
    return new zabb(d);
  }
  
  public static zaie a(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 <= 0.0D) || (paramDouble1 > 1.0D) || (paramDouble2 > 1.0E10D) || (paramDouble2 < 1.0D)) {
      return zabc.b;
    }
    try
    {
      zaqo localzaqo = new zaqo(paramDouble2);
      if (localzaqo.a(0.0D, paramDouble1, 0.5D * paramDouble2, paramDouble2)) {
        return new zabb(localzaqo.a());
      }
    }
    catch (Exception localException) {}
    return zabc.b;
  }
  
  public static zaie a(double paramDouble1, double paramDouble2, int paramInt)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble2 < 1.0D) || (paramInt > 2) || (paramInt < 1)) {
      return zabc.b;
    }
    try
    {
      zamj localzamj = new zamj(paramDouble2);
      double d;
      if (paramDouble1 < 5.0D) {
        d = localzamj.a(0.0D, paramDouble1, 1.0E-20D);
      } else {
        d = localzamj.a(0.0D, 5.0D, 1.0E-20D) + localzamj.a(5.0D, paramDouble1, 1.0E-20D);
      }
      return new zabb((0.5D - d) * paramInt);
    }
    catch (Exception localException) {}
    return zabc.b;
  }
  
  public static zaie b(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble2 < 1.0D) || (paramDouble1 < 0.0D) || (paramDouble1 > 1.0D)) {
      return zabc.b;
    }
    if (paramDouble1 == 0.0D) {
      return new zabb(1.0E7D);
    }
    if (paramDouble1 == 1.0D) {
      return new zabb(0.0D);
    }
    try
    {
      zaqq localzaqq = new zaqq(paramDouble2, paramDouble1);
      if (localzaqq.a(1.0D, 100, 1.0E-12D)) {
        return new zabb(localzaqq.a());
      }
    }
    catch (Exception localException) {}
    return zabc.b;
  }
  
  public static zaie c(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble2 < 1.0D) || (paramDouble2 > 1.0E10D)) {
      return zabc.b;
    }
    try
    {
      return new zabb(1.0D - zacz.a(paramDouble2 * 0.5D, paramDouble1 * 0.5D));
    }
    catch (Exception localException) {}
    return zabc.b;
  }
  
  public static zaie a(double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble2 < 1.0D) || (paramDouble2 > 1.0E10D)) {
      return zabc.b;
    }
    try
    {
      return new zabb(zacz.a(paramDouble2 * 0.5D, paramDouble1 * 0.5D));
    }
    catch (Exception localException) {}
    return zabc.b;
  }
  
  static zaie a(int paramInt, double paramDouble1, double paramDouble2)
  {
    if ((paramInt < 0) || (paramDouble1 < 0.0D) || (paramDouble1 > 1.0D) || (paramDouble2 < 0.0D) || (paramDouble2 > 1.0D)) {
      return zabc.b;
    }
    int i = 0;
    double d = 0.0D;
    for (i = 0; i <= paramInt; i++)
    {
      d += zbqz.a(paramInt, i) * Math.pow(paramDouble1, i) * Math.pow(1.0D - paramDouble1, paramInt - i);
      if (d >= paramDouble2) {
        break;
      }
    }
    i = i > paramInt ? paramInt : i;
    return new zabb(i);
  }
  
  public static zaie a(int paramInt1, int paramInt2, double paramDouble, boolean paramBoolean)
  {
    if ((paramInt1 < 0) || (paramInt1 > paramInt2) || (paramDouble < 0.0D) || (paramDouble > 1.0D)) {
      return zabc.b;
    }
    double d = 0.0D;
    try
    {
      if (paramBoolean) {
        for (int i = paramInt1; i >= 0; i--) {
          d += zbqz.a(paramInt2, i) * Math.pow(paramDouble, i) * Math.pow(1.0D - paramDouble, paramInt2 - i);
        }
      } else {
        d = zbqz.a(paramInt2, paramInt1) * Math.pow(paramDouble, paramInt1) * Math.pow(1.0D - paramDouble, paramInt2 - paramInt1);
      }
      return new zabb(d);
    }
    catch (Exception localException) {}
    return zabc.b;
  }
  
  public static zaie b(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble1 > 1.0D) || (paramDouble2 <= 0.0D) || (paramDouble3 <= 0.0D)) {
      return zabc.b;
    }
    try
    {
      return new zabb(zacz.b(paramDouble1, paramDouble2, paramDouble3));
    }
    catch (Exception localException) {}
    return new zabb(0.0D);
  }
  
  static zaie a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    if (paramDouble1 >= 0.0D)
    {
      if ((paramDouble1 <= (paramDouble2 < paramDouble3 ? paramDouble2 : paramDouble3)) && (paramDouble2 >= 0.0D) && (paramDouble2 <= paramDouble4) && (paramDouble3 >= 0.0D) && (paramDouble3 <= paramDouble4) && (paramDouble4 >= 0.0D)) {}
    }
    else {
      return zabc.b;
    }
    paramDouble1 = Math.floor(paramDouble1);
    paramDouble2 = Math.floor(paramDouble2);
    paramDouble3 = Math.floor(paramDouble3);
    paramDouble4 = Math.floor(paramDouble4);
    return new zabb(e(paramDouble3, paramDouble1) * e(paramDouble4 - paramDouble3, paramDouble2 - paramDouble1) / e(paramDouble4, paramDouble2));
  }
  
  static double b(double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean)
  {
    double d = Math.pow(paramDouble1 / paramDouble3, paramDouble2);
    d = Math.exp(-d);
    if (paramBoolean) {
      return 1.0D - d;
    }
    return paramDouble2 / Math.pow(paramDouble3, paramDouble2) * Math.pow(paramDouble1, paramDouble2 - 1.0D) * d;
  }
  
  public static zaie c(double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble2 <= 0.0D) || (paramDouble3 <= 0.0D)) {
      return zabc.b;
    }
    if (!paramBoolean) {
      return new zabb(zacz.c(paramDouble1, paramDouble2, paramDouble3));
    }
    if (paramDouble1 <= 0.0D) {
      return zabb.a;
    }
    try
    {
      return new zabb(zacz.e(paramDouble2, paramDouble1 / paramDouble3));
    }
    catch (Exception localException) {}
    return zabc.b;
  }
  
  static double a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
  {
    double d1 = a(paramArrayOfDouble, paramInt1, paramInt2, 1);
    double d2 = (d1 - paramDouble1) / (paramDouble2 / Math.sqrt(paramInt2 - paramInt1));
    double d3 = 1.0D - zaqs.b(d2);
    return d3;
  }
  
  static double a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, double paramDouble)
  {
    double d1 = a(paramArrayOfDouble, paramInt1, paramInt2, 1);
    double d2 = a(paramArrayOfDouble, 1, paramInt2);
    double d3 = (d1 - paramDouble) / Math.sqrt(d2 / (paramInt2 - paramInt1));
    double d4 = 1.0D - zaqs.b(d3);
    return d4;
  }
  
  static zaie a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, int paramInt1, int paramInt2)
  {
    double d1 = 0.0D;
    double d2;
    if (paramInt2 == 1)
    {
      d2 = b(paramArrayOfDouble1, paramArrayOfDouble2);
      d1 = paramArrayOfDouble1.length - 1;
    }
    else if (paramInt2 == 2)
    {
      d2 = a(paramArrayOfDouble1, paramArrayOfDouble2);
      d1 = paramArrayOfDouble1.length + paramArrayOfDouble2.length - 2;
    }
    else
    {
      double d3 = a(paramArrayOfDouble1, 1, paramArrayOfDouble1.length);
      double d4 = a(paramArrayOfDouble2, 1, paramArrayOfDouble2.length);
      double d5 = a(paramArrayOfDouble1, 0, paramArrayOfDouble1.length, 1);
      double d6 = a(paramArrayOfDouble2, 0, paramArrayOfDouble2.length, 1);
      d2 = a(d5, d6, d3, d4, paramArrayOfDouble1.length, paramArrayOfDouble2.length);
      d1 = a(d3, paramArrayOfDouble1.length, d4, paramArrayOfDouble2.length);
    }
    return a(d2, d1, paramInt1);
  }
  
  private static double b(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    int i = paramArrayOfDouble1.length;
    for (int j = 0; j < i; j++)
    {
      d3 = paramArrayOfDouble1[j] - paramArrayOfDouble2[j];
      d1 += d3;
      d2 += d3 * d3;
    }
    double d4 = d1 / (i * Math.sqrt((i * d2 - d1 * d1) / (i * i * (i - 1))));
    return Math.abs(d4);
  }
  
  static double a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    double d1 = a(paramArrayOfDouble1, 0, paramArrayOfDouble1.length, 1);
    double d2 = a(paramArrayOfDouble2, 0, paramArrayOfDouble2.length, 1);
    double d3 = a(paramArrayOfDouble1, 1, paramArrayOfDouble1.length, paramArrayOfDouble2, 1, paramArrayOfDouble2.length);
    double d4 = (d1 - d2) / Math.sqrt(d3 * (1.0D / paramArrayOfDouble1.length + 1.0D / paramArrayOfDouble2.length));
    return d4;
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt1, int paramInt2)
  {
    return (paramDouble1 - paramDouble2) / Math.sqrt(paramDouble3 / paramInt1 + paramDouble4 / paramInt2);
  }
  
  private static double a(double paramDouble1, int paramInt1, double paramDouble2, int paramInt2)
  {
    return (paramDouble1 / paramInt1 + paramDouble2 / paramInt2) * (paramDouble1 / paramInt1 + paramDouble2 / paramInt2) / (paramDouble1 / paramInt1 * (paramDouble1 / paramInt1) / (paramInt1 - 1) + paramDouble2 / paramInt2 * (paramDouble2 / paramInt2) / (paramInt2 - 1));
  }
  
  static double a(double[] paramArrayOfDouble1, int paramInt1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4)
  {
    double d1 = a(paramArrayOfDouble1, paramInt1, paramInt2);
    double d2 = a(paramArrayOfDouble2, paramInt3, paramInt4);
    return ((paramInt2 - 1) * d1 + (paramInt4 - 1) * d2) / (paramInt2 + paramInt4 - 2);
  }
  
  private static double a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3)
  {
    double d = 0.0D;
    for (int i = paramInt1; i < paramInt2; i++) {
      d += (paramArrayOfDouble[(i * paramInt3)] - d) / (i - paramInt1 + 1);
    }
    return d;
  }
  
  private static double a(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    double d = a(paramArrayOfDouble, 0, paramInt2, paramInt1);
    return b(paramArrayOfDouble, paramInt1, paramInt2, d);
  }
  
  private static double b(double[] paramArrayOfDouble, int paramInt1, int paramInt2, double paramDouble)
  {
    double d = c(paramArrayOfDouble, paramInt1, paramInt2, paramDouble);
    return d * (paramInt2 / (paramInt2 - 1));
  }
  
  private static double c(double[] paramArrayOfDouble, int paramInt1, int paramInt2, double paramDouble)
  {
    double d1 = 0.0D;
    for (int i = 0; i < paramInt2; i++)
    {
      double d2 = paramArrayOfDouble[(i * paramInt1)] - paramDouble;
      d1 += (d2 * d2 - d1) / (i + 1);
    }
    return d1;
  }
  
  private static double e(double paramDouble1, double paramDouble2)
  {
    return d(paramDouble1, paramDouble2) / d(paramDouble2, paramDouble2);
  }
  
  static double d(double paramDouble1, double paramDouble2)
  {
    double d1 = 1.0D;
    paramDouble1 = Math.floor(paramDouble1);
    paramDouble2 = Math.floor(paramDouble2);
    for (double d2 = paramDouble1; d2 > paramDouble1 - paramDouble2; d2 -= 1.0D) {
      d1 *= d2;
    }
    return d1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */