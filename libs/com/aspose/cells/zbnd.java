package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

class zbnd
  extends zco
{
  zbnd(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f2;
    if (this.e.l.a.size() > 0) {
      f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
    } else {
      f2 = Math.min(paramzq.h(), paramzq.i()) * 0.2F;
    }
    if (f2 <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    float f1 = f2 * 2.0F;
    zt localzt = new zt(f1, f1);
    zq localzq = new zq(paramzq.d(), localzt);
    localze.a(localzq, 180.0F, 90.0F);
    localzq.a(paramzq.l() - f1);
    localze.a(localzq, 270.0F, 90.0F);
    localzq.b(paramzq.m() - f1);
    localze.a(localzq, 0.0F, 90.0F);
    localzq.a(paramzq.j());
    localze.a(localzq, 90.0F, 90.0F);
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */