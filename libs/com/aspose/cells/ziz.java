package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.c.zc;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class ziz
{
  public static int a = 10;
  public static int b = 8;
  public static int c = 14;
  
  static void a(zjf paramzjf)
    throws Exception
  {
    zr localzr = paramzjf.ap();
    zbff localzbff = paramzjf.z();
    if ((paramzjf.z().getCount() == 0) || (a(paramzjf.z().i()) == 0)) {
      return;
    }
    String str = c(paramzjf);
    if (!"".equals(str))
    {
      localObject1 = localzbff.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zbfc)((Iterator)localObject1).next();
        ((zbfc)localObject2).a(false);
      }
    }
    Object localObject1 = new zbff(paramzjf);
    Object localObject2 = new zbff(paramzjf);
    Object localObject3 = localzbff.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localzbfd = (zbfd)((Iterator)localObject3).next();
      if (localzbfd.ah() == 1) {
        ((zbff)localObject1).a(localzbfd);
      } else {
        ((zbff)localObject2).a(localzbfd);
      }
    }
    localObject3 = ((zbff)localObject1).c(0);
    zbfd localzbfd = new zbfd(paramzjf, null, 14);
    if (((zbff)localObject2).getCount() > 0) {
      localzbfd = ((zbff)localObject2).c(0);
    }
    a(paramzjf, (zbff)localObject1, (zbff)localObject2);
    boolean bool1 = a(((zbfd)localObject3).ai());
    boolean bool2 = a(localzbfd.ai());
    boolean bool3 = c((zbff)localObject1);
    boolean bool4 = c((zbff)localObject2);
    if (a(paramzjf.g(), bool3, bool4, localzbfd))
    {
      if (bool1 == bool2)
      {
        a(localzbff, paramzjf.e());
        paramzjf.g().p = paramzjf.e().p;
        if ((!paramzjf.e().f()) && (paramzjf.g().f()))
        {
          paramzjf.e().u = true;
          paramzjf.g().u = true;
        }
        paramzjf.g().a(paramzjf.e().f());
        paramzjf.g().r = true;
        paramzjf.e().r = true;
      }
      else
      {
        a((zbff)localObject1, paramzjf.e());
        a((zbff)localObject2, paramzjf.g());
      }
    }
    else
    {
      a((zbff)localObject1, paramzjf.e());
      a((zbff)localObject2, paramzjf.g());
    }
    if (paramzjf.A().a().getCount() > 0) {
      paramzjf.z().a = true;
    }
    if (paramzjf.A().b().getCount() > 0) {
      paramzjf.z().b = true;
    }
    paramzjf.z().a(a(paramzjf.z().a()));
    paramzjf.z().b(a(paramzjf.z().b()));
    paramzjf.z().a(b(paramzjf.z().a()));
    paramzjf.z().b(b(paramzjf.z().b()));
    if (paramzjf.g().r)
    {
      a(paramzjf.h(), paramzjf.f());
      m(paramzjf);
    }
    e(paramzjf);
    zbxy.a(paramzjf.e(), paramzjf.z().c(), (zbff)localObject1);
    zbxy.a(paramzjf.g(), paramzjf.z().d(), (zbff)localObject2);
    zkn.a(paramzjf.e(), paramzjf.G(), (zajf)localObject1, (zaje)localObject3);
    zkn.a(paramzjf.g(), paramzjf.I(), (zajf)localObject2, localzbfd);
    b(paramzjf, bool1, bool2);
    boolean bool5 = zanb.a(paramzjf);
    paramzjf.x().b = bool5;
    d(paramzjf);
    com.aspose.cells.b.a.b.zp localzp1 = new com.aspose.cells.b.a.b.zp(a + paramzjf.al().c(), a + paramzjf.al().d(), paramzjf.al().e() - a * 2, paramzjf.al().f() - a * 2);
    paramzjf.j = new com.aspose.cells.b.a.b.zp(0, 0, paramzjf.al().e() - b / 2, paramzjf.al().f() - b / 2);
    if (paramzjf.M().o())
    {
      float f1 = 0.81F;
      if (paramzjf.M().e().h().h() > 20.0F) {
        f1 = 0.85F;
      }
      zt localzt = new zt(paramzjf.a() * f1, paramzjf.b() * 0.5F);
      localObject6 = paramzjf.M().a(localzt);
      paramzjf.M().e().b.a((paramzjf.a() - ((com.aspose.cells.b.a.b.zs)localObject6).b()) / 2);
      paramzjf.M().e().b.b(paramzjf.al().d() + a);
      paramzjf.M().e().b.a((com.aspose.cells.b.a.b.zs)localObject6);
      if (!paramzjf.L().c())
      {
        localzp1.b(localzp1.d() + ((com.aspose.cells.b.a.b.zs)localObject6).c() + b);
        localzp1.d(localzp1.f() - (((com.aspose.cells.b.a.b.zs)localObject6).c() + b));
        paramzjf.j.b(paramzjf.j.d() + ((com.aspose.cells.b.a.b.zs)localObject6).c() + a);
        paramzjf.j.d(paramzjf.j.f() - (((com.aspose.cells.b.a.b.zs)localObject6).c() + a));
      }
    }
    if (paramzjf.v()) {
      if ((((zbff)localObject2).getCount() == 0) && ((((zbfd)localObject3).ai() == 44) || (((zbfd)localObject3).ai() == 35) || (bool5)))
      {
        localObject4 = localObject3;
        if ((((zbfd)localObject3).m() == 35) || (((zbfd)localObject3).m() == 36)) {
          for (int i = 1; i < paramzjf.z().getCount(); i++) {
            if ((paramzjf.z().a(i).k() != null) && (((zbfd)localObject4).F() != null) && (paramzjf.z().a(i).k().getCount() > ((zbfd)localObject4).F().getCount())) {
              localObject4 = paramzjf.z().c(i);
            }
          }
        }
        if (((((zbfd)localObject3).ai() == 35) && (!((zbfd)localObject3).J()) && (((zbff)localObject1).getCount() > 1)) || (g(paramzjf)))
        {
          a(paramzjf, bool1, bool2);
          localObject5 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
          zanb.a(localzr, paramzjf.x(), (com.aspose.cells.b.a.b.zp[])localObject5);
          localzp1 = localObject5[0];
        }
        else
        {
          a(paramzjf, (zbfd)localObject4);
          localObject5 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
          zanb.a(localzr, paramzjf.x(), (zbfd)localObject4, (com.aspose.cells.b.a.b.zp[])localObject5);
          localzp1 = localObject5[0];
        }
      }
      else
      {
        a(paramzjf, bool1, bool2);
        localObject4 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
        zanb.a(localzr, paramzjf.x(), (com.aspose.cells.b.a.b.zp[])localObject4);
        localzp1 = localObject4[0];
      }
    }
    Object localObject4 = new com.aspose.cells.b.a.b.zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
    com.aspose.cells.b.a.b.zp[] arrayOfzp1;
    if (paramzjf.e().S().o())
    {
      a(paramzjf.e(), bool1);
      localObject5 = new zt();
      if (bool1) {
        localObject5 = new zt(paramzjf.a() * 0.2F, paramzjf.b() * 0.8F);
      } else {
        localObject5 = new zt(paramzjf.a() * 0.8F, paramzjf.b() * 0.2F);
      }
      localObject6 = paramzjf.e().S().a((zt)localObject5);
      if ((paramzjf.G().u() == 1) && (!paramzjf.G().p())) {
        paramzjf.e().n = false;
      } else if ((paramzjf.G().u() != 1) && (paramzjf.G().p())) {
        paramzjf.e().n = false;
      }
      arrayOfzp1 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
      a(paramzjf.e(), arrayOfzp1, bool1, (com.aspose.cells.b.a.b.zs)localObject6);
      localzp1 = arrayOfzp1[0];
    }
    if (paramzjf.G().S().o())
    {
      a(paramzjf.G(), bool1);
      localObject5 = new zt();
      if (bool1) {
        localObject5 = new zt(paramzjf.a() * 0.8F, paramzjf.b() * 0.2F);
      } else {
        localObject5 = new zt(paramzjf.a() * 0.2F, paramzjf.b() * 0.8F);
      }
      localObject6 = paramzjf.G().S().a((zt)localObject5);
      if ((paramzjf.e().u() == 1) && (!paramzjf.e().p())) {
        paramzjf.G().n = false;
      } else if ((paramzjf.e().u() != 1) && (paramzjf.e().p())) {
        paramzjf.G().n = false;
      }
      arrayOfzp1 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
      a(paramzjf.G(), arrayOfzp1, bool1, (com.aspose.cells.b.a.b.zs)localObject6);
      localzp1 = arrayOfzp1[0];
    }
    if ((paramzjf.g().S().o()) && (((zbff)localObject2).getCount() > 0))
    {
      a(paramzjf.g(), bool2);
      localObject5 = new zt();
      if (bool1) {
        localObject5 = new zt(paramzjf.a() * 0.2F, paramzjf.b() * 0.8F);
      } else {
        localObject5 = new zt(paramzjf.a() * 0.8F, paramzjf.b() * 0.2F);
      }
      localObject6 = paramzjf.g().S().a((zt)localObject5);
      if (bool1 == bool2) {
        paramzjf.g().n = (!paramzjf.e().n);
      } else {
        paramzjf.g().n = (!paramzjf.G().n);
      }
      arrayOfzp1 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
      a(paramzjf.g(), arrayOfzp1, bool2, (com.aspose.cells.b.a.b.zs)localObject6);
      localzp1 = arrayOfzp1[0];
    }
    if ((paramzjf.I().S().o()) && (((zbff)localObject2).getCount() > 0))
    {
      a(paramzjf.I(), bool2);
      localObject5 = new zt();
      if (bool1) {
        localObject5 = new zt(paramzjf.a() * 0.8F, paramzjf.b() * 0.2F);
      } else {
        localObject5 = new zt(paramzjf.a() * 0.2F, paramzjf.b() * 0.8F);
      }
      localObject6 = paramzjf.I().S().a((zt)localObject5);
      if (bool1 == bool2) {
        paramzjf.I().n = (!paramzjf.G().n);
      } else {
        paramzjf.I().n = (!paramzjf.e().n);
      }
      arrayOfzp1 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
      a(paramzjf.I(), arrayOfzp1, bool2, (com.aspose.cells.b.a.b.zs)localObject6);
      localzp1 = arrayOfzp1[0];
    }
    zanb.a(paramzjf.x(), localzp1);
    Object localObject5 = new com.aspose.cells.b.a.b.zp(0, 0, paramzjf.ar(), paramzjf.au());
    if (!paramzjf.B().s())
    {
      if (paramzjf.B().o().d() < 0)
      {
        paramzjf.B().b(paramzjf.B().m() + paramzjf.B().o().d());
        paramzjf.B().d(0);
      }
      if (paramzjf.B().o().c() < 0)
      {
        paramzjf.B().a(paramzjf.B().l() + paramzjf.B().o().c());
        paramzjf.B().c(0);
      }
      if (paramzjf.B().l() + paramzjf.B().i() > 4000) {
        paramzjf.B().a(4000 - paramzjf.B().i());
      }
      if (paramzjf.B().m() + paramzjf.B().n() > 4000) {
        paramzjf.B().b(4000 - paramzjf.B().n());
      }
      localzp1.a(paramzjf.B().v());
      localzp1.b(paramzjf.B().w());
      localzp1.c(paramzjf.B().t());
      localzp1.d(paramzjf.B().u());
      if (localzp1.i() > paramzjf.a()) {
        localzp1.c(paramzjf.a() - localzp1.c());
      }
      if (localzp1.j() > paramzjf.b()) {
        localzp1.d(paramzjf.b() - localzp1.d());
      }
      localObject4 = zbxz.c(localzp1);
    }
    paramzjf.a(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
    paramzjf.B().b = new com.aspose.cells.b.a.b.zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
    Object localObject6 = new com.aspose.cells.b.a.b.zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
    int j = 0;
    boolean bool6 = (a(paramzjf.e())) || (e(paramzjf.N()));
    int k = 0;
    if ((!zbxz.a(localzp1)) && (paramzjf.u()))
    {
      f(paramzjf);
      if ((!bool1) && (!bool2) && (!bool6))
      {
        paramzjf.e().m = 0;
        paramzjf.f().f(2);
        paramzjf.f().h(2);
        paramzjf.g().m = 0;
        paramzjf.h().f(2);
        paramzjf.h().h(2);
        j = 1;
      }
      com.aspose.cells.b.a.b.zs localzs1 = zjs.a(localzr, paramzjf.k());
      paramzjf.k().a(localzs1);
      int m = zjs.a(localzr, paramzjf.k(), localzp1);
      paramzjf.k().a(m);
      k = localzs1.c() + m;
      if (paramzjf.B().s())
      {
        localzp1.a(localzp1.c() + localzs1.b());
        localzp1.c(localzp1.e() - localzs1.b());
        if (k - 2 < localzp1.f() - 20) {
          localzp1.d(localzp1.f() - (k - 2));
        } else {
          localzp1.d(20);
        }
        if (bool6)
        {
          paramzjf.k().a.a(localzp1.c());
          paramzjf.k().a.b(localzp1.j());
          paramzjf.k().a.c(localzp1.e());
          localzp1.d(localzp1.f() - c);
        }
      }
      else if (paramzjf.D())
      {
        paramzjf.f -= localzs1.b();
        paramzjf.h += localzs1.b();
        paramzjf.i += k - 2;
        if (bool6)
        {
          if (paramzjf.b() - a - k - c < localzp1.j())
          {
            int n = localzp1.j() - (paramzjf.b() - a - k - c);
            localzp1.d(localzp1.f() - n);
            paramzjf.i -= n;
            paramzjf.a = true;
          }
          paramzjf.k().a.b(localzp1.j() + c);
        }
      }
      else
      {
        localzp1.a(localzp1.c() + localzs1.b());
        localzp1.c(localzp1.e() - localzs1.b());
        localzp1.d(localzp1.f() - (k - 2));
        if (bool6)
        {
          paramzjf.k().a.a(localzp1.c());
          paramzjf.k().a.b(localzp1.j());
          paramzjf.k().a.c(localzp1.e());
          localzp1.d(localzp1.f() - c);
        }
      }
    }
    boolean bool7 = paramzjf.e().O();
    boolean bool8 = paramzjf.e().P();
    boolean bool9 = paramzjf.e().N();
    boolean bool10 = paramzjf.e().M();
    boolean bool11 = a(paramzjf, ((zbff)localObject1).i(), ((zbff)localObject2).i());
    double d1 = 0.0D;
    double d2 = 0.0D;
    boolean bool12 = false;
    double[] arrayOfDouble1;
    double[] arrayOfDouble2;
    if (bool11)
    {
      arrayOfDouble1 = new double[] { d1 };
      arrayOfDouble2 = new double[] { d2 };
      bool12 = zbxk.a(localzbff, arrayOfDouble1, arrayOfDouble2);
      d1 = arrayOfDouble1[0];
      d2 = arrayOfDouble2[0];
    }
    else
    {
      arrayOfDouble1 = new double[] { d1 };
      arrayOfDouble2 = new double[] { d2 };
      bool12 = zbxk.a((zbff)localObject1, arrayOfDouble1, arrayOfDouble2);
      d1 = arrayOfDouble1[0];
      d2 = arrayOfDouble2[0];
    }
    if (bool12)
    {
      if (paramzjf.e().r)
      {
        a(localzr, paramzjf.e(), paramzjf.e().l, localzp1, ((zbfd)localObject3).ai(), localzbff, bool1);
        if ((bool9) || (bool10)) {
          a(paramzjf.e(), localzbff, bool9, bool10);
        }
      }
      else
      {
        a(localzr, paramzjf.e(), paramzjf.e().l, localzp1, ((zbfd)localObject3).ai(), (zbff)localObject1, bool1);
        if ((bool9) || (bool10)) {
          a(paramzjf.e(), localzbff, bool9, bool10);
        }
      }
      if (bool11) {
        zbxk.a(paramzjf, localzbff);
      } else {
        zbxk.a(paramzjf, (zbff)localObject1);
      }
    }
    int i1 = a(((zbff)localObject1).i());
    int i2 = a(((zbff)localObject2).i());
    double d3 = 0.0D;
    double d4 = 0.0D;
    boolean bool13 = false;
    double[] arrayOfDouble3;
    double[] arrayOfDouble6;
    double[] arrayOfDouble7;
    if (bool11)
    {
      localObject7 = i(paramzjf);
      arrayOfDouble3 = new double[] { d3 };
      double[] arrayOfDouble4 = { d4 };
      bool13 = a(((zbff)localObject1).i(), ((zbff)localObject2).i(), arrayOfDouble3, arrayOfDouble4, (zbt)localObject7);
      d3 = arrayOfDouble3[0];
      d4 = arrayOfDouble4[0];
      if (bool12)
      {
        d7 = d3;
        double d9 = d4;
        arrayOfDouble6 = new double[] { d7 };
        arrayOfDouble7 = new double[] { d9 };
        zbxk.a(paramzjf.z(), d1, d2, arrayOfDouble6, arrayOfDouble7);
        d7 = arrayOfDouble6[0];
        d9 = arrayOfDouble7[0];
        d3 = d7;
        d4 = d9;
      }
      paramzjf.d = d3;
      paramzjf.e = d4;
      paramzjf.b = true;
      paramzjf.c = ((zbt)localObject7);
    }
    else
    {
      localObject7 = new double[] { d3 };
      arrayOfDouble3 = new double[] { d4 };
      bool13 = a(((zbff)localObject1).i(), (double[])localObject7, arrayOfDouble3, paramzjf.G());
      d3 = localObject7[0];
      d4 = arrayOfDouble3[0];
      double d6;
      double d8;
      if (bool12)
      {
        d6 = d3;
        d8 = d4;
        double[] arrayOfDouble5 = { d6 };
        arrayOfDouble6 = new double[] { d8 };
        zbxk.a((zbff)localObject1, d1, d2, arrayOfDouble5, arrayOfDouble6);
        d6 = arrayOfDouble5[0];
        d8 = arrayOfDouble6[0];
        d3 = d6;
        d4 = d8;
      }
      if ((bool1) && (paramzjf.g().s))
      {
        d6 = 0.0D;
        d8 = 0.0D;
        bool15 = false;
        arrayOfDouble6 = new double[] { d6 };
        arrayOfDouble7 = new double[] { d8 };
        bool15 = c(((zbff)localObject2).i(), arrayOfDouble6, arrayOfDouble7, paramzjf.g());
        d6 = arrayOfDouble6[0];
        d8 = arrayOfDouble7[0];
        if (d6 < d3) {
          d3 = d6;
        }
        if (d8 > d4) {
          d4 = d8;
        }
        if ((bool13) && (!bool15)) {
          bool13 = false;
        }
        paramzjf.g().t = true;
      }
    }
    Object localObject7 = bool13;
    double d5 = d4;
    double d7 = d3;
    boolean bool14 = paramzjf.G().O();
    boolean bool15 = paramzjf.G().P();
    boolean bool16 = paramzjf.G().N();
    boolean bool17 = paramzjf.G().M();
    Object localObject15;
    Object localObject8;
    if (paramzjf.b)
    {
      if (paramzjf.c == paramzjf.G()) {
        a(localzr, paramzjf.G(), d4, d3, bool13, paramzjf.G().l, ((zbfd)localObject3).ai(), localzp1, bool1, ((zbff)localObject1).c(0));
      } else {
        a(localzr, paramzjf.I(), d4, d3, bool13, paramzjf.I().l, localzbfd.ai(), localzp1, bool2, ((zbff)localObject2).c(0));
      }
      if ((((zbfd)localObject3).aw()) && (localzbfd.aw()))
      {
        double d10 = 0.0D;
        double d11 = 0.0D;
        double[] arrayOfDouble8 = { d10 };
        localObject15 = new double[] { d11 };
        boolean bool22 = a(((zbff)localObject1).i(), arrayOfDouble8, (double[])localObject15, paramzjf.G());
        d10 = arrayOfDouble8[0];
        d11 = localObject15[0];
        a(localzr, paramzjf.G(), d11, d10, bool22, paramzjf.G().l, ((zbfd)localObject3).ai(), localzp1, bool1, ((zbff)localObject1).c(0));
        arrayOfDouble8[0] = d10;
        localObject15[0] = d11;
        bool13 = a(((zbff)localObject2).i(), arrayOfDouble8, (double[])localObject15, paramzjf.I());
        d10 = arrayOfDouble8[0];
        d11 = localObject15[0];
        a(localzr, paramzjf.I(), d11, d10, bool22, paramzjf.I().l, localzbfd.ai(), localzp1, bool2, ((zbff)localObject2).c(0));
        d(paramzjf.G());
        d(paramzjf.I());
      }
      localObject8 = j(paramzjf);
      a((zbt)localObject8, paramzjf.c);
      if ((bool16) || (bool17)) {
        a(paramzjf.G(), localzbff, bool16, bool17);
      }
    }
    else
    {
      a(localzr, paramzjf.G(), d4, d3, bool13, paramzjf.G().l, ((zbfd)localObject3).ai(), localzp1, bool1, ((zbff)localObject1).c(0));
      if ((bool16) || (bool17)) {
        a(paramzjf.G(), localzbff, bool16, bool17);
      }
    }
    if (paramzjf.e().r)
    {
      a(localzr, paramzjf.e(), paramzjf.e().l, localzp1, ((zbfd)localObject3).ai(), localzbff, bool1);
      if ((bool9) || (bool10)) {
        a(paramzjf.e(), localzbff, bool9, bool10);
      }
    }
    else
    {
      a(localzr, paramzjf.e(), paramzjf.e().l, localzp1, ((zbfd)localObject3).ai(), (zbff)localObject1, bool1);
      if ((bool9) || (bool10)) {
        a(paramzjf.e(), localzbff, bool9, bool10);
      }
    }
    if (c(paramzjf.N())) {
      zew.a(true, localzr, localzbff, localzp1, localzbff.h(), bool7, bool8, bool9, bool10, bool14, bool15, bool16, bool17);
    }
    Object localObject9;
    Object localObject10;
    Object localObject13;
    if ((!zbxz.a(localzp1)) && (((zbfd)localObject3).ai() != 57) && (((zbfd)localObject3).ai() != 59))
    {
      a(paramzjf.G(), paramzjf.e(), (zbff)localObject1, paramzjf);
      localObject8 = zbv.a(localzr, paramzjf.G(), (zbfd)localObject3, bool1);
      b(paramzjf.G(), bool1);
      if (!bool1) {
        localObject9 = new zt(((com.aspose.cells.b.a.b.zp)localObject6).e(), ((com.aspose.cells.b.a.b.zp)localObject6).f());
      } else {
        localObject9 = new zt(((com.aspose.cells.b.a.b.zp)localObject6).e(), ((com.aspose.cells.b.a.b.zp)localObject6).f());
      }
      localObject10 = paramzjf.G().T().a((zt)localObject9);
      localObject13 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
      a(paramzjf, localzr, paramzjf.G(), (com.aspose.cells.b.a.b.zs)localObject8, (com.aspose.cells.b.a.b.zs)localObject10, (com.aspose.cells.b.a.b.zp[])localObject13, bool1);
      localzp1 = localObject13[0];
    }
    if (paramzjf.N() == 78) {
      paramzjf.F().a(paramzjf.F().D());
    }
    int i3 = 0;
    Object localObject18;
    double[] arrayOfDouble11;
    Object localObject11;
    Object localObject14;
    if ((!zbxz.a(localzp1)) && (j == 0) && (paramzjf.e().q()) && (((zbfd)localObject3).ai() != 57) && (((zbfd)localObject3).ai() != 59))
    {
      a(paramzjf.e(), paramzjf.G(), (zbff)localObject1, paramzjf);
      localObject9 = a((zbff)localObject1);
      if (((zbff)localObject2).getCount() > 0)
      {
        i3 = 1;
        d1 = 0.0D;
        d2 = 0.0D;
        bool12 = false;
        if (bool11)
        {
          localObject10 = new double[] { d1 };
          localObject13 = new double[] { d2 };
          bool12 = zbxk.a(localzbff, (double[])localObject10, (double[])localObject13);
          d1 = localObject10[0];
          d2 = localObject13[0];
        }
        else
        {
          localObject10 = new double[] { d1 };
          localObject13 = new double[] { d2 };
          bool12 = zbxk.a((zbff)localObject2, (double[])localObject10, (double[])localObject13);
          d1 = localObject10[0];
          d2 = localObject13[0];
        }
        if ((bool12) && (!paramzjf.e().r) && (!paramzjf.g().t))
        {
          a(localzr, paramzjf.g(), paramzjf.g().l, localzp1, localzbfd.ai(), (zbff)localObject2, bool2);
          if ((bool9) || (bool10)) {
            a(paramzjf.e(), localzbff, bool9, bool10);
          }
          zbxk.a(paramzjf, (zbff)localObject2);
        }
        boolean bool19 = paramzjf.I().N();
        boolean bool21 = paramzjf.I().M();
        double d13 = 0.0D;
        double d15 = 0.0D;
        Object localObject19;
        if (paramzjf.b)
        {
          d13 = paramzjf.d;
          d15 = paramzjf.e;
        }
        else
        {
          localObject18 = new double[] { d13 };
          localObject19 = new double[] { d15 };
          boolean bool24 = a(((zbff)localObject2).i(), (double[])localObject18, (double[])localObject19, paramzjf.I());
          d13 = localObject18[0];
          d15 = localObject19[0];
          if (bool12)
          {
            double d19 = d13;
            double d21 = d15;
            arrayOfDouble11 = new double[] { d19 };
            double[] arrayOfDouble12 = { d21 };
            zbxk.a((zbff)localObject2, d1, d2, arrayOfDouble11, arrayOfDouble12);
            d19 = arrayOfDouble11[0];
            d21 = arrayOfDouble12[0];
            d13 = d19;
            d15 = d21;
          }
          a(localzr, paramzjf.I(), d15, d13, bool24, paramzjf.I().l, localzbfd.ai(), localzp1, bool2, ((zbff)localObject2).c(0));
        }
        if ((bool19) || (bool21)) {
          a(paramzjf.I(), (zbff)localObject2, bool19, bool21);
        }
        if ((!zbxz.a(localzp1)) && (paramzjf.I().q()) && (localzbfd.ai() != 57) && (localzbfd.ai() != 59))
        {
          a(paramzjf.I(), paramzjf.g(), (zbff)localObject2, paramzjf);
          localObject18 = zbv.a(localzr, paramzjf.I(), localzbfd, bool2);
          b(paramzjf.I(), bool2);
          localObject19 = new zt();
          if (!bool2) {
            localObject19 = new zt(((com.aspose.cells.b.a.b.zp)localObject6).e(), ((com.aspose.cells.b.a.b.zp)localObject6).f());
          } else {
            localObject19 = new zt(((com.aspose.cells.b.a.b.zp)localObject6).e(), ((com.aspose.cells.b.a.b.zp)localObject6).f());
          }
          com.aspose.cells.b.a.b.zs localzs3 = paramzjf.I().T().a((zt)localObject19);
          if (bool1 == bool2)
          {
            if ((paramzjf.I().m != 3) && (paramzjf.I().m == paramzjf.G().m)) {
              paramzjf.I().m = 0;
            }
          }
          else if ((paramzjf.I().m != 3) && (paramzjf.I().m == paramzjf.e().m)) {
            paramzjf.I().m = 0;
          }
          com.aspose.cells.b.a.b.zp[] arrayOfzp2 = { localzp1 };
          a(paramzjf, localzr, paramzjf.I(), (com.aspose.cells.b.a.b.zs)localObject18, localzs3, arrayOfzp2, bool2);
          localzp1 = arrayOfzp2[0];
        }
      }
      localObject11 = zbv.a(localzr, paramzjf.e(), localzp1, (com.aspose.cells.b.a.b.zp)localObject5, i1, bool1, (zbfd)localObject9);
      int i4 = (int)(paramzjf.e().J().o() + 0.5D);
      if (i4 < 0) {
        i4 = 0;
      }
      if (paramzjf.z().e() != null) {
        i4 += i4 * paramzjf.z().e().length;
      }
      if ((((zbfd)localObject3).ai() == 60) || (((zbfd)localObject3).ai() == 12))
      {
        b(paramzjf.e(), bool1);
        if (bool1) {
          localObject14 = new zt(((com.aspose.cells.b.a.b.zp)localObject6).e(), ((com.aspose.cells.b.a.b.zp)localObject6).f());
        } else {
          localObject14 = new zt(((com.aspose.cells.b.a.b.zp)localObject6).e(), ((com.aspose.cells.b.a.b.zp)localObject6).f());
        }
        localObject15 = paramzjf.e().T().a((zt)localObject14);
        i4 += ((com.aspose.cells.b.a.b.zs)localObject15).c();
      }
      localObject14 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
      a(paramzjf, localzr, paramzjf.e(), (com.aspose.cells.b.a.b.zs)localObject11, i4, (com.aspose.cells.b.a.b.zp[])localObject14, bool1, bool6);
      localzp1 = localObject14[0];
      if ((paramzjf.B().s()) && (paramzjf.G().q()) && (((zbfd)localObject3).ai() != 57) && (((zbfd)localObject3).ai() != 59))
      {
        int i7 = a(localzr, paramzjf.G(), bool1, (zbfd)localObject3, localzp1);
        int i9 = 0;
        if (bool1) {
          i9 = localzp1.e();
        } else {
          i9 = localzp1.f();
        }
        if ((bool14) && (paramzjf.G().l.size() > 3) && (i7 > i9) && (i9 != 0))
        {
          double d17 = paramzjf.G().z();
          paramzjf.G().l.clear();
          paramzjf.G().i(bool14);
          paramzjf.G().j(bool15);
          paramzjf.G().h(bool16);
          paramzjf.G().g(bool17);
          a(localzr, paramzjf.G(), d4, d3, bool13, paramzjf.G().l, ((zbfd)localObject3).ai(), localzp1, bool1, ((zbff)localObject1).c(0));
          if (paramzjf.G().z() > d17) {
            zbv.a(localzr, paramzjf.G(), (zbfd)localObject3, bool1);
          }
        }
      }
    }
    int i6;
    if (((zbff)localObject2).getCount() > 0)
    {
      if (i3 == 0)
      {
        d1 = 0.0D;
        d2 = 0.0D;
        bool12 = false;
        if (bool11)
        {
          localObject9 = new double[] { d1 };
          localObject11 = new double[] { d2 };
          bool12 = zbxk.a(localzbff, (double[])localObject9, (double[])localObject11);
          d1 = localObject9[0];
          d2 = localObject11[0];
        }
        else
        {
          localObject9 = new double[] { d1 };
          localObject11 = new double[] { d2 };
          bool12 = zbxk.a((zbff)localObject2, (double[])localObject9, (double[])localObject11);
          d1 = localObject9[0];
          d2 = localObject11[0];
        }
        if ((bool12) && (!paramzjf.e().r) && (!paramzjf.g().t))
        {
          a(localzr, paramzjf.g(), paramzjf.g().l, localzp1, localzbfd.ai(), (zbff)localObject2, bool2);
          if ((bool9) || (bool10)) {
            a(paramzjf.e(), localzbff, bool9, bool10);
          }
          zbxk.a(paramzjf, (zbff)localObject2);
        }
        bool18 = paramzjf.I().N();
        bool20 = paramzjf.I().M();
        double d12 = 0.0D;
        double d14 = 0.0D;
        if (paramzjf.b)
        {
          d12 = paramzjf.d;
          d14 = paramzjf.e;
        }
        else
        {
          double[] arrayOfDouble9 = { d12 };
          localObject18 = new double[] { d14 };
          boolean bool23 = a(((zbff)localObject2).i(), arrayOfDouble9, (double[])localObject18, paramzjf.I());
          d12 = arrayOfDouble9[0];
          d14 = localObject18[0];
          if (bool12)
          {
            double d18 = d12;
            double d20 = d14;
            double[] arrayOfDouble10 = { d18 };
            arrayOfDouble11 = new double[] { d20 };
            zbxk.a((zbff)localObject2, d1, d2, arrayOfDouble10, arrayOfDouble11);
            d18 = arrayOfDouble10[0];
            d20 = arrayOfDouble11[0];
            d12 = d18;
            d14 = d20;
          }
          a(localzr, paramzjf.I(), d14, d12, bool23, paramzjf.I().l, localzbfd.ai(), localzp1, bool2, ((zbff)localObject2).c(0));
        }
        if ((bool18) || (bool20)) {
          a(paramzjf.I(), (zbff)localObject2, bool18, bool20);
        }
      }
      bool18 = paramzjf.g().N();
      boolean bool20 = paramzjf.g().M();
      if (paramzjf.e().r)
      {
        if ((localzbfd.ai() == 60) && (bool1))
        {
          paramzjf.g().l = paramzjf.G().l;
          paramzjf.g().d(paramzjf.G().z());
          paramzjf.g().f(paramzjf.G().D());
          paramzjf.g().c(paramzjf.G().x());
          paramzjf.g().e(paramzjf.G().B());
          paramzjf.g().a(false);
          paramzjf.g().q = true;
          paramzjf.g().d(paramzjf.e().k());
        }
        else
        {
          paramzjf.g().l = paramzjf.e().l;
          paramzjf.g().d(paramzjf.e().z());
          paramzjf.g().f(paramzjf.e().D());
          paramzjf.g().c(paramzjf.e().x());
          paramzjf.g().e(paramzjf.e().B());
          paramzjf.g().d(paramzjf.e().k());
          if (paramzjf.e().k() == 2)
          {
            paramzjf.g().c(paramzjf.e().j());
            paramzjf.g().g(paramzjf.e().y());
            paramzjf.g().i(paramzjf.e().C());
          }
        }
      }
      else if (paramzjf.g().t)
      {
        paramzjf.g().l = paramzjf.G().l;
        paramzjf.g().d(paramzjf.G().z());
        paramzjf.g().f(paramzjf.G().D());
        paramzjf.g().c(paramzjf.G().x());
        paramzjf.g().e(paramzjf.G().B());
      }
      else
      {
        a(localzr, paramzjf.g(), paramzjf.g().l, localzp1, localzbfd.ai(), (zbff)localObject2, bool2);
      }
      if ((bool18) || (bool20)) {
        a(paramzjf.g(), localzbff, bool18, bool20);
      }
      com.aspose.cells.b.a.b.zs localzs2;
      Object localObject16;
      Object localObject17;
      if ((i3 == 0) && (!zbxz.a(localzp1)) && (paramzjf.I().q()) && (localzbfd.ai() != 57) && (localzbfd.ai() != 59))
      {
        a(paramzjf.I(), paramzjf.g(), (zbff)localObject2, paramzjf);
        localzs2 = zbv.a(localzr, paramzjf.I(), localzbfd, bool2);
        b(paramzjf.I(), bool2);
        localObject14 = new zt();
        if (!bool2) {
          localObject14 = new zt(((com.aspose.cells.b.a.b.zp)localObject6).e(), ((com.aspose.cells.b.a.b.zp)localObject6).f());
        } else {
          localObject14 = new zt(((com.aspose.cells.b.a.b.zp)localObject6).e(), ((com.aspose.cells.b.a.b.zp)localObject6).f());
        }
        localObject16 = paramzjf.I().T().a((zt)localObject14);
        if (bool1 == bool2)
        {
          if ((paramzjf.I().m != 3) && (paramzjf.G().q()) && (paramzjf.I().m == paramzjf.G().m)) {
            paramzjf.I().m = 0;
          }
        }
        else if ((paramzjf.I().m != 3) && (paramzjf.e().q()) && (paramzjf.I().m == paramzjf.e().m)) {
          paramzjf.I().m = 0;
        }
        localObject17 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
        a(paramzjf, localzr, paramzjf.I(), localzs2, (com.aspose.cells.b.a.b.zs)localObject16, (com.aspose.cells.b.a.b.zp[])localObject17, bool2);
        localzp1 = localObject17[0];
      }
      if ((!zbxz.a(localzp1)) && (j == 0) && (paramzjf.g().q()) && (localzbfd.ai() != 57) && (localzbfd.ai() != 59))
      {
        a(paramzjf.g(), paramzjf.I(), (zbff)localObject2, paramzjf);
        localzs2 = zbv.a(localzr, paramzjf.g(), localzp1, (com.aspose.cells.b.a.b.zp)localObject5, i2, bool2, localzbfd);
        i6 = (int)(paramzjf.g().J().o() + 0.5D);
        if ((localzbfd.ai() == 60) || (localzbfd.ai() == 12))
        {
          b(paramzjf.e(), bool2);
          if (bool2) {
            localObject16 = new zt(((com.aspose.cells.b.a.b.zp)localObject6).e(), ((com.aspose.cells.b.a.b.zp)localObject6).f());
          } else {
            localObject16 = new zt(((com.aspose.cells.b.a.b.zp)localObject6).e(), ((com.aspose.cells.b.a.b.zp)localObject6).f());
          }
          localObject17 = paramzjf.e().T().a((zt)localObject16);
          i6 += ((com.aspose.cells.b.a.b.zs)localObject17).c();
        }
        if (bool1 == bool2)
        {
          if ((paramzjf.g().m != 3) && (paramzjf.g().m == paramzjf.e().m)) {
            paramzjf.g().m = 0;
          }
        }
        else if ((paramzjf.g().m != 3) && (paramzjf.g().m != 0) && (paramzjf.g().m == paramzjf.G().m)) {
          paramzjf.g().w = paramzjf.G();
        }
        localObject16 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
        a(paramzjf, localzr, paramzjf.g(), localzs2, i6, (com.aspose.cells.b.a.b.zp[])localObject16, bool2, bool6);
        localzp1 = localObject16[0];
      }
    }
    boolean bool18 = false;
    if ((paramzjf.B().s()) || (!paramzjf.D())) {
      bool18 = true;
    }
    float f2;
    float f3;
    if ((!zbxz.a(localzp1)) && (paramzjf.G().q()) && (paramzjf.G().I() != 3) && (((zbfd)localObject3).ai() != 57) && (((zbfd)localObject3).ai() != 59))
    {
      zbv.b(localzr, paramzjf.G(), (zbfd)localObject3, bool1);
      f2 = paramzjf.G().j;
      f3 = paramzjf.G().k;
      if (!bool1)
      {
        if (bool18)
        {
          if (localzp1.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d() < f3)
          {
            i6 = (int)(f3 - (localzp1.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d()));
            localzp1.b(localzp1.d() + i6);
            localzp1.d(localzp1.f() - i6);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp1.j() < f2)
          {
            i6 = (int)(f2 - (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp1.j()));
            localzp1.d(localzp1.f() - i6);
          }
        }
        else
        {
          if (localzp1.d() - paramzjf.g < f3)
          {
            i6 = (int)(f3 - (localzp1.d() - paramzjf.g));
            paramzjf.g -= i6;
            paramzjf.i += i6;
          }
          if (paramzjf.g + paramzjf.i - localzp1.j() < f2)
          {
            i6 = (int)(f2 - (paramzjf.g + paramzjf.i - localzp1.j()));
            paramzjf.i += i6;
          }
        }
      }
      else if (bool18)
      {
        if (localzp1.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c() < f2)
        {
          i6 = (int)(f2 - (localzp1.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c()));
          localzp1.a(localzp1.c() + i6);
          localzp1.c(localzp1.e() - i6);
        }
        if (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp1.i() < f3)
        {
          i6 = (int)(f3 - (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp1.i()));
          localzp1.c(localzp1.e() - i6);
        }
      }
      else
      {
        if (localzp1.c() - paramzjf.f < f2)
        {
          i6 = (int)(f2 - (localzp1.c() - paramzjf.f));
          paramzjf.f -= i6;
          paramzjf.h += i6;
        }
        if (paramzjf.f + paramzjf.h - localzp1.i() < f3)
        {
          i6 = (int)(f3 - (paramzjf.f + paramzjf.h - localzp1.i()));
          paramzjf.h += i6;
        }
      }
    }
    if ((!zbxz.a(localzp1)) && (paramzjf.e().q()) && (paramzjf.e().I() != 3) && (((zbfd)localObject3).ai() != 57) && (((zbfd)localObject3).ai() != 59) && ((paramzjf.e().j > 0.0F) || (paramzjf.e().k > 0.0F)))
    {
      f2 = paramzjf.e().j;
      f3 = paramzjf.e().k;
      if (bool1)
      {
        if (bool18)
        {
          if (localzp1.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d() < f3)
          {
            i6 = (int)(f3 - (localzp1.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d()));
            localzp1.b(localzp1.d() + i6);
            localzp1.d(localzp1.f() - i6);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp1.j() < f2)
          {
            i6 = (int)(f2 - (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp1.j()));
            localzp1.d(localzp1.f() - i6);
          }
        }
        else
        {
          if (localzp1.d() - paramzjf.g < f3)
          {
            i6 = (int)(f3 - (localzp1.d() - paramzjf.g));
            paramzjf.g -= i6;
            paramzjf.i += i6;
          }
          if (paramzjf.g + paramzjf.i - localzp1.j() < f2)
          {
            i6 = (int)(f2 - (paramzjf.g + paramzjf.i - localzp1.j()));
            paramzjf.i += i6;
          }
        }
      }
      else if (bool18)
      {
        if (localzp1.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c() < f2)
        {
          i6 = (int)(f2 - (localzp1.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c()));
          localzp1.a(localzp1.c() + i6);
          localzp1.c(localzp1.e() - i6);
        }
        if (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp1.i() < f3)
        {
          i6 = (int)(f3 - (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp1.i()));
          localzp1.c(localzp1.e() - i6);
        }
      }
      else
      {
        if (localzp1.c() - paramzjf.f < f2)
        {
          i6 = (int)(f2 - (localzp1.c() - paramzjf.f));
          paramzjf.f -= i6;
          paramzjf.h += i6;
        }
        if (paramzjf.f + paramzjf.h - localzp1.i() < f3)
        {
          i6 = (int)(f3 - (paramzjf.f + paramzjf.h - localzp1.i()));
          paramzjf.h += i6;
        }
      }
    }
    if (((zbff)localObject2).getCount() > 0)
    {
      int i5;
      if ((!zbxz.a(localzp1)) && (paramzjf.B().s()) && (paramzjf.I().q()) && (paramzjf.I().I() != 3) && (localzbfd.ai() != 57) && (localzbfd.ai() != 59)) {
        if (!bool2)
        {
          f2 = paramzjf.I().g / 2.0F;
          if (localzp1.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d() < f2)
          {
            i5 = (int)(f2 - (localzp1.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d()));
            localzp1.b(localzp1.d() + i5);
            localzp1.d(localzp1.f() - i5);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp1.j() < f2)
          {
            i5 = (int)(f2 - (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp1.j()));
            localzp1.d(localzp1.f() - i5);
          }
        }
        else
        {
          f2 = paramzjf.I().f / 2.0F;
          if (localzp1.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c() < f2)
          {
            i5 = (int)(f2 - (localzp1.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c()));
            localzp1.a(localzp1.c() + i5);
            localzp1.c(localzp1.e() - i5);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp1.i() < f2)
          {
            i5 = (int)(f2 - (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp1.i()));
            localzp1.c(localzp1.e() - i5);
          }
        }
      }
      if ((!zbxz.a(localzp1)) && (paramzjf.B().s()) && (paramzjf.g().q()) && (paramzjf.g().I() != 3) && (localzbfd.ai() != 57) && (localzbfd.ai() != 59) && ((paramzjf.g().j > 0.0F) || (paramzjf.g().k > 0.0F))) {
        if (bool2)
        {
          f2 = paramzjf.g().g / 2.0F;
          if (localzp1.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d() < f2)
          {
            i5 = (int)(f2 - (localzp1.d() - ((com.aspose.cells.b.a.b.zp)localObject4).d()));
            localzp1.b(localzp1.d() + i5);
            localzp1.d(localzp1.f() - i5);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp1.j() < f2)
          {
            i5 = (int)(f2 - (((com.aspose.cells.b.a.b.zp)localObject4).j() - localzp1.j()));
            localzp1.d(localzp1.f() - i5);
          }
        }
        else
        {
          f2 = paramzjf.g().f / 2.0F;
          if (localzp1.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c() < f2)
          {
            i5 = (int)(f2 - (localzp1.c() - ((com.aspose.cells.b.a.b.zp)localObject4).c()));
            localzp1.a(localzp1.c() + i5);
            localzp1.c(localzp1.e() - i5);
          }
          if (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp1.i() < f2)
          {
            i5 = (int)(f2 - (((com.aspose.cells.b.a.b.zp)localObject4).i() - localzp1.i()));
            localzp1.c(localzp1.e() - i5);
          }
        }
      }
    }
    if (!zbxz.a(localzp1))
    {
      localObject12 = new com.aspose.cells.b.a.b.zp[] { localzp1 };
      a(paramzjf, (com.aspose.cells.b.a.b.zp[])localObject12);
      localzp1 = localObject12[0];
      paramzjf.a(new zq(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f()));
      localObject12[0] = localzp1;
      a(localzr, paramzjf, (zbfd)localObject3, localzbfd, (com.aspose.cells.b.a.b.zp[])localObject12);
      localzp1 = localObject12[0];
    }
    else
    {
      paramzjf.a(new zq(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f()));
    }
    paramzjf.B().b = new com.aspose.cells.b.a.b.zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
    Object localObject12 = new com.aspose.cells.b.a.b.zp(paramzjf.f, paramzjf.g, paramzjf.h, paramzjf.i);
    if ((paramzjf.D()) && (paramzjf.u()) && (bool6) && (k != 0)) {
      ((com.aspose.cells.b.a.b.zp)localObject12).d(((com.aspose.cells.b.a.b.zp)localObject12).f() - (k - b));
    }
    if ((!zbxz.a(localzp1)) && (!paramzjf.B().s()))
    {
      if (paramzjf.e().S().o()) {
        a(paramzjf.e(), (com.aspose.cells.b.a.b.zp)localObject12, bool1);
      }
      if ((paramzjf.g().S().o()) && (((zbff)localObject2).getCount() > 0)) {
        a(paramzjf.g(), (com.aspose.cells.b.a.b.zp)localObject12, bool2);
      }
      if (paramzjf.G().S().o()) {
        a(paramzjf.G(), (com.aspose.cells.b.a.b.zp)localObject12, bool1);
      }
      if ((paramzjf.I().S().o()) && (((zbff)localObject2).getCount() > 0)) {
        a(paramzjf.I(), (com.aspose.cells.b.a.b.zp)localObject12, bool2);
      }
    }
    paramzjf.B().z();
    com.aspose.cells.b.a.b.zp localzp2 = paramzjf.B().a;
    if ((!zbxz.a(localzp1)) && (paramzjf.e().S().o())) {
      a(paramzjf.e(), bool1, localzp2);
    }
    if ((!zbxz.a(localzp1)) && (paramzjf.G().S().o())) {
      a(paramzjf.G(), bool1, localzp2);
    }
    if ((!zbxz.a(localzp1)) && (paramzjf.g().S().o()) && (((zbff)localObject2).getCount() > 0)) {
      a(paramzjf.g(), bool2, localzp2);
    }
    if ((!zbxz.a(localzp1)) && (paramzjf.I().S().o()) && (((zbff)localObject2).getCount() > 0)) {
      a(paramzjf.I(), bool2, localzp2);
    }
    int i8;
    if ((paramzjf.B().s()) && (paramzjf.G().q()) && (((zbfd)localObject3).ai() != 57) && (((zbfd)localObject3).ai() != 59))
    {
      i6 = a(localzr, paramzjf.G(), bool1, (zbfd)localObject3, localzp1);
      i8 = 0;
      if (bool1) {
        i8 = localzp1.e();
      } else {
        i8 = localzp1.f();
      }
      if ((bool14) && (paramzjf.G().l.size() > 3) && (i6 > i8) && (i8 != 0))
      {
        double d16 = paramzjf.G().z();
        paramzjf.G().l.clear();
        paramzjf.G().i(bool14);
        paramzjf.G().j(bool15);
        paramzjf.G().h(bool16);
        paramzjf.G().g(bool17);
        a(localzr, paramzjf.G(), d4, d3, bool13, paramzjf.G().l, ((zbfd)localObject3).ai(), localzp1, bool1, ((zbff)localObject1).c(0));
        if (paramzjf.G().z() > d16) {
          zbv.a(localzr, paramzjf.G(), (zbfd)localObject3, bool1);
        }
      }
    }
    if ((paramzjf.B().s()) && (paramzjf.e().q()) && (((zbfd)localObject3).ai() == 60))
    {
      i6 = a(localzr, paramzjf.e(), true, (zbfd)localObject3, localzp1);
      i8 = localzp1.e();
      if ((bool7) && (paramzjf.e().l.size() > 3) && (i6 > i8) && (i8 != 0))
      {
        paramzjf.e().l.clear();
        paramzjf.e().i(bool7);
        paramzjf.e().j(bool8);
        paramzjf.e().h(bool9);
        paramzjf.e().g(bool10);
        a(localzr, paramzjf.e(), paramzjf.e().l, localzp1, ((zbfd)localObject3).ai(), (zbff)localObject1, bool1);
      }
    }
    if ((bool1) && (bool14) && (!paramzjf.G().n())) {
      a(paramzjf.G(), d5, d7, paramzjf.N(), localzp1.e(), bool1, localzbff.c(0), bool16, bool17, bool14);
    }
    if (c(paramzjf.N())) {
      zew.a(false, localzr, localzbff, localzp1, localzbff.h(), bool7, bool8, bool9, bool10, bool14, bool15, bool16, bool17);
    }
    paramzjf.B().z();
    localzp1 = paramzjf.B().a;
    float f4;
    com.aspose.cells.b.a.b.zo localzo1;
    com.aspose.cells.b.a.b.zo localzo2;
    if (paramzjf.e().q()) {
      if (bool1)
      {
        f4 = a(paramzjf.G(), localzp1.c(), localzp1.e(), bool1);
        localzo1 = new com.aspose.cells.b.a.b.zo(f4, localzp1.d());
        localzo2 = new com.aspose.cells.b.a.b.zo(f4, localzp1.j());
        if (paramzjf.e().p())
        {
          paramzjf.e().a(localzo1);
          paramzjf.e().b(localzo2);
        }
        else
        {
          paramzjf.e().a(localzo2);
          paramzjf.e().b(localzo1);
        }
      }
      else
      {
        f4 = a(paramzjf.G(), localzp1.d(), localzp1.f(), bool1);
        localzo1 = new com.aspose.cells.b.a.b.zo(localzp1.c(), f4);
        localzo2 = new com.aspose.cells.b.a.b.zo(localzp1.i(), f4);
        if (!paramzjf.e().p())
        {
          paramzjf.e().a(localzo1);
          paramzjf.e().b(localzo2);
        }
        else
        {
          paramzjf.e().a(localzo2);
          paramzjf.e().b(localzo1);
        }
      }
    }
    if (paramzjf.h().q()) {
      if (bool2)
      {
        f4 = a(paramzjf.I(), localzp1.c(), localzp1.e(), bool2);
        localzo1 = new com.aspose.cells.b.a.b.zo(f4, localzp1.d());
        localzo2 = new com.aspose.cells.b.a.b.zo(f4, localzp1.j());
        if (paramzjf.g().p())
        {
          paramzjf.g().a(localzo1);
          paramzjf.g().b(localzo2);
        }
        else
        {
          paramzjf.g().a(localzo2);
          paramzjf.g().b(localzo1);
        }
      }
      else
      {
        f4 = a(paramzjf.I(), localzp1.d(), localzp1.f(), bool2);
        localzo1 = new com.aspose.cells.b.a.b.zo(localzp1.c(), f4);
        localzo2 = new com.aspose.cells.b.a.b.zo(localzp1.i(), f4);
        if (!paramzjf.g().p())
        {
          paramzjf.g().a(localzo1);
          paramzjf.g().b(localzo2);
        }
        else
        {
          paramzjf.g().a(localzo2);
          paramzjf.g().b(localzo1);
        }
      }
    }
    if (paramzjf.F().q()) {
      if (bool1)
      {
        f4 = a(paramzjf.e(), localzp1.d(), localzp1.f(), bool1, (zbff)localObject1);
        localzo1 = new com.aspose.cells.b.a.b.zo(localzp1.c(), f4);
        localzo2 = new com.aspose.cells.b.a.b.zo(localzp1.i(), f4);
        if (!paramzjf.G().p())
        {
          paramzjf.G().a(localzo1);
          paramzjf.G().b(localzo2);
        }
        else
        {
          paramzjf.G().a(localzo2);
          paramzjf.G().b(localzo1);
        }
      }
      else
      {
        f4 = 0.0F;
        if ((((zbfd)localObject3).ai() == 12) || (((zbfd)localObject3).ai() == 60)) {
          f4 = a(paramzjf.e(), localzp1.c(), localzp1.e(), !bool1);
        } else {
          f4 = a(paramzjf.e(), localzp1.c(), localzp1.e(), bool1, (zbff)localObject1);
        }
        localzo1 = new com.aspose.cells.b.a.b.zo(f4, localzp1.d());
        localzo2 = new com.aspose.cells.b.a.b.zo(f4, localzp1.j());
        if (paramzjf.G().p())
        {
          paramzjf.G().a(localzo1);
          paramzjf.G().b(localzo2);
        }
        else
        {
          paramzjf.G().a(localzo2);
          paramzjf.G().b(localzo1);
        }
      }
    }
    if (paramzjf.I().q()) {
      if (bool2)
      {
        f4 = a(paramzjf.g(), localzp1.d(), localzp1.f(), bool2, (zbff)localObject2);
        localzo1 = new com.aspose.cells.b.a.b.zo(localzp1.c(), f4);
        localzo2 = new com.aspose.cells.b.a.b.zo(localzp1.i(), f4);
        if (!paramzjf.I().p())
        {
          paramzjf.I().a(localzo1);
          paramzjf.I().b(localzo2);
        }
        else
        {
          paramzjf.I().a(localzo2);
          paramzjf.I().b(localzo1);
        }
      }
      else
      {
        f4 = 0.0F;
        if ((localzbfd.ai() == 12) || (localzbfd.ai() == 60)) {
          f4 = a(paramzjf.g(), localzp1.c(), localzp1.e(), !bool2);
        } else {
          f4 = a(paramzjf.g(), localzp1.c(), localzp1.e(), bool2, (zbff)localObject2);
        }
        localzo1 = new com.aspose.cells.b.a.b.zo(f4, localzp1.d());
        localzo2 = new com.aspose.cells.b.a.b.zo(f4, localzp1.j());
        if (paramzjf.I().p())
        {
          paramzjf.I().a(localzo1);
          paramzjf.I().b(localzo2);
        }
        else
        {
          paramzjf.I().a(localzo2);
          paramzjf.I().b(localzo1);
        }
      }
    }
    h(paramzjf);
    paramzjf.k = true;
  }
  
  static void b(zjf paramzjf)
    throws Exception
  {
    if (!paramzjf.k) {
      a(paramzjf);
    }
    zbxk.a(paramzjf, paramzjf.z());
    com.aspose.cells.b.a.b.a.zf localzf = null;
    zr localzr = paramzjf.ap();
    zbff localzbff1 = paramzjf.z();
    if ((paramzjf.z().getCount() == 0) || (a(paramzjf.z().i()) == 0)) {
      return;
    }
    zbff localzbff2 = new zbff(paramzjf);
    zbff localzbff3 = new zbff(paramzjf);
    Object localObject1 = localzbff1.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localzbfd1 = (zbfd)((Iterator)localObject1).next();
      if (localzbfd1.ah() == 1) {
        localzbff2.a(localzbfd1);
      } else {
        localzbff3.a(localzbfd1);
      }
    }
    localObject1 = localzbff2.c(0);
    zbfd localzbfd1 = new zbfd(paramzjf, null, 14);
    if (localzbff3.getCount() > 0) {
      localzbfd1 = localzbff3.c(0);
    }
    boolean bool1 = a(((zbfd)localObject1).ai());
    boolean bool2 = a(localzbfd1.ai());
    int i = a(localzbff2.i());
    int j = a(localzbff3.i());
    if (paramzjf.e().r) {}
    boolean bool3 = paramzjf.B().E();
    paramzjf.B().H();
    com.aspose.cells.b.a.b.zp localzp = paramzjf.B().a;
    float f1 = a(paramzjf.G(), localzp.c(), localzp.e(), bool1);
    double d1 = paramzjf.G().l();
    float f2 = a(paramzjf.I(), localzp.c(), localzp.e(), bool2);
    double d2 = paramzjf.I().l();
    float f3 = a(paramzjf.G(), localzp.d(), localzp.f(), bool1);
    float f4 = a(paramzjf.I(), localzp.d(), localzp.f(), bool2);
    float f5 = a(paramzjf.e(), localzp.d(), localzp.f(), bool1, localzbff2);
    float f6 = a(paramzjf.g(), localzp.d(), localzp.f(), bool2, localzbff3);
    float f7 = 0.0F;
    float f8 = 0.0F;
    if ((((zbfd)localObject1).ai() == 12) || (((zbfd)localObject1).ai() == 60)) {
      f7 = a(paramzjf.e(), localzp.c(), localzp.e(), !bool1);
    } else {
      f7 = a(paramzjf.e(), localzp.c(), localzp.e(), bool1, localzbff2);
    }
    if ((localzbfd1.ai() == 12) || (localzbfd1.ai() == 60)) {
      f8 = a(paramzjf.g(), localzp.c(), localzp.e(), !bool2);
    } else {
      f8 = a(paramzjf.g(), localzp.c(), localzp.e(), bool2, localzbff3);
    }
    if ((((zbfd)localObject1).ai() == 57) || (((zbfd)localObject1).ai() == 59))
    {
      zbv.a(localzr, paramzjf.G(), localzp, i);
    }
    else
    {
      zbv.a(localzr, paramzjf.e(), localzp, bool1, (zbfd)localObject1);
      zbv.a(localzr, paramzjf.G(), localzp, bool1, (zbfd)localObject1);
    }
    if ((localzbfd1.ai() == 57) || (localzbfd1.ai() == 59))
    {
      zbv.a(localzr, paramzjf.I(), localzp, j);
    }
    else
    {
      zbv.a(localzr, paramzjf.g(), localzp, bool2, localzbfd1);
      zbv.a(localzr, paramzjf.I(), localzp, bool2, localzbfd1);
    }
    int k = 0;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    double d3 = 0.0D;
    ArrayList localArrayList1 = localzbff1.k();
    zbfd localzbfd2 = (zbfd)localArrayList1.get(0);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    ArrayList localArrayList5 = new ArrayList();
    ArrayList localArrayList6 = new ArrayList();
    ArrayList localArrayList7 = new ArrayList();
    int m = 0;
    int n = 0;
    zbfd localzbfd4;
    Object localObject2;
    for (int i1 = 0; (i1 < localArrayList1.size()) && (!bool3); i1++)
    {
      localzbfd4 = (zbfd)localArrayList1.get(i1);
      if (localzbfd4.ah() == 1)
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
      if (paramzjf.b) {
        if (paramzjf.G() == paramzjf.c)
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
      if (localzbfd4.b(new int[] { 14 }))
      {
        localObject2 = zlr.a(localzr, localzbfd4, localzp, f10, d3, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 15 }))
      {
        localObject2 = zlr.a(localzr, localzbfd4, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 16 }))
      {
        localObject2 = zlr.b(localzr, localzbfd4, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 6 }))
      {
        localObject2 = zck.a(localzr, paramzjf, localzbfd4, localzp, f9, d3, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList4, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 7 }))
      {
        localObject2 = zck.a(localzr, paramzjf, localzbfd4, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList4, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 8 }))
      {
        localObject2 = zck.b(localzr, paramzjf, localzbfd4, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList4, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 0 }))
      {
        localObject2 = zbb.a(localzr, paramzjf, localzbfd4, localzp, f10, d3, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 1 }))
      {
        localObject2 = zbb.a(localzr, paramzjf, localzbfd4, localzp, f10, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 2 }))
      {
        localObject2 = zbb.b(localzr, paramzjf, localzbfd4, localzp, f10, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, (Collection)localObject2);
      }
      else if ((localzbfd4.c(new int[] { 44 })) && (m == 0))
      {
        zawk.a(localzr, localzp, localzbfd4, localArrayList6, localArrayList7);
        m = 1;
      }
      else if ((localzbfd4.c(new int[] { 35 })) && (n == 0))
      {
        zawk.a(localzr, localzp, localzbfd4, localArrayList6, localArrayList7);
        n = 1;
      }
      else if (localzbfd4.c(new int[] { 59 }))
      {
        localObject2 = zayl.a(localzr, localzbfd4, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList5, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 37, 40 }))
      {
        zlr.a(localzr, localzbfd4, localzp, f10, d3, k, true);
      }
      else if (localzbfd4.b(new int[] { 38, 41 }))
      {
        zlr.a(localzr, localzbfd4, localzp, f10, k, true);
      }
      else if (localzbfd4.b(new int[] { 39, 42 }))
      {
        zlr.b(localzr, localzbfd4, localzp, f10, k, true);
      }
      else if (localzbfd4.c(new int[] { 60 }))
      {
        zbzu.a(localzr, localzbfd4, localzp, f10, d3, k, true);
      }
      else if (localzbfd4.b(new int[] { 12, 13 }))
      {
        zew.a(localzr, localzbfd4, localzp, f10, d3, k, true);
      }
      else if (localzbfd4.b(new int[] { 78 }))
      {
        localObject2 = zlr.b(localzr, localzbfd4, localzp, f10, d3, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 77 }))
      {
        zlr.a(localzr, localzbfd4, localzp);
      }
      else if (localzbfd4.b(new int[] { 76 }))
      {
        zawk.a(localzr, localzp, localzbfd4);
      }
      else if (!localzbfd4.b(new int[] { 79 })) {}
    }
    zbfd localzbfd3;
    if ((!((zbfd)localObject1).aw()) && (paramzjf.e().q()) && (((zbfd)localObject1).ai() != 57) && (((zbfd)localObject1).ai() != 59)) {
      if (bool1)
      {
        zbv.b(localzr, paramzjf.e(), paramzjf.G().p(), f1, localzp, i);
      }
      else if (((((zbfd)localObject1).ai() == 60) || (((zbfd)localObject1).ai() == 12)) && (("valAx".equals(paramzjf.e().U())) || (("".equals(paramzjf.e().U())) && (!paramzjf.e().p))))
      {
        localzbfd3 = a(localzbff2);
        zbv.a(localzr, paramzjf.e(), paramzjf.G().p(), f3, localzp, localzbfd3);
      }
      else
      {
        zbv.a(localzr, paramzjf.e(), paramzjf.G().p(), f3, localzp, i);
      }
    }
    if ((!localzbfd1.aw()) && (paramzjf.g().q()) && (localzbfd1.ai() != 57) && (localzbfd1.ai() != 59)) {
      if (bool2)
      {
        zbv.b(localzr, paramzjf.g(), paramzjf.I().p(), f2, localzp, j);
      }
      else if ((localzbfd1.ai() == 60) || (localzbfd1.ai() == 12))
      {
        localzbfd3 = a(localzbff3);
        zbv.a(localzr, paramzjf.g(), paramzjf.I().p(), f4, localzp, localzbfd3);
      }
      else
      {
        zbv.a(localzr, paramzjf.g(), paramzjf.I().p(), f4, localzp, j);
      }
    }
    if (paramzjf.G().q()) {
      if (bool1) {
        zbv.b(localzr, paramzjf.G(), paramzjf.e().p(), f5, localzp, (zbfd)localObject1);
      } else if ((((zbfd)localObject1).ai() != 57) && (((zbfd)localObject1).ai() != 59)) {
        zbv.c(localzr, paramzjf.G(), paramzjf.e().p(), f7, localzp, (zbfd)localObject1);
      }
    }
    if (paramzjf.I().q()) {
      if (bool2) {
        zbv.b(localzr, paramzjf.I(), paramzjf.g().p(), f6, localzp, localzbfd1);
      } else if ((localzbfd1.ai() != 57) && (localzbfd1.ai() != 59)) {
        zbv.c(localzr, paramzjf.I(), paramzjf.g().p(), f8, localzp, localzbfd1);
      }
    }
    for (int i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      localzbfd4 = (zbfd)localArrayList1.get(i2);
      if (!localzbfd4.ay())
      {
        zbxy.a(localzr, localzbfd4.x(), localzbfd4.ai(), localzp);
        zbxy.a(localzr, localzbfd4.y(), localzbfd4.ai(), localzp);
      }
    }
    for (i2 = 0; (i2 < localArrayList1.size()) && (!bool3); i2++)
    {
      localzbfd4 = (zbfd)localArrayList1.get(i2);
      if (localzbfd4.ah() == 1)
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
      if (paramzjf.b) {
        if (paramzjf.G() == paramzjf.c)
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
      if (localzbfd4.b(new int[] { 37, 40 }))
      {
        localObject2 = zlr.a(localzr, localzbfd4, localzp, f10, d3, k, false);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 38, 41 }))
      {
        localObject2 = zlr.a(localzr, localzbfd4, localzp, f10, k, false);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 39, 42 }))
      {
        localObject2 = zlr.b(localzr, localzbfd4, localzp, f10, k, false);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, (Collection)localObject2);
      }
      else if (localzbfd4.c(new int[] { 57 }))
      {
        localObject2 = zayl.a(localzr, localzbfd4, localzp, k);
        com.aspose.cells.b.a.a.zf.a(localArrayList5, (Collection)localObject2);
      }
    }
    for (i2 = 0; (i2 < localArrayList1.size()) && (!bool3); i2++)
    {
      localzbfd4 = (zbfd)localArrayList1.get(i2);
      if (localzbfd4.ah() == 1)
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
      if (paramzjf.b) {
        if (paramzjf.G() == paramzjf.c)
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
      if (localzbfd4.b != null) {
        zbzu.a(localzr, localzbfd4, localzbfd4.b, localzp);
      }
    }
    for (i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      localzbfd4 = (zbfd)localArrayList1.get(i2);
      if (localzbfd4.ay())
      {
        zbxy.a(localzr, localzbfd4.x(), localzbfd4.ai(), localzp);
        zbxy.a(localzr, localzbfd4.y(), localzbfd4.ai(), localzp);
      }
    }
    for (i2 = 0; (i2 < localArrayList1.size()) && (!bool3); i2++)
    {
      localzbfd4 = (zbfd)localArrayList1.get(i2);
      if (localzbfd4.ah() == 1)
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
      if (paramzjf.b) {
        if (paramzjf.G() == paramzjf.c)
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
      if (localzbfd4.c(new int[] { 60 }))
      {
        localObject2 = zbzu.a(localzr, localzbfd4, localzp, f10, d3, k, false);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, (Collection)localObject2);
      }
      else if (localzbfd4.b(new int[] { 12, 13 }))
      {
        localObject2 = zew.a(localzr, localzbfd4, localzp, f10, d3, k, false);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, (Collection)localObject2);
      }
    }
    for (i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      localzbfd4 = (zbfd)localArrayList1.get(i2);
      if (localzbfd4.ah() == 1)
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
      if (localzbfd4.H().getCount() > 0) {
        if ((localzbfd4.ai() == 6) || (localzbfd4.ai() == 7) || (localzbfd4.ai() == 8)) {
          zbxk.b(localzr, localzbfd4, localzp, f9, d3);
        } else {
          zbxk.a(localzr, localzbfd4, localzp, f10, d3);
        }
      }
    }
    zlr.a(localzr, paramzjf, localArrayList2);
    zlr.b(localzr, paramzjf, localArrayList3);
    zck.a(localzr, paramzjf, localzp, localArrayList4);
    zayl.a(localzr, paramzjf, localArrayList5);
    zawk.a(localzr, paramzjf, localArrayList6);
    zawk.b(localzr, paramzjf, localArrayList7);
    if (paramzjf.M().o()) {
      paramzjf.M().p();
    }
    localzf = null;
    i2 = 0;
    if ((paramzjf.i().c().k()) && (paramzjf.ap().i() != 4))
    {
      localzf = paramzjf.ap().d();
      i2 = 1;
      paramzjf.ap().b(4, false);
    }
    if (((zbfd)localObject1).aw()) {
      zbv.a(localzr, localzbff2, paramzjf.e(), localzp);
    } else if ((paramzjf.e().q()) && (((zbfd)localObject1).ai() != 57) && (((zbfd)localObject1).ai() != 59)) {
      if (bool1)
      {
        zbv.c(localzr, paramzjf.e(), paramzjf.G().p(), f1, localzp, i);
      }
      else if (((((zbfd)localObject1).ai() == 60) || (((zbfd)localObject1).ai() == 12)) && (("valAx".equals(paramzjf.e().U())) || (("".equals(paramzjf.e().U())) && (!paramzjf.e().p))))
      {
        localzbfd4 = a(localzbff2);
        zbv.f(localzr, paramzjf.e(), paramzjf.G().p(), f3, localzp, localzbfd4);
      }
      else
      {
        zbv.a(localzr, paramzjf.e(), paramzjf.G().p(), f3, localzp, i, bool1);
      }
    }
    if (localzbfd1.aw()) {
      zbv.a(localzr, localzbff3, paramzjf.g(), localzp);
    } else if ((paramzjf.g().q()) && (localzbfd1.ai() != 57) && (localzbfd1.ai() != 59)) {
      if (bool2)
      {
        zbv.c(localzr, paramzjf.g(), paramzjf.I().p(), f2, localzp, j);
      }
      else if ((localzbfd1.ai() == 60) || (localzbfd1.ai() == 12))
      {
        localzbfd4 = a(localzbff3);
        zbv.f(localzr, paramzjf.g(), paramzjf.I().p(), f4, localzp, localzbfd4);
      }
      else
      {
        zbv.a(localzr, paramzjf.g(), paramzjf.I().p(), f4, localzp, j, bool2);
      }
    }
    if (paramzjf.G().q()) {
      if (bool1) {
        zbv.e(localzr, paramzjf.G(), paramzjf.e().p(), f5, localzp, (zbfd)localObject1);
      } else if ((((zbfd)localObject1).ai() == 57) || (((zbfd)localObject1).ai() == 59)) {
        zbv.b(localzr, localzbff2, paramzjf.G(), localzp);
      } else {
        zbv.d(localzr, paramzjf.G(), paramzjf.e().p(), f7, localzp, (zbfd)localObject1);
      }
    }
    if (paramzjf.I().q()) {
      if (bool2) {
        zbv.e(localzr, paramzjf.I(), paramzjf.g().p(), f6, localzp, localzbfd1);
      } else if ((localzbfd1.ai() == 57) || (localzbfd1.ai() == 59)) {
        zbv.b(localzr, localzbff3, paramzjf.I(), localzp);
      } else {
        zbv.d(localzr, paramzjf.I(), paramzjf.g().p(), f8, localzp, localzbfd1);
      }
    }
    if ((paramzjf.i().c().k()) && (i2 != 0)) {
      paramzjf.ap().a(localzf);
    }
    localzf = null;
    i2 = 0;
    if ((paramzjf.i().c().k()) && (paramzjf.B().c().k()) && (paramzjf.ap().i() != 4))
    {
      localzf = paramzjf.ap().d();
      i2 = 1;
      paramzjf.ap().b(4, false);
    }
    for (int i3 = 0; i3 < localArrayList1.size(); i3++)
    {
      localObject2 = (zbfd)localArrayList1.get(i3);
      zbxk.a(localzr, (zbfd)localObject2);
    }
    if ((paramzjf.i().c().k()) && (paramzjf.B().c().k()) && (i2 != 0)) {
      paramzjf.ap().a(localzf);
    }
    if (paramzjf.e().S().o()) {
      paramzjf.e().S().p();
    }
    if (paramzjf.G().S().o()) {
      paramzjf.G().S().p();
    }
    if ((paramzjf.g().S().o()) && (localzbff3.getCount() > 0)) {
      paramzjf.g().S().p();
    }
    if ((paramzjf.I().S().o()) && (localzbff3.getCount() > 0)) {
      paramzjf.I().S().p();
    }
    if (paramzjf.u())
    {
      i3 = (a(paramzjf.e())) || (e(paramzjf.N())) ? 1 : 0;
      if (i3 != 0)
      {
        paramzjf.k().a.a(paramzjf.B().a.c());
        paramzjf.k().a.c(paramzjf.B().a.e());
      }
      else
      {
        paramzjf.k().a.a(paramzjf.B().a.c());
        paramzjf.k().a.b(paramzjf.B().a.j());
        paramzjf.k().a.c(paramzjf.B().a.e());
      }
      zjs.a(localzr, paramzjf.k(), paramzjf.k().a.c(), paramzjf.k().a.d(), paramzjf.k().a.e(), bool1, bool2);
    }
    boolean bool4 = paramzjf.x().b;
    if (paramzjf.v())
    {
      localzf = null;
      i2 = 0;
      if ((paramzjf.i().c().k()) && (paramzjf.x().c().c().k()) && (paramzjf.ap().i() != 4))
      {
        localzf = paramzjf.ap().d();
        i2 = 1;
        paramzjf.ap().b(4, false);
      }
      if ((localzbff3.getCount() == 0) && ((((zbfd)localObject1).ai() == 44) || (((zbfd)localObject1).ai() == 35) || (bool4)))
      {
        localObject2 = localObject1;
        if ((((zbfd)localObject1).m() == 35) || (((zbfd)localObject1).m() == 36)) {
          for (int i4 = 1; i4 < paramzjf.z().getCount(); i4++) {
            if ((paramzjf.z().a(i4).k() != null) && (((zbfd)localObject2).F() != null) && (paramzjf.z().a(i4).k().getCount() > ((zbfd)localObject2).F().getCount())) {
              localObject2 = paramzjf.z().c(i4);
            }
          }
        }
        if (((((zbfd)localObject1).ai() == 35) && (!((zbfd)localObject1).J()) && (localzbff2.getCount() > 1)) || (g(paramzjf))) {
          zanb.a(localzr, paramzjf.x(), bool1, (zbfd)localObject1);
        } else {
          zanb.a(localzr, paramzjf.x(), (zbfd)localObject2);
        }
      }
      else
      {
        zanb.a(localzr, paramzjf.x(), bool1, (zbfd)localObject1);
      }
      if ((paramzjf.i().c().k()) && (paramzjf.x().c().c().k()) && (i2 != 0)) {
        paramzjf.ap().a(localzf);
      }
    }
  }
  
  private static zbfd a(zbff paramzbff)
  {
    for (int i = 0; i < paramzbff.getCount(); i++)
    {
      zbfd localzbfd = paramzbff.c(i);
      for (int j = 0; j < localzbfd.k().getCount(); j++) {
        if (!localzbfd.k().a(j).a()) {
          return localzbfd;
        }
      }
    }
    return paramzbff.c(0);
  }
  
  private static boolean g(zjf paramzjf)
  {
    int i = 0;
    int j = 0;
    for (int k = 1; k < paramzjf.z().getCount(); k++)
    {
      if (paramzjf.z().c(k).c(new int[] { 44 })) {
        i = 1;
      }
      if (paramzjf.z().c(k).c(new int[] { 35 })) {
        j = 1;
      }
    }
    return (i != 0) && (j != 0);
  }
  
  static String c(zjf paramzjf)
  {
    zbff localzbff1 = paramzjf.z();
    zbff localzbff2 = new zbff(paramzjf);
    zbff localzbff3 = new zbff(paramzjf);
    Object localObject = localzbff1.iterator();
    zbfd localzbfd1;
    while (((Iterator)localObject).hasNext())
    {
      localzbfd1 = (zbfd)((Iterator)localObject).next();
      if (localzbfd1.ah() == 1) {
        localzbff2.a(localzbfd1);
      } else {
        localzbff3.a(localzbfd1);
      }
    }
    if (localzbff2.getCount() == 0) {
      return "Plot series are all on secondary axis. Must set one or more of Plot series on primary axis!";
    }
    b(localzbff1);
    localObject = new zbfd(paramzjf, null, 14);
    if (localzbff3.getCount() > 0)
    {
      localObject = localzbff3.c(0);
    }
    else
    {
      paramzjf.g().d(false);
      paramzjf.g().S().a("");
      paramzjf.I().d(false);
      paramzjf.I().S().a("");
      localzbfd1 = localzbff2.c(0);
      int i = 0;
      int j = 0;
      zbfd localzbfd2;
      for (int k = 0; k < localzbff2.getCount(); k++)
      {
        localzbfd2 = localzbff2.c(k);
        if ((localzbfd2.ai() == 44) || (localzbfd2.ai() == 35)) {
          i = 1;
        } else {
          j = 1;
        }
      }
      if ((i != 0) && (j != 0)) {
        for (k = 0; k < localzbff2.getCount(); k++)
        {
          localzbfd2 = localzbff2.c(k);
          if ((localzbfd2.ai() == 44) || (localzbfd2.ai() == 35))
          {
            localzbfd2.n(2);
            localzbff3.a(localzbfd2);
          }
        }
      }
    }
    return "";
  }
  
  private static void b(zbff paramzbff)
  {
    Iterator localIterator = paramzbff.iterator();
    while (localIterator.hasNext())
    {
      zbfd localzbfd = (zbfd)localIterator.next();
      localzbfd.o(localzbfd.m());
      switch (localzbfd.m())
      {
      case 0: 
      case 14: 
      case 37: 
      case 40: 
        localzbfd.o(14);
        break;
      case 6: 
        localzbfd.o(6);
        break;
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 49: 
        localzbfd.o(44);
        break;
      case 35: 
      case 36: 
      case 48: 
        localzbfd.o(35);
        break;
      case 1: 
      case 15: 
      case 38: 
      case 41: 
        localzbfd.o(15);
        break;
      case 2: 
      case 16: 
      case 39: 
      case 42: 
        localzbfd.o(16);
        break;
      case 7: 
        localzbfd.o(7);
        break;
      case 8: 
        localzbfd.o(8);
        break;
      case 60: 
      case 61: 
      case 62: 
      case 63: 
      case 64: 
        localzbfd.o(60);
        break;
      case 57: 
      case 58: 
        localzbfd.o(57);
        break;
      case 59: 
        localzbfd.o(59);
        break;
      case 12: 
      case 13: 
        localzbfd.o(12);
        break;
      case 19: 
        localzbfd.o(19);
        break;
      case 20: 
        localzbfd.o(20);
      }
    }
  }
  
  private static void a(zjf paramzjf, zbff paramzbff1, zbff paramzbff2)
  {
    zbff localzbff = paramzjf.z();
    Iterator localIterator = localzbff.iterator();
    while (localIterator.hasNext())
    {
      zbfd localzbfd = (zbfd)localIterator.next();
      if ((localzbfd.ai() != 60) && (localzbfd.ai() != 12)) {
        localzbfd.y().a(2);
      }
      switch (localzbfd.ai())
      {
      case 35: 
      case 44: 
      case 76: 
      case 77: 
        if (localzbfd.K()) {
          localzbfd.c(true);
        }
        paramzjf.c(false);
        if (localzbfd.ah() == 1)
        {
          paramzjf.e().d(false);
          paramzjf.e().S().a("");
          paramzjf.G().d(false);
          paramzjf.G().S().a("");
          paramzjf.e().w().a(0);
          paramzjf.e().A().a(0);
          paramzjf.G().w().a(0);
          paramzjf.G().A().a(0);
        }
        else
        {
          paramzjf.g().d(false);
          paramzjf.g().S().a("");
          paramzjf.I().d(false);
          paramzjf.I().S().a("");
          paramzjf.g().w().a(0);
          paramzjf.g().A().a(0);
          paramzjf.I().w().a(0);
          paramzjf.I().A().a(0);
        }
        break;
      case 57: 
      case 59: 
        paramzjf.c(false);
        if (localzbfd.ah() == 1)
        {
          paramzjf.e().d(1);
          paramzjf.e().S().a("");
          paramzjf.G().S().a("");
          paramzjf.e().w().a(0);
          paramzjf.e().A().a(0);
        }
        else
        {
          paramzjf.g().d(1);
          paramzjf.g().S().a("");
          paramzjf.I().S().a("");
          paramzjf.g().w().a(0);
          paramzjf.g().A().a(0);
        }
        break;
      }
    }
    if (paramzjf.e().r)
    {
      a(localzbff, paramzjf.e());
      paramzjf.g().p = paramzjf.e().p;
      paramzjf.g().a(paramzjf.e().f());
    }
    else
    {
      a(paramzbff1, paramzjf.e());
      a(paramzbff2, paramzjf.g());
    }
  }
  
  private static boolean a(zbt paramzbt, boolean paramBoolean1, boolean paramBoolean2, zbfd paramzbfd)
  {
    if (paramzbt.q()) {
      return false;
    }
    if (!l(paramzbt.e())) {
      return false;
    }
    if ((paramBoolean1) && (!paramBoolean2)) {
      return false;
    }
    return !paramzbfd.av();
  }
  
  private static void a(zbff paramzbff, zbt paramzbt)
  {
    int i = 0;
    int j = 0;
    Iterator localIterator = paramzbff.iterator();
    while (localIterator.hasNext())
    {
      zbfd localzbfd = (zbfd)localIterator.next();
      if (localzbfd.ai() == 60) {
        i = 1;
      } else {
        j = 1;
      }
    }
    if ((i != 0) && (j == 0))
    {
      paramzbt.a(false);
      paramzbt.s = true;
    }
    if ((i != 0) && (j != 0)) {
      paramzbt.p = true;
    }
  }
  
  private static boolean c(zbff paramzbff)
  {
    int i = 0;
    int j = 0;
    Iterator localIterator = paramzbff.iterator();
    while (localIterator.hasNext())
    {
      zbfd localzbfd = (zbfd)localIterator.next();
      if (localzbfd.ai() == 60) {
        i = 1;
      } else {
        j = 1;
      }
    }
    return (i != 0) && (j == 0);
  }
  
  private static void a(zanr paramzanr, int paramInt)
  {
    if (paramzanr.c() != 1) {
      return;
    }
    zaoa localzaoa = paramzanr.g();
    localzaoa.a(paramInt);
  }
  
  static void d(zjf paramzjf)
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    Color[] arrayOfColor1 = paramzjf.Z().a().a(paramzjf.R(), localzbff.n());
    Color localColor1 = paramzjf.Z().a().a("lt1");
    Color localColor2 = paramzjf.Z().a().a("dk1");
    Object localObject2;
    Object localObject3;
    for (int j = 0; j < i; j++)
    {
      zbfd localzbfd1 = localzbff.c(j);
      int n = localzbfd1.al();
      int i1 = localzbfd1.m();
      if (i1 != 77)
      {
        Color localColor3 = arrayOfColor1[n];
        Color localColor4 = arrayOfColor1[n];
        localObject2 = localColor4;
        localzbfd1.A().c(localColor3);
        int i5;
        if (localzbfd1.am())
        {
          localzbfd1.z().b(localColor4);
          if (paramzjf.R() <= 8) {
            a(localzbfd1.z(), 3);
          } else if (paramzjf.R() <= 24) {
            a(localzbfd1.z(), 5);
          } else if (paramzjf.R() <= 32) {
            a(localzbfd1.z(), 7);
          } else if (paramzjf.R() <= 48) {
            a(localzbfd1.z(), 5);
          }
        }
        else
        {
          if ((paramzjf.R() >= 9) && (paramzjf.R() <= 16))
          {
            localzbfd1.z().b(Color.a(255, a(localColor1)));
            a(localzbfd1.z(), 1);
          }
          else
          {
            Color localColor5;
            if (paramzjf.R() == 33)
            {
              localColor5 = paramzjf.Z().a().a(localColor2, 0.925D);
              localColor5 = Color.a(255, localColor5);
              localzbfd1.z().b(localColor5);
              a(localzbfd1.z(), 1);
            }
            else if (paramzjf.R() == 34)
            {
              localColor5 = paramzjf.Z().a().b(localColor4, 0.5D);
              localColor5 = Color.a(255, localColor5);
              localzbfd1.z().b(localColor5);
              a(localzbfd1.z(), 1);
            }
          }
          if ((paramzjf.R() >= 35) && (paramzjf.R() <= 40))
          {
            i5 = paramzjf.R() - 34;
            Color localColor6 = paramzjf.Z().a().a("accent" + i5);
            localColor6 = paramzjf.Z().a().b(localColor6, 0.5D);
            localColor6 = Color.a(255, localColor6);
            localzbfd1.z().b(localColor6);
            a(localzbfd1.z(), 1);
          }
        }
        if (localzbfd1.am())
        {
          localzbfd1.B().f().b((Color)localObject2);
          if (paramzjf.R() <= 8) {
            localzbfd1.B().d(7);
          } else if (paramzjf.R() <= 24) {
            localzbfd1.B().d(9);
          } else if (paramzjf.R() <= 32) {
            localzbfd1.B().d(13);
          } else if (paramzjf.R() <= 48) {
            localzbfd1.B().d(9);
          }
          localzbfd1.B().c(zanb.a(localzbfd1, n));
          i5 = localzbfd1.B().d();
          if ((i5 == 5) || (i5 == 6) || (i5 == 8)) {
            localzbfd1.B().e().c(Color.getEmpty());
          } else {
            localzbfd1.B().e().c((Color)localObject2);
          }
        }
        localObject3 = localzbfd1.F();
        int i6 = ((zkh)localObject3).getCount();
        Color[] arrayOfColor4 = paramzjf.Z().a().a(paramzjf.R(), i6);
        int i7;
        if ((localzbfd1.m() == 44) || (localzbfd1.m() == 45) || (localzbfd1.m() == 48) || (localzbfd1.m() == 49) || (localzbfd1.m() == 47) || (localzbfd1.m() == 46) || (localzbfd1.m() == 35) || (localzbfd1.m() == 36)) {
          i7 = 1;
        } else {
          i7 = 0;
        }
        int i8 = ((zkh)localObject3).getCount();
        for (int i9 = 0; i9 < i8; i9++)
        {
          zkf localzkf = ((zkh)localObject3).b(i9);
          if (localzkf != null)
          {
            Color localColor7;
            Color localColor8;
            if (((i7 != 0) && (localzbfd1.J())) || ((i7 == 0) && (localzbfd1.J()) && (i == 1)))
            {
              localColor7 = arrayOfColor4[i9];
              localColor8 = arrayOfColor4[i9];
              Color localColor9 = localColor8;
              localzkf.i().c(localColor7);
              int i11;
              if (localzbfd1.am())
              {
                localzkf.k().b(localColor8);
                if (paramzjf.R() <= 8) {
                  a(localzkf.k(), 3);
                } else if (paramzjf.R() <= 24) {
                  a(localzkf.k(), 5);
                } else if (paramzjf.R() <= 32) {
                  a(localzkf.k(), 7);
                } else if (paramzjf.R() <= 48) {
                  a(localzkf.k(), 5);
                }
              }
              else
              {
                if ((paramzjf.R() >= 9) && (paramzjf.R() <= 16))
                {
                  localzkf.k().b(Color.a(255, a(localColor1)));
                  a(localzkf.k(), 1);
                }
                else
                {
                  Color localColor10;
                  if (paramzjf.R() == 33)
                  {
                    localColor10 = paramzjf.Z().a().a(localColor2, 0.925D);
                    localColor10 = Color.a(255, localColor10);
                    localzkf.k().b(localColor10);
                    a(localzkf.k(), 1);
                  }
                  else if (paramzjf.R() == 34)
                  {
                    localColor10 = paramzjf.Z().a().b(localColor4, 0.5D);
                    localColor10 = Color.a(255, localColor10);
                    localzkf.k().b(localColor10);
                    a(localzkf.k(), 1);
                  }
                }
                if ((paramzjf.R() >= 35) && (paramzjf.R() <= 40))
                {
                  i11 = paramzjf.R() - 34;
                  Color localColor11 = paramzjf.Z().a().a("accent" + i11);
                  localColor11 = paramzjf.Z().a().b(localColor11, 0.5D);
                  localColor11 = Color.a(255, localColor11);
                  localzkf.k().b(localColor11);
                  a(localzkf.k(), 1);
                }
              }
              if (localzbfd1.am())
              {
                localzkf.m().f().b(localColor9);
                if (paramzjf.R() <= 8) {
                  localzkf.m().d(7);
                } else if (paramzjf.R() <= 24) {
                  localzkf.m().d(9);
                } else if (paramzjf.R() <= 32) {
                  localzkf.m().d(13);
                } else if (paramzjf.R() <= 48) {
                  localzkf.m().d(9);
                }
                localzkf.m().c(zanb.a(localzbfd1, i9));
                i11 = localzkf.m().d();
                if ((i11 == 5) || (i11 == 6) || (i11 == 8)) {
                  localzkf.m().e().c(Color.getEmpty());
                } else {
                  localzkf.m().e().c(localColor9);
                }
              }
            }
            else
            {
              localzkf.i().c(localColor3);
              int i10;
              if (localzbfd1.am())
              {
                localzkf.k().b(localColor4);
                if (paramzjf.R() <= 8) {
                  a(localzkf.k(), 3);
                } else if (paramzjf.R() <= 24) {
                  a(localzkf.k(), 5);
                } else if (paramzjf.R() <= 32) {
                  a(localzkf.k(), 7);
                } else if (paramzjf.R() <= 48) {
                  a(localzkf.k(), 5);
                }
              }
              else
              {
                if ((paramzjf.R() >= 9) && (paramzjf.R() <= 16))
                {
                  localzkf.k().b(Color.a(255, a(localColor1)));
                  a(localzkf.k(), 1);
                }
                else if (paramzjf.R() == 33)
                {
                  localColor7 = paramzjf.Z().a().a(localColor2, 0.925D);
                  localColor7 = Color.a(255, localColor7);
                  localzkf.k().b(localColor7);
                  a(localzkf.k(), 1);
                }
                else if (paramzjf.R() == 34)
                {
                  localColor7 = paramzjf.Z().a().b(localColor4, 0.5D);
                  localColor7 = Color.a(255, localColor7);
                  localzkf.k().b(localColor7);
                  a(localzkf.k(), 1);
                }
                if ((paramzjf.R() >= 35) && (paramzjf.R() <= 40))
                {
                  i10 = paramzjf.R() - 34;
                  localColor8 = paramzjf.Z().a().a("accent" + i10);
                  localColor8 = paramzjf.Z().a().b(localColor8, 0.5D);
                  localColor8 = Color.a(255, localColor8);
                  localzkf.k().b(localColor8);
                  a(localzkf.k(), 1);
                }
              }
              if (localzbfd1.am())
              {
                localzkf.m().f().b((Color)localObject2);
                if (paramzjf.R() <= 8) {
                  localzkf.m().d(7);
                } else if (paramzjf.R() <= 24) {
                  localzkf.m().d(9);
                } else if (paramzjf.R() <= 32) {
                  localzkf.m().d(13);
                } else if (paramzjf.R() <= 48) {
                  localzkf.m().d(9);
                }
                localzkf.m().c(zanb.a(localzbfd1, n));
                i10 = localzkf.m().d();
                if ((i10 == 5) || (i10 == 6) || (i10 == 8)) {
                  localzkf.m().e().c(Color.getEmpty());
                } else {
                  localzkf.m().e().c((Color)localObject2);
                }
              }
            }
          }
        }
      }
    }
    Object localObject1;
    int i4;
    if (paramzjf.N() == 78)
    {
      Color[] arrayOfColor2 = paramzjf.Z().a().a(paramzjf.R(), 3);
      for (int m = 0; m < i; m++)
      {
        localObject1 = localzbff.c(m);
        zkh localzkh = ((zbfd)localObject1).F();
        int i3 = localzkh.getCount();
        for (i4 = 0; i4 < i3; i4++)
        {
          localObject2 = localzkh.b(i4);
          if (localObject2 != null)
          {
            if (((zkf)localObject2).w() < 0.0D)
            {
              ((zkf)localObject2).k().b(arrayOfColor2[1]);
              ((zkf)localObject2).i().c(arrayOfColor2[1]);
            }
            else
            {
              ((zkf)localObject2).k().b(arrayOfColor2[0]);
              ((zkf)localObject2).i().c(arrayOfColor2[0]);
            }
            if (((zkf)localObject2).H())
            {
              ((zkf)localObject2).k().b(arrayOfColor2[2]);
              ((zkf)localObject2).i().c(arrayOfColor2[2]);
            }
          }
        }
      }
    }
    if ((paramzjf.N() == 77) || (paramzjf.N() == 76)) {
      for (int k = 0; k < i; k++)
      {
        zbfd localzbfd2 = localzbff.c(k);
        localzbfd2.z().b(localColor1);
        localObject1 = localzbfd2.F();
        int i2 = ((zkh)localObject1).getCount();
        Color[] arrayOfColor3 = paramzjf.Z().a().a(paramzjf.R(), i2);
        for (i4 = 0; i4 < i2; i4++)
        {
          localObject2 = ((zkh)localObject1).b(i4);
          if (localObject2 != null)
          {
            localObject3 = arrayOfColor3[i4];
            ((zkf)localObject2).i().c((Color)localObject3);
            ((zkf)localObject2).k().b(localColor1);
          }
        }
      }
    }
  }
  
  private static Color a(Color paramColor)
  {
    zlh localzlh1 = new zlh("r", paramColor.getR() & 0xFF);
    zlh localzlh2 = new zlh("g", paramColor.getG() & 0xFF);
    zlh localzlh3 = new zlh("b", paramColor.getB() & 0xFF);
    if ((localzlh1.b() != 0) && (localzlh2.b() != 0) && (localzlh3.b() != 0))
    {
      ArrayList localArrayList = new ArrayList();
      com.aspose.cells.b.a.a.zf.a(localArrayList, localzlh1);
      com.aspose.cells.b.a.a.zf.a(localArrayList, localzlh2);
      com.aspose.cells.b.a.a.zf.a(localArrayList, localzlh3);
      Collections.sort(localArrayList);
      zlh localzlh4 = (zlh)localArrayList.get(0);
      zlh localzlh5 = (zlh)localArrayList.get(1);
      zlh localzlh6 = (zlh)localArrayList.get(2);
      int i = localzlh4.b();
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        zlh localzlh7 = (zlh)localIterator.next();
        localzlh7.b(i - localzlh7.b());
      }
      int j = 42;
      int k = localzlh4.b() + localzlh5.b() + localzlh6.b();
      int m = localzlh4.c() + localzlh5.c() + localzlh6.c();
      int n = zbxz.c(k / j);
      if (k > 30)
      {
        int i1;
        if (localzlh6.c() == 0)
        {
          i1 = zbxz.a(n / 3);
          localzlh4.a(localzlh4.b() - i1);
          localzlh5.a(localzlh5.b() - i1);
          localzlh6.a(localzlh6.b() - i1);
        }
        else
        {
          localzlh4.a(localzlh4.b() - 1);
          n--;
          if (localzlh5.c() == 0)
          {
            localzlh5.a(localzlh5.b() - 1);
            n--;
            if (n > 0) {
              localzlh6.a(localzlh6.b() - n);
            } else {
              localzlh6.a(localzlh6.b() - 1);
            }
          }
          else
          {
            i1 = zbxz.a(localzlh5.c() / m * n);
            localzlh5.a(localzlh5.b() - i1);
            n -= i1;
            if (n > 0) {
              localzlh6.a(localzlh6.b() - n);
            } else {
              localzlh6.a(localzlh6.b() - 1);
            }
          }
        }
      }
    }
    return Color.fromArgb(localzlh1.b(), localzlh2.b(), localzlh3.b());
  }
  
  static void e(zjf paramzjf)
  {
    b(paramzjf.e());
    b(paramzjf.G());
    b(paramzjf.g());
    b(paramzjf.I());
    b(paramzjf.K());
  }
  
  private static void b(zbt paramzbt)
  {
    zbwv localzbwv = paramzbt.J();
    paramzbt.m(((int)localzbwv.a().h() - 1) / 3 + 1);
    if (localzbwv.a().h() < 6.0F) {
      paramzbt.m((int)localzbwv.a().h() / 2 + 1);
    }
    paramzbt.n((int)(paramzbt.aa() * 0.7F + 0.5F));
    if (paramzbt.ab() == paramzbt.aa()) {
      paramzbt.n(paramzbt.aa() - 1);
    }
    if (paramzbt.ab() < 1) {
      paramzbt.n(1);
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
  
  private static void a(zbt paramzbt, boolean paramBoolean)
  {
    zjf localzjf = paramzbt.e();
    if ((paramzbt.g() == 1) || (paramzbt.g() == 3)) {
      paramBoolean = !paramBoolean;
    }
    if ((paramBoolean) && (paramzbt.S().a)) {
      paramzbt.S().a(90);
    }
  }
  
  private static void b(zbt paramzbt, boolean paramBoolean)
  {
    zjf localzjf = paramzbt.e();
    if ((paramzbt.g() == 1) || (paramzbt.g() == 3)) {
      paramBoolean = !paramBoolean;
    }
    if ((paramBoolean) && (paramzbt.T().a())) {
      paramzbt.T().c(90);
    }
  }
  
  private static void a(zbt paramzbt, com.aspose.cells.b.a.b.zp[] paramArrayOfzp, boolean paramBoolean, com.aspose.cells.b.a.b.zs paramzs)
  {
    com.aspose.cells.b.a.b.zs localzs = new com.aspose.cells.b.a.b.zs(paramzs.b(), paramzs.c());
    zjf localzjf = paramzbt.e();
    if ((paramzbt.g() == 1) || (paramzbt.g() == 3)) {
      paramBoolean = !paramBoolean;
    }
    if (paramBoolean)
    {
      if (paramzbt.n)
      {
        paramzbt.S().e().b.a(paramArrayOfzp[0].c() + b / 2);
        paramArrayOfzp[0].a(paramArrayOfzp[0].c() + localzs.b() + b);
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + b));
      }
      else
      {
        paramzbt.S().e().b.a(paramArrayOfzp[0].i() - localzs.b() - b / 2);
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + b));
      }
    }
    else if (paramzbt.n)
    {
      paramzbt.S().e().b.b(paramArrayOfzp[0].j() - localzs.c() - b / 2);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + b));
    }
    else
    {
      paramzbt.S().e().b.b(paramArrayOfzp[0].d() + b / 2);
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + localzs.c() + b);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + b));
    }
    paramzbt.S().e().b.a(localzs);
  }
  
  private static void a(zbt paramzbt, com.aspose.cells.b.a.b.zp paramzp, boolean paramBoolean)
    throws Exception
  {
    com.aspose.cells.b.a.b.zs localzs = new com.aspose.cells.b.a.b.zs(paramzbt.S().e().b.b().b(), paramzbt.S().e().b.b().c());
    zjf localzjf = paramzbt.e();
    if ((paramzbt.g() == 1) || (paramzbt.g() == 3)) {
      paramBoolean = !paramBoolean;
    }
    if (paramBoolean)
    {
      if (paramzbt.n)
      {
        paramzbt.S().e().b.a(paramzp.c() - localzs.b());
        if (paramzbt.S().e().b.c() < 0) {
          paramzbt.S().e().b.a(0);
        }
      }
      else
      {
        paramzbt.S().e().b.a(paramzp.i());
        if (paramzbt.S().e().b.c() > localzjf.a() - localzs.b()) {
          paramzbt.S().e().b.a(localzjf.a() - localzs.b());
        }
      }
    }
    else if (paramzbt.n)
    {
      paramzbt.S().e().b.b(paramzp.j());
      if (paramzbt.S().e().b.d() > localzjf.b() - localzs.c()) {
        paramzbt.S().e().b.b(localzjf.b() - localzs.c());
      }
    }
    else
    {
      paramzbt.S().e().b.b(paramzp.d() - localzs.c());
      if (paramzbt.S().e().b.d() < 0) {
        paramzbt.S().e().b.b(0);
      }
    }
    if (paramzbt.S().e().b.c() < 0) {
      paramzbt.S().e().b.a(0);
    } else if (paramzbt.S().e().b.i() > localzjf.a()) {
      paramzbt.S().e().c(localzjf.a() - paramzbt.S().e().b.e());
    }
    if (paramzbt.S().e().b.d() < 0) {
      paramzbt.S().e().b.b(0);
    } else if (paramzbt.S().e().b.j() > localzjf.b()) {
      paramzbt.S().e().b.b(localzjf.b() - paramzbt.S().e().b.f());
    }
  }
  
  private static void a(zbt paramzbt, boolean paramBoolean, com.aspose.cells.b.a.b.zp paramzp)
  {
    zjf localzjf = paramzbt.e();
    if ((paramzbt.g() == 1) || (paramzbt.g() == 3)) {
      paramBoolean = !paramBoolean;
    }
    if (paramBoolean)
    {
      paramzbt.S().e().b.b(paramzp.d() + (paramzp.f() - paramzbt.S().e().b.f()) / 2);
      if (paramzbt.S().e().b.d() < paramzp.d()) {
        paramzbt.S().e().b.b(paramzp.d());
      }
    }
    else
    {
      paramzbt.S().e().b.a(paramzp.c() + (paramzp.e() - paramzbt.S().e().b.e()) / 2);
      if (paramzbt.S().e().b.c() < paramzp.c()) {
        paramzbt.S().e().b.a(paramzp.c());
      }
    }
  }
  
  private static void h(zjf paramzjf)
  {
    c(paramzjf.e());
    c(paramzjf.g());
    c(paramzjf.G());
    c(paramzjf.I());
  }
  
  private static void c(zbt paramzbt)
  {
    if (paramzbt.a() == 1) {
      if (paramzbt.n) {
        paramzbt.b(0);
      } else {
        paramzbt.b(1);
      }
    }
    if (paramzbt.a() == 2) {
      if (paramzbt.n) {
        paramzbt.b(0);
      } else {
        paramzbt.b(1);
      }
    }
    if (paramzbt.a() == 0) {
      if (paramzbt.n) {
        paramzbt.b(3);
      } else {
        paramzbt.b(2);
      }
    }
    if (paramzbt.a() == 3) {
      if (paramzbt.n) {
        paramzbt.b(3);
      } else {
        paramzbt.b(2);
      }
    }
  }
  
  static float a(zbt paramzbt, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return a(paramzbt, paramInt1, paramInt2, paramBoolean);
  }
  
  static float a(zbt paramzbt, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = 0.0F;
    int i;
    if (paramBoolean)
    {
      if (paramzbt.p()) {
        i = 0;
      } else {
        i = 1;
      }
    }
    else if (paramzbt.p()) {
      i = 1;
    } else {
      i = 0;
    }
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.l()) : paramzbt.l();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    if (d2 - d3 == 0.0D) {
      return 0.0F;
    }
    if (paramzbt.u() == 1) {
      d1 = d2;
    }
    if (d1 > d2) {
      d1 = d2;
    }
    if (d1 < d3) {
      d1 = d3;
    }
    paramzbt.a(paramzbt.n() ? paramzbt.h(d1) : d1);
    if (i == 0) {
      f = (float)(paramFloat1 + (d2 - d1) / (d2 - d3) * paramFloat2);
    } else {
      f = (float)(paramFloat1 + (d1 - d3) / (d2 - d3) * paramFloat2);
    }
    return f;
  }
  
  static float a(zbt paramzbt, int paramInt1, int paramInt2, boolean paramBoolean, zbff paramzbff)
  {
    return a(paramzbt, paramInt1, paramInt2, paramBoolean, paramzbff);
  }
  
  static float a(zbt paramzbt, float paramFloat1, float paramFloat2, boolean paramBoolean, zbff paramzbff)
  {
    if (paramzbff.getCount() == 0) {
      return 0.0F;
    }
    float f = 0.0F;
    int i;
    if (paramBoolean)
    {
      if (paramzbt.p()) {
        i = 0;
      } else {
        i = 1;
      }
    }
    else if (paramzbt.p()) {
      i = 1;
    } else {
      i = 0;
    }
    zjf localzjf = paramzbt.e();
    int j;
    int k;
    int m;
    if (paramzbt.k() != 2)
    {
      j = a(paramzbff.i());
      k = j;
      if ((paramzbt.f()) || (localzjf.u())) {
        k++;
      }
      m = 1;
      if (k <= m) {
        k = 2;
      }
      double d1 = paramzbt.l();
      if (paramzbt.u() == 1) {
        d1 = k;
      }
      if (d1 > k) {
        d1 = k;
      } else if (d1 < m) {
        d1 = m;
      }
      if (paramzbff.c(0).ay())
      {
        d1 = paramzbt.n() ? paramzbt.g(paramzbt.l()) : paramzbt.l();
        double d2 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
        double d3 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
        if (d2 - d3 == 0.0D) {
          return 0.0F;
        }
        if (paramzbt.u() == 1) {
          d1 = d2;
        }
        if (d1 > d2) {
          d1 = d2;
        }
        if (d1 < d3) {
          d1 = d3;
        }
        paramzbt.a(paramzbt.n() ? paramzbt.h(d1) : d1);
        if (i != 0) {
          f = (float)(paramFloat1 + (d2 - d1) / (d2 - d3) * paramFloat2);
        } else {
          f = (float)(paramFloat1 + (d1 - d3) / (d2 - d3) * paramFloat2);
        }
      }
      else
      {
        if (k - m == 0) {
          return 0.0F;
        }
        paramzbt.a(d1);
        if (i != 0) {
          f = (float)(paramFloat1 + (k - d1) / (k - m) * paramFloat2);
        } else {
          f = (float)(paramFloat1 + (d1 - m) / (k - m) * paramFloat2);
        }
      }
    }
    else
    {
      j = paramzbt.j();
      k = (int)paramzbt.z();
      m = (int)paramzbt.D();
      int n = 0;
      if ((paramzbt.f()) || (localzjf.u()))
      {
        k = zbv.a(j, j, 1, k, localzjf.U());
        n = zbv.a(j, k, m, paramzbt.e().U());
      }
      else
      {
        n = zbv.a(j, k, m, paramzbt.e().U());
        if (n == 0) {
          n = 1;
        }
      }
      if (n == 0) {
        return 0.0F;
      }
      int i1 = zbv.a(j, (int)paramzbt.l(), localzjf.U());
      if (paramzbt.u() == 1) {
        i1 = k;
      }
      if (i1 > k) {
        i1 = k;
      } else if (i1 < m) {
        i1 = m;
      }
      paramzbt.a(i1);
      if (i != 0) {
        f = paramFloat1 + paramFloat2 - zbv.a(j, i1, m, paramzbt.e().U()) / n * paramFloat2;
      } else {
        f = paramFloat1 + zbv.a(j, i1, m, paramzbt.e().U()) / n * paramFloat2;
      }
    }
    return f;
  }
  
  static void a(zbt paramzbt1, zbt paramzbt2, zbff paramzbff, zjf paramzjf)
  {
    int i = paramzbff.c(0).ai();
    switch (paramzbt1.I())
    {
    case 3: 
      paramzbt1.m = 0;
      break;
    case 1: 
      paramzbt1.m = 1;
      if (paramzbt2.p()) {
        paramzbt1.m = 2;
      }
      break;
    case 0: 
      paramzbt1.m = 2;
      if (paramzbt2.p()) {
        paramzbt1.m = 1;
      }
      break;
    case 2: 
      paramzbt1.m = 3;
      if (paramzbt2.u() == 1)
      {
        if (!paramzbt2.p()) {
          paramzbt1.m = 2;
        } else {
          paramzbt1.m = 1;
        }
      }
      else if (paramzbt2.u() == 0) {
        if ((paramzbt2.g() == 1) || (paramzbt2.g() == 3)) {
          paramzbt2.a(0.0D);
        } else if ((paramzbt2.g() == 0) || (paramzbt2.g() == 2)) {
          if ((i == 60) || (i == 12)) {
            paramzbt2.a(0.0D);
          } else {
            paramzbt2.a(paramzbt2.D());
          }
        }
      }
      if (paramzbt2.u() == 2) {
        if ((paramzbt2.k() != 2) && ((paramzbt2.g() == 0) || (paramzbt2.g() == 2)) && (paramzbff.c(0).ai() != 12) && (paramzbff.c(0).ai() != 60))
        {
          int j = a(paramzbff.i());
          int k = j;
          if ((paramzbt2.f()) || (paramzjf.u())) {
            k++;
          }
          int m = 1;
          if (k <= m) {
            k = 2;
          }
          double d2 = paramzbt2.l();
          if (paramzbt2.u() == 1) {
            d2 = k;
          }
          if (d2 > k) {
            d2 = k;
          } else if (d2 < m) {
            d2 = m;
          }
          if (!paramzbt2.p())
          {
            if (d2 == m) {
              paramzbt1.m = 1;
            }
          }
          else if (d2 == m) {
            paramzbt1.m = 2;
          }
        }
        else
        {
          double d1 = paramzbt2.D();
          if (paramzbt2.l() <= d1) {
            if (!paramzbt2.p()) {
              paramzbt1.m = 1;
            } else {
              paramzbt1.m = 2;
            }
          }
        }
      }
      break;
    }
  }
  
  private static void a(zjf paramzjf, zr paramzr, zbt paramzbt, com.aspose.cells.b.a.b.zs paramzs1, com.aspose.cells.b.a.b.zs paramzs2, com.aspose.cells.b.a.b.zp[] paramArrayOfzp, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      switch (paramzbt.m)
      {
      case 1: 
        if ((paramzjf.B().s()) || ((!paramzjf.C().s()) && (!paramzjf.D())))
        {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzs1.c());
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzs2.c());
        }
        else
        {
          paramzjf.k().a.b(paramzjf.k().a.d() + paramzs1.c() + paramzs2.c());
          paramzjf.i += paramzs1.c();
          if ((paramzbt.T().b().i() == 0) || (paramzbt.T().b().n() == 0)) {
            paramzjf.i += paramzs2.c();
          }
        }
        break;
      case 2: 
        if ((paramzjf.B().s()) || ((!paramzjf.C().s()) && (!paramzjf.D())))
        {
          paramArrayOfzp[0].b(paramArrayOfzp[0].d() + paramzs1.c());
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzs1.c());
          paramArrayOfzp[0].b(paramArrayOfzp[0].d() + paramzs2.c());
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzs2.c());
        }
        else
        {
          paramzjf.g -= paramzs1.c();
          paramzjf.i += paramzs1.c();
          paramzjf.g -= paramzs2.c();
          if ((paramzbt.T().b().i() == 0) || (paramzbt.T().b().n() == 0)) {
            paramzjf.i += paramzs2.c();
          }
        }
        break;
      case 3: 
        if ((paramzjf.B().s()) && (paramzjf.u())) {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 5);
        }
        break;
      case 0: 
        break;
      }
      paramzbt.v = new com.aspose.cells.b.a.b.zs(paramArrayOfzp[0].e(), paramzs1.c() + paramzs2.c());
    }
    else
    {
      switch (paramzbt.m)
      {
      case 1: 
        com.aspose.cells.b.a.b.zs localzs;
        if ((paramzjf.B().s()) || ((!paramzjf.C().s()) && (!paramzjf.D())))
        {
          if (!paramzjf.u())
          {
            paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs1.b());
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - paramzs1.b());
            paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs2.b());
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - paramzs2.b());
          }
          else
          {
            localzs = paramzjf.k().k();
            if (paramzs1.b() + paramzs2.b() > localzs.b())
            {
              paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs1.b() + paramzs2.b() - localzs.b());
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (paramzs1.b() + paramzs2.b() - localzs.b()));
            }
          }
        }
        else if (!paramzjf.u())
        {
          paramzjf.f -= paramzs1.b();
          paramzjf.h += paramzs1.b();
          if ((paramzbt.T().b().i() == 0) || (paramzbt.T().b().n() == 0))
          {
            paramzjf.f -= paramzs2.b();
            paramzjf.h += paramzs2.b();
          }
        }
        else
        {
          localzs = paramzjf.k().k();
          if ((paramzbt.T().b().i() == 0) || (paramzbt.T().b().n() == 0))
          {
            if (paramzs1.b() + paramzs2.b() > localzs.b())
            {
              paramzjf.f -= paramzs1.b() + paramzs2.b() - localzs.b();
              paramzjf.h += paramzs1.b() + paramzs2.b() - localzs.b();
            }
          }
          else if (paramzs1.b() > localzs.b())
          {
            paramzjf.f -= paramzs1.b() - localzs.b();
            paramzjf.h += paramzs1.b() - localzs.b();
          }
        }
        break;
      case 2: 
        if ((paramzjf.B().s()) || ((!paramzjf.C().s()) && (!paramzjf.D())))
        {
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() - paramzs1.b());
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() - paramzs2.b());
        }
        else
        {
          paramzjf.h += paramzs1.b();
          if ((paramzbt.T().b().i() == 0) || (paramzbt.T().b().n() == 0)) {
            paramzjf.h += paramzs2.b();
          }
        }
        break;
      case 0: 
      case 3: 
        break;
      }
      paramzbt.v = new com.aspose.cells.b.a.b.zs(paramzs1.b() + paramzs2.b(), paramArrayOfzp[0].f());
    }
  }
  
  private static void a(zjf paramzjf, com.aspose.cells.b.a.b.zp[] paramArrayOfzp)
    throws Exception
  {
    if (paramzjf.C().s()) {
      return;
    }
    int i;
    if (paramzjf.f < 0)
    {
      i = paramArrayOfzp[0].c() - paramzjf.f;
      paramzjf.f = 0;
      paramArrayOfzp[0].a(i);
    }
    int j;
    if (paramzjf.f + paramzjf.h > paramzjf.a())
    {
      i = paramzjf.f + paramzjf.h - paramzjf.a();
      if (i < paramzjf.f)
      {
        paramzjf.f -= i;
        paramArrayOfzp[0].a(paramArrayOfzp[0].c() - i);
      }
      else
      {
        j = paramArrayOfzp[0].c() - paramzjf.f;
        paramzjf.f = 0;
        paramArrayOfzp[0].a(j);
        i = paramzjf.f + paramzjf.h - paramzjf.a();
        paramzjf.h -= i;
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - i);
      }
    }
    if (paramzjf.g < 0)
    {
      i = paramArrayOfzp[0].d() - paramzjf.g;
      paramzjf.g = 0;
      paramArrayOfzp[0].b(i);
    }
    if (paramzjf.g + paramzjf.i > paramzjf.b())
    {
      i = paramzjf.g + paramzjf.i - paramzjf.b();
      if (i < paramzjf.g)
      {
        paramzjf.g -= i;
        paramArrayOfzp[0].b(paramArrayOfzp[0].d() - i);
      }
      else
      {
        j = paramArrayOfzp[0].d() - paramzjf.g;
        paramzjf.g = 0;
        paramArrayOfzp[0].b(j);
        i = paramzjf.g + paramzjf.i - paramzjf.b();
        paramzjf.i -= i;
        paramArrayOfzp[0].d(paramArrayOfzp[0].f() - i);
      }
    }
  }
  
  private static void a(zjf paramzjf, zr paramzr, zbt paramzbt, com.aspose.cells.b.a.b.zs paramzs, int paramInt, com.aspose.cells.b.a.b.zp[] paramArrayOfzp, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(paramArrayOfzp[0].c(), paramArrayOfzp[0].d(), paramArrayOfzp[0].e(), paramArrayOfzp[0].f());
    float f = 0.25F;
    if (paramBoolean1)
    {
      switch (paramzbt.m)
      {
      case 1: 
        com.aspose.cells.b.a.b.zs localzs;
        if ((paramzjf.B().s()) || ((!paramzjf.C().s()) && (!paramzjf.D())))
        {
          if (!paramzjf.u())
          {
            paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs.b() + paramInt);
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (paramzs.b() + paramInt));
          }
          else
          {
            localzs = paramzjf.k().k();
            if (paramzs.b() + paramInt > localzs.b())
            {
              paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramzs.b() + paramInt - localzs.b());
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (paramzs.b() + paramInt - localzs.b()));
            }
          }
        }
        else if (!paramzjf.u())
        {
          paramzjf.f -= paramzs.b() + paramInt;
          paramzjf.h += paramzs.b() + paramInt;
        }
        else
        {
          localzs = paramzjf.k().k();
          if (paramzs.b() + paramInt > localzs.b())
          {
            paramzjf.f -= paramzs.b() + paramInt - localzs.b();
            paramzjf.h += paramzs.b() + paramInt - localzs.b();
          }
        }
        break;
      case 2: 
        if ((paramzjf.B().s()) || ((!paramzjf.C().s()) && (!paramzjf.D()))) {
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (paramzs.b() + paramInt));
        } else {
          paramzjf.h += paramzs.b() + paramInt;
        }
        break;
      case 3: 
        a(zbv.a(paramzbt), paramArrayOfzp, paramBoolean1, paramzs, paramInt);
        break;
      case 0: 
        break;
      }
      paramzbt.v = new com.aspose.cells.b.a.b.zs(paramzs.b() + paramInt, paramArrayOfzp[0].f());
      if (paramArrayOfzp[0].e() < (int)(localzp.e() * f)) {
        paramArrayOfzp[0].c((int)(localzp.e() * f));
      }
    }
    else
    {
      if ((paramzjf.u()) && (paramzbt.k() != 2))
      {
        paramzbt.m = 0;
        paramzbt.f(2);
        paramzbt.h(2);
        paramInt = 0;
      }
      switch (paramzbt.m)
      {
      case 1: 
        if ((paramzjf.B().s()) || ((!paramzjf.C().s()) && (!paramzjf.D())) || (paramzjf.a))
        {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (paramzs.c() + paramInt));
        }
        else
        {
          paramzjf.i += paramzs.c() + paramInt;
          if (paramzjf.u())
          {
            int i = paramzjf.b() - paramzjf.g - paramzjf.i;
            if (i >= paramzs.c() + paramInt) {
              paramzjf.k().a.b(paramzjf.k().a.d() + paramzs.c() + paramInt);
            } else {
              paramzjf.k().a.b(paramzjf.k().a.d() + (paramzs.c() + paramInt - i));
            }
          }
        }
        break;
      case 2: 
        if ((paramzjf.B().s()) || ((!paramzjf.C().s()) && (!paramzjf.D())))
        {
          if ((paramzjf.u()) && (paramzbt.k() == 2))
          {
            paramArrayOfzp[0].b(paramArrayOfzp[0].d() + paramzs.c() + paramInt);
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (paramzs.c() + paramInt + b));
          }
          else
          {
            paramArrayOfzp[0].b(paramArrayOfzp[0].d() + paramzs.c() + paramInt);
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (paramzs.c() + paramInt));
            if (paramzbt.w != null) {
              paramArrayOfzp[0].d(paramArrayOfzp[0].f() - paramzbt.aa() * 10);
            }
          }
        }
        else if ((paramzjf.u()) && (paramzbt.k() == 2))
        {
          paramzjf.g -= paramzs.c() + paramInt;
          paramzjf.i += paramzs.c() + paramInt + b;
        }
        else
        {
          paramzjf.g -= paramzs.c() + paramInt;
          paramzjf.i += paramzs.c() + paramInt;
        }
        break;
      case 3: 
        if ((paramzjf.B().s()) || ((!paramzjf.C().s()) && (!paramzjf.D())))
        {
          if ((paramzjf.u()) && (paramzbt.k() == 2)) {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - b);
          } else {
            a(zbv.a(paramzbt), paramArrayOfzp, paramBoolean1, paramzs, paramInt);
          }
        }
        else if ((paramzjf.u()) && (paramzbt.k() == 2)) {
          paramzjf.i += b;
        } else {
          a(zbv.a(paramzbt), paramArrayOfzp, paramBoolean1, paramzs, paramInt);
        }
        break;
      case 0: 
        break;
      }
      paramzbt.v = new com.aspose.cells.b.a.b.zs(paramArrayOfzp[0].e(), paramzs.c() + paramInt);
      if (paramArrayOfzp[0].f() < (int)(localzp.f() * f)) {
        paramArrayOfzp[0].d((int)(localzp.f() * f));
      }
    }
  }
  
  static void a(zbt paramzbt, com.aspose.cells.b.a.b.zp[] paramArrayOfzp, boolean paramBoolean, com.aspose.cells.b.a.b.zs paramzs, int paramInt)
  {
    com.aspose.cells.b.a.b.zs localzs = zn.a(paramzs);
    zjf localzjf = paramzbt.e();
    localzs.a(localzs.b() + paramInt);
    localzs.b(localzs.c() + paramInt);
    float f1 = paramArrayOfzp[0].d();
    float f2 = paramArrayOfzp[0].f();
    if (paramBoolean)
    {
      f1 = paramArrayOfzp[0].c();
      f2 = paramArrayOfzp[0].e();
    }
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.l()) : paramzbt.l();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    if (paramzbt.u() == 1) {
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
      localzp = zn.b(paramArrayOfzp[0]);
      while (i > 0)
      {
        paramArrayOfzp[0] = new com.aspose.cells.b.a.b.zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
        j = (int)(localzs.b() - f3);
        if (j > 0) {
          if (localzjf.B().s())
          {
            if (paramzbt.p())
            {
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() - j);
            }
            else
            {
              paramArrayOfzp[0].a(paramArrayOfzp[0].c() + j);
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() - j);
            }
          }
          else if (paramzbt.p())
          {
            localzjf.h += j;
          }
          else
          {
            localzjf.f -= j;
            localzjf.h += j;
          }
        }
        f3 = paramArrayOfzp[0].e() * f3 / localzp.e();
        i--;
      }
    }
    else
    {
      i = 2;
      localzp = zn.b(paramArrayOfzp[0]);
      while (i > 0)
      {
        paramArrayOfzp[0] = new com.aspose.cells.b.a.b.zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
        j = (int)(localzs.c() - f3);
        if (j > 0) {
          if (localzjf.B().s())
          {
            if (paramzbt.p())
            {
              paramArrayOfzp[0].b(paramArrayOfzp[0].d() + j);
              paramArrayOfzp[0].d(paramArrayOfzp[0].f() - j);
            }
            else
            {
              paramArrayOfzp[0].d(paramArrayOfzp[0].f() - j);
            }
          }
          else if (paramzbt.p())
          {
            localzjf.g -= j;
            localzjf.i += j;
          }
          else
          {
            localzjf.i += j;
          }
        }
        f3 = paramArrayOfzp[0].f() * f3 / localzp.f();
        i--;
      }
    }
  }
  
  private static void a(zr paramzr, zjf paramzjf, zbfd paramzbfd1, zbfd paramzbfd2, com.aspose.cells.b.a.b.zp[] paramArrayOfzp)
    throws Exception
  {
    int j;
    if ((paramzbfd1.av()) || (paramzbfd2.av()))
    {
      int i = paramzbfd1.m();
      j = paramzbfd2.m();
      double d1 = 75.0D;
      double d2 = 100.0D;
      zawk.a(paramzjf, paramArrayOfzp, paramzbfd1);
      zawk.a(paramzjf, paramArrayOfzp, paramzbfd2);
      double d3;
      double d4;
      if ((i == 46) || (j == 46))
      {
        if (i == 46)
        {
          d1 = paramzbfd1.Y();
          d2 = paramzbfd1.L();
        }
        if (j == 46)
        {
          d1 = paramzbfd2.Y();
          d2 = paramzbfd2.L();
        }
        d3 = paramArrayOfzp[0].e() / (2.0D + 2.0D * d1 / 100.0D + d2 / 100.0D);
        if (d1 <= 100.0D)
        {
          if (d3 > paramArrayOfzp[0].f() / 2.0D) {
            d3 = paramArrayOfzp[0].f() / 2.0D;
          }
          paramzjf.k(zbxz.c(d3));
          paramzjf.l(zbxz.c(d3 * d1 / 100.0D));
          paramzjf.m(zbxz.c(d3 * d2 / 100.0D));
        }
        else
        {
          d4 = d1 * d3 / 100.0D;
          if (d4 <= paramArrayOfzp[0].f() / 2.0D) {
            d4 = paramArrayOfzp[0].f() / 2.0D;
          }
          paramzjf.l(zbxz.c(d4));
          paramzjf.k(zbxz.c(d4 * 100.0D / d1));
          paramzjf.m(zbxz.c(d4 * 100.0D / d1 * d2 / 100.0D));
        }
      }
      else if ((i == 49) || (j == 49))
      {
        if (i == 49)
        {
          d1 = paramzbfd1.Y();
          d2 = paramzbfd1.L() / 2.0D;
        }
        if (j == 49)
        {
          d1 = paramzbfd2.Y();
          d2 = paramzbfd2.L() / 2.0D;
        }
        d3 = paramArrayOfzp[0].e() / (2.0D + d1 / 100.0D + d2 / 100.0D);
        if (d1 <= 100.0D)
        {
          if (d3 > paramArrayOfzp[0].f() / 2.0D) {
            d3 = paramArrayOfzp[0].f() / 2.0D;
          }
          paramzjf.k(zbxz.c(d3));
          paramzjf.l(zbxz.c(d3 * d1 / 100.0D));
          paramzjf.m(zbxz.c(d3 * d2 / 100.0D));
        }
        else
        {
          d4 = d1 * d3 / 100.0D;
          if (d4 > paramArrayOfzp[0].f() / 2.0D) {
            d4 = paramArrayOfzp[0].f() / 2.0D;
          }
          paramzjf.l(zbxz.c(d4));
          paramzjf.k(zbxz.c(d4 * 100.0D / d1));
          paramzjf.m(zbxz.c(d4 * 100.0D / d1 * d2 / 100.0D));
        }
      }
      else
      {
        zbxz.a(paramArrayOfzp);
      }
    }
    else if ((paramzbfd1.aw()) || (paramzbfd2.aw()))
    {
      zt localzt = new zt(paramzjf.a() * 0.2F, paramzjf.b());
      j = paramzjf.e().I() == 3 ? 0 : 1;
      int k = paramzjf.g().I() == 3 ? 0 : 1;
      if (paramzjf.B().s())
      {
        com.aspose.cells.b.a.b.zs localzs1 = com.aspose.cells.b.a.b.zs.a();
        int n = 0;
        int i1 = 0;
        com.aspose.cells.b.a.b.zs localzs2;
        int i2;
        String str;
        zg localzg;
        int i3;
        com.aspose.cells.b.a.b.zs localzs3;
        if ((paramzbfd1.aw()) && (j != 0))
        {
          paramzjf.e().f = localzt.b();
          paramzjf.e().g = localzt.c();
          localzs2 = zbvy.a(paramzr, "a", paramzjf.e().J().a());
          paramzjf.e().J().a(localzs2.b() / 2);
          n = (int)paramzjf.e().J().q();
          for (i2 = 0; i2 < paramzjf.e().l.size(); i2++)
          {
            str = com.aspose.cells.b.a.zs.a(paramzjf.e().l.get(i2));
            localzg = paramzjf.e().J().a();
            i3 = paramzjf.e().J().e();
            localzs3 = zbvy.a(paramzjf.ap(), str, i3, localzg, localzt, 1, 1);
            if (localzs3.b() > localzs1.b()) {
              localzs1.a(localzs3.b());
            }
            if (localzs3.c() > localzs1.c()) {
              localzs1.b(localzs3.c());
            }
          }
        }
        if ((paramzbfd2.aw()) && (k != 0))
        {
          paramzjf.g().f = localzt.b();
          paramzjf.g().g = localzt.c();
          localzs2 = zbvy.a(paramzr, "a", paramzjf.g().J().a());
          paramzjf.g().J().a(localzs2.b() / 2);
          i1 = (int)paramzjf.g().J().q();
          for (i2 = 0; i2 < paramzjf.g().l.size(); i2++)
          {
            str = com.aspose.cells.b.a.zs.a(paramzjf.g().l.get(i2));
            localzg = paramzjf.g().J().a();
            i3 = paramzjf.g().J().e();
            localzs3 = zbvy.a(paramzjf.ap(), str, i3, localzg, localzt, 1, 1);
            if (localzs3.b() > localzs1.b()) {
              localzs1.a(localzs3.b());
            }
            if (localzs3.c() > localzs1.c()) {
              localzs1.b(localzs3.c());
            }
          }
        }
        if (!com.aspose.cells.b.a.b.zs.a(localzs1, com.aspose.cells.b.a.b.zs.a()))
        {
          if (n < i1) {
            n = i1;
          }
          localzs1.a(localzs1.b() + n);
          localzs1.b(localzs1.c() + n);
        }
        paramArrayOfzp[0].a(-localzs1.b(), -localzs1.c());
      }
      else
      {
        if ((paramzbfd1.aw()) && (j != 0))
        {
          paramzjf.e().f = localzt.b();
          paramzjf.e().g = localzt.c();
        }
        if ((paramzbfd2.aw()) && (k != 0))
        {
          paramzjf.g().f = localzt.b();
          paramzjf.g().g = localzt.c();
        }
      }
      zbxz.a(paramArrayOfzp);
      int m = 15;
      if (paramArrayOfzp[0].e() < m) {
        paramArrayOfzp[0].c(m);
      }
      if (paramArrayOfzp[0].f() < m) {
        paramArrayOfzp[0].d(m);
      }
    }
  }
  
  private static void a(zbt paramzbt, zbff paramzbff, boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList1 = paramzbt.l;
    int i;
    if ((paramzbt.g() == 1) || (paramzbt.g() == 3)) {
      i = 1;
    } else {
      i = 0;
    }
    ArrayList localArrayList2 = paramzbff.j();
    for (int j = 0; j < localArrayList2.size(); j++)
    {
      zbfd localzbfd = (zbfd)localArrayList2.get(j);
      int k = localzbfd.ai();
      zuc localzuc;
      if (i != 0) {
        localzuc = localzbfd.x();
      } else {
        localzuc = localzbfd.y();
      }
      if ((localzuc != null) && (localzuc.d() != 2))
      {
        int m = 0;
        if ((i != 0) || (paramzbt.s) || (k == 12)) {
          m = 1;
        }
        double d1 = paramzbt.z();
        double d2 = paramzbt.D();
        for (int n = 0; n < localzbfd.F().getCount(); n++)
        {
          zkf localzkf1 = localzbfd.F().b(n);
          if (!localzkf1.a())
          {
            double d3 = 0.0D;
            if (i != 0)
            {
              if (localzkf1.e()) {
                continue;
              }
              d3 = localzkf1.w();
            }
            else
            {
              if (localzkf1.d()) {
                continue;
              }
              d3 = localzkf1.q();
              if (m == 0) {
                d3 -= paramzbt.x() / 2.0D;
              }
            }
            double d4 = 0.0D;
            double d5 = 0.0D;
            double d6;
            switch (localzuc.g())
            {
            case 1: 
              d4 = localzuc.c();
              d5 = d4;
              break;
            case 2: 
              d4 = localzuc.c() * d3 / 100.0D;
              d5 = -d4;
              break;
            case 0: 
              d6 = localzuc.e().size() > n ? localzuc.a(localzuc.e().get(n)) : 0.0D;
              d4 = d6;
              d6 = localzuc.f().size() > n ? localzuc.a(localzuc.f().get(n)) : 0.0D;
              d5 = d6;
              break;
            case 4: 
              d4 = localzuc.a(localzbfd.F(), localzbfd.F().getCount());
              d5 = d4;
              break;
            }
            if ((i != 0) && ((k == 15) || (k == 7)))
            {
              d6 = d3;
              for (int i1 = 0; i1 < j; i1++)
              {
                zkf localzkf2 = ((zbfd)localArrayList2.get(i1)).F().b(n);
                if (localzkf2 != null)
                {
                  double d8 = localzkf2.w();
                  if ((d8 > 0.0D) && (d3 > 0.0D)) {
                    d6 += d8;
                  }
                  if ((d8 <= 0.0D) && (d3 <= 0.0D)) {
                    d6 += d8;
                  }
                }
              }
              d3 = d6;
            }
            else if ((i != 0) && ((k == 16) || (k == 8)))
            {
              d6 = d3;
              double d7 = 0.0D;
              zkf localzkf3;
              double d9;
              for (int i2 = 0; i2 < j; i2++)
              {
                localzkf3 = ((zbfd)localArrayList2.get(i2)).F().b(n);
                if (localzkf3 != null)
                {
                  d9 = localzkf3.w();
                  if ((d9 > 0.0D) && (d3 > 0.0D)) {
                    d6 += d9;
                  }
                  if ((d9 <= 0.0D) && (d3 <= 0.0D)) {
                    d6 += d9;
                  }
                }
              }
              for (i2 = 0; i2 < localArrayList2.size(); i2++)
              {
                localzkf3 = ((zbfd)localArrayList2.get(i2)).F().b(n);
                if (localzkf3 != null)
                {
                  d9 = localzkf3.w();
                  d7 += Math.abs(d9);
                }
              }
              d3 = d6 * 100.0D / d7;
              d5 = d5 * 100.0D / d7;
              d4 = d4 * 100.0D / d7;
            }
            if (m != 0)
            {
              if ((paramBoolean1) && (d5 > 0.0D) && (d5 + d3 >= paramzbt.z()) && ((localzuc.d() == 0) || (localzuc.d() == 3)) && ((d5 + d3 != 0.0D) || (paramzbt.z() != 0.0D)))
              {
                for (d6 = paramzbt.z() + paramzbt.x(); d6 <= d5 + d3 + paramzbt.x(); d6 += paramzbt.x()) {
                  localArrayList1.add(0, Double.valueOf(d6));
                }
                paramzbt.d(((Double)localArrayList1.get(0)).doubleValue());
              }
              if ((paramBoolean1) && (d4 < 0.0D) && (-d4 + d3 >= paramzbt.z()) && ((localzuc.d() == 0) || (localzuc.d() == 1)) && ((-d4 + d3 != 0.0D) || (paramzbt.z() != 0.0D)))
              {
                for (d6 = paramzbt.z() + paramzbt.x(); d6 <= -d4 + d3 + paramzbt.x(); d6 += paramzbt.x()) {
                  localArrayList1.add(0, Double.valueOf(d6));
                }
                paramzbt.d(((Double)localArrayList1.get(0)).doubleValue());
              }
              if ((paramBoolean2) && (d4 > 0.0D) && (d3 - d4 <= paramzbt.D()) && ((localzuc.d() == 0) || (localzuc.d() == 1)) && ((paramzbt.D() != 0.0D) || (d3 - d4 != 0.0D)))
              {
                for (d6 = paramzbt.D() - paramzbt.x(); d6 >= d3 - d4 - paramzbt.x(); d6 -= paramzbt.x()) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(d6));
                }
                paramzbt.f(((Double)localArrayList1.get(localArrayList1.size() - 1)).doubleValue());
              }
              if ((paramBoolean2) && (d5 < 0.0D) && (d3 + d5 <= paramzbt.D()) && ((localzuc.d() == 0) || (localzuc.d() == 3)) && ((d3 + d5 != 0.0D) || (paramzbt.D() != 0.0D)))
              {
                for (d6 = paramzbt.D() - paramzbt.x(); d6 >= d3 + d5 - paramzbt.x(); d6 -= paramzbt.x()) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(d6));
                }
                paramzbt.f(((Double)localArrayList1.get(localArrayList1.size() - 1)).doubleValue());
              }
            }
            else
            {
              if ((paramBoolean1) && (d5 > 0.0D) && (d5 + d3 >= paramzbt.z()) && ((localzuc.d() == 0) || (localzuc.d() == 3))) {
                for (d6 = paramzbt.z() + paramzbt.x(); d6 <= d5 + d3 + paramzbt.x(); d6 += paramzbt.x()) {
                  d1 = d6;
                }
              }
              if ((paramBoolean1) && (d4 < 0.0D) && (-d4 + d3 >= paramzbt.z()) && ((localzuc.d() == 0) || (localzuc.d() == 1))) {
                for (d6 = paramzbt.z() + paramzbt.x(); d6 <= -d4 + d3 + paramzbt.x(); d6 += paramzbt.x()) {
                  d1 = d6;
                }
              }
              if ((paramBoolean2) && (d4 > 0.0D) && (d3 - d4 <= paramzbt.D()) && ((localzuc.d() == 0) || (localzuc.d() == 1))) {
                for (d6 = paramzbt.D() - paramzbt.x(); d6 >= d3 - d4 - paramzbt.x(); d6 -= paramzbt.x()) {
                  d2 = d6;
                }
              }
              if ((paramBoolean2) && (d5 < 0.0D) && (d3 + d5 <= paramzbt.D()) && ((localzuc.d() == 0) || (localzuc.d() == 3))) {
                for (d6 = paramzbt.D() - paramzbt.x(); d6 >= d3 + d5 - paramzbt.x(); d6 -= paramzbt.x()) {
                  d2 = d6;
                }
              }
              paramzbt.d(d1);
              paramzbt.f(d2);
            }
          }
        }
      }
    }
  }
  
  private static void b(zjf paramzjf, boolean paramBoolean1, boolean paramBoolean2)
  {
    c(paramzjf.e(), paramBoolean1);
    c(paramzjf.g(), paramBoolean2);
    c(paramzjf.G(), paramBoolean1);
    c(paramzjf.I(), paramBoolean2);
  }
  
  private static void c(zbt paramzbt, boolean paramBoolean)
  {
    zbt localzbt = zbv.a(paramzbt);
    if (localzbt == null) {
      return;
    }
    if ((localzbt.u() == 1) && (!localzbt.p()))
    {
      if (!paramBoolean)
      {
        if (paramzbt.c()) {
          paramzbt.a(3);
        } else {
          paramzbt.a(2);
        }
      }
      else if (paramzbt.c()) {
        paramzbt.a(2);
      } else {
        paramzbt.a(3);
      }
    }
    else if ((localzbt.u() != 1) && (localzbt.p()))
    {
      if (!paramBoolean)
      {
        if (paramzbt.c()) {
          paramzbt.a(3);
        } else {
          paramzbt.a(2);
        }
      }
      else if (paramzbt.c()) {
        paramzbt.a(2);
      } else {
        paramzbt.a(3);
      }
    }
    else if (!paramBoolean)
    {
      if (paramzbt.c()) {
        paramzbt.a(0);
      } else {
        paramzbt.a(1);
      }
    }
    else if (paramzbt.c()) {
      paramzbt.a(1);
    } else {
      paramzbt.a(0);
    }
    if (paramzbt.I() == 0) {
      switch (paramzbt.a())
      {
      case 0: 
        paramzbt.a(3);
        break;
      case 3: 
        paramzbt.a(0);
        break;
      case 1: 
        paramzbt.a(2);
        break;
      case 2: 
        paramzbt.a(1);
        break;
      }
    }
  }
  
  static void f(zjf paramzjf)
  {
    ArrayList localArrayList = paramzjf.z().j();
    zamx localzamx = paramzjf.k().j();
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zbfd localzbfd = (zbfd)localArrayList.get(i);
      zamz localzamz = new zamz(paramzjf, paramzjf.l(), i);
      localzamz.a(localzbfd.i());
      if (localzbfd.E()) {
        localzamz.a(localzbfd.t());
      }
      localzamz.a(1);
      localzamz.a(localzbfd);
      localzamx.a(localzamz);
    }
  }
  
  static void a(zjf paramzjf, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    ArrayList localArrayList1 = paramzjf.z().j();
    zamv localzamv = paramzjf.x();
    zamx localzamx1 = localzamv.f();
    zamx localzamx2 = localzamv.e();
    zbfd localzbfd3;
    if (paramzjf.N() == 78)
    {
      zbfd localzbfd1 = paramzjf.z().c(0);
      Color[] arrayOfColor = paramzjf.Z().a().a(paramzjf.R(), 3);
      zbfd localzbfd2 = new zbfd(paramzjf, paramzjf.z(), 78);
      localzbfd2.a("Increase");
      localzbfd2.A().b(localzbfd1.A());
      localzbfd2.A().c(arrayOfColor[0]);
      localzbfd2.z().c(localzbfd1.z());
      localzbfd2.z().b(arrayOfColor[0]);
      zamz localzamz1 = new zamz(paramzjf, localzamv, 0);
      localzamz1.a(localzbfd2.i());
      localzamz1.a(1);
      localzamz1.a(localzbfd2);
      localzamv.e().a(localzamz1);
      localzbfd3 = new zbfd(paramzjf, paramzjf.z(), 78);
      localzbfd3.a("Decrease");
      localzbfd3.A().b(localzbfd1.A());
      localzbfd3.A().c(arrayOfColor[1]);
      localzbfd3.z().c(localzbfd1.z());
      localzbfd3.z().b(arrayOfColor[1]);
      localzamz1 = new zamz(paramzjf, localzamv, 0);
      localzamz1.a(localzbfd3.i());
      localzamz1.a(1);
      localzamz1.a(localzbfd3);
      localzamv.e().a(localzamz1);
      zbfd localzbfd4 = new zbfd(paramzjf, paramzjf.z(), 78);
      localzbfd4.a("Total");
      localzbfd4.A().b(localzbfd1.A());
      localzbfd4.A().c(arrayOfColor[2]);
      localzbfd4.z().c(localzbfd1.z());
      localzbfd4.z().b(arrayOfColor[2]);
      localzamz1 = new zamz(paramzjf, localzamv, 0);
      localzamz1.a(localzbfd4.i());
      localzamz1.a(1);
      localzamz1.a(localzbfd4);
      localzamv.e().a(localzamz1);
      return;
    }
    int i = 1;
    int j = 0;
    boolean bool = true;
    Object localObject;
    for (int k = 0; k < localArrayList1.size(); k++)
    {
      localzbfd3 = (zbfd)localArrayList1.get(k);
      if ((k == 0) && (localzbfd3.j())) {
        i = 0;
      }
      n = localzbfd3.a();
      localObject = localzamx1.c(n);
      zamz localzamz2;
      if (localObject == null)
      {
        localzamz2 = new zamz(paramzjf, localzamv, n);
        localzamz2.a(localzbfd3.i());
        if (localzbfd3.E()) {
          localzamz2.a(localzbfd3.t());
        }
        localzamz2.a(1);
        localzamz2.a(localzbfd3);
        zzo.a(localzamv.c().k(), localzamz2.a());
        if (j == 0) {
          localzamx2.a(localzamz2);
        } else if (bool != localzbfd3.j()) {
          localzamx2.a(localzamz2);
        }
        if (j == 0) {
          if (localzbfd3.c(new int[] { 44 }))
          {
            j = 1;
            bool = localzbfd3.j();
          }
        }
      }
      else if (!((zamz)localObject).b())
      {
        localzamz2 = new zamz(paramzjf, localzamv, n);
        localzamz2.a(localzbfd3.i());
        if (localzbfd3.E()) {
          localzamz2.a(localzbfd3.t());
        }
        localzamz2.a(1);
        localzamz2.a(localzbfd3);
        localzamz2.a(((zamz)localObject).c());
        localzamz2.a(((zamz)localObject).e());
        zzo.a(((zamz)localObject).a(), localzamz2.a());
        if (j == 0) {
          localzamx2.a(localzamz2);
        }
        if (localzbfd3.c(new int[] { 44 })) {
          j = 1;
        }
      }
    }
    ArrayList localArrayList2 = new ArrayList();
    if (i != 0)
    {
      com.aspose.cells.b.a.a.zf.a(localArrayList2, paramzjf.z().l());
      com.aspose.cells.b.a.a.zf.a(localArrayList2, paramzjf.z().m());
    }
    else
    {
      com.aspose.cells.b.a.a.zf.a(localArrayList2, paramzjf.z().m());
      com.aspose.cells.b.a.a.zf.a(localArrayList2, paramzjf.z().l());
    }
    int m = localzamx2.getCount() > 0 ? localzamx2.getCount() - 1 : 0;
    for (int n = 0; n < localArrayList2.size(); n++)
    {
      localObject = (zbxg)localArrayList2.get(n);
      int i1 = localArrayList1.size() + ((zbxg)localObject).u();
      zamz localzamz3 = localzamx1.c(i1);
      zamz localzamz4;
      if (localzamz3 == null)
      {
        localzamz4 = new zamz(paramzjf, localzamv, i1);
        localzamz4.a(((zbxg)localObject).l());
        if (((zbxg)localObject).n()) {
          localzamz4.a(((zbxg)localObject).m());
        }
        localzamz4.a(2);
        localzamz4.a(((zbxg)localObject).c().a());
        localzamz4.a((zbxg)localObject);
        zzo.a(localzamv.c().k(), localzamz4.a());
        a(localzamz4, localzamx2, m);
      }
      else if (!localzamz3.b())
      {
        localzamz4 = new zamz(paramzjf, localzamv, i1);
        localzamz4.a(((zbxg)localObject).l());
        if (((zbxg)localObject).n()) {
          localzamz4.a(((zbxg)localObject).m());
        }
        localzamz4.a(2);
        localzamz4.a(((zbxg)localObject).c().a());
        localzamz4.a((zbxg)localObject);
        localzamz4.a(localzamz3.c());
        localzamz4.a(localzamz3.e());
        zzo.a(localzamz3.a(), localzamz4.a());
        a(localzamz4, localzamx2, m);
      }
    }
    c(paramzjf, paramBoolean1, paramBoolean2);
  }
  
  private static void a(zamz paramzamz, zamx paramzamx, int paramInt)
  {
    if (paramzamx.getCount() == 0)
    {
      paramzamx.a(paramzamz);
    }
    else
    {
      int i = 0;
      for (int j = paramInt; j < paramzamx.getCount(); j++) {
        if (paramzamx.b(j).f() > paramzamz.f())
        {
          paramzamx.a(j, paramzamz);
          i = 1;
          break;
        }
      }
      if (i == 0) {
        paramzamx.a(paramzamz);
      }
    }
  }
  
  static void a(zjf paramzjf, zbfd paramzbfd)
  {
    zamv localzamv = paramzjf.x();
    zamx localzamx1 = localzamv.f();
    zamx localzamx2 = localzamv.e();
    ArrayList localArrayList;
    if (paramzbfd.ah() == 1) {
      localArrayList = paramzjf.z().c();
    } else {
      localArrayList = paramzjf.z().d();
    }
    for (int i = 0; i < paramzbfd.F().getCount(); i++)
    {
      zkf localzkf = paramzbfd.F().b(i);
      int j = i;
      zamz localzamz = localzamx1.c(j);
      int k = i + 1;
      String str = com.aspose.cells.b.a.zp.a(k);
      if (paramzbfd.m() == 77) {
        str = "Branch " + str;
      }
      Object localObject;
      if (localArrayList.size() > i)
      {
        localObject = (zgn)localArrayList.get(i);
        str = zanb.a(paramzjf, (zagy)localObject, paramzjf.U());
      }
      if (localzamz == null)
      {
        localObject = new zamz(paramzjf, localzamv, j);
        ((zamz)localObject).a(str);
        if (paramzbfd.E()) {
          ((zamz)localObject).a(paramzbfd.t());
        }
        ((zamz)localObject).a(1);
        ((zamz)localObject).a(paramzbfd);
        zzo.a(localzamv.c().k(), ((zamz)localObject).a());
        localzamx2.a((zamz)localObject);
      }
      else if (!localzamz.b())
      {
        localObject = new zamz(paramzjf, localzamv, j);
        ((zamz)localObject).a(str);
        if (paramzbfd.E()) {
          ((zamz)localObject).a(paramzbfd.t());
        }
        ((zamz)localObject).a(1);
        ((zamz)localObject).a(paramzbfd);
        ((zamz)localObject).a(localzamz.c());
        ((zamz)localObject).a(localzamz.e());
        zzo.a(localzamz.a(), ((zamz)localObject).a());
        localzamx2.a((zamz)localObject);
      }
    }
  }
  
  private static void c(zjf paramzjf, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    zamv localzamv = paramzjf.x();
    zamx localzamx1 = localzamv.e();
    zamx localzamx2 = localzamv.f();
    ArrayList localArrayList = localzamx1.a(localzamv.g(), paramBoolean1, paramBoolean2);
    localzamx1.clear();
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zamz localzamz1 = (zamz)localArrayList.get(i);
      zamz localzamz2 = localzamx2.c(i);
      if ((localzamz2 != null) && (!localzamz2.b()))
      {
        localzamz1.a(localzamz2.c());
        localzamz1.a(localzamz2.e());
        zzo.a(localzamz2.a(), localzamz1.a());
      }
      localzamx1.a(localzamz1);
    }
  }
  
  static int a(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++) {
      com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(((zbfd)paramList.get(i)).F().getCount()));
    }
    Collections.sort(localArrayList);
    if (localArrayList.size() == 0) {
      return 0;
    }
    return ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
  }
  
  static boolean a(List paramList, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, zbt paramzbt)
  {
    List localList = b(paramList);
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    int i = 0;
    for (int j = 0; j < localList.size(); j++)
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      double[] arrayOfDouble1 = { d1 };
      double[] arrayOfDouble2 = { d2 };
      boolean bool = a((ArrayList)localList.get(j), arrayOfDouble1, arrayOfDouble2, paramzbt, localList.size());
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
    if ((i == localList.size()) && (paramzbt.M() != paramzbt.N()))
    {
      paramArrayOfDouble1[0] = 0.0D;
      paramArrayOfDouble2[0] = 1.0D;
      if (!paramzbt.M()) {
        paramzbt.f(paramzbt.n() ? 1.0D : 0.0D);
      }
      if (!paramzbt.N()) {
        paramzbt.d(paramzbt.n() ? paramzbt.o() : 1.0D);
      }
    }
    else
    {
      if (!paramzbt.M()) {
        paramArrayOfDouble1[0] = (paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D());
      }
      if (!paramzbt.N()) {
        paramArrayOfDouble2[0] = (paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z());
      }
    }
    return c(paramList);
  }
  
  private static List b(List paramList)
  {
    zbfd localzbfd1 = (zbfd)paramList.get(0);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    Object localObject1 = paramList.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zbfd)((Iterator)localObject1).next();
      if (((zbfd)localObject2).b(new int[] { localzbfd1.m() })) {
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
      localzbfd1 = (zbfd)localArrayList2.get(0);
      localObject2 = new ArrayList();
      com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localArrayList2);
      localArrayList2.clear();
      Iterator localIterator = ((Iterable)localObject2).iterator();
      while (localIterator.hasNext())
      {
        zbfd localzbfd2 = (zbfd)localIterator.next();
        if (localzbfd2.b(new int[] { localzbfd1.m() })) {
          com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localzbfd2);
        } else {
          com.aspose.cells.b.a.a.zf.a(localArrayList2, localzbfd2);
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
  
  private static boolean a(ArrayList paramArrayList, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, zbt paramzbt, int paramInt)
  {
    boolean bool = false;
    zbfh localzbfh = new zbfh();
    Collections.sort(paramArrayList, localzbfh);
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    zbfd localzbfd1 = (zbfd)paramArrayList.get(0);
    int i;
    double d10;
    double d9;
    int i8;
    if (localzbfd1.ap())
    {
      int n;
      if ((localzbfd1.ar()) || (localzbfd1.aq()))
      {
        i = a(paramArrayList);
        int j = 1;
        for (n = 0; n < i; n++)
        {
          double d3 = 0.0D;
          for (int i3 = 0; i3 < paramArrayList.size(); i3++)
          {
            zbfd localzbfd2 = (zbfd)paramArrayList.get(i3);
            if (!localzbfd2.ap()) {
              break;
            }
            zkf localzkf1 = localzbfd2.F().b(n);
            if ((localzkf1 != null) && (!localzkf1.a()) && (localzkf1 != null))
            {
              d10 = localzkf1.w();
              d3 += d10;
              if (j != 0)
              {
                j = 0;
                bool = true;
                paramArrayOfDouble1[0] = d3;
                paramArrayOfDouble2[0] = d3;
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
      else
      {
        i = a(paramArrayList);
        ArrayList localArrayList = new ArrayList();
        n = a(paramArrayList);
        int i1 = 1;
        for (int i2 = 0; i2 < n; i2++)
        {
          double d6 = 0.0D;
          d9 = 0.0D;
          int i7 = 0;
          i8 = 0;
          int i9 = 1;
          for (int i11 = 0; i11 < paramArrayList.size(); i11++)
          {
            zbfd localzbfd5 = (zbfd)paramArrayList.get(i11);
            if (!localzbfd5.ap()) {
              break;
            }
            zkf localzkf4 = localzbfd5.F().b(i2);
            if (localzkf4 != null)
            {
              double d18 = localzkf4.w();
              if (!localzkf4.a()) {
                bool = true;
              }
              if (i1 != 0)
              {
                i1 = 0;
                i9 = 0;
                if (i == 1) {
                  paramArrayOfDouble1[0] = d18;
                } else if (i == 2) {
                  paramArrayOfDouble2[0] = d18;
                }
              }
              else if (i9 != 0)
              {
                i9 = 0;
                if ((i == 1) && (d18 < paramArrayOfDouble1[0])) {
                  paramArrayOfDouble1[0] = d18;
                } else if ((i == 2) && (d18 > paramArrayOfDouble2[0])) {
                  paramArrayOfDouble2[0] = d18;
                }
              }
              if (d18 < 0.0D)
              {
                i8 = 1;
                d9 += d18;
              }
              if (d18 > 0.0D)
              {
                i7 = 1;
                d6 += d18;
              }
            }
          }
          if ((i8 != 0) && (d9 < paramArrayOfDouble1[0])) {
            paramArrayOfDouble1[0] = d9;
          }
          if ((i7 != 0) && (d6 > paramArrayOfDouble2[0])) {
            paramArrayOfDouble2[0] = d6;
          }
        }
      }
    }
    else
    {
      double d4;
      int i4;
      int m;
      double d8;
      if (localzbfd1.as())
      {
        bool = true;
        double d2;
        double d5;
        if (localzbfd1.at())
        {
          i = a(paramArrayList);
          for (int k = 0; k < i; k++)
          {
            d2 = 0.0D;
            d5 = 0.0D;
            double d7 = 0.0D;
            d10 = 0.0D;
            for (i8 = 0; i8 < paramArrayList.size(); i8++)
            {
              zbfd localzbfd4 = (zbfd)paramArrayList.get(i8);
              if (!localzbfd4.as()) {
                break;
              }
              zkf localzkf3 = localzbfd4.F().b(k);
              if (localzkf3 != null)
              {
                double d16 = localzkf3.w();
                d2 += d16;
                d5 += Math.abs(d16);
                if (d2 < d7) {
                  d7 = d2;
                }
                if (d2 > d10) {
                  d10 = d2;
                }
              }
            }
            if (d5 != 0.0D)
            {
              double d13 = d7 / d5;
              if (d13 < paramArrayOfDouble1[0]) {
                paramArrayOfDouble1[0] = d13;
              }
              d13 = d10 / d5;
              if (d13 > paramArrayOfDouble2[0]) {
                paramArrayOfDouble2[0] = d13;
              }
            }
          }
        }
        else if (localzbfd1.au())
        {
          i = a(paramArrayList);
          double d1 = 0.0D;
          d4 = 0.0D;
          i4 = 1;
          int i5 = 1;
          d9 = 0.0D;
          double d12 = 0.0D;
          int i10 = 1;
          int i12 = 1;
          for (int i13 = 0; i13 < i; i13++)
          {
            double d17 = 0.0D;
            double d19 = 0.0D;
            double d20 = 0.0D;
            double d21 = 0.0D;
            for (int i14 = 0; i14 < paramArrayList.size(); i14++)
            {
              zbfd localzbfd6 = (zbfd)paramArrayList.get(i14);
              if (!localzbfd6.as()) {
                break;
              }
              zkf localzkf5 = localzbfd6.F().b(i13);
              double d23;
              if (localzkf5 != null)
              {
                d23 = localzkf5.w();
                if (i14 == 0) {
                  d21 = d23;
                }
                d17 += Math.abs(d23);
                if (d23 < 0.0D) {
                  d20 += d23;
                }
                if (d23 > 0.0D) {
                  d19 += d23;
                }
              }
              if (i14 == paramArrayList.size() - 1)
              {
                d23 = d21 / d17;
                if (d23 < 0.0D) {
                  if (i12 != 0)
                  {
                    d12 = d23;
                    i12 = 0;
                  }
                  else if (d23 > d12)
                  {
                    d12 = d23;
                  }
                }
                if (d23 > 0.0D) {
                  if (i10 != 0)
                  {
                    d9 = d23;
                    i10 = 0;
                  }
                  else if (d23 < d9)
                  {
                    d9 = d23;
                  }
                }
              }
            }
            if (d17 != 0.0D)
            {
              double d22 = d20 / d17;
              if ((i4 != 0) && (d22 != 0.0D))
              {
                d4 = d22;
                i4 = 0;
              }
              else if (d22 < d4)
              {
                d4 = d22;
              }
              d22 = d19 / d17;
              if ((i5 != 0) && (d22 != 0.0D))
              {
                d1 = d22;
                i5 = 0;
              }
              else if (d22 > d1)
              {
                d1 = d22;
              }
            }
          }
          if ((i5 == 0) && (i4 != 0))
          {
            paramArrayOfDouble2[0] = d1;
            paramArrayOfDouble1[0] = d9;
            if ((paramInt == 1) && (paramzbt.N()) && (paramzbt.M())) {
              paramzbt.d(paramArrayOfDouble2[0]);
            }
          }
          else if ((i5 != 0) && (i4 == 0))
          {
            paramArrayOfDouble2[0] = d12;
            paramArrayOfDouble1[0] = d4;
            if ((paramInt == 1) && (paramzbt.N()) && (paramzbt.M())) {
              paramzbt.f(paramArrayOfDouble1[0]);
            }
          }
          else
          {
            paramArrayOfDouble2[0] = d1;
            paramArrayOfDouble1[0] = d4;
          }
        }
        else
        {
          i = a(paramArrayList);
          for (m = 0; m < i; m++)
          {
            d2 = 0.0D;
            d5 = 0.0D;
            d8 = 0.0D;
            for (int i6 = 0; i6 < paramArrayList.size(); i6++)
            {
              zbfd localzbfd3 = (zbfd)paramArrayList.get(i6);
              if (!localzbfd3.as()) {
                break;
              }
              zkf localzkf2 = localzbfd3.F().b(m);
              if (localzkf2 != null)
              {
                double d15 = localzkf2.w();
                d2 += Math.abs(d15);
                if (d15 < 0.0D) {
                  d8 += d15;
                }
                if (d15 > 0.0D) {
                  d5 += d15;
                }
              }
            }
            if (d2 != 0.0D)
            {
              double d11 = d8 / d2;
              if (d11 < paramArrayOfDouble1[0]) {
                paramArrayOfDouble1[0] = d11;
              }
              double d14 = d5 / d2;
              if (d14 > paramArrayOfDouble2[0]) {
                paramArrayOfDouble2[0] = d14;
              }
            }
          }
        }
      }
      else
      {
        i = 1;
        for (m = 0; m < paramArrayList.size(); m++)
        {
          zkh localzkh = ((zbfd)paramArrayList.get(m)).F();
          d4 = 0.0D;
          for (i4 = 0; i4 < localzkh.getCount(); i4++) {
            if ((localzkh.a(i4) == null) || (!localzkh.a(i4).a())) {
              if ((localzkh.a(i4) != null) && (localzkh.a(i4).e()))
              {
                bool = true;
              }
              else
              {
                d8 = localzkh.a(i4) == null ? 0.0D : localzkh.a(i4).w();
                if (paramzbt.e().N() == 78)
                {
                  if ((localzkh.a(i4) != null) && (localzkh.a(i4).H())) {
                    d4 = d8;
                  } else {
                    d4 += d8;
                  }
                  d8 = d4;
                }
                if (i != 0)
                {
                  paramArrayOfDouble1[0] = d8;
                  paramArrayOfDouble2[0] = d8;
                  bool = true;
                  i = 0;
                }
                else
                {
                  if (d8 < paramArrayOfDouble1[0]) {
                    paramArrayOfDouble1[0] = d8;
                  }
                  if (d8 > paramArrayOfDouble2[0]) {
                    paramArrayOfDouble2[0] = d8;
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
  
  static int a(ArrayList paramArrayList)
  {
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramArrayList.size(); k++)
    {
      zkh localzkh = ((zbfd)paramArrayList.get(k)).F();
      for (int m = 0; m < localzkh.getCount(); m++) {
        if (localzkh.a(m) != null)
        {
          double d = localzkh.a(m).w();
          if (d > 0.0D) {
            i = 1;
          } else if (d < 0.0D) {
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
  
  private static boolean c(List paramList, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, zbt paramzbt)
  {
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    int i = 1;
    for (int j = 0; j < paramList.size(); j++)
    {
      zbfd localzbfd = (zbfd)paramList.get(j);
      zkh localzkh = localzbfd.F();
      double d1 = 0.0D;
      double d2 = 0.0D;
      int k = 1;
      for (int m = 0; m < localzkh.getCount(); m++) {
        if ((localzkh.a(m) != null) && (!localzkh.a(m).b()))
        {
          double d4 = localzkh.a(m).q();
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
      for (int n = 0; n < localzbfd.H().getCount(); n++)
      {
        zbxg localzbxg = localzbfd.H().c(n);
        if (localzbxg.d().h())
        {
          if (localzbxg.h() > d3) {
            d3 = localzbxg.h();
          }
          if (localzbxg.e() > d5) {
            d5 = localzbxg.e();
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
    if (!paramzbt.M()) {
      paramArrayOfDouble1[0] = (paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D());
    }
    if (!paramzbt.N()) {
      paramArrayOfDouble2[0] = (paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z());
    }
    return d(paramList);
  }
  
  private static boolean a(zjf paramzjf, List paramList1, List paramList2)
  {
    if ((paramList2.size() <= 0) || (paramList1.size() <= 0)) {
      return false;
    }
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.I();
    zbfd localzbfd1 = (zbfd)paramList1.get(0);
    zbfd localzbfd2 = (zbfd)paramList2.get(0);
    if ((localzbfd1.ai() == 14) || (localzbfd1.ai() == 15) || (localzbfd1.ai() == 16) || (localzbfd1.ai() == 60))
    {
      if ((localzbfd2.ai() != 14) && (localzbfd2.ai() != 15) && (localzbfd2.ai() != 16) && (localzbfd2.ai() != 60)) {
        return false;
      }
    }
    else if ((localzbfd1.ai() == 6) || (localzbfd1.ai() == 7) || (localzbfd1.ai() == 8))
    {
      if ((localzbfd2.ai() != 6) && (localzbfd2.ai() != 7) && (localzbfd2.ai() != 8)) {
        return false;
      }
    }
    else if (localzbfd1.ai() == 57)
    {
      if (localzbfd2.ai() != 57) {
        return false;
      }
    }
    else {
      return false;
    }
    return (!localzbt1.q()) || (!localzbt2.q());
  }
  
  private static zbt i(zjf paramzjf)
  {
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.I();
    if ((!localzbt1.q()) && (localzbt2.q())) {
      return localzbt2;
    }
    return localzbt1;
  }
  
  private static zbt j(zjf paramzjf)
  {
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.I();
    if ((!localzbt1.q()) && (localzbt2.q())) {
      return localzbt1;
    }
    return localzbt2;
  }
  
  static boolean a(List paramList1, List paramList2, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, zbt paramzbt)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    b(paramList1, arrayOfDouble1, arrayOfDouble2, paramzbt);
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble3 = { d3 };
    double[] arrayOfDouble4 = { d4 };
    b(paramList2, arrayOfDouble3, arrayOfDouble4, paramzbt);
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
    if (!paramzbt.M()) {
      paramArrayOfDouble1[0] = (paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D());
    }
    if (!paramzbt.N()) {
      paramArrayOfDouble2[0] = (paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z());
    }
    return (c(paramList1)) && (c(paramList2));
  }
  
  static void b(List paramList, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, zbt paramzbt)
  {
    List localList = b(paramList);
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    for (int i = 0; i < localList.size(); i++)
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      double[] arrayOfDouble1 = { d1 };
      double[] arrayOfDouble2 = { d2 };
      a((ArrayList)localList.get(i), arrayOfDouble1, arrayOfDouble2, paramzbt, localList.size());
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
  
  private static void a(zbt paramzbt1, zbt paramzbt2)
  {
    paramzbt1.l = paramzbt2.l;
    paramzbt1.d(paramzbt2.z());
    paramzbt1.f(paramzbt2.D());
    paramzbt1.g(paramzbt2.y());
    paramzbt1.c(paramzbt2.x());
    paramzbt1.i(paramzbt2.C());
    paramzbt1.e(paramzbt2.B());
  }
  
  private static void d(zbt paramzbt)
  {
    paramzbt.a = paramzbt.l;
    paramzbt.b = paramzbt.z();
    paramzbt.c = paramzbt.D();
    paramzbt.d = paramzbt.x();
    paramzbt.e = paramzbt.B();
  }
  
  private static boolean c(List paramList)
  {
    boolean bool = true;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      zbfd localzbfd = (zbfd)localIterator.next();
      if (!localzbfd.ag()) {
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
      zbfd localzbfd = (zbfd)localIterator.next();
      if (!localzbfd.af()) {
        bool = false;
      }
    }
    return bool;
  }
  
  static void a(zr paramzr, zbt paramzbt, double paramDouble1, double paramDouble2, boolean paramBoolean1, ArrayList paramArrayList, int paramInt, com.aspose.cells.b.a.b.zp paramzp, boolean paramBoolean2, zbfd paramzbfd)
    throws Exception
  {
    com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    if (localzp.f() > paramzbt.e().ax()) {
      localzp.d(localzp.f() - paramzbt.e().ax());
    }
    if (paramzbt.n())
    {
      a(paramzr, paramzbt, paramDouble1, paramDouble2, paramArrayList, paramInt, localzp, paramBoolean2, paramzbfd);
      return;
    }
    double d1 = paramDouble1;
    double d2 = paramDouble2;
    zjf localzjf = paramzbt.e();
    boolean bool1 = paramzbt.af();
    double d3;
    if ((paramDouble1 == paramDouble2) && (paramDouble1 == 0.0D))
    {
      d3 = 1.2D;
      if ((!paramBoolean1) || (d(paramzbfd.m()))) {
        d3 = 1.0D;
      }
      if (bool1) {
        d3 = 1.0D;
      }
      paramzbt.d(d3);
      paramDouble1 = d3;
      d1 = d3;
      paramzbt.f(0.0D);
    }
    else if (paramDouble1 <= paramDouble2)
    {
      double[] arrayOfDouble1;
      double[] arrayOfDouble2;
      if ((!paramzbt.N()) && (paramzbt.M()))
      {
        d3 = 0.0D;
        if (paramzbt.O())
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
          d3 = paramzbt.x();
        }
        if (paramzbt.z() > 0.0D) {
          paramDouble2 = 0.0D;
        } else if (d3 == 0.0D) {
          paramDouble2 = -1.0D;
        } else {
          paramDouble2 = paramDouble1 - Math.abs(d3) * 10.0D;
        }
      }
      else if ((paramzbt.N()) && (!paramzbt.M()))
      {
        d3 = 0.0D;
        if (paramzbt.O())
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
          d3 = paramzbt.x();
        }
        if (paramzbt.D() < 0.0D) {
          paramDouble1 = 0.0D;
        } else if (d3 == 0.0D) {
          paramDouble1 = 1.0D;
        } else {
          paramDouble1 = paramDouble2 + Math.abs(d3) * 10.0D;
        }
      }
    }
    boolean bool2 = paramzbt.N();
    boolean bool3 = paramzbt.M();
    double d4 = 0.0D;
    int i = 1;
    if (bool1)
    {
      if ((paramDouble1 == 1.0D) && (paramzbt.N())) {
        paramzbt.d(1.0D);
      }
      if ((paramDouble2 == -1.0D) && (paramzbt.M())) {
        paramzbt.f(-1.0D);
      }
    }
    double d5 = 0.0D;
    double d6 = 0.0D;
    Object localObject1 = { d5 };
    Object localObject2 = { d6 };
    double[] arrayOfDouble3 = { paramDouble2 };
    double[] arrayOfDouble4 = { paramDouble1 };
    double[] arrayOfDouble5 = { d4 };
    int[] arrayOfInt = { i };
    a((double[])localObject1, (double[])localObject2, arrayOfDouble3, arrayOfDouble4, arrayOfDouble5, arrayOfInt, paramzbt, paramBoolean2, d1, d2, bool2, bool3, paramzbfd);
    d5 = localObject1[0];
    d6 = localObject2[0];
    paramDouble2 = arrayOfDouble3[0];
    paramDouble1 = arrayOfDouble4[0];
    d4 = arrayOfDouble5[0];
    i = arrayOfInt[0];
    if (!paramzbt.P())
    {
      if ((!paramzbt.O()) && (paramzbt.x() < paramzbt.B())) {
        throw new IllegalArgumentException("The numbers you specified can't be used because the interval for the minor unittick marks must be less than or equal to the interval for the major unit tick marks!");
      }
      if (d4 < paramzbt.B()) {
        d4 = paramzbt.B();
      }
    }
    a(paramzbt, i, d4, d6, d5, paramArrayList, d1, d2, bool2, bool3, bool1);
    localObject1 = new com.aspose.cells.b.a.b.zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
    if ((paramInt == 57) || (paramInt == 59) || (paramInt == 58))
    {
      localObject2 = new com.aspose.cells.b.a.b.zp[] { localObject1 };
      zbxz.a((com.aspose.cells.b.a.b.zp[])localObject2);
      localObject1 = localObject2[0];
    }
    int j = a(paramzr, paramzbt, paramBoolean2, paramzbfd, (com.aspose.cells.b.a.b.zp)localObject1);
    int k = 0;
    if (paramzbt.e().ab())
    {
      if (paramBoolean2) {
        k = (int)paramzbt.e().S().g();
      } else {
        k = (int)paramzbt.e().S().i();
      }
    }
    else if (paramBoolean2) {
      k = ((com.aspose.cells.b.a.b.zp)localObject1).e();
    } else {
      k = ((com.aspose.cells.b.a.b.zp)localObject1).f();
    }
    int m = paramArrayList.size();
    double d7 = d4;
    int n = paramArrayList.size();
    for (int i1 = j; (paramzbt.O()) && (paramArrayList.size() > 3) && (((c(paramInt)) && (paramzbt.c())) || (((j - m > k) && (k != 0)) || ((c(paramInt)) && (paramzbt.c()) && (paramArrayList.size() > 10) && (j * 4.0F > k) && (k != 0)))); i1 = j)
    {
      double d8 = 0.0D;
      double[] arrayOfDouble6 = { d4 };
      double[] arrayOfDouble7 = { d8 };
      a(d4, arrayOfDouble6, arrayOfDouble7);
      d4 = arrayOfDouble6[0];
      d8 = arrayOfDouble7[0];
      d4 *= 10.0D;
      a(paramzbt, i, d4, d6, d5, paramArrayList, d1, d2, bool2, bool3, bool1);
      j = a(paramzr, paramzbt, paramBoolean2, paramzbfd, (com.aspose.cells.b.a.b.zp)localObject1);
      m = paramArrayList.size();
      if ((d7 == d4) || (n == paramArrayList.size()) || (i1 == j))
      {
        if (d4 == d7) {
          break;
        }
        d4 = d7;
        a(paramzbt, i, d4, d6, d5, paramArrayList, d1, d2, bool2, bool3, bool1);
        break;
      }
      d7 = d4;
      n = paramArrayList.size();
    }
    if (paramArrayList.size() >= 2)
    {
      paramzbt.d(((Double)paramArrayList.get(0)).doubleValue());
      paramzbt.f(((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue());
      if (paramzbt.O()) {
        paramzbt.c(d4);
      }
      if (paramzbt.P()) {
        paramzbt.e(paramzbt.x() / 5.0D);
      }
    }
  }
  
  private static void a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double[] paramArrayOfDouble3, double[] paramArrayOfDouble4, double[] paramArrayOfDouble5, int[] paramArrayOfInt, zbt paramzbt, boolean paramBoolean1, double paramDouble1, double paramDouble2, boolean paramBoolean2, boolean paramBoolean3, zbfd paramzbfd)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = zbxz.a(paramArrayOfDouble4[0], zbxz.g(paramArrayOfDouble4[0]));
    double d6 = zbxz.a(paramArrayOfDouble3[0], zbxz.g(paramArrayOfDouble3[0]));
    double d9;
    double d11;
    double d14;
    if (paramzbt.O())
    {
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
      double[] arrayOfDouble7;
      double[] arrayOfDouble8;
      if ((d5 != d6) && (paramArrayOfDouble4[0] > 0.0D) && (paramArrayOfDouble3[0] > 0.0D))
      {
        d9 = zbxz.b(paramArrayOfDouble4[0], paramArrayOfDouble3[0]);
        d10 = 0.0D;
        d11 = 0.0D;
        arrayOfDouble7 = new double[] { d10 };
        arrayOfDouble8 = new double[] { d11 };
        a(d9, arrayOfDouble7, arrayOfDouble8);
        d10 = arrayOfDouble7[0];
        d11 = arrayOfDouble8[0];
        if (paramArrayOfDouble3[0] / d9 >= 5.0D)
        {
          if (!paramzbt.N())
          {
            paramArrayOfDouble1[0] = paramArrayOfDouble4[0];
            paramArrayOfDouble3[0] -= d11;
            if (((paramzbt.g() == 0) || (paramzbt.g() == 2)) && (paramzbfd.ai() == 60)) {
              while (paramArrayOfDouble2[0] + d10 < paramArrayOfDouble3[0]) {
                paramArrayOfDouble2[0] += d10;
              }
            }
          }
          else
          {
            paramArrayOfDouble2[0] = (zbxz.b(paramArrayOfDouble3[0], d11) / 2.0D);
            paramArrayOfDouble3[0] += d11;
          }
          paramArrayOfDouble5[0] = Math.abs(d10);
          if ((paramzbt.g() == 0) || (paramzbt.g() == 2))
          {
            if (zbxz.b(paramArrayOfDouble4[0], paramArrayOfDouble3[0]) / paramArrayOfDouble5[0] >= 9.0D) {
              a(paramArrayOfDouble5);
            }
          }
          else if (zbxz.b(paramArrayOfDouble4[0], paramArrayOfDouble3[0]) / paramArrayOfDouble5[0] >= 8.0D) {
            a(paramArrayOfDouble5);
          }
          int j = zbxz.a(paramArrayOfDouble5);
          d14 = 0.0D;
          d14 = zbxz.a(Math.floor((3.0D * paramArrayOfDouble3[0] - paramArrayOfDouble4[0]) / (2.0D * paramArrayOfDouble5[0])) * paramArrayOfDouble5[0], j);
          if ((paramzbt.M()) && (paramzbt.N()))
          {
            if ((paramzbt.g() == 0) || (paramzbt.g() == 2)) {}
            while ((zbxz.b(paramDouble2, d14) > paramArrayOfDouble5[0]) && (d14 != 0.0D))
            {
              d14 += paramArrayOfDouble5[0];
              continue;
              if ((paramzbfd.ay()) && (zbxz.b(paramArrayOfDouble1[0], d14) / paramArrayOfDouble5[0] >= 11.0D))
              {
                for (double d15 = d14; (zbxz.b(paramDouble2, d15) > paramArrayOfDouble5[0]) && (d15 != 0.0D); d15 += paramArrayOfDouble5[0]) {}
                double d16 = paramArrayOfDouble5[0];
                double[] arrayOfDouble9 = { d16 };
                a(paramzbt, d15, paramArrayOfDouble1[0], arrayOfDouble9, 2, paramDouble1, paramDouble2, paramBoolean2, paramBoolean3, true);
                d16 = arrayOfDouble9[0];
                if (d16 == paramArrayOfDouble5[0]) {
                  d14 = d15;
                }
              }
            }
            paramzbt.f(d14);
            paramArrayOfDouble2[0] = d14;
          }
        }
        else
        {
          if (paramzbt.M()) {
            paramArrayOfDouble2[0] = 0.0D;
          }
          if ((paramzbt.M()) && (paramzbt.N()))
          {
            paramzbt.f(0.0D);
          }
          else if ((!paramzbt.M()) && (paramzbt.N()))
          {
            paramArrayOfDouble5[0] = Math.abs(d10);
            for (double d13 = paramArrayOfDouble2[0]; d13 <= paramArrayOfDouble4[0]; d13 += paramArrayOfDouble5[0]) {}
            paramArrayOfDouble1[0] = d13;
          }
        }
      }
      else if ((d5 != d6) && (paramArrayOfDouble4[0] < 0.0D) && (paramArrayOfDouble3[0] < 0.0D))
      {
        d9 = paramArrayOfDouble3[0] - paramArrayOfDouble4[0];
        d10 = 0.0D;
        d11 = 0.0D;
        arrayOfDouble7 = new double[] { d10 };
        arrayOfDouble8 = new double[] { d11 };
        a(d9, arrayOfDouble7, arrayOfDouble8);
        d10 = arrayOfDouble7[0];
        d11 = arrayOfDouble8[0];
        if (paramArrayOfDouble3[0] / d9 >= 5.0D)
        {
          paramArrayOfDouble4[0] -= d11 / 2.0D;
          paramArrayOfDouble4[0] += d11;
          paramArrayOfDouble5[0] = Math.abs(d10);
          if ((paramArrayOfDouble4[0] - paramArrayOfDouble3[0]) / paramArrayOfDouble5[0] >= 8.0D) {
            a(paramArrayOfDouble5);
          }
          int k = zbxz.a(paramArrayOfDouble5);
          for (d14 = 0.0D; d14 - 3.0D * paramArrayOfDouble5[0] > paramArrayOfDouble4[0]; d14 -= paramArrayOfDouble5[0]) {
            d14 = zbxz.a(d14, k);
          }
          if ((paramzbt.N()) && (paramzbt.M()))
          {
            if ((paramzbt.g() == 0) || (paramzbt.g() == 2)) {
              while ((zbxz.b(d14, paramDouble1) > paramArrayOfDouble5[0]) && (d14 != 0.0D)) {
                d14 -= paramArrayOfDouble5[0];
              }
            }
            paramzbt.d(d14);
            paramArrayOfDouble1[0] = d14;
          }
        }
        else
        {
          if (paramzbt.N()) {
            paramArrayOfDouble1[0] = 0.0D;
          }
          if ((paramzbt.N()) && (paramzbt.M())) {
            paramzbt.d(0.0D);
          } else if ((!paramzbt.N()) && (paramzbt.M())) {
            paramArrayOfDouble5[0] = Math.abs(d10);
          }
        }
      }
      else if ((d5 != d6) && (paramArrayOfDouble4[0] > 0.0D) && (paramArrayOfDouble3[0] < 0.0D))
      {
        d9 = paramArrayOfDouble4[0] - paramArrayOfDouble3[0];
        d10 = 0.0D;
        d11 = 0.0D;
        arrayOfDouble7 = new double[] { d10 };
        arrayOfDouble8 = new double[] { d11 };
        a(d9, arrayOfDouble7, arrayOfDouble8);
        d10 = arrayOfDouble7[0];
        d11 = arrayOfDouble8[0];
        paramArrayOfDouble5[0] = Math.abs(d10);
        if ((paramArrayOfDouble4[0] - paramArrayOfDouble3[0]) / paramArrayOfDouble5[0] > 9.5D) {
          a(paramArrayOfDouble5);
        }
      }
      if ((paramzbt.N()) && (paramzbt.M()))
      {
        paramArrayOfInt[0] = 3;
        if ((paramArrayOfDouble3[0] == 0.0D) || ((paramArrayOfDouble4[0] == paramArrayOfDouble3[0]) && (paramArrayOfDouble4[0] > 0.0D)))
        {
          paramzbt.f(0.0D);
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = 0.0D;
        }
        if ((paramArrayOfDouble4[0] == 0.0D) || ((paramArrayOfDouble4[0] == paramArrayOfDouble3[0]) && (paramArrayOfDouble4[0] < 0.0D)))
        {
          paramzbt.d(0.0D);
          paramArrayOfInt[0] = 1;
          paramArrayOfDouble1[0] = 0.0D;
        }
      }
      else if ((!paramzbt.N()) && (paramzbt.M()))
      {
        paramArrayOfInt[0] = 1;
        paramArrayOfDouble1[0] = paramzbt.z();
        paramArrayOfDouble4[0] = paramzbt.z();
      }
      else if ((paramzbt.N()) && (!paramzbt.M()))
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbt.D();
        paramArrayOfDouble3[0] = paramzbt.D();
      }
      else
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbt.D();
        paramArrayOfDouble1[0] = paramzbt.z();
        paramArrayOfDouble3[0] = paramzbt.D();
        paramArrayOfDouble4[0] = paramzbt.z();
        d9 = zbxz.b(paramArrayOfDouble4[0], paramArrayOfDouble3[0]);
        d10 = 0.0D;
        d11 = 0.0D;
        arrayOfDouble7 = new double[] { d10 };
        arrayOfDouble8 = new double[] { d11 };
        a(d9, arrayOfDouble7, arrayOfDouble8);
        d10 = arrayOfDouble7[0];
        d11 = arrayOfDouble8[0];
        String str = com.aspose.cells.b.a.zo.b(d10);
        if ((str.indexOf("5") > 0) && (zbxz.b(d11, d9) == d10)) {
          paramArrayOfDouble5[0] = (d10 * 0.4D);
        } else {
          paramArrayOfDouble5[0] = d10;
        }
      }
      a(paramzbt, paramArrayOfDouble2[0], paramArrayOfDouble1[0], paramArrayOfDouble5, paramArrayOfInt[0], paramDouble1, paramDouble2, paramBoolean2, paramBoolean3, paramBoolean1);
    }
    else
    {
      paramArrayOfDouble5[0] = paramzbt.x();
      paramArrayOfDouble2[0] = paramArrayOfDouble3[0];
      paramArrayOfDouble1[0] = paramArrayOfDouble4[0];
      double d7;
      double d8;
      double[] arrayOfDouble5;
      double[] arrayOfDouble6;
      int i;
      double d12;
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
          d11 = Math.abs(d8);
          i = zbxz.g(d11);
          if ((paramzbt.M()) && (paramzbt.N()))
          {
            i = zbxz.a(paramArrayOfDouble5);
            for (d12 = 0.0D; d12 <= paramArrayOfDouble2[0]; d12 += paramArrayOfDouble5[0]) {
              d12 = zbxz.a(d12, i);
            }
            if ((paramzbt.g() == 0) || (paramzbt.g() == 2))
            {
              if (d12 > paramArrayOfDouble3[0]) {
                d12 -= paramArrayOfDouble5[0];
              }
              paramzbt.f(d12);
            }
            else
            {
              paramzbt.f(d12 - paramArrayOfDouble5[0]);
            }
            paramArrayOfDouble3[0] = paramzbt.D();
            paramArrayOfDouble2[0] = paramzbt.D();
          }
        }
        else
        {
          if ((paramzbt.M()) && (paramzbt.N()))
          {
            paramzbt.f(0.0D);
            paramArrayOfDouble3[0] = paramzbt.D();
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
          d11 = Math.abs(d8);
          i = zbxz.g(d11);
          for (d12 = 0.0D; d12 > paramArrayOfDouble1[0]; d12 -= d11) {
            d12 = zbxz.a(d12, i);
          }
          if ((paramzbt.N()) && (paramzbt.M()))
          {
            i = zbxz.a(paramArrayOfDouble5);
            for (d14 = 0.0D; d14 >= d12; d14 -= paramArrayOfDouble5[0]) {
              d14 = zbxz.a(d14, i);
            }
            if ((paramzbt.g() == 0) || (paramzbt.g() == 2)) {
              paramzbt.d(d14);
            } else {
              paramzbt.d(d14 + paramArrayOfDouble5[0]);
            }
            paramArrayOfDouble4[0] = paramzbt.z();
            paramArrayOfDouble1[0] = paramzbt.z();
          }
        }
        else
        {
          if ((paramzbt.N()) && (paramzbt.M()))
          {
            paramzbt.d(0.0D);
            paramArrayOfDouble4[0] = paramzbt.z();
          }
          paramArrayOfDouble1[0] = 0.0D;
        }
      }
      if ((paramzbt.N()) && (paramzbt.M()))
      {
        paramArrayOfInt[0] = 3;
        if (paramArrayOfDouble3[0] == 0.0D)
        {
          paramzbt.f(0.0D);
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = 0.0D;
        }
        if (paramArrayOfDouble4[0] == 0.0D)
        {
          paramzbt.d(0.0D);
          paramArrayOfInt[0] = 1;
          paramArrayOfDouble1[0] = 0.0D;
        }
      }
      else if ((!paramzbt.N()) && (paramzbt.M()))
      {
        paramArrayOfInt[0] = 1;
        paramArrayOfDouble1[0] = paramzbt.z();
        paramArrayOfDouble4[0] = paramzbt.z();
      }
      else if ((paramzbt.N()) && (!paramzbt.M()))
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbt.D();
        paramArrayOfDouble3[0] = paramzbt.D();
      }
      else
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbt.D();
        paramArrayOfDouble1[0] = paramzbt.z();
        paramArrayOfDouble3[0] = paramzbt.D();
        paramArrayOfDouble4[0] = paramzbt.z();
      }
    }
  }
  
  private static boolean k(zjf paramzjf)
  {
    return (paramzjf.ab()) || (paramzjf.N() == 57) || (paramzjf.N() == 59) || (paramzjf.N() == 58);
  }
  
  private static void a(zbt paramzbt, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, ArrayList paramArrayList, double paramDouble4, double paramDouble5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    zjf localzjf = paramzbt.e();
    boolean bool = k(paramzbt.e());
    int i = ze.a(zc.a().c());
    paramArrayList.clear();
    double d1;
    int j;
    double d2;
    double d3;
    if (paramInt == 1)
    {
      d1 = paramDouble3;
      j = zbxz.g(paramDouble1);
      for (d2 = zbxz.a(d1, j); (d2 >= paramDouble2) || (zbxz.b(paramDouble2, d2) < zbxz.a(paramDouble1, j)) || ((paramDouble2 == zbxz.a(paramDouble1, j)) && (d2 > 0.0D)) || (paramDouble2 == d2) || ((zbxz.b(d2, paramDouble3) == zbxz.a(paramDouble1, j)) && (paramArrayList.size() < 3)); d2 = zbxz.a(d1, j))
      {
        if ((!paramzbt.M()) && (d1 < paramzbt.D())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbt.D()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d2));
        }
        d1 = paramDouble3 - paramDouble1 * paramArrayList.size();
      }
      if (paramBoolean2)
      {
        d3 = 2.147483647E9D;
        if (paramArrayList.size() > 0) {
          d3 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        }
        if ((zbxz.b(paramDouble5, d3) > paramDouble1) && (d3 != 0.0D))
        {
          d3 += paramDouble1;
          if ((paramDouble5 - paramDouble3) / (d3 - paramDouble3) <= 0.9523809523809523D) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
        else if (((paramDouble5 - paramDouble3) / (d3 - paramDouble3) > 0.9523809523809523D) && (d3 != 0.0D))
        {
          d1 = zbxz.a(d3 - paramDouble1, j);
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
    }
    else if (paramInt == 2)
    {
      d1 = paramDouble2;
      j = zbxz.g(paramDouble1);
      for (d2 = zbxz.a(d1, j); (d2 <= paramDouble3) || (d2 < paramDouble3 + paramDouble1) || ((d2 == paramDouble1) && (paramDouble3 > 0.0D)) || (d2 == paramDouble3) || ((d2 == paramDouble3 + paramDouble1) && (paramArrayList.size() < 3)); d2 = zbxz.a(d1, j))
      {
        if ((!paramzbt.N()) && (d2 > paramzbt.z())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbt.z()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d2));
        }
        d1 = paramDouble2 + paramDouble1 * paramArrayList.size();
      }
      if (paramBoolean1)
      {
        d3 = -2.147483648E9D;
        if (paramArrayList.size() > 0) {
          d3 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        }
        if ((zbxz.b(d3, paramDouble4) > paramDouble1) && (d3 != 0.0D))
        {
          d3 -= paramDouble1;
          if ((paramDouble4 - paramDouble2) / (d3 - paramDouble2) <= 0.9523809523809523D) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
        else if (((paramDouble4 - paramDouble2) / (d3 - paramDouble2) > 0.9523809523809523D) && (d3 != 0.0D))
        {
          double d4 = 2.147483647E9D;
          if (paramArrayList.size() > 0) {
            d4 = ((Double)paramArrayList.get(0)).doubleValue();
          }
          int k = 1;
          if ((paramBoolean2) && (d4 != 0.0D) && (paramArrayList.size() < 3)) {
            k = 0;
          }
          if (k != 0)
          {
            d1 = zbxz.a(d3 + paramDouble1, j);
            com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
          }
        }
      }
      Collections.reverse(paramArrayList);
    }
    else
    {
      d1 = 0.0D;
      j = zbxz.g(paramDouble1);
      while ((d1 <= paramDouble3) || (zbxz.b(d1, paramDouble3) < paramDouble1) || ((d1 == paramDouble1) && (paramDouble3 > 0.0D)) || (d1 == paramDouble3) || ((zbxz.b(d1, paramDouble3) == paramDouble1) && (paramArrayList.size() < 3)))
      {
        d1 = zbxz.a(d1, j);
        if ((!paramzbt.N()) && (d1 > paramzbt.z())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbt.z()));
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
      for (d1 = 0.0D - paramDouble1; (d1 >= paramDouble2) || (zbxz.b(paramDouble2, d1) < paramDouble1) || ((paramDouble2 == paramDouble1) && (d1 > 0.0D)) || (paramDouble2 == d1) || ((zbxz.b(paramDouble2, d1) == paramDouble1) && (paramArrayList.size() < 3)); d1 -= paramDouble1)
      {
        d1 = zbxz.a(d1, j);
        if ((!paramzbt.M()) && (d1 < paramzbt.D())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbt.D()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d1));
        }
      }
      if (paramBoolean2)
      {
        d2 = 2.147483647E9D;
        if (paramArrayList.size() > 0) {
          d2 = ((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue();
        }
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
      if (((paramBoolean3) || (k(localzjf))) && (paramDouble4 > 0.0D) && (((Double)paramArrayList.get(0)).doubleValue() >= paramDouble4 + paramDouble1) && (((Double)paramArrayList.get(0)).doubleValue() != 0.0D) && (paramBoolean1) && (paramArrayList.size() >= 3)) {
        paramArrayList.remove(0);
      }
      if (((paramBoolean3) || (k(localzjf))) && (paramDouble5 < 0.0D) && (((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue() <= zbxz.b(paramDouble5, paramDouble1)) && (((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue() != 0.0D) && (paramBoolean2) && (paramArrayList.size() >= 3)) {
        paramArrayList.remove(paramArrayList.size() - 1);
      }
    }
  }
  
  static int a(zr paramzr, zbt paramzbt, boolean paramBoolean, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp)
  {
    if (paramzbt.I() == 3) {
      return 0;
    }
    int i = paramzbfd.ai();
    zjf localzjf = paramzbt.e();
    zbwv localzbwv = paramzbt.J();
    zkf localzkf = paramzbfd.F().b(0);
    String str1 = localzkf.A();
    boolean bool = localzkf.B();
    if ((paramzbt.g() == 0) || (paramzbt.g() == 2))
    {
      str1 = localzkf.u();
      bool = localzkf.v();
    }
    int j = 0;
    if ((localzbwv.c()) && (localzkf != null)) {
      j = 1;
    }
    Object localObject = "";
    for (int k = 1; k < paramzbt.l.size() - 1; k++)
    {
      double d = ((Double)paramzbt.l.get(k)).doubleValue();
      if ((i == 8) || (i == 16))
      {
        d /= 100.0D;
        str1 = "0%";
      }
      String str2 = "";
      d *= Math.pow(10.0D, paramzbt.T().f());
      if (j != 0) {
        str2 = zra.a(localzjf.an(), Double.valueOf(d), str1, bool, localzjf.U());
      } else {
        str2 = zbv.a(paramzbt, Double.valueOf(d));
      }
      if (str2.length() > ((String)localObject).length()) {
        localObject = str2;
      }
    }
    com.aspose.cells.b.a.b.zs localzs1 = new com.aspose.cells.b.a.b.zs(paramzp.e(), paramzp.f());
    com.aspose.cells.b.a.b.zs localzs2;
    if (localzbwv.e() == 0)
    {
      if ((paramzbt.d()) && (!e(i))) {
        localzs2 = zbvy.a(paramzbt.e().ap(), (String)localObject, localzbwv.e(), localzbwv.a(), localzs1, 1, 1);
      } else {
        localzs2 = zbvy.a(paramzbt.e().ap(), (String)localObject, localzbwv.e(), localzbwv.a(), localzs1, 1, 1, localzbwv.n());
      }
    }
    else if ((paramzbt.d()) && (!e(i))) {
      localzs2 = zbvy.a(paramzbt.e().ap(), (String)localObject, localzbwv.e(), localzbwv.a(), localzs1, 1, 1);
    } else {
      localzs2 = zbvy.a(paramzbt.e().ap(), (String)localObject, localzbwv.e(), localzbwv.a(), localzs1, 1, 1, localzbwv.n());
    }
    float f = 0.0F;
    int m = paramzbt.l.size() - 1;
    if (paramBoolean) {
      f = localzs2.b() * m;
    } else {
      f = localzs2.c() * m;
    }
    if ((i == 57) || (i == 58) || (i == 59))
    {
      f += 2.2F * m;
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
      double d = paramDouble * Math.pow(10.0D, j);
      b(d, paramArrayOfDouble1, paramArrayOfDouble2);
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
    return (paramInt == 13) || (paramInt == 12);
  }
  
  private static boolean d(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 4: 
      return true;
    }
    return false;
  }
  
  private static boolean e(int paramInt)
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
  
  static void a(zbt paramzbt, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble, int paramInt, double paramDouble3, double paramDouble4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    double d1 = paramDouble1;
    double d2 = paramDouble2;
    int i = zbxz.a(paramArrayOfDouble);
    if (paramInt == 1)
    {
      d3 = paramDouble2;
      if (!paramzbt.M())
      {
        d1 = paramzbt.D();
      }
      else
      {
        while ((d3 >= paramDouble1) || (paramDouble1 - d3 < paramArrayOfDouble[0]))
        {
          d3 = zbxz.a(d3, i);
          d1 = d3;
          double d4 = paramArrayOfDouble[0];
          d3 = zbxz.b(d3, d4);
        }
        if (((zbxz.b(paramDouble4, d1) <= paramArrayOfDouble[0]) || (d1 == 0.0D)) && ((paramDouble4 - paramDouble2) / (d1 - paramDouble2) > 0.9523809523809523D) && (d1 != 0.0D)) {
          d1 = zbxz.a(d1 - paramArrayOfDouble[0], i);
        }
      }
    }
    else if (paramInt == 2)
    {
      d3 = paramDouble1;
      if (!paramzbt.N())
      {
        d2 = paramzbt.z();
      }
      else
      {
        int j = 0;
        while ((d3 <= paramDouble2) || (d3 < paramDouble2 + paramArrayOfDouble[0]))
        {
          d3 = zbxz.a(d3, i);
          d2 = d3;
          double d6 = paramArrayOfDouble[0];
          j++;
          double d7 = paramDouble1 + d6 * j;
          d3 = d7;
        }
        if (((zbxz.b(d2, paramDouble3) <= paramArrayOfDouble[0]) || (d2 == 0.0D)) && ((paramDouble3 - paramDouble1) / (d2 - paramDouble1) > 0.9523809523809523D) && (d2 != 0.0D)) {
          d2 = zbxz.a(d2 + paramArrayOfDouble[0], i);
        }
      }
    }
    else
    {
      d3 = 0.0D;
      if (!paramzbt.M())
      {
        d1 = paramzbt.D();
      }
      else
      {
        while ((d3 >= paramDouble1) || (paramDouble1 - d3 < paramArrayOfDouble[0]))
        {
          d3 = zbxz.a(d3, i);
          d1 = d3;
          d5 = paramArrayOfDouble[0];
          d3 = zbxz.b(d3, d5);
        }
        if (((zbxz.b(paramDouble4, d1) <= paramArrayOfDouble[0]) || (d1 == 0.0D)) && ((paramDouble4 - paramDouble2) / (d1 - paramDouble2) > 0.9523809523809523D) && (d1 != 0.0D)) {
          d1 = zbxz.a(d1 - paramArrayOfDouble[0], i);
        }
      }
      d3 = 0.0D;
      if (!paramzbt.N())
      {
        d2 = paramzbt.D();
      }
      else
      {
        while ((d3 <= paramDouble2) || (d3 < paramDouble2 + paramArrayOfDouble[0]))
        {
          d3 = zbxz.a(d3, i);
          d2 = d3;
          d5 = paramArrayOfDouble[0];
          d3 = zbxz.c(d3, d5);
        }
        if (((zbxz.b(d2, paramDouble3) <= paramArrayOfDouble[0]) || (d2 == 0.0D)) && ((paramDouble3 - paramDouble1) / (d2 - paramDouble1) > 0.9523809523809523D) && (d2 != 0.0D)) {
          d2 = zbxz.a(d2 + paramArrayOfDouble[0], i);
        }
      }
    }
    double d3 = paramArrayOfDouble[0];
    double d5 = (d2 - d1) / paramArrayOfDouble[0];
    int k = c(paramzbt.e().N()) ? 10 : 11;
    if ((paramzbt.e().ab()) || (paramBoolean3)) {
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
      int m = 10;
      if (paramBoolean3) {
        m = 9;
      }
      if (d2 - d1 > m * paramArrayOfDouble[0]) {
        paramArrayOfDouble[0] = d3;
      }
    }
  }
  
  static void a(zbt paramzbt, double paramDouble1, double paramDouble2, int paramInt, float paramFloat, boolean paramBoolean1, zbfd paramzbfd, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    zjf localzjf = paramzbt.e();
    ArrayList localArrayList = paramzbt.l;
    if (paramzbt.I() == 3) {
      return;
    }
    if (localArrayList.size() <= 2) {
      return;
    }
    double d1 = paramDouble1;
    double d2 = paramDouble2;
    if ((paramDouble1 == paramDouble2) && (paramDouble1 == 0.0D))
    {
      paramzbt.d(1.0D);
      paramDouble1 = 1.0D;
      d1 = 1.0D;
      paramzbt.f(0.0D);
      paramBoolean2 = false;
      paramBoolean3 = false;
    }
    if ((paramBoolean1) && (paramBoolean4))
    {
      boolean bool = false;
      if ((paramInt == 8) || (paramInt == 16) || (localzjf.N() == 20) || (localzjf.N() == 11)) {
        bool = true;
      }
      if (bool)
      {
        if ((paramDouble1 == 100.0D) && (paramBoolean2)) {
          paramzbt.d(100.0D);
        }
        if ((paramDouble2 == -100.0D) && (paramBoolean3)) {
          paramzbt.f(-100.0D);
        }
      }
      int i = 1;
      double d3 = ((Double)paramzbt.l.get(paramzbt.l.size() - 1)).doubleValue();
      double d4 = ((Double)paramzbt.l.get(0)).doubleValue();
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
      double d5 = paramzbt.x();
      double[] arrayOfDouble = { d5 };
      a(arrayOfDouble, paramzbt, paramzbfd, paramFloat, i, d3, d4, d1, d2, paramBoolean2, paramBoolean3, bool);
      d5 = arrayOfDouble[0];
      if (localArrayList.size() >= 2)
      {
        paramzbt.d(((Double)localArrayList.get(0)).doubleValue());
        paramzbt.f(((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue());
        paramzbt.c(d5);
        if (paramzbt.P()) {
          paramzbt.e(paramzbt.x() / 5.0D);
        }
      }
    }
  }
  
  private static void a(double[] paramArrayOfDouble, zbt paramzbt, zbfd paramzbfd, float paramFloat, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    zjf localzjf = paramzbt.e();
    ArrayList localArrayList = paramzbt.l;
    if (paramzbt.I() == 3) {
      return;
    }
    if (localArrayList.size() <= 2) {
      return;
    }
    float f1 = 0.0F;
    f1 = paramzbt.J().r();
    float f2 = 3.0F;
    if (paramzbt.J().a().h() <= 9.0F) {
      f2 = 1.9F;
    } else if (paramzbt.J().a().h() <= 10.0F) {
      f2 = 2.5F;
    }
    float f3 = paramFloat / (paramzbt.l.size() - 1);
    double d1;
    if ((f3 / f1 > 9.0F) && ((k(localzjf)) || (!paramBoolean1) || (!paramBoolean2)))
    {
      b(paramArrayOfDouble);
      if (((Double)localArrayList.get(0)).doubleValue() - ((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue() > 11.0D * paramArrayOfDouble[0])
      {
        a(paramArrayOfDouble);
      }
      else
      {
        d1 = paramArrayOfDouble[0];
        b(paramzbt, paramInt, d1, paramDouble1, paramDouble2, localArrayList, paramDouble3, paramDouble4, paramBoolean1, paramBoolean2, paramBoolean3);
      }
    }
    else if (f3 / f1 < f2)
    {
      d1 = paramArrayOfDouble[0];
      int i = localArrayList.size();
      a(paramArrayOfDouble);
      double d2 = paramArrayOfDouble[0];
      b(paramzbt, paramInt, d2, paramDouble1, paramDouble2, localArrayList, paramDouble3, paramDouble4, paramBoolean1, paramBoolean2, paramBoolean3);
      if (localArrayList.size() == i)
      {
        paramArrayOfDouble[0] = d1;
        b(paramzbt, paramInt, d1, paramDouble1, paramDouble2, localArrayList, paramDouble3, paramDouble4, paramBoolean1, paramBoolean2, paramBoolean3);
      }
      else
      {
        a(paramArrayOfDouble, paramzbt, paramzbfd, paramFloat, paramInt, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramBoolean1, paramBoolean2, paramBoolean3);
      }
    }
  }
  
  private static void b(zbt paramzbt, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, ArrayList paramArrayList, double paramDouble4, double paramDouble5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    zjf localzjf = paramzbt.e();
    boolean bool = k(paramzbt.e());
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
        if ((!paramBoolean2) && (d1 < paramzbt.D())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbt.D()));
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
        if ((!paramBoolean1) && (d1 > paramzbt.z())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbt.z()));
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
      if (((paramBoolean3) || (k(localzjf))) && (((Double)paramArrayList.get(0)).doubleValue() >= paramDouble4 + paramDouble1) && (((Double)paramArrayList.get(0)).doubleValue() != 0.0D) && (paramBoolean1) && (paramArrayList.size() > 3)) {
        paramArrayList.remove(0);
      }
      if (((paramBoolean3) || (k(localzjf))) && (((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue() <= paramDouble5 - paramDouble1) && (((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue() != 0.0D) && (paramBoolean2) && (paramArrayList.size() > 3)) {
        paramArrayList.remove(paramArrayList.size() - 1);
      }
    }
  }
  
  static void a(zr paramzr, zbt paramzbt, ArrayList paramArrayList, com.aspose.cells.b.a.b.zp paramzp, int paramInt, zbff paramzbff, boolean paramBoolean)
    throws Exception
  {
    com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    if (localzp.e() > paramzbt.e().aw()) {
      localzp.c(localzp.e() - paramzbt.e().aw());
    }
    paramArrayList.clear();
    zjf localzjf = paramzbt.e();
    int i = a(paramzbff.i());
    Object localObject1;
    int n;
    boolean bool2;
    if ((b(paramInt)) && (!paramzbt.p))
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      double[] arrayOfDouble1 = { d1 };
      localObject1 = new double[] { d2 };
      c(paramzbff.i(), arrayOfDouble1, (double[])localObject1, paramzbt);
      d1 = arrayOfDouble1[0];
      d2 = localObject1[0];
      for (int j = 0; j < paramzbff.getCount(); j++)
      {
        zbfd localzbfd2 = paramzbff.c(j);
        double d5 = 0.0D;
        double d6 = 0.0D;
        zbff localzbff3 = new zbff(localzjf);
        localzbff3.a(localzbfd2);
        double[] arrayOfDouble3 = { d5 };
        double[] arrayOfDouble4 = { d6 };
        c(localzbff3.i(), arrayOfDouble3, arrayOfDouble4, paramzbt);
        d5 = arrayOfDouble3[0];
        d6 = arrayOfDouble4[0];
        if ((d5 == 0.0D) && (d6 == 0.0D))
        {
          zkh localzkh = localzbfd2.F();
          for (int i5 = 0; i5 < localzkh.getCount(); i5++)
          {
            zkf localzkf = localzbfd2.F().b(i5);
            if (!localzkf.t())
            {
              localzkf.a(i5 + 1);
              if (paramzbt.n()) {
                localzkf.a(com.aspose.cells.b.a.zr.a(localzkf.q(), paramzbt.o()));
              }
            }
          }
        }
      }
      boolean bool1 = paramzbt.N();
      n = paramzbt.M();
      arrayOfDouble1[0] = d1;
      localObject1[0] = d2;
      bool2 = c(paramzbff.i(), arrayOfDouble1, (double[])localObject1, paramzbt);
      d1 = arrayOfDouble1[0];
      d2 = localObject1[0];
      a(paramzr, paramzbt, d2, d1, bool2, paramArrayList, paramInt, localzp, true, paramzbff.c(0));
      return;
    }
    zbff localzbff1 = new zbff(localzjf);
    zbff localzbff2 = new zbff(localzjf);
    ArrayList localArrayList1 = new ArrayList();
    double d3 = 0.0D;
    Object localObject4;
    if (paramzbt.p)
    {
      localObject1 = paramzbff.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        zbfd localzbfd1 = (zbfd)((Iterator)localObject1).next();
        if (localzbfd1.ai() == 60) {
          localzbff1.a(localzbfd1);
        } else {
          localzbff2.a(localzbfd1);
        }
      }
      double d4 = 0.0D;
      n = paramzbt.N();
      bool2 = paramzbt.M();
      localObject4 = new double[] { d4 };
      double[] arrayOfDouble2 = { d3 };
      boolean bool3 = c(localzbff1.i(), (double[])localObject4, arrayOfDouble2, paramzbt);
      d4 = localObject4[0];
      d3 = arrayOfDouble2[0];
      d3 = Math.ceil(d3);
      if ("valAx".equals(paramzbt.U()))
      {
        a(paramzr, paramzbt, d3, d4, bool3, paramArrayList, 60, localzp, true, localzbff1.c(0));
        return;
      }
    }
    else
    {
      localzbff2 = paramzbff;
    }
    e(paramzbt);
    if (paramzbt.k() == 2)
    {
      a(paramzr, paramzbt, localzp, paramInt, localzbff2, paramBoolean);
    }
    else
    {
      ArrayList localArrayList2;
      if (paramzbt.g() == 0) {
        localArrayList2 = localzjf.z().c();
      } else {
        localArrayList2 = localzjf.z().d();
      }
      int k;
      if (localArrayList2.size() > 0)
      {
        k = b(localArrayList2);
        paramzbt.x = c(localArrayList2);
        Object localObject3;
        for (n = 0; (n < localArrayList2.size()) && (n < i); n++)
        {
          localObject3 = DateTime.getNow();
          localObject4 = (zgn)localArrayList2.get(n);
          if ((((zgn)localObject4).f()) && (k != 0))
          {
            int i4 = zaoj.a(((zgn)localObject4).a().getClass());
            switch (i4)
            {
            case 3: 
            case 9: 
            case 14: 
            case 16: 
              localObject3 = zbxz.a(ze.g(((zgn)localObject4).a()), localzjf.U());
              String str = zgy.a(localzjf.an(), (DateTime)localObject3, ((zgn)localObject4).c(), localzjf.U());
              com.aspose.cells.b.a.a.zf.a(paramArrayList, str);
              break;
            default: 
              com.aspose.cells.b.a.a.zf.a(paramArrayList, ((zgn)localObject4).a());
            }
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(paramArrayList, ((zgn)localObject4).a());
          }
        }
        for (int i1 = 0; i1 < localzbff2.getCount(); i1++)
        {
          localObject3 = localzbff2.c(i1);
          for (int i3 = 0; i3 < ((zbfd)localObject3).F().getCount(); i3++) {
            ((zbfd)localObject3).F().b(i3).a(i3 + 1);
          }
        }
      }
      else
      {
        Object localObject2;
        if (paramInt == 44)
        {
          for (k = 1; k <= localzbff2.a(0).k().getCount(); k++)
          {
            com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(ze.g(Integer.valueOf(k))));
            localObject2 = new zgn(null, Integer.valueOf(k));
            com.aspose.cells.b.a.a.zf.a(localArrayList2, localObject2);
          }
        }
        else
        {
          for (int m = 1; m <= i; m++)
          {
            com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(ze.g(Integer.valueOf(m))));
            localObject2 = new zgn(null, Integer.valueOf(m));
            com.aspose.cells.b.a.a.zf.a(localArrayList2, localObject2);
          }
          if (paramzbt.p) {
            for (m = i + 1; m <= d3; m++)
            {
              com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(ze.g(Integer.valueOf(m))));
              localObject2 = new zgn(null, Integer.valueOf(m));
              com.aspose.cells.b.a.a.zf.a(localArrayList2, localObject2);
            }
          }
          for (m = 0; m < localzbff2.getCount(); m++)
          {
            localObject2 = localzbff2.c(m);
            for (int i2 = 0; i2 < ((zbfd)localObject2).F().getCount(); i2++) {
              ((zbfd)localObject2).F().b(i2).a(i2 + 1);
            }
          }
        }
      }
      if (paramzbt.p)
      {
        if (paramzbt.M()) {
          paramzbt.f(1.0D);
        }
        if (paramzbt.N()) {
          paramzbt.d(i > d3 ? i : d3);
        }
      }
      else
      {
        if (paramzbt.M()) {
          paramzbt.f(1.0D);
        }
        if (paramzbt.N()) {
          paramzbt.d(i);
        }
      }
      if (paramzbt.O()) {
        paramzbt.c(1.0D);
      }
      if (paramzbt.P()) {
        paramzbt.e(paramzbt.x() / 2.0D);
      }
    }
  }
  
  private static boolean b(ArrayList paramArrayList)
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      zgn localzgn = (zgn)paramArrayList.get(i);
      if (localzgn.a() == null) {
        return true;
      }
      int j = zaoj.a(localzgn.a().getClass());
      if (j == 18) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean c(ArrayList paramArrayList)
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      zgn localzgn = (zgn)paramArrayList.get(i);
      if ((localzgn.h() != 3) && (localzgn.a() != null) && (localzgn.h() != 2))
      {
        int j = zaoj.a(localzgn.a().getClass());
        if (j == 18) {
          return true;
        }
      }
    }
    return false;
  }
  
  private static void e(zbt paramzbt)
  {
    zjf localzjf = paramzbt.e();
    ArrayList localArrayList;
    ArrayList[] arrayOfArrayList;
    if (paramzbt.g() == 0)
    {
      localArrayList = localzjf.z().c();
      arrayOfArrayList = localzjf.z().e();
    }
    else
    {
      localArrayList = localzjf.z().d();
      arrayOfArrayList = localzjf.z().g();
    }
    if (arrayOfArrayList != null) {
      return;
    }
    if (localArrayList.size() == 0) {
      return;
    }
    boolean bool = a(paramzbt.e(), localArrayList, paramzbt.k());
    if (paramzbt.k() == 0)
    {
      if (bool) {
        paramzbt.d(2);
      }
    }
    else if ((!bool) && (localArrayList.size() > 0)) {
      paramzbt.d(1);
    }
  }
  
  static boolean a(zbt paramzbt)
  {
    if (paramzbt.k() == 1) {
      return false;
    }
    zjf localzjf = paramzbt.e();
    ArrayList localArrayList;
    ArrayList[] arrayOfArrayList;
    if (paramzbt.g() == 0)
    {
      localArrayList = localzjf.z().c();
      arrayOfArrayList = localzjf.z().e();
    }
    else
    {
      localArrayList = localzjf.z().d();
      arrayOfArrayList = localzjf.z().g();
    }
    if (arrayOfArrayList != null) {
      return false;
    }
    boolean bool = a(localzjf, localArrayList, paramzbt.k());
    if (paramzbt.k() == 0) {
      return bool;
    }
    return (bool) || (localArrayList.size() <= 0);
  }
  
  private static boolean a(zjf paramzjf, zgn paramzgn)
  {
    return ((paramzgn.g()) || (paramzgn.f()) || (paramzgn.h() == 2) || (paramzgn.h() == 4)) && (zgy.a(paramzjf.an(), paramzgn.c(), paramzgn.a()));
  }
  
  private static boolean a(zjf paramzjf, ArrayList paramArrayList, int paramInt)
  {
    if (paramArrayList.size() > 0)
    {
      zgn localzgn1 = (zgn)paramArrayList.get(0);
      if ((a(paramzjf, localzgn1)) || (paramInt == 2))
      {
        int i = 1;
        int j = 1;
        for (int k = 0; k < paramArrayList.size(); k++)
        {
          zgn localzgn2 = (zgn)paramArrayList.get(k);
          if ((!localzgn2.g()) && (!localzgn2.i()) && (localzgn2.h() != 2))
          {
            j = 0;
            int m = 0;
            if (localzgn2.a() == null) {
              m = 1;
            } else if (localzgn2.a().equals("")) {
              m = 1;
            }
            if (m == 0)
            {
              int n = 0;
              int i1 = zaoj.a(localzgn2.a().getClass());
              switch (i1)
              {
              case 3: 
              case 9: 
              case 14: 
              case 16: 
                n = 1;
              }
              if (n == 0)
              {
                i = 0;
                break;
              }
              if ((paramInt == 0) && (!localzgn2.f()) && (!zgy.a(paramzjf.an(), localzgn2.c(), localzgn2.a())))
              {
                i = 0;
                break;
              }
            }
            else if (!localzgn2.f())
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
  
  private static void a(zr paramzr, zbt paramzbt, com.aspose.cells.b.a.b.zp paramzp, int paramInt, zbff paramzbff, boolean paramBoolean)
    throws Exception
  {
    zjf localzjf = paramzbt.e();
    ArrayList localArrayList1 = paramzbt.l;
    ArrayList localArrayList2;
    if (paramzbt.g() == 0) {
      localArrayList2 = localzjf.z().c();
    } else {
      localArrayList2 = localzjf.z().d();
    }
    int i = a(paramzbff.i());
    boolean bool = false;
    if (localArrayList2.size() == 0) {
      bool = true;
    }
    ArrayList localArrayList3 = new ArrayList();
    if (localArrayList2.size() > 0)
    {
      while (localArrayList2.size() > i) {
        localArrayList2.remove(localArrayList2.size() - 1);
      }
      for (int j = 0; j < localArrayList2.size(); j++)
      {
        zgn localzgn1 = (zgn)localArrayList2.get(j);
        if (!localzgn1.i())
        {
          if (localzgn1.h() == 2) {
            localzgn1.a(Integer.valueOf(0));
          }
          int m = a(localzgn1.a(), paramzbt.e().U());
          if (m >= 0)
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList3, Integer.valueOf(m));
          }
          else if (!localzgn1.g())
          {
            bool = true;
            localArrayList3.clear();
            localArrayList2.clear();
            break;
          }
        }
      }
    }
    if (bool)
    {
      String str = "";
      if (paramzbt.j() == 1) {
        str = "M/d/yyyy";
      } else if (paramzbt.j() == 2) {
        str = "MMM-yy";
      } else {
        str = "yyyy";
      }
      for (int k = 1; k <= i; k++)
      {
        zgn localzgn2 = new zgn(null, Integer.valueOf(k));
        localzgn2.a(false);
        localzgn2.a(str);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localzgn2);
        com.aspose.cells.b.a.a.zf.a(localArrayList3, Integer.valueOf(k));
      }
    }
    double d1 = 0.0D;
    double d2 = 0.0D;
    for (int n = 0; n < paramzbff.getCount(); n++)
    {
      zbfd localzbfd = paramzbff.c(n);
      for (i3 = 0; i3 < localArrayList2.size(); i3++)
      {
        localObject = localzbfd.F().b(i3);
        if (localObject != null)
        {
          zgn localzgn3 = (zgn)localArrayList2.get(i3);
          int i5 = a(localzgn3.a(), paramzbt.e().U());
          ((zkf)localObject).a(localzgn3.a());
          ((zkf)localObject).a(localzgn3.h());
          ((zkf)localObject).a(i5);
        }
      }
      for (i3 = 0; i3 < localzbfd.H().getCount(); i3++)
      {
        localObject = localzbfd.H().c(i3);
        if (((zbxg)localObject).d().h())
        {
          if (((zbxg)localObject).h() > d1) {
            d1 = ((zbxg)localObject).h();
          }
          if (((zbxg)localObject).e() > d2) {
            d2 = ((zbxg)localObject).e();
          }
        }
      }
    }
    ArrayList localArrayList4 = new ArrayList();
    com.aspose.cells.b.a.a.zf.a(localArrayList4, localArrayList3);
    Collections.sort(localArrayList4);
    if (paramzbt.r())
    {
      int i1 = a(localArrayList4, localzjf.U());
      paramzbt.c(i1);
    }
    double d3;
    if (paramzbt.N())
    {
      d3 = zbv.a(1, paramzbt.j(), (int)d1, 0, localzjf.U());
      paramzbt.d(zbv.a(paramzbt.j(), ((Integer)localArrayList4.get(localArrayList4.size() - 1)).intValue(), localzjf.U()) + d3);
    }
    if (paramzbt.M())
    {
      d3 = zbv.a(1, paramzbt.j(), (int)d2, 0, localzjf.U());
      paramzbt.f(zbv.a(paramzbt.j(), ((Integer)localArrayList4.get(0)).intValue(), localzjf.U()) - d3);
    }
    a(paramzr, paramzbt, paramzp, paramInt, paramBoolean, bool);
    int i2 = (int)paramzbt.D();
    int i3 = (int)paramzbt.z();
    Object localObject = i2;
    localArrayList1.clear();
    com.aspose.cells.b.a.a.zf.a(localArrayList1, Integer.valueOf(i2));
    int i4 = zbv.a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), localObject, localzjf.U());
    double d4 = i2;
    if ((i2 + paramzbt.x() == 60.0D) && (i4 == 61)) {}
    for (i4 = 60; i3 - i4 >= 0; i4 = 60)
    {
      label817:
      com.aspose.cells.b.a.a.zf.a(localArrayList1, Integer.valueOf(i4));
      d4 = i4;
      i4 = zbv.a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), i4, localzjf.U());
      if ((d4 + paramzbt.x() != 60.0D) || (i4 != 61)) {
        break label817;
      }
    }
  }
  
  private static int a(List paramList, boolean paramBoolean)
  {
    if (paramList.size() == 1) {
      return 1;
    }
    int i = 3;
    int j = 28;
    for (int k = 0; k < paramList.size() - 1; k++)
    {
      DateTime localDateTime1 = zbv.a(((Integer)paramList.get(k)).intValue(), paramBoolean);
      DateTime localDateTime2 = zbv.a(((Integer)paramList.get(k + 1)).intValue(), paramBoolean);
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
      return zbv.a(localDateTime, paramBoolean);
    }
    return zbxz.a(paramObject, i);
  }
  
  private static void a(zr paramzr, zbt paramzbt, com.aspose.cells.b.a.b.zp paramzp, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    zjf localzjf = paramzbt.e();
    float f1 = 0.0F;
    ArrayList localArrayList;
    ArrayList[] arrayOfArrayList;
    if (paramzbt.g() == 0)
    {
      localArrayList = localzjf.z().c();
      arrayOfArrayList = localzjf.z().e();
    }
    else
    {
      localArrayList = localzjf.z().d();
      arrayOfArrayList = localzjf.z().g();
    }
    int i = 0;
    if ((paramzbt.G().c()) && (localArrayList.size() > 0)) {
      i = 1;
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList.size() > 0)) {
      i = 1;
    }
    Object localObject1 = "";
    for (int j = 0; j < localArrayList.size(); j++)
    {
      String str = "";
      if (i == 0)
      {
        str = zbv.a(paramzbt, Double.valueOf(paramzbt.z()));
      }
      else
      {
        localObject2 = "";
        boolean bool2 = false;
        zgn localzgn = (zgn)localArrayList.get(j);
        localObject2 = localzgn.c();
        bool2 = localzgn.b();
        str = zra.a(localzjf.an(), localzgn.a(), (String)localObject2, bool2, localzjf.U());
      }
      if (str.length() > ((String)localObject1).length()) {
        localObject1 = str;
      }
    }
    zt localzt = new zt(paramzp.e(), paramzp.f());
    boolean bool1 = paramzbt.J().k();
    Object localObject2 = zbvy.a(localzjf.ap(), (String)localObject1, 0, paramzbt.J().a(), localzt, 1, 1);
    float f3;
    float f2;
    if (paramBoolean1)
    {
      f3 = paramzp.f();
      if (bool1) {
        f2 = ((com.aspose.cells.b.a.b.zs)localObject2).c();
      } else {
        f2 = ((com.aspose.cells.b.a.b.zs)localObject2).c();
      }
    }
    else
    {
      f3 = paramzp.e();
      if (bool1) {
        f2 = ((com.aspose.cells.b.a.b.zs)localObject2).b();
      } else if (paramzbt.J().e() == 0) {
        f2 = ((com.aspose.cells.b.a.b.zs)localObject2).b();
      } else if ((paramzbt.J().e() == 90) || (paramzbt.J().e() == -90)) {
        f2 = ((com.aspose.cells.b.a.b.zs)localObject2).c();
      } else {
        f2 = (float)(((com.aspose.cells.b.a.b.zs)localObject2).c() / Math.sin(Math.abs(paramzbt.J().e()) * 3.141592653589793D / 180.0D));
      }
    }
    int m = (int)paramzbt.z();
    int n = (int)paramzbt.D();
    int i1 = paramzbt.j();
    int k;
    if ((paramzbt.f()) || (localzjf.u()))
    {
      k = zbv.a(i1, m, n, paramzbt.e().U()) + 1;
    }
    else
    {
      k = zbv.a(i1, m, n, paramzbt.e().U());
      if (k == 0) {
        k = 1;
      }
    }
    label666:
    int i2;
    int i3;
    double[] arrayOfDouble2;
    if ((paramzbt.O()) && (paramzbt.P()))
    {
      for (;;)
      {
        if (k * (f2 + f1) < f3)
        {
          paramzbt.c(1.0D);
          paramzbt.e(1.0D);
          paramzbt.g(paramzbt.j());
          paramzbt.i(paramzbt.j());
          return;
        }
        if ((!bool1) || (paramBoolean2)) {
          break label666;
        }
        if (paramzbt.J().e() != 0) {
          break;
        }
        paramzbt.J().b(45);
        f2 = (float)(((com.aspose.cells.b.a.b.zs)localObject2).c() / Math.sin(Math.abs(paramzbt.J().e()) * 3.141592653589793D / 180.0D));
      }
      if (paramzbt.J().e() == 45)
      {
        paramzbt.J().b(90);
        f2 = ((com.aspose.cells.b.a.b.zs)localObject2).c();
      }
      i2 = (int)(f3 / (f2 + f1));
      i3 = k % i2 == 0 ? k / i2 : k / i2 + 1;
      double d1;
      double d3;
      double[] arrayOfDouble1;
      double d5;
      double d7;
      if (paramzbt.j() == 1)
      {
        if (i3 <= 2)
        {
          paramzbt.c(i3);
          paramzbt.e(1.0D);
          paramzbt.g(paramzbt.j());
          paramzbt.i(paramzbt.j());
        }
        else if ((i3 > 2) && (i3 <= 7))
        {
          paramzbt.c(7.0D);
          paramzbt.e(1.0D);
          paramzbt.g(paramzbt.j());
          paramzbt.i(paramzbt.j());
        }
        else if ((i3 > 7) && (i3 <= 14))
        {
          paramzbt.c(14.0D);
          paramzbt.e(7.0D);
          paramzbt.g(paramzbt.j());
          paramzbt.i(paramzbt.j());
        }
        else if ((i3 > 14) && (i3 <= 30))
        {
          paramzbt.c(1.0D);
          paramzbt.e(1.0D);
          paramzbt.g(2);
          paramzbt.i(2);
        }
        else if ((i3 > 30) && (i3 <= 360))
        {
          paramzbt.c(i3 % 30 == 0 ? i3 / 30 : i3 / 30 + 1);
          paramzbt.e((int)(paramzbt.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbt.x() / 2.0D));
          paramzbt.g(2);
          paramzbt.i(2);
        }
        else
        {
          d1 = 0.0D;
          d3 = 0.0D;
          arrayOfDouble1 = new double[] { d1 };
          arrayOfDouble2 = new double[] { d3 };
          a(i3 / 30, arrayOfDouble1, arrayOfDouble2);
          d1 = arrayOfDouble1[0];
          d3 = arrayOfDouble2[0];
          d5 = i3 % 360 == 0 ? i3 / 360 : i3 / 360 + 1;
          d7 = (d1 - d5) / d5;
          if (d7 > 1.0D) {
            d1 = d5;
          } else if (d7 > 0.3D) {
            d1 = d5 + (int)((d1 - d5) / 2.0D);
          }
          paramzbt.c(d1);
          paramzbt.e((int)(paramzbt.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbt.x() / 2.0D));
          paramzbt.g(3);
          paramzbt.i(3);
        }
      }
      else if (paramzbt.j() == 2)
      {
        if (i3 < 12)
        {
          paramzbt.c(i3);
          paramzbt.e((int)(paramzbt.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbt.x() / 2.0D));
          paramzbt.g(2);
          paramzbt.i(2);
        }
        else
        {
          d1 = 0.0D;
          d3 = 0.0D;
          arrayOfDouble1 = new double[] { d1 };
          arrayOfDouble2 = new double[] { d3 };
          a(i3, arrayOfDouble1, arrayOfDouble2);
          d1 = arrayOfDouble1[0];
          d3 = arrayOfDouble2[0];
          d5 = i3 % 12 == 0 ? i3 / 12 : i3 / 12 + 1;
          d7 = (d1 - d5) / d5;
          if (d7 > 1.0D) {
            d1 = d5;
          } else if (d7 > 0.3D) {
            d1 = d5 + (int)((d1 - d5) / 2.0D);
          }
          paramzbt.c(d1);
          paramzbt.e(1.0D);
          paramzbt.g(3);
          paramzbt.i(3);
        }
      }
      else
      {
        d1 = 0.0D;
        d3 = 0.0D;
        arrayOfDouble1 = new double[] { d1 };
        arrayOfDouble2 = new double[] { d3 };
        a(i3 * 12, arrayOfDouble1, arrayOfDouble2);
        d1 = arrayOfDouble1[0];
        d3 = arrayOfDouble2[0];
        d5 = i3;
        d7 = (d1 - d5) / d5;
        if (d7 > 1.0D) {
          d1 = d5;
        } else if (d7 > 0.3D) {
          d1 = d5 + (int)((d1 - d5) / 2.0D);
        }
        paramzbt.c(d1);
        paramzbt.e((int)(paramzbt.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbt.x() / 2.0D));
        paramzbt.g(3);
        paramzbt.i(3);
      }
    }
    else if ((paramzbt.O()) && (!paramzbt.P()))
    {
      i2 = zbxz.a((float)(zbv.b(paramzbt.C(), m, n, paramzbt.e().U()) / paramzbt.B()));
      if ((paramzbt.f()) || (localzjf.u()))
      {
        k = i2 + 1;
      }
      else
      {
        k = i2;
        if (k == 0) {
          k = 1;
        }
        f3 -= f2;
      }
      for (;;)
      {
        if (k * (f2 + f1) < f3)
        {
          if ((paramzbt.f()) || (localzjf.u()))
          {
            k = zbv.a(i1, m, n, paramzbt.e().U()) + 1;
          }
          else
          {
            k = zbv.a(i1, m, n, paramzbt.e().U());
            if (k == 0) {
              k = 1;
            }
          }
          i3 = (int)(f3 / (f2 + f1));
          i4 = k % i3 == 0 ? k / i3 : k / i3 + 1;
          double d2;
          double d4;
          double[] arrayOfDouble3;
          double d6;
          double d8;
          if (paramzbt.j() == 1)
          {
            if (i4 <= 2)
            {
              paramzbt.c(i4);
              paramzbt.g(paramzbt.j());
            }
            else if ((i4 > 2) && (i4 <= 7))
            {
              paramzbt.c(7.0D);
              paramzbt.g(paramzbt.j());
            }
            else if ((i4 > 7) && (i4 <= 14))
            {
              paramzbt.c(14.0D);
              paramzbt.g(paramzbt.j());
            }
            else if ((i4 > 14) && (i4 <= 30))
            {
              paramzbt.c(1.0D);
              paramzbt.g(2);
            }
            else if ((i4 > 30) && (i4 <= 360))
            {
              paramzbt.c(i4 % 30 == 0 ? i4 / 30 : i4 / 30 + 1);
              paramzbt.g(2);
            }
            else
            {
              d2 = 0.0D;
              d4 = 0.0D;
              arrayOfDouble2 = new double[] { d2 };
              arrayOfDouble3 = new double[] { d4 };
              a(i4 / 30, arrayOfDouble2, arrayOfDouble3);
              d2 = arrayOfDouble2[0];
              d4 = arrayOfDouble3[0];
              d6 = i4 % 360 == 0 ? i4 / 360 : i4 / 360 + 1;
              d8 = (d2 - d6) / d6;
              if (d8 > 1.0D) {
                d2 = d6;
              } else if (d8 > 0.3D) {
                d2 = d6 + (int)((d2 - d6) / 2.0D);
              }
              paramzbt.c(d2);
              paramzbt.g(3);
            }
          }
          else if (paramzbt.j() == 2)
          {
            if (i4 < 12)
            {
              paramzbt.c(i4);
              paramzbt.g(2);
            }
            else
            {
              d2 = 0.0D;
              d4 = 0.0D;
              arrayOfDouble2 = new double[] { d2 };
              arrayOfDouble3 = new double[] { d4 };
              a(i4, arrayOfDouble2, arrayOfDouble3);
              d2 = arrayOfDouble2[0];
              d4 = arrayOfDouble3[0];
              d6 = i4 % 12 == 0 ? i4 / 12 : i4 / 12 + 1;
              d8 = (d2 - d6) / d6;
              if (d8 > 1.0D) {
                d2 = d6;
              } else if (d8 > 0.3D) {
                d2 = d6 + (int)((d2 - d6) / 2.0D);
              }
              paramzbt.c(d2);
              paramzbt.g(3);
            }
          }
          else
          {
            d2 = 0.0D;
            d4 = 0.0D;
            arrayOfDouble2 = new double[] { d2 };
            arrayOfDouble3 = new double[] { d4 };
            a(i4 * 12, arrayOfDouble2, arrayOfDouble3);
            d2 = arrayOfDouble2[0];
            d4 = arrayOfDouble3[0];
            d6 = i4;
            d8 = (d2 - d6) / d6;
            if (d8 > 1.0D) {
              d2 = d6;
            } else if (d8 > 0.3D) {
              d2 = d6 + (int)((d2 - d6) / 2.0D);
            }
            paramzbt.c(d2);
            paramzbt.g(3);
          }
          return;
        }
        if ((!bool1) || (paramBoolean2)) {
          break label2409;
        }
        if (paramzbt.J().e() != 0) {
          break;
        }
        paramzbt.J().b(45);
        f2 = (float)(((com.aspose.cells.b.a.b.zs)localObject2).c() / Math.sin(Math.abs(paramzbt.J().e()) * 3.141592653589793D / 180.0D));
      }
      if (paramzbt.J().e() == 45)
      {
        paramzbt.J().b(90);
        f2 = ((com.aspose.cells.b.a.b.zs)localObject2).c();
      }
      label2409:
      if ((bool1) && (!paramBoolean2) && (paramzbt.J().e() > 0)) {
        f2 *= 2.0F;
      }
      i3 = (int)(f3 / (f2 + f1));
      int i4 = k % i3 == 0 ? k / i3 : k / i3 + 1;
      if (paramzbt.j() == 1)
      {
        if (i4 <= 2)
        {
          if (paramzbt.C() > paramzbt.j())
          {
            paramzbt.g(paramzbt.C());
            paramzbt.c(paramzbt.B());
          }
          else
          {
            paramzbt.g(paramzbt.j());
            paramzbt.c(i4);
            if (paramzbt.x() < paramzbt.B()) {
              paramzbt.c(paramzbt.B());
            }
          }
        }
        else if ((i4 > 2) && (i4 <= 7))
        {
          if (paramzbt.C() > paramzbt.j())
          {
            paramzbt.g(paramzbt.C());
            paramzbt.c(paramzbt.B());
          }
          else
          {
            paramzbt.g(paramzbt.j());
            paramzbt.c(7.0D);
            if (paramzbt.x() < paramzbt.B()) {
              paramzbt.c(paramzbt.B());
            }
          }
        }
        else if ((i4 > 7) && (i4 <= 14))
        {
          if (paramzbt.C() > paramzbt.j())
          {
            paramzbt.g(paramzbt.C());
            paramzbt.c(paramzbt.B());
          }
          else
          {
            paramzbt.g(paramzbt.j());
            paramzbt.c(14.0D);
            if (paramzbt.x() < paramzbt.B()) {
              paramzbt.c(paramzbt.B());
            }
          }
        }
        else if ((i4 > 14) && (i4 <= 30))
        {
          if (paramzbt.C() == 3)
          {
            paramzbt.g(paramzbt.C());
            paramzbt.c(paramzbt.B());
          }
          else
          {
            paramzbt.g(2);
            paramzbt.c(1.0D);
            if ((paramzbt.x() < paramzbt.B()) && (paramzbt.C() == 2)) {
              paramzbt.c(paramzbt.B());
            }
          }
        }
        else if ((i4 > 30) && (i4 <= 360))
        {
          if (paramzbt.C() == 3)
          {
            paramzbt.g(paramzbt.C());
            paramzbt.c(paramzbt.B());
          }
          else
          {
            paramzbt.g(2);
            paramzbt.c(i4 % 30 == 0 ? i4 / 30 : i4 / 30 + 1);
            if ((paramzbt.x() < paramzbt.B()) && (paramzbt.C() == 2)) {
              paramzbt.c(paramzbt.B());
            }
          }
        }
        else
        {
          paramzbt.c(i4 % 360 == 0 ? i4 / 360 : i4 / 360 + 1);
          paramzbt.g(3);
          if ((paramzbt.x() < paramzbt.B()) && (paramzbt.C() == 3)) {
            paramzbt.c(paramzbt.B());
          }
        }
      }
      else if (paramzbt.j() == 2)
      {
        if (i4 < 12)
        {
          if (paramzbt.C() == 2)
          {
            if (paramzbt.B() <= i4)
            {
              paramzbt.c(i4);
              paramzbt.g(2);
            }
            else
            {
              paramzbt.c(paramzbt.B());
              paramzbt.g(2);
            }
          }
          else
          {
            paramzbt.c(paramzbt.B());
            paramzbt.g(3);
          }
        }
        else
        {
          i4 = i4 % 12 == 0 ? i4 / 12 : i4 / 12 + 1;
          if (paramzbt.C() == 2)
          {
            paramzbt.c(i4);
            paramzbt.g(3);
          }
          else if (paramzbt.B() <= i4)
          {
            paramzbt.c(i4);
            paramzbt.g(3);
          }
          else
          {
            paramzbt.c(paramzbt.B());
            paramzbt.g(3);
          }
        }
      }
      else
      {
        if (paramzbt.B() <= i4) {
          paramzbt.c(i4);
        } else {
          paramzbt.c(paramzbt.B());
        }
        paramzbt.g(3);
      }
    }
    else if ((!paramzbt.O()) && (paramzbt.P()))
    {
      paramzbt.e((int)(paramzbt.x() / 2.0D) == 0 ? 1.0D : (int)(paramzbt.x() / 2.0D));
      paramzbt.i(paramzbt.y());
      if ((bool1) && (!paramBoolean2))
      {
        i2 = zbxz.a((float)(zbv.b(paramzbt.y(), m, n, paramzbt.e().U()) / paramzbt.x()));
        if ((paramzbt.f()) || (localzjf.u()))
        {
          k = i2 + 1;
        }
        else
        {
          k = i2;
          if (k == 0) {
            k = 1;
          }
        }
        while (k * (f2 + f1) > f3) {
          if (paramzbt.J().e() == 0)
          {
            paramzbt.J().b(45);
            f2 = (float)(((com.aspose.cells.b.a.b.zs)localObject2).c() / Math.sin(Math.abs(paramzbt.J().e()) * 3.141592653589793D / 180.0D));
          }
          else if (paramzbt.J().e() == 45)
          {
            paramzbt.J().b(90);
          }
        }
      }
    }
    else if ((bool1) && (!paramBoolean2))
    {
      i2 = zbxz.a((float)(zbv.b(paramzbt.y(), m, n, paramzbt.e().U()) / paramzbt.x()));
      if ((paramzbt.f()) || (localzjf.u()))
      {
        k = i2 + 1;
      }
      else
      {
        k = i2;
        if (k == 0) {
          k = 1;
        }
      }
      while (k * (f2 + f1) > f3) {
        if (paramzbt.J().e() == 0)
        {
          paramzbt.J().b(45);
          f2 = (float)(((com.aspose.cells.b.a.b.zs)localObject2).c() / Math.sin(Math.abs(paramzbt.J().e()) * 3.141592653589793D / 180.0D));
        }
        else if (paramzbt.J().e() == 45)
        {
          paramzbt.J().b(90);
        }
      }
    }
  }
  
  static ArrayList a(ArrayList paramArrayList, boolean paramBoolean)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      int j = a(((zagy)paramArrayList.get(i)).a(), paramBoolean);
      com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(j));
    }
    return localArrayList;
  }
  
  static void a(zr paramzr, zbt paramzbt, double paramDouble1, double paramDouble2, ArrayList paramArrayList, int paramInt, com.aspose.cells.b.a.b.zp paramzp, boolean paramBoolean, zbfd paramzbfd)
  {
    double d1 = paramDouble1;
    double d2 = paramDouble2;
    zjf localzjf = paramzbt.e();
    if ((paramDouble1 == paramDouble2) && (paramDouble1 == 0.0D))
    {
      paramzbt.d(10.0D);
      paramDouble1 = 10.0D;
      d1 = 10.0D;
      paramzbt.f(1.0D);
    }
    boolean bool1 = paramzbt.N();
    boolean bool2 = paramzbt.M();
    double d3 = 0.0D;
    int i = 1;
    boolean bool3 = paramzbfd.as();
    if (bool3)
    {
      if ((paramDouble1 == 100.0D) && (paramzbt.N())) {
        paramzbt.d(100.0D);
      }
      if ((paramDouble2 >= 1.0D) && (paramzbt.M())) {
        paramzbt.f(1.0D);
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
    a(arrayOfDouble1, arrayOfDouble2, arrayOfDouble3, arrayOfDouble4, arrayOfDouble5, arrayOfInt, paramzbt, paramBoolean);
    d4 = arrayOfDouble1[0];
    d5 = arrayOfDouble2[0];
    paramDouble2 = arrayOfDouble3[0];
    paramDouble1 = arrayOfDouble4[0];
    d3 = arrayOfDouble5[0];
    i = arrayOfInt[0];
    c(paramzbt, i, d3, d5, d4, paramArrayList, d1, d2, bool1, bool2, bool3);
    int j = b(paramzr, paramzbt, paramBoolean, paramzbfd, paramzp);
    int k = 0;
    if (paramzbt.e().ab())
    {
      if (paramBoolean) {
        k = (int)paramzbt.e().S().g();
      } else {
        k = (int)paramzbt.e().S().i();
      }
    }
    else if (paramBoolean) {
      k = paramzp.e();
    } else {
      k = paramzp.f();
    }
    while ((paramzbt.O()) && (paramArrayList.size() > 3) && (j > k) && (k != 0))
    {
      d3 += 1.0D;
      c(paramzbt, i, d3, d5, d4, paramArrayList, d1, d2, bool1, bool2, bool3);
      j = b(paramzr, paramzbt, paramBoolean, paramzbfd, paramzp);
    }
    if (paramArrayList.size() >= 2)
    {
      if (bool1) {
        paramzbt.d(paramzbt.h(((Double)paramArrayList.get(0)).doubleValue()));
      }
      if (bool2) {
        paramzbt.f(paramzbt.h(((Double)paramArrayList.get(paramArrayList.size() - 1)).doubleValue()));
      }
      if (paramzbt.O()) {
        paramzbt.c(paramzbt.h(d3));
      }
      if (paramzbt.P()) {
        paramzbt.e(paramzbt.x());
      }
    }
  }
  
  private static void a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double[] paramArrayOfDouble3, double[] paramArrayOfDouble4, double[] paramArrayOfDouble5, int[] paramArrayOfInt, zbt paramzbt, boolean paramBoolean)
  {
    if ((!paramzbt.O()) && (paramzbt.g(paramzbt.x()) == 0.0D)) {
      paramzbt.i(true);
    }
    if ((!paramzbt.P()) && (paramzbt.g(paramzbt.B()) == 0.0D)) {
      paramzbt.j(true);
    }
    paramArrayOfDouble5[0] = paramzbt.g(paramzbt.o());
    double d1;
    double d2;
    if (paramzbt.O())
    {
      d1 = b(paramArrayOfDouble3[0]);
      d2 = a(paramArrayOfDouble4[0]);
      paramArrayOfDouble2[0] = d1;
      paramArrayOfDouble1[0] = d2;
      if ((paramzbt.N()) && (paramzbt.M()))
      {
        paramArrayOfInt[0] = 3;
        if ((d1 >= 0.0D) && (d2 >= 0.0D))
        {
          paramzbt.f(paramzbt.h(0.0D));
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = 0.0D;
        }
        else
        {
          paramzbt.f(paramzbt.h(d1));
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = d1;
        }
      }
      else if ((!paramzbt.N()) && (paramzbt.M()))
      {
        paramArrayOfInt[0] = 1;
        paramArrayOfDouble1[0] = paramzbt.g(paramzbt.z());
        paramArrayOfDouble4[0] = paramArrayOfDouble1[0];
      }
      else if ((paramzbt.N()) && (!paramzbt.M()))
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbt.g(paramzbt.D());
        paramArrayOfDouble3[0] = paramArrayOfDouble2[0];
      }
      else
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbt.g(paramzbt.D());
        paramArrayOfDouble1[0] = paramzbt.g(paramzbt.z());
        paramArrayOfDouble3[0] = paramzbt.g(paramzbt.D());
        paramArrayOfDouble4[0] = paramzbt.g(paramzbt.z());
      }
    }
    else
    {
      paramArrayOfDouble5[0] = paramzbt.g(paramzbt.x());
      d1 = paramArrayOfDouble3[0];
      d2 = paramArrayOfDouble4[0];
      paramArrayOfDouble2[0] = d1;
      paramArrayOfDouble1[0] = d2;
      if ((paramzbt.N()) && (paramzbt.M()))
      {
        paramArrayOfInt[0] = 3;
        if ((d1 >= 0.0D) && (d2 >= 0.0D))
        {
          paramzbt.f(paramzbt.h(0.0D));
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = 0.0D;
        }
        else
        {
          paramzbt.f(paramzbt.h(d1));
          paramArrayOfInt[0] = 2;
          paramArrayOfDouble2[0] = d1;
        }
      }
      else if ((!paramzbt.N()) && (paramzbt.M()))
      {
        paramArrayOfInt[0] = 1;
        paramArrayOfDouble1[0] = paramzbt.g(paramzbt.z());
        paramArrayOfDouble4[0] = paramArrayOfDouble1[0];
      }
      else if ((paramzbt.N()) && (!paramzbt.M()))
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbt.g(paramzbt.D());
        paramArrayOfDouble3[0] = paramArrayOfDouble2[0];
      }
      else
      {
        paramArrayOfInt[0] = 2;
        paramArrayOfDouble2[0] = paramzbt.g(paramzbt.D());
        paramArrayOfDouble1[0] = paramzbt.g(paramzbt.z());
        paramArrayOfDouble3[0] = paramzbt.g(paramzbt.D());
        paramArrayOfDouble4[0] = paramzbt.g(paramzbt.z());
      }
    }
  }
  
  private static void c(zbt paramzbt, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, ArrayList paramArrayList, double paramDouble4, double paramDouble5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    paramArrayList.clear();
    double d;
    if (paramInt == 1)
    {
      for (d = paramDouble3; (d >= paramDouble2) || (zbxz.b(paramDouble2, d) < paramDouble1); d -= paramDouble1) {
        if ((!paramzbt.M()) && (d < paramzbt.W())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbt.W()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d));
        }
      }
    }
    else if (paramInt == 2)
    {
      for (d = paramDouble2; (d <= paramDouble3) || (d < paramDouble3 + paramDouble1); d += paramDouble1) {
        if ((!paramzbt.N()) && (d > paramzbt.V())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbt.V()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d));
        }
      }
      Collections.reverse(paramArrayList);
    }
    else
    {
      for (d = 0.0D; (d <= paramDouble3) || (zbxz.b(d, paramDouble3) < paramDouble1); d += paramDouble1) {
        if ((!paramzbt.N()) && (d > paramzbt.V())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbt.V()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d));
        }
      }
      Collections.reverse(paramArrayList);
      for (d = 0.0D - paramDouble1; (d >= paramDouble2) || (zbxz.b(paramDouble2, d) < paramDouble1); d -= paramDouble1) {
        if ((!paramzbt.M()) && (d < paramzbt.W())) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(paramzbt.W()));
        } else {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Double.valueOf(d));
        }
      }
    }
  }
  
  private static int b(zr paramzr, zbt paramzbt, boolean paramBoolean, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp)
  {
    if (paramzbt.I() == 3) {
      return 0;
    }
    zjf localzjf = paramzbt.e();
    zbwv localzbwv = paramzbt.J();
    zkf localzkf = paramzbfd.F().b(0);
    String str1 = localzkf.A();
    boolean bool = localzkf.B();
    int i = 0;
    if ((localzbwv.c()) && (localzkf != null)) {
      i = 1;
    }
    int j = 0;
    for (int k = 0; k < paramzbt.l.size(); k++)
    {
      double d = paramzbt.h(((Double)paramzbt.l.get(k)).doubleValue());
      if (paramzbfd.as())
      {
        d /= 100.0D;
        str1 = "0%";
      }
      String str2 = "";
      if (i != 0) {
        str2 = zra.a(localzjf.an(), Double.valueOf(d), str1, bool, localzjf.U());
      } else {
        str2 = zbv.a(paramzbt, Double.valueOf(d));
      }
      com.aspose.cells.b.a.b.zs localzs1 = new com.aspose.cells.b.a.b.zs(paramzp.e(), paramzp.f());
      com.aspose.cells.b.a.b.zs localzs2 = zbvy.a(paramzbt.e().ap(), str2, localzbwv.e(), localzbwv.a(), localzs1, 1, 1);
      if (paramBoolean)
      {
        if ((k == 0) || (k == paramzbt.l.size() - 1)) {
          j += localzs2.b() / 2;
        } else {
          j += localzs2.b();
        }
      }
      else if ((k == 0) || (k == paramzbt.l.size() - 1)) {
        j += localzs2.c() / 2;
      } else {
        j += localzs2.c();
      }
      if ((k == 0) || (k == paramzbt.l.size() - 1)) {
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
      d = zbxz.b(paramDouble);
      if (d != paramDouble) {
        d += 1.0D;
      }
      return d;
    }
    double d = zbxz.b(paramDouble);
    return -d;
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
      d = zbxz.b(paramDouble);
      if (d != paramDouble) {
        d += 1.0D;
      }
      return -d;
    }
    double d = zbxz.b(paramDouble);
    return d;
  }
  
  private static boolean l(zjf paramzjf)
  {
    zaje localzaje;
    for (int i = 0; i < paramzjf.A().getCount(); i++)
    {
      localzaje = paramzjf.A().a(i);
      if ((localzaje.m() == 57) || (localzaje.m() == 59) || (localzaje.m() == 58)) {
        return false;
      }
    }
    for (i = 0; i < paramzjf.A().getCount(); i++)
    {
      localzaje = paramzjf.A().a(i);
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
  
  private static void m(zjf paramzjf)
  {
    zagy localzagy;
    zgn localzgn;
    for (int i = 0; i < paramzjf.z().d().size(); i++)
    {
      localzagy = (zagy)paramzjf.z().d().get(i);
      localzgn = new zgn(null, localzagy.a());
      localzgn.a(localzagy.b());
      localzgn.b(localzagy.f());
      localzgn.c(localzagy.g());
      localzgn.a(localzagy.c());
      com.aspose.cells.b.a.a.zf.a(paramzjf.z().f(), localzgn);
    }
    paramzjf.z().d().clear();
    for (i = 0; i < paramzjf.z().c().size(); i++)
    {
      localzagy = (zagy)paramzjf.z().c().get(i);
      localzgn = new zgn(null, localzagy.a());
      localzgn.a(localzagy.b());
      localzgn.b(localzagy.f());
      localzgn.c(localzagy.g());
      localzgn.a(localzagy.c());
      com.aspose.cells.b.a.a.zf.a(paramzjf.z().d(), localzgn);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ziz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */