package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbjs
  extends zcp
{
  zbjs(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
        if (com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) == 50000.0F) {
          f7 = 0.0F;
        }
        if (com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) == 0.0F) {
          f5 = 0.0F;
        }
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
    float f9 = f3 / 2.0F - f6;
    float f10 = f7;
    float f11 = f5 / 2.0F;
    float f12 = f6 - f5 / 2.0F;
    float f13 = f3 / 2.0F - f11;
    zo[] arrayOfzo = new zo[17];
    switch (this.e.c)
    {
    case 1: 
    case 4: 
      arrayOfzo[0] = new zo(f1 + f9, f2 + f10);
      arrayOfzo[1] = new zo(f1 + f3 / 2.0F, f2);
      arrayOfzo[2] = new zo(f1 + f3 - f9, f2 + f10);
      arrayOfzo[3] = new zo(f1 + f3 - f13, f2 + f10);
      arrayOfzo[4] = new zo(f1 + f3 - f13, f2 + f4 - f12 - 2.0F * f11);
      arrayOfzo[5] = new zo(f1 + f3 - f10, f2 + f4 - f12 - 2.0F * f11);
      arrayOfzo[6] = new zo(f1 + f3 - f10, f2 + f4 - 2.0F * f12 - 2.0F * f11);
      arrayOfzo[7] = new zo(f1 + f3, f2 + f4 - f12 - f11);
      arrayOfzo[8] = new zo(f1 + f3 - f10, f2 + f4);
      arrayOfzo[9] = new zo(f1 + f3 - f10, f2 + f4 - f12);
      arrayOfzo[10] = new zo(f1 + f10, f2 + f4 - f12);
      arrayOfzo[11] = new zo(f1 + f10, f2 + f4);
      arrayOfzo[12] = new zo(f1, f2 + f4 - f12 - f11);
      arrayOfzo[13] = new zo(f1 + f10, f2 + f4 - 2.0F * f12 - 2.0F * f11);
      arrayOfzo[14] = new zo(f1 + f10, f2 + f4 - f12 - 2.0F * f11);
      arrayOfzo[15] = new zo(f1 + f13, f2 + f4 - f12 - 2.0F * f11);
      arrayOfzo[16] = new zo(f1 + f13, f2 + f10);
      break;
    case 2: 
    case 3: 
      arrayOfzo[0] = new zo(f1 + f9, f2 + f4 - f10);
      arrayOfzo[1] = new zo(f1 + f3 / 2.0F, f2 + f4);
      arrayOfzo[2] = new zo(f1 + f3 - f9, f2 + f4 - f10);
      arrayOfzo[3] = new zo(f1 + f3 - f13, f2 + f4 - f10);
      arrayOfzo[4] = new zo(f1 + f3 - f13, f2 + f12 + f5);
      arrayOfzo[5] = new zo(f1 + f3 - f10, f2 + f12 + f5);
      arrayOfzo[6] = new zo(f1 + f3 - f10, f2 + 2.0F * f6);
      arrayOfzo[7] = new zo(f1 + f3, f2 + f6);
      arrayOfzo[8] = new zo(f1 + f3 - f10, f2);
      arrayOfzo[9] = new zo(f1 + f3 - f10, f2 + f12);
      arrayOfzo[10] = new zo(f1 + f10, f2 + f12);
      arrayOfzo[11] = new zo(f1 + f10, f2);
      arrayOfzo[12] = new zo(f1, f2 + f6);
      arrayOfzo[13] = new zo(f1 + f10, f2 + 2.0F * f6);
      arrayOfzo[14] = new zo(f1 + f10, f2 + 2.0F * f6 - f12);
      arrayOfzo[15] = new zo(f1 + f13, f2 + 2.0F * f6 - f12);
      arrayOfzo[16] = new zo(f1 + f13, f2 + f4 - f10);
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbjs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */