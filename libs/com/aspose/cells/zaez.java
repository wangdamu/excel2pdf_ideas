package com.aspose.cells;

class zaez
{
  static zaez a = new zaez();
  private double b;
  private double c;
  private double d;
  
  zaez()
  {
    this.b = 0.0D;
    this.c = 0.0D;
    this.d = 0.0D;
  }
  
  zaez(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    this.b = (paramDouble1 < 0.0D ? 0.0D : paramDouble1 > 360.0D ? 360.0D : paramDouble1);
    this.c = (paramDouble2 < 0.0D ? 0.0D : paramDouble2 > 1.0D ? 1.0D : paramDouble2);
    this.d = (paramDouble3 < 0.0D ? 0.0D : paramDouble3 > 1.0D ? 1.0D : paramDouble3);
  }
  
  double a()
  {
    return this.b;
  }
  
  void a(double paramDouble)
  {
    this.b = (paramDouble < 0.0D ? 0.0D : paramDouble > 360.0D ? 360.0D : paramDouble);
  }
  
  double b()
  {
    return this.c;
  }
  
  void b(double paramDouble)
  {
    this.c = (paramDouble < 0.0D ? 0.0D : paramDouble > 1.0D ? 1.0D : paramDouble);
  }
  
  double c()
  {
    return this.d;
  }
  
  void c(double paramDouble)
  {
    this.d = (paramDouble < 0.0D ? 0.0D : paramDouble > 1.0D ? 1.0D : paramDouble);
  }
  
  public int hashCode()
  {
    return new Double(a()).hashCode() ^ new Double(b()).hashCode() ^ new Double(c()).hashCode();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */