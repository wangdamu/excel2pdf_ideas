package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class zcj
{
  static ArrayList a(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    int i = paramzbfc.af();
    int j = 6;
    zbfe localzbfe = paramzje.z();
    int k = localzbfe.getCount();
    zbs localzbs2;
    zbs localzbs1;
    int m;
    if (i == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
      m = localzbfe.b(1, 6);
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
      m = localzbfe.b(2, 6);
    }
    if (localzbs2.k() == 2) {
      return a(paramzr, paramzje, paramzbfc, paramzp, paramFloat, paramDouble);
    }
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d3 = localzbs1.n() ? zbxz.e(localzbs1.x()) : localzbs1.x();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f1 = paramzbfc.K() / 100.0F;
    float f2 = paramzbfc.J() / 100.0F;
    ArrayList localArrayList = new ArrayList();
    int n = 0;
    if ((localzbs2.f()) || (paramzje.u()))
    {
      n = paramInt;
    }
    else
    {
      n = paramInt - 1;
      if (n == 0) {
        n = 1;
      }
    }
    double d4 = paramzp.f() / n;
    float f3 = 0.0F;
    int i1 = localzbfe.a(paramzbfc, i, new int[] { j });
    int i2 = paramzbfc.ai();
    zkg localzkg = paramzbfc.D();
    for (int i3 = 0; i3 < localzkg.getCount(); i3++)
    {
      zke localzke = localzkg.b(i3);
      float f4 = (float)d4 / (m - f1 * (m - 1) + f2);
      float f5 = f4 * f1;
      float f6 = f4 * f2;
      f3 = i1 * (f4 - f5);
      float f7 = (float)d4 * i3 + f6 / 2.0F + f3;
      if ((!localzbs2.f()) && (!paramzje.u())) {
        f7 -= (float)(d4 / 2.0D);
      }
      if (!localzbs2.p()) {
        f7 = paramzp.d() + paramzp.f() - f7 - f4;
      } else {
        f7 = paramzp.d() + f7;
      }
      if ((localzke != null) && (!localzke.a()))
      {
        double d5 = localzke.w();
        float f8 = (float)((paramDouble - d5) / (d1 - d2) * paramzp.e());
        if ((f8 < 0.0F) && (f8 > -1.0F)) {
          if ((Math.abs(f8) < 0.1D) && (d3 / Math.abs(d5) > 1.0E8D)) {
            f8 = 0.0F;
          } else {
            f8 = -1.0F;
          }
        }
        if ((f8 > 0.0F) && (f8 < 1.0F)) {
          if ((Math.abs(f8) < 0.1D) && (d3 / Math.abs(d5) > 1.0E7D)) {
            f8 = 0.0F;
          } else {
            f8 = 1.0F;
          }
        }
        int i4 = 0;
        if (f8 == 0.0F) {
          i4 = 1;
        }
        zub localzub = paramzbfc.x();
        zo localzo = new zo(paramFloat, f7 + f4 / 2.0F);
        double d6 = 0.0D;
        double d7 = 0.0D;
        float f9 = 0.0F;
        float f10 = 0.0F;
        if (localzub != null)
        {
          switch (localzub.g())
          {
          case 1: 
            d6 = localzub.c();
            d7 = d6;
            break;
          case 2: 
            d6 = localzub.c() * d5 / 100.0D;
            d7 = -d6;
            break;
          case 0: 
            double d8 = localzub.e().size() > i3 ? localzub.a(localzub.e().get(i3)) : 0.0D;
            d6 = d8;
            d8 = localzub.f().size() > i3 ? localzub.a(localzub.f().get(i3)) : 0.0D;
            d7 = d8;
          }
          f9 = (float)d6 / (float)(d1 - d2) * paramzp.e();
          f10 = (float)d7 / (float)(d1 - d2) * paramzp.e();
          if (!localzbs1.p()) {
            localzo.a(localzo.d() - f8);
          } else {
            localzo.a(localzo.d() + f8);
          }
        }
        localzub.a(localzo, f9, f10);
        float f11 = paramFloat;
        if (localzbs1.p())
        {
          if (f8 < 0.0F)
          {
            f8 = -f8;
            f11 -= f8;
          }
        }
        else if (f8 < 0.0F) {
          f8 = -f8;
        } else {
          f11 -= f8;
        }
        zq localzq1 = new zq(f11, f7, f8, f4);
        zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
        if (localzq1.f() < paramzp.c())
        {
          localzq1.c(localzq1.h() - (paramzp.c() - localzq1.f()));
          localzq1.a(paramzp.c());
        }
        if (localzq1.l() > paramzp.i() + 1) {
          localzq1.c(localzq1.h() - (localzq1.l() - paramzp.i()));
        }
        if ((localzq1.m() >= paramzp.d()) && (localzq1.g() <= paramzp.j()))
        {
          if (localzq1.g() < paramzp.d())
          {
            localzq1.d(localzq1.i() - (paramzp.d() - localzq1.g()));
            localzq1.b(paramzp.d());
          }
          else if (localzq1.m() > paramzp.j())
          {
            localzq1.d(localzq1.i() - (localzq1.m() - paramzp.j()));
          }
          if (localzq1.i() + 1.0F >= (f4 - 1.0F) / 3.0F)
          {
            if (i4 == 0) {
              a(paramzr, localzke, localzq1, paramzje.g(paramzbfc.ax()).a(i2), paramFloat, localzbs1);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq2.f() < paramFloat) {
              bool = false;
            } else if (d5 != 0.0D) {
              bool = true;
            } else if (localzbs1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i2);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzq2;
            arrayOfObject[3] = Boolean.valueOf(bool);
            zf.a(localArrayList, arrayOfObject);
          }
        }
      }
    }
    return localArrayList;
  }
  
  private static void a(zr paramzr, zke paramzke, zq paramzq, Color paramColor, float paramFloat, zbs paramzbs)
    throws Exception
  {
    if ((paramzke.i().h() != 0) || (paramzke.k().e())) {
      paramzke.a(new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i()));
    }
    if (paramzq.i() < 10.0F) {
      paramzq.b((int)paramzq.g());
    }
    boolean bool1 = paramzke.g().a().A().a();
    if (!paramzke.i().a) {
      bool1 = paramzke.i().a();
    }
    boolean bool2 = false;
    if (((paramzq.f() + 2.0F < paramFloat) && (bool1) && (!paramzbs.p())) || ((paramzq.l() - 2.0F > paramFloat) && (bool1) && (paramzbs.p()))) {
      bool2 = true;
    }
    if (paramzke.i().h() != 0)
    {
      com.aspose.cells.b.a.b.zc localzc = zbd.a(paramzke.i(), paramzq, bool2);
      try
      {
        paramzr.b(localzc, paramzq);
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
    }
    if (paramzke.k().b().a() > 2.0D)
    {
      if (paramzq.h() > paramzke.k().b().a() / 2.0D) {
        paramzq.c(paramzq.h() - (float)paramzke.k().b().a() / 2.0F);
      }
      if (paramzq.i() > paramzke.k().b().a() / 2.0D) {
        paramzq.d(paramzq.i() - (float)paramzke.k().b().a() / 2.0F);
      }
    }
    zanv.a(paramzr, paramzq, paramzke.k());
    int i = 0;
    if (paramzq.l() - 2.0F < paramFloat) {
      i = 1;
    }
    if ((paramzke.G()) && ((paramzke.i().h() != 0) || (paramzke.k().c() != 0)))
    {
      com.aspose.cells.a.d.zs localzs = new com.aspose.cells.a.d.zs(Color.getBlack(), 2.0F);
      try
      {
        int j = 2;
        int k = 1;
        ze localze = new ze();
        localze.b(paramzq.f() + j, paramzq.m() + k, paramzq.l() + k, paramzq.m() + k);
        if (i == 0) {
          localze.b(paramzq.l() + k, paramzq.m() + k, paramzq.l() + k, paramzq.g() + j);
        }
        paramzr.a(localzs, localze);
      }
      finally
      {
        if (localzs != null) {
          localzs.s();
        }
      }
    }
  }
  
  static void a(zr paramzr, zje paramzje, com.aspose.cells.b.a.b.zp paramzp, ArrayList paramArrayList)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    zbfe localzbfe = paramzje.z();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      zq localzq = (zq)arrayOfObject[2];
      boolean bool = ((Boolean)arrayOfObject[3]).booleanValue();
      zbfc localzbfc = localzbfe.c(j);
      int m = localzbfc.af();
      zbs localzbs;
      if (m == 1) {
        localzbs = paramzje.e();
      } else {
        localzbs = paramzje.g();
      }
      a(paramzr, localzbs, localzbfe, j, k, localzq, bool, paramzp.e());
    }
  }
  
  private static void a(zr paramzr, zbs paramzbs, zbfe paramzbfe, int paramInt1, int paramInt2, zq paramzq, boolean paramBoolean, int paramInt3)
    throws Exception
  {
    zke localzke = paramzbfe.c(paramInt1).D().b(paramInt2);
    zqx localzqx = localzke.o();
    zt localzt = zqz.a(paramzr, paramzbs, paramzbfe, paramInt1, paramInt2, paramInt3);
    float f1 = 0.0F;
    float f2 = paramzq.g() + (paramzq.i() - localzt.c()) / 2.0F;
    int i = 0;
    int j = 0;
    int k = localzqx.j();
    if (k == 9) {
      k = zqz.b(paramzbfe.a(paramInt1).m());
    }
    int m = 0;
    switch (k)
    {
    case 1: 
      f1 = paramzq.f() + paramzq.h() / 2.0F - localzt.b() / 2.0F;
      break;
    case 2: 
      if (paramBoolean)
      {
        f1 = paramzq.f();
        i = 5;
        f1 += i;
      }
      else
      {
        f1 = paramzq.f() + paramzq.h() - localzt.b();
      }
      break;
    case 3: 
      if (paramBoolean)
      {
        f1 = paramzq.f() + paramzq.h() - localzt.b();
        i = -1;
        f1 += i;
      }
      else
      {
        f1 = paramzq.f();
        j = 6;
        f1 += j;
      }
      break;
    default: 
      if ((localzke.w() <= paramzbs.ab().z()) && (localzke.w() > paramzbs.ab().D())) {
        m = 1;
      }
      if (paramBoolean)
      {
        f1 = paramzq.f() + paramzq.h();
        i = 5;
        f1 += i;
      }
      else
      {
        f1 = paramzq.f() - localzt.b();
        i = -5;
        f1 += i;
      }
      break;
    }
    if (paramzbfe.c(paramInt1).b(new int[] { 6 })) {
      if (paramBoolean)
      {
        if (f1 - zqz.a < paramzq.f()) {
          f1 += paramzq.f() - (f1 - zqz.a);
        }
      }
      else
      {
        if (f1 + zqz.a + localzt.b() > paramzq.l()) {
          f1 -= f1 + zqz.a + localzt.b() - paramzq.l();
        }
        if ((localzqx.j() == 9) && (paramzq.h() <= 3.0F)) {
          f1 = paramzq.l();
        }
      }
    }
    localzqx.a().b = new com.aspose.cells.b.a.b.zp(zbxz.c(f1), zbxz.c(f2), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
    localzqx.a().z();
    int n = 0;
    zo localzo = new zo(localzqx.a().a.c() + localzqx.a().a.e(), localzqx.a().a.d() + localzqx.a().a.f());
    if ((m == 0) && ((localzo.d() < 0.0F) || (localzo.d() > paramzbs.c().a()) || (localzo.e() < 0.0F) || (localzo.e() > paramzbs.c().b()))) {
      n = 1;
    }
    if (n == 0) {
      zqz.a(paramzr, paramzbs, paramzbfe, paramInt1, paramInt2, localzqx.a().a);
    }
  }
  
  private static ArrayList a(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble)
    throws Exception
  {
    int i = paramzbfc.af();
    int j = 6;
    int k = paramzje.z().getCount();
    zbfe localzbfe = paramzje.z();
    zbs localzbs2;
    zbs localzbs1;
    int m;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
      m = localzbfe.b(1, 6);
      localArrayList1 = ziy.a(paramzje.z().c(), paramzje.U());
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
      m = localzbfe.b(2, 6);
      localArrayList1 = ziy.a(paramzje.z().d(), paramzje.U());
    }
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d3 = localzbs1.n() ? zbxz.e(localzbs1.x()) : localzbs1.x();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f1 = paramzbfc.K() / 100.0F;
    float f2 = paramzbfc.J() / 100.0F;
    ArrayList localArrayList2 = new ArrayList();
    int n = localArrayList1.size();
    int i1 = localzbs2.j();
    int i2 = (int)localzbs2.D();
    int i3 = (int)localzbs2.z();
    int i4 = 0;
    if ((localzbs2.f()) || (paramzje.u()))
    {
      i4 = zbu.a(i1, i3, i2, paramzje.U()) + 1;
    }
    else
    {
      i4 = zbu.a(i1, i3, i2, paramzje.U());
      if (i4 == 0) {
        i4 = 1;
      }
    }
    double d4 = paramzp.f() / i4;
    for (int i5 = 0; i5 < n; i5++)
    {
      zke localzke = paramzbfc.D().b(i5);
      float f3 = (float)(d4 / (m - f1 * (m - 1) + f2));
      float f4 = f3 * f1;
      float f5 = f3 * f2;
      int i6 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i5)));
      i6 = zbu.a(i1, i6, paramzje.U());
      int i7 = zbu.a(i1, i6, i2, paramzje.U());
      float f6 = (float)(d4 * i7);
      if ((!localzbs2.f()) && (!paramzje.u())) {
        f6 -= (float)(d4 / 2.0D);
      }
      float f7 = 0.0F;
      if (localzbs2.p()) {
        f7 = paramzp.d() + f6 + f5 / 2.0F;
      } else {
        f7 = paramzp.d() + paramzp.f() - f3 - f6 - f5 / 2.0F;
      }
      int i8 = localzbfe.a(paramzbfc, i, new int[] { j });
      int i9 = paramzbfc.ai();
      if (localzbs2.p()) {
        f7 += i8 * (f3 - f4);
      } else {
        f7 -= i8 * (f3 - f4);
      }
      if ((localzke != null) && (!localzke.a()))
      {
        double d5 = localzke.w();
        float f8 = (float)((paramDouble - d5) / (d1 - d2) * paramzp.e());
        if ((f8 < 0.0F) && (f8 > -1.0F)) {
          if ((Math.abs(f8) < 0.1D) && (d3 / Math.abs(d5) > 1.0E8D)) {
            f8 = 0.0F;
          } else {
            f8 = -1.0F;
          }
        }
        if ((f8 > 0.0F) && (f8 < 1.0F)) {
          if ((Math.abs(f8) < 0.1D) && (d3 / Math.abs(d5) > 1.0E7D)) {
            f8 = 0.0F;
          } else {
            f8 = 1.0F;
          }
        }
        int i10 = 0;
        if (f8 == 0.0F) {
          i10 = 1;
        }
        float f9 = paramFloat;
        zub localzub = paramzbfc.x();
        zo localzo = new zo(paramFloat, f7 + f3 / 2.0F);
        double d6 = 0.0D;
        double d7 = 0.0D;
        float f10 = 0.0F;
        float f11 = 0.0F;
        if (localzub != null)
        {
          switch (localzub.g())
          {
          case 1: 
            d6 = localzub.c();
            d7 = d6;
            break;
          case 2: 
            d6 = localzub.c() * d5 / 100.0D;
            d7 = -d6;
            break;
          case 0: 
            double d8 = localzub.e().size() > i5 ? localzub.a(localzub.e().get(i5)) : 0.0D;
            d6 = d8;
            d8 = localzub.f().size() > i5 ? localzub.a(localzub.f().get(i5)) : 0.0D;
            d7 = d8;
          }
          f10 = (float)d6 / (float)(d1 - d2) * paramzp.e();
          f11 = (float)d7 / (float)(d1 - d2) * paramzp.e();
          if (!localzbs1.p()) {
            localzo.a(localzo.d() - f8);
          } else {
            localzo.a(localzo.d() + f8);
          }
        }
        localzub.a(localzo, f10, f11);
        if (!localzbs1.p())
        {
          if (f8 < 0.0F) {
            f8 = -f8;
          } else {
            f9 -= f8;
          }
        }
        else if (f8 < 0.0F)
        {
          f8 = -f8;
          f9 -= f8;
        }
        zq localzq1 = new zq(f9, f7, f8, f3);
        zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
        if (localzq1.g() < paramzp.d())
        {
          localzq1.d(localzq1.i() - (paramzp.d() - localzq1.g()));
          localzq1.b(paramzp.d());
        }
        if (localzq1.m() > paramzp.j() + 1) {
          localzq1.d(localzq1.i() - (localzq1.m() - paramzp.j()));
        }
        if ((localzq1.l() >= paramzp.c()) && (localzq1.j() <= paramzp.i()))
        {
          if (localzq1.f() < paramzp.c())
          {
            localzq1.c(localzq1.h() - (paramzp.c() - localzq1.f()));
            localzq1.a(paramzp.c());
          }
          else if (localzq1.l() > paramzp.i())
          {
            localzq1.c(localzq1.h() - (localzq1.l() - paramzp.i()));
          }
          if (localzq1.i() + 1.0F >= (f3 - 1.0F) / 3.0F)
          {
            if (i10 == 0) {
              a(paramzr, localzke, localzq1, paramzje.g(paramzbfc.ax()).a(i9), paramFloat, localzbs1);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq2.f() < paramFloat) {
              bool = false;
            } else if (d5 != 0.0D) {
              bool = true;
            } else if (localzbs1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i9);
            arrayOfObject[1] = Integer.valueOf(i5);
            arrayOfObject[2] = localzq2;
            arrayOfObject[3] = Boolean.valueOf(bool);
            zf.a(localArrayList2, arrayOfObject);
          }
        }
      }
    }
    return localArrayList2;
  }
  
  static ArrayList a(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
    throws Exception
  {
    int i = paramzbfc.af();
    int j = 7;
    zbfe localzbfe = paramzje.z();
    int k = localzbfe.getCount();
    zbs localzbs2;
    zbs localzbs1;
    int m;
    if (i == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
      m = localzbfe.b(1, j);
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
      m = localzbfe.b(2, j);
    }
    float f1 = 0.0F;
    if (localzbs1.p()) {
      f1 = paramzp.c() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
    } else {
      f1 = paramzp.i() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
    }
    if (localzbs2.k() == 2) {
      return a(paramzr, paramzje, paramzbfc, paramzp, f1);
    }
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    float f2 = paramzbfc.K() / 100.0F;
    float f3 = paramzbfc.J() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    int n = 0;
    if ((localzbs2.f()) || (paramzje.u()))
    {
      n = paramInt;
    }
    else
    {
      n = paramInt - 1;
      if (n == 0) {
        n = 1;
      }
    }
    double d3 = paramzp.f() / n;
    float f4 = 0.0F;
    List localList = localzbfe.a(i, new int[] { j });
    int i1 = localzbfe.a(paramzbfc, i, new int[] { j });
    if (i1 == -1) {
      return localArrayList1;
    }
    int i2 = paramzbfc.ai();
    zkg localzkg = paramzbfc.D();
    ArrayList localArrayList2 = new ArrayList();
    for (int i3 = 0; i3 < localzkg.getCount(); i3++)
    {
      zke localzke1 = localzkg.b(i3);
      float f5 = (float)d3 / (m - f2 * (m - 1) + f3);
      float f6 = f5 * f2;
      float f7 = f5 * f3;
      f4 = i1 * (f5 - f6);
      float f8 = (float)d3 * i3 + f7 / 2.0F + f4;
      if ((!localzbs2.f()) && (!paramzje.u())) {
        f8 -= (float)(d3 / 2.0D);
      }
      if (!localzbs2.p()) {
        f8 = paramzp.d() + paramzp.f() - f8 - f5;
      } else {
        f8 = paramzp.d() + f8;
      }
      ArrayList localArrayList3 = new ArrayList();
      if (localzke1 != null)
      {
        double d4 = localzke1.w();
        double d5 = d4;
        int i4;
        zke localzke2;
        double d6;
        if (d4 >= 0.0D) {
          for (i4 = 0; i4 < i1; i4++)
          {
            localzke2 = ((zbfc)localList.get(i4)).D().b(i3);
            if (localzke2 != null)
            {
              d6 = localzke2.w();
              if (d6 > 0.0D) {
                d5 += d6;
              }
            }
          }
        } else {
          for (i4 = 0; i4 < i1; i4++)
          {
            localzke2 = ((zbfc)localList.get(i4)).D().b(i3);
            if (localzke2 != null)
            {
              d6 = localzke2.w();
              if (d6 <= 0.0D) {
                d5 += d6;
              }
            }
          }
        }
        float f9 = (float)(Math.abs(d4) / (localzbs1.z() - localzbs1.D()) * paramzp.e());
        float f10 = (float)(Math.abs(d5) / (localzbs1.z() - localzbs1.D()) * paramzp.e());
        int i5 = 0;
        if (f9 == 0.0F) {
          i5 = 1;
        }
        zub localzub = paramzbfc.x();
        zo localzo = new zo(f1, f8 + f5 / 2.0F);
        double d7 = 0.0D;
        double d8 = 0.0D;
        float f11 = 0.0F;
        float f12 = 0.0F;
        if (localzub != null)
        {
          switch (localzub.g())
          {
          case 1: 
            d7 = localzub.c();
            d8 = d7;
            break;
          case 2: 
            d7 = localzub.c() * d4 / 100.0D;
            d8 = -d7;
            break;
          case 0: 
            double d9 = localzub.e().size() > i3 ? localzub.a(localzub.e().get(i3)) : 0.0D;
            d7 = d9;
            d9 = localzub.f().size() > i3 ? localzub.a(localzub.f().get(i3)) : 0.0D;
            d8 = d9;
          }
          f11 = (float)d7 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
          f12 = (float)d8 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
          if (!localzbs1.p())
          {
            if (d4 <= 0.0D) {
              localzo.a(localzo.d() - f10);
            } else {
              localzo.a(localzo.d() + f10);
            }
          }
          else if (d4 <= 0.0D) {
            localzo.a(localzo.d() + f10);
          } else {
            localzo.a(localzo.d() - f10);
          }
        }
        localzub.a(localzo, f11, f12);
        if (!localzbs1.p())
        {
          if (d4 >= 0.0D) {
            f10 = f1 + f10 - f9;
          } else {
            f10 = f1 - f10;
          }
        }
        else if (d4 >= 0.0D) {
          f10 = f1 - f10;
        } else {
          f10 = f1 + f10 - f9;
        }
        zq localzq1 = new zq(f10, f8, f9, f5);
        zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
        if (localzq1.f() < paramzp.c())
        {
          localzq1.c(localzq1.h() - (paramzp.c() - localzq1.f()));
          localzq1.a(paramzp.c());
        }
        if (localzq1.l() > paramzp.i() + 1) {
          localzq1.c(localzq1.h() - (localzq1.l() - paramzp.i()));
        }
        if ((localzq1.m() >= paramzp.d()) && (localzq1.g() <= paramzp.j()))
        {
          if (localzq1.g() < paramzp.d())
          {
            localzq1.d(localzq1.i() - (paramzp.d() - localzq1.g()));
            localzq1.b(paramzp.d());
          }
          else if (localzq1.m() > paramzp.j())
          {
            localzq1.d(localzq1.i() - (localzq1.m() - paramzp.j()));
          }
          if (localzq1.i() + 1.0F >= (f5 - 1.0F) / 3.0F)
          {
            if (i5 == 0) {
              a(paramzr, localzke1, localzq1, paramzje.g(paramzbfc.ax()).a(i2), f1, localzbs1);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq2.f() + localzq2.h() / 2.0F < f1) {
              bool = false;
            } else if (d4 != 0.0D) {
              bool = true;
            } else if (localzbs1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i2);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzq2;
            arrayOfObject[3] = Boolean.valueOf(bool);
            if (!localzke1.a()) {
              zf.a(localArrayList1, arrayOfObject);
            }
            if (paramzbfc.X())
            {
              zf.a(localArrayList3, localzq1);
              zf.a(localArrayList3, Boolean.valueOf(bool));
            }
          }
        }
      }
      ArrayList[] arrayOfArrayList = { localArrayList2 };
      a(paramzr, paramzbfc, arrayOfArrayList, localArrayList3);
      localArrayList2 = arrayOfArrayList[0];
    }
    return localArrayList1;
  }
  
  private static void a(zr paramzr, zbfc paramzbfc, ArrayList[] paramArrayOfArrayList, ArrayList paramArrayList)
  {
    if ((paramArrayOfArrayList[0].size() > 0) && (paramArrayList.size() > 0) && (paramzbfc.X()))
    {
      zq localzq1 = (zq)paramArrayOfArrayList[0].get(0);
      boolean bool1 = ((Boolean)paramArrayOfArrayList[0].get(1)).booleanValue();
      zq localzq2 = (zq)paramArrayList.get(0);
      boolean bool2 = ((Boolean)paramArrayList.get(1)).booleanValue();
      zo localzo1;
      zo localzo2;
      if (localzq1.g() < localzq2.g())
      {
        if (bool1) {
          localzo1 = new zo(localzq1.l(), localzq1.m());
        } else {
          localzo1 = new zo(localzq1.j(), localzq1.m());
        }
        if (bool2) {
          localzo2 = new zo(localzq2.l(), localzq2.k());
        } else {
          localzo2 = new zo(localzq2.j(), localzq2.k());
        }
      }
      else
      {
        if (bool1) {
          localzo1 = new zo(localzq1.l(), localzq1.k());
        } else {
          localzo1 = new zo(localzq1.j(), localzq1.k());
        }
        if (bool2) {
          localzo2 = new zo(localzq2.l(), localzq2.m());
        } else {
          localzo2 = new zo(localzq2.j(), localzq2.m());
        }
      }
      zanv.a(paramzr, localzo1, localzo2, paramzbfc.Y());
    }
    if (paramArrayList.size() > 0) {
      paramArrayOfArrayList[0] = paramArrayList;
    }
  }
  
  private static ArrayList a(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat)
    throws Exception
  {
    int i = paramzbfc.af();
    int j = 7;
    zbfe localzbfe = paramzje.z();
    int k = localzbfe.getCount();
    zbs localzbs2;
    zbs localzbs1;
    int m;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
      m = localzbfe.b(1, j);
      localArrayList1 = ziy.a(paramzje.z().c(), paramzje.U());
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
      m = localzbfe.b(2, j);
      localArrayList1 = ziy.a(paramzje.z().d(), paramzje.U());
    }
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    float f1 = paramzbfc.K() / 100.0F;
    float f2 = paramzbfc.J() / 100.0F;
    ArrayList localArrayList2 = new ArrayList();
    int n = localArrayList1.size();
    int i1 = localzbs2.j();
    int i2 = (int)localzbs2.D();
    int i3 = (int)localzbs2.z();
    int i4 = 0;
    if ((localzbs2.f()) || (paramzje.u()))
    {
      i4 = zbu.a(i1, i3, i2, paramzje.U()) + 1;
    }
    else
    {
      i4 = zbu.a(i1, i3, i2, paramzje.U());
      if (i4 == 0) {
        i4 = 1;
      }
    }
    double d3 = paramzp.f() / i4;
    ArrayList localArrayList3 = new ArrayList();
    for (int i5 = 0; i5 < n; i5++)
    {
      zke localzke1 = paramzbfc.D().b(i5);
      float f3 = (float)(d3 / (m - f1 * (m - 1) + f2));
      float f4 = f3 * f1;
      float f5 = f3 * f2;
      int i6 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i5)));
      i6 = zbu.a(i1, i6, paramzje.U());
      int i7 = zbu.a(i1, i6, i2, paramzje.U());
      float f6 = (float)(d3 * i7);
      if ((!localzbs2.f()) && (!paramzje.u())) {
        f6 -= (float)(d3 / 2.0D);
      }
      float f7 = 0.0F;
      if (localzbs2.p()) {
        f7 = paramzp.d() + f6 + f5 / 2.0F;
      } else {
        f7 = paramzp.d() + paramzp.f() - f3 - f6 - f5 / 2.0F;
      }
      List localList = localzbfe.a(i, new int[] { j });
      int i8 = localzbfe.a(paramzbfc, i, new int[] { j });
      if (i8 == -1) {
        return localArrayList2;
      }
      int i9 = paramzbfc.ai();
      if (localzbs2.p()) {
        f7 += i8 * (f3 - f4);
      } else {
        f7 -= i8 * (f3 - f4);
      }
      ArrayList localArrayList4 = new ArrayList();
      if (localzke1 != null)
      {
        double d4 = localzke1.w();
        double d5 = d4;
        int i10;
        zke localzke2;
        double d6;
        if (d4 >= 0.0D) {
          for (i10 = 0; i10 < i8; i10++)
          {
            localzke2 = ((zbfc)localList.get(i10)).D().b(i5);
            if (localzke2 != null)
            {
              d6 = localzke2.w();
              if (d6 > 0.0D) {
                d5 += d6;
              }
            }
          }
        } else {
          for (i10 = 0; i10 < i8; i10++)
          {
            localzke2 = ((zbfc)localList.get(i10)).D().b(i5);
            if (localzke2 != null)
            {
              d6 = localzke2.w();
              if (d6 <= 0.0D) {
                d5 += d6;
              }
            }
          }
        }
        float f8 = (float)(Math.abs(d4) / (localzbs1.z() - localzbs1.D()) * paramzp.e());
        float f9 = (float)(Math.abs(d5) / (localzbs1.z() - localzbs1.D()) * paramzp.e());
        int i11 = 0;
        if (f8 == 0.0F) {
          i11 = 1;
        }
        zub localzub = paramzbfc.x();
        zo localzo = new zo(paramFloat, f7 + f3 / 2.0F);
        double d7 = 0.0D;
        double d8 = 0.0D;
        float f10 = 0.0F;
        float f11 = 0.0F;
        if (localzub != null)
        {
          switch (localzub.g())
          {
          case 1: 
            d7 = localzub.c();
            d8 = d7;
            break;
          case 2: 
            d7 = localzub.c() * d4 / 100.0D;
            d8 = -d7;
            break;
          case 0: 
            double d9 = localzub.e().size() > i5 ? localzub.a(localzub.e().get(i5)) : 0.0D;
            d7 = d9;
            d9 = localzub.f().size() > i5 ? localzub.a(localzub.f().get(i5)) : 0.0D;
            d8 = d9;
          }
          f10 = (float)d7 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
          f11 = (float)d8 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
          if (!localzbs1.p())
          {
            if (d4 <= 0.0D) {
              localzo.a(localzo.d() - f9);
            } else {
              localzo.a(localzo.d() + f9);
            }
          }
          else if (d4 <= 0.0D) {
            localzo.a(localzo.d() + f9);
          } else {
            localzo.a(localzo.d() - f9);
          }
        }
        localzub.a(localzo, f10, f11);
        if (!localzbs1.p())
        {
          if (d4 >= 0.0D) {
            f9 = paramFloat + f9 - f8;
          } else {
            f9 = paramFloat - f9;
          }
        }
        else if (d4 >= 0.0D) {
          f9 = paramFloat - f9;
        } else {
          f9 = paramFloat + f9 - f8;
        }
        zq localzq1 = new zq(f9, f7, f8, f3);
        zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
        if (localzq1.g() < paramzp.d())
        {
          localzq1.d(localzq1.i() - (paramzp.d() - localzq1.g()));
          localzq1.b(paramzp.d());
        }
        if (localzq1.m() > paramzp.j() + 1) {
          localzq1.d(localzq1.i() - (localzq1.m() - paramzp.j()));
        }
        if ((localzq1.l() >= paramzp.c()) && (localzq1.j() <= paramzp.i()))
        {
          if (localzq1.f() < paramzp.c())
          {
            localzq1.c(localzq1.h() - (paramzp.c() - localzq1.f()));
            localzq1.a(paramzp.c());
          }
          else if (localzq1.l() > paramzp.i())
          {
            localzq1.c(localzq1.h() - (localzq1.l() - paramzp.i()));
          }
          if (localzq1.i() + 1.0F >= (f3 - 1.0F) / 3.0F)
          {
            if (i11 == 0) {
              a(paramzr, localzke1, localzq1, paramzje.g(paramzbfc.ax()).a(i9), paramFloat, localzbs1);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq2.f() + localzq2.h() / 2.0F < paramFloat) {
              bool = false;
            } else if (d4 != 0.0D) {
              bool = true;
            } else if (localzbs1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i9);
            arrayOfObject[1] = Integer.valueOf(i5);
            arrayOfObject[2] = localzq2;
            arrayOfObject[3] = Boolean.valueOf(bool);
            if (!localzke1.a()) {
              zf.a(localArrayList2, arrayOfObject);
            }
            if (paramzbfc.X())
            {
              zf.a(localArrayList4, localzq1);
              zf.a(localArrayList4, Boolean.valueOf(bool));
            }
          }
        }
      }
      ArrayList[] arrayOfArrayList = { localArrayList3 };
      a(paramzr, paramzbfc, arrayOfArrayList, localArrayList4);
      localArrayList3 = arrayOfArrayList[0];
    }
    return localArrayList2;
  }
  
  static ArrayList b(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
    throws Exception
  {
    int i = paramzbfc.af();
    int j = 8;
    zbfe localzbfe = paramzje.z();
    int k = localzbfe.getCount();
    zbs localzbs2;
    zbs localzbs1;
    int m;
    if (i == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
      m = localzbfe.b(1, j);
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
      m = localzbfe.b(2, j);
    }
    float f1 = 0.0F;
    if (localzbs1.p()) {
      f1 = paramzp.c() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
    } else {
      f1 = paramzp.i() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
    }
    if (localzbs2.k() == 2) {
      return b(paramzr, paramzje, paramzbfc, paramzp, f1);
    }
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    float f2 = paramzbfc.K() / 100.0F;
    float f3 = paramzbfc.J() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    int n = 0;
    if ((localzbs2.f()) || (paramzje.u()))
    {
      n = paramInt;
    }
    else
    {
      n = paramInt - 1;
      if (n == 0) {
        n = 1;
      }
    }
    double d3 = paramzp.f() / n;
    float f4 = 0.0F;
    List localList = localzbfe.a(i, new int[] { j });
    int i1 = localzbfe.a(paramzbfc, i, new int[] { j });
    if (i1 == -1) {
      return localArrayList1;
    }
    int i2 = paramzbfc.ai();
    ArrayList localArrayList2 = new ArrayList();
    zkg localzkg = paramzbfc.D();
    for (int i3 = 0; i3 < localzkg.getCount(); i3++)
    {
      zke localzke1 = localzkg.b(i3);
      float f5 = (float)d3 / (m - f2 * (m - 1) + f3);
      float f6 = f5 * f2;
      float f7 = f5 * f3;
      f4 = i1 * (f5 - f6);
      float f8 = (float)d3 * i3 + f7 / 2.0F + f4;
      if ((!localzbs2.f()) && (!paramzje.u())) {
        f8 -= (float)(d3 / 2.0D);
      }
      if (!localzbs2.p()) {
        f8 = paramzp.d() + paramzp.f() - f8 - f5;
      } else {
        f8 = paramzp.d() + f8;
      }
      ArrayList localArrayList3 = new ArrayList();
      if (localzke1 != null)
      {
        double d4 = localzke1.w();
        double d5 = d4;
        double d6 = 0.0D;
        zke localzke2;
        double d7;
        if (d4 >= 0.0D) {
          for (i4 = 0; i4 < i1; i4++)
          {
            localzke2 = ((zbfc)localList.get(i4)).D().b(i3);
            if (localzke2 != null)
            {
              d7 = localzke2.w();
              if (d7 > 0.0D) {
                d5 += d7;
              }
            }
          }
        } else {
          for (i4 = 0; i4 < i1; i4++)
          {
            localzke2 = ((zbfc)localList.get(i4)).D().b(i3);
            if (localzke2 != null)
            {
              d7 = localzke2.w();
              if (d7 <= 0.0D) {
                d5 += d7;
              }
            }
          }
        }
        for (int i4 = 0; i4 < localList.size(); i4++)
        {
          localzke2 = ((zbfc)localList.get(i4)).D().b(i3);
          if (localzke2 != null)
          {
            d7 = localzke2.w();
            d6 += Math.abs(d7);
          }
        }
        float f9 = 0.0F;
        float f10 = 0.0F;
        if (d6 != 0.0D)
        {
          f9 = (float)(Math.abs(d4) * 100.0D / d6 / (localzbs1.z() - localzbs1.D()) * paramzp.e());
          f10 = (float)(Math.abs(d5) * 100.0D / d6 / (localzbs1.z() - localzbs1.D()) * paramzp.e());
        }
        int i5 = 0;
        if (f9 == 0.0F) {
          i5 = 1;
        }
        zub localzub = paramzbfc.x();
        zo localzo = new zo(f1, f8 + f5 / 2.0F);
        double d8 = 0.0D;
        double d9 = 0.0D;
        float f11 = 0.0F;
        float f12 = 0.0F;
        if (localzub != null)
        {
          switch (localzub.g())
          {
          case 1: 
            d8 = localzub.c();
            d9 = d8;
            break;
          case 2: 
            d8 = localzub.c() * d4 / 100.0D;
            d9 = -d8;
            break;
          case 0: 
            double d10 = localzub.e().size() > i3 ? localzub.a(localzub.e().get(i3)) : 0.0D;
            d8 = d10;
            d10 = localzub.f().size() > i3 ? localzub.a(localzub.f().get(i3)) : 0.0D;
            d9 = d10;
          }
          d9 = d9 * 100.0D / d6;
          d8 = d8 * 100.0D / d6;
          f11 = (float)d8 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
          f12 = (float)d9 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
          if (!localzbs1.p())
          {
            if (d4 <= 0.0D) {
              localzo.a(localzo.d() - f10);
            } else {
              localzo.a(localzo.d() + f10);
            }
          }
          else if (d4 <= 0.0D) {
            localzo.a(localzo.d() + f10);
          } else {
            localzo.a(localzo.d() - f10);
          }
        }
        localzub.a(localzo, f11, f12);
        if (!localzbs1.p())
        {
          if (d4 >= 0.0D) {
            f10 = f1 + f10 - f9;
          } else {
            f10 = f1 - f10;
          }
        }
        else if (d4 >= 0.0D) {
          f10 = f1 - f10;
        } else {
          f10 = f1 + f10 - f9;
        }
        zq localzq1 = new zq(f10, f8, f9, f5);
        zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
        if (localzq1.f() < paramzp.c())
        {
          localzq1.c(localzq1.h() - (paramzp.c() - localzq1.f()));
          localzq1.a(paramzp.c());
        }
        if (localzq1.l() > paramzp.i() + 1) {
          localzq1.c(localzq1.h() - (localzq1.l() - paramzp.i()));
        }
        if ((localzq1.m() >= paramzp.d()) && (localzq1.g() <= paramzp.j()))
        {
          if (localzq1.g() < paramzp.d())
          {
            localzq1.d(localzq1.i() - (paramzp.d() - localzq1.g()));
            localzq1.b(paramzp.d());
          }
          else if (localzq1.m() > paramzp.j())
          {
            localzq1.d(localzq1.i() - (localzq1.m() - paramzp.j()));
          }
          if (localzq1.i() + 1.0F >= (f5 - 1.0F) / 3.0F)
          {
            if (i5 == 0) {
              a(paramzr, localzke1, localzq1, paramzje.g(paramzbfc.ax()).a(i2), f1, localzbs1);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq2.f() + localzq2.h() / 2.0F < f1) {
              bool = false;
            } else if (d4 != 0.0D) {
              bool = true;
            } else if (localzbs1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i2);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzq2;
            arrayOfObject[3] = Boolean.valueOf(bool);
            if (!localzke1.a()) {
              zf.a(localArrayList1, arrayOfObject);
            }
            if (paramzbfc.X())
            {
              zf.a(localArrayList3, localzq1);
              zf.a(localArrayList3, Boolean.valueOf(bool));
            }
          }
        }
      }
      ArrayList[] arrayOfArrayList = { localArrayList2 };
      a(paramzr, paramzbfc, arrayOfArrayList, localArrayList3);
      localArrayList2 = arrayOfArrayList[0];
    }
    return localArrayList1;
  }
  
  private static ArrayList b(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat)
    throws Exception
  {
    int i = paramzbfc.af();
    int j = 8;
    zbfe localzbfe = paramzje.z();
    int k = localzbfe.getCount();
    zbs localzbs2;
    zbs localzbs1;
    int m;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
      m = localzbfe.b(1, j);
      localArrayList1 = ziy.a(paramzje.z().c(), paramzje.U());
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
      m = localzbfe.b(2, j);
      localArrayList1 = ziy.a(paramzje.z().d(), paramzje.U());
    }
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    float f1 = paramzbfc.K() / 100.0F;
    float f2 = paramzbfc.J() / 100.0F;
    ArrayList localArrayList2 = new ArrayList();
    int n = localArrayList1.size();
    int i1 = localzbs2.j();
    int i2 = (int)localzbs2.D();
    int i3 = (int)localzbs2.z();
    int i4 = 0;
    if ((localzbs2.f()) || (paramzje.u()))
    {
      i4 = zbu.a(i1, i3, i2, paramzje.U()) + 1;
    }
    else
    {
      i4 = zbu.a(i1, i3, i2, paramzje.U());
      if (i4 == 0) {
        i4 = 1;
      }
    }
    double d3 = paramzp.f() / i4;
    ArrayList localArrayList3 = new ArrayList();
    for (int i5 = 0; i5 < n; i5++)
    {
      zke localzke1 = paramzbfc.D().b(i5);
      float f3 = (float)(d3 / (m - f1 * (m - 1) + f2));
      float f4 = f3 * f1;
      float f5 = f3 * f2;
      int i6 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i5)));
      i6 = zbu.a(i1, i6, paramzje.U());
      int i7 = zbu.a(i1, i6, i2, paramzje.U());
      float f6 = (float)(d3 * i7);
      if ((!localzbs2.f()) && (!paramzje.u())) {
        f6 -= (float)(d3 / 2.0D);
      }
      float f7 = 0.0F;
      if (localzbs2.p()) {
        f7 = paramzp.d() + f6 + f5 / 2.0F;
      } else {
        f7 = paramzp.d() + paramzp.f() - f3 - f6 - f5 / 2.0F;
      }
      List localList = localzbfe.a(i, new int[] { j });
      int i8 = localzbfe.a(paramzbfc, i, new int[] { j });
      if (i8 == -1) {
        return localArrayList2;
      }
      int i9 = paramzbfc.ai();
      if (localzbs2.p()) {
        f7 += i8 * (f3 - f4);
      } else {
        f7 -= i8 * (f3 - f4);
      }
      ArrayList localArrayList4 = new ArrayList();
      if (localzke1 != null)
      {
        double d4 = localzke1.w();
        double d5 = d4;
        double d6 = 0.0D;
        zke localzke2;
        double d7;
        if (d4 >= 0.0D) {
          for (i10 = 0; i10 < i8; i10++)
          {
            localzke2 = ((zbfc)localList.get(i10)).D().b(i5);
            if (localzke2 != null)
            {
              d7 = localzke2.w();
              if (d7 > 0.0D) {
                d5 += d7;
              }
            }
          }
        } else {
          for (i10 = 0; i10 < i8; i10++)
          {
            localzke2 = ((zbfc)localList.get(i10)).D().b(i5);
            if (localzke2 != null)
            {
              d7 = localzke2.w();
              if (d7 <= 0.0D) {
                d5 += d7;
              }
            }
          }
        }
        for (int i10 = 0; i10 < localList.size(); i10++)
        {
          localzke2 = ((zbfc)localList.get(i10)).D().b(i5);
          if (localzke2 != null)
          {
            d7 = localzke2.w();
            d6 += Math.abs(d7);
          }
        }
        float f8 = 0.0F;
        float f9 = 0.0F;
        if (d6 != 0.0D)
        {
          f8 = (float)(Math.abs(d4) * 100.0D / d6 / (localzbs1.z() - localzbs1.D()) * paramzp.e());
          f9 = (float)(Math.abs(d5) * 100.0D / d6 / (localzbs1.z() - localzbs1.D()) * paramzp.e());
        }
        int i11 = 0;
        if (f8 == 0.0F) {
          i11 = 1;
        }
        zub localzub = paramzbfc.x();
        zo localzo = new zo(paramFloat, f7 + f3 / 2.0F);
        double d8 = 0.0D;
        double d9 = 0.0D;
        float f10 = 0.0F;
        float f11 = 0.0F;
        if (localzub != null)
        {
          switch (localzub.g())
          {
          case 1: 
            d8 = localzub.c();
            d9 = d8;
            break;
          case 2: 
            d8 = localzub.c() * d4 / 100.0D;
            d9 = -d8;
            break;
          case 0: 
            double d10 = localzub.e().size() > i5 ? localzub.a(localzub.e().get(i5)) : 0.0D;
            d8 = d10;
            d10 = localzub.f().size() > i5 ? localzub.a(localzub.f().get(i5)) : 0.0D;
            d9 = d10;
          }
          d9 = d9 * 100.0D / d6;
          d8 = d8 * 100.0D / d6;
          f10 = (float)d8 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
          f11 = (float)d9 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.e();
          if (!localzbs1.p())
          {
            if (d4 <= 0.0D) {
              localzo.a(localzo.d() - f9);
            } else {
              localzo.a(localzo.d() + f9);
            }
          }
          else if (d4 <= 0.0D) {
            localzo.a(localzo.d() + f9);
          } else {
            localzo.a(localzo.d() - f9);
          }
        }
        localzub.a(localzo, f10, f11);
        if (!localzbs1.p())
        {
          if (d4 >= 0.0D) {
            f9 = paramFloat + f9 - f8;
          } else {
            f9 = paramFloat - f9;
          }
        }
        else if (d4 >= 0.0D) {
          f9 = paramFloat - f9;
        } else {
          f9 = paramFloat + f9 - f8;
        }
        zq localzq1 = new zq(f9, f7, f8, f3);
        zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
        if (localzq1.g() < paramzp.d())
        {
          localzq1.d(localzq1.i() - (paramzp.d() - localzq1.g()));
          localzq1.b(paramzp.d());
        }
        if (localzq1.m() > paramzp.j() + 1) {
          localzq1.d(localzq1.i() - (localzq1.m() - paramzp.j()));
        }
        if ((localzq1.l() >= paramzp.c()) && (localzq1.j() <= paramzp.i()))
        {
          if (localzq1.f() < paramzp.c())
          {
            localzq1.c(localzq1.h() - (paramzp.c() - localzq1.f()));
            localzq1.a(paramzp.c());
          }
          else if (localzq1.l() > paramzp.i())
          {
            localzq1.c(localzq1.h() - (localzq1.l() - paramzp.i()));
          }
          if (localzq1.i() + 1.0F >= (f3 - 1.0F) / 3.0F)
          {
            if (i11 == 0) {
              a(paramzr, localzke1, localzq1, paramzje.g(paramzbfc.ax()).a(i9), paramFloat, localzbs1);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq2.f() + localzq2.h() / 2.0F < paramFloat) {
              bool = false;
            } else if (d4 != 0.0D) {
              bool = true;
            } else if (localzbs1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i9);
            arrayOfObject[1] = Integer.valueOf(i5);
            arrayOfObject[2] = localzq2;
            arrayOfObject[3] = Boolean.valueOf(bool);
            if (!localzke1.a()) {
              zf.a(localArrayList2, arrayOfObject);
            }
            if (paramzbfc.X())
            {
              zf.a(localArrayList4, localzq1);
              zf.a(localArrayList4, Boolean.valueOf(bool));
            }
          }
        }
      }
      ArrayList[] arrayOfArrayList = { localArrayList3 };
      a(paramzr, paramzbfc, arrayOfArrayList, localArrayList4);
      localArrayList3 = arrayOfArrayList[0];
    }
    return localArrayList2;
  }
  
  static void a(zr paramzr, zje paramzje, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    if (localzbs2.k() == 2)
    {
      a(paramzr, paramzje, paramFloat, paramDouble);
      return;
    }
    ArrayList localArrayList1 = new ArrayList();
    float f1 = paramzje.N().i() / paramInt;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f2 = paramzje.N().a(true, paramInt, i);
    float f3 = paramzje.N().k();
    float f4 = f2 * paramzje.o() / 100.0F;
    for (int j = 0; j < paramInt; j++)
    {
      ArrayList localArrayList2 = localzbfe.j();
      for (int k = 0; k < localArrayList2.size(); k++)
      {
        zbfc localzbfc = (zbfc)localArrayList2.get(k);
        int m = localzbfc.ai();
        float f5 = k * f2;
        float f6 = f1 * j + f4 / 2.0F + f5;
        f6 = paramzje.N().f() - f6;
        zkg localzkg = localzbfc.D();
        int n = j;
        if (localzbs2.p()) {
          n = paramInt - 1 - n;
        }
        zke localzke = localzkg.b(n);
        if ((localzke != null) && (!localzke.a()) && (!localzke.J()))
        {
          double d3 = localzbs1.g(localzke.w());
          float f7 = (float)((d3 - paramDouble) / (d1 - d2) * paramzje.N().g());
          if (localzbs1.p()) {
            f7 = -f7;
          }
          a(paramzr, localzke, paramzje, f6, f2, f3, paramFloat, f7, NaN.0D);
          zo localzo = a(paramzje, f6, f2, f3, paramFloat, f7);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(m);
          arrayOfObject[1] = Integer.valueOf(n);
          arrayOfObject[2] = localzo;
          zf.a(localArrayList1, arrayOfObject);
        }
      }
    }
    a(paramzr, paramzje, localArrayList1);
  }
  
  private static void a(zr paramzr, zje paramzje, float paramFloat, double paramDouble)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    zbyu localzbyu = paramzje.N();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    ArrayList localArrayList1 = new ArrayList();
    int j = (int)localzbs2.z();
    int k = (int)localzbs2.D();
    int m = localzbs2.j();
    int n = zbu.a(m, j, k, paramzje.U()) + 1;
    float f1 = localzbyu.i() / n;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f2 = paramzje.N().a(true, n, i);
    float f3 = paramzje.N().k();
    float f4 = f2 * paramzje.o() / 100.0F;
    ArrayList localArrayList2 = ziy.a(paramzje.z().c(), paramzje.U());
    int i1 = localArrayList2.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i2)));
      i3 = zbu.a(m, i3, paramzje.U());
      int i4 = zbu.a(m, i3, (int)localzbs2.D(), paramzje.U());
      float f5 = f1 * i4;
      float f6 = f5 + f4 / 2.0F;
      f6 = paramzje.N().f() - f6 + f2;
      ArrayList localArrayList3 = localzbfe.j();
      for (int i5 = 0; i5 < localArrayList3.size(); i5++)
      {
        zbfc localzbfc = (zbfc)localArrayList3.get(i5);
        int i6 = localzbfc.ai();
        float f7 = f2;
        f6 -= f7;
        zkg localzkg = localzbfc.D();
        int i7 = i2;
        if (localzbs2.p()) {
          i7 = i1 - 1 - i7;
        }
        zke localzke = localzkg.b(i7);
        if ((localzke != null) && (!localzke.a()) && (!localzke.J()))
        {
          double d3 = localzbs1.g(localzke.w());
          float f8 = (float)((d3 - paramDouble) / (d1 - d2) * paramzje.N().g());
          if (localzbs1.p()) {
            f8 = -f8;
          }
          a(paramzr, localzke, paramzje, f6, f2, f3, paramFloat, f8, NaN.0D);
          zo localzo = a(paramzje, f6, f2, f3, paramFloat, f8);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(i6);
          arrayOfObject[1] = Integer.valueOf(i7);
          arrayOfObject[2] = localzo;
          zf.a(localArrayList1, arrayOfObject);
        }
      }
    }
    a(paramzr, paramzje, localArrayList1);
  }
  
  static void a(zr paramzr, zje paramzje, double paramDouble, int paramInt)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    float f1 = 0.0F;
    if (paramzje.E().p()) {
      f1 = paramzje.N().e() + (float)Math.abs(localzbs1.z() / (float)(localzbs1.z() - localzbs1.D())) * paramzje.N().g();
    } else {
      f1 = paramzje.N().e() + (float)Math.abs(localzbs1.D() / (float)(localzbs1.z() - localzbs1.D())) * paramzje.N().g();
    }
    if (localzbs2.k() == 2)
    {
      b(paramzr, paramzje, f1, paramDouble);
      return;
    }
    ArrayList localArrayList1 = new ArrayList();
    float f2 = paramzje.N().i() / paramInt;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f3 = paramzje.N().a(true, paramInt, 1);
    float f4 = paramzje.N().k();
    float f5 = f3 * paramzje.o() / 100.0F;
    for (int i = 0; i < paramInt; i++)
    {
      ArrayList localArrayList2 = new ArrayList();
      ArrayList localArrayList3 = localzbfe.j();
      Object localObject;
      for (int j = 0; j < localArrayList3.size(); j++)
      {
        localObject = (zbfc)localArrayList3.get(j);
        int k = ((zbfc)localObject).ai();
        float f6 = f2 * i + f5 / 2.0F;
        f6 = paramzje.N().f() - f6;
        zkg localzkg = ((zbfc)localObject).D();
        int m = i;
        if (localzbs2.p()) {
          m = paramInt - 1 - m;
        }
        zke localzke2 = localzkg.b(m);
        int n = j;
        if ((localzke2 != null) && (!localzke2.a()) && (!localzke2.J()))
        {
          double d3 = localzke2.w();
          double d4 = 0.0D;
          double[] arrayOfDouble1 = { d3 };
          double[] arrayOfDouble2 = { d4 };
          boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList3, n, m, localzbs1.z(), localzbs1.D());
          d3 = arrayOfDouble1[0];
          d4 = arrayOfDouble2[0];
          if (bool)
          {
            float f7 = (float)(d3 / (d1 - d2) * paramzje.N().g());
            float f8 = (float)(d4 / (d1 - d2) * paramzje.N().g());
            float f9;
            if (localzbs1.p())
            {
              f9 = f1 - (f8 - f7);
              f7 = -f7;
            }
            else
            {
              f9 = f1 + (f8 - f7);
            }
            float f10 = f9 + f7;
            if (f9 < paramzje.N().e()) {
              f9 = paramzje.N().e();
            }
            if (f9 > paramzje.N().e() + paramzje.N().g()) {
              f9 = paramzje.N().e() + paramzje.N().g();
            }
            if (f10 < paramzje.N().e()) {
              f10 = paramzje.N().e();
            }
            if (f10 > paramzje.N().e() + paramzje.N().g()) {
              f10 = paramzje.N().e() + paramzje.N().g();
            }
            f7 = f10 - f9;
            Object[] arrayOfObject1 = new Object[5];
            arrayOfObject1[0] = localzke2;
            arrayOfObject1[1] = Float.valueOf(f6);
            arrayOfObject1[2] = Float.valueOf(f9);
            arrayOfObject1[3] = Float.valueOf(f7);
            arrayOfObject1[4] = Double.valueOf(d4);
            a(d3, arrayOfObject1, localArrayList2, localzbs1);
            zo localzo = b(paramzje, f6, f3, f4, f9, f7);
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(k);
            arrayOfObject2[1] = Integer.valueOf(m);
            arrayOfObject2[2] = localzo;
            zf.a(localArrayList1, arrayOfObject2);
          }
        }
      }
      for (j = 0; j < localArrayList2.size(); j++)
      {
        localObject = (Object[])localArrayList2.get(j);
        zke localzke1 = (zke)localObject[0];
        a(paramzr, localzke1, paramzje, ((Float)localObject[1]).floatValue(), f3, f4, ((Float)localObject[2]).floatValue(), ((Float)localObject[3]).floatValue(), ((Double)localObject[4]).doubleValue());
      }
      localArrayList2.clear();
    }
    a(paramzr, paramzje, localArrayList1);
  }
  
  private static void b(zr paramzr, zje paramzje, float paramFloat, double paramDouble)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    ArrayList localArrayList1 = new ArrayList();
    int j = (int)localzbs2.z();
    int k = (int)localzbs2.D();
    int m = localzbs2.j();
    int n = zbu.a(m, j, k, paramzje.U()) + 1;
    float f1 = paramzje.N().i() / n;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f2 = paramzje.N().a(true, n, 1);
    float f3 = paramzje.N().k();
    float f4 = f2 * paramzje.o() / 100.0F;
    ArrayList localArrayList2 = ziy.a(paramzje.z().c(), paramzje.U());
    int i1 = localArrayList2.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      ArrayList localArrayList3 = new ArrayList();
      int i3 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i2)));
      i3 = zbu.a(m, i3, paramzje.U());
      int i4 = zbu.a(m, i3, (int)localzbs2.D(), paramzje.U());
      float f5 = f1 * i4;
      float f6 = f5 + f4 / 2.0F;
      f6 = paramzje.N().f() - f6;
      ArrayList localArrayList4 = localzbfe.j();
      Object localObject;
      for (int i5 = 0; i5 < localArrayList4.size(); i5++)
      {
        localObject = (zbfc)localArrayList4.get(i5);
        int i6 = ((zbfc)localObject).ai();
        zkg localzkg = ((zbfc)localObject).D();
        int i7 = i2;
        if (localzbs2.p()) {
          i7 = i1 - 1 - i7;
        }
        zke localzke2 = localzkg.b(i7);
        int i8 = i5;
        if ((localzke2 != null) && (!localzke2.a()) && (!localzke2.J()))
        {
          double d3 = localzke2.w();
          double d4 = 0.0D;
          double[] arrayOfDouble1 = { d3 };
          double[] arrayOfDouble2 = { d4 };
          boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList4, i8, i7, localzbs1.z(), localzbs1.D());
          d3 = arrayOfDouble1[0];
          d4 = arrayOfDouble2[0];
          if (bool)
          {
            float f7 = (float)(d3 / (d1 - d2) * paramzje.N().g());
            float f8 = (float)(d4 / (d1 - d2) * paramzje.N().g());
            float f9;
            if (localzbs1.p())
            {
              f9 = paramFloat - (f8 - f7);
              f7 = -f7;
            }
            else
            {
              f9 = paramFloat + (f8 - f7);
            }
            float f10 = f9 + f7;
            if (f9 < paramzje.N().e()) {
              f9 = paramzje.N().e();
            }
            if (f9 > paramzje.N().e() + paramzje.N().g()) {
              f9 = paramzje.N().e() + paramzje.N().g();
            }
            if (f10 < paramzje.N().e()) {
              f10 = paramzje.N().f();
            }
            if (f10 > paramzje.N().e() + paramzje.N().g()) {
              f10 = paramzje.N().e() + paramzje.N().g();
            }
            f7 = f10 - f9;
            Object[] arrayOfObject1 = new Object[5];
            arrayOfObject1[0] = localzke2;
            arrayOfObject1[1] = Float.valueOf(f6);
            arrayOfObject1[2] = Float.valueOf(f9);
            arrayOfObject1[3] = Float.valueOf(f7);
            arrayOfObject1[4] = Double.valueOf(d4);
            a(d3, arrayOfObject1, localArrayList3, localzbs1);
            zo localzo = b(paramzje, f6, f2, f3, f9, f7);
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i6);
            arrayOfObject2[1] = Integer.valueOf(i7);
            arrayOfObject2[2] = localzo;
            zf.a(localArrayList1, arrayOfObject2);
          }
        }
      }
      for (i5 = 0; i5 < localArrayList3.size(); i5++)
      {
        localObject = (Object[])localArrayList3.get(i5);
        zke localzke1 = (zke)localObject[0];
        a(paramzr, localzke1, paramzje, ((Float)localObject[1]).floatValue(), f2, f3, ((Float)localObject[2]).floatValue(), ((Float)localObject[3]).floatValue(), ((Double)localObject[4]).doubleValue());
      }
      localArrayList3.clear();
    }
    a(paramzr, paramzje, localArrayList1);
  }
  
  static void b(zr paramzr, zje paramzje, double paramDouble, int paramInt)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    float f1 = 0.0F;
    if (paramzje.E().p()) {
      f1 = paramzje.N().e() + (float)Math.abs(localzbs1.z() / (float)(localzbs1.z() - localzbs1.D())) * paramzje.N().g();
    } else {
      f1 = paramzje.N().e() + paramzje.N().g() - (float)Math.abs(localzbs1.z() / (float)(localzbs1.z() - localzbs1.D())) * paramzje.N().g();
    }
    if (localzbs2.k() == 2)
    {
      c(paramzr, paramzje, f1, paramDouble);
      return;
    }
    ArrayList localArrayList1 = new ArrayList();
    float f2 = paramzje.N().i() / paramInt;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f3 = paramzje.N().a(true, paramInt, 1);
    float f4 = paramzje.N().k();
    float f5 = f3 * paramzje.o() / 100.0F;
    for (int i = 0; i < paramInt; i++)
    {
      ArrayList localArrayList2 = new ArrayList();
      ArrayList localArrayList3 = localzbfe.j();
      Object localObject;
      for (int j = 0; j < localArrayList3.size(); j++)
      {
        localObject = (zbfc)localArrayList3.get(j);
        int k = ((zbfc)localObject).ai();
        float f6 = f2 * i + f5 / 2.0F;
        f6 = paramzje.N().f() - f6;
        zkg localzkg = ((zbfc)localObject).D();
        int m = i;
        if (localzbs2.p()) {
          m = paramInt - 1 - m;
        }
        zke localzke2 = localzkg.b(m);
        int n = j;
        if ((localzke2 != null) && (!localzke2.a()) && (!localzke2.J()))
        {
          double d3 = zkn.a(localArrayList3, m);
          if (d3 != 0.0D)
          {
            double d4 = localzke2.w();
            double d5 = d4;
            double[] arrayOfDouble1 = { d4 };
            double[] arrayOfDouble2 = { d5 };
            boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList3, n, m, localzbs1, d3);
            d4 = arrayOfDouble1[0];
            d5 = arrayOfDouble2[0];
            if (bool)
            {
              float f7 = (float)(d4 * 100.0D / d3 / (d1 - d2) * paramzje.N().g());
              float f8 = (float)(d5 * 100.0D / d3 / (d1 - d2) * paramzje.N().g());
              float f9;
              if (localzbs1.p())
              {
                f9 = f1 - (f8 - f7);
                f7 = -f7;
              }
              else
              {
                f9 = f1 + (f8 - f7);
              }
              float f10 = f9 + f7;
              if (f9 < paramzje.N().e()) {
                f9 = paramzje.N().e();
              }
              if (f9 > paramzje.N().e() + paramzje.N().g()) {
                f9 = paramzje.N().e() + paramzje.N().g();
              }
              if (f10 < paramzje.N().e()) {
                f10 = paramzje.N().e();
              }
              if (f10 > paramzje.N().e() + paramzje.N().g()) {
                f10 = paramzje.N().e() + paramzje.N().g();
              }
              f7 = f10 - f9;
              Object[] arrayOfObject1 = new Object[5];
              arrayOfObject1[0] = localzke2;
              arrayOfObject1[1] = Float.valueOf(f6);
              arrayOfObject1[2] = Float.valueOf(f9);
              arrayOfObject1[3] = Float.valueOf(f7);
              arrayOfObject1[4] = Double.valueOf(d5);
              a(d4, arrayOfObject1, localArrayList2, localzbs1);
              zo localzo = b(paramzje, f6, f3, f4, f9, f7);
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(k);
              arrayOfObject2[1] = Integer.valueOf(m);
              arrayOfObject2[2] = localzo;
              zf.a(localArrayList1, arrayOfObject2);
            }
          }
        }
      }
      for (j = 0; j < localArrayList2.size(); j++)
      {
        localObject = (Object[])localArrayList2.get(j);
        zke localzke1 = (zke)localObject[0];
        a(paramzr, localzke1, paramzje, ((Float)localObject[1]).floatValue(), f3, f4, ((Float)localObject[2]).floatValue(), ((Float)localObject[3]).floatValue(), ((Double)localObject[4]).doubleValue());
      }
      localArrayList2.clear();
    }
    a(paramzr, paramzje, localArrayList1);
  }
  
  private static void c(zr paramzr, zje paramzje, float paramFloat, double paramDouble)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    ArrayList localArrayList1 = new ArrayList();
    int i = (int)localzbs2.z();
    int j = (int)localzbs2.D();
    int k = localzbs2.j();
    int m = zbu.a(k, i, j, paramzje.U()) + 1;
    float f1 = paramzje.N().i() / m;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f2 = paramzje.N().a(true, m, 1);
    float f3 = paramzje.N().k();
    float f4 = f2 * paramzje.o() / 100.0F;
    ArrayList localArrayList2 = ziy.a(paramzje.z().c(), paramzje.U());
    int n = localArrayList2.size();
    for (int i1 = 0; i1 < n; i1++)
    {
      ArrayList localArrayList3 = new ArrayList();
      int i2 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i1)));
      i2 = zbu.a(k, i2, paramzje.U());
      int i3 = zbu.a(k, i2, (int)localzbs2.D(), paramzje.U());
      float f5 = f1 * i3;
      float f6 = f5 + f4 / 2.0F;
      f6 = paramzje.N().f() - f6;
      ArrayList localArrayList4 = localzbfe.j();
      Object localObject;
      for (int i4 = 0; i4 < localArrayList4.size(); i4++)
      {
        localObject = (zbfc)localArrayList4.get(i4);
        int i5 = ((zbfc)localObject).ai();
        zkg localzkg = ((zbfc)localObject).D();
        int i6 = i1;
        if (localzbs2.p()) {
          i6 = n - 1 - i6;
        }
        zke localzke2 = localzkg.b(i6);
        int i7 = i4;
        if ((localzke2 != null) && (!localzke2.a()) && (!localzke2.J()))
        {
          double d3 = zkn.a(localArrayList4, i6);
          if (d3 != 0.0D)
          {
            double d4 = localzke2.w();
            double d5 = d4;
            double[] arrayOfDouble1 = { d4 };
            double[] arrayOfDouble2 = { d5 };
            boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList4, i7, i6, localzbs1, d3);
            d4 = arrayOfDouble1[0];
            d5 = arrayOfDouble2[0];
            if (bool)
            {
              float f7 = (float)(d4 * 100.0D / d3 / (d1 - d2) * paramzje.N().g());
              float f8 = (float)(d5 * 100.0D / d3 / (d1 - d2) * paramzje.N().g());
              float f9;
              if (localzbs1.p())
              {
                f9 = paramFloat - (f8 - f7);
                f7 = -f7;
              }
              else
              {
                f9 = paramFloat + (f8 - f7);
              }
              float f10 = f9 + f7;
              if (f9 < paramzje.N().e()) {
                f9 = paramzje.N().e();
              }
              if (f9 > paramzje.N().e() + paramzje.N().g()) {
                f9 = paramzje.N().e() + paramzje.N().g();
              }
              if (f10 < paramzje.N().e()) {
                f10 = paramzje.N().f();
              }
              if (f10 > paramzje.N().e() + paramzje.N().g()) {
                f10 = paramzje.N().e() + paramzje.N().g();
              }
              f7 = f10 - f9;
              Object[] arrayOfObject1 = new Object[5];
              arrayOfObject1[0] = localzke2;
              arrayOfObject1[1] = Float.valueOf(f6);
              arrayOfObject1[2] = Float.valueOf(f9);
              arrayOfObject1[3] = Float.valueOf(f7);
              arrayOfObject1[4] = Double.valueOf(d5);
              a(d4, arrayOfObject1, localArrayList3, localzbs1);
              zo localzo = b(paramzje, f6, f2, f3, f9, f7);
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(i5);
              arrayOfObject2[1] = Integer.valueOf(i6);
              arrayOfObject2[2] = localzo;
              zf.a(localArrayList1, arrayOfObject2);
            }
          }
        }
      }
      for (i4 = 0; i4 < localArrayList3.size(); i4++)
      {
        localObject = (Object[])localArrayList3.get(i4);
        zke localzke1 = (zke)localObject[0];
        a(paramzr, localzke1, paramzje, ((Float)localObject[1]).floatValue(), f2, f3, ((Float)localObject[2]).floatValue(), ((Float)localObject[3]).floatValue(), ((Double)localObject[4]).doubleValue());
      }
      localArrayList3.clear();
    }
    a(paramzr, paramzje, localArrayList1);
  }
  
  private static void a(double paramDouble, Object[] paramArrayOfObject, ArrayList paramArrayList, zbs paramzbs)
  {
    zje localzje = paramzbs.c();
    float f1 = ((Float)paramArrayOfObject[2]).floatValue() + ((Float)paramArrayOfObject[3]).floatValue();
    if (paramArrayList.size() == 0) {
      zf.a(paramArrayList, paramArrayOfObject);
    } else {
      for (int i = 0; i < paramArrayList.size(); i++)
      {
        Object[] arrayOfObject = (Object[])paramArrayList.get(i);
        float f2 = ((Float)arrayOfObject[2]).floatValue() + ((Float)arrayOfObject[3]).floatValue();
        if (f1 < f2)
        {
          paramArrayList.add(i, paramArrayOfObject);
          break;
        }
        if (f1 == f2)
        {
          if (paramzbs.p())
          {
            if (paramDouble >= 0.0D)
            {
              paramArrayList.add(i, paramArrayOfObject);
              break;
            }
            paramArrayList.add(i + 1, paramArrayOfObject);
            break;
          }
          if (paramDouble < 0.0D)
          {
            paramArrayList.add(i, paramArrayOfObject);
            break;
          }
          paramArrayList.add(i + 1, paramArrayOfObject);
          break;
        }
        if (i == paramArrayList.size() - 1)
        {
          zf.a(paramArrayList, paramArrayOfObject);
          break;
        }
      }
    }
  }
  
  private static zo a(zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    float f1 = paramFloat4 + paramFloat5;
    float f3 = paramzje.N().j();
    float f2;
    int i;
    zo localzo1;
    if (f1 <= f3)
    {
      f2 = 2.0F * (f3 - f1);
      if (paramFloat4 > f1) {
        i = 0;
      } else {
        i = 3;
      }
      localzo1 = zlq.a(paramzje, paramFloat1, f2, paramFloat3, i);
    }
    else
    {
      if (paramFloat4 > f1) {
        i = 1;
      } else {
        i = 2;
      }
      f2 = 2.0F * (f1 - f3);
      localzo1 = zlq.a(paramzje, paramFloat1, f2, paramFloat3, i);
    }
    zo localzo2 = zlq.a(paramzje, paramFloat1, 1.0F, paramFloat3, 0);
    float f4 = paramFloat3 * (float)Math.sin(paramzje.p() * 3.141592653589793D / 180.0D);
    return new zo(localzo1.d(), localzo2.e() - (paramFloat2 + f4) / 2.0F);
  }
  
  private static zo b(zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    paramFloat4 += paramFloat5 / 2.0F;
    float f2 = paramzje.N().j();
    if (paramFloat4 <= f2)
    {
      f1 = 2.0F * (f2 - paramFloat4);
      return zlq.a(paramzje, paramFloat1 - paramFloat2 / 2.0F, f1, paramFloat3, 0);
    }
    float f1 = 2.0F * (paramFloat4 - f2);
    return zlq.a(paramzje, paramFloat1 - paramFloat2 / 2.0F, f1, paramFloat3, 1);
  }
  
  private static void a(zr paramzr, zje paramzje, ArrayList paramArrayList)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      zo localzo = (zo)arrayOfObject[2];
      zqx localzqx = localzbfe.c(j).w();
      zt localzt = zqz.a(paramzr, paramzje.e(), localzbfe, j, k, (int)paramzje.N().g());
      zq localzq = new zq(localzo.d() - localzt.b() / 2.0F, localzo.e() - localzt.c() / 2.0F, localzt.b(), localzt.c());
      localzqx.a().b = new com.aspose.cells.b.a.b.zp(zbxz.c(localzq.f()), zbxz.c(localzq.g()), zbxz.a(localzq.h()), zbxz.a(localzq.i()));
      localzqx.a().z();
      zqz.a(paramzr, paramzje.e(), localzbfe, j, k, localzq);
    }
  }
  
  private static void a(zr paramzr, zke paramzke, zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, double paramDouble)
    throws Exception
  {
    zbfc localzbfc = paramzke.g().a();
    double d1 = 1.0D;
    double d2 = 1.0D;
    double d3;
    double d4;
    double[] arrayOfDouble1;
    double[] arrayOfDouble2;
    switch (localzbfc.G())
    {
    case 0: 
      a(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 1: 
      if ((localzbfc.an()) || (localzbfc.aq()))
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlq.a(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzke.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzke.w())) / d4;
        }
      }
      else
      {
        d1 = 0.0D;
      }
      a(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 2: 
      if (localzbfc.an())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlq.b(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzke.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzke.w())) / d4;
        }
      }
      else if (localzbfc.aq())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlq.a(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzke.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzke.w())) / d4;
        }
      }
      else
      {
        d1 = (float)zlq.a(paramzke);
        d2 = 1.0D;
      }
      a(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 3: 
      b(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 4: 
      if ((localzbfc.an()) || (localzbfc.aq()))
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlq.a(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzke.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzke.w())) / d4;
        }
      }
      else
      {
        d1 = 0.0D;
      }
      b(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 5: 
      if (localzbfc.an())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlq.b(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzke.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzke.w())) / d4;
        }
      }
      else if (localzbfc.aq())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlq.a(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzke.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzke.w())) / d4;
        }
      }
      else
      {
        d1 = (float)zlq.a(paramzke);
        d2 = 1.0D;
      }
      b(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
    }
  }
  
  private static void a(zr paramzr, zke paramzke, zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
    throws Exception
  {
    zay localzay = paramzke.i();
    zo[] arrayOfzo = new zo[8];
    zbxz.a(arrayOfzo);
    float f2 = paramzje.N().j();
    float f3 = paramFloat4;
    int i = 3;
    zo localzo = zo.a();
    float f4 = paramFloat3 * paramFloat7;
    float f5 = paramFloat2 * paramFloat7;
    float f6 = paramFloat1 - paramFloat2 * (1.0F - paramFloat7) / 2.0F;
    for (int j = 0; j < 2; j++)
    {
      float f1;
      if (f3 <= f2)
      {
        f1 = 2.0F * (f2 - f3);
        arrayOfzo[j] = zlq.a(paramzje, f6, f1, f4, 0);
        arrayOfzo[(j + 4)].a(arrayOfzo[j].d());
        arrayOfzo[(j + 4)].b(arrayOfzo[j].e() - f5);
        arrayOfzo[(j + i)] = zlq.a(paramzje, f6, f1, f4, 3);
        arrayOfzo[(j + i + 4)].a(arrayOfzo[(j + i)].d());
        arrayOfzo[(j + i + 4)].b(arrayOfzo[(j + i)].e() - f5);
      }
      else
      {
        f1 = 2.0F * (f3 - f2);
        arrayOfzo[j] = zlq.a(paramzje, f6, f1, f4, 1);
        arrayOfzo[(j + 4)].a(arrayOfzo[j].d());
        arrayOfzo[(j + 4)].b(arrayOfzo[j].e() - f5);
        arrayOfzo[(j + i)] = zlq.a(paramzje, f6, f1, f4, 2);
        arrayOfzo[(j + i + 4)].a(arrayOfzo[(j + i)].d());
        arrayOfzo[(j + i + 4)].b(arrayOfzo[(j + i)].e() - f5);
      }
      i = 1;
      f3 += paramFloat5;
      f6 = paramFloat1 - paramFloat2 * (1.0F - paramFloat6) / 2.0F;
      f4 = paramFloat3 * paramFloat6;
      f5 = paramFloat2 * paramFloat6;
    }
    zf.a(paramzke.b, new zo(arrayOfzo[0].d(), arrayOfzo[0].e()));
    zf.a(paramzke.b, new zo(arrayOfzo[1].d(), arrayOfzo[1].e()));
    zf.a(paramzke.b, new zo(arrayOfzo[2].d(), arrayOfzo[2].e()));
    zf.a(paramzke.b, new zo(arrayOfzo[3].d(), arrayOfzo[3].e()));
    zf.a(paramzke.c, new zo(arrayOfzo[4].d(), arrayOfzo[4].e()));
    zf.a(paramzke.c, new zo(arrayOfzo[5].d(), arrayOfzo[5].e()));
    zf.a(paramzke.c, new zo(arrayOfzo[6].d(), arrayOfzo[6].e()));
    zf.a(paramzke.c, new zo(arrayOfzo[7].d(), arrayOfzo[7].e()));
    com.aspose.cells.a.d.zs localzs = zanv.a(paramzke.k());
    try
    {
      ze localze1;
      com.aspose.cells.b.a.b.zc localzc1;
      if (paramFloat5 != 0.0F)
      {
        localze1 = new ze();
        localze1.b(new zo[] { arrayOfzo[0], arrayOfzo[1], arrayOfzo[5], arrayOfzo[4] });
        localzc1 = zbd.a(localzay, zn.a(localze1));
        try
        {
          paramzr.a(localzc1, localze1);
        }
        finally {}
        ze localze2 = new ze();
        localze2.b(new zo[] { arrayOfzo[4], arrayOfzo[5], arrayOfzo[6], arrayOfzo[7] });
        com.aspose.cells.b.a.b.zc localzc2 = zbd.a(localzay, zn.a(localze2), 0.6666667F);
        try
        {
          paramzr.a(localzc2, localze2);
        }
        finally {}
        paramzr.a(localzs, localze1);
        paramzr.a(localzs, localze2);
      }
      if (paramFloat5 > 0.0F)
      {
        localze1 = new ze();
        localze1.b(new zo[] { arrayOfzo[1], arrayOfzo[2], arrayOfzo[6], arrayOfzo[5] });
        localzc1 = zbd.a(localzay, zn.a(localze1), 0.5F);
        try
        {
          paramzr.a(localzc1, localze1);
        }
        finally {}
        paramzr.a(localzs, localze1);
      }
      else if (paramFloat5 < 0.0F)
      {
        localze1 = new ze();
        localze1.b(new zo[] { arrayOfzo[0], arrayOfzo[3], arrayOfzo[7], arrayOfzo[4] });
        localzc1 = zbd.a(localzay, zn.a(localze1), 0.0F);
        try
        {
          paramzr.a(localzc1, localze1);
        }
        finally {}
        paramzr.a(localzs, localze1);
      }
      else
      {
        localze1 = new ze();
        localze1.b(new zo[] { arrayOfzo[0], arrayOfzo[3], arrayOfzo[7], arrayOfzo[4] });
        localzc1 = zbd.a(localzay, zn.a(localze1), 0.5F);
        try
        {
          paramzr.a(localzc1, localze1);
        }
        finally {}
        paramzr.a(localzs, localze1);
      }
    }
    finally
    {
      if (localzs != null) {
        localzs.s();
      }
    }
  }
  
  private static void b(zr paramzr, zke paramzke, zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
    throws Exception
  {
    zay localzay = paramzke.i();
    float f1 = paramFloat4;
    float f3 = paramzje.N().j();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    float f4 = paramFloat1 - paramFloat2 / 2.0F;
    for (int i = 0; i <= 90; i++)
    {
      double d = i * 3.141592653589793D / 180.0D;
      float f5 = (float)(paramFloat3 * paramFloat7 * Math.cos(d));
      float f6 = (float)(f4 - paramFloat2 * paramFloat7 / 2.0F * Math.sin(d));
      float f7 = (float)(f4 + paramFloat2 * paramFloat7 / 2.0F * Math.sin(d));
      float f2;
      if (f1 <= f3)
      {
        f2 = 2.0F * (f3 - f1);
        if (!localHashMap1.containsKey(Integer.valueOf(180 - i))) {
          localHashMap1.put(Integer.valueOf(180 - i), zlq.a(paramzje, f6, f2, f5, 0));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(180 + i))) {
          localHashMap1.put(Integer.valueOf(180 + i), zlq.a(paramzje, f7, f2, f5, 0));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(i))) {
          localHashMap1.put(Integer.valueOf(i), zlq.a(paramzje, f6, f2, f5, 3));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(360 - i))) {
          localHashMap1.put(Integer.valueOf(360 - i), zlq.a(paramzje, f7, f2, f5, 3));
        }
      }
      else
      {
        f2 = 2.0F * (f1 - f3);
        if (!localHashMap1.containsKey(Integer.valueOf(180 - i))) {
          localHashMap1.put(Integer.valueOf(180 - i), zlq.a(paramzje, f6, f2, f5, 1));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(180 + i))) {
          localHashMap1.put(Integer.valueOf(180 + i), zlq.a(paramzje, f7, f2, f5, 1));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(i))) {
          localHashMap1.put(Integer.valueOf(i), zlq.a(paramzje, f6, f2, f5, 2));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(360 - i))) {
          localHashMap1.put(Integer.valueOf(360 - i), zlq.a(paramzje, f7, f2, f5, 2));
        }
      }
      float f8 = f1 + paramFloat5;
      float f9 = (float)(paramFloat3 * paramFloat6 * Math.cos(d));
      f6 = (float)(f4 - paramFloat2 * paramFloat6 / 2.0F * Math.sin(d));
      f7 = (float)(f4 + paramFloat2 * paramFloat6 / 2.0F * Math.sin(d));
      if (f8 <= f3)
      {
        f2 = 2.0F * (f3 - f8);
        if (!localHashMap2.containsKey(Integer.valueOf(180 - i))) {
          localHashMap2.put(Integer.valueOf(180 - i), zlq.a(paramzje, f6, f2, f9, 0));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(180 + i))) {
          localHashMap2.put(Integer.valueOf(180 + i), zlq.a(paramzje, f7, f2, f9, 0));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(i))) {
          localHashMap2.put(Integer.valueOf(i), zlq.a(paramzje, f6, f2, f9, 3));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(360 - i))) {
          localHashMap2.put(Integer.valueOf(360 - i), zlq.a(paramzje, f7, f2, f9, 3));
        }
      }
      else
      {
        f2 = 2.0F * (f8 - f3);
        if (!localHashMap2.containsKey(Integer.valueOf(180 - i))) {
          localHashMap2.put(Integer.valueOf(180 - i), zlq.a(paramzje, f6, f2, f9, 1));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(180 + i))) {
          localHashMap2.put(Integer.valueOf(180 + i), zlq.a(paramzje, f7, f2, f9, 1));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(i))) {
          localHashMap2.put(Integer.valueOf(i), zlq.a(paramzje, f6, f2, f9, 2));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(360 - i))) {
          localHashMap2.put(Integer.valueOf(360 - i), zlq.a(paramzje, f7, f2, f9, 2));
        }
      }
    }
    for (i = 0; i < 360; i++)
    {
      zf.a(paramzke.c, localHashMap1.get(Integer.valueOf(i)));
      zf.a(paramzke.b, localHashMap2.get(Integer.valueOf(i)));
    }
    Object localObject1 = null;
    Object localObject2 = null;
    int j = 0;
    int k = 0;
    zo[] arrayOfzo1 = { localObject1 };
    zo[] arrayOfzo2 = { localObject2 };
    int[] arrayOfInt1 = { j };
    int[] arrayOfInt2 = { k };
    a(localHashMap1, arrayOfzo1, arrayOfzo2, arrayOfInt1, arrayOfInt2);
    localObject1 = arrayOfzo1[0];
    localObject2 = arrayOfzo2[0];
    j = arrayOfInt1[0];
    k = arrayOfInt2[0];
    Object localObject3 = null;
    Object localObject4 = null;
    int m = 0;
    int n = 0;
    zo[] arrayOfzo3 = { localObject3 };
    zo[] arrayOfzo4 = { localObject4 };
    int[] arrayOfInt3 = { m };
    int[] arrayOfInt4 = { n };
    a(localHashMap2, arrayOfzo3, arrayOfzo4, arrayOfInt3, arrayOfInt4);
    localObject3 = arrayOfzo3[0];
    localObject4 = arrayOfzo4[0];
    m = arrayOfInt3[0];
    n = arrayOfInt4[0];
    int i3;
    if (paramFloat5 != 0.0F)
    {
      int i1 = 90;
      int i2 = 270;
      float f10 = 0.5F;
      i3 = paramzje.p();
      float f11 = 7.5F;
      for (float f12 = i1 - i3; f12 <= i2 - i3; f12 += f11)
      {
        int i4 = (int)(f12 % 360.0F);
        Object localObject5 = (zo)localHashMap1.get(Integer.valueOf(i4));
        Object localObject6 = (zo)localHashMap2.get(Integer.valueOf(i4));
        if (f12 == i1 - i3)
        {
          localObject5 = localObject2;
          localObject6 = localObject4;
        }
        float f13 = f11;
        if (((f12 - i1 == 30.0F) && (i3 <= 30)) || (f12 - i1 == 75.0F) || ((f12 - i1 == 120.0F) && (i3 > 30))) {
          f13 = 2.0F * f11;
        }
        if ((f12 == i1 - i3) && (i3 % f11 != 0.0F)) {
          f13 = i3 % f11;
        }
        int i5 = f12 + f13 > i2 - i3 ? (i2 - i3) % 360 : (int)((f12 + f13) % 360.0F);
        Object localObject7 = (zo)localHashMap1.get(Integer.valueOf(i5));
        Object localObject8 = (zo)localHashMap2.get(Integer.valueOf(i5));
        if (f12 + f13 >= i2 - i3)
        {
          localObject7 = localObject1;
          localObject8 = localObject3;
        }
        ze localze3 = new ze();
        zo[] arrayOfzo7 = new zo[(int)f13 + 1];
        zbxz.a(arrayOfzo7);
        int i6 = 0;
        for (int i7 = (int)f12; i7 <= (int)f12 + (int)f13; i7++)
        {
          arrayOfzo7[i6] = ((zo)localHashMap1.get(Integer.valueOf(i7 % 360)));
          i6++;
        }
        localze3.a((zo)localObject5, (zo)localObject7);
        localze3.a((zo)localObject7, (zo)localObject8);
        zo[] arrayOfzo8 = new zo[(int)f13 + 1];
        zbxz.a(arrayOfzo8);
        i6 = 0;
        for (int i8 = (int)f12 + (int)f13; i8 >= (int)f12; i8--)
        {
          arrayOfzo8[i6] = ((zo)localHashMap2.get(Integer.valueOf(i8 % 360)));
          i6++;
        }
        localze3.a((zo)localObject8, (zo)localObject6);
        localze3.a((zo)localObject6, (zo)localObject5);
        if ((i3 >= 0) && (i3 <= 30))
        {
          if (f12 - i1 <= 30.0F) {
            f10 = 0.9166667F + 0.5F * ((f12 - i1) / 180.0F);
          } else {
            f10 = 1.0833334F - 0.5F * ((f12 - i1) / 180.0F);
          }
        }
        else if (f12 - i1 <= 120.0F) {
          f10 = 0.6666666F + 0.5F * ((f12 - i1) / 180.0F);
        } else {
          f10 = 1.3333334F - 0.5F * ((f12 - i1) / 180.0F);
        }
        if (f10 == 1.0F) {
          f10 -= 0.011111111F;
        }
        com.aspose.cells.b.a.b.zc localzc2 = zbd.a(localzay, zn.a(localze3), f10);
        try
        {
          paramzr.a(localzc2, localze3);
        }
        finally
        {
          if (localzc2 != null) {
            localzc2.f();
          }
        }
        f12 += f13 - f11;
      }
    }
    com.aspose.cells.a.d.zs localzs = zanv.a(paramzke.k());
    try
    {
      zo[] arrayOfzo5 = new zo[localHashMap1.size()];
      zo[] arrayOfzo6 = new zo[localHashMap2.size()];
      zbxz.a(arrayOfzo5);
      zbxz.a(arrayOfzo6);
      for (i3 = 0; i3 <= 360; i3++)
      {
        arrayOfzo5[i3] = ((zo)localHashMap1.get(Integer.valueOf(i3)));
        arrayOfzo6[i3] = ((zo)localHashMap2.get(Integer.valueOf(i3)));
      }
      ze localze1 = new ze();
      localze1.c(arrayOfzo5);
      ze localze2 = new ze();
      localze2.c(arrayOfzo6);
      if (paramzje.D() != 0)
      {
        com.aspose.cells.b.a.b.zc localzc1;
        if (paramFloat5 > 0.0F)
        {
          localzc1 = zbd.a(localzay, zn.a(localze2), 0.7F);
          try
          {
            paramzr.a(localzc1, localze2);
          }
          finally {}
          paramzr.a(localzs, localze2);
          zlq.a(paramzr, j, k, localHashMap1, localzs);
        }
        else if (paramFloat5 < 0.0F)
        {
          localzc1 = zbd.a(localzay, zn.a(localze2), 0.0F);
          try
          {
            paramzr.a(localzc1, localze1);
          }
          finally {}
          paramzr.a(localzs, localze1);
          zlq.a(paramzr, j, k, localHashMap2, localzs);
        }
        else
        {
          localzc1 = zbd.a(localzay, zn.a(localze2), 0.7F);
          try
          {
            paramzr.a(localzc1, localze1);
          }
          finally {}
          paramzr.a(localzs, localze1);
        }
      }
      else
      {
        paramzr.b(localzs, ((zo)localObject2).d(), ((zo)localObject2).e(), ((zo)localObject1).d(), ((zo)localObject1).e());
        paramzr.b(localzs, ((zo)localObject4).d(), ((zo)localObject4).e(), ((zo)localObject3).d(), ((zo)localObject3).e());
      }
      if (paramFloat5 != 0.0F)
      {
        paramzr.b(localzs, ((zo)localObject2).d(), ((zo)localObject2).e(), ((zo)localObject4).d(), ((zo)localObject4).e());
        paramzr.b(localzs, ((zo)localObject1).d(), ((zo)localObject1).e(), ((zo)localObject3).d(), ((zo)localObject3).e());
      }
    }
    finally
    {
      if (localzs != null) {
        localzs.s();
      }
    }
  }
  
  private static void a(HashMap paramHashMap, zo[] paramArrayOfzo1, zo[] paramArrayOfzo2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    paramArrayOfzo1[0] = zo.a();
    paramArrayOfzo2[0] = zo.a();
    paramArrayOfInt1[0] = 0;
    paramArrayOfInt2[0] = 0;
    com.aspose.cells.b.a.a.zc localzc = zg.a(paramHashMap);
    while (localzc.c())
    {
      zo localzo = (zo)localzc.b();
      if ((zo.a(paramArrayOfzo1[0], zo.a())) || (localzo.e() > paramArrayOfzo1[0].e()))
      {
        paramArrayOfzo1[0] = localzo;
        paramArrayOfInt1[0] = ((Integer)localzc.a()).intValue();
      }
      if ((zo.a(paramArrayOfzo2[0], zo.a())) || (localzo.e() < paramArrayOfzo2[0].e()))
      {
        paramArrayOfzo2[0] = localzo;
        paramArrayOfInt2[0] = ((Integer)localzc.a()).intValue();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */