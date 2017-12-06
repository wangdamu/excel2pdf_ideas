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
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

final class zra
{
  static int a = 2;
  
  static zt a(zr paramzr, zbt paramzbt, zbff paramzbff, int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    zbfd localzbfd = paramzbff.c(paramInt1);
    zjf localzjf = localzbfd.v();
    zkf localzkf = localzbfd.F().b(paramInt2);
    zqy localzqy = localzkf.o();
    if (!localzqy.z()) {
      return new zt(0.0F, 0.0F);
    }
    if (a(localzkf)) {
      return new zt(0.0F, 0.0F);
    }
    boolean bool1 = false;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    if (paramzbt.g() == 0)
    {
      bool1 = localzjf.z().a;
      localArrayList1 = localzjf.z().c();
      localArrayList2 = localArrayList1;
    }
    else
    {
      bool1 = localzjf.z().b;
      localArrayList1 = localzjf.z().d();
      localArrayList2 = localArrayList1;
      if ((!localzjf.g().q()) && (bool1)) {
        localArrayList2 = localzjf.z().f();
      }
    }
    Object localObject1 = localzqy.p();
    boolean bool2 = localzqy.y();
    boolean bool3 = localzqy.x();
    String str1 = localzbfd.i();
    String str2 = "";
    if (a(localzbfd.ai()))
    {
      localObject2 = localzkf.s();
      str2 = a(localzjf.an(), localObject2, (String)localObject1, bool2, localzjf.U());
      if (bool3) {
        str2 = a(localzjf.an(), localObject2, localzkf.u(), localzkf.v(), localzjf.U());
      }
    }
    else if (bool1)
    {
      localObject2 = paramInt2 < localArrayList2.size() ? ((zgn)localArrayList2.get(paramInt2)).c() : "";
      boolean bool4 = paramInt2 < localArrayList2.size() ? ((zgn)localArrayList2.get(paramInt2)).b() : false;
      if (bool3)
      {
        localObject1 = localObject2;
        bool2 = bool4;
      }
      if ((paramInt2 < localArrayList2.size()) && (paramInt2 < localArrayList1.size()))
      {
        Object localObject3 = ((zgn)localArrayList1.get(paramInt2)).a();
        int i = ziz.a(localObject3, localzjf.U());
        localObject4 = ((zgn)localArrayList2.get(paramInt2)).a();
        if (i == -1) {
          str2 = "";
        } else {
          str2 = a(localzjf.an(), localObject4, (String)localObject1, bool2, localzjf.U());
        }
      }
      else
      {
        str2 = "";
      }
    }
    else
    {
      str2 = paramInt2 >= paramzbt.l.size() ? "" : a(localzjf.an(), paramzbt.l.get(paramInt2), (String)localObject1, bool2, localzjf.U());
    }
    Object localObject2 = zbv.a(paramzbt);
    double d1 = localzkf.w();
    d1 = ((zbt)localObject2).n() ? ((zbt)localObject2).h(d1) : d1;
    d1 = ((zbt)localObject2).n() ? d1 : d1 * Math.pow(10.0D, ((zbt)localObject2).T().f());
    String str3 = a(localzjf.an(), Double.valueOf(d1), (String)localObject1, bool2, localzjf.U());
    if (bool3) {
      str3 = a(localzjf.an(), Double.valueOf(d1), localzkf.A(), localzkf.B(), localzjf.U());
    }
    if (localzkf.z()) {
      str3 = com.aspose.cells.b.a.zs.a(localzkf.y());
    }
    Object localObject4 = a(localzjf.an(), Double.valueOf(localzkf.C()), (String)localObject1, bool2, localzjf.U());
    if (bool3) {
      localObject4 = a(localzjf.an(), Double.valueOf(localzkf.C()), localzkf.D(), localzkf.E(), localzjf.U());
    }
    String str4 = localzqy.m();
    zg localzg = localzqy.a().h();
    int j = localzqy.n();
    int k = localzqy.o();
    int m = localzqy.q();
    zt localzt1 = new zt(0.0F, 0.0F);
    if (localzqy.e()) {
      localzt1 = new zt(localzqy.D(), localzqy.F());
    }
    double d2 = localzjf.a() * 0.2F;
    double d3 = localzjf.b() * 0.5F;
    double d4 = localzqy.n() % 90;
    if (localzqy.n() != 0)
    {
      double d5 = localzqy.n() * 3.141592653589793D / 180.0D;
      if ((Math.abs(d4) > 86.0D) || (d4 == 0.0D))
      {
        double d6 = d3;
        d2 = d3;
        d3 = d2;
      }
      else if (Math.abs(d4) > 55.0D)
      {
        d2 = localzjf.a() * 0.2F * Math.abs(Math.sin(d5));
      }
      else
      {
        d2 = localzjf.a() * 0.2F * Math.abs(Math.cos(d5));
      }
    }
    if (!localzqy.G()) {
      d2 = 10000.0D;
    }
    zt localzt2 = new zt((float)d2, (float)d3);
    String str5 = "";
    com.aspose.cells.b.a.b.zs localzs = com.aspose.cells.b.a.b.zs.a();
    Object localObject5;
    Object localObject6;
    Object localObject7;
    if (localzqy.s() == null)
    {
      if (localzqy.h()) {
        str5 = str5 + str1;
      }
      if (localzqy.d())
      {
        if (!"".equals(str5)) {
          str5 = str5 + str4;
        }
        str5 = str5 + str2;
      }
      if (localzqy.g())
      {
        if (!"".equals(str5)) {
          str5 = str5 + str4;
        }
        str5 = str5 + str3;
      }
      if (localzqy.i())
      {
        if (!"".equals(str5)) {
          str5 = str5 + str4;
        }
        str5 = str5 + (String)localObject4;
      }
      if ((localzqy.r()) || (localzqy.t()))
      {
        localzs = zbvy.a(localzqy.a().a().ap(), str5, 255, localzqy.a().h(), localzt2, localzqy.o(), localzqy.q(), localzqy.v());
      }
      else
      {
        localzqy.u().clear();
        localzqy.u().a(str5, localzqy.a().h(), localzqy.a().j(), localzqy.a().k(), 2);
        localObject5 = new zbcw();
        ((zbcw)localObject5).a(1);
        ((zbcw)localObject5).b(1);
        zq localzq1 = new zq(0.0F, 0.0F, localzt2.b(), localzt2.c());
        localObject6 = new zbde(localzq1, (zbcw)localObject5, localzqy.u(), localzqy.a().h(), zbxz.b(str5));
        localObject7 = ((zbde)localObject6).a(localzqy.a().a().ap(), localzjf.at());
        localzs = new com.aspose.cells.b.a.b.zs((int)(((zq)localObject7).h() + 0.5D), (int)(((zq)localObject7).i() + 0.5D));
      }
    }
    else if (localzqy.B())
    {
      localObject5 = "";
      for (int n = 0; n < localzqy.u().getCount(); n++)
      {
        localObject6 = localzqy.u().a(n);
        if (((zaiy)localObject6).a().indexOf("[SERIES NAME]") >= 0) {
          ((zaiy)localObject6).a(zw.a(((zaiy)localObject6).a(), "[SERIES NAME]", str1));
        } else if (((zaiy)localObject6).a().indexOf("[CATEGORY NAME]") >= 0) {
          ((zaiy)localObject6).a(zw.a(((zaiy)localObject6).a(), "[CATEGORY NAME]", str2));
        } else if (((zaiy)localObject6).a().indexOf("[VALUE]") >= 0) {
          ((zaiy)localObject6).a(zw.a(((zaiy)localObject6).a(), "[VALUE]", str3));
        }
        localObject5 = (String)localObject5 + ((zaiy)localObject6).a();
      }
      zbcw localzbcw = new zbcw();
      localzbcw.a(1);
      localzbcw.b(1);
      localObject6 = new zq(0.0F, 0.0F, localzt2.b(), localzt2.c());
      localObject7 = new zbde((zq)localObject6, localzbcw, localzqy.u(), localzqy.a().h(), zbxz.b((String)localObject5));
      zq localzq2 = ((zbde)localObject7).a(localzqy.a().a().ap(), localzjf.at());
      localzs = new com.aspose.cells.b.a.b.zs((int)(localzq2.h() + 0.5D), (int)(localzq2.i() + 0.5D));
    }
    else
    {
      str5 = localzqy.s();
      if ("".equals(str5)) {
        return new zt(0.0F, 0.0F);
      }
      if ((localzqy.r()) || (localzqy.t())) {
        localzs = zbvy.a(localzqy.a().a().ap(), str5, 255, localzqy.a().h(), localzt2, localzqy.o(), localzqy.q(), localzqy.v());
      } else {
        localzs = zbvy.a(paramzr, str5, 0, localzg, localzt2, k, m);
      }
    }
    if (localzqy.e())
    {
      localObject5 = new zt(localzs.b() + localzt1.b(), localzs.c());
      ((zt)localObject5).a(((zt)localObject5).b() + 2 * a);
    }
    else
    {
      localObject5 = new zt(localzs.b(), localzs.c());
    }
    ((zt)localObject5).a(((zt)localObject5).b() + 2 * a);
    ((zt)localObject5).b(((zt)localObject5).c() + 2 * a);
    localzqy.c = new com.aspose.cells.b.a.b.zs((int)(((zt)localObject5).b() + 0.5D), (int)(((zt)localObject5).c() + 0.5D));
    double d7 = localzqy.n() * 3.141592653589793D / 180.0D;
    int i1 = (int)(((zt)localObject5).b() * Math.abs(Math.cos(d7)) + ((zt)localObject5).c() * Math.abs(Math.sin(d7)) + 0.5D);
    int i2 = (int)(((zt)localObject5).b() * Math.abs(Math.sin(d7)) + ((zt)localObject5).c() * Math.abs(Math.cos(d7)) + 0.5D);
    return new zt(i1, i2);
  }
  
  static void a(zr paramzr, zbt paramzbt, zbff paramzbff, int paramInt1, int paramInt2, zp paramzp)
    throws Exception
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(paramzr, paramzbt, paramzbff, paramInt1, paramInt2, localzq);
  }
  
  static void a(zr paramzr, zbt paramzbt, zbff paramzbff, int paramInt1, int paramInt2, zq paramzq)
    throws Exception
  {
    zbfd localzbfd = paramzbff.c(paramInt1);
    zjf localzjf = localzbfd.v();
    zkf localzkf = localzbfd.F().b(paramInt2);
    zqy localzqy = localzkf.o();
    if (!localzqy.z()) {
      return;
    }
    if (a(localzkf)) {
      return;
    }
    zq[] arrayOfzq = { paramzq };
    localzjf.a(arrayOfzq);
    paramzq = arrayOfzq[0];
    zq localzq1 = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    localzqy.a().a = new zp((int)localzq1.f(), (int)localzq1.g(), (int)localzq1.h(), (int)localzq1.i());
    zf localzf = paramzr.d();
    if ((a(localzbfd, localzkf, localzqy, localzq1)) && (paramzr.i() != 4)) {
      paramzr.b(4, false);
    }
    float f1 = localzq1.f() + localzq1.h() / 2.0F;
    float f2 = localzq1.g() + localzq1.i() / 2.0F;
    zq localzq2 = new zq(f1 - localzqy.c.b() / 2.0F, f2 - localzqy.c.c() / 2.0F, localzqy.c.b(), localzqy.c.c());
    int i = 0;
    if (localzqy.n() != 0)
    {
      i = 1;
      paramzr.b(f1, f2);
      paramzr.a(-localzqy.n());
    }
    boolean bool1 = false;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    if (paramzbt.g() == 0)
    {
      bool1 = localzjf.z().a;
      localArrayList1 = localzjf.z().c();
      localArrayList2 = localArrayList1;
    }
    else
    {
      bool1 = localzjf.z().b;
      localArrayList1 = localzjf.z().d();
      localArrayList2 = localArrayList1;
      if ((!localzjf.g().q()) && (bool1)) {
        localArrayList2 = localzjf.z().f();
      }
    }
    Object localObject1 = localzqy.p();
    boolean bool2 = localzqy.y();
    boolean bool3 = localzqy.x();
    String str1 = localzbfd.i();
    String str2 = "";
    boolean bool4 = false;
    if (a(localzbfd.ai()))
    {
      localObject2 = localzkf.s();
      str2 = a(localzjf.an(), localObject2, (String)localObject1, bool2, localzjf.U());
      if (bool3)
      {
        str2 = a(localzjf.an(), localObject2, localzkf.u(), localzkf.v(), localzjf.U());
        bool4 = a(localObject2, localzkf.u());
      }
    }
    else if (bool1)
    {
      localObject2 = paramInt2 < localArrayList2.size() ? ((zgn)localArrayList2.get(paramInt2)).c() : "";
      boolean bool5 = paramInt2 < localArrayList2.size() ? ((zgn)localArrayList2.get(paramInt2)).b() : false;
      if (bool3)
      {
        localObject1 = localObject2;
        bool2 = bool5;
      }
      if ((paramInt2 < localArrayList2.size()) && (paramInt2 < localArrayList1.size()))
      {
        Object localObject3 = ((zgn)localArrayList1.get(paramInt2)).a();
        int j = ziz.a(localObject3, localzjf.U());
        Object localObject4 = ((zgn)localArrayList2.get(paramInt2)).a();
        if (j == -1) {
          str2 = "";
        } else {
          str2 = a(localzjf.an(), localObject4, (String)localObject1, bool2, localzjf.U());
        }
        if (bool3) {
          bool4 = a(localObject3, (String)localObject1);
        }
      }
      else
      {
        str2 = "";
      }
    }
    else
    {
      str2 = paramInt2 >= paramzbt.l.size() ? "" : a(localzjf.an(), paramzbt.l.get(paramInt2), (String)localObject1, bool2, localzjf.U());
      if ((paramInt2 < paramzbt.l.size()) && (bool3)) {
        bool4 = a(paramzbt.l.get(paramInt2), (String)localObject1);
      }
    }
    Object localObject2 = zbv.a(paramzbt);
    double d = localzkf.w();
    d = ((zbt)localObject2).n() ? ((zbt)localObject2).h(d) : d;
    d = ((zbt)localObject2).n() ? d : d * Math.pow(10.0D, ((zbt)localObject2).T().f());
    boolean bool6 = false;
    boolean bool7 = false;
    String str3;
    if (bool3)
    {
      str3 = a(localzjf.an(), Double.valueOf(d), localzkf.A(), localzkf.B(), localzjf.U());
      bool6 = a(Double.valueOf(d), localzkf.A());
      bool7 = b(Double.valueOf(d), localzkf.A());
    }
    else
    {
      str3 = a(localzjf.an(), Double.valueOf(d), (String)localObject1, bool2, localzjf.U());
      bool6 = a(Double.valueOf(d), (String)localObject1);
      bool7 = b(Double.valueOf(d), (String)localObject1);
    }
    if (localzkf.z()) {
      str3 = com.aspose.cells.b.a.zs.a(localzkf.y());
    }
    String str4 = a(localzjf.an(), Double.valueOf(localzkf.C()), (String)localObject1, bool2, localzjf.U());
    if (bool3) {
      str4 = a(localzjf.an(), Double.valueOf(localzkf.C()), localzkf.D(), localzkf.E(), localzjf.U());
    }
    String str5 = localzqy.m();
    zg localzg = localzqy.a().h();
    Color localColor = localzqy.a().j();
    int k = localzqy.o();
    int m = localzqy.q();
    zt localzt = new zt(localzqy.D(), localzqy.F());
    if ((localzqy.a().a.e() > 0) && (localzqy.a().a.f() > 0))
    {
      zq localzq3 = new zq(localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
      if (localzqy.e())
      {
        localzq3.a(localzq3.f() + (int)(localzt.b() + 2 * a));
        localzq3.c(localzq3.h() - (int)(localzt.b() + 2 * a));
      }
      if (i != 0)
      {
        localzq3.a(localzq3.f() - (int)f1);
        localzq3.b(localzq3.g() - (int)f2);
      }
      localzqy.a().c().a(localzq3);
      localzqy.a().d().a(localzq3);
    }
    if (i != 0)
    {
      localzq2.a(localzq2.f() - (int)f1);
      localzq2.b(localzq2.g() - (int)f2);
    }
    int n = (int)localzq2.f() + a;
    int i1 = (int)localzq2.g() + a;
    int i2 = (int)localzq2.h() - 2 * a;
    int i3 = (int)localzq2.i() - 2 * a;
    if (localzqy.e())
    {
      localObject5 = new zq(localzq2.f() + a, localzq2.g() + a, localzt.b(), localzt.c());
      zanb.a(paramzr, (zq)localObject5, localzbfd, paramInt2);
      n += (int)(localzt.b() + 2 * a);
      i2 -= (int)(localzt.b() + 2 * a);
    }
    Object localObject5 = new zp(n, i1, i2, i3);
    String str6 = "";
    Object localObject7;
    if (localzqy.s() == null)
    {
      localzqy.u().clear();
      if (((bool6) && (localzqy.g())) || ((bool4) && (localzqy.d()))) {
        localColor = Color.getRed();
      } else if ((bool7) && (localzqy.g())) {
        localColor = Color.getWhite();
      } else {
        localColor = localzqy.a().j();
      }
      if (localzqy.h())
      {
        str6 = str6 + str1;
        localzqy.u().a(str1, localzqy.a().h(), localColor, localzqy.a().k(), 2);
      }
      if (localzqy.d()) {
        if (!"".equals(str6))
        {
          str6 = str6 + str5 + str2;
          localzqy.u().a(str5 + str2, localzqy.a().h(), localColor, localzqy.a().k(), 2);
        }
        else
        {
          str6 = str6 + str2;
          localzqy.u().a(str2, localzqy.a().h(), localColor, localzqy.a().k(), 2);
        }
      }
      if (localzqy.g()) {
        if (!"".equals(str6))
        {
          str6 = str6 + str5 + str3;
          localzqy.u().a(str5 + str3, localzqy.a().h(), localColor, localzqy.a().k(), 2);
        }
        else
        {
          str6 = str6 + str3;
          localzqy.u().a(str3, localzqy.a().h(), localColor, localzqy.a().k(), 2);
        }
      }
      if (localzqy.i()) {
        if (!"".equals(str6))
        {
          str6 = str6 + str5 + str4;
          localzqy.u().a(str5 + str4, localzqy.a().h(), localColor, localzqy.a().k(), 2);
        }
        else
        {
          str6 = str6 + str4;
          localzqy.u().a(str4, localzqy.a().h(), localColor, localzqy.a().k(), 2);
        }
      }
      boolean bool8 = zbxz.b(str6);
      if ((localzqy.r()) || (localzqy.t()))
      {
        zbvy.a(paramzr, (zp)localObject5, str6, 255, localzqy.a().h(), localzqy.a().j(), localzqy.o(), localzqy.q(), localzqy.v(), localzqy.w());
      }
      else
      {
        localObject7 = new zbcw();
        ((zbcw)localObject7).a(zbvy.a(localzqy.o()));
        ((zbcw)localObject7).b(zbvy.a(localzqy.q()));
        zbde localzbde = new zbde((zp)localObject5, (zbcw)localObject7, localzqy.u(), localzqy.a().h(), bool8);
        localzbde.b(paramzr, localzjf.at());
        localzqy.u().clear();
      }
    }
    else
    {
      Object localObject6;
      if (localzqy.B())
      {
        localObject6 = new zbcw();
        ((zbcw)localObject6).a(zbvy.a(localzqy.o()));
        ((zbcw)localObject6).b(zbvy.a(localzqy.q()));
        localObject7 = new zbde((zp)localObject5, (zbcw)localObject6, localzqy.u(), localzqy.a().h(), localzqy.A());
        ((zbde)localObject7).b(paramzr, localzjf.at());
      }
      else
      {
        str6 = localzqy.s();
        if (!"".equals(str6))
        {
          if ((bool4) || (bool6)) {
            localColor = Color.getRed();
          }
          if ((localzqy.r()) || (localzqy.t()))
          {
            zbvy.a(paramzr, (zp)localObject5, str6, 255, localzqy.a().h(), localzqy.a().j(), localzqy.o(), localzqy.q(), localzqy.v(), localzqy.w());
          }
          else
          {
            localObject6 = new zv(zv.c());
            ((zv)localObject6).a(zbvy.a(k));
            ((zv)localObject6).c(zbvy.a(m));
            localObject7 = new zu(localColor);
            if (Math.abs(localzqy.n()) == 90) {
              ((zp)localObject5).d(((zp)localObject5).f() + 1);
            }
            paramzr.a(str6, localzg, (zc)localObject7, (zp)localObject5, (zv)localObject6);
          }
        }
      }
    }
    paramzr.a(localzf);
  }
  
  static boolean a(zbfd paramzbfd, zkf paramzkf, zqy paramzqy, zq paramzq)
  {
    if (!paramzqy.a().c().k()) {
      return false;
    }
    zjf localzjf = paramzqy.a().a();
    zp localzp = localzjf.B().a;
    boolean bool = zbxz.a(paramzq, localzp);
    if ((bool) && (localzjf.i().c().k()) && (localzjf.B().c().k()))
    {
      if ((c(paramzbfd.m())) && (!paramzkf.i().k()) && (paramzkf.w() != 0.0D) && (d(paramzqy.j()))) {
        return false;
      }
      return (!localzjf.ab()) || (localzjf.W().d().k());
    }
    return (!bool) && (localzjf.i().c().k());
  }
  
  private static boolean c(int paramInt)
  {
    if (paramInt == 14) {
      return true;
    }
    if (paramInt == 15) {
      return true;
    }
    if (paramInt == 16) {
      return true;
    }
    if (paramInt == 17) {
      return true;
    }
    if (paramInt == 20) {
      return true;
    }
    if (paramInt == 18) {
      return true;
    }
    if (paramInt == 19) {
      return true;
    }
    if (paramInt == 6) {
      return true;
    }
    if (paramInt == 8) {
      return true;
    }
    if (paramInt == 11) {
      return true;
    }
    if (paramInt == 9) {
      return true;
    }
    if (paramInt == 10) {
      return true;
    }
    if (paramInt == 7) {
      return true;
    }
    if (paramInt == 0) {
      return true;
    }
    if (paramInt == 1) {
      return true;
    }
    if (paramInt == 2) {
      return true;
    }
    if (paramInt == 3) {
      return true;
    }
    if (paramInt == 4) {
      return true;
    }
    if (paramInt == 5) {
      return true;
    }
    if (paramInt == 12) {
      return true;
    }
    if (paramInt == 13) {
      return true;
    }
    if (paramInt == 50) {
      return true;
    }
    if (paramInt == 52) {
      return true;
    }
    if (paramInt == 53) {
      return true;
    }
    if (paramInt == 55) {
      return true;
    }
    if (paramInt == 54) {
      return true;
    }
    if (paramInt == 56) {
      return true;
    }
    if (paramInt == 51) {
      return true;
    }
    if (paramInt == 28) {
      return true;
    }
    if (paramInt == 30) {
      return true;
    }
    if (paramInt == 29) {
      return true;
    }
    if (paramInt == 31) {
      return true;
    }
    if (paramInt == 33) {
      return true;
    }
    if (paramInt == 32) {
      return true;
    }
    if (paramInt == 34) {
      return true;
    }
    if (paramInt == 21) {
      return true;
    }
    if (paramInt == 23) {
      return true;
    }
    if (paramInt == 22) {
      return true;
    }
    if (paramInt == 24) {
      return true;
    }
    if (paramInt == 26) {
      return true;
    }
    if (paramInt == 25) {
      return true;
    }
    return paramInt == 27;
  }
  
  private static boolean d(int paramInt)
  {
    if (paramInt == 1) {
      return true;
    }
    if (paramInt == 2) {
      return true;
    }
    return paramInt == 3;
  }
  
  private static boolean a(zkf paramzkf)
  {
    int i = paramzkf.g().a().m();
    int j = paramzkf.g().a().ai();
    if (((i == 15) || (i == 16)) && ((paramzkf.z()) || ((paramzkf.x() == 3) && (paramzkf.a())))) {
      return true;
    }
    return ((j == 38) || (j == 39) || (j == 1) || (j == 2) || (j == 19) || (j == 20)) && (paramzkf.z());
  }
  
  static String a(zzx paramzzx, Object paramObject, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramObject == null) {
      return "";
    }
    if ((paramString == null) && (paramObject != null)) {
      return com.aspose.cells.b.a.zs.a(paramObject);
    }
    String str = "";
    int i = zaoj.a(paramObject.getClass());
    if ((a(paramString)) && ((i == 14) || (i == 9)))
    {
      double d;
      DateTime localDateTime;
      switch (i)
      {
      case 14: 
        d = ((Double)paramObject).doubleValue();
        localDateTime = zbxz.a(d, paramBoolean2);
        return zgy.a(paramzzx, localDateTime, paramString, paramBoolean2);
      case 9: 
        d = ((Integer)paramObject).intValue();
        localDateTime = zbxz.a(d, paramBoolean2);
        if (com.aspose.cells.b.a.ze.f(paramObject) == 60)
        {
          str = zgy.a(paramzzx, paramObject, paramString);
          if ((paramString.indexOf("d") >= 0) && (str.indexOf("28") >= 0)) {
            str = zw.a(str, "28", "29");
          }
          return str;
        }
        return zgy.a(paramzzx, localDateTime, paramString, paramBoolean2);
      }
    }
    str = zgy.a(paramzzx, paramObject, paramString);
    return str;
  }
  
  static Color a(Object paramObject, String paramString, Color paramColor)
  {
    if (paramObject != null)
    {
      if ((paramString == null) || ("".equals(paramString))) {
        return paramColor;
      }
      int i = zaoj.a(paramObject.getClass());
      if (((i == 14) || (i == 9)) && (paramString.toLowerCase().indexOf("[red]") > 0)) {
        return com.aspose.cells.b.a.ze.g(paramObject) < 0.0D ? Color.getRed() : paramColor;
      }
    }
    return paramColor;
  }
  
  static boolean a(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return false;
    }
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    int i = zaoj.a(paramObject.getClass());
    return ((i == 14) || (i == 9)) && (paramString.toLowerCase().indexOf("[red]") > 0) && (((Double)paramObject).doubleValue() < 0.0D);
  }
  
  static boolean b(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return false;
    }
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    int i = zaoj.a(paramObject.getClass());
    return ((i == 14) || (i == 9)) && (paramString.indexOf("[White][=0]") >= 0) && (((Double)paramObject).doubleValue() == 0.0D);
  }
  
  private static boolean a(String paramString)
  {
    String[] arrayOfString = { "MMM", "DD", "YYYY", "M/", "/M", "/D", "D/", "/Y", "Y/", "-M", "M-", "-D", "D-", "-Y", "Y-", "MM/DD", "DD/MM", "M/D", "D/M", "MM-DD", "DD-MM", "M-D", "D-M", "H:MM", "MM:SS", Character.toString('年'), Character.toString('月'), Character.toString('日'), Character.toString('时'), Character.toString('分'), Character.toString('秒'), "MM" };
    for (int i = 0; i < arrayOfString.length; i++) {
      if ((paramString.indexOf(arrayOfString[i]) != -1) || (paramString.toUpperCase().indexOf(arrayOfString[i]) != -1)) {
        return true;
      }
    }
    return false;
  }
  
  static boolean a(int paramInt)
  {
    return (paramInt == 60) || (paramInt == 12);
  }
  
  static int b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 15: 
    case 16: 
    case 19: 
    case 20: 
    case 22: 
    case 23: 
    case 25: 
    case 26: 
    case 29: 
    case 30: 
    case 32: 
    case 33: 
    case 35: 
    case 36: 
    case 51: 
    case 52: 
    case 54: 
    case 55: 
      return 1;
    case 6: 
    case 9: 
    case 14: 
    case 17: 
    case 18: 
    case 21: 
    case 24: 
    case 27: 
    case 28: 
    case 31: 
    case 34: 
    case 50: 
    case 53: 
    case 56: 
      return 4;
    case 12: 
    case 13: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return 8;
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      return 4;
    }
    return 1;
  }
  
  public static void a(zjf paramzjf, zqy paramzqy, zp paramzp, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3)
    throws Exception
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(paramzjf, paramzqy, localzq, paramString, paramInt1, paramzg, paramColor, paramInt2, paramInt3);
  }
  
  public static void a(zjf paramzjf, zqy paramzqy, zq paramzq, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3)
    throws Exception
  {
    zr localzr = paramzjf.ap();
    zf localzf = localzr.d();
    if ((paramzqy.a().a().i().c().k()) && (paramzqy.a().c().k()) && (localzr.i() != 4)) {
      localzr.b(4, false);
    }
    zv localzv = new zv(zv.c());
    localzv.a(zbvy.a(paramInt2));
    localzv.c(zbvy.a(paramInt3));
    boolean bool = zbxz.b(paramString);
    if (zbxz.a(paramString))
    {
      paramzqy.u().clear();
      paramzqy.u().a(paramString, paramzqy.a().h(), paramzqy.a().j(), paramzqy.a().k(), 2);
      zbcw localzbcw = new zbcw();
      localzbcw.a(zbvy.a(paramzqy.o()));
      localzbcw.b(zbvy.a(paramzqy.q()));
      zbde localzbde = new zbde(paramzq, localzbcw, paramzqy.u(), paramzqy.a().h(), bool);
      localzbde.b(localzr, paramzjf.at());
      paramzqy.u().clear();
    }
    else
    {
      switch (Math.abs(paramInt1))
      {
      case 0: 
        localzr.a(paramString, paramzg, new zu(paramColor), paramzq, localzv);
        break;
      case 90: 
        localzr.b(paramzq.j() + paramzq.h() / 2.0F, paramzq.k() + paramzq.i() / 2.0F);
        localzr.a(-paramInt1);
        paramzq = new zq(-paramzq.i() / 2.0F, -paramzq.h() / 2.0F, paramzq.i(), paramzq.h());
        localzr.a(paramString, paramzg, new zu(paramColor), paramzq, localzv);
        break;
      default: 
        double d = Math.sqrt(Math.pow(paramzq.h(), 2.0D) + Math.pow(paramzq.i(), 2.0D));
        localzv.b(4096);
        zt localzt = localzr.a(paramString, paramzg, (int)d, localzv);
        localzr.b(paramzq.j() + paramzq.h() / 2.0F, paramzq.k() + paramzq.i() / 2.0F);
        localzr.a(-paramInt1);
        zq localzq = new zq(-localzt.b() / 2.0F, -localzt.c() / 2.0F, localzt.b(), localzt.c());
        localzr.a(paramString, paramzg, new zu(paramColor), localzq, localzv);
      }
    }
    localzr.a(localzf);
  }
  
  static void a(zr paramzr, zanr paramzanr, zp paramzp, zo paramzo, float paramFloat)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(paramzr, paramzanr, localzq, paramzo, paramFloat);
  }
  
  static void a(zr paramzr, zanr paramzanr, zq paramzq, zo paramzo, float paramFloat)
  {
    zo localzo1 = new zo(paramzq.j(), paramzq.k() + paramzq.i() / 2.0F);
    zo localzo2 = new zo(paramzq.j() + paramzq.h() / 2.0F, paramzq.k());
    zo localzo3 = new zo(paramzq.l(), paramzq.k() + paramzq.i() / 2.0F);
    zo localzo4 = new zo(paramzq.j() + paramzq.h() / 2.0F, paramzq.m());
    int i = a(paramzo, paramzq);
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo localzo5 = zo.a();
    com.aspose.cells.a.d.zs localzs = null;
    switch (i)
    {
    case 1: 
      localze.a(localzo3, paramzo);
      localzs = paramzanr.b(localze);
      paramzr.a(localzs, localze);
      break;
    case 2: 
    case 8: 
      localzo5 = new zo(localzo3.d() + paramFloat, localzo3.e());
      localze.a(localzo3, localzo5);
      localze.a(localzo5, paramzo);
      localzs = paramzanr.b(localze);
      paramzr.a(localzs, localze);
      break;
    case 3: 
      localze = new com.aspose.cells.b.a.b.a.ze();
      localze.a(localzo4, paramzo);
      localzs = paramzanr.b(localze);
      paramzr.a(localzs, localze);
      break;
    case 4: 
    case 6: 
      localze = new com.aspose.cells.b.a.b.a.ze();
      localzo5 = new zo(localzo1.d() - paramFloat, localzo1.e());
      localze.a(localzo1, localzo5);
      localze.a(localzo5, paramzo);
      localzs = paramzanr.b(localze);
      paramzr.a(localzs, localze);
      break;
    case 5: 
      localze = new com.aspose.cells.b.a.b.a.ze();
      localze.a(localzo1, paramzo);
      localzs = paramzanr.b(localze);
      paramzr.a(localzs, localze);
      break;
    case 7: 
      localze = new com.aspose.cells.b.a.b.a.ze();
      localze.a(localzo2, paramzo);
      localzs = paramzanr.b(localze);
      paramzr.a(localzs, localze);
    }
    if (localzs != null) {
      localzs.dispose();
    }
  }
  
  private static int a(zo paramzo, zq paramzq)
  {
    int i = 0;
    if (paramzq.l() < paramzo.d())
    {
      if (paramzq.m() < paramzo.e()) {
        i = 2;
      } else if (paramzq.k() > paramzo.e()) {
        i = 8;
      } else {
        i = 1;
      }
    }
    else if (paramzq.j() > paramzo.d())
    {
      if (paramzq.m() < paramzo.e()) {
        i = 4;
      } else if (paramzq.k() > paramzo.e()) {
        i = 6;
      } else {
        i = 5;
      }
    }
    else if (paramzq.m() < paramzo.e()) {
      i = 3;
    } else if (paramzq.k() > paramzo.e()) {
      i = 7;
    } else {
      i = 0;
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */