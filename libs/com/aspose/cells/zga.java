package com.aspose.cells;

import com.aspose.cells.b.a.zr;

abstract class zga
{
  static double[] a = { 1.0D, 0.1D, 0.01D, 0.001D, 1.0E-4D, 1.0E-5D, 1.0E-6D, 1.0E-7D, 1.0E-8D, 1.0E-9D, 1.0E-10D, 1.0E-11D, 1.0E-12D, 1.0E-13D, 1.0E-14D, 1.0E-15D, 1.0E-16D, 1.0E-17D, 1.0E-18D, 1.0E-19D, 1.0E-20D, 1.0E-21D, 1.0E-22D, 1.0E-23D, 1.0E-24D, 1.0E-25D, 1.0E-26D, 1.0E-27D, 1.0E-28D, 1.0E-29D, 1.0E-30D };
  
  static boolean a(double paramDouble1, double paramDouble2)
  {
    if (paramDouble1 == paramDouble2) {
      return true;
    }
    double d = Math.abs(paramDouble1 - paramDouble2);
    if (d < Double.MIN_VALUE) {
      return true;
    }
    if (d < 1.0E-4D)
    {
      paramDouble1 = Math.abs(paramDouble1);
      if (paramDouble1 < Double.MIN_VALUE) {
        paramDouble1 = Math.abs(paramDouble2);
      }
      int i = 14 - (int)Math.log10(paramDouble1);
      if (i < 0) {
        return true;
      }
      if (i >= a.length) {
        return d < Math.pow(10.0D, -i);
      }
      return d < a[i];
    }
    return false;
  }
  
  static boolean a(double paramDouble)
  {
    double d = Math.abs(paramDouble);
    if (d < Double.MIN_VALUE) {
      return true;
    }
    if (d < 1.0E-4D)
    {
      int i = (int)Math.log10(d);
      int j = 14 - i;
      if (j >= 0)
      {
        if (j >= a.length) {
          return d < Math.pow(10.0D, -j);
        }
        return d < a[j];
      }
    }
    return false;
  }
  
  static double b(double paramDouble1, double paramDouble2)
  {
    double d1 = paramDouble1 + paramDouble2;
    double d2 = Math.abs(d1);
    if (d2 < Double.MIN_VALUE) {
      return 0.0D;
    }
    if (d2 < 1.0E-4D)
    {
      int i = (int)Math.log10(Math.abs(paramDouble1));
      int j = 14 - i;
      if (j >= 0) {
        if (j >= a.length)
        {
          if (d2 < Math.pow(10.0D, -j)) {
            return 0.0D;
          }
        }
        else if (d2 < a[j]) {
          return 0.0D;
        }
      }
    }
    return d1;
  }
  
  static double c(double paramDouble1, double paramDouble2)
  {
    if (paramDouble2 < 0.0D) {
      return 1.0D / c(paramDouble1, -paramDouble2);
    }
    int i = (int)paramDouble2;
    if (paramDouble2 != i) {
      return Math.pow(paramDouble1, paramDouble2);
    }
    return a(paramDouble1, i);
  }
  
  static double a(double paramDouble, int paramInt)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    if (paramInt == 0) {
      return 1.0D;
    }
    double d = 1.0D;
    while (paramInt != 0)
    {
      int i = paramInt % 2;
      int j = paramInt / 2;
      if (i != 0) {
        d *= paramDouble;
      }
      paramDouble *= paramDouble;
      paramInt = j;
    }
    return d;
  }
  
  static double b(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    return c(paramDouble);
  }
  
  static double c(double paramDouble)
  {
    double d = Math.pow(10.0D, 14 - (int)Math.log10(Math.abs(paramDouble)));
    return zr.a(paramDouble * d) / d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */