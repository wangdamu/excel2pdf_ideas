package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zblc
  extends zcp
{
  zblc(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    float f6 = 0.0F;
    float f7 = Math.min(f3, f4);
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        if (f4 > f3) {
          f5 = f7 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / (100000.0F * f3 / f4));
        } else {
          f5 = f7 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        }
        f6 = f7 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
      }
      else
      {
        if (f4 > f3) {
          f5 = f7 * (50000.0F / (100000.0F * f3 / f4));
        } else {
          f5 = f7 * 0.5F;
        }
        f6 = f7 * 0.5F;
      }
    }
    else
    {
      if (f4 > f3) {
        f5 = f7 * (50000.0F / (100000.0F * f3 / f4));
      } else {
        f5 = f7 * 0.5F;
      }
      f6 = f7 * 0.5F;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f8 = (f4 - f5) / 2.0F;
    float f9 = f5 / 2.0F / (f8 + f5 / 2.0F) * f6;
    zo[] arrayOfzo = new zo[8];
    switch (this.e.c)
    {
    case 1: 
    case 2: 
      arrayOfzo[0] = new zo(f1, f2 + f8);
      arrayOfzo[1] = new zo(f1 + f3 - f6, f2 + f8);
      arrayOfzo[2] = new zo(f1 + f3 - f6, f2);
      arrayOfzo[3] = new zo(f1 + f3, f2 + f4 / 2.0F);
      arrayOfzo[4] = new zo(f1 + f3 - f6, f2 + f4);
      arrayOfzo[5] = new zo(f1 + f3 - f6, f2 + f4 - f8);
      arrayOfzo[6] = new zo(f1, f2 + f4 - f8);
      arrayOfzo[7] = new zo(f1 + f9, f2 + f8 + f5 / 2.0F);
      break;
    case 3: 
    case 4: 
      arrayOfzo[0] = new zo(f1 + f3, f2 + f8);
      arrayOfzo[1] = new zo(f1 + f6, f2 + f8);
      arrayOfzo[2] = new zo(f1 + f6, f2);
      arrayOfzo[3] = new zo(f1, f2 + f4 / 2.0F);
      arrayOfzo[4] = new zo(f1 + f6, f2 + f4);
      arrayOfzo[5] = new zo(f1 + f6, f2 + f4 - f8);
      arrayOfzo[6] = new zo(f1 + f3, f2 + f4 - f8);
      arrayOfzo[7] = new zo(f1 + f3 - f9, f2 + f8 + f5 / 2.0F);
    }
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zblc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */