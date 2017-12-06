package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;

class zbin
  extends zcp
{
  zbin(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    zq localzq = new zq(f1, f2, f3, f4);
    zs localzs = zbyb.a(this.e.A());
    ze localze = new ze();
    localze.b(localzq);
    zc localzc = zbyb.a(this.e.z(), localze);
    if (!this.e.z().a()) {
      this.a.a(localzc, localzq);
    }
    if (!this.e.A().a())
    {
      this.a.a(localzs, f1, f2, f3, f4);
      this.a.b(localzs, f1 + f3 / 2.0F + (float)(f3 / 2.0F * Math.cos(zbkt.a(45.0D))), f2 + f4 / 2.0F - (float)(f4 / 2.0F * Math.sin(zbkt.a(45.0D))), f1 + f3 / 2.0F + (float)(f3 / 2.0F * Math.cos(zbkt.a(225.0D))), f2 + f4 / 2.0F - (float)(f4 / 2.0F * Math.sin(zbkt.a(225.0D))));
      this.a.b(localzs, f1 + f3 / 2.0F + (float)(f3 / 2.0F * Math.cos(zbkt.a(135.0D))), f2 + f4 / 2.0F - (float)(f4 / 2.0F * Math.sin(zbkt.a(135.0D))), f1 + f3 / 2.0F + (float)(f3 / 2.0F * Math.cos(zbkt.a(315.0D))), f2 + f4 / 2.0F - (float)(f4 / 2.0F * Math.sin(zbkt.a(315.0D))));
    }
    super.a();
    this.a.a(localzf);
  }
  
  void c(zq paramzq)
    throws Exception
  {
    paramzq = zbiy.a(paramzq);
    super.c(paramzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */