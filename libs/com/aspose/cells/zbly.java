package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zbly
  extends zco
{
  zbly(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    float f5 = 0.0F;
    f5 = f4 / 2.0F * 0.4F;
    f4 = (float)(2.0F * f4 / (1.0D + Math.sin(zbks.a(54.0D))));
    f3 = (float)(f3 / Math.cos(zbks.a(18.0D)));
    float f6 = paramzq.i() / 2.0F - f5 + 6.0F;
    float f7 = f4 - 2.0F * f6;
    float f8 = f7 * f3 / f4;
    f1 = (float)(f1 - f3 * (1.0D - Math.cos(zbks.a(18.0D))) / 2.0D);
    ze localze = new ze();
    zo[] arrayOfzo = new zo[3];
    int i;
    switch (this.e.a)
    {
    case 1: 
    case 4: 
      for (i = 0; i < 5; i++)
      {
        arrayOfzo[0] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a(18 + i * 72)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbks.a(18 + i * 72)) * f4 / 2.0D));
        arrayOfzo[1] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a(54 + i * 72)) * f8 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbks.a(54 + i * 72)) * f7 / 2.0D));
        arrayOfzo[2] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a(18 + (i + 1) * 72)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbks.a(18 + (i + 1) * 72)) * f4 / 2.0D));
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.a(arrayOfzo[1], arrayOfzo[2]);
      }
      break;
    case 2: 
    case 3: 
      for (i = 0; i < 5; i++)
      {
        arrayOfzo[0] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a(18 + i * 72)) * f3 / 2.0D), (int)(f2 + f4 - (f4 / 2.0F + -Math.sin(zbks.a(18 + i * 72)) * f4 / 2.0D)));
        arrayOfzo[1] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a(54 + i * 72)) * f8 / 2.0D), (int)(f2 + f4 - (f4 / 2.0F + -Math.sin(zbks.a(54 + i * 72)) * f7 / 2.0D)));
        arrayOfzo[2] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbks.a(18 + (i + 1) * 72)) * f3 / 2.0D), (int)(f2 + f4 - (f4 / 2.0F + -Math.sin(zbks.a(18 + (i + 1) * 72)) * f4 / 2.0D)));
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.a(arrayOfzo[1], arrayOfzo[2]);
      }
    }
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */