package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zart
{
  private zasg a;
  private HashMap b;
  private double c;
  private Worksheet d;
  private zatg e;
  private String f;
  private static final za g = new za(new String[] { "automatic-styles", "body", "legend-position", "x", "y", "width", "height", "style-name", "legend-expansion-aspect-ratio", "legend-expansion", "title", "legend", "plot-area", "table", "cell-range-address", "data-source-has-labels", "transform", "coordinate-region", "light", "axis", "series", "wall", "floor", "rotation-angle", "axis-label-position", "overlap", "gap-width", "minimum", "maximum", "interval-major", "interval-minor-divisor", "logarithmic", "reverse-direction", "dimension", "name", "primary-x", "primary-y", "secondary-x", "secondary-y", "grid", "categories", "p", "values-cell-range-address", "label-cell-address", "class", "attached-axis", "domain", "data-point", "repeated", "number-style", "style", "graphic-properties", "text-properties", "chart-properties", "font-size", "color", "font-family", "font-weight", "font-style", "text-line-through-style", "fill", "fill-color", "stroke", "stroke-dash", "stroke-color", "stroke-width", "stroke-opacity", "edge-rounding", "opacity", "vertical", "stacked", "percentage", "deep", "pie-offset", "symbol-type", "symbol-name", "symbol-width", "chartSysmbolHeight", "angle-offset", "three-dimensional", "right-angled-axes", "solid-type", "label-position", "data-label-number", "data-label-text", "data-label-symbol", "text-overlap", "display-label", "line-break", "link-data-style-to-source", "axis-position", "tick-mark-position", "none", "automatic", "named-symbol", "image", "chart:area", "chart:line", "chart:bar", "chart:circle", "chart:ring", "chart:scatter", "chart:radar", "chart:stock", "chart:bubble", "both", "column", "row" });
  
  zart(zasg paramzasg, Worksheet paramWorksheet, zatg paramzatg)
  {
    this.a = paramzasg;
    this.c = zbxp.a();
    this.b = new HashMap();
    this.d = paramWorksheet;
    this.e = paramzatg;
  }
  
  void a(zcjm paramzcjm)
  {
    Iterator localIterator = paramzcjm.d_().l().iterator();
    while (localIterator.hasNext())
    {
      zcjs localzcjs = (zcjs)localIterator.next();
      if (localzcjs.e == 1) {
        switch (g.a(localzcjs.g))
        {
        case 0: 
          c((zcjn)localzcjs);
          break;
        case 1: 
          a((zcjn)localzcjs);
        }
      }
    }
  }
  
  private Chart a(Worksheet paramWorksheet, zatg paramzatg, int paramInt)
  {
    int i = paramWorksheet.getCharts().a(paramInt, paramzatg.f, (int)paramzatg.c, paramzatg.g, (int)paramzatg.b, (int)paramzatg.d, (int)paramzatg.e);
    Chart localChart = paramWorksheet.getCharts().get(i);
    return localChart;
  }
  
  private void a(zcjn paramzcjn)
  {
    Iterator localIterator = paramzcjn.l().iterator();
    while (localIterator.hasNext())
    {
      zcjs localzcjs = (zcjs)localIterator.next();
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        if ("chart".equals(localzcjn.g))
        {
          if ("office".equals(localzcjn.f)) {
            a(localzcjn);
          } else if ("chart".equals(localzcjn.f)) {
            b(localzcjn);
          }
          return;
        }
      }
    }
  }
  
  private void a(zcjn paramzcjn, Chart paramChart)
  {
    double d1 = 1.0D;
    boolean bool = false;
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      String str = localzcjg.h;
      if (!zasp.e(str)) {
        switch (g.a(localzcjg.g))
        {
        case 2: 
          paramChart.getLegend().setPosition(zasp.b(str));
          break;
        case 3: 
          paramChart.getLegend().setX(a(paramChart, zasp.c(this.c, str)));
          break;
        case 4: 
          paramChart.getLegend().setY(b(paramChart, zasp.c(this.c, str)));
          break;
        case 5: 
          paramChart.getLegend().setWidth(a(paramChart, zasp.c(this.c, str)));
          break;
        case 6: 
          paramChart.getLegend().setHeight(b(paramChart, zasp.c(this.c, str)));
          break;
        case 7: 
          zars localzars = (zars)this.b.get(str);
          if (localzars != null)
          {
            if (localzars.c != null) {
              paramChart.getLegend().getFont().a(localzars.j(), null);
            }
            if (localzars.n() != 0.0D)
            {
              paramChart.getLegend().getBorder().setVisible(true);
              paramChart.getLegend().getBorder().a(localzars.b == null ? Color.getBlack() : zasp.h(localzars.b));
            }
          }
          break;
        case 8: 
          d1 = zauj.C(str);
          break;
        case 9: 
          bool = "custom".equals(str);
        }
      }
    }
    paramChart.setShowLegend(true);
    if ((bool) && (d1 != 1.0D)) {}
  }
  
  private void b(zcjn paramzcjn)
  {
    int i = 14;
    Object localObject1 = paramzcjn.e().iterator();
    Object localObject3;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zcjg)((Iterator)localObject1).next();
      localObject3 = ((zcjg)localObject2).h;
      if ("class".equals(((zcjg)localObject2).g))
      {
        i = zasp.c((String)localObject3);
        break;
      }
    }
    localObject1 = a(this.d, this.e, i);
    ((Chart)localObject1).setShowLegend(false);
    if (((Chart)localObject1).getType() == 65) {
      return;
    }
    Object localObject2 = paramzcjn.e().iterator();
    Object localObject4;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (zcjg)((Iterator)localObject2).next();
      localObject4 = ((zcjg)localObject3).h;
      switch (g.a(((zcjg)localObject3).g))
      {
      case 6: 
        ((Chart)localObject1).getChartObject().setHeightCM(zasp.b(this.c, (String)localObject4));
        break;
      case 5: 
        ((Chart)localObject1).getChartObject().setWidthCM(zasp.b(this.c, (String)localObject4));
        break;
      case 7: 
        zars localzars = (zars)this.b.get(localObject4);
        if (localzars.a != null) {
          ((Chart)localObject1).getChartArea().getArea().setForegroundColor(zasp.h(localzars.a));
        } else {
          ((Chart)localObject1).getChartArea().getArea().setForegroundColor(Color.getWhite());
        }
        break;
      }
    }
    localObject2 = paramzcjn.l().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (zcjs)((Iterator)localObject2).next();
      if (((zcjs)localObject3).e == 1)
      {
        localObject4 = (zcjn)localObject3;
        switch (g.a(((zcjn)localObject4).g))
        {
        case 10: 
          a((zcjn)localObject4, ((Chart)localObject1).getTitle());
          break;
        case 11: 
          a((zcjn)localObject4, (Chart)localObject1);
          break;
        case 12: 
          b((zcjn)localObject4, (Chart)localObject1);
          break;
        case 13: 
          
        }
      }
    }
  }
  
  private static int a(Chart paramChart, double paramDouble)
  {
    return (int)(paramDouble / paramChart.getChartObject().getWidthInch() * 4000.0D);
  }
  
  private static int b(Chart paramChart, double paramDouble)
  {
    return (int)(paramDouble / paramChart.getChartObject().getHeightInch() * 4000.0D);
  }
  
  private void b(zcjn paramzcjn, Chart paramChart)
  {
    zars localzars = null;
    String str1 = null;
    Object localObject1 = null;
    Iterator localIterator1 = paramzcjn.e().iterator();
    while (localIterator1.hasNext())
    {
      localObject2 = (zcjg)localIterator1.next();
      String str2 = ((zcjg)localObject2).h;
      switch (g.a(((zcjg)localObject2).g))
      {
      case 7: 
        localzars = (zars)this.b.get(str2);
        break;
      case 14: 
        str1 = a(str2);
        break;
      case 15: 
        localObject1 = str2;
        break;
      case 3: 
        paramChart.getPlotArea().setX(a(paramChart, zasp.c(this.c, str2)));
        break;
      case 4: 
        paramChart.getPlotArea().setY(b(paramChart, zasp.c(this.c, str2)));
        break;
      case 5: 
        paramChart.getPlotArea().setWidth(a(paramChart, zasp.c(this.c, str2)));
        break;
      case 6: 
        paramChart.getPlotArea().setHeight(b(paramChart, zasp.c(this.c, str2)));
        break;
      case 16: 
        paramChart.getPlotArea().a(str2);
      }
    }
    if (localzars != null)
    {
      if (localzars.k()) {
        switch (paramChart.getType())
        {
        case 0: 
          paramChart.setType(3);
          break;
        case 37: 
          paramChart.setType(43);
          break;
        case 14: 
          if (localzars.a()) {
            paramChart.setType(9);
          } else {
            paramChart.setType(18);
          }
          break;
        case 44: 
          paramChart.setType(45);
          break;
        }
      }
      paramChart.setRightAngleAxes(localzars.l());
    }
    int i = -1;
    Object localObject2 = null;
    try
    {
      localObject2 = a(str1, (String)localObject1);
    }
    catch (Exception localException) {}
    Iterator localIterator2 = paramzcjn.l().iterator();
    while (localIterator2.hasNext())
    {
      zcjs localzcjs = (zcjs)localIterator2.next();
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        switch (g.a(localzcjn.g))
        {
        case 17: 
          break;
        case 18: 
          break;
        case 19: 
          d(localzcjn, paramChart);
          break;
        case 20: 
          Series localSeries = new Series(this.a.b.getWorksheets(), paramChart.getNSeries(), ++i);
          paramChart.getNSeries().a(localSeries);
          a(localzcjn, paramChart, localSeries, i, localzars, (String[])localObject2);
          break;
        case 21: 
          c(localzcjn, paramChart);
          break;
        case 22: 
          
        }
      }
    }
    if ((!zasp.e(this.f)) && (!c(this.f))) {
      paramChart.getNSeries().setCategoryData(a(this.f));
    }
    paramChart.setPlotVisibleCells(false);
  }
  
  private void c(zcjn paramzcjn, Chart paramChart)
  {
    String str = paramzcjn.a("style-name", null);
    if (!zasp.e(str))
    {
      zars localzars = (zars)this.b.get(str);
      if (paramChart.getIs3D())
      {
        if ((localzars.a != null) && (!"none".equals(localzars.g()))) {
          paramChart.getWalls().setForegroundColor(zasp.h(localzars.a));
        } else {
          paramChart.getWalls().setForegroundColor(Color.getWhite());
        }
        if (localzars.b != null) {
          paramChart.getWalls().getBorder().a(zasp.h(localzars.b));
        }
      }
      else
      {
        if ((localzars.a != null) && (!"none".equals(localzars.g()))) {
          paramChart.getPlotArea().getArea().setForegroundColor(zasp.h(localzars.a));
        } else {
          paramChart.getPlotArea().getArea().setForegroundColor(Color.getWhite());
        }
        if (localzars.b != null) {
          paramChart.getPlotArea().getBorder().a(zasp.h(localzars.b));
        }
      }
    }
  }
  
  private void a(Axis paramAxis, zars paramzars, boolean paramBoolean1, boolean paramBoolean2)
  {
    Chart localChart = paramAxis.a();
    if (paramzars.b != null) {
      paramAxis.getAxisLine().a(zasp.h(paramzars.b));
    }
    paramAxis.getAxisLine().c(paramzars.h());
    if (paramzars.c != null) {
      paramAxis.getTickLabels().getFont().a(paramzars.j(), null);
    }
    int i = 150;
    int j = 0;
    Iterator localIterator1 = paramzars.d.keySet().iterator();
    Object localObject;
    while (localIterator1.hasNext())
    {
      localObject = (String)localIterator1.next();
      String str = (String)paramzars.d.get(localObject);
      switch (g.a((String)localObject))
      {
      case 23: 
        paramAxis.getTickLabels().setRotationAngle(zasp.i(str));
        break;
      case 24: 
        paramAxis.setTickLabelPosition(zasp.x(str));
        break;
      case 25: 
        j = zasp.o(str);
        break;
      case 26: 
        i = zasp.o(str);
        break;
      case 27: 
        paramAxis.setMinValue(Double.valueOf(zasp.n(str)));
        break;
      case 28: 
        paramAxis.setMaxValue(Double.valueOf(zasp.n(str)));
        break;
      case 29: 
        paramAxis.setMajorUnit(zasp.n(str));
        break;
      case 30: 
        paramAxis.setMinorUnit(zasp.n(str));
        break;
      case 31: 
        paramAxis.setLogarithmic(zasp.m(str));
        break;
      case 32: 
        paramAxis.setPlotOrderReversed(zasp.m(str));
      }
    }
    if ((!paramAxis.isAutomaticMinorUnit()) && (!paramAxis.isAutomaticMajorUnit()) && (paramAxis.getMajorUnit() < paramAxis.getMinorUnit()))
    {
      double d1 = paramAxis.getMajorUnit();
      paramAxis.setMajorUnit(paramAxis.getMinorUnit());
      paramAxis.setMinorUnit(d1);
    }
    if ((paramBoolean1) && ((i != 150) || (j != 0)))
    {
      Iterator localIterator2 = localChart.i.iterator();
      while (localIterator2.hasNext())
      {
        localObject = (zka)localIterator2.next();
        if (paramBoolean2 == (!((zka)localObject).m()))
        {
          ((zka)localObject).e(j);
          ((zka)localObject).c(i);
        }
      }
    }
  }
  
  private void d(zcjn paramzcjn, Chart paramChart)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    zars localzars = null;
    Object localObject3 = paramzcjn.e().iterator();
    Object localObject5;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (zcjg)((Iterator)localObject3).next();
      localObject5 = ((zcjg)localObject4).h;
      switch (g.a(((zcjg)localObject4).g))
      {
      case 33: 
        localObject1 = localObject5;
        break;
      case 34: 
        localObject2 = localObject5;
        break;
      case 7: 
        localzars = (zars)this.b.get(localObject5);
      }
    }
    localObject3 = null;
    switch (g.a((String)localObject2))
    {
    case 35: 
      localObject3 = paramChart.getCategoryAxis();
      a(paramChart.getCategoryAxis(), localzars, false, true);
      break;
    case 36: 
      localObject3 = paramChart.getValueAxis();
      a(paramChart.getValueAxis(), localzars, true, true);
      break;
    case 37: 
      localObject3 = paramChart.getCategoryAxis();
      ((Axis)localObject3).setVisible(true);
      a((Axis)localObject3, localzars, false, false);
      break;
    case 38: 
      localObject3 = paramChart.getSecondValueAxis();
      ((Axis)localObject3).setVisible(true);
      a((Axis)localObject3, localzars, true, false);
      break;
    }
    Object localObject4 = paramzcjn.l().iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject5 = (zcjs)((Iterator)localObject4).next();
      if (((zcjs)localObject5).e == 1)
      {
        zcjn localzcjn = (zcjn)localObject5;
        switch (g.a(localzcjn.g))
        {
        case 10: 
          a(localzcjn, ((Axis)localObject3).getTitle());
          break;
        case 39: 
          a(localzcjn, ((Axis)localObject3).getMajorGridLines());
          break;
        case 40: 
          this.f = localzcjn.a("cell-range-address", null);
        }
      }
    }
  }
  
  private void a(zcjn paramzcjn, Line paramLine)
  {
    zars localzars = null;
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      String str = localzcjg.h;
      switch (g.a(localzcjg.g))
      {
      case 7: 
        localzars = (zars)this.b.get(str);
      }
    }
    if ((localzars != null) && (localzars.b != null)) {
      paramLine.a(zasp.h(localzars.b));
    }
  }
  
  private void a(zcjn paramzcjn, Title paramTitle)
  {
    Iterator localIterator1 = paramzcjn.e().iterator();
    Object localObject1;
    Object localObject2;
    while (localIterator1.hasNext())
    {
      localObject1 = (zcjg)localIterator1.next();
      localObject2 = ((zcjg)localObject1).h;
      switch (g.a(((zcjg)localObject1).g))
      {
      case 3: 
      case 4: 
        break;
      case 7: 
        zars localzars = (zars)this.b.get(localObject2);
        if (localzars != null)
        {
          if (localzars.c != null) {
            paramTitle.getFont().a(localzars.j(), null);
          }
          Iterator localIterator2 = localzars.d.keySet().iterator();
          while (localIterator2.hasNext())
          {
            String str1 = (String)localIterator2.next();
            String str2 = (String)localzars.d.get(str1);
            switch (g.a(str1))
            {
            case 23: 
              paramTitle.setRotationAngle(zasp.i(str2));
            }
          }
        }
        break;
      }
    }
    localIterator1 = paramzcjn.l().iterator();
    while (localIterator1.hasNext())
    {
      localObject1 = (zcjs)localIterator1.next();
      if (((zcjs)localObject1).e == 1)
      {
        localObject2 = (zcjn)localObject1;
        switch (g.a(((zcjn)localObject2).g))
        {
        case 41: 
          paramTitle.b(((zcjn)localObject2).a());
        }
      }
    }
  }
  
  private void a(zcjn paramzcjn, Chart paramChart, Series paramSeries, int paramInt, zars paramzars, String[] paramArrayOfString)
  {
    zars localzars = null;
    String str = null;
    Object localObject1 = null;
    boolean bool = false;
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      localObject2 = localzcjg.h;
      switch (g.a(localzcjg.g))
      {
      case 7: 
        localzars = (zars)this.b.get(localObject2);
        break;
      case 42: 
        str = a((String)localObject2);
        break;
      case 43: 
        paramSeries.a("=" + a((String)localObject2));
        break;
      case 44: 
        localObject1 = localObject2;
        break;
      case 45: 
        bool = "secondary-y".equals(localObject2);
      }
    }
    int i = paramChart.getType();
    for (int j = 0; j < paramChart.q().getCount(); j++) {
      if ((paramChart.q().a(j).j() == i) && (bool == paramChart.q().a(j).m())) {
        paramSeries.a(paramChart.q().a(j));
      }
    }
    if (paramSeries.u() == null)
    {
      zka localzka = new zka(paramChart.q(), i, bool);
      paramChart.q().a(localzka);
      paramSeries.a(localzka);
    }
    if (paramChart.getType() != 36) {
      i = a(paramChart, (String)localObject1, paramzars, localzars, paramzars.k());
    }
    paramSeries.setType(i);
    if ((paramzars.i() != null) && (!"90".equals(paramzars.i()))) {
      try
      {
        int k = zp.a(paramzars.i());
        k = 90 - k;
        if (k < 0) {
          k += 360;
        }
        paramSeries.setFirstSliceAngle((short)k);
      }
      catch (Exception localException) {}
    }
    if ((str == null) && (paramArrayOfString != null) && (paramInt < paramArrayOfString.length)) {
      str = paramArrayOfString[paramInt];
    }
    paramSeries.setValues(str);
    if (localzars != null)
    {
      if (ChartCollection.s(paramSeries.getType()))
      {
        if (localzars.b != null) {
          paramSeries.getMarker().a(zasp.h(localzars.b));
        }
        if (localzars.a != null) {
          paramSeries.getMarker().b(zasp.h(localzars.a));
        }
        if (localzars.e() != 5)
        {
          paramSeries.getMarker().setMarkerStyle(localzars.e());
          if ((localzars.e() != 0) && (localzars.p() != 0.0D)) {
            paramSeries.getMarker().setMarkerSize((int)zasp.b(this.a.b.getWorksheets(), localzars.p()));
          }
        }
        if (localzars.q() != 0.0D) {
          paramSeries.getMarker().getArea().setTransparency(1.0D - localzars.q());
        }
      }
      else
      {
        if (localzars.a != null) {
          paramSeries.getArea().setForegroundColor(zasp.h(localzars.a));
        }
        if (localzars.b != null) {
          paramSeries.getBorder().a(zasp.h(localzars.b));
        }
        if (localzars.h() != 6) {
          paramSeries.getBorder().c(localzars.h());
        }
        if (localzars.n() != 0.0D) {
          paramSeries.getBorder().c(localzars.n());
        }
      }
      if (localzars.r() != 8) {
        paramSeries.getDataLabels().setPosition(localzars.r());
      }
      paramSeries.getDataLabels().setSeparatorValue(localzars.v());
      if (localzars.t()) {
        paramSeries.getDataLabels().setShowLegendKey(true);
      }
      if (localzars.u()) {
        paramSeries.getDataLabels().setShowSeriesName(true);
      }
      if ("value-and-percentage".equals(localzars.s()))
      {
        paramSeries.getDataLabels().setShowValue(true);
        paramSeries.getDataLabels().setShowPercentage(true);
      }
      else if ("value".equals(localzars.s()))
      {
        paramSeries.getDataLabels().setShowValue(true);
      }
      else if ("percentage".equals(localzars.s()))
      {
        paramSeries.getDataLabels().setShowPercentage(true);
      }
    }
    int m = 0;
    Object localObject2 = paramzcjn.l().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      zcjs localzcjs = (zcjs)((Iterator)localObject2).next();
      if (localzcjs.e != 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        switch (g.a(localzcjn.g))
        {
        case 46: 
          break;
        case 47: 
          m = a(localzcjn, paramChart, paramSeries, m);
          break;
        default: 
          m++;
        }
      }
    }
  }
  
  private int a(zcjn paramzcjn, Chart paramChart, Series paramSeries, int paramInt)
  {
    zars localzars = null;
    int i = 1;
    Iterator localIterator = paramzcjn.e().iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (zcjg)localIterator.next();
      String str = ((zcjg)localObject).h;
      switch (g.a(((zcjg)localObject).g))
      {
      case 48: 
        i = zasp.o(str);
        break;
      case 7: 
        localzars = (zars)this.b.get(str);
      }
    }
    if (localzars == null) {
      return paramInt + i;
    }
    int j = 0;
    while (j < i)
    {
      localObject = paramSeries.getPoints().get(paramInt);
      if ((paramChart.getType() == 60) || (paramChart.getType() == 37) || (paramChart.getType() == 38) || (paramChart.getType() == 39))
      {
        if (localzars.b != null) {
          ((ChartPoint)localObject).getMarker().a(zasp.h(localzars.b));
        }
        if (localzars.a != null) {
          ((ChartPoint)localObject).getMarker().b(zasp.h(localzars.a));
        }
        if (localzars.e() != 5) {
          ((ChartPoint)localObject).getMarker().setMarkerStyle(localzars.e());
        }
        if (localzars.p() != 0.0D) {
          ((ChartPoint)localObject).getMarker().setMarkerSize((int)zasp.b(this.a.b.getWorksheets(), localzars.p()));
        }
        if (localzars.q() != 0.0D) {
          ((ChartPoint)localObject).getMarker().getArea().setTransparency(1.0D - localzars.q());
        }
      }
      else if (localzars.a != null)
      {
        ((ChartPoint)localObject).getArea().setForegroundColor(zasp.h(localzars.a));
      }
      if (!zasp.e(localzars.d())) {
        ((ChartPoint)localObject).setExplosion(zp.a(localzars.d()));
      }
      if ("none".equals(localzars.f())) {
        ((ChartPoint)localObject).getBorder().setVisible(false);
      }
      j++;
      paramInt++;
    }
    return paramInt;
  }
  
  private void c(zcjn paramzcjn)
  {
    this.b.clear();
    Iterator localIterator = paramzcjn.l().iterator();
    while (localIterator.hasNext())
    {
      zcjs localzcjs = (zcjs)localIterator.next();
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        switch (g.a(localzcjn.g))
        {
        case 49: 
          break;
        case 50: 
          d(localzcjn);
        }
      }
    }
  }
  
  private void d(zcjn paramzcjn)
  {
    String str = paramzcjn.a("name", null);
    zars localzars = new zars();
    this.b.put(str, localzars);
    Iterator localIterator = paramzcjn.l().iterator();
    while (localIterator.hasNext())
    {
      zcjs localzcjs = (zcjs)localIterator.next();
      if (localzcjs.e == 1)
      {
        zcjn localzcjn = (zcjn)localzcjs;
        switch (g.a(localzcjn.g))
        {
        case 51: 
          b(localzcjn, localzars);
          break;
        case 52: 
          a(localzcjn, localzars);
          break;
        case 53: 
          c(localzcjn, localzars);
        }
      }
    }
  }
  
  private void a(zcjn paramzcjn, zars paramzars)
  {
    paramzars.a(this.a.b.getWorksheets());
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      String str = localzcjg.h;
      switch (g.a(localzcjg.g))
      {
      case 54: 
        paramzars.j().setDoubleSize(zasp.d(zbxp.a(), str));
        break;
      case 55: 
        paramzars.j().setColor(zasp.h(str));
        break;
      case 56: 
        paramzars.j().setName(str);
        break;
      case 57: 
        paramzars.j().setBold("bold".equals(str.toLowerCase()));
        break;
      case 58: 
        paramzars.j().setItalic("italic".equals(str.toLowerCase()));
        break;
      case 59: 
        paramzars.j().setStrikeout("solid".equals(str.toLowerCase()));
      }
    }
  }
  
  private void b(zcjn paramzcjn, zars paramzars)
  {
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      String str = localzcjg.h;
      switch (g.a(localzcjg.g))
      {
      case 60: 
        paramzars.c(str);
        break;
      case 61: 
        paramzars.a = str;
        break;
      case 62: 
        paramzars.b(str);
        break;
      case 63: 
        paramzars.b(zasp.j(str));
        break;
      case 64: 
        paramzars.b = str;
        break;
      case 65: 
        paramzars.a(zasp.d(this.c, str));
        break;
      case 66: 
      case 67: 
        break;
      case 68: 
        if (str.endsWith("%")) {
          paramzars.c(zasp.n(str.substring(0, 0 + (str.length() - 1))) / 100.0D);
        }
        break;
      }
    }
  }
  
  private void c(zcjn paramzcjn, zars paramzars)
  {
    Iterator localIterator = paramzcjn.e().iterator();
    Object localObject;
    String str;
    while (localIterator.hasNext())
    {
      localObject = (zcjg)localIterator.next();
      str = ((zcjg)localObject).h;
      if (!zasp.e(str)) {
        switch (g.a(((zcjg)localObject).g))
        {
        case 69: 
          paramzars.a(zasp.m(((zcjg)localObject).h));
          break;
        case 70: 
          paramzars.b(zasp.m(((zcjg)localObject).h));
          break;
        case 71: 
          paramzars.c(zasp.m(((zcjg)localObject).h));
          break;
        case 72: 
          paramzars.f(zasp.m(((zcjg)localObject).h));
          break;
        case 73: 
          paramzars.a(((zcjg)localObject).h);
          break;
        case 74: 
          switch (g.a(str))
          {
          case 92: 
            paramzars.a(5);
            break;
          case 93: 
            paramzars.a(0);
            break;
          case 94: 
            break;
          case 95: 
            
          }
          break;
        case 75: 
          paramzars.a(zasp.a(((zcjg)localObject).h));
          break;
        case 76: 
          paramzars.b(zasp.b(this.c, ((zcjg)localObject).h));
          break;
        case 77: 
          break;
        case 78: 
          paramzars.d(((zcjg)localObject).h);
          break;
        case 79: 
          paramzars.d(zasp.m(((zcjg)localObject).h));
          break;
        case 80: 
          paramzars.e(zasp.m(((zcjg)localObject).h));
          break;
        case 81: 
          paramzars.c(zasp.d(((zcjg)localObject).h));
          break;
        case 82: 
          paramzars.d(zasp.w(((zcjg)localObject).h));
          break;
        case 83: 
          paramzars.e(((zcjg)localObject).h);
          break;
        case 84: 
          paramzars.g(zasp.m(((zcjg)localObject).h));
          break;
        case 85: 
          paramzars.h(zasp.m(((zcjg)localObject).h));
          break;
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
        case 35: 
        case 36: 
        case 37: 
        case 38: 
        case 39: 
        case 40: 
        case 41: 
        case 42: 
        case 43: 
        case 44: 
        case 45: 
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
        case 58: 
        case 59: 
        case 60: 
        case 61: 
        case 62: 
        case 63: 
        case 64: 
        case 65: 
        case 66: 
        case 67: 
        case 68: 
        case 86: 
        case 87: 
        case 88: 
        case 89: 
        case 90: 
        case 91: 
        default: 
          paramzars.d.put(((zcjg)localObject).g, ((zcjg)localObject).h);
        }
      }
    }
    localIterator = paramzcjn.l().iterator();
    while (localIterator.hasNext())
    {
      localObject = (zcjs)localIterator.next();
      if ("label-separator".equals(((zcjs)localObject).g))
      {
        str = ((zcjs)localObject).a();
        if (!zasp.e(str)) {
          paramzars.f(str);
        }
      }
    }
  }
  
  private int a(Chart paramChart, String paramString, zars paramzars1, zars paramzars2, boolean paramBoolean)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return paramChart.getType();
    }
    int i = paramChart.getType();
    String str = paramString.toLowerCase();
    switch (g.a(str))
    {
    case 96: 
      if (paramBoolean)
      {
        i = 3;
        if (paramzars1.b()) {
          i = 4;
        }
        if (paramzars1.c()) {
          i = 5;
        }
      }
      else
      {
        i = 0;
        if (paramzars1.b()) {
          i = 1;
        }
        if (paramzars1.c()) {
          i = 2;
        }
      }
      break;
    case 97: 
      if (paramzars1.b()) {
        i = 38;
      } else if (paramzars1.c()) {
        i = 39;
      } else if (paramBoolean) {
        i = 43;
      } else {
        i = 37;
      }
      break;
    case 98: 
      if (paramBoolean)
      {
        i = a(paramzars1, paramzars2, paramChart.getType());
      }
      else if (paramzars1.a())
      {
        i = 6;
        if (paramzars1.b()) {
          i = 7;
        }
        if (paramzars1.c()) {
          i = 8;
        }
      }
      else
      {
        i = 14;
        if (paramzars1.b()) {
          i = 15;
        }
        if (paramzars1.c()) {
          i = 16;
        }
      }
      break;
    case 99: 
      if (paramChart.getType() == 35)
      {
        i = 35;
        if (!zasp.e(paramzars2.d())) {
          i = 36;
        }
      }
      else if (paramBoolean)
      {
        i = 45;
        if (!zasp.e(paramzars2.d())) {
          i = 48;
        }
      }
      else
      {
        i = 44;
        if (!zasp.e(paramzars2.d())) {
          i = 47;
        }
      }
      break;
    case 100: 
      i = 35;
      if (!zasp.e(paramzars2.d())) {
        i = 36;
      }
      break;
    case 101: 
      i = 60;
      break;
    case 102: 
      i = 57;
      break;
    case 103: 
      i = 65;
      break;
    case 104: 
      if (paramBoolean) {
        i = 13;
      } else {
        i = 12;
      }
      break;
    default: 
      i = 14;
    }
    return i;
  }
  
  private int a(zars paramzars1, zars paramzars2, int paramInt)
  {
    int i = paramInt;
    switch (paramzars2.m())
    {
    case 0: 
      if (paramzars2.a())
      {
        i = 9;
        if (paramzars2.b()) {
          i = 10;
        }
        if (paramzars2.c()) {
          i = 11;
        }
      }
      else
      {
        i = 18;
        if (paramzars2.o()) {
          i = 17;
        }
        if (paramzars2.b()) {
          i = 19;
        }
        if (paramzars2.c()) {
          i = 20;
        }
      }
      break;
    case 4: 
      if (paramzars2.a())
      {
        i = 24;
        if (paramzars2.b()) {
          i = 25;
        }
        if (paramzars2.c()) {
          i = 26;
        }
      }
      else
      {
        i = 21;
        if (paramzars2.o()) {
          i = 27;
        }
        if (paramzars2.b()) {
          i = 22;
        }
        if (paramzars2.c()) {
          i = 23;
        }
      }
      break;
    case 3: 
      if (paramzars2.a())
      {
        i = 31;
        if (paramzars2.b()) {
          i = 32;
        }
        if (paramzars2.c()) {
          i = 33;
        }
      }
      else
      {
        i = 28;
        if (paramzars2.o()) {
          i = 34;
        }
        if (paramzars2.b()) {
          i = 29;
        }
        if (paramzars2.c()) {
          i = 30;
        }
      }
      break;
    case 1: 
      if (paramzars2.a())
      {
        i = 53;
        if (paramzars2.b()) {
          i = 54;
        }
        if (paramzars2.c()) {
          i = 55;
        }
      }
      else
      {
        i = 50;
        if (paramzars2.o()) {
          i = 56;
        }
        if (paramzars2.b()) {
          i = 51;
        }
        if (paramzars2.c()) {
          i = 52;
        }
      }
      break;
    }
    return i;
  }
  
  private String a(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return paramString;
    }
    if (paramString.indexOf(":") < 0)
    {
      paramString = zw.a(paramString, ".", "!");
      return paramString + ":" + zw.d(paramString, '!')[1];
    }
    String[] arrayOfString = null;
    if (paramString.indexOf(" '") > -1) {
      arrayOfString = paramString.split(" '");
    } else if (paramString.indexOf(":") == paramString.lastIndexOf(":")) {
      arrayOfString = new String[] { paramString };
    } else {
      arrayOfString = zw.d(paramString, ' ');
    }
    StringBuilder localStringBuilder = new StringBuilder();
    String str = "";
    for (int i = 0; i < arrayOfString.length; i++)
    {
      localStringBuilder.append(str);
      localStringBuilder.append(b(arrayOfString[i]));
      str = ",";
    }
    return zs.a(localStringBuilder);
  }
  
  private String b(String paramString)
  {
    String[] arrayOfString = zw.d(paramString, ':');
    String str1 = arrayOfString[0];
    String str2 = arrayOfString[1];
    int i = str1.indexOf(".");
    if (i == str2.indexOf(".")) {
      str2 = str2.substring(str2.lastIndexOf(".") + 1);
    } else {
      str2 = str2.substring(1);
    }
    StringBuilder localStringBuilder = new StringBuilder(zw.a(zw.a(str1, ".", "!"), "$", ""));
    localStringBuilder.append(":");
    localStringBuilder.append(zw.a(str2, "$", ""));
    return zs.a(localStringBuilder);
  }
  
  private boolean c(String paramString)
  {
    int i = 0;
    for (int j = 0; j < this.a.b.getWorksheets().getCount(); j++) {
      if (this.a.b.getWorksheets().get(j).getName().indexOf("local-table") > -1)
      {
        i = 1;
        break;
      }
    }
    return (paramString.indexOf("local-table") > -1) && (i == 0);
  }
  
  private String[] a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (zasp.e(paramString1)) || (paramString1.indexOf(' ') != -1)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString1 = zw.d(paramString1, ',');
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      String str1 = arrayOfString1[i];
      if (!zasp.e(str1))
      {
        int k = str1.indexOf("!");
        int m = str1.indexOf(":");
        String str2 = str1.substring(0, 0 + (k + 1));
        String str3 = str1.substring(k + 1, k + 1 + (m - k - 1));
        String str4 = str1.substring(m + 1);
        int n = -1;
        int i1 = -1;
        int i2 = -1;
        int i3 = -1;
        int[] arrayOfInt1 = { n };
        int[] arrayOfInt2 = { i1 };
        CellsHelper.a(str3, arrayOfInt1, arrayOfInt2);
        n = arrayOfInt1[0];
        i1 = arrayOfInt2[0];
        int[] arrayOfInt3 = { i2 };
        int[] arrayOfInt4 = { i3 };
        CellsHelper.a(str4, arrayOfInt3, arrayOfInt4);
        i2 = arrayOfInt3[0];
        i3 = arrayOfInt4[0];
        switch (g.a(paramString2))
        {
        case 105: 
          n++;
          i1++;
          break;
        case 106: 
          i1++;
          break;
        case 107: 
          if (n != i2) {
            n++;
          }
          break;
        }
        for (int i4 = 0; i4 < i2 - n + 1; i4++) {
          zf.a(localArrayList, str2 + CellsHelper.a(n + i4, i1, n + i4, i3));
        }
      }
    }
    if (localArrayList.size() == 0) {
      return null;
    }
    String[] arrayOfString2 = new String[localArrayList.size()];
    for (int j = 0; j < arrayOfString2.length; j++) {
      arrayOfString2[j] = ((String)localArrayList.get(j));
    }
    return arrayOfString2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */