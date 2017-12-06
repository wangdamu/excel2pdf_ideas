package com.aspose.cells;

class zrb
{
  String a;
  String b;
  String c;
  String d;
  String e;
  String f;
  String g;
  String h;
  String i;
  
  boolean a()
  {
    if (zauj.C(this.f) < 0.0D) {
      return false;
    }
    return zauj.C(this.g) >= 0.0D;
  }
  
  void a(Chart paramChart, Title paramTitle)
  {
    if ("inner".equals(this.a)) {
      paramTitle.setInnerMode(true);
    }
    if (((this.b == null) || ("factor".equals(this.b))) && ((this.c == null) || ("factor".equals(this.c))))
    {
      if (this.f != null)
      {
        paramTitle.e((int)(zauj.C(this.f) * 4000.0D + 0.5D));
        paramTitle.e(false);
        paramTitle.a(false);
      }
      if (this.g != null)
      {
        paramTitle.f((int)(zauj.C(this.g) * 4000.0D + 0.5D));
        paramTitle.f(false);
        paramTitle.b(false);
      }
    }
    else if (("edge".equals(this.b)) && ("edge".equals(this.c)))
    {
      paramTitle.g(false);
      if (this.f != null)
      {
        paramTitle.e((int)(zauj.C(this.f) * 4000.0D + 0.5D));
        paramTitle.e(false);
        paramTitle.a(true);
      }
      if (this.g != null)
      {
        paramTitle.f((int)(zauj.C(this.g) * 4000.0D + 0.5D));
        paramTitle.f(false);
        paramTitle.b(true);
      }
    }
  }
  
  void a(Chart paramChart)
  {
    PlotArea localPlotArea = paramChart.getPlotArea();
    if (!"inner".equals(this.a))
    {
      if (("edge".equals(this.b)) && (this.f != null))
      {
        localPlotArea.e((int)(zauj.C(this.f) * 4000.0D + 0.5D));
        localPlotArea.e(false);
        localPlotArea.a(true);
      }
      if (("edge".equals(this.c)) && (this.g != null))
      {
        localPlotArea.f((int)(zauj.C(this.g) * 4000.0D + 0.5D));
        localPlotArea.f(false);
        localPlotArea.b(true);
      }
      if (((this.d == null) || ("factor".equals(this.d))) && (this.h != null))
      {
        localPlotArea.setWidth((int)(4000.0D * zauj.C(this.h) + 0.5D));
        localPlotArea.c(false);
      }
      if (((this.e == null) || ("factor".equals(this.e))) && (this.i != null))
      {
        localPlotArea.setHeight((int)(4000.0D * zauj.C(this.i) + 0.5D));
        localPlotArea.d(false);
      }
    }
    else
    {
      if (("edge".equals(this.b)) && (this.f != null))
      {
        localPlotArea.i = ((int)(zauj.C(this.f) * 4000.0D + 0.5D));
        localPlotArea.e(false);
        localPlotArea.a(true);
      }
      if (("edge".equals(this.c)) && (this.g != null))
      {
        localPlotArea.j = ((int)(zauj.C(this.g) * 4000.0D + 0.5D));
        localPlotArea.f(false);
        localPlotArea.b(true);
      }
      if (((this.d == null) || ("factor".equals(this.d))) && (this.h != null))
      {
        localPlotArea.setInnerWidth((int)(4000.0D * zauj.C(this.h) + 0.5D));
        localPlotArea.c(false);
      }
      if (((this.e == null) || ("factor".equals(this.e))) && (this.i != null))
      {
        localPlotArea.setInnerHeight((int)(4000.0D * zauj.C(this.i) + 0.5D));
        localPlotArea.d(false);
      }
    }
    paramChart.a((byte)(paramChart.k() & 0xFF | 0x18));
  }
  
  void a(Chart paramChart, Legend paramLegend)
  {
    if ("inner".equals(this.a)) {
      paramLegend.setInnerMode(true);
    }
    if (("edge".equals(this.b)) && (this.f != null))
    {
      paramLegend.e((int)(zauj.C(this.f) * 4000.0D + 0.5D));
      paramLegend.e(false);
      paramLegend.a(true);
    }
    if (("edge".equals(this.c)) && (this.g != null))
    {
      paramLegend.f((int)(zauj.C(this.g) * 4000.0D + 0.5D));
      paramLegend.f(false);
      paramLegend.b(true);
    }
    if (((this.d == null) || ("factor".equals(this.d))) && (this.h != null))
    {
      paramLegend.setWidth((int)(zauj.C(this.h) * 4000.0D + 0.5D));
      paramLegend.c(false);
    }
    else if (("edge".equals(this.d)) && (this.h != null))
    {
      paramLegend.setWidth((int)(zauj.C(this.h) * 4000.0D + 0.5D) - paramLegend.getX());
      paramLegend.c(false);
    }
    if (((this.e == null) || ("factor".equals(this.e))) && (this.i != null))
    {
      paramLegend.setHeight((int)(zauj.C(this.i) * 4000.0D + 0.5D));
      paramLegend.d(false);
    }
    else if (("edge".equals(this.e)) && (this.i != null))
    {
      paramLegend.setHeight((int)(zauj.C(this.i) * 4000.0D + 0.5D) - paramLegend.getY());
      paramLegend.d(false);
    }
  }
  
  void a(Chart paramChart, DataLabels paramDataLabels)
  {
    if (((this.b == null) || ("factor".equals(this.b))) && (this.f != null))
    {
      paramDataLabels.i((int)(zauj.C(this.f) * 4000.0D + 0.5D));
      paramDataLabels.m(2007);
    }
    if (((this.c == null) || ("factor".equals(this.c))) && (this.g != null))
    {
      paramDataLabels.j((int)(zauj.C(this.g) * 4000.0D + 0.5D));
      paramDataLabels.m(2007);
    }
    paramDataLabels.n(9);
  }
  
  void b(Chart paramChart, DataLabels paramDataLabels)
  {
    if (this.h != null)
    {
      paramDataLabels.h((int)(zauj.C(this.h) * 4000.0D + 0.5D));
      paramDataLabels.g(false);
      paramDataLabels.c(true);
    }
    if (this.i != null)
    {
      paramDataLabels.g((int)(zauj.C(this.i) * 4000.0D + 0.5D));
      paramDataLabels.g(false);
      paramDataLabels.d(true);
    }
  }
  
  void a(Chart paramChart, DisplayUnitLabel paramDisplayUnitLabel)
  {
    if ("inner".equals(this.a)) {
      paramDisplayUnitLabel.setInnerMode(true);
    }
    if (("edge".equals(this.b)) && (this.f != null))
    {
      paramDisplayUnitLabel.e((int)(zauj.C(this.f) * 4000.0D + 0.5D));
      paramDisplayUnitLabel.e(false);
      paramDisplayUnitLabel.a(true);
    }
    if (("edge".equals(this.c)) && (this.g != null))
    {
      paramDisplayUnitLabel.f((int)(zauj.C(this.g) * 4000.0D + 0.5D));
      paramDisplayUnitLabel.f(false);
      paramDisplayUnitLabel.b(true);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */