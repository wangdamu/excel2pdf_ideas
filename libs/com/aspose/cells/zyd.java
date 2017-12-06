package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zq;

class zyd
  extends zcp
{
  zyd(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
      localze.b(f1, f2, f1 + 0.5F * f3, f2);
      localze.a(f1, f2, f3, f4, 270.0F, 180.0F);
      localze.b(f1 + f3 / 2.0F, f2 + f4, f1, f2 + f4);
      localze.b(f1, f2 + f4, f1, f2);
      break;
    case 3: 
    case 4: 
      localze.a(f1, f2, f3, f4, 90.0F, 180.0F);
      localze.b(f1 + f3 / 2.0F, f2, f1 + f3, f2);
      localze.b(f1 + f3, f2, f1 + f3, f2 + f4);
      localze.b(f1 + f3, f2 + f4, f1 + f3 / 2.0F, f2 + f4);
    }
    localze.j();
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
    zq localzq1 = zbiy.a(paramzq);
    float f1 = localzq1.f() - paramzq.f();
    float f2 = localzq1.g() - paramzq.g();
    float f3 = paramzq.f();
    float f4 = paramzq.g() + f2;
    zq localzq2 = new zq(f3, f4, paramzq.h() - f1, paramzq.i() - 2.0F * f2);
    return localzq2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zyd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */