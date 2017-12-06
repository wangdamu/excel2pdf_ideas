package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.zg;

class zbwy
  implements zajs
{
  private zjy b;
  private int c;
  private String d;
  private int e;
  private int f;
  private zbda g;
  boolean a = true;
  private boolean h = false;
  private boolean i = false;
  private int j = 0;
  private boolean k = false;
  private zs l = zs.a();
  private boolean m = false;
  
  zbwy(zjf paramzjf, Object paramObject, int paramInt1, int paramInt2)
  {
    this.b = new zjy(paramzjf, paramObject, paramInt1, paramInt2);
    this.c = 0;
    this.d = "";
    this.b.c().a(0);
    this.e = 1;
    this.f = 1;
    this.b.g().a(0);
    this.g = new zbda();
  }
  
  zjy e()
  {
    return this.b;
  }
  
  public zahm a()
  {
    return this.b;
  }
  
  public int f()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
    this.a = false;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public int g()
  {
    return this.e;
  }
  
  public void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  public int h()
  {
    return this.f;
  }
  
  public void c(int paramInt)
  {
    this.f = paramInt;
  }
  
  public boolean i()
  {
    return this.h;
  }
  
  public void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public boolean j()
  {
    return this.i;
  }
  
  public void c(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  int k()
  {
    if (i()) {
      return 1;
    }
    if (j()) {
      return 2;
    }
    return 0;
  }
  
  public int l()
  {
    return this.j;
  }
  
  public void d(int paramInt)
  {
    this.j = paramInt;
  }
  
  public zaiz d()
  {
    return this.g;
  }
  
  public boolean m()
  {
    return zbxz.b(b());
  }
  
  public boolean c()
  {
    return this.k;
  }
  
  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  boolean n()
  {
    return this.g.getCount() > 0;
  }
  
  boolean o()
  {
    if (this.d == null) {
      return false;
    }
    return this.d.length() > 0;
  }
  
  void p()
    throws Exception
  {
    if (o())
    {
      if (((this.b.b() instanceof zbt)) && (this.b.a().B().E())) {
        return;
      }
      zr localzr = this.b.a().ap();
      zf localzf = localzr.d();
      if ((this.b.a().i().c().k()) && (this.b.c().k()) && (localzr.i() != 4)) {
        localzr.b(4, false);
      }
      this.b.z();
      zq localzq = new zq(this.b.a.c(), this.b.a.d(), this.b.a.e(), this.b.a.f());
      if ((f() != 0) && (!i()) && (!j()))
      {
        int n = this.b.a.c() + this.b.a.e() / 2;
        int i1 = this.b.a.d() + this.b.a.f() / 2;
        localzq = new zq(-this.l.b() / 2, -this.l.c() / 2, this.l.b(), this.l.c());
        localzr.b(n, i1);
        localzr.a(-f());
      }
      this.b.c().a(localzq);
      this.b.d().a(localzq);
      Object localObject;
      if (!n())
      {
        localObject = b();
        if ((e().k().f()) || (e().k().g())) {
          localObject = ((String)localObject).toUpperCase();
        }
        if ((i()) || (j())) {
          zbvy.a(localzr, localzq, (String)localObject, 255, this.b.h(), this.b.j(), g(), h(), k(), l());
        } else {
          zbvy.a(localzr, localzq, (String)localObject, 0, this.b.h(), this.b.j(), g(), h(), k(), l());
        }
      }
      else
      {
        localObject = new zbcw();
        ((zbcw)localObject).a(zbvy.a(g()));
        ((zbcw)localObject).b(zbvy.a(h()));
        zbde localzbde = new zbde(localzq, (zbcw)localObject, d(), e().h(), m());
        localzbde.b(localzr, this.b.a().at());
      }
      localzr.a(localzf);
    }
  }
  
  zs a(zt paramzt)
    throws Exception
  {
    zs localzs = zs.a();
    if (!n())
    {
      localObject = b();
      if ((e().k().f()) || (e().k().g())) {
        localObject = ((String)localObject).toUpperCase();
      }
      if ((i()) || (j()))
      {
        localzs = zbvy.a(this.b.a().ap(), (String)localObject, 255, this.b.h(), paramzt, g(), h(), k());
        return localzs;
      }
      if (Math.abs(f()) == 90) {
        paramzt = new zt(paramzt.c(), paramzt.b());
      }
      localzs = zbvy.a(this.b.a().ap(), (String)localObject, 0, this.b.h(), paramzt, g(), h(), k());
      localzs.b(localzs.c() + 2);
      this.l = localzs;
      double d1 = this.c * 3.141592653589793D / 180.0D;
      int n = (int)(localzs.b() * Math.abs(Math.cos(d1)) + localzs.c() * Math.abs(Math.sin(d1)) + 0.5D);
      int i1 = (int)(localzs.b() * Math.abs(Math.sin(d1)) + localzs.c() * Math.abs(Math.cos(d1)) + 0.5D);
      return new zs(n, i1);
    }
    Object localObject = new zbcw();
    ((zbcw)localObject).a(1);
    ((zbcw)localObject).b(1);
    zq localzq1 = new zq(0.0F, 0.0F, paramzt.b(), paramzt.c());
    zbde localzbde = new zbde(localzq1, (zbcw)localObject, d(), e().h(), m());
    zq localzq2 = localzbde.a(e().a().ap(), e().a().at());
    localzs = new zs((int)(localzq2.h() + 0.5D), (int)(localzq2.i() + 0.5D));
    this.l = localzs;
    double d2 = this.c * 3.141592653589793D / 180.0D;
    int i2 = (int)(localzs.b() * Math.abs(Math.cos(d2)) + localzs.c() * Math.abs(Math.sin(d2)) + 0.5D);
    int i3 = (int)(localzs.b() * Math.abs(Math.sin(d2)) + localzs.c() * Math.abs(Math.cos(d2)) + 0.5D);
    return new zs(i2, i3);
  }
  
  protected void finalize()
    throws Exception
  {
    d(false);
  }
  
  public void dispose()
  {
    d(true);
    zg.a(this);
  }
  
  protected void d(boolean paramBoolean)
  {
    if (!this.m)
    {
      if ((paramBoolean) && (this.b != null)) {
        this.b.dispose();
      }
      this.m = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */