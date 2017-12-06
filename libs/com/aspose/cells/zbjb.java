package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbjb
  extends zcp
{
  private float l = 0.0F;
  private zq m = new zq();
  
  zbjb(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        this.l = (Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
      } else {
        this.l = (paramzq.h() * 0.2F);
      }
    }
    else {
      this.l = (paramzq.h() * 0.2F);
    }
    if (this.l <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    zo[] arrayOfzo = new zo[6];
    arrayOfzo[0] = new zo(this.l + this.g, this.h);
    arrayOfzo[1] = new zo(paramzq.h() - this.l + this.g, this.h);
    arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
    arrayOfzo[3] = new zo(paramzq.h() - this.l + this.g, paramzq.i() + this.h);
    arrayOfzo[4] = new zo(this.l + this.g, paramzq.i() + this.h);
    arrayOfzo[5] = new zo(this.g, paramzq.i() / 2.0F + this.h);
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[4], arrayOfzo[5]);
    localze.a(arrayOfzo[5], arrayOfzo[0]);
    localze.j();
    this.m = new zq(arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[1].d() - arrayOfzo[0].d(), arrayOfzo[4].e() - arrayOfzo[0].e());
    return localze;
  }
  
  void a()
    throws Exception
  {
    super.c(this.m);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */