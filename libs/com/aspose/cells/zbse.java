package com.aspose.cells;

class zbse
  extends zbsb
{
  private int a;
  private double b;
  private double f;
  
  public zbse(boolean paramBoolean, double paramDouble)
  {
    super(paramBoolean, false, false);
    this.f = (paramDouble + 1.0D);
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
    if (paramDouble != 0.0D) {
      this.b += paramDouble / Math.pow(this.f, this.a);
    }
    return null;
  }
  
  protected zaie a(double paramDouble, int paramInt)
  {
    if (paramDouble != 0.0D)
    {
      if (paramInt > 1)
      {
        do
        {
          this.a += 1;
          this.b += paramDouble / Math.pow(this.f, this.a);
          paramInt--;
        } while (paramInt != 0);
      }
      else
      {
        this.a += 1;
        this.b += paramDouble / Math.pow(this.f, this.a);
      }
    }
    else {
      this.a += paramInt;
    }
    return null;
  }
  
  public zaie a()
  {
    return new zabb(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */