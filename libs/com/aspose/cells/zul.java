package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zul
  extends ztp
{
  private Chart b;
  private Workbook c;
  private zpe d;
  private HashMap e;
  private static final za f = new za(new String[] { "[SERIES NAME]", "[CATEGORY NAME]", "[VALUE]", "[CELLRANGE]", "[PERCENTAGE]" });
  
  zul(zpe paramzpe)
  {
    this.d = paramzpe;
    this.b = paramzpe.a;
    this.c = paramzpe.a().a;
  }
  
  private void d()
  {
    if (this.b.getLegend().F() != null)
    {
      this.e = new HashMap();
      int i = 0;
      int j = this.b.getNSeries().getCount();
      zkb localzkb = this.b.q();
      for (int k = 0; k < localzkb.getCount(); k++)
      {
        zka localzka = localzkb.a(k);
        for (int m = 0; m < this.b.getNSeries().getCount(); m++)
        {
          Series localSeries = this.b.getNSeries().get(m);
          if ((localSeries.u() == localzka) && (localSeries.getType() == localzka.j()))
          {
            this.e.put(Integer.valueOf(m), Integer.valueOf(i));
            localSeries.b(i);
            i++;
            if ((localSeries.q() != null) && (localSeries.q().getCount() > 0)) {
              for (int n = 0; n < localSeries.getTrendLines().getCount(); n++) {
                this.e.put(Integer.valueOf(localSeries.getTrendLines().get(n).d() + this.b.getNSeries().getCount()), Integer.valueOf(j++));
              }
            }
          }
        }
      }
    }
    else
    {
      this.e = null;
    }
    this.b.getNSeries().c();
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    d();
    paramzcjz.b(true);
    paramzcjz.c("c:chartSpace", null);
    paramzcjz.a("xmlns", "c", null, "http://schemas.openxmlformats.org/drawingml/2006/chart");
    paramzcjz.a("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
    paramzcjz.a("xmlns", "r", null, zaty.e);
    if ((this.b.e() != null) && (!"".equals(this.b.e()))) {
      a(paramzcjz, "lang", this.b.e());
    }
    a(paramzcjz, "roundedCorners", this.b.isRectangularCornered() ? "0" : "1");
    b(paramzcjz);
    if (this.b.getPivotSource() != null) {
      e(paramzcjz);
    }
    g(paramzcjz);
    a(paramzcjz, this.b.getChartArea().getShapeProperties());
    Font localFont = this.b.getChartArea().j();
    if ((localFont != null) && (localFont.f(11))) {
      a(paramzcjz, this.c, localFont, false, 0, null, false, false, 0);
    }
    f(paramzcjz);
    c(paramzcjz);
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
    this.b.c(false);
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    if ((this.b.a != null) && (this.b.a.e != null))
    {
      paramzcjz.d(this.b.a.e);
    }
    else if (this.b.a() != -1)
    {
      paramzcjz.b("mc:AlternateContent");
      paramzcjz.a("xmlns:mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
      paramzcjz.b("mc:Choice");
      paramzcjz.a("Requires", "c14");
      paramzcjz.a("xmlns:c14", "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
      a(paramzcjz, "c14", "style", zauj.z(this.b.a() + 100));
      paramzcjz.b();
      paramzcjz.b("mc:Fallback");
      a(paramzcjz, "style", zauj.z(this.b.a()));
      paramzcjz.b();
      paramzcjz.b();
    }
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    if (!e()) {
      return;
    }
    paramzcjz.b("c:extLst");
    if ((this.b.a != null) && (this.b.a.a() != null))
    {
      Iterator localIterator = this.b.a.b().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramzcjz.d(str);
      }
    }
    d(paramzcjz);
    paramzcjz.b();
  }
  
  private boolean e()
  {
    if ((this.b.a != null) && (this.b.a.a() != null)) {
      return true;
    }
    return this.b.h();
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    if (!this.b.getPivotOptions().a) {
      return;
    }
    paramzcjz.b("c:ext");
    paramzcjz.a("uri", "{781A3756-C4B2-4CAC-9D66-4F8BD8637D16}");
    paramzcjz.a("xmlns:c14", "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
    paramzcjz.b("c14:pivotOptions");
    paramzcjz.b("c14:dropZoneFilter");
    paramzcjz.a("val", this.b.getPivotOptions().DropZoneFilter ? "1" : "0");
    paramzcjz.b();
    paramzcjz.b("c14:dropZoneCategories");
    paramzcjz.a("val", this.b.getPivotOptions().DropZoneCategories ? "1" : "0");
    paramzcjz.b();
    paramzcjz.b("c14:dropZoneData");
    paramzcjz.a("val", this.b.getPivotOptions().DropZoneData ? "1" : "0");
    paramzcjz.b();
    paramzcjz.b("c14:dropZoneSeries");
    paramzcjz.a("val", this.b.getPivotOptions().DropZoneSeries ? "1" : "0");
    paramzcjz.b();
    paramzcjz.b("c14:dropZonesVisible");
    paramzcjz.a("val", this.b.getPivotOptions().DropZonesVisible ? "1" : "0");
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void e(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("c:pivotSource", null);
    paramzcjz.c("c:name", null);
    paramzcjz.a("[0]" + this.b.getPivotSource());
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void f(zcjz paramzcjz)
    throws Exception
  {
    if (this.d.d == null) {
      return;
    }
    paramzcjz.c("c:userShapes", null);
    paramzcjz.a("r:id", this.d.d.a);
    paramzcjz.b();
  }
  
  private void g(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("c:chart", null);
    if (this.b.r() != null)
    {
      Title localTitle = this.b.r();
      a(paramzcjz, localTitle);
      a(paramzcjz, "c", "autoTitleDeleted", localTitle.isDeleted() ? "1" : "0");
    }
    if ((this.b.a != null) && (this.b.a.f != null)) {
      paramzcjz.d(this.b.a.f);
    }
    h(paramzcjz);
    m(paramzcjz);
    o(paramzcjz);
    if (this.b.getPlotVisibleCells()) {
      a(paramzcjz, "plotVisOnly", "1");
    } else {
      a(paramzcjz, "plotVisOnly", "0");
    }
    a(paramzcjz, "dispBlanksAs", zauj.at(this.b.getPlotEmptyCellsType()));
    if (this.b.l()) {
      a(paramzcjz, "showDLblsOverMax", "1");
    } else {
      a(paramzcjz, "showDLblsOverMax", "0");
    }
    paramzcjz.b();
  }
  
  private void h(zcjz paramzcjz)
    throws Exception
  {
    if (!f()) {
      return;
    }
    l(paramzcjz);
    k(paramzcjz);
    i(paramzcjz);
    j(paramzcjz);
  }
  
  private void i(zcjz paramzcjz)
    throws Exception
  {
    Walls localWalls = this.b.A();
    if (localWalls == null) {
      return;
    }
    paramzcjz.c("c:sideWall", null);
    a(paramzcjz, localWalls.j());
    paramzcjz.b();
  }
  
  private void j(zcjz paramzcjz)
    throws Exception
  {
    Walls localWalls = this.b.y();
    if (localWalls == null) {
      return;
    }
    paramzcjz.c("c:backWall", null);
    a(paramzcjz, localWalls.j());
    paramzcjz.b();
  }
  
  private void k(zcjz paramzcjz)
    throws Exception
  {
    Floor localFloor = this.b.w();
    if (localFloor == null) {
      return;
    }
    paramzcjz.c("c:floor", null);
    a(paramzcjz, localFloor.j());
    paramzcjz.b();
  }
  
  private void l(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("c:view3D", null);
    a(paramzcjz, "rotX", zauj.z(this.b.getElevation()));
    if (!this.b.getAutoScaling()) {
      a(paramzcjz, "hPercent", zauj.z(this.b.getHeightPercent()));
    }
    a(paramzcjz, "rotY ", zauj.z(this.b.getRotationAngle()));
    a(paramzcjz, "depthPercent", zauj.z(this.b.getDepthPercent()));
    if (this.b.getRightAngleAxes())
    {
      a(paramzcjz, "rAngAx", "1");
    }
    else
    {
      a(paramzcjz, "rAngAx", "0");
      a(paramzcjz, "perspective", zauj.z(this.b.getPerspective() * 2));
    }
    paramzcjz.b();
  }
  
  private boolean f()
  {
    zkb localzkb = this.b.q();
    for (int i = 0; i < localzkb.getCount(); i++)
    {
      zka localzka = localzkb.a(i);
      int j = localzka.j();
      if ((ChartCollection.b(j)) && (j != 13)) {
        return true;
      }
    }
    return false;
  }
  
  private void a(zcjz paramzcjz, Title paramTitle)
    throws Exception
  {
    if ((paramTitle.isDeleted()) || (!paramTitle.isVisible())) {
      return;
    }
    paramzcjz.c("c:title", null);
    if (paramTitle.getText() != null) {
      b(paramzcjz, paramTitle);
    }
    boolean bool = (paramTitle.m()) && (paramTitle.p());
    String str = "factor";
    if ((paramTitle.d()) || (paramTitle.e())) {
      str = "edge";
    }
    Title localTitle = paramTitle;
    if ((localTitle.y()) && (localTitle.D() == 2003) && (!localTitle.isDefaultPosBeSet()))
    {
      localTitle.getChart().a(false, false);
      if ("factor".equals(str))
      {
        localTitle.e(localTitle.getX() - localTitle.getDefaultX());
        localTitle.f(localTitle.getY() - localTitle.getDefaultY());
      }
    }
    a(paramzcjz, paramTitle, str, true, bool, paramTitle.isInnerMode());
    if (!paramTitle.getOverLay()) {
      a(paramzcjz, "overlay", "0");
    } else {
      a(paramzcjz, "overlay", "1");
    }
    a(paramzcjz, paramTitle.getShapeProperties());
    if (((paramTitle.getText() == null) || (paramTitle.getLinkedSource() != null)) && (paramTitle.j() != null)) {
      a(paramzcjz, this.c, paramTitle.getFont(), false, paramTitle.getRotationAngle(), null, false, false, 0);
    }
    paramzcjz.b();
  }
  
  private void m(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("c:plotArea", null);
    if (this.b.getPlotArea().E())
    {
      this.b.a(false, false);
      this.b.getPlotArea().e(false);
      this.b.getPlotArea().f(false);
      this.b.getPlotArea().g(false);
      this.b.getPlotArea().h(false);
      this.b.getPlotArea().setInnerMode(false);
    }
    boolean bool = ((this.b.k() & 0xFF & 0x18) != 24) && (this.b.getPlotArea().n()) && (this.b.getPlotArea().o()) && (this.b.getPlotArea().p());
    a(paramzcjz, this.b.getPlotArea(), "edge", false, bool, this.b.getPlotArea().isInnerMode());
    zpd localzpd = new zpd();
    zkb localzkb = this.b.q();
    for (int i = 0; i < localzkb.getCount(); i++)
    {
      zka localzka = localzkb.a(i);
      int j = localzka.j();
      if ((ChartCollection.g(j)) || (ChartCollection.j(j))) {
        k(paramzcjz, localzka);
      } else if (ChartCollection.n(j)) {
        j(paramzcjz, localzka);
      } else if ((j == 44) || (j == 47) || (j == 45) || (j == 48)) {
        i(paramzcjz, localzka);
      } else if ((j == 49) || (j == 46)) {
        h(paramzcjz, localzka);
      } else if (ChartCollection.p(j)) {
        f(paramzcjz, localzka);
      } else if (ChartCollection.k(j)) {
        d(paramzcjz, localzka);
      } else if (ChartCollection.m(j)) {
        g(paramzcjz, localzka);
      } else if (zauj.O(j)) {
        e(paramzcjz, localzka);
      } else if (ChartCollection.q(j)) {
        b(paramzcjz, localzka);
      } else if (ChartCollection.r(j)) {
        a(paramzcjz, localzka);
      } else if (ChartCollection.e(j)) {
        c(paramzcjz, localzka);
      }
      localzpd.a(localzka);
    }
    if (localzpd.i)
    {
      if (localzpd.e)
      {
        a(paramzcjz, this.b.getCategoryAxis(), this.b.getValueAxis(), localzpd.g, localzpd.c, true);
        a(paramzcjz, this.b.getValueAxis(), this.b.getCategoryAxis(), localzpd.g, localzpd.c, true);
      }
      else if (localzpd.a)
      {
        a(paramzcjz, this.b.getCategoryAxis(), this.b.getValueAxis(), localzpd.g, localzpd.c);
        a(paramzcjz, this.b.getValueAxis(), this.b.getCategoryAxis(), localzpd.g, localzpd.c, false);
      }
      if (localzpd.b) {
        if (localzpd.f)
        {
          a(paramzcjz, this.b.getSecondCategoryAxis(), this.b.getSecondValueAxis(), localzpd.h, localzpd.d, true);
          a(paramzcjz, this.b.getSecondValueAxis(), this.b.getSecondCategoryAxis(), localzpd.h, localzpd.d, true);
        }
        else
        {
          a(paramzcjz, this.b.getSecondCategoryAxis(), this.b.getSecondValueAxis(), localzpd.h, localzpd.d);
          a(paramzcjz, this.b.getSecondValueAxis(), this.b.getSecondCategoryAxis(), localzpd.h, localzpd.d, false);
        }
      }
      if (localzpd.j) {
        n(paramzcjz);
      }
    }
    p(paramzcjz);
    a(paramzcjz, this.b.getPlotArea().getShapeProperties());
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    paramzcjz.c("c:stockChart", null);
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int i = 0; i < localSeriesCollection.getCount(); i++)
    {
      Series localSeries = localSeriesCollection.get(i);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, i);
      }
    }
    if (paramzka.n())
    {
      paramzcjz.c("c:hiLowLines", null);
      a(paramzcjz, paramzka.V());
      paramzcjz.b();
    }
    if (paramzka.t())
    {
      paramzcjz.c("c:upDownBars", null);
      if (paramzka.z() != 150) {
        a(paramzcjz, "gapWidth", zauj.z(paramzka.z()));
      }
      paramzcjz.c("c:upBars", null);
      DropBars localDropBars = paramzka.u();
      a(paramzcjz, localDropBars.c());
      paramzcjz.b();
      paramzcjz.c("c:downBars", null);
      localDropBars = paramzka.v();
      a(paramzcjz, localDropBars.c());
      paramzcjz.b();
      paramzcjz.b();
    }
    l(paramzcjz, paramzka);
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    paramzcjz.c("c:bubbleChart", null);
    String str = paramzka.y() ? "1" : "0";
    a(paramzcjz, "varyColors", str);
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int i = 0; i < localSeriesCollection.getCount(); i++)
    {
      Series localSeries = localSeriesCollection.get(i);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, i);
      }
    }
    if (paramzka.H() != 100) {
      a(paramzcjz, "bubbleScale", zauj.z(paramzka.H()));
    }
    a(paramzcjz, "showNegBubbles", paramzka.J() ? "1" : "0");
    if (paramzka.I() == 1) {
      a(paramzcjz, "sizeRepresents", "w");
    }
    l(paramzcjz, paramzka);
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    if ((paramzka.j() == 69) || (paramzka.j() == 70)) {
      paramzcjz.c("c:surface3DChart", null);
    } else {
      paramzcjz.c("c:surfaceChart", null);
    }
    if ((paramzka.j() == 72) || (paramzka.j() == 70)) {
      a(paramzcjz, "wireframe", "1");
    }
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int i = 0; i < localSeriesCollection.getCount(); i++)
    {
      Series localSeries = localSeriesCollection.get(i);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, i);
      }
    }
    if (this.b.e != null) {
      paramzcjz.d(this.b.e);
    }
    l(paramzcjz, paramzka);
    paramzcjz.b();
  }
  
  private void d(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    paramzcjz.c("c:scatterChart", null);
    String str1 = zauj.N(paramzka.j());
    a(paramzcjz, "scatterStyle", str1);
    String str2 = paramzka.y() ? "1" : "0";
    a(paramzcjz, "varyColors", str2);
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int i = 0; i < localSeriesCollection.getCount(); i++)
    {
      Series localSeries = localSeriesCollection.get(i);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, i);
      }
    }
    l(paramzcjz, paramzka);
    paramzcjz.b();
  }
  
  private void e(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    paramzcjz.c("c:radarChart", null);
    String str1 = zauj.P(paramzka.j());
    a(paramzcjz, "radarStyle", str1);
    String str2 = paramzka.y() ? "1" : "0";
    a(paramzcjz, "varyColors", str2);
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int i = 0; i < localSeriesCollection.getCount(); i++)
    {
      Series localSeries = localSeriesCollection.get(i);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, i);
      }
    }
    l(paramzcjz, paramzka);
    paramzcjz.b();
  }
  
  private void f(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    boolean bool = ChartCollection.b(paramzka.j());
    if (bool) {
      paramzcjz.c("c:area3DChart", null);
    } else {
      paramzcjz.c("c:areaChart", null);
    }
    String str1 = zauj.I(paramzka.j());
    a(paramzcjz, "grouping", str1);
    String str2 = paramzka.y() ? "1" : "0";
    a(paramzcjz, "varyColors", str2);
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int i = 0; i < localSeriesCollection.getCount(); i++)
    {
      Series localSeries = localSeriesCollection.get(i);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, i);
      }
    }
    if (paramzka.r())
    {
      paramzcjz.c("c:dropLines", null);
      a(paramzcjz, paramzka.U());
      paramzcjz.b();
    }
    if ((bool) && (this.b.getGapDepth() != 150)) {
      a(paramzcjz, "gapDepth", zauj.z(this.b.getGapDepth()));
    }
    l(paramzcjz, paramzka);
    paramzcjz.b();
  }
  
  private void g(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    paramzcjz.c("c:doughnutChart", null);
    String str = paramzka.y() ? "1" : "0";
    a(paramzcjz, "varyColors", str);
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int i = 0; i < localSeriesCollection.getCount(); i++)
    {
      Series localSeries = localSeriesCollection.get(i);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, i);
      }
    }
    if (paramzka.A() != 0) {
      a(paramzcjz, "firstSliceAng", zauj.z(paramzka.A()));
    }
    a(paramzcjz, "holeSize", zauj.z(paramzka.K()));
    paramzcjz.b();
  }
  
  private void h(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    paramzcjz.c("c:ofPieChart", null);
    String str = paramzka.j() == 49 ? "bar" : "pie";
    a(paramzcjz, "ofPieType", str);
    str = paramzka.y() ? "1" : "0";
    a(paramzcjz, "varyColors", str);
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int i = 0; i < localSeriesCollection.getCount(); i++)
    {
      Series localSeries = localSeriesCollection.get(i);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, i);
      }
    }
    if (paramzka.z() != 150) {
      a(paramzcjz, "gapWidth", zauj.z(paramzka.z()));
    }
    if (!paramzka.G())
    {
      str = zauj.L(paramzka.D());
      a(paramzcjz, "splitType", str);
      a(paramzcjz, "splitPos", zauj.b(paramzka.E()));
    }
    a(paramzcjz, "secondPieSize", zauj.z(paramzka.C()));
    Line localLine = paramzka.q();
    if (localLine != null)
    {
      paramzcjz.c("c:serLines", null);
      a(paramzcjz, paramzka.T());
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void i(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    int i = 0;
    if ((paramzka.j() == 45) || (paramzka.j() == 48))
    {
      paramzcjz.c("c:pie3DChart", null);
    }
    else
    {
      i = 1;
      paramzcjz.c("c:pieChart", null);
    }
    String str = paramzka.y() ? "1" : "0";
    a(paramzcjz, "varyColors", str);
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int j = 0; j < localSeriesCollection.getCount(); j++)
    {
      Series localSeries = localSeriesCollection.get(j);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, j);
      }
    }
    if ((i != 0) && (paramzka.A() != 0)) {
      a(paramzcjz, "firstSliceAng", zauj.z(paramzka.A()));
    }
    paramzcjz.b();
  }
  
  private void j(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    if (paramzka.j() == 43) {
      paramzcjz.c("c:line3DChart", null);
    } else {
      paramzcjz.c("c:lineChart", null);
    }
    String str1 = zauj.J(paramzka.j());
    a(paramzcjz, "grouping", str1);
    String str2 = paramzka.y() ? "1" : "0";
    a(paramzcjz, "varyColors", str2);
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int i = 0; i < localSeriesCollection.getCount(); i++)
    {
      Series localSeries = localSeriesCollection.get(i);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, i);
      }
    }
    if (paramzka.r())
    {
      paramzcjz.c("c:dropLines", null);
      a(paramzcjz, paramzka.U());
      paramzcjz.b();
    }
    if (paramzka.n())
    {
      paramzcjz.c("c:hiLowLines", null);
      a(paramzcjz, paramzka.V());
      paramzcjz.b();
    }
    if (paramzka.t())
    {
      paramzcjz.c("c:upDownBars", null);
      if (paramzka.z() != 150) {
        a(paramzcjz, "gapWidth", zauj.z(paramzka.z()));
      }
      paramzcjz.c("c:upBars", null);
      DropBars localDropBars = paramzka.u();
      a(paramzcjz, localDropBars.c());
      paramzcjz.b();
      paramzcjz.c("c:downBars", null);
      localDropBars = paramzka.v();
      a(paramzcjz, localDropBars.c());
      paramzcjz.b();
      paramzcjz.b();
    }
    a(paramzcjz, "marker", "1");
    if ((paramzka.j() == 43) && (this.b.getGapDepth() != 150)) {
      a(paramzcjz, "gapDepth", zauj.z(this.b.getGapDepth()));
    }
    l(paramzcjz, paramzka);
    paramzcjz.b();
  }
  
  private void k(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    boolean bool = ChartCollection.b(paramzka.j());
    if (bool) {
      paramzcjz.c("c:bar3DChart", null);
    } else {
      paramzcjz.c("c:barChart", null);
    }
    String str1 = null;
    String str2 = null;
    String[] arrayOfString1 = { str1 };
    String[] arrayOfString2 = { str2 };
    zauj.a(paramzka.j(), arrayOfString1, arrayOfString2);
    str1 = arrayOfString1[0];
    str2 = arrayOfString2[0];
    a(paramzcjz, "barDir", str1);
    a(paramzcjz, "grouping", str2);
    String str3 = paramzka.y() ? "1" : "0";
    a(paramzcjz, "varyColors", str3);
    SeriesCollection localSeriesCollection = this.b.getNSeries();
    for (int i = 0; i < localSeriesCollection.getCount(); i++)
    {
      Series localSeries = localSeriesCollection.get(i);
      if (localSeries.u() == paramzka) {
        a(paramzcjz, localSeries, i);
      }
    }
    if (paramzka.B() != 0) {
      a(paramzcjz, "overlap", zauj.z(paramzka.B()));
    }
    if (paramzka.z() != 150) {
      a(paramzcjz, "gapWidth", zauj.z(paramzka.z()));
    }
    if ((bool) && (this.b.getGapDepth() != 150)) {
      a(paramzcjz, "gapDepth", zauj.z(this.b.getGapDepth()));
    }
    if (bool)
    {
      localObject = zauj.Q(paramzka.j());
      if (localObject != null) {
        a(paramzcjz, "shape", (String)localObject);
      }
    }
    Object localObject = paramzka.q();
    if ((paramzka.p()) && (localObject != null))
    {
      paramzcjz.c("c:serLines", null);
      a(paramzcjz, paramzka.T());
      paramzcjz.b();
    }
    l(paramzcjz, paramzka);
    if (paramzka.a != null) {
      paramzcjz.d(paramzka.a);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Series paramSeries, int paramInt)
    throws Exception
  {
    int i = paramSeries.u().j();
    boolean bool1 = (ChartCollection.g(i)) || (ChartCollection.j(i));
    int j = (ChartCollection.n(i)) || (ChartCollection.r(i)) ? 1 : 0;
    int k = (ChartCollection.c(i)) || (ChartCollection.m(i)) ? 1 : 0;
    boolean bool2 = ChartCollection.p(i);
    boolean bool3 = ChartCollection.k(i);
    boolean bool4 = zauj.O(i);
    boolean bool5 = ChartCollection.q(i);
    boolean bool6 = ChartCollection.b(i);
    boolean bool7 = ChartCollection.e(i);
    paramzcjz.c("c:ser", null);
    a(paramzcjz, "idx", zauj.z(paramSeries.b()));
    a(paramzcjz, "order", zauj.z(paramSeries.C()));
    f(paramzcjz, paramSeries);
    if ((i == 69) || (i == 70)) {
      paramSeries.getShapeProperties().i();
    }
    a(paramzcjz, paramSeries.getShapeProperties());
    if (k != 0) {
      a(paramzcjz, "explosion", zauj.z(paramSeries.getExplosion()));
    }
    if ((bool1) || (bool5)) {
      a(paramzcjz, "invertIfNegative", paramSeries.getArea().getInvertIfNegative() ? "1" : "0");
    }
    if ((bool1) || (bool2)) {
      a(paramzcjz, paramSeries.e());
    }
    boolean bool8 = true;
    boolean bool9 = true;
    Object localObject;
    if (paramSeries.c() != null)
    {
      localObject = paramSeries.getPoints();
      bool8 = a(paramSeries);
      bool9 = b(paramSeries);
    }
    if (((j != 0) || (bool3) || (bool4)) && (paramSeries.x() != null)) {
      a(paramzcjz, paramSeries.getMarker(), paramSeries.getShadow(), paramSeries);
    }
    if (paramSeries.c() != null)
    {
      localObject = paramSeries.getPoints();
      for (int m = 0; m < ((ChartPointCollection)localObject).a(); m++)
      {
        ChartPoint localChartPoint = ((ChartPointCollection)localObject).c(m);
        if (!localChartPoint.e())
        {
          paramzcjz.c("c:dPt", null);
          a(paramzcjz, "idx", zauj.z(localChartPoint.a));
          if ((k != 0) && (localChartPoint.getExplosion() != paramSeries.getExplosion())) {
            a(paramzcjz, "explosion", zauj.z(localChartPoint.getExplosion()));
          }
          int n = 0;
          if ((bool1) || (bool5))
          {
            a(paramzcjz, "invertIfNegative", localChartPoint.getArea().getInvertIfNegative() ? "1" : "0");
            if ((localChartPoint.getArea().getInvertIfNegative()) && (paramSeries.m() != null) && (paramSeries.m().b != null) && (localChartPoint.a < paramSeries.m().b.size()) && ((paramSeries.m().b.get(localChartPoint.a) instanceof Double)) && (((Double)paramSeries.m().b.get(localChartPoint.a)).doubleValue() < 0.0D)) {
              n = 1;
            }
          }
          if ((n == 0) && (!bool8))
          {
            a(paramzcjz, localChartPoint.getShapeProperties());
            if ((bool1) || (bool2)) {
              a(paramzcjz, localChartPoint.g());
            }
          }
          if (((j != 0) || (bool3) || (bool4)) && (localChartPoint.h() != null) && (!bool9)) {
            a(paramzcjz, localChartPoint.getMarker(), localChartPoint.getShadow(), localChartPoint);
          }
          paramzcjz.b();
        }
      }
    }
    e(paramzcjz, paramSeries);
    if ((k == 0) && (!bool4) && (paramSeries.q() != null) && (paramSeries.getTrendLines().getCount() > 0)) {
      a(paramzcjz, paramSeries.getTrendLines());
    }
    if ((k == 0) && (!bool4) && (paramSeries.z() != null) && (paramSeries.getYErrorBar().getDisplayType() != 2)) {
      a(paramzcjz, paramSeries.getYErrorBar());
    }
    if ((bool3) && (paramSeries.y() != null) && (paramSeries.getXErrorBar().getDisplayType() != 2)) {
      a(paramzcjz, paramSeries.getXErrorBar());
    }
    if ((bool3) || (bool5))
    {
      if (paramSeries.o() != null)
      {
        paramzcjz.c("c:xVal", null);
        a(paramzcjz, paramSeries.o(), true, false);
        paramzcjz.b();
      }
      if (paramSeries.m() != null)
      {
        paramzcjz.c("c:yVal", null);
        a(paramzcjz, paramSeries.m(), false, false);
        paramzcjz.b();
      }
    }
    else
    {
      c(paramzcjz, paramSeries);
      d(paramzcjz, paramSeries);
    }
    if (bool5)
    {
      if (paramSeries.p() != null)
      {
        paramzcjz.c("c:bubbleSize", null);
        a(paramzcjz, paramSeries.p(), false, false);
        paramzcjz.b();
      }
      if (paramSeries.getHas3DEffect()) {
        a(paramzcjz, "bubble3D", "1");
      }
    }
    if ((j != 0) || (bool3)) {
      if (paramSeries.getSmooth()) {
        a(paramzcjz, "smooth", "1");
      } else {
        a(paramzcjz, "smooth", "0");
      }
    }
    if ((bool1) && (bool6))
    {
      localObject = zauj.R(paramSeries.getBar3DShapeType());
      if (localObject != null) {
        a(paramzcjz, "shape", (String)localObject);
      }
    }
    a(paramzcjz, paramSeries, bool1, bool5);
    paramzcjz.b();
  }
  
  private boolean a(Series paramSeries)
  {
    if (paramSeries.c() != null)
    {
      ShapePropertyCollection localShapePropertyCollection = paramSeries.getShapeProperties();
      ChartPointCollection localChartPointCollection = paramSeries.c();
      int i = localChartPointCollection.getCount();
      for (int j = 0; j < i; j++)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        if (!localChartPoint.getShapeProperties().a(localShapePropertyCollection, null)) {
          return false;
        }
      }
    }
    return true;
  }
  
  private boolean b(Series paramSeries)
  {
    if (paramSeries.c() != null)
    {
      ChartPointCollection localChartPointCollection = paramSeries.c();
      int i = localChartPointCollection.getCount();
      int j = 0;
      if (j < i)
      {
        ChartPoint localChartPoint = localChartPointCollection.get(j);
        if ((paramSeries.w() != null) && (localChartPoint.h() != null)) {
          return paramSeries.getMarker().a(localChartPoint.getMarker());
        }
        return false;
      }
    }
    return true;
  }
  
  private void a(zcjz paramzcjz, Series paramSeries, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    if (!a(paramSeries, paramBoolean1, paramBoolean1)) {
      return;
    }
    paramzcjz.b("c:extLst");
    if ((paramSeries.b != null) && (paramSeries.b.a() != null))
    {
      Iterator localIterator = paramSeries.b.b().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramzcjz.d(str);
      }
    }
    if (((paramBoolean1) || (paramBoolean2)) && (paramSeries.getArea().getInvertIfNegative()) && (paramSeries.getArea().getFillFormat().getFillType() == 2)) {
      b(paramzcjz, paramSeries);
    }
    if (paramSeries.getDataLabels().i != null) {
      a(paramzcjz, paramSeries);
    }
    paramzcjz.b();
  }
  
  private boolean a(Series paramSeries, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramSeries.b != null) && (paramSeries.b.a() != null)) {
      return true;
    }
    if (((paramBoolean1) || (paramBoolean2)) && (paramSeries.getArea().getInvertIfNegative()) && (paramSeries.getArea().getFillFormat().getFillType() == 2)) {
      return true;
    }
    return (paramSeries.f != null) && (paramSeries.f.i != null);
  }
  
  private void a(zcjz paramzcjz, Series paramSeries)
    throws Exception
  {
    zjk localzjk = paramSeries.getDataLabels().i;
    paramzcjz.b("c:ext");
    paramzcjz.a("uri", "{02D57815-91ED-43cb-92C2-25804820EDAC}");
    paramzcjz.a("xmlns:c15", "http://schemas.microsoft.com/office/drawing/2012/chart");
    paramzcjz.b("c15:datalabelsRange");
    paramzcjz.b("c15:f");
    String str = a(localzjk);
    paramzcjz.a(str);
    paramzcjz.b();
    if ((localzjk.b != null) && (localzjk.b.size() > 0)) {
      a(paramzcjz, localzjk, "c15:dlblRangeCache");
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, Series paramSeries)
    throws Exception
  {
    paramzcjz.b("c:ext");
    paramzcjz.a("uri", "{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}");
    paramzcjz.a("xmlns:c14", "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
    paramzcjz.b("c14:invertSolidFillFmt");
    paramzcjz.b("c14:spPr");
    paramzcjz.c("a:solidFill", null);
    zvl.a(paramzcjz, paramSeries.getArea().getFillFormat().getSolidFill().b, this.c, false);
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Area paramArea)
    throws Exception
  {
    if (paramArea == null) {
      return;
    }
    if ((paramArea.getFormatting() == 2) && (paramArea.getFillFormat().getFillType() == 4))
    {
      TextureFill localTextureFill = paramArea.getFillFormat().getTextureFill();
      if (!localTextureFill.isTiling())
      {
        PicFormatOption localPicFormatOption = localTextureFill.getPicFormatOption();
        paramzcjz.c("c:pictureOptions", null);
        if (!localPicFormatOption.c()) {
          a(paramzcjz, "c", "applyToFront", "0");
        }
        if (!localPicFormatOption.b()) {
          a(paramzcjz, "c", "applyToSides", "0");
        }
        if (!localPicFormatOption.d()) {
          a(paramzcjz, "c", "applyToEnd", "0");
        }
        String str = zauj.an(localPicFormatOption.getType());
        a(paramzcjz, "c", "pictureFormat", str);
        if (localPicFormatOption.getType() == 2) {
          a(paramzcjz, "c", "pictureStackUnit", zauj.b(localPicFormatOption.getScale()));
        }
        paramzcjz.b();
      }
    }
  }
  
  private void c(zcjz paramzcjz, Series paramSeries)
    throws Exception
  {
    zjk localzjk = paramSeries.o();
    if (localzjk == null) {
      return;
    }
    paramzcjz.c("c:cat", null);
    zaca localzaca = this.d.a().z;
    if (localzaca.c != this.b.getWorksheet()) {
      localzaca.a(this.b.getWorksheet());
    }
    localzaca.a(localzjk);
    localzaca.d = 0;
    localzaca.e = 0;
    boolean bool = zjo.a(localzjk, localzaca);
    a(paramzcjz, localzjk, true, bool);
    paramzcjz.b();
  }
  
  private String a(zjk paramzjk)
  {
    String str = paramzjk.q();
    if (str != null)
    {
      if ((str.indexOf('!') == -1) && (paramzjk.o())) {
        if (str.charAt(0) == '=') {
          str = "[0]!" + str.substring(1);
        } else {
          str = "[0]!" + str;
        }
      }
      str = zauj.L(str);
      if (((paramzjk.a() == 1) || (paramzjk.a() == 3)) && (str.charAt(0) != '(') && (str.indexOf(',') != -1) && (str.charAt(0) != '{')) {
        str = "{" + str + "}";
      }
      return str;
    }
    return null;
  }
  
  private void a(zcjz paramzcjz, zjk paramzjk, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    String str1;
    if ((paramzjk.c != null) && (paramzjk.c.length > 0))
    {
      str1 = a(paramzjk);
      if (str1 != null)
      {
        boolean bool = true;
        String str2 = "numRef";
        if (paramBoolean2)
        {
          str2 = "multiLvlStrRef";
        }
        else if (paramBoolean1)
        {
          bool = a(paramzjk, paramBoolean2);
          str2 = bool ? "numRef" : "strRef";
        }
        paramzcjz.c("c:" + str2, null);
        paramzcjz.c("c:f", null);
        paramzcjz.a(str1);
        paramzcjz.b();
        if (paramBoolean2)
        {
          a(paramzcjz, paramzjk);
        }
        else
        {
          str2 = bool ? "numCache" : "strCache";
          a(paramzcjz, paramzjk, "c:" + str2);
        }
        paramzcjz.b();
      }
    }
    else
    {
      str1 = paramzjk.a() == 1 ? "numLit" : "strLit";
      if ((paramzjk.a() == 3) && (!paramBoolean1) && (a(paramzjk.b))) {
        str1 = "numLit";
      }
      a(paramzcjz, paramzjk, "c:" + str1);
    }
  }
  
  private boolean a(ArrayList paramArrayList)
  {
    for (int i = 0; i < paramArrayList.size(); i++) {
      try
      {
        Object localObject = paramArrayList.get(i);
        if (localObject != null) {
          if ((localObject instanceof String))
          {
            if ((!"".equals((String)localObject)) && (!"#N/A".equals((String)localObject))) {
              return false;
            }
          }
          else if (!(localObject instanceof Double)) {
            return false;
          }
        }
      }
      catch (Exception localException)
      {
        return false;
      }
    }
    return true;
  }
  
  private boolean a(zjk paramzjk, boolean paramBoolean)
  {
    if (paramzjk.a() == 1) {
      return true;
    }
    if ((paramzjk.b != null) && (paramzjk.b.size() > 0) && (!paramBoolean)) {
      return a(paramzjk.b);
    }
    int i = 0;
    int j = 0;
    int[] arrayOfInt = { i };
    boolean[] arrayOfBoolean = { j };
    ArrayList localArrayList1 = paramzjk.a(paramzjk.m(), false, arrayOfInt, arrayOfBoolean);
    i = arrayOfInt[0];
    j = arrayOfBoolean[0];
    if ((localArrayList1 == null) || (localArrayList1.size() == 0)) {
      return false;
    }
    int k;
    if (i == 1)
    {
      for (k = 0; k < localArrayList1.size(); k++)
      {
        zjt localzjt1 = (zjt)localArrayList1.get(k);
        if (localzjt1.g == 5) {
          return false;
        }
      }
    }
    else
    {
      k = localArrayList1.size();
      int m = ((ArrayList)localArrayList1.get(0)).size();
      for (int n = 0; n < k; n++)
      {
        ArrayList localArrayList2 = (ArrayList)localArrayList1.get(n);
        for (int i1 = 0; i1 < localArrayList2.size(); i1++)
        {
          zjt localzjt2 = (zjt)localArrayList2.get(i1);
          if (localzjt2.g == 5) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    Object localObject;
    for (int j = 0; j < paramArrayList2.size(); j++)
    {
      localObject = (String)paramArrayList2.get(j);
      if (localObject != null)
      {
        String[] arrayOfString1 = zw.d((String)localObject, '\n');
        if (arrayOfString1.length > i) {
          i = arrayOfString1.length;
        }
        zf.a(localArrayList, arrayOfString1);
      }
    }
    for (j = 0; j < i; j++)
    {
      localObject = new ArrayList(paramArrayList2.size());
      for (int k = 0; k < localArrayList.size(); k++)
      {
        String[] arrayOfString2 = (String[])localArrayList.get(k);
        if (j >= arrayOfString2.length) {
          zf.a((ArrayList)localObject, "");
        } else {
          zf.a((ArrayList)localObject, arrayOfString2[j]);
        }
      }
      zf.a(paramArrayList1, localObject);
    }
  }
  
  private void a(zcjz paramzcjz, zjk paramzjk)
    throws Exception
  {
    String str1 = "multiLvlStrCache";
    if ((paramzjk.b != null) && (paramzjk.b.size() > 0))
    {
      ArrayList localArrayList1 = paramzjk.b;
      int i = localArrayList1.size();
      if (i > 0)
      {
        paramzcjz.c("c:" + str1, null);
        a(paramzcjz, "c", "ptCount", zauj.z(i));
        ArrayList localArrayList2 = new ArrayList();
        a(localArrayList2, localArrayList1);
        for (int j = 0; j < localArrayList2.size(); j++)
        {
          ArrayList localArrayList3 = (ArrayList)localArrayList2.get(j);
          paramzcjz.c("c:lvl", null);
          for (int k = 0; k < localArrayList3.size(); k++)
          {
            String str2 = (String)localArrayList3.get(k);
            if ((str2 != null) && (str2.length() > 0))
            {
              paramzcjz.c("c:pt", null);
              paramzcjz.a("idx", zauj.z(k));
              paramzcjz.c("c:v", null);
              paramzcjz.a(str2);
              paramzcjz.b();
              paramzcjz.b();
            }
          }
          paramzcjz.b();
        }
        paramzcjz.b();
      }
    }
    else if (((paramzjk.b != null) && (this.b.getPivotSource() != null)) || ((paramzjk.s() > 0) && (paramzjk.l())))
    {
      paramzcjz.c("c:" + str1, null);
      paramzcjz.b();
    }
  }
  
  private void a(zcjz paramzcjz, zjk paramzjk, String paramString)
    throws Exception
  {
    if ((paramzjk.b != null) && (paramzjk.b.size() > 0))
    {
      ArrayList localArrayList = paramzjk.b;
      int i = localArrayList.size();
      if (i > 0)
      {
        paramzcjz.c(paramString, null);
        if ((paramzjk.b() != null) && (!"".equals(paramzjk.b())) && (!paramString.equals("c:strCache")))
        {
          paramzcjz.c("c:formatCode", null);
          paramzcjz.a(paramzjk.b());
          paramzcjz.b();
        }
        a(paramzcjz, "c", "ptCount", zauj.z(i));
        for (int j = 0; j < i; j++)
        {
          Object localObject = localArrayList.get(j);
          if ((localObject != null) && ((!(localObject instanceof Double)) || (!Double.isNaN(((Double)localObject).doubleValue()))) && (zs.a(localObject).length() > 0))
          {
            paramzcjz.c("c:pt", null);
            paramzcjz.a("idx", zauj.z(j));
            paramzcjz.c("c:v", null);
            if ((localObject instanceof Double)) {
              paramzcjz.a(zauj.b(((Double)localObject).doubleValue()));
            } else {
              paramzcjz.a(zs.a(localObject));
            }
            paramzcjz.b();
            paramzcjz.b();
          }
        }
        paramzcjz.b();
      }
    }
    else if (((paramzjk.b != null) && (this.b.getPivotSource() != null)) || ((paramzjk.s() > 0) && (paramzjk.l())))
    {
      paramzcjz.c(paramString, null);
      paramzcjz.b();
    }
    else if ((paramzjk.b == null) && (paramzjk.n()))
    {
      paramzcjz.c(paramString, null);
      paramzcjz.b();
    }
    else if ((paramzjk.b == null) && (paramzjk.s() > 0))
    {
      paramzcjz.c(paramString, null);
      paramzcjz.b();
    }
  }
  
  private void d(zcjz paramzcjz, Series paramSeries)
    throws Exception
  {
    if (paramSeries.m() == null) {
      return;
    }
    paramzcjz.c("c:val", null);
    a(paramzcjz, paramSeries.m(), false, false);
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Marker paramMarker, boolean paramBoolean, Object paramObject)
    throws Exception
  {
    int i = paramMarker.getMarkerStyle();
    paramzcjz.c("c:marker", null);
    if (i == 5)
    {
      a(paramzcjz, "symbol", "none");
    }
    else
    {
      if (i != 0)
      {
        int j = 1;
        Object localObject;
        if ((paramObject instanceof ChartPoint))
        {
          localObject = ((ChartPoint)paramObject).a();
          Marker localMarker = ((Series)localObject).x();
          if ((localMarker != null) && (localMarker.getMarkerStyle() == i)) {
            j = 0;
          }
        }
        if (j != 0)
        {
          localObject = zauj.K(i);
          a(paramzcjz, "symbol", (String)localObject);
        }
      }
      if ((!paramMarker.a) || (i != 0)) {
        a(paramzcjz, "size", zauj.z(paramMarker.getMarkerSize()));
      }
      a(paramzcjz, paramMarker.i());
    }
    paramzcjz.b();
  }
  
  private boolean c(Series paramSeries)
  {
    DataLabels localDataLabels = paramSeries.r();
    if (localDataLabels != null) {
      return true;
    }
    if (paramSeries.c() != null)
    {
      ChartPointCollection localChartPointCollection = paramSeries.getPoints();
      for (int i = 0; i < localChartPointCollection.a(); i++)
      {
        ChartPoint localChartPoint = localChartPointCollection.c(i);
        if (localChartPoint.j() != null) {
          return true;
        }
      }
    }
    return false;
  }
  
  private void a(zcjz paramzcjz, DataLabels paramDataLabels, int paramInt)
    throws Exception
  {
    paramzcjz.c("c:layout", null);
    paramzcjz.c("c:manualLayout", null);
    if ((paramDataLabels.x()) && (paramDataLabels.D() != 2003))
    {
      a(paramzcjz, "xMode", "edge");
      a(paramzcjz, "yMode", "edge");
      a(paramzcjz, "x", zauj.b(paramDataLabels.getX() / 4000.0D));
      a(paramzcjz, "y", zauj.b(paramDataLabels.getY() / 4000.0D));
    }
    else
    {
      if (paramDataLabels.x())
      {
        if (!paramDataLabels.isDefaultPosBeSet()) {
          paramDataLabels.getChart().a(false, false);
        }
        paramDataLabels.i(paramDataLabels.getX() - paramDataLabels.getDefaultX());
        paramDataLabels.j(paramDataLabels.getY() - paramDataLabels.getDefaultY());
      }
      else if ((paramDataLabels.y()) && (paramDataLabels.D() == 2003))
      {
        if (!paramDataLabels.isDefaultPosBeSet()) {
          paramDataLabels.getChart().a(false, false);
        }
        paramDataLabels.i(paramDataLabels.getX() - paramDataLabels.getDefaultX());
        paramDataLabels.j(paramDataLabels.getY() - paramDataLabels.getDefaultY());
      }
      a(paramzcjz, "x", zauj.b(paramDataLabels.z() / 4000.0D));
      a(paramzcjz, "y", zauj.b(paramDataLabels.A() / 4000.0D));
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void e(zcjz paramzcjz, Series paramSeries)
    throws Exception
  {
    if (!c(paramSeries)) {
      return;
    }
    int i = paramSeries.u().j();
    DataLabels localDataLabels1 = paramSeries.r();
    paramzcjz.c("c:dLbls", null);
    Object localObject1;
    if (paramSeries.c() != null)
    {
      localObject1 = paramSeries.getPoints();
      for (int k = 0; k < ((ChartPointCollection)localObject1).a(); k++)
      {
        ChartPoint localChartPoint = ((ChartPointCollection)localObject1).c(k);
        if (((localChartPoint.j() != null) && (localDataLabels1 != null) && (!localDataLabels1.d(localChartPoint.j()))) || ((localDataLabels1 == null) && (localChartPoint.j() != null)) || ((localChartPoint.j() != null) && ((!localChartPoint.j().m()) || (localChartPoint.j().x()))) || ((localChartPoint.j() != null) && (localChartPoint.j().F() != null) && (localChartPoint.j().F().length() > 0)))
        {
          DataLabels localDataLabels2 = localChartPoint.j();
          paramzcjz.c("c:dLbl", null);
          a(paramzcjz, "c", "idx", zauj.z(localChartPoint.a));
          if ((localDataLabels2.isDeleted()) || (!localDataLabels2.X()))
          {
            a(paramzcjz, "c", "delete", "1");
          }
          else
          {
            if ((!localDataLabels2.m()) || (localDataLabels2.x()) || (localDataLabels2.y())) {
              a(paramzcjz, localDataLabels2, 1);
            } else {
              paramzcjz.b("c:layout", null);
            }
            int i2 = 0;
            if (((localDataLabels2.F() != null) && (localDataLabels2.F().length() > 0)) || (localDataLabels2.i != null) || (paramSeries.getDataLabels().i != null)) {
              i2 = 1;
            }
            if ((localDataLabels2.O()) || (i2 != 0) || (localDataLabels2.w() != null))
            {
              paramzcjz.c("c:numFmt", null);
              String str1 = a(this.c, localDataLabels2);
              paramzcjz.a("formatCode", str1);
              paramzcjz.a("sourceLinked", localDataLabels2.N() ? "1" : "0");
              paramzcjz.b();
            }
            boolean bool = a(paramzcjz, localDataLabels2.getShapeProperties());
            if ((!bool) && (localDataLabels2.getRotationAngle() != 0)) {
              paramzcjz.b("c:spPr", null);
            }
            if (i2 != 0) {
              b(paramzcjz, localDataLabels2, true);
            }
            Object localObject3;
            if ((localDataLabels1 == null) || (!a(localDataLabels1.j(), localDataLabels2.j())) || (localDataLabels2.getRotationAngle() != 0) || ((localDataLabels2.O()) && ((localDataLabels2.R() instanceof ChartPoint))))
            {
              localObject3 = localDataLabels2.j();
              if ((localObject3 == null) && (localDataLabels2.getRotationAngle() != 0)) {
                localObject3 = localDataLabels2.getFont();
              }
              a(paramzcjz, this.c, (Font)localObject3, false, localDataLabels2.getRotationAngle(), localDataLabels2, localDataLabels2.H(), localDataLabels2.I(), localDataLabels2.getTextDirection());
            }
            else if (bool)
            {
              localObject3 = localDataLabels2.getFont();
              if ((localObject3 == null) && (localDataLabels2.getRotationAngle() != 0)) {
                localObject3 = localDataLabels2.getFont();
              }
              a(paramzcjz, this.c, (Font)localObject3, false, localDataLabels2.getRotationAngle(), localDataLabels2, localDataLabels2.H(), localDataLabels2.I(), localDataLabels2.getTextDirection());
            }
            if ((!localDataLabels2.n) && (localDataLabels2.getPosition() != 9) && (localDataLabels2.X()))
            {
              localObject3 = zauj.c(localDataLabels2.getPosition(), i);
              if (localObject3 != null) {
                a(paramzcjz, "c", "dLblPos", (String)localObject3);
              }
            }
            else if ((localDataLabels1 != null) && (!localDataLabels1.n) && (localDataLabels1.getPosition() != 9) && (localDataLabels1.X()))
            {
              localObject3 = zauj.c(localDataLabels1.getPosition(), i);
              if (localObject3 != null) {
                a(paramzcjz, "c", "dLblPos", (String)localObject3);
              }
            }
            a(paramzcjz, localDataLabels2, false);
            a(paramzcjz, localDataLabels2);
          }
          paramzcjz.b();
        }
      }
    }
    if (localDataLabels1 != null)
    {
      paramzcjz.c("c:numFmt", null);
      localObject1 = a(this.c, localDataLabels1);
      paramzcjz.a("formatCode", (String)localObject1);
      if (localDataLabels1.getNumberFormatLinked()) {
        paramzcjz.a("sourceLinked", "1");
      } else {
        paramzcjz.a("sourceLinked", "0");
      }
      paramzcjz.b();
      a(paramzcjz, localDataLabels1.getShapeProperties());
      Object localObject2;
      if ((!a(this.b.getChartArea().j(), localDataLabels1.j())) || (localDataLabels1.getRotationAngle() != 0))
      {
        localObject2 = localDataLabels1.j();
        if (localDataLabels1.getRotationAngle() != 0) {
          localObject2 = localDataLabels1.getFont();
        }
        a(paramzcjz, this.c, (Font)localObject2, false, localDataLabels1.getRotationAngle(), localDataLabels1, localDataLabels1.H(), localDataLabels1.I(), localDataLabels1.getTextDirection());
      }
      if ((!localDataLabels1.n) && (localDataLabels1.X()))
      {
        localObject2 = zauj.c(localDataLabels1.getPosition(), i);
        if (localObject2 != null) {
          a(paramzcjz, "c", "dLblPos", (String)localObject2);
        }
      }
      a(paramzcjz, localDataLabels1, true);
      if (localDataLabels1.isDeleted()) {
        a(paramzcjz, "c", "delete", "1");
      }
    }
    else
    {
      a(paramzcjz, "c", "delete", "1");
    }
    int j = (ChartCollection.c(paramSeries.getType())) || (ChartCollection.m(paramSeries.getType())) ? 1 : 0;
    if ((j != 0) && (paramSeries.u().P() != null))
    {
      paramzcjz.c("c:leaderLines", null);
      a(paramzcjz, paramSeries.u().W());
      paramzcjz.b();
    }
    int m = (j == 0) && (paramSeries.hasLeaderLines()) ? 1 : 0;
    int n = (localDataLabels1 != null) && (localDataLabels1.getShowCellRange()) ? 1 : 0;
    int i1 = ((localDataLabels1 != null) && (localDataLabels1.k != null)) || (m != 0) || (n != 0) ? 1 : 0;
    if (i1 != 0)
    {
      paramzcjz.b("c:extLst");
      if (localDataLabels1.k != null)
      {
        Iterator localIterator = localDataLabels1.k.iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          paramzcjz.d(str2);
        }
      }
      if ((m != 0) || (n != 0))
      {
        paramzcjz.b("c:ext");
        paramzcjz.a("uri", "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}");
        paramzcjz.a("xmlns:c15", "http://schemas.microsoft.com/office/drawing/2012/chart");
        if (n != 0) {
          a(paramzcjz, "c15", "showDataLabelsRange", "1");
        }
        if ((m != 0) && (paramSeries.hasLeaderLines()))
        {
          a(paramzcjz, "c15", "showLeaderLines", paramSeries.hasLeaderLines() ? "1" : "0");
          if (paramSeries.u().P() != null)
          {
            paramzcjz.c("c15:leaderLines", null);
            a(paramzcjz, paramSeries.u().W());
            paramzcjz.b();
          }
        }
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, DataLabels paramDataLabels)
    throws Exception
  {
    if (!paramDataLabels.getShowCellRange()) {
      return;
    }
    paramzcjz.b("c:extLst");
    paramzcjz.b("c:ext");
    paramzcjz.a("uri", "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}");
    paramzcjz.a("xmlns:c15", "http://schemas.microsoft.com/office/drawing/2012/chart");
    if (paramDataLabels.getShowCellRange()) {
      a(paramzcjz, "c15", "showDataLabelsRange", "1");
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, DataLabels paramDataLabels, boolean paramBoolean)
    throws Exception
  {
    if (paramDataLabels == null)
    {
      a(paramzcjz, "showVal", "0");
      a(paramzcjz, "showCatName", "0");
      a(paramzcjz, "showSerName", "0");
      a(paramzcjz, "showPercent", "0");
      a(paramzcjz, "showBubbleSize", "0");
      a(paramzcjz, "showLeaderLines", "0");
    }
    else
    {
      String str1 = null;
      if ((paramDataLabels.Q()) && (paramDataLabels.P() != 0)) {
        str1 = paramDataLabels.getSeparatorValue();
      }
      a(paramzcjz, "showLegendKey", paramDataLabels.getShowLegendKey() ? "1" : "0");
      String str2 = paramDataLabels.getShowValue() ? "1" : "0";
      a(paramzcjz, "showVal", str2);
      str2 = paramDataLabels.getShowCategoryName() ? "1" : "0";
      a(paramzcjz, "showCatName", str2);
      str2 = paramDataLabels.getShowSeriesName() ? "1" : "0";
      a(paramzcjz, "showSerName", str2);
      str2 = paramDataLabels.getShowPercentage() ? "1" : "0";
      a(paramzcjz, "showPercent", str2);
      str2 = paramDataLabels.getShowBubbleSize() ? "1" : "0";
      a(paramzcjz, "showBubbleSize", str2);
      if (paramBoolean)
      {
        str2 = ((Series)paramDataLabels.R()).hasLeaderLines() ? "1" : "0";
        a(paramzcjz, "showLeaderLines", str2);
      }
      if (str1 != null) {
        paramzcjz.b("c:separator", str1);
      }
    }
  }
  
  private void a(zcjz paramzcjz, Axis paramAxis, boolean paramBoolean)
    throws Exception
  {
    String str1 = "minMax";
    if (paramAxis.isPlotOrderReversed()) {
      str1 = "maxMin";
    }
    paramzcjz.c("c:scaling", null);
    if (paramAxis.isLogarithmic()) {
      a(paramzcjz, "logBase", zauj.b(paramAxis.getLogBase()));
    }
    a(paramzcjz, "orientation", str1);
    String str2;
    if (!paramAxis.f())
    {
      str2 = a(paramAxis.getMaxValue(), paramBoolean);
      a(paramzcjz, "max", str2);
    }
    if (!paramAxis.e())
    {
      str2 = a(paramAxis.getMinValue(), paramBoolean);
      a(paramzcjz, "min", str2);
    }
    paramzcjz.b();
  }
  
  static String a(Object paramObject, boolean paramBoolean)
  {
    String str;
    if ((paramObject instanceof Double))
    {
      double d1 = ((Double)paramObject).doubleValue();
      if (paramBoolean) {
        d1 *= 0.01D;
      }
      str = zauj.b(d1);
    }
    else if ((paramObject instanceof DateTime))
    {
      DateTime localDateTime = (DateTime)paramObject;
      str = zauj.b(localDateTime.h());
    }
    else
    {
      str = zs.a(paramObject);
    }
    return str;
  }
  
  private void a(zcjz paramzcjz, Axis paramAxis)
    throws Exception
  {
    if (paramAxis.n() != null) {
      a(paramzcjz, paramAxis.n());
    }
    if ((paramAxis.o() != null) || (zauj.O(this.b.getType())))
    {
      paramzcjz.c("c:majorGridlines", null);
      a(paramzcjz, paramAxis.s());
      paramzcjz.b();
    }
    if (paramAxis.p() != null)
    {
      paramzcjz.c("c:minorGridlines", null);
      a(paramzcjz, paramAxis.t());
      paramzcjz.b();
    }
    if (paramAxis.isVisible())
    {
      paramzcjz.c("c:numFmt", null);
      if (!paramAxis.getTickLabels().getNumberFormatLinked())
      {
        str1 = a(this.c, paramAxis.getTickLabels());
        paramzcjz.a("formatCode", str1);
        paramzcjz.a("sourceLinked", "0");
      }
      else
      {
        str1 = a(this.c, paramAxis.getTickLabels());
        paramzcjz.a("formatCode", str1);
        paramzcjz.a("sourceLinked", "1");
      }
      paramzcjz.b();
    }
    String str1 = zauj.r(paramAxis.getMajorTickMark());
    a(paramzcjz, "majorTickMark", str1);
    str1 = zauj.r(paramAxis.getMinorTickMark());
    a(paramzcjz, "minorTickMark", str1);
    String str2 = zauj.s(paramAxis.getTickLabelPosition());
    if ((zauj.O(this.b.getType())) && (paramAxis.b() == 0) && (this.b.i.getCount() > 0) && (!this.b.i.a(0).M())) {
      str2 = "none";
    }
    a(paramzcjz, "tickLblPos", str2);
    a(paramzcjz, paramAxis.r());
    if ((!a(this.b.getChartArea().j(), paramAxis.getTickLabels().a())) || (!paramAxis.getTickLabels().c()))
    {
      Font localFont = paramAxis.getTickLabels().a();
      if ((localFont == null) && (!paramAxis.getTickLabels().c())) {
        localFont = paramAxis.getTickLabels().getFont();
      }
      a(paramzcjz, this.c, localFont, paramAxis.getTickLabels().c(), paramAxis.getTickLabels().getRotationAngle(), null, paramAxis.getTickLabels().e(), paramAxis.getTickLabels().f(), paramAxis.getTickLabels().getTextDirection());
    }
  }
  
  private void n(zcjz paramzcjz)
    throws Exception
  {
    Axis localAxis1 = this.b.getSeriesAxis();
    paramzcjz.c("c:serAx", null);
    a(paramzcjz, "axId", zauj.z(localAxis1.hashCode()));
    a(paramzcjz, localAxis1, false);
    a(paramzcjz, "delete", localAxis1.isVisible() ? "0" : "1");
    String str1 = "b";
    a(paramzcjz, "axPos", str1);
    a(paramzcjz, localAxis1);
    Axis localAxis2 = this.b.getValueAxis();
    a(paramzcjz, "crossAx", zauj.z(localAxis2.hashCode()));
    if (localAxis2.getCrossType() != 2)
    {
      String str2 = zauj.t(localAxis2.getCrossType());
      a(paramzcjz, "crosses", str2);
    }
    else
    {
      double d1 = localAxis2.getCrossAt();
      a(paramzcjz, "crossesAt", zauj.b(d1));
    }
    if (!localAxis1.l()) {
      a(paramzcjz, "tickLblSkip", zauj.z(localAxis1.getTickLabelSpacing()));
    }
    a(paramzcjz, "tickMarkSkip", zauj.z(localAxis1.getTickMarkSpacing()));
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Axis paramAxis1, Axis paramAxis2, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    int i = paramAxis1.getCategoryType();
    if ((i == 0) && ("dateAx".equals(paramAxis1.d))) {
      i = 2;
    }
    if (i == 2) {
      paramzcjz.c("c:dateAx", null);
    } else {
      paramzcjz.c("c:catAx", null);
    }
    a(paramzcjz, "axId", zauj.z(paramAxis1.hashCode()));
    a(paramzcjz, paramAxis1, false);
    a(paramzcjz, "delete", paramAxis1.isVisible() ? "0" : "1");
    String str1 = a(paramAxis1, paramAxis2, false, paramBoolean2);
    a(paramzcjz, "axPos", str1);
    a(paramzcjz, paramAxis1);
    a(paramzcjz, "crossAx", zauj.z(paramAxis2.hashCode()));
    if (paramAxis2.getCrossType() != 2)
    {
      String str2 = zauj.t(paramAxis2.getCrossType());
      a(paramzcjz, "crosses", str2);
    }
    else
    {
      double d1 = paramAxis2.getCrossAt();
      if (paramBoolean1) {
        d1 *= 0.01D;
      }
      a(paramzcjz, "crossesAt", zauj.b(d1));
    }
    if (paramAxis1.g) {
      if (paramAxis1.getCategoryType() == 0) {
        a(paramzcjz, "auto", "1");
      } else {
        a(paramzcjz, "auto", "0");
      }
    }
    if (i == 2)
    {
      a(paramzcjz, "lblOffset", zauj.z(paramAxis1.getTickLabels().getOffset()));
      String str3;
      if (!paramAxis1.isBaseUnitAuto())
      {
        str3 = zauj.E(paramAxis1.getBaseUnitScale());
        a(paramzcjz, "baseTimeUnit", str3);
      }
      if (!paramAxis1.g())
      {
        a(paramzcjz, "majorUnit", zauj.b(paramAxis1.getMajorUnit()));
        str3 = zauj.E(paramAxis1.getMajorUnitScale());
        a(paramzcjz, "majorTimeUnit", str3);
      }
      if (!paramAxis1.h())
      {
        a(paramzcjz, "minorUnit", zauj.b(paramAxis1.getMinorUnit()));
        str3 = zauj.E(paramAxis1.getMinorUnitScale());
        a(paramzcjz, "minorTimeUnit", str3);
      }
    }
    else
    {
      a(paramzcjz, "lblOffset", zauj.z(paramAxis1.getTickLabels().getOffset()));
      if (!paramAxis1.l()) {
        a(paramzcjz, "tickLblSkip", zauj.z(paramAxis1.getTickLabelSpacing()));
      }
      if (paramAxis1.getTickMarkSpacing() != 1) {
        a(paramzcjz, "tickMarkSkip", zauj.z(paramAxis1.getTickMarkSpacing()));
      }
    }
    a(paramzcjz, "noMultiLvlLbl", paramAxis1.hasMultiLevelLabels() ? "0" : "1");
    paramzcjz.b();
  }
  
  private String a(Axis paramAxis1, Axis paramAxis2, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str = null;
    if (paramBoolean1)
    {
      if (paramAxis1.b() == 0) {
        str = paramAxis2.isPlotOrderReversed() ? "t" : "b";
      } else if (paramBoolean2) {
        str = paramAxis2.isPlotOrderReversed() ? "t" : "b";
      } else {
        str = paramAxis2.isPlotOrderReversed() ? "r" : "l";
      }
    }
    else if (paramBoolean2) {
      str = paramAxis2.isPlotOrderReversed() ? "r" : "l";
    } else {
      str = paramAxis2.isPlotOrderReversed() ? "t" : "b";
    }
    return str;
  }
  
  private void a(zcjz paramzcjz, Axis paramAxis1, Axis paramAxis2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    throws Exception
  {
    paramzcjz.c("c:valAx", null);
    a(paramzcjz, "axId", zauj.z(paramAxis1.hashCode()));
    a(paramzcjz, paramAxis1, paramBoolean1);
    a(paramzcjz, "delete", paramAxis1.isVisible() ? "0" : "1");
    String str1 = a(paramAxis1, paramAxis2, true, paramBoolean2);
    a(paramzcjz, "axPos", str1);
    a(paramzcjz, paramAxis1);
    a(paramzcjz, "crossAx", zauj.z(paramAxis2.hashCode()));
    if (paramAxis2.getCrossType() != 2)
    {
      str2 = zauj.t(paramAxis2.getCrossType());
      a(paramzcjz, "crosses", str2);
    }
    else
    {
      a(paramzcjz, "crossesAt", zauj.b(paramAxis2.getCrossAt()));
    }
    String str2 = "midCat";
    if ((!paramBoolean3) && (paramAxis2.getAxisBetweenCategories())) {
      str2 = "between";
    }
    a(paramzcjz, "crossBetween", str2);
    b(paramzcjz, paramAxis1);
    double d1;
    if (!paramAxis1.g())
    {
      d1 = paramAxis1.getMajorUnit();
      if (paramBoolean1) {
        d1 *= 0.01D;
      }
      a(paramzcjz, "majorUnit", zauj.b(d1));
    }
    if (!paramAxis1.h())
    {
      d1 = paramAxis1.getMinorUnit();
      if (paramBoolean1) {
        d1 *= 0.01D;
      }
      a(paramzcjz, "minorUnit", zauj.b(d1));
    }
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, Axis paramAxis)
    throws Exception
  {
    if (paramAxis.getDisplayUnit() != 0)
    {
      paramzcjz.c("c:dispUnits", null);
      if (paramAxis.getDisplayUnit() != 0) {
        if (paramAxis.getDisplayUnit() != 11) {
          a(paramzcjz, "builtInUnit", zauj.ak(paramAxis.getDisplayUnit()));
        } else {
          a(paramzcjz, "custUnit", zp.a(paramAxis.getCustUnit()));
        }
      }
      if ((paramAxis.m() != null) && (paramAxis.isDisplayUnitLabelShown())) {
        a(paramzcjz, paramAxis.getDisplayUnitLabel());
      }
      paramzcjz.b();
    }
  }
  
  private void a(zcjz paramzcjz, DisplayUnitLabel paramDisplayUnitLabel)
    throws Exception
  {
    paramzcjz.c("c:dispUnitsLbl", null);
    boolean bool1 = paramDisplayUnitLabel.p();
    boolean bool2 = (paramDisplayUnitLabel.m()) && (paramDisplayUnitLabel.p());
    if ((paramDisplayUnitLabel.y()) && (paramDisplayUnitLabel.D() == 2003) && (!paramDisplayUnitLabel.isDefaultPosBeSet())) {
      paramDisplayUnitLabel.getChart().a(false, false);
    }
    a(paramzcjz, paramDisplayUnitLabel, "edge", bool1, bool2, paramDisplayUnitLabel.isInnerMode());
    if (paramDisplayUnitLabel.getText() != null) {
      b(paramzcjz, paramDisplayUnitLabel);
    }
    a(paramzcjz, paramDisplayUnitLabel.getShapeProperties());
    if (!a(this.b.getChartArea().j(), paramDisplayUnitLabel.j())) {
      a(paramzcjz, this.c, paramDisplayUnitLabel.getFont(), false, paramDisplayUnitLabel.getRotationAngle(), null, paramDisplayUnitLabel.H(), paramDisplayUnitLabel.I(), paramDisplayUnitLabel.getTextDirection());
    }
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, DisplayUnitLabel paramDisplayUnitLabel)
    throws Exception
  {
    if ((paramDisplayUnitLabel.getText() == null) || (paramDisplayUnitLabel.getLinkedSource() == null)) {
      return;
    }
    paramzcjz.c("c:tx", null);
    Object localObject;
    if (paramDisplayUnitLabel.getLinkedSource() != null)
    {
      localObject = paramDisplayUnitLabel.F();
      String[] arrayOfString;
      if (localObject == null) {
        arrayOfString = null;
      } else {
        arrayOfString = new String[] { localObject };
      }
      a(paramzcjz, paramDisplayUnitLabel.getLinkedSource(), arrayOfString);
    }
    else
    {
      paramzcjz.c("c:rich", null);
      a(paramzcjz, paramDisplayUnitLabel.getTextVerticalAlignment(), false, paramDisplayUnitLabel.getRotationAngle(), paramDisplayUnitLabel.H(), paramDisplayUnitLabel.I(), paramDisplayUnitLabel.getTextDirection(), true, false);
      paramzcjz.b("a:lstStyle", null);
      localObject = zpm.a(paramDisplayUnitLabel, this.c);
      a(paramzcjz, (zpm)localObject, 0);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void o(zcjz paramzcjz)
    throws Exception
  {
    if (!this.b.getShowLegend()) {
      return;
    }
    Legend localLegend = this.b.getLegend();
    paramzcjz.c("c:legend", null);
    int i = localLegend.getPosition();
    if ((i == 7) && (!localLegend.G())) {
      i = 0;
    }
    String str = zauj.q(i);
    a(paramzcjz, "legendPos", str);
    a(paramzcjz, localLegend);
    boolean bool1 = localLegend.p();
    boolean bool2 = (localLegend.m()) && (localLegend.p());
    a(paramzcjz, localLegend, "edge", bool1, bool2, localLegend.isInnerMode());
    if (!localLegend.isOverLay()) {
      a(paramzcjz, "overlay", "0");
    } else {
      a(paramzcjz, "overlay", "1");
    }
    a(paramzcjz, localLegend.getShapeProperties());
    if (!a(this.b.getChartArea().j(), localLegend.j())) {
      a(paramzcjz, this.c, localLegend.getFont(), false, 0, null, false, false, 0);
    }
    paramzcjz.b();
  }
  
  private void p(zcjz paramzcjz)
    throws Exception
  {
    if (!this.b.getShowDataTable()) {
      return;
    }
    ChartDataTable localChartDataTable = this.b.u();
    paramzcjz.c("c:dTable", null);
    if (localChartDataTable == null)
    {
      a(paramzcjz, "showHorzBorder", "1");
      a(paramzcjz, "showVertBorder", "1");
      a(paramzcjz, "showOutline", "1");
      a(paramzcjz, "showKeys", "1");
    }
    else
    {
      if (localChartDataTable.hasBorderHorizontal()) {
        a(paramzcjz, "showHorzBorder", "1");
      } else {
        a(paramzcjz, "showHorzBorder", "0");
      }
      if (localChartDataTable.hasBorderVertical()) {
        a(paramzcjz, "showVertBorder", "1");
      } else {
        a(paramzcjz, "showVertBorder", "0");
      }
      if (localChartDataTable.hasBorderOutline()) {
        a(paramzcjz, "showOutline", "1");
      } else {
        a(paramzcjz, "showOutline", "0");
      }
      if (localChartDataTable.getShowLegendKey()) {
        a(paramzcjz, "showKeys", "1");
      } else {
        a(paramzcjz, "showKeys", "0");
      }
      if (localChartDataTable.c() != null) {
        a(paramzcjz, localChartDataTable.d());
      }
      if (!a(this.b.getChartArea().j(), localChartDataTable.a())) {
        a(paramzcjz, this.c, localChartDataTable.getFont(), false, 0, null, false, false, 0);
      }
    }
    paramzcjz.b();
  }
  
  private void l(zcjz paramzcjz, zka paramzka)
    throws Exception
  {
    String str1;
    String str2;
    if (!paramzka.m())
    {
      str1 = zauj.z(this.b.getCategoryAxis().hashCode());
      str2 = zauj.z(this.b.getValueAxis().hashCode());
    }
    else
    {
      str1 = zauj.z(this.b.getSecondCategoryAxis().hashCode());
      str2 = zauj.z(this.b.getSecondValueAxis().hashCode());
    }
    a(paramzcjz, "axId", str1);
    a(paramzcjz, "axId", str2);
    if (ChartCollection.f(paramzka.j()))
    {
      String str3 = zauj.z(this.b.getSeriesAxis().hashCode());
      a(paramzcjz, "axId", str3);
    }
  }
  
  private void a(zcjz paramzcjz, ErrorBar paramErrorBar)
    throws Exception
  {
    paramzcjz.c("c:errBars", null);
    String str = "";
    if (!paramErrorBar.a)
    {
      str = paramErrorBar.a() ? "y" : "x";
      a(paramzcjz, "c", "errDir", str);
    }
    str = zauj.G(paramErrorBar.getDisplayType());
    a(paramzcjz, "c", "errBarType", str);
    str = zauj.H(paramErrorBar.getType());
    a(paramzcjz, "c", "errValType", str);
    if (paramErrorBar.getType() == 0)
    {
      if (paramErrorBar.b() != null)
      {
        paramzcjz.c("c:plus", null);
        a(paramzcjz, paramErrorBar.b(), false, false);
        paramzcjz.b();
      }
      if (paramErrorBar.c() != null)
      {
        paramzcjz.c("c:minus", null);
        a(paramzcjz, paramErrorBar.c(), false, false);
        paramzcjz.b();
      }
    }
    else if (paramErrorBar.getType() != 4)
    {
      a(paramzcjz, "c", "val", zauj.b(paramErrorBar.getAmount()));
    }
    if (paramErrorBar.getShowMarkerTTop()) {
      a(paramzcjz, "c", "noEndCap", "0");
    } else {
      a(paramzcjz, "c", "noEndCap", "1");
    }
    a(paramzcjz, paramErrorBar.e());
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, TrendlineCollection paramTrendlineCollection)
    throws Exception
  {
    for (int i = 0; i < paramTrendlineCollection.getCount(); i++)
    {
      Trendline localTrendline = paramTrendlineCollection.get(i);
      paramzcjz.c("c:trendline", null);
      if (!localTrendline.isNameAuto()) {
        paramzcjz.b("c:name", localTrendline.getName());
      }
      a(paramzcjz, localTrendline.e());
      String str = zauj.F(localTrendline.getType());
      a(paramzcjz, "c", "trendlineType", str);
      if (localTrendline.getType() == 4) {
        a(paramzcjz, "c", "order", zauj.z(localTrendline.getOrder()));
      }
      if (localTrendline.getType() == 3) {
        a(paramzcjz, "c", "period", zauj.z(localTrendline.getPeriod()));
      }
      if (localTrendline.getType() != 3)
      {
        if (localTrendline.getForward() != 0.0D) {
          a(paramzcjz, "c", "forward", zauj.b(localTrendline.getForward()));
        }
        if (localTrendline.getBackward() != 0.0D) {
          a(paramzcjz, "c", "backward", zauj.b(localTrendline.getBackward()));
        }
        if ((localTrendline.getType() != 2) && (localTrendline.getType() != 5) && (localTrendline.c())) {
          a(paramzcjz, "c", "intercept", zauj.b(localTrendline.getIntercept()));
        }
        if (localTrendline.getDisplayRSquared()) {
          a(paramzcjz, "c", "dispRSqr", "1");
        } else {
          a(paramzcjz, "c", "dispRSqr", "0");
        }
        if (localTrendline.getDisplayEquation()) {
          a(paramzcjz, "c", "dispEq", "1");
        } else {
          a(paramzcjz, "c", "dispEq", "0");
        }
      }
      DataLabels localDataLabels = localTrendline.b();
      if (localDataLabels != null)
      {
        paramzcjz.c("c:trendlineLbl", null);
        if ((!localDataLabels.n()) || (localDataLabels.x()) || (localDataLabels.y())) {
          a(paramzcjz, localDataLabels, 2);
        }
        Object localObject;
        if ((localDataLabels.F() != null) && (localDataLabels.F().length() > 0) && (!localDataLabels.isAutoText()))
        {
          b(paramzcjz, localDataLabels, false);
        }
        else if ((localDataLabels.j() != null) || (localDataLabels.getRotationAngle() != 0))
        {
          localObject = localDataLabels.j();
          if ((localObject == null) && (localDataLabels.getRotationAngle() != 0)) {
            localObject = localDataLabels.getFont();
          }
          a(paramzcjz, this.c, (Font)localObject, false, localDataLabels.getRotationAngle(), localDataLabels, localDataLabels.H(), localDataLabels.I(), localDataLabels.getTextDirection());
        }
        if (localDataLabels.O())
        {
          paramzcjz.c("c:numFmt", null);
          localObject = a(this.c, localDataLabels);
          paramzcjz.a("formatCode", (String)localObject);
          if (localDataLabels.N()) {
            paramzcjz.a("sourceLinked", "1");
          }
          paramzcjz.b();
        }
        boolean bool = a(paramzcjz, localDataLabels.getShapeProperties());
        if ((!bool) && (localDataLabels.getRotationAngle() != 0)) {
          paramzcjz.b("c:spPr", null);
        }
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private void a(zcjz paramzcjz, Legend paramLegend)
    throws Exception
  {
    if (paramLegend.F() == null) {
      return;
    }
    int i = paramLegend.getLegendEntries().getCount();
    if (i == 0) {
      return;
    }
    for (int j = 0; j < i; j++)
    {
      LegendEntry localLegendEntry = paramLegend.getLegendEntries().b(j);
      boolean bool = a(paramLegend.j(), localLegendEntry.a());
      if ((localLegendEntry.isDeleted()) || (!bool))
      {
        paramzcjz.c("c:legendEntry", null);
        int k = localLegendEntry.c();
        if (this.e != null)
        {
          Object localObject = this.e.get(Integer.valueOf(k));
          if (localObject != null) {
            k = ((Integer)localObject).intValue();
          }
        }
        a(paramzcjz, "idx", zauj.z(k));
        if (localLegendEntry.isDeleted()) {
          a(paramzcjz, "delete", "1");
        } else if (!bool) {
          a(paramzcjz, this.c, localLegendEntry.a(), false, 0, null, false, false, 0);
        }
        paramzcjz.b();
      }
    }
  }
  
  private void f(zcjz paramzcjz, Series paramSeries)
    throws Exception
  {
    if ((paramSeries.getName() == null) || (paramSeries.getName().length() == 0)) {
      return;
    }
    paramzcjz.c("c:tx", null);
    if (paramSeries.getName().charAt(0) != '=')
    {
      paramzcjz.c("c:v", null);
      paramzcjz.a(zauj.a(paramSeries.getName()));
      paramzcjz.b();
    }
    else
    {
      paramzcjz.c("c:strRef", null);
      paramzcjz.c("c:f", null);
      paramzcjz.a(paramSeries.getName().substring(1));
      paramzcjz.b();
      if (paramSeries.c != null)
      {
        paramzcjz.c("c:strCache", null);
        paramzcjz.c("c:ptCount", null);
        paramzcjz.a("val", "1");
        paramzcjz.b();
        paramzcjz.c("c:pt", null);
        paramzcjz.a("idx", "0");
        paramzcjz.c("c:v", null);
        paramzcjz.a(paramSeries.c);
        paramzcjz.b();
        paramzcjz.b();
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, String paramString)
    throws Exception
  {
    paramString = zauj.L(paramString);
    paramzcjz.c("c:strRef", null);
    paramzcjz.c("c:f", null);
    paramzcjz.a(paramString);
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, String paramString, String[] paramArrayOfString)
    throws Exception
  {
    paramString = zauj.L(paramString);
    paramzcjz.c("c:strRef", null);
    paramzcjz.c("c:f", null);
    paramzcjz.a(paramString);
    paramzcjz.b();
    if ((paramArrayOfString != null) && (paramArrayOfString.length != 0))
    {
      paramzcjz.c("c:strCache", null);
      paramzcjz.c("c:ptCount", null);
      paramzcjz.a("val", zauj.z(paramArrayOfString.length));
      paramzcjz.b();
      for (int i = 0; i < paramArrayOfString.length; i++)
      {
        paramzcjz.c("c:pt", null);
        paramzcjz.a("idx", zauj.z(i));
        paramzcjz.b("c:v", paramArrayOfString[i]);
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, int paramInt3, boolean paramBoolean4, boolean paramBoolean5)
    throws Exception
  {
    paramzcjz.c("a:bodyPr", null);
    if (paramBoolean2)
    {
      if (paramInt3 == 2) {
        paramzcjz.a("vert", "wordArtVertRtl");
      } else {
        paramzcjz.a("vert", "wordArtVert");
      }
      paramzcjz.a("rot", "0");
    }
    else if (paramBoolean3)
    {
      paramzcjz.a("rot", "0");
      paramzcjz.a("vert", "eaVert");
    }
    else if (!paramBoolean1)
    {
      paramzcjz.a("vert", "horz");
      paramzcjz.a("rot", zauj.z(paramInt2 * -60000));
    }
    if (!paramBoolean4) {
      paramzcjz.a("wrap", "none");
    }
    if (paramBoolean5) {
      paramzcjz.b("a:spAutoFit", null);
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, int paramInt1, int paramInt2)
    throws Exception
  {
    paramzcjz.c("a:pPr", null);
    if (paramInt1 != 7)
    {
      String str = zauj.D(paramInt1);
      paramzcjz.a("algn", str);
    }
    if (paramInt2 == 2) {
      paramzcjz.a("rtl", "1");
    }
    paramzcjz.b("a:defRPr", null);
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, Title paramTitle)
    throws Exception
  {
    String str = paramTitle.getLinkedSource();
    if ((str == null) && (paramTitle.getText() == null)) {
      return;
    }
    paramzcjz.c("c:tx", null);
    if (str != null)
    {
      a(paramzcjz, str);
    }
    else
    {
      paramzcjz.c("c:rich", null);
      a(paramzcjz, paramTitle.getTextVerticalAlignment(), false, paramTitle.getRotationAngle(), paramTitle.H(), paramTitle.I(), paramTitle.getTextDirection(), true, false);
      paramzcjz.b("a:lstStyle", null);
      zpm localzpm = zpm.a(paramTitle, this.c);
      a(paramzcjz, localzpm, 0);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, zpm paramzpm, int paramInt)
    throws Exception
  {
    paramzcjz.c("a", "p", null);
    a(paramzcjz, paramzpm.b, paramzpm.c);
    Font localFont1 = paramzpm.d;
    if ((paramzpm.f == null) || (paramzpm.f.size() == 0))
    {
      a(paramzcjz, localFont1, paramzpm.e, paramzpm.g, paramzpm.h, paramzpm.a);
    }
    else
    {
      int i = paramzpm.f.size();
      for (int j = paramInt; j < i; j++)
      {
        FontSetting localFontSetting = (FontSetting)paramzpm.f.get(j);
        if (localFontSetting.getLength() > 0)
        {
          if ((j == 0) && (localFontSetting.getStartIndex() != 0)) {
            a(paramzcjz, localFont1, paramzpm.e.substring(0, 0 + localFontSetting.getStartIndex()), paramzpm.g, paramzpm.h, paramzpm.a);
          }
          Font localFont2 = localFontSetting.h();
          if (localFont2 == null) {
            localFont2 = localFont1;
          }
          int k = localFontSetting.getStartIndex();
          int m = localFontSetting.getLength();
          if (paramzpm.e.length() < k + m) {
            m = paramzpm.e.length() - k;
          }
          if ((paramzpm.e.length() >= k + m) && (m > 0))
          {
            String str = paramzpm.e.substring(k, k + m);
            if ((j > paramInt) && (str.startsWith("\n")))
            {
              paramzcjz.b();
              paramzcjz.e();
              a(paramzcjz, paramzpm, j);
              return;
            }
            if ((j != 0) && (j == paramInt) && (str.startsWith("\n"))) {
              str = str.substring(1, 1 + (str.length() - 1));
            }
            a(paramzcjz, localFont2, str, paramzpm.g, paramzpm.h, paramzpm.a);
          }
          if ((j == i - 1) && (localFontSetting.getStartIndex() + localFontSetting.getLength() < paramzpm.e.length())) {
            a(paramzcjz, localFont1, paramzpm.e.substring(localFontSetting.getStartIndex() + localFontSetting.getLength()), paramzpm.g, paramzpm.h, paramzpm.a);
          }
        }
      }
    }
    if (paramzpm.i != null)
    {
      Object localObject = paramzpm.i.a(1);
      if (localObject != null) {
        paramzcjz.d((String)localObject);
      }
    }
    paramzcjz.b();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz, DataLabels paramDataLabels, boolean paramBoolean)
    throws Exception
  {
    boolean bool = false;
    if (paramBoolean) {
      bool = paramDataLabels.Z();
    }
    if ((paramDataLabels.F() == null) && (paramDataLabels.i == null) && (!bool)) {
      return;
    }
    paramzcjz.c("c:tx", null);
    Object localObject;
    if (paramDataLabels.getLinkedSource() != null)
    {
      localObject = paramDataLabels.F();
      String[] arrayOfString;
      if (localObject == null) {
        arrayOfString = null;
      } else {
        arrayOfString = new String[] { localObject };
      }
      a(paramzcjz, paramDataLabels.getLinkedSource(), arrayOfString);
    }
    else
    {
      paramzcjz.c("c:rich", null);
      a(paramzcjz, paramDataLabels.getTextVerticalAlignment(), false, paramDataLabels.getRotationAngle(), paramDataLabels.H(), paramDataLabels.I(), paramDataLabels.getTextDirection(), paramDataLabels.j, paramDataLabels.isResizeShapeToFitText());
      paramzcjz.b("a:lstStyle", null);
      localObject = zpm.a(paramDataLabels, this.c);
      ((zpm)localObject).a = true;
      a(paramzcjz, (zpm)localObject, 0);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, ChartFrame paramChartFrame)
    throws Exception
  {
    Font localFont = paramChartFrame.j();
    if (localFont == null) {
      return;
    }
    paramzcjz.c("c:txPr", null);
    boolean bool1 = false;
    int i = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    int k = 9;
    boolean bool4 = false;
    boolean bool5 = true;
    ChartTextFrame localChartTextFrame = null;
    if ((paramChartFrame instanceof ChartTextFrame))
    {
      localChartTextFrame = (ChartTextFrame)paramChartFrame;
      k = localChartTextFrame.getTextVerticalAlignment();
      bool1 = localChartTextFrame.a();
      i = localChartTextFrame.getRotationAngle();
      bool2 = localChartTextFrame.H();
      bool3 = localChartTextFrame.I();
      j = localChartTextFrame.getTextDirection();
      k = localChartTextFrame.getTextVerticalAlignment();
      bool4 = false;
      bool5 = localChartTextFrame.j;
      bool4 = localChartTextFrame.isResizeShapeToFitText();
    }
    a(paramzcjz, k, bool1, i, bool2, bool3, j, bool5, bool4);
    paramzcjz.b("a:lstStyle", null);
    paramzcjz.c("a:p", null);
    paramzcjz.c("a:pPr", null);
    if (localChartTextFrame != null)
    {
      if (localChartTextFrame.getTextHorizontalAlignment() != 7)
      {
        String str = zauj.D(localChartTextFrame.getTextHorizontalAlignment());
        paramzcjz.a("algn", str);
      }
      if (localChartTextFrame.getTextDirection() == 2) {
        paramzcjz.a("rtl", "1");
      }
    }
    a(paramzcjz, localFont, "a:defRPr", paramChartFrame.getChart().getWorksheet().d());
    paramzcjz.b();
    if ((localChartTextFrame != null) && (!zw.b(localChartTextFrame.getText())))
    {
      paramzcjz.b("a:r");
      paramzcjz.b("a:t", localChartTextFrame.getText());
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, Workbook paramWorkbook, Font paramFont, boolean paramBoolean1, int paramInt1, ChartTextFrame paramChartTextFrame, boolean paramBoolean2, boolean paramBoolean3, int paramInt2)
    throws Exception
  {
    if (paramFont == null) {
      return;
    }
    paramzcjz.c("c:txPr", null);
    int i = 9;
    boolean bool1 = false;
    boolean bool2 = true;
    if (paramChartTextFrame != null)
    {
      i = paramChartTextFrame.getTextVerticalAlignment();
      bool2 = paramChartTextFrame.j;
      bool1 = paramChartTextFrame.isResizeShapeToFitText();
    }
    a(paramzcjz, i, paramBoolean1, paramInt1, paramBoolean2, paramBoolean3, paramInt2, bool2, bool1);
    paramzcjz.b("a:lstStyle", null);
    paramzcjz.c("a:p", null);
    if (paramFont != null)
    {
      paramzcjz.c("a:pPr", null);
      if (paramChartTextFrame != null)
      {
        if (paramChartTextFrame.getTextHorizontalAlignment() != 7)
        {
          String str = zauj.D(paramChartTextFrame.getTextHorizontalAlignment());
          paramzcjz.a("algn", str);
        }
        if (paramChartTextFrame.getTextDirection() == 2) {
          paramzcjz.a("rtl", "1");
        }
      }
      a(paramzcjz, paramFont, "a:defRPr", paramWorkbook);
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, Font paramFont, String paramString1, Workbook paramWorkbook, String paramString2, boolean paramBoolean)
    throws Exception
  {
    if ((paramString2 == null) && (paramBoolean)) {
      switch (f.a(paramString1))
      {
      case 0: 
        paramString2 = "SERIESNAME";
        break;
      case 1: 
        paramString2 = "CATEGORYNAME";
        break;
      case 2: 
        paramString2 = "VALUE";
        break;
      case 3: 
        paramString2 = "CELLRANGE";
        break;
      case 4: 
        paramString2 = "PERCENTAGE";
        break;
      }
    }
    if (paramString2 != null)
    {
      paramzcjz.c("a", "fld", null);
      paramzcjz.a("id", zum.d());
      paramzcjz.a("type", paramString2);
    }
    else
    {
      paramzcjz.c("a", "r", null);
    }
    a(paramzcjz, paramFont, "a:rPr", paramWorkbook);
    paramzcjz.c("a", "t", null);
    if (paramString1 != null) {
      paramzcjz.a(zauj.a(paramString1));
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, Font paramFont, String paramString, Workbook paramWorkbook)
    throws Exception
  {
    paramzcjz.b(paramString);
    paramzcjz.a("lang", "en-US");
    if (paramFont != null)
    {
      if (paramFont.f(12)) {
        paramzcjz.a("sz", zauj.z(paramFont.j() * 5));
      }
      if (paramFont.f(17)) {
        paramzcjz.a("b", paramFont.isBold() ? "1" : "0");
      }
      if (paramFont.f(18)) {
        paramzcjz.a("i", paramFont.isItalic() ? "1" : "0");
      }
      paramzcjz.a("u", zauj.v(paramFont.getUnderline()));
      if (paramFont.getStrikeType() == 0) {
        paramzcjz.a("strike", "sngStrike");
      } else if (paramFont.getStrikeType() == 1) {
        paramzcjz.a("strike", "dblStrike");
      }
      paramzcjz.a("baseline", zauj.z(a(paramFont)));
      if (paramFont.getCapsType() == 2) {
        paramzcjz.a("cap", "small");
      } else if (paramFont.getCapsType() == 1) {
        paramzcjz.a("cap", "all");
      }
      if (paramFont.isNormalizeHeights()) {
        paramzcjz.a("normalizeH", "1");
      }
      if (paramFont.b().a())
      {
        paramzcjz.b("a:noFill", null);
      }
      else if (!paramFont.k())
      {
        paramzcjz.c("a", "solidFill", null);
        zvl.a(paramzcjz, paramFont.b(), -1, paramWorkbook);
        paramzcjz.b();
      }
      if ((paramFont.f(13)) || ((paramFont.getName() != null) && ("arial".equals(paramFont.getName().toLowerCase())))) {
        if (paramFont.n() == 1)
        {
          a(paramzcjz, "a", "latin", "typeface", "+mj-lt");
          a(paramzcjz, "a", "ea", "typeface", "+mj-ea");
          a(paramzcjz, "a", "cs", "typeface", "+mj-cs");
        }
        else if (paramFont.n() == 2)
        {
          a(paramzcjz, "a", "latin", "typeface", "+mn-lt");
          a(paramzcjz, "a", "ea", "typeface", "+mn-ea");
          a(paramzcjz, "a", "cs", "typeface", "+mn-cs");
        }
        else
        {
          a(paramzcjz, "a", "latin", "typeface", paramFont.getName());
          a(paramzcjz, "a", "ea", "typeface", paramFont.getName());
          a(paramzcjz, "a", "cs", "typeface", paramFont.getName());
        }
      }
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zrb paramzrb)
    throws Exception
  {
    paramzcjz.c("c:layout", null);
    paramzcjz.c("c:manualLayout", null);
    if (paramzrb.a != null) {
      a(paramzcjz, "layoutTarget", paramzrb.a);
    }
    if (paramzrb.b != null) {
      a(paramzcjz, "xMode", paramzrb.b);
    }
    if (paramzrb.c != null) {
      a(paramzcjz, "yMode", paramzrb.c);
    }
    if (paramzrb.d != null) {
      a(paramzcjz, "wMode", paramzrb.d);
    }
    if (paramzrb.e != null) {
      a(paramzcjz, "hMode", paramzrb.e);
    }
    if (paramzrb.f != null) {
      a(paramzcjz, "x", paramzrb.f);
    }
    if (paramzrb.g != null) {
      a(paramzcjz, "y", paramzrb.g);
    }
    if (paramzrb.h != null) {
      a(paramzcjz, "w", paramzrb.h);
    }
    if (paramzrb.i != null) {
      a(paramzcjz, "h", paramzrb.i);
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, ChartFrame paramChartFrame, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    throws Exception
  {
    int i = (paramChartFrame instanceof PlotArea) ? 1 : 0;
    PlotArea localPlotArea = null;
    if (i != 0) {
      localPlotArea = (PlotArea)paramChartFrame;
    }
    if (paramChartFrame.d != null)
    {
      a(paramzcjz, paramChartFrame.d);
    }
    else if ((paramBoolean2) || (this.b.getChartObject().getWidthPt() <= 0.0D) || (this.b.getChartObject().getHeightPt() <= 0.0D))
    {
      paramzcjz.b("c:layout", null);
    }
    else
    {
      paramzcjz.c("c:layout", null);
      paramzcjz.c("c:manualLayout", null);
      if (paramBoolean3) {
        a(paramzcjz, "layoutTarget", "inner");
      }
      a(paramzcjz, "xMode", paramString);
      a(paramzcjz, "yMode", paramString);
      double d1;
      double d2;
      if ((paramBoolean3) && (i != 0))
      {
        a(paramzcjz, "x", zauj.b(localPlotArea.getInnerX() / 4000.0D));
        a(paramzcjz, "y", zauj.b(localPlotArea.getInnerY() / 4000.0D));
      }
      else
      {
        d1 = paramChartFrame.q() / 4000.0D;
        if (d1 < 0.0D) {
          d1 = 0.0D;
        }
        d2 = paramChartFrame.r() / 4000.0D;
        if (d2 < 0.0D) {
          d2 = 0.0D;
        }
        a(paramzcjz, "x", zauj.b(d1));
        a(paramzcjz, "y", zauj.b(d2));
      }
      if (!paramBoolean1)
      {
        d1 = paramChartFrame.getWidth() / 4000.0D;
        d2 = paramChartFrame.getHeight() / 4000.0D;
        if ((paramBoolean3) && (i != 0))
        {
          a(paramzcjz, "w", zauj.b(localPlotArea.getInnerWidth() / 4000.0D));
          a(paramzcjz, "h", zauj.b(localPlotArea.getInnerHeight() / 4000.0D));
        }
        else
        {
          a(paramzcjz, "w", zauj.b(d1));
          a(paramzcjz, "h", zauj.b(d2));
        }
      }
      paramzcjz.b();
      paramzcjz.b();
    }
  }
  
  private boolean a(zcjz paramzcjz, ShapePropertyCollection paramShapePropertyCollection)
    throws Exception
  {
    return zuw.a(paramzcjz, this.d, paramShapePropertyCollection);
  }
  
  private static void a(zcjz paramzcjz, String paramString1, String paramString2)
    throws Exception
  {
    paramzcjz.c("c:" + paramString1, null);
    paramzcjz.a("val", paramString2);
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    paramzcjz.c(paramString1 + ":" + paramString2, null);
    paramzcjz.a("val", paramString3);
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, String paramString1, String paramString2, String paramString3, String paramString4)
    throws Exception
  {
    paramzcjz.c(paramString1 + ":" + paramString2, null);
    paramzcjz.a(paramString3, paramString4);
    paramzcjz.b();
  }
  
  static String a(Workbook paramWorkbook, TickLabels paramTickLabels)
  {
    if ((paramTickLabels.getNumber() == 0) && (paramTickLabels.getNumberFormat() == null)) {
      return "General";
    }
    if (paramTickLabels.getNumberFormat() != null) {
      return paramTickLabels.getNumberFormat();
    }
    return paramWorkbook.getSettings().f().d(paramTickLabels.getNumber());
  }
  
  static String a(Workbook paramWorkbook, DataLabels paramDataLabels)
  {
    if (paramDataLabels.N()) {
      return "General";
    }
    if (paramDataLabels.L() != null) {
      return paramDataLabels.L();
    }
    return paramWorkbook.getSettings().f().d(paramDataLabels.getNumber());
  }
  
  private static int a(Font paramFont)
  {
    return paramFont.f();
  }
  
  static boolean a(Font paramFont1, Font paramFont2)
  {
    if (paramFont1 == null) {
      return paramFont2 == null;
    }
    if (paramFont2 == null) {
      return true;
    }
    return paramFont1.a(paramFont2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */