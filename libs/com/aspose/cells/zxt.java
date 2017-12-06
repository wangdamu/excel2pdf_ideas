package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;

class zxt
  extends zco
{
  zxt(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  ze a(zq paramzq)
  {
    ze localze = new ze();
    float f2 = Math.min(paramzq.h(), paramzq.i()) * 0.2F;
    if (f2 <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    float f1 = f2 * 2.0F;
    zt localzt = new zt(f1, f1);
    zq localzq = new zq(paramzq.d(), localzt);
    localze.a(localzq, 180.0F, 90.0F);
    localzq.a(paramzq.l() - f1);
    localze.a(localzq, 270.0F, 90.0F);
    localzq.b(paramzq.m() - f1);
    localze.a(localzq, 0.0F, 90.0F);
    localzq.a(paramzq.j());
    localze.a(localzq, 90.0F, 90.0F);
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
    ze localze = new ze();
    float f2 = Math.min(paramzq.h(), paramzq.i()) * 0.2F;
    if (f2 <= 0.0F) {
      return paramzq;
    }
    float f1 = f2 * 2.0F;
    zq localzq1 = new zq(paramzq.f(), paramzq.g(), f1, f1);
    zq localzq2 = zbix.a(localzq1);
    float f3 = localzq2.f() - paramzq.f();
    float f4 = localzq2.g() - paramzq.g();
    float f5 = localzq2.f();
    float f6 = localzq2.g();
    zq localzq3 = new zq(f5, f6, paramzq.h() - 2.0F * f3, paramzq.i() - 2.0F * f4);
    return localzq3;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */