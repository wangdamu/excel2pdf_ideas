package com.aspose.cells;

public class NegativeBarFormat
{
  private zaml a;
  private int b;
  private zaml c;
  private int d;
  private Workbook e;
  
  NegativeBarFormat(DataBar databar)
  {
    this.e = databar.c;
    zaml localzaml1 = new zaml(false);
    localzaml1.a(2, 0);
    this.a = localzaml1;
    this.b = 1;
    zaml localzaml2 = new zaml(false);
    localzaml2.a(2, 16711680);
    this.c = localzaml2;
    this.d = 1;
  }
  
  void a(NegativeBarFormat paramNegativeBarFormat)
  {
    this.e = paramNegativeBarFormat.e;
    this.a = paramNegativeBarFormat.a;
    this.b = paramNegativeBarFormat.b;
    this.c = paramNegativeBarFormat.c;
    this.d = paramNegativeBarFormat.d;
  }
  
  zaml a()
  {
    return this.a;
  }
  
  void a(zaml paramzaml)
  {
    this.a = paramzaml;
  }
  
  public Color getBorderColor()
  {
    return this.a.b(this.e);
  }
  
  public void setBorderColor(Color value)
  {
    this.a.a(2, value.toArgb());
  }
  
  public int getBorderColorType()
  {
    return this.b;
  }
  
  public void setBorderColorType(int value)
  {
    this.b = value;
  }
  
  zaml b()
  {
    return this.c;
  }
  
  void b(zaml paramzaml)
  {
    this.c = paramzaml;
  }
  
  public Color getColor()
  {
    return this.c.b(this.e);
  }
  
  public void setColor(Color value)
  {
    this.c.a(2, value.toArgb());
  }
  
  public int getColorType()
  {
    return this.d;
  }
  
  public void setColorType(int value)
  {
    this.d = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/NegativeBarFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */