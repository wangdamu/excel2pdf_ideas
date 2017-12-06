package com.aspose.cells.b.a;

public class zr
{
  private static final double[] a = { 1.0D, 10.0D, 100.0D, 1000.0D, 10000.0D, 100000.0D, 1000000.0D, 1.0E7D, 1.0E8D, 1.0E9D, 1.0E10D, 1.0E11D, 1.0E12D, 1.0E13D, 1.0E14D, 1.0E15D };
  
  public static double a(double paramDouble, int paramInt1, int paramInt2)
  {
    return b(paramDouble, paramInt1);
  }
  
  public static double a(double paramDouble, int paramInt)
  {
    return b(paramDouble, 8);
  }
  
  public static double a(double paramDouble1, double paramDouble2)
  {
    if (paramDouble2 == 1.0D) {
      return NaN.0D;
    }
    if ((paramDouble1 != 1.0D) && ((paramDouble2 == 0.0D) || (paramDouble2 == Double.POSITIVE_INFINITY))) {
      return NaN.0D;
    }
    return Math.log(paramDouble1) / Math.log(paramDouble2);
  }
  
  public static long a(double paramDouble)
  {
    if (paramDouble == paramDouble) {
      return paramDouble;
    }
    if (paramDouble > 0.0D) {
      return (paramDouble + 0.5D);
    }
    return (paramDouble - 0.5D);
  }
  
  public static double b(double paramDouble, int paramInt)
  {
    int i = zo.a(paramDouble);
    if (i >= 15) {
      return paramDouble;
    }
    paramInt = Math.min(15 - i, paramInt);
    double d = a[paramInt];
    paramDouble *= d;
    paramDouble = b(paramDouble);
    paramDouble = a(paramDouble);
    paramDouble /= d;
    return paramDouble;
  }
  
  public static double b(double paramDouble)
  {
    int i = zo.a(paramDouble);
    if (i >= 15) {
      return paramDouble;
    }
    int j = 13;
    j = Math.min(15 - i, j);
    double d = a[j];
    paramDouble *= d;
    paramDouble = a(paramDouble);
    paramDouble /= d;
    return paramDouble;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */