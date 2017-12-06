package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class zlr
{
  static ArrayList a(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    zbff localzbff = localzjf.z();
    int i = localzbff.getCount();
    int k = paramzbfd.ah();
    zbt localzbt2;
    zbt localzbt1;
    int j;
    if (k == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
      j = localzbff.e(1);
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
      j = localzbff.e(2);
    }
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzbfd, paramzp, paramFloat, paramDouble);
    }
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f1 = 0.0F;
    float f2 = 1.5F;
    zbfd localzbfd = localzjf.z().d(k);
    if (localzbfd != null)
    {
      f1 = localzbfd.M() / 100.0F;
      f2 = localzbfd.L() / 100.0F;
    }
    ArrayList localArrayList = new ArrayList();
    float f3 = 0.0F;
    int m = paramInt;
    if (localzbt2.p) {
      m = (int)localzbt2.z();
    }
    if ((localzbt2.f()) || (localzjf.u()))
    {
      f3 = m;
    }
    else
    {
      f3 = m - 1;
      if (f3 == 0.0F) {
        f3 = 1.0F;
      }
      if (localzbt2.u) {
        f3 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f3;
    int n = localzbff.a(paramzbfd, k, new int[] { 14 });
    if (n == -1) {
      return localArrayList;
    }
    int i1 = paramzbfd.ak();
    zkh localzkh = paramzbfd.F();
    for (int i2 = 0; i2 < localzkh.getCount(); i2++)
    {
      zkf localzkf = localzkh.b(i2);
      float f4 = (float)d3 / (j - f1 * (j - 1) + f2);
      float f5 = f4 * f1;
      float f6 = f4 * f2;
      float f7 = n * (f4 - f5);
      float f8 = (float)d3 * i2 + f6 / 2.0F + f7;
      if ((!localzbt2.f()) && (!localzjf.u())) {
        f8 -= (float)(d3 / 2.0D);
      }
      if (localzbt2.p()) {
        f8 = paramzp.c() + paramzp.e() - f8 - f4;
      } else {
        f8 = paramzp.c() + f8;
      }
      if ((localzkf != null) && (!localzkf.a()))
      {
        double d4 = localzkf.w();
        float f9 = (float)((paramDouble - d4) / (d1 - d2) * paramzp.f());
        if ((f9 < 0.0F) && (f9 > -1.0F)) {
          f9 = -1.0F;
        }
        if ((f9 > 0.0F) && (f9 < 1.0F)) {
          f9 = 1.0F;
        }
        boolean bool1 = false;
        if (f9 == 0.0F) {
          bool1 = true;
        }
        zuc localzuc = paramzbfd.x();
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf.e()))
        {
          com.aspose.cells.b.a.b.zo localzo = new com.aspose.cells.b.a.b.zo(f8 + f4 / 2.0F, paramFloat);
          double d5 = 0.0D;
          double d6 = 0.0D;
          float f11 = 0.0F;
          float f12 = 0.0F;
          if (localzuc != null)
          {
            switch (localzuc.g())
            {
            case 1: 
              d5 = localzuc.c();
              d6 = d5;
              break;
            case 2: 
              d5 = localzuc.c() * d4 / 100.0D;
              d6 = -d5;
              break;
            case 0: 
              double d7 = localzuc.e().size() > i2 ? localzuc.a(localzuc.e().get(i2)) : 0.0D;
              d5 = d7;
              d7 = localzuc.f().size() > i2 ? localzuc.a(localzuc.f().get(i2)) : 0.0D;
              d6 = d7;
              break;
            case 4: 
              d5 = localzuc.a(paramzbfd.F(), paramInt);
              d6 = d5;
            }
            f11 = (float)d5 / (float)(d1 - d2) * paramzp.f();
            f12 = (float)d6 / (float)(d1 - d2) * paramzp.f();
            if (!localzbt1.p()) {
              localzo.b(localzo.e() + f9);
            } else {
              localzo.b(localzo.e() - f9);
            }
          }
          localzuc.a(localzo, f11, f12);
        }
        float f10 = paramFloat;
        if (!localzbt1.p())
        {
          if (f9 < 0.0F)
          {
            f9 = -f9;
            f10 -= f9;
          }
        }
        else if (f9 < 0.0F) {
          f9 = -f9;
        } else {
          f10 -= f9;
        }
        zq localzq1 = new zq(f8, f10, f4, f9);
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
          if (localzq1.h() + 1.0F >= (f4 - 1.0F) / 3.0F)
          {
            if (!bool1) {
              a(paramzr, localzkf, localzq1, paramFloat, localzbt1, paramzp);
            }
            Object[] arrayOfObject = new Object[5];
            boolean bool2;
            if (localzq2.g() + (localzq2.i() - 1.0F) / 2.0F < paramFloat) {
              bool2 = true;
            } else if (d4 != 0.0D) {
              bool2 = false;
            } else if (localzq2.i() > 1.0F) {
              bool2 = false;
            } else if (localzbt1.p()) {
              bool2 = false;
            } else {
              bool2 = true;
            }
            arrayOfObject[0] = Integer.valueOf(i1);
            arrayOfObject[1] = Integer.valueOf(i2);
            arrayOfObject[2] = localzq2;
            arrayOfObject[3] = localzbt2;
            arrayOfObject[4] = Boolean.valueOf(bool2);
            if (a(localzq2, paramzp, localzkf.o(), bool1)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList, arrayOfObject);
            }
          }
        }
      }
    }
    return localArrayList;
  }
  
  private static boolean a(zq paramzq, com.aspose.cells.b.a.b.zp paramzp, zqy paramzqy, boolean paramBoolean)
  {
    zjf localzjf = paramzqy.a().a();
    if (localzjf.ak()) {
      return true;
    }
    if (paramzqy.j() == 2) {
      return true;
    }
    if (paramzq.g() < paramzp.j()) {
      return true;
    }
    return (paramzq.g() == paramzp.j()) && (paramBoolean);
  }
  
  private static void a(zr paramzr, zjy paramzjy, zq paramzq)
    throws Exception
  {
    paramzjy.c().a(paramzq);
    if (paramzjy.d().h())
    {
      if (paramzq.h() > paramzjy.d().i() / 2.0D) {
        paramzq.c(paramzq.h() - (float)paramzjy.d().i() / 2.0F);
      }
      if (paramzq.i() < 1.0F) {
        paramzq.d(1.0F);
      }
      paramzjy.d().a(paramzq);
    }
  }
  
  private static ArrayList a(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int i = localzjf.z().getCount();
    zbff localzbff = localzjf.z();
    int k = paramzbfd.ah();
    float f1 = 0.0F;
    float f2 = 1.5F;
    zbfd localzbfd = localzjf.z().d(k);
    if (localzbfd != null)
    {
      f1 = localzbfd.M() / 100.0F;
      f2 = localzbfd.L() / 100.0F;
    }
    zbt localzbt1;
    zbt localzbt2;
    int j;
    ArrayList localArrayList1;
    if (k == 1)
    {
      localzbt1 = localzjf.e();
      localzbt2 = localzjf.G();
      j = localzbff.e(1);
      localArrayList1 = ziz.a(localzjf.z().c(), localzjf.U());
    }
    else
    {
      localzbt1 = localzjf.g();
      localzbt2 = localzjf.I();
      j = localzbff.e(2);
      localArrayList1 = ziz.a(localzjf.z().d(), localzjf.U());
    }
    double d1 = localzbt2.n() ? localzbt2.g(localzbt2.z()) : localzbt2.z();
    double d2 = localzbt2.n() ? localzbt2.g(localzbt2.D()) : localzbt2.D();
    paramDouble = localzbt2.n() ? localzbt2.g(paramDouble) : paramDouble;
    ArrayList localArrayList2 = new ArrayList();
    int m = localArrayList1.size();
    int n = localzbt1.j();
    int i1 = (int)localzbt1.D();
    int i2 = (int)localzbt1.z();
    float f3 = 0.0F;
    if ((localzbt1.f()) || (localzjf.u()))
    {
      f3 = zbv.a(n, i2, i1, localzjf.U()) + 1;
    }
    else
    {
      f3 = zbv.a(n, i2, i1, localzjf.U());
      if (f3 == 0.0F) {
        f3 = 1.0F;
      }
      if (localzbt1.u) {
        f3 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f3;
    for (int i3 = 0; i3 < m; i3++)
    {
      zkf localzkf = paramzbfd.F().b(i3);
      float f4 = (float)(d3 / (j - f1 * (j - 1) + f2));
      float f5 = f4 * f1;
      float f6 = f4 * f2;
      int i4 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i3)));
      i4 = zbv.a(n, i4, localzjf.U());
      int i5 = zbv.a(n, i4, i1, localzjf.U());
      float f7 = (float)(d3 * i5);
      if ((!localzbt1.f()) && (!localzjf.u())) {
        f7 -= (float)(d3 / 2.0D);
      }
      float f8 = 0.0F;
      if (localzbt1.p()) {
        f8 = paramzp.c() + paramzp.e() - f7 - f6 / 2.0F - f4 - 1.0F;
      } else {
        f8 = paramzp.c() + f7 + f6 / 2.0F + 1.0F;
      }
      int i6 = localzbff.a(paramzbfd, k, new int[] { 14 });
      if (i6 == -1) {
        return localArrayList2;
      }
      int i7 = paramzbfd.ak();
      if (localzbt1.p()) {
        f8 -= i6 * (f4 - f5);
      } else {
        f8 += i6 * (f4 - f5);
      }
      if ((localzkf != null) && (!localzkf.a()))
      {
        double d4 = localzkf.w();
        float f9 = (float)((paramDouble - d4) / (d1 - d2) * paramzp.f());
        if ((f9 < 0.0F) && (f9 > -1.0F)) {
          f9 = -1.0F;
        }
        if ((f9 > 0.0F) && (f9 < 1.0F)) {
          f9 = 1.0F;
        }
        boolean bool1 = false;
        if (f9 == 0.0F) {
          bool1 = true;
        }
        zuc localzuc = paramzbfd.x();
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf.e()))
        {
          com.aspose.cells.b.a.b.zo localzo = new com.aspose.cells.b.a.b.zo(f8 + f4 / 2.0F, paramFloat);
          double d5 = 0.0D;
          double d6 = 0.0D;
          float f11 = 0.0F;
          float f12 = 0.0F;
          if (localzuc != null)
          {
            switch (localzuc.g())
            {
            case 1: 
              d5 = localzuc.c();
              d6 = d5;
              break;
            case 2: 
              d5 = localzuc.c() * d4 / 100.0D;
              d6 = -d5;
              break;
            case 0: 
              double d7 = localzuc.e().size() > i3 ? localzuc.a(localzuc.e().get(i3)) : 0.0D;
              d5 = d7;
              d7 = localzuc.f().size() > i3 ? localzuc.a(localzuc.f().get(i3)) : 0.0D;
              d6 = d7;
              break;
            case 4: 
              d5 = localzuc.a(paramzbfd.F(), m);
              d6 = d5;
            }
            f11 = (float)d5 / (float)(d1 - d2) * paramzp.f();
            f12 = (float)d6 / (float)(d1 - d2) * paramzp.f();
            if (!localzbt2.p()) {
              localzo.b(localzo.e() + f9);
            } else {
              localzo.b(localzo.e() - f9);
            }
          }
          localzuc.a(localzo, f11, f12);
        }
        float f10 = paramFloat;
        if (!localzbt2.p())
        {
          if (f9 < 0.0F)
          {
            f9 = -f9;
            f10 -= f9;
          }
        }
        else if (f9 < 0.0F) {
          f9 = -f9;
        } else {
          f10 -= f9;
        }
        zq localzq1 = new zq(f8, f10, f4, f9);
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
          if (localzq1.h() + 1.0F >= (f4 - 1.0F) / 3.0F)
          {
            if (!bool1) {
              a(paramzr, localzkf, localzq1, paramFloat, localzbt2, paramzp);
            }
            Object[] arrayOfObject = new Object[5];
            boolean bool2;
            if (localzq1.g() < paramFloat) {
              bool2 = true;
            } else if (d4 != 0.0D) {
              bool2 = false;
            } else if (localzbt2.p()) {
              bool2 = false;
            } else {
              bool2 = true;
            }
            arrayOfObject[0] = Integer.valueOf(i7);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzq2;
            arrayOfObject[3] = localzbt1;
            arrayOfObject[4] = Boolean.valueOf(bool2);
            if (a(localzq2, paramzp, localzkf.o(), bool1)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
            }
          }
        }
      }
    }
    return localArrayList2;
  }
  
  private static void a(zr paramzr, zkf paramzkf, zq paramzq, float paramFloat, zbt paramzbt, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    if ((paramzq.i() < 1.0E-4D) || (paramzkf.z())) {
      return;
    }
    if (paramzq.i() < 1.0F) {
      paramzq.d(1.0F);
    }
    com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    localzp.a(1, 1);
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(localzp);
    if ((paramzkf.i().h() != 0) || (paramzkf.k().h())) {
      paramzkf.a(new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i()));
    }
    a(paramzkf);
    if (paramzkf.i().h() != 0)
    {
      if ((paramzq.m() > paramzp.j()) && (!paramzkf.k().p())) {
        paramzq.d(paramzq.i() - (paramzq.m() - paramzp.j()));
      }
      if ((paramzkf.i().j()) && (paramzkf.i().f().h() == 4)) {
        paramzkf.i().f().e().j(paramzkf.w());
      }
      paramzkf.i().a(paramzq);
    }
    paramzkf.k().a(paramzq);
    paramzr.a(localzf);
  }
  
  static void a(zkf paramzkf)
  {
    zaz localzaz = paramzkf.i();
    zanr localzanr = paramzkf.k();
    boolean bool = localzaz.n();
    if ((bool) && (!localzaz.j()) && (localzaz.h() != 0)) {
      if (paramzkf.h().R() <= 16)
      {
        if (localzaz.e().isEmpty()) {
          localzaz.a(Color.getWhite());
        }
        if (localzanr.c() != 3) {
          localzanr.a(Color.getBlack());
        }
      }
      else
      {
        localzaz.a(localzaz.g());
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
      zq localzq = (zq)arrayOfObject[2];
      zbt localzbt = (zbt)arrayOfObject[3];
      boolean bool = ((Boolean)arrayOfObject[4]).booleanValue();
      int m = (int)(paramzjf.a() * 0.2F);
      a(paramzr, localzbt, j, k, localzq, bool, m);
    }
  }
  
  private static void a(zr paramzr, zbt paramzbt, int paramInt1, int paramInt2, zq paramzq, boolean paramBoolean, int paramInt3)
    throws Exception
  {
    zbff localzbff = paramzbt.e().z();
    zbfd localzbfd = localzbff.c(paramInt1);
    zkf localzkf = localzbff.c(paramInt1).F().b(paramInt2);
    zqy localzqy = localzkf.o();
    zt localzt1 = zra.a(paramzr, paramzbt, localzbff, paramInt1, paramInt2, paramInt3);
    float f1 = paramzq.f() + paramzq.h() / 2.0F - localzt1.b() / 2.0F;
    float f2 = 0.0F;
    int i = localzqy.k() == 0 ? 1 : 0;
    boolean bool = localzqy.a().s();
    zt localzt2 = new zt(localzt1.b(), localzt1.c());
    if (!bool)
    {
      localzt2.a(localzqy.a().t());
      localzt2.b(localzqy.a().u());
      f1 -= (localzt2.b() - localzt1.b()) / 2.0F;
      if ((i != 0) || (localzqy.k() == 1)) {
        f2 -= (localzt2.c() - localzt1.c()) / 2.0F;
      }
    }
    int j = 0;
    int k = localzqy.j();
    if (k == 9) {
      k = zra.b(localzbff.c(paramInt1).m());
    }
    switch (k)
    {
    case 1: 
      f2 += paramzq.g() + paramzq.i() / 2.0F - localzt1.c() / 2.0F;
      if ((!bool) && (i == 0)) {
        f2 += (localzt2.c() - localzt1.c()) / 2.0F;
      }
      break;
    case 2: 
      if (paramBoolean)
      {
        f2 += paramzq.g() + paramzq.i() - localzt1.c();
        j = -1;
        if ((!bool) && (i == 0)) {
          f2 -= localzt2.c() - localzt1.c();
        }
      }
      else
      {
        f2 += paramzq.g();
        j = 5;
        if ((!bool) && (i == 0)) {
          f2 += localzt2.c() - localzt1.c();
        }
      }
      break;
    case 3: 
      if (paramBoolean)
      {
        f2 += paramzq.g();
        j = 5;
        if ((!bool) && (i == 0)) {
          f2 += localzt2.c() - localzt1.c();
        }
      }
      else
      {
        f2 += paramzq.g() + paramzq.i() - localzt1.c();
        j = -1;
        if ((!bool) && (i == 0)) {
          f2 -= localzt2.c() - localzt1.c();
        }
      }
      break;
    default: 
      if (paramBoolean)
      {
        f2 += paramzq.g() - localzt1.c();
        j = -5;
        if ((!bool) && (i == 0)) {
          f2 -= localzt2.c() - localzt1.c();
        }
      }
      else
      {
        f2 += paramzq.g() + paramzq.i();
        j = 5;
        if ((!bool) && (i == 0)) {
          f2 += localzt2.c() - localzt1.c();
        }
      }
      break;
    }
    if (paramzbt.e().N() == 78) {
      j = 0;
    }
    f2 += j;
    if (localzbff.c(paramInt1).b(new int[] { 14 })) {
      if (paramBoolean)
      {
        if (f2 + zra.a + localzt1.c() > paramzq.m()) {
          f2 -= f2 + zra.a + localzt1.c() - paramzq.m();
        }
      }
      else if (f2 < paramzq.g()) {
        f2 += paramzq.g() - f2;
      }
    }
    zjf localzjf = paramzbt.e();
    localzqy.a().b = new com.aspose.cells.b.a.b.zp(zbxz.c(f1), zbxz.c(f2), zbxz.a(localzt1.b()), zbxz.a(localzt1.c()));
    localzqy.a().z();
    zq localzq = new zq(localzqy.a().a.c(), localzqy.a().a.d(), localzqy.a().a.e(), localzqy.a().a.f());
    if (!localzjf.b(localzq))
    {
      zq[] arrayOfzq = { localzq };
      localzjf.a(arrayOfzq);
      localzq = arrayOfzq[0];
      zra.a(paramzr, paramzbt, localzbff, paramInt1, paramInt2, localzq);
    }
  }
  
  static void a(zr paramzr, zbfd paramzbfd, ArrayList paramArrayList1, ArrayList paramArrayList2, com.aspose.cells.b.a.b.zp paramzp)
  {
    zq localzq = paramzr.e();
    Object localObject1;
    Object localObject2;
    for (int i = 0; i < paramArrayList1.size(); i++) {
      if (paramArrayList1.get(i) != null)
      {
        localObject1 = (com.aspose.cells.b.a.b.zo)paramArrayList1.get(i);
        localObject2 = paramzbfd.F().b(((Integer)paramArrayList2.get(i)).intValue());
        if (localObject2 != null) {
          ((zkf)localObject2).a(new zq(((com.aspose.cells.b.a.b.zo)localObject1).d(), ((com.aspose.cells.b.a.b.zo)localObject1).e(), 0.0F, 0.0F));
        }
        if (a(new com.aspose.cells.b.a.b.zo(((com.aspose.cells.b.a.b.zo)localObject1).d() / 10.0F, ((com.aspose.cells.b.a.b.zo)localObject1).e() / 10.0F), localzq)) {
          paramArrayList1.set(i, null);
        }
      }
    }
    if (paramArrayList1.size() < 2) {
      return;
    }
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(paramzp);
    paramzr.a(4, true);
    Object localObject3;
    int k;
    Object localObject7;
    Object localObject6;
    Object localObject8;
    com.aspose.cells.b.a.b.zo localzo;
    if (paramzbfd.G())
    {
      if (paramArrayList1.size() > 1)
      {
        localObject1 = new ArrayList();
        localObject2 = new ArrayList();
        localObject3 = null;
        Object localObject4 = null;
        k = 0;
        for (int m = 0; m < paramArrayList1.size(); m++)
        {
          localObject7 = paramzbfd.F().b(((Integer)paramArrayList2.get(m)).intValue());
          if ((localObject7 == null) || ((!((zkf)localObject7).d()) && (!((zkf)localObject7).z()) && (!((zkf)localObject7).c())))
          {
            localObject3 = paramArrayList1.get(m);
            localObject4 = localObject7;
            if (localObject3 != null)
            {
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject3);
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject3);
            }
            k = m + 1;
            break;
          }
        }
        while (k < paramArrayList1.size())
        {
          localObject6 = paramArrayList1.get(k);
          localObject7 = paramzbfd.F().b(((Integer)paramArrayList2.get(k)).intValue());
          if ((k == paramArrayList1.size() - 1) && ((paramzbfd.m() == 57) || (paramzbfd.m() == 58))) {
            localObject7 = paramzbfd.F().b(0);
          }
          if ((localObject7 == null) || (localObject6 == null))
          {
            if (((ArrayList)localObject1).size() > 1) {
              a(paramzr, (zkf)localObject4, (ArrayList)localObject1, (ArrayList)localObject2, paramzp);
            }
            ((ArrayList)localObject1).clear();
            ((ArrayList)localObject2).clear();
          }
          else if ((localObject7 == null) || ((!((zkf)localObject7).d()) && (!((zkf)localObject7).z()) && (!((zkf)localObject7).c())))
          {
            if ((localObject7 == null) || (localObject6 == null))
            {
              localObject3 = localObject6;
              if (((ArrayList)localObject1).size() > 1) {
                a(paramzr, (zkf)localObject4, (ArrayList)localObject1, (ArrayList)localObject2, paramzp);
              }
              ((ArrayList)localObject1).clear();
              ((ArrayList)localObject2).clear();
              localObject4 = localObject7;
            }
            else
            {
              if ((localObject4 != null) && (!((zkf)localObject4).k().b(((zkf)localObject7).k())) && (((ArrayList)localObject1).size() > 1))
              {
                a(paramzr, (zkf)localObject4, (ArrayList)localObject1, (ArrayList)localObject2, paramzp);
                localObject4 = localObject7;
                localObject8 = (com.aspose.cells.b.a.b.zo)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 1);
                ((ArrayList)localObject1).clear();
                if (localObject6 != null)
                {
                  com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject8);
                  com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject6);
                  com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject6);
                  break label752;
                }
              }
              if (localObject6 != null)
              {
                localObject8 = (com.aspose.cells.b.a.b.zo)paramArrayList1.get(k);
                if (((ArrayList)localObject1).size() > 1)
                {
                  localzo = (com.aspose.cells.b.a.b.zo)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 1);
                  if ((Math.abs(localzo.d() - ((com.aspose.cells.b.a.b.zo)localObject8).d()) < 0.5F) && (Math.abs(localzo.e() - ((com.aspose.cells.b.a.b.zo)localObject8).e()) < 0.5F))
                  {
                    a(paramzr, (zkf)localObject4, (ArrayList)localObject1, (ArrayList)localObject2, paramzp);
                    ((ArrayList)localObject1).clear();
                    ((ArrayList)localObject2).clear();
                  }
                }
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject6);
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject6);
              }
              localObject4 = localObject7;
            }
          }
          label752:
          k++;
        }
        if (((ArrayList)localObject1).size() > 1) {
          a(paramzr, (zkf)localObject4, (ArrayList)localObject1, (ArrayList)localObject2, paramzp);
        }
      }
    }
    else if (paramArrayList1.size() > 1)
    {
      localObject1 = new ArrayList();
      localObject2 = null;
      localObject3 = null;
      int j = 0;
      for (k = 0; k < paramArrayList1.size(); k++)
      {
        localObject6 = paramzbfd.F().b(((Integer)paramArrayList2.get(k)).intValue());
        if ((localObject6 == null) || ((!((zkf)localObject6).d()) && (!((zkf)localObject6).z()) && (!((zkf)localObject6).c())))
        {
          localObject2 = paramArrayList1.get(k);
          if ((localObject2 == null) || (((com.aspose.cells.b.a.b.zo)localObject2).d() >= 0.0F))
          {
            localObject3 = localObject6;
            if (localObject2 != null) {
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject2);
            }
            j = k + 1;
            break;
          }
        }
      }
      Object localObject5;
      while (j < paramArrayList1.size())
      {
        localObject5 = paramArrayList1.get(j);
        localObject6 = paramzbfd.F().b(((Integer)paramArrayList2.get(j)).intValue());
        if ((j == paramArrayList1.size() - 1) && ((paramzbfd.m() == 57) || (paramzbfd.m() == 58))) {
          localObject6 = paramzbfd.F().b(0);
        }
        if (((localObject6 == null) || ((!((zkf)localObject6).d()) && (!((zkf)localObject6).z()) && (!((zkf)localObject6).c()))) && ((localObject5 == null) || (((com.aspose.cells.b.a.b.zo)localObject5).d() >= 0.0F))) {
          if ((localObject6 == null) || (localObject5 == null))
          {
            localObject2 = localObject5;
            if (((ArrayList)localObject1).size() > 1)
            {
              localObject7 = new ze();
              localObject8 = a((List)localObject1);
              a(paramzr, (com.aspose.cells.b.a.b.zo[])localObject8, (zkf)localObject3, paramzp);
            }
            ((ArrayList)localObject1).clear();
            localObject3 = localObject6;
          }
          else
          {
            if ((localObject3 != null) && (!((zkf)localObject3).k().a(((zkf)localObject6).k())) && (((ArrayList)localObject1).size() > 1))
            {
              localObject7 = new ze();
              localObject8 = a((List)localObject1);
              a(paramzr, (com.aspose.cells.b.a.b.zo[])localObject8, (zkf)localObject3, paramzp);
              localObject3 = localObject6;
              localzo = (com.aspose.cells.b.a.b.zo)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 1);
              ((ArrayList)localObject1).clear();
              if (localObject5 != null)
              {
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localzo);
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject5);
                break label1248;
              }
            }
            if (localObject5 != null) {
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, localObject5);
            }
            localObject3 = localObject6;
          }
        }
        label1248:
        j++;
      }
      if (((ArrayList)localObject1).size() > 1)
      {
        localObject5 = new ze();
        localObject6 = a((List)localObject1);
        a(paramzr, (com.aspose.cells.b.a.b.zo[])localObject6, (zkf)localObject3, paramzp);
      }
    }
    paramzr.a(localzf);
  }
  
  private static double a(com.aspose.cells.b.a.b.zo paramzo1, com.aspose.cells.b.a.b.zo paramzo2, com.aspose.cells.b.a.b.zo paramzo3)
  {
    double d1 = Math.sqrt(Math.pow(paramzo2.e() - paramzo1.e(), 2.0D) + Math.pow(paramzo2.d() - paramzo1.d(), 2.0D));
    double d2 = Math.sqrt(Math.pow(paramzo3.e() - paramzo2.e(), 2.0D) + Math.pow(paramzo3.d() - paramzo2.d(), 2.0D));
    double d3 = Math.sqrt(Math.pow(paramzo3.e() - paramzo1.e(), 2.0D) + Math.pow(paramzo3.d() - paramzo1.d(), 2.0D));
    double d4 = (Math.pow(d1, 2.0D) + Math.pow(d2, 2.0D) - Math.pow(d3, 2.0D)) / (2.0D * d1 * d2);
    return Math.acos(d4);
  }
  
  private static void a(zr paramzr, com.aspose.cells.b.a.b.zo[] paramArrayOfzo, zkf paramzkf, com.aspose.cells.b.a.b.zp paramzp)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (paramArrayOfzo.length < 3)
    {
      localObject1 = paramArrayOfzo[0];
      localObject2 = paramArrayOfzo[1];
      localObject3 = new com.aspose.cells.b.a.b.zo[] { localObject1 };
      localObject4 = new com.aspose.cells.b.a.b.zo[] { localObject2 };
      a(paramzp, (com.aspose.cells.b.a.b.zo[])localObject3, (com.aspose.cells.b.a.b.zo[])localObject4);
      localObject1 = localObject3[0];
      localObject2 = localObject4[0];
      paramzkf.k().a((com.aspose.cells.b.a.b.zo)localObject1, (com.aspose.cells.b.a.b.zo)localObject2);
    }
    else
    {
      localObject1 = new com.aspose.cells.b.a.b.zo[][] { paramArrayOfzo };
      a((com.aspose.cells.b.a.b.zo[][])localObject1);
      paramArrayOfzo = localObject1[0];
      localObject2 = new ArrayList();
      localObject3 = paramArrayOfzo[0];
      localObject4 = paramArrayOfzo[1];
      com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject3);
      com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localObject4);
      for (int i = 2; i < paramArrayOfzo.length; i++)
      {
        com.aspose.cells.b.a.b.zo localzo = paramArrayOfzo[i];
        double d = a((com.aspose.cells.b.a.b.zo)localObject3, (com.aspose.cells.b.a.b.zo)localObject4, localzo);
        d = d * 180.0D / 3.141592653589793D;
        if ((paramzkf.l().c() == 2) && ((paramzkf.l().a().getA() & 0xFF) != 255))
        {
          com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, localzo);
          localObject3 = localObject4;
          localObject4 = localzo;
        }
        else if (d < 30.0D)
        {
          a(paramzr, (ArrayList)localObject2, paramzkf);
          paramzkf.k().a((com.aspose.cells.b.a.b.zo)localObject4, localzo);
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
        a(paramzr, (ArrayList)localObject2, paramzkf);
      }
    }
  }
  
  private static void a(zr paramzr, ArrayList paramArrayList, zkf paramzkf)
  {
    if (paramArrayList.size() == 2)
    {
      paramzkf.k().a((com.aspose.cells.b.a.b.zo)paramArrayList.get(0), (com.aspose.cells.b.a.b.zo)paramArrayList.get(1));
    }
    else
    {
      ze localze1 = new ze();
      com.aspose.cells.b.a.b.zo[] arrayOfzo = a(paramArrayList);
      localze1.a(arrayOfzo);
      ze localze2 = new ze();
      localze2.a(arrayOfzo);
      com.aspose.cells.a.d.zs localzs = paramzkf.k().b(localze2);
      if ((paramzkf.l().c() == 2) && ((paramzkf.l().a().getA() & 0xFF) != 255))
      {
        zq localzq1 = zn.a(localze1);
        zq localzq2 = paramzr.e();
        localzq1.a((int)(localzs.p() / 2.0F + 0.5F), (int)(localzs.p() / 2.0F + 0.5F));
      }
      paramzkf.k().a(localze1);
      localzs.dispose();
      localze2.g();
      localze1.g();
    }
  }
  
  private static void a(com.aspose.cells.b.a.b.zp paramzp, com.aspose.cells.b.a.b.zo[] paramArrayOfzo1, com.aspose.cells.b.a.b.zo[] paramArrayOfzo2)
  {
    if (paramArrayOfzo2[0].d() == paramArrayOfzo1[0].d()) {
      return;
    }
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
  
  private static void a(com.aspose.cells.b.a.b.zo[][] paramArrayOfzo)
  {
    com.aspose.cells.b.a.b.zo localzo1 = com.aspose.cells.b.a.b.zo.a();
    if (paramArrayOfzo[0].length > 0) {
      localzo1 = paramArrayOfzo[0][0];
    }
    int i = 0;
    for (int j = 1; j < paramArrayOfzo[0].length; j++)
    {
      com.aspose.cells.b.a.b.zo localzo2 = paramArrayOfzo[0][j];
      if (paramArrayOfzo[0].length - i <= 2) {
        break;
      }
      if ((Math.abs(localzo1.d() - localzo2.d()) < 1.0F) && (Math.abs(localzo1.e() - localzo2.e()) < 1.0F))
      {
        paramArrayOfzo[0][j] = com.aspose.cells.b.a.b.zo.a();
        i++;
      }
      else
      {
        localzo1 = paramArrayOfzo[0][j];
      }
    }
    if (i > 0)
    {
      com.aspose.cells.b.a.b.zo[] arrayOfzo = new com.aspose.cells.b.a.b.zo[paramArrayOfzo[0].length - i];
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
  
  static com.aspose.cells.b.a.b.zo[] a(List paramList)
  {
    com.aspose.cells.b.a.b.zo[] arrayOfzo = new com.aspose.cells.b.a.b.zo[paramList.size()];
    zbxz.a(arrayOfzo);
    for (int i = 0; i < paramList.size(); i++) {
      arrayOfzo[i] = ((com.aspose.cells.b.a.b.zo)paramList.get(i));
    }
    return arrayOfzo;
  }
  
  private static void a(zr paramzr, zkf paramzkf, ArrayList paramArrayList1, ArrayList paramArrayList2, com.aspose.cells.b.a.b.zp paramzp)
  {
    com.aspose.cells.a.d.zs localzs = null;
    ze localze = new ze();
    com.aspose.cells.b.a.b.zo[] arrayOfzo1 = a(paramArrayList2);
    if (arrayOfzo1.length > 1)
    {
      localze.c(arrayOfzo1);
      localzs = paramzkf.k().b(localze);
    }
    else
    {
      return;
    }
    float f1 = 0.3F;
    float f2 = 0.5F;
    int i = 3;
    int j = paramArrayList2.size() - paramArrayList1.size();
    int k = paramArrayList1.size() - 1;
    if (paramArrayList1.size() < i)
    {
      if (arrayOfzo1.length <= 2) {
        paramzr.b(localzs, arrayOfzo1);
      } else {
        paramzr.a(localzs, arrayOfzo1, j, k, f2);
      }
    }
    else
    {
      ArrayList localArrayList = new ArrayList();
      int m = 0;
      int n = 0;
      for (int i1 = 0; i1 < paramArrayList1.size(); i1++)
      {
        com.aspose.cells.b.a.b.zo localzo1 = (com.aspose.cells.b.a.b.zo)paramArrayList1.get(i1);
        com.aspose.cells.b.a.b.zo localzo2;
        if (i1 > 0)
        {
          localzo2 = (com.aspose.cells.b.a.b.zo)paramArrayList1.get(i1 - 1);
          if ((Math.abs(localzo1.d() - localzo2.d()) < 0.5F) && (Math.abs(localzo1.e() - localzo2.e()) < 0.5F)) {}
        }
        else
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList, localzo1);
          if (localArrayList.size() >= 3)
          {
            localzo2 = (com.aspose.cells.b.a.b.zo)localArrayList.get(localArrayList.size() - 3);
            com.aspose.cells.b.a.b.zo localzo3 = (com.aspose.cells.b.a.b.zo)localArrayList.get(localArrayList.size() - 2);
            float f3 = (localzo3.e() - localzo2.e()) / (localzo3.d() - localzo2.d());
            float f4 = (localzo1.e() - localzo3.e()) / (localzo1.d() - localzo3.d());
            float f5 = localzo3.e() - localzo2.e();
            float f6 = localzo1.e() - localzo3.e();
            double d = Math.abs(Math.abs(f4) - Math.abs(f3));
            if (Math.abs(f4) > 10.0F)
            {
              if (localArrayList.size() >= 6)
              {
                com.aspose.cells.b.a.b.zo[] arrayOfzo2 = a(localArrayList, 0, localArrayList.size() - 3);
                a(paramzr, localzs, arrayOfzo2, f2);
                float f8 = 2.0F / Math.abs(f4);
                com.aspose.cells.b.a.b.zo[] arrayOfzo3 = a(localArrayList, localArrayList.size() - 3, localArrayList.size() - 1);
                a(paramzr, localzs, arrayOfzo3, f8);
              }
              else
              {
                float f7 = 2.0F / Math.abs(f4);
                a(paramzr, localzs, a(localArrayList), f7);
              }
              j += localArrayList.size() - 1;
              k -= localArrayList.size() - 1;
              localArrayList.clear();
              com.aspose.cells.b.a.a.zf.a(localArrayList, localzo1);
              m = 0;
              n = 0;
            }
            if ((Math.abs(f4) < 2.0F) || (f6 / f5 < 8.0F)) {}
          }
          else
          {
            boolean bool1 = a(localzo1, paramzp);
            if (bool1)
            {
              if (n != 0)
              {
                int i2 = localArrayList.size() - 1 - 1;
                i1++;
                while (i1 < paramArrayList1.size())
                {
                  com.aspose.cells.b.a.b.zo localzo4 = (com.aspose.cells.b.a.b.zo)paramArrayList1.get(i1);
                  boolean bool2 = a(localzo4, paramzp);
                  if (!bool2) {
                    break;
                  }
                  com.aspose.cells.b.a.a.zf.a(localArrayList, localzo4);
                  i1++;
                }
                i1--;
                if ((localArrayList.size() == 2) || (i2 == 0))
                {
                  j += localArrayList.size() - 1;
                  k -= localArrayList.size() - 1;
                  a(paramzr, localzs, a(localArrayList), f1);
                  localArrayList.clear();
                  com.aspose.cells.b.a.a.zf.a(localArrayList, localzo1);
                  m = 0;
                  n = 0;
                }
                else if (localArrayList.size() > 2)
                {
                  j += localArrayList.size() - 1;
                  k -= localArrayList.size() - 1;
                  paramzr.a(localzs, a(localArrayList, 0, i2), f2);
                  a(paramzr, localzs, a(localArrayList, i2, localArrayList.size() - 1), f1);
                  localArrayList.clear();
                  com.aspose.cells.b.a.a.zf.a(localArrayList, localzo1);
                  m = 0;
                  n = 0;
                }
              }
            }
            else if (m != 0)
            {
              j += localArrayList.size() - 1;
              k -= localArrayList.size() - 1;
              a(paramzr, localzs, a(localArrayList), f1);
              localArrayList.clear();
              com.aspose.cells.b.a.a.zf.a(localArrayList, localzo1);
              m = 0;
              n = 0;
            }
            if (bool1) {
              m = 1;
            } else {
              n = 1;
            }
          }
        }
      }
      if (localArrayList.size() > 1) {
        if (m != 0) {
          a(paramzr, localzs, arrayOfzo1, j, k, f1);
        } else if (arrayOfzo1.length <= 2) {
          paramzr.b(localzs, arrayOfzo1);
        } else {
          paramzr.a(localzs, arrayOfzo1, j, k, f2);
        }
      }
    }
    if (localzs != null) {
      localzs.dispose();
    }
  }
  
  private static void a(zr paramzr, com.aspose.cells.a.d.zs paramzs, com.aspose.cells.b.a.b.zo[] paramArrayOfzo, float paramFloat)
  {
    a(paramzr, paramzs, paramArrayOfzo, 0, paramArrayOfzo.length - 1, paramFloat);
  }
  
  private static void a(zr paramzr, com.aspose.cells.a.d.zs paramzs, com.aspose.cells.b.a.b.zo[] paramArrayOfzo, int paramInt1, int paramInt2, float paramFloat)
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
    if (paramArrayOfzo.length <= 2) {
      paramzr.b(paramzs, paramArrayOfzo);
    } else {
      paramzr.a(paramzs, paramArrayOfzo, paramInt1, paramInt2, paramFloat);
    }
  }
  
  private static com.aspose.cells.b.a.b.zo[] a(List paramList, int paramInt1, int paramInt2)
  {
    com.aspose.cells.b.a.b.zo[] arrayOfzo = new com.aspose.cells.b.a.b.zo[paramInt2 - paramInt1 + 1];
    zbxz.a(arrayOfzo);
    for (int i = paramInt1; i <= paramInt2; i++) {
      arrayOfzo[(i - paramInt1)] = ((com.aspose.cells.b.a.b.zo)paramList.get(i));
    }
    return arrayOfzo;
  }
  
  private static boolean a(com.aspose.cells.b.a.b.zo paramzo, com.aspose.cells.b.a.b.zp paramzp)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    return a(paramzo, localzq);
  }
  
  private static boolean a(com.aspose.cells.b.a.b.zo paramzo, zq paramzq)
  {
    return (paramzo.d() < paramzq.f()) || (paramzo.d() > paramzq.l()) || (paramzo.e() < paramzq.g()) || (paramzo.e() > paramzq.m());
  }
  
  static ArrayList a(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, int paramInt, boolean paramBoolean)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 37;
    arrayOfInt[1] = 40;
    int i = paramzbfd.ah();
    zbt localzbt2;
    zbt localzbt1;
    if (i == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
    }
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzbfd, paramzp, paramFloat, paramDouble, paramBoolean);
    }
    zbff localzbff = localzjf.z();
    int j = localzbff.getCount();
    float f1 = paramzbfd.L() / 100.0F;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    boolean bool = paramzbfd.N();
    zanr localzanr1 = paramzbfd.Q();
    zanr localzanr2 = paramzbfd.R();
    zjy localzjy1 = paramzbfd.U();
    zjy localzjy2 = paramzbfd.V();
    ArrayList localArrayList1 = new ArrayList();
    float f2 = 0.0F;
    int k = paramInt;
    if (localzbt2.p) {
      k = (int)localzbt2.z();
    }
    if ((localzbt2.f()) || (localzjf.u()))
    {
      f2 = k;
    }
    else
    {
      f2 = k - 1;
      if (f2 == 0.0F) {
        f2 = 1.0F;
      }
      if (localzbt2.u) {
        f2 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f2;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    List localList = localzbff.a(i, arrayOfInt);
    int i1;
    int i4;
    for (int m = 0; m < localList.size(); m++)
    {
      zbfd localzbfd1 = (zbfd)localList.get(m);
      if ((!localzjf.ao()) || (localzbfd1.equals(paramzbfd)))
      {
        i1 = localzbff.a(localzbfd1, i, arrayOfInt);
        int i2 = localzbfd1.ak();
        ArrayList localArrayList4 = new ArrayList();
        ArrayList localArrayList5 = new ArrayList();
        zkh localzkh = localzbfd1.F();
        for (i4 = 0; i4 < paramInt; i4++)
        {
          zkf localzkf1 = localzkh.b(i4);
          if ((localzkf1 != null) && (!localzkf1.a()))
          {
            double d4 = (float)d3 * i4;
            if ((localzbt2.f()) || (localzjf.u())) {
              d4 += (float)(d3 / 2.0D);
            }
            if (localzbt2.p()) {
              d4 = paramzp.c() + paramzp.e() - d4;
            } else {
              d4 = paramzp.c() + d4;
            }
            double d5 = paramFloat;
            double d6 = localzkf1.w();
            double d7 = (d6 - paramDouble) / (d1 - d2) * paramzp.f();
            zuc localzuc = paramzbfd.x();
            com.aspose.cells.b.a.b.zo localzo2;
            if ((localzuc != null) && (localzbfd1.equals(paramzbfd)) && (localzuc.d() != 2) && (!localzkf1.e()))
            {
              localzo2 = new com.aspose.cells.b.a.b.zo((float)d4, paramFloat);
              double d8 = 0.0D;
              double d9 = 0.0D;
              float f8 = 0.0F;
              float f9 = 0.0F;
              switch (localzuc.g())
              {
              case 1: 
                d8 = localzuc.c();
                d9 = d8;
                break;
              case 2: 
                d8 = localzuc.c() * d6 / 100.0D;
                d9 = -d8;
                break;
              case 0: 
                double d10 = localzuc.e().size() > i4 ? localzuc.a(localzuc.e().get(i4)) : 0.0D;
                d8 = d10;
                d10 = localzuc.f().size() > i4 ? localzuc.a(localzuc.f().get(i4)) : 0.0D;
                d9 = d10;
                break;
              case 4: 
                d8 = localzuc.a(localzkh, paramInt);
                d9 = d8;
              }
              f8 = (float)d8 / (float)(d1 - d2) * paramzp.f();
              f9 = (float)d9 / (float)(d1 - d2) * paramzp.f();
              if (!localzbt1.p()) {
                localzo2.b(localzo2.e() - (float)d7);
              } else {
                localzo2.b(localzo2.e() + (float)d7);
              }
              localzuc.a(localzo2, f8, f9);
            }
            if (!paramBoolean)
            {
              if (!localzbt1.p()) {
                d5 -= d7;
              } else {
                d5 += d7;
              }
              localzo2 = new com.aspose.cells.b.a.b.zo((float)d4, (float)d5);
              com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo2);
              com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i4));
              if (localzbfd1.equals(paramzbfd))
              {
                com.aspose.cells.b.a.a.zf.a(localArrayList3, localzo2);
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i2);
                arrayOfObject[1] = Integer.valueOf(i4);
                arrayOfObject[2] = localzo2;
                arrayOfObject[3] = localzbt2;
                if (a(localzkf1, d1, d2)) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
                }
              }
            }
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i4));
            if (localzbfd1.equals(paramzbfd)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, null);
            }
          }
        }
        if (!paramBoolean)
        {
          if (localzbfd1.equals(paramzbfd)) {
            a(paramzr, paramzbfd, localArrayList4, localArrayList5, paramzp);
          }
          com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList4);
        }
      }
    }
    if (paramBoolean) {
      return null;
    }
    if (!localzjf.ao()) {
      if (paramzbfd.aG()) {
        zbzu.a(paramzr, paramzbfd, localArrayList3, paramzp);
      } else {
        paramzbfd.b = localArrayList3;
      }
    }
    if ((!localzjf.ao()) && ((paramzbfd.O()) || (paramzbfd.N()) || (paramzbfd.P()))) {
      for (m = 0; m < paramInt; m++)
      {
        int n = 0;
        i1 = 0;
        float f3 = 0.0F;
        float f4 = 0.0F;
        float f5 = 0.0F;
        int i3 = 0;
        i4 = 0;
        float f6 = 0.0F;
        float f7 = 0.0F;
        Object localObject;
        for (int i5 = 0; i5 < localArrayList2.size(); i5++)
        {
          localObject = (ArrayList)localArrayList2.get(i5);
          zbfd localzbfd2 = (zbfd)localList.get(i5);
          zkf localzkf2 = localzbfd2.F().b(m);
          if (((localzkf2 == null) || ((!localzkf2.d()) && (!localzkf2.z()))) && (((ArrayList)localObject).size() > m) && (m < ((ArrayList)localObject).size()) && (((ArrayList)localObject).get(m) != null))
          {
            com.aspose.cells.b.a.b.zo localzo1 = (com.aspose.cells.b.a.b.zo)((ArrayList)localObject).get(m);
            f5 = localzo1.d();
            if (n == 0)
            {
              f3 = localzo1.e();
              f4 = localzo1.e();
              n = 1;
            }
            else if (i1 == 0)
            {
              if (f3 < localzo1.e())
              {
                f4 = f3;
                f3 = localzo1.e();
                i1 = 1;
              }
              else
              {
                f4 = localzo1.e();
                i1 = 1;
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
            if (i5 == 0)
            {
              f6 = localzo1.e();
              i3 = 1;
            }
            else if (i5 == localArrayList2.size() - 1)
            {
              f7 = localzo1.e();
              i4 = 1;
            }
          }
        }
        if (paramzbfd.equals(localList.get(localList.size() - 1))) {
          if ((paramzbfd.O()) && (n != 0) && (i1 != 0)) {
            localzanr2.a(f5, f3, f5, f4);
          } else if ((bool) && (n != 0)) {
            localzanr1.a(f5, f4, f5, paramFloat);
          }
        }
        if ((paramzbfd.P()) && (i3 != 0) && (i4 != 0))
        {
          i5 = (int)(d3 / (1.0F + f1));
          localObject = new zq();
          if (f6 <= f7)
          {
            ((zq)localObject).c(i5);
            ((zq)localObject).d(f7 - f6);
            ((zq)localObject).a(f5 - ((zq)localObject).h() / 2.0F);
            ((zq)localObject).b(f6);
            a(paramzr, localzjy2, (zq)localObject);
          }
          else
          {
            ((zq)localObject).c(i5);
            ((zq)localObject).d(f6 - f7);
            ((zq)localObject).a(f5 - ((zq)localObject).h() / 2.0F);
            ((zq)localObject).b(f7);
            a(paramzr, localzjy1, (zq)localObject);
          }
        }
      }
    }
    return localArrayList1;
  }
  
  private static boolean a(zkf paramzkf, double paramDouble1, double paramDouble2)
  {
    if (paramzkf.z()) {
      return false;
    }
    if (paramzkf.w() > paramDouble1) {
      return false;
    }
    return paramzkf.w() >= paramDouble2;
  }
  
  static void a(zr paramzr, zbt paramzbt, int paramInt1, int paramInt2, com.aspose.cells.b.a.b.zo paramzo, int paramInt3)
    throws Exception
  {
    zbff localzbff = paramzbt.e().z();
    zbfd localzbfd = localzbff.c(paramInt1);
    zkf localzkf = localzbfd.F().b(paramInt2);
    zqy localzqy = localzkf.o();
    zt localzt = zra.a(paramzr, paramzbt, localzbff, paramInt1, paramInt2, paramInt3);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 4.0F;
    if ((localzbfd.m() == 12) || (localzbfd.m() == 13)) {
      f3 += localzkf.a / 2.0F;
    } else if (localzkf.m().d() != 1) {
      f3 += (int)(localzkf.m().c() / 2.0F);
    }
    int i = localzqy.j();
    if (i == 9) {
      i = zra.b(localzbff.c(paramInt1).m());
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
      f2 -= zra.a;
      break;
    case 6: 
      f1 = paramzo.d() - localzt.b() / 2.0F;
      f2 = paramzo.e() + f3;
      f2 += zra.a;
      break;
    case 7: 
      f1 = paramzo.d() - localzt.b() - f3;
      f2 = paramzo.e() - localzt.c() / 2.0F;
      if (localzqy.e()) {
        f1 -= zra.a;
      }
      break;
    case 2: 
    case 3: 
    case 4: 
    default: 
      f1 = paramzo.d() + f3;
      f2 = paramzo.e() - localzt.c() / 2.0F;
      if (localzqy.e()) {
        f1 += zra.a;
      }
      break;
    }
    int j = (localzqy.a().q()) && (localzqy.a().p()) ? 1 : 0;
    localzqy.a().b = new com.aspose.cells.b.a.b.zp(zbxz.c(f1), zbxz.c(f2), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
    localzqy.a().z();
    zra.a(paramzr, paramzbt, localzbff, paramInt1, paramInt2, localzqy.a().a);
    if ((localzbfd.S()) && (j == 0)) {
      zra.a(paramzr, localzbfd.T(), localzqy.a().a, paramzo, 4.0F);
    }
  }
  
  static void b(zr paramzr, zjf paramzjf, ArrayList paramArrayList)
    throws Exception
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      com.aspose.cells.b.a.b.zo localzo = (com.aspose.cells.b.a.b.zo)arrayOfObject[2];
      zbt localzbt = (zbt)arrayOfObject[3];
      int m = (int)(paramzjf.a() * 0.2F);
      a(paramzr, localzbt, j, k, localzo, m);
    }
  }
  
  private static ArrayList a(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, boolean paramBoolean)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 37;
    arrayOfInt[1] = 40;
    int i = paramzbfd.ah();
    zbff localzbff = localzjf.z();
    int j = localzbff.getCount();
    float f1 = paramzbfd.L() / 100.0F;
    zbt localzbt2;
    zbt localzbt1;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
      localArrayList1 = ziz.a(localzjf.z().c(), localzjf.U());
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
      localArrayList1 = ziz.a(localzjf.z().d(), localzjf.U());
    }
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    boolean bool = paramzbfd.N();
    zanr localzanr1 = paramzbfd.Q();
    zanr localzanr2 = paramzbfd.R();
    zjy localzjy1 = paramzbfd.U();
    zjy localzjy2 = paramzbfd.V();
    int k = localArrayList1.size();
    int m = localzbt2.j();
    int n = (int)localzbt2.D();
    int i1 = (int)localzbt2.z();
    float f2 = 0.0F;
    if ((localzbt2.f()) || (localzjf.u()))
    {
      f2 = zbv.a(m, i1, n, localzjf.U()) + 1;
    }
    else
    {
      f2 = zbv.a(m, i1, n, localzjf.U());
      if (f2 == 0.0F) {
        f2 = 1.0F;
      }
      if (localzbt2.u) {
        f2 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f2;
    double d4 = 0.0D;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    Object localObject1 = new ArrayList();
    if ((!localzjf.ao()) && ((paramzbfd.O()) || (paramzbfd.P()))) {
      localObject1 = localzbff.a(i, arrayOfInt);
    } else {
      ((List)localObject1).add(paramzbfd);
    }
    int i4;
    int i7;
    int i9;
    for (int i2 = 0; i2 < ((List)localObject1).size(); i2++)
    {
      zbfd localzbfd1 = (zbfd)((List)localObject1).get(i2);
      i4 = localzbff.a(localzbfd1, i, arrayOfInt);
      int i5 = localzbfd1.ak();
      if ((!localzjf.ao()) || (localzbfd1.equals(paramzbfd)))
      {
        ArrayList localArrayList5 = new ArrayList();
        ArrayList localArrayList6 = new ArrayList();
        ArrayList localArrayList7 = new ArrayList();
        for (i7 = 0; i7 < k; i7++)
        {
          zkf localzkf1 = localzbfd1.F().b(i7);
          if (localzkf1 != null)
          {
            int i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i7)));
            i8 = zbv.a(m, i8, localzjf.U());
            i9 = zbv.a(m, i8, n, localzjf.U());
            double d5 = d3 * i9;
            d4 = d3 * zbv.a(m, zbv.a(localzbt2.j(), localzbt2.y(), (int)localzbt2.x(), i8, localzjf.U()), i8, localzjf.U());
            if ((localzbt2.f()) || (localzjf.u())) {
              d5 += (float)(d3 / 2.0D);
            }
            double d6 = 0.0D;
            if (localzbt2.p()) {
              d6 = paramzp.c() + paramzp.e() - d5;
            } else {
              d6 = paramzp.c() + d5;
            }
            double d7 = paramFloat;
            double d8 = localzkf1.w();
            double d9 = (d8 - paramDouble) / (d1 - d2) * paramzp.f();
            zuc localzuc = paramzbfd.x();
            com.aspose.cells.b.a.b.zo localzo2;
            if ((localzuc != null) && (localzbfd1.equals(paramzbfd)) && (localzuc.d() != 2) && (!localzkf1.e()) && (!localzkf1.a()))
            {
              localzo2 = new com.aspose.cells.b.a.b.zo((float)d6, paramFloat);
              double d10 = 0.0D;
              double d11 = 0.0D;
              float f8 = 0.0F;
              float f9 = 0.0F;
              switch (localzuc.g())
              {
              case 1: 
                d10 = localzuc.c();
                d11 = d10;
                break;
              case 2: 
                d10 = localzuc.c() * d8 / 100.0D;
                d11 = -d10;
                break;
              case 0: 
                double d12 = localzuc.e().size() > i7 ? localzuc.a(localzuc.e().get(i7)) : 0.0D;
                d10 = d12;
                d12 = localzuc.f().size() > i7 ? localzuc.a(localzuc.f().get(i7)) : 0.0D;
                d11 = d12;
                break;
              case 4: 
                d10 = localzuc.a(paramzbfd.F(), k);
                d11 = d10;
              }
              f8 = (float)d10 / (float)(d1 - d2) * paramzp.f();
              f9 = (float)d11 / (float)(d1 - d2) * paramzp.f();
              if (!localzbt1.p()) {
                localzo2.b(localzo2.e() - (float)d9);
              } else {
                localzo2.b(localzo2.e() + (float)d9);
              }
              localzuc.a(localzo2, f8, f9);
            }
            if (!paramBoolean)
            {
              if (!localzbt1.p()) {
                d7 -= d9;
              } else {
                d7 += d9;
              }
              localzo2 = new com.aspose.cells.b.a.b.zo((float)d6, (float)d7);
              if (localzkf1.a()) {
                com.aspose.cells.b.a.a.zf.a(localArrayList7, Integer.valueOf(i7));
              }
              zkn.a(localzo2, localArrayList5, localArrayList6, i7, localzbt2.p());
              if (localzbfd1.equals(paramzbfd))
              {
                if (!localzkf1.a()) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo2);
                } else {
                  com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
                }
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i5);
                arrayOfObject[1] = Integer.valueOf(i7);
                arrayOfObject[2] = localzo2;
                arrayOfObject[3] = localzbt2;
                if ((!localzkf1.a()) && (a(localzkf1, d1, d2))) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
                }
              }
            }
          }
          else
          {
            if (localzbt2.p())
            {
              localArrayList5.add(0, null);
              localArrayList6.add(0, Integer.valueOf(i7));
            }
            else
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList5, null);
              com.aspose.cells.b.a.a.zf.a(localArrayList6, Integer.valueOf(i7));
            }
            if (localzbfd1.equals(paramzbfd)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            }
          }
        }
        zkn.a(localArrayList5, localArrayList6, localArrayList7);
        if (localzbfd1.equals(paramzbfd)) {
          a(paramzr, paramzbfd, localArrayList5, localArrayList6, paramzp);
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList5);
      }
    }
    if (paramBoolean) {
      return null;
    }
    if (!localzjf.ao()) {
      zbzu.a(paramzr, paramzbfd, localArrayList4, paramzp);
    }
    if ((!localzjf.ao()) && ((paramzbfd.O()) || (paramzbfd.N()) || (paramzbfd.P()))) {
      for (i2 = 0; i2 < k; i2++)
      {
        int i3 = 0;
        i4 = 0;
        float f3 = 0.0F;
        float f4 = 0.0F;
        float f5 = 0.0F;
        int i6 = 0;
        i7 = 0;
        float f6 = 0.0F;
        float f7 = 0.0F;
        Object localObject2;
        for (i9 = 0; i9 < localArrayList3.size(); i9++)
        {
          localObject2 = (ArrayList)localArrayList3.get(i9);
          zbfd localzbfd2 = (zbfd)((List)localObject1).get(i9);
          zkf localzkf2 = localzbfd2.F().b(i2);
          if (((localzkf2 == null) || ((!localzkf2.d()) && (!localzkf2.z()))) && (((ArrayList)localObject2).size() > i2) && (((ArrayList)localObject2).get(i2) != null))
          {
            com.aspose.cells.b.a.b.zo localzo1 = (com.aspose.cells.b.a.b.zo)((ArrayList)localObject2).get(i2);
            f5 = localzo1.d();
            if (i3 == 0)
            {
              f3 = localzo1.e();
              f4 = localzo1.e();
              i3 = 1;
            }
            else if (i4 == 0)
            {
              if (f3 < localzo1.e())
              {
                f4 = f3;
                f3 = localzo1.e();
                i4 = 1;
              }
              else
              {
                f4 = localzo1.e();
                i4 = 1;
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
            if (i9 == 0)
            {
              f6 = localzo1.e();
              i6 = 1;
            }
            else if (i9 == localArrayList3.size() - 1)
            {
              f7 = localzo1.e();
              i7 = 1;
            }
          }
        }
        if (paramzbfd.equals(((List)localObject1).get(((List)localObject1).size() - 1))) {
          if ((paramzbfd.O()) && (i3 != 0) && (i4 != 0)) {
            localzanr2.a(f5, f3, f5, f4);
          } else if ((bool) && (i3 != 0)) {
            localzanr1.a(f5, f4, f5, paramFloat);
          }
        }
        if ((paramzbfd.P()) && (i6 != 0) && (i7 != 0))
        {
          i9 = (int)(d4 / (1.0F + f1));
          localObject2 = new zq();
          if (f6 <= f7)
          {
            ((zq)localObject2).c(i9);
            ((zq)localObject2).d(f7 - f6);
            ((zq)localObject2).a(f5 - ((zq)localObject2).h() / 2.0F);
            ((zq)localObject2).b(f6);
            a(paramzr, localzjy2, (zq)localObject2);
          }
          else
          {
            ((zq)localObject2).c(i9);
            ((zq)localObject2).d(f6 - f7);
            ((zq)localObject2).a(f5 - ((zq)localObject2).h() / 2.0F);
            ((zq)localObject2).b(f7);
            a(paramzr, localzjy1, (zq)localObject2);
          }
        }
      }
    }
    return localArrayList2;
  }
  
  static ArrayList a(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int i = 15;
    zbff localzbff = localzjf.z();
    int j = localzbff.getCount();
    int m = paramzbfd.ah();
    zbt localzbt2;
    zbt localzbt1;
    int k;
    if (m == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
      k = localzbff.b(1, i);
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
      k = localzbff.b(2, i);
    }
    if (localzbt2.k() == 2) {
      return b(paramzr, paramzbfd, paramzp);
    }
    float f1 = 0.0F;
    if (!localzbt1.p()) {
      f1 = paramzp.d() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    }
    float f2 = paramzbfd.M() / 100.0F;
    float f3 = paramzbfd.L() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    float f4 = 0.0F;
    int n = paramInt;
    if (localzbt2.p) {
      n = (int)localzbt2.z();
    }
    if ((localzbt2.f()) || (localzjf.u()))
    {
      f4 = n;
    }
    else
    {
      f4 = n - 1;
      if (f4 == 0.0F) {
        f4 = 1.0F;
      }
      if (localzbt2.u) {
        f4 += 0.5F;
      }
    }
    double d1 = paramzp.e() / f4;
    float f5 = 0.0F;
    List localList = localzbff.a(m, new int[] { i });
    int i1 = localzbff.a(paramzbfd, m, new int[] { i });
    if (i1 == -1) {
      return localArrayList1;
    }
    int i2 = paramzbfd.ak();
    zkh localzkh = paramzbfd.F();
    int i3 = 0;
    double d2 = localzkh.e();
    double d3 = d2 / (localzbt1.z() - localzbt1.D()) * paramzp.f();
    if ((d3 < 1.0D) && (localList.size() == 1)) {
      i3 = 1;
    }
    ArrayList localArrayList2 = new ArrayList();
    for (int i4 = 0; i4 < localzkh.getCount(); i4++)
    {
      zkf localzkf1 = localzkh.b(i4);
      float f6 = (float)d1 / (k - f2 * (k - 1) + f3);
      float f7 = f6 * f2;
      float f8 = f6 * f3;
      f5 += i1 * (f6 - f7);
      float f9 = (float)d1 * i4 + f8 / 2.0F + f5;
      if ((!localzbt2.f()) && (!localzjf.u())) {
        f9 -= (float)(d1 / 2.0D);
      }
      if (localzbt2.p()) {
        f9 = paramzp.c() + paramzp.e() - f9 - f6;
      } else {
        f9 = paramzp.c() + f9;
      }
      ArrayList localArrayList3 = new ArrayList();
      if (localzkf1 != null)
      {
        double d4 = localzkf1.w();
        double d5 = d4;
        int i5;
        zkf localzkf2;
        double d6;
        if (d4 >= 0.0D) {
          for (i5 = 0; i5 < i1; i5++)
          {
            localzkf2 = ((zbfd)localList.get(i5)).F().b(i4);
            if (localzkf2 != null)
            {
              d6 = localzkf2.w();
              if (d6 > 0.0D) {
                d5 += d6;
              }
            }
          }
        } else {
          for (i5 = 0; i5 < i1; i5++)
          {
            localzkf2 = ((zbfd)localList.get(i5)).F().b(i4);
            if (localzkf2 != null)
            {
              d6 = localzkf2.w();
              if (d6 <= 0.0D) {
                d5 += d6;
              }
            }
          }
        }
        float f10 = (float)(Math.abs(d4) / (localzbt1.z() - localzbt1.D()) * paramzp.f());
        float f11 = (float)(Math.abs(d5) / (localzbt1.z() - localzbt1.D()) * paramzp.f());
        boolean bool1 = false;
        if (f10 == 0.0F) {
          bool1 = true;
        }
        zuc localzuc = paramzbfd.x();
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf1.e()))
        {
          localObject = new com.aspose.cells.b.a.b.zo(f9 + f6 / 2.0F, f1);
          double d7 = 0.0D;
          double d8 = 0.0D;
          float f13 = 0.0F;
          float f14 = 0.0F;
          if (localzuc != null)
          {
            switch (localzuc.g())
            {
            case 1: 
              d7 = localzuc.c();
              d8 = d7;
              break;
            case 2: 
              d7 = localzuc.c() * d4 / 100.0D;
              d8 = -d7;
              break;
            case 0: 
              double d9 = localzuc.e().size() > i4 ? localzuc.a(localzuc.e().get(i4)) : 0.0D;
              d7 = d9;
              d9 = localzuc.f().size() > i4 ? localzuc.a(localzuc.f().get(i4)) : 0.0D;
              d8 = d9;
              break;
            case 4: 
              d7 = localzuc.a(paramzbfd.F(), localzkh.getCount());
              d8 = d7;
            }
            f13 = (float)d7 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
            f14 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
            if (!localzbt1.p())
            {
              if (d4 <= 0.0D) {
                ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() + f11);
              } else {
                ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() - f11);
              }
            }
            else if (d4 <= 0.0D) {
              ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() - f11);
            } else {
              ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() + f11);
            }
          }
          localzuc.a((com.aspose.cells.b.a.b.zo)localObject, f13, f14);
        }
        if (!localzbt1.p())
        {
          if (d4 < 0.0D) {
            f11 = f1 + f11 - f10;
          } else {
            f11 = f1 - f11;
          }
        }
        else if (d4 < 0.0D) {
          f11 = f1 - f11;
        } else {
          f11 = f1 + f11 - f10;
        }
        Object localObject = new zq(f9, f11, f6, f10);
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
          if (((zq)localObject).h() + 1.0F >= (f6 - 1.0F) / 3.0F)
          {
            Object[] arrayOfObject = new Object[5];
            boolean bool2;
            if (((zq)localObject).g() + ((zq)localObject).i() / 2.0F < f1) {
              bool2 = true;
            } else if (d4 != 0.0D) {
              bool2 = false;
            } else if (localzbt1.p()) {
              bool2 = false;
            } else {
              bool2 = true;
            }
            if (!bool1)
            {
              if (i3 != 0)
              {
                float f12 = 0.5F;
                if (bool2)
                {
                  ((zq)localObject).b(((zq)localObject).g() - f12);
                  ((zq)localObject).d(((zq)localObject).i() + f12);
                }
                else
                {
                  ((zq)localObject).d(((zq)localObject).i() + f12);
                }
              }
              a(paramzr, localzkf1, (zq)localObject, f1, localzbt1, paramzp);
            }
            arrayOfObject[0] = Integer.valueOf(i2);
            arrayOfObject[1] = Integer.valueOf(i4);
            arrayOfObject[2] = localObject;
            arrayOfObject[3] = localzbt2;
            arrayOfObject[4] = Boolean.valueOf(bool2);
            if ((!localzkf1.a()) && (a(localzq, paramzp, localzkf1.o(), bool1))) {
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
            }
            if ((paramzbfd.Z()) && (!localzkf1.a()))
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, localObject);
              com.aspose.cells.b.a.a.zf.a(localArrayList3, Boolean.valueOf(bool2));
            }
          }
        }
      }
      ArrayList[] arrayOfArrayList = { localArrayList2 };
      a(paramzr, paramzbfd, arrayOfArrayList, localArrayList3);
      localArrayList2 = arrayOfArrayList[0];
    }
    return localArrayList1;
  }
  
  private static ArrayList b(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int i = paramzbfd.ah();
    int j = 15;
    int k = localzjf.z().getCount();
    zbff localzbff = localzjf.z();
    float f1 = paramzbfd.M() / 100.0F;
    float f2 = paramzbfd.L() / 100.0F;
    zbt localzbt1;
    zbt localzbt2;
    int m;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbt1 = localzjf.e();
      localzbt2 = localzjf.G();
      m = localzbff.b(1, j);
      localArrayList1 = ziz.a(localzjf.z().c(), localzjf.U());
    }
    else
    {
      localzbt1 = localzjf.g();
      localzbt2 = localzjf.I();
      m = localzbff.b(2, j);
      localArrayList1 = ziz.a(localzjf.z().d(), localzjf.U());
    }
    float f3 = 0.0F;
    if (!localzbt2.p()) {
      f3 = paramzp.d() + (float)localzbt2.z() / (float)(localzbt2.z() - localzbt2.D()) * paramzp.f();
    } else {
      f3 = paramzp.j() - (float)localzbt2.z() / (float)(localzbt2.z() - localzbt2.D()) * paramzp.f();
    }
    double d1 = localzbt2.D();
    double d2 = localzbt2.z();
    ArrayList localArrayList2 = new ArrayList();
    int n = localArrayList1.size();
    int i1 = localzbt1.j();
    int i2 = (int)localzbt1.D();
    int i3 = (int)localzbt1.z();
    float f4 = 0.0F;
    if ((localzbt1.f()) || (localzjf.u()))
    {
      f4 = zbv.a(i1, i3, i2, localzjf.U()) + 1;
    }
    else
    {
      f4 = zbv.a(i1, i3, i2, localzjf.U());
      if (f4 == 0.0F) {
        f4 = 1.0F;
      }
      if (localzbt1.u) {
        f4 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f4;
    ArrayList localArrayList3 = new ArrayList();
    for (int i4 = 0; i4 < n; i4++)
    {
      zkf localzkf1 = paramzbfd.F().b(i4);
      float f5 = (float)(d3 / (m - f1 * (m - 1) + f2));
      float f6 = f5 * f1;
      float f7 = f5 * f2;
      int i5 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i4)));
      i5 = zbv.a(i1, i5, localzjf.U());
      int i6 = zbv.a(i1, i5, i2, localzjf.U());
      float f8 = (float)(d3 * i6);
      if ((!localzbt1.f()) && (!localzjf.u())) {
        f8 -= (float)(d3 / 2.0D);
      }
      float f9 = 0.0F;
      if (localzbt1.p()) {
        f9 = paramzp.c() + paramzp.e() - f8 - f7 / 2.0F - f5 - 1.0F;
      } else {
        f9 = paramzp.c() + f8 + f7 / 2.0F + 1.0F;
      }
      List localList = localzbff.a(i, new int[] { j });
      int i7 = localzbff.a(paramzbfd, i, new int[] { j });
      if (i7 == -1) {
        return localArrayList2;
      }
      int i8 = paramzbfd.ak();
      if (localzbt1.p()) {
        f9 -= i7 * (f5 - f6);
      } else {
        f9 += i7 * (f5 - f6);
      }
      ArrayList localArrayList4 = new ArrayList();
      if (localzkf1 != null)
      {
        double d4 = localzkf1.w();
        double d5 = d4;
        int i9;
        zkf localzkf2;
        double d6;
        if (d4 >= 0.0D) {
          for (i9 = 0; i9 < i7; i9++)
          {
            localzkf2 = ((zbfd)localList.get(i9)).F().b(i4);
            if (localzkf2 != null)
            {
              d6 = localzkf2.w();
              if (d6 > 0.0D) {
                d5 += d6;
              }
            }
          }
        } else {
          for (i9 = 0; i9 < i7; i9++)
          {
            localzkf2 = ((zbfd)localList.get(i9)).F().b(i4);
            if (localzkf2 != null)
            {
              d6 = localzkf2.w();
              if (d6 <= 0.0D) {
                d5 += d6;
              }
            }
          }
        }
        float f10 = (float)(Math.abs(d4) / (localzbt2.z() - localzbt2.D()) * paramzp.f());
        float f11 = (float)(Math.abs(d5) / (localzbt2.z() - localzbt2.D()) * paramzp.f());
        boolean bool1 = false;
        if (f10 == 0.0F) {
          bool1 = true;
        }
        zuc localzuc = paramzbfd.x();
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf1.e()))
        {
          localObject = new com.aspose.cells.b.a.b.zo(f9 + f5 / 2.0F, f3);
          double d7 = 0.0D;
          double d8 = 0.0D;
          float f12 = 0.0F;
          float f13 = 0.0F;
          if (localzuc != null)
          {
            switch (localzuc.g())
            {
            case 1: 
              d7 = localzuc.c();
              d8 = d7;
              break;
            case 2: 
              d7 = localzuc.c() * d4 / 100.0D;
              d8 = -d7;
              break;
            case 0: 
              double d9 = localzuc.e().size() > i4 ? localzuc.a(localzuc.e().get(i4)) : 0.0D;
              d7 = d9;
              d9 = localzuc.f().size() > i4 ? localzuc.a(localzuc.f().get(i4)) : 0.0D;
              d8 = d9;
              break;
            case 4: 
              d7 = localzuc.a(paramzbfd.F(), n);
              d8 = d7;
            }
            f12 = (float)d7 / (float)(localzbt2.z() - localzbt2.D()) * paramzp.f();
            f13 = (float)d8 / (float)(localzbt2.z() - localzbt2.D()) * paramzp.f();
            if (!localzbt2.p())
            {
              if (d4 <= 0.0D) {
                ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() + f11);
              } else {
                ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() - f11);
              }
            }
            else if (d4 <= 0.0D) {
              ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() - f11);
            } else {
              ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() + f11);
            }
          }
          localzuc.a((com.aspose.cells.b.a.b.zo)localObject, f12, f13);
        }
        if (!localzbt2.p())
        {
          if (d4 < 0.0D) {
            f11 = f3 + f11 - f10;
          } else {
            f11 = f3 - f11;
          }
        }
        else if (d4 < 0.0D) {
          f11 = f3 - f11;
        } else {
          f11 = f3 + f11 - f10;
        }
        Object localObject = new zq(f9, f11, f5, f10);
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
          if (((zq)localObject).h() + 1.0F >= (f5 - 1.0F) / 3.0F)
          {
            if (!bool1) {
              a(paramzr, localzkf1, (zq)localObject, f3, localzbt2, paramzp);
            }
            Object[] arrayOfObject = new Object[5];
            boolean bool2;
            if (((zq)localObject).g() + ((zq)localObject).i() / 2.0F < f3) {
              bool2 = true;
            } else if (d4 != 0.0D) {
              bool2 = false;
            } else if (localzbt2.p()) {
              bool2 = false;
            } else {
              bool2 = true;
            }
            arrayOfObject[0] = Integer.valueOf(i8);
            arrayOfObject[1] = Integer.valueOf(i4);
            arrayOfObject[2] = localObject;
            arrayOfObject[3] = localzbt1;
            arrayOfObject[4] = Boolean.valueOf(bool2);
            if ((!localzkf1.a()) && (a(localzq, paramzp, localzkf1.o(), bool1))) {
              com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
            }
            if (paramzbfd.Z())
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, localObject);
              com.aspose.cells.b.a.a.zf.a(localArrayList4, Boolean.valueOf(bool2));
            }
          }
        }
      }
      ArrayList[] arrayOfArrayList = { localArrayList3 };
      a(paramzr, paramzbfd, arrayOfArrayList, localArrayList4);
      localArrayList3 = arrayOfArrayList[0];
    }
    return localArrayList2;
  }
  
  static ArrayList a(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt, boolean paramBoolean)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 38;
    arrayOfInt[1] = 41;
    int i = paramzbfd.ah();
    zbt localzbt2;
    zbt localzbt1;
    if (i == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
    }
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzbfd, paramzp, paramFloat, paramBoolean);
    }
    float f1 = 0.0F;
    if (!localzbt1.p()) {
      f1 = paramzp.d() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    }
    zbff localzbff = localzjf.z();
    int j = localzbff.getCount();
    float f2 = paramzbfd.L() / 100.0F;
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    boolean bool = paramzbfd.N();
    zanr localzanr1 = paramzbfd.Q();
    zanr localzanr2 = paramzbfd.R();
    zjy localzjy1 = paramzbfd.U();
    zjy localzjy2 = paramzbfd.V();
    ArrayList localArrayList1 = new ArrayList();
    float f3 = 0.0F;
    int k = paramInt;
    if (localzbt2.p) {
      k = (int)localzbt2.z();
    }
    if ((localzbt2.f()) || (localzjf.u()))
    {
      f3 = k;
    }
    else
    {
      f3 = k - 1;
      if (f3 == 0.0F) {
        f3 = 1.0F;
      }
      if (localzbt2.u) {
        f3 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f3;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    List localList = localzbff.a(i, arrayOfInt);
    int i1;
    int i4;
    for (int m = 0; m < localList.size(); m++)
    {
      zbfd localzbfd1 = (zbfd)localList.get(m);
      i1 = localzbff.a(localzbfd1, i, arrayOfInt);
      int i2 = localzbfd1.ak();
      if ((!localzjf.ao()) || (localzbfd1.equals(paramzbfd)))
      {
        ArrayList localArrayList4 = new ArrayList();
        ArrayList localArrayList5 = new ArrayList();
        zkh localzkh = localzbfd1.F();
        for (i4 = 0; i4 < paramInt; i4++)
        {
          zkf localzkf1 = localzkh.b(i4);
          if ((localzkf1 != null) && (!localzkf1.a()))
          {
            double d4 = (float)d3 * i4;
            if ((localzbt2.f()) || (localzjf.u())) {
              d4 += (float)(d3 / 2.0D);
            }
            if (localzbt2.p()) {
              d4 = paramzp.c() + paramzp.e() - d4;
            } else {
              d4 = paramzp.c() + d4;
            }
            double d5 = localzkf1.w();
            double d6 = d5;
            int i6;
            double d7;
            if (d5 >= 0.0D) {
              for (i6 = 0; i6 < i1; i6++)
              {
                localObject2 = ((zbfd)localList.get(i6)).F().b(i4);
                if (localObject2 != null)
                {
                  d7 = ((zkf)localObject2).w();
                  d6 += d7;
                }
              }
            } else {
              for (i6 = 0; i6 < i1; i6++)
              {
                localObject2 = ((zbfd)localList.get(i6)).F().b(i4);
                if (localObject2 != null)
                {
                  d7 = ((zkf)localObject2).w();
                  d6 += d7;
                }
              }
            }
            float f9 = (float)(Math.abs(d6) / (localzbt1.z() - localzbt1.D()) * paramzp.f());
            Object localObject2 = paramzbfd.x();
            com.aspose.cells.b.a.b.zo localzo2;
            if ((localObject2 != null) && (((zuc)localObject2).d() != 2) && (localzbfd1.equals(paramzbfd)) && (!localzkf1.e()))
            {
              localzo2 = new com.aspose.cells.b.a.b.zo((float)d4, f1);
              double d8 = 0.0D;
              double d9 = 0.0D;
              float f10 = 0.0F;
              float f11 = 0.0F;
              if (localObject2 != null)
              {
                switch (((zuc)localObject2).g())
                {
                case 1: 
                  d8 = ((zuc)localObject2).c();
                  d9 = d8;
                  break;
                case 2: 
                  d8 = ((zuc)localObject2).c() * d5 / 100.0D;
                  d9 = -d8;
                  break;
                case 0: 
                  double d10 = ((zuc)localObject2).e().size() > i4 ? ((zuc)localObject2).a(((zuc)localObject2).e().get(i4)) : 0.0D;
                  d8 = d10;
                  d10 = ((zuc)localObject2).f().size() > i4 ? ((zuc)localObject2).a(((zuc)localObject2).f().get(i4)) : 0.0D;
                  d9 = d10;
                  break;
                case 4: 
                  d8 = ((zuc)localObject2).a(paramzbfd.F(), paramInt);
                  d9 = d8;
                }
                f10 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
                f11 = (float)d9 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
                if (!localzbt1.p())
                {
                  if (d6 < 0.0D) {
                    localzo2.b(localzo2.e() + f9);
                  } else {
                    localzo2.b(localzo2.e() - f9);
                  }
                }
                else if (d6 < 0.0D) {
                  localzo2.b(localzo2.e() - f9);
                } else {
                  localzo2.b(localzo2.e() + f9);
                }
              }
              if (localzbfd1.equals(paramzbfd)) {
                ((zuc)localObject2).a(localzo2, f10, f11);
              }
            }
            if (!paramBoolean)
            {
              if (!localzbt1.p())
              {
                if (d6 < 0.0D) {
                  f9 = f1 + f9;
                } else {
                  f9 = f1 - f9;
                }
              }
              else if (d6 < 0.0D) {
                f9 = f1 - f9;
              } else {
                f9 = f1 + f9;
              }
              localzo2 = new com.aspose.cells.b.a.b.zo((float)d4, f9);
              com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo2);
              com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i4));
              if (localzbfd1.equals(paramzbfd))
              {
                com.aspose.cells.b.a.a.zf.a(localArrayList3, localzo2);
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i2);
                arrayOfObject[1] = Integer.valueOf(i4);
                arrayOfObject[2] = localzo2;
                arrayOfObject[3] = localzbt2;
                if (a(localzkf1, d2, d1)) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
                }
              }
            }
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i4));
            if (localzbfd1.equals(paramzbfd)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, null);
            }
          }
        }
        if (localzbfd1.equals(paramzbfd)) {
          a(paramzr, paramzbfd, localArrayList4, localArrayList5, paramzp);
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList4);
      }
    }
    if (paramBoolean) {
      return null;
    }
    if (!localzjf.ao()) {
      zbzu.a(paramzr, paramzbfd, localArrayList3, paramzp);
    }
    if ((!localzjf.ao()) && ((paramzbfd.O()) || (paramzbfd.N()) || (paramzbfd.P()))) {
      for (m = 0; m < paramInt; m++)
      {
        int n = 0;
        i1 = 0;
        float f4 = 0.0F;
        float f5 = 0.0F;
        float f6 = 0.0F;
        int i3 = 0;
        i4 = 0;
        float f7 = 0.0F;
        float f8 = 0.0F;
        Object localObject1;
        for (int i5 = 0; i5 < localArrayList2.size(); i5++)
        {
          localObject1 = (ArrayList)localArrayList2.get(i5);
          zbfd localzbfd2 = (zbfd)localList.get(i5);
          zkf localzkf2 = localzbfd2.F().b(m);
          if (((localzkf2 == null) || ((!localzkf2.d()) && (!localzkf2.z()))) && (((ArrayList)localObject1).size() > m) && (((ArrayList)localObject1).get(m) != null))
          {
            com.aspose.cells.b.a.b.zo localzo1 = (com.aspose.cells.b.a.b.zo)((ArrayList)localObject1).get(m);
            f6 = localzo1.d();
            if (n == 0)
            {
              f4 = localzo1.e();
              f5 = localzo1.e();
              n = 1;
            }
            else if (i1 == 0)
            {
              if (f4 < localzo1.e())
              {
                f5 = f4;
                f4 = localzo1.e();
                i1 = 1;
              }
              else
              {
                f5 = localzo1.e();
                i1 = 1;
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
            if (i5 == 0)
            {
              f7 = localzo1.e();
              i3 = 1;
            }
            else if (i5 == localArrayList2.size() - 1)
            {
              f8 = localzo1.e();
              i4 = 1;
            }
          }
        }
        if (paramzbfd.equals(localList.get(localList.size() - 1))) {
          if ((paramzbfd.O()) && (n != 0) && (i1 != 0)) {
            localzanr2.a(f6, f4, f6, f5);
          } else if ((bool) && (n != 0)) {
            localzanr1.a(f6, f5, f6, paramFloat);
          }
        }
        if ((paramzbfd.P()) && (i3 != 0) && (i4 != 0))
        {
          i5 = (int)(d3 / (1.0F + f2));
          localObject1 = new zq();
          if (f7 <= f8)
          {
            ((zq)localObject1).c(i5);
            ((zq)localObject1).d(f8 - f7);
            ((zq)localObject1).a(f6 - ((zq)localObject1).h() / 2.0F);
            ((zq)localObject1).b(f7);
            a(paramzr, localzjy2, (zq)localObject1);
          }
          else
          {
            ((zq)localObject1).c(i5);
            ((zq)localObject1).d(f7 - f8);
            ((zq)localObject1).a(f6 - ((zq)localObject1).h() / 2.0F);
            ((zq)localObject1).b(f8);
            a(paramzr, localzjy1, (zq)localObject1);
          }
        }
      }
    }
    return localArrayList1;
  }
  
  private static ArrayList a(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, boolean paramBoolean)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 38;
    arrayOfInt[1] = 41;
    int i = paramzbfd.ah();
    zbff localzbff = localzjf.z();
    int j = localzbff.getCount();
    float f1 = paramzbfd.L() / 100.0F;
    zbt localzbt2;
    zbt localzbt1;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
      localArrayList1 = ziz.a(localzjf.z().c(), localzjf.U());
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
      localArrayList1 = ziz.a(localzjf.z().d(), localzjf.U());
    }
    float f2 = 0.0F;
    if (!localzbt1.p()) {
      f2 = paramzp.d() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    } else {
      f2 = paramzp.j() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    }
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    boolean bool = paramzbfd.N();
    zanr localzanr1 = paramzbfd.Q();
    zanr localzanr2 = paramzbfd.R();
    zjy localzjy1 = paramzbfd.U();
    zjy localzjy2 = paramzbfd.V();
    int k = localArrayList1.size();
    int m = localzbt2.j();
    int n = (int)localzbt2.D();
    int i1 = (int)localzbt2.z();
    float f3 = 0.0F;
    if ((localzbt2.f()) || (localzjf.u()))
    {
      f3 = zbv.a(m, i1, n, localzjf.U()) + 1;
    }
    else
    {
      f3 = zbv.a(m, i1, n, localzjf.U());
      if (f3 == 0.0F) {
        f3 = 1.0F;
      }
      if (localzbt2.u) {
        f3 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f3;
    float f4 = 0.0F;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    List localList = localzbff.a(i, arrayOfInt);
    int i4;
    int i7;
    int i9;
    for (int i2 = 0; i2 < localList.size(); i2++)
    {
      zbfd localzbfd1 = (zbfd)localList.get(i2);
      if ((!localzjf.ao()) || (localzbfd1.equals(paramzbfd)))
      {
        i4 = localzbff.a(localzbfd1, i, arrayOfInt);
        int i5 = localzbfd1.ak();
        ArrayList localArrayList5 = new ArrayList();
        ArrayList localArrayList6 = new ArrayList();
        ArrayList localArrayList7 = new ArrayList();
        for (i7 = 0; i7 < k; i7++)
        {
          zkf localzkf1 = localzbfd1.F().b(i7);
          if (localzkf1 != null)
          {
            int i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i7)));
            i8 = zbv.a(m, i8, localzjf.U());
            i9 = zbv.a(m, i8, n, localzjf.U());
            float f10 = (float)(d3 * i9);
            f4 = (float)(d3 * zbv.a(m, zbv.a(localzbt2.j(), localzbt2.y(), (int)localzbt2.x(), i8, localzjf.U()), i8, localzjf.U()));
            if ((localzbt2.f()) || (localzjf.u())) {
              f10 += (float)(d3 / 2.0D);
            }
            float f11 = 0.0F;
            if (localzbt2.p()) {
              f11 = paramzp.c() + paramzp.e() - f10;
            } else {
              f11 = paramzp.c() + f10;
            }
            double d4 = localzkf1.w();
            double d5 = d4;
            int i10;
            double d6;
            if (d4 >= 0.0D) {
              for (i10 = 0; i10 < i4; i10++)
              {
                localObject2 = ((zbfd)localList.get(i10)).F().b(i7);
                if (localObject2 != null)
                {
                  d6 = ((zkf)localObject2).w();
                  d5 += d6;
                }
              }
            } else {
              for (i10 = 0; i10 < i4; i10++)
              {
                localObject2 = ((zbfd)localList.get(i10)).F().b(i7);
                if (localObject2 != null)
                {
                  d6 = ((zkf)localObject2).w();
                  d5 += d6;
                }
              }
            }
            float f12 = (float)(Math.abs(d5) / (localzbt1.z() - localzbt1.D()) * paramzp.f());
            Object localObject2 = paramzbfd.x();
            com.aspose.cells.b.a.b.zo localzo2;
            if ((localObject2 != null) && (((zuc)localObject2).d() != 2) && (localzbfd1.equals(paramzbfd)) && (!localzkf1.e()) && (!localzkf1.a()))
            {
              localzo2 = new com.aspose.cells.b.a.b.zo(f11, f2);
              double d7 = 0.0D;
              double d8 = 0.0D;
              float f13 = 0.0F;
              float f14 = 0.0F;
              if (localObject2 != null)
              {
                switch (((zuc)localObject2).g())
                {
                case 1: 
                  d7 = ((zuc)localObject2).c();
                  d8 = d7;
                  break;
                case 2: 
                  d7 = ((zuc)localObject2).c() * d4 / 100.0D;
                  d8 = -d7;
                  break;
                case 0: 
                  double d9 = ((zuc)localObject2).e().size() > i7 ? ((zuc)localObject2).a(((zuc)localObject2).e().get(i7)) : 0.0D;
                  d7 = d9;
                  d9 = ((zuc)localObject2).f().size() > i7 ? ((zuc)localObject2).a(((zuc)localObject2).f().get(i7)) : 0.0D;
                  d8 = d9;
                  break;
                case 4: 
                  d7 = ((zuc)localObject2).a(paramzbfd.F(), k);
                  d8 = d7;
                }
                f13 = (float)d7 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
                f14 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
                if (!localzbt1.p())
                {
                  if (d5 < 0.0D) {
                    localzo2.b(localzo2.e() + f12);
                  } else {
                    localzo2.b(localzo2.e() - f12);
                  }
                }
                else if (d5 < 0.0D) {
                  localzo2.b(localzo2.e() - f12);
                } else {
                  localzo2.b(localzo2.e() + f12);
                }
              }
              if (localzbfd1.equals(paramzbfd)) {
                ((zuc)localObject2).a(localzo2, f13, f14);
              }
            }
            if (!paramBoolean)
            {
              if (!localzbt1.p())
              {
                if (d5 < 0.0D) {
                  f12 = f2 + f12;
                } else {
                  f12 = f2 - f12;
                }
              }
              else if (d5 < 0.0D) {
                f12 = f2 - f12;
              } else {
                f12 = f2 + f12;
              }
              localzo2 = new com.aspose.cells.b.a.b.zo(f11, f12);
              if (localzkf1.a()) {
                com.aspose.cells.b.a.a.zf.a(localArrayList7, Integer.valueOf(i7));
              }
              zkn.a(localzo2, localArrayList5, localArrayList6, i7, localzbt2.p());
              if ((localzbfd1.equals(paramzbfd)) && (!localzkf1.a()))
              {
                com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo2);
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i5);
                arrayOfObject[1] = Integer.valueOf(i7);
                arrayOfObject[2] = localzo2;
                arrayOfObject[3] = localzbt2;
                if (a(localzkf1, d2, d1)) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
                }
              }
            }
          }
          else
          {
            if (localzbt2.p())
            {
              localArrayList5.add(0, null);
              localArrayList6.add(0, Integer.valueOf(i7));
            }
            else
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList5, null);
              com.aspose.cells.b.a.a.zf.a(localArrayList6, Integer.valueOf(i7));
            }
            if (localzbfd1.equals(paramzbfd)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            }
          }
        }
        zkn.a(localArrayList5, localArrayList6, localArrayList7);
        if (localzbfd1.equals(paramzbfd)) {
          a(paramzr, localzbfd1, localArrayList5, localArrayList6, paramzp);
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList5);
      }
    }
    if (paramBoolean) {
      return null;
    }
    if (!localzjf.ao()) {
      zbzu.a(paramzr, paramzbfd, localArrayList4, paramzp);
    }
    if ((!localzjf.ao()) && ((paramzbfd.O()) || (paramzbfd.N()) || (paramzbfd.P()))) {
      for (i2 = 0; i2 < k; i2++)
      {
        int i3 = 0;
        i4 = 0;
        float f5 = 0.0F;
        float f6 = 0.0F;
        float f7 = 0.0F;
        int i6 = 0;
        i7 = 0;
        float f8 = 0.0F;
        float f9 = 0.0F;
        Object localObject1;
        for (i9 = 0; i9 < localArrayList3.size(); i9++)
        {
          localObject1 = (ArrayList)localArrayList3.get(i9);
          zbfd localzbfd2 = (zbfd)localList.get(i9);
          zkf localzkf2 = localzbfd2.F().b(i2);
          if (((localzkf2 == null) || ((!localzkf2.d()) && (!localzkf2.z()))) && (((ArrayList)localObject1).size() > i2) && (((ArrayList)localObject1).get(i2) != null))
          {
            com.aspose.cells.b.a.b.zo localzo1 = (com.aspose.cells.b.a.b.zo)((ArrayList)localObject1).get(i2);
            f7 = localzo1.d();
            if (i3 == 0)
            {
              f5 = localzo1.e();
              f6 = localzo1.e();
              i3 = 1;
            }
            else if (i4 == 0)
            {
              if (f5 < localzo1.e())
              {
                f6 = f5;
                f5 = localzo1.e();
                i4 = 1;
              }
              else
              {
                f6 = localzo1.e();
                i4 = 1;
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
            if (i9 == 0)
            {
              f8 = localzo1.e();
              i6 = 1;
            }
            else if (i9 == localArrayList3.size() - 1)
            {
              f9 = localzo1.e();
              i7 = 1;
            }
          }
        }
        if (paramzbfd.equals(localList.get(localList.size() - 1))) {
          if ((paramzbfd.O()) && (i3 != 0) && (i4 != 0)) {
            localzanr2.a(f7, f5, f7, f6);
          } else if ((bool) && (i3 != 0)) {
            localzanr1.a(f7, f6, f7, paramFloat);
          }
        }
        if ((paramzbfd.P()) && (i6 != 0) && (i7 != 0))
        {
          i9 = (int)(f4 / (1.0F + f1));
          localObject1 = new zq();
          if (f8 <= f9)
          {
            ((zq)localObject1).c(i9);
            ((zq)localObject1).d(f9 - f8);
            ((zq)localObject1).a(f7 - ((zq)localObject1).h() / 2.0F);
            ((zq)localObject1).b(f8);
            a(paramzr, localzjy2, (zq)localObject1);
          }
          else
          {
            ((zq)localObject1).c(i9);
            ((zq)localObject1).d(f8 - f9);
            ((zq)localObject1).a(f7 - ((zq)localObject1).h() / 2.0F);
            ((zq)localObject1).b(f9);
            a(paramzr, localzjy1, (zq)localObject1);
          }
        }
      }
    }
    return localArrayList2;
  }
  
  static ArrayList b(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int i = paramzbfd.ah();
    int j = 16;
    zbff localzbff = localzjf.z();
    int k = localzbff.getCount();
    zbt localzbt2;
    zbt localzbt1;
    int m;
    if (i == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
      m = localzbff.b(1, j);
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
      m = localzbff.b(2, j);
    }
    if (localzbt2.k() == 2) {
      return c(paramzr, paramzbfd, paramzp);
    }
    float f1 = 0.0F;
    if (!localzbt1.p()) {
      f1 = paramzp.d() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    }
    float f2 = paramzbfd.M() / 100.0F;
    float f3 = paramzbfd.L() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    float f4 = 0.0F;
    int n = paramInt;
    if (localzbt2.p) {
      n = (int)localzbt2.z();
    }
    if ((localzbt2.f()) || (localzjf.u()))
    {
      f4 = n;
    }
    else
    {
      f4 = n - 1;
      if (f4 == 0.0F) {
        f4 = 1.0F;
      }
      if (localzbt2.u) {
        f4 += 0.5F;
      }
    }
    double d1 = paramzp.e() / f4;
    float f5 = 0.0F;
    List localList = localzbff.a(i, new int[] { j });
    int i1 = localzbff.a(paramzbfd, i, new int[] { j });
    if (i1 == -1) {
      return localArrayList1;
    }
    int i2 = paramzbfd.ak();
    zkh localzkh = paramzbfd.F();
    ArrayList localArrayList2 = new ArrayList();
    for (int i3 = 0; i3 < localzkh.getCount(); i3++)
    {
      zkf localzkf1 = localzkh.b(i3);
      float f6 = (float)d1 / (m - f2 * (m - 1) + f3);
      float f7 = f6 * f2;
      float f8 = f6 * f3;
      f5 = i1 * (f6 - f7);
      float f9 = (float)d1 * i3 + f8 / 2.0F + f5;
      if ((!localzbt2.f()) && (!localzjf.u())) {
        f9 -= (float)(d1 / 2.0D);
      }
      if (localzbt2.p()) {
        f9 = paramzp.c() + paramzp.e() - f9 - f6;
      } else {
        f9 = paramzp.c() + f9;
      }
      ArrayList localArrayList3 = new ArrayList();
      if (localzkf1 != null)
      {
        double d2 = localzkf1.w();
        double d3 = d2;
        double d4 = 0.0D;
        zkf localzkf2;
        double d5;
        if (d2 >= 0.0D) {
          for (i4 = 0; i4 < i1; i4++)
          {
            localzkf2 = ((zbfd)localList.get(i4)).F().b(i3);
            if (localzkf2 != null)
            {
              d5 = localzkf2.w();
              if (d5 > 0.0D) {
                d3 += d5;
              }
            }
          }
        } else {
          for (i4 = 0; i4 < i1; i4++)
          {
            localzkf2 = ((zbfd)localList.get(i4)).F().b(i3);
            if (localzkf2 != null)
            {
              d5 = localzkf2.w();
              if (d5 <= 0.0D) {
                d3 += d5;
              }
            }
          }
        }
        for (int i4 = 0; i4 < localList.size(); i4++)
        {
          localzkf2 = ((zbfd)localList.get(i4)).F().b(i3);
          if (localzkf2 != null)
          {
            d5 = localzkf2.w();
            d4 += Math.abs(d5);
          }
        }
        if ((d4 == 0.0D) || (d4 == 0.0D)) {
          continue;
        }
        float f10 = (float)(Math.abs(d2) / d4 / (localzbt1.z() - localzbt1.D()) * paramzp.f());
        float f11 = (float)(Math.abs(d3) / d4 / (localzbt1.z() - localzbt1.D()) * paramzp.f());
        boolean bool1 = false;
        if (f10 == 0.0F) {
          bool1 = true;
        }
        zuc localzuc = paramzbfd.x();
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf1.e()))
        {
          localObject = new com.aspose.cells.b.a.b.zo(f9 + f6 / 2.0F, f1);
          double d6 = 0.0D;
          double d7 = 0.0D;
          float f12 = 0.0F;
          float f13 = 0.0F;
          if (localzuc != null)
          {
            switch (localzuc.g())
            {
            case 1: 
              d6 = localzuc.c();
              d7 = d6;
              break;
            case 2: 
              d6 = localzuc.c() * d2 / 100.0D;
              d7 = -d6;
              break;
            case 0: 
              double d8 = localzuc.e().size() > i3 ? localzuc.a(localzuc.e().get(i3)) : 0.0D;
              d6 = d8;
              d8 = localzuc.f().size() > i3 ? localzuc.a(localzuc.f().get(i3)) : 0.0D;
              d7 = d8;
              break;
            case 4: 
              d6 = localzuc.a(paramzbfd.F(), paramInt);
              d7 = d6;
            }
            d7 /= d4;
            d6 /= d4;
            f12 = (float)d6 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
            f13 = (float)d7 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
            if (!localzbt1.p())
            {
              if (d2 <= 0.0D) {
                ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() + f11);
              } else {
                ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() - f11);
              }
            }
            else if (d2 <= 0.0D) {
              ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() - f11);
            } else {
              ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() + f11);
            }
          }
          localzuc.a((com.aspose.cells.b.a.b.zo)localObject, f12, f13);
        }
        if (!localzbt1.p())
        {
          if (d2 < 0.0D) {
            f11 = f1 + f11 - f10;
          } else {
            f11 = f1 - f11;
          }
        }
        else if (d2 < 0.0D) {
          f11 = f1 - f11;
        } else {
          f11 = f1 + f11 - f10;
        }
        Object localObject = new zq(f9, f11, f6, f10);
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
          if (((zq)localObject).h() + 1.0F >= (f6 - 1.0F) / 3.0F)
          {
            if (!bool1) {
              a(paramzr, localzkf1, (zq)localObject, f1, localzbt1, paramzp);
            }
            Object[] arrayOfObject = new Object[5];
            boolean bool2;
            if (((zq)localObject).g() + ((zq)localObject).i() / 2.0F < f1) {
              bool2 = true;
            } else if (d2 != 0.0D) {
              bool2 = false;
            } else if (localzbt1.p()) {
              bool2 = false;
            } else {
              bool2 = true;
            }
            arrayOfObject[0] = Integer.valueOf(i2);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localObject;
            arrayOfObject[3] = localzbt2;
            arrayOfObject[4] = Boolean.valueOf(bool2);
            if ((!localzkf1.a()) && (a(localzq, paramzp, localzkf1.o(), bool1))) {
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
            }
            if (paramzbfd.Z())
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, localObject);
              com.aspose.cells.b.a.a.zf.a(localArrayList3, Boolean.valueOf(bool2));
            }
          }
        }
      }
      ArrayList[] arrayOfArrayList = { localArrayList2 };
      a(paramzr, paramzbfd, arrayOfArrayList, localArrayList3);
      localArrayList2 = arrayOfArrayList[0];
    }
    return localArrayList1;
  }
  
  private static void a(zr paramzr, zbfd paramzbfd, ArrayList[] paramArrayOfArrayList, ArrayList paramArrayList)
  {
    if ((paramArrayOfArrayList[0].size() > 0) && (paramArrayList.size() > 0) && (paramzbfd.Z()))
    {
      zq localzq1 = (zq)paramArrayOfArrayList[0].get(0);
      boolean bool1 = ((Boolean)paramArrayOfArrayList[0].get(1)).booleanValue();
      zq localzq2 = (zq)paramArrayList.get(0);
      boolean bool2 = ((Boolean)paramArrayList.get(1)).booleanValue();
      com.aspose.cells.b.a.b.zo localzo1;
      com.aspose.cells.b.a.b.zo localzo2;
      if (localzq1.f() < localzq2.f())
      {
        if (bool1) {
          localzo1 = new com.aspose.cells.b.a.b.zo(localzq1.l(), localzq1.k());
        } else {
          localzo1 = new com.aspose.cells.b.a.b.zo(localzq1.l(), localzq1.m());
        }
        if (bool2) {
          localzo2 = new com.aspose.cells.b.a.b.zo(localzq2.j(), localzq2.k());
        } else {
          localzo2 = new com.aspose.cells.b.a.b.zo(localzq2.j(), localzq2.m());
        }
      }
      else
      {
        if (bool1) {
          localzo1 = new com.aspose.cells.b.a.b.zo(localzq1.j(), localzq1.k());
        } else {
          localzo1 = new com.aspose.cells.b.a.b.zo(localzq1.j(), localzq1.m());
        }
        if (bool2) {
          localzo2 = new com.aspose.cells.b.a.b.zo(localzq2.l(), localzq2.k());
        } else {
          localzo2 = new com.aspose.cells.b.a.b.zo(localzq2.l(), localzq2.m());
        }
      }
      paramzbfd.aa().a(localzo2, localzo1);
    }
    if (paramArrayList.size() > 0) {
      paramArrayOfArrayList[0] = paramArrayList;
    }
  }
  
  private static ArrayList c(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int i = paramzbfd.ah();
    int j = 16;
    int k = localzjf.z().getCount();
    zbff localzbff = localzjf.z();
    float f1 = paramzbfd.M() / 100.0F;
    float f2 = paramzbfd.L() / 100.0F;
    zbt localzbt1;
    zbt localzbt2;
    int m;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbt1 = localzjf.e();
      localzbt2 = localzjf.G();
      m = localzbff.b(1, j);
      localArrayList1 = ziz.a(localzjf.z().c(), localzjf.U());
    }
    else
    {
      localzbt1 = localzjf.g();
      localzbt2 = localzjf.I();
      m = localzbff.b(2, j);
      localArrayList1 = ziz.a(localzjf.z().d(), localzjf.U());
    }
    float f3 = 0.0F;
    if (!localzbt2.p()) {
      f3 = paramzp.d() + (float)localzbt2.z() / (float)(localzbt2.z() - localzbt2.D()) * paramzp.f();
    } else {
      f3 = paramzp.j() - (float)localzbt2.z() / (float)(localzbt2.z() - localzbt2.D()) * paramzp.f();
    }
    double d1 = localzbt2.D();
    double d2 = localzbt2.z();
    ArrayList localArrayList2 = new ArrayList();
    int n = localArrayList1.size();
    int i1 = localzbt1.j();
    int i2 = (int)localzbt1.D();
    int i3 = (int)localzbt1.z();
    float f4 = 0.0F;
    if ((localzbt1.f()) || (localzjf.u()))
    {
      f4 = zbv.a(i1, i3, i2, localzjf.U()) + 1;
    }
    else
    {
      f4 = zbv.a(i1, i3, i2, localzjf.U());
      if (f4 == 0.0F) {
        f4 = 1.0F;
      }
      if (localzbt1.u) {
        f4 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f4;
    ArrayList localArrayList3 = new ArrayList();
    for (int i4 = 0; i4 < n; i4++)
    {
      zkf localzkf1 = paramzbfd.F().b(i4);
      float f5 = (float)(d3 / (m - f1 * (m - 1) + f2));
      float f6 = f5 * f1;
      float f7 = f5 * f2;
      int i5 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i4)));
      i5 = zbv.a(i1, i5, localzjf.U());
      int i6 = zbv.a(i1, i5, i2, localzjf.U());
      float f8 = (float)(d3 * i6);
      if ((!localzbt1.f()) && (!localzjf.u())) {
        f8 -= (float)(d3 / 2.0D);
      }
      float f9 = 0.0F;
      if (localzbt1.p()) {
        f9 = paramzp.c() + paramzp.e() - f8 - f7 / 2.0F - f5 - 1.0F;
      } else {
        f9 = paramzp.c() + f8 + f7 / 2.0F + 1.0F;
      }
      List localList = localzbff.a(i, new int[] { j });
      int i7 = localzbff.a(paramzbfd, i, new int[] { j });
      if (i7 == -1) {
        return localArrayList2;
      }
      int i8 = paramzbfd.ak();
      if (localzbt1.p()) {
        f9 -= i7 * (f5 - f6);
      } else {
        f9 += i7 * (f5 - f6);
      }
      ArrayList localArrayList4 = new ArrayList();
      if (localzkf1 != null)
      {
        double d4 = localzkf1.w();
        double d5 = d4;
        double d6 = 0.0D;
        zkf localzkf2;
        double d7;
        if (d4 >= 0.0D) {
          for (i9 = 0; i9 < i7; i9++)
          {
            localzkf2 = ((zbfd)localList.get(i9)).F().b(i4);
            if (localzkf2 != null)
            {
              d7 = localzkf2.w();
              if (d7 > 0.0D) {
                d5 += d7;
              }
            }
          }
        } else {
          for (i9 = 0; i9 < i7; i9++)
          {
            localzkf2 = ((zbfd)localList.get(i9)).F().b(i4);
            if (localzkf2 != null)
            {
              d7 = localzkf2.w();
              if (d7 <= 0.0D) {
                d5 += d7;
              }
            }
          }
        }
        for (int i9 = 0; i9 < localList.size(); i9++)
        {
          localzkf2 = ((zbfd)localList.get(i9)).F().b(i4);
          if (localzkf2 != null)
          {
            d7 = localzkf2.w();
            d6 += Math.abs(d7);
          }
        }
        if ((d6 == 0.0D) || (d6 == 0.0D)) {
          continue;
        }
        float f10 = (float)(Math.abs(d4) / d6 / (localzbt2.z() - localzbt2.D()) * paramzp.f());
        float f11 = (float)(Math.abs(d5) / d6 / (localzbt2.z() - localzbt2.D()) * paramzp.f());
        boolean bool1 = false;
        if (f10 == 0.0F) {
          bool1 = true;
        }
        zuc localzuc = paramzbfd.x();
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf1.e()))
        {
          localObject = new com.aspose.cells.b.a.b.zo(f9 + f5 / 2.0F, f3);
          double d8 = 0.0D;
          double d9 = 0.0D;
          float f12 = 0.0F;
          float f13 = 0.0F;
          if (localzuc != null)
          {
            switch (localzuc.g())
            {
            case 1: 
              d8 = localzuc.c();
              d9 = d8;
              break;
            case 2: 
              d8 = localzuc.c() * d4 / 100.0D;
              d9 = -d8;
              break;
            case 0: 
              double d10 = localzuc.e().size() > i4 ? localzuc.a(localzuc.e().get(i4)) : 0.0D;
              d8 = d10;
              d10 = localzuc.f().size() > i4 ? localzuc.a(localzuc.f().get(i4)) : 0.0D;
              d9 = d10;
              break;
            case 4: 
              d8 = localzuc.a(paramzbfd.F(), n);
              d9 = d8;
            }
            d9 /= d6;
            d8 /= d6;
            f12 = (float)d8 / (float)(localzbt2.z() - localzbt2.D()) * paramzp.f();
            f13 = (float)d9 / (float)(localzbt2.z() - localzbt2.D()) * paramzp.f();
            if (!localzbt2.p())
            {
              if (d4 <= 0.0D) {
                ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() + f11);
              } else {
                ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() - f11);
              }
            }
            else if (d4 <= 0.0D) {
              ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() - f11);
            } else {
              ((com.aspose.cells.b.a.b.zo)localObject).b(((com.aspose.cells.b.a.b.zo)localObject).e() + f11);
            }
          }
          localzuc.a((com.aspose.cells.b.a.b.zo)localObject, f12, f13);
        }
        if (!localzbt2.p())
        {
          if (d4 < 0.0D) {
            f11 = f3 + f11 - f10;
          } else {
            f11 = f3 - f11;
          }
        }
        else if (d4 < 0.0D) {
          f11 = f3 - f11;
        } else {
          f11 = f3 + f11 - f10;
        }
        Object localObject = new zq(f9, f11, f5, f10);
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
          if (((zq)localObject).h() + 1.0F >= (f5 - 1.0F) / 3.0F)
          {
            if (!bool1) {
              a(paramzr, localzkf1, (zq)localObject, f3, localzbt2, paramzp);
            }
            Object[] arrayOfObject = new Object[5];
            boolean bool2;
            if (((zq)localObject).g() + ((zq)localObject).i() / 2.0F < f3) {
              bool2 = true;
            } else if (d4 != 0.0D) {
              bool2 = false;
            } else if (localzbt2.p()) {
              bool2 = false;
            } else {
              bool2 = true;
            }
            arrayOfObject[0] = Integer.valueOf(i8);
            arrayOfObject[1] = Integer.valueOf(i4);
            arrayOfObject[2] = localObject;
            arrayOfObject[3] = localzbt1;
            arrayOfObject[4] = Boolean.valueOf(bool2);
            if ((!localzkf1.a()) && (a(localzq, paramzp, localzkf1.o(), bool1))) {
              com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
            }
            if (paramzbfd.Z())
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, localObject);
              com.aspose.cells.b.a.a.zf.a(localArrayList4, Boolean.valueOf(bool2));
            }
          }
        }
      }
      ArrayList[] arrayOfArrayList = { localArrayList3 };
      a(paramzr, paramzbfd, arrayOfArrayList, localArrayList4);
      localArrayList3 = arrayOfArrayList[0];
    }
    return localArrayList2;
  }
  
  static ArrayList b(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt, boolean paramBoolean)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 39;
    arrayOfInt[1] = 42;
    int i = paramzbfd.ah();
    zbt localzbt2;
    zbt localzbt1;
    if (i == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
    }
    if (localzbt2.k() == 2) {
      return b(paramzr, paramzbfd, paramzp, paramFloat, paramBoolean);
    }
    float f1 = 0.0F;
    if (!localzbt1.p()) {
      f1 = paramzp.d() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    }
    zbff localzbff = localzjf.z();
    int j = localzbff.getCount();
    float f2 = paramzbfd.L() / 100.0F;
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    boolean bool = paramzbfd.N();
    zanr localzanr1 = paramzbfd.Q();
    zanr localzanr2 = paramzbfd.R();
    zjy localzjy1 = paramzbfd.U();
    zjy localzjy2 = paramzbfd.V();
    ArrayList localArrayList1 = new ArrayList();
    float f3 = 0.0F;
    int k = paramInt;
    if (localzbt2.p) {
      k = (int)localzbt2.z();
    }
    if ((localzbt2.f()) || (localzjf.u()))
    {
      f3 = k;
    }
    else
    {
      f3 = k - 1;
      if (f3 == 0.0F) {
        f3 = 1.0F;
      }
      if (localzbt2.u) {
        f3 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f3;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    List localList = localzbff.a(i, arrayOfInt);
    int i1;
    int i4;
    for (int m = 0; m < localList.size(); m++)
    {
      zbfd localzbfd1 = (zbfd)localList.get(m);
      if ((!localzjf.ao()) || (localzbfd1.equals(paramzbfd)))
      {
        i1 = localzbff.a(localzbfd1, i, arrayOfInt);
        int i2 = localzbfd1.ak();
        ArrayList localArrayList4 = new ArrayList();
        ArrayList localArrayList5 = new ArrayList();
        zkh localzkh = localzbfd1.F();
        for (i4 = 0; i4 < paramInt; i4++)
        {
          zkf localzkf1 = localzkh.b(i4);
          if ((localzkf1 != null) && (!localzkf1.a()))
          {
            double d4 = (float)d3 * i4;
            if ((localzbt2.f()) || (localzjf.u())) {
              d4 += (float)(d3 / 2.0D);
            }
            if (localzbt2.p()) {
              d4 = paramzp.c() + paramzp.e() - d4;
            } else {
              d4 = paramzp.c() + d4;
            }
            double d5 = localzkf1.w();
            double d6 = d5;
            double d7 = 0.0D;
            double d8;
            if (d5 >= 0.0D) {
              for (i6 = 0; i6 < i1; i6++)
              {
                localObject2 = ((zbfd)localList.get(i6)).F().b(i4);
                if (localObject2 != null)
                {
                  d8 = ((zkf)localObject2).w();
                  if (d8 > 0.0D) {
                    d6 += d8;
                  }
                }
              }
            } else {
              for (i6 = 0; i6 < i1; i6++)
              {
                localObject2 = ((zbfd)localList.get(i6)).F().b(i4);
                if (localObject2 != null)
                {
                  d8 = ((zkf)localObject2).w();
                  if (d8 <= 0.0D) {
                    d6 += d8;
                  }
                }
              }
            }
            for (int i6 = 0; i6 < localList.size(); i6++)
            {
              localObject2 = ((zbfd)localList.get(i6)).F().b(i4);
              if (localObject2 != null)
              {
                d8 = ((zkf)localObject2).w();
                d7 += Math.abs(d8);
              }
            }
            float f9;
            if (d7 == 0.0D) {
              f9 = 0.0F;
            } else {
              f9 = (float)Math.abs(d6) / (float)d7 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
            }
            Object localObject2 = paramzbfd.x();
            if ((localObject2 != null) && (((zuc)localObject2).d() != 2) && (localzbfd1.equals(paramzbfd)) && (!localzkf1.e()))
            {
              com.aspose.cells.b.a.b.zo localzo2 = new com.aspose.cells.b.a.b.zo((float)d4, f1);
              double d9 = 0.0D;
              double d10 = 0.0D;
              float f11 = 0.0F;
              float f12 = 0.0F;
              if (localObject2 != null)
              {
                switch (((zuc)localObject2).g())
                {
                case 1: 
                  d9 = ((zuc)localObject2).c();
                  d10 = d9;
                  break;
                case 2: 
                  d9 = ((zuc)localObject2).c() * d5 / 100.0D;
                  d10 = -d9;
                  break;
                case 0: 
                  double d11 = ((zuc)localObject2).e().size() > i4 ? ((zuc)localObject2).a(((zuc)localObject2).e().get(i4)) : 0.0D;
                  d9 = d11;
                  d11 = ((zuc)localObject2).f().size() > i4 ? ((zuc)localObject2).a(((zuc)localObject2).f().get(i4)) : 0.0D;
                  d10 = d11;
                  break;
                case 4: 
                  d9 = ((zuc)localObject2).a(paramzbfd.F(), paramInt);
                  d10 = d9;
                }
                d10 = d10 * 100.0D / d7;
                d9 = d9 * 100.0D / d7;
                f11 = (float)d9 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
                f12 = (float)d10 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
                if (!localzbt1.p())
                {
                  if (d5 < 0.0D) {
                    localzo2.b(localzo2.e() + f9);
                  } else {
                    localzo2.b(localzo2.e() - f9);
                  }
                }
                else if (d5 < 0.0D) {
                  localzo2.b(localzo2.e() - f9);
                } else {
                  localzo2.b(localzo2.e() + f9);
                }
              }
              if (localzbfd1.equals(paramzbfd)) {
                ((zuc)localObject2).a(localzo2, f11, f12);
              }
            }
            if (!paramBoolean)
            {
              float f10;
              if (!localzbt1.p())
              {
                if (d5 < 0.0D) {
                  f10 = f1 + f9;
                } else {
                  f10 = f1 - f9;
                }
              }
              else if (d5 < 0.0D) {
                f10 = f1 - f9;
              } else {
                f10 = f1 + f9;
              }
              com.aspose.cells.b.a.b.zo localzo3 = new com.aspose.cells.b.a.b.zo((float)d4, f10);
              com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo3);
              com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i4));
              if (localzbfd1.equals(paramzbfd))
              {
                com.aspose.cells.b.a.a.zf.a(localArrayList3, localzo3);
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i2);
                arrayOfObject[1] = Integer.valueOf(i4);
                arrayOfObject[2] = localzo3;
                arrayOfObject[3] = localzbt2;
                if (a(localzkf1, d2 * 100.0D, d1 * 100.0D)) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
                }
              }
            }
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i4));
            if (localzbfd1.equals(paramzbfd)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, null);
            }
          }
        }
        if (localzbfd1.equals(paramzbfd)) {
          a(paramzr, localzbfd1, localArrayList4, localArrayList5, paramzp);
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList4);
      }
    }
    if (paramBoolean) {
      return null;
    }
    if (!localzjf.ao()) {
      zbzu.a(paramzr, paramzbfd, localArrayList3, paramzp);
    }
    if ((!localzjf.ao()) && ((paramzbfd.O()) || (paramzbfd.N()) || (paramzbfd.P()))) {
      for (m = 0; m < paramInt; m++)
      {
        int n = 0;
        i1 = 0;
        float f4 = 0.0F;
        float f5 = 0.0F;
        float f6 = 0.0F;
        int i3 = 0;
        i4 = 0;
        float f7 = 0.0F;
        float f8 = 0.0F;
        Object localObject1;
        for (int i5 = 0; i5 < localArrayList2.size(); i5++)
        {
          localObject1 = (ArrayList)localArrayList2.get(i5);
          zbfd localzbfd2 = (zbfd)localList.get(i5);
          zkf localzkf2 = localzbfd2.F().b(m);
          if (((localzkf2 == null) || ((!localzkf2.d()) && (!localzkf2.z()))) && (((ArrayList)localObject1).size() > m) && (((ArrayList)localObject1).get(m) != null))
          {
            com.aspose.cells.b.a.b.zo localzo1 = (com.aspose.cells.b.a.b.zo)((ArrayList)localObject1).get(m);
            f6 = localzo1.d();
            if (n == 0)
            {
              f4 = localzo1.e();
              f5 = localzo1.e();
              n = 1;
            }
            else if (i1 == 0)
            {
              if (f4 < localzo1.e())
              {
                f5 = f4;
                f4 = localzo1.e();
                i1 = 1;
              }
              else
              {
                f5 = localzo1.e();
                i1 = 1;
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
            if (i5 == 0)
            {
              f7 = localzo1.e();
              i3 = 1;
            }
            else if (i5 == localArrayList2.size() - 1)
            {
              f8 = localzo1.e();
              i4 = 1;
            }
          }
        }
        if (paramzbfd.equals(localList.get(localList.size() - 1))) {
          if ((paramzbfd.O()) && (n != 0) && (i1 != 0)) {
            localzanr2.a(f6, f4, f6, f5);
          } else if ((bool) && (n != 0)) {
            localzanr1.a(f6, f5, f6, paramFloat);
          }
        }
        if ((paramzbfd.P()) && (i3 != 0) && (i4 != 0))
        {
          i5 = (int)(d3 / (1.0F + f2));
          localObject1 = new zq();
          if (f7 <= f8)
          {
            ((zq)localObject1).c(i5);
            ((zq)localObject1).d(f8 - f7);
            ((zq)localObject1).a(f6 - ((zq)localObject1).h() / 2.0F);
            ((zq)localObject1).b(f7);
            a(paramzr, localzjy2, (zq)localObject1);
          }
          else
          {
            ((zq)localObject1).c(i5);
            ((zq)localObject1).d(f7 - f8);
            ((zq)localObject1).a(f6 - ((zq)localObject1).h() / 2.0F);
            ((zq)localObject1).b(f8);
            a(paramzr, localzjy1, (zq)localObject1);
          }
        }
      }
    }
    return localArrayList1;
  }
  
  private static ArrayList b(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, boolean paramBoolean)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 39;
    arrayOfInt[1] = 42;
    int i = paramzbfd.ah();
    zbff localzbff = localzjf.z();
    int j = localzbff.getCount();
    float f1 = paramzbfd.M() / 100.0F;
    float f2 = paramzbfd.L() / 100.0F;
    zbt localzbt2;
    zbt localzbt1;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
      localArrayList1 = ziz.a(localzjf.z().c(), localzjf.U());
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
      localArrayList1 = ziz.a(localzjf.z().d(), localzjf.U());
    }
    float f3 = 0.0F;
    if (!localzbt1.p()) {
      f3 = paramzp.d() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    } else {
      f3 = paramzp.j() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    }
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    boolean bool = paramzbfd.N();
    zanr localzanr1 = paramzbfd.Q();
    zanr localzanr2 = paramzbfd.R();
    zjy localzjy1 = paramzbfd.U();
    zjy localzjy2 = paramzbfd.V();
    int k = localArrayList1.size();
    int m = localzbt2.j();
    int n = (int)localzbt2.D();
    int i1 = (int)localzbt2.z();
    float f4 = 0.0F;
    if ((localzbt2.f()) || (localzjf.u()))
    {
      f4 = zbv.a(m, i1, n, localzjf.U()) + 1;
    }
    else
    {
      f4 = zbv.a(m, i1, n, localzjf.U());
      if (f4 == 0.0F) {
        f4 = 1.0F;
      }
      if (localzbt2.u) {
        f4 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f4;
    float f5 = 0.0F;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    List localList = localzbff.a(i, arrayOfInt);
    int i4;
    int i7;
    int i9;
    for (int i2 = 0; i2 < localList.size(); i2++)
    {
      zbfd localzbfd1 = (zbfd)localList.get(i2);
      if ((!localzjf.ao()) || (localzbfd1.equals(paramzbfd)))
      {
        i4 = localzbff.a(localzbfd1, i, arrayOfInt);
        int i5 = localzbfd1.ak();
        ArrayList localArrayList5 = new ArrayList();
        ArrayList localArrayList6 = new ArrayList();
        ArrayList localArrayList7 = new ArrayList();
        for (i7 = 0; i7 < k; i7++)
        {
          zkf localzkf1 = localzbfd1.F().b(i7);
          if (localzkf1 != null)
          {
            int i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList1.get(i7)));
            i8 = zbv.a(m, i8, localzjf.U());
            i9 = zbv.a(m, i8, n, localzjf.U());
            float f11 = (float)(d3 * i9);
            f5 = (float)(d3 * zbv.a(m, zbv.a(localzbt2.j(), localzbt2.y(), (int)localzbt2.x(), i8, localzjf.U()), i8, localzjf.U()));
            if ((localzbt2.f()) || (localzjf.u())) {
              f11 += (float)(d3 / 2.0D);
            }
            float f12 = 0.0F;
            if (localzbt2.p()) {
              f12 = paramzp.c() + paramzp.e() - f11;
            } else {
              f12 = paramzp.c() + f11;
            }
            double d4 = localzkf1.w();
            double d5 = d4;
            double d6 = 0.0D;
            double d7;
            if (d4 >= 0.0D) {
              for (i10 = 0; i10 < i4; i10++)
              {
                localObject2 = ((zbfd)localList.get(i10)).F().b(i7);
                if (localObject2 != null)
                {
                  d7 = ((zkf)localObject2).w();
                  if (d7 > 0.0D) {
                    d5 += d7;
                  }
                }
              }
            } else {
              for (i10 = 0; i10 < i4; i10++)
              {
                localObject2 = ((zbfd)localList.get(i10)).F().b(i7);
                if (localObject2 != null)
                {
                  d7 = ((zkf)localObject2).w();
                  if (d7 <= 0.0D) {
                    d5 += d7;
                  }
                }
              }
            }
            for (int i10 = 0; i10 < localList.size(); i10++)
            {
              localObject2 = ((zbfd)localList.get(i10)).F().b(i7);
              if (localObject2 != null)
              {
                d7 = ((zkf)localObject2).w();
                d6 += Math.abs(d7);
              }
            }
            float f13;
            if (d6 == 0.0D) {
              f13 = 0.0F;
            } else {
              f13 = (float)Math.abs(d5) / (float)d6 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
            }
            Object localObject2 = paramzbfd.x();
            if ((localObject2 != null) && (((zuc)localObject2).d() != 2) && (localzbfd1.equals(paramzbfd)) && (!localzkf1.e()) && (!localzkf1.a()))
            {
              com.aspose.cells.b.a.b.zo localzo2 = new com.aspose.cells.b.a.b.zo(f12, f3);
              double d8 = 0.0D;
              double d9 = 0.0D;
              float f15 = 0.0F;
              float f16 = 0.0F;
              switch (((zuc)localObject2).g())
              {
              case 1: 
                d8 = ((zuc)localObject2).c();
                d9 = d8;
                break;
              case 2: 
                d8 = ((zuc)localObject2).c() * d4 / 100.0D;
                d9 = -d8;
                break;
              case 0: 
                double d10 = ((zuc)localObject2).e().size() > i7 ? ((zuc)localObject2).a(((zuc)localObject2).e().get(i7)) : 0.0D;
                d8 = d10;
                d10 = ((zuc)localObject2).f().size() > i7 ? ((zuc)localObject2).a(((zuc)localObject2).f().get(i7)) : 0.0D;
                d9 = d10;
                break;
              case 4: 
                d8 = ((zuc)localObject2).a(paramzbfd.F(), k);
                d9 = d8;
              }
              d9 = d9 * 100.0D / d6;
              d8 = d8 * 100.0D / d6;
              f15 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
              f16 = (float)d9 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
              if (!localzbt1.p())
              {
                if (d4 < 0.0D) {
                  localzo2.b(localzo2.e() + f13);
                } else {
                  localzo2.b(localzo2.e() - f13);
                }
              }
              else if (d4 < 0.0D) {
                localzo2.b(localzo2.e() - f13);
              } else {
                localzo2.b(localzo2.e() + f13);
              }
              ((zuc)localObject2).a(localzo2, f15, f16);
            }
            if (!paramBoolean)
            {
              float f14;
              if (!localzbt1.p())
              {
                if (d4 < 0.0D) {
                  f14 = f3 + f13;
                } else {
                  f14 = f3 - f13;
                }
              }
              else if (d4 < 0.0D) {
                f14 = f3 - f13;
              } else {
                f14 = f3 + f13;
              }
              com.aspose.cells.b.a.b.zo localzo3 = new com.aspose.cells.b.a.b.zo(f12, f14);
              if (localzkf1.a()) {
                com.aspose.cells.b.a.a.zf.a(localArrayList7, Integer.valueOf(i7));
              }
              zkn.a(localzo3, localArrayList5, localArrayList6, i7, localzbt2.p());
              if ((localzbfd1.equals(paramzbfd)) && (!localzkf1.a()))
              {
                com.aspose.cells.b.a.a.zf.a(localArrayList4, localzo3);
                Object[] arrayOfObject = new Object[4];
                arrayOfObject[0] = Integer.valueOf(i5);
                arrayOfObject[1] = Integer.valueOf(i7);
                arrayOfObject[2] = localzo3;
                arrayOfObject[3] = localzbt2;
                if (a(localzkf1, d2 * 100.0D, d1 * 100.0D)) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
                }
              }
            }
          }
          else
          {
            if (localzbt2.p())
            {
              localArrayList5.add(0, null);
              localArrayList6.add(0, Integer.valueOf(i7));
            }
            else
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList5, null);
              com.aspose.cells.b.a.a.zf.a(localArrayList6, Integer.valueOf(i7));
            }
            if (localzbfd1.equals(paramzbfd)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, null);
            }
          }
        }
        zkn.a(localArrayList5, localArrayList6, localArrayList7);
        if (localzbfd1.equals(paramzbfd)) {
          a(paramzr, localzbfd1, localArrayList5, localArrayList6, paramzp);
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList5);
      }
    }
    if (paramBoolean) {
      return null;
    }
    if (!localzjf.ao()) {
      zbzu.a(paramzr, paramzbfd, localArrayList4, paramzp);
    }
    if ((!localzjf.ao()) && ((paramzbfd.O()) || (paramzbfd.N()) || (paramzbfd.P()))) {
      for (i2 = 0; i2 < k; i2++)
      {
        int i3 = 0;
        i4 = 0;
        float f6 = 0.0F;
        float f7 = 0.0F;
        float f8 = 0.0F;
        int i6 = 0;
        i7 = 0;
        float f9 = 0.0F;
        float f10 = 0.0F;
        Object localObject1;
        for (i9 = 0; i9 < localArrayList3.size(); i9++)
        {
          localObject1 = (ArrayList)localArrayList3.get(i9);
          zbfd localzbfd2 = (zbfd)localList.get(i9);
          zkf localzkf2 = localzbfd2.F().b(i2);
          if (((localzkf2 == null) || ((!localzkf2.d()) && (!localzkf2.z()))) && (((ArrayList)localObject1).size() > i2) && (((ArrayList)localObject1).get(i2) != null))
          {
            com.aspose.cells.b.a.b.zo localzo1 = (com.aspose.cells.b.a.b.zo)((ArrayList)localObject1).get(i2);
            f8 = localzo1.d();
            if (i3 == 0)
            {
              f6 = localzo1.e();
              f7 = localzo1.e();
              i3 = 1;
            }
            else if (i4 == 0)
            {
              if (f6 < localzo1.e())
              {
                f7 = f6;
                f6 = localzo1.e();
                i4 = 1;
              }
              else
              {
                f7 = localzo1.e();
                i4 = 1;
              }
            }
            else
            {
              if (f6 < localzo1.e()) {
                f6 = localzo1.e();
              }
              if (f7 > localzo1.e()) {
                f7 = localzo1.e();
              }
            }
            if (i9 == 0)
            {
              f9 = localzo1.e();
              i6 = 1;
            }
            else if (i9 == localArrayList3.size() - 1)
            {
              f10 = localzo1.e();
              i7 = 1;
            }
          }
        }
        if (paramzbfd.equals(localList.get(localList.size() - 1))) {
          if ((paramzbfd.O()) && (i3 != 0) && (i4 != 0)) {
            localzanr2.a(f8, f6, f8, f7);
          } else if ((bool) && (i3 != 0)) {
            localzanr1.a(f8, f7, f8, paramFloat);
          }
        }
        if ((paramzbfd.P()) && (i6 != 0) && (i7 != 0))
        {
          i9 = (int)(f5 / (1.0F + f2));
          localObject1 = new zq();
          if (f9 <= f10)
          {
            ((zq)localObject1).c(i9);
            ((zq)localObject1).d(f10 - f9);
            ((zq)localObject1).a(f8 - ((zq)localObject1).h() / 2.0F);
            ((zq)localObject1).b(f9);
            a(paramzr, localzjy2, (zq)localObject1);
          }
          else
          {
            ((zq)localObject1).c(i9);
            ((zq)localObject1).d(f9 - f10);
            ((zq)localObject1).a(f8 - ((zq)localObject1).h() / 2.0F);
            ((zq)localObject1).b(f10);
            a(paramzr, localzjy1, (zq)localObject1);
          }
        }
      }
    }
    return localArrayList2;
  }
  
  static ArrayList b(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    zbff localzbff = localzjf.z();
    int j = paramzbfd.ah();
    zbt localzbt2;
    zbt localzbt1;
    if (j == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
    }
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f1 = paramzbfd.M() / 100.0F;
    float f2 = paramzbfd.L() / 100.0F;
    ArrayList localArrayList = new ArrayList();
    float f3 = 0.0F;
    int k = paramInt;
    if (localzbt2.p) {
      k = (int)localzbt2.z();
    }
    if ((localzbt2.f()) || (localzjf.u()))
    {
      f3 = k;
    }
    else
    {
      f3 = k - 1;
      if (f3 == 0.0F) {
        f3 = 1.0F;
      }
      if (localzbt2.u) {
        f3 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f3;
    int m = localzbff.a(paramzbfd, j, new int[] { 78 });
    if (m == -1) {
      return localArrayList;
    }
    int n = paramzbfd.ak();
    zkh localzkh = paramzbfd.F();
    double d4 = 0.0D;
    com.aspose.cells.b.a.b.zo localzo1 = com.aspose.cells.b.a.b.zo.a();
    int i = 1;
    for (int i1 = 0; i1 < localzkh.getCount(); i1++)
    {
      zkf localzkf = localzkh.b(i1);
      float f4 = (float)d3 / (i - f1 * (i - 1) + f2);
      float f5 = f4 * f1;
      float f6 = f4 * f2;
      float f7 = m * (f4 - f5);
      float f8 = (float)d3 * i1 + f6 / 2.0F + f7;
      if ((!localzbt2.f()) && (!localzjf.u())) {
        f8 -= (float)(d3 / 2.0D);
      }
      if (localzbt2.p()) {
        f8 = paramzp.c() + paramzp.e() - f8 - f4;
      } else {
        f8 = paramzp.c() + f8;
      }
      if ((localzkf != null) && (!localzkf.a()))
      {
        d4 += localzkf.w();
        if (localzkf.H()) {
          d4 = localzkf.w();
        }
        double d5 = localzkf.w();
        float f9 = (float)(Math.abs(d5) / (d1 - d2) * paramzp.f());
        float f10 = (float)((paramDouble - d4) / (d1 - d2) * paramzp.f());
        float f11 = paramFloat + f10;
        if (d5 < 0.0D) {
          f11 -= f9;
        }
        zq localzq1 = new zq(f8, f11, f4, f9);
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
          if (localzq1.h() + 1.0F >= (f4 - 1.0F) / 3.0F)
          {
            a(paramzr, localzkf, localzq1, paramFloat, localzbt1, paramzp);
            com.aspose.cells.b.a.b.zo localzo2 = localzo1;
            com.aspose.cells.b.a.b.zo localzo3;
            if (localzkf.H())
            {
              if (d5 >= 0.0D) {
                localzo3 = new com.aspose.cells.b.a.b.zo(localzq1.f(), f11);
              } else {
                localzo3 = new com.aspose.cells.b.a.b.zo(localzq1.f(), localzq1.m());
              }
            }
            else if (d5 >= 0.0D) {
              localzo3 = new com.aspose.cells.b.a.b.zo(localzq1.f(), localzq1.m());
            } else {
              localzo3 = new com.aspose.cells.b.a.b.zo(localzq1.f(), f11);
            }
            if ((!localzo2.b()) && (paramzbfd.D().a())) {
              if ((!paramzbfd.z().m()) && (!paramzbfd.z().a().isEmpty()))
              {
                paramzbfd.z().a(localzo2, localzo3);
              }
              else
              {
                localObject = localzjf.Z().a().a("tx1");
                localObject = localzjf.Z().a().a((Color)localObject, 0.75D);
                localObject = Color.a(255, (Color)localObject);
                com.aspose.cells.a.d.zs localzs = new com.aspose.cells.a.d.zs((Color)localObject);
                paramzr.a(localzs, localzo2, localzo3);
              }
            }
            if (d5 >= 0.0D) {
              localzo1 = new com.aspose.cells.b.a.b.zo(localzq1.l(), localzq1.g());
            } else {
              localzo1 = new com.aspose.cells.b.a.b.zo(localzq1.l(), localzq1.m());
            }
            Object localObject = new Object[5];
            boolean bool = d5 >= 0.0D;
            localObject[0] = Integer.valueOf(n);
            localObject[1] = Integer.valueOf(i1);
            localObject[2] = localzq2;
            localObject[3] = localzbt2;
            localObject[4] = Boolean.valueOf(bool);
            if (a(localzq2, paramzp, localzkf.o(), false)) {
              com.aspose.cells.b.a.a.zf.a(localArrayList, localObject);
            }
          }
        }
      }
    }
    return localArrayList;
  }
  
  static void a(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramzbfd.k().getCount(); i++)
    {
      localObject = paramzbfd.F().b(i);
      zbxd localzbxd1 = new zbxd();
      localzbxd1.a(i);
      localzbxd1.a(com.aspose.cells.b.a.zo.b(((zkf)localObject).w()));
      localzbxd1.a(((zkf)localObject).w());
      if (localArrayList.size() == 0) {
        com.aspose.cells.b.a.a.zf.a(localArrayList, localzbxd1);
      } else {
        for (int k = localArrayList.size() - 1; k >= 0; k--)
        {
          zbxd localzbxd3 = (zbxd)localArrayList.get(k);
          if (localzbxd1.b() <= localzbxd3.b())
          {
            if (k == localArrayList.size() - 1)
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList, localzbxd1);
              break;
            }
            localArrayList.add(k + 1, localzbxd1);
            break;
          }
          if (k == 0) {
            localArrayList.add(0, localzbxd1);
          }
        }
      }
    }
    zbxc localzbxc = new zbxc();
    localzbxc.a(paramzp.e());
    localzbxc.b(paramzp.f());
    localzbxc.a(localArrayList);
    Object localObject = new zln(null, false);
    for (int j = 0; j < localArrayList.size(); j++)
    {
      zbxd localzbxd2 = (zbxd)localArrayList.get(j);
      double d1 = localzbxd2.c() + paramzp.c();
      double d2 = localzbxd2.d() + paramzp.d();
      double d3 = localzbxd2.e();
      double d4 = localzbxd2.f();
      int m = localzbxd2.a();
      zkf localzkf = paramzbfd.F().b(m);
      zq localzq = new zq((float)d1, (float)d2, (float)d3, (float)d4);
      localzkf.i().a(localzq);
      localzkf.k().a(localzq);
      zqy localzqy = localzkf.o();
      int n = 4;
      int i1 = (int)localzq.h() - 2 * n;
      zt localzt = zra.a(paramzr, paramzbfd.v().e(), paramzbfd.aj(), paramzbfd.ak(), m, i1);
      localzqy.a().b = new com.aspose.cells.b.a.b.zp(zbxz.c(d1 + n), zbxz.c(localzq.m() - n - localzt.c()), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
      localzqy.a().z();
      zra.a(paramzr, paramzbfd.v().e(), paramzbfd.aj(), paramzbfd.ak(), m, localzqy.a().a);
    }
  }
  
  static ArrayList a(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzjf, paramFloat, paramDouble);
    }
    ArrayList localArrayList1 = new ArrayList();
    float f1 = paramzjf.S().g() / paramInt;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f2 = paramzjf.S().a(false, paramInt, i);
    float f3 = paramzjf.S().k();
    float f4 = f2 * paramzjf.o() / 100.0F;
    for (int j = 0; j < paramInt; j++)
    {
      int k = j;
      if (paramzjf.E() > 180) {
        k = paramInt - 1 - j;
      }
      ArrayList localArrayList2 = localzbff.j();
      double d3 = 1.0D;
      for (int m = 0; m < localArrayList2.size(); m++)
      {
        int n = m;
        if (paramzjf.E() > 180) {
          n = localArrayList2.size() - 1 - m;
        }
        zbfd localzbfd = (zbfd)localArrayList2.get(n);
        int i1 = localzbfd.ak();
        float f5 = n * f2;
        float f6 = f1 * k + f4 / 2.0F + f5;
        f6 = paramzjf.S().e() + f6;
        zkh localzkh = localzbfd.F();
        int i2 = k;
        if (localzbt2.p()) {
          i2 = paramInt - 1 - k;
        }
        zkf localzkf = localzkh.b(i2);
        if ((localzkf != null) && (!localzkf.a()))
        {
          double d4 = localzbt1.i(localzkf.w());
          float f7 = (float)(zbxz.b(paramDouble, d4) / (d1 - d2) * paramzjf.S().i());
          if (localzbt1.p()) {
            f7 = -f7;
          }
          double[] arrayOfDouble = { d3 };
          a(paramzr, localzkf, paramzjf, f6, f2, f3, paramFloat, f7, NaN.0D, arrayOfDouble);
          d3 = arrayOfDouble[0];
          boolean bool = true;
          if (zbxz.b(f7, 0.0D) <= 0.0D) {
            bool = true;
          } else {
            bool = false;
          }
          com.aspose.cells.b.a.b.zo localzo = a(paramzjf, f6, f2, f3, paramFloat, f7, bool);
          Object[] arrayOfObject = new Object[4];
          arrayOfObject[0] = Integer.valueOf(i1);
          arrayOfObject[1] = Integer.valueOf(i2);
          arrayOfObject[2] = localzo;
          arrayOfObject[3] = Boolean.valueOf(bool);
          com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
        }
      }
    }
    return localArrayList1;
  }
  
  private static ArrayList a(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    ArrayList localArrayList1 = new ArrayList();
    int j = (int)localzbt2.z();
    int k = (int)localzbt2.D();
    int m = localzbt2.j();
    int n = zbv.a(m, j, k, paramzjf.U()) + 1;
    float f1 = paramzjf.S().g() / n;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f2 = paramzjf.S().a(false, n, i);
    float f3 = paramzjf.S().k();
    float f4 = f2 * paramzjf.o() / 100.0F;
    ArrayList localArrayList2 = ziz.a(paramzjf.z().c(), paramzjf.U());
    int i1 = localArrayList2.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = i2;
      if (paramzjf.E() > 180) {
        i3 = i1 - 1 - i2;
      }
      int i4 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i3)));
      i4 = zbv.a(m, i4, paramzjf.U());
      int i5 = zbv.a(m, i4, (int)localzbt2.D(), paramzjf.U());
      float f5 = f1 * i5;
      f5 += paramzjf.S().e() + f4 / 2.0F;
      ArrayList localArrayList3 = localzbff.j();
      double d3 = 1.0D;
      for (int i6 = 0; i6 < localArrayList3.size(); i6++)
      {
        int i7 = i6;
        if (paramzjf.E() > 180) {
          i7 = localArrayList3.size() - 1 - i6;
        }
        zbfd localzbfd = (zbfd)localArrayList3.get(i7);
        int i8 = localzbfd.ak();
        float f6 = i7 * f2;
        float f7 = f5 + f6;
        zkh localzkh = localzbfd.F();
        int i9 = i3;
        if (localzbt2.p()) {
          i9 = i1 - 1 - i3;
        }
        zkf localzkf = localzkh.b(i9);
        if ((localzkf != null) && (!localzkf.a()))
        {
          double d4 = localzbt1.i(localzkf.w());
          float f8 = (float)(zbxz.b(paramDouble, d4) / (d1 - d2) * paramzjf.S().i());
          if (localzbt1.p()) {
            f8 = -f8;
          }
          double[] arrayOfDouble = { d3 };
          a(paramzr, localzkf, paramzjf, f7, f2, f3, paramFloat, f8, NaN.0D, arrayOfDouble);
          d3 = arrayOfDouble[0];
          boolean bool = true;
          if (zbxz.b(f8, 0.0D) < 0.0D) {
            bool = true;
          } else {
            bool = false;
          }
          com.aspose.cells.b.a.b.zo localzo = a(paramzjf, f7, f2, f3, paramFloat, f8, bool);
          Object[] arrayOfObject = new Object[4];
          arrayOfObject[0] = Integer.valueOf(i8);
          arrayOfObject[1] = Integer.valueOf(i9);
          arrayOfObject[2] = localzo;
          arrayOfObject[3] = Boolean.valueOf(bool);
          com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
        }
      }
    }
    return localArrayList1;
  }
  
  static ArrayList a(zr paramzr, zjf paramzjf, double paramDouble, int paramInt)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    ArrayList localArrayList1 = localzbff.j();
    int j = ziz.a(localArrayList1);
    double d1 = 0.0D;
    if (j == 1) {
      d1 = localzbt1.D();
    } else if (j == 2) {
      d1 = localzbt1.z();
    }
    float f1 = 0.0F;
    if (paramzjf.G().p()) {
      f1 = paramzjf.S().f() - (float)Math.abs((localzbt1.z() - d1) / (float)(localzbt1.z() - localzbt1.D())) * paramzjf.S().i();
    } else {
      f1 = paramzjf.S().f() - (float)Math.abs((localzbt1.D() - d1) / (float)(localzbt1.z() - localzbt1.D())) * paramzjf.S().i();
    }
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzjf, f1, paramDouble, j, d1);
    }
    ArrayList localArrayList2 = new ArrayList();
    float f2 = paramzjf.S().g() / paramInt;
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d3 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    float f3 = paramzjf.S().a(false, paramInt, 1);
    float f4 = paramzjf.S().k();
    float f5 = f3 * paramzjf.o() / 100.0F;
    for (int k = 0; k < paramInt; k++)
    {
      int m = k;
      if (paramzjf.E() > 180) {
        m = paramInt - 1 - k;
      }
      float f6 = paramzjf.S().e() + f2 * m + f5 / 2.0F;
      ArrayList localArrayList3 = new ArrayList();
      Object localObject1;
      Object localObject2;
      for (int n = 0; n < localArrayList1.size(); n++)
      {
        zbfd localzbfd = (zbfd)localArrayList1.get(n);
        i1 = localzbfd.ak();
        localObject1 = localzbfd.F();
        int i2 = m;
        if (localzbt2.p()) {
          i2 = paramInt - 1 - m;
        }
        localObject2 = ((zkh)localObject1).b(i2);
        int i3 = n;
        if ((localObject2 != null) && (!((zkf)localObject2).a()))
        {
          double d5 = ((zkf)localObject2).w();
          double d6 = 0.0D;
          double[] arrayOfDouble1 = { d5 };
          double[] arrayOfDouble2 = { d6 };
          boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList1, i3, i2, localzbt1.z(), localzbt1.D());
          d5 = arrayOfDouble1[0];
          d6 = arrayOfDouble2[0];
          if (bool)
          {
            if ((j == 1) && (n == 0)) {
              d5 -= d1;
            } else if ((j == 2) && (n == 0)) {
              d5 -= d1;
            }
            float f7 = (float)(d5 / (d2 - d3) * paramzjf.S().i());
            float f8 = (float)((d6 - d1) / (d2 - d3) * paramzjf.S().i());
            float f9;
            if (localzbt1.p())
            {
              f9 = f1 + (f8 - f7);
            }
            else
            {
              f9 = f1 - (f8 - f7);
              f7 = -f7;
            }
            float f10 = f9 + f7;
            if (f9 > paramzjf.S().f()) {
              f9 = paramzjf.S().f();
            }
            if (f9 < paramzjf.S().f() - paramzjf.S().i()) {
              f9 = paramzjf.S().f() - paramzjf.S().i();
            }
            if (f10 > paramzjf.S().f()) {
              f10 = paramzjf.S().f();
            }
            if (f10 < paramzjf.S().f() - paramzjf.S().i()) {
              f10 = paramzjf.S().f() - paramzjf.S().i();
            }
            f7 = f10 - f9;
            Object[] arrayOfObject1 = new Object[5];
            arrayOfObject1[0] = localObject2;
            arrayOfObject1[1] = Float.valueOf(f6);
            arrayOfObject1[2] = Float.valueOf(f9);
            arrayOfObject1[3] = Float.valueOf(f7);
            arrayOfObject1[4] = Double.valueOf(d6);
            a(d5, arrayOfObject1, localArrayList3, localzbt1);
            com.aspose.cells.b.a.b.zo localzo = a(paramzjf, f6, f3, f4, f9, f7);
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i1);
            arrayOfObject2[1] = Integer.valueOf(i2);
            arrayOfObject2[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject2);
          }
        }
      }
      double d4 = 1.0D;
      for (int i1 = 0; i1 < localArrayList3.size(); i1++)
      {
        localObject1 = (Object[])localArrayList3.get(i1);
        zkf localzkf = (zkf)localObject1[0];
        localObject2 = new double[] { d4 };
        a(paramzr, localzkf, paramzjf, ((Float)localObject1[1]).floatValue(), f3, f4, ((Float)localObject1[2]).floatValue(), ((Float)localObject1[3]).floatValue(), ((Double)localObject1[4]).doubleValue(), (double[])localObject2);
        d4 = localObject2[0];
      }
      localArrayList3.clear();
    }
    return localArrayList2;
  }
  
  private static ArrayList a(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble1, int paramInt, double paramDouble2)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    ArrayList localArrayList1 = new ArrayList();
    int j = (int)localzbt2.z();
    int k = (int)localzbt2.D();
    int m = localzbt2.j();
    int n = zbv.a(m, j, k, paramzjf.U()) + 1;
    float f1 = paramzjf.S().g() / n;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    float f2 = paramzjf.S().a(false, n, 1);
    float f3 = paramzjf.S().k();
    float f4 = f2 * paramzjf.o() / 100.0F;
    ArrayList localArrayList2 = ziz.a(paramzjf.z().c(), paramzjf.U());
    int i1 = localArrayList2.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = i2;
      if (paramzjf.E() > 180) {
        i3 = i1 - 1 - i2;
      }
      int i4 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i3)));
      i4 = zbv.a(m, i4, paramzjf.U());
      int i5 = zbv.a(m, i4, (int)localzbt2.D(), paramzjf.U());
      float f5 = f1 * i5;
      float f6 = paramzjf.S().e() + f4 / 2.0F + f5;
      ArrayList localArrayList3 = new ArrayList();
      ArrayList localArrayList4 = localzbff.j();
      Object localObject1;
      Object localObject2;
      for (int i6 = 0; i6 < localArrayList4.size(); i6++)
      {
        zbfd localzbfd = (zbfd)localArrayList4.get(i6);
        i7 = localzbfd.ak();
        localObject1 = localzbfd.F();
        int i8 = i3;
        if (localzbt2.p()) {
          i8 = i1 - 1 - i3;
        }
        localObject2 = ((zkh)localObject1).b(i8);
        int i9 = i6;
        if ((localObject2 != null) && (!((zkf)localObject2).a()))
        {
          double d4 = ((zkf)localObject2).w();
          double d5 = 0.0D;
          double[] arrayOfDouble1 = { d4 };
          double[] arrayOfDouble2 = { d5 };
          boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList4, i9, i8, localzbt1.z(), localzbt1.D());
          d4 = arrayOfDouble1[0];
          d5 = arrayOfDouble2[0];
          if (bool)
          {
            if ((paramInt == 1) && (i6 == 0)) {
              d4 -= paramDouble2;
            } else if ((paramInt == 2) && (i6 == 0)) {
              d4 -= paramDouble2;
            }
            float f7 = (float)(d4 / (d1 - d2) * paramzjf.S().i());
            float f8 = (float)((d5 - paramDouble2) / (d1 - d2) * paramzjf.S().i());
            float f9;
            if (localzbt1.p())
            {
              f9 = paramFloat + (f8 - f7);
            }
            else
            {
              f9 = paramFloat - (f8 - f7);
              f7 = -f7;
            }
            float f10 = f9 + f7;
            if (f9 > paramzjf.S().f()) {
              f9 = paramzjf.S().f();
            }
            if (f9 < paramzjf.S().f() - paramzjf.S().i()) {
              f9 = paramzjf.S().f() - paramzjf.S().i();
            }
            if (f10 > paramzjf.S().f()) {
              f10 = paramzjf.S().f();
            }
            if (f10 < paramzjf.S().f() - paramzjf.S().i()) {
              f10 = paramzjf.S().f() - paramzjf.S().i();
            }
            f7 = f10 - f9;
            Object[] arrayOfObject1 = new Object[5];
            arrayOfObject1[0] = localObject2;
            arrayOfObject1[1] = Float.valueOf(f6);
            arrayOfObject1[2] = Float.valueOf(f9);
            arrayOfObject1[3] = Float.valueOf(f7);
            arrayOfObject1[4] = Double.valueOf(d5);
            a(d4, arrayOfObject1, localArrayList3, localzbt1);
            com.aspose.cells.b.a.b.zo localzo = a(paramzjf, f6, f2, f3, f9, f7);
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i7);
            arrayOfObject2[1] = Integer.valueOf(i8);
            arrayOfObject2[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
        }
      }
      double d3 = 1.0D;
      for (int i7 = 0; i7 < localArrayList3.size(); i7++)
      {
        localObject1 = (Object[])localArrayList3.get(i7);
        zkf localzkf = (zkf)localObject1[0];
        localObject2 = new double[] { d3 };
        a(paramzr, localzkf, paramzjf, ((Float)localObject1[1]).floatValue(), f2, f3, ((Float)localObject1[2]).floatValue(), ((Float)localObject1[3]).floatValue(), ((Double)localObject1[4]).doubleValue(), (double[])localObject2);
        d3 = localObject2[0];
      }
      localArrayList3.clear();
    }
    return localArrayList1;
  }
  
  static ArrayList b(zr paramzr, zjf paramzjf, double paramDouble, int paramInt)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    float f1 = 0.0F;
    if (paramzjf.G().p()) {
      f1 = paramzjf.S().f() - (float)Math.abs(localzbt1.z() / (float)(localzbt1.z() - localzbt1.D())) * paramzjf.S().i();
    } else {
      f1 = paramzjf.S().f() - paramzjf.S().i() + (float)Math.abs(localzbt1.z() / (float)(localzbt1.z() - localzbt1.D())) * paramzjf.S().i();
    }
    if (localzbt2.k() == 2) {
      return b(paramzr, paramzjf, f1, paramDouble);
    }
    ArrayList localArrayList1 = new ArrayList();
    float f2 = paramzjf.S().g() / paramInt;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f3 = paramzjf.S().a(false, paramInt, 1);
    float f4 = paramzjf.S().k();
    float f5 = f3 * paramzjf.o() / 100.0F;
    ArrayList localArrayList2 = localzbff.j();
    for (int j = 0; j < paramInt; j++)
    {
      int k = j;
      if (paramzjf.E() > 180) {
        k = paramInt - 1 - j;
      }
      float f6 = paramzjf.S().e() + f2 * k + f5 / 2.0F;
      ArrayList localArrayList3 = new ArrayList();
      Object localObject1;
      Object localObject2;
      for (int m = 0; m < localArrayList2.size(); m++)
      {
        zbfd localzbfd = (zbfd)localArrayList2.get(m);
        n = localzbfd.ak();
        localObject1 = localzbfd.F();
        int i1 = k;
        if (localzbt2.p()) {
          i1 = paramInt - 1 - k;
        }
        localObject2 = ((zkh)localObject1).b(i1);
        int i2 = m;
        if ((localObject2 != null) && (!((zkf)localObject2).a()))
        {
          double d4 = zkn.a(localArrayList2, i1);
          if (d4 != 0.0D)
          {
            double d5 = ((zkf)localObject2).w();
            double d6 = d5;
            double[] arrayOfDouble1 = { d5 };
            double[] arrayOfDouble2 = { d6 };
            boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList2, i2, i1, localzbt1, d4);
            d5 = arrayOfDouble1[0];
            d6 = arrayOfDouble2[0];
            if (bool)
            {
              float f7 = (float)(d5 / d4 / (d1 - d2) * paramzjf.S().i());
              float f8 = (float)(d6 / d4 / (d1 - d2) * paramzjf.S().i());
              float f9;
              if (localzbt1.p())
              {
                f9 = f1 + (f8 - f7);
              }
              else
              {
                f9 = f1 - (f8 - f7);
                f7 = -f7;
              }
              float f10 = f9 + f7;
              if (f9 > paramzjf.S().f()) {
                f9 = paramzjf.S().f();
              }
              if (f9 < paramzjf.S().f() - paramzjf.S().i()) {
                f9 = paramzjf.S().f() - paramzjf.S().i();
              }
              if (f10 > paramzjf.S().f()) {
                f10 = paramzjf.S().f();
              }
              if (f10 < paramzjf.S().f() - paramzjf.S().i()) {
                f10 = paramzjf.S().f() - paramzjf.S().i();
              }
              f7 = f10 - f9;
              Object[] arrayOfObject1 = new Object[5];
              arrayOfObject1[0] = localObject2;
              arrayOfObject1[1] = Float.valueOf(f6);
              arrayOfObject1[2] = Float.valueOf(f9);
              arrayOfObject1[3] = Float.valueOf(f7);
              arrayOfObject1[4] = Double.valueOf(d6);
              a(d5, arrayOfObject1, localArrayList3, localzbt1);
              com.aspose.cells.b.a.b.zo localzo = a(paramzjf, f6, f3, f4, f9, f7);
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(n);
              arrayOfObject2[1] = Integer.valueOf(i1);
              arrayOfObject2[2] = localzo;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
            }
          }
        }
      }
      double d3 = 1.0D;
      for (int n = 0; n < localArrayList3.size(); n++)
      {
        localObject1 = (Object[])localArrayList3.get(n);
        zkf localzkf = (zkf)localObject1[0];
        localObject2 = new double[] { d3 };
        a(paramzr, localzkf, paramzjf, ((Float)localObject1[1]).floatValue(), f3, f4, ((Float)localObject1[2]).floatValue(), ((Float)localObject1[3]).floatValue(), ((Double)localObject1[4]).doubleValue(), (double[])localObject2);
        d3 = localObject2[0];
      }
      localArrayList3.clear();
    }
    return localArrayList1;
  }
  
  private static ArrayList b(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    ArrayList localArrayList1 = new ArrayList();
    int j = (int)localzbt2.z();
    int k = (int)localzbt2.D();
    int m = localzbt2.j();
    int n = zbv.a(m, j, k, paramzjf.U()) + 1;
    float f1 = paramzjf.S().g() / n;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    float f2 = paramzjf.S().a(false, n, 1);
    float f3 = paramzjf.S().k();
    float f4 = f2 * paramzjf.o() / 100.0F;
    ArrayList localArrayList2 = ziz.a(paramzjf.z().c(), paramzjf.U());
    int i1 = localArrayList2.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = i2;
      if (paramzjf.E() > 180) {
        i3 = i1 - 1 - i2;
      }
      int i4 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i3)));
      i4 = zbv.a(m, i4, paramzjf.U());
      int i5 = zbv.a(m, i4, (int)localzbt2.D(), paramzjf.U());
      float f5 = f1 * i5;
      float f6 = paramzjf.S().e() + f4 / 2.0F + f5;
      ArrayList localArrayList3 = new ArrayList();
      ArrayList localArrayList4 = localzbff.j();
      Object localObject1;
      Object localObject2;
      for (int i6 = 0; i6 < localArrayList4.size(); i6++)
      {
        zbfd localzbfd = (zbfd)localArrayList4.get(i6);
        i7 = localzbfd.ak();
        localObject1 = localzbfd.F();
        int i8 = i3;
        if (localzbt2.p()) {
          i8 = i1 - 1 - i3;
        }
        localObject2 = ((zkh)localObject1).b(i8);
        int i9 = i6;
        if ((localObject2 != null) && (!((zkf)localObject2).a()))
        {
          double d4 = zkn.a(localArrayList4, i8);
          if (d4 != 0.0D)
          {
            double d5 = ((zkf)localObject2).w();
            double d6 = d5;
            double[] arrayOfDouble1 = { d5 };
            double[] arrayOfDouble2 = { d6 };
            boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList4, i9, i8, localzbt1, d4);
            d5 = arrayOfDouble1[0];
            d6 = arrayOfDouble2[0];
            if (bool)
            {
              float f7 = (float)(d5 / d4 / (d1 - d2) * paramzjf.S().i());
              float f8 = (float)(d6 / d4 / (d1 - d2) * paramzjf.S().i());
              float f9;
              if (localzbt1.p())
              {
                f9 = paramFloat + (f8 - f7);
              }
              else
              {
                f9 = paramFloat - (f8 - f7);
                f7 = -f7;
              }
              float f10 = f9 + f7;
              if (f9 > paramzjf.S().f()) {
                f9 = paramzjf.S().f();
              }
              if (f9 < paramzjf.S().f() - paramzjf.S().i()) {
                f9 = paramzjf.S().f() - paramzjf.S().i();
              }
              if (f10 > paramzjf.S().f()) {
                f10 = paramzjf.S().f();
              }
              if (f10 < paramzjf.S().f() - paramzjf.S().i()) {
                f10 = paramzjf.S().f() - paramzjf.S().i();
              }
              f7 = f10 - f9;
              Object[] arrayOfObject1 = new Object[5];
              arrayOfObject1[0] = localObject2;
              arrayOfObject1[1] = Float.valueOf(f6);
              arrayOfObject1[2] = Float.valueOf(f9);
              arrayOfObject1[3] = Float.valueOf(f7);
              arrayOfObject1[4] = Double.valueOf(d6);
              a(d5, arrayOfObject1, localArrayList3, localzbt1);
              com.aspose.cells.b.a.b.zo localzo = a(paramzjf, f6, f2, f3, f9, f7);
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(i7);
              arrayOfObject2[1] = Integer.valueOf(i8);
              arrayOfObject2[2] = localzo;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
            }
          }
        }
      }
      double d3 = 1.0D;
      for (int i7 = 0; i7 < localArrayList3.size(); i7++)
      {
        localObject1 = (Object[])localArrayList3.get(i7);
        zkf localzkf = (zkf)localObject1[0];
        localObject2 = new double[] { d3 };
        a(paramzr, localzkf, paramzjf, ((Float)localObject1[1]).floatValue(), f2, f3, ((Float)localObject1[2]).floatValue(), ((Float)localObject1[3]).floatValue(), ((Double)localObject1[4]).doubleValue(), (double[])localObject2);
        d3 = localObject2[0];
      }
      localArrayList3.clear();
    }
    return localArrayList1;
  }
  
  static ArrayList b(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    if (localzbt2.k() == 2) {
      return c(paramzr, paramzjf, paramFloat, paramDouble);
    }
    float f1 = paramzjf.m() / 100.0F;
    float f2 = paramzjf.n() / 100.0F;
    float f3 = paramzjf.o() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    float f4 = paramzjf.S().g() / paramInt;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f5 = f4 / (1.0F + f3);
    float f6 = f5 * f3;
    float f7 = f4 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = localzbff.j();
    int j;
    int k;
    int n;
    Object localObject;
    int i1;
    int i3;
    zkf localzkf;
    double d3;
    float f10;
    boolean bool;
    com.aspose.cells.b.a.b.zo localzo;
    Object[] arrayOfObject;
    if (((paramzjf.E() >= 0) && (paramzjf.E() < 90)) || ((paramzjf.E() >= 180) && (paramzjf.E() < 270))) {
      for (j = 0; j < localArrayList2.size(); j++)
      {
        k = localArrayList2.size() - 1 - j;
        if ((paramzjf.E() >= 180) && (paramzjf.E() < 270)) {
          k = localArrayList2.size() - 1 - k;
        }
        if (paramzjf.K().p()) {
          k = localArrayList2.size() - 1 - k;
        }
        zbfd localzbfd = (zbfd)localArrayList2.get(k);
        n = localzbfd.ak();
        localObject = localzbfd.F();
        for (i1 = 0; i1 < paramInt; i1++)
        {
          int i2 = i1;
          if ((paramzjf.E() >= 180) && (paramzjf.E() < 270)) {
            i2 = paramInt - 1 - i2;
          }
          float f9 = f4 * i2 + f6 / 2.0F;
          f9 = paramzjf.S().e() + f9;
          i3 = i2;
          if (localzbt2.p()) {
            i3 = paramInt - 1 - i2;
          }
          localzkf = ((zkh)localObject).b(i3);
          if ((localzkf != null) && (!localzkf.a()))
          {
            d3 = localzbt1.i(localzkf.w());
            f10 = (float)(zbxz.b(paramDouble, d3) / (d1 - d2) * paramzjf.S().i());
            if (localzbt1.p()) {
              f10 = -f10;
            }
            a(paramzr, localzkf, paramzjf, paramFloat, f10, f9, f5, f7, n + 1, localArrayList2.size());
            bool = true;
            if (zbxz.b(f10, 0.0D) < 0.0D) {
              bool = true;
            } else {
              bool = false;
            }
            localzo = a(paramzjf, paramFloat, f10, f9, f5, f7, n + 1, localArrayList2.size(), bool);
            arrayOfObject = new Object[4];
            arrayOfObject[0] = Integer.valueOf(n);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzo;
            arrayOfObject[3] = Boolean.valueOf(bool);
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
          }
        }
      }
    } else if (((paramzjf.E() >= 90) && (paramzjf.E() < 180)) || ((paramzjf.E() >= 270) && (paramzjf.E() < 360))) {
      for (j = 0; j < paramInt; j++)
      {
        k = j;
        if ((paramzjf.E() >= 270) && (paramzjf.E() < 360)) {
          k = paramInt - 1 - k;
        }
        for (int m = 0; m < localArrayList2.size(); m++)
        {
          n = m;
          if ((paramzjf.E() >= 270) && (paramzjf.E() < 360)) {
            n = localArrayList2.size() - 1 - n;
          }
          if (paramzjf.K().p()) {
            n = localArrayList2.size() - 1 - n;
          }
          localObject = (zbfd)localArrayList2.get(n);
          i1 = ((zbfd)localObject).ak();
          float f8 = f4 * k + f6 / 2.0F;
          f8 = paramzjf.S().e() + f8;
          zkh localzkh = ((zbfd)localObject).F();
          i3 = k;
          if (localzbt2.p()) {
            i3 = paramInt - 1 - k;
          }
          localzkf = localzkh.b(i3);
          if ((localzkf != null) && (!localzkf.a()))
          {
            d3 = localzbt1.i(localzkf.w());
            f10 = (float)(zbxz.b(paramDouble, d3) / (d1 - d2) * paramzjf.S().i());
            if (localzbt1.p()) {
              f10 = -f10;
            }
            a(paramzr, localzkf, paramzjf, paramFloat, f10, f8, f5, f7, i1 + 1, localArrayList2.size());
            bool = true;
            if (zbxz.b(f10, 0.0D) < 0.0D) {
              bool = true;
            } else {
              bool = false;
            }
            localzo = a(paramzjf, paramFloat, f10, f8, f5, f7, i1 + 1, localArrayList2.size(), bool);
            arrayOfObject = new Object[4];
            arrayOfObject[0] = Integer.valueOf(i1);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzo;
            arrayOfObject[3] = Boolean.valueOf(bool);
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
          }
        }
      }
    }
    return localArrayList1;
  }
  
  private static ArrayList c(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    zbt localzbt3 = paramzjf.K();
    float f1 = paramzjf.m() / 100.0F;
    float f2 = paramzjf.n() / 100.0F;
    float f3 = paramzjf.o() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    int j = (int)localzbt2.z();
    int k = (int)localzbt2.D();
    int m = localzbt2.j();
    int n = zbv.a(m, j, k, paramzjf.U()) + 1;
    float f4 = paramzjf.S().g() / n;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f5 = f4 / (1.0F + f3);
    float f6 = f5 * f3;
    float f7 = f4 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = localzbff.j();
    ArrayList localArrayList3 = ziz.a(paramzjf.z().c(), paramzjf.U());
    int i1 = localArrayList3.size();
    int i2;
    int i3;
    int i5;
    int i7;
    int i8;
    int i11;
    zkf localzkf;
    double d3;
    float f12;
    boolean bool;
    com.aspose.cells.b.a.b.zo localzo;
    Object[] arrayOfObject;
    if (((paramzjf.E() >= 0) && (paramzjf.E() < 90)) || ((paramzjf.E() >= 180) && (paramzjf.E() < 270))) {
      for (i2 = 0; i2 < localArrayList2.size(); i2++)
      {
        i3 = localArrayList2.size() - 1 - i2;
        if ((paramzjf.E() >= 180) && (paramzjf.E() < 270)) {
          i3 = localArrayList2.size() - 1 - i3;
        }
        if (localzbt3.p()) {
          i3 = localArrayList2.size() - 1 - i3;
        }
        zbfd localzbfd1 = (zbfd)localArrayList2.get(i3);
        i5 = localzbfd1.ak();
        zkh localzkh1 = localzbfd1.F();
        for (int i6 = 0; i6 < i1; i6++)
        {
          i7 = i6;
          if ((paramzjf.E() >= 180) && (paramzjf.E() < 270)) {
            i7 = i1 - 1 - i7;
          }
          i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList3.get(i7)));
          i8 = zbv.a(m, i8, paramzjf.U());
          int i9 = zbv.a(m, i8, (int)localzbt2.D(), paramzjf.U());
          float f10 = f4 * i9;
          float f11 = paramzjf.S().e() + f10 + f6 / 2.0F;
          i11 = i7;
          if (localzbt2.p()) {
            i11 = i1 - 1 - i7;
          }
          localzkf = localzkh1.b(i11);
          if ((localzkf != null) && (!localzkf.a()))
          {
            d3 = localzbt1.i(localzkf.w());
            f12 = (float)(zbxz.b(paramDouble, d3) / (d1 - d2) * paramzjf.S().i());
            if (localzbt1.p()) {
              f12 = -f12;
            }
            a(paramzr, localzkf, paramzjf, paramFloat, f12, f11, f5, f7, i5 + 1, localArrayList2.size());
            bool = true;
            if (zbxz.b(f12, 0.0D) < 0.0D) {
              bool = true;
            } else {
              bool = false;
            }
            localzo = a(paramzjf, paramFloat, f12, f11, f5, f7, i5 + 1, localArrayList2.size(), bool);
            arrayOfObject = new Object[4];
            arrayOfObject[0] = Integer.valueOf(i5);
            arrayOfObject[1] = Integer.valueOf(i11);
            arrayOfObject[2] = localzo;
            arrayOfObject[3] = Boolean.valueOf(bool);
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
          }
        }
      }
    } else if (((paramzjf.E() >= 90) && (paramzjf.E() < 180)) || ((paramzjf.E() >= 270) && (paramzjf.E() < 360))) {
      for (i2 = 0; i2 < i1; i2++)
      {
        i3 = i2;
        if ((paramzjf.E() >= 270) && (paramzjf.E() < 360)) {
          i3 = i1 - 1 - i3;
        }
        int i4 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList3.get(i3)));
        i4 = zbv.a(m, i4, paramzjf.U());
        i5 = zbv.a(m, i4, (int)localzbt2.D(), paramzjf.U());
        float f8 = f4 * i5;
        float f9 = paramzjf.S().e() + f8 + f6 / 2.0F;
        for (i7 = 0; i7 < localArrayList2.size(); i7++)
        {
          i8 = i7;
          if ((paramzjf.E() >= 270) && (paramzjf.E() < 360)) {
            i8 = localArrayList2.size() - 1 - i8;
          }
          if (localzbt3.p()) {
            i8 = localArrayList2.size() - 1 - i8;
          }
          zbfd localzbfd2 = (zbfd)localArrayList2.get(i8);
          int i10 = localzbfd2.ak();
          zkh localzkh2 = localzbfd2.F();
          i11 = i3;
          if (localzbt2.p()) {
            i11 = i1 - 1 - i3;
          }
          localzkf = localzkh2.b(i11);
          if ((localzkf != null) && (!localzkf.a()))
          {
            d3 = localzbt1.i(localzkf.w());
            f12 = (float)(zbxz.b(paramDouble, d3) / (d1 - d2) * paramzjf.S().i());
            if (localzbt1.p()) {
              f12 = -f12;
            }
            a(paramzr, localzkf, paramzjf, paramFloat, f12, f9, f5, f7, i10 + 1, localArrayList2.size());
            bool = true;
            if (zbxz.b(f12, 0.0D) < 0.0D) {
              bool = true;
            } else {
              bool = false;
            }
            localzo = a(paramzjf, paramFloat, f12, f9, f5, f7, i10 + 1, localArrayList2.size(), bool);
            arrayOfObject = new Object[4];
            arrayOfObject[0] = Integer.valueOf(i10);
            arrayOfObject[1] = Integer.valueOf(i11);
            arrayOfObject[2] = localzo;
            arrayOfObject[3] = Boolean.valueOf(bool);
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
          }
        }
      }
    }
    return localArrayList1;
  }
  
  static ArrayList c(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    if (localzbt2.k() == 2) {
      return d(paramzr, paramzjf, paramFloat, paramDouble);
    }
    float f1 = paramzjf.m() / 100.0F;
    float f2 = paramzjf.n() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    int j = 0;
    int k = (localzbt2.f()) || (paramzjf.u()) ? 1 : 0;
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
    float f3 = paramzjf.S().g() / j;
    float f4 = f3 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = localzbff.j();
    int m;
    int n;
    zbfd localzbfd;
    int i1;
    zkh localzkh;
    int i2;
    int i3;
    float f5;
    int i4;
    zkf localzkf;
    double d3;
    float f6;
    Object[] arrayOfObject1;
    int i5;
    Object[] arrayOfObject2;
    if (((paramzjf.E() >= 0) && (paramzjf.E() < 90)) || ((paramzjf.E() >= 180) && (paramzjf.E() < 270))) {
      for (m = 0; m < localArrayList3.size(); m++)
      {
        n = localArrayList3.size() - 1 - m;
        if ((paramzjf.E() >= 180) && (paramzjf.E() < 270)) {
          n = localArrayList3.size() - 1 - n;
        }
        if (paramzjf.K().p()) {
          n = localArrayList3.size() - 1 - n;
        }
        localzbfd = (zbfd)localArrayList3.get(n);
        i1 = localzbfd.ak();
        localzkh = localzbfd.F();
        for (i2 = 0; i2 < paramInt; i2++)
        {
          i3 = i2;
          if ((paramzjf.E() >= 180) && (paramzjf.E() < 270)) {
            i3 = paramInt - 1 - i3;
          }
          f5 = f3 * i3;
          f5 = paramzjf.S().e() + f5;
          if (k != 0) {
            f5 += f3 / 2.0F;
          }
          i4 = i3;
          if (localzbt2.p()) {
            i4 = paramInt - 1 - i3;
          }
          localzkf = localzkh.b(i4);
          if ((localzkf != null) && (!localzkf.a()))
          {
            d3 = localzbt1.i(localzkf.w());
            f6 = (float)((paramDouble - d3) / (d1 - d2) * paramzjf.S().i());
            if (localzbt1.p()) {
              f6 = -f6;
            }
            arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = localzkf;
            arrayOfObject1[1] = a(paramzr, paramzjf, paramFloat, f6, f5, f4, i1 + 1, localArrayList3.size());
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject1);
            i5 = 0;
            if ((paramzjf.E() >= 90) && (paramzjf.E() < 270)) {
              i5 = 1;
            }
            arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i1);
            arrayOfObject2[1] = Integer.valueOf(i4);
            arrayOfObject2[2] = ((com.aspose.cells.b.a.b.zo[])(com.aspose.cells.b.a.b.zo[])arrayOfObject1[1])[i5];
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList2, null);
          }
        }
        a(paramzr, paramzjf, localArrayList2);
        localArrayList2.clear();
      }
    } else if (((paramzjf.E() >= 90) && (paramzjf.E() < 180)) || ((paramzjf.E() >= 270) && (paramzjf.E() < 360))) {
      for (m = 0; m < localArrayList3.size(); m++)
      {
        n = m;
        if ((paramzjf.E() >= 270) && (paramzjf.E() < 360)) {
          n = localArrayList3.size() - 1 - n;
        }
        if (paramzjf.K().p()) {
          n = localArrayList3.size() - 1 - n;
        }
        localzbfd = (zbfd)localArrayList3.get(n);
        i1 = localzbfd.ak();
        localzkh = localzbfd.F();
        for (i2 = 0; i2 < paramInt; i2++)
        {
          i3 = i2;
          if ((paramzjf.E() >= 270) && (paramzjf.E() < 360)) {
            i3 = paramInt - 1 - i3;
          }
          f5 = f3 * i3;
          f5 = paramzjf.S().e() + f5;
          if (k != 0) {
            f5 += f3 / 2.0F;
          }
          i4 = i3;
          if (localzbt2.p()) {
            i4 = paramInt - 1 - i3;
          }
          localzkf = localzkh.b(i4);
          if ((localzkf != null) && (!localzkf.a()))
          {
            d3 = localzbt1.i(localzkf.w());
            f6 = (float)((paramDouble - d3) / (d1 - d2) * paramzjf.S().i());
            if (localzbt1.p()) {
              f6 = -f6;
            }
            arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = localzkf;
            arrayOfObject1[1] = a(paramzr, paramzjf, paramFloat, f6, f5, f4, i1 + 1, localArrayList3.size());
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject1);
            i5 = 0;
            if ((paramzjf.E() >= 90) && (paramzjf.E() < 270)) {
              i5 = 1;
            }
            arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i1);
            arrayOfObject2[1] = Integer.valueOf(i4);
            arrayOfObject2[2] = ((com.aspose.cells.b.a.b.zo[])(com.aspose.cells.b.a.b.zo[])arrayOfObject1[1])[i5];
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
        }
        a(paramzr, paramzjf, localArrayList2);
        localArrayList2.clear();
      }
    }
    return localArrayList1;
  }
  
  private static ArrayList d(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    zbt localzbt3 = paramzjf.K();
    float f1 = paramzjf.m() / 100.0F;
    float f2 = paramzjf.n() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    int j = localzbt2.j();
    int k = (int)localzbt2.D();
    int m = (int)localzbt2.z();
    int n = 0;
    int i1 = (localzbt2.f()) || (paramzjf.u()) ? 1 : 0;
    if (i1 != 0)
    {
      n = zbv.a(j, m, k, paramzjf.U()) + 1;
    }
    else
    {
      n = zbv.a(j, m, k, paramzjf.U());
      if (n == 0) {
        n = 1;
      }
    }
    float f3 = paramzjf.S().g() / n;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f4 = f3 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = localzbff.j();
    ArrayList localArrayList4 = ziz.a(paramzjf.z().c(), paramzjf.U());
    int i2 = localArrayList4.size();
    int i3;
    int i4;
    zbfd localzbfd;
    int i5;
    zkh localzkh;
    int i6;
    int i7;
    int i8;
    int i9;
    float f5;
    float f6;
    int i10;
    zkf localzkf;
    double d3;
    float f7;
    Object[] arrayOfObject1;
    int i11;
    Object[] arrayOfObject2;
    if (((paramzjf.E() >= 0) && (paramzjf.E() < 90)) || ((paramzjf.E() >= 180) && (paramzjf.E() < 270))) {
      for (i3 = 0; i3 < localArrayList3.size(); i3++)
      {
        i4 = localArrayList3.size() - 1 - i3;
        if ((paramzjf.E() >= 180) && (paramzjf.E() < 270)) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        if (localzbt3.p()) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        localzbfd = (zbfd)localArrayList3.get(i4);
        i5 = localzbfd.ak();
        localzkh = localzbfd.F();
        for (i6 = 0; i6 < i2; i6++)
        {
          i7 = i6;
          if ((paramzjf.E() >= 180) && (paramzjf.E() < 270)) {
            i7 = i2 - 1 - i7;
          }
          i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList4.get(i7)));
          i8 = zbv.a(j, i8, paramzjf.U());
          i9 = zbv.a(j, i8, (int)localzbt2.D(), paramzjf.U());
          f5 = f3 * i9;
          f6 = paramzjf.S().e() + f5;
          if (i1 != 0) {
            f6 += f3 / 2.0F;
          }
          i10 = i7;
          if (localzbt2.p()) {
            i10 = i2 - 1 - i7;
          }
          localzkf = localzkh.b(i10);
          if ((localzkf != null) && (!localzkf.a()))
          {
            d3 = localzbt1.i(localzkf.w());
            f7 = (float)((paramDouble - d3) / (d1 - d2) * paramzjf.S().i());
            if (localzbt1.p()) {
              f7 = -f7;
            }
            arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = localzkf;
            arrayOfObject1[1] = a(paramzr, paramzjf, paramFloat, f7, f6, f4, i5 + 1, localArrayList3.size());
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject1);
            i11 = 0;
            if ((paramzjf.E() >= 90) && (paramzjf.E() < 270)) {
              i11 = 1;
            }
            arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i5);
            arrayOfObject2[1] = Integer.valueOf(i10);
            arrayOfObject2[2] = ((com.aspose.cells.b.a.b.zo[])(com.aspose.cells.b.a.b.zo[])arrayOfObject1[1])[i11];
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
          else
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList2, null);
          }
        }
        a(paramzr, paramzjf, localArrayList2);
        localArrayList2.clear();
      }
    } else if (((paramzjf.E() >= 90) && (paramzjf.E() < 180)) || ((paramzjf.E() >= 270) && (paramzjf.E() < 360))) {
      for (i3 = 0; i3 < localArrayList3.size(); i3++)
      {
        i4 = i3;
        if ((paramzjf.E() >= 270) && (paramzjf.E() < 360)) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        if (localzbt3.p()) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        localzbfd = (zbfd)localArrayList3.get(i4);
        i5 = localzbfd.ak();
        localzkh = localzbfd.F();
        for (i6 = 0; i6 < i2; i6++)
        {
          i7 = i6;
          if ((paramzjf.E() >= 270) && (paramzjf.E() < 360)) {
            i7 = i2 - 1 - i7;
          }
          i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList4.get(i7)));
          i8 = zbv.a(j, i8, paramzjf.U());
          i9 = zbv.a(j, i8, (int)localzbt2.D(), paramzjf.U());
          f5 = f3 * i9;
          f6 = paramzjf.S().e() + f5;
          if (i1 != 0) {
            f6 += f3 / 2.0F;
          }
          i10 = i7;
          if (localzbt2.p()) {
            i10 = i2 - 1 - i7;
          }
          localzkf = localzkh.b(i10);
          if ((localzkf != null) && (!localzkf.a()))
          {
            d3 = localzbt1.i(localzkf.w());
            f7 = (float)((paramDouble - d3) / (d1 - d2) * paramzjf.S().i());
            if (localzbt1.p()) {
              f7 = -f7;
            }
            arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = localzkf;
            arrayOfObject1[1] = a(paramzr, paramzjf, paramFloat, f7, f6, f4, i5 + 1, localArrayList3.size());
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject1);
            i11 = 0;
            if ((paramzjf.E() >= 90) && (paramzjf.E() < 270)) {
              i11 = 1;
            }
            arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i5);
            arrayOfObject2[1] = Integer.valueOf(i10);
            arrayOfObject2[2] = ((com.aspose.cells.b.a.b.zo[])(com.aspose.cells.b.a.b.zo[])arrayOfObject1[1])[i11];
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
        }
        a(paramzr, paramzjf, localArrayList2);
        localArrayList2.clear();
      }
    }
    return localArrayList1;
  }
  
  private static void a(double paramDouble, Object[] paramArrayOfObject, ArrayList paramArrayList, zbt paramzbt)
  {
    zjf localzjf = paramzbt.e();
    int i = (int)(((Float)paramArrayOfObject[2]).floatValue() + ((Float)paramArrayOfObject[3]).floatValue() + 0.5D);
    if (paramArrayList.size() == 0) {
      com.aspose.cells.b.a.a.zf.a(paramArrayList, paramArrayOfObject);
    } else {
      for (int j = 0; j < paramArrayList.size(); j++)
      {
        Object[] arrayOfObject = (Object[])paramArrayList.get(j);
        int k = (int)(((Float)arrayOfObject[2]).floatValue() + ((Float)arrayOfObject[3]).floatValue() + 0.5D);
        if (localzjf.p() >= 0)
        {
          if (i > k)
          {
            paramArrayList.add(j, paramArrayOfObject);
            break;
          }
          if (i == k)
          {
            if (paramzbt.p())
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
            if (!paramzbt.p())
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
  
  private static com.aspose.cells.b.a.b.zo a(zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, boolean paramBoolean)
  {
    float f1 = paramFloat2 / 2.0F;
    float f3 = paramzjf.S().j();
    paramFloat1 += f1;
    com.aspose.cells.b.a.b.zo localzo = com.aspose.cells.b.a.b.zo.a();
    float f2;
    if (paramFloat1 <= f3)
    {
      f2 = 2.0F * (f3 - paramFloat1);
      localzo = a(paramzjf, paramFloat4 + paramFloat5, f2, paramFloat3, 0);
    }
    else
    {
      f2 = 2.0F * (paramFloat1 - f3);
      localzo = a(paramzjf, paramFloat4 + paramFloat5, f2, paramFloat3, 1);
    }
    float f4 = 2 * zra.a + 1;
    if (paramBoolean) {
      localzo.b(localzo.e() - f4);
    } else {
      localzo.b(localzo.e() + f4);
    }
    return localzo;
  }
  
  static com.aspose.cells.b.a.b.zo a(zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    int i = paramzjf.E() / 45;
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
    float f3 = paramzjf.S().j();
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
      return a(paramzjf, paramFloat4 + paramFloat5 / 2.0F, f2, paramFloat3, k);
    }
    float f2 = 2.0F * (paramFloat1 - f3);
    if (j == 0) {
      k = 1;
    } else {
      k = 2;
    }
    return a(paramzjf, paramFloat4 + paramFloat5 / 2.0F, f2, paramFloat3, k);
  }
  
  static void c(zr paramzr, zjf paramzjf, ArrayList paramArrayList)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      com.aspose.cells.b.a.b.zo localzo = (com.aspose.cells.b.a.b.zo)arrayOfObject[2];
      int m = 0;
      boolean bool = false;
      if (arrayOfObject.length == 4)
      {
        m = 1;
        bool = ((Boolean)arrayOfObject[3]).booleanValue();
      }
      zqy localzqy = localzbff.c(j).F().b(k).o();
      zt localzt = zra.a(paramzr, paramzjf.e(), localzbff, j, k, (int)paramzjf.S().g());
      float f1 = localzo.d() - localzt.b() / 2.0F;
      float f2 = localzo.e() - localzt.c() / 2.0F;
      if (m != 0) {
        if (bool) {
          f2 = localzo.e() - localzt.c();
        } else {
          f2 = localzo.e();
        }
      }
      localzqy.a().b = new com.aspose.cells.b.a.b.zp(zbxz.c(f1), zbxz.c(f2), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
      localzqy.a().z();
      zra.a(paramzr, paramzjf.e(), localzbff, j, k, localzqy.a().a);
    }
  }
  
  private static void a(zr paramzr, zkf paramzkf, zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, double paramDouble, double[] paramArrayOfDouble)
    throws Exception
  {
    zbfd localzbfd1 = paramzkf.g().a();
    double d1 = 1.0D;
    double d2 = 1.0D;
    double d3;
    double d4;
    double[] arrayOfDouble1;
    double[] arrayOfDouble2;
    switch (localzbfd1.I())
    {
    case 0: 
      a(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 1: 
      if (localzbfd1.ap())
      {
        zbff localzbff = paramzjf.z();
        ArrayList localArrayList = localzbff.j();
        zbfd localzbfd2 = (zbfd)localArrayList.get(0);
        int i = ziz.a(localArrayList);
        double d5 = 0.0D;
        if (i == 1) {
          d5 = paramzjf.F().D();
        } else if (i == 2) {
          d5 = paramzjf.F().z();
        }
        double d6 = 0.0D;
        double d7 = 0.0D;
        double[] arrayOfDouble3 = { d6 };
        double[] arrayOfDouble4 = { d7 };
        a(localzbfd1.aj(), paramzkf.I(), arrayOfDouble3, arrayOfDouble4);
        d6 = arrayOfDouble3[0];
        d7 = arrayOfDouble4[0];
        if (paramzkf.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else
        {
          double d8;
          if (paramzkf.w() > 0.0D)
          {
            d8 = paramzkf.w();
            if (localzbfd1 == localzbfd2) {
              d8 -= d5;
            }
            d1 = d6 == 0.0D ? 1.0D : (d6 - paramDouble) / (d6 - d5);
            d2 = d6 == 0.0D ? 1.0D : (d6 - (paramDouble - d8)) / (d6 - d5);
          }
          else
          {
            d8 = paramzkf.w();
            if (localzbfd1 == localzbfd2) {
              d8 -= d5;
            }
            d1 = d7 == 0.0D ? 1.0D : (d7 - paramDouble) / (d7 - d5);
            d2 = d7 == 0.0D ? 1.0D : (d7 - (paramDouble - d8)) / (d7 - d5);
          }
        }
      }
      else if (localzbfd1.as())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        a(localzbfd1.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzkf.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzkf.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzkf.w())) / d4;
        }
      }
      else
      {
        d1 = 0.0D;
      }
      a(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 2: 
      if (localzbfd1.ap())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        b(localzbfd1.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzkf.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzkf.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzkf.w())) / d4;
        }
      }
      else if (localzbfd1.as())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        a(localzbfd1.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzkf.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzkf.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzkf.w())) / d4;
        }
      }
      else
      {
        d1 = (float)b(paramzkf);
        d2 = 1.0D;
      }
      a(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 3: 
      b(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 4: 
      if ((localzbfd1.ap()) || (localzbfd1.as()))
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        a(localzbfd1.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzkf.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzkf.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzkf.w())) / d4;
        }
      }
      else
      {
        d1 = 0.0D;
      }
      b(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 5: 
      if (localzbfd1.ap())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        b(localzbfd1.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzkf.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzkf.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzkf.w())) / d4;
        }
      }
      else if (localzbfd1.as())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        a(localzbfd1.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() == 0.0D)
        {
          d1 = paramArrayOfDouble[0];
          d2 = paramArrayOfDouble[0];
        }
        else if (paramzkf.w() > 0.0D)
        {
          d1 = d3 == 0.0D ? 1.0D : (d3 - paramDouble) / d3;
          d2 = d3 == 0.0D ? 1.0D : (d3 - (paramDouble - paramzkf.w())) / d3;
        }
        else
        {
          d1 = d4 == 0.0D ? 1.0D : (d4 - paramDouble) / d4;
          d2 = d4 == 0.0D ? 1.0D : (d4 - (paramDouble - paramzkf.w())) / d4;
        }
      }
      else
      {
        d1 = (float)b(paramzkf);
        d2 = 1.0D;
      }
      b(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
    }
  }
  
  static com.aspose.cells.b.a.b.zo a(zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    com.aspose.cells.b.a.b.zo localzo = new com.aspose.cells.b.a.b.zo(paramzjf.S().e() + paramzjf.S().g() / 2.0F, paramFloat1);
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
    float f4 = f2 * (float)Math.sin(paramzjf.p() * 3.141592653589793D / 180.0D);
    com.aspose.cells.b.a.b.zo[] arrayOfzo = new com.aspose.cells.b.a.b.zo[4];
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
  
  static com.aspose.cells.b.a.b.zo[] a(zr paramzr, zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2)
  {
    float f1 = paramFloat4 * paramzjf.n() / 100.0F;
    com.aspose.cells.b.a.b.zo[] arrayOfzo = new com.aspose.cells.b.a.b.zo[2];
    zbxz.a(arrayOfzo);
    float f4 = paramzjf.S().j();
    zbt localzbt = paramzjf.K();
    float f5 = paramzjf.S().h() / paramInt2;
    float f6 = paramInt2 / 2.0F;
    if (localzbt.p()) {
      paramInt1 = paramInt2 + 1 - paramInt1;
    }
    float f3;
    float f2;
    if ((paramInt1 <= f6) && (!localzbt.p()))
    {
      f3 = ((f6 - paramInt1) * f5 + f1 / 2.0F + paramFloat4) * 2.0F;
      if (paramFloat3 <= f4)
      {
        f2 = 2.0F * (f4 - paramFloat3);
        arrayOfzo[0] = a(paramzjf, paramFloat1 + paramFloat2, f2, f3, 0);
        f3 -= paramFloat4 * 2.0F;
        arrayOfzo[1] = a(paramzjf, paramFloat1 + paramFloat2, f2, f3, 0);
      }
      else
      {
        f2 = 2.0F * (paramFloat3 - f4);
        arrayOfzo[0] = a(paramzjf, paramFloat1 + paramFloat2, f2, f3, 1);
        f3 -= paramFloat4 * 2.0F;
        arrayOfzo[1] = a(paramzjf, paramFloat1 + paramFloat2, f2, f3, 1);
      }
    }
    else
    {
      f3 = ((paramInt1 - f6) * f5 - f1 / 2.0F - paramFloat4) * 2.0F;
      if (paramFloat3 <= f4)
      {
        f2 = 2.0F * (f4 - paramFloat3);
        arrayOfzo[0] = a(paramzjf, paramFloat1 + paramFloat2, f2, f3, 3);
        f3 += paramFloat4 * 2.0F;
        arrayOfzo[1] = a(paramzjf, paramFloat1 + paramFloat2, f2, f3, 3);
      }
      else
      {
        f2 = 2.0F * (paramFloat3 - f4);
        arrayOfzo[0] = a(paramzjf, paramFloat1 + paramFloat2, f2, f3, 2);
        f3 += paramFloat4 * 2.0F;
        arrayOfzo[1] = a(paramzjf, paramFloat1 + paramFloat2, f2, f3, 2);
      }
    }
    return arrayOfzo;
  }
  
  private static void a(zr paramzr, zkf paramzkf, zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt1, int paramInt2)
    throws Exception
  {
    zbfd localzbfd = paramzkf.g().a();
    switch (localzbfd.I())
    {
    case 0: 
      a(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramInt1, paramInt2, 1.0F);
      break;
    case 3: 
      b(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramInt1, paramInt2, 1.0F);
      break;
    case 1: 
      a(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramInt1, paramInt2, 0.0F);
      break;
    case 4: 
      b(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramInt1, paramInt2, 0.0F);
    }
  }
  
  private static void a(zr paramzr, zkf paramzkf, zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt1, int paramInt2, float paramFloat6)
    throws Exception
  {
    float f1 = paramFloat5 * paramzjf.n() / 100.0F;
    com.aspose.cells.b.a.b.zo[] arrayOfzo = new com.aspose.cells.b.a.b.zo[8];
    zbxz.a(arrayOfzo);
    float f4 = paramzjf.S().j();
    zbt localzbt = paramzjf.K();
    float f5 = paramFloat3;
    float f6 = paramFloat3 + paramFloat4 * (1.0F - paramFloat6) / 2.0F;
    float f7 = paramzjf.S().h() / paramInt2;
    float f8 = paramInt2 / 2.0F;
    if (localzbt.p()) {
      paramInt1 = paramInt2 + 1 - paramInt1;
    }
    boolean bool = false;
    if ((paramInt1 <= f8) && (!localzbt.p())) {
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
    com.aspose.cells.b.a.b.zo localzo = com.aspose.cells.b.a.b.zo.a();
    for (int m = 0; m < 2; m++)
    {
      float f2;
      if (f5 <= f4)
      {
        f2 = 2.0F * (f4 - f5);
        arrayOfzo[m] = a(paramzjf, paramFloat1, f2, f3, i);
        if (bool) {
          f3 -= paramFloat5 * 2.0F;
        } else {
          f3 += paramFloat5 * 2.0F;
        }
        arrayOfzo[(m + k)] = a(paramzjf, paramFloat1, f2, f3, i);
      }
      else
      {
        f2 = 2.0F * (f5 - f4);
        arrayOfzo[m] = a(paramzjf, paramFloat1, f2, f3, j);
        if (bool) {
          f3 -= paramFloat5 * 2.0F;
        } else {
          f3 += paramFloat5 * 2.0F;
        }
        arrayOfzo[(m + k)] = a(paramzjf, paramFloat1, f2, f3, j);
      }
      f3 = ((paramInt1 - f8) * f7 - f1 / 2.0F - paramFloat5) * 2.0F;
      if (bool) {
        f3 = -f3;
      }
      if (f6 <= f4)
      {
        f2 = 2.0F * (f4 - f6);
        localzo = a(paramzjf, paramFloat1, f2, a(f3, bool, paramFloat5, paramFloat6), i);
        arrayOfzo[(m + 4)].a(localzo.d());
        arrayOfzo[(m + 4)].b(localzo.e() + paramFloat2);
        if (paramFloat6 == 1.0F) {
          if (bool) {
            f3 -= paramFloat5 * 2.0F;
          } else {
            f3 += paramFloat5 * 2.0F;
          }
        }
        localzo = a(paramzjf, paramFloat1, f2, a(f3, bool, paramFloat5, paramFloat6), i);
        arrayOfzo[(m + k + 4)].a(localzo.d());
        arrayOfzo[(m + k + 4)].b(localzo.e() + paramFloat2);
      }
      else
      {
        f2 = 2.0F * (f6 - f4);
        localzo = a(paramzjf, paramFloat1, f2, a(f3, bool, paramFloat5, paramFloat6), j);
        arrayOfzo[(m + 4)].a(localzo.d());
        arrayOfzo[(m + 4)].b(localzo.e() + paramFloat2);
        if (paramFloat6 == 1.0F) {
          if (bool) {
            f3 -= paramFloat5 * 2.0F;
          } else {
            f3 += paramFloat5 * 2.0F;
          }
        }
        localzo = a(paramzjf, paramFloat1, f2, a(f3, bool, paramFloat5, paramFloat6), j);
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
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new com.aspose.cells.b.a.b.zo(arrayOfzo[0].d(), arrayOfzo[0].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new com.aspose.cells.b.a.b.zo(arrayOfzo[1].d(), arrayOfzo[1].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new com.aspose.cells.b.a.b.zo(arrayOfzo[2].d(), arrayOfzo[2].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new com.aspose.cells.b.a.b.zo(arrayOfzo[3].d(), arrayOfzo[3].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new com.aspose.cells.b.a.b.zo(arrayOfzo[4].d(), arrayOfzo[4].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new com.aspose.cells.b.a.b.zo(arrayOfzo[5].d(), arrayOfzo[5].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new com.aspose.cells.b.a.b.zo(arrayOfzo[6].d(), arrayOfzo[6].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new com.aspose.cells.b.a.b.zo(arrayOfzo[7].d(), arrayOfzo[7].e()));
    a(paramzr, paramzjf, paramzkf, arrayOfzo, paramFloat2);
  }
  
  private static void b(zr paramzr, zkf paramzkf, zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt1, int paramInt2, float paramFloat6)
    throws Exception
  {
    float f2 = paramzjf.S().j();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    float f3 = paramFloat3 + paramFloat4 / 2.0F;
    float f4 = paramFloat5 * paramzjf.n() / 100.0F;
    zbt localzbt = paramzjf.K();
    float f6 = paramzjf.S().h() / paramInt2;
    float f7 = paramInt2 / 2.0F;
    if (localzbt.p()) {
      paramInt1 = paramInt2 + 1 - paramInt1;
    }
    boolean bool = false;
    if ((paramInt1 <= f7) && (!localzbt.p())) {
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
          localHashMap1.put(Integer.valueOf(360 - k), a(paramzjf, paramFloat1, f1, a(360 - k, bool, f5, f8), i));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(k))) {
          localHashMap1.put(Integer.valueOf(k), a(paramzjf, paramFloat1, f1, a(k, bool, f5, f8), i));
        }
      }
      else
      {
        f1 = 2.0F * (f9 - f2);
        if (!localHashMap1.containsKey(Integer.valueOf(360 - k))) {
          localHashMap1.put(Integer.valueOf(360 - k), a(paramzjf, paramFloat1, f1, a(360 - k, bool, f5, f8), j));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(k))) {
          localHashMap1.put(Integer.valueOf(k), a(paramzjf, paramFloat1, f1, a(k, bool, f5, f8), j));
        }
      }
      f9 = (float)(f3 + paramFloat4 / 2.0F * paramFloat6 * Math.cos(d));
      f8 = (float)(paramFloat5 * paramFloat6 * Math.sin(d));
      com.aspose.cells.b.a.b.zo localzo;
      if (f9 <= f2)
      {
        f1 = 2.0F * (f2 - f9);
        if (!localHashMap2.containsKey(Integer.valueOf(360 - k)))
        {
          localzo = a(paramzjf, paramFloat1, f1, a(360 - k, bool, f5, f8), i);
          localzo.b(localzo.e() + paramFloat2);
          localHashMap2.put(Integer.valueOf(360 - k), localzo);
        }
        if (!localHashMap2.containsKey(Integer.valueOf(k)))
        {
          localzo = a(paramzjf, paramFloat1, f1, a(k, bool, f5, f8), i);
          localzo.b(localzo.e() + paramFloat2);
          localHashMap2.put(Integer.valueOf(k), localzo);
        }
      }
      else
      {
        f1 = 2.0F * (f9 - f2);
        if (!localHashMap2.containsKey(Integer.valueOf(360 - k)))
        {
          localzo = a(paramzjf, paramFloat1, f1, a(360 - k, bool, f5, f8), j);
          localzo.b(localzo.e() + paramFloat2);
          localHashMap2.put(Integer.valueOf(360 - k), localzo);
        }
        if (!localHashMap2.containsKey(Integer.valueOf(k)))
        {
          localzo = a(paramzjf, paramFloat1, f1, a(k, bool, f5, f8), j);
          localzo.b(localzo.e() + paramFloat2);
          localHashMap2.put(Integer.valueOf(k), localzo);
        }
      }
    }
    for (k = 0; k < 360; k++)
    {
      com.aspose.cells.b.a.a.zf.a(paramzkf.c, localHashMap1.get(Integer.valueOf(k)));
      com.aspose.cells.b.a.a.zf.a(paramzkf.b, localHashMap2.get(Integer.valueOf(k)));
    }
    if (paramzkf.i().h() == 4)
    {
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat2, 180, 360, 0);
    }
    else
    {
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat2, 175, 365, 1);
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat2, 176, 364, 2);
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat2, 177, 363, 3);
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat2, 178, 362, 4);
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat2, 179, 361, 5);
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat2, 180, 360, 0);
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
  
  private static void a(zr paramzr, zjf paramzjf, List paramList)
    throws Exception
  {
    Object localObject2;
    com.aspose.cells.b.a.b.zo[] arrayOfzo;
    int k;
    for (int i = 0; i < paramList.size(); i++) {
      if (paramList.get(i) != null)
      {
        Object[] arrayOfObject1 = (Object[])paramList.get(i);
        localObject2 = (zkf)arrayOfObject1[0];
        if (localObject2 != null)
        {
          arrayOfzo = (com.aspose.cells.b.a.b.zo[])arrayOfObject1[1];
          for (k = 0; k < arrayOfzo.length; k++) {
            com.aspose.cells.b.a.a.zf.a(((zkf)localObject2).b, arrayOfzo[k]);
          }
        }
      }
    }
    if (paramList.size() > 1)
    {
      Object localObject1 = null;
      for (int j = 0; j < paramList.size(); j++) {
        if (paramList.get(j) != null)
        {
          localObject2 = (Object[])paramList.get(j);
          localObject1 = (com.aspose.cells.b.a.b.zo[])localObject2[1];
          j++;
          break;
        }
      }
      for (k = j; k < paramList.size(); k++) {
        if (paramList.get(k) != null)
        {
          Object[] arrayOfObject2 = (Object[])paramList.get(k);
          localObject2 = (zkf)arrayOfObject2[0];
          arrayOfzo = (com.aspose.cells.b.a.b.zo[])arrayOfObject2[1];
          a(paramzr, paramzjf, (zkf)localObject2, (com.aspose.cells.b.a.b.zo[])localObject1, arrayOfzo);
          localObject1 = arrayOfzo;
        }
        else
        {
          localObject1 = null;
        }
      }
    }
  }
  
  private static void a(zr paramzr, zjf paramzjf, zkf paramzkf, com.aspose.cells.b.a.b.zo[] paramArrayOfzo1, com.aspose.cells.b.a.b.zo[] paramArrayOfzo2)
    throws Exception
  {
    if ((paramArrayOfzo1 == null) || (paramArrayOfzo2 == null) || (paramzkf == null)) {
      return;
    }
    zaz localzaz = paramzkf.i();
    ze localze = new ze();
    localze.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo1[0], paramArrayOfzo2[0], paramArrayOfzo2[1], paramArrayOfzo1[1] });
    com.aspose.cells.b.a.b.zc localzc = localzaz.b(localze);
    if ((paramzjf.E() == 0) || (paramzjf.E() == 360) || (paramzjf.E() == 180))
    {
      if (paramArrayOfzo2[1].e() > paramArrayOfzo2[0].e())
      {
        if ((paramzjf.E() == 0) || (paramzjf.E() == 360)) {
          localzc = localzaz.b(localze, 0.6666667F);
        } else {
          localzc = localzaz.b(localze);
        }
      }
      else if ((paramzjf.E() == 0) || (paramzjf.E() == 360)) {
        localzc = localzaz.b(localze);
      } else {
        localzc = localzaz.b(localze, 0.6666667F);
      }
    }
    else if ((paramzjf.E() == 90) || (paramzjf.E() == 270))
    {
      if (paramArrayOfzo2[0].e() > paramArrayOfzo1[0].e()) {
        localzc = localzaz.b(localze);
      } else {
        localzc = localzaz.b(localze, 0.6666667F);
      }
    }
    else if ((paramArrayOfzo1[1].d() != paramArrayOfzo2[1].d()) && (paramArrayOfzo1[1].e() != paramArrayOfzo2[1].e()))
    {
      float f1 = 0.0F;
      float f2 = (f1 - paramArrayOfzo1[1].e() - (f1 - paramArrayOfzo2[1].e())) / (paramArrayOfzo1[1].d() - paramArrayOfzo2[1].d());
      float f3 = f1 - paramArrayOfzo2[1].e() - f2 * paramArrayOfzo2[1].d();
      float f4 = f1 - paramArrayOfzo2[0].e();
      float f5 = f2 * paramArrayOfzo2[0].d() + f3;
      if (((paramzjf.E() > 0) && (paramzjf.E() < 90)) || ((paramzjf.E() > 270) && (paramzjf.E() < 360)))
      {
        if (f4 > f5) {
          localzc = localzaz.b(localze, 0.6666667F);
        } else {
          localzc = localzaz.b(localze);
        }
      }
      else if ((paramzjf.E() > 90) && (paramzjf.E() < 270)) {
        if (f4 < f5) {
          localzc = localzaz.b(localze, 0.6666667F);
        } else {
          localzc = localzaz.b(localze);
        }
      }
    }
    paramzr.a(localzc, localze);
    com.aspose.cells.a.d.zs localzs = paramzkf.k().b(localze);
    paramzr.a(localzs, paramArrayOfzo1[0], paramArrayOfzo2[0]);
    paramzr.a(localzs, paramArrayOfzo2[0], paramArrayOfzo2[1]);
    paramzr.a(localzs, paramArrayOfzo2[1], paramArrayOfzo1[1]);
    paramzr.a(localzs, paramArrayOfzo1[1], paramArrayOfzo1[0]);
    localzc.h();
    localzs.dispose();
  }
  
  private static com.aspose.cells.b.a.b.zo a(zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramzjf.E() / 45;
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
    float f3 = paramzjf.S().j();
    paramFloat3 += f1;
    zbt localzbt = paramzjf.K();
    float f6 = paramFloat5 * paramzjf.n() / 100.0F;
    float f7 = paramzjf.S().h() / paramInt2;
    float f8 = paramInt2 / 2.0F;
    if (localzbt.p()) {
      paramInt1 = paramInt2 + 1 - paramInt1;
    }
    float f5;
    float f4;
    com.aspose.cells.b.a.b.zo localzo;
    if ((paramInt1 <= f8) && (!localzbt.p()))
    {
      f5 = ((f8 - paramInt1) * f7 + f6 / 2.0F + paramFloat5 - f2) * 2.0F;
      if (paramFloat3 <= f3)
      {
        f4 = 2.0F * (f3 - paramFloat3);
        localzo = a(paramzjf, paramFloat1 + paramFloat2, f4, f5, 0);
      }
      else
      {
        f4 = 2.0F * (paramFloat3 - f3);
        localzo = a(paramzjf, paramFloat1 + paramFloat2, f4, f5, 1);
      }
    }
    else
    {
      f5 = ((paramInt1 - f8) * f7 - f6 / 2.0F - paramFloat5 + f2) * 2.0F;
      if (paramFloat3 <= f3)
      {
        f4 = 2.0F * (f3 - paramFloat3);
        localzo = a(paramzjf, paramFloat1 + paramFloat2, f4, f5, 3);
      }
      else
      {
        f4 = 2.0F * (paramFloat3 - f3);
        localzo = a(paramzjf, paramFloat1 + paramFloat2, f4, f5, 2);
      }
    }
    float f9 = 2 * zra.a + 1;
    if (paramBoolean) {
      localzo.b(localzo.e() - f9);
    } else {
      localzo.b(localzo.e() + f9);
    }
    return localzo;
  }
  
  static double b(zkf paramzkf)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    zbt localzbt = paramzkf.h().G();
    double d3 = localzbt.X();
    zbff localzbff = paramzkf.h().z();
    int i = localzbff.h();
    for (int j = 0; j < paramzkf.g().getCount(); j++) {
      for (int k = 0; k < localzbff.getCount(); k++)
      {
        zkf localzkf = localzbff.c(k).F().b(j);
        if (localzkf != null)
        {
          double d5 = localzkf.w();
          if ((d5 > d3) && (d1 < d5 - d3)) {
            d1 = d5 - d3;
          }
          if ((d5 < d3) && (d2 < d3 - d5)) {
            d2 = d3 - d5;
          }
        }
      }
    }
    double d4 = localzbt.i(paramzkf.w());
    if (paramzkf.w() >= d3) {
      return d1 == 0.0D ? 1.0D : (d1 - (d4 - d3)) / d1;
    }
    return d2 == 0.0D ? 1.0D : (d2 - (d3 - d4)) / d2;
  }
  
  static void a(zbff paramzbff, int paramInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    for (int i = 0; i < paramzbff.getCount(); i++)
    {
      zbfd localzbfd = paramzbff.c(i);
      double d = localzbfd.F().a(paramInt).w();
      if (d > 0.0D) {
        paramArrayOfDouble1[0] += d;
      }
      if (d < 0.0D) {
        paramArrayOfDouble2[0] += d;
      }
    }
  }
  
  static void b(zbff paramzbff, int paramInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    int i = paramzbff.h();
    for (int j = 0; j < i; j++)
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      double[] arrayOfDouble1 = { d1 };
      double[] arrayOfDouble2 = { d2 };
      a(paramzbff, j, arrayOfDouble1, arrayOfDouble2);
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
  
  private static void a(zr paramzr, zkf paramzkf, zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
    throws Exception
  {
    float f1 = paramFloat1;
    com.aspose.cells.b.a.b.zo[] arrayOfzo = new com.aspose.cells.b.a.b.zo[8];
    zbxz.a(arrayOfzo);
    float f3 = paramzjf.S().j();
    zbfd localzbfd = paramzkf.g().a();
    int i = 3;
    com.aspose.cells.b.a.b.zo localzo = com.aspose.cells.b.a.b.zo.a();
    float f4 = paramFloat1 + paramFloat2 * (1.0F - paramFloat6) / 2.0F;
    float f5 = paramFloat1 + paramFloat2 * (1.0F - paramFloat7) / 2.0F;
    for (int j = 0; j < 2; j++)
    {
      float f2;
      if (f5 <= f3)
      {
        f2 = 2.0F * (f3 - f5);
        arrayOfzo[j] = a(paramzjf, paramFloat4, f2, paramFloat3 * paramFloat7, 0);
        arrayOfzo[(j + i)] = a(paramzjf, paramFloat4, f2, paramFloat3 * paramFloat7, 3);
      }
      else
      {
        f2 = 2.0F * (f5 - f3);
        arrayOfzo[j] = a(paramzjf, paramFloat4, f2, paramFloat3 * paramFloat7, 1);
        arrayOfzo[(j + i)] = a(paramzjf, paramFloat4, f2, paramFloat3 * paramFloat7, 2);
      }
      if (f4 <= f3)
      {
        f2 = 2.0F * (f3 - f4);
        localzo = a(paramzjf, paramFloat4, f2, paramFloat3 * paramFloat6, 0);
        arrayOfzo[(j + 4)].a(localzo.d());
        arrayOfzo[(j + 4)].b(localzo.e() + paramFloat5);
        localzo = a(paramzjf, paramFloat4, f2, paramFloat3 * paramFloat6, 3);
        arrayOfzo[(j + i + 4)].a(localzo.d());
        arrayOfzo[(j + i + 4)].b(localzo.e() + paramFloat5);
      }
      else
      {
        f2 = 2.0F * (f4 - f3);
        localzo = a(paramzjf, paramFloat4, f2, paramFloat3 * paramFloat6, 1);
        arrayOfzo[(j + 4)].a(localzo.d());
        arrayOfzo[(j + 4)].b(localzo.e() + paramFloat5);
        localzo = a(paramzjf, paramFloat4, f2, paramFloat3 * paramFloat6, 2);
        arrayOfzo[(j + i + 4)].a(localzo.d());
        arrayOfzo[(j + i + 4)].b(localzo.e() + paramFloat5);
      }
      i = 1;
      f5 += paramFloat2 * paramFloat7;
      f4 += paramFloat2 * paramFloat6;
    }
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new com.aspose.cells.b.a.b.zo(arrayOfzo[0].d(), arrayOfzo[0].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new com.aspose.cells.b.a.b.zo(arrayOfzo[1].d(), arrayOfzo[1].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new com.aspose.cells.b.a.b.zo(arrayOfzo[2].d(), arrayOfzo[2].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new com.aspose.cells.b.a.b.zo(arrayOfzo[3].d(), arrayOfzo[3].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new com.aspose.cells.b.a.b.zo(arrayOfzo[4].d(), arrayOfzo[4].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new com.aspose.cells.b.a.b.zo(arrayOfzo[5].d(), arrayOfzo[5].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new com.aspose.cells.b.a.b.zo(arrayOfzo[6].d(), arrayOfzo[6].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new com.aspose.cells.b.a.b.zo(arrayOfzo[7].d(), arrayOfzo[7].e()));
    a(paramzr, paramzjf, paramzkf, arrayOfzo, paramFloat5);
  }
  
  private static void a(zr paramzr, zjf paramzjf, zkf paramzkf, com.aspose.cells.b.a.b.zo[] paramArrayOfzo, float paramFloat)
    throws Exception
  {
    zaz localzaz = paramzkf.i();
    ze localze1 = new ze();
    localze1.b(paramArrayOfzo);
    com.aspose.cells.a.d.zs localzs = paramzkf.k().b(localze1);
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
    ze localze2;
    if (paramFloat != 0.0F)
    {
      com.aspose.cells.b.a.b.zc localzc1;
      Object localObject1;
      com.aspose.cells.b.a.b.zc localzc2;
      if ((paramzjf.E() <= 45) || (paramzjf.E() == 360))
      {
        localze2 = new ze();
        localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[5], paramArrayOfzo[4] });
        localzc1 = localzaz.b(localze2);
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
        paramzr.a(localzc1, localze2);
        localzc1.h();
        localObject1 = new ze();
        ((ze)localObject1).b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
        localzc2 = localzaz.b((ze)localObject1, 0.5F);
        paramzr.a(localzc2, (ze)localObject1);
        localzc2.h();
        if (localzs.c().getA() != 0)
        {
          paramzr.a(localzs, localze2);
          paramzr.a(localzs, (ze)localObject1);
        }
      }
      else if ((paramzjf.E() > 45) && (paramzjf.E() <= 90))
      {
        localze2 = new ze();
        localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
        localzc1 = localzaz.b(localze2);
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
        paramzr.a(localzc1, localze2);
        localzc1.h();
        localObject1 = new ze();
        ((ze)localObject1).b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[5], paramArrayOfzo[4] });
        localzc2 = localzaz.b((ze)localObject1, 0.5F);
        paramzr.a(localzc2, (ze)localObject1);
        localzc2.h();
        if (localzs.c().getA() != 0)
        {
          paramzr.a(localzs, localze2);
          paramzr.a(localzs, (ze)localObject1);
        }
      }
      else if ((paramzjf.E() > 90) && (paramzjf.E() <= 135))
      {
        localze2 = new ze();
        localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
        localzc1 = localzaz.b(localze2);
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
        paramzr.a(localzc1, localze2);
        localzc1.h();
        localObject1 = new ze();
        ((ze)localObject1).b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[2], paramArrayOfzo[3], paramArrayOfzo[7], paramArrayOfzo[6] });
        localzc2 = localzaz.b((ze)localObject1, 0.5F);
        paramzr.a(localzc2, (ze)localObject1);
        localzc2.h();
        if (localzs.c().getA() != 0)
        {
          paramzr.a(localzs, localze2);
          paramzr.a(localzs, (ze)localObject1);
        }
      }
      else if ((paramzjf.E() > 135) && (paramzjf.E() <= 180))
      {
        localze2 = new ze();
        localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[2], paramArrayOfzo[3], paramArrayOfzo[7], paramArrayOfzo[6] });
        localzc1 = localzaz.b(localze2);
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
        paramzr.a(localzc1, localze2);
        localzc1.h();
        localObject1 = new ze();
        ((ze)localObject1).b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
        localzc2 = localzaz.b((ze)localObject1, 0.5F);
        paramzr.a(localzc2, (ze)localObject1);
        localzc2.h();
        if (localzs.c().getA() != 0)
        {
          paramzr.a(localzs, localze2);
          paramzr.a(localzs, (ze)localObject1);
        }
      }
      else if ((paramzjf.E() > 180) && (paramzjf.E() <= 225))
      {
        localze2 = new ze();
        localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[2], paramArrayOfzo[3], paramArrayOfzo[7], paramArrayOfzo[6] });
        localzc1 = localzaz.b(localze2);
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
        paramzr.a(localzc1, localze2);
        localzc1.h();
        localObject1 = new ze();
        ((ze)localObject1).b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[3], paramArrayOfzo[0], paramArrayOfzo[4], paramArrayOfzo[7] });
        localzc2 = localzaz.b((ze)localObject1, 0.5F);
        paramzr.a(localzc2, (ze)localObject1);
        localzc2.h();
        if (localzs.c().getA() != 0)
        {
          paramzr.a(localzs, localze2);
          paramzr.a(localzs, (ze)localObject1);
        }
      }
      else if ((paramzjf.E() > 225) && (paramzjf.E() <= 270))
      {
        localze2 = new ze();
        localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[3], paramArrayOfzo[0], paramArrayOfzo[4], paramArrayOfzo[7] });
        localzc1 = localzaz.b(localze2);
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
        paramzr.a(localzc1, localze2);
        localzc1.h();
        localObject1 = new ze();
        ((ze)localObject1).b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[2], paramArrayOfzo[3], paramArrayOfzo[7], paramArrayOfzo[6] });
        localzc2 = localzaz.b((ze)localObject1, 0.5F);
        paramzr.a(localzc2, (ze)localObject1);
        localzc2.h();
        if (localzs.c().getA() != 0)
        {
          paramzr.a(localzs, localze2);
          paramzr.a(localzs, (ze)localObject1);
        }
      }
      else if ((paramzjf.E() > 270) && (paramzjf.E() <= 315))
      {
        localze2 = new ze();
        localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[3], paramArrayOfzo[0], paramArrayOfzo[4], paramArrayOfzo[7] });
        localzc1 = localzaz.b(localze2);
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
        paramzr.a(localzc1, localze2);
        localzc1.h();
        localObject1 = new ze();
        ((ze)localObject1).b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[5], paramArrayOfzo[4] });
        localzc2 = localzaz.b((ze)localObject1, 0.5F);
        paramzr.a(localzc2, (ze)localObject1);
        localzc2.h();
        if (localzs.c().getA() != 0)
        {
          paramzr.a(localzs, localze2);
          paramzr.a(localzs, (ze)localObject1);
        }
      }
      else if ((paramzjf.E() > 315) && (paramzjf.E() < 360))
      {
        localze2 = new ze();
        localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[5], paramArrayOfzo[4] });
        localzc1 = localzaz.b(localze2);
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
        paramzr.a(localzc1, localze2);
        localzc1.h();
        localObject1 = new ze();
        ((ze)localObject1).b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[3], paramArrayOfzo[0], paramArrayOfzo[4], paramArrayOfzo[7] });
        localzc2 = localzaz.b((ze)localObject1, 0.5F);
        paramzr.a(localzc2, (ze)localObject1);
        localzc2.h();
        if (localzs.c().getA() != 0)
        {
          paramzr.a(localzs, localze2);
          paramzr.a(localzs, (ze)localObject1);
        }
      }
      if (paramzjf.p() > 0)
      {
        if (paramFloat <= 0.0F)
        {
          localze2 = new ze();
          localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
          localzaz.a(localze2, 0.6666667F);
          paramzkf.k().a(localze2);
        }
        else
        {
          localze2 = new ze();
          localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
          localzaz.a(localze2, 0.6666667F);
          paramzkf.k().a(localze2);
        }
      }
      else if (paramzjf.p() < 0) {
        if (paramFloat <= 0.0F)
        {
          localze2 = new ze();
          localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
          localzaz.a(localze2, 0.33333334F);
          paramzkf.k().a(localze2);
        }
        else
        {
          localze2 = new ze();
          localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
          localzaz.a(localze2, 0.33333334F);
          paramzkf.k().a(localze2);
        }
      }
    }
    else
    {
      localze2 = new ze();
      localze2.b(new com.aspose.cells.b.a.b.zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
      if (paramzjf.p() > 0) {
        localzaz.a(localze2, 0.6666667F);
      } else {
        localzaz.a(localze2, 0.33333334F);
      }
      paramzkf.k().a(localze2);
    }
    if (localzs != null) {
      localzs.dispose();
    }
  }
  
  private static void b(zr paramzr, zkf paramzkf, zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
    throws Exception
  {
    float f2 = paramzjf.S().j();
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
          localHashMap1.put(Integer.valueOf(360 - i), a(paramzjf, paramFloat4, f1, f4 * paramFloat7, 0));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(i))) {
          localHashMap1.put(Integer.valueOf(i), a(paramzjf, paramFloat4, f1, f4 * paramFloat7, 3));
        }
      }
      else
      {
        f1 = 2.0F * (f5 - f2);
        if (!localHashMap1.containsKey(Integer.valueOf(360 - i))) {
          localHashMap1.put(Integer.valueOf(360 - i), a(paramzjf, paramFloat4, f1, f4 * paramFloat7, 1));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(i))) {
          localHashMap1.put(Integer.valueOf(i), a(paramzjf, paramFloat4, f1, f4 * paramFloat7, 2));
        }
      }
      f5 = (float)(f3 + paramFloat2 * paramFloat6 / 2.0F * Math.cos(d));
      com.aspose.cells.b.a.b.zo localzo;
      if (f5 <= f2)
      {
        f1 = 2.0F * (f2 - f5);
        if (!localHashMap2.containsKey(Integer.valueOf(360 - i)))
        {
          localzo = a(paramzjf, paramFloat4, f1, f4 * paramFloat6, 0);
          localzo.b(localzo.e() + paramFloat5);
          localHashMap2.put(Integer.valueOf(360 - i), localzo);
        }
        if (!localHashMap2.containsKey(Integer.valueOf(i)))
        {
          localzo = a(paramzjf, paramFloat4, f1, f4 * paramFloat6, 3);
          localzo.b(localzo.e() + paramFloat5);
          localHashMap2.put(Integer.valueOf(i), localzo);
        }
      }
      else
      {
        f1 = 2.0F * (f5 - f2);
        if (!localHashMap2.containsKey(Integer.valueOf(360 - i)))
        {
          localzo = a(paramzjf, paramFloat4, f1, f4 * paramFloat6, 1);
          localzo.b(localzo.e() + paramFloat5);
          localHashMap2.put(Integer.valueOf(360 - i), localzo);
        }
        if (!localHashMap2.containsKey(Integer.valueOf(i)))
        {
          localzo = a(paramzjf, paramFloat4, f1, f4 * paramFloat6, 2);
          localzo.b(localzo.e() + paramFloat5);
          localHashMap2.put(Integer.valueOf(i), localzo);
        }
      }
    }
    for (i = 0; i < 360; i++)
    {
      com.aspose.cells.b.a.a.zf.a(paramzkf.c, localHashMap1.get(Integer.valueOf(i)));
      com.aspose.cells.b.a.a.zf.a(paramzkf.b, localHashMap2.get(Integer.valueOf(i)));
    }
    if (paramzkf.i().h() == 4)
    {
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat5, 180, 360, 0);
    }
    else
    {
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat5, 175, 365, 1);
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat5, 176, 364, 2);
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat5, 177, 363, 3);
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat5, 178, 362, 4);
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat5, 179, 361, 5);
      a(paramzr, paramzkf, localHashMap1, localHashMap2, paramFloat5, 180, 360, 0);
    }
  }
  
  private static void a(zr paramzr, zkf paramzkf, HashMap paramHashMap1, HashMap paramHashMap2, float paramFloat, int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    zjf localzjf = paramzkf.h();
    if (localzjf.ao()) {
      return;
    }
    zbfd localzbfd = paramzkf.g().a();
    zaz localzaz = paramzkf.i();
    int i = localzjf.E();
    Object localObject1 = null;
    Object localObject2 = null;
    int j = 0;
    int k = 0;
    com.aspose.cells.b.a.b.zo[] arrayOfzo1 = { localObject1 };
    com.aspose.cells.b.a.b.zo[] arrayOfzo2 = { localObject2 };
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
    com.aspose.cells.b.a.b.zo[] arrayOfzo3 = { localObject3 };
    com.aspose.cells.b.a.b.zo[] arrayOfzo4 = { localObject4 };
    int[] arrayOfInt3 = { m };
    int[] arrayOfInt4 = { n };
    a(paramHashMap2, arrayOfzo3, arrayOfzo4, arrayOfInt3, arrayOfInt4);
    localObject3 = arrayOfzo3[0];
    localObject4 = arrayOfzo4[0];
    m = arrayOfInt3[0];
    n = arrayOfInt4[0];
    if (paramFloat != 0.0F)
    {
      float f1 = 0.5F;
      float f2 = 7.56F;
      for (float f3 = paramInt1 + i; f3 <= paramInt2 + i; f3 += f2)
      {
        int i1 = (int)(f3 % 360.0F);
        Object localObject5 = (com.aspose.cells.b.a.b.zo)paramHashMap1.get(Integer.valueOf(i1));
        Object localObject6 = (com.aspose.cells.b.a.b.zo)paramHashMap2.get(Integer.valueOf(i1));
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
        Object localObject7 = (com.aspose.cells.b.a.b.zo)paramHashMap1.get(Integer.valueOf(i3));
        Object localObject8 = (com.aspose.cells.b.a.b.zo)paramHashMap2.get(Integer.valueOf(i3));
        if (f3 + f4 >= paramInt2 + i)
        {
          localObject7 = localObject1;
          localObject8 = localObject3;
        }
        ze localze5 = new ze();
        com.aspose.cells.b.a.b.zo[] arrayOfzo7 = new com.aspose.cells.b.a.b.zo[(int)f4 + 1];
        zbxz.a(arrayOfzo7);
        int i4 = 0;
        for (int i5 = (int)f3; i5 <= (int)f3 + (int)f4; i5++)
        {
          arrayOfzo7[i4] = ((com.aspose.cells.b.a.b.zo)paramHashMap1.get(Integer.valueOf(i5 % 360)));
          i4++;
        }
        localze5.a((com.aspose.cells.b.a.b.zo)localObject5, (com.aspose.cells.b.a.b.zo)localObject7);
        localze5.a((com.aspose.cells.b.a.b.zo)localObject7, (com.aspose.cells.b.a.b.zo)localObject8);
        com.aspose.cells.b.a.b.zo[] arrayOfzo8 = new com.aspose.cells.b.a.b.zo[(int)f4 + 1];
        zbxz.a(arrayOfzo8);
        i4 = 0;
        for (int i6 = (int)f3 + (int)f4; i6 >= (int)f3; i6--)
        {
          arrayOfzo8[i4] = ((com.aspose.cells.b.a.b.zo)paramHashMap2.get(Integer.valueOf(i6 % 360)));
          i4++;
        }
        localze5.a((com.aspose.cells.b.a.b.zo)localObject8, (com.aspose.cells.b.a.b.zo)localObject6);
        localze5.a((com.aspose.cells.b.a.b.zo)localObject6, (com.aspose.cells.b.a.b.zo)localObject5);
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
        localzaz.a(localze5, f1);
        f3 += f4 - f2;
      }
    }
    if (paramInt3 != 0) {
      return;
    }
    ze localze1 = new ze();
    ze localze2 = new ze();
    com.aspose.cells.b.a.b.zo[] arrayOfzo5 = new com.aspose.cells.b.a.b.zo[paramHashMap1.size()];
    com.aspose.cells.b.a.b.zo[] arrayOfzo6 = new com.aspose.cells.b.a.b.zo[paramHashMap1.size()];
    zbxz.a(arrayOfzo5);
    zbxz.a(arrayOfzo6);
    for (int i2 = 0; i2 <= 360; i2++)
    {
      arrayOfzo5[i2] = ((com.aspose.cells.b.a.b.zo)paramHashMap1.get(Integer.valueOf(i2)));
      arrayOfzo6[i2] = ((com.aspose.cells.b.a.b.zo)paramHashMap2.get(Integer.valueOf(i2)));
    }
    localze1.c(arrayOfzo5);
    localze2.c(arrayOfzo6);
    double d = paramzkf.k().g().a();
    if ((d > 1.0D) && (d < 2.0D)) {
      paramzkf.k().g().a(0.5D);
    }
    ze localze3;
    if (localzjf.p() > 0)
    {
      if (paramFloat < 0.0F)
      {
        localzaz.a(localze2, 0.7F);
        paramzkf.k().a(localze2);
        a(paramzr, paramzkf, j, k, paramHashMap1);
      }
      else if (paramFloat > 0.0F)
      {
        localzaz.a(localze1, 0.7F);
        paramzkf.k().a(localze1);
        a(paramzr, paramzkf, j, k, paramHashMap2);
      }
      else
      {
        localzaz.a(localze1, 0.7F);
        paramzkf.k().a(localze1);
      }
    }
    else if (localzjf.p() < 0)
    {
      if (paramFloat < 0.0F)
      {
        localzaz.a(localze1, 0.33333334F);
        paramzkf.k().a(localze1);
        a(paramzr, paramzkf, j, k, paramHashMap2);
      }
      else if (paramFloat > 0.0F)
      {
        localzaz.a(localze2, 0.33333334F);
        paramzkf.k().a(localze2);
        a(paramzr, paramzkf, j, k, paramHashMap1);
      }
      else
      {
        localzaz.a(localze1, 0.33333334F);
        paramzkf.k().a(localze1);
      }
    }
    else
    {
      localze3 = new ze();
      localze3.b(((com.aspose.cells.b.a.b.zo)localObject2).d(), ((com.aspose.cells.b.a.b.zo)localObject2).e(), ((com.aspose.cells.b.a.b.zo)localObject1).d(), ((com.aspose.cells.b.a.b.zo)localObject1).e());
      localze3.b(((com.aspose.cells.b.a.b.zo)localObject4).d(), ((com.aspose.cells.b.a.b.zo)localObject4).e(), ((com.aspose.cells.b.a.b.zo)localObject3).d(), ((com.aspose.cells.b.a.b.zo)localObject3).e());
      paramzkf.k().a(localze3);
    }
    if ((paramFloat != 0.0F) && (localzbfd.I() != 5) && (localzbfd.I() != 4))
    {
      localze3 = new ze();
      localze3.b(((com.aspose.cells.b.a.b.zo)localObject2).d(), ((com.aspose.cells.b.a.b.zo)localObject2).e(), ((com.aspose.cells.b.a.b.zo)localObject4).d(), ((com.aspose.cells.b.a.b.zo)localObject4).e());
      paramzkf.k().a(localze3);
      ze localze4 = new ze();
      localze4.b(((com.aspose.cells.b.a.b.zo)localObject1).d(), ((com.aspose.cells.b.a.b.zo)localObject1).e(), ((com.aspose.cells.b.a.b.zo)localObject3).d(), ((com.aspose.cells.b.a.b.zo)localObject3).e());
      paramzkf.k().a(localze4);
    }
    paramzkf.k().g().a(d);
  }
  
  private static void a(HashMap paramHashMap, com.aspose.cells.b.a.b.zo[] paramArrayOfzo1, com.aspose.cells.b.a.b.zo[] paramArrayOfzo2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    paramArrayOfzo1[0] = com.aspose.cells.b.a.b.zo.a();
    paramArrayOfzo2[0] = com.aspose.cells.b.a.b.zo.a();
    paramArrayOfInt1[0] = 0;
    paramArrayOfInt2[0] = 0;
    com.aspose.cells.b.a.a.zc localzc = zg.a(paramHashMap);
    while (localzc.c())
    {
      com.aspose.cells.b.a.b.zo localzo = (com.aspose.cells.b.a.b.zo)localzc.b();
      if ((com.aspose.cells.b.a.b.zo.a(paramArrayOfzo1[0], com.aspose.cells.b.a.b.zo.a())) || (localzo.d() > paramArrayOfzo1[0].d()))
      {
        paramArrayOfzo1[0] = localzo;
        paramArrayOfInt1[0] = ((Integer)localzc.a()).intValue();
      }
      if ((com.aspose.cells.b.a.b.zo.a(paramArrayOfzo2[0], com.aspose.cells.b.a.b.zo.a())) || (localzo.d() < paramArrayOfzo2[0].d()))
      {
        paramArrayOfzo2[0] = localzo;
        paramArrayOfInt2[0] = ((Integer)localzc.a()).intValue();
      }
    }
  }
  
  static void a(zr paramzr, zkf paramzkf, int paramInt1, int paramInt2, HashMap paramHashMap)
  {
    if (paramInt2 > paramInt1) {
      paramInt1 += 360;
    }
    com.aspose.cells.b.a.b.zo[] arrayOfzo = new com.aspose.cells.b.a.b.zo[Math.abs(paramInt1 - paramInt2 + 1)];
    zbxz.a(arrayOfzo);
    int i = 0;
    for (int j = paramInt2; j <= paramInt1; j++)
    {
      arrayOfzo[i] = ((com.aspose.cells.b.a.b.zo)paramHashMap.get(Integer.valueOf(j % 360)));
      i++;
    }
    ze localze = new ze();
    localze.c(arrayOfzo);
    paramzkf.k().a(localze);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */