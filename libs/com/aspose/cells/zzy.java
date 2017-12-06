package com.aspose.cells;

class zzy
{
  private int a;
  private double b = 0.0D;
  
  public zzy(int paramInt, double paramDouble)
  {
    this.a = paramInt;
    this.b = paramDouble;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public double b()
  {
    return this.b;
  }
  
  public boolean a(double paramDouble)
  {
    switch (this.a)
    {
    case 1: 
      return paramDouble == this.b;
    case 8: 
      return paramDouble != this.b;
    case 2: 
      return paramDouble > this.b;
    case 3: 
      return paramDouble >= this.b;
    case 4: 
      return paramDouble < this.b;
    case 5: 
      return paramDouble <= this.b;
    case 6: 
      return true;
    }
    return false;
  }
  
  public boolean a(int paramInt, Object paramObject, boolean paramBoolean)
  {
    switch (paramInt)
    {
    case 3: 
    case 18: 
      return true;
    case 16: 
      return a(zbxa.a((DateTime)paramObject, paramBoolean));
    case 9: 
      return a(((Integer)paramObject).intValue());
    case 14: 
      return a(((Double)paramObject).doubleValue());
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */