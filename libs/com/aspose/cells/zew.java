package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zew
{
  static ArrayList a(zr paramzr, zbfd paramzbfd, zp paramzp, float paramFloat, double paramDouble, int paramInt, boolean paramBoolean)
    throws Exception
  {
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    zq localzq = paramzr.e();
    paramzr.a(4, true);
    paramzr.a(paramzp);
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
    zbff localzbff = localzjf.z();
    int j = localzbff.getCount();
    double d1 = localzbt1.n() ? localzbt1.g(localzbt1.D()) : localzbt1.D();
    double d2 = localzbt1.n() ? localzbt1.g(localzbt1.z()) : localzbt1.z();
    paramDouble = localzbt1.n() ? localzbt1.g(paramDouble) : paramDouble;
    double d3 = localzbt2.n() ? localzbt2.g(localzbt2.D()) : localzbt2.D();
    double d4 = localzbt2.n() ? localzbt2.g(localzbt2.z()) : localzbt2.z();
    double d5 = localzbt2.n() ? localzbt2.g(localzbt2.x()) : localzbt2.x();
    ArrayList localArrayList = new ArrayList();
    double d6 = paramzp.e() / (d4 - d3);
    double d7 = a(localzbff, d1, d2, d3, d4);
    int k = paramzbfd.ak();
    zkh localzkh = paramzbfd.F();
    for (int m = 0; m < paramInt; m++)
    {
      zkf localzkf = localzkh.b(m);
      if ((localzkf != null) && (!localzkf.a()) && (!localzkf.b()))
      {
        double d8 = (float)d6 * (localzkf.q() - d3);
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
            double d14 = localzuc1.e().size() > m ? localzuc1.a(localzuc1.e().get(m)) : 0.0D;
            d12 = d14;
            d14 = localzuc1.f().size() > m ? localzuc1.a(localzuc1.f().get(m)) : 0.0D;
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
            double d15 = localzuc2.e().size() > m ? localzuc2.a(localzuc2.e().get(m)) : 0.0D;
            d12 = d15;
            d15 = localzuc2.f().size() > m ? localzuc2.a(localzuc2.f().get(m)) : 0.0D;
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
          float f3 = 0.0F;
          boolean bool = false;
          Object localObject;
          if ((localzkf.w() <= d2) && (localzkf.w() >= d1) && (localzkf.q() <= d4) && (localzkf.q() >= d3))
          {
            localObject = new float[] { f3 };
            bool = a(paramzr, localzo2, paramzbfd, localzkf, d7, (int)a(paramzp.b()), (float[])localObject);
            f3 = localObject[0];
          }
          if ((bool) || (localzjf.ak()))
          {
            localObject = new Object[4];
            localObject[0] = Integer.valueOf(k);
            localObject[1] = Integer.valueOf(m);
            localObject[2] = localzo2;
            localObject[3] = localzbt2;
            localzkf.a = f3;
            com.aspose.cells.b.a.a.zf.a(localArrayList, localObject);
          }
        }
      }
    }
    paramzr.a(localzf);
    return localArrayList;
  }
  
  private static boolean a(zr paramzr, zo paramzo, zbfd paramzbfd, zkf paramzkf, double paramDouble, int paramInt, float[] paramArrayOfFloat)
    throws Exception
  {
    double d2 = paramzkf.C();
    float f = paramzbfd.ab() / 100.0F;
    int i = paramzbfd.ad();
    boolean bool = paramzbfd.ac();
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
    zq localzq = new zq(paramzo.d() - (float)d1, paramzo.e() - (float)d1, zbxz.a(2.0F * (float)d1), zbxz.a(2.0F * (float)d1));
    paramzkf.a(new zq(paramzo.d(), paramzo.e(), (float)d1, (float)d1));
    ze localze = new ze();
    localze.a(localzq);
    if (paramzkf.i().h() != 0) {
      if (paramzkf.C() > 0.0D) {
        paramzkf.i().a(localze);
      } else {
        paramzr.a(new zu(Color.getWhite()), localzq);
      }
    }
    paramzkf.k().a(localze);
    paramArrayOfFloat[0] = localzq.h();
    return true;
  }
  
  private static double a(zbff paramzbff, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    double d1 = 0.0D;
    for (int i = 0; i < paramzbff.getCount(); i++)
    {
      zbfd localzbfd = paramzbff.c(i);
      boolean bool = localzbfd.ac();
      if ((localzbfd.m() == 12) || (localzbfd.m() == 13))
      {
        zkh localzkh = localzbfd.F();
        for (int j = 0; j < localzkh.getCount(); j++)
        {
          zkf localzkf = localzkh.b(j);
          if ((localzkf != null) && (!localzkf.a()))
          {
            double d2 = localzkf.C();
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
  
  static float a(zs paramzs)
  {
    return a(new zt(paramzs.b(), paramzs.c()));
  }
  
  static float a(zt paramzt)
  {
    float f = paramzt.b() > paramzt.c() ? paramzt.c() : paramzt.b();
    return f / 8.0F;
  }
  
  static void a(boolean paramBoolean1, zr paramzr, zbff paramzbff, zp paramzp, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9)
    throws Exception
  {
    zjf localzjf = paramzbff.c(0).v();
    zbt localzbt1 = localzjf.e();
    zbt localzbt2 = localzjf.G();
    double d1 = localzbt2.D();
    double d2 = localzbt2.z();
    double d3 = localzbt2.x();
    double d4 = localzbt1.D();
    double d5 = localzbt1.z();
    double d6 = localzbt1.x();
    double d7 = (d5 - d4) / 2.0D;
    double d8 = d7;
    double d9 = (d2 - d1) / 2.0D;
    double d10 = d9;
    double[] arrayOfDouble1 = { d7 };
    double[] arrayOfDouble2 = { d8 };
    double[] arrayOfDouble3 = { d9 };
    double[] arrayOfDouble4 = { d10 };
    a(paramzbff, paramInt, arrayOfDouble1, arrayOfDouble2, arrayOfDouble3, arrayOfDouble4);
    d7 = arrayOfDouble1[0];
    d8 = arrayOfDouble2[0];
    d9 = arrayOfDouble3[0];
    d10 = arrayOfDouble4[0];
    double d11 = a(paramzp.b());
    float f = paramzbff.c(0).ab() / 100.0F;
    d11 *= f;
    double d12 = d11 * (d5 - d4) / paramzp.e();
    double d13 = d11 * (d2 - d1) / paramzp.f();
    ArrayList localArrayList;
    int i;
    double d17;
    double d18;
    if (!localzbt2.n())
    {
      localArrayList = localzbt2.l;
      i = 0;
      if ((paramBoolean9) && (d10 - d13 <= d1))
      {
        d1 = zbxz.b(d1, d3);
        com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d1));
        d13 = d11 * (d2 - d1) / paramzp.f();
        i = 1;
      }
      if ((paramBoolean8) && (d9 + d13 >= d2))
      {
        d2 = zbxz.c(d2, d3);
        localArrayList.add(0, Double.valueOf(d2));
        d13 = d11 * (d2 - d1) / paramzp.f();
        i = 1;
      }
      if ((paramBoolean6) && (localzbt2.l.size() > 11))
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
          int i1 = a(paramBoolean8, paramBoolean9, d17, d18);
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
            for (d21 = -d19; (d21 > d18) || (zbxz.b(d18, d21) < d19); d21 -= d19)
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
          if (paramBoolean8) {
            localzbt2.d(((Double)localArrayList.get(0)).doubleValue());
          }
          if (paramBoolean9) {
            localzbt2.f(((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue());
          }
          if (paramBoolean6) {
            localzbt2.c(d3);
          }
          if (paramBoolean7) {
            localzbt2.e(d3 / 5.0D);
          }
        }
        zbv.a(paramzr, localzbt2, paramzbff.c(0), false);
      }
    }
    if (!localzbt1.n())
    {
      localArrayList = localzbt1.l;
      i = 0;
      if ((paramBoolean5) && (d8 - d12 <= d4))
      {
        d4 = zbxz.b(d4, d6);
        com.aspose.cells.b.a.a.zf.a(localArrayList, Double.valueOf(d4));
        d12 = d11 * (d5 - d4) / paramzp.e();
        i = 1;
      }
      if ((paramBoolean4) && (d7 + d12 >= d5))
      {
        d5 = zbxz.c(d5, d6);
        localArrayList.add(0, Double.valueOf(d5));
        d12 = d11 * (d5 - d4) / paramzp.e();
        i = 1;
      }
      if (paramBoolean1)
      {
        int j;
        double d16;
        if (paramBoolean5)
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
        if (paramBoolean4)
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
      }
      if ((paramBoolean2) && (localArrayList.size() > 11))
      {
        i = 1;
        d6 *= 2.0D;
        double d15 = ((Double)localArrayList.get(0)).doubleValue();
        d17 = ((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue();
        d18 = d6;
        int k = zbxz.g(d18);
        localArrayList.clear();
        int m = a(paramBoolean4, paramBoolean5, d15, d17);
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
          for (d20 = -d18; (d20 > d17) || (zbxz.b(d17, d20) < d18); d20 -= d18)
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
          if (paramBoolean4) {
            localzbt1.d(((Double)localArrayList.get(0)).doubleValue());
          }
          if (paramBoolean5) {
            localzbt1.f(((Double)localArrayList.get(localArrayList.size() - 1)).doubleValue());
          }
          if (paramBoolean2) {
            localzbt1.c(d6);
          }
          if (paramBoolean3) {
            localzbt1.e(d6 / 5.0D);
          }
        }
        zbv.a(paramzr, localzbt1, paramzp, paramzp, paramInt, false, paramzbff.c(0));
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
  
  private static void a(zbff paramzbff, int paramInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double[] paramArrayOfDouble3, double[] paramArrayOfDouble4)
  {
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramzbff.getCount(); k++)
    {
      zkh localzkh = paramzbff.c(k).F();
      for (int m = 0; m < paramInt; m++)
      {
        zkf localzkf = localzkh.b(m);
        if ((localzkf != null) && (!localzkf.b())) {
          if (i == 0)
          {
            paramArrayOfDouble1[0] = localzkf.q();
            paramArrayOfDouble2[0] = paramArrayOfDouble1[0];
            i = 1;
          }
          else
          {
            if (localzkf.q() > paramArrayOfDouble1[0]) {
              paramArrayOfDouble1[0] = localzkf.q();
            }
            if (localzkf.q() < paramArrayOfDouble2[0]) {
              paramArrayOfDouble2[0] = localzkf.q();
            }
          }
        }
        if ((localzkf != null) && (!localzkf.a())) {
          if (j == 0)
          {
            paramArrayOfDouble3[0] = localzkf.w();
            paramArrayOfDouble4[0] = paramArrayOfDouble3[0];
            j = 1;
          }
          else
          {
            if (localzkf.w() > paramArrayOfDouble3[0]) {
              paramArrayOfDouble3[0] = localzkf.w();
            }
            if (localzkf.w() < paramArrayOfDouble4[0]) {
              paramArrayOfDouble4[0] = localzkf.w();
            }
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */