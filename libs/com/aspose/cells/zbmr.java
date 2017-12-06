package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

class zbmr
  extends zco
{
  private zq i;
  
  zbmr(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    this.i = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.l().h();
    float f4 = this.e.l().i();
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    switch (this.e.l.a.size())
    {
    case 4: 
      f13 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f14 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      f15 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      f16 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(3)).a())) / 21600.0F;
      break;
    case 3: 
      if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328) && (((zar)this.e.l.a.get(2)).b() == 329))
      {
        f13 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f14 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f15 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
        f16 = f4 * 7905.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328) && (((zar)this.e.l.a.get(2)).b() == 330))
      {
        f13 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f14 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f15 = f3 * 18106.0F / 21600.0F;
        f16 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329) && (((zar)this.e.l.a.get(2)).b() == 330))
      {
        f13 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f14 = f4 * 5233.0F / 21600.0F;
        f15 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f16 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329) && (((zar)this.e.l.a.get(2)).b() == 330))
      {
        f13 = f3 * 14294.0F / 21600.0F;
        f14 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f15 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f16 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      }
      break;
    case 2: 
      if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328))
      {
        f13 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f14 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f15 = f3 * 18106.0F / 21600.0F;
        f16 = f4 * 7905.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329))
      {
        f13 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f14 = f4 * 5233.0F / 21600.0F;
        f15 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f16 = f4 * 7905.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 330))
      {
        f13 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f14 = f4 * 5233.0F / 21600.0F;
        f15 = f3 * 18106.0F / 21600.0F;
        f16 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329))
      {
        f13 = f3 * 14294.0F / 21600.0F;
        f14 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f15 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f16 = f4 * 7905.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 330))
      {
        f13 = f3 * 14294.0F / 21600.0F;
        f14 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f15 = f3 * 18106.0F / 21600.0F;
        f16 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 329) && (((zar)this.e.l.a.get(1)).b() == 330))
      {
        f13 = f3 * 14294.0F / 21600.0F;
        f14 = f4 * 5233.0F / 21600.0F;
        f15 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f16 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      break;
    case 1: 
      if (((zar)this.e.l.a.get(0)).b() == 327)
      {
        f13 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f14 = f4 * 5233.0F / 21600.0F;
        f15 = f3 * 18106.0F / 21600.0F;
        f16 = f4 * 7905.0F / 21600.0F;
      }
      else if (((zar)this.e.l.a.get(0)).b() == 328)
      {
        f13 = f3 * 14294.0F / 21600.0F;
        f14 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f15 = f3 * 18106.0F / 21600.0F;
        f16 = f4 * 7905.0F / 21600.0F;
      }
      else if (((zar)this.e.l.a.get(0)).b() == 329)
      {
        f13 = f3 * 14294.0F / 21600.0F;
        f14 = f4 * 5233.0F / 21600.0F;
        f15 = f3 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f16 = f4 * 7905.0F / 21600.0F;
      }
      else if (((zar)this.e.l.a.get(0)).b() == 330)
      {
        f13 = f3 * 14294.0F / 21600.0F;
        f14 = f4 * 5233.0F / 21600.0F;
        f15 = f3 * 18106.0F / 21600.0F;
        f16 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      }
      break;
    default: 
      f13 = f3 * 14294.0F / 21600.0F;
      f14 = f4 * 5233.0F / 21600.0F;
      f15 = f3 * 18106.0F / 21600.0F;
      f16 = f4 * 7905.0F / 21600.0F;
    }
    f5 = f4 - 2.0F * f16;
    f6 = f4 / 2.0F - f14;
    f7 = f3 - f15;
    f8 = f13;
    f9 = f8;
    f10 = f3 - f7;
    f11 = f4 / 2.0F - f6;
    f12 = f4 / 2.0F - f5 / 2.0F;
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[11];
    switch (this.e.a)
    {
    case 1: 
    case 2: 
      arrayOfzo[0] = new zo(f1, f2);
      arrayOfzo[1] = new zo(f1 + f9, f2);
      arrayOfzo[2] = new zo(f1 + f9, f2 + f12);
      arrayOfzo[3] = new zo(f1 + f10, f2 + f12);
      arrayOfzo[4] = new zo(f1 + f10, f2 + f11);
      arrayOfzo[5] = new zo(f1 + f3, f2 + f4 / 2.0F);
      arrayOfzo[6] = new zo(f1 + f10, f2 + f4 - f11);
      arrayOfzo[7] = new zo(f1 + f10, f2 + f4 - f12);
      arrayOfzo[8] = new zo(f1 + f9, f2 + f4 - f12);
      arrayOfzo[9] = new zo(f1 + f9, f2 + f4);
      arrayOfzo[10] = new zo(f1, f2 + f4);
      localze.b(arrayOfzo);
      this.i = new zq(arrayOfzo[0], new zt(arrayOfzo[1].d() - arrayOfzo[0].d(), f4));
      break;
    case 3: 
    case 4: 
      arrayOfzo[0] = new zo(f1 + f3 - f9, f2);
      arrayOfzo[1] = new zo(f1 + f3, f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f4);
      arrayOfzo[3] = new zo(f1 + f3 - f9, f2 + f4);
      arrayOfzo[4] = new zo(f1 + f3 - f9, f2 + f4 - f12);
      arrayOfzo[5] = new zo(f1 + f7, f2 + f4 - f12);
      arrayOfzo[6] = new zo(f1 + f7, f2 + f4 - f11);
      arrayOfzo[7] = new zo(f1, f2 + f4 / 2.0F);
      arrayOfzo[8] = new zo(f1 + f7, f2 + f11);
      arrayOfzo[9] = new zo(f1 + f7, f2 + f12);
      arrayOfzo[10] = new zo(f1 + f3 - f9, f2 + f12);
      localze.b(arrayOfzo);
    }
    return localze;
  }
  
  void b()
    throws Exception
  {
    super.b(this.i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */