package com.aspose.cells;

import com.aspose.cells.a.c.zc;

class zst
{
  private double[] a;
  private int b;
  private int c = 0;
  
  public zst(int paramInt1, int paramInt2)
  {
    this.a = new double[paramInt1];
    this.b = paramInt2;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void a(double paramDouble)
  {
    if (this.c == this.a.length)
    {
      int i = this.b < 1 ? this.c : this.b;
      double[] arrayOfDouble = new double[this.c + i];
      System.arraycopy(this.a, 0, arrayOfDouble, 0, this.c);
      this.a = arrayOfDouble;
    }
    this.a[(this.c++)] = paramDouble;
  }
  
  public void a(double paramDouble, int paramInt)
  {
    if (this.c + paramInt > this.a.length)
    {
      int i = this.b < 1 ? this.c : this.b;
      if (i <= paramInt) {
        i += paramInt;
      }
      double[] arrayOfDouble = new double[this.c + i];
      System.arraycopy(this.a, 0, arrayOfDouble, 0, this.c);
      this.a = arrayOfDouble;
    }
    zc.a(this.a, this.c, this.c + paramInt, paramDouble);
    this.c += paramInt;
  }
  
  public double a(int paramInt)
  {
    return this.a[paramInt];
  }
  
  public double[] b()
  {
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */