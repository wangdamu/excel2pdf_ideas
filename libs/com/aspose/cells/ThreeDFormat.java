package com.aspose.cells;

import com.aspose.cells.b.a.zw;

public class ThreeDFormat
{
  private Object o;
  String a;
  private int p;
  private int q;
  private int r = 0;
  private int s;
  private int t;
  private int u = 0;
  short b;
  int c = 14;
  zaml d;
  int e;
  zaml f;
  int g;
  String h;
  int i;
  String j;
  zbeq k;
  zani l;
  String m;
  zcg n;
  
  ThreeDFormat(Object parent)
  {
    this.o = parent;
    this.c = 14;
  }
  
  Workbook a()
  {
    if ((this.o instanceof Workbook)) {
      return (Workbook)this.o;
    }
    if ((this.o instanceof ShapeFormat)) {
      return ((ShapeFormat)this.o).f;
    }
    return null;
  }
  
  public double getBottomBevelWidth()
  {
    return zbxp.c(b());
  }
  
  public void setBottomBevelWidth(double value)
  {
    m();
    a(value);
    a(zbxp.f(value));
  }
  
  public double getBottomBevelHeight()
  {
    return zbxp.c(c());
  }
  
  public void setBottomBevelHeight(double value)
  {
    m();
    a(value);
    b(zbxp.f(value));
  }
  
  public int getBottomBevelType()
  {
    return d();
  }
  
  public void setBottomBevelType(int value)
  {
    m();
    c(value);
    if (value == 0)
    {
      this.p = (this.q = 0);
      i(96);
    }
    else if (!g(6))
    {
      int[] arrayOfInt = zbiw.a(value);
      this.p = arrayOfInt[0];
      this.q = arrayOfInt[1];
    }
  }
  
  public double getTopBevelWidth()
  {
    return zbxp.c(e());
  }
  
  public void setTopBevelWidth(double value)
  {
    m();
    b(value);
    d(zbxp.f(value));
  }
  
  public double getTopBevelHeight()
  {
    return zbxp.c(f());
  }
  
  public void setTopBevelHeight(double value)
  {
    m();
    b(value);
    e(zbxp.f(value));
  }
  
  public int getTopBevelType()
  {
    return g();
  }
  
  public void setTopBevelType(int value)
  {
    m();
    f(value);
    if (value == 0)
    {
      this.s = (this.t = 0);
      i(96);
    }
    else if (!g(96))
    {
      int[] arrayOfInt = zbiw.a(value);
      this.s = arrayOfInt[0];
      this.t = arrayOfInt[1];
    }
  }
  
  private void a(double paramDouble)
  {
    if (paramDouble <= 0.0D) {
      return;
    }
    if (this.r == 0)
    {
      this.r = 3;
      this.q = (this.q = 76200);
    }
  }
  
  int b()
  {
    return this.p;
  }
  
  void a(int paramInt)
  {
    this.p = paramInt;
    h(2);
  }
  
  int c()
  {
    return this.q;
  }
  
  void b(int paramInt)
  {
    this.q = paramInt;
    h(4);
  }
  
  int d()
  {
    return this.r;
  }
  
  void c(int paramInt)
  {
    this.r = paramInt;
    h(1);
  }
  
  private void b(double paramDouble)
  {
    if (paramDouble <= 0.0D) {
      return;
    }
    if (this.u == 0)
    {
      this.u = 3;
      this.t = (this.t = 76200);
    }
  }
  
  int e()
  {
    return this.s;
  }
  
  void d(int paramInt)
  {
    this.s = paramInt;
    h(32);
  }
  
  int f()
  {
    return this.t;
  }
  
  void e(int paramInt)
  {
    this.t = paramInt;
    h(64);
  }
  
  int g()
  {
    return this.u;
  }
  
  void f(int paramInt)
  {
    this.u = paramInt;
    h(16);
  }
  
  boolean g(int paramInt)
  {
    return (this.b & paramInt) != 0;
  }
  
  void h(int paramInt)
  {
    this.b = ((short)(this.b | (short)paramInt));
  }
  
  void i(int paramInt)
  {
    this.b = ((short)(this.b & (short)(paramInt ^ 0xFFFFFFFF)));
  }
  
  public int getMaterial()
  {
    return this.c;
  }
  
  public void setMaterial(int value)
  {
    this.c = value;
    m();
  }
  
  public CellsColor getContourColor()
  {
    return new CellsColor(a(), this.d);
  }
  
  public void setContourColor(CellsColor value)
  {
    this.d = value.a;
    m();
  }
  
  public double getContourWidth()
  {
    return zbxp.c(this.e);
  }
  
  public void setContourWidth(double value)
  {
    this.e = zbxp.f(value);
    m();
  }
  
  public CellsColor getExtrusionColor()
  {
    return new CellsColor(a(), this.f);
  }
  
  public void setExtrusionColor(CellsColor value)
  {
    this.f = value.a;
    m();
  }
  
  public double getExtrusionHeight()
  {
    return zbxp.c(this.g);
  }
  
  public void setExtrusionHeight(double value)
  {
    this.g = zbxp.f(value);
    m();
  }
  
  public double getZ()
  {
    return zbxp.c(this.i);
  }
  
  public void setZ(double value)
  {
    this.i = zbxp.f(value);
    m();
  }
  
  void a(ThreeDFormat paramThreeDFormat, CopyOptions paramCopyOptions)
  {
    this.a = paramThreeDFormat.a;
    if (this.a == null)
    {
      this.i = paramThreeDFormat.i;
      this.h = paramThreeDFormat.h;
      this.e = paramThreeDFormat.e;
      this.g = paramThreeDFormat.g;
      if (paramThreeDFormat.d != null)
      {
        this.d = new zaml(true);
        this.d.f(paramThreeDFormat.d);
      }
      if (paramThreeDFormat.f != null)
      {
        this.f = new zaml(true);
        this.f.f(paramThreeDFormat.f);
      }
      this.c = paramThreeDFormat.c;
      this.t = paramThreeDFormat.t;
      this.u = paramThreeDFormat.u;
      this.s = paramThreeDFormat.s;
      this.q = paramThreeDFormat.q;
      this.r = paramThreeDFormat.r;
      this.p = paramThreeDFormat.p;
    }
  }
  
  boolean h()
  {
    if ((this.k != null) && (this.k.g != 0)) {
      return true;
    }
    if ((this.l != null) && (this.l.a() != 27)) {
      return true;
    }
    return this.n != null;
  }
  
  boolean i()
  {
    if (this.i != 0) {
      return true;
    }
    if (this.g != 0) {
      return true;
    }
    if (this.e != 0) {
      return true;
    }
    if (getMaterial() != 14) {
      return true;
    }
    if (g() != 0) {
      return true;
    }
    if (d() != 0) {
      return true;
    }
    if (this.f != null) {
      return true;
    }
    return this.d != null;
  }
  
  boolean a(ThreeDFormat paramThreeDFormat)
  {
    if (this.i != paramThreeDFormat.i) {
      return false;
    }
    if (!zw.b(this.h, paramThreeDFormat.h)) {
      return false;
    }
    if (this.e != paramThreeDFormat.e) {
      return false;
    }
    if (this.g != paramThreeDFormat.g) {
      return false;
    }
    if ((this.d != null) || (paramThreeDFormat.d != null)) {
      if ((this.d != null) && (paramThreeDFormat.d != null))
      {
        if (!this.d.g(paramThreeDFormat.d)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.f != null) || (paramThreeDFormat.f != null)) {
      if ((this.f != null) && (paramThreeDFormat.f != null))
      {
        if (!this.f.g(paramThreeDFormat.f)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if (this.c != paramThreeDFormat.c) {
      return false;
    }
    if (this.t != paramThreeDFormat.t) {
      return false;
    }
    if (this.s != paramThreeDFormat.s) {
      return false;
    }
    if (this.u != paramThreeDFormat.u) {
      return false;
    }
    if (this.q != paramThreeDFormat.q) {
      return false;
    }
    if (this.p != paramThreeDFormat.p) {
      return false;
    }
    return this.r == paramThreeDFormat.r;
  }
  
  private void m()
  {
    if (this.k == null) {
      j().a(46);
    }
    if (this.l == null)
    {
      k().a(25);
      k().b(5);
    }
  }
  
  public double getLightAngle()
  {
    if (this.l == null) {
      return 0.0D;
    }
    return zbxp.d(this.l.e());
  }
  
  public void setLightAngle(double value)
  {
    m();
    k().e(zbxp.h(value));
  }
  
  public int getLighting()
  {
    if (this.l == null) {
      return 27;
    }
    return this.l.a();
  }
  
  public void setLighting(int value)
  {
    m();
    k().a(value);
  }
  
  public int getLightingDirection()
  {
    if (this.l == null) {
      return 5;
    }
    return this.l.b();
  }
  
  public void setLightingDirection(int value)
  {
    m();
    k().b(value);
  }
  
  public double getPerspective()
  {
    if (this.k != null) {
      return zbxp.d(this.k.b());
    }
    return 0.0D;
  }
  
  public void setPerspective(double value)
  {
    m();
    j().d(zbxp.h(value));
  }
  
  public double getRotationX()
  {
    return zbxp.d(j().d());
  }
  
  public void setRotationX(double value)
  {
    j().f(zbxp.h(value));
  }
  
  public double getRotationY()
  {
    return zbxp.d(j().c());
  }
  
  public void setRotationY(double value)
  {
    j().e(zbxp.h(value));
  }
  
  public double getRotationZ()
  {
    return zbxp.d(j().e());
  }
  
  public void setRotationZ(double value)
  {
    j().g(zbxp.h(value));
  }
  
  public int getPresetCameraType()
  {
    if ((this.k == null) || (!this.k.h(1))) {
      return 46;
    }
    return this.k.a();
  }
  
  public void setPresetCameraType(int value)
  {
    j().b(value);
    j().a(value);
  }
  
  zbeq j()
  {
    if (this.k == null) {
      this.k = new zbeq();
    }
    return this.k;
  }
  
  zani k()
  {
    if (this.l == null) {
      this.l = new zani();
    }
    return this.l;
  }
  
  zcg l()
  {
    if (this.n == null) {
      this.n = new zcg();
    }
    return this.n;
  }
  
  void b(ThreeDFormat paramThreeDFormat, CopyOptions paramCopyOptions)
  {
    this.j = paramThreeDFormat.j;
    if (this.j == null)
    {
      if (paramThreeDFormat.n != null)
      {
        this.n = new zcg();
        l().a(paramThreeDFormat.n);
      }
      if (paramThreeDFormat.l != null)
      {
        this.l = new zani();
        this.l.a(paramThreeDFormat.l);
      }
      if (paramThreeDFormat.k != null)
      {
        this.k = new zbeq();
        this.k.a(paramThreeDFormat.k);
      }
      this.m = paramThreeDFormat.m;
    }
  }
  
  boolean b(ThreeDFormat paramThreeDFormat)
  {
    if ((this.n != null) || (paramThreeDFormat.n != null)) {
      if ((this.n != null) && (paramThreeDFormat.n != null))
      {
        if (!this.n.b(paramThreeDFormat.n)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.l != null) || (paramThreeDFormat.l != null)) {
      if ((this.l != null) && (paramThreeDFormat.l != null))
      {
        if (!this.l.b(paramThreeDFormat.l)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.k != null) || (paramThreeDFormat.k != null)) {
      if ((this.k != null) && (paramThreeDFormat.k != null))
      {
        if (!this.k.b(paramThreeDFormat.k)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    return zw.b(this.m, paramThreeDFormat.m);
  }
  
  void c(ThreeDFormat paramThreeDFormat, CopyOptions paramCopyOptions)
  {
    b(paramThreeDFormat, paramCopyOptions);
    a(paramThreeDFormat, paramCopyOptions);
  }
  
  public boolean equals(Object obj)
  {
    if (obj == null) {
      return false;
    }
    ThreeDFormat localThreeDFormat = (ThreeDFormat)obj;
    if (!localThreeDFormat.a(localThreeDFormat)) {
      return false;
    }
    return localThreeDFormat.b(localThreeDFormat);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ThreeDFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */