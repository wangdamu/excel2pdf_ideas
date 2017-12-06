package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

public class ChartPoint
{
  private Series b;
  private zpz c;
  int a;
  private DataLabels d;
  private Object e = null;
  private Object f = null;
  private ShapePropertyCollection g;
  private float h;
  private float i;
  private float j;
  private float k;
  private float l;
  private float m;
  private float n;
  private ArrayList o = new ArrayList();
  private ArrayList p = new ArrayList();
  private ArrayList q = new ArrayList();
  
  ChartPoint(Series series, int index)
  {
    this.b = series;
    this.a = index;
  }
  
  Series a()
  {
    return this.b;
  }
  
  int b()
  {
    return this.b.getType();
  }
  
  zpz c()
  {
    if (this.c == null)
    {
      this.c = new zpz(this);
      CopyOptions localCopyOptions = new CopyOptions(0);
      if (this.b.h() != null) {
        this.c.a(this.b.g(), localCopyOptions);
      } else if (this.b.u().e() != null) {
        this.c.a(this.b.u().d(), localCopyOptions);
      }
    }
    return this.c;
  }
  
  void a(zpz paramzpz)
  {
    this.c = paramzpz;
  }
  
  public int getExplosion()
  {
    if ((this.c != null) && (c().i() != null)) {
      return c().l().a();
    }
    if (this.b != null) {
      return this.b.getExplosion();
    }
    return 0;
  }
  
  public void setExplosion(int value)
  {
    if ((ChartCollection.c(b())) || (ChartCollection.m(b()))) {
      c().l().a(value);
    }
  }
  
  boolean d()
  {
    if ((this.c != null) && (c().i() != null)) {
      return false;
    }
    if (this.b != null) {
      return this.b.B();
    }
    return true;
  }
  
  public boolean getShadow()
  {
    if (this.c == null)
    {
      if (this.b.h() != null) {
        return this.b.g().q();
      }
      return false;
    }
    return c().q();
  }
  
  public void setShadow(boolean value)
  {
    c().f(value);
  }
  
  boolean e()
  {
    if (this.c == null) {
      return true;
    }
    return this.c.a();
  }
  
  public Line getBorder()
  {
    return c().f();
  }
  
  Line f()
  {
    if (this.c == null) {
      return null;
    }
    return c().g();
  }
  
  public Area getArea()
  {
    return c().e();
  }
  
  Area g()
  {
    if (this.c == null) {
      return null;
    }
    return c().h();
  }
  
  public Marker getMarker()
  {
    if ((h() == null) && (a() != null) && (a().w() != null))
    {
      Marker localMarker = c().j();
      localMarker.a(a().getMarker(), null);
    }
    return c().j();
  }
  
  Marker h()
  {
    if (this.c == null) {
      return null;
    }
    return c().k();
  }
  
  zkd i()
  {
    if (this.c == null) {
      return null;
    }
    return c().i();
  }
  
  /**
   * @deprecated
   */
  public int getMarkerStyle()
  {
    return getMarker().getMarkerStyle();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerStyle(int value)
  {
    getMarker().setMarkerStyle(value);
  }
  
  /**
   * @deprecated
   */
  public int getMarkerSize()
  {
    return getMarker().getMarkerSize();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerSize(int value)
  {
    if ((value >= 2) && (value <= 72)) {
      getMarker().setMarkerSize(value);
    }
  }
  
  /**
   * @deprecated
   */
  public Color getMarkerForegroundColor()
  {
    return getMarker().d();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerForegroundColor(Color value)
  {
    getMarker().a(value);
  }
  
  /**
   * @deprecated
   */
  public int getMarkerForegroundColorSetType()
  {
    return getMarker().e();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerForegroundColorSetType(int value)
  {
    getMarker().c(value);
  }
  
  /**
   * @deprecated
   */
  public Color getMarkerBackgroundColor()
  {
    return getMarker().f();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerBackgroundColor(Color value)
  {
    getMarker().b(value);
  }
  
  /**
   * @deprecated
   */
  public int getMarkerBackgroundColorSetType()
  {
    return getMarker().g();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerBackgroundColorSetType(int value)
  {
    getMarker().d(value);
  }
  
  public DataLabels getDataLabels()
  {
    if (this.d == null)
    {
      this.d = new DataLabels(this, this.b.i().e());
      CopyOptions localCopyOptions = new CopyOptions(0);
      if (this.b.r() != null)
      {
        this.d.a(this.b.getDataLabels(), localCopyOptions);
        this.d.m = false;
      }
    }
    return this.d;
  }
  
  DataLabels j()
  {
    return this.d;
  }
  
  public Object getYValue()
  {
    return this.e;
  }
  
  public void setYValue(Object value)
  {
    this.e = value;
  }
  
  public Object getXValue()
  {
    return this.f;
  }
  
  public void setXValue(Object value)
  {
    this.f = value;
  }
  
  void a(ChartPoint paramChartPoint, CopyOptions paramCopyOptions)
  {
    this.a = paramChartPoint.a;
    if (paramChartPoint.c != null)
    {
      this.c = new zpz(this);
      this.c.a(paramChartPoint.c, paramCopyOptions);
    }
    if (paramChartPoint.d != null)
    {
      this.d = new DataLabels(this, this.b.i().e());
      this.d.a(paramChartPoint.d, paramCopyOptions);
    }
    if (paramChartPoint.g != null)
    {
      this.g = new ShapePropertyCollection(a().u().a().a(), this, 5);
      this.g.a(paramChartPoint.g, paramCopyOptions);
    }
  }
  
  public ShapePropertyCollection getShapeProperties()
  {
    if (this.g == null) {
      this.g = new ShapePropertyCollection(a().u().a().a(), this, 5);
    }
    return this.g;
  }
  
  public boolean isInSecondaryPlot()
  {
    if ((a().getType() != 46) && (a().getType() != 49)) {
      return false;
    }
    if (getYValue() == null) {
      a().n();
    }
    Series localSeries = a();
    ChartPointCollection localChartPointCollection = localSeries.getPoints();
    int i1 = a().getPoints().getCount() - 1;
    double d1 = 0.0D;
    if (this.a >= i1) {
      return false;
    }
    for (int i2 = 0; i2 < i1; i2++) {
      d1 += Math.abs(ze.g(localChartPointCollection.get(i2).getYValue()));
    }
    if (localSeries.getSplitType() == 3)
    {
      if ((localSeries.A() == null) || (localSeries.A().length == 0)) {
        return false;
      }
      for (i2 = 0; i2 < localSeries.A().length; i2++) {
        if (this.a == localSeries.A()[i2]) {
          return true;
        }
      }
    }
    else if (localSeries.getSplitType() == 2)
    {
      if (ze.g(getYValue()) / d1 * 100.0D < localSeries.getSplitValue()) {
        return true;
      }
    }
    else if (localSeries.getSplitType() == 1)
    {
      if (ze.g(getYValue()) < localSeries.getSplitValue()) {
        return true;
      }
    }
    else
    {
      if (localSeries.getSplitType() == 0)
      {
        i2 = (int)localSeries.getSplitValue();
        if (i2 > i1) {
          i2 = i1;
        }
      }
      else
      {
        i2 = (int)Math.ceil(i1 / 3.0F);
      }
      if (this.a >= i1 - i2) {
        return true;
      }
    }
    return false;
  }
  
  public void setInSecondaryPlot(boolean value)
  {
    boolean bool = isInSecondaryPlot();
    if (bool != value)
    {
      Series localSeries = a();
      localSeries.setSplitType(3);
      ArrayList localArrayList = new ArrayList();
      for (int i1 = 0; i1 < localSeries.getPoints().getCount(); i1++) {
        if (localSeries.getPoints().get(i1).isInSecondaryPlot()) {
          zf.a(localArrayList, Integer.valueOf(localSeries.getPoints().get(i1).a));
        }
      }
      if ((value) && (!localArrayList.contains(Integer.valueOf(this.a)))) {
        zf.a(localArrayList, Integer.valueOf(this.a));
      }
      if ((!value) && (localArrayList.contains(Integer.valueOf(this.a)))) {
        localArrayList.remove(this.a);
      }
      if (localArrayList.size() > 0)
      {
        int[] arrayOfInt = new int[localArrayList.size()];
        for (int i2 = 0; i2 < localArrayList.size(); i2++) {
          arrayOfInt[i2] = ze.f(localArrayList.get(i2));
        }
        localSeries.a(arrayOfInt);
      }
      else
      {
        localSeries.a(null);
      }
    }
  }
  
  public int getShapeX()
  {
    return (int)(this.h * 4000.0F / k().getChartObject().getWidth() + 0.5D);
  }
  
  public int getShapeY()
  {
    return (int)(this.i * 4000.0F / k().getChartObject().getHeight() + 0.5D);
  }
  
  public int getShapeWidth()
  {
    return (int)(this.j * 4000.0F / k().getChartObject().getWidth() + 0.5D);
  }
  
  public int getShapeHeight()
  {
    return (int)(this.k * 4000.0F / k().getChartObject().getHeight() + 0.5D);
  }
  
  private Chart k()
  {
    return this.b.u().a().a();
  }
  
  public int getShapeXPx()
  {
    return (int)(this.h + 0.5D);
  }
  
  public int getShapeYPx()
  {
    return (int)(this.i + 0.5D);
  }
  
  public int getShapeWidthPx()
  {
    return (int)(this.j + 0.5D);
  }
  
  public int getShapeHeightPx()
  {
    return (int)(this.k + 0.5D);
  }
  
  public int getBorderWidthPx()
  {
    return (int)(getBorder().getWeightPt() * zbxp.a() / 72.0D + 0.5D);
  }
  
  public int getRadiusPx()
  {
    return (int)(this.j + 0.5D);
  }
  
  public int getInnerRadiusPx()
  {
    return (int)(this.l + 0.5D);
  }
  
  public float getStartAngle()
  {
    return this.m;
  }
  
  public float getEndAngle()
  {
    return this.n;
  }
  
  public float getArcStartPointXPx()
  {
    return a(getShapeXPx(), -getStartAngle(), getRadiusPx());
  }
  
  public float getArcStartPointYPx()
  {
    return b(getShapeYPx(), -getStartAngle(), getRadiusPx());
  }
  
  public float getArcEndPointXPx()
  {
    return a(getShapeXPx(), -getEndAngle(), getRadiusPx());
  }
  
  public float getArcEndPointYPx()
  {
    return b(getShapeYPx(), -getEndAngle(), getRadiusPx());
  }
  
  public float getInnerArcStartPointXPx()
  {
    return a(getShapeXPx(), -getStartAngle(), getInnerRadiusPx());
  }
  
  public float getInnerArcStartPointYPx()
  {
    return b(getShapeYPx(), -getStartAngle(), getInnerRadiusPx());
  }
  
  public float getInnerArcEndPointXPx()
  {
    return a(getShapeXPx(), -getEndAngle(), getInnerRadiusPx());
  }
  
  public float getInnerArcEndPointYPx()
  {
    return b(getShapeYPx(), -getEndAngle(), getInnerRadiusPx());
  }
  
  void a(float paramFloat1, float paramFloat2)
  {
    this.h = paramFloat1;
    this.i = paramFloat2;
  }
  
  void b(float paramFloat1, float paramFloat2)
  {
    this.j = paramFloat1;
    this.k = paramFloat2;
  }
  
  void c(float paramFloat1, float paramFloat2)
  {
    this.m = paramFloat1;
    this.n = paramFloat2;
  }
  
  void a(float paramFloat)
  {
    this.l = paramFloat;
  }
  
  private float a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d1 = paramDouble2 * 3.141592653589793D / 180.0D % 6.283185307179586D;
    double d2 = paramDouble3 * Math.cos(d1);
    d2 = paramDouble1 + d2;
    return (float)d2;
  }
  
  private float b(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d1 = paramDouble2 * 3.141592653589793D / 180.0D % 6.283185307179586D;
    double d2 = paramDouble3 * Math.sin(d1);
    d2 = paramDouble1 - d2;
    return (float)d2;
  }
  
  public int getTopPointCount()
  {
    return this.o.size();
  }
  
  public float getTopPointXPx(int index)
  {
    if (index >= getTopPointCount()) {
      throw new CellsException(0, "index must be less than GetTopPointCount()");
    }
    return ((zo)this.o.get(index)).d();
  }
  
  public float getTopPointYPx(int index)
  {
    if (index >= getTopPointCount()) {
      throw new CellsException(0, "index must be less than GetTopPointCount()");
    }
    return ((zo)this.o.get(index)).e();
  }
  
  public int getBottomPointCount()
  {
    return this.p.size();
  }
  
  public float getBottomPointXPx(int index)
  {
    if (index >= getBottomPointCount()) {
      throw new CellsException(0, "index must be less than GetBottomPointCount()");
    }
    return ((zo)this.p.get(index)).d();
  }
  
  public float getBottomPointYPx(int index)
  {
    if (index >= getBottomPointCount()) {
      throw new CellsException(0, "index must be less than GetBottomPointCount()");
    }
    return ((zo)this.p.get(index)).e();
  }
  
  void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    for (int i1 = 0; i1 < paramArrayList1.size(); i1++) {
      zf.a(this.o, new zo(((zo)paramArrayList1.get(i1)).d(), ((zo)paramArrayList1.get(i1)).e()));
    }
    for (i1 = 0; i1 < paramArrayList2.size(); i1++) {
      zf.a(this.p, new zo(((zo)paramArrayList2.get(i1)).d(), ((zo)paramArrayList2.get(i1)).e()));
    }
  }
  
  public int getOnCategoryAxisPointCount()
  {
    return this.q.size();
  }
  
  public float getOnCategoryAxisPointXPx(int index)
  {
    if (index >= getOnCategoryAxisPointCount()) {
      throw new CellsException(0, "index must be less than GetOnCategoryAxisPointCount()");
    }
    return ((zo)this.q.get(index)).d();
  }
  
  public float getOnCategoryAxisPointYPx(int index)
  {
    if (index >= getOnCategoryAxisPointCount()) {
      throw new CellsException(0, "index must be less than GetOnCategoryAxisPointCount()");
    }
    return ((zo)this.q.get(index)).e();
  }
  
  void a(ArrayList paramArrayList)
  {
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      zo localzo = (zo)paramArrayList.get(i1);
      zf.a(this.q, new zo(localzo.d(), localzo.e()));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ChartPoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */