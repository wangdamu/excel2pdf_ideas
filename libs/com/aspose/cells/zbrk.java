package com.aspose.cells;

class zbrk
  extends zbsb
{
  private int a = 0;
  private double b = 0.0D;
  
  public zbrk(boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramBoolean1, false, paramBoolean2);
  }
  
  public zaie a()
  {
    if (this.a < 1) {
      return zabc.a;
    }
    return new zabb(this.b);
  }
  
  protected boolean b()
  {
    return false;
  }
  
  protected zaie c()
  {
    if ((this.a > 0) && (this.b != 0.0D)) {
      this.b *= this.a / (this.a + 1);
    }
    this.a += 1;
    return null;
  }
  
  protected zaie a(int paramInt)
  {
    if ((this.a > 0) && (this.b != 0.0D)) {
      this.b *= this.a / (this.a + paramInt);
    }
    this.a += paramInt;
    return null;
  }
  
  protected zaie a(double paramDouble)
  {
    this.a += 1;
    this.b += (paramDouble - this.b) / this.a;
    return null;
  }
  
  protected zaie a(double paramDouble, int paramInt)
  {
    this.b = (this.b * (this.a / (this.a + paramInt)) + paramDouble * (paramInt / (this.a + paramInt)));
    this.a += paramInt;
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */