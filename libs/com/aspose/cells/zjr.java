package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import java.util.ArrayList;
import java.util.List;

final class zjr
{
  static void a(zr paramzr, zjp paramzjp, boolean paramBoolean)
    throws Exception
  {
    if ((!paramzjp.a().u()) || (paramzjp.a().B().D())) {
      return;
    }
    zje localzje = paramzjp.a();
    zf localzf = null;
    int i = 0;
    if ((localzje.i().d().g()) && (localzje.ar().i() != 4))
    {
      localzf = localzje.ar().d();
      i = 1;
      localzje.ar().b(4, false);
    }
    int j = localzje.M();
    boolean bool1 = localzje.e().p();
    int k = paramzjp.a.c();
    int m = paramzjp.a.d();
    int n = paramzjp.a.e();
    com.aspose.cells.b.a.b.zs localzs1 = paramzjp.q();
    int i1 = localzs1.c() + paramzjp.r();
    zt localzt = zana.a(paramzr, paramzjp.a().x());
    ArrayList localArrayList1 = paramzjp.o().a(true, paramBoolean);
    zp localzp1 = new zp(k, m, n, i1);
    zp localzp2 = new zp(k - localzs1.b(), m + paramzjp.r(), n + localzs1.b(), localzs1.c());
    if (paramzjp.i())
    {
      zanv.a(paramzr, localzp1, paramzjp.d());
      zanv.a(paramzr, localzp2, paramzjp.d());
    }
    float f2;
    float f1;
    float f3;
    float f4;
    if (paramzjp.h())
    {
      f2 = localzp2.h();
      for (i2 = 0; i2 < localArrayList1.size() - 1; i2++)
      {
        localObject1 = (zamy)localArrayList1.get(i2);
        localObject2 = ((zamy)localObject1).i();
        f1 = localzp2.g();
        f2 += ((zbfc)localObject2).a.c();
        f3 = localzp2.i();
        f4 = f2;
        zanv.a(paramzr, f1, f2, f3, f4, paramzjp.d());
      }
    }
    int i2 = localzje.z().h();
    Object localObject1 = paramzjp.b();
    Object localObject2 = localzje.z().a();
    ArrayList localArrayList2 = localzje.z().c();
    zu localzu = new zu(paramzjp.c());
    try
    {
      float f5 = n / i2;
      Object localObject4;
      for (int i3 = 0; i3 < i2; i3++)
      {
        if (paramzjp.g())
        {
          f1 = k + f5 * i3;
          f2 = localzp1.h();
          f3 = f1;
          f4 = f2 + paramzjp.s();
          zanv.a(paramzr, f1, f2, f3, f4, paramzjp.d());
        }
        int i4 = i3;
        if (bool1) {
          i4 = i2 - i3 - 1;
        }
        String str1 = "";
        if ((i4 < ((zagz)localObject2).getCount()) && (localzje.z().e() == null))
        {
          localObject3 = ((zagz)localObject2).a(i4);
          str1 = zqz.a(localzje.an(), ((zagy)localObject3).a(), ((zagy)localObject3).c(), ((zagy)localObject3).b(), localzje.U());
        }
        else if (i4 < localArrayList2.size())
        {
          localObject3 = (zgm)localArrayList2.get(i4);
          str1 = zqz.a(localzje.an(), ((zgm)localObject3).a(), ((zgm)localObject3).c(), ((zgm)localObject3).b(), localzje.U());
        }
        Object localObject3 = new zq(k + i3 * f5, m + paramzjp.j(), f5, paramzjp.s() - paramzjp.j());
        localObject4 = new zv(zv.c());
        ((zv)localObject4).c(0);
        ((zv)localObject4).a(1);
        paramzr.a(str1, (zg)localObject1, localzu, (zq)localObject3, (zv)localObject4);
      }
      ArrayList[] arrayOfArrayList = localzje.z().e();
      Object localObject5;
      if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localzje.z().c().size() > 0))
      {
        zbs localzbs = localzje.e();
        float f7 = paramzjp.j();
        float f8 = (arrayOfArrayList.length + 1) * f7;
        localObject4 = arrayOfArrayList[0];
        localObject5 = (zgm)((List)localObject4).get(0);
        String str2 = zqz.a(localzje.an(), ((zgm)localObject5).a(), ((zgm)localObject5).c(), ((zgm)localObject5).b(), localzje.U());
        com.aspose.cells.b.a.b.zs localzs2 = zbvx.a(localzbs.c().ar(), str2, 0, (zg)localObject1, new com.aspose.cells.b.a.b.zs(n, paramzjp.r()), 1, 1);
        float f11 = m;
        boolean bool2 = false;
        float f12 = localzp2.h();
        float f13 = 0.0F;
        if (!bool1) {
          f13 = localzp1.g();
        } else {
          f13 = localzp1.i();
        }
        a(paramzr, arrayOfArrayList, f13, f12, f7, bool2, localzbs, f5, paramzjp, 1, f11, localzp1, false);
      }
      float f6 = localzp2.h();
      for (int i5 = 0; i5 < localArrayList1.size(); i5++)
      {
        zamy localzamy = (zamy)localArrayList1.get(i5);
        localObject4 = localzamy.i();
        localObject5 = new zo(localzp2.g() + paramzjp.k(), f6 + paramzjp.j());
        float f9 = ((zbfc)localObject4).a.b();
        float f10 = ((zbfc)localObject4).a.c();
        if (paramzjp.f())
        {
          localObject6 = new zq(localzp2.g() + paramzjp.l(), f6 + paramzjp.j(), paramzjp.m(), paramzjp.p());
          a(paramzr, paramzjp, (zq)localObject6, (zbfc)localObject4);
          ((zo)localObject5).a(((zo)localObject5).d() + (paramzjp.l() + paramzjp.m()));
          f9 -= paramzjp.l() + paramzjp.m();
        }
        Object localObject6 = ((zbfc)localObject4).i();
        zq localzq1 = new zq(((zo)localObject5).d(), ((zo)localObject5).e(), f9, f10);
        zv localzv1 = new zv(zv.c());
        paramzr.a((String)localObject6, (zg)localObject1, localzu, localzq1, localzv1);
        for (int i6 = 0; i6 < ((zbfc)localObject4).D().getCount(); i6++)
        {
          if ((paramzjp.g()) && (i6 < ((zbfc)localObject4).D().getCount() - 1))
          {
            f1 = k + (i6 + 1) * f5;
            f2 = f6;
            f3 = f1;
            f4 = f6 + ((zbfc)localObject4).a.c();
            zanv.a(paramzr, f1, f2, f3, f4, paramzjp.d());
          }
          int i7 = i6;
          if (bool1) {
            i7 = ((zbfc)localObject4).D().getCount() - i6 - 1;
          }
          zke localzke = ((zbfc)localObject4).D().b(i7);
          if (!localzke.a())
          {
            String str3 = localzke.A();
            boolean bool3 = localzke.B();
            localObject6 = zqz.a(localzje.an(), Double.valueOf(localzke.w()), str3, bool3, localzje.U());
            zq localzq2 = new zq(k + i6 * f5, f6 + paramzjp.j(), f5, ((zbfc)localObject4).a.c() - 2 * paramzjp.j());
            zv localzv2 = new zv(zv.c());
            localzv2.a(1);
            localzv2.c(0);
            paramzr.a((String)localObject6, (zg)localObject1, localzu, localzq2, localzv2);
          }
        }
        f6 += ((zbfc)localObject4).a.c();
      }
    }
    finally
    {
      if (localzu != null) {
        localzu.f();
      }
    }
    if ((localzje.i().d().g()) && (i != 0)) {
      localzje.ar().a(localzf);
    }
  }
  
  static void a(zr paramzr, zjp paramzjp, zq paramzq, zbfc paramzbfc)
    throws Exception
  {
    float f1;
    if ((paramzbfc.m() == 12) || (paramzbfc.m() == 13))
    {
      f1 = paramzjp.n();
      zq localzq1 = new zq(paramzq.f(), paramzq.g() + (paramzq.i() - f1) / 2.0F, f1, f1);
      zc localzc = zbd.a(paramzbfc.A(), localzq1);
      try
      {
        paramzr.a(localzc, localzq1);
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
      com.aspose.cells.a.d.zs localzs = zanv.a(paramzbfc.z());
      try
      {
        paramzr.a(localzs, localzq1);
      }
      finally
      {
        if (localzs != null) {
          localzs.s();
        }
      }
    }
    else
    {
      float f2;
      if (paramzbfc.ak())
      {
        if (paramzbfc.z().e()) {
          zanv.a(paramzr, paramzq.f(), paramzq.g() + paramzq.i() / 2.0F, paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() / 2.0F, paramzbfc.z());
        }
        if (paramzbfc.B().d() != 1)
        {
          f1 = paramzq.f() + paramzq.h() / 2.0F;
          f2 = paramzq.g() + paramzq.i() / 2.0F;
          float f3;
          if (paramzbfc.B().c() == 0)
          {
            f3 = paramzq.i() * zana.b;
          }
          else
          {
            int i = (int)(paramzbfc.h().c() * 72 / paramzr.f());
            if (i <= paramzq.i() * zana.b)
            {
              f3 = paramzbfc.B().c();
            }
            else
            {
              float f4 = i / paramzbfc.v().i().m();
              if (f4 > 1.0F) {
                f4 = 1.0F;
              }
              f3 = paramzq.i() * zana.b * (1.0F + f4);
              f3 = (int)(f3 * paramzr.f() / 72.0F + 0.5D);
            }
          }
          zana.a(paramzr, f1, f2, paramzbfc.B(), f3, true);
        }
      }
      else
      {
        f1 = paramzq.h();
        f2 = paramzjp.n();
        zq localzq2 = new zq(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F - f2 / 2.0F, f1, f2);
        zbd.a(paramzr, localzq2, paramzbfc.A());
        zanv.a(paramzr, localzq2, paramzbfc.z());
      }
    }
  }
  
  private static void a(zr paramzr, ArrayList[] paramArrayOfArrayList, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean1, zbs paramzbs, double paramDouble, zjp paramzjp, int paramInt, float paramFloat4, zp paramzp, boolean paramBoolean2)
  {
    zje localzje = paramzjp.a();
    int i = 0;
    float f1 = paramFloat2;
    zt localzt = new zt((float)paramDouble, paramzp.f() / 2.0F);
    for (int j = 0; j < paramArrayOfArrayList.length; j++)
    {
      ArrayList localArrayList = paramArrayOfArrayList[j];
      com.aspose.cells.b.a.b.zs localzs = a(paramzr, localArrayList, i, paramzjp, localzt);
      float f2 = paramFloat1;
      for (int k = 0; k < localArrayList.size(); k++)
      {
        zgm localzgm = (zgm)localArrayList.get(k);
        String str = zqz.a(localzje.an(), localzgm.a(), localzgm.c(), localzgm.b(), localzje.U());
        int m = zbu.a(localzgm);
        float f3 = (float)(m * paramDouble);
        float f4;
        if (!paramzbs.p()) {
          f4 = f2 + f3 / 2.0F - localzs.b() / 2;
        } else {
          f4 = f2 - f3 / 2.0F - localzs.b() / 2;
        }
        float f5 = paramBoolean1 ? f1 : f1 - localzs.c();
        zq localzq = new zq(f4, f5, localzs.b(), localzs.c());
        zbu.a(paramzr, zp.a(localzq), str, i, paramzjp.b(), paramzjp.c(), 1, paramInt);
        if (paramzbs.c().l().g()) {
          zanv.a(paramzr, f2, paramFloat4, f2, f1, paramzjp.d());
        }
        if (paramzbs.c().l().g())
        {
          float f6 = f1;
          f6 = paramBoolean1 ? f1 + (paramFloat3 + localzs.c()) : f1 - (paramFloat3 + localzs.c());
          a(paramzr, localzgm.d(), f2, paramFloat4, f6, paramBoolean1, paramzbs, paramDouble);
        }
        if (!paramzbs.p()) {
          f2 += f3;
        } else {
          f2 -= f3;
        }
      }
      if (paramzbs.c().l().g()) {
        zanv.a(paramzr, f2, paramFloat4, f2, f1, paramzjp.d());
      }
      if (paramBoolean1) {
        f1 += paramFloat3 + localzs.c();
      } else {
        f1 -= paramFloat3 + localzs.c();
      }
    }
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, List paramList, int paramInt, zjp paramzjp, zt paramzt)
  {
    zje localzje = paramzjp.a();
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramList.size(); k++)
    {
      zgm localzgm = (zgm)paramList.get(k);
      String str = zqz.a(paramzjp.a().an(), localzgm.a(), localzgm.c(), localzgm.b(), localzje.U());
      com.aspose.cells.b.a.b.zs localzs = zbvx.a(paramzr, str, paramInt, paramzjp.b(), paramzt, 1, 1);
      if (localzs.b() > i) {
        i = localzs.b();
      }
      if (localzs.c() > j) {
        j = localzs.c();
      }
    }
    return new com.aspose.cells.b.a.b.zs(i, j);
  }
  
  private static void a(zr paramzr, zagz paramzagz, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean, zbs paramzbs, double paramDouble)
  {
    float f1 = paramFloat1;
    for (int i = 0; i < paramzagz.getCount(); i++)
    {
      zgm localzgm = (zgm)paramzagz.a(i);
      int j = zbu.a(localzgm);
      float f2 = (float)(j * paramDouble);
      if (!paramzbs.p()) {
        f1 += f2;
      } else {
        f1 -= f2;
      }
      zanv.a(paramzr, f1, paramFloat2, f1, paramFloat3, paramzbs.c().k().d());
    }
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, zjp paramzjp, zp paramzp)
  {
    if (!paramzjp.a().u()) {
      return new com.aspose.cells.b.a.b.zs(0, 0);
    }
    zje localzje = paramzjp.a();
    zt localzt1 = new zt(paramzp.e() / 3, paramzp.f() / 3);
    int i = paramzjp.m();
    if (paramzjp.f()) {
      localzt1.a(localzt1.b() - (paramzjp.l() + i));
    }
    zt localzt2 = new zt(0.0F, 0.0F);
    zamw localzamw = paramzjp.o();
    for (int j = 0; j < localzamw.getCount(); j++)
    {
      zamy localzamy = localzamw.c(j);
      zbfc localzbfc = localzamy.i();
      String str = localzbfc.i();
      zt localzt3 = zbxz.a(paramzr, str, paramzjp.b(), localzt1);
      localzt3.a(localzt3.b() + 2 * paramzjp.k());
      localzt3.b(localzt3.c() + 2 * paramzjp.j());
      if (paramzjp.f()) {
        localzt3.a(localzt3.b() + (paramzjp.l() + i));
      }
      localzbfc.a = new com.aspose.cells.b.a.b.zs(zbxz.a(localzt3.b()), zbxz.a(localzt3.c()));
      if (localzt2.b() < localzt3.b()) {
        localzt2.a(localzt3.b());
      }
      localzt2.b(localzt2.c() + localzt3.c());
    }
    return new com.aspose.cells.b.a.b.zs(zbxz.a(localzt2.b()), zbxz.a(localzt2.c()));
  }
  
  static int b(zr paramzr, zjp paramzjp, zp paramzp)
  {
    com.aspose.cells.b.a.b.zs localzs1 = zbvx.a(paramzr, "a", paramzjp.b());
    int i = 0;
    zje localzje1 = paramzjp.a();
    zg localzg = paramzjp.b();
    zje localzje2 = paramzjp.a();
    ArrayList localArrayList = localzje2.z().c();
    ArrayList[] arrayOfArrayList = localzje2.z().e();
    float f = paramzp.e() / localArrayList.size();
    zt localzt = new zt(f, paramzp.f() / 2.0F);
    com.aspose.cells.b.a.b.zs localzs2 = new com.aspose.cells.b.a.b.zs(0, 0);
    Object localObject;
    com.aspose.cells.b.a.b.zs localzs3;
    if (localArrayList.size() > 0) {
      for (j = 0; j < localArrayList.size(); j++)
      {
        zgm localzgm = (zgm)localArrayList.get(j);
        localObject = zqz.a(paramzjp.a().an(), localzgm.a(), localzgm.c(), localzgm.b(), localzje1.U());
        localzs3 = zbvx.a(paramzr, (String)localObject, 0, localzg, localzt, 1, 1);
        if (localzs3.b() > localzs2.b()) {
          localzs2.a(localzs3.b());
        }
        if (localzs3.c() > localzs2.c()) {
          localzs2.b(localzs3.c());
        }
      }
    } else {
      localzs2 = zbvx.a(paramzr, "123", 0, localzg, localzt, 1, 1);
    }
    if (localzs2.c() > localzs1.c() * 2) {
      localzs2.b(localzs1.c() * 2);
    }
    paramzjp.b(localzs2.c() + paramzjp.j() * 2);
    i += paramzjp.s();
    int j = 0;
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList.size() > 0))
    {
      i += paramzjp.j() * arrayOfArrayList.length;
      for (int k = 0; k < arrayOfArrayList.length; k++)
      {
        localObject = arrayOfArrayList[k];
        localzs3 = a(paramzr, (List)localObject, 0, paramzjp, localzt);
        j += localzs3.c();
      }
    }
    i += j;
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */