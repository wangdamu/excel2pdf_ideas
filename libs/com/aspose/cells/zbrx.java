package com.aspose.cells;

class zbrx
  extends zbsb
{
  private int a = 0;
  private double b = 0.0D;
  
  public zbrx()
  {
    super(false, false, false);
  }
  
  public zaie a()
  {
    if (this.a < 1) {
      return zabc.g;
    }
    return new zabb(this.a / this.b);
  }
  
  protected boolean b()
  {
    return false;
  }
  
  protected zaie c()
  {
    return zabc.b;
  }
  
  protected zaie a(int paramInt)
  {
    return zabc.b;
  }
  
  protected zaie a(double paramDouble)
  {
    if (paramDouble <= 0.0D) {
      return zabc.b;
    }
    this.a += 1;
    this.b += 1.0D / paramDouble;
    return null;
  }
  
  protected zaie a(double paramDouble, int paramInt)
  {
    if (paramDouble <= 0.0D) {
      return zabc.b;
    }
    this.a += paramInt;
    this.b += paramInt / paramDouble;
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */