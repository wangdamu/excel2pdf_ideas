package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbjr
  extends zco
{
  zbjr(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    switch (this.e.l.a.size())
    {
    case 3: 
      f8 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f9 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      f10 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      break;
    case 2: 
      if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328))
      {
        f8 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f9 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f10 = f4 * 0.28800926F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329))
      {
        f8 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f9 = f3 * 0.40097222F;
        f10 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329))
      {
        f8 = f3 * 0.29833335F;
        f9 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f10 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      break;
    case 1: 
      if (((zar)this.e.l.a.get(0)).b() == 327)
      {
        f8 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f9 = f3 * 0.40097222F;
        f10 = f4 * 0.28800926F;
      }
      else if (((zar)this.e.l.a.get(0)).b() == 328)
      {
        f8 = f3 * 0.29833335F;
        f9 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f10 = f4 * 0.28800926F;
      }
      else
      {
        f8 = f3 * 0.29833335F;
        f9 = f3 * 0.40097222F;
        f10 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      }
      break;
    default: 
      f8 = f3 * 0.29833335F;
      f9 = f3 * 0.40097222F;
      f10 = f4 * 0.28800926F;
    }
    f5 = f3 - f9 * 2.0F;
    f6 = f10;
    f7 = (f3 - f8 * 2.0F) / 2.0F;
    float f11 = f3 / 2.0F - f6;
    float f12 = f7;
    float f13 = f5 / 2.0F;
    float f14 = f6 - f5 / 2.0F;
    float f15 = f3 / 2.0F - f13;
    zo[] arrayOfzo = new zo[17];
    switch (this.e.a)
    {
    case 1: 
    case 4: 
      arrayOfzo[0] = new zo(f1 + f11, f2 + f12);
      arrayOfzo[1] = new zo(f1 + f3 / 2.0F, f2);
      arrayOfzo[2] = new zo(f1 + f3 - f11, f2 + f12);
      arrayOfzo[3] = new zo(f1 + f3 - f15, f2 + f12);
      arrayOfzo[4] = new zo(f1 + f3 - f15, f2 + f4 - f14 - 2.0F * f13);
      arrayOfzo[5] = new zo(f1 + f3 - f12, f2 + f4 - f14 - 2.0F * f13);
      arrayOfzo[6] = new zo(f1 + f3 - f12, f2 + f4 - 2.0F * f14 - 2.0F * f13);
      arrayOfzo[7] = new zo(f1 + f3, f2 + f4 - f14 - f13);
      arrayOfzo[8] = new zo(f1 + f3 - f12, f2 + f4);
      arrayOfzo[9] = new zo(f1 + f3 - f12, f2 + f4 - f14);
      arrayOfzo[10] = new zo(f1 + f12, f2 + f4 - f14);
      arrayOfzo[11] = new zo(f1 + f12, f2 + f4);
      arrayOfzo[12] = new zo(f1, f2 + f4 - f14 - f13);
      arrayOfzo[13] = new zo(f1 + f12, f2 + f4 - 2.0F * f14 - 2.0F * f13);
      arrayOfzo[14] = new zo(f1 + f12, f2 + f4 - f14 - 2.0F * f13);
      arrayOfzo[15] = new zo(f1 + f15, f2 + f4 - f14 - 2.0F * f13);
      arrayOfzo[16] = new zo(f1 + f15, f2 + f12);
      break;
    case 2: 
    case 3: 
      arrayOfzo[0] = new zo(f1 + f11, f2 + f4 - f12);
      arrayOfzo[1] = new zo(f1 + f3 / 2.0F, f2 + f4);
      arrayOfzo[2] = new zo(f1 + f3 - f11, f2 + f4 - f12);
      arrayOfzo[3] = new zo(f1 + f3 - f15, f2 + f4 - f12);
      arrayOfzo[4] = new zo(f1 + f3 - f15, f2 + f14 + f5);
      arrayOfzo[5] = new zo(f1 + f3 - f12, f2 + f14 + f5);
      arrayOfzo[6] = new zo(f1 + f3 - f12, f2 + 2.0F * f6);
      arrayOfzo[7] = new zo(f1 + f3, f2 + f6);
      arrayOfzo[8] = new zo(f1 + f3 - f12, f2);
      arrayOfzo[9] = new zo(f1 + f3 - f12, f2 + f14);
      arrayOfzo[10] = new zo(f1 + f12, f2 + f14);
      arrayOfzo[11] = new zo(f1 + f12, f2);
      arrayOfzo[12] = new zo(f1, f2 + f6);
      arrayOfzo[13] = new zo(f1 + f12, f2 + 2.0F * f6);
      arrayOfzo[14] = new zo(f1 + f12, f2 + 2.0F * f6 - f14);
      arrayOfzo[15] = new zo(f1 + f15, f2 + 2.0F * f6 - f14);
      arrayOfzo[16] = new zo(f1 + f15, f2 + f4 - f12);
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbjr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */