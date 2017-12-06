package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;

class zbhm
  extends zcp
{
  zbhm(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    ze localze = new ze();
    zo[] arrayOfzo = new zo[4];
    arrayOfzo[0] = new zo(paramzq.h() / 2.0F + this.g, this.h);
    arrayOfzo[1] = new zo(paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
    arrayOfzo[2] = new zo(paramzq.h() / 2.0F + this.g, paramzq.i() + this.h);
    arrayOfzo[3] = new zo(this.g, paramzq.i() / 2.0F + this.h);
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[0]);
    localze.j();
    return localze;
  }
  
  void a()
    throws Exception
  {
    zq localzq = new zq(this.e.W().f() + this.e.W().h() * 0.25F, this.e.W().g() + this.e.W().i() * 0.25F, this.e.W().h() * 0.5F, this.e.W().i() * 0.5F);
    if (this.e.k.getTextVerticalOverflow() == 2)
    {
      localzq.a(localzq.f() + (float)this.e.l().a());
      localzq.c(localzq.h() - (float)(this.e.l().a() + this.e.l().c()));
      localzq.b(localzq.g() + (float)this.e.l().b());
      localzq.d(localzq.i() - (float)(this.e.l().b() + this.e.l().d()));
      zt localzt = zbyb.a(this.a, this.e, localzq, this.e.K(), this.e.H(), this.e.B(), this.e.C(), this.e.E(), this.e.F(), this.e.G());
      if (localzt.c() > localzq.i())
      {
        localzq.b(localzq.g() - (localzt.c() - localzq.i()) / 2.0F);
        localzq.d(localzt.c());
      }
      localzq.a(localzq.f() - (float)this.e.l().a());
      localzq.c(localzq.h() + (float)(this.e.l().a() + this.e.l().c()));
      localzq.b(localzq.g() - (float)this.e.l().b());
      localzq.d(localzq.i() + (float)(this.e.l().b() + this.e.l().d()));
    }
    c(localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */