package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zq;

class zzl
  extends zcp
{
  zzl(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    ze localze = new ze();
    switch (this.e.c)
    {
    case 1: 
    case 2: 
      localze.a(f1, f2, 0.3F * f3, f4, 90.0F, 180.0F);
      localze.b(f1 + 0.15F * f3, f2, f1 + 0.85F * f3, f2);
      localze.a(f1 + 0.85F * f3, f2, 0.3F * f3, f4, 270.0F, -180.0F);
      localze.b(f1 + 0.85F * f3, f2 + f4, f1 + 0.15F * f3, f2 + f4);
      break;
    case 3: 
    case 4: 
      localze.b(f1, f2, f1 + 0.15F * f3, f2);
      localze.a(f1 + paramzq.h() * 0.7F, f2, 0.3F * f3, f4, 270.0F, 180.0F);
      localze.b(f1 + 0.85F * f3, f2 + f4, f1, f2 + f4);
      localze.a(f1 - 0.15F * f3, f2, 0.3F * f3, f4, 90.0F, -180.0F);
    }
    return localze;
  }
  
  void c(zq paramzq)
    throws Exception
  {
    paramzq = d(paramzq);
    super.c(paramzq);
  }
  
  private zq d(zq paramzq)
  {
    float f1 = paramzq.f() + paramzq.h() / 6.0F;
    float f2 = paramzq.g();
    zq localzq = new zq(f1, f2, paramzq.h() * 2.0F / 3.0F, paramzq.i());
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */