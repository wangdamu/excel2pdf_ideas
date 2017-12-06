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
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zawk
{
  static int a = 2;
  private static float b = 0.05F;
  private static float c = 0.6F;
  private static float d = 0.048F;
  
  static void a(zr paramzr, zp paramzp, zbfd paramzbfd, ArrayList paramArrayList1, ArrayList paramArrayList2)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    List localList = localzjf.z().a(paramzbfd.ah(), new int[] { paramzbfd.m() });
    int i = localzjf.z().a(paramzbfd, paramzbfd.ah(), new int[] { paramzbfd.m() });
    a(paramzbfd.F());
    if (i == 0)
    {
      zp[] arrayOfzp;
      switch (paramzbfd.m())
      {
      case 44: 
        arrayOfzp = new zp[] { paramzp };
        a(paramzr, localzjf, arrayOfzp, paramzbfd);
        paramzp = arrayOfzp[0];
        a(paramzr, localzjf, paramzp, paramzbfd, paramArrayList1, paramArrayList2);
        break;
      case 47: 
        arrayOfzp = new zp[] { paramzp };
        a(paramzr, localzjf, arrayOfzp, paramzbfd);
        paramzp = arrayOfzp[0];
        b(paramzr, localzjf, paramzp, paramzbfd, paramArrayList1, paramArrayList2);
        break;
      case 46: 
        c(paramzr, localzjf, paramzp, paramzbfd, paramArrayList1, paramArrayList2);
        break;
      case 49: 
        d(paramzr, localzjf, paramzp, paramzbfd, paramArrayList1, paramArrayList2);
        break;
      case 35: 
        a(paramzr, localzjf, paramzp, localList, paramArrayList1, paramArrayList2);
        break;
      case 36: 
        b(paramzr, localzjf, paramzp, localList, paramArrayList1, paramArrayList2);
      }
    }
  }
  
  static void a(zr paramzr, zp paramzp, zbfd paramzbfd)
    throws Exception
  {
    int i = paramzp.e() < paramzp.f() ? paramzp.e() : paramzp.f();
    double d1 = i / 2.0D;
    double d2 = paramzp.c() + paramzp.e() / 2.0D;
    double d3 = paramzp.d() + paramzp.f() / 2.0D;
    zq localzq1 = new zq((float)(d2 - d1), (float)(d3 - d1), i, i);
    double d4 = d1 / 2.0D;
    double d5 = d1 - d4;
    localzq1.a(localzq1.f() + (float)(d1 - d4));
    localzq1.b(localzq1.g() + (float)(d1 - d4));
    localzq1.c(localzq1.h() - 2.0F * (float)(d1 - d4));
    localzq1.d(localzq1.i() - 2.0F * (float)(d1 - d4));
    double d6 = d4;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    com.aspose.cells.b.a.b.a.zf localzf1 = paramzr.d();
    paramzr.a(4, true);
    double d7 = 0.0D;
    zkh localzkh = paramzbfd.F();
    int j = localzkh.getCount();
    for (int k = 0; k < localzkh.getCount(); k++) {
      d7 += Math.abs(localzkh.a(k).w());
    }
    double d8 = -90.0D;
    double d9 = 0.0D;
    Object localObject5;
    Object localObject6;
    Object localObject3;
    Object localObject7;
    Object localObject4;
    for (int m = 0; m < localzkh.getCount(); m++)
    {
      localObject1 = localzkh.b(m);
      if (localzkh.a(m).w() != 0.0D)
      {
        d9 = a(localzkh.a(m).w(), d7);
        if (d9 == 0.0D) {
          d9 = 0.001D;
        }
        localObject5 = new ze();
        localObject6 = zbxz.b(localzq1);
        ((ze)localObject5).a((zq)localObject6, (float)d8, (float)d9);
        double d10 = (360.0D - d8 - d9) * 3.141592653589793D / 180.0D;
        double d11 = d6 * Math.cos(d10);
        double d12 = d6 * Math.sin(d10);
        d11 = d2 + d11;
        d12 = d3 - d12;
        zo localzo1 = new zo((float)d11, (float)d12);
        d11 = (d6 + d5) * Math.cos(d10);
        d12 = (d6 + d5) * Math.sin(d10);
        d11 = d2 + d11;
        d12 = d3 - d12;
        localObject3 = new zo((float)d11, (float)d12);
        ((ze)localObject5).a(localzo1, (zo)localObject3);
        localObject7 = zbxz.b(localzq1);
        ((zq)localObject7).a(((zq)localObject7).f() - (float)d5);
        ((zq)localObject7).b(((zq)localObject7).g() - (float)d5);
        ((zq)localObject7).c(((zq)localObject7).h() + 2.0F * (float)d5);
        ((zq)localObject7).d(((zq)localObject7).i() + 2.0F * (float)d5);
        ((ze)localObject5).a((zq)localObject7, (float)(d8 + d9), -(float)d9);
        d10 = (360.0D - d8) * 3.141592653589793D / 180.0D;
        d11 = d6 * Math.cos(d10);
        d12 = d6 * Math.sin(d10);
        d11 = d2 + d11;
        d12 = d3 - d12;
        localObject4 = new zo((float)d11, (float)d12);
        d11 = (d6 + d5) * Math.cos(d10);
        d12 = (d6 + d5) * Math.sin(d10);
        d11 = d2 + d11;
        d12 = d3 - d12;
        zo localzo2 = new zo((float)d11, (float)d12);
        ((ze)localObject5).a(localzo2, (zo)localObject4);
        ((ze)localObject5).j();
        ((zkf)localObject1).i().a((ze)localObject5);
        com.aspose.cells.b.a.a.zf.a(localArrayList1, localObject1);
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localObject5);
        ((zkf)localObject1).a(new zq(((zq)localObject7).f() + ((zq)localObject7).h() / 2.0F, ((zq)localObject7).g() + ((zq)localObject7).i() / 2.0F, ((zq)localObject7).h() / 2.0F, ((zq)localObject7).i() / 2.0F));
        ((zkf)localObject1).d(((zq)localObject6).h() / 2.0F);
        ((zkf)localObject1).b((float)d8);
        ((zkf)localObject1).c((float)(d8 + d9));
        d8 += d9;
      }
    }
    for (m = 0; m < localArrayList1.size(); m++)
    {
      localObject1 = (zkf)localArrayList1.get(m);
      localObject2 = (ze)localArrayList2.get(m);
      ((zkf)localObject1).k().a((ze)localObject2);
    }
    paramzr.a(localzf1);
    zjf localzjf = paramzbfd.v();
    Object localObject1 = paramzbfd.i();
    Object localObject2 = localzjf.e();
    ArrayList localArrayList3 = localzjf.z().c();
    float f1 = (float)d5;
    d8 = -90.0D;
    d9 = 0.0D;
    for (int n = 0; n < localzkh.getCount(); n++)
    {
      zkf localzkf = localzkh.b(n);
      zqy localzqy = localzkf.o();
      if (!a(localzkf))
      {
        boolean bool1 = localzqy.x();
        localObject3 = localzqy.f() ? "" : localzqy.p();
        if (bool1)
        {
          localObject3 = n < localArrayList3.size() ? ((zgn)localArrayList3.get(n)).c() : "";
          bool2 = (n < localArrayList3.size()) && (((zgn)localArrayList3.get(n)).b());
          localObject4 = zra.a(localzjf.an(), ((zbt)localObject2).l.get(n), (String)localObject3, bool2, localzjf.U());
        }
        else
        {
          localObject4 = zra.a(localzjf.an(), ((zbt)localObject2).l.get(n), (String)localObject3, localzqy.d(), localzjf.U());
        }
        boolean bool2 = localzqy.x();
        localObject5 = localzqy.f() ? "" : localzqy.p();
        if (bool2) {
          localObject6 = zra.a(localzjf.an(), Double.valueOf(localzkf.w()), localzkf.A(), localzkf.B(), localzjf.U());
        } else {
          localObject6 = zra.a(localzjf.an(), Double.valueOf(localzkf.w()), (String)localObject5, localzqy.y(), localzjf.U());
        }
        localObject7 = localzqy.m();
        String str = "";
        if (localzqy.s() == null)
        {
          if (localzqy.h()) {
            str = str + (String)localObject1;
          }
          if (localzqy.d())
          {
            if (!"".equals(str)) {
              str = str + (String)localObject7;
            }
            str = str + (String)localObject4;
          }
          if (localzqy.g())
          {
            if (!"".equals(str)) {
              str = str + (String)localObject7;
            }
            str = str + (String)localObject6;
          }
        }
        zg localzg = localzqy.a().h();
        int i1 = 7;
        int i2 = 9;
        d9 = a(localzkh.a(n).w(), d7);
        double d13 = Math.sqrt(d4 * d4 + d4 * d4 - 2.0D * d4 * d4 * Math.cos(d9 * 3.141592653589793D / 180.0D));
        zt localzt = new zt(f1, (float)d13);
        com.aspose.cells.b.a.b.zs localzs = zbvy.a(paramzr, str, 0, localzg, localzt, i1, i2, 0);
        double d14 = (360.0D - d8 - d9 / 2.0D) * 3.141592653589793D / 180.0D;
        double d15 = (d6 + d5 / 2.0D) * Math.cos(d14);
        double d16 = (d6 + d5 / 2.0D) * Math.sin(d14);
        d15 = d2 + d15;
        d16 = d3 - d16;
        zq localzq2 = new zq((float)d15 - localzs.b() / 2.0F, (float)d16 - localzs.c() / 2.0F, localzs.b(), localzs.c());
        zv localzv = new zv(zv.c());
        localzv.d(localzv.e() | 0x3);
        com.aspose.cells.b.a.b.a.zf localzf2 = paramzr.d();
        zi localzi = new zi();
        zo localzo3 = new zo((float)d15, (float)d16);
        float f2 = (float)(d8 + d9 / 2.0D);
        if ((f2 < 180.0F) && (f2 > 90.0F)) {
          f2 = f2 % 90.0F - 90.0F;
        } else {
          f2 %= 90.0F;
        }
        localzi.a(f2, localzo3);
        paramzr.a(localzi);
        paramzr.a(str, localzg, new zu(localzqy.a().j()), localzq2, localzv);
        paramzr.a(localzf2);
        d8 += d9;
      }
    }
  }
  
  private static void a(zr paramzr, zjf paramzjf, zp paramzp, zbfd paramzbfd, ArrayList paramArrayList1, ArrayList paramArrayList2)
    throws Exception
  {
    int i = paramzbfd.ak();
    double d1 = 0.0D;
    zkh localzkh = paramzbfd.F();
    for (int j = 0; j < localzkh.getCount(); j++) {
      d1 += Math.abs(localzkh.a(j).w());
    }
    if (d1 == 0.0D) {
      return;
    }
    com.aspose.cells.b.a.b.a.zf localzf1 = paramzr.d();
    paramzr.a(4, true);
    double d2 = paramzbfd.W() - 90.0F;
    double d3 = 0.0D;
    double d4 = 90 - paramzbfd.W();
    ze localze1 = new ze();
    ArrayList localArrayList = new ArrayList();
    double d5 = paramzp.e() / 2.0D / (1.0F + paramzbfd.aA() / 100.0F);
    double d6 = paramzp.c() + paramzp.e() / 2.0D;
    double d7 = paramzp.d() + paramzp.f() / 2.0D;
    zq localzq1 = new zq((float)(d6 - d5), (float)(d7 - d5), (float)(2.0D * d5), (float)(2.0D * d5));
    for (int k = 0; k < localzkh.getCount(); k++)
    {
      localObject2 = localzkh.b(k);
      d3 = a(localzkh.a(k).w(), d1);
      localzo = new zo((float)d6, (float)d7);
      Object localObject3;
      if (((zkf)localObject2).F() > 0.0F)
      {
        localObject3 = paramzr.d();
        localzo = a((zkf)localObject2, localzq1, d2, (float)(d3 == 0.0D ? 0.01D : d3), d4);
        ze localze2 = new ze();
        localze2.b(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i(), (float)d2, (float)(d3 == 0.0D ? 0.01D : d3));
        ((zkf)localObject2).i().a(localze2);
        localze1.a(localze2, false);
        com.aspose.cells.b.a.a.zf.a(localArrayList, localze2);
        paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject3);
      }
      else
      {
        localObject3 = new ze();
        ((ze)localObject3).b(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i(), (float)d2, (float)(d3 == 0.0D ? 0.01D : d3));
        ((zkf)localObject2).i().a((ze)localObject3);
        localze1.a((ze)localObject3, false);
        com.aspose.cells.b.a.a.zf.a(localArrayList, localObject3);
      }
      ((zkf)localObject2).a(new zq(localzo.d(), localzo.e(), (float)d5, (float)d5));
      ((zkf)localObject2).b((float)d2);
      ((zkf)localObject2).c((float)(d2 + d3));
      d2 += d3;
      d4 -= d3;
    }
    d2 = paramzbfd.W() - 90.0F;
    d3 = 0.0D;
    Object localObject1 = zo.a();
    Object localObject2 = zo.a();
    zo localzo = new zo((float)d6, (float)d7);
    d4 = 90 - paramzbfd.W();
    int m = 0;
    Object localObject5;
    for (int n = 0; n < localzkh.getCount(); n++)
    {
      localObject4 = localzkh.b(n);
      d3 = a(localzkh.a(n).w(), d1);
      if (n == 0) {
        localObject1 = a(d6, d7, d4, d5);
      }
      localObject2 = a(d6, d7, d4 - d3, d5);
      com.aspose.cells.b.a.b.a.zf localzf2 = null;
      if (((zkf)localObject4).F() > 0.0F)
      {
        localzf2 = paramzr.d();
        a((zkf)localObject4, localzq1, d2, (float)(d3 == 0.0D ? 0.01D : d3), d4);
      }
      if (d3 == 0.0D) {
        d3 = 0.009999999776482582D;
      }
      localObject5 = new ze();
      if (d3 == 360.0D)
      {
        ((ze)localObject5).a(localzq1, (float)d2, (float)d3);
      }
      else
      {
        ((ze)localObject5).a(localzo, (zo)localObject1);
        ((ze)localObject5).a(localzq1, (float)d2, (float)d3);
        ((ze)localObject5).a((zo)localObject2, localzo);
      }
      ((zkf)localObject4).k().a((ze)localObject5);
      if ((m == 0) && (((zkf)localObject4).k().p()) && (((zkf)localObject4).F() <= 0.0F))
      {
        paramzr.a(new zu(((zkf)localObject4).k().a()), localzo.d() - 0.5F, localzo.e() - 0.5F, 1.0F, 1.0F, 0.0F, 360.0F);
        m = 1;
      }
      if (((zkf)localObject4).F() > 0.0F) {
        paramzr.a(localzf2);
      }
      d2 += d3;
      d4 -= d3;
      localObject1 = localObject2;
    }
    paramzr.a(localzf1);
    d2 = 90.0F - paramzbfd.W();
    d3 = 0.0D;
    float f = (float)(d5 * b);
    Object localObject4 = zn.a(localze1);
    for (int i1 = 0; i1 < localzkh.getCount(); i1++)
    {
      localObject5 = localzkh.b(i1);
      zqy localzqy = ((zkf)localObject5).o();
      if ((!a((zkf)localObject5)) && (localzqy.c()))
      {
        double d8 = d1 == 0.0D ? 0.0D : ((zkf)localObject5).w() / d1;
        d3 = a(((zkf)localObject5).w(), d1);
        double d9 = (d2 - d3 / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
        double d10 = ((zkf)localObject5).F() / 100.0F;
        double d11 = (1.0D + d10) * d5 * Math.cos(d9);
        double d12 = (1.0D + d10) * d5 * Math.sin(d9);
        zq localzq2 = localzqy.a;
        zq[] arrayOfzq = { localzq2 };
        paramzjf.a(arrayOfzq);
        localzq2 = arrayOfzq[0];
        Object[] arrayOfObject1 = new Object[5];
        arrayOfObject1[0] = Integer.valueOf(i);
        arrayOfObject1[1] = Integer.valueOf(i1);
        arrayOfObject1[2] = Double.valueOf(d8);
        arrayOfObject1[3] = localzq2;
        arrayOfObject1[4] = Double.valueOf(0.0D);
        com.aspose.cells.b.a.a.zf.a(paramArrayList1, arrayOfObject1);
        localzqy.d = new zo((float)(d6 + d11), (float)(d7 - d12));
        if ((paramzbfd.S()) && (!localzqy.e.b()) && (!localzqy.f.b()))
        {
          Object[] arrayOfObject2 = new Object[7];
          arrayOfObject2[0] = localzqy;
          arrayOfObject2[1] = localObject4;
          arrayOfObject2[2] = localArrayList;
          arrayOfObject2[3] = paramzbfd.T();
          arrayOfObject2[4] = localzq2;
          arrayOfObject2[5] = localzqy.d;
          arrayOfObject2[6] = Float.valueOf(f);
          com.aspose.cells.b.a.a.zf.a(paramArrayList2, arrayOfObject2);
        }
        d2 -= d3;
      }
    }
  }
  
  static void a(zr paramzr, zjf paramzjf, ArrayList paramArrayList)
    throws Exception
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      double d1 = ((Double)arrayOfObject[2]).doubleValue();
      zq localzq = (zq)arrayOfObject[3];
      double d2 = ((Double)arrayOfObject[4]).doubleValue();
      a(paramzr, paramzjf, j, k, d1, localzq, d2);
    }
  }
  
  static void b(zr paramzr, zjf paramzjf, ArrayList paramArrayList)
  {
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(4, true);
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if ((arrayOfObject[0] instanceof ze))
      {
        localObject1 = (ze)arrayOfObject[0];
        localObject2 = (zanr)arrayOfObject[1];
        localObject3 = ((zanr)localObject2).b((ze)localObject1);
        paramzr.a((com.aspose.cells.a.d.zs)localObject3, (ze)localObject1);
      }
      else
      {
        localObject1 = (zqy)arrayOfObject[0];
        localObject2 = (zq)arrayOfObject[1];
        localObject3 = (ArrayList)arrayOfObject[2];
        zanr localzanr = (zanr)arrayOfObject[3];
        zq localzq = (zq)arrayOfObject[4];
        zo localzo = (zo)arrayOfObject[5];
        float f = ((Float)arrayOfObject[6]).floatValue();
        a(paramzr, (zqy)localObject1, (zq)localObject2, (ArrayList)localObject3, localzanr, localzq, localzo, f);
      }
    }
    paramzr.a(localzf);
  }
  
  private static void a(zr paramzr, zqy paramzqy, zq paramzq1, ArrayList paramArrayList, zanr paramzanr, zq paramzq2, zo paramzo, float paramFloat)
  {
    boolean bool = paramzqy.a().d().p();
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
    zo localzo3 = new zo(paramzq2.j(), paramzq2.k() + paramzq2.i() / 3.0F);
    zo localzo4 = new zo(paramzq2.j() + paramzq2.h() / 3.0F, paramzq2.k());
    zo localzo5 = new zo(paramzq2.l(), paramzq2.k() + paramzq2.i() / 3.0F);
    zo localzo6 = new zo(paramzq2.j() + paramzq2.h() / 3.0F, paramzq2.m());
    int i = a(paramzo, paramzq2);
    ze localze1 = new ze();
    zo localzo7 = zo.a();
    zo localzo8 = zo.a();
    com.aspose.cells.a.d.zs localzs = null;
    ze localze2;
    switch (i)
    {
    case 1: 
      localzo7 = new zo(localzo5.d() + paramFloat, localzo5.e());
      localze1.a(localzo5, localzo7);
      localze1.a(localzo7, localzo2);
      localzs = paramzanr.b(localze1);
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
      localzs = paramzanr.b(localze1);
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
        if (localzs != null) {
          localzs.dispose();
        }
        localzs = paramzanr.b(localze1);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.e() <= paramzo.e()))
        {
          localze2 = new ze();
          localze2.a(localzo6, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else if ((!bool) && (localzo5.d() - a <= paramzo.d()))
        {
          localze1 = new ze();
          localzo8 = new zo(localzo5.d() - a, localzo4.e() + paramFloat);
          localze1.a(localzo2, localzo8);
          localze1.a(new zo(localzo8.d() - 1.0F, localzo8.e() - 1.0F), new zo(localzo2.d() - 1.0F, localzo2.e() - 1.0F));
          if (localzs != null) {
            localzs.dispose();
          }
          localzs = paramzanr.b(localze1);
          localze1.a(localzs.r());
          if (a(paramzr, localze1, paramArrayList))
          {
            localze2 = new ze();
            localze2.a(paramzo, localzo8);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
      }
      break;
    case 3: 
      localze1 = new ze();
      localzo8 = new zo(localzo2.d(), localzo6.e());
      localze1.a(localzo2, localzo8);
      localze1.a(new zo(localzo8.d() - 1.0F, localzo8.e()), new zo(localzo2.d() - 1.0F, localzo2.e()));
      localzs = paramzanr.b(localze1);
      localze1.a(localzs.r());
      if (a(paramzr, localze1, paramArrayList))
      {
        localze2 = new ze();
        localzo8 = new zo(paramzo.d(), localzo6.e());
        if (!bool) {
          localzo8.b(localzo8.e() - a);
        }
        localze2.a(paramzo, localzo8);
        paramzr.a(localzs, localze2);
        localze2.g();
      }
      break;
    case 4: 
      localze1 = new ze();
      localzo7 = new zo(localzo3.d() - paramFloat, localzo3.e());
      localze1.a(localzo3, localzo7);
      localze1.a(localzo7, localzo2);
      localzs = paramzanr.b(localze1);
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
        if (localzs != null) {
          localzs.dispose();
        }
        localzs = paramzanr.b(localze1);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.e() <= paramzo.e()))
        {
          localze2 = new ze();
          localze2.a(localzo6, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else if ((!bool) && (localzo3.d() + a >= paramzo.d()))
        {
          localze1 = new ze();
          localzo8 = new zo(localzo3.d() + a, localzo4.e() + paramFloat);
          localze1.a(localzo2, localzo8);
          localze1.a(new zo(localzo8.d() - 1.0F, localzo8.e() - 1.0F), new zo(localzo2.d() - 1.0F, localzo2.e() - 1.0F));
          if (localzs != null) {
            localzs.dispose();
          }
          localzs = paramzanr.b(localze1);
          localze1.a(localzs.r());
          if (a(paramzr, localze1, paramArrayList))
          {
            localze2 = new ze();
            localze2.a(paramzo, localzo8);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
      }
      break;
    case 5: 
      localze1 = new ze();
      localzo7 = new zo(localzo3.d() - paramFloat, localzo3.e());
      localze1.a(localzo3, localzo7);
      localze1.a(localzo7, localzo2);
      localzs = paramzanr.b(localze1);
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
      localzs = paramzanr.b(localze1);
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
        if (localzs != null) {
          localzs.dispose();
        }
        localzs = paramzanr.b(localze1);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.e() >= paramzo.e()))
        {
          localze2 = new ze();
          localze2.a(localzo4, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else if ((!bool) && (localzo3.d() + a >= paramzo.d()))
        {
          localze1 = new ze();
          localzo8 = new zo(localzo3.d() + a, localzo6.e() - paramFloat);
          localze1.a(localzo2, localzo8);
          localze1.a(new zo(localzo8.d() - 1.0F, localzo8.e() - 1.0F), new zo(localzo2.d() - 1.0F, localzo2.e() - 1.0F));
          if (localzs != null) {
            localzs.dispose();
          }
          localzs = paramzanr.b(localze1);
          localze1.a(localzs.r());
          if (a(paramzr, localze1, paramArrayList))
          {
            localze2 = new ze();
            localze2.a(paramzo, localzo8);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
      }
      break;
    case 7: 
      localze1 = new ze();
      localzo8 = new zo(localzo2.d(), localzo4.e());
      localze1.a(localzo2, localzo8);
      localze1.a(new zo(localzo8.d() - 1.0F, localzo8.e()), new zo(localzo2.d() - 1.0F, localzo2.e()));
      localzs = paramzanr.b(localze1);
      localze1.a(localzs.r());
      if (a(paramzr, localze1, paramArrayList))
      {
        localze2 = new ze();
        localzo8 = new zo(paramzo.d(), localzo4.e());
        if (!bool) {
          localzo8.b(localzo8.e() + a);
        }
        localze2.a(paramzo, localzo8);
        paramzr.a(localzs, localze2);
        localze2.g();
      }
      break;
    case 8: 
      localze1 = new ze();
      localzo7 = new zo(localzo5.d() + paramFloat, localzo5.e());
      localze1.a(localzo5, localzo7);
      localze1.a(localzo7, localzo2);
      localzs = paramzanr.b(localze1);
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
        if (localzs != null) {
          localzs.dispose();
        }
        localzs = paramzanr.b(localze1);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1, paramArrayList)) && (localzo7.e() >= paramzo.e()))
        {
          localze2 = new ze();
          localze2.a(localzo4, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else if ((!bool) && (localzo5.d() - a <= paramzo.d()))
        {
          localze1 = new ze();
          localzo8 = new zo(localzo5.d() - a, localzo6.e() - paramFloat);
          localze1.a(localzo2, localzo8);
          localze1.a(new zo(localzo8.d() - 1.0F, localzo8.e() - 1.0F), new zo(localzo2.d() - 1.0F, localzo2.e() - 1.0F));
          if (localzs != null) {
            localzs.dispose();
          }
          localzs = paramzanr.b(localze1);
          localze1.a(localzs.r());
          if (a(paramzr, localze1, paramArrayList))
          {
            localze2 = new ze();
            localze2.a(paramzo, localzo8);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
      }
      break;
    }
    if (localzs != null) {
      localzs.dispose();
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
  
  private static zo a(zkf paramzkf, zq paramzq, double paramDouble1, double paramDouble2, double paramDouble3)
    throws Exception
  {
    zjf localzjf = paramzkf.h();
    zr localzr = localzjf.ap();
    zp localzp = new zp(0, 0, localzjf.a(), localzjf.b());
    float f1 = paramzkf.F();
    double d1 = paramzq.f() + paramzq.h() / 2.0D;
    double d2 = paramzq.g() + paramzq.i() / 2.0D;
    double d3 = paramzq.h() / 2.0D;
    double d4 = d3 * f1 / 100.0D;
    zo localzo = a(d1, d2, paramDouble3 - paramDouble2 / 2.0D, d4);
    zq localzq1 = new zq((float)(localzo.d() - d3), (float)(localzo.e() - d3), paramzq.h(), paramzq.i());
    zq localzq2 = a(localzq1, paramDouble1, paramDouble2);
    if (f1 > 0.0F) {
      while ((!zbxz.a(localzq2, localzp)) && (f1 > 0.0F))
      {
        f1 -= 1.0F;
        d4 = d3 * f1 / 100.0D;
        localzo = a(d1, d2, paramDouble3 - paramDouble2 / 2.0D, d4);
        localzq1 = new zq((float)(localzo.d() - d3), (float)(localzo.e() - d3), paramzq.h(), paramzq.i());
        localzq2 = a(localzq1, paramDouble1, paramDouble2);
      }
    }
    while ((!zbxz.a(localzq2, localzp)) && (f1 < 0.0F))
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
  
  private static void b(zr paramzr, zjf paramzjf, zp paramzp, zbfd paramzbfd, ArrayList paramArrayList1, ArrayList paramArrayList2)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = paramzbfd.ak();
    double d1 = 0.0D;
    zkh localzkh = paramzbfd.F();
    for (int j = 0; j < localzkh.getCount(); j++) {
      d1 += Math.abs(localzkh.a(j).w());
    }
    if (d1 == 0.0D) {
      return;
    }
    double d2 = paramzp.c() + paramzp.e() / 2.0D;
    double d3 = paramzp.d() + paramzp.f() / 2.0D;
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(4, true);
    ze localze = new ze();
    ArrayList localArrayList = new ArrayList();
    double d4 = paramzbfd.W() - 90.0F;
    double d5 = 0.0D;
    double d6 = 90.0F - paramzbfd.W();
    double d7 = paramzp.e() / 2.0D / (1.0F + paramzbfd.aA() / 100.0F);
    zkf localzkf;
    Object localObject;
    for (int k = 0; k < localzkh.getCount(); k++)
    {
      zqy localzqy1 = localzkh.b(k).o();
      d5 = a(localzkh.a(k).w(), d1);
      double d9 = (d6 - d5 / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
      localzkf = localzkh.b(k);
      double d10 = localzkf.F() / 100.0F;
      double d12 = d7 * d10;
      double d14 = d12 * Math.cos(d9);
      double d16 = d12 * Math.sin(d9);
      double d18 = d2 + d14;
      double d20 = d3 - d16;
      zp localzp = new zp((int)(d18 - d7), (int)(d20 - d7), (int)(2.0D * d7), (int)(2.0D * d7));
      if (d5 == 0.0D) {
        d5 = 0.001D;
      }
      localObject = new ze();
      ((ze)localObject).a(localzp, (float)d4, (float)d5);
      localze.a((ze)localObject, false);
      com.aspose.cells.b.a.a.zf.a(localArrayList, localObject);
      localzkf.i().a((ze)localObject);
      localzkf.k().a((ze)localObject);
      localzkf.a(new zq((float)d18, (float)d20, (float)d7, (float)d7));
      localzkf.b((float)d4);
      localzkf.c((float)(d4 + d5));
      d4 += d5;
      d6 -= d5;
    }
    paramzr.a(localzf);
    double d8 = 90.0F - paramzbfd.W();
    zq localzq = zn.a(localze);
    for (int m = 0; m < localzkh.getCount(); m++)
    {
      localzkf = localzkh.b(m);
      zqy localzqy2 = localzkf.o();
      if (!a(localzkf))
      {
        double d11 = d1 == 0.0D ? 0.0D : localzkf.w() / d1;
        d5 = a(localzkh.a(m).w(), d1);
        double d13 = (d8 - d5 / 2.0D) % 360.0D;
        double d15 = d13 * 3.141592653589793D / 180.0D;
        localzqy2.g = d15;
        double d17 = localzkf.F() / 100.0F;
        double d19 = (1.0D + d17) * d7 * Math.cos(d15);
        double d21 = (1.0D + d17) * d7 * Math.sin(d15);
        d19 = d2 + d19;
        d21 = d3 - d21;
        localObject = localzqy2.a;
        zq[] arrayOfzq = { localObject };
        paramzjf.a(arrayOfzq);
        localObject = arrayOfzq[0];
        Object[] arrayOfObject1 = new Object[5];
        arrayOfObject1[0] = Integer.valueOf(i);
        arrayOfObject1[1] = Integer.valueOf(m);
        arrayOfObject1[2] = Double.valueOf(d11);
        arrayOfObject1[3] = localObject;
        arrayOfObject1[4] = Double.valueOf(0.0D);
        com.aspose.cells.b.a.a.zf.a(paramArrayList1, arrayOfObject1);
        localzqy2.d = new zo((float)d19, (float)d21);
        float f = (float)(d7 * b);
        if ((paramzbfd.S()) && (!localzqy2.e.b()) && (!localzqy2.f.b()))
        {
          Object[] arrayOfObject2 = new Object[7];
          arrayOfObject2[0] = localzqy2;
          arrayOfObject2[1] = localzq;
          arrayOfObject2[2] = localArrayList;
          arrayOfObject2[3] = paramzbfd.T();
          arrayOfObject2[4] = localObject;
          arrayOfObject2[5] = localzqy2.d;
          arrayOfObject2[6] = Float.valueOf(f);
          com.aspose.cells.b.a.a.zf.a(paramArrayList2, arrayOfObject2);
        }
        d8 -= d5;
      }
    }
  }
  
  private static void c(zr paramzr, zjf paramzjf, zp paramzp, zbfd paramzbfd, ArrayList paramArrayList1, ArrayList paramArrayList2)
    throws Exception
  {
    int i = paramzjf.af();
    int j = paramzjf.ag();
    int k = paramzjf.ah();
    zkf localzkf1 = paramzbfd.u();
    int m = paramzp.e() - (2 * i + k + 2 * j);
    int n = paramzp.c() + m / 2 + i;
    int i1 = paramzp.d() + paramzp.f() / 2;
    int i2 = paramzp.i() - m / 2 - j;
    int i3 = i1;
    zbff localzbff = paramzjf.z();
    int i4 = paramzbfd.ak();
    zkh localzkh = paramzbfd.F();
    int i5 = localzkh.getCount();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    for (int i6 = 0; i6 < i5; i6++) {
      d3 += Math.abs(localzkh.a(i6).w());
    }
    int i7;
    if (paramzbfd.aB() == 4)
    {
      for (i6 = 0; i6 < i5; i6++)
      {
        for (i7 = 0; (paramzbfd.aD() != null) && (i7 < paramzbfd.aD().length); i7++) {
          if (i6 == paramzbfd.aD()[i7])
          {
            localzkh.b(i6).e = true;
            com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkh.a(i6));
            com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkh.a(i6).w())));
            d2 += Math.abs(localzkh.a(i6).w());
            break;
          }
        }
        if ((paramzbfd.aD() == null) || (paramzbfd.aD().length == 0) || (i7 == paramzbfd.aD().length))
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkh.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkh.a(i6).w())));
          d1 += Math.abs(localzkh.a(i6).w());
        }
      }
    }
    else if (paramzbfd.aB() == 3)
    {
      for (i6 = 0; i6 < i5; i6++) {
        if (localzkh.a(i6).w() / d3 * 100.0D >= paramzbfd.aC())
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkh.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkh.a(i6).w())));
          d1 += Math.abs(localzkh.a(i6).w());
        }
        else
        {
          localzkh.b(i6).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkh.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkh.a(i6).w())));
          d2 += Math.abs(localzkh.a(i6).w());
        }
      }
    }
    else if (paramzbfd.aB() == 2)
    {
      for (i6 = 0; i6 < i5; i6++) {
        if (localzkh.a(i6).w() >= paramzbfd.aC())
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkh.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkh.a(i6).w())));
          d1 += Math.abs(localzkh.a(i6).w());
        }
        else
        {
          localzkh.b(i6).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkh.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkh.a(i6).w())));
          d2 += Math.abs(localzkh.a(i6).w());
        }
      }
    }
    else
    {
      if (paramzbfd.aB() == 1)
      {
        i6 = (int)paramzbfd.aC();
        if (i6 > i5) {
          i6 = i5;
        }
      }
      else
      {
        i6 = zbxz.a(i5 / 3.0F);
      }
      for (i7 = 0; i7 < i5; i7++) {
        if (i7 < i5 - i6)
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkh.a(i7));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkh.a(i7).w())));
          d1 += Math.abs(localzkh.a(i7).w());
        }
        else
        {
          localzkh.b(i7).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkh.a(i7));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkh.a(i7).w())));
          d2 += Math.abs(localzkh.a(i7).w());
        }
      }
    }
    if (localArrayList2.size() == 0)
    {
      localArrayList1.add(0, Double.valueOf(0.0D));
      localArrayList3.add(0, localzkf1);
    }
    else
    {
      localArrayList1.add(0, Double.valueOf(d2));
      d1 += d2;
      localArrayList3.add(0, localzkf1);
    }
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(4, true);
    double d4 = d1 == 0.0D ? 0.0D : -Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    double d5 = 0.0D;
    double d6 = i / (1.0F + paramzbfd.aA() / 100.0F);
    zq localzq = new zq((float)(n - d6), (float)(i1 - d6), (float)(2.0D * d6), (float)(2.0D * d6));
    double d7 = -d4;
    Object localObject1;
    Object localObject3;
    for (int i8 = 0; i8 < localArrayList1.size(); i8++) {
      if (((Double)localArrayList1.get(i8)).doubleValue() != 0.0D)
      {
        if ((i8 == 0) && (localzkf1 != null))
        {
          localObject1 = paramzjf.Z().a().a(paramzjf.R(), i5 + 1);
          localObject2 = localObject1[i5];
          localzkf1.i().c((Color)localObject2);
        }
        localObject1 = (zkf)localArrayList3.get(i8);
        d5 = a(((Double)localArrayList1.get(i8)).doubleValue(), d1);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        localObject2 = new zo(n, i1);
        localObject3 = null;
        if (((zkf)localObject1).F() > 0.0F)
        {
          localObject3 = paramzr.d();
          localObject2 = a((zkf)localObject1, localzq, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        localObject4 = new ze();
        ((ze)localObject4).b(localzq.f(), localzq.g(), localzq.h(), localzq.i(), (float)d4, (float)d5);
        ((zkf)localObject1).i().a((ze)localObject4);
        if (((zkf)localObject1).F() > 0.0F) {
          paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject3);
        }
        ((zkf)localObject1).a(new zq(((zo)localObject2).d(), ((zo)localObject2).e(), localzq.h() / 2.0F, localzq.i() / 2.0F));
        ((zkf)localObject1).b((float)d4);
        ((zkf)localObject1).c((float)(d4 + d5));
        d4 += d5;
        d7 -= d5;
      }
    }
    d4 = d1 == 0.0D ? 0.0D : -Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    d7 = -d4;
    for (i8 = 0; i8 < localArrayList1.size(); i8++) {
      if (((Double)localArrayList1.get(i8)).doubleValue() != 0.0D)
      {
        localObject1 = (zkf)localArrayList3.get(i8);
        d5 = a(((Double)localArrayList1.get(i8)).doubleValue(), d1);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        localObject2 = null;
        if (((zkf)localObject1).F() > 0.0F)
        {
          localObject2 = paramzr.d();
          a((zkf)localObject1, localzq, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        localObject3 = new ze();
        if (d5 == 360.0D) {
          ((ze)localObject3).a(localzq, (float)d4, (float)d5);
        } else {
          ((ze)localObject3).b(localzq.f(), localzq.g(), localzq.h(), localzq.i(), (float)d4, (float)d5);
        }
        ((zkf)localObject1).k().a((ze)localObject3);
        if (((zkf)localObject1).F() > 0.0F) {
          paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject2);
        }
        d4 += d5;
        d7 -= d5;
      }
    }
    d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    double d8 = j / (1.0F + paramzbfd.aA() / 100.0F);
    Object localObject2 = new zq((float)(i2 - d8), (float)(i3 - d8), (float)(2.0D * d8), (float)(2.0D * d8));
    d7 = -d4;
    Object localObject5;
    Object localObject6;
    for (int i9 = 0; i9 < localArrayList2.size(); i9++) {
      if (((Double)localArrayList2.get(i9)).doubleValue() != 0.0D)
      {
        localObject4 = (zkf)localArrayList4.get(i9);
        d5 = a(((Double)localArrayList2.get(i9)).doubleValue(), d2);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        zo localzo1 = new zo(i2, i3);
        localObject5 = null;
        if (((zkf)localObject4).F() > 0.0F)
        {
          localObject5 = paramzr.d();
          localzo1 = a((zkf)localObject4, (zq)localObject2, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        localObject6 = new ze();
        ((ze)localObject6).b(((zq)localObject2).f(), ((zq)localObject2).g(), ((zq)localObject2).h(), ((zq)localObject2).i(), (float)d4, (float)d5);
        ((zkf)localObject4).i().a((ze)localObject6);
        if (((zkf)localObject4).F() > 0.0F) {
          paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject5);
        }
        ((zkf)localObject4).a(new zq(localzo1.d(), localzo1.e(), ((zq)localObject2).h() / 2.0F, ((zq)localObject2).i() / 2.0F));
        ((zkf)localObject4).b((float)d4);
        ((zkf)localObject4).c((float)(d4 + d5));
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
    Object localObject4 = new double[localArrayList2.size()];
    Object localObject7;
    for (int i10 = 0; i10 < localArrayList2.size(); i10++) {
      if (((Double)localArrayList2.get(i10)).doubleValue() != 0.0D)
      {
        localObject5 = (zkf)localArrayList4.get(i10);
        d5 = a(((Double)localArrayList2.get(i10)).doubleValue(), d2);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        localObject6 = null;
        if (((zkf)localObject5).F() > 0.0F)
        {
          localObject6 = paramzr.d();
          a((zkf)localObject5, (zq)localObject2, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        localObject7 = new ze();
        if (d5 == 360.0D) {
          ((ze)localObject7).a((zq)localObject2, (float)d4, (float)d5);
        } else {
          ((ze)localObject7).b(((zq)localObject2).f(), ((zq)localObject2).g(), ((zq)localObject2).h(), ((zq)localObject2).i(), (float)d4, (float)d5);
        }
        ((zkf)localObject5).k().a((ze)localObject7);
        if (((zkf)localObject5).F() > 0.0F) {
          paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject6);
        }
        arrayOfDouble1[i10] = d4;
        localObject4[i10] = d5;
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
    Object localObject8;
    if ((paramzbfd.Z()) && (d1 != 0.0D) && (localArrayList2.size() > 0)) {
      if (Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D > 180.0D)
      {
        d9 = Math.acos((d6 - d8) / (i2 - n));
        localObject6 = new zo((float)(n + d6 * Math.cos(d9)), (float)(i1 - d6 * Math.sin(d9)));
        localObject7 = new zo((float)(i2 + d8 * Math.cos(d9)), (float)(i3 - d8 * Math.sin(d9)));
        zo localzo2 = new zo((float)(n + d6 * Math.cos(-d9)), (float)(i1 - d6 * Math.sin(-d9)));
        zo localzo3 = new zo((float)(i2 + d8 * Math.cos(-d9)), (float)(i3 - d8 * Math.sin(-d9)));
        if (localzkf1.F() > 0.0F)
        {
          float f2 = (float)(d6 * localzkf1.F() / 100.0D);
          ((zo)localObject6).a(((zo)localObject6).d() + f2);
          localzo2.a(localzo2.d() + f2);
        }
        int i11 = a(arrayOfDouble1, (double[])localObject4, d9 * 180.0D / 3.141592653589793D);
        zkf localzkf2 = paramzbfd.F().b(localArrayList1.size() - 1 + i11);
        float f4;
        double d14;
        if (localzkf2.F() > 0.0F)
        {
          f4 = (float)(d8 * localzkf2.F() / 100.0D);
          d14 = (360.0D - arrayOfDouble1[i11] - localObject4[i11] / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
          localzo3.a(localzo3.d() + (float)(f4 * Math.cos(d14)));
          localzo3.b(localzo3.e() - (float)(f4 * Math.sin(d14)));
        }
        i11 = a(arrayOfDouble1, (double[])localObject4, 360.0D - d9 * 180.0D / 3.141592653589793D);
        localzkf2 = paramzbfd.F().b(localArrayList1.size() - 1 + i11);
        if (localzkf2.F() > 0.0F)
        {
          f4 = (float)(d8 * localzkf2.F() / 100.0D);
          d14 = (360.0D - arrayOfDouble1[i11] - localObject4[i11] / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
          ((zo)localObject7).a(((zo)localObject7).d() + (float)(f4 * Math.cos(d14)));
          ((zo)localObject7).b(((zo)localObject7).e() - (float)(f4 * Math.sin(d14)));
        }
        paramzbfd.aa().a((zo)localObject6, (zo)localObject7);
        paramzbfd.aa().a(localzo2, localzo3);
      }
      else
      {
        d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 3.141592653589793D;
        if (localArrayList1.size() == 1) {
          d4 = 0.0D;
        }
        double d10 = n + d6 * Math.cos(d4);
        double d12 = i1 - d6 * Math.sin(d4);
        double d13 = Math.sqrt(Math.pow(d12 - i3, 2.0D) + Math.pow(d10 - i2, 2.0D));
        d9 = Math.acos((i2 - d10) / d13) + Math.acos(d8 / d13);
        localObject8 = new zo((float)d10, (float)d12);
        zo localzo4 = new zo((float)(i2 + d8 * Math.cos(3.141592653589793D - d9)), (float)(i3 - d8 * Math.sin(3.141592653589793D - d9)));
        zo localzo5 = new zo((float)(n + d6 * Math.cos(-d4)), (float)(i1 - d6 * Math.sin(-d4)));
        zo localzo6 = new zo((float)(i2 + d8 * Math.cos(d9 + 3.141592653589793D)), (float)(i3 - d8 * Math.sin(d9 + 3.141592653589793D)));
        if (localzkf1.F() > 0.0F)
        {
          float f5 = (float)(d6 * localzkf1.F() / 100.0D);
          ((zo)localObject8).a(((zo)localObject8).d() + f5);
          localzo5.a(localzo5.d() + f5);
        }
        int i14 = a(arrayOfDouble1, (double[])localObject4, d9 * 180.0D / 3.141592653589793D);
        zkf localzkf3 = paramzbfd.F().b(localArrayList1.size() - 1 + i14);
        float f6;
        double d18;
        if (localzkf3.F() > 0.0F)
        {
          f6 = (float)(d8 * localzkf3.F() / 100.0D);
          d18 = (360.0D - arrayOfDouble1[i14] - localObject4[i14] / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
          localzo6.a(localzo6.d() + (float)(f6 * Math.cos(d18)));
          localzo6.b(localzo6.e() - (float)(f6 * Math.sin(d18)));
        }
        i14 = a(arrayOfDouble1, (double[])localObject4, 360.0D - d9 * 180.0D / 3.141592653589793D);
        localzkf3 = paramzbfd.F().b(localArrayList1.size() - 1 + i14);
        if (localzkf3.F() > 0.0F)
        {
          f6 = (float)(d8 * localzkf3.F() / 100.0D);
          d18 = (360.0D - arrayOfDouble1[i14] - localObject4[i14] / 2.0D) * 3.141592653589793D / 180.0D % 6.283185307179586D;
          localzo4.a(localzo4.d() + (float)(f6 * Math.cos(d18)));
          localzo4.b(localzo4.e() - (float)(f6 * Math.sin(d18)));
        }
        paramzbfd.aa().a((zo)localObject8, localzo4);
        paramzbfd.aa().a(localzo5, localzo6);
      }
    }
    paramzr.a(localzf);
    zqy localzqy = paramzbfd.w();
    d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 180.0D;
    double d11 = -d4;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    d5 = 0.0D;
    float f3 = paramzjf.b();
    for (int i12 = 0; i12 < localArrayList1.size() + localArrayList2.size(); i12++)
    {
      localObject8 = null;
      if (i12 < localArrayList1.size()) {
        localObject8 = (zkf)localArrayList3.get(i12);
      } else {
        localObject8 = (zkf)localArrayList4.get(i12 - localArrayList1.size());
      }
      if (!a((zkf)localObject8))
      {
        int i13 = ((zkf)localObject8).I();
        if (i12 == 0) {
          i13 = -1;
        }
        double d15 = 0.0D;
        if (localObject8 != null)
        {
          localzqy = ((zkf)localObject8).o();
          d15 = ((zkf)localObject8).F() / 100.0F;
        }
        float f1;
        if (localzqy.a().d().h()) {
          f1 = paramzjf.a() * 0.175F;
        } else {
          f1 = paramzjf.a() * 0.2F;
        }
        double d17 = 0.0D;
        double d19 = 0.0D;
        double d20 = 0.0D;
        double d16;
        double d21;
        if (i12 < localArrayList1.size())
        {
          d16 = d3 == 0.0D ? 0.0D : ((Double)localArrayList1.get(i12)).doubleValue() / d3;
          d5 = d1 == 0.0D ? 0.0D : ((Double)localArrayList1.get(i12)).doubleValue() / d1 * 360.0D;
          d21 = d6;
          d20 = d6 * d15;
        }
        else
        {
          d16 = d3 == 0.0D ? 0.0D : ((Double)localArrayList2.get(i12 - localArrayList1.size())).doubleValue() / d3;
          if (i12 == localArrayList1.size())
          {
            d4 = d1 == 0.0D ? 0.0D : -Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 180.0D;
            d11 = -d4;
            if (localArrayList1.size() == 1) {
              d4 = 0.0D;
            }
          }
          d5 = d2 == 0.0D ? 0.0D : ((Double)localArrayList2.get(i12 - localArrayList1.size())).doubleValue() / d2 * 360.0D;
          d21 = d8;
          d20 = d8 * d15;
        }
        zt localzt = a(paramzr, paramzjf.z(), i4, i13, d16, f1, f3, ((Double)localArrayList1.get(0)).doubleValue());
        if ((d5 != 0.0D) || (i12 == 0))
        {
          double d22 = (d4 - d5 / 2.0D) % 360.0D;
          d9 = d22 * 3.141592653589793D / 180.0D;
          int i15 = 0;
          int i16 = localzqy.j();
          while (i15 == 0)
          {
            double d23;
            double[] arrayOfDouble2;
            switch (i16)
            {
            case 1: 
              d23 = d20 + d21 * 0.5D;
              d17 = d23 * Math.cos(d9);
              d19 = d23 * Math.sin(d9);
              d17 -= localzt.b() / 2.0F;
              d19 += localzt.c() / 2.0F;
              i15 = 1;
              break;
            case 3: 
              d23 = d20 + d21 * (1.0F - d);
              d17 = d23 * Math.cos(d9);
              d19 = d23 * Math.sin(d9);
              localObject9 = new double[] { d17 };
              arrayOfDouble2 = new double[] { d19 };
              b((double[])localObject9, arrayOfDouble2, d22, localzt);
              d17 = localObject9[0];
              d19 = arrayOfDouble2[0];
              i15 = 1;
              break;
            case 4: 
              d23 = d20 + d21 * (1.0F + d);
              d17 = d23 * Math.cos(d9);
              d19 = d23 * Math.sin(d9);
              localObject9 = new double[] { d17 };
              arrayOfDouble2 = new double[] { d19 };
              a((double[])localObject9, arrayOfDouble2, d22, localzt);
              d17 = localObject9[0];
              d19 = arrayOfDouble2[0];
              i15 = 1;
              break;
            case 9: 
              d23 = d20 + d21 * (1.0F + d);
              d17 = d23 * Math.cos(d9);
              d19 = d23 * Math.sin(d9);
              localObject9 = new double[] { d17 };
              arrayOfDouble2 = new double[] { d19 };
              a((double[])localObject9, arrayOfDouble2, d22, localzt);
              d17 = localObject9[0];
              d19 = arrayOfDouble2[0];
              i15 = 1;
              break;
            case 2: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            default: 
              d23 = d20 + d21 * (1.0F - d);
              d17 = d23 * Math.cos(d9);
              d19 = d23 * Math.sin(d9);
              localObject9 = new double[] { d17 };
              arrayOfDouble2 = new double[] { d19 };
              b((double[])localObject9, arrayOfDouble2, d22, localzt);
              d17 = localObject9[0];
              d19 = arrayOfDouble2[0];
              localObject9 = new zq((float)d17, (float)d19, localzt.b(), localzt.c());
              boolean bool = a(paramzr, (float)d11, (float)d4, (float)d5, (float)d21, (float)d20, (zq)localObject9, localzqy);
              if (bool)
              {
                i15 = 1;
              }
              else
              {
                zo localzo7 = a(paramzr, (float)d11, (float)d4, (float)d5, (float)d21, (float)d20, localzt, localzqy);
                if (localzo7.b())
                {
                  i15 = 0;
                  i16 = 4;
                }
                else
                {
                  d17 = localzo7.d();
                  d19 = localzo7.e();
                  i15 = 1;
                }
              }
              break;
            }
          }
          if (i12 < localArrayList1.size())
          {
            d17 = n + d17;
            d19 = i1 - d19;
          }
          else
          {
            d17 = i2 + d17;
            d19 = i3 - d19;
          }
          if (localzqy.j() == 9)
          {
            localzqy.a().b = new zp(zbxz.a(d17), zbxz.a(d19), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
            localzqy.a().z();
            d17 = localzqy.a().a.c();
            d19 = localzqy.a().a.d();
          }
          Object localObject9 = new zq((float)d17, (float)d19, localzt.b(), localzt.c());
          Object[] arrayOfObject = new Object[5];
          arrayOfObject[0] = Integer.valueOf(i4);
          arrayOfObject[1] = Integer.valueOf(i13);
          arrayOfObject[2] = Double.valueOf(d16);
          arrayOfObject[3] = localObject9;
          arrayOfObject[4] = localArrayList1.get(0);
          com.aspose.cells.b.a.a.zf.a(paramArrayList1, arrayOfObject);
          d4 -= d5;
          d11 += d5;
        }
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
  
  private static void d(zr paramzr, zjf paramzjf, zp paramzp, zbfd paramzbfd, ArrayList paramArrayList1, ArrayList paramArrayList2)
    throws Exception
  {
    int i = paramzjf.af();
    int j = paramzjf.ag();
    int k = paramzjf.ah();
    zkf localzkf1 = paramzbfd.u();
    int m = paramzp.e() - (2 * i + k + j);
    int n = paramzp.c() + m / 2 + i;
    int i1 = paramzp.d() + paramzp.f() / 2;
    int i2 = paramzp.i() - m / 2 - j;
    int i3 = i1;
    zbff localzbff = paramzjf.z();
    int i4 = paramzbfd.ak();
    zkh localzkh = paramzbfd.F();
    int i5 = localzkh.getCount();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    for (int i6 = 0; i6 < i5; i6++) {
      d3 += Math.abs(localzkh.a(i6).w());
    }
    int i7;
    if (paramzbfd.aB() == 4)
    {
      for (i6 = 0; i6 < i5; i6++)
      {
        for (i7 = 0; (paramzbfd.aD() != null) && (i7 < paramzbfd.aD().length); i7++) {
          if (i6 == paramzbfd.aD()[i7])
          {
            localzkh.b(i6).e = true;
            com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkh.a(i6));
            com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkh.a(i6).w())));
            d2 += Math.abs(localzkh.a(i6).w());
            break;
          }
        }
        if ((paramzbfd.aD() == null) || (paramzbfd.aD().length == 0) || (i7 == paramzbfd.aD().length))
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkh.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkh.a(i6).w())));
          d1 += Math.abs(localzkh.a(i6).w());
        }
      }
    }
    else if (paramzbfd.aB() == 3)
    {
      for (i6 = 0; i6 < i5; i6++) {
        if (localzkh.a(i6).w() / d3 * 100.0D >= paramzbfd.aC())
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkh.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkh.a(i6).w())));
          d1 += Math.abs(localzkh.a(i6).w());
        }
        else
        {
          localzkh.b(i6).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkh.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkh.a(i6).w())));
          d2 += Math.abs(localzkh.a(i6).w());
        }
      }
    }
    else if (paramzbfd.aB() == 2)
    {
      for (i6 = 0; i6 < i5; i6++) {
        if (localzkh.a(i6).w() >= paramzbfd.aC())
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkh.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkh.a(i6).w())));
          d1 += Math.abs(localzkh.a(i6).w());
        }
        else
        {
          localzkh.b(i6).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkh.a(i6));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkh.a(i6).w())));
          d2 += Math.abs(localzkh.a(i6).w());
        }
      }
    }
    else
    {
      if (paramzbfd.aB() == 1)
      {
        i6 = (int)paramzbfd.aC();
        if (i6 > i5) {
          i6 = i5;
        }
      }
      else
      {
        i6 = zbxz.a(i5 / 3.0F);
      }
      for (i7 = 0; i7 < i5; i7++) {
        if (i7 < i5 - i6)
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzkh.a(i7));
          com.aspose.cells.b.a.a.zf.a(localArrayList1, Double.valueOf(Math.abs(localzkh.a(i7).w())));
          d1 += Math.abs(localzkh.a(i7).w());
        }
        else
        {
          localzkh.b(i7).e = true;
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkh.a(i7));
          com.aspose.cells.b.a.a.zf.a(localArrayList2, Double.valueOf(Math.abs(localzkh.a(i7).w())));
          d2 += Math.abs(localzkh.a(i7).w());
        }
      }
    }
    if (localArrayList2.size() == 0)
    {
      localArrayList1.add(0, Double.valueOf(0.0D));
      localArrayList3.add(0, localzkf1);
    }
    else
    {
      localArrayList1.add(0, Double.valueOf(d2));
      d1 += d2;
      localArrayList3.add(0, localzkf1);
    }
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(4, true);
    double d4 = d1 == 0.0D ? 0.0D : -Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    double d5 = 0.0D;
    double d6 = i / (1.0F + paramzbfd.aA() / 100.0F);
    zq localzq1 = new zq((float)(n - d6), (float)(i1 - d6), (float)(2.0D * d6), (float)(2.0D * d6));
    double d7 = -d4;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    for (int i8 = 0; i8 < localArrayList1.size(); i8++) {
      if (((Double)localArrayList1.get(i8)).doubleValue() != 0.0D)
      {
        if ((i8 == 0) && (localzkf1 != null))
        {
          localObject1 = paramzjf.Z().a().a(paramzjf.R(), i5 + 1);
          localObject2 = localObject1[i5];
          localzkf1.i().c((Color)localObject2);
        }
        localObject1 = (zkf)localArrayList3.get(i8);
        d5 = a(((Double)localArrayList1.get(i8)).doubleValue(), d1);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        localObject2 = new zo(n, i1);
        localObject3 = null;
        if (((zkf)localObject1).F() > 0.0F)
        {
          localObject3 = paramzr.d();
          localObject2 = a((zkf)localObject1, localzq1, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        ze localze = new ze();
        localze.b(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i(), (float)d4, (float)d5);
        ((zkf)localObject1).i().a(localze);
        if ((((zkf)localObject1).F() > 0.0F) && (localObject3 != null)) {
          paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject3);
        }
        ((zkf)localObject1).a(new zq(((zo)localObject2).d(), ((zo)localObject2).e(), localzq1.h() / 2.0F, localzq1.i() / 2.0F));
        ((zkf)localObject1).b((float)d4);
        ((zkf)localObject1).c((float)(d4 + d5));
        d4 += d5;
        d7 -= d5;
      }
    }
    d4 = d1 == 0.0D ? 0.0D : -Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 360.0D / 2.0D;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    d7 = -d4;
    for (i8 = 0; i8 < localArrayList1.size(); i8++) {
      if (((Double)localArrayList1.get(i8)).doubleValue() != 0.0D)
      {
        localObject1 = (zkf)localArrayList3.get(i8);
        d5 = a(((Double)localArrayList1.get(i8)).doubleValue(), d1);
        if (d5 == 0.0D) {
          d5 = 0.001D;
        }
        localObject2 = null;
        if (((zkf)localObject1).F() > 0.0F)
        {
          localObject2 = paramzr.d();
          a((zkf)localObject1, localzq1, d4, (float)(d5 == 0.0D ? 0.01D : d5), d7);
        }
        localObject3 = new ze();
        if (d5 == 360.0D) {
          ((ze)localObject3).a(localzq1, (float)d4, (float)d5);
        } else {
          ((ze)localObject3).b(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i(), (float)d4, (float)d5);
        }
        ((zkf)localObject1).k().a((ze)localObject3);
        if (((zkf)localObject1).F() > 0.0F) {
          paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject2);
        }
        d4 += d5;
        d7 -= d5;
      }
    }
    double d8 = i3 - j;
    Object localObject4;
    double d9;
    for (int i9 = 0; i9 < localArrayList2.size(); i9++) {
      if (((Double)localArrayList2.get(i9)).doubleValue() != 0.0D)
      {
        localObject4 = (zkf)localArrayList4.get(i9);
        d9 = Math.abs(((Double)localArrayList2.get(i9)).doubleValue()) / d2 * 2.0D * j;
        localObject5 = new zq(i2, (float)d8, j, (float)d9);
        ((zkf)localObject4).i().a((zq)localObject5);
        ((zkf)localObject4).k().a((zq)localObject5);
        ((zkf)localObject4).a(new zq(((zq)localObject5).f(), ((zq)localObject5).g(), ((zq)localObject5).h(), ((zq)localObject5).i()));
        d8 += d9;
      }
    }
    if (localArrayList2.size() == 0)
    {
      zq localzq2 = new zq(i2, (float)d8, j, 2.0F * j);
      localObject4 = new zu(Color.fromArgb(64, 64, 64));
      paramzr.b((zc)localObject4, localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
      localObject5 = new com.aspose.cells.a.d.zs(Color.fromArgb(0, 0, 0), 3.0F);
      paramzr.c((com.aspose.cells.a.d.zs)localObject5, localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
    }
    double d10;
    if ((paramzbfd.Z()) && (d1 != 0.0D) && (localArrayList2.size() > 0))
    {
      localObject5 = new zo(i2, i3 - j);
      zo localzo1 = new zo(i2, i3 + j);
      if (Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 2.0D * 3.141592653589793D > 3.141592653589793D)
      {
        d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 3.141592653589793D;
        if (localArrayList1.size() == 1) {
          d4 = 0.0D;
        }
        double d12 = Math.sqrt(Math.pow(i3 - i1, 2.0D) + Math.pow(i2 - n, 2.0D));
        d10 = Math.acos(d6 / d12) + Math.asin(j / d12);
        zo localzo3 = new zo((float)(n + d6 * Math.cos(d10)), (float)(i1 - d6 * Math.sin(d10)));
        zo localzo4 = new zo((float)(n + d6 * Math.cos(-d10)), (float)(i1 - d6 * Math.sin(-d10)));
        if (localzkf1.F() > 0.0F)
        {
          float f2 = (float)(d6 * localzkf1.F() / 100.0D);
          localzo3.a(localzo3.d() + f2);
          localzo4.a(localzo4.d() + f2);
        }
        paramzbfd.aa().a(localzo3, (zo)localObject5);
        paramzbfd.aa().a(localzo4, localzo1);
      }
      else
      {
        d10 = Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 3.141592653589793D;
        zo localzo2 = new zo((float)(n + d6 * Math.cos(d10)), (float)(i1 - d6 * Math.sin(d10)));
        localObject6 = new zo((float)(n + d6 * Math.cos(-d10)), (float)(i1 - d6 * Math.sin(-d10)));
        if (localzkf1.F() > 0.0F)
        {
          float f1 = (float)(d6 * localzkf1.F() / 100.0D);
          localzo2.a(localzo2.d() + f1);
          ((zo)localObject6).a(((zo)localObject6).d() + f1);
        }
        paramzbfd.aa().a(localzo2, (zo)localObject5);
        paramzbfd.aa().a((zo)localObject6, localzo1);
      }
    }
    paramzr.a(localzf);
    Object localObject5 = paramzbfd.w();
    Object localObject6 = new zt(0.0F, 0.0F);
    double d13 = 0.0D;
    double d14 = 0.0D;
    d4 = d1 == 0.0D ? 0.0D : Math.abs(((Double)localArrayList1.get(0)).doubleValue()) / d1 * 180.0D;
    double d15 = -d4;
    if (localArrayList1.size() == 1) {
      d4 = 0.0D;
    }
    d5 = 0.0D;
    float f4 = paramzjf.b();
    zkf localzkf2;
    int i11;
    float f3;
    double d11;
    for (int i10 = 0; i10 < localArrayList1.size(); i10++) {
      if ((((Double)localArrayList1.get(i10)).doubleValue() != 0.0D) || (i10 == 0))
      {
        localzkf2 = (zkf)localArrayList3.get(i10);
        if (!a(localzkf2))
        {
          i11 = localzkf2.I();
          if (i10 == 0) {
            i11 = -1;
          }
          double d16 = 0.0D;
          if (localzkf2 != null)
          {
            localObject5 = localzkf2.o();
            d16 = localzkf2.F() / 100.0F;
          }
          if (((zqy)localObject5).a().d().h()) {
            f3 = paramzjf.a() * 0.175F;
          } else {
            f3 = paramzjf.a() * 0.2F;
          }
          d11 = d3 == 0.0D ? 0.0D : ((Double)localArrayList1.get(i10)).doubleValue() / d3;
          localObject6 = a(paramzr, paramzjf.z(), i4, i11, d11, f3, f4, ((Double)localArrayList1.get(0)).doubleValue());
          d5 = d1 == 0.0D ? 0.0D : ((Double)localArrayList1.get(i10)).doubleValue() / d1 * 360.0D;
          double d17 = i * d16;
          double d18 = (d4 - d5 / 2.0D) % 360.0D;
          d10 = d18 * 3.141592653589793D / 180.0D;
          int i12 = 0;
          int i13 = ((zqy)localObject5).j();
          d13 = 0.0D;
          d14 = 0.0D;
          while (i12 == 0)
          {
            double d19;
            double[] arrayOfDouble;
            switch (i13)
            {
            case 1: 
              d19 = d17 + d6 * 0.5D;
              d13 = d19 * Math.cos(d10);
              d14 = d19 * Math.sin(d10);
              d13 -= ((zt)localObject6).b() / 2.0F;
              d14 += ((zt)localObject6).c() / 2.0F;
              i12 = 1;
              break;
            case 3: 
              d19 = d17 + d6 * (1.0F - d);
              d13 = d19 * Math.cos(d10);
              d14 = d19 * Math.sin(d10);
              localObject7 = new double[] { d13 };
              arrayOfDouble = new double[] { d14 };
              b((double[])localObject7, arrayOfDouble, d18, (zt)localObject6);
              d13 = localObject7[0];
              d14 = arrayOfDouble[0];
              i12 = 1;
              break;
            case 4: 
              d19 = d17 + d6 * (1.0F + d);
              d13 = d19 * Math.cos(d10);
              d14 = d19 * Math.sin(d10);
              localObject7 = new double[] { d13 };
              arrayOfDouble = new double[] { d14 };
              a((double[])localObject7, arrayOfDouble, d18, (zt)localObject6);
              d13 = localObject7[0];
              d14 = arrayOfDouble[0];
              i12 = 1;
              break;
            case 9: 
              d19 = d17 + d6 * (1.0F + d);
              d13 = d19 * Math.cos(d10);
              d14 = d19 * Math.sin(d10);
              localObject7 = new double[] { d13 };
              arrayOfDouble = new double[] { d14 };
              a((double[])localObject7, arrayOfDouble, d18, (zt)localObject6);
              d13 = localObject7[0];
              d14 = arrayOfDouble[0];
              i12 = 1;
              break;
            case 2: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            default: 
              d19 = d17 + d6 * (1.0F - d);
              d13 = d19 * Math.cos(d10);
              d14 = d19 * Math.sin(d10);
              localObject7 = new double[] { d13 };
              arrayOfDouble = new double[] { d14 };
              b((double[])localObject7, arrayOfDouble, d18, (zt)localObject6);
              d13 = localObject7[0];
              d14 = arrayOfDouble[0];
              localObject7 = new zq((float)d13, (float)d14, ((zt)localObject6).b(), ((zt)localObject6).c());
              boolean bool = a(paramzr, (float)d15, (float)d4, (float)d5, i, (float)d17, (zq)localObject7, (zqy)localObject5);
              if (bool)
              {
                i12 = 1;
              }
              else
              {
                zo localzo5 = a(paramzr, (float)d15, (float)d4, (float)d5, i, (float)d17, (zt)localObject6, (zqy)localObject5);
                if (localzo5.b())
                {
                  i12 = 0;
                  i13 = 4;
                }
                else
                {
                  d13 = localzo5.d();
                  d14 = localzo5.e();
                  i12 = 1;
                }
              }
              break;
            }
          }
          d13 = n + d13;
          d14 = i1 - d14;
          if (((zqy)localObject5).j() == 9)
          {
            ((zqy)localObject5).a().b = new zp(zbxz.a(d13), zbxz.a(d14), zbxz.a(((zt)localObject6).b()), zbxz.a(((zt)localObject6).c()));
            ((zqy)localObject5).a().z();
            d13 = ((zqy)localObject5).a().a.c();
            d14 = ((zqy)localObject5).a().a.d();
          }
          Object localObject7 = new zq((float)d13, (float)d14, ((zt)localObject6).b(), ((zt)localObject6).c());
          Object[] arrayOfObject2 = new Object[5];
          arrayOfObject2[0] = Integer.valueOf(i4);
          arrayOfObject2[1] = Integer.valueOf(i11);
          arrayOfObject2[2] = Double.valueOf(d11);
          arrayOfObject2[3] = localObject7;
          arrayOfObject2[4] = localArrayList1.get(0);
          com.aspose.cells.b.a.a.zf.a(paramArrayList1, arrayOfObject2);
          d4 -= d5;
          d15 += d5;
        }
      }
    }
    d8 = i3 - j;
    f4 = paramzjf.b();
    localObject5 = paramzbfd.w();
    for (i10 = 0; i10 < localArrayList2.size(); i10++) {
      if (((Double)localArrayList2.get(i10)).doubleValue() != 0.0D)
      {
        localzkf2 = (zkf)localArrayList4.get(i10);
        if (!a(localzkf2))
        {
          i11 = localzkf2.I();
          if (localzkf2 != null) {
            localObject5 = localzkf2.o();
          }
          if (((zqy)localObject5).a().d().h()) {
            f3 = paramzjf.a() * 0.175F;
          } else {
            f3 = paramzjf.a() * 0.2F;
          }
          d9 = Math.abs(((Double)localArrayList2.get(i10)).doubleValue()) / d2 * 2.0D * j;
          d13 = i2;
          d14 = d8;
          d8 += d9;
          d11 = d3 == 0.0D ? 0.0D : ((Double)localArrayList2.get(i10)).doubleValue() / d3;
          localObject6 = a(paramzr, paramzjf.z(), i4, i11, d11, f3, f4, ((Double)localArrayList1.get(0)).doubleValue());
          d10 = 0.0D;
          switch (((zqy)localObject5).j())
          {
          case 1: 
            d13 += (j - ((zt)localObject6).b()) / 2.0F;
            d14 += (d9 - ((zt)localObject6).c()) / 2.0D;
            break;
          case 3: 
            d13 += (j - ((zt)localObject6).b()) / 2.0F;
            break;
          default: 
            d13 = d13 + j + 1.0D;
            d14 += (d9 - ((zt)localObject6).c()) / 2.0D;
          }
          if (((zqy)localObject5).j() == 9)
          {
            ((zqy)localObject5).a().b = new zp(zbxz.a(d13), zbxz.a(d14), zbxz.a(((zt)localObject6).b()), zbxz.a(((zt)localObject6).c()));
            ((zqy)localObject5).a().z();
            d13 = ((zqy)localObject5).a().a.c();
            d14 = ((zqy)localObject5).a().a.d();
          }
          zq localzq3 = new zq((float)d13, (float)d14, ((zt)localObject6).b(), ((zt)localObject6).c());
          Object[] arrayOfObject1 = new Object[5];
          arrayOfObject1[0] = Integer.valueOf(i4);
          arrayOfObject1[1] = Integer.valueOf(i11);
          arrayOfObject1[2] = Double.valueOf(d11);
          arrayOfObject1[3] = localzq3;
          arrayOfObject1[4] = localArrayList1.get(0);
          com.aspose.cells.b.a.a.zf.a(paramArrayList1, arrayOfObject1);
        }
      }
    }
  }
  
  private static void a(zr paramzr, zjf paramzjf, zp paramzp, List paramList, ArrayList paramArrayList1, ArrayList paramArrayList2)
    throws Exception
  {
    zbfd localzbfd1 = (zbfd)paramList.get(0);
    int i = localzbfd1.W();
    int j = localzbfd1.X();
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
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(4, true);
    Object localObject;
    double d8;
    double d9;
    for (int k = 0; k < paramList.size(); k++)
    {
      localObject = (zbfd)paramList.get(k);
      int m = ((zbfd)localObject).ak();
      double d7 = 0.0D;
      zkh localzkh1 = ((zbfd)localObject).F();
      int i3 = localzkh1.getCount();
      for (int i4 = 0; i4 < localzkh1.getCount(); i4++) {
        d7 += Math.abs(localzkh1.a(i4).w());
      }
      d8 = i - 90.0F;
      d9 = 0.0D;
      for (int i5 = 0; i5 < localzkh1.getCount(); i5++)
      {
        zkf localzkf1 = localzkh1.b(i5);
        if (localzkh1.a(i5).w() != 0.0D)
        {
          d9 = a(localzkh1.a(i5).w(), d7);
          if (d9 == 0.0D) {
            d9 = 0.001D;
          }
          if (k == paramList.size() - 1)
          {
            d11 = (360.0D - d8 - d9 / 2.0D) * 3.141592653589793D / 180.0D;
            d12 = d1 * localzkf1.F() / 100.0D;
            d14 = d12 * Math.cos(d11);
            double d15 = d12 * Math.sin(d11);
            d4 = paramzp.c() + paramzp.e() / 2.0D + d14;
            d5 = paramzp.d() + paramzp.f() / 2.0D - d15;
            localzq1.a((float)(d4 - d6));
            localzq1.b((float)(d5 - d6));
            localzq1.c((float)(2.0D * d6));
            localzq1.d((float)(2.0D * d6));
          }
          ze localze2 = new ze();
          zq localzq2 = zbxz.b(localzq1);
          localze2.a(localzq2, (float)d8, (float)d9);
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
          localze2.a(localzo1, localzo2);
          zq localzq3 = zbxz.b(localzq1);
          localzq3.a(localzq3.f() - (float)d3);
          localzq3.b(localzq3.g() - (float)d3);
          localzq3.c(localzq3.h() + 2.0F * (float)d3);
          localzq3.d(localzq3.i() + 2.0F * (float)d3);
          localze2.a(localzq3, (float)(d8 + d9), -(float)d9);
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
          localze2.a(localzo4, localzo3);
          localze2.j();
          localzkf1.i().a(localze2);
          com.aspose.cells.b.a.a.zf.a(localArrayList1, localzkf1);
          com.aspose.cells.b.a.a.zf.a(localArrayList2, localze2);
          localzkf1.a(new zq(localzq3.f() + localzq3.h() / 2.0F, localzq3.g() + localzq3.i() / 2.0F, localzq3.h() / 2.0F, localzq3.i() / 2.0F));
          localzkf1.d(localzq2.h() / 2.0F);
          localzkf1.b((float)d8);
          localzkf1.c((float)(d8 + d9));
          d8 += d9;
        }
      }
      d6 += d3;
      localzq1.a(localzq1.f() - (float)d3);
      localzq1.b(localzq1.g() - (float)d3);
      localzq1.c(localzq1.h() + 2.0F * (float)d3);
      localzq1.d(localzq1.i() + 2.0F * (float)d3);
    }
    for (k = 0; k < localArrayList1.size(); k++)
    {
      localObject = (zkf)localArrayList1.get(k);
      ze localze1 = (ze)localArrayList2.get(k);
      ((zkf)localObject).k().a(localze1);
    }
    paramzr.a(localzf);
    float f2 = paramzjf.b();
    int n = 0;
    for (int i1 = 0; i1 < paramList.size(); i1++)
    {
      zbfd localzbfd2 = (zbfd)paramList.get(i1);
      int i2 = localzbfd2.ak();
      zkh localzkh2 = localzbfd2.F();
      d8 = i - 90.0F;
      d9 = 0.0D;
      double d10 = 0.0D;
      for (int i6 = 0; i6 < localzkh2.getCount(); i6++) {
        d10 += Math.abs(localzkh2.a(i6).w());
      }
      d6 = d2 + i1 * d3 + d3 / 2.0D;
      for (i6 = 0; i6 < localzkh2.getCount(); i6++)
      {
        zkf localzkf2 = localzkh2.b(i6);
        zqy localzqy = localzkf2.o();
        if (!a(localzkf2))
        {
          float f1;
          if (localzqy.a().d().h()) {
            f1 = paramzjf.a() * 0.175F;
          } else {
            f1 = paramzjf.a() * 0.2F;
          }
          double d13 = d10 == 0.0D ? 0.0D : localzkh2.a(i6).w() / d10;
          zt localzt = a(paramzr, paramzjf.z(), i2, i6, d13, f1, f2, 0.0D);
          d9 = a(localzkh2.a(i6).w(), d10);
          if (i1 == paramList.size() - 1)
          {
            d16 = (360.0D - d8 - d9 / 2.0D) * 3.141592653589793D / 180.0D;
            d17 = d1 * localzkh2.a(i6).F() / 100.0D;
            d18 = d17 * Math.cos(d16);
            double d19 = d17 * Math.sin(d16);
            d4 = paramzp.c() + paramzp.e() / 2.0D + d18;
            d5 = paramzp.d() + paramzp.f() / 2.0D - d19;
          }
          double d16 = (360.0D - d8 - d9 / 2.0D) * 3.141592653589793D / 180.0D;
          double d17 = d6 * Math.cos(d16);
          double d18 = d6 * Math.sin(d16);
          d17 = d4 + d17;
          d18 = d5 - d18;
          localzqy.d = new zo((float)d17, (float)d18);
          d17 -= localzt.b() / 2.0F;
          d18 -= localzt.c() / 2.0F;
          localzqy.a().b = new zp(zbxz.a(d17), zbxz.a(d18), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
          localzqy.a().z();
          zq localzq4 = new zq(localzqy.a().a.c(), localzqy.a().a.d(), localzqy.a().a.e(), localzqy.a().a.f());
          Object[] arrayOfObject1 = new Object[5];
          arrayOfObject1[0] = Integer.valueOf(i2);
          arrayOfObject1[1] = Integer.valueOf(i6);
          arrayOfObject1[2] = Double.valueOf(d13);
          arrayOfObject1[3] = localzq4;
          arrayOfObject1[4] = Double.valueOf(0.0D);
          com.aspose.cells.b.a.a.zf.a(paramArrayList1, arrayOfObject1);
          if ((localzbfd2.S()) && (localzqy.j() == 9))
          {
            ze localze3 = (ze)localArrayList2.get(n);
            com.aspose.cells.b.a.b.zr localzr = new com.aspose.cells.b.a.b.zr(localzqy.a().b);
            localzr.a(new zq(localzq4.f(), localzq4.g(), localzq4.h(), localzq4.i()));
            if ((paramzr.a().b(localzr)) || ((localzkf2.w() == 0.0D) && (localzkf2.w() != 0.0D)))
            {
              float f3 = (float)(d1 * b);
              if (localzq4.f() > localzqy.d.d())
              {
                if (localzq4.f() - f3 > localzqy.d.d())
                {
                  localzqy.f = new zo(localzq4.f(), localzq4.g() + localzq4.i() / 2.0F);
                  localzqy.e = new zo(localzqy.f.d() - f3, localzqy.f.e());
                }
                else if (localzq4.g() > localzqy.d.e())
                {
                  localzqy.f = new zo(localzq4.f() + localzq4.h() / 2.0F, localzq4.g());
                  localzqy.e = new zo(localzqy.f.d(), localzqy.f.e() - f3);
                }
                else if (localzq4.m() < localzqy.d.e())
                {
                  localzqy.f = new zo(localzq4.f() + localzq4.h() / 2.0F, localzq4.m());
                  localzqy.e = new zo(localzqy.f.d(), localzqy.f.e() + f3);
                }
              }
              else if (localzq4.l() < localzqy.d.d()) {
                if (localzq4.l() + f3 < localzqy.d.d())
                {
                  localzqy.f = new zo(localzq4.l(), localzq4.g() + localzq4.i() / 2.0F);
                  localzqy.e = new zo(localzqy.f.d() + f3, localzqy.f.e());
                }
                else if (localzq4.g() > localzqy.d.e())
                {
                  localzqy.f = new zo(localzq4.f() + localzq4.h() / 2.0F, localzq4.g());
                  localzqy.e = new zo(localzqy.f.d(), localzqy.f.e() - f3);
                }
                else if (localzq4.m() < localzqy.d.e())
                {
                  localzqy.f = new zo(localzq4.f() + localzq4.h() / 2.0F, localzq4.m());
                  localzqy.e = new zo(localzqy.f.d(), localzqy.f.e() + f3);
                }
              }
              float f4 = (float)(d6 * b);
              if (!localzqy.e.b())
              {
                ze localze4 = new ze();
                localze4.a(localzqy.d, localzqy.e);
                localze4.a(localzqy.e, localzqy.f);
                Object[] arrayOfObject2 = new Object[5];
                arrayOfObject2[0] = localze4;
                arrayOfObject2[1] = localzbfd2.T();
                com.aspose.cells.b.a.a.zf.a(paramArrayList2, arrayOfObject2);
              }
            }
          }
          if (localzkf2.w() != 0.0D) {
            n++;
          }
          d8 += d9;
        }
      }
    }
  }
  
  private static void b(zr paramzr, zjf paramzjf, zp paramzp, List paramList, ArrayList paramArrayList1, ArrayList paramArrayList2)
    throws Exception
  {
    zbfd localzbfd1 = (zbfd)paramList.get(0);
    int i = localzbfd1.W();
    int j = localzbfd1.X();
    double d1 = paramzp.e() / 2.0D / (1.0F + localzbfd1.aA() / 100.0F);
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
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(4, true);
    Object localObject;
    for (int k = 0; k < paramList.size(); k++)
    {
      localObject = (zbfd)paramList.get(k);
      int m = ((zbfd)localObject).ak();
      double d7 = 0.0D;
      zkh localzkh1 = ((zbfd)localObject).F();
      for (int i3 = 0; i3 < localzkh1.getCount(); i3++) {
        d7 += Math.abs(localzkh1.a(i3).w());
      }
      double d8 = i - 90.0F;
      double d10 = 0.0D;
      int i4 = localzkh1.getCount();
      for (int i5 = 0; i5 < localzkh1.getCount(); i5++)
      {
        zkf localzkf1 = localzkh1.b(i5);
        if (localzkh1.a(i5).w() != 0.0D)
        {
          d10 = a(localzkh1.a(i5).w(), d7);
          if (d10 == 0.0D) {
            d10 = 0.001D;
          }
          if (k == paramList.size() - 1)
          {
            d13 = (360.0D - d8 - d10 / 2.0D) * 3.141592653589793D / 180.0D;
            d14 = d1 * localzkf1.F() / 100.0D;
            d16 = d14 * Math.cos(d13);
            double d17 = d14 * Math.sin(d13);
            d4 = paramzp.c() + paramzp.e() / 2.0D + d16;
            d5 = paramzp.d() + paramzp.f() / 2.0D - d17;
            localzq1.a((float)(d4 - d6));
            localzq1.b((float)(d5 - d6));
            localzq1.c((float)(2.0D * d6));
            localzq1.d((float)(2.0D * d6));
          }
          ze localze2 = new ze();
          zq localzq2 = zbxz.b(localzq1);
          localze2.a(localzq2, (float)d8, (float)d10);
          double d13 = (360.0D - d8 - d10) * 3.141592653589793D / 180.0D;
          double d14 = d6 * Math.cos(d13);
          double d16 = d6 * Math.sin(d13);
          d14 = d4 + d14;
          d16 = d5 - d16;
          zo localzo1 = new zo((float)d14, (float)d16);
          d14 = (d6 + d3) * Math.cos(d13);
          d16 = (d6 + d3) * Math.sin(d13);
          d14 = d4 + d14;
          d16 = d5 - d16;
          zo localzo2 = new zo((float)d14, (float)d16);
          localze2.a(localzo1, localzo2);
          zq localzq3 = zbxz.b(localzq1);
          localzq3.a(localzq3.f() - (float)d3);
          localzq3.b(localzq3.g() - (float)d3);
          localzq3.c(localzq3.h() + 2.0F * (float)d3);
          localzq3.d(localzq3.i() + 2.0F * (float)d3);
          localze2.a(localzq3, (float)(d8 + d10), -(float)d10);
          d13 = (360.0D - d8) * 3.141592653589793D / 180.0D;
          d14 = d6 * Math.cos(d13);
          d16 = d6 * Math.sin(d13);
          d14 = d4 + d14;
          d16 = d5 - d16;
          zo localzo3 = new zo((float)d14, (float)d16);
          d14 = (d6 + d3) * Math.cos(d13);
          d16 = (d6 + d3) * Math.sin(d13);
          d14 = d4 + d14;
          d16 = d5 - d16;
          zo localzo4 = new zo((float)d14, (float)d16);
          localze2.a(localzo4, localzo3);
          localze2.j();
          localzkf1.i().a(localze2);
          com.aspose.cells.b.a.a.zf.a(localArrayList1, localzkf1);
          com.aspose.cells.b.a.a.zf.a(localArrayList2, localze2);
          localzkf1.a(new zq(localzq3.f() + localzq3.h() / 2.0F, localzq3.g() + localzq3.i() / 2.0F, localzq3.h() / 2.0F, localzq3.i() / 2.0F));
          localzkf1.d(localzq2.h() / 2.0F);
          localzkf1.b((float)d8);
          localzkf1.c((float)(d8 + d10));
          d8 += d10;
        }
      }
      d6 += d3;
      localzq1.a(localzq1.f() - (float)d3);
      localzq1.b(localzq1.g() - (float)d3);
      localzq1.c(localzq1.h() + 2.0F * (float)d3);
      localzq1.d(localzq1.i() + 2.0F * (float)d3);
    }
    for (k = 0; k < localArrayList1.size(); k++)
    {
      localObject = (zkf)localArrayList1.get(k);
      ze localze1 = (ze)localArrayList2.get(k);
      ((zkf)localObject).k().a(localze1);
    }
    paramzr.a(localzf);
    d4 = paramzp.c() + paramzp.e() / 2.0D;
    d5 = paramzp.d() + paramzp.f() / 2.0D;
    float f2 = paramzjf.b();
    int n = 0;
    for (int i1 = 0; i1 < paramList.size(); i1++)
    {
      zbfd localzbfd2 = (zbfd)paramList.get(i1);
      int i2 = localzbfd2.ak();
      zkh localzkh2 = localzbfd2.F();
      double d9 = i - 90.0F;
      double d11 = 0.0D;
      double d12 = 0.0D;
      for (int i6 = 0; i6 < localzkh2.getCount(); i6++) {
        d12 += Math.abs(localzkh2.a(i6).w());
      }
      d6 = d2 + i1 * d3 + d3 / 2.0D;
      for (i6 = 0; i6 < localzkh2.getCount(); i6++)
      {
        zkf localzkf2 = localzkh2.b(i6);
        zqy localzqy = localzkf2.o();
        if (!a(localzkf2))
        {
          float f1;
          if (localzqy.a().d().h()) {
            f1 = paramzjf.a() * 0.175F;
          } else {
            f1 = paramzjf.a() * 0.2F;
          }
          double d15 = d12 == 0.0D ? 0.0D : localzkh2.a(i6).w() / d12;
          zt localzt = a(paramzr, paramzjf.z(), i2, i6, d15, f1, f2, 0.0D);
          d11 = a(localzkh2.a(i6).w(), d12);
          if (i1 == paramList.size() - 1)
          {
            d18 = (360.0D - d9 - d11 / 2.0D) * 3.141592653589793D / 180.0D;
            d19 = d1 * localzkh2.a(i6).F() / 100.0D;
            d20 = d19 * Math.cos(d18);
            double d21 = d19 * Math.sin(d18);
            d4 = paramzp.c() + paramzp.e() / 2.0D + d20;
            d5 = paramzp.d() + paramzp.f() / 2.0D - d21;
          }
          double d18 = (360.0D - d9 - d11 / 2.0D) * 3.141592653589793D / 180.0D;
          double d19 = d6 * Math.cos(d18);
          double d20 = d6 * Math.sin(d18);
          d19 = d4 + d19;
          d20 = d5 - d20;
          localzqy.d = new zo((float)d19, (float)d20);
          d19 -= localzt.b() / 2.0F;
          d20 -= localzt.c() / 2.0F;
          localzqy.a().b = new zp(zbxz.a(d19), zbxz.a(d20), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
          localzqy.a().z();
          zq localzq4 = new zq(localzqy.a().a.c(), localzqy.a().a.d(), localzqy.a().a.e(), localzqy.a().a.f());
          Object[] arrayOfObject1 = new Object[5];
          arrayOfObject1[0] = Integer.valueOf(i2);
          arrayOfObject1[1] = Integer.valueOf(i6);
          arrayOfObject1[2] = Double.valueOf(d15);
          arrayOfObject1[3] = localzq4;
          arrayOfObject1[4] = Double.valueOf(0.0D);
          com.aspose.cells.b.a.a.zf.a(paramArrayList1, arrayOfObject1);
          if ((localzbfd2.S()) && (localzqy.j() == 9) && (localzkf2.w() != 0.0D))
          {
            ze localze3 = (ze)localArrayList2.get(n);
            com.aspose.cells.b.a.b.zr localzr = new com.aspose.cells.b.a.b.zr(localzqy.a().b);
            localzr.a(new zq(localzq4.f(), localzq4.g(), localzq4.h(), localzq4.i()));
            if ((paramzr.a().b(localzr)) || (localzkf2.w() == 0.0D))
            {
              float f3 = (float)(d1 * b);
              if (localzq4.f() > localzqy.d.d())
              {
                if (localzq4.f() - f3 > localzqy.d.d())
                {
                  localzqy.f = new zo(localzq4.f(), localzq4.g() + localzq4.i() / 2.0F);
                  localzqy.e = new zo(localzqy.f.d() - f3, localzqy.f.e());
                }
                else if (localzq4.g() > localzqy.d.e())
                {
                  localzqy.f = new zo(localzq4.f() + localzq4.h() / 2.0F, localzq4.g());
                  localzqy.e = new zo(localzqy.f.d(), localzqy.f.e() - f3);
                }
                else if (localzq4.m() < localzqy.d.e())
                {
                  localzqy.f = new zo(localzq4.f() + localzq4.h() / 2.0F, localzq4.m());
                  localzqy.e = new zo(localzqy.f.d(), localzqy.f.e() + f3);
                }
              }
              else if (localzq4.l() < localzqy.d.d()) {
                if (localzq4.l() + f3 < localzqy.d.d())
                {
                  localzqy.f = new zo(localzq4.l(), localzq4.g() + localzq4.i() / 2.0F);
                  localzqy.e = new zo(localzqy.f.d() + f3, localzqy.f.e());
                }
                else if (localzq4.g() > localzqy.d.e())
                {
                  localzqy.f = new zo(localzq4.f() + localzq4.h() / 2.0F, localzq4.g());
                  localzqy.e = new zo(localzqy.f.d(), localzqy.f.e() - f3);
                }
                else if (localzq4.m() < localzqy.d.e())
                {
                  localzqy.f = new zo(localzq4.f() + localzq4.h() / 2.0F, localzq4.m());
                  localzqy.e = new zo(localzqy.f.d(), localzqy.f.e() + f3);
                }
              }
              float f4 = (float)(d6 * b);
              if (!localzqy.e.b())
              {
                ze localze4 = new ze();
                localze4.a(localzqy.d, localzqy.e);
                localze4.a(localzqy.e, localzqy.f);
                Object[] arrayOfObject2 = new Object[5];
                arrayOfObject2[0] = localze4;
                arrayOfObject2[1] = localzbfd2.T();
                com.aspose.cells.b.a.a.zf.a(paramArrayList2, arrayOfObject2);
              }
            }
          }
          if (localzkf2.w() != 0.0D) {
            n++;
          }
          d9 += d11;
        }
      }
    }
  }
  
  static void a(zjf paramzjf, zp[] paramArrayOfzp, zbfd paramzbfd)
  {
    if ((paramArrayOfzp[0].e() <= 0) || (paramArrayOfzp[0].f() <= 0) || (!paramzbfd.av())) {
      return;
    }
    if (paramzjf.B().s())
    {
      int i = 4;
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + i);
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + i);
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - 2 * i);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 2 * i);
      int j = 0;
      if ((paramzbfd.m() == 35) || (paramzbfd.m() == 36))
      {
        if (paramzbfd.az()) {
          j = 1;
        }
      }
      else if ((paramzbfd.az()) && ((paramzbfd.w().j() == 4) || (paramzbfd.w().j() == 0))) {
        j = 1;
      }
      if (j != 0)
      {
        k = paramArrayOfzp[0].e();
        if (paramArrayOfzp[0].e() > paramArrayOfzp[0].f()) {
          k = paramArrayOfzp[0].f();
        }
        int m = zbxz.b(k / 100.0F * 7.0F);
        paramArrayOfzp[0].a(paramArrayOfzp[0].c() + m);
        paramArrayOfzp[0].b(paramArrayOfzp[0].d() + m);
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - 2 * m);
        paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 2 * m);
      }
      int k = 10;
      if (paramArrayOfzp[0].e() < k) {
        paramArrayOfzp[0].c(k);
      }
      if (paramArrayOfzp[0].f() < k) {
        paramArrayOfzp[0].d(k);
      }
    }
  }
  
  static void a(zr paramzr, zjf paramzjf, zp[] paramArrayOfzp, zbfd paramzbfd)
    throws Exception
  {
    a(paramzr, paramzjf, paramArrayOfzp[0], paramzbfd);
    a(paramzbfd, paramArrayOfzp[0].e() / 2);
    ArrayList localArrayList1 = a(paramzbfd, paramArrayOfzp[0]);
    for (int i = 0; (i < 10) && (localArrayList1.size() > 0); i++)
    {
      a(paramzbfd, paramArrayOfzp[0].e() / 2, localArrayList1);
      ArrayList localArrayList2 = new ArrayList();
      for (int j = 0; j < localArrayList1.size(); j++)
      {
        ArrayList localArrayList4 = (ArrayList)localArrayList1.get(j);
        localObject = new ArrayList();
        for (int m = 0; m < localArrayList4.size(); m++) {
          com.aspose.cells.b.a.a.zf.a((ArrayList)localObject, localArrayList4.get(m));
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localObject);
      }
      ArrayList localArrayList3 = new ArrayList();
      a(paramzbfd, localArrayList1, paramArrayOfzp[0], paramArrayOfzp[0], localArrayList3);
      a(paramzbfd, paramArrayOfzp[0].e() / 2, localArrayList2, localArrayList3);
      localArrayList1 = a(paramzbfd, paramArrayOfzp[0]);
      int k = 0;
      Object localObject = localArrayList1.iterator();
      while (((Iterator)localObject).hasNext())
      {
        ArrayList localArrayList5 = (ArrayList)((Iterator)localObject).next();
        k += localArrayList5.size();
      }
      if (localArrayList3.size() == k) {
        break;
      }
    }
  }
  
  static void a(zr paramzr, zjf paramzjf, zp paramzp, zbfd paramzbfd)
    throws Exception
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(paramzr, paramzjf, localzq, paramzbfd);
  }
  
  static void a(zr paramzr, zjf paramzjf, zq paramzq, zbfd paramzbfd)
    throws Exception
  {
    int i = paramzbfd.ak();
    double d1 = 0.0D;
    zkh localzkh = paramzbfd.F();
    for (int j = 0; j < localzkh.getCount(); j++) {
      d1 += Math.abs(localzkh.a(j).w());
    }
    double d2 = paramzq.f() + paramzq.h() / 2.0D;
    double d3 = paramzq.g() + paramzq.i() / 2.0D;
    double d4 = 90.0F - paramzbfd.W();
    double d5 = 0.0D;
    double d6 = -d4;
    float f2 = paramzjf.b();
    for (int k = 0; k < localzkh.getCount(); k++)
    {
      zkf localzkf = localzkh.b(k);
      zqy localzqy = localzkf.o();
      float f1;
      if (localzqy.a().d().h()) {
        f1 = paramzjf.a() * 0.175F;
      } else {
        f1 = paramzjf.a() * 0.2F;
      }
      double d7 = d1 == 0.0D ? 0.0D : Math.abs(localzkh.a(k).w()) / d1;
      zt localzt = a(paramzr, paramzjf.z(), i, k, d7, f1, f2, 0.0D);
      d5 = a(localzkh.a(k).w(), d1);
      double d8 = (d4 - d5 / 2.0D) % 360.0D;
      double d9 = d8 * 3.141592653589793D / 180.0D;
      localzqy.g = d9;
      double d10 = localzkf.F() / 100.0F;
      double d11;
      if (paramzjf.N() == 44) {
        d11 = paramzq.h() / 2.0D;
      } else {
        d11 = paramzq.h() / 2.0D / (1.0D + d10);
      }
      double d12 = d11 * d10;
      double d13 = (d10 + 1.0D) * d11 * Math.cos(d9);
      double d14 = (d10 + 1.0D) * d11 * Math.sin(d9);
      localzqy.d = new zo((float)(d2 + d13), (float)(d3 - d14));
      double d15 = 0.0D;
      double d16 = 0.0D;
      int m = 0;
      int n = localzqy.j();
      while (m == 0)
      {
        double d17;
        double[] arrayOfDouble;
        switch (n)
        {
        case 1: 
          d17 = d12 + d11 * 0.5D;
          d15 = d17 * Math.cos(d9);
          d16 = d17 * Math.sin(d9);
          d15 -= localzt.b() / 2.0F;
          d16 += localzt.c() / 2.0F;
          m = 1;
          break;
        case 3: 
          d17 = d12 + d11 * (1.0F - d);
          d15 = d17 * Math.cos(d9);
          d16 = d17 * Math.sin(d9);
          localObject = new double[] { d15 };
          arrayOfDouble = new double[] { d16 };
          b((double[])localObject, arrayOfDouble, d8, localzt);
          d15 = localObject[0];
          d16 = arrayOfDouble[0];
          m = 1;
          break;
        case 4: 
          d17 = d12 + d11 * (1.0F + d);
          d15 = d17 * Math.cos(d9);
          d16 = d17 * Math.sin(d9);
          localObject = new double[] { d15 };
          arrayOfDouble = new double[] { d16 };
          a((double[])localObject, arrayOfDouble, d8, localzt);
          d15 = localObject[0];
          d16 = arrayOfDouble[0];
          m = 1;
          break;
        case 9: 
          d17 = d12 + d11 * (1.0F + d);
          d15 = d17 * Math.cos(d9);
          d16 = d17 * Math.sin(d9);
          localObject = new double[] { d15 };
          arrayOfDouble = new double[] { d16 };
          a((double[])localObject, arrayOfDouble, d8, localzt);
          d15 = localObject[0];
          d16 = arrayOfDouble[0];
          m = 1;
          break;
        case 2: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        default: 
          d17 = d12 + d11 * (1.0F - d);
          d15 = d17 * Math.cos(d9);
          d16 = d17 * Math.sin(d9);
          localObject = new double[] { d15 };
          arrayOfDouble = new double[] { d16 };
          b((double[])localObject, arrayOfDouble, d8, localzt);
          d15 = localObject[0];
          d16 = arrayOfDouble[0];
          localObject = new zq((float)d15, (float)d16, localzt.b(), localzt.c());
          boolean bool = a(paramzr, (float)d6, (float)d4, (float)d5, (float)d11, (float)d12, (zq)localObject, localzqy);
          if (bool)
          {
            m = 1;
          }
          else
          {
            zo localzo = a(paramzr, (float)d6, (float)d4, (float)d5, (float)d11, (float)d12, localzt, localzqy);
            if (localzo.b())
            {
              m = 0;
              n = 4;
            }
            else
            {
              d15 = localzo.d();
              d16 = localzo.e();
              m = 1;
            }
          }
          break;
        }
      }
      d15 = d2 + d15;
      d16 = d3 - d16;
      if (localzqy.j() == 9)
      {
        localzqy.a().b = new zp(zbxz.a(d15), zbxz.a(d16), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
        localObject = new zp(localzqy.a().b.c(), localzqy.a().b.d(), localzqy.a().b.e(), localzqy.a().b.f());
        zp[] arrayOfzp = { localObject };
        paramzjf.a(arrayOfzp);
        localObject = arrayOfzp[0];
        localzqy.a().b.a(((zp)localObject).c());
        localzqy.a().b.b(((zp)localObject).d());
        localzqy.a().b.c(((zp)localObject).e());
        localzqy.a().b.d(((zp)localObject).f());
        localzqy.a().z();
        d15 = localzqy.a().a.c();
        d16 = localzqy.a().a.d();
      }
      Object localObject = new zq((float)d15, (float)d16, localzt.b(), localzt.c());
      d6 += d5;
      d4 -= d5;
      localzqy.a = ((zq)localObject);
      localzqy.b = ((zq)localObject);
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
  
  private static boolean a(zr paramzr, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, zq paramzq, zqy paramzqy)
    throws Exception
  {
    zjf localzjf = paramzqy.a().a();
    ze localze1 = new ze();
    zq localzq1 = new zq(-localzjf.a() / 2, -localzjf.b() / 2, localzjf.a() * 3 / 2, localzjf.b() * 3 / 2);
    localze1.b(localzq1);
    ze localze2 = new ze();
    double d1 = (paramFloat2 - paramFloat3 / 2.0F) * 3.141592653589793D / 180.0D % 6.283185307179586D;
    double d2 = paramFloat5 * Math.cos(d1);
    double d3 = paramFloat5 * Math.sin(d1);
    zq localzq2 = new zq((float)d2 - paramFloat4, (float)d3 + paramFloat4, 2.0F * paramFloat4, 2.0F * paramFloat4);
    localze2.b(localzq2.f(), -localzq2.g(), localzq2.h(), localzq2.i(), paramFloat1, paramFloat3);
    com.aspose.cells.b.a.b.zr localzr = new com.aspose.cells.b.a.b.zr(localze1);
    localzr.b(localze2);
    if ((paramzqy.a().d().c() == 0) || (paramzqy.a().d().a().isEmpty())) {
      paramzq.a(-a - 1, -a - 1);
    }
    localzr.a(new zq(paramzq.f(), -paramzq.g(), paramzq.h(), paramzq.i()));
    if (paramzr.a().b(localzr))
    {
      localzr.c();
      localzr = null;
      return true;
    }
    localzr.c();
    localzr = null;
    return false;
  }
  
  private static zo a(zr paramzr, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, zt paramzt, zqy paramzqy)
    throws Exception
  {
    float f1 = paramFloat2 - paramFloat3 / 2.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = -0.5F;
    int i = 0;
    float f5;
    zq localzq;
    if (((f1 > -90.0F) && (f1 < 0.0F)) || ((f1 >= -270.0F) && (f1 < -180.0F)))
    {
      i = 0;
      f5 = f1;
      while (f5 > paramFloat2 - paramFloat3)
      {
        f5 += f4;
        localzq = a(paramFloat4, f5, paramzt, paramFloat2, paramFloat3, paramFloat5);
        f2 += f4;
        if (a(paramzr, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, localzq, paramzqy))
        {
          f3 += f4;
          if (i == 0) {
            i = 1;
          }
        }
        else if (i != 0)
        {
          localzq = a(paramFloat4, f1 + f2 - f3 / 2.0F, paramzt, paramFloat2, paramFloat3, paramFloat5);
          return localzq.d();
        }
      }
      if (i != 0)
      {
        localzq = a(paramFloat4, f1 + f2 - f3 / 2.0F, paramzt, paramFloat2, paramFloat3, paramFloat5);
        return localzq.d();
      }
      i = 0;
      f5 = f1;
      f2 = 0.0F;
      f3 = 0.0F;
      while (f5 < paramFloat2)
      {
        f5 -= f4;
        localzq = a(paramFloat4, f5, paramzt, paramFloat2, paramFloat3, paramFloat5);
        f2 -= f4;
        if (a(paramzr, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, localzq, paramzqy))
        {
          f3 -= f4;
          if (i == 0) {
            i = 1;
          }
        }
        else if (i != 0)
        {
          localzq = a(paramFloat4, f1 + f2 - f3 / 2.0F, paramzt, paramFloat2, paramFloat3, paramFloat5);
          return localzq.d();
        }
      }
      if (i != 0)
      {
        localzq = a(paramFloat4, f1 + f2 - f3 / 2.0F, paramzt, paramFloat2, paramFloat3, paramFloat5);
        return localzq.d();
      }
    }
    else
    {
      i = 0;
      f5 = f1;
      while (f5 < paramFloat2)
      {
        f5 -= f4;
        localzq = a(paramFloat4, f5, paramzt, paramFloat2, paramFloat3, paramFloat5);
        f2 -= f4;
        if (a(paramzr, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, localzq, paramzqy))
        {
          f3 -= f4;
          if (i == 0) {
            i = 1;
          }
        }
        else if (i != 0)
        {
          localzq = a(paramFloat4, f1 + f2 - f3 / 2.0F, paramzt, paramFloat2, paramFloat3, paramFloat5);
          return localzq.d();
        }
      }
      if (i != 0)
      {
        localzq = a(paramFloat4, f1 + f2 - f3 / 2.0F, paramzt, paramFloat2, paramFloat3, paramFloat5);
        return localzq.d();
      }
      i = 0;
      f5 = f1;
      f2 = 0.0F;
      f3 = 0.0F;
      while (f5 > paramFloat2 - paramFloat3)
      {
        f5 += f4;
        localzq = a(paramFloat4, f5, paramzt, paramFloat2, paramFloat3, paramFloat5);
        f2 += f4;
        if (a(paramzr, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, localzq, paramzqy))
        {
          f3 += f4;
          if (i == 0) {
            i = 1;
          }
        }
        else if (i != 0)
        {
          localzq = a(paramFloat4, f1 + f2 - f3 / 2.0F, paramzt, paramFloat2, paramFloat3, paramFloat5);
          return localzq.d();
        }
      }
      if (i != 0)
      {
        localzq = a(paramFloat4, f1 + f2 - f3 / 2.0F, paramzt, paramFloat2, paramFloat3, paramFloat5);
        return localzq.d();
      }
    }
    return zo.a();
  }
  
  private static zq a(double paramDouble1, double paramDouble2, zt paramzt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramDouble2 %= 360.0D;
    double d1 = paramDouble2 * 3.141592653589793D / 180.0D;
    paramDouble1 -= paramDouble1 * d;
    double d2 = paramDouble1 * Math.cos(d1);
    double d3 = paramDouble1 * Math.sin(d1);
    if (((paramDouble2 < 90.0D) && (paramDouble2 > -90.0D)) || (paramDouble2 < -270.0D)) {
      d2 -= paramzt.b();
    }
    if ((paramDouble2 > -180.0D) && (paramDouble2 < 0.0D)) {
      d3 += paramzt.c();
    }
    d1 = (paramFloat1 - paramFloat2 / 2.0F) * 3.141592653589793D / 180.0D % 6.283185307179586D;
    double d4 = paramFloat3 * Math.cos(d1);
    double d5 = paramFloat3 * Math.sin(d1);
    d2 += d4;
    d3 += d5;
    return new zq((float)d2, (float)d3, paramzt.b(), paramzt.c());
  }
  
  static void a(zbfd paramzbfd, double paramDouble)
  {
    zkh localzkh = paramzbfd.F();
    double d1 = paramDouble * b;
    double d2 = d1;
    ArrayList localArrayList = new ArrayList();
    if (paramzbfd.S()) {
      for (int i = 0; i < localzkh.getCount(); i++) {
        if (localzkh.a(i).p().j() == 9)
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(i));
          zkf localzkf = localzkh.b(i);
          zqy localzqy = localzkf.o();
          localzqy.h = true;
          if (localzqy.e.b()) {
            if (!localzqy.H())
            {
              localzqy.f = new zo(localzqy.a.f(), localzqy.a.g() + localzqy.a.i() / 2.0F);
              localzqy.e = new zo(localzqy.a.f() - (float)d1, localzqy.f.e());
            }
            else
            {
              localzqy.f = new zo(localzqy.a.l(), localzqy.a.k() + localzqy.a.i() / 2.0F);
              localzqy.e = new zo(localzqy.a.l() + (float)d1, localzqy.f.e());
            }
          }
        }
      }
    }
  }
  
  static void a(zbfd paramzbfd, double paramDouble, ArrayList paramArrayList)
  {
    double d1 = paramDouble * b;
    double d2 = d1;
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      ArrayList localArrayList = (ArrayList)paramArrayList.get(i);
      for (int j = 0; j < localArrayList.size(); j++)
      {
        zkf localzkf = paramzbfd.F().b(((Integer)localArrayList.get(j)).intValue());
        zqy localzqy = localzkf.o();
        localzqy.h = true;
        if (localzqy.e.b())
        {
          if (!localzqy.H()) {
            localzqy.a.a((float)(localzqy.d.d() + d1 + d2 * Math.abs(Math.cos(localzqy.g))));
          } else {
            localzqy.a.a((float)(localzqy.d.d() - localzqy.a.h() - d1 - d2 * Math.abs(Math.cos(localzqy.g))));
          }
          if (localzqy.I()) {
            localzqy.a.b((float)(localzqy.d.e() + d2 * Math.abs(Math.sin(localzqy.g)) - localzqy.a.i() / 2.0F));
          } else {
            localzqy.a.b((float)(localzqy.d.e() - d2 * Math.abs(Math.sin(localzqy.g)) - localzqy.a.i() / 2.0F));
          }
          if (!localzqy.H())
          {
            localzqy.f = new zo(localzqy.a.f(), localzqy.a.g() + localzqy.a.i() / 2.0F);
            localzqy.e = new zo(localzqy.a.f() - (float)d1, localzqy.f.e());
          }
          else
          {
            localzqy.f = new zo(localzqy.a.l(), localzqy.a.k() + localzqy.a.i() / 2.0F);
            localzqy.e = new zo(localzqy.a.l() + (float)d1, localzqy.f.e());
          }
        }
      }
    }
  }
  
  static void a(zbfd paramzbfd, double paramDouble, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    double d1 = paramDouble * b;
    double d2 = d1;
    for (int i = 0; i < paramArrayList1.size(); i++)
    {
      ArrayList localArrayList = (ArrayList)paramArrayList1.get(i);
      for (int j = 0; j < localArrayList.size(); j++)
      {
        for (int k = 0; (k < paramArrayList2.size()) && ((Integer)localArrayList.get(j) != (Integer)paramArrayList2.get(k)); k++) {}
        if (k == paramArrayList2.size())
        {
          zkf localzkf = paramzbfd.F().b(((Integer)localArrayList.get(j)).intValue());
          zqy localzqy = localzkf.o();
          if (!localzqy.H())
          {
            localzqy.f = new zo(localzqy.a.f(), localzqy.a.g() + localzqy.a.i() / 2.0F);
            localzqy.e = new zo(localzqy.a.f() - (float)d1, localzqy.f.e());
          }
          else
          {
            localzqy.f = new zo(localzqy.a.l(), localzqy.a.k() + localzqy.a.i() / 2.0F);
            localzqy.e = new zo(localzqy.a.l() + (float)d1, localzqy.f.e());
          }
        }
      }
    }
  }
  
  static void a(zbfd paramzbfd, ArrayList paramArrayList1, zp paramzp1, zp paramzp2, ArrayList paramArrayList2)
  {
    Object localObject;
    for (int i = 0; i < paramArrayList1.size(); i++)
    {
      localObject = (ArrayList)paramArrayList1.get(i);
      b(paramzbfd, (ArrayList)localObject, paramzp1, paramzp2, paramArrayList2);
    }
    for (i = 0; i < paramArrayList2.size(); i++)
    {
      localObject = paramzbfd.F().b(((Integer)paramArrayList2.get(i)).intValue()).o();
      ((zqy)localObject).a = ((zqy)localObject).b;
      ((zqy)localObject).f = zo.a();
      ((zqy)localObject).e = zo.a();
    }
  }
  
  private static void b(zbfd paramzbfd, ArrayList paramArrayList1, zp paramzp1, zp paramzp2, ArrayList paramArrayList2)
  {
    zjf localzjf = paramzbfd.v();
    zp localzp = localzjf.j;
    if (paramArrayList1.size() <= 1) {
      return;
    }
    float f1 = c;
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
          localObject = paramzbfd.F().b(m).o();
          if (((zqy)localObject).a.h() != 0.0F) {
            if (((zqy)localObject).a.i() != 0.0F) {
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
    zqy localzqy1 = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
    int n;
    zqy localzqy2;
    float f6;
    zqy localzqy3;
    float f10;
    int i2;
    float f8;
    switch (localzqy1.J())
    {
    case 1: 
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if (((zqy)localObject).a.g() > localzp.d()) {
        if (((zqy)localObject).a.g() - ((zqy)localObject).a.i() / 2.0F > localzp.d()) {
          ((zqy)localObject).a.b(((zqy)localObject).a.g() - ((zqy)localObject).a.i() / 2.0F);
        } else {
          ((zqy)localObject).a.b(localzp.d());
        }
      }
      if (((zqy)localObject).a.l() < localzp.i()) {
        if (((zqy)localObject).a.l() + ((zqy)localObject).a.h() / 2.0F < localzp.i()) {
          ((zqy)localObject).a.a(((zqy)localObject).a.f() + ((zqy)localObject).a.h() / 2.0F);
        } else {
          ((zqy)localObject).a.a(localzp.i() - ((zqy)localObject).a.h());
        }
      }
      for (n = k - 1; n >= 0; n--)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqy)localObject).a.f() - localzqy2.a.l());
        localzqy2.a.a(localzqy2.a.f() - (f6 + f1));
        localObject = localzqy2;
        if (((zqy)localObject).a.g() > localzp.d()) {
          if (((zqy)localObject).a.g() - ((zqy)localObject).a.i() > localzp.d()) {
            ((zqy)localObject).a.b(((zqy)localObject).a.g() - ((zqy)localObject).a.i());
          } else {
            ((zqy)localObject).a.b(localzp.d());
          }
        }
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = k + 1; n < localArrayList2.size(); n++)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqy)localObject).a.m() - localzqy2.a.g());
        localzqy2.a.b(localzqy2.a.g() + (f6 + f1));
        localObject = localzqy2;
        if (((zqy)localObject).a.l() < localzp.i()) {
          if (((zqy)localObject).a.l() + ((zqy)localObject).a.h() / 2.0F < localzp.i()) {
            ((zqy)localObject).a.a(((zqy)localObject).a.f() + ((zqy)localObject).a.h() / 2.0F);
          } else {
            ((zqy)localObject).a.a(localzp.i() - ((zqy)localObject).a.h());
          }
        }
      }
      break;
    case 2: 
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = 0; n < localArrayList2.size(); n++)
      {
        localObject = paramzbfd.F().b(((Integer)localArrayList2.get(n)).intValue()).o();
        if (((zqy)localObject).a.l() < localzp.i()) {
          if (((zqy)localObject).a.l() + ((zqy)localObject).a.h() / 2.0F < localzp.i()) {
            ((zqy)localObject).a.a(((zqy)localObject).a.f() + ((zqy)localObject).a.h() / 2.0F);
          } else {
            ((zqy)localObject).a.a(localzp.i() - ((zqy)localObject).a.h());
          }
        }
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = k - 1; n >= 0; n--)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqy)localObject).a.g() - localzqy2.a.m());
        localzqy2.a.b(localzqy2.a.g() - (f6 + f1));
        localObject = localzqy2;
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = k + 1; n < localArrayList2.size(); n++)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqy)localObject).a.m() - localzqy2.a.g());
        localzqy2.a.b(localzqy2.a.g() + (f6 + f1));
        localObject = localzqy2;
      }
      break;
    case 3: 
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if (((zqy)localObject).a.m() < localzp.j()) {
        if (((zqy)localObject).a.m() + ((zqy)localObject).a.i() / 2.0F < localzp.j()) {
          ((zqy)localObject).a.b(((zqy)localObject).a.g() + ((zqy)localObject).a.i() / 2.0F);
        } else {
          ((zqy)localObject).a.b(localzp.j() - ((zqy)localObject).a.i());
        }
      }
      if (((zqy)localObject).a.l() < localzp.i()) {
        if (((zqy)localObject).a.l() + ((zqy)localObject).a.h() / 2.0F < localzp.i()) {
          ((zqy)localObject).a.a(((zqy)localObject).a.f() + ((zqy)localObject).a.h() / 2.0F);
        } else {
          ((zqy)localObject).a.a(localzp.i() - ((zqy)localObject).a.h());
        }
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = k - 1; n >= 0; n--)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqy)localObject).a.g() - localzqy2.a.m());
        localzqy2.a.b(localzqy2.a.g() - (f6 + f1));
        localObject = localzqy2;
        if (((zqy)localObject).a.l() < localzp.i()) {
          if (((zqy)localObject).a.l() + ((zqy)localObject).a.h() / 2.0F < localzp.i()) {
            ((zqy)localObject).a.a(((zqy)localObject).a.f() + ((zqy)localObject).a.h() / 2.0F);
          } else {
            ((zqy)localObject).a.a(localzp.i() - ((zqy)localObject).a.h());
          }
        }
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (n = k + 1; n < localArrayList2.size(); n++)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqy)localObject).a.m() - localzqy2.a.g());
        localzqy2.a.b(localzqy2.a.g() + (f6 + f1));
        localObject = localzqy2;
      }
      break;
    case 4: 
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if ((((zqy)localObject).g > -1.5707963267948966D) && (localArrayList2.size() > 2)) {
        ((zqy)localObject).a.a(((zqy)localObject).a.f() - ((zqy)localObject).a.h() / 2.0F);
      }
      if (((zqy)localObject).a.m() < localzp.j()) {
        if (((zqy)localObject).a.m() + ((zqy)localObject).a.i() < localzp.j()) {
          ((zqy)localObject).a.b(((zqy)localObject).a.g() + ((zqy)localObject).a.i());
        } else {
          ((zqy)localObject).a.b(localzp.j() - ((zqy)localObject).a.i());
        }
      }
      for (n = k - 1; n >= 0; n--)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(n)).intValue()).o();
        f6 = Math.abs(((zqy)localObject).a.l() - localzqy2.a.f());
        localzqy2.a.a(localzqy2.a.f() + (f6 + f1));
        localObject = localzqy2;
      }
      if (k >= 2)
      {
        localObject = paramzbfd.F().b(((Integer)localArrayList2.get(localArrayList2.size() - 1)).intValue()).o();
        float f2 = 0.0F;
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(k - 1)).intValue()).o();
        f2 = localzp.j() - localzqy2.a.m();
        f2 /= (k - 1);
        localObject = paramzbfd.F().b(((Integer)localArrayList2.get(0)).intValue()).o();
        for (int i5 = 1; i5 < k; i5++)
        {
          localzqy3 = paramzbfd.F().b(((Integer)localArrayList2.get(i5)).intValue()).o();
          f10 = Math.abs(((zqy)localObject).a.m() - localzqy3.a.g());
          if (f10 < f2) {
            localzqy3.a.b(localzqy3.a.g() + (f10 + f1));
          } else if (f2 > 0.0F) {
            localzqy3.a.b(localzqy3.a.g() + f2);
          }
          localObject = localzqy3;
        }
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (int i1 = k + 1; i1 < localArrayList2.size(); i1++)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(i1)).intValue()).o();
        float f7 = Math.abs(((zqy)localObject).a.f() - localzqy2.a.l());
        localzqy2.a.a(localzqy2.a.f() - (f7 + f1));
        localObject = localzqy2;
      }
      if (localArrayList2.size() - (k + 1) >= 2)
      {
        localObject = paramzbfd.F().b(((Integer)localArrayList2.get(localArrayList2.size() - 1)).intValue()).o();
        float f3 = 0.0F;
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(k + 1)).intValue()).o();
        f3 = localzp.j() - localzqy2.a.m();
        f3 /= (k - 1);
        for (int i6 = localArrayList2.size() - 2; i6 > k; i6--)
        {
          localzqy3 = paramzbfd.F().b(((Integer)localArrayList2.get(i6)).intValue()).o();
          f10 = Math.abs(((zqy)localObject).a.m() - localzqy3.a.g());
          if (f10 < f3) {
            localzqy3.a.b(localzqy3.a.g() + (f10 + f1));
          } else if (f3 > 0.0F) {
            localzqy3.a.b(localzqy3.a.g() + f3);
          }
          localObject = localzqy3;
        }
      }
      break;
    case 5: 
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if (((zqy)localObject).a.m() < localzp.j()) {
        if (((zqy)localObject).a.m() + ((zqy)localObject).a.i() / 2.0F < localzp.j()) {
          ((zqy)localObject).a.b(((zqy)localObject).a.g() + ((zqy)localObject).a.i() / 2.0F);
        } else {
          ((zqy)localObject).a.b(localzp.j() - ((zqy)localObject).a.i());
        }
      }
      if (((zqy)localObject).a.f() > localzp.c()) {
        if (((zqy)localObject).a.f() + ((zqy)localObject).a.h() / 2.0F > localzp.c()) {
          ((zqy)localObject).a.a(((zqy)localObject).a.f() - ((zqy)localObject).a.h() / 2.0F);
        } else {
          ((zqy)localObject).a.a(localzp.c() + ((zqy)localObject).a.h());
        }
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = k - 1; i2 >= 0; i2--)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqy)localObject).a.l() - localzqy2.a.f());
        localzqy2.a.a(localzqy2.a.f() + (f8 + f1));
        localObject = localzqy2;
        if (((zqy)localObject).a.m() < localzp.j()) {
          if (((zqy)localObject).a.m() + ((zqy)localObject).a.i() < localzp.j()) {
            ((zqy)localObject).a.b(((zqy)localObject).a.g() + ((zqy)localObject).a.i());
          } else {
            ((zqy)localObject).a.b(localzp.j() - ((zqy)localObject).a.i());
          }
        }
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = k + 1; i2 < localArrayList2.size(); i2++)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqy)localObject).a.g() - localzqy2.a.m());
        localzqy2.a.b(localzqy2.a.g() - (f8 + f1));
        localObject = localzqy2;
        if (((zqy)localObject).a.f() > localzp.c()) {
          if (((zqy)localObject).a.f() + ((zqy)localObject).a.h() > localzp.c()) {
            ((zqy)localObject).a.a(((zqy)localObject).a.f() - ((zqy)localObject).a.h());
          } else {
            ((zqy)localObject).a.a(localzp.c() + ((zqy)localObject).a.h());
          }
        }
      }
      break;
    case 6: 
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = 0; i2 < localArrayList2.size(); i2++)
      {
        localObject = paramzbfd.F().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        if (((zqy)localObject).a.f() > localzp.c()) {
          if (((zqy)localObject).a.f() + ((zqy)localObject).a.h() / 2.0F > localzp.c()) {
            ((zqy)localObject).a.a(((zqy)localObject).a.f() - ((zqy)localObject).a.h() / 2.0F);
          } else {
            ((zqy)localObject).a.a(localzp.c() + ((zqy)localObject).a.h());
          }
        }
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = k + 1; i2 < localArrayList2.size(); i2++)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqy)localObject).a.g() - localzqy2.a.m());
        localzqy2.a.b(localzqy2.a.g() - (f8 + f1));
        localObject = localzqy2;
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = k - 1; i2 >= 0; i2--)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqy)localObject).a.m() - localzqy2.a.g());
        localzqy2.a.b(localzqy2.a.g() + (f8 + f1));
        localObject = localzqy2;
      }
      break;
    case 7: 
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if (((zqy)localObject).a.g() > localzp.d()) {
        if (((zqy)localObject).a.g() - ((zqy)localObject).a.i() / 2.0F > localzp.d()) {
          ((zqy)localObject).a.b(((zqy)localObject).a.g() - ((zqy)localObject).a.i() / 2.0F);
        } else {
          ((zqy)localObject).a.b(localzp.d());
        }
      }
      if (((zqy)localObject).a.f() > localzp.c()) {
        if (((zqy)localObject).a.f() + ((zqy)localObject).a.h() / 2.0F > localzp.c()) {
          ((zqy)localObject).a.a(((zqy)localObject).a.f() - ((zqy)localObject).a.h() / 2.0F);
        } else {
          ((zqy)localObject).a.a(localzp.c() + ((zqy)localObject).a.h());
        }
      }
      for (i2 = k - 1; i2 >= 0; i2--)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqy)localObject).a.m() - localzqy2.a.g());
        localzqy2.a.b(localzqy2.a.g() + (f8 + f1));
        localObject = localzqy2;
        if (((zqy)localObject).a.f() > localzp.c()) {
          if (((zqy)localObject).a.f() + ((zqy)localObject).a.h() > localzp.c()) {
            ((zqy)localObject).a.a(((zqy)localObject).a.f() - ((zqy)localObject).a.h());
          } else {
            ((zqy)localObject).a.a(localzp.c() + ((zqy)localObject).a.h());
          }
        }
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (i2 = k + 1; i2 < localArrayList2.size(); i2++)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqy)localObject).a.l() - localzqy2.a.f());
        localzqy2.a.a(localzqy2.a.f() + (f8 + f1));
        localObject = localzqy2;
        if (((zqy)localObject).a.g() > localzp.d()) {
          if (((zqy)localObject).a.g() - ((zqy)localObject).a.i() > localzp.d()) {
            ((zqy)localObject).a.b(((zqy)localObject).a.g() - ((zqy)localObject).a.i());
          } else {
            ((zqy)localObject).a.b(localzp.d());
          }
        }
      }
      break;
    case 8: 
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      if ((((zqy)localObject).g < 0.0D) && (((zqy)localObject).g > -4.71238898038469D) && (localArrayList2.size() > 2)) {
        ((zqy)localObject).a.a(((zqy)localObject).a.f() + ((zqy)localObject).a.h() / 2.0F);
      }
      if (((zqy)localObject).a.g() > localzp.d()) {
        if (((zqy)localObject).a.g() - ((zqy)localObject).a.i() > localzp.d()) {
          ((zqy)localObject).a.b(((zqy)localObject).a.g() - ((zqy)localObject).a.i());
        } else {
          ((zqy)localObject).a.b(localzp.d());
        }
      }
      for (i2 = k - 1; i2 >= 0; i2--)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(i2)).intValue()).o();
        f8 = Math.abs(((zqy)localObject).a.f() - localzqy2.a.l());
        localzqy2.a.a(localzqy2.a.f() - (f8 + f1));
        localObject = localzqy2;
      }
      if (k >= 2)
      {
        localObject = paramzbfd.F().b(((Integer)localArrayList2.get(localArrayList2.size() - 1)).intValue()).o();
        float f4 = 0.0F;
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(k - 1)).intValue()).o();
        f4 = localzqy2.a.g() - localzp.d();
        f4 /= (k - 1);
        localObject = paramzbfd.F().b(((Integer)localArrayList2.get(0)).intValue()).o();
        for (int i7 = 1; i7 < k; i7++)
        {
          localzqy3 = paramzbfd.F().b(((Integer)localArrayList2.get(i7)).intValue()).o();
          f10 = Math.abs(((zqy)localObject).a.g() - localzqy3.a.m());
          if (f10 < f4) {
            localzqy3.a.b(localzqy3.a.g() - (f10 + f1));
          } else if (f4 > 0.0F) {
            localzqy3.a.b(localzqy3.a.g() - f4);
          }
          localObject = localzqy3;
        }
      }
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(k)).intValue()).o();
      for (int i3 = k + 1; i3 < localArrayList2.size(); i3++)
      {
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(i3)).intValue()).o();
        float f9 = Math.abs(((zqy)localObject).a.l() - localzqy2.a.f());
        localzqy2.a.a(localzqy2.a.f() + (f9 + f1));
        localObject = localzqy2;
      }
      if (localArrayList2.size() - (k + 1) >= 2)
      {
        localObject = paramzbfd.F().b(((Integer)localArrayList2.get(localArrayList2.size() - 1)).intValue()).o();
        float f5 = 0.0F;
        localzqy2 = paramzbfd.F().b(((Integer)localArrayList2.get(k + 1)).intValue()).o();
        f5 = localzqy2.a.g() - localzp.d();
        f5 /= (k - 1);
        for (int i8 = localArrayList2.size() - 2; i8 > k; i8--)
        {
          localzqy3 = paramzbfd.F().b(((Integer)localArrayList2.get(i8)).intValue()).o();
          f10 = Math.abs(((zqy)localObject).a.g() - localzqy3.a.m());
          if (f10 < f5) {
            localzqy3.a.b(localzqy3.a.g() - (f10 + f1));
          } else if (f5 > 0.0F) {
            localzqy3.a.b(localzqy3.a.g() - f5);
          }
          localObject = localzqy3;
        }
      }
      break;
    }
    for (int i4 = 0; i4 < localArrayList2.size(); i4++)
    {
      localObject = paramzbfd.F().b(((Integer)localArrayList2.get(i4)).intValue()).o();
      if (((zqy)localObject).a.f() < localzp.c()) {
        ((zqy)localObject).a.a(localzp.c());
      }
      if (((zqy)localObject).a.g() < localzp.d()) {
        ((zqy)localObject).a.b(localzp.d());
      }
      if (((zqy)localObject).a.l() > localzp.e()) {
        ((zqy)localObject).a.a(localzp.e() - ((zqy)localObject).a.h());
      }
      if (((zqy)localObject).a.m() > localzp.f()) {
        ((zqy)localObject).a.b(localzp.f() - ((zqy)localObject).a.i());
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
  
  static ArrayList a(zbfd paramzbfd, zp paramzp)
  {
    return a(paramzbfd, zbxz.b(paramzp));
  }
  
  static ArrayList a(zbfd paramzbfd, zq paramzq)
  {
    float f = c;
    zkh localzkh = paramzbfd.F();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject;
    for (int i = 0; i < localzkh.getCount(); i++)
    {
      localObject = localzkh.b(i).o();
      if ((((zqy)localObject).j() == 0) && (((zqy)localObject).a.h() != 0.0F) && (((zqy)localObject).a.i() != 0.0F))
      {
        ArrayList localArrayList2 = new ArrayList();
        int k = 0;
        for (int m = 0; m < localzkh.getCount(); m++)
        {
          zqy localzqy = localzkh.b(m).o();
          if ((localzqy.j() == 0) && (localzqy.a.h() != 0.0F) && (localzqy.a.i() != 0.0F) && (i != m))
          {
            if (((zqy)localObject).a().d().h()) {
              f = c;
            } else {
              f = -4.0F;
            }
            if (a(((zqy)localObject).a, localzqy.a, f))
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
  
  private static double a(double paramDouble1, double paramDouble2)
  {
    if (paramDouble2 == 0.0D) {
      return 0.0D;
    }
    return Math.abs(paramDouble1) / paramDouble2 * 360.0D;
  }
  
  static zq a(zq paramzq, double paramDouble1, double paramDouble2)
  {
    ze localze = new ze();
    localze.b(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), (float)paramDouble1, (float)paramDouble2);
    localze.a(new com.aspose.cells.a.d.zs(Color.getBlack(), 1.0F).r());
    return zn.a(localze);
  }
  
  static boolean a(zkf paramzkf)
  {
    if (paramzkf == null) {
      return true;
    }
    if (paramzkf.z()) {
      return true;
    }
    return (paramzkf.x() == 3) && (paramzkf.a());
  }
  
  static zt a(zr paramzr, zbff paramzbff, int paramInt1, int paramInt2, double paramDouble1, float paramFloat1, float paramFloat2, double paramDouble2)
    throws Exception
  {
    zbfd localzbfd = paramzbff.c(paramInt1);
    zjf localzjf = localzbfd.v();
    zkf localzkf = localzbfd.F().b(paramInt2);
    if (localzkf == null) {
      localzkf = localzbfd.u();
    } else if (a(localzkf)) {
      return new zt(0.0F, 0.0F);
    }
    int i = localzbfd.ah();
    zbt localzbt;
    ArrayList localArrayList;
    if (i == 1)
    {
      localzbt = localzjf.e();
      localArrayList = localzjf.z().c();
    }
    else
    {
      localzbt = localzjf.g();
      localArrayList = localzjf.z().d();
    }
    zqy localzqy = localzkf.o();
    String str1 = localzbfd.i();
    boolean bool1 = localzqy.x();
    if (localzqy.f()) {
      bool1 = true;
    }
    String str2 = localzqy.f() ? "" : localzqy.p();
    String str3;
    if (bool1)
    {
      str2 = (paramInt2 >= 0) && (paramInt2 < localArrayList.size()) ? ((zgn)localArrayList.get(paramInt2)).c() : "";
      bool2 = (paramInt2 >= 0) && (paramInt2 < localArrayList.size()) ? ((zgn)localArrayList.get(paramInt2)).b() : false;
      str3 = (paramInt2 < 0) || (paramInt2 >= localzbt.l.size()) ? localzjf.aa() : zra.a(localzjf.an(), localzbt.l.get(paramInt2), str2, bool2, localzjf.U());
    }
    else
    {
      str3 = paramInt2 == -1 ? localzjf.aa() : zra.a(localzjf.an(), localzbt.l.get(paramInt2), str2, localzqy.d(), localzjf.U());
    }
    boolean bool2 = localzqy.x();
    if (localzqy.f()) {
      bool2 = true;
    }
    String str4 = localzqy.f() ? "" : localzqy.p();
    String str5;
    if (bool2) {
      str5 = paramInt2 == -1 ? zra.a(localzjf.an(), Double.valueOf(paramDouble2), str4, localzqy.y(), localzjf.U()) : zra.a(localzjf.an(), Double.valueOf(localzkf.w()), localzkf.A(), localzkf.B(), localzjf.U());
    } else {
      str5 = paramInt2 == -1 ? zra.a(localzjf.an(), Double.valueOf(paramDouble2), str4, localzqy.y(), localzjf.U()) : zra.a(localzjf.an(), Double.valueOf(localzkf.w()), str4, localzqy.y(), localzjf.U());
    }
    String str6;
    if (localzqy.x())
    {
      str6 = zra.a(localzjf.an(), Double.valueOf(paramDouble1), "0%", false, localzjf.U());
    }
    else
    {
      str7 = "".equals(localzqy.p()) ? "0%" : localzqy.p();
      str6 = zra.a(localzjf.an(), Double.valueOf(paramDouble1), str7, localzqy.y(), localzjf.U());
    }
    String str7 = localzqy.m();
    zg localzg = localzqy.a().h();
    int j = localzqy.n();
    int k = localzqy.o();
    int m = localzqy.q();
    zt localzt = new zt(localzqy.D(), localzqy.F());
    if (!localzqy.G()) {
      paramFloat1 = 10000.0F;
    }
    String str8 = "";
    com.aspose.cells.b.a.b.zs localzs = com.aspose.cells.b.a.b.zs.a();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (localzqy.s() == null)
    {
      if (localzqy.h()) {
        str8 = str8 + str1;
      }
      if (localzqy.d())
      {
        if (!"".equals(str8)) {
          str8 = str8 + str7;
        }
        str8 = str8 + str3;
      }
      if (localzqy.g())
      {
        if (!"".equals(str8)) {
          str8 = str8 + str7;
        }
        str8 = str8 + str5;
      }
      if (localzqy.f())
      {
        if (!"".equals(str8)) {
          str8 = str8 + str7;
        }
        str8 = str8 + str6;
      }
      localzqy.u().clear();
      localzqy.u().a(str8, localzqy.a().h(), localzqy.a().j(), localzqy.a().k(), 2);
      localObject1 = new zbcw();
      ((zbcw)localObject1).a(1);
      ((zbcw)localObject1).b(1);
      zq localzq1 = new zq(0.0F, 0.0F, paramFloat1, localzjf.al().f() * 0.5F);
      localObject2 = new zbde(localzq1, (zbcw)localObject1, localzqy.u(), localzqy.a().h(), zbxz.b(str8));
      localObject3 = ((zbde)localObject2).a(localzqy.a().a().ap(), localzjf.at());
      localzs = new com.aspose.cells.b.a.b.zs((int)(((zq)localObject3).h() + 0.5D), (int)(((zq)localObject3).i() + 0.5D));
      localzqy.u().clear();
    }
    else if (localzqy.B())
    {
      localObject1 = "";
      for (int n = 0; n < localzqy.u().getCount(); n++)
      {
        localObject2 = localzqy.u().a(n);
        if (((zaiy)localObject2).a().indexOf("[SERIES NAME]") >= 0) {
          ((zaiy)localObject2).a(zw.a(((zaiy)localObject2).a(), "[SERIES NAME]", str1));
        } else if (((zaiy)localObject2).a().indexOf("[CATEGORY NAME]") >= 0) {
          ((zaiy)localObject2).a(zw.a(((zaiy)localObject2).a(), "[CATEGORY NAME]", str3));
        } else if (((zaiy)localObject2).a().indexOf("[VALUE]") >= 0) {
          ((zaiy)localObject2).a(zw.a(((zaiy)localObject2).a(), "[VALUE]", str5));
        } else if (((zaiy)localObject2).a().indexOf("[PERCENTAGE]") >= 0) {
          ((zaiy)localObject2).a(zw.a(((zaiy)localObject2).a(), "[PERCENTAGE]", str6));
        }
        localObject1 = (String)localObject1 + ((zaiy)localObject2).a();
      }
      zbcw localzbcw = new zbcw();
      localzbcw.a(1);
      localzbcw.b(1);
      localObject2 = new zq(0.0F, 0.0F, paramFloat1, localzjf.al().f() * 0.5F);
      localObject3 = new zbde((zq)localObject2, localzbcw, localzqy.u(), localzqy.a().h(), zbxz.b((String)localObject1));
      zq localzq2 = ((zbde)localObject3).a(localzqy.a().a().ap(), localzjf.at());
      localzs = new com.aspose.cells.b.a.b.zs((int)(localzq2.h() + 0.5D), (int)(localzq2.i() + 0.5D));
    }
    else
    {
      str8 = localzqy.s();
      if ("".equals(str8)) {
        return new zt(0.0F, 0.0F);
      }
      localObject1 = new zt(paramFloat1, localzjf.al().f() * 0.5F);
      localzs = zbvy.a(paramzr, str8, 0, localzg, (zt)localObject1, k, m);
    }
    if (localzqy.e())
    {
      localObject1 = new zt(localzs.b() + localzt.b(), localzs.c());
      ((zt)localObject1).a(((zt)localObject1).b() + 2 * a);
    }
    else
    {
      localObject1 = new zt(localzs.b(), localzs.c());
    }
    ((zt)localObject1).a(((zt)localObject1).b() + 2 * a);
    ((zt)localObject1).b(((zt)localObject1).c() + 2 * a);
    return (zt)localObject1;
  }
  
  static void a(zr paramzr, zjf paramzjf, int paramInt1, int paramInt2, double paramDouble1, zq paramzq, double paramDouble2)
    throws Exception
  {
    zbfd localzbfd = paramzjf.z().c(paramInt1);
    zkf localzkf = localzbfd.F().b(paramInt2);
    if (localzkf == null) {
      localzkf = localzbfd.u();
    } else if (a(localzkf)) {
      return;
    }
    zqy localzqy = localzkf.o();
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    zq[] arrayOfzq = { localzq };
    paramzjf.a(arrayOfzq);
    localzq = arrayOfzq[0];
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    if ((localzqy.a().a().i().c().k()) && (localzqy.a().c().k()) && ((localzqy.j() == 4) || (localzqy.j() == 9)) && (paramzr.i() != 4)) {
      paramzr.b(4, false);
    }
    float f1 = localzq.f() + localzq.h() / 2.0F;
    float f2 = localzq.g() + localzq.i() / 2.0F;
    int i = 0;
    if (localzqy.n() != 0)
    {
      i = 1;
      paramzr.b(f1, f2);
      paramzr.a(-localzqy.n());
    }
    int j = localzbfd.ah();
    zbt localzbt;
    ArrayList localArrayList;
    if (j == 1)
    {
      localzbt = paramzjf.e();
      localArrayList = paramzjf.z().c();
    }
    else
    {
      localzbt = paramzjf.g();
      localArrayList = paramzjf.z().d();
    }
    String str1 = localzbfd.i();
    boolean bool1 = false;
    String str2 = (paramInt2 >= 0) && (paramInt2 < localArrayList.size()) ? ((zgn)localArrayList.get(paramInt2)).c() : "";
    boolean bool2 = (paramInt2 >= 0) && (paramInt2 < localArrayList.size()) ? ((zgn)localArrayList.get(paramInt2)).b() : false;
    String str3 = (paramInt2 < 0) || (paramInt2 >= localzbt.l.size()) ? paramzjf.aa() : zra.a(paramzjf.an(), localzbt.l.get(paramInt2), str2, bool2, paramzjf.U());
    if ((paramInt2 >= 0) && (paramInt2 < localzbt.l.size())) {
      bool1 = zra.a(localzbt.l.get(paramInt2), str2);
    }
    boolean bool3 = localzqy.x();
    if (localzqy.f()) {
      bool3 = true;
    }
    String str4 = localzqy.f() ? "" : localzqy.p();
    boolean bool4 = false;
    String str5;
    if (bool3)
    {
      str5 = paramInt2 == -1 ? zra.a(paramzjf.an(), Double.valueOf(paramDouble2), str4, localzqy.y(), paramzjf.U()) : zra.a(paramzjf.an(), Double.valueOf(localzkf.w()), localzkf.A(), localzkf.B(), paramzjf.U());
      if (paramInt2 != -1) {
        bool4 = zra.a(Double.valueOf(localzkf.w()), localzkf.A());
      }
    }
    else
    {
      str5 = paramInt2 == -1 ? zra.a(paramzjf.an(), Double.valueOf(paramDouble2), str4, localzqy.y(), paramzjf.U()) : zra.a(paramzjf.an(), Double.valueOf(localzkf.w()), str4, localzqy.y(), paramzjf.U());
    }
    paramDouble1 += localzqy.i;
    String str6;
    if (localzqy.x())
    {
      str6 = zra.a(paramzjf.an(), Double.valueOf(paramDouble1), "0%", false, paramzjf.U());
    }
    else
    {
      str7 = "".equals(localzqy.p()) ? "0%" : localzqy.p();
      str6 = zra.a(paramzjf.an(), Double.valueOf(paramDouble1), str7, localzqy.y(), paramzjf.U());
    }
    String str7 = localzqy.m();
    zg localzg = localzqy.a().h();
    Color localColor = localzqy.a().j();
    int k = localzqy.n();
    int m = localzqy.o();
    int n = localzqy.q();
    zt localzt = new zt(localzqy.D(), localzqy.F());
    localzqy.a().a = new zp((int)localzq.f(), (int)localzq.g(), (int)localzq.h(), (int)localzq.i());
    if ((localzqy.a().a.e() > 0) && (localzqy.a().a.f() > 0))
    {
      zp localzp = new zp(localzqy.a().a.c(), localzqy.a().a.d(), localzqy.a().a.e(), localzqy.a().a.f());
      if (localzqy.e())
      {
        localzp.a(localzp.c() + (int)(localzt.b() + 2 * a));
        localzp.c(localzp.e() - (int)(localzt.b() + 2 * a));
      }
      if (i != 0)
      {
        localzp.a(localzp.c() - (int)f1);
        localzp.b(localzp.d() - (int)f2);
      }
      localzqy.a().c().a(localzp);
      localzqy.a().d().a(localzp);
    }
    if (i != 0)
    {
      localzq.a(localzq.f() - (int)f1);
      localzq.b(localzq.g() - (int)f2);
    }
    int i1 = (int)localzq.f() + a;
    int i2 = (int)localzq.g() + a;
    int i3 = (int)localzq.h() - 2 * a;
    int i4 = (int)localzq.i() - 2 * a;
    if (localzqy.e())
    {
      localObject1 = new zq(localzq.f() + a, localzq.g() + a, localzt.b(), localzt.c());
      zanb.a(paramzr, (zq)localObject1, localzbfd, paramInt2);
      i1 += (int)(localzt.b() + 2 * a);
      i3 -= (int)(localzt.b() + 2 * a);
    }
    Object localObject1 = new zp(i1, i2, i3, i4);
    String str8 = "";
    Object localObject3;
    if (localzqy.s() == null)
    {
      if (localzqy.h()) {
        str8 = str8 + str1;
      }
      if (localzqy.d())
      {
        if (!"".equals(str8)) {
          str8 = str8 + str7;
        }
        str8 = str8 + str3;
      }
      if (localzqy.g())
      {
        if (!"".equals(str8)) {
          str8 = str8 + str7;
        }
        str8 = str8 + str5;
      }
      if (localzqy.f())
      {
        if (!"".equals(str8)) {
          str8 = str8 + str7;
        }
        str8 = str8 + str6;
      }
      boolean bool5 = zbxz.b(str8);
      localzqy.u().clear();
      localzqy.u().a(str8, localzqy.a().h(), localzqy.a().j(), localzqy.a().k(), 2);
      localObject3 = new zbcw();
      ((zbcw)localObject3).a(zbvy.a(localzqy.o()));
      ((zbcw)localObject3).b(zbvy.a(localzqy.q()));
      zbde localzbde = new zbde((zp)localObject1, (zbcw)localObject3, localzqy.u(), localzqy.a().h(), bool5);
      localzbde.b(paramzr, paramzjf.at());
      localzqy.u().clear();
    }
    else
    {
      Object localObject2;
      if (localzqy.B())
      {
        localObject2 = new zbcw();
        ((zbcw)localObject2).a(zbvy.a(localzqy.o()));
        ((zbcw)localObject2).b(zbvy.a(localzqy.q()));
        localObject3 = new zbde((zp)localObject1, (zbcw)localObject2, localzqy.u(), localzqy.a().h(), localzqy.A());
        ((zbde)localObject3).b(paramzr, paramzjf.at());
      }
      else
      {
        str8 = localzqy.s();
        if (!"".equals(str8))
        {
          if ((bool1) || (bool4)) {
            localColor = Color.getRed();
          }
          localObject2 = new zv(zv.c());
          ((zv)localObject2).a(zbvy.a(m));
          ((zv)localObject2).c(zbvy.a(n));
          localObject3 = new zu(localColor);
          paramzr.a(str8, localzg, (zc)localObject3, (zp)localObject1, (zv)localObject2);
        }
      }
    }
    paramzr.a(localzf);
  }
  
  public static void a(zkh paramzkh)
  {
    double d1 = 0.0D;
    for (int i = 0; i < paramzkh.getCount(); i++) {
      d1 += Math.abs(paramzkh.a(i).w());
    }
    if (d1 == 0.0D) {
      return;
    }
    double d2 = 0.0D;
    double d3 = 1.0D;
    int j = -1;
    int k = -1;
    int m = 0;
    for (int n = 0; n < paramzkh.getCount(); n++)
    {
      zkf localzkf1 = paramzkh.b(n);
      d5 = Math.abs(paramzkh.a(n).w());
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
      for (int i3 = 0; i3 < paramzkh.getCount(); i3++)
      {
        localObject = paramzkh.b(i3);
        double d8 = Math.abs(paramzkh.a(i3).w());
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
    zkf localzkf2;
    String str;
    if ((j != -1) && (m < 100))
    {
      localzkf2 = paramzkh.b(j);
      localObject = localzkf2.o();
      str = "";
      if (((zqy)localObject).x()) {
        str = "0%";
      } else {
        str = "".equals(((zqy)localObject).p()) ? "0%" : ((zqy)localObject).p();
      }
      if ("0%".equals(str)) {
        ((zqy)localObject).i = ((1.0D - d2) / 100.0D);
      }
    }
    if ((i1 != -1) && (m < 99))
    {
      localzkf2 = paramzkh.b(i1);
      localObject = localzkf2.o();
      str = "";
      if (((zqy)localObject).x()) {
        str = "0%";
      } else {
        str = "".equals(((zqy)localObject).p()) ? "0%" : ((zqy)localObject).p();
      }
      if ("0%".equals(str)) {
        ((zqy)localObject).i = ((1.0D - d4) / 100.0D);
      }
    }
    if ((k != -1) && (m > 100))
    {
      localzkf2 = paramzkh.b(k);
      localObject = localzkf2.o();
      str = "";
      if (((zqy)localObject).x()) {
        str = "0%";
      } else {
        str = "".equals(((zqy)localObject).p()) ? "0%" : ((zqy)localObject).p();
      }
      if ("0%".equals(str)) {
        ((zqy)localObject).i = ((d3 - 1.0D) / 100.0D);
      }
    }
    if ((i2 != -1) && (m > 101))
    {
      localzkf2 = paramzkh.b(i2);
      localObject = localzkf2.o();
      str = "";
      if (((zqy)localObject).x()) {
        str = "0%";
      } else {
        str = "".equals(((zqy)localObject).p()) ? "0%" : ((zqy)localObject).p();
      }
      if ("0%".equals(str)) {
        ((zqy)localObject).i = ((d5 - 1.0D) / 100.0D);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */