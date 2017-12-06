package com.aspose.cells;

public class Bevel
{
  int a;
  int b;
  int c = 0;
  
  public double getWidth()
  {
    return zbxp.c(this.a);
  }
  
  public void setWidth(double value)
  {
    if ((value > 0.0D) && (this.c == 0)) {
      this.c = 3;
    }
    this.a = zbxp.f(value);
  }
  
  public double getHeight()
  {
    return zbxp.c(this.b);
  }
  
  public void setHeight(double value)
  {
    if ((value > 0.0D) && (this.c == 0)) {
      this.c = 3;
    }
    this.b = zbxp.f(value);
  }
  
  public int getType()
  {
    return this.c;
  }
  
  public void setType(int value)
  {
    a(value);
  }
  
  int a()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  void a(Bevel paramBevel)
  {
    this.c = paramBevel.c;
    this.b = paramBevel.b;
    this.a = paramBevel.a;
  }
  
  boolean b(Bevel paramBevel)
  {
    if (this.c != paramBevel.c) {
      return false;
    }
    if (this.b != paramBevel.b) {
      return false;
    }
    return this.a == paramBevel.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Bevel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */