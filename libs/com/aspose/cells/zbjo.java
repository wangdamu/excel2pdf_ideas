package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbjo
  extends zcp
{
  zbjo(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    zo[] arrayOfzo = new zo[18];
    float f5 = Math.min(paramzq.h(), paramzq.i());
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = f5 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        f2 = f5 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
        f3 = f5 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F;
        f4 = paramzq.h() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F;
      }
      else
      {
        f1 = f5 * 0.25F;
        f2 = f5 * 25000.0F / 100000.0F;
        f3 = f5 * 25000.0F / 100000.0F;
        f4 = paramzq.h() * 48123.0F / 100000.0F;
      }
    }
    else
    {
      f1 = f5 * 0.25F;
      f2 = f5 * 25000.0F / 100000.0F;
      f3 = f5 * 25000.0F / 100000.0F;
      f4 = paramzq.h() * 48123.0F / 100000.0F;
    }
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
  
  void a()
    throws Exception
  {
    zq localzq = new zq(this.e.y().f(), this.e.y().g(), this.e.y().h(), this.e.y().i());
    float f = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f = localzq.h() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F;
      } else {
        f = localzq.h() * 48123.0F / 100000.0F;
      }
    }
    else {
      f = localzq.h() * 48123.0F / 100000.0F;
    }
    localzq.a(localzq.f() + (localzq.h() - f) / 2.0F);
    localzq.c(f);
    c(localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbjo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */