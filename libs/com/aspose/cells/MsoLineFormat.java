package com.aspose.cells;

public class MsoLineFormat
{
  private LineFormat a;
  
  MsoLineFormat(LineFormat outline)
  {
    this.a = outline;
  }
  
  public boolean isVisible()
  {
    return this.a.getFillType() != 1;
  }
  
  public void setVisible(boolean value)
  {
    if (value)
    {
      if (this.a.getFillType() == 1) {
        this.a.setFillType(2);
      }
    }
    else {
      this.a.setFillType(1);
    }
  }
  
  public int getStyle()
  {
    return this.a.getCompoundType();
  }
  
  public void setStyle(int value)
  {
    this.a.setCompoundType(value);
  }
  
  public Color getForeColor()
  {
    return this.a.b();
  }
  
  public void setForeColor(Color value)
  {
    this.a.a(value);
  }
  
  public Color getBackColor()
  {
    return this.a.c();
  }
  
  public void setBackColor(Color value)
  {
    this.a.b(value);
  }
  
  public int getDashStyle()
  {
    return this.a.getDashStyle();
  }
  
  public void setDashStyle(int value)
  {
    this.a.setDashStyle(value);
  }
  
  public double getTransparency()
  {
    return 1.0D - a();
  }
  
  public void setTransparency(double value)
  {
    a(1.0D - value);
  }
  
  double a()
  {
    return this.a.d();
  }
  
  void a(double paramDouble)
  {
    this.a.a(paramDouble);
  }
  
  public double getWeight()
  {
    return this.a.getWeight();
  }
  
  public void setWeight(double value)
  {
    this.a.setWeight(value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/MsoLineFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */