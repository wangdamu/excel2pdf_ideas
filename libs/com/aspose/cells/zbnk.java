package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbnk
  extends zcp
{
  zbnk(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    zq localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(localzq);
    zc localzc = zbyb.a(this.e.z(), localze);
    zs localzs = zbyb.a(this.e.A());
    this.a.a(localzc, localzq);
    this.a.a(localzs, localzq);
    Color localColor = this.e.z().b();
    this.a.a(localzc, this.e.u() + this.e.y().h() * 0.3F + this.f, this.e.v() + this.e.y().i() * 0.3F + this.f, this.e.y().h() * 0.1F, this.e.y().i() * 0.1F);
    this.a.a(localzs, this.e.u() + this.e.y().h() * 0.3F + this.f, this.e.v() + this.e.y().i() * 0.3F + this.f, this.e.y().h() * 0.1F, this.e.y().i() * 0.1F);
    this.a.a(localzc, this.e.u() + this.e.y().h() * 0.6F + this.f, this.e.v() + this.e.y().i() * 0.3F + this.f, this.e.y().h() * 0.1F, this.e.y().i() * 0.1F);
    this.a.a(localzs, this.e.u() + this.e.y().h() * 0.6F + this.f, this.e.v() + this.e.y().i() * 0.3F + this.f, this.e.y().h() * 0.1F, this.e.y().i() * 0.1F);
    float f1 = 2.0F * this.e.y().h() / 9.0F;
    float f2 = 7.0F * this.e.y().i() / 10.0F;
    float f3 = 5.0F * this.e.y().h() / 9.0F;
    float f4 = 1.0F * this.e.y().i() / 10.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 10000.0F * f4;
      } else {
        f5 = 0.5F * f4;
      }
    }
    else {
      f5 = 0.5F * f4;
    }
    float f8 = Math.abs(f5);
    if (f8 != 0.0F)
    {
      f6 = (16.0F * f8 * f8 + f3 * f3) / 16.0F / f8;
      f7 = com.aspose.cells.b.a.ze.a(Double.valueOf(180.0D * Math.asin(f3 / 2.0F / f6) / 3.141592653589793D));
    }
    if (f5 < 0.0F) {
      this.a.a(localzs, f1 + f3 / 2.0F - f6 + this.f + this.e.u(), f2 + f4 / 2.0F - f8 + this.f + this.e.v(), 2.0F * f6, 2.0F * f6, 270.0F - f7, 2.0F * f7);
    } else if (f5 > 0.0F) {
      this.a.a(localzs, f1 + f3 / 2.0F - f6 + this.f + this.e.u(), f2 + f4 / 2.0F + f8 - 2.0F * f6 + this.f + this.e.v(), 2.0F * f6, 2.0F * f6, 90.0F - f7, 2.0F * f7);
    } else {
      this.a.b(localzs, f1 + this.f, f2 + f4 / 2.0F + this.f + this.e.v(), f1 + f3 + this.f + this.e.u(), f2 + f4 / 2.0F + this.f + this.e.v());
    }
    super.a();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */