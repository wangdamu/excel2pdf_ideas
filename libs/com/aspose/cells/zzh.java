package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zq;

class zzh
  extends zcp
{
  zzh(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    ze localze = new ze();
    double d1;
    double d2;
    switch (this.e.c)
    {
    case 1: 
      d1 = f1 + f3 / 2.0F + f3 / 2.0F * Math.cos(zbkt.a(315.0D));
      d2 = f2 + f4 / 2.0F - f4 / 2.0F * Math.sin(zbkt.a(315.0D));
      localze.a(f1, f2, f3, f4, 45.0F, -300.0F);
      localze.b(f1 + f3 / 2.0F, f2 + f4, f1 + f3, f2 + f4);
      localze.b(f1 + f3, f2 + f4, f1 + f3, (float)d2);
      localze.b(f1 + f3, (float)d2, (float)d1, (float)d2);
      break;
    case 2: 
      localze.a(f1, f2, f3, f4, -45.0F, 300.0F);
      d1 = f1 + f3 / 2.0F + f3 / 2.0F * Math.cos(zbkt.a(315.0D));
      d2 = f2 + f4 / 2.0F + f4 / 2.0F * Math.sin(zbkt.a(315.0D));
      localze.b(f1 + f3 / 2.0F, f2, f1 + f3, f2);
      localze.b(f1 + f3, f2, f1 + f3, (float)d2);
      localze.b(f1 + f3, (float)d2, (float)d1, (float)d2);
      break;
    case 3: 
      localze.a(f1, f2, f3, f4, 270.0F, 300.0F);
      d1 = f1 + f3 / 2.0F - f3 / 2.0F * Math.cos(zbkt.a(315.0D));
      d2 = f2 + f4 / 2.0F + f4 / 2.0F * Math.sin(zbkt.a(315.0D));
      localze.b((float)d1, (float)d2, f1, (float)d2);
      localze.b(f1, (float)d2, f1, f2);
      localze.b(f1, f2, f1 + f3 / 2.0F, f2);
      break;
    case 4: 
      localze.a(f1, f2, f3, f4, 90.0F, -300.0F);
      d1 = f1 + f3 / 2.0F - f3 / 2.0F * Math.cos(zbkt.a(315.0D));
      d2 = f2 + f4 / 2.0F - f4 / 2.0F * Math.sin(zbkt.a(315.0D));
      localze.b((float)d1, (float)d2, f1, (float)d2);
      localze.b(f1, (float)d2, f1, f2 + f4);
      localze.b(f1, f2 + f4, f1 + f3 / 2.0F, f2 + f4);
    }
    return localze;
  }
  
  void c(zq paramzq)
    throws Exception
  {
    paramzq = zbiy.a(paramzq);
    super.c(paramzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */