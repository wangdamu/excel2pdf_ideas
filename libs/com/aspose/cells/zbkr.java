package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbkr
  extends zcp
{
  zbkr(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[12];
    float f = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f = Math.min(paramzq.h(), paramzq.i()) * 0.24153F;
      }
    }
    else {
      f = Math.min(paramzq.h(), paramzq.i()) * 0.24153F;
    }
    if (f <= 0.0F)
    {
      arrayOfzo[0] = new zo(0.135F * paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[1] = new zo(paramzq.h() / 2.0F + this.g, 0.135F * paramzq.i() + this.h);
      arrayOfzo[2] = new zo(0.865F * paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[3] = new zo(paramzq.h() / 2.0F + this.g, 0.865F * paramzq.i() + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[2]);
      localze.k();
      localze.a(arrayOfzo[1], arrayOfzo[3]);
      localze.k();
      return localze;
    }
    arrayOfzo[0] = new zo(0.135F * paramzq.h() + this.g, (paramzq.i() - f) / 2.0F + this.h);
    arrayOfzo[1] = new zo((paramzq.h() - f) / 2.0F + this.g, (paramzq.i() - f) / 2.0F + this.h);
    arrayOfzo[2] = new zo((paramzq.h() - f) / 2.0F + this.g, 0.135F * paramzq.i() + this.h);
    arrayOfzo[3] = new zo((paramzq.h() - f) / 2.0F + f + this.g, 0.135F * paramzq.i() + this.h);
    arrayOfzo[4] = new zo((paramzq.h() - f) / 2.0F + f + this.g, (paramzq.i() - f) / 2.0F + this.h);
    arrayOfzo[5] = new zo(0.865F * paramzq.h() + this.g, (paramzq.i() - f) / 2.0F + this.h);
    arrayOfzo[6] = new zo(0.865F * paramzq.h() + this.g, (paramzq.i() - f) / 2.0F + f + this.h);
    arrayOfzo[7] = new zo((paramzq.h() - f) / 2.0F + f + this.g, (paramzq.i() - f) / 2.0F + f + this.h);
    arrayOfzo[8] = new zo((paramzq.h() - f) / 2.0F + f + this.g, 0.865F * paramzq.i() + this.h);
    arrayOfzo[9] = new zo((paramzq.h() - f) / 2.0F + this.g, 0.865F * paramzq.i() + this.h);
    arrayOfzo[10] = new zo((paramzq.h() - f) / 2.0F + this.g, (paramzq.i() - f) / 2.0F + f + this.h);
    arrayOfzo[11] = new zo(0.135F * paramzq.h() + this.g, (paramzq.i() - f) / 2.0F + f + this.h);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbkr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */