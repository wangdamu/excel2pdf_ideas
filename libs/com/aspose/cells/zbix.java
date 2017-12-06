package com.aspose.cells;

import com.aspose.cells.a.c.zw;
import com.aspose.cells.b.a.b.a.za;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zk;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.util.Iterator;
import java.util.List;

final class zbix
{
  static void a(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    if (paramzbnh.d)
    {
      boolean bool = paramzbnh.F();
      if ((!((GroupShape)paramzbnh.h.n).isFlippedHorizontally()) && (paramzbnh.E())) {
        paramzbnh.b(true);
      } else if ((((GroupShape)paramzbnh.h.n).isFlippedHorizontally()) && (!paramzbnh.E())) {
        paramzbnh.b(true);
      }
      zi localzi = a(paramzbnh);
      paramzr.a(localzi);
      paramzbnh.b(bool);
    }
    else if (paramzbnh.j() != 0)
    {
      localObject = a(paramzbnh);
      paramzr.a((zi)localObject);
    }
    bV(paramzr, paramzbnh);
    Object localObject = paramzbnh.G();
    if (!paramzbnh.n().a()) {
      ((zq)localObject).a(-(paramzbnh.n().f() / 2.0F), -(paramzbnh.n().f() / 2.0F));
    }
    float f1 = zbya.a(paramzbnh.o().h());
    if ((paramzbnh.q() == 7) && ((int)paramzbnh.d().a() == 0)) {
      ((zq)localObject).a(((zq)localObject).f() + f1);
    }
    if (paramzbnh.t() == 3) {
      ((zq)localObject).c(((zq)localObject).h() - f1);
    }
    ((zq)localObject).a(((zq)localObject).f() + (float)paramzbnh.d().a());
    ((zq)localObject).c(((zq)localObject).h() - (float)paramzbnh.d().a());
    ((zq)localObject).b(((zq)localObject).g() + (float)paramzbnh.d().b());
    if (paramzbnh.t() == 3)
    {
      ((zq)localObject).c(((zq)localObject).h() - (float)paramzbnh.d().a());
      ((zq)localObject).d(((zq)localObject).i() - (float)paramzbnh.d().b());
    }
    ((zq)localObject).c(((zq)localObject).h() - (float)paramzbnh.d().c());
    ((zq)localObject).d(((zq)localObject).i() - (float)paramzbnh.d().d());
    int i = paramzbnh.o().d();
    if (((zq)localObject).i() < i)
    {
      float f2 = (i - ((zq)localObject).i()) / 2.0F;
      localObject = new zq(((zq)localObject).f(), ((zq)localObject).g() - f2, ((zq)localObject).h(), i);
    }
    zbya.a(paramzr, paramzbnh, (zq)localObject, paramzbnh.u(), paramzbnh.t(), paramzbnh.o(), paramzbnh.p(), paramzbnh.q(), paramzbnh.r());
  }
  
  private static void bU(zr paramzr, zbnh paramzbnh)
  {
    if (!paramzbnh.n().a())
    {
      com.aspose.cells.a.d.zs localzs = zbya.a(paramzbnh.n());
      double d1 = paramzbnh.n().f();
      double d2 = 0.0D;
      switch (paramzbnh.n().g())
      {
      case 1: 
      case 2: 
        d2 = 0.0D;
        break;
      case 5: 
        d2 = d1 * 0.6000000238418579D;
        break;
      case 4: 
        d2 = 0.0D;
        break;
      case 3: 
        d2 = 0.0D;
      }
      double d3 = 0.0D;
      switch (paramzbnh.n().j())
      {
      case 1: 
      case 2: 
        d3 = 0.0D;
        break;
      case 5: 
        d3 = d1 * 0.6000000238418579D;
        break;
      case 4: 
        d3 = 0.0D;
        break;
      case 3: 
        d3 = 0.0D;
      }
      zo localzo1;
      zo localzo2;
      if (paramzbnh.f() == 0.0F)
      {
        localzo1 = new zo(paramzbnh.h(), paramzbnh.i());
        localzo2 = new zo(paramzbnh.h(), paramzbnh.l().m());
        if ((paramzbnh.a == 1) || (paramzbnh.a == 4))
        {
          localzo1.b(localzo1.e() + (float)d2);
          localzo2.b(localzo2.e() - (float)d3);
          paramzr.a(localzs, localzo1, localzo2);
        }
        else
        {
          localzo2.b(localzo2.e() - (float)d2);
          localzo1.b(localzo1.e() + (float)d3);
          paramzr.a(localzs, localzo2, localzo1);
        }
      }
      else if (paramzbnh.g() == 0.0F)
      {
        localzo1 = new zo(paramzbnh.h(), paramzbnh.i());
        localzo2 = new zo(paramzbnh.h() + paramzbnh.f(), paramzbnh.i());
        if ((paramzbnh.a == 1) || (paramzbnh.a == 2))
        {
          localzo1.a(localzo1.d() + (float)d2);
          localzo2.a(localzo2.d() - (float)d3);
          paramzr.a(localzs, localzo1, localzo2);
        }
        else
        {
          localzo2.a(localzo2.d() - (float)d2);
          localzo1.a(localzo1.d() + (float)d3);
          paramzr.a(localzs, localzo2, localzo1);
        }
      }
      else
      {
        double d4 = Math.sqrt(Math.pow(paramzbnh.f(), 2.0D) + Math.pow(paramzbnh.g(), 2.0D));
        double d5 = paramzbnh.f() * d2 / d4;
        double d6 = paramzbnh.g() * d2 / d4;
        double d7 = paramzbnh.f() * d3 / d4;
        double d8 = paramzbnh.g() * d3 / d4;
        zo localzo3 = new zo(paramzbnh.h(), paramzbnh.i());
        zo localzo4 = new zo(paramzbnh.h(), paramzbnh.i() + paramzbnh.g());
        zo localzo5 = new zo(paramzbnh.h() + paramzbnh.f(), paramzbnh.i() + paramzbnh.g());
        zo localzo6 = new zo(paramzbnh.h() + paramzbnh.f(), paramzbnh.i());
        if (paramzbnh.a == 1)
        {
          localzo3.a(localzo3.d() + (float)d5);
          localzo3.b(localzo3.e() + (float)d6);
          localzo5.a(localzo5.d() - (float)d7);
          localzo5.b(localzo5.e() - (float)d8);
          paramzr.a(localzs, localzo3, localzo5);
          paramzbnh.i = localzo3;
          paramzbnh.j = localzo5;
        }
        else if (paramzbnh.a == 2)
        {
          localzo4.a(localzo4.d() + (float)d5);
          localzo4.b(localzo4.e() - (float)d6);
          localzo6.a(localzo6.d() - (float)d7);
          localzo6.b(localzo6.e() + (float)d8);
          paramzr.a(localzs, localzo4, localzo6);
          paramzbnh.i = localzo4;
          paramzbnh.j = localzo6;
        }
        else if (paramzbnh.a == 3)
        {
          localzo5.a(localzo5.d() - (float)d5);
          localzo5.b(localzo5.e() - (float)d6);
          localzo3.a(localzo3.d() + (float)d7);
          localzo3.b(localzo3.e() + (float)d8);
          paramzr.a(localzs, localzo5, localzo3);
          paramzbnh.i = localzo5;
          paramzbnh.j = localzo3;
        }
        else
        {
          localzo6.a(localzo6.d() - (float)d5);
          localzo6.b(localzo6.e() + (float)d6);
          localzo4.a(localzo4.d() + (float)d7);
          localzo4.b(localzo4.e() - (float)d8);
          paramzr.a(localzs, localzo6, localzo4);
          paramzbnh.i = localzo6;
          paramzbnh.j = localzo4;
        }
      }
    }
  }
  
  static void b(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    bV(paramzr, paramzbnh);
    zq localzq = paramzbnh.l();
    if (!paramzbnh.n().a()) {
      localzq.a(-(paramzbnh.n().f() / 2.0F), -(paramzbnh.n().f() / 2.0F));
    }
    float f1 = zbya.a(paramzbnh.o().h());
    if ((paramzbnh.q() == 7) || (paramzbnh.q() == 9))
    {
      if ((int)paramzbnh.d().a() == 0) {
        localzq.a(localzq.f() + f1);
      }
    }
    else if (((paramzbnh.q() == 0) || (paramzbnh.q() == 8)) && ((int)paramzbnh.d().c() == 0)) {
      localzq.c(localzq.h() - f1);
    }
    localzq.a(localzq.f() + (float)paramzbnh.d().a());
    localzq.b(localzq.g() + (float)paramzbnh.d().b());
    int i = paramzbnh.o().d();
    if (localzq.i() < i)
    {
      float f2 = (i - localzq.i()) / 2.0F;
      localzq = new zq(localzq.f(), localzq.g() - f2, localzq.h(), i);
    }
    zbya.a(paramzr, paramzbnh, localzq, paramzbnh.u(), paramzbnh.t(), paramzbnh.o(), paramzbnh.p(), paramzbnh.q(), paramzbnh.r());
  }
  
  static void c(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    if (zbxz.c(paramzbnh.l())) {
      return;
    }
    zq localzq = paramzbnh.l();
    if (!paramzbnh.m().a())
    {
      localObject = zbya.a(paramzbnh.m(), paramzbnh.l());
      com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
      localze.b(localzq.f(), localzq.g(), localzq.h(), localzq.i(), 0.0F, 360.0F);
      localze.j();
      paramzr.a((com.aspose.cells.b.a.b.zc)localObject, localze);
    }
    if (!paramzbnh.n().a())
    {
      paramzbnh.n().c(0);
      paramzbnh.n().f(0);
      localObject = zbya.a(paramzbnh.n());
      paramzr.a((com.aspose.cells.a.d.zs)localObject, localzq.f(), localzq.g(), localzq.h(), localzq.i());
    }
    Object localObject = paramzbnh.l();
    localObject = a((zq)localObject);
    if (!paramzbnh.n().a()) {
      ((zq)localObject).a(-(paramzbnh.n().f() / 2.0F), -(paramzbnh.n().f() / 2.0F));
    }
    float f1 = zbya.a(paramzbnh.o().h());
    if ((paramzbnh.q() == 7) || (paramzbnh.q() == 9))
    {
      if ((int)paramzbnh.d().a() == 0) {
        ((zq)localObject).a(((zq)localObject).f() + f1);
      }
    }
    else if (((paramzbnh.q() == 0) || (paramzbnh.q() == 8)) && ((int)paramzbnh.d().c() == 0)) {
      ((zq)localObject).c(((zq)localObject).h() - f1);
    }
    int i = paramzbnh.o().d();
    if (((zq)localObject).i() < i)
    {
      float f2 = (i - ((zq)localObject).i()) / 2.0F;
      localObject = new zq(((zq)localObject).f(), ((zq)localObject).g() - f2, ((zq)localObject).h(), i);
    }
    zbya.a(paramzr, paramzbnh, (zq)localObject, paramzbnh.u(), paramzbnh.t(), paramzbnh.o(), paramzbnh.p(), paramzbnh.q(), paramzbnh.r());
  }
  
  static void d(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zq localzq = paramzbnh.l();
    int i = paramzbnh.o().d();
    if (localzq.i() < i)
    {
      float f = (i - localzq.i()) / 2.0F;
      localzq = new zq(localzq.f(), localzq.g() - f, localzq.h(), i);
    }
    zbya.a(paramzr, paramzbnh, localzq, paramzbnh.u(), paramzbnh.t(), paramzbnh.o(), Color.getBlack(), 7, 9);
  }
  
  static void e(zr paramzr, zbnh paramzbnh)
  {
    float f1 = 8.0F;
    float f2 = 8.0F;
    com.aspose.cells.a.d.zs localzs = new com.aspose.cells.a.d.zs(Color.getBlack());
    zt localzt = paramzr.a(paramzbnh.u(), paramzbnh.o());
    zq localzq1 = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.f(), paramzbnh.g());
    if (localzt.b() + f1 + f2 > paramzbnh.f()) {
      localzt.a(paramzbnh.f() - f1 - f2);
    } else {
      f2 = paramzbnh.f() - f1 - localzt.b();
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(localzq1.f(), localzq1.g(), localzq1.f() + f1, localzq1.g());
    localze.b(localzq1.f(), localzq1.g(), localzq1.f(), localzq1.m() - 1.0F);
    localze.b(localzq1.f(), localzq1.m() - 1.0F, localzq1.l(), localzq1.m() - 1.0F);
    localze.b(localzq1.l(), localzq1.m() - 1.0F, localzq1.l(), localzq1.g());
    localze.b(localzq1.l(), localzq1.g(), localzq1.l() - f2, localzq1.g());
    paramzr.a(localzs, localze);
    zq localzq2 = new zq(localzq1.f() + f1, localzq1.g() - localzt.c() / 2.0F, localzt.b(), localzt.c());
    paramzr.a(paramzbnh.u(), paramzbnh.o(), new zu(Color.getBlack()), localzq2);
  }
  
  static void f(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    Color localColor1 = Color.a(zk.f);
    Color localColor2 = Color.a(zk.g);
    Color localColor3 = Color.getWhite();
    Color localColor4 = Color.getBlack();
    zq localzq = paramzbnh.l();
    paramzr.b(new zu(localColor1), localzq.f(), localzq.g(), localzq.h(), localzq.i());
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    localze1.b(localzq.f() + 1.0F, localzq.m() - 1.0F, localzq.l() - 1.0F, localzq.m() - 1.0F);
    localze1.b(localzq.l() - 1.0F, localzq.g() + 1.0F, localzq.l() - 1.0F, localzq.m() - 1.0F);
    paramzr.a(new com.aspose.cells.a.d.zs(localColor2), localze1);
    com.aspose.cells.b.a.b.a.ze localze2 = new com.aspose.cells.b.a.b.a.ze();
    localze2.b(localzq.f(), localzq.g(), localzq.l(), localzq.g());
    localze2.b(localzq.f(), localzq.g(), localzq.f(), localzq.m());
    paramzr.a(new com.aspose.cells.a.d.zs(localColor3), localze2);
    com.aspose.cells.b.a.b.a.ze localze3 = new com.aspose.cells.b.a.b.a.ze();
    localze3.b(localzq.f(), localzq.m(), localzq.l(), localzq.m());
    localze3.b(localzq.l(), localzq.g(), localzq.l(), localzq.m());
    paramzr.a(new com.aspose.cells.a.d.zs(localColor4), localze3);
    zf localzf = paramzr.d();
    paramzr.a(paramzbnh.l());
    zbya.a(paramzr, paramzbnh, paramzbnh.l(), paramzbnh.u(), paramzbnh.t(), paramzbnh.o(), paramzbnh.p(), paramzbnh.q(), paramzbnh.r());
    paramzr.a(localzf);
  }
  
  static void g(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zq localzq1 = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.f(), paramzbnh.g());
    bV(paramzr, paramzbnh);
    float f1 = 5.0F;
    float f2 = 10.0F;
    zq localzq2 = new zq(localzq1.f() + f1, localzq1.g() + (localzq1.i() - f2) / 2.0F, f2, f2);
    zu localzu = new zu(Color.getWhite());
    paramzr.b(localzu, localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
    if (paramzbnh.w() == 1)
    {
      localObject = new com.aspose.cells.b.a.b.a.ze();
      ((com.aspose.cells.b.a.b.a.ze)localObject).b(localzq2.f() + 3.0F, localzq2.g() + 6.0F, localzq2.f() + 5.0F, localzq2.g() + 8.0F);
      ((com.aspose.cells.b.a.b.a.ze)localObject).b(localzq2.f() + 5.0F, localzq2.g() + 8.0F, localzq2.f() + 7.0F, localzq2.g() + 4.0F);
      paramzr.a(new com.aspose.cells.a.d.zs(Color.getBlack()), (com.aspose.cells.b.a.b.a.ze)localObject);
    }
    else if (paramzbnh.w() == 2)
    {
      localObject = new com.aspose.cells.b.a.b.a.zg(12, Color.getBlack(), Color.getWhite());
      paramzr.b((com.aspose.cells.b.a.b.zc)localObject, localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
    }
    paramzr.c(new com.aspose.cells.a.d.zs(Color.getBlack()), localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
    Object localObject = new zv(zv.c());
    ((zv)localObject).b(((zv)localObject).d() | 0x2000);
    float f3 = paramzbnh.f() + 1.0F;
    String str = "a";
    if (paramzbnh.u().length() > 0) {
      str = paramzbnh.u().substring(0, 1);
    }
    zt localzt1 = paramzr.a(str, paramzbnh.o());
    if (f3 < localzt1.b()) {
      f3 = localzt1.b();
    }
    float f4 = localzt1.c();
    zt localzt2 = new zt(f3, f4);
    zt localzt3 = paramzr.a(paramzbnh.u(), paramzbnh.o(), localzt2, (zv)localObject);
    int i = zbxz.a(paramzr, paramzbnh.o());
    zq localzq3 = new zq(localzq2.l() + i, localzq1.g() + (localzq1.i() - localzt3.c()) / 2.0F, localzt3.b(), localzt3.c());
    paramzr.a(paramzbnh.u(), paramzbnh.o(), new zu(paramzbnh.p()), localzq3, (zv)localObject);
  }
  
  static void h(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zq localzq1 = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.f(), paramzbnh.g());
    bV(paramzr, paramzbnh);
    float f1 = 5.0F;
    float f2 = 10.0F;
    zq localzq2 = new zq(localzq1.f() + f1, localzq1.g() + (localzq1.i() - f2) / 2.0F, f2, f2);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.getBlack()), localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i(), 0.0F, 360.0F);
    zu localzu = new zu(Color.getWhite());
    paramzr.a(localzu, localzq2.f() + 1.0F, localzq2.g() + 1.0F, localzq2.h() - 2.0F, localzq2.i() - 2.0F, -90.0F, 450.0F);
    if (paramzbnh.w() == 1) {
      paramzr.a(new zu(Color.getBlack()), localzq2.f() + 2.5F, localzq2.g() + 2.5F, f2 / 2.0F, f2 / 2.0F, 0.0F, 360.0F);
    }
    zv localzv = new zv(zv.c());
    localzv.b(localzv.d() | 0x2000);
    float f3 = paramzbnh.f() + 1.0F;
    String str = "a";
    if (paramzbnh.u().length() > 0) {
      str = paramzbnh.u().substring(0, 1);
    }
    zt localzt1 = paramzr.a(str, paramzbnh.o());
    if (f3 < localzt1.b()) {
      f3 = localzt1.b();
    }
    float f4 = localzt1.c();
    zt localzt2 = new zt(f3, f4);
    zt localzt3 = paramzr.a(paramzbnh.u(), paramzbnh.o(), localzt2, localzv);
    int i = zbxz.a(paramzr, paramzbnh.o());
    zq localzq3 = new zq(localzq2.l() + i, localzq1.g() + (localzq1.i() - localzt3.c()) / 2.0F, localzt3.b(), localzt3.c());
    paramzr.a(paramzbnh.u(), paramzbnh.o(), new zu(paramzbnh.p()), localzq3, localzv);
  }
  
  static void i(zr paramzr, zbnh paramzbnh)
  {
    zq localzq1 = paramzbnh.l();
    float f1 = 14.0F;
    zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h() - f1, localzq1.i());
    paramzr.b(new zu(Color.getWhite()), localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(localzq2.f(), localzq2.g(), localzq2.l(), localzq2.g());
    localze.b(localzq2.f(), localzq2.g(), localzq2.f(), localzq2.m());
    localze.b(localzq2.f(), localzq2.m(), localzq2.l(), localzq2.m());
    paramzr.a(new com.aspose.cells.a.d.zs(Color.getBlack()), localze);
    float f2 = paramzr.a("a", paramzbnh.o()).c();
    float f3 = localzq1.g() + 1.0F;
    for (int i = paramzbnh.y(); (paramzbnh.x() != null) && (i < paramzbnh.x().size()) && (f3 < localzq1.m() - 1.0F); i++)
    {
      String str = com.aspose.cells.b.a.ze.e(paramzbnh.x().get(i));
      localzq3 = new zq(localzq1.f() + 1.0F, f3, localzq2.h() - 2.0F, f2);
      paramzr.a(str, paramzbnh.o(), new zu(paramzbnh.p()), localzq3);
      if (paramzbnh.z() != null)
      {
        localObject1 = paramzbnh.z().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = ((Iterator)localObject1).next();
          if (com.aspose.cells.b.a.ze.d(localObject2) == i) {
            paramzr.c(new com.aspose.cells.a.d.zs(Color.getBlack()), localzq3.f(), localzq3.g(), localzq3.h(), localzq3.i());
          }
        }
      }
      f3 += f2;
    }
    int j = i - 1;
    zq localzq3 = new zq(localzq2.l() + 1.0F, localzq2.g(), f1, localzq1.i());
    paramzr.b(new zu(Color.fromArgb(212, 208, 200)), localzq3.f(), localzq3.g(), localzq3.h(), localzq3.i() + 1.0F);
    Object localObject1 = new zq(localzq3.f(), localzq3.g(), f1, 11.0F);
    paramzr.b(new zu(Color.a(zk.f)), ((zq)localObject1).f(), ((zq)localObject1).g(), ((zq)localObject1).h(), ((zq)localObject1).i());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.getWhite()), ((zq)localObject1).f() + 1.0F, ((zq)localObject1).g() + 1.0F, ((zq)localObject1).f() + 1.0F, ((zq)localObject1).m() - 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.a(zk.g)), ((zq)localObject1).f() + 1.0F, ((zq)localObject1).m(), ((zq)localObject1).l() - 2.0F, ((zq)localObject1).m());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.a(zk.g)), ((zq)localObject1).l() - 1.0F, ((zq)localObject1).g() + 1.0F, ((zq)localObject1).l() - 1.0F, ((zq)localObject1).m() - 1.0F);
    Object localObject2 = new com.aspose.cells.b.a.b.a.ze();
    ((com.aspose.cells.b.a.b.a.ze)localObject2).b(((zq)localObject1).l(), ((zq)localObject1).g(), ((zq)localObject1).l(), ((zq)localObject1).m());
    ((com.aspose.cells.b.a.b.a.ze)localObject2).b(((zq)localObject1).l() - 1.0F, ((zq)localObject1).m(), ((zq)localObject1).l(), ((zq)localObject1).m());
    paramzr.a(new com.aspose.cells.a.d.zs(Color.getBlack()), (com.aspose.cells.b.a.b.a.ze)localObject2);
    paramzr.b(new zu(Color.getBlack()), ((zq)localObject1).f() + 5.0F, ((zq)localObject1).g() + 5.0F, 2.0F, 2.0F);
    zq localzq4 = new zq(localzq3.f(), localzq3.m() - 11.0F, f1, 11.0F);
    a(paramzr, localzq4);
    paramzr.b(new zu(Color.getBlack()), localzq4.f() + 5.0F, localzq4.g() + 5.0F, 2.0F, 2.0F);
    if ((paramzbnh.x() != null) && (j - paramzbnh.y() < paramzbnh.x().size() - 1))
    {
      float f4 = (j + 1) / paramzbnh.x().size() * (localzq1.i() - ((zq)localObject1).i() - localzq4.i());
      float f5 = (paramzbnh.y() + 1) / paramzbnh.x().size() * (localzq1.i() - ((zq)localObject1).i() - localzq4.i());
      zq localzq5 = new zq(localzq3.f(), localzq3.g() + ((zq)localObject1).i() + f5, f1, f4);
      a(paramzr, localzq5);
    }
  }
  
  private static void a(zr paramzr, zq paramzq)
  {
    paramzr.b(new zu(Color.a(zk.f)), paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.getWhite()), paramzq.f() + 1.0F, paramzq.g() + 1.0F, paramzq.f() + 1.0F, paramzq.m() - 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.a(zk.g)), paramzq.f() + 1.0F, paramzq.m(), paramzq.l() - 2.0F, paramzq.m());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.a(zk.g)), paramzq.l() - 1.0F, paramzq.g() + 1.0F, paramzq.l() - 1.0F, paramzq.m() - 1.0F);
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(paramzq.l(), paramzq.g(), paramzq.l(), paramzq.m());
    localze.b(paramzq.l() - 1.0F, paramzq.m(), paramzq.l(), paramzq.m());
    localze.b(paramzq.l() - 1.0F, paramzq.m(), paramzq.l() - 1.0F, paramzq.m() + 1.0F);
    localze.b(paramzq.f(), paramzq.m() + 1.0F, paramzq.l() - 1.0F, paramzq.m() + 1.0F);
    paramzr.a(new com.aspose.cells.a.d.zs(Color.getBlack()), localze);
  }
  
  static void j(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zq localzq1 = paramzbnh.l();
    paramzr.b(new zu(Color.getWhite()), localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
    float f1 = 0.0F;
    if (localzq1.h() > localzq1.i()) {
      f1 = localzq1.i();
    } else {
      f1 = localzq1.h();
    }
    zq localzq2 = new zq(localzq1.l() - f1, localzq1.g(), f1, localzq1.i());
    b(paramzr, localzq2);
    float f2 = localzq2.h() / 2.0F;
    if (localzq2.i() < localzq2.h()) {
      f2 = localzq2.i() / 2.0F;
    }
    float f3 = f2 / 2.0F;
    zo localzo1 = new zo(localzq2.f() + localzq2.h() / 2.0F, localzq2.g() + localzq2.i() / 2.0F + f3 * 0.4F);
    zo localzo2 = new zo(localzo1.d() - f2 / 2.0F, localzo1.e() - f3);
    zo localzo3 = new zo(localzo1.d() + f2 / 2.0F, localzo2.e());
    paramzr.a(new zu(Color.getBlack()), new zo[] { localzo1, localzo2, localzo3 });
    if ((localzq1.h() > localzq1.i()) && (paramzbnh.A() != null) && (!"".equals(paramzbnh.A())))
    {
      zq localzq3 = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.f(), paramzbnh.g());
      localzq3.a(localzq3.f() + 5.0F);
      zbya.a(paramzr, paramzbnh, localzq3, paramzbnh.A(), paramzbnh.t(), paramzbnh.o(), paramzbnh.p(), 7, 1);
    }
    paramzr.c(new com.aspose.cells.a.d.zs(Color.fromArgb(130, 135, 144)), localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
  }
  
  static void k(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zf localzf = paramzr.d();
    if ((paramzbnh.M() > paramzbnh.K()) && (paramzbnh.L() + 1 <= paramzbnh.J())) {
      paramzr.b(paramzbnh.P(), 0.0F);
    } else if ((paramzbnh.L() + 1 > paramzbnh.J()) && (paramzbnh.M() <= paramzbnh.K())) {
      paramzr.b(0.0F, paramzbnh.Q());
    } else if ((paramzbnh.L() + 1 > paramzbnh.J()) && (paramzbnh.M() > paramzbnh.K())) {
      paramzr.b(0.0F, 0.0F);
    } else {
      paramzr.b(paramzbnh.P(), paramzbnh.Q());
    }
    bV(paramzr, paramzbnh);
    zq localzq1 = paramzbnh.l();
    localzq1.a(-3.0F, -1.0F);
    zbya.a(paramzr, paramzbnh, localzq1, paramzbnh.u(), paramzbnh.t(), paramzbnh.o(), Color.getBlack(), 7, 9);
    zq localzq2 = paramzbnh.l();
    zo localzo1 = new zo(localzq2.f(), localzq2.g());
    zo localzo2 = new zo(localzq2.l() + 1.0F, localzq2.g() + 3.0F);
    zo localzo3 = new zo(localzq2.l() + 1.0F, localzq2.m() + 2.0F);
    zo localzo4 = new zo(localzq2.f() + 3.0F, localzq2.m() + 1.0F);
    com.aspose.cells.a.d.zs localzs = zbya.a(paramzbnh.n());
    localzs.b(3.0F);
    paramzr.a(localzs, localzo2, localzo3);
    localzo3 = new zo(localzq2.l() + 3.0F, localzq2.m() + 1.0F);
    paramzr.a(localzs, localzo4, localzo3);
    paramzr.a(localzf);
    localzs.b(1.0F);
    za localza = new za(3.0F, 3.0F);
    localzs.b(localza);
    zo localzo5 = new zo(paramzbnh.P(), paramzbnh.Q());
    if ((paramzbnh.M() > paramzbnh.K()) && (paramzbnh.L() + 1 <= paramzbnh.J()))
    {
      localzo1 = new zo(0.0F, paramzbnh.G().i() - 5.0F);
      localzo5 = new zo(paramzbnh.P(), 0.0F);
      if (paramzbnh.Q() < paramzbnh.l().i()) {
        localzo1 = new zo(0.0F, paramzbnh.Q());
      }
    }
    else if ((paramzbnh.L() + 1 > paramzbnh.J()) && (paramzbnh.M() <= paramzbnh.K()))
    {
      localzo1 = new zo(paramzbnh.G().h() - 5.0F, 0.0F);
      localzo5 = new zo(paramzbnh.l().h(), paramzbnh.Q());
      if (paramzbnh.P() < paramzbnh.l().h()) {
        localzo1 = new zo(paramzbnh.P(), 0.0F);
      }
    }
    else if ((paramzbnh.L() + 1 > paramzbnh.J()) && (paramzbnh.M() > paramzbnh.K()))
    {
      if ((paramzbnh.Q() > paramzbnh.l().i()) && (paramzbnh.P() > paramzbnh.l().h()))
      {
        localzo1 = new zo(paramzbnh.G().h() - 5.0F, paramzbnh.Q());
        localzo5 = new zo(paramzbnh.l().h(), paramzbnh.l().i());
      }
      else if ((paramzbnh.Q() <= paramzbnh.l().i()) && (paramzbnh.P() > paramzbnh.l().h()))
      {
        localzo1 = new zo(paramzbnh.G().h() - 5.0F, paramzbnh.Q());
        localzo5 = new zo(paramzbnh.l().h(), 0.0F);
      }
      else if ((paramzbnh.Q() > paramzbnh.l().i()) && (paramzbnh.P() <= paramzbnh.l().h()))
      {
        localzo1 = new zo(paramzbnh.P(), paramzbnh.G().i() - 5.0F);
        localzo5 = new zo(paramzbnh.G().h() - 5.0F, paramzbnh.l().i());
      }
    }
    paramzr.a(localzs, localzo1, localzo5);
  }
  
  static void l(zr paramzr, zbnh paramzbnh)
  {
    zq localzq = paramzbnh.l();
    paramzr.b(new zu(Color.fromArgb(240, 240, 240)), localzq.f(), localzq.g(), localzq.h(), localzq.i());
    float f1 = localzq.m() - 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(234, 234, 234)), localzq.j(), f1, localzq.l(), f1);
    f1 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(244, 244, 244)), localzq.j(), f1, localzq.l(), f1);
    f1 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(244, 244, 244)), localzq.j(), f1, localzq.l(), f1);
    f1 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(243, 243, 243)), localzq.j(), f1, localzq.l(), f1);
    f1 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(242, 242, 242)), localzq.j(), f1, localzq.l(), f1);
    f1 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(241, 241, 241)), localzq.j(), f1, localzq.l(), f1);
    float f2 = localzq.j();
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(248, 248, 248)), f2, localzq.k(), f2, localzq.m());
    f2 += 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(227, 227, 227)), f2, localzq.k(), f2, localzq.m());
    f2 += 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(227, 227, 227)), f2, localzq.k(), f2, localzq.m());
    f2 += 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(231, 231, 231)), f2, localzq.k(), f2, localzq.m());
    f2 += 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(237, 237, 237)), f2, localzq.k(), f2, localzq.m());
    f2 += 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(239, 239, 239)), f2, localzq.k(), f2, localzq.m());
    f2 = localzq.l() - 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(234, 234, 234)), f2, localzq.k(), f2, localzq.m());
    f2 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(242, 242, 242)), f2, localzq.k(), f2, localzq.m());
    f2 -= 1.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(241, 241, 241)), f2, localzq.k(), f2, localzq.m());
    int[][] arrayOfInt1 = { { 245, 246, 243, 241, 236, 246, 238, 249, 243, 242, 241, 240, 240, 240, 240 }, { 237, 235, 232, 237, 242, 245, 247, 244, 244, 244, 242, 242, 241, 240, 240 }, { 240, 245, 242, 239, 250, 243, 243, 34, 246, 244, 243, 241, 240, 240, 240 }, { 244, 231, 242, 247, 245, 249, 32, 36, 66, 249, 242, 242, 242, 241, 240 }, { 239, 247, 245, 248, 236, 33, 42, 89, 88, 78, 254, 243, 248, 240, 234 }, { 241, 247, 243, 246, 31, 55, 86, 117, 116, 93, 78, 240, 244, 246, 244 }, { 238, 243, 247, 45, 78, 125, 153, 154, 155, 148, 126, 113, 252, 237, 247 }, { 243, 247, 104, 138, 176, 191, 186, 191, 191, 196, 195, 193, 167, 246, 246 }, { 241, 249, 242, 249, 241, 251, 247, 244, 239, 246, 247, 239, 239, 243, 247 }, { 242, 245, 249, 243, 243, 241, 244, 247, 247, 250, 248, 240, 250, 249, 234 } };
    int i = com.aspose.cells.a.c.zc.a(arrayOfInt1, 0);
    int j = com.aspose.cells.a.c.zc.a(arrayOfInt1, 1);
    float f3 = localzq.f() + localzq.h() / 2.0F - j / 2;
    float f4 = localzq.g() + localzq.h() / 2.0F - i / 2;
    f1 = f4;
    for (int k = 0; k < i; k++)
    {
      f2 = f3;
      for (m = 0; m < j; m++)
      {
        n = arrayOfInt1[k][m];
        paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(n, n, n)), f2, f1, f2 + 1.0F, f1);
        f2 += 1.0F;
      }
      f1 += 1.0F;
    }
    int[][] arrayOfInt2 = { { 242, 248, 241, 245, 249, 242, 243, 246, 245, 241, 251, 238, 244, 245 }, { 244, 245, 243, 240, 245, 244, 249, 247, 241, 248, 243, 247, 249, 245 }, { 246, 55, 45, 31, 29, 35, 28, 26, 37, 41, 84, 122, 244, 233 }, { 244, 247, 100, 104, 88, 84, 91, 85, 108, 156, 180, 238, 245, 251 }, { 244, 245, 249, 124, 130, 132, 121, 155, 183, 204, 246, 247, 245, 239 }, { 241, 241, 246, 243, 133, 139, 154, 178, 198, 241, 245, 245, 241, 243 }, { 240, 241, 246, 242, 247, 132, 185, 205, 254, 244, 253, 238, 237, 239 }, { 240, 239, 245, 244, 242, 251, 189, 244, 241, 246, 236, 238, 247, 241 }, { 240, 239, 240, 241, 244, 245, 246, 245, 244, 240, 240, 240, 240, 240 } };
    i = com.aspose.cells.a.c.zc.a(arrayOfInt2, 0);
    j = com.aspose.cells.a.c.zc.a(arrayOfInt2, 1);
    f3 = localzq.f() + localzq.h() / 2.0F - j / 2;
    f4 = localzq.m() - localzq.h() / 2.0F - i / 2;
    f1 = f4;
    for (int m = 0; m < i; m++)
    {
      f2 = f3;
      for (n = 0; n < j; n++)
      {
        i1 = arrayOfInt2[m][n];
        paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(i1, i1, i1)), f2, f1, f2 + 1.0F, f1);
        f2 += 1.0F;
      }
      f1 += 1.0F;
    }
    int[] arrayOfInt3 = { 154, 227, 221, 215, 211, 221, 150 };
    int n = 150;
    int i1 = 207;
    int i2 = 151;
    int[] arrayOfInt4 = { 203, 206, 199, 187 };
    int[][] arrayOfInt5 = { { 246, 246, 246, 242, 241, 239 }, { 245, 245, 243, 240, 238, 236 }, { 245, 243, 240, 236, 234, 232 }, { 244, 241, 236, 233, 231, 230 }, { 228, 241, 239, 236, 235, 234 } };
    float f5 = localzq.g() + localzq.h() + (localzq.i() - 2.0F * localzq.h()) * paramzbnh.B() / (paramzbnh.D() - paramzbnh.C());
    i = com.aspose.cells.a.c.zc.a(arrayOfInt5, 0);
    j = com.aspose.cells.a.c.zc.a(arrayOfInt5, 1);
    f3 = localzq.f() + 2.0F;
    f4 = f5 - 2.0F;
    f1 = f4;
    for (int i3 = 0; i3 < i; i3++)
    {
      f2 = f3;
      for (int i4 = 0; i4 < j; i4++)
      {
        int i5 = arrayOfInt5[i3][i4];
        paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(i5, i5, i5)), f2, f1, f2 + 1.0F, f1);
        f2 += 1.0F;
      }
      f1 += 1.0F;
    }
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt4[0], arrayOfInt4[0], arrayOfInt4[0])), localzq.f() + 1.0F, f5 - 3.0F, localzq.f() + 2.0F, f5 - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt4[1], arrayOfInt4[1], arrayOfInt4[1])), localzq.l() - 3.0F, f5 - 3.0F, localzq.l() - 2.0F, f5 - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt4[2], arrayOfInt4[2], arrayOfInt4[2])), localzq.f() + 1.0F, f5 + 3.0F, localzq.f() + 2.0F, f5 + 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt4[3], arrayOfInt4[3], arrayOfInt4[3])), localzq.l() - 3.0F, f5 + 3.0F, localzq.l() - 2.0F, f5 + 3.0F);
    f2 = localzq.f() + 2.0F + com.aspose.cells.a.c.zc.a(arrayOfInt5, 1);
    f1 = f5 - 2.0F;
    for (i3 = 1; i3 < arrayOfInt3.length - 1; i3++)
    {
      paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt3[i3], arrayOfInt3[i3], arrayOfInt3[i3])), f2, f1, localzq.l() - 3.0F, f1);
      f1 += 1.0F;
    }
    f2 = localzq.f() + 2.0F;
    f1 = f5 - 3.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt3[0], arrayOfInt3[0], arrayOfInt3[0])), f2, f1, localzq.l() - 3.0F, f1);
    f2 = localzq.f() + 2.0F;
    f1 = f5 + 3.0F;
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt3[6], arrayOfInt3[6], arrayOfInt3[6])), f2, f1, localzq.l() - 3.0F, f1);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(i2, i2, i2)), localzq.f() + 1.0F, f5 - 2.0F, localzq.f() + 1.0F, f5 + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(n, n, n)), localzq.l() - 2.0F, f5 - 2.0F, localzq.l() - 2.0F, f5 + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(i1, i1, i1)), localzq.l() - 3.0F, f5 - 2.0F, localzq.l() - 3.0F, f5 + 2.0F);
  }
  
  static void m(zr paramzr, zbnh paramzbnh)
  {
    zq localzq1 = paramzbnh.l();
    paramzr.b(new zu(Color.getWhite()), localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
    zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i() / 2.0F);
    b(paramzr, localzq2);
    float f1 = localzq2.h() / 2.0F;
    if (localzq2.i() < localzq2.h()) {
      f1 = localzq2.i() / 2.0F;
    }
    float f2 = f1 / 2.0F;
    zo localzo1 = new zo(localzq2.f() + localzq2.h() / 2.0F, localzq2.g() + localzq2.i() / 2.0F - f2 * 0.4F);
    zo localzo2 = new zo(localzo1.d() - f1 / 2.0F, localzo1.e() + f2);
    zo localzo3 = new zo(localzo1.d() + f1 / 2.0F, localzo2.e());
    paramzr.a(new zu(Color.getBlack()), new zo[] { localzo1, localzo2, localzo3 });
    zq localzq3 = new zq(localzq1.f(), localzq1.g() + localzq1.i() / 2.0F, localzq1.h(), localzq1.i() / 2.0F);
    b(paramzr, localzq3);
    localzo1 = new zo(localzq3.f() + localzq3.h() / 2.0F, localzq3.g() + localzq3.i() / 2.0F + f2 * 0.4F);
    localzo2 = new zo(localzo1.d() - f1 / 2.0F, localzo1.e() - f2);
    localzo3 = new zo(localzo1.d() + f1 / 2.0F, localzo2.e());
    paramzr.a(new zu(Color.getBlack()), new zo[] { localzo1, localzo2, localzo3 });
  }
  
  private static void b(zr paramzr, zq paramzq)
  {
    int[] arrayOfInt1 = { 242, 241, 240, 239, 237, 236, 235 };
    int[] arrayOfInt2 = { 221, 219, 218, 216, 214, 212, 210, 209, 207 };
    int i = zbya.a((paramzq.i() - 4.0F) / 2.0F / arrayOfInt1.length);
    float f = paramzq.g() + 3.0F;
    int k;
    com.aspose.cells.a.d.zs localzs;
    for (int j = 0; j < arrayOfInt1.length; j++) {
      for (k = 0; k < i; k++)
      {
        localzs = new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt1[j], arrayOfInt1[j], arrayOfInt1[j]));
        try
        {
          paramzr.b(localzs, paramzq.f() + 2.0F, f, paramzq.l() - 3.0F, f);
          f += 1.0F;
        }
        finally
        {
          if (localzs != null) {
            localzs.s();
          }
        }
      }
    }
    f = paramzq.g() + paramzq.i() / 2.0F;
    i = zbya.a((paramzq.i() - 4.0F) / 2.0F / arrayOfInt2.length);
    for (j = 0; j < arrayOfInt2.length; j++)
    {
      for (k = 0; k < i; k++)
      {
        localzs = new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt2[j], arrayOfInt2[j], arrayOfInt2[j]));
        try
        {
          paramzr.b(localzs, paramzq.f() + 2.0F, f, paramzq.l() - 3.0F, f);
          f += 1.0F;
          if (f >= paramzq.m() - 3.0F)
          {
            if (localzs == null) {
              break;
            }
            localzs.s();
            break;
          }
        }
        finally
        {
          if (localzs != null) {
            localzs.s();
          }
        }
      }
      if (f >= paramzq.m() - 3.0F) {
        break;
      }
    }
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(138, 138, 138)), paramzq.f(), paramzq.g() + 1.0F, paramzq.f() + 1.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(147, 147, 147)), paramzq.f() + 1.0F, paramzq.g(), paramzq.f() + 1.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(143, 143, 143)), paramzq.f() + 1.0F, paramzq.g() + 1.0F, paramzq.f() + 2.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(226, 226, 226)), paramzq.f() + 1.0F, paramzq.g() + 2.0F, paramzq.f() + 2.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(228, 228, 228)), paramzq.f() + 2.0F, paramzq.g() + 1.0F, paramzq.f() + 3.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.f() + 2.0F, paramzq.g() + 2.0F, paramzq.f() + 3.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(226, 226, 226)), paramzq.f() + 1.0F, paramzq.m() - 3.0F, paramzq.f() + 2.0F, paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.f() + 2.0F, paramzq.m() - 3.0F, paramzq.f() + 3.0F, paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(138, 138, 138)), paramzq.f(), paramzq.m() - 2.0F, paramzq.f() + 1.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(143, 143, 143)), paramzq.f() + 1.0F, paramzq.m() - 2.0F, paramzq.f() + 2.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(228, 228, 228)), paramzq.f() + 2.0F, paramzq.m() - 2.0F, paramzq.f() + 3.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(147, 147, 147)), paramzq.f() + 1.0F, paramzq.m() - 1.0F, paramzq.f() + 2.0F, paramzq.m() - 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(147, 147, 147)), paramzq.l() - 3.0F, paramzq.g(), paramzq.l() - 2.0F, paramzq.g());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(226, 226, 226)), paramzq.l() - 3.0F, paramzq.g() + 1.0F, paramzq.l() - 2.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(143, 143, 143)), paramzq.l() - 2.0F, paramzq.g() + 1.0F, paramzq.l() - 1.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(138, 138, 138)), paramzq.l() - 1.0F, paramzq.g() + 1.0F, paramzq.l() - 1.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.l() - 3.0F, paramzq.g() + 2.0F, paramzq.l() - 2.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(228, 228, 228)), paramzq.l() - 2.0F, paramzq.g() + 2.0F, paramzq.l() - 1.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.l() - 3.0F, paramzq.m() - 3.0F, paramzq.l() - 2.0F, paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(226, 226, 226)), paramzq.l() - 2.0F, paramzq.m() - 3.0F, paramzq.l() - 1.0F, paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(228, 228, 228)), paramzq.l() - 3.0F, paramzq.m() - 2.0F, paramzq.l() - 2.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(147, 147, 147)), paramzq.l() - 2.0F, paramzq.m() - 2.0F, paramzq.l() - 2.0F, paramzq.m() - 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(143, 143, 143)), paramzq.l() - 2.0F, paramzq.m() - 2.0F, paramzq.l() - 1.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(138, 138, 138)), paramzq.l() - 1.0F, paramzq.m() - 3.0F, paramzq.l() - 1.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(112, 112, 112)), paramzq.f() + 2.0F, paramzq.g(), paramzq.l() - 3.0F, paramzq.g());
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(252, 252, 252)), paramzq.f() + 3.0F, paramzq.g() + 1.0F, paramzq.l() - 4.0F, paramzq.g() + 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt1[0], arrayOfInt1[0], arrayOfInt1[0])), paramzq.f() + 3.0F, paramzq.g() + 2.0F, paramzq.l() - 4.0F, paramzq.g() + 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(112, 112, 112)), paramzq.l() - 1.0F, paramzq.g() + 2.0F, paramzq.l() - 1.0F, paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.l() - 2.0F, paramzq.g() + 3.0F, paramzq.l() - 2.0F, paramzq.m() - 4.0F - (paramzq.i() - 4.0F) / 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(245, 245, 245)), paramzq.l() - 2.0F, paramzq.g() + 3.0F + (paramzq.i() - 4.0F) / 2.0F, paramzq.l() - 2.0F, paramzq.m() - 4.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(112, 112, 112)), paramzq.f(), paramzq.g() + 2.0F, paramzq.f(), paramzq.m() - 3.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(250, 250, 250)), paramzq.f() + 1.0F, paramzq.g() + 3.0F, paramzq.f() + 1.0F, paramzq.m() - 4.0F - (paramzq.i() - 4.0F) / 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(246, 246, 246)), paramzq.f() + 1.0F, paramzq.g() + 3.0F + (paramzq.i() - 4.0F) / 2.0F, paramzq.f() + 1.0F, paramzq.m() - 4.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(112, 112, 112)), paramzq.f() + 2.0F, paramzq.m() - 1.0F, paramzq.l() - 3.0F, paramzq.m() - 1.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(243, 243, 243)), paramzq.f() + 3.0F, paramzq.m() - 2.0F, paramzq.l() - 4.0F, paramzq.m() - 2.0F);
    paramzr.b(new com.aspose.cells.a.d.zs(Color.fromArgb(arrayOfInt2[(arrayOfInt2.length - 1)], arrayOfInt2[(arrayOfInt2.length - 1)], arrayOfInt2[(arrayOfInt2.length - 1)])), paramzq.f() + 3.0F, paramzq.m() - 3.0F, paramzq.l() - 4.0F, paramzq.m() - 3.0F);
  }
  
  static void n(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    paramzr.a(a(paramzbnh));
    zq localzq = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.f(), paramzbnh.g());
    if (!paramzbnh.m().a())
    {
      localObject = zbya.a(paramzbnh.m(), localzq);
      paramzr.b((com.aspose.cells.b.a.b.zc)localObject, localzq);
    }
    Object localObject = (Picture)paramzbnh.h;
    zj localzj = a((Picture)localObject);
    if (localzj == null) {
      return;
    }
    MsoFormatPicture localMsoFormatPicture = ((Picture)localObject).getFormatPicture();
    double d1 = localMsoFormatPicture.getLeftCrop();
    double d2 = localMsoFormatPicture.getRightCrop();
    double d3 = localMsoFormatPicture.getTopCrop();
    double d4 = localMsoFormatPicture.getBottomCrop();
    float f1 = (float)(localzj.m().b() * d1);
    float f2 = (float)(localzj.m().c() * d3);
    float f3 = (float)(localzj.m().b() * (1.0D - d1 - d2));
    float f4 = (float)(localzj.m().c() * (1.0D - d3 - d4));
    if (d1 + d2 + d3 + d4 != 0.0D)
    {
      if (localzj != null) {
        paramzr.a(localzj, new zp((int)paramzbnh.h(), (int)paramzbnh.i(), (int)paramzbnh.f(), (int)paramzbnh.g()), f1, f2, f3, f4, 2);
      }
    }
    else if (localzj != null) {
      paramzr.a(localzj, paramzbnh.h(), paramzbnh.i(), paramzbnh.f(), paramzbnh.g());
    }
    if (localzj != null) {
      localzj.d();
    }
    if (!paramzbnh.n().a())
    {
      int i = paramzbnh.n().g();
      int j = paramzbnh.n().j();
      paramzbnh.n().c(0);
      paramzbnh.n().f(0);
      com.aspose.cells.a.d.zs localzs = zbya.a(paramzbnh.n());
      localzq.a(paramzbnh.n().f() / 2.0F, paramzbnh.n().f() / 2.0F);
      paramzr.c(localzs, localzq.f(), localzq.g(), localzq.h(), localzq.i());
      paramzbnh.n().c(i);
      paramzbnh.n().f(j);
    }
  }
  
  static zi a(zbnh paramzbnh)
  {
    zq localzq = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.f(), paramzbnh.g());
    float f1;
    float f2;
    if (paramzbnh.k())
    {
      f1 = localzq.f() + localzq.h() / 2.0F;
      f2 = localzq.g() + localzq.i() / 2.0F;
    }
    else
    {
      f1 = localzq.f() + localzq.h() / 2.0F;
      f2 = localzq.g() + localzq.i() / 2.0F;
    }
    zi localzi = new zi(paramzbnh.F() ? -1.0F : 1.0F, 0.0F, 0.0F, paramzbnh.E() ? -1.0F : 1.0F, paramzbnh.F() ? zbxz.a(f1) * 2.0F : 0.0F, paramzbnh.E() ? zbxz.a(f2) * 2.0F : 0.0F);
    localzi.a((paramzbnh.F() ^ paramzbnh.E()) ? -paramzbnh.j() : paramzbnh.j(), new zo(zbxz.a(f1), zbxz.a(f2)));
    if ((paramzbnh.k()) && (!paramzbnh.f) && (!paramzbnh.d) && (paramzbnh.U())) {
      localzi.b(zbxz.a(localzq.i() / 2.0F - localzq.h() / 2.0F), zbxz.a(localzq.h() / 2.0F - localzq.i() / 2.0F), 1);
    }
    return localzi;
  }
  
  static void o(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zq localzq = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.f(), paramzbnh.g());
    byte[] arrayOfByte = ((OleObject)paramzbnh.h).getImageData();
    if (arrayOfByte != null)
    {
      zh localzh = new zh(arrayOfByte);
      if ((localzh != null) && (localzh.h() != 0L))
      {
        zj localzj = zj.a(localzh);
        paramzr.a(localzj, paramzbnh.h(), paramzbnh.i(), paramzbnh.f(), paramzbnh.g());
        if (localzj != null) {
          localzj.d();
        }
      }
      if (localzh != null) {
        localzh.a();
      }
    }
    if (!paramzbnh.n().a())
    {
      int i = paramzbnh.n().g();
      int j = paramzbnh.n().j();
      paramzbnh.n().c(0);
      paramzbnh.n().f(0);
      com.aspose.cells.a.d.zs localzs = zbya.a(paramzbnh.n());
      localzq.a(paramzbnh.n().f() / 2.0F, paramzbnh.n().f() / 2.0F);
      paramzr.c(localzs, localzq.f(), localzq.g(), localzq.h(), localzq.i());
      paramzbnh.n().c(i);
      paramzbnh.n().f(j);
    }
  }
  
  static zj a(Picture paramPicture)
    throws Exception
  {
    if (paramPicture == null) {
      return null;
    }
    byte[] arrayOfByte = paramPicture.getData();
    Object localObject;
    if ((arrayOfByte != null) && (arrayOfByte.length > 0))
    {
      localObject = new zh(arrayOfByte);
      return zj.a((zm)localObject);
    }
    if (paramPicture.d())
    {
      localObject = paramPicture.getSourceFullName();
      if (((String)localObject).indexOf("http:") >= 0) {
        try
        {
          zm localzm = zw.d((String)localObject);
          if (localzm == null) {
            return null;
          }
          return zj.a(localzm);
        }
        catch (Exception localException) {}
      }
      if (zd.c((String)localObject)) {
        return zj.a((String)localObject);
      }
      return null;
    }
    return null;
  }
  
  static zq a(zq paramzq)
  {
    double d1 = paramzq.h() / 2.0F;
    double d2 = paramzq.i() / 2.0F;
    double d3 = Math.atan(d2 / d1);
    double d4 = Math.sqrt(1.0D / (Math.cos(d3) * Math.cos(d3) / (d1 * d1) + Math.sin(d3) * Math.sin(d3) / (d2 * d2)));
    float f1 = (float)(d1 - d4 * Math.cos(d3));
    float f2 = (float)(d2 - d4 * Math.sin(d3));
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    localzq.a(-f1, -f2);
    return localzq;
  }
  
  private static void bV(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    if (!paramzbnh.m().a())
    {
      com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
      localze.b(paramzbnh.l());
      com.aspose.cells.b.a.b.zc localzc = zbya.a(paramzbnh.m(), localze);
      paramzr.b(localzc, paramzbnh.l());
    }
    if (!paramzbnh.n().a())
    {
      int i = paramzbnh.n().g();
      int j = paramzbnh.n().j();
      paramzbnh.n().c(0);
      paramzbnh.n().f(0);
      com.aspose.cells.a.d.zs localzs = zbya.a(paramzbnh.n());
      float f1 = paramzbnh.h();
      float f2 = paramzbnh.i();
      float f3 = paramzbnh.f();
      float f4 = paramzbnh.g();
      if (paramzbnh.n().f() <= 1.0F)
      {
        f3 -= paramzbnh.n().f() / 2.0F;
        f4 -= paramzbnh.n().f() / 2.0F;
      }
      paramzr.c(localzs, f1, f2, f3, f4);
      paramzbnh.n().c(i);
      paramzbnh.n().f(j);
    }
  }
  
  static void p(zr paramzr, zbnh paramzbnh)
  {
    zbfp localzbfp = new zbfp(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    bU(paramzr, paramzbnh);
  }
  
  static void q(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbie localzbie = new zbie(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbie.a();
  }
  
  static void r(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbir localzbir = new zbir(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbir.a();
  }
  
  static void s(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbfv localzbfv = new zbfv(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbfv.a();
  }
  
  static void t(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbfx localzbfx = new zbfx(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbfx.a();
  }
  
  static void u(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbft localzbft = new zbft(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbft.a();
  }
  
  static void v(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgu localzbgu = new zbgu(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgu.a();
  }
  
  static void w(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgs localzbgs = new zbgs(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgs.a();
  }
  
  static void x(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgv localzbgv = new zbgv(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgv.a();
  }
  
  static void y(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgx localzbgx = new zbgx(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgx.a();
  }
  
  static void z(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmt localzbmt = new zbmt(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmt.a();
  }
  
  static void A(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbji localzbji = new zbji(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbji.a();
  }
  
  static void B(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjp localzbjp = new zbjp(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjp.a();
  }
  
  static void C(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhy localzbhy = new zbhy(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhy.a();
  }
  
  static void D(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbod localzbod = new zbod(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbod.a();
  }
  
  static void E(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbog localzbog = new zbog(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbog.a();
  }
  
  static void F(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmi localzbmi = new zbmi(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmi.a();
  }
  
  static void G(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbfr localzbfr = new zbfr(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbfr.a();
  }
  
  static void H(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjt localzbjt = new zbjt(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjt.a();
  }
  
  static void I(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbfz localzbfz = new zbfz(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbfz.a();
  }
  
  static void J(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zblb localzblb = new zblb(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzblb.a();
  }
  
  static void K(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zblj localzblj = new zblj(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzblj.a();
  }
  
  static void L(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgi localzbgi = new zbgi(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgi.a();
  }
  
  static void M(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbno localzbno = new zbno(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbno.a();
  }
  
  static void N(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmr localzbmr = new zbmr(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmr.a();
  }
  
  static void O(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjg localzbjg = new zbjg(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjg.a();
  }
  
  static void P(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbob localzbob = new zbob(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbob.a();
  }
  
  static void Q(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhw localzbhw = new zbhw(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhw.a();
  }
  
  static void R(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjn localzbjn = new zbjn(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjn.a();
  }
  
  static void S(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbof localzbof = new zbof(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbof.a();
  }
  
  static void T(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmg localzbmg = new zbmg(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmg.a();
  }
  
  static void U(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjr localzbjr = new zbjr(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjr.a();
  }
  
  static void V(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zzc localzzc = new zzc(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzzc.a();
  }
  
  static void W(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zxu localzxu = new zxu(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzxu.a();
  }
  
  static void X(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zxw localzxw = new zxw(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzxw.a();
  }
  
  static void Y(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zxz localzxz = new zxz(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzxz.a();
  }
  
  static void Z(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyc localzyc = new zyc(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyc.a();
  }
  
  static void aa(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zye localzye = new zye(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzye.a();
  }
  
  static void ab(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyg localzyg = new zyg(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyg.a();
  }
  
  static void ac(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyi localzyi = new zyi(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyi.a();
  }
  
  static void ad(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyl localzyl = new zyl(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyl.a();
  }
  
  static void ae(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyn localzyn = new zyn(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyn.a();
  }
  
  static void af(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyp localzyp = new zyp(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyp.a();
  }
  
  static void ag(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyr localzyr = new zyr(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyr.a();
  }
  
  static void ah(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyt localzyt = new zyt(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyt.a();
  }
  
  static void ai(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyv localzyv = new zyv(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyv.a();
  }
  
  static void aj(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyy localzyy = new zyy(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyy.a();
  }
  
  static void ak(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyz localzyz = new zyz(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyz.a();
  }
  
  static void al(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zze localzze = new zze(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzze.a();
  }
  
  static void am(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zzg localzzg = new zzg(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzzg.a();
  }
  
  static void an(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zzi localzzi = new zzi(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzzi.a();
  }
  
  static void ao(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zzk localzzk = new zzk(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzzk.a();
  }
  
  static void ap(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zzm localzzm = new zzm(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzzm.a();
  }
  
  static void aq(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zxr localzxr = new zxr(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzxr.a();
  }
  
  static void ar(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zxs localzxs = new zxs(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzxs.a();
  }
  
  static void as(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyb localzyb = new zyb(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyb.a();
  }
  
  static void at(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zxt localzxt = new zxt(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzxt.a();
  }
  
  static void au(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zyk localzyk = new zyk(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzyk.a();
  }
  
  static void av(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zzb localzzb = new zzb(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzzb.a();
  }
  
  static void aw(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zxy localzxy = new zxy(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzxy.a();
  }
  
  static void ax(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmk localzbmk = new zbmk(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmk.a();
  }
  
  static void ay(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zblh localzblh = new zblh(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzblh.a();
  }
  
  static void az(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbnv localzbnv = new zbnv(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbnv.a();
  }
  
  static void aA(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhl localzbhl = new zbhl(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhl.a();
  }
  
  static void aB(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbnd localzbnd = new zbnd(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbnd.a();
  }
  
  static void aC(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbld localzbld = new zbld(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbld.a();
  }
  
  static void aD(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbnx localzbnx = new zbnx(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbnx.a();
  }
  
  static void aE(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmy localzbmy = new zbmy(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmy.a();
  }
  
  static void aF(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zblf localzblf = new zblf(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzblf.a();
  }
  
  static void aG(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbja localzbja = new zbja(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbja.a();
  }
  
  static void aH(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgo localzbgo = new zbgo(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgo.a();
  }
  
  static void aI(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmo localzbmo = new zbmo(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmo.a();
  }
  
  static void aJ(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgg localzbgg = new zbgg(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgg.a();
  }
  
  static void aK(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgq localzbgq = new zbgq(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgq.a();
  }
  
  static void aL(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgb localzbgb = new zbgb(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgb.a();
  }
  
  static void aM(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbio localzbio = new zbio(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbio.a();
  }
  
  static void aN(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbnj localzbnj = new zbnj(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbnj.a();
  }
  
  static void aO(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbho localzbho = new zbho(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbho.a();
  }
  
  static void aP(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjv localzbjv = new zbjv(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjv.a();
  }
  
  static void aQ(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbnq localzbnq = new zbnq(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbnq.a();
  }
  
  static void aR(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zblm localzblm = new zblm(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzblm.a();
  }
  
  static void aS(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjk localzbjk = new zbjk(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjk.a();
  }
  
  static void aT(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmv localzbmv = new zbmv(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmv.a();
  }
  
  static void aU(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhq localzbhq = new zbhq(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhq.a();
  }
  
  static void aV(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbfn localzbfn = new zbfn(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbfn.a();
  }
  
  static void aW(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhs localzbhs = new zbhs(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhs.a();
  }
  
  static void aX(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zboi localzboi = new zboi(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzboi.a();
  }
  
  static void aY(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbia localzbia = new zbia(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbia.a();
  }
  
  static void aZ(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgd localzbgd = new zbgd(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgd.a();
  }
  
  static void ba(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkw localzbkw = new zbkw(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkw.a();
  }
  
  static void bb(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbiu localzbiu = new zbiu(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbiu.a();
  }
  
  static void bc(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhe localzbhe = new zbhe(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhe.a();
  }
  
  static void bd(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhc localzbhc = new zbhc(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhc.a();
  }
  
  static void be(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgz localzbgz = new zbgz(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgz.a();
  }
  
  static void bf(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhg localzbhg = new zbhg(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhg.a();
  }
  
  static void bg(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgl localzbgl = new zbgl(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgl.a();
  }
  
  static void bh(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbky localzbky = new zbky(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbky.a();
  }
  
  static void bi(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjm localzbjm = new zbjm(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjm.a();
  }
  
  static void bj(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmx localzbmx = new zbmx(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmx.a();
  }
  
  static void bk(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbii localzbii = new zbii(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbii.a();
  }
  
  static void bl(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbik localzbik = new zbik(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbik.a();
  }
  
  static void bm(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zblw localzblw = new zblw(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzblw.a();
  }
  
  static void bn(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbly localzbly = new zbly(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbly.a();
  }
  
  static void bo(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmc localzbmc = new zbmc(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmc.a();
  }
  
  static void bp(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zblq localzblq = new zblq(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzblq.a();
  }
  
  static void bq(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbls localzbls = new zbls(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbls.a();
  }
  
  static void br(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zblu localzblu = new zblu(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzblu.a();
  }
  
  static void bs(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbok localzbok = new zbok(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbok.a();
  }
  
  static void bt(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjc localzbjc = new zbjc(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjc.a();
  }
  
  static void bu(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbom localzbom = new zbom(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbom.a();
  }
  
  static void bv(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhu localzbhu = new zbhu(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhu.a();
  }
  
  static void bw(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbnz localzbnz = new zbnz(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbnz.a();
  }
  
  static void bx(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhb localzbhb = new zbhb(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhb.a();
  }
  
  static void by(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbhi localzbhi = new zbhi(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbhi.a();
  }
  
  static void bz(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkj localzbkj = new zbkj(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkj.a();
  }
  
  static void bA(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbmm localzbmm = new zbmm(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbmm.a();
  }
  
  static void bB(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbnf localzbnf = new zbnf(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbnf.a();
  }
  
  static void bC(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbig localzbig = new zbig(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbig.a();
  }
  
  static void bD(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbgm localzbgm = new zbgm(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbgm.a();
  }
  
  static void bE(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkk localzbkk = new zbkk(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkk.a();
  }
  
  static void bF(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkl localzbkl = new zbkl(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkl.a();
  }
  
  static void bG(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkm localzbkm = new zbkm(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkm.a();
  }
  
  static void bH(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjx localzbjx = new zbjx(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjx.a();
  }
  
  static void bI(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjy localzbjy = new zbjy(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjy.a();
  }
  
  static void bJ(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbjz localzbjz = new zbjz(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbjz.a();
  }
  
  static void bK(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbka localzbka = new zbka(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbka.a();
  }
  
  static void bL(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkf localzbkf = new zbkf(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkf.a();
  }
  
  static void bM(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkg localzbkg = new zbkg(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkg.a();
  }
  
  static void bN(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkh localzbkh = new zbkh(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkh.a();
  }
  
  static void bO(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbki localzbki = new zbki(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbki.a();
  }
  
  static void bP(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkb localzbkb = new zbkb(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkb.a();
  }
  
  static void bQ(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkc localzbkc = new zbkc(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkc.a();
  }
  
  static void bR(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbkd localzbkd = new zbkd(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbkd.a();
  }
  
  static void bS(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbke localzbke = new zbke(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbke.a();
  }
  
  static void bT(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    zbnt localzbnt = new zbnt(paramzr, paramzbnh.h(), paramzbnh.i(), paramzbnh);
    localzbnt.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */