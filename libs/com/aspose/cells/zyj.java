package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zyj
  extends zcp
{
  zyj(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    ze localze = new ze();
    zo[] arrayOfzo = new zo[4];
    zo localzo1;
    zo localzo2;
    switch (this.e.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + 0.8F * paramzq.i());
      arrayOfzo[3] = new zo(paramzq.f(), paramzq.g() + 0.93F * paramzq.i());
      localzo1 = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() + paramzq.i() * 1.13F);
      localzo2 = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() + 0.8F * paramzq.i());
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], localzo2, localzo1, arrayOfzo[3]);
      localze.a(arrayOfzo[3], arrayOfzo[0]);
      break;
    case 2: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.g() + paramzq.i() * 0.07F);
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() * 0.2F);
      arrayOfzo[2] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i());
      arrayOfzo[3] = new zo(paramzq.f(), paramzq.g() + paramzq.i());
      localzo1 = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() - paramzq.i() * 0.13F);
      localzo2 = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() + 0.2F * paramzq.i());
      localze.a(arrayOfzo[0], localzo1, localzo2, arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      localze.a(arrayOfzo[3], arrayOfzo[0]);
      break;
    case 3: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.g() + paramzq.i() * 0.2F);
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() * 0.07F);
      arrayOfzo[2] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i());
      arrayOfzo[3] = new zo(paramzq.f(), paramzq.g() + paramzq.i());
      localzo1 = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() - paramzq.i() * 0.13F);
      localzo2 = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() + 0.2F * paramzq.i());
      localze.a(arrayOfzo[0], localzo2, localzo1, arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      localze.a(arrayOfzo[3], arrayOfzo[0]);
      break;
    case 4: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + 0.93F * paramzq.i());
      arrayOfzo[3] = new zo(paramzq.f(), paramzq.g() + 0.8F * paramzq.i());
      localzo1 = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() + paramzq.i() * 1.13F);
      localzo2 = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() + 0.8F * paramzq.i());
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], localzo1, localzo2, arrayOfzo[3]);
      localze.a(arrayOfzo[3], arrayOfzo[0]);
    }
    localze.j();
    return localze;
  }
  
  void c(zq paramzq)
    throws Exception
  {
    paramzq = d(paramzq);
    super.c(paramzq);
  }
  
  private zq d(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    switch (this.e.c)
    {
    case 1: 
      break;
    case 2: 
      f2 = paramzq.g() + paramzq.i() * 0.2F;
      break;
    case 3: 
      f2 = paramzq.g() + paramzq.i() * 0.2F;
      break;
    }
    zq localzq = new zq(f1, f2, paramzq.h(), paramzq.i() * 0.8F);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zyj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */