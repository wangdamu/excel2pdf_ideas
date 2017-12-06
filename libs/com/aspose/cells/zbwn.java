package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zv;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;

class zbwn
{
  private byte[] a;
  private zj b = null;
  private int c = 0;
  private boolean d = false;
  private double e;
  private double f;
  private double g;
  private double h;
  private int i = 7;
  private int j = 0;
  private int k = 0;
  private double l;
  private double m;
  private double n;
  private double o;
  private double p = 1.0D;
  
  public byte[] a()
  {
    return this.a;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public void a(double paramDouble)
  {
    this.e = a(paramDouble, -2112.0D, 2112.0D);
  }
  
  public void b(double paramDouble)
  {
    this.f = a(paramDouble, -2112.0D, 2112.0D);
  }
  
  public void c(double paramDouble)
  {
    this.g = a(paramDouble, 0.0D, 100.0D);
  }
  
  public void d(double paramDouble)
  {
    this.h = a(paramDouble, 0.0D, 100.0D);
  }
  
  public void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void b(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void c(int paramInt)
  {
    this.k = paramInt;
  }
  
  public double b()
  {
    return this.l;
  }
  
  public void e(double paramDouble)
  {
    this.l = a(paramDouble, -100.0D, 100.0D);
  }
  
  public double c()
  {
    return this.m;
  }
  
  public void f(double paramDouble)
  {
    this.m = a(paramDouble, -100.0D, 100.0D);
  }
  
  public double d()
  {
    return this.n;
  }
  
  public void g(double paramDouble)
  {
    this.n = a(paramDouble, -100.0D, 100.0D);
  }
  
  public double e()
  {
    return this.o;
  }
  
  public void h(double paramDouble)
  {
    this.o = a(paramDouble, -100.0D, 100.0D);
  }
  
  private double a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (paramDouble1 < paramDouble2) {
      return paramDouble2;
    }
    if (paramDouble1 > paramDouble3) {
      return paramDouble3;
    }
    return paramDouble1;
  }
  
  public void i(double paramDouble)
  {
    if (paramDouble < 0.0D) {
      this.p = 0.0D;
    }
    if (paramDouble > 1.0E9D) {
      this.p = 1.0E9D;
    }
    this.p = paramDouble;
  }
  
  zc a(ze paramze, float paramFloat)
    throws Exception
  {
    zq localzq1 = zn.a(paramze);
    if ((localzq1.h() <= 0.0F) || (localzq1.i() <= 0.0F)) {
      return new zu(Color.getEmpty());
    }
    if (localzq1.h() < 1.0F) {
      localzq1.c(1.0F);
    }
    if (localzq1.i() < 1.0F) {
      localzq1.d(1.0F);
    }
    zj localzj = null;
    if (this.b == null) {
      localzj = zbxz.a(a(), localzq1.e());
    } else {
      localzj = this.b;
    }
    if (this.d)
    {
      localObject = new zv(localzj, 0, localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
      return (zc)localObject;
    }
    Object localObject = new za((int)localzq1.h(), (int)localzq1.i());
    zi localzi = zi.a((zj)localObject);
    zn.a(localzi);
    float f1 = (float)(((zj)localObject).i() * b() / 100.0D);
    float f2 = (float)(((zj)localObject).h() * d() / 100.0D);
    float f3 = ((zj)localObject).i() - (float)(((zj)localObject).i() * c() / 100.0D);
    float f4 = ((zj)localObject).h() - (float)(((zj)localObject).h() * e() / 100.0D);
    zq localzq2 = new zq(f1, f2, f3 - f1, f4 - f2);
    zq localzq3 = new zq(0.0F, 0.0F, localzj.i(), localzj.h());
    localzi.a(localzj, localzq2, localzq3, 2);
    zv localzv = null;
    if ((b() != 0.0D) || (d() != 0.0D) || (this.o != 0.0D) || (this.m != 0.0D)) {
      localzv = new zv((zj)localObject, localzq1);
    } else {
      localzv = new zv(localzj, localzq1);
    }
    return localzv;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */