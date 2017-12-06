package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbol
  extends zcp
{
  zbol(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    float f1 = this.e.u();
    float f2 = this.e.v();
    float f3 = this.e.s();
    float f4 = this.e.t();
    zq localzq = new zq(f1, f2, f3, f4);
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    localze1.b(localzq);
    zc localzc = zbyb.a(this.e.z(), localze1);
    zs localzs = zbyb.a(this.e.A());
    com.aspose.cells.b.a.b.a.ze localze2 = a(f1, f2, f3, f4, 0);
    com.aspose.cells.b.a.b.a.ze localze3 = a(f1, f2, f3, f4, 1);
    com.aspose.cells.b.a.b.a.ze localze4 = a(f1, f2, f3, f4, 2);
    com.aspose.cells.b.a.b.a.ze localze5 = a(f1, f2, f3, f4, 3);
    com.aspose.cells.b.a.b.a.ze localze6 = a(f1, f2, f3, f4, 4);
    if (!this.e.z().a())
    {
      this.a.a(localzc, localze2);
      this.a.a(localzc, localze3);
      this.a.a(localzc, localze5);
      this.a.a(localzc, localze4);
      this.a.a(localzc, localze6);
    }
    if (!this.e.A().a())
    {
      this.a.a(localzs, localze2);
      this.a.a(localzs, localze3);
      this.a.a(localzs, localze4);
      this.a.a(localzs, localze5);
      this.a.a(localzs, localze6);
    }
    a();
  }
  
  void a()
    throws Exception
  {
    zq localzq = this.e.y();
    if (!this.e.A().a()) {
      localzq.a(-(this.e.A().h() / 2.0F), -(this.e.A().h() / 2.0F));
    }
    float f1 = zbyb.a(this.e.B());
    if ((this.e.E() == 7) || (this.e.E() == 9)) {
      localzq.a(localzq.f() + f1);
    } else if ((this.e.E() == 0) || (this.e.E() == 8)) {
      localzq.c(localzq.h() - f1);
    }
    int i = this.e.B().d();
    if (localzq.i() < i)
    {
      f2 = (i - localzq.i()) / 2.0F;
      localzq = new zq(localzq.f(), localzq.g() - f2, localzq.h(), i);
    }
    if (this.e.K().equals("\n")) {
      return;
    }
    float f2 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f2 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) * (this.e.s() > this.e.t() ? this.e.t() : this.e.s()) / 100000.0F;
      } else {
        f2 = 13630.0F * (this.e.s() > this.e.t() ? this.e.t() : this.e.s()) / 100000.0F;
      }
    }
    else {
      f2 = 13630.0F * (this.e.s() > this.e.t() ? this.e.t() : this.e.s()) / 100000.0F;
    }
    localzq.a(localzq.f() + (f2 + 5.0F));
    localzq.c(localzq.h() - 2.0F * (f2 + 5.0F));
    localzq.b(localzq.g() + f2);
    localzq.d(localzq.i() - 2.0F * f2);
    zbyb.b(this.a, this.e, localzq, this.e.K(), this.e.H(), this.e.B(), this.e.C(), this.e.E(), this.e.F(), this.e.G());
  }
  
  private com.aspose.cells.b.a.b.a.ze a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f1 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f1 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) * (this.e.s() > this.e.t() ? this.e.t() : this.e.s()) / 100000.0F;
      } else {
        f1 = 13630.0F * (this.e.s() > this.e.t() ? this.e.t() : this.e.s()) / 100000.0F;
      }
    }
    else {
      f1 = 13630.0F * (this.e.s() > this.e.t() ? this.e.t() : this.e.s()) / 100000.0F;
    }
    float f2 = f1;
    switch (this.e.c)
    {
    case 1: 
      if (paramInt == 0)
      {
        localze.a(paramFloat1 + f2, paramFloat2, f2, f2, 0.0F, -180.0F);
        localze.b(paramFloat1 + f2, paramFloat2 + f2 / 2.0F, paramFloat1 + f2, paramFloat2 + paramFloat4 - f2 / 2.0F);
        localze.a(paramFloat1, paramFloat2 + paramFloat4 - f2, f2, f2, 0.0F, 90.0F);
        localze.k();
        localze.b(paramFloat1 + f2 / 2.0F, paramFloat2 + paramFloat4, paramFloat1 + paramFloat3 - 1.5F * f2, paramFloat2 + paramFloat4);
        localze.a(paramFloat1 + paramFloat3 - 2.0F * f2, paramFloat2 + paramFloat4 - f2, f2, f2, 90.0F, -90.0F);
        localze.b(paramFloat1 + paramFloat3 - f2, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + paramFloat3 - f2, paramFloat2 + f2);
        localze.a(paramFloat1 + 1.25F * f2, paramFloat2 + f2 / 2.0F, f2 / 2.0F, f2 / 2.0F, 90.0F, 180.0F);
        localze.b(paramFloat1 + 1.5F * f2, paramFloat2 + f2 / 2.0F, paramFloat1 + 2.0F * f2, paramFloat2 + f2 / 2.0F);
      }
      else if (paramInt == 1)
      {
        localze.a(paramFloat1 + f2, paramFloat2, f2, f2, -90.0F, 180.0F);
        localze.k();
        localze.b(paramFloat1 + 1.5F * f2, paramFloat2 + f2, paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2 + f2);
        localze.a(paramFloat1 + paramFloat3 - f2, paramFloat2, f2, f2, 90.0F, -180.0F);
        localze.b(paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2, paramFloat1 + 1.5F * f2, paramFloat2);
      }
      else if (paramInt == 2)
      {
        localze.a(paramFloat1 + f2, paramFloat2, f2, f2, 0.0F, 90.0F);
        localze.a(paramFloat1 + 1.25F * f2, paramFloat2 + f2 / 2.0F, f2 / 2.0F, f2 / 2.0F, 90.0F, 180.0F);
        localze.j();
      }
      else if (paramInt == 3)
      {
        localze.a(paramFloat1 + 0.25F * f2, paramFloat2 + paramFloat4 - f2, f2 / 2.0F, f2 / 2.0F, -90.0F, 180.0F);
        localze.k();
        localze.b(paramFloat1 + f2 / 2.0F, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + f2, paramFloat2 + paramFloat4 - f2 / 2.0F);
        localze.b(paramFloat1 + f2, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + f2, paramFloat2 + paramFloat4 - f2);
        localze.b(paramFloat1 + f2, paramFloat2 + paramFloat4 - f2, paramFloat1 + f2 / 2.0F, paramFloat2 + paramFloat4 - f2);
      }
      else
      {
        localze.a(paramFloat1 + 0.25F * f2, paramFloat2 + paramFloat4 - f2, f2 / 2.0F, f2 / 2.0F, 90.0F, -180.0F);
        localze.k();
        localze.a(paramFloat1, paramFloat2 + paramFloat4 - f2, f2, f2, -90.0F, -270.0F);
        localze.b(paramFloat1 + f2, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + f2 / 2.0F, paramFloat2 + paramFloat4 - f2 / 2.0F);
      }
      break;
    case 2: 
      if (paramInt == 0)
      {
        localze.a(paramFloat1 + f2, paramFloat2 + paramFloat4 - f2, f2, f2, 0.0F, 180.0F);
        localze.b(paramFloat1 + f2, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + f2, paramFloat2 + f2 / 2.0F);
        localze.a(paramFloat1, paramFloat2, f2, f2, 0.0F, -90.0F);
        localze.k();
        localze.b(paramFloat1 + f2 / 2.0F, paramFloat2, paramFloat1 + paramFloat3 - 1.5F * f2, paramFloat2);
        localze.a(paramFloat1 + paramFloat3 - 2.0F * f2, paramFloat2, f2, f2, 270.0F, 90.0F);
        localze.b(paramFloat1 + paramFloat3 - f2, paramFloat2 + f2 / 2.0F, paramFloat1 + paramFloat3 - f2, paramFloat2 + paramFloat4 - f2);
        localze.a(paramFloat1 + 1.25F * f2, paramFloat2 + paramFloat4 - f2, f2 / 2.0F, f2 / 2.0F, 270.0F, -180.0F);
        localze.b(paramFloat1 + 1.5F * f2, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + 2.0F * f2, paramFloat2 + paramFloat4 - f2 / 2.0F);
      }
      else if (paramInt == 1)
      {
        localze.a(paramFloat1 + f2, paramFloat2 + paramFloat4 - f2, f2, f2, 270.0F, 180.0F);
        localze.k();
        localze.b(paramFloat1 + 1.5F * f2, paramFloat2 + paramFloat4, paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2 + paramFloat4);
        localze.a(paramFloat1 + paramFloat3 - f2, paramFloat2 + paramFloat4 - f2, f2, f2, 90.0F, -180.0F);
        localze.b(paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2 + paramFloat4 - f2, paramFloat1 + 1.5F * f2, paramFloat2 + paramFloat4 - f2);
      }
      else if (paramInt == 2)
      {
        localze.a(paramFloat1 + f2, paramFloat2 + paramFloat4 - f2, f2, f2, 0.0F, -90.0F);
        localze.a(paramFloat1 + 1.25F * f2, paramFloat2 + paramFloat4 - f2, f2 / 2.0F, f2 / 2.0F, 270.0F, -180.0F);
        localze.j();
      }
      else if (paramInt == 3)
      {
        localze.a(paramFloat1 + 0.25F * f2, paramFloat2 + f2 / 2.0F, f2 / 2.0F, f2 / 2.0F, 270.0F, 180.0F);
        localze.k();
        localze.b(paramFloat1 + f2 / 2.0F, paramFloat2 + f2, paramFloat1 + f2, paramFloat2 + f2);
        localze.b(paramFloat1 + f2, paramFloat2 + f2, paramFloat1 + f2, paramFloat2 + f2 / 2.0F);
        localze.b(paramFloat1 + f2, paramFloat2 + f2 / 2.0F, paramFloat1 + f2 / 2.0F, paramFloat2 + f2 / 2.0F);
      }
      else
      {
        localze.a(paramFloat1 + 0.25F * f2, paramFloat2 + f2 / 2.0F, f2 / 2.0F, f2 / 2.0F, 270.0F, 180.0F);
        localze.k();
        localze.a(paramFloat1, paramFloat2, f2, f2, 90.0F, 270.0F);
        localze.b(paramFloat1 + f2, paramFloat2 + f2 / 2.0F, paramFloat1 + f2 / 2.0F, paramFloat2 + f2 / 2.0F);
      }
      break;
    case 4: 
      if (paramInt == 0)
      {
        localze.a(paramFloat1 + paramFloat3 - 2.0F * f2, paramFloat2, f2, f2, 180.0F, 180.0F);
        localze.b(paramFloat1 + paramFloat3 - f2, paramFloat2 + f2 / 2.0F, paramFloat1 + paramFloat3 - f2, paramFloat2 + paramFloat4 - f2 / 2.0F);
        localze.a(paramFloat1 + paramFloat3 - f2, paramFloat2 + paramFloat4 - f2, f2, f2, 180.0F, -90.0F);
        localze.k();
        localze.b(paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2 + paramFloat4, paramFloat1 + 1.5F * f2, paramFloat2 + paramFloat4);
        localze.a(paramFloat1 + f2, paramFloat2 + paramFloat4 - f2, f2, f2, 90.0F, 90.0F);
        localze.b(paramFloat1 + f2, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + f2, paramFloat2 + f2);
        localze.a(paramFloat1 + paramFloat3 - 1.75F * f2, paramFloat2 + f2 / 2.0F, f2 / 2.0F, f2 / 2.0F, 90.0F, -180.0F);
        localze.b(paramFloat1 + paramFloat3 - 1.5F * f2, paramFloat2 + f2 / 2.0F, paramFloat1 + paramFloat3 - 2.0F * f2, paramFloat2 + f2 / 2.0F);
      }
      else if (paramInt == 1)
      {
        localze.b(paramFloat1 + paramFloat3 - 1.5F * f2, paramFloat2, paramFloat1 + f2 / 2.0F, paramFloat2);
        localze.a(paramFloat1, paramFloat2, f2, f2, 270.0F, -180.0F);
        localze.b(paramFloat1 + f2 / 2.0F, paramFloat2 + f2, paramFloat1 + paramFloat3 - 1.5F * f2, paramFloat2 + f2);
        localze.k();
        localze.a(paramFloat1 + paramFloat3 - 2.0F * f2, paramFloat2, f2, f2, 90.0F, 180.0F);
      }
      else if (paramInt == 2)
      {
        localze.a(paramFloat1 + paramFloat3 - 2.0F * f2, paramFloat2, f2, f2, 180.0F, -90.0F);
        localze.a(paramFloat1 + paramFloat3 - 1.75F * f2, paramFloat2 + f2 / 2.0F, f2 / 2.0F, f2 / 2.0F, 90.0F, -180.0F);
        localze.j();
      }
      else if (paramInt == 3)
      {
        localze.a(paramFloat1 + paramFloat3 - 0.75F * f2, paramFloat2 + paramFloat4 - f2, f2 / 2.0F, f2 / 2.0F, 90.0F, 180.0F);
        localze.k();
        localze.b(paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2 + paramFloat4 - f2, paramFloat1 + paramFloat3 - f2, paramFloat2 + paramFloat4 - f2);
        localze.b(paramFloat1 + paramFloat3 - f2, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2 + paramFloat4 - f2 / 2.0F);
      }
      else
      {
        localze.a(paramFloat1 + paramFloat3 - 0.75F * f2, paramFloat2 + paramFloat4 - f2, f2 / 2.0F, f2 / 2.0F, 90.0F, 180.0F);
        localze.a(paramFloat1 + paramFloat3 - f2, paramFloat2 + paramFloat4 - f2, f2, f2, 270.0F, 270.0F);
        localze.k();
        localze.b(paramFloat1 + paramFloat3 - f2, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2 + paramFloat4 - f2 / 2.0F);
      }
      break;
    case 3: 
      if (paramInt == 0)
      {
        localze.a(paramFloat1 + paramFloat3 - 2.0F * f2, paramFloat2 + paramFloat4 - f2, f2, f2, 180.0F, -180.0F);
        localze.b(paramFloat1 + paramFloat3 - f2, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + paramFloat3 - f2, paramFloat2 + f2 / 2.0F);
        localze.a(paramFloat1 + paramFloat3 - f2, paramFloat2, f2, f2, 180.0F, 90.0F);
        localze.k();
        localze.b(paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2, paramFloat1 + 1.5F * f2, paramFloat2);
        localze.a(paramFloat1 + f2, paramFloat2, f2, f2, 270.0F, -90.0F);
        localze.b(paramFloat1 + f2, paramFloat2 + f2 / 2.0F, paramFloat1 + f2, paramFloat2 + paramFloat4 - f2);
        localze.b(paramFloat1 + f2, paramFloat2 + paramFloat4 - f2, paramFloat1 + paramFloat3 - 1.5F * f2, paramFloat2 + paramFloat4 - f2);
        localze.a(paramFloat1 + paramFloat3 - 1.75F * f2, paramFloat2 + paramFloat4 - f2, f2 / 2.0F, f2 / 2.0F, 270.0F, 180.0F);
        localze.b(paramFloat1 + paramFloat3 - 1.5F * f2, paramFloat2 + paramFloat4 - f2 / 2.0F, paramFloat1 + paramFloat3 - 2.0F * f2, paramFloat2 + paramFloat4 - f2 / 2.0F);
      }
      else if (paramInt == 1)
      {
        localze.b(paramFloat1 + paramFloat3 - 1.5F * f2, paramFloat2 + paramFloat4 - f2, paramFloat1 + f2 / 2.0F, paramFloat2 + paramFloat4 - f2);
        localze.a(paramFloat1, paramFloat2 + paramFloat4 - f2, f2, f2, 270.0F, -180.0F);
        localze.b(paramFloat1 + f2 / 2.0F, paramFloat2 + paramFloat4, paramFloat1 + paramFloat3 - 1.5F * f2, paramFloat2 + paramFloat4);
        localze.k();
        localze.a(paramFloat1 + paramFloat3 - 2.0F * f2, paramFloat2 + paramFloat4 - f2, f2, f2, 90.0F, 180.0F);
      }
      else if (paramInt == 2)
      {
        localze.a(paramFloat1 + paramFloat3 - 2.0F * f2, paramFloat2 + paramFloat4 - f2, f2, f2, 270.0F, -90.0F);
        localze.a(paramFloat1 + paramFloat3 - 1.75F * f2, paramFloat2 + paramFloat4 - f2, f2 / 2.0F, f2 / 2.0F, 90.0F, -180.0F);
        localze.j();
      }
      else if (paramInt == 3)
      {
        localze.a(paramFloat1 + paramFloat3 - 0.75F * f2, paramFloat2 + f2 / 2.0F, f2 / 2.0F, f2 / 2.0F, 270.0F, -180.0F);
        localze.k();
        localze.b(paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2 + f2, paramFloat1 + paramFloat3 - f2, paramFloat2 + f2);
        localze.b(paramFloat1 + paramFloat3 - f2, paramFloat2 + f2, paramFloat1 + paramFloat3 - f2, paramFloat2 + f2 / 2.0F);
        localze.b(paramFloat1 + paramFloat3 - f2, paramFloat2 + f2 / 2.0F, paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2 + f2 / 2.0F);
      }
      else
      {
        localze.a(paramFloat1 + paramFloat3 - 0.75F * f2, paramFloat2 + f2 / 2.0F, f2 / 2.0F, f2 / 2.0F, 270.0F, -180.0F);
        localze.a(paramFloat1 + paramFloat3 - f2, paramFloat2, f2, f2, 90.0F, -270.0F);
        localze.b(paramFloat1 + paramFloat3 - f2, paramFloat2 + f2 / 2.0F, paramFloat1 + paramFloat3 - f2 / 2.0F, paramFloat2 + f2 / 2.0F);
        localze.k();
      }
      break;
    }
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */