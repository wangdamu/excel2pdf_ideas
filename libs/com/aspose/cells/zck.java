package com.aspose.cells;

import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

final class zck
{
  static ArrayList a(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    int i = paramzbfd.ah();
    int j = 6;
    zbff localzbff = paramzjf.z();
    int k = localzbff.getCount();
    zbt localzbt2;
    zbt localzbt1;
    int m;
    if (i == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
      m = localzbff.b(1, 6);
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
      m = localzbff.b(2, 6);
    }
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzjf, paramzbfd, paramzp, paramFloat, paramDouble);
    }
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    double d3 = localzbt1.n() ? zbxz.e(localzbt1.x()) : localzbt1.x();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f1 = paramzbfd.M() / 100.0F;
    float f2 = paramzbfd.L() / 100.0F;
    ArrayList localArrayList = new ArrayList();
    int n = 0;
    if ((localzbt2.f()) || (paramzjf.u()))
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
    int i1 = localzbff.a(paramzbfd, i, new int[] { j });
    if (i1 == -1) {
      return new ArrayList();
    }
    int i2 = paramzbfd.ak();
    zkh localzkh = paramzbfd.F();
    for (int i3 = 0; i3 < localzkh.getCount(); i3++)
    {
      zkf localzkf = localzkh.b(i3);
      float f4 = (float)d4 / (m - f1 * (m - 1) + f2);
      float f5 = f4 * f1;
      float f6 = f4 * f2;
      f3 = i1 * (f4 - f5);
      float f7 = (float)d4 * i3 + f6 / 2.0F + f3;
      if ((!localzbt2.f()) && (!paramzjf.u())) {
        f7 -= (float)(d4 / 2.0D);
      }
      if (!localzbt2.p()) {
        f7 = paramzp.d() + paramzp.f() - f7 - f4;
      } else {
        f7 = paramzp.d() + f7;
      }
      if ((localzkf != null) && (!localzkf.a()))
      {
        double d5 = localzkf.w();
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
        zuc localzuc = paramzbfd.x();
        zo localzo = new zo(paramFloat, f7 + f4 / 2.0F);
        double d6 = 0.0D;
        double d7 = 0.0D;
        float f9 = 0.0F;
        float f10 = 0.0F;
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf.e()))
        {
          switch (localzuc.g())
          {
          case 1: 
            d6 = localzuc.c();
            d7 = d6;
            break;
          case 2: 
            d6 = localzuc.c() * d5 / 100.0D;
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
          f9 = (float)d6 / (float)(d1 - d2) * paramzp.e();
          f10 = (float)d7 / (float)(d1 - d2) * paramzp.e();
          if (!localzbt1.p()) {
            localzo.a(localzo.d() - f8);
          } else {
            localzo.a(localzo.d() + f8);
          }
        }
        localzuc.a(localzo, f9, f10);
        float f11 = paramFloat;
        if (localzbt1.p())
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
              a(paramzr, localzkf, localzq1, paramFloat, localzbt1, paramzp);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq2.f() + f8 / 2.0F < paramFloat) {
              bool = false;
            } else if (d5 != 0.0D) {
              bool = true;
            } else if (localzbt1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i2);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzq1;
            arrayOfObject[3] = Boolean.valueOf(bool);
            int i5 = 1;
            if (((d2 > 0.0D) && (d5 < d2)) || ((d1 < 0.0D) && (d5 > d1))) {
              i5 = 0;
            }
            if (i5 != 0) {
              com.aspose.cells.b.a.a.zf.a(localArrayList, arrayOfObject);
            }
          }
        }
      }
    }
    return localArrayList;
  }
  
  private static void a(zr paramzr, zkf paramzkf, zq paramzq, float paramFloat, zbt paramzbt, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    localzp.a(1, 1);
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(localzp);
    if ((paramzkf.i().h() != 0) || (paramzkf.k().h())) {
      paramzkf.a(new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i()));
    }
    zlr.a(paramzkf);
    if (paramzkf.i().h() != 0)
    {
      if ((paramzkf.i().j()) && (paramzkf.i().f().h() == 4))
      {
        paramzkf.i().f().e().b(true);
        paramzkf.i().f().e().j(paramzkf.w());
      }
      paramzkf.i().a(paramzq);
    }
    paramzkf.k().a(paramzq);
    paramzr.a(localzf);
  }
  
  static void a(zr paramzr, zjf paramzjf, com.aspose.cells.b.a.b.zp paramzp, ArrayList paramArrayList)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    zbff localzbff = paramzjf.z();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      zq localzq = (zq)arrayOfObject[2];
      boolean bool = ((Boolean)arrayOfObject[3]).booleanValue();
      zbfd localzbfd = localzbff.c(j);
      int m = localzbfd.ah();
      zbt localzbt;
      if (m == 1) {
        localzbt = paramzjf.e();
      } else {
        localzbt = paramzjf.g();
      }
      a(paramzr, localzbt, localzbff, j, k, localzq, bool, paramzp.e());
    }
  }
  
  private static void a(zr paramzr, zbt paramzbt, zbff paramzbff, int paramInt1, int paramInt2, zq paramzq, boolean paramBoolean, int paramInt3)
    throws Exception
  {
    zbfd localzbfd = paramzbff.c(paramInt1);
    zkf localzkf = paramzbff.c(paramInt1).F().b(paramInt2);
    zqy localzqy = localzkf.o();
    zt localzt = zra.a(paramzr, paramzbt, paramzbff, paramInt1, paramInt2, paramInt3);
    float f1 = 0.0F;
    float f2 = paramzq.g() + (paramzq.i() - localzt.c()) / 2.0F;
    int i = 0;
    int j = 0;
    int k = localzqy.j();
    if (k == 9) {
      k = zra.b(paramzbff.c(paramInt1).m());
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
      if (localzkf.w() <= paramzbt.ae().z()) {
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
    if (paramBoolean)
    {
      if (f1 - zra.a < paramzq.f()) {
        f1 += paramzq.f() - (f1 - zra.a);
      }
    }
    else if (f1 + zra.a + localzt.b() > paramzq.l()) {
      f1 -= f1 + zra.a + localzt.b() - paramzq.l();
    }
    localzqy.a().b = new com.aspose.cells.b.a.b.zp(zbxz.c(f1), zbxz.c(f2), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
    localzqy.a().f(paramBoolean);
    localzqy.a().z();
    int n = 0;
    zo localzo = new zo(localzqy.a().a.c() + localzqy.a().a.e(), localzqy.a().a.d() + localzqy.a().a.f());
    if ((m == 0) && ((localzo.d() < 0.0F) || (localzo.d() > paramzbt.e().a()) || (localzo.e() < 0.0F) || (localzo.e() > paramzbt.e().b()))) {
      n = 1;
    }
    if (n == 0) {
      zra.a(paramzr, paramzbt, paramzbff, paramInt1, paramInt2, localzqy.a().a);
    }
  }
  
  private static ArrayList a(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble)
    throws Exception
  {
    int i = paramzbfd.ah();
    int j = 6;
    int k = paramzjf.z().getCount();
    zbff localzbff = paramzjf.z();
    zbt localzbt2;
    zbt localzbt1;
    int m;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
      m = localzbff.b(1, 6);
      localArrayList1 = ziz.a(paramzjf.z().c(), paramzjf.U());
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
      m = localzbff.b(2, 6);
      localArrayList1 = ziz.a(paramzjf.z().d(), paramzjf.U());
    }
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    double d3 = localzbt1.n() ? zbxz.e(localzbt1.x()) : localzbt1.x();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f1 = paramzbfd.M() / 100.0F;
    float f2 = paramzbfd.L() / 100.0F;
    ArrayList localArrayList2 = new ArrayList();
    int n = localArrayList1.size();
    int i1 = localzbt2.j();
    int i2 = (int)localzbt2.D();
    int i3 = (int)localzbt2.z();
    int i4 = 0;
    if ((localzbt2.f()) || (paramzjf.u()))
    {
      i4 = zbv.a(i1, i3, i2, paramzjf.U()) + 1;
    }
    else
    {
      i4 = zbv.a(i1, i3, i2, paramzjf.U());
      if (i4 == 0) {
        i4 = 1;
      }
    }
    double d4 = paramzp.f() / i4;
    for (int i5 = 0; i5 < n; i5++)
    {
      zkf localzkf = paramzbfd.F().b(i5);
      float f3 = (float)(d4 / (m - f1 * (m - 1) + f2));
      float f4 = f3 * f1;
      float f5 = f3 * f2;
      int i6 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList1.get(i5)));
      i6 = zbv.a(i1, i6, paramzjf.U());
      int i7 = zbv.a(i1, i6, i2, paramzjf.U());
      float f6 = (float)(d4 * i7);
      if ((!localzbt2.f()) && (!paramzjf.u())) {
        f6 -= (float)(d4 / 2.0D);
      }
      float f7 = 0.0F;
      if (localzbt2.p()) {
        f7 = paramzp.d() + f6 + f5 / 2.0F;
      } else {
        f7 = paramzp.d() + paramzp.f() - f3 - f6 - f5 / 2.0F;
      }
      int i8 = localzbff.a(paramzbfd, i, new int[] { j });
      if (i8 == -1) {
        return new ArrayList();
      }
      int i9 = paramzbfd.ak();
      if (localzbt2.p()) {
        f7 += i8 * (f3 - f4);
      } else {
        f7 -= i8 * (f3 - f4);
      }
      if ((localzkf != null) && (!localzkf.a()))
      {
        double d5 = localzkf.w();
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
        zuc localzuc = paramzbfd.x();
        zo localzo = new zo(paramFloat, f7 + f3 / 2.0F);
        double d6 = 0.0D;
        double d7 = 0.0D;
        float f10 = 0.0F;
        float f11 = 0.0F;
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf.e()))
        {
          switch (localzuc.g())
          {
          case 1: 
            d6 = localzuc.c();
            d7 = d6;
            break;
          case 2: 
            d6 = localzuc.c() * d5 / 100.0D;
            d7 = -d6;
            break;
          case 0: 
            double d8 = localzuc.e().size() > i5 ? localzuc.a(localzuc.e().get(i5)) : 0.0D;
            d6 = d8;
            d8 = localzuc.f().size() > i5 ? localzuc.a(localzuc.f().get(i5)) : 0.0D;
            d7 = d8;
            break;
          case 4: 
            d6 = localzuc.a(paramzbfd.F(), n);
            d7 = d6;
          }
          f10 = (float)d6 / (float)(d1 - d2) * paramzp.e();
          f11 = (float)d7 / (float)(d1 - d2) * paramzp.e();
          if (!localzbt1.p()) {
            localzo.a(localzo.d() - f8);
          } else {
            localzo.a(localzo.d() + f8);
          }
        }
        localzuc.a(localzo, f10, f11);
        if (!localzbt1.p())
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
        zq localzq = new zq(f9, f7, f8, f3);
        if (localzq.g() < paramzp.d())
        {
          localzq.d(localzq.i() - (paramzp.d() - localzq.g()));
          localzq.b(paramzp.d());
        }
        if (localzq.m() > paramzp.j() + 1) {
          localzq.d(localzq.i() - (localzq.m() - paramzp.j()));
        }
        if ((localzq.l() >= paramzp.c()) && (localzq.j() <= paramzp.i()))
        {
          if (localzq.f() < paramzp.c())
          {
            localzq.c(localzq.h() - (paramzp.c() - localzq.f()));
            localzq.a(paramzp.c());
          }
          else if (localzq.l() > paramzp.i())
          {
            localzq.c(localzq.h() - (localzq.l() - paramzp.i()));
          }
          if (localzq.i() + 1.0F >= (f3 - 1.0F) / 3.0F)
          {
            if (i10 == 0) {
              a(paramzr, localzkf, localzq, paramFloat, localzbt1, paramzp);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq.f() < paramFloat) {
              bool = false;
            } else if (d5 != 0.0D) {
              bool = true;
            } else if (localzbt1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i9);
            arrayOfObject[1] = Integer.valueOf(i5);
            arrayOfObject[2] = localzq;
            arrayOfObject[3] = Boolean.valueOf(bool);
            int i11 = 1;
            if (((d2 > 0.0D) && (d5 < d2)) || ((d1 < 0.0D) && (d5 > d1))) {
              i11 = 0;
            }
            if (i11 != 0) {
              com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
            }
          }
        }
      }
    }
    return localArrayList2;
  }
  
  static ArrayList a(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
    throws Exception
  {
    int i = paramzbfd.ah();
    int j = 7;
    zbff localzbff = paramzjf.z();
    int k = localzbff.getCount();
    zbt localzbt2;
    zbt localzbt1;
    int m;
    if (i == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
      m = localzbff.b(1, j);
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
      m = localzbff.b(2, j);
    }
    float f1 = 0.0F;
    if (localzbt1.p()) {
      f1 = paramzp.c() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
    } else {
      f1 = paramzp.i() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
    }
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzjf, paramzbfd, paramzp, f1);
    }
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    float f2 = paramzbfd.M() / 100.0F;
    float f3 = paramzbfd.L() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    int n = 0;
    if ((localzbt2.f()) || (paramzjf.u()))
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
    List localList = localzbff.a(i, new int[] { j });
    int i1 = localzbff.a(paramzbfd, i, new int[] { j });
    if (i1 == -1) {
      return new ArrayList();
    }
    int i2 = paramzbfd.ak();
    zkh localzkh = paramzbfd.F();
    ArrayList localArrayList2 = new ArrayList();
    for (int i3 = 0; i3 < localzkh.getCount(); i3++)
    {
      zkf localzkf1 = localzkh.b(i3);
      float f5 = (float)d3 / (m - f2 * (m - 1) + f3);
      float f6 = f5 * f2;
      float f7 = f5 * f3;
      f4 = i1 * (f5 - f6);
      float f8 = (float)d3 * i3 + f7 / 2.0F + f4;
      if ((!localzbt2.f()) && (!paramzjf.u())) {
        f8 -= (float)(d3 / 2.0D);
      }
      if (!localzbt2.p()) {
        f8 = paramzp.d() + paramzp.f() - f8 - f5;
      } else {
        f8 = paramzp.d() + f8;
      }
      ArrayList localArrayList3 = new ArrayList();
      if (localzkf1 != null)
      {
        double d4 = localzkf1.w();
        double d5 = d4;
        int i4;
        zkf localzkf2;
        double d6;
        if (d4 >= 0.0D) {
          for (i4 = 0; i4 < i1; i4++)
          {
            localzkf2 = ((zbfd)localList.get(i4)).F().b(i3);
            if (localzkf2 != null)
            {
              d6 = localzkf2.w();
              if (d6 > 0.0D) {
                d5 += d6;
              }
            }
          }
        } else {
          for (i4 = 0; i4 < i1; i4++)
          {
            localzkf2 = ((zbfd)localList.get(i4)).F().b(i3);
            if (localzkf2 != null)
            {
              d6 = localzkf2.w();
              if (d6 <= 0.0D) {
                d5 += d6;
              }
            }
          }
        }
        float f9 = (float)(Math.abs(d4) / (localzbt1.z() - localzbt1.D()) * paramzp.e());
        float f10 = (float)(Math.abs(d5) / (localzbt1.z() - localzbt1.D()) * paramzp.e());
        int i5 = 0;
        if (f9 == 0.0F) {
          i5 = 1;
        }
        zuc localzuc = paramzbfd.x();
        zo localzo = new zo(f1, f8 + f5 / 2.0F);
        double d7 = 0.0D;
        double d8 = 0.0D;
        float f11 = 0.0F;
        float f12 = 0.0F;
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf1.e()))
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
            double d9 = localzuc.e().size() > i3 ? localzuc.a(localzuc.e().get(i3)) : 0.0D;
            d7 = d9;
            d9 = localzuc.f().size() > i3 ? localzuc.a(localzuc.f().get(i3)) : 0.0D;
            d8 = d9;
            break;
          case 4: 
            d7 = localzuc.a(paramzbfd.F(), localzkh.getCount());
            d8 = d7;
          }
          f11 = (float)d7 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
          f12 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
          if (!localzbt1.p())
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
        localzuc.a(localzo, f11, f12);
        if (!localzbt1.p())
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
        zq localzq = new zq(f10, f8, f9, f5);
        if (localzq.f() < paramzp.c())
        {
          localzq.c(localzq.h() - (paramzp.c() - localzq.f()));
          localzq.a(paramzp.c());
        }
        if (localzq.l() > paramzp.i() + 1) {
          localzq.c(localzq.h() - (localzq.l() - paramzp.i()));
        }
        if ((localzq.m() >= paramzp.d()) && (localzq.g() <= paramzp.j()))
        {
          if (localzq.g() < paramzp.d())
          {
            localzq.d(localzq.i() - (paramzp.d() - localzq.g()));
            localzq.b(paramzp.d());
          }
          else if (localzq.m() > paramzp.j())
          {
            localzq.d(localzq.i() - (localzq.m() - paramzp.j()));
          }
          if (localzq.i() + 1.0F >= (f5 - 1.0F) / 3.0F)
          {
            if (i5 == 0) {
              a(paramzr, localzkf1, localzq, f1, localzbt1, paramzp);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq.f() + localzq.h() / 2.0F < f1) {
              bool = false;
            } else if (d4 != 0.0D) {
              bool = true;
            } else if (localzbt1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i2);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzq;
            arrayOfObject[3] = Boolean.valueOf(bool);
            if (i5 == 0) {
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
            }
            if (paramzbfd.Z())
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, localzq);
              com.aspose.cells.b.a.a.zf.a(localArrayList3, Boolean.valueOf(bool));
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
      paramzbfd.aa().a(localzo1, localzo2);
    }
    if (paramArrayList.size() > 0) {
      paramArrayOfArrayList[0] = paramArrayList;
    }
  }
  
  private static ArrayList a(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat)
    throws Exception
  {
    int i = paramzbfd.ah();
    int j = 7;
    zbff localzbff = paramzjf.z();
    int k = localzbff.getCount();
    zbt localzbt2;
    zbt localzbt1;
    int m;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
      m = localzbff.b(1, j);
      localArrayList1 = ziz.a(paramzjf.z().c(), paramzjf.U());
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
      m = localzbff.b(2, j);
      localArrayList1 = ziz.a(paramzjf.z().d(), paramzjf.U());
    }
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    float f1 = paramzbfd.M() / 100.0F;
    float f2 = paramzbfd.L() / 100.0F;
    ArrayList localArrayList2 = new ArrayList();
    int n = localArrayList1.size();
    int i1 = localzbt2.j();
    int i2 = (int)localzbt2.D();
    int i3 = (int)localzbt2.z();
    int i4 = 0;
    if ((localzbt2.f()) || (paramzjf.u()))
    {
      i4 = zbv.a(i1, i3, i2, paramzjf.U()) + 1;
    }
    else
    {
      i4 = zbv.a(i1, i3, i2, paramzjf.U());
      if (i4 == 0) {
        i4 = 1;
      }
    }
    double d3 = paramzp.f() / i4;
    ArrayList localArrayList3 = new ArrayList();
    for (int i5 = 0; i5 < n; i5++)
    {
      zkf localzkf1 = paramzbfd.F().b(i5);
      float f3 = (float)(d3 / (m - f1 * (m - 1) + f2));
      float f4 = f3 * f1;
      float f5 = f3 * f2;
      int i6 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList1.get(i5)));
      i6 = zbv.a(i1, i6, paramzjf.U());
      int i7 = zbv.a(i1, i6, i2, paramzjf.U());
      float f6 = (float)(d3 * i7);
      if ((!localzbt2.f()) && (!paramzjf.u())) {
        f6 -= (float)(d3 / 2.0D);
      }
      float f7 = 0.0F;
      if (localzbt2.p()) {
        f7 = paramzp.d() + f6 + f5 / 2.0F;
      } else {
        f7 = paramzp.d() + paramzp.f() - f3 - f6 - f5 / 2.0F;
      }
      List localList = localzbff.a(i, new int[] { j });
      int i8 = localzbff.a(paramzbfd, i, new int[] { j });
      if (i8 == -1) {
        return new ArrayList();
      }
      int i9 = paramzbfd.ak();
      if (localzbt2.p()) {
        f7 += i8 * (f3 - f4);
      } else {
        f7 -= i8 * (f3 - f4);
      }
      ArrayList localArrayList4 = new ArrayList();
      if (localzkf1 != null)
      {
        double d4 = localzkf1.w();
        double d5 = d4;
        int i10;
        zkf localzkf2;
        double d6;
        if (d4 >= 0.0D) {
          for (i10 = 0; i10 < i8; i10++)
          {
            localzkf2 = ((zbfd)localList.get(i10)).F().b(i5);
            if (localzkf2 != null)
            {
              d6 = localzkf2.w();
              if (d6 > 0.0D) {
                d5 += d6;
              }
            }
          }
        } else {
          for (i10 = 0; i10 < i8; i10++)
          {
            localzkf2 = ((zbfd)localList.get(i10)).F().b(i5);
            if (localzkf2 != null)
            {
              d6 = localzkf2.w();
              if (d6 <= 0.0D) {
                d5 += d6;
              }
            }
          }
        }
        float f8 = (float)(Math.abs(d4) / (localzbt1.z() - localzbt1.D()) * paramzp.e());
        float f9 = (float)(Math.abs(d5) / (localzbt1.z() - localzbt1.D()) * paramzp.e());
        int i11 = 0;
        if (f8 == 0.0F) {
          i11 = 1;
        }
        zuc localzuc = paramzbfd.x();
        zo localzo = new zo(paramFloat, f7 + f3 / 2.0F);
        double d7 = 0.0D;
        double d8 = 0.0D;
        float f10 = 0.0F;
        float f11 = 0.0F;
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf1.e()))
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
            double d9 = localzuc.e().size() > i5 ? localzuc.a(localzuc.e().get(i5)) : 0.0D;
            d7 = d9;
            d9 = localzuc.f().size() > i5 ? localzuc.a(localzuc.f().get(i5)) : 0.0D;
            d8 = d9;
            break;
          case 4: 
            d7 = localzuc.a(paramzbfd.F(), n);
            d8 = d7;
          }
          f10 = (float)d7 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
          f11 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
          if (!localzbt1.p())
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
        localzuc.a(localzo, f10, f11);
        if (!localzbt1.p())
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
        zq localzq = new zq(f9, f7, f8, f3);
        if (localzq.g() < paramzp.d())
        {
          localzq.d(localzq.i() - (paramzp.d() - localzq.g()));
          localzq.b(paramzp.d());
        }
        if (localzq.m() > paramzp.j() + 1) {
          localzq.d(localzq.i() - (localzq.m() - paramzp.j()));
        }
        if ((localzq.l() >= paramzp.c()) && (localzq.j() <= paramzp.i()))
        {
          if (localzq.f() < paramzp.c())
          {
            localzq.c(localzq.h() - (paramzp.c() - localzq.f()));
            localzq.a(paramzp.c());
          }
          else if (localzq.l() > paramzp.i())
          {
            localzq.c(localzq.h() - (localzq.l() - paramzp.i()));
          }
          if (localzq.i() + 1.0F >= (f3 - 1.0F) / 3.0F)
          {
            if (i11 == 0) {
              a(paramzr, localzkf1, localzq, paramFloat, localzbt1, paramzp);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq.f() + localzq.h() / 2.0F < paramFloat) {
              bool = false;
            } else if (d4 != 0.0D) {
              bool = true;
            } else if (localzbt1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i9);
            arrayOfObject[1] = Integer.valueOf(i5);
            arrayOfObject[2] = localzq;
            arrayOfObject[3] = Boolean.valueOf(bool);
            if (i11 == 0) {
              com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
            }
            if (paramzbfd.Z())
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, localzq);
              com.aspose.cells.b.a.a.zf.a(localArrayList4, Boolean.valueOf(bool));
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
  
  static ArrayList b(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
    throws Exception
  {
    int i = paramzbfd.ah();
    int j = 8;
    zbff localzbff = paramzjf.z();
    int k = localzbff.getCount();
    zbt localzbt2;
    zbt localzbt1;
    int m;
    if (i == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
      m = localzbff.b(1, j);
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
      m = localzbff.b(2, j);
    }
    float f1 = 0.0F;
    if (localzbt1.p()) {
      f1 = paramzp.c() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
    } else {
      f1 = paramzp.i() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
    }
    if (localzbt2.k() == 2) {
      return b(paramzr, paramzjf, paramzbfd, paramzp, f1);
    }
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    float f2 = paramzbfd.M() / 100.0F;
    float f3 = paramzbfd.L() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
    int n = 0;
    if ((localzbt2.f()) || (paramzjf.u()))
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
    List localList = localzbff.a(i, new int[] { j });
    int i1 = localzbff.a(paramzbfd, i, new int[] { j });
    if (i1 == -1) {
      return new ArrayList();
    }
    int i2 = paramzbfd.ak();
    zkh localzkh = paramzbfd.F();
    ArrayList localArrayList2 = new ArrayList();
    for (int i3 = 0; i3 < localzkh.getCount(); i3++)
    {
      zkf localzkf1 = localzkh.b(i3);
      float f5 = (float)d3 / (m - f2 * (m - 1) + f3);
      float f6 = f5 * f2;
      float f7 = f5 * f3;
      f4 = i1 * (f5 - f6);
      float f8 = (float)d3 * i3 + f7 / 2.0F + f4;
      if ((!localzbt2.f()) && (!paramzjf.u())) {
        f8 -= (float)(d3 / 2.0D);
      }
      if (!localzbt2.p()) {
        f8 = paramzp.d() + paramzp.f() - f8 - f5;
      } else {
        f8 = paramzp.d() + f8;
      }
      ArrayList localArrayList3 = new ArrayList();
      if (localzkf1 != null)
      {
        double d4 = localzkf1.w();
        double d5 = d4;
        double d6 = 0.0D;
        zkf localzkf2;
        double d7;
        if (d4 >= 0.0D) {
          for (i4 = 0; i4 < i1; i4++)
          {
            localzkf2 = ((zbfd)localList.get(i4)).F().b(i3);
            if (localzkf2 != null)
            {
              d7 = localzkf2.w();
              if (d7 > 0.0D) {
                d5 += d7;
              }
            }
          }
        } else {
          for (i4 = 0; i4 < i1; i4++)
          {
            localzkf2 = ((zbfd)localList.get(i4)).F().b(i3);
            if (localzkf2 != null)
            {
              d7 = localzkf2.w();
              if (d7 <= 0.0D) {
                d5 += d7;
              }
            }
          }
        }
        for (int i4 = 0; i4 < localList.size(); i4++)
        {
          localzkf2 = ((zbfd)localList.get(i4)).F().b(i3);
          if (localzkf2 != null)
          {
            d7 = localzkf2.w();
            d6 += Math.abs(d7);
          }
        }
        if (d6 == 0.0D) {
          continue;
        }
        float f9 = (float)(Math.abs(d4) / d6 / (localzbt1.z() - localzbt1.D()) * paramzp.e());
        float f10 = (float)(Math.abs(d5) / d6 / (localzbt1.z() - localzbt1.D()) * paramzp.e());
        int i5 = 0;
        if (f9 == 0.0F) {
          i5 = 1;
        }
        zuc localzuc = paramzbfd.x();
        zo localzo = new zo(f1, f8 + f5 / 2.0F);
        double d8 = 0.0D;
        double d9 = 0.0D;
        float f11 = 0.0F;
        float f12 = 0.0F;
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf1.e()))
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
            double d10 = localzuc.e().size() > i3 ? localzuc.a(localzuc.e().get(i3)) : 0.0D;
            d8 = d10;
            d10 = localzuc.f().size() > i3 ? localzuc.a(localzuc.f().get(i3)) : 0.0D;
            d9 = d10;
            break;
          case 4: 
            d8 = localzuc.a(paramzbfd.F(), localzkh.getCount());
            d9 = d8;
          }
          d9 /= d6;
          d8 /= d6;
          f11 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
          f12 = (float)d9 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
          if (!localzbt1.p())
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
        localzuc.a(localzo, f11, f12);
        if (!localzbt1.p())
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
        zq localzq = new zq(f10, f8, f9, f5);
        if (localzq.f() < paramzp.c())
        {
          localzq.c(localzq.h() - (paramzp.c() - localzq.f()));
          localzq.a(paramzp.c());
        }
        if (localzq.l() > paramzp.i() + 1) {
          localzq.c(localzq.h() - (localzq.l() - paramzp.i()));
        }
        if ((localzq.m() >= paramzp.d()) && (localzq.g() <= paramzp.j()))
        {
          if (localzq.g() < paramzp.d())
          {
            localzq.d(localzq.i() - (paramzp.d() - localzq.g()));
            localzq.b(paramzp.d());
          }
          else if (localzq.m() > paramzp.j())
          {
            localzq.d(localzq.i() - (localzq.m() - paramzp.j()));
          }
          if (localzq.i() + 1.0F >= (f5 - 1.0F) / 3.0F)
          {
            if (i5 == 0) {
              a(paramzr, localzkf1, localzq, f1, localzbt1, paramzp);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq.f() + localzq.h() / 2.0F < f1) {
              bool = false;
            } else if (d4 != 0.0D) {
              bool = true;
            } else if (localzbt1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i2);
            arrayOfObject[1] = Integer.valueOf(i3);
            arrayOfObject[2] = localzq;
            arrayOfObject[3] = Boolean.valueOf(bool);
            if (i5 == 0) {
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
            }
            if (paramzbfd.Z())
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList3, localzq);
              com.aspose.cells.b.a.a.zf.a(localArrayList3, Boolean.valueOf(bool));
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
  
  private static ArrayList b(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat)
    throws Exception
  {
    int i = paramzbfd.ah();
    int j = 8;
    zbff localzbff = paramzjf.z();
    int k = localzbff.getCount();
    zbt localzbt2;
    zbt localzbt1;
    int m;
    ArrayList localArrayList1;
    if (i == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
      m = localzbff.b(1, j);
      localArrayList1 = ziz.a(paramzjf.z().c(), paramzjf.U());
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
      m = localzbff.b(2, j);
      localArrayList1 = ziz.a(paramzjf.z().d(), paramzjf.U());
    }
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    float f1 = paramzbfd.M() / 100.0F;
    float f2 = paramzbfd.L() / 100.0F;
    ArrayList localArrayList2 = new ArrayList();
    int n = localArrayList1.size();
    int i1 = localzbt2.j();
    int i2 = (int)localzbt2.D();
    int i3 = (int)localzbt2.z();
    int i4 = 0;
    if ((localzbt2.f()) || (paramzjf.u()))
    {
      i4 = zbv.a(i1, i3, i2, paramzjf.U()) + 1;
    }
    else
    {
      i4 = zbv.a(i1, i3, i2, paramzjf.U());
      if (i4 == 0) {
        i4 = 1;
      }
    }
    double d3 = paramzp.f() / i4;
    ArrayList localArrayList3 = new ArrayList();
    for (int i5 = 0; i5 < n; i5++)
    {
      zkf localzkf1 = paramzbfd.F().b(i5);
      float f3 = (float)(d3 / (m - f1 * (m - 1) + f2));
      float f4 = f3 * f1;
      float f5 = f3 * f2;
      int i6 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList1.get(i5)));
      i6 = zbv.a(i1, i6, paramzjf.U());
      int i7 = zbv.a(i1, i6, i2, paramzjf.U());
      float f6 = (float)(d3 * i7);
      if ((!localzbt2.f()) && (!paramzjf.u())) {
        f6 -= (float)(d3 / 2.0D);
      }
      float f7 = 0.0F;
      if (localzbt2.p()) {
        f7 = paramzp.d() + f6 + f5 / 2.0F;
      } else {
        f7 = paramzp.d() + paramzp.f() - f3 - f6 - f5 / 2.0F;
      }
      List localList = localzbff.a(i, new int[] { j });
      int i8 = localzbff.a(paramzbfd, i, new int[] { j });
      if (i8 == -1) {
        return new ArrayList();
      }
      int i9 = paramzbfd.ak();
      if (localzbt2.p()) {
        f7 += i8 * (f3 - f4);
      } else {
        f7 -= i8 * (f3 - f4);
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
          for (i10 = 0; i10 < i8; i10++)
          {
            localzkf2 = ((zbfd)localList.get(i10)).F().b(i5);
            if (localzkf2 != null)
            {
              d7 = localzkf2.w();
              if (d7 > 0.0D) {
                d5 += d7;
              }
            }
          }
        } else {
          for (i10 = 0; i10 < i8; i10++)
          {
            localzkf2 = ((zbfd)localList.get(i10)).F().b(i5);
            if (localzkf2 != null)
            {
              d7 = localzkf2.w();
              if (d7 <= 0.0D) {
                d5 += d7;
              }
            }
          }
        }
        for (int i10 = 0; i10 < localList.size(); i10++)
        {
          localzkf2 = ((zbfd)localList.get(i10)).F().b(i5);
          if (localzkf2 != null)
          {
            d7 = localzkf2.w();
            d6 += Math.abs(d7);
          }
        }
        if (d6 == 0.0D) {
          continue;
        }
        float f8 = (float)(Math.abs(d4) / d6 / (localzbt1.z() - localzbt1.D()) * paramzp.e());
        float f9 = (float)(Math.abs(d5) / d6 / (localzbt1.z() - localzbt1.D()) * paramzp.e());
        int i11 = 0;
        if (f8 == 0.0F) {
          i11 = 1;
        }
        zuc localzuc = paramzbfd.x();
        zo localzo = new zo(paramFloat, f7 + f3 / 2.0F);
        double d8 = 0.0D;
        double d9 = 0.0D;
        float f10 = 0.0F;
        float f11 = 0.0F;
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf1.e()))
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
            double d10 = localzuc.e().size() > i5 ? localzuc.a(localzuc.e().get(i5)) : 0.0D;
            d8 = d10;
            d10 = localzuc.f().size() > i5 ? localzuc.a(localzuc.f().get(i5)) : 0.0D;
            d9 = d10;
            break;
          case 4: 
            d8 = localzuc.a(paramzbfd.F(), n);
            d9 = d8;
          }
          d9 /= d6;
          d8 /= d6;
          f10 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
          f11 = (float)d9 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.e();
          if (!localzbt1.p())
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
        localzuc.a(localzo, f10, f11);
        if (!localzbt1.p())
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
        zq localzq = new zq(f9, f7, f8, f3);
        if (localzq.g() < paramzp.d())
        {
          localzq.d(localzq.i() - (paramzp.d() - localzq.g()));
          localzq.b(paramzp.d());
        }
        if (localzq.m() > paramzp.j() + 1) {
          localzq.d(localzq.i() - (localzq.m() - paramzp.j()));
        }
        if ((localzq.l() >= paramzp.c()) && (localzq.j() <= paramzp.i()))
        {
          if (localzq.f() < paramzp.c())
          {
            localzq.c(localzq.h() - (paramzp.c() - localzq.f()));
            localzq.a(paramzp.c());
          }
          else if (localzq.l() > paramzp.i())
          {
            localzq.c(localzq.h() - (localzq.l() - paramzp.i()));
          }
          if (localzq.i() + 1.0F >= (f3 - 1.0F) / 3.0F)
          {
            if (i11 == 0) {
              a(paramzr, localzkf1, localzq, paramFloat, localzbt1, paramzp);
            }
            Object[] arrayOfObject = new Object[4];
            boolean bool;
            if (localzq.f() + localzq.h() / 2.0F < paramFloat) {
              bool = false;
            } else if (d4 != 0.0D) {
              bool = true;
            } else if (localzbt1.p()) {
              bool = false;
            } else {
              bool = true;
            }
            arrayOfObject[0] = Integer.valueOf(i9);
            arrayOfObject[1] = Integer.valueOf(i5);
            arrayOfObject[2] = localzq;
            arrayOfObject[3] = Boolean.valueOf(bool);
            if (i11 == 0) {
              com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject);
            }
            if (paramzbfd.Z())
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList4, localzq);
              com.aspose.cells.b.a.a.zf.a(localArrayList4, Boolean.valueOf(bool));
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
    float f1 = paramzjf.S().i() / paramInt;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f2 = paramzjf.S().a(true, paramInt, i);
    float f3 = paramzjf.S().k();
    float f4 = f2 * paramzjf.o() / 100.0F;
    for (int j = 0; j < paramInt; j++)
    {
      ArrayList localArrayList2 = localzbff.j();
      if (localzbt2.p()) {
        Collections.reverse(localArrayList2);
      }
      for (int k = 0; k < localArrayList2.size(); k++)
      {
        zbfd localzbfd = (zbfd)localArrayList2.get(k);
        int m = localzbfd.ak();
        float f5 = k * f2;
        float f6 = f1 * j + f4 / 2.0F + f5;
        f6 = paramzjf.S().f() - f6;
        zkh localzkh = localzbfd.F();
        int n = j;
        if (localzbt2.p()) {
          n = paramInt - 1 - n;
        }
        zkf localzkf = localzkh.b(n);
        if ((localzkf != null) && (!localzkf.a()))
        {
          double d3 = localzbt1.i(localzkf.w());
          float f7 = (float)((d3 - paramDouble) / (d1 - d2) * paramzjf.S().g());
          if (localzbt1.p()) {
            f7 = -f7;
          }
          a(paramzr, localzkf, paramzjf, f6, f2, f3, paramFloat, f7, NaN.0D);
          zo localzo = a(paramzjf, f6, f2, f3, paramFloat, f7);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(m);
          arrayOfObject[1] = Integer.valueOf(n);
          arrayOfObject[2] = localzo;
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
    zbyv localzbyv = paramzjf.S();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    ArrayList localArrayList1 = new ArrayList();
    int j = (int)localzbt2.z();
    int k = (int)localzbt2.D();
    int m = localzbt2.j();
    int n = zbv.a(m, j, k, paramzjf.U()) + 1;
    float f1 = localzbyv.i() / n;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f2 = paramzjf.S().a(true, n, i);
    float f3 = paramzjf.S().k();
    float f4 = f2 * paramzjf.o() / 100.0F;
    ArrayList localArrayList2 = ziz.a(paramzjf.z().c(), paramzjf.U());
    int i1 = localArrayList2.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList2.get(i2)));
      i3 = zbv.a(m, i3, paramzjf.U());
      int i4 = zbv.a(m, i3, (int)localzbt2.D(), paramzjf.U());
      float f5 = f1 * i4;
      float f6 = f5 + f4 / 2.0F;
      f6 = paramzjf.S().f() - f6 + f2;
      ArrayList localArrayList3 = localzbff.j();
      for (int i5 = 0; i5 < localArrayList3.size(); i5++)
      {
        zbfd localzbfd = (zbfd)localArrayList3.get(i5);
        int i6 = localzbfd.ak();
        float f7 = f2;
        f6 -= f7;
        zkh localzkh = localzbfd.F();
        int i7 = i2;
        if (localzbt2.p()) {
          i7 = i1 - 1 - i7;
        }
        zkf localzkf = localzkh.b(i7);
        if ((localzkf != null) && (!localzkf.a()))
        {
          double d3 = localzbt1.i(localzkf.w());
          float f8 = (float)((d3 - paramDouble) / (d1 - d2) * paramzjf.S().g());
          if (localzbt1.p()) {
            f8 = -f8;
          }
          a(paramzr, localzkf, paramzjf, f6, f2, f3, paramFloat, f8, NaN.0D);
          zo localzo = a(paramzjf, f6, f2, f3, paramFloat, f8);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(i6);
          arrayOfObject[1] = Integer.valueOf(i7);
          arrayOfObject[2] = localzo;
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
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    ArrayList localArrayList1 = localzbff.j();
    int i = ziz.a(localArrayList1);
    double d1 = 0.0D;
    if (i == 1) {
      d1 = localzbt1.D();
    } else if (i == 2) {
      d1 = localzbt1.z();
    }
    float f1 = 0.0F;
    if (paramzjf.G().p()) {
      f1 = paramzjf.S().e() + (float)Math.abs((localzbt1.z() - d1) / (float)(localzbt1.z() - localzbt1.D())) * paramzjf.S().g();
    } else {
      f1 = paramzjf.S().e() + (float)Math.abs((localzbt1.D() - d1) / (float)(localzbt1.z() - localzbt1.D())) * paramzjf.S().g();
    }
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzjf, f1, paramDouble, i, d1);
    }
    ArrayList localArrayList2 = new ArrayList();
    float f2 = paramzjf.S().i() / paramInt;
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d3 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    float f3 = paramzjf.S().a(true, paramInt, 1);
    float f4 = paramzjf.S().k();
    float f5 = f3 * paramzjf.o() / 100.0F;
    for (int j = 0; j < paramInt; j++)
    {
      ArrayList localArrayList3 = new ArrayList();
      Object localObject;
      for (int k = 0; k < localArrayList1.size(); k++)
      {
        localObject = (zbfd)localArrayList1.get(k);
        int m = ((zbfd)localObject).ak();
        float f6 = f2 * j + f5 / 2.0F;
        f6 = paramzjf.S().f() - f6;
        zkh localzkh = ((zbfd)localObject).F();
        int n = j;
        if (localzbt2.p()) {
          n = paramInt - 1 - n;
        }
        zkf localzkf2 = localzkh.b(n);
        int i1 = k;
        if ((localzkf2 != null) && (!localzkf2.a()))
        {
          double d4 = localzkf2.w();
          double d5 = 0.0D;
          double[] arrayOfDouble1 = { d4 };
          double[] arrayOfDouble2 = { d5 };
          boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList1, i1, n, localzbt1.z(), localzbt1.D());
          d4 = arrayOfDouble1[0];
          d5 = arrayOfDouble2[0];
          if (bool)
          {
            if ((i == 1) && (k == 0)) {
              d4 -= d1;
            } else if ((i == 2) && (k == 0)) {
              d4 -= d1;
            }
            float f7 = (float)(d4 / (d2 - d3) * paramzjf.S().g());
            float f8 = (float)((d5 - d1) / (d2 - d3) * paramzjf.S().g());
            float f9;
            if (localzbt1.p())
            {
              f9 = f1 - (f8 - f7);
              f7 = -f7;
            }
            else
            {
              f9 = f1 + (f8 - f7);
            }
            float f10 = f9 + f7;
            if (f9 < paramzjf.S().e()) {
              f9 = paramzjf.S().e();
            }
            if (f9 > paramzjf.S().e() + paramzjf.S().g()) {
              f9 = paramzjf.S().e() + paramzjf.S().g();
            }
            if (f10 < paramzjf.S().e()) {
              f10 = paramzjf.S().e();
            }
            if (f10 > paramzjf.S().e() + paramzjf.S().g()) {
              f10 = paramzjf.S().e() + paramzjf.S().g();
            }
            f7 = f10 - f9;
            Object[] arrayOfObject1 = new Object[5];
            arrayOfObject1[0] = localzkf2;
            arrayOfObject1[1] = Float.valueOf(f6);
            arrayOfObject1[2] = Float.valueOf(f9);
            arrayOfObject1[3] = Float.valueOf(f7);
            arrayOfObject1[4] = Double.valueOf(d5);
            a(d4, arrayOfObject1, localArrayList3, localzbt1);
            zo localzo = b(paramzjf, f6, f3, f4, f9, f7);
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(m);
            arrayOfObject2[1] = Integer.valueOf(n);
            arrayOfObject2[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfObject2);
          }
        }
      }
      for (k = 0; k < localArrayList3.size(); k++)
      {
        localObject = (Object[])localArrayList3.get(k);
        zkf localzkf1 = (zkf)localObject[0];
        a(paramzr, localzkf1, paramzjf, ((Float)localObject[1]).floatValue(), f3, f4, ((Float)localObject[2]).floatValue(), ((Float)localObject[3]).floatValue(), ((Double)localObject[4]).doubleValue());
      }
      localArrayList3.clear();
    }
    return localArrayList2;
  }
  
  private static ArrayList a(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble1, int paramInt, double paramDouble2)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    ArrayList localArrayList1 = new ArrayList();
    int i = (int)localzbt2.z();
    int j = (int)localzbt2.D();
    int k = localzbt2.j();
    int m = zbv.a(k, i, j, paramzjf.U()) + 1;
    float f1 = paramzjf.S().i() / m;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    float f2 = paramzjf.S().a(true, m, 1);
    float f3 = paramzjf.S().k();
    float f4 = f2 * paramzjf.o() / 100.0F;
    ArrayList localArrayList2 = ziz.a(paramzjf.z().c(), paramzjf.U());
    int n = localArrayList2.size();
    for (int i1 = 0; i1 < n; i1++)
    {
      ArrayList localArrayList3 = new ArrayList();
      int i2 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList2.get(i1)));
      i2 = zbv.a(k, i2, paramzjf.U());
      int i3 = zbv.a(k, i2, (int)localzbt2.D(), paramzjf.U());
      float f5 = f1 * i3;
      float f6 = f5 + f4 / 2.0F;
      f6 = paramzjf.S().f() - f6;
      ArrayList localArrayList4 = localzbff.j();
      Object localObject;
      for (int i4 = 0; i4 < localArrayList4.size(); i4++)
      {
        localObject = (zbfd)localArrayList4.get(i4);
        int i5 = ((zbfd)localObject).ak();
        zkh localzkh = ((zbfd)localObject).F();
        int i6 = i1;
        if (localzbt2.p()) {
          i6 = n - 1 - i6;
        }
        zkf localzkf2 = localzkh.b(i6);
        int i7 = i4;
        if ((localzkf2 != null) && (!localzkf2.a()))
        {
          double d3 = localzkf2.w();
          double d4 = 0.0D;
          double[] arrayOfDouble1 = { d3 };
          double[] arrayOfDouble2 = { d4 };
          boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList4, i7, i6, localzbt1.z(), localzbt1.D());
          d3 = arrayOfDouble1[0];
          d4 = arrayOfDouble2[0];
          if (bool)
          {
            if ((paramInt == 1) && (i4 == 0)) {
              d3 -= paramDouble2;
            } else if ((paramInt == 2) && (i4 == 0)) {
              d3 -= paramDouble2;
            }
            float f7 = (float)(d3 / (d1 - d2) * paramzjf.S().g());
            float f8 = (float)((d4 - paramDouble2) / (d1 - d2) * paramzjf.S().g());
            float f9;
            if (localzbt1.p())
            {
              f9 = paramFloat - (f8 - f7);
              f7 = -f7;
            }
            else
            {
              f9 = paramFloat + (f8 - f7);
            }
            float f10 = f9 + f7;
            if (f9 < paramzjf.S().e()) {
              f9 = paramzjf.S().e();
            }
            if (f9 > paramzjf.S().e() + paramzjf.S().g()) {
              f9 = paramzjf.S().e() + paramzjf.S().g();
            }
            if (f10 < paramzjf.S().e()) {
              f10 = paramzjf.S().f();
            }
            if (f10 > paramzjf.S().e() + paramzjf.S().g()) {
              f10 = paramzjf.S().e() + paramzjf.S().g();
            }
            f7 = f10 - f9;
            Object[] arrayOfObject1 = new Object[5];
            arrayOfObject1[0] = localzkf2;
            arrayOfObject1[1] = Float.valueOf(f6);
            arrayOfObject1[2] = Float.valueOf(f9);
            arrayOfObject1[3] = Float.valueOf(f7);
            arrayOfObject1[4] = Double.valueOf(d4);
            a(d3, arrayOfObject1, localArrayList3, localzbt1);
            zo localzo = b(paramzjf, f6, f2, f3, f9, f7);
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(i5);
            arrayOfObject2[1] = Integer.valueOf(i6);
            arrayOfObject2[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
          }
        }
      }
      for (i4 = 0; i4 < localArrayList3.size(); i4++)
      {
        localObject = (Object[])localArrayList3.get(i4);
        zkf localzkf1 = (zkf)localObject[0];
        a(paramzr, localzkf1, paramzjf, ((Float)localObject[1]).floatValue(), f2, f3, ((Float)localObject[2]).floatValue(), ((Float)localObject[3]).floatValue(), ((Double)localObject[4]).doubleValue());
      }
      localArrayList3.clear();
    }
    return localArrayList1;
  }
  
  static ArrayList b(zr paramzr, zjf paramzjf, double paramDouble, int paramInt)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    float f1 = 0.0F;
    if (paramzjf.G().p()) {
      f1 = paramzjf.S().e() + (float)Math.abs(localzbt1.z() / (float)(localzbt1.z() - localzbt1.D())) * paramzjf.S().g();
    } else {
      f1 = paramzjf.S().e() + paramzjf.S().g() - (float)Math.abs(localzbt1.z() / (float)(localzbt1.z() - localzbt1.D())) * paramzjf.S().g();
    }
    if (localzbt2.k() == 2) {
      return b(paramzr, paramzjf, f1, paramDouble);
    }
    ArrayList localArrayList1 = new ArrayList();
    float f2 = paramzjf.S().i() / paramInt;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    float f3 = paramzjf.S().a(true, paramInt, 1);
    float f4 = paramzjf.S().k();
    float f5 = f3 * paramzjf.o() / 100.0F;
    for (int i = 0; i < paramInt; i++)
    {
      ArrayList localArrayList2 = new ArrayList();
      ArrayList localArrayList3 = localzbff.j();
      Object localObject;
      for (int j = 0; j < localArrayList3.size(); j++)
      {
        localObject = (zbfd)localArrayList3.get(j);
        int k = ((zbfd)localObject).ak();
        float f6 = f2 * i + f5 / 2.0F;
        f6 = paramzjf.S().f() - f6;
        zkh localzkh = ((zbfd)localObject).F();
        int m = i;
        if (localzbt2.p()) {
          m = paramInt - 1 - m;
        }
        zkf localzkf2 = localzkh.b(m);
        int n = j;
        if ((localzkf2 != null) && (!localzkf2.a()))
        {
          double d3 = zkn.a(localArrayList3, m);
          if (d3 != 0.0D)
          {
            double d4 = localzkf2.w();
            double d5 = d4;
            double[] arrayOfDouble1 = { d4 };
            double[] arrayOfDouble2 = { d5 };
            boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList3, n, m, localzbt1, d3);
            d4 = arrayOfDouble1[0];
            d5 = arrayOfDouble2[0];
            if (bool)
            {
              float f7 = (float)(d4 / d3 / (d1 - d2) * paramzjf.S().g());
              float f8 = (float)(d5 / d3 / (d1 - d2) * paramzjf.S().g());
              float f9;
              if (localzbt1.p())
              {
                f9 = f1 - (f8 - f7);
                f7 = -f7;
              }
              else
              {
                f9 = f1 + (f8 - f7);
              }
              float f10 = f9 + f7;
              if (f9 < paramzjf.S().e()) {
                f9 = paramzjf.S().e();
              }
              if (f9 > paramzjf.S().e() + paramzjf.S().g()) {
                f9 = paramzjf.S().e() + paramzjf.S().g();
              }
              if (f10 < paramzjf.S().e()) {
                f10 = paramzjf.S().e();
              }
              if (f10 > paramzjf.S().e() + paramzjf.S().g()) {
                f10 = paramzjf.S().e() + paramzjf.S().g();
              }
              f7 = f10 - f9;
              Object[] arrayOfObject1 = new Object[5];
              arrayOfObject1[0] = localzkf2;
              arrayOfObject1[1] = Float.valueOf(f6);
              arrayOfObject1[2] = Float.valueOf(f9);
              arrayOfObject1[3] = Float.valueOf(f7);
              arrayOfObject1[4] = Double.valueOf(d5);
              a(d4, arrayOfObject1, localArrayList2, localzbt1);
              zo localzo = b(paramzjf, f6, f3, f4, f9, f7);
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(k);
              arrayOfObject2[1] = Integer.valueOf(m);
              arrayOfObject2[2] = localzo;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
            }
          }
        }
      }
      for (j = 0; j < localArrayList2.size(); j++)
      {
        localObject = (Object[])localArrayList2.get(j);
        zkf localzkf1 = (zkf)localObject[0];
        a(paramzr, localzkf1, paramzjf, ((Float)localObject[1]).floatValue(), f3, f4, ((Float)localObject[2]).floatValue(), ((Float)localObject[3]).floatValue(), ((Double)localObject[4]).doubleValue());
      }
      localArrayList2.clear();
    }
    return localArrayList1;
  }
  
  private static ArrayList b(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    ArrayList localArrayList1 = new ArrayList();
    int i = (int)localzbt2.z();
    int j = (int)localzbt2.D();
    int k = localzbt2.j();
    int m = zbv.a(k, i, j, paramzjf.U()) + 1;
    float f1 = paramzjf.S().i() / m;
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    float f2 = paramzjf.S().a(true, m, 1);
    float f3 = paramzjf.S().k();
    float f4 = f2 * paramzjf.o() / 100.0F;
    ArrayList localArrayList2 = ziz.a(paramzjf.z().c(), paramzjf.U());
    int n = localArrayList2.size();
    for (int i1 = 0; i1 < n; i1++)
    {
      ArrayList localArrayList3 = new ArrayList();
      int i2 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList2.get(i1)));
      i2 = zbv.a(k, i2, paramzjf.U());
      int i3 = zbv.a(k, i2, (int)localzbt2.D(), paramzjf.U());
      float f5 = f1 * i3;
      float f6 = f5 + f4 / 2.0F;
      f6 = paramzjf.S().f() - f6;
      ArrayList localArrayList4 = localzbff.j();
      Object localObject;
      for (int i4 = 0; i4 < localArrayList4.size(); i4++)
      {
        localObject = (zbfd)localArrayList4.get(i4);
        int i5 = ((zbfd)localObject).ak();
        zkh localzkh = ((zbfd)localObject).F();
        int i6 = i1;
        if (localzbt2.p()) {
          i6 = n - 1 - i6;
        }
        zkf localzkf2 = localzkh.b(i6);
        int i7 = i4;
        if ((localzkf2 != null) && (!localzkf2.a()))
        {
          double d3 = zkn.a(localArrayList4, i6);
          if (d3 != 0.0D)
          {
            double d4 = localzkf2.w();
            double d5 = d4;
            double[] arrayOfDouble1 = { d4 };
            double[] arrayOfDouble2 = { d5 };
            boolean bool = zkn.a(arrayOfDouble1, arrayOfDouble2, localArrayList4, i7, i6, localzbt1, d3);
            d4 = arrayOfDouble1[0];
            d5 = arrayOfDouble2[0];
            if (bool)
            {
              float f7 = (float)(d4 / d3 / (d1 - d2) * paramzjf.S().g());
              float f8 = (float)(d5 / d3 / (d1 - d2) * paramzjf.S().g());
              float f9;
              if (localzbt1.p())
              {
                f9 = paramFloat - (f8 - f7);
                f7 = -f7;
              }
              else
              {
                f9 = paramFloat + (f8 - f7);
              }
              float f10 = f9 + f7;
              if (f9 < paramzjf.S().e()) {
                f9 = paramzjf.S().e();
              }
              if (f9 > paramzjf.S().e() + paramzjf.S().g()) {
                f9 = paramzjf.S().e() + paramzjf.S().g();
              }
              if (f10 < paramzjf.S().e()) {
                f10 = paramzjf.S().f();
              }
              if (f10 > paramzjf.S().e() + paramzjf.S().g()) {
                f10 = paramzjf.S().e() + paramzjf.S().g();
              }
              f7 = f10 - f9;
              Object[] arrayOfObject1 = new Object[5];
              arrayOfObject1[0] = localzkf2;
              arrayOfObject1[1] = Float.valueOf(f6);
              arrayOfObject1[2] = Float.valueOf(f9);
              arrayOfObject1[3] = Float.valueOf(f7);
              arrayOfObject1[4] = Double.valueOf(d5);
              a(d4, arrayOfObject1, localArrayList3, localzbt1);
              zo localzo = b(paramzjf, f6, f2, f3, f9, f7);
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(i5);
              arrayOfObject2[1] = Integer.valueOf(i6);
              arrayOfObject2[2] = localzo;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
            }
          }
        }
      }
      for (i4 = 0; i4 < localArrayList3.size(); i4++)
      {
        localObject = (Object[])localArrayList3.get(i4);
        zkf localzkf1 = (zkf)localObject[0];
        a(paramzr, localzkf1, paramzjf, ((Float)localObject[1]).floatValue(), f2, f3, ((Float)localObject[2]).floatValue(), ((Float)localObject[3]).floatValue(), ((Double)localObject[4]).doubleValue());
      }
      localArrayList3.clear();
    }
    return localArrayList1;
  }
  
  private static void a(double paramDouble, Object[] paramArrayOfObject, ArrayList paramArrayList, zbt paramzbt)
  {
    zjf localzjf = paramzbt.e();
    float f1 = ((Float)paramArrayOfObject[2]).floatValue() + ((Float)paramArrayOfObject[3]).floatValue();
    if (paramArrayList.size() == 0) {
      com.aspose.cells.b.a.a.zf.a(paramArrayList, paramArrayOfObject);
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
          if (paramzbt.p())
          {
            if (paramDouble > 0.0D)
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
          com.aspose.cells.b.a.a.zf.a(paramArrayList, paramArrayOfObject);
          break;
        }
      }
    }
  }
  
  private static zo a(zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    float f1 = paramFloat4 + paramFloat5;
    float f3 = paramzjf.S().j();
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
      localzo1 = zlr.a(paramzjf, paramFloat1, f2, paramFloat3, i);
    }
    else
    {
      if (paramFloat4 > f1) {
        i = 1;
      } else {
        i = 2;
      }
      f2 = 2.0F * (f1 - f3);
      localzo1 = zlr.a(paramzjf, paramFloat1, f2, paramFloat3, i);
    }
    zo localzo2 = zlr.a(paramzjf, paramFloat1, 1.0F, paramFloat3, 0);
    float f4 = paramFloat3 * (float)Math.sin(paramzjf.p() * 3.141592653589793D / 180.0D);
    return new zo(localzo1.d(), localzo2.e() - (paramFloat2 + f4) / 2.0F);
  }
  
  private static zo b(zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    paramFloat4 += paramFloat5 / 2.0F;
    float f2 = paramzjf.S().j();
    if (paramFloat4 <= f2)
    {
      f1 = 2.0F * (f2 - paramFloat4);
      return zlr.a(paramzjf, paramFloat1 - paramFloat2 / 2.0F, f1, paramFloat3, 0);
    }
    float f1 = 2.0F * (paramFloat4 - f2);
    return zlr.a(paramzjf, paramFloat1 - paramFloat2 / 2.0F, f1, paramFloat3, 1);
  }
  
  static void a(zr paramzr, zjf paramzjf, ArrayList paramArrayList)
    throws Exception
  {
    zbff localzbff = paramzjf.z();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      zo localzo = (zo)arrayOfObject[2];
      zqy localzqy = localzbff.c(j).w();
      zt localzt = zra.a(paramzr, paramzjf.e(), localzbff, j, k, (int)paramzjf.S().g());
      zq localzq = new zq(localzo.d() - localzt.b() / 2.0F, localzo.e() - localzt.c() / 2.0F, localzt.b(), localzt.c());
      zra.a(paramzr, paramzjf.e(), localzbff, j, k, localzq);
    }
  }
  
  private static void a(zr paramzr, zkf paramzkf, zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, double paramDouble)
    throws Exception
  {
    zbfd localzbfd = paramzkf.g().a();
    double d1 = 1.0D;
    double d2 = 1.0D;
    double d3;
    double d4;
    double[] arrayOfDouble1;
    double[] arrayOfDouble2;
    switch (localzbfd.I())
    {
    case 0: 
      a(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 1: 
      if ((localzbfd.ap()) || (localzbfd.as()))
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlr.a(localzbfd.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() > 0.0D)
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
      if (localzbfd.ap())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlr.b(localzbfd.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() > 0.0D)
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
      else if (localzbfd.as())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlr.a(localzbfd.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() > 0.0D)
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
        d1 = (float)zlr.b(paramzkf);
        d2 = 1.0D;
      }
      a(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 3: 
      b(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
      break;
    case 4: 
      if ((localzbfd.ap()) || (localzbfd.as()))
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlr.a(localzbfd.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() > 0.0D)
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
      if (localzbfd.ap())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlr.b(localzbfd.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() > 0.0D)
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
      else if (localzbfd.as())
      {
        d3 = 0.0D;
        d4 = 0.0D;
        arrayOfDouble1 = new double[] { d3 };
        arrayOfDouble2 = new double[] { d4 };
        zlr.a(localzbfd.aj(), paramzkf.I(), arrayOfDouble1, arrayOfDouble2);
        d3 = arrayOfDouble1[0];
        d4 = arrayOfDouble2[0];
        if (paramzkf.w() > 0.0D)
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
        d1 = (float)zlr.b(paramzkf);
        d2 = 1.0D;
      }
      b(paramzr, paramzkf, paramzjf, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, (float)d1, (float)d2);
    }
  }
  
  private static void a(zr paramzr, zkf paramzkf, zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
    throws Exception
  {
    zaz localzaz = paramzkf.i();
    zanr localzanr = paramzkf.k();
    zo[] arrayOfzo = new zo[8];
    zbxz.a(arrayOfzo);
    float f2 = paramzjf.S().j();
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
        arrayOfzo[j] = zlr.a(paramzjf, f6, f1, f4, 0);
        arrayOfzo[(j + 4)].a(arrayOfzo[j].d());
        arrayOfzo[(j + 4)].b(arrayOfzo[j].e() - f5);
        arrayOfzo[(j + i)] = zlr.a(paramzjf, f6, f1, f4, 3);
        arrayOfzo[(j + i + 4)].a(arrayOfzo[(j + i)].d());
        arrayOfzo[(j + i + 4)].b(arrayOfzo[(j + i)].e() - f5);
      }
      else
      {
        f1 = 2.0F * (f3 - f2);
        arrayOfzo[j] = zlr.a(paramzjf, f6, f1, f4, 1);
        arrayOfzo[(j + 4)].a(arrayOfzo[j].d());
        arrayOfzo[(j + 4)].b(arrayOfzo[j].e() - f5);
        arrayOfzo[(j + i)] = zlr.a(paramzjf, f6, f1, f4, 2);
        arrayOfzo[(j + i + 4)].a(arrayOfzo[(j + i)].d());
        arrayOfzo[(j + i + 4)].b(arrayOfzo[(j + i)].e() - f5);
      }
      i = 1;
      f3 += paramFloat5;
      f6 = paramFloat1 - paramFloat2 * (1.0F - paramFloat6) / 2.0F;
      f4 = paramFloat3 * paramFloat6;
      f5 = paramFloat2 * paramFloat6;
    }
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new zo(arrayOfzo[0].d(), arrayOfzo[0].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new zo(arrayOfzo[1].d(), arrayOfzo[1].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new zo(arrayOfzo[2].d(), arrayOfzo[2].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.b, new zo(arrayOfzo[3].d(), arrayOfzo[3].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new zo(arrayOfzo[4].d(), arrayOfzo[4].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new zo(arrayOfzo[5].d(), arrayOfzo[5].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new zo(arrayOfzo[6].d(), arrayOfzo[6].e()));
    com.aspose.cells.b.a.a.zf.a(paramzkf.c, new zo(arrayOfzo[7].d(), arrayOfzo[7].e()));
    ze localze1;
    if (paramFloat5 != 0.0F)
    {
      localze1 = new ze();
      localze1.b(new zo[] { arrayOfzo[0], arrayOfzo[1], arrayOfzo[5], arrayOfzo[4] });
      localzaz.a(localze1);
      ze localze2 = new ze();
      localze2.b(new zo[] { arrayOfzo[4], arrayOfzo[5], arrayOfzo[6], arrayOfzo[7] });
      localzaz.a(localze2, 0.6666667F);
      localzanr.a(localze1);
      localzanr.a(localze2);
    }
    if (paramFloat5 > 0.0F)
    {
      localze1 = new ze();
      localze1.b(new zo[] { arrayOfzo[1], arrayOfzo[2], arrayOfzo[6], arrayOfzo[5] });
      localzaz.a(localze1, 0.5F);
      localzanr.a(localze1);
    }
    else if (paramFloat5 < 0.0F)
    {
      localze1 = new ze();
      localze1.b(new zo[] { arrayOfzo[0], arrayOfzo[3], arrayOfzo[7], arrayOfzo[4] });
      localzaz.a(localze1, 0.0F);
      localzanr.a(localze1);
    }
    else
    {
      localze1 = new ze();
      localze1.b(new zo[] { arrayOfzo[0], arrayOfzo[3], arrayOfzo[7], arrayOfzo[4] });
      localzaz.a(localze1, 0.5F);
      localzanr.a(localze1);
    }
  }
  
  private static void b(zr paramzr, zkf paramzkf, zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
    throws Exception
  {
    zaz localzaz = paramzkf.i();
    float f1 = paramFloat4;
    float f3 = paramzjf.S().j();
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
          localHashMap1.put(Integer.valueOf(180 - i), zlr.a(paramzjf, f6, f2, f5, 0));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(180 + i))) {
          localHashMap1.put(Integer.valueOf(180 + i), zlr.a(paramzjf, f7, f2, f5, 0));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(i))) {
          localHashMap1.put(Integer.valueOf(i), zlr.a(paramzjf, f6, f2, f5, 3));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(360 - i))) {
          localHashMap1.put(Integer.valueOf(360 - i), zlr.a(paramzjf, f7, f2, f5, 3));
        }
      }
      else
      {
        f2 = 2.0F * (f1 - f3);
        if (!localHashMap1.containsKey(Integer.valueOf(180 - i))) {
          localHashMap1.put(Integer.valueOf(180 - i), zlr.a(paramzjf, f6, f2, f5, 1));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(180 + i))) {
          localHashMap1.put(Integer.valueOf(180 + i), zlr.a(paramzjf, f7, f2, f5, 1));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(i))) {
          localHashMap1.put(Integer.valueOf(i), zlr.a(paramzjf, f6, f2, f5, 2));
        }
        if (!localHashMap1.containsKey(Integer.valueOf(360 - i))) {
          localHashMap1.put(Integer.valueOf(360 - i), zlr.a(paramzjf, f7, f2, f5, 2));
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
          localHashMap2.put(Integer.valueOf(180 - i), zlr.a(paramzjf, f6, f2, f9, 0));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(180 + i))) {
          localHashMap2.put(Integer.valueOf(180 + i), zlr.a(paramzjf, f7, f2, f9, 0));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(i))) {
          localHashMap2.put(Integer.valueOf(i), zlr.a(paramzjf, f6, f2, f9, 3));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(360 - i))) {
          localHashMap2.put(Integer.valueOf(360 - i), zlr.a(paramzjf, f7, f2, f9, 3));
        }
      }
      else
      {
        f2 = 2.0F * (f8 - f3);
        if (!localHashMap2.containsKey(Integer.valueOf(180 - i))) {
          localHashMap2.put(Integer.valueOf(180 - i), zlr.a(paramzjf, f6, f2, f9, 1));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(180 + i))) {
          localHashMap2.put(Integer.valueOf(180 + i), zlr.a(paramzjf, f7, f2, f9, 1));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(i))) {
          localHashMap2.put(Integer.valueOf(i), zlr.a(paramzjf, f6, f2, f9, 2));
        }
        if (!localHashMap2.containsKey(Integer.valueOf(360 - i))) {
          localHashMap2.put(Integer.valueOf(360 - i), zlr.a(paramzjf, f7, f2, f9, 2));
        }
      }
    }
    for (i = 0; i < 360; i++)
    {
      com.aspose.cells.b.a.a.zf.a(paramzkf.c, localHashMap1.get(Integer.valueOf(i)));
      com.aspose.cells.b.a.a.zf.a(paramzkf.b, localHashMap2.get(Integer.valueOf(i)));
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
    if (paramFloat5 != 0.0F)
    {
      int i1 = 90;
      int i2 = 270;
      float f10 = 0.5F;
      i3 = paramzjf.p();
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
        localzaz.a(localze3, f10);
        f12 += f13 - f11;
      }
    }
    zanr localzanr = paramzkf.k();
    zo[] arrayOfzo5 = new zo[localHashMap1.size()];
    zo[] arrayOfzo6 = new zo[localHashMap2.size()];
    zbxz.a(arrayOfzo5);
    zbxz.a(arrayOfzo6);
    for (int i3 = 0; i3 <= 360; i3++)
    {
      arrayOfzo5[i3] = ((zo)localHashMap1.get(Integer.valueOf(i3)));
      arrayOfzo6[i3] = ((zo)localHashMap2.get(Integer.valueOf(i3)));
    }
    ze localze1 = new ze();
    localze1.c(arrayOfzo5);
    ze localze2 = new ze();
    localze2.c(arrayOfzo6);
    if (paramzjf.E() != 0)
    {
      if (paramFloat5 > 0.0F)
      {
        localzaz.a(localze2, 0.7F);
        localzanr.a(localze2);
        zlr.a(paramzr, paramzkf, j, k, localHashMap1);
      }
      else if (paramFloat5 < 0.0F)
      {
        localzaz.a(localze1, 0.0F);
        localzanr.a(localze1);
        zlr.a(paramzr, paramzkf, j, k, localHashMap2);
      }
      else
      {
        localzaz.a(localze1, 0.7F);
        localzanr.a(localze1);
      }
    }
    else
    {
      localzanr.a(((zo)localObject2).d(), ((zo)localObject2).e(), ((zo)localObject1).d(), ((zo)localObject1).e());
      localzanr.a(((zo)localObject4).d(), ((zo)localObject4).e(), ((zo)localObject3).d(), ((zo)localObject3).e());
    }
    if (paramFloat5 != 0.0F)
    {
      localzanr.a(((zo)localObject2).d(), ((zo)localObject2).e(), ((zo)localObject4).d(), ((zo)localObject4).e());
      localzanr.a(((zo)localObject1).d(), ((zo)localObject1).e(), ((zo)localObject3).d(), ((zo)localObject3).e());
    }
  }
  
  private static void a(HashMap paramHashMap, zo[] paramArrayOfzo1, zo[] paramArrayOfzo2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    paramArrayOfzo1[0] = zo.a();
    paramArrayOfzo2[0] = zo.a();
    paramArrayOfInt1[0] = 0;
    paramArrayOfInt2[0] = 0;
    zc localzc = zg.a(paramHashMap);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */