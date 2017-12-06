package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;
import java.util.List;

final class zbzu
{
  static ArrayList a(zr paramzr, zbfd paramzbfd, zp paramzp, float paramFloat, double paramDouble, int paramInt, boolean paramBoolean)
    throws Exception
  {
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
    double d3 = localzbt2.n() ? localzbt2.g(localzbt2.D()) : localzbt2.D();
    double d4 = localzbt2.n() ? localzbt2.g(localzbt2.z()) : localzbt2.z();
    boolean bool = paramzbfd.N();
    zanr localzanr1 = paramzbfd.Q();
    zanr localzanr2 = paramzbfd.R();
    zjy localzjy1 = paramzbfd.U();
    zjy localzjy2 = paramzbfd.V();
    ArrayList localArrayList1 = new ArrayList();
    double d5 = d4 - d3;
    int j = paramInt;
    if ((localzbt2.p) && (!localzbt2.q))
    {
      j = (int)localzbt2.z();
      if (localzbt2.f()) {
        d5 = d4 - d3 + 1.0D;
      }
      if ((localzbt2.u) && (!localzbt2.f())) {
        d5 += 0.5D;
      }
    }
    double d6 = paramzp.e() / d5;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    zkh localzkh = paramzbfd.F();
    for (int k = 0; k < j; k++)
    {
      zkf localzkf = localzkh.b(k);
      if ((localzkf != null) && (!localzkf.a()) && (!localzkf.b()))
      {
        double d7 = localzkf.q();
        if (localzbt2.k() == 2) {
          d7 = zbv.a(localzbt2.j(), ze.f(Double.valueOf(d7)), localzjf.U());
        }
        double d8 = (float)d6 * (d7 - d3);
        if (localzbt2.f()) {
          d8 += (float)d6 / 2.0F;
        }
        if (localzbt2.p()) {
          d8 = paramzp.c() + paramzp.e() - d8;
        } else {
          d8 = paramzp.c() + d8;
        }
        double d9 = paramFloat;
        double d10 = localzkf.w();
        double d11 = (d10 - paramDouble) / (d2 - d1) * paramzp.f();
        zuc localzuc1 = paramzbfd.y();
        zo localzo1 = new zo((float)d8, paramFloat);
        double d12 = 0.0D;
        double d13 = 0.0D;
        float f1 = 0.0F;
        float f2 = 0.0F;
        if (localzuc1 != null)
        {
          switch (localzuc1.g())
          {
          case 1: 
            d12 = localzuc1.c();
            d13 = d12;
            break;
          case 2: 
            d12 = localzuc1.c() * localzkf.q() / 100.0D;
            d13 = -d12;
            break;
          case 0: 
            double d14 = localzuc1.e().size() > k ? localzuc1.a(localzuc1.e().get(k)) : 0.0D;
            d12 = d14;
            d14 = localzuc1.f().size() > k ? localzuc1.a(localzuc1.f().get(k)) : 0.0D;
            d13 = d14;
          }
          f1 = (float)(d12 / (d4 - d3) * paramzp.e());
          f2 = (float)(d13 / (d4 - d3) * paramzp.e());
          if (!localzbt1.p()) {
            localzo1.b(localzo1.e() - (float)d11);
          } else {
            localzo1.b(localzo1.e() + (float)d11);
          }
        }
        localzuc1.a(localzo1, f1, f2);
        zuc localzuc2 = paramzbfd.x();
        d12 = 0.0D;
        d13 = 0.0D;
        f1 = 0.0F;
        f2 = 0.0F;
        if ((localzuc2 != null) && (localzuc2.d() != 2) && (!localzkf.e()))
        {
          switch (localzuc2.g())
          {
          case 1: 
            d12 = localzuc2.c();
            d13 = d12;
            break;
          case 2: 
            d12 = localzuc2.c() * localzkf.w() / 100.0D;
            d13 = -d12;
            break;
          case 0: 
            double d15 = localzuc2.e().size() > k ? localzuc2.a(localzuc2.e().get(k)) : 0.0D;
            d12 = d15;
            d15 = localzuc2.f().size() > k ? localzuc2.a(localzuc2.f().get(k)) : 0.0D;
            d13 = d15;
            break;
          case 4: 
            d12 = localzuc2.a(paramzbfd.F(), paramInt);
            d13 = d12;
          }
          f1 = (float)d12 / (float)(d2 - d1) * paramzp.f();
          f2 = (float)d13 / (float)(d2 - d1) * paramzp.f();
        }
        localzuc2.a(localzo1, f1, f2);
        if (!paramBoolean)
        {
          if (!localzbt1.p()) {
            d9 -= d11;
          } else {
            d9 += d11;
          }
          zo localzo2 = new zo((float)d8, (float)d9);
          zf.a(localArrayList2, localzo2);
          zf.a(localArrayList3, Integer.valueOf(k));
          zqy localzqy = localzkf.o();
          int m = localzbt2.n() ? zbxz.g(((Double)localzkf.s()).doubleValue()) : 0;
          int n = localzbt1.n() ? zbxz.g(((Double)localzkf.y()).doubleValue()) : 0;
          int i1 = 1;
          int i2 = 1;
          if (localzbt2.p)
          {
            if (((localzbt2.n()) && (zbxz.a(localzbt2.h(localzkf.q()), m) <= zbxz.a(localzbt2.h(d4 + 0.5D), m)) && (zbxz.a(localzbt2.h(localzkf.q()), m) >= zbxz.a(localzbt2.h(d3 - 0.5D), m))) || ((!localzbt2.n()) && (localzkf.q() <= d4 + 0.5D) && (localzkf.q() >= d3 - 0.5D))) {
              i1 = 0;
            }
          }
          else if (((localzbt2.n()) && (zbxz.a(localzbt2.h(localzkf.q()), m) <= zbxz.a(localzbt2.h(d4), m)) && (zbxz.a(localzbt2.h(localzkf.q()), m) >= zbxz.a(localzbt2.h(d3), m))) || ((!localzbt2.n()) && (localzkf.q() <= d4) && (localzkf.q() >= d3))) {
            i1 = 0;
          }
          if (((localzbt1.n()) && (zbxz.a(localzbt1.h(localzkf.w()), n) <= zbxz.a(localzbt1.h(d2), n)) && (zbxz.a(localzbt1.h(localzkf.w()), n) >= zbxz.a(localzbt1.h(d1), n))) || ((!localzbt1.n()) && (localzkf.w() <= d2) && (localzkf.w() >= d1))) {
            i2 = 0;
          }
          if ((localzqy.z()) && ((localzjf.ak()) || ((i1 == 0) && (i2 == 0))))
          {
            Object[] arrayOfObject = new Object[4];
            arrayOfObject[0] = Integer.valueOf(paramzbfd.ak());
            arrayOfObject[1] = Integer.valueOf(k);
            arrayOfObject[2] = localzo2;
            arrayOfObject[3] = localzbt2;
            zf.a(localArrayList1, arrayOfObject);
          }
        }
      }
      else
      {
        zf.a(localArrayList2, null);
        zf.a(localArrayList3, Integer.valueOf(k));
      }
    }
    if (paramBoolean) {
      return null;
    }
    zlr.a(paramzr, paramzbfd, localArrayList2, localArrayList3, paramzp);
    a(paramzr, paramzbfd, localArrayList2, paramzp);
    return localArrayList1;
  }
  
  static void a(zr paramzr, zbfd paramzbfd, List paramList, zp paramzp)
    throws Exception
  {
    paramzp = new zp(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    paramzp.a(1, 1);
    for (int i = 0; i < paramList.size(); i++)
    {
      Object localObject = paramList.get(i);
      if (localObject != null)
      {
        zkf localzkf = paramzbfd.F().b(i);
        if ((localzkf == null) || ((!localzkf.d()) && (!localzkf.z()) && (!localzkf.c())))
        {
          zo localzo = (zo)localObject;
          if ((localzo.d() >= paramzp.c()) && (localzo.e() >= paramzp.d()) && (localzo.d() <= paramzp.i()) && (localzo.e() <= paramzp.j()) && (localzkf.m().g())) {
            localzkf.m().a(localzo.d(), localzo.e());
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */