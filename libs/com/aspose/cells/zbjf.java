package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbjf
  extends zcp
{
  zbjf(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[6];
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
      }
      else
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * 0.5F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * 0.5F;
      }
    }
    else
    {
      f1 = Math.min(paramzq.h(), paramzq.i()) * 0.5F;
      f2 = Math.min(paramzq.h(), paramzq.i()) * 0.5F;
    }
    if ((f1 <= 0.0F) && (f2 <= 0.0F))
    {
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(this.g, paramzq.i() + this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      return localze;
    }
    switch (this.e.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(f2 + this.g, this.h);
      arrayOfzo[2] = new zo(f2 + this.g, paramzq.i() - f1 + this.h);
      arrayOfzo[3] = new zo(paramzq.h() + this.g, paramzq.i() - f1 + this.h);
      arrayOfzo[4] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[5] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 2: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, f1 + this.h);
      arrayOfzo[3] = new zo(f2 + this.g, f1 + this.h);
      arrayOfzo[4] = new zo(f2 + this.g, paramzq.i() + this.h);
      arrayOfzo[5] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 3: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(paramzq.h() - f2 + this.g, paramzq.i() + this.h);
      arrayOfzo[4] = new zo(paramzq.h() - f2 + this.g, f1 + this.h);
      arrayOfzo[5] = new zo(this.g, f1 + this.h);
      break;
    case 4: 
      arrayOfzo[0] = new zo(paramzq.h() - f2 + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(this.g, paramzq.i() + this.h);
      arrayOfzo[4] = new zo(this.g, paramzq.i() - f1 + this.h);
      arrayOfzo[5] = new zo(paramzq.h() - f2 + this.g, paramzq.i() - f1 + this.h);
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[5], arrayOfzo[0]);
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbjf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */