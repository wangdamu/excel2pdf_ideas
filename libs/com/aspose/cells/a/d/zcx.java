package com.aspose.cells.a.d;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;

public class zcx
{
  public static zp a(zo[] paramArrayOfzo, boolean paramBoolean)
  {
    zp localzp = new zp();
    zq localzq = zq.a(paramArrayOfzo, paramBoolean);
    localzp.a(localzq);
    return localzp;
  }
  
  public static zp a(zo[][] paramArrayOfzo, boolean paramBoolean)
  {
    zp localzp = new zp();
    for (int i = 0; i < paramArrayOfzo.length; i++)
    {
      zq localzq = zq.a(paramArrayOfzo[i], paramBoolean);
      localzp.a(localzq);
    }
    return localzp;
  }
  
  public static zp a(zo[] paramArrayOfzo)
  {
    zp localzp = new zp();
    zq localzq = zq.a(paramArrayOfzo);
    localzp.a(localzq);
    return localzp;
  }
  
  public static zp a(com.aspose.cells.b.a.b.zq paramzq, zo paramzo1, zo paramzo2)
  {
    zp localzp = new zp();
    zq localzq = new zq();
    localzp.a(localzq);
    za localza = d(paramzq, paramzo1, paramzo2);
    localzq.a(localza.a());
    localzq.a(localza);
    return localzp;
  }
  
  public static zp a(com.aspose.cells.b.a.b.zq paramzq)
  {
    zp localzp = new zp();
    zq localzq = new zq();
    localzp.a(localzq);
    za localza = d(paramzq, zo.a(), zo.a());
    localzq.a(localza.a());
    localzq.a(localza);
    return localzp;
  }
  
  public static zp b(com.aspose.cells.b.a.b.zq paramzq, zo paramzo1, zo paramzo2)
  {
    zp localzp = new zp();
    zq localzq = new zq();
    localzp.a(localzq);
    za localza = d(paramzq, paramzo1, paramzo2);
    localzq.a(localza.a());
    localzq.a(localza);
    zu localzu = new zu();
    zf.a(localzu.a(), localza.h());
    zf.a(localzu.a(), localzq.a());
    localzq.a(localzu);
    localzq.a(true);
    return localzp;
  }
  
  public static zp c(com.aspose.cells.b.a.b.zq paramzq, zo paramzo1, zo paramzo2)
  {
    zp localzp = new zp();
    zq localzq = new zq();
    localzp.a(localzq);
    za localza = d(paramzq, paramzo1, paramzo2);
    localzq.a(localza.a());
    localzq.a(localza);
    zu localzu = new zu();
    zf.a(localzu.a(), localzq.a());
    localzq.a(localzu);
    return localzp;
  }
  
  public static zp a(com.aspose.cells.b.a.b.zq paramzq, zt paramzt)
  {
    zp localzp = new zp();
    zq localzq = new zq();
    localzp.a(localzq);
    zt localzt = new zt(paramzt.b() / 2.0F, paramzt.c() / 2.0F);
    localzq.a(new zo(paramzq.j() + localzt.b(), paramzq.k()));
    zu localzu1 = new zu();
    zf.a(localzu1.a(), new zo(paramzq.l() - localzt.b(), paramzq.k()));
    localzq.a(localzu1);
    za localza1 = d(new com.aspose.cells.b.a.b.zq(paramzq.l() - paramzt.b(), paramzq.k(), paramzt.b(), paramzt.c()), new zo(paramzq.l() - localzt.b(), paramzq.k()), new zo(paramzq.l(), paramzq.k() + localzt.c()));
    localzq.a(localza1);
    zu localzu2 = new zu();
    zf.a(localzu2.a(), new zo(paramzq.l(), paramzq.m() - localzt.c()));
    localzq.a(localzu2);
    za localza2 = d(new com.aspose.cells.b.a.b.zq(paramzq.l() - paramzt.b(), paramzq.m() - paramzt.c(), paramzt.b(), paramzt.c()), new zo(paramzq.l(), paramzq.m() - localzt.c()), new zo(paramzq.l() - localzt.b(), paramzq.m()));
    localzq.a(localza2);
    zu localzu3 = new zu();
    zf.a(localzu3.a(), new zo(paramzq.j() + localzt.b(), paramzq.m()));
    localzq.a(localzu3);
    za localza3 = d(new com.aspose.cells.b.a.b.zq(paramzq.j(), paramzq.m() - paramzt.c(), paramzt.b(), paramzt.c()), new zo(paramzq.j() + localzt.b(), paramzq.m()), new zo(paramzq.j(), paramzq.m() - localzt.c()));
    localzq.a(localza3);
    zu localzu4 = new zu();
    zf.a(localzu4.a(), new zo(paramzq.j(), paramzq.k() + localzt.c()));
    localzq.a(localzu4);
    za localza4 = d(new com.aspose.cells.b.a.b.zq(paramzq.j(), paramzq.k(), paramzt.b(), paramzt.c()), new zo(paramzq.j(), paramzq.k() + localzt.c()), new zo(paramzq.j() + localzt.b(), paramzq.k()));
    localzq.a(localza4);
    return localzp;
  }
  
  private static za d(com.aspose.cells.b.a.b.zq paramzq, zo paramzo1, zo paramzo2)
  {
    zt localzt = new zt(paramzq.h() / 2.0F, paramzq.i() / 2.0F);
    zo localzo = new zo(paramzq.f() + localzt.b(), paramzq.g() + localzt.c());
    float f1 = (float)Math.atan2(localzo.e() - paramzo1.e(), paramzo1.d() - localzo.d());
    float f2 = (float)Math.atan2(localzo.e() - paramzo2.e(), paramzo2.d() - localzo.d());
    za localza = new za();
    localza.a(paramzq.d());
    localza.a(paramzq.e());
    localza.a((float)zcm.b(-f1));
    if (f2 < f1) {
      f2 += 6.2831855F;
    }
    float f3 = f2 - f1;
    if (f3 == 0.0F) {
      localza.b(360.0F);
    } else {
      localza.b((float)zcm.b(-f3));
    }
    return localza;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */