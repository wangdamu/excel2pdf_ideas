package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;

class zyf
  extends zcp
{
  zyf(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    zq localzq = new zq(f1, f2, f3, f4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    ze localze1 = new ze();
    localze1.b(localzq);
    zc localzc = zbyb.a(this.e.z(), localze1);
    zs localzs = zbyb.a(this.e.A());
    if (!this.e.z().a())
    {
      this.a.a(localzc, f1 + 2.0F * f3 / 3.0F, f2, f3 / 3.0F, f4);
      ze localze2 = new ze();
      localze2.a(f1 + 2.0F * f3 / 3.0F, f2, f3 / 3.0F, f4, 90.0F, 180.0F);
      localze2.b(f1 + 5.0F * f3 / 6.0F, f2 + f4, f1 + f3 / 6.0F, f2 + f4);
      localze2.a(f1, f2, f3 / 3.0F, f4, 90.0F, 180.0F);
      localze2.b(f1 + f3 / 6.0F, f2, f1 + 5.0F * f3 / 6.0F, f2);
      localze2.j();
      this.a.a(localzc, localze2);
    }
    if (!this.e.A().a())
    {
      this.a.a(localzs, f1 + 2.0F * f3 / 3.0F, f2, f3 / 3.0F, f4);
      this.a.a(localzs, f1 + 2.0F * f3 / 3.0F, f2, f3 / 3.0F, f4, 90.0F, 180.0F);
      this.a.b(localzs, f1 + 5.0F * f3 / 6.0F, f2 + f4, f1 + f3 / 6.0F, f2 + f4);
      this.a.a(localzs, f1, f2, f3 / 3.0F, f4, 90.0F, 180.0F);
      this.a.b(localzs, f1 + f3 / 6.0F, f2, f1 + 5.0F * f3 / 6.0F, f2);
    }
    super.a();
    this.a.a(localzf);
  }
  
  void c(zq paramzq)
    throws Exception
  {
    paramzq = d(paramzq);
    super.c(paramzq);
  }
  
  private zq d(zq paramzq)
  {
    float f1 = paramzq.f() + paramzq.h() / 6.0F;
    float f2 = paramzq.g();
    zq localzq = new zq(f1, f2, paramzq.h() / 2.0F, paramzq.i());
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zyf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */