package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zxz
  extends zco
{
  static float i = 0.2F;
  
  zxz(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    zo[] arrayOfzo = new zo[4];
    float f5 = i * paramzq.h();
    switch (this.e.a)
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
  
  void b(zq paramzq)
    throws Exception
  {
    paramzq = c(paramzq);
    super.b(paramzq);
  }
  
  private zq c(zq paramzq)
  {
    float f1 = i * paramzq.h();
    float f2 = paramzq.f() + f1;
    float f3 = paramzq.g();
    zq localzq = new zq(f2, f3, paramzq.h() - 2.0F * f1, paramzq.i());
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */