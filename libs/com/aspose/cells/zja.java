package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zja
{
  private static int a = ziy.a;
  private static int b = ziy.b;
  private static int c = 2;
  
  static void a(zje paramzje)
    throws Exception
  {
    zr localzr = paramzje.ar();
    zbfe localzbfe = paramzje.z();
    if ((paramzje.z().getCount() == 0) || (ziy.a(paramzje.z().i()) == 0)) {
      return;
    }
    if (paramzje.A().a().getCount() > 0) {
      paramzje.z().a = true;
    }
    if (paramzje.A().b().getCount() > 0) {
      paramzje.z().b = true;
    }
    paramzje.z().a(ziy.a(paramzje.z().a()));
    paramzje.z().b(ziy.a(paramzje.z().b()));
    paramzje.z().a(ziy.b(paramzje.z().a()));
    paramzje.z().b(ziy.b(paramzje.z().b()));
    String str = ziy.c(paramzje);
    if (!"".equals(str)) {
      throw new IllegalArgumentException(str);
    }
    f(paramzje);
    ziy.e(paramzje);
    h(paramzje);
    zbxx.a(paramzje.e(), paramzje.E(), paramzje.z(), paramzje.z().c(0));
    boolean bool1 = ziy.a(paramzje.M());
    boolean bool2 = zxn.a(paramzje);
    if (bool1)
    {
      if (paramzje.p() < 0) {
        paramzje.f(0);
      }
      if (paramzje.p() > 44) {
        paramzje.f(44);
      }
      if (paramzje.D() < 0) {
        paramzje.h(0);
      }
      if (paramzje.D() > 44) {
        paramzje.h(44);
      }
    }
    if (!bool2)
    {
      paramzje.I().K().a("");
      paramzje.I().d(false);
    }
    int i = ziy.b;
    zp localzp1 = new zp(a, a, paramzje.a() - a * 2, paramzje.b() - a * 2);
    if (localzp1.f() < 0) {
      localzp1.d(0);
    }
    if (paramzje.K().j())
    {
      zt localzt = new zt(localzp1.e() * 0.8F, localzp1.f() * 0.8F);
      localObject1 = zbwz.a(localzr, paramzje.K(), localzt);
      paramzje.K().e().b.a((paramzje.a() - ((zs)localObject1).b()) / 2);
      paramzje.K().e().b.b(a);
      paramzje.K().e().b.a((zs)localObject1);
      localzp1.b(localzp1.d() + ((zs)localObject1).c() + i);
      localzp1.d(localzp1.f() - (((zs)localObject1).c() + i));
    }
    boolean bool3 = zana.a(paramzje);
    paramzje.x().b = bool3;
    ziy.d(paramzje);
    if (paramzje.v()) {
      if ((paramzje.M() == 48) || (paramzje.M() == 45) || (bool3))
      {
        localObject1 = (zbfc)paramzje.z().j().get(0);
        ziy.a(paramzje, (zbfc)localObject1);
        zp[] arrayOfzp1 = { localzp1 };
        zana.a(localzr, paramzje.x(), (zbfc)localObject1, arrayOfzp1);
        localzp1 = arrayOfzp1[0];
      }
      else
      {
        ziy.g(paramzje);
        localObject1 = new zp[] { localzp1 };
        zana.a(localzr, paramzje.x(), (zp[])localObject1);
        localzp1 = localObject1[0];
      }
    }
    Object localObject1 = { localzp1 };
    zawe.a(paramzje, (zp[])localObject1);
    localzp1 = localObject1[0];
    paramzje.B().b = new zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
    int j;
    if (!paramzje.B().s())
    {
      paramzje.a(true, paramzje.B().p().c(), paramzje.B().p().d(), paramzje.B().p().e(), paramzje.B().p().f());
      if (paramzje.B().l() + paramzje.B().n() > 4000) {
        paramzje.B().a(4000 - paramzje.B().n());
      }
      if (paramzje.B().m() + paramzje.B().o() > 4000) {
        paramzje.B().b(4000 - paramzje.B().o());
      }
      localzp1.a(paramzje.B().w());
      localzp1.b(paramzje.B().x());
      localzp1.c(paramzje.B().u());
      localzp1.d(paramzje.B().v());
      localzp1.a(localzp1.c() + 5);
      localzp1.b(localzp1.d() + 5);
      if (localzp1.i() + 5 > paramzje.a()) {
        localzp1.c(paramzje.a() - 5 - localzp1.c());
      }
      if (localzp1.j() + 5 > paramzje.b()) {
        localzp1.d(paramzje.b() - 5 - localzp1.d());
      }
      if ((paramzje.M() == 45) || (paramzje.M() == 48))
      {
        localObject1 = new zp[] { localzp1 };
        zawe.a((zp[])localObject1, paramzje, 0);
        localzp1 = localObject1[0];
        j = ziy.c;
        paramzje.a(false, localzp1.c() - j, localzp1.d() - j, zbxz.c(localzp1.e() * (1.0F - 2.0F * j / paramzje.a())), zbxz.c(localzp1.f() * (1.0F - 2.0F * j / paramzje.b())));
      }
      paramzje.B().b = new zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
    }
    else
    {
      j = ziy.c;
      paramzje.a(false, localzp1.c() - j, localzp1.d() - j, zbxz.c(localzp1.e() * (1.0F - 2.0F * j / paramzje.a())), zbxz.c(localzp1.f() * (1.0F - 2.0F * j / paramzje.b())));
    }
    paramzje.a(new zq(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f()));
    paramzje.B().b = new zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    boolean bool4 = ziy.a(localzbfe.i(), arrayOfDouble1, arrayOfDouble2, paramzje.E());
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    boolean bool5 = paramzje.E().O();
    boolean bool6 = paramzje.E().P();
    boolean bool7 = paramzje.E().N();
    boolean bool8 = paramzje.E().M();
    double d3 = d2;
    double d4 = d1;
    ziy.a(localzr, paramzje.E(), d2, d1, bool4, paramzje.E().l, paramzje.M(), localzp1, bool1, localzbfe.c(0));
    ziy.a(localzr, paramzje.e(), paramzje.e().l, localzp1, paramzje.M(), localzbfe, bool1);
    if (bool2) {
      g(paramzje);
    }
    localzp1.a(localzp1.c() + c);
    localzp1.b(localzp1.d() + c);
    localzp1.c(localzp1.e() - 2 * c);
    localzp1.d(localzp1.f() - 2 * c);
    zxn.a(paramzje, localzp1, bool1);
    zbu.a(paramzje);
    zp localzp2 = new zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
    zp[] arrayOfzp2;
    if ((!zbxz.a(localzp1)) && (paramzje.e().K().j()) && (paramzje.e().q()))
    {
      arrayOfzp2 = new zp[] { localzp1 };
      a(localzr, paramzje.e(), localzp2, arrayOfzp2, bool1);
      localzp1 = arrayOfzp2[0];
    }
    if ((!zbxz.a(localzp1)) && (paramzje.E().K().j()) && (paramzje.E().q()))
    {
      arrayOfzp2 = new zp[] { localzp1 };
      a(localzr, paramzje.E(), localzp2, arrayOfzp2, bool1);
      localzp1 = arrayOfzp2[0];
    }
    if ((!zbxz.a(localzp1)) && (bool2) && (paramzje.I().K().j()) && (paramzje.I().q()))
    {
      arrayOfzp2 = new zp[] { localzp1 };
      a(localzr, paramzje.I(), arrayOfzp2);
      localzp1 = arrayOfzp2[0];
    }
    int k = 0;
    int m = paramzje.D() % 90;
    int n = paramzje.D() / 45;
    if ((!zbxz.a(localzp1)) && (paramzje.u()))
    {
      ziy.f(paramzje);
      localObject2 = zjr.a(localzr, paramzje.k(), localzp1);
      paramzje.k().a((zs)localObject2);
      i1 = zjr.b(localzr, paramzje.k(), localzp1);
      paramzje.k().a(i1);
      int i2 = ((zs)localObject2).c() + i1;
      paramzje.k().a.d(i2);
      zo[] arrayOfzo1 = c(paramzje);
      if ((paramzje.p() <= 0) || (bool1))
      {
        if ((!paramzje.B().s()) && (paramzje.S()))
        {
          paramzje.k().a.a(localzp1.c() + ((zs)localObject2).b());
          paramzje.k().a.b(localzp1.j());
          paramzje.k().a.c(localzp1.e() - ((zs)localObject2).b());
          localzp1.d(localzp1.f() + i2);
        }
        else
        {
          localzp1.d(localzp1.f() - i2);
          paramzje.k().a.a(localzp1.c() + ((zs)localObject2).b());
          paramzje.k().a.b(localzp1.j());
          paramzje.k().a.c(localzp1.e() - ((zs)localObject2).b());
        }
      }
      else {
        switch (n)
        {
        case 0: 
        case 3: 
        case 4: 
        case 7: 
        case 8: 
          if ((!paramzje.B().s()) && (paramzje.S()))
          {
            localzp1.d(localzp1.f() + i2 + c);
            localzp1.a(localzp1.c() - ((zs)localObject2).b());
            localzp1.c(localzp1.e() + ((zs)localObject2).b());
          }
          else
          {
            localzp1.d(localzp1.f() - (i2 + c));
            localzp1.a(localzp1.c() + ((zs)localObject2).b());
            localzp1.c(localzp1.e() - ((zs)localObject2).b());
          }
          paramzje.e().j(3);
          paramzje.e().f(2);
          paramzje.e().h(2);
          break;
        case 1: 
        case 2: 
        case 5: 
        case 6: 
          if ((!paramzje.B().s()) && (paramzje.S()))
          {
            paramzje.k().a.a(localzp1.c() + ((zs)localObject2).b());
            paramzje.k().a.b(localzp1.j());
            paramzje.k().a.c(localzp1.e() - ((zs)localObject2).b());
            localzp1.d(localzp1.f() + i2);
          }
          else
          {
            localzp1.d(localzp1.f() - i2);
            paramzje.k().a.a(localzp1.c() + ((zs)localObject2).b());
            paramzje.k().a.b(localzp1.j());
            paramzje.k().a.c(localzp1.e() - ((zs)localObject2).b());
          }
          break;
        }
      }
      if ((paramzje.B().s()) || (!paramzje.S())) {
        zxn.a(paramzje, localzp1, bool1);
      }
    }
    Object localObject2 = new zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
    int i1 = paramzje.z().h();
    zs localzs = zbu.b(localzr, paramzje.I(), localzp1, localzbfe.getCount(), false, localzbfe.c(0));
    int i3 = paramzje.I().F().k();
    if ((!zbxz.a(localzp1)) && (paramzje.I().E() != 3) && (paramzje.I().q()) && (bool2))
    {
      localObject3 = zbu.a(localzr, paramzje.I(), i1, bool1);
      if ((!((zp)localObject3).k()) && (((zp)localObject3).e() > 0) && (((zp)localObject3).f() > 0))
      {
        int i4 = i;
        if (((zp)localObject3).i() > ((zp)localObject2).i() - i4) {
          if ((!paramzje.B().s()) && (paramzje.S())) {
            localzp1.c(localzp1.e() + (((zp)localObject3).i() - (((zp)localObject2).i() - i4)));
          } else {
            localzp1.c(localzp1.e() - (((zp)localObject3).i() - (((zp)localObject2).i() - i4)));
          }
        }
        if (((zp)localObject3).j() > ((zp)localObject2).j() - i4) {
          if ((!paramzje.B().s()) && (paramzje.S())) {
            localzp1.d(localzp1.f() + (((zp)localObject3).j() - (((zp)localObject2).j() - i4)));
          } else {
            localzp1.d(localzp1.f() - (((zp)localObject3).j() - (((zp)localObject2).j() - i4)));
          }
        }
        if (((zp)localObject3).c() < ((zp)localObject2).c() + i4)
        {
          i5 = ((zp)localObject2).c() + i4 - ((zp)localObject3).c();
          if ((!paramzje.B().s()) && (paramzje.S()))
          {
            localzp1.a(localzp1.c() - i5);
            localzp1.c(localzp1.e() + i5);
          }
          else
          {
            localzp1.a(localzp1.c() + i5);
            localzp1.c(localzp1.e() - i5);
          }
        }
        if (((zp)localObject3).d() < ((zp)localObject2).d() + i4)
        {
          i5 = ((zp)localObject2).d() + i4 - ((zp)localObject3).d();
          if ((!paramzje.B().s()) && (paramzje.S()))
          {
            localzp1.b(localzp1.d() + i5);
            localzp1.d(localzp1.f() - i5);
          }
          else
          {
            localzp1.b(localzp1.d() + i5);
            localzp1.d(localzp1.f() - i5);
          }
        }
      }
      if ((paramzje.B().s()) || (!paramzje.S())) {
        zxn.a(paramzje, localzp1, false);
      }
    }
    Object localObject3 = zbu.a(localzr, paramzje.E(), localzbfe.c(0), bool1);
    if ((!zbxz.a(localzp1)) && (paramzje.E().E() != 3) && (paramzje.E().q()))
    {
      if (!bool1)
      {
        localObject4 = e(paramzje);
        if (((zo)localObject4).d() < paramzje.N().j())
        {
          i5 = (int)(((zo)localObject4).d() - localzp1.c());
          if (k == 0) {
            i5 -= paramzje.E().K().e().b.b().b();
          }
          if (i5 < ((zs)localObject3).b()) {
            if ((!paramzje.B().s()) && (paramzje.S()))
            {
              localzp1.a(localzp1.c() - ((zs)localObject3).b());
              localzp1.c(localzp1.e() + ((zs)localObject3).b());
            }
            else
            {
              localzp1.a(localzp1.c() + ((zs)localObject3).b());
              localzp1.c(localzp1.e() - ((zs)localObject3).b());
            }
          }
        }
        else
        {
          i5 = (int)(localzp1.i() - ((zo)localObject4).d());
          if (i5 < ((zs)localObject3).b()) {
            if ((!paramzje.B().s()) && (paramzje.S())) {
              localzp1.c(localzp1.e() + ((zs)localObject3).b());
            } else {
              localzp1.c(localzp1.e() - ((zs)localObject3).b());
            }
          }
        }
        if (paramzje.p() >= 0)
        {
          if (paramzje.ag().m() - ((zo)localObject4).e() < ((zs)localObject3).c() / 2) {
            if ((!paramzje.B().s()) && (paramzje.S())) {
              localzp1.d(localzp1.f() + ((zs)localObject3).c() / 2);
            } else {
              localzp1.d(localzp1.f() - ((zs)localObject3).c() / 2);
            }
          }
        }
        else if (((zo)localObject4).e() - paramzje.N().i() - paramzje.ag().g() < ((zs)localObject3).c() / 2) {
          if ((!paramzje.B().s()) && (paramzje.S()))
          {
            localzp1.b(localzp1.d() - ((zs)localObject3).c() / 2);
            localzp1.d(localzp1.f() + ((zs)localObject3).c() / 2);
          }
          else
          {
            localzp1.b(localzp1.d() + ((zs)localObject3).c() / 2);
            localzp1.d(localzp1.f() - ((zs)localObject3).c() / 2);
          }
        }
      }
      else
      {
        localObject4 = c(paramzje);
        i5 = ((zs)localObject3).c();
        if (localzp1.j() - (int)localObject4[0].e() < i5) {
          if ((!paramzje.B().s()) && (paramzje.S())) {
            localzp1.d(localzp1.f() + (i5 - (localzp1.j() - (int)localObject4[0].e())));
          } else {
            localzp1.d(localzp1.f() - (i5 - (localzp1.j() - (int)localObject4[0].e())));
          }
        }
      }
      if ((paramzje.B().s()) || (!paramzje.S())) {
        zxn.a(paramzje, localzp1, bool1);
      }
    }
    if ((bool1) && (bool5) && (!paramzje.E().n()))
    {
      ziy.a(paramzje.E(), d3, d4, paramzje.M(), paramzje.N().g(), bool1, localzbfe.c(0), bool7, bool8, bool5);
      zbu.a(localzr, paramzje.E(), localzbfe.c(0), bool1);
    }
    Object localObject4 = zbu.b(localzr, paramzje.e(), localzp1, i1, bool1, localzbfe.c(0));
    int i5 = paramzje.e().F().k();
    if (paramzje.z().e() != null) {
      i5 += i5 * paramzje.z().e().length;
    }
    int i7;
    if ((!zbxz.a(localzp1)) && (paramzje.e().E() != 3) && (paramzje.e().q()))
    {
      Object localObject5;
      int i9;
      if (!bool1)
      {
        localObject5 = zbu.a(localzr, paramzje.e(), i1, bool1);
        if ((!((zp)localObject5).k()) && (((zp)localObject5).e() > 0) && (((zp)localObject5).f() > 0))
        {
          i7 = i;
          if (((zp)localObject5).i() > ((zp)localObject2).i() - i7) {
            if ((!paramzje.B().s()) && (paramzje.S())) {
              localzp1.c(localzp1.e() + (((zp)localObject5).i() - (((zp)localObject2).i() - i7)));
            } else {
              localzp1.c(localzp1.e() - (((zp)localObject5).i() - (((zp)localObject2).i() - i7)));
            }
          }
          if (((zp)localObject5).j() > ((zp)localObject2).j() - i7) {
            if ((!paramzje.B().s()) && (paramzje.S())) {
              localzp1.d(localzp1.f() + (((zp)localObject5).j() - (((zp)localObject2).j() - i7)));
            } else {
              localzp1.d(localzp1.f() - (((zp)localObject5).j() - (((zp)localObject2).j() - i7)));
            }
          }
          if (((zp)localObject5).c() < ((zp)localObject2).c() + i7)
          {
            i9 = ((zp)localObject2).c() + i7 - ((zp)localObject5).c();
            if ((!paramzje.B().s()) && (paramzje.S()))
            {
              localzp1.a(localzp1.c() - i9);
              localzp1.c(localzp1.e() + i9);
            }
            else
            {
              localzp1.a(localzp1.c() + i9);
              localzp1.c(localzp1.e() - i9);
            }
          }
          if (((zp)localObject5).d() < ((zp)localObject2).d() + i7)
          {
            i9 = ((zp)localObject2).d() + i7 - ((zp)localObject5).d();
            if ((!paramzje.B().s()) && (paramzje.S()))
            {
              localzp1.b(localzp1.d() - i9);
              localzp1.d(localzp1.f() + i9);
            }
            else
            {
              localzp1.b(localzp1.d() + i9);
              localzp1.d(localzp1.f() - i9);
            }
          }
        }
      }
      else
      {
        localObject5 = e(paramzje);
        i7 = ((zs)localObject4).b() + i5;
        i9 = (int)(((zo)localObject5).d() - ((zp)localObject2).c());
        if (i9 < i7) {
          if ((!paramzje.B().s()) && (paramzje.S()))
          {
            localzp1.a(localzp1.c() - i7);
            localzp1.c(localzp1.e() + i7);
          }
          else
          {
            localzp1.a(localzp1.c() + i7);
            localzp1.c(localzp1.e() - i7);
          }
        }
      }
      if ((paramzje.B().s()) || (!paramzje.S())) {
        zxn.a(paramzje, localzp1, bool1);
      }
    }
    int i6;
    if ((!zbxz.a(localzp1)) && (paramzje.u()))
    {
      i6 = zjr.b(localzr, paramzje.k(), localzp1);
      if (i6 > paramzje.k().r())
      {
        paramzje.k().a(i6);
        i7 = i6 - paramzje.k().r();
        paramzje.k().a.d(paramzje.k().a.f() + i7);
        zo[] arrayOfzo3 = c(paramzje);
        if ((paramzje.p() <= 0) || (bool1))
        {
          if ((!paramzje.B().s()) && (paramzje.S()))
          {
            paramzje.k().a.b(paramzje.k().a.d() + i7);
            localzp1.d(localzp1.f() + i7);
          }
          else
          {
            localzp1.d(localzp1.f() - i7);
            paramzje.k().a.b(paramzje.k().a.d() - i7);
          }
        }
        else {
          switch (n)
          {
          case 0: 
          case 3: 
          case 4: 
          case 7: 
          case 8: 
            if ((!paramzje.B().s()) && (paramzje.S())) {
              localzp1.d(localzp1.f() + (i7 + c));
            } else {
              localzp1.d(localzp1.f() - (i7 + c));
            }
            paramzje.e().j(3);
            paramzje.e().f(2);
            paramzje.e().h(2);
            break;
          case 1: 
          case 2: 
          case 5: 
          case 6: 
            if ((!paramzje.B().s()) && (paramzje.S()))
            {
              paramzje.k().a.b(paramzje.k().a.d() + i7);
              localzp1.d(localzp1.f() + i7);
            }
            else
            {
              localzp1.d(localzp1.f() - i7);
              paramzje.k().a.b(paramzje.k().a.d() - i7);
            }
            break;
          }
        }
        if ((paramzje.B().s()) || (!paramzje.S())) {
          zxn.a(paramzje, localzp1, bool1);
        }
      }
    }
    if ((!zbxz.a(localzp1)) && (paramzje.E().q()))
    {
      i6 = ziy.a(localzr, paramzje.E(), bool1, paramzje.z().c(0), localzp1);
      i7 = 0;
      if (bool1) {
        i7 = zbxz.a(paramzje.N().g());
      } else {
        i7 = zbxz.a(paramzje.N().i());
      }
      if ((bool5) && (paramzje.E().l.size() > 3) && (i6 > i7) && (i7 != 0))
      {
        paramzje.E().l.clear();
        paramzje.E().i(bool5);
        paramzje.E().j(bool6);
        paramzje.E().h(bool7);
        paramzje.E().g(bool8);
        ziy.a(localzr, paramzje.E(), d2, d1, bool4, paramzje.E().l, paramzje.z().c(0).ag(), localzp1, bool1, paramzje.z().c(0));
      }
    }
    if ((!zbxz.a(localzp1)) && (paramzje.e().K().j()) && (paramzje.e().q())) {
      a(paramzje.e(), localzp1, bool1, (zs)localObject3, (zs)localObject4, i5);
    }
    if ((!zbxz.a(localzp1)) && (paramzje.E().K().j()) && (paramzje.E().q())) {
      a(paramzje.E(), localzp1, bool1, (zs)localObject3, (zs)localObject4, i5);
    }
    Object localObject6;
    if ((!zbxz.a(localzp1)) && (paramzje.I().K().j()) && (paramzje.I().q()))
    {
      localObject6 = localzs;
      if (paramzje.I().E() != 3) {
        ((zs)localObject6).a(((zs)localObject6).b() + i3);
      }
      zo[] arrayOfzo2 = d(paramzje);
      if (arrayOfzo2[0].e() == arrayOfzo2[1].e())
      {
        if (paramzje.p() >= 0) {
          paramzje.I().K().e().b.a((int)((arrayOfzo2[0].d() + arrayOfzo2[1].d()) / 2.0F - paramzje.I().K().e().b.e() / 2));
        }
      }
      else
      {
        float f1 = arrayOfzo2[0].d() >= arrayOfzo2[1].d() ? arrayOfzo2[1].d() : arrayOfzo2[0].d();
        float f2 = arrayOfzo2[0].d() >= arrayOfzo2[1].d() ? arrayOfzo2[0].d() : arrayOfzo2[1].d();
        switch (n)
        {
        case 0: 
        case 4: 
        case 8: 
          paramzje.I().K().e().b.a((int)(Math.abs(arrayOfzo2[0].d() + arrayOfzo2[1].d()) / 2.0F + a(paramzje, (zs)localObject6)));
          break;
        case 3: 
        case 7: 
          paramzje.I().K().e().b.a((int)(Math.abs(arrayOfzo2[0].d() + arrayOfzo2[1].d()) / 2.0F - paramzje.I().K().e().b.e() - a(paramzje, (zs)localObject6)));
        }
        paramzje.I().K().e().b.b((int)(Math.abs(arrayOfzo2[0].e() + arrayOfzo2[1].e()) / 2.0F));
      }
    }
    if ((!zbxz.a(localzp1)) && (paramzje.u()) && (!bool1))
    {
      localObject6 = c(paramzje);
      if (paramzje.p() > 0) {
        switch (n)
        {
        case 0: 
        case 3: 
        case 4: 
        case 7: 
        case 8: 
          int i8 = localObject6[0].d() < localObject6[1].d() ? 0 : 1;
          paramzje.k().a.a((int)localObject6[i8].d());
          paramzje.k().a.b((int)localObject6[i8].e());
          paramzje.k().a.c((int)Math.abs(localObject6[1].d() - localObject6[0].d()));
        }
      }
    }
  }
  
  static void b(zje paramzje)
    throws Exception
  {
    a(paramzje);
    zr localzr = paramzje.ar();
    com.aspose.cells.b.a.b.a.zf localzf = null;
    zbfe localzbfe = paramzje.z();
    if ((paramzje.z().getCount() == 0) || (ziy.a(paramzje.z().i()) == 0)) {
      return;
    }
    boolean bool1 = ziy.a(paramzje.M());
    boolean bool2 = paramzje.B().D();
    int i = paramzje.z().h();
    float f1 = ziy.a(paramzje.E(), paramzje.N().e(), paramzje.N().g(), bool1);
    double d = paramzje.E().l();
    float f2 = ziy.a(paramzje.E(), paramzje.N().f() - paramzje.N().i(), paramzje.N().i(), bool1);
    float f3 = ziy.a(paramzje.e(), paramzje.N().f() - paramzje.N().i(), paramzje.N().i(), bool1, paramzje.z());
    float f4 = ziy.a(paramzje.e(), paramzje.N().e(), paramzje.N().g(), bool1, paramzje.z());
    zbfc localzbfc = (zbfc)paramzje.z().j().get(0);
    if (localzbfc.at()) {
      paramzje.B().z();
    } else {
      zjz.a(localzr, paramzje.B());
    }
    zp localzp = paramzje.B().a;
    for (int j = 0; j < localzbfe.getCount(); j++)
    {
      zqx localzqx1 = localzbfe.c(j).w();
      localzqx1.a().e(paramzje.B().a.e());
      localzqx1.a().f(paramzje.B().a.f());
      for (int k = 0; k < localzbfe.a(j).k().getCount(); k++)
      {
        zqx localzqx2 = localzbfe.c(j).D().b(k).o();
        localzqx2.a().e(paramzje.B().a.e());
        localzqx2.a().f(paramzje.B().a.f());
      }
    }
    zxn.a(localzr, paramzje, bool1);
    if (!paramzje.B().D()) {
      switch (paramzje.M())
      {
      case 17: 
      case 27: 
      case 34: 
      case 56: 
        zlq.b(localzr, paramzje, f2, d, i);
        break;
      case 18: 
      case 21: 
      case 28: 
      case 50: 
        zlq.a(localzr, paramzje, f2, d, i);
        break;
      case 19: 
      case 22: 
      case 29: 
      case 51: 
        zlq.a(localzr, paramzje, d, i);
        break;
      case 20: 
      case 23: 
      case 30: 
      case 52: 
        zlq.b(localzr, paramzje, d, i);
        break;
      case 9: 
      case 24: 
      case 31: 
      case 53: 
        zcj.a(localzr, paramzje, f1, d, i);
        break;
      case 10: 
      case 25: 
      case 32: 
      case 54: 
        zcj.a(localzr, paramzje, d, i);
        break;
      case 11: 
      case 26: 
      case 33: 
      case 55: 
        zcj.b(localzr, paramzje, d, i);
        break;
      case 43: 
        zlq.c(localzr, paramzje, f2, d, i);
        break;
      case 45: 
      case 48: 
        zawe.a(localzr, paramzje);
        break;
      case 3: 
        zba.a(localzr, paramzje, f2, d, i);
        break;
      case 4: 
        zba.a(localzr, paramzje, f2, d, i, false);
        break;
      case 5: 
        zba.a(localzr, paramzje, f2, d, i, true);
      }
    }
    localzf = null;
    j = 0;
    if ((paramzje.i().d().g()) && (paramzje.B().d().g()) && (paramzje.ar().i() != 4))
    {
      localzf = paramzje.ar().d();
      j = 1;
      paramzje.ar().b(4, false);
    }
    if (paramzje.E().q()) {
      if (bool1) {
        zbu.b(localzr, paramzje.E());
      } else {
        zbu.a(localzr, paramzje.E());
      }
    }
    if (paramzje.e().q()) {
      if (bool1) {
        zbu.a(localzr, paramzje.e(), i, localzp);
      } else {
        zbu.a(localzr, paramzje.e(), i, localzp, bool1);
      }
    }
    if (paramzje.I().q()) {
      zbu.c(localzr, paramzje.I());
    }
    if ((paramzje.i().d().g()) && (paramzje.B().d().g()) && (j != 0)) {
      paramzje.ar().a(localzf);
    }
    if ((paramzje.E().K().j()) && (paramzje.E().q())) {
      a(paramzje, localzr, paramzje.E());
    }
    if ((paramzje.e().K().j()) && (paramzje.e().q())) {
      a(paramzje, localzr, paramzje.e());
    }
    if ((paramzje.I().K().j()) && (paramzje.I().q())) {
      a(paramzje, localzr, paramzje.I());
    }
    if (paramzje.K().j()) {
      zbwz.a(paramzje, paramzje.K());
    }
    if (paramzje.u())
    {
      localzf = null;
      j = 0;
      if ((paramzje.i().d().g()) && (paramzje.B().d().g()) && (paramzje.ar().i() != 4))
      {
        localzf = paramzje.ar().d();
        j = 1;
        paramzje.ar().b(4, false);
      }
      zjr.a(localzr, paramzje.k(), bool1);
      if ((paramzje.i().d().g()) && (paramzje.B().d().g()) && (j != 0)) {
        paramzje.ar().a(localzf);
      }
    }
    if (paramzje.v())
    {
      localzf = null;
      j = 0;
      if ((paramzje.i().d().g()) && (paramzje.x().d().d().g()) && (paramzje.ar().i() != 4))
      {
        localzf = paramzje.ar().d();
        j = 1;
        paramzje.ar().b(4, false);
      }
      if ((paramzje.M() == 48) || (paramzje.M() == 45) || (paramzje.x().b)) {
        zana.a(localzr, paramzje.x(), localzbfc);
      } else {
        zana.a(localzr, paramzje.x(), bool1, localzbfc);
      }
      if ((paramzje.i().d().g()) && (paramzje.x().d().d().g()) && (j != 0)) {
        paramzje.ar().a(localzf);
      }
    }
  }
  
  private static void f(zje paramzje)
  {
    switch (paramzje.M())
    {
    case 45: 
    case 48: 
      Iterator localIterator = paramzje.z().iterator();
      while (localIterator.hasNext())
      {
        zbfc localzbfc = (zbfc)localIterator.next();
        if (localzbfc.I()) {
          localzbfc.c(true);
        }
        paramzje.c(false);
        paramzje.e().d(false);
        paramzje.e().K().a("");
        paramzje.E().d(false);
        paramzje.E().K().a("");
        paramzje.e().s().a(0);
        paramzje.e().u().a(0);
        paramzje.E().s().a(0);
        paramzje.E().u().a(0);
      }
      if (paramzje.p() < 1) {
        paramzje.f(1);
      }
      if (paramzje.p() > 90) {
        paramzje.f(90);
      }
      break;
    }
  }
  
  static zo[] c(zje paramzje)
  {
    zo localzo = new zo(paramzje.N().j(), paramzje.N().f());
    int i = paramzje.D() % 90;
    if (i >= 45) {
      i = 90 - i;
    }
    int j = paramzje.D() / 45;
    float f1;
    float f2;
    switch (j)
    {
    case 0: 
    case 3: 
    case 4: 
    case 7: 
    case 8: 
      f1 = paramzje.N().g();
      f2 = paramzje.N().h();
      break;
    case 1: 
    case 2: 
    case 5: 
    case 6: 
    default: 
      f1 = paramzje.N().h();
      f2 = paramzje.N().g();
    }
    float f3 = f2 * (float)Math.sin(i * 3.141592653589793D / 180.0D);
    float f4 = f2 * (float)Math.sin(paramzje.p() * 3.141592653589793D / 180.0D);
    zo[] arrayOfzo1 = new zo[4];
    zo[] arrayOfzo2 = new zo[4];
    zbxz.a(arrayOfzo1);
    zbxz.a(arrayOfzo2);
    switch (j)
    {
    case 0: 
    case 8: 
      arrayOfzo1[0].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() + f1);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f3);
      arrayOfzo1[3].a(arrayOfzo1[0].d() + f3);
      arrayOfzo1[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() - f4);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      arrayOfzo2[0] = arrayOfzo1[0];
      arrayOfzo2[1] = arrayOfzo1[1];
      arrayOfzo2[2] = arrayOfzo1[3];
      arrayOfzo2[3] = arrayOfzo1[2];
      break;
    case 1: 
      arrayOfzo1[0].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() + f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f1);
      arrayOfzo1[3].a(arrayOfzo1[0].d() + f1);
      arrayOfzo1[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() + f4);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      arrayOfzo2[0] = arrayOfzo1[0];
      arrayOfzo2[1] = arrayOfzo1[1];
      arrayOfzo2[2] = arrayOfzo1[3];
      arrayOfzo2[3] = arrayOfzo1[2];
      break;
    case 2: 
      arrayOfzo1[1].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() + f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f1);
      arrayOfzo1[3].a(arrayOfzo1[0].d() + f1);
      arrayOfzo1[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() + f4);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      arrayOfzo2[0] = arrayOfzo1[3];
      arrayOfzo2[1] = arrayOfzo1[2];
      arrayOfzo2[2] = arrayOfzo1[0];
      arrayOfzo2[3] = arrayOfzo1[1];
      break;
    case 3: 
      arrayOfzo1[1].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() + f1);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f3);
      arrayOfzo1[3].a(arrayOfzo1[2].d() + f1);
      arrayOfzo1[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() + f4);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      arrayOfzo2[0] = arrayOfzo1[3];
      arrayOfzo2[1] = arrayOfzo1[2];
      arrayOfzo2[2] = arrayOfzo1[0];
      arrayOfzo2[3] = arrayOfzo1[1];
      break;
    case 4: 
      arrayOfzo1[0].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() - f1);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f3);
      arrayOfzo1[3].a(arrayOfzo1[2].d() + f1);
      arrayOfzo1[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() + f4);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      arrayOfzo2[0] = arrayOfzo1[3];
      arrayOfzo2[1] = arrayOfzo1[2];
      arrayOfzo2[2] = arrayOfzo1[0];
      arrayOfzo2[3] = arrayOfzo1[1];
      break;
    case 5: 
      arrayOfzo1[0].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() - f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f1);
      arrayOfzo1[3].a(arrayOfzo1[0].d() - f1);
      arrayOfzo1[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() - f4);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      arrayOfzo2[0] = arrayOfzo1[3];
      arrayOfzo2[1] = arrayOfzo1[2];
      arrayOfzo2[2] = arrayOfzo1[0];
      arrayOfzo2[3] = arrayOfzo1[1];
      break;
    case 6: 
      arrayOfzo1[1].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() - f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f1);
      arrayOfzo1[3].a(arrayOfzo1[0].d() - f1);
      arrayOfzo1[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() - f4);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      arrayOfzo2[0] = arrayOfzo1[0];
      arrayOfzo2[1] = arrayOfzo1[1];
      arrayOfzo2[2] = arrayOfzo1[3];
      arrayOfzo2[3] = arrayOfzo1[2];
      break;
    case 7: 
      arrayOfzo1[1].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() - f1);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f3);
      arrayOfzo1[3].a(arrayOfzo1[2].d() - f1);
      arrayOfzo1[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() - f4);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      arrayOfzo2[0] = arrayOfzo1[0];
      arrayOfzo2[1] = arrayOfzo1[1];
      arrayOfzo2[2] = arrayOfzo1[3];
      arrayOfzo2[3] = arrayOfzo1[2];
    }
    return arrayOfzo2;
  }
  
  static zo[] d(zje paramzje)
  {
    zo localzo = new zo(paramzje.N().j(), paramzje.N().f());
    int i = paramzje.D() % 90;
    if (i >= 45) {
      i = 90 - i;
    }
    int j = paramzje.D() / 45;
    float f1;
    float f2;
    switch (j)
    {
    case 0: 
    case 3: 
    case 4: 
    case 7: 
    case 8: 
      f1 = paramzje.N().g();
      f2 = paramzje.N().h();
      break;
    case 1: 
    case 2: 
    case 5: 
    case 6: 
    default: 
      f1 = paramzje.N().h();
      f2 = paramzje.N().g();
    }
    float f3 = f2 * (float)Math.sin(i * 3.141592653589793D / 180.0D);
    float f4 = f2 * (float)Math.sin(paramzje.p() * 3.141592653589793D / 180.0D);
    zo[] arrayOfzo1 = new zo[4];
    zo[] arrayOfzo2 = new zo[2];
    zbxz.a(arrayOfzo1);
    zbxz.a(arrayOfzo2);
    switch (j)
    {
    case 0: 
    case 8: 
      arrayOfzo1[0].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() + f1);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f3);
      arrayOfzo1[3].a(arrayOfzo1[0].d() + f3);
      arrayOfzo1[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() - f4);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      arrayOfzo2[0] = arrayOfzo1[1];
      arrayOfzo2[1] = arrayOfzo1[2];
      break;
    case 1: 
      arrayOfzo1[0].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() + f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f1);
      arrayOfzo1[3].a(arrayOfzo1[0].d() + f1);
      arrayOfzo1[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() + f4);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      arrayOfzo2[0] = arrayOfzo1[1];
      arrayOfzo2[1] = arrayOfzo1[2];
      break;
    case 2: 
      arrayOfzo1[1].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() + f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f1);
      arrayOfzo1[3].a(arrayOfzo1[0].d() + f1);
      arrayOfzo1[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() + f4);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      arrayOfzo2[0] = arrayOfzo1[1];
      arrayOfzo2[1] = arrayOfzo1[2];
      break;
    case 3: 
      arrayOfzo1[1].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() + f1);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f3);
      arrayOfzo1[3].a(arrayOfzo1[2].d() + f1);
      arrayOfzo1[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() + f4);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      arrayOfzo2[0] = arrayOfzo1[1];
      arrayOfzo2[1] = arrayOfzo1[2];
      break;
    case 4: 
      arrayOfzo1[0].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() - f1);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f3);
      arrayOfzo1[3].a(arrayOfzo1[2].d() + f1);
      arrayOfzo1[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() + f4);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      arrayOfzo2[0] = arrayOfzo1[0];
      arrayOfzo2[1] = arrayOfzo1[3];
      break;
    case 5: 
      arrayOfzo1[0].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() - f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f1);
      arrayOfzo1[3].a(arrayOfzo1[0].d() - f1);
      arrayOfzo1[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() - f4);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      arrayOfzo2[0] = arrayOfzo1[0];
      arrayOfzo2[1] = arrayOfzo1[3];
      break;
    case 6: 
      arrayOfzo1[1].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() - f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f1);
      arrayOfzo1[3].a(arrayOfzo1[0].d() - f1);
      arrayOfzo1[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() - f4);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      arrayOfzo2[0] = arrayOfzo1[0];
      arrayOfzo2[1] = arrayOfzo1[3];
      break;
    case 7: 
      arrayOfzo1[1].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() - f1);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f3);
      arrayOfzo1[3].a(arrayOfzo1[2].d() - f1);
      arrayOfzo1[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() - f4);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      arrayOfzo2[0] = arrayOfzo1[0];
      arrayOfzo2[1] = arrayOfzo1[3];
    }
    return arrayOfzo2;
  }
  
  static zo e(zje paramzje)
  {
    zo localzo1 = new zo(paramzje.N().j(), paramzje.N().f());
    int i = paramzje.D() % 90;
    if (i >= 45) {
      i = 90 - i;
    }
    int j = paramzje.D() / 45;
    float f1;
    float f2;
    switch (j)
    {
    case 0: 
    case 3: 
    case 4: 
    case 7: 
    case 8: 
      f1 = paramzje.N().g();
      f2 = paramzje.N().h();
      break;
    case 1: 
    case 2: 
    case 5: 
    case 6: 
    default: 
      f1 = paramzje.N().h();
      f2 = paramzje.N().g();
    }
    float f3 = f2 * (float)Math.sin(i * 3.141592653589793D / 180.0D);
    float f4 = f2 * (float)Math.sin(paramzje.p() * 3.141592653589793D / 180.0D);
    zo[] arrayOfzo = new zo[4];
    zo localzo2 = zo.a();
    zbxz.a(arrayOfzo);
    switch (j)
    {
    case 0: 
    case 8: 
      arrayOfzo[0].a(localzo1.d() - (f1 + f3) / 2.0F);
      arrayOfzo[1].a(arrayOfzo[0].d() + f1);
      arrayOfzo[2].a(arrayOfzo[1].d() + f3);
      arrayOfzo[3].a(arrayOfzo[0].d() + f3);
      arrayOfzo[0].b(localzo1.e() + f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e());
      arrayOfzo[2].b(arrayOfzo[1].e() - f4);
      arrayOfzo[3].b(arrayOfzo[2].e());
      localzo2 = arrayOfzo[0];
      break;
    case 1: 
      arrayOfzo[0].a(localzo1.d() - (f1 + f3) / 2.0F);
      arrayOfzo[1].a(arrayOfzo[0].d() + f3);
      arrayOfzo[2].a(arrayOfzo[1].d() + f1);
      arrayOfzo[3].a(arrayOfzo[0].d() + f1);
      arrayOfzo[0].b(localzo1.e() - f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e() + f4);
      arrayOfzo[2].b(arrayOfzo[1].e());
      arrayOfzo[3].b(arrayOfzo[0].e());
      localzo2 = arrayOfzo[2];
      break;
    case 2: 
      arrayOfzo[1].a(localzo1.d() - (f1 + f3) / 2.0F);
      arrayOfzo[0].a(arrayOfzo[1].d() + f3);
      arrayOfzo[2].a(arrayOfzo[1].d() + f1);
      arrayOfzo[3].a(arrayOfzo[0].d() + f1);
      arrayOfzo[0].b(localzo1.e() - f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e() + f4);
      arrayOfzo[2].b(arrayOfzo[1].e());
      arrayOfzo[3].b(arrayOfzo[0].e());
      localzo2 = arrayOfzo[1];
      break;
    case 3: 
      arrayOfzo[1].a(localzo1.d() - (f1 + f3) / 2.0F);
      arrayOfzo[0].a(arrayOfzo[1].d() + f1);
      arrayOfzo[2].a(arrayOfzo[1].d() + f3);
      arrayOfzo[3].a(arrayOfzo[2].d() + f1);
      arrayOfzo[0].b(localzo1.e() - f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e());
      arrayOfzo[2].b(arrayOfzo[1].e() + f4);
      arrayOfzo[3].b(arrayOfzo[2].e());
      localzo2 = arrayOfzo[3];
      break;
    case 4: 
      arrayOfzo[0].a(localzo1.d() + (f1 + f3) / 2.0F);
      arrayOfzo[1].a(arrayOfzo[0].d() - f1);
      arrayOfzo[2].a(arrayOfzo[1].d() - f3);
      arrayOfzo[3].a(arrayOfzo[2].d() + f1);
      arrayOfzo[0].b(localzo1.e() - f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e());
      arrayOfzo[2].b(arrayOfzo[1].e() + f4);
      arrayOfzo[3].b(arrayOfzo[2].e());
      localzo2 = arrayOfzo[2];
      break;
    case 5: 
      arrayOfzo[0].a(localzo1.d() + (f1 + f3) / 2.0F);
      arrayOfzo[1].a(arrayOfzo[0].d() - f3);
      arrayOfzo[2].a(arrayOfzo[1].d() - f1);
      arrayOfzo[3].a(arrayOfzo[0].d() - f1);
      arrayOfzo[0].b(localzo1.e() + f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e() - f4);
      arrayOfzo[2].b(arrayOfzo[1].e());
      arrayOfzo[3].b(arrayOfzo[0].e());
      localzo2 = arrayOfzo[0];
      break;
    case 6: 
      arrayOfzo[1].a(localzo1.d() + (f1 + f3) / 2.0F);
      arrayOfzo[0].a(arrayOfzo[1].d() - f3);
      arrayOfzo[2].a(arrayOfzo[1].d() - f1);
      arrayOfzo[3].a(arrayOfzo[0].d() - f1);
      arrayOfzo[0].b(localzo1.e() + f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e() - f4);
      arrayOfzo[2].b(arrayOfzo[1].e());
      arrayOfzo[3].b(arrayOfzo[0].e());
      localzo2 = arrayOfzo[3];
      break;
    case 7: 
      arrayOfzo[1].a(localzo1.d() + (f1 + f3) / 2.0F);
      arrayOfzo[0].a(arrayOfzo[1].d() - f1);
      arrayOfzo[2].a(arrayOfzo[1].d() - f3);
      arrayOfzo[3].a(arrayOfzo[2].d() - f1);
      arrayOfzo[0].b(localzo1.e() + f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e());
      arrayOfzo[2].b(arrayOfzo[1].e() - f4);
      arrayOfzo[3].b(arrayOfzo[2].e());
      localzo2 = arrayOfzo[1];
    }
    return localzo2;
  }
  
  private static void a(zje paramzje, zr paramzr, zbs paramzbs)
    throws Exception
  {
    if (paramzbs.c().B().D()) {
      return;
    }
    zbwz.a(paramzje, paramzbs.K());
  }
  
  private static int a(zje paramzje, zs paramzs)
  {
    int i = paramzje.D() % 90;
    if (i >= 45) {
      i = 90 - i;
    }
    int m = paramzje.D() / 45;
    int j;
    int k;
    switch (m)
    {
    case 0: 
    case 3: 
    case 4: 
    case 7: 
    case 8: 
      j = paramzs.b();
      k = paramzs.c();
      break;
    case 1: 
    case 2: 
    case 5: 
    case 6: 
    default: 
      j = paramzs.c();
      k = paramzs.b();
    }
    int n = (int)(k * Math.sin(i * 3.141592653589793D / 180.0D));
    return j + n;
  }
  
  private static void a(zr paramzr, zbs paramzbs, zp paramzp, zp[] paramArrayOfzp, boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    zs localzs = zs.a();
    zje localzje = paramzbs.c();
    if (paramzbs.d() == 1) {
      paramBoolean = !paramBoolean;
    }
    Object localObject1;
    Object localObject2;
    int i;
    if (paramBoolean)
    {
      localObject1 = new zt(paramArrayOfzp[0].e() * 0.8F, paramArrayOfzp[0].f() * 0.8F);
      localzs = zbwz.a(localzje.ar(), paramzbs.K(), (zt)localObject1);
      paramzbs.K().e().b.a(localzs);
      localObject2 = e(localzje);
      if (((zo)localObject2).d() < localzje.N().j())
      {
        i = (int)(((zo)localObject2).d() - paramzp.c());
        if (i < localzs.b())
        {
          paramArrayOfzp[0].a(paramArrayOfzp[0].c() + localzs.b());
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() - localzs.b());
        }
      }
      else
      {
        i = (int)(paramArrayOfzp[0].i() - ((zo)localObject2).d());
        if (i < localzs.b())
        {
          paramzbs.K().e().b.a(paramArrayOfzp[0].i() - localzs.b());
          paramzbs.K().e().b.b(paramArrayOfzp[0].d() + (paramArrayOfzp[0].f() - localzs.c()) / 2);
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() - localzs.b());
        }
      }
      zxn.a(localzje, paramArrayOfzp[0], paramBoolean);
    }
    else
    {
      localObject1 = c(localzje);
      if (localzje.p() == 0)
      {
        localObject2 = new zt(paramArrayOfzp[0].e() * 0.8F, paramArrayOfzp[0].f() * 0.7F);
        localzs = zbwz.a(paramzr, paramzbs.K(), (zt)localObject2);
        paramzbs.K().e().b.a(localzs);
        paramzbs.K().e().b.b(paramArrayOfzp[0].j() - localzs.c() - c);
        i = paramArrayOfzp[0].j() - (int)localObject1[0].e();
        if (i < localzs.c() + c) {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c - i));
        }
      }
      else if (localzje.p() > 0)
      {
        if (localObject1[0].e() == localObject1[1].e())
        {
          localObject2 = new zt(paramArrayOfzp[0].e() * 0.8F, paramArrayOfzp[0].f() * 0.7F);
          localzs = zbwz.a(paramzr, paramzbs.K(), (zt)localObject2);
          paramzbs.K().e().b.a(localzs);
          i = 0;
          if (bool) {
            paramzbs.K().e().b.b(paramArrayOfzp[0].j() - localzs.c() - c);
          } else {
            paramzbs.K().e().b.b(paramzp.j() - localzs.c() - c * 4);
          }
          i = paramArrayOfzp[0].j() - (int)localObject1[0].e();
          if (i < localzs.c() + c) {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c - i));
          }
        }
        else
        {
          localObject2 = new zt(paramArrayOfzp[0].e() * 0.3F, paramArrayOfzp[0].f() * 0.3F);
          localzs = zbwz.a(paramzr, paramzbs.K(), (zt)localObject2);
          paramzbs.K().e().b.a(localzs);
          i = localzje.D() / 45;
          int j;
          switch (i)
          {
          case 2: 
          case 6: 
            if (paramArrayOfzp[0].i() - (int)Math.abs(localObject1[0].d() + localObject1[1].d()) / 2 < localzs.b())
            {
              j = localzs.b() - (paramArrayOfzp[0].i() - (int)Math.abs(localObject1[0].d() + localObject1[1].d()) / 2);
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() - j);
            }
            break;
          case 1: 
          case 5: 
            if ((int)Math.abs(localObject1[0].d() + localObject1[1].d()) / 2 - paramArrayOfzp[0].c() < localzs.b())
            {
              j = localzs.b() - ((int)Math.abs(localObject1[0].d() + localObject1[1].d()) / 2 - paramArrayOfzp[0].c());
              paramArrayOfzp[0].a(paramArrayOfzp[0].c() + j);
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() - j);
            }
            break;
          }
          if (paramArrayOfzp[0].j() - (int)Math.abs(localObject1[0].e() + localObject1[1].e()) / 2 < localzs.c()) {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c) - (paramArrayOfzp[0].j() - (int)Math.abs(localObject1[0].e() + localObject1[1].e()) / 2));
          }
        }
        zxn.a(localzje, paramArrayOfzp[0], paramBoolean);
      }
      else
      {
        paramzbs.K().a("");
      }
    }
  }
  
  private static void a(zr paramzr, zbs paramzbs, zp[] paramArrayOfzp)
  {
    zs localzs = zs.a();
    zje localzje = paramzbs.c();
    zo[] arrayOfzo = d(localzje);
    zt localzt;
    int i;
    if (localzje.p() == 0)
    {
      localzt = new zt(paramArrayOfzp[0].e() * 0.8F, paramArrayOfzp[0].f() * 0.7F);
      localzs = zbwz.a(paramzr, paramzbs.K(), localzt);
      paramzbs.K().e().b.a(localzs);
      paramzbs.K().e().b.b(paramArrayOfzp[0].j() - localzs.c() - c);
      i = paramArrayOfzp[0].j() - (int)arrayOfzo[0].e();
      if (i < localzs.c() + c) {
        paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c - i));
      }
    }
    if (localzje.p() > 0)
    {
      if (arrayOfzo[0].e() == arrayOfzo[1].e())
      {
        localzt = new zt(paramArrayOfzp[0].e() * 0.8F, paramArrayOfzp[0].f() * 0.7F);
        localzs = zbwz.a(paramzr, paramzbs.K(), localzt);
        paramzbs.K().e().b.a(localzs);
        i = 0;
        paramzbs.K().e().b.b(paramArrayOfzp[0].j() - localzs.c() - c);
        i = paramArrayOfzp[0].j() - (int)arrayOfzo[0].e();
        if (i < localzs.c() + c) {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c - i));
        }
      }
      else
      {
        localzt = new zt(paramArrayOfzp[0].e() * 0.3F, paramArrayOfzp[0].f() * 0.3F);
        localzs = zbwz.a(paramzr, paramzbs.K(), localzt);
        paramzbs.K().e().b.a(localzs);
        i = localzje.D() / 45;
        int j;
        switch (i)
        {
        case 0: 
        case 4: 
        case 8: 
          if (paramArrayOfzp[0].i() - (int)Math.abs(arrayOfzo[0].d() + arrayOfzo[1].d()) / 2 < localzs.b())
          {
            j = localzs.b() - (paramArrayOfzp[0].i() - (int)Math.abs(arrayOfzo[0].d() + arrayOfzo[1].d()) / 2);
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - j);
          }
          break;
        case 3: 
        case 7: 
          if ((int)Math.abs(arrayOfzo[0].d() + arrayOfzo[1].d()) / 2 - paramArrayOfzp[0].c() < localzs.b())
          {
            j = localzs.b() - ((int)Math.abs(arrayOfzo[0].d() + arrayOfzo[1].d()) / 2 - paramArrayOfzp[0].c());
            paramArrayOfzp[0].a(paramArrayOfzp[0].c() + j);
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() - j);
          }
          break;
        }
        if (paramArrayOfzp[0].j() - (int)Math.abs(arrayOfzo[0].e() + arrayOfzo[1].e()) / 2 < localzs.c()) {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c) - (paramArrayOfzp[0].j() - (int)Math.abs(arrayOfzo[0].e() + arrayOfzo[1].e()) / 2));
        }
      }
      zxn.a(localzje, paramArrayOfzp[0], false);
    }
    else
    {
      paramzbs.K().a("");
    }
  }
  
  private static void a(zbs paramzbs, zp paramzp, boolean paramBoolean, zs paramzs1, zs paramzs2, int paramInt)
  {
    boolean bool = paramBoolean;
    zs localzs = zs.a();
    zje localzje = paramzbs.c();
    if (paramzbs.d() == 1)
    {
      localzs = paramzs1;
      bool = !paramBoolean;
    }
    else
    {
      localzs = paramzs2;
      if (paramzbs.E() != 3) {
        localzs.a(localzs.b() + paramInt);
      }
    }
    Object localObject;
    if (bool)
    {
      localObject = paramzbs.K().e().b.b();
      zo localzo = e(localzje);
      if (localzo.d() < localzje.N().j())
      {
        paramzbs.K().e().b.a(paramzbs.E() == 3 ? (int)(localzo.d() - ((zs)localObject).b()) : (int)(localzo.d() - localzs.b() - ((zs)localObject).b()));
        paramzbs.K().e().b.b((int)(localzo.e() - localzje.N().i() / 2.0F - ((zs)localObject).c() / 2));
      }
      else
      {
        int i = (int)(paramzp.i() - localzo.d());
        if (i >= ((zs)localObject).b())
        {
          paramzbs.K().e().b.a(paramzbs.E() == 3 ? (int)localzo.d() : (int)(localzo.d() + localzs.b()));
          paramzbs.K().e().b.b((int)(localzo.e() - localzje.N().i() / 2.0F - ((zs)localObject).c() / 2));
        }
      }
    }
    else
    {
      localObject = c(localzje);
      if (localObject[0].e() == localObject[1].e())
      {
        if (localzje.p() >= 0) {
          paramzbs.K().e().b.a((int)((localObject[0].d() + localObject[1].d()) / 2.0F - paramzbs.K().e().b.e() / 2));
        }
      }
      else
      {
        float f1 = localObject[0].d() >= localObject[1].d() ? localObject[1].d() : localObject[0].d();
        float f2 = localObject[0].d() >= localObject[1].d() ? localObject[0].d() : localObject[1].d();
        if (((localzje.D() >= 45) && (localzje.D() < 90)) || ((localzje.D() >= 225) && (localzje.D() < 270))) {
          paramzbs.K().e().b.a((int)(Math.abs(localObject[0].d() + localObject[1].d()) / 2.0F - paramzbs.K().e().b.e() - a(localzje, localzs)));
        } else {
          paramzbs.K().e().b.a((int)(Math.abs(localObject[0].d() + localObject[1].d()) / 2.0F + a(localzje, localzs)));
        }
        paramzbs.K().e().b.b((int)(Math.abs(localObject[0].e() + localObject[1].e()) / 2.0F));
      }
    }
  }
  
  private static void g(zje paramzje)
  {
    zbs localzbs = paramzje.I();
    ArrayList localArrayList1 = paramzje.I().l;
    ArrayList localArrayList2 = paramzje.z().j();
    for (int i = 0; i < localArrayList2.size(); i++)
    {
      zbfc localzbfc = (zbfc)localArrayList2.get(i);
      com.aspose.cells.b.a.a.zf.a(localArrayList1, localzbfc.C());
    }
    localzbs.f(0.0D);
    localzbs.d(localArrayList2.size());
    localzbs.c(localzbs.J());
    localzbs.e(localzbs.x() / 2.0D);
  }
  
  private static void h(zje paramzje)
  {
    if ((paramzje.M() == 4) || (paramzje.M() == 5)) {
      paramzje.e(20);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */