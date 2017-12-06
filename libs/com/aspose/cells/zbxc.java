package com.aspose.cells;

import java.util.ArrayList;

class zbxc
{
  private int a;
  private int b;
  private double c;
  private double d;
  private double e = 0.0D;
  private double f = 0.0D;
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(ArrayList paramArrayList)
  {
    this.c = this.a;
    this.d = this.b;
    double d1 = 0.0D;
    double d2 = 0.0D;
    zbxd localzbxd1;
    for (double d3 = 0; d3 < paramArrayList.size(); d3++)
    {
      localzbxd1 = (zbxd)paramArrayList.get(d3);
      d2 += localzbxd1.b();
    }
    d1 = this.a * this.b / d2 / 100.0D;
    for (d3 = 0; d3 < paramArrayList.size(); d3++)
    {
      localzbxd1 = (zbxd)paramArrayList.get(d3);
      localzbxd1.h(d1 * localzbxd1.b());
    }
    d3 = 0;
    double d4 = 0;
    double d5 = 999.0D;
    boolean bool = a(this.c, this.d);
    while (d4 != paramArrayList.size())
    {
      d6 = a(paramArrayList, d3, d4, bool);
      if ((d6 > d5) || (d6 < 1.0D))
      {
        d7 = 0.0D;
        d8 = 0.0D;
        for (double d9 = d3; d9 < d4; d9++)
        {
          zbxd localzbxd5 = (zbxd)paramArrayList.get(d9);
          localzbxd5.b(this.e + d7);
          localzbxd5.c(this.f + d8);
          if (bool) {
            d8 += localzbxd5.f();
          } else {
            d7 += localzbxd5.e();
          }
        }
        zbxd localzbxd4 = (zbxd)paramArrayList.get(d3);
        if (bool) {
          this.e += localzbxd4.e();
        } else {
          this.f += localzbxd4.f();
        }
        this.c = (this.a - this.e);
        this.d = (this.b - this.f);
        bool = a(this.c, this.d);
        d3 = d4;
        d4 = d3;
        d5 = 999.0D;
      }
      else
      {
        for (d7 = d3; d7 <= d4; d7++)
        {
          zbxd localzbxd2 = (zbxd)paramArrayList.get(d7);
          localzbxd2.d(localzbxd2.g());
          localzbxd2.e(localzbxd2.h());
        }
        d5 = d6;
        d4++;
      }
    }
    double d6 = 0.0D;
    double d7 = 0.0D;
    for (double d8 = d3; d8 < d4; d8++)
    {
      zbxd localzbxd3 = (zbxd)paramArrayList.get(d8);
      localzbxd3.b(this.e + d6);
      localzbxd3.c(this.f + d7);
      if (bool) {
        d7 += localzbxd3.f();
      } else {
        d6 += localzbxd3.e();
      }
    }
  }
  
  private double a(ArrayList paramArrayList, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    zbxd localzbxd;
    for (int i = paramInt1; i <= paramInt2; i++)
    {
      localzbxd = (zbxd)paramArrayList.get(i);
      d1 += localzbxd.i();
    }
    double d3;
    double d4;
    if (paramBoolean)
    {
      d3 = d1 / this.d * 100.0D;
      d4 = this.d;
    }
    else
    {
      d4 = d1 / this.c * 100.0D;
      d3 = this.c;
    }
    for (i = paramInt1; i <= paramInt2; i++)
    {
      localzbxd = (zbxd)paramArrayList.get(i);
      if (paramBoolean)
      {
        localzbxd.f(d3);
        localzbxd.g(d4 * (localzbxd.i() / d1));
      }
      else
      {
        localzbxd.f(d3 * (localzbxd.i() / d1));
        localzbxd.g(d4);
      }
      d2 = Math.max(localzbxd.h() / localzbxd.g(), localzbxd.g() / localzbxd.h());
    }
    return d2;
  }
  
  private boolean a(double paramDouble1, double paramDouble2)
  {
    return paramDouble1 > paramDouble2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */