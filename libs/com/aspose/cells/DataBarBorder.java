package com.aspose.cells;

public class DataBarBorder
{
  private zaml a = new zaml(false);
  private int b;
  private Workbook c;
  
  DataBarBorder(DataBar databar)
  {
    this.c = databar.c;
  }
  
  void a(DataBarBorder paramDataBarBorder)
  {
    this.c = paramDataBarBorder.c;
    this.a = paramDataBarBorder.a;
    this.b = paramDataBarBorder.b;
  }
  
  zaml a()
  {
    return this.a;
  }
  
  void a(zaml paramzaml)
  {
    this.a = paramzaml;
  }
  
  public Color getColor()
  {
    return this.a.b(this.c);
  }
  
  public void setColor(Color value)
  {
    this.a.a(2, value.toArgb());
  }
  
  public int getType()
  {
    return this.b;
  }
  
  public void setType(int value)
  {
    this.b = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DataBarBorder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */