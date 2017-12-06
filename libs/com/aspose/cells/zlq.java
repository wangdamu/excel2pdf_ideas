package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class zlq
{
  static ArrayList a(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    zje localzje = paramzbfc.v();
    zbfe localzbfe = localzje.z();
    int i = localzbfe.getCount();
    int k = paramzbfc.af();
    zbs localzbs2;
    zbs localzbs1;
    int j;
    if (k == 1)
    {
      localzbs2 = localzje.e();
      localzbs1 = localzje.E();
      j = localzbfe.e(1);
    }
    else
    {
      localzbs2 = localzje.g();
      localzbs1 = localzje.G();
      j = localzbfe.e(2);
    }
    if (localzbs2.k() == 2) {
      return a(paramzr, paramzbfc, paramzp, paramFloat, paramDouble);
    }
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f1 = 0.0F;
    float f2 = 1.5F;
    zbfc localzbfc = localzje.z().d(k);
    if (localzbfc != null)
    {
      f1 = localzbfc.K() / 100.0F;
      f2 = localzbfc.J() / 100.0F;
    }
    int m = 0;
    int n = paramInt;
    if (localzbs2.p) {
      n = (int)localzbs2.z();
    }
    if ((localzbs2.f()) || (localzje.u()))
    {
      m = n;
    }
    else
    {
      m = n - 1;
      if (m == 0) {
        m = 1;
      }
    }
    double d3 = paramzp.e() / m;
    int i1 = localzbfe.a(paramzbfc, k, new int[] { 14 });
    if (i1 == -1) {
      return localArrayList;
    }
    int i2 = paramzbfc.ai();
    zkg localzkg = paramzbfc.D();
    for (int i3 = 0; i3 < localzkg.getCount(); i3++)
    {
      zke localzke = localzkg.b(i3);
      float f3 = (float)d3 / (j - f1 * (j - 1) + f2);
      float f4 = f3 * f1;
      float f5 = f3 * f2;
      float f6 = i1 * (f3 - f4);
      float f7 = (float)d3 * i3 + f5 / 2.0F + f6;
      if ((!localzbs2.f()) && (!localzje.u())) {
        f7 -= (float)(d3 / 2.0D);
      }
      if (localzbs2.p()) {
        f7 = paramzp.c() + paramzp.e() - f7 - f3;
      } else {
        f7 = paramzp.c() + f7;
      }
      if ((localzke != null) && (!localzke.a()))
      {
        double d4 = localzke.w();
        float f8 = (float)((paramDouble - d4) / (d1 - d2) * paramzp.f());
        int i4 = 0;
        if (f8 == 0.0F) {
          i4 = 1;
        }
        zub localzub = paramzbfc.x();
        if ((localzub != null) && (localzub.d() != 2))
        {
          zo localzo = new zo(f7 + f3 / 2.0F, paramFloat);
          double d5 = 0.0D;
          double d6 = 0.0D;
          float f10 = 0.0F;
          float f11 = 0.0F;
          if (localzub != null)
          {
            switch (localzub.g())
            {
            case 1: 
              d5 = localzub.c();
              d6 = d5;
              break;
            case 2: 
              d5 = localzub.c() * d4 / 100.0D;
              d6 = -d5;
              break;
            case 0: 
              double d7 = localzub.e().size() > i3 ? localzub.a(localzub.e().get(i3)) : 0.0D;
              d5 = d7;
              d7 = localzub.f().size() > i3 ? localzub.a(localzub.f().get(i3)) : 0.0D;
              d6 = d7;
            }
            f10 = (float)d5 / (float)(d1 - d2) * paramzp.f();
            f11 = (float)d6 / (float)(d1 - d2) * paramzp.f();
            if (!localzbs1.p()) {
              localzo.b(localzo.e() + f8);
            } else {
              localzo.b(localzo.e() - f8);
            }
          }
          localzub.a(localzo, f10, f11);
        }
        float f9 = paramFloat;
        if (!localzbs1.p())
        {
          if (f8 < 0.0F)
          {
            f8 = -f8;
            f9 -= f8;
          }
        }
        else if (f8 < 0.0F) {
          f8 = -f8;
        } else {
          f9 -= f8;
        }
        zq localzq1 = new zq(f7, f9, f3, f8 + 1.0F);
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
          if (localzq1.h() + 1.0F >= (f3 - 1.0F) / 3.0F)
          {
            if (i4 == 0) {
              a(paramzr, localzke, localzq1, localzje.g(paramzbfc.ax()).a(i2), paramFloat, localzbs1);
            }
            Object[] arrayOfObject = new Object[5];
            boolean bool;
            if (localzq2.g() + (localzq2.i() - 1.0F) / 2.0F < paramFloat) {
              bool = true;
            } else if (d4 != 0.0D) {
              bool = false;
            } else if (localzbs1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i2);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzq2;
            arrayOfObject[3] = localzbs2;
            arrayOfObject[4] = Boolean.valueOf(bool);
            com.aspose.cells.b.a.a.zf.a(localArrayList, arrayOfObject);
          }
        }
      }
    }
    return localArrayList;
  }
  
  private static ArrayList a(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble)
    throws Exception
  {
    zje localzje = paramzbfc.v();
    int i = localzje.z().getCount();
    zbfe localzbfe = localzje.z();
    int k = paramzbfc.af();
    float f1 = 0.0F;
    float f2 = 1.5F;
    zbfc localzbfc = localzje.z().d(k);
    if (localzbfc != null)
    {
      f1 = localzbfc.K() / 100.0F;
      f2 = localzbfc.J() / 100.0F;
    }
    zbs localzbs1;
    zbs localzbs2;
    int j;
    ArrayList localArrayList1;
    if (k == 1)
    {
      localzbs1 = localzje.e();
      localzbs2 = localzje.E();
      j = localzbfe.e(1);
      localArrayList1 = ziy.a(localzje.z().c(), paramzbfc.v().U());
    }
    else
    {
      localzbs1 = localzje.g();
      localzbs2 = localzje.G();
      j = localzbfe.e(2);
      localArrayList1 = ziy.a(localzje.z().d(), paramzbfc.v().U());
    }
    double d1 = localzbs2.n() ? zbxz.e(localzbs2.z()) : localzbs2.z();
    double d2 = localzbs2.n() ? zbxz.e(localzbs2.D()) : localzbs2.D();
    paramDouble = localzbs2.n() ? zbxz.e(paramDouble) : paramDouble;
    ArrayList localArrayList2 = new ArrayList();
    int m = localArrayList1.size();
    int n = localzbs1.j();
    int i1 = (int)localzbs1.D();
    int i2 = (int)localzbs1.z();
    int i3 = 0;
    if ((localzbs1.f()) || (localzje.u()))
    {
      i3 = zbu.a(n, i2, i1, paramzbfc.v().U()) + 1;
    }
    else
    {
      i3 = zbu.a(n, i2, i1, paramzbfc.v().U());
      if (i3 == 0) {
        i3 = 1;
      }
    }
    double d3 = paramzp.e() / i3;
    for (int i4 = 0; i4 < m; i4++)
    {
      zke localzke = paramzbfc.D().b(i4);
      float f3 = (float)(d3 / (j - f1 * (j - 1) + f2));
      float f4 = f3 * f1;
      float f5 = f3 * f2;
      int i5 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i4)));
      i5 = zbu.a(n, i5, paramzbfc.v().U());
      int i6 = zbu.a(n, i5, i1, paramzbfc.v().U());
      float f6 = (float)(d3 * i6);
      if ((!localzbs1.f()) && (!localzje.u())) {
        f6 -= (float)(d3 / 2.0D);
      }
      float f7 = 0.0F;
      if (localzbs1.p()) {
        f7 = paramzp.c() + paramzp.e() - f6 - f5 / 2.0F - f3 - 1.0F;
      } else {
        f7 = paramzp.c() + f6 + f5 / 2.0F + 1.0F;
      }
      int i7 = localzbfe.a(paramzbfc, k, new int[] { 14 });
      if (i7 == -1) {
        return localArrayList2;
      }
      int i8 = paramzbfc.ai();
      if (localzbs1.p()) {
        f7 -= i7 * (f3 - f4);
      } else {
        f7 += i7 * (f3 - f4);
      }
      if ((localzke != null) && (!localzke.a()))
      {
        double d4 = localzke.w();
        float f8 = (float)((paramDouble - d4) / (d1 - d2) * paramzp.f());
        int i9 = 0;
        if (f8 == 0.0F) {
          i9 = 1;
        }
        zub localzub = paramzbfc.x();
        if ((localzub != null) && (localzub.d() != 2))
        {
          zo localzo = new zo(f7 + f3 / 2.0F, paramFloat);
          double d5 = 0.0D;
          double d6 = 0.0D;
          float f10 = 0.0F;
          float f11 = 0.0F;
          if (localzub != null)
          {
            switch (localzub.g())
            {
            case 1: 
              d5 = localzub.c();
              d6 = d5;
              break;
            case 2: 
              d5 = localzub.c() * d4 / 100.0D;
              d6 = -d5;
              break;
            case 0: 
              double d7 = localzub.e().size() > i4 ? localzub.a(localzub.e().get(i4)) : 0.0D;
              d5 = d7;
              d7 = localzub.f().size() > i4 ? localzub.a(localzub.f().get(i4)) : 0.0D;
              d6 = d7;
            }
            f10 = (float)d5 / (float)(d1 - d2) * paramzp.f();
            f11 = (float)d6 / (float)(d1 - d2) * paramzp.f();
            if (!localzbs2.p()) {
              localzo.b(localzo.e() + f8);
            } else {
              localzo.b(localzo.e() - f8);
            }
          }
          localzub.a(localzo, f10, f11);
        }
        float f9 = paramFloat;
        if (!localzbs2.p())
        {
          if (f8 < 0.0F)
          {
            f8 = -f8;
            f9 -= f8;
          }
        }
        else if (f8 < 0.0F) {
          f8 = -f8;
        } else {
          f9 -= f8;
        }
        zq localzq1 = new zq(f7, f9, f3, f8 + 1.0F);
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
          if (localzq1.h() + 1.0F >= (f3 - 1.0F) / 3.0F)
          {
            if (i9 == 0) {
              a(paramzr, localzke, localzq1, localzje.g(paramzbfc.ax()).a(i8), paramFloat, localzbs2);
            }
            Object[] arrayOfObject = new Object[5];
            boolean bool;
            if (localzq2.g() < paramFloat) {
              bool = true;
            } else if (d4 != 0.0D) {
              bool = false;
            } else if (localzbs2.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i8);
            arrayOfObject[1] = Integer.valueOf(i4);
            arrayOfObject[2] = localzq2;
            arrayOfObject[3] = localzbs1;
            arrayOfObject[4] = Boolean.valueOf(bool);
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
          }
        }
      }
    }
    return localArrayList2;
  }
  
  private static void a(zr paramzr, zke paramzke, zq paramzq, Color paramColor, float paramFloat, zbs paramzbs)
    throws Exception
  {
    if ((paramzke.i().h() != 0) || (paramzke.k().e())) {
      paramzke.a(new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i()));
    }
    if (paramzq.h() < 10.0F) {
      paramzq.a((int)paramzq.f());
    }
    boolean bool1 = paramzke.g().a().A().a();
    if (!paramzke.i().a) {
      bool1 = paramzke.i().a();
    }
    boolean bool2 = false;
    if (((paramzq.m() - 2.0F > paramFloat) && (bool1) && (!paramzbs.p())) || ((paramzq.g() + 2.0F < paramFloat) && (bool1) && (paramzbs.p()))) {
      bool2 = true;
    }
    if (paramzke.i().h() != 0)
    {
      com.aspose.cells.b.a.b.zc localzc = zbd.a(paramzke.i(), paramzq, bool2);
      try
      {
        paramzq.b(paramzq.g() - 0.5F);
        paramzr.b(localzc, paramzq);
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
    }
    if ((paramzq.g() + paramzq.i() / 2.0F < paramFloat) && (paramzq.m() > paramFloat) && (paramzq.i() > paramzke.k().b().a() / 2.0D)) {
      paramzq.d(paramzq.i() - (float)paramzke.k().b().a() / 2.0F);
    }
    zanv.a(paramzr, paramzq, paramzke.k());
    int i = 0;
    if (paramzq.m() - 2.0F < paramFloat) {
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
        localze.b(paramzq.l() + k, paramzq.g() + j, paramzq.l() + k, paramzq.m() + k);
        if (i == 0) {
          localze.b(paramzq.f() + j, paramzq.m() + k, paramzq.l() + k, paramzq.m() + k);
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
  
  private static void a(zr paramzr, zjx paramzjx, zq paramzq)
    throws Exception
  {
    if (paramzjx.d().h() != 0)
    {
      com.aspose.cells.b.a.b.zc localzc = zbd.a(paramzjx.d(), paramzq);
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
    if (paramzjx.f().e())
    {
      if (paramzq.h() > paramzjx.f().b().a() / 2.0D) {
        paramzq.c(paramzq.h() - (float)paramzjx.f().b().a() / 2.0F);
      }
      if (paramzq.i() < 1.0F) {
        paramzq.d(1.0F);
      }
      zanv.a(paramzr, paramzq, paramzjx.f());
    }
  }
  
  static void a(zr paramzr, zje paramzje, ArrayList paramArrayList)
    throws Exception
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      zq localzq = (zq)arrayOfObject[2];
      zbs localzbs = (zbs)arrayOfObject[3];
      boolean bool = ((Boolean)arrayOfObject[4]).booleanValue();
      int m = (int)(paramzje.a() * 0.2F);
      a(paramzr, localzbs, j, k, localzq, bool, m);
    }
  }
  
  private static void a(zr paramzr, zbs paramzbs, int paramInt1, int paramInt2, zq paramzq, boolean paramBoolean, int paramInt3)
    throws Exception
  {
    zbfe localzbfe = paramzbs.c().z();
    zke localzke = localzbfe.c(paramInt1).D().b(paramInt2);
    zqx localzqx = localzke.o();
    zt localzt = zqz.a(paramzr, paramzbs, localzbfe, paramInt1, paramInt2, paramInt3);
    float f1 = paramzq.f() + paramzq.h() / 2.0F - localzt.b() / 2.0F;
    float f2 = 0.0F;
    int i = 0;
    int j = 0;
    int k = localzqx.j();
    if (k == 9) {
      k = zqz.b(localzbfe.a(paramInt1).m());
    }
    switch (k)
    {
    case 1: 
      f2 = paramzq.g() + paramzq.i() / 2.0F - localzt.c() / 2.0F;
      break;
    case 2: 
      if (paramBoolean)
      {
        f2 = paramzq.g() + paramzq.i() - localzt.c();
        i = -1;
        f2 += i;
      }
      else
      {
        f2 = paramzq.g();
        j = 5;
        f2 += j;
      }
      break;
    case 3: 
      if (paramBoolean)
      {
        f2 = paramzq.g();
        i = 5;
        f2 += i;
      }
      else
      {
        f2 = paramzq.g() + paramzq.i() - localzt.c();
        j = -1;
        f2 += j;
      }
      break;
    default: 
      if (paramBoolean)
      {
        f2 = paramzq.g() - localzt.c();
        i = -1;
        f2 += i;
      }
      else
      {
        f2 = paramzq.g() + paramzq.i();
        j = 5;
        f2 += j;
      }
      break;
    }
    if (localzbfe.c(paramInt1).b(new int[] { 14 })) {
      if (paramBoolean)
      {
        if (f2 + zqz.a + localzt.c() > paramzq.m()) {
          f2 -= f2 + zqz.a + localzt.c() - paramzq.m();
        }
      }
      else if (f2 < paramzq.g()) {
        f2 += paramzq.g() - f2;
      }
    }
    localzqx.a().b = new com.aspose.cells.b.a.b.zp(zbxz.c(f1), zbxz.c(f2), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
    localzqx.a().z();
    int m = 0;
    zo localzo = new zo(localzqx.a().a.c() + localzqx.a().a.e(), localzqx.a().a.d() + localzqx.a().a.f());
    if ((localzo.d() < 0.0F) || (localzo.d() > paramzbs.c().a()) || (localzo.e() < 0.0F) || (localzo.e() > paramzbs.c().b())) {
      m = 1;
    }
    if (m == 0) {
      zqz.a(paramzr, paramzbs, localzbfe, paramInt1, paramInt2, localzqx.a().a);
    }
  }
  
  static void a(zr paramzr, zbfc paramzbfc, List paramList, ArrayList paramArrayList, com.aspose.cells.a.d.zs paramzs, com.aspose.cells.b.a.b.zp paramzp)
  {
    zq localzq = paramzr.e();
    Object localObject1;
    for (int i = 0; i < paramList.size(); i++) {
      if (paramList.get(i) != null)
      {
        zo localzo1 = (zo)paramList.get(i);
        localObject1 = paramzbfc.D().b(((Integer)paramArrayList.get(i)).intValue());
        if (localObject1 != null) {
          ((zke)localObject1).a(new zq(localzo1.d(), localzo1.e(), 0.0F, 0.0F));
        }
        if (zanv.a(new zo(localzo1.d() / 10.0F, localzo1.e() / 10.0F), localzq)) {
          paramList.set(i, null);
        }
      }
    }
    if (paramList.size() < 2) {
      return;
    }
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(paramzp);
    int j = 0;
    if ((paramzbfc.m() == 39) || (paramzbfc.m() == 42) || (paramzbfc.m() == 38) || (paramzbfc.m() == 41)) {
      j = 1;
    }
    Object localObject2;
    int n;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    if (paramzbfc.E())
    {
      if (paramList.size() > 1)
      {
        localObject1 = paramList.get(0);
        localObject2 = new ArrayList();
        int k = 0;
        ArrayList localArrayList = new ArrayList();
        for (n = 0; n < paramList.size(); n++)
        {
          localObject5 = paramzbfc.D().b(((Integer)paramArrayList.get(n)).intValue());
          if ((n == paramList.size() - 1) && ((paramzbfc.m() == 57) || (paramzbfc.m() == 58))) {
            localObject5 = paramzbfc.D().b(0);
          }
          if (localObject5 == null)
          {
            if (((ArrayList)localObject2).size() > 1) {
              a(paramzr, paramzs, (List)localObject2, paramzp, k, n, localArrayList, paramzbfc);
            }
            ((ArrayList)localObject2).clear();
            localArrayList.clear();
          }
          else if ((localObject5 != null) && (j == 0) && ((((zke)localObject5).d()) || (((zke)localObject5).J()) || (((zke)localObject5).c())))
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(n));
          }
          else if (paramList.get(n) != null)
          {
            localObject6 = (zo)paramList.get(n);
            if (((ArrayList)localObject2).size() > 1)
            {
              localObject7 = (zo)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
              if ((Math.abs(((zo)localObject7).d() - ((zo)localObject6).d()) < 0.5F) && (Math.abs(((zo)localObject7).e() - ((zo)localObject6).e()) < 0.5F))
              {
                a(paramzr, paramzs, (List)localObject2, paramzp, k, n, localArrayList, paramzbfc);
                ((ArrayList)localObject2).clear();
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject6);
                continue;
              }
            }
            com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject6);
            if (((ArrayList)localObject2).size() == 1) {
              k = n;
            }
          }
          else
          {
            if (((ArrayList)localObject2).size() > 1) {
              a(paramzr, paramzs, (List)localObject2, paramzp, k, n, localArrayList, paramzbfc);
            }
            ((ArrayList)localObject2).clear();
            localArrayList.clear();
          }
        }
        if (((ArrayList)localObject2).size() > 1) {
          a(paramzr, paramzs, (List)localObject2, paramzp, k, paramList.size() - 1, localArrayList, paramzbfc);
        }
      }
    }
    else if (paramList.size() > 1)
    {
      localObject1 = new ArrayList();
      localObject2 = null;
      Object localObject3 = null;
      int m = 0;
      for (n = 0; n < paramList.size(); n++)
      {
        localObject5 = paramzbfc.D().b(((Integer)paramArrayList.get(n)).intValue());
        if ((localObject5 == null) || (j != 0) || ((!((zke)localObject5).d()) && (!((zke)localObject5).J()) && (!((zke)localObject5).c())))
        {
          localObject2 = paramList.get(n);
          if ((localObject2 == null) || (((zo)localObject2).d() >= 0.0F))
          {
            localObject3 = localObject5;
            if (localObject2 != null) {
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject2);
            }
            m = n + 1;
            break;
          }
        }
      }
      Object localObject4;
      for (m = 1; m < paramList.size(); m++)
      {
        localObject4 = paramList.get(m);
        localObject5 = paramzbfc.D().b(((Integer)paramArrayList.get(m)).intValue());
        if ((m == paramList.size() - 1) && ((paramzbfc.m() == 57) || (paramzbfc.m() == 58))) {
          localObject5 = paramzbfc.D().b(0);
        }
        if (((localObject5 == null) || (j != 0) || ((!((zke)localObject5).d()) && (!((zke)localObject5).J()) && (!((zke)localObject5).c()))) && ((localObject4 == null) || (((zo)localObject4).d() >= 0.0F))) {
          if ((localObject5 == null) || (localObject4 == null))
          {
            localObject2 = localObject4;
            if (((ArrayList)localObject1).size() > 1)
            {
              localObject6 = new ze();
              localObject7 = a((List)localObject1);
              a(paramzr, (zo[])localObject7, (zke)localObject3, paramzp);
            }
            ((ArrayList)localObject1).clear();
            localObject3 = localObject5;
          }
          else
          {
            if ((localObject3 != null) && (!((zke)localObject3).k().a(((zke)localObject5).k())) && (((ArrayList)localObject1).size() > 1))
            {
              localObject6 = new ze();
              localObject7 = a((List)localObject1);
              a(paramzr, (zo[])localObject7, (zke)localObject3, paramzp);
              localObject3 = localObject5;
              zo localzo2 = (zo)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 1);
              ((ArrayList)localObject1).clear();
              if (localObject4 != null)
              {
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localzo2);
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject4);
                continue;
              }
            }
            if (localObject4 != null) {
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject4);
            }
            localObject3 = localObject5;
          }
        }
      }
      if (((ArrayList)localObject1).size() > 1)
      {
        localObject4 = new ze();
        localObject5 = a((List)localObject1);
        a(paramzr, (zo[])localObject5, (zke)localObject3, paramzp);
      }
    }
    paramzr.a(localzf);
  }
  
  private static void a(zr paramzr, com.aspose.cells.a.d.zs paramzs, List paramList, com.aspose.cells.b.a.b.zp paramzp, int paramInt1, int paramInt2, ArrayList paramArrayList, zbfc paramzbfc)
  {
    float f1 = 0.3F;
    float f2 = 0.5F;
    int i = 3;
    Object localObject1;
    if (paramList.size() < i)
    {
      localObject1 = a(paramList);
      if (!paramzbfc.H())
      {
        if (localObject1.length <= 2) {
          paramzr.b(paramzs, (zo[])localObject1);
        } else {
          paramzr.a(paramzs, (zo[])localObject1, f2);
        }
      }
      else {
        a(paramzr, paramzbfc.D(), (zo[])localObject1, f2, paramInt1, paramInt2, paramArrayList);
      }
    }
    else
    {
      localObject1 = new ArrayList();
      int j = 0;
      int k = 0;
      int m = paramInt1;
      int n = paramInt2;
      int i1 = paramInt1;
      paramInt2 = paramInt1;
      for (int i2 = 0; i2 < paramList.size(); i2++)
      {
        zo localzo1 = (zo)paramList.get(i2);
        com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localzo1);
        if (((ArrayList)localObject1).size() == 1)
        {
          paramInt1 = paramInt2;
        }
        else
        {
          paramInt2++;
          while (paramArrayList.contains(Integer.valueOf(paramInt2))) {
            paramInt2++;
          }
        }
        if (((ArrayList)localObject1).size() >= 3)
        {
          zo localzo2 = (zo)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 3);
          zo localzo3 = (zo)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 2);
          float f3 = (localzo3.e() - localzo2.e()) / (localzo3.d() - localzo2.d());
          float f4 = (localzo1.e() - localzo3.e()) / (localzo1.d() - localzo3.d());
          float f5 = localzo3.e() - localzo2.e();
          float f6 = localzo1.e() - localzo3.e();
          double d = Math.abs(Math.abs(f4) - Math.abs(f3));
          if ((Math.abs(f4) < 2.0F) || (f6 / f5 < 8.0F)) {}
        }
        else
        {
          boolean bool1 = zanv.a(localzo1, paramzp);
          if (bool1)
          {
            if (k != 0)
            {
              int i3 = ((ArrayList)localObject1).size() - 1 - 1;
              i2++;
              Object localObject2;
              while (i2 < paramList.size())
              {
                localObject2 = (zo)paramList.get(i2);
                boolean bool2 = zanv.a((zo)localObject2, paramzp);
                if (!bool2) {
                  break;
                }
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject2);
                i2++;
              }
              i2--;
              if ((((ArrayList)localObject1).size() == 2) || (i3 == 0))
              {
                a(paramzr, paramzs, a((List)localObject1), f1, paramInt1, paramInt2, paramArrayList, paramzbfc);
                ((ArrayList)localObject1).clear();
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localzo1);
                paramInt1 = paramInt2;
                j = 0;
                k = 0;
              }
              else if (((ArrayList)localObject1).size() > 2)
              {
                localObject2 = a((List)localObject1, 0, i3);
                if (!paramzbfc.H())
                {
                  if (localObject2.length <= 2) {
                    paramzr.b(paramzs, (zo[])localObject2);
                  } else {
                    paramzr.a(paramzs, (zo[])localObject2, f2);
                  }
                }
                else {
                  a(paramzr, paramzbfc.D(), (zo[])localObject2, f2, paramInt1, paramInt1 + i3, paramArrayList);
                }
                a(paramzr, paramzs, a((List)localObject1, i3, ((ArrayList)localObject1).size() - 1), f1, paramInt1 + i3, paramInt2, paramArrayList, paramzbfc);
                ((ArrayList)localObject1).clear();
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localzo1);
                paramInt1 = paramInt2;
                j = 0;
                k = 0;
              }
            }
          }
          else if (j != 0)
          {
            a(paramzr, paramzs, a((List)localObject1), f1, paramInt1, paramInt2, paramArrayList, paramzbfc);
            ((ArrayList)localObject1).clear();
            com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localzo1);
            paramInt1 = paramInt2;
            j = 0;
            k = 0;
          }
          if (bool1) {
            j = 1;
          } else {
            k = 1;
          }
        }
      }
      if (((ArrayList)localObject1).size() > 1) {
        if (j != 0)
        {
          a(paramzr, paramzs, a((List)localObject1), f1, paramInt1, paramInt2, paramArrayList, paramzbfc);
        }
        else
        {
          zo[] arrayOfzo = a((List)localObject1);
          if (!paramzbfc.H())
          {
            if (arrayOfzo.length <= 2) {
              paramzr.b(paramzs, arrayOfzo);
            } else {
              paramzr.a(paramzs, arrayOfzo, f2);
            }
          }
          else {
            a(paramzr, paramzbfc.D(), arrayOfzo, f2, paramInt1, paramInt2, paramArrayList);
          }
        }
      }
    }
  }
  
  private static void a(zr paramzr, com.aspose.cells.a.d.zs paramzs, zo[] paramArrayOfzo, float paramFloat, int paramInt1, int paramInt2, ArrayList paramArrayList, zbfc paramzbfc)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    for (int i = 0; i < paramArrayOfzo.length; i++) {
      if (i == 0)
      {
        f1 = paramArrayOfzo[i].d();
        f2 = f1;
        f3 = paramArrayOfzo[i].e();
        f4 = f3;
      }
      else
      {
        if (paramArrayOfzo[i].d() < f1) {
          f1 = paramArrayOfzo[i].d();
        }
        if (paramArrayOfzo[i].d() > f2) {
          f2 = paramArrayOfzo[i].d();
        }
        if (paramArrayOfzo[i].e() < f3) {
          f3 = paramArrayOfzo[i].e();
        }
        if (paramArrayOfzo[i].e() > f4) {
          f4 = paramArrayOfzo[i].e();
        }
      }
    }
    i = zbxz.h(f2 - f1);
    int j = zbxz.h(f4 - f3);
    int k = i > j ? i : j;
    if (k > 4) {
      paramFloat *= (float)Math.pow(10.0D, 4 - k);
    }
    if (!paramzbfc.H())
    {
      if (paramArrayOfzo.length <= 2) {
        paramzr.b(paramzs, paramArrayOfzo);
      } else {
        paramzr.a(paramzs, paramArrayOfzo, paramFloat);
      }
    }
    else {
      a(paramzr, paramzbfc.D(), paramArrayOfzo, paramFloat, paramInt1, paramInt2, paramArrayList);
    }
  }
  
  private static void a(zr paramzr, zkg paramzkg, zo[] paramArrayOfzo, float paramFloat, int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    int i = 0;
    for (int j = paramInt1 + 1; j <= paramInt2; j++) {
      if ((!paramArrayList.contains(Integer.valueOf(j))) && (j < paramzkg.getCount()))
      {
        zke localzke = paramzkg.b(j);
        if (localzke != null)
        {
          com.aspose.cells.a.d.zs localzs = zanv.a(localzke.k());
          try
          {
            if (i < paramArrayOfzo.length - 1) {
              if (paramArrayOfzo.length <= 2) {
                paramzr.b(localzs, paramArrayOfzo);
              } else {
                paramzr.a(localzs, paramArrayOfzo, i, 1, paramFloat);
              }
            }
            i++;
          }
          finally
          {
            if (localzs != null) {
              localzs.s();
            }
          }
        }
      }
    }
  }
  
  private static zo[] a(List paramList)
  {
    zo[] arrayOfzo = new zo[paramList.size()];
    zbxz.a(arrayOfzo);
    for (int i = 0; i < paramList.size(); i++) {
      arrayOfzo[i] = ((zo)paramList.get(i));
    }
    return arrayOfzo;
  }
  
  private static zo[] a(List paramList, int paramInt1, int paramInt2)
  {
    zo[] arrayOfzo = new zo[paramInt2 - paramInt1 + 1];
    zbxz.a(arrayOfzo);
    for (int i = paramInt1; i <= paramInt2; i++) {
      arrayOfzo[(i - paramInt1)] = ((zo)paramList.get(i));
    }
    return arrayOfzo;
  }
  
  private static void a(zr paramzr, zo[] paramArrayOfzo, zke paramzke, com.aspose.cells.b.a.b.zp paramzp)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (paramArrayOfzo.length < 3)
    {
      localObject1 = paramArrayOfzo[0];
      localObject2 = paramArrayOfzo[1];
      localObject3 = new zo[] { localObject1 };
      localObject4 = new zo[] { localObject2 };
      a(paramzp, (zo[])localObject3, (zo[])localObject4);
      localObject1 = localObject3[0];
      localObject2 = localObject4[0];
      zanv.a(paramzr, (zo)localObject1, (zo)localObject2, paramzke.k());
    }
    else
    {
      localObject1 = new zo[][] { paramArrayOfzo };
      a((zo[][])localObject1);
      paramArrayOfzo = localObject1[0];
      localObject2 = new ArrayList();
      localObject3 = paramArrayOfzo[0];
      localObject4 = paramArrayOfzo[1];
      com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject3);
      com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject4);
      for (int i = 2; i < paramArrayOfzo.length; i++)
      {
        zo localzo = paramArrayOfzo[i];
        double d = a((zo)localObject3, (zo)localObject4, localzo);
        d = d * 180.0D / 3.141592653589793D;
        if (d < 30.0D)
        {
          a(paramzr, (ArrayList)localObject2, paramzke);
          zanv.a(paramzr, (zo)localObject4, localzo, paramzke.k());
          localObject3 = localObject4;
          localObject4 = localzo;
          ((ArrayList)localObject2).clear();
          com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject3);
          com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject4);
        }
        else
        {
          com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localzo);
          localObject3 = localObject4;
          localObject4 = localzo;
        }
      }
      if (((ArrayList)localObject2).size() > 1) {
        a(paramzr, (ArrayList)localObject2, paramzke);
      }
    }
  }
  
  private static double a(zo paramzo1, zo paramzo2, zo paramzo3)
  {
    double d1 = Math.sqrt(Math.pow(paramzo2.e() - paramzo1.e(), 2.0D) + Math.pow(paramzo2.d() - paramzo1.d(), 2.0D));
    double d2 = Math.sqrt(Math.pow(paramzo3.e() - paramzo2.e(), 2.0D) + Math.pow(paramzo3.d() - paramzo2.d(), 2.0D));
    double d3 = Math.sqrt(Math.pow(paramzo3.e() - paramzo1.e(), 2.0D) + Math.pow(paramzo3.d() - paramzo1.d(), 2.0D));
    double d4 = (Math.pow(d1, 2.0D) + Math.pow(d2, 2.0D) - Math.pow(d3, 2.0D)) / (2.0D * d1 * d2);
    return Math.acos(d4);
  }
  
  private static void a(zr paramzr, ArrayList paramArrayList, zke paramzke)
  {
    if (paramArrayList.size() == 2)
    {
      zanv.a(paramzr, (zo)paramArrayList.get(0), (zo)paramArrayList.get(1), paramzke.k());
    }
    else
    {
      ze localze = new ze();
      zo[] arrayOfzo = a(paramArrayList);
      localze.a(arrayOfzo);
      com.aspose.cells.a.d.zs localzs = zanv.a(paramzke.k());
      try
      {
        paramzr.a(localzs, localze);
        localzs.dispose();
      }
      finally
      {
        if (localzs != null) {
          localzs.s();
        }
      }
    }
  }
  
  private static void a(com.aspose.cells.b.a.b.zp paramzp, zo[] paramArrayOfzo1, zo[] paramArrayOfzo2)
  {
    float f1 = (paramArrayOfzo1[0].e() * paramArrayOfzo2[0].d() - paramArrayOfzo1[0].d() * paramArrayOfzo2[0].e()) / (paramArrayOfzo2[0].d() - paramArrayOfzo1[0].d());
    float f2 = (paramArrayOfzo1[0].e() - f1) / paramArrayOfzo1[0].d();
    if (paramArrayOfzo1[0].e() < paramzp.d())
    {
      paramArrayOfzo1[0].b(paramzp.d());
      paramArrayOfzo1[0].a((paramArrayOfzo1[0].e() - f1) / f2);
    }
    if (paramArrayOfzo1[0].e() > paramzp.j())
    {
      paramArrayOfzo1[0].b(paramzp.j());
      paramArrayOfzo1[0].a((paramArrayOfzo1[0].e() - f1) / f2);
    }
    if (paramArrayOfzo2[0].e() < paramzp.d())
    {
      paramArrayOfzo2[0].b(paramzp.d());
      paramArrayOfzo2[0].a((paramArrayOfzo2[0].e() - f1) / f2);
    }
    if (paramArrayOfzo2[0].e() > paramzp.j())
    {
      paramArrayOfzo2[0].b(paramzp.j());
      paramArrayOfzo2[0].a((paramArrayOfzo2[0].e() - f1) / f2);
    }
  }
  
  private static void a(zo[][] paramArrayOfzo)
  {
    zo localzo1 = zo.a();
    if (paramArrayOfzo[0].length > 0) {
      localzo1 = paramArrayOfzo[0][0];
    }
    int i = 0;
    for (int j = 1; j < paramArrayOfzo[0].length; j++)
    {
      zo localzo2 = paramArrayOfzo[0][j];
      if (paramArrayOfzo[0].length - i <= 2) {
        break;
      }
      if ((Math.abs(localzo1.d() - localzo2.d()) < 1.0F) && (Math.abs(localzo1.e() - localzo2.e()) < 1.0F))
      {
        paramArrayOfzo[0][j] = zo.a();
        i++;
      }
      else
      {
        localzo1 = paramArrayOfzo[0][j];
      }
    }
    if (i > 0)
    {
      zo[] arrayOfzo = new zo[paramArrayOfzo[0].length - i];
      int k = 0;
      for (int m = 0; m < paramArrayOfzo[0].length; m++) {
        if (!paramArrayOfzo[0][m].b())
        {
          arrayOfzo[k] = paramArrayOfzo[0][m];
          k++;
        }
      }
      paramArrayOfzo[0] = arrayOfzo;
    }
  }
  
  static void a(zr paramzr, zbfc paramzbfc, List paramList, com.aspose.cells.b.a.b.zp paramzp)
  {
    paramzp = new com.aspose.cells.b.a.b.zp(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    paramzp.a(1, 1);
    for (int i = 0; i < paramList.size(); i++)
    {
      Object localObject = paramList.get(i);
      if (localObject != null)
      {
        zke localzke = paramzbfc.D().b(i);
        zo localzo = (zo)localObject;
        if ((localzo.d() >= paramzp.c()) && (localzo.e() >= paramzp.d()) && (localzo.d() <= paramzp.i()) && (localzo.e() <= paramzp.j()) && (localzke.m().g())) {
          zana.a(paramzr, localzo.d(), localzo.e(), localzke.m(), localzke.m().c(), false);
        }
      }
    }
  }
  
  static ArrayList b(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    zje localzje = paramzbfc.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 37;
    arrayOfInt[1] = 40;
    int i = paramzbfc.af();
    zbs localzbs2;
    zbs localzbs1;
    if (i == 1)
    {
      localzbs2 = localzje.e();
      localzbs1 = localzje.E();
    }
    else
    {
      localzbs2 = localzje.g();
      localzbs1 = localzje.G();
    }
    if (localzbs2.k() == 2) {
      return b(paramzr, paramzbfc, paramzp, paramFloat, (float)paramDouble);
    }
    zbfe localzbfe = localzje.z();
    int j = localzbfe.getCount();
    float f1 = paramzbfc.J() / 100.0F;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    boolean bool1 = paramzbfc.L();
    zanq localzanq1 = paramzbfc.O();
    zanq localzanq2 = paramzbfc.P();
    zjx localzjx1 = paramzbfc.S();
    zjx localzjx2 = paramzbfc.T();
    int k = 0;
    int m = paramInt;
    if (localzbs2.p) {
      m = (int)localzbs2.z();
    }
    if ((localzbs2.f()) || (localzje.u()))
    {
      k = m;
    }
    else
    {
      k = m - 1;
      if (k == 0) {
        k = 1;
      }
    }
    double d3 = paramzp.e() / k;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    List localList = localzbfe.a(i, arrayOfInt);
    int i2;
    for (int n = 0; n < localList.size(); n++)
    {
      zbfc localzbfc = (zbfc)localList.get(n);
      if (((!localzje.ap()) || (localzbfc.equals(paramzbfc))) && ((paramzbfc.N()) || (paramzbfc.M()) || (localzbfc.equals(paramzbfc))))
      {
        i2 = localzbfc.ai();
        ArrayList localArrayList4 = new ArrayList();
        ArrayList localArrayList5 = new ArrayList();
        zkg localzkg = localzbfc.D();
        for (int i3 = 0; i3 < paramInt; i3++)
        {
          zke localzke = localzkg.b(i3);
          if ((localzke != null) && (!localzke.a()) && (!localzke.J()))
          {
            double d4 = (float)d3 * i3 + 1.0F;
            if ((localzbs2.f()) || (localzje.u())) {
              d4 += (float)(d3 / 2.0D);
            }
            if (localzbs2.p()) {
              d4 = paramzp.c() + paramzp.e() - d4;
            } else {
              d4 = paramzp.c() + d4;
            }
            double d5 = paramFloat;
            double d6 = localzke.w();
            double d7 = (d6 - paramDouble) / (d1 - d2) * paramzp.f();
            zub localzub = paramzbfc.x();
            if ((localzub != null) && (localzub.d() != 2))
            {
              localzo = new zo((float)d4, paramFloat);
              double d8 = 0.0D;
              double d9 = 0.0D;
              float f7 = 0.0F;
              float f8 = 0.0F;
              if (localzub != null)
              {
                switch (localzub.g())
                {
                case 1: 
                  d8 = localzub.c();
                  d9 = d8;
                  break;
                case 2: 
                  d8 = localzub.c() * d6 / 100.0D;
                  d9 = -d8;
                  break;
                case 0: 
                  double d10 = localzub.e().size() > i3 ? localzub.a(localzub.e().get(i3)) : 0.0D;
                  d8 = d10;
                  d10 = localzub.f().size() > i3 ? localzub.a(localzub.f().get(i3)) : 0.0D;
                  d9 = d10;
                }
                f7 = (float)d8 / (float)(d1 - d2) * paramzp.f();
                f8 = (float)d9 / (float)(d1 - d2) * paramzp.f();
                if (!localzbs1.p()) {
                  localzo.b(localzo.e() - (float)d7);
                } else {
                  localzo.b(localzo.e() + (float)d7);
                }
              }
              if (localzbfc.equals(paramzbfc)) {
                localzub.a(localzo, f7, f8);
              }
            }
            if (!localzbs1.p()) {
              d5 -= d7;
            } else {
              d5 += d7;
            }
            zo localzo = new zo((float)d4, (float)d5);
            com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo);
            com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i3));
            if (localzbfc.equals(paramzbfc))
            {
              if (bool1) {
                zanv.a(paramzr, (float)d4, (float)d5, (float)d4, paramFloat, localzanq1);
              }
              com.aspose.cells.b.a.a.zf.a(localArrayList3, localzo);
              Object[] arrayOfObject = new Object[4];
              arrayOfObject[0] = Integer.valueOf(i2);
              arrayOfObject[1] = Integer.valueOf(i3);
              arrayOfObject[2] = localzo;
              arrayOfObject[3] = localzbs2;
              if (a(localzke, d1, d2)) {
                com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
              }
            }
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i3));
            if (localzbfc.equals(paramzbfc)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, null);
            }
          }
        }
        if (localzbfc.equals(paramzbfc))
        {
          com.aspose.cells.a.d.zs localzs = zanv.a(localzbfc.z());
          a(paramzr, paramzbfc, localArrayList4, localArrayList5, localzs, paramzp);
          localzs.dispose();
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList4);
      }
    }
    for (n = 0; n < paramInt; n++)
    {
      int i1 = 0;
      i2 = 0;
      float f2 = 0.0F;
      float f3 = 0.0F;
      float f4 = 0.0F;
      int i4 = 0;
      int i5 = 0;
      float f5 = 0.0F;
      float f6 = 0.0F;
      Object localObject1;
      Object localObject2;
      for (int i6 = 0; i6 < localArrayList2.size(); i6++)
      {
        localObject1 = (ArrayList)localArrayList2.get(i6);
        if ((((ArrayList)localObject1).size() > n) && (((ArrayList)localObject1).get(n) != null))
        {
          localObject2 = (zo)((ArrayList)localObject1).get(n);
          f4 = ((zo)localObject2).d();
          if (i1 == 0)
          {
            f2 = ((zo)localObject2).e();
            i1 = 1;
          }
          else if (i2 == 0)
          {
            if (f2 < ((zo)localObject2).e())
            {
              f3 = f2;
              f2 = ((zo)localObject2).e();
              i2 = 1;
            }
            else
            {
              f3 = ((zo)localObject2).e();
              i2 = 1;
            }
          }
          else
          {
            if (f2 < ((zo)localObject2).e()) {
              f2 = ((zo)localObject2).e();
            }
            if (f3 > ((zo)localObject2).e()) {
              f3 = ((zo)localObject2).e();
            }
          }
          if (i6 == 0)
          {
            f5 = ((zo)localObject2).e();
            i4 = 1;
          }
          else if (i6 == localArrayList2.size() - 1)
          {
            f6 = ((zo)localObject2).e();
            i5 = 1;
          }
        }
      }
      if ((paramzbfc.M()) && (i1 != 0) && (i2 != 0))
      {
        float[] arrayOfFloat = { f4 };
        localObject1 = new float[] { f2 };
        arrayOfFloat[0] = f4;
        localObject2 = new float[] { f3 };
        boolean bool2 = a(localzbs1.X(), paramzp, arrayOfFloat, (float[])localObject1, arrayOfFloat, (float[])localObject2);
        f4 = arrayOfFloat[0];
        f2 = localObject1[0];
        f4 = arrayOfFloat[0];
        f3 = localObject2[0];
        if (bool2) {
          zanv.a(paramzr, f4, f2, f4, f3, localzanq2);
        }
      }
      if ((paramzbfc.N()) && (i4 != 0) && (i5 != 0))
      {
        int i7 = (int)(d3 / (1.0F + f1));
        localObject1 = new zq();
        if (f5 <= f6)
        {
          ((zq)localObject1).c(i7);
          ((zq)localObject1).d(f6 - f5);
          ((zq)localObject1).a(f4 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f5);
          a(paramzr, localzjx2, (zq)localObject1);
        }
        else
        {
          ((zq)localObject1).c(i7);
          ((zq)localObject1).d(f5 - f6);
          ((zq)localObject1).a(f4 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f6);
          a(paramzr, localzjx1, (zq)localObject1);
        }
      }
    }
    a(paramzr, paramzbfc, localArrayList3, paramzp);
    return localArrayList1;
  }
  
  private static boolean a(zke paramzke, double paramDouble1, double paramDouble2)
  {
    if (paramzke.J()) {
      return false;
    }
    if (paramzke.w() > paramDouble1) {
      return false;
    }
    return paramzke.w() >= paramDouble2;
  }
  
  private static boolean a(int paramInt, com.aspose.cells.b.a.b.zp paramzp, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, float[] paramArrayOfFloat4)
  {
    float f = paramInt * 1.5F;
    if (((paramArrayOfFloat1[0] + f <= paramzp.c()) && (paramArrayOfFloat3[0] + f <= paramzp.c())) || ((paramArrayOfFloat1[0] - f >= paramzp.i()) && (paramArrayOfFloat3[0] - f >= paramzp.i()))) {
      return false;
    }
    if (((paramArrayOfFloat2[0] + f <= paramzp.d()) && (paramArrayOfFloat4[0] + f <= paramzp.d())) || ((paramArrayOfFloat2[0] - f >= paramzp.j()) && (paramArrayOfFloat4[0] - f >= paramzp.j()))) {
      return false;
    }
    if (paramArrayOfFloat1[0] + f < paramzp.c()) {
      paramArrayOfFloat1[0] = (paramzp.c() - f);
    }
    if (paramArrayOfFloat1[0] - f > paramzp.i()) {
      paramArrayOfFloat1[0] = (paramzp.i() + f);
    }
    if (paramArrayOfFloat3[0] + f < paramzp.c()) {
      paramArrayOfFloat3[0] = (paramzp.c() - f);
    }
    if (paramArrayOfFloat3[0] - f > paramzp.i()) {
      paramArrayOfFloat3[0] = (paramzp.i() + f);
    }
    if (paramArrayOfFloat2[0] + f < paramzp.d()) {
      paramArrayOfFloat2[0] = (paramzp.d() - f);
    }
    if (paramArrayOfFloat2[0] - f > paramzp.j()) {
      paramArrayOfFloat2[0] = (paramzp.j() + f);
    }
    if (paramArrayOfFloat4[0] + f < paramzp.d()) {
      paramArrayOfFloat4[0] = (paramzp.d() - f);
    }
    if (paramArrayOfFloat4[0] - f > paramzp.j()) {
      paramArrayOfFloat4[0] = (paramzp.j() + f);
    }
    return true;
  }
  
  static void b(zr paramzr, zje paramzje, ArrayList paramArrayList)
    throws Exception
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      zo localzo = (zo)arrayOfObject[2];
      zbs localzbs = (zbs)arrayOfObject[3];
      int m = (int)(paramzje.a() * 0.2F);
      a(paramzr, localzbs, j, k, localzo, m);
    }
  }
  
  static void a(zr paramzr, zbs paramzbs, int paramInt1, int paramInt2, zo paramzo, int paramInt3)
    throws Exception
  {
    zbfe localzbfe = paramzbs.c().z();
    zbfc localzbfc = localzbfe.c(paramInt1);
    zke localzke = localzbfc.D().b(paramInt2);
    zqx localzqx = localzke.o();
    zt localzt = zqz.a(paramzr, paramzbs, localzbfe, paramInt1, paramInt2, paramInt3);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 4.0F;
    if ((localzbfc.m() == 12) || (localzbfc.m() == 13)) {
      f3 += localzke.a / 2.0F;
    } else if (localzke.m().d() != 1) {
      f3 += (int)(localzke.m().c() / 2.0F);
    }
    int i = localzqx.j();
    if (i == 9) {
      i = zqz.b(localzbfe.a(paramInt1).m());
    }
    switch (i)
    {
    case 1: 
      f1 = paramzo.d() - localzt.b() / 2.0F;
      f2 = paramzo.e() - localzt.c() / 2.0F;
      break;
    case 5: 
      f1 = paramzo.d() - localzt.b() / 2.0F;
      f2 = paramzo.e() - localzt.c() - f3;
      f2 -= zqz.a;
      break;
    case 6: 
      f1 = paramzo.d() - localzt.b() / 2.0F;
      f2 = paramzo.e() + f3;
      f2 += zqz.a;
      break;
    case 7: 
      f1 = paramzo.d() - localzt.b() - f3;
      f2 = paramzo.e() - localzt.c() / 2.0F;
      if (localzqx.e()) {
        f1 -= zqz.a;
      }
      break;
    case 2: 
    case 3: 
    case 4: 
    default: 
      f1 = paramzo.d() + f3;
      f2 = paramzo.e() - localzt.c() / 2.0F;
      if (localzqx.e()) {
        f1 += zqz.a;
      }
      break;
    }
    localzqx.a().b = new com.aspose.cells.b.a.b.zp(zbxz.c(f1), zbxz.c(f2), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
    localzqx.a().z();
    zqz.a(paramzr, paramzbs, localzbfe, paramInt1, paramInt2, localzqx.a().a);
  }
  
  private static ArrayList b(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    zje localzje = paramzbfc.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 37;
    arrayOfInt[1] = 40;
    int i = paramzbfc.af();
    zbfe localzbfe = localzje.z();
    int j = localzbfe.getCount();
    float f1 = paramzbfc.J() / 100.0F;
    zbs localzbs2;
    zbs localzbs1;
    ArrayList localArrayList2;
    if (i == 1)
    {
      localzbs2 = localzje.e();
      localzbs1 = localzje.E();
      localArrayList2 = ziy.a(localzje.z().c(), paramzbfc.v().U());
    }
    else
    {
      localzbs2 = localzje.g();
      localzbs1 = localzje.G();
      localArrayList2 = ziy.a(localzje.z().d(), paramzbfc.v().U());
    }
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    boolean bool1 = paramzbfc.L();
    zanq localzanq1 = paramzbfc.O();
    zanq localzanq2 = paramzbfc.P();
    zjx localzjx1 = paramzbfc.S();
    zjx localzjx2 = paramzbfc.T();
    int k = localArrayList2.size();
    int m = localzbs2.j();
    int n = (int)localzbs2.D();
    int i1 = (int)localzbs2.z();
    int i2 = 0;
    if ((localzbs2.f()) || (localzje.u()))
    {
      i2 = zbu.a(m, i1, n, paramzbfc.v().U()) + 1;
    }
    else
    {
      i2 = zbu.a(m, i1, n, paramzbfc.v().U());
      if (i2 == 0) {
        i2 = 1;
      }
    }
    double d3 = paramzp.e() / i2;
    float f2 = 0.0F;
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    List localList = localzbfe.a(i, arrayOfInt);
    int i5;
    int i11;
    for (int i3 = 0; i3 < localList.size(); i3++)
    {
      zbfc localzbfc = (zbfc)localList.get(i3);
      if (((!localzje.ap()) || (localzbfc.equals(paramzbfc))) && ((paramzbfc.N()) || (paramzbfc.M()) || (localzbfc.equals(paramzbfc))))
      {
        i5 = localzbfc.ai();
        ArrayList localArrayList5 = new ArrayList();
        ArrayList localArrayList6 = new ArrayList();
        ArrayList localArrayList7 = new ArrayList();
        for (int i6 = 0; i6 < k; i6++)
        {
          zke localzke1 = localzbfc.D().b(i6);
          if (localzke1 != null)
          {
            int i9 = (!localzke1.a()) && (!localzke1.J()) ? 1 : 0;
            int i10 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i6)));
            i10 = zbu.a(m, i10, paramzbfc.v().U());
            i11 = zbu.a(m, i10, n, paramzbfc.v().U());
            float f8 = (float)(d3 * i11);
            f2 = (float)(d3 * zbu.a(m, zbu.a(localzbs2.j(), localzbs2.y(), (int)localzbs2.x(), i10, paramzbfc.v().U()), i10, paramzbfc.v().U()));
            if ((localzbs2.f()) || (localzje.u())) {
              f8 += (float)(d3 / 2.0D);
            }
            float f9 = 0.0F;
            if (localzbs2.p()) {
              f9 = paramzp.c() + paramzp.e() - f8;
            } else {
              f9 = paramzp.c() + f8;
            }
            float f10 = paramFloat;
            float f11 = (float)localzke1.w();
            float f12 = (float)((f11 - paramDouble) / (d1 - d2) * paramzp.f());
            zub localzub = paramzbfc.x();
            if ((localzub != null) && (localzub.d() != 2) && (i9 != 0))
            {
              localzo2 = new zo(f9, paramFloat);
              double d4 = 0.0D;
              double d5 = 0.0D;
              float f13 = 0.0F;
              float f14 = 0.0F;
              if (localzub != null)
              {
                switch (localzub.g())
                {
                case 1: 
                  d4 = localzub.c();
                  d5 = d4;
                  break;
                case 2: 
                  d4 = localzub.c() * f11 / 100.0D;
                  d5 = -d4;
                  break;
                case 0: 
                  double d6 = localzub.e().size() > i6 ? localzub.a(localzub.e().get(i6)) : 0.0D;
                  d4 = d6;
                  d6 = localzub.f().size() > i6 ? localzub.a(localzub.f().get(i6)) : 0.0D;
                  d5 = d6;
                }
                f13 = (float)d4 / (float)(d1 - d2) * paramzp.f();
                f14 = (float)d5 / (float)(d1 - d2) * paramzp.f();
                if (!localzbs1.p()) {
                  localzo2.b(localzo2.e() - f12);
                } else {
                  localzo2.b(localzo2.e() + f12);
                }
              }
              if (localzbfc.equals(paramzbfc)) {
                localzub.a(localzo2, f13, f14);
              }
            }
            if (!localzbs1.p()) {
              f10 -= f12;
            } else {
              f10 += f12;
            }
            zo localzo2 = new zo(f9, f10);
            if (i9 == 0) {
              com.aspose.cells.b.a.a.zf.a(localArrayList7, Integer.valueOf(i6));
            }
            zkn.a(localzo2, localArrayList5, localArrayList6, i6, localzbs2.p());
            if ((localzbfc.equals(paramzbfc)) && (i9 != 0))
            {
              if (bool1) {
                zanv.a(paramzr, f9, f10, f9, paramFloat, localzanq1);
              }
              if (i9 != 0) {
                com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo2);
              } else {
                com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
              }
              if (i9 != 0)
              {
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i5);
                arrayOfObject[1] = Integer.valueOf(i6);
                arrayOfObject[2] = localzo2;
                arrayOfObject[3] = localzbs2;
                if (a(localzke1, d1, d2)) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
                }
              }
            }
          }
          else
          {
            if (localzbs2.p())
            {
              localArrayList5.add(0, null);
              localArrayList6.add(0, Integer.valueOf(i6));
            }
            else
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList5, null);
              com.aspose.cells.b.a.a.zf.a(localArrayList6, Integer.valueOf(i6));
            }
            if (localzbfc.equals(paramzbfc)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            }
          }
        }
        zkn.a(localArrayList5, localArrayList6, localArrayList7);
        if (localzbfc.equals(paramzbfc))
        {
          com.aspose.cells.a.d.zs localzs = zanv.a(localzbfc.z());
          a(paramzr, paramzbfc, localArrayList5, localArrayList6, localzs, paramzp);
          localzs.dispose();
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList5);
      }
    }
    for (i3 = 0; i3 < k; i3++)
    {
      int i4 = 0;
      i5 = 0;
      float f3 = 0.0F;
      float f4 = 0.0F;
      float f5 = 0.0F;
      int i7 = 0;
      int i8 = 0;
      float f6 = 0.0F;
      float f7 = 0.0F;
      Object localObject1;
      Object localObject2;
      for (i11 = 0; i11 < localArrayList3.size(); i11++)
      {
        localObject1 = (ArrayList)localArrayList3.get(i11);
        localObject2 = (zbfc)localList.get(i11);
        zke localzke2 = ((zbfc)localObject2).D().b(i3);
        if (((localzke2 == null) || ((!localzke2.d()) && (!localzke2.J()))) && (((ArrayList)localObject1).size() > i3) && (((ArrayList)localObject1).get(i3) != null))
        {
          zo localzo1 = (zo)((ArrayList)localObject1).get(i3);
          f5 = localzo1.d();
          if (i4 == 0)
          {
            f3 = localzo1.e();
            i4 = 1;
          }
          else if (i5 == 0)
          {
            if (f3 < localzo1.e())
            {
              f4 = f3;
              f3 = localzo1.e();
              i5 = 1;
            }
            else
            {
              f4 = localzo1.e();
              i5 = 1;
            }
          }
          else
          {
            if (f3 < localzo1.e()) {
              f3 = localzo1.e();
            }
            if (f4 > localzo1.e()) {
              f4 = localzo1.e();
            }
          }
          if (i11 == 0)
          {
            f6 = localzo1.e();
            i7 = 1;
          }
          else if (i11 == j - 1)
          {
            f7 = localzo1.e();
            i8 = 1;
          }
        }
      }
      if ((paramzbfc.M()) && (i4 != 0) && (i5 != 0))
      {
        float[] arrayOfFloat = { f5 };
        localObject1 = new float[] { f3 };
        arrayOfFloat[0] = f5;
        localObject2 = new float[] { f4 };
        boolean bool2 = a(localzbs1.X(), paramzp, arrayOfFloat, (float[])localObject1, arrayOfFloat, (float[])localObject2);
        f5 = arrayOfFloat[0];
        f3 = localObject1[0];
        f5 = arrayOfFloat[0];
        f4 = localObject2[0];
        if (bool2) {
          zanv.a(paramzr, f5, f3, f5, f4, localzanq2);
        }
      }
      if ((paramzbfc.N()) && (i7 != 0) && (i8 != 0))
      {
        int i12 = (int)(f2 / (1.0F + f1));
        localObject1 = new zq();
        if (f6 <= f7)
        {
          ((zq)localObject1).c(i12);
          ((zq)localObject1).d(f7 - f6);
          ((zq)localObject1).a(f5 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f6);
          a(paramzr, localzjx2, (zq)localObject1);
        }
        else
        {
          ((zq)localObject1).c(i12);
          ((zq)localObject1).d(f6 - f7);
          ((zq)localObject1).a(f5 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f7);
          a(paramzr, localzjx1, (zq)localObject1);
        }
      }
    }
    a(paramzr, paramzbfc, localArrayList4, paramzp);
    return localArrayList1;
  }
  
  static ArrayList a(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
    throws Exception
  {
    zje localzje = paramzbfc.v();
    int i = 15;
    zbfe localzbfe = localzje.z();
    int j = localzbfe.getCount();
    int m = paramzbfc.af();
    zbs localzbs2;
    zbs localzbs1;
    int k;
    if (m == 1)
    {
      localzbs2 = localzje.e();
      localzbs1 = localzje.E();
      k = localzbfe.b(1, i);
    }
    else
    {
      localzbs2 = localzje.g();
      localzbs1 = localzje.G();
      k = localzbfe.b(2, i);
    }
    if (localzbs2.k() == 2) {
      return a(paramzr, paramzbfc, paramzp);
    }
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    float f1 = 0.0F;
    if (!localzbs1.p()) {
      f1 = paramzp.d() + (float)d1 / (float)(d1 - d2) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)d1 / (float)(d1 - d2) * paramzp.f();
    }
    float f2 = paramzbfc.K() / 100.0F;
    float f3 = paramzbfc.J() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    int n = 0;
    int i1 = paramInt;
    if (localzbs2.p) {
      i1 = (int)localzbs2.z();
    }
    if ((localzbs2.f()) || (localzje.u()))
    {
      n = i1;
    }
    else
    {
      n = i1 - 1;
      if (n == 0) {
        n = 1;
      }
    }
    double d3 = paramzp.e() / n;
    float f4 = 0.0F;
    List localList = localzbfe.a(m, new int[] { i });
    int i2 = localzbfe.a(paramzbfc, m, new int[] { i });
    if (i2 == -1) {
      return new ArrayList();
    }
    int i3 = paramzbfc.ai();
    zkg localzkg = paramzbfc.D();
    ArrayList localArrayList2 = new ArrayList();
    for (int i4 = 0; i4 < localzkg.getCount(); i4++)
    {
      zke localzke1 = localzkg.b(i4);
      float f5 = (float)d3 / (k - f2 * (k - 1) + f3);
      float f6 = f5 * f2;
      float f7 = f5 * f3;
      f4 += i2 * (f5 - f6);
      float f8 = (float)d3 * i4 + f7 / 2.0F + f4;
      if ((!localzbs2.f()) && (!localzje.u())) {
        f8 -= (float)(d3 / 2.0D);
      }
      if (localzbs2.p()) {
        f8 = paramzp.c() + paramzp.e() - f8 - f5;
      } else {
        f8 = paramzp.c() + f8;
      }
      ArrayList localArrayList3 = new ArrayList();
      double d4 = localzke1.w();
      double d5 = d4;
      int i5;
      zke localzke2;
      double d6;
      if (d4 >= 0.0D) {
        for (i5 = 0; i5 < i2; i5++)
        {
          localzke2 = ((zbfc)localList.get(i5)).D().b(i4);
          if (localzke2 != null)
          {
            d6 = localzke2.w();
            if (d6 > 0.0D) {
              d5 += d6;
            }
          }
        }
      } else {
        for (i5 = 0; i5 < i2; i5++)
        {
          localzke2 = ((zbfc)localList.get(i5)).D().b(i4);
          if (localzke2 != null)
          {
            d6 = localzke2.w();
            if (d6 <= 0.0D) {
              d5 += d6;
            }
          }
        }
      }
      float f9 = (float)(Math.abs(d4) / (d1 - d2) * paramzp.f());
      float f10 = (float)(Math.abs(d5) / (d1 - d2) * paramzp.f());
      int i6 = 0;
      if (f9 == 0.0F) {
        i6 = 1;
      }
      zub localzub = paramzbfc.x();
      if ((localzub != null) && (localzub.d() != 2))
      {
        localObject1 = new zo(f8 + f5 / 2.0F, f1);
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
            double d9 = localzub.e().size() > i4 ? localzub.a(localzub.e().get(i4)) : 0.0D;
            d7 = d9;
            d9 = localzub.f().size() > i4 ? localzub.a(localzub.f().get(i4)) : 0.0D;
            d8 = d9;
          }
          f11 = (float)d7 / (float)(d1 - d2) * paramzp.f();
          f12 = (float)d8 / (float)(d1 - d2) * paramzp.f();
          if (!localzbs1.p())
          {
            if (d4 <= 0.0D) {
              ((zo)localObject1).b(((zo)localObject1).e() + f10);
            } else {
              ((zo)localObject1).b(((zo)localObject1).e() - f10);
            }
          }
          else if (d4 <= 0.0D) {
            ((zo)localObject1).b(((zo)localObject1).e() - f10);
          } else {
            ((zo)localObject1).b(((zo)localObject1).e() + f10);
          }
        }
        localzub.a((zo)localObject1, f11, f12);
      }
      if (!localzbs1.p())
      {
        if (d4 < 0.0D) {
          f10 = f1 + f10 - f9;
        } else {
          f10 = f1 - f10;
        }
      }
      else if (d4 < 0.0D) {
        f10 = f1 - f10;
      } else {
        f10 = f1 + f10 - f9;
      }
      if (localzke1.k().e()) {
        f9 -= 1.0F;
      }
      Object localObject1 = new zq(f8, f10, f5, f9 + 1.0F);
      zq localzq = new zq(((zq)localObject1).f(), ((zq)localObject1).g(), ((zq)localObject1).h(), ((zq)localObject1).i());
      if (((zq)localObject1).g() < paramzp.d())
      {
        ((zq)localObject1).d(((zq)localObject1).i() - (paramzp.d() - ((zq)localObject1).g()));
        ((zq)localObject1).b(paramzp.d());
      }
      if (((zq)localObject1).m() > paramzp.j() + 1) {
        ((zq)localObject1).d(((zq)localObject1).i() - (((zq)localObject1).m() - paramzp.j()));
      }
      if ((((zq)localObject1).l() >= paramzp.c()) && (((zq)localObject1).j() <= paramzp.i()))
      {
        if (((zq)localObject1).f() < paramzp.c())
        {
          ((zq)localObject1).c(((zq)localObject1).h() - (paramzp.c() - ((zq)localObject1).f()));
          ((zq)localObject1).a(paramzp.c());
        }
        else if (((zq)localObject1).l() > paramzp.i())
        {
          ((zq)localObject1).c(((zq)localObject1).h() - (((zq)localObject1).l() - paramzp.i()));
        }
        if ((((zq)localObject1).h() + 1.0F >= (f5 - 1.0F) / 3.0F) && (((zq)localObject1).i() >= 0.0F))
        {
          if (i6 == 0) {
            a(paramzr, localzke1, (zq)localObject1, localzje.g(paramzbfc.ax()).a(i3), f1, localzbs1);
          }
          localObject2 = new Object[5];
          boolean bool;
          if (localzq.g() + localzq.i() / 2.0F < f1) {
            bool = true;
          } else if (d4 != 0.0D) {
            bool = false;
          } else if (localzbs1.p()) {
            bool = false;
          } else {
            bool = true;
          }
          localObject2[0] = Integer.valueOf(i3);
          localObject2[1] = Integer.valueOf(i4);
          localObject2[2] = localObject1;
          localObject2[3] = localzbs2;
          localObject2[4] = Boolean.valueOf(bool);
          if (!localzke1.a()) {
            com.aspose.cells.b.a.a.zf.a(localArrayList1, localObject2);
          }
          if (paramzbfc.X())
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList3, localObject1);
            com.aspose.cells.b.a.a.zf.a(localArrayList3, Boolean.valueOf(bool));
          }
        }
      }
      Object localObject2 = { localArrayList2 };
      a(paramzr, paramzbfc, (ArrayList[])localObject2, localArrayList3);
      localArrayList2 = localObject2[0];
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
      if (localzq1.f() < localzq2.f())
      {
        if (bool1) {
          localzo1 = new zo(localzq1.l(), localzq1.k());
        } else {
          localzo1 = new zo(localzq1.l(), localzq1.m());
        }
        if (bool2) {
          localzo2 = new zo(localzq2.j(), localzq2.k());
        } else {
          localzo2 = new zo(localzq2.j(), localzq2.m());
        }
      }
      else
      {
        if (bool1) {
          localzo1 = new zo(localzq1.j(), localzq1.k());
        } else {
          localzo1 = new zo(localzq1.j(), localzq1.m());
        }
        if (bool2) {
          localzo2 = new zo(localzq2.l(), localzq2.k());
        } else {
          localzo2 = new zo(localzq2.l(), localzq2.m());
        }
      }
      zanv.a(paramzr, localzo1, localzo2, paramzbfc.Y());
    }
    if (paramArrayList.size() > 0) {
      paramArrayOfArrayList[0] = paramArrayList;
    }
  }
  
  private static ArrayList a(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    zje localzje = paramzbfc.v();
    int i = paramzbfc.af();
    int j = 15;
    int k = localzje.z().getCount();
    zbfe localzbfe = localzje.z();
    float f1 = paramzbfc.K() / 100.0F;
    float f2 = paramzbfc.J() / 100.0F;
    zbs localzbs1;
    zbs localzbs2;
    int m;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbs1 = localzje.e();
      localzbs2 = localzje.E();
      m = localzbfe.b(1, j);
      localArrayList1 = ziy.a(localzje.z().c(), paramzbfc.v().U());
    }
    else
    {
      localzbs1 = localzje.g();
      localzbs2 = localzje.G();
      m = localzbfe.b(2, j);
      localArrayList1 = ziy.a(localzje.z().d(), paramzbfc.v().U());
    }
    float f3 = 0.0F;
    if (!localzbs2.p()) {
      f3 = paramzp.d() + (float)localzbs2.z() / (float)(localzbs2.z() - localzbs2.D()) * paramzp.f();
    } else {
      f3 = paramzp.j() - (float)localzbs2.z() / (float)(localzbs2.z() - localzbs2.D()) * paramzp.f();
    }
    double d1 = localzbs2.D();
    double d2 = localzbs2.z();
    ArrayList localArrayList2 = new ArrayList();
    int n = localArrayList1.size();
    int i1 = localzbs1.j();
    int i2 = (int)localzbs1.D();
    int i3 = (int)localzbs1.z();
    int i4 = 0;
    if ((localzbs1.f()) || (localzje.u()))
    {
      i4 = zbu.a(i1, i3, i2, paramzbfc.v().U()) + 1;
    }
    else
    {
      i4 = zbu.a(i1, i3, i2, paramzbfc.v().U());
      if (i4 == 0) {
        i4 = 1;
      }
    }
    double d3 = paramzp.e() / i4;
    ArrayList localArrayList3 = new ArrayList();
    for (int i5 = 0; i5 < n; i5++)
    {
      zke localzke1 = paramzbfc.D().b(i5);
      float f4 = (float)(d3 / (m - f1 * (m - 1) + f2));
      float f5 = f4 * f1;
      float f6 = f4 * f2;
      int i6 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i5)));
      i6 = zbu.a(i1, i6, paramzbfc.v().U());
      int i7 = zbu.a(i1, i6, i2, paramzbfc.v().U());
      float f7 = (float)(d3 * i7);
      if ((!localzbs1.f()) && (!localzje.u())) {
        f7 -= (float)(d3 / 2.0D);
      }
      float f8 = 0.0F;
      if (localzbs1.p()) {
        f8 = paramzp.c() + paramzp.e() - f7 - f6 / 2.0F - f4 - 1.0F;
      } else {
        f8 = paramzp.c() + f7 + f6 / 2.0F + 1.0F;
      }
      List localList = localzbfe.a(i, new int[] { j });
      int i8 = localzbfe.a(paramzbfc, i, new int[] { j });
      if (i8 == -1) {
        return localArrayList2;
      }
      int i9 = paramzbfc.ai();
      if (localzbs1.p()) {
        f8 -= i8 * (f4 - f5);
      } else {
        f8 += i8 * (f4 - f5);
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
        float f9 = (float)(Math.abs(d4) / (localzbs2.z() - localzbs2.D()) * paramzp.f());
        float f10 = (float)(Math.abs(d5) / (localzbs2.z() - localzbs2.D()) * paramzp.f());
        int i11 = 0;
        if (f9 == 0.0F) {
          i11 = 1;
        }
        zub localzub = paramzbfc.x();
        if ((localzub != null) && (localzub.d() != 2))
        {
          localObject = new zo(f8 + f4 / 2.0F, f3);
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
              double d9 = localzub.e().size() > i5 ? localzub.a(localzub.e().get(i5)) : 0.0D;
              d7 = d9;
              d9 = localzub.f().size() > i5 ? localzub.a(localzub.f().get(i5)) : 0.0D;
              d8 = d9;
            }
            f11 = (float)d7 / (float)(localzbs2.z() - localzbs2.D()) * paramzp.f();
            f12 = (float)d8 / (float)(localzbs2.z() - localzbs2.D()) * paramzp.f();
            if (!localzbs2.p())
            {
              if (d4 <= 0.0D) {
                ((zo)localObject).b(((zo)localObject).e() + f10);
              } else {
                ((zo)localObject).b(((zo)localObject).e() - f10);
              }
            }
            else if (d4 <= 0.0D) {
              ((zo)localObject).b(((zo)localObject).e() - f10);
            } else {
              ((zo)localObject).b(((zo)localObject).e() + f10);
            }
          }
          localzub.a((zo)localObject, f11, f12);
        }
        if (!localzbs2.p())
        {
          if (d4 < 0.0D) {
            f10 = f3 + f10 - f9;
          } else {
            f10 = f3 - f10;
          }
        }
        else if (d4 < 0.0D) {
          f10 = f3 - f10;
        } else {
          f10 = f3 + f10 - f9;
        }
        if (localzke1.k().e()) {
          f9 -= 1.0F;
        }
        Object localObject = new zq(f8, f10, f4, f9 + 1.0F);
        zq localzq = new zq(((zq)localObject).f(), ((zq)localObject).g(), ((zq)localObject).h(), ((zq)localObject).i());
        if (((zq)localObject).g() < paramzp.d())
        {
          ((zq)localObject).d(((zq)localObject).i() - (paramzp.d() - ((zq)localObject).g()));
          ((zq)localObject).b(paramzp.d());
        }
        if (((zq)localObject).m() > paramzp.j() + 1) {
          ((zq)localObject).d(((zq)localObject).i() - (((zq)localObject).m() - paramzp.j()));
        }
        if ((((zq)localObject).l() >= paramzp.c()) && (((zq)localObject).j() <= paramzp.i()))
        {
          if (((zq)localObject).f() < paramzp.c())
          {
            ((zq)localObject).c(((zq)localObject).h() - (paramzp.c() - ((zq)localObject).f()));
            ((zq)localObject).a(paramzp.c());
          }
          else if (((zq)localObject).l() > paramzp.i())
          {
            ((zq)localObject).c(((zq)localObject).h() - (((zq)localObject).l() - paramzp.i()));
          }
          if (((zq)localObject).h() + 1.0F >= (f4 - 1.0F) / 3.0F)
          {
            if (i11 == 0) {
              a(paramzr, localzke1, (zq)localObject, localzje.g(paramzbfc.ax()).a(i9), f3, localzbs2);
            }
            Object[] arrayOfObject = new Object[5];
            boolean bool;
            if (localzq.g() + localzq.i() / 2.0F < f3) {
              bool = true;
            } else if (d4 != 0.0D) {
              bool = false;
            } else if (localzbs2.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i9);
            arrayOfObject[1] = Integer.valueOf(i5);
            arrayOfObject[2] = localObject;
            arrayOfObject[3] = localzbs1;
            arrayOfObject[4] = Boolean.valueOf(bool);
            if (!localzke1.a()) {
              com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
            }
            if (paramzbfc.X())
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, localObject);
              com.aspose.cells.b.a.a.zf.a(localArrayList4, Boolean.valueOf(bool));
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
  
  static ArrayList a(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    zje localzje = paramzbfc.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 38;
    arrayOfInt[1] = 41;
    int i = paramzbfc.af();
    zbs localzbs2;
    zbs localzbs1;
    if (i == 1)
    {
      localzbs2 = localzje.e();
      localzbs1 = localzje.E();
    }
    else
    {
      localzbs2 = localzje.g();
      localzbs1 = localzje.G();
    }
    if (localzbs2.k() == 2) {
      return a(paramzr, paramzbfc, paramzp, paramFloat);
    }
    float f1 = 0.0F;
    if (!localzbs1.p()) {
      f1 = paramzp.d() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    }
    zbfe localzbfe = localzje.z();
    int j = localzbfe.getCount();
    float f2 = paramzbfc.J() / 100.0F;
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    boolean bool1 = paramzbfc.L();
    zanq localzanq1 = paramzbfc.O();
    zanq localzanq2 = paramzbfc.P();
    zjx localzjx1 = paramzbfc.S();
    zjx localzjx2 = paramzbfc.T();
    int k = 0;
    int m = paramInt;
    if (localzbs2.p) {
      m = (int)localzbs2.z();
    }
    if ((localzbs2.f()) || (localzje.u()))
    {
      k = m;
    }
    else
    {
      k = m - 1;
      if (k == 0) {
        k = 1;
      }
    }
    double d3 = paramzp.e() / k;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    List localList = localzbfe.a(i, arrayOfInt);
    int i2;
    for (int n = 0; n < localList.size(); n++)
    {
      zbfc localzbfc = (zbfc)localList.get(n);
      if (((!localzje.ap()) || (localzbfc.equals(paramzbfc))) && ((paramzbfc.N()) || (paramzbfc.M()) || (localzbfc.equals(paramzbfc))))
      {
        i2 = localzbfe.a(localzbfc, i, arrayOfInt);
        int i3 = localzbfc.ai();
        ArrayList localArrayList4 = new ArrayList();
        ArrayList localArrayList5 = new ArrayList();
        zkg localzkg = localzbfc.D();
        for (int i5 = 0; i5 < paramInt; i5++)
        {
          zke localzke1 = localzkg.b(i5);
          if (localzke1 != null)
          {
            double d4 = (float)d3 * i5 + 1.0F;
            if ((localzbs2.f()) || (localzje.u())) {
              d4 += (float)(d3 / 2.0D);
            }
            if (localzbs2.p()) {
              d4 = paramzp.c() + paramzp.e() - d4;
            } else {
              d4 = paramzp.c() + d4;
            }
            double d5 = localzke1.w();
            double d6 = d5;
            int i9;
            double d7;
            if (d5 >= 0.0D) {
              for (i9 = 0; i9 < i2; i9++)
              {
                localObject3 = ((zbfc)localList.get(i9)).D().b(i5);
                if (localObject3 != null)
                {
                  d7 = ((zke)localObject3).w();
                  d6 += d7;
                }
              }
            } else {
              for (i9 = 0; i9 < i2; i9++)
              {
                localObject3 = ((zbfc)localList.get(i9)).D().b(i5);
                if (localObject3 != null)
                {
                  d7 = ((zke)localObject3).w();
                  d6 += d7;
                }
              }
            }
            float f8 = (float)(Math.abs(d6) / (localzbs1.z() - localzbs1.D()) * paramzp.f());
            Object localObject3 = paramzbfc.x();
            if ((localObject3 != null) && (((zub)localObject3).d() != 2))
            {
              localzo2 = new zo((float)d4, f1);
              double d8 = 0.0D;
              double d9 = 0.0D;
              float f9 = 0.0F;
              float f10 = 0.0F;
              if ((localObject3 != null) && (!localzke1.a()))
              {
                switch (((zub)localObject3).g())
                {
                case 1: 
                  d8 = ((zub)localObject3).c();
                  d9 = d8;
                  break;
                case 2: 
                  d8 = ((zub)localObject3).c() * d5 / 100.0D;
                  d9 = -d8;
                  break;
                case 0: 
                  double d10 = ((zub)localObject3).e().size() > i5 ? ((zub)localObject3).a(((zub)localObject3).e().get(i5)) : 0.0D;
                  d8 = d10;
                  d10 = ((zub)localObject3).f().size() > i5 ? ((zub)localObject3).a(((zub)localObject3).f().get(i5)) : 0.0D;
                  d9 = d10;
                }
                f9 = (float)d8 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
                f10 = (float)d9 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
                if (!localzbs1.p())
                {
                  if (d6 < 0.0D) {
                    localzo2.b(localzo2.e() + f8);
                  } else {
                    localzo2.b(localzo2.e() - f8);
                  }
                }
                else if (d6 < 0.0D) {
                  localzo2.b(localzo2.e() - f8);
                } else {
                  localzo2.b(localzo2.e() + f8);
                }
              }
              if ((localzbfc.equals(paramzbfc)) && (!localzke1.a())) {
                ((zub)localObject3).a(localzo2, f9, f10);
              }
            }
            if (!localzbs1.p())
            {
              if (d6 < 0.0D) {
                f8 = f1 + f8;
              } else {
                f8 = f1 - f8;
              }
            }
            else if (d6 < 0.0D) {
              f8 = f1 - f8;
            } else {
              f8 = f1 + f8;
            }
            zo localzo2 = new zo((float)d4, f8);
            com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo2);
            com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i5));
            if (localzbfc.equals(paramzbfc))
            {
              if (bool1) {
                zanv.a(paramzr, (float)d4, f8, (float)d4, paramFloat, localzanq1);
              }
              com.aspose.cells.b.a.a.zf.a(localArrayList3, localzo2);
              if ((!localzke1.a()) && (a(localzke1, d2, d1)))
              {
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i3);
                arrayOfObject[1] = Integer.valueOf(i5);
                arrayOfObject[2] = localzo2;
                arrayOfObject[3] = localzbs2;
                com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
              }
            }
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i5));
            if (localzbfc.equals(paramzbfc)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, null);
            }
          }
        }
        if (localzbfc.equals(paramzbfc))
        {
          com.aspose.cells.a.d.zs localzs = zanv.a(localzbfc.z());
          a(paramzr, localzbfc, localArrayList4, localArrayList5, localzs, paramzp);
          localzs.dispose();
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList4);
      }
    }
    for (n = 0; n < paramInt; n++)
    {
      int i1 = 0;
      i2 = 0;
      float f3 = 0.0F;
      float f4 = 0.0F;
      float f5 = 0.0F;
      int i4 = 0;
      int i6 = 0;
      float f6 = 0.0F;
      float f7 = 0.0F;
      Object localObject1;
      Object localObject2;
      for (int i7 = 0; i7 < localArrayList2.size(); i7++)
      {
        localObject1 = (ArrayList)localArrayList2.get(i7);
        localObject2 = (zbfc)localList.get(i7);
        zke localzke2 = ((zbfc)localObject2).D().b(n);
        if (((localzke2 == null) || ((!localzke2.d()) && (!localzke2.J()))) && (((ArrayList)localObject1).size() > n) && (((ArrayList)localObject1).get(n) != null))
        {
          zo localzo1 = (zo)((ArrayList)localObject1).get(n);
          f5 = localzo1.d();
          if (i1 == 0)
          {
            f3 = localzo1.e();
            i1 = 1;
          }
          else if (i2 == 0)
          {
            if (f3 < localzo1.e())
            {
              f4 = f3;
              f3 = localzo1.e();
              i2 = 1;
            }
            else
            {
              f4 = localzo1.e();
              i2 = 1;
            }
          }
          else
          {
            if (f3 < localzo1.e()) {
              f3 = localzo1.e();
            }
            if (f4 > localzo1.e()) {
              f4 = localzo1.e();
            }
          }
          if (i7 == 0)
          {
            f6 = localzo1.e();
            i4 = 1;
          }
          else if (i7 == j - 1)
          {
            f7 = localzo1.e();
            i6 = 1;
          }
        }
      }
      if ((paramzbfc.M()) && (i1 != 0) && (i2 != 0))
      {
        float[] arrayOfFloat = { f5 };
        localObject1 = new float[] { f3 };
        arrayOfFloat[0] = f5;
        localObject2 = new float[] { f4 };
        boolean bool2 = a(localzbs1.X(), paramzp, arrayOfFloat, (float[])localObject1, arrayOfFloat, (float[])localObject2);
        f5 = arrayOfFloat[0];
        f3 = localObject1[0];
        f5 = arrayOfFloat[0];
        f4 = localObject2[0];
        if (bool2) {
          zanv.a(paramzr, f5, f3, f5, f4, localzanq2);
        }
      }
      if ((paramzbfc.N()) && (i4 != 0) && (i6 != 0))
      {
        int i8 = (int)(d3 / (1.0F + f2));
        localObject1 = new zq();
        if (f6 <= f7)
        {
          ((zq)localObject1).c(i8);
          ((zq)localObject1).d(f7 - f6);
          ((zq)localObject1).a(f5 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f6);
          a(paramzr, localzjx2, (zq)localObject1);
        }
        else
        {
          ((zq)localObject1).c(i8);
          ((zq)localObject1).d(f6 - f7);
          ((zq)localObject1).a(f5 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f7);
          a(paramzr, localzjx1, (zq)localObject1);
        }
      }
    }
    a(paramzr, paramzbfc, localArrayList3, paramzp);
    return localArrayList1;
  }
  
  private static ArrayList a(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    zje localzje = paramzbfc.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 38;
    arrayOfInt[1] = 41;
    int i = paramzbfc.af();
    zbfe localzbfe = localzje.z();
    int j = localzbfe.getCount();
    float f1 = paramzbfc.J() / 100.0F;
    zbs localzbs2;
    zbs localzbs1;
    ArrayList localArrayList2;
    if (i == 1)
    {
      localzbs2 = localzje.e();
      localzbs1 = localzje.E();
      localArrayList2 = ziy.a(localzje.z().c(), paramzbfc.v().U());
    }
    else
    {
      localzbs2 = localzje.g();
      localzbs1 = localzje.G();
      localArrayList2 = ziy.a(localzje.z().d(), paramzbfc.v().U());
    }
    float f2 = 0.0F;
    if (!localzbs1.p()) {
      f2 = paramzp.d() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    } else {
      f2 = paramzp.j() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    }
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    boolean bool1 = paramzbfc.L();
    zanq localzanq1 = paramzbfc.O();
    zanq localzanq2 = paramzbfc.P();
    zjx localzjx1 = paramzbfc.S();
    zjx localzjx2 = paramzbfc.T();
    int k = localArrayList2.size();
    int m = localzbs2.j();
    int n = (int)localzbs2.D();
    int i1 = (int)localzbs2.z();
    int i2 = 0;
    if ((localzbs2.f()) || (localzje.u()))
    {
      i2 = zbu.a(m, i1, n, paramzbfc.v().U()) + 1;
    }
    else
    {
      i2 = zbu.a(m, i1, n, paramzbfc.v().U());
      if (i2 == 0) {
        i2 = 1;
      }
    }
    double d3 = paramzp.e() / i2;
    float f3 = 0.0F;
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    List localList = localzbfe.a(i, arrayOfInt);
    int i5;
    for (int i3 = 0; i3 < localList.size(); i3++)
    {
      zbfc localzbfc = (zbfc)localList.get(i3);
      if (((!localzje.ap()) || (localzbfc.equals(paramzbfc))) && ((paramzbfc.N()) || (paramzbfc.M()) || (localzbfc.equals(paramzbfc))))
      {
        i5 = localzbfe.a(localzbfc, i, arrayOfInt);
        int i6 = localzbfc.ai();
        ArrayList localArrayList5 = new ArrayList();
        ArrayList localArrayList6 = new ArrayList();
        for (int i7 = 0; i7 < k; i7++)
        {
          zke localzke1 = localzbfc.D().b(i7);
          if (localzke1 != null)
          {
            int i10 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i7)));
            i10 = zbu.a(m, i10, paramzbfc.v().U());
            int i11 = zbu.a(m, i10, n, paramzbfc.v().U());
            float f9 = (float)(d3 * i11);
            f3 = (float)(d3 * zbu.a(m, zbu.a(localzbs2.j(), localzbs2.y(), (int)localzbs2.x(), i10, paramzbfc.v().U()), i10, paramzbfc.v().U()));
            if ((localzbs2.f()) || (localzje.u())) {
              f9 += (float)(d3 / 2.0D);
            }
            float f10 = 0.0F;
            if (localzbs2.p()) {
              f10 = paramzp.c() + paramzp.e() - f9;
            } else {
              f10 = paramzp.c() + f9;
            }
            double d4 = localzke1.w();
            double d5 = d4;
            int i14;
            double d6;
            if (d4 >= 0.0D) {
              for (i14 = 0; i14 < i5; i14++)
              {
                localObject3 = ((zbfc)localList.get(i14)).D().b(i7);
                if (localObject3 != null)
                {
                  d6 = ((zke)localObject3).w();
                  d5 += d6;
                }
              }
            } else {
              for (i14 = 0; i14 < i5; i14++)
              {
                localObject3 = ((zbfc)localList.get(i14)).D().b(i7);
                if (localObject3 != null)
                {
                  d6 = ((zke)localObject3).w();
                  d5 += d6;
                }
              }
            }
            float f11 = (float)(Math.abs(d5) / (localzbs1.z() - localzbs1.D()) * paramzp.f());
            Object localObject3 = paramzbfc.x();
            if ((localObject3 != null) && (((zub)localObject3).d() != 2))
            {
              localzo2 = new zo(f10, f2);
              double d7 = 0.0D;
              double d8 = 0.0D;
              float f12 = 0.0F;
              float f13 = 0.0F;
              if ((localObject3 != null) && (!localzke1.a()))
              {
                switch (((zub)localObject3).g())
                {
                case 1: 
                  d7 = ((zub)localObject3).c();
                  d8 = d7;
                  break;
                case 2: 
                  d7 = ((zub)localObject3).c() * d4 / 100.0D;
                  d8 = -d7;
                  break;
                case 0: 
                  double d9 = ((zub)localObject3).e().size() > i7 ? ((zub)localObject3).a(((zub)localObject3).e().get(i7)) : 0.0D;
                  d7 = d9;
                  d9 = ((zub)localObject3).f().size() > i7 ? ((zub)localObject3).a(((zub)localObject3).f().get(i7)) : 0.0D;
                  d8 = d9;
                }
                f12 = (float)d7 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
                f13 = (float)d8 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
                if (!localzbs1.p())
                {
                  if (d5 < 0.0D) {
                    localzo2.b(localzo2.e() + f11);
                  } else {
                    localzo2.b(localzo2.e() - f11);
                  }
                }
                else if (d5 < 0.0D) {
                  localzo2.b(localzo2.e() - f11);
                } else {
                  localzo2.b(localzo2.e() + f11);
                }
              }
              if ((localzbfc.equals(paramzbfc)) && (!localzke1.a())) {
                ((zub)localObject3).a(localzo2, f12, f13);
              }
            }
            if (!localzbs1.p())
            {
              if (d5 < 0.0D) {
                f11 = f2 + f11;
              } else {
                f11 = f2 - f11;
              }
            }
            else if (d5 < 0.0D) {
              f11 = f2 - f11;
            } else {
              f11 = f2 + f11;
            }
            zo localzo2 = new zo(f10, f11);
            zkn.a(localzo2, localArrayList5, localArrayList6, i7, localzbs2.p());
            if (localzbfc.equals(paramzbfc))
            {
              if (bool1) {
                zanv.a(paramzr, f10, f11, f10, paramFloat, localzanq1);
              }
              if (!localzke1.a()) {
                com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo2);
              } else {
                com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
              }
              if ((!localzke1.a()) && (a(localzke1, d2, d1)))
              {
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i6);
                arrayOfObject[1] = Integer.valueOf(i7);
                arrayOfObject[2] = localzo2;
                arrayOfObject[3] = localzbs2;
                com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
              }
            }
          }
          else
          {
            if (localzbs2.p())
            {
              localArrayList5.add(0, null);
              localArrayList6.add(0, Integer.valueOf(i7));
            }
            else
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList5, null);
              com.aspose.cells.b.a.a.zf.a(localArrayList6, Integer.valueOf(i7));
            }
            if (localzbfc.equals(paramzbfc)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            }
          }
        }
        if (localzbfc.equals(paramzbfc))
        {
          com.aspose.cells.a.d.zs localzs = zanv.a(localzbfc.z());
          a(paramzr, localzbfc, localArrayList5, localArrayList6, localzs, paramzp);
          localzs.dispose();
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList5);
      }
    }
    for (i3 = 0; i3 < k; i3++)
    {
      int i4 = 0;
      i5 = 0;
      float f4 = 0.0F;
      float f5 = 0.0F;
      float f6 = 0.0F;
      int i8 = 0;
      int i9 = 0;
      float f7 = 0.0F;
      float f8 = 0.0F;
      Object localObject1;
      Object localObject2;
      for (int i12 = 0; i12 < localArrayList3.size(); i12++)
      {
        localObject1 = (ArrayList)localArrayList3.get(i12);
        localObject2 = (zbfc)localList.get(i12);
        zke localzke2 = ((zbfc)localObject2).D().b(i3);
        if (((localzke2 == null) || ((!localzke2.d()) && (!localzke2.J()))) && (((ArrayList)localObject1).size() > i3) && (((ArrayList)localObject1).get(i3) != null))
        {
          zo localzo1 = (zo)((ArrayList)localObject1).get(i3);
          f6 = localzo1.d();
          if (i4 == 0)
          {
            f4 = localzo1.e();
            i4 = 1;
          }
          else if (i5 == 0)
          {
            if (f4 < localzo1.e())
            {
              f5 = f4;
              f4 = localzo1.e();
              i5 = 1;
            }
            else
            {
              f5 = localzo1.e();
              i5 = 1;
            }
          }
          else
          {
            if (f4 < localzo1.e()) {
              f4 = localzo1.e();
            }
            if (f5 > localzo1.e()) {
              f5 = localzo1.e();
            }
          }
          if (i12 == 0)
          {
            f7 = localzo1.e();
            i8 = 1;
          }
          else if (i12 == j - 1)
          {
            f8 = localzo1.e();
            i9 = 1;
          }
        }
      }
      if ((paramzbfc.M()) && (i4 != 0) && (i5 != 0))
      {
        float[] arrayOfFloat = { f6 };
        localObject1 = new float[] { f4 };
        arrayOfFloat[0] = f6;
        localObject2 = new float[] { f5 };
        boolean bool2 = a(localzbs1.X(), paramzp, arrayOfFloat, (float[])localObject1, arrayOfFloat, (float[])localObject2);
        f6 = arrayOfFloat[0];
        f4 = localObject1[0];
        f6 = arrayOfFloat[0];
        f5 = localObject2[0];
        if (bool2) {
          zanv.a(paramzr, f6, f4, f6, f5, localzanq2);
        }
      }
      if ((paramzbfc.N()) && (i8 != 0) && (i9 != 0))
      {
        int i13 = (int)(f3 / (1.0F + f1));
        localObject1 = new zq();
        if (f7 <= f8)
        {
          ((zq)localObject1).c(i13);
          ((zq)localObject1).d(f8 - f7);
          ((zq)localObject1).a(f6 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f7);
          a(paramzr, localzjx2, (zq)localObject1);
        }
        else
        {
          ((zq)localObject1).c(i13);
          ((zq)localObject1).d(f7 - f8);
          ((zq)localObject1).a(f6 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f8);
          a(paramzr, localzjx1, (zq)localObject1);
        }
      }
    }
    a(paramzr, paramzbfc, localArrayList4, paramzp);
    return localArrayList1;
  }
  
  static ArrayList b(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
    throws Exception
  {
    zje localzje = paramzbfc.v();
    int i = paramzbfc.af();
    int j = 16;
    zbfe localzbfe = localzje.z();
    int k = localzbfe.getCount();
    zbs localzbs2;
    zbs localzbs1;
    int m;
    if (i == 1)
    {
      localzbs2 = localzje.e();
      localzbs1 = localzje.E();
      m = localzbfe.b(1, j);
    }
    else
    {
      localzbs2 = localzje.g();
      localzbs1 = localzje.G();
      m = localzbfe.b(2, j);
    }
    if (localzbs2.k() == 2) {
      return b(paramzr, paramzbfc, paramzp);
    }
    float f1 = 0.0F;
    if (!localzbs1.p()) {
      f1 = paramzp.d() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    }
    float f2 = paramzbfc.K() / 100.0F;
    float f3 = paramzbfc.J() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    int n = 0;
    int i1 = paramInt;
    if (localzbs2.p) {
      i1 = (int)localzbs2.z();
    }
    if ((localzbs2.f()) || (localzje.u()))
    {
      n = i1;
    }
    else
    {
      n = i1 - 1;
      if (n == 0) {
        n = 1;
      }
    }
    double d1 = paramzp.e() / n;
    float f4 = 0.0F;
    List localList = localzbfe.a(i, new int[] { j });
    int i2 = localzbfe.a(paramzbfc, i, new int[] { j });
    if (i2 == -1) {
      return localArrayList1;
    }
    int i3 = paramzbfc.ai();
    zkg localzkg = paramzbfc.D();
    ArrayList localArrayList2 = new ArrayList();
    for (int i4 = 0; i4 < localzkg.getCount(); i4++)
    {
      zke localzke1 = localzkg.b(i4);
      float f5 = (float)d1 / (m - f2 * (m - 1) + f3);
      float f6 = f5 * f2;
      float f7 = f5 * f3;
      f4 = i2 * (f5 - f6);
      float f8 = (float)d1 * i4 + f7 / 2.0F + f4;
      if ((!localzbs2.f()) && (!localzje.u())) {
        f8 -= (float)(d1 / 2.0D);
      }
      if (localzbs2.p()) {
        f8 = paramzp.c() + paramzp.e() - f8 - f5;
      } else {
        f8 = paramzp.c() + f8;
      }
      ArrayList localArrayList3 = new ArrayList();
      double d2 = localzke1.w();
      double d3 = d2;
      double d4 = 0.0D;
      zke localzke2;
      double d5;
      if (d2 >= 0.0D) {
        for (i5 = 0; i5 < i2; i5++)
        {
          localzke2 = ((zbfc)localList.get(i5)).D().b(i4);
          if (localzke2 != null)
          {
            d5 = localzke2.w();
            if (d5 > 0.0D) {
              d3 += d5;
            }
          }
        }
      } else {
        for (i5 = 0; i5 < i2; i5++)
        {
          localzke2 = ((zbfc)localList.get(i5)).D().b(i4);
          if (localzke2 != null)
          {
            d5 = localzke2.w();
            if (d5 <= 0.0D) {
              d3 += d5;
            }
          }
        }
      }
      for (int i5 = 0; i5 < localList.size(); i5++)
      {
        localzke2 = ((zbfc)localList.get(i5)).D().b(i4);
        if (localzke2 != null)
        {
          d5 = localzke2.w();
          d4 += Math.abs(d5);
        }
      }
      if ((d4 != 0.0D) && (d4 != 0.0D))
      {
        float f9 = (float)(Math.abs(d2) * 100.0D / d4 / (localzbs1.z() - localzbs1.D()) * paramzp.f());
        float f10 = (float)(Math.abs(d3) * 100.0D / d4 / (localzbs1.z() - localzbs1.D()) * paramzp.f());
        int i6 = 0;
        if (f9 == 0.0F) {
          i6 = 1;
        }
        zub localzub = paramzbfc.x();
        if ((localzub != null) && (localzub.d() != 2))
        {
          localObject1 = new zo(f8 + f5 / 2.0F, f1);
          double d6 = 0.0D;
          double d7 = 0.0D;
          float f11 = 0.0F;
          float f12 = 0.0F;
          if (localzub != null)
          {
            switch (localzub.g())
            {
            case 1: 
              d6 = localzub.c();
              d7 = d6;
              break;
            case 2: 
              d6 = localzub.c() * d2 / 100.0D;
              d7 = -d6;
              break;
            case 0: 
              double d8 = localzub.e().size() > i4 ? localzub.a(localzub.e().get(i4)) : 0.0D;
              d6 = d8;
              d8 = localzub.f().size() > i4 ? localzub.a(localzub.f().get(i4)) : 0.0D;
              d7 = d8;
            }
            d7 = d7 * 100.0D / d4;
            d6 = d6 * 100.0D / d4;
            f11 = (float)d6 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
            f12 = (float)d7 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
            if (!localzbs1.p())
            {
              if (d2 <= 0.0D) {
                ((zo)localObject1).b(((zo)localObject1).e() + f10);
              } else {
                ((zo)localObject1).b(((zo)localObject1).e() - f10);
              }
            }
            else if (d2 <= 0.0D) {
              ((zo)localObject1).b(((zo)localObject1).e() - f10);
            } else {
              ((zo)localObject1).b(((zo)localObject1).e() + f10);
            }
          }
          localzub.a((zo)localObject1, f11, f12);
        }
        if (!localzbs1.p())
        {
          if (d2 < 0.0D) {
            f10 = f1 + f10 - f9;
          } else {
            f10 = f1 - f10;
          }
        }
        else if (d2 < 0.0D) {
          f10 = f1 - f10;
        } else {
          f10 = f1 + f10 - f9;
        }
        if (localzke1.k().e()) {
          f9 -= 1.0F;
        }
        Object localObject1 = new zq(f8, f10, f5, f9 + 1.0F);
        zq localzq = new zq(((zq)localObject1).f(), ((zq)localObject1).g(), ((zq)localObject1).h(), ((zq)localObject1).i());
        if (((zq)localObject1).g() < paramzp.d())
        {
          ((zq)localObject1).d(((zq)localObject1).i() - (paramzp.d() - ((zq)localObject1).g()));
          ((zq)localObject1).b(paramzp.d());
        }
        if (((zq)localObject1).m() > paramzp.j() + 1) {
          ((zq)localObject1).d(((zq)localObject1).i() - (((zq)localObject1).m() - paramzp.j()));
        }
        if ((((zq)localObject1).l() >= paramzp.c()) && (((zq)localObject1).j() <= paramzp.i()))
        {
          if (((zq)localObject1).f() < paramzp.c())
          {
            ((zq)localObject1).c(((zq)localObject1).h() - (paramzp.c() - ((zq)localObject1).f()));
            ((zq)localObject1).a(paramzp.c());
          }
          else if (((zq)localObject1).l() > paramzp.i())
          {
            ((zq)localObject1).c(((zq)localObject1).h() - (((zq)localObject1).l() - paramzp.i()));
          }
          if ((((zq)localObject1).h() + 1.0F >= (f5 - 1.0F) / 3.0F) && (((zq)localObject1).i() >= 0.0F))
          {
            if (i6 == 0) {
              a(paramzr, localzke1, (zq)localObject1, localzje.g(paramzbfc.ax()).a(i3), f1, localzbs1);
            }
            localObject2 = new Object[5];
            boolean bool;
            if (localzq.g() + localzq.i() / 2.0F < f1) {
              bool = true;
            } else if (d2 != 0.0D) {
              bool = false;
            } else if (localzbs1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            localObject2[0] = Integer.valueOf(i3);
            localObject2[1] = Integer.valueOf(i4);
            localObject2[2] = localObject1;
            localObject2[3] = localzbs2;
            localObject2[4] = Boolean.valueOf(bool);
            if (!localzke1.a()) {
              com.aspose.cells.b.a.a.zf.a(localArrayList1, localObject2);
            }
            if (paramzbfc.X())
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, localObject1);
              com.aspose.cells.b.a.a.zf.a(localArrayList3, Boolean.valueOf(bool));
            }
          }
        }
        Object localObject2 = { localArrayList2 };
        a(paramzr, paramzbfc, (ArrayList[])localObject2, localArrayList3);
        localArrayList2 = localObject2[0];
      }
    }
    return localArrayList1;
  }
  
  private static ArrayList b(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    zje localzje = paramzbfc.v();
    int i = paramzbfc.af();
    int j = 16;
    int k = localzje.z().getCount();
    zbfe localzbfe = localzje.z();
    float f1 = paramzbfc.K() / 100.0F;
    float f2 = paramzbfc.J() / 100.0F;
    zbs localzbs1;
    zbs localzbs2;
    int m;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbs1 = localzje.e();
      localzbs2 = localzje.E();
      m = localzbfe.b(1, j);
      localArrayList1 = ziy.a(localzje.z().c(), paramzbfc.v().U());
    }
    else
    {
      localzbs1 = localzje.g();
      localzbs2 = localzje.G();
      m = localzbfe.b(2, j);
      localArrayList1 = ziy.a(localzje.z().d(), paramzbfc.v().U());
    }
    float f3 = 0.0F;
    if (!localzbs2.p()) {
      f3 = paramzp.d() + (float)localzbs2.z() / (float)(localzbs2.z() - localzbs2.D()) * paramzp.f();
    } else {
      f3 = paramzp.j() - (float)localzbs2.z() / (float)(localzbs2.z() - localzbs2.D()) * paramzp.f();
    }
    double d1 = localzbs2.D();
    double d2 = localzbs2.z();
    ArrayList localArrayList2 = new ArrayList();
    int n = localArrayList1.size();
    int i1 = localzbs1.j();
    int i2 = (int)localzbs1.D();
    int i3 = (int)localzbs1.z();
    int i4 = 0;
    if ((localzbs1.f()) || (localzje.u()))
    {
      i4 = zbu.a(i1, i3, i2, paramzbfc.v().U()) + 1;
    }
    else
    {
      i4 = zbu.a(i1, i3, i2, paramzbfc.v().U());
      if (i4 == 0) {
        i4 = 1;
      }
    }
    double d3 = paramzp.e() / i4;
    ArrayList localArrayList3 = new ArrayList();
    for (int i5 = 0; i5 < n; i5++)
    {
      zke localzke1 = paramzbfc.D().b(i5);
      float f4 = (float)(d3 / (m - f1 * (m - 1) + f2));
      float f5 = f4 * f1;
      float f6 = f4 * f2;
      int i6 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i5)));
      i6 = zbu.a(i1, i6, paramzbfc.v().U());
      int i7 = zbu.a(i1, i6, i2, paramzbfc.v().U());
      float f7 = (float)(d3 * i7);
      if ((!localzbs1.f()) && (!localzje.u())) {
        f7 -= (float)(d3 / 2.0D);
      }
      float f8 = 0.0F;
      if (localzbs1.p()) {
        f8 = paramzp.c() + paramzp.e() - f7 - f6 / 2.0F - f4 - 1.0F;
      } else {
        f8 = paramzp.c() + f7 + f6 / 2.0F + 1.0F;
      }
      List localList = localzbfe.a(i, new int[] { j });
      int i8 = localzbfe.a(paramzbfc, i, new int[] { j });
      if (i8 == -1) {
        return new ArrayList();
      }
      int i9 = paramzbfc.ai();
      if (localzbs1.p()) {
        f8 -= i8 * (f4 - f5);
      } else {
        f8 += i8 * (f4 - f5);
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
        if ((d6 == 0.0D) || (d6 == 0.0D)) {
          continue;
        }
        float f9 = (float)(Math.abs(d4) * 100.0D / d6 / (localzbs2.z() - localzbs2.D()) * paramzp.f());
        float f10 = (float)(Math.abs(d5) * 100.0D / d6 / (localzbs2.z() - localzbs2.D()) * paramzp.f());
        int i11 = 0;
        if (f9 == 0.0F) {
          i11 = 1;
        }
        zub localzub = paramzbfc.x();
        if ((localzub != null) && (localzub.d() != 2) && (!localzke1.a()))
        {
          localObject = new zo(f8 + f4 / 2.0F, f3);
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
              double d10 = localzub.e().size() > i5 ? localzub.a(localzub.e().get(i5)) : 0.0D;
              d8 = d10;
              d10 = localzub.f().size() > i5 ? localzub.a(localzub.f().get(i5)) : 0.0D;
              d9 = d10;
            }
            d9 = d9 * 100.0D / d6;
            d8 = d8 * 100.0D / d6;
            f11 = (float)d8 / (float)(localzbs2.z() - localzbs2.D()) * paramzp.f();
            f12 = (float)d9 / (float)(localzbs2.z() - localzbs2.D()) * paramzp.f();
            if (!localzbs2.p())
            {
              if (d4 <= 0.0D) {
                ((zo)localObject).b(((zo)localObject).e() + f10);
              } else {
                ((zo)localObject).b(((zo)localObject).e() - f10);
              }
            }
            else if (d4 <= 0.0D) {
              ((zo)localObject).b(((zo)localObject).e() - f10);
            } else {
              ((zo)localObject).b(((zo)localObject).e() + f10);
            }
          }
          localzub.a((zo)localObject, f11, f12);
        }
        if (!localzbs2.p())
        {
          if (d4 < 0.0D) {
            f10 = f3 + f10 - f9;
          } else {
            f10 = f3 - f10;
          }
        }
        else if (d4 < 0.0D) {
          f10 = f3 - f10;
        } else {
          f10 = f3 + f10 - f9;
        }
        if (localzke1.k().e()) {
          f9 -= 1.0F;
        }
        Object localObject = new zq(f8, f10, f4, f9 + 1.0F);
        zq localzq = new zq(((zq)localObject).f(), ((zq)localObject).g(), ((zq)localObject).h(), ((zq)localObject).i());
        if (((zq)localObject).g() < paramzp.d())
        {
          ((zq)localObject).d(((zq)localObject).i() - (paramzp.d() - ((zq)localObject).g()));
          ((zq)localObject).b(paramzp.d());
        }
        if (((zq)localObject).m() > paramzp.j() + 1) {
          ((zq)localObject).d(((zq)localObject).i() - (((zq)localObject).m() - paramzp.j()));
        }
        if ((((zq)localObject).l() >= paramzp.c()) && (((zq)localObject).j() <= paramzp.i()))
        {
          if (((zq)localObject).f() < paramzp.c())
          {
            ((zq)localObject).c(((zq)localObject).h() - (paramzp.c() - ((zq)localObject).f()));
            ((zq)localObject).a(paramzp.c());
          }
          else if (((zq)localObject).l() > paramzp.i())
          {
            ((zq)localObject).c(((zq)localObject).h() - (((zq)localObject).l() - paramzp.i()));
          }
          if (((zq)localObject).h() + 1.0F >= (f4 - 1.0F) / 3.0F)
          {
            if ((i11 == 0) && (!localzke1.a())) {
              a(paramzr, localzke1, (zq)localObject, localzje.g(paramzbfc.ax()).a(i9), f3, localzbs2);
            }
            Object[] arrayOfObject = new Object[5];
            boolean bool;
            if (localzq.g() + localzq.i() / 2.0F < f3) {
              bool = true;
            } else if (d4 != 0.0D) {
              bool = false;
            } else if (localzbs2.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i9);
            arrayOfObject[1] = Integer.valueOf(i5);
            arrayOfObject[2] = localObject;
            arrayOfObject[3] = localzbs1;
            arrayOfObject[4] = Boolean.valueOf(bool);
            if (!localzke1.a()) {
              com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
            }
            if (paramzbfc.X())
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, localObject);
              com.aspose.cells.b.a.a.zf.a(localArrayList4, Boolean.valueOf(bool));
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
  
  static ArrayList b(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt)
    throws Exception
  {
    zje localzje = paramzbfc.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 39;
    arrayOfInt[1] = 42;
    int i = paramzbfc.af();
    zbs localzbs2;
    zbs localzbs1;
    if (i == 1)
    {
      localzbs2 = localzje.e();
      localzbs1 = localzje.E();
    }
    else
    {
      localzbs2 = localzje.g();
      localzbs1 = localzje.G();
    }
    if (localzbs2.k() == 2) {
      return b(paramzr, paramzbfc, paramzp, paramFloat);
    }
    float f1 = 0.0F;
    if (!localzbs1.p()) {
      f1 = paramzp.d() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    }
    zbfe localzbfe = localzje.z();
    int j = localzbfe.getCount();
    float f2 = paramzbfc.J() / 100.0F;
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    boolean bool1 = paramzbfc.L();
    zanq localzanq1 = paramzbfc.O();
    zanq localzanq2 = paramzbfc.P();
    zjx localzjx1 = paramzbfc.S();
    zjx localzjx2 = paramzbfc.T();
    ArrayList localArrayList1 = new ArrayList();
    int k = 0;
    int m = paramInt;
    if (localzbs2.p) {
      m = (int)localzbs2.z();
    }
    if ((localzbs2.f()) || (localzje.u()))
    {
      k = m;
    }
    else
    {
      k = m - 1;
      if (k == 0) {
        k = 1;
      }
    }
    double d3 = paramzp.e() / k;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    List localList = localzbfe.a(i, arrayOfInt);
    int i2;
    for (int n = 0; n < localList.size(); n++)
    {
      zbfc localzbfc = (zbfc)localList.get(n);
      if (((!localzje.ap()) || (localzbfc.equals(paramzbfc))) && ((paramzbfc.N()) || (paramzbfc.M()) || (localzbfc.equals(paramzbfc))))
      {
        i2 = localzbfe.a(localzbfc, i, arrayOfInt);
        int i3 = localzbfc.ai();
        ArrayList localArrayList4 = new ArrayList();
        ArrayList localArrayList5 = new ArrayList();
        zkg localzkg = localzbfc.D();
        for (int i5 = 0; i5 < paramInt; i5++)
        {
          zke localzke1 = localzkg.b(i5);
          if (localzke1 != null)
          {
            double d4 = (float)d3 * i5 + 1.0F;
            if ((localzbs2.f()) || (localzje.u())) {
              d4 += (float)(d3 / 2.0D);
            }
            if (localzbs2.p()) {
              d4 = paramzp.c() + paramzp.e() - d4;
            } else {
              d4 = paramzp.c() + d4;
            }
            double d5 = localzke1.w();
            double d6 = d5;
            double d7 = 0.0D;
            double d8;
            if (d5 >= 0.0D) {
              for (i9 = 0; i9 < i2; i9++)
              {
                localObject3 = ((zbfc)localList.get(i9)).D().b(i5);
                if (localObject3 != null)
                {
                  d8 = ((zke)localObject3).w();
                  if (d8 > 0.0D) {
                    d6 += d8;
                  }
                }
              }
            } else {
              for (i9 = 0; i9 < i2; i9++)
              {
                localObject3 = ((zbfc)localList.get(i9)).D().b(i5);
                if (localObject3 != null)
                {
                  d8 = ((zke)localObject3).w();
                  if (d8 <= 0.0D) {
                    d6 += d8;
                  }
                }
              }
            }
            for (int i9 = 0; i9 < localList.size(); i9++)
            {
              localObject3 = ((zbfc)localList.get(i9)).D().b(i5);
              if (localObject3 != null)
              {
                d8 = ((zke)localObject3).w();
                d7 += Math.abs(d8);
              }
            }
            float f8;
            if (d7 == 0.0D) {
              f8 = 0.0F;
            } else {
              f8 = (float)Math.abs(d6) * 100.0F / (float)d7 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
            }
            Object localObject3 = paramzbfc.x();
            if ((localObject3 != null) && (((zub)localObject3).d() != 2))
            {
              zo localzo2 = new zo((float)d4, f1);
              double d9 = 0.0D;
              double d10 = 0.0D;
              float f10 = 0.0F;
              float f11 = 0.0F;
              if ((localObject3 != null) && (!localzke1.a()))
              {
                switch (((zub)localObject3).g())
                {
                case 1: 
                  d9 = ((zub)localObject3).c();
                  d10 = d9;
                  break;
                case 2: 
                  d9 = ((zub)localObject3).c() * d5 / 100.0D;
                  d10 = -d9;
                  break;
                case 0: 
                  double d11 = ((zub)localObject3).e().size() > i5 ? ((zub)localObject3).a(((zub)localObject3).e().get(i5)) : 0.0D;
                  d9 = d11;
                  d11 = ((zub)localObject3).f().size() > i5 ? ((zub)localObject3).a(((zub)localObject3).f().get(i5)) : 0.0D;
                  d10 = d11;
                }
                d10 = d10 * 100.0D / d7;
                d9 = d9 * 100.0D / d7;
                f10 = (float)d9 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
                f11 = (float)d10 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
                if (!localzbs1.p())
                {
                  if (d5 < 0.0D) {
                    localzo2.b(localzo2.e() + f8);
                  } else {
                    localzo2.b(localzo2.e() - f8);
                  }
                }
                else if (d5 < 0.0D) {
                  localzo2.b(localzo2.e() - f8);
                } else {
                  localzo2.b(localzo2.e() + f8);
                }
              }
              if ((localzbfc.equals(paramzbfc)) && (!localzke1.a())) {
                ((zub)localObject3).a(localzo2, f10, f11);
              }
            }
            float f9;
            if (!localzbs1.p())
            {
              if (d5 < 0.0D) {
                f9 = f1 + f8;
              } else {
                f9 = f1 - f8;
              }
            }
            else if (d5 < 0.0D) {
              f9 = f1 - f8;
            } else {
              f9 = f1 + f8;
            }
            zo localzo3 = new zo((float)d4, f9);
            com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo3);
            com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i5));
            if (localzbfc.equals(paramzbfc))
            {
              if (bool1) {
                zanv.a(paramzr, (float)d4, f9, (float)d4, paramFloat, localzanq1);
              }
              com.aspose.cells.b.a.a.zf.a(localArrayList3, localzo3);
              if ((!localzke1.a()) && (a(localzke1, d2, d1)))
              {
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i3);
                arrayOfObject[1] = Integer.valueOf(i5);
                arrayOfObject[2] = localzo3;
                arrayOfObject[3] = localzbs2;
                com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
              }
            }
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i5));
            if (localzbfc.equals(paramzbfc)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, null);
            }
          }
        }
        if (localzbfc.equals(paramzbfc))
        {
          com.aspose.cells.a.d.zs localzs = zanv.a(localzbfc.z());
          a(paramzr, localzbfc, localArrayList4, localArrayList5, localzs, paramzp);
          localzs.dispose();
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList4);
      }
    }
    for (n = 0; n < paramInt; n++)
    {
      int i1 = 0;
      i2 = 0;
      float f3 = 0.0F;
      float f4 = 0.0F;
      float f5 = 0.0F;
      int i4 = 0;
      int i6 = 0;
      float f6 = 0.0F;
      float f7 = 0.0F;
      Object localObject1;
      Object localObject2;
      for (int i7 = 0; i7 < localArrayList2.size(); i7++)
      {
        localObject1 = (ArrayList)localArrayList2.get(i7);
        localObject2 = (zbfc)localList.get(i7);
        zke localzke2 = ((zbfc)localObject2).D().b(n);
        if (((localzke2 == null) || ((!localzke2.d()) && (!localzke2.J()))) && (((ArrayList)localObject1).size() > n) && (((ArrayList)localObject1).get(n) != null))
        {
          zo localzo1 = (zo)((ArrayList)localObject1).get(n);
          f5 = localzo1.d();
          if (i1 == 0)
          {
            f3 = localzo1.e();
            i1 = 1;
          }
          else if (i2 == 0)
          {
            if (f3 < localzo1.e())
            {
              f4 = f3;
              f3 = localzo1.e();
              i2 = 1;
            }
            else
            {
              f4 = localzo1.e();
              i2 = 1;
            }
          }
          else
          {
            if (f3 < localzo1.e()) {
              f3 = localzo1.e();
            }
            if (f4 > localzo1.e()) {
              f4 = localzo1.e();
            }
          }
          if (i7 == 0)
          {
            f6 = localzo1.e();
            i4 = 1;
          }
          else if (i7 == j - 1)
          {
            f7 = localzo1.e();
            i6 = 1;
          }
        }
      }
      if ((paramzbfc.M()) && (i1 != 0) && (i2 != 0))
      {
        float[] arrayOfFloat = { f5 };
        localObject1 = new float[] { f3 };
        arrayOfFloat[0] = f5;
        localObject2 = new float[] { f4 };
        boolean bool2 = a(localzbs1.X(), paramzp, arrayOfFloat, (float[])localObject1, arrayOfFloat, (float[])localObject2);
        f5 = arrayOfFloat[0];
        f3 = localObject1[0];
        f5 = arrayOfFloat[0];
        f4 = localObject2[0];
        if (bool2) {
          zanv.a(paramzr, f5, f3, f5, f4, localzanq2);
        }
      }
      if ((paramzbfc.N()) && (i4 != 0) && (i6 != 0))
      {
        int i8 = (int)(d3 / (1.0F + f2));
        localObject1 = new zq();
        if (f6 <= f7)
        {
          ((zq)localObject1).c(i8);
          ((zq)localObject1).d(f7 - f6);
          ((zq)localObject1).a(f5 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f6);
          a(paramzr, localzjx2, (zq)localObject1);
        }
        else
        {
          ((zq)localObject1).c(i8);
          ((zq)localObject1).d(f6 - f7);
          ((zq)localObject1).a(f5 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f7);
          a(paramzr, localzjx1, (zq)localObject1);
        }
      }
    }
    a(paramzr, paramzbfc, localArrayList3, paramzp);
    return localArrayList1;
  }
  
  private static ArrayList b(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat)
    throws Exception
  {
    zje localzje = paramzbfc.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 39;
    arrayOfInt[1] = 42;
    int i = paramzbfc.af();
    zbfe localzbfe = localzje.z();
    int j = localzbfe.getCount();
    float f1 = paramzbfc.K() / 100.0F;
    float f2 = paramzbfc.J() / 100.0F;
    zbs localzbs2;
    zbs localzbs1;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbs2 = localzje.e();
      localzbs1 = localzje.E();
      localArrayList1 = ziy.a(localzje.z().c(), paramzbfc.v().U());
    }
    else
    {
      localzbs2 = localzje.g();
      localzbs1 = localzje.G();
      localArrayList1 = ziy.a(localzje.z().d(), paramzbfc.v().U());
    }
    float f3 = 0.0F;
    if (!localzbs1.p()) {
      f3 = paramzp.d() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    } else {
      f3 = paramzp.j() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    }
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    boolean bool1 = paramzbfc.L();
    zanq localzanq1 = paramzbfc.O();
    zanq localzanq2 = paramzbfc.P();
    zjx localzjx1 = paramzbfc.S();
    zjx localzjx2 = paramzbfc.T();
    int k = localArrayList1.size();
    int m = localzbs2.j();
    int n = (int)localzbs2.D();
    int i1 = (int)localzbs2.z();
    int i2 = 0;
    if ((localzbs2.f()) || (localzje.u()))
    {
      i2 = zbu.a(m, i1, n, paramzbfc.v().U()) + 1;
    }
    else
    {
      i2 = zbu.a(m, i1, n, paramzbfc.v().U());
      if (i2 == 0) {
        i2 = 1;
      }
    }
    double d3 = paramzp.e() / i2;
    float f4 = 0.0F;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    List localList = localzbfe.a(i, arrayOfInt);
    int i5;
    for (int i3 = 0; i3 < localList.size(); i3++)
    {
      zbfc localzbfc = (zbfc)localList.get(i3);
      if (((!localzje.ap()) || (localzbfc.equals(paramzbfc))) && ((paramzbfc.N()) || (paramzbfc.M()) || (localzbfc.equals(paramzbfc))))
      {
        i5 = localzbfe.a(localzbfc, i, arrayOfInt);
        int i6 = localzbfc.ai();
        ArrayList localArrayList5 = new ArrayList();
        ArrayList localArrayList6 = new ArrayList();
        for (int i7 = 0; i7 < k; i7++)
        {
          zke localzke1 = localzbfc.D().b(i7);
          if (localzke1 != null)
          {
            int i10 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i7)));
            i10 = zbu.a(m, i10, paramzbfc.v().U());
            int i11 = zbu.a(m, i10, n, paramzbfc.v().U());
            float f10 = (float)(d3 * i11);
            f4 = (float)(d3 * zbu.a(m, zbu.a(localzbs2.j(), localzbs2.y(), (int)localzbs2.x(), i10, paramzbfc.v().U()), i10, paramzbfc.v().U()));
            if ((localzbs2.f()) || (localzje.u())) {
              f10 += (float)(d3 / 2.0D);
            }
            float f11 = 0.0F;
            if (localzbs2.p()) {
              f11 = paramzp.c() + paramzp.e() - f10;
            } else {
              f11 = paramzp.c() + f10;
            }
            double d4 = localzke1.w();
            double d5 = d4;
            double d6 = 0.0D;
            double d7;
            if (d4 >= 0.0D) {
              for (i14 = 0; i14 < i5; i14++)
              {
                localObject3 = ((zbfc)localList.get(i14)).D().b(i7);
                if (localObject3 != null)
                {
                  d7 = ((zke)localObject3).w();
                  if (d7 > 0.0D) {
                    d5 += d7;
                  }
                }
              }
            } else {
              for (i14 = 0; i14 < i5; i14++)
              {
                localObject3 = ((zbfc)localList.get(i14)).D().b(i7);
                if (localObject3 != null)
                {
                  d7 = ((zke)localObject3).w();
                  if (d7 <= 0.0D) {
                    d5 += d7;
                  }
                }
              }
            }
            for (int i14 = 0; i14 < localList.size(); i14++)
            {
              localObject3 = ((zbfc)localList.get(i14)).D().b(i7);
              if (localObject3 != null)
              {
                d7 = ((zke)localObject3).w();
                d6 += Math.abs(d7);
              }
            }
            float f12;
            if (d6 == 0.0D) {
              f12 = 0.0F;
            } else {
              f12 = (float)Math.abs(d5) * 100.0F / (float)d6 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
            }
            Object localObject3 = paramzbfc.x();
            if ((localObject3 != null) && (((zub)localObject3).d() != 2) && (localzbfc.equals(paramzbfc)))
            {
              zo localzo2 = new zo(f11, f3);
              double d8 = 0.0D;
              double d9 = 0.0D;
              float f14 = 0.0F;
              float f15 = 0.0F;
              if ((localObject3 != null) && (!localzke1.a()))
              {
                switch (((zub)localObject3).g())
                {
                case 1: 
                  d8 = ((zub)localObject3).c();
                  d9 = d8;
                  break;
                case 2: 
                  d8 = ((zub)localObject3).c() * d4 / 100.0D;
                  d9 = -d8;
                  break;
                case 0: 
                  double d10 = ((zub)localObject3).e().size() > i7 ? ((zub)localObject3).a(((zub)localObject3).e().get(i7)) : 0.0D;
                  d8 = d10;
                  d10 = ((zub)localObject3).f().size() > i7 ? ((zub)localObject3).a(((zub)localObject3).f().get(i7)) : 0.0D;
                  d9 = d10;
                }
                d9 = d9 * 100.0D / d6;
                d8 = d8 * 100.0D / d6;
                f14 = (float)d8 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
                f15 = (float)d9 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
                if (!localzbs1.p())
                {
                  if (d4 < 0.0D) {
                    localzo2.b(localzo2.e() + f12);
                  } else {
                    localzo2.b(localzo2.e() - f12);
                  }
                }
                else if (d4 < 0.0D) {
                  localzo2.b(localzo2.e() - f12);
                } else {
                  localzo2.b(localzo2.e() + f12);
                }
              }
              if ((localzbfc.equals(paramzbfc)) && (!localzke1.a())) {
                ((zub)localObject3).a(localzo2, f14, f15);
              }
            }
            float f13;
            if (!localzbs1.p())
            {
              if (d4 < 0.0D) {
                f13 = f3 + f12;
              } else {
                f13 = f3 - f12;
              }
            }
            else if (d4 < 0.0D) {
              f13 = f3 - f12;
            } else {
              f13 = f3 + f12;
            }
            zo localzo3 = new zo(f11, f13);
            zkn.a(localzo3, localArrayList5, localArrayList6, i7, localzbs2.p());
            if (localzbfc.equals(paramzbfc))
            {
              if (bool1) {
                zanv.a(paramzr, f11, f13, f11, paramFloat, localzanq1);
              }
              if (!localzke1.a()) {
                com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo3);
              } else {
                com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
              }
              if ((!localzke1.a()) && (a(localzke1, d2, d1)))
              {
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i6);
                arrayOfObject[1] = Integer.valueOf(i7);
                arrayOfObject[2] = localzo3;
                arrayOfObject[3] = localzbs2;
                com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
              }
            }
          }
          else
          {
            if (localzbs2.p())
            {
              localArrayList5.add(0, null);
              localArrayList6.add(0, Integer.valueOf(i7));
            }
            else
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList5, null);
              com.aspose.cells.b.a.a.zf.a(localArrayList6, Integer.valueOf(i7));
            }
            if (localzbfc.equals(paramzbfc)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            }
          }
        }
        if (localzbfc.equals(paramzbfc))
        {
          com.aspose.cells.a.d.zs localzs = zanv.a(localzbfc.z());
          a(paramzr, localzbfc, localArrayList5, localArrayList6, localzs, paramzp);
          localzs.dispose();
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList5);
      }
    }
    for (i3 = 0; i3 < k; i3++)
    {
      int i4 = 0;
      i5 = 0;
      float f5 = 0.0F;
      float f6 = 0.0F;
      float f7 = 0.0F;
      int i8 = 0;
      int i9 = 0;
      float f8 = 0.0F;
      float f9 = 0.0F;
      Object localObject1;
      Object localObject2;
      for (int i12 = 0; i12 < localArrayList3.size(); i12++)
      {
        localObject1 = (ArrayList)localArrayList3.get(i12);
        localObject2 = (zbfc)localList.get(i12);
        zke localzke2 = ((zbfc)localObject2).D().b(i3);
        if (((localzke2 == null) || ((!localzke2.d()) && (!localzke2.J()))) && (((ArrayList)localObject1).size() > i3) && (((ArrayList)localObject1).get(i3) != null))
        {
          zo localzo1 = (zo)((ArrayList)localObject1).get(i3);
          f7 = localzo1.d();
          if (i4 == 0)
          {
            f5 = localzo1.e();
            i4 = 1;
          }
          else if (i5 == 0)
          {
            if (f5 < localzo1.e())
            {
              f6 = f5;
              f5 = localzo1.e();
              i5 = 1;
            }
            else
            {
              f6 = localzo1.e();
              i5 = 1;
            }
          }
          else
          {
            if (f5 < localzo1.e()) {
              f5 = localzo1.e();
            }
            if (f6 > localzo1.e()) {
              f6 = localzo1.e();
            }
          }
          if (i12 == 0)
          {
            f8 = localzo1.e();
            i8 = 1;
          }
          else if (i12 == j - 1)
          {
            f9 = localzo1.e();
            i9 = 1;
          }
        }
      }
      if ((paramzbfc.M()) && (i4 != 0) && (i5 != 0))
      {
        float[] arrayOfFloat = { f7 };
        localObject1 = new float[] { f5 };
        arrayOfFloat[0] = f7;
        localObject2 = new float[] { f6 };
        boolean bool2 = a(localzbs1.X(), paramzp, arrayOfFloat, (float[])localObject1, arrayOfFloat, (float[])localObject2);
        f7 = arrayOfFloat[0];
        f5 = localObject1[0];
        f7 = arrayOfFloat[0];
        f6 = localObject2[0];
        if (bool2) {
          zanv.a(paramzr, f7, f5, f7, f6, localzanq2);
        }
      }
      if ((paramzbfc.N()) && (i8 != 0) && (i9 != 0))
      {
        int i13 = (int)(f4 / (1.0F + f2));
        localObject1 = new zq();
        if (f8 <= f9)
        {
          ((zq)localObject1).c(i13);
          ((zq)localObject1).d(f9 - f8);
          ((zq)localObject1).a(f7 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f8);
          a(paramzr, localzjx2, (zq)localObject1);
        }
        else
        {
          ((zq)localObject1).c(i13);
          ((zq)localObject1).d(f8 - f9);
          ((zq)localObject1).a(f7 - ((zq)localObject1).h() / 2.0F);
          ((zq)localObject1).b(f9);
          a(paramzr, localzjx1, (zq)localObject1);
        }
      }
    }
    a(paramzr, paramzbfc, localArrayList4, paramzp);
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
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f1 = paramzje.N().g() / paramInt;
    float f2 = paramzje.N().a(false, paramInt, i);
    float f3 = paramzje.N().k();
    float f4 = f2 * paramzje.o() / 100.0F;
    double d3 = 1.0D;
    for (int j = 0; j < paramInt; j++)
    {
      int k = j;
      if (paramzje.D() > 180) {
        k = paramInt - 1 - j;
      }
      ArrayList localArrayList2 = localzbfe.j();
      for (int m = 0; m < localArrayList2.size(); m++)
      {
        int n = m;
        if (paramzje.D() > 180) {
          n = localArrayList2.size() - 1 - m;
        }
        zbfc localzbfc = (zbfc)localArrayList2.get(n);
        int i1 = localzbfc.ai();
        float f5 = n * f2;
        float f6 = f1 * k + f4 / 2.0F + f5;
        f6 = paramzje.N().e() + f6;
        zkg localzkg = localzbfc.D();
        int i2 = k;
        if (localzbs2.p()) {
          i2 = paramInt - 1 - k;
        }
        zke localzke = localzkg.b(i2);
        if ((localzke != null) && (!localzke.a()) && (!localzke.J()))
        {
          double d4 = localzbs1.g(localzke.w());
          float f7 = (float)((paramDouble - d4) / (d1 - d2) * paramzje.N().i());
          if (localzbs1.p()) {
            f7 = -f7;
          }
          double[] arrayOfDouble = { d3 };
          a(paramzr, localzke, paramzje, f6, f2, f3, paramFloat, f7, NaN.0D, arrayOfDouble);
          d3 = arrayOfDouble[0];
          zo localzo = a(paramzje, f6, f2, paramFloat, f7);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(i1);
          arrayOfObject[1] = Integer.valueOf(i2);
          arrayOfObject[2] = localzo;
          com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
        }
      }
    }
    c(paramzr, paramzje, localArrayList1);
  }
  
  private static void a(zr paramzr, zje paramzje, float paramFloat, double paramDouble)
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
    float f1 = paramzje.N().g() / n;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f2 = paramzje.N().a(false, n, i);
    float f3 = paramzje.N().k();
    float f4 = f2 * paramzje.o() / 100.0F;
    ArrayList localArrayList2 = ziy.a(paramzje.z().c(), paramzje.U());
    int i1 = localArrayList2.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = i2;
      if (paramzje.D() > 180) {
        i3 = i1 - 1 - i2;
      }
      int i4 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i3)));
      i4 = zbu.a(m, i4, paramzje.U());
      int i5 = zbu.a(m, i4, (int)localzbs2.D(), paramzje.U());
      float f5 = f1 * i5;
      f5 += paramzje.N().e() + f4 / 2.0F;
      ArrayList localArrayList3 = localzbfe.j();
      double d3 = 1.0D;
      for (int i6 = 0; i6 < localArrayList3.size(); i6++)
      {
        int i7 = i6;
        if (paramzje.D() > 180) {
          i7 = localArrayList3.size() - 1 - i6;
        }
        zbfc localzbfc = (zbfc)localArrayList3.get(i7);
        int i8 = localzbfc.ai();
        float f6 = i7 * f2;
        float f7 = f5 + f6;
        zkg localzkg = localzbfc.D();
        int i9 = i3;
        if (localzbs2.p()) {
          i9 = i1 - 1 - i3;
        }
        zke localzke = localzkg.b(i9);
        if ((localzke != null) && (!localzke.a()) && (!localzke.J()))
        {
          double d4 = localzbs1.g(localzke.w());
          float f8 = (float)((paramDouble - d4) / (d1 - d2) * paramzje.N().i());
          if (localzbs1.p()) {
            f8 = -f8;
          }
          double[] arrayOfDouble = { d3 };
          a(paramzr, localzke, paramzje, f7, f2, f3, paramFloat, f8, NaN.0D, arrayOfDouble);
          d3 = arrayOfDouble[0];
          zo localzo = a(paramzje, f7, f2, paramFloat, f8);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(i8);
          arrayOfObject[1] = Integer.valueOf(i9);
          arrayOfObject[2] = localzo;
          com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
        }
      }
    }
    c(paramzr, paramzje, localArrayList1);
  }
  
  static void a(zr paramzr, zje paramzje, double paramDouble, int paramInt)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    ArrayList localArrayList1 = localzbfe.j();
    int i = ziy.a(localArrayList1, localzbs1);
    double d1 = 0.0D;
    if (i == 1) {
      d1 = localzbs1.D();
    } else if (i == 2) {
      d1 = localzbs1.z();
    }
    float f1 = 0.0F;
    if (paramzje.E().p()) {
      f1 = paramzje.N().f() - (float)Math.abs((localzbs1.z() - d1) / (float)(localzbs1.z() - localzbs1.D())) * paramzje.N().i();
    } else {
      f1 = paramzje.N().f() - (float)Math.abs((localzbs1.D() - d1) / (float)(localzbs1.z() - localzbs1.D())) * paramzje.N().i();
    }
    if (localzbs2.k() == 2)
    {
      a(paramzr, paramzje, f1, paramDouble, i, d1);
      return;
    }
    ArrayList localArrayList2 = new ArrayList();
    float f2 = paramzje.N().g() / paramInt;
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d3 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f3 = paramzje.N().a(false, paramInt, 1);
    float f4 = paramzje.N().k();
    float f5 = f3 * paramzje.o() / 100.0F;
    for (int j = 0; j < paramInt; j++)
    {
      int k = j;
      if (paramzje.D() > 180) {
        k = paramInt - 1 - j;
      }
      float f6 = paramzje.N().e() + f2 * k + f5 / 2.0F;
      ArrayList localArrayList3 = new ArrayList();
      Object localObject1;
      Object localObject2;
      for (int m = 0; m < localArrayList1.size(); m++)
      {
        zbfc localzbfc = (zbfc)localArrayList1.get(m);
        n = localzbfc.ai();
        localObject1 = localzbfc.D();
        int i1 = k;
        if (localzbs2.p()) {
          i1 = paramInt - 1 - i1;
        }
        localObject2 = ((zkg)localObject1).b(i1);
        int i2 = m;
        if ((localObject2 != null) && (!((zke)localObject2).a()) && (!((zke)localObject2).J()))
        {
          double d5 = ((zke)localObject2).w();
          double d6 = 0.0D;
          double[] arrayOfDouble1 = { d5 };
          double[] arrayOfDouble2 = { d6 };
          boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList1, i2, i1, localzbs1.z(), localzbs1.D());
          d5 = arrayOfDouble1[0];
          d6 = arrayOfDouble2[0];
          if (bool)
          {
            if ((i == 1) && (m == 0)) {
              d5 -= d1;
            } else if ((i == 2) && (m == 0)) {
              d5 -= d1;
            }
            float f7 = (float)(d5 / (d2 - d3) * paramzje.N().i());
            float f8 = (float)((d6 - d1) / (d2 - d3) * paramzje.N().i());
            float f9;
            if (localzbs1.p())
            {
              f9 = f1 + (f8 - f7);
            }
            else
            {
              f9 = f1 - (f8 - f7);
              f7 = -f7;
            }
            float f10 = f9 + f7;
            if (f9 > paramzje.N().f()) {
              f9 = paramzje.N().f();
            }
            if (f9 < paramzje.N().f() - paramzje.N().i()) {
              f9 = paramzje.N().f() - paramzje.N().i();
            }
            if (f10 > paramzje.N().f()) {
              f10 = paramzje.N().f();
            }
            if (f10 < paramzje.N().f() - paramzje.N().i()) {
              f10 = paramzje.N().f() - paramzje.N().i();
            }
            f7 = f10 - f9;
            Object[] arrayOfObject1 = new Object[5];
            arrayOfObject1[0] = localObject2;
            arrayOfObject1[1] = Float.valueOf(f6);
            arrayOfObject1[2] = Float.valueOf(f9);
            arrayOfObject1[3] = Float.valueOf(f7);
            arrayOfObject1[4] = Double.valueOf(d6);
            a(d5, arrayOfObject1, localArrayList3, localzbs1);
            zo localzo = a(paramzje, f6, f3, f4, f9, f7);
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(n);
            arrayOfObject2[1] = Integer.valueOf(i1);
            arrayOfObject2[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject2);
          }
        }
      }
      double d4 = 1.0D;
      for (int n = 0; n < localArrayList3.size(); n++)
      {
        localObject1 = (Object[])localArrayList3.get(n);
        zke localzke = (zke)localObject1[0];
        localObject2 = new double[] { d4 };
        a(paramzr, localzke, paramzje, ((Float)localObject1[1]).floatValue(), f3, f4, ((Float)localObject1[2]).floatValue(), ((Float)localObject1[3]).floatValue(), ((Double)localObject1[4]).doubleValue(), (double[])localObject2);
        d4 = localObject2[0];
      }
      localArrayList3.clear();
      c(paramzr, paramzje, localArrayList2);
      localArrayList2.clear();
    }
  }
  
  private static void a(zr paramzr, zje paramzje, float paramFloat, double paramDouble1, int paramInt, double paramDouble2)
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
    float f1 = paramzje.N().g() / m;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble1 = localzbs1.n() ? zbxz.e(paramDouble1) : paramDouble1;
    float f2 = paramzje.N().a(false, m, 1);
    float f3 = paramzje.N().k();
    float f4 = f2 * paramzje.o() / 100.0F;
    ArrayList localArrayList2 = ziy.a(paramzje.z().c(), paramzje.U());
    int n = localArrayList2.size();
    for (int i1 = 0; i1 < n; i1++)
    {
      int i2 = i1;
      if (paramzje.D() > 180) {
        i2 = n - 1 - i1;
      }
      int i3 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i2)));
      i3 = zbu.a(k, i3, paramzje.U());
      int i4 = zbu.a(k, i3, (int)localzbs2.D(), paramzje.U());
      float f5 = f1 * i4;
      float f6 = paramzje.N().e() + f4 / 2.0F + f5;
      ArrayList localArrayList3 = new ArrayList();
      ArrayList localArrayList4 = localzbfe.j();
      Object localObject1;
      Object localObject2;
      for (int i5 = 0; i5 < localArrayList4.size(); i5++)
      {
        zbfc localzbfc = (zbfc)localArrayList4.get(i5);
        i6 = localzbfc.ai();
        localObject1 = localzbfc.D();
        int i7 = i2;
        if (localzbs2.p()) {
          i7 = n - 1 - i7;
        }
        localObject2 = ((zkg)localObject1).b(i7);
        int i8 = i5;
        if ((localObject2 != null) && (!((zke)localObject2).a()) && (!((zke)localObject2).J()))
        {
          double d4 = ((zke)localObject2).w();
          double d5 = 0.0D;
          double[] arrayOfDouble1 = { d4 };
          double[] arrayOfDouble2 = { d5 };
          boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList4, i8, i7, localzbs1.z(), localzbs1.D());
          d4 = arrayOfDouble1[0];
          d5 = arrayOfDouble2[0];
          if (bool)
          {
            if ((paramInt == 1) && (i5 == 0)) {
              d4 -= paramDouble2;
            } else if ((paramInt == 2) && (i5 == 0)) {
              d4 -= paramDouble2;
            }
            float f7 = (float)(d4 / (d1 - d2) * paramzje.N().i());
            float f8 = (float)((d5 - paramDouble2) / (d1 - d2) * paramzje.N().i());
            float f9;
            if (localzbs1.p())
            {
              f9 = paramFloat + (f8 - f7);
            }
            else
            {
              f9 = paramFloat - (f8 - f7);
              f7 = -f7;
            }
            float f10 = f9 + f7;
            if (f9 > paramzje.N().f()) {
              f9 = paramzje.N().f();
            }
            if (f9 < paramzje.N().f() - paramzje.N().i()) {
              f9 = paramzje.N().f() - paramzje.N().i();
            }
            if (f10 > paramzje.N().f()) {
              f10 = paramzje.N().f();
            }
            if (f10 < paramzje.N().f() - paramzje.N().i()) {
              f10 = paramzje.N().f() - paramzje.N().i();
            }
            f7 = f10 - f9;
            Object[] arrayOfObject1 = new Object[5];
            arrayOfObject1[0] = localObject2;
            arrayOfObject1[1] = Float.valueOf(f6);
            arrayOfObject1[2] = Float.valueOf(f9);
            arrayOfObject1[3] = Float.valueOf(f7);
            arrayOfObject1[4] = Double.valueOf(d5);
            a(d4, arrayOfObject1, localArrayList3, localzbs1);
            zo localzo = a(paramzje, f6, f2, f3, f9, f7);
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i6);
            arrayOfObject2[1] = Integer.valueOf(i7);
            arrayOfObject2[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
        }
      }
      double d3 = 1.0D;
      for (int i6 = 0; i6 < localArrayList3.size(); i6++)
      {
        localObject1 = (Object[])localArrayList3.get(i6);
        zke localzke = (zke)localObject1[0];
        localObject2 = new double[] { d3 };
        a(paramzr, localzke, paramzje, ((Float)localObject1[1]).floatValue(), f2, f3, ((Float)localObject1[2]).floatValue(), ((Float)localObject1[3]).floatValue(), ((Double)localObject1[4]).doubleValue(), (double[])localObject2);
        d3 = localObject2[0];
      }
      localArrayList3.clear();
      c(paramzr, paramzje, localArrayList1);
      localArrayList1.clear();
    }
  }
  
  static void b(zr paramzr, zje paramzje, double paramDouble, int paramInt)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    float f1 = 0.0F;
    if (paramzje.E().p()) {
      f1 = paramzje.N().f() - (float)Math.abs(localzbs1.z() / (float)(localzbs1.z() - localzbs1.D())) * paramzje.N().i();
    } else {
      f1 = paramzje.N().f() - paramzje.N().i() + (float)Math.abs(localzbs1.z() / (float)(localzbs1.z() - localzbs1.D())) * paramzje.N().i();
    }
    if (localzbs2.k() == 2)
    {
      b(paramzr, paramzje, f1, paramDouble);
      return;
    }
    ArrayList localArrayList1 = new ArrayList();
    float f2 = paramzje.N().g() / paramInt;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f3 = paramzje.N().a(false, paramInt, 1);
    float f4 = paramzje.N().k();
    float f5 = f3 * paramzje.o() / 100.0F;
    for (int i = 0; i < paramInt; i++)
    {
      int j = i;
      if (paramzje.D() > 180) {
        j = paramInt - 1 - i;
      }
      float f6 = paramzje.N().e() + f2 * j + f5 / 2.0F;
      ArrayList localArrayList2 = new ArrayList();
      ArrayList localArrayList3 = localzbfe.j();
      Object localObject1;
      Object localObject2;
      for (int k = 0; k < localArrayList3.size(); k++)
      {
        zbfc localzbfc = (zbfc)localArrayList3.get(k);
        m = localzbfc.ai();
        localObject1 = localzbfc.D();
        int n = j;
        if (localzbs2.p()) {
          n = paramInt - 1 - j;
        }
        localObject2 = ((zkg)localObject1).b(n);
        int i1 = k;
        if ((localObject2 != null) && (!((zke)localObject2).a()) && (!((zke)localObject2).J()))
        {
          double d4 = zkn.a(localArrayList3, n);
          if (d4 != 0.0D)
          {
            double d5 = ((zke)localObject2).w();
            double d6 = d5;
            double[] arrayOfDouble1 = { d5 };
            double[] arrayOfDouble2 = { d6 };
            boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList3, i1, n, localzbs1, d4);
            d5 = arrayOfDouble1[0];
            d6 = arrayOfDouble2[0];
            if (bool)
            {
              float f7 = (float)(d5 * 100.0D / d4 / (d1 - d2) * paramzje.N().i());
              float f8 = (float)(d6 * 100.0D / d4 / (d1 - d2) * paramzje.N().i());
              float f9;
              if (localzbs1.p())
              {
                f9 = f1 + (f8 - f7);
              }
              else
              {
                f9 = f1 - (f8 - f7);
                f7 = -f7;
              }
              float f10 = f9 + f7;
              if (f9 > paramzje.N().f()) {
                f9 = paramzje.N().f();
              }
              if (f9 < paramzje.N().f() - paramzje.N().i()) {
                f9 = paramzje.N().f() - paramzje.N().i();
              }
              if (f10 > paramzje.N().f()) {
                f10 = paramzje.N().f();
              }
              if (f10 < paramzje.N().f() - paramzje.N().i()) {
                f10 = paramzje.N().f() - paramzje.N().i();
              }
              f7 = f10 - f9;
              Object[] arrayOfObject1 = new Object[5];
              arrayOfObject1[0] = localObject2;
              arrayOfObject1[1] = Float.valueOf(f6);
              arrayOfObject1[2] = Float.valueOf(f9);
              arrayOfObject1[3] = Float.valueOf(f7);
              arrayOfObject1[4] = Double.valueOf(d6);
              a(d5, arrayOfObject1, localArrayList2, localzbs1);
              zo localzo = a(paramzje, f6, f3, f4, f9, f7);
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(m);
              arrayOfObject2[1] = Integer.valueOf(n);
              arrayOfObject2[2] = localzo;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
            }
          }
        }
      }
      double d3 = 1.0D;
      for (int m = 0; m < localArrayList2.size(); m++)
      {
        localObject1 = (Object[])localArrayList2.get(m);
        zke localzke = (zke)localObject1[0];
        localObject2 = new double[] { d3 };
        a(paramzr, localzke, paramzje, ((Float)localObject1[1]).floatValue(), f3, f4, ((Float)localObject1[2]).floatValue(), ((Float)localObject1[3]).floatValue(), ((Double)localObject1[4]).doubleValue(), (double[])localObject2);
        d3 = localObject2[0];
      }
      localArrayList2.clear();
      c(paramzr, paramzje, localArrayList1);
      localArrayList1.clear();
    }
  }
  
  private static void b(zr paramzr, zje paramzje, float paramFloat, double paramDouble)
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
    float f1 = paramzje.N().g() / m;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f2 = paramzje.N().a(false, m, 1);
    float f3 = paramzje.N().k();
    float f4 = f2 * paramzje.o() / 100.0F;
    ArrayList localArrayList2 = ziy.a(paramzje.z().c(), paramzje.U());
    int n = localArrayList2.size();
    for (int i1 = 0; i1 < n; i1++)
    {
      int i2 = i1;
      if (paramzje.D() > 180) {
        i2 = n - 1 - i1;
      }
      int i3 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i2)));
      i3 = zbu.a(k, i3, paramzje.U());
      int i4 = zbu.a(k, i3, (int)localzbs2.D(), paramzje.U());
      float f5 = f1 * i4;
      float f6 = paramzje.N().e() + f4 / 2.0F + f5;
      ArrayList localArrayList3 = new ArrayList();
      ArrayList localArrayList4 = localzbfe.j();
      Object localObject1;
      Object localObject2;
      for (int i5 = 0; i5 < localArrayList4.size(); i5++)
      {
        zbfc localzbfc = (zbfc)localArrayList4.get(i5);
        i6 = localzbfc.ai();
        localObject1 = localzbfc.D();
        int i7 = i2;
        if (localzbs2.p()) {
          i7 = n - 1 - i2;
        }
        localObject2 = ((zkg)localObject1).b(i7);
        int i8 = i5;
        if ((localObject2 != null) && (!((zke)localObject2).a()) && (!((zke)localObject2).J()))
        {
          double d4 = zkn.a(localArrayList4, i7);
          if (d4 != 0.0D)
          {
            double d5 = ((zke)localObject2).w();
            double d6 = d5;
            double[] arrayOfDouble1 = { d5 };
            double[] arrayOfDouble2 = { d6 };
            boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList4, i8, i7, localzbs1, d4);
            d5 = arrayOfDouble1[0];
            d6 = arrayOfDouble2[0];
            if (bool)
            {
              float f7 = (float)(d5 * 100.0D / d4 / (d1 - d2) * paramzje.N().i());
              float f8 = (float)(d6 * 100.0D / d4 / (d1 - d2) * paramzje.N().i());
              float f9;
              if (localzbs1.p())
              {
                f9 = paramFloat + (f8 - f7);
              }
              else
              {
                f9 = paramFloat - (f8 - f7);
                f7 = -f7;
              }
              float f10 = f9 + f7;
              if (f9 > paramzje.N().f()) {
                f9 = paramzje.N().f();
              }
              if (f9 < paramzje.N().f() - paramzje.N().i()) {
                f9 = paramzje.N().f() - paramzje.N().i();
              }
              if (f10 > paramzje.N().f()) {
                f10 = paramzje.N().f();
              }
              if (f10 < paramzje.N().f() - paramzje.N().i()) {
                f10 = paramzje.N().f() - paramzje.N().i();
              }
              f7 = f10 - f9;
              Object[] arrayOfObject1 = new Object[5];
              arrayOfObject1[0] = localObject2;
              arrayOfObject1[1] = Float.valueOf(f6);
              arrayOfObject1[2] = Float.valueOf(f9);
              arrayOfObject1[3] = Float.valueOf(f7);
              arrayOfObject1[4] = Double.valueOf(d6);
              a(d5, arrayOfObject1, localArrayList3, localzbs1);
              zo localzo = a(paramzje, f6, f2, f3, f9, f7);
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(i6);
              arrayOfObject2[1] = Integer.valueOf(i7);
              arrayOfObject2[2] = localzo;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
            }
          }
        }
      }
      double d3 = 1.0D;
      for (int i6 = 0; i6 < localArrayList3.size(); i6++)
      {
        localObject1 = (Object[])localArrayList3.get(i6);
        zke localzke = (zke)localObject1[0];
        localObject2 = new double[] { d3 };
        a(paramzr, localzke, paramzje, ((Float)localObject1[1]).floatValue(), f2, f3, ((Float)localObject1[2]).floatValue(), ((Float)localObject1[3]).floatValue(), ((Double)localObject1[4]).doubleValue(), (double[])localObject2);
        d3 = localObject2[0];
      }
      localArrayList3.clear();
      c(paramzr, paramzje, localArrayList1);
      localArrayList1.clear();
    }
  }
  
  static void b(zr paramzr, zje paramzje, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    if (localzbs2.k() == 2)
    {
      c(paramzr, paramzje, paramFloat, paramDouble);
      return;
    }
    float f1 = paramzje.m() / 100.0F;
    float f2 = paramzje.n() / 100.0F;
    float f3 = paramzje.o() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    float f4 = paramzje.N().g() / paramInt;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f5 = f4 / (1.0F + f3);
    float f6 = f5 * f3;
    float f7 = f4 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = localzbfe.j();
    int j;
    int k;
    int n;
    Object localObject;
    int i1;
    int i3;
    zke localzke;
    double d3;
    float f10;
    zo localzo;
    Object[] arrayOfObject;
    if (((paramzje.D() >= 0) && (paramzje.D() < 90)) || ((paramzje.D() >= 180) && (paramzje.D() < 270))) {
      for (j = 0; j < localArrayList2.size(); j++)
      {
        k = localArrayList2.size() - 1 - j;
        if ((paramzje.D() >= 180) && (paramzje.D() < 270)) {
          k = localArrayList2.size() - 1 - k;
        }
        if (paramzje.I().p()) {
          k = localArrayList2.size() - 1 - k;
        }
        zbfc localzbfc = (zbfc)localArrayList2.get(k);
        n = localzbfc.ai();
        localObject = localzbfc.D();
        for (i1 = 0; i1 < paramInt; i1++)
        {
          int i2 = i1;
          if ((paramzje.D() >= 180) && (paramzje.D() < 270)) {
            i2 = paramInt - 1 - i2;
          }
          float f9 = f4 * i2 + f6 / 2.0F;
          f9 = paramzje.N().e() + f9;
          i3 = i2;
          if (localzbs2.p()) {
            i3 = paramInt - 1 - i2;
          }
          localzke = ((zkg)localObject).b(i3);
          if ((localzke != null) && (!localzke.a()) && (!localzke.J()))
          {
            d3 = localzbs1.g(localzke.w());
            f10 = (float)((paramDouble - d3) / (d1 - d2) * paramzje.N().i());
            if (localzbs1.p()) {
              f10 = -f10;
            }
            a(paramzr, localzke, paramzje, paramFloat, f10, f9, f5, f7, n + 1, localArrayList2.size());
            localzo = a(paramzje, paramFloat, f10, f9, f5, f7, n + 1, localArrayList2.size());
            localArrayList1.clear();
            arrayOfObject = new Object[3];
            arrayOfObject[0] = Integer.valueOf(n);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
            c(paramzr, paramzje, localArrayList1);
          }
        }
      }
    } else if (((paramzje.D() >= 90) && (paramzje.D() < 180)) || ((paramzje.D() >= 270) && (paramzje.D() < 360))) {
      for (j = 0; j < paramInt; j++)
      {
        k = j;
        if ((paramzje.D() >= 270) && (paramzje.D() < 360)) {
          k = paramInt - 1 - k;
        }
        for (int m = 0; m < localArrayList2.size(); m++)
        {
          n = m;
          if ((paramzje.D() >= 270) && (paramzje.D() < 360)) {
            n = localArrayList2.size() - 1 - n;
          }
          if (paramzje.I().p()) {
            n = localArrayList2.size() - 1 - n;
          }
          localObject = (zbfc)localArrayList2.get(n);
          i1 = ((zbfc)localObject).ai();
          float f8 = f4 * k + f6 / 2.0F;
          f8 = paramzje.N().e() + f8;
          zkg localzkg = ((zbfc)localObject).D();
          i3 = k;
          if (localzbs2.p()) {
            i3 = paramInt - 1 - k;
          }
          localzke = localzkg.b(i3);
          if ((localzke != null) && (!localzke.a()))
          {
            d3 = localzbs1.g(localzke.w());
            f10 = (float)((paramDouble - d3) / (d1 - d2) * paramzje.N().i());
            if (localzbs1.p()) {
              f10 = -f10;
            }
            a(paramzr, localzke, paramzje, paramFloat, f10, f8, f5, f7, i1 + 1, localArrayList2.size());
            localzo = a(paramzje, paramFloat, f10, f8, f5, f7, i1 + 1, localArrayList2.size());
            localArrayList1.clear();
            arrayOfObject = new Object[3];
            arrayOfObject[0] = Integer.valueOf(i1);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
            c(paramzr, paramzje, localArrayList1);
          }
        }
      }
    }
  }
  
  private static void c(zr paramzr, zje paramzje, float paramFloat, double paramDouble)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    zbs localzbs3 = paramzje.I();
    float f1 = paramzje.m() / 100.0F;
    float f2 = paramzje.n() / 100.0F;
    float f3 = paramzje.o() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    int j = (int)localzbs2.z();
    int k = (int)localzbs2.D();
    int m = localzbs2.j();
    int n = zbu.a(m, j, k, paramzje.U()) + 1;
    float f4 = paramzje.N().g() / n;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f5 = f4 / (1.0F + f3);
    float f6 = f5 * f3;
    float f7 = f4 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = localzbfe.j();
    ArrayList localArrayList3 = ziy.a(paramzje.z().c(), paramzje.U());
    int i1 = localArrayList3.size();
    int i2;
    int i3;
    int i5;
    int i7;
    int i8;
    int i11;
    zke localzke;
    double d3;
    float f12;
    zo localzo;
    Object[] arrayOfObject;
    if (((paramzje.D() >= 0) && (paramzje.D() < 90)) || ((paramzje.D() >= 180) && (paramzje.D() < 270))) {
      for (i2 = 0; i2 < localArrayList2.size(); i2++)
      {
        i3 = localArrayList2.size() - 1 - i2;
        if ((paramzje.D() >= 180) && (paramzje.D() < 270)) {
          i3 = localArrayList2.size() - 1 - i3;
        }
        if (localzbs3.p()) {
          i3 = localArrayList2.size() - 1 - i3;
        }
        zbfc localzbfc1 = (zbfc)localArrayList2.get(i3);
        i5 = localzbfc1.ai();
        zkg localzkg1 = localzbfc1.D();
        for (int i6 = 0; i6 < i1; i6++)
        {
          i7 = i6;
          if ((paramzje.D() >= 180) && (paramzje.D() < 270)) {
            i7 = i1 - 1 - i7;
          }
          i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList3.get(i7)));
          i8 = zbu.a(m, i8, paramzje.U());
          int i9 = zbu.a(m, i8, (int)localzbs2.D(), paramzje.U());
          float f10 = f4 * i9;
          float f11 = paramzje.N().e() + f10 + f6 / 2.0F;
          i11 = i7;
          if (localzbs2.p()) {
            i11 = i1 - 1 - i7;
          }
          localzke = localzkg1.b(i11);
          if ((localzke != null) && (!localzke.a()))
          {
            d3 = localzbs1.g(localzke.w());
            f12 = (float)((paramDouble - d3) / (d1 - d2) * paramzje.N().i());
            if (localzbs1.p()) {
              f12 = -f12;
            }
            a(paramzr, localzke, paramzje, paramFloat, f12, f11, f5, f7, i5 + 1, localArrayList2.size());
            localzo = a(paramzje, paramFloat, f12, f11, f5, f7, i5 + 1, localArrayList2.size());
            localArrayList1.clear();
            arrayOfObject = new Object[3];
            arrayOfObject[0] = Integer.valueOf(i5);
            arrayOfObject[1] = Integer.valueOf(i11);
            arrayOfObject[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
            c(paramzr, paramzje, localArrayList1);
          }
        }
      }
    } else if (((paramzje.D() >= 90) && (paramzje.D() < 180)) || ((paramzje.D() >= 270) && (paramzje.D() < 360))) {
      for (i2 = 0; i2 < i1; i2++)
      {
        i3 = i2;
        if ((paramzje.D() >= 270) && (paramzje.D() < 360)) {
          i3 = i1 - 1 - i3;
        }
        int i4 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList3.get(i3)));
        i4 = zbu.a(m, i4, paramzje.U());
        i5 = zbu.a(m, i4, (int)localzbs2.D(), paramzje.U());
        float f8 = f4 * i5;
        float f9 = paramzje.N().e() + f8 + f6 / 2.0F;
        for (i7 = 0; i7 < localArrayList2.size(); i7++)
        {
          i8 = i7;
          if ((paramzje.D() >= 270) && (paramzje.D() < 360)) {
            i8 = localArrayList2.size() - 1 - i8;
          }
          if (localzbs3.p()) {
            i8 = localArrayList2.size() - 1 - i8;
          }
          zbfc localzbfc2 = (zbfc)localArrayList2.get(i8);
          int i10 = localzbfc2.ai();
          zkg localzkg2 = localzbfc2.D();
          i11 = i3;
          if (localzbs2.p()) {
            i11 = i1 - 1 - i3;
          }
          localzke = localzkg2.b(i11);
          if ((localzke != null) && (!localzke.a()))
          {
            d3 = localzbs1.g(localzke.w());
            f12 = (float)((paramDouble - d3) / (d1 - d2) * paramzje.N().i());
            if (localzbs1.p()) {
              f12 = -f12;
            }
            a(paramzr, localzke, paramzje, paramFloat, f12, f9, f5, f7, i10 + 1, localArrayList2.size());
            localzo = a(paramzje, paramFloat, f12, f9, f5, f7, i10 + 1, localArrayList2.size());
            localArrayList1.clear();
            arrayOfObject = new Object[3];
            arrayOfObject[0] = Integer.valueOf(i10);
            arrayOfObject[1] = Integer.valueOf(i11);
            arrayOfObject[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
            c(paramzr, paramzje, localArrayList1);
          }
        }
      }
    }
  }
  
  static void c(zr paramzr, zje paramzje, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    if (localzbs2.k() == 2)
    {
      d(paramzr, paramzje, paramFloat, paramDouble);
      return;
    }
    float f1 = paramzje.m() / 100.0F;
    float f2 = paramzje.n() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    int j = 0;
    int k = (localzbs2.f()) || (paramzje.u()) ? 1 : 0;
    if (k != 0)
    {
      j = paramInt;
    }
    else
    {
      j = paramInt - 1;
      if (j == 0) {
        j = 1;
      }
    }
    float f3 = paramzje.N().g() / j;
    float f4 = f3 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = localzbfe.j();
    int m;
    int n;
    zbfc localzbfc;
    int i1;
    zkg localzkg;
    int i2;
    int i3;
    float f5;
    int i4;
    zke localzke;
    double d3;
    float f6;
    Object[] arrayOfObject1;
    int i5;
    Object[] arrayOfObject2;
    if (((paramzje.D() >= 0) && (paramzje.D() < 90)) || ((paramzje.D() >= 180) && (paramzje.D() < 270))) {
      for (m = 0; m < localArrayList3.size(); m++)
      {
        n = localArrayList3.size() - 1 - m;
        if ((paramzje.D() >= 180) && (paramzje.D() < 270)) {
          n = localArrayList3.size() - 1 - n;
        }
        if (paramzje.I().p()) {
          n = localArrayList3.size() - 1 - n;
        }
        localzbfc = (zbfc)localArrayList3.get(n);
        i1 = localzbfc.ai();
        localzkg = localzbfc.D();
        for (i2 = 0; i2 < paramInt; i2++)
        {
          i3 = i2;
          if ((paramzje.D() >= 180) && (paramzje.D() < 270)) {
            i3 = paramInt - 1 - i3;
          }
          f5 = f3 * i3;
          f5 = paramzje.N().e() + f5;
          if (k != 0) {
            f5 += f3 / 2.0F;
          }
          i4 = i3;
          if (localzbs2.p()) {
            i4 = paramInt - 1 - i3;
          }
          localzke = localzkg.b(i4);
          if ((localzke != null) && (!localzke.a()))
          {
            d3 = localzbs1.g(localzke.w());
            f6 = (float)((paramDouble - d3) / (d1 - d2) * paramzje.N().i());
            if (localzbs1.p()) {
              f6 = -f6;
            }
            arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = localzke;
            arrayOfObject1[1] = a(paramzr, paramzje, paramFloat, f6, f5, f4, i1 + 1, localArrayList3.size());
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject1);
            i5 = 0;
            if ((paramzje.D() >= 90) && (paramzje.D() < 270)) {
              i5 = 1;
            }
            arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i1);
            arrayOfObject2[1] = Integer.valueOf(i4);
            arrayOfObject2[2] = ((zo[])(zo[])arrayOfObject1[1])[i5];
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList2, null);
          }
        }
        a(paramzr, paramzje, localArrayList2);
        localArrayList2.clear();
        c(paramzr, paramzje, localArrayList1);
        localArrayList1.clear();
      }
    } else if (((paramzje.D() >= 90) && (paramzje.D() < 180)) || ((paramzje.D() >= 270) && (paramzje.D() < 360))) {
      for (m = 0; m < localArrayList3.size(); m++)
      {
        n = m;
        if ((paramzje.D() >= 270) && (paramzje.D() < 360)) {
          n = localArrayList3.size() - 1 - n;
        }
        if (paramzje.I().p()) {
          n = localArrayList3.size() - 1 - n;
        }
        localzbfc = (zbfc)localArrayList3.get(n);
        i1 = localzbfc.ai();
        localzkg = localzbfc.D();
        for (i2 = 0; i2 < paramInt; i2++)
        {
          i3 = i2;
          if ((paramzje.D() >= 270) && (paramzje.D() < 360)) {
            i3 = paramInt - 1 - i3;
          }
          f5 = f3 * i3;
          f5 = paramzje.N().e() + f5;
          if (k != 0) {
            f5 += f3 / 2.0F;
          }
          i4 = i3;
          if (localzbs2.p()) {
            i4 = paramInt - 1 - i3;
          }
          localzke = localzkg.b(i4);
          if ((localzke != null) && (!localzke.a()))
          {
            d3 = localzbs1.g(localzke.w());
            f6 = (float)((paramDouble - d3) / (d1 - d2) * paramzje.N().i());
            if (localzbs1.p()) {
              f6 = -f6;
            }
            arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = localzke;
            arrayOfObject1[1] = a(paramzr, paramzje, paramFloat, f6, f5, f4, i1 + 1, localArrayList3.size());
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject1);
            i5 = 0;
            if ((paramzje.D() >= 90) && (paramzje.D() < 270)) {
              i5 = 1;
            }
            arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i1);
            arrayOfObject2[1] = Integer.valueOf(i4);
            arrayOfObject2[2] = ((zo[])(zo[])arrayOfObject1[1])[i5];
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
        }
        a(paramzr, paramzje, localArrayList2);
        localArrayList2.clear();
        c(paramzr, paramzje, localArrayList1);
        localArrayList1.clear();
      }
    }
  }
  
  private static void d(zr paramzr, zje paramzje, float paramFloat, double paramDouble)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    zbs localzbs3 = paramzje.I();
    float f1 = paramzje.m() / 100.0F;
    float f2 = paramzje.n() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    int j = localzbs2.j();
    int k = (int)localzbs2.D();
    int m = (int)localzbs2.z();
    int n = 0;
    int i1 = (localzbs2.f()) || (paramzje.u()) ? 1 : 0;
    if (i1 != 0)
    {
      n = zbu.a(j, m, k, paramzje.U()) + 1;
    }
    else
    {
      n = zbu.a(j, m, k, paramzje.U());
      if (n == 0) {
        n = 1;
      }
    }
    float f3 = paramzje.N().g() / n;
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    float f4 = f3 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = localzbfe.j();
    ArrayList localArrayList4 = ziy.a(paramzje.z().c(), paramzje.U());
    int i2 = localArrayList4.size();
    int i3;
    int i4;
    zbfc localzbfc;
    int i5;
    zkg localzkg;
    int i6;
    int i7;
    int i8;
    int i9;
    float f5;
    float f6;
    int i10;
    zke localzke;
    double d3;
    float f7;
    Object[] arrayOfObject1;
    int i11;
    Object[] arrayOfObject2;
    if (((paramzje.D() >= 0) && (paramzje.D() < 90)) || ((paramzje.D() >= 180) && (paramzje.D() < 270))) {
      for (i3 = 0; i3 < localArrayList3.size(); i3++)
      {
        i4 = localArrayList3.size() - 1 - i3;
        if ((paramzje.D() >= 180) && (paramzje.D() < 270)) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        if (localzbs3.p()) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        localzbfc = (zbfc)localArrayList3.get(i4);
        i5 = localzbfc.ai();
        localzkg = localzbfc.D();
        for (i6 = 0; i6 < i2; i6++)
        {
          i7 = i6;
          if ((paramzje.D() >= 180) && (paramzje.D() < 270)) {
            i7 = i2 - 1 - i7;
          }
          i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList4.get(i7)));
          i8 = zbu.a(j, i8, paramzje.U());
          i9 = zbu.a(j, i8, (int)localzbs2.D(), paramzje.U());
          f5 = f3 * i9;
          f6 = paramzje.N().e() + f5;
          if (i1 != 0) {
            f6 += f3 / 2.0F;
          }
          i10 = i7;
          if (localzbs2.p()) {
            i10 = i2 - 1 - i7;
          }
          localzke = localzkg.b(i10);
          if ((localzke != null) && (!localzke.a()))
          {
            d3 = localzbs1.g(localzke.w());
            f7 = (float)((paramDouble - d3) / (d1 - d2) * paramzje.N().i());
            if (localzbs1.p()) {
              f7 = -f7;
            }
            arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = localzke;
            arrayOfObject1[1] = a(paramzr, paramzje, paramFloat, f7, f6, f4, i5 + 1, localArrayList3.size());
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject1);
            i11 = 0;
            if ((paramzje.D() >= 90) && (paramzje.D() < 270)) {
              i11 = 1;
            }
            arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i5);
            arrayOfObject2[1] = Integer.valueOf(i10);
            arrayOfObject2[2] = ((zo[])(zo[])arrayOfObject1[1])[i11];
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList2, null);
          }
        }
        a(paramzr, paramzje, localArrayList2);
        localArrayList2.clear();
        c(paramzr, paramzje, localArrayList1);
        localArrayList1.clear();
      }
    } else if (((paramzje.D() >= 90) && (paramzje.D() < 180)) || ((paramzje.D() >= 270) && (paramzje.D() < 360))) {
      for (i3 = 0; i3 < localArrayList3.size(); i3++)
      {
        i4 = i3;
        if ((paramzje.D() >= 270) && (paramzje.D() < 360)) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        if (localzbs3.p()) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        localzbfc = (zbfc)localArrayList3.get(i4);
        i5 = localzbfc.ai();
        localzkg = localzbfc.D();
        for (i6 = 0; i6 < i2; i6++)
        {
          i7 = i6;
          if ((paramzje.D() >= 270) && (paramzje.D() < 360)) {
            i7 = i2 - 1 - i7;
          }
          i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList4.get(i7)));
          i8 = zbu.a(j, i8, paramzje.U());
          i9 = zbu.a(j, i8, (int)localzbs2.D(), paramzje.U());
          f5 = f3 * i9;
          f6 = paramzje.N().e() + f5;
          if (i1 != 0) {
            f6 += f3 / 2.0F;
          }
          i10 = i7;
          if (localzbs2.p()) {
            i10 = i2 - 1 - i7;
          }
          localzke = localzkg.b(i10);
          if ((localzke != null) && (!localzke.a()))
          {
            d3 = localzbs1.g(localzke.w());
            f7 = (float)((paramDouble - d3) / (d1 - d2) * paramzje.N().i());
            if (localzbs1.p()) {
              f7 = -f7;
            }
            arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = localzke;
            arrayOfObject1[1] = a(paramzr, paramzje, paramFloat, f7, f6, f4, i5 + 1, localArrayList3.size());
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject1);
            i11 = 0;
            if ((paramzje.D() >= 90) && (paramzje.D() < 270)) {
              i11 = 1;
            }
            arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i5);
            arrayOfObject2[1] = Integer.valueOf(i10);
            arrayOfObject2[2] = ((zo[])(zo[])arrayOfObject1[1])[i11];
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
        }
        a(paramzr, paramzje, localArrayList2);
        localArrayList2.clear();
        c(paramzr, paramzje, localArrayList1);
        localArrayList1.clear();
      }
    }
  }
  
  private static void a(double paramDouble, Object[] paramArrayOfObject, ArrayList paramArrayList, zbs paramzbs)
  {
    zje localzje = paramzbs.c();
    int i = (int)(((Float)paramArrayOfObject[2]).floatValue() + ((Float)paramArrayOfObject[3]).floatValue() + 0.5D);
    if (paramArrayList.size() == 0) {
      com.aspose.cells.b.a.a.zf.a(paramArrayList, paramArrayOfObject);
    } else {
      for (int j = 0; j < paramArrayList.size(); j++)
      {
        Object[] arrayOfObject = (Object[])paramArrayList.get(j);
        int k = (int)(((Float)arrayOfObject[2]).floatValue() + ((Float)arrayOfObject[3]).floatValue() + 0.5D);
        if (localzje.p() >= 0)
        {
          if (i > k)
          {
            paramArrayList.add(j, paramArrayOfObject);
            break;
          }
          if (i == k)
          {
            if (paramzbs.p())
            {
              if (paramDouble > 0.0D)
              {
                paramArrayList.add(j, paramArrayOfObject);
                break;
              }
              paramArrayList.add(j + 1, paramArrayOfObject);
              break;
            }
            if (paramDouble < 0.0D)
            {
              paramArrayList.add(j, paramArrayOfObject);
              break;
            }
            paramArrayList.add(j + 1, paramArrayOfObject);
            break;
          }
          if (j == paramArrayList.size() - 1)
          {
            com.aspose.cells.b.a.a.zf.a(paramArrayList, paramArrayOfObject);
            break;
          }
        }
        else
        {
          if (i < k)
          {
            paramArrayList.add(j, paramArrayOfObject);
            break;
          }
          if (i == k)
          {
            if (!paramzbs.p())
            {
              if (paramDouble > 0.0D)
              {
                paramArrayList.add(j, paramArrayOfObject);
                break;
              }
              paramArrayList.add(j + 1, paramArrayOfObject);
              break;
            }
            if (paramDouble < 0.0D)
            {
              paramArrayList.add(j, paramArrayOfObject);
              break;
            }
            paramArrayList.add(j + 1, paramArrayOfObject);
            break;
          }
          if (j == paramArrayList.size() - 1)
          {
            com.aspose.cells.b.a.a.zf.a(paramArrayList, paramArrayOfObject);
            break;
          }
        }
      }
    }
  }
  
  private static zo a(zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = paramzje.D() / 45;
    float f1 = 0.0F;
    switch (i)
    {
    case 0: 
    case 8: 
      f1 = paramFloat2 / 2.0F;
      break;
    case 1: 
      f1 = paramFloat2;
      paramFloat4 /= 2.0F;
      break;
    case 2: 
      f1 = paramFloat2;
      paramFloat4 /= 2.0F;
      break;
    case 3: 
      f1 = paramFloat2 / 2.0F;
      break;
    case 4: 
      f1 = paramFloat2 / 2.0F;
      break;
    case 5: 
      f1 = 0.0F;
      paramFloat4 /= 2.0F;
      break;
    case 6: 
      f1 = 0.0F;
      paramFloat4 /= 2.0F;
      break;
    case 7: 
      f1 = paramFloat2 / 2.0F;
    }
    float f3 = paramzje.N().j();
    paramFloat1 += f1;
    if (paramFloat1 <= f3)
    {
      f2 = 2.0F * (f3 - paramFloat1);
      return a(paramzje, paramFloat3 + paramFloat4, f2, 0.0F, 0);
    }
    float f2 = 2.0F * (paramFloat1 - f3);
    return a(paramzje, paramFloat3 + paramFloat4, f2, 0.0F, 1);
  }
  
  static zo a(zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    int i = paramzje.D() / 45;
    float f1 = 0.0F;
    int j = 0;
    switch (i)
    {
    case 0: 
    case 8: 
      f1 = paramFloat2 / 2.0F;
      break;
    case 1: 
      f1 = paramFloat2;
      paramFloat3 = 0.0F;
      break;
    case 2: 
      f1 = paramFloat2;
      paramFloat3 = 0.0F;
      break;
    case 3: 
      f1 = paramFloat2 / 2.0F;
      j = 1;
      break;
    case 4: 
      f1 = paramFloat2 / 2.0F;
      j = 2;
      break;
    case 5: 
      f1 = 0.0F;
      paramFloat3 = 0.0F;
      break;
    case 6: 
      f1 = 0.0F;
      paramFloat3 = 0.0F;
      break;
    case 7: 
      f1 = paramFloat2 / 2.0F;
    }
    float f3 = paramzje.N().j();
    paramFloat1 += f1;
    int k;
    if (paramFloat1 <= f3)
    {
      f2 = 2.0F * (f3 - paramFloat1);
      if (j == 0) {
        k = 0;
      } else {
        k = 3;
      }
      return a(paramzje, paramFloat4 + paramFloat5 / 2.0F, f2, paramFloat3, k);
    }
    float f2 = 2.0F * (paramFloat1 - f3);
    if (j == 0) {
      k = 1;
    } else {
      k = 2;
    }
    return a(paramzje, paramFloat4 + paramFloat5 / 2.0F, f2, paramFloat3, k);
  }
  
  static void c(zr paramzr, zje paramzje, ArrayList paramArrayList)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      zo localzo = (zo)arrayOfObject[2];
      zqx localzqx = localzbfe.c(j).D().b(k).o();
      zt localzt = zqz.a(paramzr, paramzje.e(), localzbfe, j, k, (int)paramzje.N().g());
      float f1 = localzo.d() - localzt.b() / 2.0F;
      float f2 = localzo.e() - localzt.c() / 2.0F;
      localzqx.a().b = new com.aspose.cells.b.a.b.zp(zbxz.c(f1), zbxz.c(f2), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
      localzqx.a().z();
      zqz.a(paramzr, paramzje.e(), localzbfe, j, k, localzqx.a().a);
    }
  }
  
  private static void a(zr paramzr, zke paramzke, zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, double paramDouble, double[] paramArrayOfDouble)
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
        a(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzke.w() > 0.0D)
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
      paramArrayOfDouble[0] = d1;
      a(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 2: 
      if (localzbfc.an())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        b(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzke.w() > 0.0D)
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
        a(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzke.w() > 0.0D)
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
        d1 = (float)a(paramzke);
        d2 = 1.0D;
      }
      paramArrayOfDouble[0] = d1;
      a(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 3: 
      paramArrayOfDouble[0] = d1;
      b(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 4: 
      if ((localzbfc.an()) || (localzbfc.aq()))
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        a(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzke.w() > 0.0D)
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
      paramArrayOfDouble[0] = d1;
      b(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 5: 
      if (localzbfc.an())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        b(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzke.w() > 0.0D)
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
        a(localzbfc.ah(), paramzke.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzke.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzke.w() > 0.0D)
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
        d1 = (float)a(paramzke);
        d2 = 1.0D;
      }
      paramArrayOfDouble[0] = d1;
      b(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
    }
  }
  
  static zo a(zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    zo localzo = new zo(paramzje.N().e() + paramzje.N().g() / 2.0F, paramFloat1);
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
      f1 = paramFloat2;
      f2 = paramFloat3;
      break;
    case 1: 
    case 2: 
    case 5: 
    case 6: 
    default: 
      f1 = paramFloat3;
      f2 = paramFloat2;
    }
    float f3 = f2 * (float)Math.sin(i * 3.141592653589793D / 180.0D);
    float f4 = f2 * (float)Math.sin(paramzje.p() * 3.141592653589793D / 180.0D);
    zo[] arrayOfzo = new zo[4];
    zbxz.a(arrayOfzo);
    switch (j)
    {
    case 0: 
    case 8: 
      arrayOfzo[0].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo[1].a(arrayOfzo[0].d() + f1);
      arrayOfzo[2].a(arrayOfzo[1].d() + f3);
      arrayOfzo[3].a(arrayOfzo[0].d() + f3);
      arrayOfzo[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e());
      arrayOfzo[2].b(arrayOfzo[1].e() - f4);
      arrayOfzo[3].b(arrayOfzo[2].e());
      break;
    case 1: 
      arrayOfzo[0].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo[1].a(arrayOfzo[0].d() + f3);
      arrayOfzo[2].a(arrayOfzo[1].d() + f1);
      arrayOfzo[3].a(arrayOfzo[0].d() + f1);
      arrayOfzo[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e() + f4);
      arrayOfzo[2].b(arrayOfzo[1].e());
      arrayOfzo[3].b(arrayOfzo[0].e());
      break;
    case 2: 
      arrayOfzo[1].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo[0].a(arrayOfzo[1].d() + f3);
      arrayOfzo[2].a(arrayOfzo[1].d() + f1);
      arrayOfzo[3].a(arrayOfzo[0].d() + f1);
      arrayOfzo[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e() + f4);
      arrayOfzo[2].b(arrayOfzo[1].e());
      arrayOfzo[3].b(arrayOfzo[0].e());
      break;
    case 3: 
      arrayOfzo[1].a(localzo.d() - (f1 + f3) / 2.0F);
      arrayOfzo[0].a(arrayOfzo[1].d() + f1);
      arrayOfzo[2].a(arrayOfzo[1].d() + f3);
      arrayOfzo[3].a(arrayOfzo[2].d() + f1);
      arrayOfzo[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e());
      arrayOfzo[2].b(arrayOfzo[1].e() + f4);
      arrayOfzo[3].b(arrayOfzo[2].e());
      break;
    case 4: 
      arrayOfzo[0].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo[1].a(arrayOfzo[0].d() - f1);
      arrayOfzo[2].a(arrayOfzo[1].d() - f3);
      arrayOfzo[3].a(arrayOfzo[2].d() + f1);
      arrayOfzo[0].b(localzo.e() - f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e());
      arrayOfzo[2].b(arrayOfzo[1].e() + f4);
      arrayOfzo[3].b(arrayOfzo[2].e());
      break;
    case 5: 
      arrayOfzo[0].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo[1].a(arrayOfzo[0].d() - f3);
      arrayOfzo[2].a(arrayOfzo[1].d() - f1);
      arrayOfzo[3].a(arrayOfzo[0].d() - f1);
      arrayOfzo[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e() - f4);
      arrayOfzo[2].b(arrayOfzo[1].e());
      arrayOfzo[3].b(arrayOfzo[0].e());
      break;
    case 6: 
      arrayOfzo[1].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo[0].a(arrayOfzo[1].d() - f3);
      arrayOfzo[2].a(arrayOfzo[1].d() - f1);
      arrayOfzo[3].a(arrayOfzo[0].d() - f1);
      arrayOfzo[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e() - f4);
      arrayOfzo[2].b(arrayOfzo[1].e());
      arrayOfzo[3].b(arrayOfzo[0].e());
      break;
    case 7: 
      arrayOfzo[1].a(localzo.d() + (f1 + f3) / 2.0F);
      arrayOfzo[0].a(arrayOfzo[1].d() - f1);
      arrayOfzo[2].a(arrayOfzo[1].d() - f3);
      arrayOfzo[3].a(arrayOfzo[2].d() - f1);
      arrayOfzo[0].b(localzo.e() + f4 / 2.0F);
      arrayOfzo[1].b(arrayOfzo[0].e());
      arrayOfzo[2].b(arrayOfzo[1].e() - f4);
      arrayOfzo[3].b(arrayOfzo[2].e());
    }
    return arrayOfzo[paramInt];
  }
  
  static zo[] a(zr paramzr, zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2)
  {
    float f1 = paramFloat4 * paramzje.n() / 100.0F;
    zo[] arrayOfzo = new zo[2];
    zbxz.a(arrayOfzo);
    float f4 = paramzje.N().j();
    zbs localzbs = paramzje.I();
    float f5 = paramzje.N().h() / paramInt2;
    float f6 = paramInt2 / 2.0F;
    if (localzbs.p()) {
      paramInt1 = paramInt2 + 1 - paramInt1;
    }
    float f3;
    float f2;
    if ((paramInt1 <= f6) && (!localzbs.p()))
    {
      f3 = ((f6 - paramInt1) * f5 + f1 / 2.0F + paramFloat4) * 2.0F;
      if (paramFloat3 <= f4)
      {
        f2 = 2.0F * (f4 - paramFloat3);
        arrayOfzo[0] = a(paramzje, paramFloat1 + paramFloat2, f2, f3, 0);
        f3 -= paramFloat4 * 2.0F;
        arrayOfzo[1] = a(paramzje, paramFloat1 + paramFloat2, f2, f3, 0);
      }
      else
      {
        f2 = 2.0F * (paramFloat3 - f4);
        arrayOfzo[0] = a(paramzje, paramFloat1 + paramFloat2, f2, f3, 1);
        f3 -= paramFloat4 * 2.0F;
        arrayOfzo[1] = a(paramzje, paramFloat1 + paramFloat2, f2, f3, 1);
      }
    }
    else
    {
      f3 = ((paramInt1 - f6) * f5 - f1 / 2.0F - paramFloat4) * 2.0F;
      if (paramFloat3 <= f4)
      {
        f2 = 2.0F * (f4 - paramFloat3);
        arrayOfzo[0] = a(paramzje, paramFloat1 + paramFloat2, f2, f3, 3);
        f3 += paramFloat4 * 2.0F;
        arrayOfzo[1] = a(paramzje, paramFloat1 + paramFloat2, f2, f3, 3);
      }
      else
      {
        f2 = 2.0F * (paramFloat3 - f4);
        arrayOfzo[0] = a(paramzje, paramFloat1 + paramFloat2, f2, f3, 2);
        f3 += paramFloat4 * 2.0F;
        arrayOfzo[1] = a(paramzje, paramFloat1 + paramFloat2, f2, f3, 2);
      }
    }
    return arrayOfzo;
  }
  
  private static void a(zr paramzr, zke paramzke, zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt1, int paramInt2)
    throws Exception
  {
    zbfc localzbfc = paramzke.g().a();
    switch (localzbfc.G())
    {
    case 0: 
      a(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramInt1, paramInt2, 1.0F);
      break;
    case 3: 
      b(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramInt1, paramInt2, 1.0F);
      break;
    case 1: 
      a(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramInt1, paramInt2, 0.0F);
      break;
    case 4: 
      b(paramzr, paramzke, paramzje, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramInt1, paramInt2, 0.0F);
    }
  }
  
  private static void a(zr paramzr, zke paramzke, zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt1, int paramInt2, float paramFloat6)
    throws Exception
  {
    float f1 = paramFloat5 * paramzje.n() / 100.0F;
    zo[] arrayOfzo = new zo[8];
    zbxz.a(arrayOfzo);
    float f4 = paramzje.N().j();
    zbs localzbs = paramzje.I();
    float f5 = paramFloat3;
    float f6 = paramFloat3 + paramFloat4 * (1.0F - paramFloat6) / 2.0F;
    float f7 = paramzje.N().h() / paramInt2;
    float f8 = paramInt2 / 2.0F;
    if (localzbs.p()) {
      paramInt1 = paramInt2 + 1 - paramInt1;
    }
    boolean bool = false;
    if ((paramInt1 <= f8) && (!localzbs.p())) {
      bool = true;
    }
    float f3 = ((paramInt1 - f8) * f7 - f1 / 2.0F - paramFloat5) * 2.0F;
    int i;
    int j;
    if (bool)
    {
      f3 = -f3;
      i = 0;
      j = 1;
    }
    else
    {
      i = 3;
      j = 2;
    }
    int k = 3;
    zo localzo = zo.a();
    for (int m = 0; m < 2; m++)
    {
      float f2;
      if (f5 <= f4)
      {
        f2 = 2.0F * (f4 - f5);
        arrayOfzo[m] = a(paramzje, paramFloat1, f2, f3, i);
        if (bool) {
          f3 -= paramFloat5 * 2.0F;
        } else {
          f3 += paramFloat5 * 2.0F;
        }
        arrayOfzo[(m + k)] = a(paramzje, paramFloat1, f2, f3, i);
      }
      else
      {
        f2 = 2.0F * (f5 - f4);
        arrayOfzo[m] = a(paramzje, paramFloat1, f2, f3, j);
        if (bool) {
          f3 -= paramFloat5 * 2.0F;
        } else {
          f3 += paramFloat5 * 2.0F;
        }
        arrayOfzo[(m + k)] = a(paramzje, paramFloat1, f2, f3, j);
      }
      f3 = ((paramInt1 - f8) * f7 - f1 / 2.0F - paramFloat5) * 2.0F;
      if (bool) {
        f3 = -f3;
      }
      if (f6 <= f4)
      {
        f2 = 2.0F * (f4 - f6);
        localzo = a(paramzje, paramFloat1, f2, a(f3, bool, paramFloat5, paramFloat6), i);
        arrayOfzo[(m + 4)].a(localzo.d());
        arrayOfzo[(m + 4)].b(localzo.e() + paramFloat2);
        if (paramFloat6 == 1.0F) {
          if (bool) {
            f3 -= paramFloat5 * 2.0F;
          } else {
            f3 += paramFloat5 * 2.0F;
          }
        }
        localzo = a(paramzje, paramFloat1, f2, a(f3, bool, paramFloat5, paramFloat6), i);
        arrayOfzo[(m + k + 4)].a(localzo.d());
        arrayOfzo[(m + k + 4)].b(localzo.e() + paramFloat2);
      }
      else
      {
        f2 = 2.0F * (f6 - f4);
        localzo = a(paramzje, paramFloat1, f2, a(f3, bool, paramFloat5, paramFloat6), j);
        arrayOfzo[(m + 4)].a(localzo.d());
        arrayOfzo[(m + 4)].b(localzo.e() + paramFloat2);
        if (paramFloat6 == 1.0F) {
          if (bool) {
            f3 -= paramFloat5 * 2.0F;
          } else {
            f3 += paramFloat5 * 2.0F;
          }
        }
        localzo = a(paramzje, paramFloat1, f2, a(f3, bool, paramFloat5, paramFloat6), j);
        arrayOfzo[(m + k + 4)].a(localzo.d());
        arrayOfzo[(m + k + 4)].b(localzo.e() + paramFloat2);
      }
      k = 1;
      f5 += paramFloat4;
      f6 += paramFloat4 * paramFloat6;
      f3 = ((paramInt1 - f8) * f7 - f1 / 2.0F - paramFloat5) * 2.0F;
      if (bool) {
        f3 = -f3;
      }
    }
    com.aspose.cells.b.a.a.zf.a(paramzke.b, new zo(arrayOfzo[0].d(), arrayOfzo[0].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.b, new zo(arrayOfzo[1].d(), arrayOfzo[1].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.b, new zo(arrayOfzo[2].d(), arrayOfzo[2].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.b, new zo(arrayOfzo[3].d(), arrayOfzo[3].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.c, new zo(arrayOfzo[4].d(), arrayOfzo[4].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.c, new zo(arrayOfzo[5].d(), arrayOfzo[5].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.c, new zo(arrayOfzo[6].d(), arrayOfzo[6].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.c, new zo(arrayOfzo[7].d(), arrayOfzo[7].e()));
    a(paramzr, paramzje, paramzke, arrayOfzo, paramFloat2);
  }
  
  private static void b(zr paramzr, zke paramzke, zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt1, int paramInt2, float paramFloat6)
    throws Exception
  {
    float f2 = paramzje.N().j();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    float f3 = paramFloat3 + paramFloat4 / 2.0F;
    float f4 = paramFloat5 * paramzje.n() / 100.0F;
    zbs localzbs = paramzje.I();
    float f6 = paramzje.N().h() / paramInt2;
    float f7 = paramInt2 / 2.0F;
    if (localzbs.p()) {
      paramInt1 = paramInt2 + 1 - paramInt1;
    }
    boolean bool = false;
    if ((paramInt1 <= f7) && (!localzbs.p())) {
      bool = true;
    }
    float f5 = ((paramInt1 - f7) * f6 - f4 / 2.0F - paramFloat5 / 2.0F) * 2.0F;
    int i;
    int j;
    if (bool)
    {
      f5 = -f5;
      i = 0;
      j = 1;
    }
    else
    {
      i = 3;
      j = 2;
    }
    for (int k = 0; k <= 180; k++)
    {
      double d = k * 3.141592653589793D / 180.0D;
      float f8 = (float)(paramFloat5 * Math.sin(d));
      float f9 = (float)(f3 + paramFloat4 / 2.0F * Math.cos(d));
      float f1;
      if (f9 <= f2)
      {
        f1 = 2.0F * (f2 - f9);
        if (!localHashMap1.containsKey(Integer.valueOf(360 - k))) {
          localHashMap1.put(Integer.valueOf(360 - k), a(paramzje, paramFloat1, f1, a(360 - k, bool, f5, f8), i));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(k))) {
          localHashMap1.put(Integer.valueOf(k), a(paramzje, paramFloat1, f1, a(k, bool, f5, f8), i));
        }
      }
      else
      {
        f1 = 2.0F * (f9 - f2);
        if (!localHashMap1.containsKey(Integer.valueOf(360 - k))) {
          localHashMap1.put(Integer.valueOf(360 - k), a(paramzje, paramFloat1, f1, a(360 - k, bool, f5, f8), j));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(k))) {
          localHashMap1.put(Integer.valueOf(k), a(paramzje, paramFloat1, f1, a(k, bool, f5, f8), j));
        }
      }
      f9 = (float)(f3 + paramFloat4 / 2.0F * paramFloat6 * Math.cos(d));
      f8 = (float)(paramFloat5 * paramFloat6 * Math.sin(d));
      zo localzo;
      if (f9 <= f2)
      {
        f1 = 2.0F * (f2 - f9);
        if (!localHashMap2.containsKey(Integer.valueOf(360 - k)))
        {
          localzo = a(paramzje, paramFloat1, f1, a(360 - k, bool, f5, f8), i);
          localzo.b(localzo.e() + paramFloat2);
          localHashMap2.put(Integer.valueOf(360 - k), localzo);
        }
        if (!localHashMap2.containsKey(Integer.valueOf(k)))
        {
          localzo = a(paramzje, paramFloat1, f1, a(k, bool, f5, f8), i);
          localzo.b(localzo.e() + paramFloat2);
          localHashMap2.put(Integer.valueOf(k), localzo);
        }
      }
      else
      {
        f1 = 2.0F * (f9 - f2);
        if (!localHashMap2.containsKey(Integer.valueOf(360 - k)))
        {
          localzo = a(paramzje, paramFloat1, f1, a(360 - k, bool, f5, f8), j);
          localzo.b(localzo.e() + paramFloat2);
          localHashMap2.put(Integer.valueOf(360 - k), localzo);
        }
        if (!localHashMap2.containsKey(Integer.valueOf(k)))
        {
          localzo = a(paramzje, paramFloat1, f1, a(k, bool, f5, f8), j);
          localzo.b(localzo.e() + paramFloat2);
          localHashMap2.put(Integer.valueOf(k), localzo);
        }
      }
    }
    for (k = 0; k < 360; k++)
    {
      com.aspose.cells.b.a.a.zf.a(paramzke.c, localHashMap1.get(Integer.valueOf(k)));
      com.aspose.cells.b.a.a.zf.a(paramzke.b, localHashMap2.get(Integer.valueOf(k)));
    }
    if (paramzke.i().h() == 4)
    {
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat2, 180, 360);
    }
    else
    {
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat2, 175, 365);
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat2, 176, 364);
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat2, 177, 363);
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat2, 178, 362);
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat2, 179, 361);
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat2, 180, 360);
    }
  }
  
  private static float a(int paramInt, boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    if (paramBoolean)
    {
      if (paramInt <= 180) {
        return paramFloat1 - paramFloat2;
      }
      return paramFloat1 + paramFloat2;
    }
    if (paramInt <= 180) {
      return paramFloat1 + paramFloat2;
    }
    return paramFloat1 - paramFloat2;
  }
  
  private static float a(float paramFloat1, boolean paramBoolean, float paramFloat2, float paramFloat3)
  {
    if (paramBoolean) {
      paramFloat1 -= paramFloat2 * (1.0F - paramFloat3);
    } else {
      paramFloat1 += paramFloat2 * (1.0F - paramFloat3);
    }
    return paramFloat1;
  }
  
  private static void a(zr paramzr, zje paramzje, List paramList)
    throws Exception
  {
    if (paramList.size() > 1)
    {
      Object localObject1 = null;
      Object localObject2;
      for (int i = 0; i < paramList.size(); i++) {
        if (paramList.get(i) != null)
        {
          localObject2 = (Object[])paramList.get(i);
          localObject1 = (zo[])localObject2[1];
          i++;
          break;
        }
      }
      for (int j = i; j < paramList.size(); j++) {
        if (paramList.get(j) != null)
        {
          Object[] arrayOfObject = (Object[])paramList.get(j);
          localObject2 = (zke)arrayOfObject[0];
          zo[] arrayOfzo = (zo[])arrayOfObject[1];
          a(paramzr, paramzje, (zke)localObject2, (zo[])localObject1, arrayOfzo);
          localObject1 = arrayOfzo;
        }
        else
        {
          localObject1 = null;
        }
      }
    }
  }
  
  private static void a(zr paramzr, zje paramzje, zke paramzke, zo[] paramArrayOfzo1, zo[] paramArrayOfzo2)
    throws Exception
  {
    if ((paramArrayOfzo1 == null) || (paramArrayOfzo2 == null) || (paramzke == null)) {
      return;
    }
    zay localzay = paramzke.i();
    ze localze = new ze();
    localze.b(new zo[] { paramArrayOfzo1[0], paramArrayOfzo2[0], paramArrayOfzo2[1], paramArrayOfzo1[1] });
    com.aspose.cells.b.a.b.zc localzc = null;
    com.aspose.cells.a.d.zs localzs = zanv.a(paramzke.k());
    try
    {
      if ((paramzje.D() == 0) || (paramzje.D() == 360) || (paramzje.D() == 180))
      {
        if (paramArrayOfzo2[1].e() > paramArrayOfzo2[0].e())
        {
          if ((paramzje.D() == 0) || (paramzje.D() == 360)) {
            localzc = zbd.a(localzay, zn.a(localze), 0.6666667F);
          } else {
            localzc = zbd.a(localzay, zn.a(localze));
          }
        }
        else if ((paramzje.D() == 0) || (paramzje.D() == 360)) {
          localzc = zbd.a(localzay, zn.a(localze));
        } else {
          localzc = zbd.a(localzay, zn.a(localze), 0.6666667F);
        }
      }
      else if ((paramzje.D() == 90) || (paramzje.D() == 270))
      {
        if (paramArrayOfzo2[0].e() > paramArrayOfzo1[0].e()) {
          localzc = zbd.a(localzay, zn.a(localze));
        } else {
          localzc = zbd.a(localzay, zn.a(localze), 0.6666667F);
        }
      }
      else if ((paramArrayOfzo1[1].d() != paramArrayOfzo2[1].d()) && (paramArrayOfzo1[1].e() != paramArrayOfzo2[1].e()))
      {
        float f1 = 0.0F;
        float f2 = (f1 - paramArrayOfzo1[1].e() - (f1 - paramArrayOfzo2[1].e())) / (paramArrayOfzo1[1].d() - paramArrayOfzo2[1].d());
        float f3 = f1 - paramArrayOfzo2[1].e() - f2 * paramArrayOfzo2[1].d();
        float f4 = f1 - paramArrayOfzo2[0].e();
        float f5 = f2 * paramArrayOfzo2[0].d() + f3;
        if (((paramzje.D() > 0) && (paramzje.D() < 90)) || ((paramzje.D() > 270) && (paramzje.D() < 360)))
        {
          if (f4 > f5) {
            localzc = zbd.a(localzay, zn.a(localze), 0.6666667F);
          } else {
            localzc = zbd.a(localzay, zn.a(localze));
          }
        }
        else if ((paramzje.D() > 90) && (paramzje.D() < 270)) {
          if (f4 < f5) {
            localzc = zbd.a(localzay, zn.a(localze), 0.6666667F);
          } else {
            localzc = zbd.a(localzay, zn.a(localze));
          }
        }
      }
      if (localzc == null) {
        localzc = zbd.a(localzay, zn.a(localze));
      }
      paramzr.a(localzc, localze);
      paramzr.a(localzs, paramArrayOfzo1[0], paramArrayOfzo2[0]);
      paramzr.a(localzs, paramArrayOfzo2[0], paramArrayOfzo2[1]);
      paramzr.a(localzs, paramArrayOfzo2[1], paramArrayOfzo1[1]);
      paramzr.a(localzs, paramArrayOfzo1[1], paramArrayOfzo1[0]);
      if (localzc != null) {
        localzc.h();
      }
    }
    finally
    {
      if (localzs != null) {
        localzs.s();
      }
    }
  }
  
  private static zo a(zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt1, int paramInt2)
  {
    int i = paramzje.D() / 45;
    float f1 = 0.0F;
    float f2 = 0.0F;
    switch (i)
    {
    case 0: 
    case 8: 
      f1 = paramFloat4 / 2.0F;
      break;
    case 1: 
      f1 = paramFloat4;
      f2 = paramFloat5 / 2.0F;
      break;
    case 2: 
      f1 = paramFloat4;
      f2 = paramFloat5 / 2.0F;
      break;
    case 3: 
      f1 = paramFloat4 / 2.0F;
      f2 = paramFloat5;
      break;
    case 4: 
      f1 = paramFloat4 / 2.0F;
      f2 = paramFloat5;
      break;
    case 5: 
      f1 = 0.0F;
      f2 = paramFloat5 / 2.0F;
      break;
    case 6: 
      f1 = 0.0F;
      f2 = paramFloat5 / 2.0F;
      break;
    case 7: 
      f1 = paramFloat4 / 2.0F;
    }
    float f3 = paramzje.N().j();
    paramFloat3 += f1;
    paramFloat2 /= 2.0F;
    zbs localzbs = paramzje.I();
    float f6 = paramFloat5 * paramzje.n() / 100.0F;
    float f7 = paramzje.N().h() / paramInt2;
    float f8 = paramInt2 / 2.0F;
    if (localzbs.p()) {
      paramInt1 = paramInt2 + 1 - paramInt1;
    }
    float f5;
    float f4;
    zo localzo;
    if ((paramInt1 <= f8) && (!localzbs.p()))
    {
      f5 = ((f8 - paramInt1) * f7 + f6 / 2.0F + paramFloat5 - f2) * 2.0F;
      if (paramFloat3 <= f3)
      {
        f4 = 2.0F * (f3 - paramFloat3);
        localzo = a(paramzje, paramFloat1 + paramFloat2, f4, f5, 0);
      }
      else
      {
        f4 = 2.0F * (paramFloat3 - f3);
        localzo = a(paramzje, paramFloat1 + paramFloat2, f4, f5, 1);
      }
    }
    else
    {
      f5 = ((paramInt1 - f8) * f7 - f6 / 2.0F - paramFloat5 + f2) * 2.0F;
      if (paramFloat3 <= f3)
      {
        f4 = 2.0F * (f3 - paramFloat3);
        localzo = a(paramzje, paramFloat1 + paramFloat2, f4, f5, 3);
      }
      else
      {
        f4 = 2.0F * (paramFloat3 - f3);
        localzo = a(paramzje, paramFloat1 + paramFloat2, f4, f5, 2);
      }
    }
    return localzo;
  }
  
  static double a(zke paramzke)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    zbs localzbs = paramzke.h().E();
    double d3 = localzbs.U();
    zbfe localzbfe = paramzke.h().z();
    int i = localzbfe.h();
    for (int j = 0; j < paramzke.g().getCount(); j++) {
      for (int k = 0; k < localzbfe.getCount(); k++)
      {
        zke localzke = localzbfe.c(k).D().b(j);
        if (localzke != null)
        {
          double d5 = localzke.w();
          if ((d5 > d3) && (d1 < d5 - d3)) {
            d1 = d5 - d3;
          }
          if ((d5 < d3) && (d2 < d3 - d5)) {
            d2 = d3 - d5;
          }
        }
      }
    }
    double d4 = localzbs.g(paramzke.w());
    if (paramzke.w() >= d3) {
      return d1 == 0.0D ? 1.0D : (d1 - (d4 - d3)) / d1;
    }
    return d2 == 0.0D ? 1.0D : (d2 - (d3 - d4)) / d2;
  }
  
  static void a(zbfe paramzbfe, int paramInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    for (int i = 0; i < paramzbfe.getCount(); i++)
    {
      zbfc localzbfc = paramzbfe.c(i);
      double d = localzbfc.D().a(paramInt).w();
      if (d > 0.0D) {
        paramArrayOfDouble1[0] += d;
      }
      if (d < 0.0D) {
        paramArrayOfDouble2[0] += d;
      }
    }
  }
  
  static void b(zbfe paramzbfe, int paramInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    int i = paramzbfe.h();
    for (int j = 0; j < i; j++)
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      double[] arrayOfDouble1 = { d1 };
      double[] arrayOfDouble2 = { d2 };
      a(paramzbfe, j, arrayOfDouble1, arrayOfDouble2);
      d1 = arrayOfDouble1[0];
      d2 = arrayOfDouble2[0];
      if (d1 > paramArrayOfDouble1[0]) {
        paramArrayOfDouble1[0] = d1;
      }
      if (d2 < paramArrayOfDouble2[0]) {
        paramArrayOfDouble2[0] = d2;
      }
    }
  }
  
  private static void a(zr paramzr, zke paramzke, zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
    throws Exception
  {
    zo[] arrayOfzo = new zo[8];
    zbxz.a(arrayOfzo);
    float f2 = paramzje.N().j();
    int i = 3;
    zo localzo = zo.a();
    float f3 = paramFloat1 + paramFloat2 * (1.0F - paramFloat6) / 2.0F;
    float f4 = paramFloat1 + paramFloat2 * (1.0F - paramFloat7) / 2.0F;
    for (int j = 0; j < 2; j++)
    {
      float f1;
      if (f4 <= f2)
      {
        f1 = 2.0F * (f2 - f4);
        arrayOfzo[j] = a(paramzje, paramFloat4, f1, paramFloat3 * paramFloat7, 0);
        arrayOfzo[(j + i)] = a(paramzje, paramFloat4, f1, paramFloat3 * paramFloat7, 3);
      }
      else
      {
        f1 = 2.0F * (f4 - f2);
        arrayOfzo[j] = a(paramzje, paramFloat4, f1, paramFloat3 * paramFloat7, 1);
        arrayOfzo[(j + i)] = a(paramzje, paramFloat4, f1, paramFloat3 * paramFloat7, 2);
      }
      if (f3 <= f2)
      {
        f1 = 2.0F * (f2 - f3);
        localzo = a(paramzje, paramFloat4, f1, paramFloat3 * paramFloat6, 0);
        arrayOfzo[(j + 4)].a(localzo.d());
        arrayOfzo[(j + 4)].b(localzo.e() + paramFloat5);
        localzo = a(paramzje, paramFloat4, f1, paramFloat3 * paramFloat6, 3);
        arrayOfzo[(j + i + 4)].a(localzo.d());
        arrayOfzo[(j + i + 4)].b(localzo.e() + paramFloat5);
      }
      else
      {
        f1 = 2.0F * (f3 - f2);
        localzo = a(paramzje, paramFloat4, f1, paramFloat3 * paramFloat6, 1);
        arrayOfzo[(j + 4)].a(localzo.d());
        arrayOfzo[(j + 4)].b(localzo.e() + paramFloat5);
        localzo = a(paramzje, paramFloat4, f1, paramFloat3 * paramFloat6, 2);
        arrayOfzo[(j + i + 4)].a(localzo.d());
        arrayOfzo[(j + i + 4)].b(localzo.e() + paramFloat5);
      }
      i = 1;
      f4 += paramFloat2 * paramFloat7;
      f3 += paramFloat2 * paramFloat6;
    }
    com.aspose.cells.b.a.a.zf.a(paramzke.b, new zo(arrayOfzo[0].d(), arrayOfzo[0].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.b, new zo(arrayOfzo[1].d(), arrayOfzo[1].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.b, new zo(arrayOfzo[2].d(), arrayOfzo[2].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.b, new zo(arrayOfzo[3].d(), arrayOfzo[3].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.c, new zo(arrayOfzo[4].d(), arrayOfzo[4].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.c, new zo(arrayOfzo[5].d(), arrayOfzo[5].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.c, new zo(arrayOfzo[6].d(), arrayOfzo[6].e()));
    com.aspose.cells.b.a.a.zf.a(paramzke.c, new zo(arrayOfzo[7].d(), arrayOfzo[7].e()));
    a(paramzr, paramzje, paramzke, arrayOfzo, paramFloat5);
  }
  
  private static void a(zr paramzr, zje paramzje, zke paramzke, zo[] paramArrayOfzo, float paramFloat)
    throws Exception
  {
    zay localzay = paramzke.i();
    com.aspose.cells.a.d.zs localzs = zanv.a(paramzke.k());
    try
    {
      paramzr.a(localzs, paramArrayOfzo[0], paramArrayOfzo[1]);
      paramzr.a(localzs, paramArrayOfzo[1], paramArrayOfzo[2]);
      paramzr.a(localzs, paramArrayOfzo[2], paramArrayOfzo[3]);
      paramzr.a(localzs, paramArrayOfzo[0], paramArrayOfzo[3]);
      if (paramFloat != 0.0F)
      {
        paramzr.a(localzs, paramArrayOfzo[4], paramArrayOfzo[5]);
        paramzr.a(localzs, paramArrayOfzo[5], paramArrayOfzo[6]);
        paramzr.a(localzs, paramArrayOfzo[6], paramArrayOfzo[7]);
        paramzr.a(localzs, paramArrayOfzo[4], paramArrayOfzo[7]);
        paramzr.a(localzs, paramArrayOfzo[0], paramArrayOfzo[4]);
        paramzr.a(localzs, paramArrayOfzo[1], paramArrayOfzo[5]);
        paramzr.a(localzs, paramArrayOfzo[2], paramArrayOfzo[6]);
        paramzr.a(localzs, paramArrayOfzo[3], paramArrayOfzo[7]);
      }
      ze localze;
      com.aspose.cells.b.a.b.zc localzc1;
      if (paramFloat != 0.0F)
      {
        Object localObject1;
        com.aspose.cells.b.a.b.zc localzc2;
        if ((paramzje.D() <= 45) || (paramzje.D() == 360))
        {
          localze = new ze();
          localze.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[5], paramArrayOfzo[4] });
          localzc1 = zbd.a(localzay, zn.a(localze));
          try
          {
            if (localzs.c().getA() == 0)
            {
              localObject1 = new com.aspose.cells.a.d.zs(localzc1);
              try
              {
                paramzr.b((com.aspose.cells.a.d.zs)localObject1, paramArrayOfzo[1].d(), paramArrayOfzo[1].e(), paramArrayOfzo[5].d(), paramArrayOfzo[5].e());
              }
              finally
              {
                if (localObject1 != null) {
                  ((com.aspose.cells.a.d.zs)localObject1).s();
                }
              }
            }
            paramzr.a(localzc1, localze);
          }
          finally {}
          localObject1 = new ze();
          ((ze)localObject1).b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
          localzc2 = zbd.a(localzay, zn.a((ze)localObject1), 0.5F);
          try
          {
            paramzr.a(localzc2, (ze)localObject1);
          }
          finally {}
          if (localzs.c().getA() != 0)
          {
            paramzr.a(localzs, localze);
            paramzr.a(localzs, (ze)localObject1);
          }
        }
        else if ((paramzje.D() > 45) && (paramzje.D() <= 90))
        {
          localze = new ze();
          localze.b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
          localzc1 = zbd.a(localzay, zn.a(localze));
          try
          {
            if (localzs.c().getA() == 0)
            {
              localObject1 = new com.aspose.cells.a.d.zs(localzc1);
              try
              {
                paramzr.b((com.aspose.cells.a.d.zs)localObject1, paramArrayOfzo[1].d(), paramArrayOfzo[1].e(), paramArrayOfzo[5].d(), paramArrayOfzo[5].e());
              }
              finally
              {
                if (localObject1 != null) {
                  ((com.aspose.cells.a.d.zs)localObject1).s();
                }
              }
            }
            paramzr.a(localzc1, localze);
          }
          finally {}
          localObject1 = new ze();
          ((ze)localObject1).b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[5], paramArrayOfzo[4] });
          localzc2 = zbd.a(localzay, zn.a((ze)localObject1), 0.5F);
          try
          {
            paramzr.a(localzc2, (ze)localObject1);
          }
          finally {}
          if (localzs.c().getA() != 0)
          {
            paramzr.a(localzs, localze);
            paramzr.a(localzs, (ze)localObject1);
          }
        }
        else if ((paramzje.D() > 90) && (paramzje.D() <= 135))
        {
          localze = new ze();
          localze.b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
          localzc1 = zbd.a(localzay, zn.a(localze));
          try
          {
            if (localzs.c().getA() == 0)
            {
              localObject1 = new com.aspose.cells.a.d.zs(localzc1);
              try
              {
                paramzr.b((com.aspose.cells.a.d.zs)localObject1, paramArrayOfzo[2].d(), paramArrayOfzo[2].e(), paramArrayOfzo[6].d(), paramArrayOfzo[6].e());
              }
              finally
              {
                if (localObject1 != null) {
                  ((com.aspose.cells.a.d.zs)localObject1).s();
                }
              }
            }
            paramzr.a(localzc1, localze);
          }
          finally {}
          localObject1 = new ze();
          ((ze)localObject1).b(new zo[] { paramArrayOfzo[2], paramArrayOfzo[3], paramArrayOfzo[7], paramArrayOfzo[6] });
          localzc2 = zbd.a(localzay, zn.a((ze)localObject1), 0.5F);
          try
          {
            paramzr.a(localzc2, (ze)localObject1);
          }
          finally {}
          if (localzs.c().getA() != 0)
          {
            paramzr.a(localzs, localze);
            paramzr.a(localzs, (ze)localObject1);
          }
        }
        else if ((paramzje.D() > 135) && (paramzje.D() <= 180))
        {
          localze = new ze();
          localze.b(new zo[] { paramArrayOfzo[2], paramArrayOfzo[3], paramArrayOfzo[7], paramArrayOfzo[6] });
          localzc1 = zbd.a(localzay, zn.a(localze));
          try
          {
            if (localzs.c().getA() == 0)
            {
              localObject1 = new com.aspose.cells.a.d.zs(localzc1);
              try
              {
                paramzr.b((com.aspose.cells.a.d.zs)localObject1, paramArrayOfzo[2].d(), paramArrayOfzo[2].e(), paramArrayOfzo[6].d(), paramArrayOfzo[6].e());
              }
              finally
              {
                if (localObject1 != null) {
                  ((com.aspose.cells.a.d.zs)localObject1).s();
                }
              }
            }
            paramzr.a(localzc1, localze);
          }
          finally {}
          localObject1 = new ze();
          ((ze)localObject1).b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
          localzc2 = zbd.a(localzay, zn.a((ze)localObject1), 0.5F);
          try
          {
            paramzr.a(localzc2, (ze)localObject1);
          }
          finally {}
          if (localzs.c().getA() != 0)
          {
            paramzr.a(localzs, localze);
            paramzr.a(localzs, (ze)localObject1);
          }
        }
        else if ((paramzje.D() > 180) && (paramzje.D() <= 225))
        {
          localze = new ze();
          localze.b(new zo[] { paramArrayOfzo[2], paramArrayOfzo[3], paramArrayOfzo[7], paramArrayOfzo[6] });
          localzc1 = zbd.a(localzay, zn.a(localze));
          try
          {
            if (localzs.c().getA() == 0)
            {
              localObject1 = new com.aspose.cells.a.d.zs(localzc1);
              try
              {
                paramzr.b((com.aspose.cells.a.d.zs)localObject1, paramArrayOfzo[3].d(), paramArrayOfzo[3].e(), paramArrayOfzo[7].d(), paramArrayOfzo[7].e());
              }
              finally
              {
                if (localObject1 != null) {
                  ((com.aspose.cells.a.d.zs)localObject1).s();
                }
              }
            }
            paramzr.a(localzc1, localze);
          }
          finally {}
          localObject1 = new ze();
          ((ze)localObject1).b(new zo[] { paramArrayOfzo[3], paramArrayOfzo[0], paramArrayOfzo[4], paramArrayOfzo[7] });
          localzc2 = zbd.a(localzay, zn.a((ze)localObject1), 0.5F);
          try
          {
            paramzr.a(localzc2, (ze)localObject1);
          }
          finally {}
          if (localzs.c().getA() != 0)
          {
            paramzr.a(localzs, localze);
            paramzr.a(localzs, (ze)localObject1);
          }
        }
        else if ((paramzje.D() > 225) && (paramzje.D() <= 270))
        {
          localze = new ze();
          localze.b(new zo[] { paramArrayOfzo[3], paramArrayOfzo[0], paramArrayOfzo[4], paramArrayOfzo[7] });
          localzc1 = zbd.a(localzay, zn.a(localze));
          try
          {
            if (localzs.c().getA() == 0)
            {
              localObject1 = new com.aspose.cells.a.d.zs(localzc1);
              try
              {
                paramzr.b((com.aspose.cells.a.d.zs)localObject1, paramArrayOfzo[3].d(), paramArrayOfzo[3].e(), paramArrayOfzo[7].d(), paramArrayOfzo[7].e());
              }
              finally
              {
                if (localObject1 != null) {
                  ((com.aspose.cells.a.d.zs)localObject1).s();
                }
              }
            }
            paramzr.a(localzc1, localze);
          }
          finally {}
          localObject1 = new ze();
          ((ze)localObject1).b(new zo[] { paramArrayOfzo[2], paramArrayOfzo[3], paramArrayOfzo[7], paramArrayOfzo[6] });
          localzc2 = zbd.a(localzay, zn.a((ze)localObject1), 0.5F);
          try
          {
            paramzr.a(localzc2, (ze)localObject1);
          }
          finally {}
          if (localzs.c().getA() != 0)
          {
            paramzr.a(localzs, localze);
            paramzr.a(localzs, (ze)localObject1);
          }
        }
        else if ((paramzje.D() > 270) && (paramzje.D() <= 315))
        {
          localze = new ze();
          localze.b(new zo[] { paramArrayOfzo[3], paramArrayOfzo[0], paramArrayOfzo[4], paramArrayOfzo[7] });
          localzc1 = zbd.a(localzay, zn.a(localze));
          try
          {
            if (localzs.c().getA() == 0)
            {
              localObject1 = new com.aspose.cells.a.d.zs(localzc1);
              try
              {
                paramzr.b((com.aspose.cells.a.d.zs)localObject1, paramArrayOfzo[0].d(), paramArrayOfzo[0].e(), paramArrayOfzo[4].d(), paramArrayOfzo[4].e());
              }
              finally
              {
                if (localObject1 != null) {
                  ((com.aspose.cells.a.d.zs)localObject1).s();
                }
              }
            }
            paramzr.a(localzc1, localze);
          }
          finally {}
          localObject1 = new ze();
          ((ze)localObject1).b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[5], paramArrayOfzo[4] });
          localzc2 = zbd.a(localzay, zn.a((ze)localObject1), 0.5F);
          try
          {
            paramzr.a(localzc2, (ze)localObject1);
          }
          finally {}
          if (localzs.c().getA() != 0)
          {
            paramzr.a(localzs, localze);
            paramzr.a(localzs, (ze)localObject1);
          }
        }
        else if ((paramzje.D() > 315) && (paramzje.D() < 360))
        {
          localze = new ze();
          localze.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[5], paramArrayOfzo[4] });
          localzc1 = zbd.a(localzay, zn.a(localze));
          try
          {
            if (localzs.c().getA() == 0)
            {
              localObject1 = new com.aspose.cells.a.d.zs(localzc1);
              try
              {
                paramzr.b((com.aspose.cells.a.d.zs)localObject1, paramArrayOfzo[0].d(), paramArrayOfzo[0].e(), paramArrayOfzo[4].d(), paramArrayOfzo[4].e());
              }
              finally
              {
                if (localObject1 != null) {
                  ((com.aspose.cells.a.d.zs)localObject1).s();
                }
              }
            }
            paramzr.a(localzc1, localze);
          }
          finally {}
          localObject1 = new ze();
          ((ze)localObject1).b(new zo[] { paramArrayOfzo[3], paramArrayOfzo[0], paramArrayOfzo[4], paramArrayOfzo[7] });
          localzc2 = zbd.a(localzay, zn.a((ze)localObject1), 0.5F);
          try
          {
            paramzr.a(localzc2, (ze)localObject1);
          }
          finally {}
          if (localzs.c().getA() != 0)
          {
            paramzr.a(localzs, localze);
            paramzr.a(localzs, (ze)localObject1);
          }
        }
        if (paramzje.p() > 0)
        {
          if (paramFloat <= 0.0F)
          {
            localze = new ze();
            localze.b(new zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
            localzc1 = zbd.a(localzay, zn.a(localze), 0.6666667F);
            try
            {
              paramzr.a(localzc1, localze);
            }
            finally {}
            paramzr.a(localzs, localze);
          }
          else
          {
            localze = new ze();
            localze.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
            localzc1 = zbd.a(localzay, zn.a(localze), 0.0F);
            try
            {
              paramzr.a(localzc1, localze);
            }
            finally {}
            paramzr.a(localzs, localze);
          }
        }
        else if (paramzje.p() < 0) {
          if (paramFloat <= 0.0F)
          {
            localze = new ze();
            localze.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
            localzc1 = zbd.a(localzay, zn.a(localze), 0.0F);
            try
            {
              paramzr.a(localzc1, localze);
            }
            finally {}
            paramzr.a(localzs, localze);
          }
          else
          {
            localze = new ze();
            localze.b(new zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
            localzc1 = zbd.a(localzay, zn.a(localze), 0.6666667F);
            try
            {
              paramzr.a(localzc1, localze);
            }
            finally {}
            paramzr.a(localzs, localze);
          }
        }
      }
      else
      {
        localze = new ze();
        localze.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
        if (paramzje.p() > 0) {
          localzc1 = zbd.a(localzay, zn.a(localze), 0.6666667F);
        } else {
          localzc1 = zbd.a(localzay, zn.a(localze), 0.0F);
        }
        paramzr.a(localzc1, localze);
        if (localzc1 != null) {
          localzc1.h();
        }
        paramzr.a(localzs, localze);
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
    float f2 = paramzje.N().j();
    zbfc localzbfc = paramzke.g().a();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    float f3 = paramFloat1 + paramFloat2 / 2.0F;
    for (int i = 0; i <= 180; i++)
    {
      double d = i * 3.141592653589793D / 180.0D;
      float f4 = (float)(paramFloat3 * Math.sin(d));
      float f5 = (float)(f3 + paramFloat2 * paramFloat7 / 2.0F * Math.cos(d));
      float f1;
      if (f5 <= f2)
      {
        f1 = 2.0F * (f2 - f5);
        if (!localHashMap1.containsKey(Integer.valueOf(360 - i))) {
          localHashMap1.put(Integer.valueOf(360 - i), a(paramzje, paramFloat4, f1, f4 * paramFloat7, 0));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(i))) {
          localHashMap1.put(Integer.valueOf(i), a(paramzje, paramFloat4, f1, f4 * paramFloat7, 3));
        }
      }
      else
      {
        f1 = 2.0F * (f5 - f2);
        if (!localHashMap1.containsKey(Integer.valueOf(360 - i))) {
          localHashMap1.put(Integer.valueOf(360 - i), a(paramzje, paramFloat4, f1, f4 * paramFloat7, 1));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(i))) {
          localHashMap1.put(Integer.valueOf(i), a(paramzje, paramFloat4, f1, f4 * paramFloat7, 2));
        }
      }
      f5 = (float)(f3 + paramFloat2 * paramFloat6 / 2.0F * Math.cos(d));
      zo localzo;
      if (f5 <= f2)
      {
        f1 = 2.0F * (f2 - f5);
        if (!localHashMap2.containsKey(Integer.valueOf(360 - i)))
        {
          localzo = a(paramzje, paramFloat4, f1, f4 * paramFloat6, 0);
          localzo.b(localzo.e() + paramFloat5);
          localHashMap2.put(Integer.valueOf(360 - i), localzo);
        }
        if (!localHashMap2.containsKey(Integer.valueOf(i)))
        {
          localzo = a(paramzje, paramFloat4, f1, f4 * paramFloat6, 3);
          localzo.b(localzo.e() + paramFloat5);
          localHashMap2.put(Integer.valueOf(i), localzo);
        }
      }
      else
      {
        f1 = 2.0F * (f5 - f2);
        if (!localHashMap2.containsKey(Integer.valueOf(360 - i)))
        {
          localzo = a(paramzje, paramFloat4, f1, f4 * paramFloat6, 1);
          localzo.b(localzo.e() + paramFloat5);
          localHashMap2.put(Integer.valueOf(360 - i), localzo);
        }
        if (!localHashMap2.containsKey(Integer.valueOf(i)))
        {
          localzo = a(paramzje, paramFloat4, f1, f4 * paramFloat6, 2);
          localzo.b(localzo.e() + paramFloat5);
          localHashMap2.put(Integer.valueOf(i), localzo);
        }
      }
    }
    for (i = 0; i < 360; i++)
    {
      com.aspose.cells.b.a.a.zf.a(paramzke.c, localHashMap1.get(Integer.valueOf(i)));
      com.aspose.cells.b.a.a.zf.a(paramzke.b, localHashMap2.get(Integer.valueOf(i)));
    }
    if (paramzke.i().h() == 4)
    {
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat5, 180, 360);
    }
    else
    {
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat5, 175, 365);
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat5, 176, 364);
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat5, 177, 363);
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat5, 178, 362);
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat5, 179, 361);
      a(paramzr, paramzke, localHashMap1, localHashMap2, paramFloat5, 180, 360);
    }
  }
  
  private static void a(zr paramzr, zke paramzke, HashMap paramHashMap1, HashMap paramHashMap2, float paramFloat, int paramInt1, int paramInt2)
    throws Exception
  {
    zje localzje = paramzke.h();
    if (localzje.ap()) {
      return;
    }
    zbfc localzbfc = paramzke.g().a();
    zay localzay = paramzke.i();
    int i = localzje.D();
    Object localObject1 = null;
    Object localObject2 = null;
    int j = 0;
    int k = 0;
    zo[] arrayOfzo1 = { localObject1 };
    zo[] arrayOfzo2 = { localObject2 };
    int[] arrayOfInt1 = { j };
    int[] arrayOfInt2 = { k };
    a(paramHashMap1, arrayOfzo1, arrayOfzo2, arrayOfInt1, arrayOfInt2);
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
    a(paramHashMap2, arrayOfzo3, arrayOfzo4, arrayOfInt3, arrayOfInt4);
    localObject3 = arrayOfzo3[0];
    localObject4 = arrayOfzo4[0];
    m = arrayOfInt3[0];
    n = arrayOfInt4[0];
    Object localObject5;
    if (paramFloat != 0.0F)
    {
      float f1 = 0.5F;
      float f2 = 7.5F;
      for (float f3 = paramInt1 + i; f3 <= paramInt2 + i; f3 += f2)
      {
        int i1 = (int)(f3 % 360.0F);
        localObject5 = (zo)paramHashMap1.get(Integer.valueOf(i1));
        Object localObject6 = (zo)paramHashMap2.get(Integer.valueOf(i1));
        if (f3 == paramInt1 + i)
        {
          localObject5 = localObject2;
          localObject6 = localObject4;
        }
        float f4 = f2;
        if (((f3 - paramInt1 == 45.0F) && (i <= 30)) || ((f3 - paramInt1 == 135.0F) && (i > 30)) || (f3 - paramInt1 == 90.0F) || (f3 - paramInt1 == 180.0F) || ((f3 - paramInt1 == 225.0F) && (i > 120)) || (f3 - paramInt1 == 270.0F) || ((f3 - paramInt1 == 315.0F) && (i > 210)) || (f3 - paramInt1 == 360.0F) || ((f3 - paramInt1 == 405.0F) && (i > 300)) || (f3 - paramInt1 == 450.0F)) {
          f4 = 2.0F * f2;
        }
        if (f3 == paramInt1 + i) {
          f4 = f2 - i % f2;
        }
        int i3 = f3 + f4 > paramInt2 + i ? (paramInt2 + i) % 360 : (int)((f3 + f4) % 360.0F);
        Object localObject7 = (zo)paramHashMap1.get(Integer.valueOf(i3));
        Object localObject8 = (zo)paramHashMap2.get(Integer.valueOf(i3));
        if (f3 + f4 >= paramInt2 + i)
        {
          localObject7 = localObject1;
          localObject8 = localObject3;
        }
        ze localze3 = new ze();
        zo[] arrayOfzo6 = new zo[(int)f4 + 1];
        zbxz.a(arrayOfzo6);
        int i4 = 0;
        for (int i5 = (int)f3; i5 <= (int)f3 + (int)f4; i5++)
        {
          arrayOfzo6[i4] = ((zo)paramHashMap1.get(Integer.valueOf(i5 % 360)));
          i4++;
        }
        localze3.a((zo)localObject5, (zo)localObject7);
        localze3.a((zo)localObject7, (zo)localObject8);
        zo[] arrayOfzo7 = new zo[(int)f4 + 1];
        zbxz.a(arrayOfzo7);
        i4 = 0;
        for (int i6 = (int)f3 + (int)f4; i6 >= (int)f3; i6--)
        {
          arrayOfzo7[i4] = ((zo)paramHashMap2.get(Integer.valueOf(i6 % 360)));
          i4++;
        }
        localze3.a((zo)localObject8, (zo)localObject6);
        localze3.a((zo)localObject6, (zo)localObject5);
        if ((i >= 0) && (i <= 30))
        {
          if (f3 - paramInt1 < 45.0F) {
            f1 = 0.75F + 0.5F * ((f3 - paramInt1) / 90.0F);
          } else {
            f1 = 1.125F - 0.5F * ((f3 - paramInt1) / 180.0F);
          }
        }
        else if ((i > 30) && (i <= 120))
        {
          if (f3 - paramInt1 < 135.0F) {
            f1 = 0.625F + 0.5F * ((f3 - paramInt1) / 180.0F);
          } else {
            f1 = 1.375F - 0.5F * ((f3 - paramInt1) / 180.0F);
          }
        }
        else if ((i > 120) && (i <= 210))
        {
          if (f3 - paramInt1 < 225.0F) {
            f1 = 0.625F + 0.5F * ((f3 - paramInt1 - 90.0F) / 180.0F);
          } else {
            f1 = 1.375F - 0.5F * ((f3 - paramInt1 - 90.0F) / 180.0F);
          }
        }
        else if ((i > 210) && (i <= 300))
        {
          if (f3 - paramInt1 < 315.0F) {
            f1 = 0.625F + 0.5F * ((f3 - paramInt1 - 180.0F) / 180.0F);
          } else {
            f1 = 1.375F - 0.5F * ((f3 - paramInt1 - 180.0F) / 180.0F);
          }
        }
        else if ((i > 300) && (i <= 360)) {
          if (f3 - paramInt1 < 405.0F) {
            f1 = 0.625F + 0.5F * ((f3 - paramInt1 - 270.0F) / 180.0F);
          } else {
            f1 = 1.375F - 0.5F * ((f3 - paramInt1 - 270.0F) / 180.0F);
          }
        }
        if (f1 == 1.0F) {
          f1 -= 0.011111111F;
        }
        com.aspose.cells.b.a.b.zc localzc2 = zbd.a(localzay, zn.a(localze3), f1);
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
        f3 += f4 - f2;
      }
    }
    com.aspose.cells.a.d.zs localzs = zanv.a(paramzke.k());
    try
    {
      ze localze1 = new ze();
      ze localze2 = new ze();
      zo[] arrayOfzo5 = new zo[paramHashMap1.size()];
      localObject5 = new zo[paramHashMap1.size()];
      zbxz.a(arrayOfzo5);
      zbxz.a((zo[])localObject5);
      for (int i2 = 0; i2 <= 360; i2++)
      {
        arrayOfzo5[i2] = ((zo)paramHashMap1.get(Integer.valueOf(i2)));
        localObject5[i2] = ((zo)paramHashMap2.get(Integer.valueOf(i2)));
      }
      localze1.c(arrayOfzo5);
      localze2.c((zo[])localObject5);
      com.aspose.cells.b.a.b.zc localzc1;
      if (localzje.p() > 0)
      {
        if (paramFloat < 0.0F)
        {
          localzc1 = zbd.a(localzay, zn.a(localze2), 0.7F);
          try
          {
            paramzr.a(localzc1, localze2);
          }
          finally {}
          paramzr.a(localzs, localze2);
          a(paramzr, j, k, paramHashMap1, localzs);
        }
        else if (paramFloat > 0.0F)
        {
          localzc1 = zbd.a(localzay, zn.a(localze2), 0.0F);
          try
          {
            paramzr.a(localzc1, localze1);
          }
          finally {}
          paramzr.a(localzs, localze1);
          a(paramzr, j, k, paramHashMap2, localzs);
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
      else if (localzje.p() < 0)
      {
        if (paramFloat < 0.0F)
        {
          localzc1 = zbd.a(localzay, zn.a(localze2), 0.0F);
          try
          {
            paramzr.a(localzc1, localze1);
          }
          finally {}
          paramzr.a(localzs, localze1);
          a(paramzr, j, k, paramHashMap2, localzs);
        }
        else if (paramFloat > 0.0F)
        {
          localzc1 = zbd.a(localzay, zn.a(localze2), 0.7F);
          try
          {
            paramzr.a(localzc1, localze2);
          }
          finally {}
          paramzr.a(localzs, localze2);
          a(paramzr, j, k, paramHashMap1, localzs);
        }
        else
        {
          localzc1 = zbd.a(localzay, zn.a(localze2), 0.0F);
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
      if (paramFloat != 0.0F)
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
      if ((zo.a(paramArrayOfzo1[0], zo.a())) || (localzo.d() > paramArrayOfzo1[0].d()))
      {
        paramArrayOfzo1[0] = localzo;
        paramArrayOfInt1[0] = ((Integer)localzc.a()).intValue();
      }
      if ((zo.a(paramArrayOfzo2[0], zo.a())) || (localzo.d() < paramArrayOfzo2[0].d()))
      {
        paramArrayOfzo2[0] = localzo;
        paramArrayOfInt2[0] = ((Integer)localzc.a()).intValue();
      }
    }
  }
  
  static void a(zr paramzr, int paramInt1, int paramInt2, HashMap paramHashMap, com.aspose.cells.a.d.zs paramzs)
  {
    if (paramInt2 > paramInt1) {
      paramInt1 += 360;
    }
    zo[] arrayOfzo = new zo[Math.abs(paramInt1 - paramInt2 + 1)];
    zbxz.a(arrayOfzo);
    int i = 0;
    for (int j = paramInt2; j <= paramInt1; j++)
    {
      arrayOfzo[i] = ((zo)paramHashMap.get(Integer.valueOf(j % 360)));
      i++;
    }
    ze localze = new ze();
    localze.c(arrayOfzo);
    paramzr.a(paramzs, localze);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */