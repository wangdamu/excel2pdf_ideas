package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbnv
  extends zco
{
  zbnv(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    zo[] arrayOfzo = new zo[4];
    float f5 = 0.0F;
    if (this.e.l.a.size() > 0) {
      f5 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
    } else {
      f5 = paramzq.h() * 0.2549537F;
    }
    switch (this.e.a)
    {
    case 1: 
    case 4: 
      arrayOfzo[0] = new zo(f1, f2);
      arrayOfzo[1] = new zo(f1 + f3, f2);
      arrayOfzo[2] = new zo(f1 + f3 - f5, f2 + f4);
      arrayOfzo[3] = new zo(f1 + f5, f2 + f4);
      break;
    case 2: 
    case 3: 
      arrayOfzo[0] = new zo(f1 + f5, f2);
      arrayOfzo[1] = new zo(f1 + f3 - f5, f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f4);
      arrayOfzo[3] = new zo(f1, f2 + f4);
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */