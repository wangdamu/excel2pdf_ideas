package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

class zblm
  extends zco
{
  zblm(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[8];
    float f2 = 0.0F;
    if (this.e.l.a.size() > 0) {
      f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
    } else {
      f2 = paramzq.i() * 0.13F;
    }
    if (f2 <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    float f1 = f2 * 2.0F;
    zt localzt = new zt(f1, f1);
    paramzq.a(-f2 + this.g);
    paramzq.b(-f2 + this.h);
    zq localzq = new zq(paramzq.d(), localzt);
    arrayOfzo[0] = new zo(f2 + this.g, this.h);
    arrayOfzo[1] = new zo(paramzq.h() - f2 + this.g, this.h);
    arrayOfzo[2] = new zo(paramzq.h() + this.g, f2 + this.h);
    arrayOfzo[3] = new zo(paramzq.h() + this.g, paramzq.i() - f2 + this.h);
    arrayOfzo[4] = new zo(paramzq.h() - f2 + this.g, paramzq.i() + this.h);
    arrayOfzo[5] = new zo(f2 + this.g, paramzq.i() + this.h);
    arrayOfzo[6] = new zo(this.g, paramzq.i() - f2 + this.h);
    arrayOfzo[7] = new zo(this.g, f2 + this.h);
    localze.a(arrayOfzo[6], arrayOfzo[7]);
    localze.a(localzq, 90.0F, -90.0F);
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localzq.a(paramzq.l());
    localze.a(localzq, 180.0F, -90.0F);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localzq.b(paramzq.m());
    localze.a(localzq, 270.0F, -90.0F);
    localze.a(arrayOfzo[4], arrayOfzo[5]);
    localzq.a(paramzq.j());
    localze.a(localzq, 360.0F, -90.0F);
    localze.a(arrayOfzo[6], arrayOfzo[7]);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zblm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */