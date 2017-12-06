package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zanl
  extends zcp
{
  zanl(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    float f1 = this.e.u();
    float f2 = this.e.v();
    float f3 = this.e.s();
    float f4 = this.e.t();
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(5)) / 100000.0F * this.e.s();
        f6 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(4)) / 100000.0F * this.e.t();
        f7 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F * this.e.s();
        f8 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F * this.e.t();
        f9 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F * this.e.s();
        f10 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F * this.e.t();
      }
      else
      {
        f5 = -0.46667F * this.e.s();
        f6 = 1.125F * this.e.t();
        f7 = -0.08333F * this.e.s();
        f8 = 0.1875F * this.e.t();
        f9 = -0.16667F * this.e.s();
        f10 = 0.1875F * this.e.t();
      }
    }
    else
    {
      f5 = -0.46667F * this.e.s();
      f6 = 1.125F * this.e.t();
      f7 = -0.08333F * this.e.s();
      f8 = 0.1875F * this.e.t();
      f9 = -0.16667F * this.e.s();
      f10 = 0.1875F * this.e.t();
    }
    float f11 = f9 > (f5 > f7 ? f7 : f5) ? f5 : f5 > f7 ? f7 : f9;
    float f12 = f9 < (f5 < f7 ? f7 : f5) ? f5 : f5 < f7 ? f7 : f9;
    float f13 = f10 > (f6 > f8 ? f8 : f6) ? f6 : f6 > f8 ? f8 : f10;
    float f14 = f10 < (f6 < f8 ? f8 : f6) ? f6 : f6 < f8 ? f8 : f10;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    if (f11 < 0.0F)
    {
      f15 = -f11;
      f19 = f11;
    }
    if (f12 > f3) {
      f16 = f12 - f3;
    }
    if (f14 > f4) {
      f18 = f14 - f4;
    }
    if (f13 < 0.0F)
    {
      f17 = -f13;
      f20 = f13;
    }
    if (!this.e.f)
    {
      f19 = 0.0F;
      f20 = 0.0F;
    }
    zq localzq = new zq(f1 + f15 + f19, f2 + f17 + f20, f3, f4);
    com.aspose.cells.b.a.b.a.ze localze2 = new com.aspose.cells.b.a.b.a.ze();
    localze2.b(localzq);
    zc localzc = zbyb.a(this.e.z(), localze2);
    zs localzs = zbyb.a(this.e.A());
    if (!this.e.z().a())
    {
      localze1.b(localzq);
      this.a.a(localzc, localze1);
    }
    this.a.b(localzs, f1 + f5 + f15 + f19, f2 + f6 + f17 + f20, f1 + f9 + f15 + f19, f2 + f10 + f17 + f20);
    this.a.b(localzs, f1 + f9 + f15 + f19, f2 + f10 + f17 + f20, f1 + f7 + f15 + f19, f2 + f8 + f17 + f20);
    c(localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zanl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */