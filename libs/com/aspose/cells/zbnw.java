package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbnw
  extends zcp
{
  zbnw(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f = Math.min(paramzq.h(), paramzq.i()) * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
      } else {
        f = Math.min(paramzq.h(), paramzq.i()) * 0.25F;
      }
    }
    else {
      f = Math.min(paramzq.h(), paramzq.i()) * 0.25F;
    }
    if (f <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    zo[] arrayOfzo = new zo[4];
    if ((this.e.c == 1) || (this.e.c == 4))
    {
      arrayOfzo[0] = new zo(f + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() - f + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(this.g, paramzq.i() + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      localze.a(arrayOfzo[3], arrayOfzo[0]);
    }
    if ((this.e.c == 2) || (this.e.c == 3))
    {
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() - f + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(f + this.g, paramzq.i() + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      localze.a(arrayOfzo[3], arrayOfzo[0]);
    }
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */