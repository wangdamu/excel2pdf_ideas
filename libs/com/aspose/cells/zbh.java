package com.aspose.cells;

class zbh
{
  static long a = Math.pow(2.0D, 48.0D) - 1L;
  static double[] b = { 1.0D, 0.1D, 0.01D, 0.001D, 1.0E-4D, 1.0E-5D, 1.0E-6D, 1.0E-7D, 1.0E-8D, 1.0E-9D, 1.0E-10D, 1.0E-11D, 1.0E-12D, 1.0E-13D, 1.0E-14D, 1.0E-15D, 1.0E-16D, 1.0E-17D, 1.0E-18D, 1.0E-19D, 1.0E-20D, 1.0E-21D, 1.0E-22D, 1.0E-23D, 1.0E-24D, 1.0E-25D, 1.0E-26D, 1.0E-27D, 1.0E-28D, 1.0E-29D, 1.0E-30D };
  
  static boolean a(double paramDouble1, double paramDouble2)
  {
    double d = Math.abs(paramDouble1 - paramDouble2);
    if (d < Double.MIN_VALUE) {
      return true;
    }
    if (d < 1.0E-4D)
    {
      int i = (int)Math.log10(Math.abs(paramDouble1));
      int j = 14 - i;
      if (j >= 0)
      {
        if (j >= b.length) {
          return d < Math.pow(10.0D, -j);
        }
        return d < b[j];
      }
    }
    return paramDouble1 == paramDouble2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */