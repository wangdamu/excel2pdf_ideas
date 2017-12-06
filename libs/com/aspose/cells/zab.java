package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zab
  extends zcp
{
  zab(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F * this.e.s();
        f6 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F * this.e.t();
        f7 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F * this.e.s();
        f8 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F * this.e.t();
        f9 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(5)) / 100000.0F * this.e.s();
        f10 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(4)) / 100000.0F * this.e.t();
        f11 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(7)) / 100000.0F * this.e.s();
        f12 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(6)) / 100000.0F * this.e.t();
      }
      else
      {
        f5 = -0.08333F * this.e.s();
        f6 = 0.1875F * this.e.t();
        f7 = -0.16667F * this.e.s();
        f8 = 0.1875F * this.e.t();
        f9 = -0.16667F * this.e.s();
        f10 = 1.0F * this.e.t();
        f11 = -0.08918F * this.e.s();
        f12 = 1.12963F * this.e.t();
      }
    }
    else
    {
      f5 = -0.08333F * this.e.s();
      f6 = 0.1875F * this.e.t();
      f7 = -0.16667F * this.e.s();
      f8 = 0.1875F * this.e.t();
      f9 = -0.16667F * this.e.s();
      f10 = 1.0F * this.e.t();
      f11 = -0.08918F * this.e.s();
      f12 = 1.12963F * this.e.t();
    }
    float f13 = f9 > (f5 > f7 ? f7 : f5) ? f5 : f5 > f7 ? f7 : f9;
    f13 = f11 > f13 ? f13 : f11;
    float f14 = f9 < (f5 < f7 ? f7 : f5) ? f5 : f5 < f7 ? f7 : f9;
    f14 = f11 < f14 ? f14 : f11;
    float f15 = f10 > (f6 > f8 ? f8 : f6) ? f6 : f6 > f8 ? f8 : f10;
    f15 = f12 > f15 ? f15 : f12;
    float f16 = f10 < (f6 < f8 ? f8 : f6) ? f6 : f6 < f8 ? f8 : f10;
    f16 = f12 < f16 ? f16 : f12;
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
      f5 = -f5 + f3;
      f7 = -f7 + f3;
      f9 = -f9 + f3;
      f11 = -f11 + f3;
      f17 = f18;
    }
    if (this.e.U())
    {
      f6 = -f6 + f4;
      f8 = -f8 + f4;
      f10 = -f10 + f4;
      f12 = -f12 + f4;
      f19 = f20;
    }
    zq localzq = new zq(f1 + f17, f2 + f19, f3, f4);
    localze.b(localzq);
    localze.b(f1 + f5 + f17, f2 + f6 + f19, f1 + f7 + f17, f2 + f8 + f19);
    localze.k();
    localze.b(f1 + f7 + f17, f2 + f8 + f19, f1 + f9 + f17, f2 + f10 + f19);
    localze.k();
    localze.b(f1 + f9 + f17, f2 + f10 + f19, f1 + f11 + f17, f2 + f12 + f19);
    localze.k();
    localze.b(f1 + f5 + f17, f2 + f2 + f19, f1 + f5 + f17, f2 + f4 + f19);
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
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    if (this.e.n != null)
    {
      f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F * this.e.s();
      f6 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F * this.e.t();
      f7 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F * this.e.s();
      f8 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F * this.e.t();
      f9 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(5)) / 100000.0F * this.e.s();
      f10 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(4)) / 100000.0F * this.e.t();
      f11 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(7)) / 100000.0F * this.e.s();
      f12 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(6)) / 100000.0F * this.e.t();
    }
    else
    {
      f5 = -0.08333F * this.e.s();
      f6 = 0.1875F * this.e.t();
      f7 = -0.16667F * this.e.s();
      f8 = 0.1875F * this.e.t();
      f9 = -0.16667F * this.e.s();
      f10 = 1.0F * this.e.t();
      f11 = -0.08918F * this.e.s();
      f12 = 1.12963F * this.e.t();
    }
    float f13 = f9 > (f5 > f7 ? f7 : f5) ? f5 : f5 > f7 ? f7 : f9;
    f13 = f11 > f13 ? f13 : f11;
    float f14 = f9 < (f5 < f7 ? f7 : f5) ? f5 : f5 < f7 ? f7 : f9;
    f14 = f11 < f14 ? f14 : f11;
    float f15 = f10 > (f6 > f8 ? f8 : f6) ? f6 : f6 > f8 ? f8 : f10;
    f15 = f12 > f15 ? f15 : f12;
    float f16 = f10 < (f6 < f8 ? f8 : f6) ? f6 : f6 < f8 ? f8 : f10;
    f16 = f12 < f16 ? f16 : f12;
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
      f5 = -f5 + f3;
      f7 = -f7 + f3;
      f9 = -f9 + f3;
      f11 = -f11 + f3;
      f17 = f18;
    }
    if (this.e.U())
    {
      f6 = -f6 + f4;
      f8 = -f8 + f4;
      f10 = -f10 + f4;
      f12 = -f12 + f4;
      f19 = f20;
    }
    zq localzq = new zq(f1 + f17, f2 + f19, f3, f4);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */