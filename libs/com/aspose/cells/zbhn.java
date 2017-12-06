package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zbhn
  extends zcp
{
  zbhn(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    zo[] arrayOfzo = new zo[12];
    arrayOfzo[0] = new zo(f1 + 0.37F * f3, f2);
    arrayOfzo[1] = new zo(f1 + 0.63F * f3, f2);
    arrayOfzo[2] = new zo(f1 + 0.86F * f3, f2 + 0.14F * f4);
    arrayOfzo[3] = new zo(f1 + f3, f2 + 0.37F * f4);
    arrayOfzo[4] = new zo(f1 + f3, f2 + 0.63F * f4);
    arrayOfzo[5] = new zo(f1 + 0.86F * f3, f2 + 0.86F * f4);
    arrayOfzo[6] = new zo(f1 + 0.63F * f3, f2 + f4);
    arrayOfzo[7] = new zo(f1 + 0.37F * f3, f2 + f4);
    arrayOfzo[8] = new zo(f1 + 0.14F * f3, f2 + 0.86F * f4);
    arrayOfzo[9] = new zo(f1, f2 + 0.63F * f4);
    arrayOfzo[10] = new zo(f1, f2 + 0.37F * f4);
    arrayOfzo[11] = new zo(f1 + 0.14F * f3, f2 + 0.14F * f4);
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[4], arrayOfzo[5]);
    localze.a(arrayOfzo[5], arrayOfzo[6]);
    localze.a(arrayOfzo[6], arrayOfzo[7]);
    localze.a(arrayOfzo[7], arrayOfzo[8]);
    localze.a(arrayOfzo[8], arrayOfzo[9]);
    localze.a(arrayOfzo[9], arrayOfzo[10]);
    localze.a(arrayOfzo[10], arrayOfzo[11]);
    localze.a(arrayOfzo[11], arrayOfzo[0]);
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */