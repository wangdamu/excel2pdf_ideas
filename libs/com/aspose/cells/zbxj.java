package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.c.zc;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zbxj
{
  static void a(zje paramzje)
  {
    zbfe localzbfe = paramzje.z();
    Iterator localIterator = localzbfe.iterator();
    while (localIterator.hasNext())
    {
      zbfc localzbfc = (zbfc)localIterator.next();
      if (localzbfc.F().getCount() != 0)
      {
        zbs localzbs;
        if (localzbfc.j()) {
          localzbs = paramzje.g();
        } else {
          localzbs = paramzje.e();
        }
        for (int i = 0; i < localzbfc.F().getCount(); i++)
        {
          double[] arrayOfDouble1 = null;
          double[] arrayOfDouble2 = null;
          double[][] arrayOfDouble3 = { arrayOfDouble2 };
          double[][] arrayOfDouble4 = { arrayOfDouble1 };
          a(localzbfc, localzbs, arrayOfDouble3, arrayOfDouble4);
          arrayOfDouble2 = arrayOfDouble3[0];
          arrayOfDouble1 = arrayOfDouble4[0];
          double d = 0.0D;
          zbxf localzbxf = localzbfc.F().c(i);
          if ((localzbxf.d().e()) && (arrayOfDouble1.length >= 2) && (arrayOfDouble2.length >= 2))
          {
            double[] arrayOfDouble5;
            switch (localzbxf.p())
            {
            case 1: 
              arrayOfDouble5 = new double[] { d };
              localzbxf.a(a(arrayOfDouble2, arrayOfDouble1, localzbxf.k(), localzbxf.j(), arrayOfDouble5));
              d = arrayOfDouble5[0];
              break;
            case 0: 
              arrayOfDouble5 = new double[] { d };
              localzbxf.a(b(arrayOfDouble2, arrayOfDouble1, localzbxf.k(), localzbxf.j(), arrayOfDouble5));
              d = arrayOfDouble5[0];
              break;
            case 2: 
              arrayOfDouble5 = new double[] { d };
              localzbxf.a(b(arrayOfDouble2, arrayOfDouble1, arrayOfDouble5));
              d = arrayOfDouble5[0];
              break;
            case 4: 
              arrayOfDouble5 = new double[] { d };
              localzbxf.a(a(arrayOfDouble2, arrayOfDouble1, localzbxf.n(), localzbxf.k(), localzbxf.j(), arrayOfDouble5));
              d = arrayOfDouble5[0];
              break;
            case 5: 
              arrayOfDouble5 = new double[] { d };
              localzbxf.a(a(arrayOfDouble2, arrayOfDouble1, arrayOfDouble5));
              d = arrayOfDouble5[0];
              break;
            case 3: 
              break;
            }
            localzbxf.d(d);
          }
        }
      }
    }
  }
  
  static void a(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(paramzp);
    for (int i = 0; i < paramzbfc.F().getCount(); i++)
    {
      zbxf localzbxf = paramzbfc.F().c(i);
      if (localzbxf.d().e()) {
        switch (localzbxf.p())
        {
        case 1: 
          if (a(localzbxf.r())) {
            a(paramzr, paramzbfc, paramzp, paramFloat, paramDouble, localzbxf);
          }
          break;
        case 0: 
        case 2: 
        case 4: 
        case 5: 
          if (a(localzbxf.r())) {
            b(paramzr, paramzbfc, paramzp, paramFloat, paramDouble, localzbxf);
          }
          break;
        case 3: 
          c(paramzr, paramzbfc, paramzp, paramFloat, paramDouble, localzbxf);
        }
      }
    }
    paramzr.a(localzf);
  }
  
  private static void a(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxf paramzbxf)
  {
    if (!paramzbxf.d().e()) {
      return;
    }
    zje localzje = paramzbfc.v();
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    a(paramzbfc, paramzbxf, arrayOfDouble1, arrayOfDouble2);
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    double d3 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d4 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    double d5 = 0.0D;
    double d8 = localzbs2.n() ? zbxz.e(localzbs2.x()) : localzbs2.x();
    double d9 = localzbs2.n() ? zbxz.e(localzbs2.z()) : localzbs2.z();
    double d10 = localzbs2.n() ? zbxz.e(localzbs2.D()) : localzbs2.D();
    if (localzbs2.k() == 2) {
      d8 = zbu.a(1, localzbs2.y(), (int)localzbs2.x(), 0, paramzbfc.v().U());
    }
    double d6;
    double d7;
    if ((localzbs2.f()) || (localzje.u()))
    {
      d5 = d9 - d10 + d8;
      d6 = d1 - d10 + d8 / 2.0D;
      d7 = d2 - d10 + d8 - d8 / 2.0D;
    }
    else
    {
      d5 = d9 - d10;
      d6 = d1 - d10;
      d7 = d2 - d10;
    }
    double d11 = paramzp.e() / d5;
    double d12 = d6 * d11;
    if (localzbs2.p()) {
      d12 = paramzp.i() - d12;
    } else {
      d12 = paramzp.g() + d12;
    }
    double d13 = paramFloat;
    double d14 = a(paramzbxf, d1);
    double d15 = (d14 - paramDouble) / (d4 - d3) * paramzp.f();
    if (!localzbs1.p()) {
      d13 -= d15;
    } else {
      d13 += d15;
    }
    double d16 = d7 * d11;
    if (localzbs2.p()) {
      d16 = paramzp.i() - d16;
    } else {
      d16 = paramzp.g() + d16;
    }
    double d17 = paramFloat;
    double d18 = a(paramzbxf, d2);
    double d19 = (d18 - paramDouble) / (d4 - d3) * paramzp.f();
    if (!localzbs1.p()) {
      d17 -= d19;
    } else {
      d17 += d19;
    }
    zanv.a(paramzr, (float)d12, (float)d13, (float)d16, (float)d17, paramzbxf.d());
    paramzbxf.a = new zo((float)d16, (float)d17);
  }
  
  private static void b(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxf paramzbxf)
  {
    if (!paramzbxf.d().e()) {
      return;
    }
    zje localzje = paramzbfc.v();
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
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble1 = { d3 };
    double[] arrayOfDouble2 = { d4 };
    a(paramzbfc, paramzbxf, arrayOfDouble1, arrayOfDouble2);
    d3 = arrayOfDouble1[0];
    d4 = arrayOfDouble2[0];
    double d5 = 0.0D;
    double d6 = localzbs2.n() ? zbxz.e(localzbs2.x()) : localzbs2.x();
    double d7 = localzbs2.n() ? zbxz.e(localzbs2.z()) : localzbs2.z();
    double d8 = localzbs2.n() ? zbxz.e(localzbs2.D()) : localzbs2.D();
    if (localzbs2.k() == 2) {
      d6 = zbu.a(1, localzbs2.y(), (int)localzbs2.x(), 0, paramzbfc.v().U());
    }
    if ((localzbs2.f()) || (localzje.u())) {
      d5 = d7 - d8 + d6;
    } else {
      d5 = d7 - d8;
    }
    ArrayList localArrayList = new ArrayList();
    double d9 = d5 / paramzp.e();
    double d10 = d3 < d8 ? d8 : d3;
    double d11 = d4 > d7 ? d7 : d4;
    for (double d12 = d10; d12 <= d11; d12 += d9)
    {
      double d13;
      if ((localzbs2.f()) || (localzje.u())) {
        d13 = (d12 - d8 + d6 / 2.0D) * paramzp.e() / d5;
      } else {
        d13 = (d12 - d8) * paramzp.e() / d5;
      }
      if (localzbs2.p()) {
        d13 = paramzp.i() - d13;
      } else {
        d13 = paramzp.g() + d13;
      }
      double d14 = paramFloat;
      double d15 = a(paramzbxf, d12);
      double d16 = (d15 - paramDouble) / (d2 - d1) * paramzp.f();
      if (!localzbs1.p()) {
        d14 -= d16;
      } else {
        d14 += d16;
      }
      zo localzo = new zo((float)d13, (float)d14);
      localArrayList.add(localzo);
    }
    a(paramzr, localArrayList, paramzbxf, true);
    if (localArrayList.size() > 0) {
      paramzbxf.a = ((zo)localArrayList.get(localArrayList.size() - 1));
    }
  }
  
  private static void c(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxf paramzbxf)
  {
    if (!paramzbxf.d().e()) {
      return;
    }
    zje localzje = paramzbfc.v();
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
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble1 = { d3 };
    double[] arrayOfDouble2 = { d4 };
    a(paramzbfc, paramzbxf, arrayOfDouble1, arrayOfDouble2);
    d3 = arrayOfDouble1[0];
    d4 = arrayOfDouble2[0];
    double d5 = 0.0D;
    double d6 = localzbs2.n() ? zbxz.e(localzbs2.x()) : localzbs2.x();
    double d7 = localzbs2.n() ? zbxz.e(localzbs2.z()) : localzbs2.z();
    double d8 = localzbs2.n() ? zbxz.e(localzbs2.D()) : localzbs2.D();
    if (localzbs2.k() == 2) {
      d6 = zbu.a(1, localzbs2.y(), (int)localzbs2.x(), 0, paramzbfc.v().U());
    }
    if ((localzbs2.f()) || (localzje.u())) {
      d5 = d7 - d8 + d6;
    } else {
      d5 = d7 - d8;
    }
    double d9 = paramzp.e() / d5;
    ArrayList localArrayList1 = new ArrayList();
    zkg localzkg = paramzbfc.D();
    ArrayList localArrayList2 = localzkg.d();
    for (int j = paramzbxf.o() - 1; j < localArrayList2.size(); j++)
    {
      zke localzke = (zke)localArrayList2.get(j);
      double d10 = 0.0D;
      double[] arrayOfDouble3 = { d10 };
      boolean bool = a(j, paramzbxf.o(), localArrayList2, arrayOfDouble3);
      d10 = arrayOfDouble3[0];
      if (!bool)
      {
        double d11;
        if ((localzbs2.f()) || (localzje.u())) {
          d11 = (localzke.q() - d8 + d6 / 2.0D) * d9;
        } else {
          d11 = (localzke.q() - d8) * d9;
        }
        if (localzbs2.p()) {
          d11 = paramzp.i() - d11;
        } else {
          d11 = paramzp.g() + d11;
        }
        double d12 = paramFloat;
        double d13 = (d10 - paramDouble) / (d2 - d1) * paramzp.f();
        if (!localzbs1.p()) {
          d12 -= d13;
        } else {
          d12 += d13;
        }
        zo localzo = new zo((float)d11, (float)d12);
        localArrayList1.add(localzo);
      }
    }
    a(paramzr, localArrayList1, paramzbxf, false);
  }
  
  static void b(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(paramzp);
    for (int i = 0; i < paramzbfc.F().getCount(); i++)
    {
      zbxf localzbxf = paramzbfc.F().c(i);
      if ((localzbxf.d().e()) && (a(localzbxf.r()))) {
        switch (localzbxf.p())
        {
        case 1: 
          d(paramzr, paramzbfc, paramzp, paramFloat, paramDouble, localzbxf);
          break;
        case 0: 
        case 2: 
        case 4: 
        case 5: 
          e(paramzr, paramzbfc, paramzp, paramFloat, paramDouble, localzbxf);
          break;
        case 3: 
          f(paramzr, paramzbfc, paramzp, paramFloat, paramDouble, localzbxf);
        }
      }
    }
    paramzr.a(localzf);
  }
  
  private static void d(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxf paramzbxf)
  {
    if (!paramzbxf.d().e()) {
      return;
    }
    zje localzje = paramzbfc.v();
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    a(paramzbfc, paramzbxf, arrayOfDouble1, arrayOfDouble2);
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    double d3 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d4 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    double d5 = 0.0D;
    double d8 = localzbs2.n() ? zbxz.e(localzbs2.x()) : localzbs2.x();
    double d9 = localzbs2.n() ? zbxz.e(localzbs2.z()) : localzbs2.z();
    double d10 = localzbs2.n() ? zbxz.e(localzbs2.D()) : localzbs2.D();
    if (localzbs2.k() == 2) {
      d8 = zbu.a(1, localzbs2.y(), (int)localzbs2.x(), 0, paramzbfc.v().U());
    }
    double d6;
    double d7;
    if ((localzbs2.f()) || (localzje.u()))
    {
      d5 = d9 - d10 + d8;
      d6 = d1 - d10 + d8 / 2.0D;
      d7 = d2 - d10 + d8 - d8 / 2.0D;
    }
    else
    {
      d5 = d9 - d10;
      d6 = d1 - d10;
      d7 = d2 - d10;
    }
    double d11 = paramzp.f() / d5;
    double d12 = d6 * d11;
    if (!localzbs2.p()) {
      d12 = paramzp.j() - d12;
    } else {
      d12 = paramzp.h() + d12;
    }
    double d13 = paramFloat;
    double d14 = a(paramzbxf, d1);
    double d15 = (d14 - paramDouble) / (d4 - d3) * paramzp.e();
    if (!localzbs1.p()) {
      d13 += d15;
    } else {
      d13 -= d15;
    }
    double d16 = d7 * d11;
    if (!localzbs2.p()) {
      d16 = paramzp.j() - d16;
    } else {
      d16 = paramzp.h() + d16;
    }
    double d17 = paramFloat;
    double d18 = a(paramzbxf, d2);
    double d19 = (d18 - paramDouble) / (d4 - d3) * paramzp.e();
    if (!localzbs1.p()) {
      d17 += d19;
    } else {
      d17 -= d19;
    }
    zanv.a(paramzr, (float)d13, (float)d12, (float)d17, (float)d16, paramzbxf.d());
    paramzbxf.a = new zo((float)d17, (float)d16);
  }
  
  private static void e(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxf paramzbxf)
  {
    if (!paramzbxf.d().e()) {
      return;
    }
    zje localzje = paramzbfc.v();
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
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble1 = { d3 };
    double[] arrayOfDouble2 = { d4 };
    a(paramzbfc, paramzbxf, arrayOfDouble1, arrayOfDouble2);
    d3 = arrayOfDouble1[0];
    d4 = arrayOfDouble2[0];
    double d5 = 0.0D;
    double d6 = localzbs2.n() ? zbxz.e(localzbs2.x()) : localzbs2.x();
    double d7 = localzbs2.n() ? zbxz.e(localzbs2.z()) : localzbs2.z();
    double d8 = localzbs2.n() ? zbxz.e(localzbs2.D()) : localzbs2.D();
    if (localzbs2.k() == 2) {
      d6 = zbu.a(1, localzbs2.y(), (int)localzbs2.x(), 0, paramzbfc.v().U());
    }
    if ((localzbs2.f()) || (localzje.u())) {
      d5 = d7 - d8 + d6;
    } else {
      d5 = d7 - d8;
    }
    ArrayList localArrayList = new ArrayList();
    double d9 = d5 / paramzp.f();
    for (double d10 = d3; d10 <= d4; d10 += d9)
    {
      double d11;
      if ((localzbs2.f()) || (localzje.u())) {
        d11 = (d10 - d8 + d6 / 2.0D) * paramzp.f() / d5;
      } else {
        d11 = (d10 - d8) * paramzp.f() / d5;
      }
      if (!localzbs2.p()) {
        d11 = paramzp.j() - d11;
      } else {
        d11 = paramzp.h() + d11;
      }
      double d12 = paramFloat;
      double d13 = a(paramzbxf, d10);
      double d14 = (d13 - paramDouble) / (d2 - d1) * paramzp.e();
      if (!localzbs1.p()) {
        d12 += d14;
      } else {
        d12 -= d14;
      }
      zo localzo = new zo((float)d12, (float)d11);
      localArrayList.add(localzo);
    }
    a(paramzr, localArrayList, paramzbxf, true);
    if (localArrayList.size() > 0) {
      paramzbxf.a = ((zo)localArrayList.get(localArrayList.size() - 1));
    }
  }
  
  private static void f(zr paramzr, zbfc paramzbfc, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxf paramzbxf)
  {
    if (!paramzbxf.d().e()) {
      return;
    }
    zje localzje = paramzbfc.v();
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
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble1 = { d3 };
    double[] arrayOfDouble2 = { d4 };
    a(paramzbfc, paramzbxf, arrayOfDouble1, arrayOfDouble2);
    d3 = arrayOfDouble1[0];
    d4 = arrayOfDouble2[0];
    double d5 = 0.0D;
    double d6 = localzbs2.n() ? zbxz.e(localzbs2.x()) : localzbs2.x();
    double d7 = localzbs2.n() ? zbxz.e(localzbs2.z()) : localzbs2.z();
    double d8 = localzbs2.n() ? zbxz.e(localzbs2.D()) : localzbs2.D();
    if (localzbs2.k() == 2) {
      d6 = zbu.a(1, localzbs2.y(), (int)localzbs2.x(), 0, paramzbfc.v().U());
    }
    if ((localzbs2.f()) || (localzje.u())) {
      d5 = d7 - d8 + d6;
    } else {
      d5 = d7 - d8;
    }
    double d9 = paramzp.f() / d5;
    ArrayList localArrayList1 = new ArrayList();
    zkg localzkg = paramzbfc.D();
    ArrayList localArrayList2 = localzkg.d();
    for (int j = paramzbxf.o() - 1; j < localArrayList2.size(); j++)
    {
      zke localzke = (zke)localArrayList2.get(j);
      double d10 = 0.0D;
      double[] arrayOfDouble3 = { d10 };
      boolean bool = a(j, paramzbxf.o(), localArrayList2, arrayOfDouble3);
      d10 = arrayOfDouble3[0];
      if (!bool)
      {
        double d11;
        if ((localzbs2.f()) || (localzje.u())) {
          d11 = (localzke.q() - d8 + d6 / 2.0D) * d9;
        } else {
          d11 = (localzke.q() - d8) * d9;
        }
        if (!localzbs2.p()) {
          d11 = paramzp.j() - d11;
        } else {
          d11 = paramzp.h() + d11;
        }
        double d12 = paramFloat;
        double d13 = (d10 - paramDouble) / (d2 - d1) * paramzp.e();
        if (!localzbs1.p()) {
          d12 += d13;
        } else {
          d12 -= d13;
        }
        zo localzo = new zo((float)d12, (float)d11);
        localArrayList1.add(localzo);
      }
    }
    a(paramzr, localArrayList1, paramzbxf, false);
  }
  
  private static boolean a(int paramInt1, int paramInt2, ArrayList paramArrayList, double[] paramArrayOfDouble)
  {
    double d = 0.0D;
    int i = 0;
    for (int j = paramInt1 - paramInt2 + 1; j <= paramInt1; j++)
    {
      zke localzke = (zke)paramArrayList.get(j);
      if ((localzke == null) || (localzke.a())) {
        i++;
      } else {
        d += localzke.w();
      }
    }
    if (paramInt2 == i)
    {
      paramArrayOfDouble[0] = 0.0D;
      return true;
    }
    paramArrayOfDouble[0] = (d / (paramInt2 - i));
    return false;
  }
  
  private static double a(zbxf paramzbxf, double paramDouble)
  {
    double[] arrayOfDouble = paramzbxf.r();
    switch (paramzbxf.p())
    {
    case 1: 
      return arrayOfDouble[0] * paramDouble + arrayOfDouble[1];
    case 2: 
      return arrayOfDouble[0] * Math.log(paramDouble) + arrayOfDouble[1];
    case 4: 
      double d = 0.0D;
      for (int i = 0; i < arrayOfDouble.length; i++) {
        d += arrayOfDouble[i] * Math.pow(paramDouble, arrayOfDouble.length - 1 - i);
      }
      return d;
    case 5: 
      return arrayOfDouble[1] * Math.pow(paramDouble, arrayOfDouble[0]);
    case 0: 
      return arrayOfDouble[1] * Math.pow(2.718281828459045D, arrayOfDouble[0] * paramDouble);
    }
    return 0.0D;
  }
  
  static void a(zr paramzr, List paramList, zbxf paramzbxf, boolean paramBoolean)
  {
    zo[] arrayOfzo = new zo[paramList.size()];
    zbxz.a(arrayOfzo);
    com.aspose.cells.a.e.ze.a(paramList, arrayOfzo, 0);
    if (arrayOfzo.length > 1)
    {
      com.aspose.cells.a.d.zs localzs = zanv.a(paramzbxf.d());
      try
      {
        if (paramBoolean) {
          paramzr.a(localzs, arrayOfzo);
        } else {
          paramzr.b(localzs, arrayOfzo);
        }
      }
      finally
      {
        if (localzs != null) {
          localzs.s();
        }
      }
    }
  }
  
  private static void a(zbfc paramzbfc, zbs paramzbs, double[][] paramArrayOfDouble1, double[][] paramArrayOfDouble2)
  {
    double d = 2.147483647E9D;
    for (int i = 0; i < paramzbfc.D().getCount(); i++)
    {
      zke localzke1 = paramzbfc.D().b(i);
      if ((localzke1 != null) && (!localzke1.a()) && (!localzke1.b()) && (localzke1.q() < d)) {
        d = localzke1.q();
      }
    }
    i = paramzbfc.D().getCount();
    for (int j = 0; j < paramzbfc.D().getCount(); j++)
    {
      zke localzke2 = paramzbfc.D().b(j);
      if ((localzke2 == null) || (localzke2.a()) || (localzke2.b())) {
        i--;
      }
    }
    paramArrayOfDouble1[0] = new double[i];
    paramArrayOfDouble2[0] = new double[i];
    j = 0;
    for (int k = 0; k < paramzbfc.D().getCount(); k++)
    {
      zke localzke3 = paramzbfc.D().b(k);
      if ((localzke3 != null) && (!localzke3.a()) && (!localzke3.b()))
      {
        paramArrayOfDouble1[0][j] = localzke3.w();
        if (localzke3.b()) {
          paramArrayOfDouble2[0][j] = d;
        } else {
          paramArrayOfDouble2[0][j] = localzke3.q();
        }
        j++;
      }
    }
  }
  
  private static void a(zbfc paramzbfc, zbxf paramzbxf, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    paramArrayOfDouble1[0] = 2.147483647E9D;
    paramArrayOfDouble2[0] = -2.147483648E9D;
    zkg localzkg = paramzbfc.D();
    int i = 1;
    for (int j = 0; j < localzkg.getCount(); j++) {
      if ((localzkg.a(j) != null) && (!localzkg.a(j).b()))
      {
        double d = localzkg.a(j).q();
        if (i != 0)
        {
          paramArrayOfDouble1[0] = d;
          paramArrayOfDouble2[0] = d;
          i = 0;
        }
        if (d < paramArrayOfDouble1[0]) {
          paramArrayOfDouble1[0] = d;
        }
        if (d > paramArrayOfDouble2[0]) {
          paramArrayOfDouble2[0] = d;
        }
      }
    }
    if (i != 0)
    {
      paramArrayOfDouble1[0] = 0.0D;
      paramArrayOfDouble2[0] = 0.0D;
    }
    paramArrayOfDouble1[0] -= paramzbxf.f();
    paramArrayOfDouble2[0] += paramzbxf.i();
  }
  
  private static boolean a(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {
      return false;
    }
    for (double d : paramArrayOfDouble) {
      if (Double.isNaN(d)) {
        return false;
      }
    }
    return true;
  }
  
  private static double[] a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, boolean paramBoolean, double paramDouble, double[] paramArrayOfDouble3)
  {
    double[][] arrayOfDouble = new double[paramArrayOfDouble1.length][];
    for (int i = 0; i < paramArrayOfDouble1.length; i++) {
      arrayOfDouble[i] = { paramArrayOfDouble2[i] };
    }
    Object[][] arrayOfObject = (Object[][])null;
    if (paramBoolean)
    {
      for (int j = 0; j < paramArrayOfDouble1.length; j++) {
        paramArrayOfDouble1[j] -= paramDouble;
      }
      arrayOfObject = zaox.b(paramArrayOfDouble1, arrayOfDouble);
    }
    else
    {
      arrayOfObject = zaox.a(paramArrayOfDouble1, arrayOfDouble);
    }
    double[] arrayOfDouble1 = new double[arrayOfObject[0].length];
    for (int k = 0; k < arrayOfDouble1.length; k++)
    {
      arrayOfDouble1[k] = ((Double)arrayOfObject[0][k]).doubleValue();
      if ((k == arrayOfDouble1.length - 1) && (paramBoolean)) {
        arrayOfDouble1[k] = paramDouble;
      }
    }
    paramArrayOfDouble3[0] = ((Double)arrayOfObject[2][0]).doubleValue();
    return arrayOfDouble1;
  }
  
  private static double[] a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, int paramInt, boolean paramBoolean, double paramDouble, double[] paramArrayOfDouble3)
  {
    double[][] arrayOfDouble = new double[paramArrayOfDouble2.length][];
    if (paramInt > paramArrayOfDouble2.length - 1) {
      paramInt = paramArrayOfDouble2.length - 1;
    }
    int j;
    for (int i = 0; i < paramArrayOfDouble2.length; i++)
    {
      arrayOfDouble[i] = new double[paramInt];
      arrayOfDouble[i][0] = paramArrayOfDouble2[i];
      for (j = 1; j < paramInt; j++) {
        arrayOfDouble[i][j] = (paramArrayOfDouble2[i] * arrayOfDouble[i][(j - 1)]);
      }
    }
    Object[][] arrayOfObject = (Object[][])null;
    if (paramBoolean)
    {
      for (j = 0; j < paramArrayOfDouble1.length; j++) {
        paramArrayOfDouble1[j] -= paramDouble;
      }
      arrayOfObject = zaox.b(paramArrayOfDouble1, arrayOfDouble);
    }
    else
    {
      arrayOfObject = zaox.a(paramArrayOfDouble1, arrayOfDouble);
    }
    double[] arrayOfDouble1 = new double[arrayOfObject[0].length];
    for (int k = 0; k < arrayOfDouble1.length; k++)
    {
      arrayOfDouble1[k] = ((Double)arrayOfObject[0][k]).doubleValue();
      if ((k == arrayOfDouble1.length - 1) && (paramBoolean)) {
        arrayOfDouble1[k] = paramDouble;
      }
    }
    paramArrayOfDouble3[0] = ((Double)arrayOfObject[2][0]).doubleValue();
    return arrayOfDouble1;
  }
  
  private static double[] a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double[] paramArrayOfDouble3)
  {
    for (int i = 0; i < paramArrayOfDouble1.length; i++)
    {
      paramArrayOfDouble1[i] = Math.log(paramArrayOfDouble1[i]);
      paramArrayOfDouble2[i] = Math.log(paramArrayOfDouble2[i]);
    }
    double[] arrayOfDouble = a(paramArrayOfDouble1, paramArrayOfDouble2, false, 0.0D, paramArrayOfDouble3);
    arrayOfDouble[1] = Math.exp(arrayOfDouble[1]);
    return arrayOfDouble;
  }
  
  private static double[] b(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double[] paramArrayOfDouble3)
  {
    for (int i = 0; i < paramArrayOfDouble1.length; i++) {
      paramArrayOfDouble2[i] = Math.log(paramArrayOfDouble2[i]);
    }
    double[] arrayOfDouble = a(paramArrayOfDouble1, paramArrayOfDouble2, false, 0.0D, paramArrayOfDouble3);
    return arrayOfDouble;
  }
  
  private static double[] b(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, boolean paramBoolean, double paramDouble, double[] paramArrayOfDouble3)
  {
    for (int i = 0; i < paramArrayOfDouble1.length; i++) {
      paramArrayOfDouble1[i] = Math.log(paramArrayOfDouble1[i]);
    }
    double d = 0.0D;
    if (paramBoolean) {
      d = Math.log(paramDouble);
    }
    double[] arrayOfDouble = a(paramArrayOfDouble1, paramArrayOfDouble2, paramBoolean, d, paramArrayOfDouble3);
    if (paramBoolean) {
      arrayOfDouble[1] = paramDouble;
    } else {
      arrayOfDouble[1] = Math.exp(arrayOfDouble[1]);
    }
    return arrayOfDouble;
  }
  
  static void a(zr paramzr, zbfc paramzbfc)
    throws Exception
  {
    int i = 0;
    if ((paramzbfc.ag() == 6) || (paramzbfc.ag() == 7) || (paramzbfc.ag() == 8)) {
      i = 1;
    }
    for (int j = 0; j < paramzbfc.F().getCount(); j++)
    {
      zbxf localzbxf = paramzbfc.F().c(j);
      if ((localzbxf.d().e()) && (a(localzbxf.r())))
      {
        String str1 = null;
        Object localObject1;
        Object localObject2;
        Object localObject3;
        Object localObject5;
        Object localObject6;
        Object localObject7;
        Object localObject8;
        if (localzbxf.b().s() == null)
        {
          localObject1 = new ArrayList();
          localObject2 = new ArrayList();
          Object localObject4;
          if (localzbxf.g())
          {
            double[] arrayOfDouble = localzbxf.r();
            localObject4 = a(paramzbfc.v(), localzbxf.r(), localzbxf);
            switch (localzbxf.p())
            {
            case 1: 
              str1 = "y = ";
              if (arrayOfDouble[0] < 0.0D) {
                str1 = str1 + " -";
              }
              if (Math.abs(arrayOfDouble[0]) == 1.0D) {
                str1 = str1 + "x";
              } else {
                str1 = str1 + localObject4[0] + "x";
              }
              if (arrayOfDouble[1] != 0.0D)
              {
                if (arrayOfDouble[1] > 0.0D) {
                  str1 = str1 + " + ";
                } else if (arrayOfDouble[1] < 0.0D) {
                  str1 = str1 + " - ";
                }
                str1 = str1 + localObject4[1];
              }
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
              break;
            case 0: 
              str1 = "y = ";
              if (arrayOfDouble[1] < 0.0D) {
                str1 = str1 + " -";
              }
              if (Math.abs(arrayOfDouble[1]) == 1.0D) {
                str1 = str1 + "e";
              } else {
                str1 = str1 + localObject4[1] + "e";
              }
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
              str1 = "";
              if (arrayOfDouble[0] < 0.0D) {
                str1 = str1 + " -";
              }
              if (Math.abs(arrayOfDouble[0]) == 1.0D) {
                str1 = str1 + "x";
              } else {
                str1 = str1 + localObject4[0] + "x";
              }
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
              break;
            case 2: 
              str1 = "y = ";
              if (arrayOfDouble[0] < 0.0D) {
                str1 = str1 + " -";
              }
              if (Math.abs(arrayOfDouble[0]) == 1.0D) {
                str1 = str1 + "x";
              } else {
                str1 = str1 + localObject4[0] + "Ln(x)";
              }
              if (arrayOfDouble[1] != 0.0D)
              {
                if (arrayOfDouble[1] > 0.0D) {
                  str1 = str1 + " + ";
                } else if (arrayOfDouble[1] < 0.0D) {
                  str1 = str1 + " - ";
                }
                str1 = str1 + localObject4[1];
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
              }
              break;
            case 4: 
              str1 = "y = ";
              if (arrayOfDouble[0] != 0.0D)
              {
                if (arrayOfDouble[0] < 0.0D) {
                  str1 = str1 + " -";
                }
                if (Math.abs(arrayOfDouble[0]) == 1.0D) {
                  str1 = str1 + "x";
                } else {
                  str1 = str1 + localObject4[0] + "x";
                }
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, "2");
              }
              str1 = "";
              if (arrayOfDouble[1] != 0.0D)
              {
                if (arrayOfDouble[1] < 0.0D) {
                  str1 = str1 + " - ";
                } else {
                  str1 = str1 + " + ";
                }
                if (Math.abs(arrayOfDouble[1]) == 1.0D) {
                  str1 = str1 + "x";
                } else {
                  str1 = str1 + localObject4[1] + "x";
                }
              }
              if (arrayOfDouble[2] != 0.0D)
              {
                if (arrayOfDouble[2] > 0.0D) {
                  str1 = str1 + " + ";
                } else if (arrayOfDouble[2] < 0.0D) {
                  str1 = str1 + " - ";
                }
                str1 = str1 + localObject4[2];
              }
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
              break;
            case 5: 
              str1 = "y = ";
              if (arrayOfDouble[1] < 0.0D) {
                str1 = str1 + " -";
              }
              if (Math.abs(arrayOfDouble[1]) == 1.0D) {
                str1 = str1 + "x";
              } else {
                str1 = str1 + localObject4[1] + "x";
              }
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
              str1 = "";
              if (arrayOfDouble[0] < 0.0D) {
                str1 = str1 + " -";
              }
              str1 = str1 + localObject4[0];
              com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
              break;
            }
          }
          Object localObject9;
          if (localzbxf.h())
          {
            str1 = "";
            str1 = str1 + "R";
            com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, str1);
            com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, "2");
            int k = 1;
            localObject4 = "0.0000";
            if (!"".equals(localzbxf.b().p()))
            {
              localObject4 = localzbxf.b().p();
              k = 0;
              if (((String)localObject4).toLowerCase().equals("general"))
              {
                localObject4 = "0.0000";
                k = 1;
              }
            }
            str1 = " = ";
            String str2 = zgy.a(paramzbfc.v().an(), Double.valueOf(localzbxf.s()), (String)localObject4);
            if (k != 0)
            {
              double d = zbxz.a(str2, paramzbfc.v().an());
              if (d == 0.0D)
              {
                str2 = com.aspose.cells.a.c.zp.a(localzbxf.s(), "0.00E+00");
                localObject9 = zw.d(str2, 'E');
                if (localObject9.length > 1)
                {
                  str2 = a(localObject9[0]) + "E";
                  for (int i1 = 1; i1 < localObject9.length; i1++) {
                    str2 = str2 + localObject9[i1];
                  }
                }
              }
              else
              {
                str2 = a(str2);
              }
            }
            str1 = str1 + str2;
            com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, str1);
          }
          localObject3 = "";
          for (int m = 0; m < ((ArrayList)localObject1).size(); m++) {
            localObject3 = (String)localObject3 + (String)((ArrayList)localObject1).get(m);
          }
          localObject5 = "";
          for (int n = 0; n < ((ArrayList)localObject2).size(); n++) {
            localObject5 = (String)localObject5 + (String)((ArrayList)localObject2).get(n);
          }
          if ((!"".equals(localObject3)) || (!"".equals(localObject5)))
          {
            localObject6 = localzbxf.q();
            ((zqx)localObject6).c((String)localObject3 + "\n" + (String)localObject5);
            localObject7 = new zg(((zqx)localObject6).b().h().b(), ((zqx)localObject6).b().h().h() * 0.7F);
            localObject8 = new zt(0.0F, 0.0F);
            Object localObject10;
            Object localObject11;
            Object localObject12;
            Object localObject13;
            if (((ArrayList)localObject1).size() > 0) {
              if (((ArrayList)localObject1).size() == 1)
              {
                localObject8 = zbvx.b(paramzr, (String)localObject3, ((zqx)localObject6).b().h());
              }
              else
              {
                localObject9 = (String)((ArrayList)localObject1).get(0);
                localObject10 = zbvx.b(paramzr, (String)localObject9, ((zqx)localObject6).b().h());
                ((zt)localObject8).a(((zt)localObject8).b() + ((zt)localObject10).b());
                ((zt)localObject8).b(((zt)localObject8).c() + ((zt)localObject10).c());
                localObject11 = (String)((ArrayList)localObject1).get(1);
                localObject12 = zbvx.b(paramzr, (String)localObject11, (zg)localObject7);
                ((zt)localObject8).a(((zt)localObject8).b() + ((zt)localObject12).b());
                if (((ArrayList)localObject1).size() > 2)
                {
                  localObject13 = (String)((ArrayList)localObject1).get(2);
                  localObject14 = zbvx.b(paramzr, (String)localObject13, ((zqx)localObject6).b().h());
                  ((zt)localObject8).a(((zt)localObject8).b() + ((zt)localObject14).b());
                }
              }
            }
            localObject9 = new zt(0.0F, 0.0F);
            if (((ArrayList)localObject2).size() > 0)
            {
              localObject10 = (String)((ArrayList)localObject2).get(0);
              localObject11 = zbvx.b(paramzr, (String)localObject10, ((zqx)localObject6).b().h());
              ((zt)localObject9).a(((zt)localObject9).b() + ((zt)localObject11).b());
              ((zt)localObject9).b(((zt)localObject9).c() + ((zt)localObject11).c());
              localObject12 = (String)((ArrayList)localObject2).get(1);
              localObject13 = zbvx.b(paramzr, (String)localObject12, (zg)localObject7);
              ((zt)localObject9).a(((zt)localObject9).b() + ((zt)localObject13).b());
              localObject14 = (String)((ArrayList)localObject2).get(2);
              localObject15 = zbvx.b(paramzr, (String)localObject14, ((zqx)localObject6).b().h());
              ((zt)localObject9).a(((zt)localObject9).b() + ((zt)localObject15).b());
            }
            float f1 = ((zt)localObject8).c() / 4.0F;
            if (((ArrayList)localObject1).size() > 1) {
              ((zt)localObject8).b(((zt)localObject8).c() + f1);
            }
            float f2 = ((zt)localObject9).c() / 4.0F;
            if (((ArrayList)localObject1).size() > 1) {
              ((zt)localObject9).b(((zt)localObject9).c() + f2);
            }
            float f3 = ((zt)localObject8).b() > ((zt)localObject9).b() ? ((zt)localObject8).b() : ((zt)localObject9).b();
            float f4 = ((zt)localObject8).c() + ((zt)localObject9).c();
            Object localObject14 = new zq(localzbxf.a.d() - f3 - 8.0F, localzbxf.a.e() - f4 / 2.0F, f3, f4);
            if (i != 0) {
              localObject14 = new zq(localzbxf.a.d() - f3 / 2.0F, localzbxf.a.e() + 10.0F, f3, f4);
            }
            ((zqx)localObject6).a().b = com.aspose.cells.b.a.b.zp.a((zq)localObject14);
            ((zqx)localObject6).a().z();
            Object localObject15 = zn.a(zn.b(((zqx)localObject6).a().a));
            zq[] arrayOfzq = { localObject15 };
            zqz.a(arrayOfzq, localzbxf.c());
            localObject15 = arrayOfzq[0];
            zq localzq = zn.a((zq)localObject15);
            localzq.a(2.0F, 4.0F);
            zbd.a(paramzr, localzq, ((zqx)localObject6).a().d());
            zanv.a(paramzr, localzq, ((zqx)localObject6).a().f());
            zo localzo = ((zq)localObject15).d();
            float f5 = 0.0F;
            float f6 = 0.0F;
            if (((zt)localObject8).b() > ((zt)localObject9).b()) {
              f6 = (((zt)localObject8).b() - ((zt)localObject9).b()) / 2.0F;
            } else {
              f5 = (((zt)localObject9).b() - ((zt)localObject8).b()) / 2.0F;
            }
            String str3;
            zt localzt1;
            String str4;
            zt localzt2;
            String str5;
            if (((ArrayList)localObject1).size() > 0) {
              if (((ArrayList)localObject1).size() == 1)
              {
                paramzr.a((String)localObject3, ((zqx)localObject6).a().h(), new zu(((zqx)localObject6).a().j()), localzo);
              }
              else
              {
                localzo.a(localzo.d() + f5);
                localzo.b(localzo.e() + f1);
                str3 = (String)((ArrayList)localObject1).get(0);
                paramzr.a(str3, ((zqx)localObject6).a().h(), new zu(((zqx)localObject6).a().j()), localzo);
                localzt1 = zbvx.b(paramzr, str3, ((zqx)localObject6).a().h());
                localzo.a(localzo.d() + localzt1.b());
                localzo.b(localzo.e() - f1);
                str4 = (String)((ArrayList)localObject1).get(1);
                paramzr.a(str4, (zg)localObject7, new zu(((zqx)localObject6).a().j()), localzo);
                if (((ArrayList)localObject1).size() > 2)
                {
                  localzt2 = zbvx.b(paramzr, str4, (zg)localObject7);
                  localzo.a(localzo.d() + localzt2.b());
                  localzo.b(localzo.e() + f1);
                  str5 = (String)((ArrayList)localObject1).get(2);
                  paramzr.a(str5, ((zqx)localObject6).a().h(), new zu(((zqx)localObject6).a().j()), localzo);
                }
              }
            }
            if (((ArrayList)localObject2).size() > 0)
            {
              localzo.a(((zq)localObject15).f());
              localzo.b(((zq)localObject15).g() + ((zt)localObject8).c());
              localzo.a(localzo.d() + f6);
              localzo.b(localzo.e() + f2);
              str3 = (String)((ArrayList)localObject2).get(0);
              paramzr.a(str3, ((zqx)localObject6).a().h(), new zu(((zqx)localObject6).a().j()), localzo);
              localzt1 = zbvx.b(paramzr, str3, ((zqx)localObject6).a().h());
              localzo.a(localzo.d() + localzt1.b());
              localzo.b(localzo.e() - f2);
              str4 = (String)((ArrayList)localObject2).get(1);
              paramzr.a(str4, (zg)localObject7, new zu(((zqx)localObject6).a().j()), localzo);
              if (((ArrayList)localObject2).size() > 2)
              {
                localzt2 = zbvx.b(paramzr, str4, (zg)localObject7);
                localzo.a(localzo.d() + localzt2.b());
                localzo.b(localzo.e() + f2);
                str5 = (String)((ArrayList)localObject2).get(2);
                paramzr.a(str5, ((zqx)localObject6).a().h(), new zu(((zqx)localObject6).a().j()), localzo);
              }
            }
          }
        }
        else
        {
          str1 = localzbxf.b().s();
          if (localzbxf.q().w())
          {
            localObject1 = localzbxf.q();
            localObject2 = new zt(localzbxf.c().a(), localzbxf.c().b());
            localObject3 = new com.aspose.cells.b.a.b.zs(((zqx)localObject1).a().l(), ((zqx)localObject1).a().m());
            localObject5 = new com.aspose.cells.b.a.b.zp((int)localzbxf.a.d() - ((com.aspose.cells.b.a.b.zs)localObject3).b() - 8, (int)localzbxf.a.e() - ((com.aspose.cells.b.a.b.zs)localObject3).c() / 2, ((com.aspose.cells.b.a.b.zs)localObject3).b(), ((com.aspose.cells.b.a.b.zs)localObject3).c());
            if (i != 0) {
              localObject5 = new com.aspose.cells.b.a.b.zp((int)localzbxf.a.d() - ((com.aspose.cells.b.a.b.zs)localObject3).b() / 2, (int)localzbxf.a.e() + 10, ((com.aspose.cells.b.a.b.zs)localObject3).b(), ((com.aspose.cells.b.a.b.zs)localObject3).c());
            }
            ((zqx)localObject1).a().b = new com.aspose.cells.b.a.b.zp(((com.aspose.cells.b.a.b.zp)localObject5).c(), ((com.aspose.cells.b.a.b.zp)localObject5).d(), ((com.aspose.cells.b.a.b.zp)localObject5).e(), ((com.aspose.cells.b.a.b.zp)localObject5).f());
            ((zqx)localObject1).a().z();
            localObject6 = new zq(((zqx)localObject1).a().a.c(), ((zqx)localObject1).a().a.d(), ((zqx)localObject1).a().l(), ((zqx)localObject1).a().a.f());
            a(paramzr, (zq)localObject6, (zqx)localObject1);
          }
          else if (!"".equals(str1))
          {
            localObject1 = localzbxf.q();
            localObject2 = new zt(localzbxf.c().a(), localzbxf.c().b());
            localObject3 = zbvx.a(paramzr, str1, ((zqx)localObject1).m(), ((zqx)localObject1).a().h(), (zt)localObject2, ((zqx)localObject1).n(), ((zqx)localObject1).o());
            localObject5 = new com.aspose.cells.b.a.b.zp((int)localzbxf.a.d() - ((com.aspose.cells.b.a.b.zs)localObject3).b() - 8, (int)localzbxf.a.e() - ((com.aspose.cells.b.a.b.zs)localObject3).c() / 2, ((com.aspose.cells.b.a.b.zs)localObject3).b(), ((com.aspose.cells.b.a.b.zs)localObject3).c());
            if (i != 0) {
              localObject5 = new com.aspose.cells.b.a.b.zp((int)localzbxf.a.d() - ((com.aspose.cells.b.a.b.zs)localObject3).b() / 2, (int)localzbxf.a.e() + 10, ((com.aspose.cells.b.a.b.zs)localObject3).b(), ((com.aspose.cells.b.a.b.zs)localObject3).c());
            }
            ((zqx)localObject1).a().b = new com.aspose.cells.b.a.b.zp(((com.aspose.cells.b.a.b.zp)localObject5).c(), ((com.aspose.cells.b.a.b.zp)localObject5).d(), ((com.aspose.cells.b.a.b.zp)localObject5).e(), ((com.aspose.cells.b.a.b.zp)localObject5).f());
            ((zqx)localObject1).a().z();
            localObject6 = new zq(((zqx)localObject1).a().a.c(), ((zqx)localObject1).a().a.d(), ((zqx)localObject1).a().a.e(), ((zqx)localObject1).a().a.f());
            localObject7 = new zq[] { localObject6 };
            zqz.a((zq[])localObject7, localzbxf.c());
            localObject6 = localObject7[0];
            localObject8 = localObject6;
            ((zq)localObject8).a(0.0F, 4.0F);
            zbd.a(paramzr, (zq)localObject8, ((zqx)localObject1).a().d());
            zanv.a(paramzr, (zq)localObject8, ((zqx)localObject1).a().f());
            zqz.a(paramzr, (zqx)localObject1, com.aspose.cells.b.a.b.zp.a((zq)localObject6), str1, ((zqx)localObject1).m(), ((zqx)localObject1).a().h(), ((zqx)localObject1).a().j(), ((zqx)localObject1).n(), ((zqx)localObject1).o());
          }
        }
      }
    }
  }
  
  private static void a(zr paramzr, zq paramzq, zqx paramzqx)
    throws Exception
  {
    zbcw localzbcw = new zbcw();
    localzbcw.a(zbvx.a(paramzqx.n()));
    localzbcw.b(zbvx.a(paramzqx.o()));
    zbde localzbde = new zbde(paramzq, localzbcw, paramzqx.u(), paramzqx.a().h(), paramzqx.v());
    localzbde.b(paramzr, paramzqx.a().a().at());
  }
  
  private static String[] a(zje paramzje, double[] paramArrayOfDouble, zbxf paramzbxf)
  {
    int i = 1;
    String str = "0.0000";
    if (!"".equals(paramzbxf.b().p()))
    {
      str = paramzbxf.b().p();
      i = 0;
      if (str.toLowerCase().equals("general"))
      {
        str = "0.0000";
        i = 1;
      }
    }
    String[] arrayOfString1 = new String[paramArrayOfDouble.length];
    for (int j = 0; j < paramArrayOfDouble.length; j++)
    {
      arrayOfString1[j] = zgy.a(paramzje.an(), Double.valueOf(Math.abs(paramArrayOfDouble[j])), str);
      if (i != 0)
      {
        double d = zbxz.a(arrayOfString1[j], paramzje.an());
        String[] arrayOfString2;
        int k;
        if (d == 0.0D)
        {
          arrayOfString1[j] = com.aspose.cells.a.c.zp.a(Math.abs(paramArrayOfDouble[j]), "0.00E+00");
          arrayOfString2 = zw.d(arrayOfString1[j], 'E');
          if (arrayOfString2.length > 1)
          {
            arrayOfString1[j] = (a(arrayOfString2[0]) + "E");
            for (k = 1; k < arrayOfString2.length; tmp209_207++)
            {
              int tmp209_207 = j;
              String[] tmp209_205 = arrayOfString1;
              tmp209_205[tmp209_207] = (tmp209_205[tmp209_207] + arrayOfString2[tmp209_207]);
            }
          }
        }
        else if (Math.abs(d) >= 1000000.0D)
        {
          arrayOfString1[j] = com.aspose.cells.a.c.zp.a(Math.abs(paramArrayOfDouble[j]), "0E+00");
          arrayOfString2 = zw.d(arrayOfString1[j], 'E');
          if (arrayOfString2.length > 1)
          {
            arrayOfString1[j] = (a(arrayOfString2[0]) + "E");
            for (tmp209_207 = 1; tmp209_207 < arrayOfString2.length; tmp209_207++)
            {
              int tmp335_333 = j;
              String[] tmp335_331 = arrayOfString1;
              tmp335_331[tmp335_333] = (tmp335_331[tmp335_333] + arrayOfString2[tmp209_207]);
            }
          }
        }
        else
        {
          arrayOfString1[j] = a(arrayOfString1[j]);
        }
      }
    }
    return arrayOfString1;
  }
  
  private static String a(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return "";
    }
    int i = com.aspose.cells.b.a.ze.a(zc.a().c());
    int j = paramString.length() - 1;
    for (int k = paramString.charAt(j); (k == 48) || (k == i); k = paramString.charAt(j))
    {
      j--;
      if (j < 0) {
        break;
      }
    }
    return paramString.substring(0, 0 + (j + 1));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */