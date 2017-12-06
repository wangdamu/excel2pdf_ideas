package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zbhl
  extends zco
{
  zbhl(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
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
  
  void b()
    throws Exception
  {
    zq localzq = new zq(this.e.G().f() + this.e.G().h() * 0.25F, this.e.G().g() + this.e.G().i() * 0.25F, this.e.G().h() * 0.5F, this.e.G().i() * 0.5F);
    b(localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */