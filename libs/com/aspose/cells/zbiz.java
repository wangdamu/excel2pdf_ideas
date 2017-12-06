package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zbiz
  extends zcp
{
  zbiz(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    ze localze = new ze();
    float f1 = this.g;
    float f2 = this.h;
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    zo[] arrayOfzo = new zo[7];
    switch (this.e.c)
    {
    case 1: 
    case 4: 
      arrayOfzo[0] = new zo(f1 + 0.5F * f3, f2);
      arrayOfzo[1] = new zo(f1 + 0.9F * f3, f2 + 0.2F * f4);
      arrayOfzo[2] = new zo(f1 + f3, f2 + 0.64F * f4);
      arrayOfzo[3] = new zo(f1 + 0.72F * f3, f2 + f4);
      arrayOfzo[4] = new zo(f1 + 0.28F * f3, f2 + f4);
      arrayOfzo[5] = new zo(f1, f2 + 0.64F * f4);
      arrayOfzo[6] = new zo(f1 + 0.1F * f3, f2 + 0.2F * f4);
      break;
    case 2: 
    case 3: 
      arrayOfzo[0] = new zo(f1 + 0.28F * f3, f2);
      arrayOfzo[1] = new zo(f1 + 0.72F * f3, f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + 0.36F * f4);
      arrayOfzo[3] = new zo(f1 + 0.9F * f3, f2 + 0.8F * f4);
      arrayOfzo[4] = new zo(f1 + 0.5F * f3, f2 + f4);
      arrayOfzo[5] = new zo(f1 + 0.1F * f3, f2 + 0.8F * f4);
      arrayOfzo[6] = new zo(f1, f2 + 0.36F * f4);
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[4], arrayOfzo[5]);
    localze.a(arrayOfzo[5], arrayOfzo[6]);
    localze.a(arrayOfzo[6], arrayOfzo[0]);
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbiz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */