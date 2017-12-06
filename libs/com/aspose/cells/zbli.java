package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbli
  extends zcp
{
  zbli(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f = Math.min(paramzq.h(), paramzq.i()) * 0.23958F;
      }
    }
    else {
      f = Math.min(paramzq.h(), paramzq.i()) * 0.23958F;
    }
    if (f <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    zo[] arrayOfzo = new zo[4];
    switch (this.e.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(f + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() - f + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 2: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() - f + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(f + this.g, paramzq.i() + this.h);
      break;
    case 3: 
      arrayOfzo[0] = new zo(f + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() - f + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 4: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() - f + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[3] = new zo(f + this.g, paramzq.i() + this.h);
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[0]);
    localze.j();
    return localze;
  }
  
  zq b(zq paramzq)
  {
    zq localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
    float f1;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f1 = Math.min(localzq.h(), localzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f1 = Math.min(localzq.h(), localzq.i()) * 0.23958F;
      }
    }
    else {
      f1 = Math.min(localzq.h(), localzq.i()) * 0.23958F;
    }
    float f2 = 0.08F;
    float f3 = paramzq.h() * f2;
    float f4 = paramzq.i() * f2;
    if (f1 <= 0.0F) {
      return new zq(paramzq.f() + f3, paramzq.g() + f4, paramzq.h() - 2.0F * f3, paramzq.i() - 2.0F * f4);
    }
    paramzq.a(localzq.f() + f3 + f1 / 2.0F * (1.0F - 2.0F * f2));
    paramzq.b(localzq.g() + f4 + f1 / 2.0F * (1.0F - 2.0F * f2));
    paramzq.c(localzq.h() - 2.0F * (f3 + f1 / 2.0F * (1.0F - 2.0F * f2)));
    paramzq.d(localzq.i() - 2.0F * (f4 + f1 / 2.0F * (1.0F - 2.0F * f2)));
    return paramzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbli.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */