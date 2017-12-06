package com.aspose.cells;

class zbsf
  extends zbsb
{
  private double a = 1.0D;
  private boolean b = false;
  private boolean f = false;
  
  public zbsf(boolean paramBoolean)
  {
    super(false, false, paramBoolean);
  }
  
  public zaie a()
  {
    if (this.f) {
      return new zabb(this.a);
    }
    return zabb.a;
  }
  
  protected boolean b()
  {
    return this.b;
  }
  
  protected zaie c()
  {
    this.f = true;
    this.b = true;
    this.a = 0.0D;
    return zaba.b;
  }
  
  protected zaie a(int paramInt)
  {
    this.f = true;
    this.b = true;
    this.a = 0.0D;
    return zaba.b;
  }
  
  protected zaie a(double paramDouble)
  {
    this.f = true;
    if (this.b) {
      return zaba.b;
    }
    if (paramDouble == 0.0D)
    {
      this.b = true;
      this.a = 0.0D;
      return zaba.b;
    }
    this.a *= paramDouble;
    return null;
  }
  
  protected zaie a(double paramDouble, int paramInt)
  {
    this.f = true;
    if (this.b) {
      return zaba.b;
    }
    if (paramDouble == 0.0D)
    {
      this.b = true;
      this.a = 0.0D;
      return zaba.b;
    }
    this.a *= Math.pow(paramDouble, paramInt);
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */