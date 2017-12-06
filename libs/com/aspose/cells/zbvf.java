package com.aspose.cells;

class zbvf
{
  static double a(double paramDouble1, double paramDouble2)
  {
    double d1 = zacz.b((paramDouble2 + 1.0D) / 2.0D) / Math.sqrt(paramDouble2 * 3.141592653589793D) / zacz.b(paramDouble2 / 2.0D);
    double d2 = Math.pow(1.0D + paramDouble1 * paramDouble1 / paramDouble2, -(paramDouble2 + 1.0D) / 2.0D);
    return d1 * d2;
  }
  
  public static double a(double paramDouble1, double paramDouble2, int paramInt)
  {
    if ((paramDouble2 < 1.0D) || (paramInt > 2) || (paramInt < 1) || (paramDouble1 < 0.0D)) {
      return NaN.0D;
    }
    try
    {
      zamj localzamj = new zamj(paramDouble2);
      if (paramDouble1 < 5.0D)
      {
        d = localzamj.a(0.0D, paramDouble1, 1.0E-20D);
        d = 0.5D - d;
        return d * paramInt;
      }
      double d = localzamj.a(0.0D, 5.0D, 1.0E-20D) + localzamj.a(5.0D, paramDouble1, 1.0E-20D);
      d = 0.5D - d;
      return d * paramInt;
    }
    catch (Exception localException) {}
    return NaN.0D;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */