package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbjp
  extends zco
{
  zbjp(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = 1.0F;
    float f2 = 1.0F;
    zo[] arrayOfzo = new zo[10];
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    switch (this.e.l.a.size())
    {
    case 2: 
      f2 = paramzq.h() - com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F * paramzq.h();
      f1 = paramzq.i() - 2.0F * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F * paramzq.i());
      break;
    case 1: 
      if (((zar)this.e.l.a.get(0)).b() == 327)
      {
        f2 = paramzq.h() - com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F * paramzq.h();
        f1 = paramzq.i() - 2.0F * (paramzq.i() * 0.2336574F);
      }
      else
      {
        f2 = paramzq.h() * 0.74703705F;
        f1 = paramzq.i() - 2.0F * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F * paramzq.i());
      }
      break;
    default: 
      f1 = paramzq.i() - 2.0F * (paramzq.i() * 0.2336574F);
      f2 = paramzq.h() * 0.74703705F;
    }
    if ((f1 <= 0.0F) && (f2 == paramzq.h()))
    {
      arrayOfzo[0] = new zo(this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[3] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[2]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      return localze;
    }
    if ((f1 <= 0.0F) && (f2 <= 0.0F))
    {
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[2] = new zo(this.g, paramzq.i() + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[0]);
      return localze;
    }
    switch (this.e.a)
    {
    case 1: 
      arrayOfzo[0] = new zo(this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[1] = new zo(paramzq.h() - f2 + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() - f2 + this.g, (paramzq.i() - f1) / 2.0F + this.h);
      arrayOfzo[3] = new zo(f2 + this.g, (paramzq.i() - f1) / 2.0F + this.h);
      arrayOfzo[4] = new zo(f2 + this.g, this.h);
      arrayOfzo[5] = new zo(paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[6] = new zo(f2 + this.g, paramzq.i() + this.h);
      arrayOfzo[7] = new zo(f2 + this.g, (paramzq.i() - f1) / 2.0F + f1 + this.h);
      arrayOfzo[8] = new zo(paramzq.h() - f2 + this.g, (paramzq.i() - f1) / 2.0F + f1 + this.h);
      arrayOfzo[9] = new zo(paramzq.h() - f2 + this.g, paramzq.i() + this.h);
      break;
    case 2: 
      arrayOfzo[0] = new zo(this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[1] = new zo(paramzq.h() - f2 + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() - f2 + this.g, (paramzq.i() - f1) / 2.0F + this.h);
      arrayOfzo[3] = new zo(f2 + this.g, (paramzq.i() - f1) / 2.0F + this.h);
      arrayOfzo[4] = new zo(f2 + this.g, this.h);
      arrayOfzo[5] = new zo(paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[6] = new zo(f2 + this.g, paramzq.i() + this.h);
      arrayOfzo[7] = new zo(f2 + this.g, (paramzq.i() - f1) / 2.0F + f1 + this.h);
      arrayOfzo[8] = new zo(paramzq.h() - f2 + this.g, (paramzq.i() - f1) / 2.0F + f1 + this.h);
      arrayOfzo[9] = new zo(paramzq.h() - f2 + this.g, paramzq.i() + this.h);
      break;
    case 3: 
      arrayOfzo[0] = new zo(this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[1] = new zo(paramzq.h() - f2 + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() - f2 + this.g, (paramzq.i() - f1) / 2.0F + this.h);
      arrayOfzo[3] = new zo(f2 + this.g, (paramzq.i() - f1) / 2.0F + this.h);
      arrayOfzo[4] = new zo(f2 + this.g, this.h);
      arrayOfzo[5] = new zo(paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[6] = new zo(f2 + this.g, paramzq.i() + this.h);
      arrayOfzo[7] = new zo(f2 + this.g, (paramzq.i() - f1) / 2.0F + f1 + this.h);
      arrayOfzo[8] = new zo(paramzq.h() - f2 + this.g, (paramzq.i() - f1) / 2.0F + f1 + this.h);
      arrayOfzo[9] = new zo(paramzq.h() - f2 + this.g, paramzq.i() + this.h);
      break;
    case 4: 
      arrayOfzo[0] = new zo(this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[1] = new zo(paramzq.h() - f2 + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() - f2 + this.g, (paramzq.i() - f1) / 2.0F + this.h);
      arrayOfzo[3] = new zo(f2 + this.g, (paramzq.i() - f1) / 2.0F + this.h);
      arrayOfzo[4] = new zo(f2 + this.g, this.h);
      arrayOfzo[5] = new zo(paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[6] = new zo(f2 + this.g, paramzq.i() + this.h);
      arrayOfzo[7] = new zo(f2 + this.g, (paramzq.i() - f1) / 2.0F + f1 + this.h);
      arrayOfzo[8] = new zo(paramzq.h() - f2 + this.g, (paramzq.i() - f1) / 2.0F + f1 + this.h);
      arrayOfzo[9] = new zo(paramzq.h() - f2 + this.g, paramzq.i() + this.h);
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[4], arrayOfzo[5]);
    localze.a(arrayOfzo[5], arrayOfzo[6]);
    localze.a(arrayOfzo[6], arrayOfzo[7]);
    localze.a(arrayOfzo[7], arrayOfzo[8]);
    localze.a(arrayOfzo[8], arrayOfzo[9]);
    localze.a(arrayOfzo[9], arrayOfzo[0]);
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbjp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */