package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

class zbna
  extends zcp
{
  zbna(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    zo[] arrayOfzo = new zo[6];
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
        f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
        f2 = 0.0F;
      }
    }
    else
    {
      f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
      f2 = 0.0F;
    }
    if ((f1 <= 0.0F) && (f2 == 0.0F))
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    zq localzq1 = new zq(paramzq.d(), new zt(f1 * 2.0F, f1 * 2.0F));
    zq localzq2 = new zq(paramzq.d(), new zt(f2 * 2.0F, f2 * 2.0F));
    if ((f1 != 0.0F) && (f2 != 0.0F)) {
      switch (this.e.c)
      {
      case 1: 
        localze.a(localzq1, 180.0F, 90.0F);
        localzq2.a(paramzq.l() - f2 * 2.0F);
        localze.a(localzq2, 270.0F, 90.0F);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localzq1.b(paramzq.m() - f1 * 2.0F);
        localze.a(localzq1, 0.0F, 90.0F);
        localzq2.a(paramzq.j());
        localzq2.b(paramzq.m() - f2 * 2.0F);
        localze.a(localzq2, 90.0F, 90.0F);
        break;
      case 2: 
        localze.a(localzq2, 180.0F, 90.0F);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localze.a(localzq1, 270.0F, 90.0F);
        localzq2.a(paramzq.l() - f2 * 2.0F);
        localzq2.b(paramzq.m() - f2 * 2.0F);
        localze.a(localzq2, 0.0F, 90.0F);
        localzq1.a(paramzq.j());
        localzq1.b(paramzq.m() - f1 * 2.0F);
        localze.a(localzq1, 90.0F, 90.0F);
        break;
      case 3: 
        localze.a(localzq1, 180.0F, 90.0F);
        localzq2.a(paramzq.l() - f2 * 2.0F);
        localze.a(localzq2, 270.0F, 90.0F);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localzq1.b(paramzq.m() - f1 * 2.0F);
        localze.a(localzq1, 0.0F, 90.0F);
        localzq2.a(paramzq.j());
        localzq2.b(paramzq.m() - f2 * 2.0F);
        localze.a(localzq2, 90.0F, 90.0F);
        break;
      case 4: 
        localze.a(localzq2, 180.0F, 90.0F);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localze.a(localzq1, 270.0F, 90.0F);
        localzq2.a(paramzq.l() - f2 * 2.0F);
        localzq2.b(paramzq.m() - f2 * 2.0F);
        localze.a(localzq2, 0.0F, 90.0F);
        localzq1.a(paramzq.j());
        localzq1.b(paramzq.m() - f1 * 2.0F);
        localze.a(localzq1, 90.0F, 90.0F);
      }
    } else if ((f1 != 0.0F) && (f2 == 0.0F)) {
      switch (this.e.c)
      {
      case 1: 
        arrayOfzo[0] = new zo(f1 + paramzq.f(), paramzq.g());
        arrayOfzo[1] = new zo(paramzq.l(), paramzq.g());
        arrayOfzo[2] = new zo(paramzq.l(), paramzq.m() - f1);
        arrayOfzo[3] = new zo(paramzq.l() - f1, paramzq.m());
        arrayOfzo[4] = new zo(paramzq.f(), paramzq.m());
        arrayOfzo[5] = new zo(paramzq.f(), f1 + paramzq.g());
        localze.a(localzq1, 180.0F, 90.0F);
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.a(arrayOfzo[1], arrayOfzo[2]);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localzq1.b(paramzq.m() - f1 * 2.0F);
        localze.a(localzq1, 0.0F, 90.0F);
        localze.a(arrayOfzo[3], arrayOfzo[4]);
        localze.a(arrayOfzo[4], arrayOfzo[5]);
        break;
      case 2: 
        arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
        arrayOfzo[1] = new zo(paramzq.l() - f1, paramzq.g());
        arrayOfzo[2] = new zo(paramzq.l(), f1 + paramzq.g());
        arrayOfzo[3] = new zo(paramzq.l(), paramzq.m());
        arrayOfzo[4] = new zo(f1 + paramzq.f(), paramzq.m());
        arrayOfzo[5] = new zo(paramzq.f(), paramzq.m() - f1);
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localze.a(localzq1, 270.0F, 90.0F);
        localze.a(arrayOfzo[2], arrayOfzo[3]);
        localze.a(arrayOfzo[3], arrayOfzo[4]);
        localzq1.a(paramzq.j());
        localzq1.b(paramzq.m() - f1 * 2.0F);
        localze.a(localzq1, 90.0F, 90.0F);
        localze.a(arrayOfzo[5], arrayOfzo[0]);
        break;
      case 3: 
        arrayOfzo[0] = new zo(f1 + paramzq.f(), paramzq.g());
        arrayOfzo[1] = new zo(paramzq.l(), paramzq.g());
        arrayOfzo[2] = new zo(paramzq.l(), paramzq.m() - f1);
        arrayOfzo[3] = new zo(paramzq.l() - f1, paramzq.m());
        arrayOfzo[4] = new zo(paramzq.f(), paramzq.m());
        arrayOfzo[5] = new zo(paramzq.f(), f1 + paramzq.g());
        localze.a(localzq1, 180.0F, 90.0F);
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.a(arrayOfzo[1], arrayOfzo[2]);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localzq1.b(paramzq.m() - f1 * 2.0F);
        localze.a(localzq1, 0.0F, 90.0F);
        localze.a(arrayOfzo[3], arrayOfzo[4]);
        localze.a(arrayOfzo[4], arrayOfzo[5]);
        break;
      case 4: 
        arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
        arrayOfzo[1] = new zo(paramzq.l() - f1, paramzq.g());
        arrayOfzo[2] = new zo(paramzq.l(), f1 + paramzq.g());
        arrayOfzo[3] = new zo(paramzq.l(), paramzq.m());
        arrayOfzo[4] = new zo(f1 + paramzq.f(), paramzq.m());
        arrayOfzo[5] = new zo(paramzq.f(), paramzq.m() - f1);
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localze.a(localzq1, 270.0F, 90.0F);
        localze.a(arrayOfzo[2], arrayOfzo[3]);
        localze.a(arrayOfzo[3], arrayOfzo[4]);
        localzq1.a(paramzq.j());
        localzq1.b(paramzq.m() - f1 * 2.0F);
        localze.a(localzq1, 90.0F, 90.0F);
        localze.a(arrayOfzo[5], arrayOfzo[0]);
      }
    } else if ((f1 == 0.0F) && (f2 != 0.0F)) {
      switch (this.e.c)
      {
      case 1: 
        arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
        arrayOfzo[1] = new zo(paramzq.l() - f2, paramzq.g());
        arrayOfzo[2] = new zo(paramzq.l(), f2 + paramzq.g());
        arrayOfzo[3] = new zo(paramzq.l(), paramzq.m());
        arrayOfzo[4] = new zo(f2 + paramzq.f(), paramzq.m());
        arrayOfzo[5] = new zo(paramzq.f(), paramzq.m() - f2);
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localzq2.a(paramzq.l() - f2 * 2.0F);
        localze.a(localzq2, 270.0F, 90.0F);
        localze.a(arrayOfzo[2], arrayOfzo[3]);
        localze.a(arrayOfzo[3], arrayOfzo[4]);
        localzq2.a(paramzq.j());
        localzq2.b(paramzq.m() - f2 * 2.0F);
        localze.a(localzq2, 90.0F, 90.0F);
        localze.a(arrayOfzo[5], arrayOfzo[0]);
        break;
      case 2: 
        arrayOfzo[0] = new zo(f2 + paramzq.f(), paramzq.g());
        arrayOfzo[1] = new zo(paramzq.l(), paramzq.g());
        arrayOfzo[2] = new zo(paramzq.l(), paramzq.m() - f2);
        arrayOfzo[3] = new zo(paramzq.l() - f2, paramzq.m());
        arrayOfzo[4] = new zo(paramzq.f(), paramzq.m());
        arrayOfzo[5] = new zo(paramzq.f(), f2 + paramzq.g());
        localze.a(localzq2, 180.0F, 90.0F);
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.a(arrayOfzo[1], arrayOfzo[2]);
        localzq2.a(paramzq.l() - f2 * 2.0F);
        localzq2.b(paramzq.m() - f2 * 2.0F);
        localze.a(localzq2, 0.0F, 90.0F);
        localze.a(arrayOfzo[3], arrayOfzo[4]);
        localze.a(arrayOfzo[4], arrayOfzo[5]);
        break;
      case 3: 
        arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
        arrayOfzo[1] = new zo(paramzq.l() - f2, paramzq.g());
        arrayOfzo[2] = new zo(paramzq.l(), f2 + paramzq.g());
        arrayOfzo[3] = new zo(paramzq.l(), paramzq.m());
        arrayOfzo[4] = new zo(f2 + paramzq.f(), paramzq.m());
        arrayOfzo[5] = new zo(paramzq.f(), paramzq.m() - f2);
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localzq2.a(paramzq.l() - f2 * 2.0F);
        localze.a(localzq2, 270.0F, 90.0F);
        localze.a(arrayOfzo[2], arrayOfzo[3]);
        localze.a(arrayOfzo[3], arrayOfzo[4]);
        localzq2.a(paramzq.j());
        localzq2.b(paramzq.m() - f2 * 2.0F);
        localze.a(localzq2, 90.0F, 90.0F);
        localze.a(arrayOfzo[5], arrayOfzo[0]);
        break;
      case 4: 
        arrayOfzo[0] = new zo(f2 + paramzq.f(), paramzq.g());
        arrayOfzo[1] = new zo(paramzq.l(), paramzq.g());
        arrayOfzo[2] = new zo(paramzq.l(), paramzq.m() - f2);
        arrayOfzo[3] = new zo(paramzq.l() - f2, paramzq.m());
        arrayOfzo[4] = new zo(paramzq.f(), paramzq.m());
        arrayOfzo[5] = new zo(paramzq.f(), f2 + paramzq.g());
        localze.a(localzq2, 180.0F, 90.0F);
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.a(arrayOfzo[1], arrayOfzo[2]);
        localzq2.a(paramzq.l() - f2 * 2.0F);
        localzq2.b(paramzq.m() - f2 * 2.0F);
        localze.a(localzq2, 0.0F, 90.0F);
        localze.a(arrayOfzo[3], arrayOfzo[4]);
        localze.a(arrayOfzo[4], arrayOfzo[5]);
      }
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
      if (this.e.n.a.size() > 1)
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
      }
      else
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
        f2 = 0.0F;
      }
    }
    else
    {
      f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
      f2 = 0.0F;
    }
    if ((f1 <= 0.0F) && (f2 <= 0.0F)) {
      return paramzq;
    }
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    float f3 = f1 / 3.0F;
    float f4 = f2 / 3.0F;
    float f5 = f3 > f4 ? f3 : f4;
    float f6 = f5;
    float f7 = f5;
    float f8 = f5;
    localzq.a(localzq.f() + f5);
    localzq.c(localzq.h() - f5);
    localzq.c(localzq.h() - f6);
    localzq.b(localzq.g() + f7);
    localzq.d(localzq.i() - f7);
    localzq.d(localzq.i() - f8);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */