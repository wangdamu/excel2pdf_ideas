package com.aspose.cells;

import java.util.Iterator;

class zka
{
  String a;
  private zkb b;
  private zpz c;
  private int d;
  private boolean e = false;
  private boolean f = false;
  private Line g;
  private boolean h = false;
  private Line i;
  private boolean j = false;
  private Line k;
  private boolean l = false;
  private DropBars m;
  private DropBars n;
  private boolean o;
  private int p = 150;
  private int q;
  private int r = 0;
  private int s = 75;
  private int t = 4;
  private double u = 1.0D;
  private int[] v;
  private int w = 100;
  private int x = 0;
  private boolean y = false;
  private int z = 50;
  private boolean A = false;
  private boolean B = true;
  private boolean C = false;
  private Line D = null;
  private ShapePropertyCollection E;
  private ShapePropertyCollection F;
  private ShapePropertyCollection G;
  private ShapePropertyCollection H;
  
  zkb a()
  {
    return this.b;
  }
  
  zka(zkb paramzkb)
  {
    this.b = paramzkb;
  }
  
  zka(zkb paramzkb, int paramInt, boolean paramBoolean)
  {
    this.b = paramzkb;
    this.d = paramInt;
    this.e = paramBoolean;
    b();
  }
  
  void b()
  {
    c();
    Y();
  }
  
  void c()
  {
    switch (this.d)
    {
    case 44: 
    case 45: 
    case 47: 
    case 48: 
      this.o = true;
      this.C = true;
      this.z = 0;
      break;
    case 35: 
    case 36: 
      this.o = true;
      this.C = true;
      break;
    case 46: 
    case 49: 
      this.p = 100;
      this.h = true;
      this.o = true;
      this.C = true;
      this.z = 0;
      break;
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 15: 
    case 16: 
    case 19: 
    case 20: 
    case 22: 
    case 23: 
    case 25: 
    case 26: 
    case 29: 
    case 30: 
    case 32: 
    case 33: 
    case 51: 
    case 52: 
    case 54: 
    case 55: 
      this.r = 100;
      break;
    }
  }
  
  zpz d()
  {
    return this.c;
  }
  
  void a(zpz paramzpz)
  {
    this.c = paramzpz;
  }
  
  zpz e()
  {
    return this.c;
  }
  
  private void Y()
  {
    switch (this.d)
    {
    case 13: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 44: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 57: 
    case 60: 
    case 61: 
    case 62: 
    case 64: 
      this.c = new zpz(this);
      this.c.s();
      break;
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 35: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 45: 
    case 58: 
    case 59: 
    case 63: 
    default: 
      this.c = null;
    }
  }
  
  void a(zka paramzka, CopyOptions paramCopyOptions)
  {
    this.d = paramzka.d;
    this.e = paramzka.e;
    this.q = paramzka.q;
    this.p = paramzka.p;
    this.o = paramzka.o;
    this.r = paramzka.r;
    this.e = paramzka.e;
    this.z = paramzka.z;
    this.A = paramzka.A;
    this.j = paramzka.j;
    this.B = paramzka.B;
    this.y = paramzka.y;
    this.w = paramzka.w;
    this.s = paramzka.s;
    this.x = paramzka.x;
    this.t = paramzka.t;
    this.u = paramzka.u;
    this.v = paramzka.v;
    if ((this.j) && (paramzka.k != null))
    {
      this.k = new Line(this.b.a(), this);
      this.k.a(paramzka.k);
    }
    this.f = paramzka.f;
    if ((this.f) && (paramzka.g != null))
    {
      this.g = new Line(this.b.a(), this);
      this.g.a(paramzka.g);
    }
    this.h = paramzka.h;
    if ((this.h) && (paramzka.i != null))
    {
      this.i = new Line(this.b.a(), this);
      this.i.a(paramzka.i);
    }
    this.C = paramzka.C;
    if ((this.C) && (paramzka.D != null))
    {
      this.D = new Line(this.b.a(), this);
      this.D.a(paramzka.D);
    }
    this.l = paramzka.l;
    if (this.l)
    {
      if (paramzka.m != null)
      {
        this.m = new DropBars(this.b.a());
        this.m.a(paramzka.m, paramCopyOptions);
      }
      if (paramzka.n != null)
      {
        this.n = new DropBars(this.b.a());
        this.n.a(paramzka.n, paramCopyOptions);
      }
    }
    if (paramzka.c != null)
    {
      if (this.c == null) {
        this.c = new zpz(this);
      }
      this.c.a(paramzka.c, paramCopyOptions);
    }
    if (paramzka.E != null)
    {
      this.E = new ShapePropertyCollection(this.b.a(), this, 12);
      this.E.a(paramzka.E, paramCopyOptions);
    }
    if (paramzka.F != null)
    {
      this.F = new ShapePropertyCollection(this.b.a(), this, 13);
      this.F.a(paramzka.F, paramCopyOptions);
    }
    if (paramzka.G != null)
    {
      this.G = new ShapePropertyCollection(this.b.a(), this, 14);
      this.G.a(paramzka.G, paramCopyOptions);
    }
    if (paramzka.H != null)
    {
      this.H = new ShapePropertyCollection(this.b.a(), this, 15);
      this.H.a(paramzka.H, paramCopyOptions);
    }
  }
  
  Marker f()
  {
    if (this.c == null) {
      return null;
    }
    return this.c.k();
  }
  
  Line g()
  {
    if (this.c == null) {
      return null;
    }
    return this.c.g();
  }
  
  Area h()
  {
    if (this.c == null) {
      return null;
    }
    return this.c.h();
  }
  
  zkd i()
  {
    if (this.c == null) {
      return null;
    }
    return this.c.i();
  }
  
  int j()
  {
    return this.d;
  }
  
  void a(int paramInt)
  {
    if (this.d == paramInt) {
      return;
    }
    this.d = paramInt;
    b();
    Z();
  }
  
  void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  int k()
  {
    for (int i1 = 0; i1 < this.b.getCount(); i1++) {
      if (this == this.b.a(i1)) {
        return i1;
      }
    }
    throw new CellsException(0, "The chart type is not in this chart");
  }
  
  int l()
  {
    int i1 = 0;
    Iterator localIterator = this.b.a().getNSeries().iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if (localSeries.u() == this) {
        i1++;
      }
    }
    return i1;
  }
  
  public boolean m()
  {
    return this.e;
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.e != paramBoolean)
    {
      this.e = paramBoolean;
      Z();
    }
  }
  
  void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  private void Z()
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.b.getCount(); i2++) {
      if (this == this.b.a(i2))
      {
        this.b.removeAt(i2);
        i1 = 1;
        break;
      }
    }
    if (i1 != 0) {
      this.b.a(this);
    }
  }
  
  public boolean n()
  {
    if (ChartCollection.n(this.d)) {
      return this.f;
    }
    return false;
  }
  
  public void c(boolean paramBoolean)
  {
    if (ChartCollection.n(this.d)) {
      this.f = paramBoolean;
    }
  }
  
  void d(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public Line o()
  {
    if (this.g == null) {
      this.g = new Line(this.b.a(), this);
    }
    return this.g;
  }
  
  public boolean p()
  {
    switch (this.d)
    {
    case 7: 
    case 8: 
    case 15: 
    case 16: 
    case 46: 
    case 49: 
      return this.h;
    }
    return false;
  }
  
  public void e(boolean paramBoolean)
  {
    switch (this.d)
    {
    case 7: 
    case 8: 
    case 15: 
    case 16: 
    case 46: 
    case 49: 
      this.h = paramBoolean;
      break;
    }
  }
  
  void f(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public Line q()
  {
    if (this.i == null) {
      return this.i = new Line(this.b.a(), this);
    }
    return this.i;
  }
  
  public boolean r()
  {
    if ((ChartCollection.n(this.d)) || (ChartCollection.p(this.d))) {
      return this.j;
    }
    return false;
  }
  
  public void g(boolean paramBoolean)
  {
    if ((ChartCollection.n(this.d)) || (ChartCollection.p(this.d))) {
      this.j = paramBoolean;
    }
  }
  
  void h(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public Line s()
  {
    if (this.k == null) {
      return this.k = new Line(this.b.a(), this);
    }
    return this.k;
  }
  
  public boolean t()
  {
    if (!ChartCollection.n(this.d)) {
      return false;
    }
    return this.l;
  }
  
  public void i(boolean paramBoolean)
  {
    if (!ChartCollection.n(this.d)) {
      return;
    }
    this.l = paramBoolean;
  }
  
  void j(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  DropBars u()
  {
    if (this.m == null) {
      this.m = new DropBars(this.b.a());
    }
    return this.m;
  }
  
  public DropBars v()
  {
    if (this.n == null) {
      this.n = new DropBars(this.b.a());
    }
    return this.n;
  }
  
  DropBars w()
  {
    return this.m;
  }
  
  DropBars x()
  {
    return this.n;
  }
  
  public boolean y()
  {
    return this.o;
  }
  
  public void k(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public int z()
  {
    return this.p;
  }
  
  public void c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 500)) {
      throw new IllegalArgumentException("First slice angle should be degree 0 to 500.");
    }
    this.p = paramInt;
  }
  
  public int A()
  {
    return this.q;
  }
  
  public void d(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 360)) {
      throw new IllegalArgumentException("First slice angle should be degree 0 to 360.");
    }
    this.q = paramInt;
  }
  
  public int B()
  {
    return this.r;
  }
  
  public void e(int paramInt)
  {
    if ((paramInt < -100) || (paramInt > 100)) {
      throw new CellsException(0, "Invalid over lap: it must be between -100 and 100.");
    }
    this.r = paramInt;
  }
  
  public int C()
  {
    return this.s;
  }
  
  public void f(int paramInt)
  {
    if ((paramInt < 5) || (paramInt > 200)) {
      throw new CellsException(0, "Invalid size of the secondary section: it must be between 5 and 200.");
    }
    this.s = paramInt;
  }
  
  public int D()
  {
    return this.t;
  }
  
  public void g(int paramInt)
  {
    this.t = paramInt;
  }
  
  public double E()
  {
    return this.u;
  }
  
  public void a(double paramDouble)
  {
    this.u = paramDouble;
  }
  
  int[] F()
  {
    return this.v;
  }
  
  void a(int[] paramArrayOfInt)
  {
    this.v = paramArrayOfInt;
  }
  
  boolean G()
  {
    return this.t == 4;
  }
  
  public int H()
  {
    return this.w;
  }
  
  public void h(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 300)) {
      throw new IllegalArgumentException("Invalid bubble scale : it must be between 0 and 300.");
    }
    this.w = paramInt;
  }
  
  public int I()
  {
    return this.x;
  }
  
  public void i(int paramInt)
  {
    this.x = paramInt;
  }
  
  public boolean J()
  {
    return this.y;
  }
  
  public void l(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }
  
  public int K()
  {
    return this.z;
  }
  
  public void j(int paramInt)
  {
    if ((paramInt != 0) && (paramInt > 90)) {
      throw new CellsException(0, "Invalid hole size : it must be between 10 and 90");
    }
    this.z = paramInt;
  }
  
  boolean L()
  {
    return this.A;
  }
  
  void m(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  public boolean M()
  {
    return this.B;
  }
  
  public void n(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  boolean N()
  {
    return this.C;
  }
  
  void o(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }
  
  Line O()
  {
    if (this.D == null) {
      return this.D = new Line(this.b.a(), this);
    }
    return this.D;
  }
  
  Line P()
  {
    return this.D;
  }
  
  Line Q()
  {
    return this.k;
  }
  
  Line R()
  {
    return this.g;
  }
  
  Line S()
  {
    return this.i;
  }
  
  ShapePropertyCollection T()
  {
    if (this.E == null) {
      this.E = new ShapePropertyCollection(this.b.a(), this, 12);
    }
    return this.E;
  }
  
  ShapePropertyCollection U()
  {
    if (this.F == null) {
      this.F = new ShapePropertyCollection(this.b.a(), this, 13);
    }
    return this.F;
  }
  
  ShapePropertyCollection V()
  {
    if (this.G == null) {
      this.G = new ShapePropertyCollection(this.b.a(), this, 14);
    }
    return this.G;
  }
  
  ShapePropertyCollection W()
  {
    if (this.H == null) {
      this.H = new ShapePropertyCollection(this.b.a(), this, 15);
    }
    return this.H;
  }
  
  int X()
  {
    switch (this.d)
    {
    case 35: 
    case 36: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      return 2;
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return 3;
    case 59: 
      return 4;
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
      return 6;
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
      return 7;
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return 8;
    case 57: 
    case 58: 
      return 9;
    case 12: 
    case 13: 
      return 10;
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 65: 
    case 66: 
    case 67: 
    case 68: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      return 11;
    }
    return 100;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */