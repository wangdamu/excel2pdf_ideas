package com.aspose.cells;

import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.util.ArrayList;

final class zanb
{
  static int a = 4;
  static float b = 0.4F;
  
  private static zt d(zr paramzr, zamv paramzamv)
  {
    zbff localzbff = paramzamv.c().a().z();
    zt localzt1 = new zt(0.0F, 0.0F);
    for (int i = 0; i < localzbff.getCount(); i++)
    {
      zbfd localzbfd = localzbff.c(i);
      zt localzt2 = paramzr.a(localzbfd.i(), paramzamv.c().h());
      if (localzt1.b() < localzt2.b()) {
        localzt1.a(localzt2.b());
      }
      if (localzt1.c() < localzt2.c()) {
        localzt1.b(localzt2.c());
      }
    }
    return localzt1;
  }
  
  private static boolean a(zbff paramzbff)
  {
    boolean bool = false;
    for (int i = 0; i < paramzbff.getCount(); i++)
    {
      zbfd localzbfd = paramzbff.c(i);
      if ((localzbfd.z().h()) && (localzbfd.am()))
      {
        bool = true;
        break;
      }
    }
    return bool;
  }
  
  static zt a(zr paramzr, zamv paramzamv)
  {
    zt localzt = d(paramzr, paramzamv);
    boolean bool = a(paramzamv.c().a().z());
    if (localzt.b() == 0.0F)
    {
      if (bool) {
        return new zt(zjj.a, paramzamv.p());
      }
      return new zt(paramzamv.m(), paramzamv.p());
    }
    float f1 = localzt.c() * zjj.b;
    float f2 = localzt.c();
    if (bool) {
      f1 = zjj.a;
    }
    return new zt(f1, f2);
  }
  
  static void a(zamv paramzamv, zp paramzp)
  {
    zs localzs = paramzamv.c().b.b();
    int i = paramzp.f();
    int j = paramzp.e();
    switch (paramzamv.d())
    {
    case 0: 
    case 5: 
      break;
    case 1: 
      break;
    case 2: 
    case 4: 
      if (paramzamv.c().a().M().c()) {
        paramzamv.c().b.b(paramzp.d() + (i - localzs.c()) / 2);
      } else {
        paramzamv.c().b.b(paramzp.d() + (i - localzs.c()) / 2);
      }
      break;
    }
  }
  
  static int a(zbfd paramzbfd, int paramInt)
  {
    if (paramInt == -1) {
      return 3;
    }
    if (paramzbfd.m() == 12) {
      return 7;
    }
    paramInt %= 9;
    paramInt += 2;
    switch (paramInt)
    {
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 6;
    case 7: 
      return 7;
    case 8: 
      return 8;
    case 9: 
      return 9;
    case 10: 
      return 10;
    }
    return 1;
  }
  
  static boolean a(zjf paramzjf)
  {
    if ((paramzjf.N() == 77) || (paramzjf.N() == 76)) {
      return true;
    }
    if (paramzjf.z().getCount() != 1) {
      return false;
    }
    zbfd localzbfd = paramzjf.z().c(0);
    int[] arrayOfInt = { 14, 16, 17, 20, 18, 19, 15, 6, 8, 11, 9, 7, 37, 39, 42, 43, 38, 41, 40, 60, 61, 62, 63, 64, 57, 59, 58, 12, 13, 28, 30, 31, 33, 32, 34, 29, 21, 23, 22, 24, 26, 25, 27, 50, 52, 53, 55, 54, 56, 51 };
    for (int i = 0; (i < arrayOfInt.length) && (localzbfd.m() != arrayOfInt[i]); i++) {}
    if (i == arrayOfInt.length) {
      return false;
    }
    zkh localzkh = localzbfd.F();
    int j = localzbfd.m();
    if (localzbfd.J()) {
      return true;
    }
    return (localzkh.getCount() > 0) && (!a(localzkh));
  }
  
  private static boolean a(zkh paramzkh)
  {
    for (int i = 1; i < paramzkh.getCount(); i++) {
      if ((!paramzkh.b(0).i().a(paramzkh.b(i).i())) || (!paramzkh.b(0).k().b(paramzkh.b(i).k())) || (!paramzkh.b(0).m().a(paramzkh.b(i).m()))) {
        return false;
      }
    }
    return true;
  }
  
  static void a(zr paramzr, zamv paramzamv, zbfd paramzbfd)
    throws Exception
  {
    paramzamv.c().z();
    zamx localzamx = paramzamv.e();
    int i = paramzamv.e().a();
    zjf localzjf = paramzamv.c().a();
    paramzamv.c().H();
    float f1 = localzjf.b() / 3.0F;
    zt localzt1 = b(paramzr, paramzamv);
    int j = paramzamv.j();
    int k = paramzamv.l();
    float f2 = paramzamv.r();
    float f3 = paramzamv.s();
    int m = 1;
    int n = paramzamv.c().a.e();
    int i1 = paramzamv.c().a.f();
    float f4 = 0.0F;
    float f5 = 0.0F;
    zt localzt2 = zt.a();
    int i4 = 0;
    zt localzt3 = zt.a();
    zt localzt4 = a(paramzr, paramzamv, new zt(localzjf.a(), localzjf.b()));
    int i5 = (int)(localzt1.b() * i + localzt4.b());
    int i6 = 0;
    int i7 = 0;
    int i2;
    int i3;
    if (i5 <= n - j)
    {
      i2 = i;
      i3 = 1;
      f4 = (n - j - i5) / i2;
      f5 = (i1 - paramzamv.p() * i3) / i3;
      i7 = 1;
      if ((f4 > i2) && (paramzamv.h()))
      {
        f4 = (n - 2 * j - i5) / i2;
        i6 = 1;
      }
    }
    else
    {
      int i8 = n - j;
      int i9 = i8 - (int)localzt1.b();
      localzt3 = new zt(i9, f1);
      localzt2 = b(paramzr, paramzamv, localzt3);
      i4 = (int)(localzt1.b() + localzt2.b());
      i2 = zbxz.b(i8 / i4);
      if (i2 < 1) {
        i2 = 1;
      }
      if ((paramzamv.c().s()) && (paramzamv.t() > 0) && (i2 == 1)) {
        i3 = paramzamv.t();
      } else {
        i3 = zbxz.a(i / i2);
      }
      if (!paramzamv.c().s())
      {
        f5 = (i1 - localzt2.c() * i3) / i3;
        i10 = i9 - i2 * (int)localzt1.b();
        if ((i2 < i) && (f5 < 0.0F) && (a(paramzamv, i10, i2 + 1)))
        {
          i2++;
          i3 = zbxz.a(i / i2);
        }
      }
      if ((i3 > 1) && (i2 > i3))
      {
        i10 = (int)Math.ceil(i / i3);
        if (i10 < i2) {
          i2 = i10;
        }
      }
      int i10 = zbxz.b(i1 / localzt2.c());
      int i11 = zbxz.b(i1 / localzt2.c() + i10 * 0.15F);
      if (i11 == 0) {
        i3 = 1;
      } else if (i3 > i11) {
        i3 = i11;
      }
      f4 = (i8 - i4 * i2) / i2;
      f5 = (i1 - localzt2.c() * i3) / i3;
      m = zbxz.a(localzt2.c() / paramzamv.p());
    }
    if (f4 < 0.0F) {
      f4 = 0.0F;
    }
    if ((m <= 1) && (f5 < f2)) {
      f5 = f2;
    }
    float f6 = paramzamv.c().a.c();
    float f7 = paramzamv.c().a.d();
    f6 += j;
    if (i6 != 0) {
      f6 += j;
    }
    f6 += f4 / 2.0F;
    if (f5 > 0.0F) {
      f7 += f5 / 2.0F;
    } else {
      f7 += f5 / 2.0F;
    }
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    zq localzq1 = paramzr.e();
    paramzr.a(paramzamv.c().a);
    zv localzv = new zv(zv.c());
    for (int i12 = 0; i12 < paramzamv.e().getCount(); i12++)
    {
      zamz localzamz = paramzamv.e().b(i12);
      if (!localzamz.b())
      {
        if (f7 > paramzamv.c().a.j()) {
          break;
        }
        zq localzq2 = new zq(f6, f7, localzt1.b(), localzt1.c());
        a(paramzr, localzq2, paramzbfd, localzamz.f());
        String str = localzamz.g();
        zo localzo = new zo(f6 + localzt1.b() + k, f7);
        if (i7 != 0)
        {
          paramzr.a(str, localzamz.c(), new zu(localzamz.e()), localzo.d(), localzo.e(), localzv);
          zs localzs = paramzamv.c().a.b();
          if (localzs.c() < paramzamv.p()) {
            localzs.b(zbxz.c(paramzamv.p() + 1.0F));
          }
          zt localzt5 = zbxz.a(paramzr, str, localzamz.c(), localzs);
          f6 += localzt1.b() + localzt5.b() + 2 * k;
          if ((localzjf.as().getImageFormat() == ImageFormat.getEmf()) && (localzamz.c().h() <= 8.0F)) {
            if (localzamz.c().h() <= 6.0F) {
              f6 += str.length() / 5.0F * k;
            } else if (localzamz.c().h() <= 8.0F) {
              f6 += str.length() / 10.0F * k;
            }
          }
          f6 += f4;
        }
        else
        {
          float f8 = zbxz.a(localzt3.b());
          float f9 = zbxz.a(localzt3.c());
          zq localzq3 = new zq(localzo.d(), localzo.e(), f8, f9);
          paramzr.a(str, localzamz.c(), new zu(localzamz.e()), localzq3, localzv);
          f6 += i4;
          f6 += f4;
          if ((i12 + 1) % i2 == 0)
          {
            f6 = paramzamv.c().a.c() + j + f4 / 2.0F;
            f7 += localzt2.c();
            f7 += f5;
          }
          if (f7 + localzt2.c() / 2.0F > paramzamv.c().a.j()) {
            break;
          }
        }
      }
    }
    paramzr.a(localzf);
  }
  
  static void a(zr paramzr, zq paramzq, zbfd paramzbfd, int paramInt)
    throws Exception
  {
    int i = paramzbfd.m();
    zkf localzkf = paramzbfd.F().b(paramInt);
    if (localzkf == null) {
      localzkf = paramzbfd.u();
    }
    float f1;
    Object localObject;
    if (paramzbfd.ax())
    {
      f1 = paramzbfd.v().x().m();
      zq localzq = new zq(paramzq.f(), paramzq.g() + (paramzq.i() - f1) / 2.0F, f1, f1);
      localObject = new com.aspose.cells.b.a.b.a.ze();
      ((com.aspose.cells.b.a.b.a.ze)localObject).a(localzq);
      localzkf.i().a((com.aspose.cells.b.a.b.a.ze)localObject);
      localzkf.k().a((com.aspose.cells.b.a.b.a.ze)localObject);
      return;
    }
    float f2;
    if (!paramzbfd.am())
    {
      f1 = paramzq.h();
      f2 = paramzq.h();
      localObject = new zq(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F - f2 / 2.0F, f1, f2);
      localObject = zbxz.a((zq)localObject);
      localzkf.i().a((zq)localObject);
      localzkf.k().a((zq)localObject);
      return;
    }
    if (paramzbfd.z().h()) {
      localzkf.k().a(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F, paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() / 2.0F);
    }
    if (localzkf.m().g())
    {
      f1 = paramzq.f() + paramzq.h() / 2.0F;
      f2 = paramzq.g() + paramzq.i() / 2.0F;
      float f3;
      if (paramzbfd.B().c() == 0)
      {
        f3 = paramzq.i() * b;
      }
      else if (paramzbfd.B().c() <= paramzq.i() * b)
      {
        f3 = paramzbfd.B().c();
      }
      else
      {
        float f4 = paramzbfd.B().c() / paramzbfd.v().i().m();
        if (f4 > 1.0F) {
          f4 = 1.0F;
        }
        f3 = paramzq.i() * b * (1.0F + f4);
      }
      localzkf.m().a(f1, f2, f3);
    }
  }
  
  static String a(zjf paramzjf, zagy paramzagy, boolean paramBoolean)
  {
    for (String str = b(paramzjf, paramzagy, paramBoolean); paramzagy.e() != null; str = b(paramzjf, paramzagy, paramBoolean) + " " + str) {
      paramzagy = paramzagy.e();
    }
    return str;
  }
  
  private static String b(zjf paramzjf, zagy paramzagy, boolean paramBoolean)
  {
    String str = paramzagy.c();
    if (paramzagy.f())
    {
      double d = com.aspose.cells.b.a.ze.g(paramzagy.a());
      DateTime localDateTime = zbxz.a(d, paramBoolean);
      return zgy.a(paramzjf.an(), localDateTime, str, paramBoolean);
    }
    return zgy.a(paramzjf.an(), paramzagy.a(), str);
  }
  
  static zs a(zr paramzr, zamv paramzamv, zbfd paramzbfd, zp paramzp, boolean paramBoolean)
    throws Exception
  {
    if ((!paramzamv.c().s()) && (paramBoolean)) {
      return paramzamv.c().r();
    }
    zjf localzjf = paramzbfd.v();
    int i = paramzamv.e().a();
    int m = paramzamv.j();
    int n = paramzamv.k();
    zt localzt2;
    int i2;
    zt localzt1;
    int i6;
    int j;
    int k;
    int i8;
    if ((paramzamv.d() == 5) || (paramzamv.d() == 0))
    {
      localzt2 = b(paramzr, paramzamv);
      zt localzt3 = new zt(paramzamv.c().a().a() * 0.9F, paramzamv.c().a().i().m() / 2 - ziz.a);
      i2 = zbxz.a(localzt3.b());
      localzt3.a(localzt3.b() - 2 * paramzamv.l());
      localzt3.a(localzt3.b() - localzt2.b());
      zt localzt4 = b(paramzr, paramzamv, localzt3);
      int i4 = (int)(localzt2.b() + localzt4.b()) + 1;
      int i5 = i2 / i4;
      if (i5 == 0) {
        i5 = 1;
      }
      localzt1 = a(paramzr, paramzamv, localzt3);
      i6 = (int)(localzt2.b() * i + localzt1.b()) + 1;
      if (i6 <= i2)
      {
        j = m + i6;
        j = i6 + m * i * 2;
        paramzamv.c(true);
        k = (int)localzt1.c() + 2 * m;
      }
      else
      {
        int i7 = zbxz.a(i / i5);
        i8 = zbxz.a(i / i7);
        j = m + i8 * i4;
        k = i7 * (int)localzt1.c() + 2 * m;
      }
      if (k > paramzamv.c().a().i().m() - 2 * ziz.a) {
        k = paramzamv.c().a().i().m() - 2 * ziz.a;
      }
    }
    else
    {
      localzt2 = b(paramzr, paramzamv);
      int i1 = (int)((paramzp.f() + 2 * ziz.a) * 0.9F);
      i2 = localzjf.a() / 3;
      int i3 = zbxz.b(i2 - paramzamv.j() - localzt2.b());
      zt localzt5 = new zt(i3, i1);
      localzt1 = b(paramzr, paramzamv, localzt5);
      j = (int)(m + localzt2.b() + localzt1.b()) + 1;
      float f = localzt1.c() + n;
      k = (int)(i * f);
      if (j > paramzamv.c().a().a()) {
        j = paramzamv.c().a().a();
      }
      if (k > i1)
      {
        i6 = 0;
        int[] arrayOfInt = { i6 };
        i8 = a(paramzr, paramzamv, localzt5, i1 - 2 * m, arrayOfInt);
        i6 = arrayOfInt[0];
        paramzamv.b(i8);
        k = i6 + 2 * m;
        if (k > i1) {
          k = i1;
        }
      }
    }
    return new zs(j, k);
  }
  
  static zn a(zr paramzr, zamv paramzamv, zbfd paramzbfd, zp[] paramArrayOfzp)
    throws Exception
  {
    zjf localzjf = paramzamv.c().a();
    float f1 = 0.0F;
    float f2 = 0.0F;
    zs localzs = a(paramzr, paramzamv, paramzbfd, paramArrayOfzp[0], false);
    int i = ziz.a;
    int j = ziz.b;
    paramzamv.c().b.a(localzs);
    switch (paramzamv.d())
    {
    case 0: 
      f1 = (localzjf.a() - localzs.b()) / 2;
      f2 = localzjf.al().j() - i - localzs.c();
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + j));
      localzjf.j.d(paramArrayOfzp[0].j() - localzjf.j.d());
      break;
    case 1: 
      f1 = localzjf.al().i() - i - localzs.b();
      if (paramzamv.c().a().M().o()) {
        f2 = localzjf.al().d() + i + paramzamv.c().a().M().e().b.f() + j;
      } else {
        f2 = localzjf.al().d() + i;
      }
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + j));
      break;
    case 2: 
      f1 = localzjf.al().c() + i;
      f2 = (localzjf.b() - localzs.c()) / 2;
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + localzs.b() + j);
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + j));
      if (paramArrayOfzp[0].c() - j - localzjf.j.c() > 0)
      {
        localzjf.j.c(localzjf.j.e() - (paramArrayOfzp[0].c() - j - localzjf.j.c()));
        localzjf.j.a(paramArrayOfzp[0].c() - j);
      }
      break;
    case 4: 
      f1 = localzjf.al().i() - i - localzs.b();
      f2 = (localzjf.b() - localzs.c()) / 2;
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + j));
      localzjf.j.c(paramArrayOfzp[0].i() - localzjf.j.c());
      break;
    case 5: 
      f1 = (localzjf.a() - localzs.b()) / 2;
      f2 = localzjf.al().d() + i + paramzamv.c().a().M().e().b.f() + j;
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + localzs.c() + j);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + j));
      if (paramArrayOfzp[0].d() - j - localzjf.j.d() > 0)
      {
        localzjf.j.d(localzjf.j.f() - (paramArrayOfzp[0].d() - j - localzjf.j.d()));
        localzjf.j.b(paramArrayOfzp[0].d() - j);
      }
      break;
    case 3: 
      f1 = paramzamv.c().i() * localzjf.al().e() / 4000;
      f2 = paramzamv.c().n() * localzjf.al().f() / 4000;
      paramzamv.c().b.a((int)f1);
      paramzamv.c().b.b((int)f2);
      paramzamv.c().b.a(localzs);
      return new zn(paramzamv.c().b.c(), paramzamv.c().b.d());
    }
    paramzamv.c().b.a((int)f1);
    paramzamv.c().b.b((int)f2);
    paramzamv.c().b.a(localzs);
    return new zn(paramzamv.c().b.c(), paramzamv.c().b.d());
  }
  
  static zn a(zr paramzr, zamv paramzamv, zp[] paramArrayOfzp)
    throws Exception
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    zs localzs = a(paramzr, paramzamv, paramArrayOfzp[0]);
    int i = paramzamv.c().a().b();
    int j = paramzamv.c().a().a();
    int k = ziz.a;
    int m = ziz.b;
    zjf localzjf = paramzamv.c().a();
    switch (paramzamv.d())
    {
    case 0: 
      f1 = (j - localzs.b()) / 2;
      f2 = i - k - localzs.c();
      if (!paramzamv.u())
      {
        paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + m));
        localzjf.j.d(paramArrayOfzp[0].j() - localzjf.j.d());
      }
      break;
    case 1: 
      f1 = j - k - localzs.b();
      if (paramzamv.c().a().M().o()) {
        f2 = k + paramzamv.c().a().M().e().b.f() + m;
      } else {
        f2 = k;
      }
      if (!paramzamv.u())
      {
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + m));
        if (paramArrayOfzp[0].f() > localzs.c() * 3)
        {
          paramArrayOfzp[0].b(paramArrayOfzp[0].d() + (localzs.c() + m));
          paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + m));
        }
      }
      break;
    case 2: 
      f1 = k;
      f2 = (i - localzs.c()) / 2;
      if (!paramzamv.u())
      {
        paramArrayOfzp[0].a(paramArrayOfzp[0].c() + localzs.b() + m);
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + m));
        if (paramArrayOfzp[0].c() - m - localzjf.j.c() > 0)
        {
          localzjf.j.c(localzjf.j.e() - (paramArrayOfzp[0].c() - m - localzjf.j.c()));
          localzjf.j.a(paramArrayOfzp[0].c() - m);
        }
      }
      break;
    case 4: 
      f1 = j - k - localzs.b();
      f2 = (i - localzs.c()) / 2;
      if (!paramzamv.u())
      {
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + m));
        localzjf.j.c(paramArrayOfzp[0].i() - localzjf.j.c());
      }
      break;
    case 5: 
      f1 = (j - localzs.b()) / 2;
      if (paramzamv.c().a().M().e().b.f() == 0) {
        f2 = k;
      } else {
        f2 = k + paramzamv.c().a().M().e().b.f() + m;
      }
      if (!paramzamv.u())
      {
        paramArrayOfzp[0].b(paramArrayOfzp[0].d() + localzs.c() + m);
        paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + m));
        if (paramArrayOfzp[0].d() - m - localzjf.j.d() > 0)
        {
          localzjf.j.d(localzjf.j.f() - (paramArrayOfzp[0].d() - m - localzjf.j.d()));
          localzjf.j.b(paramArrayOfzp[0].d() - m);
        }
      }
      break;
    case 3: 
      f1 = paramzamv.c().v();
      f2 = paramzamv.c().w();
      paramzamv.c().b.a((int)f1);
      paramzamv.c().b.b((int)f2);
      paramzamv.c().b.a(localzs);
      return new zn(paramzamv.c().b.c(), paramzamv.c().b.d());
    }
    paramzamv.c().b.a((int)f1);
    paramzamv.c().b.b((int)f2);
    paramzamv.c().b.a(localzs);
    return new zn(paramzamv.c().b.c(), paramzamv.c().b.d());
  }
  
  private static zs a(zr paramzr, zamv paramzamv, zp paramzp)
    throws Exception
  {
    zt localzt1 = b(paramzr, paramzamv);
    zjf localzjf = paramzamv.c().a();
    zjy localzjy = paramzamv.c();
    int i = paramzamv.j();
    int j = paramzamv.l();
    int k = paramzamv.k();
    zbff localzbff = paramzamv.c().a().z();
    int i1 = paramzamv.e().a();
    zt localzt2;
    int i2;
    zt localzt3;
    int i3;
    int i4;
    int i5;
    int m;
    int i7;
    int n;
    if ((paramzamv.d() == 5) || (paramzamv.d() == 0) || ((paramzamv.d() == 3) && (!paramzamv.i())))
    {
      localzt2 = new zt(paramzamv.c().a().a() * 0.9F, paramzamv.c().a().i().m() / 2 - ziz.a);
      i2 = zbxz.a(localzt2.b());
      localzt2.a(localzt2.b() - 2 * paramzamv.l());
      localzt2.a(localzt2.b() - localzt1.b());
      localzt3 = b(paramzr, paramzamv, localzt2);
      i3 = zbxz.a(localzt1.b() + localzt3.b());
      i4 = i2 / i3;
      if (i4 == 0) {
        i4 = 1;
      }
      zt localzt4 = a(paramzr, paramzamv, localzt2);
      i5 = zbxz.a(localzt1.b() * i1 + localzt4.b());
      int i6;
      if (i5 <= i2)
      {
        m = i5 + (i + j) * i1 * 2;
        if (paramzamv.e().b())
        {
          i6 = c(paramzr, paramzamv);
          i7 = i6 / 3;
          m += i1 * (3 + i7);
          if (paramzamv.v()) {
            m += 2;
          }
        }
        paramzamv.c(true);
        if (m > i2) {
          m = i2;
        }
        n = zbxz.a(localzt4.c() + 2 * i);
      }
      else
      {
        m = i + i4 * i3 + j;
        n = zbxz.a(i1 / i4) * (zbxz.a(localzt3.c()) + j) + 2 * i;
        i6 = localzjf.i().m() / 2 - ziz.a;
        if (n > i6)
        {
          i7 = 0;
          int i8 = 0;
          while ((i7 <= i6) && (i8 <= i1))
          {
            i7 = zbxz.a(i8 / i4) * (zbxz.a(localzt3.c()) + j) + 2 * i;
            i8 += i4;
          }
          if ((i8 >= i1) || (i7 == i6)) {
            n = i7;
          } else if (i7 > i6) {
            n = i7 - (zbxz.a(localzt3.c()) + j);
          }
        }
      }
      if (n > localzjf.i().m() - 2 * ziz.a) {
        n = localzjf.i().m() - 2 * ziz.a;
      }
    }
    else
    {
      i2 = (int)((paramzp.f() + 2 * ziz.a) * 0.9F);
      i3 = localzjf.a() / 3;
      i4 = zbxz.b(i3 - i - localzt1.b());
      localzt2 = new zt(i4, i2);
      localzt3 = b(paramzr, paramzamv, localzt2);
      m = zbxz.a(i + localzt1.b() + localzt3.b());
      float f = localzt3.c() + k;
      n = zbxz.a(i1 * f);
      if (m > i3) {
        m = i3;
      }
      if (n > i2)
      {
        i5 = 0;
        int[] arrayOfInt = { i5 };
        i7 = a(paramzr, paramzamv, localzt2, i2 - 2 * i, arrayOfInt);
        i5 = arrayOfInt[0];
        paramzamv.b(i7);
        n = i5 + 2 * i;
        if (n > i2) {
          n = i2;
        }
      }
    }
    return new zs(m, n);
  }
  
  static zt a(zr paramzr, zamv paramzamv, zt paramzt)
  {
    zjf localzjf = paramzamv.c().a();
    zamx localzamx = paramzamv.e();
    zt localzt1 = new zt(0.0F, 0.0F);
    int i = paramzamv.l();
    paramzamv.c = new ArrayList();
    for (int j = 0; j < localzamx.getCount(); j++)
    {
      String str = localzamx.b(j).g();
      if (!localzamx.b(j).b())
      {
        zt localzt2 = zbxz.a(paramzr, str, localzamx.b(j).c(), paramzt);
        com.aspose.cells.b.a.a.zf.a(paramzamv.c, new zt(localzt2.b(), localzt2.c()));
        localzt2.a(localzt2.b() + 2 * i);
        if ((localzjf.as().getImageFormat() == ImageFormat.getEmf()) && (localzamx.b(j).c().h() <= 10.0F)) {
          if (localzamx.b(j).c().h() <= 6.0F) {
            localzt2.a(localzt2.b() + str.length() * i / 5.0F);
          } else if (localzamx.b(j).c().h() <= 8.0F) {
            localzt2.a(localzt2.b() + str.length() * i / 10.0F);
          } else if (localzamx.b(j).c().h() <= 10.0F) {
            localzt2.a(localzt2.b() + str.length() * 0.5F);
          }
        }
        FontMetrics localFontMetrics = zbxz.a().getFontMetrics(localzamx.b(j).c().a());
        localzt2.b(localzt2.c() - localFontMetrics.getLeading());
        localzt1.a(localzt1.b() + localzt2.b());
        if (localzt1.c() < localzt2.c()) {
          localzt1.b(localzt2.c());
        }
      }
    }
    return localzt1;
  }
  
  static zt b(zr paramzr, zamv paramzamv)
  {
    if (paramzamv.e().b()) {
      return paramzamv.o();
    }
    return new zt(paramzamv.m(), paramzamv.p());
  }
  
  static zt b(zr paramzr, zamv paramzamv, zt paramzt)
    throws Exception
  {
    zjf localzjf = paramzamv.c().a();
    paramzt = new zt(paramzt.b(), paramzt.c());
    zamx localzamx = paramzamv.e();
    zt localzt1 = new zt(0.0F, 0.0F);
    int i = paramzamv.l();
    for (int j = 0; j < localzamx.getCount(); j++)
    {
      zamz localzamz = localzamx.b(j);
      String str = localzamz.g();
      if (!localzamz.b())
      {
        zt localzt2;
        if (localzamz.j())
        {
          localObject = new zbcw();
          ((zbcw)localObject).a(0);
          ((zbcw)localObject).b(0);
          zq localzq = new zq(0.0F, 0.0F, paramzt.b(), paramzt.c());
          zbde localzbde = new zbde(localzq, (zbcw)localObject, localzamz.h(), localzamz.c(), localzamz.i());
          localzt2 = localzbde.a(paramzr, localzjf.at()).e();
        }
        else
        {
          localzt2 = zbxz.a(paramzr, str, localzamz.c(), paramzt);
        }
        localzt2.a(localzt2.b() + 2 * i);
        if ((localzjf.as().getImageFormat() == ImageFormat.getEmf()) && (localzamx.b(j).c().h() <= 10.0F)) {
          if (localzamx.b(j).c().h() <= 6.0F) {
            localzt2.a(localzt2.b() + str.length() * i / 5.0F);
          } else if (localzamx.b(j).c().h() <= 8.0F) {
            localzt2.a(localzt2.b() + str.length() * i / 10.0F);
          } else if (localzamx.b(j).c().h() <= 10.0F) {
            localzt2.a(localzt2.b() + str.length() * 0.5F);
          }
        }
        Object localObject = zbxz.a().getFontMetrics(localzamx.b(j).c().a());
        localzt2.b(localzt2.c() - ((FontMetrics)localObject).getLeading());
        if (localzt1.b() < localzt2.b()) {
          localzt1.a(localzt2.b());
        }
        if (localzt1.c() < localzt2.c()) {
          localzt1.b(localzt2.c());
        }
      }
    }
    return localzt1;
  }
  
  private static int a(zr paramzr, zamv paramzamv, zt paramzt, int paramInt, int[] paramArrayOfInt)
    throws Exception
  {
    zjf localzjf = paramzamv.c().a();
    paramzt = new zt(paramzt.b(), paramzt.c());
    zamx localzamx = paramzamv.e();
    int i = paramzamv.k();
    int j = 0;
    paramArrayOfInt[0] = 0;
    for (int k = 0; k < localzamx.getCount(); k++)
    {
      zamz localzamz = localzamx.b(k);
      String str = localzamz.g();
      if (!localzamz.b())
      {
        zt localzt = zbxz.a(paramzr, str, localzamx.b(k).c(), paramzt);
        if (localzamz.j())
        {
          localObject = new zbcw();
          ((zbcw)localObject).a(0);
          ((zbcw)localObject).b(0);
          zq localzq = new zq(0.0F, 0.0F, paramzt.b(), paramzt.c());
          zbde localzbde = new zbde(localzq, (zbcw)localObject, localzamz.h(), localzamz.c(), localzamz.i());
          localzt = localzbde.a(paramzr, localzjf.at()).e();
        }
        Object localObject = zbxz.a().getFontMetrics(localzamx.b(k).c().a());
        localzt.b(localzt.c() - ((FontMetrics)localObject).getLeading());
        paramArrayOfInt[0] += zbxz.a(localzt.c() + i);
        if (paramInt - paramArrayOfInt[0] > 0) {
          j++;
        }
      }
    }
    return j;
  }
  
  static int c(zr paramzr, zamv paramzamv)
  {
    zjf localzjf = paramzamv.c().a();
    zamx localzamx = paramzamv.e();
    int i = 0;
    for (int j = 0; j < localzamx.getCount(); j++)
    {
      zamz localzamz = localzamx.b(j);
      String str = localzamz.g();
      if ((!localzamz.b()) && (str.length() > i)) {
        i = str.length();
      }
    }
    return i;
  }
  
  static void a(zr paramzr, zamv paramzamv, boolean paramBoolean, zbfd paramzbfd)
    throws Exception
  {
    paramzamv.c().z();
    zamx localzamx = paramzamv.e();
    int i = localzamx.getCount();
    zjf localzjf = paramzamv.c().a();
    paramzamv.c().H();
    float f1 = localzjf.b() / 3.0F;
    zt localzt1 = b(paramzr, paramzamv);
    int j = paramzamv.j();
    int k = paramzamv.l();
    float f2 = paramzamv.r();
    float f3 = paramzamv.s();
    int m = 1;
    int n = paramzamv.c().a.e();
    int i1 = paramzamv.c().a.f();
    if (n > paramzamv.c().a().ar()) {
      n = paramzamv.c().a().ar();
    }
    float f4 = 0.0F;
    float f5 = 0.0F;
    zt localzt2 = zt.a();
    int i4 = 0;
    zt localzt3 = zt.a();
    zt localzt4 = a(paramzr, paramzamv, new zt(localzjf.a(), localzjf.b()));
    int i5 = (int)(localzt1.b() * i + localzt4.b());
    int i6 = 0;
    int i7 = 0;
    int i2;
    int i3;
    if (i5 - i <= n)
    {
      i2 = i;
      i3 = 1;
      f4 = (n - j - i5) / i2;
      f5 = (i1 - paramzamv.p() * i3) / i3;
      i6 = 1;
      if ((f4 > i2) && (paramzamv.h()))
      {
        f4 = (n - 2 * j - i5) / i2;
        i7 = 1;
      }
      if (i2 >= 2) {
        f4 = (n - i5) / (i2 + 1);
      }
    }
    else
    {
      int i8 = n - j;
      int i9 = i8 - (int)localzt1.b() - k;
      localzt3 = new zt(i9, f1);
      localzt2 = b(paramzr, paramzamv, localzt3);
      i4 = (int)(localzt1.b() + localzt2.b());
      i2 = zbxz.b(i8 / i4);
      if (i2 < 1) {
        i2 = 1;
      }
      if ((paramzamv.c().s()) && (paramzamv.t() > 0) && (i2 == 1)) {
        i3 = paramzamv.t();
      } else {
        i3 = zbxz.a(i / i2);
      }
      if (!paramzamv.c().s())
      {
        f5 = (i1 - localzt2.c() * i3) / i3;
        i10 = i9 - i2 * (int)localzt1.b();
        if ((i2 < i) && (f5 < 0.0F) && (a(paramzamv, i10, i2 + 1)))
        {
          i2++;
          i3 = zbxz.a(i / i2);
          if (i3 == 1) {
            i6 = 1;
          }
        }
      }
      if ((i3 > 1) && (i2 > i3))
      {
        i10 = (int)Math.ceil(i / i3);
        if (i10 < i2) {
          i2 = i10;
        }
      }
      int i10 = zbxz.b(i1 / localzt2.c() + 0.5F);
      int i11 = zbxz.b(i1 / localzt2.c() + i10 * 0.15F);
      if (i11 < i10) {
        i11 = i10;
      }
      if (i11 == 0) {
        i3 = 1;
      } else if (i3 > i11) {
        i3 = i11;
      }
      f4 = (i8 - i4 * i2) / i2;
      f5 = (i1 - localzt2.c() * i3) / i3;
      if ((i3 > 1) && (f5 < -paramzamv.p() / 4.0F))
      {
        i3--;
        f5 = (i1 - localzt2.c() * i3) / i3;
      }
      m = zbxz.a(localzt2.c() / paramzamv.p());
    }
    if (f4 < 0.0F) {
      f4 = 0.0F;
    }
    if (m > 1 ? f5 < f3 : f5 < f2) {
      f5 = f2;
    }
    float f6 = paramzamv.c().a.c();
    float f7 = paramzamv.c().a.d();
    if ((i6 != 0) && (i2 >= 2))
    {
      f6 += j;
      f6 += f4;
    }
    else
    {
      f6 += j;
      if (i7 != 0) {
        f6 += j;
      }
      f6 += f4 / 2.0F;
    }
    if (f5 > 0.0F)
    {
      f7 += f5 / 2.0F - 0.5F;
    }
    else
    {
      f7 += f5 / 2.0F;
      if (f7 + paramzamv.p() > paramzamv.c().a().b()) {
        f7 -= 0.5F;
      }
    }
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    zq localzq1 = paramzr.e();
    paramzr.a(paramzamv.c().a);
    zv localzv = new zv(zv.c());
    for (int i12 = 0; i12 < localzamx.getCount(); i12++)
    {
      zamz localzamz = localzamx.b(i12);
      if (f7 > paramzamv.c().a.j()) {
        break;
      }
      zq localzq2 = new zq(f6, f7, localzt1.b(), localzt1.c());
      a(paramzr, paramzamv, localzq2, localzamz);
      String str = localzamz.g();
      zo localzo = new zo(f6 + localzt1.b() + k, f7);
      Object localObject1;
      if ((localzamz.a().c()) || (localzamz.a().d()))
      {
        localObject1 = localzamz.d();
        float f9 = (float)Math.ceil(paramzr.a().a((zg)localObject1));
        float f11 = f9 * ((zg)localObject1).b().c(((zg)localObject1).k()) / ((zg)localObject1).b().e(((zg)localObject1).k());
        float f12 = f9 * ((zg)localObject1).b().d(((zg)localObject1).k()) / ((zg)localObject1).b().e(((zg)localObject1).k());
        float f13 = f9 * ((zg)localObject1).b().f(((zg)localObject1).k()) / ((zg)localObject1).b().e(((zg)localObject1).k());
        float f14 = f13 - f11 - f12;
        float f15 = localzo.e() - (f13 - f9) / 2.0F + f11;
        zg localzg = localzamz.c();
        float f16 = (float)Math.ceil(paramzr.a().a(localzg));
        float f17 = f16 * localzg.b().d(localzg.k()) / localzg.b().e(localzg.k());
        float f18 = f16 * localzg.b().c(localzg.k()) / localzg.b().e(localzg.k());
        float f19 = f16 * localzg.b().f(localzg.k()) / localzg.b().e(localzg.k());
        float f20 = f19 - f18 - f17;
        float f21 = f15 - f18 - 1.0F;
        localzo.b(f21 - (float)(localzamz.a().e() / 100.0D * f9));
      }
      Object localObject3;
      if (i6 != 0)
      {
        if (localzamz.j())
        {
          localObject1 = new zbcw();
          ((zbcw)localObject1).a(0);
          ((zbcw)localObject1).b(0);
          localObject2 = new zq(localzo.d(), localzo.e(), 2.14748365E9F, 2.14748365E9F);
          localObject3 = new zbde((zq)localObject2, (zbcw)localObject1, localzamz.h(), localzamz.c(), localzamz.i());
          ((zbde)localObject3).b(paramzr, localzjf.at());
        }
        else
        {
          paramzr.a(localzamz.g(), localzamz.c(), new zu(localzamz.e()), localzo.d(), localzo.e(), localzv);
        }
        localObject1 = paramzamv.c().a.b();
        if (((zs)localObject1).c() < paramzamv.p()) {
          ((zs)localObject1).b(zbxz.c(paramzamv.p() + 1.0F));
        }
        Object localObject2 = zbxz.a(paramzr, str, localzamz.c(), (zs)localObject1);
        f6 += localzt1.b() + ((zt)localObject2).b() + 2 * k;
        if ((localzjf.as().getImageFormat() == ImageFormat.getEmf()) && (localzamz.c().h() <= 8.0F)) {
          if (localzamz.c().h() <= 6.0F) {
            f6 += str.length() / 5.0F * k;
          } else if (localzamz.c().h() <= 8.0F) {
            f6 += str.length() / 10.0F * k;
          }
        }
        f6 += f4;
      }
      else
      {
        float f8 = zbxz.a(localzt3.b());
        float f10 = localzt3.c();
        localObject3 = new zq(localzo.d(), localzo.e(), f8, f10);
        if (localzamz.j())
        {
          zbcw localzbcw = new zbcw();
          localzbcw.a(0);
          localzbcw.b(0);
          zbde localzbde = new zbde((zq)localObject3, localzbcw, localzamz.h(), localzamz.c(), localzamz.i());
          localzbde.b(paramzr, localzjf.at());
        }
        else
        {
          paramzr.a(localzamz.g(), localzamz.c(), new zu(localzamz.e()), (zq)localObject3, localzv);
        }
        f6 += i4;
        f6 += f4;
        if ((i12 + 1) % i2 == 0)
        {
          f6 = paramzamv.c().a.c() + j + f4 / 2.0F;
          f7 += localzt2.c();
          f7 += f5;
        }
        if (f7 + localzt2.c() / 2.0F > paramzamv.c().a.j()) {
          break;
        }
      }
    }
    paramzr.a(localzf);
  }
  
  static void a(zr paramzr, zamv paramzamv, zq paramzq, zamz paramzamz)
    throws Exception
  {
    int i = a(paramzamz.d());
    Object localObject1;
    Object localObject2;
    if (paramzamz.k() == 2)
    {
      localObject1 = new zo(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F);
      localObject2 = new zo(paramzq.l(), paramzq.g() + paramzq.i() / 2.0F);
      zanr localzanr = (zanr)paramzamz.m().d().o();
      if (localzanr.i() > i) {
        localzanr.g().a(i);
      }
      localzanr.a((zo)localObject1, (zo)localObject2);
    }
    else if (paramzamz.k() == 1)
    {
      localObject1 = paramzamz.l();
      localObject2 = (zanr)((zbfd)localObject1).z().o();
      if (((zanr)localObject2).i() > i) {
        ((zanr)localObject2).g().a(i);
      }
      float f1;
      if (((zbfd)localObject1).ax())
      {
        f1 = paramzamv.m();
        zq localzq1 = new zq(paramzq.f(), paramzq.g() + (paramzq.i() - f1) / 2.0F, f1, f1);
        com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
        localze.a(localzq1);
        ((zbfd)localObject1).A().a(localze);
        ((zanr)localObject2).a(localze);
      }
      else
      {
        float f2;
        if (((zbfd)localObject1).am())
        {
          if (((zanr)localObject2).h()) {
            ((zanr)localObject2).a(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F, paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() / 2.0F);
          }
          if (((zbfd)localObject1).B().d() != 1)
          {
            f1 = paramzq.f() + paramzq.h() / 2.0F;
            f2 = paramzq.g() + paramzq.i() / 2.0F;
            float f3;
            if (((zbfd)localObject1).B().c() == 0) {
              f3 = paramzq.i() * zjj.b;
            } else if (((zbfd)localObject1).B().c() <= paramzq.i() * zjj.b) {
              f3 = ((zbfd)localObject1).B().c();
            } else {
              f3 = paramzq.i() * zjj.b;
            }
            ((zbfd)localObject1).B().a(f1, f2, f3);
          }
        }
        else
        {
          f1 = paramzq.h();
          f2 = paramzamv.m();
          zq localzq2 = new zq(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F - f2 / 2.0F, f1, f2);
          localzq2 = zbxz.a(localzq2);
          ((zbfd)localObject1).A().a(localzq2);
          ((zanr)localObject2).a(localzq2);
        }
      }
    }
  }
  
  private static int a(zg paramzg)
  {
    float f = paramzg.h();
    if (f <= 4.0F) {
      return 1;
    }
    if (f <= 6.0F) {
      return 2;
    }
    if (f <= 8.0F) {
      return 3;
    }
    if (f <= 9.0F) {
      return 4;
    }
    if (f <= 10.0F) {
      return 5;
    }
    if (f <= 12.0F) {
      return 6;
    }
    if (f <= 13.0F) {
      return 7;
    }
    if (f <= 15.0F) {
      return 8;
    }
    return (int)(f - 8.0F);
  }
  
  private static boolean a(zamv paramzamv, int paramInt1, int paramInt2)
  {
    float f1 = 0.0F;
    for (int i = 0; i < paramzamv.c.size(); i++)
    {
      zt localzt1 = (zt)paramzamv.c.get(i);
      if ((int)localzt1.b() > f1) {
        f1 = (int)localzt1.b();
      }
    }
    i = 0;
    while (i < paramzamv.c.size())
    {
      float f2 = 0.0F;
      for (int j = 0; (j < paramInt2) && (i + j < paramzamv.c.size()); j++) {
        if (j < paramInt2 - 1)
        {
          f2 += f1;
        }
        else
        {
          zt localzt2 = (zt)paramzamv.c.get(i + j);
          f2 += localzt2.b();
        }
      }
      if (f2 > paramInt1) {
        return false;
      }
      i += paramInt2;
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zanb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */