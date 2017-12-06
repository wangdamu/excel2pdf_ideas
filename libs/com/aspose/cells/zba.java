package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;
import java.util.List;

final class zba
{
  static ArrayList a(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramInt < 2) {
      return localArrayList1;
    }
    int i = paramzbfc.af();
    zbs localzbs2;
    zbs localzbs1;
    if (i == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
    }
    if (localzbs2.k() == 2) {
      return a(paramzr, paramzje, paramzbfc, paramzp, paramFloat, (float)paramDouble);
    }
    zbfe localzbfe = paramzje.z();
    int j = localzbfe.getCount();
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    boolean bool = paramzbfc.L();
    zanq localzanq = paramzbfc.O();
    int k = 0;
    int m = paramInt;
    if (localzbs2.p) {
      m = (int)localzbs2.z();
    }
    if ((localzbs2.f()) || (paramzje.u()))
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
    int n = paramzbfc.ai();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    zkg localzkg = paramzbfc.D();
    int i1 = -1;
    int i2 = 1;
    for (int i3 = 0; i3 < m; i3++)
    {
      zke localzke = localzkg.b(i3);
      double d4 = (float)d3 * i3;
      if ((localzbs2.f()) || (paramzje.u())) {
        d4 += (float)(d3 / 2.0D);
      }
      if (localzbs2.p()) {
        d4 = paramzp.c() + paramzp.e() - d4;
      } else {
        d4 = paramzp.c() + d4;
      }
      if ((localzke != null) && (!localzke.a()))
      {
        if ((localzke.w() > 0.0D) && (i1 != 1)) {
          i1 = 1;
        } else if ((localzke.w() < 0.0D) && (i2 != -1)) {
          i2 = -1;
        }
        double d5 = paramFloat;
        double d6 = localzke.w();
        double d7 = (d6 - paramDouble) / (d1 - d2) * paramzp.f();
        if (!localzbs1.p()) {
          d5 -= d7;
        } else {
          d5 += d7;
        }
        zo localzo2 = new zo((float)d4, (float)d5);
        if ((!paramzbfc.z().e()) && (i3 == m - 1) && (paramzp.i() - localzo2.d() <= 1.0F)) {
          localzo2.a(localzo2.d() + 1.0F);
        }
        zkn.a(localzo2, localArrayList2, localArrayList3, i3);
        zub localzub = paramzbfc.x();
        double d8 = 0.0D;
        double d9 = 0.0D;
        float f1 = 0.0F;
        float f2 = 0.0F;
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
            break;
          }
          f1 = (float)d8 / (float)(d1 - d2) * paramzp.f();
          f2 = (float)d9 / (float)(d1 - d2) * paramzp.f();
        }
        localzub.a(localzo2, f1, f2);
      }
      else if (localzke == null)
      {
        com.aspose.cells.b.a.a.zf.a(localArrayList4, Integer.valueOf(i3));
      }
      else
      {
        zo localzo1 = new zo((float)d4, paramFloat);
        zkn.a(localzo1, localArrayList2, localArrayList3, i3);
      }
    }
    i3 = 0;
    if ((i1 > 0) && (i2 > 0)) {
      i3 = 1;
    } else if ((i1 < 0) && (i2 < 0)) {
      i3 = 2;
    } else if ((i1 > 0) && (i2 < 0)) {
      i3 = 3;
    }
    a(paramzr, paramzbfc, localArrayList2, localArrayList3, localArrayList4, paramFloat, bool, localzanq, localArrayList1, localzbs2, paramzp, i3);
    return localArrayList1;
  }
  
  private static ArrayList a(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat1, float paramFloat2)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    int i = paramzbfc.af();
    zbfe localzbfe = paramzje.z();
    int j = localzbfe.getCount();
    zbs localzbs2;
    zbs localzbs1;
    ArrayList localArrayList2;
    if (i == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
      localArrayList2 = ziy.a(paramzje.z().c(), paramzje.U());
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
      localArrayList2 = ziy.a(paramzje.z().d(), paramzje.U());
    }
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    boolean bool = paramzbfc.L();
    zanq localzanq = paramzbfc.O();
    int k = localArrayList2.size();
    int m = localzbs2.j();
    int n = (int)localzbs2.D();
    int i1 = (int)localzbs2.z();
    int i2 = 0;
    if ((localzbs2.f()) || (paramzje.u()))
    {
      i2 = zbu.a(m, i1, n, paramzje.U()) + 1;
    }
    else
    {
      i2 = zbu.a(m, i1, n, paramzje.U());
      if (i2 == 0) {
        i2 = 1;
      }
    }
    double d3 = paramzp.e() / i2;
    float f1 = 0.0F;
    int i3 = paramzbfc.ai();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    ArrayList localArrayList5 = new ArrayList();
    for (int i4 = 0; i4 < k; i4++)
    {
      zke localzke = paramzbfc.D().b(i4);
      int i5 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i4)));
      i5 = zbu.a(m, i5, paramzje.U());
      int i6 = zbu.a(m, i5, n, paramzje.U());
      float f2 = (float)(d3 * i6);
      f1 = (float)(d3 * zbu.a(m, zbu.a(localzbs2.j(), localzbs2.y(), (int)localzbs2.x(), i5, paramzje.U()), i5, paramzje.U()));
      if ((localzbs2.f()) || (paramzje.u())) {
        f2 += (float)(d3 / 2.0D);
      }
      float f3 = 0.0F;
      if (localzbs2.p()) {
        f3 = paramzp.c() + paramzp.e() - f2;
      } else {
        f3 = paramzp.c() + f2;
      }
      if ((localzke != null) && (!localzke.a()))
      {
        float f4 = paramFloat1;
        float f5 = (float)localzke.w();
        float f6 = (float)((f5 - paramFloat2) / (d2 - d1) * paramzp.f());
        if (!localzbs1.p()) {
          f4 -= f6;
        } else {
          f4 += f6;
        }
        zo localzo2 = new zo(f3, f4);
        zkn.a(localzo2, localArrayList3, localArrayList4, i4);
        zub localzub = paramzbfc.x();
        double d4 = 0.0D;
        double d5 = 0.0D;
        float f7 = 0.0F;
        float f8 = 0.0F;
        if (localzub != null)
        {
          switch (localzub.g())
          {
          case 1: 
            d4 = localzub.c();
            d5 = d4;
            break;
          case 2: 
            d4 = localzub.c() * f5 / 100.0D;
            d5 = -d4;
            break;
          case 0: 
            double d6 = localzub.e().size() > i4 ? localzub.a(localzub.e().get(i4)) : 0.0D;
            d4 = d6;
            d6 = localzub.f().size() > i4 ? localzub.a(localzub.f().get(i4)) : 0.0D;
            d5 = d6;
            break;
          }
          f7 = (float)d4 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
          f8 = (float)d5 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
        }
        localzub.a(localzo2, f7, f8);
      }
      else if (localzke == null)
      {
        com.aspose.cells.b.a.a.zf.a(localArrayList5, Integer.valueOf(i4));
      }
      else
      {
        zo localzo1 = new zo(f3, paramFloat1);
        zkn.a(localzo1, localArrayList3, localArrayList4, i4);
      }
    }
    a(paramzr, paramzbfc, localArrayList3, localArrayList4, localArrayList5, paramFloat1, bool, localzanq, localArrayList1, localzbs2, paramzp, 1);
    return localArrayList1;
  }
  
  static ArrayList a(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramInt < 2) {
      return localArrayList1;
    }
    int i = paramzbfc.af();
    int j = 1;
    zbs localzbs2;
    zbs localzbs1;
    if (i == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
    }
    if (localzbs2.k() == 2) {
      return c(paramzr, paramzje, paramzbfc, paramzp, paramFloat, i);
    }
    float f1 = 0.0F;
    if (!localzbs1.p()) {
      f1 = paramzp.d() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    }
    zbfe localzbfe = paramzje.z();
    int k = localzbfe.getCount();
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    boolean bool = paramzbfc.L();
    zanq localzanq = paramzbfc.O();
    int m = 0;
    int n = paramInt;
    if (localzbs2.p) {
      n = (int)localzbs2.z();
    }
    if ((localzbs2.f()) || (paramzje.u()))
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
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    List localList = localzbfe.a(i, new int[] { j });
    ArrayList localArrayList4 = new ArrayList();
    int i1 = localzbfe.a(paramzbfc, i, new int[] { j });
    zbfc localzbfc1 = null;
    if (i1 > 0) {
      localzbfc1 = localzbfe.a(i1 - 1, i, new int[] { j });
    }
    if (localzbfc1 != null) {
      com.aspose.cells.b.a.a.zf.a(localArrayList4, localzbfc1);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList4, paramzbfc);
    for (int i2 = 0; i2 < localArrayList4.size(); i2++)
    {
      zbfc localzbfc2 = (zbfc)localArrayList4.get(i2);
      int i3 = localzbfe.a(localzbfc2, i, new int[] { j });
      int i4 = localzbfc2.ai();
      ArrayList localArrayList5 = new ArrayList();
      ArrayList localArrayList6 = new ArrayList();
      zkg localzkg = localzbfe.c(i4).D();
      for (int i5 = 0; i5 < paramInt; i5++)
      {
        zke localzke = localzkg.b(i5);
        double d4 = (float)d3 * i5;
        if ((localzbs2.f()) || (paramzje.u())) {
          d4 += (float)(d3 / 2.0D);
        }
        if (localzbs2.p()) {
          d4 = paramzp.c() + paramzp.e() - d4;
        } else {
          d4 = paramzp.c() + d4;
        }
        if ((localzke != null) && (!localzke.a()))
        {
          double d5 = localzke.w();
          double d6 = d5;
          for (int i7 = 0; i7 < i3; i7++)
          {
            localObject = ((zbfc)localList.get(i7)).D().b(i5);
            if (localObject != null)
            {
              double d7 = ((zke)localObject).w();
              d6 += d7;
            }
          }
          float f2 = (float)(Math.abs(d6) / (localzbs1.z() - localzbs1.D()) * paramzp.f());
          if (!localzbs1.p())
          {
            if (d6 <= 0.0D) {
              f2 = f1 + f2;
            } else {
              f2 = f1 - f2;
            }
          }
          else if (d6 <= 0.0D) {
            f2 = f1 - f2;
          } else {
            f2 = f1 + f2;
          }
          Object localObject = new zo((float)d4, f2);
          zkn.a((zo)localObject, localArrayList5, localArrayList6, i5);
          if (localzbfc2.equals(paramzbfc))
          {
            zub localzub = paramzbfc.x();
            double d8 = 0.0D;
            double d9 = 0.0D;
            float f3 = 0.0F;
            float f4 = 0.0F;
            if (localzub != null)
            {
              switch (localzub.g())
              {
              case 1: 
                d8 = localzub.c();
                d9 = d8;
                break;
              case 2: 
                d8 = localzub.c() * d5 / 100.0D;
                d9 = -d8;
                break;
              case 0: 
                double d10 = localzub.e().size() > i5 ? localzub.a(localzub.e().get(i5)) : 0.0D;
                d8 = d10;
                d10 = localzub.f().size() > i5 ? localzub.a(localzub.f().get(i5)) : 0.0D;
                d9 = d10;
                break;
              }
              f3 = (float)d8 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
              f4 = (float)d9 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
            }
            localzub.a((zo)localObject, f3, f4);
          }
        }
        else
        {
          zo localzo = new zo((float)d4, paramFloat);
          for (int i6 = i2; i6 > 0; i6--) {
            if (((ArrayList)localArrayList2.get(i6 - 1)).get(i5) != null)
            {
              localzo = (zo)((ArrayList)localArrayList2.get(i6 - 1)).get(i5);
              break;
            }
          }
          if (i2 == 0) {
            localzo = new zo((float)d4, paramFloat);
          }
          zkn.a(localzo, localArrayList5, localArrayList6, i5);
        }
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList5);
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
    }
    a(paramzr, localArrayList4, localArrayList2, localArrayList3, paramFloat, bool, localzanq, localArrayList1, localzbs2, paramzp);
    return localArrayList1;
  }
  
  private static ArrayList c(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    int i = 1;
    zbfe localzbfe = paramzje.z();
    int j = localzbfe.getCount();
    zbfc localzbfc1 = paramzje.z().a(paramInt, i);
    if (localzbfc1 == null) {
      return localArrayList1;
    }
    zbs localzbs2;
    zbs localzbs1;
    ArrayList localArrayList2;
    if (paramInt == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
      localArrayList2 = ziy.a(paramzje.z().c(), paramzje.U());
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
      localArrayList2 = ziy.a(paramzje.z().d(), paramzje.U());
    }
    float f1 = 0.0F;
    if (!localzbs1.p()) {
      f1 = paramzp.d() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    }
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    boolean bool = localzbfc1.L();
    zanq localzanq = localzbfc1.O();
    int k = localArrayList2.size();
    int m = localzbs2.j();
    int n = (int)localzbs2.D();
    int i1 = (int)localzbs2.z();
    int i2 = 0;
    if ((localzbs2.f()) || (paramzje.u()))
    {
      i2 = zbu.a(m, i1, n, paramzje.U()) + 1;
    }
    else
    {
      i2 = zbu.a(m, i1, n, paramzje.U());
      if (i2 == 0) {
        i2 = 1;
      }
    }
    double d3 = paramzp.e() / i2;
    float f2 = 0.0F;
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    List localList = localzbfe.a(paramInt, new int[] { i });
    ArrayList localArrayList5 = new ArrayList();
    int i3 = localzbfe.a(paramzbfc, paramInt, new int[] { i });
    zbfc localzbfc2 = null;
    if (i3 > 0) {
      localzbfc2 = localzbfe.a(i3 - 1, paramInt, new int[] { i });
    }
    if (localzbfc2 != null) {
      com.aspose.cells.b.a.a.zf.a(localArrayList5, localzbfc2);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList5, paramzbfc);
    for (int i4 = 0; i4 < localArrayList5.size(); i4++)
    {
      zbfc localzbfc3 = (zbfc)localArrayList5.get(i4);
      int i5 = localzbfe.a(localzbfc3, paramInt, new int[] { i });
      int i6 = localzbfc3.ai();
      ArrayList localArrayList6 = new ArrayList();
      ArrayList localArrayList7 = new ArrayList();
      for (int i7 = 0; i7 < k; i7++)
      {
        zke localzke = localzbfe.c(i6).D().b(i7);
        int i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i7)));
        i8 = zbu.a(m, i8, paramzje.U());
        int i9 = zbu.a(m, i8, n, paramzje.U());
        float f3 = (float)(d3 * i9);
        f2 = (float)(d3 * zbu.a(m, zbu.a(localzbs2.j(), localzbs2.y(), (int)localzbs2.x(), i8, paramzje.U()), i8, paramzje.U()));
        if ((localzbs2.f()) || (paramzje.u())) {
          f3 += (float)(d3 / 2.0D);
        }
        float f4 = 0.0F;
        if (localzbs2.p()) {
          f4 = paramzp.c() + paramzp.e() - f3;
        } else {
          f4 = paramzp.c() + f3;
        }
        if ((localzke != null) && (!localzke.a()))
        {
          double d4 = localzke.w();
          double d5 = d4;
          for (int i11 = 0; i11 < i5; i11++)
          {
            localObject = ((zbfc)localList.get(i11)).D().b(i7);
            if (localObject != null)
            {
              double d6 = ((zke)localObject).w();
              d5 += d6;
            }
          }
          float f5 = (float)(Math.abs(d5) / (localzbs1.z() - localzbs1.D()) * paramzp.f());
          if (!localzbs1.p())
          {
            if (d5 <= 0.0D) {
              f5 = f1 + f5;
            } else {
              f5 = f1 - f5;
            }
          }
          else if (d5 <= 0.0D) {
            f5 = f1 - f5;
          } else {
            f5 = f1 + f5;
          }
          Object localObject = new zo(f4, f5);
          zkn.a((zo)localObject, localArrayList6, localArrayList7, i7);
          if (localzbfc3.equals(paramzbfc))
          {
            zub localzub = paramzbfc.x();
            double d7 = 0.0D;
            double d8 = 0.0D;
            float f6 = 0.0F;
            float f7 = 0.0F;
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
                double d9 = localzub.e().size() > i7 ? localzub.a(localzub.e().get(i7)) : 0.0D;
                d7 = d9;
                d9 = localzub.f().size() > i7 ? localzub.a(localzub.f().get(i7)) : 0.0D;
                d8 = d9;
                break;
              }
              f6 = (float)d7 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
              f7 = (float)d8 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
            }
            localzub.a((zo)localObject, f6, f7);
          }
        }
        else
        {
          zo localzo = new zo(f4, paramFloat);
          for (int i10 = i4; i10 > 0; i10--) {
            if (((ArrayList)localArrayList3.get(i10 - 1)).get(i7) != null)
            {
              localzo = (zo)((ArrayList)localArrayList3.get(i10 - 1)).get(i7);
              break;
            }
          }
          if (i4 == 0) {
            localzo = new zo(f4, paramFloat);
          }
          zkn.a(localzo, localArrayList6, localArrayList7, i7);
        }
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      com.aspose.cells.b.a.a.zf.a(localArrayList4, localArrayList7);
    }
    a(paramzr, localArrayList5, localArrayList3, localArrayList4, paramFloat, bool, localzanq, localArrayList1, localzbs2, paramzp);
    return localArrayList1;
  }
  
  static ArrayList b(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramInt < 2) {
      return localArrayList1;
    }
    int i = paramzbfc.af();
    int j = 2;
    zbs localzbs2;
    zbs localzbs1;
    if (i == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
    }
    if (localzbs2.k() == 2) {
      return d(paramzr, paramzje, paramzbfc, paramzp, paramFloat, i);
    }
    float f1 = 0.0F;
    if (!localzbs1.p()) {
      f1 = paramzp.d() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    }
    zbfe localzbfe = paramzje.z();
    int k = localzbfe.getCount();
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    boolean bool = paramzbfc.L();
    zanq localzanq = paramzbfc.O();
    int m = 0;
    int n = paramInt;
    if (localzbs2.p) {
      n = (int)localzbs2.z();
    }
    if ((localzbs2.f()) || (paramzje.u()))
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
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    List localList = localzbfe.a(i, new int[] { j });
    ArrayList localArrayList4 = new ArrayList();
    int i1 = localzbfe.a(paramzbfc, i, new int[] { j });
    zbfc localzbfc1 = null;
    if (i1 > 0) {
      localzbfc1 = localzbfe.a(i1 - 1, i, new int[] { j });
    }
    if (localzbfc1 != null) {
      com.aspose.cells.b.a.a.zf.a(localArrayList4, localzbfc1);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList4, paramzbfc);
    for (int i2 = 0; i2 < localArrayList4.size(); i2++)
    {
      zbfc localzbfc2 = (zbfc)localArrayList4.get(i2);
      int i3 = localzbfe.a(localzbfc2, i, new int[] { j });
      int i4 = localzbfc2.ai();
      ArrayList localArrayList5 = new ArrayList();
      ArrayList localArrayList6 = new ArrayList();
      zkg localzkg = localzbfe.c(i4).D();
      for (int i5 = 0; i5 < paramInt; i5++)
      {
        zke localzke = localzkg.b(i5);
        double d4 = (float)d3 * i5;
        if ((localzbs2.f()) || (paramzje.u())) {
          d4 += (float)(d3 / 2.0D);
        }
        if (localzbs2.p()) {
          d4 = paramzp.c() + paramzp.e() - d4;
        } else {
          d4 = paramzp.c() + d4;
        }
        if ((localzke != null) && (!localzke.a()))
        {
          double d5 = localzke.w();
          double d6 = d5;
          double d7 = 0.0D;
          double d8;
          for (int i7 = 0; i7 < i3; i7++)
          {
            localObject = ((zbfc)localList.get(i7)).D().b(i5);
            if (localObject != null)
            {
              d8 = ((zke)localObject).w();
              d6 += d8;
            }
          }
          for (i7 = 0; i7 < localList.size(); i7++)
          {
            localObject = ((zbfc)localList.get(i7)).D().b(i5);
            if (localObject != null)
            {
              d8 = ((zke)localObject).w();
              d7 += Math.abs(d8);
            }
          }
          float f2 = 0.0F;
          if (d7 != 0.0D) {
            f2 = (float)Math.abs(d6) * 100.0F / (float)d7 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
          }
          if (!localzbs1.p())
          {
            if (d6 <= 0.0D) {
              f2 = f1 + f2;
            } else {
              f2 = f1 - f2;
            }
          }
          else if (d6 <= 0.0D) {
            f2 = f1 - f2;
          } else {
            f2 = f1 + f2;
          }
          Object localObject = new zo((float)d4, f2);
          zkn.a((zo)localObject, localArrayList5, localArrayList6, i5);
          if (localzbfc2.equals(paramzbfc))
          {
            zub localzub = paramzbfc.x();
            double d9 = 0.0D;
            double d10 = 0.0D;
            float f3 = 0.0F;
            float f4 = 0.0F;
            if (localzub != null)
            {
              switch (localzub.g())
              {
              case 1: 
                d9 = localzub.c();
                d10 = d9;
                break;
              case 2: 
                d9 = localzub.c() * d5 / 100.0D;
                d10 = -d9;
                break;
              case 0: 
                double d11 = localzub.e().size() > i5 ? localzub.a(localzub.e().get(i5)) : 0.0D;
                d9 = d11;
                d11 = localzub.f().size() > i5 ? localzub.a(localzub.f().get(i5)) : 0.0D;
                d10 = d11;
                break;
              }
              d10 = d10 * 100.0D / d7;
              d9 = d9 * 100.0D / d7;
              f3 = (float)d9 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
              f4 = (float)d10 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
            }
            localzub.a((zo)localObject, f3, f4);
          }
        }
        else
        {
          zo localzo = new zo((float)d4, paramFloat);
          for (int i6 = i2; i6 > 0; i6--) {
            if (((ArrayList)localArrayList2.get(i6 - 1)).get(i5) != null)
            {
              localzo = (zo)((ArrayList)localArrayList2.get(i6 - 1)).get(i5);
              break;
            }
          }
          if (i2 == 0) {
            localzo = new zo((float)d4, paramFloat);
          }
          zkn.a(localzo, localArrayList5, localArrayList6, i5);
        }
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList5);
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
    }
    a(paramzr, localArrayList4, localArrayList2, localArrayList3, paramFloat, bool, localzanq, localArrayList1, localzbs2, paramzp);
    return localArrayList1;
  }
  
  private static ArrayList d(zr paramzr, zje paramzje, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, int paramInt)
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    int i = 2;
    zbfe localzbfe = paramzje.z();
    int j = localzbfe.getCount();
    zbfc localzbfc1 = paramzje.z().a(paramInt, i);
    if (localzbfc1 == null) {
      return localArrayList1;
    }
    zbs localzbs2;
    zbs localzbs1;
    ArrayList localArrayList2;
    if (paramInt == 1)
    {
      localzbs2 = paramzje.e();
      localzbs1 = paramzje.E();
      localArrayList2 = ziy.a(paramzje.z().c(), paramzje.U());
    }
    else
    {
      localzbs2 = paramzje.g();
      localzbs1 = paramzje.G();
      localArrayList2 = ziy.a(paramzje.z().d(), paramzje.U());
    }
    float f1 = 0.0F;
    if (!localzbs1.p()) {
      f1 = paramzp.d() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    } else {
      f1 = paramzp.j() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
    }
    double d1 = localzbs1.D();
    double d2 = localzbs1.z();
    boolean bool = localzbfc1.L();
    zanq localzanq = localzbfc1.O();
    int k = localArrayList2.size();
    int m = localzbs2.j();
    int n = (int)localzbs2.D();
    int i1 = (int)localzbs2.z();
    int i2 = 0;
    if ((localzbs2.f()) || (paramzje.u()))
    {
      i2 = zbu.a(m, i1, n, paramzje.U()) + 1;
    }
    else
    {
      i2 = zbu.a(m, i1, n, paramzje.U());
      if (i2 == 0) {
        i2 = 1;
      }
    }
    double d3 = paramzp.e() / i2;
    float f2 = 0.0F;
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    List localList = localzbfe.a(paramInt, new int[] { i });
    ArrayList localArrayList5 = new ArrayList();
    int i3 = localzbfe.a(paramzbfc, paramInt, new int[] { i });
    zbfc localzbfc2 = null;
    if (i3 > 0) {
      localzbfc2 = localzbfe.a(i3 - 1, paramInt, new int[] { i });
    }
    if (localzbfc2 != null) {
      com.aspose.cells.b.a.a.zf.a(localArrayList5, localzbfc2);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList5, paramzbfc);
    for (int i4 = 0; i4 < localArrayList5.size(); i4++)
    {
      zbfc localzbfc3 = (zbfc)localArrayList5.get(i4);
      int i5 = localzbfe.a(localzbfc3, paramInt, new int[] { i });
      int i6 = localzbfc3.ai();
      ArrayList localArrayList6 = new ArrayList();
      ArrayList localArrayList7 = new ArrayList();
      for (int i7 = 0; i7 < k; i7++)
      {
        zke localzke = localzbfe.c(i6).D().b(i7);
        int i8 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i7)));
        i8 = zbu.a(m, i8, paramzje.U());
        int i9 = zbu.a(m, i8, n, paramzje.U());
        float f3 = (float)(d3 * i9);
        f2 = (float)(d3 * zbu.a(m, zbu.a(localzbs2.j(), localzbs2.y(), (int)localzbs2.x(), i8, paramzje.U()), i8, paramzje.U()));
        if ((localzbs2.f()) || (paramzje.u())) {
          f3 += (float)(d3 / 2.0D);
        }
        float f4 = 0.0F;
        if (localzbs2.p()) {
          f4 = paramzp.c() + paramzp.e() - f3;
        } else {
          f4 = paramzp.c() + f3;
        }
        if ((localzke != null) && (!localzke.a()))
        {
          double d4 = localzke.w();
          double d5 = d4;
          double d6 = 0.0D;
          double d7;
          for (int i11 = 0; i11 < i5; i11++)
          {
            localObject = ((zbfc)localList.get(i11)).D().b(i7);
            if (localObject != null)
            {
              d7 = ((zke)localObject).w();
              d5 += d7;
            }
          }
          for (i11 = 0; i11 < localList.size(); i11++)
          {
            localObject = ((zbfc)localList.get(i11)).D().b(i7);
            if (localObject != null)
            {
              d7 = ((zke)localObject).w();
              d6 += Math.abs(d7);
            }
          }
          float f5 = 0.0F;
          if (d6 != 0.0D) {
            f5 = (float)Math.abs(d5) * 100.0F / (float)d6 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
          }
          if (!localzbs1.p())
          {
            if (d5 <= 0.0D) {
              f5 = f1 + f5;
            } else {
              f5 = f1 - f5;
            }
          }
          else if (d5 <= 0.0D) {
            f5 = f1 - f5;
          } else {
            f5 = f1 + f5;
          }
          Object localObject = new zo(f4, f5);
          zkn.a((zo)localObject, localArrayList6, localArrayList7, i7);
          if (localzbfc3.equals(paramzbfc))
          {
            zub localzub = paramzbfc.x();
            double d8 = 0.0D;
            double d9 = 0.0D;
            float f6 = 0.0F;
            float f7 = 0.0F;
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
                double d10 = localzub.e().size() > i7 ? localzub.a(localzub.e().get(i7)) : 0.0D;
                d8 = d10;
                d10 = localzub.f().size() > i7 ? localzub.a(localzub.f().get(i7)) : 0.0D;
                d9 = d10;
                break;
              }
              d9 = d9 * 100.0D / d6;
              d8 = d8 * 100.0D / d6;
              f6 = (float)d8 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
              f7 = (float)d9 / (float)(localzbs1.z() - localzbs1.D()) * paramzp.f();
            }
            localzub.a((zo)localObject, f6, f7);
          }
        }
        else
        {
          zo localzo = new zo(f4, paramFloat);
          for (int i10 = i4; i10 > 0; i10--) {
            if (((ArrayList)localArrayList3.get(i10 - 1)).get(i7) != null)
            {
              localzo = (zo)((ArrayList)localArrayList3.get(i10 - 1)).get(i7);
              break;
            }
          }
          if (i4 == 0) {
            localzo = new zo(f4, paramFloat);
          }
          zkn.a(localzo, localArrayList6, localArrayList7, i7);
        }
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
      com.aspose.cells.b.a.a.zf.a(localArrayList4, localArrayList7);
    }
    a(paramzr, localArrayList5, localArrayList3, localArrayList4, paramFloat, bool, localzanq, localArrayList1, localzbs2, paramzp);
    return localArrayList1;
  }
  
  static zq a(zo[] paramArrayOfzo)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    if (paramArrayOfzo.length > 0)
    {
      f1 = paramArrayOfzo[0].d();
      f2 = paramArrayOfzo[0].d();
      f3 = paramArrayOfzo[0].e();
      f4 = paramArrayOfzo[0].e();
    }
    for (int i = 1; i < paramArrayOfzo.length; i++)
    {
      zo localzo = paramArrayOfzo[i];
      if (localzo.d() < f1) {
        f1 = localzo.d();
      }
      if (localzo.d() > f2) {
        f2 = localzo.d();
      }
      if (localzo.e() < f3) {
        f3 = localzo.e();
      }
      if (localzo.e() > f4) {
        f4 = localzo.e();
      }
    }
    return new zq(f1, f3, f2 - f1, f4 - f3);
  }
  
  private static void a(zr paramzr, zbfc paramzbfc, List paramList1, List paramList2, ArrayList paramArrayList1, float paramFloat, boolean paramBoolean, zanq paramzanq, ArrayList paramArrayList2, zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
    throws Exception
  {
    for (int i = 0; i < paramList1.size(); i++)
    {
      localObject1 = (zo)paramList1.get(i);
      localObject2 = paramzbfc.D().b(((Integer)paramList2.get(i)).intValue());
      if (localObject2 != null)
      {
        ((zke)localObject2).a(new zq(((zo)localObject1).d(), ((zo)localObject1).e(), 0.0F, 0.0F));
        com.aspose.cells.b.a.a.zf.a(((zke)localObject2).b, new zo(((zo)localObject1).d(), ((zo)localObject1).e()));
        com.aspose.cells.b.a.a.zf.a(((zke)localObject2).d, new zo(((zo)localObject1).d(), paramFloat));
      }
    }
    if (paramList1.size() < 2) {
      return;
    }
    com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(paramzp.c(), paramzp.d() + 1, paramzp.e() + 2, paramzp.f());
    Object localObject1 = paramzr.d();
    Object localObject2 = paramzr.e();
    paramzr.a(localzp);
    Object localObject4;
    Object localObject5;
    if (!paramzbfc.aC())
    {
      for (int j = 0; j < paramList1.size(); j++)
      {
        localObject4 = (zo)paramList1.get(j);
        if ((!a(j, paramArrayList1)) && (paramzbfc.k().a(j) != null))
        {
          localObject5 = new Object[4];
          localObject5[0] = Integer.valueOf(paramzbfc.ai());
          localObject5[1] = ((Integer)paramList2.get(j));
          localObject5[2] = new zo(((zo)localObject4).d(), (((zo)localObject4).e() + paramFloat) / 2.0F);
          localObject5[3] = paramzbs;
          com.aspose.cells.b.a.a.zf.a(paramArrayList2, localObject5);
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
      if (paramzbfc.k().a(0) != null)
      {
        localObject4 = new Object[4];
        localObject4[0] = Integer.valueOf(paramzbfc.ai());
        localObject4[1] = Integer.valueOf(0);
        localObject4[2] = localObject3;
        localObject4[3] = paramzbs;
        com.aspose.cells.b.a.a.zf.a(paramArrayList2, localObject4);
      }
    }
    Object localObject3 = new ArrayList();
    for (int k = 0; k < paramList1.size(); k++)
    {
      localObject5 = (zo)paramList1.get(k);
      if ((a(k, paramArrayList1)) || (k == paramList1.size() - 1))
      {
        if ((!a(k, paramArrayList1)) && (k == paramList1.size() - 1)) {
          com.aspose.cells.b.a.a.zf.a((ArrayList)localObject3, localObject5);
        }
        if (((ArrayList)localObject3).size() > 1)
        {
          zo[] arrayOfzo = new zo[2 * ((ArrayList)localObject3).size()];
          zbxz.a(arrayOfzo);
          for (int m = 0; m < ((ArrayList)localObject3).size(); m++)
          {
            localObject6 = (zo)((ArrayList)localObject3).get(m);
            arrayOfzo[m] = localObject6;
            arrayOfzo[(arrayOfzo.length - 1 - m)] = new zo(((zo)localObject6).d(), paramFloat);
          }
          zq localzq = a(arrayOfzo);
          Object localObject6 = zbd.a(paramzbfc.A(), localzq);
          try
          {
            paramzr.a((zc)localObject6, arrayOfzo);
            paramzr.c(zanv.a(paramzbfc.z()), arrayOfzo);
          }
          finally
          {
            if (localObject6 != null) {
              ((zc)localObject6).f();
            }
          }
          zo localzo = arrayOfzo[0];
          zanv.a(paramzr, localzo.d(), localzo.e(), localzo.d(), paramFloat, paramzbfc.z());
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
          zanv.a(paramzr, ((zo)localObject5).d(), ((zo)localObject5).e(), ((zo)localObject5).d(), paramFloat, paramzanq);
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
  
  private static void a(zr paramzr, List paramList1, List paramList2, List paramList3, float paramFloat, boolean paramBoolean, zanq paramzanq, ArrayList paramArrayList, zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    Object localObject3;
    Object localObject4;
    for (int i = paramList2.size() - 1; i < paramList2.size(); i++)
    {
      localObject1 = (ArrayList)paramList2.get(i);
      localObject2 = (ArrayList)paramList3.get(i);
      zbfc localzbfc = (zbfc)paramList1.get(i);
      for (int k = 0; k < ((ArrayList)localObject1).size(); k++)
      {
        localObject3 = (zo)((ArrayList)localObject1).get(k);
        localObject4 = localzbfc.D().b(((Integer)((ArrayList)localObject2).get(k)).intValue());
        if (localObject4 != null)
        {
          ((zke)localObject4).a(new zq(((zo)localObject3).d(), ((zo)localObject3).e(), 0.0F, 0.0F));
          com.aspose.cells.b.a.a.zf.a(((zke)localObject4).b, new zo(((zo)localObject3).d(), ((zo)localObject3).e()));
          com.aspose.cells.b.a.a.zf.a(((zke)localObject4).d, new zo(((zo)localObject3).d(), paramFloat));
        }
      }
    }
    zq localzq = new zq(paramzp.c(), paramzp.d() + 0.5F, paramzp.e(), paramzp.f() + 1);
    Object localObject1 = paramzr.d();
    Object localObject2 = paramzr.e();
    paramzr.a(localzq);
    ArrayList localArrayList1;
    for (int j = paramList2.size() - 1; j < paramList2.size(); j++)
    {
      localArrayList1 = (ArrayList)paramList2.get(j);
      localObject3 = (ArrayList)paramList3.get(j);
      localObject4 = (zbfc)paramList1.get(j);
      ArrayList localArrayList2 = null;
      if (j > 0) {
        localArrayList2 = (ArrayList)paramList2.get(j - 1);
      }
      if (localArrayList1.size() >= 2)
      {
        zo localzo1 = (zo)localArrayList1.get(0);
        zanv.a(paramzr, localzo1.d(), localzo1.e(), localzo1.d(), paramFloat, ((zbfc)localObject4).z());
        zo[] arrayOfzo = new zo[2 * localArrayList1.size()];
        zbxz.a(arrayOfzo);
        for (int n = 0; n < localArrayList1.size(); n++)
        {
          localObject6 = (zo)localArrayList1.get(n);
          arrayOfzo[n] = localObject6;
          if (localArrayList2 == null) {
            arrayOfzo[(arrayOfzo.length - 1 - n)] = new zo(((zo)localObject6).d(), paramFloat);
          } else {
            arrayOfzo[(arrayOfzo.length - 1 - n)] = ((zo)localArrayList2.get(n));
          }
        }
        Object localObject7;
        if (!((zbfc)localObject4).aC())
        {
          for (n = 0; n < localArrayList1.size(); n++) {
            if (((zbfc)localObject4).k().a(n) != null)
            {
              localObject6 = (zo)localArrayList1.get(n);
              localObject7 = new Object[4];
              localObject7[0] = Integer.valueOf(((zbfc)localObject4).ai());
              localObject7[1] = ((Integer)((ArrayList)localObject3).get(n));
              localObject7[2] = new zo(((zo)localObject6).d(), (((zo)localObject6).e() + arrayOfzo[(arrayOfzo.length - 1 - n)].e()) / 2.0F);
              localObject7[3] = paramzbs;
              com.aspose.cells.b.a.a.zf.a(paramArrayList, localObject7);
            }
          }
        }
        else
        {
          localObject5 = zo.a();
          if (localArrayList1.size() % 2 == 0)
          {
            localObject6 = (zo)localArrayList1.get(localArrayList1.size() / 2);
            localObject7 = (zo)localArrayList1.get(localArrayList1.size() / 2 - 1);
            if (localArrayList2 == null)
            {
              ((zo)localObject5).a((((zo)localObject6).d() + ((zo)localObject7).d()) / 2.0F);
              ((zo)localObject5).b(((((zo)localObject6).e() + paramFloat) / 2.0F + (((zo)localObject7).e() + paramFloat) / 2.0F) / 2.0F);
            }
            else
            {
              zo localzo2 = (zo)localArrayList2.get(localArrayList1.size() / 2);
              zo localzo3 = (zo)localArrayList2.get(localArrayList1.size() / 2 - 1);
              ((zo)localObject5).a((((zo)localObject6).d() + ((zo)localObject7).d()) / 2.0F);
              ((zo)localObject5).b(((((zo)localObject6).e() + localzo2.e()) / 2.0F + (((zo)localObject7).e() + localzo3.e()) / 2.0F) / 2.0F);
            }
          }
          else
          {
            localObject6 = (zo)localArrayList1.get(localArrayList1.size() / 2);
            if (localArrayList2 == null)
            {
              localObject5 = new zo(((zo)localObject6).d(), (((zo)localObject6).e() + paramFloat) / 2.0F);
            }
            else
            {
              localObject7 = (zo)localArrayList2.get(localArrayList1.size() / 2);
              localObject5 = new zo(((zo)localObject6).d(), (((zo)localObject6).e() + ((zo)localObject7).e()) / 2.0F);
            }
          }
          if (((zbfc)localObject4).k().a(0) != null)
          {
            localObject6 = new Object[4];
            localObject6[0] = Integer.valueOf(((zbfc)localObject4).ai());
            localObject6[1] = Integer.valueOf(0);
            localObject6[2] = localObject5;
            localObject6[3] = paramzbs;
            com.aspose.cells.b.a.a.zf.a(paramArrayList, localObject6);
          }
        }
        Object localObject5 = a(arrayOfzo);
        Object localObject6 = zbd.a(((zbfc)localObject4).A(), (zq)localObject5);
        try
        {
          paramzr.a((zc)localObject6, arrayOfzo);
        }
        finally
        {
          if (localObject6 != null) {
            ((zc)localObject6).f();
          }
        }
        paramzr.c(zanv.a(((zbfc)localObject4).z()), arrayOfzo);
      }
    }
    if (paramBoolean) {
      for (j = 0; j < paramList2.size(); j++)
      {
        localArrayList1 = (ArrayList)paramList2.get(j);
        for (int m = 1; m < localArrayList1.size() - 1; m++)
        {
          localObject4 = (zo)localArrayList1.get(m);
          zanv.a(paramzr, ((zo)localObject4).d(), ((zo)localObject4).e(), ((zo)localObject4).d(), paramFloat, paramzanq);
        }
      }
    }
    paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject1);
  }
  
  static void a(zr paramzr, zje paramzje, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    if (paramInt < 2) {
      return;
    }
    zbfe localzbfe = paramzje.z();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    if (localzbs2.k() == 2)
    {
      a(paramzr, paramzje, paramFloat, paramDouble);
      return;
    }
    float f1 = paramzje.m() / 100.0F;
    float f2 = paramzje.n() / 100.0F;
    ArrayList localArrayList1 = new ArrayList();
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
    Object localObject1;
    ArrayList localArrayList4;
    int i2;
    int i3;
    float f5;
    int i4;
    zke localzke1;
    double d1;
    float f6;
    zo[] arrayOfzo1;
    zo[] arrayOfzo2;
    Object localObject2;
    zo[] arrayOfzo3;
    zo localzo3;
    Object[] arrayOfObject3;
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
        localObject1 = null;
        localArrayList4 = new ArrayList();
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
          localzke1 = localzkg.b(i4);
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzke1);
          d1 = 0.0D;
          if ((localzke1 != null) && (!localzke1.a()))
          {
            d1 = localzke1.w();
            localObject1 = localzke1;
          }
          f6 = (float)((paramDouble - d1) / (localzbs1.z() - localzbs1.D()) * paramzje.N().i());
          if (localzbs1.p()) {
            f6 = -f6;
          }
          arrayOfzo1 = zlq.a(paramzr, paramzje, paramFloat, 0.0F, f5, f4, i1 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo1);
          arrayOfzo2 = zlq.a(paramzr, paramzje, paramFloat, f6, f5, f4, i1 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo2);
          if ((localzke1 != null) && (!localzke1.a())) {
            if (!localzbfc.aC())
            {
              zo localzo1 = new zo(0.0F, 0.0F);
              if ((paramzje.D() >= 90) && (paramzje.D() < 270))
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
              float f7 = paramzje.N().g() / 2.0F;
              f7 = paramzje.N().e() + f7;
              double d2 = 0.0D;
              zke localzke2;
              if (paramInt % 2 == 0)
              {
                localzke2 = localzkg.b(paramInt / 2);
                localObject2 = localzkg.b(paramInt / 2 - 1);
                d2 = (localzke2.w() + ((zke)localObject2).w()) / 2.0D;
              }
              else
              {
                localzke2 = localzkg.b(paramInt / 2);
                d2 = localzke2.w();
              }
              float f9 = (float)(paramDouble - d2) / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
              if (localzbs1.p()) {
                f9 = -f9;
              }
              localObject2 = zlq.a(paramzr, paramzje, paramFloat, 0.0F, f7, f4, i1 + 1, localArrayList3.size());
              arrayOfzo3 = zlq.a(paramzr, paramzje, paramFloat, f9, f7, f4, i1 + 1, localArrayList3.size());
              localzo3 = new zo(0.0F, 0.0F);
              if ((paramzje.D() >= 90) && (paramzje.D() < 270))
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
        a(paramzr, paramzje, localzbfc, (zke)localObject1, localArrayList2, localArrayList4);
        localArrayList4.clear();
        localArrayList2.clear();
        zlq.c(paramzr, paramzje, localArrayList1);
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
        localObject1 = null;
        localArrayList4 = new ArrayList();
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
          localzke1 = localzkg.b(i4);
          com.aspose.cells.b.a.a.zf.a(localArrayList4, localzke1);
          d1 = localzke1.w();
          if ((localzke1 != null) && (!localzke1.a()))
          {
            d1 = localzke1.w();
            localObject1 = localzke1;
          }
          f6 = (float)((paramDouble - d1) / (localzbs1.z() - localzbs1.D()) * paramzje.N().i());
          if (localzbs1.p()) {
            f6 = -f6;
          }
          arrayOfzo1 = zlq.a(paramzr, paramzje, paramFloat, 0.0F, f5, f4, i1 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo1);
          arrayOfzo2 = zlq.a(paramzr, paramzje, paramFloat, f6, f5, f4, i1 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo2);
          if ((localzke1 != null) && (!localzke1.a())) {
            if (!localzbfc.aC())
            {
              zo localzo2 = new zo(0.0F, 0.0F);
              if ((paramzje.D() >= 90) && (paramzje.D() < 270))
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
              float f8 = paramzje.N().g() / 2.0F;
              f8 = paramzje.N().e() + f8;
              double d3 = 0.0D;
              zke localzke3;
              if (paramInt % 2 == 0)
              {
                localzke3 = localzkg.b(paramInt / 2);
                localObject2 = localzkg.b(paramInt / 2 - 1);
                d3 = (localzke3.w() + ((zke)localObject2).w()) / 2.0D;
              }
              else
              {
                localzke3 = localzkg.b(paramInt / 2);
                d3 = localzke3.w();
              }
              float f10 = (float)(paramDouble - d3) / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
              if (localzbs1.p()) {
                f10 = -f10;
              }
              localObject2 = zlq.a(paramzr, paramzje, paramFloat, 0.0F, f8, f4, i1 + 1, localArrayList3.size());
              arrayOfzo3 = zlq.a(paramzr, paramzje, paramFloat, f10, f8, f4, i1 + 1, localArrayList3.size());
              localzo3 = new zo(0.0F, 0.0F);
              if ((paramzje.D() >= 90) && (paramzje.D() < 270))
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
        a(paramzr, paramzje, localzbfc, (zke)localObject1, localArrayList2, localArrayList4);
        localArrayList4.clear();
        localArrayList2.clear();
        zlq.c(paramzr, paramzje, localArrayList1);
        localArrayList1.clear();
      }
    }
  }
  
  private static void a(zr paramzr, zje paramzje, float paramFloat, double paramDouble)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
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
    Object localObject1;
    ArrayList localArrayList5;
    int i6;
    int i7;
    int i8;
    int i9;
    float f5;
    float f6;
    int i10;
    zke localzke1;
    double d1;
    float f7;
    zo[] arrayOfzo1;
    zo[] arrayOfzo2;
    Object localObject2;
    zo[] arrayOfzo3;
    zo localzo3;
    Object[] arrayOfObject3;
    if (((paramzje.D() >= 0) && (paramzje.D() < 90)) || ((paramzje.D() >= 180) && (paramzje.D() < 270))) {
      for (i3 = 0; i3 < localArrayList3.size(); i3++)
      {
        i4 = localArrayList3.size() - 1 - i3;
        if ((paramzje.D() >= 180) && (paramzje.D() < 270)) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        if (paramzje.I().p()) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        localzbfc = (zbfc)localArrayList3.get(i4);
        i5 = localzbfc.ai();
        localzkg = localzbfc.D();
        localObject1 = null;
        localArrayList5 = new ArrayList();
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
          localzke1 = localzkg.b(i10);
          com.aspose.cells.b.a.a.zf.a(localArrayList5, localzke1);
          d1 = 0.0D;
          if ((localzke1 != null) && (!localzke1.a()))
          {
            d1 = localzke1.w();
            localObject1 = localzke1;
          }
          f7 = (float)((paramDouble - d1) / (localzbs1.z() - localzbs1.D()) * paramzje.N().i());
          if (localzbs1.p()) {
            f7 = -f7;
          }
          arrayOfzo1 = zlq.a(paramzr, paramzje, paramFloat, 0.0F, f6, f4, i5 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo1);
          arrayOfzo2 = zlq.a(paramzr, paramzje, paramFloat, f7, f6, f4, i5 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo2);
          if ((localzke1 != null) && (!localzke1.a())) {
            if (!localzbfc.aC())
            {
              zo localzo1 = new zo(0.0F, 0.0F);
              if ((paramzje.D() >= 90) && (paramzje.D() < 270))
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
              float f8 = paramzje.N().g() / 2.0F;
              f8 = paramzje.N().e() + f8;
              double d2 = 0.0D;
              zke localzke2;
              if (i2 % 2 == 0)
              {
                localzke2 = localzkg.b(i2 / 2);
                localObject2 = localzkg.b(i2 / 2 - 1);
                d2 = (localzke2.w() + ((zke)localObject2).w()) / 2.0D;
              }
              else
              {
                localzke2 = localzkg.b(i2 / 2);
                d2 = localzke2.w();
              }
              float f10 = (float)(paramDouble - d2) / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
              if (localzbs1.p()) {
                f10 = -f10;
              }
              localObject2 = zlq.a(paramzr, paramzje, paramFloat, 0.0F, f8, f4, i5 + 1, localArrayList3.size());
              arrayOfzo3 = zlq.a(paramzr, paramzje, paramFloat, f10, f8, f4, i5 + 1, localArrayList3.size());
              localzo3 = new zo(0.0F, 0.0F);
              if ((paramzje.D() >= 90) && (paramzje.D() < 270))
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
        a(paramzr, paramzje, localzbfc, (zke)localObject1, localArrayList2, localArrayList5);
        localArrayList5.clear();
        localArrayList2.clear();
        zlq.c(paramzr, paramzje, localArrayList1);
        localArrayList1.clear();
      }
    } else if (((paramzje.D() >= 90) && (paramzje.D() < 180)) || ((paramzje.D() >= 270) && (paramzje.D() < 360))) {
      for (i3 = 0; i3 < localArrayList3.size(); i3++)
      {
        i4 = i3;
        if ((paramzje.D() >= 270) && (paramzje.D() < 360)) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        if (paramzje.I().p()) {
          i4 = localArrayList3.size() - 1 - i4;
        }
        localzbfc = (zbfc)localArrayList3.get(i4);
        i5 = localzbfc.ai();
        localzkg = localzbfc.D();
        localObject1 = null;
        localArrayList5 = new ArrayList();
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
          localzke1 = localzkg.b(i10);
          com.aspose.cells.b.a.a.zf.a(localArrayList5, localzke1);
          d1 = localzke1.w();
          if ((localzke1 != null) && (!localzke1.a()))
          {
            d1 = localzke1.w();
            localObject1 = localzke1;
          }
          f7 = (float)((paramDouble - d1) / (localzbs1.z() - localzbs1.D()) * paramzje.N().i());
          if (localzbs1.p()) {
            f7 = -f7;
          }
          arrayOfzo1 = zlq.a(paramzr, paramzje, paramFloat, 0.0F, f6, f4, i5 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo1);
          arrayOfzo2 = zlq.a(paramzr, paramzje, paramFloat, f7, f6, f4, i5 + 1, localArrayList3.size());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, arrayOfzo2);
          if ((localzke1 != null) && (!localzke1.a())) {
            if (!localzbfc.aC())
            {
              zo localzo2 = new zo(0.0F, 0.0F);
              if ((paramzje.D() >= 90) && (paramzje.D() < 270))
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
              float f9 = paramzje.N().g() / 2.0F;
              f9 = paramzje.N().e() + f9;
              double d3 = 0.0D;
              zke localzke3;
              if (i2 % 2 == 0)
              {
                localzke3 = localzkg.b(i2 / 2);
                localObject2 = localzkg.b(i2 / 2 - 1);
                d3 = (localzke3.w() + ((zke)localObject2).w()) / 2.0D;
              }
              else
              {
                localzke3 = localzkg.b(i2 / 2);
                d3 = localzke3.w();
              }
              float f11 = (float)(paramDouble - d3) / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
              if (localzbs1.p()) {
                f11 = -f11;
              }
              localObject2 = zlq.a(paramzr, paramzje, paramFloat, 0.0F, f9, f4, i5 + 1, localArrayList3.size());
              arrayOfzo3 = zlq.a(paramzr, paramzje, paramFloat, f11, f9, f4, i5 + 1, localArrayList3.size());
              localzo3 = new zo(0.0F, 0.0F);
              if ((paramzje.D() >= 90) && (paramzje.D() < 270))
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
        a(paramzr, paramzje, localzbfc, (zke)localObject1, localArrayList2, localArrayList5);
        localArrayList5.clear();
        localArrayList2.clear();
        zlq.c(paramzr, paramzje, localArrayList1);
        localArrayList1.clear();
      }
    }
  }
  
  static void a(zr paramzr, zje paramzje, float paramFloat, double paramDouble, int paramInt, boolean paramBoolean)
    throws Exception
  {
    if (paramInt < 2) {
      return;
    }
    zbfe localzbfe = paramzje.z();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    if (localzbs2.k() == 2)
    {
      a(paramzr, paramzje, paramFloat, paramDouble, paramBoolean);
      return;
    }
    float f1 = paramzje.m() / 100.0F;
    float f2 = paramzje.n() / 100.0F;
    float f3 = paramzje.o() / 100.0F;
    float f4 = 0.0F;
    if (!localzbs1.p()) {
      f4 = paramzje.N().f() - paramzje.N().i() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
    } else {
      f4 = paramzje.N().f() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
    }
    ArrayList localArrayList1 = new ArrayList();
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
    float f5 = paramzje.N().g() / j;
    float f6 = f5 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    for (int m = 0; m < paramInt; m++)
    {
      float f7 = paramzje.N().e() + f5 * m;
      if (k != 0) {
        f7 += f5 / 2.0F;
      }
      localObject1 = a(paramzje, f7, f6, f4, paramzr);
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localObject1);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList2, localArrayList3);
    ArrayList localArrayList4 = localzbfe.j();
    zke[] arrayOfzke = new zke[localArrayList4.size()];
    Object localObject1 = new ArrayList[localArrayList4.size()];
    Object localObject2 = null;
    for (int n = 0; n < localArrayList4.size(); n++)
    {
      zbfc localzbfc = (zbfc)localArrayList4.get(n);
      int i1 = localzbfc.ai();
      int i2 = n;
      zkg localzkg = localzbfc.D();
      ArrayList localArrayList5 = new ArrayList();
      if (n == 0) {
        localObject2 = localArrayList3;
      }
      ArrayList localArrayList6 = new ArrayList();
      for (int i3 = 0; i3 < paramInt; i3++)
      {
        int i4 = i3;
        float f8 = f5 * i4;
        f8 = paramzje.N().e() + f8;
        if (k != 0) {
          f8 += f5 / 2.0F;
        }
        int i5 = i4;
        if (localzbs2.p()) {
          i5 = paramInt - 1 - i4;
        }
        zke localzke = localzkg.b(i5);
        com.aspose.cells.b.a.a.zf.a(localArrayList6, localzke);
        double d1 = 0.0D;
        double d2 = 0.0D;
        double d3 = 0.0D;
        double d4;
        if (localzke != null)
        {
          arrayOfzke[n] = localzke;
          d1 = Math.abs(localzke.w());
          d2 = d1;
          for (i6 = 0; i6 < i2; i6++)
          {
            localObject3 = ((zbfc)localArrayList4.get(i6)).D().b(i5);
            if (localObject3 != null)
            {
              d4 = Math.abs(((zke)localObject3).w());
              d2 += Math.abs(d4);
            }
          }
        }
        for (int i6 = 0; i6 < localArrayList4.size(); i6++)
        {
          localObject3 = ((zbfc)localArrayList4.get(i6)).D().b(i5);
          if (localObject3 != null)
          {
            d4 = ((zke)localObject3).w();
            d3 += Math.abs(d4);
          }
        }
        float f9;
        if (!paramBoolean)
        {
          f9 = (float)d2 / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
        }
        else
        {
          if (d3 == 0.0D)
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList5, ((ArrayList)localObject2).get(i4));
            continue;
          }
          f9 = (float)d2 * 100.0F / (float)d3 / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
        }
        if (localzbs1.p()) {
          f9 = -f9;
        }
        Object localObject3 = a(paramzje, f8, f6, f4 - f9, paramzr);
        com.aspose.cells.b.a.a.zf.a(localArrayList5, localObject3);
        if ((localzke != null) && (!localzke.a()))
        {
          Object localObject4;
          zo[] arrayOfzo1;
          Object localObject5;
          if ((!localzbfc.aC()) && (((ArrayList)localObject2).size() > i4))
          {
            localObject4 = new zo(0.0F, 0.0F);
            arrayOfzo1 = (zo[])((ArrayList)localObject2).get(i4);
            if ((paramzje.D() >= 90) && (paramzje.D() < 270))
            {
              ((zo)localObject4).a(localObject3[1].d());
              ((zo)localObject4).b((arrayOfzo1[1].e() + localObject3[1].e()) / 2.0F);
            }
            else
            {
              ((zo)localObject4).a(localObject3[0].d());
              ((zo)localObject4).b((arrayOfzo1[0].e() + localObject3[0].e()) / 2.0F);
            }
            localObject5 = new Object[3];
            localObject5[0] = Integer.valueOf(i1);
            localObject5[1] = Integer.valueOf(i5);
            localObject5[2] = localObject4;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, localObject5);
          }
          if (i3 == paramInt - 1)
          {
            localObject4 = (zo[])localArrayList5.get(paramInt / 2 - 1);
            arrayOfzo1 = (zo[])localArrayList5.get(paramInt / 2);
            localObject5 = (zo[])((ArrayList)localObject2).get(paramInt / 2 - 1);
            zo[] arrayOfzo2 = (zo[])((ArrayList)localObject2).get(paramInt / 2);
            if (paramInt % 2 != 0)
            {
              arrayOfzo1 = (zo[])localArrayList5.get(paramInt / 2 + 1);
              arrayOfzo2 = (zo[])((ArrayList)localObject2).get(paramInt / 2 + 1);
            }
            zo localzo = new zo(0.0F, 0.0F);
            if ((paramzje.D() >= 90) && (paramzje.D() < 270))
            {
              localzo.a((localObject4[1].d() + localObject5[1].d() + arrayOfzo1[1].d() + arrayOfzo2[1].d()) / 4.0F);
              localzo.b((localObject4[1].e() + localObject5[1].e() + arrayOfzo1[1].e() + arrayOfzo2[1].e()) / 4.0F);
            }
            else
            {
              localzo.a((localObject4[0].d() + localObject5[0].d() + arrayOfzo1[0].d() + arrayOfzo2[0].d()) / 4.0F);
              localzo.b((localObject4[0].e() + localObject5[0].e() + arrayOfzo1[0].e() + arrayOfzo2[0].e()) / 4.0F);
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
    a(paramzr, paramzje, localArrayList4, arrayOfzke, localArrayList2, (ArrayList[])localObject1);
    zlq.c(paramzr, paramzje, localArrayList1);
  }
  
  private static void a(zr paramzr, zje paramzje, float paramFloat, double paramDouble, boolean paramBoolean)
    throws Exception
  {
    zbfe localzbfe = paramzje.z();
    int i = localzbfe.getCount();
    zbs localzbs1 = paramzje.E();
    zbs localzbs2 = paramzje.e();
    float f1 = paramzje.m() / 100.0F;
    float f2 = paramzje.n() / 100.0F;
    float f3 = paramzje.o() / 100.0F;
    float f4 = 0.0F;
    if (!localzbs1.p()) {
      f4 = paramzje.N().f() - paramzje.N().i() + (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
    } else {
      f4 = paramzje.N().f() - (float)localzbs1.z() / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
    }
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
    float f5 = paramzje.N().g() / n;
    float f6 = f5 * f1 / (1.0F + f2);
    ArrayList localArrayList2 = ziy.a(paramzje.z().c(), paramzje.U());
    int i2 = localArrayList2.size();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    Object localObject2;
    for (int i3 = 0; i3 < i2; i3++)
    {
      int i4 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i3)));
      i4 = zbu.a(j, i4, paramzje.U());
      int i5 = zbu.a(j, i4, (int)localzbs2.D(), paramzje.U());
      float f7 = f5 * i5;
      float f8 = paramzje.N().e() + f7;
      if (i1 != 0) {
        f8 += f5 / 2.0F;
      }
      localObject2 = a(paramzje, f8, f6, f4, paramzr);
      com.aspose.cells.b.a.a.zf.a(localArrayList4, localObject2);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList4);
    ArrayList localArrayList5 = localzbfe.j();
    zke[] arrayOfzke = new zke[localArrayList5.size()];
    ArrayList[] arrayOfArrayList = new ArrayList[localArrayList5.size()];
    Object localObject1 = null;
    for (int i6 = 0; i6 < localArrayList5.size(); i6++)
    {
      localObject2 = (zbfc)localArrayList5.get(i6);
      int i7 = ((zbfc)localObject2).ai();
      int i8 = i6;
      zkg localzkg = ((zbfc)localObject2).D();
      ArrayList localArrayList6 = new ArrayList();
      if (i6 == 0) {
        localObject1 = localArrayList4;
      }
      ArrayList localArrayList7 = new ArrayList();
      for (int i9 = 0; i9 < i2; i9++)
      {
        int i10 = i9;
        int i11 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(localArrayList2.get(i10)));
        i11 = zbu.a(j, i11, paramzje.U());
        int i12 = zbu.a(j, i11, (int)localzbs2.D(), paramzje.U());
        float f9 = f5 * i12;
        float f10 = paramzje.N().e() + f9;
        if (i1 != 0) {
          f10 += f5 / 2.0F;
        }
        int i13 = i10;
        if (localzbs2.p()) {
          i13 = i2 - 1 - i10;
        }
        zke localzke1 = localzkg.b(i13);
        com.aspose.cells.b.a.a.zf.a(localArrayList7, localzke1);
        double d1 = 0.0D;
        double d2 = 0.0D;
        double d3 = 0.0D;
        zke localzke2;
        double d4;
        if (localzke1 != null)
        {
          arrayOfzke[i6] = localzke1;
          d1 = Math.abs(localzke1.w());
          d2 = d1;
          for (i14 = 0; i14 < i8; i14++)
          {
            localzke2 = ((zbfc)localArrayList5.get(i14)).D().b(i13);
            if (localzke2 != null)
            {
              d4 = Math.abs(localzke2.w());
              d2 += d4;
            }
          }
        }
        for (int i14 = 0; i14 < localArrayList5.size(); i14++)
        {
          localzke2 = ((zbfc)localArrayList5.get(i14)).D().b(i13);
          if ((localzke2 != null) && (!localzke1.a()))
          {
            d4 = localzke2.w();
            d3 += Math.abs(d4);
          }
        }
        float f11 = (float)((paramDouble - d1) / (localzbs1.z() - localzbs1.D()) * paramzje.N().i());
        float f12;
        if (!paramBoolean)
        {
          f12 = (float)(d2 / (localzbs1.z() - localzbs1.D()) * paramzje.N().i());
        }
        else
        {
          if (d3 == 0.0D)
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList6, ((ArrayList)localObject1).get(i10));
            continue;
          }
          f12 = (float)d2 * 100.0F / (float)d3 / (float)(localzbs1.z() - localzbs1.D()) * paramzje.N().i();
        }
        if (localzbs1.p()) {
          f12 = -f12;
        }
        zo[] arrayOfzo1 = a(paramzje, f10, f6, f4 - f12, paramzr);
        com.aspose.cells.b.a.a.zf.a(localArrayList6, arrayOfzo1);
        if ((localzke1 != null) && (!localzke1.a()))
        {
          Object localObject3;
          zo[] arrayOfzo2;
          Object localObject4;
          if ((!((zbfc)localObject2).aC()) && (((ArrayList)localObject1).size() > i10))
          {
            localObject3 = new zo(0.0F, 0.0F);
            arrayOfzo2 = (zo[])((ArrayList)localObject1).get(i10);
            if ((paramzje.D() >= 90) && (paramzje.D() < 270))
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
          if (i9 == i2 - 1)
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
            if ((paramzje.D() >= 90) && (paramzje.D() < 270))
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
      arrayOfArrayList[i6] = localArrayList7;
      com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList6);
    }
    a(paramzr, paramzje, localArrayList5, arrayOfzke, localArrayList3, arrayOfArrayList);
    zlq.c(paramzr, paramzje, localArrayList1);
  }
  
  private static void a(zr paramzr, zje paramzje, zbfc paramzbfc, zke paramzke, List paramList, ArrayList paramArrayList)
    throws Exception
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      localObject1 = (zke)paramArrayList.get(i);
      if (localObject1 != null)
      {
        arrayOfzo1 = (zo[])paramList.get(i * 2 + 1);
        arrayOfzo2 = (zo[])paramList.get(i * 2);
        for (int j = 0; j < arrayOfzo1.length; j++)
        {
          com.aspose.cells.b.a.a.zf.a(((zke)localObject1).b, arrayOfzo1[j]);
          com.aspose.cells.b.a.a.zf.a(((zke)localObject1).d, arrayOfzo2[j]);
        }
      }
    }
    if ((paramList.size() < 4) || (paramzke == null)) {
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
          a(paramzr, paramzje, paramzke, arrayOfzo4);
          arrayOfzo4[0] = arrayOfzo5;
          arrayOfzo4[1] = localObject1[k];
          arrayOfzo4[2] = arrayOfzo1[k];
          arrayOfzo4[3] = localObject2;
          arrayOfzo4[4] = arrayOfzo5;
          arrayOfzo4[5] = arrayOfzo2[k];
          arrayOfzo4[6] = arrayOfzo3[k];
          arrayOfzo4[7] = localObject2;
          a(paramzr, paramzje, paramzke, arrayOfzo4);
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
        a(paramzr, paramzje, paramzke, arrayOfzo4);
      }
    }
    a(paramzr, paramzje, paramzke, (zo[])localObject1, arrayOfzo1, arrayOfzo2, arrayOfzo3);
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
  
  private static void a(zr paramzr, zje paramzje, zke paramzke, zo[] paramArrayOfzo)
    throws Exception
  {
    zay localzay = paramzke.i();
    com.aspose.cells.a.d.zs localzs = zanv.a(paramzke.k());
    try
    {
      int i = paramArrayOfzo[0].e() + paramArrayOfzo[1].e() + paramArrayOfzo[2].e() + paramArrayOfzo[3].e() > paramArrayOfzo[4].e() + paramArrayOfzo[5].e() + paramArrayOfzo[6].e() + paramArrayOfzo[7].e() ? 1 : 0;
      ze localze1;
      zc localzc1;
      ze localze2;
      zc localzc2;
      if (paramzje.p() > 0)
      {
        if (i != 0)
        {
          localze1 = new ze();
          localze1.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
          localzc1 = zbd.a(localzay, zn.a(localze1), 0.6666667F);
          try
          {
            paramzr.a(localzc1, localze1);
          }
          finally {}
          paramzr.a(localzs, localze1);
          localze2 = new ze();
          localze2.b(new zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
          localzc2 = zbd.a(localzay, zn.a(localze2), 0.6666667F);
          try
          {
            paramzr.a(localzc2, localze2);
          }
          finally {}
          paramzr.a(localzs, localze2);
        }
        else
        {
          localze1 = new ze();
          localze1.b(new zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
          localzc1 = zbd.a(localzay, zn.a(localze1), 0.6666667F);
          try
          {
            paramzr.a(localzc1, localze1);
          }
          finally {}
          paramzr.a(localzs, localze1);
          localze2 = new ze();
          localze2.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
          localzc2 = zbd.a(localzay, zn.a(localze2), 0.6666667F);
          try
          {
            paramzr.a(localzc2, localze2);
          }
          finally {}
          paramzr.a(localzs, localze2);
        }
      }
      else if (i == 0)
      {
        localze1 = new ze();
        localze1.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
        localzc1 = zbd.a(localzay, zn.a(localze1), 0.6666667F);
        try
        {
          paramzr.a(localzc1, localze1);
        }
        finally {}
        paramzr.a(localzs, localze1);
        localze2 = new ze();
        localze2.b(new zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
        localzc2 = zbd.a(localzay, zn.a(localze2), 0.6666667F);
        try
        {
          paramzr.a(localzc2, localze2);
        }
        finally {}
        paramzr.a(localzs, localze2);
      }
      else
      {
        localze1 = new ze();
        localze1.b(new zo[] { paramArrayOfzo[4], paramArrayOfzo[5], paramArrayOfzo[6], paramArrayOfzo[7] });
        localzc1 = zbd.a(localzay, zn.a(localze1), 0.6666667F);
        try
        {
          paramzr.a(localzc1, localze1);
        }
        finally {}
        paramzr.a(localzs, localze1);
        localze2 = new ze();
        localze2.b(new zo[] { paramArrayOfzo[0], paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[3] });
        localzc2 = zbd.a(localzay, zn.a(localze2), 0.6666667F);
        try
        {
          paramzr.a(localzc2, localze2);
        }
        finally {}
        paramzr.a(localzs, localze2);
      }
      if ((paramzje.D() <= 90) || (paramzje.D() == 360))
      {
        localze1 = new ze();
        localze1.b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
        localzc1 = zbd.a(localzay, zn.a(localze1), 0.5F);
        try
        {
          paramzr.a(localzc1, localze1);
        }
        finally {}
        paramzr.a(localzs, localze1);
      }
      else if ((paramzje.D() > 90) && (paramzje.D() <= 180))
      {
        localze1 = new ze();
        localze1.b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
        localzc1 = zbd.a(localzay, zn.a(localze1), 0.5F);
        try
        {
          paramzr.a(localzc1, localze1);
        }
        finally {}
        paramzr.a(localzs, localze1);
      }
      else if ((paramzje.D() > 180) && (paramzje.D() <= 270))
      {
        localze1 = new ze();
        localze1.b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
        localzc1 = zbd.a(localzay, zn.a(localze1), 0.5F);
        try
        {
          paramzr.a(localzc1, localze1);
        }
        finally {}
        paramzr.a(localzs, localze1);
      }
      else if ((paramzje.D() > 270) && (paramzje.D() < 360))
      {
        localze1 = new ze();
        localze1.b(new zo[] { paramArrayOfzo[1], paramArrayOfzo[2], paramArrayOfzo[6], paramArrayOfzo[5] });
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
  
  private static void a(zr paramzr, zje paramzje, zke paramzke, zo[] paramArrayOfzo1, zo[] paramArrayOfzo2, zo[] paramArrayOfzo3, zo[] paramArrayOfzo4)
    throws Exception
  {
    zay localzay = paramzke.i();
    com.aspose.cells.a.d.zs localzs = zanv.a(paramzke.k());
    try
    {
      zo[] arrayOfzo;
      zc localzc;
      if ((paramzje.D() <= 90) || (paramzje.D() == 360) || ((paramzje.D() > 270) && (paramzje.D() < 360)))
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
        localzc = zbd.a(localzay, zn.a(localze1));
        try
        {
          paramzr.a(localzc, localze1);
        }
        finally {}
        paramzr.a(localzs, localze1);
      }
      else if (((paramzje.D() > 90) && (paramzje.D() <= 180)) || ((paramzje.D() > 180) && (paramzje.D() <= 270)))
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
        localzc = zbd.a(localzay, zn.a(localze2));
        try
        {
          paramzr.a(localzc, localze2);
        }
        finally {}
        paramzr.a(localzs, localze2);
      }
    }
    finally
    {
      if (localzs != null) {
        localzs.s();
      }
    }
  }
  
  private static zo[] a(zje paramzje, float paramFloat1, float paramFloat2, float paramFloat3, zr paramzr)
  {
    zo[] arrayOfzo = new zo[2];
    zbxz.a(arrayOfzo);
    float f2 = paramzje.N().j();
    float f1;
    if (paramFloat1 <= f2)
    {
      f1 = 2.0F * (f2 - paramFloat1);
      arrayOfzo[0] = zlq.a(paramzje, paramFloat3, f1, paramFloat2, 0);
      arrayOfzo[1] = zlq.a(paramzje, paramFloat3, f1, paramFloat2, 3);
    }
    else
    {
      f1 = 2.0F * (paramFloat1 - f2);
      arrayOfzo[0] = zlq.a(paramzje, paramFloat3, f1, paramFloat2, 1);
      arrayOfzo[1] = zlq.a(paramzje, paramFloat3, f1, paramFloat2, 2);
    }
    return arrayOfzo;
  }
  
  private static void a(zr paramzr, zje paramzje, List paramList1, zke[] paramArrayOfzke, List paramList2, ArrayList[] paramArrayOfArrayList)
    throws Exception
  {
    List localList2;
    zke localzke;
    for (int i = 0; i < paramArrayOfArrayList.length; i++)
    {
      localObject1 = paramArrayOfArrayList[i];
      localObject2 = (List)paramList2.get(i + 1);
      localList2 = (List)paramList2.get(0);
      for (int j = 0; j < ((ArrayList)localObject1).size(); j++)
      {
        localzke = (zke)((ArrayList)localObject1).get(j);
        zo[] arrayOfzo1 = (zo[])((List)localObject2).get(j);
        zo[] arrayOfzo2 = (zo[])localList2.get(j);
        for (int n = 0; n < arrayOfzo1.length; n++)
        {
          com.aspose.cells.b.a.a.zf.a(localzke.b, arrayOfzo1[n]);
          com.aspose.cells.b.a.a.zf.a(localzke.d, arrayOfzo2[n]);
        }
      }
    }
    if (paramList2.size() < 2) {
      return;
    }
    List localList1 = (List)paramList2.get(0);
    Object localObject1 = (zbfc)paramList1.get(paramList1.size() - 1);
    Object localObject2 = ((zbfc)localObject1).A();
    if (paramList2.size() >= 2)
    {
      localList2 = (List)paramList2.get(1);
      List localList3 = (List)paramList2.get(paramList2.size() - 1);
      localzke = null;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      Object localObject7;
      Object localObject8;
      for (int k = 1; k < localList1.size(); k++) {
        if (paramzje.p() >= 0)
        {
          int m = paramList2.size() - 1;
          localObject3 = zanv.a(((zbfc)localObject1).z());
          try
          {
            localObject4 = new zo[][] { localzke };
            boolean bool = a(localList3, localList1, k, (zo[][])localObject4);
            localzke = localObject4[0];
            Object localObject9;
            if (!paramzje.E().p())
            {
              if (a(localList3, localList1, k))
              {
                localObject5 = (List)paramList2.get(m);
                if (((List)localObject5).size() <= k)
                {
                  if (localObject3 == null) {
                    continue;
                  }
                  ((com.aspose.cells.a.d.zs)localObject3).s();
                  continue;
                }
                localObject6 = new zo[4];
                zbxz.a((zo[])localObject6);
                localObject7 = (zo[])((List)localObject5).get(k - 1);
                localObject6[0] = localObject7[0];
                localObject6[1] = localObject7[1];
                localObject7 = (zo[])((List)localObject5).get(k);
                localObject6[2] = localObject7[1];
                localObject6[3] = localObject7[0];
                localObject8 = new ze();
                ((ze)localObject8).b((zo[])localObject6);
                localObject9 = zbd.a((zay)localObject2, zn.a((ze)localObject8), 0.6666667F);
                try
                {
                  paramzr.a((zc)localObject9, (ze)localObject8);
                }
                finally
                {
                  if (localObject9 != null) {
                    ((zc)localObject9).f();
                  }
                }
                paramzr.a((com.aspose.cells.a.d.zs)localObject3, (ze)localObject8);
              }
            }
            else if (bool)
            {
              localObject5 = (List)paramList2.get(m);
              localObject6 = new zo[4];
              zbxz.a((zo[])localObject6);
              localObject7 = (zo[])((List)localObject5).get(k - 1);
              zc localzc;
              if (localzke[0].e() >= localObject7[0].e())
              {
                localObject8 = (zo[])localList1.get(k - 1);
                localObject6[0] = localObject8[0];
                localObject6[1] = localObject8[1];
                localObject6[2] = localzke[1];
                localObject6[3] = localzke[0];
                localObject9 = new ze();
                ((ze)localObject9).b((zo[])localObject6);
                localzc = zbd.a((zay)localObject2, zn.a((ze)localObject9), 0.6666667F);
                try
                {
                  paramzr.a(localzc, (ze)localObject9);
                }
                finally
                {
                  if (localzc != null) {
                    localzc.f();
                  }
                }
                paramzr.a((com.aspose.cells.a.d.zs)localObject3, (ze)localObject9);
              }
              else
              {
                localObject6[0] = localObject7[0];
                localObject6[1] = localObject7[1];
                localObject6[2] = localzke[1];
                localObject6[3] = localzke[0];
                localObject8 = new ze();
                ((ze)localObject8).b((zo[])localObject6);
                localObject9 = zbd.a((zay)localObject2, zn.a((ze)localObject8), 0.6666667F);
                try
                {
                  paramzr.a((zc)localObject9, (ze)localObject8);
                }
                finally
                {
                  if (localObject9 != null) {
                    ((zc)localObject9).f();
                  }
                }
                paramzr.a((com.aspose.cells.a.d.zs)localObject3, (ze)localObject8);
              }
              localObject7 = (zo[])((List)localObject5).get(k);
              if (localzke[0].e() >= localObject7[0].e())
              {
                localObject8 = (zo[])localList1.get(k);
                localObject6[0] = localObject8[0];
                localObject6[1] = localObject8[1];
                localObject6[2] = localzke[1];
                localObject6[3] = localzke[0];
                localObject9 = new ze();
                ((ze)localObject9).b((zo[])localObject6);
                localzc = zbd.a((zay)localObject2, zn.a((ze)localObject9), 0.6666667F);
                try
                {
                  paramzr.a(localzc, (ze)localObject9);
                }
                finally
                {
                  if (localzc != null) {
                    localzc.f();
                  }
                }
                paramzr.a((com.aspose.cells.a.d.zs)localObject3, (ze)localObject9);
              }
              else
              {
                localObject6[0] = localObject7[0];
                localObject6[1] = localObject7[1];
                localObject6[2] = localzke[1];
                localObject6[3] = localzke[0];
                localObject8 = new ze();
                ((ze)localObject8).b((zo[])localObject6);
                localObject9 = zbd.a((zay)localObject2, zn.a((ze)localObject8), 0.6666667F);
                try
                {
                  paramzr.a((zc)localObject9, (ze)localObject8);
                }
                finally
                {
                  if (localObject9 != null) {
                    ((zc)localObject9).f();
                  }
                }
                paramzr.a((com.aspose.cells.a.d.zs)localObject3, (ze)localObject8);
              }
            }
          }
          finally
          {
            if (localObject3 != null) {
              ((com.aspose.cells.a.d.zs)localObject3).s();
            }
          }
        }
      }
      com.aspose.cells.a.d.zs localzs;
      for (k = 1; k < paramList2.size(); k++)
      {
        localObject1 = (zbfc)paramList1.get(k - 1);
        localObject2 = ((zbfc)localObject1).A();
        localzs = zanv.a(((zbfc)localObject1).z());
        try
        {
          localObject3 = (List)paramList2.get(k - 1);
          localObject4 = (List)paramList2.get(k);
          zo[] arrayOfzo3;
          if (paramzje.D() <= 180)
          {
            arrayOfzo3 = (zo[])((List)localObject3).get(((List)localObject3).size() - 1);
            localObject5 = (zo[])((List)localObject4).get(((List)localObject4).size() - 1);
          }
          else
          {
            arrayOfzo3 = (zo[])((List)localObject3).get(0);
            localObject5 = (zo[])((List)localObject4).get(0);
          }
          localObject6 = new ze();
          ((ze)localObject6).b(new zo[] { arrayOfzo3[0], arrayOfzo3[1], localObject5[1], localObject5[0] });
          localObject7 = zbd.a((zay)localObject2, zn.a((ze)localObject6), 0.5F);
          try
          {
            paramzr.a((zc)localObject7, (ze)localObject6);
          }
          finally
          {
            if (localObject7 != null) {
              ((zc)localObject7).f();
            }
          }
          paramzr.a(localzs, (ze)localObject6);
        }
        finally
        {
          if (localzs != null) {
            localzs.s();
          }
        }
      }
      for (k = 1; k < paramList2.size(); k++)
      {
        localObject1 = (zbfc)paramList1.get(k - 1);
        localObject2 = ((zbfc)localObject1).A();
        localzs = zanv.a(((zbfc)localObject1).z());
        try
        {
          localObject3 = (List)paramList2.get(k - 1);
          localObject4 = (List)paramList2.get(k);
          int i1 = ((List)localObject4).size() * 2;
          localObject5 = new zo[i1];
          zbxz.a((zo[])localObject5);
          for (int i2 = 0; i2 < ((List)localObject3).size(); i2++) {
            if (((List)localObject4).size() > i2)
            {
              localObject7 = (zo[])((List)localObject3).get(i2);
              localObject8 = (zo[])((List)localObject4).get(i2);
              if ((paramzje.D() <= 90) || (paramzje.D() == 360) || ((paramzje.D() > 270) && (paramzje.D() < 360)))
              {
                localObject5[i2] = localObject7[0];
                localObject5[(i1 - i2 - 1)] = localObject8[0];
              }
              else
              {
                localObject5[i2] = localObject7[1];
                localObject5[(i1 - i2 - 1)] = localObject8[1];
              }
            }
          }
          ze localze = new ze();
          localze.b((zo[])localObject5);
          localObject7 = zbd.a((zay)localObject2, zn.a(localze));
          try
          {
            paramzr.a((zc)localObject7, localze);
          }
          finally
          {
            if (localObject7 != null) {
              ((zc)localObject7).f();
            }
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
  }
  
  private static boolean a(List paramList1, List paramList2, int paramInt)
  {
    if (paramList1.size() <= paramInt) {
      return true;
    }
    zo localzo1 = ((zo[])(zo[])paramList1.get(paramInt - 1))[0];
    zo localzo2 = ((zo[])(zo[])paramList1.get(paramInt))[0];
    zo localzo3 = ((zo[])(zo[])paramList2.get(paramInt - 1))[0];
    zo localzo4 = ((zo[])(zo[])paramList2.get(paramInt))[0];
    return (localzo1.e() <= localzo3.e()) && (localzo2.e() <= localzo4.e());
  }
  
  private static boolean a(List paramList1, List paramList2, int paramInt, zo[][] paramArrayOfzo)
  {
    paramArrayOfzo[0] = new zo[2];
    if (paramList1.size() <= paramInt) {
      return false;
    }
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
    zbxz.a(paramArrayOfzo[0]);
    paramArrayOfzo[0][0] = localObject1;
    paramArrayOfzo[0][1] = localObject2;
    return bool1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */