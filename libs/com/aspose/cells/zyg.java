package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zq;

class zyg
  extends zco
{
  zyg(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    ze localze = new ze();
    switch (this.e.a)
    {
    case 1: 
    case 2: 
      localze.a(f1 + 2.0F * f3 / 3.0F, f2, f3 / 3.0F, f4, 270.0F, 180.0F);
      localze.b(f1 + 5.0F * f3 / 6.0F, f2 + f4, f1 + f3 / 6.0F, f2 + f4);
      localze.b(f1 + f3 / 6.0F, f2 + f4, f1, f2 + f4 / 2.0F);
      localze.b(f1, f2 + f4 / 2.0F, f1 + f3 / 6.0F, f2);
      localze.b(f1 + f3 / 6.0F, f2, 5.0F * f3 / 6.0F, f2);
      break;
    case 3: 
    case 4: 
      localze.a(f1, f2, f3 / 3.0F, f4, 90.0F, 180.0F);
      localze.b(f1 + f3 / 6.0F, f2, f1 + 5.0F * f3 / 6.0F, f2);
      localze.b(f1 + 5.0F * f3 / 6.0F, f2, f1 + f3, f2 + f4 / 2.0F);
      localze.b(f1 + f3, f2 + f4 / 2.0F, f1 + 5.0F * f3 / 6.0F, f2 + f4);
      localze.b(f1 + 5.0F * f3 / 6.0F, f2 + f4, f3 / 6.0F, f2 + f4);
    }
    localze.j();
    return localze;
  }
  
  void b(zq paramzq)
    throws Exception
  {
    paramzq = c(paramzq);
    super.b(paramzq);
  }
  
  private zq c(zq paramzq)
  {
    float f1 = paramzq.f() + paramzq.h() / 6.0F;
    float f2 = paramzq.g();
    zq localzq = new zq(f1, f2, 2.0F * paramzq.h() / 3.0F, paramzq.i());
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zyg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */