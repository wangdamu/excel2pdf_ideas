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

final class zjs
{
  static void a(zr paramzr, zjq paramzjq, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    if ((!paramzjq.a().u()) || (paramzjq.a().B().E())) {
      return;
    }
    com.aspose.cells.b.a.b.zs localzs1 = zbvy.a(paramzr, "a", paramzjq.b());
    int i = localzs1.b() * paramzjq.a().e().G().d() / 300;
    zjf localzjf = paramzjq.a();
    zf localzf = null;
    int j = 0;
    if ((localzjf.i().c().k()) && (localzjf.ap().i() != 4))
    {
      localzf = localzjf.ap().d();
      j = 1;
      localzjf.ap().b(4, false);
    }
    int k = localzjf.N();
    boolean bool1 = localzjf.e().p();
    com.aspose.cells.b.a.b.zs localzs2 = paramzjq.k();
    int m = localzs2.c() + paramzjq.l();
    zt localzt = zanb.a(paramzr, paramzjq.a().x());
    ArrayList localArrayList1 = paramzjq.j().a(true, paramBoolean1, paramBoolean2);
    zp localzp1 = new zp(paramInt1, paramInt2, paramInt3, m);
    zp localzp2 = new zp(paramInt1 - localzs2.b(), paramInt2 + paramzjq.l(), paramInt3 + localzs2.b(), localzs2.c());
    if (paramzjq.i())
    {
      paramzjq.d().a(localzp1);
      paramzjq.d().a(localzp2);
    }
    float f1 = localzs2.c() / localArrayList1.size();
    float f2;
    float f3;
    float f4;
    float f5;
    if (paramzjq.h()) {
      for (n = 1; n < localArrayList1.size(); n++)
      {
        f2 = localzp2.g();
        f3 = localzp2.h() + n * f1;
        f4 = localzp2.i();
        f5 = f3;
        paramzjq.d().a(f2, f3, f4, f5);
      }
    }
    int n = localzjf.z().h();
    zg localzg = paramzjq.b();
    zu localzu = new zu(paramzjq.c());
    float f6 = paramInt3 / n;
    zbt localzbt1 = localzjf.e();
    zagz localzagz = localzjf.z().a();
    ArrayList localArrayList2 = localzjf.z().c();
    ArrayList[] arrayOfArrayList = localzjf.z().e();
    zbwv localzbwv = localzbt1.J();
    Object localObject1;
    Object localObject2;
    for (int i1 = 0; i1 < n; i1++)
    {
      if (paramzjq.g())
      {
        f2 = paramInt1 + f6 * i1;
        f3 = localzp1.h();
        f4 = f2;
        f5 = f3 + paramzjq.m();
        paramzjq.d().a(f2, f3, f4, f5);
      }
      int i3 = i1;
      if (bool1) {
        i3 = n - i1 - 1;
      }
      String str1 = "";
      if ((i3 < localzagz.getCount()) && (localzjf.z().e() == null))
      {
        localObject1 = localzagz.a(i3);
        str1 = zra.a(localzjf.an(), ((zagy)localObject1).a(), ((zagy)localObject1).c(), ((zagy)localObject1).b(), localzjf.U());
      }
      else if (i3 < localArrayList2.size())
      {
        localObject1 = (zgn)localArrayList2.get(i3);
        str1 = zra.a(localzjf.an(), ((zgn)localObject1).a(), ((zgn)localObject1).c(), ((zgn)localObject1).b(), localzjf.U());
      }
      localObject1 = new zq(paramInt1 + i1 * f6, paramInt2 + i, f6, paramzjq.m() - i);
      localObject2 = new zv(zv.c());
      ((zv)localObject2).c(0);
      ((zv)localObject2).a(1);
      paramzr.a(str1, localzg, localzu, (zq)localObject1, (zv)localObject2);
    }
    Object localObject3;
    Object localObject4;
    float f12;
    float f13;
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localzjf.z().c().size() > 0))
    {
      zbt localzbt2 = localzjf.e();
      float f7 = i;
      float f8 = (arrayOfArrayList.length + 1) * f7;
      localObject1 = arrayOfArrayList[0];
      localObject2 = (zgn)((List)localObject1).get(0);
      localObject3 = zra.a(localzjf.an(), ((zgn)localObject2).a(), ((zgn)localObject2).c(), ((zgn)localObject2).b(), localzjf.U());
      localObject4 = zbvy.a(localzbt2.e().ap(), (String)localObject3, 0, localzg, new com.aspose.cells.b.a.b.zs(paramInt3, paramzjq.l()), 1, 1, localzbwv.n());
      float f11 = paramInt2;
      f12 = 0;
      f13 = localzp2.h();
      float f14 = 0.0F;
      if (!bool1) {
        f14 = localzp1.g();
      } else {
        f14 = localzp1.i();
      }
      a(paramzr, arrayOfArrayList, f14, f13, f7, f12, localzbt2, f6, paramzjq, 1, f11, localzp1, false);
    }
    for (int i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      zamz localzamz = (zamz)localArrayList1.get(i2);
      zbfd localzbfd = localzamz.l();
      float f9 = localzp2.h() + i2 * f1;
      float f10 = 0.0F;
      if (paramzjq.f())
      {
        localObject3 = new zq(localzp2.g() + zanb.a, f9, localzt.b(), f1);
        zanb.a(paramzr, localzjf.x(), (zq)localObject3, localzamz);
        f10 = localzt.b() + zanb.a;
      }
      localObject3 = localzbfd.i();
      localObject4 = zbvy.b(paramzr, (String)localObject3, localzg);
      zo localzo = new zo(paramInt1 - localzs2.b() + f10, f9 + f1 / 2.0F - ((zt)localObject4).c() / 2.0F);
      paramzr.a((String)localObject3, localzg, localzu, localzo);
      for (f12 = 0; f12 < n; f12++)
      {
        if ((paramzjq.g()) && (f12 < n - 1))
        {
          f2 = paramInt1 + (f12 + 1) * f6;
          f3 = f9;
          f4 = f2;
          f5 = f9 + f1;
          paramzjq.d().a(f2, f3, f4, f5);
        }
        if (f12 <= localzbfd.F().getCount() - 1)
        {
          f13 = f12;
          int i4;
          if (bool1) {
            i4 = localzbfd.F().getCount() - f12 - 1;
          }
          zkf localzkf = localzbfd.F().b(i4);
          if ((!localzkf.a()) && ((localzkf.y() == null) || (!com.aspose.cells.b.a.zs.a(localzkf.y()).equals("#N/A"))))
          {
            String str2 = localzkf.A();
            boolean bool2 = localzkf.B();
            localObject3 = zra.a(localzjf.an(), Double.valueOf(localzkf.w()), str2, bool2, localzjf.U());
            localObject4 = zbvy.b(paramzr, (String)localObject3, localzg);
            float f15 = paramInt1 + f12 * f6;
            float f16 = f6;
            while ((f6 - i < ((zt)localObject4).b()) && (((String)localObject3).length() > 0))
            {
              localObject3 = ((String)localObject3).substring(0, 0 + (((String)localObject3).length() - 1));
              if (((String)localObject3).charAt(((String)localObject3).length() - 1) == '.') {
                localObject3 = ((String)localObject3).substring(0, 0 + (((String)localObject3).length() - 1));
              }
              localObject4 = zbvy.b(paramzr, (String)localObject3, localzg);
            }
            f15 += f6 / 2.0F - ((zt)localObject4).b() / 2.0F;
            f16 -= f6 / 2.0F - ((zt)localObject4).b() / 2.0F;
            localzo = new zo(f15, f9 + f1 / 2.0F - ((zt)localObject4).c() / 2.0F);
            zv localzv = new zv(zv.c());
            paramzr.a((String)localObject3, localzg, localzu, localzo, localzv);
          }
        }
      }
    }
    if (localzu != null) {
      localzu.h();
    }
    if ((localzjf.i().c().k()) && (j != 0)) {
      localzjf.ap().a(localzf);
    }
  }
  
  private static void a(zr paramzr, ArrayList[] paramArrayOfArrayList, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean1, zbt paramzbt, double paramDouble, zjq paramzjq, int paramInt, float paramFloat4, zp paramzp, boolean paramBoolean2)
  {
    zjf localzjf = paramzjq.a();
    int i = 0;
    float f1 = paramFloat2;
    zt localzt = new zt((float)paramDouble, paramzp.f() / 2.0F);
    for (int j = 0; j < paramArrayOfArrayList.length; j++)
    {
      ArrayList localArrayList = paramArrayOfArrayList[j];
      com.aspose.cells.b.a.b.zs localzs = a(paramzr, localArrayList, i, paramzjq, localzt);
      float f2 = paramFloat1;
      for (int k = 0; k < localArrayList.size(); k++)
      {
        zgn localzgn = (zgn)localArrayList.get(k);
        String str = zra.a(localzjf.an(), localzgn.a(), localzgn.c(), localzgn.b(), localzjf.U());
        int m = zbv.a(localzgn);
        float f3 = (float)(m * paramDouble);
        float f4;
        if (!paramzbt.p()) {
          f4 = f2 + f3 / 2.0F - localzs.b() / 2;
        } else {
          f4 = f2 - f3 / 2.0F - localzs.b() / 2;
        }
        float f5 = paramBoolean1 ? f1 : f1 - localzs.c();
        zq localzq = new zq(f4, f5, localzs.b(), localzs.c());
        zbv.b(paramzr, zp.a(localzq), str, i, paramzjq.b(), paramzjq.c(), 1, paramInt);
        if (paramzbt.e().l().g()) {
          paramzjq.d().a(f2, paramFloat4, f2, f1);
        }
        if (paramzbt.e().l().g())
        {
          float f6 = f1;
          f6 = paramBoolean1 ? f1 + (paramFloat3 + localzs.c()) : f1 - (paramFloat3 + localzs.c());
          a(paramzr, localzgn.d(), f2, paramFloat4, f6, paramBoolean1, paramzbt, paramDouble);
        }
        if (!paramzbt.p()) {
          f2 += f3;
        } else {
          f2 -= f3;
        }
      }
      if (paramzbt.e().l().g()) {
        paramzjq.d().a(f2, paramFloat4, f2, f1);
      }
      if (paramBoolean1) {
        f1 += paramFloat3 + localzs.c();
      } else {
        f1 -= paramFloat3 + localzs.c();
      }
    }
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, List paramList, int paramInt, zjq paramzjq, zt paramzt)
  {
    zjf localzjf = paramzjq.a();
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramList.size(); k++)
    {
      zgn localzgn = (zgn)paramList.get(k);
      String str = zra.a(localzjf.an(), localzgn.a(), localzgn.c(), localzgn.b(), localzjf.U());
      com.aspose.cells.b.a.b.zs localzs = zbvy.a(paramzr, str, paramInt, paramzjq.b(), paramzt, 1, 1, 0);
      if (localzs.b() > i) {
        i = localzs.b();
      }
      if (localzs.c() > j) {
        j = localzs.c();
      }
    }
    return new com.aspose.cells.b.a.b.zs(i, j);
  }
  
  private static void a(zr paramzr, zagz paramzagz, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean, zbt paramzbt, double paramDouble)
  {
    float f1 = paramFloat1;
    for (int i = 0; i < paramzagz.getCount(); i++)
    {
      zgn localzgn = (zgn)paramzagz.a(i);
      int j = zbv.a(localzgn);
      float f2 = (float)(j * paramDouble);
      if (!paramzbt.p()) {
        f1 += f2;
      } else {
        f1 -= f2;
      }
      paramzbt.e().k().d().a(f1, paramFloat2, f1, paramFloat3);
    }
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, zjq paramzjq)
    throws Exception
  {
    zt localzt1 = b(paramzr, paramzjq);
    zt localzt2;
    int i;
    if (paramzjq.f())
    {
      localzt2 = zanb.a(paramzr, paramzjq.a().x());
      i = (int)(localzt2.b() + localzt1.b()) + zanb.a + 1;
    }
    else
    {
      i = (int)localzt1.b() + 1;
      if (localzt1.b() == 0.0F) {
        i += zanb.a;
      }
    }
    int j;
    if (localzt1.c() == 0.0F)
    {
      localzt2 = paramzr.a("A", paramzjq.b());
      j = (int)(localzt2.c() + 0.5D) + 1 + zanb.a;
    }
    else
    {
      j = (int)(localzt1.c() + 0.5D) + 2;
    }
    if (i > paramzjq.a().a()) {
      i = paramzjq.a().a();
    }
    if (i > paramzjq.a().i().l() - 2 * ziz.a) {
      i = paramzjq.a().i().l() - 2 * ziz.a;
    }
    return new com.aspose.cells.b.a.b.zs(i, j * paramzjq.a().A().getCount());
  }
  
  private static zt b(zr paramzr, zjq paramzjq)
  {
    zbff localzbff = paramzjq.a().z();
    zt localzt1 = new zt(0.0F, 0.0F);
    for (int i = 0; i < localzbff.getCount(); i++)
    {
      zbfd localzbfd = localzbff.c(i);
      zt localzt2 = paramzr.a(localzbfd.i(), paramzjq.b());
      if (localzt1.b() < localzt2.b()) {
        localzt1.a(localzt2.b());
      }
      if (localzt1.c() < localzt2.c()) {
        localzt1.b(localzt2.c());
      }
    }
    return localzt1;
  }
  
  static int a(zr paramzr, zjq paramzjq, zp paramzp)
  {
    zjf localzjf1 = paramzjq.a();
    com.aspose.cells.b.a.b.zs localzs1 = zbvy.a(paramzr, "a", paramzjq.b());
    int i = localzs1.b() * paramzjq.a().e().G().d() / 300;
    int j = 0;
    j += i;
    zg localzg = paramzjq.b();
    zjf localzjf2 = paramzjq.a();
    ArrayList localArrayList = localzjf2.z().c();
    ArrayList[] arrayOfArrayList = localzjf2.z().e();
    float f = paramzp.e() / localArrayList.size();
    zt localzt = new zt(f, paramzp.f() / 2.0F);
    com.aspose.cells.b.a.b.zs localzs2 = new com.aspose.cells.b.a.b.zs(0, 0);
    Object localObject;
    com.aspose.cells.b.a.b.zs localzs3;
    if (localArrayList.size() > 0) {
      for (k = 0; k < localArrayList.size(); k++)
      {
        zgn localzgn = (zgn)localArrayList.get(k);
        localObject = zra.a(localzjf1.an(), localzgn.a(), localzgn.c(), localzgn.b(), localzjf1.U());
        localzs3 = zbvy.a(paramzr, (String)localObject, 0, localzg, localzt, 1, 1, 0);
        if (localzs3.b() > localzs2.b()) {
          localzs2.a(localzs3.b());
        }
        if (localzs3.c() > localzs2.c()) {
          localzs2.b(localzs3.c());
        }
      }
    } else {
      localzs2 = zbvy.a(paramzr, "123", 0, localzg, localzt, 1, 1, 0);
    }
    j += localzs2.c();
    paramzjq.b(j);
    int k = 0;
    if ((arrayOfArrayList != null) && (arrayOfArrayList.length > 0) && (localArrayList.size() > 0))
    {
      j += i * arrayOfArrayList.length;
      for (int m = 0; m < arrayOfArrayList.length; m++)
      {
        localObject = arrayOfArrayList[m];
        localzs3 = a(paramzr, (List)localObject, 0, paramzjq, localzt);
        k += localzs3.c();
      }
    }
    j += k;
    return j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */