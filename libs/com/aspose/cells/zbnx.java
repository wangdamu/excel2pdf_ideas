package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbnx
  extends zco
{
  zbnx(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[3];
    float f;
    if (this.e.l.a.size() > 0) {
      f = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
    } else {
      f = paramzq.h() / 2.0F;
    }
    switch (this.e.a)
    {
    case 1: 
      arrayOfzo[0] = new zo(f + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[2] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 2: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(f + this.g, paramzq.i() + this.h);
      break;
    case 3: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(f + this.g, paramzq.i() + this.h);
      break;
    case 4: 
      arrayOfzo[0] = new zo(f + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[2] = new zo(this.g, paramzq.i() + this.h);
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[0]);
    localze.j();
    return localze;
  }
  
  void b(zq paramzq)
    throws Exception
  {
    paramzq = c(paramzq);
    super.b(paramzq);
  }
  
  private zq c(zq paramzq)
  {
    zo[] arrayOfzo = new zo[3];
    float f1;
    if (this.e.l.a.size() > 0) {
      f1 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
    } else {
      f1 = paramzq.h() / 2.0F;
    }
    switch (this.e.a)
    {
    case 1: 
      arrayOfzo[0] = new zo(f1 + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[2] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 2: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(f1 + this.g, paramzq.i() + this.h);
      break;
    case 3: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(f1 + this.g, paramzq.i() + this.h);
      break;
    case 4: 
      arrayOfzo[0] = new zo(f1 + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[2] = new zo(this.g, paramzq.i() + this.h);
    }
    float f2 = (arrayOfzo[2].d() + arrayOfzo[0].d()) / 2.0F;
    float f3 = (arrayOfzo[2].e() + arrayOfzo[0].e()) / 2.0F;
    float f4 = (arrayOfzo[1].d() + arrayOfzo[0].d()) / 2.0F - f2;
    float f5 = paramzq.i() / 2.0F;
    zq localzq = new zq(f2, f3, f4, f5);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */