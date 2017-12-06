package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbnn
  extends zcp
{
  zbnn(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    zo[] arrayOfzo1 = new zo[6];
    zo[] arrayOfzo2 = new zo[8];
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
      }
      else
      {
        f1 = 0.0F;
        f2 = 0.0F;
      }
      if ((f1 != 0.0F) && (f2 == 0.0F))
      {
        switch (this.e.c)
        {
        case 1: 
          arrayOfzo1[0] = new zo(f1 + paramzq.f(), paramzq.g());
          arrayOfzo1[1] = new zo(paramzq.l() - f1, paramzq.g());
          arrayOfzo1[2] = new zo(paramzq.l(), f1 + paramzq.g());
          arrayOfzo1[3] = new zo(paramzq.l(), paramzq.m());
          arrayOfzo1[4] = new zo(paramzq.f(), paramzq.m());
          arrayOfzo1[5] = new zo(paramzq.f(), f1 + paramzq.g());
          break;
        case 2: 
          arrayOfzo1[0] = new zo(paramzq.f(), paramzq.g());
          arrayOfzo1[1] = new zo(paramzq.l(), paramzq.g());
          arrayOfzo1[2] = new zo(paramzq.l(), paramzq.m() - f1);
          arrayOfzo1[3] = new zo(paramzq.l() - f1, paramzq.m());
          arrayOfzo1[4] = new zo(f1 + paramzq.f(), paramzq.m());
          arrayOfzo1[5] = new zo(paramzq.f(), paramzq.m() - f1);
          break;
        case 3: 
          arrayOfzo1[0] = new zo(paramzq.f(), paramzq.g());
          arrayOfzo1[1] = new zo(paramzq.l(), paramzq.g());
          arrayOfzo1[2] = new zo(paramzq.l(), paramzq.m() - f1);
          arrayOfzo1[3] = new zo(paramzq.l() - f1, paramzq.m());
          arrayOfzo1[4] = new zo(f1 + paramzq.f(), paramzq.m());
          arrayOfzo1[5] = new zo(paramzq.f(), paramzq.m() - f1);
          break;
        case 4: 
          arrayOfzo1[0] = new zo(f1 + paramzq.f(), paramzq.g());
          arrayOfzo1[1] = new zo(paramzq.l() - f1, paramzq.g());
          arrayOfzo1[2] = new zo(paramzq.l(), f1 + paramzq.g());
          arrayOfzo1[3] = new zo(paramzq.l(), paramzq.m());
          arrayOfzo1[4] = new zo(paramzq.f(), paramzq.m());
          arrayOfzo1[5] = new zo(paramzq.f(), f1 + paramzq.g());
        }
        localze.a(arrayOfzo1[0], arrayOfzo1[1]);
        localze.a(arrayOfzo1[1], arrayOfzo1[2]);
        localze.a(arrayOfzo1[2], arrayOfzo1[3]);
        localze.a(arrayOfzo1[3], arrayOfzo1[4]);
        localze.a(arrayOfzo1[4], arrayOfzo1[5]);
        localze.a(arrayOfzo1[5], arrayOfzo1[0]);
      }
      else if ((f1 == 0.0F) && (f2 != 0.0F))
      {
        switch (this.e.c)
        {
        case 1: 
          arrayOfzo1[0] = new zo(paramzq.f(), paramzq.g());
          arrayOfzo1[1] = new zo(paramzq.l(), paramzq.g());
          arrayOfzo1[2] = new zo(paramzq.l(), paramzq.m() - f2);
          arrayOfzo1[3] = new zo(paramzq.l() - f2, paramzq.m());
          arrayOfzo1[4] = new zo(f2 + paramzq.f(), paramzq.m());
          arrayOfzo1[5] = new zo(paramzq.f(), paramzq.m() - f2);
          break;
        case 2: 
          arrayOfzo1[0] = new zo(f2 + paramzq.f(), paramzq.g());
          arrayOfzo1[1] = new zo(paramzq.l() - f2, paramzq.g());
          arrayOfzo1[2] = new zo(paramzq.l(), f2 + paramzq.g());
          arrayOfzo1[3] = new zo(paramzq.l(), paramzq.m());
          arrayOfzo1[4] = new zo(paramzq.f(), paramzq.m());
          arrayOfzo1[5] = new zo(paramzq.f(), f2 + paramzq.g());
          break;
        case 3: 
          arrayOfzo1[0] = new zo(f2 + paramzq.f(), paramzq.g());
          arrayOfzo1[1] = new zo(paramzq.l() - f2, paramzq.g());
          arrayOfzo1[2] = new zo(paramzq.l(), f2 + paramzq.g());
          arrayOfzo1[3] = new zo(paramzq.l(), paramzq.m());
          arrayOfzo1[4] = new zo(paramzq.f(), paramzq.m());
          arrayOfzo1[5] = new zo(paramzq.f(), f2 + paramzq.g());
          break;
        case 4: 
          arrayOfzo1[0] = new zo(paramzq.f(), paramzq.g());
          arrayOfzo1[1] = new zo(paramzq.l(), paramzq.g());
          arrayOfzo1[2] = new zo(paramzq.l(), paramzq.m() - f2);
          arrayOfzo1[3] = new zo(paramzq.l() - f2, paramzq.m());
          arrayOfzo1[4] = new zo(f2 + paramzq.f(), paramzq.m());
          arrayOfzo1[5] = new zo(paramzq.f(), paramzq.m() - f2);
        }
        localze.a(arrayOfzo1[0], arrayOfzo1[1]);
        localze.a(arrayOfzo1[1], arrayOfzo1[2]);
        localze.a(arrayOfzo1[2], arrayOfzo1[3]);
        localze.a(arrayOfzo1[3], arrayOfzo1[4]);
        localze.a(arrayOfzo1[4], arrayOfzo1[5]);
        localze.a(arrayOfzo1[5], arrayOfzo1[0]);
      }
      else if ((f1 != 0.0F) && (f2 != 0.0F))
      {
        switch (this.e.c)
        {
        case 1: 
          arrayOfzo2[0] = new zo(f1 + paramzq.f(), paramzq.g());
          arrayOfzo2[1] = new zo(paramzq.l() - f1, paramzq.g());
          arrayOfzo2[2] = new zo(paramzq.l(), f1 + paramzq.g());
          arrayOfzo2[3] = new zo(paramzq.l(), paramzq.m() - f2);
          arrayOfzo2[4] = new zo(paramzq.l() - f2, paramzq.m());
          arrayOfzo2[5] = new zo(f2 + paramzq.f(), paramzq.m());
          arrayOfzo2[6] = new zo(paramzq.f(), paramzq.m() - f2);
          arrayOfzo2[7] = new zo(paramzq.f(), f1 + paramzq.g());
          break;
        case 2: 
          arrayOfzo2[0] = new zo(f2 + paramzq.f(), paramzq.g());
          arrayOfzo2[1] = new zo(paramzq.l() - f2, paramzq.g());
          arrayOfzo2[2] = new zo(paramzq.l(), f2 + paramzq.g());
          arrayOfzo2[3] = new zo(paramzq.l(), paramzq.m() - f1);
          arrayOfzo2[4] = new zo(paramzq.l() - f1, paramzq.m());
          arrayOfzo2[5] = new zo(f1 + paramzq.f(), paramzq.m());
          arrayOfzo2[6] = new zo(paramzq.f(), paramzq.m() - f1);
          arrayOfzo2[7] = new zo(paramzq.f(), f2 + paramzq.g());
          break;
        case 3: 
          arrayOfzo2[0] = new zo(f2 + paramzq.f(), paramzq.g());
          arrayOfzo2[1] = new zo(paramzq.l() - f2, paramzq.g());
          arrayOfzo2[2] = new zo(paramzq.l(), f2 + paramzq.g());
          arrayOfzo2[3] = new zo(paramzq.l(), paramzq.m() - f1);
          arrayOfzo2[4] = new zo(paramzq.l() - f1, paramzq.m());
          arrayOfzo2[5] = new zo(f1 + paramzq.f(), paramzq.m());
          arrayOfzo2[6] = new zo(paramzq.f(), paramzq.m() - f1);
          arrayOfzo2[7] = new zo(paramzq.f(), f2 + paramzq.g());
          break;
        case 4: 
          arrayOfzo2[0] = new zo(f1 + paramzq.f(), paramzq.g());
          arrayOfzo2[1] = new zo(paramzq.l() - f1, paramzq.g());
          arrayOfzo2[2] = new zo(paramzq.l(), f1 + paramzq.g());
          arrayOfzo2[3] = new zo(paramzq.l(), paramzq.m() - f2);
          arrayOfzo2[4] = new zo(paramzq.l() - f2, paramzq.m());
          arrayOfzo2[5] = new zo(f2 + paramzq.f(), paramzq.m());
          arrayOfzo2[6] = new zo(paramzq.f(), paramzq.m() - f2);
          arrayOfzo2[7] = new zo(paramzq.f(), f1 + paramzq.g());
        }
        localze.a(arrayOfzo2[0], arrayOfzo2[1]);
        localze.a(arrayOfzo2[1], arrayOfzo2[2]);
        localze.a(arrayOfzo2[2], arrayOfzo2[3]);
        localze.a(arrayOfzo2[3], arrayOfzo2[4]);
        localze.a(arrayOfzo2[4], arrayOfzo2[5]);
        localze.a(arrayOfzo2[5], arrayOfzo2[6]);
        localze.a(arrayOfzo2[6], arrayOfzo2[7]);
        localze.a(arrayOfzo2[7], arrayOfzo2[0]);
      }
      else
      {
        localze.b(paramzq);
      }
    }
    else
    {
      f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
      switch (this.e.c)
      {
      case 1: 
        arrayOfzo1[0] = new zo(f1 + paramzq.f(), paramzq.g());
        arrayOfzo1[1] = new zo(paramzq.l() - f1, paramzq.g());
        arrayOfzo1[2] = new zo(paramzq.l(), f1 + paramzq.g());
        arrayOfzo1[3] = new zo(paramzq.l(), paramzq.m());
        arrayOfzo1[4] = new zo(paramzq.f(), paramzq.m());
        arrayOfzo1[5] = new zo(paramzq.f(), f1 + paramzq.g());
        break;
      case 2: 
        arrayOfzo1[0] = new zo(paramzq.f(), paramzq.g());
        arrayOfzo1[1] = new zo(paramzq.l(), paramzq.g());
        arrayOfzo1[2] = new zo(paramzq.l(), paramzq.m() - f1);
        arrayOfzo1[3] = new zo(paramzq.l() - f1, paramzq.m());
        arrayOfzo1[4] = new zo(f1 + paramzq.f(), paramzq.m());
        arrayOfzo1[5] = new zo(paramzq.f(), paramzq.m() - f1);
        break;
      case 3: 
        arrayOfzo1[0] = new zo(paramzq.f(), paramzq.g());
        arrayOfzo1[1] = new zo(paramzq.l(), paramzq.g());
        arrayOfzo1[2] = new zo(paramzq.l(), paramzq.m() - f1);
        arrayOfzo1[3] = new zo(paramzq.l() - f1, paramzq.i());
        arrayOfzo1[4] = new zo(f1 + paramzq.f(), paramzq.m());
        arrayOfzo1[5] = new zo(paramzq.f(), paramzq.m() - f1);
        break;
      case 4: 
        arrayOfzo1[0] = new zo(f1 + paramzq.f(), paramzq.g());
        arrayOfzo1[1] = new zo(paramzq.l() - f1, paramzq.g());
        arrayOfzo1[2] = new zo(paramzq.l(), f1 + paramzq.g());
        arrayOfzo1[3] = new zo(paramzq.l(), paramzq.m());
        arrayOfzo1[4] = new zo(paramzq.f(), paramzq.m());
        arrayOfzo1[5] = new zo(paramzq.f(), f1 + paramzq.g());
      }
      localze.a(arrayOfzo1[0], arrayOfzo1[1]);
      localze.a(arrayOfzo1[1], arrayOfzo1[2]);
      localze.a(arrayOfzo1[2], arrayOfzo1[3]);
      localze.a(arrayOfzo1[3], arrayOfzo1[4]);
      localze.a(arrayOfzo1[4], arrayOfzo1[5]);
      localze.a(arrayOfzo1[5], arrayOfzo1[0]);
    }
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
    float f2 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
      }
      else
      {
        f1 = 0.0F;
        f2 = 0.0F;
      }
    }
    else {
      f2 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
    }
    if ((f1 <= 0.0F) && (f2 <= 0.0F)) {
      return paramzq;
    }
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    float f3 = f1 / 2.0F;
    float f4 = f2 / 2.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    if ((this.e.c == 1) || (this.e.c == 4))
    {
      f5 = f3 > f4 ? f3 : f4;
      f6 = f3 > f4 ? f3 : f4;
      f7 = f3;
      f8 = f4;
    }
    else
    {
      f5 = f3 > f4 ? f3 : f4;
      f6 = f3 > f4 ? f3 : f4;
      f7 = f4;
      f8 = f3;
    }
    localzq.a(localzq.f() + f5);
    localzq.c(localzq.h() - f5);
    localzq.c(localzq.h() - f6);
    localzq.b(localzq.g() + f7);
    localzq.d(localzq.i() - f7);
    localzq.d(localzq.i() - f8);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */