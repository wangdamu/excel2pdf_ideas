package com.aspose.cells;

public class TextTabStop
{
  int a;
  int b;
  
  TextTabStop(int tabAlignment, int tabPosition)
  {
    this.a = tabAlignment;
    this.b = tabPosition;
  }
  
  public int getTabAlignment()
  {
    return this.a;
  }
  
  public void setTabAlignment(int value)
  {
    this.a = value;
  }
  
  public double getTabPosition()
  {
    return zbxp.c(this.b);
  }
  
  public void setTabPosition(double value)
  {
    this.b = zbxp.f(value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TextTabStop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */