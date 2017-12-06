package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zp;
import java.util.ArrayList;

final class zawf
{
  static void a(zjf paramzjf, zp[] paramArrayOfzp, zbfd paramzbfd)
    throws Exception
  {
    if ((paramArrayOfzp[0].e() <= 0) || (paramArrayOfzp[0].f() <= 0)) {
      return;
    }
    if ((paramzjf.N() != 45) && (paramzjf.N() != 48)) {
      return;
    }
    if (paramzjf.B().s())
    {
      int i = 4;
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + i);
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + i);
      paramArrayOfzp[0].c(paramArrayOfzp[0].e() - 2 * i);
      paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 2 * i);
      if ((paramzbfd.az()) && ((paramzbfd.w().j() == 4) || (paramzbfd.w().j() == 0)))
      {
        int j = zbxz.a(paramzjf.a() / 100.0F * 6.0F);
        int k = zbxz.a(paramzjf.b() / 100.0F * 6.0F);
        paramArrayOfzp[0].a(paramArrayOfzp[0].c() + j);
        paramArrayOfzp[0].b(paramArrayOfzp[0].d() + k);
        paramArrayOfzp[0].c(paramArrayOfzp[0].e() - 2 * j);
        paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 2 * k);
      }
    }
  }
  
  private static void a(zp[] paramArrayOfzp, zjf paramzjf)
  {
    int i = zbxz.a(paramArrayOfzp[0].e() / 400.0F * 3.0F);
    int j = zbxz.a(paramArrayOfzp[0].f() / 400.0F * 3.0F);
    paramArrayOfzp[0].a(paramArrayOfzp[0].c() + i);
    paramArrayOfzp[0].b(paramArrayOfzp[0].d() + j);
    paramArrayOfzp[0].c(paramArrayOfzp[0].e() - 2 * i);
    paramArrayOfzp[0].d(paramArrayOfzp[0].f() - 2 * j);
    double d1 = 0.1428571492433548D / Math.cos(0.17453292519943295D);
    double d2 = paramzjf.p() * 3.141592653589793D / 180.0D;
    double d3 = paramArrayOfzp[0].e() * (Math.sin(d2) + d1 * paramzjf.q() / 100.0D * Math.cos(d2));
    double d4 = paramArrayOfzp[0].f() / (Math.sin(d2) + d1 * paramzjf.q() / 100.0D * Math.cos(d2));
    if (d3 <= paramArrayOfzp[0].f())
    {
      paramArrayOfzp[0].b(zbxz.c(paramArrayOfzp[0].d() + paramArrayOfzp[0].f() / 2.0F - d3 / 2.0D));
      paramArrayOfzp[0].d(zbxz.c(d3));
    }
    else
    {
      paramArrayOfzp[0].a(zbxz.c(paramArrayOfzp[0].c() + paramArrayOfzp[0].e() / 2.0F - d4 / 2.0D));
      paramArrayOfzp[0].c(zbxz.c(d4));
    }
    double d5 = paramArrayOfzp[0].e() * d1 * paramzjf.q() / 100.0D * Math.cos(d2);
    double d6 = d5 / paramArrayOfzp[0].f();
    paramzjf.a((float)d6);
  }
  
  static void a(zr paramzr, zjf paramzjf)
    throws Exception
  {
    zbfd localzbfd = (zbfd)paramzjf.z().j().get(0);
    zkh localzkh = localzbfd.F();
    Color[] arrayOfColor1 = new Color[localzkh.getCount()];
    Color[] arrayOfColor2 = paramzjf.Z().a().a(paramzjf.R(), localzkh.getCount());
    for (int i = 0; i < localzkh.getCount(); i++)
    {
      zkf localzkf1 = localzkh.b(i);
      if (localzbfd.J()) {
        localzkf1.i().c(arrayOfColor2[i]);
      } else {
        localzkf1.i().c(localzbfd.A().g());
      }
      arrayOfColor1[i] = localzkf1.i().g();
    }
    double[] arrayOfDouble = new double[localzkh.getCount()];
    for (int j = 0; j < localzkh.getCount(); j++)
    {
      zkf localzkf2 = localzkh.b(j);
      arrayOfDouble[j] = Math.abs(localzkf2.w());
    }
    String[] arrayOfString = new String[localzkh.getCount()];
    double d1 = 0.0D;
    for (int k = 0; k < localzkh.getCount(); k++) {
      d1 += Math.abs(localzkh.a(k).w());
    }
    if (d1 == 0.0D) {
      return;
    }
    for (k = 0; k < localzkh.getCount(); k++)
    {
      localObject1 = localzkh.b(k);
      double d2 = Math.abs(((zkf)localObject1).w());
      double d3 = 0.0D;
      if (d1 != 0.0D) {
        d3 = d2 / d1;
      }
      arrayOfString[k] = a(localzbfd, k, d3);
    }
    zp localzp = paramzjf.B().b;
    Object localObject1 = { localzp };
    a((zp[])localObject1, paramzjf);
    localzp = localObject1[0];
    zf localzf = paramzr.d();
    paramzr.a(4, true);
    zawh localzawh = new zawh(localzp.c(), localzp.d(), localzp.e(), localzp.f(), arrayOfDouble, arrayOfColor1, paramzjf.ai(), arrayOfString, localzkh);
    try
    {
      localzawh.a(localzbfd);
      localzawh.a(paramzr);
      localzawh.a(paramzr, localzbfd);
    }
    finally
    {
      if (localzawh != null) {
        localzawh.a();
      }
    }
    paramzr.a(localzf);
  }
  
  private static String a(zbfd paramzbfd, int paramInt, double paramDouble)
  {
    zjf localzjf = paramzbfd.v();
    zkf localzkf = paramzbfd.F().b(paramInt);
    ArrayList localArrayList = localzjf.z().c();
    zbt localzbt = localzjf.e();
    zqy localzqy = localzkf.o();
    boolean bool1 = localzqy.y();
    boolean bool2 = localzqy.x();
    String str1 = localzqy.f() ? "" : localzqy.p();
    String str2 = "".equals(localzqy.p()) ? "0%" : localzqy.p();
    String str3 = paramzbfd.i();
    String str4 = paramInt < localzbt.l.size() ? zra.a(localzjf.an(), localzbt.l.get(paramInt), str1, bool1, localzjf.U()) : "";
    if (bool2)
    {
      str5 = (paramInt >= 0) && (paramInt < localArrayList.size()) ? ((zgn)localArrayList.get(paramInt)).c() : "";
      boolean bool3 = (paramInt >= 0) && (paramInt < localArrayList.size()) ? ((zgn)localArrayList.get(paramInt)).b() : false;
      str4 = (paramInt < 0) || (paramInt >= localzbt.l.size()) ? "" : zra.a(localzjf.an(), localzbt.l.get(paramInt), str5, bool3, localzjf.U());
    }
    String str5 = zra.a(localzjf.an(), Double.valueOf(localzkf.w()), str1, bool1, localzjf.U());
    if (bool2) {
      str5 = zra.a(localzjf.an(), Double.valueOf(localzkf.w()), localzkf.A(), localzkf.B(), localzjf.U());
    }
    String str6 = zra.a(localzjf.an(), Double.valueOf(paramDouble), str2, bool1, localzjf.U());
    String str7 = localzqy.m();
    zg localzg = localzqy.a().h();
    int i = localzqy.n();
    int j = localzqy.o();
    int k = localzqy.q();
    String str8 = "";
    if (localzqy.h()) {
      str8 = str8 + str3;
    }
    if (localzqy.d())
    {
      if (!"".equals(str8)) {
        str8 = str8 + str7;
      }
      str8 = str8 + str4;
    }
    if (localzqy.g())
    {
      if (!"".equals(str8)) {
        str8 = str8 + str7;
      }
      str8 = str8 + str5;
    }
    if (localzqy.f())
    {
      if (!"".equals(str8)) {
        str8 = str8 + str7;
      }
      str8 = str8 + str6;
    }
    return str8;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */