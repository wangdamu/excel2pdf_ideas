package com.aspose.cells;

import com.aspose.cells.b.a.zh;

class zoh
{
  Worksheet a;
  String b;
  String c;
  AutoFilter d;
  double e = -1.0D;
  double f = -1.0D;
  boolean g = false;
  PaneCollection h;
  zbew i;
  PageSetup j;
  HorizontalPageBreakCollection k;
  VerticalPageBreakCollection l;
  Outline m;
  zh n;
  short o;
  private int s;
  CellArea p = new CellArea();
  private int t;
  private int u = 182;
  private int v = 0;
  private int[] w = { 100, 60, 100 };
  private byte x;
  private boolean y = true;
  int q = 1;
  zaml r;
  private int z = 64;
  
  zoh(Worksheet paramWorksheet)
  {
    this.a = paramWorksheet;
    this.r = new zaml(false);
    this.q = (paramWorksheet.getIndex() + 1);
    this.o = 4;
  }
  
  int a()
  {
    if (this.d == null) {
      return 0;
    }
    return this.d.g();
  }
  
  AutoFilter b()
  {
    if (this.d == null) {
      this.d = new AutoFilter(this.a, this);
    }
    return this.d;
  }
  
  PaneCollection c()
  {
    if (this.h == null) {
      this.h = new PaneCollection(this.a);
    }
    return this.h;
  }
  
  zbew d()
  {
    if (this.i == null) {
      this.i = new zbew(this.a);
    }
    return this.i;
  }
  
  PageSetup e()
  {
    if (this.j == null) {
      this.j = new PageSetup(this.a, this);
    }
    return this.j;
  }
  
  HorizontalPageBreakCollection f()
  {
    if (this.k == null) {
      this.k = new HorizontalPageBreakCollection();
    }
    return this.k;
  }
  
  VerticalPageBreakCollection g()
  {
    if (this.l == null) {
      this.l = new VerticalPageBreakCollection();
    }
    return this.l;
  }
  
  Outline h()
  {
    return this.m;
  }
  
  public int i()
  {
    return this.s;
  }
  
  public void a(int paramInt)
  {
    this.s = paramInt;
  }
  
  public int j()
  {
    return this.t;
  }
  
  public void b(int paramInt)
  {
    zamm.b(paramInt);
    this.t = paramInt;
  }
  
  boolean k()
  {
    return (this.o & 0x1) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x1));
    } else {
      this.o = ((short)(this.o & 0xFFFFFFFE));
    }
  }
  
  boolean l()
  {
    return (this.o & 0x2) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x2));
    } else {
      this.o = ((short)(this.o & 0xFFFFFFFD));
    }
  }
  
  boolean m()
  {
    return (this.o & 0x4) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x4));
    } else {
      this.o = ((short)(this.o & 0xFFFFFFFB));
    }
  }
  
  boolean n()
  {
    return (this.o & 0x8) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x8));
    } else {
      this.o = ((short)(this.o & 0xFFFFFFF7));
    }
  }
  
  boolean o()
  {
    return (this.o & 0x20) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x20));
    } else {
      this.o = ((short)(this.o & 0xFFFFFFDF));
    }
  }
  
  boolean p()
  {
    return (this.o & 0x80) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x80));
    } else {
      this.o = ((short)(this.o & 0xFF7F));
    }
  }
  
  boolean q()
  {
    return (this.o & 0x100) != 0;
  }
  
  void g(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x100));
    } else {
      this.o = ((short)(this.o & 0xFEFF));
    }
  }
  
  boolean r()
  {
    return (this.o & 0x200) != 0;
  }
  
  void h(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x200));
    } else {
      this.o = ((short)(this.o & 0xFDFF));
    }
  }
  
  boolean s()
  {
    return (this.o & 0x400) != 0;
  }
  
  void i(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x400));
    } else {
      this.o = ((short)(this.o & 0xFBFF));
    }
  }
  
  boolean t()
  {
    return (this.o & 0x800) != 0;
  }
  
  void j(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x800));
    } else {
      this.o = ((short)(this.o & 0xF7FF));
    }
  }
  
  boolean u()
  {
    return (this.o & 0x1000) != 0;
  }
  
  void k(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.o = ((short)(this.o | 0x1000));
    } else {
      this.o = ((short)(this.o & 0xEFFF));
    }
  }
  
  boolean v()
  {
    return (this.u & 0xFFFF & 0x1) != 0;
  }
  
  void l(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.u |= 0x1;
    } else {
      this.u &= 0xFFFE;
    }
  }
  
  public boolean w()
  {
    return (this.u & 0xFFFF & 0x2) != 0;
  }
  
  public void m(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.u |= 0x2;
    } else {
      this.u &= 0xFFFD;
    }
  }
  
  public boolean x()
  {
    return (this.u & 0xFFFF & 0x4) != 0;
  }
  
  public void n(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.u |= 0x4;
    } else {
      this.u &= 0xFFFB;
    }
  }
  
  boolean y()
  {
    return (this.u & 0xFFFF & 0x8) != 0;
  }
  
  void o(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.u |= 0x8;
    } else {
      this.u &= 0xFFF7;
    }
  }
  
  boolean z()
  {
    return (this.u & 0xFFFF & 0x100) == 0;
  }
  
  void p(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.u &= 0xFEFF;
    } else {
      this.u |= 0x100;
    }
  }
  
  public boolean A()
  {
    return (this.u & 0xFFFF & 0x10) != 0;
  }
  
  public void q(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.u |= 0x10;
    } else {
      this.u &= 0xFFEF;
    }
  }
  
  public boolean B()
  {
    return (this.u & 0xFFFF & 0x80) != 0;
  }
  
  public void r(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.u |= 0x80;
    } else {
      this.u &= 0xFF7F;
    }
  }
  
  int[] C()
  {
    return this.w;
  }
  
  public int D()
  {
    switch (this.v)
    {
    case 0: 
      return this.w[0];
    case 1: 
      return this.w[1];
    case 2: 
      return this.w[2];
    }
    return 100;
  }
  
  public void c(int paramInt)
  {
    if ((paramInt >= 10) && (paramInt <= 400)) {
      switch (this.v)
      {
      case 0: 
        this.w[0] = paramInt;
        break;
      case 1: 
        this.w[1] = paramInt;
        break;
      case 2: 
        this.w[2] = paramInt;
        break;
      }
    }
  }
  
  public int E()
  {
    return this.v;
  }
  
  public void d(int paramInt)
  {
    this.v = paramInt;
  }
  
  public int F()
  {
    switch (this.x)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  public void e(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      this.x = 0;
      break;
    case 1: 
      this.x = 1;
      break;
    case 2: 
      this.x = 2;
      break;
    }
  }
  
  public boolean G()
  {
    return this.y;
  }
  
  public void s(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }
  
  void f(int paramInt)
  {
    if (paramInt >= 64) {
      this.r.b(true);
    } else {
      this.r.a(3, paramInt);
    }
  }
  
  int H()
  {
    if (this.r.b()) {
      return 64;
    }
    int i1 = 0;
    boolean[] arrayOfBoolean = { i1 };
    int i2 = this.r.a(this.a.c(), 64, false, arrayOfBoolean);
    i1 = arrayOfBoolean[0];
    return i2;
  }
  
  int I()
  {
    return this.z;
  }
  
  void g(int paramInt)
  {
    this.z = paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zoh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */