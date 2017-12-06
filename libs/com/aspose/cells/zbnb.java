package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

class zbnb
  extends zcp
{
  zbnb(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    zo[] arrayOfzo = new zo[5];
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 1)
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
      }
      else
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
        f2 = 0.0F;
      }
    }
    else
    {
      f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
      f2 = 0.0F;
    }
    if ((f1 <= 0.0F) && (f2 == 0.0F))
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    zq localzq1;
    if ((f1 != 0.0F) && (f2 != 0.0F))
    {
      zq localzq2;
      if ((this.e.c == 1) || (this.e.c == 4))
      {
        localzq1 = new zq(paramzq.d(), new zt(f1 * 2.0F, f1 * 2.0F));
        localzq2 = new zq(paramzq.d(), new zt(f2 * 2.0F, f2 * 2.0F));
        localze.a(localzq1, 180.0F, 90.0F);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localze.a(localzq1, 270.0F, 90.0F);
        localzq2.a(paramzq.l() - f2 * 2.0F);
        localzq2.b(paramzq.m() - f2 * 2.0F);
        localze.a(localzq2, 0.0F, 90.0F);
        localzq2.a(paramzq.j());
        localze.a(localzq2, 90.0F, 90.0F);
        localze.j();
      }
      else if ((this.e.c == 2) || (this.e.c == 3))
      {
        localzq1 = new zq(paramzq.d(), new zt(f1 * 2.0F, f1 * 2.0F));
        localzq2 = new zq(paramzq.d(), new zt(f2 * 2.0F, f2 * 2.0F));
        localze.a(localzq2, 180.0F, 90.0F);
        localzq2.a(paramzq.l() - f2 * 2.0F);
        localze.a(localzq2, 270.0F, 90.0F);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localzq1.b(paramzq.m() - f1 * 2.0F);
        localze.a(localzq1, 0.0F, 90.0F);
        localzq1.a(paramzq.j());
        localze.a(localzq1, 90.0F, 90.0F);
        localze.j();
      }
    }
    else if ((f1 != 0.0F) && (f2 == 0.0F))
    {
      if ((this.e.c == 1) || (this.e.c == 4))
      {
        localzq1 = new zq(paramzq.d(), new zt(f1 * 2.0F, f1 * 2.0F));
        localze.a(localzq1, 180.0F, 90.0F);
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localze.a(localzq1, 270.0F, 90.0F);
        arrayOfzo[0] = new zo(paramzq.l(), paramzq.m());
        arrayOfzo[1] = new zo(paramzq.f(), paramzq.m());
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.j();
      }
      else if ((this.e.c == 2) || (this.e.c == 3))
      {
        localzq1 = new zq(paramzq.d(), new zt(f1 * 2.0F, f1 * 2.0F));
        localzq1.a(paramzq.l() - f1 * 2.0F);
        localzq1.b(paramzq.m() - f1 * 2.0F);
        localze.a(localzq1, 0.0F, 90.0F);
        localzq1.a(paramzq.j());
        localze.a(localzq1, 90.0F, 90.0F);
        arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
        arrayOfzo[1] = new zo(paramzq.l(), paramzq.g());
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.j();
      }
    }
    else if ((f1 == 0.0F) && (f2 != 0.0F))
    {
      if ((this.e.c == 1) || (this.e.c == 4))
      {
        localzq1 = new zq(paramzq.d(), new zt(f2 * 2.0F, f2 * 2.0F));
        localzq1.a(paramzq.l() - f2 * 2.0F);
        localzq1.b(paramzq.m() - f2 * 2.0F);
        localze.a(localzq1, 0.0F, 90.0F);
        localzq1.a(paramzq.j());
        localze.a(localzq1, 90.0F, 90.0F);
        arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
        arrayOfzo[1] = new zo(paramzq.l(), paramzq.g());
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.j();
      }
      else if ((this.e.c == 2) || (this.e.c == 3))
      {
        localzq1 = new zq(paramzq.d(), new zt(f2 * 2.0F, f2 * 2.0F));
        localze.a(localzq1, 180.0F, 90.0F);
        localzq1.a(paramzq.l() - f2 * 2.0F);
        localze.a(localzq1, 270.0F, 90.0F);
        arrayOfzo[0] = new zo(paramzq.l(), paramzq.m());
        arrayOfzo[1] = new zo(paramzq.f(), paramzq.m());
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.j();
      }
    }
    localze.j();
    return localze;
  }
  
  void a()
    throws Exception
  {
    zq localzq = d(this.e.y());
    super.c(localzq);
  }
  
  private zq d(zq paramzq)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 1)
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
      }
      else
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
        f2 = 0.0F;
      }
    }
    else
    {
      f1 = Math.min(paramzq.h(), paramzq.i()) * 0.16F;
      f2 = 0.0F;
    }
    if ((f1 <= 0.0F) && (f2 == 0.0F)) {
      return paramzq;
    }
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    float f3 = f1 / 3.0F;
    float f4 = f2 / 3.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    if ((this.e.c == 1) || (this.e.c == 4))
    {
      f5 = f3 > f4 ? f3 : f4;
      f6 = f3 > f4 ? f3 : f4;
      f7 = f3;
      f8 = f4;
    }
    else
    {
      f5 = f3 > f4 ? f3 : f4;
      f6 = f3 > f4 ? f3 : f4;
      f7 = f4;
      f8 = f3;
    }
    localzq.a(localzq.f() + f5 / 2.0F);
    localzq.c(localzq.h() - f5 / 2.0F);
    localzq.c(localzq.h() - f6 / 2.0F);
    localzq.b(localzq.g() + f7 / 2.0F);
    localzq.d(localzq.i() - f7 / 2.0F);
    localzq.d(localzq.i() - f8 / 2.0F);
    if ((this.e.L().size() > 0) && (this.e.I() != 0.0D)) {
      localzq = zbya.a(this.e.y(), this.e.w(), localzq);
    }
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */