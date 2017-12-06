package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zyu
  extends zcp
{
  zyu(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    zo[] arrayOfzo = new zo[3];
    arrayOfzo[0] = new zo(f1, f2);
    arrayOfzo[1] = new zo(f1 + f3, f2);
    arrayOfzo[2] = new zo(f1 + f3 / 2.0F, f2 + f4);
    ze localze = new ze();
    localze.b(arrayOfzo);
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
    float f1 = paramzq.f() + paramzq.h() / 4.0F;
    float f2 = paramzq.g();
    zq localzq = new zq(f1, f2, paramzq.h() / 2.0F, paramzq.i() / 2.0F);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zyu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */