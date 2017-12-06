package com.aspose.cells;

class zbdo
  implements zajb
{
  private zajd a;
  private zajc b;
  private zajd c;
  private zajc d;
  
  zbdo(zajd paramzajd1, zajc paramzajc1, zajd paramzajd2, zajc paramzajc2)
  {
    this.c = paramzajd1;
    this.d = paramzajc1;
    this.a = paramzajd2;
    this.b = paramzajc2;
  }
  
  public int a(int paramInt)
  {
    return this.b.a(paramInt);
  }
  
  public double b(int paramInt)
  {
    return this.c.d(this.d.a(paramInt));
  }
  
  public double c(int paramInt)
  {
    return this.c.e(this.d.a(paramInt));
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    return this.b.a(paramInt1, paramInt2);
  }
  
  public double b(int paramInt1, int paramInt2)
  {
    return this.c.d(this.d.a(paramInt1, paramInt2));
  }
  
  public void a(int[] paramArrayOfInt)
  {
    this.b.a(paramArrayOfInt);
  }
  
  public void b(int[] paramArrayOfInt)
  {
    paramArrayOfInt[1] = this.c.a(paramArrayOfInt[1]);
    paramArrayOfInt[2] = this.c.a(paramArrayOfInt[2]);
    this.d.a(paramArrayOfInt);
    paramArrayOfInt[1] = this.c.c(paramArrayOfInt[1]);
    paramArrayOfInt[2] = this.c.c(paramArrayOfInt[2]);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */