package com.aspose.cells;

import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zblh
  extends zco
{
  zblh(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f;
    if (this.e.l.a.size() > 0) {
      f = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
    } else {
      f = paramzq.h() * 0.25444445F;
    }
    if (f <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    zo[] arrayOfzo = new zo[4];
    switch (this.e.a)
    {
    case 1: 
      arrayOfzo[0] = new zo(f + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() - f + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 2: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() - f + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(f + this.g, paramzq.i() + this.h);
      break;
    case 3: 
      arrayOfzo[0] = new zo(f + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() - f + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 4: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() - f + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(f + this.g, paramzq.i() + this.h);
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[0]);
    localze.j();
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
    float f1 = this.e.l().h() / 4.0F;
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
    localzq.a(localzq.f() + (float)this.e.d().a());
    localzq.b(localzq.g() + (float)this.e.d().b());
    if (this.e.u().equals("\n")) {
      return;
    }
    zbya.a(this.a, this.e, localzq, this.e.u(), this.e.t(), this.e.o(), this.e.p(), this.e.q(), this.e.r());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zblh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */