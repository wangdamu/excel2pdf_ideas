package com.aspose.cells;

class zaqv
  extends zaqm
{
  private double[] b;
  private int c;
  private int d;
  
  public zaqv(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    this.b = paramArrayOfDouble;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  protected boolean a(double paramDouble1, double paramDouble2)
  {
    return (paramDouble1 > 0.0D) && (Math.abs(a(paramDouble1)) < paramDouble2);
  }
  
  protected boolean b(double paramDouble1, double paramDouble2)
  {
    return (paramDouble1 > 0.0D) && (Math.abs(a(paramDouble1)) < paramDouble2);
  }
  
  public double b(double paramDouble)
  {
    double d1 = 0.0D;
    double d2 = paramDouble * paramDouble;
    for (int i = this.c + 1; i < this.d; i++)
    {
      d1 -= (i - this.c) * this.b[i] / d2;
      d2 *= paramDouble;
    }
    return d1;
  }
  
  public double a(double paramDouble)
  {
    double d1 = this.b[this.c];
    double d2 = paramDouble;
    for (int i = this.c + 1; i < this.d; i++)
    {
      d1 += this.b[i] / d2;
      d2 *= paramDouble;
    }
    return d1;
  }
  
  static zaie a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, double paramDouble)
  {
    int i = 0;
    double d2 = 0.0D;
    double d3 = 0.0D;
    for (int j = paramInt1; j < paramInt2; j++)
    {
      d1 = paramArrayOfDouble[j];
      d2 += d1;
      if (d1 < 0.0D) {
        d3 -= d1;
      } else if ((i == 0) && (d1 > 0.0D)) {
        i = 1;
      }
    }
    if ((i == 0) || (d3 <= 0.0D)) {
      return zabc.b;
    }
    if (Math.abs(d2) <= 1.0E-7D) {
      return zabb.a;
    }
    zaqv localzaqv = new zaqv(paramArrayOfDouble, paramInt1, paramInt2);
    if (localzaqv.a(paramDouble + 1.0D, 1.0E-7D, 20)) {
      return new zabb(localzaqv.a - 1.0D);
    }
    d2 = d2 / d3 / (paramInt2 - paramInt1 - 1);
    if (localzaqv.a(d2 + 1.0D, 1.0E-7D, 20)) {
      return new zabb(localzaqv.a - 1.0D);
    }
    if (d2 < 0.0D)
    {
      if (paramDouble > 0.0D)
      {
        paramDouble = d2;
        if (paramDouble < -0.1D) {
          d2 = -0.1D - paramDouble / 10.0D;
        }
      }
      else if (paramDouble < -0.1D)
      {
        d2 = -0.1D - paramDouble / 10.0D;
      }
      else
      {
        d2 = paramDouble;
      }
    }
    else if (paramDouble < 0.0D) {
      paramDouble = d2;
    } else {
      d2 = paramDouble;
    }
    double d1 = paramDouble;
    for (int k = 0; k < 10; k++)
    {
      d1 /= 2.0D;
      if (localzaqv.a(d1 + 1.0D, 1.0E-7D, 20)) {
        return new zabb(localzaqv.a - 1.0D);
      }
    }
    for (k = 0; k < 10; k++)
    {
      d1 += d2;
      if (localzaqv.a(d1 + 1.0D, 1.0E-7D, 20)) {
        return new zabb(localzaqv.a - 1.0D);
      }
    }
    return zabc.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */