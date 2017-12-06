package com.aspose.cells;

public class ShapePropertyCollection
{
  private Chart c;
  private Workbook d;
  Object a;
  int b;
  private zbqq e;
  private zbep f;
  private ztf g;
  private Format3D h;
  
  ShapePropertyCollection(Chart chart, Object parent, int parentFlag)
  {
    this.c = chart;
    this.d = chart.n().p();
    this.a = parent;
    this.b = parentFlag;
    o();
  }
  
  private void o()
  {
    boolean bool = false;
    Object localObject;
    if (this.b == 8)
    {
      localObject = (Series)this.a;
      bool = ((Series)localObject).getShadow();
    }
    else if (this.b == 5)
    {
      localObject = (ChartPoint)this.a;
      bool = ((ChartPoint)localObject).getShadow();
    }
    if ((bool) && (!h())) {
      a(true);
    }
  }
  
  Workbook a()
  {
    return this.d;
  }
  
  zbqq b()
  {
    return this.e;
  }
  
  zbqq c()
  {
    if (this.e == null) {
      this.e = new zbqq(this.d, this);
    }
    return this.e;
  }
  
  zbep d()
  {
    return this.f;
  }
  
  zbep e()
  {
    if (this.f == null) {
      this.f = new zbep(this);
    }
    return this.f;
  }
  
  ztf f()
  {
    return this.g;
  }
  
  ztf g()
  {
    if (this.g == null) {
      this.g = new ztf(this);
    }
    return this.g;
  }
  
  void a(ShapePropertyCollection paramShapePropertyCollection)
  {
    if (paramShapePropertyCollection.g != null)
    {
      this.g = new ztf(this);
      this.g.a(paramShapePropertyCollection.g, null);
    }
    if (paramShapePropertyCollection.e != null)
    {
      this.e = new zbqq(this.d, this);
      this.e.a(paramShapePropertyCollection.e);
    }
    if (paramShapePropertyCollection.f != null)
    {
      this.f = new zbep(this);
      this.f.a(paramShapePropertyCollection.f);
    }
  }
  
  void a(ShapePropertyCollection paramShapePropertyCollection, CopyOptions paramCopyOptions)
  {
    a(paramShapePropertyCollection);
    Object localObject;
    if (paramShapePropertyCollection.j() != null)
    {
      localObject = k();
      if (localObject != null) {
        ((Area)localObject).a(paramShapePropertyCollection.j(), paramCopyOptions);
      }
    }
    if (paramShapePropertyCollection.l() != null)
    {
      localObject = m();
      if (localObject != null) {
        ((Line)localObject).a(paramShapePropertyCollection.l());
      }
    }
  }
  
  boolean a(ShapePropertyCollection paramShapePropertyCollection, zmz paramzmz)
  {
    if ((this.g != null) || (paramShapePropertyCollection.g != null)) {
      if ((this.g != null) && (paramShapePropertyCollection.g != null))
      {
        if (!this.g.a(paramShapePropertyCollection.g)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.e != null) || (paramShapePropertyCollection.e != null)) {
      if ((this.e != null) && (paramShapePropertyCollection.e != null))
      {
        if (!this.e.b(paramShapePropertyCollection.e)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.f != null) || (paramShapePropertyCollection.f != null)) {
      if ((this.f != null) && (paramShapePropertyCollection.f != null))
      {
        if (!this.f.b(paramShapePropertyCollection.f)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((j() != null) || (paramShapePropertyCollection.j() != null)) {
      if ((j() != null) && (paramShapePropertyCollection.j() != null))
      {
        if (!j().a(paramShapePropertyCollection.j(), paramzmz)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((l() != null) || (paramShapePropertyCollection.l() != null)) {
      if ((l() != null) && (paramShapePropertyCollection.l() != null))
      {
        if (!l().b(paramShapePropertyCollection.l())) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    return true;
  }
  
  boolean h()
  {
    return (this.g != null) && (this.g.k());
  }
  
  void a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.g = null;
      return;
    }
    g().a(paramBoolean);
  }
  
  void i()
  {
    c().a(2);
  }
  
  Area j()
  {
    switch (this.b)
    {
    case 8: 
      if (a((Series)this.a)) {
        return null;
      }
      return ((Series)this.a).e();
    case 11: 
    case 17: 
      return ((ChartFrame)this.a).h();
    case 5: 
      if (a((ChartPoint)this.a)) {
        return null;
      }
      return ((ChartPoint)this.a).g();
    case 9: 
      return ((DropBars)this.a).b();
    case 10: 
      return (Area)this.a;
    case 4: 
      return ((Marker)this.a).b();
    case 0: 
      return ((Axis)this.a).d();
    case 18: 
      return ((zju)this.a).d();
    }
    return null;
  }
  
  private boolean a(ChartPoint paramChartPoint)
  {
    int i = paramChartPoint.a().u().j();
    return a(i);
  }
  
  private boolean a(Series paramSeries)
  {
    int i = paramSeries.u().j();
    return a(i);
  }
  
  private boolean a(int paramInt)
  {
    int i = (ChartCollection.n(paramInt)) || (ChartCollection.r(paramInt)) ? 1 : 0;
    boolean bool = ChartCollection.k(paramInt);
    return ((i != 0) && (paramInt != 43)) || (bool) || (paramInt == 57) || (paramInt == 58);
  }
  
  Area k()
  {
    switch (this.b)
    {
    case 8: 
      if (a((Series)this.a)) {
        return null;
      }
      return ((Series)this.a).getArea();
    case 11: 
    case 17: 
      return ((ChartFrame)this.a).getArea();
    case 5: 
      return ((ChartPoint)this.a).getArea();
    case 9: 
      return ((DropBars)this.a).getArea();
    case 10: 
      return (Area)this.a;
    case 4: 
      return ((Marker)this.a).getArea();
    case 0: 
      return ((Axis)this.a).getArea();
    case 18: 
      return ((zju)this.a).c();
    }
    return null;
  }
  
  Line l()
  {
    switch (this.b)
    {
    case 8: 
      return ((Series)this.a).f();
    case 0: 
      return ((Axis)this.a).i();
    case 1: 
      return ((Axis)this.a).o();
    case 2: 
      return ((Axis)this.a).p();
    case 3: 
      return ((ChartDataTable)this.a).c();
    case 11: 
    case 17: 
      return ((ChartFrame)this.a).g();
    case 13: 
      return ((zka)this.a).Q();
    case 14: 
      return ((zka)this.a).R();
    case 15: 
      return ((zka)this.a).P();
    case 16: 
      return ((Series)this.a).D();
    case 12: 
      return ((zka)this.a).S();
    case 5: 
      return ((ChartPoint)this.a).f();
    case 9: 
      return ((DropBars)this.a).a();
    case 7: 
      return (Line)this.a;
    case 10: 
      return ((Floor)this.a).getBorder();
    case 4: 
      return ((Marker)this.a).c();
    case 6: 
      return (Line)this.a;
    case 18: 
      return ((zju)this.a).b();
    }
    return null;
  }
  
  Line m()
  {
    switch (this.b)
    {
    case 8: 
      return ((Series)this.a).getBorder();
    case 0: 
      return ((Axis)this.a).getAxisLine();
    case 1: 
      return ((Axis)this.a).getMajorGridLines();
    case 2: 
      return ((Axis)this.a).getMinorGridLines();
    case 3: 
      return ((ChartDataTable)this.a).getBorder();
    case 11: 
    case 17: 
      return ((ChartFrame)this.a).getBorder();
    case 13: 
      return ((zka)this.a).s();
    case 14: 
      return ((zka)this.a).o();
    case 15: 
      return ((zka)this.a).O();
    case 16: 
      return ((Series)this.a).getLeaderLines();
    case 12: 
      return ((zka)this.a).q();
    case 5: 
      return ((ChartPoint)this.a).getBorder();
    case 9: 
      return ((DropBars)this.a).getBorder();
    case 7: 
      return (Line)this.a;
    case 10: 
      return ((Floor)this.a).getBorder();
    case 4: 
      return ((Marker)this.a).getBorder();
    case 6: 
      return (Line)this.a;
    case 18: 
      return ((zju)this.a).a();
    }
    return null;
  }
  
  public GlowEffect getGlowEffect()
  {
    return g().e();
  }
  
  public void clearGlowEffect()
  {
    if (this.g != null) {
      this.g.a(null);
    }
  }
  
  public boolean hasGlowEffect()
  {
    return (this.g != null) && (this.g.f() != null) && (this.g.f().a());
  }
  
  public Format3D getFormat3D()
  {
    if (this.h == null) {
      this.h = new Format3D(this);
    }
    return this.h;
  }
  
  public boolean hasFormat3D()
  {
    return (this.f != null) && (this.e != null);
  }
  
  public void clearFormat3D()
  {
    this.f = null;
    this.e = null;
  }
  
  public double getSoftEdgeRadius()
  {
    if (this.g == null) {
      return 0.0D;
    }
    return g().n();
  }
  
  public void setSoftEdgeRadius(double value)
  {
    g().a(value);
  }
  
  public ShadowEffect getShadowEffect()
  {
    return g().h();
  }
  
  void n()
  {
    g().j();
  }
  
  public void clearShadowEffect()
  {
    if (this.g != null) {
      this.g.g();
    }
  }
  
  public boolean hasShadowEffect()
  {
    if (this.g == null) {
      return false;
    }
    return this.g.i();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapePropertyCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */