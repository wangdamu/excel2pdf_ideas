package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;

final class zbwz
{
  public static void a(zje paramzje, zbwx paramzbwx)
    throws Exception
  {
    if (((paramzbwx.e().b() instanceof zbs)) && (paramzje.B().D())) {
      return;
    }
    zjx localzjx = paramzbwx.e();
    if (paramzbwx.j())
    {
      zr localzr = paramzje.ar();
      paramzbwx.e().z();
      zp localzp1 = paramzbwx.e().a;
      zc localzc = zbd.a(paramzbwx.e().d(), zn.a(localzp1));
      try
      {
        localzr.a(localzc, localzp1);
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
      if (paramzbwx.e().f().e()) {
        localzr.a(zanv.a(paramzbwx.e().f()), localzp1);
      }
      zf localzf = null;
      int i = 0;
      if ((paramzje.i().d().g()) && (paramzbwx.e().d().g()) && (paramzje.ar().i() != 4))
      {
        localzf = paramzje.ar().d();
        i = 1;
        paramzje.ar().b(4, false);
      }
      zp localzp2 = new zp(localzjx.a.c(), localzjx.a.d(), localzjx.a.e(), localzjx.a.f());
      if (Math.abs(paramzbwx.f()) != 255) {
        if (Math.abs(paramzbwx.f()) == 90)
        {
          localzp2.a(localzp2.c() + paramzbwx.k());
          localzp2.c(localzp2.e() - 2 * paramzbwx.k());
        }
        else
        {
          localzp2.b(localzp2.d() + paramzbwx.k());
          localzp2.d(localzp2.f() - 2 * paramzbwx.k());
        }
      }
      a(paramzje.ar(), localzp2, paramzbwx.b(), paramzbwx.f(), localzjx.h(), localzjx.j(), paramzbwx.g(), paramzbwx.h(), paramzbwx.i());
      if ((paramzje.i().d().g()) && (localzjx.d().g()) && (i != 0)) {
        paramzje.ar().a(localzf);
      }
    }
  }
  
  public static void a(zje paramzje, zsp paramzsp)
    throws Exception
  {
    if ((paramzsp.d() != 0) && (paramzsp.l()))
    {
      zr localzr = paramzje.ar();
      zjx localzjx = paramzsp.b();
      localzjx.z();
      zp localzp = localzjx.a;
      zc localzc = zbd.a(localzjx.d(), zn.a(localzp));
      try
      {
        localzr.a(localzc, localzp);
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
      if (localzjx.f().e()) {
        localzr.a(zanv.a(localzjx.f()), localzp);
      }
      a(paramzje.ar(), localzjx.a, paramzsp.g(), paramzsp.h(), localzjx.h(), localzjx.j(), paramzsp.i(), paramzsp.j(), paramzsp.k());
    }
  }
  
  public static zs a(zje paramzje, zsp paramzsp, zt paramzt, zp paramzp)
  {
    zjx localzjx = paramzsp.b();
    zs localzs = new zs(0, 0);
    if ((paramzsp.d() != 0) && (paramzsp.l()))
    {
      localzs = zbvx.a(paramzje.ar(), paramzsp.g(), paramzsp.h(), localzjx.h(), paramzt, paramzsp.i(), paramzsp.j());
      localzjx.e(paramzp.e());
      localzjx.f(paramzp.f());
    }
    localzjx.b.a(localzs);
    return localzs;
  }
  
  public static zs a(zr paramzr, zbwx paramzbwx, zt paramzt)
  {
    zs localzs = zbvx.a(paramzr, paramzbwx.b(), paramzbwx.f(), paramzbwx.e().h(), paramzt, paramzbwx.g(), paramzbwx.h(), paramzbwx);
    return localzs;
  }
  
  public static void a(zr paramzr, zp paramzp, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3, int paramInt4)
  {
    zv localzv = new zv();
    localzv.a(zbvx.a(paramInt2));
    localzv.c(zbvx.a(paramInt3));
    zf localzf = null;
    switch (Math.abs(paramInt1))
    {
    case 0: 
      paramzr.a(paramString, paramzg, new zu(paramColor), paramzp, localzv);
      break;
    case 90: 
      localzf = paramzr.d();
      paramzr.b(paramzp.g() + paramzp.e() / 2, paramzp.h() + paramzp.f() / 2);
      paramzr.a(-paramInt1);
      paramzp = new zp(-paramzp.f() / 2, -paramzp.e() / 2, paramzp.f(), paramzp.e());
      paramzr.a(paramString, paramzg, new zu(paramColor), paramzp, localzv);
      paramzr.a(localzf);
      break;
    case 255: 
      zbvx.a(paramzr, paramString, paramzg, paramColor, paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f(), paramInt4);
      break;
    default: 
      localzf = paramzr.d();
      double d = Math.sqrt(Math.pow(paramzp.e(), 2.0D) + Math.pow(paramzp.f(), 2.0D));
      localzv.b(4096);
      zt localzt = paramzr.a(paramString, paramzg, (int)d, localzv);
      paramzr.b(paramzp.g() + paramzp.e() / 2, paramzp.h() + paramzp.f() / 2);
      paramzr.a(-paramInt1);
      zq localzq = new zq(-localzt.b() / 2.0F, -localzt.c() / 2.0F, localzt.b(), localzt.c());
      paramzr.a(paramString, paramzg, new zu(paramColor), localzq, localzv);
      paramzr.a(localzf);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */