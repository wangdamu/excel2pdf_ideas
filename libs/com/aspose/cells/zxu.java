package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zxu
  extends zco
{
  zxu(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    zo[] arrayOfzo = new zo[5];
    switch (this.e.a)
    {
    case 1: 
      arrayOfzo[0] = new zo(f1 + 0.2F * f3, f2);
      arrayOfzo[1] = new zo(f1 + f3, f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f4);
      arrayOfzo[3] = new zo(f1, f2 + f4);
      arrayOfzo[4] = new zo(f1, f2 + 0.2F * f4);
      break;
    case 2: 
      arrayOfzo[0] = new zo(f1, f2);
      arrayOfzo[1] = new zo(f1 + f3, f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f4);
      arrayOfzo[3] = new zo(f1 + 0.2F * f3, f2 + f4);
      arrayOfzo[4] = new zo(f1, f2 + 0.8F * f4);
      break;
    case 3: 
      arrayOfzo[0] = new zo(f1, f2);
      arrayOfzo[1] = new zo(f1 + f3, f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + 0.8F * f4);
      arrayOfzo[3] = new zo(f1 + 0.8F * f3, f2 + f4);
      arrayOfzo[4] = new zo(f1, f2 + f4);
      break;
    case 4: 
      arrayOfzo[0] = new zo(f1, f2);
      arrayOfzo[1] = new zo(f1 + 0.8F * f3, f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + 0.2F * f4);
      arrayOfzo[3] = new zo(f1 + f3, f2 + f4);
      arrayOfzo[4] = new zo(f1, f2 + f4);
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
    float f1 = paramzq.f();
    float f2 = paramzq.g() + paramzq.i() * 0.2F;
    zq localzq = new zq(f1, f2, paramzq.h(), paramzq.i() * 0.8F);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */