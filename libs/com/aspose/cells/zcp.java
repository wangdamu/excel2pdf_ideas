package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.zj;
import java.util.Iterator;

class zcp
  implements zj
{
  protected zr a;
  protected boolean b = false;
  protected float c;
  protected float d;
  protected zbni e;
  protected float f = 0.0F;
  protected float g;
  protected float h;
  protected boolean i = false;
  protected boolean j = false;
  protected boolean k = false;
  
  zcp(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    this.a = paramzr;
    this.e = paramzbni;
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.g = this.c;
    this.h = this.d;
    zi localzi = new zi();
    zq localzq;
    zo localzo;
    switch (this.e.r())
    {
    case 2: 
    case 13: 
    case 20: 
    case 66: 
    case 67: 
    case 68: 
    case 87: 
    case 2061: 
      if (paramzbni.w() != 0)
      {
        localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
        if ((this.e.y().i() == 0.0F) || (this.e.y().h() == 0.0F)) {
          localzq = new zq(this.e.W().f(), this.e.W().g(), this.e.W().h(), this.e.W().i());
        }
        localzo = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + localzq.i() / 2.0F);
        localzi.b(zbxz.a(localzo.d()), zbxz.a(localzo.e()));
        localzi.a(paramzbni.w());
        localzi.b(-zbxz.a(localzo.d()), -zbxz.a(localzo.e()));
        this.i = true;
      }
      break;
    case 54: 
      if (this.e.U())
      {
        this.e.f(this.e.w() + 180);
        localzi = a(this.e.w());
      }
      else if (this.e.w() > 0)
      {
        localzi = a(this.e.w());
      }
      break;
    case 53: 
      if (!this.e.U())
      {
        this.e.f(this.e.w() + 180);
        localzi = a(this.e.w());
      }
      else if (this.e.w() > 0)
      {
        localzi = a(this.e.w());
      }
      break;
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 184: 
      if (this.e.f) {
        localzi = b(this.e);
      } else {
        localzi = a(this.e);
      }
      break;
    case 42: 
      if (this.e.f) {
        localzi = b(this.e);
      } else {
        switch (this.e.c)
        {
        case 1: 
          break;
        case 2: 
          localzi = new zi(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.e.W().i());
          this.j = true;
          break;
        case 3: 
          localzi = new zi(-1.0F, 0.0F, 0.0F, -1.0F, this.e.W().h(), this.e.W().i());
          this.j = true;
          break;
        case 4: 
          localzi = new zi(-1.0F, 0.0F, 0.0F, 1.0F, this.e.W().h(), 0.0F);
          this.j = true;
        }
      }
      break;
    case 0: 
    case 19: 
      if ((this.e.V()) || (this.e.U()) || (this.e.w() != 0)) {
        localzi = b(this.e);
      }
      break;
    case 3: 
      if (this.e.f) {
        localzi = b(this.e);
      } else if (this.e.i)
      {
        if (paramzbni.w() != 0)
        {
          localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
          if ((this.e.y().i() == 0.0F) || (this.e.y().h() == 0.0F)) {
            localzq = new zq(this.e.W().f(), this.e.W().g(), this.e.W().h(), this.e.W().i());
          }
          localzo = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + localzq.i() / 2.0F);
          localzi.b(zbxz.a(localzo.d()), zbxz.a(localzo.e()));
          localzi.a(paramzbni.w());
          localzi.b(-zbxz.a(localzo.d()), -zbxz.a(localzo.e()));
          this.i = true;
        }
      }
      else {
        localzi = a(this.e);
      }
      break;
    case 32: 
      if (this.e.f)
      {
        if ((this.e.V()) || (this.e.U()) || (this.e.w() != 0)) {
          localzi = b(this.e);
        }
      }
      else if (paramzbni.w() != 0)
      {
        localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
        if ((this.e.y().i() == 0.0F) || (this.e.y().h() == 0.0F)) {
          localzq = new zq(this.e.W().f(), this.e.W().g(), this.e.W().h(), this.e.W().i());
        }
        localzo = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + localzq.i() / 2.0F);
        localzi.b(zbxz.a(localzo.d()), zbxz.a(localzo.e()));
        localzi.a(paramzbni.w());
        localzi.b(-zbxz.a(localzo.d()), -zbxz.a(localzo.e()));
        this.i = true;
      }
      break;
    case 1: 
      if (this.e.f)
      {
        boolean bool = this.e.V();
        if ((this.e.k.n instanceof GroupShape)) {
          if ((!((GroupShape)this.e.k.n).isFlippedHorizontally()) && (this.e.U())) {
            this.e.d(true);
          } else if ((((GroupShape)this.e.k.n).isFlippedHorizontally()) && (!this.e.U()) && (!this.e.J())) {
            this.e.d(true);
          }
        }
        localzi = b(this.e);
        this.e.d(bool);
      }
      else if ((this.e.w() > 0) && ((this.e.w() != 180) || (!this.e.U())))
      {
        if ((!this.e.f) && (!this.e.i)) {
          localzi = c(this.e);
        } else {
          localzi = a(paramzbni.w());
        }
      }
      break;
    default: 
      if (this.e.w() > 0) {
        if ((!this.e.f) && (!this.e.i)) {
          localzi = c(this.e);
        } else {
          localzi = a(paramzbni.w());
        }
      }
      break;
    }
    this.a.a(localzi);
  }
  
  private zi c(zbni paramzbni)
  {
    zi localzi = new zi();
    float f1;
    float f2;
    if (paramzbni.x())
    {
      if (paramzbni.ad())
      {
        f1 = paramzbni.v() + paramzbni.t() / 2.0F;
        f2 = paramzbni.u() + paramzbni.s() / 2.0F;
      }
      else
      {
        f1 = paramzbni.u() + paramzbni.s() / 2.0F;
        f2 = paramzbni.v() + paramzbni.t() / 2.0F;
      }
    }
    else
    {
      f1 = paramzbni.u() + paramzbni.s() / 2.0F;
      f2 = paramzbni.v() + paramzbni.t() / 2.0F;
    }
    localzi.a(paramzbni.w(), new zo(zbxz.a(f1), zbxz.a(f2)));
    if ((paramzbni.x()) && (paramzbni.ad())) {
      localzi.b(zbxz.a(paramzbni.t() / 2.0F - paramzbni.s() / 2.0F), zbxz.a(paramzbni.s() / 2.0F - paramzbni.t() / 2.0F));
    }
    this.i = true;
    return localzi;
  }
  
  ze a(zq paramzq)
  {
    return new ze();
  }
  
  void a(zr paramzr, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    zq localzq = new zq(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    ze localze = a(localzq);
    this.e.a(localze);
    zf localzf = paramzr.d();
    zs localzs = zbyb.a(this.e.A());
    paramzr.a(4, true);
    paramzr.a(localzs, localze);
    paramzr.a(localzf);
  }
  
  void b(zr paramzr, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    throws Exception
  {
    zq localzq = new zq(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    this.k = true;
    ze localze = a(localzq);
    if (localze == null)
    {
      this.k = false;
      return;
    }
    zf localzf = paramzr.d();
    paramzr.a(4, true);
    int m = 0;
    if ((!this.e.z().a()) && (this.e.z().c().c() == 0) && (!this.e.z().c().b().a())) {
      m = 1;
    }
    float f1 = this.e.z().c().b().c();
    if ((this.i) && (m != 0)) {
      this.e.z().c().b().a(this.e.z().c().b().c() - this.e.w());
    }
    zc localzc = zbyb.a(this.e.z(), localze);
    paramzr.a(localzc, localze);
    paramzr.a(localzf);
    if ((this.i) && (m != 0)) {
      this.e.z().c().b().a(f1);
    }
    this.k = false;
  }
  
  void b()
    throws Exception
  {
    zq localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
    zf localzf = this.a.d();
    this.a.a(4, true);
    if (!this.e.z().a()) {
      b(this.a, this.c, this.d, this.e.y().h(), this.e.y().i());
    }
    if (!this.e.A().a()) {
      a(this.a, this.c, this.d, this.e.y().h(), this.e.y().i());
    }
    a();
    this.a.a(localzf);
  }
  
  zq b(zq paramzq)
  {
    return paramzq;
  }
  
  void a()
    throws Exception
  {
    c(this.e.y());
  }
  
  void c(zq paramzq)
    throws Exception
  {
    if (this.e.K().equals("\n")) {
      return;
    }
    paramzq = b(paramzq);
    if ((paramzq.i() <= 0.0F) || (paramzq.h() <= 0.0F)) {
      return;
    }
    float f3;
    float f4;
    Object localObject2;
    if (this.e.ae())
    {
      zf localzf1 = this.a.d();
      this.a.b(4, false);
      com.aspose.cells.b.a.b.zg localzg = this.e.B();
      zt localzt1 = this.a.a(this.e.K(), localzg, Integer.MAX_VALUE, new zv(zv.c()));
      f3 = localzg.d();
      f4 = f3 * localzg.b().d(localzg.k()) / localzg.b().e(localzg.k());
      localzt1.b(localzt1.c() - f4);
      zq localzq2 = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
      if ((this.e.r != null) && ((this.e.r.b() == 172) || (this.e.r.b() == 173)))
      {
        f6 = (float)(this.e.r.getShapeAdjustValues().getCount() > 0 ? this.e.r.getShapeAdjustValues().get(0).getValue() : 0.5D);
        double d2 = 0.0D;
        if (this.e.r.b() == 172)
        {
          d2 = Math.atan(paramzq.i() * f6 / paramzq.h());
          localzq2.b(paramzq.g() + paramzq.i() * f6);
          localzq2.c((float)(paramzq.h() / Math.cos(d2)));
          localzq2.d((float)(paramzq.i() * (1.0F - f6) * Math.cos(d2)));
        }
        else if (this.e.r.b() == 173)
        {
          d2 = -Math.atan(paramzq.i() * (1.0F - f6) / paramzq.h());
          localzq2.b(paramzq.g());
          localzq2.c((float)(paramzq.h() / Math.cos(-d2)));
          localzq2.d((float)(paramzq.i() * f6 * Math.cos(-d2)));
        }
        localObject2 = new zi((float)Math.cos(d2), (float)-Math.sin(d2), 0.0F, (float)(1.0D / Math.cos(d2)), localzq2.f(), localzq2.g());
        this.a.a((zi)localObject2);
      }
      else
      {
        this.a.b(localzq2.f(), localzq2.g());
      }
      float f6 = 1.0F;
      if ((localzt1.b() > 0.0F) && (localzq2.h() > 2.0F)) {
        f6 = (localzq2.h() - 2.0F) / localzt1.b();
      }
      float f7 = 1.0F;
      if (localzt1.c() > 0.0F) {
        f7 = localzq2.i() / localzt1.c();
      }
      this.a.a(f6, f7);
      localzq2.a(0.0F);
      localzq2.b(-0.7F * f4);
      localzq2.c(localzq2.h() / f6);
      localzq2.d(localzq2.i() / f7);
      a(Math.max(f6, f7));
      zbyb.b(this.a, this.e, localzq2, this.e.K(), this.e.H(), localzg, this.e.C(), this.e.E(), this.e.F(), this.e.G());
      this.a.a(localzf1);
      return;
    }
    paramzq.a(paramzq.f() + (float)this.e.l().a());
    paramzq.c(paramzq.h() - (float)(this.e.l().a() + this.e.l().c()));
    paramzq.b(paramzq.g() + (float)this.e.l().b());
    paramzq.d(paramzq.i() - (float)(this.e.l().b() + this.e.l().d()));
    int m = this.e.B().d();
    float f1;
    if ((paramzq.i() < m) && ((int)this.e.I() == 0))
    {
      f1 = (m - paramzq.i()) / 2.0F;
      paramzq = new zq(paramzq.f(), paramzq.g() - f1, paramzq.h(), m);
    }
    if ((this.e.w() == 0) && (d()) && (paramzq.h() < m))
    {
      f1 = (m - paramzq.h()) / 2.0F;
      paramzq = new zq(paramzq.f() - f1, paramzq.g(), m, paramzq.i());
    }
    if (this.e.o != 0) {
      paramzq.a(paramzq.f() + this.e.o * 48);
    }
    zf localzf2 = null;
    if (this.e.J())
    {
      localzf2 = this.a.d();
      float f2 = paramzq.f() + paramzq.h() / 2.0F;
      f3 = paramzq.g() + paramzq.i() / 2.0F;
      f4 = 1.0F;
      float f5 = 1.0F;
      double d1 = 0.0D;
      if (this.i) {
        d1 = this.e.k.getRotationAngle();
      }
      if (this.j)
      {
        if (this.e.k.isFlippedHorizontally()) {
          f4 = -f4;
        }
        if (this.e.k.isFlippedVertically()) {
          f5 = -f5;
        }
      }
      d1 = f4 * f5 * d1;
      for (Object localObject1 = this.e.k; ((Shape)localObject1).W(); localObject1 = localObject2)
      {
        localObject2 = (Shape)((Shape)localObject1).J();
        if (((Shape)localObject2).isFlippedHorizontally()) {
          f4 = -f4;
        }
        if (((Shape)localObject2).isFlippedVertically()) {
          f5 = -f5;
        }
        double d3 = f4 * f5 * ((Shape)localObject2).getRotationAngle();
        d1 += d3;
      }
      d1 = (float)(d1 % 360.0D);
      localObject2 = new zi();
      ((zi)localObject2).b(zbxz.a(f2), zbxz.a(f3));
      ((zi)localObject2).a(-(float)d1);
      zi localzi = new zi(f4, 0.0F, 0.0F, f5, 0.0F, 0.0F);
      ((zi)localObject2).a(localzi, 0);
      ((zi)localObject2).b(-zbxz.a(f2), -zbxz.a(f3));
      this.a.a((zi)localObject2);
    }
    if (c())
    {
      zq localzq1 = zbxz.b(paramzq);
      localzq1.c(10000.0F);
      localzq1.d(10000.0F);
      zt localzt2 = zbyb.a(this.a, this.e, localzq1, this.e.K(), this.e.H(), this.e.B(), this.e.C(), this.e.E(), this.e.F(), this.e.G());
      if ((localzt2.b() > paramzq.h()) && (localzt2.c() > this.e.B().d() * 3.0F / 2.0F))
      {
        paramzq.c(localzt2.b());
        paramzq.d(localzt2.c());
      }
    }
    zbyb.b(this.a, this.e, paramzq, this.e.K(), this.e.H(), this.e.B(), this.e.C(), this.e.E(), this.e.F(), this.e.G());
    if (this.e.J()) {
      this.a.a(localzf2);
    }
  }
  
  private boolean c()
    throws Exception
  {
    if (this.e.p) {
      return false;
    }
    if (this.e.k.getTextHorizontalOverflow() != 2) {
      return false;
    }
    if (!zbyb.a(this.e.q)) {
      return false;
    }
    if (this.e.I() != 0.0D) {
      return false;
    }
    if (this.e.H() == 3) {
      return false;
    }
    if (this.e.H() == 0) {
      return false;
    }
    if (this.e.H() == 1) {
      return false;
    }
    return (this.e.K() != null) && (this.e.K().length() > 1);
  }
  
  private static void a(zbvz paramzbvz, float paramFloat)
  {
    if (paramzbvz == null) {
      return;
    }
    zanu localzanu = paramzbvz.c();
    if (!localzanu.a()) {
      localzanu.a(localzanu.h() / paramFloat);
    }
  }
  
  private void a(float paramFloat)
  {
    a(this.e.q, paramFloat);
    if (this.e.L() != null)
    {
      Iterator localIterator = this.e.L().iterator();
      while (localIterator.hasNext())
      {
        zbdc localzbdc = (zbdc)localIterator.next();
        if (localzbdc.c != null) {
          a(localzbdc.c, paramFloat);
        }
      }
    }
  }
  
  private boolean d()
  {
    if (this.e.H() == 3) {
      return false;
    }
    int m = 0;
    switch (this.e.H())
    {
    case 0: 
      m = -90;
      break;
    case 1: 
      m = 90;
      break;
    default: 
      m = 0;
    }
    m -= (int)this.e.I();
    m = Math.abs(m) % 360;
    return (m == 90) || (m == 270);
  }
  
  private zi a(int paramInt)
  {
    zi localzi = new zi();
    zq localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
    zo localzo = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + localzq.i() / 2.0F);
    localzi.b(zbxz.a(localzo.d()), zbxz.a(localzo.e()));
    localzi.a(paramInt);
    localzi.b(-zbxz.a(localzo.d()), -zbxz.a(localzo.e()));
    this.i = true;
    return localzi;
  }
  
  zi a(zbni paramzbni)
  {
    float f1;
    float f2;
    if (paramzbni.x())
    {
      f1 = paramzbni.v() + paramzbni.t() / 2.0F;
      f2 = paramzbni.u() + paramzbni.s() / 2.0F;
    }
    else
    {
      f1 = paramzbni.u() + paramzbni.s() / 2.0F;
      f2 = paramzbni.v() + paramzbni.t() / 2.0F;
    }
    zi localzi = new zi(paramzbni.V() ? -1.0F : 1.0F, 0.0F, 0.0F, paramzbni.U() ? -1.0F : 1.0F, paramzbni.V() ? zbxz.a(f1 * 2.0F) : 0.0F, paramzbni.U() ? zbxz.a(f2 * 2.0F) : 0.0F);
    this.j = true;
    localzi.a((paramzbni.V() ^ paramzbni.U()) ? -paramzbni.w() : paramzbni.w(), new zo(zbxz.a(f1), zbxz.a(f2)));
    this.i = true;
    if (paramzbni.x()) {
      if ((paramzbni.i) || (paramzbni.f))
      {
        if ((paramzbni.w() == 270) && (!paramzbni.U()) && (!paramzbni.V())) {
          localzi.b(zbxz.a(paramzbni.t() / 2.0F - paramzbni.s() / 2.0F), zbxz.a(paramzbni.u() + paramzbni.s() / 2.0F));
        }
      }
      else {
        localzi.b(zbxz.a(paramzbni.t() / 2.0F - paramzbni.s() / 2.0F), zbxz.a(paramzbni.s() / 2.0F - paramzbni.t() / 2.0F));
      }
    }
    return localzi;
  }
  
  zi b(zbni paramzbni)
  {
    float f1;
    float f2;
    if (!paramzbni.f)
    {
      if (paramzbni.x())
      {
        f1 = paramzbni.v() + paramzbni.t() / 2.0F;
        f2 = paramzbni.u() + paramzbni.s() / 2.0F;
      }
      else
      {
        f1 = paramzbni.u() + paramzbni.s() / 2.0F;
        f2 = paramzbni.v() + paramzbni.t() / 2.0F;
      }
    }
    else
    {
      f1 = paramzbni.u() + paramzbni.s() / 2.0F;
      f2 = paramzbni.v() + paramzbni.t() / 2.0F;
    }
    zi localzi = new zi(paramzbni.V() ? -1.0F : 1.0F, 0.0F, 0.0F, paramzbni.U() ? -1.0F : 1.0F, paramzbni.V() ? zbxz.a(f1 * 2.0F) : 0.0F, paramzbni.U() ? zbxz.a(f2 * 2.0F) : 0.0F);
    this.j = true;
    localzi.a((paramzbni.V() ^ paramzbni.U()) ? -paramzbni.w() : paramzbni.w(), new zo(zbxz.a(f1), zbxz.a(f2)));
    this.i = true;
    return localzi;
  }
  
  public void dispose()
  {
    a(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.b)
    {
      if (paramBoolean) {}
      this.b = true;
    }
  }
  
  protected void finalize()
    throws Exception
  {
    dispose();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */