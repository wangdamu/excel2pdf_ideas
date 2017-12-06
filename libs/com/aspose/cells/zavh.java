package com.aspose.cells;

class zavh
  implements zait
{
  private double a = 0.0D;
  private double b = 0.0D;
  private double c = 0.0D;
  private double d = 0.0D;
  private double e = 0.0D;
  private int f = 0;
  
  public zaie a(double paramDouble1, double paramDouble2)
  {
    this.f += 1;
    this.a += paramDouble1;
    this.b += paramDouble2;
    this.c += paramDouble1 * paramDouble2;
    this.d += paramDouble1 * paramDouble1;
    this.e += paramDouble2 * paramDouble2;
    return null;
  }
  
  public zaie a(double paramDouble1, double paramDouble2, int paramInt)
  {
    this.f += paramInt;
    double d1 = paramDouble1 * paramInt;
    this.a += d1;
    this.c += d1 * paramDouble2;
    this.d += d1 * paramDouble1;
    d1 = paramDouble2 * paramInt;
    this.b += d1;
    this.e += d1 * paramDouble2;
    return null;
  }
  
  public zaie a()
  {
    double d1 = (this.f * this.d - this.a * this.a) * (this.f * this.e - this.b * this.b);
    if (d1 == 0.0D) {
      return zabc.a;
    }
    return new zabb((this.f * this.c - this.a * this.b) / Math.sqrt(d1));
  }
  
  public zaie b()
  {
    return zabc.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */