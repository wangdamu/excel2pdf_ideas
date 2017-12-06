package com.aspose.cells;

abstract class zbpi
{
  public static double a(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    double d = 0.0D;
    while (paramInt1 < paramInt2)
    {
      d += paramArrayOfDouble[paramInt1];
      paramInt1++;
    }
    return d;
  }
  
  public static double b(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    if (paramInt2 == paramInt1) {
      return 0.0D;
    }
    double d = a(paramArrayOfDouble, paramInt1, paramInt2);
    return d / (paramInt2 - paramInt1);
  }
  
  public static double c(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    return Math.sqrt(e(paramArrayOfDouble, paramInt1, paramInt2) / (paramInt2 - paramInt1 - 1));
  }
  
  public static double d(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    return Math.sqrt(e(paramArrayOfDouble, paramInt1, paramInt2) / (paramInt2 - paramInt1));
  }
  
  public static double e(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    double d1 = b(paramArrayOfDouble, paramInt1, paramInt2);
    double d2 = 0.0D;
    while (paramInt1 < paramInt2)
    {
      d2 += (paramArrayOfDouble[paramInt1] - d1) * (paramArrayOfDouble[paramInt1] - d1);
      paramInt1++;
    }
    return d2;
  }
  
  public static double f(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    double d1 = b(paramArrayOfDouble, paramInt1, paramInt2);
    double d2 = 0.0D;
    for (int i = paramInt1; i < paramInt2; i++) {
      d2 += Math.abs(paramArrayOfDouble[i] - d1);
    }
    return d2 / (paramInt2 - paramInt1);
  }
  
  public static zaie g(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    if (paramInt2 - paramInt1 < 3) {
      return zabc.a;
    }
    double d1 = b(paramArrayOfDouble, paramInt1, paramInt2);
    double d2 = 0.0D;
    for (int i = paramInt1; i < paramInt2; i++) {
      d2 += (paramArrayOfDouble[i] - d1) * (paramArrayOfDouble[i] - d1);
    }
    d2 = Math.sqrt(d2 / (paramInt2 - paramInt1 - 1));
    if (d2 == 0.0D) {
      return zabc.a;
    }
    double d3 = 0.0D;
    double d4 = 0.0D;
    for (int j = paramInt1; j < paramInt2; j++)
    {
      d4 = (paramArrayOfDouble[j] - d1) / d2;
      d3 += d4 * d4 * d4;
    }
    return new zabb(d3 * (paramInt2 - paramInt1) / ((paramInt2 - paramInt1 - 1) * (paramInt2 - paramInt1 - 2)));
  }
  
  public static zaie h(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    if (paramInt2 - paramInt1 < 4) {
      return zabc.a;
    }
    double d1 = b(paramArrayOfDouble, paramInt1, paramInt2);
    double d2 = 0.0D;
    for (int i = paramInt1; i < paramInt2; i++) {
      d2 += (paramArrayOfDouble[i] - d1) * (paramArrayOfDouble[i] - d1);
    }
    d2 = Math.sqrt(d2 / (paramInt2 - paramInt1 - 1));
    if (d2 == 0.0D) {
      return zabc.a;
    }
    double d3 = 0.0D;
    for (int j = paramInt1; j < paramInt2; j++)
    {
      double d5 = (paramArrayOfDouble[j] - d1) / d2;
      d3 += d5 * d5 * d5 * d5;
    }
    double d4 = paramInt2 - paramInt1;
    return new zabb(d4 * (d4 + 1.0D) / ((d4 - 1.0D) * (d4 - 2.0D) * (d4 - 3.0D)) * d3 - 3.0D * (d4 - 1.0D) * (d4 - 1.0D) / ((d4 - 2.0D) * (d4 - 3.0D)));
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      return paramInt2;
    }
    if (paramInt2 == 0) {
      return paramInt1;
    }
    int i;
    if (paramInt1 < paramInt2)
    {
      i = paramInt1;
      paramInt1 = paramInt2;
    }
    for (paramInt2 = i; paramInt2 != 0; paramInt2 = i)
    {
      i = paramInt1 % paramInt2;
      paramInt1 = paramInt2;
    }
    return paramInt1;
  }
  
  static double a(int paramInt)
  {
    double d = 1.0D;
    for (int i = paramInt; i > 1; i -= 2) {
      d *= i;
    }
    return d;
  }
  
  static double b(int paramInt)
  {
    double d = 1.0D;
    for (int i = 2; i <= paramInt; i++) {
      d *= i;
    }
    return d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */