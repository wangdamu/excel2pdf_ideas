package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zbv
{
  private static double a = 0.98D;
  private static double b = 1.0E-10D;
  private static float c = 0.01F;
  
  static void a(zr paramzr, zbt paramzbt, zp paramzp, boolean paramBoolean, zbfd paramzbfd)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if ((!paramzbt.w().h()) && (!paramzbt.A().h())) {
      return;
    }
    int i = 0;
    if (paramBoolean)
    {
      if ((paramzbt.g() == 0) || (paramzbt.g() == 2)) {
        i = paramzp.f();
      } else {
        i = paramzp.e();
      }
    }
    else if ((paramzbt.g() == 0) || (paramzbt.g() == 2)) {
      i = paramzp.e();
    } else {
      i = paramzp.f();
    }
    double d1 = 0.0D;
    int j = (paramzbt.k() == 2) && ((paramzbt.g() == 0) || (paramzbt.g() == 2)) ? 1 : 0;
    if (paramzbfd.ay()) {
      j = 0;
    }
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d5 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    double d3;
    double d4;
    if ((!paramzbfd.ay()) && ((paramzbt.g() == 0) || (paramzbt.g() == 2)))
    {
      d3 = (int)paramzbt.z();
      d4 = (int)paramzbt.D();
      int k;
      if (j != 0)
      {
        if ((paramzbt.e().e().f()) || (paramzbt.e().u()))
        {
          k = a(paramzbt.j(), (int)d3, (int)d4, paramzbt.e().U()) + 1;
          d2 = a(paramzbt.j(), paramzbt.y(), 1, (int)d2, paramzbt.e().U());
        }
        else
        {
          k = a(paramzbt.j(), (int)d3, (int)d4, paramzbt.e().U());
          if (k == 0) {
            k = 1;
          }
        }
      }
      else if ((paramzbt.e().e().f()) || (paramzbt.e().u()))
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
      d3 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
      d4 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
      d1 = i / (d3 - d4);
    }
    double d6;
    double d10;
    int i3;
    int i4;
    if ((paramzbt.w().h()) && (d5 > 0.0D))
    {
      d6 = d4;
      int i2 = zbxz.g(d5);
      d10 = zbxz.a(d6, i2);
      d2 = zbxz.a(d2, i2);
      for (i3 = 1; d10 <= d2; i3++)
      {
        double d8;
        if (j != 0)
        {
          i4 = a(paramzbt.j(), (int)d6, (int)d4, paramzbt.e().U());
          d8 = d1 * i4;
        }
        else
        {
          d8 = d1 * (d6 - d4);
        }
        if ((!paramzbt.e().B().d().p()) || ((d10 != d4) && (d10 != d2))) {
          if (paramBoolean)
          {
            if ((paramzbt.g() == 0) || (paramzbt.g() == 2))
            {
              if (paramzbt.p()) {
                paramzbt.w().a(paramzp.c(), (float)(paramzp.d() + d8), paramzp.i(), (float)(paramzp.d() + d8));
              } else {
                paramzbt.w().a(paramzp.c(), (float)(paramzp.j() - d8), paramzp.i(), (float)(paramzp.j() - d8));
              }
            }
            else if (paramzbt.p()) {
              paramzbt.w().a((float)(paramzp.i() - d8), paramzp.d(), (float)(paramzp.i() - d8), paramzp.j());
            } else {
              paramzbt.w().a((float)(paramzp.c() + d8), paramzp.d(), (float)(paramzp.c() + d8), paramzp.j());
            }
          }
          else if ((paramzbt.g() == 0) || (paramzbt.g() == 2))
          {
            if (paramzbt.p()) {
              paramzbt.w().a((float)(paramzp.i() - d8), paramzp.d(), (float)(paramzp.i() - d8), paramzp.j());
            } else {
              paramzbt.w().a((float)(paramzp.c() + d8), paramzp.d(), (float)(paramzp.c() + d8), paramzp.j());
            }
          }
          else if (paramzbt.p()) {
            paramzbt.w().a(paramzp.c(), (float)(paramzp.d() + d8), paramzp.i(), (float)(paramzp.d() + d8));
          } else {
            paramzbt.w().a(paramzp.c(), (float)(paramzp.j() - d8), paramzp.i(), (float)(paramzp.j() - d8));
          }
        }
        if (j != 0)
        {
          d6 = a(paramzbt.j(), paramzbt.y(), (int)d5, (int)d6, paramzbt.e().U());
          d10 = zbxz.a(d6, i2);
        }
        else if ((!paramzbfd.ay()) && ((paramzbt.g() == 0) || (paramzbt.g() == 2)))
        {
          d6 += d5 * paramzbt.Q();
          d10 = zbxz.a(d6, i2);
        }
        else
        {
          d6 = d4 + i3 * d5;
          d10 = zbxz.a(d6, i2);
        }
      }
    }
    double d9;
    if (!paramzbt.n())
    {
      d6 = paramzbt.B();
      if ((paramzbt.A().h()) && (d6 > 0.0D))
      {
        int n = 0;
        if (j != 0)
        {
          int i1 = a(paramzbt.j(), paramzbt.y(), (int)d5, (int)d4, paramzbt.e().U());
          n = a(paramzbt.j(), i1, (int)d4, paramzbt.e().U());
        }
        d9 = d4;
        while (d9 <= d2)
        {
          i3 = 0;
          if (j != 0)
          {
            i4 = a(paramzbt.j(), (int)d9, (int)d4, paramzbt.e().U());
            d10 = d1 * i4;
            if ((i4 % n == 0) && (paramzbt.w().h())) {
              i3 = 1;
            }
          }
          else
          {
            d10 = d1 * (d9 - d4);
            if ((zbxz.b(d9, d4) % d5 == 0.0D) && (paramzbt.w().h())) {
              i3 = 1;
            }
          }
          if (((!paramzbt.e().B().d().p()) || ((d9 != d4) && (d9 != d2))) && (i3 == 0)) {
            if (paramBoolean)
            {
              if ((paramzbt.g() == 0) || (paramzbt.g() == 2))
              {
                if (paramzbt.p()) {
                  paramzbt.A().a(paramzp.c(), (float)(paramzp.d() + d10), paramzp.i(), (float)(paramzp.d() + d10));
                } else {
                  paramzbt.A().a(paramzp.c(), (float)(paramzp.j() - d10), paramzp.i(), (float)(paramzp.j() - d10));
                }
              }
              else if (paramzbt.p()) {
                paramzbt.A().a((float)(paramzp.i() - d10), paramzp.d(), (float)(paramzp.i() - d10), paramzp.j());
              } else {
                paramzbt.A().a((float)(paramzp.c() + d10), paramzp.d(), (float)(paramzp.c() + d10), paramzp.j());
              }
            }
            else if ((paramzbt.g() == 0) || (paramzbt.g() == 2))
            {
              if (paramzbt.p()) {
                paramzbt.A().a((float)(paramzp.i() - d10), paramzp.d(), (float)(paramzp.i() - d10), paramzp.j());
              } else {
                paramzbt.A().a((float)(paramzp.c() + d10), paramzp.d(), (float)(paramzp.c() + d10), paramzp.j());
              }
            }
            else if (paramzbt.p()) {
              paramzbt.A().a(paramzp.c(), (float)(paramzp.d() + d10), paramzp.i(), (float)(paramzp.d() + d10));
            } else {
              paramzbt.A().a(paramzp.c(), (float)(paramzp.j() - d10), paramzp.i(), (float)(paramzp.j() - d10));
            }
          }
          if (j != 0) {
            d9 = a(paramzbt.j(), paramzbt.C(), (int)d6, (int)d9, paramzbt.e().U());
          } else if ((!paramzbfd.ay()) && ((paramzbt.g() == 0) || (paramzbt.g() == 2))) {
            d9 += d6 * paramzbt.Q();
          } else {
            d9 = zbxz.c(d9, d6);
          }
        }
      }
    }
    else if (paramzbt.A().h())
    {
      int m;
      double d7;
      double d11;
      double d12;
      double d13;
      double d14;
      float f;
      if (!paramzbt.p()) {
        for (m = paramzbt.l.size() - 2; m >= 0; m--)
        {
          d7 = com.aspose.cells.b.a.ze.g(paramzbt.l.get(m + 1));
          d9 = paramzbt.h(d7);
          d10 = com.aspose.cells.b.a.ze.g(paramzbt.l.get(m));
          d11 = paramzbt.h(d10);
          d12 = d11 / paramzbt.o();
          for (d13 = d12; d13 < d11 - d12 * 0.5D; d13 += d12) {
            if (d13 > d9 + d12 * 0.4D)
            {
              d14 = (paramzbt.g(d13) - paramzbt.W()) * i / (paramzbt.V() - paramzbt.W());
              if ((paramBoolean) || (paramzbt.c()))
              {
                f = (float)(paramzp.c() + d14);
                paramzbt.A().a(f, paramzp.d(), f, paramzp.j());
              }
              else
              {
                f = (float)(paramzp.j() - d14);
                paramzbt.A().a(paramzp.c(), f, paramzp.i(), f);
              }
            }
          }
        }
      } else {
        for (m = 0; m < paramzbt.l.size() - 1; m++)
        {
          d7 = com.aspose.cells.b.a.ze.g(paramzbt.l.get(m + 1));
          d9 = paramzbt.h(d7);
          d10 = com.aspose.cells.b.a.ze.g(paramzbt.l.get(m));
          d11 = paramzbt.h(d10);
          d12 = d11 / paramzbt.o();
          for (d13 = d12; d13 < d11 - d12 * 0.5D; d13 += d12) {
            if (d13 > d9 + d12 * 0.4D)
            {
              d14 = (paramzbt.g(d13) - paramzbt.W()) * i / (paramzbt.V() - paramzbt.W());
              if ((paramBoolean) || (paramzbt.c()))
              {
                f = (float)(paramzp.i() - d14);
                paramzbt.A().a(f, paramzp.d(), f, paramzp.j());
              }
              else
              {
                f = (float)(paramzp.d() + d14);
                paramzbt.A().a(paramzp.c(), f, paramzp.i(), f);
              }
            }
          }
        }
      }
    }
  }
  
  static void a(zr paramzr, zbt paramzbt, zp paramzp, int paramInt)
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
    if ((paramzbt.e().b) && (paramzbt == paramzbt.e().G()))
    {
      d6 = 0.0D;
      d7 = paramzbt.n() ? paramzbt.g(paramzbt.b) : paramzbt.b;
      d8 = paramzbt.n() ? paramzbt.g(paramzbt.c) : paramzbt.c;
      d9 = paramzbt.n() ? paramzbt.g(paramzbt.d) : paramzbt.d;
      d10 = paramzbt.n() ? paramzbt.g(paramzbt.e) : paramzbt.e;
      if (d9 > 0.0D) {
        for (d11 = d8 + d9; d11 <= d7; d11 = zbxz.c(d11, d9))
        {
          d6 = Math.abs(d11 - d8);
          d12 = d5 * d6 / (d7 - d8);
          d4 = 1.5707963267948966D;
          localObject = zo.a();
          for (i = 0; i < paramInt; i++)
          {
            if (paramzbt.w().h())
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
                paramzbt.w().a(localzo2, (zo)localObject);
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
            if (paramzbt.A().h())
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
                paramzbt.A().a(localzo2, (zo)localObject);
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
      d7 = paramzbt.V();
      d8 = paramzbt.W();
      d9 = paramzbt.Y();
      d10 = paramzbt.Z();
      if (d9 > 0.0D) {
        for (d11 = d8 + d9; d11 <= d7; d11 = zbxz.c(d11, d9))
        {
          d6 = Math.abs(d11 - d8);
          d12 = d5 * d6 / (d7 - d8);
          d4 = 1.5707963267948966D;
          localObject = zo.a();
          for (i = 0; i < paramInt; i++)
          {
            if (paramzbt.w().h())
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
                paramzbt.w().a(localzo2, (zo)localObject);
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
            if (paramzbt.A().h())
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
                paramzbt.A().a(localzo2, (zo)localObject);
                localObject = localzo2;
              }
            }
            d4 -= d1;
          }
        }
      }
    }
  }
  
  static void a(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp, int paramInt)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzbt.k() == 2)
    {
      a(paramzr, paramzbt, paramBoolean, paramFloat, paramzp);
      return;
    }
    paramzbt.m().a(paramzp.c(), paramFloat, paramzp.i(), paramFloat);
    zjf localzjf = paramzbt.e();
    float f1 = 0.0F;
    int i = paramInt;
    if (paramzbt.p) {
      i = (int)paramzbt.z();
    }
    if ((paramzbt.f()) || (localzjf.u()))
    {
      f1 = i;
    }
    else
    {
      f1 = i - 1;
      if (f1 == 0.0F) {
        f1 = 1.0F;
      }
      if (paramzbt.u) {
        f1 += 0.5F;
      }
    }
    double d = paramzp.e() / f1;
    float f2 = -1.0F;
    float f3 = -1.0F;
    for (int j = 0; j < i; j++)
    {
      float f4;
      if (!paramzbt.p()) {
        f4 = (float)(paramzp.c() + (j + 1) * d);
      } else {
        f4 = (float)(paramzp.c() + paramzp.e() - (j + 1) * d);
      }
      float f5;
      if (j == 0)
      {
        if (!paramzbt.p()) {
          f5 = paramzp.c();
        } else {
          f5 = paramzp.i();
        }
        a(paramzr, paramzbt, paramBoolean, f5, paramFloat, paramzp);
        float f6 = f5;
        if (!paramzbt.p()) {
          f6 -= (float)(d * paramzbt.Q() / 2.0D);
        } else {
          f6 += (float)(d * paramzbt.Q() / 2.0D);
        }
        if ((f6 > paramzp.c()) && (f6 < paramzp.c() + paramzp.e())) {
          b(paramzr, paramzbt, paramBoolean, f6, paramFloat, paramzp);
        }
      }
      if ((j + 1) % paramzbt.Q() == 0)
      {
        if ((f4 >= paramzp.c()) && (f4 <= paramzp.c() + paramzp.e()) && (Math.abs(f2 - f4) > (float)paramzbt.m().i() / 2.0F))
        {
          a(paramzr, paramzbt, paramBoolean, f4, paramFloat, paramzp);
          f2 = f4;
        }
        f5 = f4;
        if (!paramzbt.p()) {
          f5 -= (float)(d * paramzbt.Q() / 2.0D);
        } else {
          f5 += (float)(d * paramzbt.Q() / 2.0D);
        }
        if ((f5 > paramzp.c()) && (f5 < paramzp.c() + paramzp.e()) && (Math.abs(f3 - f5) > (float)paramzbt.m().i() / 2.0F))
        {
          b(paramzr, paramzbt, paramBoolean, f5, paramFloat, paramzp);
          f3 = f5;
        }
      }
    }
  }
  
  private static void a(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp)
  {
    ArrayList localArrayList = paramzbt.l;
    zjf localzjf = paramzbt.e();
    paramzbt.m().a(paramzp.c(), paramFloat, paramzp.i(), paramFloat);
    float f1 = 0.0F;
    int i = (int)paramzbt.z();
    float f2 = (int)paramzbt.D();
    int j = paramzbt.j();
    if ((localzjf.e().f()) || (localzjf.u()))
    {
      f1 = a(j, i, f2, paramzbt.e().U()) + 1;
    }
    else
    {
      f1 = a(j, i, f2, paramzbt.e().U());
      if (f1 == 0.0F) {
        f1 = 1.0F;
      }
      if (paramzbt.u) {
        f1 += 0.5F;
      }
    }
    double d = paramzp.e() / f1;
    float f3 = 0.0F;
    float f4 = 0.0F;
    if (paramzbt.p()) {
      f4 = paramzp.c() + paramzp.e();
    } else {
      f4 = paramzp.c();
    }
    zt localzt = new zt(paramzbt.f, paramzbt.h);
    int m;
    for (int k = 0; k < localArrayList.size(); k++)
    {
      m = com.aspose.cells.b.a.ze.f(paramzbt.l.get(k));
      f3 = (float)(d * a(j, a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), m, paramzbt.e().U()), m, paramzbt.e().U()));
      if (paramzbt.p()) {
        f4 -= f3;
      } else {
        f4 += f3;
      }
      if (k == 0)
      {
        if (!paramzbt.p()) {
          f6 = paramzp.c();
        } else {
          f6 = paramzp.i();
        }
        a(paramzr, paramzbt, paramBoolean, f6, paramFloat, paramzp);
      }
      if ((k % paramzbt.Q() == 0) && (f4 + c >= paramzp.c()) && (f4 - c <= paramzp.c() + paramzp.e())) {
        a(paramzr, paramzbt, paramBoolean, f4, paramFloat, paramzp);
      }
    }
    float f5;
    if (paramzbt.p()) {
      f5 = paramzp.c() + paramzp.e();
    } else {
      f5 = paramzp.c();
    }
    float f6 = f2;
    int n = a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), f2, paramzbt.e().U());
    do
    {
      m = 1;
      float f7 = a(paramzbt.j(), paramzbt.C(), (int)paramzbt.B(), f6, paramzbt.e().U());
      if (f7 == n)
      {
        m = 0;
        n = a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), n, paramzbt.e().U());
      }
      if (f7 >= n) {
        n = a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), n, paramzbt.e().U());
      }
      float f8 = (float)(d * a(j, f7, f6, paramzbt.e().U()));
      if (paramzbt.p()) {
        f5 -= f8;
      } else {
        f5 += f8;
      }
      if ((m != 0) && (f5 >= paramzp.c()) && (f5 <= paramzp.c() + paramzp.e())) {
        b(paramzr, paramzbt, paramBoolean, f5, paramFloat, paramzp);
      }
      f6 = f7;
    } while ((f5 >= paramzp.c()) && (f5 <= paramzp.c() + paramzp.e()));
  }
  
  static void a(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp, zbfd paramzbfd)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzbt.w != null) {
      if (paramzbt.m == 1) {
        paramFloat += paramzbt.w.v.c() + paramzbt.aa();
      } else if (paramzbt.m == 2) {
        paramFloat -= paramzbt.w.v.c() + paramzbt.aa();
      }
    }
    paramzbt.m().a(paramzp.c(), paramFloat, paramzp.i(), paramFloat);
    ArrayList localArrayList = paramzbt.l;
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    int i;
    double d4;
    double d5;
    float f;
    if (!paramzbt.p()) {
      for (i = 0; i < localArrayList.size(); i++)
      {
        d4 = com.aspose.cells.b.a.ze.g(localArrayList.get(i));
        d5 = paramzbt.n() ? paramzbt.h(d4) : d4;
        if (i - 1 > 0 ? Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(i - 1)))) < d3 * a : (i + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(i + 1)))) >= d3 * a))
        {
          f = (float)(paramzp.c() + (d4 - d2) / (d1 - d2) * paramzp.e());
          if ((paramzbt.n()) && (i > 0)) {
            b(paramzr, paramzbt, paramBoolean, paramFloat, paramzp.c(), paramzp.i(), com.aspose.cells.b.a.ze.g(localArrayList.get(i - 1)), com.aspose.cells.b.a.ze.g(localArrayList.get(i)));
          }
          a(paramzr, paramzbt, paramBoolean, f, paramFloat, paramzp);
        }
      }
    } else {
      for (i = localArrayList.size() - 1; i >= 0; i--)
      {
        d4 = com.aspose.cells.b.a.ze.g(localArrayList.get(i));
        d5 = paramzbt.n() ? paramzbt.h(d4) : d4;
        if (i - 1 > 0 ? Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(i - 1)))) != d3 : (i + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(i + 1)))) == d3))
        {
          f = (float)(paramzp.c() + (d1 - d4) / (d1 - d2) * paramzp.e());
          if ((paramzbt.n()) && (i < localArrayList.size() - 1)) {
            b(paramzr, paramzbt, paramBoolean, paramFloat, paramzp.c(), paramzp.i(), com.aspose.cells.b.a.ze.g(localArrayList.get(i)), com.aspose.cells.b.a.ze.g(localArrayList.get(i + 1)));
          }
          a(paramzr, paramzbt, paramBoolean, f, paramFloat, paramzp);
        }
      }
    }
    if (!paramzbt.n()) {
      a(paramzr, paramzbt, paramBoolean, paramFloat, paramzp.c(), paramzp.i(), paramzp);
    }
  }
  
  static void b(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp, int paramInt)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzbt.k() == 2)
    {
      b(paramzr, paramzbt, paramBoolean, paramFloat, paramzp);
      return;
    }
    paramzbt.m().a(paramFloat, paramzp.d(), paramFloat, paramzp.j());
    zjf localzjf = paramzbt.e();
    int i = 0;
    if ((paramzbt.f()) || (localzjf.u()))
    {
      i = paramInt;
    }
    else
    {
      i = paramInt - 1;
      if (i == 0) {
        i = 1;
      }
    }
    double d = paramzp.f() / i;
    for (int j = 0; j < paramInt; j++)
    {
      float f1;
      if (paramzbt.p()) {
        f1 = (float)(paramzp.d() + (j + 1) * d);
      } else {
        f1 = (float)(paramzp.d() + paramzp.f() - (j + 1) * d);
      }
      float f2;
      if (j == 0)
      {
        if (paramzbt.p()) {
          f2 = paramzp.d();
        } else {
          f2 = paramzp.j();
        }
        if ((f2 >= paramzp.d()) && (f2 <= paramzp.d() + paramzp.f())) {
          a(paramzr, paramzbt, paramBoolean, paramFloat, f2);
        }
        float f3 = f2;
        if (!paramzbt.p()) {
          f3 += (float)(d * paramzbt.Q() / 2.0D);
        } else {
          f3 -= (float)(d * paramzbt.Q() / 2.0D);
        }
        if ((f3 >= paramzp.d()) && (f3 <= paramzp.d() + paramzp.f())) {
          c(paramzr, paramzbt, paramBoolean, paramFloat, f3, paramzp);
        }
      }
      if ((j + 1) % paramzbt.Q() == 0)
      {
        if ((f1 >= paramzp.d()) && (f1 <= paramzp.d() + paramzp.f())) {
          a(paramzr, paramzbt, paramBoolean, paramFloat, f1);
        }
        f2 = f1;
        if (!paramzbt.p()) {
          f2 += (float)(d * paramzbt.Q() / 2.0D);
        } else {
          f2 -= (float)(d * paramzbt.Q() / 2.0D);
        }
        if ((f2 >= paramzp.d()) && (f2 <= paramzp.d() + paramzp.f())) {
          c(paramzr, paramzbt, paramBoolean, paramFloat, f2, paramzp);
        }
      }
    }
  }
  
  private static void b(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp)
  {
    ArrayList localArrayList = paramzbt.l;
    zjf localzjf = paramzbt.e();
    paramzbt.m().a(paramFloat, paramzp.d(), paramFloat, paramzp.j());
    int i = 0;
    int j = (int)paramzbt.z();
    float f1 = (int)paramzbt.D();
    int k = paramzbt.j();
    if ((localzjf.e().f()) || (localzjf.u()))
    {
      i = a(k, j, f1, paramzbt.e().U()) + 1;
    }
    else
    {
      i = a(k, j, f1, paramzbt.e().U());
      if (i == 0) {
        i = 1;
      }
    }
    double d = paramzp.f() / i;
    float f2 = 0.0F;
    float f3 = 0.0F;
    if (paramzbt.p()) {
      f3 = paramzp.d();
    } else {
      f3 = paramzp.d() + paramzp.f();
    }
    int n;
    for (int m = 0; m < localArrayList.size(); m++)
    {
      n = com.aspose.cells.b.a.ze.f(paramzbt.l.get(m));
      f2 = (float)(d * a(k, a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), n, paramzbt.e().U()), n, paramzbt.e().U()));
      if (paramzbt.p()) {
        f3 += f2;
      } else {
        f3 -= f2;
      }
      if (m == 0)
      {
        if (paramzbt.p()) {
          f5 = paramzp.d();
        } else {
          f5 = paramzp.j();
        }
        a(paramzr, paramzbt, paramBoolean, paramFloat, f5);
      }
      if ((m % paramzbt.Q() == 0) && (f3 + c >= paramzp.d()) && (f3 - c <= paramzp.d() + paramzp.f())) {
        a(paramzr, paramzbt, paramBoolean, paramFloat, f3);
      }
    }
    float f4;
    if (paramzbt.p()) {
      f4 = paramzp.d();
    } else {
      f4 = paramzp.d() + paramzp.f();
    }
    float f5 = f1;
    int i1 = a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), f1, paramzbt.e().U());
    do
    {
      n = 1;
      float f6 = a(paramzbt.j(), paramzbt.C(), (int)paramzbt.B(), f5, paramzbt.e().U());
      if (f6 == i1)
      {
        n = 0;
        i1 = a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), i1, paramzbt.e().U());
      }
      if (f6 >= i1) {
        i1 = a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), i1, paramzbt.e().U());
      }
      float f7 = (float)(d * a(k, f6, f5, paramzbt.e().U()));
      if (paramzbt.p()) {
        f4 += f7;
      } else {
        f4 -= f7;
      }
      if ((n != 0) && (f4 >= paramzp.d()) && (f4 <= paramzp.d() + paramzp.f())) {
        c(paramzr, paramzbt, paramBoolean, paramFloat, f4, paramzp);
      }
      f5 = f6;
    } while ((f4 >= paramzp.d()) && (f4 <= paramzp.d() + paramzp.f()));
  }
  
  static void b(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp, zbfd paramzbfd)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    paramzbt.m().a(paramzp.c(), paramFloat, paramzp.i(), paramFloat);
    int i;
    double d;
    if (!paramzbt.p()) {
      for (i = 0; i < paramzbt.l.size(); i++)
      {
        d = ((Double)paramzbt.l.get(i)).doubleValue();
        int j;
        if (i - 1 > 0)
        {
          j = zbxz.a(d, ((Double)paramzbt.l.get(i - 1)).doubleValue());
          if (Math.abs(zbxz.b(d, ((Double)paramzbt.l.get(i - 1)).doubleValue())) != zbxz.a(paramzbt.x(), j)) {
            continue;
          }
        }
        else if (i + 1 < paramzbt.l.size())
        {
          j = zbxz.a(d, ((Double)paramzbt.l.get(i + 1)).doubleValue());
          if (Math.abs(zbxz.b(d, ((Double)paramzbt.l.get(i + 1)).doubleValue())) != zbxz.a(paramzbt.x(), j)) {
            continue;
          }
        }
        float f1 = (float)(paramzp.c() + (d - paramzbt.D()) / (paramzbt.z() - paramzbt.D()) * paramzp.e());
        a(paramzr, paramzbt, paramBoolean, f1, paramFloat, paramzp);
      }
    } else {
      for (i = paramzbt.l.size() - 1; i >= 0; i--)
      {
        d = ((Double)paramzbt.l.get(i)).doubleValue();
        int k;
        if (i - 1 > 0)
        {
          k = zbxz.a(d, ((Double)paramzbt.l.get(i - 1)).doubleValue());
          if (Math.abs(zbxz.b(d, ((Double)paramzbt.l.get(i - 1)).doubleValue())) != zbxz.a(paramzbt.x(), k)) {
            continue;
          }
        }
        else if (i + 1 < paramzbt.l.size())
        {
          k = zbxz.a(d, ((Double)paramzbt.l.get(i + 1)).doubleValue());
          if (Math.abs(zbxz.b(d, ((Double)paramzbt.l.get(i + 1)).doubleValue())) != zbxz.a(paramzbt.x(), k)) {
            continue;
          }
        }
        float f2 = (float)(paramzp.c() + (paramzbt.z() - d) / (paramzbt.z() - paramzbt.D()) * paramzp.e());
        a(paramzr, paramzbt, paramBoolean, f2, paramFloat, paramzp);
      }
    }
    a(paramzr, paramzbt, paramBoolean, paramFloat, paramzp.c(), paramzp.i(), paramzp);
  }
  
  static void c(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp, zbfd paramzbfd)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    paramzbt.m().a(paramFloat, paramzp.d(), paramFloat, paramzp.j());
    ArrayList localArrayList = paramzbt.l;
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    int i = zbxz.g(d3);
    int j;
    double d4;
    if (!paramzbt.p()) {
      for (j = localArrayList.size() - 1; j >= 0; j--)
      {
        d4 = d2 + d3 * (localArrayList.size() - 1 - j);
        if ((i >= 15) || (j - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(com.aspose.cells.b.a.ze.g(localArrayList.get(j)), com.aspose.cells.b.a.ze.g(localArrayList.get(j - 1)))))) / d3 > b : (j + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(com.aspose.cells.b.a.ze.g(localArrayList.get(j)), com.aspose.cells.b.a.ze.g(localArrayList.get(j + 1)))))) / d3 <= b)))
        {
          float f1 = (float)(paramzp.d() + (d1 - d4) / (d1 - d2) * paramzp.f());
          if ((paramzbt.n()) && (j > 0)) {
            a(paramzr, paramzbt, paramBoolean, paramFloat, paramzp.d(), paramzp.j(), com.aspose.cells.b.a.ze.g(localArrayList.get(j - 1)), com.aspose.cells.b.a.ze.g(localArrayList.get(j)));
          }
          a(paramzr, paramzbt, paramBoolean, paramFloat, f1);
        }
      }
    } else {
      for (j = 0; j < localArrayList.size(); j++)
      {
        d4 = com.aspose.cells.b.a.ze.g(localArrayList.get(j));
        double d5 = paramzbt.n() ? paramzbt.h(d4) : d4;
        if (j - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(j - 1)))))) / d3 > b : (j + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(j + 1)))))) / d3 <= b))
        {
          float f2 = (float)(paramzp.d() + (d4 - d2) / (d1 - d2) * paramzp.f());
          if ((paramzbt.n()) && (j < localArrayList.size() - 1)) {
            a(paramzr, paramzbt, paramBoolean, paramFloat, paramzp.d(), paramzp.j(), com.aspose.cells.b.a.ze.g(localArrayList.get(j)), com.aspose.cells.b.a.ze.g(localArrayList.get(j + 1)));
          }
          a(paramzr, paramzbt, paramBoolean, paramFloat, f2);
        }
      }
    }
    if (!paramzbt.n()) {
      a(paramzr, paramzbt, paramBoolean, paramFloat, paramzp.d(), paramzp.j());
    }
  }
  
  static void d(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp, zbfd paramzbfd)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    zjf localzjf = paramzbt.e();
    int i = paramzbfd.ai();
    zbwv localzbwv = paramzbt.J();
    zkf localzkf = paramzbfd.F().b(0);
    String str1 = localzkf != null ? localzkf.A() : "";
    boolean bool = localzkf != null ? localzkf.B() : true;
    int j = 0;
    if ((localzbwv.c()) && (localzkf != null)) {
      j = 1;
    }
    zsq localzsq = paramzbt.T();
    int k = 8;
    float f1 = 0.0F;
    float f2 = 2 * paramzbt.aa() + paramzbt.ac();
    float f3 = paramzbt.g / 2.0F;
    if (paramzbt.m == 1)
    {
      f1 = paramzp.c() - paramzbt.f;
      localzsq.b().b.a((int)f1 - localzsq.b().b.e());
    }
    else if (paramzbt.m == 2)
    {
      k = 7;
      f1 = paramzp.i();
      f1 += f2;
      localzsq.b().b.a((int)(f1 + paramzbt.f));
    }
    else if (paramzbt.m == 3)
    {
      if (paramBoolean)
      {
        k = 7;
        f1 = paramFloat;
        f1 += f2;
        localzsq.b().b.a((int)(f1 + paramzbt.f));
      }
      else
      {
        f1 = paramFloat - paramzbt.f;
        localzsq.b().b.a((int)f1 - localzsq.b().b.e());
      }
    }
    localzsq.b().b.b(paramzp.d());
    ArrayList localArrayList = paramzbt.l;
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    int m = zbxz.g(d3);
    int n;
    double d4;
    float f4;
    double d5;
    String str2;
    Color localColor;
    zq localzq;
    if (!paramzbt.p()) {
      for (n = localArrayList.size() - 1; n >= 0; n--)
      {
        d4 = d2 + d3 * (localArrayList.size() - 1 - n);
        if ((m >= 15) || (n - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(com.aspose.cells.b.a.ze.g(localArrayList.get(n)), com.aspose.cells.b.a.ze.g(localArrayList.get(n - 1)))))) / d3 > b : (n + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(com.aspose.cells.b.a.ze.g(localArrayList.get(n)), com.aspose.cells.b.a.ze.g(localArrayList.get(n + 1)))))) / d3 <= b)))
        {
          f4 = (float)(paramzp.d() + (d1 - d4) / (d1 - d2) * paramzp.f());
          if (paramzbt.m != 0)
          {
            if (m < 15) {
              d4 = zbxz.a(d4, m);
            }
            d5 = paramzbt.n() ? paramzbt.h(d4) : d4;
            if (paramzbt.af()) {
              str1 = "0%";
            }
            str2 = "";
            d5 = paramzbt.n() ? d5 : d5 * Math.pow(10.0D, paramzbt.T().f());
            localColor = localzbwv.i();
            if (j != 0)
            {
              str2 = zra.a(localzjf.an(), Double.valueOf(d5), str1, bool, localzjf.U());
              localColor = zra.a(Double.valueOf(d5), str1, localColor);
            }
            else
            {
              str2 = a(paramzbt, Double.valueOf(d5));
              localColor = zra.a(Double.valueOf(d5), localzbwv.b(), localColor);
            }
            localzq = new zq(f1, f4 - f3, paramzbt.f - f2, paramzbt.g);
            a(paramzbt, str2, localzq);
            if (paramzbt.m != 3)
            {
              if (k == 8)
              {
                localzq.a(localzq.f() - 1.0F);
                localzq.c(localzq.h() + 1.0F);
              }
              if (k == 7) {
                localzq.c(localzq.h() + 1.0F);
              }
            }
            a(paramzr, zp.a(localzq), str2, localzbwv.e(), localzbwv.a(), localColor, k, 1, zv.c());
          }
        }
      }
    } else {
      for (n = 0; n < localArrayList.size(); n++)
      {
        d4 = com.aspose.cells.b.a.ze.g(localArrayList.get(n));
        if (n - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(n - 1)))))) / d3 > b : (n + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(n + 1)))))) / d3 <= b))
        {
          f4 = (float)(paramzp.d() + (d4 - d2) / (d1 - d2) * paramzp.f());
          if (paramzbt.m != 0)
          {
            if (m < 15) {
              d4 = zbxz.a(d4, m);
            }
            d5 = paramzbt.n() ? paramzbt.h(d4) : d4;
            if (paramzbt.af()) {
              str1 = "0%";
            }
            str2 = "";
            d5 = paramzbt.n() ? d5 : d5 * Math.pow(10.0D, paramzbt.T().f());
            localColor = localzbwv.i();
            if (j != 0)
            {
              str2 = zra.a(localzjf.an(), Double.valueOf(d5), str1, bool, localzjf.U());
              localColor = zra.a(Double.valueOf(d5), str1, localColor);
            }
            else
            {
              str2 = a(paramzbt, Double.valueOf(d5));
              localColor = zra.a(Double.valueOf(d5), localzbwv.b(), localColor);
            }
            localzq = new zq(f1, f4 - f3, paramzbt.f - f2, paramzbt.g);
            a(paramzbt, str2, localzq);
            if (paramzbt.m != 3)
            {
              if (k == 8)
              {
                localzq.a(localzq.f() - 1.0F);
                localzq.c(localzq.h() + 1.0F);
              }
              if (k == 7) {
                localzq.c(localzq.h() + 1.0F);
              }
            }
            a(paramzr, zp.a(localzq), str2, localzbwv.e(), localzbwv.a(), localColor, k, 1, zv.c());
          }
        }
      }
    }
    localzsq.p();
  }
  
  private static void a(zbt paramzbt, String paramString, zq paramzq)
    throws Exception
  {
    if (paramzbt.s().h() != 0)
    {
      zr localzr = paramzbt.e().ap();
      zbwv localzbwv = paramzbt.J();
      com.aspose.cells.b.a.b.zs localzs = zbvy.a(localzr, paramString, localzbwv.e(), localzbwv.a(), paramzbt.e().B().b.b(), 1, 1, localzbwv.n());
      zq localzq = zq.c();
      zt localzt;
      float f;
      if (localzbwv.e() == 0)
      {
        localzt = zbxz.a(localzr, paramString, localzbwv.a(), paramzq.e());
        f = (localzs.b() - localzt.b()) / 2.0F;
        localzq = new zq(paramzq.f() + (paramzq.h() - localzt.b()) - f, paramzq.g() + (paramzq.i() - localzt.c()), localzt.b(), localzt.c());
      }
      else if (Math.abs(localzbwv.e()) % 90 == 0)
      {
        localzt = zbxz.a(localzr, paramString, localzbwv.a(), new zt(paramzq.i(), paramzq.h()));
        f = (localzs.c() - localzt.b()) / 2.0F;
        localzq = new zq(paramzq.f(), paramzq.g(), localzt.c(), localzt.b());
      }
      else
      {
        localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
      }
      paramzbt.s().a(localzq);
    }
  }
  
  private static void a(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    zbt localzbt = a(paramzbt);
    int i = 0;
    int j = 0;
    switch (paramzbt.E())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbt.o) {
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
      if (localzbt.o) {
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
      paramzbt.m().a(paramFloat1, paramFloat2, paramFloat1 + paramzbt.aa(), paramFloat2);
    }
    if (j != 0) {
      paramzbt.m().a(paramFloat1 - paramzbt.aa(), paramFloat2, paramFloat1, paramFloat2);
    }
  }
  
  private static void a(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramzbt.F() == 2) {
      return;
    }
    zbt localzbt = a(paramzbt);
    int i = 0;
    int j = 0;
    switch (paramzbt.F())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbt.o) {
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
      if (localzbt.o) {
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
    float f2 = (float)(paramzbt.B() / (paramzbt.z() - paramzbt.D()) * (paramFloat3 - paramFloat2));
    float f1;
    if (!paramzbt.p())
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
        paramzbt.m().a(paramFloat1, f3, paramFloat1 + paramzbt.ab(), f3);
      }
      if (j != 0) {
        paramzbt.m().a(paramFloat1 - paramzbt.ab(), f3, paramFloat1, f3);
      }
      f3 += f2;
    } while ((paramFloat2 <= f3) && (f3 <= paramFloat3));
  }
  
  private static void a(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, double paramDouble1, double paramDouble2)
  {
    if (paramzbt.F() == 2) {
      return;
    }
    zbt localzbt = a(paramzbt);
    int i = 0;
    int j = 0;
    switch (paramzbt.F())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbt.o) {
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
      if (localzbt.o) {
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
    double d1 = paramzbt.h(paramDouble2);
    double d2 = paramzbt.h(paramDouble1);
    double d3 = d2 / paramzbt.o();
    double d4 = d3;
    double d5;
    float f;
    if (!paramzbt.p()) {
      while (d4 < d2 - d3 * 0.5D)
      {
        if (d4 > d1 + d3 * 0.4D)
        {
          d5 = (paramzbt.g(d4) - paramzbt.W()) * (paramFloat3 - paramFloat2) / (paramzbt.V() - paramzbt.W());
          f = (float)(paramFloat3 - d5);
          if (i != 0) {
            paramzbt.m().a(paramFloat1, f, paramFloat1 + paramzbt.ab(), f);
          }
          if (j != 0) {
            paramzbt.m().a(paramFloat1 - paramzbt.ab(), f, paramFloat1, f);
          }
        }
        d4 += d3;
      }
    }
    while (d4 < d2 - d3 * 0.5D)
    {
      if (d4 > d1 + d3 * 0.4D)
      {
        d5 = (paramzbt.g(d4) - paramzbt.W()) * (paramFloat3 - paramFloat2) / (paramzbt.V() - paramzbt.W());
        f = (float)(paramFloat2 + d5);
        if (i != 0) {
          paramzbt.m().a(paramFloat1, f, paramFloat1 + paramzbt.ab(), f);
        }
        if (j != 0) {
          paramzbt.m().a(paramFloat1 - paramzbt.ab(), f, paramFloat1, f);
        }
      }
      d4 += d3;
    }
  }
  
  static void a(zr paramzr, zbt paramzbt, boolean paramBoolean1, float paramFloat, zp paramzp, int paramInt, boolean paramBoolean2)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzbt.k() == 2)
    {
      c(paramzr, paramzbt, paramBoolean1, paramFloat, paramzp);
      return;
    }
    float f1 = 0.0F;
    int i = 9;
    float f2 = 0.0F;
    if (paramzbt.m != 0) {
      f2 += paramzbt.J().o();
    }
    float f3 = 0.0F;
    if (paramzbt.m == 1)
    {
      f1 = paramzp.j() + f2;
      f3 = paramzp.j() + f2;
    }
    else if (paramzbt.m == 2)
    {
      i = 0;
      f1 = paramzp.d() - f2 - paramzbt.h;
      f3 = paramzp.d() - f2;
    }
    else if (paramzbt.m == 3)
    {
      if (paramBoolean1)
      {
        f1 = paramFloat - f2 - paramzbt.h;
        f3 = paramFloat - f2;
        i = 0;
      }
      else
      {
        f1 = paramFloat + f2;
        f3 = paramFloat + f2;
      }
    }
    zjf localzjf = paramzbt.e();
    zbff localzbff = localzjf.z();
    zbwv localzbwv = paramzbt.J();
    ArrayList localArrayList1;
    ArrayList[] arrayOfArrayList;
    if (paramzbt.g() == 0)
    {
      localArrayList1 = localzjf.z().c();
      arrayOfArrayList = localzjf.z().e();
    }
    else
    {
      localArrayList1 = localzjf.z().d();
      arrayOfArrayList = localzjf.z().g();
    }
    int j = 0;
    if ((localzbwv.c()) && (localArrayList1.size() > 0)) {
      j = 1;
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList1.size() > 0)) {
      j = 1;
    }
    float f4 = 0.0F;
    int k = paramInt;
    if (paramzbt.p) {
      k = (int)paramzbt.z();
    }
    if ((paramzbt.f()) || (localzjf.u()))
    {
      f4 = k;
    }
    else
    {
      f4 = k - 1;
      if (f4 == 0.0F) {
        f4 = 1.0F;
      }
      if (paramzbt.u) {
        f4 += 0.5F;
      }
    }
    double d1 = paramzp.e() / f4;
    zt localzt = new zt(paramzbt.i, paramzbt.h);
    for (int m = 0; m < k; m++)
    {
      double d2 = (m + 1) * d1;
      if ((!paramzbt.f()) && (!paramzbt.e().u())) {
        d2 -= d1 / 2.0D;
      }
      float f6;
      float f7;
      float f8;
      if (!paramzbt.p())
      {
        f6 = (float)(paramzp.c() + (m + 1) * d1);
        f7 = (float)(paramzp.c() + d2 - d1);
        f8 = (float)(paramzp.c() + d2 - d1 / 2.0D);
      }
      else
      {
        f6 = (float)(paramzp.c() + paramzp.e() - (m + 1) * d1);
        f7 = (float)(paramzp.c() + paramzp.e() - d2);
        f8 = (float)(paramzp.c() + paramzp.e() - d2 + d1 / 2.0D);
      }
      if ((paramzbt.m != 0) && (m % paramzbt.H() == 0) && (m < paramzbt.l.size()))
      {
        String str2 = "";
        Color localColor = localzbwv.i();
        if (j == 0)
        {
          str2 = a(paramzbt, paramzbt.l.get(m));
          localColor = zra.a(paramzbt.l.get(m), localzbwv.b(), localColor);
        }
        else
        {
          String str3 = "";
          boolean bool2 = false;
          str3 = m < localArrayList1.size() ? ((zgn)localArrayList1.get(m)).c() : "";
          bool2 = m < localArrayList1.size() ? ((zgn)localArrayList1.get(m)).b() : false;
          str2 = zra.a(localzjf.an(), paramzbt.l.get(m), str3, bool2, localzjf.U());
          localColor = zra.a(paramzbt.l.get(m), str3, localColor);
        }
        float f11 = paramzbt.h;
        com.aspose.cells.b.a.b.zs localzs2 = zbvy.a(paramzr, str2, localzbwv.e(), localzbwv.a(), localzt, 1, 1, localzbwv.n());
        if (localzs2.c() < paramzbt.h) {
          f11 = localzs2.c();
        }
        zq localzq1 = new zq((float)(f7 + d1 / 2.0D - paramzbt.i / 2.0F), f1, paramzbt.i, f11);
        boolean bool3 = zbxz.b(str2);
        ArrayList localArrayList3 = zbxz.a(str2, localzbwv.f(), localzbwv.h(), false);
        Object localObject3;
        if ((localArrayList3.size() > 0) && ((Math.abs(localzbwv.e()) == 90) || (localzbwv.e() == 0)))
        {
          zf localzf = paramzr.d();
          zq localzq2 = localzq1;
          if (localzbwv.e() != 0)
          {
            float f12 = localzq2.f() + localzq2.h() / 2.0F;
            float f13 = localzq2.g() + localzq2.i() / 2.0F;
            localzq2 = new zq(-localzq2.i() / 2.0F, -localzq2.h() / 2.0F, localzq2.i(), localzq2.h());
            paramzr.b(f12, f13);
            paramzr.a(-localzbwv.e());
          }
          int i2 = 1;
          int i3 = 1;
          localObject3 = new zbda();
          zbxz.a(localArrayList3, (zaiz)localObject3, localzbwv.a(), localzbwv.i(), new zzo());
          zbcw localzbcw = new zbcw();
          localzbcw.a(zbvy.a(i2));
          localzbcw.b(zbvy.a(i3));
          zbde localzbde = new zbde(localzq2, localzbcw, (zaiz)localObject3, localzbwv.a(), bool3);
          localzbde.b(paramzr, localzjf.at());
          paramzr.a(localzf);
        }
        else
        {
          int n;
          int i1;
          Object localObject1;
          if (localzbwv.n() != 0)
          {
            n = 1;
            i1 = 1;
            localObject1 = zbvy.a(paramzr, str2, localzbwv.e(), localzbwv.a(), localzq1.e(), n, i1, localzbwv.n());
            zbvy.a(paramzr, str2, localzbwv.a(), localColor, f8 - ((com.aspose.cells.b.a.b.zs)localObject1).b() / 2.0F, f1, ((com.aspose.cells.b.a.b.zs)localObject1).b(), ((com.aspose.cells.b.a.b.zs)localObject1).c(), localzbwv.n(), paramzbt.G().f());
          }
          else if ((localzbwv.e() == 0) || (localzbwv.e() == 90) || (localzbwv.e() == -90))
          {
            n = 1;
            i1 = 1;
            Object localObject2;
            if ((localzbwv.e() == 90) || (localzbwv.e() == -90))
            {
              localObject1 = zbvy.a(paramzr, str2, localzbwv.e(), localzbwv.a(), localzq1.e(), n, i1, localzbwv.n());
              localObject2 = zbxz.a(paramzr, str2, localzbwv.a(), new zt(localzq1.i(), localzq1.h()));
              localObject3 = new zq((float)(f7 + d1 / 2.0D - ((com.aspose.cells.b.a.b.zs)localObject1).b() / 2.0F), f1, ((com.aspose.cells.b.a.b.zs)localObject1).b(), ((com.aspose.cells.b.a.b.zs)localObject1).c());
              if (paramzbt.m == 2)
              {
                ((zq)localObject3).b(f3 - ((com.aspose.cells.b.a.b.zs)localObject1).c());
                ((zq)localObject3).b(((zq)localObject3).g() + (((com.aspose.cells.b.a.b.zs)localObject1).c() - ((zt)localObject2).b()) / 2.0F);
              }
              else
              {
                ((zq)localObject3).b(((zq)localObject3).g() - (((com.aspose.cells.b.a.b.zs)localObject1).c() - ((zt)localObject2).b()) / 2.0F);
              }
              if (((zq)localObject3).h() < ((com.aspose.cells.b.a.b.zs)localObject1).c()) {
                ((zq)localObject3).c(((zt)localObject2).c() + 1.0F);
              }
              a(paramzbt, str2, localzq1);
              a(paramzr, (zq)localObject3, str2, localzbwv.e(), localzbwv.a(), localColor, n, i1);
            }
            else
            {
              i1 = i;
              localObject1 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
              if (((zq)localObject1).i() < localzbwv.a().d())
              {
                localObject2 = new zv(zv.c());
                ((zv)localObject2).b(((zv)localObject2).d() | 0x800);
                localObject3 = paramzr.a(str2, localzbwv.a(), 10000, (zv)localObject2);
                if (((zq)localObject1).h() < ((zt)localObject3).b())
                {
                  ((zq)localObject1).c(zbxz.a(((zt)localObject3).b()));
                  ((zq)localObject1).d(zbxz.a(((zt)localObject3).c()));
                }
              }
              a(paramzbt, str2, (zq)localObject1);
              a(paramzr, (zq)localObject1, str2, localzbwv.e(), localzbwv.a(), localColor, n, i1);
            }
          }
          else if (localArrayList3.size() == 0)
          {
            a(localzjf.ap(), str2, new zo(f8, f3), new zt(paramzbt.i, f11), localzbwv.e(), localzbwv.a(), localColor, paramzbt.a());
          }
          else
          {
            a(localzjf.ap(), str2, new zo(f8, f3), new zt(paramzbt.i, f11), localzbwv.e(), localzbwv.a(), localColor, paramzbt.a(), localzbwv);
          }
        }
      }
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList1.size() > 0) && (paramzbt.m != 0))
    {
      float f5 = (arrayOfArrayList.length + 1) * f2;
      ArrayList localArrayList2 = arrayOfArrayList[0];
      zgn localzgn = (zgn)localArrayList2.get(0);
      String str1 = zra.a(localzjf.an(), localzgn.a(), localzgn.c(), localzgn.b(), localzjf.U());
      com.aspose.cells.b.a.b.zs localzs1 = zbvy.a(paramzbt.e().ap(), str1, 0, localzbwv.a(), paramzp.b(), 1, 1, localzbwv.n());
      float f9 = 0.0F;
      boolean bool1 = true;
      if (paramzbt.m == 1)
      {
        f1 = paramzp.j() + f5 + paramzbt.g;
        f9 = paramzp.j();
        bool1 = false;
      }
      else if (paramzbt.m == 2)
      {
        f1 = paramzp.d() - f5 - paramzbt.g;
        f9 = paramzp.d();
        bool1 = true;
      }
      else if (paramzbt.m == 3)
      {
        if (paramBoolean1)
        {
          f1 = paramFloat - f5 - paramzbt.g + localzs1.c();
          bool1 = true;
        }
        else
        {
          f1 = paramFloat + f5 + paramzbt.g - localzs1.c();
          bool1 = false;
        }
        f9 = paramFloat;
      }
      float f10;
      if (!paramzbt.p()) {
        f10 = paramzp.c();
      } else {
        f10 = paramzp.i();
      }
      a(paramzr, arrayOfArrayList, f10, f1, f2, bool1, paramzbt, d1, localzbwv, i, f9, paramzp, paramBoolean2);
    }
  }
  
  private static void a(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat1, float paramFloat2, zp paramzp)
  {
    zbt localzbt = a(paramzbt);
    int i = 0;
    int j = 0;
    switch (paramzbt.E())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbt.o) {
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
      if (localzbt.o) {
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
      paramzbt.m().a(paramFloat1, paramFloat2 - paramzbt.aa(), paramFloat1, paramFloat2);
    }
    if (j != 0) {
      paramzbt.m().a(paramFloat1, paramFloat2, paramFloat1, paramFloat2 + paramzbt.aa());
    }
  }
  
  private static void b(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat1, float paramFloat2, zp paramzp)
  {
    zbt localzbt = a(paramzbt);
    int i = 0;
    int j = 0;
    switch (paramzbt.F())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbt.o) {
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
      if (localzbt.o) {
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
      paramzbt.m().a(paramFloat1, paramFloat2 - paramzbt.ab(), paramFloat1, paramFloat2);
    }
    if (j != 0) {
      paramzbt.m().a(paramFloat1, paramFloat2, paramFloat1, paramFloat2 + paramzbt.ab());
    }
  }
  
  private static void c(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp)
    throws Exception
  {
    ArrayList localArrayList1 = paramzbt.l;
    zjf localzjf = paramzbt.e();
    float f1 = 0.0F;
    float f2 = paramzbt.J().q();
    if (paramzbt.m != 0) {
      f2 += paramzbt.ab();
    }
    float f3 = 0.0F;
    if (paramzbt.m == 1)
    {
      f1 = paramzp.j() + f2;
      f3 = paramzp.j() + f2;
    }
    else if (paramzbt.m == 2)
    {
      f1 = paramzp.d() - f2 - paramzbt.h;
      f3 = paramzp.d() - f2;
    }
    else if (paramzbt.m == 3)
    {
      if (paramBoolean)
      {
        f1 = paramFloat - f2 - paramzbt.h;
        f3 = paramFloat - f2;
      }
      else
      {
        f1 = paramFloat + f2;
        f3 = paramFloat + f2;
      }
    }
    zbwv localzbwv = paramzbt.J();
    ArrayList localArrayList2;
    ArrayList[] arrayOfArrayList;
    if (paramzbt.g() == 0)
    {
      localArrayList2 = localzjf.z().c();
      arrayOfArrayList = localzjf.z().e();
    }
    else
    {
      localArrayList2 = localzjf.z().d();
      arrayOfArrayList = localzjf.z().g();
    }
    int i = 0;
    if ((localzbwv.c()) && (localArrayList2.size() > 0)) {
      i = 1;
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0)) {
      i = 1;
    }
    float f4 = 0.0F;
    int j = (int)paramzbt.z();
    int k = (int)paramzbt.D();
    int m = paramzbt.j();
    if ((localzjf.e().f()) || (localzjf.u()))
    {
      f4 = a(m, j, k, paramzbt.e().U()) + 1;
    }
    else
    {
      f4 = a(m, j, k, paramzbt.e().U());
      if (f4 == 0.0F) {
        f4 = 1.0F;
      }
      if (paramzbt.u) {
        f4 += 0.5F;
      }
    }
    double d = paramzp.e() / f4;
    float f5 = 0.0F;
    float f6 = 0.0F;
    zt localzt = new zt(paramzbt.f, paramzbt.h);
    for (int n = 0; n < localArrayList1.size(); n++)
    {
      int i1 = com.aspose.cells.b.a.ze.f(paramzbt.l.get(n));
      int i2 = a(m, i1, k, paramzbt.e().U());
      float f7 = (float)(d * i2);
      if ((paramzbt.f()) || (localzjf.u())) {
        f7 += (float)(d / 2.0D);
      }
      if (paramzbt.p())
      {
        f5 = paramzp.c() + paramzp.e() - f7;
        f6 = f5;
      }
      else
      {
        f5 = paramzp.c() + f7;
        f6 = f5;
      }
      if ((paramzbt.m != 0) && (n % paramzbt.H() == 0))
      {
        String str1 = "";
        Color localColor = localzbwv.i();
        if (i == 0)
        {
          str1 = a(paramzbt, paramzbt.l.get(n));
          localColor = zra.a(paramzbt.l.get(n), localzbwv.b(), localColor);
        }
        else
        {
          String str2 = "";
          boolean bool = false;
          str2 = ((zgn)localArrayList2.get(0)).c();
          bool = ((zgn)localArrayList2.get(0)).b();
          str1 = zra.a(localzjf.an(), paramzbt.l.get(n), str2, bool, localzjf.U());
          localColor = zra.a(paramzbt.l.get(n), str2, localColor);
        }
        float f8 = paramzbt.h;
        com.aspose.cells.b.a.b.zs localzs = zbvy.a(paramzr, str1, localzbwv.e(), localzbwv.a(), localzt, 1, 1, localzbwv.n());
        if (localzs.c() < paramzbt.h) {
          f8 = localzs.c();
        }
        zq localzq = new zq(f5 - paramzbt.f / 2.0F, f1, paramzbt.f, f8);
        if ((localzbwv.e() == 0) || (localzbwv.e() == 90) || (localzbwv.e() == -90))
        {
          a(paramzbt, str1, localzq);
          b(paramzr, zp.a(localzq), str1, localzbwv.e(), localzbwv.a(), localColor, 1, 1);
        }
        else
        {
          a(paramzr, str1, new zo(f6, f3), new zt(paramzbt.f, f8), localzbwv.e(), localzbwv.a(), localColor, paramzbt.a());
        }
      }
    }
  }
  
  static void e(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp, zbfd paramzbfd)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    int i = paramzbfd.ai();
    zjf localzjf = paramzbt.e();
    zbwv localzbwv = paramzbt.J();
    zkf localzkf = paramzbfd.F().b(0);
    String str1 = localzkf != null ? localzkf.A() : "";
    boolean bool = localzkf != null ? localzkf.B() : true;
    int j = 0;
    if ((localzbwv.c()) && (localzkf != null)) {
      j = 1;
    }
    zsq localzsq = paramzbt.T();
    float f1 = 0.0F;
    float f2 = 2 * paramzbt.aa();
    float f3 = paramzbt.f / 2.0F;
    if (paramzbt.m == 1)
    {
      f1 = paramzp.j();
      f1 += f2;
      localzsq.b().b.b((int)(f1 + paramzbt.g));
    }
    else if (paramzbt.m == 2)
    {
      f1 = paramzp.d() - paramzbt.g;
      localzsq.b().b.b((int)f1 - localzsq.b().m());
    }
    else if (paramzbt.m == 3)
    {
      if (paramBoolean)
      {
        f1 = paramFloat - paramzbt.g;
        localzsq.b().b.b((int)f1 - localzsq.b().m());
      }
      else
      {
        f1 = paramFloat;
        f1 += f2;
        localzsq.b().b.b((int)(f1 + paramzbt.g));
      }
    }
    localzsq.b().b.a(paramzp.i() - localzsq.b().b.e());
    ArrayList localArrayList = paramzbt.l;
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    int k = zbxz.g(d3);
    int m;
    double d4;
    Object localObject;
    if (!paramzbt.p()) {
      for (m = 0; m < localArrayList.size(); m++)
      {
        d4 = d2 + d3 * (localArrayList.size() - 1 - m);
        double d5 = com.aspose.cells.b.a.ze.g(localArrayList.get(m));
        int i1;
        if (m - 1 > 0)
        {
          i1 = zbxz.a(d5, ((Double)localArrayList.get(m - 1)).doubleValue());
          if (Math.abs(zbxz.b(d5, ((Double)localArrayList.get(m - 1)).doubleValue())) != zbxz.a(d3, i1)) {
            continue;
          }
        }
        else if (m + 1 < localArrayList.size())
        {
          i1 = zbxz.a(d5, ((Double)localArrayList.get(m + 1)).doubleValue());
          if (Math.abs(zbxz.b(d5, ((Double)localArrayList.get(m + 1)).doubleValue())) != zbxz.a(d3, i1)) {
            continue;
          }
        }
        float f5 = (float)(paramzp.c() + (d5 - d2) / (d1 - d2) * paramzp.e());
        if (paramzbt.m != 0)
        {
          if (k < 15) {
            d5 = zbxz.a(d5, k);
          }
          double d7 = paramzbt.n() ? paramzbt.h(d5) : d5;
          if (paramzbt.af()) {
            str1 = "0%";
          }
          localObject = "";
          d7 = paramzbt.n() ? d7 : d7 * Math.pow(10.0D, paramzbt.T().f());
          Color localColor2 = localzbwv.i();
          if (j != 0)
          {
            localObject = zra.a(localzjf.an(), Double.valueOf(d7), str1, bool, localzjf.U());
            localColor2 = zra.a(Double.valueOf(d7), str1, localColor2);
          }
          else
          {
            localObject = a(paramzbt, Double.valueOf(d7));
            localColor2 = zra.a(Double.valueOf(d7), localzbwv.b(), localColor2);
          }
          zq localzq = new zq(f5 - f3, f1, paramzbt.f, paramzbt.g - f2);
          a(paramzbt, (String)localObject, localzq);
          a(paramzr, zp.a(localzq), (String)localObject, localzbwv.e(), localzbwv.a(), localColor2, 1, 1);
        }
      }
    } else {
      for (m = localArrayList.size() - 1; m >= 0; m--)
      {
        d4 = com.aspose.cells.b.a.ze.g(localArrayList.get(m));
        int n;
        if (m - 1 > 0)
        {
          n = zbxz.a(d4, ((Double)localArrayList.get(m - 1)).doubleValue());
          if (Math.abs(zbxz.b(d4, ((Double)localArrayList.get(m - 1)).doubleValue())) != zbxz.a(d3, n)) {
            continue;
          }
        }
        else if (m + 1 < localArrayList.size())
        {
          n = zbxz.a(d4, ((Double)localArrayList.get(m + 1)).doubleValue());
          if (Math.abs(zbxz.b(d4, ((Double)localArrayList.get(m + 1)).doubleValue())) != zbxz.a(d3, n)) {
            continue;
          }
        }
        float f4 = (float)(paramzp.c() + (d1 - d4) / (d1 - d2) * paramzp.e());
        if (paramzbt.m != 0)
        {
          if (k < 15) {
            d4 = zbxz.a(d4, k);
          }
          double d6 = paramzbt.n() ? paramzbt.h(d4) : d4;
          if (paramzbt.af()) {
            str1 = "0%";
          }
          String str2 = "";
          d6 = paramzbt.n() ? d6 : d6 * Math.pow(10.0D, paramzbt.T().f());
          Color localColor1 = localzbwv.i();
          if (j != 0)
          {
            str2 = zra.a(localzjf.an(), Double.valueOf(d6), str1, bool, localzjf.U());
            localColor1 = zra.a(Double.valueOf(d6), str1, localColor1);
          }
          else
          {
            str2 = a(paramzbt, Double.valueOf(d6));
            localColor1 = zra.a(Double.valueOf(d6), localzbwv.b(), localColor1);
          }
          localObject = new zq(f4 - f3, f1, paramzbt.f, paramzbt.g - f2);
          a(paramzbt, str2, (zq)localObject);
          a(paramzr, zp.a((zq)localObject), str2, localzbwv.e(), localzbwv.a(), localColor1, 1, 1);
        }
      }
    }
    localzsq.p();
  }
  
  private static void a(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, zp paramzp)
  {
    if (paramzbt.F() == 2) {
      return;
    }
    zbt localzbt = a(paramzbt);
    int i = 0;
    int j = 0;
    switch (paramzbt.F())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbt.o) {
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
      if (localzbt.o) {
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
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.B()) : paramzbt.B();
    float f2 = (float)(d3 / (d1 - d2) * (paramFloat3 - paramFloat2));
    float f1;
    if (paramzbt.p())
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
        paramzbt.m().a(f3, paramFloat1, f3, paramFloat1 - paramzbt.ab());
      }
      if (j != 0) {
        paramzbt.m().a(f3, paramFloat1, f3, paramFloat1 + paramzbt.ab());
      }
      f3 += f2;
    } while ((paramFloat2 <= f3) && (f3 <= paramFloat3));
  }
  
  private static void b(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, double paramDouble1, double paramDouble2)
  {
    if (paramzbt.F() == 2) {
      return;
    }
    zbt localzbt = a(paramzbt);
    int i = 0;
    int j = 0;
    switch (paramzbt.F())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbt.o) {
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
      if (localzbt.o) {
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
    double d1 = paramzbt.h(paramDouble2);
    double d2 = paramzbt.h(paramDouble1);
    double d3 = d2 / paramzbt.o();
    double d4 = d3;
    double d5;
    float f;
    if (!paramzbt.p()) {
      while (d4 < d2 - d3 * 0.5D)
      {
        if (d4 > d1 + d3 * 0.4D)
        {
          d5 = (paramzbt.g(d4) - paramzbt.W()) * (paramFloat3 - paramFloat2) / (paramzbt.V() - paramzbt.W());
          f = (float)(paramFloat2 + d5);
          if (i != 0) {
            paramzbt.m().a(f, paramFloat1, f, paramFloat1 - paramzbt.ab());
          }
          if (j != 0) {
            paramzbt.m().a(f, paramFloat1, f, paramFloat1 + paramzbt.ab());
          }
        }
        d4 += d3;
      }
    }
    while (d4 < d2 - d3 * 0.5D)
    {
      if (d4 > d1 + d3 * 0.4D)
      {
        d5 = (paramzbt.g(d4) - paramzbt.W()) * (paramFloat3 - paramFloat2) / (paramzbt.V() - paramzbt.W());
        f = (float)(paramFloat3 - d5);
        if (i != 0) {
          paramzbt.m().a(f, paramFloat1, f, paramFloat1 - paramzbt.ab());
        }
        if (j != 0) {
          paramzbt.m().a(f, paramFloat1, f, paramFloat1 + paramzbt.ab());
        }
      }
      d4 += d3;
    }
  }
  
  static void c(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp, int paramInt)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzbt.k() == 2)
    {
      d(paramzr, paramzbt, paramBoolean, paramFloat, paramzp);
      return;
    }
    zjf localzjf = paramzbt.e();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = paramzbt.aa() + paramzbt.ab() + paramzbt.J().q();
    float f4 = paramzbt.g / 2.0F;
    int i = 8;
    float f5 = 0.0F;
    if (paramzbt.J().e() == 0) {
      f5 = paramzbt.g;
    } else if (Math.abs(paramzbt.J().e()) == 90) {
      f5 = paramzbt.f;
    }
    if (f5 > paramzbt.J().a().d() * 1.5F) {
      i = 1;
    }
    if (paramzbt.m == 1)
    {
      f1 = paramzp.c() - paramzbt.i - f3;
      f2 = paramzp.c() - f3;
    }
    else if (paramzbt.m == 2)
    {
      f1 = paramzp.i() + f3;
      f2 = paramzp.i() + f3;
      i = 7;
    }
    else if (paramzbt.m == 3)
    {
      if (paramBoolean)
      {
        f1 = paramFloat + f3;
        f2 = paramFloat + f3;
        i = 7;
      }
      else
      {
        f1 = paramFloat - f3 - paramzbt.i;
        f2 = paramFloat - f3;
      }
    }
    int j = 0;
    if ((paramzbt.f()) || (localzjf.u()))
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
    zbwv localzbwv = paramzbt.J();
    ArrayList localArrayList1;
    ArrayList[] arrayOfArrayList;
    if (paramzbt.g() == 0)
    {
      localArrayList1 = localzjf.z().c();
      arrayOfArrayList = localzjf.z().e();
    }
    else
    {
      localArrayList1 = localzjf.z().d();
      arrayOfArrayList = localzjf.z().g();
    }
    int k = 0;
    if ((localzbwv.c()) && (localArrayList1.size() > 0)) {
      k = 1;
    }
    float f8;
    float f9;
    for (int m = 0; m < paramInt; m++)
    {
      double d2 = (m + 1) * d1;
      if ((paramzbt.f()) || (paramzbt.e().u())) {
        d2 += d1 / 2.0D;
      }
      float f7;
      if (paramzbt.p())
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
      if ((paramzbt.m != 0) && (m % paramzbt.H() == 0) && (m < paramzbt.l.size()))
      {
        String str = "";
        Color localColor = localzbwv.i();
        if (k == 0)
        {
          str = a(paramzbt, paramzbt.l.get(m));
          localColor = zra.a(paramzbt.l.get(m), localzbwv.b(), localColor);
        }
        else
        {
          localObject1 = "";
          bool2 = false;
          localObject1 = m < localArrayList1.size() ? ((zgn)localArrayList1.get(m)).c() : "";
          bool2 = m < localArrayList1.size() ? ((zgn)localArrayList1.get(m)).b() : false;
          str = zra.a(localzjf.an(), paramzbt.l.get(m), (String)localObject1, bool2, localzjf.U());
          localColor = zra.a(paramzbt.l.get(m), (String)localObject1, localColor);
        }
        Object localObject1 = new zq(f1, f8 - f4, paramzbt.i, paramzbt.h);
        boolean bool2 = zbxz.b(str);
        ArrayList localArrayList2 = zbxz.a(str, localzbwv.f(), localzbwv.h(), false);
        if ((localArrayList2.size() > 0) && ((Math.abs(localzbwv.e()) == 90) || (localzbwv.e() == 0)))
        {
          zf localzf = paramzr.d();
          Object localObject2 = localObject1;
          if (localzbwv.e() != 0)
          {
            float f10 = ((zq)localObject2).f() + ((zq)localObject2).h() / 2.0F;
            float f11 = ((zq)localObject2).g() + ((zq)localObject2).i() / 2.0F;
            localObject2 = new zq(-((zq)localObject2).i() / 2.0F, -((zq)localObject2).h() / 2.0F, ((zq)localObject2).i(), ((zq)localObject2).h());
            paramzr.b(f10, f11);
            paramzr.a(-localzbwv.e());
          }
          int n = 1;
          int i1 = 1;
          zbda localzbda = new zbda();
          zbxz.a(localArrayList2, localzbda, localzbwv.a(), localzbwv.i(), new zzo());
          zbcw localzbcw = new zbcw();
          localzbcw.a(zbvy.a(n));
          localzbcw.b(zbvy.a(i1));
          zbde localzbde = new zbde((zq)localObject2, localzbcw, localzbda, localzbwv.a(), bool2);
          localzbde.b(paramzr, localzjf.at());
          paramzr.a(localzf);
        }
        else if ((localzbwv.e() == 0) || (localzbwv.e() == 90) || (localzbwv.e() == -90))
        {
          a(paramzbt, str, (zq)localObject1);
          a(paramzr, zp.a((zq)localObject1), str, localzbwv.e(), localzbwv.a(), localColor, i, 1);
        }
        else if (localArrayList2.size() == 0)
        {
          a(paramzr, str, new zo(f2, f9), new zt(paramzbt.i, paramzbt.h), localzbwv.e(), localzbwv.a(), localColor, paramzbt.a());
        }
        else
        {
          a(paramzr, str, new zo(f2, f9), new zt(paramzbt.i, paramzbt.h), localzbwv.e(), localzbwv.a(), localColor, paramzbt.a(), localzbwv);
        }
      }
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList1.size() > 0) && (paramzbt.m != 0))
    {
      float f6 = f3 * (arrayOfArrayList.length + 1);
      boolean bool1 = false;
      f8 = paramzp.c();
      if (paramzbt.m == 1)
      {
        f1 = paramzp.c() - paramzbt.f - f6;
        bool1 = true;
        f8 = paramzp.c();
      }
      else if (paramzbt.m == 2)
      {
        f1 = paramzp.i() + f6 + paramzbt.f;
        bool1 = false;
        f8 = paramzp.i();
      }
      else if (paramzbt.m == 3)
      {
        if (paramBoolean)
        {
          f1 = paramFloat + f6 + paramzbt.f;
          bool1 = false;
        }
        else
        {
          f1 = paramFloat - f6 - paramzbt.f;
          bool1 = true;
        }
        f8 = paramFloat;
      }
      if (!paramzbt.p()) {
        f9 = paramzp.j();
      } else {
        f9 = paramzp.d();
      }
      a(paramzr, arrayOfArrayList, bool1, paramzbt, localzbwv, d1, paramzp, f3, f8, f1, f9);
    }
  }
  
  private static void a(zr paramzr, ArrayList[] paramArrayOfArrayList, boolean paramBoolean, zbt paramzbt, zbwv paramzbwv, double paramDouble, zp paramzp, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    zjf localzjf = paramzbt.e();
    float f1 = paramFloat4;
    for (int i = 0; i < paramArrayOfArrayList.length; i++)
    {
      com.aspose.cells.b.a.b.zs localzs = new com.aspose.cells.b.a.b.zs(0, 0);
      ArrayList localArrayList = paramArrayOfArrayList[i];
      for (int j = 0; j < localArrayList.size(); j++)
      {
        zgn localzgn = (zgn)localArrayList.get(j);
        int k = a(localzgn);
        float f2 = (float)(k * paramDouble);
        String str = zra.a(localzjf.an(), localzgn.a(), localzgn.c(), localzgn.b(), localzjf.U());
        localzs = zbvy.a(paramzbt.e().ap(), str, 90, paramzbwv.a(), new zt(paramzp.b().b(), f2), 1, 1, paramzbwv.n());
        float f3 = paramBoolean ? paramFloat3 : paramFloat3 - localzs.b();
        float f4;
        if (!paramzbt.p()) {
          f4 = paramFloat4 - f2 / 2.0F - localzs.c() / 2;
        } else {
          f4 = paramFloat4 + f2 / 2.0F - localzs.c() / 2;
        }
        zq localzq = new zq(f3, f4, localzs.b(), localzs.c());
        a(paramzr, zp.a(localzq), str, 90, paramzbwv.a(), paramzbwv.i(), 1, 9);
        paramzbt.m().a(paramFloat2, paramFloat4, paramFloat3, paramFloat4);
        if (paramzbt.E() != 2)
        {
          float f5 = paramBoolean ? paramFloat3 + (paramFloat1 + localzs.b()) : paramFloat3 - (paramFloat1 + localzs.b());
          a(paramzr, localzgn.d(), paramFloat2, f5, paramFloat4, paramzbt, paramDouble);
        }
        if (!paramzbt.p()) {
          paramFloat4 -= f2;
        } else {
          paramFloat4 += f2;
        }
      }
      paramzbt.m().a(paramFloat2, paramFloat4, paramFloat3, paramFloat4);
      paramFloat4 = f1;
      paramFloat3 = paramBoolean ? paramFloat3 + localzs.b() + paramFloat1 : paramFloat3 - localzs.b() - paramFloat1;
    }
  }
  
  private static void a(zr paramzr, zagz paramzagz, float paramFloat1, float paramFloat2, float paramFloat3, zbt paramzbt, double paramDouble)
  {
    float f1 = paramFloat3;
    for (int i = 0; i < paramzagz.getCount(); i++)
    {
      zgn localzgn = (zgn)paramzagz.a(i);
      int j = a(localzgn);
      float f2 = (float)(j * paramDouble);
      if (!paramzbt.p()) {
        f1 -= f2;
      } else {
        f1 += f2;
      }
      paramzbt.m().a(paramFloat1, f1, paramFloat2, f1);
    }
  }
  
  private static void c(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat1, float paramFloat2, zp paramzp)
  {
    zbt localzbt = a(paramzbt);
    int i = 0;
    int j = 0;
    switch (paramzbt.F())
    {
    case 1: 
      i = 1;
      if (paramBoolean)
      {
        i = 0;
        j = 1;
      }
      if (localzbt.o) {
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
      if (localzbt.o) {
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
      paramzbt.m().a(paramFloat1, paramFloat2, paramFloat1 + paramzbt.ab(), paramFloat2);
    }
    if (j != 0) {
      paramzbt.m().a(paramFloat1 - paramzbt.ab(), paramFloat2, paramFloat1, paramFloat2);
    }
  }
  
  private static void d(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp)
    throws Exception
  {
    ArrayList localArrayList1 = paramzbt.l;
    zjf localzjf = paramzbt.e();
    float f1 = 0.0F;
    float f2 = paramzbt.J().q();
    int i = 8;
    if (paramzbt.m == 1)
    {
      f1 = paramzp.c() - paramzbt.f - f2;
    }
    else if (paramzbt.m == 2)
    {
      f1 = paramzp.i() + f2;
      i = 7;
    }
    else if (paramzbt.m == 3)
    {
      if (paramBoolean)
      {
        f1 = paramFloat + f2;
        i = 7;
      }
      else
      {
        f1 = paramFloat - f2 - paramzbt.f;
      }
    }
    zbwv localzbwv = paramzbt.J();
    ArrayList localArrayList2;
    ArrayList[] arrayOfArrayList;
    if (paramzbt.g() == 0)
    {
      localArrayList2 = localzjf.z().c();
      arrayOfArrayList = localzjf.z().e();
    }
    else
    {
      localArrayList2 = localzjf.z().d();
      arrayOfArrayList = localzjf.z().g();
    }
    int j = 0;
    if ((localzbwv.c()) && (localArrayList2.size() > 0)) {
      j = 1;
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0)) {
      j = 1;
    }
    int k = 0;
    int m = (int)paramzbt.z();
    int n = (int)paramzbt.D();
    int i1 = paramzbt.j();
    if ((localzjf.e().f()) || (localzjf.u()))
    {
      k = a(i1, m, n, paramzbt.e().U()) + 1;
    }
    else
    {
      k = a(i1, m, n, paramzbt.e().U());
      if (k == 0) {
        k = 1;
      }
    }
    double d = paramzp.f() / k;
    float f3 = 0.0F;
    for (int i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      int i3 = com.aspose.cells.b.a.ze.f(paramzbt.l.get(i2));
      int i4 = a(i1, i3, n, paramzbt.e().U());
      float f4 = (float)(d * i4);
      if ((paramzbt.f()) || (localzjf.u())) {
        f4 += (float)(d / 2.0D);
      }
      if (paramzbt.p()) {
        f3 = paramzp.d() + f4;
      } else {
        f3 = paramzp.d() + paramzp.f() - f4;
      }
      f3 -= paramzbt.g / 2.0F;
      if ((paramzbt.m != 0) && (i2 % paramzbt.H() == 0))
      {
        String str = "";
        Color localColor = localzbwv.i();
        if (j == 0)
        {
          str = a(paramzbt, paramzbt.l.get(i2));
          localColor = zra.a(paramzbt.l.get(i2), localzbwv.b(), localColor);
        }
        else
        {
          localObject = "";
          boolean bool = false;
          localObject = ((zgn)localArrayList2.get(0)).c();
          bool = ((zgn)localArrayList2.get(0)).b();
          str = zra.a(localzjf.an(), paramzbt.l.get(i2), (String)localObject, bool, localzjf.U());
          localColor = zra.a(paramzbt.l.get(i2), (String)localObject, localColor);
        }
        Object localObject = new zq(f1, f3, paramzbt.f, paramzbt.g);
        a(paramzbt, str, (zq)localObject);
        a(paramzr, zp.a((zq)localObject), str, localzbwv.e(), localzbwv.a(), localColor, i, 1);
      }
    }
  }
  
  static void f(zr paramzr, zbt paramzbt, boolean paramBoolean, float paramFloat, zp paramzp, zbfd paramzbfd)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzbt.w != null) {
      if (paramzbt.m == 1) {
        paramFloat += paramzbt.w.v.c() + paramzbt.aa();
      } else if (paramzbt.m == 2) {
        paramFloat -= paramzbt.w.v.c() + paramzbt.aa();
      }
    }
    zjf localzjf = paramzbt.e();
    zsq localzsq = paramzbt.T();
    float f1 = 0.0F;
    float f2 = paramzbt.J().q();
    if (paramzbt.w != null) {
      f2 += paramzbt.w.v.c() + paramzbt.aa();
    }
    if (paramzbt.m == 1)
    {
      f1 = paramzp.j() + f2;
      localzsq.b().b.b((int)(f1 + paramzbt.g));
    }
    else if (paramzbt.m == 2)
    {
      f1 = paramzp.d() - f2 - paramzbt.g;
      localzsq.b().b.b((int)f1 - localzsq.b().b.f());
    }
    else if (paramzbt.m == 3)
    {
      if (paramBoolean)
      {
        f1 = paramFloat - f2 - paramzbt.g;
        localzsq.b().b.b((int)f1 - localzsq.b().b.f());
      }
      else
      {
        f1 = paramFloat + f2;
        localzsq.b().b.b((int)(f1 + paramzbt.g));
      }
    }
    localzsq.b().b.a(paramzp.i() - localzsq.b().b.e());
    zbwv localzbwv = paramzbt.J();
    zkf localzkf = paramzbfd.F().b(0);
    String str1 = localzkf != null ? localzkf.u() : "";
    boolean bool = localzkf != null ? localzkf.v() : true;
    int i = 0;
    if ((localzbwv.c()) && (localzkf != null)) {
      i = 1;
    }
    ArrayList localArrayList = paramzbt.l;
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    int j;
    double d4;
    double d5;
    float f3;
    String str2;
    Color localColor;
    zt localzt;
    com.aspose.cells.b.a.b.zs localzs;
    zq localzq;
    int k;
    if (!paramzbt.p()) {
      for (j = 0; j < localArrayList.size(); j++)
      {
        d4 = com.aspose.cells.b.a.ze.g(localArrayList.get(j));
        d5 = paramzbt.n() ? paramzbt.h(d4) : d4;
        if (j - 1 > 0 ? Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(j - 1)))) < d3 * a : (j + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(j + 1)))) >= d3 * a))
        {
          f3 = (float)(paramzp.c() + (d4 - d2) / (d1 - d2) * paramzp.e());
          if (paramzbt.m != 0)
          {
            str2 = "";
            localColor = localzbwv.i();
            d5 = paramzbt.n() ? d5 : d5 * Math.pow(10.0D, paramzbt.T().f());
            if (i != 0)
            {
              str2 = zra.a(localzjf.an(), Double.valueOf(d5), str1, bool, localzjf.U());
              localColor = zra.a(Double.valueOf(d5), str1, localColor);
            }
            else
            {
              str2 = a(paramzbt, Double.valueOf(d5));
              localColor = zra.a(Double.valueOf(d5), localzbwv.b(), localColor);
            }
            localzt = new zt(10000.0F, 10000.0F);
            localzs = zbvy.a(paramzr, str2, 0, localzbwv.a(), localzt, 1, 1, 0);
            if (localzbwv.e() == 0)
            {
              localzq = new zq(f3 - paramzbt.f / 2.0F, f1, paramzbt.f, paramzbt.g);
              a(paramzr, zp.a(localzq), str2, localzbwv.e(), localzbwv.a(), localColor, 1, 1);
            }
            else if (localzbwv.e() == 90)
            {
              localzq = new zq(f3 - localzs.c() / 2.0F, f1, paramzbt.f, paramzbt.g);
              k = 1;
              if (paramzbt.a() == 0) {
                k = 8;
              } else if (paramzbt.a() == 3) {
                k = 7;
              }
              a(paramzr, zp.a(localzq), str2, localzbwv.e(), localzbwv.a(), localColor, k, 1);
            }
            else if (localzbwv.e() == -90)
            {
              localzq = new zq(f3 - localzs.c() / 2.0F, f1, paramzbt.f, paramzbt.g);
              k = 1;
              if (paramzbt.a() == 0) {
                k = 7;
              } else if (paramzbt.a() == 3) {
                k = 8;
              }
              a(paramzr, zp.a(localzq), str2, localzbwv.e(), localzbwv.a(), localColor, k, 1);
            }
            else
            {
              a(localzjf.ap(), str2, new zo(f3, f1), new zt(localzs.b(), localzs.c()), localzbwv.e(), localzbwv.a(), localColor, paramzbt.a());
            }
          }
        }
      }
    } else {
      for (j = localArrayList.size() - 1; j >= 0; j--)
      {
        d4 = com.aspose.cells.b.a.ze.g(localArrayList.get(j));
        d5 = paramzbt.n() ? paramzbt.h(d4) : d4;
        if (j - 1 > 0 ? Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(j - 1)))) != d3 : (j + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(j + 1)))) == d3))
        {
          f3 = (float)(paramzp.c() + (d1 - d4) / (d1 - d2) * paramzp.e());
          if (paramzbt.m != 0)
          {
            str2 = "";
            localColor = localzbwv.i();
            d5 = paramzbt.n() ? d5 : d5 * Math.pow(10.0D, paramzbt.T().f());
            if (i != 0)
            {
              str2 = zra.a(localzjf.an(), Double.valueOf(d5), str1, bool, localzjf.U());
              localColor = zra.a(Double.valueOf(d5), str1, localColor);
            }
            else
            {
              str2 = a(paramzbt, Double.valueOf(d5));
              localColor = zra.a(Double.valueOf(d5), localzbwv.b(), localColor);
            }
            localzt = new zt(10000.0F, 10000.0F);
            localzs = zbvy.a(paramzr, str2, 0, localzbwv.a(), localzt, 1, 1, 0);
            if (localzbwv.e() == 0)
            {
              localzq = new zq(f3 - paramzbt.f / 2.0F, f1, paramzbt.f, paramzbt.g);
              a(paramzr, zp.a(localzq), str2, localzbwv.e(), localzbwv.a(), localColor, 1, 1);
            }
            else if (localzbwv.e() == 90)
            {
              localzq = new zq(f3 - localzs.c() / 2.0F, f1, paramzbt.f, paramzbt.g);
              k = 1;
              if (paramzbt.a() == 0) {
                k = 8;
              } else if (paramzbt.a() == 3) {
                k = 7;
              }
              a(paramzr, zp.a(localzq), str2, localzbwv.e(), localzbwv.a(), localColor, k, 1);
            }
            else if (localzbwv.e() == -90)
            {
              localzq = new zq(f3 - localzs.c() / 2.0F, f1, paramzbt.f, paramzbt.g);
              k = 1;
              if (paramzbt.a() == 0) {
                k = 7;
              } else if (paramzbt.a() == 3) {
                k = 8;
              }
              a(paramzr, zp.a(localzq), str2, localzbwv.e(), localzbwv.a(), localColor, k, 1);
            }
            else
            {
              a(localzjf.ap(), str2, new zo(f3, f1), new zt(localzs.b(), localzs.c()), localzbwv.e(), localzbwv.a(), localColor, paramzbt.a());
            }
          }
        }
      }
    }
    localzsq.p();
  }
  
  static void a(zr paramzr, zbff paramzbff, zbt paramzbt, zp paramzp)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (!paramzbt.q()) {
      return;
    }
    int i = paramzbt.I() == 3 ? 0 : 1;
    if (i == 0) {
      return;
    }
    zjf localzjf = paramzbt.e();
    zbwv localzbwv = paramzbt.J();
    zbfd localzbfd = paramzbff.c(0);
    ArrayList localArrayList;
    ArrayList[] arrayOfArrayList;
    if (paramzbt.g() == 0)
    {
      localArrayList = localzjf.z().c();
      arrayOfArrayList = localzjf.z().e();
    }
    else
    {
      localArrayList = localzjf.z().d();
      arrayOfArrayList = localzjf.z().g();
    }
    float f = paramzbt.J().q();
    int j = ziz.a(paramzbff.i());
    double d1 = 6.283185307179586D / j;
    double d2 = paramzp.c() + paramzp.e() / 2.0D;
    double d3 = paramzp.d() + paramzp.f() / 2.0D;
    zo localzo = new zo((float)d2, (float)d3);
    double d4 = 1.5707963267948966D + d1;
    double d5 = paramzp.e() / 2;
    int k = j / 2 / 50 - 1;
    int m = (int)Math.ceil((j - k) / 2.0D / 50.0D);
    int n = 0;
    while (n < j)
    {
      double d6 = d4 - (n + 1) * d1;
      String str = "";
      Color localColor = localzbwv.i();
      zt localzt = new zt(paramzbt.f, paramzbt.g);
      if ((localzbwv.c()) && (localArrayList.size() > 0))
      {
        localObject = "";
        boolean bool = false;
        localObject = n < localArrayList.size() ? ((zgn)localArrayList.get(n)).c() : "";
        bool = n < localArrayList.size() ? ((zgn)localArrayList.get(n)).b() : false;
        str = zra.a(localzjf.an(), paramzbt.l.get(n), (String)localObject, bool, localzjf.U());
        localColor = zra.a(paramzbt.l.get(n), (String)localObject, localColor);
      }
      else
      {
        str = a(paramzbt, paramzbt.l.get(n));
        localColor = zra.a(paramzbt.l.get(n), localzbwv.b(), localColor);
      }
      Object localObject = localzbwv.a();
      int i1 = localzbwv.e();
      com.aspose.cells.b.a.b.zs localzs = zbvy.a(paramzbt.e().ap(), str, i1, (zg)localObject, localzt, 1, 1, localzbwv.n());
      double d7 = (d5 + f) * Math.cos(d6);
      double d8 = (d5 + f) * Math.sin(d6);
      double d9 = d6 / 3.141592653589793D * 180.0D;
      if ((d9 >= -135.0D) && (d9 <= -45.0D)) {
        d7 = (float)(d7 + (d9 - -45.0D) * localzs.b() / 90.0D);
      } else if ((d9 <= -225.0D) && (d9 >= -270.0D)) {
        d7 = (float)(d7 - (d9 - -315.0D) * localzs.b() / 90.0D);
      } else if ((d9 <= 90.0D) && (d9 >= 45.0D)) {
        d7 = (float)(d7 - (d9 - 45.0D) * localzs.b() / 90.0D);
      } else if ((d9 <= -135.0D) && (d9 >= -225.0D)) {
        d7 -= localzs.b();
      }
      if ((d9 >= -225.0D) && (d9 <= -135.0D)) {
        d8 = (float)(d8 - (d9 - -135.0D) * localzs.c() / 90.0D);
      } else if ((d9 >= -45.0D) && (d9 <= 45.0D)) {
        d8 = (float)(d8 + (d9 + 45.0D) * localzs.c() / 90.0D);
      } else if (((d9 <= -225.0D) && (d9 >= -270.0D)) || ((d9 <= 90.0D) && (d9 >= 45.0D))) {
        d8 += localzs.c();
      }
      d7 = d2 + d7;
      d8 = d3 - d8;
      zp localzp = new zp((int)d7, (int)d8, localzs.b(), localzs.c());
      a(paramzr, localzp, str, i1, (zg)localObject, localColor, 1, 1);
      n += m;
    }
  }
  
  static void b(zr paramzr, zbff paramzbff, zbt paramzbt, zp paramzp)
    throws Exception
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (!paramzbt.q()) {
      return;
    }
    zbfd localzbfd = paramzbff.c(0);
    zjf localzjf = paramzbt.e();
    zbwv localzbwv = paramzbt.J();
    zkf localzkf = localzbfd.F().b(0);
    int i = 0;
    if ((localzbwv.c()) && (localzkf != null)) {
      i = 1;
    }
    int j = ziz.a(paramzbff.i());
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
      paramzbt.m().a(localzo2, localzo1);
    }
    double d6 = 0.0D;
    Collections.sort(paramzbt.l);
    double d8 = paramzbt.V();
    double d10 = paramzbt.W();
    double d12 = paramzbt.Y();
    double d13 = paramzbt.Z();
    ArrayList localArrayList = paramzbt.l;
    double d14;
    double d15;
    double d17;
    double d18;
    Object localObject;
    if ((paramzbt.q()) && (paramzbt.I() != 3)) {
      for (int m = 0; m < paramzbt.l.size(); m++)
      {
        d14 = com.aspose.cells.b.a.ze.g(localArrayList.get(m));
        d15 = paramzbt.n() ? paramzbt.h(d14) : d14;
        if (m - 1 > 0 ? Math.abs(zbxz.b(d14, com.aspose.cells.b.a.ze.g(localArrayList.get(m - 1)))) != d12 : (m + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d14, com.aspose.cells.b.a.ze.g(localArrayList.get(m + 1)))) == d12))
        {
          d6 = Math.abs(d14 - d10);
          double d16 = d5 * d6 / (d8 - d10);
          d17 = d2 + d16 * Math.cos(1.5707963267948966D);
          d18 = d3 - d16 * Math.sin(1.5707963267948966D);
          d15 = paramzbt.n() ? d15 : d15 * Math.pow(10.0D, paramzbt.T().f());
          String str = a(paramzbt, Double.valueOf(d15));
          Color localColor = paramzbt.J().i();
          localColor = zra.a(Double.valueOf(d15), paramzbt.J().b(), localColor);
          if (i != 0)
          {
            str = zra.a(localzjf.an(), Double.valueOf(d15), localzkf.A(), localzkf.B(), localzjf.U());
            localColor = zra.a(Double.valueOf(d15), localzkf.A(), localColor);
          }
          zg localzg = paramzbt.J().a();
          int i1 = paramzbt.J().e();
          localObject = zbvy.a(paramzbt.e().ap(), str, i1, localzg, paramzp.b(), 1, 1);
          ((com.aspose.cells.b.a.b.zs)localObject).a(((com.aspose.cells.b.a.b.zs)localObject).b() + paramzbt.ac() * 2);
          d17 = d17 - ((com.aspose.cells.b.a.b.zs)localObject).b() - paramzbt.e().a() * 0.011D;
          d18 -= ((com.aspose.cells.b.a.b.zs)localObject).c() / 2;
          zp localzp = new zp((int)d17, (int)d18, ((com.aspose.cells.b.a.b.zs)localObject).b(), ((com.aspose.cells.b.a.b.zs)localObject).c());
          a(paramzr, localzp, str, i1, localzg, localColor, 1, 1, zv.c());
          d4 = 1.5707963267948966D;
        }
      }
    }
    zbt localzbt = paramzbt;
    zo localzo3;
    int n;
    double d19;
    double d20;
    double d21;
    double d22;
    zo localzo4;
    if ((localzbt.e().b) && (localzbt == localzbt.e().G()))
    {
      d6 = 0.0D;
      d8 = localzbt.n() ? localzbt.g(localzbt.b) : localzbt.b;
      d10 = localzbt.n() ? localzbt.g(localzbt.c) : localzbt.c;
      d12 = localzbt.n() ? localzbt.g(localzbt.d) : localzbt.d;
      d13 = localzbt.n() ? localzbt.g(localzbt.e) : localzbt.e;
      if (d12 > 0.0D) {
        for (d14 = d10 + d12; d14 <= d8; d14 = zbxz.c(d14, d12))
        {
          d6 = Math.abs(d14 - d10);
          d15 = d5 * d6 / (d8 - d10);
          d4 = 1.5707963267948966D;
          localzo3 = zo.a();
          for (n = 0; n < j; n++)
          {
            if ((!localzbt.w().h()) && (localzbt.E() != 2) && (!localzbt.A().h()) && (localzbt.q()))
            {
              d17 = Math.atan(localzbt.aa() / d15);
              d18 = Math.sqrt(Math.pow(d15, 2.0D) + Math.pow(localzbt.aa(), 2.0D));
              d19 = d2 + d18 * Math.cos(d4 + d17);
              d20 = d3 - d18 * Math.sin(d4 + d17);
              localObject = new zo((float)d19, (float)d20);
              d21 = d2 + d18 * Math.cos(d4 - d17);
              d22 = d3 - d18 * Math.sin(d4 - d17);
              localzo4 = new zo((float)d21, (float)d22);
              localzbt.m().a((zo)localObject, localzo4);
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
            if ((!localzbt.A().h()) && (localzbt.F() != 2) && (localzbt.q()))
            {
              d17 = Math.atan(localzbt.ab() / d15);
              d18 = Math.sqrt(Math.pow(d15, 2.0D) + Math.pow(localzbt.ab(), 2.0D));
              d19 = d2 + d18 * Math.cos(d4 + d17);
              d20 = d3 - d18 * Math.sin(d4 + d17);
              localObject = new zo((float)d19, (float)d20);
              d21 = d2 + d18 * Math.cos(d4 - d17);
              d22 = d3 - d18 * Math.sin(d4 - d17);
              localzo4 = new zo((float)d21, (float)d22);
              localzbt.m().a((zo)localObject, localzo4);
            }
            d4 -= d1;
          }
        }
      }
    }
    else
    {
      d6 = 0.0D;
      d8 = localzbt.V();
      d10 = localzbt.W();
      d12 = localzbt.Y();
      d13 = localzbt.Z();
      if (d12 > 0.0D) {
        for (d14 = d10 + d12; d14 <= d8; d14 = zbxz.c(d14, d12))
        {
          d6 = Math.abs(d14 - d10);
          d15 = d5 * d6 / (d8 - d10);
          d4 = 1.5707963267948966D;
          localzo3 = zo.a();
          for (n = 0; n < j; n++)
          {
            if ((!localzbt.w().h()) && (localzbt.E() != 2) && (!localzbt.A().h()) && (localzbt.q()))
            {
              d17 = Math.atan(localzbt.aa() / d15);
              d18 = Math.sqrt(Math.pow(d15, 2.0D) + Math.pow(localzbt.aa(), 2.0D));
              d19 = d2 + d18 * Math.cos(d4 + d17);
              d20 = d3 - d18 * Math.sin(d4 + d17);
              localObject = new zo((float)d19, (float)d20);
              d21 = d2 + d18 * Math.cos(d4 - d17);
              d22 = d3 - d18 * Math.sin(d4 - d17);
              localzo4 = new zo((float)d21, (float)d22);
              localzbt.m().a((zo)localObject, localzo4);
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
            if ((!localzbt.A().h()) && (localzbt.F() != 2) && (localzbt.q()))
            {
              d17 = Math.atan(localzbt.ab() / d15);
              d18 = Math.sqrt(Math.pow(d15, 2.0D) + Math.pow(localzbt.ab(), 2.0D));
              d19 = d2 + d18 * Math.cos(d4 + d17);
              d20 = d3 - d18 * Math.sin(d4 + d17);
              localObject = new zo((float)d19, (float)d20);
              d21 = d2 + d18 * Math.cos(d4 - d17);
              d22 = d3 - d18 * Math.sin(d4 - d17);
              localzo4 = new zo((float)d21, (float)d22);
              localzbt.m().a((zo)localObject, localzo4);
            }
            d4 -= d1;
          }
        }
      }
    }
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, zbt paramzbt, zbfd paramzbfd, boolean paramBoolean)
    throws Exception
  {
    if ((!paramzbt.q()) || (paramzbt.I() == 3) || (paramzbt.e().B().E())) {
      return new com.aspose.cells.b.a.b.zs(0, 0);
    }
    zjf localzjf = paramzbt.e();
    zkf localzkf = paramzbfd.F().b(0);
    int i = paramzbfd.ai();
    zbwv localzbwv = paramzbt.J();
    String str1 = localzkf != null ? localzkf.A() : "";
    boolean bool = localzkf != null ? localzkf.B() : true;
    int j = 0;
    if ((localzbwv.c()) && (localzkf != null)) {
      j = 1;
    }
    int k = 0;
    int m = 0;
    ArrayList localArrayList = paramzbt.l;
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    double d4 = 1.0E-10D;
    for (int n = 0; n < paramzbt.l.size(); n++)
    {
      double d5 = com.aspose.cells.b.a.ze.g(localArrayList.get(n));
      double d6 = paramzbt.n() ? paramzbt.h(d5) : d5;
      if (n - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d5, com.aspose.cells.b.a.ze.g(localArrayList.get(n - 1)))))) / d3 > 1.0E10D : (n + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(d5, com.aspose.cells.b.a.ze.g(localArrayList.get(n + 1)))))) / d4 <= 1.0E10D))
      {
        if (paramzbt.af()) {
          str1 = "0%";
        }
        String str2 = "";
        d6 = paramzbt.n() ? d6 : d6 * Math.pow(10.0D, paramzbt.T().f());
        Color localColor = localzbwv.i();
        if (j != 0)
        {
          str2 = zra.a(localzjf.an(), Double.valueOf(d6), str1, bool, localzjf.U());
          localColor = zra.a(Double.valueOf(d6), str1, localColor);
        }
        else
        {
          str2 = a(paramzbt, Double.valueOf(d6));
          localColor = zra.a(Double.valueOf(d6), localzbwv.b(), localColor);
        }
        com.aspose.cells.b.a.b.zs localzs = zbvy.a(paramzbt.e().ap(), str2, localzbwv.e(), localzbwv.a(), paramzbt.e().B().b.b(), 1, 1);
        localzs.a(localzs.b() + paramzbt.ac() * 2);
        if (localzs.b() > k) {
          k = localzs.b();
        }
        if (localzs.c() > m) {
          m = localzs.c();
        }
      }
    }
    if (paramBoolean) {
      m += (int)(2 * paramzbt.aa() + 0.5D);
    } else {
      k += (int)(2 * paramzbt.aa() + 0.5D);
    }
    paramzbt.f = k;
    paramzbt.g = m;
    return new com.aspose.cells.b.a.b.zs(k, m);
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, zbt paramzbt, zp paramzp1, zp paramzp2, int paramInt, boolean paramBoolean, zbfd paramzbfd)
    throws Exception
  {
    zp localzp = new zp(paramzp1.c(), paramzp1.d(), paramzp1.e(), paramzp1.f());
    if (localzp.e() > paramzbt.e().aw()) {
      localzp.c(localzp.e() - paramzbt.e().aw());
    }
    if ((!paramzbt.q()) || (paramzbt.I() == 3) || (zbxz.a(localzp))) {
      return new com.aspose.cells.b.a.b.zs(0, 0);
    }
    int i = 0;
    if (paramzbt.k() == 2)
    {
      i = 1;
      paramzbt.f(false);
      paramzbt.k(1);
    }
    ArrayList localArrayList1 = (ArrayList)paramzbt.l.clone();
    if (paramzbt.n()) {
      for (int j = 0; j < localArrayList1.size(); j++) {
        localArrayList1.set(j, Double.valueOf(paramzbt.h(com.aspose.cells.b.a.ze.g(localArrayList1.get(j)))));
      }
    }
    zjf localzjf = paramzbt.e();
    boolean bool1 = localzjf.ab();
    boolean bool2 = false;
    ArrayList localArrayList2;
    ArrayList[] arrayOfArrayList;
    if (paramzbt.g() == 0)
    {
      localArrayList2 = localzjf.z().c();
      arrayOfArrayList = localzjf.z().e();
      bool2 = localzjf.z().a;
    }
    else
    {
      localArrayList2 = localzjf.z().d();
      arrayOfArrayList = localzjf.z().g();
      bool2 = localzjf.z().b;
    }
    int k = (arrayOfArrayList != null) && (arrayOfArrayList.length > 0) ? 1 : 0;
    int m = a(paramzbt, paramInt);
    zbwv localzbwv = paramzbt.J();
    int n = 300;
    String str1 = paramzbfd.F().a(0).u();
    boolean bool3 = paramzbfd.F().a(0).v();
    String str2 = "";
    boolean bool4 = false;
    boolean bool5 = false;
    if ((paramzbfd.ai() == 60) || (paramzbfd.ai() == 12))
    {
      if (localzbwv.c()) {
        bool5 = true;
      }
    }
    else
    {
      if ((localzbwv.c()) && (localArrayList2.size() > 0)) {
        bool5 = true;
      }
      if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0)) {
        bool5 = true;
      }
    }
    zt localzt1 = new zt(0.0F, 0.0F);
    int i1 = 0;
    if (i == 0)
    {
      if ((paramzbt.f()) || (localzjf.u()))
      {
        i1 = localArrayList1.size();
      }
      else
      {
        i1 = localArrayList1.size() - 1;
        if (i1 == 0) {
          i1 = 1;
        }
      }
    }
    else {
      i1 = localArrayList1.size();
    }
    int i2 = 1;
    if (!paramzbfd.ay())
    {
      float f1;
      if (paramBoolean)
      {
        if (localzp.f() / i1 < 1.0F)
        {
          f1 = localzp.f() / i1 * 10.0F;
          i2 *= 10;
          if (f1 < 1.0F)
          {
            f1 = localzp.e() / i1 * 10.0F;
            i2 *= 10;
          }
        }
      }
      else if (localzp.e() / i1 < 1.0F)
      {
        f1 = localzp.e() / i1 * 10.0F;
        i2 *= 10;
        if (f1 < 1.0F)
        {
          f1 = localzp.e() / i1 * 10.0F;
          i2 *= 10;
        }
      }
    }
    int i3 = 0;
    if ((!localzjf.B().s()) && (localzjf.D())) {
      i3 = 1;
    }
    zt localzt2 = 0;
    zt localzt3 = 0;
    float f2 = 0;
    float f3 = 0;
    int i4 = 0;
    float f4;
    int i5;
    int i7;
    float f8;
    int i10;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    float f12;
    float f17;
    float f19;
    float f5;
    if (localzbwv.k())
    {
      f4 = 0.55F;
      i5 = 0;
      i7 = 0;
      f8 = 0.0F;
      i10 = 0;
      localObject3 = zbvy.a(paramzr, "a", localzbwv.a());
      zt localzt4 = zbvy.b(paramzr, "a", localzbwv.a());
      int i13 = 0;
      localObject4 = new float[localArrayList1.size()][2];
      localObject5 = new com.aspose.cells.b.a.b.zs[localArrayList1.size()];
      String[] arrayOfString = new String[localArrayList1.size()];
      for (;;)
      {
        localzt2 = 0;
        localzt3 = 0;
        f2 = 0;
        f3 = 0;
        f12 = 0.0F;
        if (paramzbfd.ay())
        {
          int i14 = localArrayList1.size() - 1;
          if (i14 <= 0) {
            i14 = 1;
          }
          zt localzt5 = zbvy.c(paramzr, "3", localzbwv.a());
          if (paramBoolean)
          {
            localzt1.b(localzp.f() / i14);
            localzt1.a(localzp.e() * f4);
            localzt1.b(localzt1.c() + zbxz.a(localzt5.c()));
            f12 = localzt1.c();
          }
          else
          {
            localzt1.a(localzp.e() / i14);
            localzt1.b(localzp.f() * f4);
            localzt1.a(localzt1.b() + zbxz.a(localzt5.b()));
            f12 = localzt1.b();
          }
        }
        else if (paramBoolean)
        {
          localzt1.b(localzp.f() / i1 * paramzbt.H());
          localzt1.a(localzp.e() * f4);
          if (i3 != 0)
          {
            if (paramzbt.m == 2)
            {
              if (localzt1.b() < paramzp2.i() - localzp.i()) {
                localzt1.a(paramzp2.i() - localzp.i());
              }
            }
            else if ((paramzbt.m == 1) && (localzt1.b() < localzp.c() - paramzp2.c())) {
              localzt1.a(localzp.c() - paramzp2.c());
            }
            if (localzt1.b() > paramzp2.e() * 0.5F) {
              localzt1.a(paramzp2.e() * 0.5F);
            }
          }
          if (paramzbt.K()) {
            if ((Math.abs(localzbwv.e()) == 0) && (paramzbt.H() < i1))
            {
              if (localzt1.c() < ((com.aspose.cells.b.a.b.zs)localObject3).c()) {
                paramzbt.k(paramzbt.H() + i2);
              }
            }
            else if ((Math.abs(localzbwv.e()) == 90) && (localzt1.c() < ((com.aspose.cells.b.a.b.zs)localObject3).b()) && (paramzbt.H() < i1))
            {
              paramzbt.k(paramzbt.H() + i2);
              continue;
            }
          }
          f12 = localzt1.c();
        }
        else
        {
          if (m > paramzbt.H()) {
            localzt1.a(localzp.e() / i1 * m);
          } else {
            localzt1.a(localzp.e() / i1 * paramzbt.H());
          }
          localzt1.b(localzp.f() * f4);
          if (i3 != 0)
          {
            if (paramzbt.m == 2)
            {
              if (localzt1.c() < localzp.h() - paramzp2.h()) {
                localzt1.b(localzp.h() - paramzp2.h());
              }
            }
            else if ((paramzbt.m == 1) && (localzt1.c() < paramzp2.j() - localzp.j())) {
              localzt1.b(paramzp2.j() - localzp.j());
            }
            if (localzt1.c() > paramzp2.f() * 0.5F) {
              localzt1.b(paramzp2.f() * 0.5F);
            }
          }
          if (paramzbt.K()) {
            if (Math.abs(localzbwv.e()) == 0)
            {
              if (localzt1.b() < ((com.aspose.cells.b.a.b.zs)localObject3).b()) {
                paramzbt.k(paramzbt.H() + i2);
              }
            }
            else if ((Math.abs(localzbwv.e()) == 90) && (((!localzjf.ab()) && (localzt1.b() < localzt4.c() - 2.0F)) || ((localzjf.ab()) && (localzt1.b() < localzt4.c()))))
            {
              paramzbt.k(paramzbt.H() + i2);
              if (k != 0) {
                continue;
              }
              localzbwv.b(45);
              continue;
            }
          }
          f12 = localzt1.b();
        }
        float f13 = 0.0F;
        if (localzbwv.e() == 45) {
          if (paramzbfd.ay())
          {
            int i16 = localArrayList1.size() - 1;
            if (i16 <= 0) {
              i16 = 1;
            }
            if (paramBoolean) {
              f13 = localzp.f() / i16;
            } else {
              f13 = localzp.e() / i16;
            }
          }
          else if (paramBoolean)
          {
            f13 = localzp.f() / i1;
          }
          else
          {
            f13 = localzp.e() / i1;
          }
        }
        float f16 = 0.0F;
        f17 = 0.0F;
        for (int i19 = 0; i19 < localArrayList1.size(); i19++)
        {
          int i20 = localArrayList1.size() - 1 - i19;
          if (localzbwv.e() == 45)
          {
            if (paramBoolean)
            {
              if (paramzbt.p())
              {
                if (localzbwv.e() > 0)
                {
                  if (i3 == 0) {
                    localzt1.a(localzp.e() * f4);
                  }
                  localzt1.b(localzp.f() - i19 * f13 - f13 / 2.0F);
                }
                else
                {
                  if (i3 == 0) {
                    localzt1.a(localzp.e() * f4);
                  }
                  localzt1.b(localzp.f() - i20 * f13 - f13 / 2.0F);
                }
              }
              else if (localzbwv.e() > 0)
              {
                if (i3 == 0) {
                  localzt1.a(localzp.e() * f4);
                }
                localzt1.b(localzp.f() - i20 * f13 - f13 / 2.0F);
              }
              else
              {
                if (i3 == 0) {
                  localzt1.a(localzp.e() * f4);
                }
                localzt1.b(localzp.f() - i19 * f13 - f13 / 2.0F);
              }
            }
            else if (paramzbt.p())
            {
              if (localzbwv.e() > 0)
              {
                localzt1.a(localzp.e() - i19 * f13 - f13 / 2.0F);
                if (i3 == 0) {
                  localzt1.b(localzp.f() * f4);
                }
              }
              else
              {
                localzt1.a(localzp.e() - i20 * f13 - f13 / 2.0F);
                if (i3 == 0) {
                  localzt1.b(localzp.f() * f4);
                }
              }
            }
            else if (localzbwv.e() > 0)
            {
              localzt1.a(localzp.e() - i20 * f13 - f13 / 2.0F);
              if (i3 == 0) {
                localzt1.b(localzp.f() * f4);
              }
            }
            else
            {
              localzt1.a(localzp.e() - i19 * f13 - f13 / 2.0F);
              if (i3 == 0) {
                localzt1.b(localzp.f() * f4);
              }
            }
            if (localzt1.b() < localzp.e() * f4) {
              localzt1.a(localzp.e() * f4);
            }
            if (localzt1.c() < localzp.f() * f4) {
              localzt1.b(localzp.f() * f4);
            }
          }
          if ((i19 == 0) && (i13 <= 0)) {
            paramzbt.J().a(((com.aspose.cells.b.a.b.zs)localObject3).b() * paramzbt.J().d() / n);
          }
          String str5;
          if ((i13 <= 0) || (arrayOfString[i19] == null))
          {
            str5 = "";
            if (bool5)
            {
              str2 = i19 < localArrayList2.size() ? ((zgn)localArrayList2.get(i19)).c() : "";
              bool4 = i19 < localArrayList2.size() ? ((zgn)localArrayList2.get(i19)).b() : false;
              if ((paramzbfd.ay()) && (!paramzbt.p)) {
                str5 = zra.a(localzjf.an(), Double.valueOf(com.aspose.cells.b.a.ze.g(localArrayList1.get(i19)) * Math.pow(10.0D, paramzbt.T().f())), str1, bool3, localzjf.U());
              } else {
                str5 = zra.a(localzjf.an(), localArrayList1.get(i19), str2, bool4, localzjf.U());
              }
            }
            else
            {
              str5 = a(paramzbt, localArrayList1.get(i19));
            }
            arrayOfString[i19] = str5;
          }
          else
          {
            str5 = arrayOfString[i19];
          }
          float f21;
          float f22;
          if (i13 <= 0)
          {
            f21 = zbvy.a(paramzr, str5, localzbwv.a(), !bool1);
            f22 = zbvy.b(paramzr, str5, localzbwv.a()).b();
            localObject4[i19][0] = f21;
            localObject4[i19][1] = f22;
          }
          else
          {
            f21 = localObject4[i19][0];
            f22 = localObject4[i19][1];
          }
          if (f21 > f16) {
            f16 = f21;
          }
          if (f22 > f17) {
            f17 = f22;
          }
          com.aspose.cells.b.a.b.zs localzs6 = new com.aspose.cells.b.a.b.zs(0, 0);
          if ((bool2) || (localzbwv.e() != 0) || (!"".equals(paramzbt.J().b())))
          {
            localzs6 = zbvy.a(paramzr, str5, localzbwv.e(), localzbwv.a(), localzt1, 1, 1, localzbwv.n());
          }
          else if (i13 <= 0)
          {
            localzs6 = zbvy.a(paramzr, str5, localzbwv.a());
            localObject5[i19] = localzs6;
          }
          else
          {
            localzs6 = localObject5[i19];
          }
          float f23 = localzs6.c() / localzbwv.a().d();
          if ((localzbwv.e() == 0) && (f23 > 1.5F) && (f23 < 3.0F))
          {
            localzt7 = zbvy.b(paramzr, str5, localzbwv.a());
            if ((localzt7.b() < localzt1.b()) && (localzt7.b() >= localzs6.b()))
            {
              localzs6.a(zbxz.a(localzt7.b()));
              localzs6.b(zbxz.a(localzt7.c()));
            }
          }
          if (localzs6.b() > localzt2) {
            localzt2 = localzs6.b();
          }
          if (localzs6.c() > localzt3) {
            localzt3 = localzs6.c();
          }
          zt localzt7 = localzt2;
          if (paramBoolean) {
            localzt7 = localzt3;
          }
          if ((localzbwv.e() != 0) && (Math.abs(localzbwv.e()) != 90))
          {
            float f24;
            float f25;
            switch (paramzbt.a())
            {
            case 0: 
              if (paramzbt.p())
              {
                if (localzbwv.e() > 0)
                {
                  f24 = i20 * f13 + f13 / 2.0F;
                  if (localzt7 > f24)
                  {
                    f25 = localzt7 - f24;
                    if (f25 > f2) {
                      f2 = (int)f25;
                    }
                  }
                }
                else
                {
                  f24 = i19 * f13 + f13 / 2.0F;
                  if (localzt7 > f24)
                  {
                    f25 = localzt7 - f24;
                    if (f25 > f3) {
                      f3 = (int)f25;
                    }
                  }
                }
              }
              else if (localzbwv.e() > 0)
              {
                f24 = i19 * f13 + f13 / 2.0F;
                if (localzt7 > f24)
                {
                  f25 = localzt7 - f24;
                  if (f25 > f2) {
                    f2 = (int)f25;
                  }
                }
              }
              else
              {
                f24 = i20 * f13 + f13 / 2.0F;
                if (localzt7 > f24)
                {
                  f25 = localzt7 - f24;
                  if (f25 > f3) {
                    f3 = (int)f25;
                  }
                }
              }
              break;
            case 3: 
              if (paramzbt.p())
              {
                if (localzbwv.e() < 0)
                {
                  f24 = i20 * f13 + f13 / 2.0F;
                  if (localzt7 > f24)
                  {
                    f25 = localzt7 - f24;
                    if (f25 > f2) {
                      f2 = (int)f25;
                    }
                  }
                }
                else
                {
                  f24 = i19 * f13 + f13 / 2.0F;
                  if (localzt7 > f24)
                  {
                    f25 = localzt7 - f24;
                    if (f25 > f3) {
                      f3 = (int)f25;
                    }
                  }
                }
              }
              else if (localzbwv.e() < 0)
              {
                f24 = i19 * f13 + f13 / 2.0F;
                if (localzt7 > f24)
                {
                  f25 = localzt7 - f24;
                  if (f25 > f2) {
                    f2 = (int)f25;
                  }
                }
              }
              else
              {
                f24 = i20 * f13 + f13 / 2.0F;
                if (localzt7 > f24)
                {
                  f25 = localzt7 - f24;
                  if (f25 > f3) {
                    f3 = (int)f25;
                  }
                }
              }
              break;
            case 1: 
              if (paramzbt.p())
              {
                if (localzbwv.e() > 0)
                {
                  f24 = i20 * f13 + f13 / 2.0F;
                  if (localzt7 > f24)
                  {
                    f25 = localzt7 - f24;
                    if (f25 > f2) {
                      f2 = (int)f25;
                    }
                  }
                }
                else
                {
                  f24 = i19 * f13 + f13 / 2.0F;
                  if (localzt7 > f24)
                  {
                    f25 = localzt7 - f24;
                    if (f25 > f3) {
                      f3 = (int)f25;
                    }
                  }
                }
              }
              else if (localzbwv.e() > 0)
              {
                f24 = i19 * f13 + f13 / 2.0F;
                if (localzt7 > f24)
                {
                  f25 = localzt7 - f24;
                  if (f25 > f2) {
                    f2 = (int)f25;
                  }
                }
              }
              else
              {
                f24 = i20 * f13 + f13 / 2.0F;
                if (localzt7 > f24)
                {
                  f25 = localzt7 - f24;
                  if (f25 > f3) {
                    f3 = (int)f25;
                  }
                }
              }
              break;
            case 2: 
              if (paramzbt.p())
              {
                if (localzbwv.e() < 0)
                {
                  f24 = i20 * f13 + f13 / 2.0F;
                  if (localzt7 > f24)
                  {
                    f25 = localzt7 - f24;
                    if (f25 > f2) {
                      f2 = (int)f25;
                    }
                  }
                }
                else
                {
                  f24 = i19 * f13 + f13 / 2.0F;
                  if (localzt7 > f24)
                  {
                    f25 = localzt7 - f24;
                    if (f25 > f3) {
                      f3 = (int)f25;
                    }
                  }
                }
              }
              else if (localzbwv.e() < 0)
              {
                f24 = i19 * f13 + f13 / 2.0F;
                if (localzt7 > f24)
                {
                  f25 = localzt7 - f24;
                  if (f25 > f2) {
                    f2 = (int)f25;
                  }
                }
              }
              else
              {
                f24 = i20 * f13 + f13 / 2.0F;
                if (localzt7 > f24)
                {
                  f25 = localzt7 - f24;
                  if (f25 > f3) {
                    f3 = (int)f25;
                  }
                }
              }
              break;
            }
          }
        }
        i13++;
        paramzbt.h = localzt3;
        paramzbt.i = localzt2;
        if ((bool2) && (f16 > f12))
        {
          if (!paramBoolean) {
            if (k == 0)
            {
              f19 = 1.25F;
              if ((localzbwv.e() == 0) && (localzt3 > localzt4.c() * 1.6F))
              {
                if (f12 <= localzt4.c() * f19)
                {
                  localzbwv.b(90);
                  continue;
                }
                localzbwv.b(45);
                continue;
              }
              if ((localzbwv.e() == 45) && (f12 <= localzt4.c() * f19))
              {
                localzbwv.b(90);
                continue;
              }
            }
            else if (localzbwv.e() != 90)
            {
              localzbwv.b(90);
            }
          }
        }
        else if (paramBoolean)
        {
          if ((localzt1.c() / localzt3 > 2.5D) && (f4 > 0.2D) && (localzt1.b() * 4.0F / 5.0F > f16)) {
            f4 = f4 * 4.0F / 5.0F;
          }
        }
        else if ((localzt1.b() / localzt2 > 2.0F) && (f4 > 0.3D))
        {
          f4 = f4 * 4.0F / 5.0F;
          continue;
        }
        if ((!paramzbt.K()) || (i10 != 0)) {
          break;
        }
        if (paramBoolean)
        {
          if (((localzt2 != i5) || (localzt3 != i7) || (f8 != localzt1.c())) && (localzt3 > localzt1.c() - 5.0F) && (paramzbt.H() < i1))
          {
            i5 = localzt2;
            i7 = localzt3;
            f8 = localzt1.c();
            paramzbt.k(paramzbt.H() + i2);
          }
          else
          {
            if (paramzbt.H() <= 1) {
              break;
            }
            paramzbt.k(paramzbt.H() - i2);
            if (paramzbt.H() < 1) {
              paramzbt.k(1);
            }
            i10 = 1;
          }
        }
        else if (((localzt2 != i5) || (localzt3 != i7) || (f8 != localzt1.b())) && (((!localzjf.ab()) && (localzt2 > localzt1.b() - 5.0F) && (localzt2 < ((com.aspose.cells.b.a.b.zs)localObject3).b() * 4)) || ((localzjf.ab()) && (localzt2 > localzt1.b()) && (paramzbt.H() < i1))))
        {
          i5 = localzt2;
          i7 = localzt3;
          f8 = localzt1.b();
          paramzbt.k(paramzbt.H() + i2);
        }
        else
        {
          if (paramzbt.H() <= 1) {
            break;
          }
          paramzbt.k(paramzbt.H() - i2);
          if (paramzbt.H() < 1) {
            paramzbt.k(1);
          }
          i10 = 1;
        }
      }
      if (paramzbt.p())
      {
        f19 = f2;
        f2 = f3;
        f3 = f19;
      }
    }
    else
    {
      float[][] arrayOfFloat;
      if ((localzbwv.e() == 0) || (localzbwv.e() == 90) || (localzbwv.e() == -90))
      {
        f4 = 0.5F;
        i5 = 0;
        i7 = 0;
        f8 = 0.0F;
        i10 = 0;
        localObject3 = zbvy.a(paramzr, "a", localzbwv.a());
        int i12 = 0;
        arrayOfFloat = new float[localArrayList1.size()][2];
        localObject4 = new String[localArrayList1.size()];
        localObject5 = a(paramzbt, localArrayList1, bool5, localArrayList2, paramzbfd, localzbwv);
        float f15;
        for (;;)
        {
          localzt2 = 0;
          localzt3 = 0;
          f2 = 0;
          f3 = 0;
          float f11 = 0.0F;
          f12 = 0.0F;
          Object localObject6;
          if (paramzbfd.ay())
          {
            int i15 = localArrayList1.size() - 1;
            if (i15 <= 0) {
              i15 = 1;
            }
            localObject6 = zbvy.c(paramzr, "3", localzbwv.a());
            if (paramBoolean)
            {
              localzt1.b(localzp.f() / i15);
              localzt1.a(localzp.e() * f4);
              localzt1.b(localzt1.c() + zbxz.a(((zt)localObject6).c()));
            }
            else
            {
              localzt1.a(localzp.e() / i15);
              localzt1.b(localzp.f() * f4);
              localzt1.a(localzt1.b() + zbxz.a(((zt)localObject6).b()));
            }
          }
          else if (paramBoolean)
          {
            localzt1.b(localzp.f() / i1 * paramzbt.H());
            localzt1.a(localzp.e() * f4);
            if (i3 != 0)
            {
              if (paramzbt.m == 2)
              {
                if (localzt1.b() < paramzp2.i() - localzp.i()) {
                  localzt1.a(paramzp2.i() - localzp.i());
                }
              }
              else if ((paramzbt.m == 1) && (localzt1.b() < localzp.c() - paramzp2.c())) {
                localzt1.a(localzp.c() - paramzp2.c());
              }
              if (localzt1.b() > paramzp2.e() * 0.5F) {
                localzt1.a(paramzp2.e() * 0.5F);
              }
            }
            if (paramzbt.K()) {
              if ((Math.abs(localzbwv.e()) == 0) && (paramzbt.H() < i1))
              {
                if (localzt1.c() < ((com.aspose.cells.b.a.b.zs)localObject3).c()) {
                  paramzbt.k(paramzbt.H() + i2);
                }
              }
              else if ((Math.abs(localzbwv.e()) == 90) && (localzt1.c() < ((com.aspose.cells.b.a.b.zs)localObject3).b()) && (paramzbt.H() < i1)) {
                paramzbt.k(paramzbt.H() + i2);
              }
            }
          }
          else
          {
            if ((Math.abs(localzbwv.e()) == 0) && (!paramzbt.K()))
            {
              float f14 = 0.0F;
              if (m > paramzbt.H())
              {
                f14 = localzp.e() / i1 * m;
              }
              else
              {
                f14 = localzp.e() / i1 * paramzbt.H();
                if ((f11 == 0.0F) || (localzt1.b() < 1.2D * f11)) {
                  f14 += 3.0F;
                }
              }
              localObject6 = zbvy.a(paramzr, (String)localObject5, localzbwv.e(), localzbwv.a(), new zt(f14, 2.14748365E9F), 1, 1, localzbwv.n());
              if (((com.aspose.cells.b.a.b.zs)localObject6).c() > 2.5F * ((com.aspose.cells.b.a.b.zs)localObject3).c())
              {
                i4 = 1;
                f17 = 2.0F * ((com.aspose.cells.b.a.b.zs)localObject3).c() / paramzp2.f();
                if ((f4 <= f17) || (m < 5 * paramzbt.H())) {
                  m = 5 * paramzbt.H();
                }
              }
            }
            if (m > paramzbt.H())
            {
              localzt1.a(localzp.e() / i1 * m);
            }
            else
            {
              localzt1.a(localzp.e() / i1 * paramzbt.H());
              if ((f11 == 0.0F) || (localzt1.b() < 1.2D * f11)) {
                localzt1.a(localzt1.b() + 3.0F);
              }
            }
            if ((localzjf.B().s()) || (!localzjf.D()) || (localzjf.ab()))
            {
              localzt1.b(localzp.f() * f4);
            }
            else if (localzp.j() <= paramzp2.j())
            {
              localzt1.b(paramzp2.f() * f4);
              f15 = zbxz.c(((com.aspose.cells.b.a.b.zs)localObject3).b() * paramzbt.J().d() / n);
              int i17 = (int)(paramzbt.J().o() + 0.5D);
              int i18 = paramzp2.j() - localzp.j() - i17 - ziz.b / 2;
              if (localzt1.c() > i18)
              {
                localzt1.b(i18);
                if (localzt1.c() < localzp.f() * 0.25F) {
                  localzt1.b(localzp.f() * 0.25F);
                }
              }
            }
            else
            {
              localzt1.b(0.0F);
            }
            if (paramzbt.K()) {
              if (Math.abs(localzbwv.e()) == 0)
              {
                if (localzt1.b() < ((com.aspose.cells.b.a.b.zs)localObject3).b()) {
                  paramzbt.k(paramzbt.H() + i2);
                }
              }
              else if ((Math.abs(localzbwv.e()) == 90) && (localzt1.b() < ((com.aspose.cells.b.a.b.zs)localObject3).c()))
              {
                paramzbt.k(paramzbt.H() + i2);
                continue;
              }
            }
          }
          f15 = 0;
          while (f15 < localArrayList1.size())
          {
            if ((f15 == 0) && (i12 <= 0)) {
              paramzbt.J().a(zbxz.c(((com.aspose.cells.b.a.b.zs)localObject3).b() * paramzbt.J().d() / n));
            }
            String str4;
            if ((i12 <= 0) || (localObject4[f15] == null))
            {
              str4 = "";
              if (bool5)
              {
                str2 = f15 < localArrayList2.size() ? ((zgn)localArrayList2.get(f15)).c() : "";
                bool4 = f15 < localArrayList2.size() ? ((zgn)localArrayList2.get(f15)).b() : false;
                if ((paramzbfd.ay()) && (!paramzbt.p)) {
                  str4 = zra.a(localzjf.an(), Double.valueOf(com.aspose.cells.b.a.ze.g(localArrayList1.get(f15)) * Math.pow(10.0D, paramzbt.T().f())), str1, bool3, localzjf.U());
                } else {
                  str4 = zra.a(localzjf.an(), localArrayList1.get(f15), str2, bool4, localzjf.U());
                }
              }
              else
              {
                str4 = a(paramzbt, localArrayList1.get(f15));
              }
              localObject4[f15] = str4;
            }
            else
            {
              str4 = localObject4[f15];
            }
            float f18;
            if (i12 <= 0)
            {
              f18 = zbvy.a(paramzr, str4, localzbwv.a(), !bool1);
              f19 = zbvy.b(paramzr, str4, localzbwv.a()).b();
              arrayOfFloat[f15][0] = f18;
              arrayOfFloat[f15][1] = f19;
            }
            else
            {
              f18 = arrayOfFloat[f15][0];
              f19 = arrayOfFloat[f15][1];
            }
            if (f18 > f11) {
              f11 = f18;
            }
            if (f19 > f12) {
              f12 = f19;
            }
            com.aspose.cells.b.a.b.zs localzs5 = zbvy.a(paramzr, str4, localzbwv.e(), localzbwv.a(), localzt1, 1, 1, localzbwv.n());
            float f20 = localzs5.c() / localzbwv.a().d();
            if ((localzbwv.e() == 0) && (f20 > 1.5F) && (f20 < 3.0F))
            {
              zt localzt6 = zbvy.b(paramzr, str4, localzbwv.a());
              if ((localzt6.b() < localzt1.b()) && (localzt6.b() >= localzs5.b()))
              {
                localzs5.a(zbxz.a(localzt6.b()));
                localzs5.b(zbxz.a(localzt6.c()));
              }
            }
            if (localzs5.b() > localzt2) {
              localzt2 = localzs5.b();
            }
            if (localzs5.c() > localzt3) {
              localzt3 = localzs5.c();
            }
            if (f15 == 0) {
              if (paramBoolean)
              {
                f2 = localzs5.c() / 2;
              }
              else
              {
                f2 = localzs5.b() / 2;
                if ((i4 != 0) && (f2 > localzp.e() / i1)) {
                  f2 -= localzp.e() / i1;
                }
              }
            }
            if (f15 == localArrayList1.size() - 1) {
              if (paramBoolean)
              {
                f3 = localzs5.c() / 2;
              }
              else
              {
                f3 = localzs5.b() / 2;
                if ((i4 != 0) && (f3 > localzp.e() / i1)) {
                  f3 -= localzp.e() / i1;
                }
              }
            }
            f15 += paramzbt.H();
          }
          i12++;
          paramzbt.h = localzt3;
          paramzbt.i = localzt2;
          if (i == 0) {
            if (paramBoolean)
            {
              if ((localzt1.c() / localzt3 > 2.5D) && (f4 > 0.3D)) {
                f4 = f4 * 4.0F / 5.0F;
              }
            }
            else if ((localzt1.b() / localzt2 > 2.0F) && (f4 >= 0.5D) && (localzjf.C().s()))
            {
              f4 = f4 * 4.0F / 5.0F;
              continue;
            }
          }
          if ((!paramzbt.K()) || (i10 != 0)) {
            break;
          }
          if (paramBoolean)
          {
            if (((localzt2 != i5) || (localzt3 != i7)) && (localzt3 > localzt1.c() - 5.0F) && (paramzbt.H() < i1))
            {
              i5 = localzt2;
              i7 = localzt3;
              f8 = localzt1.c();
              paramzbt.k(paramzbt.H() + i2);
            }
            else
            {
              if (paramzbt.H() <= 1) {
                break;
              }
              paramzbt.k(paramzbt.H() - i2);
              if (paramzbt.H() < 1) {
                paramzbt.k(1);
              }
              i10 = 1;
            }
          }
          else if (((localzt2 != i5) || (localzt3 != i7)) && (localzt2 > localzt1.b() - 5.0F) && (localzt2 < 2.0F * f11) && (localzbwv.n() == 0) && (paramzbt.H() < i1))
          {
            i5 = localzt2;
            i7 = localzt3;
            f8 = localzt1.b();
            paramzbt.k(paramzbt.H() + i2);
          }
          else
          {
            if (paramzbt.H() <= 1) {
              break;
            }
            paramzbt.k(paramzbt.H() - i2);
            if (paramzbt.H() < 1) {
              paramzbt.k(1);
            }
            i10 = 1;
          }
        }
        if (paramzbt.p())
        {
          f15 = f2;
          f2 = f3;
          f3 = f15;
        }
      }
      else
      {
        Object localObject2;
        if (localzbwv.e() == 255)
        {
          com.aspose.cells.b.a.b.zs localzs1 = zbvy.a(paramzr, "H", localzbwv.a());
          Object localObject1 = "";
          i7 = 0;
          while (i7 < localArrayList1.size())
          {
            if (i7 == 0) {
              paramzbt.J().a(zbxz.c(localzs1.b() * paramzbt.J().d() / n));
            }
            String str3 = "";
            if (i != 0)
            {
              if ((bool5) && (bool2))
              {
                str3 = a(paramzbt, localArrayList1.get(i7));
                localObject2 = localArrayList2.iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  localObject3 = (zgn)((Iterator)localObject2).next();
                  if (ziz.a(((zgn)localObject3).a(), localzjf.U()) == com.aspose.cells.b.a.ze.f(localArrayList1.get(i7)))
                  {
                    str2 = ((zgn)localObject3).c();
                    bool4 = ((zgn)localObject3).b();
                    str3 = zra.a(paramzbt.e().an(), localArrayList1.get(i7), str2, bool4, localzjf.U());
                    break;
                  }
                }
              }
              else
              {
                str3 = a(paramzbt, localArrayList1.get(i7));
              }
            }
            else if (bool5)
            {
              str2 = i7 < localArrayList2.size() ? ((zgn)localArrayList2.get(i7)).c() : "";
              bool4 = i7 < localArrayList2.size() ? ((zgn)localArrayList2.get(i7)).b() : false;
              if ((paramzbfd.ay()) && (!paramzbt.p)) {
                str3 = zra.a(paramzbt.e().an(), Double.valueOf(com.aspose.cells.b.a.ze.g(localArrayList1.get(i7)) * Math.pow(10.0D, paramzbt.T().f())), str1, bool3, localzjf.U());
              } else {
                str3 = zra.a(paramzbt.e().an(), localArrayList1.get(i7), str2, bool4, localzjf.U());
              }
            }
            else
            {
              str3 = a(paramzbt, localArrayList1.get(i7));
            }
            if (str3.length() > ((String)localObject1).length()) {
              localObject1 = str3;
            }
            i7 += paramzbt.H();
          }
          localzt2 = localzs1.b();
          localzt3 = ((String)localObject1).length() * localzs1.c();
          if (localzt3 > localzp.f() / 2) {
            localzt3 = localzp.f() / 2;
          }
          paramzbt.h = localzt3;
          paramzbt.i = localzt2;
        }
        else
        {
          f5 = 0.5F;
          float f6 = 0.0F;
          com.aspose.cells.b.a.b.zs localzs2 = zbvy.a(paramzr, "a", localzbwv.a());
          for (;;)
          {
            if (paramzbfd.ay())
            {
              i9 = localArrayList1.size() - 1;
              if (i9 <= 0) {
                i9 = 1;
              }
              localObject2 = zbvy.c(paramzr, "3", localzbwv.a());
              if (paramBoolean)
              {
                f6 = localzp.f() / i9;
                f6 += ((zt)localObject2).c();
              }
              else
              {
                f6 = localzp.e() / i9;
                f6 += ((zt)localObject2).b();
              }
              break;
            }
            if (paramBoolean) {
              f6 = localzp.f() / i1 * paramzbt.H();
            } else {
              f6 = localzp.e() / i1 * paramzbt.H();
            }
            if ((!paramzbt.K()) || (paramzbt.H() >= i1) || (f6 >= localzs2.c())) {
              break;
            }
            paramzbt.k(paramzbt.H() + i2);
          }
          for (int i9 = 0; i9 < localArrayList1.size(); i9++)
          {
            int i11 = localArrayList1.size() - 1 - i9;
            if (paramBoolean)
            {
              if (paramzbt.p())
              {
                if (localzbwv.e() > 0)
                {
                  localzt1.a(localzp.e() * f5);
                  localzt1.b(localzp.f() - i9 * f6 - f6 / 2.0F);
                }
                else
                {
                  localzt1.a(localzp.e() * f5);
                  localzt1.b(localzp.f() - i11 * f6 - f6 / 2.0F);
                }
              }
              else if (localzbwv.e() > 0)
              {
                localzt1.a(localzp.e() * f5);
                localzt1.b(localzp.f() - i11 * f6 - f6 / 2.0F);
              }
              else
              {
                localzt1.a(localzp.e() * f5);
                localzt1.b(localzp.f() - i9 * f6 - f6 / 2.0F);
              }
            }
            else if (paramzbt.p())
            {
              if (localzbwv.e() > 0)
              {
                localzt1.a(localzp.e() - i9 * f6 - f6 / 2.0F);
                localzt1.b(localzp.f() * f5);
              }
              else
              {
                localzt1.a(localzp.e() - i11 * f6 - f6 / 2.0F);
                localzt1.b(localzp.f() * f5);
              }
            }
            else if (localzbwv.e() > 0)
            {
              localzt1.a(localzp.e() - i11 * f6 - f6 / 2.0F);
              localzt1.b(localzp.f() * f5);
            }
            else
            {
              localzt1.a(localzp.e() - i9 * f6 - f6 / 2.0F);
              localzt1.b(localzp.f() * f5);
            }
            if (localzt1.b() < localzp.e() * f5) {
              localzt1.a(localzp.e() * f5);
            }
            if (localzt1.c() < localzp.f() * f5) {
              localzt1.b(localzp.f() * f5);
            }
            if (i9 == 0)
            {
              localzs2 = zbvy.a(paramzr, "a", localzbwv.a());
              paramzbt.J().a(localzs2.b() * paramzbt.J().d() / n);
              paramzbt.J().a(paramzbt.J().q() * 2.0F);
            }
            localObject3 = "";
            if (bool5)
            {
              str2 = i9 < localArrayList2.size() ? ((zgn)localArrayList2.get(i9)).c() : "";
              bool4 = i9 < localArrayList2.size() ? ((zgn)localArrayList2.get(i9)).b() : false;
              if ((paramzbfd.ay()) && (!paramzbt.p)) {
                localObject3 = zra.a(localzjf.an(), Double.valueOf(com.aspose.cells.b.a.ze.g(localArrayList1.get(i9)) * Math.pow(10.0D, paramzbt.T().f())), str1, bool3, localzjf.U());
              } else {
                localObject3 = zra.a(localzjf.an(), localArrayList1.get(i9), str2, bool4, localzjf.U());
              }
            }
            else
            {
              localObject3 = a(paramzbt, localArrayList1.get(i9));
            }
            com.aspose.cells.b.a.b.zs localzs4 = zbvy.a(paramzr, (String)localObject3, localzbwv.e(), localzbwv.a(), localzt1, 1, 1, localzbwv.n());
            if (localzs4.b() > localzt2) {
              localzt2 = localzs4.b();
            }
            if (localzs4.c() > localzt3) {
              localzt3 = localzs4.c();
            }
            arrayOfFloat = localzt2;
            if (paramBoolean) {
              arrayOfFloat = localzt3;
            }
            float f9;
            float f10;
            switch (paramzbt.a())
            {
            case 0: 
              if (paramzbt.p())
              {
                if (localzbwv.e() > 0)
                {
                  f9 = i11 * f6;
                  if (paramzbt.f()) {
                    f9 += f6 / 2.0F;
                  }
                  if (arrayOfFloat > f9)
                  {
                    f10 = arrayOfFloat - f9;
                    if (f10 > f2) {
                      f2 = (int)f10;
                    }
                  }
                }
                else
                {
                  f9 = i9 * f6;
                  if (paramzbt.f()) {
                    f9 += f6 / 2.0F;
                  }
                  if (arrayOfFloat > f9)
                  {
                    f10 = arrayOfFloat - f9;
                    if (f10 > f3) {
                      f3 = (int)f10;
                    }
                  }
                }
              }
              else if (localzbwv.e() > 0)
              {
                f9 = i9 * f6;
                if (paramzbt.f()) {
                  f9 += f6 / 2.0F;
                }
                if (arrayOfFloat > f9)
                {
                  f10 = arrayOfFloat - f9;
                  if (f10 > f2) {
                    f2 = (int)f10;
                  }
                }
              }
              else
              {
                f9 = i11 * f6;
                if (paramzbt.f()) {
                  f9 += f6 / 2.0F;
                }
                if (arrayOfFloat > f9)
                {
                  f10 = arrayOfFloat - f9;
                  if (f10 > f3) {
                    f3 = (int)f10;
                  }
                }
              }
              break;
            case 3: 
              if (paramzbt.p())
              {
                if (localzbwv.e() < 0)
                {
                  f9 = i11 * f6;
                  if (paramzbt.f()) {
                    f9 += f6 / 2.0F;
                  }
                  if (arrayOfFloat > f9)
                  {
                    f10 = arrayOfFloat - f9;
                    if (f10 > f2) {
                      f2 = (int)f10;
                    }
                  }
                }
                else
                {
                  f9 = i9 * f6;
                  if (paramzbt.f()) {
                    f9 += f6 / 2.0F;
                  }
                  if (arrayOfFloat > f9)
                  {
                    f10 = arrayOfFloat - f9;
                    if (f10 > f3) {
                      f3 = (int)f10;
                    }
                  }
                }
              }
              else if (localzbwv.e() < 0)
              {
                f9 = i9 * f6;
                if (paramzbt.f()) {
                  f9 += f6 / 2.0F;
                }
                if (paramzbt.f()) {
                  f9 += f6 / 2.0F;
                }
                if (arrayOfFloat > f9)
                {
                  f10 = arrayOfFloat - f9;
                  if (f10 > f2) {
                    f2 = (int)f10;
                  }
                }
              }
              else
              {
                f9 = i11 * f6;
                if (paramzbt.f()) {
                  f9 += f6 / 2.0F;
                }
                if (arrayOfFloat > f9)
                {
                  f10 = arrayOfFloat - f9;
                  if (f10 > f3) {
                    f3 = (int)f10;
                  }
                }
              }
              break;
            case 1: 
              if (paramzbt.p())
              {
                if (localzbwv.e() > 0)
                {
                  f9 = i11 * f6;
                  if (paramzbt.f()) {
                    f9 += f6 / 2.0F;
                  }
                  if (arrayOfFloat > f9)
                  {
                    f10 = arrayOfFloat - f9;
                    if (f10 > f2) {
                      f2 = (int)f10;
                    }
                  }
                }
                else
                {
                  f9 = i9 * f6;
                  if (paramzbt.f()) {
                    f9 += f6 / 2.0F;
                  }
                  if (arrayOfFloat > f9)
                  {
                    f10 = arrayOfFloat - f9;
                    if (f10 > f3) {
                      f3 = (int)f10;
                    }
                  }
                }
              }
              else if (localzbwv.e() > 0)
              {
                f9 = i9 * f6;
                if (paramzbt.f()) {
                  f9 += f6 / 2.0F;
                }
                if (arrayOfFloat > f9)
                {
                  f10 = arrayOfFloat - f9;
                  if (f10 > f2) {
                    f2 = (int)f10;
                  }
                }
              }
              else
              {
                f9 = i11 * f6;
                if (paramzbt.f()) {
                  f9 += f6 / 2.0F;
                }
                if (arrayOfFloat > f9)
                {
                  f10 = arrayOfFloat - f9;
                  if (f10 > f3) {
                    f3 = (int)f10;
                  }
                }
              }
              break;
            case 2: 
              if (paramzbt.p())
              {
                if (localzbwv.e() < 0)
                {
                  f9 = i11 * f6;
                  if (paramzbt.f()) {
                    f9 += f6 / 2.0F;
                  }
                  if (arrayOfFloat > f9)
                  {
                    f10 = arrayOfFloat - f9;
                    if (f10 > f2) {
                      f2 = (int)f10;
                    }
                  }
                }
                else
                {
                  f9 = i9 * f6;
                  if (paramzbt.f()) {
                    f9 += f6 / 2.0F;
                  }
                  if (arrayOfFloat > f9)
                  {
                    f10 = arrayOfFloat - f9;
                    if (f10 > f3) {
                      f3 = (int)f10;
                    }
                  }
                }
              }
              else if (localzbwv.e() < 0)
              {
                f9 = i9 * f6;
                if (paramzbt.f()) {
                  f9 += f6 / 2.0F;
                }
                if (arrayOfFloat > f9)
                {
                  f10 = arrayOfFloat - f9;
                  if (f10 > f2) {
                    f2 = (int)f10;
                  }
                }
              }
              else
              {
                f9 = i11 * f6;
                if (paramzbt.f()) {
                  f9 += f6 / 2.0F;
                }
                if (arrayOfFloat > f9)
                {
                  f10 = arrayOfFloat - f9;
                  if (f10 > f3) {
                    f3 = (int)f10;
                  }
                }
              }
              break;
            }
          }
          paramzbt.i = localzt2;
          paramzbt.h = localzt3;
        }
      }
    }
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList2.size() > 0))
    {
      f5 = 0.0F;
      if (paramzbfd.ay())
      {
        i6 = localArrayList1.size() - 1;
        if (i6 <= 0) {
          i6 = 1;
        }
        if (paramBoolean) {
          f5 = localzp.f() / i6;
        } else {
          f5 = localzp.e() / i6;
        }
      }
      else if (paramBoolean)
      {
        f5 = localzp.f() / i1;
      }
      else
      {
        f5 = localzp.e() / i1;
      }
      int i6 = 0;
      if (paramBoolean) {
        i6 = 90;
      }
      for (int i8 = 0; i8 < arrayOfArrayList.length; i8++)
      {
        ArrayList localArrayList3 = arrayOfArrayList[i8];
        if (paramBoolean)
        {
          localzt1.b(localzp.f() / localArrayList3.size());
          localzt1.a(localzp.e() * 0.5F);
        }
        else
        {
          localzt1.a(localzp.e() / localArrayList3.size());
          localzt1.b(localzp.f() * 0.5F);
        }
        com.aspose.cells.b.a.b.zs localzs3 = a(paramzr, localArrayList3, i6, localzbwv, localzt1, f5);
        if (paramBoolean) {
          localzt2 += localzs3.b();
        } else {
          localzt3 += localzs3.c();
        }
      }
    }
    paramzbt.f = localzt2;
    paramzbt.g = localzt3;
    if (a(paramzbt, paramzbfd))
    {
      if (paramBoolean) {
        paramzbt.j = (localzt3 / 2.0F);
      } else {
        paramzbt.j = (localzt2 / 2.0F);
      }
      paramzbt.k = paramzbt.j;
    }
    else if (b(paramzbt, paramzbfd))
    {
      if (paramBoolean) {
        f5 = localzp.f() / i1;
      } else {
        f5 = localzp.e() / i1;
      }
      float f7 = 0.0F;
      if (paramBoolean) {
        f7 = (localzt3 - f5) / 2.0F;
      } else {
        f7 = (localzt2 - f5) / 2.0F;
      }
      if (f7 > 0.0F)
      {
        paramzbt.j = (f7 + 2.0F);
        paramzbt.k = (f7 + 2.0F);
      }
    }
    else if (c(paramzbt, paramzbfd))
    {
      paramzbt.j = f2;
      paramzbt.k = f3;
    }
    else if (i4 != 0)
    {
      paramzbt.j = f2;
      paramzbt.k = f3;
    }
    return new com.aspose.cells.b.a.b.zs(localzt2, localzt3);
  }
  
  private static String a(zbt paramzbt, ArrayList paramArrayList1, boolean paramBoolean, ArrayList paramArrayList2, zbfd paramzbfd, zbwv paramzbwv)
  {
    zjf localzjf = paramzbt.e();
    String str1 = paramzbfd.F().a(0).u();
    boolean bool1 = paramzbfd.F().a(0).v();
    com.aspose.cells.b.a.g.a.ze localze = new com.aspose.cells.b.a.g.a.ze("\\s+");
    Object localObject1 = "";
    float f1 = 0.0F;
    int i = 0;
    while (i < paramArrayList1.size())
    {
      String str2 = "";
      if (paramBoolean)
      {
        localObject2 = i < paramArrayList2.size() ? ((zgn)paramArrayList2.get(i)).c() : "";
        boolean bool2 = i < paramArrayList2.size() ? ((zgn)paramArrayList2.get(i)).b() : false;
        if (paramzbfd.ay()) {
          str2 = zra.a(localzjf.an(), Double.valueOf(com.aspose.cells.b.a.ze.g(paramArrayList1.get(i)) * Math.pow(10.0D, paramzbt.T().f())), str1, bool1, localzjf.U());
        } else {
          str2 = zra.a(localzjf.an(), paramArrayList1.get(i), (String)localObject2, bool2, localzjf.U());
        }
      }
      else
      {
        str2 = a(paramzbt, paramArrayList1.get(i));
      }
      Object localObject2 = localze.c(str2);
      float f2 = 0.0F;
      String str3 = "";
      for (int j = 0; j < localObject2.length; j++)
      {
        zt localzt = zbxz.a(zbvy.a(localzjf.ap(), localObject2[j], paramzbwv.a()));
        if (localzt.b() > f2)
        {
          f2 = localzt.b();
          str3 = localObject2[j];
        }
      }
      if (f2 > f1)
      {
        f1 = f2;
        localObject1 = str3;
      }
      i += paramzbt.H();
    }
    return (String)localObject1;
  }
  
  private static int a(zbt paramzbt, int paramInt)
  {
    zjf localzjf = paramzbt.e();
    boolean bool = false;
    ArrayList localArrayList;
    ArrayList[] arrayOfArrayList;
    if (paramzbt.g() == 0)
    {
      localArrayList = localzjf.z().c();
      arrayOfArrayList = localzjf.z().e();
      bool = localzjf.z().a;
    }
    else
    {
      localArrayList = localzjf.z().d();
      arrayOfArrayList = localzjf.z().g();
      bool = localzjf.z().b;
    }
    if (!bool) {
      return 1;
    }
    if (localArrayList.size() == 1) {
      return paramInt;
    }
    int i = 1;
    int j = Integer.MAX_VALUE;
    float f1 = 0.0F;
    float f2 = 0.0F;
    int k = 1;
    for (int m = 0; m < localArrayList.size(); m++)
    {
      zgn localzgn = (zgn)localArrayList.get(m);
      if ((localzgn.a() == null) || (localzgn.a().equals("")))
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
  
  static boolean a(zbt paramzbt, zbfd paramzbfd)
  {
    if ((!paramzbt.q()) || (paramzbt.I() == 3)) {
      return false;
    }
    if ((paramzbt.J().e() != 0) && (Math.abs(paramzbt.J().e()) != 90)) {
      return false;
    }
    if ((paramzbt.g() == 1) || (paramzbt.g() == 3) || (paramzbfd.ai() == 60) || (paramzbfd.ai() == 12)) {
      return true;
    }
    return (!paramzbt.f()) && (paramzbfd.ai() != 57) && (paramzbfd.ai() != 59);
  }
  
  static boolean b(zbt paramzbt, zbfd paramzbfd)
  {
    if ((!paramzbt.q()) || (paramzbt.I() == 3)) {
      return false;
    }
    if ((paramzbt.g() == 1) || (paramzbt.g() == 3) || (paramzbfd.ai() == 60) || (paramzbfd.ai() == 12)) {
      return false;
    }
    return (paramzbt.f()) && (paramzbt.J().e() == 0) && (paramzbfd.ai() != 57) && (paramzbfd.ai() != 59);
  }
  
  static boolean c(zbt paramzbt, zbfd paramzbfd)
  {
    if ((!paramzbt.q()) || (paramzbt.I() == 3)) {
      return false;
    }
    if (a(paramzbt, paramzbfd)) {
      return false;
    }
    return ((paramzbt.g() == 0) || (paramzbt.g() == 2)) && (paramzbfd.ai() != 57) && (paramzbfd.ai() != 59) && (Math.abs(paramzbt.J().e()) != 90) && (paramzbt.J().e() != 0);
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, List paramList, int paramInt, zbwv paramzbwv, zt paramzt, double paramDouble)
  {
    zjf localzjf = paramzbwv.g().e();
    paramzt.a(paramzt.b() + 4.0F);
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramList.size(); k++)
    {
      zgn localzgn = (zgn)paramList.get(k);
      String str = zra.a(localzjf.an(), localzgn.a(), localzgn.c(), localzgn.b(), localzjf.U());
      int m = a(localzgn);
      zt localzt = new zt(paramzt.b(), paramzt.c());
      float f1 = (float)(m * paramDouble);
      float f2 = zbvy.a(paramzr, str, paramzbwv.a(), true);
      if ((f1 < localzt.b()) && (f1 > f2)) {
        localzt.a(f1);
      }
      com.aspose.cells.b.a.b.zs localzs = zbvy.a(paramzr, str, paramInt, paramzbwv.a(), localzt, 1, 1, paramzbwv.n());
      if (localzs.b() > i) {
        i = localzs.b();
      }
      if (localzs.c() > j) {
        j = localzs.c();
      }
    }
    return new com.aspose.cells.b.a.b.zs(i, j);
  }
  
  static void b(zr paramzr, zbt paramzbt, zbfd paramzbfd, boolean paramBoolean)
  {
    if ((paramzbt.I() == 3) || (paramzbt.l.size() == 0)) {
      return;
    }
    zjf localzjf = paramzbt.e();
    zkf localzkf = paramzbfd.F().b(0);
    int i = paramzbfd.ai();
    zbwv localzbwv = paramzbt.J();
    String str1 = localzkf != null ? localzkf.A() : "";
    boolean bool1 = localzkf != null ? localzkf.B() : true;
    boolean bool2 = false;
    if ((localzbwv.c()) && (localzkf != null)) {
      bool2 = true;
    }
    int j = 0;
    int k = 0;
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    int m = zbxz.g(d1);
    for (int n = 0; n < paramzbt.l.size(); n++) {
      if ((n == 0) || (n == paramzbt.l.size() - 1))
      {
        double d2 = com.aspose.cells.b.a.ze.g(paramzbt.l.get(n));
        String str2 = a(paramzbt, d2, m, i, str1, bool2, bool1);
        com.aspose.cells.b.a.b.zs localzs = zbvy.a(paramzbt.e().ap(), str2, localzbwv.e(), localzbwv.a(), paramzbt.e().B().b.b(), 1, 1, localzbwv.n());
        if (n == 0) {
          if (paramBoolean) {
            k = localzs.b() / 2;
          } else {
            j = localzs.c() / 2;
          }
        }
        if (n == paramzbt.l.size() - 1) {
          if (paramBoolean) {
            j = localzs.b() / 2;
          } else {
            k = localzs.c() / 2;
          }
        }
      }
    }
    if (paramzbt.p())
    {
      n = j;
      j = k;
      k = n;
    }
    paramzbt.j = j;
    paramzbt.k = k;
  }
  
  private static String a(zbt paramzbt, double paramDouble, int paramInt1, int paramInt2, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramInt1 < 15) {
      paramDouble = zbxz.a(paramDouble, paramInt1);
    }
    zjf localzjf = paramzbt.e();
    double d = paramzbt.n() ? paramzbt.h(paramDouble) : paramDouble;
    if (paramzbt.af()) {
      paramString = "0%";
    }
    String str = "";
    d = paramzbt.n() ? d : d * Math.pow(10.0D, paramzbt.T().f());
    if (paramBoolean1) {
      str = zra.a(paramzbt.e().an(), Double.valueOf(d), paramString, paramBoolean2, localzjf.U());
    } else {
      str = a(paramzbt, Double.valueOf(d));
    }
    return str;
  }
  
  static DateTime a(double paramDouble, boolean paramBoolean)
  {
    return zbxz.a(paramDouble, paramBoolean);
  }
  
  static int a(DateTime paramDateTime, boolean paramBoolean)
  {
    return (int)zbxz.a(paramDateTime, paramBoolean);
  }
  
  static String a(zbt paramzbt, Object paramObject)
  {
    String str1 = paramzbt.J().b();
    boolean bool = paramzbt.J().j();
    String str2 = "";
    zjf localzjf = paramzbt.e();
    if (((paramzbt.g() == 0) || (paramzbt.g() == 2)) && (paramzbt.k() == 2))
    {
      DateTime localDateTime = a(com.aspose.cells.b.a.ze.f(paramObject), paramzbt.e().U());
      if (!"".equals(str1)) {
        try
        {
          zgy.a(paramzbt.e().an(), localDateTime, str1, localzjf.U());
        }
        catch (Exception localException)
        {
          if (paramzbt.j() == 1) {
            str1 = "M/d/yyyy";
          } else if (paramzbt.j() == 2) {
            str1 = "MMM-yy";
          } else {
            str1 = "yyyy";
          }
        }
      } else if (paramzbt.j() == 1) {
        str1 = "M/d/yyyy";
      } else if (paramzbt.j() == 2) {
        str1 = "MMM-yy";
      } else {
        str1 = "yyyy";
      }
      if (com.aspose.cells.b.a.ze.f(paramObject) == 60)
      {
        str2 = zgy.a(paramzbt.e().an(), paramObject, str1);
        if ((str1.indexOf("d") >= 0) && (str2.indexOf("28") >= 0)) {
          str2 = zw.a(str2, "28", "29");
        }
      }
      else
      {
        str2 = zgy.a(paramzbt.e().an(), localDateTime, str1, localzjf.U());
      }
    }
    else
    {
      if ((paramzbt.x) && (paramObject != null)) {
        return com.aspose.cells.b.a.zs.a(paramObject);
      }
      str2 = zra.a(paramzbt.e().an(), paramObject, str1, bool, localzjf.U());
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
      } else if ((paramInt2 == 1) || (paramInt2 == 2)) {
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
  
  static int a(zagy paramzagy)
  {
    int i = 0;
    if ((paramzagy.d() == null) || (paramzagy.d().getCount() == 0)) {
      return 1;
    }
    for (int j = 0; j < paramzagy.d().getCount(); j++) {
      i += a(paramzagy.d().a(j));
    }
    return i;
  }
  
  private static void a(zr paramzr, ArrayList[] paramArrayOfArrayList, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean1, zbt paramzbt, double paramDouble, zbwv paramzbwv, int paramInt, float paramFloat4, zp paramzp, boolean paramBoolean2)
  {
    zjf localzjf = paramzbwv.g().e();
    int i = 0;
    float f1 = paramFloat2;
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
      com.aspose.cells.b.a.b.zs localzs = a(paramzr, localArrayList, i, paramzbwv, localzt, paramDouble);
      float f2 = paramFloat1;
      for (int k = 0; k < localArrayList.size(); k++)
      {
        zgn localzgn = (zgn)localArrayList.get(k);
        String str = zra.a(localzjf.an(), localzgn.a(), localzgn.c(), localzgn.b(), localzjf.U());
        int m = a(localzgn);
        float f3 = (float)(m * paramDouble);
        float f4;
        if (!paramzbt.p()) {
          f4 = f2;
        } else {
          f4 = f2 - f3;
        }
        float f5 = paramBoolean1 ? f1 : f1 - localzs.c();
        zq localzq = new zq(f4, f5, f3, localzs.c());
        float f6 = zbvy.a(paramzr, str, paramzbwv.a(), true);
        if (f3 < f6)
        {
          localzq.a(localzq.f() - (localzt.b() - f3) / 2.0F);
          localzq.c(localzt.b());
        }
        b(paramzr, zp.a(localzq), str, i, paramzbwv.a(), paramzbwv.i(), 1, paramInt);
        paramzbt.m().a(f2, paramFloat4, f2, f1);
        if (paramzbt.E() != 2)
        {
          float f7 = paramBoolean1 ? f1 + (paramFloat3 + localzs.c()) : f1 - (paramFloat3 + localzs.c());
          a(paramzr, localzgn.d(), f2, paramFloat4, f7, paramBoolean1, paramzbt, paramDouble);
        }
        if (!paramzbt.p()) {
          f2 += f3;
        } else {
          f2 -= f3;
        }
      }
      paramzbt.m().a(f2, paramFloat4, f2, f1);
      if (paramBoolean1) {
        f1 += paramFloat3 + localzs.c();
      } else {
        f1 -= paramFloat3 + localzs.c();
      }
    }
  }
  
  private static void a(zr paramzr, zagz paramzagz, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean, zbt paramzbt, double paramDouble)
  {
    float f1 = paramFloat1;
    for (int i = 0; i < paramzagz.getCount(); i++)
    {
      zgn localzgn = (zgn)paramzagz.a(i);
      int j = a(localzgn);
      float f2 = (float)(j * paramDouble);
      if (!paramzbt.p()) {
        f1 += f2;
      } else {
        f1 -= f2;
      }
      paramzbt.m().a(f1, paramFloat2, f1, paramFloat3);
    }
  }
  
  static zbt a(zbt paramzbt)
  {
    zbt localzbt = null;
    if (paramzbt.g() == 0) {
      localzbt = paramzbt.e().G();
    } else if (paramzbt.g() == 2) {
      localzbt = paramzbt.e().I();
    } else if (paramzbt.g() == 1) {
      localzbt = paramzbt.e().e();
    } else if (paramzbt.g() == 3) {
      localzbt = paramzbt.e().g();
    }
    return localzbt;
  }
  
  public static void a(zr paramzr, zp paramzp, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3)
  {
    a(paramzr, paramzp, paramString, paramInt1, paramzg, paramColor, paramInt2, paramInt3, null);
  }
  
  public static void a(zr paramzr, zp paramzp, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3, zv paramzv)
  {
    zv localzv;
    if (paramzv == null) {
      localzv = new zv();
    } else {
      localzv = new zv(paramzv);
    }
    localzv.a(zbvy.a(paramInt2));
    localzv.c(zbvy.a(paramInt3));
    zf localzf = null;
    switch (Math.abs(paramInt1))
    {
    case 0: 
      paramzr.a(paramString, paramzg, new zu(paramColor), paramzp, localzv);
      break;
    case 90: 
      localzf = paramzr.d();
      paramzr.b(paramzp.g() + paramzp.e() / 2, paramzp.h() + paramzp.f() / 2);
      paramzr.a(-paramInt1);
      paramzp = new zp(-paramzp.f() / 2, -paramzp.e() / 2, paramzp.f(), paramzp.e());
      paramzr.a(paramString, paramzg, new zu(paramColor), paramzp, localzv);
      paramzr.a(localzf);
      break;
    default: 
      localzf = paramzr.d();
      double d = Math.sqrt(Math.pow(paramzp.e(), 2.0D) + Math.pow(paramzp.f(), 2.0D));
      localzv.b(4096);
      zt localzt = paramzr.a(paramString, paramzg, (int)d, localzv);
      paramzr.b(paramzp.g() + paramzp.e() / 2, paramzp.h() + paramzp.f() / 2);
      paramzr.a(-paramInt1);
      zq localzq = new zq(-localzt.b() / 2.0F, -localzt.c() / 2.0F, localzt.b(), localzt.c());
      paramzr.a(paramString, paramzg, new zu(paramColor), localzq, localzv);
      paramzr.a(localzf);
    }
  }
  
  public static void b(zr paramzr, zp paramzp, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(paramzr, localzq, paramString, paramInt1, paramzg, paramColor, paramInt2, paramInt3);
  }
  
  public static void a(zr paramzr, zq paramzq, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3)
  {
    zv localzv = new zv(zv.c());
    localzv.a(zbvy.a(paramInt2));
    localzv.c(zbvy.a(paramInt3));
    zf localzf = null;
    switch (Math.abs(paramInt1))
    {
    case 0: 
      paramzr.a(paramString, paramzg, new zu(paramColor), paramzq, localzv);
      break;
    case 90: 
      localzf = paramzr.d();
      paramzr.b(paramzq.j() + paramzq.h() / 2.0F, paramzq.k() + paramzq.i() / 2.0F);
      paramzr.a(-paramInt1);
      paramzq = new zq(-paramzq.i() / 2.0F, -paramzq.h() / 2.0F, paramzq.i(), paramzq.h());
      localzv.d(3);
      paramzr.a(paramString, paramzg, new zu(paramColor), paramzq, localzv);
      paramzr.a(localzf);
      break;
    default: 
      localzf = paramzr.d();
      double d = Math.sqrt(Math.pow(paramzq.h(), 2.0D) + Math.pow(paramzq.i(), 2.0D));
      localzv.b(4096);
      zt localzt = paramzr.a(paramString, paramzg, (int)d, localzv);
      paramzr.b(paramzq.j() + paramzq.h() / 2.0F, paramzq.k() + paramzq.i() / 2.0F);
      paramzr.a(-paramInt1);
      zq localzq = new zq(-localzt.b() / 2.0F, -localzt.c() / 2.0F, localzt.b(), localzt.c());
      paramzr.a(paramString, paramzg, new zu(paramColor), localzq, localzv);
      paramzr.a(localzf);
    }
  }
  
  static void a(zr paramzr, String paramString, zo paramzo, zt paramzt, int paramInt1, zg paramzg, Color paramColor, int paramInt2)
    throws Exception
  {
    zf localzf = paramzr.d();
    zu localzu = new zu(paramColor);
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
    paramzr.a(localzf);
  }
  
  static void a(zr paramzr, String paramString, zo paramzo, zt paramzt, int paramInt1, zg paramzg, Color paramColor, int paramInt2, zbwv paramzbwv)
    throws Exception
  {
    zf localzf = paramzr.d();
    zu localzu = new zu(paramColor);
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
    f2 = localzt.b();
    float f3 = (float)(localzt.c() * Math.sin(d)) / 2.0F;
    paramzr.b(paramzo.d(), paramzo.e());
    paramzr.a(-paramInt1);
    zq localzq = zq.c();
    if (paramInt2 == 0)
    {
      if (paramInt1 > 0)
      {
        localzq = new zq(-f2, 0.0F, f2, localzt.c());
        localzv.a(2);
        paramzr.b(-f3, 0.0F);
      }
      else
      {
        localzq = new zq(0.0F, 0.0F, f2, localzt.c());
        localzv.a(0);
        paramzr.b(f3, 0.0F);
      }
      localzq.b(localzq.g() - localzt.c() / 2.0F);
    }
    else if (paramInt2 == 3)
    {
      if (paramInt1 < 0)
      {
        localzq = new zq(-f2, 0.0F, f2, localzt.c());
        localzv.a(2);
        paramzr.b(-f3, 0.0F);
      }
      else
      {
        localzq = new zq(0.0F, 0.0F, f2, localzt.c());
        localzv.a(0);
        paramzr.b(f3, 0.0F);
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
    localzq.c(localzq.h() + 5.0F);
    boolean bool = zbxz.b(paramString);
    ArrayList localArrayList = zbxz.a(paramString, paramzbwv.f(), paramzbwv.h(), false);
    int i = 1;
    int j = 1;
    zbda localzbda = new zbda();
    zbxz.a(localArrayList, localzbda, paramzbwv.a(), paramzbwv.i(), new zzo());
    zbcw localzbcw = new zbcw();
    localzbcw.a(zbvy.a(i));
    localzbcw.b(zbvy.a(j));
    zbde localzbde = new zbde(localzq, localzbcw, localzbda, paramzbwv.a(), bool);
    localzbde.b(paramzr, paramzbwv.g().e().at());
    paramzr.a(localzf);
  }
  
  static void a(zjf paramzjf)
    throws Exception
  {
    if (paramzjf.B().E()) {
      return;
    }
    int i = 0;
    if (paramzjf.G().D() == paramzjf.G().l()) {
      i = 1;
    }
    if (paramzjf.p() < 0) {
      if (i != 0)
      {
        paramzjf.e().j(3);
        paramzjf.K().j(3);
        paramzjf.e().d(false);
        paramzjf.K().d(false);
      }
      else if ((paramzjf.e().I() == 1) || (!paramzjf.G().p()))
      {
        paramzjf.e().j(3);
        paramzjf.K().j(3);
      }
    }
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, zbt paramzbt, zp paramzp)
  {
    ArrayList localArrayList = paramzbt.l;
    if ((paramzbt.I() == 3) || (localArrayList.size() == 0) || (paramzbt.e().p() < 0)) {
      return new com.aspose.cells.b.a.b.zs(0, 0);
    }
    zbwv localzbwv = paramzbt.J();
    int i = 250;
    com.aspose.cells.b.a.b.zs localzs1 = zbvy.a(paramzbt.e().ap(), "a", localzbwv.e(), localzbwv.a(), paramzp.b(), 1, 1, localzbwv.n());
    paramzbt.J().a(localzs1.b() * paramzbt.J().d() / i);
    zt localzt = new zt(0.0F, 0.0F);
    zjf localzjf = paramzbt.e();
    int j = localArrayList.size();
    zo[] arrayOfzo = zjb.d(localzjf);
    float f = 0.0F;
    if (arrayOfzo[0].e() == arrayOfzo[1].e())
    {
      localzt.a(Math.abs((arrayOfzo[1].d() - arrayOfzo[0].d()) / j));
      if ((localzjf.p() == 0) && (localzt.b() < 40.0F)) {
        localzt.a(40.0F);
      }
      localzt.b(paramzp.f() * 0.5F);
    }
    else
    {
      f = Math.abs(arrayOfzo[1].e() - arrayOfzo[0].e()) / localArrayList.size();
      localzt.a(paramzp.e() * 0.5F);
      localzt.b(f * paramzbt.H());
      if (paramzbt.K()) {
        while ((localzt.c() < localzs1.c()) && (paramzbt.G().e() == 0) && (paramzbt.H() < localArrayList.size()))
        {
          paramzbt.k(paramzbt.H() + 1);
          localzt.b(f * paramzbt.H());
        }
      }
    }
    int k = 0;
    int m = 0;
    for (int n = 0; n < localArrayList.size(); n++)
    {
      String str = "";
      str = a(paramzbt, paramzbt.l.get(n));
      com.aspose.cells.b.a.b.zs localzs2 = zbvy.a(paramzr, str, localzbwv.e(), localzbwv.a(), localzt, 1, 1, localzbwv.n());
      if (localzs2.b() > k) {
        k = localzs2.b();
      }
      if (localzs2.c() > m) {
        m = localzs2.c();
      }
    }
    paramzbt.f = k;
    paramzbt.g = m;
    return new com.aspose.cells.b.a.b.zs(k, m);
  }
  
  static void a(zr paramzr, zbt paramzbt)
    throws Exception
  {
    if (paramzbt.e().B().E()) {
      return;
    }
    zjf localzjf = paramzbt.e();
    int i = localzjf.N();
    zbyv localzbyv = localzjf.S();
    zo localzo = zjb.e(localzjf);
    paramzbt.m().a(localzo.d(), localzo.e(), localzo.d(), localzo.e() - localzbyv.i());
    zbwv localzbwv = paramzbt.J();
    zbfd localzbfd = localzjf.z().c(0);
    zkf localzkf = localzbfd.F().b(0);
    String str1 = localzkf != null ? localzkf.A() : "";
    boolean bool = localzkf != null ? localzkf.B() : true;
    int j = 0;
    if ((localzbwv.c()) && (localzkf != null)) {
      j = 1;
    }
    float f1 = 0.0F;
    int k = 8;
    if (localzo.d() > localzjf.S().j())
    {
      k = 7;
      f1 = localzo.d();
      f1 += paramzbt.aa();
      f1 += paramzbt.ac();
    }
    else
    {
      f1 = localzo.d() - paramzbt.f;
      f1 -= paramzbt.aa();
      f1 -= paramzbt.ac();
    }
    ArrayList localArrayList = paramzbt.l;
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    for (int m = 0; m < paramzbt.l.size(); m++)
    {
      double d4 = ((Double)paramzbt.l.get(m)).doubleValue();
      double d5 = paramzbt.n() ? paramzbt.h(d4) : d4;
      if (m - 1 > 0 ? Math.abs(zbxz.b(d3, Math.abs(zbxz.b(com.aspose.cells.b.a.ze.g(localArrayList.get(m)), com.aspose.cells.b.a.ze.g(localArrayList.get(m - 1)))))) / d3 > b : (m + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d3, Math.abs(zbxz.b(com.aspose.cells.b.a.ze.g(localArrayList.get(m)), com.aspose.cells.b.a.ze.g(localArrayList.get(m + 1)))))) / d3 <= b))
      {
        float f2 = (float)((d4 - d2) / (d1 - d2) * localzjf.S().i());
        if (!paramzbt.p()) {
          f2 = localzo.e() - f2;
        } else {
          f2 = localzo.e() - localzbyv.i() + f2;
        }
        if (paramzbt.I() != 3)
        {
          if (paramzbt.af()) {
            str1 = "0%";
          }
          String str2 = "";
          d5 = paramzbt.n() ? d5 : d5 * Math.pow(10.0D, paramzbt.T().f());
          Color localColor = localzbwv.i();
          if (j != 0)
          {
            str2 = zra.a(localzjf.an(), Double.valueOf(d5), str1, bool, localzjf.U());
            localColor = zra.a(Double.valueOf(d5), str1, localColor);
          }
          else
          {
            str2 = a(paramzbt, Double.valueOf(d5));
            localColor = zra.a(Double.valueOf(d5), localzbwv.b(), localColor);
          }
          zq localzq = new zq(f1, f2 - paramzbt.g / 2.0F, paramzbt.f, paramzbt.g);
          a(paramzr, zp.a(localzq), str2, localzbwv.e(), localzbwv.a(), localColor, k, 1, zv.c());
        }
        a(paramzr, paramzbt, localzo.d(), f2);
      }
    }
    a(paramzr, paramzbt, localzo.d(), localzo.e() - localzbyv.i(), localzo.e());
  }
  
  private static void a(zr paramzr, zbt paramzbt, float paramFloat1, float paramFloat2)
  {
    if ((paramzbt.E() == 2) || (!paramzbt.m().h())) {
      return;
    }
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    int i = 0;
    int j = 0;
    switch (paramzbt.E())
    {
    case 1: 
      i = 1;
      if (paramFloat1 > localzjf.S().j())
      {
        i = 0;
        j = 1;
      }
      break;
    case 3: 
      j = 1;
      if (paramFloat1 > localzjf.S().j())
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
      paramzbt.m().a(paramFloat1, paramFloat2, paramFloat1 + paramzbt.aa(), paramFloat2);
    }
    if (j != 0) {
      paramzbt.m().a(paramFloat1 - paramzbt.aa(), paramFloat2, paramFloat1, paramFloat2);
    }
  }
  
  private static void a(zr paramzr, zbt paramzbt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if ((paramzbt.F() == 2) || (!paramzbt.m().h())) {
      return;
    }
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    int i = 0;
    int j = 0;
    switch (paramzbt.F())
    {
    case 1: 
      i = 1;
      if (paramFloat1 > localzjf.S().j())
      {
        i = 0;
        j = 1;
      }
      break;
    case 3: 
      j = 1;
      if (paramFloat1 > localzjf.S().j())
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
    float f2 = (float)(paramzbt.B() / (paramzbt.z() - paramzbt.D()) * (paramFloat3 - paramFloat2));
    float f1;
    if (!paramzbt.p())
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
        paramzbt.m().a(paramFloat1, f3, paramFloat1 + paramzbt.ab(), f3);
      }
      if (j != 0) {
        paramzbt.m().a(paramFloat1 - paramzbt.ab(), f3, paramFloat1, f3);
      }
      f3 += f2;
    } while ((paramFloat2 <= f3) && (f3 <= paramFloat3));
  }
  
  static void a(zr paramzr, zbt paramzbt, int paramInt, zp paramzp, boolean paramBoolean)
    throws Exception
  {
    if (paramzbt.e().B().E()) {
      return;
    }
    if (paramzbt.k() == 2)
    {
      d(paramzr, paramzbt);
      return;
    }
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    zo[] arrayOfzo = zjb.c(localzjf);
    zbt localzbt = localzjf.G();
    double d1 = localzbt.V();
    double d2 = localzbt.W();
    double d3 = localzbt.X();
    int i = 0;
    if (localzbt.D() == localzbt.l()) {
      i = 1;
    }
    if (localzbt.p()) {
      d3 = d1 - d3;
    } else {
      d3 -= d2;
    }
    int j = (int)(d3 / (d1 - d2) * localzjf.S().i());
    if (j != 0) {
      paramzbt.m().a(arrayOfzo[0].d(), arrayOfzo[0].e() - j, arrayOfzo[1].d(), arrayOfzo[1].e() - j);
    }
    if (localzjf.p() >= 0) {
      paramzbt.m().a(arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[1].d(), arrayOfzo[1].e());
    }
    if (paramzbt.I() == 2)
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - j);
      arrayOfzo[1].b(arrayOfzo[1].e() - j);
    }
    zbff localzbff = localzjf.z();
    zbwv localzbwv = paramzbt.J();
    ArrayList localArrayList = localzjf.z().c();
    float f1 = paramzbt.J().q();
    if (paramzbt.I() != 3) {
      f1 += paramzbt.aa() + paramzbt.ab();
    }
    int k = (paramzbt.f()) || (localzjf.u()) ? 1 : 0;
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
    double d5 = 180.0D * d4 / 3.141592653589793D;
    float f2 = (arrayOfzo[1].d() - arrayOfzo[0].d()) / m;
    float f3 = (arrayOfzo[1].e() - arrayOfzo[0].e()) / m;
    zo localzo = zo.a();
    Object localObject1;
    Object localObject2;
    int i6;
    for (int n = 0; n < paramInt; n++)
    {
      int i1 = n;
      if (paramzbt.p()) {
        i1 = paramInt - 1 - n;
      }
      String str1 = "";
      Color localColor = localzbwv.i();
      boolean bool2;
      if (i1 < paramzbt.l.size())
      {
        str1 = a(paramzbt, paramzbt.l.get(i1));
        localColor = zra.a(paramzbt.l.get(i1), localzbwv.b(), localColor);
        if ((localzbwv.c()) && (localArrayList.size() > 0))
        {
          localObject1 = "";
          bool2 = false;
          localObject1 = i1 < localArrayList.size() ? ((zgn)localArrayList.get(i1)).c() : "";
          bool2 = i1 < localArrayList.size() ? ((zgn)localArrayList.get(i1)).b() : false;
          str1 = zra.a(localzjf.an(), paramzbt.l.get(i1), (String)localObject1, bool2, localzjf.U());
          localColor = zra.a(paramzbt.l.get(i1), (String)localObject1, localColor);
        }
      }
      if ((paramzbt.I() != 3) && (i1 % paramzbt.H() == 0))
      {
        localObject1 = new zq(0.0F, 0.0F, 0.0F, 0.0F);
        bool2 = false;
        if (k != 0)
        {
          if (localzjf.p() >= 0)
          {
            if (arrayOfzo[0].e() == arrayOfzo[1].e())
            {
              ((zq)localObject1).a(f2 < 0.0F ? arrayOfzo[0].d() + (n + 1) * f2 : arrayOfzo[0].d() + n * f2);
              ((zq)localObject1).b(arrayOfzo[0].e() + f1);
              ((zq)localObject1).c(Math.abs(f2 * paramzbt.H()));
              ((zq)localObject1).d(paramzbt.h);
              bool2 = true;
              localzo.a(f2 < 0.0F ? ((zq)localObject1).f() - f2 / 2.0F : ((zq)localObject1).f() + f2 * paramzbt.H() / 2.0F);
              localzo.b(((zq)localObject1).g());
            }
            else if (d4 <= 0.7853981633974483D)
            {
              ((zq)localObject1).a(f2 < 0.0F ? arrayOfzo[0].d() + (n + 1) * f2 : arrayOfzo[0].d() + n * f2);
              ((zq)localObject1).b(f3 > 0.0F ? arrayOfzo[0].e() + (n + 1) * f3 : arrayOfzo[0].e() + n * f3);
              ((zq)localObject1).c(Math.abs(f2));
              ((zq)localObject1).d(paramzbt.h);
            }
            else
            {
              ((zq)localObject1).a(f3 > 0.0F ? arrayOfzo[0].d() + n * f2 : arrayOfzo[0].d() + (n + 1) * f2);
              ((zq)localObject1).a(f2 * f3 <= 0.0F ? ((zq)localObject1).f() + f1 * (float)Math.sin(d4) : ((zq)localObject1).f() - f1 * (float)Math.sin(d4) - paramzbt.i);
              ((zq)localObject1).b(f3 > 0.0F ? arrayOfzo[0].e() + n * f3 : arrayOfzo[0].e() + (n + 1) * f3);
              ((zq)localObject1).b(((zq)localObject1).g() + (Math.abs(f3) - paramzbt.h) * (float)Math.sin(d4) / 2.0F);
              ((zq)localObject1).c(paramzbt.i);
              ((zq)localObject1).d(paramzbt.h);
            }
          }
          else if ((localzjf.p() < 0) && (i == 0) && (paramzbt.I() == 2)) {
            if (arrayOfzo[0].e() == arrayOfzo[1].e())
            {
              ((zq)localObject1).a(f2 > 0.0F ? arrayOfzo[0].d() + n * f2 : arrayOfzo[0].d() + (n + 1) * f2);
              ((zq)localObject1).b(arrayOfzo[0].e() - paramzbt.h - f1);
              ((zq)localObject1).c(Math.abs(f2));
              ((zq)localObject1).d(paramzbt.h);
            }
            else if (d4 <= 0.7853981633974483D)
            {
              ((zq)localObject1).a(f2 < 0.0F ? arrayOfzo[0].d() + (n + 1) * f2 : arrayOfzo[0].d() + n * f2);
              ((zq)localObject1).b(f3 < 0.0F ? arrayOfzo[0].e() + (n + 1) * f3 : arrayOfzo[0].e() + n * f3);
              ((zq)localObject1).b(((zq)localObject1).g() - paramzbt.h);
              ((zq)localObject1).c(Math.abs(f2));
              ((zq)localObject1).d(paramzbt.h);
            }
            else
            {
              ((zq)localObject1).a(f3 < 0.0F ? arrayOfzo[0].d() + n * f2 : arrayOfzo[0].d() + (n + 1) * f2);
              ((zq)localObject1).a(f2 * f3 >= 0.0F ? ((zq)localObject1).f() + f1 * (float)Math.sin(d4) : ((zq)localObject1).f() - f1 * (float)Math.sin(d4) - paramzbt.i);
              ((zq)localObject1).b(f3 < 0.0F ? arrayOfzo[0].e() + n * f3 : arrayOfzo[0].e() + (n + 1) * f3);
              ((zq)localObject1).b(((zq)localObject1).g() - (Math.abs(f3) - paramzbt.h) * (float)Math.sin(d4) / 2.0F);
              ((zq)localObject1).b(((zq)localObject1).g() - paramzbt.h);
              ((zq)localObject1).c(paramzbt.i);
              ((zq)localObject1).d(paramzbt.h);
            }
          }
        }
        else if (localzjf.p() >= 0)
        {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            ((zq)localObject1).a(f2 < 0.0F ? arrayOfzo[0].d() + n * f2 + f2 / 2.0F : arrayOfzo[0].d() + n * f2 - f2 / 2.0F);
            ((zq)localObject1).b(arrayOfzo[0].e() + f1);
            ((zq)localObject1).c(Math.abs(f2));
            ((zq)localObject1).d(paramzbt.h);
          }
          else if (d4 <= 0.7853981633974483D)
          {
            ((zq)localObject1).a(arrayOfzo[0].d() + n * f2 - Math.abs(f2) / 2.0F);
            ((zq)localObject1).b(arrayOfzo[0].e() + n * f3 + f1);
            ((zq)localObject1).c(Math.abs(f2));
            ((zq)localObject1).d(paramzbt.h);
          }
          else
          {
            ((zq)localObject1).a(arrayOfzo[0].d() + n * f2);
            ((zq)localObject1).a(f2 * f3 <= 0.0F ? ((zq)localObject1).f() + f1 * (float)Math.sin(d4) : ((zq)localObject1).f() - f1 * (float)Math.sin(d4) - paramzbt.i);
            ((zq)localObject1).b(arrayOfzo[0].e() + n * f3 - paramzbt.h / 2.0F);
            ((zq)localObject1).c(paramzbt.i);
            ((zq)localObject1).d(paramzbt.h);
          }
        }
        else if ((localzjf.p() < 0) && (i == 0) && (paramzbt.I() == 2)) {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            ((zq)localObject1).a(f2 > 0.0F ? arrayOfzo[0].d() + n * f2 - f2 / 2.0F : arrayOfzo[0].d() + n * f2 + f2 / 2.0F);
            ((zq)localObject1).b(arrayOfzo[0].e() - paramzbt.h - f1);
            ((zq)localObject1).c(Math.abs(f2));
            ((zq)localObject1).d(paramzbt.h);
          }
          else if (d4 <= 0.7853981633974483D)
          {
            ((zq)localObject1).a(arrayOfzo[0].d() + n * f2 - Math.abs(f2) / 2.0F);
            ((zq)localObject1).b(arrayOfzo[0].e() + n * f3);
            ((zq)localObject1).b(((zq)localObject1).g() - (paramzbt.h + f1));
            ((zq)localObject1).c(Math.abs(f2));
            ((zq)localObject1).d(paramzbt.h);
          }
          else
          {
            ((zq)localObject1).a(f3 < 0.0F ? arrayOfzo[0].d() + n * f2 : arrayOfzo[0].d() + n * f2);
            ((zq)localObject1).a(f2 * f3 >= 0.0F ? ((zq)localObject1).f() + f1 * (float)Math.sin(d4) : ((zq)localObject1).f() - f1 * (float)Math.sin(d4) - paramzbt.i);
            ((zq)localObject1).b(arrayOfzo[0].e() + n * f3 - paramzbt.h / 2.0F);
            ((zq)localObject1).c(paramzbt.i);
            ((zq)localObject1).d(paramzbt.h);
          }
        }
        boolean bool3 = zbxz.b(str1);
        localObject2 = zbxz.a(str1, localzbwv.f(), localzbwv.h(), false);
        if ((((ArrayList)localObject2).size() > 0) && ((Math.abs(localzbwv.e()) == 90) || (localzbwv.e() == 0)))
        {
          zf localzf = paramzr.d();
          Object localObject3 = localObject1;
          if (localzbwv.e() != 0)
          {
            float f7 = ((zq)localObject3).f() + ((zq)localObject3).h() / 2.0F;
            float f9 = ((zq)localObject3).g() + ((zq)localObject3).i() / 2.0F;
            localObject3 = new zq(-((zq)localObject3).i() / 2.0F, -((zq)localObject3).h() / 2.0F, ((zq)localObject3).i(), ((zq)localObject3).h());
            paramzr.b(f7, f9);
            paramzr.a(-localzbwv.e());
          }
          int i5 = 1;
          i6 = 1;
          zbda localzbda = new zbda();
          zbxz.a((ArrayList)localObject2, localzbda, localzbwv.a(), localzbwv.i(), new zzo());
          zbcw localzbcw = new zbcw();
          localzbcw.a(zbvy.a(i5));
          localzbcw.b(zbvy.a(i6));
          zbde localzbde = new zbde((zq)localObject3, localzbcw, localzbda, localzbwv.a(), bool3);
          localzbde.b(paramzr, localzjf.at());
          paramzr.a(localzf);
        }
        else if (localzbwv.n() != 0)
        {
          int i3 = 1;
          int i4 = 1;
          com.aspose.cells.b.a.b.zs localzs2 = zbvy.a(paramzr, str1, localzbwv.e(), localzbwv.a(), ((zq)localObject1).e(), i3, i4, localzbwv.n());
          zbvy.a(paramzr, str1, localzbwv.a(), localColor, ((zq)localObject1).f(), ((zq)localObject1).g(), localzs2.b(), localzs2.c(), localzbwv.n(), paramzbt.G().f());
        }
        else if ((localzbwv.e() == 0) || (localzbwv.e() == 90) || (localzbwv.e() == -90) || (!bool2))
        {
          com.aspose.cells.b.a.b.zs localzs1 = zbvy.a(paramzr, str1, localzbwv.e(), localzbwv.a(), ((zq)localObject1).e(), 1, 1, localzbwv.n());
          zt localzt = zbxz.a(paramzr, str1, localzbwv.a(), new zt(((zq)localObject1).i(), ((zq)localObject1).h()));
          ((zq)localObject1).d(localzs1.c());
          a(paramzr, zp.a((zq)localObject1), str1, localzbwv.e(), localzbwv.a(), localColor, 1, 1, zv.c());
        }
        else if (((ArrayList)localObject2).size() == 0)
        {
          a(paramzr, str1, localzo, new zt(paramzbt.i, paramzbt.h), localzbwv.e(), localzbwv.a(), localColor, paramzbt.a());
        }
        else
        {
          a(paramzr, str1, localzo, new zt(paramzbt.i, paramzbt.h), localzbwv.e(), localzbwv.a(), localColor, paramzbt.a(), localzbwv);
        }
      }
    }
    a(paramzr, paramzbt, j, paramInt);
    ArrayList[] arrayOfArrayList = localzjf.z().e();
    boolean bool1 = localzjf.G().p();
    float f4 = arrayOfzo[0].e();
    int i2 = 9;
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList.size() > 0) && (paramzbt.I() != 3))
    {
      localObject1 = arrayOfArrayList[0];
      zgn localzgn = (zgn)((List)localObject1).get(0);
      String str2 = zra.a(localzjf.an(), localzgn.a(), localzgn.c(), localzgn.b(), localzjf.U());
      localObject2 = zbvy.a(paramzbt.e().ap(), str2, 0, localzbwv.a(), new zt(paramzp.e(), paramzp.f()), 1, 1, localzbwv.n());
      float f5;
      if (!paramzbt.p()) {
        f5 = arrayOfzo[0].d();
      } else {
        f5 = arrayOfzo[1].d();
      }
      float f6 = f4 + f1 * (arrayOfArrayList.length + 1) + paramzbt.g;
      float f8 = f4;
      i6 = 0;
      if (arrayOfzo[0].e() == arrayOfzo[1].e()) {
        a(paramzr, arrayOfArrayList, f5, f6, f1, i6, paramzbt, f2, localzbwv, i2, f8, paramzp, paramBoolean);
      }
    }
  }
  
  private static void d(zr paramzr, zbt paramzbt)
  {
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    zo[] arrayOfzo = zjb.c(localzjf);
    double d1;
    if (localzjf.G().p()) {
      d1 = localzjf.G().z() - localzjf.G().l();
    } else {
      d1 = localzjf.G().l() - localzjf.G().D();
    }
    int i = (int)(d1 / (localzjf.G().z() - localzjf.G().D()) * localzjf.S().i());
    if (i != 0) {
      paramzbt.m().a(arrayOfzo[0].d(), arrayOfzo[0].e() - i, arrayOfzo[1].d(), arrayOfzo[1].e() - i);
    }
    if (localzjf.p() >= 0) {
      paramzbt.m().a(arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[1].d(), arrayOfzo[1].e());
    }
    if (paramzbt.I() == 2)
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - i);
      arrayOfzo[1].b(arrayOfzo[1].e() - i);
    }
    zbff localzbff = localzjf.z();
    zbwv localzbwv = paramzbt.J();
    ArrayList localArrayList1 = localzjf.z().c();
    float f1 = paramzbt.J().q();
    if (paramzbt.I() != 3) {
      f1 += paramzbt.aa() + paramzbt.ab();
    }
    double d2 = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    double d3 = 180.0D * d2 / 3.141592653589793D;
    int j = (int)paramzbt.z();
    int k = (int)paramzbt.D();
    int m = paramzbt.j();
    int n = (paramzbt.f()) || (localzjf.u()) ? 1 : 0;
    int i1;
    if (n != 0)
    {
      i1 = a(m, j, k, paramzbt.e().U()) + 1;
    }
    else
    {
      i1 = a(m, j, k, paramzbt.e().U());
      if (i1 == 0) {
        i1 = 1;
      }
    }
    float f2 = (arrayOfzo[1].d() - arrayOfzo[0].d()) / i1;
    float f3 = (arrayOfzo[1].e() - arrayOfzo[0].e()) / i1;
    ArrayList localArrayList2 = paramzbt.l;
    for (int i2 = 0; i2 < localArrayList2.size(); i2++)
    {
      int i3 = i2;
      if (paramzbt.p()) {
        i3 = localArrayList2.size() - 1 - i2;
      }
      int i4 = com.aspose.cells.b.a.ze.f(paramzbt.l.get(i2));
      int i5 = a(m, i4, k, paramzbt.e().U());
      float f4 = f3 * i5;
      String str = "";
      Color localColor = localzbwv.i();
      Object localObject;
      if (i3 < paramzbt.l.size())
      {
        str = a(paramzbt, paramzbt.l.get(i3));
        localColor = zra.a(paramzbt.l.get(i3), localzbwv.b(), localColor);
        if ((localzbwv.c()) && (localArrayList1.size() > 0))
        {
          localObject = "";
          boolean bool = false;
          localObject = ((zgn)localArrayList1.get(0)).c();
          bool = ((zgn)localArrayList1.get(0)).b();
          str = zra.a(localzjf.an(), paramzbt.l.get(i3), (String)localObject, bool, localzjf.U());
          localColor = zra.a(paramzbt.l.get(i3), (String)localObject, localColor);
        }
      }
      if (paramzbt.I() != 3)
      {
        localObject = new zq(0.0F, 0.0F, 0.0F, 0.0F);
        if (n != 0)
        {
          if (localzjf.p() >= 0)
          {
            if (arrayOfzo[0].e() == arrayOfzo[1].e())
            {
              ((zq)localObject).a(f2 < 0.0F ? arrayOfzo[0].d() + (i2 + 1) * f2 : arrayOfzo[0].d() + i2 * f2);
              ((zq)localObject).b(arrayOfzo[0].e() + f1);
              ((zq)localObject).c(Math.abs(f2));
              ((zq)localObject).d(paramzbt.g);
            }
            else if (d2 <= 0.7853981633974483D)
            {
              ((zq)localObject).a(f2 < 0.0F ? arrayOfzo[0].d() + (i2 + 1) * f2 : arrayOfzo[0].d() + i2 * f2);
              ((zq)localObject).b(f3 > 0.0F ? arrayOfzo[0].e() + (i2 + 1) * f3 : arrayOfzo[0].e() + i2 * f3);
              ((zq)localObject).c(paramzbt.f);
              ((zq)localObject).d(paramzbt.g);
            }
            else
            {
              ((zq)localObject).a(f3 > 0.0F ? arrayOfzo[0].d() + i2 * f2 : arrayOfzo[0].d() + (i2 + 1) * f2);
              ((zq)localObject).a(f2 * f3 <= 0.0F ? ((zq)localObject).f() + f1 * (float)Math.sin(d2) : ((zq)localObject).f() - f1 * (float)Math.sin(d2) - paramzbt.f);
              ((zq)localObject).b(f3 > 0.0F ? arrayOfzo[0].e() + i2 * f3 : arrayOfzo[0].e() + (i2 + 1) * f3);
              ((zq)localObject).b(((zq)localObject).g() + (Math.abs(f3) - paramzbt.g) * (float)Math.sin(d2) / 2.0F);
              ((zq)localObject).c(paramzbt.f);
              ((zq)localObject).d(paramzbt.g);
            }
          }
          else if ((localzjf.p() < 0) && (d1 != 0.0D) && (paramzbt.I() == 2)) {
            if (arrayOfzo[0].e() == arrayOfzo[1].e())
            {
              ((zq)localObject).a(f2 > 0.0F ? arrayOfzo[0].d() + i2 * f2 : arrayOfzo[0].d() + (i2 + 1) * f2);
              ((zq)localObject).b(arrayOfzo[0].e() - paramzbt.g - f1);
              ((zq)localObject).c(paramzbt.f);
              ((zq)localObject).d(paramzbt.g);
            }
            else if (d2 <= 0.7853981633974483D)
            {
              ((zq)localObject).a(f2 < 0.0F ? arrayOfzo[0].d() + (i2 + 1) * f2 : arrayOfzo[0].d() + i2 * f2);
              ((zq)localObject).b(f3 < 0.0F ? arrayOfzo[0].e() + (i2 + 1) * f3 : arrayOfzo[0].e() + i2 * f3);
              ((zq)localObject).b(((zq)localObject).g() - paramzbt.g);
              ((zq)localObject).c(paramzbt.f);
              ((zq)localObject).d(paramzbt.g);
            }
            else
            {
              ((zq)localObject).a(f3 < 0.0F ? arrayOfzo[0].d() + i2 * f2 : arrayOfzo[0].d() + (i2 + 1) * f2);
              ((zq)localObject).a(f2 * f3 >= 0.0F ? ((zq)localObject).f() + f1 * (float)Math.sin(d2) : ((zq)localObject).f() - f1 * (float)Math.sin(d2) - paramzbt.f);
              ((zq)localObject).b(f3 < 0.0F ? arrayOfzo[0].e() + i2 * f3 : arrayOfzo[0].e() + (i2 + 1) * f3);
              ((zq)localObject).b(((zq)localObject).g() - (Math.abs(f3) - paramzbt.g) * (float)Math.sin(d2) / 2.0F);
              ((zq)localObject).b(((zq)localObject).g() - paramzbt.g);
              ((zq)localObject).c(paramzbt.f);
              ((zq)localObject).d(paramzbt.g);
            }
          }
        }
        else if (localzjf.p() >= 0)
        {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            ((zq)localObject).a(f2 < 0.0F ? arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F : arrayOfzo[0].d() + i2 * f2 - f2 / 2.0F);
            ((zq)localObject).b(arrayOfzo[0].e() + f1);
            ((zq)localObject).c(Math.abs(f2));
            ((zq)localObject).d(paramzbt.g);
          }
          else if (d2 <= 0.7853981633974483D)
          {
            ((zq)localObject).a(arrayOfzo[0].d() + i2 * f2 - Math.abs(f2) / 2.0F);
            ((zq)localObject).b(arrayOfzo[0].e() + i2 * f3 + f1);
            ((zq)localObject).c(Math.abs(f2));
            ((zq)localObject).d(paramzbt.g);
          }
          else
          {
            ((zq)localObject).a(arrayOfzo[0].d() + i2 * f2);
            ((zq)localObject).a(f2 * f3 <= 0.0F ? ((zq)localObject).f() + f1 * (float)Math.sin(d2) : ((zq)localObject).f() - f1 * (float)Math.sin(d2) - paramzbt.f);
            ((zq)localObject).b(arrayOfzo[0].e() + i2 * f3 - paramzbt.g / 2.0F);
            ((zq)localObject).c(paramzbt.f);
            ((zq)localObject).d(paramzbt.g);
          }
        }
        else if ((localzjf.p() < 0) && (d1 != 0.0D) && (paramzbt.I() == 2)) {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            ((zq)localObject).a(f2 > 0.0F ? arrayOfzo[0].d() + i2 * f2 - f2 / 2.0F : arrayOfzo[0].d() + i2 * f2 + f2 / 2.0F);
            ((zq)localObject).b(arrayOfzo[0].e() - paramzbt.g - f1);
            ((zq)localObject).c(Math.abs(f2));
            ((zq)localObject).d(paramzbt.g);
          }
          else if (d2 <= 0.7853981633974483D)
          {
            ((zq)localObject).a(arrayOfzo[0].d() + i2 * f2 - Math.abs(f2) / 2.0F);
            ((zq)localObject).b(arrayOfzo[0].e() + i2 * f3);
            ((zq)localObject).b(((zq)localObject).g() - (paramzbt.g + f1));
            ((zq)localObject).c(Math.abs(f2));
            ((zq)localObject).d(paramzbt.g);
          }
          else
          {
            ((zq)localObject).a(f3 < 0.0F ? arrayOfzo[0].d() + i2 * f2 : arrayOfzo[0].d() + i2 * f2);
            ((zq)localObject).a(f2 * f3 >= 0.0F ? ((zq)localObject).f() + f1 * (float)Math.sin(d2) : ((zq)localObject).f() - f1 * (float)Math.sin(d2) - paramzbt.f);
            ((zq)localObject).b(arrayOfzo[0].e() + i2 * f3 - paramzbt.g / 2.0F);
            ((zq)localObject).c(paramzbt.f);
            ((zq)localObject).d(paramzbt.g);
          }
        }
        a(paramzr, zp.a((zq)localObject), str, localzbwv.e(), localzbwv.a(), localColor, 1, 1);
      }
    }
    a(paramzr, paramzbt, i);
  }
  
  private static void a(zr paramzr, zbt paramzbt, int paramInt1, int paramInt2)
  {
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    if (((paramzbt.E() == 2) && (paramzbt.F() == 2)) || (!paramzbt.m().h())) {
      return;
    }
    int i = (paramzbt.f()) || (paramzbt.e().u()) ? 1 : 0;
    zo[] arrayOfzo;
    if (paramzbt.g() == 4)
    {
      arrayOfzo = zjb.d(localzjf);
      i = 1;
    }
    else
    {
      arrayOfzo = zjb.c(localzjf);
    }
    double d = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    int j;
    if (i != 0)
    {
      j = paramInt2;
    }
    else
    {
      j = paramInt2 - 1;
      if (j == 0) {
        j = 1;
      }
    }
    if ((localzjf.p() < 0) && (paramInt1 > 0))
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - paramInt1);
      arrayOfzo[1].b(arrayOfzo[1].e() - paramInt1);
    }
    for (paramInt1 = 0;; paramInt1 = 0)
    {
      int k;
      int m;
      zo localzo1;
      zo localzo2;
      float f1;
      float f2;
      float f3;
      float f4;
      int n;
      int i1;
      if (d <= 0.7853981633974483D)
      {
        k = 0;
        m = 0;
        switch (paramzbt.E())
        {
        case 1: 
          if (localzjf.p() >= 0) {
            k = 1;
          } else {
            m = 1;
          }
          break;
        case 3: 
          if (localzjf.p() >= 0) {
            m = 1;
          } else {
            k = 1;
          }
          break;
        case 0: 
          k = 1;
          m = 1;
          break;
        }
        if (!paramzbt.p())
        {
          localzo1 = arrayOfzo[0];
          localzo2 = arrayOfzo[1];
        }
        else
        {
          localzo1 = arrayOfzo[1];
          localzo2 = arrayOfzo[0];
        }
        f1 = (localzo2.d() - localzo1.d()) / j;
        f2 = (localzo2.e() - localzo1.e()) / j;
        if ((f1 == 0.0F) && (f2 == 0.0F)) {
          return;
        }
        f3 = localzo1.d();
        for (f4 = localzo1.e(); ((localzo1.d() <= f3) && (f3 <= localzo2.d())) || ((localzo1.d() >= f3) && (f3 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.d())); f4 += paramzbt.Q() * f2)
        {
          if (k != 0) {
            paramzbt.m().a(f3, f4 - paramzbt.aa(), f3, f4);
          }
          if (m != 0) {
            paramzbt.m().a(f3, f4, f3, f4 + paramzbt.aa());
          }
          f3 += paramzbt.Q() * f1;
        }
        n = 0;
        i1 = 0;
        switch (paramzbt.F())
        {
        case 1: 
          if (localzjf.p() >= 0) {
            n = 1;
          } else {
            i1 = 1;
          }
          break;
        case 3: 
          if (localzjf.p() >= 0) {
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
        f3 = localzo1.d() + paramzbt.Q() * f1 / 2.0F;
        for (f4 = localzo1.e() + paramzbt.Q() * f2 / 2.0F; ((localzo1.d() <= f3) && (f3 <= localzo2.d())) || ((localzo1.d() >= f3) && (f3 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.d())); f4 += paramzbt.Q() * f2)
        {
          if (n != 0) {
            paramzbt.m().a(f3, f4 - paramzbt.ab(), f3, f4);
          }
          if (i1 != 0) {
            paramzbt.m().a(f3, f4, f3, f4 + paramzbt.ab());
          }
          if (paramzbt.E() == 2)
          {
            f3 += paramzbt.Q() * f1 / 2.0F;
            f4 += paramzbt.Q() * f2 / 2.0F;
            if (((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())))
            {
              if (n != 0) {
                paramzbt.m().a(f3, f4 - paramzbt.ab(), f3, f4);
              }
              if (i1 != 0) {
                paramzbt.m().a(f3, f4, f3, f4 + paramzbt.ab());
              }
            }
            f3 -= paramzbt.Q() * f1 / 2.0F;
            f4 -= paramzbt.Q() * f2 / 2.0F;
          }
          f3 += paramzbt.Q() * f1;
        }
      }
      else
      {
        k = 0;
        m = 0;
        switch (paramzbt.E())
        {
        case 1: 
          if ((localzjf.E() < 90) || ((localzjf.E() >= 225) && (localzjf.E() < 270))) {
            k = 1;
          } else {
            m = 1;
          }
          break;
        case 3: 
          if ((localzjf.E() < 90) || ((localzjf.E() >= 225) && (localzjf.E() < 270))) {
            m = 1;
          } else {
            k = 1;
          }
          break;
        case 0: 
          k = 1;
          m = 1;
          break;
        }
        if (!paramzbt.p())
        {
          localzo1 = arrayOfzo[0];
          localzo2 = arrayOfzo[1];
        }
        else
        {
          localzo1 = arrayOfzo[1];
          localzo2 = arrayOfzo[0];
        }
        f1 = (localzo2.d() - localzo1.d()) / j;
        f2 = (localzo2.e() - localzo1.e()) / j;
        if ((f1 == 0.0F) && (f2 == 0.0F)) {
          return;
        }
        f3 = localzo1.d();
        for (f4 = localzo1.e(); ((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())); f4 += paramzbt.Q() * f2)
        {
          if (k != 0) {
            paramzbt.m().a(f3, f4, f3 + paramzbt.aa(), f4);
          }
          if (m != 0) {
            paramzbt.m().a(f3 - paramzbt.aa(), f4, f3, f4);
          }
          f3 += paramzbt.Q() * f1;
        }
        n = 0;
        i1 = 0;
        switch (paramzbt.F())
        {
        case 1: 
          if ((localzjf.E() < 90) || ((localzjf.E() >= 225) && (localzjf.E() < 270))) {
            n = 1;
          } else {
            i1 = 1;
          }
          break;
        case 3: 
          if ((localzjf.E() < 90) || ((localzjf.E() >= 225) && (localzjf.E() < 270))) {
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
        f3 = localzo1.d() + paramzbt.Q() * f1 / 2.0F;
        for (f4 = localzo1.e() + paramzbt.Q() * f2 / 2.0F; ((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())); f4 += paramzbt.Q() * f2)
        {
          if (n != 0) {
            paramzbt.m().a(f3, f4, f3 + paramzbt.ab(), f4);
          }
          if (i1 != 0) {
            paramzbt.m().a(f3 - paramzbt.ab(), f4, f3, f4);
          }
          if (paramzbt.E() == 2)
          {
            f3 += paramzbt.Q() * f1 / 2.0F;
            f4 += paramzbt.Q() * f2 / 2.0F;
            if (((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())))
            {
              if (n != 0) {
                paramzbt.m().a(f3, f4, f3 + paramzbt.ab(), f4);
              }
              if (i1 != 0) {
                paramzbt.m().a(f3 - paramzbt.ab(), f4, f3, f4);
              }
            }
            f3 -= paramzbt.Q() * f1 / 2.0F;
            f4 -= paramzbt.Q() * f2 / 2.0F;
          }
          f3 += paramzbt.Q() * f1;
        }
      }
      if (paramInt1 <= 0) {
        break;
      }
      arrayOfzo[0].b(arrayOfzo[0].e() - paramInt1);
      arrayOfzo[1].b(arrayOfzo[1].e() - paramInt1);
    }
  }
  
  private static void a(zr paramzr, zbt paramzbt, int paramInt)
  {
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    if (((paramzbt.E() == 2) && (paramzbt.F() == 2)) || (!paramzbt.m().h())) {
      return;
    }
    zo[] arrayOfzo = zjb.c(localzjf);
    double d = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    int i = (int)paramzbt.z();
    int j = (int)paramzbt.D();
    int k = paramzbt.j();
    int m = (paramzbt.f()) || (localzjf.u()) ? 1 : 0;
    int n;
    if (m != 0)
    {
      n = a(k, i, j, paramzbt.e().U()) + 1;
    }
    else
    {
      n = a(k, i, j, paramzbt.e().U());
      if (n == 0) {
        n = 1;
      }
    }
    if ((localzjf.p() < 0) && (paramInt > 0))
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - paramInt);
      arrayOfzo[1].b(arrayOfzo[1].e() - paramInt);
    }
    for (paramInt = 0;; paramInt = 0)
    {
      int i1;
      int i2;
      zo localzo1;
      zo localzo2;
      float f1;
      float f2;
      float f3;
      float f4;
      int i3;
      int i4;
      if (d <= 0.7853981633974483D)
      {
        i1 = 0;
        i2 = 0;
        switch (paramzbt.E())
        {
        case 1: 
          if (localzjf.p() >= 0) {
            i1 = 1;
          } else {
            i2 = 1;
          }
          break;
        case 3: 
          if (localzjf.p() >= 0) {
            i2 = 1;
          } else {
            i1 = 1;
          }
          break;
        case 0: 
          i1 = 1;
          i2 = 1;
          break;
        }
        if (!paramzbt.p())
        {
          localzo1 = arrayOfzo[0];
          localzo2 = arrayOfzo[1];
        }
        else
        {
          localzo1 = arrayOfzo[1];
          localzo2 = arrayOfzo[0];
        }
        f1 = (localzo2.d() - localzo1.d()) / n;
        f2 = (localzo2.e() - localzo1.e()) / n;
        f3 = localzo1.d();
        for (f4 = localzo1.e(); ((localzo1.d() <= f3) && (f3 <= localzo2.d())) || ((localzo1.d() >= f3) && (f3 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.d())); f4 += f2 * a(k, a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), (int)paramzbt.D(), paramzbt.e().U()), (int)paramzbt.D(), paramzbt.e().U()))
        {
          if (i1 != 0) {
            paramzbt.m().a(f3, f4 - paramzbt.aa(), f3, f4);
          }
          if (i2 != 0) {
            paramzbt.m().a(f3, f4, f3, f4 + paramzbt.aa());
          }
          f3 += f1 * a(k, a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), (int)paramzbt.D(), paramzbt.e().U()), (int)paramzbt.D(), paramzbt.e().U());
        }
        i3 = 0;
        i4 = 0;
        switch (paramzbt.F())
        {
        case 1: 
          if (localzjf.p() >= 0) {
            i3 = 1;
          } else {
            i4 = 1;
          }
          break;
        case 3: 
          if (localzjf.p() >= 0) {
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
        f3 = localzo1.d();
        for (f4 = localzo1.e(); ((localzo1.d() <= f3) && (f3 <= localzo2.d())) || ((localzo1.d() >= f3) && (f3 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.d())); f4 += f2 * a(k, a(paramzbt.j(), paramzbt.C(), (int)paramzbt.B(), (int)paramzbt.D(), paramzbt.e().U()), (int)paramzbt.D(), paramzbt.e().U()))
        {
          if (i3 != 0) {
            paramzbt.m().a(f3, f4 - paramzbt.ab(), f3, f4);
          }
          if (i4 != 0) {
            paramzbt.m().a(f3, f4, f3, f4 + paramzbt.ab());
          }
          f3 += f1 * a(k, a(paramzbt.j(), paramzbt.C(), (int)paramzbt.B(), (int)paramzbt.D(), paramzbt.e().U()), (int)paramzbt.D(), paramzbt.e().U());
        }
      }
      else
      {
        i1 = 0;
        i2 = 0;
        switch (paramzbt.E())
        {
        case 1: 
          if ((localzjf.E() < 90) || ((localzjf.E() >= 225) && (localzjf.E() < 270))) {
            i1 = 1;
          } else {
            i2 = 1;
          }
          break;
        case 3: 
          if ((localzjf.E() < 90) || ((localzjf.E() >= 225) && (localzjf.E() < 270))) {
            i2 = 1;
          } else {
            i1 = 1;
          }
          break;
        case 0: 
          i1 = 1;
          i2 = 1;
          break;
        }
        if (!paramzbt.p())
        {
          localzo1 = arrayOfzo[0];
          localzo2 = arrayOfzo[1];
        }
        else
        {
          localzo1 = arrayOfzo[1];
          localzo2 = arrayOfzo[0];
        }
        f1 = (localzo2.d() - localzo1.d()) / n;
        f2 = (localzo2.e() - localzo1.e()) / n;
        f3 = localzo1.d();
        for (f4 = localzo1.e(); ((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())); f4 += f2 * a(k, a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), (int)paramzbt.D(), paramzbt.e().U()), (int)paramzbt.D(), paramzbt.e().U()))
        {
          if (i1 != 0) {
            paramzbt.m().a(f3, f4, f3 + paramzbt.aa(), f4);
          }
          if (i2 != 0) {
            paramzbt.m().a(f3 - paramzbt.aa(), f4, f3, f4);
          }
          f3 += f1 * a(k, a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), (int)paramzbt.D(), paramzbt.e().U()), (int)paramzbt.D(), paramzbt.e().U());
        }
        i3 = 0;
        i4 = 0;
        switch (paramzbt.F())
        {
        case 1: 
          if ((localzjf.E() < 90) || ((localzjf.E() >= 225) && (localzjf.E() < 270))) {
            i3 = 1;
          } else {
            i4 = 1;
          }
          break;
        case 3: 
          if ((localzjf.E() < 90) || ((localzjf.E() >= 225) && (localzjf.E() < 270))) {
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
        f3 = localzo1.d();
        boolean bool;
        for (f4 = localzo1.e(); ((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())); f4 += f2 * a(k, a(paramzbt.j(), paramzbt.C(), (int)paramzbt.B(), (int)paramzbt.D(), bool), (int)paramzbt.D(), bool))
        {
          if (i3 != 0) {
            paramzbt.m().a(f3, f4, f3 + paramzbt.ab(), f4);
          }
          if (i4 != 0) {
            paramzbt.m().a(f3 - paramzbt.ab(), f4, f3, f4);
          }
          bool = paramzbt.e().U();
          f3 += f1 * a(k, a(paramzbt.j(), paramzbt.C(), (int)paramzbt.B(), (int)paramzbt.D(), bool), (int)paramzbt.D(), bool);
        }
      }
      if (paramInt <= 0) {
        break;
      }
      arrayOfzo[0].b(arrayOfzo[0].e() - paramInt);
      arrayOfzo[1].b(arrayOfzo[1].e() - paramInt);
    }
  }
  
  static void b(zr paramzr, zbt paramzbt)
    throws Exception
  {
    if (paramzbt.e().B().E()) {
      return;
    }
    zjf localzjf = paramzbt.e();
    int i = localzjf.N();
    zbyv localzbyv = localzjf.S();
    zo[] arrayOfzo1 = zjb.c(localzjf);
    zo[] arrayOfzo2 = new zo[2];
    zbxz.a(arrayOfzo2);
    if (paramzbt.m == 2)
    {
      arrayOfzo2[0].a(arrayOfzo1[2].d());
      arrayOfzo2[0].b(arrayOfzo1[2].e() - localzbyv.i());
      arrayOfzo2[1].a(arrayOfzo1[3].d());
      arrayOfzo2[1].b(arrayOfzo1[3].e() - localzbyv.i());
    }
    else
    {
      arrayOfzo2[0].a(arrayOfzo1[0].d());
      arrayOfzo2[0].b(arrayOfzo1[0].e());
      arrayOfzo2[1].a(arrayOfzo1[1].d());
      arrayOfzo2[1].b(arrayOfzo1[1].e());
    }
    paramzbt.m().a(arrayOfzo2[0], arrayOfzo2[1]);
    zbwv localzbwv = paramzbt.J();
    zbfd localzbfd = localzjf.z().c(0);
    zkf localzkf = localzbfd.F().b(0);
    String str1 = localzkf != null ? localzkf.A() : "";
    boolean bool = localzkf != null ? localzkf.B() : true;
    int j = 0;
    if ((localzbwv.c()) && (localzkf != null)) {
      j = 1;
    }
    float f1 = 0.0F;
    f1 = arrayOfzo2[0].e() + paramzbt.aa();
    if (paramzbt.m == 2) {
      f1 = arrayOfzo2[0].e() - paramzbt.aa() - paramzbt.g;
    }
    float f2 = (float)(localzjf.S().g() / (paramzbt.z() - paramzbt.D()));
    ArrayList localArrayList = paramzbt.l;
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    for (int k = 0; k < paramzbt.l.size(); k++)
    {
      double d4 = ((Double)paramzbt.l.get(k)).doubleValue();
      double d5 = paramzbt.n() ? paramzbt.h(d4) : d4;
      if (k - 1 > 0 ? Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(k - 1)))) != d3 : (k + 1 >= localArrayList.size()) || (Math.abs(zbxz.b(d4, com.aspose.cells.b.a.ze.g(localArrayList.get(k + 1)))) == d3))
      {
        float f3 = (float)((d4 - d2) / (d1 - d2) * localzjf.S().g());
        if (!paramzbt.p()) {
          f3 = arrayOfzo2[0].d() + f3;
        } else {
          f3 = arrayOfzo2[1].d() - f3;
        }
        if (paramzbt.I() != 3)
        {
          if (paramzbt.af()) {
            str1 = "0%";
          }
          String str2 = "";
          d5 = paramzbt.n() ? d5 : d5 * Math.pow(10.0D, paramzbt.T().f());
          Color localColor = localzbwv.i();
          if (j != 0)
          {
            str2 = zra.a(localzjf.an(), Double.valueOf(d5), str1, bool, localzjf.U());
            localColor = zra.a(Double.valueOf(d5), str1, localColor);
          }
          else
          {
            str2 = a(paramzbt, Double.valueOf(d5));
            localColor = zra.a(Double.valueOf(d5), localzbwv.b(), localColor);
          }
          zq localzq = new zq(f3 - paramzbt.f / 2.0F, f1, paramzbt.f, paramzbt.g);
          a(paramzr, zp.a(localzq), str2, localzbwv.e(), localzbwv.a(), localColor, 1, 9);
        }
      }
    }
    e(paramzr, paramzbt);
  }
  
  private static void e(zr paramzr, zbt paramzbt)
  {
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    if (((paramzbt.E() == 2) && (paramzbt.F() == 2)) || (!paramzbt.m().h())) {
      return;
    }
    zo[] arrayOfzo = zjb.c(localzjf);
    int i = 0;
    int j = 0;
    switch (paramzbt.E())
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
    if (!paramzbt.p())
    {
      localzo1 = arrayOfzo[0];
      localzo2 = arrayOfzo[1];
    }
    else
    {
      localzo1 = arrayOfzo[1];
      localzo2 = arrayOfzo[0];
    }
    float f1 = (float)((localzo2.d() - localzo1.d()) / (paramzbt.z() - paramzbt.D()));
    float f2 = localzo1.d();
    float f3 = localzo1.e();
    while (((localzo1.d() <= f2) && (f2 <= localzo2.d())) || ((localzo1.d() >= f2) && (f2 >= localzo2.d())) || (com.aspose.cells.b.a.zr.a(f2) == com.aspose.cells.b.a.zr.a(localzo1.d())) || (com.aspose.cells.b.a.zr.a(f2) == com.aspose.cells.b.a.zr.a(localzo2.d())))
    {
      if (i != 0) {
        paramzbt.m().a(f2, f3 - paramzbt.aa(), f2, f3);
      }
      if (j != 0) {
        paramzbt.m().a(f2, f3, f2, f3 + paramzbt.aa());
      }
      f2 += f1 * (float)paramzbt.x();
    }
    i = 0;
    j = 0;
    switch (paramzbt.F())
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
        paramzbt.m().a(f2, f3 - paramzbt.ab(), f2, f3);
      }
      if (j != 0) {
        paramzbt.m().a(f2, f3, f2, f3 + paramzbt.ab());
      }
      f2 += f1 * (float)paramzbt.B();
    }
  }
  
  static void a(zr paramzr, zbt paramzbt, int paramInt, zp paramzp)
    throws Exception
  {
    if (paramzbt.e().B().E()) {
      return;
    }
    if (paramzbt.k() == 2)
    {
      f(paramzr, paramzbt);
      return;
    }
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    zo[] arrayOfzo = zjb.c(localzjf);
    zo localzo = zjb.e(localzjf);
    double d1;
    if (localzjf.G().p()) {
      d1 = localzjf.G().z() - localzjf.G().l();
    } else {
      d1 = localzjf.G().l() - localzjf.G().D();
    }
    int i = (int)(d1 / (localzjf.G().z() - localzjf.G().D()) * localzjf.S().g());
    if (i != 0) {
      paramzbt.m().a(arrayOfzo[0].d() + i, arrayOfzo[0].e(), arrayOfzo[0].d() + i, arrayOfzo[0].e() - localzjf.S().i());
    }
    if (localzjf.p() >= 0) {
      paramzbt.m().a(arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[0].d(), arrayOfzo[0].e() - localzjf.S().i());
    }
    if (paramzbt.I() == 2) {
      arrayOfzo[0].a(arrayOfzo[0].d() + i);
    }
    float f1 = 0.0F;
    float f2 = paramzbt.J().q();
    if (paramzbt.I() != 3) {
      f2 += paramzbt.aa() + paramzbt.ab();
    }
    int j = 8;
    f1 = arrayOfzo[0].d() - paramzbt.i - f2;
    float f3 = localzjf.S().i() / paramInt;
    zbwv localzbwv = paramzbt.J();
    ArrayList localArrayList = paramzbt.e().z().c();
    int k = 0;
    if ((localzbwv.c()) && (localArrayList.size() > 0)) {
      k = 1;
    }
    String str;
    Object localObject2;
    for (int m = 0; m < paramInt; m++)
    {
      double d2 = m * f3;
      d2 += f3 / 2.0F;
      float f4;
      if (paramzbt.p()) {
        f4 = (float)(arrayOfzo[0].e() - localzjf.S().i() + d2) - paramzbt.h / 2.0F;
      } else {
        f4 = (float)(arrayOfzo[0].e() - d2) - paramzbt.h / 2.0F;
      }
      if ((paramzbt.I() != 3) && (m % paramzbt.H() == 0) && (m < paramzbt.l.size()))
      {
        str = "";
        localObject2 = localzbwv.i();
        if (k == 0)
        {
          str = a(paramzbt, paramzbt.l.get(m));
          localObject2 = zra.a(paramzbt.l.get(m), localzbwv.b(), (Color)localObject2);
        }
        else
        {
          localObject3 = "";
          boolean bool2 = false;
          localObject3 = m < localArrayList.size() ? ((zgn)localArrayList.get(m)).c() : "";
          bool2 = m < localArrayList.size() ? ((zgn)localArrayList.get(m)).b() : false;
          str = zra.a(localzjf.an(), paramzbt.l.get(m), (String)localObject3, bool2, localzjf.U());
          localObject2 = zra.a(paramzbt.l.get(m), (String)localObject3, (Color)localObject2);
        }
        Object localObject3 = new zq(f1, f4, paramzbt.i, paramzbt.h);
        a(paramzr, zp.a((zq)localObject3), str, localzbwv.e(), localzbwv.a(), (Color)localObject2, j, 1);
      }
    }
    b(paramzr, paramzbt, i, paramInt);
    boolean bool1 = localzjf.G().p();
    ArrayList[] arrayOfArrayList = localzjf.z().e();
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList.size() > 0) && (paramzbt.I() != 3))
    {
      Object localObject1 = arrayOfArrayList[0];
      zgn localzgn = (zgn)((List)localObject1).get(0);
      str = zra.a(localzjf.an(), localzgn.a(), localzgn.c(), localzgn.b(), localzjf.U());
      localObject2 = zbvy.a(paramzbt.e().ap(), str, 0, localzbwv.a(), new zt(paramzp.e(), paramzp.f()), 1, 1, localzbwv.n());
      float f5 = 0.0F;
      if (!paramzbt.p()) {
        f5 = arrayOfzo[0].e();
      } else {
        f5 = arrayOfzo[0].e() - localzjf.S().i();
      }
      f1 = arrayOfzo[0].d() - f2 * (arrayOfArrayList.length + 1) - paramzbt.f;
      float f6 = arrayOfzo[0].d();
      boolean bool3 = true;
      a(paramzr, arrayOfArrayList, bool3, paramzbt, localzbwv, f3, paramzp, f2, f6, f1, f5);
    }
  }
  
  private static void f(zr paramzr, zbt paramzbt)
  {
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    zo[] arrayOfzo = zjb.c(localzjf);
    zo localzo = zjb.e(localzjf);
    double d;
    if (localzjf.G().p()) {
      d = localzjf.G().z() - localzjf.G().l();
    } else {
      d = localzjf.G().l() - localzjf.G().D();
    }
    int i = (int)(d / (localzjf.G().z() - localzjf.G().D()) * localzjf.S().g());
    if (i != 0) {
      paramzbt.m().a(arrayOfzo[0].d() + i, arrayOfzo[0].e(), arrayOfzo[0].d() + i, arrayOfzo[0].e() - localzjf.S().i());
    }
    if (localzjf.p() >= 0) {
      paramzbt.m().a(arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[0].d(), arrayOfzo[0].e() - localzjf.S().i());
    }
    if (paramzbt.I() == 2) {
      arrayOfzo[0].a(arrayOfzo[0].d() + i);
    }
    ArrayList localArrayList1 = paramzbt.l;
    float f1 = 0.0F;
    float f2 = paramzbt.J().q();
    float f3 = paramzbt.g / 2.0F;
    int j = 8;
    f1 = arrayOfzo[0].d() - paramzbt.f - f2;
    zbwv localzbwv = paramzbt.J();
    ArrayList localArrayList2 = paramzbt.e().z().c();
    int k = 0;
    if ((localzbwv.c()) && (localArrayList2.size() > 0)) {
      k = 1;
    }
    int m = (int)paramzbt.z();
    int n = (int)paramzbt.D();
    int i1 = paramzbt.j();
    int i2 = a(i1, m, n, paramzbt.e().U()) + 1;
    float f4 = localzbyv.i() / i2;
    for (int i3 = 0; i3 < localArrayList1.size(); i3++)
    {
      int i4 = com.aspose.cells.b.a.ze.f(paramzbt.l.get(i3));
      int i5 = a(i1, i4, n, paramzbt.e().U());
      float f5 = f4 * i5;
      f5 += f4 / 2.0F;
      float f6;
      if (paramzbt.p()) {
        f6 = arrayOfzo[0].e() - localzjf.S().i() + f5;
      } else {
        f6 = arrayOfzo[0].e() - f5;
      }
      if ((paramzbt.I() != 3) && (i3 % paramzbt.H() == 0) && (i3 < paramzbt.l.size()))
      {
        String str = "";
        Color localColor = localzbwv.i();
        if (k == 0)
        {
          str = a(paramzbt, paramzbt.l.get(i3));
          localColor = zra.a(paramzbt.l.get(i3), localzbwv.b(), localColor);
        }
        else
        {
          localObject = "";
          boolean bool = false;
          localObject = ((zgn)localArrayList2.get(0)).c();
          bool = ((zgn)localArrayList2.get(0)).b();
          str = zra.a(localzjf.an(), paramzbt.l.get(i3), (String)localObject, bool, localzjf.U());
          localColor = zra.a(paramzbt.l.get(i3), (String)localObject, localColor);
        }
        Object localObject = new zq(f1, f6 - f3, paramzbt.f, paramzbt.g);
        a(paramzr, zp.a((zq)localObject), str, localzbwv.e(), localzbwv.a(), localColor, j, 1);
      }
    }
    a(paramzr, i, paramzbt);
  }
  
  private static void b(zr paramzr, zbt paramzbt, int paramInt1, int paramInt2)
  {
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    if (((paramzbt.E() == 2) && (paramzbt.F() == 2)) || (!paramzbt.m().h())) {
      return;
    }
    zo[] arrayOfzo = zjb.c(localzjf);
    for (;;)
    {
      int i = 0;
      int j = 0;
      switch (paramzbt.E())
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
      switch (paramzbt.F())
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
      if (paramzbt.p())
      {
        localzo1 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e() - localzbyv.i());
        localzo2 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e());
      }
      else
      {
        localzo1 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e());
        localzo2 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e() - localzbyv.i());
      }
      float f1 = (localzo2.e() - localzo1.e()) / paramInt2;
      float f2 = localzo1.d();
      float f4;
      for (float f3 = localzo1.e(); ((localzo1.e() <= f3) && (f3 <= localzo2.e())) || ((localzo1.e() >= f3) && (f3 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.e())); f3 += paramzbt.Q() * f1)
      {
        if (((localzo1.e() <= f3) && (f3 <= localzo2.e())) || ((localzo1.e() >= f3) && (f3 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.e())))
        {
          if (i != 0) {
            paramzbt.m().a(f2, f3, f2 + paramzbt.aa(), f3);
          }
          if (j != 0) {
            paramzbt.m().a(f2 - paramzbt.aa(), f3, f2, f3);
          }
        }
        f4 = f3 - paramzbt.Q() * f1 / 2.0F;
        if (((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())))
        {
          if (k != 0) {
            paramzbt.m().a(f2, f4, f2 + paramzbt.aa(), f4);
          }
          if (m != 0) {
            paramzbt.m().a(f2 - paramzbt.aa(), f4, f2, f4);
          }
        }
      }
      if (paramzbt.Q() * f1 > localzo2.e() - localzo1.e())
      {
        f4 = f3 - paramzbt.Q() * f1 / 2.0F;
        if (((localzo1.e() <= f4) && (f4 <= localzo2.e())) || ((localzo1.e() >= f4) && (f4 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f4) == com.aspose.cells.b.a.zr.a(localzo2.e())))
        {
          if (k != 0) {
            paramzbt.m().a(f2, f4, f2 + paramzbt.aa(), f4);
          }
          if (m != 0) {
            paramzbt.m().a(f2 - paramzbt.aa(), f4, f2, f4);
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
  
  private static void a(zr paramzr, int paramInt, zbt paramzbt)
  {
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    if (((paramzbt.E() == 2) && (paramzbt.F() == 2)) || (!paramzbt.m().h())) {
      return;
    }
    zo[] arrayOfzo = zjb.c(localzjf);
    for (;;)
    {
      int i = 0;
      int j = 0;
      switch (paramzbt.E())
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
      if (paramzbt.p())
      {
        localzo1 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e() - localzbyv.i());
        localzo2 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e());
      }
      else
      {
        localzo1 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e());
        localzo2 = new zo(arrayOfzo[0].d(), arrayOfzo[0].e() - localzbyv.i());
      }
      int k = paramzbt.j();
      double d;
      if ((paramzbt.g() == 0) && (paramzbt.k() == 2)) {
        d = a(k, (int)paramzbt.z(), (int)paramzbt.D(), paramzbt.e().U()) + 1;
      } else {
        d = paramzbt.z() - paramzbt.D();
      }
      float f1 = (float)((localzo2.e() - localzo1.e()) / d);
      float f2 = localzo1.d();
      for (float f3 = localzo1.e(); ((localzo1.e() <= f3) && (f3 <= localzo2.e())) || ((localzo1.e() >= f3) && (f3 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.e())); f3 += f1 * a(k, a(paramzbt.j(), paramzbt.y(), (int)paramzbt.x(), (int)paramzbt.D(), paramzbt.e().U()), (int)paramzbt.D(), paramzbt.e().U()))
      {
        if (i != 0) {
          paramzbt.m().a(f2, f3, f2 + paramzbt.aa(), f3);
        }
        if (j != 0) {
          paramzbt.m().a(f2 - paramzbt.aa(), f3, f2, f3);
        }
      }
      int m = 0;
      int n = 0;
      switch (paramzbt.F())
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
      for (f3 = localzo1.e(); ((localzo1.e() <= f3) && (f3 <= localzo2.e())) || ((localzo1.e() >= f3) && (f3 >= localzo2.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo1.e())) || (com.aspose.cells.b.a.zr.a(f3) == com.aspose.cells.b.a.zr.a(localzo2.e())); f3 += f1 * a(k, a(paramzbt.j(), paramzbt.C(), (int)paramzbt.B(), (int)paramzbt.D(), paramzbt.e().U()), (int)paramzbt.D(), paramzbt.e().U()))
      {
        if (m != 0) {
          paramzbt.m().a(f2, f3, f2 + paramzbt.ab(), f3);
        }
        if (n != 0) {
          paramzbt.m().a(f2 - paramzbt.ab(), f3, f2, f3);
        }
      }
      if (paramInt <= 0) {
        break;
      }
      arrayOfzo[0].a(arrayOfzo[0].d() + paramInt);
      paramInt = 0;
    }
  }
  
  static void c(zr paramzr, zbt paramzbt)
    throws Exception
  {
    if (paramzbt.e().B().E()) {
      return;
    }
    zjf localzjf = paramzbt.e();
    zbyv localzbyv = localzjf.S();
    zo[] arrayOfzo = zjb.d(localzjf);
    zbt localzbt = localzjf.G();
    double d1 = localzbt.V();
    double d2 = localzbt.W();
    double d3 = localzbt.X();
    int i = 0;
    if (localzbt.D() == localzbt.l()) {
      i = 1;
    }
    if (localzbt.p()) {
      d3 = d1 - d3;
    } else {
      d3 -= d2;
    }
    int j = (int)(d3 / (d1 - d2) * localzjf.S().i());
    if (j != 0) {
      paramzbt.m().a(arrayOfzo[0].d(), arrayOfzo[0].e() - j, arrayOfzo[1].d(), arrayOfzo[1].e() - j);
    }
    if (localzjf.p() >= 0) {
      paramzbt.m().a(arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[1].d(), arrayOfzo[1].e());
    }
    if (paramzbt.I() == 2)
    {
      arrayOfzo[0].b(arrayOfzo[0].e() - j);
      arrayOfzo[1].b(arrayOfzo[1].e() - j);
    }
    zbff localzbff = localzjf.z();
    zbwv localzbwv = paramzbt.J();
    ArrayList localArrayList = localzjf.z().c();
    float f1 = paramzbt.J().q();
    double d4 = arrayOfzo[1].d() == arrayOfzo[0].d() ? 1.5707963267948966D : Math.atan(Math.abs((arrayOfzo[0].e() - arrayOfzo[1].e()) / (arrayOfzo[1].d() - arrayOfzo[0].d())));
    double d5 = 180.0D * d4 / 3.141592653589793D;
    float f2 = (arrayOfzo[1].d() - arrayOfzo[0].d()) / paramzbt.l.size();
    float f3 = (arrayOfzo[1].e() - arrayOfzo[0].e()) / paramzbt.l.size();
    for (int k = 0; k < paramzbt.l.size(); k++)
    {
      int m = k;
      if (paramzbt.p()) {
        m = paramzbt.l.size() - 1 - k;
      }
      String str = "";
      str = a(paramzbt, paramzbt.l.get(m));
      if ((paramzbt.I() != 3) && (m % paramzbt.H() == 0))
      {
        zq localzq = new zq(0.0F, 0.0F, 0.0F, 0.0F);
        if (localzjf.p() >= 0)
        {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            localzq.a(f2 < 0.0F ? arrayOfzo[0].d() + (k + 1) * f2 : arrayOfzo[0].d() + k * f2);
            localzq.b(arrayOfzo[0].e() + f1);
            localzq.c(Math.abs(f2 * paramzbt.H()));
            localzq.d(paramzbt.g);
          }
          else if (d4 <= 0.7853981633974483D)
          {
            localzq.a(f2 < 0.0F ? arrayOfzo[0].d() + (k + 1) * f2 : arrayOfzo[0].d() + k * f2);
            localzq.b(f3 > 0.0F ? arrayOfzo[0].e() + (k + 1) * f3 : arrayOfzo[0].e() + k * f3);
            localzq.c(Math.abs(f2));
            localzq.d(paramzbt.g);
          }
          else
          {
            localzq.a(f3 > 0.0F ? arrayOfzo[0].d() + k * f2 : arrayOfzo[0].d() + (k + 1) * f2);
            localzq.a(f2 * f3 <= 0.0F ? localzq.f() + f1 * (float)Math.sin(d4) : localzq.f() - f1 * (float)Math.sin(d4) - paramzbt.f);
            localzq.b(f3 > 0.0F ? arrayOfzo[0].e() + k * f3 : arrayOfzo[0].e() + (k + 1) * f3);
            localzq.b(localzq.g() + (Math.abs(f3) - paramzbt.g) * (float)Math.sin(d4) / 2.0F);
            localzq.c(paramzbt.f);
            localzq.d(paramzbt.g);
          }
        }
        else if ((localzjf.p() < 0) && (i == 0) && (paramzbt.I() == 2)) {
          if (arrayOfzo[0].e() == arrayOfzo[1].e())
          {
            localzq.a(f2 > 0.0F ? arrayOfzo[0].d() + k * f2 : arrayOfzo[0].d() + (k + 1) * f2);
            localzq.b(arrayOfzo[0].e() - paramzbt.g - f1);
            localzq.c(Math.abs(f2));
            localzq.d(paramzbt.g);
          }
          else if (d4 <= 0.7853981633974483D)
          {
            localzq.a(f2 < 0.0F ? arrayOfzo[0].d() + (k + 1) * f2 : arrayOfzo[0].d() + k * f2);
            localzq.b(f3 < 0.0F ? arrayOfzo[0].e() + (k + 1) * f3 : arrayOfzo[0].e() + k * f3);
            localzq.b(localzq.g() - paramzbt.g);
            localzq.c(Math.abs(f2));
            localzq.d(paramzbt.g);
          }
          else
          {
            localzq.a(f3 < 0.0F ? arrayOfzo[0].d() + k * f2 : arrayOfzo[0].d() + (k + 1) * f2);
            localzq.a(f2 * f3 >= 0.0F ? localzq.f() + f1 * (float)Math.sin(d4) : localzq.f() - f1 * (float)Math.sin(d4) - paramzbt.f);
            localzq.b(f3 < 0.0F ? arrayOfzo[0].e() + k * f3 : arrayOfzo[0].e() + (k + 1) * f3);
            localzq.b(localzq.g() - (Math.abs(f3) - paramzbt.g) * (float)Math.sin(d4) / 2.0F);
            localzq.b(localzq.g() - paramzbt.g);
            localzq.c(paramzbt.f);
            localzq.d(paramzbt.g);
          }
        }
        localzq.c(paramzbt.f);
        localzq.d(paramzbt.g);
        a(paramzr, zp.a(localzq), str, localzbwv.e(), localzbwv.a(), localzbwv.i(), 1, 1);
      }
    }
    a(paramzr, paramzbt, j, paramzbt.l.size());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */