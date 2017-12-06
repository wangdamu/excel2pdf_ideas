package com.aspose.cells;

class zaqy
  extends zaqm
{
  private double[] b;
  private double[] c;
  private boolean d;
  
  protected boolean a(double paramDouble1, double paramDouble2)
  {
    return Math.abs(a(paramDouble1)) <= paramDouble2;
  }
  
  protected boolean b(double paramDouble1, double paramDouble2)
  {
    return paramDouble1 > -1.0D;
  }
  
  public double b(double paramDouble)
  {
    double d1 = 0.0D;
    paramDouble += 1.0D;
    int i = paramDouble >= 0.0D ? 1 : 0;
    for (int j = 1; j < this.c.length; j++)
    {
      double d2 = this.b[j];
      if (i != 0) {
        d1 += -d2 * this.c[j] * zga.c(paramDouble, -d2 - 1.0D);
      } else if ((int)d2 % 2 == 0) {
        d1 += -d2 * this.c[j] * zga.c(-paramDouble, -d2 - 1.0D);
      } else {
        d1 += d2 * this.c[j] * zga.c(-paramDouble, -d2 - 1.0D);
      }
    }
    return d1;
  }
  
  public double a(double paramDouble)
  {
    double d1 = this.c[0];
    paramDouble += 1.0D;
    int i = paramDouble >= 0.0D ? 1 : 0;
    for (int j = 1; j < this.c.length; j++)
    {
      double d2 = this.b[j];
      if (i != 0) {
        d1 += this.c[j] * zga.c(paramDouble, -d2);
      } else if ((int)d2 % 2 == 0) {
        d1 += this.c[j] * zga.c(-paramDouble, -d2);
      } else {
        d1 -= this.c[j] * zga.c(-paramDouble, -d2);
      }
    }
    return d1;
  }
  
  static zaie a(double[] paramArrayOfDouble, int[] paramArrayOfInt, double paramDouble)
  {
    double[] arrayOfDouble = new double[paramArrayOfInt.length];
    int i = 0;
    int j = paramArrayOfInt[0];
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d1;
    for (int k = 0; k < paramArrayOfDouble.length; k++)
    {
      d1 = paramArrayOfDouble[k];
      d2 += d1;
      if (d1 < 0.0D) {
        d3 -= d1;
      } else if ((i == 0) && (d1 > 0.0D)) {
        i = 1;
      }
      d1 = (paramArrayOfInt[k] - j) / 365.0D;
      if (d1 < 0.0D) {
        return zabc.b;
      }
      arrayOfDouble[k] = d1;
      if (d1 > d4) {
        d4 = d1;
      }
    }
    if ((i == 0) || (d3 <= 0.0D)) {
      return zabc.b;
    }
    paramArrayOfInt = null;
    if (Math.abs(d2) <= 1.0E-8D) {
      return zabb.a;
    }
    d2 = d2 / d3 / d4;
    if (Math.abs(d2) <= 1.0E-8D) {
      return zabb.a;
    }
    if (paramArrayOfDouble.length == 2)
    {
      if (arrayOfDouble[1] == 0.0D) {
        return zabc.b;
      }
      d1 = Math.pow(-paramArrayOfDouble[1] / paramArrayOfDouble[0], 1.0D / arrayOfDouble[1]);
      if (d1 < 1.0E-10D) {
        return zabc.b;
      }
      return zabt.a(d1 - 1.0D);
    }
    zaqy localzaqy = new zaqy();
    localzaqy.c = paramArrayOfDouble;
    localzaqy.b = arrayOfDouble;
    double d5;
    if (d2 < 0.0D)
    {
      localzaqy.d = true;
      d5 = 0.0D;
      d3 = -1.0D;
      if ((paramDouble < 0.0D) && (localzaqy.a(paramDouble, 1.0E-8D, 100)) && (localzaqy.a > -1.0D))
      {
        d1 = Math.abs(localzaqy.a(localzaqy.a));
        if (d1 < 1.0E-8D) {
          return zabt.a(localzaqy.a);
        }
        if ((d3 < 0.0D) || (d1 < d3))
        {
          d5 = localzaqy.a;
          d3 = d1;
        }
      }
      if ((localzaqy.a(d2, 1.0E-8D, 100)) && (localzaqy.a > -1.0D))
      {
        d1 = Math.abs(localzaqy.a(localzaqy.a));
        if (d1 < 1.0E-8D) {
          return zabt.a(localzaqy.a);
        }
        if ((d3 < 0.0D) || (d1 < d3))
        {
          d5 = localzaqy.a;
          d3 = d1;
        }
      }
      d4 = 0.1D;
      for (int m = 1; m < 10; m++)
      {
        d1 = -m * 0.1D;
        if ((d1 != d2) && (d1 != paramDouble) && (localzaqy.a(d1, 1.0E-8D, 100)) && (localzaqy.a > -1.0D))
        {
          d1 = Math.abs(localzaqy.a(localzaqy.a));
          if (d1 < 1.0E-8D) {
            return zabt.a(localzaqy.a);
          }
          if ((d3 < 0.0D) || (d1 < d3))
          {
            d5 = localzaqy.a;
            d3 = d1;
          }
        }
        d4 *= 0.1D;
        d1 = -1.0D + d4;
        if ((d1 != d2) && (d1 != paramDouble) && (localzaqy.a(d1, 1.0E-8D, 100)) && (localzaqy.a > -1.0D))
        {
          d1 = Math.abs(localzaqy.a(localzaqy.a));
          if (d1 < 1.0E-8D) {
            return zabt.a(localzaqy.a);
          }
          if ((d3 < 0.0D) || (d1 < d3))
          {
            d5 = localzaqy.a;
            d3 = d1;
          }
        }
        if (d3 > 0.0D) {
          return zabt.a(d5);
        }
      }
    }
    else
    {
      localzaqy.d = false;
      d5 = 0.0D;
      d3 = -1.0D;
      if ((paramDouble >= 0.0D) && (localzaqy.a(paramDouble, 1.0E-8D, 100)))
      {
        d1 = Math.abs(localzaqy.a(localzaqy.a));
        if (d1 < 1.0E-8D) {
          return zabt.a(localzaqy.a);
        }
        if ((d3 < 0.0D) || (d1 < d3))
        {
          d5 = localzaqy.a;
          d3 = d1;
        }
      }
      if (localzaqy.a(d2, 1.0E-8D, 100))
      {
        d1 = Math.abs(localzaqy.a(localzaqy.a));
        if (d1 < 1.0E-8D) {
          return zabt.a(localzaqy.a);
        }
        if ((d3 < 0.0D) || (d1 < d3))
        {
          d5 = localzaqy.a;
          d3 = d1;
        }
      }
      d4 = d2 / 5.0D;
      d1 = 0.0D;
      double d6 = d2;
      for (int n = 1; n < 5; n++)
      {
        d1 += d4;
        if (localzaqy.a(d2 + d1, 1.0E-8D, 100))
        {
          d1 = Math.abs(localzaqy.a(localzaqy.a));
          if (d1 < 1.0E-8D) {
            return zabt.a(localzaqy.a);
          }
          if ((d3 < 0.0D) || (d1 < d3))
          {
            d5 = localzaqy.a;
            d3 = d1;
          }
        }
        if (localzaqy.a(d2 - d1, 1.0E-8D, 100))
        {
          d1 = Math.abs(localzaqy.a(localzaqy.a));
          if (d1 < 1.0E-8D) {
            return zabt.a(localzaqy.a);
          }
          if ((d3 < 0.0D) || (d1 < d3))
          {
            d5 = localzaqy.a;
            d3 = d1;
          }
        }
        d6 += d2;
        if (localzaqy.a(d6, 1.0E-8D, 100))
        {
          d1 = Math.abs(localzaqy.a(localzaqy.a));
          if (d1 < 1.0E-8D) {
            return zabt.a(localzaqy.a);
          }
          if ((d3 < 0.0D) || (d1 < d3))
          {
            d5 = localzaqy.a;
            d3 = d1;
          }
        }
      }
      if (d3 > 0.0D) {
        return zabt.a(d5);
      }
    }
    return zabc.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */