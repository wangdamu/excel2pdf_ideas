package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zchb
{
  private Object a;
  private zchd b;
  private zcbw c;
  private Worksheet d;
  private int e;
  private byte[] f;
  private int g;
  private QueryTable h;
  
  zchb(zchd paramzchd, Object paramObject)
  {
    this.a = paramObject;
    this.b = paramzchd;
  }
  
  void a(zqi paramzqi, zcbw paramzcbw)
    throws Exception
  {
    this.c = paramzcbw;
    this.d = paramzqi.d;
    for (;;)
    {
      this.e = this.c.a();
      switch (this.e)
      {
      case 448: 
        this.c.a(1L);
        return;
      case 447: 
        a();
        break;
      case 449: 
        b();
        break;
      case 457: 
        c();
        break;
      case 453: 
        d();
        break;
      case 450: 
      case 451: 
      case 452: 
      case 454: 
      case 455: 
      case 456: 
      default: 
        this.g = this.c.b();
        this.c.a(this.g);
      }
    }
  }
  
  private void a()
    throws Exception
  {
    this.f = this.b.a(this.c);
    this.h = new QueryTable(this.a);
    if ((this.a instanceof ListObject)) {
      ((ListObject)this.a).b = this.h;
    } else {
      this.d.getQueryTables().a(this.h);
    }
    int i = 0;
    this.h.c = zc.a(this.f, i);
    i += 4;
    this.h.d = zc.b(this.f, i);
    i += 2;
    this.h.e = zc.a(this.f, i);
    i += 4;
    this.h.f = zcgj.d(this.f, i);
  }
  
  private void b()
  {
    this.f = this.b.a(this.c);
    int i = 0;
    this.h.l = zc.b(this.f, i);
    i += 2;
    this.h.k = zc.a(this.f, i);
    i += 4;
    this.h.m = zc.b(this.f, i);
    i += 2;
    this.h.n = zc.b(this.f, i);
    i += 2;
  }
  
  private void c()
    throws Exception
  {
    this.f = this.b.a(this.c);
    int i = 0;
    zaye localzaye = new zaye();
    this.h.c().a(localzaye);
    localzaye.d = zc.a(this.f, i);
    i += 4;
    localzaye.a = zc.a(this.f, i);
    i += 4;
    localzaye.c = zc.a(this.f, i);
    i += 4;
    if ((localzaye.d & 0x10) != 0) {
      localzaye.b = zcgj.d(this.f, i);
    }
  }
  
  private void d()
    throws Exception
  {
    this.f = this.b.a(this.c);
    int i = 0;
    zaye localzaye = new zaye();
    this.h.d().a(localzaye);
    localzaye.b = zcgj.d(this.f, i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */