package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbfz
  extends zco
{
  zbfz(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
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
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    if (this.e.l.a.size() == 3)
    {
      f8 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f9 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      f10 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
    }
    else if (this.e.l.a.size() == 2)
    {
      f8 = f3 * 0.41351852F;
      f9 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      f10 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
    }
    else if (this.e.l.a.size() == 1)
    {
      f8 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f9 = f3 * 0.8565278F;
      f10 = f4 * 0.33185184F;
    }
    else
    {
      f8 = f3 * 0.41351852F;
      f9 = f3 * 0.8565278F;
      f10 = f4 * 0.33185184F;
    }
    f5 = f3 - f8 - 2.0F * (f3 - f9);
    f6 = f3 - f9 + f5 / 2.0F;
    f7 = f10;
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f11 = f6 - f5 / 2.0F;
    zo[] arrayOfzo = new zo[9];
    switch (this.e.a)
    {
    case 1: 
      arrayOfzo[0] = new zo(f1 + (f3 - 2.0F * f6), f2 + f7);
      arrayOfzo[1] = new zo(f1 + (f3 - f6), f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f7);
      arrayOfzo[3] = new zo(f1 + (f3 - f11), f2 + f7);
      arrayOfzo[4] = new zo(f1 + (f3 - f11), f2 + f4);
      arrayOfzo[5] = new zo(f1, f2 + f4);
      arrayOfzo[6] = new zo(f1, f2 + (f4 - f5));
      arrayOfzo[7] = new zo(f1 + (f3 - f5 - f11), f2 + (f4 - f5));
      arrayOfzo[8] = new zo(f1 + (f3 - f5 - f11), f2 + f7);
      break;
    case 2: 
      arrayOfzo[0] = new zo(f1 + (f3 - 2.0F * f6), f2 + f4 - f7);
      arrayOfzo[1] = new zo(f1 + (f3 - f6), f2 + f4);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f4 - f7);
      arrayOfzo[3] = new zo(f1 + (f3 - f11), f2 + f4 - f7);
      arrayOfzo[4] = new zo(f1 + (f3 - f11), f2);
      arrayOfzo[5] = new zo(f1, f2);
      arrayOfzo[6] = new zo(f1, f2 + f5);
      arrayOfzo[7] = new zo(f1 + (f3 - f5 - f11), f2 + f5);
      arrayOfzo[8] = new zo(f1 + (f3 - f5 - f11), f2 + f4 - f7);
      break;
    case 3: 
      arrayOfzo[0] = new zo(f1 + 2.0F * f6, f2 + f4 - f7);
      arrayOfzo[1] = new zo(f1 + f6, f2 + f4);
      arrayOfzo[2] = new zo(f1, f2 + f4 - f7);
      arrayOfzo[3] = new zo(f1 + f11, f2 + f4 - f7);
      arrayOfzo[4] = new zo(f1 + f11, f2);
      arrayOfzo[5] = new zo(f1 + f3, f2);
      arrayOfzo[6] = new zo(f1 + f3, f2 + f5);
      arrayOfzo[7] = new zo(f1 + f5 + f11, f2 + f5);
      arrayOfzo[8] = new zo(f1 + f5 + f11, f2 + f4 - f7);
      break;
    case 4: 
      arrayOfzo[0] = new zo(f1 + 2.0F * f6, f2 + f7);
      arrayOfzo[1] = new zo(f1 + f6, f2);
      arrayOfzo[2] = new zo(f1, f2 + f7);
      arrayOfzo[3] = new zo(f1 + f11, f2 + f7);
      arrayOfzo[4] = new zo(f1 + f11, f2 + f4);
      arrayOfzo[5] = new zo(f1 + f3, f2 + f4);
      arrayOfzo[6] = new zo(f1 + f3, f2 + f4 - f5);
      arrayOfzo[7] = new zo(f1 + f5 + f11, f2 + f4 - f5);
      arrayOfzo[8] = new zo(f1 + f5 + f11, f2 + f7);
    }
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */