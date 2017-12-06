package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zq;

class zzg
  extends zco
{
  zzg(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
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
    switch (this.e.a)
    {
    case 1: 
      localze.a(f1, f2, f3, f4, 45.0F, -300.0F);
      d1 = f1 + f3 / 2.0F + f3 / 2.0F * Math.cos(zbks.a(315.0D));
      d2 = f2 + f4 / 2.0F - f4 / 2.0F * Math.sin(zbks.a(315.0D));
      localze.b(f1 + f3 / 2.0F, f2 + f4, f1 + f3, f2 + f4);
      localze.b(f1 + f3, f2 + f4, f1 + f3, (float)d2);
      localze.b(f1 + f3, (float)d2, (float)d1, (float)d2);
      break;
    case 2: 
      localze.a(f1, f2, f3, f4, -45.0F, 300.0F);
      d1 = f1 + f3 / 2.0F + f3 / 2.0F * Math.cos(zbks.a(315.0D));
      d2 = f2 + f4 / 2.0F + f4 / 2.0F * Math.sin(zbks.a(315.0D));
      localze.b(f1 + f3 / 2.0F, f2, f1 + f3, f2);
      localze.b(f1 + f3, f2, f1 + f3, (float)d2);
      localze.b(f1 + f3, (float)d2, (float)d1, (float)d2);
      break;
    case 3: 
      localze.a(f1, f2, f3, f4, 270.0F, 300.0F);
      d1 = f1 + f3 / 2.0F - f3 / 2.0F * Math.cos(zbks.a(315.0D));
      d2 = f2 + f4 / 2.0F + f4 / 2.0F * Math.sin(zbks.a(315.0D));
      localze.b((float)d1, (float)d2, f1, (float)d2);
      localze.b(f1, (float)d2, f1, f2);
      localze.b(f1, f2, f1 + f3 / 2.0F, f2);
      break;
    case 4: 
      localze.a(f1, f2, f3, f4, 90.0F, -300.0F);
      d1 = f1 + f3 / 2.0F - f3 / 2.0F * Math.cos(zbks.a(315.0D));
      d2 = f2 + f4 / 2.0F - f4 / 2.0F * Math.sin(zbks.a(315.0D));
      localze.b((float)d1, (float)d2, f1, (float)d2);
      localze.b(f1, (float)d2, f1, f2 + f4);
      localze.b(f1, f2 + f4, f1 + f3 / 2.0F, f2 + f4);
    }
    return localze;
  }
  
  void b(zq paramzq)
    throws Exception
  {
    paramzq = zbix.a(paramzq);
    super.b(paramzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */