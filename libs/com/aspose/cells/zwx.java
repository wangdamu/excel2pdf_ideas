package com.aspose.cells;

abstract class zwx
{
  public static double a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (paramDouble1 <= 0.0D) {
      return 0.0D;
    }
    double d = Math.pow(paramDouble2 * paramDouble1, paramDouble2) * Math.pow(paramDouble3, paramDouble3) / Math.pow(paramDouble2 * paramDouble1 + paramDouble3, paramDouble2 + paramDouble3);
    return Math.sqrt(d) / paramDouble1 / zcq.a(paramDouble2 / 2.0D, paramDouble3 / 2.0D);
  }
  
  public static double b(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble2 < 1.0D) || (paramDouble3 < 1.0D) || (paramDouble2 >= 1.0E10D) || (paramDouble3 >= 1.0E10D)) {
      return 0.0D;
    }
    if (paramDouble1 == 0.0D) {
      return 1.0D;
    }
    try
    {
      return zcq.e(paramDouble3 / (paramDouble3 + paramDouble2 * paramDouble1), paramDouble3 / 2.0D, paramDouble2 / 2.0D);
    }
    catch (Exception localException) {}
    return 0.0D;
  }
  
  public static double a(double paramDouble1, double paramDouble2, double paramDouble3, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = true;
    if ((paramDouble1 < 0.0D) || (paramDouble1 > 1.0D) || (paramDouble2 < 1.0D) || (paramDouble3 < 1.0D) || (paramDouble2 >= 1.0E10D) || (paramDouble3 >= 1.0E10D)) {
      return NaN.0D;
    }
    if (paramDouble1 == 0.0D)
    {
      paramArrayOfBoolean[0] = false;
      return 1.0E9D;
    }
    if (paramDouble1 == 1.0D)
    {
      paramArrayOfBoolean[0] = false;
      return 0.0D;
    }
    try
    {
      zaqp localzaqp = new zaqp(paramDouble2, paramDouble3, paramDouble1);
      if (paramDouble1 < 1.0E-5D)
      {
        if (localzaqp.a(2000.0D, 100, 1.0E-10D))
        {
          paramArrayOfBoolean[0] = false;
          return localzaqp.a();
        }
        return NaN.0D;
      }
      if (localzaqp.a(1.0D, 100, 1.0E-10D))
      {
        paramArrayOfBoolean[0] = false;
        return localzaqp.a();
      }
      return NaN.0D;
    }
    catch (Exception localException) {}
    return 0.0D;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */