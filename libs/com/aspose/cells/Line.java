package com.aspose.cells;

import com.aspose.cells.b.a.zr;

public class Line
{
  protected Object m_lineParent;
  private Workbook a;
  private Chart d;
  private zkj e;
  zaml b;
  int c;
  private int f = 0;
  private GradientFill g;
  
  Line(Chart chart, Object parent)
  {
    this.d = chart;
    this.m_lineParent = parent;
    if (chart != null) {
      this.a = chart.n().p();
    }
    this.b = new zaml(true);
  }
  
  zkj f()
  {
    return this.e;
  }
  
  zkj g()
  {
    if (this.e == null) {
      this.e = new zkj();
    }
    return this.e;
  }
  
  public int getCompoundType()
  {
    if (this.e != null)
    {
      Object localObject = this.e.a(0);
      if (localObject != null) {
        return ((Integer)localObject).intValue();
      }
    }
    return 0;
  }
  
  public void setCompoundType(int value)
  {
    b(value);
    a(value);
  }
  
  void b(int paramInt)
  {
    g().a(0, Integer.valueOf(paramInt));
    j();
  }
  
  private void a(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().b(paramInt);
      }
    }
  }
  
  public int getDashType()
  {
    Object localObject = g().a(1);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    return 6;
  }
  
  public void setDashType(int value)
  {
    c(value);
    o(value);
  }
  
  void c(int paramInt)
  {
    g().a(1, Integer.valueOf(paramInt));
    j();
  }
  
  private void o(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().c(paramInt);
      }
    }
  }
  
  private Series a()
  {
    if (!(this.m_lineParent instanceof zpz)) {
      return null;
    }
    zpz localzpz = (zpz)this.m_lineParent;
    if (!(localzpz.t() instanceof Series)) {
      return null;
    }
    Series localSeries = (Series)localzpz.t();
    return localSeries;
  }
  
  public int getCapType()
  {
    Object localObject = g().a(2);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    return b();
  }
  
  public void setCapType(int value)
  {
    d(value);
    p(value);
  }
  
  private int b()
  {
    Series localSeries = null;
    if ((this.m_lineParent instanceof zpz))
    {
      zpz localzpz = (zpz)this.m_lineParent;
      if ((localzpz.t() instanceof Series)) {
        localSeries = (Series)localzpz.t();
      } else if ((localzpz.t() instanceof ChartPoint)) {
        localSeries = ((ChartPoint)localzpz.t()).a();
      }
    }
    if (localSeries != null)
    {
      switch (localSeries.getType())
      {
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 57: 
      case 58: 
      case 61: 
      case 62: 
      case 63: 
      case 64: 
        return 1;
      }
      return 2;
    }
    return 2;
  }
  
  void d(int paramInt)
  {
    g().a(2, Integer.valueOf(paramInt));
    j();
  }
  
  private void p(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().d(paramInt);
      }
    }
  }
  
  public int getJoinType()
  {
    Object localObject = g().a(3);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    return 0;
  }
  
  public void setJoinType(int value)
  {
    e(value);
    q(value);
  }
  
  void e(int paramInt)
  {
    g().a(3, Integer.valueOf(paramInt));
    j();
  }
  
  private void q(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().e(paramInt);
      }
    }
  }
  
  public int getBeginType()
  {
    Object localObject = g().a(4);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    return 0;
  }
  
  public void setBeginType(int value)
  {
    f(value);
    r(value);
  }
  
  void f(int paramInt)
  {
    g().a(4, Integer.valueOf(paramInt));
  }
  
  private void r(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().f(paramInt);
      }
    }
  }
  
  public int getEndType()
  {
    Object localObject = g().a(7);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    return 0;
  }
  
  public void setEndType(int value)
  {
    g(value);
    s(value);
  }
  
  void g(int paramInt)
  {
    g().a(7, Integer.valueOf(paramInt));
  }
  
  private void s(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().g(paramInt);
      }
    }
  }
  
  public int getBeginArrowLength()
  {
    Object localObject = g().a(6);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    return 1;
  }
  
  public void setBeginArrowLength(int value)
  {
    h(value);
    t(value);
  }
  
  void h(int paramInt)
  {
    g().a(6, Integer.valueOf(paramInt));
  }
  
  private void t(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().h(paramInt);
      }
    }
  }
  
  public int getEndArrowLength()
  {
    Object localObject = g().a(9);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    return 1;
  }
  
  public void setEndArrowLength(int value)
  {
    i(value);
    u(value);
  }
  
  void i(int paramInt)
  {
    g().a(9, Integer.valueOf(paramInt));
  }
  
  private void u(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().i(paramInt);
      }
    }
  }
  
  public int getBeginArrowWidth()
  {
    Object localObject = g().a(5);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    return 1;
  }
  
  public void setBeginArrowWidth(int value)
  {
    j(value);
    v(value);
  }
  
  void j(int paramInt)
  {
    g().a(5, Integer.valueOf(paramInt));
  }
  
  private void v(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().j(paramInt);
      }
    }
  }
  
  public int getEndArrowWidth()
  {
    Object localObject = g().a(8);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    return 1;
  }
  
  public void setEndArrowWidth(int value)
  {
    k(value);
    w(value);
  }
  
  void k(int paramInt)
  {
    g().a(8, Integer.valueOf(paramInt));
  }
  
  private void w(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().k(paramInt);
      }
    }
  }
  
  void a(Color paramColor)
  {
    if (paramColor.isEmpty()) {
      this.b.a(0, 0);
    } else {
      this.b.a(2, paramColor.toArgb());
    }
    j();
    this.f |= 0x400;
  }
  
  public Color getColor()
  {
    return this.b.a(this.a, this.d);
  }
  
  public void setColor(Color value)
  {
    b(value);
    c(value);
  }
  
  boolean h()
  {
    return this.b.i();
  }
  
  void b(Color paramColor)
  {
    if (paramColor.isEmpty())
    {
      this.b.a(0, 0);
    }
    else
    {
      this.b.a(2, paramColor.toArgb());
      if ((getFormattingType() == 2) || (getFormattingType() == 0)) {
        n(1);
      }
    }
    j();
    this.f |= 0x400;
  }
  
  private void c(Color paramColor)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().b(paramColor);
      }
    }
  }
  
  int i()
  {
    return zaml.e(this.b);
  }
  
  void l(int paramInt)
  {
    this.b = zaml.a(this.b, paramInt);
  }
  
  public double getTransparency()
  {
    return zr.b((100 - i()) / 100.0D, 2);
  }
  
  public void setTransparency(double value)
  {
    b(value);
    a(value);
  }
  
  void b(double paramDouble)
  {
    if ((paramDouble < 0.0D) || (paramDouble > 1.0D)) {
      throw new CellsException(6, "Transparency must between 0.0 (opaque) and 1.0 (clear)");
    }
    l(100 - (int)(paramDouble * 100.0D));
  }
  
  private void a(double paramDouble)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().b(paramDouble);
      }
    }
  }
  
  void j()
  {
    if (this.m_lineParent != null) {
      if ((this.m_lineParent instanceof ChartFrame)) {
        ((ChartFrame)this.m_lineParent).a(null);
      } else if ((this.m_lineParent instanceof zpz)) {
        ((zpz)this.m_lineParent).a(null);
      }
    }
    if (getFormattingType() == 0) {
      n(1);
    }
  }
  
  public int getStyle()
  {
    if ((f() != null) && (getDashType() != 6)) {
      switch (getDashType())
      {
      case 0: 
      case 3: 
      case 4: 
        return 1;
      case 1: 
        return 3;
      case 2: 
        return 4;
      case 5: 
      case 7: 
        return 2;
      }
    }
    switch ((this.f & 0xF0) >> 4)
    {
    case 6: 
      return 6;
    case 1: 
      return 1;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 2: 
      return 2;
    case 8: 
      return 8;
    case 7: 
      return 7;
    case 0: 
      return 0;
    }
    return 0;
  }
  
  public void setStyle(int value)
  {
    m(value);
    x(value);
  }
  
  void m(int paramInt)
  {
    this.f &= 0xFF0F;
    if ((f() != null) && (getDashType() != 6)) {
      c(6);
    }
    setVisible(true);
    switch (paramInt)
    {
    case 6: 
      this.f |= 0x60;
      break;
    case 1: 
      this.f |= 0x10;
      c(0);
      break;
    case 3: 
      this.f |= 0x30;
      c(1);
      break;
    case 4: 
      this.f |= 0x40;
      c(2);
      break;
    case 2: 
      this.f |= 0x20;
      c(7);
      break;
    case 8: 
      this.f |= 0x80;
      break;
    case 7: 
      this.f |= 0x70;
      break;
    }
    j();
    this.f |= 0x800;
  }
  
  private void x(int paramInt)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().m(paramInt);
      }
    }
  }
  
  public int getWeight()
  {
    if (this.c <= 3175) {
      return -1;
    }
    if (this.c <= 12700) {
      return 0;
    }
    if (this.c <= 25400) {
      return 1;
    }
    return 2;
  }
  
  public void setWeight(int value)
  {
    switch (value)
    {
    case -1: 
      this.c = 3175;
      break;
    case 0: 
      this.c = 12700;
      break;
    case 1: 
      this.c = 25400;
      break;
    case 2: 
      this.c = 38100;
      break;
    }
    j();
    this.f |= 0x200;
  }
  
  public double getWeightPt()
  {
    return this.c / znq.j;
  }
  
  public void setWeightPt(double value)
  {
    c(value);
    d(value);
  }
  
  void c(double paramDouble)
  {
    this.c = ((int)(paramDouble * znq.j + 0.5D));
    j();
    this.f |= 0x200;
  }
  
  private void d(double paramDouble)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().c(paramDouble);
      }
    }
  }
  
  public double getWeightPx()
  {
    int i = 96;
    if (this.a != null) {
      i = zbxp.a();
    }
    return (int)(getWeightPt() * i / 72.0D + 0.5D);
  }
  
  public void setWeightPx(double value)
  {
    int i = 96;
    if (this.a != null) {
      i = zbxp.a();
    }
    setWeightPt(value * 72.0D / i);
  }
  
  public int getFormattingType()
  {
    switch (this.f & 0xF)
    {
    case 0: 
      return 0;
    case 1: 
      return 2;
    case 2: 
      return 1;
    case 3: 
      return 3;
    }
    return 0;
  }
  
  public void setFormattingType(int value)
  {
    n(value);
  }
  
  void n(int paramInt)
  {
    this.f &= 0xFFFFFFF0;
    switch (paramInt)
    {
    case 0: 
      break;
    case 2: 
      this.f |= 0x1;
      break;
    case 1: 
      this.f |= 0x2;
      break;
    case 3: 
      this.f |= 0x3;
      break;
    }
    this.f |= 0x100;
  }
  
  boolean k()
  {
    return (this.f & 0x200) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f |= 0x400;
    } else {
      this.f &= 0xFBFF;
    }
  }
  
  public boolean isAutomaticColor()
  {
    return (this.f & 0x400) == 0;
  }
  
  public boolean isVisible()
  {
    return getFormattingType() != 2;
  }
  
  public void setVisible(boolean value)
  {
    n(value ? 0 : 2);
    j();
  }
  
  public boolean isAuto()
  {
    return getFormattingType() == 0;
  }
  
  public void setAuto(boolean value)
  {
    c(value);
    a(value);
  }
  
  void c(boolean paramBoolean)
  {
    n(paramBoolean ? 0 : 1);
  }
  
  private void a(boolean paramBoolean)
  {
    Series localSeries = a();
    if ((localSeries != null) && (localSeries.c() != null))
    {
      ChartPointCollection localChartPointCollection = localSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        localChartPoint.getBorder().c(paramBoolean);
      }
    }
  }
  
  public GradientFill getGradientFill()
  {
    if (getFormattingType() == 3)
    {
      if (this.g == null) {
        this.g = new GradientFill(this, this.a);
      }
      return this.g;
    }
    return null;
  }
  
  void a(Line paramLine)
  {
    if ((paramLine.b.c() == 2) && (paramLine.a != this.a)) {
      this.b.a(2, paramLine.b.c(paramLine.a));
    } else {
      this.b.f(paramLine.b);
    }
    if (paramLine.e != null)
    {
      this.e = new zkj();
      this.e.a(paramLine.e);
    }
    if (paramLine.g != null)
    {
      this.g = new GradientFill(this, this.a);
      this.g.a(paramLine.g, null);
    }
    this.c = paramLine.c;
    this.f = paramLine.f;
  }
  
  boolean b(Line paramLine)
  {
    if (!this.b.g(paramLine.b)) {
      return false;
    }
    if ((this.e != null) || (paramLine.e != null))
    {
      if (this.e == null) {
        this.e = new zkj();
      }
      if ((this.e != null) && (paramLine.e != null))
      {
        if (!this.e.b(paramLine.e)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.g != null) || (paramLine.g != null)) {
      if ((this.g != null) && (paramLine.g != null))
      {
        if (!this.g.a(paramLine.g)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if (this.c != paramLine.c) {
      return false;
    }
    return this.f == paramLine.f;
  }
  
  void a(LineFormat paramLineFormat)
  {
    if (paramLineFormat == null) {
      return;
    }
    if (paramLineFormat.e(1)) {
      b(paramLineFormat.getCompoundType());
    }
    if (paramLineFormat.e(3)) {
      d(paramLineFormat.getCapType());
    }
    if (paramLineFormat.e(0)) {
      c(paramLineFormat.getWeight());
    }
  }
  
  void b(LineFormat paramLineFormat)
  {
    if (paramLineFormat.e(1)) {
      b(paramLineFormat.getCompoundType());
    }
    if (paramLineFormat.e(0)) {
      c(paramLineFormat.getWeight());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Line.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */