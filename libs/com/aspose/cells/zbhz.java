package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbhz
  extends zcp
{
  zbhz(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  static com.aspose.cells.b.a.b.a.ze a(zbni paramzbni, zq paramzq, boolean paramBoolean)
  {
    float f1 = 1.0F;
    float f2 = 1.0F;
    zo[] arrayOfzo = new zo[7];
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f3;
    if (paramzbni.n != null)
    {
      if (paramzbni.n.a.size() > 0)
      {
        f1 = paramzq.h() * com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F;
        if (paramzq.i() > paramzq.h()) {
          f3 = paramzq.i() / paramzq.h();
        } else {
          f3 = 1.0F;
        }
        f2 = paramzq.i() * (1.0F - com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / (100000.0F * f3));
      }
      else
      {
        f1 = paramzq.h() * 0.5F;
        if (paramzq.i() > paramzq.h()) {
          f3 = paramzq.i() / paramzq.h();
        } else {
          f3 = 1.0F;
        }
        f2 = paramzq.i() * (1.0F - 50000.0F / (100000.0F * f3));
      }
    }
    else
    {
      f1 = paramzq.h() * 0.5F;
      if (paramzq.i() > paramzq.h()) {
        f3 = paramzq.i() / paramzq.h();
      } else {
        f3 = 1.0F;
      }
      f2 = paramzq.i() * (1.0F - 50000.0F / (100000.0F * f3));
    }
    if ((f1 <= 0.0F) && (f2 == paramzq.i()))
    {
      if (paramBoolean) {
        return null;
      }
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g());
      arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[1], arrayOfzo[3]);
      return localze;
    }
    if (f2 <= 0.0F)
    {
      arrayOfzo[0] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[2] = new zo(paramzq.f(), paramzq.i() + paramzq.g());
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[0]);
      return localze;
    }
    switch (paramzbni.c)
    {
    case 2: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[3] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[4] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[6] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      break;
    case 1: 
      arrayOfzo[0] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), f2 + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), f2 + paramzq.g());
      arrayOfzo[4] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo(paramzq.f(), f2 + paramzq.g());
      arrayOfzo[6] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), f2 + paramzq.g());
      break;
    case 4: 
      arrayOfzo[0] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), f2 + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), f2 + paramzq.g());
      arrayOfzo[4] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo(paramzq.f(), f2 + paramzq.g());
      arrayOfzo[6] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), f2 + paramzq.g());
      break;
    case 3: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[3] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[4] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[6] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.i() - f2 + paramzq.g());
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[4], arrayOfzo[5]);
    localze.a(arrayOfzo[5], arrayOfzo[6]);
    localze.a(arrayOfzo[6], arrayOfzo[0]);
    localze.j();
    return localze;
  }
  
  zq b(zq paramzq)
  {
    float f1 = 1.0F;
    float f2 = 1.0F;
    zq localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
    zo[] arrayOfzo = new zo[7];
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f3;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = localzq.h() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        if (localzq.i() > localzq.h()) {
          f3 = localzq.i() / localzq.h();
        } else {
          f3 = 1.0F;
        }
        f2 = localzq.i() * (1.0F - com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / (100000.0F * f3));
      }
      else
      {
        f1 = localzq.h() * 0.5F;
        if (localzq.i() > localzq.h()) {
          f3 = localzq.i() / localzq.h();
        } else {
          f3 = 1.0F;
        }
        f2 = localzq.i() * (1.0F - 50000.0F / (100000.0F * f3));
      }
    }
    else
    {
      f1 = localzq.h() * 0.5F;
      if (localzq.i() > localzq.h()) {
        f3 = localzq.i() / localzq.h();
      } else {
        f3 = 1.0F;
      }
      f2 = localzq.i() * (1.0F - 50000.0F / (100000.0F * f3));
    }
    if ((f1 <= 0.0F) && (f2 == localzq.i())) {
      return zq.c();
    }
    if ((f1 <= 0.0F) && (f2 <= 0.0F)) {
      return zq.c();
    }
    switch (this.e.c)
    {
    case 2: 
      arrayOfzo[0] = new zo(localzq.f(), localzq.i() - f2 + localzq.g());
      arrayOfzo[1] = new zo(localzq.h() / 2.0F + localzq.f(), localzq.g());
      arrayOfzo[2] = new zo(localzq.h() + localzq.f(), localzq.i() - f2 + localzq.g());
      arrayOfzo[3] = new zo((localzq.h() - f1) / 2.0F + f1 + localzq.f(), localzq.i() - f2 + localzq.g());
      arrayOfzo[4] = new zo((localzq.h() - f1) / 2.0F + f1 + localzq.f(), localzq.i() + localzq.g());
      arrayOfzo[5] = new zo((localzq.h() - f1) / 2.0F + localzq.f(), localzq.i() + localzq.g());
      arrayOfzo[6] = new zo((localzq.h() - f1) / 2.0F + localzq.f(), localzq.i() - f2 + localzq.g());
      break;
    case 1: 
      arrayOfzo[0] = new zo((localzq.h() - f1) / 2.0F + localzq.f(), localzq.g());
      arrayOfzo[1] = new zo((localzq.h() - f1) / 2.0F + f1 + localzq.f(), localzq.g());
      arrayOfzo[2] = new zo((localzq.h() - f1) / 2.0F + f1 + localzq.f(), f2 + localzq.g());
      arrayOfzo[3] = new zo(localzq.h() + localzq.f(), f2 + localzq.g());
      arrayOfzo[4] = new zo(localzq.h() / 2.0F + localzq.f(), localzq.i() + localzq.g());
      arrayOfzo[5] = new zo(localzq.f(), f2 + localzq.g());
      arrayOfzo[6] = new zo((localzq.h() - f1) / 2.0F + localzq.f(), f2 + localzq.g());
      f3 = (arrayOfzo[6].d() - arrayOfzo[5].d()) * (arrayOfzo[4].e() - arrayOfzo[6].e()) / (arrayOfzo[4].d() - arrayOfzo[5].d());
      paramzq.a(arrayOfzo[0].d());
      paramzq.b(arrayOfzo[0].e());
      paramzq.c(arrayOfzo[1].d() - arrayOfzo[0].d());
      paramzq.d(arrayOfzo[6].e() - arrayOfzo[0].e() + f3);
      break;
    case 4: 
      arrayOfzo[0] = new zo((localzq.h() - f1) / 2.0F + localzq.f(), localzq.g());
      arrayOfzo[1] = new zo((localzq.h() - f1) / 2.0F + f1 + localzq.f(), localzq.g());
      arrayOfzo[2] = new zo((localzq.h() - f1) / 2.0F + f1 + localzq.f(), f2 + localzq.g());
      arrayOfzo[3] = new zo(localzq.h() + localzq.f(), f2 + localzq.g());
      arrayOfzo[4] = new zo(localzq.h() / 2.0F + localzq.f(), localzq.i() + localzq.g());
      arrayOfzo[5] = new zo(localzq.f(), f2 + localzq.g());
      arrayOfzo[6] = new zo((localzq.h() - f1) / 2.0F + localzq.f(), f2 + localzq.g());
      break;
    case 3: 
      arrayOfzo[0] = new zo(localzq.f(), localzq.i() - f2 + localzq.g());
      arrayOfzo[1] = new zo(localzq.h() / 2.0F + localzq.f(), localzq.g());
      arrayOfzo[2] = new zo(localzq.h() + localzq.f(), localzq.i() - f2 + localzq.g());
      arrayOfzo[3] = new zo((localzq.h() - f1) / 2.0F + f1 + localzq.f(), localzq.i() - f2 + localzq.g());
      arrayOfzo[4] = new zo((localzq.h() - f1) / 2.0F + f1 + localzq.f(), localzq.i() + localzq.g());
      arrayOfzo[5] = new zo((localzq.h() - f1) / 2.0F + localzq.f(), localzq.i() + localzq.g());
      arrayOfzo[6] = new zo((localzq.h() - f1) / 2.0F + localzq.f(), localzq.i() - f2 + localzq.g());
    }
    return paramzq;
  }
  
  void b()
    throws Exception
  {
    zq localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
    zf localzf = this.a.d();
    this.a.a(4, true);
    com.aspose.cells.b.a.b.a.ze localze;
    if (!this.e.z().a())
    {
      localze = a(this.e, localzq, true);
      if (localze != null)
      {
        int i = 0;
        if ((!this.e.z().a()) && (this.e.z().c().c() == 0) && (!this.e.z().c().b().a())) {
          i = 1;
        }
        float f = this.e.z().c().b().c();
        if ((this.i) && (i != 0)) {
          this.e.z().c().b().a(this.e.z().c().b().c() - this.e.w());
        }
        zc localzc = zbyb.a(this.e.z(), localze);
        this.a.a(localzc, localze);
        if ((this.i) && (i != 0)) {
          this.e.z().c().b().a(f);
        }
      }
    }
    if (!this.e.A().a())
    {
      localze = a(this.e, localzq, false);
      zs localzs = zbyb.a(this.e.A());
      this.a.a(localzs, localze);
    }
    a();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */