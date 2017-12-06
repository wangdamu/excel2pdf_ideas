package com.aspose.cells;

abstract class zamk
{
  public abstract double a(double paramDouble);
  
  public double a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d6 = 0.0D;
    double[] arrayOfDouble = new double[14];
    double d1 = paramDouble2 - paramDouble1;
    arrayOfDouble[0] = (d1 * (a(paramDouble1) + a(paramDouble2)) / 2.0D);
    int i = 1;
    int j = 1;
    double d2 = paramDouble3 + 1.0D;
    while ((d2 >= paramDouble3) && (i <= 13))
    {
      double d3 = 0.0D;
      for (int k = 0; k <= j - 1; k++)
      {
        double d4 = paramDouble1 + (k + 0.5D) * d1;
        d3 += a(d4);
      }
      d3 = (arrayOfDouble[0] + d1 * d3) / 2.0D;
      double d5 = 1.0D;
      for (int m = 1; m <= i; m++)
      {
        d5 = 4.0D * d5;
        d6 = (d5 * d3 - arrayOfDouble[(m - 1)]) / (d5 - 1.0D);
        arrayOfDouble[(m - 1)] = d3;
        d3 = d6;
      }
      d2 = Math.abs(d6 - arrayOfDouble[(i - 1)]);
      i += 1;
      arrayOfDouble[(i - 1)] = d6;
      j += j;
      d1 /= 2.0D;
    }
    return d6;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */