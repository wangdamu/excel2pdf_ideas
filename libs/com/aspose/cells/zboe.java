package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zboe
  extends zcp
{
  zboe(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
      arrayOfzo[2] = new zo(paramzq.f() + paramzq.h(), paramzq.g());
      arrayOfzo[3] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.i() + paramzq.g());
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[1], arrayOfzo[3]);
      return localze;
    }
    if (f2 <= 0.0F)
    {
      arrayOfzo[0] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g());
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h(), paramzq.i() + paramzq.g());
      arrayOfzo[2] = new zo(paramzq.f(), paramzq.i() + paramzq.g());
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[0]);
      return localze;
    }
    switch (paramzbni.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() / 2.0F + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[3] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[4] = new zo((paramzq.h() - f1) / 2.0F + f1 + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[6] = new zo((paramzq.h() - f1) / 2.0F + paramzq.f(), paramzq.i() - f2 + paramzq.g());
      break;
    case 2: 
      arrayOfzo[0] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F, paramzq.g());
      arrayOfzo[1] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F + f1, paramzq.g());
      arrayOfzo[2] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F + f1, f2 + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.f() + paramzq.h(), f2 + paramzq.g());
      arrayOfzo[4] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo(paramzq.f(), f2 + paramzq.g());
      arrayOfzo[6] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F, f2 + paramzq.g());
      break;
    case 3: 
      arrayOfzo[0] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F, paramzq.g());
      arrayOfzo[1] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F + f1, paramzq.g());
      arrayOfzo[2] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F + f1, f2 + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.f() + paramzq.h(), f2 + paramzq.g());
      arrayOfzo[4] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo(paramzq.f(), f2 + paramzq.g());
      arrayOfzo[6] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F, f2 + paramzq.g());
      break;
    case 4: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g());
      arrayOfzo[2] = new zo(paramzq.f() + paramzq.h(), paramzq.i() - f2 + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F + f1, paramzq.i() - f2 + paramzq.g());
      arrayOfzo[4] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F + f1, paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F, paramzq.i() + paramzq.g());
      arrayOfzo[6] = new zo(paramzq.f() + (paramzq.h() - f1) / 2.0F, paramzq.i() - f2 + paramzq.g());
    }
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[4], arrayOfzo[5]);
    localze.a(arrayOfzo[5], arrayOfzo[6]);
    localze.a(arrayOfzo[6], arrayOfzo[0]);
    localze.j();
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
    case 1: 
      arrayOfzo[0] = new zo(this.g, localzq.i() - f2 + this.h);
      arrayOfzo[1] = new zo(localzq.h() / 2.0F + this.g, this.h);
      arrayOfzo[2] = new zo(localzq.h() + this.g, localzq.i() - f2 + this.h);
      arrayOfzo[3] = new zo((localzq.h() - f1) / 2.0F + f1 + this.g, localzq.i() - f2 + this.h);
      arrayOfzo[4] = new zo((localzq.h() - f1) / 2.0F + f1 + this.g, localzq.i() + this.h);
      arrayOfzo[5] = new zo((localzq.h() - f1) / 2.0F + this.g, localzq.i() + this.h);
      arrayOfzo[6] = new zo((localzq.h() - f1) / 2.0F + this.g, localzq.i() - f2 + this.h);
      f3 = (arrayOfzo[0].e() - arrayOfzo[1].e()) * (arrayOfzo[6].d() - arrayOfzo[0].d()) / (arrayOfzo[1].d() - arrayOfzo[0].d());
      paramzq.a(arrayOfzo[6].d());
      paramzq.b(arrayOfzo[6].e() - f3);
      paramzq.c(arrayOfzo[4].d() - arrayOfzo[5].d());
      paramzq.d(arrayOfzo[5].e() - arrayOfzo[6].e() + f3);
      break;
    case 2: 
      arrayOfzo[0] = new zo(this.g + (localzq.h() - f1) / 2.0F, this.h);
      arrayOfzo[1] = new zo(this.g + (localzq.h() - f1) / 2.0F + f1, this.h);
      arrayOfzo[2] = new zo(this.g + (localzq.h() - f1) / 2.0F + f1, f2 + this.h);
      arrayOfzo[3] = new zo(this.g + localzq.h(), f2 + this.h);
      arrayOfzo[4] = new zo(this.g + localzq.h() / 2.0F, localzq.i() + this.h);
      arrayOfzo[5] = new zo(this.g, f2 + this.h);
      arrayOfzo[6] = new zo(this.g + (localzq.h() - f1) / 2.0F, f2 + this.h);
      break;
    case 3: 
      arrayOfzo[0] = new zo(this.g + (localzq.h() - f1) / 2.0F, this.h);
      arrayOfzo[1] = new zo(this.g + (localzq.h() - f1) / 2.0F + f1, this.h);
      arrayOfzo[2] = new zo(this.g + (localzq.h() - f1) / 2.0F + f1, f2 + this.h);
      arrayOfzo[3] = new zo(this.g + localzq.h(), f2 + this.h);
      arrayOfzo[4] = new zo(this.g + localzq.h() / 2.0F, localzq.i() + this.h);
      arrayOfzo[5] = new zo(this.g, f2 + this.h);
      arrayOfzo[6] = new zo(this.g + (localzq.h() - f1) / 2.0F, f2 + this.h);
      break;
    case 4: 
      arrayOfzo[0] = new zo(this.g, localzq.i() - f2 + this.h);
      arrayOfzo[1] = new zo(this.g + localzq.h() / 2.0F, this.h);
      arrayOfzo[2] = new zo(this.g + localzq.h(), localzq.i() - f2 + this.h);
      arrayOfzo[3] = new zo(this.g + (localzq.h() - f1) / 2.0F + f1, localzq.i() - f2 + this.h);
      arrayOfzo[4] = new zo(this.g + (localzq.h() - f1) / 2.0F + f1, localzq.i() + this.h);
      arrayOfzo[5] = new zo(this.g + (localzq.h() - f1) / 2.0F, localzq.i() + this.h);
      arrayOfzo[6] = new zo(this.g + (localzq.h() - f1) / 2.0F, localzq.i() - f2 + this.h);
    }
    if ((this.e.J()) && (this.e.x()))
    {
      f3 = Math.abs(paramzq.h() - paramzq.i()) / 2.0F;
      if (paramzq.h() > paramzq.i())
      {
        paramzq.a(paramzq.f() + f3);
        paramzq.b(paramzq.g() - f3);
      }
      else
      {
        paramzq.a(paramzq.f() - f3);
        paramzq.b(paramzq.g() + f3);
      }
      f3 = paramzq.h();
      paramzq.c(paramzq.i());
      paramzq.d(f3);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zboe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */