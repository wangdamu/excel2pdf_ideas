package com.aspose.cells;

import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbls
  extends zco
{
  private float i = 0.0F;
  
  zbls(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    if (this.e.l.a.size() > 0) {
      this.i = (f4 / 2.0F * (1.0F - com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 10800.0F));
    } else {
      this.i = (f4 / 2.0F * 0.7708333F);
    }
    float f5 = paramzq.i() / 2.0F - this.i;
    float f6 = f4 - 2.0F * f5;
    float f7 = f6 * f3 / f4;
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[3];
    for (int j = 0; j < 24; j++)
    {
      arrayOfzo[0] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a(j * 15)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbks.a(j * 15)) * f4 / 2.0D));
      arrayOfzo[2] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a((j + 1) * 15)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbks.a((j + 1) * 15)) * f4 / 2.0D));
      arrayOfzo[1] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a(7.5D + j * 15)) * f7 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbks.a(7.5D + j * 15)) * f6 / 2.0D));
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
    }
    return localze;
  }
  
  void b()
    throws Exception
  {
    this.a.c();
    zq localzq = this.e.l();
    localzq.c(localzq.h() - this.i);
    localzq.d(localzq.i() - this.i);
    if (!this.e.n().a()) {
      localzq.a(-(this.e.n().f() / 2.0F), -(this.e.n().f() / 2.0F));
    }
    float f1 = zbya.a(this.e.o().h());
    if ((this.e.q() == 7) || (this.e.q() == 9))
    {
      if ((int)this.e.d().a() == 0) {
        localzq.a(localzq.f() + f1);
      }
    }
    else if (((this.e.q() == 0) || (this.e.q() == 8)) && ((int)this.e.d().c() == 0)) {
      localzq.c(localzq.h() - f1);
    }
    localzq.a(localzq.f() + (float)this.e.d().a() + this.i / 2.0F);
    localzq.b(localzq.g() + (float)this.e.d().b() + this.i / 2.0F);
    int j = this.e.o().d();
    if (localzq.i() < j)
    {
      float f2 = (j - localzq.i()) / 2.0F;
      localzq = new zq(localzq.f(), localzq.g() - f2, localzq.h(), j);
    }
    if (this.e.u().equals("\n")) {
      return;
    }
    zbya.a(this.a, this.e, localzq, this.e.u(), this.e.t(), this.e.o(), this.e.p(), this.e.q(), this.e.r());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */