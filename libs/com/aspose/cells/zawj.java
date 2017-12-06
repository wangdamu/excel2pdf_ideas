package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zawj
{
  private static float a = 0.05F;
  private static float b = 0.6F;
  
  static void a(zr paramzr, zp paramzp, zbfc paramzbfc)
    throws Exception
  {
    zje localzje = paramzbfc.v();
    List localList = localzje.z().a(paramzbfc.af(), new int[] { paramzbfc.m() });
    int i = localzje.z().a(paramzbfc, paramzbfc.af(), new int[] { paramzbfc.m() });
    if (i == 0)
    {
      zp[] arrayOfzp;
      switch (paramzbfc.m())
      {
      case 44: 
        a(paramzbfc.D());
        arrayOfzp = new zp[] { paramzp };
        a(paramzr, localzje, arrayOfzp, paramzbfc);
        paramzp = arrayOfzp[0];
        localzje.B().b = new zp(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
        zjz.a(paramzr, localzje.B());
        b(paramzr, localzje, paramzp, paramzbfc);
        break;
      case 47: 
        a(paramzbfc.D());
        arrayOfzp = new zp[] { paramzp };
        a(paramzr, localzje, arrayOfzp, paramzbfc);
        paramzp = arrayOfzp[0];
        localzje.B().b = new zp(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
        zjz.a(paramzr, localzje.B());
        c(paramzr, localzje, paramzp, paramzbfc);
        break;
      case 46: 
        d(paramzr, localzje, paramzp, paramzbfc);
        break;
      case 49: 
        e(paramzr, localzje, paramzp, paramzbfc);
        break;
      case 35: 
        a(paramzr, localzje, paramzp, localList);
        break;
      case 36: 
        b(paramzr, localzje, paramzp, localList);
      }
    }
  }
  
  static void a(zje paramzje, zp[] paramArrayOfzp, zbfc paramzbfc)
  {
    if ((paramArrayOfzp[0].e() <= 0) || (paramArrayOfzp[0].f() <= 0) || (!paramzbfc.as())) {
      return;
    }
    if (paramzje.B().s())
    {
      int i = 9;
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + i);
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + i);
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - 2 * i);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 2 * i);
      int j = 0;
      int k = paramArrayOfzp[0].e();
      if (paramArrayOfzp[0].e() > paramArrayOfzp[0].f()) {
        k = paramArrayOfzp[0].f();
      }
      if (k < 80) {
        j = -zbxz.b((80 - k) / 100.0F * 6.0F);
      } else if (k < 200) {
        j = zbxz.a((k - 80) / 100.0F * 7.0F);
      } else {
        j = zbxz.b((k - 80) / 100.0F * 7.0F);
      }
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + j);
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + j);
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - 2 * j);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 2 * j);
      int m = 10;
      if (paramArrayOfzp[0].e() < m) {
        paramArrayOfzp[0].c(m);
      }
      if (paramArrayOfzp[0].f() < m) {
        paramArrayOfzp[0].d(m);
      }
    }
  }
  
  private static void b(zr paramzr, zje paramzje, zp paramzp, zbfc paramzbfc)
    throws Exception
  {
    int i = paramzbfc.ai();
    double d1 = 0.0D;
    zkg localzkg = paramzbfc.D();
    for (int j = 0; j < localzkg.getCount(); j++) {
      d1 += Math.abs(localzkg.a(j).w());
    }
    double d2 = paramzbfc.U() - 90.0F;
    double d3 = 0.0D;
    double d4 = 90 - paramzbfc.U();
    ze localze = new ze();
    ArrayList localArrayList = new ArrayList();
    double d5 = paramzp.e() / 2.0D / (1.0F + paramzbfc.ay() / 100.0F);
    double d6 = paramzp.c() + paramzp.e() / 2.0D;
    double d7 = paramzp.d() + paramzp.f() / 2.0D;
    zq localzq1 = new zq((float)(d6 - d5), (float)(d7 - d5), (float)(2.0D * d5), (float)(2.0D * d5));
    Object localObject4;
    for (int k = 0; k < localzkg.getCount(); k++)
    {
      localObject2 = localzkg.b(k);
      d3 = a(localzkg.a(k).w(), d1);
      localObject3 = new ze();
      ((ze)localObject3).b(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i(), (float)d2, (float)(d3 == 0.0D ? 0.01D : d3));
      zq localzq2 = a(localzq1, (float)d2, (float)(d3 == 0.0D ? 0.01D : d3));
      zc localzc = zbd.a(((zke)localObject2).i(), localzq2);
      try
      {
        localObject4 = paramzr.d();
        localObject5 = new zo((float)d6, (float)d7);
        if (((zke)localObject2).F() > 0.0F)
        {
          localObject5 = a((zke)localObject2, localzq1, d2, (float)(d3 == 0.0D ? 0.01D : d3), d4);
          paramzr.a(localzc, (ze)localObject3);
          localze.a((ze)localObject3, false);
          com.aspose.cells.b.a.a.zf.a(localArrayList, localObject3);
          paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject4);
        }
        else
        {
          paramzr.a(localzc, (ze)localObject3);
          localze.a((ze)localObject3, false);
          com.aspose.cells.b.a.a.zf.a(localArrayList, localObject3);
        }
        ((zke)localObject2).a(new zq(((zo)localObject5).d(), ((zo)localObject5).e(), (float)d5, (float)d5));
        ((zke)localObject2).b((float)d2);
        ((zke)localObject2).c((float)(d2 + d3));
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
      d2 += d3;
      d4 -= d3;
    }
    d2 = paramzbfc.U() - 90.0F;
    d3 = 0.0D;
    Object localObject1 = zo.a();
    Object localObject2 = zo.a();
    Object localObject3 = new zo((float)d6, (float)d7);
    d4 = 90 - paramzbfc.U();
    int m = 0;
    Object localObject7;
    for (int n = 0; n < localzkg.getCount(); n++)
    {
      localObject4 = localzkg.b(n);
      localObject5 = null;
      com.aspose.cells.a.d.zs localzs = zanv.a(((zke)localObject4).k());
      try
      {
        d3 = a(localzkg.a(n).w(), d1);
        if (n == 0) {
          localObject1 = a(d6, d7, d4, d5);
        }
        localObject2 = a(d6, d7, d4 - d3, d5);
        if (((zke)localObject4).F() > 0.0F)
        {
          localObject5 = paramzr.d();
          a((zke)localObject4, localzq1, d2, (float)(d3 == 0.0D ? 0.01D : d3), d4);
        }
        if ((d3 == 0.0D) && (((zke)localObject4).k().e()))
        {
          paramzr.b(localzs, ((zo)localObject3).d(), ((zo)localObject3).e(), ((zo)localObject2).d(), ((zo)localObject2).e());
        }
        else if (((zke)localObject4).k().e())
        {
          localObject7 = new ze();
          if (d3 == 360.0D)
          {
            ((ze)localObject7).a(localzq1, (float)d2, (float)d3);
          }
          else
          {
            ((ze)localObject7).a((zo)localObject3, (zo)localObject1);
            ((ze)localObject7).a(localzq1, (float)d2, (float)d3);
            ((ze)localObject7).a((zo)localObject2, (zo)localObject3);
          }
          paramzr.a(localzs, (ze)localObject7);
        }
      }
      finally
      {
        if (localzs != null) {
          localzs.s();
        }
      }
      if ((m == 0) && (((zke)localObject4).k().f()) && (((zke)localObject4).F() <= 0.0F))
      {
        paramzr.a(new zu(((zke)localObject4).k().a()), ((zo)localObject3).d() - 0.5F, ((zo)localObject3).e() - 0.5F, 1.0F, 1.0F, 0.0F, 360.0F);
        m = 1;
      }
      if (((zke)localObject4).F() > 0.0F) {
        paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject5);
      }
      d2 += d3;
      d4 -= d3;
      localObject1 = localObject2;
    }
    d2 = 90.0F - paramzbfc.U();
    d3 = 0.0D;
    zo[] arrayOfzo = new zo[localzkg.getCount()];
    zbxz.a(arrayOfzo);
    float f = (float)(d5 * a);
    Object localObject5 = zn.a(localze);
    for (int i1 = 0; i1 < localzkg.getCount(); i1++)
    {
      localObject7 = localzkg.b(i1);
      zqx localzqx = ((zke)localObject7).o();
      if (localzqx.c())
      {
        double d8 = d1 == 0.0D ? 0.0D : Math.abs(localzkg.a(i1).w()) / d1;
        d3 = a(localzkg.a(i1).w(), d1);
        double d9 = (d2 - d3 / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
        double d10 = ((zke)localObject7).F() / 100.0F;
        double d11 = (1.0D + d10) * d5 * Math.cos(d9);
        double d12 = (1.0D + d10) * d5 * Math.sin(d9);
        localzqx.d = new zo((float)(d6 + d11), (float)(d7 - d12));
        zq localzq3 = localzqx.b;
        a(paramzr, paramzje, i, i1, d8, localzq3, 0.0D);
        if ((paramzbfc.Q()) && (!localzqx.e.b()) && (!localzqx.f.b())) {
          a(paramzr, (zq)localObject5, localArrayList, paramzbfc.R(), localzq3, localzqx.d, f);
        }
        d2 -= d3;
      }
    }
  }
  
  private static void a(zr paramzr, zq paramzq1, ArrayList paramArrayList, zanq paramzanq, zq paramzq2, zo paramzo, float paramFloat)
  {
    zo localzo1 = new zo(paramzq1.f() + paramzq1.h() / 2.0F, paramzq1.g() + paramzq1.i() / 2.0F);
    zo localzo2 = paramzo;
    if (paramzo.d() < localzo1.d()) {
      localzo2.a(localzo2.d() - 1.0F);
    } else {
      localzo2.a(localzo2.d() + 1.0F);
    }
    if (paramzo.e() < localzo1.e()) {
      localzo2.b(localzo2.e() - 1.0F);
    } else {
      localzo2.b(localzo2.e() + 1.0F);
    }
    zo localzo3 = new zo(paramzq2.j(), paramzq2.k() + paramzq2.i() / 2.0F);
    zo localzo4 = new zo(paramzq2.j() + paramzq2.h() / 2.0F, paramzq2.k());
    zo localzo5 = new zo(paramzq2.l(), paramzq2.k() + paramzq2.i() / 2.0F);
    zo localzo6 = new zo(paramzq2.j() + paramzq2.h() / 2.0F, paramzq2.m());
    int i = a(paramzo, paramzq2);
    com.aspose.cells.a.d.zs localzs = zanv.a(paramzanq);
    try
    {
      ze localze1 = new ze();
      zo localzo7 = zo.a();
      ze localze2;
      switch (i)
      {
      case 1: 
        localzo7 = new zo(localzo5.d() + paramFloat, localzo5.e());
        localze1.a(localzo5, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.d() <= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo5, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        break;
      case 2: 
        localzo7 = new zo(localzo5.d() + paramFloat, localzo5.e());
        localze1.a(localzo5, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.d() <= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo5, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else
        {
          localze1 = new ze();
          localzo7 = new zo(localzo6.d(), localzo6.e() + paramFloat);
          localze1.a(localzo6, localzo7);
          localze1.a(localzo7, localzo2);
          localze1.a(localzs.r());
          if ((a(paramzr, localze1, paramArrayList)) && (localzo7.e() <= paramzo.e()))
          {
            localze2 = new ze();
            localze2.a(localzo6, localzo7);
            localze2.a(localzo7, paramzo);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
        break;
      case 3: 
        localze1 = new ze();
        localzo7 = new zo(localzo6.d(), localzo6.e() + paramFloat);
        localze1.a(localzo6, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.e() <= paramzo.e()))
        {
          localze2 = new ze();
          localze2.a(localzo6, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        break;
      case 4: 
        localze1 = new ze();
        localzo7 = new zo(localzo3.d() - paramFloat, localzo3.e());
        localze1.a(localzo3, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.d() >= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo3, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else
        {
          localze1 = new ze();
          localzo7 = new zo(localzo6.d(), localzo6.e() + paramFloat);
          localze1.a(localzo6, localzo7);
          localze1.a(localzo7, localzo2);
          localze1.a(localzs.r());
          if ((a(paramzr, localze1, paramArrayList)) && (localzo7.e() <= paramzo.e()))
          {
            localze2 = new ze();
            localze2.a(localzo6, localzo7);
            localze2.a(localzo7, paramzo);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
        break;
      case 5: 
        localze1 = new ze();
        localzo7 = new zo(localzo3.d() - paramFloat, localzo3.e());
        localze1.a(localzo3, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.d() >= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo3, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        break;
      case 6: 
        localze1 = new ze();
        localzo7 = new zo(localzo3.d() - paramFloat, localzo3.e());
        localze1.a(localzo3, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.d() >= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo3, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else
        {
          localze1 = new ze();
          localzo7 = new zo(localzo4.d(), localzo4.e() - paramFloat);
          localze1.a(localzo4, localzo7);
          localze1.a(localzo7, localzo2);
          localze1.a(localzs.r());
          if ((a(paramzr, localze1, paramArrayList)) && (localzo7.e() >= paramzo.e()))
          {
            localze2 = new ze();
            localze2.a(localzo4, localzo7);
            localze2.a(localzo7, paramzo);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
        break;
      case 7: 
        localze1 = new ze();
        localzo7 = new zo(localzo4.d(), localzo4.e() - paramFloat);
        localze1.a(localzo4, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.e() >= paramzo.e()))
        {
          localze2 = new ze();
          localze2.a(localzo4, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        break;
      case 8: 
        localze1 = new ze();
        localzo7 = new zo(localzo5.d() + paramFloat, localzo5.e());
        localze1.a(localzo5, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.d() <= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo5, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else
        {
          localze1 = new ze();
          localzo7 = new zo(localzo4.d(), localzo4.e() - paramFloat);
          localze1.a(localzo4, localzo7);
          localze1.a(localzo7, localzo2);
          localze1.a(localzs.r());
          if ((a(paramzr, localze1, paramArrayList)) && (localzo7.e() >= paramzo.e()))
          {
            localze2 = new ze();
            localze2.a(localzo4, localzo7);
            localze2.a(localzo7, paramzo);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
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
  
  private static boolean a(zr paramzr, ze paramze, ArrayList paramArrayList)
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      ze localze = (ze)paramArrayList.get(i);
      com.aspose.cells.b.a.b.zr localzr = new com.aspose.cells.b.a.b.zr(paramze);
      try
      {
        localzr.a(localze);
        if (!paramzr.a().b(localzr))
        {
          boolean bool = false;
          return bool;
        }
      }
      finally
      {
        if (localzr != null) {
          localzr.b();
        }
      }
    }
    return true;
  }
  
  private static int a(zo paramzo, zq paramzq)
  {
    int i = 0;
    if (paramzq.l() < paramzo.d())
    {
      if (paramzq.m() < paramzo.e()) {
        i = 2;
      } else if (paramzq.k() > paramzo.e()) {
        i = 8;
      } else {
        i = 1;
      }
    }
    else if (paramzq.j() > paramzo.d())
    {
      if (paramzq.m() < paramzo.e()) {
        i = 4;
      } else if (paramzq.k() > paramzo.e()) {
        i = 6;
      } else {
        i = 5;
      }
    }
    else if (paramzq.m() < paramzo.e()) {
      i = 3;
    } else if (paramzq.k() > paramzo.e()) {
      i = 7;
    } else {
      i = 0;
    }
    return i;
  }
  
  private static zo a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    double d1 = paramDouble3 * 3.141592653589793D / 180.0D % 6.283185307179586D;
    double d2 = paramDouble4 * Math.cos(d1);
    double d3 = paramDouble4 * Math.sin(d1);
    d2 = paramDouble1 + d2;
    d3 = paramDouble2 - d3;
    return new zo((float)d2, (float)d3);
  }
  
  private static boolean a(zq paramzq, zp paramzp)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    return a(paramzq, localzq);
  }
  
  private static boolean a(zq paramzq1, zq paramzq2)
  {
    return (paramzq1.j() >= paramzq2.j()) && (paramzq1.l() <= paramzq2.l()) && (paramzq1.k() >= paramzq2.k()) && (paramzq1.m() <= paramzq2.m());
  }
  
  private static zo a(zke paramzke, zq paramzq, double paramDouble1, double paramDouble2, double paramDouble3)
    throws Exception
  {
    zje localzje = paramzke.h();
    zr localzr = localzje.ar();
    zp localzp = new zp(0, 0, localzje.a(), localzje.b());
    float f1 = paramzke.F();
    double d1 = paramzq.f() + paramzq.h() / 2.0D;
    double d2 = paramzq.g() + paramzq.i() / 2.0D;
    double d3 = paramzq.h() / 2.0D;
    double d4 = d3 * f1 / 100.0D;
    zo localzo = a(d1, d2, paramDouble3 - paramDouble2 / 2.0D, d4);
    zq localzq1 = new zq((float)(localzo.d() - d3), (float)(localzo.e() - d3), paramzq.h(), paramzq.i());
    zq localzq2 = a(localzq1, paramDouble1, paramDouble2);
    if (f1 > 0.0F) {
      while ((!a(localzq2, localzp)) && (f1 > 0.0F))
      {
        f1 -= 1.0F;
        d4 = d3 * f1 / 100.0D;
        localzo = a(d1, d2, paramDouble3 - paramDouble2 / 2.0D, d4);
        localzq1 = new zq((float)(localzo.d() - d3), (float)(localzo.e() - d3), paramzq.h(), paramzq.i());
        localzq2 = a(localzq1, paramDouble1, paramDouble2);
      }
    }
    while ((!a(localzq2, localzp)) && (f1 < 0.0F))
    {
      f1 += 1.0F;
      d4 = d3 * f1 / 100.0D;
      localzo = a(d1, d2, paramDouble3 - paramDouble2 / 2.0D, d4);
      localzq1 = new zq((float)(localzo.d() - d3), (float)(localzo.e() - d3), paramzq.h(), paramzq.i());
      localzq2 = a(localzq1, paramDouble1, paramDouble2);
    }
    zi localzi = new zi();
    float f2 = (float)(localzo.d() - d1);
    float f3 = (float)(localzo.e() - d2);
    f2 = zbxz.a(f2);
    f3 = zbxz.a(f3);
    localzi.b(f2, f3);
    localzr.a(localzi);
    return localzo;
  }
  
  private static void c(zr paramzr, zje paramzje, zp paramzp, zbfc paramzbfc)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    int i = paramzbfc.ai();
    double d1 = 0.0D;
    zkg localzkg = paramzbfc.D();
    for (int j = 0; j < localzkg.getCount(); j++) {
      d1 += Math.abs(localzkg.a(j).w());
    }
    double d2 = paramzp.c() + paramzp.e() / 2.0D;
    double d3 = paramzp.d() + paramzp.f() / 2.0D;
    double d4 = paramzbfc.U() - 90.0F;
    double d5 = 0.0D;
    double d6 = 90.0F - paramzbfc.U();
    ze localze1 = new ze();
    ArrayList localArrayList = new ArrayList();
    double d7 = paramzp.e() / 2.0D / (1.0F + paramzbfc.ay() / 100.0F);
    for (int k = 0; k < localzkg.getCount(); k++)
    {
      zqx localzqx1 = localzkg.b(k).o();
      d5 = a(localzkg.a(k).w(), d1);
      double d8 = (d6 - d5 / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
      zke localzke2 = localzkg.b(k);
      double d10 = localzke2.F() / 100.0F;
      double d12 = d7 * d10;
      double d14 = d12 * Math.cos(d8);
      double d16 = d12 * Math.sin(d8);
      double d18 = d2 + d14;
      double d20 = d3 - d16;
      zq localzq3 = new zq((float)(d18 - d7), (float)(d20 - d7), (float)(2.0D * d7), (float)(2.0D * d7));
      if (d5 == 0.0D) {
        d5 = 0.001D;
      }
      ze localze2 = new ze();
      localze2.b(localzq3.f(), localzq3.g(), localzq3.h(), localzq3.i(), (float)d4, (float)d5);
      zq localzq4 = a(localzq3, (float)d4, (float)d5);
      zc localzc = zbd.a(localzke2.i(), localzq4);
      try
      {
        paramzr.a(localzc, localze2);
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
      localze1.a(localze2, false);
      com.aspose.cells.b.a.a.zf.a(localArrayList, localze2);
      com.aspose.cells.a.d.zs localzs = zanv.a(localzke2.k());
      try
      {
        paramzr.a(localzs, localze2);
      }
      finally
      {
        if (localzs != null) {
          localzs.s();
        }
      }
      localzke2.a(new zq((float)d18, (float)d20, (float)d7, (float)d7));
      localzke2.b((float)d4);
      localzke2.c((float)(d4 + d5));
      d4 += d5;
      d6 -= d5;
    }
    d6 = 90.0F - paramzbfc.U();
    zq localzq1 = zn.a(localze1);
    for (int m = 0; m < localzkg.getCount(); m++)
    {
      zke localzke1 = localzkg.b(m);
      zqx localzqx2 = localzke1.o();
      double d9 = d1 == 0.0D ? 0.0D : Math.abs(localzke1.w()) / d1;
      d5 = a(localzkg.a(m).w(), d1);
      double d11 = (d6 - d5 / 2.0D) % 360.0D;
      double d13 = d11 * 3.141592653589793D / 180.0D;
      localzqx2.g = d13;
      double d15 = localzke1.F() / 100.0F;
      double d17 = (1.0D + d15) * d7 * Math.cos(d13);
      double d19 = (1.0D + d15) * d7 * Math.sin(d13);
      d17 = d2 + d17;
      d19 = d3 - d19;
      zq localzq2 = localzqx2.b;
      a(paramzr, paramzje, i, m, d9, localzq2, 0.0D);
      localzqx2.d = new zo((float)d17, (float)d19);
      float f = (float)(d7 * a);
      if ((paramzbfc.Q()) && ((localzqx2.j() == 9) || (localzqx2.j() == 0))) {
        a(paramzr, localzq1, localArrayList, paramzbfc.R(), localzq2, localzqx2.d, f);
      }
      d6 -= d5;
    }
  }
  
  private static void d(zr paramzr, zje paramzje, zp paramzp, zbfc paramzbfc)
    throws Exception
  {
    int i = paramzje.ad();
    int j = paramzje.ae();
    int k = paramzje.af();
    zke localzke1 = paramzbfc.u();
    int m = paramzp.c() + i;
    int n = paramzp.d() + paramzp.f() / 2;
    int i1 = paramzp.c() + paramzp.e() - j;
    int i2 = paramzp.d() + paramzp.f() / 2;
    zbfe localzbfe = paramzje.z();
    int i3 = paramzbfc.ai();
    zkg localzkg = paramzbfc.D();
    int i4 = localzkg.getCount();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    for (int i5 = 0; i5 < i4; i5++) {
      d3 += Math.abs(localzkg.a(i5).w());
    }
    int i6;
    if (paramzbfc.az() == 4)
    {
      for (i5 = 0; i5 < i4; i5++)
      {
        for (i6 = 0; (paramzbfc.aB() != null) && (i6 < paramzbfc.aB().length); i6++) {
          if (i5 == paramzbfc.aB()[i6])
          {
            localzkg.b(i5).e = true;
            com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkg.a(i5));
            com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkg.a(i5).w())));
            d2 += Math.abs(localzkg.a(i5).w());
            break;
          }
        }
        if ((paramzbfc.aB() == null) || (paramzbfc.aB().length == 0) || (i6 == paramzbfc.aB().length))
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkg.a(i5));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkg.a(i5).w())));
          d1 += Math.abs(localzkg.a(i5).w());
        }
      }
    }
    else if (paramzbfc.az() == 3)
    {
      for (i5 = 0; i5 < i4; i5++) {
        if (localzkg.a(i5).w() / d3 * 100.0D >= paramzbfc.aA())
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkg.a(i5));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkg.a(i5).w())));
          d1 += Math.abs(localzkg.a(i5).w());
        }
        else
        {
          localzkg.b(i5).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkg.a(i5));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkg.a(i5).w())));
          d2 += Math.abs(localzkg.a(i5).w());
        }
      }
    }
    else if (paramzbfc.az() == 2)
    {
      for (i5 = 0; i5 < i4; i5++) {
        if (localzkg.a(i5).w() >= paramzbfc.aA())
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkg.a(i5));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkg.a(i5).w())));
          d1 += Math.abs(localzkg.a(i5).w());
        }
        else
        {
          localzkg.b(i5).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkg.a(i5));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkg.a(i5).w())));
          d2 += Math.abs(localzkg.a(i5).w());
        }
      }
    }
    else
    {
      if (paramzbfc.az() == 1)
      {
        i5 = (int)paramzbfc.aA();
        if (i5 > i4) {
          i5 = i4;
        }
      }
      else
      {
        i5 = zbxz.a(i4 / 3.0F);
      }
      for (i6 = 0; i6 < i4; i6++) {
        if (i6 < i4 - i5)
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkg.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkg.a(i6).w())));
          d1 += Math.abs(localzkg.a(i6).w());
        }
        else
        {
          localzkg.b(i6).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkg.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkg.a(i6).w())));
          d2 += Math.abs(localzkg.a(i6).w());
        }
      }
    }
    if (localArrayList2.size() == 0)
    {
      localArrayList1.add(0, Double.valueOf(0.0D));
      localArrayList3.add(0, localzke1);
    }
    else
    {
      localArrayList1.add(0, Double.valueOf(d2));
      d1 += d2;
      localArrayList3.add(0, localzke1);
    }
    double d4 = d1 == 0.0D ? 0.0D : -Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    double d5 = 0.0D;
    double d6 = i / (1.0F + paramzbfc.ay() / 100.0F);
    zq localzq = new zq((float)(m - d6), (float)(n - d6), (float)(2.0D * d6), (float)(2.0D * d6));
    double d7 = -d4;
    Object localObject1;
    com.aspose.cells.b.a.b.a.zf localzf;
    Object localObject4;
    Object localObject5;
    for (int i7 = 0; i7 < localArrayList1.size(); i7++) {
      if (((Double)localArrayList1.get(i7)).doubleValue() != 0.0D)
      {
        if (i7 == 0)
        {
          localObject1 = paramzje.g(paramzbfc.ax()).a(i4);
          if (localzke1 != null) {
            localzke1.i().c((Color)localObject1);
          }
        }
        localObject1 = (zke)localArrayList3.get(i7);
        d5 = a(((Double)localArrayList1.get(i7)).doubleValue(), d1);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        localObject2 = new zo(m, n);
        localzf = null;
        if (((zke)localObject1).F() > 0.0F)
        {
          localzf = paramzr.d();
          localObject2 = a((zke)localObject1, localzq, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        localObject3 = new ze();
        ((ze)localObject3).b(localzq.f(), localzq.g(), localzq.h(), localzq.i(), (float)d4, (float)d5);
        localObject4 = a(localzq, (float)d4, (float)d5);
        localObject5 = zbd.a(((zke)localObject1).i(), (zq)localObject4);
        paramzr.a((zc)localObject5, (ze)localObject3);
        if (localObject5 != null) {
          ((zc)localObject5).h();
        }
        if (((zke)localObject1).F() > 0.0F) {
          paramzr.a(localzf);
        }
        ((zke)localObject1).a(new zq(((zo)localObject2).d(), ((zo)localObject2).e(), localzq.h() / 2.0F, localzq.i() / 2.0F));
        ((zke)localObject1).b((float)d4);
        ((zke)localObject1).c((float)(d4 + d5));
        d4 += d5;
        d7 -= d5;
      }
    }
    d4 = d1 == 0.0D ? 0.0D : -Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    d7 = -d4;
    for (i7 = 0; i7 < localArrayList1.size(); i7++) {
      if (((Double)localArrayList1.get(i7)).doubleValue() != 0.0D)
      {
        localObject1 = (zke)localArrayList3.get(i7);
        localObject2 = zanv.a(((zke)localObject1).k());
        d5 = a(((Double)localArrayList1.get(i7)).doubleValue(), d1);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        localzf = null;
        if (((zke)localObject1).F() > 0.0F)
        {
          localzf = paramzr.d();
          a((zke)localObject1, localzq, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        localObject3 = new ze();
        if (d5 == 360.0D) {
          ((ze)localObject3).a(localzq, (float)d4, (float)d5);
        } else {
          ((ze)localObject3).b(localzq.f(), localzq.g(), localzq.h(), localzq.i(), (float)d4, (float)d5);
        }
        paramzr.a((com.aspose.cells.a.d.zs)localObject2, (ze)localObject3);
        if (((zke)localObject1).F() > 0.0F) {
          paramzr.a(localzf);
        }
        if (localObject2 != null) {
          ((com.aspose.cells.a.d.zs)localObject2).dispose();
        }
        d4 += d5;
        d7 -= d5;
      }
    }
    d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    double d8 = j / (1.0F + paramzbfc.ay() / 100.0F);
    Object localObject2 = new zq((float)(i1 - d8), (float)(i2 - d8), (float)(2.0D * d8), (float)(2.0D * d8));
    d7 = -d4;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    for (int i8 = 0; i8 < localArrayList2.size(); i8++) {
      if (((Double)localArrayList2.get(i8)).doubleValue() != 0.0D)
      {
        localObject3 = (zke)localArrayList4.get(i8);
        d5 = a(((Double)localArrayList2.get(i8)).doubleValue(), d2);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        localObject4 = new zo(i1, i2);
        localObject5 = null;
        if (((zke)localObject3).F() > 0.0F)
        {
          localObject5 = paramzr.d();
          localObject4 = a((zke)localObject3, (zq)localObject2, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        localObject6 = new ze();
        ((ze)localObject6).b(((zq)localObject2).f(), ((zq)localObject2).g(), ((zq)localObject2).h(), ((zq)localObject2).i(), (float)d4, (float)d5);
        localObject7 = a((zq)localObject2, (float)d4, (float)d5);
        localObject8 = zbd.a(((zke)localObject3).i(), (zq)localObject7);
        try
        {
          paramzr.a((zc)localObject8, (ze)localObject6);
        }
        finally
        {
          if (localObject8 != null) {
            ((zc)localObject8).f();
          }
        }
        if (((zke)localObject3).F() > 0.0F) {
          paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject5);
        }
        ((zke)localObject3).a(new zq(((zo)localObject4).d(), ((zo)localObject4).e(), ((zq)localObject2).h() / 2.0F, ((zq)localObject2).i() / 2.0F));
        ((zke)localObject3).b((float)d4);
        ((zke)localObject3).c((float)(d4 + d5));
        d4 += d5;
        d7 -= d5;
      }
    }
    d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    d7 = -d4;
    double[] arrayOfDouble1 = new double[localArrayList2.size()];
    Object localObject3 = new double[localArrayList2.size()];
    for (int i9 = 0; i9 < localArrayList2.size(); i9++) {
      if (((Double)localArrayList2.get(i9)).doubleValue() != 0.0D)
      {
        localObject5 = (zke)localArrayList4.get(i9);
        localObject6 = null;
        localObject7 = zanv.a(((zke)localObject5).k());
        try
        {
          d5 = a(((Double)localArrayList2.get(i9)).doubleValue(), d2);
          if (d5 == 0.0D) {
            d5 = 0.001D;
          }
          if (((zke)localObject5).F() > 0.0F)
          {
            localObject6 = paramzr.d();
            a((zke)localObject5, (zq)localObject2, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
          }
          localObject8 = new ze();
          if (d5 == 360.0D) {
            ((ze)localObject8).a((zq)localObject2, (float)d4, (float)d5);
          } else {
            ((ze)localObject8).b(((zq)localObject2).f(), ((zq)localObject2).g(), ((zq)localObject2).h(), ((zq)localObject2).i(), (float)d4, (float)d5);
          }
          paramzr.a((com.aspose.cells.a.d.zs)localObject7, (ze)localObject8);
          if (((zke)localObject5).F() > 0.0F) {
            paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject6);
          }
        }
        finally
        {
          if (localObject7 != null) {
            ((com.aspose.cells.a.d.zs)localObject7).s();
          }
        }
        arrayOfDouble1[i9] = d4;
        localObject3[i9] = d5;
        d4 += d5;
        d7 -= d5;
      }
    }
    if (localArrayList2.size() == 0)
    {
      zu localzu = new zu(Color.fromArgb(64, 64, 64));
      paramzr.a(localzu, ((zq)localObject2).f(), ((zq)localObject2).g(), ((zq)localObject2).h(), ((zq)localObject2).i());
      localObject5 = new com.aspose.cells.a.d.zs(Color.fromArgb(0, 0, 0), 3.0F);
      paramzr.a((com.aspose.cells.a.d.zs)localObject5, ((zq)localObject2).f(), ((zq)localObject2).g(), ((zq)localObject2).h(), ((zq)localObject2).i());
    }
    double d9;
    if ((paramzbfc.X()) && (d1 != 0.0D) && (localArrayList2.size() > 0)) {
      if (Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 2.0D * 3.141592653589793D > 3.141592653589793D)
      {
        d9 = Math.acos((d6 - j) / (i1 - m));
        localObject6 = new zo((float)(m + d6 * Math.cos(d9)), (float)(n - d6 * Math.sin(d9)));
        localObject7 = new zo((float)(i1 + d8 * Math.cos(d9)), (float)(i2 - d8 * Math.sin(d9)));
        localObject8 = new zo((float)(m + d6 * Math.cos(-d9)), (float)(n - d6 * Math.sin(-d9)));
        zo localzo1 = new zo((float)(i1 + d8 * Math.cos(-d9)), (float)(i2 - d8 * Math.sin(-d9)));
        if (localzke1.F() > 0.0F)
        {
          float f3 = (float)(d6 * localzke1.F() / 100.0D);
          ((zo)localObject6).a(((zo)localObject6).d() + f3);
          ((zo)localObject8).a(((zo)localObject8).d() + f3);
        }
        int i11 = a(arrayOfDouble1, (double[])localObject3, d9 * 180.0D / 3.141592653589793D);
        zke localzke3 = paramzbfc.D().b(localArrayList1.size() - 1 + i11);
        float f4;
        double d14;
        if (localzke3.F() > 0.0F)
        {
          f4 = (float)(d8 * localzke3.F() / 100.0D);
          d14 = (360.0D - arrayOfDouble1[i11] - localObject3[i11] / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
          localzo1.a(localzo1.d() + (float)(f4 * Math.cos(d14)));
          localzo1.b(localzo1.e() - (float)(f4 * Math.sin(d14)));
        }
        i11 = a(arrayOfDouble1, (double[])localObject3, 360.0D - d9 * 180.0D / 3.141592653589793D);
        localzke3 = paramzbfc.D().b(localArrayList1.size() - 1 + i11);
        if (localzke3.F() > 0.0F)
        {
          f4 = (float)(d8 * localzke3.F() / 100.0D);
          d14 = (360.0D - arrayOfDouble1[i11] - localObject3[i11] / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
          ((zo)localObject7).a(((zo)localObject7).d() + (float)(f4 * Math.cos(d14)));
          ((zo)localObject7).b(((zo)localObject7).e() - (float)(f4 * Math.sin(d14)));
        }
        zanv.a(paramzr, (zo)localObject6, (zo)localObject7, paramzbfc.Y());
        zanv.a(paramzr, (zo)localObject8, localzo1, paramzbfc.Y());
      }
      else
      {
        d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 3.141592653589793D;
        if (localArrayList1.size() == 1) {
          d4 = 0.0D;
        }
        double d10 = m + d6 * Math.cos(d4);
        double d11 = n - d6 * Math.sin(d4);
        double d12 = Math.sqrt(Math.pow(d11 - i2, 2.0D) + Math.pow(d10 - i1, 2.0D));
        d9 = Math.acos((i1 - d10) / d12) + Math.acos(d8 / d12);
        zo localzo2 = new zo((float)d10, (float)d11);
        zo localzo3 = new zo((float)(i1 + d8 * Math.cos(3.141592653589793D - d9)), (float)(i2 - d8 * Math.sin(3.141592653589793D - d9)));
        zo localzo4 = new zo((float)(m + d6 * Math.cos(-d4)), (float)(n - d6 * Math.sin(-d4)));
        zo localzo5 = new zo((float)(i1 + d8 * Math.cos(d9 + 3.141592653589793D)), (float)(i2 - d8 * Math.sin(d9 + 3.141592653589793D)));
        if (localzke1.F() > 0.0F)
        {
          float f5 = (float)(d6 * localzke1.F() / 100.0D);
          localzo2.a(localzo2.d() + f5);
          localzo4.a(localzo4.d() + f5);
        }
        int i13 = a(arrayOfDouble1, (double[])localObject3, d9 * 180.0D / 3.141592653589793D);
        zke localzke4 = paramzbfc.D().b(localArrayList1.size() - 1 + i13);
        float f6;
        double d18;
        if (localzke4.F() > 0.0F)
        {
          f6 = (float)(d8 * localzke4.F() / 100.0D);
          d18 = (360.0D - arrayOfDouble1[i13] - localObject3[i13] / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
          localzo5.a(localzo5.d() + (float)(f6 * Math.cos(d18)));
          localzo5.b(localzo5.e() - (float)(f6 * Math.sin(d18)));
        }
        i13 = a(arrayOfDouble1, (double[])localObject3, 360.0D - d9 * 180.0D / 3.141592653589793D);
        localzke4 = paramzbfc.D().b(localArrayList1.size() - 1 + i13);
        if (localzke4.F() > 0.0F)
        {
          f6 = (float)(d8 * localzke4.F() / 100.0D);
          d18 = (360.0D - arrayOfDouble1[i13] - localObject3[i13] / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
          localzo3.a(localzo3.d() + (float)(f6 * Math.cos(d18)));
          localzo3.b(localzo3.e() - (float)(f6 * Math.sin(d18)));
        }
        zanv.a(paramzr, localzo2, localzo3, paramzbfc.Y());
        zanv.a(paramzr, localzo4, localzo5, paramzbfc.Y());
      }
    }
    zqx localzqx = paramzbfc.w();
    d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 180.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    d5 = 0.0D;
    float f2 = paramzje.b();
    for (int i10 = 0; i10 < localArrayList1.size() + localArrayList2.size(); i10++)
    {
      zke localzke2 = null;
      if (i10 < localArrayList1.size()) {
        localzke2 = (zke)localArrayList3.get(i10);
      } else {
        localzke2 = (zke)localArrayList4.get(i10 - localArrayList1.size());
      }
      int i12 = localzke2.I();
      if (i10 == 0) {
        i12 = -1;
      }
      double d13 = 0.0D;
      if (localzke2 != null)
      {
        localzqx = localzke2.o();
        d13 = localzke2.F() / 100.0F;
      }
      float f1;
      if (localzqx.a().f().e()) {
        f1 = paramzje.a() * 0.175F;
      } else {
        f1 = paramzje.a() * 0.2F;
      }
      double d16 = 0.0D;
      double d17 = 0.0D;
      double d19 = 0.0D;
      double d15;
      double d20;
      if (i10 < localArrayList1.size())
      {
        d15 = d3 == 0.0D ? 0.0D : ((Double)localArrayList1.get(i10)).doubleValue() / d3;
        d5 = d1 == 0.0D ? 0.0D : ((Double)localArrayList1.get(i10)).doubleValue() / d1 * 360.0D;
        d20 = d6;
        d19 = d6 * d13;
      }
      else
      {
        d15 = d3 == 0.0D ? 0.0D : ((Double)localArrayList2.get(i10 - localArrayList1.size())).doubleValue() / d3;
        if (i10 == localArrayList1.size())
        {
          d4 = d1 == 0.0D ? 0.0D : -Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 180.0D;
          if (localArrayList1.size() == 1) {
            d4 = 0.0D;
          }
        }
        d5 = d2 == 0.0D ? 0.0D : ((Double)localArrayList2.get(i10 - localArrayList1.size())).doubleValue() / d2 * 360.0D;
        d20 = d8;
        d19 = d8 * d13;
      }
      zt localzt = new zt(0.0F, 0.0F);
      localzt = a(paramzr, paramzje.z(), i3, i12, d15, f1, f2, ((Double)localArrayList1.get(0)).doubleValue());
      if ((d5 != 0.0D) || (i10 == 0))
      {
        double d21 = (d4 - d5 / 2.0D) % 360.0D;
        d9 = d21 * 3.141592653589793D / 180.0D;
        double d22;
        double[] arrayOfDouble2;
        switch (localzqx.j())
        {
        case 1: 
          d22 = d19 + d20 * 0.5D;
          d16 = d22 * Math.cos(d9);
          d17 = d22 * Math.sin(d9);
          d16 -= localzt.b() / 2.0F;
          d17 += localzt.c() / 2.0F;
          break;
        case 3: 
          d22 = d19 + d20 * 0.97D;
          d16 = d22 * Math.cos(d9);
          d17 = d22 * Math.sin(d9);
          localObject11 = new double[] { d16 };
          arrayOfDouble2 = new double[] { d17 };
          b((double[])localObject11, arrayOfDouble2, d21, localzt);
          d16 = localObject11[0];
          d17 = arrayOfDouble2[0];
          break;
        default: 
          d22 = d19 + d20 * 1.03D;
          d16 = d22 * Math.cos(d9);
          d17 = d22 * Math.sin(d9);
          localObject11 = new double[] { d16 };
          arrayOfDouble2 = new double[] { d17 };
          a((double[])localObject11, arrayOfDouble2, d21, localzt);
          d16 = localObject11[0];
          d17 = arrayOfDouble2[0];
          if (localzqx.j() == 9)
          {
            if (!localzqx.a().q())
            {
              d9 -= localzqx.a().n() * 3.141592653589793D / 180.0D;
              d9 %= 6.283185307179586D;
            }
            if (!localzqx.a().r()) {
              d22 += d20 * localzqx.a().o() / 500.0D;
            }
            d16 = d22 * Math.cos(d9);
            d17 = d22 * Math.sin(d9);
            localObject11 = new double[] { d16 };
            arrayOfDouble2 = new double[] { d17 };
            a((double[])localObject11, arrayOfDouble2, d21, localzt);
            d16 = localObject11[0];
            d17 = arrayOfDouble2[0];
          }
          break;
        }
        if (i10 < localArrayList1.size())
        {
          d16 = m + d16;
          d17 = n - d17;
        }
        else
        {
          d16 = i1 + d16;
          d17 = i2 - d17;
        }
        Object localObject11 = new zq((float)d16, (float)d17, localzt.b(), localzt.c());
        a(paramzr, paramzje, i3, i12, d15, (zq)localObject11, ((Double)localArrayList1.get(0)).doubleValue());
        d4 -= d5;
      }
    }
  }
  
  private static int a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double paramDouble)
  {
    for (int i = 0; i < paramArrayOfDouble1.length; i++) {
      if ((paramDouble > paramArrayOfDouble1[i] % 360.0D) && (paramDouble <= paramArrayOfDouble1[i] + paramArrayOfDouble2[i] % 360.0D)) {
        return i;
      }
    }
    paramDouble += 360.0D;
    for (i = 0; i < paramArrayOfDouble1.length; i++) {
      if ((paramDouble > paramArrayOfDouble1[i] % 360.0D) && (paramDouble <= paramArrayOfDouble1[i] + paramArrayOfDouble2[i] % 360.0D)) {
        return i;
      }
    }
    return 0;
  }
  
  private static void e(zr paramzr, zje paramzje, zp paramzp, zbfc paramzbfc)
    throws Exception
  {
    int i = paramzje.ad();
    int j = paramzje.ae();
    int k = paramzje.af();
    zke localzke1 = paramzbfc.u();
    int m = paramzp.c() + i;
    int n = paramzp.d() + paramzp.f() / 2;
    int i1 = paramzp.c() + paramzp.e() - j;
    int i2 = paramzp.d() + paramzp.f() / 2;
    zbfe localzbfe = paramzje.z();
    int i3 = paramzbfc.ai();
    zkg localzkg = paramzbfc.D();
    int i4 = localzkg.getCount();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    for (int i5 = 0; i5 < i4; i5++) {
      d3 += Math.abs(localzkg.a(i5).w());
    }
    int i6;
    if (paramzbfc.az() == 4)
    {
      for (i5 = 0; i5 < i4; i5++)
      {
        for (i6 = 0; (paramzbfc.aB() != null) && (i6 < paramzbfc.aB().length); i6++) {
          if (i5 == paramzbfc.aB()[i6])
          {
            localzkg.b(i5).e = true;
            com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkg.a(i5));
            com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkg.a(i5).w())));
            d2 += Math.abs(localzkg.a(i5).w());
            break;
          }
        }
        if ((paramzbfc.aB() == null) || (paramzbfc.aB().length == 0) || (i6 == paramzbfc.aB().length))
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkg.a(i5));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkg.a(i5).w())));
          d1 += Math.abs(localzkg.a(i5).w());
        }
      }
    }
    else if (paramzbfc.az() == 3)
    {
      for (i5 = 0; i5 < i4; i5++) {
        if (localzkg.a(i5).w() / d3 * 100.0D >= paramzbfc.aA())
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkg.a(i5));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkg.a(i5).w())));
          d1 += Math.abs(localzkg.a(i5).w());
        }
        else
        {
          localzkg.b(i5).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkg.a(i5));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkg.a(i5).w())));
          d2 += Math.abs(localzkg.a(i5).w());
        }
      }
    }
    else if (paramzbfc.az() == 2)
    {
      for (i5 = 0; i5 < i4; i5++) {
        if (localzkg.a(i5).w() >= paramzbfc.aA())
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkg.a(i5));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkg.a(i5).w())));
          d1 += Math.abs(localzkg.a(i5).w());
        }
        else
        {
          localzkg.b(i5).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkg.a(i5));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkg.a(i5).w())));
          d2 += Math.abs(localzkg.a(i5).w());
        }
      }
    }
    else
    {
      if (paramzbfc.az() == 1)
      {
        i5 = (int)paramzbfc.aA();
        if (i5 > i4) {
          i5 = i4;
        }
      }
      else
      {
        i5 = zbxz.a(i4 / 3.0F);
      }
      for (i6 = 0; i6 < i4; i6++) {
        if (i6 < i4 - i5)
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkg.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkg.a(i6).w())));
          d1 += Math.abs(localzkg.a(i6).w());
        }
        else
        {
          localzkg.b(i6).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkg.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkg.a(i6).w())));
          d2 += Math.abs(localzkg.a(i6).w());
        }
      }
    }
    if (localArrayList2.size() == 0)
    {
      localArrayList1.add(0, Double.valueOf(0.0D));
      localArrayList3.add(0, localzke1);
    }
    else
    {
      localArrayList1.add(0, Double.valueOf(d2));
      d1 += d2;
      localArrayList3.add(0, localzke1);
    }
    double d4 = d1 == 0.0D ? 0.0D : -Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    double d5 = 0.0D;
    double d6 = i / (1.0F + paramzbfc.ay() / 100.0F);
    zq localzq1 = new zq((float)(m - d6), (float)(n - d6), (float)(2.0D * d6), (float)(2.0D * d6));
    double d7 = -d4;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    for (int i7 = 0; i7 < localArrayList1.size(); i7++) {
      if (((Double)localArrayList1.get(i7)).doubleValue() != 0.0D)
      {
        if (i7 == 0)
        {
          localObject1 = paramzje.g(paramzbfc.ax()).a(i4);
          if (localzke1 != null) {
            localzke1.i().c((Color)localObject1);
          }
        }
        localObject1 = (zke)localArrayList3.get(i7);
        d5 = a(((Double)localArrayList1.get(i7)).doubleValue(), d1);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        localObject2 = new zo(m, n);
        localObject3 = null;
        if (((zke)localObject1).F() > 0.0F)
        {
          localObject3 = paramzr.d();
          localObject2 = a((zke)localObject1, localzq1, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        localObject4 = new ze();
        ((ze)localObject4).b(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i(), (float)d4, (float)d5);
        localObject5 = a(localzq1, (float)d4, (float)d5);
        localObject6 = zbd.a(((zke)localObject1).i(), zn.a((ze)localObject4));
        paramzr.a((zc)localObject6, (ze)localObject4);
        if (localObject6 != null) {
          ((zc)localObject6).h();
        }
        if (((zke)localObject1).F() > 0.0F) {
          paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject3);
        }
        ((zke)localObject1).a(new zq(((zo)localObject2).d(), ((zo)localObject2).e(), localzq1.h() / 2.0F, localzq1.i() / 2.0F));
        ((zke)localObject1).b((float)d4);
        ((zke)localObject1).c((float)(d4 + d5));
        d4 += d5;
        d7 -= d5;
      }
    }
    d4 = d1 == 0.0D ? 0.0D : -Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    d7 = -d4;
    for (i7 = 0; i7 < localArrayList1.size(); i7++) {
      if (((Double)localArrayList1.get(i7)).doubleValue() != 0.0D)
      {
        if (i7 == 0)
        {
          localObject1 = Color.getBlack();
          if (localzke1 != null) {
            localzke1.k().b((Color)localObject1);
          }
        }
        localObject1 = (zke)localArrayList3.get(i7);
        d5 = a(((Double)localArrayList1.get(i7)).doubleValue(), d1);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        localObject2 = null;
        if (((zke)localObject1).F() > 0.0F)
        {
          localObject2 = paramzr.d();
          a((zke)localObject1, localzq1, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        localObject3 = new ze();
        if (d5 == 360.0D) {
          ((ze)localObject3).a(localzq1, (float)d4, (float)d5);
        } else {
          ((ze)localObject3).b(localzq1.f(), localzq1.g(), localzq1.h(), paramzp.f(), (float)d4, (float)d5);
        }
        localObject4 = zanv.a(((zke)localObject1).k());
        paramzr.a((com.aspose.cells.a.d.zs)localObject4, (ze)localObject3);
        if (localObject4 != null) {
          ((com.aspose.cells.a.d.zs)localObject4).dispose();
        }
        if (((zke)localObject1).F() > 0.0F) {
          paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject2);
        }
        d4 += d5;
        d7 -= d5;
      }
    }
    double d8 = i2 - j;
    double d9;
    Object localObject7;
    for (int i8 = 0; i8 < localArrayList2.size(); i8++) {
      if (((Double)localArrayList2.get(i8)).doubleValue() != 0.0D)
      {
        localObject5 = (zke)localArrayList4.get(i8);
        d9 = Math.abs(((Double)localArrayList2.get(i8)).doubleValue()) / d2 * 2.0D * j;
        localObject6 = new zq(i1, (float)d8, j, (float)d9);
        localObject7 = zbd.a(((zke)localObject5).i(), (zq)localObject6);
        try
        {
          paramzr.b((zc)localObject7, (zq)localObject6);
        }
        finally
        {
          if (localObject7 != null) {
            ((zc)localObject7).f();
          }
        }
        com.aspose.cells.a.d.zs localzs = zanv.a(((zke)localObject5).k());
        try
        {
          paramzr.c(localzs, i1, (float)d8, j, (float)d9);
        }
        finally
        {
          if (localzs != null) {
            localzs.s();
          }
        }
        ((zke)localObject5).a(new zq(((zq)localObject6).f(), ((zq)localObject6).g(), ((zq)localObject6).h(), ((zq)localObject6).i()));
        d8 += d9;
      }
    }
    if (localArrayList2.size() == 0)
    {
      zq localzq2 = new zq(i1, (float)d8, j, 2.0F * j);
      localObject5 = new zu(Color.fromArgb(64, 64, 64));
      paramzr.b((zc)localObject5, localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
      localObject6 = new com.aspose.cells.a.d.zs(Color.fromArgb(0, 0, 0), 3.0F);
      paramzr.c((com.aspose.cells.a.d.zs)localObject6, localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
    }
    double d10;
    if ((paramzbfc.X()) && (d1 != 0.0D) && (localArrayList2.size() > 0))
    {
      localObject6 = new zo(i1, i2 - j);
      localObject7 = new zo(i1, i2 + j);
      if (Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 2.0D * 3.141592653589793D > 3.141592653589793D)
      {
        d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 3.141592653589793D;
        if (localArrayList1.size() == 1) {
          d4 = 0.0D;
        }
        double d12 = Math.sqrt(Math.pow(i2 - n, 2.0D) + Math.pow(i1 - m, 2.0D));
        d10 = Math.acos(d6 / d12) + Math.asin(j / d12);
        zo localzo2 = new zo((float)(m + d6 * Math.cos(d10)), (float)(n - d6 * Math.sin(d10)));
        zo localzo3 = new zo((float)(m + d6 * Math.cos(-d10)), (float)(n - d6 * Math.sin(-d10)));
        if (localzke1.F() > 0.0F)
        {
          float f2 = (float)(d6 * localzke1.F() / 100.0D);
          localzo2.a(localzo2.d() + f2);
          localzo3.a(localzo3.d() + f2);
        }
        zanv.a(paramzr, localzo2, (zo)localObject6, paramzbfc.Y());
        zanv.a(paramzr, localzo3, (zo)localObject7, paramzbfc.Y());
      }
      else
      {
        d10 = Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 3.141592653589793D;
        zo localzo1 = new zo((float)(m + d6 * Math.cos(d10)), (float)(n - d6 * Math.sin(d10)));
        localObject10 = new zo((float)(m + d6 * Math.cos(-d10)), (float)(n - d6 * Math.sin(-d10)));
        if (localzke1.F() > 0.0F)
        {
          float f1 = (float)(d6 * localzke1.F() / 100.0D);
          localzo1.a(localzo1.d() + f1);
          ((zo)localObject10).a(((zo)localObject10).d() + f1);
        }
        zanv.a(paramzr, localzo1, (zo)localObject6, paramzbfc.Y());
        zanv.a(paramzr, (zo)localObject10, (zo)localObject7, paramzbfc.Y());
      }
    }
    Object localObject6 = paramzbfc.w();
    double d11 = ((Double)localArrayList1.get(0)).doubleValue();
    Object localObject10 = new zt(0.0F, 0.0F);
    double d13 = 0.0D;
    double d14 = 0.0D;
    d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 180.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    d5 = 0.0D;
    float f4 = paramzje.b();
    zke localzke2;
    int i10;
    float f3;
    for (int i9 = 0; i9 < localArrayList1.size(); i9++) {
      if ((((Double)localArrayList1.get(i9)).doubleValue() != 0.0D) || (i9 == 0))
      {
        localzke2 = (zke)localArrayList3.get(i9);
        i10 = localzke2.I();
        if (i9 == 0) {
          i10 = -1;
        }
        double d15 = 0.0D;
        if (localzke2 != null)
        {
          localObject6 = localzke2.o();
          d15 = localzke2.F() / 100.0F;
        }
        if (((zqx)localObject6).a().f().e()) {
          f3 = paramzje.a() * 0.175F;
        } else {
          f3 = paramzje.a() * 0.2F;
        }
        d11 = d3 == 0.0D ? 0.0D : ((Double)localArrayList1.get(i9)).doubleValue() / d3;
        localObject10 = a(paramzr, paramzje.z(), i3, i10, d11, f3, f4, ((Double)localArrayList1.get(0)).doubleValue());
        d5 = d1 == 0.0D ? 0.0D : ((Double)localArrayList1.get(i9)).doubleValue() / d1 * 2.0D * 180.0D;
        double d16 = i * d15;
        double d17 = (d4 - d5 / 2.0D) % 360.0D;
        d10 = d17 * 3.141592653589793D / 180.0D;
        d13 = 0.0D;
        d14 = 0.0D;
        double d18;
        double[] arrayOfDouble;
        switch (((zqx)localObject6).j())
        {
        case 1: 
          d18 = d16 + d6 * 0.5D;
          d13 = d18 * Math.cos(d10);
          d14 = d18 * Math.sin(d10);
          d13 -= ((zt)localObject10).b() / 2.0F;
          d14 += ((zt)localObject10).c() / 2.0F;
          break;
        case 3: 
          d18 = d16 + d6 * 0.97D;
          d13 = d18 * Math.cos(d10);
          d14 = d18 * Math.sin(d10);
          localObject11 = new double[] { d13 };
          arrayOfDouble = new double[] { d14 };
          b((double[])localObject11, arrayOfDouble, d17, (zt)localObject10);
          d13 = localObject11[0];
          d14 = arrayOfDouble[0];
          break;
        default: 
          d18 = d16 + d6 * 1.03D;
          d13 = d18 * Math.cos(d10);
          d14 = d18 * Math.sin(d10);
          localObject11 = new double[] { d13 };
          arrayOfDouble = new double[] { d14 };
          a((double[])localObject11, arrayOfDouble, d17, (zt)localObject10);
          d13 = localObject11[0];
          d14 = arrayOfDouble[0];
          if (((zqx)localObject6).j() == 9)
          {
            if (!((zqx)localObject6).a().q())
            {
              d10 -= ((zqx)localObject6).a().n() * 3.141592653589793D / 180.0D;
              d10 %= 6.283185307179586D;
            }
            if (!((zqx)localObject6).a().r()) {
              d18 += d6 * ((zqx)localObject6).a().o() / 500.0D;
            }
            d13 = d18 * Math.cos(d10);
            d14 = d18 * Math.sin(d10);
            localObject11 = new double[] { d13 };
            arrayOfDouble = new double[] { d14 };
            a((double[])localObject11, arrayOfDouble, d17, (zt)localObject10);
            d13 = localObject11[0];
            d14 = arrayOfDouble[0];
          }
          break;
        }
        d13 = m + d13;
        d14 = n - d14;
        Object localObject11 = new zq((float)d13, (float)d14, ((zt)localObject10).b(), ((zt)localObject10).c());
        a(paramzr, paramzje, i3, i10, d11, (zq)localObject11, ((Double)localArrayList1.get(0)).doubleValue());
        d4 -= d5;
      }
    }
    d8 = i2 - j;
    localObject6 = paramzbfc.w();
    for (i9 = 0; i9 < localArrayList2.size(); i9++) {
      if (((Double)localArrayList2.get(i9)).doubleValue() != 0.0D)
      {
        localzke2 = (zke)localArrayList4.get(i9);
        i10 = localzke2.I();
        if (localzke2 != null) {
          localObject6 = localzke2.o();
        }
        if (((zqx)localObject6).a().f().e()) {
          f3 = paramzje.a() * 0.175F;
        } else {
          f3 = paramzje.a() * 0.2F;
        }
        d9 = Math.abs(((Double)localArrayList2.get(i9)).doubleValue()) / d2 * 2.0D * j;
        d13 = i1;
        d14 = d8;
        d8 += d9;
        d11 = d3 == 0.0D ? 0.0D : ((Double)localArrayList2.get(i9)).doubleValue() / d3;
        localObject10 = a(paramzr, paramzje.z(), i3, i10, d11, f3, f4, ((Double)localArrayList1.get(0)).doubleValue());
        d10 = 0.0D;
        switch (((zqx)localObject6).j())
        {
        case 1: 
          d13 += (j - ((zt)localObject10).b()) / 2.0F;
          d14 += (d9 - ((zt)localObject10).c()) / 2.0D;
          break;
        case 3: 
          d13 += (j - ((zt)localObject10).b()) / 2.0F;
          break;
        default: 
          d13 = d13 + j + 1.0D;
          d14 += (d9 - ((zt)localObject10).c()) / 2.0D;
        }
        zq localzq3 = new zq((float)d13, (float)d14, ((zt)localObject10).b(), ((zt)localObject10).c());
        a(paramzr, paramzje, i3, i10, d11, localzq3, ((Double)localArrayList1.get(0)).doubleValue());
      }
    }
  }
  
  private static void a(zr paramzr, zje paramzje, zp paramzp, List paramList)
    throws Exception
  {
    zbfc localzbfc1 = (zbfc)paramList.get(0);
    int i = localzbfc1.U();
    int j = localzbfc1.V();
    double d1 = paramzp.e() / 2.0D;
    double d2 = d1 * j / 100.0D;
    double d3 = (d1 - d2) / paramList.size();
    double d4 = paramzp.c() + paramzp.e() / 2.0D;
    double d5 = paramzp.d() + paramzp.f() / 2.0D;
    zq localzq1 = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    localzq1.a(localzq1.f() + (float)(d1 - d2));
    localzq1.b(localzq1.g() + (float)(d1 - d2));
    localzq1.c(localzq1.h() - 2.0F * (float)(d1 - d2));
    localzq1.d(localzq1.i() - 2.0F * (float)(d1 - d2));
    double d6 = d2;
    zkg localzkg;
    double d8;
    double d9;
    Object localObject1;
    for (int k = 0; k < paramList.size(); k++)
    {
      zbfc localzbfc2 = (zbfc)paramList.get(k);
      m = localzbfc2.ai();
      double d7 = 0.0D;
      localzkg = localzbfc2.D();
      for (int i1 = 0; i1 < localzkg.getCount(); i1++) {
        d7 += Math.abs(localzkg.a(i1).w());
      }
      d8 = i - 90.0F;
      d9 = 0.0D;
      for (int i2 = 0; i2 < localzkg.getCount(); i2++)
      {
        zke localzke1 = localzkg.b(i2);
        if (localzkg.a(i2).w() != 0.0D)
        {
          d9 = a(localzkg.a(i2).w(), d7);
          if (d9 == 0.0D) {
            d9 = 0.001D;
          }
          if (k == paramList.size() - 1)
          {
            d11 = (360.0D - d8 - d9 / 2.0D) * 3.141592653589793D / 180.0D;
            d12 = d1 * localzke1.F() / 100.0D;
            d14 = d12 * Math.cos(d11);
            double d15 = d12 * Math.sin(d11);
            d4 = paramzp.c() + paramzp.e() / 2.0D + d14;
            d5 = paramzp.d() + paramzp.f() / 2.0D - d15;
            localzq1.a((float)(d4 - d6));
            localzq1.b((float)(d5 - d6));
            localzq1.c((float)(2.0D * d6));
            localzq1.d((float)(2.0D * d6));
          }
          ze localze = new ze();
          zq localzq2 = zbxz.b(localzq1);
          localze.a(localzq2, (float)d8, (float)d9);
          double d11 = (360.0D - d8 - d9) * 3.141592653589793D / 180.0D;
          double d12 = d6 * Math.cos(d11);
          double d14 = d6 * Math.sin(d11);
          d12 = d4 + d12;
          d14 = d5 - d14;
          zo localzo1 = new zo((float)d12, (float)d14);
          d12 = (d6 + d3) * Math.cos(d11);
          d14 = (d6 + d3) * Math.sin(d11);
          d12 = d4 + d12;
          d14 = d5 - d14;
          zo localzo2 = new zo((float)d12, (float)d14);
          localze.a(localzo1, localzo2);
          zq localzq3 = zbxz.b(localzq1);
          localzq3.a(localzq3.f() - (float)d3);
          localzq3.b(localzq3.g() - (float)d3);
          localzq3.c(localzq3.h() + 2.0F * (float)d3);
          localzq3.d(localzq3.i() + 2.0F * (float)d3);
          localze.a(localzq3, (float)(d8 + d9), -(float)d9);
          d11 = (360.0D - d8) * 3.141592653589793D / 180.0D;
          d12 = d6 * Math.cos(d11);
          d14 = d6 * Math.sin(d11);
          d12 = d4 + d12;
          d14 = d5 - d14;
          zo localzo3 = new zo((float)d12, (float)d14);
          d12 = (d6 + d3) * Math.cos(d11);
          d14 = (d6 + d3) * Math.sin(d11);
          d12 = d4 + d12;
          d14 = d5 - d14;
          zo localzo4 = new zo((float)d12, (float)d14);
          localze.a(localzo4, localzo3);
          localze.j();
          zq localzq4 = zn.a(localze);
          localObject1 = zbd.a(localzke1.i(), localzq4);
          try
          {
            paramzr.a((zc)localObject1, localze);
          }
          finally
          {
            if (localObject1 != null) {
              ((zc)localObject1).f();
            }
          }
          com.aspose.cells.a.d.zs localzs = zanv.a(localzke1.k());
          try
          {
            paramzr.a(localzs, localze);
          }
          finally
          {
            if (localzs != null) {
              localzs.s();
            }
          }
          localzke1.a(new zq(localzq3.f() + localzq3.h() / 2.0F, localzq3.g() + localzq3.i() / 2.0F, localzq3.h() / 2.0F, localzq3.i() / 2.0F));
          localzke1.d(localzq2.h() / 2.0F);
          localzke1.b((float)d8);
          localzke1.c((float)(d8 + d9));
          d8 += d9;
        }
      }
      d6 += d3;
      localzq1.a(localzq1.f() - (float)d3);
      localzq1.b(localzq1.g() - (float)d3);
      localzq1.c(localzq1.h() + 2.0F * (float)d3);
      localzq1.d(localzq1.i() + 2.0F * (float)d3);
    }
    float f1;
    if (paramzje.B().q()) {
      f1 = (float)(2.0D * d1);
    } else {
      f1 = paramzje.a() * 0.2F;
    }
    float f2 = paramzje.b();
    for (int m = 0; m < paramList.size(); m++)
    {
      zbfc localzbfc3 = (zbfc)paramList.get(m);
      int n = localzbfc3.ai();
      localzkg = localzbfc3.D();
      d8 = i - 90.0F;
      d9 = 0.0D;
      double d10 = 0.0D;
      for (int i3 = 0; i3 < localzkg.getCount(); i3++) {
        d10 += Math.abs(localzkg.a(i3).w());
      }
      for (i3 = 0; i3 < localzkg.getCount(); i3++)
      {
        zke localzke2 = localzkg.b(i3);
        zqx localzqx = localzke2.o();
        double d13 = d10 == 0.0D ? 0.0D : Math.abs(localzke2.w()) / d10;
        zt localzt = a(paramzr, paramzje.z(), n, i3, d13, f1, f2, 0.0D);
        d9 = a(localzkg.a(i3).w(), d10);
        if (m == paramList.size() - 1)
        {
          d16 = (360.0D - d8 - d9 / 2.0D) * 3.141592653589793D / 180.0D;
          d17 = d1 * localzkg.a(i3).F() / 100.0D;
          d18 = d17 * Math.cos(d16);
          d19 = d17 * Math.sin(d16);
          d4 = paramzp.c() + paramzp.e() / 2.0D + d18;
          d5 = paramzp.d() + paramzp.f() / 2.0D - d19;
        }
        double d16 = (360.0D - d8 - d9 / 2.0D) * 3.141592653589793D / 180.0D;
        double d17 = d2 + m * d3 + d3 / 2.0D;
        double d18 = d17 * Math.cos(d16);
        double d19 = d17 * Math.sin(d16);
        if (localzqx.j() == 9)
        {
          if (!localzqx.a().q())
          {
            d16 -= localzqx.a().n() * 3.141592653589793D / 180.0D;
            d16 %= 6.283185307179586D;
          }
          if (!localzqx.a().r()) {
            d17 += d17 * localzqx.a().o() / 500.0D;
          }
          d18 = d17 * Math.cos(d16);
          d19 = d17 * Math.sin(d16);
        }
        d18 = d4 + d18;
        d19 = d5 - d19;
        d18 -= localzt.b() / 2.0F;
        d19 -= localzt.c() / 2.0F;
        localObject1 = new zq((float)d18, (float)d19, localzt.b(), localzt.c());
        a(paramzr, paramzje, n, i3, d13, (zq)localObject1, 0.0D);
        d8 += d9;
      }
    }
  }
  
  private static void b(zr paramzr, zje paramzje, zp paramzp, List paramList)
    throws Exception
  {
    zbfc localzbfc1 = (zbfc)paramList.get(0);
    int i = localzbfc1.U();
    int j = localzbfc1.V();
    double d1 = paramzp.e() / 2.0D / (1.0F + localzbfc1.ay() / 100.0F);
    double d2 = d1 * j / 100.0D;
    double d3 = (d1 - d2) / paramList.size();
    double d4 = paramzp.c() + paramzp.e() / 2.0D;
    double d5 = paramzp.d() + paramzp.f() / 2.0D;
    double d6 = d2;
    zq localzq1 = zq.c();
    localzq1.a((float)(d4 - d6));
    localzq1.b((float)(d5 - d6));
    localzq1.c((float)(2.0D * d6));
    localzq1.d((float)(2.0D * d6));
    zkg localzkg;
    double d8;
    double d9;
    Object localObject1;
    for (int k = 0; k < paramList.size(); k++)
    {
      zbfc localzbfc2 = (zbfc)paramList.get(k);
      m = localzbfc2.ai();
      double d7 = 0.0D;
      localzkg = localzbfc2.D();
      for (int i1 = 0; i1 < localzkg.getCount(); i1++) {
        d7 += Math.abs(localzkg.a(i1).w());
      }
      d8 = i - 90.0F;
      d9 = 0.0D;
      for (int i2 = 0; i2 < localzkg.getCount(); i2++)
      {
        zke localzke1 = localzkg.b(i2);
        if (localzkg.a(i2).w() != 0.0D)
        {
          d9 = a(localzkg.a(i2).w(), d7);
          if (d9 == 0.0D) {
            d9 = 0.001D;
          }
          if (k == paramList.size() - 1)
          {
            d11 = (360.0D - d8 - d9 / 2.0D) * 3.141592653589793D / 180.0D;
            d12 = d1 * localzke1.F() / 100.0D;
            d14 = d12 * Math.cos(d11);
            double d15 = d12 * Math.sin(d11);
            d4 = paramzp.c() + paramzp.e() / 2.0D + d14;
            d5 = paramzp.d() + paramzp.f() / 2.0D - d15;
            localzq1.a((float)(d4 - d6));
            localzq1.b((float)(d5 - d6));
            localzq1.c((float)(2.0D * d6));
            localzq1.d((float)(2.0D * d6));
          }
          ze localze = new ze();
          zq localzq2 = zbxz.b(localzq1);
          localze.a(localzq2, (float)d8, (float)d9);
          double d11 = (360.0D - d8 - d9) * 3.141592653589793D / 180.0D;
          double d12 = d6 * Math.cos(d11);
          double d14 = d6 * Math.sin(d11);
          d12 = d4 + d12;
          d14 = d5 - d14;
          zo localzo1 = new zo((float)d12, (float)d14);
          d12 = (d6 + d3) * Math.cos(d11);
          d14 = (d6 + d3) * Math.sin(d11);
          d12 = d4 + d12;
          d14 = d5 - d14;
          zo localzo2 = new zo((float)d12, (float)d14);
          localze.a(localzo1, localzo2);
          zq localzq3 = zbxz.b(localzq1);
          localzq3.a(localzq3.f() - (float)d3);
          localzq3.b(localzq3.g() - (float)d3);
          localzq3.c(localzq3.h() + 2.0F * (float)d3);
          localzq3.d(localzq3.i() + 2.0F * (float)d3);
          localze.a(localzq3, (float)(d8 + d9), -(float)d9);
          d11 = (360.0D - d8) * 3.141592653589793D / 180.0D;
          d12 = d6 * Math.cos(d11);
          d14 = d6 * Math.sin(d11);
          d12 = d4 + d12;
          d14 = d5 - d14;
          zo localzo3 = new zo((float)d12, (float)d14);
          d12 = (d6 + d3) * Math.cos(d11);
          d14 = (d6 + d3) * Math.sin(d11);
          d12 = d4 + d12;
          d14 = d5 - d14;
          zo localzo4 = new zo((float)d12, (float)d14);
          localze.a(localzo4, localzo3);
          localze.j();
          zq localzq4 = zn.a(localze);
          localObject1 = zbd.a(localzke1.i(), localzq4);
          try
          {
            paramzr.a((zc)localObject1, localze);
          }
          finally
          {
            if (localObject1 != null) {
              ((zc)localObject1).f();
            }
          }
          com.aspose.cells.a.d.zs localzs = zanv.a(localzke1.k());
          try
          {
            paramzr.a(localzs, localze);
          }
          finally
          {
            if (localzs != null) {
              localzs.s();
            }
          }
          localzke1.a(new zq(localzq3.f() + localzq3.h() / 2.0F, localzq3.g() + localzq3.i() / 2.0F, localzq3.h() / 2.0F, localzq3.i() / 2.0F));
          localzke1.d(localzq2.h() / 2.0F);
          localzke1.b((float)d8);
          localzke1.c((float)(d8 + d9));
          d8 += d9;
        }
      }
      d6 += d3;
      localzq1.a(localzq1.f() - (float)d3);
      localzq1.b(localzq1.g() - (float)d3);
      localzq1.c(localzq1.h() + 2.0F * (float)d3);
      localzq1.d(localzq1.i() + 2.0F * (float)d3);
    }
    d4 = paramzp.c() + paramzp.e() / 2.0D;
    d5 = paramzp.d() + paramzp.f() / 2.0D;
    float f1;
    if (paramzje.B().q()) {
      f1 = (float)(2.0D * d6);
    } else {
      f1 = paramzje.a() * 0.2F;
    }
    float f2 = paramzje.b();
    for (int m = 0; m < paramList.size(); m++)
    {
      zbfc localzbfc3 = (zbfc)paramList.get(m);
      int n = localzbfc3.ai();
      localzkg = localzbfc3.D();
      d8 = i - 90.0F;
      d9 = 0.0D;
      double d10 = 0.0D;
      for (int i3 = 0; i3 < localzkg.getCount(); i3++) {
        d10 += Math.abs(localzkg.a(i3).w());
      }
      for (i3 = 0; i3 < localzkg.getCount(); i3++)
      {
        zke localzke2 = localzkg.b(i3);
        zqx localzqx = localzke2.o();
        double d13 = d10 == 0.0D ? 0.0D : Math.abs(localzke2.w()) / d10;
        zt localzt = a(paramzr, paramzje.z(), n, i3, d13, f1, f2, 0.0D);
        d9 = a(localzkg.a(i3).w(), d10);
        if (m == paramList.size() - 1)
        {
          d16 = (360.0D - d8 - d9 / 2.0D) * 3.141592653589793D / 180.0D;
          d17 = d1 * localzkg.a(i3).F() / 100.0D;
          d18 = d17 * Math.cos(d16);
          d19 = d17 * Math.sin(d16);
          d4 = paramzp.c() + paramzp.e() / 2.0D + d18;
          d5 = paramzp.d() + paramzp.f() / 2.0D - d19;
        }
        double d16 = d2 + m * d3 + d3 / 2.0D;
        double d17 = (360.0D - d8 - d9 / 2.0D) * 3.141592653589793D / 180.0D;
        double d18 = d16 * Math.cos(d17);
        double d19 = d16 * Math.sin(d17);
        if (localzqx.j() == 9)
        {
          if (!localzqx.a().q())
          {
            d17 -= localzqx.a().n() * 3.141592653589793D / 180.0D;
            d17 %= 6.283185307179586D;
          }
          if (!localzqx.a().r()) {
            d16 += d16 * localzqx.a().o() / 500.0D;
          }
          d18 = d16 * Math.cos(d17);
          d19 = d16 * Math.sin(d17);
        }
        d18 = d4 + d18;
        d19 = d5 - d19;
        d18 -= localzt.b() / 2.0F;
        d19 -= localzt.c() / 2.0F;
        localObject1 = new zq((float)d18, (float)d19, localzt.b(), localzt.c());
        a(paramzr, paramzje, n, i3, d13, (zq)localObject1, 0.0D);
        d8 += d9;
      }
    }
  }
  
  static void a(zr paramzr, zje paramzje, zp[] paramArrayOfzp, zbfc paramzbfc)
    throws Exception
  {
    a(paramzr, paramzje, paramArrayOfzp[0], paramzbfc);
    Object localObject1;
    if (paramzbfc.v().B().q())
    {
      float f1 = 0.0F;
      f1 = a(paramArrayOfzp[0], paramzbfc);
      if (f1 > paramArrayOfzp[0].e() * 0.3F) {
        f1 = paramArrayOfzp[0].e() * 0.3F;
      }
      localObject1 = new zq();
      ((zq)localObject1).a(paramArrayOfzp[0].c() + f1);
      ((zq)localObject1).c(paramArrayOfzp[0].e() - 2.0F * f1);
      ((zq)localObject1).b(paramArrayOfzp[0].d() + f1);
      ((zq)localObject1).d(paramArrayOfzp[0].f() - 2.0F * f1);
      a(paramzr, paramzje, (zq)localObject1, paramzbfc);
      localArrayList1 = a(paramzbfc, paramArrayOfzp[0]);
      a(paramzr, paramzje, paramArrayOfzp[0], paramzbfc);
      float f2 = 0.0F;
      for (int k = 0; k < paramzbfc.D().getCount(); k++)
      {
        int n = 0;
        Object localObject3;
        for (int i1 = 0; i1 < localArrayList1.size(); i1++)
        {
          localObject3 = (ArrayList)localArrayList1.get(i1);
          for (int i3 = 0; i3 < ((ArrayList)localObject3).size(); i3++) {
            if (((Integer)((ArrayList)localObject3).get(i3)).intValue() == k)
            {
              n = 1;
              break;
            }
          }
          if (n != 0) {
            break;
          }
        }
        if (n == 0)
        {
          zke localzke = paramzbfc.D().b(k);
          localObject3 = localzke.o();
          float[] arrayOfFloat;
          if ((((zqx)localObject3).j() == 0) || (((zqx)localObject3).j() == 4))
          {
            arrayOfFloat = new float[] { f2 };
            a(paramArrayOfzp[0], ((zqx)localObject3).b, arrayOfFloat);
            f2 = arrayOfFloat[0];
          }
          else if (((zqx)localObject3).j() == 9)
          {
            arrayOfFloat = new float[] { f2 };
            a(paramArrayOfzp[0], ((zqx)localObject3).a, arrayOfFloat);
            f2 = arrayOfFloat[0];
          }
        }
      }
      if (f2 > paramArrayOfzp[0].e() * 0.3F) {
        f2 = paramArrayOfzp[0].e() * 0.3F;
      }
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + (int)f2);
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (int)(f2 * 2.0F));
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + (int)f2);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (int)(f2 * 2.0F));
    }
    a(paramzr, paramzje, paramArrayOfzp[0], paramzbfc);
    a(paramzbfc, paramArrayOfzp[0].e() / 2);
    ArrayList localArrayList1 = a(paramzbfc, paramArrayOfzp[0]);
    for (int i = 0; (i < 10) && (localArrayList1.size() > 0); i++)
    {
      a(paramzbfc, paramArrayOfzp[0].e() / 2, localArrayList1);
      localObject1 = new ArrayList();
      for (int j = 0; j < localArrayList1.size(); j++)
      {
        ArrayList localArrayList3 = (ArrayList)localArrayList1.get(j);
        localObject2 = new ArrayList();
        for (int i2 = 0; i2 < localArrayList3.size(); i2++) {
          com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localArrayList3.get(i2));
        }
        com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject2);
      }
      ArrayList localArrayList2 = new ArrayList();
      a(paramzbfc, localArrayList1, paramArrayOfzp[0], paramArrayOfzp[0], localArrayList2);
      a(paramzbfc, paramArrayOfzp[0].e() / 2, (ArrayList)localObject1, localArrayList2);
      localArrayList1 = a(paramzbfc, paramArrayOfzp[0]);
      int m = 0;
      Object localObject2 = localArrayList1.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ArrayList localArrayList4 = (ArrayList)((Iterator)localObject2).next();
        m += localArrayList4.size();
      }
      if (localArrayList2.size() == m) {
        break;
      }
    }
  }
  
  static float a(zp paramzp, zbfc paramzbfc)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    return a(localzq, paramzbfc);
  }
  
  static float a(zq paramzq, zbfc paramzbfc)
  {
    ArrayList localArrayList = a(paramzbfc, paramzq);
    float f = 0.0F;
    for (int i = 0; i < paramzbfc.D().getCount(); i++)
    {
      int j = 0;
      Object localObject;
      for (int k = 0; k < localArrayList.size(); k++)
      {
        localObject = (ArrayList)localArrayList.get(k);
        for (int m = 0; m < ((ArrayList)localObject).size(); m++) {
          if (((Integer)((ArrayList)localObject).get(m)).intValue() == i)
          {
            j = 1;
            break;
          }
        }
        if (j != 0) {
          break;
        }
      }
      if (j == 0)
      {
        zke localzke = paramzbfc.D().b(i);
        localObject = localzke.o();
        float[] arrayOfFloat;
        if ((((zqx)localObject).j() == 0) || (((zqx)localObject).j() == 4))
        {
          arrayOfFloat = new float[] { f };
          a(paramzq, ((zqx)localObject).b, arrayOfFloat);
          f = arrayOfFloat[0];
        }
        else if (((zqx)localObject).j() == 9)
        {
          arrayOfFloat = new float[] { f };
          a(paramzq, ((zqx)localObject).a, arrayOfFloat);
          f = arrayOfFloat[0];
        }
      }
    }
    return f;
  }
  
  static void a(zr paramzr, zje paramzje, zp paramzp, zbfc paramzbfc)
    throws Exception
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(paramzr, paramzje, localzq, paramzbfc);
  }
  
  static void a(zr paramzr, zje paramzje, zq paramzq, zbfc paramzbfc)
    throws Exception
  {
    int i = paramzbfc.ai();
    double d1 = 0.0D;
    zkg localzkg = paramzbfc.D();
    for (int j = 0; j < localzkg.getCount(); j++) {
      d1 += Math.abs(localzkg.a(j).w());
    }
    double d2 = paramzq.f() + paramzq.h() / 2.0D;
    double d3 = paramzq.g() + paramzq.i() / 2.0D;
    double d4 = 90.0F - paramzbfc.U();
    double d5 = 0.0D;
    for (int k = 0; k < localzkg.getCount(); k++)
    {
      zke localzke = localzkg.b(k);
      zqx localzqx = localzke.o();
      float f1;
      if (localzqx.a().f().e()) {
        f1 = paramzje.a() * 0.175F;
      } else {
        f1 = paramzje.a() * 0.2F;
      }
      float f2 = paramzje.b();
      double d6 = d1 == 0.0D ? 0.0D : Math.abs(localzkg.a(k).w()) / d1;
      zt localzt = a(paramzr, paramzje.z(), i, k, d6, f1, f2, 0.0D);
      d5 = a(localzkg.a(k).w(), d1);
      double d7 = (d4 - d5 / 2.0D) % 360.0D;
      double d8 = d7 * 3.141592653589793D / 180.0D;
      localzqx.g = d8;
      double d9 = localzke.F() / 100.0F;
      double d10;
      if (paramzje.M() == 44) {
        d10 = paramzq.h() / 2.0D;
      } else {
        d10 = paramzq.h() / 2.0D / (1.0D + d9);
      }
      double d11 = d10 * d9;
      double d12 = (d9 + 1.0D) * d10 * Math.cos(d8);
      double d13 = (d9 + 1.0D) * d10 * Math.sin(d8);
      localzqx.d = new zo((float)(d2 + d12), (float)(d3 - d13));
      double d15 = 0.0D;
      double d16 = 0.0D;
      double d14;
      double[] arrayOfDouble1;
      switch (localzqx.j())
      {
      case 1: 
        d14 = d11 + d10 * 0.5D;
        d15 = d14 * Math.cos(d8);
        d16 = d14 * Math.sin(d8);
        d15 -= localzt.b() / 2.0F;
        d16 += localzt.c() / 2.0F;
        break;
      case 3: 
        d14 = d11 + d10 * 0.97D;
        d15 = d14 * Math.cos(d8);
        d16 = d14 * Math.sin(d8);
        localObject = new double[] { d15 };
        arrayOfDouble1 = new double[] { d16 };
        b((double[])localObject, arrayOfDouble1, d7, localzt);
        d15 = localObject[0];
        d16 = arrayOfDouble1[0];
        break;
      default: 
        d14 = d11 + d10 * 1.03D;
        d15 = d14 * Math.cos(d8);
        d16 = d14 * Math.sin(d8);
        localObject = new zo((float)d15, (float)d16);
        arrayOfDouble1 = new double[] { d15 };
        double[] arrayOfDouble2 = { d16 };
        a(arrayOfDouble1, arrayOfDouble2, d7, localzt);
        d15 = arrayOfDouble1[0];
        d16 = arrayOfDouble2[0];
        localzqx.a = new zq((float)(d2 + d15), (float)(d3 - d16), localzt.b(), localzt.c());
        if (localzqx.j() == 9)
        {
          if (!localzqx.a().q())
          {
            d8 -= localzqx.a().n() * 3.141592653589793D / 180.0D;
            d8 %= 6.283185307179586D;
          }
          if (!localzqx.a().r()) {
            d14 += d10 * localzqx.a().o() / 500.0D;
          }
          d15 = d14 * Math.cos(d8);
          d16 = d14 * Math.sin(d8);
          arrayOfDouble1 = new double[] { d15 };
          arrayOfDouble2 = new double[] { d16 };
          a(arrayOfDouble1, arrayOfDouble2, d7, localzt);
          d15 = arrayOfDouble1[0];
          d16 = arrayOfDouble2[0];
        }
        break;
      }
      d15 = d2 + d15;
      d16 = d3 - d16;
      Object localObject = new zq((float)d15, (float)d16, localzt.b(), localzt.c());
      d4 -= d5;
      localzqx.b = ((zq)localObject);
      localzqx.c = ((zq)localObject);
    }
  }
  
  private static void a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double paramDouble, zt paramzt)
  {
    double d1 = 17.5D;
    double d2 = 2.0D * d1;
    if ((paramDouble <= -90.0D + d1) && (paramDouble >= -90.0D - d1)) {
      paramArrayOfDouble1[0] -= (-90.0D + d1 - paramDouble) * paramzt.b() / d2;
    } else if ((paramDouble <= -90.0D - d1) && (paramDouble >= -270.0D + d1)) {
      paramArrayOfDouble1[0] -= paramzt.b();
    } else if ((paramDouble <= -270.0D + d1) && (paramDouble >= -270.0D - d1)) {
      paramArrayOfDouble1[0] -= (paramDouble - (-270.0D - d1)) * paramzt.b() / d2;
    } else if ((paramDouble >= 90.0D - d1) && (paramDouble <= 90.0D)) {
      paramArrayOfDouble1[0] -= (paramDouble - (90.0D - d1)) * paramzt.b() / d2;
    }
    if ((paramDouble <= -135.0D) && (paramDouble >= -225.0D)) {
      paramArrayOfDouble2[0] += (-135.0D - paramDouble) * paramzt.c() / 90.0D;
    } else if (((paramDouble <= -225.0D) && (paramDouble >= -315.0D)) || ((paramDouble <= 90.0D) && (paramDouble >= 45.0D))) {
      paramArrayOfDouble2[0] += paramzt.c();
    } else if ((paramDouble < -315.0D) && (paramDouble >= -360.0D)) {
      paramArrayOfDouble2[0] += (paramDouble - -405.0D) * paramzt.c() / 90.0D;
    } else if ((paramDouble <= 45.0D) && (paramDouble >= -45.0D)) {
      paramArrayOfDouble2[0] += (paramDouble - -45.0D) * paramzt.c() / 90.0D;
    }
  }
  
  private static void b(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double paramDouble, zt paramzt)
  {
    if ((paramDouble >= -112.5D) && (paramDouble <= -67.5D)) {
      paramArrayOfDouble1[0] -= (paramDouble - -112.5D) * paramzt.b() / 45.0D;
    } else if ((paramDouble >= -292.5D) && (paramDouble <= -247.5D)) {
      paramArrayOfDouble1[0] -= (-247.5D - paramDouble) * paramzt.b() / 45.0D;
    } else if ((paramDouble > 67.5D) && (paramDouble <= 90.0D)) {
      paramArrayOfDouble1[0] -= (112.5D - paramDouble) * paramzt.b() / 45.0D;
    } else if (((paramDouble >= -67.5D) && (paramDouble <= 67.5D)) || (paramDouble <= -292.5D)) {
      paramArrayOfDouble1[0] -= paramzt.b();
    }
    if ((paramDouble <= 22.5D) && (paramDouble >= -22.5D)) {
      paramArrayOfDouble2[0] += (22.5D - paramDouble) * paramzt.c() / 45.0D;
    } else if (paramDouble <= -337.5D) {
      paramArrayOfDouble2[0] += (-337.5D - paramDouble) * paramzt.c() / 45.0D;
    } else if ((paramDouble >= -202.5D) && (paramDouble <= -157.5D)) {
      paramArrayOfDouble2[0] += (paramDouble - -202.5D) * paramzt.c() / 45.0D;
    } else if ((paramDouble >= -157.5D) && (paramDouble <= -22.5D)) {
      paramArrayOfDouble2[0] += paramzt.c();
    }
  }
  
  private static void a(zbfc paramzbfc, double paramDouble)
  {
    zkg localzkg = paramzbfc.D();
    double d1 = paramDouble * a;
    double d2 = d1;
    ArrayList localArrayList = new ArrayList();
    if (paramzbfc.Q()) {
      for (int i = 0; i < localzkg.getCount(); i++) {
        if (localzkg.b(i).o().j() == 9)
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(i));
          zke localzke = localzkg.b(i);
          zqx localzqx = localzke.o();
          localzqx.h = true;
          if (localzqx.e.b()) {
            if (!localzqx.A())
            {
              localzqx.f = new zo(localzqx.b.f(), localzqx.b.g() + localzqx.b.i() / 2.0F);
              localzqx.e = new zo(localzqx.b.f() - (float)d1, localzqx.f.e());
            }
            else
            {
              localzqx.f = new zo(localzqx.b.l(), localzqx.b.k() + localzqx.b.i() / 2.0F);
              localzqx.e = new zo(localzqx.b.l() + (float)d1, localzqx.f.e());
            }
          }
        }
      }
    }
  }
  
  private static void a(zbfc paramzbfc, double paramDouble, ArrayList paramArrayList)
  {
    double d1 = paramDouble * a;
    double d2 = d1;
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      ArrayList localArrayList = (ArrayList)paramArrayList.get(i);
      for (int j = 0; j < localArrayList.size(); j++)
      {
        zke localzke = paramzbfc.D().b(((Integer)localArrayList.get(j)).intValue());
        zqx localzqx = localzke.o();
        localzqx.h = true;
        if (localzqx.e.b())
        {
          if (!localzqx.A()) {
            localzqx.b.a((float)(localzqx.d.d() + d1 + d2 * Math.abs(Math.cos(localzqx.g))));
          } else {
            localzqx.b.a((float)(localzqx.d.d() - localzqx.b.h() - d1 - d2 * Math.abs(Math.cos(localzqx.g))));
          }
          if (localzqx.B()) {
            localzqx.b.b((float)(localzqx.d.e() + d2 * Math.abs(Math.sin(localzqx.g)) - localzqx.b.i() / 2.0F));
          } else {
            localzqx.b.b((float)(localzqx.d.e() - d2 * Math.abs(Math.sin(localzqx.g)) - localzqx.b.i() / 2.0F));
          }
          if (!localzqx.A())
          {
            localzqx.f = new zo(localzqx.b.f(), localzqx.b.g() + localzqx.b.i() / 2.0F);
            localzqx.e = new zo(localzqx.b.f() - (float)d1, localzqx.f.e());
          }
          else
          {
            localzqx.f = new zo(localzqx.b.l(), localzqx.b.k() + localzqx.b.i() / 2.0F);
            localzqx.e = new zo(localzqx.b.l() + (float)d1, localzqx.f.e());
          }
        }
      }
    }
  }
  
  private static void a(zbfc paramzbfc, double paramDouble, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    double d1 = paramDouble * a;
    double d2 = d1;
    for (int i = 0; i < paramArrayList1.size(); i++)
    {
      ArrayList localArrayList = (ArrayList)paramArrayList1.get(i);
      for (int j = 0; j < localArrayList.size(); j++)
      {
        for (int k = 0; (k < paramArrayList2.size()) && ((Integer)localArrayList.get(j) != (Integer)paramArrayList2.get(k)); k++) {}
        if (k == paramArrayList2.size())
        {
          zke localzke = paramzbfc.D().b(((Integer)localArrayList.get(j)).intValue());
          zqx localzqx = localzke.o();
          if (!localzqx.A())
          {
            localzqx.f = new zo(localzqx.b.f(), localzqx.b.g() + localzqx.b.i() / 2.0F);
            localzqx.e = new zo(localzqx.b.f() - (float)d1, localzqx.f.e());
          }
          else
          {
            localzqx.f = new zo(localzqx.b.l(), localzqx.b.k() + localzqx.b.i() / 2.0F);
            localzqx.e = new zo(localzqx.b.l() + (float)d1, localzqx.f.e());
          }
        }
      }
    }
  }
  
  private static void a(zbfc paramzbfc, ArrayList paramArrayList1, zp paramzp1, zp paramzp2, ArrayList paramArrayList2)
  {
    Object localObject;
    for (int i = 0; i < paramArrayList1.size(); i++)
    {
      localObject = (ArrayList)paramArrayList1.get(i);
      b(paramzbfc, (ArrayList)localObject, paramzp1, paramzp2, paramArrayList2);
    }
    for (i = 0; i < paramArrayList2.size(); i++)
    {
      localObject = paramzbfc.D().b(((Integer)paramArrayList2.get(i)).intValue()).o();
      ((zqx)localObject).b = ((zqx)localObject).c;
      ((zqx)localObject).f = zo.a();
      ((zqx)localObject).e = zo.a();
    }
  }
  
  private static void b(zbfc paramzbfc, ArrayList paramArrayList1, zp paramzp1, zp paramzp2, ArrayList paramArrayList2)
  {
    zje localzje = paramzbfc.v();
    zp localzp = localzje.f;
    if (paramArrayList1.size() <= 1) {
      return;
    }
    float f1 = b;
    f1 = 2.0F;
    ArrayList localArrayList1 = new ArrayList();
    com.aspose.cells.b.a.a.zf.a(localArrayList1, paramArrayList1.get(0));
    Object localObject;
    for (int i = 1; i < paramArrayList1.size(); i++)
    {
      int j = ((Integer)localArrayList1.get(localArrayList1.size() - 1)).intValue();
      k = ((Integer)paramArrayList1.get(i)).intValue();
      if (k == j + 1)
      {
        com.aspose.cells.b.a.a.zf.a(localArrayList1, paramArrayList1.get(i));
      }
      else
      {
        for (int m = j + 1; m < k; m++)
        {
          localObject = paramzbfc.D().b(m).o();
          if (((zqx)localObject).b.h() != 0.0F) {
            if (((zqx)localObject).b.i() != 0.0F) {
              break;
            }
          }
        }
        if (m != k) {
          break;
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList1, paramArrayList1.get(i));
      }
    }
    ArrayList localArrayList2 = new ArrayList();
    if (i == paramArrayList1.size())
    {
      com.aspose.cells.b.a.a.zf.a(localArrayList2, paramArrayList1);
    }
    else
    {
      for (k = i; k < paramArrayList1.size(); k++) {
        com.aspose.cells.b.a.a.zf.a(localArrayList2, paramArrayList1.get(k));
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList1);
    }
    int k = localArrayList2.size() / 2;
    if (localArrayList2.size() == 2) {
      k = 0;
    }
    zqx localzqx1 = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
    int n;
    zqx localzqx2;
    float f6;
    zqx localzqx3;
    float f10;
    int i2;
    float f8;
    switch (localzqx1.C())
    {
    case 1: 
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if (((zqx)localObject).b.g() > localzp.d()) {
        if (((zqx)localObject).b.g() - ((zqx)localObject).b.i() / 2.0F > localzp.d()) {
          ((zqx)localObject).b.b(((zqx)localObject).b.g() - ((zqx)localObject).b.i() / 2.0F);
        } else {
          ((zqx)localObject).b.b(localzp.d());
        }
      }
      if (((zqx)localObject).b.l() < localzp.i()) {
        if (((zqx)localObject).b.l() + ((zqx)localObject).b.h() / 2.0F < localzp.i()) {
          ((zqx)localObject).b.a(((zqx)localObject).b.f() + ((zqx)localObject).b.h() / 2.0F);
        } else {
          ((zqx)localObject).b.a(localzp.i() - ((zqx)localObject).b.h());
        }
      }
      for (n = k - 1; n >= 0; n--)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqx)localObject).b.f() - localzqx2.b.l());
        localzqx2.b.a(localzqx2.b.f() - (f6 + f1));
        localObject = localzqx2;
        if (((zqx)localObject).b.g() > localzp.d()) {
          if (((zqx)localObject).b.g() - ((zqx)localObject).b.i() > localzp.d()) {
            ((zqx)localObject).b.b(((zqx)localObject).b.g() - ((zqx)localObject).b.i());
          } else {
            ((zqx)localObject).b.b(localzp.d());
          }
        }
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = k + 1; n < localArrayList2.size(); n++)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqx)localObject).b.m() - localzqx2.b.g());
        localzqx2.b.b(localzqx2.b.g() + (f6 + f1));
        localObject = localzqx2;
        if (((zqx)localObject).b.l() < localzp.i()) {
          if (((zqx)localObject).b.l() + ((zqx)localObject).b.h() / 2.0F < localzp.i()) {
            ((zqx)localObject).b.a(((zqx)localObject).b.f() + ((zqx)localObject).b.h() / 2.0F);
          } else {
            ((zqx)localObject).b.a(localzp.i() - ((zqx)localObject).b.h());
          }
        }
      }
      break;
    case 2: 
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = 0; n < localArrayList2.size(); n++)
      {
        localObject = paramzbfc.D().b(((Integer)localArrayList2.get(n)).intValue()).o();
        if (((zqx)localObject).b.l() < localzp.i()) {
          if (((zqx)localObject).b.l() + ((zqx)localObject).b.h() / 2.0F < localzp.i()) {
            ((zqx)localObject).b.a(((zqx)localObject).b.f() + ((zqx)localObject).b.h() / 2.0F);
          } else {
            ((zqx)localObject).b.a(localzp.i() - ((zqx)localObject).b.h());
          }
        }
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = k - 1; n >= 0; n--)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqx)localObject).b.g() - localzqx2.b.m());
        localzqx2.b.b(localzqx2.b.g() - (f6 + f1));
        localObject = localzqx2;
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = k + 1; n < localArrayList2.size(); n++)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqx)localObject).b.m() - localzqx2.b.g());
        localzqx2.b.b(localzqx2.b.g() + (f6 + f1));
        localObject = localzqx2;
      }
      break;
    case 3: 
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if (((zqx)localObject).b.m() < localzp.j()) {
        if (((zqx)localObject).b.m() + ((zqx)localObject).b.i() / 2.0F < localzp.j()) {
          ((zqx)localObject).b.b(((zqx)localObject).b.g() + ((zqx)localObject).b.i() / 2.0F);
        } else {
          ((zqx)localObject).b.b(localzp.j() - ((zqx)localObject).b.i());
        }
      }
      if (((zqx)localObject).b.l() < localzp.i()) {
        if (((zqx)localObject).b.l() + ((zqx)localObject).b.h() / 2.0F < localzp.i()) {
          ((zqx)localObject).b.a(((zqx)localObject).b.f() + ((zqx)localObject).b.h() / 2.0F);
        } else {
          ((zqx)localObject).b.a(localzp.i() - ((zqx)localObject).b.h());
        }
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = k - 1; n >= 0; n--)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqx)localObject).b.g() - localzqx2.b.m());
        localzqx2.b.b(localzqx2.b.g() - (f6 + f1));
        localObject = localzqx2;
        if (((zqx)localObject).b.l() < localzp.i()) {
          if (((zqx)localObject).b.l() + ((zqx)localObject).b.h() / 2.0F < localzp.i()) {
            ((zqx)localObject).b.a(((zqx)localObject).b.f() + ((zqx)localObject).b.h() / 2.0F);
          } else {
            ((zqx)localObject).b.a(localzp.i() - ((zqx)localObject).b.h());
          }
        }
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = k + 1; n < localArrayList2.size(); n++)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqx)localObject).b.m() - localzqx2.b.g());
        localzqx2.b.b(localzqx2.b.g() + (f6 + f1));
        localObject = localzqx2;
      }
      break;
    case 4: 
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if ((((zqx)localObject).g > -1.5707963267948966D) && (localArrayList2.size() > 2)) {
        ((zqx)localObject).b.a(((zqx)localObject).b.f() - ((zqx)localObject).b.h() / 2.0F);
      }
      if (((zqx)localObject).b.m() < localzp.j()) {
        if (((zqx)localObject).b.m() + ((zqx)localObject).b.i() < localzp.j()) {
          ((zqx)localObject).b.b(((zqx)localObject).b.g() + ((zqx)localObject).b.i());
        } else {
          ((zqx)localObject).b.b(localzp.j() - ((zqx)localObject).b.i());
        }
      }
      for (n = k - 1; n >= 0; n--)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqx)localObject).b.l() - localzqx2.b.f());
        localzqx2.b.a(localzqx2.b.f() + (f6 + f1));
        localObject = localzqx2;
      }
      if (k >= 2)
      {
        localObject = paramzbfc.D().b(((Integer)localArrayList2.get(localArrayList2.size() - 1)).intValue()).o();
        float f2 = 0.0F;
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(k - 1)).intValue()).o();
        f2 = localzp.j() - localzqx2.b.m();
        f2 /= (k - 1);
        localObject = paramzbfc.D().b(((Integer)localArrayList2.get(0)).intValue()).o();
        for (int i5 = 1; i5 < k; i5++)
        {
          localzqx3 = paramzbfc.D().b(((Integer)localArrayList2.get(i5)).intValue()).o();
          f10 = Math.abs(((zqx)localObject).b.m() - localzqx3.b.g());
          if (f10 < f2) {
            localzqx3.b.b(localzqx3.b.g() + (f10 + f1));
          } else if (f2 > 0.0F) {
            localzqx3.b.b(localzqx3.b.g() + f2);
          }
          localObject = localzqx3;
        }
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (int i1 = k + 1; i1 < localArrayList2.size(); i1++)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(i1)).intValue()).o();
        float f7 = Math.abs(((zqx)localObject).b.f() - localzqx2.b.l());
        localzqx2.b.a(localzqx2.b.f() - (f7 + f1));
        localObject = localzqx2;
      }
      if (localArrayList2.size() - (k + 1) >= 2)
      {
        localObject = paramzbfc.D().b(((Integer)localArrayList2.get(localArrayList2.size() - 1)).intValue()).o();
        float f3 = 0.0F;
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(k + 1)).intValue()).o();
        f3 = localzp.j() - localzqx2.b.m();
        f3 /= (k - 1);
        for (int i6 = localArrayList2.size() - 2; i6 > k; i6--)
        {
          localzqx3 = paramzbfc.D().b(((Integer)localArrayList2.get(i6)).intValue()).o();
          f10 = Math.abs(((zqx)localObject).b.m() - localzqx3.b.g());
          if (f10 < f3) {
            localzqx3.b.b(localzqx3.b.g() + (f10 + f1));
          } else if (f3 > 0.0F) {
            localzqx3.b.b(localzqx3.b.g() + f3);
          }
          localObject = localzqx3;
        }
      }
      break;
    case 5: 
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if (((zqx)localObject).b.m() < localzp.j()) {
        if (((zqx)localObject).b.m() + ((zqx)localObject).b.i() / 2.0F < localzp.j()) {
          ((zqx)localObject).b.b(((zqx)localObject).b.g() + ((zqx)localObject).b.i() / 2.0F);
        } else {
          ((zqx)localObject).b.b(localzp.j() - ((zqx)localObject).b.i());
        }
      }
      if (((zqx)localObject).b.f() > localzp.c()) {
        if (((zqx)localObject).b.f() + ((zqx)localObject).b.h() / 2.0F > localzp.c()) {
          ((zqx)localObject).b.a(((zqx)localObject).b.f() - ((zqx)localObject).b.h() / 2.0F);
        } else {
          ((zqx)localObject).b.a(localzp.c() + ((zqx)localObject).b.h());
        }
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = k - 1; i2 >= 0; i2--)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqx)localObject).b.l() - localzqx2.b.f());
        localzqx2.b.a(localzqx2.b.f() + (f8 + f1));
        localObject = localzqx2;
        if (((zqx)localObject).b.m() < localzp.j()) {
          if (((zqx)localObject).b.m() + ((zqx)localObject).b.i() < localzp.j()) {
            ((zqx)localObject).b.b(((zqx)localObject).b.g() + ((zqx)localObject).b.i());
          } else {
            ((zqx)localObject).b.b(localzp.j() - ((zqx)localObject).b.i());
          }
        }
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = k + 1; i2 < localArrayList2.size(); i2++)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqx)localObject).b.g() - localzqx2.b.m());
        localzqx2.b.b(localzqx2.b.g() - (f8 + f1));
        localObject = localzqx2;
        if (((zqx)localObject).b.f() > localzp.c()) {
          if (((zqx)localObject).b.f() + ((zqx)localObject).b.h() > localzp.c()) {
            ((zqx)localObject).b.a(((zqx)localObject).b.f() - ((zqx)localObject).b.h());
          } else {
            ((zqx)localObject).b.a(localzp.c() + ((zqx)localObject).b.h());
          }
        }
      }
      break;
    case 6: 
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = 0; i2 < localArrayList2.size(); i2++)
      {
        localObject = paramzbfc.D().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        if (((zqx)localObject).b.f() > localzp.c()) {
          if (((zqx)localObject).b.f() + ((zqx)localObject).b.h() / 2.0F > localzp.c()) {
            ((zqx)localObject).b.a(((zqx)localObject).b.f() - ((zqx)localObject).b.h() / 2.0F);
          } else {
            ((zqx)localObject).b.a(localzp.c() + ((zqx)localObject).b.h());
          }
        }
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = k + 1; i2 < localArrayList2.size(); i2++)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqx)localObject).b.g() - localzqx2.b.m());
        localzqx2.b.b(localzqx2.b.g() - (f8 + f1));
        localObject = localzqx2;
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = k - 1; i2 >= 0; i2--)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqx)localObject).b.m() - localzqx2.b.g());
        localzqx2.b.b(localzqx2.b.g() + (f8 + f1));
        localObject = localzqx2;
      }
      break;
    case 7: 
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if (((zqx)localObject).b.g() > localzp.d()) {
        if (((zqx)localObject).b.g() - ((zqx)localObject).b.i() / 2.0F > localzp.d()) {
          ((zqx)localObject).b.b(((zqx)localObject).b.g() - ((zqx)localObject).b.i() / 2.0F);
        } else {
          ((zqx)localObject).b.b(localzp.d());
        }
      }
      if (((zqx)localObject).b.f() > localzp.c()) {
        if (((zqx)localObject).b.f() + ((zqx)localObject).b.h() / 2.0F > localzp.c()) {
          ((zqx)localObject).b.a(((zqx)localObject).b.f() - ((zqx)localObject).b.h() / 2.0F);
        } else {
          ((zqx)localObject).b.a(localzp.c() + ((zqx)localObject).b.h());
        }
      }
      for (i2 = k - 1; i2 >= 0; i2--)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqx)localObject).b.m() - localzqx2.b.g());
        localzqx2.b.b(localzqx2.b.g() + (f8 + f1));
        localObject = localzqx2;
        if (((zqx)localObject).b.f() > localzp.c()) {
          if (((zqx)localObject).b.f() + ((zqx)localObject).b.h() > localzp.c()) {
            ((zqx)localObject).b.a(((zqx)localObject).b.f() - ((zqx)localObject).b.h());
          } else {
            ((zqx)localObject).b.a(localzp.c() + ((zqx)localObject).b.h());
          }
        }
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = k + 1; i2 < localArrayList2.size(); i2++)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqx)localObject).b.l() - localzqx2.b.f());
        localzqx2.b.a(localzqx2.b.f() + (f8 + f1));
        localObject = localzqx2;
        if (((zqx)localObject).b.g() > localzp.d()) {
          if (((zqx)localObject).b.g() - ((zqx)localObject).b.i() > localzp.d()) {
            ((zqx)localObject).b.b(((zqx)localObject).b.g() - ((zqx)localObject).b.i());
          } else {
            ((zqx)localObject).b.b(localzp.d());
          }
        }
      }
      break;
    case 8: 
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if ((((zqx)localObject).g < 0.0D) && (((zqx)localObject).g > -4.71238898038469D) && (localArrayList2.size() > 2)) {
        ((zqx)localObject).b.a(((zqx)localObject).b.f() + ((zqx)localObject).b.h() / 2.0F);
      }
      if (((zqx)localObject).b.g() > localzp.d()) {
        if (((zqx)localObject).b.g() - ((zqx)localObject).b.i() > localzp.d()) {
          ((zqx)localObject).b.b(((zqx)localObject).b.g() - ((zqx)localObject).b.i());
        } else {
          ((zqx)localObject).b.b(localzp.d());
        }
      }
      for (i2 = k - 1; i2 >= 0; i2--)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqx)localObject).b.f() - localzqx2.b.l());
        localzqx2.b.a(localzqx2.b.f() - (f8 + f1));
        localObject = localzqx2;
      }
      if (k >= 2)
      {
        localObject = paramzbfc.D().b(((Integer)localArrayList2.get(localArrayList2.size() - 1)).intValue()).o();
        float f4 = 0.0F;
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(k - 1)).intValue()).o();
        f4 = localzqx2.b.g() - localzp.d();
        f4 /= (k - 1);
        localObject = paramzbfc.D().b(((Integer)localArrayList2.get(0)).intValue()).o();
        for (int i7 = 1; i7 < k; i7++)
        {
          localzqx3 = paramzbfc.D().b(((Integer)localArrayList2.get(i7)).intValue()).o();
          f10 = Math.abs(((zqx)localObject).b.g() - localzqx3.b.m());
          if (f10 < f4) {
            localzqx3.b.b(localzqx3.b.g() - (f10 + f1));
          } else if (f4 > 0.0F) {
            localzqx3.b.b(localzqx3.b.g() - f4);
          }
          localObject = localzqx3;
        }
      }
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (int i3 = k + 1; i3 < localArrayList2.size(); i3++)
      {
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(i3)).intValue()).o();
        float f9 = Math.abs(((zqx)localObject).b.l() - localzqx2.b.f());
        localzqx2.b.a(localzqx2.b.f() + (f9 + f1));
        localObject = localzqx2;
      }
      if (localArrayList2.size() - (k + 1) >= 2)
      {
        localObject = paramzbfc.D().b(((Integer)localArrayList2.get(localArrayList2.size() - 1)).intValue()).o();
        float f5 = 0.0F;
        localzqx2 = paramzbfc.D().b(((Integer)localArrayList2.get(k + 1)).intValue()).o();
        f5 = localzqx2.b.g() - localzp.d();
        f5 /= (k - 1);
        for (int i8 = localArrayList2.size() - 2; i8 > k; i8--)
        {
          localzqx3 = paramzbfc.D().b(((Integer)localArrayList2.get(i8)).intValue()).o();
          f10 = Math.abs(((zqx)localObject).b.g() - localzqx3.b.m());
          if (f10 < f5) {
            localzqx3.b.b(localzqx3.b.g() - (f10 + f1));
          } else if (f5 > 0.0F) {
            localzqx3.b.b(localzqx3.b.g() - f5);
          }
          localObject = localzqx3;
        }
      }
      break;
    }
    for (int i4 = 0; i4 < localArrayList2.size(); i4++)
    {
      localObject = paramzbfc.D().b(((Integer)localArrayList2.get(i4)).intValue()).o();
      if (((zqx)localObject).b.f() < localzp.c()) {
        ((zqx)localObject).b.a(localzp.c());
      }
      if (((zqx)localObject).b.g() < localzp.d()) {
        ((zqx)localObject).b.b(localzp.d());
      }
      if (((zqx)localObject).b.l() > localzp.e()) {
        ((zqx)localObject).b.a(localzp.e() - ((zqx)localObject).b.h());
      }
      if (((zqx)localObject).b.m() > localzp.f()) {
        ((zqx)localObject).b.b(localzp.f() - ((zqx)localObject).b.i());
      }
    }
  }
  
  private static boolean a(zq paramzq1, zq paramzq2, float paramFloat)
  {
    paramzq1 = new zq(paramzq1.f(), paramzq1.g(), paramzq1.h(), paramzq1.i());
    paramzq2 = new zq(paramzq2.f(), paramzq2.g(), paramzq2.h(), paramzq2.i());
    if ((paramzq1.h() == 0.0F) || (paramzq1.i() == 0.0F) || (paramzq1.h() == 0.0F) || (paramzq1.i() == 0.0F)) {
      return false;
    }
    paramzq1.a(paramFloat / 2.0F, paramFloat / 2.0F);
    paramzq2.a(paramFloat / 2.0F, paramFloat / 2.0F);
    if (((paramzq2.j() >= paramzq1.j()) && (paramzq2.j() <= paramzq1.l())) || ((paramzq2.l() >= paramzq1.j()) && (paramzq2.l() <= paramzq1.l()) && (((paramzq2.m() >= paramzq1.k()) && (paramzq2.m() <= paramzq1.m())) || ((paramzq2.k() >= paramzq1.k()) && (paramzq2.k() <= paramzq1.m()))))) {
      return true;
    }
    zq localzq = paramzq1;
    paramzq1 = paramzq2;
    paramzq2 = localzq;
    return ((paramzq2.j() >= paramzq1.j()) && (paramzq2.j() <= paramzq1.l())) || ((paramzq2.l() >= paramzq1.j()) && (paramzq2.l() <= paramzq1.l()) && (((paramzq2.m() >= paramzq1.k()) && (paramzq2.m() <= paramzq1.m())) || ((paramzq2.k() >= paramzq1.k()) && (paramzq2.k() <= paramzq1.m()))));
  }
  
  private static ArrayList a(zbfc paramzbfc, zp paramzp)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    return a(paramzbfc, localzq);
  }
  
  private static ArrayList a(zbfc paramzbfc, zq paramzq)
  {
    float f = b;
    zkg localzkg = paramzbfc.D();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject;
    for (int i = 0; i < localzkg.getCount(); i++)
    {
      localObject = localzkg.b(i).o();
      if ((((zqx)localObject).j() == 0) && (((zqx)localObject).b.h() != 0.0F) && (((zqx)localObject).b.i() != 0.0F))
      {
        ArrayList localArrayList2 = new ArrayList();
        int k = 0;
        for (int m = 0; m < localzkg.getCount(); m++)
        {
          zqx localzqx = localzkg.b(m).o();
          if ((localzqx.j() == 0) && (localzqx.b.h() != 0.0F) && (localzqx.b.i() != 0.0F) && (i != m))
          {
            if (((zqx)localObject).a().f().e()) {
              f = b;
            } else {
              f = -2.0F;
            }
            if (a(((zqx)localObject).b, localzqx.b, f))
            {
              k = 1;
              com.aspose.cells.b.a.a.zf.a(localArrayList2, Integer.valueOf(m));
            }
          }
        }
        if (k != 0)
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Integer.valueOf(i));
          Collections.sort(localArrayList2);
          com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList2);
        }
      }
    }
    for (i = 0; i < localArrayList1.size(); i++)
    {
      localObject = (ArrayList)localArrayList1.get(i);
      for (int j = i + 1; j < localArrayList1.size(); j++)
      {
        ArrayList localArrayList3 = (ArrayList)localArrayList1.get(j);
        if (((ArrayList)localObject).size() <= localArrayList3.size())
        {
          if (a((ArrayList)localObject, localArrayList3))
          {
            localArrayList1.remove(i);
            i--;
            break;
          }
        }
        else if (a(localArrayList3, (ArrayList)localObject))
        {
          localArrayList1.remove(j);
          j--;
        }
      }
    }
    return localArrayList1;
  }
  
  private static boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    for (int i = 0; i < paramArrayList1.size(); i++) {
      if (!paramArrayList2.contains(paramArrayList1.get(i))) {
        return false;
      }
    }
    return true;
  }
  
  private static void a(zp paramzp, zq paramzq, float[] paramArrayOfFloat)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(localzq, paramzq, paramArrayOfFloat);
  }
  
  private static void a(zq paramzq1, zq paramzq2, float[] paramArrayOfFloat)
  {
    float f;
    if (paramzq2.j() < paramzq1.j())
    {
      f = paramzq1.j() - paramzq2.j();
      if (f > paramArrayOfFloat[0]) {
        paramArrayOfFloat[0] = f;
      }
    }
    if (paramzq2.k() < paramzq1.k())
    {
      f = paramzq1.k() - paramzq2.k();
      if (f > paramArrayOfFloat[0]) {
        paramArrayOfFloat[0] = f;
      }
    }
    if (paramzq2.l() > paramzq1.l())
    {
      f = paramzq2.l() - paramzq1.l();
      if (f > paramArrayOfFloat[0]) {
        paramArrayOfFloat[0] = f;
      }
    }
    if (paramzq2.m() > paramzq1.m())
    {
      f = paramzq2.m() - paramzq1.m();
      if (f > paramArrayOfFloat[0]) {
        paramArrayOfFloat[0] = f;
      }
    }
  }
  
  private static double a(double paramDouble1, double paramDouble2)
  {
    if (paramDouble2 == 0.0D) {
      return 0.0D;
    }
    return Math.abs(paramDouble1) / paramDouble2 * 360.0D;
  }
  
  static zq a(zq paramzq, double paramDouble1, double paramDouble2)
  {
    com.aspose.cells.a.d.zs localzs = new com.aspose.cells.a.d.zs(Color.getBlack(), 1.0F);
    try
    {
      ze localze = new ze();
      localze.b(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), (float)paramDouble1, (float)paramDouble2);
      localze.a(localzs.r());
      zq localzq = zn.a(localze);
      return localzq;
    }
    finally
    {
      if (localzs != null) {
        localzs.s();
      }
    }
  }
  
  static zt a(zr paramzr, zbfe paramzbfe, int paramInt1, int paramInt2, double paramDouble1, float paramFloat1, float paramFloat2, double paramDouble2)
  {
    zbfc localzbfc = paramzbfe.c(paramInt1);
    zje localzje = localzbfc.v();
    zke localzke = localzbfc.D().b(paramInt2);
    if (localzke == null) {
      localzke = localzbfc.u();
    } else if ((localzke.x() == 3) && (localzke.a())) {
      return new zt(0.0F, 0.0F);
    }
    int i = localzbfc.af();
    zbs localzbs;
    ArrayList localArrayList;
    if (i == 1)
    {
      localzbs = localzje.e();
      localArrayList = localzje.z().c();
    }
    else
    {
      localzbs = localzje.g();
      localArrayList = localzje.z().d();
    }
    zqx localzqx = localzke.o();
    boolean bool1 = localzqx.r();
    boolean bool2 = localzqx.q();
    String str1 = localzqx.f() ? "" : localzqx.p();
    String str2 = "".equals(localzqx.p()) ? "0%" : localzqx.p();
    String str3 = localzbfc.i();
    String str4 = "";
    if (paramInt2 == -1) {
      str4 = localzje.T();
    } else if (paramInt2 < localzbs.l.size()) {
      str4 = zqz.a(localzje.an(), localzbs.l.get(paramInt2), str1, bool1, localzje.U());
    }
    if (bool2)
    {
      str5 = (paramInt2 >= 0) && (paramInt2 < localArrayList.size()) ? ((zgm)localArrayList.get(paramInt2)).c() : "";
      boolean bool3 = (paramInt2 >= 0) && (paramInt2 < localArrayList.size()) ? ((zgm)localArrayList.get(paramInt2)).b() : false;
      if (paramInt2 == -1) {
        str4 = localzje.T();
      } else if (paramInt2 < localzbs.l.size()) {
        str4 = zqz.a(localzje.an(), localzbs.l.get(paramInt2), str5, bool3, localzje.U());
      }
    }
    String str5 = paramInt2 == -1 ? zqz.a(localzje.an(), Double.valueOf(paramDouble2), str1, bool1, localzje.U()) : zqz.a(localzje.an(), Double.valueOf(localzke.w()), str1, bool1, localzje.U());
    if (bool2) {
      str5 = paramInt2 == -1 ? zqz.a(localzje.an(), Double.valueOf(paramDouble2), str1, bool1, localzje.U()) : zqz.a(localzje.an(), Double.valueOf(localzke.w()), localzke.A(), localzke.B(), localzje.U());
    }
    String str6 = zqz.a(localzje.an(), Double.valueOf(paramDouble1), str2, bool1, localzje.U());
    String str7 = localzqx.l();
    zg localzg = localzqx.a().h();
    int j = localzqx.m();
    int k = localzqx.n();
    int m = localzqx.o();
    zt localzt1 = new zt(localzqx.y(), localzqx.z());
    String str8 = "";
    if (localzqx.s() == null)
    {
      if (localzqx.h()) {
        str8 = str8 + str3;
      }
      if (localzqx.d())
      {
        if (!"".equals(str8)) {
          str8 = str8 + str7;
        }
        str8 = str8 + str4;
      }
      if (localzqx.g())
      {
        if (!"".equals(str8)) {
          str8 = str8 + str7;
        }
        str8 = str8 + str5;
      }
      if (localzqx.f())
      {
        if (!"".equals(str8)) {
          str8 = str8 + str7;
        }
        str8 = str8 + str6;
      }
    }
    else
    {
      str8 = localzqx.s();
    }
    zt localzt2 = new zt(paramFloat1, paramFloat2);
    com.aspose.cells.b.a.b.zs localzs = zbvx.a(paramzr, str8, j, localzg, localzt2, k, m);
    if ("".equals(str8)) {
      return new zt(0.0F, 0.0F);
    }
    zt localzt3;
    if (localzqx.e()) {
      localzt3 = new zt(localzs.b() + localzt1.b(), localzs.c());
    } else {
      localzt3 = new zt(localzs.b(), localzs.c());
    }
    if (localzqx.e()) {
      localzt3.a(localzt3.b() + 2 * zqz.a);
    }
    localzt3.b(localzt3.c() + 2 * zqz.a);
    return localzt3;
  }
  
  static void a(zr paramzr, zje paramzje, int paramInt1, int paramInt2, double paramDouble1, zq paramzq, double paramDouble2)
    throws Exception
  {
    zq[] arrayOfzq = { paramzq };
    paramzje.a(arrayOfzq);
    paramzq = arrayOfzq[0];
    zbfc localzbfc = paramzje.z().c(paramInt1);
    zke localzke = localzbfc.D().b(paramInt2);
    if (localzke == null) {
      localzke = localzbfc.u();
    } else if ((localzke.x() == 3) && (localzke.a())) {
      return;
    }
    int i = localzbfc.af();
    zbs localzbs;
    ArrayList localArrayList;
    if (i == 1)
    {
      localzbs = paramzje.e();
      localArrayList = paramzje.z().c();
    }
    else
    {
      localzbs = paramzje.g();
      localArrayList = paramzje.z().d();
    }
    zqx localzqx = localzke.o();
    boolean bool1 = localzqx.r();
    boolean bool2 = localzqx.q();
    String str1 = localzqx.f() ? "" : localzqx.p();
    String str2 = "".equals(localzqx.p()) ? "0%" : localzqx.p();
    String str3 = localzbfc.i();
    String str4 = "";
    if (paramInt2 == -1) {
      str4 = paramzje.T();
    } else if (paramInt2 < localzbs.l.size()) {
      str4 = zqz.a(paramzje.an(), localzbs.l.get(paramInt2), str1, bool1, paramzje.U());
    }
    boolean bool3 = false;
    if (bool2)
    {
      str5 = (paramInt2 >= 0) && (paramInt2 < localArrayList.size()) ? ((zgm)localArrayList.get(paramInt2)).c() : "";
      bool4 = (paramInt2 >= 0) && (paramInt2 < localArrayList.size()) ? ((zgm)localArrayList.get(paramInt2)).b() : false;
      if (paramInt2 == -1) {
        str4 = paramzje.T();
      } else if (paramInt2 < localzbs.l.size()) {
        str4 = zqz.a(paramzje.an(), localzbs.l.get(paramInt2), str5, bool4, paramzje.U());
      }
      if ((paramInt2 >= 0) && (paramInt2 < localzbs.l.size())) {
        bool3 = zqz.a(localzbs.l.get(paramInt2), str5);
      }
    }
    String str5 = paramInt2 == -1 ? zqz.a(paramzje.an(), Double.valueOf(paramDouble2), str1, bool1, paramzje.U()) : zqz.a(paramzje.an(), Double.valueOf(localzke.w()), str1, bool1, paramzje.U());
    boolean bool4 = false;
    if (bool2)
    {
      str5 = paramInt2 == -1 ? zqz.a(paramzje.an(), Double.valueOf(paramDouble2), str1, bool1, paramzje.U()) : zqz.a(paramzje.an(), Double.valueOf(localzke.w()), localzke.A(), localzke.B(), paramzje.U());
      if (paramInt2 != -1) {
        bool4 = zqz.a(Double.valueOf(localzke.w()), localzke.A());
      }
    }
    paramDouble1 += localzqx.i;
    String str6 = zqz.a(paramzje.an(), Double.valueOf(paramDouble1), str2, bool1, paramzje.U());
    String str7 = localzqx.l();
    zg localzg = localzqx.a().h();
    Color localColor = localzqx.a().j();
    int j = localzqx.m();
    int k = localzqx.n();
    int m = localzqx.o();
    zt localzt = new zt(localzqx.y(), localzqx.z());
    localzqx.a().b = new zp((int)paramzq.f(), (int)paramzq.g(), (int)paramzq.h(), (int)paramzq.i());
    localzqx.a().a = localzqx.a().b;
    zjz.a(paramzr, localzqx.a());
    int n = localzqx.e() ? (int)(paramzq.f() + zqz.a) : (int)paramzq.f();
    int i1 = (int)paramzq.g() + zqz.a;
    int i2 = localzqx.e() ? (int)(paramzq.h() - 2 * zqz.a) : (int)paramzq.h();
    int i3 = (int)paramzq.i() - 2 * zqz.a;
    if (localzqx.e())
    {
      localObject = new zq(paramzq.f() + zqz.a, paramzq.g() + zqz.a, localzt.b(), localzt.c());
      zana.a(paramzr, (zq)localObject, localzbfc, paramInt2);
      n += (int)localzt.b();
      i2 -= (int)localzt.b();
    }
    Object localObject = "";
    if (localzqx.s() == null)
    {
      if (localzqx.h()) {
        localObject = (String)localObject + str3;
      }
      if (localzqx.d())
      {
        if (!"".equals(localObject)) {
          localObject = (String)localObject + str7;
        }
        localObject = (String)localObject + str4;
      }
      if (localzqx.g())
      {
        if (!"".equals(localObject)) {
          localObject = (String)localObject + str7;
        }
        localObject = (String)localObject + str5;
      }
      if (localzqx.f())
      {
        if (!"".equals(localObject)) {
          localObject = (String)localObject + str7;
        }
        localObject = (String)localObject + str6;
      }
    }
    else
    {
      localObject = localzqx.s();
    }
    if (!"".equals(localObject))
    {
      zp localzp = new zp(n, i1, i2, i3);
      if ((bool3) || (bool4)) {
        localColor = Color.getRed();
      }
      zqz.a(paramzr, localzqx, localzp, (String)localObject, j, localzg, localColor, k, m);
    }
  }
  
  public static void a(zkg paramzkg)
  {
    double d1 = 0.0D;
    for (int i = 0; i < paramzkg.getCount(); i++) {
      d1 += Math.abs(paramzkg.a(i).w());
    }
    if (d1 == 0.0D) {
      return;
    }
    double d2 = 0.0D;
    double d3 = 1.0D;
    int j = -1;
    int k = -1;
    int m = 0;
    for (int n = 0; n < paramzkg.getCount(); n++)
    {
      zke localzke1 = paramzkg.b(n);
      d5 = Math.abs(paramzkg.a(n).w());
      double d6 = d5 / d1 * 100.0D;
      m += (int)(d6 + 0.5D);
      double d7 = d6 - (int)d6;
      if ((d7 < 0.5D) && (d7 > d2))
      {
        d2 = d7;
        j = n;
      }
      if ((d7 > 0.5D) && (d7 < d3))
      {
        d3 = d7;
        k = n;
      }
    }
    double d4 = 0.0D;
    double d5 = 1.0D;
    int i1 = -1;
    int i2 = -1;
    Object localObject;
    if ((m < 99) || (m > 101)) {
      for (int i3 = 0; i3 < paramzkg.getCount(); i3++)
      {
        localObject = paramzkg.b(i3);
        double d8 = Math.abs(paramzkg.a(i3).w());
        double d9 = d8 / d1 * 100.0D;
        m += (int)(d9 + 0.5D);
        double d10 = d9 - (int)d9;
        if ((i3 != j) && (d10 <= d2) && (d10 > d4))
        {
          d4 = d10;
          i1 = i3;
        }
        if ((i3 != k) && (d10 >= d3) && (d10 < d5))
        {
          d5 = d10;
          i2 = i3;
        }
      }
    }
    zke localzke2;
    String str;
    if ((j != -1) && (m < 100))
    {
      localzke2 = paramzkg.b(j);
      localObject = localzke2.o();
      str = "";
      if (((zqx)localObject).q()) {
        str = "0%";
      } else {
        str = "".equals(((zqx)localObject).p()) ? "0%" : ((zqx)localObject).p();
      }
      if ("0%".equals(str)) {
        ((zqx)localObject).i = ((1.0D - d2) / 100.0D);
      }
    }
    if ((i1 != -1) && (m < 99))
    {
      localzke2 = paramzkg.b(i1);
      localObject = localzke2.o();
      str = "";
      if (((zqx)localObject).q()) {
        str = "0%";
      } else {
        str = "".equals(((zqx)localObject).p()) ? "0%" : ((zqx)localObject).p();
      }
      if ("0%".equals(str)) {
        ((zqx)localObject).i = ((1.0D - d4) / 100.0D);
      }
    }
    if ((k != -1) && (m > 100))
    {
      localzke2 = paramzkg.b(k);
      localObject = localzke2.o();
      str = "";
      if (((zqx)localObject).q()) {
        str = "0%";
      } else {
        str = "".equals(((zqx)localObject).p()) ? "0%" : ((zqx)localObject).p();
      }
      if ("0%".equals(str)) {
        ((zqx)localObject).i = ((d3 - 1.0D) / 100.0D);
      }
    }
    if ((i2 != -1) && (m > 101))
    {
      localzke2 = paramzkg.b(i2);
      localObject = localzke2.o();
      str = "";
      if (((zqx)localObject).q()) {
        str = "0%";
      } else {
        str = "".equals(((zqx)localObject).p()) ? "0%" : ((zqx)localObject).p();
      }
      if ("0%".equals(str)) {
        ((zqx)localObject).i = ((d5 - 1.0D) / 100.0D);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */