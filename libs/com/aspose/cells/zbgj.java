package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbgj
  extends zcp
{
  zbgj(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    float f5 = 0.0F;
    float f6 = Math.min(f3, f4);
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f5 = f6 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
      } else {
        f5 = f6 * 0.5F;
      }
    }
    else {
      f5 = f6 * 0.5F;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[6];
    switch (this.e.c)
    {
    case 1: 
    case 2: 
      arrayOfzo[0] = new zo(f1, f2);
      arrayOfzo[1] = new zo(f1 + f3 - f5, f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f4 / 2.0F);
      arrayOfzo[3] = new zo(f1 + f3 - f5, f2 + f4);
      arrayOfzo[4] = new zo(f1, f2 + f4);
      arrayOfzo[5] = new zo(f1 + f5, f2 + f4 / 2.0F);
      localze.b(arrayOfzo);
      break;
    case 3: 
    case 4: 
      arrayOfzo[0] = new zo(f1 + f3, f2);
      arrayOfzo[1] = new zo(f1 + f5, f2);
      arrayOfzo[2] = new zo(f1, f2 + f4 / 2.0F);
      arrayOfzo[3] = new zo(f1 + f5, f2 + f4);
      arrayOfzo[4] = new zo(f1 + f3, f2 + f4);
      arrayOfzo[5] = new zo(f1 + f3 - f5, f2 + f4 / 2.0F);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      localze.a(arrayOfzo[3], arrayOfzo[4]);
      localze.a(arrayOfzo[4], arrayOfzo[5]);
      localze.a(arrayOfzo[5], arrayOfzo[0]);
    }
    return localze;
  }
  
  void a()
    throws Exception
  {
    zq localzq = this.e.y();
    if (!this.e.A().a()) {
      localzq.a(-(this.e.A().h() / 2.0F), -(this.e.A().h() / 2.0F));
    }
    float f1 = this.e.y().h() / 3.0F;
    float f2 = zbyb.a(this.e.B());
    if ((this.e.E() == 7) || (this.e.E() == 9)) {
      localzq.a(localzq.f() + (f2 + f1));
    } else if ((this.e.E() == 0) || (this.e.E() == 8)) {
      localzq.c(localzq.h() - (f2 + f1));
    }
    if (this.e.K().equals("\n")) {
      return;
    }
    localzq = zbya.a(this.e.y(), this.e.w(), localzq);
    zbyb.b(this.a, this.e, localzq, this.e.K(), this.e.H(), this.e.B(), this.e.C(), this.e.E(), this.e.F(), this.e.G());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */