package com.aspose.cells;

import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbgi
  extends zco
{
  zbgi(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    float f5 = 0.0F;
    if (this.e.l.a.size() > 0) {
      f5 = f3 - f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
    } else {
      f5 = f3 - f3 * 0.7343981F;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[6];
    switch (this.e.a)
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
  
  void b()
    throws Exception
  {
    this.a.c();
    zq localzq = this.e.l();
    if (!this.e.n().a()) {
      localzq.a(-(this.e.n().f() / 2.0F), -(this.e.n().f() / 2.0F));
    }
    float f1 = this.e.l().h() / 9.0F;
    float f2 = zbya.a(this.e.o().h());
    if ((this.e.q() == 7) || (this.e.q() == 9))
    {
      if ((int)this.e.d().a() == 0) {
        localzq.a(localzq.f() + f2);
      }
      localzq.a(localzq.f() + f1);
    }
    else if ((this.e.q() == 0) || (this.e.q() == 8))
    {
      if ((int)this.e.d().c() == 0) {
        localzq.c(localzq.h() - f2);
      }
      localzq.c(localzq.h() - f1);
    }
    if (this.e.u().equals("\n")) {
      return;
    }
    zbya.a(this.a, this.e, localzq, this.e.u(), this.e.t(), this.e.o(), this.e.p(), this.e.q(), this.e.r());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */