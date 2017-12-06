package com.aspose.cells;

class zaqx
  extends zaqm
{
  private double b;
  private double c;
  private double d;
  private double e;
  private double f;
  
  public double b(double paramDouble)
  {
    double d1 = Math.pow(1.0D + paramDouble, this.b - 1.0D);
    double d2 = this.d / (paramDouble * paramDouble);
    double d3 = this.b * this.c + this.b * this.d * (this.f + 1.0D / paramDouble) - this.d / paramDouble - d2;
    return d3 * d1 + d2;
  }
  
  protected boolean a(double paramDouble1, double paramDouble2)
  {
    return false;
  }
  
  protected boolean b(double paramDouble1, double paramDouble2)
  {
    return true;
  }
  
  public double a(double paramDouble)
  {
    double d1 = Math.pow(1.0D + paramDouble, this.b);
    return this.c * d1 + this.d * (1.0D + paramDouble * this.f) * (d1 - 1.0D) / paramDouble + this.e;
  }
  
  static zaie a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    zaqx localzaqx = new zaqx();
    localzaqx.b = paramDouble1;
    localzaqx.d = paramDouble2;
    localzaqx.c = paramDouble3;
    localzaqx.e = paramDouble4;
    localzaqx.f = paramDouble5;
    if (localzaqx.a(paramDouble6, 1.0E-7D, 20)) {
      return new zabb(localzaqx.a);
    }
    return zabc.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */