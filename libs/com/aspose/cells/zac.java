package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zac
  extends zcp
{
  zac(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
    switch (this.e.c)
    {
    case 1: 
      break;
    case 2: 
      zi localzi1 = new zi(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.e.W().i());
      this.a.c();
      this.a.a(localzi1);
      break;
    case 3: 
      zi localzi2 = new zi(-1.0F, 0.0F, 0.0F, -1.0F, this.e.W().h(), this.e.W().i());
      this.a.c();
      this.a.a(localzi2);
      break;
    case 4: 
      zi localzi3 = new zi(-1.0F, 0.0F, 0.0F, 1.0F, this.e.W().h(), 0.0F);
      this.a.c();
      this.a.a(localzi3);
    }
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
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F * this.e.s();
        f6 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F * this.e.s();
        f7 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F * this.e.t();
        f8 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F * this.e.t();
      }
      else
      {
        f5 = -0.08333F * this.e.s();
        f6 = -0.38333F * this.e.s();
        f7 = 0.1875F * this.e.t();
        f8 = 1.125F * this.e.t();
      }
    }
    else
    {
      f5 = -0.08333F * this.e.s();
      f6 = -0.38333F * this.e.s();
      f7 = 0.1875F * this.e.t();
      f8 = 1.125F * this.e.t();
    }
    float f9 = f5 > f6 ? f6 : f5;
    float f10 = f5 < f6 ? f6 : f5;
    float f11 = f7 > f8 ? f8 : f7;
    float f12 = f7 < f8 ? f8 : f7;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    if (f9 < 0.0F) {
      f13 = -f9;
    }
    if (f10 > f3) {
      f14 = f10 - f3;
    }
    if (f12 > f4) {
      f16 = f12 - f4;
    }
    if (f11 < 0.0F) {
      f15 = -f11;
    }
    if (this.e.V())
    {
      f5 = -f5 + f3;
      f6 = -f6 + f3;
      f13 = f14;
    }
    if (this.e.U())
    {
      f7 = -f7 + f4;
      f8 = -f8 + f4;
      f15 = f16;
    }
    zq localzq = new zq(f1 + f13, f2 + f15, f3, f4);
    com.aspose.cells.b.a.b.a.ze localze2 = new com.aspose.cells.b.a.b.a.ze();
    localze2.b(localzq);
    zc localzc = zbyb.a(this.e.z(), localze2);
    zs localzs = zbyb.a(this.e.A());
    if (!this.e.z().a())
    {
      localze1.b(localzq);
      this.a.a(localzc, localze1);
    }
    this.a.b(localzs, f1 + f5 + f13, f2 + f7 + f15, f1 + f6 + f13, f2 + f8 + f15);
    this.a.b(localzs, f1 + f5 + f13, f2 + f15, f1 + f5 + f13, f2 + f4 + f15);
    a();
  }
  
  void a()
    throws Exception
  {
    float f1 = this.e.u();
    float f2 = this.e.v();
    float f3 = this.e.s();
    float f4 = this.e.t();
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    if (this.e.n != null)
    {
      f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F * this.e.s();
      f6 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F * this.e.s();
      f7 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F * this.e.t();
      f8 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F * this.e.t();
    }
    else
    {
      f5 = -0.08333F * this.e.s();
      f6 = -0.38333F * this.e.s();
      f7 = 0.1875F * this.e.t();
      f8 = 1.125F * this.e.t();
    }
    float f9 = f5 > f6 ? f6 : f5;
    float f10 = f5 < f6 ? f6 : f5;
    float f11 = f7 > f8 ? f8 : f7;
    float f12 = f7 < f8 ? f8 : f7;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    if (f9 < 0.0F) {
      f13 = -f9;
    }
    if (f10 > f3) {
      f14 = f10 - f3;
    }
    if (f12 > f4) {
      f16 = f12 - f4;
    }
    if (f11 < 0.0F) {
      f15 = -f11;
    }
    if (this.e.V())
    {
      f5 = -f5 + f3;
      f6 = -f6 + f3;
      f13 = f14;
    }
    if (this.e.U())
    {
      f7 = -f7 + f4;
      f8 = -f8 + f4;
      f15 = f16;
    }
    zq localzq = new zq(f1 + f13, f2 + f15, f3, f4);
    c(localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */