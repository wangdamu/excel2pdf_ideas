package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zv;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.zg;

class zbwl
  implements zajp
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
  private double q = 1.0D;
  private boolean r = false;
  private boolean s = false;
  
  public byte[] a()
  {
    return this.a;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public zs b()
    throws Exception
  {
    if (this.b == null) {
      this.b = zbxz.a(a(), new zt(0.0F, 0.0F));
    }
    return this.b.m();
  }
  
  public int c()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public boolean d()
  {
    return this.d;
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public double e()
  {
    return this.e;
  }
  
  public void a(double paramDouble)
  {
    this.e = a(paramDouble, -2112.0D, 2112.0D);
  }
  
  public double f()
  {
    return this.f;
  }
  
  public void b(double paramDouble)
  {
    this.f = a(paramDouble, -2112.0D, 2112.0D);
  }
  
  public double g()
  {
    return this.g;
  }
  
  public void c(double paramDouble)
  {
    this.g = a(paramDouble, 0.0D, 100.0D);
  }
  
  public double h()
  {
    return this.h;
  }
  
  public void d(double paramDouble)
  {
    this.h = a(paramDouble, 0.0D, 100.0D);
  }
  
  public int i()
  {
    return this.i;
  }
  
  public void b(int paramInt)
  {
    this.i = paramInt;
  }
  
  public int j()
  {
    return this.j;
  }
  
  public void c(int paramInt)
  {
    this.j = paramInt;
  }
  
  public int k()
  {
    return this.k;
  }
  
  public void d(int paramInt)
  {
    this.k = paramInt;
  }
  
  public double l()
  {
    return this.l;
  }
  
  public void e(double paramDouble)
  {
    this.l = a(paramDouble, -100.0D, 100.0D);
  }
  
  public double m()
  {
    return this.m;
  }
  
  public void f(double paramDouble)
  {
    this.m = a(paramDouble, -100.0D, 100.0D);
  }
  
  public double n()
  {
    return this.n;
  }
  
  public void g(double paramDouble)
  {
    this.n = a(paramDouble, -100.0D, 100.0D);
  }
  
  public double o()
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
  
  public double p()
  {
    return this.p;
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
  
  public boolean a(zbwl paramzbwl)
  {
    if (paramzbwl == null) {
      return false;
    }
    if ((this.a != null) && (paramzbwl.a != null) && (!zbxz.a(this.a, paramzbwl.a))) {
      return false;
    }
    if (this.c != paramzbwl.c()) {
      return false;
    }
    if (this.d != paramzbwl.d()) {
      return false;
    }
    if (this.d)
    {
      if ((this.e != paramzbwl.e()) || (this.g != paramzbwl.g())) {
        return false;
      }
      if ((this.f != paramzbwl.f()) || (this.h != paramzbwl.h())) {
        return false;
      }
      if ((i() != paramzbwl.i()) || (j() != paramzbwl.j())) {
        return false;
      }
    }
    else
    {
      if (k() != paramzbwl.k()) {
        return false;
      }
      if (k() == 0)
      {
        if ((l() != paramzbwl.l()) || (this.m != paramzbwl.m) || (n() != paramzbwl.n()) || (o() != paramzbwl.o())) {
          return false;
        }
      }
      else if ((k() == 2) && (p() != paramzbwl.p())) {
        return false;
      }
    }
    return true;
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
    Object localObject1;
    if (this.d)
    {
      localObject1 = new zv(localzj, 0, localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
      return (zc)localObject1;
    }
    float f3;
    if (this.k == 0)
    {
      localObject1 = new za((int)localzq1.h(), (int)localzq1.i());
      zi localzi1 = zi.a((zj)localObject1);
      zn.a(localzi1);
      float f1 = (float)(((za)localObject1).i() * l() / 100.0D);
      float f2 = (float)(((za)localObject1).h() * n() / 100.0D);
      f3 = ((za)localObject1).i() - (float)(((za)localObject1).i() * m() / 100.0D);
      float f4 = ((za)localObject1).h() - (float)(((za)localObject1).h() * o() / 100.0D);
      zq localzq2 = new zq(f1, f2, f3 - f1, f4 - f2);
      zq localzq3 = new zq(0.0F, 0.0F, localzj.i(), localzj.h());
      localzi1.a(localzj, localzq2, localzq3, 2);
      zv localzv3 = null;
      if ((localzq2.f() == localzq3.f()) && (localzq2.g() == localzq3.g()) && (localzq2.h() == localzq3.h()) && (localzq2.i() == localzq3.i())) {
        localzv3 = new zv(localzj, localzq1);
      } else {
        localzv3 = new zv((zj)localObject1, localzq1);
      }
      return localzv3;
    }
    int i2;
    int i3;
    float f6;
    float f7;
    float f8;
    zq localzq5;
    if (this.k == 1)
    {
      localObject1 = new za(zbxz.a(localzq1.h()), zbxz.a(localzq1.i()));
      int i1;
      float f5;
      zq localzq4;
      if (r())
      {
        i1 = (int)(localzj.i() * localzq1.i() / localzj.h());
        localObject2 = zi.a((zj)localObject1);
        zn.a((zi)localObject2);
        i2 = (int)localzq1.h() / i1 + 1;
        f3 = 0.0F;
        for (i3 = 0; i3 < i2; i3++)
        {
          f5 = f3;
          f6 = 0.0F;
          f7 = f3 + i1;
          f8 = ((za)localObject1).h();
          localzq4 = new zq(f5, f6, f7 - f5, f8 - f6);
          localzq5 = new zq(0.0F, 0.0F, localzj.i() - 1, localzj.h());
          ((zi)localObject2).a(localzj, localzq4, localzq5, 2);
          f3 = f7;
        }
      }
      else
      {
        i1 = (int)(localzj.h() * localzq1.h() / localzj.i());
        localObject2 = zi.a((zj)localObject1);
        zn.a((zi)localObject2);
        i2 = (int)localzq1.i() / i1 + 1;
        f3 = localzq1.i();
        for (i3 = 0; i3 < i2; i3++)
        {
          f5 = 0.0F;
          f6 = f3 - i1;
          f7 = ((za)localObject1).i();
          f8 = f3;
          localzq4 = new zq(f5, f6, f7 - f5, f8 - f6);
          localzq5 = new zq(0.0F, 0.0F, localzj.i(), localzj.h() - 1);
          ((zi)localObject2).a(localzj, localzq4, localzq5, 2);
          f3 = f6;
        }
      }
      zv localzv1 = new zv((zj)localObject1, localzq1);
      return localzv1;
    }
    double d1 = q() / this.p;
    Object localObject2 = new za(zbxz.a(localzq1.h()), zbxz.a(localzq1.i()));
    zi localzi2;
    int i4;
    float f9;
    zq localzq6;
    if (r())
    {
      i2 = zbxz.a(((za)localObject2).i() / d1);
      localzi2 = zi.a((zj)localObject2);
      zn.a(localzi2);
      i3 = (int)localzq1.h() / i2 + 1;
      for (i4 = 0; i4 < i3; i4++)
      {
        f6 = i2 * i4;
        f7 = 0.0F;
        f8 = f6 + i2;
        f9 = localzq1.i();
        localzq5 = new zq(f6, f7, f8 - f6, f9 - f7);
        localzq6 = new zq(0.0F, 0.0F, localzj.i() - 1, localzj.h());
        localzi2.a(localzj, localzq5, localzq6, 2);
      }
    }
    else
    {
      i2 = zbxz.a(((za)localObject2).h() / d1);
      localzi2 = zi.a((zj)localObject2);
      zn.a(localzi2);
      i3 = (int)localzq1.i() / i2 + 1;
      for (i4 = 0; i4 < i3; i4++)
      {
        f6 = 0.0F;
        f7 = localzq1.i() - i2 * (i4 + 1);
        f8 = ((za)localObject2).i();
        f9 = f7 + i2;
        localzq5 = new zq(f6, f7, f8 - f6, f9 - f7);
        localzq6 = new zq(0.0F, 0.0F, localzj.i(), localzj.h() - 1.0F);
        localzi2.a(localzj, localzq5, localzq6, 2);
      }
    }
    zv localzv2 = new zv((zj)localObject2, localzq1);
    return localzv2;
  }
  
  public double q()
  {
    return this.q;
  }
  
  public void j(double paramDouble)
  {
    this.q = paramDouble;
  }
  
  public boolean r()
  {
    return this.r;
  }
  
  public void b(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  protected void finalize()
    throws Exception
  {
    c(false);
  }
  
  public void dispose()
  {
    c(true);
    zg.a(this);
  }
  
  protected void c(boolean paramBoolean)
  {
    if (!this.s)
    {
      if ((paramBoolean) && (this.a != null)) {
        this.a = null;
      }
      this.s = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */