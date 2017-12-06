package com.aspose.cells;

class zaqw
  extends zaqm
{
  private DateTime b;
  private DateTime c;
  private DateTime d;
  private DateTime e;
  private double f;
  private int g;
  private int h;
  private int i;
  private double j;
  private double k;
  
  public zaqw(DateTime paramDateTime1, DateTime paramDateTime2, DateTime paramDateTime3, DateTime paramDateTime4, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, double paramDouble3)
  {
    this.b = paramDateTime1;
    this.c = paramDateTime2;
    this.d = paramDateTime3;
    this.e = paramDateTime4;
    this.f = paramDouble1;
    this.j = paramDouble2;
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramInt3;
    this.k = paramDouble3;
  }
  
  protected boolean a(double paramDouble1, double paramDouble2)
  {
    return Math.abs(a(paramDouble1)) < paramDouble2;
  }
  
  protected boolean b(double paramDouble1, double paramDouble2)
  {
    return true;
  }
  
  public double b(double paramDouble)
  {
    return (a(paramDouble + this.k) - a(paramDouble - this.k)) / (2.0D * this.k);
  }
  
  public double a(double paramDouble)
  {
    return this.j - zfu.a(this.b, this.c, this.d, this.e, this.f, paramDouble, this.g, this.h, this.i);
  }
  
  zaie c(double paramDouble)
  {
    if (a(paramDouble, 1.0E-5D, 20)) {
      return new zabb(this.a);
    }
    return zabc.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */