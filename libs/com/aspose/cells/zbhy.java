package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbhy
  extends zco
{
  zbhy(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = 1.0F;
    float f2 = 1.0F;
    zo[] arrayOfzo = new zo[7];
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    switch (this.e.l.a.size())
    {
    case 2: 
      f1 = paramzq.h() - 2.0F * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F) * paramzq.h();
      f2 = com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F * paramzq.i();
      break;
    case 1: 
      if (((zar)this.e.l.a.get(0)).b() == 327)
      {
        f2 = paramzq.i() - com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F * paramzq.i();
        f1 = paramzq.h() - 2.0F * (paramzq.h() * 0.24842593F);
      }
      else
      {
        f1 = paramzq.h() - 2.0F * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F) * paramzq.h();
        f2 = paramzq.i() * 0.74819446F;
      }
      break;
    default: 
      f2 = paramzq.i() * 0.74819446F;
      f1 = paramzq.h() - 2.0F * (paramzq.h() * 0.24842593F);
    }
    if ((f1 <= 0.0F) && (f2 == paramzq.i()))
    {
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g());
      arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[1], arrayOfzo[3]);
      return localze;
    }
    if ((f1 <= 0.0F) && (f2 <= 0.0F))
    {
      arrayOfzo[0] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[2] = new zo(paramzq.f(), paramzq.i() + paramzq.g());
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[0]);
      return localze;
    }
    switch (this.e.a)
    {
    case 2: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[3] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[4] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[6] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      break;
    case 1: 
      arrayOfzo[0] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), f2 + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), f2 + paramzq.g());
      arrayOfzo[4] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo(paramzq.f(), f2 + paramzq.g());
      arrayOfzo[6] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), f2 + paramzq.g());
      break;
    case 4: 
      arrayOfzo[0] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), f2 + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), f2 + paramzq.g());
      arrayOfzo[4] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo(paramzq.f(), f2 + paramzq.g());
      arrayOfzo[6] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), f2 + paramzq.g());
      break;
    case 3: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[3] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[4] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[6] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.i() - f2 + paramzq.g());
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[4], arrayOfzo[5]);
    localze.a(arrayOfzo[5], arrayOfzo[6]);
    localze.a(arrayOfzo[6], arrayOfzo[0]);
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */