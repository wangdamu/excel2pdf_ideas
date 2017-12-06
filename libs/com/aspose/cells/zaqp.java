package com.aspose.cells;

class zaqp
  extends zaqn
{
  private double b;
  private double c;
  private double d;
  
  public zaqp(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    this.b = paramDouble1;
    this.c = paramDouble2;
    this.d = paramDouble3;
  }
  
  protected void a(double paramDouble, double[] paramArrayOfDouble)
  {
    paramArrayOfDouble[0] = (zwx.b(paramDouble, this.b, this.c) - this.d);
    paramArrayOfDouble[1] = (-zwx.a(paramDouble, this.b, this.c));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */