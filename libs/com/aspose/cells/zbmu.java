package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbmu
  extends zcp
{
  zbmu(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  static com.aspose.cells.b.a.b.a.ze a(zbni paramzbni, zq paramzq, boolean paramBoolean)
  {
    float f1 = 1.0F;
    float f2 = 1.0F;
    zo[] arrayOfzo = new zo[7];
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f3 = paramzq.h() / paramzq.i();
    if (paramzbni.n != null)
    {
      if (paramzbni.n.a.size() > 0)
      {
        f1 = paramzq.i() * com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F;
        if (paramzq.h() < paramzq.i()) {
          f3 = 1.0F;
        }
        f2 = paramzq.h() * (1.0F - com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / (100000.0F * f3));
      }
      else
      {
        f1 = paramzq.i() * 0.5F;
        if (paramzq.h() < paramzq.i()) {
          f3 = 1.0F;
        }
        f2 = paramzq.h() * (1.0F - 50000.0F / (100000.0F * f3));
      }
    }
    else
    {
      f1 = paramzq.i() * 0.5F;
      if (paramzq.h() < paramzq.i()) {
        f3 = 1.0F;
      }
      f2 = paramzq.h() * (1.0F - 50000.0F / (100000.0F * f3));
    }
    if ((f1 <= 0.0F) && (f2 == paramzq.h()))
    {
      if (paramBoolean) {
        return null;
      }
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.i() / 2.0F + paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), paramzq.i() / 2.0F + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
      localze.a(arrayOfzo[0], arrayOfzo[2]);
      localze.a(arrayOfzo[1], arrayOfzo[3]);
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      return localze;
    }
    if (f2 <= 0.0F)
    {
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() + paramzq.f(), paramzq.i() / 2.0F + paramzq.g());
      arrayOfzo[2] = new zo(paramzq.f(), paramzq.i() + paramzq.g());
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[0]);
      return localze;
    }
    switch (paramzbni.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(paramzq.f(), (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[1] = new zo(f2 + paramzq.f(), (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[2] = new zo(f2 + paramzq.f(), paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), paramzq.i() / 2.0F + paramzq.g());
      arrayOfzo[4] = new zo(f2 + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo(f2 + paramzq.f(), paramzq.i() - (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[6] = new zo(paramzq.f(), paramzq.i() - (paramzq.i() - f1) / 2.0F + paramzq.g());
      break;
    case 2: 
      arrayOfzo[0] = new zo(paramzq.f(), (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[1] = new zo(f2 + paramzq.f(), (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[2] = new zo(f2 + paramzq.f(), paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), paramzq.i() / 2.0F + paramzq.g());
      arrayOfzo[4] = new zo(f2 + paramzq.f(), paramzq.i() + paramzq.g());
      arrayOfzo[5] = new zo(f2 + paramzq.f(), paramzq.i() - (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[6] = new zo(paramzq.f(), paramzq.i() - (paramzq.i() - f1) / 2.0F + paramzq.g());
      break;
    case 3: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.i() / 2.0F + paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() - f2 + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.h() - f2 + paramzq.f(), (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[4] = new zo(paramzq.h() + paramzq.f(), (paramzq.i() - f1) / 2.0F + f1 + paramzq.g());
      arrayOfzo[5] = new zo(paramzq.h() - f2 + paramzq.f(), paramzq.i() - (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[6] = new zo(paramzq.h() - f2 + paramzq.f(), paramzq.i() + paramzq.g());
      break;
    case 4: 
      arrayOfzo[0] = new zo(paramzq.f(), paramzq.i() / 2.0F + paramzq.g());
      arrayOfzo[1] = new zo(paramzq.h() - f2 + paramzq.f(), paramzq.g());
      arrayOfzo[2] = new zo(paramzq.h() - f2 + paramzq.f(), (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[4] = new zo(paramzq.h() + paramzq.f(), (paramzq.i() - f1) / 2.0F + f1 + paramzq.g());
      arrayOfzo[5] = new zo(paramzq.h() - f2 + paramzq.f(), paramzq.i() - (paramzq.i() - f1) / 2.0F + paramzq.g());
      arrayOfzo[6] = new zo(paramzq.h() - f2 + paramzq.f(), paramzq.i() + paramzq.g());
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
    float f3 = localzq.h() / localzq.i();
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = localzq.i() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        if (localzq.h() < localzq.i()) {
          f3 = 1.0F;
        }
        f2 = localzq.h() * (1.0F - com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / (100000.0F * f3));
      }
      else
      {
        f1 = localzq.i() * 0.5F;
        if (localzq.h() < localzq.i()) {
          f3 = 1.0F;
        }
        f2 = localzq.h() * (1.0F - 50000.0F / (100000.0F * f3));
      }
    }
    else
    {
      f1 = localzq.i() * 0.5F;
      if (localzq.h() < localzq.i()) {
        f3 = 1.0F;
      }
      f2 = localzq.h() * (1.0F - 50000.0F / (100000.0F * f3));
    }
    if ((f1 <= 0.0F) && (f2 == localzq.h())) {
      return zq.c();
    }
    if ((f1 <= 0.0F) && (f2 <= 0.0F)) {
      return zq.c();
    }
    switch (this.e.c)
    {
    case 1: 
      arrayOfzo[0] = new zo(localzq.f(), (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[1] = new zo(f2 + localzq.f(), (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[2] = new zo(f2 + localzq.f(), localzq.g());
      arrayOfzo[3] = new zo(localzq.h() + localzq.f(), localzq.i() / 2.0F + localzq.g());
      arrayOfzo[4] = new zo(f2 + localzq.f(), localzq.i() + localzq.g());
      arrayOfzo[5] = new zo(f2 + localzq.f(), localzq.i() - (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[6] = new zo(localzq.f(), localzq.i() - (localzq.i() - f1) / 2.0F + localzq.g());
      float f4 = (arrayOfzo[1].e() - arrayOfzo[2].e()) * (arrayOfzo[3].d() - arrayOfzo[1].d()) / (arrayOfzo[3].e() - arrayOfzo[2].e());
      paramzq.a(arrayOfzo[0].d());
      paramzq.b(arrayOfzo[0].e());
      paramzq.c(arrayOfzo[1].d() - arrayOfzo[0].d() + f4);
      paramzq.d(arrayOfzo[6].e() - arrayOfzo[0].e());
      break;
    case 2: 
      arrayOfzo[0] = new zo(localzq.f(), (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[1] = new zo(f2 + localzq.f(), (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[2] = new zo(f2 + localzq.f(), localzq.g());
      arrayOfzo[3] = new zo(localzq.h() + localzq.f(), localzq.i() / 2.0F + localzq.g());
      arrayOfzo[4] = new zo(f2 + localzq.f(), localzq.i() + localzq.g());
      arrayOfzo[5] = new zo(f2 + localzq.f(), localzq.i() - (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[6] = new zo(localzq.f(), localzq.i() - (localzq.i() - f1) / 2.0F + localzq.g());
      break;
    case 3: 
      arrayOfzo[0] = new zo(localzq.f(), localzq.i() / 2.0F + localzq.g());
      arrayOfzo[1] = new zo(localzq.h() - f2 + localzq.f(), localzq.g());
      arrayOfzo[2] = new zo(localzq.h() - f2 + localzq.f(), (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[3] = new zo(localzq.h() + localzq.f(), (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[4] = new zo(localzq.h() + localzq.f(), (localzq.i() - f1) / 2.0F + f1 + localzq.g());
      arrayOfzo[5] = new zo(localzq.h() - f2 + localzq.f(), localzq.i() - (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[6] = new zo(localzq.h() - f2 + localzq.f(), localzq.i() + localzq.g());
      break;
    case 4: 
      arrayOfzo[0] = new zo(localzq.f(), localzq.i() / 2.0F + localzq.g());
      arrayOfzo[1] = new zo(localzq.h() - f2 + localzq.f(), localzq.g());
      arrayOfzo[2] = new zo(localzq.h() - f2 + localzq.f(), (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[3] = new zo(localzq.h() + localzq.f(), (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[4] = new zo(localzq.h() + localzq.f(), (localzq.i() - f1) / 2.0F + f1 + localzq.g());
      arrayOfzo[5] = new zo(localzq.h() - f2 + localzq.f(), localzq.i() - (localzq.i() - f1) / 2.0F + localzq.g());
      arrayOfzo[6] = new zo(localzq.h() - f2 + localzq.f(), localzq.i() + localzq.g());
    }
    return paramzq;
  }
  
  void b()
    throws Exception
  {
    zq localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
    zf localzf = this.a.d();
    this.a.a(4, true);
    if (!this.e.z().a())
    {
      localObject = a(this.e, localzq, true);
      if (localObject != null)
      {
        int i = 0;
        if ((!this.e.z().a()) && (this.e.z().c().c() == 0) && (!this.e.z().c().b().a())) {
          i = 1;
        }
        float f = this.e.z().c().b().c();
        if ((this.i) && (i != 0)) {
          this.e.z().c().b().a(this.e.z().c().b().c() - this.e.w());
        }
        zc localzc = zbyb.a(this.e.z(), (com.aspose.cells.b.a.b.a.ze)localObject);
        this.a.a(localzc, (com.aspose.cells.b.a.b.a.ze)localObject);
        if ((this.i) && (i != 0)) {
          this.e.z().c().b().a(f);
        }
      }
    }
    if (!this.e.A().a())
    {
      localObject = a(this.e, localzq, false);
      zs localzs = zbyb.a(this.e.A());
      this.a.a(localzs, (com.aspose.cells.b.a.b.a.ze)localObject);
    }
    Object localObject = this.e.k.getHyperlink();
    if ((localObject != null) && (((Hyperlink)localObject).getAddress() != null) && (this.e.f)) {
      this.a.a(this.e.y(), ((Hyperlink)localObject).getAddress());
    }
    a();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */