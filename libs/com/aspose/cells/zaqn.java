package com.aspose.cells;

abstract class zaqn
{
  protected double a;
  
  public double a()
  {
    return this.a;
  }
  
  protected double a(double paramDouble)
  {
    return 0.0D;
  }
  
  protected void a(double paramDouble, double[] paramArrayOfDouble) {}
  
  public boolean a(double paramDouble1, int paramInt, double paramDouble2)
  {
    double d4 = 0.0D;
    double[] arrayOfDouble = new double[2];
    int i = paramInt;
    double d3 = paramDouble1;
    a(d3, arrayOfDouble);
    double d1 = paramDouble2 + 1.0D;
    while ((d1 >= paramDouble2) && (i != 0))
    {
      if (arrayOfDouble[1] == 0.0D) {
        arrayOfDouble[1] = Math.abs(-1.7976931348623157E308D);
      }
      d4 = d3 - arrayOfDouble[0] / arrayOfDouble[1];
      if (d4 <= 0.0D) {
        d4 = Math.abs(0.1D);
      }
      a(d4, arrayOfDouble);
      d1 = Math.abs(d4 - d3);
      double d2 = Math.abs(arrayOfDouble[0]);
      if (d2 > d1) {
        d1 = d2;
      }
      d3 = d4;
      i -= 1;
    }
    this.a = d4;
    return true;
  }
  
  public boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    double d1 = paramDouble4 - paramDouble3;
    double d2 = 1.0E-11D;
    int i = 300;
    for (int j = 0; (a(paramDouble3) > paramDouble2) && (a(paramDouble4) > paramDouble2) && (j < i); j++)
    {
      paramDouble3 = paramDouble4;
      paramDouble4 += d1;
    }
    while ((a(paramDouble3) < paramDouble2) && (a(paramDouble4) < paramDouble2) && (j < i))
    {
      paramDouble4 = paramDouble3;
      paramDouble3 -= d1;
      j++;
      if (paramDouble3 < 0.0D) {
        paramDouble3 = 0.0D;
      }
    }
    while ((Math.abs(paramDouble3 - paramDouble4) > d1 * d2) && (j < i))
    {
      paramDouble1 = (paramDouble3 + paramDouble4) / 2.0D;
      if (a(paramDouble1) > paramDouble2) {
        paramDouble3 = paramDouble1;
      } else {
        paramDouble4 = paramDouble1;
      }
      j++;
    }
    this.a = paramDouble1;
    return j != i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */