package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbkv
  extends zcp
{
  zbkv(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
      }
    }
    else {
      f = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
    }
    if (f <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    zo[] arrayOfzo = new zo[5];
    switch (this.e.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.l() - f, paramzq.g());
      arrayOfzo[2] = new zo(paramzq.l(), f + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.l(), paramzq.m());
      arrayOfzo[4] = new zo(paramzq.f(), paramzq.m());
      break;
    case 2: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.l(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.l(), paramzq.m() - f);
      arrayOfzo[3] = new zo(paramzq.l() - f, paramzq.m());
      arrayOfzo[4] = new zo(paramzq.f(), paramzq.m());
      break;
    case 3: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.l(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.l(), paramzq.m());
      arrayOfzo[3] = new zo(f + paramzq.f(), paramzq.m());
      arrayOfzo[4] = new zo(paramzq.f(), paramzq.m() - f);
      break;
    case 4: 
      arrayOfzo[0] = new zo(f + paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.l(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.l(), paramzq.m());
      arrayOfzo[3] = new zo(paramzq.f(), paramzq.m());
      arrayOfzo[4] = new zo(paramzq.f(), f + paramzq.g());
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[4], arrayOfzo[0]);
    localze.j();
    return localze;
  }
  
  void a()
    throws Exception
  {
    zq localzq = d(this.e.y());
    super.c(localzq);
  }
  
  private zq d(zq paramzq)
  {
    float f1 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f1 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
      }
    }
    else {
      f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
    }
    if (f1 <= 0.0F) {
      return paramzq;
    }
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    float f2 = f1 / 2.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    switch (this.e.c)
    {
    case 1: 
      f4 = f2;
      f5 = f2;
      break;
    case 2: 
      f5 = f2;
      f6 = f2;
      break;
    case 3: 
      f3 = f2;
      f6 = f2;
      break;
    case 4: 
      f3 = f2;
      f4 = f2;
    }
    localzq.a(localzq.f() + f3);
    localzq.c(localzq.h() - f3);
    localzq.c(localzq.h() - f5);
    localzq.b(localzq.g() + f4);
    localzq.d(localzq.i() - f4);
    localzq.d(localzq.i() - f6);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbkv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */