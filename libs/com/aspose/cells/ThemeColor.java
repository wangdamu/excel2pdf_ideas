package com.aspose.cells;

public class ThemeColor
{
  private int a;
  private double b;
  
  public ThemeColor(int type, double tint)
  {
    this.a = type;
    this.b = tint;
  }
  
  public int getColorType()
  {
    return this.a;
  }
  
  public void setColorType(int value)
  {
    this.a = value;
  }
  
  public double getTint()
  {
    return this.b;
  }
  
  public void setTint(double value)
  {
    this.b = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ThemeColor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */