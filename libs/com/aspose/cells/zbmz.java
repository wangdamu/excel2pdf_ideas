package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zbmz
  extends zcp
{
  zbmz(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    ze localze = new ze();
    zo[] arrayOfzo = new zo[3];
    switch (this.e.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[2] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 2: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(this.g, paramzq.i() + this.h);
      break;
    case 3: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      break;
    case 4: 
      arrayOfzo[0] = new zo(paramzq.h() + this.g, this.h);
      arrayOfzo[1] = new zo(paramzq.h() + this.g, paramzq.i() + this.h);
      arrayOfzo[2] = new zo(this.g, paramzq.i() + this.h);
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[0]);
    localze.j();
    return localze;
  }
  
  zq b(zq paramzq)
  {
    zo[] arrayOfzo = new zo[3];
    zq localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
    switch (this.e.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(localzq.h() + this.g, localzq.i() + this.h);
      arrayOfzo[2] = new zo(this.g, localzq.i() + this.h);
      paramzq.a(arrayOfzo[0].d() + localzq.h() * 0.1F);
      paramzq.b(arrayOfzo[0].e() + localzq.i() * 0.6F);
      paramzq.c(localzq.h() * 0.5F);
      paramzq.d(localzq.i() * 0.3F);
      break;
    case 2: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(localzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(this.g, localzq.i() + this.h);
      paramzq.a(arrayOfzo[0].d() + localzq.h() * 0.1F);
      paramzq.b(arrayOfzo[0].e() + localzq.i() * 0.1F);
      paramzq.c(localzq.h() * 0.5F);
      paramzq.d(localzq.i() * 0.3F);
      break;
    case 3: 
      arrayOfzo[0] = new zo(this.g, this.h);
      arrayOfzo[1] = new zo(localzq.h() + this.g, this.h);
      arrayOfzo[2] = new zo(localzq.h() + this.g, localzq.i() + this.h);
      paramzq.a(arrayOfzo[0].d() + localzq.h() * 0.4F);
      paramzq.b(arrayOfzo[0].e() + localzq.i() * 0.1F);
      paramzq.c(localzq.h() * 0.5F);
      paramzq.d(localzq.i() * 0.3F);
      break;
    case 4: 
      arrayOfzo[0] = new zo(localzq.h() + this.g, this.h);
      arrayOfzo[1] = new zo(localzq.h() + this.g, localzq.i() + this.h);
      arrayOfzo[2] = new zo(this.g, localzq.i() + this.h);
      paramzq.a(arrayOfzo[2].d() + localzq.h() * 0.4F);
      paramzq.b(arrayOfzo[0].e() + localzq.i() * 0.6F);
      paramzq.c(localzq.h() * 0.5F);
      paramzq.d(localzq.i() * 0.3F);
    }
    return paramzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */