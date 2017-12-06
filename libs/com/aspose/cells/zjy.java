package com.aspose.cells;

import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zs;

class zjy
  implements zahm
{
  private zjf c;
  private zaz d;
  private zanr e;
  private com.aspose.cells.b.a.b.zg f;
  private zzo g;
  private boolean h;
  private Color i;
  private int j;
  private int k;
  private int l;
  private int m;
  zp a = zp.a();
  zp b = zp.a();
  private boolean n = true;
  private boolean o = true;
  private boolean p = true;
  private boolean q = true;
  private Object r = null;
  private int s;
  private int t;
  private int u;
  private int v;
  private boolean w = true;
  private boolean x = true;
  private boolean y = false;
  
  zjy(zjf paramzjf, Object paramObject, int paramInt1, int paramInt2)
  {
    this.c = paramzjf;
    this.l = 0;
    this.m = 0;
    this.j = 0;
    this.k = 0;
    this.d = new zaz(paramzjf, paramObject, paramInt1);
    this.e = new zanr(paramzjf, paramInt2);
    this.h = true;
    this.i = paramzjf.Z().a().a("dk1");
    this.a = zp.a();
    this.b = zp.a();
    this.r = paramObject;
    this.s = paramInt1;
    this.g = new zzo();
  }
  
  zjf a()
  {
    return this.c;
  }
  
  Object b()
  {
    return this.r;
  }
  
  zaz c()
  {
    return this.d;
  }
  
  public zagu e()
  {
    return this.d;
  }
  
  zanr d()
  {
    return this.e;
  }
  
  public zaip g()
  {
    return this.e;
  }
  
  public com.aspose.cells.b.a.b.zg h()
  {
    com.aspose.cells.b.a.b.zg localzg;
    if (this.f == null) {
      if (this.s == 0)
      {
        this.f = zbxz.a("Calibri", 10.0F, 0);
      }
      else
      {
        localzg = a().ad();
        switch (this.s)
        {
        case 8: 
          int i1 = localzg.k();
          i1 |= 0x1;
          this.f = zbxz.a(localzg.g(), localzg.h() * 1.2F, i1);
          break;
        case 9: 
          int i2 = localzg.k();
          i2 |= 0x1;
          this.f = zbxz.a(localzg.g(), localzg.h(), i2);
          break;
        default: 
          this.f = zbxz.a(localzg.g(), localzg.h(), localzg.k());
        }
        if (!this.c.aA()) {
          a(a().j().j());
        }
      }
    }
    if ((k().d()) || (k().c()))
    {
      localzg = new com.aspose.cells.b.a.b.zg(this.f.b(), 0.7F * this.f.h(), this.f.k());
      return localzg;
    }
    return this.f;
  }
  
  public void a(com.aspose.cells.b.a.b.zg paramzg)
  {
    this.f = paramzg;
  }
  
  com.aspose.cells.b.a.b.zg f()
  {
    if (this.f == null) {
      if (this.s == 0)
      {
        this.f = zbxz.a("Calibri", 10.0F, 0);
      }
      else
      {
        com.aspose.cells.b.a.b.zg localzg = a().ad();
        switch (this.s)
        {
        case 8: 
          int i1 = localzg.k();
          i1 |= 0x1;
          this.f = zbxz.a(localzg.g(), localzg.h() * 1.2F, i1);
          break;
        case 9: 
          int i2 = localzg.k();
          i2 |= 0x1;
          this.f = zbxz.a(localzg.g(), localzg.h(), i2);
          break;
        default: 
          this.f = zbxz.a(localzg.g(), localzg.h(), localzg.k());
        }
        if (!this.c.aA()) {
          a(a().j().j());
        }
      }
    }
    return this.f;
  }
  
  void b(com.aspose.cells.b.a.b.zg paramzg)
  {
    this.f = paramzg;
  }
  
  public Color j()
  {
    if (this.h)
    {
      if (this.c.aA())
      {
        Color localColor = zbxy.a(this.c, this);
        if (!localColor.isEmpty()) {
          return localColor;
        }
      }
      if (a().R() > 40) {
        return a().Z().a().a("lt1");
      }
      return a().Z().a().a("dk1");
    }
    return this.i;
  }
  
  public void a(Color paramColor)
  {
    this.h = false;
    this.i = paramColor;
  }
  
  public zaid k()
  {
    return this.g;
  }
  
  public int l()
  {
    switch (this.s)
    {
    case 1: 
    case 10: 
      if ((!s()) && (this.j + i() > 4000)) {
        return 4000 - i();
      }
      return this.j;
    }
    return this.j;
  }
  
  public void a(int paramInt)
  {
    this.j = paramInt;
    this.p = false;
  }
  
  public int m()
  {
    switch (this.s)
    {
    case 1: 
    case 10: 
      if ((!s()) && (this.k + n() > 4000)) {
        return 4000 - n();
      }
      return this.k;
    }
    return this.k;
  }
  
  public void b(int paramInt)
  {
    this.k = paramInt;
    this.p = false;
  }
  
  public int i()
  {
    switch (this.s)
    {
    case 1: 
    case 10: 
      return this.l < 0 ? 0 : this.l;
    }
    return this.l;
  }
  
  public void c(int paramInt)
  {
    this.l = paramInt;
    this.n = false;
  }
  
  public int n()
  {
    switch (this.s)
    {
    case 1: 
    case 10: 
      return this.m < 0 ? 0 : this.m;
    }
    return this.m;
  }
  
  public void d(int paramInt)
  {
    this.m = paramInt;
    this.o = false;
  }
  
  public zp o()
  {
    return new zp(this.l, this.m, this.j, this.k);
  }
  
  public boolean q()
  {
    return this.n;
  }
  
  public void c(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public boolean p()
  {
    return this.o;
  }
  
  public void d(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public boolean s()
  {
    return this.p;
  }
  
  public void e(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  zs r()
    throws Exception
  {
    int i1 = t();
    int i2 = u();
    return new zs(i1, i2);
  }
  
  int t()
    throws Exception
  {
    return zbxz.c(l() * I() / K());
  }
  
  int u()
    throws Exception
  {
    return zbxz.c(m() * J() / K());
  }
  
  int v()
    throws Exception
  {
    return zbxz.c(i() * I() / K());
  }
  
  int w()
    throws Exception
  {
    return zbxz.c(n() * J() / K());
  }
  
  public boolean x()
  {
    return this.q;
  }
  
  public void b(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  int y()
  {
    int i1 = 14;
    if (this.s == 12) {
      if ((this.r instanceof zbfd)) {
        i1 = ((zbfd)this.r).ai();
      } else {
        i1 = ((zkf)this.r).g().a().ai();
      }
    }
    return i1;
  }
  
  void z()
    throws Exception
  {
    this.a.a(this.b.c());
    this.a.b(this.b.d());
    this.a.c(this.b.e());
    this.a.d(this.b.f());
    int i1 = y();
    if (!this.p)
    {
      zs localzs;
      if (this.s == 10)
      {
        localzs = r();
        this.a.c(localzs.b());
        this.a.d(localzs.c());
      }
      else if (this.s == 12)
      {
        localzs = r();
        this.a.c(localzs.b());
        this.a.d(localzs.c());
        zqy localzqy = ((zkf)b()).o();
        localzqy.c.a(this.a.e());
        localzqy.c.b(this.a.f());
      }
    }
    int i2;
    if (!this.n) {
      if (((this.s == 12) && (!x())) || ((this.s == 16) && (!x())) || ((this.s == 8) && (!x())) || ((this.s == 9) && (!x())))
      {
        i2 = this.a.c();
        if ((i1 == 6) && (this.s == 12) && (!G())) {
          i2 -= v();
        } else {
          i2 += v();
        }
        this.a.a(i2 >= 0 ? i2 : 0);
        if (this.a.i() > this.c.a()) {
          this.a.a(this.c.a() - this.a.e());
        }
        this.p = true;
      }
      else if (this.s != 1)
      {
        i2 = v();
        this.a.a(i2 >= 0 ? i2 : 0);
        if (this.a.i() > this.c.a()) {
          this.a.a(this.c.a() - this.a.e());
        }
      }
    }
    if (!this.o) {
      if (((this.s == 12) && (!x())) || ((this.s == 16) && (!x())) || ((this.s == 8) && (!x())) || ((this.s == 9) && (!x())))
      {
        i2 = this.a.d();
        i2 += w();
        this.a.b(i2 >= 0 ? i2 : 0);
        if (this.a.j() > this.c.b()) {
          this.a.b(this.c.b() - this.a.f());
        }
      }
      else if (this.s != 1)
      {
        i2 = w();
        this.a.b(i2 >= 0 ? i2 : 0);
        if (this.a.j() > this.c.b()) {
          this.a.b(this.c.b() - this.a.f());
        }
      }
    }
  }
  
  private int I()
    throws Exception
  {
    switch (this.s)
    {
    case 1: 
    case 8: 
    case 9: 
    case 10: 
    case 12: 
    case 13: 
    case 16: 
      return this.c.al().e();
    }
    return this.t;
  }
  
  private int J()
    throws Exception
  {
    switch (this.s)
    {
    case 1: 
    case 8: 
    case 9: 
    case 10: 
    case 12: 
    case 13: 
    case 16: 
      return this.c.al().f();
    }
    return this.u;
  }
  
  private int K()
  {
    switch (this.s)
    {
    case 1: 
    case 8: 
    case 9: 
    case 10: 
    case 12: 
    case 13: 
    case 16: 
      return 4000;
    }
    return this.v;
  }
  
  zp A()
    throws Exception
  {
    if ((C()) || (this.s == 1))
    {
      z();
      zp localzp = new zp(this.a.c(), this.a.d(), this.a.e(), this.a.f());
      int i1 = 14;
      if (this.s == 12) {
        if ((this.r instanceof zbfd)) {
          i1 = ((zbfd)this.r).ai();
        } else {
          i1 = ((zkf)this.r).g().a().ai();
        }
      }
      if (this.s == 12)
      {
        if (i1 == 6) {
          localzp.a(zbxz.c(K() * localzp.d() / J()));
        } else {
          localzp.a(zbxz.c(K() * localzp.c() / I()));
        }
      }
      else {
        localzp.a(zbxz.c(K() * localzp.c() / I()));
      }
      if (this.s == 12)
      {
        if (i1 == 6) {
          localzp.b(zbxz.c(K() * localzp.c() / I()));
        } else {
          localzp.b(zbxz.c(K() * localzp.d() / J()));
        }
      }
      else {
        localzp.b(zbxz.c(K() * localzp.d() / J()));
      }
      localzp.c(zbxz.c(K() * localzp.e() / I()));
      localzp.d(zbxz.c(K() * localzp.f() / J()));
      return localzp;
    }
    return o();
  }
  
  zp B()
    throws Exception
  {
    zp localzp = new zp(this.b.c(), this.b.d(), this.b.e(), this.b.f());
    localzp.a(zbxz.c(K() * localzp.c() / I()));
    localzp.b(zbxz.c(K() * localzp.d() / J()));
    localzp.c(zbxz.c(K() * localzp.e() / I()));
    localzp.d(zbxz.c(K() * localzp.f() / J()));
    return localzp;
  }
  
  public boolean C()
  {
    return this.w;
  }
  
  public void a(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  float D()
  {
    return zbxz.a(a().ap().a().a(f()));
  }
  
  boolean E()
    throws Exception
  {
    z();
    return (this.a.e() <= 0) || (this.a.f() <= 0);
  }
  
  int F()
  {
    return this.s;
  }
  
  boolean G()
  {
    return this.x;
  }
  
  void f(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }
  
  void H()
    throws Exception
  {
    if (E()) {
      return;
    }
    c().a(this.a);
    d().a(this.a);
  }
  
  protected void finalize()
    throws Exception
  {
    g(false);
  }
  
  public void dispose()
  {
    g(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void g(boolean paramBoolean)
  {
    if (!this.y)
    {
      if (paramBoolean)
      {
        if (this.f != null) {
          this.f.n();
        }
        if (this.d != null) {
          this.d.dispose();
        }
      }
      this.y = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */