package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbjn
  extends zco
{
  zbjn(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    zo[] arrayOfzo = new zo[18];
    switch (this.e.l.a.size())
    {
    case 4: 
      f5 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(3)).a())) / 21600.0F;
      break;
    case 3: 
      if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328) && (((zar)this.e.l.a.get(2)).b() == 329))
      {
        f5 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
        f8 = paramzq.i() * 8193.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329) && (((zar)this.e.l.a.get(2)).b() == 330))
      {
        f5 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f6 = paramzq.i() * 5200.0F / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329) && (((zar)this.e.l.a.get(2)).b() == 330))
      {
        f5 = paramzq.h() * 0.25462964F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328) && (((zar)this.e.l.a.get(2)).b() == 330))
      {
        f5 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f7 = paramzq.h() * 2630.0F / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      }
      break;
    case 2: 
      if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328))
      {
        f5 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f7 = paramzq.h() * 2630.0F / 21600.0F;
        f8 = paramzq.i() * 8193.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329))
      {
        f5 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f6 = paramzq.i() * 5200.0F / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f8 = paramzq.i() * 8193.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 330))
      {
        f5 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f6 = paramzq.i() * 5200.0F / 21600.0F;
        f7 = paramzq.h() * 2630.0F / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329))
      {
        f5 = paramzq.h() * 0.25462964F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f8 = paramzq.i() * 8193.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 330))
      {
        f5 = paramzq.h() * 0.25462964F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f7 = paramzq.h() * 2630.0F / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 329) && (((zar)this.e.l.a.get(1)).b() == 330))
      {
        f5 = paramzq.h() * 0.25462964F;
        f6 = paramzq.i() * 5200.0F / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      break;
    case 1: 
      if (((zar)this.e.l.a.get(0)).b() == 327)
      {
        f5 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f6 = paramzq.i() * 5200.0F / 21600.0F;
        f7 = paramzq.h() * 2630.0F / 21600.0F;
        f8 = paramzq.i() * 8193.0F / 21600.0F;
      }
      else if (((zar)this.e.l.a.get(0)).b() == 328)
      {
        f5 = paramzq.h() * 0.25462964F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f7 = paramzq.h() * 2630.0F / 21600.0F;
        f8 = paramzq.i() * 8193.0F / 21600.0F;
      }
      else if (((zar)this.e.l.a.get(0)).b() == 329)
      {
        f5 = paramzq.h() * 0.25462964F;
        f6 = paramzq.i() * 5200.0F / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f8 = paramzq.i() * 8193.0F / 21600.0F;
      }
      else
      {
        f5 = paramzq.h() * 0.25462964F;
        f6 = paramzq.i() * 5200.0F / 21600.0F;
        f7 = paramzq.h() * 2630.0F / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      }
      break;
    default: 
      f5 = paramzq.h() * 0.25462964F;
      f6 = paramzq.i() * 5200.0F / 21600.0F;
      f7 = paramzq.h() * 2630.0F / 21600.0F;
      f8 = paramzq.i() * 8193.0F / 21600.0F;
    }
    f1 = paramzq.i() - f8 * 2.0F;
    f2 = paramzq.i() / 2.0F - f6;
    f3 = f7;
    f4 = paramzq.h() - f5 * 2.0F;
    arrayOfzo[0] = new zo(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F);
    arrayOfzo[1] = new zo(paramzq.f() + f3, paramzq.g() + paramzq.i() / 2.0F - f2);
    arrayOfzo[2] = new zo(paramzq.f() + f3, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F);
    arrayOfzo[3] = new zo(paramzq.f() + (paramzq.h() - f4) / 2.0F, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F);
    arrayOfzo[4] = new zo(paramzq.f() + (paramzq.h() - f4) / 2.0F, paramzq.g());
    arrayOfzo[5] = new zo(paramzq.f() + (paramzq.h() - f4) / 2.0F + f4, paramzq.g());
    arrayOfzo[6] = new zo(paramzq.f() + (paramzq.h() - f4) / 2.0F + f4, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F);
    arrayOfzo[7] = new zo(paramzq.f() + paramzq.h() - f3, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F);
    arrayOfzo[8] = new zo(paramzq.f() + paramzq.h() - f3, paramzq.g() + paramzq.i() / 2.0F - f2);
    arrayOfzo[9] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() / 2.0F);
    arrayOfzo[10] = new zo(paramzq.f() + paramzq.h() - f3, paramzq.g() + paramzq.i() / 2.0F + f2);
    arrayOfzo[11] = new zo(paramzq.f() + paramzq.h() - f3, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F + f1);
    arrayOfzo[12] = new zo(paramzq.f() + (paramzq.h() - f4) / 2.0F + f4, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F + f1);
    arrayOfzo[13] = new zo(paramzq.f() + (paramzq.h() - f4) / 2.0F + f4, paramzq.g() + paramzq.i());
    arrayOfzo[14] = new zo(paramzq.f() + (paramzq.h() - f4) / 2.0F, paramzq.g() + paramzq.i());
    arrayOfzo[15] = new zo(paramzq.f() + (paramzq.h() - f4) / 2.0F, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F + f1);
    arrayOfzo[16] = new zo(paramzq.f() + f3, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F + f1);
    arrayOfzo[17] = new zo(paramzq.f() + f3, paramzq.g() + paramzq.i() / 2.0F + f2);
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbjn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */