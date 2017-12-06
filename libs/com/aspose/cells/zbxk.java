package com.aspose.cells;

import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.c.zc;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.List;

final class zbxk
{
  static boolean a(zbff paramzbff, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    paramArrayOfDouble1[0] = 0.0D;
    paramArrayOfDouble2[0] = 0.0D;
    for (int i = 0; i < paramzbff.getCount(); i++)
    {
      zbfd localzbfd = paramzbff.c(i);
      for (int j = 0; j < localzbfd.H().getCount(); j++)
      {
        zbxg localzbxg = localzbfd.H().c(j);
        if (localzbxg.d().h())
        {
          if (localzbxg.h() > paramArrayOfDouble1[0]) {
            paramArrayOfDouble1[0] = localzbxg.h();
          }
          if (localzbxg.e() > paramArrayOfDouble2[0]) {
            paramArrayOfDouble2[0] = localzbxg.e();
          }
        }
      }
    }
    return (paramArrayOfDouble1[0] > 0.0D) || (paramArrayOfDouble2[0] > 0.0D);
  }
  
  static void a(zbff paramzbff, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    for (int i = 0; i < paramzbff.getCount(); i++)
    {
      zbfd localzbfd = paramzbff.c(i);
      for (int j = 0; j < localzbfd.H().getCount(); j++)
      {
        zbxg localzbxg = localzbfd.H().c(j);
        if (localzbxg.d().h())
        {
          zkh localzkh = localzbfd.F();
          double d1 = 0.0D;
          double d2 = 0.0D;
          int k = 1;
          for (int m = 0; m < localzkh.getCount(); m++) {
            if ((localzkh.a(m) != null) && (!localzkh.a(m).b()))
            {
              double d4 = localzkh.a(m).q();
              if (k != 0)
              {
                d1 = d4;
                d2 = d4;
                k = 0;
              }
              if (d4 < d1) {
                d1 = d4;
              }
              if (d4 > d2) {
                d2 = d4;
              }
            }
          }
          double d3;
          if (paramDouble1 > 0.0D)
          {
            d3 = a(localzbxg, d2 + paramDouble1);
            if (d3 > paramArrayOfDouble2[0]) {
              paramArrayOfDouble2[0] = d3;
            }
            if (d3 < paramArrayOfDouble1[0]) {
              paramArrayOfDouble1[0] = d3;
            }
          }
          if (paramDouble2 > 0.0D)
          {
            d3 = a(localzbxg, d1 - paramDouble2);
            if (d3 > paramArrayOfDouble2[0]) {
              paramArrayOfDouble2[0] = d3;
            }
            if (d3 < paramArrayOfDouble1[0]) {
              paramArrayOfDouble1[0] = d3;
            }
          }
        }
      }
    }
  }
  
  static void a(zjf paramzjf, zbff paramzbff)
  {
    for (int i = 0; i < paramzbff.getCount(); i++)
    {
      zbfd localzbfd = paramzbff.c(i);
      if (localzbfd.H().getCount() != 0)
      {
        zbt localzbt;
        if (localzbfd.j()) {
          localzbt = paramzjf.g();
        } else {
          localzbt = paramzjf.e();
        }
        for (int j = 0; j < localzbfd.H().getCount(); j++)
        {
          double[] arrayOfDouble1 = null;
          double[] arrayOfDouble2 = null;
          double[][] arrayOfDouble3 = { arrayOfDouble2 };
          double[][] arrayOfDouble4 = { arrayOfDouble1 };
          a(localzbfd, localzbt, arrayOfDouble3, arrayOfDouble4);
          arrayOfDouble2 = arrayOfDouble3[0];
          arrayOfDouble1 = arrayOfDouble4[0];
          double d = 0.0D;
          zbxg localzbxg = localzbfd.H().c(j);
          if ((localzbxg.d().h()) && (arrayOfDouble1.length >= 2) && (arrayOfDouble2.length >= 2))
          {
            double[] arrayOfDouble5;
            switch (localzbxg.q())
            {
            case 1: 
              arrayOfDouble5 = new double[] { d };
              localzbxg.a(a(arrayOfDouble2, arrayOfDouble1, localzbxg.j(), localzbxg.i(), arrayOfDouble5));
              d = arrayOfDouble5[0];
              break;
            case 0: 
              arrayOfDouble5 = new double[] { d };
              localzbxg.a(b(arrayOfDouble2, arrayOfDouble1, localzbxg.j(), localzbxg.i(), arrayOfDouble5));
              d = arrayOfDouble5[0];
              break;
            case 2: 
              arrayOfDouble5 = new double[] { d };
              localzbxg.a(b(arrayOfDouble2, arrayOfDouble1, arrayOfDouble5));
              d = arrayOfDouble5[0];
              break;
            case 4: 
              arrayOfDouble5 = new double[] { d };
              localzbxg.a(a(arrayOfDouble2, arrayOfDouble1, localzbxg.o(), localzbxg.j(), localzbxg.i(), arrayOfDouble5));
              d = arrayOfDouble5[0];
              break;
            case 5: 
              arrayOfDouble5 = new double[] { d };
              localzbxg.a(a(arrayOfDouble2, arrayOfDouble1, arrayOfDouble5));
              d = arrayOfDouble5[0];
              break;
            case 3: 
              break;
            }
            localzbxg.d(d);
          }
        }
      }
    }
  }
  
  static void a(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(paramzp);
    for (int i = 0; i < paramzbfd.H().getCount(); i++)
    {
      zbxg localzbxg = paramzbfd.H().c(i);
      if (localzbxg.d().h()) {
        switch (localzbxg.q())
        {
        case 1: 
          if (a(localzbxg.s())) {
            a(paramzr, paramzbfd, paramzp, paramFloat, paramDouble, localzbxg);
          }
          break;
        case 0: 
        case 2: 
        case 4: 
        case 5: 
          if (a(localzbxg.s())) {
            b(paramzr, paramzbfd, paramzp, paramFloat, paramDouble, localzbxg);
          }
          break;
        case 3: 
          c(paramzr, paramzbfd, paramzp, paramFloat, paramDouble, localzbxg);
        }
      }
    }
    paramzr.a(localzf);
  }
  
  private static void a(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxg paramzbxg)
  {
    if (!paramzbxg.d().h()) {
      return;
    }
    zjf localzjf = paramzbfd.v();
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    a(paramzbfd, localzbt2, paramzbxg, arrayOfDouble1, arrayOfDouble2);
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    double d3 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    double d4 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    double d5 = 0.0D;
    double d8 = localzbt2.n() ? localzbt2.g(localzbt2.x()) : localzbt2.x();
    double d9 = localzbt2.n() ? localzbt2.g(localzbt2.z()) : localzbt2.z();
    double d10 = localzbt2.n() ? localzbt2.g(localzbt2.D()) : localzbt2.D();
    if (localzbt2.k() == 2) {
      d8 = zbv.a(1, localzbt2.y(), (int)localzbt2.x(), 0, paramzbfd.v().U());
    }
    double d6;
    double d7;
    if ((localzbt2.f()) || (localzjf.u()))
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
    if (localzbt2.p()) {
      d12 = paramzp.i() - d12;
    } else {
      d12 = paramzp.g() + d12;
    }
    double d13 = paramFloat;
    double d14 = paramFloat;
    double d15 = a(paramzbxg, localzbt2.n() ? localzbt2.h(d1) : d1);
    if (localzbt1.n()) {
      d15 = localzbt1.g(d15);
    }
    double d16 = (d15 - paramDouble) / (d4 - d3) * paramzp.f();
    if (!localzbt1.p()) {
      d14 -= d16;
    } else {
      d14 += d16;
    }
    double d17 = d7 * d11;
    if (localzbt2.p()) {
      d17 = paramzp.i() - d17;
    } else {
      d17 = paramzp.g() + d17;
    }
    double d18 = paramFloat;
    double d19 = a(paramzbxg, localzbt2.n() ? localzbt2.h(d2) : d2);
    if (localzbt1.n()) {
      d19 = localzbt1.g(d19);
    }
    double d20 = (d19 - paramDouble) / (d4 - d3) * paramzp.f();
    if (!localzbt1.p()) {
      d18 -= d20;
    } else {
      d18 += d20;
    }
    paramzbxg.d().a((float)d12, (float)d14, (float)d17, (float)d18);
    paramzbxg.a = new zo((float)d17, (float)d18);
    if (paramzbxg.a.e() < localzjf.B().a.d() + ziz.a) {
      paramzbxg.a.b(localzjf.B().a.d() + ziz.a);
    }
  }
  
  private static void b(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxg paramzbxg)
  {
    if (!paramzbxg.d().h()) {
      return;
    }
    zjf localzjf = paramzbfd.v();
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
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble1 = { d3 };
    double[] arrayOfDouble2 = { d4 };
    a(paramzbfd, localzbt2, paramzbxg, arrayOfDouble1, arrayOfDouble2);
    d3 = arrayOfDouble1[0];
    d4 = arrayOfDouble2[0];
    double d5 = 0.0D;
    double d6 = localzbt2.n() ? localzbt2.g(localzbt2.x()) : localzbt2.x();
    double d7 = localzbt2.n() ? localzbt2.g(localzbt2.z()) : localzbt2.z();
    double d8 = localzbt2.n() ? localzbt2.g(localzbt2.D()) : localzbt2.D();
    if (localzbt2.k() == 2) {
      d6 = zbv.a(1, localzbt2.y(), (int)localzbt2.x(), 0, paramzbfd.v().U());
    }
    if ((localzbt2.f()) || (localzjf.u())) {
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
      if ((localzbt2.f()) || (localzjf.u())) {
        d13 = (d12 - d8 + d6 / 2.0D) * paramzp.e() / d5;
      } else {
        d13 = (d12 - d8) * paramzp.e() / d5;
      }
      if (localzbt2.p()) {
        d13 = paramzp.i() - d13;
      } else {
        d13 = paramzp.g() + d13;
      }
      double d14 = paramFloat;
      double d15 = localzbt2.n() ? localzbt2.h(d12) : d12;
      double d16 = a(paramzbxg, d15);
      if (localzbt1.n()) {
        d16 = localzbt1.g(d16);
      }
      double d17 = (d16 - paramDouble) / (d2 - d1) * paramzp.f();
      if (!localzbt1.p()) {
        d14 -= d17;
      } else {
        d14 += d17;
      }
      zo localzo = new zo((float)d13, (float)d14);
      localArrayList.add(localzo);
    }
    a(paramzr, localArrayList, paramzbxg, true);
    if (localArrayList.size() > 0)
    {
      paramzbxg.a = ((zo)localArrayList.get(localArrayList.size() - 1));
      if (paramzbxg.a.e() < localzjf.B().a.d() + ziz.a) {
        paramzbxg.a.b(localzjf.B().a.d() + ziz.a);
      }
    }
  }
  
  private static void c(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxg paramzbxg)
  {
    if (!paramzbxg.d().h()) {
      return;
    }
    zjf localzjf = paramzbfd.v();
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
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble1 = { d3 };
    double[] arrayOfDouble2 = { d4 };
    a(paramzbfd, localzbt2, paramzbxg, arrayOfDouble1, arrayOfDouble2);
    d3 = arrayOfDouble1[0];
    d4 = arrayOfDouble2[0];
    double d5 = 0.0D;
    double d6 = localzbt2.n() ? localzbt2.g(localzbt2.x()) : localzbt2.x();
    double d7 = localzbt2.n() ? localzbt2.g(localzbt2.z()) : localzbt2.z();
    double d8 = localzbt2.n() ? localzbt2.g(localzbt2.D()) : localzbt2.D();
    if (localzbt2.k() == 2) {
      d6 = zbv.a(1, localzbt2.y(), (int)localzbt2.x(), 0, paramzbfd.v().U());
    }
    if ((localzbt2.f()) || (localzjf.u())) {
      d5 = d7 - d8 + d6;
    } else {
      d5 = d7 - d8;
    }
    double d9 = paramzp.e() / d5;
    ArrayList localArrayList1 = new ArrayList();
    zkh localzkh = paramzbfd.F();
    ArrayList localArrayList2 = localzkh.d();
    for (int j = paramzbxg.p() - 1; j < localArrayList2.size(); j++)
    {
      zkf localzkf = (zkf)localArrayList2.get(j);
      double d10 = 0.0D;
      double[] arrayOfDouble3 = { d10 };
      boolean bool = a(j, paramzbxg.p(), localArrayList2, arrayOfDouble3);
      d10 = arrayOfDouble3[0];
      if (!bool)
      {
        double d11;
        if ((localzbt2.f()) || (localzjf.u())) {
          d11 = (localzkf.q() - d8 + d6 / 2.0D) * d9;
        } else {
          d11 = (localzkf.q() - d8) * d9;
        }
        if (localzbt2.p()) {
          d11 = paramzp.i() - d11;
        } else {
          d11 = paramzp.g() + d11;
        }
        double d12 = paramFloat;
        double d13 = (d10 - paramDouble) / (d2 - d1) * paramzp.f();
        if (!localzbt1.p()) {
          d12 -= d13;
        } else {
          d12 += d13;
        }
        zo localzo = new zo((float)d11, (float)d12);
        localArrayList1.add(localzo);
      }
    }
    a(paramzr, localArrayList1, paramzbxg, false);
  }
  
  static void b(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(paramzp);
    for (int i = 0; i < paramzbfd.H().getCount(); i++)
    {
      zbxg localzbxg = paramzbfd.H().c(i);
      if ((localzbxg.d().h()) && (a(localzbxg.s()))) {
        switch (localzbxg.q())
        {
        case 1: 
          d(paramzr, paramzbfd, paramzp, paramFloat, paramDouble, localzbxg);
          break;
        case 0: 
        case 2: 
        case 4: 
        case 5: 
          e(paramzr, paramzbfd, paramzp, paramFloat, paramDouble, localzbxg);
          break;
        case 3: 
          f(paramzr, paramzbfd, paramzp, paramFloat, paramDouble, localzbxg);
        }
      }
    }
    paramzr.a(localzf);
  }
  
  private static void d(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxg paramzbxg)
  {
    if (!paramzbxg.d().h()) {
      return;
    }
    zjf localzjf = paramzbfd.v();
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    a(paramzbfd, localzbt2, paramzbxg, arrayOfDouble1, arrayOfDouble2);
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    double d3 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    double d4 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    double d5 = 0.0D;
    double d8 = localzbt2.n() ? localzbt2.g(localzbt2.x()) : localzbt2.x();
    double d9 = localzbt2.n() ? localzbt2.g(localzbt2.z()) : localzbt2.z();
    double d10 = localzbt2.n() ? localzbt2.g(localzbt2.D()) : localzbt2.D();
    if (localzbt2.k() == 2) {
      d8 = zbv.a(1, localzbt2.y(), (int)localzbt2.x(), 0, paramzbfd.v().U());
    }
    double d6;
    double d7;
    if ((localzbt2.f()) || (localzjf.u()))
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
    if (!localzbt2.p()) {
      d12 = paramzp.j() - d12;
    } else {
      d12 = paramzp.h() + d12;
    }
    double d13 = paramFloat;
    double d14 = a(paramzbxg, localzbt2.n() ? localzbt2.h(d1) : d1);
    if (localzbt1.n()) {
      d14 = localzbt1.g(d14);
    }
    double d15 = (d14 - paramDouble) / (d4 - d3) * paramzp.e();
    if (!localzbt1.p()) {
      d13 += d15;
    } else {
      d13 -= d15;
    }
    double d16 = d7 * d11;
    if (!localzbt2.p()) {
      d16 = paramzp.j() - d16;
    } else {
      d16 = paramzp.h() + d16;
    }
    double d17 = paramFloat;
    double d18 = a(paramzbxg, localzbt2.n() ? localzbt2.h(d2) : d2);
    if (localzbt1.n()) {
      d18 = localzbt1.g(d18);
    }
    double d19 = (d18 - paramDouble) / (d4 - d3) * paramzp.e();
    if (!localzbt1.p()) {
      d17 += d19;
    } else {
      d17 -= d19;
    }
    paramzbxg.d().a((float)d13, (float)d12, (float)d17, (float)d16);
    paramzbxg.a = new zo((float)d17, (float)d16);
    if (paramzbxg.a.e() < localzjf.B().a.d() + ziz.a) {
      paramzbxg.a.b(localzjf.B().a.d() + ziz.a);
    }
  }
  
  private static void e(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxg paramzbxg)
  {
    if (!paramzbxg.d().h()) {
      return;
    }
    zjf localzjf = paramzbfd.v();
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
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble1 = { d3 };
    double[] arrayOfDouble2 = { d4 };
    a(paramzbfd, localzbt2, paramzbxg, arrayOfDouble1, arrayOfDouble2);
    d3 = arrayOfDouble1[0];
    d4 = arrayOfDouble2[0];
    double d5 = 0.0D;
    double d6 = localzbt2.n() ? localzbt2.g(localzbt2.x()) : localzbt2.x();
    double d7 = localzbt2.n() ? localzbt2.g(localzbt2.z()) : localzbt2.z();
    double d8 = localzbt2.n() ? localzbt2.g(localzbt2.D()) : localzbt2.D();
    if (localzbt2.k() == 2) {
      d6 = zbv.a(1, localzbt2.y(), (int)localzbt2.x(), 0, paramzbfd.v().U());
    }
    if ((localzbt2.f()) || (localzjf.u())) {
      d5 = d7 - d8 + d6;
    } else {
      d5 = d7 - d8;
    }
    ArrayList localArrayList = new ArrayList();
    double d9 = d5 / paramzp.f();
    for (double d10 = d3; d10 <= d4; d10 += d9)
    {
      double d11;
      if ((localzbt2.f()) || (localzjf.u())) {
        d11 = (d10 - d8 + d6 / 2.0D) * paramzp.f() / d5;
      } else {
        d11 = (d10 - d8) * paramzp.f() / d5;
      }
      if (!localzbt2.p()) {
        d11 = paramzp.j() - d11;
      } else {
        d11 = paramzp.h() + d11;
      }
      double d12 = paramFloat;
      double d13 = localzbt2.n() ? localzbt2.h(d10) : d10;
      double d14 = a(paramzbxg, d13);
      if (localzbt1.n()) {
        d14 = localzbt1.g(d14);
      }
      double d15 = (d14 - paramDouble) / (d2 - d1) * paramzp.e();
      if (!localzbt1.p()) {
        d12 += d15;
      } else {
        d12 -= d15;
      }
      zo localzo = new zo((float)d12, (float)d11);
      localArrayList.add(localzo);
    }
    a(paramzr, localArrayList, paramzbxg, true);
    if (localArrayList.size() > 0)
    {
      paramzbxg.a = ((zo)localArrayList.get(localArrayList.size() - 1));
      if (paramzbxg.a.e() < localzjf.B().a.d() + ziz.a) {
        paramzbxg.a.b(localzjf.B().a.d() + ziz.a);
      }
    }
  }
  
  private static void f(zr paramzr, zbfd paramzbfd, com.aspose.cells.b.a.b.zp paramzp, float paramFloat, double paramDouble, zbxg paramzbxg)
  {
    if (!paramzbxg.d().h()) {
      return;
    }
    zjf localzjf = paramzbfd.v();
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
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble1 = { d3 };
    double[] arrayOfDouble2 = { d4 };
    a(paramzbfd, localzbt2, paramzbxg, arrayOfDouble1, arrayOfDouble2);
    d3 = arrayOfDouble1[0];
    d4 = arrayOfDouble2[0];
    double d5 = 0.0D;
    double d6 = localzbt2.n() ? localzbt2.g(localzbt2.x()) : localzbt2.x();
    double d7 = localzbt2.n() ? localzbt2.g(localzbt2.z()) : localzbt2.z();
    double d8 = localzbt2.n() ? localzbt2.g(localzbt2.D()) : localzbt2.D();
    if (localzbt2.k() == 2) {
      d6 = zbv.a(1, localzbt2.y(), (int)localzbt2.x(), 0, paramzbfd.v().U());
    }
    if ((localzbt2.f()) || (localzjf.u())) {
      d5 = d7 - d8 + d6;
    } else {
      d5 = d7 - d8;
    }
    double d9 = paramzp.f() / d5;
    ArrayList localArrayList1 = new ArrayList();
    zkh localzkh = paramzbfd.F();
    ArrayList localArrayList2 = localzkh.d();
    for (int j = paramzbxg.p() - 1; j < localArrayList2.size(); j++)
    {
      zkf localzkf = (zkf)localArrayList2.get(j);
      double d10 = 0.0D;
      double[] arrayOfDouble3 = { d10 };
      boolean bool = a(j, paramzbxg.p(), localArrayList2, arrayOfDouble3);
      d10 = arrayOfDouble3[0];
      if (!bool)
      {
        double d11;
        if ((localzbt2.f()) || (localzjf.u())) {
          d11 = (localzkf.q() - d8 + d6 / 2.0D) * d9;
        } else {
          d11 = (localzkf.q() - d8) * d9;
        }
        if (!localzbt2.p()) {
          d11 = paramzp.j() - d11;
        } else {
          d11 = paramzp.h() + d11;
        }
        double d12 = paramFloat;
        double d13 = (d10 - paramDouble) / (d2 - d1) * paramzp.e();
        if (!localzbt1.p()) {
          d12 += d13;
        } else {
          d12 -= d13;
        }
        zo localzo = new zo((float)d12, (float)d11);
        localArrayList1.add(localzo);
      }
    }
    a(paramzr, localArrayList1, paramzbxg, false);
  }
  
  private static boolean a(int paramInt1, int paramInt2, ArrayList paramArrayList, double[] paramArrayOfDouble)
  {
    double d = 0.0D;
    int i = 0;
    for (int j = paramInt1 - paramInt2 + 1; j <= paramInt1; j++)
    {
      zkf localzkf = (zkf)paramArrayList.get(j);
      if ((localzkf == null) || (localzkf.a())) {
        i++;
      } else {
        d += localzkf.w();
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
  
  static double a(zbxg paramzbxg, double paramDouble)
  {
    double[] arrayOfDouble = paramzbxg.s();
    switch (paramzbxg.q())
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
  
  static void a(zr paramzr, List paramList, zbxg paramzbxg, boolean paramBoolean)
  {
    zo[] arrayOfzo = new zo[paramList.size()];
    zbxz.a(arrayOfzo);
    com.aspose.cells.a.e.ze.a(paramList, arrayOfzo, 0);
    if (arrayOfzo.length > 1)
    {
      com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
      if (paramBoolean) {
        localze.c(arrayOfzo);
      } else {
        localze.a(arrayOfzo);
      }
      paramzbxg.d().a(localze);
    }
  }
  
  private static void a(zbfd paramzbfd, zbt paramzbt, double[][] paramArrayOfDouble1, double[][] paramArrayOfDouble2)
  {
    zbt localzbt = paramzbt.ae();
    double d = 2.147483647E9D;
    for (int i = 0; i < paramzbfd.F().getCount(); i++)
    {
      zkf localzkf1 = paramzbfd.F().b(i);
      if ((localzkf1 != null) && (!localzkf1.a()) && (!localzkf1.b()) && ((localzkf1 == null) || ((!localzkf1.d()) && (!localzkf1.z()))) && (localzkf1.q() < d)) {
        d = localzkf1.q();
      }
    }
    i = paramzbfd.F().getCount();
    for (int j = 0; j < paramzbfd.F().getCount(); j++)
    {
      zkf localzkf2 = paramzbfd.F().b(j);
      if ((localzkf2 == null) || (localzkf2.a()) || (localzkf2.b())) {
        i--;
      } else if ((localzkf2 != null) && ((localzkf2.z()) || (localzkf2.x() == 3))) {
        i--;
      } else if ((localzkf2 != null) && ((localzkf2.d()) || (localzkf2.r() == 2) || (localzkf2.r() == 3))) {
        i--;
      }
    }
    paramArrayOfDouble1[0] = new double[i];
    paramArrayOfDouble2[0] = new double[i];
    j = 0;
    for (int k = 0; k < paramzbfd.F().getCount(); k++)
    {
      zkf localzkf3 = paramzbfd.F().b(k);
      if (((localzkf3 == null) || ((!localzkf3.z()) && (localzkf3.x() != 3))) && ((localzkf3 == null) || ((!localzkf3.d()) && (localzkf3.r() != 2) && (localzkf3.r() != 3))) && (localzkf3 != null) && (!localzkf3.a()) && (!localzkf3.b()))
      {
        paramArrayOfDouble1[0][j] = localzkf3.w();
        if (localzbt.n()) {
          paramArrayOfDouble1[0][j] = localzbt.h(paramArrayOfDouble1[0][j]);
        }
        if (localzkf3.b()) {
          paramArrayOfDouble2[0][j] = d;
        } else {
          paramArrayOfDouble2[0][j] = localzkf3.q();
        }
        if (paramzbt.n()) {
          paramArrayOfDouble2[0][j] = paramzbt.h(paramArrayOfDouble2[0][j]);
        }
        j++;
      }
    }
  }
  
  private static void a(zbfd paramzbfd, zbt paramzbt, zbxg paramzbxg, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    paramArrayOfDouble1[0] = 2.147483647E9D;
    paramArrayOfDouble2[0] = -2.147483648E9D;
    zkh localzkh = paramzbfd.F();
    int i = 1;
    for (int j = 0; j < localzkh.getCount(); j++)
    {
      zkf localzkf = localzkh.b(j);
      if ((localzkf != null) && (!localzkf.b()) && (!localzkf.d()) && (localzkf.r() != 3))
      {
        double d2 = localzkf.q();
        if (i != 0)
        {
          paramArrayOfDouble1[0] = d2;
          paramArrayOfDouble2[0] = d2;
          i = 0;
        }
        if (d2 < paramArrayOfDouble1[0]) {
          paramArrayOfDouble1[0] = d2;
        }
        if (d2 > paramArrayOfDouble2[0]) {
          paramArrayOfDouble2[0] = d2;
        }
      }
    }
    if (i != 0)
    {
      paramArrayOfDouble1[0] = 0.0D;
      paramArrayOfDouble2[0] = 0.0D;
    }
    if (paramzbt.k() == 2)
    {
      DateTime localDateTime1 = zbxz.a(0.0D, paramzbfd.v().U());
      double d1 = paramzbxg.e();
      if (paramzbt.y() == 2) {
        d1 *= 30.0D;
      } else if (paramzbt.y() == 2) {
        d1 *= 365.0D;
      }
      DateTime localDateTime2 = localDateTime1.addDays(d1);
      paramArrayOfDouble1[0] -= zbxz.a(localDateTime2, paramzbfd.v().U());
      localDateTime1 = zbxz.a(0.0D, paramzbfd.v().U());
      double d3 = paramzbxg.h();
      if (paramzbt.y() == 2) {
        d3 *= 30.0D;
      } else if (paramzbt.y() == 2) {
        d3 *= 365.0D;
      }
      localDateTime2 = localDateTime1.addDays(d3);
      paramArrayOfDouble2[0] += zbxz.a(localDateTime2, paramzbfd.v().U());
    }
    else
    {
      paramArrayOfDouble1[0] -= paramzbxg.e();
      paramArrayOfDouble2[0] += paramzbxg.h();
    }
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
  
  static void a(zr paramzr, zbfd paramzbfd)
    throws Exception
  {
    int i = 0;
    if ((paramzbfd.ai() == 6) || (paramzbfd.ai() == 7) || (paramzbfd.ai() == 8)) {
      i = 1;
    }
    com.aspose.cells.b.a.b.zp localzp = paramzbfd.v().B().a;
    zt localzt1 = new zt(localzp.e() * 0.87F, localzp.f());
    for (int j = 0; j < paramzbfd.H().getCount(); j++)
    {
      zbxg localzbxg = paramzbfd.H().c(j);
      if ((localzbxg.d().h()) && (a(localzbxg.s())))
      {
        String str1 = null;
        Object localObject1;
        Object localObject2;
        Object localObject3;
        Object localObject5;
        Object localObject6;
        Object localObject7;
        Object localObject8;
        if (localzbxg.r().s() == null)
        {
          localObject1 = new ArrayList();
          localObject2 = new ArrayList();
          Object localObject4;
          if (localzbxg.f())
          {
            double[] arrayOfDouble = localzbxg.s();
            localObject4 = a(paramzbfd.v(), localzbxg.s(), localzbxg);
            switch (localzbxg.q())
            {
            case 1: 
              str1 = "y = ";
              if ((arrayOfDouble.length >= 2) && (arrayOfDouble[0] == 0.0D) && (arrayOfDouble[1] == 0.0D))
              {
                str1 = str1 + "0";
              }
              else
              {
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
              }
              if ((arrayOfDouble.length == 2) && (arrayOfDouble[0] == 0.0D)) {
                str1 = "y = " + localObject4[1];
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
              int n = 1;
              for (int i2 = 0; i2 < arrayOfDouble.length - 2; i2++) {
                if (arrayOfDouble[i2] != 0.0D)
                {
                  if (n != 0)
                  {
                    str1 = "y = ";
                    if (arrayOfDouble[i2] < 0.0D) {
                      str1 = str1 + " -";
                    }
                  }
                  else if (arrayOfDouble[i2] < 0.0D)
                  {
                    str1 = str1 + " - ";
                  }
                  else
                  {
                    str1 = str1 + " + ";
                  }
                  if (Math.abs(arrayOfDouble[i2]) == 1.0D) {
                    str1 = str1 + "x";
                  } else {
                    str1 = str1 + localObject4[i2] + "x";
                  }
                  com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
                  com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, com.aspose.cells.b.a.zp.a(arrayOfDouble.length - i2 - 1));
                  str1 = "";
                  n = 0;
                }
              }
              str1 = "";
              if (arrayOfDouble[(arrayOfDouble.length - 2)] != 0.0D)
              {
                if (n != 0)
                {
                  str1 = "y = ";
                  if (arrayOfDouble[(arrayOfDouble.length - 2)] < 0.0D) {
                    str1 = str1 + " -";
                  }
                }
                else if (arrayOfDouble[(arrayOfDouble.length - 2)] < 0.0D)
                {
                  str1 = str1 + " - ";
                }
                else
                {
                  str1 = str1 + " + ";
                }
                if (Math.abs(arrayOfDouble[(arrayOfDouble.length - 2)]) == 1.0D) {
                  str1 = str1 + "x";
                } else {
                  str1 = str1 + localObject4[(arrayOfDouble.length - 2)] + "x";
                }
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
              }
              str1 = "";
              if (arrayOfDouble[(arrayOfDouble.length - 1)] != 0.0D)
              {
                if (arrayOfDouble[(arrayOfDouble.length - 1)] > 0.0D) {
                  str1 = str1 + " + ";
                } else if (arrayOfDouble[(arrayOfDouble.length - 1)] < 0.0D) {
                  str1 = str1 + " - ";
                }
                str1 = str1 + localObject4[(arrayOfDouble.length - 1)];
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str1);
              }
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
          int i3;
          if (localzbxg.g())
          {
            str1 = "";
            str1 = str1 + "R";
            com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, str1);
            com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, "2");
            if (a(localzbxg))
            {
              str1 = " = #N/A";
            }
            else
            {
              int k = 1;
              localObject4 = "0.0000";
              if (!"".equals(localzbxg.r().p()))
              {
                localObject4 = localzbxg.r().p();
                k = 0;
                if (((String)localObject4).toLowerCase().equals("general"))
                {
                  localObject4 = "0.0000";
                  k = 1;
                }
              }
              str1 = " = ";
              String str2 = zgy.a(paramzbfd.v().an(), Double.valueOf(localzbxg.t()), (String)localObject4);
              if (k != 0)
              {
                double d = zbxz.a(str2, paramzbfd.v().an());
                if (d == 0.0D)
                {
                  str2 = com.aspose.cells.a.c.zp.a(localzbxg.t(), "0.00E+00");
                  localObject9 = zw.d(str2, 'E');
                  if (localObject9.length > 1)
                  {
                    str2 = a(localObject9[0]) + "E";
                    for (i3 = 1; i3 < localObject9.length; i3++) {
                      str2 = str2 + localObject9[i3];
                    }
                  }
                }
                else
                {
                  str2 = a(str2);
                }
              }
              str1 = str1 + str2;
            }
            com.aspose.cells.b.a.a.zf.a((ArrayList)localObject2, str1);
          }
          localObject3 = "";
          for (int m = 0; m < ((ArrayList)localObject1).size(); m++) {
            localObject3 = (String)localObject3 + (String)((ArrayList)localObject1).get(m);
          }
          localObject5 = "";
          for (int i1 = 0; i1 < ((ArrayList)localObject2).size(); i1++) {
            localObject5 = (String)localObject5 + (String)((ArrayList)localObject2).get(i1);
          }
          localObject6 = new ArrayList();
          if ((!"".equals(localObject3)) || (!"".equals(localObject5)))
          {
            localObject7 = localzbxg.r();
            ((zqy)localObject7).c((String)localObject3 + "\n" + (String)localObject5);
            localObject8 = new zg(((zqy)localObject7).a().h().b(), ((zqy)localObject7).a().h().h() * 0.7F);
            localObject9 = new zt(0.0F, 0.0F);
            i3 = 7;
            int i4 = 9;
            Object localObject11;
            Object localObject12;
            if (((ArrayList)localObject1).size() > 0) {
              if (((ArrayList)localObject1).size() == 1)
              {
                zs localzs = zbvy.a(paramzr, (String)localObject3, 0, ((zqy)localObject7).a().h(), localzt1, i3, i4);
                ((zt)localObject9).a(localzs.b());
                ((zt)localObject9).b(localzs.c());
                zbcz localzbcz1 = new zbcz((String)localObject3, ((zqy)localObject7).a().h(), ((zqy)localObject7).a().j(), ((zqy)localObject7).a().k(), 2);
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject6, localzbcz1);
              }
              else
              {
                float f1 = 0.0F;
                float f2 = 0.0F;
                int i5 = ((ArrayList)localObject1).size() - 2;
                if (((ArrayList)localObject1).size() == 2) {
                  i5++;
                }
                for (int i6 = 0; i6 < i5; i6 += 2)
                {
                  localObject11 = zt.a();
                  localObject12 = (String)((ArrayList)localObject1).get(i6);
                  localObject13 = zbvy.b(paramzr, (String)localObject12, ((zqy)localObject7).a().h());
                  ((zt)localObject11).a(((zt)localObject13).b());
                  ((zt)localObject11).b(((zt)localObject13).c());
                  if (((zt)localObject13).c() > f2) {
                    f2 = ((zt)localObject13).c();
                  }
                  localObject14 = (String)((ArrayList)localObject1).get(i6 + 1);
                  localObject15 = zbvy.b(paramzr, (String)localObject14, (zg)localObject8);
                  ((zt)localObject11).a(((zt)localObject11).b() + ((zt)localObject15).b());
                  if (f1 + ((zt)localObject11).b() <= localzt1.b())
                  {
                    f1 += ((zt)localObject11).b();
                  }
                  else
                  {
                    if (f1 > ((zt)localObject9).b()) {
                      ((zt)localObject9).a(f1);
                    }
                    ((zt)localObject9).b(((zt)localObject9).c() + f2);
                    f1 = 0.0F;
                    f2 = 0.0F;
                  }
                }
                if (f1 > ((zt)localObject9).b()) {
                  ((zt)localObject9).a(f1);
                }
                ((zt)localObject9).b(((zt)localObject9).c() + f2);
                if (((ArrayList)localObject1).size() > 2)
                {
                  float f4 = ((zt)localObject9).b();
                  if (((ArrayList)localObject1).size() % 2 == 0)
                  {
                    localObject11 = (String)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 2);
                    localObject12 = zbvy.b(paramzr, (String)localObject11, ((zqy)localObject7).a().h());
                    if (f4 + ((zt)localObject12).b() <= localzt1.b())
                    {
                      ((zt)localObject9).a(((zt)localObject9).b() + ((zt)localObject12).b());
                      f4 = ((zt)localObject9).b();
                    }
                    else
                    {
                      ((zt)localObject9).b(((zt)localObject9).c() + ((zt)localObject12).c());
                      f4 = ((zt)localObject12).b();
                    }
                  }
                  localObject11 = (String)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 1);
                  localObject12 = zbvy.b(paramzr, (String)localObject11, ((zqy)localObject7).a().h());
                  if (f4 + ((zt)localObject12).b() <= localzt1.b())
                  {
                    if (f4 + ((zt)localObject12).b() > ((zt)localObject9).b()) {
                      ((zt)localObject9).a(f4 + ((zt)localObject12).b());
                    }
                  }
                  else {
                    ((zt)localObject9).b(((zt)localObject9).c() + ((zt)localObject12).c());
                  }
                }
              }
            }
            zt localzt2 = new zt(0.0F, 0.0F);
            if (((ArrayList)localObject2).size() > 0)
            {
              localObject10 = (String)((ArrayList)localObject2).get(0);
              zt localzt3 = zbvy.b(paramzr, (String)localObject10, ((zqy)localObject7).a().h());
              localzt2.a(localzt2.b() + localzt3.b());
              localzt2.b(localzt2.c() + localzt3.c());
              String str3 = (String)((ArrayList)localObject2).get(1);
              localObject11 = zbvy.b(paramzr, str3, (zg)localObject8);
              localzt2.a(localzt2.b() + ((zt)localObject11).b());
              localObject12 = (String)((ArrayList)localObject2).get(2);
              localObject13 = zbvy.b(paramzr, (String)localObject12, ((zqy)localObject7).a().h());
              localzt2.a(localzt2.b() + ((zt)localObject13).b());
            }
            Object localObject10 = zbvy.a(paramzr, (String)localObject3, 0, ((zqy)localObject7).a().h(), localzt1, i3, i4);
            float f3 = ((zs)localObject10).c() / 10.0F;
            if (((ArrayList)localObject1).size() > 1) {
              ((zt)localObject9).b(((zt)localObject9).c() + f3);
            }
            float f5 = ((zs)localObject10).c() / 10.0F;
            if (((ArrayList)localObject1).size() > 1) {
              localzt2.b(localzt2.c() + f5);
            }
            float f6 = ((zt)localObject9).b() > localzt2.b() ? ((zt)localObject9).b() : localzt2.b();
            float f7 = ((zt)localObject9).c() + localzt2.c();
            Object localObject13 = new zq(localzbxg.a.d() - f6 - 8.0F, localzbxg.a.e() - f7 / 2.0F, f6, f7);
            if (i != 0) {
              localObject13 = new zq(localzbxg.a.d() - f6 / 2.0F, localzbxg.a.e() + 10.0F, f6, f7);
            }
            Object localObject14 = localzbxg.s();
            if ((localObject14.length >= 2) && (localObject14[0] == 0.0D) && (localObject14[1] == 0.0D)) {
              localObject13 = new zq(localzbxg.a.d() - f6 - 8.0F, localzbxg.a.e() - f7, f6, f7);
            }
            if (((zq)localObject13).g() < localzp.d() + ziz.b) {
              ((zq)localObject13).b(localzp.d() + ziz.b);
            }
            ((zqy)localObject7).a().b = com.aspose.cells.b.a.b.zp.a((zq)localObject13);
            ((zqy)localObject7).a().z();
            Object localObject15 = new zq(((zqy)localObject7).a().a.c(), ((zqy)localObject7).a().a.d(), ((zqy)localObject7).a().a.e(), ((zqy)localObject7).a().a.f());
            zq[] arrayOfzq = { localObject15 };
            localzbxg.d().e().a(arrayOfzq);
            localObject15 = arrayOfzq[0];
            Object localObject16 = localObject15;
            ((zqy)localObject7).a().c().a((zq)localObject16);
            ((zqy)localObject7).a().d().a((zq)localObject16);
            zo localzo1 = ((zq)localObject15).d();
            float f8 = 0.0F;
            float f9 = 0.0F;
            if (((zt)localObject9).b() > localzt2.b()) {
              f9 = (((zt)localObject9).b() - localzt2.b()) / 2.0F;
            } else {
              f8 = (localzt2.b() - ((zt)localObject9).b()) / 2.0F;
            }
            zt localzt4;
            Object localObject17;
            if (((ArrayList)localObject1).size() > 0) {
              if (((ArrayList)localObject1).size() == 1)
              {
                paramzr.a((String)localObject3, ((zqy)localObject7).a().h(), new zu(((zqy)localObject7).a().j()), localzo1);
              }
              else
              {
                localzo1.a(localzo1.d() + f8);
                localzo1.b(localzo1.e() + f3);
                float f10 = localzo1.d();
                localzt4 = zt.a();
                if (((ArrayList)localObject1).size() > 2)
                {
                  String str5 = (String)((ArrayList)localObject1).get(1);
                  localzt4 = zbvy.b(paramzr, str5, (zg)localObject8);
                }
                float f11 = 0.0F;
                float f12 = 0.0F;
                localObject17 = new ArrayList();
                int i7 = ((ArrayList)localObject1).size() - 2;
                if (((ArrayList)localObject1).size() == 2) {
                  i7++;
                }
                zt localzt6;
                Object localObject18;
                Object localObject19;
                Object localObject20;
                for (int i8 = 0; i8 < i7; i8 += 2)
                {
                  if (i8 != 0) {
                    localzo1.a(localzo1.d() + localzt4.b());
                  }
                  localzt6 = zt.a();
                  localObject18 = (String)((ArrayList)localObject1).get(i8);
                  zbcz localzbcz2 = new zbcz((String)localObject18, ((zqy)localObject7).a().h(), ((zqy)localObject7).a().j(), new zzo(), 2);
                  localzbcz2.a.a(localzo1.d());
                  localzbcz2.a.b(localzo1.e());
                  zt localzt7 = zbvy.b(paramzr, (String)localObject18, ((zqy)localObject7).a().h());
                  if (localzt7.c() > f12) {
                    f12 = localzt7.c();
                  }
                  localzo1.a(localzo1.d() + localzt7.b());
                  localObject19 = (String)((ArrayList)localObject1).get(i8 + 1);
                  localObject20 = zbvy.b(paramzr, (String)localObject19, (zg)localObject8);
                  zbcz localzbcz3 = new zbcz((String)localObject19, (zg)localObject8, ((zqy)localObject7).a().j(), new zzo(), 2);
                  localzbcz3.a.a(localzo1.d());
                  localzbcz3.a.b(localzo1.e());
                  com.aspose.cells.b.a.a.zf.a((ArrayList)localObject17, localzbcz3);
                  if (f11 + localzt7.b() + ((zt)localObject20).b() <= ((zt)localObject9).b())
                  {
                    com.aspose.cells.b.a.a.zf.a((ArrayList)localObject17, localzbcz2);
                    com.aspose.cells.b.a.a.zf.a((ArrayList)localObject17, localzbcz3);
                    f11 += localzt7.b() + ((zt)localObject20).b();
                  }
                  else
                  {
                    float f15 = (((zt)localObject9).b() - f11) / 2.0F;
                    for (int i11 = 0; i11 < ((ArrayList)localObject17).size(); i11++)
                    {
                      zbcz localzbcz4 = (zbcz)((ArrayList)localObject17).get(i11);
                      zo localzo3 = localzbcz4.a.d();
                      localzo3.a(localzo3.d() + f15);
                      paramzr.a(localzbcz4.a(), localzbcz4.b(), new zu(localzbcz4.c()), localzo3);
                    }
                    ((ArrayList)localObject17).clear();
                    localzo1.a(f10);
                    localzo1.b(localzo1.e() + f12);
                    localzbcz2.a.a(localzo1.d());
                    localzbcz2.a.b(localzo1.e());
                    com.aspose.cells.b.a.a.zf.a((ArrayList)localObject17, localzbcz2);
                    localzo1.a(localzo1.d() + localzt7.b());
                    localzbcz3.a.a(localzo1.d());
                    localzbcz3.a.b(localzo1.e());
                    com.aspose.cells.b.a.a.zf.a((ArrayList)localObject17, localzbcz3);
                    f11 = 0.0F;
                    f12 = 0.0F;
                  }
                }
                if (((ArrayList)localObject1).size() > 2)
                {
                  float f14;
                  int i10;
                  if (((ArrayList)localObject1).size() % 2 == 0)
                  {
                    str7 = (String)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 2);
                    localzt6 = zbvy.b(paramzr, str7, ((zqy)localObject7).a().h());
                    localObject18 = new zbcz(str7, ((zqy)localObject7).a().h(), ((zqy)localObject7).a().j(), new zzo(), 2);
                    if (f11 + localzt6.b() <= ((zt)localObject9).b())
                    {
                      ((zbcz)localObject18).a.a(localzo1.d());
                      ((zbcz)localObject18).a.b(localzo1.e());
                      com.aspose.cells.b.a.a.zf.a((ArrayList)localObject17, localObject18);
                      localzo1.a(localzo1.d() + localzt6.b());
                      f11 += localzt6.b();
                    }
                    else
                    {
                      f14 = (((zt)localObject9).b() - f11) / 2.0F;
                      for (i10 = 0; i10 < ((ArrayList)localObject17).size(); i10++)
                      {
                        localObject19 = (zbcz)((ArrayList)localObject17).get(i10);
                        localObject20 = ((zbcz)localObject19).a.d();
                        ((zo)localObject20).a(((zo)localObject20).d() + f14);
                        paramzr.a(((zbcz)localObject19).a(), ((zbcz)localObject19).b(), new zu(((zbcz)localObject19).c()), (zo)localObject20);
                      }
                      ((ArrayList)localObject17).clear();
                      localzo1.b(localzo1.e() + localzt6.c());
                      localzo1.a(f10);
                      ((zbcz)localObject18).a.a(localzo1.d());
                      ((zbcz)localObject18).a.b(localzo1.e());
                      com.aspose.cells.b.a.a.zf.a((ArrayList)localObject17, localObject18);
                      localzo1.a(localzo1.d() + localzt6.b());
                      f11 += localzt6.b();
                    }
                  }
                  String str7 = (String)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 1);
                  localzt6 = zbvy.b(paramzr, str7, ((zqy)localObject7).a().h());
                  localObject18 = new zbcz(str7, ((zqy)localObject7).a().h(), ((zqy)localObject7).a().j(), new zzo(), 2);
                  if (f11 + localzt6.b() <= ((zt)localObject9).b())
                  {
                    ((zbcz)localObject18).a.a(localzo1.d());
                    ((zbcz)localObject18).a.b(localzo1.e());
                    com.aspose.cells.b.a.a.zf.a((ArrayList)localObject17, localObject18);
                    localzo1.a(localzo1.d() + localzt6.b());
                    f11 += localzt6.b();
                  }
                  else
                  {
                    f14 = (((zt)localObject9).b() - f11) / 2.0F;
                    for (i10 = 0; i10 < ((ArrayList)localObject17).size(); i10++)
                    {
                      localObject19 = (zbcz)((ArrayList)localObject17).get(i10);
                      localObject20 = ((zbcz)localObject19).a.d();
                      ((zo)localObject20).a(((zo)localObject20).d() + f14);
                      paramzr.a(((zbcz)localObject19).a(), ((zbcz)localObject19).b(), new zu(((zbcz)localObject19).c()), (zo)localObject20);
                    }
                    ((ArrayList)localObject17).clear();
                    localzo1.b(localzo1.e() + localzt6.c());
                    localzo1.a(f10);
                    ((zbcz)localObject18).a.a(localzo1.d());
                    ((zbcz)localObject18).a.b(localzo1.e());
                    com.aspose.cells.b.a.a.zf.a((ArrayList)localObject17, localObject18);
                    localzo1.a(localzo1.d() + localzt6.b());
                    f11 = localzt6.b();
                  }
                }
                if (((ArrayList)localObject17).size() > 0)
                {
                  float f13 = (((zt)localObject9).b() - f11) / 2.0F;
                  for (int i9 = 0; i9 < ((ArrayList)localObject17).size(); i9++)
                  {
                    localObject18 = (zbcz)((ArrayList)localObject17).get(i9);
                    zo localzo2 = ((zbcz)localObject18).a.d();
                    localzo2.a(localzo2.d() + f13);
                    paramzr.a(((zbcz)localObject18).a(), ((zbcz)localObject18).b(), new zu(((zbcz)localObject18).c()), localzo2);
                  }
                  ((ArrayList)localObject17).clear();
                }
              }
            }
            if (((ArrayList)localObject2).size() > 0)
            {
              localzo1.a(((zq)localObject15).f());
              localzo1.b(((zq)localObject15).g() + ((zt)localObject9).c());
              localzo1.a(localzo1.d() + f9);
              localzo1.b(localzo1.e() + f5);
              String str4 = (String)((ArrayList)localObject2).get(0);
              paramzr.a(str4, ((zqy)localObject7).a().h(), new zu(((zqy)localObject7).a().j()), localzo1);
              localzt4 = zbvy.b(paramzr, str4, ((zqy)localObject7).a().h());
              localzo1.a(localzo1.d() + localzt4.b());
              localzo1.b(localzo1.e() - f5);
              String str6 = (String)((ArrayList)localObject2).get(1);
              paramzr.a(str6, (zg)localObject8, new zu(((zqy)localObject7).a().j()), localzo1);
              if (((ArrayList)localObject2).size() > 2)
              {
                zt localzt5 = zbvy.b(paramzr, str6, (zg)localObject8);
                localzo1.a(localzo1.d() + localzt5.b());
                localzo1.b(localzo1.e() + f5);
                localObject17 = (String)((ArrayList)localObject2).get(2);
                paramzr.a((String)localObject17, ((zqy)localObject7).a().h(), new zu(((zqy)localObject7).a().j()), localzo1);
              }
            }
          }
        }
        else
        {
          str1 = localzbxg.r().s();
          if (localzbxg.r().B())
          {
            localObject1 = localzbxg.r();
            localObject2 = new zt(localzbxg.d().e().a(), localzbxg.d().e().b());
            localObject3 = new zs(((zqy)localObject1).a().l(), ((zqy)localObject1).a().m());
            localObject5 = new com.aspose.cells.b.a.b.zp((int)localzbxg.a.d() - ((zs)localObject3).b() - 8, (int)localzbxg.a.e() - ((zs)localObject3).c() / 2, ((zs)localObject3).b(), ((zs)localObject3).c());
            if (i != 0) {
              localObject5 = new com.aspose.cells.b.a.b.zp((int)localzbxg.a.d() - ((zs)localObject3).b() / 2, (int)localzbxg.a.e() + 10, ((zs)localObject3).b(), ((zs)localObject3).c());
            }
            ((zqy)localObject1).a().b = new com.aspose.cells.b.a.b.zp(((com.aspose.cells.b.a.b.zp)localObject5).c(), ((com.aspose.cells.b.a.b.zp)localObject5).d(), ((com.aspose.cells.b.a.b.zp)localObject5).e(), ((com.aspose.cells.b.a.b.zp)localObject5).f());
            ((zqy)localObject1).a().z();
            localObject6 = new zq(((zqy)localObject1).a().a.c(), ((zqy)localObject1).a().a.d(), ((zqy)localObject1).a().l(), ((zqy)localObject1).a().a.f());
            a(paramzr, (zq)localObject6, (zqy)localObject1);
          }
          else if (!"".equals(str1))
          {
            localObject1 = localzbxg.r();
            localObject2 = new zt(localzbxg.d().e().a(), localzbxg.d().e().b());
            localObject3 = zbvy.a(paramzr, str1, ((zqy)localObject1).n(), ((zqy)localObject1).a().h(), (zt)localObject2, ((zqy)localObject1).o(), ((zqy)localObject1).q(), ((zqy)localObject1).v());
            localObject5 = new com.aspose.cells.b.a.b.zp((int)localzbxg.a.d() - ((zs)localObject3).b() - 8, (int)localzbxg.a.e() - ((zs)localObject3).c() / 2, ((zs)localObject3).b(), ((zs)localObject3).c());
            if (i != 0) {
              localObject5 = new com.aspose.cells.b.a.b.zp((int)localzbxg.a.d() - ((zs)localObject3).b() / 2, (int)localzbxg.a.e() + 10, ((zs)localObject3).b(), ((zs)localObject3).c());
            }
            ((zqy)localObject1).a().b = new com.aspose.cells.b.a.b.zp(((com.aspose.cells.b.a.b.zp)localObject5).c(), ((com.aspose.cells.b.a.b.zp)localObject5).d(), ((com.aspose.cells.b.a.b.zp)localObject5).e(), ((com.aspose.cells.b.a.b.zp)localObject5).f());
            ((zqy)localObject1).a().z();
            localObject6 = new zq(((zqy)localObject1).a().a.c(), ((zqy)localObject1).a().a.d(), ((zqy)localObject1).a().a.e(), ((zqy)localObject1).a().a.f());
            localObject7 = new zq[] { localObject6 };
            localzbxg.d().e().a((zq[])localObject7);
            localObject6 = localObject7[0];
            localObject8 = localObject6;
            ((zq)localObject8).a(0.0F, 4.0F);
            ((zqy)localObject1).a().c().a((zq)localObject8);
            ((zqy)localObject1).a().d().a((zq)localObject8);
            zra.a(paramzbfd.v(), (zqy)localObject1, com.aspose.cells.b.a.b.zp.a((zq)localObject6), str1, ((zqy)localObject1).n(), ((zqy)localObject1).a().h(), ((zqy)localObject1).a().j(), ((zqy)localObject1).o(), ((zqy)localObject1).q());
          }
        }
      }
    }
  }
  
  private static boolean a(zbxg paramzbxg)
  {
    double[] arrayOfDouble = paramzbxg.s();
    if ((arrayOfDouble.length == 2) && (arrayOfDouble[0] == 0.0D)) {
      return true;
    }
    return (arrayOfDouble.length >= 2) && (arrayOfDouble[0] == 0.0D) && (arrayOfDouble[1] == 0.0D);
  }
  
  private static void a(zr paramzr, zq paramzq, zqy paramzqy)
    throws Exception
  {
    zbcw localzbcw = new zbcw();
    localzbcw.a(zbvy.a(paramzqy.o()));
    localzbcw.b(zbvy.a(paramzqy.q()));
    zbde localzbde = new zbde(paramzq, localzbcw, paramzqy.u(), paramzqy.a().h(), paramzqy.A());
    localzbde.b(paramzr, paramzqy.a().a().at());
  }
  
  private static String[] a(zjf paramzjf, double[] paramArrayOfDouble, zbxg paramzbxg)
  {
    int i = 1;
    String str = "0.0000";
    if (!"".equals(paramzbxg.r().p()))
    {
      str = paramzbxg.r().p();
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
      double d;
      if (i != 0)
      {
        d = Math.abs(paramArrayOfDouble[j]);
        if ((d > 10.0D) && (d < 100.0D)) {
          str = "0.000";
        } else if ((d > 100.0D) && (d < 1000.0D)) {
          str = "0.00";
        } else if ((d > 1000.0D) && (d < 10000.0D)) {
          str = "0.0";
        } else if (d > 10000.0D) {
          str = "0";
        }
      }
      arrayOfString1[j] = zgy.a(paramzjf.an(), Double.valueOf(Math.abs(paramArrayOfDouble[j])), str);
      if (i != 0)
      {
        d = zbxz.a(arrayOfString1[j], paramzjf.an());
        String[] arrayOfString2;
        int k;
        if (d == 0.0D)
        {
          arrayOfString1[j] = com.aspose.cells.a.c.zp.a(Math.abs(paramArrayOfDouble[j]), "0.00E+00");
          arrayOfString2 = zw.d(arrayOfString1[j], 'E');
          if (arrayOfString2.length > 1)
          {
            arrayOfString1[j] = (a(arrayOfString2[0]) + "E");
            for (k = 1; k < arrayOfString2.length; tmp306_304++)
            {
              int tmp306_304 = j;
              String[] tmp306_302 = arrayOfString1;
              tmp306_302[tmp306_304] = (tmp306_302[tmp306_304] + arrayOfString2[tmp306_304]);
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
            for (tmp306_304 = 1; tmp306_304 < arrayOfString2.length; tmp306_304++)
            {
              int tmp432_430 = j;
              String[] tmp432_428 = arrayOfString1;
              tmp432_428[tmp432_430] = (tmp432_428[tmp432_430] + arrayOfString2[tmp306_304]);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */