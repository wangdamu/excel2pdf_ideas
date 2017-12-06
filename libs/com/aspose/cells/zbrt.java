package com.aspose.cells;

class zbrt
  extends zbsb
{
  private int a = 0;
  
  public zbrt()
  {
    super(false, true, false);
  }
  
  protected boolean b()
  {
    return true;
  }
  
  protected zaie c()
  {
    return zaba.b;
  }
  
  protected zaie a(int paramInt)
  {
    return zaba.b;
  }
  
  protected zaie a(double paramDouble)
  {
    int i = (int)paramDouble;
    if (i == 0) {
      return zaba.b;
    }
    this.a = zbpi.a(this.a, i);
    return null;
  }
  
  protected zaie a(double paramDouble, int paramInt)
  {
    int i = (int)paramDouble;
    if (i == 0) {
      return zaba.b;
    }
    if (paramInt > 1) {
      do
      {
        this.a = zbpi.a(this.a, i);
        paramInt--;
      } while (paramInt != 0);
    } else {
      this.a = zbpi.a(this.a, i);
    }
    return null;
  }
  
  public zaie a()
  {
    return new zabb(this.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */