package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zq;

class zblg
  extends zcp
{
  zblg(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    ze localze = new ze();
    localze.a(paramzq);
    return localze;
  }
  
  void a()
    throws Exception
  {
    zq localzq = this.e.y();
    localzq = zbiy.a(localzq);
    if (!this.e.A().a()) {
      localzq.a(-(this.e.A().h() / 2.0F), -(this.e.A().h() / 2.0F));
    }
    float f = 0.0F;
    if (this.e.x())
    {
      if (localzq.h() > localzq.i())
      {
        localzq.a(localzq.f() + (localzq.h() - localzq.i()) / 2.0F);
        localzq.b(localzq.g() - (localzq.h() - localzq.i()) / 2.0F);
      }
      else
      {
        localzq.a(localzq.f() - (localzq.i() - localzq.h()) / 2.0F);
        localzq.b(localzq.g() + (localzq.i() - localzq.h()) / 2.0F);
      }
      f = localzq.h();
      localzq.c(localzq.i());
      localzq.d(f);
    }
    c(localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zblg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */