package com.aspose.cells;

public class RadioButtonActiveXControl
  extends ToggleButtonActiveXControl
{
  RadioButtonActiveXControl(Shape shape)
  {
    super(shape);
  }
  
  private zapr c()
  {
    return (zapr)this.e;
  }
  
  public int getType()
  {
    return 6;
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = -2134900416;
      b(41);
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      c().t = 5;
      c().G = "0";
      c().n = this.b.A();
      c().H = this.b.Q().getName();
      this.c = zaj.g;
    }
  }
  
  public String getGroupName()
  {
    return c().H;
  }
  
  public void setGroupName(String value)
  {
    c().H = value;
    b(41);
  }
  
  public int getAlignment()
  {
    return this.e.a(13) ? 0 : 1;
  }
  
  public void setAlignment(int value)
  {
    this.e.a(13, value == 0);
    b(14);
  }
  
  public boolean isWordWrapped()
  {
    return this.e.a(23);
  }
  
  public void setWordWrapped(boolean value)
  {
    this.e.a(23, value);
    b(14);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/RadioButtonActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */