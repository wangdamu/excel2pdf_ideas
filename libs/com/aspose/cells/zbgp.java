package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbgp
  extends zcp
{
  zbgp(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
        f = Math.min(paramzq.h(), paramzq.i()) * 0.24F;
      }
    }
    else {
      f = Math.min(paramzq.h(), paramzq.i()) * 0.24F;
    }
    if (f <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    arrayOfzo[0] = new zo(this.g, f + this.h);
    arrayOfzo[1] = new zo(f + this.g, f + this.h);
    arrayOfzo[2] = new zo(f + this.g, this.h);
    arrayOfzo[3] = new zo(paramzq.h() - f + this.g, this.h);
    arrayOfzo[4] = new zo(paramzq.h() - f + this.g, f + this.h);
    arrayOfzo[5] = new zo(paramzq.h() + this.g, f + this.h);
    arrayOfzo[6] = new zo(paramzq.h() + this.g, paramzq.i() - f + this.h);
    arrayOfzo[7] = new zo(paramzq.h() - f + this.g, paramzq.i() - f + this.h);
    arrayOfzo[8] = new zo(paramzq.h() - f + this.g, paramzq.i() + this.h);
    arrayOfzo[9] = new zo(f + this.g, paramzq.i() + this.h);
    arrayOfzo[10] = new zo(f + this.g, paramzq.i() - f + this.h);
    arrayOfzo[11] = new zo(this.g, paramzq.i() - f + this.h);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */