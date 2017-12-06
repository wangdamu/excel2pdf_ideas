package com.aspose.cells;

import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zbu
{
  private static int a = 34;
  private static double b = 1.0E-10D;
  private static float c = 0.01F;
  
  static void a(zr paramzr, zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp, boolean paramBoolean, zbfc paramzbfc)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if ((!paramzbs.s().e()) && (!paramzbs.u().e())) {
      return;
    }
    int i = 0;
    if (paramBoolean)
    {
      if ((paramzbs.d() == 0) || (paramzbs.d() == 2)) {
        i = paramzp.f();
      } else {
        i = paramzp.e();
      }
    }
    else if ((paramzbs.d() == 0) || (paramzbs.d() == 2)) {
      i = paramzp.e();
    } else {
      i = paramzp.f();
    }
    double d1 = 0.0D;
    int j = (paramzbs.k() == 2) && ((paramzbs.d() == 0) || (paramzbs.d() == 2)) ? 1 : 0;
    double d2 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
    double d5 = paramzbs.n() ? zbxz.e(paramzbs.x()) : paramzbs.x();
    double d3;
    double d4;
    if ((!paramzbfc.aw()) && ((paramzbs.d() == 0) || (paramzbs.d() == 2)))
    {
      d3 = (int)paramzbs.z();
      d4 = (int)paramzbs.D();
      int k;
      if (j != 0)
      {
        if ((paramzbs.c().e().f()) || (paramzbs.c().u()))
        {
          k = a(paramzbs.j(), (int)d3, (int)d4, paramzbs.c().U()) + 1;
          d2 = a(paramzbs.j(), paramzbs.y(), 1, (int)d2, paramzbs.c().U());
        }
        else
        {
          k = a(paramzbs.j(), (int)d3, (int)d4, paramzbs.c().U());
          if (k == 0) {
            k = 1;
          }
        }
      }
      else if ((paramzbs.c().e().f()) || (paramzbs.c().u()))
      {
        k = (int)d3 - (int)d4 + 1;
        d2 += 1.0D;
      }
      else
      {
        k = (int)d3 - (int)d4;
        if (k == 0) {
          k = 1;
        }
      }
      d1 = i / k;
    }
    else
    {
      d3 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
      d4 = paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D();
      d1 = i / (d3 - d4);
    }
    double d6;
    if ((paramzbs.s().e()) && (d5 > 0.0D))
    {
      d6 = d4;
      while (d6 <= d2)
      {
        double d7;
        if (j != 0)
        {
          int i1 = a(paramzbs.j(), (int)d6, (int)d4, paramzbs.c().U());
          d7 = d1 * i1;
        }
        else
        {
          d7 = d1 * (d6 - d4);
        }
        if ((!paramzbs.c().B().f().f()) || ((d6 != d4) && (d6 != d2))) {
          if (paramBoolean)
          {
            if ((paramzbs.d() == 0) || (paramzbs.d() == 2))
            {
              if (paramzbs.p()) {
                zanv.a(paramzr, paramzp.c(), (float)(paramzp.d() + d7), paramzp.i(), (float)(paramzp.d() + d7), paramzbs.s());
              } else {
                zanv.a(paramzr, paramzp.c(), (float)(paramzp.j() - d7), paramzp.i(), (float)(paramzp.j() - d7), paramzbs.s());
              }
            }
            else if (paramzbs.p()) {
              zanv.a(paramzr, (float)(paramzp.i() - d7), paramzp.d(), (float)(paramzp.i() - d7), paramzp.j(), paramzbs.s());
            } else {
              zanv.a(paramzr, (float)(paramzp.c() + d7), paramzp.d(), (float)(paramzp.c() + d7), paramzp.j(), paramzbs.s());
            }
          }
          else if ((paramzbs.d() == 0) || (paramzbs.d() == 2))
          {
            if (paramzbs.p()) {
              zanv.a(paramzr, (float)(paramzp.i() - d7), paramzp.d(), (float)(paramzp.i() - d7), paramzp.j(), paramzbs.s());
            } else {
              zanv.a(paramzr, (float)(paramzp.c() + d7), paramzp.d(), (float)(paramzp.c() + d7), paramzp.j(), paramzbs.s());
            }
          }
          else if (paramzbs.p()) {
            zanv.a(paramzr, paramzp.c(), (float)(paramzp.d() + d7), paramzp.i(), (float)(paramzp.d() + d7), paramzbs.s());
          } else {
            zanv.a(paramzr, paramzp.c(), (float)(paramzp.j() - d7), paramzp.i(), (float)(paramzp.j() - d7), paramzbs.s());
          }
        }
        if (j != 0) {
          d6 = a(paramzbs.j(), paramzbs.y(), (int)d5, (int)d6, paramzbs.c().U());
        } else if ((!paramzbfc.aw()) && ((paramzbs.d() == 0) || (paramzbs.d() == 2))) {
          d6 += d5 * paramzbs.J();
        } else {
          d6 = zbxz.c(d6, d5);
        }
      }
    }
    int m;
    double d8;
    int i2;
    double d9;
    if (!paramzbs.n())
    {
      d6 = paramzbs.B();
      if ((paramzbs.u().e()) && (d6 > 0.0D))
      {
        m = 0;
        if (j != 0)
        {
          int n = a(paramzbs.j(), paramzbs.y(), (int)d5, (int)d4, paramzbs.c().U());
          m = a(paramzbs.j(), n, (int)d4, paramzbs.c().U());
        }
        d8 = d4;
        while (d8 <= d2)
        {
          i2 = 0;
          if (j != 0)
          {
            int i3 = a(paramzbs.j(), (int)d8, (int)d4, paramzbs.c().U());
            d9 = d1 * i3;
            if ((i3 % m == 0) && (paramzbs.s().e())) {
              i2 = 1;
            }
          }
          else
          {
            d9 = d1 * (d8 - d4);
            if ((zbxz.b(d8, d4) % d5 == 0.0D) && (paramzbs.s().e())) {
              i2 = 1;
            }
          }
          if (((!paramzbs.c().B().f().f()) || ((d8 != d4) && (d8 != d2))) && (i2 == 0)) {
            if (paramBoolean)
            {
              if ((paramzbs.d() == 0) || (paramzbs.d() == 2))
              {
                if (paramzbs.p()) {
                  zanv.a(paramzr, paramzp.c(), (float)(paramzp.d() + d9), paramzp.i(), (float)(paramzp.d() + d9), paramzbs.u());
                } else {
                  zanv.a(paramzr, paramzp.c(), (float)(paramzp.j() - d9), paramzp.i(), (float)(paramzp.j() - d9), paramzbs.u());
                }
              }
              else if (paramzbs.p()) {
                zanv.a(paramzr, (float)(paramzp.i() - d9), paramzp.d(), (float)(paramzp.i() - d9), paramzp.j(), paramzbs.u());
              } else {
                zanv.a(paramzr, (float)(paramzp.c() + d9), paramzp.d(), (float)(paramzp.c() + d9), paramzp.j(), paramzbs.u());
              }
            }
            else if ((paramzbs.d() == 0) || (paramzbs.d() == 2))
            {
              if (paramzbs.p()) {
                zanv.a(paramzr, (float)(paramzp.i() - d9), paramzp.d(), (float)(paramzp.i() - d9), paramzp.j(), paramzbs.u());
              } else {
                zanv.a(paramzr, (float)(paramzp.c() + d9), paramzp.d(), (float)(paramzp.c() + d9), paramzp.j(), paramzbs.u());
              }
            }
            else if (paramzbs.p()) {
              zanv.a(paramzr, paramzp.c(), (float)(paramzp.d() + d9), paramzp.i(), (float)(paramzp.d() + d9), paramzbs.u());
            } else {
              zanv.a(paramzr, paramzp.c(), (float)(paramzp.j() - d9), paramzp.i(), (float)(paramzp.j() - d9), paramzbs.u());
            }
          }
          if (j != 0) {
            d8 = a(paramzbs.j(), paramzbs.C(), (int)d6, (int)d8, paramzbs.c().U());
          } else if ((!paramzbfc.aw()) && ((paramzbs.d() == 0) || (paramzbs.d() == 2))) {
            d8 += d6 * paramzbs.J();
          } else {
            d8 = zbxz.c(d8, d6);
          }
        }
      }
    }
    else
    {
      d6 = paramzbs.B();
      m = zbxz.h(d6);
      d8 = paramzbs.n() ? zbxz.e(d6) : d6;
      if ((paramzbs.u().e()) && (d6 > 0.0D)) {
        for (d9 = d4; d9 <= d2 + d8; d9 = zbxz.c(d9, d8)) {
          for (i2 = 1; i2 <= 10; i2++)
          {
            double d10 = Math.pow(i2, m) * Math.pow(10.0D, d9);
            d10 = zbxz.e(d10);
            if (((i2 != 1) || (d9 == d4)) && (d10 <= d2))
            {
              double d11 = d1 * (d10 - d4);
              if (paramBoolean)
              {
                if ((paramzbs.d() == 0) || (paramzbs.d() == 2))
                {
                  if (paramzbs.p()) {
                    zanv.a(paramzr, paramzp.c(), (float)(paramzp.d() + d11), paramzp.i(), (float)(paramzp.d() + d11), paramzbs.u());
                  } else {
                    zanv.a(paramzr, paramzp.c(), (float)(paramzp.j() - d11), paramzp.i(), (float)(paramzp.j() - d11), paramzbs.u());
                  }
                }
                else if (paramzbs.p()) {
                  zanv.a(paramzr, (float)(paramzp.i() - d11), paramzp.d(), (float)(paramzp.i() - d11), paramzp.j(), paramzbs.u());
                } else {
                  zanv.a(paramzr, (float)(paramzp.c() + d11), paramzp.d(), (float)(paramzp.c() + d11), paramzp.j(), paramzbs.u());
                }
              }
              else if ((paramzbs.d() == 0) || (paramzbs.d() == 2))
              {
                if (paramzbs.p()) {
                  zanv.a(paramzr, (float)(paramzp.i() - d11), paramzp.d(), (float)(paramzp.i() - d11), paramzp.j(), paramzbs.u());
                } else {
                  zanv.a(paramzr, (float)(paramzp.c() + d11), paramzp.d(), (float)(paramzp.c() + d11), paramzp.j(), paramzbs.u());
                }
              }
              else if (paramzbs.p()) {
                zanv.a(paramzr, paramzp.c(), (float)(paramzp.d() + d11), paramzp.i(), (float)(paramzp.d() + d11), paramzbs.u());
              } else {
                zanv.a(paramzr, paramzp.c(), (float)(paramzp.j() - d11), paramzp.i(), (float)(paramzp.j() - d11), paramzbs.u());
              }
            }
          }
        }
      }
    }
  }
  
  static void a(zr paramzr, zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    double d1 = 6.283185307179586D / paramInt;
    double d2 = paramzp.c() + paramzp.e() / 2.0D;
    double d3 = paramzp.d() + paramzp.f() / 2.0D;
    zo localzo1 = new zo((float)d2, (float)d3);
    double d5 = paramzp.e() / 2;
    double d6;
    double d7;
    double d8;
    double d9;
    double d10;
    double d11;
    double d12;
    double d4;
    Object localObject;
    int i;
    double d13;
    double d14;
    zo localzo2;
    double d15;
    double d16;
    if ((paramzbs.c().g) && (paramzbs == paramzbs.c().E()))
    {
      d6 = 0.0D;
      d7 = paramzbs.n() ? zbxz.e(paramzbs.b) : paramzbs.b;
      d8 = paramzbs.n() ? zbxz.e(paramzbs.c) : paramzbs.c;
      d9 = paramzbs.n() ? zbxz.e(paramzbs.d) : paramzbs.d;
      d10 = paramzbs.n() ? zbxz.e(paramzbs.e) : paramzbs.e;
      if (d9 > 0.0D) {
        for (d11 = d8 + d9; d11 <= d7; d11 = zbxz.c(d11, d9))
        {
          d6 = Math.abs(d11 - d8);
          d12 = d5 * d6 / (d7 - d8);
          d4 = 1.5707963267948966D;
          localObject = zo.a();
          for (i = 0; i < paramInt; i++)
          {
            if (paramzbs.s().e())
            {
              d13 = d2 + d12 * Math.cos(d4);
              d14 = d3 - d12 * Math.sin(d4);
              localzo2 = new zo((float)d13, (float)d14);
              if (i == 0)
              {
                d15 = d2 + d12 * Math.cos(d4 + d1);
                d16 = d3 - d12 * Math.sin(d4 + d1);
                localObject = new zo((float)d15, (float)d16);
              }
              if ((Math.abs(localzo2.d() - ((zo)localObject).d()) > 1.0F) || (Math.abs(localzo2.e() - ((zo)localObject).e()) > 1.0F))
              {
                zanv.a(paramzr, localzo2, (zo)localObject, paramzbs.s());
                localObject = localzo2;
              }
            }
            d4 -= d1;
          }
        }
      }
      if (d10 > 0.0D) {
        for (d11 = d8 + d10; d11 <= d7; d11 = zbxz.c(d11, d10))
        {
          d6 = Math.abs(d11 - d8);
          d12 = d5 * d6 / (d7 - d8);
          d4 = 1.5707963267948966D;
          localObject = zo.a();
          for (i = 0; i < paramInt; i++)
          {
            if (paramzbs.u().e())
            {
              d13 = d2 + d12 * Math.cos(d4);
              d14 = d3 - d12 * Math.sin(d4);
              localzo2 = new zo((float)d13, (float)d14);
              if (i == 0)
              {
                d15 = d2 + d12 * Math.cos(d4 + d1);
                d16 = d3 - d12 * Math.sin(d4 + d1);
                localObject = new zo((float)d15, (float)d16);
              }
              if ((Math.abs(localzo2.d() - ((zo)localObject).d()) > 1.0F) || (Math.abs(localzo2.e() - ((zo)localObject).e()) > 1.0F))
              {
                zanv.a(paramzr, localzo2, (zo)localObject, paramzbs.u());
                localObject = localzo2;
              }
            }
            d4 -= d1;
          }
        }
      }
    }
    else
    {
      d6 = 0.0D;
      d7 = paramzbs.S();
      d8 = paramzbs.T();
      d9 = paramzbs.V();
      d10 = paramzbs.W();
      if (d9 > 0.0D) {
        for (d11 = d8 + d9; d11 <= d7; d11 = zbxz.c(d11, d9))
        {
          d6 = Math.abs(d11 - d8);
          d12 = d5 * d6 / (d7 - d8);
          d4 = 1.5707963267948966D;
          localObject = zo.a();
          for (i = 0; i < paramInt; i++)
          {
            if (paramzbs.s().e())
            {
              d13 = d2 + d12 * Math.cos(d4);
              d14 = d3 - d12 * Math.sin(d4);
              localzo2 = new zo((float)d13, (float)d14);
              if (i == 0)
              {
                d15 = d2 + d12 * Math.cos(d4 + d1);
                d16 = d3 - d12 * Math.sin(d4 + d1);
                localObject = new zo((float)d15, (float)d16);
              }
              if ((Math.abs(localzo2.d() - ((zo)localObject).d()) > 1.0F) || (Math.abs(localzo2.e() - ((zo)localObject).e()) > 1.0F))
              {
                zanv.a(paramzr, localzo2, (zo)localObject, paramzbs.s());
                localObject = localzo2;
              }
            }
            d4 -= d1;
          }
        }
      }
      if (d10 > 0.0D) {
        for (d11 = d8 + d10; d11 <= d7; d11 = zbxz.c(d11, d10))
        {
          d6 = Math.abs(d11 - d8);
          d12 = d5 * d6 / (d7 - d8);
          d4 = 1.5707963267948966D;
          localObject = zo.a();
          for (i = 0; i < paramInt; i++)
          {
            if (paramzbs.u().e())
            {
              d13 = d2 + d12 * Math.cos(d4);
              d14 = d3 - d12 * Math.sin(d4);
              localzo2 = new zo((float)d13, (float)d14);
              if (i == 0)
              {
                d15 = d2 + d12 * Math.cos(d4 + d1);
                d16 = d3 - d12 * Math.sin(d4 + d1);
                localObject = new zo((float)d15, (float)d16);
              }
              if ((Math.abs(localzo2.d() - ((zo)localObject).d()) > 1.0F) || (Math.abs(localzo2.e() - ((zo)localObject).e()) > 1.0F))
              {
                zanv.a(paramzr, localzo2, (zo)localObject, paramzbs.u());
                localObject = localzo2;
              }
            }
            d4 -= d1;
          }
        }
      }
    }
  }
  
  static void a(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat, com.aspose.cells.b.a.b.zp paramzp, zbfc paramzbfc)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    zje localzje = paramzbs.c();
    int i = paramzbfc.ag();
    zbwu localzbwu = paramzbs.F();
    zke localzke = paramzbfc.D().b(0);
    String str1 = localzke != null ? localzke.A() : "";
    boolean bool = localzke != null ? localzke.B() : true;
    int j = 0;
    if ((localzbwu.c()) && (localzke != null)) {
      j = 1;
    }
    zanv.a(paramzr, paramFloat, paramzp.d(), paramFloat, paramzp.j(), paramzbs.g());
    zsp localzsp = paramzbs.Q();
    int k = 8;
    float f1 = 0.0F;
    float f2 = 2 * paramzbs.X() + paramzbs.Z();
    float f3 = paramzbs.g / 2.0F;
    if (paramzbs.m == 1)
    {
      f1 = paramzp.c() - paramzbs.f;
      localzsp.b().b.a((int)f1 - localzsp.b().b.e());
    }
    else if (paramzbs.m == 2)
    {
      k = 7;
      f1 = paramzp.i();
      f1 += f2;
      localzsp.b().b.a((int)(f1 + paramzbs.f));
    }
    else if (paramzbs.m == 3)
    {
      if (paramBoolean)
      {
        k = 7;
        f1 = paramFloat;
        f1 += f2;
        localzsp.b().b.a((int)(f1 + paramzbs.f));
      }
      else
      {
        f1 = paramFloat - paramzbs.f;
        localzsp.b().b.a((int)f1 - localzsp.b().b.e());
      }
    }
    localzsp.b().b.b(paramzp.d());
    ArrayList localArrayList = paramzbs.l;
    double d1 = paramzbs.S();
    double d2 = paramzbs.T();
    double d3 = paramzbs.V();
    double d4 = paramzbs.W();
    int m;
    double d5;
    double d6;
    float f4;
    String str2;
    Color localColor;
    zq localzq;
    if (!paramzbs.p()) {
      for (m = localArrayList.size() - 1; m >= 0; m--)
      {
        d5 = ze.g(localArrayList.get(m));
        d6 = paramzbs.n() ? zbxz.f(d5) : d5;
        if (m - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d5, ze.g(localArrayList.get(m - 1)))))) / d3 > b : (m + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d5, ze.g(localArrayList.get(m + 1)))))) / d3 <= b))
        {
          f4 = (float)(paramzp.d() + (d1 - d5) / (d1 - d2) * paramzp.f());
          if (paramzbs.m != 0)
          {
            if (paramzbs.ac())
            {
              d6 /= 100.0D;
              str1 = "0%";
            }
            str2 = "";
            d6 = paramzbs.n() ? d6 : d6 * Math.pow(10.0D, paramzbs.Q().f());
            localColor = localzbwu.h();
            if (j != 0)
            {
              str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d6), str1, bool, localzje.U());
              localColor = zqz.a(Double.valueOf(d6), str1, localColor);
            }
            else
            {
              str2 = a(paramzbs, Double.valueOf(d6));
              localColor = zqz.a(Double.valueOf(d6), localzbwu.b(), localColor);
            }
            localzq = new zq(f1, f4 - f3, paramzbs.f - f2, paramzbs.g);
            a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str2, localzbwu.e(), localzbwu.a(), localColor, k, 1, zv.c());
          }
          a(paramzr, paramzbs, paramBoolean, paramFloat, f4);
        }
      }
    } else {
      for (m = 0; m < localArrayList.size(); m++)
      {
        d5 = ze.g(localArrayList.get(m));
        d6 = paramzbs.n() ? zbxz.f(d5) : d5;
        if (m - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d5, ze.g(localArrayList.get(m - 1)))))) / d3 > b : (m + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d5, ze.g(localArrayList.get(m + 1)))))) / d3 <= b))
        {
          f4 = (float)(paramzp.d() + (d5 - paramzbs.D()) / (paramzbs.z() - paramzbs.D()) * paramzp.f());
          if (paramzbs.m != 0)
          {
            if (paramzbs.ac())
            {
              d6 /= 100.0D;
              str1 = "0%";
            }
            str2 = "";
            d6 = paramzbs.n() ? d6 : d6 * Math.pow(10.0D, paramzbs.Q().f());
            localColor = localzbwu.h();
            if (j != 0)
            {
              str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d6), str1, bool, localzje.U());
              localColor = zqz.a(Double.valueOf(d6), str1, localColor);
            }
            else
            {
              str2 = a(paramzbs, Double.valueOf(d6));
              localColor = zqz.a(Double.valueOf(d6), localzbwu.b(), localColor);
            }
            localzq = new zq(f1, f4 - f3, paramzbs.f - f2, paramzbs.g);
            a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str2, localzbwu.e(), localzbwu.a(), localColor, k, 1, zv.c());
          }
          a(paramzr, paramzbs, paramBoolean, paramFloat, f4);
        }
      }
    }
    a(paramzr, paramzbs, paramBoolean, paramFloat, paramzp.d(), paramzp.j());
    localzsp.b().e(paramzp.e());
    localzsp.b().f(paramzp.f());
    zbwz.a(paramzbs.c(), localzsp);
  }
  
  private static void a(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    zbs localzbs = a(paramzbs);
    int i = 0;
    int j = 0;
    switch (paramzbs.w())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbs.o) {
        if (paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 3: 
      j = 1;
      if (paramBoolean)
      {
        j = 0;
        i = 1;
      }
      if (localzbs.o) {
        if (!paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 0: 
      i = 1;
      j = 1;
      break;
    }
    if (i != 0) {
      zanv.a(paramzr, paramFloat1, paramFloat2, paramFloat1 + paramzbs.X(), paramFloat2, paramzbs.g());
    }
    if (j != 0) {
      zanv.a(paramzr, paramFloat1 - paramzbs.X(), paramFloat2, paramFloat1, paramFloat2, paramzbs.g());
    }
  }
  
  private static void a(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramzbs.A() == 2) {
      return;
    }
    zbs localzbs = a(paramzbs);
    int i = 0;
    int j = 0;
    switch (paramzbs.A())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbs.o) {
        if (paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 3: 
      j = 1;
      if (paramBoolean)
      {
        j = 0;
        i = 1;
      }
      if (localzbs.o) {
        if (!paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 0: 
      i = 1;
      j = 1;
      break;
    }
    float f2 = (float)(paramzbs.B() / (paramzbs.z() - paramzbs.D()) * (paramFloat3 - paramFloat2));
    float f1;
    if (!paramzbs.p())
    {
      f1 = paramFloat3;
      f2 = -f2;
    }
    else
    {
      f1 = paramFloat2;
    }
    float f3 = f1;
    do
    {
      if (i != 0) {
        zanv.a(paramzr, paramFloat1, f3, paramFloat1 + paramzbs.Y(), f3, paramzbs.g());
      }
      if (j != 0) {
        zanv.a(paramzr, paramFloat1 - paramzbs.Y(), f3, paramFloat1, f3, paramzbs.g());
      }
      f3 += f2;
    } while ((paramFloat2 <= f3) && (f3 <= paramFloat3));
  }
  
  static void a(zr paramzr, zbs paramzbs, boolean paramBoolean1, float paramFloat, com.aspose.cells.b.a.b.zp paramzp, int paramInt, boolean paramBoolean2)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzbs.k() == 2)
    {
      a(paramzr, paramzbs, paramBoolean1, paramFloat, paramzp);
      return;
    }
    zanv.a(paramzr, paramzp.c(), paramFloat, paramzp.i(), paramFloat, paramzbs.g());
    float f1 = 0.0F;
    int i = 9;
    float f2 = paramzbs.F().k();
    if (paramzbs.m != 0) {
      f2 += paramzbs.X() + paramzbs.Y();
    }
    float f3 = 0.0F;
    if (paramzbs.m == 1)
    {
      f1 = paramzp.j() + f2;
      f3 = paramzp.j() + f2;
    }
    else if (paramzbs.m == 2)
    {
      i = 0;
      f1 = paramzp.d() - f2 - paramzbs.h;
      f3 = paramzp.d() - f2;
    }
    else if (paramzbs.m == 3)
    {
      if (paramBoolean1)
      {
        f1 = paramFloat - f2 - paramzbs.h;
        f3 = paramFloat - f2;
        i = 0;
      }
      else
      {
        f1 = paramFloat + f2;
        f3 = paramFloat + f2;
      }
    }
    zje localzje = paramzbs.c();
    zbfe localzbfe = localzje.z();
    zbwu localzbwu = paramzbs.F();
    ArrayList localArrayList1;
    ArrayList[] arrayOfArrayList;
    if (paramzbs.d() == 0)
    {
      localArrayList1 = localzje.z().c();
      arrayOfArrayList = localzje.z().e();
    }
    else
    {
      localArrayList1 = localzje.z().d();
      arrayOfArrayList = localzje.z().g();
    }
    int j = 0;
    if ((localzbwu.c()) && (localArrayList1.size() > 0)) {
      j = 1;
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList1.size() > 0)) {
      j = 1;
    }
    int k = 0;
    int m = paramInt;
    if (paramzbs.p) {
      m = (int)paramzbs.z();
    }
    if ((paramzbs.f()) || (localzje.u()))
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
    double d1 = paramzp.e() / k;
    zt localzt1 = new zt(paramzbs.i, paramzbs.h);
    float f4 = -1.0F;
    float f5 = -1.0F;
    float f12;
    for (int n = 0; n < m; n++)
    {
      double d2 = (n + 1) * d1;
      if ((!paramzbs.f()) && (!paramzbs.c().u())) {
        d2 -= d1 / 2.0D;
      }
      float f7;
      float f8;
      float f9;
      if (!paramzbs.p())
      {
        f7 = (float)(paramzp.c() + (n + 1) * d1);
        f8 = (float)(paramzp.c() + d2 - d1);
        f9 = (float)(paramzp.c() + (n + 1) * d1 - d1 / 2.0D);
      }
      else
      {
        f7 = (float)(paramzp.c() + paramzp.e() - (n + 1) * d1);
        f8 = (float)(paramzp.c() + paramzp.e() - d2);
        f9 = (float)(paramzp.c() + paramzp.e() - (n + 1) * d1 + d1 / 2.0D);
      }
      if ((paramzbs.m != 0) && (n % paramzbs.H() == 0) && (n < paramzbs.l.size()))
      {
        String str2 = "";
        Color localColor = localzbwu.h();
        if (j == 0)
        {
          str2 = a(paramzbs, paramzbs.l.get(n));
          localColor = zqz.a(paramzbs.l.get(n), localzbwu.b(), localColor);
        }
        else
        {
          String str3 = "";
          boolean bool2 = false;
          str3 = n < localArrayList1.size() ? ((zgm)localArrayList1.get(n)).c() : "";
          bool2 = n < localArrayList1.size() ? ((zgm)localArrayList1.get(n)).b() : false;
          str2 = zqz.a(paramzbs.c().an(), paramzbs.l.get(n), str3, bool2, localzje.U());
          localColor = zqz.a(paramzbs.l.get(n), str3, localColor);
        }
        float f13 = paramzbs.h;
        com.aspose.cells.b.a.b.zs localzs2 = zbvx.a(paramzr, str2, localzbwu.e(), localzbwu.a(), localzt1, 1, 1);
        if (localzs2.c() < paramzbs.h) {
          f13 = localzs2.c();
        }
        zq localzq1 = new zq((float)(f8 + d1 / 2.0D - paramzbs.i / 2.0F), f1, paramzbs.i, f13);
        if ((localzbwu.e() == 0) || (localzbwu.e() == 90) || (localzbwu.e() == -90))
        {
          int i1 = 1;
          int i2 = 1;
          if ((localzbwu.e() == 90) || (localzbwu.e() == -90))
          {
            com.aspose.cells.b.a.b.zs localzs3 = zbvx.a(paramzr, str2, localzbwu.e(), localzbwu.a(), localzq1.e(), i1, i2);
            zt localzt2 = zbxz.a(paramzr, str2, localzbwu.a(), new zt(localzq1.i(), localzq1.h()));
            zq localzq2 = new zq((float)(f8 + d1 / 2.0D - localzs3.b() / 2.0F), f1, localzs3.b(), localzs3.c());
            if (paramzbs.m == 2)
            {
              localzq2.b(f3 - localzs3.c());
              localzq2.b(localzq2.g() + (localzs3.c() - localzt2.b()) / 2.0F);
            }
            else
            {
              localzq2.b(localzq2.g() - (localzs3.c() - localzt2.b()) / 2.0F);
            }
            a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq2), str2, localzbwu.e(), localzbwu.a(), localColor, i1, i2);
          }
          else
          {
            a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq1), str2, localzbwu.e(), localzbwu.a(), localColor, i1, i2);
          }
        }
        else if (localzbwu.e() == 255)
        {
          zbvx.a(paramzr, str2, localzbwu.a(), localColor, f9, f1, paramzbs.i, paramzbs.h, localzbwu.f());
        }
        else
        {
          a(paramzr, str2, new zo(f9, f3), new zt(paramzbs.i, f13), localzbwu.e(), localzbwu.a(), localColor, paramzbs.a());
        }
      }
      float f11;
      if (n == 0)
      {
        if (!paramzbs.p()) {
          f11 = paramzp.c();
        } else {
          f11 = paramzp.i();
        }
        if ((f11 >= paramzp.c()) && (f11 <= paramzp.c() + paramzp.e())) {
          a(paramzr, paramzbs, paramBoolean1, f11, paramFloat, paramzp);
        }
        f12 = f11;
        if (!paramzbs.p()) {
          f12 -= (float)(d1 * paramzbs.J() / 2.0D);
        } else {
          f12 += (float)(d1 * paramzbs.J() / 2.0D);
        }
        if ((f12 > paramzp.c()) && (f12 < paramzp.c() + paramzp.e())) {
          b(paramzr, paramzbs, paramBoolean1, f12, paramFloat, paramzp);
        }
      }
      if ((n + 1) % paramzbs.J() == 0)
      {
        if ((f7 >= paramzp.c()) && (f7 <= paramzp.c() + paramzp.e()) && (Math.abs(f4 - f7) > (float)paramzbs.g().b().a() / 2.0F))
        {
          a(paramzr, paramzbs, paramBoolean1, f7, paramFloat, paramzp);
          f4 = f7;
        }
        f11 = f7;
        if (!paramzbs.p()) {
          f11 -= (float)(d1 * paramzbs.J() / 2.0D);
        } else {
          f11 += (float)(d1 * paramzbs.J() / 2.0D);
        }
        if ((f11 > paramzp.c()) && (f11 < paramzp.c() + paramzp.e()) && (Math.abs(f5 - f11) > (float)paramzbs.g().b().a() / 2.0F))
        {
          b(paramzr, paramzbs, paramBoolean1, f11, paramFloat, paramzp);
          f5 = f11;
        }
      }
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList1.size() > 0) && (paramzbs.m != 0))
    {
      float f6 = (arrayOfArrayList.length + 1) * f2;
      ArrayList localArrayList2 = arrayOfArrayList[0];
      zgm localzgm = (zgm)localArrayList2.get(0);
      String str1 = zqz.a(paramzbs.c().an(), localzgm.a(), localzgm.c(), localzgm.b(), localzje.U());
      com.aspose.cells.b.a.b.zs localzs1 = zbvx.a(paramzbs.c().ar(), str1, 0, localzbwu.a(), new zt(paramzp.b().b(), paramzp.b().c()), 1, 1);
      float f10 = 0.0F;
      boolean bool1 = true;
      if (paramzbs.m == 1)
      {
        f1 = paramzp.j() + f6 + paramzbs.g;
        f10 = paramzp.j();
        bool1 = false;
      }
      else if (paramzbs.m == 2)
      {
        f1 = paramzp.d() - f6 - paramzbs.g;
        f10 = paramzp.d();
        bool1 = true;
      }
      else if (paramzbs.m == 3)
      {
        if (paramBoolean1)
        {
          f1 = paramFloat - f6 - paramzbs.g + localzs1.c();
          bool1 = true;
        }
        else
        {
          f1 = paramFloat + f6 + paramzbs.g - localzs1.c();
          bool1 = false;
        }
        f10 = paramFloat;
      }
      if (!paramzbs.p()) {
        f12 = paramzp.c();
      } else {
        f12 = paramzp.i();
      }
      a(paramzr, arrayOfArrayList, f12, f1, f2, bool1, paramzbs, d1, localzbwu, i, f10, paramzp, paramBoolean2);
    }
  }
  
  private static void a(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat1, float paramFloat2, com.aspose.cells.b.a.b.zp paramzp)
  {
    zbs localzbs = a(paramzbs);
    int i = 0;
    int j = 0;
    switch (paramzbs.w())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbs.o) {
        if (paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 3: 
      j = 1;
      if (paramBoolean)
      {
        j = 0;
        i = 1;
      }
      if (localzbs.o) {
        if (!paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 0: 
      i = 1;
      j = 1;
      break;
    }
    if (i != 0) {
      zanv.a(paramzr, paramFloat1, paramFloat2 - paramzbs.X(), paramFloat1, paramFloat2, paramzbs.g());
    }
    if (j != 0) {
      zanv.a(paramzr, paramFloat1, paramFloat2, paramFloat1, paramFloat2 + paramzbs.X(), paramzbs.g());
    }
  }
  
  private static void b(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat1, float paramFloat2, com.aspose.cells.b.a.b.zp paramzp)
  {
    zbs localzbs = a(paramzbs);
    int i = 0;
    int j = 0;
    switch (paramzbs.A())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbs.o) {
        if (paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 3: 
      j = 1;
      if (paramBoolean)
      {
        j = 0;
        i = 1;
      }
      if (localzbs.o) {
        if (!paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 0: 
      i = 1;
      j = 1;
      break;
    }
    if (i != 0) {
      zanv.a(paramzr, paramFloat1, paramFloat2 - paramzbs.Y(), paramFloat1, paramFloat2, paramzbs.g());
    }
    if (j != 0) {
      zanv.a(paramzr, paramFloat1, paramFloat2, paramFloat1, paramFloat2 + paramzbs.Y(), paramzbs.g());
    }
  }
  
  private static void a(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    ArrayList localArrayList1 = paramzbs.l;
    zje localzje = paramzbs.c();
    zanv.a(paramzr, paramzp.c(), paramFloat, paramzp.i(), paramFloat, paramzbs.g());
    float f1 = 0.0F;
    float f2 = paramzbs.F().k();
    if (paramzbs.m != 0) {
      f2 += paramzbs.X();
    }
    float f3 = 0.0F;
    if (paramzbs.m == 1)
    {
      f1 = paramzp.j() + f2;
      f3 = paramzp.j() + f2;
    }
    else if (paramzbs.m == 2)
    {
      f1 = paramzp.d() - f2 - paramzbs.h;
      f3 = paramzp.d() - f2;
    }
    else if (paramzbs.m == 3)
    {
      if (paramBoolean)
      {
        f1 = paramFloat - f2 - paramzbs.h;
        f3 = paramFloat - f2;
      }
      else
      {
        f1 = paramFloat + f2;
        f3 = paramFloat + f2;
      }
    }
    zbwu localzbwu = paramzbs.F();
    boolean bool1 = false;
    ArrayList localArrayList2;
    ArrayList[] arrayOfArrayList;
    if (paramzbs.d() == 0)
    {
      localArrayList2 = localzje.z().c();
      arrayOfArrayList = localzje.z().e();
      bool1 = localzje.z().a;
    }
    else
    {
      localArrayList2 = localzje.z().d();
      arrayOfArrayList = localzje.z().g();
      bool1 = localzje.z().b;
    }
    int i = 0;
    if ((localzbwu.c()) && (localArrayList2.size() > 0)) {
      i = 1;
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0)) {
      i = 1;
    }
    int j = 0;
    int k = (int)paramzbs.z();
    int m = (int)paramzbs.D();
    int n = paramzbs.j();
    if ((localzje.e().f()) || (localzje.u()))
    {
      j = a(n, k, m, paramzbs.c().U()) + 1;
    }
    else
    {
      j = a(n, k, m, paramzbs.c().U());
      if (j == 0) {
        j = 1;
      }
    }
    double d = paramzp.e() / j;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    if (paramzbs.p()) {
      f7 = paramzp.c() + paramzp.e();
    } else {
      f7 = paramzp.c();
    }
    zt localzt = new zt(paramzbs.f, paramzbs.h);
    int i2;
    for (int i1 = 0; i1 < localArrayList1.size(); i1++)
    {
      i2 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(paramzbs.l.get(i1)));
      i3 = a(n, i2, m, paramzbs.c().U());
      float f9 = (float)(d * i3);
      f4 = (float)(d * a(n, a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), i2, paramzbs.c().U()), i2, paramzbs.c().U()));
      if ((paramzbs.f()) || (localzje.u())) {
        f9 += (float)(d / 2.0D);
      }
      if (paramzbs.p())
      {
        f5 = paramzp.c() + paramzp.e() - f9;
        f6 = f5;
        f7 -= f4;
      }
      else
      {
        f5 = paramzp.c() + f9;
        f6 = f5;
        f7 += f4;
      }
      if ((paramzbs.m != 0) && (i1 % paramzbs.H() == 0))
      {
        String str1 = "";
        Color localColor = localzbwu.h();
        if ((i != 0) && (bool1))
        {
          String str2 = "";
          boolean bool2 = false;
          str1 = a(paramzbs, paramzbs.l.get(i1));
          localColor = zqz.a(paramzbs.l.get(i1), localzbwu.b(), localColor);
          localObject = localArrayList2.iterator();
          while (((Iterator)localObject).hasNext())
          {
            zgm localzgm = (zgm)((Iterator)localObject).next();
            if (ziy.a(localzgm.a(), localzje.U()) == ze.f(paramzbs.l.get(i1)))
            {
              str2 = localzgm.c();
              bool2 = localzgm.b();
              str1 = zqz.a(paramzbs.c().an(), paramzbs.l.get(i1), str2, bool2, localzje.U());
              localColor = zqz.a(paramzbs.l.get(i1), str2, localColor);
              break;
            }
          }
        }
        else
        {
          str1 = a(paramzbs, paramzbs.l.get(i1));
          localColor = zqz.a(paramzbs.l.get(i1), localzbwu.b(), localColor);
        }
        float f12 = paramzbs.h;
        com.aspose.cells.b.a.b.zs localzs = zbvx.a(paramzr, str1, localzbwu.e(), localzbwu.a(), localzt, 1, 1);
        if (localzs.c() < paramzbs.h) {
          f12 = localzs.c();
        }
        Object localObject = new zq(f5 - paramzbs.f / 2.0F, f1, paramzbs.f, f12);
        if ((localzbwu.e() == 0) || (localzbwu.e() == 90) || (localzbwu.e() == -90)) {
          a(paramzr, com.aspose.cells.b.a.b.zp.a((zq)localObject), str1, localzbwu.e(), localzbwu.a(), localColor, 1, 1);
        } else {
          a(paramzr, str1, new zo(f6, f3), new zt(paramzbs.f, f12), localzbwu.e(), localzbwu.a(), localColor, paramzbs.a());
        }
      }
      if (i1 == 0)
      {
        float f10;
        if (!paramzbs.p()) {
          f10 = paramzp.c();
        } else {
          f10 = paramzp.i();
        }
        a(paramzr, paramzbs, paramBoolean, f10, paramFloat, paramzp);
      }
      if ((i1 % paramzbs.J() == 0) && (f7 + c >= paramzp.c()) && (f7 - c <= paramzp.c() + paramzp.e())) {
        a(paramzr, paramzbs, paramBoolean, f7, paramFloat, paramzp);
      }
    }
    float f8;
    if (paramzbs.p()) {
      f8 = paramzp.c() + paramzp.e();
    } else {
      f8 = paramzp.c();
    }
    int i3 = m;
    int i4 = a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), m, paramzbs.c().U());
    do
    {
      i2 = 1;
      int i5 = a(paramzbs.j(), paramzbs.C(), (int)paramzbs.B(), i3, paramzbs.c().U());
      if (i5 == i4)
      {
        i2 = 0;
        i4 = a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), i4, paramzbs.c().U());
      }
      if (i5 >= i4) {
        i4 = a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), i4, paramzbs.c().U());
      }
      float f11 = (float)(d * a(n, i5, i3, paramzbs.c().U()));
      if (paramzbs.p()) {
        f8 -= f11;
      } else {
        f8 += f11;
      }
      if ((i2 != 0) && (f8 >= paramzp.c()) && (f8 <= paramzp.c() + paramzp.e())) {
        b(paramzr, paramzbs, paramBoolean, f8, paramFloat, paramzp);
      }
      i3 = i5;
    } while ((f8 >= paramzp.c()) && (f8 <= paramzp.c() + paramzp.e()));
  }
  
  static void b(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat, com.aspose.cells.b.a.b.zp paramzp, zbfc paramzbfc)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    int i = paramzbfc.ag();
    zje localzje = paramzbs.c();
    zbwu localzbwu = paramzbs.F();
    zke localzke = paramzbfc.D().b(0);
    String str1 = localzke != null ? localzke.A() : "";
    boolean bool = localzke != null ? localzke.B() : true;
    int j = 0;
    if ((localzbwu.c()) && (localzke != null)) {
      j = 1;
    }
    zanv.a(paramzr, paramzp.c(), paramFloat, paramzp.i(), paramFloat, paramzbs.g());
    zsp localzsp = paramzbs.Q();
    float f1 = 0.0F;
    float f2 = 2 * paramzbs.X();
    float f3 = paramzbs.f / 2.0F;
    if (paramzbs.m == 1)
    {
      f1 = paramzp.j();
      f1 += f2;
      localzsp.b().b.b((int)(f1 + paramzbs.g));
    }
    else if (paramzbs.m == 2)
    {
      f1 = paramzp.d() - paramzbs.g;
      localzsp.b().b.b((int)f1 - localzsp.b().m());
    }
    else if (paramzbs.m == 3)
    {
      if (paramBoolean)
      {
        f1 = paramFloat - paramzbs.g;
        localzsp.b().b.b((int)f1 - localzsp.b().m());
      }
      else
      {
        f1 = paramFloat;
        f1 += f2;
        localzsp.b().b.b((int)(f1 + paramzbs.g));
      }
    }
    localzsp.b().b.a(paramzp.i() - localzsp.b().b.e());
    ArrayList localArrayList = paramzbs.l;
    double d1 = paramzbs.S();
    double d2 = paramzbs.T();
    double d3 = paramzbs.V();
    double d4 = paramzbs.W();
    double d5 = 1.0E-10D;
    int k;
    double d6;
    float f4;
    String str2;
    Color localColor;
    zq localzq;
    if (!paramzbs.p()) {
      for (k = 0; k < paramzbs.l.size(); k++)
      {
        d6 = ((Double)paramzbs.l.get(k)).doubleValue();
        if (k - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d6, ze.g(localArrayList.get(k - 1)))))) / d3 > d5 : (k + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d6, ze.g(localArrayList.get(k + 1)))))) / d3 <= d5))
        {
          f4 = (float)(paramzp.c() + (d6 - paramzbs.D()) / (paramzbs.z() - paramzbs.D()) * paramzp.e());
          if (paramzbs.m != 0)
          {
            if (paramzbs.ac())
            {
              d6 /= 100.0D;
              str1 = "0%";
            }
            str2 = "";
            localColor = localzbwu.h();
            d6 *= Math.pow(10.0D, paramzbs.Q().f());
            if (j != 0)
            {
              str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d6), str1, bool, localzje.U());
              localColor = zqz.a(Double.valueOf(d6), str1, localColor);
            }
            else
            {
              str2 = a(paramzbs, Double.valueOf(d6));
              localColor = zqz.a(Double.valueOf(d6), localzbwu.b(), localColor);
            }
            localzq = new zq(f4 - f3, f1, paramzbs.f, paramzbs.g - f2);
            a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str2, localzbwu.e(), localzbwu.a(), localColor, 1, 1);
          }
          a(paramzr, paramzbs, paramBoolean, f4, paramFloat, paramzp);
        }
      }
    } else {
      for (k = paramzbs.l.size() - 1; k >= 0; k--)
      {
        d6 = ((Double)paramzbs.l.get(k)).doubleValue();
        if (k - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d6, ze.g(localArrayList.get(k - 1)))))) / d3 > d5 : (k + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d6, ze.g(localArrayList.get(k + 1)))))) / d3 <= d5))
        {
          f4 = (float)(paramzp.c() + (paramzbs.z() - d6) / (paramzbs.z() - paramzbs.D()) * paramzp.e());
          if (paramzbs.m != 0)
          {
            if (paramzbs.ac())
            {
              d6 /= 100.0D;
              str1 = "0%";
            }
            str2 = "";
            localColor = localzbwu.h();
            d6 *= Math.pow(10.0D, paramzbs.Q().f());
            if (j != 0)
            {
              str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d6), str1, bool, localzje.U());
              localColor = zqz.a(Double.valueOf(d6), str1, localColor);
            }
            else
            {
              str2 = a(paramzbs, Double.valueOf(d6));
              localColor = zqz.a(Double.valueOf(d6), localzbwu.b(), localColor);
            }
            localzq = new zq(f4 - f3, f1, paramzbs.f, paramzbs.g - f2);
            a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str2, localzbwu.e(), localzbwu.a(), localColor, 1, 1);
          }
          a(paramzr, paramzbs, paramBoolean, f4, paramFloat, paramzp);
        }
      }
    }
    a(paramzr, paramzbs, paramBoolean, paramFloat, paramzp.c(), paramzp.i(), paramzp);
    zbwz.a(paramzbs.c(), localzsp);
  }
  
  private static void a(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, com.aspose.cells.b.a.b.zp paramzp)
  {
    if (paramzbs.A() == 2) {
      return;
    }
    zbs localzbs = a(paramzbs);
    int i = 0;
    int j = 0;
    switch (paramzbs.A())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbs.o) {
        if (paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 3: 
      j = 1;
      if (paramBoolean)
      {
        j = 0;
        i = 1;
      }
      if (localzbs.o) {
        if (!paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 0: 
      i = 1;
      j = 1;
      break;
    }
    float f2 = (float)(paramzbs.B() / (paramzbs.z() - paramzbs.D()) * (paramFloat3 - paramFloat2));
    float f1;
    if (paramzbs.p())
    {
      f1 = paramFloat3;
      f2 = -f2;
    }
    else
    {
      f1 = paramFloat2;
    }
    float f3 = f1;
    do
    {
      if (i != 0) {
        zanv.a(paramzr, f3, paramFloat1, f3, paramFloat1 - paramzbs.Y(), paramzbs.g());
      }
      if (j != 0) {
        zanv.a(paramzr, f3, paramFloat1, f3, paramFloat1 + paramzbs.Y(), paramzbs.g());
      }
      f3 += f2;
    } while ((paramFloat2 <= f3) && (f3 <= paramFloat3));
  }
  
  static void a(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat, com.aspose.cells.b.a.b.zp paramzp, int paramInt)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzbs.k() == 2)
    {
      b(paramzr, paramzbs, paramBoolean, paramFloat, paramzp);
      return;
    }
    zanv.a(paramzr, paramFloat, paramzp.d(), paramFloat, paramzp.j(), paramzbs.g());
    zje localzje = paramzbs.c();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = paramzbs.X() + paramzbs.Y() + paramzbs.F().k();
    float f4 = paramzbs.g / 2.0F;
    int i = 8;
    float f5 = 0.0F;
    if (paramzbs.F().e() == 0) {
      f5 = paramzbs.g;
    } else if (Math.abs(paramzbs.F().e()) == 90) {
      f5 = paramzbs.f;
    }
    if (f5 > paramzbs.F().a().d() * 1.5F) {
      i = 1;
    }
    if (paramzbs.m == 1)
    {
      f1 = paramzp.c() - paramzbs.i - f3;
      f2 = paramzp.c() - f3;
    }
    else if (paramzbs.m == 2)
    {
      f1 = paramzp.i() + f3;
      f2 = paramzp.i() + f3;
      i = 7;
    }
    else if (paramzbs.m == 3)
    {
      if (paramBoolean)
      {
        f1 = paramFloat + f3;
        f2 = paramFloat + f3;
        i = 7;
      }
      else
      {
        f1 = paramFloat - f3 - paramzbs.i;
        f2 = paramFloat - f3;
      }
    }
    int j = 0;
    if ((paramzbs.f()) || (localzje.u()))
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
    double d1 = paramzp.f() / j;
    zbwu localzbwu = paramzbs.F();
    ArrayList localArrayList;
    ArrayList[] arrayOfArrayList;
    if (paramzbs.d() == 0)
    {
      localArrayList = localzje.z().c();
      arrayOfArrayList = localzje.z().e();
    }
    else
    {
      localArrayList = localzje.z().d();
      arrayOfArrayList = localzje.z().g();
    }
    int k = 0;
    if ((localzbwu.c()) && (localArrayList.size() > 0)) {
      k = 1;
    }
    float f8;
    float f9;
    for (int m = 0; m < paramInt; m++)
    {
      double d2 = (m + 1) * d1;
      if ((paramzbs.f()) || (paramzbs.c().u())) {
        d2 += d1 / 2.0D;
      }
      float f7;
      if (paramzbs.p())
      {
        f7 = (float)(paramzp.d() + (m + 1) * d1);
        f8 = (float)(paramzp.d() + d2 - d1);
        f9 = (float)(paramzp.d() + d2 - d1);
      }
      else
      {
        f7 = (float)(paramzp.d() + paramzp.f() - (m + 1) * d1);
        f8 = (float)(paramzp.d() + paramzp.f() - d2 + d1);
        f9 = (float)(paramzp.d() + paramzp.f() - d2 + d1);
      }
      if ((paramzbs.m != 0) && (m % paramzbs.H() == 0) && (m < paramzbs.l.size()))
      {
        String str = "";
        Color localColor = localzbwu.h();
        if (k == 0)
        {
          str = a(paramzbs, paramzbs.l.get(m));
          localColor = zqz.a(paramzbs.l.get(m), localzbwu.b(), localColor);
        }
        else
        {
          localObject = "";
          boolean bool2 = false;
          localObject = m < localArrayList.size() ? ((zgm)localArrayList.get(m)).c() : "";
          bool2 = m < localArrayList.size() ? ((zgm)localArrayList.get(m)).b() : false;
          str = zqz.a(paramzbs.c().an(), paramzbs.l.get(m), (String)localObject, bool2, localzje.U());
          localColor = zqz.a(paramzbs.l.get(m), (String)localObject, localColor);
        }
        Object localObject = new zq(f1, f8 - f4, paramzbs.i, paramzbs.h);
        if ((localzbwu.e() == 0) || (localzbwu.e() == 90) || (localzbwu.e() == -90)) {
          a(paramzr, com.aspose.cells.b.a.b.zp.a((zq)localObject), str, localzbwu.e(), localzbwu.a(), localColor, i, 1);
        } else {
          a(paramzr, str, new zo(f2, f9), new zt(paramzbs.f, paramzbs.g), localzbwu.e(), localzbwu.a(), localColor, paramzbs.a());
        }
      }
      float f10;
      if (m == 0)
      {
        if (paramzbs.p()) {
          f10 = paramzp.d();
        } else {
          f10 = paramzp.j();
        }
        if ((f10 >= paramzp.d()) && (f10 <= paramzp.d() + paramzp.f())) {
          a(paramzr, paramzbs, paramBoolean, paramFloat, f10);
        }
        float f11 = f10;
        if (!paramzbs.p()) {
          f11 += (float)(d1 * paramzbs.J() / 2.0D);
        } else {
          f11 -= (float)(d1 * paramzbs.J() / 2.0D);
        }
        if ((f11 >= paramzp.d()) && (f11 <= paramzp.d() + paramzp.f())) {
          c(paramzr, paramzbs, paramBoolean, paramFloat, f11, paramzp);
        }
      }
      if ((m + 1) % paramzbs.J() == 0)
      {
        if ((f7 >= paramzp.d()) && (f7 <= paramzp.d() + paramzp.f())) {
          a(paramzr, paramzbs, paramBoolean, paramFloat, f7);
        }
        f10 = f7;
        if (!paramzbs.p()) {
          f10 += (float)(d1 * paramzbs.J() / 2.0D);
        } else {
          f10 -= (float)(d1 * paramzbs.J() / 2.0D);
        }
        if ((f10 >= paramzp.d()) && (f10 <= paramzp.d() + paramzp.f())) {
          c(paramzr, paramzbs, paramBoolean, paramFloat, f10, paramzp);
        }
      }
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList.size() > 0) && (paramzbs.m != 0))
    {
      float f6 = f3 * (arrayOfArrayList.length + 1);
      boolean bool1 = false;
      f8 = paramzp.c();
      if (paramzbs.m == 1)
      {
        f1 = paramzp.c() - paramzbs.f - f6;
        bool1 = true;
        f8 = paramzp.c();
      }
      else if (paramzbs.m == 2)
      {
        f1 = paramzp.i() + f6 + paramzbs.f;
        bool1 = false;
        f8 = paramzp.i();
      }
      else if (paramzbs.m == 3)
      {
        if (paramBoolean)
        {
          f1 = paramFloat + f6 + paramzbs.f;
          bool1 = false;
        }
        else
        {
          f1 = paramFloat - f6 - paramzbs.f;
          bool1 = true;
        }
        f8 = paramFloat;
      }
      if (!paramzbs.p()) {
        f9 = paramzp.j();
      } else {
        f9 = paramzp.d();
      }
      a(paramzr, arrayOfArrayList, bool1, paramzbs, localzbwu, d1, paramzp, f3, f8, f1, f9);
    }
  }
  
  private static void a(zr paramzr, ArrayList[] paramArrayOfArrayList, boolean paramBoolean, zbs paramzbs, zbwu paramzbwu, double paramDouble, com.aspose.cells.b.a.b.zp paramzp, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    zje localzje = paramzbs.c();
    float f1 = paramFloat4;
    for (int i = 0; i < paramArrayOfArrayList.length; i++)
    {
      com.aspose.cells.b.a.b.zs localzs = new com.aspose.cells.b.a.b.zs(0, 0);
      ArrayList localArrayList = paramArrayOfArrayList[i];
      for (int j = 0; j < localArrayList.size(); j++)
      {
        zgm localzgm = (zgm)localArrayList.get(j);
        int k = a(localzgm);
        float f2 = (float)(k * paramDouble);
        String str = zqz.a(paramzbs.c().an(), localzgm.a(), localzgm.c(), localzgm.b(), localzje.U());
        localzs = zbvx.a(paramzbs.c().ar(), str, 90, paramzbwu.a(), new zt(paramzp.b().b(), f2), 1, 1);
        float f3 = paramBoolean ? paramFloat3 : paramFloat3 - localzs.b();
        float f4;
        if (!paramzbs.p()) {
          f4 = paramFloat4 - f2 / 2.0F - localzs.c() / 2;
        } else {
          f4 = paramFloat4 + f2 / 2.0F - localzs.c() / 2;
        }
        zq localzq = new zq(f3, f4, localzs.b(), localzs.c());
        a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str, 90, paramzbwu.a(), paramzbwu.h(), 1, 9);
        zanv.a(paramzr, paramFloat2, paramFloat4, paramFloat3, paramFloat4, paramzbs.g());
        if (paramzbs.w() != 2)
        {
          float f5 = paramBoolean ? paramFloat3 + (paramFloat1 + localzs.b()) : paramFloat3 - (paramFloat1 + localzs.b());
          a(paramzr, localzgm.d(), paramFloat2, f5, paramFloat4, paramzbs, paramDouble);
        }
        if (!paramzbs.p()) {
          paramFloat4 -= f2;
        } else {
          paramFloat4 += f2;
        }
      }
      zanv.a(paramzr, paramFloat2, paramFloat4, paramFloat3, paramFloat4, paramzbs.g());
      paramFloat4 = f1;
      paramFloat3 = paramBoolean ? paramFloat3 + localzs.b() + paramFloat1 : paramFloat3 - localzs.b() - paramFloat1;
    }
  }
  
  private static void a(zr paramzr, zagz paramzagz, float paramFloat1, float paramFloat2, float paramFloat3, zbs paramzbs, double paramDouble)
  {
    float f1 = paramFloat3;
    for (int i = 0; i < paramzagz.getCount(); i++)
    {
      zgm localzgm = (zgm)paramzagz.a(i);
      int j = a(localzgm);
      float f2 = (float)(j * paramDouble);
      if (!paramzbs.p()) {
        f1 -= f2;
      } else {
        f1 += f2;
      }
      zanv.a(paramzr, paramFloat1, f1, paramFloat2, f1, paramzbs.g());
    }
  }
  
  private static void c(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat1, float paramFloat2, com.aspose.cells.b.a.b.zp paramzp)
  {
    zbs localzbs = a(paramzbs);
    int i = 0;
    int j = 0;
    switch (paramzbs.A())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbs.o) {
        if (paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 3: 
      j = 1;
      if (paramBoolean)
      {
        j = 0;
        i = 1;
      }
      if (localzbs.o) {
        if (!paramBoolean)
        {
          i = 1;
          j = 0;
        }
        else
        {
          i = 0;
          j = 1;
        }
      }
      break;
    case 0: 
      i = 1;
      j = 1;
      break;
    }
    if (i != 0) {
      zanv.a(paramzr, paramFloat1, paramFloat2, paramFloat1 + paramzbs.Y(), paramFloat2, paramzbs.g());
    }
    if (j != 0) {
      zanv.a(paramzr, paramFloat1 - paramzbs.Y(), paramFloat2, paramFloat1, paramFloat2, paramzbs.g());
    }
  }
  
  private static void b(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    ArrayList localArrayList1 = paramzbs.l;
    zje localzje = paramzbs.c();
    zanv.a(paramzr, paramFloat, paramzp.d(), paramFloat, paramzp.j(), paramzbs.g());
    float f1 = 0.0F;
    float f2 = paramzbs.F().k();
    int i = 8;
    if (paramzbs.m == 1)
    {
      f1 = paramzp.c() - paramzbs.f - f2;
    }
    else if (paramzbs.m == 2)
    {
      f1 = paramzp.i() + f2;
      i = 7;
    }
    else if (paramzbs.m == 3)
    {
      if (paramBoolean)
      {
        f1 = paramFloat + f2;
        i = 7;
      }
      else
      {
        f1 = paramFloat - f2 - paramzbs.f;
      }
    }
    zbwu localzbwu = paramzbs.F();
    boolean bool1 = false;
    ArrayList localArrayList2;
    ArrayList[] arrayOfArrayList;
    if (paramzbs.d() == 0)
    {
      localArrayList2 = localzje.z().c();
      arrayOfArrayList = localzje.z().e();
      bool1 = localzje.z().a;
    }
    else
    {
      localArrayList2 = localzje.z().d();
      arrayOfArrayList = localzje.z().g();
      bool1 = localzje.z().b;
    }
    int j = 0;
    if ((localzbwu.c()) && (localArrayList2.size() > 0)) {
      j = 1;
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0)) {
      j = 1;
    }
    int k = 0;
    int m = (int)paramzbs.z();
    int n = (int)paramzbs.D();
    int i1 = paramzbs.j();
    if ((localzje.e().f()) || (localzje.u()))
    {
      k = a(i1, m, n, paramzbs.c().U()) + 1;
    }
    else
    {
      k = a(i1, m, n, paramzbs.c().U());
      if (k == 0) {
        k = 1;
      }
    }
    double d = paramzp.f() / k;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    if (paramzbs.p()) {
      f5 = paramzp.d();
    } else {
      f5 = paramzp.d() + paramzp.f();
    }
    int i3;
    for (int i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      i3 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(paramzbs.l.get(i2)));
      i4 = a(i1, i3, n, paramzbs.c().U());
      float f7 = (float)(d * i4);
      f3 = (float)(d * a(i1, a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), i3, paramzbs.c().U()), i3, paramzbs.c().U()));
      if ((paramzbs.f()) || (localzje.u())) {
        f7 += (float)(d / 2.0D);
      }
      if (paramzbs.p())
      {
        f5 += f3;
        f4 = paramzp.d() + f7;
      }
      else
      {
        f5 -= f3;
        f4 = paramzp.d() + paramzp.f() - f7;
      }
      f4 -= paramzbs.g / 2.0F;
      if ((paramzbs.m != 0) && (i2 % paramzbs.H() == 0))
      {
        String str = "";
        Color localColor = localzbwu.h();
        if ((j != 0) && (bool1))
        {
          localObject = "";
          boolean bool2 = false;
          str = a(paramzbs, paramzbs.l.get(i2));
          localColor = zqz.a(paramzbs.l.get(i2), localzbwu.b(), localColor);
          Iterator localIterator = localArrayList2.iterator();
          while (localIterator.hasNext())
          {
            zgm localzgm = (zgm)localIterator.next();
            if (ziy.a(localzgm.a(), localzje.U()) == ze.f(paramzbs.l.get(i2)))
            {
              localObject = localzgm.c();
              bool2 = localzgm.b();
              str = zqz.a(paramzbs.c().an(), paramzbs.l.get(i2), (String)localObject, bool2, localzje.U());
              localColor = zqz.a(paramzbs.l.get(i2), (String)localObject, localColor);
              break;
            }
          }
        }
        else
        {
          str = a(paramzbs, paramzbs.l.get(i2));
          localColor = zqz.a(paramzbs.l.get(i2), localzbwu.b(), localColor);
        }
        Object localObject = new zq(f1, f4, paramzbs.f, paramzbs.g);
        a(paramzr, com.aspose.cells.b.a.b.zp.a((zq)localObject), str, localzbwu.e(), localzbwu.a(), localColor, i, 1);
      }
      if (i2 == 0)
      {
        float f8;
        if (paramzbs.p()) {
          f8 = paramzp.d();
        } else {
          f8 = paramzp.j();
        }
        a(paramzr, paramzbs, paramBoolean, paramFloat, f8);
      }
      if ((i2 % paramzbs.J() == 0) && (f5 + c >= paramzp.d()) && (f5 - c <= paramzp.d() + paramzp.f())) {
        a(paramzr, paramzbs, paramBoolean, paramFloat, f5);
      }
    }
    float f6;
    if (paramzbs.p()) {
      f6 = paramzp.d();
    } else {
      f6 = paramzp.d() + paramzp.f();
    }
    int i4 = n;
    int i5 = a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), n, paramzbs.c().U());
    do
    {
      i3 = 1;
      int i6 = a(paramzbs.j(), paramzbs.C(), (int)paramzbs.B(), i4, paramzbs.c().U());
      if (i6 == i5)
      {
        i3 = 0;
        i5 = a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), i5, paramzbs.c().U());
      }
      if (i6 >= i5) {
        i5 = a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), i5, paramzbs.c().U());
      }
      float f9 = (float)(d * a(i1, i6, i4, paramzbs.c().U()));
      if (paramzbs.p()) {
        f6 += f9;
      } else {
        f6 -= f9;
      }
      if ((i3 != 0) && (f6 >= paramzp.d()) && (f6 <= paramzp.d() + paramzp.f())) {
        c(paramzr, paramzbs, paramBoolean, paramFloat, f6, paramzp);
      }
      i4 = i6;
    } while ((f6 >= paramzp.d()) && (f6 <= paramzp.d() + paramzp.f()));
  }
  
  static void c(zr paramzr, zbs paramzbs, boolean paramBoolean, float paramFloat, com.aspose.cells.b.a.b.zp paramzp, zbfc paramzbfc)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    zje localzje = paramzbs.c();
    zanv.a(paramzr, paramzp.c(), paramFloat, paramzp.i(), paramFloat, paramzbs.g());
    zsp localzsp = paramzbs.Q();
    float f1 = 0.0F;
    float f2 = paramzbs.F().k();
    if (paramzbs.m == 1)
    {
      f1 = paramzp.j() + f2;
      localzsp.b().b.b((int)(f1 + paramzbs.g));
    }
    else if (paramzbs.m == 2)
    {
      f1 = paramzp.d() - f2 - paramzbs.g;
      localzsp.b().b.b((int)f1 - localzsp.b().b.f());
    }
    else if (paramzbs.m == 3)
    {
      if (paramBoolean)
      {
        f1 = paramFloat - f2 - paramzbs.g;
        localzsp.b().b.b((int)f1 - localzsp.b().b.f());
      }
      else
      {
        f1 = paramFloat + f2;
        localzsp.b().b.b((int)(f1 + paramzbs.g));
      }
    }
    localzsp.b().b.a(paramzp.i() - localzsp.b().b.e());
    zbwu localzbwu = paramzbs.F();
    zke localzke = paramzbfc.D().b(0);
    String str1 = localzke != null ? localzke.u() : "";
    boolean bool = localzke != null ? localzke.v() : true;
    int i = 0;
    if ((localzbwu.c()) && (localzke != null)) {
      i = 1;
    }
    ArrayList localArrayList = paramzbs.l;
    double d1 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
    double d2 = paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D();
    double d3 = paramzbs.n() ? zbxz.e(paramzbs.x()) : paramzbs.x();
    int j;
    double d4;
    double d5;
    float f3;
    String str2;
    Color localColor;
    zq localzq;
    if (!paramzbs.p()) {
      for (j = 0; j < localArrayList.size(); j++)
      {
        d4 = ze.g(localArrayList.get(j));
        d5 = paramzbs.n() ? zbxz.f(d4) : d4;
        if (j - 1 > 0 ? Math.abs(zbxz.b(d4, ze.g(localArrayList.get(j - 1)))) != d3 : (j + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d4, ze.g(localArrayList.get(j + 1)))) == d3))
        {
          f3 = (float)(paramzp.c() + (d4 - d2) / (d1 - d2) * paramzp.e());
          if (paramzbs.m != 0)
          {
            str2 = "";
            localColor = localzbwu.h();
            d5 = paramzbs.n() ? d5 : d5 * Math.pow(10.0D, paramzbs.Q().f());
            if (i != 0)
            {
              str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d5), str1, bool, localzje.U());
              localColor = zqz.a(Double.valueOf(d5), str1, localColor);
            }
            else
            {
              str2 = a(paramzbs, Double.valueOf(d5));
              localColor = zqz.a(Double.valueOf(d5), localzbwu.b(), localColor);
            }
            localzq = new zq(f3 - paramzbs.f / 2.0F, f1, paramzbs.f, paramzbs.g);
            a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str2, localzbwu.e(), localzbwu.a(), localColor, 1, 1);
          }
          a(paramzr, paramzbs, paramBoolean, f3, paramFloat, paramzp);
        }
      }
    } else {
      for (j = localArrayList.size() - 1; j >= 0; j--)
      {
        d4 = ze.g(localArrayList.get(j));
        d5 = paramzbs.n() ? zbxz.f(d4) : d4;
        if (j - 1 > 0 ? Math.abs(zbxz.b(d4, ze.g(localArrayList.get(j - 1)))) != d3 : (j + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d4, ze.g(localArrayList.get(j + 1)))) == d3))
        {
          f3 = (float)(paramzp.c() + (d1 - d4) / (d1 - d2) * paramzp.e());
          if (paramzbs.m != 0)
          {
            str2 = "";
            localColor = localzbwu.h();
            d5 = paramzbs.n() ? d5 : d5 * Math.pow(10.0D, paramzbs.Q().f());
            if (i != 0)
            {
              str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d5), str1, bool, localzje.U());
              localColor = zqz.a(Double.valueOf(d5), str1, localColor);
            }
            else
            {
              str2 = a(paramzbs, Double.valueOf(d5));
              localColor = zqz.a(Double.valueOf(d5), localzbwu.b(), localColor);
            }
            localzq = new zq(f3 - paramzbs.f / 2.0F, f1, paramzbs.f, paramzbs.g);
            a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str2, localzbwu.e(), localzbwu.a(), localColor, 1, 1);
          }
          a(paramzr, paramzbs, paramBoolean, f3, paramFloat, paramzp);
        }
      }
    }
    a(paramzr, paramzbs, paramBoolean, paramFloat, paramzp.c(), paramzp.i(), paramzp);
    zbwz.a(paramzbs.c(), localzsp);
  }
  
  static void a(zr paramzr, zbfe paramzbfe, zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    int i = paramzbs.E() == 3 ? 0 : 1;
    if (i == 0) {
      return;
    }
    zje localzje = paramzbs.c();
    zbwu localzbwu = paramzbs.F();
    zbfc localzbfc = paramzbfe.c(0);
    ArrayList localArrayList;
    ArrayList[] arrayOfArrayList;
    if (paramzbs.d() == 0)
    {
      localArrayList = localzje.z().c();
      arrayOfArrayList = localzje.z().e();
    }
    else
    {
      localArrayList = localzje.z().d();
      arrayOfArrayList = localzje.z().g();
    }
    float f = paramzbs.F().k();
    int j = ziy.a(paramzbfe.i());
    double d1 = 6.283185307179586D / j;
    double d2 = paramzp.c() + paramzp.e() / 2.0D;
    double d3 = paramzp.d() + paramzp.f() / 2.0D;
    zo localzo = new zo((float)d2, (float)d3);
    double d4 = 1.5707963267948966D + d1;
    double d5 = paramzp.e() / 2;
    for (int k = 0; k < j; k++)
    {
      d4 -= d1;
      String str = "";
      Color localColor = localzbwu.h();
      zt localzt = new zt(paramzbs.f, paramzbs.g);
      if ((localzbwu.c()) && (localArrayList.size() > 0))
      {
        localObject = "";
        boolean bool = false;
        localObject = k < localArrayList.size() ? ((zgm)localArrayList.get(k)).c() : "";
        bool = k < localArrayList.size() ? ((zgm)localArrayList.get(k)).b() : false;
        str = zqz.a(paramzbs.c().an(), paramzbs.l.get(k), (String)localObject, bool, localzje.U());
        localColor = zqz.a(paramzbs.l.get(k), (String)localObject, localColor);
      }
      else
      {
        str = a(paramzbs, paramzbs.l.get(k));
        localColor = zqz.a(paramzbs.l.get(k), localzbwu.b(), localColor);
      }
      Object localObject = localzbwu.a();
      int m = localzbwu.e();
      com.aspose.cells.b.a.b.zs localzs = zbvx.a(paramzbs.c().ar(), str, m, (zg)localObject, localzt, 1, 1);
      double d6 = (d5 + f) * Math.cos(d4);
      double d7 = (d5 + f) * Math.sin(d4);
      double d8 = d4 / 3.141592653589793D * 180.0D;
      if ((d8 >= -135.0D) && (d8 <= -45.0D)) {
        d6 = (float)(d6 + (d8 - -45.0D) * localzs.b() / 90.0D);
      } else if ((d8 <= -225.0D) && (d8 >= -270.0D)) {
        d6 = (float)(d6 - (d8 - -315.0D) * localzs.b() / 90.0D);
      } else if ((d8 <= 90.0D) && (d8 >= 45.0D)) {
        d6 = (float)(d6 - (d8 - 45.0D) * localzs.b() / 90.0D);
      } else if ((d8 <= -135.0D) && (d8 >= -225.0D)) {
        d6 -= localzs.b();
      }
      if ((d8 >= -225.0D) && (d8 <= -135.0D)) {
        d7 = (float)(d7 - (d8 - -135.0D) * localzs.c() / 90.0D);
      } else if ((d8 >= -45.0D) && (d8 <= 45.0D)) {
        d7 = (float)(d7 + (d8 + 45.0D) * localzs.c() / 90.0D);
      } else if (((d8 <= -225.0D) && (d8 >= -270.0D)) || ((d8 <= 90.0D) && (d8 >= 45.0D))) {
        d7 += localzs.c();
      }
      d6 = d2 + d6;
      d7 = d3 - d7;
      com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp((int)d6, (int)d7, localzs.b(), localzs.c());
      a(paramzr, localzp, str, m, (zg)localObject, localColor, 1, 1);
    }
  }
  
  static void b(zr paramzr, zbfe paramzbfe, zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (!paramzbs.q()) {
      return;
    }
    zje localzje = paramzbs.c();
    zbfc localzbfc = paramzbfe.c(0);
    zbwu localzbwu = paramzbs.F();
    zke localzke = localzbfc.D().b(0);
    int i = 0;
    if ((localzbwu.c()) && (localzke != null)) {
      i = 1;
    }
    int j = ziy.a(paramzbfe.i());
    double d1 = 6.283185307179586D / j;
    double d2 = paramzp.c() + paramzp.e() / 2.0D;
    double d3 = paramzp.d() + paramzp.f() / 2.0D;
    zo localzo1 = new zo((float)d2, (float)d3);
    double d4 = 1.5707963267948966D + d1;
    double d5 = paramzp.e() / 2;
    for (int k = 0; k < j; k++)
    {
      d4 -= d1;
      double d7 = d4 / 3.141592653589793D * 180.0D;
      double d9 = d2 + d5 * Math.cos(d4);
      double d11 = d3 - d5 * Math.sin(d4);
      zo localzo2 = new zo((float)d9, (float)d11);
      zanv.a(paramzr, localzo2, localzo1, paramzbs.g());
    }
    double d6 = 0.0D;
    Collections.sort(paramzbs.l);
    double d8 = paramzbs.S();
    double d10 = paramzbs.T();
    double d12 = paramzbs.V();
    double d13 = paramzbs.W();
    ArrayList localArrayList = paramzbs.l;
    double d14;
    double d15;
    double d17;
    double d18;
    Object localObject;
    if ((paramzbs.q()) && (paramzbs.E() != 3)) {
      for (int m = 0; m < paramzbs.l.size(); m++)
      {
        d14 = ze.g(localArrayList.get(m));
        d15 = paramzbs.n() ? zbxz.f(d14) : d14;
        if (m - 1 > 0 ? Math.abs(zbxz.b(d14, ze.g(localArrayList.get(m - 1)))) != d12 : (m + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d14, ze.g(localArrayList.get(m + 1)))) == d12))
        {
          d6 = Math.abs(d14 - d10);
          double d16 = d5 * d6 / (d8 - d10);
          d17 = d2 + d16 * Math.cos(1.5707963267948966D);
          d18 = d3 - d16 * Math.sin(1.5707963267948966D);
          d15 = paramzbs.n() ? d15 : d15 * Math.pow(10.0D, paramzbs.Q().f());
          String str = a(paramzbs, Double.valueOf(d15));
          Color localColor = paramzbs.F().h();
          localColor = zqz.a(Double.valueOf(d15), paramzbs.F().b(), localColor);
          if (i != 0)
          {
            str = zqz.a(paramzbs.c().an(), Double.valueOf(d15), localzke.A(), localzke.B(), localzje.U());
            localColor = zqz.a(Double.valueOf(d15), localzke.A(), localColor);
          }
          zg localzg = paramzbs.F().a();
          int i1 = paramzbs.F().e();
          localObject = zbvx.b(paramzbs.c().ar(), str, i1, localzg, paramzp.b(), 1, 1);
          ((com.aspose.cells.b.a.b.zs)localObject).a(((com.aspose.cells.b.a.b.zs)localObject).b() + paramzbs.Z() * 2);
          d17 = d17 - ((com.aspose.cells.b.a.b.zs)localObject).b() - paramzbs.c().a() * 0.011D;
          d18 -= ((com.aspose.cells.b.a.b.zs)localObject).c() / 2;
          com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp((int)d17, (int)d18, ((com.aspose.cells.b.a.b.zs)localObject).b(), ((com.aspose.cells.b.a.b.zs)localObject).c());
          a(paramzr, localzp, str, i1, localzg, localColor, 1, 1, zv.c());
          d4 = 1.5707963267948966D;
        }
      }
    }
    zbs localzbs = paramzbs;
    zo localzo3;
    int n;
    double d19;
    double d20;
    double d21;
    double d22;
    zo localzo4;
    if ((localzbs.c().g) && (localzbs == localzbs.c().E()))
    {
      d6 = 0.0D;
      d8 = localzbs.n() ? zbxz.e(localzbs.b) : localzbs.b;
      d10 = localzbs.n() ? zbxz.e(localzbs.c) : localzbs.c;
      d12 = localzbs.n() ? zbxz.e(localzbs.d) : localzbs.d;
      d13 = localzbs.n() ? zbxz.e(localzbs.e) : localzbs.e;
      if (d12 > 0.0D) {
        for (d14 = d10 + d12; d14 <= d8; d14 = zbxz.c(d14, d12))
        {
          d6 = Math.abs(d14 - d10);
          d15 = d5 * d6 / (d8 - d10);
          d4 = 1.5707963267948966D;
          localzo3 = zo.a();
          for (n = 0; n < j; n++)
          {
            if ((!localzbs.s().e()) && (localzbs.w() != 2) && (!localzbs.u().e()) && (localzbs.q()))
            {
              d17 = Math.atan(localzbs.X() / d15);
              d18 = Math.sqrt(Math.pow(d15, 2.0D) + Math.pow(localzbs.X(), 2.0D));
              d19 = d2 + d18 * Math.cos(d4 + d17);
              d20 = d3 - d18 * Math.sin(d4 + d17);
              localObject = new zo((float)d19, (float)d20);
              d21 = d2 + d18 * Math.cos(d4 - d17);
              d22 = d3 - d18 * Math.sin(d4 - d17);
              localzo4 = new zo((float)d21, (float)d22);
              zanv.a(paramzr, (zo)localObject, localzo4, localzbs.g());
            }
            d4 -= d1;
          }
        }
      }
      if (d13 > 0.0D) {
        for (d14 = d10 + d13; d14 <= d8; d14 = zbxz.c(d14, d13))
        {
          d6 = Math.abs(d14 - d10);
          d15 = d5 * d6 / (d8 - d10);
          d4 = 1.5707963267948966D;
          localzo3 = zo.a();
          for (n = 0; n < j; n++)
          {
            if ((!localzbs.u().e()) && (localzbs.A() != 2) && (localzbs.q()))
            {
              d17 = Math.atan(localzbs.Y() / d15);
              d18 = Math.sqrt(Math.pow(d15, 2.0D) + Math.pow(localzbs.Y(), 2.0D));
              d19 = d2 + d18 * Math.cos(d4 + d17);
              d20 = d3 - d18 * Math.sin(d4 + d17);
              localObject = new zo((float)d19, (float)d20);
              d21 = d2 + d18 * Math.cos(d4 - d17);
              d22 = d3 - d18 * Math.sin(d4 - d17);
              localzo4 = new zo((float)d21, (float)d22);
              zanv.a(paramzr, (zo)localObject, localzo4, localzbs.g());
            }
            d4 -= d1;
          }
        }
      }
    }
    else
    {
      d6 = 0.0D;
      d8 = localzbs.S();
      d10 = localzbs.T();
      d12 = localzbs.V();
      d13 = localzbs.W();
      if (d12 > 0.0D) {
        for (d14 = d10 + d12; d14 <= d8; d14 = zbxz.c(d14, d12))
        {
          d6 = Math.abs(d14 - d10);
          d15 = d5 * d6 / (d8 - d10);
          d4 = 1.5707963267948966D;
          localzo3 = zo.a();
          for (n = 0; n < j; n++)
          {
            if ((!localzbs.s().e()) && (localzbs.w() != 2) && (!localzbs.u().e()) && (localzbs.q()))
            {
              d17 = Math.atan(localzbs.X() / d15);
              d18 = Math.sqrt(Math.pow(d15, 2.0D) + Math.pow(localzbs.X(), 2.0D));
              d19 = d2 + d18 * Math.cos(d4 + d17);
              d20 = d3 - d18 * Math.sin(d4 + d17);
              localObject = new zo((float)d19, (float)d20);
              d21 = d2 + d18 * Math.cos(d4 - d17);
              d22 = d3 - d18 * Math.sin(d4 - d17);
              localzo4 = new zo((float)d21, (float)d22);
              zanv.a(paramzr, (zo)localObject, localzo4, localzbs.g());
            }
            d4 -= d1;
          }
        }
      }
      if (d13 > 0.0D) {
        for (d14 = d10 + d13; d14 <= d8; d14 = zbxz.c(d14, d13))
        {
          d6 = Math.abs(d14 - d10);
          d15 = d5 * d6 / (d8 - d10);
          d4 = 1.5707963267948966D;
          localzo3 = zo.a();
          for (n = 0; n < j; n++)
          {
            if ((!localzbs.u().e()) && (localzbs.A() != 2) && (localzbs.q()))
            {
              d17 = Math.atan(localzbs.Y() / d15);
              d18 = Math.sqrt(Math.pow(d15, 2.0D) + Math.pow(localzbs.Y(), 2.0D));
              d19 = d2 + d18 * Math.cos(d4 + d17);
              d20 = d3 - d18 * Math.sin(d4 + d17);
              localObject = new zo((float)d19, (float)d20);
              d21 = d2 + d18 * Math.cos(d4 - d17);
              d22 = d3 - d18 * Math.sin(d4 - d17);
              localzo4 = new zo((float)d21, (float)d22);
              zanv.a(paramzr, (zo)localObject, localzo4, localzbs.g());
            }
            d4 -= d1;
          }
        }
      }
    }
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, zbs paramzbs, zbfc paramzbfc, boolean paramBoolean)
    throws Exception
  {
    if ((!paramzbs.q()) || (paramzbs.E() == 3) || (paramzbs.c().B().D())) {
      return new com.aspose.cells.b.a.b.zs(0, 0);
    }
    zje localzje = paramzbs.c();
    zke localzke = paramzbfc.D().b(0);
    int i = paramzbfc.ag();
    zbwu localzbwu = paramzbs.F();
    String str1 = localzke != null ? localzke.A() : "";
    boolean bool = localzke != null ? localzke.B() : true;
    int j = 0;
    if ((localzbwu.c()) && (localzke != null)) {
      j = 1;
    }
    int k = 0;
    int m = 0;
    ArrayList localArrayList = paramzbs.l;
    double d1 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
    double d2 = paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D();
    double d3 = paramzbs.n() ? zbxz.e(paramzbs.x()) : paramzbs.x();
    double d4 = 1.0E-10D;
    for (int n = 0; n < paramzbs.l.size(); n++)
    {
      double d5 = ze.g(localArrayList.get(n));
      double d6 = paramzbs.n() ? zbxz.f(d5) : d5;
      if (n - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d5, ze.g(localArrayList.get(n - 1)))))) / d3 > 1.0E10D : (n + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d5, ze.g(localArrayList.get(n + 1)))))) / d4 <= 1.0E10D))
      {
        if (paramzbs.ac())
        {
          d6 /= 100.0D;
          str1 = "0%";
        }
        String str2 = "";
        d6 = paramzbs.n() ? d6 : d6 * Math.pow(10.0D, paramzbs.Q().f());
        Color localColor = localzbwu.h();
        if (j != 0)
        {
          str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d6), str1, bool, localzje.U());
          localColor = zqz.a(Double.valueOf(d6), str1, localColor);
        }
        else
        {
          str2 = a(paramzbs, Double.valueOf(d6));
          localColor = zqz.a(Double.valueOf(d6), localzbwu.b(), localColor);
        }
        com.aspose.cells.b.a.b.zs localzs = com.aspose.cells.b.a.b.zs.a();
        localzs = zbvx.b(paramzbs.c().ar(), str2, localzbwu.e(), localzbwu.a(), paramzbs.c().B().b.b(), 1, 1);
        localzs.a(localzs.b() + paramzbs.Z() * 2);
        if (localzs.b() > k) {
          k = localzs.b();
        }
        if (localzs.c() > m) {
          m = localzs.c();
        }
      }
    }
    if (paramBoolean) {
      m += (int)(2 * paramzbs.X() + 0.5D);
    } else {
      k += (int)(2 * paramzbs.X() + 0.5D);
    }
    paramzbs.f = k;
    paramzbs.g = m;
    return new com.aspose.cells.b.a.b.zs(k, m);
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp, int paramInt, boolean paramBoolean, zbfc paramzbfc)
    throws Exception
  {
    if ((!paramzbs.q()) || (paramzbs.E() == 3) || (zbxz.a(paramzp))) {
      return new com.aspose.cells.b.a.b.zs(0, 0);
    }
    int i = 0;
    if (paramzbs.k() == 2)
    {
      i = 1;
      paramzbs.f(false);
      paramzbs.k(1);
    }
    ArrayList localArrayList1 = (ArrayList)paramzbs.l.clone();
    if (paramzbs.n()) {
      for (int j = 0; j < localArrayList1.size(); j++) {
        localArrayList1.set(j, Double.valueOf(zbxz.f(ze.g(localArrayList1.get(j)))));
      }
    }
    zje localzje = paramzbs.c();
    boolean bool1 = false;
    ArrayList localArrayList2;
    ArrayList[] arrayOfArrayList;
    if (paramzbs.d() == 0)
    {
      localArrayList2 = localzje.z().c();
      arrayOfArrayList = localzje.z().e();
      bool1 = localzje.z().a;
    }
    else
    {
      localArrayList2 = localzje.z().d();
      arrayOfArrayList = localzje.z().g();
      bool1 = localzje.z().b;
    }
    int k = 0;
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0) && (paramzbs.m != 0)) {
      k = 1;
    }
    zbwu localzbwu = paramzbs.F();
    float f1 = zkn.a(localzje, paramBoolean);
    String str1 = paramzbfc.D().a(0).u();
    boolean bool2 = paramzbfc.D().a(0).v();
    String str2 = "";
    boolean bool3 = false;
    int m = 0;
    if ((paramzbfc.ag() == 60) || (paramzbfc.ag() == 12))
    {
      if (localzbwu.c()) {
        m = 1;
      }
    }
    else
    {
      if ((localzbwu.c()) && (localArrayList2.size() > 0)) {
        m = 1;
      }
      if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0)) {
        m = 1;
      }
    }
    zt localzt1 = new zt(0.0F, 0.0F);
    int n = 0;
    if (i == 0)
    {
      if ((paramzbs.f()) || (localzje.u()))
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
    }
    else {
      n = localArrayList1.size();
    }
    int i1 = b(paramzbs);
    int i2 = 1;
    if (!paramzbfc.aw())
    {
      float f2;
      if (paramBoolean)
      {
        if (paramzp.f() / n < 1.0F)
        {
          f2 = paramzp.f() / n * 10.0F;
          i2 *= 10;
          if (f2 < 1.0F)
          {
            f2 = paramzp.e() / n * 10.0F;
            i2 *= 10;
          }
        }
      }
      else if (paramzp.e() / n < 1.0F)
      {
        f2 = paramzp.e() / n * 10.0F;
        i2 *= 10;
        if (f2 < 1.0F)
        {
          f2 = paramzp.e() / n * 10.0F;
          i2 *= 10;
        }
      }
    }
    int i3 = 0;
    int i4 = 0;
    double d1 = 0;
    double d2 = 0;
    float f3;
    int i6;
    int i8;
    float f6;
    int i10;
    Object localObject3;
    int i12;
    Object localObject5;
    if (localzbwu.j())
    {
      f3 = 0.55F;
      i6 = 0;
      i8 = 0;
      f6 = 0.0F;
      i10 = 0;
      localObject3 = zbvx.a(paramzr, "a", localzbwu.a());
      i12 = 0;
      localObject5 = new float[localArrayList1.size()][2];
      com.aspose.cells.b.a.b.zs[] arrayOfzs = new com.aspose.cells.b.a.b.zs[localArrayList1.size()];
      String[] arrayOfString = new String[localArrayList1.size()];
      double d4;
      for (;;)
      {
        i3 = 0;
        i4 = 0;
        d1 = 0;
        d2 = 0;
        float f9 = 0.0F;
        if (paramzbfc.aw())
        {
          int i13 = localArrayList1.size() - 1;
          if (i13 <= 0) {
            i13 = 1;
          }
          zt localzt2 = zbvx.d(paramzr, "3", localzbwu.a());
          if (paramBoolean)
          {
            localzt1.b(paramzp.f() / i13);
            localzt1.a(paramzp.e() * f3);
            localzt1.b(localzt1.c() + zbxz.a(localzt2.c()));
            f9 = localzt1.c();
          }
          else
          {
            localzt1.a(paramzp.e() / i13);
            localzt1.b(paramzp.f() * f3);
            localzt1.a(localzt1.b() + zbxz.a(localzt2.b()));
            f9 = localzt1.b();
          }
        }
        else if (paramBoolean)
        {
          localzt1.b(paramzp.f() / n * paramzbs.H());
          localzt1.a(paramzp.e() * f3);
          if (paramzbs.I()) {
            if ((Math.abs(localzbwu.e()) == 0) && (paramzbs.H() < n))
            {
              if (localzt1.c() < ((com.aspose.cells.b.a.b.zs)localObject3).c()) {
                paramzbs.k(paramzbs.H() + i2);
              }
            }
            else if ((Math.abs(localzbwu.e()) == 90) && (localzt1.c() < ((com.aspose.cells.b.a.b.zs)localObject3).b()) && (paramzbs.H() < n))
            {
              paramzbs.k(paramzbs.H() + i2);
              continue;
            }
          }
          f9 = localzt1.c();
        }
        else
        {
          if (i1 > paramzbs.H()) {
            localzt1.a(paramzp.e() / n * i1);
          } else {
            localzt1.a(paramzp.e() / n * paramzbs.H());
          }
          localzt1.b(paramzp.f() * f3);
          if (paramzbs.I()) {
            if (Math.abs(localzbwu.e()) == 0)
            {
              if (localzt1.b() < ((com.aspose.cells.b.a.b.zs)localObject3).b()) {
                paramzbs.k(paramzbs.H() + i2);
              }
            }
            else if ((Math.abs(localzbwu.e()) == 90) && (localzt1.b() < ((com.aspose.cells.b.a.b.zs)localObject3).c()))
            {
              paramzbs.k(paramzbs.H() + i2);
              continue;
            }
          }
          f9 = localzt1.b();
        }
        float f10 = 0.0F;
        if (localzbwu.e() == 45) {
          if (paramzbfc.aw())
          {
            int i14 = localArrayList1.size() - 1;
            if (i14 <= 0) {
              i14 = 1;
            }
            if (paramBoolean) {
              f10 = paramzp.f() / i14;
            } else {
              f10 = paramzp.e() / i14;
            }
          }
          else if (paramBoolean)
          {
            f10 = paramzp.f() / n;
          }
          else
          {
            f10 = paramzp.e() / n;
          }
        }
        float f12 = 0.0F;
        float f13 = 0.0F;
        for (int i15 = 0; i15 < localArrayList1.size(); i15++)
        {
          if (localzbwu.e() == 45)
          {
            int i16 = localArrayList1.size() - 1 - i15;
            if (paramBoolean)
            {
              if (paramzbs.p())
              {
                if (localzbwu.e() > 0)
                {
                  localzt1.a(paramzp.e() * f3);
                  localzt1.b(paramzp.f() - i15 * f10 - f10 / 2.0F);
                }
                else
                {
                  localzt1.a(paramzp.e() * f3);
                  localzt1.b(paramzp.f() - i16 * f10 - f10 / 2.0F);
                }
              }
              else if (localzbwu.e() > 0)
              {
                localzt1.a(paramzp.e() * f3);
                localzt1.b(paramzp.f() - i16 * f10 - f10 / 2.0F);
              }
              else
              {
                localzt1.a(paramzp.e() * f3);
                localzt1.b(paramzp.f() - i15 * f10 - f10 / 2.0F);
              }
            }
            else if (paramzbs.p())
            {
              if (localzbwu.e() > 0)
              {
                localzt1.a(paramzp.e() - i15 * f10 - f10 / 2.0F);
                localzt1.b(paramzp.f() * f3);
              }
              else
              {
                localzt1.a(paramzp.e() - i16 * f10 - f10 / 2.0F);
                localzt1.b(paramzp.f() * f3);
              }
            }
            else if (localzbwu.e() > 0)
            {
              localzt1.a(paramzp.e() - i16 * f10 - f10 / 2.0F);
              localzt1.b(paramzp.f() * f3);
            }
            else
            {
              localzt1.a(paramzp.e() - i15 * f10 - f10 / 2.0F);
              localzt1.b(paramzp.f() * f3);
            }
            if (localzt1.b() < paramzp.e() * f3) {
              localzt1.a(paramzp.e() * f3);
            }
            if (localzt1.c() < paramzp.f() * f3) {
              localzt1.b(paramzp.f() * f3);
            }
          }
          if ((i15 == 0) && (i12 <= 0)) {
            paramzbs.F().d(zbxz.a(((com.aspose.cells.b.a.b.zs)localObject3).b() * paramzbs.F().d() / f1));
          }
          String str4;
          if ((i12 <= 0) || (arrayOfString[i15] == null))
          {
            str4 = "";
            if (i != 0)
            {
              if ((m != 0) && (bool1))
              {
                str4 = a(paramzbs, localArrayList1.get(i15));
                Iterator localIterator2 = localArrayList2.iterator();
                while (localIterator2.hasNext())
                {
                  zgm localzgm2 = (zgm)localIterator2.next();
                  if (ziy.a(localzgm2.a(), localzje.U()) == ze.f(localArrayList1.get(i15)))
                  {
                    str2 = localzgm2.c();
                    bool3 = localzgm2.b();
                    str4 = zqz.a(paramzbs.c().an(), localArrayList1.get(i15), str2, bool3, localzje.U());
                    break;
                  }
                }
              }
              else
              {
                str4 = a(paramzbs, localArrayList1.get(i15));
              }
            }
            else if (m != 0)
            {
              str2 = i15 < localArrayList2.size() ? ((zgm)localArrayList2.get(i15)).c() : "";
              bool3 = i15 < localArrayList2.size() ? ((zgm)localArrayList2.get(i15)).b() : false;
              if ((paramzbfc.aw()) && (!paramzbs.p)) {
                str4 = zqz.a(paramzbs.c().an(), Double.valueOf(ze.g(localArrayList1.get(i15)) * Math.pow(10.0D, paramzbs.Q().f())), str1, bool2, localzje.U());
              } else {
                str4 = zqz.a(paramzbs.c().an(), localArrayList1.get(i15), str2, bool3, localzje.U());
              }
            }
            else
            {
              str4 = a(paramzbs, localArrayList1.get(i15));
            }
            arrayOfString[i15] = str4;
          }
          else
          {
            str4 = arrayOfString[i15];
          }
          float f14;
          float f15;
          if (i12 <= 0)
          {
            f14 = zbvx.c(paramzr, str4, localzbwu.a());
            f15 = zbvx.b(paramzr, str4, localzbwu.a()).b();
            localObject5[i15][0] = f14;
            localObject5[i15][1] = f15;
          }
          else
          {
            f14 = localObject5[i15][0];
            f15 = localObject5[i15][1];
          }
          if (f14 > f12) {
            f12 = f14;
          }
          if (f15 > f13) {
            f13 = f15;
          }
          if ((k != 0) && (localzbwu.e() == 0) && (!paramBoolean)) {
            localzt1.a(localzt1.b() + 1.0F);
          }
          com.aspose.cells.b.a.b.zs localzs3 = new com.aspose.cells.b.a.b.zs(0, 0);
          if ((bool1) || (localzbwu.e() != 0) || (!"".equals(paramzbs.F().b())))
          {
            localzs3 = zbvx.a(paramzr, str4, localzbwu.e(), localzbwu.a(), localzt1, 1, 1);
          }
          else if (i12 <= 0)
          {
            localzs3 = zbvx.a(paramzr, str4, localzbwu.a());
            arrayOfzs[i15] = localzs3;
          }
          else
          {
            localzs3 = arrayOfzs[i15];
          }
          if (localzs3.b() > i3) {
            i3 = localzs3.b();
          }
          if (localzs3.c() > i4) {
            i4 = localzs3.c();
          }
          if (i15 == 0) {
            if (paramBoolean) {
              d1 = localzs3.c() / 2;
            } else {
              d1 = localzs3.b() / 2;
            }
          }
          if (i15 == localArrayList1.size() - 1) {
            if (paramBoolean) {
              d2 = localzs3.c() / 2;
            } else {
              d2 = localzs3.b() / 2;
            }
          }
          if ((k != 0) && (i15 == 0) && (localzbwu.e() == 0) && (!paramBoolean))
          {
            i12--;
            break;
          }
        }
        i12++;
        paramzbs.h = i4;
        paramzbs.i = i3;
        if ((bool1) && (f9 < f12))
        {
          double d5;
          if (paramBoolean)
          {
            if ((localzbwu.e() == 0) && (i4 > ((com.aspose.cells.b.a.b.zs)localObject3).c() * 1.5F))
            {
              localzbwu.b(45);
              continue;
            }
            if (localzbwu.e() == 45)
            {
              d4 = Math.abs(localzbwu.e()) / 180.0D * 3.141592653589793D;
              d5 = f13 * Math.cos(d4) + ((com.aspose.cells.b.a.b.zs)localObject3).c() * Math.sin(d4);
              if (d5 > i3)
              {
                localzbwu.b(90);
                continue;
              }
            }
          }
          else
          {
            if ((localzbwu.e() == 0) && (i4 > ((com.aspose.cells.b.a.b.zs)localObject3).c() * 1.5F))
            {
              localzbwu.b(45);
              continue;
            }
            if (localzbwu.e() == 45)
            {
              d4 = Math.abs(localzbwu.e()) / 180.0D * 3.141592653589793D;
              if (k != 0)
              {
                d5 = f13 * Math.cos(d4) + ((com.aspose.cells.b.a.b.zs)localObject3).c() * Math.sin(d4);
                if (d5 > i3)
                {
                  localzbwu.b(90);
                  continue;
                }
              }
              else
              {
                d5 = f13 * Math.cos(d4) + ((com.aspose.cells.b.a.b.zs)localObject3).c() * Math.sin(d4);
                if ((d5 > paramzp.f() * 0.3F) && (f9 > 2.5D * ((com.aspose.cells.b.a.b.zs)localObject3).c()))
                {
                  localzbwu.b(90);
                  continue;
                }
                double d6 = ((com.aspose.cells.b.a.b.zs)localObject3).c() * Math.cos(d4) * 2.0D + 3.0D;
                if (d6 > f9)
                {
                  localzbwu.b(90);
                  continue;
                }
              }
            }
          }
        }
        else if (paramBoolean)
        {
          if ((localzt1.c() / i4 > 2.5D) && (f3 > 0.2D) && (localzt1.b() * 4.0F / 5.0F > f12)) {
            f3 = f3 * 4.0F / 5.0F;
          }
        }
        else if ((localzt1.b() / i3 > 2.0F) && (f3 > 0.3D))
        {
          f3 = f3 * 4.0F / 5.0F;
          continue;
        }
        if ((!paramzbs.I()) || (i10 != 0)) {
          break;
        }
        if (paramBoolean)
        {
          if (((i3 != i6) || (i4 != i8) || (f6 != localzt1.c())) && (i4 > localzt1.c() - 5.0F) && (paramzbs.H() < n))
          {
            i6 = i3;
            i8 = i4;
            f6 = localzt1.c();
            paramzbs.k(paramzbs.H() + i2);
          }
          else
          {
            if (paramzbs.H() <= 1) {
              break;
            }
            paramzbs.k(paramzbs.H() - i2);
            if (paramzbs.H() < 1) {
              paramzbs.k(1);
            }
            i10 = 1;
          }
        }
        else if (((i3 != i6) || (i4 != i8) || (f6 != localzt1.b())) && (i3 > localzt1.b() - 5.0F) && (paramzbs.H() < n))
        {
          i6 = i3;
          i8 = i4;
          f6 = localzt1.b();
          paramzbs.k(paramzbs.H() + i2);
        }
        else
        {
          if (paramzbs.H() <= 1) {
            break;
          }
          paramzbs.k(paramzbs.H() - i2);
          if (paramzbs.H() < 1) {
            paramzbs.k(1);
          }
          i10 = 1;
        }
      }
      if (paramzbs.p())
      {
        d4 = d1;
        d1 = d2;
        d2 = d4;
      }
    }
    else
    {
      float f7;
      if ((localzbwu.e() == 0) || (localzbwu.e() == 90) || (localzbwu.e() == -90))
      {
        f3 = 0.5F;
        i6 = 0;
        i8 = 0;
        f6 = 0.0F;
        i10 = 0;
        localObject3 = zbvx.a(paramzr, "a", localzbwu.a());
        i12 = 0;
        localObject5 = new String[localArrayList1.size()];
        f7 = 0.0F;
        double d3 = 0;
        Object localObject6;
        zgm localzgm1;
        while (d3 < localArrayList1.size())
        {
          localObject6 = "";
          if (i != 0)
          {
            if ((m != 0) && (bool1))
            {
              localObject6 = a(paramzbs, localArrayList1.get(d3));
              Iterator localIterator1 = localArrayList2.iterator();
              while (localIterator1.hasNext())
              {
                localzgm1 = (zgm)localIterator1.next();
                if (ziy.a(localzgm1.a(), localzje.U()) == ze.f(localArrayList1.get(d3)))
                {
                  str2 = localzgm1.c();
                  bool3 = localzgm1.b();
                  localObject6 = zqz.a(paramzbs.c().an(), localArrayList1.get(d3), str2, bool3, localzje.U());
                  break;
                }
              }
            }
            else
            {
              localObject6 = a(paramzbs, localArrayList1.get(d3));
            }
          }
          else if (m != 0)
          {
            str2 = d3 < localArrayList2.size() ? ((zgm)localArrayList2.get(d3)).c() : "";
            bool3 = d3 < localArrayList2.size() ? ((zgm)localArrayList2.get(d3)).b() : false;
            if ((paramzbfc.aw()) && (!paramzbs.p)) {
              localObject6 = zqz.a(paramzbs.c().an(), Double.valueOf(ze.g(localArrayList1.get(d3)) * Math.pow(10.0D, paramzbs.Q().f())), str1, bool2, localzje.U());
            } else {
              localObject6 = zqz.a(paramzbs.c().an(), localArrayList1.get(d3), str2, bool3, localzje.U());
            }
          }
          else
          {
            localObject6 = a(paramzbs, localArrayList1.get(d3));
          }
          float f11 = zbvx.c(paramzr, (String)localObject6, localzbwu.a());
          if (f11 > f7) {
            f7 = f11;
          }
          d3 += paramzbs.H();
        }
        for (;;)
        {
          i3 = 0;
          i4 = 0;
          d1 = 0;
          d2 = 0;
          if (paramzbfc.aw())
          {
            d3 = localArrayList1.size() - 1;
            if (d3 <= 0) {
              d3 = 1;
            }
            localObject6 = zbvx.d(paramzr, "3", localzbwu.a());
            if (paramBoolean)
            {
              localzt1.b(paramzp.f() / d3);
              localzt1.a(paramzp.e() * f3);
              localzt1.b(localzt1.c() + zbxz.a(((zt)localObject6).c()));
            }
            else
            {
              localzt1.a(paramzp.e() / d3);
              localzt1.b(paramzp.f() * f3);
              localzt1.a(localzt1.b() + zbxz.a(((zt)localObject6).b()));
            }
          }
          else if (paramBoolean)
          {
            localzt1.b(paramzp.f() / n * paramzbs.H());
            localzt1.a(paramzp.e() * f3);
            if (paramzbs.I()) {
              if ((Math.abs(localzbwu.e()) == 0) && (paramzbs.H() < n))
              {
                if (localzt1.c() < ((com.aspose.cells.b.a.b.zs)localObject3).c()) {
                  paramzbs.k(paramzbs.H() + i2);
                }
              }
              else if ((Math.abs(localzbwu.e()) == 90) && (localzt1.c() < ((com.aspose.cells.b.a.b.zs)localObject3).b()) && (paramzbs.H() < n)) {
                paramzbs.k(paramzbs.H() + i2);
              }
            }
          }
          else
          {
            if (i1 > paramzbs.H()) {
              localzt1.a(paramzp.e() / n * i1);
            } else {
              localzt1.a(paramzp.e() / n * paramzbs.H());
            }
            localzt1.b(paramzp.f() * f3);
            if (paramzbs.I()) {
              if (Math.abs(localzbwu.e()) == 0)
              {
                if (localzt1.b() < ((com.aspose.cells.b.a.b.zs)localObject3).b()) {
                  paramzbs.k(paramzbs.H() + 1);
                }
              }
              else if ((Math.abs(localzbwu.e()) == 90) && (localzt1.b() < ((com.aspose.cells.b.a.b.zs)localObject3).c()))
              {
                paramzbs.k(paramzbs.H() + i2);
                continue;
              }
            }
            if ((Math.abs(localzbwu.e()) == 0) && ((!paramzbs.I()) || ((paramzbs.I()) && (i10 != 0))) && (localzt1.b() < f7)) {
              localzt1.a(f7);
            }
          }
          d3 = 0;
          while (d3 < localArrayList1.size())
          {
            if ((d3 == 0) && (i12 <= 0)) {
              paramzbs.F().d(zbxz.c(((com.aspose.cells.b.a.b.zs)localObject3).b() * paramzbs.F().d() / f1));
            }
            if ((i12 <= 0) || (localObject5[d3] == null))
            {
              localObject6 = "";
              if (i != 0)
              {
                if ((m != 0) && (bool1))
                {
                  localObject6 = a(paramzbs, localArrayList1.get(d3));
                  localObject7 = localArrayList2.iterator();
                  while (((Iterator)localObject7).hasNext())
                  {
                    localzgm1 = (zgm)((Iterator)localObject7).next();
                    if (ziy.a(localzgm1.a(), localzje.U()) == ze.f(localArrayList1.get(d3)))
                    {
                      str2 = localzgm1.c();
                      bool3 = localzgm1.b();
                      localObject6 = zqz.a(paramzbs.c().an(), localArrayList1.get(d3), str2, bool3, localzje.U());
                      break;
                    }
                  }
                }
                else
                {
                  localObject6 = a(paramzbs, localArrayList1.get(d3));
                }
              }
              else if (m != 0)
              {
                str2 = d3 < localArrayList2.size() ? ((zgm)localArrayList2.get(d3)).c() : "";
                bool3 = d3 < localArrayList2.size() ? ((zgm)localArrayList2.get(d3)).b() : false;
                if ((paramzbfc.aw()) && (!paramzbs.p)) {
                  localObject6 = zqz.a(paramzbs.c().an(), Double.valueOf(ze.g(localArrayList1.get(d3)) * Math.pow(10.0D, paramzbs.Q().f())), str1, bool2, localzje.U());
                } else {
                  localObject6 = zqz.a(paramzbs.c().an(), localArrayList1.get(d3), str2, bool3, localzje.U());
                }
              }
              else
              {
                localObject6 = a(paramzbs, localArrayList1.get(d3));
              }
              localObject5[d3] = localObject6;
            }
            else
            {
              localObject6 = localObject5[d3];
            }
            Object localObject7 = zbvx.a(paramzr, (String)localObject6, localzbwu.e(), localzbwu.a(), localzt1, 1, 1);
            if (((com.aspose.cells.b.a.b.zs)localObject7).b() > i3) {
              i3 = ((com.aspose.cells.b.a.b.zs)localObject7).b();
            }
            if (((com.aspose.cells.b.a.b.zs)localObject7).c() > i4) {
              i4 = ((com.aspose.cells.b.a.b.zs)localObject7).c();
            }
            if (d3 == 0) {
              if (paramBoolean) {
                d1 = ((com.aspose.cells.b.a.b.zs)localObject7).c() / 2;
              } else {
                d1 = ((com.aspose.cells.b.a.b.zs)localObject7).b() / 2;
              }
            }
            if (d3 == localArrayList1.size() - 1) {
              if (paramBoolean) {
                d2 = ((com.aspose.cells.b.a.b.zs)localObject7).c() / 2;
              } else {
                d2 = ((com.aspose.cells.b.a.b.zs)localObject7).b() / 2;
              }
            }
            d3 += paramzbs.H();
          }
          i12++;
          paramzbs.h = i4;
          paramzbs.i = i3;
          if (paramBoolean)
          {
            if ((localzt1.c() / i4 > 2.5D) && (f3 > 0.3D)) {
              f3 = f3 * 4.0F / 5.0F;
            }
          }
          else if ((localzt1.b() / i3 > 2.0F) && (f3 > 0.3D))
          {
            f3 = f3 * 4.0F / 5.0F;
            continue;
          }
          if ((!paramzbs.I()) || (i10 != 0)) {
            break;
          }
          if (paramBoolean)
          {
            if (((i3 != i6) || (i4 != i8)) && (i4 > localzt1.c() - 5.0F) && (paramzbs.H() < n))
            {
              i6 = i3;
              i8 = i4;
              f6 = localzt1.c();
              paramzbs.k(paramzbs.H() + i2);
            }
            else
            {
              if (paramzbs.H() <= 1) {
                break;
              }
              paramzbs.k(paramzbs.H() - i2);
              if (paramzbs.H() < 1) {
                paramzbs.k(1);
              }
              i10 = 1;
            }
          }
          else if (((i3 != i6) || (i4 != i8)) && (i3 > localzt1.b() - 5.0F) && (paramzbs.H() < n))
          {
            i6 = i3;
            i8 = i4;
            f6 = localzt1.b();
            paramzbs.k(paramzbs.H() + i2);
          }
          else
          {
            if (paramzbs.H() <= 1) {
              break;
            }
            paramzbs.k(paramzbs.H() - i2);
            if (paramzbs.H() < 1) {
              paramzbs.k(1);
            }
            i10 = 1;
          }
        }
        if (paramzbs.p())
        {
          d3 = d1;
          d1 = d2;
          d2 = d3;
        }
      }
      else
      {
        Object localObject1;
        Object localObject2;
        if (localzbwu.e() == 255)
        {
          com.aspose.cells.b.a.b.zs localzs1 = zbvx.a(paramzr, "H", localzbwu.a());
          localObject1 = "";
          i8 = 0;
          while (i8 < localArrayList1.size())
          {
            if (i8 == 0) {
              paramzbs.F().d(zbxz.c(localzs1.b() * paramzbs.F().d() / f1));
            }
            String str3 = "";
            if (i != 0)
            {
              if ((m != 0) && (bool1))
              {
                str3 = a(paramzbs, localArrayList1.get(i8));
                localObject2 = localArrayList2.iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  localObject3 = (zgm)((Iterator)localObject2).next();
                  if (ziy.a(((zgm)localObject3).a(), localzje.U()) == ze.f(localArrayList1.get(i8)))
                  {
                    str2 = ((zgm)localObject3).c();
                    bool3 = ((zgm)localObject3).b();
                    str3 = zqz.a(paramzbs.c().an(), localArrayList1.get(i8), str2, bool3, localzje.U());
                    break;
                  }
                }
              }
              else
              {
                str3 = a(paramzbs, localArrayList1.get(i8));
              }
            }
            else if (m != 0)
            {
              str2 = i8 < localArrayList2.size() ? ((zgm)localArrayList2.get(i8)).c() : "";
              bool3 = i8 < localArrayList2.size() ? ((zgm)localArrayList2.get(i8)).b() : false;
              if ((paramzbfc.aw()) && (!paramzbs.p)) {
                str3 = zqz.a(paramzbs.c().an(), Double.valueOf(ze.g(localArrayList1.get(i8)) * Math.pow(10.0D, paramzbs.Q().f())), str1, bool2, localzje.U());
              } else {
                str3 = zqz.a(paramzbs.c().an(), localArrayList1.get(i8), str2, bool3, localzje.U());
              }
            }
            else
            {
              str3 = a(paramzbs, localArrayList1.get(i8));
            }
            if (str3.length() > ((String)localObject1).length()) {
              localObject1 = str3;
            }
            i8 += paramzbs.H();
          }
          i3 = localzs1.b();
          i4 = ((String)localObject1).length() * localzs1.c();
          if (i4 > paramzp.f() / 2) {
            i4 = paramzp.f() / 2;
          }
          paramzbs.h = i4;
          paramzbs.i = i3;
        }
        else
        {
          float f4 = 0.5F;
          localObject1 = zbvx.a(paramzr, "a", localzbwu.a());
          float f5 = 0.0F;
          for (;;)
          {
            if (paramzbfc.aw())
            {
              i9 = localArrayList1.size() - 1;
              if (i9 <= 0) {
                i9 = 1;
              }
              localObject2 = zbvx.d(paramzr, "3", localzbwu.a());
              if (paramBoolean)
              {
                f5 = paramzp.f() / i9;
                f5 += ((zt)localObject2).c();
              }
              else
              {
                f5 = paramzp.e() / i9;
                f5 += ((zt)localObject2).b();
              }
              break;
            }
            if (paramBoolean) {
              f5 = paramzp.f() / n * paramzbs.H();
            } else {
              f5 = paramzp.e() / n * paramzbs.H();
            }
            if ((!paramzbs.I()) || (paramzbs.H() >= n) || (f5 >= ((com.aspose.cells.b.a.b.zs)localObject1).c())) {
              break;
            }
            paramzbs.k(paramzbs.H() + i2);
          }
          for (int i9 = 0; i9 < localArrayList1.size(); i9++)
          {
            int i11 = localArrayList1.size() - 1 - i9;
            if (paramBoolean)
            {
              if (paramzbs.p())
              {
                if (localzbwu.e() > 0)
                {
                  localzt1.a(paramzp.e() * f4);
                  localzt1.b(paramzp.f() - i9 * f5 - f5 / 2.0F);
                }
                else
                {
                  localzt1.a(paramzp.e() * f4);
                  localzt1.b(paramzp.f() - i11 * f5 - f5 / 2.0F);
                }
              }
              else if (localzbwu.e() > 0)
              {
                localzt1.a(paramzp.e() * f4);
                localzt1.b(paramzp.f() - i11 * f5 - f5 / 2.0F);
              }
              else
              {
                localzt1.a(paramzp.e() * f4);
                localzt1.b(paramzp.f() - i9 * f5 - f5 / 2.0F);
              }
            }
            else if (paramzbs.p())
            {
              if (localzbwu.e() > 0)
              {
                localzt1.a(paramzp.e() - i9 * f5 - f5 / 2.0F);
                localzt1.b(paramzp.f() * f4);
              }
              else
              {
                localzt1.a(paramzp.e() - i11 * f5 - f5 / 2.0F);
                localzt1.b(paramzp.f() * f4);
              }
            }
            else if (localzbwu.e() > 0)
            {
              localzt1.a(paramzp.e() - i11 * f5 - f5 / 2.0F);
              localzt1.b(paramzp.f() * f4);
            }
            else
            {
              localzt1.a(paramzp.e() - i9 * f5 - f5 / 2.0F);
              localzt1.b(paramzp.f() * f4);
            }
            if (localzt1.b() < paramzp.e() * f4) {
              localzt1.a(paramzp.e() * f4);
            }
            if (localzt1.c() < paramzp.f() * f4) {
              localzt1.b(paramzp.f() * f4);
            }
            if (i9 == 0) {
              paramzbs.F().d(zbxz.a(((com.aspose.cells.b.a.b.zs)localObject1).b() * paramzbs.F().d() / f1));
            }
            localObject3 = "";
            if (i != 0)
            {
              if ((m != 0) && (bool1))
              {
                localObject3 = a(paramzbs, localArrayList1.get(i9));
                localObject4 = localArrayList2.iterator();
                while (((Iterator)localObject4).hasNext())
                {
                  localObject5 = (zgm)((Iterator)localObject4).next();
                  if (ziy.a(((zgm)localObject5).a(), localzje.U()) == ze.f(localArrayList1.get(i9)))
                  {
                    str2 = ((zgm)localObject5).c();
                    bool3 = ((zgm)localObject5).b();
                    localObject3 = zqz.a(paramzbs.c().an(), localArrayList1.get(i9), str2, bool3, localzje.U());
                    break;
                  }
                }
              }
              else
              {
                localObject3 = a(paramzbs, localArrayList1.get(i9));
              }
            }
            else if (m != 0)
            {
              str2 = i9 < localArrayList2.size() ? ((zgm)localArrayList2.get(i9)).c() : "";
              bool3 = i9 < localArrayList2.size() ? ((zgm)localArrayList2.get(i9)).b() : false;
              if ((paramzbfc.aw()) && (!paramzbs.p)) {
                localObject3 = zqz.a(paramzbs.c().an(), Double.valueOf(ze.g(localArrayList1.get(i9)) * Math.pow(10.0D, paramzbs.Q().f())), str1, bool2, localzje.U());
              } else {
                localObject3 = zqz.a(paramzbs.c().an(), localArrayList1.get(i9), str2, bool3, localzje.U());
              }
            }
            else
            {
              localObject3 = a(paramzbs, localArrayList1.get(i9));
            }
            Object localObject4 = zbvx.a(paramzr, (String)localObject3, localzbwu.e(), localzbwu.a(), localzt1, 1, 1);
            if (((com.aspose.cells.b.a.b.zs)localObject4).b() > i3) {
              i3 = ((com.aspose.cells.b.a.b.zs)localObject4).b();
            }
            if (((com.aspose.cells.b.a.b.zs)localObject4).c() > i4) {
              i4 = ((com.aspose.cells.b.a.b.zs)localObject4).c();
            }
            localObject5 = i3;
            if (paramBoolean) {
              localObject5 = i4;
            }
            float f8;
            switch (paramzbs.a())
            {
            case 0: 
              if (paramzbs.p())
              {
                if (localzbwu.e() > 0)
                {
                  f7 = i11 * f5 + f5 / 2.0F;
                  if (localObject5 > f7)
                  {
                    f8 = localObject5 - f7;
                    if (f8 > d1) {
                      d1 = (int)f8;
                    }
                  }
                }
                else
                {
                  f7 = i9 * f5 + f5 / 2.0F;
                  if (localObject5 > f7)
                  {
                    f8 = localObject5 - f7;
                    if (f8 > d2) {
                      d2 = (int)f8;
                    }
                  }
                }
              }
              else if (localzbwu.e() > 0)
              {
                f7 = i9 * f5 + f5 / 2.0F;
                if (localObject5 > f7)
                {
                  f8 = localObject5 - f7;
                  if (f8 > d1) {
                    d1 = (int)f8;
                  }
                }
              }
              else
              {
                f7 = i11 * f5 + f5 / 2.0F;
                if (localObject5 > f7)
                {
                  f8 = localObject5 - f7;
                  if (f8 > d2) {
                    d2 = (int)f8;
                  }
                }
              }
              break;
            case 3: 
              if (paramzbs.p())
              {
                if (localzbwu.e() < 0)
                {
                  f7 = i11 * f5 + f5 / 2.0F;
                  if (localObject5 > f7)
                  {
                    f8 = localObject5 - f7;
                    if (f8 > d1) {
                      d1 = (int)f8;
                    }
                  }
                }
                else
                {
                  f7 = i9 * f5 + f5 / 2.0F;
                  if (localObject5 > f7)
                  {
                    f8 = localObject5 - f7;
                    if (f8 > d2) {
                      d2 = (int)f8;
                    }
                  }
                }
              }
              else if (localzbwu.e() < 0)
              {
                f7 = i9 * f5 + f5 / 2.0F;
                if (localObject5 > f7)
                {
                  f8 = localObject5 - f7;
                  if (f8 > d1) {
                    d1 = (int)f8;
                  }
                }
              }
              else
              {
                f7 = i11 * f5 + f5 / 2.0F;
                if (localObject5 > f7)
                {
                  f8 = localObject5 - f7;
                  if (f8 > d2) {
                    d2 = (int)f8;
                  }
                }
              }
              break;
            case 1: 
              if (paramzbs.p())
              {
                if (localzbwu.e() > 0)
                {
                  f7 = i11 * f5 + f5 / 2.0F;
                  if (localObject5 > f7)
                  {
                    f8 = localObject5 - f7;
                    if (f8 > d1) {
                      d1 = (int)f8;
                    }
                  }
                }
                else
                {
                  f7 = i9 * f5 + f5 / 2.0F;
                  if (localObject5 > f7)
                  {
                    f8 = localObject5 - f7;
                    if (f8 > d2) {
                      d2 = (int)f8;
                    }
                  }
                }
              }
              else if (localzbwu.e() > 0)
              {
                f7 = i9 * f5 + f5 / 2.0F;
                if (localObject5 > f7)
                {
                  f8 = localObject5 - f7;
                  if (f8 > d1) {
                    d1 = (int)f8;
                  }
                }
              }
              else
              {
                f7 = i11 * f5 + f5 / 2.0F;
                if (localObject5 > f7)
                {
                  f8 = localObject5 - f7;
                  if (f8 > d2) {
                    d2 = (int)f8;
                  }
                }
              }
              break;
            case 2: 
              if (paramzbs.p())
              {
                if (localzbwu.e() < 0)
                {
                  f7 = i11 * f5 + f5 / 2.0F;
                  if (localObject5 > f7)
                  {
                    f8 = localObject5 - f7;
                    if (f8 > d1) {
                      d1 = (int)f8;
                    }
                  }
                }
                else
                {
                  f7 = i9 * f5 + f5 / 2.0F;
                  if (localObject5 > f7)
                  {
                    f8 = localObject5 - f7;
                    if (f8 > d2) {
                      d2 = (int)f8;
                    }
                  }
                }
              }
              else if (localzbwu.e() < 0)
              {
                f7 = i9 * f5 + f5 / 2.0F;
                if (localObject5 > f7)
                {
                  f8 = localObject5 - f7;
                  if (f8 > d1) {
                    d1 = (int)f8;
                  }
                }
              }
              else
              {
                f7 = i11 * f5 + f5 / 2.0F;
                if (localObject5 > f7)
                {
                  f8 = localObject5 - f7;
                  if (f8 > d2) {
                    d2 = (int)f8;
                  }
                }
              }
              break;
            }
          }
          paramzbs.i = i3;
          paramzbs.h = i4;
        }
      }
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0))
    {
      paramzbs.k(1);
      int i5 = 0;
      if (paramBoolean) {
        i5 = 90;
      }
      for (int i7 = 0; i7 < arrayOfArrayList.length; i7++)
      {
        ArrayList localArrayList3 = arrayOfArrayList[i7];
        if (paramBoolean)
        {
          localzt1.b(paramzp.f() / localArrayList3.size());
          localzt1.a(paramzp.e() * 0.5F);
        }
        else
        {
          localzt1.a(paramzp.e() / localArrayList3.size());
          localzt1.b(paramzp.f() * 0.5F);
        }
        com.aspose.cells.b.a.b.zs localzs2 = a(paramzr, localArrayList3, i5, localzbwu, localzt1);
        if (paramBoolean) {
          i3 += localzs2.b();
        } else {
          i4 += localzs2.c();
        }
      }
    }
    paramzbs.f = i3;
    paramzbs.g = i4;
    if (a(paramzbs, paramzbfc))
    {
      if (paramBoolean) {
        paramzbs.j = (i4 / 2.0F);
      } else {
        paramzbs.j = (i3 / 2.0F);
      }
      paramzbs.k = paramzbs.j;
    }
    else if (b(paramzbs, paramzbfc))
    {
      paramzbs.j = d1;
      paramzbs.k = d2;
    }
    return new com.aspose.cells.b.a.b.zs(i3, i4);
  }
  
  private static int b(zbs paramzbs)
  {
    zje localzje = paramzbs.c();
    boolean bool = false;
    ArrayList localArrayList;
    ArrayList[] arrayOfArrayList;
    if (paramzbs.d() == 0)
    {
      localArrayList = localzje.z().c();
      arrayOfArrayList = localzje.z().e();
      bool = localzje.z().a;
    }
    else
    {
      localArrayList = localzje.z().d();
      arrayOfArrayList = localzje.z().g();
      bool = localzje.z().b;
    }
    if (!bool) {
      return 1;
    }
    if (localArrayList.size() == 1) {
      return 1;
    }
    int i = 1;
    int j = Integer.MAX_VALUE;
    float f1 = 0.0F;
    float f2 = 0.0F;
    int k = 1;
    for (int m = 0; m < localArrayList.size(); m++)
    {
      zgm localzgm = (zgm)localArrayList.get(m);
      if ((localzgm.a() == null) || (localzgm.a().equals("")))
      {
        if (k != 0) {
          f1 += 1.0F;
        } else {
          f2 += 1.0F;
        }
      }
      else if (k != 0)
      {
        if (m == 0) {
          f1 = 100.0F;
        }
        if (f1 > 0.0F) {
          k = 0;
        } else {
          return 1;
        }
      }
      else
      {
        if (m == localArrayList.size()) {
          f2 = 100.0F;
        }
        f2 = f1 < f2 / 2.0F ? f1 : f2 / 2.0F;
        f1 = f2;
        i = zbxz.c(f1 + 1.0F + f2);
        if (i <= 1) {
          return 1;
        }
        if (i < j) {
          j = i;
        }
      }
    }
    return j == Integer.MAX_VALUE ? 1 : j;
  }
  
  static boolean a(zbs paramzbs, zbfc paramzbfc)
  {
    if ((!paramzbs.q()) || (paramzbs.E() == 3)) {
      return false;
    }
    if ((paramzbs.d() == 1) || (paramzbs.d() == 3) || (paramzbfc.ag() == 60) || (paramzbfc.ag() == 12)) {
      return true;
    }
    return (!paramzbs.f()) && (paramzbs.F().e() == 0) && (paramzbfc.ag() != 57) && (paramzbfc.ag() != 59);
  }
  
  static boolean b(zbs paramzbs, zbfc paramzbfc)
  {
    if ((!paramzbs.q()) || (paramzbs.E() == 3)) {
      return false;
    }
    if (a(paramzbs, paramzbfc)) {
      return false;
    }
    return ((paramzbs.d() == 0) || (paramzbs.d() == 2)) && (paramzbs.f()) && (paramzbfc.ag() != 57) && (paramzbfc.ag() != 59) && (Math.abs(paramzbs.F().e()) != 90) && (paramzbs.F().e() != 0);
  }
  
  private static com.aspose.cells.b.a.b.zs a(zr paramzr, List paramList, int paramInt, zbwu paramzbwu, zt paramzt)
  {
    zje localzje = paramzbwu.g().c();
    paramzt.a(paramzt.b() + 4.0F);
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramList.size(); k++)
    {
      zgm localzgm = (zgm)paramList.get(k);
      String str = zqz.a(paramzbwu.g().c().an(), localzgm.a(), localzgm.c(), localzgm.b(), localzje.U());
      com.aspose.cells.b.a.b.zs localzs = zbvx.a(paramzr, str, paramInt, paramzbwu.a(), paramzt, 1, 1);
      if (localzs.b() > i) {
        i = localzs.b();
      }
      if (localzs.c() > j) {
        j = localzs.c();
      }
    }
    return new com.aspose.cells.b.a.b.zs(i, j);
  }
  
  static void b(zr paramzr, zbs paramzbs, zbfc paramzbfc, boolean paramBoolean)
  {
    if (paramzbs.E() == 3) {
      return;
    }
    zje localzje = paramzbs.c();
    zke localzke = paramzbfc.D().b(0);
    int i = paramzbfc.ag();
    zbwu localzbwu = paramzbs.F();
    String str1 = localzke != null ? localzke.A() : "";
    boolean bool = localzke != null ? localzke.B() : true;
    int j = 0;
    if ((localzbwu.c()) && (localzke != null)) {
      j = 1;
    }
    int k = 0;
    int m = 0;
    for (int n = 0; n < paramzbs.l.size(); n++) {
      if ((n == 0) || (n == paramzbs.l.size() - 1))
      {
        String str2 = "";
        double d = ((Double)paramzbs.l.get(n)).doubleValue() * Math.pow(10.0D, paramzbs.Q().f());
        if (j != 0)
        {
          if (paramzbs.ac()) {
            str1 = "0%";
          }
          str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d), str1, bool, localzje.U());
        }
        else
        {
          str2 = a(paramzbs, Double.valueOf(d));
        }
        com.aspose.cells.b.a.b.zs localzs = zbvx.a(paramzbs.c().ar(), str2, localzbwu.e(), localzbwu.a(), new zt(paramzbs.c().B().b.e(), paramzbs.c().B().b.f()), 1, 1);
        if (n == 0) {
          if (paramBoolean) {
            m = localzs.b() / 2;
          } else {
            k = localzs.c() / 2;
          }
        }
        if (n == paramzbs.l.size() - 1) {
          if (paramBoolean) {
            k = localzs.b() / 2;
          } else {
            m = localzs.c() / 2;
          }
        }
      }
    }
    if (paramzbs.p())
    {
      n = k;
      k = m;
      m = n;
    }
    paramzbs.j = k;
    paramzbs.k = m;
  }
  
  static DateTime a(double paramDouble, boolean paramBoolean)
  {
    return zbxz.a(paramDouble, paramBoolean);
  }
  
  static int a(DateTime paramDateTime, boolean paramBoolean)
  {
    return (int)zbxz.a(paramDateTime, paramBoolean);
  }
  
  static String a(zbs paramzbs, Object paramObject)
  {
    String str1 = paramzbs.F().b();
    boolean bool1 = paramzbs.F().i();
    boolean bool2 = paramzbs.c().U();
    String str2 = "";
    zje localzje = paramzbs.c();
    if (((paramzbs.d() == 0) || (paramzbs.d() == 2)) && (paramzbs.k() == 2))
    {
      DateTime localDateTime = a(com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(paramObject)), paramzbs.c().U());
      if (!"".equals(str1)) {
        try
        {
          localDateTime.b(str1);
        }
        catch (Exception localException)
        {
          if (paramzbs.j() == 1) {
            str1 = "M/d/yyyy";
          } else if (paramzbs.j() == 2) {
            str1 = "MMM-yy";
          } else {
            str1 = "yyyy";
          }
        }
      } else if (paramzbs.j() == 1) {
        str1 = "M/d/yyyy";
      } else if (paramzbs.j() == 2) {
        str1 = "MMM-yy";
      } else {
        str1 = "yyyy";
      }
      if (ze.f(paramObject) == 60)
      {
        str2 = zgy.a(paramzbs.c().an(), paramObject, str1);
        if ((str1.indexOf("d") >= 0) && (str2.indexOf("28") >= 0)) {
          str2 = zw.a(str2, "28", "29");
        }
      }
      else
      {
        str2 = zgy.a(paramzbs.c().an(), localDateTime, str1, bool2);
      }
    }
    else
    {
      str2 = zqz.a(paramzbs.c().an(), paramObject, str1, bool1, localzje.U());
    }
    return str2;
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    DateTime localDateTime1 = a(paramInt2, paramBoolean);
    DateTime localDateTime2 = a(paramInt3, paramBoolean);
    int i;
    if (paramInt1 == 1) {
      i = paramInt2 - paramInt3;
    } else if (paramInt1 == 2) {
      i = (localDateTime1.getYear() - localDateTime2.getYear()) * 12 + localDateTime1.getMonth() - localDateTime2.getMonth();
    } else {
      i = localDateTime1.getYear() - localDateTime2.getYear();
    }
    return i;
  }
  
  static int b(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    DateTime localDateTime1 = a(paramInt2, paramBoolean);
    DateTime localDateTime2 = a(paramInt3, paramBoolean);
    int i;
    if (paramInt1 == 1)
    {
      i = paramInt2 - paramInt3;
    }
    else if (paramInt1 == 2)
    {
      i = (localDateTime1.getYear() - localDateTime2.getYear()) * 12 + localDateTime1.getMonth() - localDateTime2.getMonth();
      if (localDateTime1.getDay() - localDateTime2.getDay() > 0) {
        i++;
      }
    }
    else
    {
      i = localDateTime1.getYear() - localDateTime2.getYear();
      if ((localDateTime1.getMonth() - localDateTime2.getMonth() > 0) || (localDateTime1.getDay() - localDateTime2.getDay() > 0)) {
        i++;
      }
    }
    return i;
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    DateTime localDateTime1 = a(paramInt4, paramBoolean);
    DateTime localDateTime2;
    if (paramInt1 == 1)
    {
      if (paramInt2 == 1) {
        localDateTime2 = localDateTime1.addDays(paramInt3);
      } else if (paramInt2 == 2) {
        localDateTime2 = localDateTime1.addMonths(paramInt3);
      } else {
        localDateTime2 = localDateTime1.addYears(paramInt3);
      }
    }
    else if (paramInt1 == 2)
    {
      if (paramInt2 == 2) {
        localDateTime2 = localDateTime1.addMonths(paramInt3);
      } else {
        localDateTime2 = localDateTime1.addYears(paramInt3);
      }
    }
    else {
      localDateTime2 = localDateTime1.addYears(paramInt3);
    }
    return a(localDateTime2, paramBoolean);
  }
  
  static int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt1 == 1) {
      return paramInt2;
    }
    if (paramInt1 == 2)
    {
      localDateTime1 = a(paramInt2, paramBoolean);
      localDateTime2 = new DateTime(localDateTime1.getYear(), localDateTime1.getMonth(), 1);
      return a(localDateTime2, paramBoolean);
    }
    DateTime localDateTime1 = a(paramInt2, paramBoolean);
    DateTime localDateTime2 = new DateTime(localDateTime1.getYear(), 1, 1);
    return a(localDateTime2, paramBoolean);
  }
  
  static int a(zgm paramzgm)
  {
    int i = 0;
    if ((paramzgm.d() == null) || (paramzgm.d().getCount() == 0)) {
      return 1;
    }
    for (int j = 0; j < paramzgm.d().getCount(); j++)
    {
      zgm localzgm = (zgm)paramzgm.d().a(j);
      i += a(localzgm);
    }
    return i;
  }
  
  private static void a(zr paramzr, ArrayList[] paramArrayOfArrayList, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean1, zbs paramzbs, double paramDouble, zbwu paramzbwu, int paramInt, float paramFloat4, com.aspose.cells.b.a.b.zp paramzp, boolean paramBoolean2)
  {
    int i = 0;
    float f1 = paramFloat2;
    zje localzje = paramzbs.c();
    for (int j = 0; j < paramArrayOfArrayList.length; j++)
    {
      ArrayList localArrayList = paramArrayOfArrayList[j];
      zt localzt = new zt(0.0F, 0.0F);
      if (paramBoolean2)
      {
        localzt.b(paramzp.f() / localArrayList.size());
        localzt.a(paramzp.e() * 0.5F);
      }
      else
      {
        localzt.a(paramzp.e() / localArrayList.size());
        localzt.b(paramzp.f() * 0.5F);
      }
      com.aspose.cells.b.a.b.zs localzs = a(paramzr, localArrayList, i, paramzbwu, localzt);
      float f2 = paramFloat1;
      for (int k = 0; k < localArrayList.size(); k++)
      {
        zgm localzgm = (zgm)localArrayList.get(k);
        String str = zqz.a(paramzbs.c().an(), localzgm.a(), localzgm.c(), localzgm.b(), localzje.U());
        int m = a(localzgm);
        float f3 = (float)(m * paramDouble);
        float f4;
        if (!paramzbs.p()) {
          f4 = f2 + f3 / 2.0F - localzs.b() / 2;
        } else {
          f4 = f2 - f3 / 2.0F - localzs.b() / 2;
        }
        float f5 = paramBoolean1 ? f1 : f1 - localzs.c();
        zq localzq = new zq(f4, f5, localzs.b(), localzs.c());
        a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str, i, paramzbwu.a(), paramzbwu.h(), 1, paramInt);
        zanv.a(paramzr, f2, paramFloat4, f2, f1, paramzbs.g());
        if (paramzbs.w() != 2)
        {
          float f6 = paramBoolean1 ? f1 + (paramFloat3 + localzs.c()) : f1 - (paramFloat3 + localzs.c());
          a(paramzr, localzgm.d(), f2, paramFloat4, f6, paramBoolean1, paramzbs, paramDouble);
        }
        if (!paramzbs.p()) {
          f2 += f3;
        } else {
          f2 -= f3;
        }
      }
      zanv.a(paramzr, f2, paramFloat4, f2, f1, paramzbs.g());
      if (paramBoolean1) {
        f1 += paramFloat3 + localzs.c();
      } else {
        f1 -= paramFloat3 + localzs.c();
      }
    }
  }
  
  private static void a(zr paramzr, zagz paramzagz, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean, zbs paramzbs, double paramDouble)
  {
    float f1 = paramFloat1;
    for (int i = 0; i < paramzagz.getCount(); i++)
    {
      zgm localzgm = (zgm)paramzagz.a(i);
      int j = a(localzgm);
      float f2 = (float)(j * paramDouble);
      if (!paramzbs.p()) {
        f1 += f2;
      } else {
        f1 -= f2;
      }
      zanv.a(paramzr, f1, paramFloat2, f1, paramFloat3, paramzbs.g());
    }
  }
  
  static zbs a(zbs paramzbs)
  {
    zbs localzbs = null;
    if (paramzbs.d() == 0) {
      localzbs = paramzbs.c().E();
    } else if (paramzbs.d() == 2) {
      localzbs = paramzbs.c().G();
    } else if (paramzbs.d() == 1) {
      localzbs = paramzbs.c().e();
    } else if (paramzbs.d() == 3) {
      localzbs = paramzbs.c().g();
    }
    return localzbs;
  }
  
  public static void a(zr paramzr, com.aspose.cells.b.a.b.zp paramzp, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3)
  {
    a(paramzr, paramzp, paramString, paramInt1, paramzg, paramColor, paramInt2, paramInt3, null);
  }
  
  public static void a(zr paramzr, com.aspose.cells.b.a.b.zp paramzp, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3, zv paramzv)
  {
    zv localzv;
    if (paramzv == null) {
      localzv = new zv();
    } else {
      localzv = new zv(paramzv);
    }
    localzv.a(zbvx.a(paramInt2));
    localzv.c(zbvx.a(paramInt3));
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    switch (Math.abs(paramInt1))
    {
    case 0: 
      paramzr.a(paramString, paramzg, new zu(paramColor), paramzp, localzv);
      break;
    case 90: 
      paramzr.b(paramzp.g() + paramzp.e() / 2, paramzp.h() + paramzp.f() / 2);
      paramzr.a(-paramInt1);
      paramzp = new com.aspose.cells.b.a.b.zp(-paramzp.f() / 2, -paramzp.e() / 2, paramzp.f(), paramzp.e());
      paramzr.a(paramString, paramzg, new zu(paramColor), paramzp, localzv);
      break;
    default: 
      double d = Math.sqrt(Math.pow(paramzp.e(), 2.0D) + Math.pow(paramzp.f(), 2.0D));
      localzv.b(4096);
      zt localzt = paramzr.a(paramString, paramzg, (int)d, localzv);
      paramzr.b(paramzp.g() + paramzp.e() / 2, paramzp.h() + paramzp.f() / 2);
      paramzr.a(-paramInt1);
      zq localzq = new zq(-localzt.b() / 2.0F, -localzt.c() / 2.0F, localzt.b(), localzt.c());
      paramzr.a(paramString, paramzg, new zu(paramColor), localzq, localzv);
    }
    paramzr.a(localzf);
  }
  
  static void a(zr paramzr, String paramString, zo paramzo, zt paramzt, int paramInt1, zg paramzg, Color paramColor, int paramInt2)
  {
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    zu localzu = new zu(paramColor);
    try
    {
      zv localzv = new zv(zv.c());
      localzv.d(3);
      zt localzt = paramzr.a(paramString, paramzg, paramzo, new zv(zv.c()));
      double d = Math.abs(paramInt1) / 180.0D * 3.141592653589793D;
      float f1 = (float)(localzt.b() * Math.cos(d) + localzt.c() * Math.sin(d));
      float f2 = 0.0F;
      if (f1 <= paramzt.b()) {
        f2 = localzt.b();
      } else {
        f2 = (float)((paramzt.b() - localzt.c() * Math.sin(d)) / Math.cos(d));
      }
      float f3 = (float)(localzt.c() * 0.8D * Math.sin(d)) / 2.0F;
      float f4 = (float)(localzt.c() * 0.8D * Math.cos(d)) / 2.0F;
      float f5 = localzt.c() * 0.1F;
      paramzr.b(paramzo.d(), paramzo.e());
      paramzr.a(-paramInt1);
      zq localzq = zq.c();
      if (paramInt2 == 0)
      {
        if (paramInt1 > 0)
        {
          localzq = new zq(-f2, 0.0F, f2, localzt.c());
          localzv.a(2);
          paramzr.b(-f5, f4);
        }
        else
        {
          localzq = new zq(0.0F, 0.0F, f2, localzt.c());
          localzv.a(0);
          paramzr.b(f5, f4);
        }
        localzq.b(localzq.g() - localzt.c() / 2.0F);
      }
      else if (paramInt2 == 3)
      {
        if (paramInt1 < 0)
        {
          localzq = new zq(-f2, 0.0F, f2, localzt.c());
          localzv.a(2);
          paramzr.b(-f5, -f4);
        }
        else
        {
          localzq = new zq(0.0F, 0.0F, f2, localzt.c());
          localzv.a(0);
          paramzr.b(f5, -f4);
        }
        localzq.b(localzq.g() - localzt.c() / 2.0F);
      }
      else if (paramInt2 == 1)
      {
        localzq = new zq(-f2, -localzt.c() / 2.0F, f2, localzt.c());
        localzv.a(2);
        paramzr.b(-f3, 0.0F);
      }
      else
      {
        localzq = new zq(0.0F, -localzt.c() / 2.0F, f2, localzt.c());
        localzv.a(0);
        paramzr.b(f3, 0.0F);
      }
      localzq.d(localzq.i() + 3.0F);
      paramzr.a(paramString, paramzg, localzu, localzq, localzv);
    }
    finally
    {
      if (localzu != null) {
        localzu.f();
      }
    }
    paramzr.a(localzf);
  }
  
  static void a(zje paramzje)
    throws Exception
  {
    if (paramzje.B().D()) {
      return;
    }
    int i = 0;
    if (paramzje.E().D() == paramzje.E().l()) {
      i = 1;
    }
    if (paramzje.p() < 0) {
      if (i != 0)
      {
        paramzje.e().j(3);
        paramzje.I().j(3);
        paramzje.e().d(false);
        paramzje.I().d(false);
      }
      else if (paramzje.e().E() == 1)
      {
        paramzje.e().j(3);
        paramzje.I().j(3);
      }
    }
  }
  
  static com.aspose.cells.b.a.b.zs b(zr paramzr, zbs paramzbs, com.aspose.cells.b.a.b.zp paramzp, int paramInt, boolean paramBoolean, zbfc paramzbfc)
    throws Exception
  {
    ArrayList localArrayList1 = (ArrayList)paramzbs.l.clone();
    zbwu localzbwu = paramzbs.F();
    if ((!paramzbs.q()) || (paramzbs.E() == 3) || (localArrayList1.size() == 0) || (zbxz.a(paramzp))) {
      return new com.aspose.cells.b.a.b.zs(0, 0);
    }
    zje localzje = paramzbs.c();
    zbs localzbs = localzje.E();
    int i = 0;
    if (localzbs.D() == localzbs.l()) {
      i = 1;
    }
    if ((localzje.p() < 0) && ((localzje.p() >= 0) || (i != 0) || (paramzbs.E() != 2))) {
      return new com.aspose.cells.b.a.b.zs(0, 0);
    }
    int j = 1;
    zo[] arrayOfzo;
    if (paramzbs.d() == 0)
    {
      arrayOfzo = zja.c(localzje);
    }
    else
    {
      arrayOfzo = zja.d(localzje);
      j = 0;
    }
    int k = 0;
    if ((j != 0) && (paramzbs.k() == 2))
    {
      k = 1;
      paramzbs.f(false);
      paramzbs.k(1);
    }
    int m = 0;
    if (arrayOfzo[0].e() == arrayOfzo[1].e()) {
      m = 1;
    }
    int n = 0;
    if (j != 0)
    {
      int i1 = (paramzbs.f()) || (localzje.u()) ? 1 : 0;
      if (k != 0)
      {
        int i2 = (int)localzje.e().z();
        int i3 = (int)localzje.e().D();
        int i4 = paramzbs.j();
        if (i1 != 0)
        {
          n = a(i4, i2, i3, paramzbs.c().U()) + 1;
        }
        else
        {
          n = a(i4, i2, i3, paramzbs.c().U());
          if (n == 0) {
            n = 1;
          }
        }
      }
      else if (i1 != 0)
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
    }
    else
    {
      n = localArrayList1.size();
    }
    float f1 = Math.abs((arrayOfzo[1].d() - arrayOfzo[0].d()) / n);
    float f2 = Math.abs((arrayOfzo[1].e() - arrayOfzo[0].e()) / n);
    if ((j != 0) && (paramBoolean))
    {
      f1 = 0.0F;
      f2 = localzje.N().i() / n;
    }
    double d = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    int i5 = zbxz.c(d * 180.0D / 3.141592653589793D);
    int i6 = 0;
    if (i5 <= a) {
      i6 = 1;
    }
    if (j != 0)
    {
      if ((localzbwu.j()) && ((m != 0) || (i6 == 0)))
      {
        localzbwu.d(false);
        localzbwu.b(0);
      }
    }
    else if ((localzbwu.j()) && (i6 == 0))
    {
      localzbwu.d(false);
      localzbwu.b(0);
    }
    int i7 = b(paramzbs);
    ArrayList localArrayList2 = localzje.z().c();
    ArrayList[] arrayOfArrayList = localzje.z().e();
    boolean bool1 = localzje.z().a;
    int i8 = 0;
    if ((j != 0) && (arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0)) {
      i8 = 1;
    }
    float f3 = zkn.a(localzje, paramBoolean);
    String str1 = "";
    boolean bool2 = false;
    int i9 = 0;
    if (j != 0)
    {
      if ((localzbwu.c()) && (localArrayList2.size() > 0)) {
        i9 = 1;
      }
      if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0)) {
        i9 = 1;
      }
    }
    zt localzt = new zt(0.0F, 0.0F);
    zgm localzgm1 = 0;
    zgm localzgm2 = 0;
    int i10 = 0;
    int i11 = 0;
    float f4;
    com.aspose.cells.b.a.b.zs localzs1;
    float f6;
    int i14;
    String str2;
    Object localObject2;
    Object localObject3;
    Object localObject1;
    if (localzbwu.j())
    {
      f4 = 0.55F;
      localzs1 = zbvx.a(paramzr, "a", localzbwu.a());
      f6 = a(paramzr, paramzbs, paramzbfc);
      for (;;)
      {
        localzgm1 = 0;
        localzgm2 = 0;
        i10 = 0;
        i11 = 0;
        if (paramBoolean)
        {
          localzt.b(f2 * paramzbs.H());
          localzt.a(paramzp.e() * f4);
          if (paramzbs.I()) {
            if (Math.abs(localzbwu.e()) == 0)
            {
              if ((localzt.c() < localzs1.c()) && (paramzbs.H() < localArrayList1.size())) {
                paramzbs.k(paramzbs.H() + 1);
              }
            }
            else if ((Math.abs(localzbwu.e()) == 90) && (localzt.c() < f6) && (paramzbs.H() < localArrayList1.size())) {
              paramzbs.k(paramzbs.H() + 1);
            }
          }
        }
        else
        {
          if (i7 > paramzbs.H())
          {
            if (m != 0)
            {
              localzt.a(f1 * i7);
              localzt.b(paramzp.f() * f4);
            }
            else if (i6 != 0)
            {
              localzt.a(f1 * i7);
              localzt.b(paramzp.f() * f4);
            }
            else
            {
              localzt.a(paramzp.e() * 0.5F);
              localzt.b(f2 * i7);
            }
          }
          else if (m != 0)
          {
            localzt.a(f1 * paramzbs.H());
            localzt.b(paramzp.f() * f4);
          }
          else if (i6 != 0)
          {
            localzt.a(f1 * paramzbs.H());
            localzt.b(paramzp.f() * f4);
          }
          else
          {
            localzt.a(paramzp.e() * 0.5F);
            localzt.b(f2 * paramzbs.H());
          }
          if (paramzbs.I()) {
            if (Math.abs(localzbwu.e()) == 0)
            {
              if (m != 0)
              {
                if (localzt.b() == 0.0F)
                {
                  paramzbs.k(localArrayList1.size());
                  localzt.a(paramzp.e() * 0.5F);
                }
                else if ((localzt.b() < f6) && (paramzbs.H() < localArrayList1.size()))
                {
                  if (j != 0)
                  {
                    paramzbs.k(paramzbs.H() + 1);
                    continue;
                  }
                  localzbwu.b(90);
                  if (localzt.b() >= localzs1.c()) {
                    continue;
                  }
                  paramzbs.k(paramzbs.H() + 1);
                }
              }
              else if (i6 != 0)
              {
                if ((localzt.b() < f6) && (paramzbs.H() < localArrayList1.size()))
                {
                  localzbwu.b(90);
                  if (localzt.b() >= localzs1.c()) {
                    continue;
                  }
                  paramzbs.k(paramzbs.H() + 1);
                }
              }
              else if (localzt.c() < localzs1.c()) {
                paramzbs.k(paramzbs.H() + 1);
              }
            }
            else if ((Math.abs(localzbwu.e()) == 90) && (localzt.b() < localzs1.c()) && (paramzbs.H() < localArrayList1.size()))
            {
              paramzbs.k(paramzbs.H() + 1);
              continue;
            }
          }
        }
        for (i14 = 0; i14 < localArrayList1.size(); i14++)
        {
          if (i14 == 0) {
            paramzbs.F().d(zbxz.a(localzs1.b() * paramzbs.F().d() / f3));
          }
          str2 = "";
          str2 = a(paramzbs, localArrayList1.get(i14));
          if ((j != 0) && (i9 != 0)) {
            if ((k != 0) && (bool1))
            {
              localObject2 = localArrayList2.iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject3 = (zgm)((Iterator)localObject2).next();
                if (ziy.a(((zgm)localObject3).a(), localzje.U()) == ze.f(localArrayList1.get(i14)))
                {
                  str1 = ((zgm)localObject3).c();
                  bool2 = ((zgm)localObject3).b();
                  str2 = zqz.a(paramzbs.c().an(), localArrayList1.get(i14), str1, bool2, localzje.U());
                  break;
                }
              }
            }
            else
            {
              str1 = i14 < localArrayList2.size() ? ((zgm)localArrayList2.get(i14)).c() : "";
              bool2 = i14 < localArrayList2.size() ? ((zgm)localArrayList2.get(i14)).b() : false;
              str2 = zqz.a(paramzbs.c().an(), localArrayList1.get(i14), str1, bool2, localzje.U());
            }
          }
          localObject2 = new com.aspose.cells.b.a.b.zs(0, 0);
          if ((i8 != 0) && (localzbwu.e() == 0) && (!paramBoolean)) {
            localzt.a(localzt.b() + 1.0F);
          }
          localObject2 = zbvx.a(paramzr, str2, localzbwu.e(), localzbwu.a(), localzt, 1, 1);
          if (((com.aspose.cells.b.a.b.zs)localObject2).b() > localzgm1) {
            localzgm1 = ((com.aspose.cells.b.a.b.zs)localObject2).b();
          }
          if (((com.aspose.cells.b.a.b.zs)localObject2).c() > localzgm2) {
            localzgm2 = ((com.aspose.cells.b.a.b.zs)localObject2).c();
          }
          if (i14 == 0) {
            if (paramBoolean) {
              i10 = ((com.aspose.cells.b.a.b.zs)localObject2).c() / 2;
            } else {
              i10 = ((com.aspose.cells.b.a.b.zs)localObject2).b() / 2;
            }
          }
          if (i14 == localArrayList1.size() - 1) {
            if (paramBoolean) {
              i11 = ((com.aspose.cells.b.a.b.zs)localObject2).c() / 2;
            } else {
              i11 = ((com.aspose.cells.b.a.b.zs)localObject2).b() / 2;
            }
          }
          if ((i8 != 0) && (i14 == 0) && (localzbwu.e() == 0) && (!paramBoolean)) {
            break;
          }
        }
        paramzbs.h = localzgm2;
        paramzbs.i = localzgm1;
        if (paramBoolean)
        {
          if ((localzt.c() / localzgm2 <= 2.0F) || (f4 <= 0.2D) || (localzt.b() * 4.0F / 5.0F <= f6)) {
            break;
          }
          f4 = f4 * 4.0F / 5.0F;
        }
        else
        {
          if (m != 0) {
            break;
          }
          if (i6 != 0)
          {
            if ((localzt.b() / localzgm1 <= 2.0F) || (f4 <= 0.2D)) {
              break;
            }
            f4 = f4 * 4.0F / 5.0F;
          }
          else
          {
            if ((localzt.c() / localzgm2 <= 2.0F) || (f4 <= 0.2D)) {
              break;
            }
            f4 = f4 * 4.0F / 5.0F;
          }
        }
      }
      if (paramzbs.p())
      {
        i14 = i10;
        i10 = i11;
        i11 = i14;
      }
    }
    else if ((localzbwu.e() == 0) || (Math.abs(localzbwu.e()) == 90))
    {
      f4 = 0.55F;
      localzs1 = zbvx.a(paramzr, "a", localzbwu.a());
      f6 = a(paramzr, paramzbs, paramzbfc);
      for (;;)
      {
        localzgm1 = 0;
        localzgm2 = 0;
        i10 = 0;
        i11 = 0;
        if (paramBoolean)
        {
          localzt.b(f2 * paramzbs.H());
          localzt.a(paramzp.e() * f4);
          if (paramzbs.I()) {
            if (Math.abs(localzbwu.e()) == 0)
            {
              if ((localzt.c() < localzs1.c()) && (paramzbs.H() < localArrayList1.size())) {
                paramzbs.k(paramzbs.H() + 1);
              }
            }
            else if ((Math.abs(localzbwu.e()) == 90) && (localzt.c() < f6) && (paramzbs.H() < localArrayList1.size())) {
              paramzbs.k(paramzbs.H() + 1);
            }
          }
        }
        else
        {
          if (i7 > paramzbs.H())
          {
            if (m != 0)
            {
              localzt.a(f1 * i7);
              localzt.b(paramzp.f() * f4);
            }
            else if (i6 != 0)
            {
              localzt.a(f1 * i7);
              localzt.b(paramzp.f() * f4);
            }
            else
            {
              localzt.a(paramzp.e() * 0.5F);
              localzt.b(f2 * i7);
            }
          }
          else if (m != 0)
          {
            localzt.a(f1 * paramzbs.H());
            localzt.b(paramzp.f() * f4);
          }
          else if (i6 != 0)
          {
            localzt.a(f1 * paramzbs.H());
            localzt.b(paramzp.f() * f4);
          }
          else
          {
            localzt.a(paramzp.e() * 0.5F);
            localzt.b(f2 * paramzbs.H());
          }
          if (paramzbs.I()) {
            if (Math.abs(localzbwu.e()) == 0)
            {
              if (m != 0)
              {
                if (localzt.b() == 0.0F)
                {
                  paramzbs.k(localArrayList1.size());
                  localzt.a(paramzp.e() * 0.5F);
                }
                else if ((localzt.b() < f6) && (paramzbs.H() < localArrayList1.size()))
                {
                  paramzbs.k(paramzbs.H() + 1);
                }
              }
              else if (i6 != 0)
              {
                if ((localzt.b() < f6) && (paramzbs.H() < localArrayList1.size())) {
                  paramzbs.k(paramzbs.H() + 1);
                }
              }
              else if ((localzt.c() < localzs1.c()) && (paramzbs.H() < localArrayList1.size())) {
                paramzbs.k(paramzbs.H() + 1);
              }
            }
            else if (Math.abs(localzbwu.e()) == 90) {
              if (m != 0)
              {
                if ((localzt.b() < localzs1.c()) && (paramzbs.H() < localArrayList1.size())) {
                  paramzbs.k(paramzbs.H() + 1);
                }
              }
              else if (i6 != 0)
              {
                if ((localzt.b() < localzs1.c()) && (paramzbs.H() < localArrayList1.size())) {
                  paramzbs.k(paramzbs.H() + 1);
                }
              }
              else if ((localzt.b() < localzs1.c()) && (paramzbs.H() < localArrayList1.size()))
              {
                paramzbs.k(paramzbs.H() + 1);
                continue;
              }
            }
          }
        }
        for (i14 = 0; i14 < localArrayList1.size(); i14++)
        {
          if (i14 == 0) {
            paramzbs.F().d(zbxz.a(localzs1.b() * paramzbs.F().d() / f3));
          }
          str2 = "";
          str2 = a(paramzbs, localArrayList1.get(i14));
          if ((j != 0) && (i9 != 0)) {
            if ((k != 0) && (bool1))
            {
              localObject2 = localArrayList2.iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject3 = (zgm)((Iterator)localObject2).next();
                if (ziy.a(((zgm)localObject3).a(), localzje.U()) == ze.f(localArrayList1.get(i14)))
                {
                  str1 = ((zgm)localObject3).c();
                  bool2 = ((zgm)localObject3).b();
                  str2 = zqz.a(paramzbs.c().an(), localArrayList1.get(i14), str1, bool2, localzje.U());
                  break;
                }
              }
            }
            else
            {
              str1 = i14 < localArrayList2.size() ? ((zgm)localArrayList2.get(i14)).c() : "";
              bool2 = i14 < localArrayList2.size() ? ((zgm)localArrayList2.get(i14)).b() : false;
              str2 = zqz.a(paramzbs.c().an(), localArrayList1.get(i14), str1, bool2, localzje.U());
            }
          }
          localObject2 = new com.aspose.cells.b.a.b.zs(0, 0);
          if ((i8 != 0) && (localzbwu.e() == 0) && (!paramBoolean)) {
            localzt.a(localzt.b() + 1.0F);
          }
          localObject2 = zbvx.a(paramzr, str2, localzbwu.e(), localzbwu.a(), localzt, 1, 1);
          if (((com.aspose.cells.b.a.b.zs)localObject2).b() > localzgm1) {
            localzgm1 = ((com.aspose.cells.b.a.b.zs)localObject2).b();
          }
          if (((com.aspose.cells.b.a.b.zs)localObject2).c() > localzgm2) {
            localzgm2 = ((com.aspose.cells.b.a.b.zs)localObject2).c();
          }
          if (i14 == 0) {
            if (paramBoolean) {
              i10 = ((com.aspose.cells.b.a.b.zs)localObject2).c() / 2;
            } else {
              i10 = ((com.aspose.cells.b.a.b.zs)localObject2).b() / 2;
            }
          }
          if (i14 == localArrayList1.size() - 1) {
            if (paramBoolean) {
              i11 = ((com.aspose.cells.b.a.b.zs)localObject2).c() / 2;
            } else {
              i11 = ((com.aspose.cells.b.a.b.zs)localObject2).b() / 2;
            }
          }
        }
        paramzbs.h = localzgm2;
        paramzbs.i = localzgm1;
        if (paramBoolean)
        {
          if ((localzt.c() / localzgm2 <= 2.0F) || (f4 <= 0.2D) || (localzt.b() * 4.0F / 5.0F <= f6)) {
            break;
          }
          f4 = f4 * 4.0F / 5.0F;
        }
        else
        {
          if (m != 0) {
            break;
          }
          if (i6 != 0)
          {
            if ((localzt.b() / localzgm1 <= 2.0F) || (f4 <= 0.2D)) {
              break;
            }
            f4 = f4 * 4.0F / 5.0F;
          }
          else
          {
            if ((localzt.c() / localzgm2 <= 2.0F) || (f4 <= 0.2D)) {
              break;
            }
            f4 = f4 * 4.0F / 5.0F;
          }
        }
      }
      if (paramzbs.p())
      {
        i14 = i10;
        i10 = i11;
        i11 = i14;
      }
    }
    else
    {
      f4 = 0.5F;
      float f5 = 0.0F;
      if (paramBoolean) {
        f5 = f2;
      } else {
        f5 = f1;
      }
      localObject1 = new com.aspose.cells.b.a.b.zs(0, 0);
      for (i14 = 0; i14 < localArrayList1.size(); i14++)
      {
        int i15 = localArrayList1.size() - 1 - i14;
        if (paramBoolean)
        {
          if (paramzbs.p())
          {
            if (localzbwu.e() > 0)
            {
              localzt.a(paramzp.e() * f4);
              localzt.b(localzje.N().i() - i14 * f5 - f5 / 2.0F);
            }
            else
            {
              localzt.a(paramzp.e() * f4);
              localzt.b(localzje.N().i() - i15 * f5 - f5 / 2.0F);
            }
          }
          else if (localzbwu.e() > 0)
          {
            localzt.a(paramzp.e() * f4);
            localzt.b(localzje.N().i() - i15 * f5 - f5 / 2.0F);
          }
          else
          {
            localzt.a(paramzp.e() * f4);
            localzt.b(localzje.N().i() - i14 * f5 - f5 / 2.0F);
          }
        }
        else if (paramzbs.p())
        {
          if (localzbwu.e() > 0)
          {
            localzt.a(localzje.N().g() - i14 * f5 - f5 / 2.0F);
            localzt.b(paramzp.f() * f4);
          }
          else
          {
            localzt.a(localzje.N().g() - i15 * f5 - f5 / 2.0F);
            localzt.b(paramzp.f() * f4);
          }
        }
        else if (localzbwu.e() > 0)
        {
          localzt.a(localzje.N().g() - i15 * f5 - f5 / 2.0F);
          localzt.b(paramzp.f() * f4);
        }
        else
        {
          localzt.a(localzje.N().g() - i14 * f5 - f5 / 2.0F);
          localzt.b(paramzp.f() * f4);
        }
        if (localzt.b() < paramzp.e() * f4) {
          localzt.a(paramzp.e() * f4);
        }
        if (localzt.c() < paramzp.f() * f4) {
          localzt.b(paramzp.f() * f4);
        }
        if (i14 == 0)
        {
          localObject1 = zbvx.a(paramzr, "a", localzbwu.a());
          paramzbs.F().d(zbxz.a(((com.aspose.cells.b.a.b.zs)localObject1).b() * paramzbs.F().d() / f3));
        }
        localObject2 = "";
        localObject2 = a(paramzbs, localArrayList1.get(i14));
        if ((j != 0) && (i9 != 0)) {
          if ((k != 0) && (bool1))
          {
            localObject3 = localArrayList2.iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localzgm3 = (zgm)((Iterator)localObject3).next();
              if (ziy.a(localzgm3.a(), localzje.U()) == ze.f(localArrayList1.get(i14)))
              {
                str1 = localzgm3.c();
                bool2 = localzgm3.b();
                localObject2 = zqz.a(paramzbs.c().an(), localArrayList1.get(i14), str1, bool2, localzje.U());
                break;
              }
            }
          }
          else
          {
            str1 = i14 < localArrayList2.size() ? ((zgm)localArrayList2.get(i14)).c() : "";
            bool2 = i14 < localArrayList2.size() ? ((zgm)localArrayList2.get(i14)).b() : false;
            localObject2 = zqz.a(paramzbs.c().an(), localArrayList1.get(i14), str1, bool2, localzje.U());
          }
        }
        localObject3 = zbvx.a(paramzr, (String)localObject2, localzbwu.e(), localzbwu.a(), localzt, 1, 1);
        if (((com.aspose.cells.b.a.b.zs)localObject3).b() > localzgm1) {
          localzgm1 = ((com.aspose.cells.b.a.b.zs)localObject3).b();
        }
        if (((com.aspose.cells.b.a.b.zs)localObject3).c() > localzgm2) {
          localzgm2 = ((com.aspose.cells.b.a.b.zs)localObject3).c();
        }
        zgm localzgm3 = localzgm1;
        if (paramBoolean) {
          localzgm3 = localzgm2;
        }
        float f7;
        float f8;
        switch (paramzbs.a())
        {
        case 0: 
          if (paramzbs.p())
          {
            if (localzbwu.e() > 0)
            {
              f7 = i15 * f5 + f5 / 2.0F;
              if (localzgm3 > f7)
              {
                f8 = localzgm3 - f7;
                if (f8 > i10) {
                  i10 = (int)f8;
                }
              }
            }
            else
            {
              f7 = i14 * f5 + f5 / 2.0F;
              if (localzgm3 > f7)
              {
                f8 = localzgm3 - f7;
                if (f8 > i11) {
                  i11 = (int)f8;
                }
              }
            }
          }
          else if (localzbwu.e() > 0)
          {
            f7 = i14 * f5 + f5 / 2.0F;
            if (localzgm3 > f7)
            {
              f8 = localzgm3 - f7;
              if (f8 > i10) {
                i10 = (int)f8;
              }
            }
          }
          else
          {
            f7 = i15 * f5 + f5 / 2.0F;
            if (localzgm3 > f7)
            {
              f8 = localzgm3 - f7;
              if (f8 > i11) {
                i11 = (int)f8;
              }
            }
          }
          break;
        case 3: 
          if (paramzbs.p())
          {
            if (localzbwu.e() < 0)
            {
              f7 = i15 * f5 + f5 / 2.0F;
              if (localzgm3 > f7)
              {
                f8 = localzgm3 - f7;
                if (f8 > i10) {
                  i10 = (int)f8;
                }
              }
            }
            else
            {
              f7 = i14 * f5 + f5 / 2.0F;
              if (localzgm3 > f7)
              {
                f8 = localzgm3 - f7;
                if (f8 > i11) {
                  i11 = (int)f8;
                }
              }
            }
          }
          else if (localzbwu.e() < 0)
          {
            f7 = i14 * f5 + f5 / 2.0F;
            if (localzgm3 > f7)
            {
              f8 = localzgm3 - f7;
              if (f8 > i10) {
                i10 = (int)f8;
              }
            }
          }
          else
          {
            f7 = i15 * f5 + f5 / 2.0F;
            if (localzgm3 > f7)
            {
              f8 = localzgm3 - f7;
              if (f8 > i11) {
                i11 = (int)f8;
              }
            }
          }
          break;
        case 1: 
          if (paramzbs.p())
          {
            if (localzbwu.e() > 0)
            {
              f7 = i15 * f5 + f5 / 2.0F;
              if (localzgm3 > f7)
              {
                f8 = localzgm3 - f7;
                if (f8 > i10) {
                  i10 = (int)f8;
                }
              }
            }
            else
            {
              f7 = i14 * f5 + f5 / 2.0F;
              if (localzgm3 > f7)
              {
                f8 = localzgm3 - f7;
                if (f8 > i11) {
                  i11 = (int)f8;
                }
              }
            }
          }
          else if (localzbwu.e() > 0)
          {
            f7 = i14 * f5 + f5 / 2.0F;
            if (localzgm3 > f7)
            {
              f8 = localzgm3 - f7;
              if (f8 > i10) {
                i10 = (int)f8;
              }
            }
          }
          else
          {
            f7 = i15 * f5 + f5 / 2.0F;
            if (localzgm3 > f7)
            {
              f8 = localzgm3 - f7;
              if (f8 > i11) {
                i11 = (int)f8;
              }
            }
          }
          break;
        case 2: 
          if (paramzbs.p())
          {
            if (localzbwu.e() < 0)
            {
              f7 = i15 * f5 + f5 / 2.0F;
              if (localzgm3 > f7)
              {
                f8 = localzgm3 - f7;
                if (f8 > i10) {
                  i10 = (int)f8;
                }
              }
            }
            else
            {
              f7 = i14 * f5 + f5 / 2.0F;
              if (localzgm3 > f7)
              {
                f8 = localzgm3 - f7;
                if (f8 > i11) {
                  i11 = (int)f8;
                }
              }
            }
          }
          else if (localzbwu.e() < 0)
          {
            f7 = i14 * f5 + f5 / 2.0F;
            if (localzgm3 > f7)
            {
              f8 = localzgm3 - f7;
              if (f8 > i10) {
                i10 = (int)f8;
              }
            }
          }
          else
          {
            f7 = i15 * f5 + f5 / 2.0F;
            if (localzgm3 > f7)
            {
              f8 = localzgm3 - f7;
              if (f8 > i11) {
                i11 = (int)f8;
              }
            }
          }
          break;
        }
      }
      paramzbs.i = localzgm1;
      paramzbs.h = localzgm2;
    }
    if ((j != 0) && (arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0))
    {
      paramzbs.k(1);
      int i12 = 0;
      if (paramBoolean) {
        i12 = 90;
      }
      for (int i13 = 0; i13 < arrayOfArrayList.length; i13++)
      {
        localObject1 = arrayOfArrayList[i13];
        if (paramBoolean)
        {
          localzt.b(paramzp.f() / ((List)localObject1).size());
          localzt.a(paramzp.e() * 0.5F);
        }
        else
        {
          localzt.a(paramzp.e() / ((List)localObject1).size());
          localzt.b(paramzp.f() * 0.5F);
        }
        com.aspose.cells.b.a.b.zs localzs2 = a(paramzr, (List)localObject1, i12, localzbwu, localzt);
        if (paramBoolean) {
          localzgm1 += localzs2.b();
        } else {
          localzgm2 += localzs2.c();
        }
      }
    }
    paramzbs.f = localzgm1;
    paramzbs.g = localzgm2;
    if (a(paramzbs, paramzbfc))
    {
      if (paramBoolean) {
        paramzbs.j = (localzgm2 / 2.0F);
      } else {
        paramzbs.j = (localzgm1 / 2.0F);
      }
      paramzbs.k = paramzbs.j;
    }
    else if (b(paramzbs, paramzbfc))
    {
      paramzbs.j = i10;
      paramzbs.k = i11;
    }
    return new com.aspose.cells.b.a.b.zs(localzgm1, localzgm2);
  }
  
  private static float a(zr paramzr, zbs paramzbs, zbfc paramzbfc)
  {
    zje localzje = paramzbs.c();
    ArrayList localArrayList1 = paramzbs.l;
    zbwu localzbwu = paramzbs.F();
    String str1 = "";
    boolean bool = false;
    int i = 0;
    ArrayList localArrayList2 = localzje.z().c();
    ArrayList[] arrayOfArrayList = localzje.z().e();
    if ((localzbwu.c()) && (localArrayList2.size() > 0)) {
      i = 1;
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0)) {
      i = 1;
    }
    float f1 = 0.0F;
    for (int j = 0; j < localArrayList1.size(); j++)
    {
      String str2 = "";
      if (paramzbs.d() == 0)
      {
        if (i != 0)
        {
          str1 = j < localArrayList2.size() ? ((zgm)localArrayList2.get(j)).c() : "";
          bool = j < localArrayList2.size() ? ((zgm)localArrayList2.get(j)).b() : false;
          str2 = zqz.a(paramzbs.c().an(), localArrayList1.get(j), str1, bool, localzje.U());
        }
        else
        {
          str2 = a(paramzbs, localArrayList1.get(j));
        }
      }
      else {
        str2 = a(paramzbs, localArrayList1.get(j));
      }
      float f2 = zbvx.c(paramzr, str2, localzbwu.a());
      if (f2 > f1) {
        f1 = f2;
      }
    }
    return f1;
  }
  
  static com.aspose.cells.b.a.b.zp a(zr paramzr, zbs paramzbs, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList1 = (ArrayList)paramzbs.l.clone();
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    int i = 1;
    zo[] arrayOfzo;
    if (paramzbs.d() == 0)
    {
      arrayOfzo = zja.c(localzje);
    }
    else
    {
      arrayOfzo = zja.d(localzje);
      i = 0;
    }
    int j = 0;
    if ((i != 0) && (paramzbs.k() == 2))
    {
      j = 1;
      paramzbs.f(false);
      paramzbs.k(1);
    }
    zbs localzbs = localzje.E();
    double d1 = localzbs.S();
    double d2 = localzbs.T();
    double d3 = localzbs.U();
    int k = 0;
    if (localzbs.D() == localzbs.l()) {
      k = 1;
    }
    if (localzbs.p()) {
      d3 = d1 - d3;
    } else {
      d3 -= d2;
    }
    int m = (int)(d3 / (d1 - d2) * localzje.N().i());
    if (paramzbs.E() == 2)
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - m);
      arrayOfzo[1].b(arrayOfzo[1].e() - m);
    }
    zbfe localzbfe = localzje.z();
    zbwu localzbwu = paramzbs.F();
    ArrayList localArrayList2 = localzje.z().c();
    ArrayList[] arrayOfArrayList = localzje.z().e();
    float f1 = paramzbs.F().k();
    int n = (paramzbs.f()) || (localzje.u()) ? 1 : 0;
    int i1 = 0;
    if (i != 0)
    {
      if (j != 0)
      {
        int i2 = (int)localzje.e().z();
        int i3 = (int)localzje.e().D();
        int i4 = paramzbs.j();
        if (n != 0)
        {
          i1 = a(i4, i2, i3, paramzbs.c().U()) + 1;
        }
        else
        {
          i1 = a(i4, i2, i3, paramzbs.c().U());
          if (i1 == 0) {
            i1 = 1;
          }
        }
      }
      else if (n != 0)
      {
        i1 = paramInt;
      }
      else
      {
        i1 = paramInt - 1;
        if (i1 == 0) {
          i1 = 1;
        }
      }
    }
    else {
      i1 = localArrayList1.size();
    }
    float f2 = (arrayOfzo[1].d() - arrayOfzo[0].d()) / i1;
    float f3 = (arrayOfzo[1].e() - arrayOfzo[0].e()) / i1;
    if ((i != 0) && (paramBoolean))
    {
      f2 = 0.0F;
      f3 = localzje.N().i() / i1;
    }
    double d4 = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    int i5 = zbxz.c(d4 * 180.0D / 3.141592653589793D);
    int i6 = 0;
    if (i5 <= a) {
      i6 = 1;
    }
    ArrayList localArrayList3 = new ArrayList();
    zq localzq;
    for (int i7 = 0; i7 < localArrayList1.size(); i7++)
    {
      i8 = i7;
      if (paramzbs.p()) {
        i8 = localArrayList1.size() - 1 - i7;
      }
      if ((paramzbs.E() != 3) && (i8 % paramzbs.H() == 0))
      {
        localzq = zq.c();
        float f4;
        if (localzje.p() >= 0)
        {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
            localzq.b(arrayOfzo[0].e() + f1);
            if (n == 0) {
              localzq.a(localzq.f() - f2 / 2.0F);
            }
            localzq.c(paramzbs.f);
            localzq.d(paramzbs.g);
          }
          else
          {
            if (i6 != 0)
            {
              localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
              localzq.b(arrayOfzo[0].e() + i7 * f3 + f3 / 2.0F);
              localzq.b(localzq.g() + f1);
              localzq.c(paramzbs.f);
              localzq.d(paramzbs.g);
            }
            else
            {
              f4 = (float)(paramzbs.g / 2.0F / Math.tan(d4) + f1 / Math.sin(d4));
              if ((f2 > 0.0F) && (f3 > 0.0F)) {
                localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - f4 - paramzbs.f);
              } else if ((f2 < 0.0F) && (f3 > 0.0F)) {
                localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F + f4);
              } else if ((f2 < 0.0F) && (f3 < 0.0F)) {
                localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - f4 - paramzbs.f);
              } else {
                localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F + f4);
              }
              localzq.b(arrayOfzo[0].e() + i7 * f3 + f3 / 2.0F - paramzbs.g / 2.0F);
              localzq.c(paramzbs.f);
              localzq.d(paramzbs.g);
            }
            if (n == 0)
            {
              localzq.a(localzq.f() - f2 / 2.0F);
              localzq.b(localzq.g() - f3 / 2.0F);
            }
          }
        }
        else if ((localzje.p() < 0) && (k == 0) && (paramzbs.E() == 2)) {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
            localzq.b(arrayOfzo[0].e() - paramzbs.g - f1);
            if (n == 0) {
              localzq.a(localzq.f() - f2 / 2.0F);
            }
            localzq.c(paramzbs.f);
            localzq.d(paramzbs.g);
          }
          else
          {
            if (i6 != 0)
            {
              localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
              localzq.b(arrayOfzo[0].e() + i7 * f3 + f3 / 2.0F);
              localzq.b(localzq.g() - f1);
              localzq.b(localzq.g() - paramzbs.g);
              localzq.c(paramzbs.f);
              localzq.d(paramzbs.g);
            }
            else
            {
              f4 = (float)(paramzbs.g / 2.0F / Math.tan(d4) + f1 / Math.sin(d4));
              if ((f2 > 0.0F) && (f3 < 0.0F)) {
                localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - f4 - paramzbs.f);
              } else if ((f2 < 0.0F) && (f3 < 0.0F)) {
                localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F + f4);
              } else if ((f2 < 0.0F) && (f3 > 0.0F)) {
                localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - f4 - paramzbs.f);
              } else {
                localzq.a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F + f4);
              }
              localzq.b(arrayOfzo[0].e() + i7 * f3 + f3 / 2.0F - paramzbs.g / 2.0F);
              localzq.c(paramzbs.f);
              localzq.d(paramzbs.g);
            }
            if (n == 0)
            {
              localzq.a(localzq.f() - f2 / 2.0F);
              localzq.b(localzq.g() - f3 / 2.0F);
            }
          }
        }
        if ((!localzq.n()) && (localzq.h() > 0.0F) && (localzq.i() > 0.0F)) {
          com.aspose.cells.b.a.a.zf.a(localArrayList3, localzq);
        }
      }
    }
    com.aspose.cells.b.a.b.zp localzp = com.aspose.cells.b.a.b.zp.a();
    for (int i8 = 0; i8 < localArrayList3.size(); i8++)
    {
      localzq = (zq)localArrayList3.get(i8);
      if (localzp.k())
      {
        localzp = new com.aspose.cells.b.a.b.zp((int)localzq.f(), (int)localzq.g(), (int)localzq.h(), (int)localzq.i());
      }
      else
      {
        if (localzq.f() < localzp.c())
        {
          localzp.c(localzp.e() + (int)(localzp.c() - localzq.f()));
          localzp.a((int)localzq.f());
        }
        if (localzq.g() < localzp.d())
        {
          localzp.d(localzp.f() + (int)(localzp.d() - localzq.g()));
          localzp.b((int)localzq.g());
        }
        if (localzq.l() > localzp.i()) {
          localzp.c(localzp.e() + (int)(localzq.l() - localzp.i()));
        }
        if (localzq.m() > localzp.j()) {
          localzp.d(localzp.f() + (int)(localzq.m() - localzp.j()));
        }
      }
    }
    return localzp;
  }
  
  static void a(zr paramzr, zbs paramzbs)
    throws Exception
  {
    if (paramzbs.c().B().D()) {
      return;
    }
    zje localzje = paramzbs.c();
    int i = localzje.M();
    zbyu localzbyu = localzje.N();
    zo localzo = zja.e(localzje);
    zanv.a(paramzr, localzo.d(), localzo.e(), localzo.d(), localzo.e() - localzbyu.i(), paramzbs.g());
    zbwu localzbwu = paramzbs.F();
    zbfc localzbfc = localzje.z().c(0);
    zke localzke = localzbfc.D().b(0);
    String str1 = localzke != null ? localzke.A() : "";
    boolean bool = localzke != null ? localzke.B() : true;
    int j = 0;
    if ((localzbwu.c()) && (localzke != null)) {
      j = 1;
    }
    float f1 = 0.0F;
    int k = 8;
    if (localzo.d() > localzje.N().j())
    {
      k = 7;
      f1 = localzo.d();
      f1 += paramzbs.X();
      f1 += paramzbs.Z();
    }
    else
    {
      f1 = localzo.d() - paramzbs.f;
      f1 -= paramzbs.X();
      f1 -= paramzbs.Z();
    }
    ArrayList localArrayList = paramzbs.l;
    double d1 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
    double d2 = paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D();
    double d3 = paramzbs.n() ? zbxz.e(paramzbs.x()) : paramzbs.x();
    for (int m = 0; m < paramzbs.l.size(); m++)
    {
      double d4 = ((Double)paramzbs.l.get(m)).doubleValue();
      double d5 = paramzbs.n() ? zbxz.f(d4) : d4;
      if (m - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d4, ze.g(localArrayList.get(m - 1)))))) / d3 > b : (m + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d4, ze.g(localArrayList.get(m + 1)))))) / d3 <= b))
      {
        float f2 = (float)((d4 - d2) / (d1 - d2) * localzje.N().i());
        if (!paramzbs.p()) {
          f2 = localzo.e() - f2;
        } else {
          f2 = localzo.e() - localzbyu.i() + f2;
        }
        if (paramzbs.E() != 3)
        {
          if (paramzbs.ac())
          {
            d5 /= 100.0D;
            str1 = "0%";
          }
          String str2 = "";
          d5 = paramzbs.n() ? d5 : d5 * Math.pow(10.0D, paramzbs.Q().f());
          Color localColor = localzbwu.h();
          if (j != 0)
          {
            str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d5), str1, bool, localzje.U());
            localColor = zqz.a(Double.valueOf(d5), str1, localColor);
          }
          else
          {
            str2 = a(paramzbs, Double.valueOf(d5));
            localColor = zqz.a(Double.valueOf(d5), localzbwu.b(), localColor);
          }
          zq localzq = new zq(f1, f2 - paramzbs.g / 2.0F, paramzbs.f, paramzbs.g);
          a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str2, localzbwu.e(), localzbwu.a(), localColor, k, 1, zv.c());
        }
        a(paramzr, paramzbs, localzo.d(), f2);
      }
    }
    a(paramzr, paramzbs, localzo.d(), localzo.e() - localzbyu.i(), localzo.e());
  }
  
  private static void a(zr paramzr, zbs paramzbs, float paramFloat1, float paramFloat2)
  {
    if ((paramzbs.w() == 2) || (!paramzbs.g().e())) {
      return;
    }
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    int i = 0;
    int j = 0;
    switch (paramzbs.w())
    {
    case 1: 
      i = 1;
      if (paramFloat1 > localzje.N().j())
      {
        i = 0;
        j = 1;
      }
      break;
    case 3: 
      j = 1;
      if (paramFloat1 > localzje.N().j())
      {
        j = 0;
        i = 1;
      }
      break;
    case 0: 
      i = 1;
      j = 1;
      break;
    }
    if (i != 0) {
      zanv.a(paramzr, paramFloat1, paramFloat2, paramFloat1 + paramzbs.X(), paramFloat2, paramzbs.g());
    }
    if (j != 0) {
      zanv.a(paramzr, paramFloat1 - paramzbs.X(), paramFloat2, paramFloat1, paramFloat2, paramzbs.g());
    }
  }
  
  private static void a(zr paramzr, zbs paramzbs, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if ((paramzbs.A() == 2) || (!paramzbs.g().e())) {
      return;
    }
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    int i = 0;
    int j = 0;
    switch (paramzbs.A())
    {
    case 1: 
      i = 1;
      if (paramFloat1 > localzje.N().j())
      {
        i = 0;
        j = 1;
      }
      break;
    case 3: 
      j = 1;
      if (paramFloat1 > localzje.N().j())
      {
        j = 0;
        i = 1;
      }
      break;
    case 0: 
      i = 1;
      j = 1;
      break;
    }
    float f2 = (float)(paramzbs.B() / (paramzbs.z() - paramzbs.D()) * (paramFloat3 - paramFloat2));
    float f1;
    if (!paramzbs.p())
    {
      f1 = paramFloat3;
      f2 = -f2;
    }
    else
    {
      f1 = paramFloat2;
    }
    float f3 = f1;
    do
    {
      if (i != 0) {
        zanv.a(paramzr, paramFloat1, f3, paramFloat1 + paramzbs.Y(), f3, paramzbs.g());
      }
      if (j != 0) {
        zanv.a(paramzr, paramFloat1 - paramzbs.Y(), f3, paramFloat1, f3, paramzbs.g());
      }
      f3 += f2;
    } while ((paramFloat2 <= f3) && (f3 <= paramFloat3));
  }
  
  static void a(zr paramzr, zbs paramzbs, int paramInt, com.aspose.cells.b.a.b.zp paramzp, boolean paramBoolean)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzbs.k() == 2)
    {
      d(paramzr, paramzbs);
      return;
    }
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    zo[] arrayOfzo = zja.c(localzje);
    zbs localzbs = localzje.E();
    double d1 = localzbs.S();
    double d2 = localzbs.T();
    double d3 = localzbs.U();
    int i = 0;
    if (localzbs.D() == localzbs.l()) {
      i = 1;
    }
    if (localzbs.p()) {
      d3 = d1 - d3;
    } else {
      d3 -= d2;
    }
    int j = (int)(d3 / (d1 - d2) * localzje.N().i());
    if (j != 0) {
      zanv.a(paramzr, arrayOfzo[0].d(), arrayOfzo[0].e() - j, arrayOfzo[1].d(), arrayOfzo[1].e() - j, paramzbs.g());
    }
    if (localzje.p() >= 0) {
      zanv.a(paramzr, arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[1].d(), arrayOfzo[1].e(), paramzbs.g());
    }
    if (paramzbs.E() == 2)
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - j);
      arrayOfzo[1].b(arrayOfzo[1].e() - j);
    }
    zbfe localzbfe = localzje.z();
    zbwu localzbwu = paramzbs.F();
    ArrayList localArrayList = localzje.z().c();
    ArrayList[] arrayOfArrayList = localzje.z().e();
    float f1 = paramzbs.F().k();
    int k = (paramzbs.f()) || (localzje.u()) ? 1 : 0;
    int m;
    if (k != 0)
    {
      m = paramInt;
    }
    else
    {
      m = paramInt - 1;
      if (m == 0) {
        m = 1;
      }
    }
    double d4 = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    int n = zbxz.c(d4 * 180.0D / 3.141592653589793D);
    int i1 = 0;
    if (n <= a) {
      i1 = 1;
    }
    float f2 = (arrayOfzo[1].d() - arrayOfzo[0].d()) / m;
    float f3 = (arrayOfzo[1].e() - arrayOfzo[0].e()) / m;
    int i2 = 1;
    int i3 = 1;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    for (int i4 = 0; i4 < paramInt; i4++)
    {
      int i5 = i4;
      if (paramzbs.p()) {
        i5 = paramInt - 1 - i4;
      }
      localObject1 = "";
      localObject2 = localzbwu.h();
      if (i5 < paramzbs.l.size())
      {
        localObject1 = a(paramzbs, paramzbs.l.get(i5));
        localObject2 = zqz.a(paramzbs.l.get(i5), localzbwu.b(), (Color)localObject2);
        if ((localzbwu.c()) && (localArrayList.size() > 0))
        {
          localObject3 = "";
          boolean bool2 = false;
          localObject3 = i5 < localArrayList.size() ? ((zgm)localArrayList.get(i5)).c() : "";
          bool2 = i5 < localArrayList.size() ? ((zgm)localArrayList.get(i5)).b() : false;
          localObject1 = zqz.a(paramzbs.c().an(), paramzbs.l.get(i5), (String)localObject3, bool2, localzje.U());
          localObject2 = zqz.a(paramzbs.l.get(i5), (String)localObject3, (Color)localObject2);
        }
      }
      if ((paramzbs.E() != 3) && (i5 % paramzbs.H() == 0))
      {
        localObject3 = zq.c();
        i2 = 1;
        i3 = 1;
        float f5;
        if (localzje.p() >= 0)
        {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F - paramzbs.i / 2.0F);
            ((zq)localObject3).b(arrayOfzo[0].e() + f1);
            i3 = 9;
            if (k == 0) {
              ((zq)localObject3).a(((zq)localObject3).f() - f2 / 2.0F);
            }
            ((zq)localObject3).c(paramzbs.i);
            ((zq)localObject3).d(paramzbs.h);
          }
          else
          {
            if (i1 != 0)
            {
              ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F - paramzbs.i / 2.0F);
              ((zq)localObject3).b(arrayOfzo[0].e() + i4 * f3 + f3 / 2.0F);
              ((zq)localObject3).b(((zq)localObject3).g() + f1);
              i3 = 9;
              ((zq)localObject3).c(paramzbs.i);
              ((zq)localObject3).d(paramzbs.h);
            }
            else
            {
              f5 = (float)(paramzbs.h / 2.0F / Math.tan(d4) + f1 / Math.sin(d4));
              if ((f2 > 0.0F) && (f3 > 0.0F))
              {
                ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F - f5 - paramzbs.i);
                i2 = 8;
              }
              else if ((f2 < 0.0F) && (f3 > 0.0F))
              {
                ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F + f5);
                i2 = 7;
              }
              else if ((f2 < 0.0F) && (f3 < 0.0F))
              {
                ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F - f5 - paramzbs.i);
                i2 = 8;
              }
              else
              {
                ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F + f5);
                i2 = 7;
              }
              ((zq)localObject3).b(arrayOfzo[0].e() + i4 * f3 + f3 / 2.0F - paramzbs.h / 2.0F);
              ((zq)localObject3).c(paramzbs.i);
              ((zq)localObject3).d(paramzbs.h);
            }
            if (k == 0)
            {
              ((zq)localObject3).a(((zq)localObject3).f() - f2 / 2.0F);
              ((zq)localObject3).b(((zq)localObject3).g() - f3 / 2.0F);
            }
          }
        }
        else if ((localzje.p() < 0) && (i == 0) && (paramzbs.E() == 2)) {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F - paramzbs.i / 2.0F);
            ((zq)localObject3).b(arrayOfzo[0].e() - paramzbs.h - f1);
            if (k == 0) {
              ((zq)localObject3).a(((zq)localObject3).f() - f2 / 2.0F);
            }
            ((zq)localObject3).c(paramzbs.i);
            ((zq)localObject3).d(paramzbs.h);
          }
          else
          {
            if (i1 != 0)
            {
              ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F - paramzbs.i / 2.0F);
              ((zq)localObject3).b(arrayOfzo[0].e() + i4 * f3 + f3 / 2.0F);
              ((zq)localObject3).b(((zq)localObject3).g() - f1);
              ((zq)localObject3).b(((zq)localObject3).g() - paramzbs.h);
              i3 = 0;
              ((zq)localObject3).c(paramzbs.i);
              ((zq)localObject3).d(paramzbs.h);
            }
            else
            {
              f5 = (float)(paramzbs.h / 2.0F / Math.tan(d4) + f1 / Math.sin(d4));
              if ((f2 > 0.0F) && (f3 < 0.0F))
              {
                ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F - f5 - paramzbs.i);
                i2 = 8;
              }
              else if ((f2 < 0.0F) && (f3 < 0.0F))
              {
                ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F + f5);
                i2 = 7;
              }
              else if ((f2 < 0.0F) && (f3 > 0.0F))
              {
                ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F - f5 - paramzbs.i);
                i2 = 8;
              }
              else
              {
                ((zq)localObject3).a(arrayOfzo[0].d() + i4 * f2 + f2 / 2.0F + f5);
                i2 = 7;
              }
              ((zq)localObject3).b(arrayOfzo[0].e() + i4 * f3 + f3 / 2.0F - paramzbs.h / 2.0F);
              ((zq)localObject3).c(paramzbs.i);
              ((zq)localObject3).d(paramzbs.h);
            }
            if (k == 0)
            {
              ((zq)localObject3).a(((zq)localObject3).f() - f2 / 2.0F);
              ((zq)localObject3).b(((zq)localObject3).g() - f3 / 2.0F);
            }
          }
        }
        if ((!((zq)localObject3).n()) && (((zq)localObject3).h() > 0.0F) && (((zq)localObject3).i() > 0.0F)) {
          a(paramzr, com.aspose.cells.b.a.b.zp.a((zq)localObject3), (String)localObject1, localzbwu.e(), localzbwu.a(), (Color)localObject2, i2, i3);
        }
      }
    }
    a(paramzr, paramzbs, j, paramInt);
    boolean bool1 = localzje.E().p();
    float f4 = arrayOfzo[0].e();
    i3 = 9;
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList.size() > 0) && (paramzbs.E() != 3))
    {
      localObject1 = arrayOfArrayList[0];
      localObject2 = (zgm)((List)localObject1).get(0);
      localObject3 = zqz.a(paramzbs.c().an(), ((zgm)localObject2).a(), ((zgm)localObject2).c(), ((zgm)localObject2).b(), localzje.U());
      com.aspose.cells.b.a.b.zs localzs = zbvx.a(paramzbs.c().ar(), (String)localObject3, 0, localzbwu.a(), new zt(paramzp.e(), paramzp.f()), 1, 1);
      float f6;
      if (!paramzbs.p()) {
        f6 = arrayOfzo[0].d();
      } else {
        f6 = arrayOfzo[1].d();
      }
      float f7 = f4 + f1 * (arrayOfArrayList.length + 1) + paramzbs.g;
      float f8 = f4;
      boolean bool3 = false;
      if (arrayOfzo[0].e() == arrayOfzo[1].e()) {
        a(paramzr, arrayOfArrayList, f6, f7, f1, bool3, paramzbs, f2, localzbwu, i3, f8, paramzp, paramBoolean);
      }
    }
  }
  
  private static void d(zr paramzr, zbs paramzbs)
    throws Exception
  {
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    zo[] arrayOfzo = zja.c(localzje);
    int i = 0;
    if (localzje.E().D() == localzje.E().l()) {
      i = 1;
    }
    double d1;
    if (localzje.E().p()) {
      d1 = localzje.E().z() - localzje.E().l();
    } else {
      d1 = localzje.E().l() - localzje.E().D();
    }
    int j = (int)(d1 / (localzje.E().z() - localzje.E().D()) * localzje.N().i());
    if (j != 0) {
      zanv.a(paramzr, arrayOfzo[0].d(), arrayOfzo[0].e() - j, arrayOfzo[1].d(), arrayOfzo[1].e() - j, paramzbs.g());
    }
    if (localzje.p() >= 0) {
      zanv.a(paramzr, arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[1].d(), arrayOfzo[1].e(), paramzbs.g());
    }
    if (paramzbs.E() == 2)
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - j);
      arrayOfzo[1].b(arrayOfzo[1].e() - j);
    }
    zbfe localzbfe = localzje.z();
    zbwu localzbwu = paramzbs.F();
    ArrayList localArrayList1 = localzje.z().c();
    float f1 = paramzbs.F().k();
    double d2 = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    int k = zbxz.c(180.0D * d2 / 3.141592653589793D);
    int m = 0;
    if (k <= a) {
      m = 1;
    }
    int n = (int)paramzbs.z();
    int i1 = (int)paramzbs.D();
    int i2 = paramzbs.j();
    int i3 = (paramzbs.f()) || (localzje.u()) ? 1 : 0;
    int i4;
    if (i3 != 0)
    {
      i4 = a(i2, n, i1, paramzbs.c().U()) + 1;
    }
    else
    {
      i4 = a(i2, n, i1, paramzbs.c().U());
      if (i4 == 0) {
        i4 = 1;
      }
    }
    float f2 = (arrayOfzo[1].d() - arrayOfzo[0].d()) / i4;
    float f3 = (arrayOfzo[1].e() - arrayOfzo[0].e()) / i4;
    ArrayList localArrayList2 = paramzbs.l;
    int i5 = 1;
    int i6 = 1;
    for (int i7 = 0; i7 < localArrayList2.size(); i7++)
    {
      int i8 = i7;
      if (paramzbs.p()) {
        i8 = localArrayList2.size() - 1 - i7;
      }
      Object localObject1 = paramzbs.l.get(i8);
      String str = "";
      Color localColor = localzbwu.h();
      str = a(paramzbs, localObject1);
      localColor = zqz.a(localObject1, localzbwu.b(), localColor);
      Object localObject2;
      if ((localzbwu.c()) && (localzje.z().a))
      {
        localObject2 = "";
        boolean bool = false;
        Iterator localIterator = localArrayList1.iterator();
        while (localIterator.hasNext())
        {
          zgm localzgm = (zgm)localIterator.next();
          if (ziy.a(localzgm.a(), localzje.U()) == ze.f(localObject1))
          {
            localObject2 = localzgm.c();
            bool = localzgm.b();
            str = zqz.a(paramzbs.c().an(), localObject1, (String)localObject2, bool, localzje.U());
            localColor = zqz.a(localObject1, (String)localObject2, localColor);
            break;
          }
        }
      }
      if (paramzbs.E() != 3)
      {
        localObject2 = zq.c();
        i5 = 1;
        i6 = 1;
        float f4;
        if (localzje.p() >= 0)
        {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
            ((zq)localObject2).b(arrayOfzo[0].e() + f1);
            i6 = 9;
            if (i3 == 0) {
              ((zq)localObject2).a(((zq)localObject2).f() - f2 / 2.0F);
            }
            ((zq)localObject2).c(paramzbs.f);
            ((zq)localObject2).d(paramzbs.g);
          }
          else
          {
            if (m != 0)
            {
              ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
              ((zq)localObject2).b(arrayOfzo[0].e() + i7 * f3 + f3 / 2.0F);
              ((zq)localObject2).b(((zq)localObject2).g() + f1);
              i6 = 9;
              ((zq)localObject2).c(paramzbs.f);
              ((zq)localObject2).d(paramzbs.g);
            }
            else
            {
              f4 = (float)(paramzbs.g / 2.0F / Math.tan(d2) + f1 / Math.sin(d2));
              if ((f2 > 0.0F) && (f3 > 0.0F))
              {
                ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - f4 - paramzbs.f);
                i5 = 8;
              }
              else if ((f2 < 0.0F) && (f3 > 0.0F))
              {
                ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F + f4);
                i5 = 7;
              }
              else if ((f2 < 0.0F) && (f3 < 0.0F))
              {
                ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - f4 - paramzbs.f);
                i5 = 8;
              }
              else
              {
                ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F + f4);
                i5 = 7;
              }
              ((zq)localObject2).b(arrayOfzo[0].e() + i7 * f3 + f3 / 2.0F - paramzbs.g / 2.0F);
              ((zq)localObject2).c(paramzbs.f);
              ((zq)localObject2).d(paramzbs.g);
            }
            if (i3 == 0)
            {
              ((zq)localObject2).a(((zq)localObject2).f() - f2 / 2.0F);
              ((zq)localObject2).b(((zq)localObject2).g() - f3 / 2.0F);
            }
          }
        }
        else if ((localzje.p() < 0) && (i == 0) && (paramzbs.E() == 2)) {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
            ((zq)localObject2).b(arrayOfzo[0].e() - paramzbs.g - f1);
            if (i3 == 0) {
              ((zq)localObject2).a(((zq)localObject2).f() - f2 / 2.0F);
            }
            ((zq)localObject2).c(paramzbs.f);
            ((zq)localObject2).d(paramzbs.g);
          }
          else
          {
            if (m != 0)
            {
              ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
              ((zq)localObject2).b(arrayOfzo[0].e() + i7 * f3 + f3 / 2.0F);
              ((zq)localObject2).b(((zq)localObject2).g() - f1);
              ((zq)localObject2).b(((zq)localObject2).g() - paramzbs.g);
              i6 = 0;
              ((zq)localObject2).c(paramzbs.f);
              ((zq)localObject2).d(paramzbs.g);
            }
            else
            {
              f4 = (float)(paramzbs.g / 2.0F / Math.tan(d2) + f1 / Math.sin(d2));
              if ((f2 > 0.0F) && (f3 < 0.0F))
              {
                ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - f4 - paramzbs.f);
                i5 = 8;
              }
              else if ((f2 < 0.0F) && (f3 < 0.0F))
              {
                ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F + f4);
                i5 = 7;
              }
              else if ((f2 < 0.0F) && (f3 > 0.0F))
              {
                ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F - f4 - paramzbs.f);
                i5 = 8;
              }
              else
              {
                ((zq)localObject2).a(arrayOfzo[0].d() + i7 * f2 + f2 / 2.0F + f4);
                i5 = 7;
              }
              ((zq)localObject2).b(arrayOfzo[0].e() + i7 * f3 + f3 / 2.0F - paramzbs.g / 2.0F);
              ((zq)localObject2).c(paramzbs.f);
              ((zq)localObject2).d(paramzbs.g);
            }
            if (i3 == 0)
            {
              ((zq)localObject2).a(((zq)localObject2).f() - f2 / 2.0F);
              ((zq)localObject2).b(((zq)localObject2).g() - f3 / 2.0F);
            }
          }
        }
        if ((!((zq)localObject2).n()) && (((zq)localObject2).h() > 0.0F) && (((zq)localObject2).i() > 0.0F)) {
          a(paramzr, com.aspose.cells.b.a.b.zp.a((zq)localObject2), str, localzbwu.e(), localzbwu.a(), localColor, i5, i6);
        }
      }
    }
    a(paramzr, paramzbs, j);
  }
  
  private static void a(zr paramzr, zbs paramzbs, int paramInt1, int paramInt2)
  {
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    if (((paramzbs.w() == 2) && (paramzbs.A() == 2)) || (!paramzbs.g().e())) {
      return;
    }
    int i = (paramzbs.f()) || (paramzbs.c().u()) ? 1 : 0;
    zo[] arrayOfzo;
    if (paramzbs.d() == 4)
    {
      arrayOfzo = zja.d(localzje);
      i = 1;
    }
    else
    {
      arrayOfzo = zja.c(localzje);
    }
    double d = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    int j = zbxz.c(180.0D * d / 3.141592653589793D);
    int k = 0;
    if (j <= a) {
      k = 1;
    }
    int m;
    if (i != 0)
    {
      m = paramInt2;
    }
    else
    {
      m = paramInt2 - 1;
      if (m == 0) {
        m = 1;
      }
    }
    if ((localzje.p() < 0) && (paramInt1 > 0))
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - paramInt1);
      arrayOfzo[1].b(arrayOfzo[1].e() - paramInt1);
    }
    for (paramInt1 = 0;; paramInt1 = 0)
    {
      int n;
      int i1;
      zo localzo1;
      zo localzo2;
      float f1;
      float f2;
      float f3;
      float f4;
      int i2;
      int i3;
      if (k != 0)
      {
        n = 0;
        i1 = 0;
        switch (paramzbs.w())
        {
        case 1: 
          if (localzje.p() >= 0) {
            n = 1;
          } else {
            i1 = 1;
          }
          break;
        case 3: 
          if (localzje.p() >= 0) {
            i1 = 1;
          } else {
            n = 1;
          }
          break;
        case 0: 
          n = 1;
          i1 = 1;
          break;
        }
        if (!paramzbs.p())
        {
          localzo1 = arrayOfzo[0];
          localzo2 = arrayOfzo[1];
        }
        else
        {
          localzo1 = arrayOfzo[1];
          localzo2 = arrayOfzo[0];
        }
        f1 = (localzo2.d() - localzo1.d()) / m;
        f2 = (localzo2.e() - localzo1.e()) / m;
        if ((f1 == 0.0F) && (f2 == 0.0F)) {
          return;
        }
        f3 = localzo1.d();
        for (f4 = localzo1.e(); ((localzo1.d() <= f3) && (f3 <= localzo2.d())) || ((localzo1.d() >= f3) && (f3 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.d())); f4 += paramzbs.J() * f2)
        {
          if (n != 0) {
            zanv.a(paramzr, f3, f4 - paramzbs.X(), f3, f4, paramzbs.g());
          }
          if (i1 != 0) {
            zanv.a(paramzr, f3, f4, f3, f4 + paramzbs.X(), paramzbs.g());
          }
          f3 += paramzbs.J() * f1;
        }
        i2 = 0;
        i3 = 0;
        switch (paramzbs.A())
        {
        case 1: 
          if (localzje.p() >= 0) {
            i2 = 1;
          } else {
            i3 = 1;
          }
          break;
        case 3: 
          if (localzje.p() >= 0) {
            i3 = 1;
          } else {
            i2 = 1;
          }
          break;
        case 0: 
          i2 = 1;
          i3 = 1;
          break;
        }
        f3 = localzo1.d() + paramzbs.J() * f1 / 2.0F;
        for (f4 = localzo1.e() + paramzbs.J() * f2 / 2.0F; ((localzo1.d() <= f3) && (f3 <= localzo2.d())) || ((localzo1.d() >= f3) && (f3 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.d())); f4 += paramzbs.J() * f2)
        {
          if (i2 != 0) {
            zanv.a(paramzr, f3, f4 - paramzbs.Y(), f3, f4, paramzbs.g());
          }
          if (i3 != 0) {
            zanv.a(paramzr, f3, f4, f3, f4 + paramzbs.Y(), paramzbs.g());
          }
          if (paramzbs.w() == 2)
          {
            f3 += paramzbs.J() * f1 / 2.0F;
            f4 += paramzbs.J() * f2 / 2.0F;
            if (((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())))
            {
              if (i2 != 0) {
                zanv.a(paramzr, f3, f4 - paramzbs.Y(), f3, f4, paramzbs.g());
              }
              if (i3 != 0) {
                zanv.a(paramzr, f3, f4, f3, f4 + paramzbs.Y(), paramzbs.g());
              }
            }
            f3 -= paramzbs.J() * f1 / 2.0F;
            f4 -= paramzbs.J() * f2 / 2.0F;
          }
          f3 += paramzbs.J() * f1;
        }
      }
      else
      {
        n = 0;
        i1 = 0;
        switch (paramzbs.w())
        {
        case 1: 
          if ((localzje.D() < 90) || ((localzje.D() >= 225) && (localzje.D() < 270))) {
            n = 1;
          } else {
            i1 = 1;
          }
          break;
        case 3: 
          if ((localzje.D() < 90) || ((localzje.D() >= 225) && (localzje.D() < 270))) {
            i1 = 1;
          } else {
            n = 1;
          }
          break;
        case 0: 
          n = 1;
          i1 = 1;
          break;
        }
        if (!paramzbs.p())
        {
          localzo1 = arrayOfzo[0];
          localzo2 = arrayOfzo[1];
        }
        else
        {
          localzo1 = arrayOfzo[1];
          localzo2 = arrayOfzo[0];
        }
        f1 = (localzo2.d() - localzo1.d()) / m;
        f2 = (localzo2.e() - localzo1.e()) / m;
        if ((f1 == 0.0F) && (f2 == 0.0F)) {
          return;
        }
        f3 = localzo1.d();
        for (f4 = localzo1.e(); ((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())); f4 += paramzbs.J() * f2)
        {
          if (n != 0) {
            zanv.a(paramzr, f3, f4, f3 + paramzbs.X(), f4, paramzbs.g());
          }
          if (i1 != 0) {
            zanv.a(paramzr, f3 - paramzbs.X(), f4, f3, f4, paramzbs.g());
          }
          f3 += paramzbs.J() * f1;
        }
        i2 = 0;
        i3 = 0;
        switch (paramzbs.A())
        {
        case 1: 
          if ((localzje.D() < 90) || ((localzje.D() >= 225) && (localzje.D() < 270))) {
            i2 = 1;
          } else {
            i3 = 1;
          }
          break;
        case 3: 
          if ((localzje.D() < 90) || ((localzje.D() >= 225) && (localzje.D() < 270))) {
            i3 = 1;
          } else {
            i2 = 1;
          }
          break;
        case 0: 
          i2 = 1;
          i3 = 1;
          break;
        }
        f3 = localzo1.d() + paramzbs.J() * f1 / 2.0F;
        for (f4 = localzo1.e() + paramzbs.J() * f2 / 2.0F; ((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())); f4 += paramzbs.J() * f2)
        {
          if (i2 != 0) {
            zanv.a(paramzr, f3, f4, f3 + paramzbs.Y(), f4, paramzbs.g());
          }
          if (i3 != 0) {
            zanv.a(paramzr, f3 - paramzbs.Y(), f4, f3, f4, paramzbs.g());
          }
          if (paramzbs.w() == 2)
          {
            f3 += paramzbs.J() * f1 / 2.0F;
            f4 += paramzbs.J() * f2 / 2.0F;
            if (((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())))
            {
              if (i2 != 0) {
                zanv.a(paramzr, f3, f4, f3 + paramzbs.Y(), f4, paramzbs.g());
              }
              if (i3 != 0) {
                zanv.a(paramzr, f3 - paramzbs.Y(), f4, f3, f4, paramzbs.g());
              }
            }
            f3 -= paramzbs.J() * f1 / 2.0F;
            f4 -= paramzbs.J() * f2 / 2.0F;
          }
          f3 += paramzbs.J() * f1;
        }
      }
      if (paramInt1 <= 0) {
        break;
      }
      arrayOfzo[0].b(arrayOfzo[0].e() - paramInt1);
      arrayOfzo[1].b(arrayOfzo[1].e() - paramInt1);
    }
  }
  
  private static void a(zr paramzr, zbs paramzbs, int paramInt)
  {
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    if (((paramzbs.w() == 2) && (paramzbs.A() == 2)) || (!paramzbs.g().e())) {
      return;
    }
    zo[] arrayOfzo = zja.c(localzje);
    double d = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    int i = zbxz.c(180.0D * d / 3.141592653589793D);
    int j = 0;
    if (i <= a) {
      j = 1;
    }
    int k = (int)paramzbs.z();
    int m = (int)paramzbs.D();
    int n = paramzbs.j();
    int i1 = (paramzbs.f()) || (localzje.u()) ? 1 : 0;
    int i2;
    if (i1 != 0)
    {
      i2 = a(n, k, m, paramzbs.c().U()) + 1;
    }
    else
    {
      i2 = a(n, k, m, paramzbs.c().U());
      if (i2 == 0) {
        i2 = 1;
      }
    }
    if ((localzje.p() < 0) && (paramInt > 0))
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - paramInt);
      arrayOfzo[1].b(arrayOfzo[1].e() - paramInt);
    }
    for (paramInt = 0;; paramInt = 0)
    {
      int i3;
      int i4;
      zo localzo1;
      zo localzo2;
      float f1;
      float f2;
      float f3;
      float f4;
      int i5;
      int i6;
      if (j != 0)
      {
        i3 = 0;
        i4 = 0;
        switch (paramzbs.w())
        {
        case 1: 
          if (localzje.p() >= 0) {
            i3 = 1;
          } else {
            i4 = 1;
          }
          break;
        case 3: 
          if (localzje.p() >= 0) {
            i4 = 1;
          } else {
            i3 = 1;
          }
          break;
        case 0: 
          i3 = 1;
          i4 = 1;
          break;
        }
        if (!paramzbs.p())
        {
          localzo1 = arrayOfzo[0];
          localzo2 = arrayOfzo[1];
        }
        else
        {
          localzo1 = arrayOfzo[1];
          localzo2 = arrayOfzo[0];
        }
        f1 = (localzo2.d() - localzo1.d()) / i2;
        f2 = (localzo2.e() - localzo1.e()) / i2;
        f3 = localzo1.d();
        for (f4 = localzo1.e(); ((localzo1.d() <= f3) && (f3 <= localzo2.d())) || ((localzo1.d() >= f3) && (f3 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.d())); f4 += f2 * a(n, a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), (int)paramzbs.D(), paramzbs.c().U()), (int)paramzbs.D(), paramzbs.c().U()))
        {
          if (i3 != 0) {
            zanv.a(paramzr, f3, f4 - paramzbs.X(), f3, f4, paramzbs.g());
          }
          if (i4 != 0) {
            zanv.a(paramzr, f3, f4, f3, f4 + paramzbs.X(), paramzbs.g());
          }
          f3 += f1 * a(n, a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), (int)paramzbs.D(), paramzbs.c().U()), (int)paramzbs.D(), paramzbs.c().U());
        }
        i5 = 0;
        i6 = 0;
        switch (paramzbs.A())
        {
        case 1: 
          if (localzje.p() >= 0) {
            i5 = 1;
          } else {
            i6 = 1;
          }
          break;
        case 3: 
          if (localzje.p() >= 0) {
            i6 = 1;
          } else {
            i5 = 1;
          }
          break;
        case 0: 
          i5 = 1;
          i6 = 1;
          break;
        }
        f3 = localzo1.d();
        for (f4 = localzo1.e(); ((localzo1.d() <= f3) && (f3 <= localzo2.d())) || ((localzo1.d() >= f3) && (f3 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.d())); f4 += f2 * a(n, a(paramzbs.j(), paramzbs.C(), (int)paramzbs.B(), (int)paramzbs.D(), paramzbs.c().U()), (int)paramzbs.D(), paramzbs.c().U()))
        {
          if (i5 != 0) {
            zanv.a(paramzr, f3, f4 - paramzbs.Y(), f3, f4, paramzbs.g());
          }
          if (i6 != 0) {
            zanv.a(paramzr, f3, f4, f3, f4 + paramzbs.Y(), paramzbs.g());
          }
          f3 += f1 * a(n, a(paramzbs.j(), paramzbs.C(), (int)paramzbs.B(), (int)paramzbs.D(), paramzbs.c().U()), (int)paramzbs.D(), paramzbs.c().U());
        }
      }
      else
      {
        i3 = 0;
        i4 = 0;
        switch (paramzbs.w())
        {
        case 1: 
          if ((localzje.D() < 90) || ((localzje.D() >= 225) && (localzje.D() < 270))) {
            i3 = 1;
          } else {
            i4 = 1;
          }
          break;
        case 3: 
          if ((localzje.D() < 90) || ((localzje.D() >= 225) && (localzje.D() < 270))) {
            i4 = 1;
          } else {
            i3 = 1;
          }
          break;
        case 0: 
          i3 = 1;
          i4 = 1;
          break;
        }
        if (!paramzbs.p())
        {
          localzo1 = arrayOfzo[0];
          localzo2 = arrayOfzo[1];
        }
        else
        {
          localzo1 = arrayOfzo[1];
          localzo2 = arrayOfzo[0];
        }
        f1 = (localzo2.d() - localzo1.d()) / i2;
        f2 = (localzo2.e() - localzo1.e()) / i2;
        f3 = localzo1.d();
        for (f4 = localzo1.e(); ((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())); f4 += f2 * a(n, a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), (int)paramzbs.D(), paramzbs.c().U()), (int)paramzbs.D(), paramzbs.c().U()))
        {
          if (i3 != 0) {
            zanv.a(paramzr, f3, f4, f3 + paramzbs.X(), f4, paramzbs.g());
          }
          if (i4 != 0) {
            zanv.a(paramzr, f3 - paramzbs.X(), f4, f3, f4, paramzbs.g());
          }
          f3 += f1 * a(n, a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), (int)paramzbs.D(), paramzbs.c().U()), (int)paramzbs.D(), paramzbs.c().U());
        }
        i5 = 0;
        i6 = 0;
        switch (paramzbs.A())
        {
        case 1: 
          if ((localzje.D() < 90) || ((localzje.D() >= 225) && (localzje.D() < 270))) {
            i5 = 1;
          } else {
            i6 = 1;
          }
          break;
        case 3: 
          if ((localzje.D() < 90) || ((localzje.D() >= 225) && (localzje.D() < 270))) {
            i6 = 1;
          } else {
            i5 = 1;
          }
          break;
        case 0: 
          i5 = 1;
          i6 = 1;
          break;
        }
        f3 = localzo1.d();
        boolean bool;
        for (f4 = localzo1.e(); ((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())); f4 += f2 * a(n, a(paramzbs.j(), paramzbs.C(), (int)paramzbs.B(), (int)paramzbs.D(), bool), (int)paramzbs.D(), bool))
        {
          if (i5 != 0) {
            zanv.a(paramzr, f3, f4, f3 + paramzbs.Y(), f4, paramzbs.g());
          }
          if (i6 != 0) {
            zanv.a(paramzr, f3 - paramzbs.Y(), f4, f3, f4, paramzbs.g());
          }
          bool = paramzbs.c().U();
          f3 += f1 * a(n, a(paramzbs.j(), paramzbs.C(), (int)paramzbs.B(), (int)paramzbs.D(), bool), (int)paramzbs.D(), bool);
        }
      }
      if (paramInt <= 0) {
        break;
      }
      arrayOfzo[0].b(arrayOfzo[0].e() - paramInt);
      arrayOfzo[1].b(arrayOfzo[1].e() - paramInt);
    }
  }
  
  static void b(zr paramzr, zbs paramzbs)
    throws Exception
  {
    if (paramzbs.c().B().D()) {
      return;
    }
    zje localzje = paramzbs.c();
    int i = localzje.M();
    zbyu localzbyu = localzje.N();
    zo[] arrayOfzo = zja.c(localzje);
    zanv.a(paramzr, arrayOfzo[0], arrayOfzo[1], paramzbs.g());
    zbwu localzbwu = paramzbs.F();
    zbfc localzbfc = localzje.z().c(0);
    zke localzke = localzbfc.D().b(0);
    String str1 = localzke != null ? localzke.A() : "";
    boolean bool = localzke != null ? localzke.B() : true;
    int j = 0;
    if ((localzbwu.c()) && (localzke != null)) {
      j = 1;
    }
    float f1 = 0.0F;
    f1 = arrayOfzo[0].e() + paramzbs.X();
    float f2 = (float)(localzje.N().g() / (paramzbs.z() - paramzbs.D()));
    ArrayList localArrayList = paramzbs.l;
    double d1 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
    double d2 = paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D();
    double d3 = paramzbs.n() ? zbxz.e(paramzbs.x()) : paramzbs.x();
    for (int k = 0; k < paramzbs.l.size(); k++)
    {
      double d4 = ((Double)paramzbs.l.get(k)).doubleValue();
      double d5 = paramzbs.n() ? zbxz.f(d4) : d4;
      if (k - 1 > 0 ? Math.abs(zbxz.b(d4, ze.g(localArrayList.get(k - 1)))) != d3 : (k + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d4, ze.g(localArrayList.get(k + 1)))) == d3))
      {
        float f3 = (float)((d4 - d2) / (d1 - d2) * localzje.N().g());
        if (!paramzbs.p()) {
          f3 = arrayOfzo[0].d() + f3;
        } else {
          f3 = arrayOfzo[1].d() - f3;
        }
        if (paramzbs.E() != 3)
        {
          if (paramzbs.ac())
          {
            d5 /= 100.0D;
            str1 = "0%";
          }
          String str2 = "";
          d5 = paramzbs.n() ? d5 : d5 * Math.pow(10.0D, paramzbs.Q().f());
          Color localColor = localzbwu.h();
          if (j != 0)
          {
            str2 = zqz.a(paramzbs.c().an(), Double.valueOf(d5), str1, bool, localzje.U());
            localColor = zqz.a(Double.valueOf(d5), str1, localColor);
          }
          else
          {
            str2 = a(paramzbs, Double.valueOf(d5));
            localColor = zqz.a(Double.valueOf(d5), localzbwu.b(), localColor);
          }
          zq localzq = new zq(f3 - paramzbs.f / 2.0F, f1, paramzbs.f, paramzbs.g);
          a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str2, localzbwu.e(), localzbwu.a(), localColor, 1, 9);
        }
      }
    }
    e(paramzr, paramzbs);
  }
  
  private static void e(zr paramzr, zbs paramzbs)
  {
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    if (((paramzbs.w() == 2) && (paramzbs.A() == 2)) || (!paramzbs.g().e())) {
      return;
    }
    zo[] arrayOfzo = zja.c(localzje);
    int i = 0;
    int j = 0;
    switch (paramzbs.w())
    {
    case 1: 
      i = 1;
      break;
    case 3: 
      j = 1;
      break;
    case 0: 
      i = 1;
      j = 1;
      break;
    }
    zo localzo1;
    zo localzo2;
    if (!paramzbs.p())
    {
      localzo1 = arrayOfzo[0];
      localzo2 = arrayOfzo[1];
    }
    else
    {
      localzo1 = arrayOfzo[1];
      localzo2 = arrayOfzo[0];
    }
    float f1 = (float)((localzo2.d() - localzo1.d()) / (paramzbs.z() - paramzbs.D()));
    float f2 = localzo1.d();
    float f3 = localzo1.e();
    while (((localzo1.d() <= f2) && (f2 <= localzo2.d())) || ((localzo1.d() >= f2) && (f2 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f2) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f2) == com.aspose.cells.b.a.zr.a(localzo2.d())))
    {
      if (i != 0) {
        zanv.a(paramzr, f2, f3 - paramzbs.X(), f2, f3, paramzbs.g());
      }
      if (j != 0) {
        zanv.a(paramzr, f2, f3, f2, f3 + paramzbs.X(), paramzbs.g());
      }
      f2 += f1 * (float)paramzbs.x();
    }
    i = 0;
    j = 0;
    switch (paramzbs.A())
    {
    case 1: 
      i = 1;
      break;
    case 3: 
      j = 1;
      break;
    case 0: 
      i = 1;
      j = 1;
      break;
    }
    f2 = localzo1.d();
    f3 = localzo1.e();
    while (((localzo1.d() <= f2) && (f2 <= localzo2.d())) || ((localzo1.d() >= f2) && (f2 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f2) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f2) == com.aspose.cells.b.a.zr.a(localzo2.d())))
    {
      if (i != 0) {
        zanv.a(paramzr, f2, f3 - paramzbs.Y(), f2, f3, paramzbs.g());
      }
      if (j != 0) {
        zanv.a(paramzr, f2, f3, f2, f3 + paramzbs.Y(), paramzbs.g());
      }
      f2 += f1 * (float)paramzbs.B();
    }
  }
  
  static void a(zr paramzr, zbs paramzbs, int paramInt, com.aspose.cells.b.a.b.zp paramzp)
    throws Exception
  {
    if (paramzbs.c().B().D()) {
      return;
    }
    if (paramzbs.k() == 2)
    {
      f(paramzr, paramzbs);
      return;
    }
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    zo[] arrayOfzo = zja.c(localzje);
    zo localzo = zja.e(localzje);
    double d1;
    if (localzje.E().p()) {
      d1 = localzje.E().z() - localzje.E().l();
    } else {
      d1 = localzje.E().l() - localzje.E().D();
    }
    int i = (int)(d1 / (localzje.E().z() - localzje.E().D()) * localzje.N().g());
    zanv.a(paramzr, arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[0].d(), arrayOfzo[0].e() - localzje.N().i(), paramzbs.g());
    if (i > 0) {
      zanv.a(paramzr, arrayOfzo[0].d() + i, arrayOfzo[0].e(), arrayOfzo[0].d() + i, arrayOfzo[0].e() - localzje.N().i(), paramzbs.g());
    }
    if (paramzbs.E() == 2) {
      arrayOfzo[0].a(arrayOfzo[0].d() + i);
    }
    float f1 = 0.0F;
    float f2 = paramzbs.F().k();
    int j = 8;
    f1 = arrayOfzo[0].d() - paramzbs.i - f2;
    float f3 = localzje.N().i() / paramInt;
    zbwu localzbwu = paramzbs.F();
    ArrayList localArrayList = paramzbs.c().z().c();
    int k = 0;
    if ((localzbwu.c()) && (localArrayList.size() > 0)) {
      k = 1;
    }
    String str;
    Object localObject2;
    for (int m = 0; m < paramInt; m++)
    {
      double d2 = m * f3;
      d2 += f3 / 2.0F;
      float f4;
      if (paramzbs.p()) {
        f4 = (float)(arrayOfzo[0].e() - localzje.N().i() + d2) - paramzbs.h / 2.0F;
      } else {
        f4 = (float)(arrayOfzo[0].e() - d2) - paramzbs.h / 2.0F;
      }
      if ((paramzbs.E() != 3) && (m % paramzbs.H() == 0) && (m < paramzbs.l.size()))
      {
        str = "";
        localObject2 = localzbwu.h();
        if (k == 0)
        {
          str = a(paramzbs, paramzbs.l.get(m));
          localObject2 = zqz.a(paramzbs.l.get(m), localzbwu.b(), (Color)localObject2);
        }
        else
        {
          localObject3 = "";
          boolean bool2 = false;
          localObject3 = m < localArrayList.size() ? ((zgm)localArrayList.get(m)).c() : "";
          bool2 = m < localArrayList.size() ? ((zgm)localArrayList.get(m)).b() : false;
          str = zqz.a(paramzbs.c().an(), paramzbs.l.get(m), (String)localObject3, bool2, localzje.U());
          localObject2 = zqz.a(paramzbs.l.get(m), (String)localObject3, (Color)localObject2);
        }
        Object localObject3 = new zq(f1, f4, paramzbs.i, paramzbs.h);
        a(paramzr, com.aspose.cells.b.a.b.zp.a((zq)localObject3), str, localzbwu.e(), localzbwu.a(), (Color)localObject2, j, 1);
      }
    }
    b(paramzr, paramzbs, i, paramInt);
    boolean bool1 = localzje.E().p();
    ArrayList[] arrayOfArrayList = localzje.z().e();
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList.size() > 0) && (paramzbs.E() != 3))
    {
      Object localObject1 = arrayOfArrayList[0];
      zgm localzgm = (zgm)((List)localObject1).get(0);
      str = zqz.a(paramzbs.c().an(), localzgm.a(), localzgm.c(), localzgm.b(), localzje.U());
      localObject2 = zbvx.a(paramzbs.c().ar(), str, 0, localzbwu.a(), new zt(paramzp.e(), paramzp.f()), 1, 1);
      float f5 = 0.0F;
      if (!paramzbs.p()) {
        f5 = arrayOfzo[0].e();
      } else {
        f5 = arrayOfzo[0].e() - localzje.N().i();
      }
      f1 = arrayOfzo[0].d() - f2 * (arrayOfArrayList.length + 1) - paramzbs.f;
      float f6 = arrayOfzo[0].d();
      boolean bool3 = true;
      a(paramzr, arrayOfArrayList, bool3, paramzbs, localzbwu, f3, paramzp, f2, f6, f1, f5);
    }
  }
  
  private static void f(zr paramzr, zbs paramzbs)
    throws Exception
  {
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    zo[] arrayOfzo = zja.c(localzje);
    zo localzo = zja.e(localzje);
    double d;
    if (localzje.E().p()) {
      d = localzje.E().z() - localzje.E().l();
    } else {
      d = localzje.E().l() - localzje.E().D();
    }
    int i = (int)(d / (localzje.E().z() - localzje.E().D()) * localzje.N().g());
    zanv.a(paramzr, arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[0].d(), arrayOfzo[0].e() - localzje.N().i(), paramzbs.g());
    if (i > 0) {
      zanv.a(paramzr, arrayOfzo[0].d() + i, arrayOfzo[0].e(), arrayOfzo[0].d() + i, arrayOfzo[0].e() - localzje.N().i(), paramzbs.g());
    }
    if (paramzbs.E() == 2) {
      arrayOfzo[0].a(arrayOfzo[0].d() + i);
    }
    ArrayList localArrayList1 = paramzbs.l;
    float f1 = 0.0F;
    float f2 = paramzbs.F().k();
    float f3 = paramzbs.g / 2.0F;
    int j = 8;
    f1 = arrayOfzo[0].d() - paramzbs.f - f2;
    zbwu localzbwu = paramzbs.F();
    ArrayList localArrayList2 = paramzbs.c().z().c();
    int k = (int)paramzbs.z();
    int m = (int)paramzbs.D();
    int n = paramzbs.j();
    int i1 = a(n, k, m, paramzbs.c().U()) + 1;
    float f4 = localzbyu.i() / i1;
    for (int i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      int i3 = com.aspose.cells.b.a.zp.a(com.aspose.cells.b.a.zs.a(paramzbs.l.get(i2)));
      int i4 = a(n, i3, m, paramzbs.c().U());
      float f5 = f4 * i4;
      f5 += f4 / 2.0F;
      float f6;
      if (paramzbs.p()) {
        f6 = arrayOfzo[0].e() - localzje.N().i() + f5;
      } else {
        f6 = arrayOfzo[0].e() - f5;
      }
      if ((paramzbs.E() != 3) && (i2 % paramzbs.H() == 0) && (i2 < paramzbs.l.size()))
      {
        String str = "";
        Color localColor = localzbwu.h();
        str = a(paramzbs, Integer.valueOf(i3));
        localColor = zqz.a(Integer.valueOf(i3), localzbwu.b(), localColor);
        if ((localzbwu.c()) && (localzje.z().a))
        {
          localObject = "";
          boolean bool = false;
          Iterator localIterator = localArrayList2.iterator();
          while (localIterator.hasNext())
          {
            zgm localzgm = (zgm)localIterator.next();
            if (ziy.a(localzgm.a(), localzje.U()) == ze.f(Integer.valueOf(i3)))
            {
              localObject = localzgm.c();
              bool = localzgm.b();
              str = zqz.a(paramzbs.c().an(), Integer.valueOf(i3), (String)localObject, bool, localzje.U());
              localColor = zqz.a(Integer.valueOf(i3), (String)localObject, localColor);
              break;
            }
          }
        }
        Object localObject = new zq(f1, f6 - f3, paramzbs.f, paramzbs.g);
        a(paramzr, com.aspose.cells.b.a.b.zp.a((zq)localObject), str, localzbwu.e(), localzbwu.a(), localColor, j, 1);
      }
    }
    a(paramzr, i, paramzbs);
  }
  
  private static void b(zr paramzr, zbs paramzbs, int paramInt1, int paramInt2)
  {
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    if (((paramzbs.w() == 2) && (paramzbs.A() == 2)) || (!paramzbs.g().e())) {
      return;
    }
    zo[] arrayOfzo = zja.c(localzje);
    for (;;)
    {
      int i = 0;
      int j = 0;
      switch (paramzbs.w())
      {
      case 1: 
        i = 1;
        break;
      case 3: 
        j = 1;
        break;
      case 0: 
        i = 1;
        j = 1;
        break;
      }
      int k = 0;
      int m = 0;
      switch (paramzbs.A())
      {
      case 1: 
        k = 1;
        break;
      case 3: 
        m = 1;
        break;
      case 0: 
        k = 1;
        m = 1;
        break;
      }
      zo localzo1;
      zo localzo2;
      if (paramzbs.p())
      {
        localzo1 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e() - localzbyu.i());
        localzo2 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e());
      }
      else
      {
        localzo1 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e());
        localzo2 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e() - localzbyu.i());
      }
      float f1 = (localzo2.e() - localzo1.e()) / paramInt2;
      float f2 = localzo1.d();
      float f4;
      for (float f3 = localzo1.e(); ((localzo1.e() <= f3) && (f3 <= localzo2.e())) || ((localzo1.e() >= f3) && (f3 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.e())); f3 += paramzbs.J() * f1)
      {
        if (((localzo1.e() <= f3) && (f3 <= localzo2.e())) || ((localzo1.e() >= f3) && (f3 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.e())))
        {
          if (i != 0) {
            zanv.a(paramzr, f2, f3, f2 + paramzbs.X(), f3, paramzbs.g());
          }
          if (j != 0) {
            zanv.a(paramzr, f2 - paramzbs.X(), f3, f2, f3, paramzbs.g());
          }
        }
        f4 = f3 - paramzbs.J() * f1 / 2.0F;
        if (((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())))
        {
          if (k != 0) {
            zanv.a(paramzr, f2, f4, f2 + paramzbs.X(), f4, paramzbs.g());
          }
          if (m != 0) {
            zanv.a(paramzr, f2 - paramzbs.X(), f4, f2, f4, paramzbs.g());
          }
        }
      }
      if (paramzbs.J() * f1 > localzo2.e() - localzo1.e())
      {
        f4 = f3 - paramzbs.J() * f1 / 2.0F;
        if (((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())))
        {
          if (k != 0) {
            zanv.a(paramzr, f2, f4, f2 + paramzbs.X(), f4, paramzbs.g());
          }
          if (m != 0) {
            zanv.a(paramzr, f2 - paramzbs.X(), f4, f2, f4, paramzbs.g());
          }
        }
      }
      if (paramInt1 <= 0) {
        break;
      }
      arrayOfzo[0].a(arrayOfzo[0].d() + paramInt1);
      paramInt1 = 0;
    }
  }
  
  private static void a(zr paramzr, int paramInt, zbs paramzbs)
  {
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    if (((paramzbs.w() == 2) && (paramzbs.A() == 2)) || (!paramzbs.g().e())) {
      return;
    }
    zo[] arrayOfzo = zja.c(localzje);
    for (;;)
    {
      int i = 0;
      int j = 0;
      switch (paramzbs.w())
      {
      case 1: 
        i = 1;
        break;
      case 3: 
        j = 1;
        break;
      case 0: 
        i = 1;
        j = 1;
        break;
      }
      zo localzo1;
      zo localzo2;
      if (paramzbs.p())
      {
        localzo1 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e() - localzbyu.i());
        localzo2 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e());
      }
      else
      {
        localzo1 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e());
        localzo2 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e() - localzbyu.i());
      }
      int k = paramzbs.j();
      double d;
      if ((paramzbs.d() == 0) && (paramzbs.k() == 2)) {
        d = a(k, (int)paramzbs.z(), (int)paramzbs.D(), paramzbs.c().U()) + 1;
      } else {
        d = paramzbs.z() - paramzbs.D();
      }
      float f1 = (float)((localzo2.e() - localzo1.e()) / d);
      float f2 = localzo1.d();
      for (float f3 = localzo1.e(); ((localzo1.e() <= f3) && (f3 <= localzo2.e())) || ((localzo1.e() >= f3) && (f3 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.e())); f3 += f1 * a(k, a(paramzbs.j(), paramzbs.y(), (int)paramzbs.x(), (int)paramzbs.D(), paramzbs.c().U()), (int)paramzbs.D(), paramzbs.c().U()))
      {
        if (i != 0) {
          zanv.a(paramzr, f2, f3, f2 + paramzbs.X(), f3, paramzbs.g());
        }
        if (j != 0) {
          zanv.a(paramzr, f2 - paramzbs.X(), f3, f2, f3, paramzbs.g());
        }
      }
      int m = 0;
      int n = 0;
      switch (paramzbs.A())
      {
      case 1: 
        m = 1;
        break;
      case 3: 
        n = 1;
        break;
      case 0: 
        m = 1;
        n = 1;
        break;
      }
      f2 = localzo1.d();
      for (f3 = localzo1.e(); ((localzo1.e() <= f3) && (f3 <= localzo2.e())) || ((localzo1.e() >= f3) && (f3 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.e())); f3 += f1 * a(k, a(paramzbs.j(), paramzbs.C(), (int)paramzbs.B(), (int)paramzbs.D(), paramzbs.c().U()), (int)paramzbs.D(), paramzbs.c().U()))
      {
        if (m != 0) {
          zanv.a(paramzr, f2, f3, f2 + paramzbs.Y(), f3, paramzbs.g());
        }
        if (n != 0) {
          zanv.a(paramzr, f2 - paramzbs.Y(), f3, f2, f3, paramzbs.g());
        }
      }
      if (paramInt <= 0) {
        break;
      }
      arrayOfzo[0].a(arrayOfzo[0].d() + paramInt);
      paramInt = 0;
    }
  }
  
  static void c(zr paramzr, zbs paramzbs)
    throws Exception
  {
    if (paramzbs.c().B().D()) {
      return;
    }
    zje localzje = paramzbs.c();
    zbyu localzbyu = localzje.N();
    zo[] arrayOfzo = zja.d(localzje);
    zbs localzbs = localzje.E();
    double d1 = localzbs.S();
    double d2 = localzbs.T();
    double d3 = localzbs.U();
    int i = 0;
    if (localzbs.D() == localzbs.l()) {
      i = 1;
    }
    if (localzbs.p()) {
      d3 = d1 - d3;
    } else {
      d3 -= d2;
    }
    int j = (int)(d3 / (d1 - d2) * localzje.N().i());
    if (j != 0) {
      zanv.a(paramzr, arrayOfzo[0].d(), arrayOfzo[0].e() - j, arrayOfzo[1].d(), arrayOfzo[1].e() - j, paramzbs.g());
    }
    if (localzje.p() >= 0) {
      zanv.a(paramzr, arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[1].d(), arrayOfzo[1].e(), paramzbs.g());
    }
    if (paramzbs.E() == 2)
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - j);
      arrayOfzo[1].b(arrayOfzo[1].e() - j);
    }
    zbfe localzbfe = localzje.z();
    zbwu localzbwu = paramzbs.F();
    ArrayList localArrayList = localzje.z().c();
    float f1 = paramzbs.F().k();
    double d4 = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    int k = zbxz.c(180.0D * d4 / 3.141592653589793D);
    int m = 0;
    if (k <= a) {
      m = 1;
    }
    float f2 = (arrayOfzo[1].d() - arrayOfzo[0].d()) / paramzbs.l.size();
    float f3 = (arrayOfzo[1].e() - arrayOfzo[0].e()) / paramzbs.l.size();
    int n = 1;
    int i1 = 1;
    for (int i2 = 0; i2 < paramzbs.l.size(); i2++)
    {
      int i3 = i2;
      if (paramzbs.p()) {
        i3 = paramzbs.l.size() - 1 - i2;
      }
      String str = "";
      str = a(paramzbs, paramzbs.l.get(i3));
      if ((paramzbs.E() != 3) && (i3 % paramzbs.H() == 0))
      {
        zq localzq = zq.c();
        n = 1;
        i1 = 1;
        float f4;
        if (localzje.p() >= 0)
        {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            if (f2 == 0.0F)
            {
              localzq.a(arrayOfzo[0].d() + f1);
              localzq.b(arrayOfzo[0].e() - paramzbs.g / 2.0F);
              i1 = 9;
            }
            else
            {
              localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
              localzq.b(arrayOfzo[0].e() + f1);
              i1 = 9;
            }
            localzq.c(paramzbs.f);
            localzq.d(paramzbs.g);
          }
          else if (m != 0)
          {
            localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
            localzq.b(arrayOfzo[0].e() + i2 * f3 + f3 / 2.0F);
            localzq.b(localzq.g() + f1);
            i1 = 9;
            localzq.c(paramzbs.f);
            localzq.d(paramzbs.g);
          }
          else
          {
            f4 = (float)(paramzbs.g / 2.0F / Math.tan(d4) + f1 / Math.sin(d4));
            if ((f2 > 0.0F) && (f3 > 0.0F))
            {
              localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F - f4 - paramzbs.f);
              n = 8;
            }
            else if ((f2 < 0.0F) && (f3 > 0.0F))
            {
              localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F + f4);
              n = 7;
            }
            else if ((f2 < 0.0F) && (f3 < 0.0F))
            {
              localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F - f4 - paramzbs.f);
              n = 8;
            }
            else
            {
              localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F + f4);
              n = 7;
            }
            localzq.b(arrayOfzo[0].e() + i2 * f3 + f3 / 2.0F - paramzbs.g / 2.0F);
            localzq.c(paramzbs.f);
            localzq.d(paramzbs.g);
          }
        }
        else if ((localzje.p() < 0) && (i == 0) && (paramzbs.E() == 2)) {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
            localzq.b(arrayOfzo[0].e() - paramzbs.g - f1);
            localzq.c(paramzbs.f);
            localzq.d(paramzbs.g);
          }
          else if (m != 0)
          {
            localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F - paramzbs.f / 2.0F);
            localzq.b(arrayOfzo[0].e() + i2 * f3 + f3 / 2.0F);
            localzq.b(localzq.g() - f1);
            localzq.b(localzq.g() - paramzbs.g);
            i1 = 0;
            localzq.c(paramzbs.f);
            localzq.d(paramzbs.g);
          }
          else
          {
            f4 = (float)(paramzbs.g / 2.0F / Math.tan(d4) + f1 / Math.sin(d4));
            if ((f2 > 0.0F) && (f3 < 0.0F))
            {
              localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F - f4 - paramzbs.f);
              n = 8;
            }
            else if ((f2 < 0.0F) && (f3 < 0.0F))
            {
              localzq.a(arrayOfzo[0].d() + i2 * f2 + f4);
              n = 7;
            }
            else if ((f2 < 0.0F) && (f3 > 0.0F))
            {
              localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F - paramzbs.f - f4);
              n = 8;
            }
            else
            {
              localzq.a(arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F + f4);
              n = 7;
            }
            localzq.b(arrayOfzo[0].e() + i2 * f3 + f3 / 2.0F - paramzbs.g / 2.0F);
            localzq.c(paramzbs.f);
            localzq.d(paramzbs.g);
          }
        }
        if ((!localzq.n()) && (localzq.h() > 0.0F) && (localzq.i() > 0.0F)) {
          a(paramzr, com.aspose.cells.b.a.b.zp.a(localzq), str, localzbwu.e(), localzbwu.a(), localzbwu.h(), n, i1);
        }
      }
    }
    a(paramzr, paramzbs, j, paramzbs.l.size());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */