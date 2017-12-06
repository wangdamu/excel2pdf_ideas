package com.aspose.cells;

import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zs;

class zjx
  implements zahm
{
  private zje c;
  private zay d;
  private zanq e;
  private com.aspose.cells.b.a.b.zg f;
  private zzo g;
  private Color h;
  private int i;
  private int j;
  private int k;
  private int l;
  zp a = zp.a();
  zp b = zp.a();
  private boolean m = true;
  private boolean n = true;
  private boolean o = true;
  private Object p = null;
  private int q;
  private boolean r = true;
  private int s;
  private int t;
  private int u;
  private boolean v = false;
  private boolean w = false;
  
  zjx(zje paramzje, Object paramObject, int paramInt)
  {
    this.c = paramzje;
    this.k = 0;
    this.l = 0;
    this.i = 0;
    this.j = 0;
    this.d = new zay(paramzje);
    this.e = new zanq(paramzje);
    this.h = Color.getBlack();
    this.a = zp.a();
    this.b = zp.a();
    this.p = paramObject;
    this.q = paramInt;
    this.g = new zzo();
  }
  
  zje a()
  {
    return this.c;
  }
  
  Object b()
  {
    return this.p;
  }
  
  public void a(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  public boolean c()
  {
    return this.v;
  }
  
  public void b(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  zay d()
  {
    return this.d;
  }
  
  public zagu e()
  {
    return this.d;
  }
  
  zanq f()
  {
    return this.e;
  }
  
  public zaip g()
  {
    return this.e;
  }
  
  public com.aspose.cells.b.a.b.zg h()
  {
    if (this.f == null)
    {
      if (this.q == 0)
      {
        this.f = zbxz.a("Arial", 10.0F, 0);
        a(Color.getBlack());
      }
      else
      {
        this.f = zbxz.a(this.c.ab());
        a(this.c.ac());
      }
    }
    else if ((k().d()) || (k().c()))
    {
      com.aspose.cells.b.a.b.zg localzg = new com.aspose.cells.b.a.b.zg(this.f.b(), 0.7F * this.f.h(), this.f.k());
      return localzg;
    }
    return this.f;
  }
  
  public void a(com.aspose.cells.b.a.b.zg paramzg)
  {
    this.f = paramzg;
  }
  
  com.aspose.cells.b.a.b.zg i()
  {
    if (this.f == null) {
      if (this.q == 0)
      {
        this.f = zbxz.a("Arial", 10.0F, 0);
        a(Color.getBlack());
      }
      else
      {
        this.f = zbxz.a(this.c.ab());
        a(this.c.ac());
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
    return this.h;
  }
  
  public void a(Color paramColor)
  {
    this.h = paramColor;
  }
  
  public zaid k()
  {
    return this.g;
  }
  
  public int l()
  {
    switch (this.q)
    {
    case 1: 
    case 10: 
      if ((!s()) && (this.i + n() > 4000)) {
        return 4000 - n();
      }
      return this.i;
    }
    return this.i;
  }
  
  public void a(int paramInt)
  {
    this.i = paramInt;
    this.o = false;
  }
  
  public int m()
  {
    switch (this.q)
    {
    case 1: 
    case 10: 
      if ((!s()) && (this.j + o() > 4000)) {
        return 4000 - o();
      }
      return this.j;
    }
    return this.j;
  }
  
  public void b(int paramInt)
  {
    this.j = paramInt;
    this.o = false;
  }
  
  public int n()
  {
    switch (this.q)
    {
    case 1: 
    case 10: 
      return this.k < 0 ? 0 : this.k;
    }
    return this.k;
  }
  
  public void c(int paramInt)
  {
    this.k = paramInt;
    this.m = false;
  }
  
  public int o()
  {
    switch (this.q)
    {
    case 1: 
    case 10: 
      return this.l < 0 ? 0 : this.l;
    }
    return this.l;
  }
  
  public void d(int paramInt)
  {
    this.l = paramInt;
    this.n = false;
  }
  
  public zp p()
  {
    return new zp(this.k, this.l, this.i, this.j);
  }
  
  public boolean q()
  {
    return this.m;
  }
  
  public void c(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public boolean r()
  {
    return this.n;
  }
  
  public void d(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public boolean s()
  {
    return this.o;
  }
  
  public void e(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  zs t()
    throws Exception
  {
    int i1 = u();
    int i2 = v();
    return new zs(i1, i2);
  }
  
  int u()
    throws Exception
  {
    return zbxz.c(l() * E() / G());
  }
  
  int v()
    throws Exception
  {
    return zbxz.c(m() * F() / G());
  }
  
  int w()
    throws Exception
  {
    return zbxz.c(n() * E() / G());
  }
  
  int x()
    throws Exception
  {
    return zbxz.c(o() * F() / G());
  }
  
  int y()
  {
    int i1 = 14;
    int i2 = ziy.c;
    if (this.q == 12) {
      if ((this.p instanceof zbfc)) {
        i1 = ((zbfc)this.p).ag();
      } else {
        i1 = ((zke)this.p).g().a().ag();
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
    int i2 = ziy.c;
    if ((this.q == 12) && ((i1 == 44) || (i1 == 35))) {
      return;
    }
    if ((!this.o) && (this.q == 10))
    {
      zs localzs = t();
      this.a.c(localzs.b());
      this.a.d(localzs.c());
    }
    int i3;
    int i6;
    if (!this.m) {
      if (((this.q == 12) && (!c())) || ((this.q == 16) && (!c())))
      {
        i3 = this.a.c();
        if ((i1 == 6) || (i1 == 7) || (i1 == 8))
        {
          int i4 = this.k;
          this.k = this.l;
          i3 -= w();
          this.k = i4;
        }
        else
        {
          i3 += w();
        }
        this.a.a(i3 >= i2 ? i3 : i2);
        if (this.a.i() + i2 > this.c.a()) {
          this.a.a(this.c.a() - i2 - this.a.e());
        }
      }
      else if (((this.q == 8) && (!c())) || ((this.q == 9) && (!c())) || ((this.q == 13) && (!c())))
      {
        i3 = this.a.c();
        if (((b() instanceof zbs)) && (this.q == 9))
        {
          zbs localzbs1 = (zbs)b();
          if ((localzbs1.a() == 1) || (localzbs1.a() == 2))
          {
            if (localzbs1.n) {
              i3 += w();
            } else {
              i3 -= w();
            }
          }
          else if ((localzbs1.a() == 0) || (localzbs1.a() == 3))
          {
            i6 = this.k;
            this.k = this.l;
            i3 += w();
            this.k = i6;
          }
          else
          {
            i3 += w();
          }
        }
        else
        {
          i3 += w();
        }
        this.a.a(i3 >= i2 ? i3 : i2);
        if (this.a.i() + i2 > this.c.a()) {
          this.a.a(this.c.a() - i2 - this.a.e());
        }
      }
      else if (this.q != 1)
      {
        if (this.q == 10)
        {
          this.a.a(w());
          this.a.a(this.a.c() + i2);
        }
        else
        {
          this.a.a(w());
        }
      }
    }
    if (!this.n) {
      if (((this.q == 12) && (!c())) || ((this.q == 16) && (!c())))
      {
        i3 = this.a.d();
        if ((i1 == 6) || (i1 == 7) || (i1 == 8))
        {
          int i5 = this.l;
          this.l = this.k;
          i3 -= x();
          this.l = i5;
        }
        else
        {
          i3 += x();
        }
        this.a.b(i3 >= i2 ? i3 : i2);
        if (this.a.j() + i2 > this.c.b()) {
          this.a.b(this.c.b() - i2 - this.a.f());
        }
      }
      else if (((this.q == 8) && (!c())) || ((this.q == 9) && (!c())) || ((this.q == 13) && (!c())))
      {
        i3 = this.a.d();
        if (((b() instanceof zbs)) && (this.q == 9))
        {
          zbs localzbs2 = (zbs)b();
          if ((localzbs2.a() == 1) || (localzbs2.a() == 2))
          {
            i3 -= x();
          }
          else if ((localzbs2.a() == 0) || (localzbs2.a() == 3))
          {
            i6 = this.l;
            this.l = this.k;
            if (localzbs2.n) {
              i3 -= x();
            } else {
              i3 += x();
            }
            this.l = i6;
          }
          else
          {
            i3 += x();
          }
        }
        else
        {
          i3 += x();
        }
        this.a.b(i3 >= i2 ? i3 : i2);
        if (this.a.j() + i2 > this.c.b()) {
          this.a.b(this.c.b() - i2 - this.a.f());
        }
      }
      else if (this.q != 1)
      {
        if (this.q == 10)
        {
          this.a.b(x());
          this.a.b(this.a.d() + i2);
        }
        else
        {
          this.a.b(x());
        }
      }
    }
  }
  
  void e(int paramInt)
  {
    this.s = paramInt;
  }
  
  void f(int paramInt)
  {
    this.t = paramInt;
  }
  
  private int E()
    throws Exception
  {
    int i1 = ziy.c;
    switch (this.q)
    {
    case 1: 
    case 8: 
    case 10: 
      return this.c.a() - 2 * i1;
    }
    if (c()) {
      return this.c.a() - 2 * i1;
    }
    return this.s;
  }
  
  private int F()
    throws Exception
  {
    int i1 = ziy.c;
    switch (this.q)
    {
    case 1: 
    case 8: 
    case 10: 
      return this.c.b() - 2 * i1;
    }
    if (c()) {
      return this.c.b() - 2 * i1;
    }
    return this.t;
  }
  
  private int G()
  {
    switch (this.q)
    {
    case 1: 
    case 8: 
    case 10: 
      return 4000;
    case 9: 
    case 12: 
    case 13: 
    case 16: 
      if (c()) {
        return 4000;
      }
      return 1000;
    }
    return this.u;
  }
  
  zp A()
    throws Exception
  {
    z();
    zp localzp = new zp(this.a.c(), this.a.d(), this.a.e(), this.a.f());
    int i1 = ziy.c;
    if (localzp.c() > i1) {
      localzp.a(localzp.c() - i1);
    }
    if (localzp.d() > i1) {
      localzp.b(localzp.d() - i1);
    }
    int i2 = 4000;
    int i3 = this.c.b() - 2 * i1;
    int i4 = this.c.a() - 2 * i1;
    int i5 = 14;
    if (this.q == 12) {
      if ((this.p instanceof zbfc)) {
        i5 = ((zbfc)this.p).ag();
      } else {
        i5 = ((zke)this.p).g().a().ag();
      }
    }
    if (this.q == 12)
    {
      if (i5 == 6) {
        localzp.a(zbxz.c(i2 * localzp.d() / i3));
      } else {
        localzp.a(zbxz.c(i2 * localzp.c() / i4));
      }
    }
    else {
      localzp.a(zbxz.c(i2 * localzp.c() / i4));
    }
    if (this.q == 12)
    {
      if (i5 == 6) {
        localzp.b(zbxz.c(i2 * localzp.c() / i4));
      } else {
        localzp.b(zbxz.c(i2 * localzp.d() / i3));
      }
    }
    else {
      localzp.b(zbxz.c(i2 * localzp.d() / i3));
    }
    localzp.c(zbxz.c(i2 * localzp.e() / i4));
    localzp.d(zbxz.c(i2 * localzp.f() / i3));
    return localzp;
  }
  
  zp B()
    throws Exception
  {
    zp localzp = new zp(this.b.c(), this.b.d(), this.b.e(), this.b.f());
    int i1 = ziy.c;
    if (localzp.c() > i1) {
      localzp.a(localzp.c() - i1);
    }
    if (localzp.d() > i1) {
      localzp.b(localzp.d() - i1);
    }
    localzp.a(zbxz.c(G() * localzp.c() / E()));
    localzp.b(zbxz.c(G() * localzp.d() / F()));
    localzp.c(zbxz.c(G() * localzp.e() / E()));
    localzp.d(zbxz.c(G() * localzp.f() / F()));
    return localzp;
  }
  
  float C()
  {
    return zbxz.a(a().ar().a().a(i()));
  }
  
  boolean D()
    throws Exception
  {
    z();
    return (this.a.e() <= 0) || (this.a.f() <= 0);
  }
  
  protected void finalize()
    throws Exception
  {
    f(false);
  }
  
  public void dispose()
  {
    f(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void f(boolean paramBoolean)
  {
    if (!this.w)
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
      this.w = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */