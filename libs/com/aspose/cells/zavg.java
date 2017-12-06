package com.aspose.cells;

class zavg
  implements zait
{
  private int a;
  private zaca b;
  private zaie c;
  private double d = 0.0D;
  private double e = 0.0D;
  private double f = 0.0D;
  private double g = 0.0D;
  private int h = 0;
  
  zavg(int paramInt, zaca paramzaca, zaie paramzaie)
  {
    this.a = paramInt;
    this.b = paramzaca;
    this.c = paramzaie;
  }
  
  public zaie a(double paramDouble1, double paramDouble2)
  {
    this.h += 1;
    this.e += paramDouble1;
    this.d += paramDouble2;
    this.f += paramDouble1 * paramDouble2;
    this.g += paramDouble2 * paramDouble2;
    return null;
  }
  
  public zaie a(double paramDouble1, double paramDouble2, int paramInt)
  {
    this.h += paramInt;
    paramDouble1 *= paramInt;
    this.e += paramDouble1;
    this.f += paramDouble1 * paramDouble2;
    paramDouble2 *= paramInt;
    this.d += paramDouble2;
    this.g += paramDouble2 * paramDouble2;
    return null;
  }
  
  public zaie a()
  {
    double d1 = this.g * this.h - this.d * this.d;
    if (d1 == 0.0D) {
      return zabc.a;
    }
    double d2 = (this.f * this.h - this.d * this.e) / d1;
    double d3;
    switch (this.a)
    {
    case 311: 
      d3 = this.e / this.h - d2 * this.d / this.h;
      return zabt.b(d3);
    case 315: 
      d3 = d2;
      return zabt.b(d3);
    case 309: 
      d3 = this.e / this.h - d2 * this.d / this.h;
      double d4 = d2;
      double[] arrayOfDouble = new double[1];
      zabc localzabc = zabt.a(new zaie[] { this.c }, this.b, 0, arrayOfDouble, 7);
      if (localzabc != null) {
        return localzabc;
      }
      return zabt.b(d3 + d4 * arrayOfDouble[0]);
    }
    throw new CellsException(7, "Invalid function in FORECAST algorithm.");
  }
  
  public zaie b()
  {
    return zabc.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */