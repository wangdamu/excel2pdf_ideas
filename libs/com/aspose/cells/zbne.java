package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

class zbne
  extends zcp
{
  zbne(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f2;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f2 = Math.min(paramzq.h(), paramzq.i()) * 0.2F;
      }
    }
    else {
      f2 = Math.min(paramzq.h(), paramzq.i()) * 0.2F;
    }
    if (f2 <= 0.0F)
    {
      localze.b(paramzq);
      localze.j();
      return localze;
    }
    float f1 = f2 * 2.0F;
    zt localzt = new zt(f1, f1);
    zq localzq = new zq(paramzq.d(), localzt);
    localze.a(localzq, 180.0F, 90.0F);
    localzq.a(paramzq.l() - f1);
    localze.a(localzq, 270.0F, 90.0F);
    localzq.b(paramzq.m() - f1);
    localze.a(localzq, 0.0F, 90.0F);
    localzq.a(paramzq.j());
    localze.a(localzq, 90.0F, 90.0F);
    localze.j();
    return localze;
  }
  
  void a()
    throws Exception
  {
    zq localzq = d(this.e.y());
    super.c(localzq);
  }
  
  zq b(zq paramzq)
  {
    if ((this.e.J()) && (this.e.x()))
    {
      float f = Math.abs(paramzq.h() - paramzq.i()) / 2.0F;
      if (paramzq.h() > paramzq.i())
      {
        paramzq.a(paramzq.f() + f);
        paramzq.b(paramzq.g() - f);
      }
      else
      {
        paramzq.a(paramzq.f() - f);
        paramzq.b(paramzq.g() + f);
      }
      f = paramzq.h();
      paramzq.c(paramzq.i());
      paramzq.d(f);
    }
    return paramzq;
  }
  
  private zq d(zq paramzq)
  {
    float f1 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f1 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f1 = Math.min(paramzq.h(), paramzq.i()) * 0.2F;
      }
    }
    else {
      f1 = Math.min(paramzq.h(), paramzq.i()) * 0.2F;
    }
    if (f1 <= 0.0F) {
      return paramzq;
    }
    float f2 = f1 * 2.0F;
    zt localzt = new zt(f2, f2);
    zq localzq1 = new zq(paramzq.d(), localzt);
    zq localzq2 = zbiy.a(localzq1);
    float f3 = localzq2.f() - paramzq.f();
    float f4 = localzq2.g() - paramzq.g();
    float f5 = localzq2.f();
    float f6 = localzq2.g();
    zq localzq3 = new zq(f5, f6, paramzq.h() - 2.0F * f3, paramzq.i() - 2.0F * f4);
    return localzq3;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */