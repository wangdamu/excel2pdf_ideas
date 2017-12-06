package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbjt
  extends zco
{
  zbjt(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
    switch (this.e.a)
    {
    case 1: 
      break;
    case 2: 
      zi localzi1 = new zi(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.e.g());
      this.a.c();
      this.a.a(localzi1);
      break;
    case 3: 
      zi localzi2 = new zi(-1.0F, 0.0F, 0.0F, -1.0F, this.e.f(), this.e.g());
      this.a.c();
      this.a.a(localzi2);
      break;
    case 4: 
      zi localzi3 = new zi(-1.0F, 0.0F, 0.0F, 1.0F, this.e.f(), 0.0F);
      this.a.c();
      this.a.a(localzi3);
    }
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
    float f11 = 0.0F;
    float f12 = 0.0F;
    if (this.e.l.a.size() == 3)
    {
      f5 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f6 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      f7 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      f8 = f4 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f9 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      f10 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      f11 = -f3 - f5 + 2.0F * f6;
      f12 = -f4 - f8 + 2.0F * f9;
    }
    else if (this.e.l.a.size() == 2)
    {
      f5 = f3 * 9146.0F / 21600.0F;
      f6 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      f7 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      f8 = f4 * 9146.0F / 21600.0F;
      f9 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      f10 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      f11 = -f3 - f5 + 2.0F * f6;
      f12 = -f4 - f8 + 2.0F * f9;
    }
    else if (this.e.l.a.size() == 1)
    {
      f5 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      f6 = f3 * 18486.0F / 21600.0F;
      f7 = f3 * 6314.0F / 21600.0F;
      f8 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      f9 = f4 * 18486.0F / 21600.0F;
      f10 = f4 * 6314.0F / 21600.0F;
      f11 = -f3 - f5 + 2.0F * f6;
      f12 = -f4 - f8 + 2.0F * f9;
    }
    else
    {
      f5 = f3 * 9146.0F / 21600.0F;
      f6 = f3 * 18486.0F / 21600.0F;
      f7 = f3 * 6314.0F / 21600.0F;
      f8 = f4 * 9146.0F / 21600.0F;
      f9 = f4 * 18486.0F / 21600.0F;
      f10 = f4 * 6314.0F / 21600.0F;
      f11 = -f3 - f5 + 2.0F * f6;
      f12 = -f4 - f8 + 2.0F * f9;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f13 = f6 - f5 / 2.0F;
    zo[] arrayOfzo = new zo[12];
    arrayOfzo[0] = new zo(f1, f2 + (f4 - f8) / 2.0F + f8);
    arrayOfzo[1] = new zo(f1 + f7, f2 + f8);
    arrayOfzo[2] = new zo(f1 + f7, f2 + (f4 - f9) + f8);
    arrayOfzo[3] = new zo(f1 + f5 + (f3 - f6), f2 + (f4 - f9) + f8);
    arrayOfzo[4] = new zo(f1 + f5 + (f3 - f6), f2 + f10);
    arrayOfzo[5] = new zo(f1 + f5, f2 + f10);
    arrayOfzo[6] = new zo(f1 + f5 + (f3 - f5) / 2.0F, f2);
    arrayOfzo[7] = new zo(f1 + f3, f2 + f10);
    arrayOfzo[8] = new zo(f1 + f6, f2 + f10);
    arrayOfzo[9] = new zo(f1 + f6, f2 + f9);
    arrayOfzo[10] = new zo(f1 + f7, f2 + f9);
    arrayOfzo[11] = new zo(f1 + f7, f2 + f4);
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbjt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */