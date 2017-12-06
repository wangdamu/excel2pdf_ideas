package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zh;

public abstract class zcv
{
  private zcs a;
  private zh b;
  private zcw c;
  private zde d;
  
  public zcv(zcs paramzcs, zde paramzde)
  {
    this.a = paramzcs;
    this.d = paramzde;
  }
  
  public void a(zo paramzo, zt paramzt)
    throws Exception
  {
    zq localzq = b().k();
    zt localzt = new zt(localzq.l(), localzq.m());
    this.a.a(localzt);
    a().a(localzt);
    this.b = new zh();
    this.c = new zcw(this.b);
    f().a(paramzo, paramzt);
    for (int i = 0; i < b().l(); i++)
    {
      zda localzda = b().a(i);
      if (localzda.c() > 0)
      {
        this.b.b(localzda.e(), 0, localzda.c());
        this.b.b(this.b.i() - localzda.e().length);
      }
      a(localzda);
      if (localzda.d() == 14) {
        break;
      }
      this.b.a(0L, 2);
    }
    this.b.a();
  }
  
  protected abstract void a(zda paramzda)
    throws Exception;
  
  protected zbf a()
  {
    return this.a.d();
  }
  
  protected zas b()
  {
    return this.a.c();
  }
  
  public zq c()
  {
    return this.a.e();
  }
  
  public zo d()
  {
    return this.a.f();
  }
  
  public void a(zo paramzo)
  {
    this.a.b(paramzo);
  }
  
  public zcw e()
  {
    return this.c;
  }
  
  public zde f()
  {
    return this.d;
  }
  
  public void g()
  {
    this.a.a();
  }
  
  public void h()
  {
    this.a.b();
  }
  
  public void a(zbw paramzbw)
    throws Exception
  {
    this.a.g().a(paramzbw);
  }
  
  public void a(long paramLong)
  {
    this.a.g().b(paramLong);
  }
  
  public void a(zt paramzt)
  {
    this.a.a(paramzt);
  }
  
  public void b(zo paramzo)
  {
    this.a.a(paramzo);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */