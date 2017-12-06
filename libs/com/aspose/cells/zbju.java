package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbju
  extends zcp
{
  zbju(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    float f7 = 0.0F;
    float f8 = Math.min(f3, f4);
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = f8 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        f6 = f8 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
        f7 = f8 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F;
      }
      else
      {
        f5 = f8 * 0.25F;
        f6 = f8 * 0.25F;
        f7 = f8 * 0.25F;
      }
    }
    else
    {
      f5 = f8 * 0.25F;
      f6 = f8 * 0.25F;
      f7 = f8 * 0.25F;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f9 = f6 - f5 / 2.0F;
    zo[] arrayOfzo = new zo[12];
    switch (this.e.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(f1 + (f3 - 2.0F * f6), f2 + f7);
      arrayOfzo[1] = new zo(f1 + (f3 - f6), f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f7);
      arrayOfzo[3] = new zo(f1 + (f3 - f9), f2 + f7);
      arrayOfzo[4] = new zo(f1 + (f3 - f9), f2 + (f4 - f9));
      arrayOfzo[5] = new zo(f1 + f7, f2 + (f4 - f9));
      arrayOfzo[6] = new zo(f1 + f7, f2 + f4);
      arrayOfzo[7] = new zo(f1, f2 + (f4 - f6));
      arrayOfzo[8] = new zo(f1 + f7, f2 + (f4 - 2.0F * f6));
      arrayOfzo[9] = new zo(f1 + f7, f2 + (f4 - 2.0F * f6 + f9));
      arrayOfzo[10] = new zo(f1 + (f3 - 2.0F * f6 + f9), f2 + (f4 - 2.0F * f6 + f9));
      arrayOfzo[11] = new zo(f1 + (f3 - 2.0F * f6 + f9), f2 + f7);
      break;
    case 2: 
      arrayOfzo[0] = new zo(f1 + (f3 - 2.0F * f6), f2 + f4 - f7);
      arrayOfzo[1] = new zo(f1 + (f3 - f6), f2 + f4);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f4 - f7);
      arrayOfzo[3] = new zo(f1 + (f3 - f9), f2 + f4 - f7);
      arrayOfzo[4] = new zo(f1 + (f3 - f9), f2 + f9);
      arrayOfzo[5] = new zo(f1 + f7, f2 + f9);
      arrayOfzo[6] = new zo(f1 + f7, f2);
      arrayOfzo[7] = new zo(f1, f2 + f6);
      arrayOfzo[8] = new zo(f1 + f7, f2 + 2.0F * f6);
      arrayOfzo[9] = new zo(f1 + f7, f2 + 2.0F * f6 - f9);
      arrayOfzo[10] = new zo(f1 + (f3 - 2.0F * f6 + f9), f2 + 2.0F * f6 - f9);
      arrayOfzo[11] = new zo(f1 + (f3 - 2.0F * f6 + f9), f2 + f4 - f7);
      break;
    case 3: 
      arrayOfzo[0] = new zo(f1 + 2.0F * f6, f2 + f4 - f7);
      arrayOfzo[1] = new zo(f1 + f6, f2 + f4);
      arrayOfzo[2] = new zo(f1, f2 + f4 - f7);
      arrayOfzo[3] = new zo(f1 + f9, f2 + f4 - f7);
      arrayOfzo[4] = new zo(f1 + f9, f2 + f9);
      arrayOfzo[5] = new zo(f1 + f3 - f7, f2 + f9);
      arrayOfzo[6] = new zo(f1 + f3 - f7, f2);
      arrayOfzo[7] = new zo(f1 + f3, f2 + f6);
      arrayOfzo[8] = new zo(f1 + f3 - f7, f2 + 2.0F * f6);
      arrayOfzo[9] = new zo(f1 + f3 - f7, f2 + 2.0F * f6 - f9);
      arrayOfzo[10] = new zo(f1 + 2.0F * f6 - f9, f2 + 2.0F * f6 - f9);
      arrayOfzo[11] = new zo(f1 + 2.0F * f6 - f9, f2 + f4 - f7);
      break;
    case 4: 
      arrayOfzo[0] = new zo(f1 + 2.0F * f6, f2 + f7);
      arrayOfzo[1] = new zo(f1 + f6, f2);
      arrayOfzo[2] = new zo(f1, f2 + f7);
      arrayOfzo[3] = new zo(f1 + f9, f2 + f7);
      arrayOfzo[4] = new zo(f1 + f9, f2 + f4 - f9);
      arrayOfzo[5] = new zo(f1 + f3 - f7, f2 + f4 - f9);
      arrayOfzo[6] = new zo(f1 + f3 - f7, f2 + f4);
      arrayOfzo[7] = new zo(f1 + f3, f2 + f4 - f6);
      arrayOfzo[8] = new zo(f1 + f3 - f7, f2 + f4 - 2.0F * f6);
      arrayOfzo[9] = new zo(f1 + f3 - f7, f2 + f4 - 2.0F * f6 + f9);
      arrayOfzo[10] = new zo(f1 + 2.0F * f6 - f9, f2 + f4 - 2.0F * f6 + f9);
      arrayOfzo[11] = new zo(f1 + 2.0F * f6 - f9, f2 + f7);
    }
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */