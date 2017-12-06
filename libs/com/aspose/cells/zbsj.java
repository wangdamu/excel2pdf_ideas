package com.aspose.cells;

class zbsj
  extends zbsb
{
  private int a = 0;
  private double b = 0.0D;
  private double f = 0.0D;
  private boolean g = false;
  
  public zbsj(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramBoolean2, false, paramBoolean3);
    this.g = paramBoolean1;
  }
  
  protected boolean b()
  {
    return false;
  }
  
  protected zaie c()
  {
    this.a += 1;
    return null;
  }
  
  protected zaie a(int paramInt)
  {
    this.a += paramInt;
    return null;
  }
  
  protected zaie a(double paramDouble)
  {
    this.a += 1;
    if (paramDouble != 0.0D)
    {
      this.f += paramDouble;
      this.b += paramDouble * paramDouble;
    }
    return null;
  }
  
  protected zaie a(double paramDouble, int paramInt)
  {
    this.a += paramInt;
    if (paramDouble != 0.0D)
    {
      double d = paramDouble * paramInt;
      this.f += d;
      this.b += paramDouble * d;
    }
    return null;
  }
  
  public zaie a()
  {
    double d1 = 0.0D;
    if (this.g)
    {
      if (this.a > 0)
      {
        double d2 = this.f / this.a;
        d1 = this.b / this.a - d2 * d2;
      }
      else
      {
        return zabc.a;
      }
    }
    else if (this.a > 1) {
      d1 = (this.b - this.f / this.a * this.f) / (this.a - 1);
    } else {
      return zabc.a;
    }
    return new zabb(d1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */