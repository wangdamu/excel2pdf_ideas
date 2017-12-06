package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zya
  extends zcp
{
  static float l = 0.2F;
  
  zya(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    zo[] arrayOfzo = new zo[4];
    float f5 = l * paramzq.h();
    switch (this.e.c)
    {
    case 1: 
    case 3: 
      arrayOfzo[0] = new zo(f5 + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() - f5 + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 2: 
    case 4: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() - f5 + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(f5 + this.g, paramzq.i() + this.h);
    }
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
    float f1 = l * paramzq.h();
    float f2 = paramzq.f() + f1;
    float f3 = paramzq.g();
    zq localzq = new zq(f2, f3, paramzq.h() - 2.0F * f1, paramzq.i());
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */