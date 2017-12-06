package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

class zbht
  extends zcp
{
  zbht(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    zs localzs = zbyb.a(this.e.A());
    Object localObject1;
    Object localObject2;
    float f2;
    Object localObject3;
    Object localObject4;
    if (!this.e.z().a())
    {
      localObject1 = new zq(this.g, this.h, this.e.y().h(), this.e.y().i());
      localObject2 = new com.aspose.cells.b.a.b.a.ze();
      zo[] arrayOfzo = new zo[4];
      float f3 = 0.0F;
      if (this.e.n != null)
      {
        if (this.e.n.a.size() > 0) {
          f3 = this.e.y().i() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        } else {
          f3 = this.e.y().i() * 0.24F;
        }
      }
      else {
        f3 = this.e.y().i() * 0.24F;
      }
      if (f3 <= 0.0F)
      {
        arrayOfzo[0] = new zo(this.g, this.h);
        arrayOfzo[1] = new zo(this.g, this.e.y().i() + this.h);
        arrayOfzo[2] = new zo(this.e.y().h() + this.g, this.h);
        arrayOfzo[3] = new zo(this.e.y().h() + this.g, this.e.y().i() + this.h);
        ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[0], arrayOfzo[1]);
        ((com.aspose.cells.b.a.b.a.ze)localObject2).k();
        ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[2], arrayOfzo[3]);
      }
      else
      {
        f2 = f3 * 2.0F;
        localObject3 = new zt(f2, f2);
        localObject4 = new zo(this.g, this.h);
        zq localzq = new zq((zo)localObject4, (zt)localObject3);
        localzq.a(this.e.y().l() - f2);
        ((com.aspose.cells.b.a.b.a.ze)localObject2).a(localzq, 270.0F, 90.0F);
        localzq.b(this.e.y().m() - f2);
        ((com.aspose.cells.b.a.b.a.ze)localObject2).a(localzq, 0.0F, 90.0F);
        localzq.a(this.e.y().j());
        ((com.aspose.cells.b.a.b.a.ze)localObject2).a(localzq, 90.0F, 90.0F);
        localzq.b(this.e.y().k());
        ((com.aspose.cells.b.a.b.a.ze)localObject2).a(localzq, 180.0F, 90.0F);
        ((com.aspose.cells.b.a.b.a.ze)localObject2).j();
      }
      localObject3 = zbyb.a(this.e.z(), (com.aspose.cells.b.a.b.a.ze)localObject2);
      this.a.a((zc)localObject3, (com.aspose.cells.b.a.b.a.ze)localObject2);
    }
    if (!this.e.A().a())
    {
      localObject1 = new com.aspose.cells.b.a.b.a.ze();
      localObject2 = new zo[4];
      f2 = 0.0F;
      if (this.e.n != null) {
        f2 = this.e.y().i() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f2 = this.e.y().i() * 0.24F;
      }
      if (f2 <= 0.0F)
      {
        localObject2[0] = new zo(this.g, this.h);
        localObject2[1] = new zo(this.g, this.e.y().i() + this.h);
        localObject2[2] = new zo(this.e.y().h() + this.g, this.h);
        localObject2[3] = new zo(this.e.y().h() + this.g, this.e.y().i() + this.h);
        ((com.aspose.cells.b.a.b.a.ze)localObject1).a(localObject2[0], localObject2[1]);
        ((com.aspose.cells.b.a.b.a.ze)localObject1).k();
        ((com.aspose.cells.b.a.b.a.ze)localObject1).a(localObject2[2], localObject2[3]);
      }
      else
      {
        float f1 = f2 * 2.0F;
        zt localzt = new zt(f1, f1);
        localObject3 = new zo(this.g, this.h);
        localObject4 = new zq((zo)localObject3, localzt);
        ((zq)localObject4).a(this.e.y().h() - f1 + this.g);
        ((com.aspose.cells.b.a.b.a.ze)localObject1).a((zq)localObject4, 270.0F, 90.0F);
        ((zq)localObject4).b(this.e.y().i() - f1 + this.h);
        ((com.aspose.cells.b.a.b.a.ze)localObject1).a((zq)localObject4, 0.0F, 90.0F);
        ((com.aspose.cells.b.a.b.a.ze)localObject1).k();
        ((zq)localObject4).a(this.g);
        ((com.aspose.cells.b.a.b.a.ze)localObject1).a((zq)localObject4, 90.0F, 90.0F);
        ((zq)localObject4).b(this.h);
        ((com.aspose.cells.b.a.b.a.ze)localObject1).a((zq)localObject4, 180.0F, 90.0F);
        ((com.aspose.cells.b.a.b.a.ze)localObject1).k();
      }
      this.a.a(localzs, (com.aspose.cells.b.a.b.a.ze)localObject1);
    }
    super.a();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */