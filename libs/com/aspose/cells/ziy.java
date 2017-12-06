package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.c.zc;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ziy
{
  public static int a = 10;
  public static int b = 8;
  public static int c = 5;
  public static int d = 16;
  
  static void a(zje paramzje)
    throws Exception
  {
    zr localzr = paramzje.ar();
    zbfe localzbfe = paramzje.z();
    if ((paramzje.z().getCount() == 0) || (a(paramzje.z().i()) == 0)) {
      return;
    }
    String str = c(paramzje);
    if (!"".equals(str))
    {
      localObject1 = localzbfe.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zbfc)((Iterator)localObject1).next();
        ((zbfc)localObject2).a(false);
      }
    }
    Object localObject1 = new zbfe(paramzje);
    Object localObject2 = new zbfe(paramzje);
    Object localObject3 = localzbfe.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localzbfc = (zbfc)((Iterator)localObject3).next();
      if (localzbfc.af() == 1) {
        ((zbfe)localObject1).a(localzbfc);
      } else {
        ((zbfe)localObject2).a(localzbfc);
      }
    }
    localObject3 = ((zbfe)localObject1).c(0);
    zbfc localzbfc = new zbfc(paramzje, null, 14);
    if (((zbfe)localObject2).getCount() > 0) {
      localzbfc = (zbfc)((zbfe)localObject2).a(0);
    }
    a(paramzje, (zbfe)localObject1, (zbfe)localObject2);
    boolean bool1 = a(((zbfc)localObject3).ag());
    boolean bool2 = a(localzbfc.ag());
    boolean bool3 = b((zbfe)localObject1);
    boolean bool4 = b((zbfe)localObject2);
    if (a(paramzje.g(), bool3, bool4))
    {
      if (bool1 == bool2)
      {
        a(localzbfe, paramzje.e());
        paramzje.g().p = paramzje.e().p;
        paramzje.g().a(paramzje.e().f());
        paramzje.g().q = true;
        paramzje.e().q = true;
      }
      else
      {
        a((zbfe)localObject1, paramzje.e());
        a((zbfe)localObject2, paramzje.g());
      }
    }
    else
    {
      a((zbfe)localObject1, paramzje.e());
      a((zbfe)localObject2, paramzje.g());
    }
    if (paramzje.A().a().getCount() > 0) {
      paramzje.z().a = true;
    }
    if (paramzje.A().b().getCount() > 0) {
      paramzje.z().b = true;
    }
    paramzje.z().a(a(paramzje.z().a()));
    paramzje.z().b(a(paramzje.z().b()));
    paramzje.z().a(b(paramzje.z().a()));
    paramzje.z().b(b(paramzje.z().b()));
    if (paramzje.g().q)
    {
      a(paramzje.h(), paramzje.f());
      n(paramzje);
    }
    e(paramzje);
    zbxx.a(paramzje.e(), paramzje.z().c(), (zbfe)localObject1);
    zbxx.a(paramzje.g(), paramzje.z().d(), (zbfe)localObject2);
    zbxx.a(paramzje.e(), paramzje.E(), (zbfe)localObject1, (zbfc)localObject3);
    zbxx.a(paramzje.g(), paramzje.G(), (zbfe)localObject2, localzbfc);
    b(paramzje, bool1, bool2);
    boolean bool5 = zana.a(paramzje);
    paramzje.x().b = bool5;
    d(paramzje);
    int i = 10 + (paramzje.b() - 200) / 200;
    com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(a, i, paramzje.a() - a * 2, paramzje.b() - a - i);
    paramzje.f = new com.aspose.cells.b.a.b.zp(0, 0, paramzje.a() - i / 2, paramzje.b() - i / 2);
    if (paramzje.K().j())
    {
      localObject4 = new zt(localzp.e() * 0.8F, localzp.f() * 0.5F);
      com.aspose.cells.b.a.b.zs localzs1 = zbwz.a(localzr, paramzje.K(), (zt)localObject4);
      paramzje.K().e().b.a((paramzje.a() - localzs1.b()) / 2);
      paramzje.K().e().b.b(i);
      paramzje.K().e().b.a(localzs1);
      int m = 15 + (paramzje.b() - 200) / 40;
      localzp.b(localzp.d() + localzs1.c() + m);
      localzp.d(localzp.f() - (localzs1.c() + m));
      paramzje.f.b(paramzje.f.d() + localzs1.c() + a);
      paramzje.f.d(paramzje.f.f() - (localzs1.c() + a));
    }
    Object localObject5;
    if (paramzje.v()) {
      if ((((zbfe)localObject2).getCount() == 0) && ((((zbfc)localObject3).ag() == 44) || (((zbfc)localObject3).ag() == 35) || (bool5)))
      {
        localObject4 = localObject3;
        if ((((zbfc)localObject3).m() == 35) || (((zbfc)localObject3).m() == 36)) {
          for (int j = 1; j < paramzje.z().getCount(); j++) {
            if ((paramzje.z().a(j).k() != null) && (((zbfc)localObject4).D() != null) && (paramzje.z().a(j).k().getCount() > ((zbfc)localObject4).D().getCount())) {
              localObject4 = paramzje.z().c(j);
            }
          }
        }
        if (((((zbfc)localObject3).ag() == 35) && (!((zbfc)localObject3).H()) && (((zbfe)localObject1).getCount() > 1)) || (h(paramzje)))
        {
          g(paramzje);
          localObject5 = new com.aspose.cells.b.a.b.zp[] { localzp };
          zana.a(localzr, paramzje.x(), (com.aspose.cells.b.a.b.zp[])localObject5);
          localzp = localObject5[0];
        }
        else
        {
          a(paramzje, (zbfc)localObject4);
          localObject5 = new com.aspose.cells.b.a.b.zp[] { localzp };
          zana.a(localzr, paramzje.x(), (zbfc)localObject4, (com.aspose.cells.b.a.b.zp[])localObject5);
          localzp = localObject5[0];
        }
      }
      else
      {
        g(paramzje);
        localObject4 = new com.aspose.cells.b.a.b.zp[] { localzp };
        zana.a(localzr, paramzje.x(), (com.aspose.cells.b.a.b.zp[])localObject4);
        localzp = localObject4[0];
      }
    }
    com.aspose.cells.b.a.b.zp[] arrayOfzp1;
    if (paramzje.e().K().j())
    {
      b(paramzje.e(), bool1);
      localObject4 = new zt();
      if (bool1) {
        localObject4 = new zt(localzp.e() * 0.2F, localzp.f() * 0.9F);
      } else {
        localObject4 = new zt(localzp.e() * 0.9F, localzp.f() * 0.2F);
      }
      localObject5 = zbwz.a(localzr, paramzje.e().K(), (zt)localObject4);
      if ((paramzje.E().m() == 1) && (!paramzje.E().p())) {
        paramzje.e().n = false;
      } else if ((paramzje.E().m() != 1) && (paramzje.E().p())) {
        paramzje.e().n = false;
      }
      arrayOfzp1 = new com.aspose.cells.b.a.b.zp[] { localzp };
      a(paramzje.e(), arrayOfzp1, bool1, (com.aspose.cells.b.a.b.zs)localObject5);
      localzp = arrayOfzp1[0];
    }
    if (paramzje.E().K().j())
    {
      b(paramzje.E(), bool1);
      localObject4 = new zt();
      if (!bool1) {
        localObject4 = new zt(localzp.e() * 0.2F, localzp.f() * 0.9F);
      } else {
        localObject4 = new zt(localzp.e() * 0.9F, localzp.f() * 0.2F);
      }
      localObject5 = zbwz.a(localzr, paramzje.E().K(), (zt)localObject4);
      if ((paramzje.e().m() == 1) && (!paramzje.e().p())) {
        paramzje.E().n = false;
      } else if ((paramzje.e().m() != 1) && (paramzje.e().p())) {
        paramzje.E().n = false;
      }
      arrayOfzp1 = new com.aspose.cells.b.a.b.zp[] { localzp };
      a(paramzje.E(), arrayOfzp1, bool1, (com.aspose.cells.b.a.b.zs)localObject5);
      localzp = arrayOfzp1[0];
    }
    if ((paramzje.g().K().j()) && (((zbfe)localObject2).getCount() > 0))
    {
      b(paramzje.g(), bool2);
      localObject4 = new zt();
      if (bool2) {
        localObject4 = new zt(localzp.e() * 0.2F, localzp.f() * 0.9F);
      } else {
        localObject4 = new zt(localzp.e() * 0.9F, localzp.f() * 0.2F);
      }
      localObject5 = zbwz.a(localzr, paramzje.g().K(), (zt)localObject4);
      if (bool1 == bool2) {
        paramzje.g().n = (!paramzje.e().n);
      } else {
        paramzje.g().n = (!paramzje.E().n);
      }
      arrayOfzp1 = new com.aspose.cells.b.a.b.zp[] { localzp };
      a(paramzje.g(), arrayOfzp1, bool2, (com.aspose.cells.b.a.b.zs)localObject5);
      localzp = arrayOfzp1[0];
    }
    if ((paramzje.G().K().j()) && (((zbfe)localObject2).getCount() > 0))
    {
      b(paramzje.G(), bool2);
      localObject4 = new zt();
      if (!bool2) {
        localObject4 = new zt(localzp.e() * 0.2F, localzp.f() * 0.9F);
      } else {
        localObject4 = new zt(localzp.e() * 0.9F, localzp.f() * 0.2F);
      }
      localObject5 = zbwz.a(localzr, paramzje.G().K(), (zt)localObject4);
      if (bool1 == bool2) {
        paramzje.G().n = (!paramzje.E().n);
      } else {
        paramzje.G().n = (!paramzje.e().n);
      }
      arrayOfzp1 = new com.aspose.cells.b.a.b.zp[] { localzp };
      a(paramzje.G(), arrayOfzp1, bool2, (com.aspose.cells.b.a.b.zs)localObject5);
      localzp = arrayOfzp1[0];
    }
    if (!paramzje.B().s())
    {
      paramzje.a(true, paramzje.B().p().c(), paramzje.B().p().d(), paramzje.B().p().e(), paramzje.B().p().f());
      paramzje.e = paramzje.B().p();
      if (paramzje.B().p().d() < 0)
      {
        paramzje.B().b(paramzje.B().m() + paramzje.B().p().d());
        paramzje.B().d(0);
      }
      if (paramzje.B().p().c() < 0)
      {
        paramzje.B().a(paramzje.B().l() + paramzje.B().p().c());
        paramzje.B().c(0);
      }
      if (paramzje.B().l() + paramzje.B().n() > 4000) {
        paramzje.B().a(4000 - paramzje.B().n());
      }
      if (paramzje.B().m() + paramzje.B().o() > 4000) {
        paramzje.B().b(4000 - paramzje.B().o());
      }
      localzp.a(paramzje.B().w());
      localzp.b(paramzje.B().x());
      localzp.c(paramzje.B().u());
      localzp.d(paramzje.B().v());
      localzp.a(localzp.c() + c);
      localzp.b(localzp.d() + c);
      if (a(paramzje, localzp)) {
        localzp.d(localzp.f() - c);
      }
      if (localzp.i() + c > paramzje.a()) {
        localzp.c(paramzje.a() - c - localzp.c());
      }
      if (localzp.j() + c > paramzje.b()) {
        localzp.d(paramzje.b() - c - localzp.d());
      }
      if (paramzje.e().K().j()) {
        a(paramzje.e(), localzp, bool1);
      }
      if ((paramzje.g().K().j()) && (((zbfe)localObject2).getCount() > 0)) {
        a(paramzje.g(), localzp, bool2);
      }
      if (paramzje.E().K().j()) {
        a(paramzje.E(), localzp, bool1);
      }
      if ((paramzje.G().K().j()) && (((zbfe)localObject2).getCount() > 0)) {
        a(paramzje.G(), localzp, bool2);
      }
    }
    else
    {
      paramzje.a(false, localzp.c() - c, localzp.d() - c, zbxz.c(localzp.e()), zbxz.c(localzp.f()));
    }
    Object localObject4 = new com.aspose.cells.b.a.b.zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
    paramzje.B().b = new com.aspose.cells.b.a.b.zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
    int k = 0;
    int n = (a(paramzje.e())) || (f(paramzje.M())) ? 1 : 0;
    if (paramzje.u())
    {
      f(paramzje);
      if ((!bool1) && (!bool2) && (paramzje.f().k() != 2) && (paramzje.h().k() != 2))
      {
        paramzje.e().m = 0;
        paramzje.f().f(2);
        paramzje.f().h(2);
        paramzje.g().m = 0;
        paramzje.h().f(2);
        paramzje.h().h(2);
        k = 1;
      }
      com.aspose.cells.b.a.b.zs localzs2 = zjr.a(localzr, paramzje.k(), localzp);
      paramzje.k().a(localzs2);
      i2 = zjr.b(localzr, paramzje.k(), localzp);
      paramzje.k().a(i2);
      int i3 = localzs2.c() + i2;
      if (paramzje.B().s())
      {
        localzp.a(localzp.c() + localzs2.b());
        localzp.c(localzp.e() - localzs2.b());
        localzp.d(localzp.f() - i3);
        if (n != 0)
        {
          paramzje.k().a.a(localzp.c());
          paramzje.k().a.b(localzp.j());
          paramzje.k().a.c(localzp.e());
          localzp.d(localzp.f() - b);
        }
      }
      else if (paramzje.S())
      {
        paramzje.a -= localzs2.b();
        paramzje.c += localzs2.b();
        paramzje.d += i3 - 2;
        if (n != 0) {
          paramzje.k().a.b(localzp.j() + d);
        }
      }
      else
      {
        localzp.a(localzp.c() + localzs2.b());
        localzp.c(localzp.e() - localzs2.b());
        localzp.d(localzp.f() - (i3 - 2));
        if (n != 0)
        {
          paramzje.k().a.a(localzp.c());
          paramzje.k().a.b(localzp.j());
          paramzje.k().a.c(localzp.e());
          localzp.d(localzp.f() - d);
        }
      }
    }
    int i1 = a(((zbfe)localObject1).i());
    int i2 = a(((zbfe)localObject2).i());
    double d1 = 0.0D;
    double d2 = 0.0D;
    boolean bool6 = false;
    Object localObject6;
    double[] arrayOfDouble1;
    if (a(paramzje, ((zbfe)localObject1).i(), ((zbfe)localObject2).i()))
    {
      localObject6 = j(paramzje);
      arrayOfDouble1 = new double[] { d1 };
      double[] arrayOfDouble2 = { d2 };
      bool6 = a(((zbfe)localObject1).i(), ((zbfe)localObject2).i(), arrayOfDouble1, arrayOfDouble2, (zbs)localObject6);
      d1 = arrayOfDouble1[0];
      d2 = arrayOfDouble2[0];
      paramzje.i = d1;
      paramzje.j = d2;
      paramzje.g = true;
      paramzje.h = ((zbs)localObject6);
    }
    else
    {
      localObject6 = new double[] { d1 };
      arrayOfDouble1 = new double[] { d2 };
      bool6 = a(((zbfe)localObject1).i(), (double[])localObject6, arrayOfDouble1, paramzje.E());
      d1 = localObject6[0];
      d2 = arrayOfDouble1[0];
      if ((bool1) && (paramzje.g().r))
      {
        d4 = 0.0D;
        double d5 = 0.0D;
        bool9 = false;
        double[] arrayOfDouble3 = { d4 };
        double[] arrayOfDouble4 = { d5 };
        bool9 = b(((zbfe)localObject2).i(), arrayOfDouble3, arrayOfDouble4, paramzje.g());
        d4 = arrayOfDouble3[0];
        d5 = arrayOfDouble4[0];
        if (d4 < d1) {
          d1 = d4;
        }
        if (d5 > d2) {
          d2 = d5;
        }
        if ((bool6) && (!bool9)) {
          bool6 = false;
        }
        paramzje.g().s = true;
      }
    }
    double d3 = d2;
    double d4 = d1;
    boolean bool7 = paramzje.E().O();
    boolean bool8 = paramzje.E().P();
    boolean bool9 = paramzje.E().N();
    boolean bool10 = paramzje.E().M();
    if (paramzje.g)
    {
      if (paramzje.h == paramzje.E()) {
        a(localzr, paramzje.E(), d2, d1, bool6, paramzje.E().l, ((zbfc)localObject3).ag(), localzp, bool1, ((zbfe)localObject1).c(0));
      } else {
        a(localzr, paramzje.G(), d2, d1, bool6, paramzje.G().l, localzbfc.ag(), localzp, bool2, ((zbfe)localObject2).c(0));
      }
      if ((((zbfc)localObject3).au()) && (localzbfc.au()))
      {
        double d6 = 0.0D;
        double d7 = 0.0D;
        localObject7 = new double[] { d6 };
        localObject8 = new double[] { d7 };
        boolean bool15 = a(((zbfe)localObject1).i(), (double[])localObject7, (double[])localObject8, paramzje.E());
        d6 = localObject7[0];
        d7 = localObject8[0];
        a(localzr, paramzje.E(), d7, d6, bool15, paramzje.E().l, ((zbfc)localObject3).ag(), localzp, bool1, ((zbfe)localObject1).c(0));
        localObject7[0] = d6;
        localObject8[0] = d7;
        bool15 = a(((zbfe)localObject2).i(), (double[])localObject7, (double[])localObject8, paramzje.G());
        d6 = localObject7[0];
        d7 = localObject8[0];
        a(localzr, paramzje.G(), d7, d6, bool15, paramzje.G().l, localzbfc.ag(), localzp, bool2, ((zbfe)localObject2).c(0));
        d(paramzje.E());
        d(paramzje.G());
      }
      zbs localzbs = k(paramzje);
      a(localzbs, paramzje.h);
    }
    else if ((((zbfc)localObject3).ag() != 44) && (((zbfc)localObject3).ag() != 35))
    {
      a(localzr, paramzje.E(), d2, d1, bool6, paramzje.E().l, ((zbfc)localObject3).ag(), localzp, bool1, ((zbfe)localObject1).c(0));
    }
    boolean bool11 = paramzje.e().O();
    boolean bool12 = paramzje.e().P();
    boolean bool13 = paramzje.e().N();
    boolean bool14 = paramzje.e().M();
    Object localObject7 = new zbfe(paramzje);
    if (paramzje.e().q) {
      a(localzr, paramzje.e(), paramzje.e().l, localzp, ((zbfc)localObject3).ag(), localzbfe, bool1);
    } else {
      a(localzr, paramzje.e(), paramzje.e().l, localzp, ((zbfc)localObject3).ag(), (zbfe)localObject1, bool1);
    }
    Object localObject8 = com.aspose.cells.b.a.b.zs.a();
    Object localObject9;
    com.aspose.cells.b.a.b.zs localzs4;
    if ((!zbxz.a(localzp)) && (paramzje.E().q()) && (!((zbfc)localObject3).au()))
    {
      a(paramzje.E(), paramzje.e(), (zbfe)localObject1, paramzje);
      com.aspose.cells.b.a.b.zs localzs3 = zbu.a(localzr, paramzje.E(), (zbfc)localObject3, bool1);
      localObject8 = localzs3;
      c(paramzje.E(), bool1);
      localObject9 = new zt();
      if (!bool1) {
        localObject9 = new zt(localzp.e() * 0.2F, localzp.f() * 0.9F);
      } else {
        localObject9 = new zt(localzp.e() * 0.9F, localzp.f() * 0.2F);
      }
      localzs4 = zbwz.a(paramzje, paramzje.E().Q(), (zt)localObject9, (com.aspose.cells.b.a.b.zp)localObject4);
      com.aspose.cells.b.a.b.zp[] arrayOfzp3 = { localzp };
      a(paramzje, localzr, paramzje.E(), localzs3, localzs4, arrayOfzp3, bool1);
      localzp = arrayOfzp3[0];
    }
    Object localObject10;
    Object localObject11;
    if ((!zbxz.a(localzp)) && (k == 0) && (paramzje.e().q()) && (!((zbfc)localObject3).au()))
    {
      a(paramzje.e(), paramzje.E(), (zbfe)localObject1, paramzje);
      int i4 = 0;
      if ((localzp.f() <= 15) || (localzp.f() <= paramzje.e().G().a().d())) {
        i4 = 1;
      }
      localObject9 = new com.aspose.cells.b.a.b.zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
      if (i4 != 0) {
        ((com.aspose.cells.b.a.b.zp)localObject9).d(((com.aspose.cells.b.a.b.zp)localObject9).f() + 2 * paramzje.e().G().a().d());
      }
      localzs4 = zbu.a(localzr, paramzje.e(), (com.aspose.cells.b.a.b.zp)localObject9, i1, bool1, (zbfc)localObject3);
      int i9 = (int)(paramzje.e().F().k() + paramzje.e().X() + paramzje.e().Y() + 0.5D);
      if (paramzje.z().e() != null) {
        i9 += i9 * paramzje.z().e().length;
      }
      if ((((zbfc)localObject3).ag() == 60) || (((zbfc)localObject3).ag() == 12))
      {
        c(paramzje.e(), bool1);
        localObject10 = new zt();
        if (bool1) {
          localObject10 = new zt(localzp.e() * 0.2F, localzp.f() * 0.9F);
        } else {
          localObject10 = new zt(localzp.e() * 0.9F, localzp.f() * 0.2F);
        }
        localObject11 = zbwz.a(paramzje, paramzje.e().Q(), (zt)localObject10, (com.aspose.cells.b.a.b.zp)localObject4);
        i9 += ((com.aspose.cells.b.a.b.zs)localObject11).c();
      }
      if (i4 == 0)
      {
        localObject10 = new com.aspose.cells.b.a.b.zp[] { localzp };
        a(paramzje, localzr, paramzje.e(), localzs4, i9, (com.aspose.cells.b.a.b.zp[])localObject10, bool1);
        localzp = localObject10[0];
      }
    }
    int i12;
    if (((zbfe)localObject2).getCount() > 0)
    {
      double d8 = 0.0D;
      double d9 = 0.0D;
      if (paramzje.g)
      {
        d8 = paramzje.i;
        d9 = paramzje.j;
      }
      else
      {
        localObject10 = new double[] { d8 };
        localObject11 = new double[] { d9 };
        boolean bool16 = a(((zbfe)localObject2).i(), (double[])localObject10, (double[])localObject11, paramzje.G());
        d8 = localObject10[0];
        d9 = localObject11[0];
        a(localzr, paramzje.G(), d9, d8, bool16, paramzje.G().l, localzbfc.ag(), localzp, bool2, ((zbfe)localObject2).c(0));
      }
      if (paramzje.e().q)
      {
        paramzje.g().l = paramzje.e().l;
        paramzje.g().d(paramzje.e().z());
        paramzje.g().f(paramzje.e().D());
        paramzje.g().c(paramzje.e().x());
        paramzje.g().e(paramzje.e().B());
        paramzje.g().d(paramzje.e().k());
        if (paramzje.e().k() == 2)
        {
          paramzje.g().c(paramzje.e().j());
          paramzje.g().g(paramzje.e().y());
          paramzje.g().i(paramzje.e().C());
        }
      }
      else if (paramzje.g().s)
      {
        paramzje.g().l = paramzje.E().l;
        paramzje.g().d(paramzje.E().z());
        paramzje.g().f(paramzje.E().D());
        paramzje.g().c(paramzje.E().x());
        paramzje.g().e(paramzje.E().B());
      }
      else
      {
        a(localzr, paramzje.g(), paramzje.g().l, localzp, localzbfc.ag(), (zbfe)localObject2, bool2);
      }
      Object localObject12;
      Object localObject13;
      if ((!zbxz.a(localzp)) && (paramzje.G().q()) && (!localzbfc.au()))
      {
        a(paramzje.G(), paramzje.g(), (zbfe)localObject2, paramzje);
        localObject10 = zbu.a(localzr, paramzje.G(), localzbfc, bool2);
        c(paramzje.G(), bool2);
        localObject11 = new zt();
        if (!bool2) {
          localObject11 = new zt(localzp.e() * 0.2F, localzp.f() * 0.9F);
        } else {
          localObject11 = new zt(localzp.e() * 0.9F, localzp.f() * 0.2F);
        }
        localObject12 = zbwz.a(paramzje, paramzje.G().Q(), (zt)localObject11, (com.aspose.cells.b.a.b.zp)localObject4);
        if (bool1 == bool2)
        {
          if ((paramzje.G().m != 3) && (paramzje.G().m == paramzje.E().m)) {
            paramzje.G().m = 0;
          }
        }
        else if ((paramzje.G().m != 3) && (paramzje.G().m == paramzje.e().m)) {
          paramzje.G().m = 0;
        }
        localObject13 = new com.aspose.cells.b.a.b.zp[] { localzp };
        a(paramzje, localzr, paramzje.G(), (com.aspose.cells.b.a.b.zs)localObject10, (com.aspose.cells.b.a.b.zs)localObject12, (com.aspose.cells.b.a.b.zp[])localObject13, bool2);
        localzp = localObject13[0];
      }
      if ((!zbxz.a(localzp)) && (k == 0) && (paramzje.g().q()) && (!localzbfc.au()))
      {
        a(paramzje.g(), paramzje.G(), (zbfe)localObject2, paramzje);
        localObject10 = zbu.a(localzr, paramzje.g(), localzp, i2, bool2, localzbfc);
        i12 = (int)(paramzje.g().F().k() + paramzje.g().X() + paramzje.g().Y() + 0.5D);
        if ((localzbfc.ag() == 60) || (localzbfc.ag() == 12))
        {
          c(paramzje.e(), bool2);
          localObject12 = new zt();
          if (bool2) {
            localObject12 = new zt(localzp.e() * 0.2F, localzp.f() * 0.9F);
          } else {
            localObject12 = new zt(localzp.e() * 0.9F, localzp.f() * 0.2F);
          }
          localObject13 = zbwz.a(paramzje, paramzje.e().Q(), (zt)localObject12, (com.aspose.cells.b.a.b.zp)localObject4);
          i12 += ((com.aspose.cells.b.a.b.zs)localObject13).c();
        }
        if (bool1 == bool2)
        {
          if ((paramzje.g().m != 3) && (paramzje.g().m == paramzje.e().m)) {
            paramzje.g().m = 0;
          }
        }
        else if ((paramzje.g().m != 3) && (paramzje.g().m == paramzje.E().m)) {
          paramzje.g().m = 0;
        }
        localObject12 = new com.aspose.cells.b.a.b.zp[] { localzp };
        a(paramzje, localzr, paramzje.g(), (com.aspose.cells.b.a.b.zs)localObject10, i12, (com.aspose.cells.b.a.b.zp[])localObject12, bool2);
        localzp = localObject12[0];
      }
    }
    int i5 = 0;
    if ((paramzje.B().s()) || (!paramzje.S())) {
      i5 = 1;
    }
    float f3;
    int i11;
    if ((!zbxz.a(localzp)) && (paramzje.E().q()) && (paramzje.E().E() != 3) && (!((zbfc)localObject3).au()))
    {
      int i6 = 0;
      if ((localzp.f() <= 15) || (localzp.f() <= paramzje.E().G().a().d())) {
        i6 = 1;
      }
      if (i6 == 0)
      {
        zbu.b(localzr, paramzje.E(), (zbfc)localObject3, bool1);
        f3 = paramzje.E().j;
        float f4 = paramzje.E().k;
        if (!bool1)
        {
          if (i5 != 0)
          {
            if (localzp.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d() < f4)
            {
              i11 = (int)(f4 - (localzp.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d()));
              localzp.b(localzp.d() + i11);
              localzp.d(localzp.f() - i11);
            }
            if (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp.j() < f3)
            {
              i11 = (int)(f3 - (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp.j()));
              localzp.d(localzp.f() - i11);
            }
          }
          else
          {
            if (localzp.d() - paramzje.b < f4)
            {
              i11 = (int)(f4 - (localzp.d() - paramzje.b));
              paramzje.b -= i11;
              paramzje.d += i11;
            }
            if (paramzje.b + paramzje.d - localzp.j() < f3)
            {
              i11 = (int)(f3 - (paramzje.b + paramzje.d - localzp.j()));
              paramzje.d += i11;
            }
          }
        }
        else if (i5 != 0)
        {
          if (localzp.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c() < f3)
          {
            i11 = (int)(f3 - (localzp.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c()));
            localzp.a(localzp.c() + i11);
            localzp.c(localzp.e() - i11);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp.i() < f4)
          {
            i11 = (int)(f4 - (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp.i()));
            localzp.c(localzp.e() - i11);
          }
        }
        else
        {
          if (localzp.c() - paramzje.a < f3)
          {
            i11 = (int)(f3 - (localzp.c() - paramzje.a));
            paramzje.a -= i11;
            paramzje.c += i11;
          }
          if (paramzje.a + paramzje.c - localzp.i() < f4)
          {
            i11 = (int)(f4 - (paramzje.a + paramzje.c - localzp.i()));
            paramzje.c += i11;
          }
        }
      }
    }
    float f1;
    int i10;
    if ((!zbxz.a(localzp)) && (paramzje.e().q()) && (paramzje.e().E() != 3) && (!((zbfc)localObject3).au()) && ((paramzje.e().j > 0.0F) || (paramzje.e().k > 0.0F)))
    {
      f1 = paramzje.e().j;
      f3 = paramzje.e().k;
      if (bool1)
      {
        if (i5 != 0)
        {
          if (localzp.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d() < f3)
          {
            i10 = (int)(f3 - (localzp.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d()));
            localzp.b(localzp.d() + i10);
            localzp.d(localzp.f() - i10);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp.j() < f1)
          {
            i10 = (int)(f1 - (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp.j()));
            localzp.d(localzp.f() - i10);
          }
        }
        else
        {
          if (localzp.d() - paramzje.b < f3)
          {
            i10 = (int)(f3 - (localzp.d() - paramzje.b));
            paramzje.b -= i10;
            paramzje.d += i10;
          }
          if (paramzje.b + paramzje.d - localzp.j() < f1)
          {
            i10 = (int)(f1 - (paramzje.b + paramzje.d - localzp.j()));
            paramzje.d += i10;
          }
        }
      }
      else if (i5 != 0)
      {
        if (localzp.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c() < f1)
        {
          i10 = (int)(f1 - (localzp.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c()));
          localzp.a(localzp.c() + i10);
          localzp.c(localzp.e() - i10);
        }
        if (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp.i() < f3)
        {
          i10 = (int)(f3 - (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp.i()));
          localzp.c(localzp.e() - i10);
        }
      }
      else
      {
        if (localzp.c() - paramzje.a < f1)
        {
          i10 = (int)(f1 - (localzp.c() - paramzje.a));
          paramzje.a -= i10;
          paramzje.c += i10;
        }
        if (paramzje.a + paramzje.c - localzp.i() < f3)
        {
          i10 = (int)(f3 - (paramzje.a + paramzje.c - localzp.i()));
          paramzje.c += i10;
        }
      }
    }
    int i8;
    if (((zbfe)localObject2).getCount() > 0)
    {
      if ((!zbxz.a(localzp)) && (paramzje.G().q()) && (paramzje.G().E() != 3) && (!localzbfc.au())) {
        if (!bool2)
        {
          f1 = paramzje.G().g / 2.0F;
          if (localzp.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d() < f1)
          {
            i8 = (int)(f1 - (localzp.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d()));
            localzp.b(localzp.d() + i8);
            localzp.d(localzp.f() - i8);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp.j() < f1)
          {
            i8 = (int)(f1 - (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp.j()));
            localzp.d(localzp.f() - i8);
          }
        }
        else
        {
          f1 = paramzje.G().f / 2.0F;
          if (localzp.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c() < f1)
          {
            i8 = (int)(f1 - (localzp.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c()));
            localzp.a(localzp.c() + i8);
            localzp.c(localzp.e() - i8);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp.i() < f1)
          {
            i8 = (int)(f1 - (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp.i()));
            localzp.c(localzp.e() - i8);
          }
        }
      }
      if ((!zbxz.a(localzp)) && (paramzje.g().q()) && (paramzje.g().E() != 3) && (!localzbfc.au()) && ((paramzje.g().j > 0.0F) || (paramzje.g().k > 0.0F))) {
        if (bool2)
        {
          f1 = paramzje.g().g / 2.0F;
          if (localzp.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d() < f1)
          {
            i8 = (int)(f1 - (localzp.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d()));
            localzp.b(localzp.d() + i8);
            localzp.d(localzp.f() - i8);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp.j() < f1)
          {
            i8 = (int)(f1 - (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp.j()));
            localzp.d(localzp.f() - i8);
          }
        }
        else
        {
          f1 = paramzje.g().f / 2.0F;
          if (localzp.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c() < f1)
          {
            i8 = (int)(f1 - (localzp.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c()));
            localzp.a(localzp.c() + i8);
            localzp.c(localzp.e() - i8);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp.i() < f1)
          {
            i8 = (int)(f1 - (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp.i()));
            localzp.c(localzp.e() - i8);
          }
        }
      }
    }
    paramzje.a(new zq(localzp.c(), localzp.d(), localzp.e(), localzp.f()));
    if (!zbxz.a(localzp))
    {
      com.aspose.cells.b.a.b.zp[] arrayOfzp2 = { localzp };
      a(localzr, paramzje, (zbfc)localObject3, localzbfc, arrayOfzp2);
      localzp = arrayOfzp2[0];
      if ((paramzje.C().s()) && ((paramzje.ak()) || (paramzje.al()) || (paramzje.am()))) {
        paramzje.a(false, localzp.c() - c, localzp.d() - c, zbxz.c(localzp.e()), zbxz.c(localzp.f()));
      }
    }
    zana.a(paramzje.x(), localzp);
    int i7;
    if ((!zbxz.a(localzp)) && (paramzje.E().q()) && (!((zbfc)localObject3).au()))
    {
      i7 = paramzje.E().l.size();
      i8 = a(localzr, paramzje.E(), bool1, (zbfc)localObject3, localzp);
      i10 = 0;
      if (bool1) {
        i10 = localzp.e();
      } else {
        i10 = localzp.f();
      }
      i11 = 0;
      if ((localzp.f() <= 15) || (localzp.f() <= paramzje.E().G().a().d())) {
        i11 = 1;
      }
      i12 = 3;
      if (i11 != 0) {
        i12 = 2;
      }
      if ((bool7) && (paramzje.E().l.size() > i12) && (i8 > i10) && (i10 != 0))
      {
        double d12 = paramzje.F().z();
        paramzje.E().l.clear();
        paramzje.E().i(bool7);
        paramzje.E().j(bool8);
        paramzje.E().h(bool9);
        paramzje.E().g(bool10);
        a(localzr, paramzje.E(), d2, d1, bool6, paramzje.E().l, ((zbfc)localObject3).ag(), localzp, bool1, ((zbfe)localObject1).c(0));
        if (paramzje.E().l.size() != i7)
        {
          com.aspose.cells.b.a.b.zs localzs5 = zbu.a(localzr, paramzje.E(), (zbfc)localObject3, bool1);
          com.aspose.cells.b.a.b.zs localzs6 = new com.aspose.cells.b.a.b.zs(localzs5.b() - ((com.aspose.cells.b.a.b.zs)localObject8).b(), localzs5.c() - ((com.aspose.cells.b.a.b.zs)localObject8).c());
          com.aspose.cells.b.a.b.zp[] arrayOfzp4 = { localzp };
          a(paramzje, localzr, paramzje.E(), localzs6, arrayOfzp4, bool1);
          localzp = arrayOfzp4[0];
        }
      }
    }
    paramzje.B().b = new com.aspose.cells.b.a.b.zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
    if (paramzje.e().K().j()) {
      d(paramzje.e(), bool1);
    }
    if (paramzje.E().K().j()) {
      d(paramzje.E(), bool1);
    }
    if ((paramzje.g().K().j()) && (((zbfe)localObject2).getCount() > 0)) {
      d(paramzje.g(), bool2);
    }
    if ((paramzje.G().K().j()) && (((zbfe)localObject2).getCount() > 0)) {
      d(paramzje.G(), bool2);
    }
    if ((paramzje.B().s()) && (paramzje.e().q()) && (((zbfc)localObject3).ag() == 60))
    {
      i7 = a(localzr, paramzje.e(), true, (zbfc)localObject3, localzp);
      i8 = 0;
      if (bool1) {
        i8 = localzp.e();
      } else {
        i8 = localzp.f();
      }
      if ((bool11) && (paramzje.e().l.size() > 3) && (i7 > i8) && (i8 != 0))
      {
        paramzje.e().l.clear();
        paramzje.e().i(bool11);
        paramzje.e().j(bool12);
        paramzje.e().h(bool13);
        paramzje.e().g(bool14);
        a(localzr, paramzje.e(), paramzje.e().l, localzp, ((zbfc)localObject3).ag(), (zbfe)localObject1, bool1);
      }
    }
    if ((!zbxz.a(localzp)) && (bool1) && (bool7) && (!paramzje.E().n())) {
      a(paramzje.E(), d3, d4, paramzje.M(), localzp.e(), bool1, localzbfe.c(0), bool9, bool10, bool7);
    }
    if ((!zbxz.a(localzp)) && (d(paramzje.M()))) {
      zev.a(localzr, localzbfe, localzp, localzbfe.h(), bool11, bool12, bool13, bool14, bool7, bool8, bool9, bool10);
    }
    paramzje.B().z();
    localzp = paramzje.B().a;
    float f2 = a(paramzje.E(), localzp.c(), localzp.e(), bool1);
    double d10 = paramzje.E().l();
    float f5 = a(paramzje.G(), localzp.c(), localzp.e(), bool2);
    double d11 = paramzje.G().l();
    float f6 = a(paramzje.E(), localzp.d(), localzp.f(), bool1);
    float f7 = a(paramzje.G(), localzp.d(), localzp.f(), bool2);
    float f8 = a(paramzje.e(), localzp.d(), localzp.f(), bool1, (zbfe)localObject1);
    float f9 = a(paramzje.g(), localzp.d(), localzp.f(), bool2, (zbfe)localObject2);
    float f10 = 0.0F;
    float f11 = 0.0F;
    if ((((zbfc)localObject3).ag() == 12) || (((zbfc)localObject3).ag() == 60)) {
      f10 = a(paramzje.e(), localzp.c(), localzp.e(), !bool1);
    } else {
      f10 = a(paramzje.e(), localzp.c(), localzp.e(), bool1, (zbfe)localObject1);
    }
    if ((localzbfc.ag() == 12) || (localzbfc.ag() == 60)) {
      f11 = a(paramzje.g(), localzp.c(), localzp.e(), !bool2);
    } else {
      f11 = a(paramzje.g(), localzp.c(), localzp.e(), bool2, (zbfe)localObject2);
    }
    com.aspose.cells.b.a.b.zo localzo1;
    com.aspose.cells.b.a.b.zo localzo2;
    if (bool1)
    {
      localzo1 = new com.aspose.cells.b.a.b.zo(f2, localzp.d());
      localzo2 = new com.aspose.cells.b.a.b.zo(f2, localzp.j());
      if (paramzje.e().p())
      {
        paramzje.e().a(localzo1);
        paramzje.e().b(localzo2);
      }
      else
      {
        paramzje.e().a(localzo2);
        paramzje.e().b(localzo1);
      }
    }
    else
    {
      localzo1 = new com.aspose.cells.b.a.b.zo(localzp.c(), f6);
      localzo2 = new com.aspose.cells.b.a.b.zo(localzp.i(), f6);
      if (!paramzje.e().p())
      {
        paramzje.e().a(localzo1);
        paramzje.e().b(localzo2);
      }
      else
      {
        paramzje.e().a(localzo2);
        paramzje.e().b(localzo1);
      }
    }
    if (bool2)
    {
      localzo1 = new com.aspose.cells.b.a.b.zo(f2, localzp.d());
      localzo2 = new com.aspose.cells.b.a.b.zo(f2, localzp.j());
      if (paramzje.g().p())
      {
        paramzje.g().a(localzo1);
        paramzje.g().b(localzo2);
      }
      else
      {
        paramzje.g().a(localzo2);
        paramzje.g().b(localzo1);
      }
    }
    else
    {
      localzo1 = new com.aspose.cells.b.a.b.zo(localzp.c(), f6);
      localzo2 = new com.aspose.cells.b.a.b.zo(localzp.i(), f6);
      if (!paramzje.g().p())
      {
        paramzje.g().a(localzo1);
        paramzje.g().b(localzo2);
      }
      else
      {
        paramzje.g().a(localzo2);
        paramzje.g().b(localzo1);
      }
    }
    if (bool1)
    {
      localzo1 = new com.aspose.cells.b.a.b.zo(localzp.c(), f8);
      localzo2 = new com.aspose.cells.b.a.b.zo(localzp.i(), f8);
      if (!paramzje.E().p())
      {
        paramzje.E().a(localzo1);
        paramzje.E().b(localzo2);
      }
      else
      {
        paramzje.E().a(localzo2);
        paramzje.E().b(localzo1);
      }
    }
    else
    {
      localzo1 = new com.aspose.cells.b.a.b.zo(f10, localzp.d());
      localzo2 = new com.aspose.cells.b.a.b.zo(f10, localzp.j());
      if (paramzje.E().p())
      {
        paramzje.E().a(localzo1);
        paramzje.E().b(localzo2);
      }
      else
      {
        paramzje.E().a(localzo2);
        paramzje.E().b(localzo1);
      }
    }
    if (bool2)
    {
      localzo1 = new com.aspose.cells.b.a.b.zo(localzp.c(), f8);
      localzo2 = new com.aspose.cells.b.a.b.zo(localzp.i(), f8);
      if (!paramzje.G().p())
      {
        paramzje.G().a(localzo1);
        paramzje.G().b(localzo2);
      }
      else
      {
        paramzje.G().a(localzo2);
        paramzje.G().b(localzo1);
      }
    }
    else
    {
      localzo1 = new com.aspose.cells.b.a.b.zo(f10, localzp.d());
      localzo2 = new com.aspose.cells.b.a.b.zo(f10, localzp.j());
      if (paramzje.G().p())
      {
        paramzje.G().a(localzo1);
        paramzje.G().b(localzo2);
      }
      else
      {
        paramzje.G().a(localzo2);
        paramzje.G().b(localzo1);
      }
    }
    i(paramzje);
    if (((zbfe)localObject2).getCount() > 0) {
      a(paramzje, bool1, bool2);
    }
    paramzje.k = true;
  }
  
  static void b(zje paramzje)
    throws Exception
  {
    if (!paramzje.k) {
      a(paramzje);
    }
    zbxj.a(paramzje);
    zr localzr = paramzje.ar();
    zbfe localzbfe1 = paramzje.z();
    if ((paramzje.z().getCount() == 0) || (a(paramzje.z().i()) == 0)) {
      return;
    }
    zbfe localzbfe2 = new zbfe(paramzje);
    zbfe localzbfe3 = new zbfe(paramzje);
    Object localObject1 = localzbfe1.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localzbfc1 = (zbfc)((Iterator)localObject1).next();
      if (localzbfc1.af() == 1) {
        localzbfe2.a(localzbfc1);
      } else {
        localzbfe3.a(localzbfc1);
      }
    }
    localObject1 = localzbfe2.c(0);
    zbfc localzbfc1 = new zbfc(paramzje, null, 14);
    if (localzbfe3.getCount() > 0) {
      localzbfc1 = (zbfc)localzbfe3.a(0);
    }
    boolean bool1 = a(((zbfc)localObject1).ag());
    boolean bool2 = a(localzbfc1.ag());
    int i = a(localzbfe2.i());
    int j = a(localzbfe3.i());
    boolean bool3 = paramzje.B().D();
    if ((((zbfc)localObject1).m() == 44) || (((zbfc)localObject1).m() == 47)) {
      paramzje.B().z();
    } else {
      zjz.a(localzr, paramzje.B());
    }
    com.aspose.cells.b.a.b.zp localzp = paramzje.B().a;
    float f1 = a(paramzje.E(), localzp.c(), localzp.e(), bool1);
    double d1 = paramzje.E().l();
    float f2 = a(paramzje.G(), localzp.c(), localzp.e(), bool2);
    double d2 = paramzje.G().l();
    float f3 = a(paramzje.E(), localzp.d(), localzp.f(), bool1);
    float f4 = a(paramzje.G(), localzp.d(), localzp.f(), bool2);
    float f5 = a(paramzje.e(), localzp.d(), localzp.f(), bool1, localzbfe2);
    float f6 = a(paramzje.g(), localzp.d(), localzp.f(), bool2, localzbfe3);
    float f7 = 0.0F;
    float f8 = 0.0F;
    if ((((zbfc)localObject1).ag() == 12) || (((zbfc)localObject1).ag() == 60)) {
      f7 = a(paramzje.e(), localzp.c(), localzp.e(), !bool1);
    } else {
      f7 = a(paramzje.e(), localzp.c(), localzp.e(), bool1, localzbfe2);
    }
    if ((localzbfc1.ag() == 12) || (localzbfc1.ag() == 60)) {
      f8 = a(paramzje.g(), localzp.c(), localzp.e(), !bool2);
    } else {
      f8 = a(paramzje.g(), localzp.c(), localzp.e(), bool2, localzbfe3);
    }
    if (((zbfc)localObject1).au())
    {
      zbu.a(localzr, paramzje.E(), localzp, i);
    }
    else
    {
      zbu.a(localzr, paramzje.e(), localzp, bool1, (zbfc)localObject1);
      zbu.a(localzr, paramzje.E(), localzp, bool1, (zbfc)localObject1);
    }
    if (localzbfc1.au())
    {
      zbu.a(localzr, paramzje.G(), localzp, j);
    }
    else
    {
      zbu.a(localzr, paramzje.g(), localzp, bool2, localzbfc1);
      zbu.a(localzr, paramzje.G(), localzp, bool2, localzbfc1);
    }
    for (int k = 0; k < localzbfe1.getCount(); k++)
    {
      zqx localzqx = localzbfe1.c(k).w();
      localzqx.a().e(paramzje.B().a.e());
      localzqx.a().f(paramzje.B().a.f());
      Object localObject2;
      for (int m = 0; m < localzbfe1.a(k).k().getCount(); m++)
      {
        localObject2 = localzbfe1.c(k).D().b(m).o();
        ((zqx)localObject2).a().e(paramzje.B().a.e());
        ((zqx)localObject2).a().f(paramzje.B().a.f());
      }
      for (m = 0; m < localzbfe1.c(k).F().getCount(); m++)
      {
        localObject2 = localzbfe1.c(k).F().c(m);
        ((zbxf)localObject2).q().a().e(paramzje.B().a.e());
        ((zbxf)localObject2).q().a().f(paramzje.B().a.f());
      }
    }
    k = 0;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    double d3 = 0.0D;
    ArrayList localArrayList1 = localzbfe1.k();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    ArrayList localArrayList5 = new ArrayList();
    int n = 0;
    int i1 = 0;
    zbfc localzbfc2;
    for (int i2 = 0; (i2 < localArrayList1.size()) && (!bool3); i2++)
    {
      localzbfc2 = (zbfc)localArrayList1.get(i2);
      if (localzbfc2.af() == 1)
      {
        k = i;
        f9 = f1;
        d3 = d1;
        f10 = f3;
        f11 = f5;
        f12 = f7;
      }
      else
      {
        k = j;
        f9 = f2;
        d3 = d2;
        f10 = f4;
        f11 = f6;
        f12 = f8;
      }
      if (paramzje.g) {
        if (paramzje.E() == paramzje.h)
        {
          f9 = f1;
          d3 = d1;
          f10 = f3;
          f11 = f5;
          f12 = f7;
        }
        else
        {
          f9 = f2;
          d3 = d2;
          f10 = f4;
          f11 = f6;
          f12 = f8;
        }
      }
      ArrayList localArrayList6;
      if (localzbfc2.b(new int[] { 14 }))
      {
        localArrayList6 = zlq.a(localzr, localzbfc2, localzp, f10, d3, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 15 }))
      {
        localArrayList6 = zlq.a(localzr, localzbfc2, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 16 }))
      {
        localArrayList6 = zlq.b(localzr, localzbfc2, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 37, 40 }))
      {
        localArrayList6 = zlq.b(localzr, localzbfc2, localzp, f10, d3, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 38, 41 }))
      {
        localArrayList6 = zlq.a(localzr, localzbfc2, localzp, f10, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 39, 42 }))
      {
        localArrayList6 = zlq.b(localzr, localzbfc2, localzp, f10, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 6 }))
      {
        localArrayList6 = zcj.a(localzr, paramzje, localzbfc2, localzp, f9, d3, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList4, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 7 }))
      {
        localArrayList6 = zcj.a(localzr, paramzje, localzbfc2, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList4, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 8 }))
      {
        localArrayList6 = zcj.b(localzr, paramzje, localzbfc2, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList4, localArrayList6);
      }
      else if (localzbfc2.c(new int[] { 60 }))
      {
        localArrayList6 = zbzt.a(localzr, localzbfc2, localzp, f10, d3, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 0 }))
      {
        localArrayList6 = zba.a(localzr, paramzje, localzbfc2, localzp, f10, d3, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 1 }))
      {
        localArrayList6 = zba.a(localzr, paramzje, localzbfc2, localzp, f10, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 2 }))
      {
        localArrayList6 = zba.b(localzr, paramzje, localzbfc2, localzp, f10, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      }
      else if ((localzbfc2.c(new int[] { 44 })) && (n == 0))
      {
        zawj.a(localzr, localzp, localzbfc2);
        n = 1;
      }
      else if ((localzbfc2.c(new int[] { 35 })) && (i1 == 0))
      {
        zawj.a(localzr, localzp, localzbfc2);
        i1 = 1;
      }
      else if (localzbfc2.au())
      {
        localArrayList6 = zayk.a(localzr, localzbfc2, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList5, localArrayList6);
      }
      else if (localzbfc2.b(new int[] { 12, 13 }))
      {
        localArrayList6 = zev.a(localzr, localzbfc2, localzp, f10, d3, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      }
    }
    for (i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      localzbfc2 = (zbfc)localArrayList1.get(i2);
      zbxx.a(localzr, localzbfc2.x(), localzbfc2.ag(), localzp);
      zbxx.a(localzr, localzbfc2.y(), localzbfc2.ag(), localzp);
    }
    for (i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      localzbfc2 = (zbfc)localArrayList1.get(i2);
      if (localzbfc2.af() == 1)
      {
        k = i;
        f9 = f1;
        d3 = d1;
        f10 = f3;
        f11 = f5;
        f12 = f7;
      }
      else
      {
        k = j;
        f9 = f2;
        d3 = d2;
        f10 = f4;
        f11 = f6;
        f12 = f8;
      }
      if (localzbfc2.F().getCount() > 0) {
        if ((localzbfc2.ag() == 6) || (localzbfc2.ag() == 7) || (localzbfc2.ag() == 8)) {
          zbxj.b(localzr, localzbfc2, localzp, f9, d3);
        } else {
          zbxj.a(localzr, localzbfc2, localzp, f10, d3);
        }
      }
    }
    zlq.a(localzr, paramzje, localArrayList2);
    zlq.b(localzr, paramzje, localArrayList3);
    zcj.a(localzr, paramzje, localzp, localArrayList4);
    zayk.a(localzr, paramzje, localArrayList5);
    if (paramzje.K().j()) {
      zbwz.a(paramzje, paramzje.K());
    }
    com.aspose.cells.b.a.b.a.zf localzf = null;
    int i3 = 0;
    if ((paramzje.i().d().g()) && (paramzje.ar().i() != 4))
    {
      localzf = paramzje.ar().d();
      i3 = 1;
      paramzje.ar().b(4, false);
    }
    if (((zbfc)localObject1).au()) {
      zbu.a(localzr, localzbfe2, paramzje.e(), localzp);
    } else if (paramzje.e().q()) {
      if (bool1) {
        zbu.a(localzr, paramzje.e(), paramzje.E().p(), f1, localzp, i);
      } else if ((((zbfc)localObject1).aw()) && (!paramzje.e().p)) {
        zbu.c(localzr, paramzje.e(), paramzje.E().p(), f3, localzp, (zbfc)localObject1);
      } else {
        zbu.a(localzr, paramzje.e(), paramzje.E().p(), f3, localzp, i, bool1);
      }
    }
    if (localzbfc1.au()) {
      zbu.a(localzr, localzbfe3, paramzje.g(), localzp);
    } else if (paramzje.g().q()) {
      if (bool2) {
        zbu.a(localzr, paramzje.g(), paramzje.G().p(), f2, localzp, j);
      } else if (localzbfc1.aw()) {
        zbu.c(localzr, paramzje.g(), paramzje.G().p(), f4, localzp, localzbfc1);
      } else {
        zbu.a(localzr, paramzje.g(), paramzje.G().p(), f4, localzp, j, bool2);
      }
    }
    if (paramzje.E().q()) {
      if (bool1) {
        zbu.b(localzr, paramzje.E(), paramzje.e().p(), f5, localzp, (zbfc)localObject1);
      } else if (((zbfc)localObject1).au()) {
        zbu.b(localzr, localzbfe2, paramzje.E(), localzp);
      } else {
        zbu.a(localzr, paramzje.E(), paramzje.e().p(), f7, localzp, (zbfc)localObject1);
      }
    }
    if (paramzje.G().q()) {
      if (bool2) {
        zbu.b(localzr, paramzje.G(), paramzje.g().p(), f6, localzp, localzbfc1);
      } else if (localzbfc1.au()) {
        zbu.b(localzr, localzbfe3, paramzje.G(), localzp);
      } else {
        zbu.a(localzr, paramzje.G(), paramzje.g().p(), f8, localzp, localzbfc1);
      }
    }
    if ((paramzje.i().d().g()) && (i3 != 0)) {
      paramzje.ar().a(localzf);
    }
    Object localObject3;
    for (int i4 = 0; i4 < localArrayList1.size(); i4++)
    {
      localObject3 = (zbfc)localArrayList1.get(i4);
      zbxj.a(localzr, (zbfc)localObject3);
    }
    if (paramzje.e().K().j())
    {
      paramzje.e().K().e().f(paramzje.B().a.f());
      paramzje.e().K().e().e(paramzje.B().a.e());
      zbwz.a(paramzje, paramzje.e().K());
    }
    if (paramzje.E().K().j())
    {
      paramzje.E().K().e().f(paramzje.B().a.f());
      paramzje.E().K().e().e(paramzje.B().a.e());
      zbwz.a(paramzje, paramzje.E().K());
    }
    if ((paramzje.g().K().j()) && (localzbfe3.getCount() > 0))
    {
      paramzje.g().K().e().f(paramzje.B().a.f());
      paramzje.g().K().e().e(paramzje.B().a.e());
      zbwz.a(paramzje, paramzje.g().K());
    }
    if ((paramzje.G().K().j()) && (localzbfe3.getCount() > 0))
    {
      paramzje.G().K().e().f(paramzje.B().a.f());
      paramzje.G().K().e().e(paramzje.B().a.e());
      zbwz.a(paramzje, paramzje.G().K());
    }
    if (paramzje.u())
    {
      localzf = null;
      i3 = 0;
      if ((paramzje.i().d().g()) && (paramzje.ar().i() != 4))
      {
        localzf = paramzje.ar().d();
        i3 = 1;
        paramzje.ar().b(4, false);
      }
      i4 = (a(paramzje.e())) || (f(paramzje.M())) ? 1 : 0;
      if (i4 != 0)
      {
        paramzje.k().a.a(paramzje.B().a.c());
        paramzje.k().a.c(paramzje.B().a.e());
      }
      else
      {
        paramzje.k().a.a(paramzje.B().a.c());
        paramzje.k().a.b(paramzje.B().a.j());
        paramzje.k().a.c(paramzje.B().a.e());
      }
      zjr.a(localzr, paramzje.k(), bool1);
      if ((paramzje.i().d().g()) && (i3 != 0)) {
        paramzje.ar().a(localzf);
      }
    }
    boolean bool4 = paramzje.x().b;
    if (paramzje.v())
    {
      localzf = null;
      i3 = 0;
      if ((paramzje.i().d().g()) && (paramzje.x().d().d().g()) && (paramzje.ar().i() != 4))
      {
        localzf = paramzje.ar().d();
        i3 = 1;
        paramzje.ar().b(4, false);
      }
      if ((localzbfe3.getCount() == 0) && ((((zbfc)localObject1).ag() == 44) || (((zbfc)localObject1).ag() == 35) || (bool4)))
      {
        localObject3 = localObject1;
        if ((((zbfc)localObject1).m() == 35) || (((zbfc)localObject1).m() == 36)) {
          for (int i5 = 1; i5 < paramzje.z().getCount(); i5++) {
            if ((paramzje.z().a(i5).k() != null) && (((zbfc)localObject3).D() != null) && (paramzje.z().a(i5).k().getCount() > ((zbfc)localObject3).D().getCount())) {
              localObject3 = paramzje.z().c(i5);
            }
          }
        }
        if (((((zbfc)localObject1).ag() == 35) && (!((zbfc)localObject1).H()) && (localzbfe2.getCount() > 1)) || (h(paramzje))) {
          zana.a(localzr, paramzje.x(), bool1, (zbfc)localObject1);
        } else {
          zana.a(localzr, paramzje.x(), (zbfc)localObject3);
        }
      }
      else
      {
        zana.a(localzr, paramzje.x(), bool1, (zbfc)localObject1);
      }
      if ((paramzje.i().d().g()) && (paramzje.x().d().d().g()) && (i3 != 0)) {
        paramzje.ar().a(localzf);
      }
    }
  }
  
  private static void a(zje paramzje, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    if (paramzje.g().q())
    {
      i = paramzje.g().a();
      if ((paramzje.e().q()) && (paramBoolean1 == paramBoolean2) && (paramzje.e().a() == i) && (paramzje.E().m() != 2) && (paramzje.G().m() != 2)) {
        paramzje.g().d(false);
      } else if ((paramzje.E().q()) && (paramBoolean1 != paramBoolean2) && (paramzje.E().a() == i)) {
        paramzje.g().d(false);
      }
    }
    if (paramzje.G().q())
    {
      i = paramzje.G().a();
      if ((paramzje.E().q()) && (paramBoolean1 == paramBoolean2) && (paramzje.E().a() == i) && (paramzje.e().m() != 2) && (paramzje.g().m() != 2)) {
        paramzje.G().d(false);
      } else if ((paramzje.e().q()) && (paramBoolean1 != paramBoolean2) && (paramzje.e().a() == i)) {
        paramzje.G().d(false);
      }
    }
  }
  
  private static boolean a(zje paramzje, com.aspose.cells.b.a.b.zp paramzp)
  {
    zamu localzamu = paramzje.x();
    if ((paramzje.M() == 44) || (paramzje.M() == 49) || (paramzje.M() == 46)) {
      return false;
    }
    if ((paramzje.M() == 35) || (paramzje.M() == 36) || (paramzje.M() == 47)) {
      return false;
    }
    if (!paramzje.v()) {
      return false;
    }
    if (localzamu.d().s()) {
      return false;
    }
    if (localzamu.e() != 3) {
      return false;
    }
    if (localzamu.d().b.h() >= paramzp.j() + localzamu.k()) {
      return false;
    }
    if (localzamu.d().b.j() < paramzp.j() + localzamu.k()) {
      return false;
    }
    if (localzamu.d().b.g() > paramzp.g() + paramzp.e() / 2) {
      return false;
    }
    return localzamu.d().b.i() >= paramzp.g() + paramzp.e() / 2;
  }
  
  private static boolean h(zje paramzje)
  {
    int i = 0;
    int j = 0;
    for (int k = 1; k < paramzje.z().getCount(); k++)
    {
      if (paramzje.z().c(k).c(new int[] { 44 })) {
        i = 1;
      }
      if (paramzje.z().c(k).c(new int[] { 35 })) {
        j = 1;
      }
    }
    return (i != 0) && (j != 0);
  }
  
  static String c(zje paramzje)
  {
    zbfe localzbfe1 = paramzje.z();
    zbfe localzbfe2 = new zbfe(paramzje);
    zbfe localzbfe3 = new zbfe(paramzje);
    Object localObject = localzbfe1.iterator();
    while (((Iterator)localObject).hasNext())
    {
      zbfc localzbfc = (zbfc)((Iterator)localObject).next();
      if (localzbfc.af() == 1) {
        localzbfe2.a(localzbfc);
      } else {
        localzbfe3.a(localzbfc);
      }
    }
    if (localzbfe2.getCount() == 0) {
      return "Plot series are all on secondary axis. Must set one or more of Plot series on primary axis!";
    }
    a(localzbfe1);
    localObject = new zbfc(paramzje, null, 14);
    if (localzbfe3.getCount() > 0)
    {
      localObject = localzbfe3.c(0);
    }
    else
    {
      paramzje.g().d(false);
      paramzje.g().K().a("");
      paramzje.G().d(false);
      paramzje.G().K().a("");
    }
    return "";
  }
  
  private static void a(zbfe paramzbfe)
  {
    Iterator localIterator = paramzbfe.iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      localzbfc.n(localzbfc.m());
      switch (localzbfc.m())
      {
      case 0: 
      case 14: 
      case 37: 
      case 40: 
        localzbfc.n(14);
        break;
      case 6: 
        localzbfc.n(6);
        break;
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 49: 
        localzbfc.n(44);
        break;
      case 35: 
      case 36: 
      case 48: 
        localzbfc.n(35);
        break;
      case 1: 
      case 15: 
      case 38: 
      case 41: 
        localzbfc.n(15);
        break;
      case 2: 
      case 16: 
      case 39: 
      case 42: 
        localzbfc.n(16);
        break;
      case 7: 
        localzbfc.n(7);
        break;
      case 8: 
        localzbfc.n(8);
        break;
      case 60: 
      case 61: 
      case 62: 
      case 63: 
      case 64: 
        localzbfc.n(60);
        break;
      case 57: 
      case 58: 
        localzbfc.n(57);
        break;
      case 59: 
        localzbfc.n(59);
        break;
      case 12: 
      case 13: 
        localzbfc.n(12);
        break;
      case 19: 
        localzbfc.n(19);
        break;
      case 10: 
        localzbfc.n(10);
        break;
      case 20: 
        localzbfc.n(20);
        break;
      case 11: 
        localzbfc.n(11);
      }
    }
  }
  
  private static void a(zje paramzje, zbfe paramzbfe1, zbfe paramzbfe2)
  {
    zbfe localzbfe = paramzje.z();
    Iterator localIterator = localzbfe.iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if ((localzbfc.ag() != 60) && (localzbfc.ag() != 12)) {
        localzbfc.y().a(2);
      }
      switch (localzbfc.ag())
      {
      case 35: 
      case 44: 
        if (localzbfc.I()) {
          localzbfc.c(true);
        }
        paramzje.c(false);
        if (localzbfc.af() == 1)
        {
          paramzje.e().d(false);
          paramzje.e().K().a("");
          paramzje.E().d(false);
          paramzje.E().K().a("");
          paramzje.e().s().a(0);
          paramzje.e().u().a(0);
          paramzje.E().s().a(0);
          paramzje.E().u().a(0);
        }
        else
        {
          paramzje.g().d(false);
          paramzje.g().K().a("");
          paramzje.G().d(false);
          paramzje.G().K().a("");
          paramzje.g().s().a(0);
          paramzje.g().u().a(0);
          paramzje.G().s().a(0);
          paramzje.G().u().a(0);
        }
        break;
      case 57: 
      case 59: 
        paramzje.c(false);
        if (localzbfc.af() == 1)
        {
          paramzje.e().d(1);
          paramzje.e().K().a("");
          paramzje.E().K().a("");
          paramzje.e().s().a(0);
          paramzje.e().u().a(0);
        }
        else
        {
          paramzje.g().d(1);
          paramzje.g().K().a("");
          paramzje.G().K().a("");
          paramzje.g().s().a(0);
          paramzje.g().u().a(0);
        }
        break;
      case 12: 
        if (localzbfc.af() == 1) {
          paramzje.e().a(false);
        } else {
          paramzje.g().a(false);
        }
        break;
      }
    }
  }
  
  private static boolean a(zbs paramzbs, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramzbs.q()) {
      return false;
    }
    if (!m(paramzbs.c())) {
      return false;
    }
    return (!paramBoolean1) || (paramBoolean2);
  }
  
  private static void a(zbfe paramzbfe, zbs paramzbs)
  {
    int i = 0;
    int j = 0;
    Iterator localIterator = paramzbfe.iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if (localzbfc.ag() == 60) {
        i = 1;
      } else {
        j = 1;
      }
    }
    if ((i != 0) && (j == 0))
    {
      paramzbs.a(false);
      paramzbs.r = true;
    }
    if ((i != 0) && (j != 0)) {
      paramzbs.p = true;
    }
  }
  
  private static boolean b(zbfe paramzbfe)
  {
    int i = 0;
    int j = 0;
    Iterator localIterator = paramzbfe.iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if (localzbfc.ag() == 60) {
        i = 1;
      } else {
        j = 1;
      }
    }
    return (i != 0) && (j == 0);
  }
  
  static void d(zje paramzje)
  {
    zbfe localzbfe = paramzje.z();
    for (int i = 0; i < localzbfe.getCount(); i++)
    {
      zbfc localzbfc = localzbfe.c(i);
      int j = localzbfc.aj();
      int k = localzbfc.m();
      boolean bool = localzbfc.ak();
      Color localColor1 = paramzje.g(localzbfc.ax()).a(j);
      int m = j;
      if (!localzbfc.ax()) {
        m += 8;
      }
      Color localColor2 = paramzje.g(localzbfc.ax()).a(m);
      Color localColor3 = localColor2;
      localzbfc.A().c(localColor1);
      if (localzbfc.ax())
      {
        if (((localzbfc.z().c() == 1) || ((localzbfc.z().i()) && (localzbfc.z().c() != 0))) && ((k == 37) || (k == 38) || (k == 39) || (k == 62) || (k == 64) || (k == 57))) {
          localzbfc.z().b(localColor2);
        }
        if (bool)
        {
          if (localzbfc.B().d() != 1)
          {
            localzbfc.B().f().b(Color.getBlack());
            localzbfc.B().e().c(localColor3);
          }
          localzbfc.B().b(3);
        }
      }
      else
      {
        if (((localzbfc.z().c() == 1) || ((localzbfc.z().i()) && (localzbfc.z().c() != 0))) && ((k == 37) || (k == 39) || (k == 42) || (k == 38) || (k == 41) || (k == 40) || (k == 60) || (k == 61) || (k == 62) || (k == 63) || (k == 64) || (k == 57) || (k == 58))) {
          localzbfc.z().b(localColor2);
        }
        if (bool)
        {
          if (localzbfc.B().d() == 0)
          {
            localzbfc.B().f().b(localColor3);
            if ((j % 9 == 3) || (j % 9 == 4) || (j % 9 == 6) || (j % 9 == 7) || (j % 9 == 8)) {
              localzbfc.B().e().c(Color.getEmpty());
            } else {
              localzbfc.B().e().c(localColor3);
            }
          }
          else if (localzbfc.B().d() != 1)
          {
            localzbfc.B().f().b(localColor3);
            if ((localzbfc.B().d() == 5) || (localzbfc.B().d() == 6) || (localzbfc.B().d() == 8) || (localzbfc.B().d() == 9) || (localzbfc.B().d() == 10)) {
              localzbfc.B().e().c(Color.getEmpty());
            } else {
              localzbfc.B().e().c(localColor3);
            }
          }
          if (localzbfc.B().d() == 0) {
            localzbfc.B().b(zana.a(localzbfc, j));
          }
        }
      }
      int n = 0;
      if ((localzbfc.m() == 44) || (localzbfc.m() == 45) || (localzbfc.m() == 48) || (localzbfc.m() == 49) || (localzbfc.m() == 47) || (localzbfc.m() == 46) || (localzbfc.m() == 35) || (localzbfc.m() == 36)) {
        n = 1;
      }
      zkg localzkg = localzbfc.D();
      for (int i1 = 0; i1 < localzkg.getCount(); i1++)
      {
        zke localzke = localzkg.b(i1);
        int i2 = i1;
        if (localzke != null) {
          if (((n != 0) && (localzbfc.H())) || ((n == 0) && (localzbfc.H()) && (localzbfe.getCount() == 1)))
          {
            Color localColor4 = paramzje.g(localzbfc.ax()).a(i2);
            int i3 = i2;
            if (!localzbfc.ax()) {
              i3 += 8;
            }
            Color localColor5 = paramzje.g(localzbfc.ax()).a(i3);
            Color localColor6 = localColor5;
            localzke.i().c(localColor4);
            if (localzbfc.ax())
            {
              if (((localzke.k().c() == 1) || ((localzke.k().i()) && (localzke.k().c() != 0))) && ((k == 37) || (k == 38) || (k == 39) || (k == 62) || (k == 64) || (k == 57))) {
                localzke.k().b(localColor5);
              }
              if (bool)
              {
                if (localzke.m().d() != 1)
                {
                  localzke.m().f().b(localColor6);
                  localzke.m().e().c(Color.getBlack());
                }
                localzke.m().b(3);
              }
            }
            else
            {
              if (((localzke.k().c() == 1) || ((localzke.k().i()) && (localzke.k().c() != 0))) && ((k == 37) || (k == 39) || (k == 42) || (k == 38) || (k == 41) || (k == 40) || (k == 60) || (k == 61) || (k == 62) || (k == 63) || (k == 64) || (k == 57) || (k == 59) || (k == 58))) {
                localzke.k().b(localColor5);
              }
              if (bool)
              {
                if (localzke.m().d() == 0)
                {
                  localzke.m().f().b(localColor6);
                  if ((i2 % 9 == 3) || (i2 % 9 == 4) || (i2 % 9 == 6) || (i2 % 9 == 7) || (i2 % 9 == 8)) {
                    localzke.m().e().c(Color.getEmpty());
                  } else {
                    localzke.m().e().c(localColor6);
                  }
                }
                else if (localzke.m().d() != 1)
                {
                  localzke.m().f().b(localColor3);
                  if ((localzke.m().d() == 5) || (localzke.m().d() == 6) || (localzke.m().d() == 8) || (localzke.m().d() == 9) || (localzke.m().d() == 10)) {
                    localzke.m().e().c(Color.getEmpty());
                  } else {
                    localzke.m().e().c(localColor3);
                  }
                }
                if (localzke.m().d() == 0) {
                  localzke.m().b(zana.a(localzbfc, i2));
                }
              }
            }
          }
          else
          {
            localzke.i().c(localColor1);
            if (localzbfc.ax())
            {
              if (((localzke.k().c() == 1) || ((localzke.k().i()) && (localzke.k().c() != 0))) && ((k == 37) || (k == 38) || (k == 39) || (k == 62) || (k == 64) || (k == 57))) {
                localzke.k().b(localColor2);
              }
              if (bool)
              {
                if (localzke.m().d() != 1)
                {
                  localzke.m().f().b(Color.getBlack());
                  localzke.m().e().c(localColor3);
                }
                localzke.m().b(3);
              }
            }
            else
            {
              if (((localzke.k().c() == 1) || ((localzke.k().i()) && (localzke.k().c() != 0))) && ((k == 37) || (k == 39) || (k == 42) || (k == 38) || (k == 41) || (k == 40) || (k == 60) || (k == 61) || (k == 62) || (k == 63) || (k == 64) || (k == 57) || (k == 59) || (k == 58))) {
                localzke.k().b(localColor2);
              }
              if (bool)
              {
                if (localzke.m().d() == 0)
                {
                  localzke.m().f().b(localColor3);
                  if ((j % 9 == 3) || (j % 9 == 4) || (j % 9 == 6) || (j % 9 == 7) || (j % 9 == 8)) {
                    localzke.m().e().c(Color.getEmpty());
                  } else {
                    localzke.m().e().c(localColor3);
                  }
                }
                else if (localzke.m().d() != 1)
                {
                  localzke.m().f().b(localColor3);
                  if ((localzke.m().d() == 5) || (localzke.m().d() == 6) || (localzke.m().d() == 8) || (localzke.m().d() == 9) || (localzke.m().d() == 10)) {
                    localzke.m().e().c(Color.getEmpty());
                  } else {
                    localzke.m().e().c(localColor3);
                  }
                }
                if (localzke.m().d() == 0) {
                  localzke.m().b(zana.a(localzbfc, j));
                }
              }
            }
          }
        }
      }
    }
  }
  
  static void e(zje paramzje)
  {
    b(paramzje.e());
    b(paramzje.E());
    b(paramzje.g());
    b(paramzje.G());
    b(paramzje.I());
  }
  
  private static void b(zbs paramzbs)
  {
    zbwu localzbwu = paramzbs.F();
    paramzbs.m(((int)localzbwu.a().h() - 1) / 3 + 1);
    if (localzbwu.a().h() < 6.0F) {
      paramzbs.m((int)localzbwu.a().h() / 2 + 1);
    }
    paramzbs.n((int)(paramzbs.X() * 0.7F + 0.5F));
    if (paramzbs.Y() == paramzbs.X()) {
      paramzbs.n(paramzbs.X() - 1);
    }
    if (paramzbs.Y() < 1) {
      paramzbs.n(1);
    }
  }
  
  static boolean a(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 24: 
    case 25: 
    case 26: 
    case 31: 
    case 32: 
    case 33: 
    case 53: 
    case 54: 
    case 55: 
      return true;
    }
    return false;
  }
  
  private static void b(zbs paramzbs, boolean paramBoolean)
  {
    zje localzje = paramzbs.c();
    if ((paramzbs.d() == 1) || (paramzbs.d() == 3)) {
      paramBoolean = !paramBoolean;
    }
    if ((paramBoolean) && (paramzbs.K().a)) {
      paramzbs.K().a(90);
    }
  }
  
  private static void c(zbs paramzbs, boolean paramBoolean)
  {
    zje localzje = paramzbs.c();
    if ((paramzbs.d() == 1) || (paramzbs.d() == 3)) {
      paramBoolean = !paramBoolean;
    }
    if ((paramBoolean) && (paramzbs.Q().a())) {
      paramzbs.Q().c(90);
    }
  }
  
  private static void a(zbs paramzbs, com.aspose.cells.b.a.b.zp[] paramArrayOfzp, boolean paramBoolean, com.aspose.cells.b.a.b.zs paramzs)
  {
    com.aspose.cells.b.a.b.zs localzs = new com.aspose.cells.b.a.b.zs(paramzs.b(), paramzs.c());
    zje localzje = paramzbs.c();
    if ((paramzbs.d() == 1) || (paramzbs.d() == 3)) {
      paramBoolean = !paramBoolean;
    }
    if (paramBoolean)
    {
      if (paramzbs.n)
      {
        paramzbs.K().e().b.a(paramArrayOfzp[0].c());
        paramArrayOfzp[0].a(paramArrayOfzp[0].c() + localzs.b());
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - localzs.b());
      }
      else
      {
        paramzbs.K().e().b.a(paramArrayOfzp[0].i() - localzs.b());
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - localzs.b());
      }
    }
    else if (paramzbs.n)
    {
      paramzbs.K().e().b.b(paramArrayOfzp[0].j() - localzs.c());
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - localzs.c());
    }
    else
    {
      paramzbs.K().e().b.b(paramArrayOfzp[0].d());
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + localzs.c());
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - localzs.c());
    }
    paramzbs.K().e().b.a(localzs);
  }
  
  private static void a(zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp, boolean paramBoolean)
    throws Exception
  {
    com.aspose.cells.b.a.b.zs localzs = new com.aspose.cells.b.a.b.zs(paramzbs.K().e().b.b().b(), paramzbs.K().e().b.b().c());
    zje localzje = paramzbs.c();
    if ((paramzbs.d() == 1) || (paramzbs.d() == 3)) {
      paramBoolean = !paramBoolean;
    }
    if (paramBoolean)
    {
      if (paramzbs.n)
      {
        if ((paramzp.c() >= localzs.b() + b) || (!paramzbs.K().e().q())) {
          paramzbs.K().e().b.a(paramzp.c() - localzs.b() - b / 2);
        } else {
          paramzbs.K().e().b.a(b);
        }
      }
      else if ((localzje.a() - paramzp.i() >= localzs.b() + b / 2) || (!paramzbs.K().e().q())) {
        paramzbs.K().e().b.a(paramzp.i() + b / 2);
      } else {
        paramzbs.K().e().b.a(localzje.a() - localzs.b() - b / 2);
      }
    }
    else if (paramzbs.n)
    {
      if ((localzje.b() - paramzp.j() >= localzs.c() + b) || (!paramzbs.K().e().r())) {
        paramzbs.K().e().b.b(paramzp.j() + b / 2);
      } else {
        paramzbs.K().e().b.b(localzje.b() - localzs.c() - b / 2);
      }
    }
    else if ((paramzp.d() >= localzs.c() + b) || (!paramzbs.K().e().r())) {
      paramzbs.K().e().b.b(paramzp.d() - localzs.c() - b / 2);
    } else {
      paramzbs.K().e().b.b(b);
    }
  }
  
  private static void d(zbs paramzbs, boolean paramBoolean)
  {
    zje localzje = paramzbs.c();
    if ((paramzbs.d() == 1) || (paramzbs.d() == 3)) {
      paramBoolean = !paramBoolean;
    }
    if (paramBoolean) {
      paramzbs.K().e().b.b(localzje.B().b.d() + (localzje.B().b.f() - paramzbs.K().e().b.f()) / 2);
    } else {
      paramzbs.K().e().b.a(localzje.B().b.c() + (localzje.B().b.e() - paramzbs.K().e().b.e()) / 2);
    }
  }
  
  static float a(zbs paramzbs, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return a(paramzbs, paramInt1, paramInt2, paramBoolean);
  }
  
  static float a(zbs paramzbs, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = 0.0F;
    int i;
    if (paramBoolean)
    {
      if (paramzbs.p()) {
        i = 0;
      } else {
        i = 1;
      }
    }
    else if (paramzbs.p()) {
      i = 1;
    } else {
      i = 0;
    }
    double d1 = paramzbs.n() ? zbxz.e(paramzbs.l()) : paramzbs.l();
    double d2 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
    double d3 = paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D();
    if (paramzbs.m() == 1) {
      d1 = d2;
    }
    if (d1 > d2) {
      d1 = d2;
    }
    if (d1 < d3) {
      d1 = d3;
    }
    paramzbs.a(paramzbs.n() ? zbxz.f(d1) : d1);
    if (i == 0) {
      f = (float)(paramFloat1 + (d2 - d1) / (d2 - d3) * paramFloat2);
    } else {
      f = (float)(paramFloat1 + (d1 - d3) / (d2 - d3) * paramFloat2);
    }
    return f;
  }
  
  static float a(zbs paramzbs, int paramInt1, int paramInt2, boolean paramBoolean, zbfe paramzbfe)
  {
    return a(paramzbs, paramInt1, paramInt2, paramBoolean, paramzbfe);
  }
  
  static float a(zbs paramzbs, float paramFloat1, float paramFloat2, boolean paramBoolean, zbfe paramzbfe)
  {
    if (paramzbfe.getCount() == 0) {
      return 0.0F;
    }
    float f = 0.0F;
    int i;
    if (paramBoolean)
    {
      if (paramzbs.p()) {
        i = 0;
      } else {
        i = 1;
      }
    }
    else if (paramzbs.p()) {
      i = 1;
    } else {
      i = 0;
    }
    zje localzje = paramzbs.c();
    int j;
    int k;
    int m;
    if (paramzbs.k() != 2)
    {
      j = a(paramzbfe.i());
      k = j;
      if ((paramzbs.f()) || (localzje.u())) {
        k++;
      }
      m = 1;
      if (k <= m) {
        k = 2;
      }
      double d1 = paramzbs.l();
      if (paramzbs.m() == 1) {
        d1 = k;
      }
      if (d1 > k) {
        d1 = k;
      } else if (d1 < m) {
        d1 = m;
      }
      if (paramzbfe.c(0).aw())
      {
        d1 = paramzbs.n() ? zbxz.e(paramzbs.l()) : paramzbs.l();
        double d2 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
        double d3 = paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D();
        if (paramzbs.m() == 1) {
          d1 = d2;
        }
        if (d1 > d2) {
          d1 = d2;
        }
        if (d1 < d3) {
          d1 = d3;
        }
        paramzbs.a(paramzbs.n() ? zbxz.f(d1) : d1);
        if (i != 0) {
          f = (float)(paramFloat1 + (d2 - d1) / (d2 - d3) * paramFloat2);
        } else {
          f = (float)(paramFloat1 + (d1 - d3) / (d2 - d3) * paramFloat2);
        }
      }
      else
      {
        paramzbs.a(d1);
        if (i != 0) {
          f = (float)(paramFloat1 + (k - d1) / (k - m) * paramFloat2);
        } else {
          f = (float)(paramFloat1 + (d1 - m) / (k - m) * paramFloat2);
        }
      }
    }
    else
    {
      j = paramzbs.j();
      k = (int)paramzbs.z();
      m = (int)paramzbs.D();
      int n = 0;
      if ((paramzbs.f()) || (localzje.u()))
      {
        k = zbu.a(j, j, 1, k, localzje.U());
        n = zbu.a(j, k, m, paramzbs.c().U());
      }
      else
      {
        n = zbu.a(j, k, m, paramzbs.c().U());
        if (n == 0) {
          n = 1;
        }
      }
      int i1 = zbu.a(j, (int)paramzbs.l(), localzje.U());
      if (paramzbs.m() == 1) {
        i1 = k;
      }
      if (i1 > k) {
        i1 = k;
      } else if (i1 < m) {
        i1 = m;
      }
      paramzbs.a(i1);
      if (i != 0) {
        f = paramFloat1 + paramFloat2 - zbu.a(j, i1, m, paramzbs.c().U()) / n * paramFloat2;
      } else {
        f = paramFloat1 + zbu.a(j, i1, m, paramzbs.c().U()) / n * paramFloat2;
      }
    }
    return f;
  }
  
  private static void a(zbs paramzbs1, zbs paramzbs2, zbfe paramzbfe, zje paramzje)
  {
    int i = paramzbfe.c(0).ag();
    switch (paramzbs1.E())
    {
    case 3: 
      paramzbs1.m = 0;
      break;
    case 1: 
      paramzbs1.m = 1;
      if (paramzbs2.p()) {
        paramzbs1.m = 2;
      }
      break;
    case 0: 
      paramzbs1.m = 2;
      if (paramzbs2.p()) {
        paramzbs1.m = 1;
      }
      break;
    case 2: 
      paramzbs1.m = 3;
      if (paramzbs2.m() == 1)
      {
        if (!paramzbs2.p()) {
          paramzbs1.m = 2;
        } else {
          paramzbs1.m = 1;
        }
      }
      else if (paramzbs2.m() == 0) {
        if ((paramzbs2.d() == 1) || (paramzbs2.d() == 3)) {
          paramzbs2.a(0.0D);
        } else if ((paramzbs2.d() == 0) || (paramzbs2.d() == 2)) {
          if (b(i))
          {
            paramzbs2.a(0.0D);
          }
          else if (paramzbs2.d() == 2)
          {
            zbs localzbs = paramzbs2.c().e();
            if ((localzbs.q()) && (localzbs.l() == localzbs.D()))
            {
              paramzbs2.e(1);
              if (!paramzbs2.p()) {
                paramzbs1.m = 2;
              } else {
                paramzbs1.m = 1;
              }
            }
            else
            {
              paramzbs2.a(paramzbs2.D());
            }
          }
          else
          {
            paramzbs2.a(paramzbs2.D());
          }
        }
      }
      if (paramzbs2.m() == 2) {
        if ((paramzbs2.k() != 2) && ((paramzbs2.d() == 0) || (paramzbs2.d() == 2)) && (paramzbfe.c(0).ag() != 12) && (paramzbfe.c(0).ag() != 60))
        {
          int j = a(paramzbfe.i());
          int k = j;
          if ((paramzbs2.f()) || (paramzje.u())) {
            k++;
          }
          int m = 1;
          if (k <= m) {
            k = 2;
          }
          double d2 = paramzbs2.l();
          if (paramzbs2.m() == 1) {
            d2 = k;
          }
          if (d2 > k) {
            d2 = k;
          } else if (d2 < m) {
            d2 = m;
          }
          if (!paramzbs2.p())
          {
            if (d2 == m) {
              paramzbs1.m = 1;
            }
          }
          else if (d2 == m) {
            paramzbs1.m = 2;
          }
        }
        else
        {
          double d1 = paramzbs2.D();
          if (paramzbs2.l() <= d1) {
            if (!paramzbs2.p()) {
              paramzbs1.m = 1;
            } else {
              paramzbs1.m = 2;
            }
          }
        }
      }
      break;
    }
  }
  
  private static void a(zje paramzje, zr paramzr, zbs paramzbs, com.aspose.cells.b.a.b.zs paramzs1, com.aspose.cells.b.a.b.zs paramzs2, com.aspose.cells.b.a.b.zp[] paramArrayOfzp, boolean paramBoolean)
  {
    if (paramBoolean) {
      switch (paramzbs.m)
      {
      case 1: 
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S())))
        {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzs1.c());
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzs2.c());
        }
        else
        {
          paramzje.k().a.b(paramzje.k().a.d() + paramzs1.c() + paramzs2.c());
          paramzje.d += paramzs1.c();
          if ((paramzbs.Q().b().n() == 0) || (paramzbs.Q().b().o() == 0)) {
            paramzje.d += paramzs2.c();
          }
        }
        break;
      case 2: 
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S())))
        {
          paramArrayOfzp[0].b(paramArrayOfzp[0].d() + paramzs1.c());
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzs1.c());
          paramArrayOfzp[0].b(paramArrayOfzp[0].d() + paramzs2.c());
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzs2.c());
        }
        else
        {
          paramzje.b -= paramzs1.c();
          paramzje.d += paramzs1.c();
          paramzje.b -= paramzs2.c();
          if ((paramzbs.Q().b().n() == 0) || (paramzbs.Q().b().o() == 0)) {
            paramzje.d += paramzs2.c();
          }
        }
        break;
      case 3: 
        if (((!paramzje.B().s()) && ((paramzje.C().s()) || (paramzje.S()))) || (!paramzje.u())) {
          break;
        }
        paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 5);
        break;
      case 0: 
        break;
      }
    } else {
      switch (paramzbs.m)
      {
      case 1: 
        com.aspose.cells.b.a.b.zs localzs;
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S())))
        {
          if (!paramzje.u())
          {
            paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs1.b());
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - paramzs1.b());
            paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs2.b());
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - paramzs2.b());
          }
          else
          {
            localzs = paramzje.k().q();
            if (paramzs1.b() + paramzs2.b() > localzs.b())
            {
              paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs1.b() + paramzs2.b() - localzs.b());
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (paramzs1.b() + paramzs2.b() - localzs.b()));
            }
          }
        }
        else if (!paramzje.u())
        {
          paramzje.a -= paramzs1.b();
          paramzje.c += paramzs1.b();
          if ((paramzbs.Q().b().n() == 0) || (paramzbs.Q().b().o() == 0))
          {
            paramzje.a -= paramzs2.b();
            paramzje.c += paramzs2.b();
          }
        }
        else
        {
          localzs = paramzje.k().q();
          if ((paramzbs.Q().b().n() == 0) || (paramzbs.Q().b().o() == 0))
          {
            if (paramzs1.b() + paramzs2.b() > localzs.b())
            {
              paramzje.a -= paramzs1.b() + paramzs2.b() - localzs.b();
              paramzje.c += paramzs1.b() + paramzs2.b() - localzs.b();
            }
          }
          else if (paramzs1.b() > localzs.b())
          {
            paramzje.a -= paramzs1.b() - localzs.b();
            paramzje.c += paramzs1.b() - localzs.b();
          }
        }
        break;
      case 2: 
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S())))
        {
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() - paramzs1.b());
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() - paramzs2.b());
        }
        else
        {
          paramzje.c += paramzs1.b();
          if ((paramzbs.Q().b().n() == 0) || (paramzbs.Q().b().o() == 0)) {
            paramzje.c += paramzs2.b();
          }
        }
        break;
      case 0: 
      case 3: 
        break;
      }
    }
    zbxz.b(paramArrayOfzp);
  }
  
  private static void a(zje paramzje, zr paramzr, zbs paramzbs, com.aspose.cells.b.a.b.zs paramzs, com.aspose.cells.b.a.b.zp[] paramArrayOfzp, boolean paramBoolean)
  {
    if (paramBoolean) {
      switch (paramzbs.m)
      {
      case 1: 
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S()))) {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzs.c());
        } else {
          paramzje.d += paramzs.c();
        }
        break;
      case 2: 
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S())))
        {
          paramArrayOfzp[0].b(paramArrayOfzp[0].d() + paramzs.c());
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzs.c());
        }
        else
        {
          paramzje.b -= paramzs.c();
          paramzje.d += paramzs.c();
        }
        break;
      case 3: 
        if (((!paramzje.B().s()) && ((paramzje.C().s()) || (paramzje.S()))) || (!paramzje.u())) {
          break;
        }
        paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 5);
        break;
      }
    } else {
      switch (paramzbs.m)
      {
      case 1: 
        if (!paramzje.u())
        {
          paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs.b());
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() - paramzs.b());
        }
        else
        {
          com.aspose.cells.b.a.b.zs localzs = paramzje.k().q();
          if (paramzs.b() > localzs.b())
          {
            paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs.b() - localzs.b());
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (paramzs.b() - localzs.b()));
          }
        }
        break;
      case 2: 
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - paramzs.b());
        break;
      }
    }
    zbxz.b(paramArrayOfzp);
  }
  
  private static void a(zje paramzje, zr paramzr, zbs paramzbs, com.aspose.cells.b.a.b.zs paramzs, int paramInt, com.aspose.cells.b.a.b.zp[] paramArrayOfzp, boolean paramBoolean)
  {
    com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(paramArrayOfzp[0].c(), paramArrayOfzp[0].d(), paramArrayOfzp[0].e(), paramArrayOfzp[0].f());
    float f = 0.25F;
    if (paramBoolean)
    {
      switch (paramzbs.m)
      {
      case 1: 
        com.aspose.cells.b.a.b.zs localzs;
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S())))
        {
          if (!paramzje.u())
          {
            paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs.b() + paramInt);
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (paramzs.b() + paramInt));
          }
          else
          {
            localzs = paramzje.k().q();
            if (paramzs.b() + paramInt > localzs.b())
            {
              paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs.b() + paramInt - localzs.b());
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (paramzs.b() + paramInt - localzs.b()));
            }
          }
        }
        else if (!paramzje.u())
        {
          paramzje.a -= paramzs.b() + paramInt;
          paramzje.c += paramzs.b() + paramInt;
        }
        else
        {
          localzs = paramzje.k().q();
          if (paramzs.b() + paramInt > localzs.b())
          {
            paramzje.a -= paramzs.b() + paramInt - localzs.b();
            paramzje.c += paramzs.b() + paramInt - localzs.b();
          }
        }
        break;
      case 2: 
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S()))) {
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (paramzs.b() + paramInt));
        } else {
          paramzje.c += paramzs.b() + paramInt;
        }
        break;
      case 3: 
        a(zbu.a(paramzbs), paramArrayOfzp, paramBoolean, paramzs, paramInt);
        break;
      case 0: 
        break;
      }
      if (paramArrayOfzp[0].e() < (int)(localzp.e() * f)) {
        paramArrayOfzp[0].c((int)(localzp.e() * f));
      }
    }
    else
    {
      if ((paramzje.u()) && (paramzbs.k() != 2))
      {
        paramzbs.m = 0;
        paramzbs.f(2);
        paramzbs.h(2);
        paramInt = 0;
      }
      switch (paramzbs.m)
      {
      case 1: 
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S())))
        {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (paramzs.c() + paramInt));
        }
        else
        {
          paramzje.d += paramzs.c() + paramInt;
          paramzje.k().a.b(paramzje.k().a.d() + paramzs.c() + paramInt);
        }
        break;
      case 2: 
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S())))
        {
          if ((paramzje.u()) && (paramzbs.k() == 2))
          {
            paramArrayOfzp[0].b(paramArrayOfzp[0].d() + paramzs.c() + paramInt);
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (paramzs.c() + paramInt + b));
          }
          else
          {
            paramArrayOfzp[0].b(paramArrayOfzp[0].d() + paramzs.c() + paramInt);
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (paramzs.c() + paramInt));
          }
        }
        else if ((paramzje.u()) && (paramzbs.k() == 2))
        {
          paramzje.b -= paramzs.c() + paramInt;
          paramzje.d += paramzs.c() + paramInt + b;
        }
        else
        {
          paramzje.b -= paramzs.c() + paramInt;
          paramzje.d += paramzs.c() + paramInt;
        }
        break;
      case 3: 
        if ((paramzje.B().s()) || ((!paramzje.C().s()) && (!paramzje.S())))
        {
          if ((paramzje.u()) && (paramzbs.k() == 2)) {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - b);
          } else {
            a(zbu.a(paramzbs), paramArrayOfzp, paramBoolean, paramzs, paramInt);
          }
        }
        else if ((paramzje.u()) && (paramzbs.k() == 2)) {
          paramzje.d += b;
        } else {
          a(zbu.a(paramzbs), paramArrayOfzp, paramBoolean, paramzs, paramInt);
        }
        break;
      case 0: 
        break;
      }
      if (paramArrayOfzp[0].f() < (int)(localzp.f() * f)) {
        paramArrayOfzp[0].d((int)(localzp.f() * f));
      }
    }
    zbxz.b(paramArrayOfzp);
  }
  
  static void a(zbs paramzbs, com.aspose.cells.b.a.b.zp[] paramArrayOfzp, boolean paramBoolean, com.aspose.cells.b.a.b.zs paramzs, int paramInt)
  {
    com.aspose.cells.b.a.b.zs localzs = new com.aspose.cells.b.a.b.zs(paramzs.b(), paramzs.c());
    localzs.a(localzs.b() + paramInt);
    localzs.b(localzs.c() + paramInt);
    float f1 = paramArrayOfzp[0].d();
    float f2 = paramArrayOfzp[0].f();
    if (paramBoolean)
    {
      f1 = paramArrayOfzp[0].c();
      f2 = paramArrayOfzp[0].e();
    }
    double d1 = paramzbs.n() ? zbxz.e(paramzbs.l()) : paramzbs.l();
    double d2 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
    double d3 = paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D();
    if (paramzbs.m() == 1) {
      d1 = d2;
    }
    if (d1 > d2) {
      d1 = d2;
    }
    if (d1 < d3) {
      d1 = d3;
    }
    float f3 = (float)((d1 - d3) / (d2 - d3) * f2);
    int i;
    com.aspose.cells.b.a.b.zp localzp;
    int j;
    if (paramBoolean)
    {
      i = 2;
      localzp = new com.aspose.cells.b.a.b.zp(paramArrayOfzp[0].c(), paramArrayOfzp[0].d(), paramArrayOfzp[0].e(), paramArrayOfzp[0].f());
      while (i > 0)
      {
        paramArrayOfzp[0] = new com.aspose.cells.b.a.b.zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
        j = (int)(localzs.b() - f3);
        if (j > 0) {
          if (paramzbs.p())
          {
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - j);
          }
          else
          {
            paramArrayOfzp[0].a(paramArrayOfzp[0].c() + j);
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - j);
          }
        }
        f3 = paramArrayOfzp[0].e() * f3 / localzp.e();
        i--;
      }
    }
    else
    {
      i = 2;
      localzp = new com.aspose.cells.b.a.b.zp(paramArrayOfzp[0].c(), paramArrayOfzp[0].d(), paramArrayOfzp[0].e(), paramArrayOfzp[0].f());
      while (i > 0)
      {
        paramArrayOfzp[0] = new com.aspose.cells.b.a.b.zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
        j = (int)(localzs.c() - f3);
        if (j > 0) {
          if (paramzbs.p())
          {
            paramArrayOfzp[0].b(paramArrayOfzp[0].d() + j);
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - j);
          }
          else
          {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - j);
          }
        }
        f3 = paramArrayOfzp[0].f() * f3 / localzp.f();
        i--;
      }
    }
  }
  
  private static void a(zr paramzr, zje paramzje, zbfc paramzbfc1, zbfc paramzbfc2, com.aspose.cells.b.a.b.zp[] paramArrayOfzp)
    throws Exception
  {
    int i = paramzbfc1.m();
    int j = paramzbfc2.m();
    int i7;
    if ((paramzbfc1.as()) || (paramzbfc2.as()))
    {
      double d1 = 75.0D;
      double d2 = 100.0D;
      zawj.a(paramzje, paramArrayOfzp, paramzbfc1);
      zawj.a(paramzje, paramArrayOfzp, paramzbfc2);
      double d3;
      int i6;
      int i8;
      if ((i == 46) || (j == 46))
      {
        if (i == 46)
        {
          d1 = paramzbfc1.W();
          d2 = paramzbfc1.J();
        }
        if (j == 46)
        {
          d1 = paramzbfc2.W();
          d2 = paramzbfc2.J();
        }
        d3 = paramArrayOfzp[0].e() / (2.0D + 2.0D * d1 / 100.0D + d2 / 100.0D);
        if (d1 <= 100.0D)
        {
          if (d3 > paramArrayOfzp[0].f() / 2.0D) {
            d3 = paramArrayOfzp[0].f() / 2.0D;
          }
          paramzje.k(zbxz.c(d3));
          paramzje.l(zbxz.c(d3 * d1 / 100.0D));
          paramzje.m(zbxz.c(d3 * d2 / 100.0D));
          int i3 = paramArrayOfzp[0].e() - (2 * paramzje.ad() + paramzje.af() + 2 * paramzje.ae());
          i6 = paramArrayOfzp[0].f() - 2 * paramzje.ad();
          paramArrayOfzp[0].a(-i3 / 2, -i6 / 2);
        }
        else
        {
          double d4 = d1 * d3 / 100.0D;
          if (d4 <= paramArrayOfzp[0].f() / 2.0D) {
            d4 = paramArrayOfzp[0].f() / 2.0D;
          }
          paramzje.l(zbxz.c(d4));
          paramzje.k(zbxz.c(d4 * 100.0D / d1));
          paramzje.m(zbxz.c(d4 * 100.0D / d1 * d2 / 100.0D));
          i7 = paramArrayOfzp[0].e() - (2 * paramzje.ad() + paramzje.af() + 2 * paramzje.ae());
          i8 = paramArrayOfzp[0].f() - 2 * paramzje.ae();
          paramArrayOfzp[0].a(-i7 / 2, -i8 / 2);
        }
      }
      else if ((i == 49) || (j == 49))
      {
        if (i == 49)
        {
          d1 = paramzbfc1.W();
          d2 = paramzbfc1.J() / 2.0D;
        }
        if (j == 49)
        {
          d1 = paramzbfc2.W();
          d2 = paramzbfc2.J() / 2.0D;
        }
        d3 = paramArrayOfzp[0].e() / (2.0D + d1 / 100.0D + d2 / 100.0D);
        if (d1 <= 100.0D)
        {
          if (d3 > paramArrayOfzp[0].f() / 2.0D) {
            d3 = paramArrayOfzp[0].f() / 2.0D;
          }
          paramzje.k(zbxz.c(d3));
          paramzje.l(zbxz.c(d3 * d1 / 100.0D));
          paramzje.m(zbxz.c(d3 * d2 / 100.0D));
          int i4 = paramArrayOfzp[0].e() - (2 * paramzje.ad() + paramzje.af() + paramzje.ae());
          i6 = paramArrayOfzp[0].f() - 2 * paramzje.ad();
          paramArrayOfzp[0].a(-i4 / 2, -i6 / 2);
        }
        else
        {
          double d5 = d1 * d3 / 100.0D;
          if (d5 > paramArrayOfzp[0].f() / 2.0D) {
            d5 = paramArrayOfzp[0].f() / 2.0D;
          }
          paramzje.l(zbxz.c(d5));
          paramzje.k(zbxz.c(d5 * 100.0D / d1));
          paramzje.m(zbxz.c(d5 * 100.0D / d1 * d2 / 100.0D));
          i7 = paramArrayOfzp[0].e() - (2 * paramzje.ad() + paramzje.af() + 2 * paramzje.ae());
          i8 = paramArrayOfzp[0].f() - 2 * paramzje.ae();
          paramArrayOfzp[0].a(-i7 / 2, -i8 / 2);
        }
      }
      else
      {
        zbxz.a(paramArrayOfzp);
      }
    }
    else if ((paramzbfc1.au()) || (paramzbfc2.au()))
    {
      zt localzt = new zt(paramzje.a() * 0.3F, paramzje.b());
      int k = paramzje.e().E() == 3 ? 0 : 1;
      int m = paramzje.g().E() == 3 ? 0 : 1;
      if (paramzje.B().s())
      {
        paramArrayOfzp[0].a(-13, -13);
        n = 0;
        int i1 = 0;
        int i2 = 0;
        int i5 = 0;
        com.aspose.cells.b.a.b.zs localzs1;
        String str;
        zg localzg;
        int i9;
        com.aspose.cells.b.a.b.zs localzs2;
        if ((paramzbfc1.au()) && (k != 0))
        {
          localzs1 = zbvx.a(paramzr, "a", paramzje.e().F().a());
          paramzje.e().F().d(localzs1.b() / 2);
          i2 = paramzje.e().F().k();
          for (i7 = 0; i7 < paramzje.e().l.size(); i7++)
          {
            str = com.aspose.cells.b.a.zs.a(paramzje.e().l.get(i7));
            localzg = paramzje.e().F().a();
            i9 = paramzje.e().F().e();
            localzs2 = zbvx.a(paramzje.ar(), str, i9, localzg, localzt, 1, 1);
            if (localzs2.b() > n) {
              n = localzs2.b();
            }
            if (localzs2.c() > i1) {
              i1 = localzs2.c();
            }
          }
          paramzje.e().f = localzt.b();
          paramzje.e().g = localzt.c();
        }
        if ((paramzbfc2.au()) && (m != 0))
        {
          localzs1 = zbvx.a(paramzr, "a", paramzje.g().F().a());
          paramzje.g().F().d(localzs1.b() / 2);
          i5 = paramzje.g().F().k();
          for (i7 = 0; i7 < paramzje.g().l.size(); i7++)
          {
            str = com.aspose.cells.b.a.zs.a(paramzje.g().l.get(i7));
            localzg = paramzje.g().F().a();
            i9 = paramzje.g().F().e();
            localzs2 = zbvx.a(paramzje.ar(), str, i9, localzg, localzt, 1, 1);
            if (localzs2.b() > n) {
              n = localzs2.b();
            }
            if (localzs2.c() > i1) {
              i1 = localzs2.c();
            }
          }
          paramzje.g().f = localzt.b();
          paramzje.g().g = localzt.c();
        }
        if (i1 > 0)
        {
          if (i2 < i5) {
            i2 = i5;
          }
          i1 += i2;
        }
        paramArrayOfzp[0].a(-n, -i1);
      }
      else
      {
        if ((paramzbfc1.au()) && (k != 0))
        {
          paramzje.e().f = localzt.b();
          paramzje.e().g = localzt.c();
        }
        if ((paramzbfc2.au()) && (m != 0))
        {
          paramzje.g().f = localzt.b();
          paramzje.g().g = localzt.c();
        }
      }
      zbxz.a(paramArrayOfzp);
      int n = 15;
      if (paramArrayOfzp[0].e() < n) {
        paramArrayOfzp[0].c(n);
      }
      if (paramArrayOfzp[0].f() < n) {
        paramArrayOfzp[0].d(n);
      }
    }
  }
  
  private static void b(zje paramzje, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramzje.e(), paramBoolean1);
    a(paramzje.g(), paramBoolean2);
    a(paramzje.E(), paramBoolean1);
    a(paramzje.G(), paramBoolean2);
  }
  
  static void a(zbs paramzbs, boolean paramBoolean)
  {
    zbs localzbs = zbu.a(paramzbs);
    if (localzbs == null) {
      return;
    }
    if ((localzbs.m() == 1) && (!localzbs.p()))
    {
      if (!paramBoolean)
      {
        if (paramzbs.b()) {
          paramzbs.a(3);
        } else {
          paramzbs.a(2);
        }
      }
      else if (paramzbs.b()) {
        paramzbs.a(2);
      } else {
        paramzbs.a(3);
      }
    }
    else if ((localzbs.m() != 1) && (localzbs.p()))
    {
      if (!paramBoolean)
      {
        if (paramzbs.b()) {
          paramzbs.a(3);
        } else {
          paramzbs.a(2);
        }
      }
      else if (paramzbs.b()) {
        paramzbs.a(2);
      } else {
        paramzbs.a(3);
      }
    }
    else if (!paramBoolean)
    {
      if (paramzbs.b()) {
        paramzbs.a(0);
      } else {
        paramzbs.a(1);
      }
    }
    else if (paramzbs.b()) {
      paramzbs.a(1);
    } else {
      paramzbs.a(0);
    }
    if (paramzbs.E() == 0) {
      switch (paramzbs.a())
      {
      case 0: 
        paramzbs.a(3);
        break;
      case 3: 
        paramzbs.a(0);
        break;
      case 1: 
        paramzbs.a(2);
        break;
      case 2: 
        paramzbs.a(1);
        break;
      }
    }
  }
  
  private static void i(zje paramzje)
  {
    c(paramzje.e());
    c(paramzje.g());
    c(paramzje.E());
    c(paramzje.G());
  }
  
  private static void c(zbs paramzbs)
  {
    if (paramzbs.a() == 1) {
      if (paramzbs.n) {
        paramzbs.b(0);
      } else {
        paramzbs.b(1);
      }
    }
    if (paramzbs.a() == 2) {
      if (paramzbs.n) {
        paramzbs.b(0);
      } else {
        paramzbs.b(1);
      }
    }
    if (paramzbs.a() == 0) {
      if (paramzbs.n) {
        paramzbs.b(3);
      } else {
        paramzbs.b(2);
      }
    }
    if (paramzbs.a() == 3) {
      if (paramzbs.n) {
        paramzbs.b(3);
      } else {
        paramzbs.b(2);
      }
    }
  }
  
  static void f(zje paramzje)
  {
    ArrayList localArrayList = paramzje.z().j();
    zamw localzamw = paramzje.k().o();
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zbfc localzbfc = (zbfc)localArrayList.get(i);
      zamy localzamy = new zamy(paramzje, paramzje.l(), i);
      localzamy.a(localzbfc.i());
      localzamy.a(1);
      localzamy.a(localzbfc);
      localzamw.a(localzamy);
    }
  }
  
  static void g(zje paramzje)
  {
    ArrayList localArrayList1 = paramzje.z().j();
    zamu localzamu = paramzje.x();
    zamw localzamw1 = localzamu.g();
    zamw localzamw2 = localzamu.f();
    int i = 1;
    int j = 0;
    Object localObject;
    for (int k = 0; k < localArrayList1.size(); k++)
    {
      zbfc localzbfc = (zbfc)localArrayList1.get(k);
      if ((k == 0) && (localzbfc.j())) {
        i = 0;
      }
      n = localzbfc.a();
      localObject = localzamw1.c(n);
      zamy localzamy1;
      if (localObject == null)
      {
        localzamy1 = new zamy(paramzje, localzamu, n);
        localzamy1.a(localzbfc.i());
        localzamy1.a(1);
        localzamy1.a(localzbfc);
        zzo.a(localzamu.d().k(), localzamy1.a());
        if (j == 0) {
          localzamw2.a(localzamy1);
        }
        if (localzbfc.c(new int[] { 44 })) {
          j = 1;
        }
      }
      else if (!((zamy)localObject).b())
      {
        localzamy1 = new zamy(paramzje, localzamu, n);
        localzamy1.a(localzbfc.i());
        localzamy1.a(1);
        localzamy1.a(localzbfc);
        localzamy1.a(((zamy)localObject).c());
        localzamy1.a(((zamy)localObject).e());
        zzo.a(((zamy)localObject).a(), localzamy1.a());
        if (j == 0) {
          localzamw2.a(localzamy1);
        }
        if (localzbfc.c(new int[] { 44 })) {
          j = 1;
        }
      }
    }
    ArrayList localArrayList2 = new ArrayList();
    if (i != 0)
    {
      com.aspose.cells.b.a.a.zf.a(localArrayList2, paramzje.z().m());
      com.aspose.cells.b.a.a.zf.a(localArrayList2, paramzje.z().n());
    }
    else
    {
      com.aspose.cells.b.a.a.zf.a(localArrayList2, paramzje.z().n());
      com.aspose.cells.b.a.a.zf.a(localArrayList2, paramzje.z().m());
    }
    int m = localzamw2.getCount() > 0 ? localzamw2.getCount() - 1 : 0;
    for (int n = 0; n < localArrayList2.size(); n++)
    {
      localObject = (zbxf)localArrayList2.get(n);
      int i1 = localArrayList1.size() + ((zbxf)localObject).u();
      zamy localzamy2 = localzamw1.c(i1);
      zamy localzamy3;
      if (localzamy2 == null)
      {
        localzamy3 = new zamy(paramzje, localzamu, i1);
        localzamy3.a(((zbxf)localObject).m());
        localzamy3.a(2);
        localzamy3.a(((zbxf)localObject).e().a());
        localzamy3.a((zbxf)localObject);
        zzo.a(localzamu.d().k(), localzamy3.a());
        a(localzamy3, localzamw2, m);
      }
      else if (!localzamy2.b())
      {
        localzamy3 = new zamy(paramzje, localzamu, i1);
        localzamy3.a(((zbxf)localObject).m());
        localzamy3.a(2);
        localzamy3.a(((zbxf)localObject).e().a());
        localzamy3.a((zbxf)localObject);
        localzamy3.a(localzamy2.c());
        localzamy3.a(localzamy2.e());
        zzo.a(localzamy2.a(), localzamy3.a());
        a(localzamy3, localzamw2, m);
      }
    }
  }
  
  private static void a(zamy paramzamy, zamw paramzamw, int paramInt)
  {
    if (paramzamw.getCount() == 0)
    {
      paramzamw.a(paramzamy);
    }
    else
    {
      int i = 0;
      for (int j = paramInt; j < paramzamw.getCount(); j++) {
        if (paramzamw.b(j).f() > paramzamy.f())
        {
          paramzamw.a(j, paramzamy);
          i = 1;
          break;
        }
      }
      if (i == 0) {
        paramzamw.a(paramzamy);
      }
    }
  }
  
  static void a(zje paramzje, zbfc paramzbfc)
  {
    zamu localzamu = paramzje.x();
    zamw localzamw1 = localzamu.g();
    zamw localzamw2 = localzamu.f();
    ArrayList localArrayList;
    if (paramzbfc.af() == 1) {
      localArrayList = paramzje.z().c();
    } else {
      localArrayList = paramzje.z().d();
    }
    for (int i = 0; i < paramzbfc.D().getCount(); i++)
    {
      zke localzke = paramzbfc.D().b(i);
      int j = i;
      zamy localzamy = localzamw1.c(j);
      int k = i + 1;
      String str = com.aspose.cells.b.a.zp.a(k);
      Object localObject;
      if (localArrayList.size() > i)
      {
        localObject = (zgm)localArrayList.get(i);
        str = zana.a(paramzje, (zgm)localObject, paramzje.U());
      }
      if (localzamy == null)
      {
        localObject = new zamy(paramzje, localzamu, j);
        ((zamy)localObject).a(str);
        ((zamy)localObject).a(1);
        ((zamy)localObject).a(paramzbfc);
        zzo.a(localzamu.d().k(), ((zamy)localObject).a());
        localzamw2.a((zamy)localObject);
      }
      else if (!localzamy.b())
      {
        localObject = new zamy(paramzje, localzamu, j);
        ((zamy)localObject).a(str);
        ((zamy)localObject).a(1);
        ((zamy)localObject).a(paramzbfc);
        ((zamy)localObject).a(localzamy.c());
        ((zamy)localObject).a(localzamy.e());
        zzo.a(localzamy.a(), ((zamy)localObject).a());
        localzamw2.a((zamy)localObject);
      }
    }
  }
  
  static int a(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++) {
      com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(((zbfc)paramList.get(i)).D().getCount()));
    }
    Collections.sort(localArrayList);
    if (localArrayList.size() == 0) {
      return 0;
    }
    return ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
  }
  
  static boolean a(List paramList, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, zbs paramzbs)
  {
    ArrayList localArrayList = b(paramList);
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    int i = 0;
    for (int j = 0; j < localArrayList.size(); j++)
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      double[] arrayOfDouble1 = { d1 };
      double[] arrayOfDouble2 = { d2 };
      boolean bool = b((ArrayList)localArrayList.get(j), arrayOfDouble1, arrayOfDouble2, paramzbs);
      d1 = arrayOfDouble1[0];
      d2 = arrayOfDouble2[0];
      if ((j == i) && (!bool))
      {
        i++;
      }
      else if (j == i)
      {
        paramArrayOfDouble1[0] = d1;
        paramArrayOfDouble2[0] = d2;
      }
      else
      {
        if (d1 < paramArrayOfDouble1[0]) {
          paramArrayOfDouble1[0] = d1;
        }
        if (d2 > paramArrayOfDouble2[0]) {
          paramArrayOfDouble2[0] = d2;
        }
      }
    }
    if (!paramzbs.M()) {
      paramArrayOfDouble1[0] = (paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D());
    }
    if (!paramzbs.N()) {
      paramArrayOfDouble2[0] = (paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z());
    }
    return c(paramList);
  }
  
  private static ArrayList b(List paramList)
  {
    zbfc localzbfc1 = (zbfc)paramList.get(0);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    Object localObject1 = paramList.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zbfc)((Iterator)localObject1).next();
      if (((zbfc)localObject2).b(new int[] { localzbfc1.m() })) {
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localObject2);
      } else {
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localObject2);
      }
    }
    if (localArrayList3.size() > 0) {
      com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList3);
    }
    localObject1 = new ArrayList();
    if (localArrayList2.size() > 0)
    {
      localzbfc1 = (zbfc)localArrayList2.get(0);
      localObject2 = new ArrayList();
      com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localArrayList2);
      localArrayList2.clear();
      Iterator localIterator = ((Iterable)localObject2).iterator();
      while (localIterator.hasNext())
      {
        zbfc localzbfc2 = (zbfc)localIterator.next();
        if (localzbfc2.b(new int[] { localzbfc1.m() })) {
          com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localzbfc2);
        } else {
          com.aspose.cells.b.a.a.zf.a(localArrayList2, localzbfc2);
        }
      }
    }
    if (((ArrayList)localObject1).size() > 0) {
      com.aspose.cells.b.a.a.zf.a(localArrayList1, localObject1);
    }
    if (localArrayList2.size() > 0) {
      com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList2);
    }
    return localArrayList1;
  }
  
  private static boolean b(ArrayList paramArrayList, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, zbs paramzbs)
  {
    boolean bool = false;
    zbfg localzbfg = new zbfg();
    Collections.sort(paramArrayList, localzbfg);
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    zbfc localzbfc1 = (zbfc)paramArrayList.get(0);
    int i;
    int n;
    double d3;
    double d4;
    int i5;
    zbfc localzbfc4;
    zke localzke3;
    double d8;
    if (localzbfc1.an())
    {
      bool = true;
      if ((localzbfc1.ao()) || (localzbfc1.ap()))
      {
        i = a(paramArrayList);
        for (int j = 0; j < i; j++)
        {
          double d1 = 0.0D;
          for (int i1 = 0; i1 < paramArrayList.size(); i1++)
          {
            zbfc localzbfc2 = (zbfc)paramArrayList.get(i1);
            if (!localzbfc2.an()) {
              break;
            }
            zke localzke1 = localzbfc2.D().b(j);
            if (localzke1 != null)
            {
              double d5 = paramzbs.n() ? localzke1.z() : localzke1.w();
              if (localzbfc1.m() == 4) {
                d5 = Math.abs(d5);
              }
              d1 += d5;
              if ((i1 == 0) && (j == 0))
              {
                paramArrayOfDouble1[0] = d1;
                paramArrayOfDouble2[0] = d1;
              }
              else
              {
                if (d1 < paramArrayOfDouble1[0]) {
                  paramArrayOfDouble1[0] = d1;
                }
                if (d1 > paramArrayOfDouble2[0]) {
                  paramArrayOfDouble2[0] = d1;
                }
              }
            }
          }
        }
      }
      else
      {
        i = a(paramArrayList, paramzbs);
        ArrayList localArrayList = new ArrayList();
        int m = a(paramArrayList);
        for (n = 0; n < m; n++)
        {
          d3 = 0.0D;
          d4 = 0.0D;
          int i2 = 0;
          int i4 = 0;
          for (i5 = 0; i5 < paramArrayList.size(); i5++)
          {
            localzbfc4 = (zbfc)paramArrayList.get(i5);
            if (!localzbfc4.an()) {
              break;
            }
            localzke3 = localzbfc4.D().b(n);
            if (localzke3 != null)
            {
              d8 = paramzbs.n() ? localzke3.z() : localzke3.w();
              if ((i5 == 0) && (n == 0))
              {
                if (i == 1) {
                  paramArrayOfDouble1[0] = d8;
                } else if (i == 2) {
                  paramArrayOfDouble2[0] = d8;
                }
              }
              else if (i5 == 0) {
                if ((i == 1) && (d8 < paramArrayOfDouble1[0])) {
                  paramArrayOfDouble1[0] = d8;
                } else if ((i == 2) && (d8 > paramArrayOfDouble2[0])) {
                  paramArrayOfDouble2[0] = d8;
                }
              }
              if (d8 < 0.0D)
              {
                i4 = 1;
                d4 += d8;
              }
              if (d8 > 0.0D)
              {
                i2 = 1;
                d3 += d8;
              }
            }
          }
          if ((i4 != 0) && (d4 < paramArrayOfDouble1[0])) {
            paramArrayOfDouble1[0] = d4;
          }
          if ((i2 != 0) && (d3 > paramArrayOfDouble2[0])) {
            paramArrayOfDouble2[0] = d3;
          }
        }
      }
      if (paramzbs.n())
      {
        paramArrayOfDouble2[0] = zbxz.e(paramArrayOfDouble2[0]);
        paramArrayOfDouble1[0] = zbxz.e(paramArrayOfDouble1[0]);
      }
    }
    else
    {
      int k;
      if (localzbfc1.aq())
      {
        bool = true;
        double d2;
        if (localzbfc1.ar())
        {
          i = a(paramArrayList);
          for (k = 0; k < i; k++)
          {
            d2 = 0.0D;
            d3 = 0.0D;
            d4 = 0.0D;
            double d6 = 0.0D;
            for (i5 = 0; i5 < paramArrayList.size(); i5++)
            {
              localzbfc4 = (zbfc)paramArrayList.get(i5);
              if (!localzbfc4.aq()) {
                break;
              }
              localzke3 = localzbfc4.D().b(k);
              if (localzke3 != null)
              {
                d8 = localzke3.w();
                if (localzbfc1.m() == 5) {
                  d8 = Math.abs(d8);
                }
                d2 += d8;
                d3 += Math.abs(d8);
                if (d2 < d4) {
                  d4 = d2;
                }
                if (d2 > d6) {
                  d6 = d2;
                }
              }
            }
            if (d3 != 0.0D)
            {
              i5 = (int)(100.0D * d4 / d3);
              if (i5 < paramArrayOfDouble1[0]) {
                paramArrayOfDouble1[0] = i5;
              }
              i5 = (int)(100.0D * d6 / d3);
              if (i5 > paramArrayOfDouble2[0]) {
                paramArrayOfDouble2[0] = i5;
              }
            }
          }
        }
        else
        {
          i = a(paramArrayList);
          for (k = 0; k < i; k++)
          {
            d2 = 0.0D;
            d3 = 0.0D;
            d4 = 0.0D;
            for (int i3 = 0; i3 < paramArrayList.size(); i3++)
            {
              zbfc localzbfc3 = (zbfc)paramArrayList.get(i3);
              if (!localzbfc3.aq()) {
                break;
              }
              zke localzke2 = localzbfc3.D().b(k);
              if (localzke2 != null)
              {
                double d7 = localzke2.w();
                d2 += Math.abs(d7);
                if (d7 < 0.0D) {
                  d4 += d7;
                }
                if (d7 > 0.0D) {
                  d3 += d7;
                }
              }
            }
            if (d2 != 0.0D)
            {
              if ((int)(100.0D * d4 / d2) < paramArrayOfDouble1[0]) {
                paramArrayOfDouble1[0] = ((int)(100.0D * d4 / d2));
              }
              if ((int)(100.0D * d3 / d2) > paramArrayOfDouble2[0]) {
                paramArrayOfDouble2[0] = ((int)(100.0D * d3 / d2));
              }
            }
          }
        }
      }
      else
      {
        i = 1;
        for (k = 0; k < paramArrayList.size(); k++)
        {
          zkg localzkg = ((zbfc)paramArrayList.get(k)).D();
          for (n = 0; n < localzkg.getCount(); n++) {
            if ((localzkg.a(n) == null) || (!localzkg.a(n).a())) {
              if ((localzkg.a(n) != null) && (localzkg.a(n).e()))
              {
                bool = true;
              }
              else
              {
                d3 = localzkg.a(n) == null ? 0.0D : localzkg.a(n).w();
                if (i != 0)
                {
                  paramArrayOfDouble1[0] = d3;
                  paramArrayOfDouble2[0] = d3;
                  bool = true;
                  i = 0;
                }
                else
                {
                  if (d3 < paramArrayOfDouble1[0]) {
                    paramArrayOfDouble1[0] = d3;
                  }
                  if (d3 > paramArrayOfDouble2[0]) {
                    paramArrayOfDouble2[0] = d3;
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool;
  }
  
  static int a(ArrayList paramArrayList, zbs paramzbs)
  {
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramArrayList.size(); k++)
    {
      zkg localzkg = ((zbfc)paramArrayList.get(k)).D();
      for (int m = 0; m < localzkg.getCount(); m++)
      {
        zke localzke = localzkg.b(m);
        if (localzke != null)
        {
          double d1 = paramzbs.n() ? localzke.z() : localzke.w();
          if (d1 > 0.0D) {
            i = 1;
          } else if (d1 < 0.0D) {
            j = 1;
          }
        }
      }
    }
    if ((i != 0) && (j == 0)) {
      return 1;
    }
    if ((i == 0) && (j != 0)) {
      return 2;
    }
    return 3;
  }
  
  private static boolean b(List paramList, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, zbs paramzbs)
  {
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    int i = 1;
    for (int j = 0; j < paramList.size(); j++)
    {
      zbfc localzbfc = (zbfc)paramList.get(j);
      zkg localzkg = localzbfc.D();
      double d1 = 0.0D;
      double d2 = 0.0D;
      int k = 1;
      for (int m = 0; m < localzkg.getCount(); m++) {
        if ((localzkg.a(m) != null) && (!localzkg.a(m).b()))
        {
          double d4 = localzkg.a(m).q();
          if (k != 0)
          {
            d1 = d4;
            d2 = d4;
            k = 0;
          }
          if (d4 < d1) {
            d1 = d4;
          }
          if (d4 > d2) {
            d2 = d4;
          }
        }
      }
      double d3 = 0.0D;
      double d5 = 0.0D;
      for (int n = 0; n < localzbfc.F().getCount(); n++)
      {
        zbxf localzbxf = localzbfc.F().c(n);
        if (localzbxf.d().e())
        {
          if (localzbxf.i() > d3) {
            d3 = localzbxf.i();
          }
          if (localzbxf.f() > d5) {
            d5 = localzbxf.f();
          }
        }
      }
      d1 -= d5;
      d2 += d3;
      if (i != 0)
      {
        paramArrayOfDouble1[0] = d1;
        paramArrayOfDouble2[0] = d2;
        i = 0;
      }
      if (d1 < paramArrayOfDouble1[0]) {
        paramArrayOfDouble1[0] = d1;
      }
      if (d2 > paramArrayOfDouble2[0]) {
        paramArrayOfDouble2[0] = d2;
      }
    }
    if (!paramzbs.M()) {
      paramArrayOfDouble1[0] = (paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D());
    }
    if (!paramzbs.N()) {
      paramArrayOfDouble2[0] = (paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z());
    }
    return d(paramList);
  }
  
  private static boolean a(zje paramzje, List paramList1, List paramList2)
  {
    if ((paramList2.size() <= 0) || (paramList1.size() <= 0)) {
      return false;
    }
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.G();
    zbfc localzbfc1 = (zbfc)paramList1.get(0);
    zbfc localzbfc2 = (zbfc)paramList2.get(0);
    if ((localzbfc1.ag() == 14) || (localzbfc1.ag() == 15) || (localzbfc1.ag() == 16) || (localzbfc1.ag() == 60))
    {
      if ((localzbfc2.ag() != 14) && (localzbfc2.ag() != 15) && (localzbfc2.ag() != 16) && (localzbfc2.ag() != 60)) {
        return false;
      }
    }
    else if ((localzbfc1.ag() == 6) || (localzbfc1.ag() == 7) || (localzbfc1.ag() == 8))
    {
      if ((localzbfc2.ag() != 6) && (localzbfc2.ag() != 7) && (localzbfc2.ag() != 8)) {
        return false;
      }
    }
    else if (localzbfc1.ag() == 57)
    {
      if (localzbfc2.ag() != 57) {
        return false;
      }
    }
    else {
      return false;
    }
    return (!localzbs1.q()) || (!localzbs2.q());
  }
  
  private static zbs j(zje paramzje)
  {
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.G();
    if ((!localzbs1.q()) && (localzbs2.q())) {
      return localzbs2;
    }
    return localzbs1;
  }
  
  private static zbs k(zje paramzje)
  {
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.G();
    if ((!localzbs1.q()) && (localzbs2.q())) {
      return localzbs1;
    }
    return localzbs2;
  }
  
  static boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, zbs paramzbs)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    a(paramArrayList1, arrayOfDouble1, arrayOfDouble2, paramzbs);
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble3 = { d3 };
    double[] arrayOfDouble4 = { d4 };
    a(paramArrayList2, arrayOfDouble3, arrayOfDouble4, paramzbs);
    d3 = arrayOfDouble3[0];
    d4 = arrayOfDouble4[0];
    if (d1 < d3) {
      paramArrayOfDouble1[0] = d1;
    } else {
      paramArrayOfDouble1[0] = d3;
    }
    if (d2 < d4) {
      paramArrayOfDouble2[0] = d4;
    } else {
      paramArrayOfDouble2[0] = d2;
    }
    if (!paramzbs.M()) {
      paramArrayOfDouble1[0] = (paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D());
    }
    if (!paramzbs.N()) {
      paramArrayOfDouble2[0] = (paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z());
    }
    return (c(paramArrayList1)) && (c(paramArrayList2));
  }
  
  static void a(ArrayList paramArrayList, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, zbs paramzbs)
  {
    ArrayList localArrayList = b(paramArrayList);
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    for (int i = 0; i < localArrayList.size(); i++)
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      double[] arrayOfDouble1 = { d1 };
      double[] arrayOfDouble2 = { d2 };
      b((ArrayList)localArrayList.get(i), arrayOfDouble1, arrayOfDouble2, paramzbs);
      d1 = arrayOfDouble1[0];
      d2 = arrayOfDouble2[0];
      if (i == 0)
      {
        paramArrayOfDouble1[0] = d1;
        paramArrayOfDouble2[0] = d2;
      }
      else
      {
        if (d1 < paramArrayOfDouble1[0]) {
          paramArrayOfDouble1[0] = d1;
        }
        if (d2 > paramArrayOfDouble2[0]) {
          paramArrayOfDouble2[0] = d2;
        }
      }
    }
  }
  
  private static void a(zbs paramzbs1, zbs paramzbs2)
  {
    paramzbs1.l = paramzbs2.l;
    paramzbs1.d(paramzbs2.z());
    paramzbs1.f(paramzbs2.D());
    paramzbs1.g(paramzbs2.y());
    paramzbs1.c(paramzbs2.x());
    paramzbs1.i(paramzbs2.C());
    paramzbs1.e(paramzbs2.B());
  }
  
  private static void d(zbs paramzbs)
  {
    paramzbs.a = paramzbs.l;
    paramzbs.b = paramzbs.z();
    paramzbs.c = paramzbs.D();
    paramzbs.d = paramzbs.x();
    paramzbs.e = paramzbs.B();
  }
  
  private static boolean c(List paramList)
  {
    boolean bool = true;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if (!localzbfc.ae()) {
        bool = false;
      }
    }
    return bool;
  }
  
  private static boolean d(List paramList)
  {
    boolean bool = true;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if (!localzbfc.ad()) {
        bool = false;
      }
    }
    return bool;
  }
  
  static void a(zr paramzr, zbs paramzbs, double paramDouble1, double paramDouble2, boolean paramBoolean1, ArrayList paramArrayList, int paramInt, com.aspose.cells.b.a.b.zp paramzp, boolean paramBoolean2, zbfc paramzbfc)
  {
    if (paramzbs.n())
    {
      a(paramzr, paramzbs, paramDouble1, paramDouble2, paramArrayList, paramInt, paramzp, paramBoolean2, paramzbfc);
      return;
    }
    double d1 = paramDouble1;
    double d2 = paramDouble2;
    zje localzje = paramzbs.c();
    boolean bool1 = paramzbs.ac();
    double d3;
    if ((paramDouble1 == paramDouble2) && (paramDouble1 == 0.0D))
    {
      d3 = 1.2D;
      if ((c(paramInt)) || (bool1) || (paramzbs.c().W()) || (e(paramInt)) || (!paramBoolean1)) {
        d3 = 1.0D;
      }
      paramzbs.d(d3);
      paramDouble1 = d3;
      d1 = d3;
      paramzbs.f(0.0D);
      if ((bool1) && ("".equals(paramzbs.G().b())))
      {
        paramzbs.G().a("0.00%");
        paramzbs.G().a(false);
      }
    }
    else if (paramDouble1 <= paramDouble2)
    {
      double[] arrayOfDouble1;
      double[] arrayOfDouble2;
      if ((!paramzbs.N()) && (paramzbs.M()))
      {
        d3 = 0.0D;
        if (paramzbs.O())
        {
          d4 = 0.0D;
          arrayOfDouble1 = new double[] { d3 };
          arrayOfDouble2 = new double[] { d4 };
          a(paramDouble1, arrayOfDouble1, arrayOfDouble2);
          d3 = arrayOfDouble1[0];
          d4 = arrayOfDouble2[0];
        }
        else
        {
          d3 = paramzbs.x();
        }
        if (paramzbs.z() > 0.0D) {
          paramDouble2 = 0.0D;
        } else if (d3 == 0.0D) {
          paramDouble2 = -1.0D;
        } else {
          paramDouble2 = paramDouble1 - Math.abs(d3) * 10.0D;
        }
      }
      else if ((paramzbs.N()) && (!paramzbs.M()))
      {
        d3 = 0.0D;
        if (paramzbs.O())
        {
          d4 = 0.0D;
          arrayOfDouble1 = new double[] { d3 };
          arrayOfDouble2 = new double[] { d4 };
          a(paramDouble2, arrayOfDouble1, arrayOfDouble2);
          d3 = arrayOfDouble1[0];
          d4 = arrayOfDouble2[0];
        }
        else
        {
          d3 = paramzbs.x();
        }
        if (paramzbs.D() < 0.0D) {
          paramDouble1 = 0.0D;
        } else if (d3 == 0.0D) {
          paramDouble1 = 1.0D;
        } else {
          paramDouble1 = paramDouble2 + Math.abs(d3) * 10.0D;
        }
      }
    }
    boolean bool2 = paramzbs.N();
    boolean bool3 = paramzbs.M();
    double d4 = 0.0D;
    int i = 1;
    if (bool1)
    {
      if ((paramDouble1 == 100.0D) && (paramzbs.N())) {
        paramzbs.d(100.0D);
      }
      if ((paramDouble2 == -100.0D) && (paramzbs.M())) {
        paramzbs.f(-100.0D);
      }
    }
    double d5 = 0.0D;
    double d6 = 0.0D;
    double[] arrayOfDouble3 = { d5 };
    double[] arrayOfDouble4 = { d6 };
    double[] arrayOfDouble5 = { paramDouble2 };
    double[] arrayOfDouble6 = { paramDouble1 };
    double[] arrayOfDouble7 = { d4 };
    int[] arrayOfInt = { i };
    a(arrayOfDouble3, arrayOfDouble4, arrayOfDouble5, arrayOfDouble6, arrayOfDouble7, arrayOfInt, paramzbs, paramBoolean2, d1, d2, bool2, bool3, bool1);
    d5 = arrayOfDouble3[0];
    d6 = arrayOfDouble4[0];
    paramDouble2 = arrayOfDouble5[0];
    paramDouble1 = arrayOfDouble6[0];
    d4 = arrayOfDouble7[0];
    i = arrayOfInt[0];
    if (!paramzbs.P())
    {
      if ((!paramzbs.O()) && (paramzbs.x() < paramzbs.B())) {
        throw new IllegalArgumentException("The numbers you specified can't be used because the interval for the minor unittick marks must be less than or equal to the interval for the major unit tick marks!");
      }
      if (d4 < paramzbs.B()) {
        d4 = paramzbs.B();
      }
    }
    a(paramzbs, i, d4, d6, d5, paramArrayList, d1, d2, bool2, bool3, bool1);
    int j = a(paramzr, paramzbs, paramBoolean2, paramzbfc, paramzp);
    int k = 0;
    if (paramzbs.c().W())
    {
      if (paramBoolean2) {
        k = (int)paramzbs.c().N().g();
      } else {
        k = (int)paramzbs.c().N().i();
      }
    }
    else if (paramBoolean2) {
      k = paramzp.e();
    } else {
      k = paramzp.f();
    }
    int m = 0;
    if ((paramzp.f() <= 15) || (paramzp.f() <= localzje.E().G().a().d())) {
      m = 1;
    }
    int n = 3;
    if (m != 0) {
      n = 2;
    }
    double d7 = d4;
    int i1 = paramArrayList.size();
    for (int i2 = j; (paramzbs.O()) && (paramArrayList.size() > n) && (j > k) && (k != 0); i2 = j)
    {
      double d8 = 0.0D;
      double[] arrayOfDouble8 = { d4 };
      double[] arrayOfDouble9 = { d8 };
      a(d4, arrayOfDouble8, arrayOfDouble9);
      d4 = arrayOfDouble8[0];
      d8 = arrayOfDouble9[0];
      d4 *= 10.0D;
      a(paramzbs, i, d4, d6, d5, paramArrayList, d1, d2, bool2, bool3, bool1);
      j = a(paramzr, paramzbs, paramBoolean2, paramzbfc, paramzp);
      if ((d7 == d4) || (i1 == paramArrayList.size()) || (i2 == j))
      {
        if (d4 == d7) {
          break;
        }
        d4 = d7;
        a(paramzbs, i, d4, d6, d5, paramArrayList, d1, d2, bool2, bool3, bool1);
        break;
      }
      d7 = d4;
      i1 = paramArrayList.size();
    }
    if (paramArrayList.size() >= 2)
    {
      paramzbs.d(((Double)paramArrayList.get(0)).doubleValue());
      paramzbs.f(((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue());
      if (paramzbs.O()) {
        paramzbs.c(d4);
      }
      if (paramzbs.P()) {
        paramzbs.e(paramzbs.x() / 5.0D);
      }
    }
  }
  
  private static void a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double[] paramArrayOfDouble3, double[] paramArrayOfDouble4, double[] paramArrayOfDouble5, int[] paramArrayOfInt, zbs paramzbs, boolean paramBoolean1, double paramDouble1, double paramDouble2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = zbxz.a(paramArrayOfDouble4[0], zbxz.g(paramArrayOfDouble4[0]));
    double d6 = zbxz.a(paramArrayOfDouble3[0], zbxz.g(paramArrayOfDouble3[0]));
    double d15;
    if (paramzbs.O())
    {
      int i = 1;
      double[] arrayOfDouble1 = { d3 };
      double[] arrayOfDouble2 = { d1 };
      a(paramArrayOfDouble3[0], arrayOfDouble1, arrayOfDouble2);
      d3 = arrayOfDouble1[0];
      d1 = arrayOfDouble2[0];
      double[] arrayOfDouble3 = { d4 };
      double[] arrayOfDouble4 = { d2 };
      a(paramArrayOfDouble4[0], arrayOfDouble3, arrayOfDouble4);
      d4 = arrayOfDouble3[0];
      d2 = arrayOfDouble4[0];
      paramArrayOfDouble2[0] = (paramArrayOfDouble3[0] < d1 ? paramArrayOfDouble3[0] : d1);
      paramArrayOfDouble1[0] = (paramArrayOfDouble4[0] > d2 ? paramArrayOfDouble4[0] : d2);
      if (Math.abs(d4) > Math.abs(d3)) {
        paramArrayOfDouble5[0] = Math.abs(d4);
      } else {
        paramArrayOfDouble5[0] = Math.abs(d3);
      }
      double d10;
      double d11;
      double d13;
      double[] arrayOfDouble7;
      double[] arrayOfDouble8;
      int k;
      double d17;
      if ((d5 != d6) && (paramArrayOfDouble4[0] > 0.0D) && (paramArrayOfDouble3[0] > 0.0D))
      {
        d10 = zbxz.b(paramArrayOfDouble4[0], paramArrayOfDouble3[0]);
        d11 = 0.0D;
        d13 = 0.0D;
        arrayOfDouble7 = new double[] { d11 };
        arrayOfDouble8 = new double[] { d13 };
        a(d10, arrayOfDouble7, arrayOfDouble8);
        d11 = arrayOfDouble7[0];
        d13 = arrayOfDouble8[0];
        if (paramArrayOfDouble3[0] / d10 >= 5.0D)
        {
          paramArrayOfDouble2[0] = (zbxz.b(paramArrayOfDouble3[0], d13) / 2.0D);
          paramArrayOfDouble3[0] += d13;
          paramArrayOfDouble5[0] = Math.abs(d11);
          if ((paramzbs.d() == 0) || (paramzbs.d() == 2))
          {
            if (zbxz.b(paramArrayOfDouble4[0], paramArrayOfDouble3[0]) / paramArrayOfDouble5[0] >= 9.0D) {
              a(paramArrayOfDouble5);
            }
          }
          else if (zbxz.b(paramArrayOfDouble4[0], paramArrayOfDouble3[0]) / paramArrayOfDouble5[0] >= 8.0D) {
            a(paramArrayOfDouble5);
          }
          d15 = paramArrayOfDouble5[0];
          k = zbxz.g(d15);
          d17 = 0.0D;
          d17 = zbxz.a(Math.floor((3.0D * paramArrayOfDouble3[0] - paramArrayOfDouble4[0]) / (2.0D * paramArrayOfDouble5[0])) * paramArrayOfDouble5[0], k);
          if ((paramzbs.M()) && (paramzbs.N()))
          {
            paramzbs.f(d17);
            paramArrayOfDouble2[0] = d17;
          }
        }
        else
        {
          if (paramzbs.M()) {
            paramArrayOfDouble2[0] = 0.0D;
          }
          if ((paramzbs.M()) && (paramzbs.N()))
          {
            paramzbs.f(0.0D);
          }
          else if ((!paramzbs.M()) && (paramzbs.N()))
          {
            paramArrayOfDouble5[0] = Math.abs(d11);
            for (d15 = paramArrayOfDouble2[0]; d15 <= paramArrayOfDouble4[0]; d15 += paramArrayOfDouble5[0]) {}
            paramArrayOfDouble1[0] = d15;
          }
        }
      }
      else if ((d5 != d6) && (paramArrayOfDouble4[0] < 0.0D) && (paramArrayOfDouble3[0] < 0.0D))
      {
        d10 = paramArrayOfDouble3[0] - paramArrayOfDouble4[0];
        d11 = 0.0D;
        d13 = 0.0D;
        arrayOfDouble7 = new double[] { d11 };
        arrayOfDouble8 = new double[] { d13 };
        a(d10, arrayOfDouble7, arrayOfDouble8);
        d11 = arrayOfDouble7[0];
        d13 = arrayOfDouble8[0];
        if (paramArrayOfDouble3[0] / d10 >= 5.0D)
        {
          paramArrayOfDouble4[0] -= d13 / 2.0D;
          paramArrayOfDouble4[0] += d13;
          paramArrayOfDouble5[0] = Math.abs(d11);
          if ((paramArrayOfDouble4[0] - paramArrayOfDouble3[0]) / paramArrayOfDouble5[0] >= 8.0D) {
            a(paramArrayOfDouble5);
          }
          d15 = paramArrayOfDouble5[0];
          k = zbxz.g(d15);
          for (d17 = 0.0D; d17 - 3.0D * paramArrayOfDouble5[0] > paramArrayOfDouble4[0]; d17 -= paramArrayOfDouble5[0]) {
            d17 = zbxz.a(d17, k);
          }
          if ((paramzbs.N()) && (paramzbs.M()))
          {
            paramzbs.d(d17);
            paramArrayOfDouble1[0] = d17;
          }
        }
        else
        {
          if (paramzbs.N()) {
            paramArrayOfDouble1[0] = 0.0D;
          }
          if ((paramzbs.N()) && (paramzbs.M())) {
            paramzbs.d(0.0D);
          } else if ((!paramzbs.N()) && (paramzbs.M())) {
            paramArrayOfDouble5[0] = Math.abs(d11);
          }
        }
      }
      else if ((d5 != d6) && (paramArrayOfDouble4[0] > 0.0D) && (paramArrayOfDouble3[0] < 0.0D))
      {
        d10 = paramArrayOfDouble4[0] - paramArrayOfDouble3[0];
        d11 = 0.0D;
        d13 = 0.0D;
        arrayOfDouble7 = new double[] { d11 };
        arrayOfDouble8 = new double[] { d13 };
        a(d10, arrayOfDouble7, arrayOfDouble8);
        d11 = arrayOfDouble7[0];
        d13 = arrayOfDouble8[0];
        paramArrayOfDouble5[0] = Math.abs(d11);
        if ((paramArrayOfDouble4[0] - paramArrayOfDouble3[0]) / paramArrayOfDouble5[0] > 9.5D) {
          a(paramArrayOfDouble5);
        }
      }
      if ((paramzbs.N()) && (paramzbs.M()))
      {
        paramArrayOfInt[0] = 3;
        if ((paramArrayOfDouble3[0] == 0.0D) || ((paramArrayOfDouble4[0] == paramArrayOfDouble3[0]) && (paramArrayOfDouble4[0] > 0.0D)))
        {
          paramzbs.f(0.0D);
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = 0.0D;
        }
        if ((paramArrayOfDouble4[0] == 0.0D) || ((paramArrayOfDouble4[0] == paramArrayOfDouble3[0]) && (paramArrayOfDouble4[0] < 0.0D)))
        {
          paramzbs.d(0.0D);
          paramArrayOfInt[0] = 1;
          paramArrayOfDouble1[0] = 0.0D;
        }
      }
      else if ((!paramzbs.N()) && (paramzbs.M()))
      {
        paramArrayOfInt[0] = 1;
        paramArrayOfDouble1[0] = paramzbs.z();
        paramArrayOfDouble4[0] = paramzbs.z();
      }
      else if ((paramzbs.N()) && (!paramzbs.M()))
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbs.D();
        paramArrayOfDouble3[0] = paramzbs.D();
      }
      else
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbs.D();
        paramArrayOfDouble1[0] = paramzbs.z();
        paramArrayOfDouble3[0] = paramzbs.D();
        paramArrayOfDouble4[0] = paramzbs.z();
        d10 = zbxz.b(paramArrayOfDouble4[0], paramArrayOfDouble3[0]);
        d11 = 0.0D;
        d13 = 0.0D;
        arrayOfDouble7 = new double[] { d11 };
        arrayOfDouble8 = new double[] { d13 };
        a(d10, arrayOfDouble7, arrayOfDouble8);
        d11 = arrayOfDouble7[0];
        d13 = arrayOfDouble8[0];
        paramArrayOfDouble5[0] = d11;
      }
      if (((!paramBoolean1) || (d(paramzbs.c().M()))) && (i != 0)) {
        a(paramzbs, paramArrayOfDouble2[0], paramArrayOfDouble1[0], paramArrayOfDouble5, paramArrayOfInt[0], paramDouble1, paramDouble2, paramBoolean2, paramBoolean3, paramBoolean4);
      }
    }
    else
    {
      paramArrayOfDouble5[0] = paramzbs.x();
      paramArrayOfDouble2[0] = paramArrayOfDouble3[0];
      paramArrayOfDouble1[0] = paramArrayOfDouble4[0];
      double d7;
      double d8;
      double d9;
      double[] arrayOfDouble5;
      double[] arrayOfDouble6;
      double d12;
      int j;
      double d14;
      if ((d5 != d6) && (paramArrayOfDouble4[0] > 0.0D) && (paramArrayOfDouble3[0] > 0.0D))
      {
        d7 = paramArrayOfDouble4[0] - paramArrayOfDouble3[0];
        d8 = 0.0D;
        d9 = 0.0D;
        arrayOfDouble5 = new double[] { d8 };
        arrayOfDouble6 = new double[] { d9 };
        a(d7, arrayOfDouble5, arrayOfDouble6);
        d8 = arrayOfDouble5[0];
        d9 = arrayOfDouble6[0];
        if (paramArrayOfDouble3[0] / d7 >= 5.0D)
        {
          paramArrayOfDouble3[0] -= d9 / 2.0D;
          paramArrayOfDouble3[0] += d9;
          d12 = Math.abs(d8);
          j = zbxz.g(d12);
          if ((paramzbs.M()) && (paramzbs.N()))
          {
            d14 = paramArrayOfDouble5[0];
            j = zbxz.g(d14);
            for (d15 = 0.0D; d15 <= paramArrayOfDouble2[0]; d15 += paramArrayOfDouble5[0]) {
              d15 = zbxz.a(d15, j);
            }
            if ((paramzbs.d() == 0) || (paramzbs.d() == 2))
            {
              if (d15 > paramArrayOfDouble3[0]) {
                d15 -= paramArrayOfDouble5[0];
              }
              paramzbs.f(d15);
            }
            else
            {
              paramzbs.f(d15 - paramArrayOfDouble5[0]);
            }
            paramArrayOfDouble3[0] = paramzbs.D();
            paramArrayOfDouble2[0] = paramzbs.D();
          }
        }
        else
        {
          if ((paramzbs.M()) && (paramzbs.N()))
          {
            paramzbs.f(0.0D);
            paramArrayOfDouble3[0] = paramzbs.D();
          }
          paramArrayOfDouble2[0] = 0.0D;
        }
      }
      else if ((d5 != d6) && (paramArrayOfDouble4[0] < 0.0D) && (paramArrayOfDouble3[0] < 0.0D))
      {
        d7 = paramArrayOfDouble3[0] - paramArrayOfDouble4[0];
        d8 = 0.0D;
        d9 = 0.0D;
        arrayOfDouble5 = new double[] { d8 };
        arrayOfDouble6 = new double[] { d9 };
        a(d7, arrayOfDouble5, arrayOfDouble6);
        d8 = arrayOfDouble5[0];
        d9 = arrayOfDouble6[0];
        if (paramArrayOfDouble3[0] / d7 >= 5.0D)
        {
          paramArrayOfDouble4[0] -= d9 / 2.0D;
          paramArrayOfDouble4[0] += d9;
          d12 = Math.abs(d8);
          j = zbxz.g(d12);
          for (d14 = 0.0D; d14 > paramArrayOfDouble1[0]; d14 -= d12) {
            d14 = zbxz.a(d14, j);
          }
          if ((paramzbs.N()) && (paramzbs.M()))
          {
            d15 = paramArrayOfDouble5[0];
            j = zbxz.g(d15);
            for (double d16 = 0.0D; d16 >= d14; d16 -= paramArrayOfDouble5[0]) {
              d16 = zbxz.a(d16, j);
            }
            if ((paramzbs.d() == 0) || (paramzbs.d() == 2)) {
              paramzbs.d(d16);
            } else {
              paramzbs.d(d16 + paramArrayOfDouble5[0]);
            }
            paramArrayOfDouble4[0] = paramzbs.z();
            paramArrayOfDouble1[0] = paramzbs.z();
          }
        }
        else
        {
          if ((paramzbs.N()) && (paramzbs.M()))
          {
            paramzbs.d(0.0D);
            paramArrayOfDouble4[0] = paramzbs.z();
          }
          paramArrayOfDouble1[0] = 0.0D;
        }
      }
      if ((paramzbs.N()) && (paramzbs.M()))
      {
        paramArrayOfInt[0] = 3;
        if (paramArrayOfDouble3[0] == 0.0D)
        {
          paramzbs.f(0.0D);
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = 0.0D;
        }
        if (paramArrayOfDouble4[0] == 0.0D)
        {
          paramzbs.d(0.0D);
          paramArrayOfInt[0] = 1;
          paramArrayOfDouble1[0] = 0.0D;
        }
      }
      else if ((!paramzbs.N()) && (paramzbs.M()))
      {
        paramArrayOfInt[0] = 1;
        paramArrayOfDouble1[0] = paramzbs.z();
        paramArrayOfDouble4[0] = paramzbs.z();
      }
      else if ((paramzbs.N()) && (!paramzbs.M()))
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbs.D();
        paramArrayOfDouble3[0] = paramzbs.D();
      }
      else
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbs.D();
        paramArrayOfDouble1[0] = paramzbs.z();
        paramArrayOfDouble3[0] = paramzbs.D();
        paramArrayOfDouble4[0] = paramzbs.z();
      }
    }
  }
  
  private static boolean l(zje paramzje)
  {
    if ((paramzje.M() == 5) || (paramzje.M() == 4)) {
      return false;
    }
    return (paramzje.W()) || (paramzje.M() == 57) || (paramzje.M() == 59) || (paramzje.M() == 58);
  }
  
  private static void a(zbs paramzbs, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, ArrayList paramArrayList, double paramDouble4, double paramDouble5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    zje localzje = paramzbs.c();
    int i = (d(localzje.M())) && (paramzbs.b()) ? 1 : 0;
    boolean bool = l(paramzbs.c());
    int j = ze.a(zc.a().c());
    paramArrayList.clear();
    double d1;
    double d2;
    int k;
    double d3;
    if (paramInt == 1)
    {
      d1 = paramDouble3;
      d2 = paramDouble1;
      k = zbxz.g(d2);
      while ((d1 >= paramDouble2) || (zbxz.b(paramDouble2, d1) < paramDouble1) || ((paramDouble2 == paramDouble1) && (d1 > 0.0D)) || (paramDouble2 == d1) || ((zbxz.b(paramDouble2, d1) == paramDouble1) && (paramArrayList.size() < 3)))
      {
        d1 = zbxz.a(d1, k);
        if ((!paramzbs.M()) && (d1 < paramzbs.D())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbs.D()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
        d1 -= paramDouble1;
      }
      if ((paramBoolean2) && (paramArrayList.size() > 0))
      {
        d3 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        if ((zbxz.b(paramDouble5, d3) > paramDouble1) && ((d3 != 0.0D) || (i != 0)))
        {
          d3 += paramDouble1;
          if ((paramDouble5 - paramDouble3) / (d3 - paramDouble3) <= 0.9523809523809523D) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
        else if (((paramDouble5 - paramDouble3) / (d3 - paramDouble3) > 0.9523809523809523D) && ((d3 != 0.0D) || (i != 0)))
        {
          d1 = zbxz.a(d3 - paramDouble1, k);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
    }
    else if (paramInt == 2)
    {
      d1 = paramDouble2;
      d2 = paramDouble1;
      k = zbxz.g(d2);
      while ((d1 <= paramDouble3) || (d1 < paramDouble3 + paramDouble1) || ((d1 == paramDouble1) && (paramDouble3 > 0.0D)) || (d1 == paramDouble3) || ((d1 == paramDouble3 + paramDouble1) && (paramArrayList.size() < 3)))
      {
        d1 = zbxz.a(d1, k);
        if ((!paramzbs.N()) && (d1 > paramzbs.z())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbs.z()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
        d1 += paramDouble1;
      }
      if (paramBoolean1)
      {
        d3 = -2.147483648E9D;
        if (paramArrayList.size() > 0) {
          d3 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        }
        if ((zbxz.b(d3, paramDouble4) > paramDouble1) && ((d3 != 0.0D) || (i != 0)))
        {
          d3 -= paramDouble1;
          if ((paramDouble4 - paramDouble2) / (d3 - paramDouble2) <= 0.9523809523809523D) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
        else if (((paramDouble4 - paramDouble2) / (d3 - paramDouble2) > 0.9523809523809523D) && ((d3 != 0.0D) || (i != 0)))
        {
          d1 = zbxz.a(d3 + paramDouble1, k);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
      Collections.reverse(paramArrayList);
    }
    else
    {
      d1 = 0.0D;
      d2 = paramDouble1;
      k = zbxz.g(d2);
      while ((d1 <= paramDouble3) || (zbxz.b(d1, paramDouble3) < paramDouble1) || ((d1 == paramDouble1) && (paramDouble3 > 0.0D)) || (d1 == paramDouble3) || ((zbxz.b(d1, paramDouble3) == paramDouble1) && (paramArrayList.size() < 3)))
      {
        d1 = zbxz.a(d1, k);
        if ((!paramzbs.N()) && (d1 > paramzbs.z())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbs.z()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
        d1 += paramDouble1;
      }
      if (paramBoolean1)
      {
        d3 = -2.147483648E9D;
        if (paramArrayList.size() > 0) {
          d3 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        }
        if (d3 - paramDouble4 > paramDouble1)
        {
          d3 -= paramDouble1;
          if ((paramDouble4 - paramDouble5) / (d3 - paramDouble5) <= 0.9523809523809523D) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
        else if ((paramDouble4 - paramDouble5) / (d3 - paramDouble5) > 0.9523809523809523D)
        {
          d1 = zbxz.a(d3 + paramDouble1, k);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
      Collections.reverse(paramArrayList);
      for (d1 = 0.0D - paramDouble1; (d1 >= paramDouble2) || (zbxz.b(paramDouble2, d1) < paramDouble1) || ((paramDouble2 == paramDouble1) && (d1 > 0.0D)) || (paramDouble2 == d1) || ((zbxz.b(paramDouble2, d1) == paramDouble1) && (paramArrayList.size() < 3)); d1 -= paramDouble1)
      {
        d1 = zbxz.a(d1, k);
        if ((!paramzbs.M()) && (d1 < paramzbs.D())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbs.D()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
      if ((paramBoolean2) && (paramArrayList.size() > 0))
      {
        d3 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        if (paramDouble5 - d3 > paramDouble1)
        {
          d3 += paramDouble1;
          if ((paramDouble5 - paramDouble4) / (d3 - paramDouble4) <= 0.9523809523809523D) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
        else if ((paramDouble5 - paramDouble4) / (d3 - paramDouble4) > 0.9523809523809523D)
        {
          d1 = zbxz.a(d3 - paramDouble1, k);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
    }
    if (paramArrayList.size() >= 2)
    {
      if (((paramBoolean3) || (bool)) && (paramDouble4 > 0.0D) && (((Double)paramArrayList.get(0)).doubleValue() >= paramDouble4 + paramDouble1) && (((Double)paramArrayList.get(0)).doubleValue() != 0.0D) && (paramBoolean1) && (paramArrayList.size() >= 3)) {
        paramArrayList.remove(0);
      }
      if (((paramBoolean3) || (bool)) && (paramDouble5 < 0.0D) && (((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue() <= zbxz.b(paramDouble5, paramDouble1)) && (((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue() != 0.0D) && (paramBoolean2) && (paramArrayList.size() >= 3)) {
        paramArrayList.remove(paramArrayList.size() - 1);
      }
    }
  }
  
  static int a(zr paramzr, zbs paramzbs, boolean paramBoolean, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp)
  {
    if (paramzbs.E() == 3) {
      return 0;
    }
    zje localzje = paramzbs.c();
    int i = paramzbfc.ag();
    zbwu localzbwu = paramzbs.F();
    zke localzke = paramzbfc.D().b(0);
    String str1 = localzke.A();
    boolean bool = localzke.B();
    int j = 0;
    if ((localzbwu.c()) && (localzke != null)) {
      j = 1;
    }
    Object localObject = "";
    for (int k = 0; k < paramzbs.l.size(); k++)
    {
      double d1 = ze.g(paramzbs.l.get(k));
      if (paramzbs.ac())
      {
        d1 /= 100.0D;
        str1 = "0%";
      }
      String str2 = "";
      d1 *= Math.pow(10.0D, paramzbs.Q().f());
      if (j != 0) {
        str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d1), str1, bool, localzje.U());
      } else {
        str2 = zbu.a(paramzbs, Double.valueOf(d1));
      }
      if (str2.length() > ((String)localObject).length()) {
        localObject = str2;
      }
    }
    com.aspose.cells.b.a.b.zs localzs1 = new com.aspose.cells.b.a.b.zs(paramzp.e(), paramzp.f());
    com.aspose.cells.b.a.b.zs localzs2;
    if (localzbwu.e() == 0) {
      localzs2 = zbvx.a(paramzbs.c().ar(), (String)localObject, localzbwu.e(), localzbwu.a(), localzs1, 1, 1);
    } else {
      localzs2 = zbvx.a(paramzbs.c().ar(), (String)localObject, localzbwu.e(), localzbwu.a(), localzs1, 1, 1);
    }
    float f = 0.0F;
    int m = paramzbs.l.size() - 1;
    if (paramBoolean) {
      f = localzs2.b() * m;
    } else {
      f = localzs2.c() * m;
    }
    if ((i == 57) || (i == 58) || (i == 59)) {
      f *= 2.0F;
    }
    return (int)(f + 0.5D);
  }
  
  private static void a(double paramDouble, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    int i = 1;
    if (paramDouble < 0.0D) {
      i = 0;
    }
    paramDouble = Math.abs(paramDouble);
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    if (paramDouble > 1.0D)
    {
      b(paramDouble, paramArrayOfDouble1, paramArrayOfDouble2);
    }
    else
    {
      if (paramDouble == 0.0D) {
        return;
      }
      int j = zbxz.g(paramDouble);
      double d1 = paramDouble * Math.pow(10.0D, j);
      b(d1, paramArrayOfDouble1, paramArrayOfDouble2);
      paramArrayOfDouble1[0] /= Math.pow(10.0D, j);
      paramArrayOfDouble2[0] /= Math.pow(10.0D, j);
    }
    if (i == 0)
    {
      paramArrayOfDouble1[0] = (-paramArrayOfDouble1[0]);
      paramArrayOfDouble2[0] = (-paramArrayOfDouble2[0]);
    }
  }
  
  private static void b(double paramDouble, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    int i = ze.a(zc.a().c());
    paramDouble = Math.abs(paramDouble);
    paramArrayOfDouble1[0] = 1.0D;
    paramArrayOfDouble2[0] = 1.0D;
    String str1 = com.aspose.cells.b.a.zo.b(paramDouble);
    String str2 = "";
    if (str1.indexOf("E") > 0)
    {
      String[] arrayOfString = zw.d(str1, 'E');
      str1 = arrayOfString[0];
      str2 = "E" + arrayOfString[1];
    }
    int j = com.aspose.cells.b.a.zp.a(Character.toString(str1.charAt(0)));
    int k = 0;
    if (str1.length() > 1) {
      if (str1.charAt(1) != i) {
        k = com.aspose.cells.b.a.zp.a(Character.toString(str1.charAt(1)));
      } else {
        k = com.aspose.cells.b.a.zp.a(Character.toString(str1.charAt(2)));
      }
    }
    if (j == 1)
    {
      m = k / 2;
      m++;
      k = m * 2;
      paramArrayOfDouble1[0] = 2.0D;
    }
    else if (j < 5)
    {
      if (k % 5 > 0)
      {
        j++;
        k = 0;
      }
      else
      {
        k = 5;
      }
      paramArrayOfDouble1[0] = 5.0D;
    }
    else
    {
      j++;
      paramArrayOfDouble1[0] = 10.0D;
      k = 0;
    }
    int m = str1.length();
    int n = str1.indexOf(i, 0);
    if (n > 0) {
      m = n;
    }
    if ("".equals(str2))
    {
      paramArrayOfDouble1[0] *= Math.pow(10.0D, m - 2);
      paramArrayOfDouble2[0] = ((j * 10 + k) * Math.pow(10.0D, m - 2));
    }
    else
    {
      paramArrayOfDouble1[0] *= Math.pow(10.0D, m - 2);
      paramArrayOfDouble2[0] = ((j * 10 + k) * Math.pow(10.0D, m - 2));
      paramArrayOfDouble1[0] = ze.g(com.aspose.cells.b.a.zo.b(paramArrayOfDouble1[0]) + str2);
      paramArrayOfDouble2[0] = ze.g(com.aspose.cells.b.a.zo.b(paramArrayOfDouble2[0]) + str2);
    }
  }
  
  private static void a(double[] paramArrayOfDouble)
  {
    int i = ze.a(zc.a().c());
    int j = 1;
    if (paramArrayOfDouble[0] < 0.0D) {
      j = 0;
    }
    paramArrayOfDouble[0] = Math.abs(paramArrayOfDouble[0]);
    int k = 1;
    String str;
    if (paramArrayOfDouble[0] > 1.0D)
    {
      str = com.aspose.cells.b.a.zo.b(paramArrayOfDouble[0]);
      k = com.aspose.cells.b.a.zp.a(Character.toString(str.charAt(0)));
    }
    else if (paramArrayOfDouble[0] == 0.0D)
    {
      paramArrayOfDouble[0] = 0.0D;
      return;
    }
    if (paramArrayOfDouble[0] < 1.0D)
    {
      str = com.aspose.cells.b.a.zo.b(paramArrayOfDouble[0]);
      for (int m = 0; m < str.length(); m++) {
        if ((str.charAt(m) != '0') && (str.charAt(m) != i))
        {
          k = com.aspose.cells.b.a.zp.a(Character.toString(str.charAt(m)));
          break;
        }
      }
    }
    if ((k == 1) || (k == 5)) {
      paramArrayOfDouble[0] = (2.0D * paramArrayOfDouble[0]);
    } else {
      paramArrayOfDouble[0] = (paramArrayOfDouble[0] * 5.0D / 2.0D);
    }
    if (j == 0) {
      paramArrayOfDouble[0] = (-paramArrayOfDouble[0]);
    }
  }
  
  private static void b(double[] paramArrayOfDouble)
  {
    int i = ze.a(zc.a().c());
    int j = 1;
    if (paramArrayOfDouble[0] < 0.0D) {
      j = 0;
    }
    paramArrayOfDouble[0] = Math.abs(paramArrayOfDouble[0]);
    int k = 1;
    String str;
    if (paramArrayOfDouble[0] > 1.0D)
    {
      str = com.aspose.cells.b.a.zo.b(paramArrayOfDouble[0]);
      k = com.aspose.cells.b.a.zp.a(Character.toString(str.charAt(0)));
    }
    else if (paramArrayOfDouble[0] == 0.0D)
    {
      paramArrayOfDouble[0] = 0.0D;
      return;
    }
    if (paramArrayOfDouble[0] < 1.0D)
    {
      str = com.aspose.cells.b.a.zo.b(paramArrayOfDouble[0]);
      for (int m = 0; m < str.length(); m++) {
        if ((str.charAt(m) != '0') && (str.charAt(m) != i))
        {
          k = com.aspose.cells.b.a.zp.a(Character.toString(str.charAt(m)));
          break;
        }
      }
    }
    if ((k == 1) || (k == 2)) {
      paramArrayOfDouble[0] /= 2.0D;
    } else {
      paramArrayOfDouble[0] = (paramArrayOfDouble[0] * 2.0D / 5.0D);
    }
    if (j == 0) {
      paramArrayOfDouble[0] = (-paramArrayOfDouble[0]);
    }
  }
  
  static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 12: 
    case 13: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return true;
    }
    return false;
  }
  
  private static boolean c(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 4: 
    case 7: 
    case 10: 
    case 15: 
    case 19: 
    case 22: 
    case 25: 
    case 29: 
    case 32: 
    case 38: 
    case 41: 
    case 51: 
    case 54: 
      return true;
    }
    return false;
  }
  
  private static boolean d(int paramInt)
  {
    return (paramInt == 13) || (paramInt == 12);
  }
  
  private static boolean e(int paramInt)
  {
    return (paramInt == 57) || (paramInt == 58) || (paramInt == 59);
  }
  
  static void a(zbs paramzbs, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble, int paramInt, double paramDouble3, double paramDouble4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    double d1 = paramDouble1;
    double d2 = paramDouble2;
    int i = (d(paramzbs.c().M())) && (paramzbs.b()) ? 1 : 0;
    boolean bool = l(paramzbs.c());
    double d3 = paramArrayOfDouble[0];
    int j = zbxz.g(d3);
    if (paramInt == 1)
    {
      d4 = paramDouble2;
      if (!paramzbs.M())
      {
        d1 = paramzbs.D();
      }
      else
      {
        while ((d4 >= paramDouble1) || (paramDouble1 - d4 < paramArrayOfDouble[0]))
        {
          d4 = zbxz.a(d4, j);
          d1 = d4;
          d3 = paramArrayOfDouble[0];
          d4 = zbxz.b(d4, d3);
        }
        d3 = paramArrayOfDouble[0];
        if (((paramBoolean3) || (l(paramzbs.c()))) && (d1 <= zbxz.b(paramDouble4, d3)) && (d1 != 0.0D) && (paramBoolean2))
        {
          d3 = paramArrayOfDouble[0];
          d1 = zbxz.c(d1, d3);
          d3 = paramArrayOfDouble[0];
        }
        if (((zbxz.b(paramDouble4, d1) <= paramArrayOfDouble[0]) || ((d1 == 0.0D) && (i == 0))) && ((paramDouble4 - paramDouble2) / (d1 - paramDouble2) > 0.9523809523809523D) && ((d1 != 0.0D) || (i != 0))) {
          d1 = zbxz.a(d1 - paramArrayOfDouble[0], j);
        }
      }
    }
    else if (paramInt == 2)
    {
      d4 = paramDouble1;
      if (!paramzbs.N())
      {
        d2 = paramzbs.z();
      }
      else
      {
        d3 = paramArrayOfDouble[0];
        while ((d4 <= paramDouble2) || (d4 < paramDouble2 + paramArrayOfDouble[0]))
        {
          d4 = zbxz.a(d4, j);
          d2 = d4;
          d4 = zbxz.c(d4, d3);
        }
        if (((paramBoolean3) || (l(paramzbs.c()))) && (d2 >= paramDouble3 + paramArrayOfDouble[0]) && (d2 != 0.0D) && (paramBoolean1)) {
          d2 = zbxz.b(d2, d3);
        }
        if (((zbxz.b(d2, paramDouble3) <= paramArrayOfDouble[0]) || ((d2 == 0.0D) && (i == 0))) && ((paramDouble3 - paramDouble1) / (d2 - paramDouble1) > 0.9523809523809523D) && ((d2 != 0.0D) || (i != 0))) {
          d2 = zbxz.a(d2 + paramArrayOfDouble[0], j);
        }
      }
    }
    else
    {
      d4 = 0.0D;
      if (!paramzbs.M())
      {
        d1 = paramzbs.D();
      }
      else
      {
        d3 = paramArrayOfDouble[0];
        while ((d4 >= paramDouble1) || (paramDouble1 - d4 < paramArrayOfDouble[0]))
        {
          d4 = zbxz.a(d4, j);
          d1 = d4;
          d4 = zbxz.b(d4, d3);
        }
        d3 = paramArrayOfDouble[0];
        if (((paramBoolean3) || (l(paramzbs.c()))) && (d1 <= zbxz.b(paramDouble4, d3)) && (d1 != 0.0D) && (paramBoolean2)) {
          d1 = zbxz.c(d1, d3);
        }
        if (((zbxz.b(paramDouble4, d1) <= paramArrayOfDouble[0]) || (d1 == 0.0D)) && ((paramDouble4 - paramDouble2) / (d1 - paramDouble2) > 0.9523809523809523D) && (d1 != 0.0D)) {
          d1 = zbxz.a(d1 - paramArrayOfDouble[0], j);
        }
      }
      d4 = 0.0D;
      if (!paramzbs.N())
      {
        d2 = paramzbs.D();
      }
      else
      {
        d3 = paramArrayOfDouble[0];
        while ((d4 <= paramDouble2) || (d4 < paramDouble2 + paramArrayOfDouble[0]))
        {
          d4 = zbxz.a(d4, j);
          d2 = d4;
          d4 = zbxz.c(d4, d3);
        }
        if (((paramBoolean3) || (l(paramzbs.c()))) && (d2 >= paramDouble3 + paramArrayOfDouble[0]) && (d2 != 0.0D) && (paramBoolean1)) {
          d2 = zbxz.b(d2, d3);
        }
        if (((zbxz.b(d2, paramDouble3) <= paramArrayOfDouble[0]) || (d2 == 0.0D)) && ((paramDouble3 - paramDouble1) / (d2 - paramDouble1) > 0.9523809523809523D) && (d2 != 0.0D)) {
          d2 = zbxz.a(d2 + paramArrayOfDouble[0], j);
        }
      }
    }
    double d4 = paramArrayOfDouble[0];
    double d5 = (d2 - d1) / paramArrayOfDouble[0];
    int k = d(paramzbs.c().M()) ? 10 : 11;
    if (paramzbs.c().W()) {
      k = 13;
    } else if ((d2 > 0.0D) && (d1 < 0.0D)) {
      k = 12;
    }
    if (d5 >= k)
    {
      a(paramArrayOfDouble);
    }
    else
    {
      b(paramArrayOfDouble);
      if (d2 - d1 > 10.0D * paramArrayOfDouble[0]) {
        paramArrayOfDouble[0] = d4;
      }
    }
  }
  
  static void a(zbs paramzbs, double paramDouble1, double paramDouble2, int paramInt, float paramFloat, boolean paramBoolean1, zbfc paramzbfc, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    zje localzje = paramzbs.c();
    ArrayList localArrayList = paramzbs.l;
    if (paramzbs.E() == 3) {
      return;
    }
    if (localArrayList.size() <= 2) {
      return;
    }
    double d1 = paramDouble1;
    double d2 = paramDouble2;
    if ((paramDouble1 == paramDouble2) && (paramDouble1 == 0.0D))
    {
      paramzbs.d(1.0D);
      paramDouble1 = 1.0D;
      d1 = 1.0D;
      paramzbs.f(0.0D);
      paramBoolean2 = false;
      paramBoolean3 = false;
    }
    if ((paramBoolean1) && (paramBoolean4))
    {
      boolean bool = paramzbs.ac();
      if (bool)
      {
        if ((paramDouble1 == 100.0D) && (paramBoolean2)) {
          paramzbs.d(100.0D);
        }
        if ((paramDouble2 == -100.0D) && (paramBoolean3)) {
          paramzbs.f(-100.0D);
        }
      }
      int i = 1;
      double d3 = ((Double)paramzbs.l.get(paramzbs.l.size() - 1)).doubleValue();
      double d4 = ((Double)paramzbs.l.get(0)).doubleValue();
      if ((paramBoolean2) && (paramBoolean3))
      {
        i = 3;
        if (d3 == 0.0D) {
          i = 2;
        }
        if (d4 == 0.0D) {
          i = 1;
        }
      }
      else if ((!paramBoolean2) && (paramBoolean3))
      {
        i = 1;
      }
      else
      {
        i = 2;
      }
      double d5 = paramzbs.x();
      double[] arrayOfDouble = { d5 };
      a(arrayOfDouble, paramzbs, paramzbfc, paramFloat, i, d3, d4, d1, d2, paramBoolean2, paramBoolean3, bool);
      d5 = arrayOfDouble[0];
      if (localArrayList.size() >= 2) {
        if (paramzbs.n())
        {
          paramzbs.d(zbxz.f(((Double)localArrayList.get(0)).doubleValue()));
          paramzbs.f(zbxz.f(((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue()));
          if (paramzbs.O()) {
            paramzbs.c(zbxz.f(d5));
          }
          if (paramzbs.P()) {
            paramzbs.e(paramzbs.x());
          }
        }
        else
        {
          paramzbs.d(((Double)localArrayList.get(0)).doubleValue());
          paramzbs.f(((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue());
          paramzbs.c(d5);
          if (paramzbs.P()) {
            paramzbs.e(paramzbs.x() / 5.0D);
          }
        }
      }
    }
  }
  
  private static void a(double[] paramArrayOfDouble, zbs paramzbs, zbfc paramzbfc, float paramFloat, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    zje localzje = paramzbs.c();
    ArrayList localArrayList = paramzbs.l;
    if (paramzbs.E() == 3) {
      return;
    }
    if (localArrayList.size() <= 2) {
      return;
    }
    float f1 = 0.0F;
    f1 = paramzbs.F().l();
    float f2 = paramFloat / (paramzbs.l.size() - 1);
    double d1;
    if ((f2 / f1 > 9.0F) && ((l(localzje)) || (!paramBoolean1) || (!paramBoolean2)))
    {
      b(paramArrayOfDouble);
      if (((Double)localArrayList.get(0)).doubleValue() - ((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue() > 11.0D * paramArrayOfDouble[0])
      {
        a(paramArrayOfDouble);
      }
      else
      {
        d1 = paramArrayOfDouble[0];
        b(paramzbs, paramInt, d1, paramDouble1, paramDouble2, localArrayList, paramDouble3, paramDouble4, paramBoolean1, paramBoolean2, paramBoolean3);
      }
    }
    else if (f2 / f1 < 3.0F)
    {
      a(paramArrayOfDouble);
      d1 = paramArrayOfDouble[0];
      b(paramzbs, paramInt, d1, paramDouble1, paramDouble2, localArrayList, paramDouble3, paramDouble4, paramBoolean1, paramBoolean2, paramBoolean3);
      a(paramArrayOfDouble, paramzbs, paramzbfc, paramFloat, paramInt, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramBoolean1, paramBoolean2, paramBoolean3);
    }
  }
  
  private static void b(zbs paramzbs, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, ArrayList paramArrayList, double paramDouble4, double paramDouble5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    zje localzje = paramzbs.c();
    boolean bool = l(paramzbs.c());
    int i = ze.a(zc.a().c());
    paramArrayList.clear();
    double d1;
    int j;
    double d2;
    if (paramInt == 1)
    {
      d1 = paramDouble3;
      j = zbxz.g(paramDouble1);
      while ((d1 >= paramDouble2) || (paramDouble2 - d1 < paramDouble1))
      {
        d1 = zbxz.a(d1, j);
        if ((!paramBoolean2) && (d1 < paramzbs.D())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbs.D()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
        d1 -= paramDouble1;
      }
      if ((paramBoolean2) && (paramArrayList.size() > 0))
      {
        d2 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        if ((paramDouble5 - d2 > paramDouble1) && (d2 != 0.0D))
        {
          d2 += paramDouble1;
          if ((paramDouble5 - paramDouble3) / (d2 - paramDouble3) <= 0.9523809523809523D) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
        else if (((paramDouble5 - paramDouble3) / (d2 - paramDouble3) > 0.9523809523809523D) && (d2 != 0.0D))
        {
          d1 = zbxz.a(d2 - paramDouble1, j);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
    }
    else if (paramInt == 2)
    {
      d1 = paramDouble2;
      j = zbxz.g(paramDouble1);
      while ((d1 <= paramDouble3) || (d1 < paramDouble3 + paramDouble1))
      {
        d1 = zbxz.a(d1, j);
        if ((!paramBoolean1) && (d1 > paramzbs.z())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbs.z()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
        d1 += paramDouble1;
      }
      if (paramBoolean1)
      {
        d2 = -2.147483648E9D;
        if (paramArrayList.size() > 0) {
          d2 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        }
        if ((d2 - paramDouble4 > paramDouble1) && (d2 != 0.0D))
        {
          d2 -= paramDouble1;
          if ((paramDouble4 - paramDouble2) / (d2 - paramDouble2) <= 0.9523809523809523D) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
        else if (((paramDouble4 - paramDouble2) / (d2 - paramDouble2) > 0.9523809523809523D) && (d2 != 0.0D))
        {
          d1 = zbxz.a(d2 + paramDouble1, j);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
      Collections.reverse(paramArrayList);
    }
    else
    {
      d1 = 0.0D;
      j = zbxz.g(paramDouble1);
      while ((d1 <= paramDouble3) || (d1 - paramDouble3 < paramDouble1))
      {
        d1 = zbxz.a(d1, j);
        com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        d1 += paramDouble1;
      }
      if (paramBoolean1)
      {
        d2 = -2.147483648E9D;
        if (paramArrayList.size() > 0) {
          d2 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        }
        if (d2 - paramDouble4 > paramDouble1)
        {
          d2 -= paramDouble1;
          if ((paramDouble4 - paramDouble5) / (d2 - paramDouble5) <= 0.9523809523809523D) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
        else if ((paramDouble4 - paramDouble5) / (d2 - paramDouble5) > 0.9523809523809523D)
        {
          d1 = zbxz.a(d2 + paramDouble1, j);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
      Collections.reverse(paramArrayList);
      for (d1 = 0.0D - paramDouble1; (d1 >= paramDouble2) || (paramDouble2 - d1 < paramDouble1); d1 -= paramDouble1)
      {
        d1 = zbxz.a(d1, j);
        com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
      }
      if ((paramBoolean2) && (paramArrayList.size() > 0))
      {
        d2 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        if (paramDouble5 - d2 > paramDouble1)
        {
          d2 += paramDouble1;
          if ((paramDouble5 - paramDouble4) / (d2 - paramDouble4) <= 0.9523809523809523D) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
        else if ((paramDouble5 - paramDouble4) / (d2 - paramDouble4) > 0.9523809523809523D)
        {
          d1 = zbxz.a(d2 - paramDouble1, j);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
    }
    if (paramArrayList.size() >= 2)
    {
      if (((paramBoolean3) || (l(localzje))) && (((Double)paramArrayList.get(0)).doubleValue() >= paramDouble4 + paramDouble1) && (((Double)paramArrayList.get(0)).doubleValue() != 0.0D) && (paramBoolean1) && (paramArrayList.size() > 3)) {
        paramArrayList.remove(0);
      }
      if (((paramBoolean3) || (l(localzje))) && (((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue() <= paramDouble5 - paramDouble1) && (((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue() != 0.0D) && (paramBoolean2) && (paramArrayList.size() > 3)) {
        paramArrayList.remove(paramArrayList.size() - 1);
      }
    }
  }
  
  static void a(zr paramzr, zbs paramzbs, ArrayList paramArrayList, com.aspose.cells.b.a.b.zp paramzp, int paramInt, zbfe paramzbfe, boolean paramBoolean)
    throws Exception
  {
    paramArrayList.clear();
    zje localzje = paramzbs.c();
    int i = a(paramzbfe.i());
    Object localObject1;
    int k;
    if ((b(paramInt)) && (!paramzbs.p))
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      boolean bool1 = paramzbs.N();
      boolean bool2 = paramzbs.M();
      localObject1 = new double[] { d1 };
      double[] arrayOfDouble1 = { d2 };
      k = b(paramzbfe.i(), (double[])localObject1, arrayOfDouble1, paramzbs);
      d1 = localObject1[0];
      d2 = arrayOfDouble1[0];
      a(paramzr, paramzbs, d2, d1, k, paramArrayList, paramInt, paramzp, true, paramzbfe.c(0));
      return;
    }
    zbfe localzbfe1 = new zbfe(localzje);
    zbfe localzbfe2 = new zbfe(localzje);
    ArrayList localArrayList1 = new ArrayList();
    double d3 = 0.0D;
    if (paramzbs.p)
    {
      Iterator localIterator = paramzbfe.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (zbfc)localIterator.next();
        if (((zbfc)localObject1).ag() == 60) {
          localzbfe1.a((zbfc)localObject1);
        } else {
          localzbfe2.a((zbfc)localObject1);
        }
      }
      double d4 = 0.0D;
      boolean bool3 = paramzbs.N();
      k = paramzbs.M();
      double[] arrayOfDouble2 = { d4 };
      double[] arrayOfDouble3 = { d3 };
      boolean bool4 = b(localzbfe1.i(), arrayOfDouble2, arrayOfDouble3, paramzbs);
      d4 = arrayOfDouble2[0];
      d3 = arrayOfDouble3[0];
      d3 = Math.ceil(d3);
    }
    else
    {
      localzbfe2 = paramzbfe;
    }
    e(paramzbs);
    if (paramzbs.k() == 2)
    {
      a(paramzr, paramzbs, paramzp, paramInt, localzbfe2, paramBoolean);
    }
    else
    {
      ArrayList localArrayList2 = new ArrayList();
      if (paramzbs.d() == 0) {
        localArrayList2 = localzje.z().c();
      } else {
        localArrayList2 = localzje.z().d();
      }
      int j;
      Object localObject2;
      if (localArrayList2.size() > 0)
      {
        for (j = 0; (j < localArrayList2.size()) && (j < i); j++)
        {
          localObject2 = (zgm)localArrayList2.get(j);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, ((zgm)localObject2).a());
        }
        for (j = 0; j < localzbfe2.getCount(); j++)
        {
          localObject2 = localzbfe2.c(j);
          for (k = 0; k < ((zbfc)localObject2).D().getCount(); k++) {
            ((zbfc)localObject2).D().b(k).a(k + 1);
          }
        }
      }
      else if (paramInt == 44)
      {
        for (j = 1; j <= localzbfe2.a(0).k().getCount(); j++)
        {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(j));
          localObject2 = new zgm(null, Integer.valueOf(j));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, localObject2);
        }
      }
      else
      {
        for (j = 1; j <= i; j++)
        {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(j));
          localObject2 = new zgm(null, Integer.valueOf(j));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, localObject2);
        }
        if (paramzbs.p) {
          for (j = i + 1; j <= d3; j++)
          {
            com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(j));
            localObject2 = new zgm(null, Integer.valueOf(j));
            com.aspose.cells.b.a.a.zf.a(localArrayList2, localObject2);
          }
        }
        for (j = 0; j < localzbfe2.getCount(); j++)
        {
          localObject2 = localzbfe2.c(j);
          for (int m = 0; m < ((zbfc)localObject2).D().getCount(); m++) {
            ((zbfc)localObject2).D().b(m).a(m + 1);
          }
        }
      }
      if (paramzbs.p)
      {
        paramzbs.f(1.0D);
        paramzbs.d(i > d3 ? i : d3);
      }
      else
      {
        paramzbs.f(1.0D);
        paramzbs.d(i);
      }
      paramzbs.c(1.0D);
      paramzbs.e(paramzbs.x() / 2.0D);
    }
  }
  
  private static void e(zbs paramzbs)
  {
    if (paramzbs.k() != 0) {
      return;
    }
    zje localzje = paramzbs.c();
    ArrayList localArrayList = new ArrayList();
    ArrayList[] arrayOfArrayList;
    if (paramzbs.d() == 0)
    {
      localArrayList = localzje.z().c();
      arrayOfArrayList = localzje.z().e();
    }
    else
    {
      localArrayList = localzje.z().d();
      arrayOfArrayList = localzje.z().g();
    }
    if (arrayOfArrayList != null) {
      return;
    }
    if (localArrayList.size() > 0)
    {
      zgm localzgm1 = (zgm)localArrayList.get(0);
      if ((localzgm1.f()) && (a(localzje.an(), localzgm1.c(), localzgm1.a())))
      {
        int i = 1;
        for (int j = 1; j < localArrayList.size(); j++)
        {
          zgm localzgm2 = (zgm)localArrayList.get(j);
          if (!localzgm2.g())
          {
            int k = 0;
            if (localzgm2.a() == null) {
              k = 1;
            }
            if (localzgm2.a().equals("")) {
              k = 1;
            }
            if (k == 0)
            {
              int m = 0;
              int n = zaoj.a(localzgm2.a().getClass());
              switch (n)
              {
              case 3: 
              case 9: 
              case 14: 
              case 16: 
                m = 1;
              }
              if (m == 0)
              {
                i = 0;
                break;
              }
            }
            else
            {
              i = 0;
              break;
            }
          }
        }
        if (i != 0) {
          paramzbs.d(2);
        }
      }
    }
  }
  
  static boolean a(zbs paramzbs)
  {
    if (paramzbs.k() != 0) {
      return paramzbs.k() == 2;
    }
    zje localzje = paramzbs.c();
    ArrayList localArrayList = new ArrayList();
    ArrayList[] arrayOfArrayList;
    if (paramzbs.d() == 0)
    {
      localArrayList = localzje.z().c();
      arrayOfArrayList = localzje.z().e();
    }
    else
    {
      localArrayList = localzje.z().d();
      arrayOfArrayList = localzje.z().g();
    }
    if (arrayOfArrayList != null) {
      return false;
    }
    if (localArrayList.size() > 0)
    {
      zgm localzgm1 = (zgm)localArrayList.get(0);
      if ((localzgm1.f()) && (a(localzje.an(), localzgm1.c(), localzgm1.a())))
      {
        int i = 1;
        int j = 1;
        for (int k = 1; k < localArrayList.size(); k++)
        {
          zgm localzgm2 = (zgm)localArrayList.get(k);
          if (!localzgm2.g())
          {
            int m = 0;
            if (localzgm2.a() == null) {
              m = 1;
            }
            if (localzgm2.a().equals("")) {
              m = 1;
            }
            j = 0;
            if (m == 0)
            {
              int n = 0;
              int i1 = zaoj.a(localzgm2.a().getClass());
              switch (i1)
              {
              case 3: 
              case 9: 
              case 14: 
              case 16: 
                n = 1;
                break;
              }
              if (n == 0)
              {
                i = 0;
                break;
              }
            }
            else
            {
              i = 0;
              break;
            }
          }
        }
        if ((i != 0) && (j == 0)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private static boolean a(zzx paramzzx, String paramString, Object paramObject)
  {
    if (paramString == null) {
      return false;
    }
    zahf localzahf = paramzzx.a(paramString, false);
    int i = paramzzx.a(localzahf, paramObject);
    return i == 3;
  }
  
  private static boolean f(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 24: 
    case 25: 
    case 26: 
    case 31: 
    case 32: 
    case 33: 
    case 53: 
    case 54: 
    case 55: 
      return true;
    }
    return false;
  }
  
  private static void a(zr paramzr, zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp, int paramInt, zbfe paramzbfe, boolean paramBoolean)
    throws Exception
  {
    zje localzje = paramzbs.c();
    ArrayList localArrayList1 = paramzbs.l;
    ArrayList localArrayList2 = new ArrayList();
    if (paramzbs.d() == 0) {
      localArrayList2 = localzje.z().c();
    } else {
      localArrayList2 = localzje.z().d();
    }
    int i = a(paramzbfe.i());
    boolean bool = false;
    if (localArrayList2.size() == 0) {
      bool = true;
    }
    ArrayList localArrayList3 = new ArrayList();
    Object localObject1;
    int k;
    if (localArrayList2.size() > 0)
    {
      if (i < localArrayList2.size()) {
        com.aspose.cells.b.a.a.zf.a(localArrayList2, i, localArrayList2.size() - i);
      }
      localObject1 = new ArrayList();
      localObject1 = (ArrayList)localArrayList2.clone();
      k = 1;
      for (int n = 0; n < ((ArrayList)localObject1).size(); n++)
      {
        zgm localzgm2 = (zgm)((ArrayList)localObject1).get(n);
        if (!localzgm2.g())
        {
          k = 0;
          break;
        }
      }
      if (k != 0)
      {
        n = 1;
        for (int i2 = 0; i2 < ((ArrayList)localObject1).size(); i2++)
        {
          zgm localzgm3 = (zgm)((ArrayList)localObject1).get(i2);
          localzgm3.a(Integer.valueOf(n));
          n = zbu.a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), n, localzje.U());
        }
      }
      for (n = 0; n < ((ArrayList)localObject1).size(); n++)
      {
        localObject2 = (zgm)((ArrayList)localObject1).get(n);
        int i4 = a(((zgm)localObject2).a(), paramzbs.c().U());
        if (i4 >= 0)
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, Integer.valueOf(i4));
        }
        else if (!((zgm)localObject2).g())
        {
          bool = true;
          localArrayList3.clear();
          localArrayList2.clear();
          break;
        }
      }
    }
    if (bool)
    {
      localObject1 = "";
      if (paramzbs.j() == 1) {
        localObject1 = "M/d/yyyy";
      } else if (paramzbs.j() == 2) {
        localObject1 = "MMM-yy";
      } else {
        localObject1 = "yyyy";
      }
      for (k = 1; k <= i; k++)
      {
        zgm localzgm1 = new zgm(null, Integer.valueOf(k));
        localzgm1.a(false);
        localzgm1.a((String)localObject1);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localzgm1);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, Integer.valueOf(k));
      }
    }
    for (int j = 0; j < paramzbfe.getCount(); j++)
    {
      zbfc localzbfc = paramzbfe.c(j);
      for (i1 = 0; i1 < localArrayList2.size(); i1++)
      {
        localObject2 = localzbfc.D().b(i1);
        if (localObject2 != null)
        {
          zgm localzgm4 = (zgm)localArrayList2.get(i1);
          int i5 = a(localzgm4.a(), paramzbs.c().U());
          ((zke)localObject2).a(i5);
        }
      }
    }
    ArrayList localArrayList4 = new ArrayList();
    com.aspose.cells.b.a.a.zf.a(localArrayList4, localArrayList3);
    Collections.sort(localArrayList4);
    if ((paramzbs.N()) && (localArrayList4.size() > 0)) {
      paramzbs.d(zbu.a(paramzbs.j(), ((Integer)localArrayList4.get(localArrayList4.size() - 1)).intValue(), localzje.U()));
    }
    if ((paramzbs.M()) && (localArrayList4.size() > 0)) {
      paramzbs.f(zbu.a(paramzbs.j(), ((Integer)localArrayList4.get(0)).intValue(), localzje.U()));
    }
    if ((paramzbs.r()) && (localArrayList4.size() > 0))
    {
      m = b(localArrayList4, localzje.U());
      paramzbs.c(m);
    }
    a(paramzr, paramzbs, paramzp, paramInt, paramBoolean, bool);
    int m = (int)paramzbs.D();
    int i1 = (int)paramzbs.z();
    Object localObject2 = m;
    localArrayList1.clear();
    com.aspose.cells.b.a.a.zf.a(localArrayList1, Integer.valueOf(m));
    int i3 = zbu.a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), localObject2, localzje.U());
    double d1 = m;
    if ((m + paramzbs.x() == 60.0D) && (i3 == 61)) {}
    for (i3 = 60; i1 - i3 >= 0; i3 = 60)
    {
      label805:
      com.aspose.cells.b.a.a.zf.a(localArrayList1, Integer.valueOf(i3));
      d1 = i3;
      i3 = zbu.a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), i3, localzje.U());
      if ((d1 + paramzbs.x() != 60.0D) || (i3 != 61)) {
        break label805;
      }
    }
  }
  
  private static int b(List paramList, boolean paramBoolean)
  {
    if (paramList.size() == 1) {
      return 1;
    }
    int i = 3;
    int j = 28;
    for (int k = 0; k < paramList.size() - 1; k++)
    {
      DateTime localDateTime1 = zbu.a(((Integer)paramList.get(k)).intValue(), paramBoolean);
      DateTime localDateTime2 = zbu.a(((Integer)paramList.get(k + 1)).intValue(), paramBoolean);
      if (zk.b(localDateTime1.addDays(j), localDateTime2)) {
        i = 1;
      } else if ((zk.b(localDateTime1.addYears(1), localDateTime2)) && (i == 3)) {
        i = 2;
      }
    }
    return i;
  }
  
  static int a(Object paramObject, boolean paramBoolean)
    throws Exception
  {
    int i = 55536;
    if (paramObject == null) {
      return i;
    }
    switch (zaoj.a(paramObject.getClass()))
    {
    case 18: 
      return zbxz.a(paramObject, i);
    case 3: 
    case 9: 
    case 14: 
      return ze.f(paramObject);
    case 16: 
      DateTime localDateTime = ze.h(paramObject);
      return zbu.a(localDateTime, paramBoolean);
    }
    return zbxz.a(paramObject, i);
  }
  
  private static void a(zr paramzr, zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    zje localzje = paramzbs.c();
    float f1 = 0.0F;
    String str = zbu.a(paramzbs, Double.valueOf(paramzbs.z()));
    zt localzt = new zt(paramzp.e(), paramzp.f());
    boolean bool = paramzbs.F().j();
    com.aspose.cells.b.a.b.zs localzs = zbvx.b(localzje.ar(), str, 0, paramzbs.F().a(), localzt, 1, 1);
    float f3;
    float f2;
    if (paramBoolean1)
    {
      f3 = paramzp.f();
      if (bool) {
        f2 = localzs.c();
      } else {
        f2 = localzs.c();
      }
    }
    else
    {
      f3 = paramzp.e();
      if (bool) {
        f2 = localzs.b();
      } else if (paramzbs.F().e() == 0) {
        f2 = localzs.b();
      } else if ((paramzbs.F().e() == 90) || (paramzbs.F().e() == -90)) {
        f2 = localzs.c();
      } else {
        f2 = (float)(localzs.c() / Math.sin(Math.abs(paramzbs.F().e()) * 3.141592653589793D / 180.0D));
      }
    }
    int j = (int)paramzbs.z();
    int k = (int)paramzbs.D();
    int m = paramzbs.j();
    int i;
    if ((paramzbs.f()) || (localzje.u()))
    {
      i = zbu.a(m, j, k, paramzbs.c().U()) + 1;
    }
    else
    {
      i = zbu.a(m, j, k, paramzbs.c().U());
      if (i == 0) {
        i = 1;
      }
    }
    label459:
    int n;
    int i1;
    if ((paramzbs.O()) && (paramzbs.P()))
    {
      for (;;)
      {
        if (i * (f2 + f1) < f3)
        {
          paramzbs.c(1.0D);
          paramzbs.e(1.0D);
          paramzbs.g(paramzbs.j());
          paramzbs.i(paramzbs.j());
          return;
        }
        if ((!bool) || (paramBoolean2)) {
          break label459;
        }
        if (paramzbs.F().e() != 0) {
          break;
        }
        paramzbs.F().b(45);
        f2 = (float)(localzs.c() / Math.sin(Math.abs(paramzbs.F().e()) * 3.141592653589793D / 180.0D));
      }
      if (paramzbs.F().e() == 45)
      {
        paramzbs.F().b(90);
        f2 = localzs.c();
      }
      if ((bool) && (!paramBoolean2) && (paramzbs.F().e() > 0)) {
        f2 *= 2.0F;
      }
      n = (int)(f3 / (f2 + f1));
      i1 = i % n == 0 ? i / n : i / n + 1;
      if (paramzbs.j() == 1)
      {
        if (i1 <= 2)
        {
          paramzbs.c(i1);
          paramzbs.e(1.0D);
          paramzbs.g(paramzbs.j());
          paramzbs.i(paramzbs.j());
        }
        else if ((i1 > 2) && (i1 <= 7))
        {
          paramzbs.c(7.0D);
          paramzbs.e(1.0D);
          paramzbs.g(paramzbs.j());
          paramzbs.i(paramzbs.j());
        }
        else if ((i1 > 7) && (i1 <= 14))
        {
          paramzbs.c(14.0D);
          paramzbs.e(7.0D);
          paramzbs.g(paramzbs.j());
          paramzbs.i(paramzbs.j());
        }
        else if ((i1 > 14) && (i1 <= 30))
        {
          paramzbs.c(1.0D);
          paramzbs.e(1.0D);
          paramzbs.g(2);
          paramzbs.i(2);
        }
        else if ((i1 > 30) && (i1 <= 360))
        {
          paramzbs.c(i1 % 30 == 0 ? i1 / 30 : i1 / 30 + 1);
          paramzbs.e((int)(paramzbs.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbs.x() / 2.0D));
          paramzbs.g(2);
          paramzbs.i(2);
        }
        else
        {
          paramzbs.c(i1 % 360 == 0 ? i1 / 360 : i1 / 360 + 1);
          paramzbs.e((int)(paramzbs.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbs.x() / 2.0D));
          paramzbs.g(3);
          paramzbs.i(3);
        }
      }
      else if (paramzbs.j() == 2)
      {
        if (i1 < 12)
        {
          paramzbs.c(i1);
          paramzbs.e((int)(paramzbs.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbs.x() / 2.0D));
          paramzbs.g(2);
          paramzbs.i(2);
        }
        else
        {
          paramzbs.c(i1 % 12 == 0 ? i1 / 12 : i1 / 12 + 1);
          paramzbs.e((int)(paramzbs.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbs.x() / 2.0D));
          paramzbs.g(3);
          paramzbs.i(3);
        }
      }
      else
      {
        paramzbs.c(i1);
        paramzbs.e((int)(paramzbs.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbs.x() / 2.0D));
        paramzbs.g(3);
        paramzbs.i(3);
      }
    }
    else if ((paramzbs.O()) && (!paramzbs.P()))
    {
      n = zbxz.a((float)(zbu.b(paramzbs.C(), j, k, paramzbs.c().U()) / paramzbs.B()));
      if ((paramzbs.f()) || (localzje.u()))
      {
        i = n + 1;
      }
      else
      {
        i = n;
        if (i == 0) {
          i = 1;
        }
      }
      for (;;)
      {
        if (i * (f2 + f1) < f3)
        {
          paramzbs.g(paramzbs.C());
          paramzbs.c(paramzbs.B());
          return;
        }
        if ((!bool) || (paramBoolean2)) {
          break label1251;
        }
        if (paramzbs.F().e() != 0) {
          break;
        }
        paramzbs.F().b(45);
        f2 = (float)(localzs.c() / Math.sin(Math.abs(paramzbs.F().e()) * 3.141592653589793D / 180.0D));
      }
      if (paramzbs.F().e() == 45)
      {
        paramzbs.F().b(90);
        f2 = localzs.c();
      }
      label1251:
      if ((bool) && (!paramBoolean2) && (paramzbs.F().e() > 0)) {
        f2 *= 2.0F;
      }
      i1 = (int)(f3 / (f2 + f1));
      int i2 = i % i1 == 0 ? i / i1 : i / i1 + 1;
      if (paramzbs.j() == 1)
      {
        if (i2 <= 2)
        {
          if (paramzbs.C() > paramzbs.j())
          {
            paramzbs.g(paramzbs.C());
            paramzbs.c(paramzbs.B());
          }
          else
          {
            paramzbs.g(paramzbs.j());
            paramzbs.c(i2);
            if (paramzbs.x() < paramzbs.B()) {
              paramzbs.c(paramzbs.B());
            }
          }
        }
        else if ((i2 > 2) && (i2 <= 7))
        {
          if (paramzbs.C() > paramzbs.j())
          {
            paramzbs.g(paramzbs.C());
            paramzbs.c(paramzbs.B());
          }
          else
          {
            paramzbs.g(paramzbs.j());
            paramzbs.c(7.0D);
            if (paramzbs.x() < paramzbs.B()) {
              paramzbs.c(paramzbs.B());
            }
          }
        }
        else if ((i2 > 7) && (i2 <= 14))
        {
          if (paramzbs.C() > paramzbs.j())
          {
            paramzbs.g(paramzbs.C());
            paramzbs.c(paramzbs.B());
          }
          else
          {
            paramzbs.g(paramzbs.j());
            paramzbs.c(14.0D);
            if (paramzbs.x() < paramzbs.B()) {
              paramzbs.c(paramzbs.B());
            }
          }
        }
        else if ((i2 > 14) && (i2 <= 30))
        {
          if (paramzbs.C() == 3)
          {
            paramzbs.g(paramzbs.C());
            paramzbs.c(paramzbs.B());
          }
          else
          {
            paramzbs.g(2);
            paramzbs.c(1.0D);
            if ((paramzbs.x() < paramzbs.B()) && (paramzbs.C() == 2)) {
              paramzbs.c(paramzbs.B());
            }
          }
        }
        else if ((i2 > 30) && (i2 <= 360))
        {
          if (paramzbs.C() == 3)
          {
            paramzbs.g(paramzbs.C());
            paramzbs.c(paramzbs.B());
          }
          else
          {
            paramzbs.g(2);
            paramzbs.c(i2 % 30 == 0 ? i2 / 30 : i2 / 30 + 1);
            if ((paramzbs.x() < paramzbs.B()) && (paramzbs.C() == 2)) {
              paramzbs.c(paramzbs.B());
            }
          }
        }
        else
        {
          paramzbs.c(i2 % 360 == 0 ? i2 / 360 : i2 / 360 + 1);
          paramzbs.g(3);
          if ((paramzbs.x() < paramzbs.B()) && (paramzbs.C() == 3)) {
            paramzbs.c(paramzbs.B());
          }
        }
      }
      else if (paramzbs.j() == 2)
      {
        if (i2 < 12)
        {
          if (paramzbs.C() == 2)
          {
            if (paramzbs.B() <= i2)
            {
              paramzbs.c(i2);
              paramzbs.g(2);
            }
            else
            {
              paramzbs.c(paramzbs.B());
              paramzbs.g(2);
            }
          }
          else
          {
            paramzbs.c(paramzbs.B());
            paramzbs.g(3);
          }
        }
        else
        {
          i2 = i2 % 12 == 0 ? i2 / 12 : i2 / 12 + 1;
          if (paramzbs.C() == 2)
          {
            paramzbs.c(i2);
            paramzbs.g(3);
          }
          else if (paramzbs.B() <= i2)
          {
            paramzbs.c(i2);
            paramzbs.g(3);
          }
          else
          {
            paramzbs.c(paramzbs.B());
            paramzbs.g(3);
          }
        }
      }
      else
      {
        if (paramzbs.B() <= i2) {
          paramzbs.c(i2);
        } else {
          paramzbs.c(paramzbs.B());
        }
        paramzbs.g(3);
      }
    }
    else if ((!paramzbs.O()) && (paramzbs.P()))
    {
      paramzbs.e((int)(paramzbs.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbs.x() / 2.0D));
      paramzbs.i(paramzbs.y());
      if ((bool) && (!paramBoolean2))
      {
        n = zbxz.a((float)(zbu.b(paramzbs.y(), j, k, paramzbs.c().U()) / paramzbs.x()));
        if ((paramzbs.f()) || (localzje.u()))
        {
          i = n + 1;
        }
        else
        {
          i = n;
          if (i == 0) {
            i = 1;
          }
        }
        while (i * (f2 + f1) > f3) {
          if (paramzbs.F().e() == 0)
          {
            paramzbs.F().b(45);
            f2 = (float)(localzs.c() / Math.sin(Math.abs(paramzbs.F().e()) * 3.141592653589793D / 180.0D));
          }
          else if (paramzbs.F().e() == 45)
          {
            paramzbs.F().b(90);
          }
        }
      }
    }
    else if ((bool) && (!paramBoolean2))
    {
      n = zbxz.a((float)(zbu.b(paramzbs.y(), j, k, paramzbs.c().U()) / paramzbs.x()));
      if ((paramzbs.f()) || (localzje.u()))
      {
        i = n + 1;
      }
      else
      {
        i = n;
        if (i == 0) {
          i = 1;
        }
      }
      while (i * (f2 + f1) > f3) {
        if (paramzbs.F().e() == 0)
        {
          paramzbs.F().b(45);
          f2 = (float)(localzs.c() / Math.sin(Math.abs(paramzbs.F().e()) * 3.141592653589793D / 180.0D));
        }
        else if (paramzbs.F().e() == 45)
        {
          paramzbs.F().b(90);
        }
      }
    }
  }
  
  static ArrayList a(List paramList, boolean paramBoolean)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      int j = a(((zgm)paramList.get(i)).a(), paramBoolean);
      com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(j));
    }
    return localArrayList;
  }
  
  static void a(zr paramzr, zbs paramzbs, double paramDouble1, double paramDouble2, ArrayList paramArrayList, int paramInt, com.aspose.cells.b.a.b.zp paramzp, boolean paramBoolean, zbfc paramzbfc)
  {
    double d1 = paramDouble1;
    double d2 = paramDouble2;
    zje localzje = paramzbs.c();
    if ((paramDouble1 == paramDouble2) && (paramDouble1 == 0.0D))
    {
      paramzbs.d(10.0D);
      paramDouble1 = 10.0D;
      d1 = 10.0D;
      paramzbs.f(1.0D);
    }
    boolean bool1 = paramzbs.N();
    boolean bool2 = paramzbs.M();
    double d3 = 0.0D;
    int i = 1;
    boolean bool3 = paramzbfc.aq();
    if (bool3)
    {
      if ((paramDouble1 == 100.0D) && (paramzbs.N())) {
        paramzbs.d(100.0D);
      }
      if ((paramDouble2 >= 1.0D) && (paramzbs.M())) {
        paramzbs.f(1.0D);
      }
    }
    double d4 = 0.0D;
    double d5 = 0.0D;
    double[] arrayOfDouble1 = { d4 };
    double[] arrayOfDouble2 = { d5 };
    double[] arrayOfDouble3 = { paramDouble2 };
    double[] arrayOfDouble4 = { paramDouble1 };
    double[] arrayOfDouble5 = { d3 };
    int[] arrayOfInt = { i };
    a(arrayOfDouble1, arrayOfDouble2, arrayOfDouble3, arrayOfDouble4, arrayOfDouble5, arrayOfInt, paramzbs, paramBoolean);
    d4 = arrayOfDouble1[0];
    d5 = arrayOfDouble2[0];
    paramDouble2 = arrayOfDouble3[0];
    paramDouble1 = arrayOfDouble4[0];
    d3 = arrayOfDouble5[0];
    i = arrayOfInt[0];
    c(paramzbs, i, d3, d5, d4, paramArrayList, d1, d2, bool1, bool2, bool3);
    int j = b(paramzr, paramzbs, paramBoolean, paramzbfc, paramzp);
    int k = 0;
    if (paramzbs.c().W())
    {
      if (paramBoolean) {
        k = (int)paramzbs.c().N().g();
      } else {
        k = (int)paramzbs.c().N().i();
      }
    }
    else if (paramBoolean) {
      k = paramzp.e();
    } else {
      k = paramzp.f();
    }
    while ((paramzbs.O()) && (paramArrayList.size() > 3) && (j > k) && (k != 0))
    {
      d3 += 1.0D;
      c(paramzbs, i, d3, d5, d4, paramArrayList, d1, d2, bool1, bool2, bool3);
      j = b(paramzr, paramzbs, paramBoolean, paramzbfc, paramzp);
    }
    if (paramArrayList.size() >= 2)
    {
      paramzbs.d(zbxz.f(((Double)paramArrayList.get(0)).doubleValue()));
      paramzbs.f(zbxz.f(((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue()));
      if (paramzbs.O()) {
        paramzbs.c(zbxz.f(d3));
      }
      if (paramzbs.P()) {
        paramzbs.e(paramzbs.x());
      }
    }
  }
  
  private static void a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double[] paramArrayOfDouble3, double[] paramArrayOfDouble4, double[] paramArrayOfDouble5, int[] paramArrayOfInt, zbs paramzbs, boolean paramBoolean)
  {
    if ((!paramzbs.O()) && (zbxz.e(paramzbs.x()) == 0.0D)) {
      paramzbs.i(true);
    }
    if ((!paramzbs.P()) && (zbxz.e(paramzbs.B()) == 0.0D)) {
      paramzbs.j(true);
    }
    paramArrayOfDouble5[0] = 1.0D;
    double d1;
    double d2;
    if (paramzbs.O())
    {
      d1 = b(paramArrayOfDouble3[0]);
      d2 = a(paramArrayOfDouble4[0]);
      paramArrayOfDouble2[0] = d1;
      paramArrayOfDouble1[0] = d2;
      if ((paramzbs.N()) && (paramzbs.M()))
      {
        paramArrayOfInt[0] = 3;
        if ((d1 >= 0.0D) && (d2 >= 0.0D))
        {
          paramzbs.f(zbxz.f(0.0D));
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = 0.0D;
        }
        else
        {
          paramzbs.f(zbxz.f(d1));
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = d1;
        }
      }
      else if ((!paramzbs.N()) && (paramzbs.M()))
      {
        paramArrayOfInt[0] = 1;
        paramArrayOfDouble1[0] = zbxz.e(paramzbs.z());
        paramArrayOfDouble4[0] = paramArrayOfDouble1[0];
      }
      else if ((paramzbs.N()) && (!paramzbs.M()))
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = zbxz.e(paramzbs.D());
        paramArrayOfDouble3[0] = paramArrayOfDouble2[0];
      }
      else
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = zbxz.e(paramzbs.D());
        paramArrayOfDouble1[0] = zbxz.e(paramzbs.z());
        paramArrayOfDouble3[0] = zbxz.e(paramzbs.D());
        paramArrayOfDouble4[0] = zbxz.e(paramzbs.z());
      }
    }
    else
    {
      paramArrayOfDouble5[0] = zbxz.e(paramzbs.x());
      d1 = (int)paramArrayOfDouble3[0];
      d2 = (int)paramArrayOfDouble4[0] + paramArrayOfDouble5[0];
      paramArrayOfDouble2[0] = d1;
      paramArrayOfDouble1[0] = d2;
      if ((paramzbs.N()) && (paramzbs.M()))
      {
        paramArrayOfInt[0] = 3;
        if ((d1 >= 0.0D) && (d2 >= 0.0D))
        {
          paramzbs.f(zbxz.f(0.0D));
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = 0.0D;
        }
        else
        {
          paramzbs.f(zbxz.f(d1));
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = d1;
        }
      }
      else if ((!paramzbs.N()) && (paramzbs.M()))
      {
        paramArrayOfInt[0] = 1;
        paramArrayOfDouble1[0] = zbxz.e(paramzbs.z());
        paramArrayOfDouble4[0] = paramArrayOfDouble1[0];
      }
      else if ((paramzbs.N()) && (!paramzbs.M()))
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = zbxz.e(paramzbs.D());
        paramArrayOfDouble3[0] = paramArrayOfDouble2[0];
      }
      else
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = zbxz.e(paramzbs.D());
        paramArrayOfDouble1[0] = zbxz.e(paramzbs.z());
        paramArrayOfDouble3[0] = zbxz.e(paramzbs.D());
        paramArrayOfDouble4[0] = zbxz.e(paramzbs.z());
      }
    }
  }
  
  private static void c(zbs paramzbs, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, ArrayList paramArrayList, double paramDouble4, double paramDouble5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    paramArrayList.clear();
    double d1;
    if (paramInt == 1)
    {
      for (d1 = paramDouble3; (d1 >= paramDouble2) || (zbxz.b(paramDouble2, d1) < paramDouble1); d1 -= paramDouble1) {
        if ((!paramzbs.M()) && (d1 < paramzbs.T())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbs.T()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
    }
    else if (paramInt == 2)
    {
      for (d1 = paramDouble2; (d1 <= paramDouble3) || (d1 < paramDouble3 + paramDouble1); d1 += paramDouble1) {
        if ((!paramzbs.N()) && (d1 > paramzbs.S())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbs.S()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
      Collections.reverse(paramArrayList);
    }
    else
    {
      for (d1 = 0.0D; (d1 <= paramDouble3) || (zbxz.b(d1, paramDouble3) < paramDouble1); d1 += paramDouble1) {
        if ((!paramzbs.N()) && (d1 > paramzbs.S())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbs.S()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
      Collections.reverse(paramArrayList);
      for (d1 = 0.0D - paramDouble1; (d1 >= paramDouble2) || (zbxz.b(paramDouble2, d1) < paramDouble1); d1 -= paramDouble1) {
        if ((!paramzbs.M()) && (d1 < paramzbs.T())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbs.T()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
    }
  }
  
  private static int b(zr paramzr, zbs paramzbs, boolean paramBoolean, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp)
  {
    if (paramzbs.E() == 3) {
      return 0;
    }
    zje localzje = paramzbs.c();
    zbwu localzbwu = paramzbs.F();
    zke localzke = paramzbfc.D().b(0);
    String str1 = localzke.A();
    boolean bool = localzke.B();
    int i = 0;
    if ((localzbwu.c()) && (localzke != null)) {
      i = 1;
    }
    int j = 0;
    for (int k = 0; k < paramzbs.l.size(); k++)
    {
      double d1 = zbxz.f(((Double)paramzbs.l.get(k)).doubleValue());
      if (paramzbfc.aq())
      {
        d1 /= 100.0D;
        str1 = "0%";
      }
      String str2 = "";
      if (i != 0) {
        str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d1), str1, bool, localzje.U());
      } else {
        str2 = zbu.a(paramzbs, Double.valueOf(d1));
      }
      com.aspose.cells.b.a.b.zs localzs1 = new com.aspose.cells.b.a.b.zs(paramzp.e(), paramzp.f());
      com.aspose.cells.b.a.b.zs localzs2 = zbvx.b(paramzbs.c().ar(), str2, localzbwu.e(), localzbwu.a(), localzs1, 1, 1);
      if (paramBoolean)
      {
        if ((k == 0) || (k == paramzbs.l.size() - 1)) {
          j += localzs2.b() / 2;
        } else {
          j += localzs2.b();
        }
      }
      else if ((k == 0) || (k == paramzbs.l.size() - 1)) {
        j += localzs2.c() / 2;
      } else {
        j += localzs2.c();
      }
      if ((k == 0) || (k == paramzbs.l.size() - 1)) {
        j--;
      } else {
        j -= 2;
      }
    }
    return (int)(j + 0.5D);
  }
  
  private static double a(double paramDouble)
  {
    int i = 1;
    if (paramDouble < 0.0D) {
      i = 0;
    }
    paramDouble = Math.abs(paramDouble);
    if (i != 0)
    {
      d1 = zbxz.b(paramDouble);
      if (d1 != paramDouble) {
        d1 += 1.0D;
      }
      return d1;
    }
    double d1 = zbxz.b(paramDouble);
    return -d1;
  }
  
  private static double b(double paramDouble)
  {
    int i = 1;
    if (paramDouble < 0.0D) {
      i = 0;
    }
    paramDouble = Math.abs(paramDouble);
    if (i == 0)
    {
      d1 = zbxz.b(paramDouble);
      if (d1 != paramDouble) {
        d1 += 1.0D;
      }
      return -d1;
    }
    double d1 = zbxz.b(paramDouble);
    return d1;
  }
  
  private static boolean m(zje paramzje)
  {
    zaje localzaje;
    for (int i = 0; i < paramzje.A().getCount(); i++)
    {
      localzaje = paramzje.A().a(i);
      if ((localzaje.m() == 57) || (localzaje.m() == 59) || (localzaje.m() == 58)) {
        return false;
      }
    }
    for (i = 0; i < paramzje.A().getCount(); i++)
    {
      localzaje = paramzje.A().a(i);
      if (localzaje.j()) {
        return true;
      }
    }
    return false;
  }
  
  private static void a(zagv paramzagv1, zagv paramzagv2)
  {
    if (paramzagv1.q()) {
      return;
    }
    paramzagv1.a(paramzagv2.f());
    paramzagv1.d(paramzagv2.k());
    paramzagv1.e(paramzagv2.r());
    if (!paramzagv2.r()) {
      paramzagv1.c(paramzagv2.j());
    }
    paramzagv1.g(paramzagv2.y());
    paramzagv1.i(paramzagv2.C());
    paramzagv1.c(paramzagv2.p());
    paramzagv1.i(paramzagv2.O());
    if (!paramzagv2.O()) {
      paramzagv1.c(paramzagv2.x());
    }
    paramzagv1.j(paramzagv2.P());
    if (!paramzagv2.P()) {
      paramzagv1.e(paramzagv2.B());
    }
    paramzagv1.h(paramzagv2.N());
    if (!paramzagv2.N()) {
      paramzagv1.d(paramzagv2.z());
    }
    paramzagv1.g(paramzagv2.M());
    if (!paramzagv2.M()) {
      paramzagv1.f(paramzagv2.D());
    }
  }
  
  private static void n(zje paramzje)
  {
    zagy localzagy;
    zgm localzgm;
    for (int i = 0; i < paramzje.z().d().size(); i++)
    {
      localzagy = (zagy)paramzje.z().d().get(i);
      localzgm = new zgm(null, localzagy.a());
      localzgm.a(localzagy.b());
      localzgm.b(localzagy.f());
      localzgm.c(localzagy.g());
      localzgm.a(localzagy.c());
      com.aspose.cells.b.a.a.zf.a(paramzje.z().f(), localzgm);
    }
    paramzje.z().d().clear();
    for (i = 0; i < paramzje.z().c().size(); i++)
    {
      localzagy = (zagy)paramzje.z().c().get(i);
      localzgm = new zgm(null, localzagy.a());
      localzgm.a(localzagy.b());
      localzgm.b(localzagy.f());
      localzgm.c(localzagy.g());
      localzgm.a(localzagy.c());
      com.aspose.cells.b.a.a.zf.a(paramzje.z().d(), localzgm);
    }
  }
  
  static ArrayList[] a(zagz paramzagz)
  {
    ArrayList[] arrayOfArrayList = null;
    int i = c(paramzagz);
    if (i > 1)
    {
      arrayOfArrayList = new ArrayList[i - 1];
      for (int j = 0; j < i - 1; j++)
      {
        arrayOfArrayList[j] = new ArrayList();
        a(paramzagz, j, 0, arrayOfArrayList[j]);
      }
    }
    return arrayOfArrayList;
  }
  
  static ArrayList b(zagz paramzagz)
  {
    ArrayList localArrayList = null;
    localArrayList = new ArrayList();
    int i = c(paramzagz);
    a(paramzagz, i - 1, 0, localArrayList);
    return localArrayList;
  }
  
  private static int c(zagz paramzagz)
  {
    if (paramzagz.getCount() == 0) {
      return 0;
    }
    zagy localzagy = paramzagz.a(0);
    int i = 1;
    while (localzagy.d().getCount() > 0)
    {
      i++;
      localzagy = localzagy.d().a(0);
    }
    return i;
  }
  
  private static void a(zagz paramzagz, int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    int i;
    zagy localzagy;
    if (paramInt1 == paramInt2) {
      for (i = 0; i < paramzagz.getCount(); i++)
      {
        localzagy = paramzagz.a(i);
        com.aspose.cells.b.a.a.zf.a(paramArrayList, localzagy);
      }
    } else {
      for (i = 0; i < paramzagz.getCount(); i++)
      {
        localzagy = paramzagz.a(i);
        a(localzagy.d(), paramInt1, paramInt2 + 1, paramArrayList);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ziy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */