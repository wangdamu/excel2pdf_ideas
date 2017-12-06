package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zjb
{
  private static int a = 10;
  private static int b = 8;
  private static int c = 3;
  
  static void a(zjf paramzjf)
    throws Exception
  {
    zr localzr = paramzjf.ap();
    zbff localzbff = paramzjf.z();
    if ((paramzjf.z().getCount() == 0) || (ziz.a(paramzjf.z().i()) == 0)) {
      return;
    }
    if (paramzjf.A().a().getCount() > 0) {
      paramzjf.z().a = true;
    }
    if (paramzjf.A().b().getCount() > 0) {
      paramzjf.z().b = true;
    }
    paramzjf.z().a(ziz.a(paramzjf.z().a()));
    paramzjf.z().b(ziz.a(paramzjf.z().b()));
    paramzjf.z().a(ziz.b(paramzjf.z().a()));
    paramzjf.z().b(ziz.b(paramzjf.z().b()));
    String str = ziz.c(paramzjf);
    if (!"".equals(str)) {
      throw new IllegalArgumentException(str);
    }
    f(paramzjf);
    ziz.e(paramzjf);
    h(paramzjf);
    zkn.a(paramzjf.e(), paramzjf.G(), paramzjf.z(), paramzjf.z().c(0));
    boolean bool1 = ziz.a(paramzjf.N());
    boolean bool2 = zxo.a(paramzjf);
    zbfd localzbfd = (zbfd)paramzjf.z().j().get(0);
    if (bool1)
    {
      if (paramzjf.p() < 0) {
        paramzjf.f(0);
      }
      if (paramzjf.p() > 44) {
        paramzjf.f(44);
      }
      if (paramzjf.E() < 0) {
        paramzjf.h(0);
      }
      if (paramzjf.E() > 44) {
        paramzjf.h(44);
      }
    }
    if (!bool2)
    {
      paramzjf.K().S().a("");
      paramzjf.K().d(false);
    }
    zp localzp = new zp(a + paramzjf.al().c(), a + paramzjf.al().d(), paramzjf.al().e() - a * 2, paramzjf.al().f() - a * 2);
    if (paramzjf.M().o())
    {
      zt localzt = new zt(localzp.e() * 0.8F, localzp.f() * 0.8F);
      localObject1 = paramzjf.M().a(localzt);
      paramzjf.M().e().b.a((paramzjf.al().e() - ((zs)localObject1).b()) / 2);
      paramzjf.M().e().b.b(a);
      paramzjf.M().e().b.a((zs)localObject1);
      localzp.b(localzp.d() + ((zs)localObject1).c() + b);
      localzp.d(localzp.f() - (((zs)localObject1).c() + b));
    }
    boolean bool3 = zanb.a(paramzjf);
    paramzjf.x().b = bool3;
    ziz.d(paramzjf);
    if (paramzjf.v()) {
      if ((paramzjf.N() == 48) || (paramzjf.N() == 45) || (bool3))
      {
        localObject1 = (zbfd)paramzjf.z().j().get(0);
        ziz.a(paramzjf, (zbfd)localObject1);
        localObject2 = new zp[] { localzp };
        zanb.a(localzr, paramzjf.x(), (zbfd)localObject1, (zp[])localObject2);
        localzp = localObject2[0];
      }
      else
      {
        ziz.a(paramzjf, bool1, false);
        localObject1 = new zp[] { localzp };
        zanb.a(localzr, paramzjf.x(), (zp[])localObject1);
        localzp = localObject1[0];
      }
    }
    Object localObject1 = new zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
    zxo.a(paramzjf, localzp, bool1);
    Object localObject2 = new zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
    if ((paramzjf.e().S().o()) && (paramzjf.e().q()))
    {
      localObject3 = new zp[] { localzp };
      a(localzr, paramzjf.e(), (zp)localObject2, (zp[])localObject3, bool1);
      localzp = localObject3[0];
    }
    if ((paramzjf.G().S().o()) && (paramzjf.G().q()))
    {
      localObject3 = new zp[] { localzp };
      a(localzr, paramzjf.G(), (zp)localObject2, (zp[])localObject3, bool1);
      localzp = localObject3[0];
    }
    Object localObject3 = new zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
    zp[] arrayOfzp1 = { localzp };
    zawf.a(paramzjf, arrayOfzp1, localzbfd);
    localzp = arrayOfzp1[0];
    paramzjf.B().b = new zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
    if (!paramzjf.B().s())
    {
      if (paramzjf.B().l() + paramzjf.B().i() > 4000) {
        paramzjf.B().a(4000 - paramzjf.B().i());
      }
      if (paramzjf.B().m() + paramzjf.B().n() > 4000) {
        paramzjf.B().b(4000 - paramzjf.B().n());
      }
      localzp.a(paramzjf.B().v());
      localzp.b(paramzjf.B().w());
      localzp.c(paramzjf.B().t());
      localzp.d(paramzjf.B().u());
      if (localzp.i() > paramzjf.a()) {
        localzp.c(paramzjf.a() - localzp.c());
      }
      if (localzp.j() > paramzjf.b()) {
        localzp.d(paramzjf.b() - localzp.d());
      }
      localObject1 = zbxz.c(localzp);
    }
    paramzjf.B().b = new zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    boolean bool4 = ziz.a(localzbff.i(), arrayOfDouble1, arrayOfDouble2, paramzjf.G());
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    boolean bool5 = paramzjf.G().O();
    boolean bool6 = paramzjf.G().P();
    boolean bool7 = paramzjf.G().N();
    boolean bool8 = paramzjf.G().M();
    double d3 = d2;
    double d4 = d1;
    ziz.a(localzr, paramzjf.G(), d2, d1, bool4, paramzjf.G().l, paramzjf.N(), localzp, bool1, localzbff.c(0));
    ziz.a(localzr, paramzjf.e(), paramzjf.e().l, localzp, paramzjf.N(), localzbff, bool1);
    if (bool2) {
      g(paramzjf);
    }
    if (!zbxz.a(localzp))
    {
      localzp.a(localzp.c() + c);
      localzp.b(localzp.d() + c);
      localzp.c(localzp.e() - 2 * c);
      localzp.d(localzp.f() - 2 * c);
      zxo.a(paramzjf, localzp, bool1);
    }
    zbv.a(paramzjf);
    if ((bool2) && (paramzjf.K().S().o()) && (paramzjf.K().q()))
    {
      zp[] arrayOfzp2 = { localzp };
      a(localzr, paramzjf.K(), arrayOfzp2);
      localzp = arrayOfzp2[0];
    }
    boolean bool9 = false;
    int i = paramzjf.E() / 45;
    if ((!zbxz.a(localzp)) && (paramzjf.u()))
    {
      ziz.f(paramzjf);
      zs localzs1 = zjs.a(localzr, paramzjf.k());
      paramzjf.k().a(localzs1);
      int k = zjs.a(localzr, paramzjf.k(), localzp);
      paramzjf.k().a(k);
      m = localzs1.c() + k;
      paramzjf.k().a.d(m);
      localObject4 = c(paramzjf);
      if ((paramzjf.p() <= 0) || (bool1))
      {
        if ((!paramzjf.B().s()) && (paramzjf.D()))
        {
          paramzjf.k().a.a(localzp.c() + localzs1.b());
          paramzjf.k().a.b(localzp.j());
          paramzjf.k().a.c(localzp.e() - localzs1.b());
          localzp.d(localzp.f() + m);
        }
        else
        {
          localzp.d(localzp.f() - m);
          paramzjf.k().a.a(localzp.c() + localzs1.b());
          paramzjf.k().a.b(localzp.j());
          paramzjf.k().a.c(localzp.e() - localzs1.b());
        }
      }
      else {
        switch (i)
        {
        case 0: 
        case 3: 
        case 4: 
        case 7: 
        case 8: 
          if ((!paramzjf.B().s()) && (paramzjf.D()))
          {
            localzp.d(localzp.f() + m + c);
            localzp.a(localzp.c() - localzs1.b());
            localzp.c(localzp.e() + localzs1.b());
          }
          else
          {
            localzp.d(localzp.f() - (m + c));
            localzp.a(localzp.c() + localzs1.b());
            localzp.c(localzp.e() - localzs1.b());
          }
          paramzjf.e().j(3);
          paramzjf.e().f(2);
          paramzjf.e().h(2);
          break;
        case 1: 
        case 2: 
        case 5: 
        case 6: 
          if ((!paramzjf.B().s()) && (paramzjf.D()))
          {
            paramzjf.k().a.a(localzp.c() + localzs1.b());
            paramzjf.k().a.b(localzp.j());
            paramzjf.k().a.c(localzp.e() - localzs1.b());
            localzp.d(localzp.f() + m);
          }
          else
          {
            localzp.d(localzp.f() - m);
            paramzjf.k().a.a(localzp.c() + localzs1.b());
            paramzjf.k().a.b(localzp.j());
            paramzjf.k().a.c(localzp.e() - localzs1.b());
          }
          break;
        }
      }
      if ((paramzjf.B().s()) || (!paramzjf.D())) {
        zxo.a(paramzjf, localzp, bool1);
      }
    }
    int j = paramzjf.z().h();
    zs localzs2 = zbv.a(localzr, paramzjf.K(), localzp);
    int m = paramzjf.K().J().d() * paramzjf.al().f() / 4000;
    if ((!zbxz.a(localzp)) && (paramzjf.K().I() != 3) && (paramzjf.K().q()) && (!bool1))
    {
      localObject4 = new zs(0, 0);
      if (paramzjf.K().q()) {
        localObject4 = paramzjf.K().S().e().b.b();
      }
      if (!bool1)
      {
        zo[] arrayOfzo1 = d(paramzjf);
        int n = 0;
        if (arrayOfzo1[0].e() < arrayOfzo1[1].e()) {
          n = 1;
        }
        float f1 = Math.abs((arrayOfzo1[1].e() - arrayOfzo1[0].e()) / paramzjf.K().l.size());
        int i4 = localzs2.c() + m;
        if (paramzjf.p() > 0) {
          if (arrayOfzo1[0].e() == arrayOfzo1[1].e())
          {
            if (localzp.j() - ((zs)localObject4).c() - (int)arrayOfzo1[0].e() < i4) {
              if ((!paramzjf.B().s()) && (paramzjf.D())) {
                localzp.d(localzp.f() + (i4 - (localzp.j() - ((zs)localObject4).c() - (int)arrayOfzo1[0].e())));
              } else {
                localzp.d(localzp.f() - (i4 - (localzp.j() - ((zs)localObject4).c() - (int)arrayOfzo1[0].e())));
              }
            }
          }
          else
          {
            zs localzs4 = localzs2;
            if (paramzjf.e().I() != 3) {
              localzs4.a(localzs4.b() + m);
            }
            int i8 = ((zs)localObject4).b() + a(paramzjf, localzs4);
            int i11;
            switch (i)
            {
            case 0: 
            case 4: 
            case 8: 
              if (localzp.i() - (int)Math.abs(arrayOfzo1[0].d() + arrayOfzo1[1].d()) / 2 < i8)
              {
                i11 = i8 - (localzp.i() - (int)Math.abs(arrayOfzo1[0].d() + arrayOfzo1[1].d()) / 2);
                if ((!paramzjf.B().s()) && (paramzjf.D())) {
                  localzp.c(localzp.e() + i11);
                } else {
                  localzp.c(localzp.e() - i11);
                }
              }
              break;
            case 3: 
            case 7: 
              if ((int)Math.abs(arrayOfzo1[0].d() + arrayOfzo1[1].d()) / 2 - localzp.c() < i8)
              {
                i11 = i8 - ((int)Math.abs(arrayOfzo1[0].d() + arrayOfzo1[1].d()) / 2 - localzp.c());
                if ((!paramzjf.B().s()) && (paramzjf.D()))
                {
                  localzp.a(localzp.c() - i11);
                  localzp.c(localzp.e() + i11);
                }
                else
                {
                  localzp.a(localzp.c() + i11);
                  localzp.c(localzp.e() - i11);
                }
              }
              break;
            }
            float f6 = f1 * (float)Math.sin(paramzjf.p() * 3.141592653589793D / 180.0D);
            if ((int)(localzp.j() - arrayOfzo1[n].e() + f6) < localzs2.c()) {
              if ((!paramzjf.B().s()) && (paramzjf.D())) {
                localzp.d(localzp.f() + localzs2.c() - (int)(localzp.j() - arrayOfzo1[n].e() + f6));
              } else {
                localzp.d(localzp.f() - (localzs2.c() - (int)(localzp.j() - arrayOfzo1[n].e() + f6)));
              }
            }
          }
        }
      }
      if ((paramzjf.B().s()) || (!paramzjf.D())) {
        zxo.a(paramzjf, localzp, false);
      }
    }
    int i2;
    if ((!paramzjf.B().s()) && (paramzjf.D()))
    {
      localObject4 = new zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
      boolean bool10 = false;
      Object localObject6 = { localzp };
      bool10 = a(paramzjf, (zp[])localObject6, (zp)localObject4, localzbff, bool1, bool9, i, bool10);
      localzp = localObject6[0];
      if (!bool10)
      {
        localObject6 = zbv.a(paramzjf.ap(), paramzjf.e(), localzp, (zp)localObject3, j, bool1, localzbff.c(0));
        i2 = (int)(paramzjf.e().J().q() + paramzjf.e().aa() + paramzjf.e().ab() + 0.5D);
        if (paramzjf.z().e() != null) {
          i2 += i2 * paramzjf.z().e().length;
        }
        zp[] arrayOfzp3 = { localzp };
        bool10 = a(paramzjf, arrayOfzp3, (zp)localObject4, localzbff, bool1, bool9, i, j, bool10, (zs)localObject6, i2);
        localzp = arrayOfzp3[0];
      }
      if (bool10)
      {
        paramzjf.B().e(true);
        zxo.a(paramzjf, localzp, bool1);
      }
    }
    Object localObject4 = zbv.a(localzr, paramzjf.G(), localzbff.c(0), bool1);
    int i6;
    if ((!zbxz.a(localzp)) && (paramzjf.G().I() != 3) && (paramzjf.G().q()))
    {
      ziz.a(paramzjf.G(), paramzjf.e(), localzbff, paramzjf);
      if (!bool1)
      {
        localObject5 = e(paramzjf);
        if (((zo)localObject5).d() < paramzjf.S().j())
        {
          i1 = (int)(((zo)localObject5).d() - localzp.c());
          if (!bool9) {
            i1 -= paramzjf.G().S().e().b.b().b();
          }
          i2 = ((zs)localObject4).b();
          if (paramzjf.u()) {
            i2 -= paramzjf.k().k().b();
          }
          if (i1 < i2) {
            if ((!paramzjf.B().s()) && (paramzjf.D()))
            {
              localzp.a(localzp.c() - i2);
              localzp.c(localzp.e() + i2);
            }
            else
            {
              localzp.a(localzp.c() + i2);
              localzp.c(localzp.e() - i2);
            }
          }
        }
        else
        {
          i1 = (int)(localzp.i() - ((zo)localObject5).d());
          if (i1 < ((zs)localObject4).b()) {
            if ((!paramzjf.B().s()) && (paramzjf.D())) {
              localzp.c(localzp.e() + ((zs)localObject4).b());
            } else {
              localzp.c(localzp.e() - ((zs)localObject4).b());
            }
          }
        }
        if (paramzjf.p() >= 0)
        {
          switch (i)
          {
          case 1: 
          case 2: 
          case 5: 
          case 6: 
            if (localzp.j() - ((zo)localObject5).e() < ((zs)localObject4).c() / 2) {
              if ((!paramzjf.B().s()) && (paramzjf.D())) {
                localzp.d(localzp.f() + ((zs)localObject4).c() / 2);
              } else {
                localzp.d(localzp.f() - ((zs)localObject4).c() / 2);
              }
            }
            break;
          }
        }
        else
        {
          if (((zo)localObject5).e() - paramzjf.S().i() - localzp.d() < ((zs)localObject4).c() / 2) {
            if ((!paramzjf.B().s()) && (paramzjf.D())) {
              localzp.b(localzp.d() - ((zs)localObject4).c() / 2);
            } else {
              localzp.b(localzp.d() + ((zs)localObject4).c() / 2);
            }
          }
          if ((!paramzjf.B().s()) && (paramzjf.D())) {
            localzp.d(localzp.f() + ((zs)localObject4).c() / 2);
          } else {
            localzp.d(localzp.f() - ((zs)localObject4).c() / 2);
          }
        }
      }
      else
      {
        localObject5 = c(paramzjf);
        i1 = ((zs)localObject4).c();
        if (paramzjf.G().m == 1)
        {
          if (localzp.j() - (int)localObject5[0].e() < i1) {
            if ((!paramzjf.B().s()) && (paramzjf.D()))
            {
              i2 = localzp.f();
              localzp.d(localzp.f() + (i1 - (localzp.j() - (int)localObject5[0].e())));
            }
            else
            {
              localzp.d(localzp.f() - (i1 - (localzp.j() - (int)localObject5[0].e())));
            }
          }
        }
        else if (paramzjf.G().m == 2)
        {
          float f2 = paramzjf.S().i();
          if ((int)(localObject5[2].e() - f2) - localzp.h() < i1)
          {
            int i5 = i1 - ((int)(localObject5[2].e() - f2) - localzp.h());
            if ((!paramzjf.B().s()) && (paramzjf.D()))
            {
              i6 = localzp.f();
              localzp.b(localzp.d() - i5);
              localzp.d(localzp.f() + i5);
            }
            else
            {
              localzp.b(localzp.d() + i5);
              localzp.d(localzp.f() - i5);
            }
          }
        }
      }
      if ((paramzjf.B().s()) || (!paramzjf.D())) {
        zxo.a(paramzjf, localzp, bool1);
      }
    }
    Object localObject5 = zbv.a(localzr, paramzjf.e(), localzp, (zp)localObject3, j, bool1, localzbff.c(0));
    int i1 = (int)(paramzjf.e().J().q() + paramzjf.e().aa() + paramzjf.e().ab() + 0.5D);
    if (paramzjf.z().e() != null) {
      i1 += i1 * paramzjf.z().e().length;
    }
    int i9;
    if ((!zbxz.a(localzp)) && (paramzjf.e().I() != 3) && (paramzjf.e().q()))
    {
      zs localzs3 = new zs(0, 0);
      if (paramzjf.e().S().o()) {
        localzs3 = paramzjf.e().S().e().b.b();
      }
      Object localObject7;
      if (!bool1)
      {
        localObject7 = c(paramzjf);
        i6 = 0;
        if (localObject7[0].e() < localObject7[1].e()) {
          i6 = 1;
        }
        float f5 = Math.abs((localObject7[1].e() - localObject7[0].e()) / j);
        int i12 = ((zs)localObject5).c() + i1;
        if (paramzjf.p() >= 0) {
          if (localObject7[0].e() == localObject7[1].e())
          {
            if (localzp.j() - localzs3.c() - (int)localObject7[0].e() < i12) {
              if ((!paramzjf.B().s()) && (paramzjf.D())) {
                localzp.d(localzp.f() + (i12 - (localzp.j() - localzs3.c() - (int)localObject7[0].e())));
              } else {
                localzp.d(localzp.f() - (i12 - (localzp.j() - localzs3.c() - (int)localObject7[0].e())));
              }
            }
          }
          else
          {
            Object localObject9 = localObject5;
            if (paramzjf.e().I() != 3) {
              ((zs)localObject9).a(((zs)localObject9).b() + i1);
            }
            int i13 = localzs3.b() + a(paramzjf, (zs)localObject9);
            int i14;
            switch (i)
            {
            case 2: 
            case 6: 
              if (localzp.i() - (int)Math.abs(localObject7[0].d() + localObject7[1].d()) / 2 < i13)
              {
                i14 = i13 - (localzp.i() - (int)Math.abs(localObject7[0].d() + localObject7[1].d()) / 2);
                if ((!paramzjf.B().s()) && (paramzjf.D())) {
                  localzp.c(localzp.e() + i14);
                } else {
                  localzp.c(localzp.e() - i14);
                }
              }
              break;
            case 1: 
            case 5: 
              if ((int)Math.abs(localObject7[0].d() + localObject7[1].d()) / 2 - localzp.c() < i13)
              {
                i14 = i13 - ((int)Math.abs(localObject7[0].d() + localObject7[1].d()) / 2 - localzp.c());
                if ((!paramzjf.B().s()) && (paramzjf.D()))
                {
                  localzp.a(localzp.c() - i14);
                  localzp.c(localzp.e() + i14);
                }
                else
                {
                  localzp.a(localzp.c() + i14);
                  localzp.c(localzp.e() - i14);
                }
              }
              break;
            }
            float f9 = f5 * (float)Math.sin(paramzjf.p() * 3.141592653589793D / 180.0D);
            if ((int)(localzp.j() - localObject7[i6].e() + f9) < ((zs)localObject5).c()) {
              if ((!paramzjf.B().s()) && (paramzjf.D())) {
                localzp.d(localzp.f() + (((zs)localObject5).c() - (int)(localzp.j() - localObject7[i6].e() + f9)));
              } else {
                localzp.d(localzp.f() - (((zs)localObject5).c() - (int)(localzp.j() - localObject7[i6].e() + f9)));
              }
            }
          }
        }
      }
      else
      {
        localObject7 = e(paramzjf);
        i6 = ((zs)localObject5).b() + i1;
        i9 = (int)(((zo)localObject7).d() - localzp.c());
        if (i9 < i6) {
          if ((!paramzjf.B().s()) && (paramzjf.D()))
          {
            localzp.a(localzp.c() - i6);
            localzp.c(localzp.e() + i6);
            if ((localzp.c() < 0) || (localzp.i() > paramzjf.a()))
            {
              localzp.a(localzp.c() + i6);
              localzp.c(localzp.e() - i6);
              paramzjf.B().e(true);
              localzp.a(localzp.c() + i6);
              localzp.c(localzp.e() - i6);
            }
          }
          else
          {
            localzp.a(localzp.c() + i6);
            localzp.c(localzp.e() - i6);
          }
        }
      }
      if ((paramzjf.B().s()) || (!paramzjf.D())) {
        zxo.a(paramzjf, localzp, bool1);
      }
    }
    int i3 = 0;
    if ((paramzjf.B().s()) || (!paramzjf.D())) {
      i3 = 1;
    }
    float f3;
    float f4;
    if ((!zbxz.a(localzp)) && (paramzjf.G().q()) && (paramzjf.G().I() != 3))
    {
      zbv.b(localzr, paramzjf.G(), localzbfd, bool1);
      f3 = paramzjf.G().j;
      f4 = paramzjf.G().k;
      if (bool1) {
        if (i3 != 0)
        {
          if (localzp.c() - ((zp)localObject1).c() < f3)
          {
            i9 = (int)(f3 - (localzp.c() - ((zp)localObject1).c()));
            localzp.a(localzp.c() + i9);
            localzp.c(localzp.e() - i9);
          }
          if (((zp)localObject1).i() - localzp.i() < f4)
          {
            i9 = (int)(f4 - (((zp)localObject1).i() - localzp.i()));
            localzp.c(localzp.e() - i9);
          }
        }
        else
        {
          if (localzp.c() - paramzjf.f < f3)
          {
            i9 = (int)(f3 - (localzp.c() - paramzjf.f));
            paramzjf.f -= i9;
            paramzjf.h += i9;
          }
          if (paramzjf.f + paramzjf.h - localzp.i() < f4)
          {
            i9 = (int)(f4 - (paramzjf.f + paramzjf.h - localzp.i()));
            paramzjf.h += i9;
          }
        }
      }
      if ((paramzjf.B().s()) || (!paramzjf.D())) {
        zxo.a(paramzjf, localzp, bool1);
      }
    }
    if ((!zbxz.a(localzp)) && (paramzjf.e().q()) && (paramzjf.e().I() != 3) && ((paramzjf.e().j > 0.0F) || (paramzjf.e().k > 0.0F)))
    {
      f3 = paramzjf.e().j;
      f4 = paramzjf.e().k;
      if (!bool1) {
        if (i3 != 0)
        {
          if (localzp.c() - ((zp)localObject1).c() < f3)
          {
            i9 = (int)(f3 - (localzp.c() - ((zp)localObject1).c()));
            localzp.a(localzp.c() + i9);
            localzp.c(localzp.e() - i9);
          }
          if (((zp)localObject1).i() - localzp.i() < f4)
          {
            i9 = (int)(f4 - (((zp)localObject1).i() - localzp.i()));
            localzp.c(localzp.e() - i9);
          }
        }
        else
        {
          if (localzp.c() - paramzjf.f < f3)
          {
            i9 = (int)(f3 - (localzp.c() - paramzjf.f));
            paramzjf.f -= i9;
            paramzjf.h += i9;
          }
          if (paramzjf.f + paramzjf.h - localzp.i() < f4)
          {
            i9 = (int)(f4 - (paramzjf.f + paramzjf.h - localzp.i()));
            paramzjf.h += i9;
          }
        }
      }
      if ((paramzjf.B().s()) || (!paramzjf.D())) {
        zxo.a(paramzjf, localzp, bool1);
      }
    }
    zo[] arrayOfzo2 = d(paramzjf);
    if (arrayOfzo2[0].e() == arrayOfzo2[1].e()) {
      zbv.a(localzr, paramzjf.K(), localzp);
    }
    int i7;
    if ((!zbxz.a(localzp)) && (paramzjf.u()))
    {
      i7 = zjs.a(localzr, paramzjf.k(), localzp);
      if (i7 > paramzjf.k().l())
      {
        paramzjf.k().a(i7);
        i9 = i7 - paramzjf.k().l();
        paramzjf.k().a.d(paramzjf.k().a.f() + i9);
        zo[] arrayOfzo4 = c(paramzjf);
        if ((paramzjf.p() <= 0) || (bool1))
        {
          if ((!paramzjf.B().s()) && (paramzjf.D()))
          {
            paramzjf.k().a.b(paramzjf.k().a.d() + i9);
            localzp.d(localzp.f() + i9);
          }
          else
          {
            localzp.d(localzp.f() - i9);
            paramzjf.k().a.b(paramzjf.k().a.d() - i9);
          }
        }
        else {
          switch (i)
          {
          case 0: 
          case 3: 
          case 4: 
          case 7: 
          case 8: 
            if ((!paramzjf.B().s()) && (paramzjf.D())) {
              localzp.d(localzp.f() + (i9 + c));
            } else {
              localzp.d(localzp.f() - (i9 + c));
            }
            paramzjf.e().j(3);
            paramzjf.e().f(2);
            paramzjf.e().h(2);
            break;
          case 1: 
          case 2: 
          case 5: 
          case 6: 
            if ((!paramzjf.B().s()) && (paramzjf.D()))
            {
              paramzjf.k().a.b(paramzjf.k().a.d() + i9);
              localzp.d(localzp.f() + i9);
            }
            else
            {
              localzp.d(localzp.f() - i9);
              paramzjf.k().a.b(paramzjf.k().a.d() - i9);
            }
            break;
          }
        }
        if ((paramzjf.B().s()) || (!paramzjf.D())) {
          zxo.a(paramzjf, localzp, bool1);
        }
      }
    }
    if (paramzjf.G().q())
    {
      i7 = ziz.a(localzr, paramzjf.G(), bool1, paramzjf.z().c(0), localzp);
      i9 = 0;
      if (bool1) {
        i9 = zbxz.a(paramzjf.S().g());
      } else {
        i9 = zbxz.a(paramzjf.S().i());
      }
      if ((bool5) && (paramzjf.G().l.size() > 3) && (i7 > i9) && (i9 != 0))
      {
        paramzjf.G().l.clear();
        paramzjf.G().i(bool5);
        paramzjf.G().j(bool6);
        paramzjf.G().h(bool7);
        paramzjf.G().g(bool8);
        ziz.a(localzr, paramzjf.G(), d2, d1, bool4, paramzjf.G().l, paramzjf.z().c(0).ai(), localzp, bool1, paramzjf.z().c(0));
      }
    }
    Object localObject8;
    if ((!paramzjf.B().s()) && (paramzjf.D()) && (paramzjf.N() != 45) && (paramzjf.N() != 48))
    {
      localObject8 = new zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
      localzp = new zp(paramzjf.B().b.c(), paramzjf.B().b.d(), paramzjf.B().b.e(), paramzjf.B().b.f());
      paramzjf.B().b = new zp(((zp)localObject8).c(), ((zp)localObject8).d(), ((zp)localObject8).e(), ((zp)localObject8).f());
    }
    if ((paramzjf.e().S().o()) && (paramzjf.e().q())) {
      a(paramzjf.e(), localzp, bool1, (zs)localObject4, (zs)localObject5, i1);
    }
    if ((paramzjf.G().S().o()) && (paramzjf.G().q())) {
      a(paramzjf.G(), localzp, bool1, (zs)localObject4, (zs)localObject5, i1);
    }
    if ((paramzjf.K().S().o()) && (paramzjf.K().q()))
    {
      localObject8 = localzs2;
      if (paramzjf.K().I() != 3) {
        ((zs)localObject8).a(((zs)localObject8).b() + m);
      }
      zo[] arrayOfzo3 = d(paramzjf);
      if (arrayOfzo3[0].e() == arrayOfzo3[1].e())
      {
        if (paramzjf.p() >= 0) {
          paramzjf.K().S().e().b.a((int)((arrayOfzo3[0].d() + arrayOfzo3[1].d()) / 2.0F - paramzjf.K().S().e().b.e() / 2));
        }
      }
      else
      {
        float f7 = arrayOfzo3[0].d() >= arrayOfzo3[1].d() ? arrayOfzo3[1].d() : arrayOfzo3[0].d();
        float f8 = arrayOfzo3[0].d() >= arrayOfzo3[1].d() ? arrayOfzo3[0].d() : arrayOfzo3[1].d();
        switch (i)
        {
        case 0: 
        case 4: 
        case 8: 
          paramzjf.K().S().e().b.a((int)(Math.abs(arrayOfzo3[0].d() + arrayOfzo3[1].d()) / 2.0F + a(paramzjf, (zs)localObject8)));
          break;
        case 3: 
        case 7: 
          paramzjf.K().S().e().b.a((int)(Math.abs(arrayOfzo3[0].d() + arrayOfzo3[1].d()) / 2.0F - paramzjf.K().S().e().b.e() - a(paramzjf, (zs)localObject8)));
        }
        paramzjf.K().S().e().b.b((int)(Math.abs(arrayOfzo3[0].e() + arrayOfzo3[1].e()) / 2.0F));
      }
    }
    if ((paramzjf.u()) && (!bool1))
    {
      localObject8 = c(paramzjf);
      if (paramzjf.p() > 0) {
        switch (i)
        {
        case 0: 
        case 3: 
        case 4: 
        case 7: 
        case 8: 
          int i10 = localObject8[0].d() < localObject8[1].d() ? 0 : 1;
          paramzjf.k().a.a((int)localObject8[i10].d());
          paramzjf.k().a.b((int)localObject8[i10].e());
          paramzjf.k().a.c((int)Math.abs(localObject8[1].d() - localObject8[0].d()));
        }
      }
    }
  }
  
  static void b(zjf paramzjf)
    throws Exception
  {
    a(paramzjf);
    zr localzr = paramzjf.ap();
    com.aspose.cells.b.a.b.a.zf localzf = null;
    zbff localzbff = paramzjf.z();
    if ((paramzjf.z().getCount() == 0) || (ziz.a(paramzjf.z().i()) == 0)) {
      return;
    }
    boolean bool1 = ziz.a(paramzjf.N());
    boolean bool2 = paramzjf.B().E();
    int i = paramzjf.z().h();
    float f1 = ziz.a(paramzjf.G(), paramzjf.S().e(), paramzjf.S().g(), bool1);
    double d = paramzjf.G().l();
    float f2 = ziz.a(paramzjf.G(), paramzjf.S().f() - paramzjf.S().i(), paramzjf.S().i(), bool1);
    float f3 = ziz.a(paramzjf.e(), paramzjf.S().f() - paramzjf.S().i(), paramzjf.S().i(), bool1, paramzjf.z());
    float f4 = ziz.a(paramzjf.e(), paramzjf.S().e(), paramzjf.S().g(), bool1, paramzjf.z());
    paramzjf.B().H();
    zp localzp = paramzjf.B().a;
    zxo.a(localzr, paramzjf, bool1);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    zbfd localzbfd = (zbfd)paramzjf.z().j().get(0);
    if (!bool2) {
      switch (paramzjf.N())
      {
      case 17: 
      case 27: 
      case 34: 
      case 56: 
        ArrayList localArrayList3 = zlr.b(localzr, paramzjf, f2, d, i);
        com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList3);
        break;
      case 18: 
      case 21: 
      case 28: 
      case 50: 
        ArrayList localArrayList4 = zlr.a(localzr, paramzjf, f2, d, i);
        com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList4);
        break;
      case 19: 
      case 22: 
      case 29: 
      case 51: 
        ArrayList localArrayList5 = zlr.a(localzr, paramzjf, d, i);
        com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList5);
        break;
      case 20: 
      case 23: 
      case 30: 
      case 52: 
        ArrayList localArrayList6 = zlr.b(localzr, paramzjf, d, i);
        com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList6);
        break;
      case 9: 
      case 24: 
      case 31: 
      case 53: 
        ArrayList localArrayList7 = zck.a(localzr, paramzjf, f1, d, i);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList7);
        break;
      case 10: 
      case 25: 
      case 32: 
      case 54: 
        ArrayList localArrayList8 = zck.a(localzr, paramzjf, d, i);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList8);
        break;
      case 11: 
      case 26: 
      case 33: 
      case 55: 
        ArrayList localArrayList9 = zck.b(localzr, paramzjf, d, i);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList9);
        break;
      case 43: 
        ArrayList localArrayList10 = zlr.c(localzr, paramzjf, f2, d, i);
        com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList10);
        break;
      case 45: 
      case 48: 
        zawf.a(localzr, paramzjf);
        break;
      case 3: 
        ArrayList localArrayList11 = zbb.a(localzr, paramzjf, f2, d, i);
        com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList11);
        break;
      case 4: 
        ArrayList localArrayList12 = zbb.a(localzr, paramzjf, f2, d, i, false);
        com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList12);
        break;
      case 5: 
        ArrayList localArrayList13 = zbb.a(localzr, paramzjf, f2, d, i, true);
        com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList13);
      }
    }
    zlr.c(localzr, paramzjf, localArrayList1);
    zck.a(localzr, paramzjf, localArrayList2);
    localzf = null;
    int j = 0;
    if ((paramzjf.i().c().k()) && (paramzjf.B().c().k()) && (paramzjf.ap().i() != 4))
    {
      localzf = paramzjf.ap().d();
      j = 1;
      paramzjf.ap().b(4, false);
    }
    if (paramzjf.G().q()) {
      if (bool1) {
        zbv.b(localzr, paramzjf.G());
      } else {
        zbv.a(localzr, paramzjf.G());
      }
    }
    if (paramzjf.e().q()) {
      if (bool1) {
        zbv.a(localzr, paramzjf.e(), i, localzp);
      } else {
        zbv.a(localzr, paramzjf.e(), i, localzp, bool1);
      }
    }
    if (paramzjf.K().q()) {
      zbv.c(localzr, paramzjf.K());
    }
    if ((paramzjf.i().c().k()) && (paramzjf.B().c().k()) && (j != 0)) {
      paramzjf.ap().a(localzf);
    }
    if ((paramzjf.G().S().o()) && (paramzjf.G().q())) {
      a(paramzjf, localzr, paramzjf.G());
    }
    if ((paramzjf.e().S().o()) && (paramzjf.e().q())) {
      a(paramzjf, localzr, paramzjf.e());
    }
    if ((paramzjf.K().S().o()) && (paramzjf.K().q())) {
      a(paramzjf, localzr, paramzjf.K());
    }
    if (paramzjf.M().o()) {
      paramzjf.M().p();
    }
    if (paramzjf.u()) {
      zjs.a(localzr, paramzjf.k(), paramzjf.k().a.c(), paramzjf.k().a.d(), paramzjf.k().a.e(), bool1, false);
    }
    if (paramzjf.v())
    {
      localzf = null;
      j = 0;
      if ((paramzjf.i().c().k()) && (paramzjf.x().c().c().k()) && (paramzjf.ap().i() != 4))
      {
        localzf = paramzjf.ap().d();
        j = 1;
        paramzjf.ap().b(4, false);
      }
      if ((paramzjf.N() == 48) || (paramzjf.N() == 45) || (paramzjf.x().b)) {
        zanb.a(localzr, paramzjf.x(), localzbfd);
      } else {
        zanb.a(localzr, paramzjf.x(), bool1, localzbfd);
      }
      if ((paramzjf.i().c().k()) && (paramzjf.x().c().c().k()) && (j != 0)) {
        paramzjf.ap().a(localzf);
      }
    }
  }
  
  private static void f(zjf paramzjf)
  {
    switch (paramzjf.N())
    {
    case 45: 
    case 48: 
      Iterator localIterator = paramzjf.z().iterator();
      while (localIterator.hasNext())
      {
        zbfd localzbfd = (zbfd)localIterator.next();
        if (localzbfd.K()) {
          localzbfd.c(true);
        }
        paramzjf.c(false);
        paramzjf.e().d(false);
        paramzjf.e().S().a("");
        paramzjf.G().d(false);
        paramzjf.G().S().a("");
        paramzjf.e().w().a(0);
        paramzjf.e().A().a(0);
        paramzjf.G().w().a(0);
        paramzjf.G().A().a(0);
      }
      if (paramzjf.p() < 1) {
        paramzjf.f(1);
      }
      if (paramzjf.p() > 90) {
        paramzjf.f(90);
      }
      break;
    }
  }
  
  static zo[] c(zjf paramzjf)
  {
    zo localzo = new zo(paramzjf.S().j(), paramzjf.S().f());
    int i = paramzjf.E() % 90;
    if (i >= 45) {
      i = 90 - i;
    }
    int j = paramzjf.E() / 45;
    float f1;
    float f2;
    switch (j)
    {
    case 0: 
    case 3: 
    case 4: 
    case 7: 
    case 8: 
      f1 = paramzjf.S().g();
      f2 = paramzjf.S().h();
      break;
    case 1: 
    case 2: 
    case 5: 
    case 6: 
    default: 
      f1 = paramzjf.S().h();
      f2 = paramzjf.S().g();
    }
    float f3 = f2 * (float)Math.sin(i * 3.141592653589793D / 180.0D);
    float f4 = f2 * (float)Math.sin(paramzjf.p() * 3.141592653589793D / 180.0D);
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
  
  static zo[] d(zjf paramzjf)
  {
    zo localzo = new zo(paramzjf.S().j(), paramzjf.S().f());
    int i = paramzjf.E() % 90;
    if (i >= 45) {
      i = 90 - i;
    }
    int j = paramzjf.E() / 45;
    float f1;
    float f2;
    switch (j)
    {
    case 0: 
    case 3: 
    case 4: 
    case 7: 
    case 8: 
      f1 = paramzjf.S().g();
      f2 = paramzjf.S().h();
      break;
    case 1: 
    case 2: 
    case 5: 
    case 6: 
    default: 
      f1 = paramzjf.S().h();
      f2 = paramzjf.S().g();
    }
    float f3 = f2 * (float)Math.sin(i * 3.141592653589793D / 180.0D);
    float f4 = f2 * (float)Math.sin(paramzjf.p() * 3.141592653589793D / 180.0D);
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
  
  static zo e(zjf paramzjf)
  {
    zo localzo1 = new zo(paramzjf.S().j(), paramzjf.S().f());
    int i = paramzjf.E() % 90;
    if (i >= 45) {
      i = 90 - i;
    }
    int j = paramzjf.E() / 45;
    float f1;
    float f2;
    switch (j)
    {
    case 0: 
    case 3: 
    case 4: 
    case 7: 
    case 8: 
      f1 = paramzjf.S().g();
      f2 = paramzjf.S().h();
      break;
    case 1: 
    case 2: 
    case 5: 
    case 6: 
    default: 
      f1 = paramzjf.S().h();
      f2 = paramzjf.S().g();
    }
    float f3 = f2 * (float)Math.sin(i * 3.141592653589793D / 180.0D);
    float f4 = f2 * (float)Math.sin(paramzjf.p() * 3.141592653589793D / 180.0D);
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
  
  private static void a(zjf paramzjf, zr paramzr, zbt paramzbt)
    throws Exception
  {
    if (paramzjf.B().E()) {
      return;
    }
    paramzbt.S().p();
  }
  
  private static int a(zjf paramzjf, zs paramzs)
  {
    int i = paramzjf.E() % 90;
    if (i >= 45) {
      i = 90 - i;
    }
    int m = paramzjf.E() / 45;
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
  
  private static void a(zr paramzr, zbt paramzbt, zp paramzp, zp[] paramArrayOfzp, boolean paramBoolean)
    throws Exception
  {
    boolean bool = paramBoolean;
    zs localzs = zs.a();
    zjf localzjf = paramzbt.e();
    if (paramzbt.g() == 1) {
      paramBoolean = !paramBoolean;
    }
    Object localObject1;
    Object localObject2;
    int i;
    if (paramBoolean)
    {
      localObject1 = new zt(paramArrayOfzp[0].e() * 0.8F, paramArrayOfzp[0].f() * 0.8F);
      localzs = paramzbt.S().a((zt)localObject1);
      paramzbt.S().e().b.a(localzs);
      localObject2 = e(localzjf);
      if (((zo)localObject2).d() < localzjf.S().j())
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
          paramzbt.S().e().b.a(paramArrayOfzp[0].i() - localzs.b());
          paramzbt.S().e().b.b(paramArrayOfzp[0].d() + (paramArrayOfzp[0].f() - localzs.c()) / 2);
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() - localzs.b());
        }
      }
      zxo.a(localzjf, paramArrayOfzp[0], paramBoolean);
    }
    else
    {
      localObject1 = c(localzjf);
      if (localzjf.p() == 0)
      {
        localObject2 = new zt(paramArrayOfzp[0].e() * 0.8F, paramArrayOfzp[0].f() * 0.7F);
        localzs = paramzbt.S().a((zt)localObject2);
        paramzbt.S().e().b.a(localzs);
        paramzbt.S().e().b.b(paramArrayOfzp[0].j() - localzs.c() - c);
        i = paramArrayOfzp[0].j() - (int)localObject1[0].e();
        if (i < localzs.c() + c) {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c - i));
        }
      }
      else if (localzjf.p() > 0)
      {
        if (localObject1[0].e() == localObject1[1].e())
        {
          localObject2 = new zt(paramArrayOfzp[0].e() * 0.8F, paramArrayOfzp[0].f() * 0.7F);
          localzs = paramzbt.S().a((zt)localObject2);
          paramzbt.S().e().b.a(localzs);
          i = 0;
          if (bool) {
            paramzbt.S().e().b.b(paramArrayOfzp[0].j() - localzs.c() - c);
          } else {
            paramzbt.S().e().b.b(paramzp.j() - localzs.c() - c * 4);
          }
          i = paramArrayOfzp[0].j() - (int)localObject1[0].e();
          if (i < localzs.c() + c) {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c - i));
          }
        }
        else
        {
          localObject2 = new zt(paramArrayOfzp[0].e() * 0.3F, paramArrayOfzp[0].f() * 0.3F);
          localzs = paramzbt.S().a((zt)localObject2);
          paramzbt.S().e().b.a(localzs);
          i = localzjf.E() / 45;
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
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c - (paramArrayOfzp[0].j() - (int)Math.abs(localObject1[0].e() + localObject1[1].e()) / 2)));
          }
        }
      }
      zxo.a(localzjf, paramArrayOfzp[0], paramBoolean);
    }
  }
  
  private static void a(zr paramzr, zbt paramzbt, zp[] paramArrayOfzp)
    throws Exception
  {
    if (zbxz.a(paramArrayOfzp[0])) {
      return;
    }
    zs localzs = zs.a();
    zjf localzjf = paramzbt.e();
    zo[] arrayOfzo = d(localzjf);
    zt localzt;
    int i;
    if (localzjf.p() == 0)
    {
      localzt = new zt(paramArrayOfzp[0].e() * 0.8F, paramArrayOfzp[0].f() * 0.7F);
      localzs = paramzbt.S().a(localzt);
      paramzbt.S().e().b.a(localzs);
      paramzbt.S().e().b.b(paramArrayOfzp[0].j() - localzs.c() - c);
      if ((!localzjf.B().s()) && (localzjf.D()))
      {
        i = paramArrayOfzp[0].j() - (int)arrayOfzo[0].e();
        if (i < localzs.c() + c) {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() + localzs.c() + c - i);
        }
      }
      else
      {
        i = paramArrayOfzp[0].j() - (int)arrayOfzo[0].e();
        if (i < localzs.c() + c) {
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c - i));
        }
      }
    }
    if (localzjf.p() > 0)
    {
      if (arrayOfzo[0].e() == arrayOfzo[1].e())
      {
        localzt = new zt(paramArrayOfzp[0].e() * 0.8F, paramArrayOfzp[0].f() * 0.7F);
        localzs = paramzbt.S().a(localzt);
        paramzbt.S().e().b.a(localzs);
        i = 0;
        paramzbt.S().e().b.b(paramArrayOfzp[0].j() - localzs.c() - c);
        if ((!localzjf.B().s()) && (localzjf.D()))
        {
          i = paramArrayOfzp[0].j() - (int)arrayOfzo[0].e();
          if (i < localzs.c() + c) {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() + localzs.c() + c - i);
          }
        }
        else
        {
          i = paramArrayOfzp[0].j() - (int)arrayOfzo[0].e();
          if (i < localzs.c() + c) {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c - i));
          }
        }
      }
      else
      {
        localzt = new zt(paramArrayOfzp[0].e() * 0.3F, paramArrayOfzp[0].f() * 0.3F);
        localzs = paramzbt.S().a(localzt);
        paramzbt.S().e().b.a(localzs);
        i = localzjf.E() / 45;
        int j;
        switch (i)
        {
        case 0: 
        case 4: 
        case 8: 
          if (paramArrayOfzp[0].i() - (int)Math.abs(arrayOfzo[0].d() + arrayOfzo[1].d()) / 2 < localzs.b())
          {
            j = localzs.b() - (paramArrayOfzp[0].i() - (int)Math.abs(arrayOfzo[0].d() + arrayOfzo[1].d()) / 2);
            if ((!localzjf.B().s()) && (localzjf.D())) {
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() + j);
            } else {
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() - j);
            }
          }
          break;
        case 3: 
        case 7: 
          if ((int)Math.abs(arrayOfzo[0].d() + arrayOfzo[1].d()) / 2 - paramArrayOfzp[0].c() < localzs.b())
          {
            j = localzs.b() - ((int)Math.abs(arrayOfzo[0].d() + arrayOfzo[1].d()) / 2 - paramArrayOfzp[0].c());
            if ((!localzjf.B().s()) && (localzjf.D()))
            {
              paramArrayOfzp[0].a(paramArrayOfzp[0].c() - j);
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() + j);
            }
            else
            {
              paramArrayOfzp[0].a(paramArrayOfzp[0].c() + j);
              paramArrayOfzp[0].c(paramArrayOfzp[0].e() - j);
            }
          }
          break;
        }
        if (paramArrayOfzp[0].j() - (int)Math.abs(arrayOfzo[0].e() + arrayOfzo[1].e()) / 2 < localzs.c()) {
          if ((!localzjf.B().s()) && (localzjf.D())) {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() + (localzs.c() + c) - (paramArrayOfzp[0].j() - (int)Math.abs(arrayOfzo[0].e() + arrayOfzo[1].e()) / 2));
          } else {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + c - (paramArrayOfzp[0].j() - (int)Math.abs(arrayOfzo[0].e() + arrayOfzo[1].e()) / 2)));
          }
        }
      }
      if ((localzjf.B().s()) || (!localzjf.D())) {
        zxo.a(localzjf, paramArrayOfzp[0], false);
      }
    }
    else
    {
      paramzbt.S().a("");
    }
  }
  
  private static void a(zbt paramzbt, zp paramzp, boolean paramBoolean, zs paramzs1, zs paramzs2, int paramInt)
  {
    boolean bool = paramBoolean;
    zs localzs = zs.a();
    zjf localzjf = paramzbt.e();
    if (paramzbt.g() == 1)
    {
      localzs = paramzs1;
      bool = !paramBoolean;
    }
    else
    {
      localzs = paramzs2;
      if (paramzbt.I() != 3) {
        localzs.a(localzs.b() + paramInt);
      }
    }
    Object localObject;
    if (bool)
    {
      localObject = paramzbt.S().e().b.b();
      zo localzo = e(localzjf);
      if (localzo.d() < localzjf.S().j())
      {
        paramzbt.S().e().b.a(paramzbt.I() == 3 ? (int)(localzo.d() - ((zs)localObject).b()) : (int)(localzo.d() - localzs.b() - ((zs)localObject).b()));
        paramzbt.S().e().b.b((int)(localzo.e() - localzjf.S().i() / 2.0F - ((zs)localObject).c() / 2));
      }
      else
      {
        int i = (int)(paramzp.i() - localzo.d());
        if (i >= ((zs)localObject).b())
        {
          paramzbt.S().e().b.a(paramzbt.I() == 3 ? (int)localzo.d() : (int)(localzo.d() + localzs.b()));
          paramzbt.S().e().b.b((int)(localzo.e() - localzjf.S().i() / 2.0F - ((zs)localObject).c() / 2));
        }
      }
    }
    else
    {
      localObject = c(localzjf);
      if (localObject[0].e() == localObject[1].e())
      {
        if (localzjf.p() >= 0) {
          paramzbt.S().e().b.a((int)((localObject[0].d() + localObject[1].d()) / 2.0F - paramzbt.S().e().b.e() / 2));
        }
      }
      else
      {
        float f1 = localObject[0].d() >= localObject[1].d() ? localObject[1].d() : localObject[0].d();
        float f2 = localObject[0].d() >= localObject[1].d() ? localObject[0].d() : localObject[1].d();
        if (((localzjf.E() >= 45) && (localzjf.E() < 90)) || ((localzjf.E() >= 225) && (localzjf.E() < 270))) {
          paramzbt.S().e().b.a((int)(Math.abs(localObject[0].d() + localObject[1].d()) / 2.0F - paramzbt.S().e().b.e() - a(localzjf, localzs)));
        } else {
          paramzbt.S().e().b.a((int)(Math.abs(localObject[0].d() + localObject[1].d()) / 2.0F + a(localzjf, localzs)));
        }
        paramzbt.S().e().b.b((int)(Math.abs(localObject[0].e() + localObject[1].e()) / 2.0F));
      }
    }
  }
  
  private static void g(zjf paramzjf)
  {
    zbt localzbt = paramzjf.K();
    ArrayList localArrayList1 = paramzjf.K().l;
    ArrayList localArrayList2 = paramzjf.z().j();
    for (int i = 0; i < localArrayList2.size(); i++)
    {
      zbfd localzbfd = (zbfd)localArrayList2.get(i);
      com.aspose.cells.b.a.a.zf.a(localArrayList1, localzbfd.C());
    }
    localzbt.f(0.0D);
    localzbt.d(localArrayList2.size());
    localzbt.c(localzbt.Q());
    localzbt.e(localzbt.x() / 2.0D);
  }
  
  private static void h(zjf paramzjf)
  {
    if ((paramzjf.N() == 4) || (paramzjf.N() == 5)) {
      paramzjf.e(20);
    }
  }
  
  private static boolean a(zjf paramzjf, zp[] paramArrayOfzp, zp paramzp, zbff paramzbff, boolean paramBoolean1, boolean paramBoolean2, int paramInt, boolean paramBoolean3)
    throws Exception
  {
    zs localzs = zbv.a(paramzjf.ap(), paramzjf.G(), paramzbff.c(0), paramBoolean1);
    if ((!zbxz.a(paramArrayOfzp[0])) && (paramzjf.G().I() != 3) && (paramzjf.G().q()))
    {
      ziz.a(paramzjf.G(), paramzjf.e(), paramzbff, paramzjf);
      Object localObject;
      int i;
      if (!paramBoolean1)
      {
        localObject = e(paramzjf);
        if (((zo)localObject).d() < paramzjf.S().j())
        {
          i = (int)(((zo)localObject).d() - paramArrayOfzp[0].c());
          if (!paramBoolean2) {
            i -= paramzjf.G().S().e().b.b().b();
          }
          int j = localzs.b();
          if (paramzjf.u()) {
            j -= paramzjf.k().k().b();
          }
          if ((i < j) && (!paramzjf.B().s()) && (paramzjf.D()))
          {
            paramArrayOfzp[0].a(paramArrayOfzp[0].c() - j);
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() + j);
            if (paramArrayOfzp[0].c() < 0)
            {
              paramArrayOfzp[0].a(0);
              paramArrayOfzp[0].c(paramzp.e() + paramzp.c());
              return true;
            }
            if (!paramBoolean3) {
              paramArrayOfzp[0] = paramzp;
            }
          }
        }
        else
        {
          i = (int)(paramArrayOfzp[0].i() - ((zo)localObject).d());
          if ((i < localzs.b()) && (!paramzjf.B().s()) && (paramzjf.D()))
          {
            paramArrayOfzp[0].c(paramArrayOfzp[0].e() + localzs.b());
            if (paramArrayOfzp[0].i() > paramzjf.a())
            {
              paramArrayOfzp[0].c(paramzjf.a() - paramArrayOfzp[0].c());
              return true;
            }
            if (!paramBoolean3) {
              paramArrayOfzp[0] = paramzp;
            }
          }
        }
        if (paramzjf.p() >= 0)
        {
          switch (paramInt)
          {
          case 1: 
          case 2: 
          case 5: 
          case 6: 
            if ((paramArrayOfzp[0].j() - ((zo)localObject).e() < localzs.c() / 2) && (!paramzjf.B().s()) && (paramzjf.D()))
            {
              paramArrayOfzp[0].d(paramArrayOfzp[0].f() + localzs.c() / 2);
              if (paramArrayOfzp[0].j() > paramzjf.b())
              {
                paramArrayOfzp[0].d(paramzjf.b() - paramArrayOfzp[0].d());
                return true;
              }
              if (!paramBoolean3) {
                paramArrayOfzp[0] = paramzp;
              }
            }
            break;
          }
        }
        else
        {
          if ((((zo)localObject).e() - paramzjf.S().i() - paramArrayOfzp[0].d() < localzs.c() / 2) && (!paramzjf.B().s()) && (paramzjf.D()))
          {
            paramArrayOfzp[0].b(paramArrayOfzp[0].d() - localzs.c() / 2);
            if (paramArrayOfzp[0].d() < 0)
            {
              paramArrayOfzp[0].b(0);
              paramArrayOfzp[0].d(paramzp.f() + paramzp.d());
              return true;
            }
            if (!paramBoolean3) {
              paramArrayOfzp[0] = paramzp;
            }
          }
          if ((!paramzjf.B().s()) && (paramzjf.D()))
          {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() + localzs.c() / 2);
            if (paramArrayOfzp[0].j() > paramzjf.b())
            {
              paramArrayOfzp[0].d(paramzjf.b() - paramArrayOfzp[0].d());
              return true;
            }
            if (!paramBoolean3) {
              paramArrayOfzp[0] = paramzp;
            }
          }
        }
      }
      else
      {
        localObject = c(paramzjf);
        i = localzs.c();
        if (paramzjf.G().m == 1)
        {
          if ((paramArrayOfzp[0].j() - (int)localObject[0].e() < i) && (!paramzjf.B().s()) && (paramzjf.D()))
          {
            paramArrayOfzp[0].d(paramArrayOfzp[0].f() + (i - (paramArrayOfzp[0].j() - (int)localObject[0].e())));
            if (paramArrayOfzp[0].j() > paramzjf.b())
            {
              paramArrayOfzp[0].d(paramzjf.b() - paramArrayOfzp[0].d());
              return true;
            }
            if (!paramBoolean3) {
              paramArrayOfzp[0] = paramzp;
            }
          }
        }
        else if (paramzjf.G().m == 2)
        {
          float f = paramzjf.S().i();
          if ((int)(localObject[2].e() - f) - paramArrayOfzp[0].h() < i)
          {
            int k = i - ((int)(localObject[2].e() - f) - paramArrayOfzp[0].h());
            if ((!paramzjf.B().s()) && (paramzjf.D()))
            {
              paramArrayOfzp[0].b(paramArrayOfzp[0].d() - k);
              paramArrayOfzp[0].d(paramArrayOfzp[0].f() + k);
              if (paramArrayOfzp[0].d() < 0)
              {
                paramArrayOfzp[0].b(0);
                paramArrayOfzp[0].d(paramzp.f() + paramzp.d());
                return true;
              }
              if (!paramBoolean3) {
                paramArrayOfzp[0] = paramzp;
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  private static boolean a(zjf paramzjf, zp[] paramArrayOfzp, zp paramzp, zbff paramzbff, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, boolean paramBoolean3, zs paramzs, int paramInt3)
    throws Exception
  {
    if ((paramzjf.e().I() != 3) && (paramzjf.e().q()))
    {
      zs localzs1 = new zs(0, 0);
      if (paramzjf.e().S().o()) {
        localzs1 = paramzjf.e().S().e().b.b();
      }
      Object localObject;
      int i;
      if (!paramBoolean1)
      {
        localObject = c(paramzjf);
        i = 0;
        if (localObject[0].e() < localObject[1].e()) {
          i = 1;
        }
        float f1 = Math.abs((localObject[1].e() - localObject[0].e()) / paramInt2);
        int k = paramzs.c() + paramInt3;
        if (paramzjf.p() >= 0) {
          if (localObject[0].e() == localObject[1].e())
          {
            if ((paramArrayOfzp[0].j() - localzs1.c() - (int)localObject[0].e() < k) && (!paramzjf.B().s()) && (paramzjf.D()))
            {
              paramArrayOfzp[0].d(paramArrayOfzp[0].f() + (k - (paramArrayOfzp[0].j() - localzs1.c() - (int)localObject[0].e())));
              if (paramArrayOfzp[0].j() > paramzjf.b())
              {
                paramArrayOfzp[0].d(paramzjf.b() - paramArrayOfzp[0].d());
                return true;
              }
              if (!paramBoolean3) {
                paramArrayOfzp[0] = paramzp;
              }
            }
          }
          else
          {
            zs localzs2 = paramzs;
            if (paramzjf.e().I() != 3) {
              localzs2.a(localzs2.b() + paramInt3);
            }
            int m = localzs1.b() + a(paramzjf, localzs2);
            int n;
            switch (paramInt1)
            {
            case 2: 
            case 6: 
              if (paramArrayOfzp[0].i() - (int)Math.abs(localObject[0].d() + localObject[1].d()) / 2 < m)
              {
                n = m - (paramArrayOfzp[0].i() - (int)Math.abs(localObject[0].d() + localObject[1].d()) / 2);
                if ((!paramzjf.B().s()) && (paramzjf.D()))
                {
                  paramArrayOfzp[0].c(paramArrayOfzp[0].e() + n);
                  if (paramArrayOfzp[0].i() > paramzjf.a())
                  {
                    paramArrayOfzp[0].c(paramzjf.a() - paramArrayOfzp[0].c());
                    return true;
                  }
                  if (!paramBoolean3) {
                    paramArrayOfzp[0] = paramzp;
                  }
                }
              }
              break;
            case 1: 
            case 5: 
              if ((int)Math.abs(localObject[0].d() + localObject[1].d()) / 2 - paramArrayOfzp[0].c() < m)
              {
                n = m - ((int)Math.abs(localObject[0].d() + localObject[1].d()) / 2 - paramArrayOfzp[0].c());
                if ((!paramzjf.B().s()) && (paramzjf.D()))
                {
                  paramArrayOfzp[0].a(paramArrayOfzp[0].c() - n);
                  paramArrayOfzp[0].c(paramArrayOfzp[0].e() + n);
                  if (paramArrayOfzp[0].c() < 0)
                  {
                    paramArrayOfzp[0].a(0);
                    paramArrayOfzp[0].c(paramzp.e() + paramzp.c());
                    return true;
                  }
                  if (!paramBoolean3) {
                    paramArrayOfzp[0] = paramzp;
                  }
                }
              }
              break;
            }
            float f2 = f1 * (float)Math.sin(paramzjf.p() * 3.141592653589793D / 180.0D);
            if (((int)(paramArrayOfzp[0].j() - localObject[i].e() + f2) < paramzs.c()) && (!paramzjf.B().s()) && (paramzjf.D()))
            {
              paramArrayOfzp[0].d(paramArrayOfzp[0].f() + (paramzs.c() - (int)(paramArrayOfzp[0].j() - localObject[i].e() + f2)));
              if (paramArrayOfzp[0].j() > paramzjf.b())
              {
                paramArrayOfzp[0].d(paramzjf.b() - paramArrayOfzp[0].d());
                return true;
              }
              if (!paramBoolean3) {
                paramArrayOfzp[0] = paramzp;
              }
            }
          }
        }
      }
      else
      {
        localObject = e(paramzjf);
        i = paramzs.b() + paramInt3;
        int j = (int)(((zo)localObject).d() - paramArrayOfzp[0].c());
        if ((j < i) && (!paramzjf.B().s()) && (paramzjf.D()))
        {
          paramArrayOfzp[0].a(paramArrayOfzp[0].c() - i);
          paramArrayOfzp[0].c(paramArrayOfzp[0].e() + i);
          if (paramArrayOfzp[0].c() < 0)
          {
            paramArrayOfzp[0].a(0);
            paramArrayOfzp[0].c(paramzp.e() + paramzp.c());
            a(paramzjf, paramArrayOfzp, paramzp, paramzbff, paramBoolean1, paramBoolean2, paramInt1, true);
            return true;
          }
          if (!paramBoolean3) {
            paramArrayOfzp[0] = paramzp;
          }
        }
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */