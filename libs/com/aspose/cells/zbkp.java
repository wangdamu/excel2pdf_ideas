package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbkp
  extends zcp
{
  zbkp(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
      arrayOfzo[2] = new zo(0.865F * paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[2]);
      localze.k();
      return localze;
    }
    arrayOfzo[0] = new zo(0.135F * paramzq.h() + this.g, (paramzq.i() - f) / 2.0F + this.h);
    arrayOfzo[5] = new zo(0.865F * paramzq.h() + this.g, (paramzq.i() - f) / 2.0F + this.h);
    arrayOfzo[6] = new zo(0.865F * paramzq.h() + this.g, (paramzq.i() - f) / 2.0F + f + this.h);
    arrayOfzo[11] = new zo(0.135F * paramzq.h() + this.g, (paramzq.i() - f) / 2.0F + f + this.h);
    localze.a(arrayOfzo[0], arrayOfzo[5]);
    localze.a(arrayOfzo[5], arrayOfzo[6]);
    localze.a(arrayOfzo[6], arrayOfzo[11]);
    localze.a(arrayOfzo[11], arrayOfzo[0]);
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbkp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */