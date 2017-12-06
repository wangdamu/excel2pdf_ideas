package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zblk
  extends zcp
{
  zblk(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    float f5 = 0.0F;
    float f6 = Math.min(f3, f4);
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f5 = f6 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
      } else {
        f5 = f6 * 0.5F;
      }
    }
    else {
      f5 = f6 * 0.5F;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f7 = (f4 - f5) / 2.0F;
    zo[] arrayOfzo = new zo[5];
    switch (this.e.c)
    {
    case 1: 
    case 2: 
      arrayOfzo[0] = new zo(f1, f2);
      arrayOfzo[1] = new zo(f1 + f3 - f5, f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f4 / 2.0F);
      arrayOfzo[3] = new zo(f1 + f3 - f5, f2 + f4);
      arrayOfzo[4] = new zo(f1, f2 + f4);
      localze.b(arrayOfzo);
      break;
    case 3: 
    case 4: 
      arrayOfzo[0] = new zo(f1 + f3, f2);
      arrayOfzo[1] = new zo(f1 + f5, f2);
      arrayOfzo[2] = new zo(f1, f2 + f4 / 2.0F);
      arrayOfzo[3] = new zo(f1 + f5, f2 + f4);
      arrayOfzo[4] = new zo(f1 + f3, f2 + f4);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      localze.a(arrayOfzo[3], arrayOfzo[4]);
      localze.a(arrayOfzo[4], arrayOfzo[0]);
    }
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zblk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */