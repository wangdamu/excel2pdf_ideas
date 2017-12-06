package com.aspose.cells;

import com.aspose.cells.a.c.zc;

class zbrv
  extends zbsb
{
  protected double[] a;
  protected int b = 0;
  
  public zbrv(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramBoolean1, paramBoolean2, paramBoolean3);
    this.a = new double[paramInt];
  }
  
  double[] d()
  {
    return this.a;
  }
  
  int e()
  {
    return this.b;
  }
  
  public zaie a()
  {
    return null;
  }
  
  protected boolean b()
  {
    return false;
  }
  
  protected zaie c()
  {
    return a(0.0D);
  }
  
  protected zaie a(int paramInt)
  {
    return a(0.0D, paramInt);
  }
  
  protected zaie a(double paramDouble)
  {
    if (this.b == this.a.length)
    {
      double[] arrayOfDouble = new double[this.b + Math.max(32, this.b >> 1)];
      System.arraycopy(this.a, 0, arrayOfDouble, 0, this.b);
      this.a = arrayOfDouble;
    }
    this.a[this.b] = paramDouble;
    this.b += 1;
    return null;
  }
  
  protected zaie a(double paramDouble, int paramInt)
  {
    if (this.b + paramInt > this.a.length)
    {
      double[] arrayOfDouble = new double[this.b + Math.max(paramInt, Math.max(32, this.b >> 1))];
      System.arraycopy(this.a, 0, arrayOfDouble, 0, this.b);
      this.a = arrayOfDouble;
    }
    if (paramInt > 1)
    {
      zc.a(this.a, this.b, this.b + paramInt, paramDouble);
      this.b += paramInt;
    }
    else
    {
      this.a[this.b] = paramDouble;
      this.b += 1;
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */