package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zann
  extends zcp
{
  zann(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F * this.e.t();
        f6 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F * this.e.s();
        f7 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F * this.e.t();
        f8 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F * this.e.s();
      }
      else
      {
        f5 = 0.1875F * this.e.t();
        f6 = -0.08333F * this.e.s();
        f7 = 1.125F * this.e.t();
        f8 = -0.38333F * this.e.s();
      }
    }
    else
    {
      f5 = 0.1875F * this.e.t();
      f6 = -0.08333F * this.e.s();
      f7 = 1.125F * this.e.t();
      f8 = -0.38333F * this.e.s();
    }
    float f9 = f6;
    float f10 = f8;
    float f11 = f5;
    float f12 = f7;
    float f13 = f9 > f10 ? f10 : f9;
    float f14 = f9 < f10 ? f10 : f9;
    float f15 = f11 > f12 ? f12 : f11;
    float f16 = f11 < f12 ? f12 : f11;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    if (f13 < 0.0F) {
      f17 = -f13;
    }
    if (f14 > f3) {
      f18 = f14 - f3;
    }
    if (f16 > f4) {
      f20 = f16 - f4;
    }
    if (f15 < 0.0F) {
      f19 = -f15;
    }
    if (this.e.V())
    {
      f9 = -f9 + f3;
      f10 = -f10 + f3;
      f17 = f18;
    }
    if (this.e.U())
    {
      f11 = -f11 + f4;
      f12 = -f12 + f4;
      f19 = f20;
    }
    zq localzq;
    if (this.e.f)
    {
      localzq = new zq(f1, f2, f3, f4);
      localze.b(localzq);
      localze.b(f1 + f9, f2 + f11, f1 + f10, f2 + f12);
      localze.k();
      localze.b(f1 + f9, f2 + f11, f1 + f10, f2 + f12);
    }
    else
    {
      localzq = new zq(f1 + f17, f2 + f19, f3, f4);
      localze.b(localzq);
      localze.b(f1 + f9 + f17, f2 + f11 + f19, f1 + f10 + f17, f2 + f12 + f19);
      localze.k();
      localze.b(f1 + f9 + f17, f2 + f11 + f19, f1 + f10 + f17, f2 + f12 + f19);
    }
    return localze;
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
      f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F * this.e.t();
      f6 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F * this.e.s();
      f7 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F * this.e.t();
      f8 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F * this.e.s();
    }
    else
    {
      f5 = 0.1875F * this.e.t();
      f6 = -0.08333F * this.e.s();
      f7 = 1.125F * this.e.t();
      f8 = -0.38333F * this.e.s();
    }
    float f9 = f6;
    float f10 = f8;
    float f11 = f5;
    float f12 = f7;
    float f13 = f9 > f10 ? f10 : f9;
    float f14 = f9 < f10 ? f10 : f9;
    float f15 = f11 > f12 ? f12 : f11;
    float f16 = f11 < f12 ? f12 : f11;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    if (f13 < 0.0F) {
      f17 = -f13;
    }
    if (f14 > f3) {
      f18 = f14 - f3;
    }
    if (f16 > f4) {
      f20 = f16 - f4;
    }
    if (f15 < 0.0F) {
      f19 = -f15;
    }
    if (this.e.V())
    {
      f9 = -f9 + f3;
      f10 = -f10 + f3;
      f17 = f18;
    }
    if (this.e.U())
    {
      f11 = -f11 + f4;
      f12 = -f12 + f4;
      f19 = f20;
    }
    zq localzq = new zq();
    if (this.e.f) {
      localzq = new zq(f1, f2, f3, f4);
    } else {
      localzq = new zq(f1 + f17, f2 + f19, f3, f4);
    }
    if (!this.e.A().a()) {
      localzq.a(-(this.e.A().h() / 2.0F), -(this.e.A().h() / 2.0F));
    }
    float f21 = zbyb.a(this.e.B());
    if ((this.e.E() == 7) || (this.e.E() == 9)) {
      localzq.a(localzq.f() + f21);
    } else if ((this.e.E() == 0) || (this.e.E() == 8)) {
      localzq.c(localzq.h() - f21);
    }
    if (this.e.K().equals("\n")) {
      return;
    }
    zbyb.b(this.a, this.e, localzq, this.e.K(), this.e.H(), this.e.B(), this.e.C(), this.e.E(), this.e.F(), this.e.G());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zann.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */