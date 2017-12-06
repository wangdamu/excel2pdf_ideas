package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbnj
  extends zco
{
  zbnj(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    zq localzq = new zq(this.c, this.d, this.e.l().h(), this.e.l().i());
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    localze1.a(localzq);
    zc localzc1 = zbya.a(this.e.m(), localze1);
    zs localzs = zbya.a(this.e.n());
    this.a.a(localzc1, localzq);
    this.a.a(zbya.a(this.e.n()), localzq);
    com.aspose.cells.b.a.b.a.ze localze2 = new com.aspose.cells.b.a.b.a.ze();
    localze2.a(this.e.h() + this.e.l().h() * 0.3F + this.f, this.e.i() + this.e.l().i() * 0.3F + this.f, this.e.l().h() * 0.1F, this.e.l().i() * 0.1F);
    zc localzc2 = null;
    if (this.e.m().d()) {
      localzc2 = zbya.a(this.e.m(), localze2, 0.8F, 0.0F);
    } else {
      localzc2 = zbya.a(this.e.m(), localzq, 0.8F, 0.0F);
    }
    this.a.a(localzc2, this.e.h() + this.e.l().h() * 0.3F + this.f, this.e.i() + this.e.l().i() * 0.3F + this.f, this.e.l().h() * 0.1F, this.e.l().i() * 0.1F);
    this.a.a(localzs, this.e.h() + this.e.l().h() * 0.3F + this.f, this.e.i() + this.e.l().i() * 0.3F + this.f, this.e.l().h() * 0.1F, this.e.l().i() * 0.1F);
    com.aspose.cells.b.a.b.a.ze localze3 = new com.aspose.cells.b.a.b.a.ze();
    localze3.a(this.e.h() + this.e.l().h() * 0.6F + this.f, this.e.i() + this.e.l().i() * 0.3F + this.f, this.e.l().h() * 0.1F, this.e.l().i() * 0.1F);
    zc localzc3 = null;
    if (this.e.m().d()) {
      localzc3 = zbya.a(this.e.m(), localze3, 0.8F, 0.0F);
    } else {
      localzc3 = zbya.a(this.e.m(), localzq, 0.8F, 0.0F);
    }
    this.a.a(localzc3, this.e.h() + this.e.l().h() * 0.6F + this.f, this.e.i() + this.e.l().i() * 0.3F + this.f, this.e.l().h() * 0.1F, this.e.l().i() * 0.1F);
    this.a.a(localzs, this.e.h() + this.e.l().h() * 0.6F + this.f, this.e.i() + this.e.l().i() * 0.3F + this.f, this.e.l().h() * 0.1F, this.e.l().i() * 0.1F);
    float f1 = 2.0F * this.e.l().h() / 9.0F;
    float f2 = 7.0F * this.e.l().i() / 10.0F;
    float f3 = 5.0F * this.e.l().h() / 9.0F;
    float f4 = 1.0F * this.e.l().i() / 10.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    if (this.e.l.a.size() > 0)
    {
      f8 = com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
      if (f8 < 16473.0F) {
        f5 = -((16473.0F - f8) / 1888.0F) * f4;
      } else if (f8 == 16473.0F) {
        f5 = 0.0F;
      } else {
        f5 = (f8 - 16473.0F) / 1888.0F * f4;
      }
    }
    else
    {
      f5 = 0.5F * f4;
    }
    float f8 = Math.abs(f5);
    if (f8 != 0.0F)
    {
      f6 = (16.0F * f8 * f8 + f3 * f3) / 16.0F / f8;
      f7 = com.aspose.cells.b.a.ze.a(Double.valueOf(180.0D * Math.asin(f3 / 2.0F / f6) / 3.141592653589793D));
    }
    if (f5 < 0.0F) {
      this.a.a(localzs, f1 + f3 / 2.0F - f6 + this.f + this.e.h(), f2 + f4 / 2.0F - f8 + this.f + this.e.i(), 2.0F * f6, 2.0F * f6, 270.0F - f7, 2.0F * f7);
    } else if (f5 > 0.0F) {
      this.a.a(localzs, f1 + f3 / 2.0F - f6 + this.f + this.e.h(), f2 + f4 / 2.0F + f8 - 2.0F * f6 + this.f + this.e.i(), 2.0F * f6, 2.0F * f6, 90.0F - f7, 2.0F * f7);
    } else {
      this.a.b(localzs, f1 + this.f, f2 + f4 / 2.0F + this.f + this.e.i(), f1 + f3 + this.f + this.e.h(), f2 + f4 / 2.0F + this.f + this.e.i());
    }
    super.b();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */