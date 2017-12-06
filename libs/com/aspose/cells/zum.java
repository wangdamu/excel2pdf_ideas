package com.aspose.cells;

import com.aspose.cells.a.c.zt;
import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zum
  extends ztp
{
  private Chart b;
  private Workbook c;
  private zpe d;
  private zcjz e = null;
  
  static boolean a(int paramInt)
  {
    switch (paramInt)
    {
    case 73: 
    case 74: 
    case 75: 
    case 76: 
    case 77: 
    case 78: 
    case 79: 
      return true;
    }
    return false;
  }
  
  zum(zpe paramzpe)
  {
    this.d = paramzpe;
    this.b = paramzpe.a;
    this.c = paramzpe.a().a;
  }
  
  private void e() {}
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    this.e = paramzcjz;
    e();
    paramzcjz.b(true);
    paramzcjz.c("c:chartSpace", null);
    paramzcjz.a("xmlns", "c", null, "http://schemas.microsoft.com/office/drawing/2014/chartex");
    paramzcjz.a("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
    paramzcjz.a("xmlns", "r", null, zaty.e);
    f();
    g();
    a(paramzcjz, this.b.getChartArea().w());
    zul.a(paramzcjz, this.b.getChartArea());
    l();
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void f()
    throws Exception
  {
    this.e.c("c:chartData", null);
    int i = 0;
    Iterator localIterator = this.b.getNSeries().iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      this.e.c("c:data", null);
      this.e.a("id", zauj.z(i));
      if (localSeries.o() != null) {
        a("strDim", localSeries.o(), "cat");
      }
      if (localSeries.m() != null)
      {
        String str = "val";
        switch (localSeries.getType())
        {
        case 76: 
        case 77: 
          str = "size";
          break;
        case 73: 
        case 74: 
        case 75: 
        case 78: 
        case 79: 
          break;
        }
        a("numDim", localSeries.m(), str);
      }
      this.e.b();
      i++;
    }
    this.e.b();
  }
  
  private void a(String paramString1, zjk paramzjk, String paramString2)
    throws Exception
  {
    this.e.c("c", paramString1, null);
    this.e.a("type", paramString2);
    this.e.c("c:f", null);
    if (!paramzjk.m()) {
      this.e.a("dir", "row");
    }
    String str = paramzjk.q();
    if (str.startsWith("=[0]!")) {
      str = str.substring("=[0]!".length());
    } else {
      str = str.substring(1);
    }
    this.e.a(str);
    this.e.b();
    this.e.b();
  }
  
  private void g()
    throws Exception
  {
    this.e.c("c:chart", null);
    if (this.b.r() != null) {
      a(this.b.r(), true);
    }
    h();
    k();
    this.e.b();
  }
  
  private static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "b";
    case 4: 
      return "l";
    case 3: 
      return "t";
    case 2: 
      return "t";
    case 1: 
      return "t";
    }
    return "t";
  }
  
  private void a(Title paramTitle, boolean paramBoolean)
    throws Exception
  {
    if ((paramTitle == null) || (!paramTitle.isVisible())) {
      return;
    }
    this.e.c("c:title", null);
    if (paramBoolean)
    {
      this.e.a("pos", b(paramTitle.m));
      this.e.a("align", ztr.b(paramTitle.m, paramTitle.l));
      this.e.a("overlay", paramTitle.getOverLay() ? "1" : "0");
    }
    b(paramTitle);
    a(this.e, paramTitle.w());
    this.e.b();
  }
  
  private void a(ChartTextFrame paramChartTextFrame)
    throws Exception
  {
    this.e.c("c:tx", null);
    this.e.c("c:rich", null);
    zul.a(this.e, paramChartTextFrame.getTextVerticalAlignment(), false, paramChartTextFrame.getRotationAngle(), paramChartTextFrame.H(), paramChartTextFrame.I(), paramChartTextFrame.getTextDirection(), paramChartTextFrame.j, paramChartTextFrame.isResizeShapeToFitText());
    this.e.b("a:lstStyle", null);
    zpm localzpm = zpm.a(paramChartTextFrame, this.c);
    localzpm.a = true;
    zul.a(this.e, localzpm, 0);
    this.e.b();
    this.e.b();
  }
  
  private void a(String paramString1, String paramString2)
    throws Exception
  {
    if ((zbsn.a(paramString1)) && (zbsn.a(paramString2))) {
      return;
    }
    this.e.c("c:tx", null);
    this.e.c("c:txData", null);
    if ((!zbsn.a(paramString1)) && (paramString1.charAt(0) == '=')) {
      if (paramString1.startsWith("=[0]!")) {
        this.e.b("c:f", paramString1.substring("=[0]!".length()));
      } else {
        this.e.b("c:f", paramString1.substring(1));
      }
    }
    if (paramString2 != null) {
      this.e.b("c:v", paramString2);
    }
    this.e.b();
    this.e.b();
  }
  
  private void b(ChartTextFrame paramChartTextFrame)
    throws Exception
  {
    Font localFont = paramChartTextFrame.j();
    if ((localFont == null) && (paramChartTextFrame.isAutoText())) {
      return;
    }
    if ((paramChartTextFrame.E() != null) && (paramChartTextFrame.E().size() > 1))
    {
      a(paramChartTextFrame);
    }
    else
    {
      if (!paramChartTextFrame.isAutoText()) {
        a(null, paramChartTextFrame.getText());
      }
      zul.a(this.e, paramChartTextFrame);
    }
  }
  
  private static boolean c(int paramInt)
  {
    switch (paramInt)
    {
    case 76: 
    case 77: 
      return false;
    }
    return true;
  }
  
  private void h()
    throws Exception
  {
    this.e.c("c:plotArea", null);
    i();
    int i = 0;
    if (c(this.b.getType()))
    {
      a(this.b.getCategoryAxis(), true, i++);
      a(this.b.getValueAxis(), false, i++);
    }
    if ((this.b.getType() == 75) && (this.b.l != null)) {
      a(this.b.l, false, i++);
    }
    a(this.e, this.b.getPlotArea().w());
    this.e.b();
  }
  
  private void i()
    throws Exception
  {
    this.e.c("c:plotAreaRegion", null);
    for (int i = 0; i < this.b.getNSeries().getCount(); i++)
    {
      Series localSeries = this.b.getNSeries().get(i);
      b(localSeries, i);
    }
    if (this.b.getType() == 75) {
      j();
    }
    this.e.b();
  }
  
  private void j()
    throws Exception
  {
    for (int i = 0; i < this.b.getNSeries().getCount(); i++)
    {
      Series localSeries = this.b.getNSeries().get(i);
      a(localSeries, i);
    }
  }
  
  private void a(Series paramSeries, int paramInt)
    throws Exception
  {
    this.e.c("c:series", null);
    this.e.a("layoutId", "paretoLine");
    this.e.a("ownerIdx", zauj.z(paramInt));
    this.e.a("uniqueId", "{" + zs.a(zh.b()) + "}");
    this.e.a("formatIdx", zauj.z(paramInt * 2 + 1));
    if ((paramInt == 0) && (this.b.getNSeries().a != null)) {
      a(this.e, this.b.getNSeries().a);
    }
    this.e.c("c:axisId", null);
    this.e.a("val", "2");
    this.e.b();
    this.e.b();
  }
  
  private static String d(int paramInt)
  {
    switch (paramInt)
    {
    case 73: 
      return "boxWhisker";
    case 14: 
      return "clusteredColumn";
    case 74: 
      return "funnel";
    case 75: 
      return "paretoLine";
    case 76: 
      return "sunburst";
    case 77: 
      return "treemap";
    case 78: 
      return "waterfall";
    case 79: 
      return "clusteredColumn";
    }
    return "clusteredColumn";
  }
  
  static String d()
  {
    String str1 = zw.a(zt.a(), ".", "");
    String str2 = zh.b().a(null, za.b());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{");
    localStringBuilder.append(str2.substring(0, 9));
    localStringBuilder.append(str1);
    localStringBuilder.append(str2.substring(13));
    localStringBuilder.append("}");
    return zs.a(localStringBuilder);
  }
  
  private void b(Series paramSeries, int paramInt)
    throws Exception
  {
    this.e.c("c:series", null);
    if (paramSeries.getType() == 75) {
      this.e.a("layoutId", "clusteredColumn");
    } else {
      this.e.a("layoutId", d(paramSeries.getType()));
    }
    if (paramSeries.a) {
      this.e.a("hidden", "1");
    }
    this.e.a("uniqueId", d());
    if (paramSeries.e != -1) {
      this.e.a("formatIdx", zauj.z(paramSeries.e));
    }
    a(paramSeries.getName(), paramSeries.c);
    a(this.e, paramSeries.G());
    if (paramSeries.r() != null) {
      a(paramSeries.r(), paramSeries);
    }
    if ((paramSeries.m() != null) || (paramSeries.o() != null))
    {
      this.e.c("c:dataId", null);
      this.e.a("val", zauj.z(paramInt));
      this.e.b();
    }
    if (paramSeries.getType() == 75)
    {
      this.e.c("c:axisId", null);
      this.e.a("val", "1");
      this.e.b();
    }
    a(paramSeries);
    this.e.b();
  }
  
  private void a(Series paramSeries)
    throws Exception
  {
    this.e.b("c:layoutPr");
    zbfi localzbfi = paramSeries.a();
    switch (paramSeries.getType())
    {
    case 78: 
      if (!localzbfi.a()) {
        a(this.e, "c:visibility", "connectorLines", "0");
      }
      if (localzbfi.f().length > 0)
      {
        this.e.b("c:subtotals");
        for (int i = 0; i < localzbfi.f().length; i++) {
          a(this.e, "c:idx", "val", zp.a(localzbfi.f()[i]));
        }
        this.e.b();
      }
      else
      {
        this.e.d("<c:subtotals/>");
      }
      break;
    case 76: 
      if (localzbfi.c(64))
      {
        String str = "overlapping";
        switch (localzbfi.h())
        {
        case 1: 
          str = "none";
          break;
        case 0: 
          str = "banner";
          break;
        }
        a(this.e, "c:parentLabelLayout", "val", str);
      }
      break;
    case 73: 
      this.e.b("c:visibility");
      this.e.a("meanLine", localzbfi.b() ? "1" : "0");
      this.e.a("meanMarker", localzbfi.d() ? "1" : "0");
      this.e.a("nonoutliers", localzbfi.e() ? "1" : "0");
      this.e.a("outliers", localzbfi.c() ? "1" : "0");
      this.e.b();
      a(this.e, "c:statistics", "quartileMethod", localzbfi.g() == 1 ? "inclusive" : "exclusive");
      break;
    case 75: 
    case 79: 
      this.e.b("c:binning");
      this.e.a("intervalClosed", localzbfi.i() ? "l" : "r");
      this.e.b();
      break;
    }
    this.e.b();
  }
  
  private void a(DataLabels paramDataLabels, Series paramSeries)
    throws Exception
  {
    this.e.c("c:dataLabels", null);
    if (paramDataLabels != null) {
      a(paramDataLabels, paramSeries, null);
    }
    ChartPointCollection localChartPointCollection = paramSeries.getPoints();
    for (int i = 0; i < localChartPointCollection.a(); i++)
    {
      ChartPoint localChartPoint = localChartPointCollection.c(i);
      DataLabels localDataLabels = localChartPoint.j();
      if ((localDataLabels != null) && ((!localDataLabels.d(paramDataLabels)) || (!localDataLabels.m()) || (localDataLabels.x()) || (!zbsn.a(localDataLabels.F())))) {
        if (paramDataLabels.isDeleted())
        {
          this.e.c("c:dataLabelHidden", null);
          this.e.a("idx", zauj.z(localChartPoint.a));
          this.e.b();
        }
        else
        {
          a(paramDataLabels, paramSeries, localChartPoint);
        }
      }
    }
    this.e.b();
  }
  
  private void a(String paramString, boolean paramBoolean)
    throws Exception
  {
    if ((zw.b(paramString)) && (paramBoolean)) {
      return;
    }
    this.e.c("c:numFmt", null);
    if (!zw.b(paramString)) {
      this.e.a("formatCode", paramString);
    }
    this.e.a("sourceLinked", paramBoolean ? "1" : "0");
    this.e.b();
  }
  
  private void a(DataLabels paramDataLabels, Series paramSeries, ChartPoint paramChartPoint)
    throws Exception
  {
    if (paramChartPoint != null)
    {
      this.e.c("c:dataLabel", null);
      this.e.a("idx", zp.a(paramChartPoint.a + 1));
    }
    this.e.a("pos", zauj.c(paramDataLabels.getPosition(), paramSeries.getType()));
    if (paramDataLabels.O())
    {
      String str = zul.a(this.c, paramDataLabels);
      a(str, paramDataLabels.N());
    }
    boolean bool = a(this.e, paramDataLabels.w());
    if ((!bool) && (!paramDataLabels.a())) {
      this.e.b("c:spPr", null);
    }
    zul.a(this.e, paramDataLabels);
    a(paramDataLabels);
    if (paramDataLabels.Q()) {
      this.e.b("c:separator", paramDataLabels.getSeparatorValue());
    }
    if (paramChartPoint != null) {
      this.e.b();
    }
  }
  
  private void a(DataLabels paramDataLabels)
    throws Exception
  {
    this.e.c("c:visibility", null);
    this.e.a("seriesName", paramDataLabels.getShowSeriesName() ? "1" : "0");
    this.e.a("categoryName", paramDataLabels.getShowCategoryName() ? "1" : "0");
    this.e.a("value", paramDataLabels.getShowValue() ? "1" : "0");
    this.e.b();
  }
  
  private void a(Axis paramAxis, boolean paramBoolean, int paramInt)
    throws Exception
  {
    this.e.c("c:axis", null);
    this.e.a("id", zauj.z(paramInt));
    if (!paramAxis.isVisible()) {
      this.e.a("hidden", "1");
    }
    if (paramBoolean) {
      b(paramAxis);
    } else {
      c(paramAxis);
    }
    a(paramAxis.n(), false);
    a(paramAxis);
    if ((paramAxis.o() != null) || (zauj.O(this.b.getType())))
    {
      this.e.c("c:majorGridlines", null);
      a(this.e, paramAxis.s());
      this.e.b();
    }
    if (paramAxis.p() != null)
    {
      this.e.c("c:minorGridlines", null);
      a(this.e, paramAxis.t());
      this.e.b();
    }
    if (paramAxis.getMajorTickMark() != 2)
    {
      localObject = zauj.r(paramAxis.getMajorTickMark());
      a(this.e, "c:majorTickMarks", "type", (String)localObject);
    }
    if (paramAxis.getMinorTickMark() != 2)
    {
      localObject = zauj.r(paramAxis.getMinorTickMark());
      a(this.e, "c:minorTickMarks", "type", (String)localObject);
    }
    if (paramAxis.getTickLabels().b) {
      this.e.d("<c:tickLabels/>");
    }
    Object localObject = null;
    boolean bool = paramAxis.getTickLabels().getNumberFormatLinked();
    if (!bool) {
      localObject = zul.a(this.c, paramAxis.getTickLabels());
    }
    a((String)localObject, bool);
    if (paramAxis.h != null) {
      a(this.e, paramAxis.h);
    }
    if ((!zul.a(this.b.getChartArea().j(), paramAxis.getTickLabels().a())) || (!paramAxis.getTickLabels().c()))
    {
      localObject = paramAxis.getTickLabels().a();
      if ((localObject == null) && (!paramAxis.getTickLabels().c())) {
        localObject = paramAxis.getTickLabels().getFont();
      }
      zul.a(this.e, this.c, (Font)localObject, paramAxis.getTickLabels().c(), paramAxis.getTickLabels().getRotationAngle(), null, paramAxis.getTickLabels().e(), paramAxis.getTickLabels().f(), paramAxis.getTickLabels().getTextDirection());
    }
    this.e.b();
  }
  
  private static void a(zcjz paramzcjz, String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    paramzcjz.c(paramString1, null);
    paramzcjz.a(paramString2, paramString3);
    paramzcjz.b();
  }
  
  private void a(Axis paramAxis)
    throws Exception
  {
    if (paramAxis.getDisplayUnit() == 0) {
      return;
    }
    this.e.c("c:units", null);
    if (paramAxis.getDisplayUnit() != 11) {
      this.e.a("unit", zauj.ak(paramAxis.getDisplayUnit()));
    }
    if ((paramAxis.m() != null) && (paramAxis.isDisplayUnitLabelShown())) {
      a(paramAxis.getDisplayUnitLabel());
    }
    this.e.b();
  }
  
  private void a(DisplayUnitLabel paramDisplayUnitLabel)
    throws Exception
  {
    this.e.c("c:unitsLabel", null);
    b(paramDisplayUnitLabel);
    this.e.b();
  }
  
  private void b(Axis paramAxis)
    throws Exception
  {
    this.e.c("c:catScaling", null);
    if (this.b.getNSeries().get(0).getGapWidth() != 1) {
      this.e.a("gapWidth", zauj.b(this.b.getNSeries().get(0).getGapWidth() / 100.0D));
    }
    this.e.b();
  }
  
  private void c(Axis paramAxis)
    throws Exception
  {
    this.e.c("c:valScaling", null);
    String str;
    if (!paramAxis.isAutomaticMaxValue())
    {
      str = zul.a(paramAxis.getMaxValue(), false);
      this.e.a("max", str);
    }
    if (!paramAxis.isAutomaticMinValue())
    {
      str = zul.a(paramAxis.getMinValue(), false);
      this.e.a("min", str);
    }
    if (!paramAxis.isAutomaticMajorUnit())
    {
      str = zauj.b(paramAxis.getMajorUnit());
      this.e.a("majorUnit", str);
    }
    if (!paramAxis.isAutomaticMinorUnit())
    {
      str = zauj.b(paramAxis.getMinorUnit());
      this.e.a("minorUnit", str);
    }
    this.e.b();
  }
  
  private void k()
    throws Exception
  {
    Legend localLegend = this.b.t();
    if (localLegend == null) {
      return;
    }
    this.e.c("c:legend", null);
    this.e.a("pos", b(localLegend.getPosition()));
    this.e.a("align", ztr.b(localLegend.getPosition(), localLegend.i));
    this.e.a("overlay", localLegend.isOverLay() ? "1" : "0");
    zul.a(this.e, localLegend);
    a(this.e, localLegend.w());
    this.e.b();
  }
  
  private boolean a(zcjz paramzcjz, ShapePropertyCollection paramShapePropertyCollection)
    throws Exception
  {
    if (paramShapePropertyCollection == null) {
      return false;
    }
    return zuw.a(paramzcjz, this.d, paramShapePropertyCollection);
  }
  
  private void l()
    throws Exception
  {
    PageSetup localPageSetup = this.b.p;
    if (localPageSetup == null) {
      return;
    }
    this.e.c("c:printSettings", null);
    zun.b(this.e, localPageSetup, "c");
    a(this.e, localPageSetup, "c");
    b(this.e, localPageSetup, "c");
    this.e.b();
  }
  
  private static void a(zcjz paramzcjz, PageSetup paramPageSetup, String paramString)
    throws Exception
  {
    paramzcjz.c(paramString, "pageMargins", null);
    paramzcjz.a("l", zauj.b(paramPageSetup.getLeftMarginInch()));
    paramzcjz.a("r", zauj.b(paramPageSetup.getRightMarginInch()));
    paramzcjz.a("t", zauj.b(paramPageSetup.getTopMarginInch()));
    paramzcjz.a("b", zauj.b(paramPageSetup.getBottomMarginInch()));
    paramzcjz.a("header", zauj.b(paramPageSetup.getHeaderMarginInch()));
    paramzcjz.a("footer", zauj.b(paramPageSetup.getFooterMarginInch()));
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, PageSetup paramPageSetup, String paramString)
    throws Exception
  {
    if ((paramPageSetup == null) || (!paramPageSetup.e())) {
      return;
    }
    paramzcjz.c(paramString, "pageSetup", null);
    if (!paramPageSetup.k()) {
      paramzcjz.a("paperSize", zauj.z(paramPageSetup.a()));
    }
    if (!paramPageSetup.isAutoFirstPageNumber())
    {
      paramzcjz.a("firstPageNumber", zauj.z(paramPageSetup.getFirstPageNumber()));
      paramzcjz.a("useFirstPageNumber", "1");
    }
    paramzcjz.a("orientation", zauj.a(paramPageSetup.getOrientation()));
    if (paramPageSetup.getBlackAndWhite()) {
      paramzcjz.a("blackAndWhite", "1");
    }
    if (paramPageSetup.getPrintDraft()) {
      paramzcjz.a("draft", "1");
    }
    if ((paramPageSetup.getPrintQuality() > 0) && (paramPageSetup.getPrintQuality() != 600))
    {
      paramzcjz.a("horizontalDpi", zauj.z(paramPageSetup.getPrintQuality()));
      paramzcjz.a("verticalDpi", zauj.z(paramPageSetup.getPrintQuality()));
    }
    if (paramPageSetup.getPrintCopies() != 1) {
      paramzcjz.a("copies", zauj.z(paramPageSetup.getPrintCopies()));
    }
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */