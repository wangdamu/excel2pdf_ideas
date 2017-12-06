package com.aspose.cells;

class zbry
  extends zbsb
{
  private int a = 1;
  
  public zbry()
  {
    super(false, true, false);
  }
  
  protected boolean c_()
  {
    return true;
  }
  
  protected boolean b()
  {
    return this.a == 0;
  }
  
  protected zaie c()
  {
    this.a = 0;
    return zaba.b;
  }
  
  protected zaie a(int paramInt)
  {
    this.a = 0;
    return zaba.b;
  }
  
  protected zaie a(double paramDouble)
  {
    if (this.a == 0) {
      return zaba.b;
    }
    int i = (int)paramDouble;
    if (i == 0)
    {
      this.a = 0;
      return zaba.b;
    }
    if (i == 1) {
      return zaba.b;
    }
    int j = zbpi.a(this.a, i);
    if (j == this.a) {
      this.a = i;
    } else if (j != i) {
      this.a *= i / j;
    }
    return null;
  }
  
  protected zaie a(double paramDouble, int paramInt)
  {
    if (this.a == 0) {
      return zaba.b;
    }
    int i = (int)paramDouble;
    if (i == 0)
    {
      this.a = 0;
      return zaba.b;
    }
    if (i == 1) {
      return zaba.b;
    }
    int j;
    if (paramInt > 1)
    {
      for (;;)
      {
        j = zbpi.a(this.a, i);
        if (j == this.a) {
          this.a = i;
        } else if (j != i) {
          this.a *= i / j;
        }
        paramInt--;
        if (paramInt == 0) {
          break;
        }
      }
    }
    else
    {
      j = zbpi.a(this.a, i);
      if (j == this.a) {
        this.a = i;
      } else if (j != i) {
        this.a *= i / j;
      }
    }
    return null;
  }
  
  public zaie a()
  {
    return new zabb(this.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */