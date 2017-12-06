package com.aspose.cells;

import com.aspose.cells.b.a.zo;

public class ShapeGuide
{
  private String b;
  private String c;
  int a;
  
  private ShapeGuide() {}
  
  ShapeGuide(String name, String formula)
  {
    this.b = name;
    this.c = formula;
  }
  
  String a()
  {
    return this.b;
  }
  
  String b()
  {
    return this.c;
  }
  
  public double getValue()
  {
    if ((this.c != null) && (this.c.startsWith("val")))
    {
      String str = this.c.substring(4).trim();
      if (zarb.c(str)) {
        return zo.a(str) / 100000.0D;
      }
    }
    return 0.0D;
  }
  
  public void setValue(double value)
  {
    int i = (int)(value * 100000.0D);
    if ((this.c != null) && (this.c.startsWith("val"))) {
      this.c = ("val " + i);
    }
  }
  
  int c()
  {
    return this.a;
  }
  
  void a(int paramInt)
  {
    this.a = paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapeGuide.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */