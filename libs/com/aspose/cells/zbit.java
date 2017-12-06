package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbit
  extends zcp
{
  zbit(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[6];
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
        f3 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) + com.aspose.cells.b.a.ze.a(this.e.n.a.get(1));
      }
      else
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * 0.33333F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * 0.33333F;
      }
    }
    else
    {
      f1 = Math.min(paramzq.h(), paramzq.i()) * 0.33333F;
      f2 = Math.min(paramzq.h(), paramzq.i()) * 0.33333F;
    }
    if (f1 <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    if (f3 == 100000.0F)
    {
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(this.g, paramzq.i() + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[0]);
    }
    else
    {
      float f4 = (paramzq.i() - f1) * paramzq.h() / paramzq.i();
      float f5 = (paramzq.h() - f2) * paramzq.i() / paramzq.h();
      switch (this.e.c)
      {
      case 1: 
        arrayOfzo[0] = new zo(this.g, this.h);
        arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
        arrayOfzo[2] = new zo(f4 + this.g, f1 + this.h);
        arrayOfzo[3] = new zo(f2 + this.g, f1 + this.h);
        arrayOfzo[4] = new zo(f2 + this.g, f5 + this.h);
        arrayOfzo[5] = new zo(this.g, paramzq.i() + this.h);
        break;
      case 2: 
        arrayOfzo[0] = new zo(this.g, this.h);
        arrayOfzo[1] = new zo(f2 + this.g, paramzq.i() - f5 + this.h);
        arrayOfzo[2] = new zo(f2 + this.g, paramzq.i() - f1 + this.h);
        arrayOfzo[3] = new zo(f4 + this.g, paramzq.i() - f1 + this.h);
        arrayOfzo[4] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
        arrayOfzo[5] = new zo(this.g, paramzq.i() + this.h);
        break;
      case 3: 
        arrayOfzo[0] = new zo(this.g + paramzq.h(), this.h);
        arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h + paramzq.i());
        arrayOfzo[2] = new zo(this.g, paramzq.i() + this.h);
        arrayOfzo[3] = new zo(paramzq.h() - f4 + this.g, paramzq.i() - f1 + this.h);
        arrayOfzo[4] = new zo(paramzq.h() - f2 + this.g, paramzq.i() - f1 + this.h);
        arrayOfzo[5] = new zo(this.g + paramzq.h() - f2, paramzq.i() - f5 + this.h);
        break;
      case 4: 
        arrayOfzo[0] = new zo(this.g, this.h);
        arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
        arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
        arrayOfzo[3] = new zo(paramzq.h() - f2 + this.g, f5 + this.h);
        arrayOfzo[4] = new zo(paramzq.h() - f2 + this.g, f1 + this.h);
        arrayOfzo[5] = new zo(paramzq.h() - f4 + this.g, f1 + this.h);
      }
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      localze.a(arrayOfzo[3], arrayOfzo[4]);
      localze.a(arrayOfzo[4], arrayOfzo[5]);
      localze.a(arrayOfzo[5], arrayOfzo[0]);
      localze.j();
    }
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */