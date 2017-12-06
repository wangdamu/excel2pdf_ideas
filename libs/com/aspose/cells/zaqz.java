package com.aspose.cells;

class zaqz
  extends zaqm
{
  private DateTime b;
  private DateTime c;
  private double d;
  private int e;
  private int f;
  private int g;
  private double h;
  private double i;
  
  public zaqz(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, double paramDouble3)
  {
    this.b = paramDateTime1;
    this.c = paramDateTime2;
    this.d = paramDouble1;
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramDouble2;
    this.i = paramDouble3;
  }
  
  protected boolean a(double paramDouble1, double paramDouble2)
  {
    return Math.abs(a(paramDouble1)) < paramDouble2;
  }
  
  protected boolean b(double paramDouble1, double paramDouble2)
  {
    return Math.abs(a(paramDouble1)) < paramDouble2;
  }
  
  public double b(double paramDouble)
  {
    return (a(paramDouble + this.i) - a(paramDouble - this.i)) / (2.0D * this.i);
  }
  
  public double a(double paramDouble)
  {
    return zfu.a(this.b, this.c, this.d, paramDouble, this.e, this.f, this.g) - this.h;
  }
  
  static zaie a(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, double paramDouble3, double paramDouble4)
  {
    zaqz localzaqz = new zaqz(paramDateTime1, paramDateTime2, paramDouble1, paramDouble2, paramInt1, paramInt2, paramInt3, paramDouble3);
    if (localzaqz.a(paramDouble4, 1.0E-7D, 20)) {
      return new zabb(localzaqz.a);
    }
    return zabc.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */