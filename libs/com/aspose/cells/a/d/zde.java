package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import java.util.ArrayList;
import java.util.Stack;

public class zde
  extends zdb
{
  private zhb e;
  private zp f;
  private zq g;
  private boolean h = false;
  public Stack b = new Stack();
  public zb c = new zb();
  private zb i = new zb();
  public com.aspose.cells.b.a.b.zq d = new com.aspose.cells.b.a.b.zq();
  
  public zde(zcs paramzcs, zhb paramzhb)
  {
    super(paramzcs);
    this.a = true;
    this.e = paramzhb;
  }
  
  public void a(zo paramzo, zt paramzt)
    throws Exception
  {
    b(paramzo, paramzt);
  }
  
  public void a(zo paramzo, String paramString)
    throws Exception
  {
    c(paramzo, paramString);
  }
  
  public void b(zo paramzo, String paramString)
    throws Exception
  {
    c(paramzo, paramString);
  }
  
  private void c(zo paramzo, String paramString)
    throws Exception
  {
    d(paramzo, paramString);
    if ((a().j() & 0x1) == 1) {
      b(paramzo);
    }
  }
  
  public void a(zo paramzo, Color paramColor)
    throws Exception
  {
    zp localzp = zp.a(paramzo, paramzo);
    localzp.a(new zx(paramColor));
    a(localzp, false, false);
  }
  
  public void a(zo paramzo)
    throws Exception
  {
    Object localObject;
    if (this.h)
    {
      o();
      localObject = new zo[2];
      localObject[0] = c();
      localObject[1] = paramzo;
      this.g.c((zo[])localObject);
    }
    else
    {
      localObject = zp.a(c(), paramzo);
      a((zp)localObject, true, false);
    }
  }
  
  public void a(com.aspose.cells.b.a.b.zq paramzq)
    throws Exception
  {
    zp localzp = zp.b(paramzq);
    a(localzp, true, true);
  }
  
  public void b(com.aspose.cells.b.a.b.zq paramzq)
    throws Exception
  {
    zp localzp = zp.b(paramzq);
    a(localzp, false, true);
  }
  
  public void a(com.aspose.cells.b.a.b.zq paramzq, zc paramzc)
    throws Exception
  {
    zp localzp = zp.b(paramzq);
    localzp.a(paramzc);
    if (localzp.e() == null) {
      return;
    }
    localzp.b(a(a().k()));
    localzp.a(a().p());
    this.c.a(localzp);
  }
  
  public void a(zo[] paramArrayOfzo)
    throws Exception
  {
    if (this.h)
    {
      o();
      this.g.c(paramArrayOfzo);
    }
    else
    {
      zp localzp = zcx.a(paramArrayOfzo, false);
      a(localzp, true, false);
    }
  }
  
  public void c(zo[] paramArrayOfzo)
    throws Exception
  {
    if (this.h)
    {
      if (paramArrayOfzo.length > 0) {
        b(paramArrayOfzo[0]);
      }
      o();
      this.g.b(paramArrayOfzo);
    }
    else
    {
      zp localzp = zcx.a(paramArrayOfzo);
      a(localzp, true, false);
      this.f = localzp;
    }
  }
  
  public void b(zo[][] paramArrayOfzo)
    throws Exception
  {
    if (this.h)
    {
      o();
      for (int j = 0; j < paramArrayOfzo.length; j++) {
        this.g.c(paramArrayOfzo[j]);
      }
    }
    else
    {
      zp localzp = zcx.a(paramArrayOfzo, false);
      a(localzp, true, false);
      this.f = localzp;
    }
  }
  
  public void b(zo[] paramArrayOfzo)
    throws Exception
  {
    if (this.h)
    {
      o();
      this.g.a(paramArrayOfzo[0]);
      this.g.c(paramArrayOfzo);
    }
    else
    {
      zp localzp = zcx.a(paramArrayOfzo, true);
      a(localzp, true, true);
      this.f = localzp;
    }
  }
  
  public void a(zo[][] paramArrayOfzo)
    throws Exception
  {
    zp localzp = zcx.a(paramArrayOfzo, true);
    a(localzp, false, true);
    this.f = localzp;
  }
  
  public void a(com.aspose.cells.b.a.b.zq paramzq, zo paramzo1, zo paramzo2)
    throws Exception
  {
    zp localzp = zcx.a(paramzq, paramzo1, paramzo2);
    a(localzp, true, false);
    this.f = localzp;
  }
  
  public void c(com.aspose.cells.b.a.b.zq paramzq)
    throws Exception
  {
    zp localzp = zcx.a(paramzq);
    a(localzp, true, true);
    this.f = localzp;
  }
  
  public void b(com.aspose.cells.b.a.b.zq paramzq, zo paramzo1, zo paramzo2)
    throws Exception
  {
    zp localzp = zcx.b(paramzq, paramzo1, paramzo2);
    a(localzp, true, true);
    this.f = localzp;
  }
  
  public void c(com.aspose.cells.b.a.b.zq paramzq, zo paramzo1, zo paramzo2)
    throws Exception
  {
    zp localzp = zcx.c(paramzq, paramzo1, paramzo2);
    a(localzp, true, true);
  }
  
  public void a(com.aspose.cells.b.a.b.zq paramzq, zt paramzt)
    throws Exception
  {
    zp localzp = zcx.a(paramzq, paramzt);
    a(localzp, true, true);
  }
  
  public void a(com.aspose.cells.b.a.b.zq paramzq1, com.aspose.cells.b.a.b.zq paramzq2, byte[] paramArrayOfByte)
  {
    zb localzb = new zb();
    zo localzo = new zo(paramzq2.j(), paramzq2.k());
    zt localzt = new zt(paramzq2.h(), paramzq2.i());
    zl localzl = new zl(localzo, localzt, paramArrayOfByte);
    localzb.a(localzl);
    localzb.a(a().p());
    this.c.a(localzb);
  }
  
  public void a(com.aspose.cells.b.a.b.zq paramzq1, com.aspose.cells.b.a.b.zq paramzq2, zi paramzi, Color paramColor, long paramLong, byte[] paramArrayOfByte)
  {
    zb localzb = new zb();
    zo localzo = new zo(paramzq2.j(), paramzq2.k());
    zt localzt = new zt(paramzq2.h(), paramzq2.i());
    zl localzl = new zl(localzo, localzt, paramArrayOfByte);
    localzl.a(paramLong);
    localzb.a(localzl);
    localzb.a(a().p());
    localzb.a().b(paramzi);
    this.c.a(localzb);
  }
  
  public void d(com.aspose.cells.b.a.b.zq paramzq)
  {
    zp localzp = new zp(paramzq);
    zb localzb = new zb();
    localzb.a(localzp);
    this.c.a(localzb);
    this.c = localzb;
  }
  
  private void a(zp paramzp, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    if (paramBoolean1) {
      paramzp.a(zx.a(a().c()));
    }
    if (paramBoolean2) {
      paramzp.a(a().d());
    }
    if ((paramzp.d() == null) && (paramzp.e() == null)) {
      return;
    }
    switch (a().m())
    {
    case 11: 
      return;
    case 9: 
      break;
    }
    paramzp.b(a(a().k()));
    paramzp.a(a().p());
    this.c.a(paramzp);
  }
  
  public static int a(int paramInt)
    throws Exception
  {
    switch (paramInt)
    {
    case 1: 
      return 0;
    case 2: 
      return 1;
    }
    throw new Exception("Unknown GDI fill mode[" + paramInt + "].");
  }
  
  private void b(zo paramzo, zt paramzt)
    throws Exception
  {
    zt localzt = b().i();
    float f1 = paramzt.b() / localzt.b();
    float f2 = paramzt.c() / localzt.c();
    if ((localzt.b() * localzt.c() <= 0.0F) || (paramzt.b() * paramzt.c() <= 0.0F))
    {
      f1 = 1.0E-4F;
      f2 = 1.0E-4F;
    }
    this.i.a(new zi(f1, 0.0F, 0.0F, f2, paramzo.d(), paramzo.e()));
    this.i.a().b(-b().j().d(), -b().j().e());
    this.i.a(this.c);
  }
  
  private void d(zo paramzo, String paramString)
    throws Exception
  {
    zbj localzbj = a().e();
    paramString = this.e.a(paramString);
    if (!zav.a().a(localzbj.a(), localzbj.c(), paramString))
    {
      localObject = this.e.a(localzbj.a(), localzbj.c(), paramString);
      if (localObject != null) {
        localzbj = zbj.a((String)localObject, localzbj.b(), localzbj.c());
      }
    }
    Object localObject = new zh(localzbj, a().i(), paramzo, a().l(), paramString);
    if (localzbj.g()) {
      ((zh)localObject).c = 1;
    }
    zb localzb = new zb();
    localzb.a(a().p());
    zo[] arrayOfzo = { paramzo };
    localzb.a().b(a().a(arrayOfzo, ((zh)localObject).i(), ((zh)localObject).d()));
    paramzo = arrayOfzo[0];
    localzb.a().a(a().q(), a().r());
    localzbj = zbj.a(localzbj.a(), localzbj.b() / Math.abs(a().r()), localzbj.c());
    ((zh)localObject).a(new zo(paramzo.d() / a().q(), paramzo.e() / a().r()));
    if (a().s() != null)
    {
      float f1 = paramzo.d();
      zcd[] arrayOfzcd = zce.a().a(paramString);
      int j = 0;
      for (int k = 0; k < arrayOfzcd.length; k++)
      {
        zo localzo = new zo(f1 / a().q(), paramzo.e() / a().r());
        String str = zce.a().b(arrayOfzcd[k].a);
        zh localzh = new zh(localzbj, a().i(), localzo, a().l(), str);
        if (localzbj.g()) {
          localzh.c = 1;
        }
        localzb.a(localzh);
        for (int m = 0; m < str.length(); m++) {
          f1 += (float)(a().s()[(j++)] & 0xFFFFFFFF);
        }
      }
    }
    else
    {
      ((zh)localObject).a(localzbj);
      localzb.a((zn)localObject);
    }
    a((zh)localObject, localzb);
    this.c.a(localzb);
  }
  
  private void a(zh paramzh, zb paramzb)
    throws Exception
  {
    com.aspose.cells.b.a.b.zq localzq = new com.aspose.cells.b.a.b.zq(paramzh.g(), paramzh.i());
    zp localzp = zp.b(localzq);
    localzp.a(new zu(a().g()));
    if ((a().h() == 1) && ((a().g().getR() & 0xFF) == 255) && ((a().g().getG() & 0xFF) == 255) && ((a().g().getB() & 0xFF) == 255)) {
      return;
    }
    localzp.a(paramzb.a().b());
    localzp.a().b(0.0F, -paramzh.d().h());
    this.c.a(localzp);
  }
  
  public zb e()
  {
    return this.i;
  }
  
  private void o()
  {
    if (this.g == null) {
      this.g = new zq();
    }
  }
  
  public void f()
    throws Exception
  {
    a(true);
  }
  
  public void g()
  {
    this.h = true;
    this.f = new zp();
    this.g = null;
  }
  
  public void h()
    throws Exception
  {
    a(false);
    i();
    this.h = false;
  }
  
  public void i()
  {
    if ((this.h) && (this.f.a() == null)) {
      this.f.a(a().p().b());
    }
  }
  
  private void a(boolean paramBoolean)
    throws Exception
  {
    if (this.g == null) {
      return;
    }
    this.g.a(paramBoolean);
    this.f.b(a(a().k()));
    this.f.a(this.g);
    this.g = null;
  }
  
  public void j()
    throws Exception
  {
    if ((this.f == null) || (a().d() == null)) {
      return;
    }
    a(true);
    this.f.a(a().d());
    p();
  }
  
  public void k()
    throws Exception
  {
    if ((this.f == null) || (a().c() == null)) {
      return;
    }
    a(false);
    this.f.a(zx.a(a().c()));
    p();
  }
  
  public void l()
    throws Exception
  {
    if ((this.f == null) || ((a().d() == null) && (a().c() == null))) {
      return;
    }
    a(false);
    this.f.a(a().d());
    this.f.a(null);
    p();
  }
  
  public void m()
  {
    zb localzb = new zb();
    this.c.a(localzb);
    this.b.push(this.c);
    this.c = localzb;
    this.f = null;
    this.g = null;
  }
  
  public void n()
  {
    this.c = ((zb)this.b.pop());
    this.f = null;
    this.g = null;
  }
  
  private void p()
    throws Exception
  {
    this.f.b(a(a().k()));
    this.c.a(this.f);
    this.f = null;
  }
  
  public void b(int paramInt)
    throws Exception
  {
    a(true);
    zb localzb = new zb();
    switch (paramInt)
    {
    case 1: 
      localzb.a(this.f);
      this.c.a(localzb);
      this.c.h().remove(this.f);
      this.c = localzb;
      this.f = null;
      break;
    case 5: 
      if (this.c.o() != null)
      {
        this.c.o().a(localzb);
        this.c = localzb;
        this.c.a(this.f);
      }
      this.f = null;
      break;
    default: 
      localzb.a(this.f);
      this.i.a(localzb);
      this.c = localzb;
      this.f = null;
    }
  }
  
  public void a(int paramInt, zp paramzp)
    throws Exception
  {
    a(true);
    zb localzb = new zb();
    if (paramInt == 5)
    {
      if (this.c.o() != null)
      {
        this.c.o().a(localzb);
        this.c = localzb;
        this.c.a(paramzp);
      }
      this.f = null;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */