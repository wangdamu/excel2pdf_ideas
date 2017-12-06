package com.aspose.cells;

abstract class zaqm
{
  protected double a;
  
  public abstract double a(double paramDouble);
  
  public abstract double b(double paramDouble);
  
  protected abstract boolean a(double paramDouble1, double paramDouble2);
  
  protected abstract boolean b(double paramDouble1, double paramDouble2);
  
  public boolean a(double paramDouble1, double paramDouble2, int paramInt)
  {
    if (a(paramDouble1, paramDouble2))
    {
      this.a = paramDouble1;
      return true;
    }
    double d1 = 1.0D;
    int i = 0;
    for (int j = 0; j < paramInt; j++)
    {
      double d2 = b(paramDouble1);
      if (Math.abs(d2) < Double.MIN_VALUE)
      {
        this.a = paramDouble1;
        return false;
      }
      double d3 = paramDouble1;
      paramDouble1 = d3 - a(d3) / d2;
      d3 = Math.abs(paramDouble1 - d3);
      if (d3 <= paramDouble2)
      {
        this.a = paramDouble1;
        return b(paramDouble1, paramDouble2);
      }
      if (j == 0)
      {
        d1 = d3;
      }
      else
      {
        if (d3 > d1)
        {
          i++;
          if (i > 10) {
            return false;
          }
        }
        else
        {
          i = 0;
        }
        d1 = d3;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */