package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zaa
  extends zcp
{
  zaa(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    if (f11 < 0.0F) {
      f15 = -f11;
    }
    if (f13 < 0.0F) {
      f17 = -f13;
    }
    if (f12 > f3) {
      f16 = f12 - f3;
    }
    if (f14 > f4) {
      f18 = f14 - f4;
    }
    if (this.e.V())
    {
      f5 = -f5 + f3;
      f7 = -f7 + f3;
      f9 = -f9 + f3;
      f15 = f16;
    }
    if (this.e.U())
    {
      f6 = -f6 + f4;
      f8 = -f8 + f4;
      f10 = -f10 + f4;
      f17 = f18;
    }
    zq localzq = new zq(f1 + f15, f2 + f17, f3, f4);
    localze.b(localzq);
    localze.b(f1 + f5 + f15, f2 + f6 + f17, f1 + f9 + f15, f2 + f10 + f17);
    localze.k();
    localze.b(f1 + f9 + f15, f2 + f10 + f17, f1 + f7 + f15, f2 + f8 + f17);
    localze.k();
    localze.b(f1 + f7 + f15, f2 + f1 + f17, f1 + f7 + f15, f2 + f4 + f17);
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
    if (this.e.n != null)
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
    float f11 = f9 > (f5 > f7 ? f7 : f5) ? f5 : f5 > f7 ? f7 : f9;
    float f12 = f9 < (f5 < f7 ? f7 : f5) ? f5 : f5 < f7 ? f7 : f9;
    float f13 = f10 > (f6 > f8 ? f8 : f6) ? f6 : f6 > f8 ? f8 : f10;
    float f14 = f10 < (f6 < f8 ? f8 : f6) ? f6 : f6 < f8 ? f8 : f10;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    if (f11 < 0.0F) {
      f15 = -f11;
    }
    if (f13 < 0.0F) {
      f17 = -f13;
    }
    if (f12 > f3) {
      f16 = f12 - f3;
    }
    if (f14 > f4) {
      f18 = f14 - f4;
    }
    if (this.e.V())
    {
      f5 = -f5 + f3;
      f7 = -f7 + f3;
      f9 = -f9 + f3;
      f15 = f16;
    }
    if (this.e.U())
    {
      f6 = -f6 + f4;
      f8 = -f8 + f4;
      f10 = -f10 + f4;
      f17 = f18;
    }
    zq localzq = new zq(f1 + f15, f2 + f17, f3, f4);
    if (!this.e.A().a()) {
      localzq.a(-(this.e.A().h() / 2.0F), -(this.e.A().h() / 2.0F));
    }
    float f19 = zbyb.a(this.e.B());
    if ((this.e.E() == 7) || (this.e.E() == 9)) {
      localzq.a(localzq.f() + f19);
    } else if ((this.e.E() == 0) || (this.e.E() == 8)) {
      localzq.c(localzq.h() - f19);
    }
    if (this.e.K().equals("\n")) {
      return;
    }
    zbyb.b(this.a, this.e, localzq, this.e.K(), this.e.H(), this.e.B(), this.e.C(), this.e.E(), this.e.F(), this.e.G());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */