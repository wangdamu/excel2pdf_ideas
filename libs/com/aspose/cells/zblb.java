package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zblb
  extends zco
{
  zblb(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    float f6 = 0.0F;
    if (this.e.l.a.size() == 2)
    {
      f6 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(21600 - ((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f5 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(10800 - ((zar)this.e.l.a.get(1)).a())) / 10800.0F;
    }
    else if (this.e.l.a.size() == 1)
    {
      if (((zar)this.e.l.a.get(0)).b() == 327)
      {
        f6 = f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(21600 - ((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f5 = f4 * 0.46666667F;
      }
      else
      {
        f6 = f3 * 0.23333333F;
        f5 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(10800 - ((zar)this.e.l.a.get(0)).a())) / 10800.0F;
      }
    }
    else
    {
      f6 = f3 * 0.23333333F;
      f5 = f4 * 0.46666667F;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f7 = (f4 - f5) / 2.0F;
    float f8 = f5 / 2.0F / (f7 + f5 / 2.0F) * f6;
    zo[] arrayOfzo = new zo[8];
    switch (this.e.a)
    {
    case 1: 
    case 2: 
      arrayOfzo[0] = new zo(f1, f2 + f7);
      arrayOfzo[1] = new zo(f1 + f3 - f6, f2 + f7);
      arrayOfzo[2] = new zo(f1 + f3 - f6, f2);
      arrayOfzo[3] = new zo(f1 + f3, f2 + f4 / 2.0F);
      arrayOfzo[4] = new zo(f1 + f3 - f6, f2 + f4);
      arrayOfzo[5] = new zo(f1 + f3 - f6, f2 + f4 - f7);
      arrayOfzo[6] = new zo(f1, f2 + f4 - f7);
      arrayOfzo[7] = new zo(f1 + f8, f2 + f7 + f5 / 2.0F);
      break;
    case 3: 
    case 4: 
      arrayOfzo[0] = new zo(f1 + f3, f2 + f7);
      arrayOfzo[1] = new zo(f1 + f6, f2 + f7);
      arrayOfzo[2] = new zo(f1 + f6, f2);
      arrayOfzo[3] = new zo(f1, f2 + f4 / 2.0F);
      arrayOfzo[4] = new zo(f1 + f6, f2 + f4);
      arrayOfzo[5] = new zo(f1 + f6, f2 + f4 - f7);
      arrayOfzo[6] = new zo(f1 + f3, f2 + f4 - f7);
      arrayOfzo[7] = new zo(f1 + f3 - f8, f2 + f7 + f5 / 2.0F);
    }
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zblb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */