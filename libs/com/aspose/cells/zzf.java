package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zq;

class zzf
  extends zcp
{
  zzf(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    case 3: 
      localze.a(f1, f2, 0.5F * f3, 0.2F * f4, 180.0F, -180.0F);
      localze.a(f1 + 0.5F * f3, f2, 0.5F * f3, 0.2F * f4, 180.0F, 180.0F);
      localze.b(f1 + f3, f2 + 0.1F * f4, f1 + f3, f2 + 0.9F * f4);
      localze.a(f1 + 0.5F * f3, f2 + 0.8F * f4, 0.5F * f3, 0.2F * f4, 0.0F, -180.0F);
      localze.a(f1, f2 + 0.8F * f4, 0.5F * f3, 0.2F * f4, 0.0F, 180.0F);
      localze.b(f1, f2 + 0.9F * f4, f1, f2 + 0.1F * f4);
      break;
    case 2: 
    case 4: 
      localze.a(f1, f2, 0.5F * f3, 0.2F * f4, 180.0F, 180.0F);
      localze.a(f1 + paramzq.h() * 0.5F, f2, 0.5F * f3, 0.2F * f4, 180.0F, -180.0F);
      localze.b(f1 + f3, f2 + 0.1F * f4, f1 + f3, f2 + 0.9F * f4);
      localze.a(f1 + paramzq.h() * 0.5F, f2 + 0.8F * f4, 0.5F * f3, 0.2F * f4, 0.0F, 180.0F);
      localze.a(f1, f2 + 0.8F * f4, 0.5F * f3, 0.2F * f4, 0.0F, -180.0F);
      localze.b(f1, f2 + 0.9F * f4, f1, f2 + 0.1F * f4);
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
    float f1 = paramzq.f();
    float f2 = paramzq.g() + paramzq.i() * 0.2F;
    zq localzq = new zq(f1, f2, paramzq.h(), paramzq.i() * 0.6F);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */