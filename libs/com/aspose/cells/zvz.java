package com.aspose.cells;

import java.util.HashMap;
import java.util.Iterator;

class zvz
{
  private Workbook a;
  private Worksheet b;
  private zpu c;
  
  zvz(zpu paramzpu)
  {
    this.c = paramzpu;
    this.a = paramzpu.b;
    this.b = paramzpu.a;
  }
  
  void a(zcjz paramzcjz, zvy paramzvy)
    throws Exception
  {
    if (!a()) {
      return;
    }
    paramzcjz.b("extLst");
    paramzvy.b(paramzcjz);
    a(paramzcjz);
    a(paramzcjz, 1);
    a(paramzcjz, 2);
    a(paramzcjz, "{7E03D99C-DC04-49d9-9315-930204A7B6E9}");
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, String paramString)
    throws Exception
  {
    if ((this.b.k != null) && (this.b.k.b != null))
    {
      String str = (String)this.b.k.b.get(paramString);
      paramzcjz.d(str);
    }
  }
  
  private void a(zcjz paramzcjz, int paramInt)
    throws Exception
  {
    if (this.c.w == null) {
      return;
    }
    String str1 = null;
    String str2 = null;
    String str3 = null;
    switch (paramInt)
    {
    case 1: 
      str1 = "{A8765BA9-456A-4dab-B4F3-ACF838C121DE}";
      str2 = "x14";
      str3 = zaty.c;
      break;
    case 2: 
      str1 = "{3A4CF648-6AED-40f4-86FF-DC5316D8AED3}";
      str3 = zaty.d;
      str2 = "x15";
      break;
    }
    zrl localzrl = (zrl)this.c.w.get(str1);
    if (localzrl == null) {
      return;
    }
    paramzcjz.b("ext");
    paramzcjz.a("uri", str1);
    paramzcjz.a("xmlns", str2, null, str3);
    if (paramInt == 2) {
      str2 = "x14";
    }
    paramzcjz.a(str2, "slicerList", false);
    if (paramInt == 2) {
      paramzcjz.a("xmlns", str2, null, zaty.c);
    }
    paramzcjz.a(str2, "slicer", false);
    paramzcjz.a("r:id", localzrl.b);
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private boolean a()
  {
    this.b.getSparklineGroupCollection().b();
    if ((this.b.k != null) && (this.b.k.b != null) && (this.b.k.b.size() > 0)) {
      return true;
    }
    if (this.b.getSparklineGroupCollection().getCount() > 0) {
      return true;
    }
    if (b()) {
      return true;
    }
    return (this.c.w != null) && (this.c.w.size() > 0);
  }
  
  private boolean b()
  {
    return this.b.getConditionalFormattings().b();
  }
  
  private void a(zcjz paramzcjz)
    throws Exception
  {
    if (this.b.getSparklineGroupCollection().getCount() == 0) {
      return;
    }
    paramzcjz.b("ext");
    paramzcjz.a("uri", "{05C60535-1F16-4fd2-B633-F4F36F0B64E0}");
    paramzcjz.a("xmlns:x14", "http://schemas.microsoft.com/office/spreadsheetml/2009/9/main");
    paramzcjz.b("x14:sparklineGroups");
    paramzcjz.a("xmlns:xm", "http://schemas.microsoft.com/office/excel/2006/main");
    Iterator localIterator = this.b.getSparklineGroupCollection().iterator();
    while (localIterator.hasNext())
    {
      SparklineGroup localSparklineGroup = (SparklineGroup)localIterator.next();
      a(paramzcjz, localSparklineGroup);
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, SparklineGroup paramSparklineGroup)
    throws Exception
  {
    paramzcjz.b("x14:sparklineGroup");
    b(paramzcjz, paramSparklineGroup);
    a(paramzcjz, "colorSeries", paramSparklineGroup.getSeriesColor());
    a(paramzcjz, "colorNegative", paramSparklineGroup.getNegativePointsColor());
    a(paramzcjz, "colorAxis", paramSparklineGroup.getHorizontalAxisColor());
    a(paramzcjz, "colorMarkers", paramSparklineGroup.getMarkersColor());
    a(paramzcjz, "colorFirst", paramSparklineGroup.getFirstPointColor());
    a(paramzcjz, "colorLast", paramSparklineGroup.getLastPointColor());
    a(paramzcjz, "colorHigh", paramSparklineGroup.getHighPointColor());
    a(paramzcjz, "colorLow", paramSparklineGroup.getLowPointColor());
    String str = paramSparklineGroup.getHorizontalAxisDateRange();
    if (str != null) {
      paramzcjz.b("xm:f", str);
    }
    paramzcjz.b("x14:sparklines");
    Iterator localIterator = paramSparklineGroup.getSparklineCollection().iterator();
    while (localIterator.hasNext())
    {
      Sparkline localSparkline = (Sparkline)localIterator.next();
      a(paramzcjz, localSparkline);
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Sparkline paramSparkline)
    throws Exception
  {
    paramzcjz.b("x14:sparkline");
    String str = paramSparkline.getDataRange();
    if ((str != null) && (!"".equals(str))) {
      paramzcjz.b("xm:f", paramSparkline.getDataRange());
    }
    paramzcjz.b("xm:sqref", CellsHelper.cellIndexToName(paramSparkline.getRow(), paramSparkline.getColumn()));
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, SparklineGroup paramSparklineGroup)
    throws Exception
  {
    if (paramSparklineGroup.getVerticalAxisMaxValueType() == 2) {
      paramzcjz.a("manualMax", zauj.b(paramSparklineGroup.c));
    }
    if (paramSparklineGroup.getVerticalAxisMinValueType() == 2) {
      paramzcjz.a("manualMin", zauj.b(paramSparklineGroup.d));
    }
    if ((paramSparklineGroup.getType() == 0) && (paramSparklineGroup.getLineWeight() != 0.75D)) {
      paramzcjz.a("lineWeight", zauj.b(paramSparklineGroup.getLineWeight()));
    }
    if (paramSparklineGroup.getType() != 0) {
      paramzcjz.a("type", zauj.aD(paramSparklineGroup.getType()));
    }
    if (paramSparklineGroup.getHorizontalAxisDateRange() != null) {
      paramzcjz.a("dateAxis", "1");
    }
    if (paramSparklineGroup.getPlotEmptyCellsType() != 1) {
      paramzcjz.a("displayEmptyCellsAs", zauj.at(paramSparklineGroup.getPlotEmptyCellsType()));
    }
    if ((paramSparklineGroup.getType() == 0) && (paramSparklineGroup.getShowMarkers())) {
      paramzcjz.a("markers", "1");
    }
    if (paramSparklineGroup.getShowHighPoint()) {
      paramzcjz.a("high", "1");
    }
    if (paramSparklineGroup.getShowLowPoint()) {
      paramzcjz.a("low", "1");
    }
    if (paramSparklineGroup.getShowFirstPoint()) {
      paramzcjz.a("first", "1");
    }
    if (paramSparklineGroup.getShowLastPoint()) {
      paramzcjz.a("last", "1");
    }
    if (paramSparklineGroup.getShowNegativePoints()) {
      paramzcjz.a("negative", "1");
    }
    if (paramSparklineGroup.getShowHorizontalAxis()) {
      paramzcjz.a("displayXAxis", "1");
    }
    if (paramSparklineGroup.getDisplayHidden()) {
      paramzcjz.a("displayHidden", "1");
    }
    if (paramSparklineGroup.getVerticalAxisMinValueType() != 0) {
      paramzcjz.a("minAxisType", zauj.aE(paramSparklineGroup.getVerticalAxisMinValueType()));
    }
    if (paramSparklineGroup.getVerticalAxisMaxValueType() != 0) {
      paramzcjz.a("maxAxisType", zauj.aE(paramSparklineGroup.getVerticalAxisMaxValueType()));
    }
    if (paramSparklineGroup.getPlotRightToLeft()) {
      paramzcjz.a("rightToLeft", "1");
    }
  }
  
  private void a(zcjz paramzcjz, String paramString, CellsColor paramCellsColor)
    throws Exception
  {
    zaml localzaml = paramCellsColor.a;
    paramzcjz.b("x14:" + paramString);
    if (localzaml.c() == 4)
    {
      paramzcjz.a("theme", zauj.z(localzaml.e()));
      if (localzaml.g() != 0.0D) {
        paramzcjz.a("tint", a(localzaml.g()));
      }
    }
    else if (localzaml.c() == 2)
    {
      paramzcjz.a("rgb", "FF" + zauj.a(Color.fromArgb(localzaml.e())));
      if (localzaml.g() != 0.0D) {
        paramzcjz.a("tint", a(localzaml.g()));
      }
    }
    else
    {
      paramzcjz.a("rgb", "FF" + zauj.a(paramCellsColor.getColor()));
    }
    paramzcjz.b();
  }
  
  private String a(double paramDouble)
  {
    double d1 = 1.0E-4D;
    double d2;
    if (paramDouble < 0.0D)
    {
      d2 = paramDouble + 0.499984740745262D;
      if (Math.abs(d2) < d1) {
        return "-0.499984740745262";
      }
      if ((d2 > 0.0D) && (Math.abs(paramDouble + 0.249977111117893D) < d1)) {
        return "-0.249977111117893";
      }
    }
    else
    {
      d2 = paramDouble - 0.3999755851924192D;
      if (Math.abs(d2) < d1) {
        return "0.39997558519241921";
      }
      if (d2 > 0.0D)
      {
        d2 = paramDouble - 0.499984740745262D;
        if (Math.abs(d2) < d1) {
          return "0.499984740745262";
        }
        if ((d2 > 0.0D) && (Math.abs(paramDouble - 0.7999816888943144D) < d1)) {
          return "0.79998168889431442";
        }
      }
      else
      {
        d2 = paramDouble - 0.3499862666707358D;
        if (Math.abs(d2) < d1) {
          return "0.34998626667073579";
        }
        if ((d2 < 0.0D) && (Math.abs(paramDouble - 0.249977111117893D) < d1)) {
          return "0.249977111117893";
        }
      }
    }
    return zauj.b(paramDouble);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */