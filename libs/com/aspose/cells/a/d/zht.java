package com.aspose.cells.a.d;

public class zht
  extends zf
{
  private zdk f;
  private zhk g;
  private int h = Integer.MAX_VALUE;
  private int i = 0;
  
  public zht(zhb paramzhb, com.aspose.cells.b.a.d.zm paramzm)
    throws Exception
  {
    super(paramzhb);
    this.f = new zdk(paramzm);
    this.g = new zhk(this.f);
  }
  
  public zht(zhb paramzhb, com.aspose.cells.b.a.d.zm paramzm, int paramInt)
    throws Exception
  {
    this(paramzhb, paramzm);
    this.i = paramInt;
  }
  
  public void a(zn paramzn)
    throws Exception
  {
    paramzn.a(this);
  }
  
  public void a()
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.a();
    this.f.a();
  }
  
  public void a(zo paramzo)
    throws Exception
  {
    this.h = paramzo.b();
    if (this.h < this.i) {
      return;
    }
    this.g.a(paramzo.c(), paramzo.d());
    this.g.a(paramzo.a());
  }
  
  public void b(zo paramzo)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.b();
  }
  
  public void a(zb paramzb)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.c().a(paramzb);
  }
  
  public void b(zb paramzb)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.c().b();
  }
  
  public void a(zh paramzh)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.c().a(paramzh);
  }
  
  public void a(zp paramzp)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.c().a(paramzp);
  }
  
  public void b(zp paramzp)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    this.g.c().c();
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    zp localzp = zp.a(paramzm.a, paramzm.b);
    localzp.a(paramzm.c);
    localzp.a(this);
    localzp = null;
  }
  
  public void a(zl paramzl)
    throws Exception
  {
    if (this.h < this.i) {
      return;
    }
    if (paramzl != null) {
      if ((paramzl.e() == 1) || (paramzl.e() == 2))
      {
        zb localzb = zcy.a(paramzl, b());
        localzb.a(paramzl.g());
        localzb.a(this);
      }
      else
      {
        this.g.c().a(paramzl);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */