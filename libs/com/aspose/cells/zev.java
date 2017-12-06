package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zev
{
  static ArrayList a(zr paramzr, zbfc paramzbfc, zp paramzp, float paramFloat, double paramDouble, int paramInt)
    throws Exception
  {
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    zq localzq = paramzr.e();
    paramzr.a(paramzp);
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
    zbfe localzbfe = localzje.z();
    int j = localzbfe.getCount();
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    double d3 = localzbs2.n() ? zbxz.e(localzbs2.D()) : localzbs2.D();
    double d4 = localzbs2.n() ? zbxz.e(localzbs2.z()) : localzbs2.z();
    double d5 = localzbs2.n() ? zbxz.e(localzbs2.x()) : localzbs2.x();
    ArrayList localArrayList1 = new ArrayList();
    double d6 = paramzp.e() / (d4 - d3);
    double d7 = a(localzbfe);
    int k = paramzbfc.ai();
    ArrayList localArrayList2 = new ArrayList();
    zkg localzkg = paramzbfc.D();
    for (int m = 0; m < paramInt; m++)
    {
      zke localzke = localzkg.b(m);
      if ((localzke != null) && (!localzke.a()))
      {
        if ((!localzke.b()) && (localzke.w() <= d2) && (localzke.w() >= d1) && (localzke.q() <= d4) && (localzke.q() >= d3))
        {
          double d8 = (float)d6 * (localzke.q() - d3);
          if (localzbs2.p()) {
            d8 = paramzp.c() + paramzp.e() - d8;
          } else {
            d8 = paramzp.c() + d8;
          }
          double d9 = paramFloat;
          double d10 = localzke.w();
          double d11 = (d10 - paramDouble) / (d2 - d1) * paramzp.f();
          zub localzub1 = paramzbfc.y();
          zo localzo1 = new zo((float)d8, paramFloat);
          double d12 = 0.0D;
          double d13 = 0.0D;
          float f1 = 0.0F;
          float f2 = 0.0F;
          if (localzub1 != null)
          {
            switch (localzub1.g())
            {
            case 1: 
              d12 = localzub1.c();
              d13 = d12;
              break;
            case 2: 
              d12 = localzub1.c() * localzke.q() / 100.0D;
              d13 = -d12;
              break;
            case 0: 
              double d14 = localzub1.e().size() > m ? localzub1.a(localzub1.e().get(m)) : 0.0D;
              d12 = d14;
              d14 = localzub1.f().size() > m ? localzub1.a(localzub1.f().get(m)) : 0.0D;
              d13 = d14;
            }
            f1 = (float)(d12 / (d4 - d3) * paramzp.e());
            f2 = (float)(d13 / (d4 - d3) * paramzp.e());
            if (!localzbs1.p()) {
              localzo1.b(localzo1.e() - (float)d11);
            } else {
              localzo1.b(localzo1.e() + (float)d11);
            }
          }
          localzub1.a(localzo1, f1, f2);
          zub localzub2 = paramzbfc.x();
          d12 = 0.0D;
          d13 = 0.0D;
          f1 = 0.0F;
          f2 = 0.0F;
          if (localzub2 != null)
          {
            switch (localzub2.g())
            {
            case 1: 
              d12 = localzub2.c();
              d13 = d12;
              break;
            case 2: 
              d12 = localzub2.c() * localzke.w() / 100.0D;
              d13 = -d12;
              break;
            case 0: 
              double d15 = localzub2.e().size() > m ? localzub2.a(localzub2.e().get(m)) : 0.0D;
              d12 = d15;
              d15 = localzub2.f().size() > m ? localzub2.a(localzub2.f().get(m)) : 0.0D;
              d13 = d15;
            }
            f1 = (float)d12 / (float)(d2 - d1) * paramzp.f();
            f2 = (float)d13 / (float)(d2 - d1) * paramzp.f();
          }
          localzub2.a(localzo1, f1, f2);
          if (!localzbs1.p()) {
            d9 -= d11;
          } else {
            d9 += d11;
          }
          zo localzo2 = new zo((float)d8, (float)d9);
          float f3 = 0.0F;
          float[] arrayOfFloat = { f3 };
          boolean bool = a(paramzr, localzo2, paramzbfc, localzke, d7, (int)a(paramzp), arrayOfFloat);
          f3 = arrayOfFloat[0];
          if (bool)
          {
            Object[] arrayOfObject = new Object[4];
            arrayOfObject[0] = Integer.valueOf(k);
            arrayOfObject[1] = Integer.valueOf(m);
            arrayOfObject[2] = localzo2;
            arrayOfObject[3] = localzbs2;
            localzke.a = f3;
            com.aspose.cells.b.a.a.zf.a(localArrayList1, arrayOfObject);
          }
        }
      }
      else {
        com.aspose.cells.b.a.a.zf.a(localArrayList2, null);
      }
    }
    paramzr.a(localzf);
    return localArrayList1;
  }
  
  private static boolean a(zr paramzr, zo paramzo, zbfc paramzbfc, zke paramzke, double paramDouble, int paramInt, float[] paramArrayOfFloat)
    throws Exception
  {
    double d2 = paramzke.C();
    float f = paramzbfc.Z() / 100.0F;
    int i = paramzbfc.ab();
    boolean bool = paramzbfc.aa();
    if (d2 == 0.0D) {
      return false;
    }
    if (bool) {
      d2 = Math.abs(d2);
    } else if (d2 < 0.0D) {
      return false;
    }
    double d3 = 0.0D;
    double d1;
    if (i == 0)
    {
      d3 = 3.141592653589793D * Math.pow(paramInt, 2.0D) / paramDouble;
      d1 = Math.sqrt(d2 * d3 / 3.141592653589793D);
    }
    else
    {
      d3 = 2 * paramInt / paramDouble;
      d1 = d2 * d3 / 2.0D;
    }
    d1 *= f;
    zq localzq = new zq(paramzo.d() - (float)d1, paramzo.e() - (float)d1, 2.0F * (float)d1, 2.0F * (float)d1);
    paramzke.a(new zq(paramzo.d(), paramzo.e(), (float)d1, (float)d1));
    if (paramzke.i().h() != 0) {
      if (paramzke.C() > 0.0D)
      {
        localObject1 = zbd.a(paramzke.i(), localzq);
        try
        {
          paramzr.a((zc)localObject1, localzq);
        }
        finally
        {
          if (localObject1 != null) {
            ((zc)localObject1).f();
          }
        }
      }
      else
      {
        localObject1 = new zu(Color.getWhite());
        try
        {
          paramzr.a((zc)localObject1, localzq);
        }
        finally
        {
          if (localObject1 != null) {
            ((zc)localObject1).f();
          }
        }
      }
    }
    Object localObject1 = zanv.a(paramzke.k());
    try
    {
      paramzr.a((zs)localObject1, localzq);
    }
    finally
    {
      if (localObject1 != null) {
        ((zs)localObject1).s();
      }
    }
    paramArrayOfFloat[0] = localzq.h();
    return true;
  }
  
  private static double a(zbfe paramzbfe)
  {
    double d1 = 0.0D;
    for (int i = 0; i < paramzbfe.getCount(); i++)
    {
      zbfc localzbfc = paramzbfe.c(i);
      boolean bool = localzbfc.aa();
      if ((localzbfc.m() == 12) || (localzbfc.m() == 13))
      {
        zkg localzkg = localzbfc.D();
        for (int j = 0; j < localzkg.getCount(); j++)
        {
          zke localzke = localzkg.b(j);
          if ((localzke != null) && (!localzke.a()))
          {
            double d2 = localzke.C();
            if (bool) {
              d2 = Math.abs(d2);
            }
            if (d1 < d2) {
              d1 = d2;
            }
          }
        }
      }
    }
    return d1;
  }
  
  static float a(zp paramzp)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    return a(localzq);
  }
  
  static float a(zq paramzq)
  {
    float f = paramzq.h() > paramzq.i() ? paramzq.i() : paramzq.h();
    return f / 8.0F;
  }
  
  static void a(zr paramzr, zbfe paramzbfe, zp paramzp, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8)
    throws Exception
  {
    zje localzje = paramzbfe.c(0).v();
    zbs localzbs2 = localzje.e();
    zbs localzbs1 = localzje.E();
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d3 = localzbs1.n() ? zbxz.e(localzbs1.x()) : localzbs1.x();
    double d4 = localzbs2.n() ? zbxz.e(localzbs2.D()) : localzbs2.D();
    double d5 = localzbs2.n() ? zbxz.e(localzbs2.z()) : localzbs2.z();
    double d6 = localzbs2.n() ? zbxz.e(localzbs2.x()) : localzbs2.x();
    double d7 = (d5 - d4) / 2.0D;
    double d8 = d7;
    double d9 = (d2 - d1) / 2.0D;
    double d10 = d9;
    double[] arrayOfDouble1 = { d7 };
    double[] arrayOfDouble2 = { d8 };
    double[] arrayOfDouble3 = { d9 };
    double[] arrayOfDouble4 = { d10 };
    a(paramzbfe, paramInt, arrayOfDouble1, arrayOfDouble2, arrayOfDouble3, arrayOfDouble4);
    d7 = arrayOfDouble1[0];
    d8 = arrayOfDouble2[0];
    d9 = arrayOfDouble3[0];
    d10 = arrayOfDouble4[0];
    double d11 = a(paramzp);
    float f = paramzbfe.c(0).Z() / 100.0F;
    d11 *= f;
    double d12 = d11 * (d5 - d4) / paramzp.e();
    double d13 = d11 * (d2 - d1) / paramzp.f();
    ArrayList localArrayList;
    int i;
    double d17;
    double d18;
    if (!localzbs1.n())
    {
      localArrayList = localzbs1.l;
      i = 0;
      if ((paramBoolean8) && (d10 - d13 <= d1))
      {
        d1 = zbxz.b(d1, d3);
        com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d1));
        d13 = d11 * (d2 - d1) / paramzp.f();
        i = 1;
      }
      if ((paramBoolean7) && (d9 + d13 >= d2))
      {
        d2 = zbxz.c(d2, d3);
        localArrayList.add(0, Double.valueOf(d2));
        d13 = d11 * (d2 - d1) / paramzp.f();
        i = 1;
      }
      if ((paramBoolean5) && (localzbs1.l.size() > 11))
      {
        double d14 = d3 * 0.35D;
        if ((d10 - d13 - ((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue() < d14) || (((Double)localArrayList.get(0)).doubleValue() - (d9 + d13) < d14))
        {
          i = 1;
          d3 *= 2.0D;
          d17 = ((Double)localArrayList.get(0)).doubleValue();
          d18 = ((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue();
          double d19 = d3;
          int n = zbxz.g(d19);
          localArrayList.clear();
          int i1 = a(paramBoolean7, paramBoolean8, d17, d18);
          double d21;
          if (i1 == 1)
          {
            for (d21 = d17; (d21 > d18) || (zbxz.b(d18, d21) < d19); d21 -= d19)
            {
              d21 = zbxz.a(d21, n);
              com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d21));
            }
          }
          else if (i1 == 2)
          {
            for (d21 = d18; (d21 <= d17) || (zbxz.b(d21, d17) < d19); d21 += d19)
            {
              d21 = zbxz.a(d21, n);
              com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d21));
            }
            Collections.reverse(localArrayList);
          }
          else
          {
            for (d21 = 0.0D; (d21 <= d17) || (zbxz.b(d21, d17) < d19); d21 += d19)
            {
              d21 = zbxz.a(d21, n);
              com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d21));
            }
            Collections.reverse(localArrayList);
            for (d21 = 0.0D; (d21 > d18) || (zbxz.b(d18, d21) < d19); d21 -= d19)
            {
              d21 = zbxz.a(d21, n);
              com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d21));
            }
          }
        }
      }
      if (i != 0)
      {
        if (localArrayList.size() >= 2)
        {
          if (paramBoolean7) {
            localzbs1.d(((Double)localArrayList.get(0)).doubleValue());
          }
          if (paramBoolean8) {
            localzbs1.f(((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue());
          }
          if (paramBoolean5) {
            localzbs1.c(d3);
          }
          if (paramBoolean6) {
            localzbs1.e(d3 / 5.0D);
          }
        }
        zbu.a(paramzr, localzbs1, paramzbfe.c(0), false);
      }
    }
    if (!localzbs2.n())
    {
      localArrayList = localzbs2.l;
      i = 0;
      if ((paramBoolean4) && (d8 - d12 <= d4))
      {
        d4 = zbxz.b(d4, d6);
        com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d4));
        d12 = d11 * (d5 - d4) / paramzp.e();
        i = 1;
      }
      if ((paramBoolean3) && (d7 + d12 >= d5))
      {
        d5 = zbxz.c(d5, d6);
        localArrayList.add(0, Double.valueOf(d5));
        d12 = d11 * (d5 - d4) / paramzp.e();
        i = 1;
      }
      int j;
      double d16;
      if (paramBoolean4)
      {
        j = zbxz.g(d6);
        if ((d8 - d12 - (d7 + d12)) / (d4 - (d7 + d12)) > 0.9523809523809523D)
        {
          d16 = zbxz.a(d4 - d6, j);
          com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d16));
          d4 = d16;
          d12 = d11 * (d5 - d4) / paramzp.e();
          i = 1;
        }
      }
      if (paramBoolean3)
      {
        j = zbxz.g(d6);
        if ((d7 + d12 - (d8 - d12)) / (d5 - (d8 - d12)) > 0.9523809523809523D)
        {
          d16 = zbxz.a(d5 + d6, j);
          localArrayList.add(0, Double.valueOf(d16));
          d5 = d16;
          d12 = d11 * (d5 - d4) / paramzp.e();
          i = 1;
        }
      }
      if ((paramBoolean1) && (localArrayList.size() > 11))
      {
        i = 1;
        d6 *= 2.0D;
        double d15 = ((Double)localArrayList.get(0)).doubleValue();
        d17 = ((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue();
        d18 = d6;
        int k = zbxz.g(d18);
        localArrayList.clear();
        int m = a(paramBoolean3, paramBoolean4, d15, d17);
        double d20;
        if (m == 1)
        {
          for (d20 = d15; (d20 > d17) || (zbxz.b(d17, d20) < d18); d20 -= d18)
          {
            d20 = zbxz.a(d20, k);
            com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d20));
          }
        }
        else if (m == 2)
        {
          for (d20 = d17; (d20 <= d15) || (zbxz.b(d20, d15) < d18); d20 += d18)
          {
            d20 = zbxz.a(d20, k);
            com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d20));
          }
          Collections.reverse(localArrayList);
        }
        else
        {
          for (d20 = 0.0D; (d20 <= d15) || (zbxz.b(d20, d15) < d18); d20 += d18)
          {
            d20 = zbxz.a(d20, k);
            com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d20));
          }
          Collections.reverse(localArrayList);
          for (d20 = 0.0D; (d20 > d17) || (zbxz.b(d17, d20) < d18); d20 -= d18)
          {
            d20 = zbxz.a(d20, k);
            com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d20));
          }
        }
      }
      if (i != 0)
      {
        if (localArrayList.size() >= 2)
        {
          if (paramBoolean3) {
            localzbs2.d(((Double)localArrayList.get(0)).doubleValue());
          }
          if (paramBoolean4) {
            localzbs2.f(((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue());
          }
          if (paramBoolean1) {
            localzbs2.c(d6);
          }
          if (paramBoolean2) {
            localzbs2.e(d6 / 5.0D);
          }
        }
        zbu.a(paramzr, localzbs2, paramzp, paramInt, false, paramzbfe.c(0));
      }
    }
  }
  
  private static int a(boolean paramBoolean1, boolean paramBoolean2, double paramDouble1, double paramDouble2)
  {
    int i = 2;
    if ((paramBoolean1) && (paramBoolean2))
    {
      i = 3;
      if (paramDouble1 == 0.0D) {
        i = 2;
      }
      if (paramDouble2 == 0.0D) {
        i = 1;
      }
    }
    else if ((!paramBoolean1) && (paramBoolean2))
    {
      i = 1;
    }
    else if ((paramBoolean1) && (!paramBoolean2))
    {
      i = 2;
    }
    else
    {
      i = 2;
    }
    return i;
  }
  
  private static void a(zbfe paramzbfe, int paramInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double[] paramArrayOfDouble3, double[] paramArrayOfDouble4)
  {
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramzbfe.getCount(); k++)
    {
      zkg localzkg = paramzbfe.c(k).D();
      for (int m = 0; m < paramInt; m++)
      {
        zke localzke = localzkg.b(m);
        if ((localzke != null) && (!localzke.b())) {
          if (i == 0)
          {
            paramArrayOfDouble1[0] = localzke.q();
            paramArrayOfDouble2[0] = paramArrayOfDouble1[0];
            i = 1;
          }
          else
          {
            if (localzke.q() > paramArrayOfDouble1[0]) {
              paramArrayOfDouble1[0] = localzke.q();
            }
            if (localzke.q() < paramArrayOfDouble2[0]) {
              paramArrayOfDouble2[0] = localzke.q();
            }
          }
        }
        if ((localzke != null) && (!localzke.a())) {
          if (j == 0)
          {
            paramArrayOfDouble3[0] = localzke.w();
            paramArrayOfDouble4[0] = paramArrayOfDouble3[0];
            j = 1;
          }
          else
          {
            if (localzke.w() > paramArrayOfDouble3[0]) {
              paramArrayOfDouble3[0] = localzke.w();
            }
            if (localzke.w() < paramArrayOfDouble4[0]) {
              paramArrayOfDouble4[0] = localzke.w();
            }
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */