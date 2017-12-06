package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;

class zyn
  extends zco
{
  zyn(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.l().h();
    float f4 = this.e.l().i();
    zq localzq = new zq(f1, f2, f3, f4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    ze localze1 = new ze();
    localze1.b(localzq);
    zc localzc = zbya.a(this.e.m(), localze1);
    zs localzs = zbya.a(this.e.n());
    if (!this.e.m().a())
    {
      this.a.a(localzc, f1, f2, f3, f4 / 3.0F);
      ze localze2 = new ze();
      localze2.a(f1, f2, f3, f4 / 3.0F, 0.0F, 180.0F);
      localze2.b(f1, f2 + f4 / 6.0F, f1, f2 + 5.0F * f4 / 6.0F);
      localze2.a(f1, f2 + 2.0F * f4 / 3.0F, f3, f4 / 3.0F, 180.0F, -180.0F);
      localze2.b(f1 + f3, f2 + 5.0F * f4 / 6.0F, f1 + f3, f2 + f4 / 6.0F);
      localze2.j();
      this.a.a(localzc, localze2);
    }
    if (!this.e.n().a())
    {
      this.a.a(localzs, f1, f2, f3, f4 / 3.0F);
      this.a.a(localzs, f1, f2, f3, f4 / 3.0F, 0.0F, 180.0F);
      this.a.b(localzs, f1, f2 + f4 / 6.0F, f1, f2 + 5.0F * f4 / 6.0F);
      this.a.a(localzs, f1, f2 + 2.0F * f4 / 3.0F, f3, f4 / 3.0F, 180.0F, -180.0F);
      this.a.b(localzs, f1 + f3, f2 + 5.0F * f4 / 6.0F, f1 + f3, f2 + f4 / 6.0F);
    }
    super.b();
    this.a.a(localzf);
  }
  
  void b(zq paramzq)
    throws Exception
  {
    paramzq = c(paramzq);
    super.b(paramzq);
  }
  
  private zq c(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g() + 2.0F * paramzq.i() / 6.0F;
    zq localzq = new zq(f1, f2, paramzq.h(), paramzq.i() * 3.0F / 6.0F);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zyn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */