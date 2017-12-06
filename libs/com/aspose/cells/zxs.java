package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;

class zxs
  extends zco
{
  zxs(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.l().h();
    float f4 = this.e.l().i();
    zq localzq = new zq(f1, f2, f3, f4);
    zs localzs = zbya.a(this.e.n());
    ze localze = new ze();
    localze.a(localzq);
    zc localzc = zbya.a(this.e.m(), localze);
    if (!this.e.m().a()) {
      this.a.a(localzc, localzq);
    }
    if (!this.e.n().a())
    {
      this.a.a(localzs, f1, f2, f3, f4);
      this.a.b(localzs, f1 + f3 / 2.0F + (float)(f3 / 2.0F * Math.cos(zbks.a(45.0D))), f2 + f4 / 2.0F - (float)(f4 / 2.0F * Math.sin(zbks.a(45.0D))), f1 + f3 / 2.0F + (float)(f3 / 2.0F * Math.cos(zbks.a(225.0D))), f2 + f4 / 2.0F - (float)(f4 / 2.0F * Math.sin(zbks.a(225.0D))));
      this.a.b(localzs, f1 + f3 / 2.0F + (float)(f3 / 2.0F * Math.cos(zbks.a(135.0D))), f2 + f4 / 2.0F - (float)(f4 / 2.0F * Math.sin(zbks.a(135.0D))), f1 + f3 / 2.0F + (float)(f3 / 2.0F * Math.cos(zbks.a(315.0D))), f2 + f4 / 2.0F - (float)(f4 / 2.0F * Math.sin(zbks.a(315.0D))));
    }
    super.b();
    this.a.a(localzf);
  }
  
  void b(zq paramzq)
    throws Exception
  {
    paramzq = zbix.a(paramzq);
    super.b(paramzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */