package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zq;

class zbnz
  extends zco
{
  zbnz(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
    switch (this.e.a)
    {
    case 1: 
      break;
    case 2: 
      zi localzi1 = new zi(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.e.G().i());
      this.a.c();
      this.a.a(localzi1);
      break;
    case 3: 
      zi localzi2 = new zi(-1.0F, 0.0F, 0.0F, -1.0F, this.e.G().h(), this.e.G().i());
      this.a.c();
      this.a.a(localzi2);
      break;
    case 4: 
      zi localzi3 = new zi(-1.0F, 0.0F, 0.0F, 1.0F, this.e.G().h(), 0.0F);
      this.a.c();
      this.a.a(localzi3);
    }
  }
  
  ze a(zq paramzq)
  {
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
    f5 = f3 * 0.28F;
    f6 = f4 * 0.26F;
    f7 = f3 * 0.28F;
    f8 = f4 * 0.28F;
    f9 = f3 * 0.4F;
    f10 = f4 * 0.36F;
    f11 = f4 * 0.66F;
    if (f7 == 0.0F)
    {
      f5 = this.e.n().f() / 4.0F;
      f8 = 0.0F;
    }
    ze localze = new ze();
    float f12 = f7 - f5 / 2.0F;
    float f13 = f1 + (f3 - f9 - f12);
    float f14 = f9 - f5;
    float f15 = f10 - f6;
    localze.a(f1, f2, f9 * 2.0F, f10 * 2.0F, 180.0F, 90.0F);
    localze.b(f1 + f9, f2, f13, f2);
    localze.a(f13 - f9, f2, 2.0F * f9, 2.0F * f10, 270.0F, 90.0F);
    localze.b(f1 + (f3 - f12), f2 + f10, f1 + (f3 - f12), f2 + (f11 - f8));
    localze.b(f1 + (f3 - f12), f2 + (f11 - f8), f1 + f3, f2 + (f11 - f8));
    localze.b(f1 + f3, f2 + (f11 - f8), f1 + (f3 - f7), f2 + f11);
    localze.b(f1 + (f3 - f7), f2 + f11, f1 + f3 - 2.0F * f7, f2 + (f11 - f8));
    localze.b(f1 + f3 - 2.0F * f7, f2 + (f11 - f8), f1 + (f3 - 2.0F * f7) + f12, f2 + (f11 - f8));
    localze.a(f13 - f14, f2 + f6, 2.0F * f14, 2.0F * f15, 0.0F, -90.0F);
    localze.a(f1 + f5, f2 + f6, 2.0F * f14, 2.0F * f15, 270.0F, -90.0F);
    localze.b(f1 + f5, f2 + f9, f1 + f5, f2 + f4);
    localze.b(f1 + f5, f2 + f4, f1, f2 + f4);
    localze.b(f1, f2 + f4, f1, f2 + f9);
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */