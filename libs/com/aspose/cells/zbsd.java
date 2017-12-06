package com.aspose.cells;

class zbsd
  extends zbsb
{
  private boolean a;
  private double b = 0.0D;
  
  public zbsd(boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramBoolean1, false, paramBoolean2);
    e();
  }
  
  public void e()
  {
    this.a = false;
  }
  
  public zaie a()
  {
    if (this.a) {
      return new zabb(this.b);
    }
    return zabb.a;
  }
  
  protected boolean b()
  {
    return (this.a) && (this.b <= 0.0D);
  }
  
  protected zaie c()
  {
    if (this.a)
    {
      if (this.b > 0.0D) {
        this.b = 0.0D;
      }
    }
    else
    {
      this.a = true;
      this.b = 0.0D;
    }
    return zaba.b;
  }
  
  protected zaie a(int paramInt)
  {
    return c();
  }
  
  protected zaie a(double paramDouble)
  {
    if (this.a)
    {
      if (paramDouble < this.b) {
        this.b = paramDouble;
      }
    }
    else
    {
      this.a = true;
      this.b = paramDouble;
    }
    return zaba.b;
  }
  
  protected zaie a(double paramDouble, int paramInt)
  {
    return a(paramDouble);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */