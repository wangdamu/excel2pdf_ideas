package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.b.a.za;

class zayb
{
  private int a;
  private int b;
  private double[][] c;
  private double[] d;
  
  static int[] a(double[][] paramArrayOfDouble, boolean paramBoolean)
  {
    za localza = new za(paramArrayOfDouble, paramBoolean);
    return localza.a();
  }
  
  zayb(double[][] paramArrayOfDouble, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b = paramArrayOfDouble.length;
      this.a = paramArrayOfDouble[0].length;
      this.c = new double[this.a][];
      for (i = 0; i < this.a; i++)
      {
        double[] arrayOfDouble = new double[this.b];
        this.c[i] = arrayOfDouble;
        for (int j = 0; j < this.b; j++) {
          arrayOfDouble[j] = paramArrayOfDouble[j][i];
        }
      }
    }
    else
    {
      this.a = paramArrayOfDouble.length;
      this.b = paramArrayOfDouble[0].length;
      this.c = new double[this.a][];
      for (i = 0; i < this.a; i++)
      {
        this.c[i] = new double[this.b];
        System.arraycopy(paramArrayOfDouble[i], 0, this.c[i], 0, this.b);
      }
    }
    this.d = new double[this.b];
    for (int i = 0; i < this.b; i++)
    {
      double d1 = 0.0D;
      for (int k = i; k < this.a; k++) {
        d1 = a(d1, this.c[k][i]);
      }
      if (d1 != 0.0D)
      {
        if (this.c[i][i] < 0.0D) {
          d1 = -d1;
        }
        for (k = i; k < this.a; k++) {
          this.c[k][i] /= d1;
        }
        this.c[i][i] += 1.0D;
        for (k = i + 1; k < this.b; k++)
        {
          double d2 = 0.0D;
          for (int m = i; m < this.a; m++) {
            d2 += this.c[m][i] * this.c[m][k];
          }
          d2 = -d2 / this.c[i][i];
          for (m = i; m < this.a; m++) {
            this.c[m][k] += d2 * this.c[m][i];
          }
        }
      }
      this.d[i] = (-d1);
    }
  }
  
  public double[] a()
  {
    return this.d;
  }
  
  public double[][] b()
  {
    double[][] arrayOfDouble = new double[this.b][];
    for (int i = 0; i < this.b; i++)
    {
      arrayOfDouble[i] = new double[this.b];
      for (int j = 0; j < this.b; j++) {
        if (i < j) {
          arrayOfDouble[i][j] = this.c[i][j];
        } else if (i == j) {
          arrayOfDouble[i][j] = this.d[i];
        } else {
          arrayOfDouble[i][j] = 0.0D;
        }
      }
    }
    return arrayOfDouble;
  }
  
  public double[][] c()
  {
    double[][] arrayOfDouble = new double[this.b][];
    for (int i = 0; i < this.b; i++) {
      arrayOfDouble[i] = new double[this.a];
    }
    for (i = this.b - 1; i >= 0; i--)
    {
      double[] arrayOfDouble1 = arrayOfDouble[i];
      zc.a(arrayOfDouble1, 0, this.a, 0.0D);
      arrayOfDouble1[i] = 1.0D;
      double d1 = this.c[i][i];
      for (int j = i; j < this.b; j++) {
        if (d1 != 0.0D)
        {
          double d2 = 0.0D;
          for (int k = i; k < this.a; k++) {
            d2 += this.c[k][i] * arrayOfDouble[j][k];
          }
          d2 = -d2 / d1;
          for (k = i; k < this.a; k++) {
            arrayOfDouble[j][k] += d2 * this.c[k][i];
          }
        }
      }
    }
    return arrayOfDouble;
  }
  
  private static double a(double paramDouble1, double paramDouble2)
  {
    double d1;
    if (Math.abs(paramDouble1) > Math.abs(paramDouble2))
    {
      d1 = paramDouble2 / paramDouble1;
      d1 = Math.abs(paramDouble1) * Math.sqrt(1.0D + d1 * d1);
    }
    else if (paramDouble2 != 0.0D)
    {
      d1 = paramDouble1 / paramDouble2;
      d1 = Math.abs(paramDouble2) * Math.sqrt(1.0D + d1 * d1);
    }
    else
    {
      d1 = 0.0D;
    }
    return d1;
  }
  
  private static class za
  {
    private double[][] a;
    private double[][] b;
    private int[] c;
    private int[] d;
    private double[] e;
    private int f;
    
    za(double[][] paramArrayOfDouble, boolean paramBoolean)
    {
      this.a = paramArrayOfDouble;
      this.b = new double[paramArrayOfDouble[0].length][];
      if (paramBoolean)
      {
        this.b[0] = paramArrayOfDouble[0];
        this.f = 1;
      }
      else
      {
        this.f = 0;
      }
      this.c = new int[this.b.length];
      this.d = new int[this.c.length];
      this.e = new double[this.c.length];
    }
    
    int[] a()
    {
      a(this.f, this.f);
      return this.d;
    }
    
    private void a(int paramInt1, int paramInt2)
    {
      if (paramInt2 < this.b.length)
      {
        int i = this.a.length - (this.b.length - paramInt2) + 1;
        while (paramInt1 < i)
        {
          this.c[paramInt2] = paramInt1;
          this.b[paramInt2] = this.a[paramInt1];
          a(paramInt1 + 1, paramInt2 + 1);
          paramInt1++;
        }
      }
      else
      {
        double[] arrayOfDouble = new zayb(this.b, true).a();
        for (int j = 0; j < arrayOfDouble.length; j++) {
          arrayOfDouble[j] = Math.abs(arrayOfDouble[j]);
        }
        za.a(arrayOfDouble);
        double d1 = 0.0D;
        for (int k = 0; k < arrayOfDouble.length; k++)
        {
          double d2 = this.e[k];
          double d3 = arrayOfDouble[k];
          if (d2 < 1.0E-13D)
          {
            if (d3 <= 1.0E-13D) {
              break;
            }
            System.arraycopy(this.c, 0, this.d, 0, this.c.length);
            System.arraycopy(arrayOfDouble, 0, this.e, 0, arrayOfDouble.length);
            return;
          }
          if (d3 < 1.0E-13D) {
            return;
          }
          if (d3 > d2) {
            d1 += d3 / d2;
          } else if (d3 < d2) {
            d1 -= d2 / d3;
          }
        }
        if (d1 > 0.0D)
        {
          System.arraycopy(this.c, 0, this.d, 0, this.c.length);
          System.arraycopy(arrayOfDouble, 0, this.e, 0, arrayOfDouble.length);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */