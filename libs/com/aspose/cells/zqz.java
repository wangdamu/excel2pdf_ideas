package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

final class zqz
{
  static int a = 3;
  
  static zt a(zr paramzr, zbs paramzbs, zbfe paramzbfe, int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    zbfc localzbfc = paramzbfe.c(paramInt1);
    zje localzje = localzbfc.v();
    zke localzke = localzbfc.D().b(paramInt2);
    zqx localzqx = localzke.o();
    if (!localzqx.t()) {
      return new zt(0.0F, 0.0F);
    }
    boolean bool1 = false;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    if (paramzbs.d() == 0)
    {
      bool1 = localzje.z().a;
      localArrayList1 = localzje.z().c();
      localArrayList2 = localArrayList1;
    }
    else
    {
      bool1 = localzje.z().b;
      localArrayList1 = localzje.z().d();
      localArrayList2 = localArrayList1;
      if ((!localzje.g().q()) && (bool1)) {
        localArrayList2 = localzje.z().f();
      }
    }
    Object localObject1 = localzqx.p();
    boolean bool2 = localzqx.r();
    boolean bool3 = localzqx.q();
    String str1 = localzbfc.i();
    String str2 = "";
    if (a(localzbfc.ag()))
    {
      localObject2 = localzke.s();
      str2 = a(localzje.an(), localObject2, (String)localObject1, bool2, localzje.U());
      if (bool3) {
        str2 = a(localzje.an(), localObject2, localzke.u(), localzke.v(), localzje.U());
      }
    }
    else if (bool1)
    {
      localObject2 = paramInt2 < localArrayList2.size() ? ((zgm)localArrayList2.get(paramInt2)).c() : "";
      boolean bool4 = paramInt2 < localArrayList2.size() ? ((zgm)localArrayList2.get(paramInt2)).b() : false;
      if (bool3)
      {
        localObject1 = localObject2;
        bool2 = bool4;
      }
      if ((paramInt2 < localArrayList2.size()) && (paramInt2 < localArrayList1.size()))
      {
        Object localObject3 = ((zgm)localArrayList1.get(paramInt2)).a();
        int i = ziy.a(localObject3, localzje.U());
        localObject4 = ((zgm)localArrayList2.get(paramInt2)).a();
        if (i == -1) {
          str2 = "";
        } else {
          str2 = a(localzje.an(), localObject4, (String)localObject1, bool2, localzje.U());
        }
      }
      else
      {
        str2 = "";
      }
    }
    else
    {
      str2 = paramInt2 >= paramzbs.l.size() ? "" : a(paramzbs.c().an(), paramzbs.l.get(paramInt2), (String)localObject1, bool2, localzje.U());
    }
    Object localObject2 = zbu.a(paramzbs);
    double d = localzke.w();
    d = ((zbs)localObject2).n() ? zbxz.f(d) : d;
    d = ((zbs)localObject2).n() ? d : d * Math.pow(10.0D, ((zbs)localObject2).Q().f());
    String str3 = a(((zbs)localObject2).c().an(), Double.valueOf(d), (String)localObject1, bool2, localzje.U());
    if (bool3) {
      str3 = a(((zbs)localObject2).c().an(), Double.valueOf(d), localzke.A(), localzke.B(), localzje.U());
    }
    Object localObject4 = a(localzje.an(), Double.valueOf(localzke.C()), (String)localObject1, bool2, localzje.U());
    if (bool3) {
      localObject4 = a(localzke.h().an(), Double.valueOf(localzke.C()), localzke.D(), localzke.E(), localzje.U());
    }
    if (localzke.J()) {
      str3 = com.aspose.cells.b.a.zs.a(localzke.y());
    }
    String str4 = localzqx.l();
    zg localzg = localzqx.a().h();
    int j = localzqx.m();
    int k = localzqx.n();
    int m = localzqx.o();
    zt localzt1 = new zt(0.0F, 0.0F);
    if (localzqx.e()) {
      localzt1 = new zt(localzqx.y(), localzqx.z());
    }
    String str5 = "";
    if (localzqx.s() == null)
    {
      if (localzqx.h()) {
        str5 = str5 + str1;
      }
      if (localzqx.d())
      {
        if (!"".equals(str5)) {
          str5 = str5 + str4;
        }
        str5 = str5 + str2;
      }
      if (localzqx.g())
      {
        if (!"".equals(str5)) {
          str5 = str5 + str4;
        }
        str5 = str5 + str3;
      }
      if (localzqx.i())
      {
        if (!"".equals(str5)) {
          str5 = str5 + str4;
        }
        str5 = str5 + (String)localObject4;
      }
    }
    else
    {
      str5 = localzqx.s();
    }
    zt localzt2 = new zt(paramInt3, localzje.b() * 0.5F);
    com.aspose.cells.b.a.b.zs localzs = zbvx.a(paramzr, str5, j, localzg, localzt2, k, m);
    if ("".equals(str5)) {
      return new zt(0.0F, 0.0F);
    }
    if (localzqx.e()) {
      return new zt(localzs.b() + localzt1.b(), localzs.c());
    }
    return new zt(localzs.b(), localzs.c());
  }
  
  static void a(zr paramzr, zbs paramzbs, zbfe paramzbfe, int paramInt1, int paramInt2, zp paramzp)
    throws Exception
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(paramzr, paramzbs, paramzbfe, paramInt1, paramInt2, localzq);
  }
  
  static void a(zr paramzr, zbs paramzbs, zbfe paramzbfe, int paramInt1, int paramInt2, zq paramzq)
    throws Exception
  {
    zbfc localzbfc = paramzbfe.c(paramInt1);
    zje localzje = localzbfc.v();
    zke localzke = localzbfc.D().b(paramInt2);
    zqx localzqx = localzke.o();
    zq[] arrayOfzq = { paramzq };
    a(arrayOfzq, localzje);
    paramzq = arrayOfzq[0];
    if (!localzqx.t()) {
      return;
    }
    boolean bool1 = false;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    if (paramzbs.d() == 0)
    {
      bool1 = localzje.z().a;
      localArrayList1 = localzje.z().c();
      localArrayList2 = localArrayList1;
    }
    else
    {
      bool1 = localzje.z().b;
      localArrayList1 = localzje.z().d();
      localArrayList2 = localArrayList1;
      if ((!localzje.g().q()) && (bool1)) {
        localArrayList2 = localzje.z().f();
      }
    }
    Object localObject1 = localzqx.p();
    boolean bool2 = localzqx.r();
    boolean bool3 = localzqx.q();
    String str1 = localzbfc.i();
    String str2 = "";
    boolean bool4 = false;
    if (a(localzbfc.ag()))
    {
      localObject2 = localzke.s();
      str2 = a(localzje.an(), localObject2, (String)localObject1, bool2, localzje.U());
      if (bool3)
      {
        str2 = a(localzje.an(), localObject2, localzke.u(), localzke.v(), localzje.U());
        bool4 = a(localObject2, localzke.u());
      }
    }
    else if (bool1)
    {
      localObject2 = paramInt2 < localArrayList2.size() ? ((zgm)localArrayList2.get(paramInt2)).c() : "";
      boolean bool5 = paramInt2 < localArrayList2.size() ? ((zgm)localArrayList2.get(paramInt2)).b() : false;
      if (bool3)
      {
        localObject1 = localObject2;
        bool2 = bool5;
      }
      if ((paramInt2 < localArrayList2.size()) && (paramInt2 < localArrayList1.size()))
      {
        Object localObject3 = ((zgm)localArrayList1.get(paramInt2)).a();
        int i = ziy.a(localObject3, localzje.U());
        Object localObject4 = ((zgm)localArrayList2.get(paramInt2)).a();
        if (i == -1) {
          str2 = "";
        } else {
          str2 = a(localzje.an(), localObject4, (String)localObject1, bool2, localzje.U());
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
      str2 = paramInt2 >= paramzbs.l.size() ? "" : a(paramzbs.c().an(), paramzbs.l.get(paramInt2), (String)localObject1, bool2, localzje.U());
      if ((paramInt2 < paramzbs.l.size()) && (bool3)) {
        bool4 = a(paramzbs.l.get(paramInt2), (String)localObject1);
      }
    }
    Object localObject2 = zbu.a(paramzbs);
    double d = localzke.w();
    d = ((zbs)localObject2).n() ? zbxz.f(d) : d;
    d = ((zbs)localObject2).n() ? d : d * Math.pow(10.0D, ((zbs)localObject2).Q().f());
    String str3 = a(localzje.an(), Double.valueOf(d), (String)localObject1, bool2, localzje.U());
    boolean bool6 = false;
    if (bool3)
    {
      str3 = a(localzje.an(), Double.valueOf(d), localzke.A(), localzke.B(), localzje.U());
      bool6 = a(Double.valueOf(d), localzke.A());
    }
    if (localzke.J()) {
      str3 = com.aspose.cells.b.a.zs.a(localzke.y());
    }
    String str4 = a(localzje.an(), Double.valueOf(localzke.C()), (String)localObject1, bool2, localzje.U());
    if (bool3) {
      str4 = a(localzje.an(), Double.valueOf(localzke.C()), localzke.D(), localzke.E(), localzje.U());
    }
    String str5 = localzqx.l();
    zg localzg = localzqx.a().h();
    Color localColor = localzqx.a().j();
    int j = localzqx.m();
    int k = localzqx.n();
    int m = localzqx.o();
    zt localzt = new zt(localzqx.y(), localzqx.z());
    int n = (int)paramzq.f();
    int i1 = (int)paramzq.g();
    int i2 = (int)paramzq.h();
    int i3 = (int)paramzq.i();
    int i4 = localzqx.e() ? n - a : n;
    int i5 = i1 - a;
    int i6 = localzqx.e() ? i2 + 2 * a : i2;
    int i7 = i3 + 2 * a;
    localzqx.a().a = new zp(i4, i5, i6, i7);
    zbd.a(paramzr, zn.a(localzqx.a().a), localzqx.a().d());
    zanv.a(paramzr, zn.a(localzqx.a().a), localzqx.a().f());
    if (localzqx.e())
    {
      localObject5 = new zq(paramzq.f(), paramzq.g(), localzt.b(), localzt.c());
      zana.a(paramzr, (zq)localObject5, localzbfc);
      n += (int)localzt.b();
      i2 -= (int)localzt.b();
    }
    Object localObject5 = "";
    if (localzqx.s() == null)
    {
      if (localzqx.h()) {
        localObject5 = (String)localObject5 + str1;
      }
      if (localzqx.d())
      {
        if (!"".equals(localObject5)) {
          localObject5 = (String)localObject5 + str5;
        }
        localObject5 = (String)localObject5 + str2;
      }
      if (localzqx.g())
      {
        if (!"".equals(localObject5)) {
          localObject5 = (String)localObject5 + str5;
        }
        localObject5 = (String)localObject5 + str3;
      }
      if (localzqx.i())
      {
        if (!"".equals(localObject5)) {
          localObject5 = (String)localObject5 + str5;
        }
        localObject5 = (String)localObject5 + str4;
      }
    }
    else
    {
      localObject5 = localzqx.s();
    }
    zp localzp = new zp(n, i1, i2, i3);
    if ((bool4) || (bool6)) {
      localColor = Color.getRed();
    }
    a(paramzr, localzqx, localzp, (String)localObject5, j, localzg, localColor, k, m);
  }
  
  public static void a(zq[] paramArrayOfzq, zje paramzje)
    throws Exception
  {
    if (paramArrayOfzq[0].f() < ziy.c) {
      paramArrayOfzq[0].a(ziy.c);
    }
    if (paramArrayOfzq[0].g() < ziy.c) {
      paramArrayOfzq[0].b(ziy.c);
    }
    if (paramArrayOfzq[0].l() > paramzje.a() - ziy.c) {
      paramArrayOfzq[0].a(paramzje.a() - ziy.c - paramArrayOfzq[0].h());
    }
    if (paramArrayOfzq[0].m() > paramzje.b() - ziy.c) {
      paramArrayOfzq[0].b(paramzje.b() - ziy.c - paramArrayOfzq[0].i());
    }
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
        if (ze.f(paramObject) == 60)
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
        return ze.g(paramObject) < 0.0D ? Color.getRed() : paramColor;
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
  
  public static void a(zr paramzr, zqx paramzqx, zp paramzp, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3)
  {
    zf localzf = paramzr.d();
    if ((paramzqx.a().a().i().d().g()) && (paramzqx.a().d().g()) && (paramzr.i() != 4)) {
      paramzr.b(4, false);
    }
    zv localzv = new zv();
    localzv.a(zbvx.a(paramInt2));
    localzv.c(zbvx.a(paramInt3));
    switch (Math.abs(paramInt1))
    {
    case 0: 
      paramzr.a(paramString, paramzg, new zu(paramColor), paramzp, localzv);
      break;
    case 90: 
      paramzr.b(paramzp.g() + paramzp.e() / 2, paramzp.h() + paramzp.f() / 2);
      paramzr.a(-paramInt1);
      paramzp = new zp(-paramzp.f() / 2, -paramzp.e() / 2, paramzp.f(), paramzp.e());
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
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */