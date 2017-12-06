package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbmh
  extends zcp
{
  zbmh(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    float f5 = 0.0F;
    zo[] arrayOfzo = new zo[32];
    float f6 = Math.min(paramzq.h(), paramzq.i());
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = f6 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        f2 = f6 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
        f3 = f6 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F;
        f4 = paramzq.i() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F;
        f5 = paramzq.h() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F;
      }
      else
      {
        f1 = f6 * 0.18515F;
        f2 = f6 * 18515.0F / 100000.0F;
        f3 = f6 * 18515.0F / 100000.0F;
        f4 = paramzq.i() * 48123.0F / 100000.0F;
        f5 = paramzq.h() * 48123.0F / 100000.0F;
      }
    }
    else
    {
      f1 = f6 * 0.18515F;
      f2 = f6 * 18515.0F / 100000.0F;
      f3 = f6 * 18515.0F / 100000.0F;
      f4 = paramzq.i() * 48123.0F / 100000.0F;
      f5 = paramzq.h() * 48123.0F / 100000.0F;
    }
    arrayOfzo[0] = new zo(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F);
    arrayOfzo[1] = new zo(paramzq.f() + f3, paramzq.g() + paramzq.i() / 2.0F - f2);
    arrayOfzo[2] = new zo(paramzq.f() + f3, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F);
    arrayOfzo[3] = new zo(paramzq.f() + (paramzq.h() - f5) / 2.0F, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F);
    arrayOfzo[4] = new zo(paramzq.f() + (paramzq.h() - f5) / 2.0F, paramzq.g() + (paramzq.i() - f4) / 2.0F);
    arrayOfzo[5] = new zo(paramzq.f() + paramzq.h() / 2.0F - f1 / 2.0F, paramzq.g() + (paramzq.i() - f4) / 2.0F);
    arrayOfzo[6] = new zo(paramzq.f() + paramzq.h() / 2.0F - f1 / 2.0F, paramzq.g() + f3);
    arrayOfzo[7] = new zo(paramzq.f() + (paramzq.h() - 2.0F * f2) / 2.0F, paramzq.g() + f3);
    arrayOfzo[8] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g());
    arrayOfzo[9] = new zo(paramzq.f() + paramzq.h() / 2.0F + f2, paramzq.g() + f3);
    arrayOfzo[10] = new zo(paramzq.f() + paramzq.h() / 2.0F + f1 / 2.0F, paramzq.g() + f3);
    arrayOfzo[11] = new zo(paramzq.f() + paramzq.h() / 2.0F + f1 / 2.0F, paramzq.g() + (paramzq.i() - f4) / 2.0F);
    arrayOfzo[12] = new zo(paramzq.f() + (paramzq.h() - (paramzq.h() - f5) / 2.0F), paramzq.g() + (paramzq.i() - f4) / 2.0F);
    arrayOfzo[13] = new zo(paramzq.f() + (paramzq.h() - (paramzq.h() - f5) / 2.0F), paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F);
    arrayOfzo[14] = new zo(paramzq.f() + paramzq.h() - f3, paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F);
    arrayOfzo[15] = new zo(paramzq.f() + paramzq.h() - f3, paramzq.g() + paramzq.i() / 2.0F - f2);
    arrayOfzo[16] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() / 2.0F);
    arrayOfzo[17] = new zo(paramzq.f() + paramzq.h() - f3, paramzq.g() + paramzq.i() / 2.0F + f2);
    arrayOfzo[18] = new zo(paramzq.f() + paramzq.h() - f3, paramzq.g() + paramzq.i() / 2.0F + f1 / 2.0F);
    arrayOfzo[19] = new zo(paramzq.f() + (paramzq.h() - (paramzq.h() - f5) / 2.0F), paramzq.g() + paramzq.i() / 2.0F + f1 / 2.0F);
    arrayOfzo[20] = new zo(paramzq.f() + (paramzq.h() - (paramzq.h() - f5) / 2.0F), paramzq.g() + (paramzq.i() - f4) / 2.0F + f4);
    arrayOfzo[21] = new zo(paramzq.f() + paramzq.h() / 2.0F + f1 / 2.0F, paramzq.g() + (paramzq.i() - f4) / 2.0F + f4);
    arrayOfzo[22] = new zo(paramzq.f() + paramzq.h() / 2.0F + f1 / 2.0F, paramzq.g() + paramzq.i() - f3);
    arrayOfzo[23] = new zo(paramzq.f() + paramzq.h() / 2.0F + f2, paramzq.g() + paramzq.i() - f3);
    arrayOfzo[24] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() + paramzq.i());
    arrayOfzo[25] = new zo(paramzq.f() + (paramzq.h() - 2.0F * f2) / 2.0F, paramzq.g() + paramzq.i() - f3);
    arrayOfzo[26] = new zo(paramzq.f() + paramzq.h() / 2.0F - f1 / 2.0F, paramzq.g() + paramzq.i() - f3);
    arrayOfzo[27] = new zo(paramzq.f() + paramzq.h() / 2.0F - f1 / 2.0F, paramzq.g() + (paramzq.i() - f4) / 2.0F + f4);
    arrayOfzo[28] = new zo(paramzq.f() + (paramzq.h() - f5) / 2.0F, paramzq.g() + (paramzq.i() - f4) / 2.0F + f4);
    arrayOfzo[29] = new zo(paramzq.f() + (paramzq.h() - f5) / 2.0F, paramzq.g() + paramzq.i() / 2.0F + f1 / 2.0F);
    arrayOfzo[30] = new zo(paramzq.f() + f3, paramzq.g() + paramzq.i() / 2.0F + f1 / 2.0F);
    arrayOfzo[31] = new zo(paramzq.f() + f3, paramzq.g() + paramzq.i() / 2.0F + f2);
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */