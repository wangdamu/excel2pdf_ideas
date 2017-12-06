package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.ze;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.util.ArrayList;

final class zana
{
  static int a = 4;
  static float b = 0.4F;
  static float c = 5.0F;
  
  private static zt c(zr paramzr, zamu paramzamu)
  {
    zbfe localzbfe = paramzamu.d().a().z();
    zt localzt1 = new zt(0.0F, 0.0F);
    for (int i = 0; i < localzbfe.getCount(); i++)
    {
      zbfc localzbfc = localzbfe.c(i);
      zt localzt2 = paramzr.a(localzbfc.i(), paramzamu.d().h());
      if (localzt1.b() < localzt2.b()) {
        localzt1.a(localzt2.b());
      }
      if (localzt1.c() < localzt2.c()) {
        localzt1.b(localzt2.c());
      }
    }
    return localzt1;
  }
  
  private static boolean a(zbfe paramzbfe)
  {
    if (paramzbfe.o()) {
      return true;
    }
    boolean bool = false;
    for (int i = 0; i < paramzbfe.getCount(); i++)
    {
      zbfc localzbfc = paramzbfe.c(i);
      if ((localzbfc.z().e()) && (!b(localzbfc.m())) && (!localzbfc.av()))
      {
        bool = true;
        break;
      }
    }
    return bool;
  }
  
  static zt a(zr paramzr, zamu paramzamu)
  {
    zt localzt = c(paramzr, paramzamu);
    boolean bool = a(paramzamu.d().a().z());
    if (localzt.b() == 0.0F)
    {
      if (bool) {
        return new zt(28.0F, paramzamu.j());
      }
      return new zt(paramzamu.m(), paramzamu.j());
    }
    if (localzt.b() != 0.0F)
    {
      float f1 = localzt.c() * b;
      f2 = localzt.c();
      if (bool) {
        f1 = 3.0F * f2 / 2.0F;
      }
      return new zt(f1, f2);
    }
    com.aspose.cells.b.a.b.zs localzs = zbvx.a(paramzr, "This is a girl", paramzamu.d().h());
    float f2 = localzs.c() * b;
    float f3 = localzs.c();
    if (bool) {
      f2 = 3.0F * f3 / 2.0F;
    }
    return new zt(f2, f3);
  }
  
  static void a(zamu paramzamu, zp paramzp)
  {
    com.aspose.cells.b.a.b.zs localzs = paramzamu.d().b.b();
    int i = paramzp.f();
    int j = paramzp.e();
    switch (paramzamu.e())
    {
    case 1: 
      break;
    case 2: 
    case 4: 
      if (i > localzs.c()) {
        paramzamu.d().b.b(paramzp.d() + (i - localzs.c()) / 2);
      }
      break;
    case 0: 
    case 5: 
      if (j > localzs.b()) {
        paramzamu.d().b.a(paramzp.c() + (j - localzs.b()) / 2);
      }
      break;
    }
  }
  
  private static boolean b(int paramInt)
  {
    return (paramInt != 37) && (paramInt != 40) && (paramInt != 41) && (paramInt != 42) && (paramInt != 38) && (paramInt != 39) && (paramInt != 60) && (paramInt != 63) && (paramInt != 64) && (paramInt != 61) && (paramInt != 62) && (paramInt != 57) && (paramInt != 12);
  }
  
  static boolean a(int paramInt)
  {
    return (paramInt == 40) || (paramInt == 41) || (paramInt == 42) || (paramInt == 60) || (paramInt == 63) || (paramInt == 61) || (paramInt == 58) || (paramInt == 12);
  }
  
  static void a(zr paramzr, zq paramzq, zbfc paramzbfc)
    throws Exception
  {
    int i = paramzbfc.m();
    float f1;
    if (b(i))
    {
      f1 = paramzq.h();
      zq localzq = new zq(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F, f1, f1);
      localzq = zbxz.a(localzq);
      zbd.a(paramzr, localzq, paramzbfc.A());
      zanv.a(paramzr, localzq, paramzbfc.z());
      return;
    }
    if (paramzbfc.z().e()) {
      zanv.a(paramzr, paramzq.f(), paramzq.g() + paramzq.i() / 2.0F, paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() / 2.0F, paramzbfc.z());
    }
    if (a(i))
    {
      f1 = paramzq.f() + paramzq.h() / 2.0F;
      float f2 = paramzq.g() + paramzq.i() / 2.0F;
      float f3;
      if (paramzbfc.B().c() == 0)
      {
        f3 = paramzq.i() * b;
      }
      else
      {
        int j = (int)(paramzbfc.h().c() * 72 / paramzr.f());
        if (j <= paramzq.i() * b)
        {
          f3 = paramzbfc.B().c();
        }
        else
        {
          float f4 = j / paramzbfc.v().i().m();
          if (f4 > 1.0F) {
            f4 = 1.0F;
          }
          f3 = paramzq.i() * b * (1.0F + f4);
          f3 = (int)(f3 * paramzr.f() / 72.0F + 0.5D);
        }
      }
      paramzbfc.B().a((int)f3);
      a(paramzr, f1, f2, paramzbfc.B(), paramzbfc.B().c(), true);
    }
  }
  
  static int a(zbfc paramzbfc, int paramInt)
  {
    if (paramInt == -1) {
      return 3;
    }
    if (paramzbfc.m() == 12) {
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
  
  static void a(zr paramzr, float paramFloat1, float paramFloat2, zaor paramzaor, float paramFloat3, boolean paramBoolean)
  {
    if (paramzaor.d() == 1) {
      return;
    }
    zu localzu1 = new zu(paramzaor.e().e());
    try
    {
      com.aspose.cells.a.d.zs localzs = new com.aspose.cells.a.d.zs(paramzaor.f().a());
      try
      {
        zu localzu2 = new zu(paramzaor.f().a());
        try
        {
          int i = paramzaor.d();
          float f1;
          float f2;
          switch (i)
          {
          case 7: 
            if (paramBoolean)
            {
              if (paramFloat3 <= 4.0F) {
                paramFloat3 -= 1.0F;
              } else {
                paramFloat3 -= 2.0F;
              }
            }
            else {
              paramFloat3 -= 1.0F;
            }
            f1 = paramFloat3;
            f2 = paramFloat3;
            paramFloat1 -= f1 / 2.0F;
            paramFloat2 -= f2 / 2.0F;
            paramzr.a(localzu1, paramFloat1, paramFloat2, f1, f2);
            paramzr.a(localzs, paramFloat1, paramFloat2, f1, f2);
            break;
          case 10: 
            f1 = (int)(Math.ceil(paramFloat3) / 2.0D + 1.0D);
            f1 *= 2.0F;
            f2 = (int)(paramFloat3 / 5.0F) / 2 * 2;
            f2 = f2 < 2.0F ? 2.0F : f2;
            paramFloat1 -= f1 / 2.0F;
            paramFloat2 -= f2 / 2.0F;
            paramzr.b(localzu2, paramFloat1, paramFloat2, f1, f2);
            break;
          case 2: 
            paramFloat3 -= 1.0F;
            zo[] arrayOfzo1 = new zo[4];
            zbxz.a(arrayOfzo1);
            arrayOfzo1[0].a(paramFloat1 - paramFloat3 / 2.0F);
            arrayOfzo1[0].b(paramFloat2);
            arrayOfzo1[1].a(paramFloat1);
            arrayOfzo1[1].b(paramFloat2 - paramFloat3 / 2.0F);
            arrayOfzo1[2].a(paramFloat1 + paramFloat3 / 2.0F);
            arrayOfzo1[2].b(paramFloat2);
            arrayOfzo1[3].a(paramFloat1);
            arrayOfzo1[3].b(paramFloat2 + paramFloat3 / 2.0F);
            paramzr.a(localzu1, arrayOfzo1);
            paramzr.c(localzs, arrayOfzo1);
            break;
          case 9: 
            f1 = (int)(Math.ceil(paramFloat3) / 2.0D + 1.0D);
            f2 = (int)(paramFloat3 / 5.0F) / 2 * 2;
            f2 = f2 < 2.0F ? 2.0F : f2;
            paramFloat2 -= f2 / 2.0F;
            paramzr.b(localzu2, paramFloat1, paramFloat2, f1, f2);
            break;
          case 3: 
            paramFloat3 -= 2.0F;
            f1 = paramFloat3;
            f2 = paramFloat3;
            paramFloat1 -= f1 / 2.0F;
            paramFloat2 -= f2 / 2.0F;
            paramzr.b(localzu1, paramFloat1, paramFloat2, f1, f2);
            paramzr.c(localzs, paramFloat1, paramFloat2, f1, f2);
            break;
          case 8: 
            paramFloat3 -= 2.0F;
            f1 = paramFloat3;
            f2 = paramFloat3;
            paramFloat1 -= f1 / 2.0F;
            paramFloat2 -= f2 / 2.0F;
            paramzr.b(localzu1, paramFloat1, paramFloat2, f1, f2);
            paramzr.b(localzs, paramFloat1, paramFloat2 + f2 / 2.0F, paramFloat1 + f1, paramFloat2 + f2 / 2.0F);
            paramzr.b(localzs, paramFloat1 + f1 / 2.0F, paramFloat2, paramFloat1 + f1 / 2.0F, paramFloat2 + f2);
            break;
          case 6: 
            paramFloat3 -= 2.0F;
            f1 = paramFloat3;
            f2 = paramFloat3;
            paramFloat1 -= f1 / 2.0F;
            paramFloat2 -= f2 / 2.0F;
            paramzr.b(localzu1, paramFloat1, paramFloat2, f1, f2);
            paramzr.b(localzs, paramFloat1, paramFloat2, paramFloat1 + f1, paramFloat2 + f2);
            paramzr.b(localzs, paramFloat1, paramFloat2 + f2, paramFloat1 + f1, paramFloat2);
            paramzr.b(localzs, paramFloat1 + f1 / 2.0F, paramFloat2, paramFloat1 + f1 / 2.0F, paramFloat2 + f2);
            break;
          case 5: 
            f1 = paramFloat3;
            f2 = paramFloat3;
            paramFloat1 -= f1 / 2.0F;
            paramFloat2 -= f2 / 2.0F;
            paramzr.b(localzu1, paramFloat1, paramFloat2, f1, f2);
            paramzr.b(localzs, paramFloat1 + 2.0F, paramFloat2 + 2.0F, paramFloat1 + paramFloat3 - 2.0F, paramFloat2 + paramFloat3 - 2.0F);
            paramzr.b(localzs, paramFloat1 + 2.0F, paramFloat2 + paramFloat3 - 2.0F, paramFloat1 + paramFloat3 - 2.0F, paramFloat2 + 2.0F);
            break;
          case 4: 
            paramFloat3 -= 1.0F;
            zo[] arrayOfzo2 = new zo[3];
            zbxz.a(arrayOfzo2);
            arrayOfzo2[0].a(paramFloat1 - paramFloat3 / 2.0F);
            arrayOfzo2[0].b(paramFloat2 + paramFloat3 / 2.0F);
            arrayOfzo2[1].a(paramFloat1);
            arrayOfzo2[1].b(paramFloat2 - paramFloat3 / 2.0F);
            arrayOfzo2[2].a(paramFloat1 + paramFloat3 / 2.0F);
            arrayOfzo2[2].b(paramFloat2 + paramFloat3 / 2.0F);
            paramzr.a(localzu1, arrayOfzo2);
            paramzr.c(localzs, arrayOfzo2);
          }
        }
        finally {}
      }
      finally {}
    }
    finally
    {
      if (localzu1 != null) {
        localzu1.f();
      }
    }
  }
  
  static boolean a(zje paramzje)
  {
    if (paramzje.z().getCount() != 1) {
      return false;
    }
    zbfc localzbfc = paramzje.z().c(0);
    int[] arrayOfInt = { 14, 16, 17, 20, 18, 19, 15, 6, 8, 11, 9, 7, 37, 39, 42, 43, 38, 41, 40, 60, 61, 62, 63, 64, 57, 59, 58, 12, 13, 28, 30, 31, 33, 32, 34, 29, 21, 23, 22, 24, 26, 25, 27, 50, 52, 53, 55, 54, 56, 51 };
    for (int i = 0; (i < arrayOfInt.length) && (localzbfc.m() != arrayOfInt[i]); i++) {}
    if (i == arrayOfInt.length) {
      return false;
    }
    zkg localzkg = localzbfc.D();
    int j = localzbfc.m();
    if (localzbfc.H()) {
      return true;
    }
    return (localzkg.getCount() > 0) && (!a(localzkg));
  }
  
  private static boolean a(zkg paramzkg)
  {
    for (int i = 1; i < paramzkg.getCount(); i++) {
      if ((!paramzkg.b(0).i().a(paramzkg.b(i).i())) || (!paramzkg.b(0).k().a(paramzkg.b(i).k())) || (!paramzkg.b(0).m().a(paramzkg.b(i).m()))) {
        return false;
      }
    }
    return true;
  }
  
  static void a(zr paramzr, zamu paramzamu, zbfc paramzbfc)
    throws Exception
  {
    paramzamu.d().z();
    zamw localzamw = paramzamu.f();
    int i = paramzamu.f().a();
    zje localzje = paramzamu.c();
    zjz.a(paramzr, paramzamu.d());
    float f1 = localzje.b() / 3.0F;
    zt localzt1 = b(paramzr, paramzamu);
    int j = paramzamu.k();
    int k = paramzamu.l();
    float f2 = paramzamu.p();
    float f3 = paramzamu.q();
    int m = 1;
    int n = paramzamu.d().a.e();
    int i1 = paramzamu.d().a.f();
    float f4 = 0.0F;
    float f5 = 0.0F;
    zt localzt2 = zt.a();
    int i4 = 0;
    zt localzt3 = zt.a();
    zt localzt4 = a(paramzr, paramzamu, new zt(localzje.a(), localzje.b()));
    int i5 = (int)(localzt1.b() * i + localzt4.b());
    int i6 = 0;
    int i2;
    int i3;
    if (i5 <= n - j)
    {
      i2 = i;
      i3 = 1;
      f4 = (n - j - i5) / i2;
      f5 = (i1 - paramzamu.j() * i3) / i3;
      i6 = 1;
    }
    else
    {
      int i7 = paramzamu.d().a.e() - j;
      int i8 = i7 - (int)localzt1.b();
      localzt3 = new zt(i8, f1);
      localzt2 = b(paramzr, paramzamu, localzt3);
      i4 = (int)(localzt1.b() + localzt2.b());
      i2 = i4 == 0 ? 1 : zbxz.b(i7 / i4);
      if (i2 < 1) {
        i2 = 1;
      }
      i3 = zbxz.a(i / i2);
      if ((i3 > 1) && (i2 > i3))
      {
        int i9 = (int)Math.ceil(i / i3);
        if (i9 < i2) {
          i2 = i9;
        }
      }
      f4 = (i7 - i4 * i2) / i2;
      f5 = (i1 - localzt2.c() * i3) / i3;
      m = zbxz.a(localzt2.c() / paramzamu.d().C());
    }
    if (f4 < 0.0F) {
      f4 = 0.0F;
    }
    if (m > 1)
    {
      if (f5 < f3) {
        f5 = f3;
      }
    }
    else if (f5 < f2) {
      f5 = f2;
    }
    float f6 = paramzamu.d().a.c();
    float f7 = paramzamu.d().a.d();
    f6 += j;
    f6 += f4 / 2.0F;
    f7 += Math.abs(f5) / 2.0F;
    zf localzf = paramzr.d();
    zq localzq1 = paramzr.e();
    paramzr.a(paramzamu.d().a);
    zv localzv = new zv(zv.c());
    for (int i10 = 0; i10 < localzamw.getCount(); i10++)
    {
      zamy localzamy = localzamw.b(i10);
      if (f7 > paramzamu.d().a.j()) {
        break;
      }
      zq localzq2 = new zq(f6, f7, localzt1.b(), localzt1.c());
      a(paramzr, localzq2, paramzbfc, i10);
      String str = localzamy.g();
      zo localzo = new zo(f6 + localzt1.b() + k, f7);
      if (i6 != 0)
      {
        paramzr.a(str, localzamy.c(), new zu(localzamy.e()), localzo.d(), localzo.e(), localzv);
        com.aspose.cells.b.a.b.zs localzs = paramzamu.d().a.b();
        if (localzs.c() < paramzamu.d().C()) {
          localzs.b(zbxz.c(paramzamu.d().C() + 1.0F));
        }
        zt localzt5 = zbxz.a(paramzr, str, paramzamu.d().h(), localzs);
        f6 += localzt1.b() + localzt5.b() + 2 * k;
        if ((localzje.as().getImageFormat() == ImageFormat.getEmf()) && (localzamy.c().h() <= 8.0F)) {
          if (localzamy.c().h() <= 6.0F) {
            f6 += str.length() / 5.0F * k;
          } else if (localzamy.c().h() <= 8.0F) {
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
        paramzr.a(str, localzamy.c(), new zu(localzamy.e()), localzq3, localzv);
        f6 += i4;
        f6 += f4;
        if ((i10 + 1) % i2 == 0)
        {
          f6 = paramzamu.d().a.c() + j + f4 / 2.0F;
          f7 += localzt2.c();
          f7 += f5;
        }
      }
    }
    paramzr.a(localzf);
  }
  
  static void a(zr paramzr, zq paramzq, zbfc paramzbfc, int paramInt)
    throws Exception
  {
    int i = paramzbfc.m();
    Color localColor = paramzbfc.v().g(paramzbfc.ax()).a(paramzbfc.ai());
    zke localzke = paramzbfc.D().b(paramInt);
    if (localzke == null) {
      localzke = paramzbfc.u();
    }
    float f1;
    zq localzq;
    if (paramzbfc.av())
    {
      f1 = paramzbfc.v().x().m();
      localzq = new zq(paramzq.f(), paramzq.g() + (paramzq.i() - f1) / 2.0F, f1, f1);
      zc localzc = zbd.a(localzke.i(), localzq);
      try
      {
        paramzr.a(localzc, localzq);
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
      com.aspose.cells.a.d.zs localzs = zanv.a(localzke.k());
      try
      {
        paramzr.a(localzs, localzq);
      }
      finally
      {
        if (localzs != null) {
          localzs.s();
        }
      }
      return;
    }
    if (b(i))
    {
      f1 = paramzq.h();
      localzq = new zq(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F - f1 / 2.0F, f1, f1);
      localzq = zbxz.a(localzq);
      zbd.a(paramzr, localzq, localzke.i());
      zanv.a(paramzr, localzq, localzke.k());
      return;
    }
    if ((paramzbfc.z().e()) && (paramzbfc.m() != 12) && (paramzbfc.m() != 13)) {
      zanv.a(paramzr, paramzq.f(), paramzq.g() + paramzq.i() / 2.0F, paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() / 2.0F, localzke.k());
    }
    if (a(i))
    {
      f1 = paramzq.f() + paramzq.h() / 2.0F;
      float f2 = paramzq.g() + paramzq.i() / 2.0F;
      float f3;
      if (paramzbfc.B().c() == 0)
      {
        f3 = paramzq.i() * b;
      }
      else
      {
        int j = (int)(paramzbfc.h().c() * 72 / paramzr.f());
        if (j <= paramzq.i() * b)
        {
          f3 = paramzbfc.B().c();
        }
        else
        {
          float f4 = j / paramzbfc.v().i().m();
          if (f4 > 1.0F) {
            f4 = 1.0F;
          }
          f3 = paramzq.i() * b * (1.0F + f4);
          f3 = (int)(f3 * paramzr.f() / 72.0F + 0.5D);
        }
      }
      a(paramzr, f1, f2, localzke.m(), f3, true);
    }
  }
  
  static String a(zje paramzje, zgm paramzgm, boolean paramBoolean)
  {
    String str = paramzgm.c();
    if (paramzgm.f())
    {
      double d = ze.g(paramzgm.a());
      DateTime localDateTime = zbxz.a(d, paramBoolean);
      return zgy.a(paramzje.an(), localDateTime, str, paramBoolean);
    }
    return zgy.a(paramzje.an(), paramzgm.a(), str);
  }
  
  static com.aspose.cells.b.a.b.zs b(zr paramzr, zamu paramzamu, zbfc paramzbfc)
    throws Exception
  {
    if (!paramzamu.d().s()) {
      return paramzamu.d().t();
    }
    int i = paramzamu.f().a();
    int m = paramzamu.k();
    zt localzt2;
    zt localzt1;
    int j;
    int k;
    if ((paramzamu.e() == 5) || (paramzamu.e() == 0) || ((paramzamu.e() == 3) && (!paramzamu.i())))
    {
      localzt2 = new zt(paramzamu.c().a() - 2 * ziy.a, paramzamu.c().j().m() / 2 - ziy.a);
      zt localzt3 = b(paramzr, paramzamu);
      zt localzt4 = b(paramzr, paramzamu, localzt2);
      int i2 = (int)(localzt3.b() + localzt4.b()) + 1;
      int i3 = paramzamu.c().j().l() - 2 * ziy.a - m;
      int i4 = i3 / i2;
      if (i4 == 0) {
        i4 = 1;
      }
      localzt1 = a(paramzr, paramzamu, localzt2);
      int i5 = (int)(localzt3.b() * i + localzt1.b()) + 1;
      if (i5 <= i3)
      {
        j = m + i5;
        k = (int)localzt1.c() + 2 * m;
      }
      else
      {
        j = m + i4 * i2;
        k = zbxz.a(i / i4) * (int)localzt1.c() + 2 * m;
        int i6 = paramzamu.c().j().m() / 2 - ziy.a;
        if (k > i6)
        {
          int i7 = 0;
          int i8 = 0;
          while ((i7 <= i6) && (i8 <= i))
          {
            i7 = zbxz.a(i8 / i4) * (int)localzt1.c() + 2 * m;
            i8 += i4;
          }
          if ((i8 >= i) || (i7 == i6)) {
            k = i7;
          } else if (i7 > i6) {
            k = i7 - (int)localzt1.c();
          }
        }
      }
      if (k > paramzamu.c().j().m() - 2 * ziy.a) {
        k = paramzamu.c().j().m() - 2 * ziy.a;
      }
    }
    else
    {
      int n = paramzamu.c().j().m() - 2 * ziy.a;
      int i1 = paramzamu.c().a() / 3;
      localzt2 = new zt(i1, n);
      zt localzt5 = b(paramzr, paramzamu);
      localzt1 = b(paramzr, paramzamu, localzt2);
      j = (int)(m + localzt5.b() + localzt1.b()) + 1;
      k = (int)(localzt1.c() + 2 * m + (i - 1) * localzt1.c());
      if (j > i1) {
        j = i1;
      }
      if (k > n) {
        k = n;
      }
    }
    return new com.aspose.cells.b.a.b.zs(j, k);
  }
  
  static com.aspose.cells.b.a.b.zn a(zr paramzr, zamu paramzamu, zbfc paramzbfc, zp[] paramArrayOfzp)
    throws Exception
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    com.aspose.cells.b.a.b.zs localzs = b(paramzr, paramzamu, paramzbfc);
    int i = paramzamu.c().b();
    int j = paramzamu.c().a();
    int k = ziy.a;
    int m = ziy.b;
    zje localzje = paramzamu.c();
    paramzamu.d().b.a(localzs);
    switch (paramzamu.e())
    {
    case 0: 
      f1 = (j - localzs.b()) / 2;
      f2 = i - k - localzs.c();
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + m));
      localzje.f.d(paramArrayOfzp[0].j() - localzje.f.d());
      break;
    case 1: 
      f1 = j - k - localzs.b();
      if (paramzamu.c().K().j()) {
        f2 = k + paramzamu.c().K().e().b.f() + m;
      } else {
        f2 = k;
      }
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + m));
      if (localzs.c() * 2 < paramArrayOfzp[0].f()) {
        paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + m));
      }
      break;
    case 2: 
      f1 = k;
      f2 = (i - localzs.c()) / 2;
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + localzs.b() + m);
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + m));
      if (paramArrayOfzp[0].c() - m - localzje.f.c() > 0)
      {
        localzje.f.c(localzje.f.e() - (paramArrayOfzp[0].c() - m - localzje.f.c()));
        localzje.f.a(paramArrayOfzp[0].c() - m);
      }
      break;
    case 4: 
      f1 = j - k - localzs.b();
      f2 = (i - localzs.c()) / 2;
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + m));
      localzje.f.c(paramArrayOfzp[0].i() - localzje.f.c());
      break;
    case 5: 
      f1 = (j - localzs.b()) / 2;
      f2 = k + paramzamu.c().K().e().b.f() + m;
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + localzs.c() + m);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + m));
      if (paramArrayOfzp[0].d() - m - localzje.f.d() > 0)
      {
        localzje.f.d(localzje.f.f() - (paramArrayOfzp[0].d() - m - localzje.f.d()));
        localzje.f.b(paramArrayOfzp[0].d() - m);
      }
      break;
    case 3: 
      f1 = paramzamu.d().n() * paramzamu.c().a() / 4000;
      f2 = paramzamu.d().o() * paramzamu.c().b() / 4000;
      paramzamu.d().b.a((int)f1);
      paramzamu.d().b.b((int)f2);
      paramzamu.d().b.a(localzs);
      return new com.aspose.cells.b.a.b.zn(paramzamu.d().b.c(), paramzamu.d().b.d());
    }
    paramzamu.d().b.a((int)f1);
    paramzamu.d().b.b((int)f2);
    paramzamu.d().b.a(localzs);
    return new com.aspose.cells.b.a.b.zn(paramzamu.d().b.c(), paramzamu.d().b.d());
  }
  
  static com.aspose.cells.b.a.b.zn a(zr paramzr, zamu paramzamu, zp[] paramArrayOfzp)
    throws Exception
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    com.aspose.cells.b.a.b.zs localzs = a(paramzr, paramzamu, false);
    int i = paramzamu.d().a().b();
    int j = paramzamu.d().a().a();
    int k = ziy.a;
    int m = ziy.b;
    zje localzje = paramzamu.c();
    switch (paramzamu.e())
    {
    case 0: 
      f1 = (j - localzs.b()) / 2;
      f2 = i - k - localzs.c();
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + m));
      localzje.f.d(paramArrayOfzp[0].j() - localzje.f.d());
      break;
    case 1: 
      f1 = j - k - localzs.b();
      if (paramzamu.d().a().K().j()) {
        f2 = k + paramzamu.d().a().K().e().b.f() + m;
      } else {
        f2 = k;
      }
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + m));
      if (paramArrayOfzp[0].f() > localzs.c() * 2)
      {
        paramArrayOfzp[0].b(paramArrayOfzp[0].d() + localzs.c() + m);
        paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + m));
      }
      break;
    case 2: 
      f1 = k;
      f2 = (i - localzs.c()) / 2;
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + localzs.b() + m);
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + m));
      if (paramArrayOfzp[0].c() - m - localzje.f.c() > 0)
      {
        localzje.f.c(localzje.f.e() - (paramArrayOfzp[0].c() - m - localzje.f.c()));
        localzje.f.a(paramArrayOfzp[0].c() - m);
      }
      break;
    case 4: 
      f1 = j - k - localzs.b();
      f2 = (i - localzs.c()) / 2;
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - (localzs.b() + m));
      localzje.f.c(paramArrayOfzp[0].i() - localzje.f.c());
      break;
    case 5: 
      f1 = (j - localzs.b()) / 2;
      f2 = k + paramzamu.d().a().K().e().b.f() + m;
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + localzs.c() + m);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - (localzs.c() + m));
      if (paramArrayOfzp[0].d() - m - localzje.f.d() > 0)
      {
        localzje.f.d(localzje.f.f() - (paramArrayOfzp[0].d() - m - localzje.f.d()));
        localzje.f.b(paramArrayOfzp[0].d() - m);
      }
      break;
    case 3: 
      int n = 4000 * localzs.b() / (paramzamu.c().a() - 2 * ziy.c);
      int i1 = 4000 * localzs.c() / (paramzamu.c().b() - 2 * ziy.c);
      if (paramzamu.d().n() + n > 4000)
      {
        localzs = a(paramzr, paramzamu, true);
        n = 4000 * localzs.b() / (paramzamu.c().a() - 2 * ziy.c);
        i1 = 4000 * localzs.c() / (paramzamu.c().b() - 2 * ziy.c);
        if (paramzamu.d().n() + n > 4000) {
          paramzamu.d().c(4000 - n);
        }
        if (paramzamu.d().n() < 0) {
          paramzamu.d().c(0);
        }
        if (paramzamu.d().o() + i1 > 4000) {
          paramzamu.d().d(4000 - i1);
        }
        if (paramzamu.d().o() < 0) {
          paramzamu.d().d(0);
        }
      }
      f1 = paramzamu.d().w();
      f2 = paramzamu.d().x();
      int i2 = paramzamu.d().u();
      if (i2 > localzs.b()) {
        f1 += (i2 - localzs.b()) / 2;
      }
      paramzamu.d().b.a((int)f1);
      paramzamu.d().b.b((int)f2);
      paramzamu.d().b.a(localzs);
      return new com.aspose.cells.b.a.b.zn(paramzamu.d().b.c(), paramzamu.d().b.d());
    }
    paramzamu.d().b.a((int)f1);
    paramzamu.d().b.b((int)f2);
    paramzamu.d().b.a(localzs);
    return new com.aspose.cells.b.a.b.zn(paramzamu.d().b.c(), paramzamu.d().b.d());
  }
  
  static com.aspose.cells.b.a.b.zs a(zr paramzr, zamu paramzamu, boolean paramBoolean)
    throws Exception
  {
    zt localzt1 = b(paramzr, paramzamu);
    int k;
    if (!paramzamu.d().s())
    {
      com.aspose.cells.b.a.b.zs localzs = paramzamu.d().t();
      zt localzt2 = b(paramzr, paramzamu, new zt(paramzamu.d().a().a(), paramzamu.d().a().b()));
      k = zbxz.a(localzt1.b() + localzt2.b());
      if (zbxz.b(localzs.b() / k) >= 2) {
        paramzamu.c(false);
      } else {
        paramzamu.c(true);
      }
      return localzs;
    }
    zt localzt6;
    int i3;
    if (paramzamu.e() == 3)
    {
      i = paramzamu.d().a().j().m() - 2 * ziy.a;
      j = paramzamu.d().a().a() / 3;
      k = zbxz.b(j - paramzamu.k() - localzt1.b());
      zt localzt3 = new zt(k, i);
      zt localzt4 = b(paramzr, paramzamu, localzt3);
      i1 = zbxz.a(paramzamu.k() + localzt1.b() + localzt4.b());
      int i2 = paramzamu.d().u();
      localzt6 = a(paramzr, paramzamu, localzt3);
      i3 = zbxz.a(localzt1.b() * paramzamu.f().a() + localzt6.b());
      if ((paramBoolean) && (i3 > i2) && (i2 < 3 * i1 / 2)) {
        paramzamu.a(true);
      }
    }
    int i = paramzamu.k();
    int j = paramzamu.l();
    zbfe localzbfe = paramzamu.d().a().z();
    int i1 = paramzamu.f().a();
    zt localzt5;
    int i4;
    int i5;
    int m;
    int n;
    if ((paramzamu.e() == 5) || (paramzamu.e() == 0) || ((paramzamu.e() == 3) && (!paramzamu.i())))
    {
      localzt5 = new zt(paramzamu.d().a().a() - 2 * ziy.a, paramzamu.d().a().j().m() / 2 - ziy.a);
      localzt6 = b(paramzr, paramzamu, localzt5);
      i3 = zbxz.a(localzt1.b() + localzt6.b());
      i4 = zbxz.c(localzt5.b()) - i;
      i5 = i4 / i3;
      if (i5 == 0) {
        i5 = 1;
      }
      zt localzt7 = a(paramzr, paramzamu, localzt5);
      int i6 = zbxz.a(localzt1.b() * i1 + localzt7.b());
      if (i6 <= i4)
      {
        paramzamu.c(false);
        m = i + i6 + j;
        n = zbxz.a(localzt7.c() + 2 * i);
      }
      else
      {
        if (i5 > 1) {
          paramzamu.c(false);
        }
        m = i + i5 * i3 + j;
        n = zbxz.a(i1 / i5) * (zbxz.a(localzt6.c()) + j) + 2 * i;
        int i7 = paramzamu.d().a().j().m() / 2 - ziy.a;
        if (n > i7)
        {
          int i8 = 0;
          int i9 = 0;
          while ((i8 <= i7) && (i9 <= i1))
          {
            i8 = zbxz.a(i9 / i5) * (zbxz.a(localzt6.c()) + j) + 2 * i;
            i9 += i5;
          }
          if ((i9 >= i1) || (i8 == i7)) {
            n = i8;
          } else if (i8 > i7) {
            n = i8 - (zbxz.a(localzt6.c()) + j);
          }
        }
      }
      if (n > paramzamu.d().a().j().m() - 2 * ziy.a) {
        n = paramzamu.d().a().j().m() - 2 * ziy.a;
      }
    }
    else
    {
      paramzamu.c(true);
      i3 = paramzamu.d().a().j().m() - 2 * ziy.a;
      i4 = paramzamu.d().a().a() / 3;
      i5 = zbxz.b(i4 - i - localzt1.b());
      localzt5 = new zt(i5, i3);
      localzt6 = b(paramzr, paramzamu, localzt5);
      m = zbxz.a(i + localzt1.b() + localzt6.b());
      n = zbxz.a(i + i1 * (localzt6.c() + j));
      if (m > i4) {
        m = i4;
      }
      if (n > i3) {
        n = i3;
      }
    }
    return new com.aspose.cells.b.a.b.zs(m, n);
  }
  
  static zt a(zr paramzr, zamu paramzamu, zt paramzt)
  {
    zje localzje = paramzamu.d().a();
    zamw localzamw = paramzamu.f();
    zt localzt1 = new zt(0.0F, 0.0F);
    int i = paramzamu.l();
    for (int j = 0; j < localzamw.getCount(); j++)
    {
      String str = localzamw.b(j).g();
      if (!localzamw.b(j).b())
      {
        zt localzt2 = zbxz.a(paramzr, str, localzamw.b(j).c(), paramzt);
        localzt2.a(localzt2.b() + 2 * i);
        if ((localzje.as().getImageFormat() == ImageFormat.getEmf()) && (localzamw.b(j).c().h() <= 10.0F)) {
          if (localzamw.b(j).c().h() <= 6.0F) {
            localzt2.a(localzt2.b() + str.length() / 5.0F * i);
          } else if (localzamw.b(j).c().h() <= 8.0F) {
            localzt2.a(localzt2.b() + str.length() / 10.0F * i);
          } else if (localzamw.b(j).c().h() <= 10.0F) {
            localzt2.a(localzt2.b() + str.length() / 25.0F * i);
          }
        }
        FontMetrics localFontMetrics = zbxz.a().getFontMetrics(localzamw.b(j).c().a());
        localzt2.b(localzt2.c() - localFontMetrics.getLeading());
        localzt1.a(localzt1.b() + localzt2.b());
        if (localzt1.c() < localzt2.c()) {
          localzt1.b(localzt2.c());
        }
      }
    }
    return localzt1;
  }
  
  static zt b(zr paramzr, zamu paramzamu)
  {
    if (paramzamu.f().b()) {
      return paramzamu.o();
    }
    return new zt(paramzamu.m(), paramzamu.d().C());
  }
  
  static zt b(zr paramzr, zamu paramzamu, zt paramzt)
  {
    zje localzje = paramzamu.c();
    zamw localzamw = paramzamu.f();
    zt localzt1 = new zt(0.0F, 0.0F);
    int i = paramzamu.l();
    for (int j = 0; j < localzamw.getCount(); j++)
    {
      zamy localzamy = localzamw.b(j);
      if (!localzamy.b())
      {
        String str = localzamy.g();
        zt localzt2 = zbxz.a(paramzr, localzamy.g(), localzamw.b(j).c(), paramzt);
        localzt2.a(localzt2.b() + 2 * i);
        if ((localzje.as().getImageFormat() == ImageFormat.getEmf()) && (localzamw.b(j).c().h() <= 10.0F)) {
          if (localzamw.b(j).c().h() <= 6.0F) {
            localzt2.a(localzt2.b() + str.length() / 5.0F * i);
          } else if (localzamw.b(j).c().h() <= 8.0F) {
            localzt2.a(localzt2.b() + str.length() / 10.0F * i);
          } else if (localzamw.b(j).c().h() <= 10.0F) {
            localzt2.a(localzt2.b() + str.length() / 25.0F * i);
          }
        }
        FontMetrics localFontMetrics = zbxz.a().getFontMetrics(localzamw.b(j).c().a());
        localzt2.b(localzt2.c() - localFontMetrics.getLeading());
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
  
  static void a(zr paramzr, zamu paramzamu, boolean paramBoolean, zbfc paramzbfc)
    throws Exception
  {
    paramzamu.d().z();
    zp localzp = new zp(paramzamu.d().a.c(), paramzamu.d().a.d(), paramzamu.d().a.e(), paramzamu.d().a.f());
    if ((!paramzamu.d().q()) && (!paramzamu.d().r()) && (paramzamu.d().s()))
    {
      int i = paramzamu.d().u();
      if (i > paramzamu.d().a.e()) {
        localzp.a(localzp.c() + (i - paramzamu.d().a.e()) / 2);
      }
      j = paramzamu.d().v();
      if (j > paramzamu.d().a.f()) {
        localzp.b(localzp.d() + (j - paramzamu.d().a.f()) / 2);
      }
    }
    ArrayList localArrayList = paramzamu.f().a(paramzamu.h(), paramBoolean);
    int j = localArrayList.size();
    zje localzje = paramzamu.c();
    if (!paramzamu.d().D())
    {
      zc localzc = zbd.a(paramzamu.d().d(), com.aspose.cells.a.c.zn.a(localzp));
      try
      {
        paramzr.a(localzc, localzp);
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
      if (paramzamu.d().f().f()) {
        zanv.a(paramzr, localzp, paramzamu.d().f());
      }
    }
    float f1 = localzje.b() / 3.0F;
    zt localzt1 = b(paramzr, paramzamu);
    int k = paramzamu.k();
    int m = paramzamu.l();
    float f2 = paramzamu.p();
    float f3 = paramzamu.q();
    int n = 1;
    int i1 = localzp.e();
    int i2 = localzp.f();
    float f4 = 0.0F;
    float f5 = 0.0F;
    zt localzt2 = zt.a();
    int i5 = 0;
    zt localzt3 = zt.a();
    zt localzt4 = a(paramzr, paramzamu, new zt(localzje.a(), localzje.b()));
    int i6 = (int)(localzt1.b() * j + localzt4.b());
    int i7 = 0;
    int i3;
    int i4;
    if (i6 <= i1 - k)
    {
      i3 = j;
      i4 = 1;
      f4 = (i1 - k - i6) / i3;
      f5 = (i2 - paramzamu.j() * i4) / i4;
      i7 = 1;
    }
    else
    {
      int i8 = localzp.e() - k;
      int i9 = i8 - (int)localzt1.b();
      localzt3 = new zt(i9, f1);
      localzt2 = b(paramzr, paramzamu, localzt3);
      i5 = (int)(localzt1.b() + localzt2.b());
      i3 = i5 == 0 ? 1 : zbxz.b(i8 / i5);
      if (i3 < 1) {
        i3 = 1;
      }
      i4 = zbxz.a(j / i3);
      if ((i4 > 1) && (i3 > i4))
      {
        int i10 = (int)Math.ceil(j / i4);
        if (i10 < i3) {
          i3 = i10;
        }
      }
      f4 = (i8 - i5 * i3) / i3;
      f5 = (i2 - localzt2.c() * i4) / i4;
      n = zbxz.a(localzt2.c() / paramzamu.d().C());
    }
    if (f4 < 0.0F) {
      f4 = 0.0F;
    }
    if (n > 1)
    {
      if (f5 < f3) {
        f5 = f3;
      }
    }
    else if (f5 < f2) {
      f5 = f2;
    }
    float f6 = localzp.c();
    float f7 = localzp.d();
    f6 += k;
    f6 += f4 / 2.0F;
    f7 += Math.abs(f5) / 2.0F;
    zf localzf = paramzr.d();
    zq localzq1 = paramzr.e();
    paramzr.a(localzp);
    zv localzv = new zv(zv.c());
    for (int i11 = 0; i11 < localArrayList.size(); i11++)
    {
      zamy localzamy = (zamy)localArrayList.get(i11);
      if (f7 > localzp.j()) {
        break;
      }
      zq localzq2 = new zq(f6, f7, localzt1.b(), localzt1.c());
      a(paramzr, paramzamu, localzq2, localzamy);
      String str = localzamy.g();
      zo localzo = new zo(f6 + localzt1.b() + m, f7);
      Object localObject2;
      if ((localzamy.a().c()) || (localzamy.a().d()))
      {
        localObject2 = localzamy.d();
        float f9 = (float)Math.ceil(paramzr.a().a((zg)localObject2));
        float f11 = f9 * ((zg)localObject2).b().c(((zg)localObject2).k()) / ((zg)localObject2).b().e(((zg)localObject2).k());
        float f12 = f9 * ((zg)localObject2).b().d(((zg)localObject2).k()) / ((zg)localObject2).b().e(((zg)localObject2).k());
        float f13 = f9 * ((zg)localObject2).b().f(((zg)localObject2).k()) / ((zg)localObject2).b().e(((zg)localObject2).k());
        float f14 = f13 - f11 - f12;
        float f15 = localzo.e() - (f13 - f9) / 2.0F + f11;
        zg localzg = localzamy.c();
        float f16 = (float)Math.ceil(paramzr.a().a(localzg));
        float f17 = f16 * localzg.b().d(localzg.k()) / localzg.b().e(localzg.k());
        float f18 = f16 * localzg.b().c(localzg.k()) / localzg.b().e(localzg.k());
        float f19 = f16 * localzg.b().f(localzg.k()) / localzg.b().e(localzg.k());
        float f20 = f19 - f18 - f17;
        float f21 = f15 - f18 - 1.0F;
        localzo.b(f21 - (float)(localzamy.a().e() / 100.0D * f9));
      }
      if (i7 != 0)
      {
        paramzr.a(str, localzamy.c(), new zu(localzamy.e()), localzo.d(), localzo.e(), localzv);
        localObject2 = localzp.b();
        if (((com.aspose.cells.b.a.b.zs)localObject2).c() < paramzamu.d().C()) {
          ((com.aspose.cells.b.a.b.zs)localObject2).b(zbxz.c(paramzamu.d().C() + 1.0F));
        }
        zt localzt5 = zbxz.a(paramzr, str, paramzamu.d().h(), (com.aspose.cells.b.a.b.zs)localObject2);
        f6 += localzt1.b() + localzt5.b() + 2 * m;
        if ((localzje.as().getImageFormat() == ImageFormat.getEmf()) && (localzamy.c().h() <= 8.0F)) {
          if (localzamy.c().h() <= 6.0F) {
            f6 += str.length() / 5.0F * m;
          } else if (localzamy.c().h() <= 8.0F) {
            f6 += str.length() / 10.0F * m;
          }
        }
        f6 += f4;
      }
      else
      {
        float f8 = zbxz.a(localzt3.b());
        float f10 = localzt3.c();
        zq localzq3 = new zq(localzo.d(), localzo.e(), f8, f10);
        paramzr.a(str, localzamy.c(), new zu(localzamy.e()), localzq3, localzv);
        f6 += i5;
        f6 += f4;
        if ((i11 + 1) % i3 == 0)
        {
          f6 = localzp.c() + k + f4 / 2.0F;
          f7 += localzt2.c();
          f7 += f5;
        }
      }
    }
    paramzr.a(localzf);
  }
  
  static void a(zr paramzr, zamu paramzamu, zq paramzq, zamy paramzamy)
    throws Exception
  {
    Object localObject1;
    if (paramzamy.h() == 2)
    {
      localObject1 = new zo(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F);
      zo localzo = new zo(paramzq.l(), paramzq.g() + paramzq.i() / 2.0F);
      zanv.a(paramzr, (zo)localObject1, localzo, paramzamy.j().d());
    }
    else if (paramzamy.h() == 1)
    {
      localObject1 = paramzamy.i();
      float f1;
      if (((zbfc)localObject1).av())
      {
        f1 = paramzamu.m();
        zq localzq1 = new zq(paramzq.f(), paramzq.g() + (paramzq.i() - f1) / 2.0F, f1, f1);
        zc localzc = zbd.a(((zbfc)localObject1).A(), localzq1);
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
        com.aspose.cells.a.d.zs localzs = zanv.a(((zbfc)localObject1).z());
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
        if (((zbfc)localObject1).ak())
        {
          if (((zbfc)localObject1).z().e()) {
            zanv.a(paramzr, paramzq.f(), paramzq.g() + paramzq.i() / 2.0F, paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() / 2.0F, ((zbfc)localObject1).z());
          }
          if (((zbfc)localObject1).B().d() != 1)
          {
            f1 = paramzq.f() + paramzq.h() / 2.0F;
            f2 = paramzq.g() + paramzq.i() / 2.0F;
            float f3;
            if (((zbfc)localObject1).B().c() == 0)
            {
              f3 = paramzq.i() * b;
            }
            else
            {
              int i = (int)(((zbfc)localObject1).h().c() * 72 / paramzr.f());
              if (i <= paramzq.i() * b)
              {
                f3 = ((zbfc)localObject1).B().c();
              }
              else
              {
                float f4 = i / ((zbfc)localObject1).v().i().m();
                if (f4 > 1.0F) {
                  f4 = 1.0F;
                }
                f3 = paramzq.i() * b * (1.0F + f4);
                f3 = (int)(f3 * paramzr.f() / 72.0F + 0.5D);
              }
            }
            a(paramzr, f1, f2, ((zbfc)localObject1).B(), f3, true);
          }
        }
        else
        {
          f1 = paramzq.h();
          f2 = paramzamu.m();
          zq localzq2 = new zq(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F - f2 / 2.0F, f1, f2);
          localzq2 = zbxz.a(localzq2);
          zbd.a(paramzr, localzq2, ((zbfc)localObject1).A());
          zanv.a(paramzr, localzq2, ((zbfc)localObject1).z());
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zana.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */