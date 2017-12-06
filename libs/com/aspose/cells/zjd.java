package com.aspose.cells;

import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zjd
{
  void a(Chart paramChart, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    if (paramChart.L() == 1) {
      b(paramChart, paramBoolean2);
    } else if (paramChart.L() == 2) {
      a(paramChart, paramBoolean2);
    } else if (paramChart.n().p().g()) {
      b(paramChart, paramBoolean2);
    } else {
      a(paramChart, paramBoolean2);
    }
  }
  
  private void a(Chart paramChart, boolean paramBoolean)
    throws Exception
  {
    zkq localzkq = new zkq(null);
    try
    {
      zje localzje = null;
      try
      {
        localzje = localzkq.c(paramChart);
        if (localzje == null)
        {
          if ((localzje != null) && (localzje.ar() != null)) {
            localzje.ar().dispose();
          }
          return;
        }
        zp localzp1 = localzje.ai();
        zp localzp2 = localzje.B().A();
        if ((!paramChart.getPlotArea().p()) || (!paramChart.getPlotArea().m()) || (paramChart.getPlotArea().getInnerWidth() + paramChart.getPlotArea().getInnerHeight() == 0))
        {
          if (!localzje.W()) {
            paramChart.getPlotArea().a(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
          } else {
            paramChart.getPlotArea().a(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
          }
          paramChart.getPlotArea().setInnerX(localzp2.c());
          paramChart.getPlotArea().setInnerY(localzp2.d());
          paramChart.getPlotArea().setInnerWidth(localzp2.e());
          paramChart.getPlotArea().setInnerHeight(localzp2.f());
        }
        zp localzp3 = localzje.x().d().A();
        Legend localLegend = paramChart.getLegend();
        localLegend.a(localzp3.c(), localzp3.d(), localzp3.e(), localzp3.f());
        a(paramChart, localzje);
        a(paramChart.getValueAxis(), localzje.E());
        a(paramChart.getCategoryAxis(), localzje.f(), localzje.U());
        a(paramChart.getSecondValueAxis(), localzje.G());
        a(paramChart.getSecondCategoryAxis(), localzje.h(), localzje.U());
        b(paramChart, localzje);
        Title localTitle = paramChart.r();
        if (localTitle != null)
        {
          if ((localTitle.isAutoText()) && (!"".equals(localzje.L().b()))) {
            localTitle.a(localzje.L().b());
          }
          if ((localTitle.getText() != null) && (!"".equals(localTitle.getText())))
          {
            zp localzp4 = localzje.K().e().B();
            localTitle.b(localzp4.c(), localzp4.d(), localzp4.e(), localzp4.f());
            zp localzp5 = localzje.K().e().A();
            localTitle.a(localzp5.c(), localzp5.d(), localzp5.e(), localzp5.f());
            localTitle.setX(localzp5.c());
            localTitle.setY(localzp5.d());
            localTitle.k(localzje.K().e().a.e());
            localTitle.l(localzje.K().e().a.f());
          }
        }
        a(paramChart.getNSeries(), localzje.z(), localzje);
      }
      finally
      {
        if ((localzje != null) && (localzje.ar() != null)) {
          localzje.ar().dispose();
        }
      }
    }
    finally
    {
      if (localzkq != null) {
        localzkq.a();
      }
    }
  }
  
  private void a(Chart paramChart, zje paramzje)
    throws Exception
  {
    a(paramChart.getCategoryAxis(), paramzje.e());
    a(paramChart.getSecondCategoryAxis(), paramzje.g());
    a(paramChart.getValueAxis(), paramzje.E());
    a(paramChart.getSecondCategoryAxis(), paramzje.G());
  }
  
  private void a(Axis paramAxis, zbs paramzbs)
    throws Exception
  {
    paramAxis.b(zko.K(paramzbs.e()));
    Title localTitle = paramAxis.n();
    zp localzp1;
    zp localzp2;
    zp localzp3;
    if (localTitle != null)
    {
      if ((localTitle.isAutoText()) && (!"".equals(paramzbs.L().b()))) {
        localTitle.a(paramzbs.L().b());
      }
      if ((localTitle.getText() != null) && (!"".equals(localTitle.getText())))
      {
        localzp1 = paramzbs.K().e().b;
        localzp2 = new zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
        localzp2.a(localzp2.c() * 4000 / paramzbs.c().a());
        localzp2.b(localzp2.d() * 4000 / paramzbs.c().b());
        localzp2.c(localzp2.e() * 4000 / paramzbs.c().a());
        localzp2.d(localzp2.f() * 4000 / paramzbs.c().b());
        localTitle.b(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
        localzp3 = paramzbs.K().e().A();
        localTitle.a(localzp3.c(), localzp3.d(), localzp3.e(), localzp3.f());
        localTitle.setX(localzp3.c());
        localTitle.setY(localzp3.d());
        localTitle.k(paramzbs.K().e().a.e());
        localTitle.l(paramzbs.K().e().a.f());
      }
    }
    if ((paramAxis.getDisplayUnit() != 0) && (paramzbs.Q().d() != 0))
    {
      localzp1 = paramzbs.Q().b().b;
      localzp2 = new zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
      localzp2.a(localzp2.c() * 4000 / paramzbs.c().a());
      localzp2.b(localzp2.d() * 4000 / paramzbs.c().b());
      localzp2.c(localzp2.e() * 4000 / paramzbs.c().a());
      localzp2.d(localzp2.f() * 4000 / paramzbs.c().b());
      paramAxis.getDisplayUnitLabel().b(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
      localzp3 = paramzbs.Q().b().A();
      paramAxis.getDisplayUnitLabel().a(localzp3.c(), localzp3.d(), localzp3.e(), localzp3.f());
      paramAxis.getDisplayUnitLabel().k(paramzbs.Q().b().a.e());
    }
  }
  
  private void b(Chart paramChart, boolean paramBoolean)
    throws Exception
  {
    zkq localzkq = new zkq(null);
    try
    {
      zjf localzjf = null;
      try
      {
        localzjf = localzkq.d(paramChart);
        if (localzjf == null)
        {
          if ((localzjf != null) && (localzjf.ap() != null)) {
            localzjf.ap().dispose();
          }
          return;
        }
        zp localzp1 = localzjf.aj();
        zp localzp2 = localzjf.B().A();
        if (!localzjf.ab()) {
          paramChart.getPlotArea().a(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
        } else {
          paramChart.getPlotArea().a(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
        }
        paramChart.getPlotArea().c(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
        zp localzp3 = localzjf.x().c().A();
        Legend localLegend = paramChart.getLegend();
        localLegend.a(localzp3.c(), localzp3.d(), localzp3.e(), localzp3.f());
        a(paramChart.getValueAxis(), localzjf.G());
        a(paramChart.getCategoryAxis(), localzjf.f(), localzjf.U());
        a(paramChart.getSecondValueAxis(), localzjf.I());
        a(paramChart.getSecondCategoryAxis(), localzjf.h(), localzjf.U());
        a(paramChart, localzjf);
        Title localTitle = paramChart.r();
        if (localTitle != null)
        {
          if ((localTitle.isAutoText()) && (!"".equals(localzjf.L().b()))) {
            localTitle.a(localzjf.L().b());
          }
          if ((localTitle.getText() != null) && (!"".equals(localTitle.getText())))
          {
            zp localzp4 = localzjf.M().e().B();
            localTitle.b(localzp4.c(), localzp4.d(), localzp4.e(), localzp4.f());
            zp localzp5 = localzjf.M().e().A();
            localTitle.a(localzp5.c(), localzp5.d(), localzp5.e(), localzp5.f());
            localTitle.k(localzjf.M().e().a.e());
            localTitle.l(localzjf.M().e().a.f());
          }
        }
        a(paramChart.getCategoryAxis(), localzjf.e());
        a(paramChart.getSecondCategoryAxis(), localzjf.g());
        a(paramChart.getValueAxis(), localzjf.G());
        a(paramChart.getSecondValueAxis(), localzjf.I());
        b(paramChart, localzjf);
      }
      finally
      {
        if ((localzjf != null) && (localzjf.ap() != null)) {
          localzjf.ap().dispose();
        }
      }
    }
    finally
    {
      if (localzkq != null) {
        localzkq.a();
      }
    }
  }
  
  private void a(Axis paramAxis, zbt paramzbt)
    throws Exception
  {
    paramAxis.b(zko.K(paramzbt.b()));
    Title localTitle = paramAxis.n();
    zp localzp1;
    zp localzp2;
    zp localzp3;
    if (localTitle != null)
    {
      if ((localTitle.isAutoText()) && (!"".equals(paramzbt.L().b()))) {
        localTitle.a(paramzbt.L().b());
      }
      if ((localTitle.getText() != null) && (!"".equals(localTitle.getText())))
      {
        localzp1 = paramzbt.S().e().b;
        localzp2 = new zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
        localzp2.a(localzp2.c() * 4000 / paramzbt.e().a());
        localzp2.b(localzp2.d() * 4000 / paramzbt.e().b());
        localzp2.c(localzp2.e() * 4000 / paramzbt.e().a());
        localzp2.d(localzp2.f() * 4000 / paramzbt.e().b());
        localTitle.b(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
        localzp3 = paramzbt.S().e().A();
        localTitle.a(localzp3.c(), localzp3.d(), localzp3.e(), localzp3.f());
        localTitle.k(paramzbt.S().e().a.e());
        localTitle.l(paramzbt.S().e().a.f());
      }
    }
    if ((paramAxis.getDisplayUnit() != 0) && (paramzbt.T().d() != 0))
    {
      localzp1 = paramzbt.T().b().b;
      localzp2 = new zp(localzp1.c(), localzp1.d(), localzp1.e(), localzp1.f());
      localzp2.a(localzp2.c() * 4000 / paramzbt.e().a());
      localzp2.b(localzp2.d() * 4000 / paramzbt.e().b());
      localzp2.c(localzp2.e() * 4000 / paramzbt.e().a());
      localzp2.d(localzp2.f() * 4000 / paramzbt.e().b());
      paramAxis.getDisplayUnitLabel().b(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
      localzp3 = paramzbt.T().b().A();
      paramAxis.getDisplayUnitLabel().a(localzp3.c(), localzp3.d(), localzp3.e(), localzp3.f());
      paramAxis.getDisplayUnitLabel().k(paramzbt.T().b().a.e());
      paramAxis.getDisplayUnitLabel().l(paramzbt.T().b().a.f());
    }
  }
  
  private void a(Axis paramAxis, zagv paramzagv, boolean paramBoolean)
  {
    if (((paramAxis.getCategoryType() == 0) || (paramzagv.k() == 1)) && (paramAxis.l())) {
      paramAxis.c(paramzagv.H());
    }
    paramAxis.a(paramzagv.x());
    if (paramzagv.k() == 0)
    {
      paramAxis.b(Double.valueOf(paramzagv.z()));
    }
    else
    {
      paramAxis.b(Double.valueOf(paramzagv.z()));
      paramAxis.e(a(paramzagv.y()));
      paramAxis.d(a(paramzagv.j()));
    }
    paramAxis.b(paramzagv.B());
    if (paramzagv.k() == 0)
    {
      paramAxis.a(Double.valueOf(paramzagv.D()));
    }
    else
    {
      paramAxis.a(Double.valueOf(paramzagv.D()));
      paramAxis.f(a(paramzagv.C()));
    }
  }
  
  private void a(Axis paramAxis, zagv paramzagv)
  {
    paramAxis.setVisible(paramzagv.q());
    if (paramAxis.g()) {
      paramAxis.a(paramzagv.x());
    }
    if (paramAxis.f()) {
      paramAxis.b(Double.valueOf(paramzagv.z()));
    }
    if (paramAxis.h()) {
      paramAxis.b(paramzagv.B());
    }
    if (paramAxis.e()) {
      paramAxis.a(Double.valueOf(paramzagv.D()));
    }
  }
  
  private zbfd a(zbff paramzbff, int paramInt)
  {
    if (paramzbff.getCount() == 0) {
      return null;
    }
    if ((paramInt >= 0) && (paramInt < paramzbff.getCount()))
    {
      zbfd localzbfd = paramzbff.c(paramInt);
      if (localzbfd.a() == paramInt) {
        return localzbfd;
      }
    }
    for (int i = 0; i < paramzbff.getCount(); i++) {
      if (paramzbff.a(i).a() == paramInt) {
        return (zbfd)paramzbff.a(i);
      }
    }
    return null;
  }
  
  private zp a(zp paramzp, zahj paramzahj)
    throws Exception
  {
    zp localzp = zp.a();
    localzp.a((int)(paramzp.c() * 4000.0F / paramzahj.a() + 0.5D));
    localzp.b((int)(paramzp.d() * 4000.0F / paramzahj.b() + 0.5D));
    localzp.c((int)(paramzp.e() * 4000.0F / paramzahj.a() + 0.5D));
    localzp.d((int)(paramzp.f() * 4000.0F / paramzahj.b() + 0.5D));
    return localzp;
  }
  
  private void a(Chart paramChart, zjf paramzjf)
  {
    if (paramzjf.ab())
    {
      Walls localWalls = paramChart.getWalls();
      zbyv localzbyv = paramzjf.S();
      localWalls.a(localzbyv.j(), localzbyv.f() - localzbyv.i() / 2.0F, localzbyv.g(), localzbyv.i(), localzbyv.h());
      localWalls.a(localzbyv.a);
    }
  }
  
  private void b(Chart paramChart, zje paramzje)
  {
    if (paramzje.W())
    {
      Walls localWalls = paramChart.getWalls();
      zbyu localzbyu = paramzje.N();
      localWalls.a(localzbyu.j(), localzbyu.f() - localzbyu.i() / 2.0F, localzbyu.g(), localzbyu.i(), localzbyu.h());
      localWalls.a(localzbyu.a);
    }
  }
  
  private int a(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return 2;
    case 2: 
      return 1;
    }
    return 0;
  }
  
  private void b(Chart paramChart, zjf paramzjf)
    throws Exception
  {
    if (paramzjf == null) {
      return;
    }
    boolean bool = ChartCollection.b(paramChart.getType());
    a(paramChart.getChartArea(), paramzjf.i(), paramChart);
    a(paramChart.getPlotArea(), paramzjf.B(), paramChart);
    a(paramChart.getLegend(), paramzjf.x().c(), paramChart);
    if (paramChart.r() != null) {
      a(paramChart.getTitle(), paramzjf.M().e(), paramChart);
    }
    b(paramChart.getCategoryAxis(), paramzjf.e());
    b(paramChart.getSecondCategoryAxis(), paramzjf.g());
    b(paramChart.getValueAxis(), paramzjf.G());
    b(paramChart.getSecondValueAxis(), paramzjf.I());
    a(paramChart.getNSeries(), paramzjf.z(), paramzjf);
    if (bool)
    {
      if (paramChart.getPlotArea().getArea().getFormatting() == 0) {
        paramChart.getPlotArea().getArea().setFormatting(1);
      }
      a(paramChart.getWalls(), paramzjf.T().d());
      a(paramChart.getWalls().getBorder(), paramzjf.T().c(), paramChart);
      a(paramChart.getFloor(), paramzjf.s().c());
      a(paramChart.getFloor().getBorder(), paramzjf.s().a(), paramChart);
    }
  }
  
  private void a(ChartFrame paramChartFrame, zjy paramzjy, Chart paramChart)
  {
    a(paramChartFrame.getArea(), paramzjy.c());
    a(paramChartFrame.getBorder(), paramzjy.d(), paramChart);
  }
  
  private void a(Area paramArea, zaz paramzaz)
  {
    if (paramzaz.h() == 1) {
      switch (paramzaz.b())
      {
      case 8: 
      case 9: 
      case 10: 
      case 12: 
      case 13: 
        paramArea.setFormatting(1);
        break;
      case 11: 
      default: 
        if (paramzaz.g().isEmpty()) {
          paramArea.setFormatting(1);
        } else {
          paramArea.setForegroundColor(paramzaz.g());
        }
        break;
      }
    }
  }
  
  private void a(Line paramLine, zanr paramzanr, Chart paramChart)
  {
    if (paramLine.getFormattingType() == 0) {
      if (paramzanr.a().isEmpty())
      {
        paramLine.n(2);
      }
      else
      {
        paramLine.a(paramzanr.a());
        if ((!paramLine.k()) && (paramzanr.b().a() != 0.0D)) {
          paramLine.c(paramzanr.b().a() * 72.0D / zbxp.a());
        }
      }
    }
  }
  
  private void a(Marker paramMarker, zaos paramzaos)
  {
    if (paramMarker.getMarkerStyle() == 0) {
      paramMarker.a(zko.d(paramzaos.d()));
    }
    a(paramMarker.getArea(), paramzaos.e());
    a(paramMarker.getBorder(), paramzaos.f(), paramMarker.h());
  }
  
  private void b(Axis paramAxis, zbt paramzbt)
  {
    if (paramzbt.q())
    {
      if (paramAxis.n() != null)
      {
        a(paramAxis.getTitle(), paramzbt.S().e(), paramAxis.a());
        if (paramAxis.getTitle().getArea().getFormatting() == 0) {
          paramAxis.getTitle().getArea().setFormatting(1);
        }
      }
      if (paramAxis.m() != null)
      {
        a(paramAxis.getDisplayUnitLabel(), paramzbt.T().b(), paramAxis.a());
        if (paramAxis.getDisplayUnitLabel().getArea().getFormatting() == 0) {
          paramAxis.getDisplayUnitLabel().getArea().setFormatting(1);
        }
      }
      a(paramAxis.getAxisLine(), paramzbt.m(), paramAxis.a());
      a(paramAxis.getMajorGridLines(), paramzbt.w(), paramAxis.a());
      a(paramAxis.getMinorGridLines(), paramzbt.w(), paramAxis.a());
    }
  }
  
  private void a(SeriesCollection paramSeriesCollection, zbff paramzbff, zjf paramzjf)
    throws Exception
  {
    for (int i = 0; i < paramSeriesCollection.getCount(); i++)
    {
      Series localSeries = paramSeriesCollection.get(i);
      zbfd localzbfd = a(paramzbff, i);
      if (localzbfd != null)
      {
        localSeries.b(localzbfd.i());
        if (!paramSeriesCollection.isColorVaried())
        {
          a(localSeries.getArea(), localzbfd.A());
          if ((localzbfd.m() != 78) && (localzbfd.m() != 77))
          {
            a(localSeries.getBorder(), localzbfd.z(), paramSeriesCollection.e());
            a(localSeries.getMarker(), localzbfd.B());
          }
        }
        Object localObject1;
        Object localObject2;
        zp localzp1;
        zp localzp2;
        zp localzp3;
        zp localzp4;
        for (int j = 0; j <= localzbfd.k().getCount(); j++) {
          if ((paramSeriesCollection.e().getType() == 49) || (paramSeriesCollection.e().getType() == 46) || (j != localzbfd.k().getCount()))
          {
            localObject1 = localzbfd.F().b(j);
            if (j == localzbfd.k().getCount()) {
              localObject1 = localzbfd.u();
            }
            localObject2 = localSeries.getPoints().get(j);
            if ((localObject2 != null) && (localObject1 != null))
            {
              ((ChartPoint)localObject2).setXValue(((zkf)localObject1).s());
              ((ChartPoint)localObject2).setYValue(((zkf)localObject1).y());
              ((ChartPoint)localObject2).a(((zkf)localObject1).J().f(), ((zkf)localObject1).J().g());
              ((ChartPoint)localObject2).b(((zkf)localObject1).J().h(), ((zkf)localObject1).J().i());
              ((ChartPoint)localObject2).c(((zkf)localObject1).K(), ((zkf)localObject1).L());
              ((ChartPoint)localObject2).a(((zkf)localObject1).M());
              ((ChartPoint)localObject2).a(((zkf)localObject1).b, ((zkf)localObject1).c);
              ((ChartPoint)localObject2).a(((zkf)localObject1).d);
              if ((((ChartPoint)localObject2).g() != null) || (((ChartPoint)localObject2).f() != null) || (((ChartPoint)localObject2).h() != null) || (ChartCollection.c(localSeries.getType())) || (localSeries.getType() == 78))
              {
                a(((ChartPoint)localObject2).getArea(), ((zkf)localObject1).i());
                a(((ChartPoint)localObject2).getBorder(), ((zkf)localObject1).k(), paramSeriesCollection.e());
                a(((ChartPoint)localObject2).getMarker(), ((zkf)localObject1).m());
              }
              if (((zkf)localObject1).o().c())
              {
                localzp1 = new zp(((zkf)localObject1).o().a().b.c(), ((zkf)localObject1).o().a().b.d(), ((zkf)localObject1).o().a().b.e(), ((zkf)localObject1).o().a().b.f());
                if (((zkf)localObject1).o().e())
                {
                  localzp1.a(localzp1.c() - zra.a);
                  localzp1.c(localzp1.e() + 2 * zra.a);
                }
                localzp1.b(localzp1.d() - zra.a);
                localzp1.d(localzp1.f() + 2 * zra.a);
                localzp2 = a(localzp1, paramzjf);
                ((ChartPoint)localObject2).getDataLabels().b(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
                localzp3 = ((zkf)localObject1).o().a().a;
                localzp4 = a(localzp3, paramzjf);
                ((ChartPoint)localObject2).getDataLabels().a(localzp4.c(), localzp4.d(), localzp4.e(), localzp4.f());
                ((ChartPoint)localObject2).getDataLabels().k(((zkf)localObject1).o().a().a.e());
                ((ChartPoint)localObject2).getDataLabels().l(((zkf)localObject1).o().a().a.f());
              }
            }
          }
        }
        for (j = 0; (j < localSeries.getTrendLines().getCount()) && (j < localzbfd.H().getCount()); j++)
        {
          localObject1 = localSeries.getTrendLines().get(j);
          localObject2 = localzbfd.H().c(j);
          if (localObject2 != null)
          {
            a((Line)localObject1, ((zbxg)localObject2).d(), paramSeriesCollection.e());
            if (((zbxg)localObject2).r().c())
            {
              if ((((Trendline)localObject1).getDataLabels().isAutoText()) && (!"".equals(((zbxg)localObject2).b().s())))
              {
                ((Trendline)localObject1).getDataLabels().a(((zbxg)localObject2).b().s());
                if ((((Trendline)localObject1).getDataLabels().E() != null) && (((Trendline)localObject1).getDataLabels().E().size() > 0)) {
                  ((Trendline)localObject1).getDataLabels().E().clear();
                }
              }
              localzp1 = new zp(((zbxg)localObject2).r().a().b.c(), ((zbxg)localObject2).r().a().b.d(), ((zbxg)localObject2).r().a().b.e(), ((zbxg)localObject2).r().a().b.f());
              localzp1.b(localzp1.d() - zra.a);
              localzp1.d(localzp1.f() + 2 * zra.a);
              localzp2 = a(localzp1, paramzjf);
              ((Trendline)localObject1).getDataLabels().b(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
              localzp3 = ((zbxg)localObject2).r().a().a;
              localzp4 = a(localzp3, paramzjf);
              ((Trendline)localObject1).getDataLabels().a(localzp4.c(), localzp4.d(), localzp4.e(), localzp4.f());
              ((Trendline)localObject1).getDataLabels().k(((zbxg)localObject2).r().a().a.e());
              ((Trendline)localObject1).getDataLabels().l(((zbxg)localObject2).r().a().a.f());
            }
          }
        }
      }
    }
  }
  
  private void a(Area paramArea, zay paramzay)
  {
    if (paramArea.getFormatting() == 0) {
      if (paramzay.e().isEmpty()) {
        paramzay.a(0);
      } else {
        paramArea.setForegroundColor(paramzay.e());
      }
    }
  }
  
  private void a(Line paramLine, zanq paramzanq, Chart paramChart)
  {
    if (paramLine.getFormattingType() == 0) {
      if (paramzanq.a().isEmpty())
      {
        paramLine.n(2);
      }
      else
      {
        paramLine.a(paramzanq.a());
        if ((!paramLine.k()) && (paramzanq.b().a() != 0.0D)) {
          paramLine.c(paramzanq.b().a() * 72.0D / zbxp.a());
        }
      }
    }
  }
  
  private void a(Marker paramMarker, zaor paramzaor)
  {
    if (paramMarker.getMarkerStyle() == 0) {
      paramMarker.a(zko.d(paramzaor.d()));
    }
    a(paramMarker.getArea(), paramzaor.e());
    a(paramMarker.getBorder(), paramzaor.f(), paramMarker.h());
  }
  
  private void a(SeriesCollection paramSeriesCollection, zbfe paramzbfe, zje paramzje)
    throws Exception
  {
    for (int i = 0; i < paramSeriesCollection.getCount(); i++)
    {
      Series localSeries = paramSeriesCollection.get(i);
      zbfc localzbfc = a(paramzbfe, localSeries.b());
      if (localzbfc != null)
      {
        localSeries.b(localzbfc.i());
        if (!paramSeriesCollection.isColorVaried())
        {
          a(localSeries.getArea(), localzbfc.A());
          a(localSeries.getBorder(), localzbfc.z(), paramSeriesCollection.e());
          a(localSeries.getMarker(), localzbfc.B());
        }
        Object localObject1;
        Object localObject2;
        zp localzp1;
        zp localzp2;
        zp localzp3;
        zp localzp4;
        for (int j = 0; j <= localzbfc.D().getCount(); j++) {
          if ((paramSeriesCollection.e().getType() == 49) || (paramSeriesCollection.e().getType() == 46) || (j != localzbfc.k().getCount()))
          {
            localObject1 = localzbfc.D().b(j);
            if (j == localzbfc.k().getCount()) {
              localObject1 = localzbfc.u();
            }
            localObject2 = localSeries.getPoints().get(j);
            if ((localObject2 != null) && (localObject1 != null))
            {
              ((ChartPoint)localObject2).setXValue(((zke)localObject1).s());
              ((ChartPoint)localObject2).setYValue(((zke)localObject1).y());
              ((ChartPoint)localObject2).a(((zke)localObject1).K().f(), ((zke)localObject1).K().g());
              ((ChartPoint)localObject2).b(((zke)localObject1).K().h(), ((zke)localObject1).K().i());
              ((ChartPoint)localObject2).c(((zke)localObject1).L(), ((zke)localObject1).M());
              ((ChartPoint)localObject2).a(((zke)localObject1).N());
              ((ChartPoint)localObject2).a(((zke)localObject1).b, ((zke)localObject1).c);
              ((ChartPoint)localObject2).a(((zke)localObject1).d);
              if ((((ChartPoint)localObject2).g() != null) || (((ChartPoint)localObject2).f() != null) || (((ChartPoint)localObject2).h() != null))
              {
                a(((ChartPoint)localObject2).getArea(), ((zke)localObject1).i());
                a(((ChartPoint)localObject2).getBorder(), ((zke)localObject1).k(), paramSeriesCollection.e());
                a(((ChartPoint)localObject2).getMarker(), ((zke)localObject1).m());
              }
              if (((zke)localObject1).o().c())
              {
                localzp1 = new zp(((zke)localObject1).o().a().b.c(), ((zke)localObject1).o().a().b.d(), ((zke)localObject1).o().a().b.e(), ((zke)localObject1).o().a().b.f());
                if (((zke)localObject1).o().e())
                {
                  localzp1.a(localzp1.c() - zra.a);
                  localzp1.c(localzp1.e() + 2 * zra.a);
                }
                localzp1.b(localzp1.d() - zra.a);
                localzp1.d(localzp1.f() + 2 * zra.a);
                localzp2 = a(localzp1, paramzje);
                ((ChartPoint)localObject2).getDataLabels().b(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
                localzp3 = ((zke)localObject1).o().a().a;
                localzp4 = a(localzp3, paramzje);
                ((ChartPoint)localObject2).getDataLabels().a(localzp4.c(), localzp4.d(), localzp4.e(), localzp4.f());
                ((ChartPoint)localObject2).getDataLabels().k(((zke)localObject1).o().a().a.e());
                ((ChartPoint)localObject2).getDataLabels().l(((zke)localObject1).o().a().a.f());
              }
            }
          }
        }
        for (j = 0; (j < localSeries.getTrendLines().getCount()) && (j < localzbfc.F().getCount()); j++)
        {
          localObject1 = localSeries.getTrendLines().get(j);
          localObject2 = localzbfc.F().c(j);
          if (localObject2 != null)
          {
            a((Line)localObject1, ((zbxf)localObject2).d(), paramSeriesCollection.e());
            if (((zbxf)localObject2).q().c())
            {
              if ((((Trendline)localObject1).getDataLabels().isAutoText()) && (!"".equals(((zbxf)localObject2).b().s())))
              {
                ((Trendline)localObject1).getDataLabels().a(((zbxf)localObject2).b().s());
                if ((((Trendline)localObject1).getDataLabels().E() != null) && (((Trendline)localObject1).getDataLabels().E().size() > 0)) {
                  ((Trendline)localObject1).getDataLabels().E().clear();
                }
              }
              localzp1 = new zp(((zbxf)localObject2).q().a().b.c(), ((zbxf)localObject2).q().a().b.d(), ((zbxf)localObject2).q().a().b.e(), ((zbxf)localObject2).q().a().b.f());
              localzp1.b(localzp1.d() - zra.a);
              localzp1.d(localzp1.f() + 2 * zra.a);
              localzp2 = a(localzp1, paramzje);
              ((Trendline)localObject1).getDataLabels().b(localzp2.c(), localzp2.d(), localzp2.e(), localzp2.f());
              localzp3 = ((zbxf)localObject2).q().a().a;
              localzp4 = a(localzp3, paramzje);
              ((Trendline)localObject1).getDataLabels().a(localzp4.c(), localzp4.d(), localzp4.e(), localzp4.f());
              ((Trendline)localObject1).getDataLabels().k(((zbxf)localObject2).q().a().a.e());
              ((Trendline)localObject1).getDataLabels().l(((zbxf)localObject2).q().a().a.f());
            }
          }
        }
      }
    }
  }
  
  private zbfc a(zbfe paramzbfe, int paramInt)
  {
    if (paramInt < paramzbfe.getCount())
    {
      zbfc localzbfc = paramzbfe.c(paramInt);
      if (localzbfc.aj() == paramInt) {
        return localzbfc;
      }
      return a(paramzbfe, paramInt, 0, paramzbfe.getCount() - 1);
    }
    return null;
  }
  
  private zbfc a(zbfe paramzbfe, int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt3 - paramInt2)
    {
    case 0: 
      zbfc localzbfc1 = paramzbfe.c(paramInt2);
      if (paramInt1 == localzbfc1.ai()) {
        return localzbfc1;
      }
      return null;
    case 1: 
      zbfc localzbfc2 = paramzbfe.c(paramInt2);
      zbfc localzbfc3 = paramzbfe.c(paramInt3);
      if (paramInt1 == localzbfc2.ai()) {
        return localzbfc2;
      }
      if (paramInt1 == localzbfc3.ai()) {
        return localzbfc3;
      }
      return null;
    }
    zbfc localzbfc4 = paramzbfe.c(paramInt2);
    zbfc localzbfc5 = paramzbfe.c(paramInt3);
    if (paramInt1 > localzbfc5.ai()) {
      return null;
    }
    if (paramInt1 == localzbfc5.ai()) {
      return localzbfc5;
    }
    if ((paramInt1 > localzbfc4.ai()) && (paramInt1 < localzbfc5.ai()))
    {
      int i = (paramInt3 + paramInt2) / 2;
      zbfc localzbfc6 = paramzbfe.c(i);
      if (paramInt1 > localzbfc6.ai())
      {
        if (paramInt3 - i == 1) {
          return null;
        }
        return a(paramzbfe, paramInt1, i + 1, paramInt3 - 1);
      }
      if (paramInt1 == localzbfc6.ai()) {
        return localzbfc6;
      }
      if (i - paramInt2 == 1) {
        return null;
      }
      return a(paramzbfe, paramInt1, paramInt2 + 1, i - 1);
    }
    if (paramInt1 == localzbfc4.ai()) {
      return localzbfc4;
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */