package com.aspose.cells;

public class ReflectionEffect
{
  static ReflectionEffect a = new ReflectionEffect(6350, 52000, 300, 35000, 0, 5400000, -100000, 1, false);
  static ReflectionEffect b = new ReflectionEffect(6350, 50000, 300, 55000, 0, 5400000, -100000, 1, false);
  static ReflectionEffect c = new ReflectionEffect(6350, 50000, 300, 90000, 0, 5400000, -100000, 1, false);
  static ReflectionEffect d = new ReflectionEffect(6350, 50000, 300, 38500, 50800, 5400000, -100000, 1, false);
  static ReflectionEffect e = new ReflectionEffect(6350, 50000, 300, 55500, 50800, 5400000, -100000, 1, false);
  static ReflectionEffect f = new ReflectionEffect(6350, 50000, 300, 90000, 50800, 5400000, -100000, 1, false);
  static ReflectionEffect g = new ReflectionEffect(6350, 50000, 275, 40000, 101600, 5400000, -100000, 1, false);
  static ReflectionEffect h = new ReflectionEffect(6350, 50000, 300, 55500, 101600, 5400000, -100000, 1, false);
  static ReflectionEffect i = new ReflectionEffect(6350, 50000, 295, 92000, 101600, 5400000, -100000, 1, false);
  boolean j = true;
  int k;
  int l = 0;
  double m;
  int n;
  int o;
  int p = 100000;
  double q;
  double r;
  double s;
  boolean t = true;
  int u = 100000;
  int v;
  double w = 100000.0D;
  double x = 100000.0D;
  
  ReflectionEffect() {}
  
  private void a()
  {
    if (this.j)
    {
      this.j = false;
      this.u = 45000;
      this.p = 65000;
      this.m = 5400000.0D;
      this.x = -100000.0D;
      this.l = 1;
      this.t = false;
      this.n = 50800;
    }
  }
  
  ReflectionEffect(int blurRad, int stA, int endA, int endPos, int dist, int dir, int sy, int algn, boolean rotWithShape)
  {
    this.j = false;
    this.k = blurRad;
    this.u = stA;
    this.o = endA;
    this.p = endPos;
    this.m = dir;
    this.x = sy;
    this.l = algn;
    this.t = rotWithShape;
    this.n = dist;
  }
  
  public int getType()
  {
    if (this.j) {
      return 0;
    }
    if (b(a(7))) {
      return 7;
    }
    if (b(a(10))) {
      return 10;
    }
    if (b(a(4))) {
      return 4;
    }
    if (b(a(6))) {
      return 6;
    }
    if (b(a(9))) {
      return 9;
    }
    if (b(a(3))) {
      return 3;
    }
    if (b(a(5))) {
      return 5;
    }
    if (b(a(8))) {
      return 8;
    }
    if (b(a(2))) {
      return 2;
    }
    return 1;
  }
  
  public void setType(int value)
  {
    if (value == 0)
    {
      this.j = true;
    }
    else
    {
      this.j = false;
      ReflectionEffect localReflectionEffect = a(value);
      a(localReflectionEffect);
    }
  }
  
  private static ReflectionEffect a(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return a;
    case 5: 
      return d;
    case 8: 
      return g;
    case 3: 
      return b;
    case 6: 
      return e;
    case 9: 
      return h;
    case 4: 
      return c;
    case 7: 
      return f;
    case 10: 
      return i;
    }
    return null;
  }
  
  public double getTransparency()
  {
    return 1.0D - zbxp.k(this.u);
  }
  
  public void setTransparency(double value)
  {
    a();
    this.u = zbxp.j(1.0D - value);
  }
  
  public double getSize()
  {
    return zbxp.m(this.p);
  }
  
  public void setSize(double value)
  {
    a();
    this.p = zbxp.l(value);
  }
  
  public double getBlur()
  {
    return zbxp.c(this.k);
  }
  
  public void setBlur(double value)
  {
    a();
    this.k = zbxp.f(value);
  }
  
  public double getDirection()
  {
    return this.m;
  }
  
  public void setDirection(double value)
  {
    a();
    this.m = value;
  }
  
  public double getDistance()
  {
    return zbxp.c(this.n);
  }
  
  public void setDistance(double value)
  {
    this.n = zbxp.f(value);
  }
  
  public double getFadeDirection()
  {
    return this.q;
  }
  
  public void setFadeDirection(double value)
  {
    this.q = value;
  }
  
  public boolean getRotWithShape()
  {
    return this.t;
  }
  
  public void setRotWithShape(boolean value)
  {
    this.t = value;
  }
  
  void a(ReflectionEffect paramReflectionEffect)
  {
    this.j = paramReflectionEffect.j;
    this.k = paramReflectionEffect.k;
    this.m = paramReflectionEffect.m;
    this.n = paramReflectionEffect.n;
    this.o = paramReflectionEffect.o;
    this.p = paramReflectionEffect.p;
    this.q = paramReflectionEffect.q;
    this.r = paramReflectionEffect.r;
    this.t = paramReflectionEffect.t;
    this.l = paramReflectionEffect.l;
    this.u = paramReflectionEffect.u;
    this.v = paramReflectionEffect.v;
    this.s = paramReflectionEffect.s;
    this.w = paramReflectionEffect.w;
    this.x = paramReflectionEffect.x;
  }
  
  boolean b(ReflectionEffect paramReflectionEffect)
  {
    if (this.k != paramReflectionEffect.k) {
      return false;
    }
    if (this.m != paramReflectionEffect.m) {
      return false;
    }
    if (this.n != paramReflectionEffect.n) {
      return false;
    }
    if (this.o != paramReflectionEffect.o) {
      return false;
    }
    if (this.p != paramReflectionEffect.p) {
      return false;
    }
    if (this.q != paramReflectionEffect.q) {
      return false;
    }
    if (this.r != paramReflectionEffect.r) {
      return false;
    }
    if (this.t != paramReflectionEffect.t) {
      return false;
    }
    if (this.l != paramReflectionEffect.l) {
      return false;
    }
    if (this.u != paramReflectionEffect.u) {
      return false;
    }
    if (this.v != paramReflectionEffect.v) {
      return false;
    }
    if (this.s != paramReflectionEffect.s) {
      return false;
    }
    if (this.w != paramReflectionEffect.w) {
      return false;
    }
    return this.x == paramReflectionEffect.x;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ReflectionEffect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */