package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zblq
  extends zco
{
  zblq(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
      f5 = f4 / 2.0F * (1.0F - com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 10800.0F);
    } else {
      f5 = f4 / 2.0F * 0.7708333F;
    }
    float f6 = paramzq.i() / 2.0F - f5;
    float f7 = f4 - 2.0F * f6;
    float f8 = f7 * f3 / f4;
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[3];
    for (int i = 0; i < 16; i++)
    {
      arrayOfzo[0] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a(i * 22.5D)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbks.a(i * 22.5D)) * f4 / 2.0D));
      arrayOfzo[2] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a((i + 1) * 22.5D)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbks.a((i + 1) * 22.5D)) * f4 / 2.0D));
      arrayOfzo[1] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a(11.25D + i * 22.5D)) * f8 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbks.a(11.25D + i * 22.5D)) * f7 / 2.0D));
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
    }
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zblq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */