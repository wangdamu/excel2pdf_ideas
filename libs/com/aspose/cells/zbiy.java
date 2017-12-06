package com.aspose.cells;

import com.aspose.cells.a.d.zcc;
import com.aspose.cells.b.a.b.a.za;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zk;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.util.Iterator;
import java.util.List;

final class zbiy
{
  private static void ch(zr paramzr, zbni paramzbni)
  {
    zf localzf = paramzr.d();
    paramzr.a(4, true);
    if (!paramzbni.A().a())
    {
      com.aspose.cells.a.d.zs localzs = zbyb.a(paramzbni.A());
      double d1 = paramzbni.A().h();
      double d2 = 0.0D;
      switch (paramzbni.A().i())
      {
      case 1: 
      case 2: 
        d2 = 0.0D;
        break;
      case 5: 
        d2 = d1 * 0.6000000238418579D;
        break;
      case 4: 
        d2 = 0.0D;
        break;
      case 3: 
        d2 = 0.0D;
      }
      double d3 = 0.0D;
      switch (paramzbni.A().l())
      {
      case 1: 
      case 2: 
        d3 = 0.0D;
        break;
      case 5: 
        d3 = d1 * 0.6000000238418579D;
        break;
      case 4: 
        d3 = 0.0D;
        break;
      case 3: 
        d3 = 0.0D;
      }
      zo localzo1;
      zo localzo2;
      if (paramzbni.s() == 0.0F)
      {
        localzo1 = new zo(paramzbni.u(), paramzbni.v());
        localzo2 = new zo(paramzbni.u(), paramzbni.y().m());
        if ((paramzbni.c == 1) || (paramzbni.c == 4))
        {
          localzo1.b(localzo1.e() + (float)d2);
          localzo2.b(localzo2.e() - (float)d3);
          paramzr.a(localzs, localzo1, localzo2);
        }
        else
        {
          localzo2.b(localzo2.e() - (float)d2);
          localzo1.b(localzo1.e() + (float)d3);
          if ((32 == paramzbni.r()) && (paramzbni.f)) {
            paramzr.a(localzs, localzo1, localzo2);
          } else {
            paramzr.a(localzs, localzo2, localzo1);
          }
        }
      }
      else if (paramzbni.t() == 0.0F)
      {
        localzo1 = new zo(paramzbni.u(), paramzbni.v());
        localzo2 = new zo(paramzbni.u() + paramzbni.s(), paramzbni.v());
        if ((paramzbni.c == 1) || (paramzbni.c == 2))
        {
          localzo1.a(localzo1.d() + (float)d2);
          localzo2.a(localzo2.d() - (float)d3);
          paramzr.a(localzs, localzo1, localzo2);
        }
        else
        {
          localzo2.a(localzo2.d() - (float)d2);
          localzo1.a(localzo1.d() + (float)d3);
          if ((32 == paramzbni.r()) && (paramzbni.f)) {
            paramzr.a(localzs, localzo1, localzo2);
          } else {
            paramzr.a(localzs, localzo2, localzo1);
          }
        }
      }
      else
      {
        double d4 = Math.sqrt(Math.pow(paramzbni.s(), 2.0D) + Math.pow(paramzbni.t(), 2.0D));
        double d5 = paramzbni.s() * d2 / d4;
        double d6 = paramzbni.t() * d2 / d4;
        double d7 = paramzbni.s() * d3 / d4;
        double d8 = paramzbni.t() * d3 / d4;
        zo localzo3 = new zo(paramzbni.u(), paramzbni.v());
        zo localzo4 = new zo(paramzbni.u(), paramzbni.v() + paramzbni.t());
        zo localzo5 = new zo(paramzbni.u() + paramzbni.s(), paramzbni.v() + paramzbni.t());
        zo localzo6 = new zo(paramzbni.u() + paramzbni.s(), paramzbni.v());
        if ((32 == paramzbni.r()) && (paramzbni.f))
        {
          localzo3.a(localzo3.d() + (float)d5);
          localzo3.b(localzo3.e() + (float)d6);
          localzo5.a(localzo5.d() - (float)d7);
          localzo5.b(localzo5.e() - (float)d8);
          paramzr.a(localzs, localzo3, localzo5);
          paramzbni.l = localzo3;
          paramzbni.m = localzo5;
        }
        else if (paramzbni.c == 1)
        {
          localzo3.a(localzo3.d() + (float)d5);
          localzo3.b(localzo3.e() + (float)d6);
          localzo5.a(localzo5.d() - (float)d7);
          localzo5.b(localzo5.e() - (float)d8);
          paramzr.a(localzs, localzo3, localzo5);
          paramzbni.l = localzo3;
          paramzbni.m = localzo5;
        }
        else if (paramzbni.c == 2)
        {
          localzo4.a(localzo4.d() + (float)d5);
          localzo4.b(localzo4.e() - (float)d6);
          localzo6.a(localzo6.d() - (float)d7);
          localzo6.b(localzo6.e() + (float)d8);
          paramzr.a(localzs, localzo4, localzo6);
          paramzbni.l = localzo4;
          paramzbni.m = localzo6;
        }
        else if (paramzbni.c == 3)
        {
          localzo5.a(localzo5.d() - (float)d5);
          localzo5.b(localzo5.e() - (float)d6);
          localzo3.a(localzo3.d() + (float)d7);
          localzo3.b(localzo3.e() + (float)d8);
          paramzr.a(localzs, localzo5, localzo3);
          paramzbni.l = localzo5;
          paramzbni.m = localzo3;
        }
        else
        {
          localzo6.a(localzo6.d() - (float)d5);
          localzo6.b(localzo6.e() + (float)d6);
          localzo4.a(localzo4.d() + (float)d7);
          localzo4.b(localzo4.e() - (float)d8);
          paramzr.a(localzs, localzo6, localzo4);
          paramzbni.l = localzo6;
          paramzbni.m = localzo4;
        }
      }
    }
    paramzr.a(localzf);
  }
  
  static void a(zr paramzr, zbni paramzbni)
    throws Exception
  {
    if ((paramzbni.k.isHidden()) || (paramzbni.y().h() == 0.0F) || (paramzbni.y().i() == 0.0F)) {
      return;
    }
    zblg localzblg = new zblg(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzblg.b();
  }
  
  static void b(zr paramzr, zbni paramzbni)
  {
    if ((paramzbni.k.isHidden()) || (paramzbni.y().h() == 0.0F) || (paramzbni.y().i() == 0.0F)) {}
  }
  
  static void c(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zq localzq = paramzbni.y();
    int i = paramzbni.B().d();
    if (localzq.i() < i)
    {
      float f = (i - localzq.i()) / 2.0F;
      localzq = new zq(localzq.f(), localzq.g() - f, localzq.h(), i);
    }
    zbyb.b(paramzr, paramzbni, localzq, paramzbni.K(), 2, paramzbni.B(), Color.getBlack(), 7, 9, paramzbni.G());
  }
  
  static void d(zr paramzr, zbni paramzbni)
  {
    float f1 = 8.0F;
    float f2 = 8.0F;
    com.aspose.cells.a.d.zs localzs = new com.aspose.cells.a.d.zs(Color.getBlack());
    zt localzt = paramzr.a(paramzbni.K(), paramzbni.B());
    zq localzq1 = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
    if (localzt.b() + f1 + f2 <= paramzbni.s()) {
      f2 = paramzbni.s() - f1 - localzt.b();
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(localzq1.f(), localzq1.g(), localzq1.f() + f1, localzq1.g());
    localze.b(localzq1.f(), localzq1.g(), localzq1.f(), localzq1.m() - 1.0F);
    localze.b(localzq1.f(), localzq1.m() - 1.0F, localzq1.l(), localzq1.m() - 1.0F);
    localze.b(localzq1.l(), localzq1.m() - 1.0F, localzq1.l(), localzq1.g());
    localze.b(localzq1.l(), localzq1.g(), localzq1.l() - f2, localzq1.g());
    paramzr.a(localzs, localze);
    zq localzq2 = new zq(localzq1.f() + f1, localzq1.g() - localzt.c() / 2.0F, localzt.b(), localzt.c());
    paramzr.a(paramzbni.K(), paramzbni.B(), new zu(Color.getBlack()), localzq2);
  }
  
  static void e(zr paramzr, zbni paramzbni)
    throws Exception
  {
    Color localColor1 = Color.a(zk.f);
    Color localColor2 = Color.a(zk.g);
    Color localColor3 = Color.getWhite();
    Color localColor4 = Color.getBlack();
    zq localzq = paramzbni.y();
    paramzr.b(new zu(localColor1), localzq.f(), localzq.g(), localzq.h(), localzq.i());
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    localze1.b(localzq.f() + 1.0F, localzq.m() - 1.0F, localzq.l() - 1.0F, localzq.m() - 1.0F);
    localze1.b(localzq.l() - 1.0F, localzq.g() + 1.0F, localzq.l() - 1.0F, localzq.m() - 1.0F);
    paramzr.a(new com.aspose.cells.a.d.zs(localColor2), localze1);
    com.aspose.cells.b.a.b.a.ze localze2 = new com.aspose.cells.b.a.b.a.ze();
    localze2.b(localzq.f(), localzq.g(), localzq.l(), localzq.g());
    localze2.b(localzq.f(), localzq.g(), localzq.f(), localzq.m());
    paramzr.a(new com.aspose.cells.a.d.zs(localColor3), localze2);
    com.aspose.cells.b.a.b.a.ze localze3 = new com.aspose.cells.b.a.b.a.ze();
    localze3.b(localzq.f(), localzq.m(), localzq.l(), localzq.m());
    localze3.b(localzq.l(), localzq.g(), localzq.l(), localzq.m());
    paramzr.a(new com.aspose.cells.a.d.zs(localColor4), localze3);
    zf localzf = paramzr.d();
    paramzr.a(paramzbni.y());
    zbyb.b(paramzr, paramzbni, paramzbni.y(), paramzbni.K(), paramzbni.H(), paramzbni.B(), paramzbni.C(), paramzbni.E(), paramzbni.F(), paramzbni.G());
    paramzr.a(localzf);
  }
  
  static void f(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zq localzq1 = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
    zf localzf = null;
    int i = 0;
    if (!paramzbni.z().a())
    {
      com.aspose.cells.b.a.b.zc localzc = zbyb.a(paramzbni.z(), localzq1);
      paramzr.b(localzc, localzq1);
    }
    if ((paramzbni.z().a()) && (!paramzbni.k.T()))
    {
      localzf = paramzr.d();
      i = 1;
      paramzr.b(4, false);
    }
    Object localObject1;
    Object localObject2;
    if (!paramzbni.A().a())
    {
      int j = paramzbni.A().i();
      int k = paramzbni.A().l();
      paramzbni.A().e(0);
      paramzbni.A().h(0);
      localObject1 = zbyb.a(paramzbni.A());
      localObject2 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
      ((zq)localObject2).a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
      paramzr.c((com.aspose.cells.a.d.zs)localObject1, ((zq)localObject2).f(), ((zq)localObject2).g(), ((zq)localObject2).h(), ((zq)localObject2).i());
      paramzbni.A().e(j);
      paramzbni.A().h(k);
    }
    if (paramzbni.Y())
    {
      if (paramzbni.k.getActiveXControl().getType() == 2) {
        a(paramzr, paramzbni, localzq1);
      } else if (paramzbni.k.getActiveXControl().getType() == 6) {
        b(paramzr, paramzbni, localzq1);
      }
    }
    else if (paramzbni.q() == 11) {
      a(paramzr, paramzbni, localzq1);
    } else if (paramzbni.q() == 12) {
      b(paramzr, paramzbni, localzq1);
    }
    if ((paramzbni.K() != null) && (!"".equals(paramzbni.K())))
    {
      float f1 = 5.0F;
      float f2 = 10.0F;
      localObject1 = new zq(localzq1.f() + f1, localzq1.g() + (localzq1.i() - f2) / 2.0F, f2, f2);
      localObject2 = new zv(zv.c());
      float f3 = paramzbni.s() + 1.0F;
      String str = "a";
      if (paramzbni.K().length() > 0) {
        str = paramzbni.K().substring(0, 1);
      }
      zt localzt1 = paramzr.a(str, paramzbni.B());
      if (f3 < localzt1.b()) {
        f3 = localzt1.b();
      }
      float f4 = paramzbni.t() - 10.0F;
      if (f4 <= localzt1.c()) {
        f4 = localzt1.c();
      }
      zt localzt2 = new zt(f3, f4);
      zt localzt3 = paramzr.a(paramzbni.K(), paramzbni.B(), localzt2, (zv)localObject2);
      int m = zbxz.a(paramzr, paramzbni.B());
      zq localzq2 = new zq(((zq)localObject1).l() + m, localzq1.g() + (localzq1.i() - localzt3.c()) / 2.0F, localzt3.b(), localzt3.c());
      localzq2.d(localzq2.i() + 0.5F);
      paramzr.a(paramzbni.K(), paramzbni.B(), new zu(paramzbni.C()), localzq2, (zv)localObject2);
    }
    if (i != 0) {
      paramzr.a(localzf);
    }
  }
  
  private static void a(zr paramzr, zbni paramzbni, zq paramzq)
  {
    zf localzf = paramzr.d();
    zq localzq1 = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    if (localzq1.h() <= 0.0F) {
      localzq1.c(0.01F);
    }
    if (localzq1.i() <= 0.0F) {
      localzq1.d(0.01F);
    }
    paramzr.a(localzq1);
    float f1 = 5.0F;
    float f2 = 10.0F;
    zq localzq2 = new zq(paramzq.f() + f1, paramzq.g() + (paramzq.i() - f2) / 2.0F, f2, f2);
    zu localzu = new zu(Color.getWhite());
    paramzr.b(localzu, localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
    Object localObject;
    if (paramzbni.M() == 1)
    {
      localObject = new com.aspose.cells.b.a.b.a.ze();
      ((com.aspose.cells.b.a.b.a.ze)localObject).b(localzq2.f() + 3.0F, localzq2.g() + 6.0F, localzq2.f() + 5.0F, localzq2.g() + 8.0F);
      ((com.aspose.cells.b.a.b.a.ze)localObject).b(localzq2.f() + 5.0F, localzq2.g() + 8.0F, localzq2.f() + 7.0F, localzq2.g() + 4.0F);
      paramzr.a(new com.aspose.cells.a.d.zs(Color.getBlack()), (com.aspose.cells.b.a.b.a.ze)localObject);
    }
    else if (paramzbni.M() == 2)
    {
      localObject = new com.aspose.cells.b.a.b.a.zg(12, Color.getBlack(), Color.getWhite());
      paramzr.b((com.aspose.cells.b.a.b.zc)localObject, localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
    }
    paramzr.c(new com.aspose.cells.a.d.zs(Color.getBlack()), localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
    paramzr.a(localzf);
  }
  
  private static void b(zr paramzr, zbni paramzbni, zq paramzq)
  {
    zf localzf = paramzr.d();
    zq localzq1 = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    if (localzq1.h() <= 0.0F) {
      localzq1.c(0.01F);
    }
    if (localzq1.i() <= 0.0F) {
      localzq1.d(0.01F);
    }
    paramzr.a(localzq1);
    float f1 = 5.0F;
    float f2 = 10.0F;
    zq localzq2 = new zq(paramzq.f() + f1, paramzq.g() + (paramzq.i() - f2) / 2.0F, f2, f2);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.getBlack()), localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i(), 0.0F, 360.0F);
    zu localzu = new zu(Color.getWhite());
    paramzr.a(localzu, localzq2.f() + 1.0F, localzq2.g() + 1.0F, localzq2.h() - 2.0F, localzq2.i() - 2.0F, -90.0F, 450.0F);
    if (paramzbni.M() == 1) {
      paramzr.a(new zu(Color.getBlack()), localzq2.f() + 2.5F, localzq2.g() + 2.5F, f2 / 2.0F, f2 / 2.0F, 0.0F, 360.0F);
    }
    paramzr.a(localzf);
  }
  
  static void g(zr paramzr, zbni paramzbni)
  {
    zq localzq1 = paramzbni.y();
    float f1 = 14.0F;
    zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h() - f1, localzq1.i());
    paramzr.b(new zu(Color.getWhite()), localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(localzq2.f(), localzq2.g(), localzq2.l(), localzq2.g());
    localze.b(localzq2.f(), localzq2.g(), localzq2.f(), localzq2.m());
    localze.b(localzq2.f(), localzq2.m(), localzq2.l(), localzq2.m());
    paramzr.a(new com.aspose.cells.a.d.zs(Color.getBlack()), localze);
    float f2 = paramzr.a("a", paramzbni.B()).c();
    float f3 = localzq1.g() + 1.0F;
    for (int i = paramzbni.O(); (paramzbni.N() != null) && (i < paramzbni.N().size()) && (f3 < localzq1.m() - 1.0F); i++)
    {
      String str = com.aspose.cells.b.a.ze.e(paramzbni.N().get(i));
      localzq3 = new zq(localzq1.f() + 1.0F, f3, localzq2.h() - 2.0F, f2);
      if (paramzbni.P() != null)
      {
        localObject1 = paramzbni.P().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = ((Iterator)localObject1).next();
          if (com.aspose.cells.b.a.ze.d(localObject2) == i) {
            paramzr.b(new zu(Color.fromArgb(51, 153, 255)), localzq3.f(), localzq3.g(), localzq3.h(), localzq3.i());
          }
        }
      }
      paramzr.a(str, paramzbni.B(), new zu(paramzbni.C()), localzq3);
      f3 += f2;
    }
    int j = i - 1;
    zq localzq3 = new zq(localzq2.l() + 1.0F, localzq2.g(), f1, localzq1.i());
    paramzr.b(new zu(Color.fromArgb(212, 208, 200)), localzq3.f(), localzq3.g(), localzq3.h(), localzq3.i() + 1.0F);
    Object localObject1 = new zq(localzq3.f(), localzq3.g(), f1, 11.0F);
    paramzr.b(new zu(Color.a(zk.f)), ((zq)localObject1).f(), ((zq)localObject1).g(), ((zq)localObject1).h(), ((zq)localObject1).i());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.getWhite()), ((zq)localObject1).f() + 1.0F, ((zq)localObject1).g() + 1.0F, ((zq)localObject1).f() + 1.0F, ((zq)localObject1).m() - 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.a(zk.g)), ((zq)localObject1).f() + 1.0F, ((zq)localObject1).m(), ((zq)localObject1).l() - 2.0F, ((zq)localObject1).m());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.a(zk.g)), ((zq)localObject1).l() - 1.0F, ((zq)localObject1).g() + 1.0F, ((zq)localObject1).l() - 1.0F, ((zq)localObject1).m() - 1.0F);
    Object localObject2 = new com.aspose.cells.b.a.b.a.ze();
    ((com.aspose.cells.b.a.b.a.ze)localObject2).b(((zq)localObject1).l(), ((zq)localObject1).g(), ((zq)localObject1).l(), ((zq)localObject1).m());
    ((com.aspose.cells.b.a.b.a.ze)localObject2).b(((zq)localObject1).l() - 1.0F, ((zq)localObject1).m(), ((zq)localObject1).l(), ((zq)localObject1).m());
    paramzr.a(new com.aspose.cells.a.d.zs(Color.getBlack()), (com.aspose.cells.b.a.b.a.ze)localObject2);
    paramzr.b(new zu(Color.getBlack()), ((zq)localObject1).f() + 5.0F, ((zq)localObject1).g() + 5.0F, 2.0F, 2.0F);
    zq localzq4 = new zq(localzq3.f(), localzq3.m() - 11.0F, f1, 11.0F);
    b(paramzr, localzq4);
    paramzr.b(new zu(Color.getBlack()), localzq4.f() + 5.0F, localzq4.g() + 5.0F, 2.0F, 2.0F);
    if ((paramzbni.N() != null) && (j - paramzbni.O() < paramzbni.N().size() - 1))
    {
      float f4 = (j + 1) / paramzbni.N().size() * (localzq1.i() - ((zq)localObject1).i() - localzq4.i());
      float f5 = (paramzbni.O() + 1) / paramzbni.N().size() * (localzq1.i() - ((zq)localObject1).i() - localzq4.i());
      zq localzq5 = new zq(localzq3.f(), localzq3.g() + ((zq)localObject1).i() + f5, f1, f4);
      b(paramzr, localzq5);
    }
  }
  
  static void h(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zq localzq1 = paramzbni.y();
    paramzr.b(new zu(Color.getWhite()), localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
    float f1 = 0.0F;
    if (localzq1.h() > localzq1.i()) {
      f1 = localzq1.i();
    } else {
      f1 = localzq1.h();
    }
    zq localzq2 = new zq(localzq1.l() - f1, localzq1.g(), f1, localzq1.i());
    a(paramzr, localzq2);
    float f2 = localzq2.h() / 2.0F;
    if (localzq2.i() < localzq2.h()) {
      f2 = localzq2.i() / 2.0F;
    }
    float f3 = f2 / 2.0F;
    zo localzo1 = new zo(localzq2.f() + localzq2.h() / 2.0F, localzq2.g() + localzq2.i() / 2.0F + f3 * 0.4F);
    zo localzo2 = new zo(localzo1.d() - f2 / 2.0F, localzo1.e() - f3);
    zo localzo3 = new zo(localzo1.d() + f2 / 2.0F, localzo2.e());
    paramzr.a(new zu(Color.getBlack()), new zo[] { localzo1, localzo2, localzo3 });
    if ((localzq1.h() > localzq1.i()) && (paramzbni.Q() != null) && (!"".equals(paramzbni.Q())))
    {
      zq localzq3 = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
      localzq3.a(localzq3.f() + 5.0F);
      zbyb.b(paramzr, paramzbni, localzq3, paramzbni.Q(), paramzbni.H(), paramzbni.B(), paramzbni.C(), 7, 1, paramzbni.G());
    }
    paramzr.c(new com.aspose.cells.a.d.zs(Color.fromArgb(130, 135, 144)), localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
  }
  
  static void i(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zf localzf = paramzr.d();
    if ((paramzbni.g() > paramzbni.e()) && (paramzbni.f() + 1 <= paramzbni.d())) {
      paramzr.b(paramzbni.j(), 0.0F);
    } else if ((paramzbni.f() + 1 > paramzbni.d()) && (paramzbni.g() <= paramzbni.e())) {
      paramzr.b(0.0F, paramzbni.k());
    } else if ((paramzbni.f() + 1 > paramzbni.d()) && (paramzbni.g() > paramzbni.e())) {
      paramzr.b(0.0F, 0.0F);
    } else {
      paramzr.b(paramzbni.j(), paramzbni.k());
    }
    ci(paramzr, paramzbni);
    zq localzq1 = paramzbni.y();
    localzq1.a(-3.0F, -1.0F);
    zbyb.b(paramzr, paramzbni, localzq1, paramzbni.K(), 2, paramzbni.B(), Color.getBlack(), 7, 9, paramzbni.G());
    zq localzq2 = paramzbni.y();
    zo localzo1 = new zo(localzq2.f(), localzq2.g());
    zo localzo2 = new zo(localzq2.l() + 1.0F, localzq2.g() + 3.0F);
    zo localzo3 = new zo(localzq2.l() + 1.0F, localzq2.m() + 2.0F);
    zo localzo4 = new zo(localzq2.f() + 3.0F, localzq2.m() + 1.0F);
    com.aspose.cells.a.d.zs localzs = zbyb.a(paramzbni.A());
    localzs.b(3.0F);
    paramzr.a(localzs, localzo2, localzo3);
    localzo3 = new zo(localzq2.l() + 3.0F, localzq2.m() + 1.0F);
    paramzr.a(localzs, localzo4, localzo3);
    paramzr.a(localzf);
    localzs.b(1.0F);
    za localza = new za(3.0F, 3.0F);
    localzs.b(localza);
    zo localzo5 = new zo(paramzbni.j(), paramzbni.k());
    if ((paramzbni.g() > paramzbni.e()) && (paramzbni.f() + 1 <= paramzbni.d()))
    {
      localzo1 = new zo(0.0F, paramzbni.W().i() - 5.0F);
      localzo5 = new zo(paramzbni.j(), 0.0F);
      if (paramzbni.k() < paramzbni.y().i()) {
        localzo1 = new zo(0.0F, paramzbni.k());
      }
    }
    else if ((paramzbni.f() + 1 > paramzbni.d()) && (paramzbni.g() <= paramzbni.e()))
    {
      localzo1 = new zo(paramzbni.W().h() - 5.0F, 0.0F);
      localzo5 = new zo(paramzbni.y().h(), paramzbni.k());
      if (paramzbni.j() < paramzbni.y().h()) {
        localzo1 = new zo(paramzbni.j(), 0.0F);
      }
    }
    else if ((paramzbni.f() + 1 > paramzbni.d()) && (paramzbni.g() > paramzbni.e()))
    {
      if ((paramzbni.k() > paramzbni.y().i()) && (paramzbni.j() > paramzbni.y().h()))
      {
        localzo1 = new zo(paramzbni.W().h() - 5.0F, paramzbni.k());
        localzo5 = new zo(paramzbni.y().h(), paramzbni.y().i());
      }
      else if ((paramzbni.k() <= paramzbni.y().i()) && (paramzbni.j() > paramzbni.y().h()))
      {
        localzo1 = new zo(paramzbni.W().h() - 5.0F, paramzbni.k());
        localzo5 = new zo(paramzbni.y().h(), 0.0F);
      }
      else if ((paramzbni.k() > paramzbni.y().i()) && (paramzbni.j() <= paramzbni.y().h()))
      {
        localzo1 = new zo(paramzbni.j(), paramzbni.W().i() - 5.0F);
        localzo5 = new zo(paramzbni.W().h() - 5.0F, paramzbni.y().i());
      }
    }
    paramzr.a(localzs, localzo1, localzo5);
  }
  
  static void j(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zi localzi = a(paramzbni, false);
    paramzr.a(localzi);
    zq localzq1 = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
    if (!paramzbni.z().a())
    {
      localObject = zbyb.a(paramzbni.z(), localzq1);
      paramzr.b((com.aspose.cells.b.a.b.zc)localObject, localzq1);
    }
    Object localObject = (Picture)paramzbni.k;
    zj localzj = null;
    zm localzm = zbxz.b((Picture)localObject);
    if ((localzm == null) || (localzm.h() == 0L)) {
      return;
    }
    int i = zcc.a(localzm);
    if (zat.a((Shape)localObject, i))
    {
      localzm = zat.a((Shape)localObject, localzm);
      localzm.b(0L);
    }
    localzj = zj.a(localzm);
    if ((localzj != null) && (localzq1.h() != 0.0F) && (localzq1.i() != 0.0F))
    {
      double d1 = paramzbni.k.getFormatPicture().getLeftCrop();
      double d2 = paramzbni.k.getFormatPicture().getRightCrop();
      double d3 = paramzbni.k.getFormatPicture().getTopCrop();
      double d4 = paramzbni.k.getFormatPicture().getBottomCrop();
      float f1;
      if (d1 + d2 + d3 + d4 != 0.0D)
      {
        f1 = (float)(localzj.m().b() * d1);
        float f2 = (float)(localzj.m().c() * d3);
        float f3 = (float)(localzj.m().b() * (1.0D - d1 - d2));
        float f4 = (float)(localzj.m().c() * (1.0D - d3 - d4));
        float f5 = 0.5F;
        zq localzq3 = new zq(f1 - f5, f2 - f5, f3 + 2.0F * f5, f4 + 2.0F * f5);
        paramzr.a(localzj, localzq1, localzq3, 2);
      }
      else
      {
        if (paramzbni.k.getFormatPicture().getBrightness() != 0.0D) {
          localzj = zbxz.a(localzj, (int)paramzbni.s(), (int)paramzbni.t(), paramzbni.k.getFormatPicture().getBrightness());
        }
        if (paramzbni.k.getFormatPicture().getContrast() != 0.0D) {
          localzj = zbxz.b(localzj, (int)paramzbni.s(), (int)paramzbni.t(), paramzbni.k.getFormatPicture().getContrast());
        }
        if ((localzj.m().b() != 0) && (localzj.m().c() != 0)) {
          if (((Picture)localObject).c)
          {
            f1 = 1.0F;
            zq localzq2 = new zq(-f1, -f1, localzj.m().b() + 2.0F * f1, localzj.m().c() + 2.0F * f1);
            paramzr.a(localzj, localzq1, localzq2, 2);
          }
          else
          {
            paramzr.a(localzj, paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
          }
        }
      }
    }
    if (localzj != null) {
      localzj.d();
    }
    if (!paramzbni.A().a())
    {
      int j = paramzbni.A().i();
      int k = paramzbni.A().l();
      paramzbni.A().e(0);
      paramzbni.A().h(0);
      com.aspose.cells.a.d.zs localzs = zbyb.a(paramzbni.A());
      localzq1.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
      paramzr.c(localzs, localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
      paramzbni.A().e(j);
      paramzbni.A().h(k);
    }
  }
  
  static void k(zr paramzr, zbni paramzbni)
  {
    zq localzq = paramzbni.y();
    paramzr.b(new zu(Color.fromArgb(240, 240, 240)), localzq.f(), localzq.g(), localzq.h(), localzq.i());
    float f1 = localzq.m() - 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(234, 234, 234)), localzq.j(), f1, localzq.l(), f1);
    f1 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(244, 244, 244)), localzq.j(), f1, localzq.l(), f1);
    f1 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(244, 244, 244)), localzq.j(), f1, localzq.l(), f1);
    f1 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(243, 243, 243)), localzq.j(), f1, localzq.l(), f1);
    f1 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(242, 242, 242)), localzq.j(), f1, localzq.l(), f1);
    f1 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(241, 241, 241)), localzq.j(), f1, localzq.l(), f1);
    float f2 = localzq.j();
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(248, 248, 248)), f2, localzq.k(), f2, localzq.m());
    f2 += 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(227, 227, 227)), f2, localzq.k(), f2, localzq.m());
    f2 += 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(227, 227, 227)), f2, localzq.k(), f2, localzq.m());
    f2 += 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(231, 231, 231)), f2, localzq.k(), f2, localzq.m());
    f2 += 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(237, 237, 237)), f2, localzq.k(), f2, localzq.m());
    f2 += 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(239, 239, 239)), f2, localzq.k(), f2, localzq.m());
    f2 = localzq.l() - 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(234, 234, 234)), f2, localzq.k(), f2, localzq.m());
    f2 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(242, 242, 242)), f2, localzq.k(), f2, localzq.m());
    f2 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(241, 241, 241)), f2, localzq.k(), f2, localzq.m());
    int[][] arrayOfInt1 = { { 245, 246, 243, 241, 236, 246, 238, 249, 243, 242, 241, 240, 240, 240, 240 }, { 237, 235, 232, 237, 242, 245, 247, 244, 244, 244, 242, 242, 241, 240, 240 }, { 240, 245, 242, 239, 250, 243, 243, 34, 246, 244, 243, 241, 240, 240, 240 }, { 244, 231, 242, 247, 245, 249, 32, 36, 66, 249, 242, 242, 242, 241, 240 }, { 239, 247, 245, 248, 236, 33, 42, 89, 88, 78, 254, 243, 248, 240, 234 }, { 241, 247, 243, 246, 31, 55, 86, 117, 116, 93, 78, 240, 244, 246, 244 }, { 238, 243, 247, 45, 78, 125, 153, 154, 155, 148, 126, 113, 252, 237, 247 }, { 243, 247, 104, 138, 176, 191, 186, 191, 191, 196, 195, 193, 167, 246, 246 }, { 241, 249, 242, 249, 241, 251, 247, 244, 239, 246, 247, 239, 239, 243, 247 }, { 242, 245, 249, 243, 243, 241, 244, 247, 247, 250, 248, 240, 250, 249, 234 } };
    int i = com.aspose.cells.a.c.zc.a(arrayOfInt1, 0);
    int j = com.aspose.cells.a.c.zc.a(arrayOfInt1, 1);
    float f3 = localzq.f() + localzq.h() / 2.0F - j / 2;
    float f4 = localzq.g() + localzq.h() / 2.0F - i / 2;
    f1 = f4;
    for (int k = 0; k < i; k++)
    {
      f2 = f3;
      for (m = 0; m < j; m++)
      {
        n = arrayOfInt1[k][m];
        paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(n, n, n)), f2, f1, f2 + 1.0F, f1);
        f2 += 1.0F;
      }
      f1 += 1.0F;
    }
    int[][] arrayOfInt2 = { { 242, 248, 241, 245, 249, 242, 243, 246, 245, 241, 251, 238, 244, 245 }, { 244, 245, 243, 240, 245, 244, 249, 247, 241, 248, 243, 247, 249, 245 }, { 246, 55, 45, 31, 29, 35, 28, 26, 37, 41, 84, 122, 244, 233 }, { 244, 247, 100, 104, 88, 84, 91, 85, 108, 156, 180, 238, 245, 251 }, { 244, 245, 249, 124, 130, 132, 121, 155, 183, 204, 246, 247, 245, 239 }, { 241, 241, 246, 243, 133, 139, 154, 178, 198, 241, 245, 245, 241, 243 }, { 240, 241, 246, 242, 247, 132, 185, 205, 254, 244, 253, 238, 237, 239 }, { 240, 239, 245, 244, 242, 251, 189, 244, 241, 246, 236, 238, 247, 241 }, { 240, 239, 240, 241, 244, 245, 246, 245, 244, 240, 240, 240, 240, 240 } };
    i = com.aspose.cells.a.c.zc.a(arrayOfInt2, 0);
    j = com.aspose.cells.a.c.zc.a(arrayOfInt2, 1);
    f3 = localzq.f() + localzq.h() / 2.0F - j / 2;
    f4 = localzq.m() - localzq.h() / 2.0F - i / 2;
    f1 = f4;
    for (int m = 0; m < i; m++)
    {
      f2 = f3;
      for (n = 0; n < j; n++)
      {
        i1 = arrayOfInt2[m][n];
        paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(i1, i1, i1)), f2, f1, f2 + 1.0F, f1);
        f2 += 1.0F;
      }
      f1 += 1.0F;
    }
    int[] arrayOfInt3 = { 154, 227, 221, 215, 211, 221, 150 };
    int n = 150;
    int i1 = 207;
    int i2 = 151;
    int[] arrayOfInt4 = { 203, 206, 199, 187 };
    int[][] arrayOfInt5 = { { 246, 246, 246, 242, 241, 239 }, { 245, 245, 243, 240, 238, 236 }, { 245, 243, 240, 236, 234, 232 }, { 244, 241, 236, 233, 231, 230 }, { 228, 241, 239, 236, 235, 234 } };
    float f5 = localzq.g() + localzq.h() + (localzq.i() - 2.0F * localzq.h()) * paramzbni.R() / (paramzbni.T() - paramzbni.S());
    i = com.aspose.cells.a.c.zc.a(arrayOfInt5, 0);
    j = com.aspose.cells.a.c.zc.a(arrayOfInt5, 1);
    f3 = localzq.f() + 2.0F;
    f4 = f5 - 2.0F;
    f1 = f4;
    for (int i3 = 0; i3 < i; i3++)
    {
      f2 = f3;
      for (int i4 = 0; i4 < j; i4++)
      {
        int i5 = arrayOfInt5[i3][i4];
        paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(i5, i5, i5)), f2, f1, f2 + 1.0F, f1);
        f2 += 1.0F;
      }
      f1 += 1.0F;
    }
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt4[0], arrayOfInt4[0], arrayOfInt4[0])), localzq.f() + 1.0F, f5 - 3.0F, localzq.f() + 2.0F, f5 - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt4[1], arrayOfInt4[1], arrayOfInt4[1])), localzq.l() - 3.0F, f5 - 3.0F, localzq.l() - 2.0F, f5 - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt4[2], arrayOfInt4[2], arrayOfInt4[2])), localzq.f() + 1.0F, f5 + 3.0F, localzq.f() + 2.0F, f5 + 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt4[3], arrayOfInt4[3], arrayOfInt4[3])), localzq.l() - 3.0F, f5 + 3.0F, localzq.l() - 2.0F, f5 + 3.0F);
    f2 = localzq.f() + 2.0F + com.aspose.cells.a.c.zc.a(arrayOfInt5, 1);
    f1 = f5 - 2.0F;
    for (i3 = 1; i3 < arrayOfInt3.length - 1; i3++)
    {
      paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt3[i3], arrayOfInt3[i3], arrayOfInt3[i3])), f2, f1, localzq.l() - 3.0F, f1);
      f1 += 1.0F;
    }
    f2 = localzq.f() + 2.0F;
    f1 = f5 - 3.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt3[0], arrayOfInt3[0], arrayOfInt3[0])), f2, f1, localzq.l() - 3.0F, f1);
    f2 = localzq.f() + 2.0F;
    f1 = f5 + 3.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt3[6], arrayOfInt3[6], arrayOfInt3[6])), f2, f1, localzq.l() - 3.0F, f1);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(i2, i2, i2)), localzq.f() + 1.0F, f5 - 2.0F, localzq.f() + 1.0F, f5 + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(n, n, n)), localzq.l() - 2.0F, f5 - 2.0F, localzq.l() - 2.0F, f5 + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(i1, i1, i1)), localzq.l() - 3.0F, f5 - 2.0F, localzq.l() - 3.0F, f5 + 2.0F);
  }
  
  static void l(zr paramzr, zbni paramzbni)
  {
    zq localzq1 = paramzbni.y();
    paramzr.b(new zu(Color.getWhite()), localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
    zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i() / 2.0F);
    a(paramzr, localzq2);
    float f1 = localzq2.h() / 2.0F;
    if (localzq2.i() < localzq2.h()) {
      f1 = localzq2.i() / 2.0F;
    }
    float f2 = f1 / 2.0F;
    zo localzo1 = new zo(localzq2.f() + localzq2.h() / 2.0F, localzq2.g() + localzq2.i() / 2.0F - f2 * 0.4F);
    zo localzo2 = new zo(localzo1.d() - f1 / 2.0F, localzo1.e() + f2);
    zo localzo3 = new zo(localzo1.d() + f1 / 2.0F, localzo2.e());
    paramzr.a(new zu(Color.getBlack()), new zo[] { localzo1, localzo2, localzo3 });
    zq localzq3 = new zq(localzq1.f(), localzq1.g() + localzq1.i() / 2.0F, localzq1.h(), localzq1.i() / 2.0F);
    a(paramzr, localzq3);
    localzo1 = new zo(localzq3.f() + localzq3.h() / 2.0F, localzq3.g() + localzq3.i() / 2.0F + f2 * 0.4F);
    localzo2 = new zo(localzo1.d() - f1 / 2.0F, localzo1.e() - f2);
    localzo3 = new zo(localzo1.d() + f1 / 2.0F, localzo2.e());
    paramzr.a(new zu(Color.getBlack()), new zo[] { localzo1, localzo2, localzo3 });
  }
  
  private static void a(zr paramzr, zq paramzq)
  {
    int[] arrayOfInt1 = { 242, 241, 240, 239, 237, 236, 235 };
    int[] arrayOfInt2 = { 221, 219, 218, 216, 214, 212, 210, 209, 207 };
    int i = zbyb.a((paramzq.i() - 4.0F) / 2.0F / arrayOfInt1.length);
    float f = paramzq.g() + 3.0F;
    int k;
    com.aspose.cells.a.d.zs localzs;
    for (int j = 0; j < arrayOfInt1.length; j++) {
      for (k = 0; k < i; k++)
      {
        localzs = new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt1[j], arrayOfInt1[j], arrayOfInt1[j]));
        try
        {
          paramzr.b(localzs, paramzq.f() + 2.0F, f, paramzq.l() - 3.0F, f);
          f += 1.0F;
        }
        finally
        {
          if (localzs != null) {
            localzs.s();
          }
        }
      }
    }
    f = paramzq.g() + paramzq.i() / 2.0F;
    i = zbyb.a((paramzq.i() - 4.0F) / 2.0F / arrayOfInt2.length);
    for (j = 0; j < arrayOfInt2.length; j++)
    {
      for (k = 0; k < i; k++)
      {
        localzs = new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt2[j], arrayOfInt2[j], arrayOfInt2[j]));
        try
        {
          paramzr.b(localzs, paramzq.f() + 2.0F, f, paramzq.l() - 3.0F, f);
          f += 1.0F;
          if (f >= paramzq.m() - 3.0F)
          {
            if (localzs == null) {
              break;
            }
            localzs.s();
            break;
          }
        }
        finally
        {
          if (localzs != null) {
            localzs.s();
          }
        }
      }
      if (f >= paramzq.m() - 3.0F) {
        break;
      }
    }
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(138, 138, 138)), paramzq.f(), paramzq.g() + 1.0F, paramzq.f() + 1.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(147, 147, 147)), paramzq.f() + 1.0F, paramzq.g(), paramzq.f() + 1.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(143, 143, 143)), paramzq.f() + 1.0F, paramzq.g() + 1.0F, paramzq.f() + 2.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(226, 226, 226)), paramzq.f() + 1.0F, paramzq.g() + 2.0F, paramzq.f() + 2.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(228, 228, 228)), paramzq.f() + 2.0F, paramzq.g() + 1.0F, paramzq.f() + 3.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.f() + 2.0F, paramzq.g() + 2.0F, paramzq.f() + 3.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(226, 226, 226)), paramzq.f() + 1.0F, paramzq.m() - 3.0F, paramzq.f() + 2.0F, paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.f() + 2.0F, paramzq.m() - 3.0F, paramzq.f() + 3.0F, paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(138, 138, 138)), paramzq.f(), paramzq.m() - 2.0F, paramzq.f() + 1.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(143, 143, 143)), paramzq.f() + 1.0F, paramzq.m() - 2.0F, paramzq.f() + 2.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(228, 228, 228)), paramzq.f() + 2.0F, paramzq.m() - 2.0F, paramzq.f() + 3.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(147, 147, 147)), paramzq.f() + 1.0F, paramzq.m() - 1.0F, paramzq.f() + 2.0F, paramzq.m() - 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(147, 147, 147)), paramzq.l() - 3.0F, paramzq.g(), paramzq.l() - 2.0F, paramzq.g());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(226, 226, 226)), paramzq.l() - 3.0F, paramzq.g() + 1.0F, paramzq.l() - 2.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(143, 143, 143)), paramzq.l() - 2.0F, paramzq.g() + 1.0F, paramzq.l() - 1.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(138, 138, 138)), paramzq.l() - 1.0F, paramzq.g() + 1.0F, paramzq.l() - 1.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.l() - 3.0F, paramzq.g() + 2.0F, paramzq.l() - 2.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(228, 228, 228)), paramzq.l() - 2.0F, paramzq.g() + 2.0F, paramzq.l() - 1.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.l() - 3.0F, paramzq.m() - 3.0F, paramzq.l() - 2.0F, paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(226, 226, 226)), paramzq.l() - 2.0F, paramzq.m() - 3.0F, paramzq.l() - 1.0F, paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(228, 228, 228)), paramzq.l() - 3.0F, paramzq.m() - 2.0F, paramzq.l() - 2.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(147, 147, 147)), paramzq.l() - 2.0F, paramzq.m() - 2.0F, paramzq.l() - 2.0F, paramzq.m() - 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(143, 143, 143)), paramzq.l() - 2.0F, paramzq.m() - 2.0F, paramzq.l() - 1.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(138, 138, 138)), paramzq.l() - 1.0F, paramzq.m() - 3.0F, paramzq.l() - 1.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(112, 112, 112)), paramzq.f() + 2.0F, paramzq.g(), paramzq.l() - 3.0F, paramzq.g());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(252, 252, 252)), paramzq.f() + 3.0F, paramzq.g() + 1.0F, paramzq.l() - 4.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt1[0], arrayOfInt1[0], arrayOfInt1[0])), paramzq.f() + 3.0F, paramzq.g() + 2.0F, paramzq.l() - 4.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(112, 112, 112)), paramzq.l() - 1.0F, paramzq.g() + 2.0F, paramzq.l() - 1.0F, paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.l() - 2.0F, paramzq.g() + 3.0F, paramzq.l() - 2.0F, paramzq.m() - 4.0F - (paramzq.i() - 4.0F) / 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(245, 245, 245)), paramzq.l() - 2.0F, paramzq.g() + 3.0F + (paramzq.i() - 4.0F) / 2.0F, paramzq.l() - 2.0F, paramzq.m() - 4.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(112, 112, 112)), paramzq.f(), paramzq.g() + 2.0F, paramzq.f(), paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.f() + 1.0F, paramzq.g() + 3.0F, paramzq.f() + 1.0F, paramzq.m() - 4.0F - (paramzq.i() - 4.0F) / 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(246, 246, 246)), paramzq.f() + 1.0F, paramzq.g() + 3.0F + (paramzq.i() - 4.0F) / 2.0F, paramzq.f() + 1.0F, paramzq.m() - 4.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(112, 112, 112)), paramzq.f() + 2.0F, paramzq.m() - 1.0F, paramzq.l() - 3.0F, paramzq.m() - 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(243, 243, 243)), paramzq.f() + 3.0F, paramzq.m() - 2.0F, paramzq.l() - 4.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt2[(arrayOfInt2.length - 1)], arrayOfInt2[(arrayOfInt2.length - 1)], arrayOfInt2[(arrayOfInt2.length - 1)])), paramzq.f() + 3.0F, paramzq.m() - 3.0F, paramzq.l() - 4.0F, paramzq.m() - 3.0F);
  }
  
  static zi a(zbni paramzbni, boolean paramBoolean)
  {
    zq localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
    float f1;
    float f2;
    if (paramzbni.x())
    {
      if (paramzbni.ad())
      {
        f1 = localzq.f() + localzq.h() / 2.0F;
        f2 = localzq.g() + localzq.i() / 2.0F;
        if ((paramBoolean) && ((paramzbni.k.J() instanceof GroupShape)))
        {
          f1 = localzq.f() + localzq.i() / 2.0F;
          f2 = localzq.g() + localzq.h() / 2.0F;
        }
      }
      else
      {
        f1 = localzq.f() + localzq.h() / 2.0F;
        f2 = localzq.g() + localzq.i() / 2.0F;
      }
    }
    else
    {
      f1 = localzq.f() + localzq.h() / 2.0F;
      f2 = localzq.g() + localzq.i() / 2.0F;
    }
    zi localzi = new zi(paramzbni.V() ? -1.0F : 1.0F, 0.0F, 0.0F, paramzbni.U() ? -1.0F : 1.0F, paramzbni.V() ? zbxz.a(f1) * 2.0F : 0.0F, paramzbni.U() ? zbxz.a(f2) * 2.0F : 0.0F);
    localzi.a((paramzbni.V() ^ paramzbni.U()) ? -paramzbni.w() : paramzbni.w(), new zo(zbxz.a(f1), zbxz.a(f2)));
    if ((paramzbni.x()) && (!paramzbni.i) && (!paramzbni.f) && (paramzbni.ad())) {
      localzi.b(zbxz.a(localzq.i() / 2.0F - localzq.h() / 2.0F), zbxz.a(localzq.h() / 2.0F - localzq.i() / 2.0F), 1);
    }
    return localzi;
  }
  
  static void m(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zq localzq1 = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
    if (!paramzbni.z().a())
    {
      localObject = zbyb.a(paramzbni.z(), localzq1);
      paramzr.b((com.aspose.cells.b.a.b.zc)localObject, localzq1);
    }
    Object localObject = ((OleObject)paramzbni.k).getImageData();
    if (localObject != null)
    {
      zh localzh = new zh((byte[])localObject);
      if ((localzh != null) && (localzh.h() != 0L))
      {
        zj localzj = zj.a(localzh);
        if ((localzj != null) && (localzq1.h() != 0.0F) && (localzq1.i() != 0.0F))
        {
          double d1 = paramzbni.k.getFormatPicture().getLeftCrop();
          double d2 = paramzbni.k.getFormatPicture().getRightCrop();
          double d3 = paramzbni.k.getFormatPicture().getTopCrop();
          double d4 = paramzbni.k.getFormatPicture().getBottomCrop();
          if (d1 + d2 + d3 + d4 != 0.0D)
          {
            float f1 = (float)(localzj.m().b() * d1);
            float f2 = (float)(localzj.m().c() * d3);
            float f3 = (float)(localzj.m().b() * (1.0D - d1 - d2));
            float f4 = (float)(localzj.m().c() * (1.0D - d3 - d4));
            float f5 = 0.5F;
            zq localzq2 = new zq(f1 - f5, f2 - f5, f3 + 2.0F * f5, f4 + 2.0F * f5);
            paramzr.a(localzj, localzq1, localzq2, 2);
          }
          else if ((localzj.m().b() != 0) && (localzj.m().c() != 0))
          {
            paramzr.a(localzj, paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
          }
        }
        if (localzj != null) {
          localzj.d();
        }
      }
      if (localzh != null) {
        localzh.a();
      }
    }
    if (!paramzbni.A().a())
    {
      int i = paramzbni.A().i();
      int j = paramzbni.A().l();
      paramzbni.A().e(0);
      paramzbni.A().h(0);
      com.aspose.cells.a.d.zs localzs = zbyb.a(paramzbni.A());
      localzq1.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
      paramzr.c(localzs, localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
      paramzbni.A().e(i);
      paramzbni.A().h(j);
    }
  }
  
  static zq a(zq paramzq)
  {
    double d1 = paramzq.h() / 2.0F;
    double d2 = paramzq.i() / 2.0F;
    double d3 = Math.atan(d2 / d1);
    double d4 = Math.sqrt(1.0D / (Math.cos(d3) * Math.cos(d3) / (d1 * d1) + Math.sin(d3) * Math.sin(d3) / (d2 * d2)));
    float f1 = (float)(d1 - d4 * Math.cos(d3));
    float f2 = (float)(d2 - d4 * Math.sin(d3));
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    localzq.a(-f1, -f2);
    return localzq;
  }
  
  private static void ci(zr paramzr, zbni paramzbni)
    throws Exception
  {
    if (!paramzbni.z().a())
    {
      com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
      localze.b(paramzbni.y());
      com.aspose.cells.b.a.b.zc localzc = zbyb.a(paramzbni.z(), localze);
      paramzr.b(localzc, paramzbni.y());
    }
    if (!paramzbni.A().a())
    {
      int i = paramzbni.A().i();
      int j = paramzbni.A().l();
      paramzbni.A().e(0);
      paramzbni.A().h(0);
      com.aspose.cells.a.d.zs localzs = zbyb.a(paramzbni.A());
      if (paramzbni.A().h() <= 1.0F) {
        paramzr.c(localzs, paramzbni.W().f(), paramzbni.W().g(), paramzbni.s(), paramzbni.t());
      } else {
        paramzr.c(localzs, paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
      }
      paramzbni.A().e(i);
      paramzbni.A().h(j);
    }
  }
  
  private static void b(zr paramzr, zq paramzq)
  {
    paramzr.b(new zu(Color.a(zk.f)), paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.getWhite()), paramzq.f() + 1.0F, paramzq.g() + 1.0F, paramzq.f() + 1.0F, paramzq.m() - 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.a(zk.g)), paramzq.f() + 1.0F, paramzq.m(), paramzq.l() - 2.0F, paramzq.m());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.a(zk.g)), paramzq.l() - 1.0F, paramzq.g() + 1.0F, paramzq.l() - 1.0F, paramzq.m() - 1.0F);
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(paramzq.l(), paramzq.g(), paramzq.l(), paramzq.m());
    localze.b(paramzq.l() - 1.0F, paramzq.m(), paramzq.l(), paramzq.m());
    localze.b(paramzq.l() - 1.0F, paramzq.m(), paramzq.l() - 1.0F, paramzq.m() + 1.0F);
    localze.b(paramzq.f(), paramzq.m() + 1.0F, paramzq.l() - 1.0F, paramzq.m() + 1.0F);
    paramzr.a(new com.aspose.cells.a.d.zs(Color.getBlack()), localze);
  }
  
  static void n(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbnu localzbnu = new zbnu(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbnu.b();
  }
  
  static void o(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbml localzbml = new zbml(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbml.b();
  }
  
  static void p(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbvv localzbvv = new zbvv(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbvv.b();
  }
  
  static void q(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbnk localzbnk = new zbnk(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbnk.b();
  }
  
  static void r(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbne localzbne = new zbne(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbne.b();
  }
  
  static void s(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbkv localzbkv = new zbkv(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbkv.b();
  }
  
  static void t(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbny localzbny = new zbny(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbny.b();
  }
  
  static void u(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbmz localzbmz = new zbmz(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbmz.b();
  }
  
  static void v(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbli localzbli = new zbli(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbli.b();
  }
  
  static void w(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbnw localzbnw = new zbnw(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbnw.b();
  }
  
  static void x(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhm localzbhm = new zbhm(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhm.b();
  }
  
  static void y(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbmp localzbmp = new zbmp(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbmp.b();
  }
  
  static void z(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbjb localzbjb = new zbjb(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbjb.b();
  }
  
  static void A(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zble localzble = new zble(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzble.b();
  }
  
  static void B(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbnn localzbnn = new zbnn(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbnn.b();
  }
  
  static void C(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbnl localzbnl = new zbnl(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbnl.b();
  }
  
  static void D(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbnm localzbnm = new zbnm(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbnm.b();
  }
  
  static void E(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbnc localzbnc = new zbnc(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbnc.b();
  }
  
  static void F(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbnb localzbnb = new zbnb(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbnb.b();
  }
  
  static void G(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbna localzbna = new zbna(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbna.b();
  }
  
  static void H(zr paramzr, zbni paramzbni)
  {
    zbfq localzbfq = new zbfq(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    ch(paramzr, paramzbni);
  }
  
  static void I(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbmn localzbmn = new zbmn(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbmn.b();
  }
  
  static void J(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbih localzbih = new zbih(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbih.b();
  }
  
  static void K(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbmu localzbmu = new zbmu(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbmu.b();
  }
  
  static void L(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbjj localzbjj = new zbjj(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbjj.b();
  }
  
  static void M(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zboe localzboe = new zboe(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzboe.b();
  }
  
  static void N(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhz localzbhz = new zbhz(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhz.b();
  }
  
  static void O(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbjq localzbjq = new zbjq(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbjq.b();
  }
  
  static void P(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zboh localzboh = new zboh(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzboh.b();
  }
  
  static void Q(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbgr localzbgr = new zbgr(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbgr.b();
  }
  
  static void R(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbgh localzbgh = new zbgh(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbgh.b();
  }
  
  static void S(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbim localzbim = new zbim(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbim.b();
  }
  
  static void T(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbgp localzbgp = new zbgp(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbgp.b();
  }
  
  static void U(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhk localzbhk = new zbhk(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhk.b();
  }
  
  static void V(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbiq localzbiq = new zbiq(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbiq.b();
  }
  
  static void W(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbln localzbln = new zbln(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbln.b();
  }
  
  static void X(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbfo localzbfo = new zbfo(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbfo.b();
  }
  
  static void Y(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbjf localzbjf = new zbjf(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbjf.b();
  }
  
  static void Z(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbit localzbit = new zbit(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbit.b();
  }
  
  static void aa(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbif localzbif = new zbif(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbif.b();
  }
  
  static void ab(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbfu localzbfu = new zbfu(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbfu.b();
  }
  
  static void ac(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbfw localzbfw = new zbfw(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbfw.b();
  }
  
  static void ad(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbfy localzbfy = new zbfy(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbfy.b();
  }
  
  static void ae(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbht localzbht = new zbht(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbht.b();
  }
  
  static void af(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhr localzbhr = new zbhr(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhr.b();
  }
  
  static void ag(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbkr localzbkr = new zbkr(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbkr.b();
  }
  
  static void ah(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbkp localzbkp = new zbkp(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbkp.b();
  }
  
  static void ai(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbkq localzbkq = new zbkq(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbkq.b();
  }
  
  static void aj(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbko localzbko = new zbko(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbko.b();
  }
  
  static void ak(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbkn localzbkn = new zbkn(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbkn.b();
  }
  
  static void al(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbjl localzbjl = new zbjl(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbjl.b();
  }
  
  static void am(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbmw localzbmw = new zbmw(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbmw.b();
  }
  
  static void an(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbiz localzbiz = new zbiz(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbiz.b();
  }
  
  static void ao(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhj localzbhj = new zbhj(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhj.b();
  }
  
  static void ap(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhn localzbhn = new zbhn(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhn.b();
  }
  
  static void aq(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbll localzbll = new zbll(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbll.b();
  }
  
  static void ar(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbgk localzbgk = new zbgk(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbgk.b();
  }
  
  static void as(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbns localzbns = new zbns(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbns.b();
  }
  
  static void at(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbiv localzbiv = new zbiv(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbiv.b();
  }
  
  static void au(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbjw localzbjw = new zbjw(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbjw.b();
  }
  
  static void av(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbgc localzbgc = new zbgc(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbgc.b();
  }
  
  static void aw(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhp localzbhp = new zbhp(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhp.b();
  }
  
  static void ax(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbge localzbge = new zbge(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbge.b();
  }
  
  static void ay(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbip localzbip = new zbip(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbip.b();
  }
  
  static void az(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zzd localzzd = new zzd(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzzd.b();
  }
  
  static void aA(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zza localzza = new zza(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzza.b();
  }
  
  static void aB(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zym localzym = new zym(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzym.b();
  }
  
  static void aC(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zzn localzzn = new zzn(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzzn.b();
  }
  
  static void aD(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zyq localzyq = new zyq(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzyq.b();
  }
  
  static void aE(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zys localzys = new zys(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzys.b();
  }
  
  static void aF(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zyx localzyx = new zyx(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzyx.b();
  }
  
  static void aG(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zxv localzxv = new zxv(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzxv.b();
  }
  
  static void aH(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zzf localzzf = new zzf(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzzf.b();
  }
  
  static void aI(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbin localzbin = new zbin(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbin.b();
  }
  
  static void aJ(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zxx localzxx = new zxx(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzxx.b();
  }
  
  static void aK(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zzj localzzj = new zzj(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzzj.b();
  }
  
  static void aL(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zyu localzyu = new zyu(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzyu.b();
  }
  
  static void aM(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zzl localzzl = new zzl(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzzl.b();
  }
  
  static void aN(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zyd localzyd = new zyd(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzyd.b();
  }
  
  static void aO(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zzh localzzh = new zzh(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzzh.b();
  }
  
  static void aP(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zyo localzyo = new zyo(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzyo.b();
  }
  
  static void aQ(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zyf localzyf = new zyf(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzyf.b();
  }
  
  static void aR(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zyh localzyh = new zyh(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzyh.b();
  }
  
  static void aS(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbil localzbil = new zbil(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbil.b();
  }
  
  static void aT(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbij localzbij = new zbij(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbij.b();
  }
  
  static void aU(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbmj localzbmj = new zbmj(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbmj.b();
  }
  
  static void aV(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbgn localzbgn = new zbgn(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbgn.b();
  }
  
  static void aW(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbnr localzbnr = new zbnr(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbnr.b();
  }
  
  static void aX(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbjs localzbjs = new zbjs(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbjs.b();
  }
  
  static void aY(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbfs localzbfs = new zbfs(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbfs.b();
  }
  
  static void aZ(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zboa localzboa = new zboa(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzboa.b();
  }
  
  static void ba(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbju localzbju = new zbju(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbju.b();
  }
  
  static void bb(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbga localzbga = new zbga(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbga.b();
  }
  
  static void bc(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhf localzbhf = new zbhf(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhf.b();
  }
  
  static void bd(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zblc localzblc = new zblc(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzblc.b();
  }
  
  static void be(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zblk localzblk = new zblk(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzblk.b();
  }
  
  static void bf(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbgj localzbgj = new zbgj(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbgj.b();
  }
  
  static void bg(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbms localzbms = new zbms(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbms.b();
  }
  
  static void bh(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhx localzbhx = new zbhx(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhx.b();
  }
  
  static void bi(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbkx localzbkx = new zbkx(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbkx.b();
  }
  
  static void bj(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zblx localzblx = new zblx(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzblx.b();
  }
  
  static void bk(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zblz localzblz = new zblz(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzblz.b();
  }
  
  static void bl(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbma localzbma = new zbma(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbma.b();
  }
  
  static void bm(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbmb localzbmb = new zbmb(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbmb.b();
  }
  
  static void bn(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbmd localzbmd = new zbmd(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbmd.b();
  }
  
  static void bo(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zblo localzblo = new zblo(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzblo.b();
  }
  
  static void bp(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zblp localzblp = new zblp(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzblp.b();
  }
  
  static void bq(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zblr localzblr = new zblr(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzblr.b();
  }
  
  static void br(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zblt localzblt = new zblt(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzblt.b();
  }
  
  static void bs(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zblv localzblv = new zblv(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzblv.b();
  }
  
  static void bt(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbng localzbng = new zbng(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbng.b();
  }
  
  static void bu(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zyj localzyj = new zyj(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzyj.b();
  }
  
  static void bv(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zyw localzyw = new zyw(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzyw.b();
  }
  
  static void bw(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zya localzya = new zya(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzya.b();
  }
  
  static void bx(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbkz localzbkz = new zbkz(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbkz.b();
  }
  
  static void by(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbla localzbla = new zbla(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbla.b();
  }
  
  static void bz(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbjh localzbjh = new zbjh(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbjh.b();
  }
  
  static void bA(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zboc localzboc = new zboc(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzboc.b();
  }
  
  static void bB(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbjo localzbjo = new zbjo(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbjo.b();
  }
  
  static void bC(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbmh localzbmh = new zbmh(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbmh.b();
  }
  
  static void bD(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbnp localzbnp = new zbnp(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbnp.b();
  }
  
  static void bE(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zann localzann = new zann(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzann.b();
  }
  
  static void bF(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zank localzank = new zank(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzank.b();
  }
  
  static void bG(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zano localzano = new zano(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzano.b();
  }
  
  static void bH(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zanl localzanl = new zanl(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzanl.b();
  }
  
  static void bI(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zanp localzanp = new zanp(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzanp.b();
  }
  
  static void bJ(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zanm localzanm = new zanm(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzanm.b();
  }
  
  static void bK(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zz localzz = new zz(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzz.b();
  }
  
  static void bL(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zac localzac = new zac(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzac.b();
  }
  
  static void bM(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zaa localzaa = new zaa(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzaa.b();
  }
  
  static void bN(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zad localzad = new zad(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzad.b();
  }
  
  static void bO(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zab localzab = new zab(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzab.b();
  }
  
  static void bP(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zae localzae = new zae(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzae.b();
  }
  
  static void bQ(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zkz localzkz = new zkz(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzkz.b();
  }
  
  static void bR(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbol localzbol = new zbol(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbol.b();
  }
  
  static void bS(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbjd localzbjd = new zbjd(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbjd.b();
  }
  
  static void bT(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zboj localzboj = new zboj(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzboj.b();
  }
  
  static void bU(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbib localzbib = new zbib(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbib.b();
  }
  
  static void bV(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbon localzbon = new zbon(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbon.b();
  }
  
  static void bW(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhv localzbhv = new zbhv(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhv.b();
  }
  
  static void bX(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbgy localzbgy = new zbgy(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbgy.b();
  }
  
  static void bY(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbgt localzbgt = new zbgt(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbgt.b();
  }
  
  static void bZ(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhh localzbhh = new zbhh(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhh.b();
  }
  
  static void ca(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbha localzbha = new zbha(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbha.b();
  }
  
  static void cb(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbhd localzbhd = new zbhd(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbhd.b();
  }
  
  static void cc(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbis localzbis = new zbis(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbis.b();
  }
  
  static void cd(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zamt localzamt = new zamt(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzamt.b();
  }
  
  static void ce(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbdi localzbdi = new zbdi(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbdi.b();
  }
  
  static void cf(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zkw localzkw = new zkw(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzkw.b();
  }
  
  static void cg(zr paramzr, zbni paramzbni)
    throws Exception
  {
    zbgw localzbgw = new zbgw(paramzr, paramzbni.u(), paramzbni.v(), paramzbni);
    localzbgw.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbiy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */