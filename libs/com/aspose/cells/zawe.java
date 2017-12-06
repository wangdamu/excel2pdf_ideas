package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zv;
import java.util.ArrayList;

final class zawe
{
  static void a(zje paramzje, zp[] paramArrayOfzp)
    throws Exception
  {
    if ((paramArrayOfzp[0].e() <= 0) || (paramArrayOfzp[0].f() <= 0)) {
      return;
    }
    if ((paramzje.M() != 45) && (paramzje.M() != 48)) {
      return;
    }
    int i = paramzje.a();
    if (paramzje.b() < i) {
      i = paramzje.b();
    }
    int j = 6;
    j += zbxz.a((i - 70) * 14.0F / 230.0F);
    if (paramzje.B().s())
    {
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + j);
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + j);
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - 2 * j);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 2 * j);
    }
    a(paramArrayOfzp, paramzje, j);
  }
  
  static void a(zp[] paramArrayOfzp, zje paramzje, int paramInt)
  {
    double d1 = 0.1428571492433548D / Math.cos(0.17453292519943295D);
    double d2 = paramzje.p() * 3.141592653589793D / 180.0D;
    double d3 = paramArrayOfzp[0].e() * (Math.sin(d2) + d1 * paramzje.q() / 100.0D * Math.cos(d2));
    double d4 = paramArrayOfzp[0].f() / (Math.sin(d2) + d1 * paramzje.q() / 100.0D * Math.cos(d2));
    if (d3 <= paramArrayOfzp[0].f())
    {
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + paramInt);
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + paramInt);
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - 2 * paramInt);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 2 * paramInt);
      d3 = paramArrayOfzp[0].e() * (Math.sin(d2) + d1 * paramzje.q() / 100.0D * Math.cos(d2));
      paramArrayOfzp[0].b(zbxz.c(paramArrayOfzp[0].d() + paramArrayOfzp[0].f() / 2.0F - d3 / 2.0D));
      paramArrayOfzp[0].d(zbxz.c(d3));
    }
    else
    {
      paramArrayOfzp[0].a(zbxz.c(paramArrayOfzp[0].c() + paramArrayOfzp[0].e() / 2.0F - d4 / 2.0D));
      paramArrayOfzp[0].c(zbxz.c(d4));
    }
    double d5 = paramArrayOfzp[0].e() * d1 * paramzje.q() / 100.0D * Math.cos(d2);
    double d6 = d5 / paramArrayOfzp[0].f();
    paramzje.a((float)d6);
  }
  
  static void a(zr paramzr, zje paramzje)
    throws Exception
  {
    zbfc localzbfc = (zbfc)paramzje.z().j().get(0);
    zkg localzkg = localzbfc.D();
    Color[] arrayOfColor = new Color[localzkg.getCount()];
    for (int i = 0; i < localzkg.getCount(); i++)
    {
      zke localzke1 = localzkg.b(i);
      if (localzbfc.H()) {
        localzke1.i().c(paramzje.g(localzbfc.ax()).a(i));
      } else {
        localzke1.i().c(localzbfc.A().e());
      }
      arrayOfColor[i] = localzke1.i().e();
    }
    double[] arrayOfDouble = new double[localzkg.getCount()];
    for (int j = 0; j < localzkg.getCount(); j++)
    {
      zke localzke2 = localzkg.b(j);
      arrayOfDouble[j] = Math.abs(localzke2.w());
    }
    String[] arrayOfString = new String[localzkg.getCount()];
    double d1 = 0.0D;
    for (int k = 0; k < localzkg.getCount(); k++) {
      d1 += Math.abs(localzkg.a(k).w());
    }
    for (k = 0; k < localzkg.getCount(); k++)
    {
      localObject = localzkg.b(k);
      double d2 = ((zke)localObject).w();
      double d3 = Math.abs(d2) / d1;
      arrayOfString[k] = a(localzbfc, k, d3);
    }
    zp localzp = paramzje.B().b;
    if (paramzje.M() == 48)
    {
      localzp.b(localzp.d() + 5);
      localzp.d(localzp.f() - 10);
    }
    localzp = a(paramzr, localzbfc, localzp, arrayOfDouble, arrayOfColor, arrayOfString);
    paramzje.B().b = new zp(localzp.c(), localzp.d(), localzp.e(), localzp.f());
    zjz.a(paramzr, paramzje.B());
    Object localObject = new zawg(localzp.c(), localzp.d(), localzp.e(), localzp.f(), arrayOfDouble, arrayOfColor, paramzje.ah(), arrayOfString, localzkg);
    ((zawg)localObject).a(localzbfc);
    ((zawg)localObject).a(paramzr);
    ((zawg)localObject).a(paramzr, localzbfc);
  }
  
  private static String a(zbfc paramzbfc, int paramInt, double paramDouble)
  {
    zje localzje = paramzbfc.v();
    zke localzke = paramzbfc.D().b(paramInt);
    ArrayList localArrayList = localzje.z().c();
    zbs localzbs = localzje.e();
    zqx localzqx = localzke.o();
    boolean bool1 = localzqx.r();
    boolean bool2 = localzqx.q();
    String str1 = localzqx.f() ? "" : localzqx.p();
    String str2 = "".equals(localzqx.p()) ? "0%" : localzqx.p();
    String str3 = paramzbfc.i();
    String str4 = paramInt < localzbs.l.size() ? zqz.a(localzje.an(), localzbs.l.get(paramInt), str1, bool1, localzje.U()) : "";
    if (bool2)
    {
      str5 = (paramInt >= 0) && (paramInt < localArrayList.size()) ? ((zgm)localArrayList.get(paramInt)).c() : "";
      boolean bool3 = (paramInt >= 0) && (paramInt < localArrayList.size()) ? ((zgm)localArrayList.get(paramInt)).b() : false;
      str4 = (paramInt < 0) || (paramInt >= localzbs.l.size()) ? "" : zqz.a(localzje.an(), localzbs.l.get(paramInt), str5, bool3, localzje.U());
    }
    String str5 = zqz.a(localzje.an(), Double.valueOf(localzke.w()), str1, bool1, localzje.U());
    if (bool2) {
      str5 = zqz.a(localzje.an(), Double.valueOf(localzke.w()), localzke.A(), localzke.B(), localzje.U());
    }
    String str6 = zqz.a(localzje.an(), Double.valueOf(paramDouble), str2, bool1, localzje.U());
    String str7 = localzqx.l();
    zg localzg = localzqx.a().h();
    int i = localzqx.m();
    int j = localzqx.n();
    int k = localzqx.o();
    String str8 = "";
    if (localzqx.h()) {
      str8 = str8 + str3;
    }
    if (localzqx.d())
    {
      if (!"".equals(str8)) {
        str8 = str8 + str7;
      }
      str8 = str8 + str4;
    }
    if (localzqx.g())
    {
      if (!"".equals(str8)) {
        str8 = str8 + str7;
      }
      str8 = str8 + str5;
    }
    if (localzqx.f())
    {
      if (!"".equals(str8)) {
        str8 = str8 + str7;
      }
      str8 = str8 + str6;
    }
    return str8;
  }
  
  static zp a(zr paramzr, zbfc paramzbfc, zp paramzp, double[] paramArrayOfDouble, Color[] paramArrayOfColor, String[] paramArrayOfString)
    throws Exception
  {
    zje localzje = paramzbfc.v();
    zkg localzkg = paramzbfc.D();
    zawg localzawg = new zawg(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f(), paramArrayOfDouble, paramArrayOfColor, localzje.ah(), paramArrayOfString, localzkg);
    localzawg.a(paramzbfc);
    zp localzp = new zp();
    localzp = paramzp;
    a(paramzr, localzawg);
    if (paramzbfc.v().B().q())
    {
      zt localzt = a(paramzp, paramzbfc);
      if (localzt.b() > paramzp.e() * 0.3F) {
        localzt.a(paramzp.e() * 0.3F);
      }
      if (localzt.c() > paramzp.f() * 0.3F) {
        localzt.b(paramzp.f() * 0.3F);
      }
      localzp.a(paramzp.c() + (int)localzt.b());
      localzp.c(paramzp.e() - 2 * (int)localzt.b());
      localzp.b(paramzp.d() + (int)localzt.c());
      localzp.d(paramzp.f() - 2 * (int)localzt.c());
      zp[] arrayOfzp = { localzp };
      a(arrayOfzp, localzje, 0);
      localzp = arrayOfzp[0];
    }
    return localzp;
  }
  
  private static ArrayList a(zr paramzr, zawg paramzawg)
    throws Exception
  {
    zv localzv = new zv();
    localzv.a(1);
    localzv.c(1);
    zje localzje = paramzawg.b().b();
    double d1 = 0.0D;
    for (double d2 : paramzawg.a()) {
      d1 += d2;
    }
    ??? = new ArrayList();
    for (zawm localzawm : paramzawg.g()) {
      if ((localzawm != null) && (localzawm.e().length() >= 1))
      {
        zke localzke = localzawm.i();
        zbfc localzbfc = localzke.g().a();
        zqx localzqx = localzke.o();
        double d3;
        if (d1 == 0.0D) {
          d3 = 0.0D;
        } else {
          d3 = Math.abs(localzke.w()) / d1;
        }
        float f1;
        if (localzje.B().q())
        {
          if (localzqx.a().f().e()) {
            f1 = localzje.a() * 0.175F;
          } else {
            f1 = localzje.a() * 0.2F;
          }
        }
        else if (localzqx.a().f().e()) {
          f1 = localzje.a() * 0.175F;
        } else {
          f1 = localzje.a() * 0.2F;
        }
        float f2 = localzje.b();
        zt localzt = zawj.a(paramzr, localzje.z(), localzbfc.ai(), localzke.I(), d3, f1, f2, 0.0D);
        zq localzq = zq.c();
        float f3 = 0.0F;
        float[] arrayOfFloat;
        zo localzo;
        switch (localzqx.j())
        {
        case 1: 
          arrayOfFloat = new float[] { f3 };
          localzo = localzawm.a(0.25F, arrayOfFloat);
          f3 = arrayOfFloat[0];
          localzo.a(localzo.d() - localzt.b() / 2.0F);
          localzo.b(localzo.e() - localzt.c() / 2.0F);
          break;
        case 3: 
          arrayOfFloat = new float[] { f3 };
          localzo = localzawm.a(0.5F, arrayOfFloat);
          f3 = arrayOfFloat[0];
          double d4 = f3 * 3.141592653589793D / 180.0D;
          if ((f3 > 270.0F) || (f3 < 90.0F)) {
            localzo.a(localzo.d() - (float)(localzt.b() * Math.cos(d4)));
          }
          if ((f3 > 0.0F) && (f3 < 180.0F)) {
            localzo.b(localzo.e() - (float)(localzt.c() * Math.sin(d4)));
          }
          break;
        default: 
          arrayOfFloat = new float[] { f3 };
          localzo = localzawm.a(0.5F, arrayOfFloat);
          f3 = arrayOfFloat[0];
          if ((f3 > 67.5D) && (f3 < 112.5D)) {
            localzo.a((float)(localzo.d() - (f3 - 67.5D) * localzt.b() / 45.0D));
          } else if ((f3 >= 112.5D) && (f3 <= 247.5D)) {
            localzo.a(localzo.d() - localzt.b());
          } else if ((f3 > 247.5D) && (f3 < 292.5D)) {
            localzo.a((float)(localzo.d() - localzt.b() + (f3 - 247.5D) * localzt.b() / 45.0D));
          }
          if ((f3 >= 0.0F) && (f3 <= 180.0F)) {
            localzo.b(localzo.e() + localzawm.g());
          } else if ((f3 < 225.0F) && (f3 > 180.0F)) {
            localzo.b(localzo.e() - (f3 - 135.0F) * localzt.c() / 90.0F);
          } else if ((f3 >= 225.0F) && (f3 <= 315.0F)) {
            localzo.b(localzo.e() - localzt.c());
          } else if ((f3 > 315.0F) && (f3 <= 360.0F)) {
            localzo.b(localzo.e() - localzt.c() + (f3 - 315.0F) * localzt.c() / 90.0F);
          }
          break;
        }
        localzq = new zq(localzo, localzt);
        localzqx.b = new zq(localzq.f(), localzq.g(), localzq.h(), localzq.i());
        zf.a((ArrayList)???, localzq);
      }
    }
    return (ArrayList)???;
  }
  
  private static zt a(zq paramzq, zbfc paramzbfc)
  {
    zt localzt = new zt(0.0F, 0.0F);
    for (int i = 0; i < paramzbfc.D().getCount(); i++)
    {
      zke localzke = paramzbfc.D().b(i);
      zqx localzqx = localzke.o();
      if ((localzqx.j() == 0) || (localzqx.j() == 4) || (localzqx.j() == 9))
      {
        zt[] arrayOfzt = { localzt };
        a(paramzq, localzqx.b, arrayOfzt);
        localzt = arrayOfzt[0];
      }
    }
    return localzt;
  }
  
  private static zt a(zp paramzp, zbfc paramzbfc)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    return a(localzq, paramzbfc);
  }
  
  private static void a(zq paramzq1, zq paramzq2, zt[] paramArrayOfzt)
  {
    if ((paramzq2 == null) || (paramzq2.n())) {
      return;
    }
    float f;
    if (paramzq2.j() < paramzq1.j())
    {
      f = paramzq1.j() - paramzq2.j();
      if (f > paramArrayOfzt[0].b()) {
        paramArrayOfzt[0].a(f);
      }
    }
    if (paramzq2.l() > paramzq1.l())
    {
      f = paramzq2.l() - paramzq1.l();
      if (f > paramArrayOfzt[0].b()) {
        paramArrayOfzt[0].a(f);
      }
    }
    if (paramzq2.k() < paramzq1.k())
    {
      f = paramzq1.k() - paramzq2.k();
      if (f > paramArrayOfzt[0].c()) {
        paramArrayOfzt[0].b(f);
      }
    }
    if (paramzq2.m() > paramzq1.m())
    {
      f = paramzq2.m() - paramzq1.m();
      if (f > paramArrayOfzt[0].c()) {
        paramArrayOfzt[0].b(f);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */