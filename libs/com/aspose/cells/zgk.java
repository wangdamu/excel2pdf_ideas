package com.aspose.cells;

class zgk
  extends zgj
{
  private double b;
  
  public zgk(double paramDouble)
  {
    this.b = paramDouble;
  }
  
  protected boolean a(double paramDouble1, double paramDouble2)
  {
    return Math.abs(paramDouble1 - paramDouble2) > this.b;
  }
  
  protected boolean a(double paramDouble)
  {
    return Math.abs(paramDouble) > this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */