package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.List;

final class zbb
{
  static ArrayList a(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramInt < 2) {
      return localArrayList1;
    }
    int i = paramzbfd.ah();
    zbt localzbt2;
    zbt localzbt1;
    if (i == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
    }
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzjf, paramzbfd, paramzp, paramFloat, (float)paramDouble);
    }
    zbff localzbff = paramzjf.z();
    int j = localzbff.getCount();
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    boolean bool = paramzbfd.N();
    zanr localzanr = paramzbfd.Q();
    float f1 = 0.0F;
    int k = paramInt;
    if (localzbt2.p) {
      k = (int)localzbt2.z();
    }
    if ((localzbt2.f()) || (paramzjf.u()))
    {
      f1 = k;
    }
    else
    {
      f1 = k - 1;
      if (f1 == 0.0F) {
        f1 = 1.0F;
      }
      if (localzbt2.u) {
        f1 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f1;
    int m = paramzbfd.ak();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    zkh localzkh = paramzbfd.F();
    for (int n = 0; n < paramInt; n++)
    {
      zkf localzkf = localzkh.b(n);
      double d4 = (float)d3 * n;
      if ((localzbt2.f()) || (paramzjf.u())) {
        d4 += (float)(d3 / 2.0D);
      }
      if (localzbt2.p()) {
        d4 = paramzp.c() + paramzp.e() - d4;
      } else {
        d4 = paramzp.c() + d4;
      }
      if (a(localzkf))
      {
        double d5 = paramFloat;
        double d6 = localzkf.w();
        double d7 = (d6 - paramDouble) / (d1 - d2) * paramzp.f();
        if (!localzbt1.p()) {
          d5 -= d7;
        } else {
          d5 += d7;
        }
        zo localzo2 = new zo((float)d4, (float)d5);
        zkn.a(localzo2, localArrayList2, localArrayList3, n);
        zuc localzuc = paramzbfd.x();
        double d8 = 0.0D;
        double d9 = 0.0D;
        float f2 = 0.0F;
        float f3 = 0.0F;
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf.e()))
        {
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
            double d10 = localzuc.e().size() > n ? localzuc.a(localzuc.e().get(n)) : 0.0D;
            d8 = d10;
            d10 = localzuc.f().size() > n ? localzuc.a(localzuc.f().get(n)) : 0.0D;
            d9 = d10;
            break;
          case 4: 
            d8 = localzuc.a(localzkh, paramInt);
            d9 = d8;
          }
          f2 = (float)d8 / (float)(d1 - d2) * paramzp.f();
          f3 = (float)d9 / (float)(d1 - d2) * paramzp.f();
        }
        localzuc.a(localzo2, f2, f3);
      }
      else
      {
        zo localzo1 = new zo((float)d4, paramFloat);
        zkn.a(localzo1, localArrayList2, localArrayList3, n);
        com.aspose.cells.b.a.a.zf.a(localArrayList4, Integer.valueOf(n));
      }
    }
    a(paramzr, paramzbfd, localArrayList2, localArrayList3, localArrayList4, paramFloat, bool, localzanr, localArrayList1, localzbt2, paramzp);
    return localArrayList1;
  }
  
  private static boolean a(zkf paramzkf)
  {
    if (paramzkf == null) {
      return false;
    }
    if (paramzkf.a()) {
      return false;
    }
    return (paramzkf.h().ay() != 0) || (!paramzkf.z());
  }
  
  private static ArrayList a(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat1, float paramFloat2)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    int i = paramzbfd.ah();
    zbff localzbff = paramzjf.z();
    int j = localzbff.getCount();
    zbt localzbt2;
    zbt localzbt1;
    ArrayList localArrayList2;
    if (i == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
      localArrayList2 = ziz.a(paramzjf.z().c(), paramzjf.U());
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
      localArrayList2 = ziz.a(paramzjf.z().d(), paramzjf.U());
    }
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    boolean bool = paramzbfd.N();
    zanr localzanr = paramzbfd.Q();
    int k = localArrayList2.size();
    int m = localzbt2.j();
    int n = (int)localzbt2.D();
    int i1 = (int)localzbt2.z();
    float f1 = 0.0F;
    if ((localzbt2.f()) || (paramzjf.u()))
    {
      f1 = zbv.a(m, i1, n, paramzjf.U()) + 1;
    }
    else
    {
      f1 = zbv.a(m, i1, n, paramzjf.U());
      if (f1 == 0.0F) {
        f1 = 1.0F;
      }
      if (localzbt2.u) {
        f1 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f1;
    float f2 = 0.0F;
    int i2 = paramzbfd.ak();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    ArrayList localArrayList5 = new ArrayList();
    for (int i3 = 0; i3 < k; i3++)
    {
      zkf localzkf = paramzbfd.F().b(i3);
      int i4 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList2.get(i3)));
      i4 = zbv.a(m, i4, paramzjf.U());
      int i5 = zbv.a(m, i4, n, paramzjf.U());
      float f3 = (float)(d3 * i5);
      f2 = (float)(d3 * zbv.a(m, zbv.a(localzbt2.j(), localzbt2.y(), (int)localzbt2.x(), i4, paramzjf.U()), i4, paramzjf.U()));
      if ((localzbt2.f()) || (paramzjf.u())) {
        f3 += (float)(d3 / 2.0D);
      }
      float f4 = 0.0F;
      if (localzbt2.p()) {
        f4 = paramzp.c() + paramzp.e() - f3;
      } else {
        f4 = paramzp.c() + f3;
      }
      if ((a(localzkf)) && (i4 != 64536))
      {
        float f5 = paramFloat1;
        float f6 = (float)localzkf.w();
        float f7 = (float)((f6 - paramFloat2) / (d2 - d1) * paramzp.f());
        if (!localzbt1.p()) {
          f5 -= f7;
        } else {
          f5 += f7;
        }
        zo localzo2 = new zo(f4, f5);
        zkn.a(localzo2, localArrayList3, localArrayList4, i3);
        zuc localzuc = paramzbfd.x();
        double d4 = 0.0D;
        double d5 = 0.0D;
        float f8 = 0.0F;
        float f9 = 0.0F;
        if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf.e()))
        {
          switch (localzuc.g())
          {
          case 1: 
            d4 = localzuc.c();
            d5 = d4;
            break;
          case 2: 
            d4 = localzuc.c() * f6 / 100.0D;
            d5 = -d4;
            break;
          case 0: 
            double d6 = localzuc.e().size() > i3 ? localzuc.a(localzuc.e().get(i3)) : 0.0D;
            d4 = d6;
            d6 = localzuc.f().size() > i3 ? localzuc.a(localzuc.f().get(i3)) : 0.0D;
            d5 = d6;
            break;
          case 4: 
            d4 = localzuc.a(paramzbfd.F(), k);
            d5 = d4;
          }
          f8 = (float)d4 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
          f9 = (float)d5 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
        }
        localzuc.a(localzo2, f8, f9);
      }
      else
      {
        zo localzo1 = new zo(f4, paramFloat1);
        zkn.a(localzo1, localArrayList3, localArrayList4, i3);
        com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i3));
      }
    }
    a(paramzr, paramzbfd, localArrayList3, localArrayList4, localArrayList5, paramFloat1, bool, localzanr, localArrayList1, localzbt2, paramzp);
    return localArrayList1;
  }
  
  static ArrayList a(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramInt < 2) {
      return localArrayList1;
    }
    int i = paramzbfd.ah();
    int j = 1;
    zbt localzbt2;
    zbt localzbt1;
    if (i == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
    }
    if (localzbt2.k() == 2) {
      return c(paramzr, paramzjf, paramzbfd, paramzp, paramFloat, i);
    }
    float f1 = 0.0F;
    if (!localzbt1.p()) {
      f1 = paramzp.d() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    }
    zbff localzbff = paramzjf.z();
    int k = localzbff.getCount();
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    boolean bool = paramzbfd.N();
    zanr localzanr = paramzbfd.Q();
    float f2 = 0.0F;
    int m = paramInt;
    if (localzbt2.p) {
      m = (int)localzbt2.z();
    }
    if ((localzbt2.f()) || (paramzjf.u()))
    {
      f2 = m;
    }
    else
    {
      f2 = m - 1;
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
    List localList = localzbff.a(i, new int[] { j });
    ArrayList localArrayList4 = new ArrayList();
    int n = localzbff.a(paramzbfd, i, new int[] { j });
    zbfd localzbfd1 = null;
    if (n > 0) {
      localzbfd1 = localzbff.a(n - 1, i, new int[] { j });
    }
    if (localzbfd1 != null) {
      com.aspose.cells.b.a.a.zf.a(localArrayList4, localzbfd1);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList4, paramzbfd);
    for (int i1 = 0; i1 < localArrayList4.size(); i1++)
    {
      zbfd localzbfd2 = (zbfd)localArrayList4.get(i1);
      int i2 = localzbff.a(localzbfd2, i, new int[] { j });
      int i3 = localzbfd2.ak();
      ArrayList localArrayList5 = new ArrayList();
      ArrayList localArrayList6 = new ArrayList();
      zkh localzkh = localzbff.c(i3).F();
      for (int i4 = 0; i4 < paramInt; i4++)
      {
        zkf localzkf = localzkh.b(i4);
        double d4 = (float)d3 * i4;
        if ((localzbt2.f()) || (paramzjf.u())) {
          d4 += (float)(d3 / 2.0D);
        }
        if (localzbt2.p()) {
          d4 = paramzp.c() + paramzp.e() - d4;
        } else {
          d4 = paramzp.c() + d4;
        }
        if (localzkf != null)
        {
          double d5 = localzkf.w();
          double d6 = d5;
          for (int i6 = 0; i6 < i2; i6++)
          {
            localObject = ((zbfd)localList.get(i6)).F().b(i4);
            if (localObject != null)
            {
              double d7 = ((zkf)localObject).w();
              d6 += d7;
            }
          }
          float f3 = (float)(Math.abs(d6) / (localzbt1.z() - localzbt1.D()) * paramzp.f());
          if (!localzbt1.p())
          {
            if (d6 <= 0.0D) {
              f3 = f1 + f3;
            } else {
              f3 = f1 - f3;
            }
          }
          else if (d6 <= 0.0D) {
            f3 = f1 - f3;
          } else {
            f3 = f1 + f3;
          }
          Object localObject = new zo((float)d4, f3);
          zkn.a((zo)localObject, localArrayList5, localArrayList6, i4);
          if (localzbfd2.equals(paramzbfd))
          {
            zuc localzuc = paramzbfd.x();
            double d8 = 0.0D;
            double d9 = 0.0D;
            float f4 = 0.0F;
            float f5 = 0.0F;
            if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf.e()))
            {
              switch (localzuc.g())
              {
              case 1: 
                d8 = localzuc.c();
                d9 = d8;
                break;
              case 2: 
                d8 = localzuc.c() * d5 / 100.0D;
                d9 = -d8;
                break;
              case 0: 
                double d10 = localzuc.e().size() > i4 ? localzuc.a(localzuc.e().get(i4)) : 0.0D;
                d8 = d10;
                d10 = localzuc.f().size() > i4 ? localzuc.a(localzuc.f().get(i4)) : 0.0D;
                d9 = d10;
                break;
              case 4: 
                d8 = localzuc.a(paramzbfd.F(), paramInt);
                d9 = d8;
              }
              f4 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
              f5 = (float)d9 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
            }
            localzuc.a((zo)localObject, f4, f5);
          }
        }
        else if (!localzbfd2.equals(paramzbfd))
        {
          zo localzo = new zo((float)d4, paramFloat);
          for (int i5 = i1; i5 > 0; i5--) {
            if (((ArrayList)localArrayList2.get(i5 - 1)).get(i4) != null)
            {
              localzo = (zo)((ArrayList)localArrayList2.get(i5 - 1)).get(i4);
              break;
            }
          }
          if (i1 == 0) {
            localzo = new zo((float)d4, paramFloat);
          }
          zkn.a(localzo, localArrayList5, localArrayList6, i4);
        }
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList5);
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
    }
    a(paramzr, localArrayList4, localArrayList2, localArrayList3, paramFloat, bool, localzanr, localArrayList1, localzbt2, paramzp);
    return localArrayList1;
  }
  
  private static ArrayList c(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    int i = 1;
    zbff localzbff = paramzjf.z();
    int j = localzbff.getCount();
    zbfd localzbfd1 = paramzjf.z().a(paramInt, i);
    if (localzbfd1 == null) {
      return localArrayList1;
    }
    zbt localzbt2;
    zbt localzbt1;
    ArrayList localArrayList2;
    if (paramInt == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
      localArrayList2 = ziz.a(paramzjf.z().c(), paramzjf.U());
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
      localArrayList2 = ziz.a(paramzjf.z().d(), paramzjf.U());
    }
    float f1 = 0.0F;
    if (!localzbt1.p()) {
      f1 = paramzp.d() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    }
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    boolean bool = localzbfd1.N();
    zanr localzanr = localzbfd1.Q();
    int k = localArrayList2.size();
    int m = localzbt2.j();
    int n = (int)localzbt2.D();
    int i1 = (int)localzbt2.z();
    float f2 = 0.0F;
    if ((localzbt2.f()) || (paramzjf.u()))
    {
      f2 = zbv.a(m, i1, n, paramzjf.U()) + 1;
    }
    else
    {
      f2 = zbv.a(m, i1, n, paramzjf.U());
      if (f2 == 0.0F) {
        f2 = 1.0F;
      }
      if (localzbt2.u) {
        f2 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f2;
    float f3 = 0.0F;
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    List localList = localzbff.a(paramInt, new int[] { i });
    ArrayList localArrayList5 = new ArrayList();
    int i2 = localzbff.a(paramzbfd, paramInt, new int[] { i });
    zbfd localzbfd2 = null;
    if (i2 > 0) {
      localzbfd2 = localzbff.a(i2 - 1, paramInt, new int[] { i });
    }
    if (localzbfd2 != null) {
      com.aspose.cells.b.a.a.zf.a(localArrayList5, localzbfd2);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList5, paramzbfd);
    for (int i3 = 0; i3 < localArrayList5.size(); i3++)
    {
      zbfd localzbfd3 = (zbfd)localArrayList5.get(i3);
      int i4 = localzbff.a(localzbfd3, paramInt, new int[] { i });
      int i5 = localzbfd3.ak();
      ArrayList localArrayList6 = new ArrayList();
      ArrayList localArrayList7 = new ArrayList();
      for (int i6 = 0; i6 < k; i6++)
      {
        zkf localzkf = localzbff.c(i5).F().b(i6);
        int i7 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList2.get(i6)));
        i7 = zbv.a(m, i7, paramzjf.U());
        int i8 = zbv.a(m, i7, n, paramzjf.U());
        float f4 = (float)(d3 * i8);
        f3 = (float)(d3 * zbv.a(m, zbv.a(localzbt2.j(), localzbt2.y(), (int)localzbt2.x(), i7, paramzjf.U()), i7, paramzjf.U()));
        if ((localzbt2.f()) || (paramzjf.u())) {
          f4 += (float)(d3 / 2.0D);
        }
        float f5 = 0.0F;
        if (localzbt2.p()) {
          f5 = paramzp.c() + paramzp.e() - f4;
        } else {
          f5 = paramzp.c() + f4;
        }
        if (localzkf != null)
        {
          double d4 = localzkf.w();
          double d5 = d4;
          for (int i10 = 0; i10 < i4; i10++)
          {
            localObject = ((zbfd)localList.get(i10)).F().b(i6);
            if (localObject != null)
            {
              double d6 = ((zkf)localObject).w();
              d5 += d6;
            }
          }
          float f6 = (float)(Math.abs(d5) / (localzbt1.z() - localzbt1.D()) * paramzp.f());
          if (!localzbt1.p())
          {
            if (d5 <= 0.0D) {
              f6 = f1 + f6;
            } else {
              f6 = f1 - f6;
            }
          }
          else if (d5 <= 0.0D) {
            f6 = f1 - f6;
          } else {
            f6 = f1 + f6;
          }
          Object localObject = new zo(f5, f6);
          zkn.a((zo)localObject, localArrayList6, localArrayList7, i6);
          if (localzbfd3.equals(paramzbfd))
          {
            zuc localzuc = paramzbfd.x();
            double d7 = 0.0D;
            double d8 = 0.0D;
            float f7 = 0.0F;
            float f8 = 0.0F;
            if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf.e()))
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
                double d9 = localzuc.e().size() > i6 ? localzuc.a(localzuc.e().get(i6)) : 0.0D;
                d7 = d9;
                d9 = localzuc.f().size() > i6 ? localzuc.a(localzuc.f().get(i6)) : 0.0D;
                d8 = d9;
                break;
              case 4: 
                d7 = localzuc.a(paramzbfd.F(), k);
                d8 = d7;
              }
              f7 = (float)d7 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
              f8 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
            }
            localzuc.a((zo)localObject, f7, f8);
          }
        }
        else
        {
          zo localzo = new zo(f5, paramFloat);
          for (int i9 = i3; i9 > 0; i9--) {
            if (((ArrayList)localArrayList3.get(i9 - 1)).get(i6) != null)
            {
              localzo = (zo)((ArrayList)localArrayList3.get(i9 - 1)).get(i6);
              break;
            }
          }
          if (i3 == 0) {
            localzo = new zo(f5, paramFloat);
          }
          zkn.a(localzo, localArrayList6, localArrayList7, i6);
        }
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      com.aspose.cells.b.a.a.zf.a(localArrayList4, localArrayList7);
    }
    a(paramzr, localArrayList5, localArrayList3, localArrayList4, paramFloat, bool, localzanr, localArrayList1, localzbt2, paramzp);
    return localArrayList1;
  }
  
  static ArrayList b(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramInt < 2) {
      return localArrayList1;
    }
    int i = paramzbfd.ah();
    int j = 2;
    zbt localzbt2;
    zbt localzbt1;
    if (i == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
    }
    if (localzbt2.k() == 2) {
      return d(paramzr, paramzjf, paramzbfd, paramzp, paramFloat, i);
    }
    float f1 = 0.0F;
    if (!localzbt1.p()) {
      f1 = paramzp.d() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    }
    zbff localzbff = paramzjf.z();
    int k = localzbff.getCount();
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    boolean bool = paramzbfd.N();
    zanr localzanr = paramzbfd.Q();
    float f2 = 0.0F;
    int m = paramInt;
    if (localzbt2.p) {
      m = (int)localzbt2.z();
    }
    if ((localzbt2.f()) || (paramzjf.u()))
    {
      f2 = m;
    }
    else
    {
      f2 = m - 1;
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
    List localList = localzbff.a(i, new int[] { j });
    ArrayList localArrayList4 = new ArrayList();
    int n = localzbff.a(paramzbfd, i, new int[] { j });
    zbfd localzbfd1 = null;
    if (n > 0) {
      localzbfd1 = localzbff.a(n - 1, i, new int[] { j });
    }
    if (localzbfd1 != null) {
      com.aspose.cells.b.a.a.zf.a(localArrayList4, localzbfd1);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList4, paramzbfd);
    for (int i1 = 0; i1 < localArrayList4.size(); i1++)
    {
      zbfd localzbfd2 = (zbfd)localArrayList4.get(i1);
      int i2 = localzbff.a(localzbfd2, i, new int[] { j });
      int i3 = localzbfd2.ak();
      ArrayList localArrayList5 = new ArrayList();
      ArrayList localArrayList6 = new ArrayList();
      zkh localzkh = localzbff.c(i3).F();
      for (int i4 = 0; i4 < paramInt; i4++)
      {
        zkf localzkf = localzkh.b(i4);
        double d4 = (float)d3 * i4;
        if ((localzbt2.f()) || (paramzjf.u())) {
          d4 += (float)(d3 / 2.0D);
        }
        if (localzbt2.p()) {
          d4 = paramzp.c() + paramzp.e() - d4;
        } else {
          d4 = paramzp.c() + d4;
        }
        if (localzkf != null)
        {
          double d5 = localzkf.w();
          double d6 = d5;
          double d7 = 0.0D;
          double d8;
          for (int i6 = 0; i6 < i2; i6++)
          {
            localObject = ((zbfd)localList.get(i6)).F().b(i4);
            if (localObject != null)
            {
              d8 = ((zkf)localObject).w();
              d6 += d8;
            }
          }
          for (i6 = 0; i6 < localList.size(); i6++)
          {
            localObject = ((zbfd)localList.get(i6)).F().b(i4);
            if (localObject != null)
            {
              d8 = ((zkf)localObject).w();
              d7 += Math.abs(d8);
            }
          }
          float f3 = 0.0F;
          if (d7 != 0.0D) {
            f3 = (float)Math.abs(d6) / (float)d7 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
          }
          if (!localzbt1.p())
          {
            if (d6 <= 0.0D) {
              f3 = f1 + f3;
            } else {
              f3 = f1 - f3;
            }
          }
          else if (d6 <= 0.0D) {
            f3 = f1 - f3;
          } else {
            f3 = f1 + f3;
          }
          Object localObject = new zo((float)d4, f3);
          zkn.a((zo)localObject, localArrayList5, localArrayList6, i4);
          if (localzbfd2.equals(paramzbfd))
          {
            zuc localzuc = paramzbfd.x();
            double d9 = 0.0D;
            double d10 = 0.0D;
            float f4 = 0.0F;
            float f5 = 0.0F;
            if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf.e()))
            {
              switch (localzuc.g())
              {
              case 1: 
                d9 = localzuc.c();
                d10 = d9;
                break;
              case 2: 
                d9 = localzuc.c() * d5 / 100.0D;
                d10 = -d9;
                break;
              case 0: 
                double d11 = localzuc.e().size() > i4 ? localzuc.a(localzuc.e().get(i4)) : 0.0D;
                d9 = d11;
                d11 = localzuc.f().size() > i4 ? localzuc.a(localzuc.f().get(i4)) : 0.0D;
                d10 = d11;
                break;
              case 4: 
                d9 = localzuc.a(paramzbfd.F(), paramInt);
                d10 = d9;
              }
              d10 = d10 * 100.0D / d7;
              d9 = d9 * 100.0D / d7;
              f4 = (float)d9 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
              f5 = (float)d10 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
            }
            localzuc.a((zo)localObject, f4, f5);
          }
        }
        else
        {
          zo localzo = new zo((float)d4, paramFloat);
          for (int i5 = i1; i5 > 0; i5--) {
            if (((ArrayList)localArrayList2.get(i5 - 1)).get(i4) != null)
            {
              localzo = (zo)((ArrayList)localArrayList2.get(i5 - 1)).get(i4);
              break;
            }
          }
          if (i1 == 0) {
            localzo = new zo((float)d4, paramFloat);
          }
          zkn.a(localzo, localArrayList5, localArrayList6, i4);
        }
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList5);
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
    }
    a(paramzr, localArrayList4, localArrayList2, localArrayList3, paramFloat, bool, localzanr, localArrayList1, localzbt2, paramzp);
    return localArrayList1;
  }
  
  private static ArrayList d(zr paramzr, zjf paramzjf, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    int i = 2;
    zbff localzbff = paramzjf.z();
    int j = localzbff.getCount();
    zbfd localzbfd1 = paramzjf.z().a(paramInt, i);
    if (localzbfd1 == null) {
      return localArrayList1;
    }
    zbt localzbt2;
    zbt localzbt1;
    ArrayList localArrayList2;
    if (paramInt == 1)
    {
      localzbt2 = paramzjf.e();
      localzbt1 = paramzjf.G();
      localArrayList2 = ziz.a(paramzjf.z().c(), paramzjf.U());
    }
    else
    {
      localzbt2 = paramzjf.g();
      localzbt1 = paramzjf.I();
      localArrayList2 = ziz.a(paramzjf.z().d(), paramzjf.U());
    }
    float f1 = 0.0F;
    if (!localzbt1.p()) {
      f1 = paramzp.d() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
    }
    double d1 = localzbt1.D();
    double d2 = localzbt1.z();
    boolean bool = localzbfd1.N();
    zanr localzanr = localzbfd1.Q();
    int k = localArrayList2.size();
    int m = localzbt2.j();
    int n = (int)localzbt2.D();
    int i1 = (int)localzbt2.z();
    float f2 = 0.0F;
    if ((localzbt2.f()) || (paramzjf.u()))
    {
      f2 = zbv.a(m, i1, n, paramzjf.U()) + 1;
    }
    else
    {
      f2 = zbv.a(m, i1, n, paramzjf.U());
      if (f2 == 0.0F) {
        f2 = 1.0F;
      }
      if (localzbt2.u) {
        f2 += 0.5F;
      }
    }
    double d3 = paramzp.e() / f2;
    float f3 = 0.0F;
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    List localList = localzbff.a(paramInt, new int[] { i });
    ArrayList localArrayList5 = new ArrayList();
    int i2 = localzbff.a(paramzbfd, paramInt, new int[] { i });
    zbfd localzbfd2 = null;
    if (i2 > 0) {
      localzbfd2 = localzbff.a(i2 - 1, paramInt, new int[] { i });
    }
    if (localzbfd2 != null) {
      com.aspose.cells.b.a.a.zf.a(localArrayList5, localzbfd2);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList5, paramzbfd);
    for (int i3 = 0; i3 < localArrayList5.size(); i3++)
    {
      zbfd localzbfd3 = (zbfd)localArrayList5.get(i3);
      int i4 = localzbff.a(localzbfd3, paramInt, new int[] { i });
      int i5 = localzbfd3.ak();
      ArrayList localArrayList6 = new ArrayList();
      ArrayList localArrayList7 = new ArrayList();
      for (int i6 = 0; i6 < k; i6++)
      {
        zkf localzkf = localzbff.c(i5).F().b(i6);
        int i7 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList2.get(i6)));
        i7 = zbv.a(m, i7, paramzjf.U());
        int i8 = zbv.a(m, i7, n, paramzjf.U());
        float f4 = (float)(d3 * i8);
        f3 = (float)(d3 * zbv.a(m, zbv.a(localzbt2.j(), localzbt2.y(), (int)localzbt2.x(), i7, paramzjf.U()), i7, paramzjf.U()));
        if ((localzbt2.f()) || (paramzjf.u())) {
          f4 += (float)(d3 / 2.0D);
        }
        float f5 = 0.0F;
        if (localzbt2.p()) {
          f5 = paramzp.c() + paramzp.e() - f4;
        } else {
          f5 = paramzp.c() + f4;
        }
        if (localzkf != null)
        {
          double d4 = localzkf.w();
          double d5 = d4;
          double d6 = 0.0D;
          double d7;
          for (int i10 = 0; i10 < i4; i10++)
          {
            localObject = ((zbfd)localList.get(i10)).F().b(i6);
            if (localObject != null)
            {
              d7 = ((zkf)localObject).w();
              d5 += d7;
            }
          }
          for (i10 = 0; i10 < localList.size(); i10++)
          {
            localObject = ((zbfd)localList.get(i10)).F().b(i6);
            if (localObject != null)
            {
              d7 = ((zkf)localObject).w();
              d6 += Math.abs(d7);
            }
          }
          float f6 = 0.0F;
          if (d6 != 0.0D) {
            f6 = (float)Math.abs(d5) / (float)d6 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
          }
          if (!localzbt1.p())
          {
            if (d5 <= 0.0D) {
              f6 = f1 + f6;
            } else {
              f6 = f1 - f6;
            }
          }
          else if (d5 <= 0.0D) {
            f6 = f1 - f6;
          } else {
            f6 = f1 + f6;
          }
          Object localObject = new zo(f5, f6);
          zkn.a((zo)localObject, localArrayList6, localArrayList7, i6);
          if (localzbfd3.equals(paramzbfd))
          {
            zuc localzuc = paramzbfd.x();
            double d8 = 0.0D;
            double d9 = 0.0D;
            float f7 = 0.0F;
            float f8 = 0.0F;
            if ((localzuc != null) && (localzuc.d() != 2) && (!localzkf.e()))
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
                double d10 = localzuc.e().size() > i6 ? localzuc.a(localzuc.e().get(i6)) : 0.0D;
                d8 = d10;
                d10 = localzuc.f().size() > i6 ? localzuc.a(localzuc.f().get(i6)) : 0.0D;
                d9 = d10;
                break;
              case 4: 
                d8 = localzuc.a(paramzbfd.F(), k);
                d9 = d8;
              }
              d9 = d9 * 100.0D / d6;
              d8 = d8 * 100.0D / d6;
              f7 = (float)d8 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
              f8 = (float)d9 / (float)(localzbt1.z() - localzbt1.D()) * paramzp.f();
            }
            localzuc.a((zo)localObject, f7, f8);
          }
        }
        else
        {
          zo localzo = new zo(f5, paramFloat);
          for (int i9 = i3; i9 > 0; i9--) {
            if (((ArrayList)localArrayList3.get(i9 - 1)).get(i6) != null)
            {
              localzo = (zo)((ArrayList)localArrayList3.get(i9 - 1)).get(i6);
              break;
            }
          }
          if (i3 == 0) {
            localzo = new zo(f5, paramFloat);
          }
          zkn.a(localzo, localArrayList6, localArrayList7, i6);
        }
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      com.aspose.cells.b.a.a.zf.a(localArrayList4, localArrayList7);
    }
    a(paramzr, localArrayList5, localArrayList3, localArrayList4, paramFloat, bool, localzanr, localArrayList1, localzbt2, paramzp);
    return localArrayList1;
  }
  
  private static void a(zr paramzr, zbfd paramzbfd, List paramList1, List paramList2, ArrayList paramArrayList1, float paramFloat, boolean paramBoolean, zanr paramzanr, ArrayList paramArrayList2, zbt paramzbt, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    for (int i = 0; i < paramList1.size(); i++)
    {
      localObject1 = (zo)paramList1.get(i);
      localObject2 = paramzbfd.F().b(((Integer)paramList2.get(i)).intValue());
      if (localObject2 != null)
      {
        ((zkf)localObject2).a(new zq(((zo)localObject1).d(), ((zo)localObject1).e(), 0.0F, 0.0F));
        com.aspose.cells.b.a.a.zf.a(((zkf)localObject2).b, new zo(((zo)localObject1).d(), ((zo)localObject1).e()));
        com.aspose.cells.b.a.a.zf.a(((zkf)localObject2).d, new zo(((zo)localObject1).d(), paramFloat));
      }
    }
    if (paramList1.size() < 2) {
      return;
    }
    com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(paramzp.c(), paramzp.d() + 1, paramzp.e(), paramzp.f() + 1);
    Object localObject1 = paramzr.d();
    Object localObject2 = paramzr.e();
    paramzr.a(localzp);
    Object localObject4;
    Object localObject5;
    if (!paramzbfd.aE())
    {
      for (int j = 0; j < paramList1.size(); j++)
      {
        localObject4 = (zo)paramList1.get(j);
        if (!a(j, paramArrayList1))
        {
          localObject5 = paramzbfd.F().b(((Integer)paramList2.get(j)).intValue());
          if ((localObject5 != null) && (!((zkf)localObject5).z()))
          {
            Object[] arrayOfObject = new Object[4];
            arrayOfObject[0] = Integer.valueOf(paramzbfd.ak());
            arrayOfObject[1] = ((Integer)paramList2.get(j));
            arrayOfObject[2] = new zo(((zo)localObject4).d(), (((zo)localObject4).e() + paramFloat) / 2.0F);
            arrayOfObject[3] = paramzbt;
            com.aspose.cells.b.a.a.zf.a(paramArrayList2, arrayOfObject);
          }
        }
      }
    }
    else
    {
      localObject3 = zo.a();
      if (paramList1.size() % 2 == 0)
      {
        localObject4 = (zo)paramList1.get(paramList1.size() / 2);
        localObject5 = (zo)paramList1.get(paramList1.size() / 2 - 1);
        ((zo)localObject3).a((((zo)localObject4).d() + ((zo)localObject5).d()) / 2.0F);
        ((zo)localObject3).b(((((zo)localObject4).e() + paramFloat) / 2.0F + (((zo)localObject5).e() + paramFloat) / 2.0F) / 2.0F);
      }
      else
      {
        localObject4 = (zo)paramList1.get(paramList1.size() / 2);
        localObject3 = new zo(((zo)localObject4).d(), (((zo)localObject4).e() + paramFloat) / 2.0F);
      }
      localObject4 = paramzbfd.F().b(0);
      if ((localObject4 != null) && (!((zkf)localObject4).z()))
      {
        localObject5 = new Object[4];
        localObject5[0] = Integer.valueOf(paramzbfd.ak());
        localObject5[1] = Integer.valueOf(0);
        localObject5[2] = localObject3;
        localObject5[3] = paramzbt;
        com.aspose.cells.b.a.a.zf.a(paramArrayList2, localObject5);
      }
    }
    Object localObject3 = new ArrayList();
    for (int k = 0; k < paramList1.size(); k++)
    {
      localObject5 = (zo)paramList1.get(k);
      int m = ((Integer)paramList2.get(k)).intValue();
      if ((a(m, paramArrayList1)) || (k == paramList1.size() - 1))
      {
        if ((!a(m, paramArrayList1)) && (k == paramList1.size() - 1)) {
          com.aspose.cells.b.a.a.zf.a((ArrayList)localObject3, localObject5);
        }
        if (((ArrayList)localObject3).size() > 1)
        {
          zo[] arrayOfzo = new zo[2 * ((ArrayList)localObject3).size()];
          zbxz.a(arrayOfzo);
          for (int n = 0; n < ((ArrayList)localObject3).size(); n++)
          {
            localzo = (zo)((ArrayList)localObject3).get(n);
            arrayOfzo[n] = localzo;
            arrayOfzo[(arrayOfzo.length - 1 - n)] = new zo(localzo.d(), paramFloat);
          }
          ze localze = new ze();
          localze.b(arrayOfzo);
          paramzbfd.A().a(localze);
          paramzbfd.z().a(localze);
          zo localzo = arrayOfzo[0];
          paramzbfd.z().a(localzo.d(), localzo.e(), localzo.d(), paramFloat);
        }
        localObject3 = new ArrayList();
      }
      else
      {
        com.aspose.cells.b.a.a.zf.a((ArrayList)localObject3, localObject5);
      }
    }
    if (paramBoolean) {
      for (k = 1; k < paramList1.size() - 1; k++)
      {
        localObject5 = (zo)paramList1.get(k);
        if (!a(k, paramArrayList1)) {
          paramzanr.a(((zo)localObject5).d(), ((zo)localObject5).e(), ((zo)localObject5).d(), paramFloat);
        }
      }
    }
    paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject1);
  }
  
  private static boolean a(int paramInt, ArrayList paramArrayList)
  {
    for (int i = 0; i < paramArrayList.size(); i++) {
      if (((Integer)paramArrayList.get(i)).intValue() == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  private static void a(zr paramzr, List paramList1, List paramList2, List paramList3, float paramFloat, boolean paramBoolean, zanr paramzanr, ArrayList paramArrayList, zbt paramzbt, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    Object localObject2;
    Object localObject3;
    Object localObject4;
    for (int i = paramList2.size() - 1; i < paramList2.size(); i++)
    {
      localObject1 = (ArrayList)paramList2.get(i);
      ArrayList localArrayList1 = (ArrayList)paramList3.get(i);
      localObject2 = (zbfd)paramList1.get(i);
      for (int k = 0; k < ((ArrayList)localObject1).size(); k++)
      {
        localObject3 = (zo)((ArrayList)localObject1).get(k);
        localObject4 = ((zbfd)localObject2).F().b(((Integer)localArrayList1.get(k)).intValue());
        if (localObject4 != null)
        {
          ((zkf)localObject4).a(new zq(((zo)localObject3).d(), ((zo)localObject3).e(), 0.0F, 0.0F));
          com.aspose.cells.b.a.a.zf.a(((zkf)localObject4).b, new zo(((zo)localObject3).d(), ((zo)localObject3).e()));
          com.aspose.cells.b.a.a.zf.a(((zkf)localObject4).d, new zo(((zo)localObject3).d(), paramFloat));
        }
      }
    }
    zq localzq = new zq(paramzp.c(), paramzp.d() + 0.5F, paramzp.e(), paramzp.f() + 1);
    Object localObject1 = paramzr.d();
    paramzr.a(localzq);
    for (int j = paramList2.size() - 1; j < paramList2.size(); j++)
    {
      localObject2 = (ArrayList)paramList2.get(j);
      ArrayList localArrayList2 = (ArrayList)paramList3.get(j);
      localObject3 = (zbfd)paramList1.get(j);
      localObject4 = null;
      if (j > 0) {
        localObject4 = (ArrayList)paramList2.get(j - 1);
      }
      if (((ArrayList)localObject2).size() >= 2)
      {
        zo localzo1 = (zo)((ArrayList)localObject2).get(0);
        ((zbfd)localObject3).z().a(localzo1.d(), localzo1.e(), localzo1.d(), paramFloat);
        zo[] arrayOfzo = new zo[2 * ((ArrayList)localObject2).size()];
        zbxz.a(arrayOfzo);
        Object localObject6;
        for (int n = 0; n < ((ArrayList)localObject2).size(); n++)
        {
          localObject6 = (zo)((ArrayList)localObject2).get(n);
          arrayOfzo[n] = localObject6;
          if (localObject4 == null) {
            arrayOfzo[(arrayOfzo.length - 1 - n)] = new zo(((zo)localObject6).d(), paramFloat);
          } else {
            arrayOfzo[(arrayOfzo.length - 1 - n)] = ((zo)((ArrayList)localObject4).get(n));
          }
        }
        Object localObject7;
        if (!((zbfd)localObject3).aE())
        {
          for (n = 0; n < ((ArrayList)localObject2).size(); n++) {
            if (((zbfd)localObject3).k().a(n) != null)
            {
              localObject6 = (zo)((ArrayList)localObject2).get(n);
              localObject7 = new Object[4];
              localObject7[0] = Integer.valueOf(((zbfd)localObject3).ak());
              localObject7[1] = ((Integer)localArrayList2.get(n));
              localObject7[2] = new zo(((zo)localObject6).d(), (((zo)localObject6).e() + arrayOfzo[(arrayOfzo.length - 1 - n)].e()) / 2.0F);
              localObject7[3] = paramzbt;
              com.aspose.cells.b.a.a.zf.a(paramArrayList, localObject7);
            }
          }
        }
        else
        {
          localObject5 = zo.a();
          if (((ArrayList)localObject2).size() % 2 == 0)
          {
            localObject6 = (zo)((ArrayList)localObject2).get(((ArrayList)localObject2).size() / 2);
            localObject7 = (zo)((ArrayList)localObject2).get(((ArrayList)localObject2).size() / 2 - 1);
            if (localObject4 == null)
            {
              ((zo)localObject5).a((((zo)localObject6).d() + ((zo)localObject7).d()) / 2.0F);
              ((zo)localObject5).b(((((zo)localObject6).e() + paramFloat) / 2.0F + (((zo)localObject7).e() + paramFloat) / 2.0F) / 2.0F);
            }
            else
            {
              zo localzo2 = (zo)((ArrayList)localObject4).get(((ArrayList)localObject2).size() / 2);
              zo localzo3 = (zo)((ArrayList)localObject4).get(((ArrayList)localObject2).size() / 2 - 1);
              ((zo)localObject5).a((((zo)localObject6).d() + ((zo)localObject7).d()) / 2.0F);
              ((zo)localObject5).b(((((zo)localObject6).e() + localzo2.e()) / 2.0F + (((zo)localObject7).e() + localzo3.e()) / 2.0F) / 2.0F);
            }
          }
          else
          {
            localObject6 = (zo)((ArrayList)localObject2).get(((ArrayList)localObject2).size() / 2);
            if (localObject4 == null)
            {
              localObject5 = new zo(((zo)localObject6).d(), (((zo)localObject6).e() + paramFloat) / 2.0F);
            }
            else
            {
              localObject7 = (zo)((ArrayList)localObject4).get(((ArrayList)localObject2).size() / 2);
              localObject5 = new zo(((zo)localObject6).d(), (((zo)localObject6).e() + ((zo)localObject7).e()) / 2.0F);
            }
          }
          if (((zbfd)localObject3).k().a(0) != null)
          {
            localObject6 = new Object[4];
            localObject6[0] = Integer.valueOf(((zbfd)localObject3).ak());
            localObject6[1] = Integer.valueOf(0);
            localObject6[2] = localObject5;
            localObject6[3] = paramzbt;
            com.aspose.cells.b.a.a.zf.a(paramArrayList, localObject6);
          }
        }
        Object localObject5 = new ze();
        ((ze)localObject5).b(arrayOfzo);
        ((zbfd)localObject3).A().a((ze)localObject5);
        ((zbfd)localObject3).z().a((ze)localObject5);
      }
    }
    if (paramBoolean) {
      for (j = 0; j < paramList2.size(); j++)
      {
        localObject2 = (ArrayList)paramList2.get(j);
        for (int m = 1; m < ((ArrayList)localObject2).size() - 1; m++)
        {
          localObject3 = (zo)((ArrayList)localObject2).get(m);
          paramzanr.a(((zo)localObject3).d(), ((zo)localObject3).e(), ((zo)localObject3).d(), paramFloat);
        }
      }
    }
    paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject1);
  }
  
  static ArrayList a(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramInt < 2) {
      return localArrayList1;
    }
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzjf, paramFloat, paramDouble);
    }
    float f1 = paramzjf.m() / 100.0F;
    float f2 = paramzjf.n() / 100.0F;
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
    Object localObject1;
    ArrayList localArrayList4;
    int i2;
    int i3;
    float f5;
    int i4;
    zkf localzkf1;
    double d1;
    float f6;
    zo[] arrayOfzo1;
    zo[] arrayOfzo2;
    Object localObject2;
    zo[] arrayOfzo3;
    zo localzo3;
    Object[] arrayOfObject3;
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
        localObject1 = null;
        localArrayList4 = new ArrayList();
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
          localzkf1 = localzkh.b(i4);
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkf1);
          d1 = 0.0D;
          if ((localzkf1 != null) && (!localzkf1.a()))
          {
            d1 = localzkf1.w();
            localObject1 = localzkf1;
          }
          f6 = (float)((paramDouble - d1) / (localzbt1.z() - localzbt1.D()) * paramzjf.S().i());
          if (localzbt1.p()) {
            f6 = -f6;
          }
          arrayOfzo1 = zlr.a(paramzr, paramzjf, paramFloat, 0.0F, f5, f4, i1 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo1);
          arrayOfzo2 = zlr.a(paramzr, paramzjf, paramFloat, f6, f5, f4, i1 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo2);
          if ((localzkf1 != null) && (!localzkf1.a())) {
            if (!localzbfd.aE())
            {
              zo localzo1 = new zo(0.0F, 0.0F);
              if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
              {
                localzo1.a((arrayOfzo1[1].d() + arrayOfzo2[1].d()) / 2.0F);
                localzo1.b((arrayOfzo1[1].e() + arrayOfzo2[1].e()) / 2.0F);
              }
              else
              {
                localzo1.a((arrayOfzo1[0].d() + arrayOfzo2[0].d()) / 2.0F);
                localzo1.b((arrayOfzo1[0].e() + arrayOfzo2[0].e()) / 2.0F);
              }
              Object[] arrayOfObject1 = new Object[3];
              arrayOfObject1[0] = Integer.valueOf(i1);
              arrayOfObject1[1] = Integer.valueOf(i4);
              arrayOfObject1[2] = localzo1;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject1);
            }
            else if (i4 == 0)
            {
              float f7 = paramzjf.S().g() / 2.0F;
              f7 = paramzjf.S().e() + f7;
              double d2 = 0.0D;
              zkf localzkf2;
              if (paramInt % 2 == 0)
              {
                localzkf2 = localzkh.b(paramInt / 2);
                localObject2 = localzkh.b(paramInt / 2 - 1);
                d2 = (localzkf2.w() + ((zkf)localObject2).w()) / 2.0D;
              }
              else
              {
                localzkf2 = localzkh.b(paramInt / 2);
                d2 = localzkf2.w();
              }
              float f9 = (float)(paramDouble - d2) / (float)(localzbt1.z() - localzbt1.D()) * paramzjf.S().i();
              if (localzbt1.p()) {
                f9 = -f9;
              }
              localObject2 = zlr.a(paramzr, paramzjf, paramFloat, 0.0F, f7, f4, i1 + 1, localArrayList3.size());
              arrayOfzo3 = zlr.a(paramzr, paramzjf, paramFloat, f9, f7, f4, i1 + 1, localArrayList3.size());
              localzo3 = new zo(0.0F, 0.0F);
              if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
              {
                localzo3.a((localObject2[1].d() + arrayOfzo3[1].d()) / 2.0F);
                localzo3.b((localObject2[1].e() + arrayOfzo3[1].e()) / 2.0F);
              }
              else
              {
                localzo3.a((localObject2[0].d() + arrayOfzo3[0].d()) / 2.0F);
                localzo3.b((localObject2[0].e() + arrayOfzo3[0].e()) / 2.0F);
              }
              arrayOfObject3 = new Object[3];
              arrayOfObject3[0] = Integer.valueOf(i1);
              arrayOfObject3[1] = Integer.valueOf(i4);
              arrayOfObject3[2] = localzo3;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject3);
            }
          }
        }
        a(paramzr, paramzjf, localzbfd, (zkf)localObject1, localArrayList2, localArrayList4);
        localArrayList4.clear();
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
        localObject1 = null;
        localArrayList4 = new ArrayList();
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
          localzkf1 = localzkh.b(i4);
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzkf1);
          d1 = localzkf1.w();
          if ((localzkf1 != null) && (!localzkf1.a()))
          {
            d1 = localzkf1.w();
            localObject1 = localzkf1;
          }
          f6 = (float)((paramDouble - d1) / (localzbt1.z() - localzbt1.D()) * paramzjf.S().i());
          if (localzbt1.p()) {
            f6 = -f6;
          }
          arrayOfzo1 = zlr.a(paramzr, paramzjf, paramFloat, 0.0F, f5, f4, i1 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo1);
          arrayOfzo2 = zlr.a(paramzr, paramzjf, paramFloat, f6, f5, f4, i1 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo2);
          if ((localzkf1 != null) && (!localzkf1.a())) {
            if (!localzbfd.aE())
            {
              zo localzo2 = new zo(0.0F, 0.0F);
              if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
              {
                localzo2.a((arrayOfzo1[1].d() + arrayOfzo2[1].d()) / 2.0F);
                localzo2.b((arrayOfzo1[1].e() + arrayOfzo2[1].e()) / 2.0F);
              }
              else
              {
                localzo2.a((arrayOfzo1[0].d() + arrayOfzo2[0].d()) / 2.0F);
                localzo2.b((arrayOfzo1[0].e() + arrayOfzo2[0].e()) / 2.0F);
              }
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(i1);
              arrayOfObject2[1] = Integer.valueOf(i4);
              arrayOfObject2[2] = localzo2;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
            }
            else if (i4 == 0)
            {
              float f8 = paramzjf.S().g() / 2.0F;
              f8 = paramzjf.S().e() + f8;
              double d3 = 0.0D;
              zkf localzkf3;
              if (paramInt % 2 == 0)
              {
                localzkf3 = localzkh.b(paramInt / 2);
                localObject2 = localzkh.b(paramInt / 2 - 1);
                d3 = (localzkf3.w() + ((zkf)localObject2).w()) / 2.0D;
              }
              else
              {
                localzkf3 = localzkh.b(paramInt / 2);
                d3 = localzkf3.w();
              }
              float f10 = (float)(paramDouble - d3) / (float)(localzbt1.z() - localzbt1.D()) * paramzjf.S().i();
              if (localzbt1.p()) {
                f10 = -f10;
              }
              localObject2 = zlr.a(paramzr, paramzjf, paramFloat, 0.0F, f8, f4, i1 + 1, localArrayList3.size());
              arrayOfzo3 = zlr.a(paramzr, paramzjf, paramFloat, f10, f8, f4, i1 + 1, localArrayList3.size());
              localzo3 = new zo(0.0F, 0.0F);
              if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
              {
                localzo3.a((localObject2[1].d() + arrayOfzo3[1].d()) / 2.0F);
                localzo3.b((localObject2[1].e() + arrayOfzo3[1].e()) / 2.0F);
              }
              else
              {
                localzo3.a((localObject2[0].d() + arrayOfzo3[0].d()) / 2.0F);
                localzo3.b((localObject2[0].e() + arrayOfzo3[0].e()) / 2.0F);
              }
              arrayOfObject3 = new Object[3];
              arrayOfObject3[0] = Integer.valueOf(i1);
              arrayOfObject3[1] = Integer.valueOf(i4);
              arrayOfObject3[2] = localzo3;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject3);
            }
          }
        }
        a(paramzr, paramzjf, localzbfd, (zkf)localObject1, localArrayList2, localArrayList4);
        localArrayList4.clear();
        localArrayList2.clear();
      }
    }
    return localArrayList1;
  }
  
  private static ArrayList a(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    float f1 = paramzjf.m() / 100.0F;
    float f2 = paramzjf.n() / 100.0F;
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
    Object localObject1;
    ArrayList localArrayList5;
    int i6;
    int i7;
    int i8;
    int i9;
    float f5;
    float f6;
    int i10;
    zkf localzkf1;
    double d1;
    float f7;
    zo[] arrayOfzo1;
    zo[] arrayOfzo2;
    Object localObject2;
    zo[] arrayOfzo3;
    zo localzo3;
    Object[] arrayOfObject3;
    if (((paramzjf.E() >= 0) && (paramzjf.E() < 90)) || ((paramzjf.E() >= 180) && (paramzjf.E() < 270))) {
      for (i3 = 0; i3 < localArrayList3.size(); i3++)
      {
        i4 = localArrayList3.size() - 1 - i3;
        if ((paramzjf.E() >= 180) && (paramzjf.E() < 270)) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        if (paramzjf.K().p()) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        localzbfd = (zbfd)localArrayList3.get(i4);
        i5 = localzbfd.ak();
        localzkh = localzbfd.F();
        localObject1 = null;
        localArrayList5 = new ArrayList();
        for (i6 = 0; i6 < i2; i6++)
        {
          i7 = i6;
          if ((paramzjf.E() >= 180) && (paramzjf.E() < 270)) {
            i7 = i2 - 1 - i7;
          }
          i8 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList4.get(i7)));
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
          localzkf1 = localzkh.b(i10);
          com.aspose.cells.b.a.a.zf.a(localArrayList5, localzkf1);
          d1 = 0.0D;
          if ((localzkf1 != null) && (!localzkf1.a()))
          {
            d1 = localzkf1.w();
            localObject1 = localzkf1;
          }
          f7 = (float)((paramDouble - d1) / (localzbt1.z() - localzbt1.D()) * paramzjf.S().i());
          if (localzbt1.p()) {
            f7 = -f7;
          }
          arrayOfzo1 = zlr.a(paramzr, paramzjf, paramFloat, 0.0F, f6, f4, i5 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo1);
          arrayOfzo2 = zlr.a(paramzr, paramzjf, paramFloat, f7, f6, f4, i5 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo2);
          if ((localzkf1 != null) && (!localzkf1.a())) {
            if (!localzbfd.aE())
            {
              zo localzo1 = new zo(0.0F, 0.0F);
              if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
              {
                localzo1.a((arrayOfzo1[1].d() + arrayOfzo2[1].d()) / 2.0F);
                localzo1.b((arrayOfzo1[1].e() + arrayOfzo2[1].e()) / 2.0F);
              }
              else
              {
                localzo1.a((arrayOfzo1[0].d() + arrayOfzo2[0].d()) / 2.0F);
                localzo1.b((arrayOfzo1[0].e() + arrayOfzo2[0].e()) / 2.0F);
              }
              Object[] arrayOfObject1 = new Object[3];
              arrayOfObject1[0] = Integer.valueOf(i5);
              arrayOfObject1[1] = Integer.valueOf(i10);
              arrayOfObject1[2] = localzo1;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject1);
            }
            else if (i10 == 0)
            {
              float f8 = paramzjf.S().g() / 2.0F;
              f8 = paramzjf.S().e() + f8;
              double d2 = 0.0D;
              zkf localzkf2;
              if (i2 % 2 == 0)
              {
                localzkf2 = localzkh.b(i2 / 2);
                localObject2 = localzkh.b(i2 / 2 - 1);
                d2 = (localzkf2.w() + ((zkf)localObject2).w()) / 2.0D;
              }
              else
              {
                localzkf2 = localzkh.b(i2 / 2);
                d2 = localzkf2.w();
              }
              float f10 = (float)(paramDouble - d2) / (float)(localzbt1.z() - localzbt1.D()) * paramzjf.S().i();
              if (localzbt1.p()) {
                f10 = -f10;
              }
              localObject2 = zlr.a(paramzr, paramzjf, paramFloat, 0.0F, f8, f4, i5 + 1, localArrayList3.size());
              arrayOfzo3 = zlr.a(paramzr, paramzjf, paramFloat, f10, f8, f4, i5 + 1, localArrayList3.size());
              localzo3 = new zo(0.0F, 0.0F);
              if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
              {
                localzo3.a((localObject2[1].d() + arrayOfzo3[1].d()) / 2.0F);
                localzo3.b((localObject2[1].e() + arrayOfzo3[1].e()) / 2.0F);
              }
              else
              {
                localzo3.a((localObject2[0].d() + arrayOfzo3[0].d()) / 2.0F);
                localzo3.b((localObject2[0].e() + arrayOfzo3[0].e()) / 2.0F);
              }
              arrayOfObject3 = new Object[3];
              arrayOfObject3[0] = Integer.valueOf(i5);
              arrayOfObject3[1] = Integer.valueOf(i10);
              arrayOfObject3[2] = localzo3;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject3);
            }
          }
        }
        a(paramzr, paramzjf, localzbfd, (zkf)localObject1, localArrayList2, localArrayList5);
        localArrayList5.clear();
        localArrayList2.clear();
      }
    } else if (((paramzjf.E() >= 90) && (paramzjf.E() < 180)) || ((paramzjf.E() >= 270) && (paramzjf.E() < 360))) {
      for (i3 = 0; i3 < localArrayList3.size(); i3++)
      {
        i4 = i3;
        if ((paramzjf.E() >= 270) && (paramzjf.E() < 360)) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        if (paramzjf.K().p()) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        localzbfd = (zbfd)localArrayList3.get(i4);
        i5 = localzbfd.ak();
        localzkh = localzbfd.F();
        localObject1 = null;
        localArrayList5 = new ArrayList();
        for (i6 = 0; i6 < i2; i6++)
        {
          i7 = i6;
          if ((paramzjf.E() >= 270) && (paramzjf.E() < 360)) {
            i7 = i2 - 1 - i7;
          }
          i8 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList4.get(i7)));
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
          localzkf1 = localzkh.b(i10);
          com.aspose.cells.b.a.a.zf.a(localArrayList5, localzkf1);
          d1 = localzkf1.w();
          if ((localzkf1 != null) && (!localzkf1.a()))
          {
            d1 = localzkf1.w();
            localObject1 = localzkf1;
          }
          f7 = (float)((paramDouble - d1) / (localzbt1.z() - localzbt1.D()) * paramzjf.S().i());
          if (localzbt1.p()) {
            f7 = -f7;
          }
          arrayOfzo1 = zlr.a(paramzr, paramzjf, paramFloat, 0.0F, f6, f4, i5 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo1);
          arrayOfzo2 = zlr.a(paramzr, paramzjf, paramFloat, f7, f6, f4, i5 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo2);
          if ((localzkf1 != null) && (!localzkf1.a())) {
            if (!localzbfd.aE())
            {
              zo localzo2 = new zo(0.0F, 0.0F);
              if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
              {
                localzo2.a((arrayOfzo1[1].d() + arrayOfzo2[1].d()) / 2.0F);
                localzo2.b((arrayOfzo1[1].e() + arrayOfzo2[1].e()) / 2.0F);
              }
              else
              {
                localzo2.a((arrayOfzo1[0].d() + arrayOfzo2[0].d()) / 2.0F);
                localzo2.b((arrayOfzo1[0].e() + arrayOfzo2[0].e()) / 2.0F);
              }
              Object[] arrayOfObject2 = new Object[3];
              arrayOfObject2[0] = Integer.valueOf(i5);
              arrayOfObject2[1] = Integer.valueOf(i10);
              arrayOfObject2[2] = localzo2;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject2);
            }
            else if (i10 == 0)
            {
              float f9 = paramzjf.S().g() / 2.0F;
              f9 = paramzjf.S().e() + f9;
              double d3 = 0.0D;
              zkf localzkf3;
              if (i2 % 2 == 0)
              {
                localzkf3 = localzkh.b(i2 / 2);
                localObject2 = localzkh.b(i2 / 2 - 1);
                d3 = (localzkf3.w() + ((zkf)localObject2).w()) / 2.0D;
              }
              else
              {
                localzkf3 = localzkh.b(i2 / 2);
                d3 = localzkf3.w();
              }
              float f11 = (float)(paramDouble - d3) / (float)(localzbt1.z() - localzbt1.D()) * paramzjf.S().i();
              if (localzbt1.p()) {
                f11 = -f11;
              }
              localObject2 = zlr.a(paramzr, paramzjf, paramFloat, 0.0F, f9, f4, i5 + 1, localArrayList3.size());
              arrayOfzo3 = zlr.a(paramzr, paramzjf, paramFloat, f11, f9, f4, i5 + 1, localArrayList3.size());
              localzo3 = new zo(0.0F, 0.0F);
              if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
              {
                localzo3.a((localObject2[1].d() + arrayOfzo3[1].d()) / 2.0F);
                localzo3.b((localObject2[1].e() + arrayOfzo3[1].e()) / 2.0F);
              }
              else
              {
                localzo3.a((localObject2[0].d() + arrayOfzo3[0].d()) / 2.0F);
                localzo3.b((localObject2[0].e() + arrayOfzo3[0].e()) / 2.0F);
              }
              arrayOfObject3 = new Object[3];
              arrayOfObject3[0] = Integer.valueOf(i5);
              arrayOfObject3[1] = Integer.valueOf(i10);
              arrayOfObject3[2] = localzo3;
              com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject3);
            }
          }
        }
        a(paramzr, paramzjf, localzbfd, (zkf)localObject1, localArrayList2, localArrayList5);
        localArrayList5.clear();
        localArrayList2.clear();
      }
    }
    return localArrayList1;
  }
  
  static ArrayList a(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble, int paramInt, boolean paramBoolean)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramInt < 2) {
      return localArrayList1;
    }
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    if (localzbt2.k() == 2) {
      return a(paramzr, paramzjf, paramFloat, paramDouble, paramBoolean);
    }
    float f1 = paramzjf.m() / 100.0F;
    float f2 = paramzjf.n() / 100.0F;
    float f3 = paramzjf.o() / 100.0F;
    float f4 = 0.0F;
    if (!localzbt1.p()) {
      f4 = paramzjf.S().f() - paramzjf.S().i() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzjf.S().i();
    } else {
      f4 = paramzjf.S().f() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzjf.S().i();
    }
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
    float f5 = paramzjf.S().g() / j;
    float f6 = f5 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    for (int m = 0; m < paramInt; m++)
    {
      float f7 = paramzjf.S().e() + f5 * m;
      if (k != 0) {
        f7 += f5 / 2.0F;
      }
      localObject1 = a(paramzjf, f7, f6, f4, paramzr);
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localObject1);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList3);
    ArrayList localArrayList4 = localzbff.j();
    zkf[] arrayOfzkf = new zkf[localArrayList4.size()];
    Object localObject1 = new ArrayList[localArrayList4.size()];
    Object localObject2 = null;
    for (int n = 0; n < localArrayList4.size(); n++)
    {
      zbfd localzbfd = (zbfd)localArrayList4.get(n);
      int i1 = localzbfd.ak();
      int i2 = n;
      zkh localzkh = localzbfd.F();
      ArrayList localArrayList5 = new ArrayList();
      if (n == 0) {
        localObject2 = localArrayList3;
      }
      ArrayList localArrayList6 = new ArrayList();
      for (int i3 = 0; i3 < paramInt; i3++)
      {
        int i4 = i3;
        float f8 = f5 * i4;
        f8 = paramzjf.S().e() + f8;
        if (k != 0) {
          f8 += f5 / 2.0F;
        }
        int i5 = i4;
        if (localzbt2.p()) {
          i5 = paramInt - 1 - i4;
        }
        zkf localzkf1 = localzkh.b(i5);
        com.aspose.cells.b.a.a.zf.a(localArrayList6, localzkf1);
        double d1 = 0.0D;
        double d2 = 0.0D;
        double d3 = 0.0D;
        zkf localzkf2;
        double d4;
        if (localzkf1 != null)
        {
          arrayOfzkf[n] = localzkf1;
          d1 = localzkf1.w();
          d2 = d1;
          for (i6 = 0; i6 < i2; i6++)
          {
            localzkf2 = ((zbfd)localArrayList4.get(i6)).F().b(i5);
            if (localzkf2 != null)
            {
              d4 = localzkf2.w();
              d2 += d4;
            }
          }
        }
        for (int i6 = 0; i6 < localArrayList4.size(); i6++)
        {
          localzkf2 = ((zbfd)localArrayList4.get(i6)).F().b(i5);
          if (localzkf2 != null)
          {
            d4 = localzkf2.w();
            d3 += Math.abs(d4);
          }
        }
        float f9;
        if (!paramBoolean)
        {
          f9 = (float)Math.abs(d2) / (float)(localzbt1.z() - localzbt1.D()) * paramzjf.S().i();
        }
        else
        {
          if (d3 == 0.0D)
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList5, ((ArrayList)localObject2).get(i4));
            continue;
          }
          f9 = (float)Math.abs(d2) / (float)d3 / (float)(localzbt1.z() - localzbt1.D()) * paramzjf.S().i();
        }
        float f10;
        if (!localzbt1.p())
        {
          if (d2 <= 0.0D) {
            f10 = f4 + f9;
          } else {
            f10 = f4 - f9;
          }
        }
        else if (d2 <= 0.0D) {
          f10 = f4 - f9;
        } else {
          f10 = f4 + f9;
        }
        zo[] arrayOfzo1 = a(paramzjf, f8, f6, f10, paramzr);
        com.aspose.cells.b.a.a.zf.a(localArrayList5, arrayOfzo1);
        if ((localzkf1 != null) && (!localzkf1.a()))
        {
          Object localObject3;
          zo[] arrayOfzo2;
          Object localObject4;
          if (!localzbfd.aE())
          {
            localObject3 = new zo(0.0F, 0.0F);
            arrayOfzo2 = (zo[])((ArrayList)localObject2).get(i4);
            if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
            {
              ((zo)localObject3).a(arrayOfzo1[1].d());
              ((zo)localObject3).b((arrayOfzo2[1].e() + arrayOfzo1[1].e()) / 2.0F);
            }
            else
            {
              ((zo)localObject3).a(arrayOfzo1[0].d());
              ((zo)localObject3).b((arrayOfzo2[0].e() + arrayOfzo1[0].e()) / 2.0F);
            }
            localObject4 = new Object[3];
            localObject4[0] = Integer.valueOf(i1);
            localObject4[1] = Integer.valueOf(i5);
            localObject4[2] = localObject3;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, localObject4);
          }
          else if (i3 == paramInt - 1)
          {
            localObject3 = (zo[])localArrayList5.get(paramInt / 2 - 1);
            arrayOfzo2 = (zo[])localArrayList5.get(paramInt / 2);
            localObject4 = (zo[])((ArrayList)localObject2).get(paramInt / 2 - 1);
            zo[] arrayOfzo3 = (zo[])((ArrayList)localObject2).get(paramInt / 2);
            if (paramInt % 2 != 0)
            {
              arrayOfzo2 = (zo[])localArrayList5.get(paramInt / 2 + 1);
              arrayOfzo3 = (zo[])((ArrayList)localObject2).get(paramInt / 2 + 1);
            }
            zo localzo = new zo(0.0F, 0.0F);
            if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
            {
              localzo.a((localObject3[1].d() + localObject4[1].d() + arrayOfzo2[1].d() + arrayOfzo3[1].d()) / 4.0F);
              localzo.b((localObject3[1].e() + localObject4[1].e() + arrayOfzo2[1].e() + arrayOfzo3[1].e()) / 4.0F);
            }
            else
            {
              localzo.a((localObject3[0].d() + localObject4[0].d() + arrayOfzo2[0].d() + arrayOfzo3[0].d()) / 4.0F);
              localzo.b((localObject3[0].e() + localObject4[0].e() + arrayOfzo2[0].e() + arrayOfzo3[0].e()) / 4.0F);
            }
            Object[] arrayOfObject = new Object[3];
            arrayOfObject[0] = Integer.valueOf(i1);
            arrayOfObject[1] = Integer.valueOf(0);
            arrayOfObject[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
          }
        }
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList5);
      localObject1[n] = localArrayList6;
      localObject2 = localArrayList5;
    }
    a(paramzr, paramzjf, localArrayList4, arrayOfzkf, localArrayList2, (ArrayList[])localObject1);
    return localArrayList1;
  }
  
  static ArrayList a(zr paramzr, zjf paramzjf, float paramFloat, double paramDouble, boolean paramBoolean)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    zbff localzbff = paramzjf.z();
    int i = localzbff.getCount();
    zbt localzbt1 = paramzjf.G();
    zbt localzbt2 = paramzjf.e();
    float f1 = paramzjf.m() / 100.0F;
    float f2 = paramzjf.n() / 100.0F;
    float f3 = paramzjf.o() / 100.0F;
    float f4 = 0.0F;
    if (!localzbt1.p()) {
      f4 = paramzjf.S().f() - paramzjf.S().i() + (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzjf.S().i();
    } else {
      f4 = paramzjf.S().f() - (float)localzbt1.z() / (float)(localzbt1.z() - localzbt1.D()) * paramzjf.S().i();
    }
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
    float f5 = paramzjf.S().g() / n;
    float f6 = f5 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = ziz.a(paramzjf.z().c(), paramzjf.U());
    int i2 = localArrayList2.size();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    Object localObject2;
    for (int i3 = 0; i3 < i2; i3++)
    {
      int i4 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList2.get(i3)));
      i4 = zbv.a(j, i4, paramzjf.U());
      int i5 = zbv.a(j, i4, (int)localzbt2.D(), paramzjf.U());
      float f7 = f5 * i5;
      float f8 = paramzjf.S().e() + f7;
      if (i1 != 0) {
        f8 += f5 / 2.0F;
      }
      localObject2 = a(paramzjf, f8, f6, f4, paramzr);
      com.aspose.cells.b.a.a.zf.a(localArrayList4, localObject2);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList4);
    ArrayList localArrayList5 = localzbff.j();
    zkf[] arrayOfzkf = new zkf[localArrayList5.size()];
    ArrayList[] arrayOfArrayList = new ArrayList[localArrayList5.size()];
    Object localObject1 = null;
    for (int i6 = 0; i6 < localArrayList5.size(); i6++)
    {
      localObject2 = (zbfd)localArrayList5.get(i6);
      int i7 = ((zbfd)localObject2).ak();
      int i8 = i6;
      zkh localzkh = ((zbfd)localObject2).F();
      ArrayList localArrayList6 = new ArrayList();
      if (i6 == 0) {
        localObject1 = localArrayList4;
      }
      ArrayList localArrayList7 = new ArrayList();
      for (int i9 = 0; i9 < i2; i9++)
      {
        int i10 = i9;
        int i11 = com.aspose.cells.b.a.zp.a(zs.a(localArrayList2.get(i10)));
        i11 = zbv.a(j, i11, paramzjf.U());
        int i12 = zbv.a(j, i11, (int)localzbt2.D(), paramzjf.U());
        float f9 = f5 * i12;
        float f10 = paramzjf.S().e() + f9;
        if (i1 != 0) {
          f10 += f5 / 2.0F;
        }
        int i13 = i10;
        if (localzbt2.p()) {
          i13 = i2 - 1 - i10;
        }
        zkf localzkf1 = localzkh.b(i13);
        com.aspose.cells.b.a.a.zf.a(localArrayList7, localzkf1);
        double d1 = 0.0D;
        double d2 = 0.0D;
        double d3 = 0.0D;
        zkf localzkf2;
        double d4;
        if ((localzkf1 != null) && (!localzkf1.a()))
        {
          arrayOfzkf[i6] = localzkf1;
          d1 = localzkf1.w();
          d2 = d1;
          for (i14 = 0; i14 < i8; i14++)
          {
            localzkf2 = ((zbfd)localArrayList5.get(i14)).F().b(i13);
            if (localzkf2 != null)
            {
              d4 = localzkf2.w();
              d2 += d4;
            }
          }
        }
        for (int i14 = 0; i14 < localArrayList5.size(); i14++)
        {
          localzkf2 = ((zbfd)localArrayList5.get(i14)).F().b(i13);
          if ((localzkf2 != null) && (!localzkf1.a()))
          {
            d4 = localzkf2.w();
            d3 += Math.abs(d4);
          }
        }
        float f11;
        if (!paramBoolean)
        {
          f11 = (float)(Math.abs(d2) / (localzbt1.z() - localzbt1.D()) * paramzjf.S().i());
        }
        else
        {
          if (d3 == 0.0D)
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList6, ((ArrayList)localObject1).get(i10));
            continue;
          }
          f11 = (float)(Math.abs(d2) / d3 / (localzbt1.z() - localzbt1.D()) * paramzjf.S().i());
        }
        float f12;
        if (!localzbt1.p())
        {
          if (d2 <= 0.0D) {
            f12 = f4 + f11;
          } else {
            f12 = f4 - f11;
          }
        }
        else if (d2 <= 0.0D) {
          f12 = f4 - f11;
        } else {
          f12 = f4 + f11;
        }
        zo[] arrayOfzo1 = a(paramzjf, f10, f6, f12, paramzr);
        com.aspose.cells.b.a.a.zf.a(localArrayList6, arrayOfzo1);
        if ((localzkf1 != null) && (!localzkf1.a()))
        {
          Object localObject3;
          zo[] arrayOfzo2;
          Object localObject4;
          if (!((zbfd)localObject2).aE())
          {
            localObject3 = new zo(0.0F, 0.0F);
            arrayOfzo2 = (zo[])((ArrayList)localObject1).get(i10);
            if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
            {
              ((zo)localObject3).a(arrayOfzo1[1].d());
              ((zo)localObject3).b((arrayOfzo2[1].e() + arrayOfzo1[1].e()) / 2.0F);
            }
            else
            {
              ((zo)localObject3).a(arrayOfzo1[0].d());
              ((zo)localObject3).b((arrayOfzo2[0].e() + arrayOfzo1[0].e()) / 2.0F);
            }
            localObject4 = new Object[3];
            localObject4[0] = Integer.valueOf(i7);
            localObject4[1] = Integer.valueOf(i13);
            localObject4[2] = localObject3;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, localObject4);
          }
          else if (i9 == i2 - 1)
          {
            localObject3 = (zo[])localArrayList6.get(i2 / 2 - 1);
            arrayOfzo2 = (zo[])localArrayList6.get(i2 / 2);
            localObject4 = (zo[])((ArrayList)localObject1).get(i2 / 2 - 1);
            zo[] arrayOfzo3 = (zo[])((ArrayList)localObject1).get(i2 / 2);
            if (i2 % 2 != 0)
            {
              arrayOfzo2 = (zo[])localArrayList6.get(i2 / 2 + 1);
              arrayOfzo3 = (zo[])((ArrayList)localObject1).get(i2 / 2 + 1);
            }
            zo localzo = new zo(0.0F, 0.0F);
            if ((paramzjf.E() >= 90) && (paramzjf.E() < 270))
            {
              localzo.a((localObject3[1].d() + localObject4[1].d() + arrayOfzo2[1].d() + arrayOfzo3[1].d()) / 4.0F);
              localzo.b((localObject3[1].e() + localObject4[1].e() + arrayOfzo2[1].e() + arrayOfzo3[1].e()) / 4.0F);
            }
            else
            {
              localzo.a((localObject3[0].d() + localObject4[0].d() + arrayOfzo2[0].d() + arrayOfzo3[0].d()) / 4.0F);
              localzo.b((localObject3[0].e() + localObject4[0].e() + arrayOfzo2[0].e() + arrayOfzo3[0].e()) / 4.0F);
            }
            Object[] arrayOfObject = new Object[3];
            arrayOfObject[0] = Integer.valueOf(i7);
            arrayOfObject[1] = Integer.valueOf(0);
            arrayOfObject[2] = localzo;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
          }
        }
      }
      localObject1 = localArrayList6;
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      arrayOfArrayList[i6] = localArrayList7;
    }
    a(paramzr, paramzjf, localArrayList5, arrayOfzkf, localArrayList3, arrayOfArrayList);
    return localArrayList1;
  }
  
  private static void a(zr paramzr, zjf paramzjf, zbfd paramzbfd, zkf paramzkf, List paramList, ArrayList paramArrayList)
    throws Exception
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      localObject1 = (zkf)paramArrayList.get(i);
      if (localObject1 != null)
      {
        arrayOfzo1 = (zo[])paramList.get(i * 2 + 1);
        arrayOfzo2 = (zo[])paramList.get(i * 2);
        for (int j = 0; j < arrayOfzo1.length; j++)
        {
          com.aspose.cells.b.a.a.zf.a(((zkf)localObject1).b, arrayOfzo1[j]);
          com.aspose.cells.b.a.a.zf.a(((zkf)localObject1).d, arrayOfzo2[j]);
        }
      }
    }
    if ((paramList.size() < 4) || (paramzkf == null)) {
      return;
    }
    i = paramList.size() / 2;
    Object localObject1 = new zo[i];
    zo[] arrayOfzo1 = new zo[i];
    zo[] arrayOfzo2 = new zo[i];
    zo[] arrayOfzo3 = new zo[i];
    zbxz.a((zo[])localObject1);
    zbxz.a(arrayOfzo1);
    zbxz.a(arrayOfzo2);
    zbxz.a(arrayOfzo3);
    zo[] arrayOfzo4;
    zo[] arrayOfzo5;
    for (int k = 0; k < paramList.size(); k += 2)
    {
      arrayOfzo4 = (zo[])paramList.get(k);
      arrayOfzo5 = (zo[])paramList.get(k + 1);
      localObject1[(k / 2)] = arrayOfzo4[0];
      arrayOfzo1[(k / 2)] = arrayOfzo4[1];
      arrayOfzo2[(k / 2)] = arrayOfzo5[0];
      arrayOfzo3[(k / 2)] = arrayOfzo5[1];
    }
    for (k = 1; k < i; k++)
    {
      arrayOfzo4 = new zo[8];
      zbxz.a(arrayOfzo4);
      arrayOfzo5 = null;
      Object localObject2 = null;
      zo[] arrayOfzo6 = { arrayOfzo5 };
      boolean bool1 = a(localObject1[(k - 1)], localObject1[k], arrayOfzo2[(k - 1)], arrayOfzo2[k], arrayOfzo6);
      arrayOfzo5 = arrayOfzo6[0];
      if (bool1)
      {
        zo[] arrayOfzo7 = { localObject2 };
        boolean bool2 = a(arrayOfzo1[(k - 1)], arrayOfzo1[k], arrayOfzo3[(k - 1)], arrayOfzo3[k], arrayOfzo7);
        localObject2 = arrayOfzo7[0];
        if (bool2)
        {
          arrayOfzo4[0] = localObject1[(k - 1)];
          arrayOfzo4[1] = arrayOfzo5;
          arrayOfzo4[2] = localObject2;
          arrayOfzo4[3] = arrayOfzo1[(k - 1)];
          arrayOfzo4[4] = arrayOfzo2[(k - 1)];
          arrayOfzo4[5] = arrayOfzo5;
          arrayOfzo4[6] = localObject2;
          arrayOfzo4[7] = arrayOfzo3[(k - 1)];
          a(paramzr, paramzjf, paramzkf, arrayOfzo4);
          arrayOfzo4[0] = arrayOfzo5;
          arrayOfzo4[1] = localObject1[k];
          arrayOfzo4[2] = arrayOfzo1[k];
          arrayOfzo4[3] = localObject2;
          arrayOfzo4[4] = arrayOfzo5;
          arrayOfzo4[5] = arrayOfzo2[k];
          arrayOfzo4[6] = arrayOfzo3[k];
          arrayOfzo4[7] = localObject2;
          a(paramzr, paramzjf, paramzkf, arrayOfzo4);
        }
      }
      else
      {
        arrayOfzo4[0] = localObject1[(k - 1)];
        arrayOfzo4[1] = localObject1[k];
        arrayOfzo4[2] = arrayOfzo1[k];
        arrayOfzo4[3] = arrayOfzo1[(k - 1)];
        arrayOfzo4[4] = arrayOfzo2[(k - 1)];
        arrayOfzo4[5] = arrayOfzo2[k];
        arrayOfzo4[6] = arrayOfzo3[k];
        arrayOfzo4[7] = arrayOfzo3[(k - 1)];
        a(paramzr, paramzjf, paramzkf, arrayOfzo4);
      }
    }
    a(paramzr, paramzjf, paramzkf, (zo[])localObject1, arrayOfzo1, arrayOfzo2, arrayOfzo3);
  }
  
  private static boolean a(zo paramzo1, zo paramzo2, zo paramzo3, zo paramzo4, zo[] paramArrayOfzo)
  {
    paramArrayOfzo[0] = new zo(0.0F, 0.0F);
    if ((paramzo1.d() != paramzo2.d()) && (paramzo3.d() != paramzo4.d()))
    {
      float f1 = (paramzo1.e() - paramzo2.e()) / (paramzo1.d() - paramzo2.d());
      float f2 = paramzo1.e() - f1 * paramzo1.d();
      float f3 = (paramzo3.e() - paramzo4.e()) / (paramzo3.d() - paramzo4.d());
      float f4 = paramzo3.e() - f3 * paramzo3.d();
      if (f1 == f3) {
        return false;
      }
      paramArrayOfzo[0].a((f4 - f2) / (f1 - f3));
      paramArrayOfzo[0].b(f1 * paramArrayOfzo[0].d() + f2);
      return ((paramzo1.d() < paramArrayOfzo[0].d()) && (paramzo2.d() > paramArrayOfzo[0].d()) && (paramzo3.d() < paramArrayOfzo[0].d()) && (paramzo4.d() > paramArrayOfzo[0].d())) || ((paramzo1.d() > paramArrayOfzo[0].d()) && (paramzo2.d() < paramArrayOfzo[0].d()) && (paramzo3.d() > paramArrayOfzo[0].d()) && (paramzo4.d() < paramArrayOfzo[0].d()));
    }
    return false;
  }
  
  private static void a(zr paramzr, zjf paramzjf, zkf paramzkf, zo[] paramArrayOfzo)
    throws Exception
  {
    zaz localzaz = paramzkf.i();
    ze localze1 = new ze();
    localze1.b(paramArrayOfzo);
    int i = paramArrayOfzo[0].e() + paramArrayOfzo[1].e() + paramArrayOfzo[2].e() + paramArrayOfzo[3].e() > paramArrayOfzo[4].e() + paramArrayOfzo[5].e() + paramArrayOfzo[6].e() + paramArrayOfzo[7].e() ? 1 : 0;
    ze localze2;
    ze localze3;
    if (paramzjf.p() > 0)
    {
      if (i != 0)
      {
        localze2 = new ze();
        localze2.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
        localzaz.a(localze2, 0.6666667F);
        paramzkf.k().a(localze2);
        localze3 = new ze();
        localze3.b(new zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
        localzaz.a(localze3, 0.6666667F);
        paramzkf.k().a(localze3);
      }
      else
      {
        localze2 = new ze();
        localze2.b(new zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
        localzaz.a(localze2, 0.6666667F);
        paramzkf.k().a(localze2);
        localze3 = new ze();
        localze3.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
        localzaz.a(localze3, 0.6666667F);
        paramzkf.k().a(localze3);
      }
    }
    else if (i == 0)
    {
      localze2 = new ze();
      localze2.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
      localzaz.a(localze2, 0.6666667F);
      paramzkf.k().a(localze2);
      localze3 = new ze();
      localze3.b(new zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
      localzaz.a(localze3, 0.6666667F);
      paramzkf.k().a(localze3);
    }
    else
    {
      localze2 = new ze();
      localze2.b(new zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
      localzaz.a(localze2, 0.6666667F);
      paramzkf.k().a(localze2);
      localze3 = new ze();
      localze3.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
      localzaz.a(localze3, 0.6666667F);
      paramzkf.k().a(localze3);
    }
    if ((paramzjf.E() <= 90) || (paramzjf.E() == 360))
    {
      localze2 = new ze();
      localze2.b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
      localzaz.a(localze2, 0.5F);
      paramzkf.k().a(localze2);
    }
    else if ((paramzjf.E() > 90) && (paramzjf.E() <= 180))
    {
      localze2 = new ze();
      localze2.b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
      localzaz.a(localze2, 0.5F);
      paramzkf.k().a(localze2);
    }
    else if ((paramzjf.E() > 180) && (paramzjf.E() <= 270))
    {
      localze2 = new ze();
      localze2.b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
      localzaz.a(localze2, 0.5F);
      paramzkf.k().a(localze2);
    }
    else if ((paramzjf.E() > 270) && (paramzjf.E() < 360))
    {
      localze2 = new ze();
      localze2.b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
      localzaz.a(localze2, 0.5F);
      paramzkf.k().a(localze2);
    }
  }
  
  private static void a(zr paramzr, zjf paramzjf, zkf paramzkf, zo[] paramArrayOfzo1, zo[] paramArrayOfzo2, zo[] paramArrayOfzo3, zo[] paramArrayOfzo4)
    throws Exception
  {
    zaz localzaz = paramzkf.i();
    zo[] arrayOfzo;
    if ((paramzjf.E() <= 90) || (paramzjf.E() == 360) || ((paramzjf.E() > 270) && (paramzjf.E() < 360)))
    {
      arrayOfzo = new zo[paramArrayOfzo1.length * 2];
      zbxz.a(arrayOfzo);
      for (int i = 0; i < paramArrayOfzo1.length; i++)
      {
        arrayOfzo[i] = paramArrayOfzo1[i];
        arrayOfzo[(arrayOfzo.length - 1 - i)] = paramArrayOfzo3[i];
      }
      ze localze1 = new ze();
      localze1.b(arrayOfzo);
      localzaz.a(localze1);
      paramzkf.k().a(localze1);
    }
    else if (((paramzjf.E() > 90) && (paramzjf.E() <= 180)) || ((paramzjf.E() > 180) && (paramzjf.E() <= 270)))
    {
      arrayOfzo = new zo[paramArrayOfzo2.length * 2];
      zbxz.a(arrayOfzo);
      for (int j = 0; j < paramArrayOfzo2.length; j++)
      {
        arrayOfzo[j] = paramArrayOfzo2[j];
        arrayOfzo[(arrayOfzo.length - 1 - j)] = paramArrayOfzo4[j];
      }
      ze localze2 = new ze();
      localze2.b(arrayOfzo);
      localzaz.a(localze2);
      paramzkf.k().a(localze2);
    }
  }
  
  private static zo[] a(zjf paramzjf, float paramFloat1, float paramFloat2, float paramFloat3, zr paramzr)
  {
    zo[] arrayOfzo = new zo[2];
    zbxz.a(arrayOfzo);
    float f2 = paramzjf.S().j();
    float f1;
    if (paramFloat1 <= f2)
    {
      f1 = 2.0F * (f2 - paramFloat1);
      arrayOfzo[0] = zlr.a(paramzjf, paramFloat3, f1, paramFloat2, 0);
      arrayOfzo[1] = zlr.a(paramzjf, paramFloat3, f1, paramFloat2, 3);
    }
    else
    {
      f1 = 2.0F * (paramFloat1 - f2);
      arrayOfzo[0] = zlr.a(paramzjf, paramFloat3, f1, paramFloat2, 1);
      arrayOfzo[1] = zlr.a(paramzjf, paramFloat3, f1, paramFloat2, 2);
    }
    return arrayOfzo;
  }
  
  private static void a(zr paramzr, zjf paramzjf, List paramList1, zkf[] paramArrayOfzkf, List paramList2, ArrayList[] paramArrayOfArrayList)
    throws Exception
  {
    List localList2;
    zkf localzkf;
    for (int i = 0; i < paramArrayOfArrayList.length; i++)
    {
      localObject1 = paramArrayOfArrayList[i];
      localObject2 = (List)paramList2.get(i + 1);
      localList2 = (List)paramList2.get(0);
      for (int j = 0; j < ((ArrayList)localObject1).size(); j++)
      {
        localzkf = (zkf)((ArrayList)localObject1).get(j);
        zo[] arrayOfzo1 = (zo[])((List)localObject2).get(j);
        zo[] arrayOfzo2 = (zo[])localList2.get(j);
        for (int n = 0; n < arrayOfzo1.length; n++)
        {
          com.aspose.cells.b.a.a.zf.a(localzkf.b, arrayOfzo1[n]);
          com.aspose.cells.b.a.a.zf.a(localzkf.d, arrayOfzo2[n]);
        }
      }
    }
    if (paramList2.size() < 2) {
      return;
    }
    List localList1 = (List)paramList2.get(0);
    Object localObject1 = (zbfd)paramList1.get(paramList1.size() - 1);
    Object localObject2 = ((zbfd)localObject1).A();
    if (paramList2.size() >= 2)
    {
      localList2 = (List)paramList2.get(1);
      List localList3 = (List)paramList2.get(paramList2.size() - 1);
      localzkf = null;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      zo[] arrayOfzo4;
      Object localObject6;
      for (int k = 1; k < localList1.size(); k++) {
        if (paramzjf.p() >= 0)
        {
          int m = paramList2.size() - 1;
          localObject3 = new zo[][] { localzkf };
          boolean bool = a(localList3, localList1, k, (zo[][])localObject3);
          localzkf = localObject3[0];
          if (!paramzjf.G().p())
          {
            if (a(localList3, localList1, k))
            {
              localObject4 = (List)paramList2.get(m);
              localObject5 = new zo[4];
              zbxz.a((zo[])localObject5);
              arrayOfzo4 = (zo[])((List)localObject4).get(k - 1);
              localObject5[0] = arrayOfzo4[0];
              localObject5[1] = arrayOfzo4[1];
              arrayOfzo4 = (zo[])((List)localObject4).get(k);
              localObject5[2] = arrayOfzo4[1];
              localObject5[3] = arrayOfzo4[0];
              localObject6 = new ze();
              ((ze)localObject6).b((zo[])localObject5);
              ((zaz)localObject2).a((ze)localObject6, 0.6666667F);
              ((zbfd)localObject1).z().a((ze)localObject6);
            }
          }
          else if (bool)
          {
            localObject4 = (List)paramList2.get(m);
            localObject5 = new zo[4];
            zbxz.a((zo[])localObject5);
            arrayOfzo4 = (zo[])((List)localObject4).get(k - 1);
            ze localze2;
            if (localzkf[0].e() >= arrayOfzo4[0].e())
            {
              localObject6 = (zo[])localList1.get(k - 1);
              localObject5[0] = localObject6[0];
              localObject5[1] = localObject6[1];
              localObject5[2] = localzkf[1];
              localObject5[3] = localzkf[0];
              localze2 = new ze();
              localze2.b((zo[])localObject5);
              ((zaz)localObject2).a(localze2, 0.6666667F);
              ((zbfd)localObject1).z().a(localze2);
            }
            else
            {
              localObject5[0] = arrayOfzo4[0];
              localObject5[1] = arrayOfzo4[1];
              localObject5[2] = localzkf[1];
              localObject5[3] = localzkf[0];
              localObject6 = new ze();
              ((ze)localObject6).b((zo[])localObject5);
              ((zaz)localObject2).a((ze)localObject6, 0.6666667F);
              ((zbfd)localObject1).z().a((ze)localObject6);
            }
            arrayOfzo4 = (zo[])((List)localObject4).get(k);
            if (localzkf[0].e() >= arrayOfzo4[0].e())
            {
              localObject6 = (zo[])localList1.get(k);
              localObject5[0] = localObject6[0];
              localObject5[1] = localObject6[1];
              localObject5[2] = localzkf[1];
              localObject5[3] = localzkf[0];
              localze2 = new ze();
              localze2.b((zo[])localObject5);
              ((zaz)localObject2).a(localze2, 0.6666667F);
              ((zbfd)localObject1).z().a(localze2);
            }
            else
            {
              localObject5[0] = arrayOfzo4[0];
              localObject5[1] = arrayOfzo4[1];
              localObject5[2] = localzkf[1];
              localObject5[3] = localzkf[0];
              localObject6 = new ze();
              ((ze)localObject6).b((zo[])localObject5);
              ((zaz)localObject2).a((ze)localObject6, 0.6666667F);
              ((zbfd)localObject1).z().a((ze)localObject6);
            }
          }
        }
        else if (paramzjf.G().p()) {}
      }
      List localList4;
      for (k = 1; k < paramList2.size(); k++)
      {
        localObject1 = (zbfd)paramList1.get(k - 1);
        localObject2 = ((zbfd)localObject1).A();
        localList4 = (List)paramList2.get(k - 1);
        localObject3 = (List)paramList2.get(k);
        zo[] arrayOfzo3;
        if (paramzjf.E() <= 180)
        {
          arrayOfzo3 = (zo[])localList4.get(localList4.size() - 1);
          localObject4 = (zo[])((List)localObject3).get(((List)localObject3).size() - 1);
        }
        else
        {
          arrayOfzo3 = (zo[])localList4.get(0);
          localObject4 = (zo[])((List)localObject3).get(0);
        }
        localObject5 = new ze();
        ((ze)localObject5).b(new zo[] { arrayOfzo3[0], arrayOfzo3[1], localObject4[1], localObject4[0] });
        ((zaz)localObject2).a((ze)localObject5, 0.5F);
        ((zbfd)localObject1).z().a((ze)localObject5);
      }
      for (k = 1; k < paramList2.size(); k++)
      {
        localObject1 = (zbfd)paramList1.get(k - 1);
        localObject2 = ((zbfd)localObject1).A();
        localList4 = (List)paramList2.get(k - 1);
        localObject3 = (List)paramList2.get(k);
        int i1 = ((List)localObject3).size() * 2;
        localObject4 = new zo[i1];
        zbxz.a((zo[])localObject4);
        for (int i2 = 0; i2 < localList4.size(); i2++)
        {
          arrayOfzo4 = (zo[])localList4.get(i2);
          localObject6 = (zo[])((List)localObject3).get(i2);
          if ((paramzjf.E() <= 90) || (paramzjf.E() == 360) || ((paramzjf.E() > 270) && (paramzjf.E() < 360)))
          {
            localObject4[i2] = arrayOfzo4[0];
            localObject4[(i1 - i2 - 1)] = localObject6[0];
          }
          else
          {
            localObject4[i2] = arrayOfzo4[1];
            localObject4[(i1 - i2 - 1)] = localObject6[1];
          }
        }
        ze localze1 = new ze();
        localze1.b((zo[])localObject4);
        ((zaz)localObject2).a(localze1);
        ((zbfd)localObject1).z().a(localze1);
      }
    }
  }
  
  private static boolean a(List paramList1, List paramList2, int paramInt)
  {
    zo localzo1 = ((zo[])(zo[])paramList1.get(paramInt - 1))[0];
    zo localzo2 = ((zo[])(zo[])paramList1.get(paramInt))[0];
    zo localzo3 = ((zo[])(zo[])paramList2.get(paramInt - 1))[0];
    zo localzo4 = ((zo[])(zo[])paramList2.get(paramInt))[0];
    return (localzo1.e() <= localzo3.e()) && (localzo2.e() <= localzo4.e());
  }
  
  private static boolean a(List paramList1, List paramList2, int paramInt, zo[][] paramArrayOfzo)
  {
    zo localzo1 = ((zo[])(zo[])paramList1.get(paramInt - 1))[0];
    zo localzo2 = ((zo[])(zo[])paramList1.get(paramInt))[0];
    zo localzo3 = ((zo[])(zo[])paramList2.get(paramInt - 1))[0];
    zo localzo4 = ((zo[])(zo[])paramList2.get(paramInt))[0];
    Object localObject1 = null;
    Object localObject2 = null;
    zo[] arrayOfzo1 = { localObject1 };
    boolean bool1 = a(localzo1, localzo2, localzo3, localzo4, arrayOfzo1);
    localObject1 = arrayOfzo1[0];
    localzo1 = ((zo[])(zo[])paramList1.get(paramInt - 1))[1];
    localzo2 = ((zo[])(zo[])paramList1.get(paramInt))[1];
    localzo3 = ((zo[])(zo[])paramList2.get(paramInt - 1))[1];
    localzo4 = ((zo[])(zo[])paramList2.get(paramInt))[1];
    zo[] arrayOfzo2 = { localObject2 };
    boolean bool2 = a(localzo1, localzo2, localzo3, localzo4, arrayOfzo2);
    localObject2 = arrayOfzo2[0];
    paramArrayOfzo[0] = new zo[2];
    zbxz.a(paramArrayOfzo[0]);
    paramArrayOfzo[0][0] = localObject1;
    paramArrayOfzo[0][1] = localObject2;
    return bool1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */