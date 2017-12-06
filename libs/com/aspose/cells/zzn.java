package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zq;

class zzn
  extends zcp
{
  zzn(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    localze.a(f1 + 0.7F * f3, f2, 0.3F * f3, f4, 270.0F, 180.0F);
    localze.b(f1 + 0.85F * f3, f2 + f4, f1 + 0.15F * f3, f2 + f4);
    localze.a(f1, f2, 0.3F * f3, f4, 90.0F, 180.0F);
    localze.b(f1 + 0.15F * f3, f2, f1 + 0.85F * f3, f2);
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
    zq localzq1 = new zq(paramzq.f(), paramzq.g(), paramzq.h() * 0.3F, paramzq.i());
    zq localzq2 = zbiy.a(localzq1);
    float f1 = localzq2.f() - paramzq.f();
    float f2 = localzq2.g() - paramzq.g();
    float f3 = localzq2.f();
    float f4 = localzq2.g();
    zq localzq3 = new zq(f3, f4, paramzq.h() - 2.0F * f1, paramzq.i() - 2.0F * f2);
    return localzq3;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */