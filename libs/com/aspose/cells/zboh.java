package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zboh
  extends zcp
{
  zboh(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = 1.0F;
    float f2 = 1.0F;
    zo[] arrayOfzo = new zo[10];
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f3;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = paramzq.h() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        if (paramzq.i() > paramzq.h()) {
          f3 = paramzq.i() / paramzq.h();
        } else {
          f3 = 1.0F;
        }
        f2 = paramzq.i() * (1.0F - com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / (100000.0F * f3));
      }
      else
      {
        f1 = paramzq.h() * 0.5F;
        f3 = paramzq.i() / paramzq.h();
        f2 = paramzq.i() * (1.0F - 50000.0F / (100000.0F * f3));
      }
    }
    else
    {
      f1 = paramzq.h() * 0.5F;
      f3 = paramzq.i() / paramzq.h();
      f2 = paramzq.i() * (1.0F - 50000.0F / (100000.0F * f3));
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
    switch (this.e.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(this.g, paramzq.i() - f2 + this.h);
      arrayOfzo[1] = new zo(paramzq.h() / 2.0F + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() - f2 + this.h);
      arrayOfzo[3] = new zo((paramzq.h() - f1) / 2.0F + f1 + this.g, paramzq.i() - f2 + this.h);
      arrayOfzo[4] = new zo((paramzq.h() - f1) / 2.0F + f1 + this.g, f2 + this.h);
      arrayOfzo[5] = new zo(paramzq.h() + this.g, f2 + this.h);
      arrayOfzo[6] = new zo(paramzq.h() / 2.0F + this.g, paramzq.i() + this.h);
      arrayOfzo[7] = new zo(this.g, f2 + this.h);
      arrayOfzo[8] = new zo((paramzq.h() - f1) / 2.0F + this.g, f2 + this.h);
      arrayOfzo[9] = new zo((paramzq.h() - f1) / 2.0F + this.g, paramzq.i() - f2 + this.h);
      break;
    case 2: 
      arrayOfzo[0] = new zo(this.g, paramzq.i() - f2 + this.h);
      arrayOfzo[1] = new zo(paramzq.h() / 2.0F + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() - f2 + this.h);
      arrayOfzo[3] = new zo((paramzq.h() - f1) / 2.0F + f1 + this.g, paramzq.i() - f2 + this.h);
      arrayOfzo[4] = new zo((paramzq.h() - f1) / 2.0F + f1 + this.g, f2 + this.h);
      arrayOfzo[5] = new zo(paramzq.h() + this.g, f2 + this.h);
      arrayOfzo[6] = new zo(paramzq.h() / 2.0F + this.g, paramzq.i() + this.h);
      arrayOfzo[7] = new zo(this.g, f2 + this.h);
      arrayOfzo[8] = new zo((paramzq.h() - f1) / 2.0F + this.g, f2 + this.h);
      arrayOfzo[9] = new zo((paramzq.h() - f1) / 2.0F + this.g, paramzq.i() - f2 + this.h);
      break;
    case 3: 
      arrayOfzo[0] = new zo(this.g, paramzq.i() - f2);
      arrayOfzo[1] = new zo(paramzq.h() / 2.0F, this.h);
      arrayOfzo[2] = new zo(paramzq.h(), paramzq.i() - f2);
      arrayOfzo[3] = new zo((paramzq.h() - f1) / 2.0F + f1, paramzq.i() - f2);
      arrayOfzo[4] = new zo((paramzq.h() - f1) / 2.0F + f1, f2);
      arrayOfzo[5] = new zo(paramzq.h(), f2);
      arrayOfzo[6] = new zo(paramzq.h() / 2.0F, paramzq.i());
      arrayOfzo[7] = new zo(this.g, f2);
      arrayOfzo[8] = new zo((paramzq.h() - f1) / 2.0F, f2);
      arrayOfzo[9] = new zo((paramzq.h() - f1) / 2.0F, paramzq.i() - f2);
      break;
    case 4: 
      arrayOfzo[0] = new zo(this.g, paramzq.i() - f2 + this.h);
      arrayOfzo[1] = new zo(paramzq.h() / 2.0F + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() - f2 + this.h);
      arrayOfzo[3] = new zo((paramzq.h() - f1) / 2.0F + f1 + this.g, paramzq.i() - f2 + this.h);
      arrayOfzo[4] = new zo((paramzq.h() - f1) / 2.0F + f1 + this.g, f2 + this.h);
      arrayOfzo[5] = new zo(paramzq.h() + this.g, f2 + this.h);
      arrayOfzo[6] = new zo(paramzq.h() / 2.0F + this.g, paramzq.i() + this.h);
      arrayOfzo[7] = new zo(this.g, f2 + this.h);
      arrayOfzo[8] = new zo((paramzq.h() - f1) / 2.0F + this.g, f2 + this.h);
      arrayOfzo[9] = new zo((paramzq.h() - f1) / 2.0F + this.g, paramzq.i() - f2 + this.h);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zboh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */