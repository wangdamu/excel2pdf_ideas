package com.aspose.cells;

import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zaru
{
  private zj a;
  private ChartShape b;
  private Chart c;
  private double d;
  private double e;
  private int f;
  private boolean g;
  private double[][] h;
  private HashMap i;
  private int j = 0;
  private zcjz k;
  private String l;
  private zasb m;
  private String n = "Chart";
  private String o = "ChartTitle";
  private String p = "CategoryAxisTitle";
  private String q = "ValueAxisTitle";
  private String r = "SecondCategoryAxisTitle";
  private String s = "secondValueAxisTitle";
  private String t = "SeriesAxisTitle";
  private String u = "ChartLegend";
  private String v = "PlotArea";
  private String w = "ValueAxis";
  private String x = "CategoryAxis";
  private String y = "SeriesAxis";
  private String z = "SecondValueAxis";
  private String A = "SecondCategoryAxis";
  private String B = "MajorGridLines_ValueAxis";
  private String C = "MinorGridLines_ValueAxis";
  private String D = "MajorGridLines_CategoryAxis";
  private String E = "MinorGridLines_CategoryAxis";
  private String F = "MajorGridLines_SecondValueAxis";
  private String G = "MinorGridLines_SecondValueAxis";
  private String H = "MajorGridLines_SecondCategoryAxis";
  private String I = "MinorGridLines_SecondCategoryAxis";
  private String J = "Series";
  private String K = "Point";
  private String L = "Walls";
  private String M = "Floor";
  private String N;
  private String O;
  private String P;
  private static final za Q = new za(new String[] { "primary-x", "primary-y", "primary-z", "secondary-x", "secondary-y" });
  
  public zaru(zasb paramzasb, zj paramzj, ChartShape paramChartShape, String paramString)
  {
    this.m = paramzasb;
    this.h = new double[6][];
    this.a = paramzj;
    this.b = paramChartShape;
    this.c = this.b.getChart();
    this.i = new HashMap();
    this.l = paramString;
  }
  
  public void a()
    throws Exception
  {
    c();
    this.c.c(false);
  }
  
  private void b()
    throws Exception
  {
    this.d = this.b.getWidthInch();
    this.e = this.b.getHeightInch();
    this.f = this.c.getType();
    this.g = this.c.getIs3D();
    this.c.a(false, false);
  }
  
  private void c()
    throws Exception
  {
    b();
    this.k = zatr.a("Object " + this.l + "/content.xml", this.a);
    this.k.c();
    this.k.b("office:document-content");
    d();
    e();
    n();
    this.k.b();
    this.k.d();
    this.k.e();
  }
  
  private void d()
    throws Exception
  {
    this.k.a("xmlns", "office", null, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
    this.k.a("xmlns", "style", null, "urn:oasis:names:tc:opendocument:xmlns:style:1.0");
    this.k.a("xmlns", "text", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
    this.k.a("xmlns", "table", null, "urn:oasis:names:tc:opendocument:xmlns:table:1.0");
    this.k.a("xmlns", "draw", null, "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0");
    this.k.a("xmlns", "fo", null, "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0");
    this.k.a("xmlns", "xlink", null, "http://www.w3.org/1999/xlink");
    this.k.a("xmlns", "dc", null, "http://purl.org/dc/elements/1.1/");
    this.k.a("xmlns", "meta", null, "urn:oasis:names:tc:opendocument:xmlns:meta:1.0");
    this.k.a("xmlns", "number", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
    this.k.a("xmlns", "svg", null, "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0");
    this.k.a("xmlns", "chart", null, "urn:oasis:names:tc:opendocument:xmlns:chart:1.0");
    this.k.a("xmlns", "dr3d", null, "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0");
    this.k.a("xmlns", "math", null, "http://www.w3.org/1998/Math/MathML");
    this.k.a("xmlns", "form", null, "urn:oasis:names:tc:opendocument:xmlns:form:1.0");
    this.k.a("xmlns", "script", null, "urn:oasis:names:tc:opendocument:xmlns:script:1.0");
    this.k.a("xmlns", "ooo", null, "http://openoffice.org/2004/office");
    this.k.a("xmlns", "ooow", null, "http://openoffice.org/2004/writer");
    this.k.a("xmlns", "oooc", null, "http://openoffice.org/2004/calc");
    if (this.m.n) {
      this.k.a("xmlns", "of", null, "urn:oasis:names:tc:opendocument:xmlns:of:1.2");
    }
    this.k.a("xmlns", "dom", null, "http://www.w3.org/2001/xml-events");
    this.k.a("xmlns", "xforms", null, "http://www.w3.org/2002/xforms");
    this.k.a("xmlns", "xsd", null, "http://www.w3.org/2001/XMLSchema");
    this.k.a("xmlns", "xsi", null, "http://www.w3.org/2001/XMLSchema-instance");
    this.k.a("xmlns", "rpt", null, "http://openoffice.org/2005/report");
    this.k.a("xmlns", "of", null, "urn:oasis:names:tc:opendocument:xmlns:of:1.2");
    this.k.a("xmlns", "xhtml", null, "http://www.w3.org/1999/xhtml");
    this.k.a("xmlns", "grddl", null, "http://www.w3.org/2003/g/data-view#");
    this.k.a("xmlns", "tableooo", null, "http://openoffice.org/2009/table");
    this.k.a("xmlns", "chartooo", null, "http://openoffice.org/2010/chart");
    this.k.a("xmlns", "field", null, "urn:openoffice:names:experimental:ooo-ms-interop:xmlns:field:1.0");
    this.k.a("office", "version", null, this.m.m);
  }
  
  private void e()
    throws Exception
  {
    this.k.b("office:automatic-styles");
    this.N = a(this.c.getCategoryAxis().getTickLabels());
    this.O = a(this.c.getValueAxis().getTickLabels());
    if (this.c.getIs3D()) {
      this.P = a(this.c.getSeriesAxis().getTickLabels());
    }
    f();
    a(this.c.getTitle(), this.o);
    g();
    h();
    l();
    i();
    j();
    k();
    this.k.b();
  }
  
  private void f()
    throws Exception
  {
    Color localColor = this.c.getChartArea().getArea().getForegroundColor();
    Line localLine = this.c.getChartArea().getBorder();
    int i1 = this.c.getChartArea().getArea().getFillFormat().getFillType();
    this.k.b("style:style");
    this.k.a("style", "name", null, zarw.a + ++this.j);
    this.k.a("style", "family", null, "chart");
    a(localColor, localLine, this.c.getChartArea().getArea().getFillFormat());
    this.k.b();
    this.i.put(this.n, zarw.a + this.j);
  }
  
  private void a(Title paramTitle, String paramString)
    throws Exception
  {
    if (a(paramTitle))
    {
      Font localFont = paramTitle.getFont();
      Line localLine = paramTitle.getBorder();
      Color localColor = paramTitle.getArea().getForegroundColor();
      this.k.b("style:style");
      this.k.a("style", "name", null, zarw.a + ++this.j);
      this.k.a("style", "family", null, "chart");
      a(localColor, localLine, paramTitle.getArea().getFillFormat());
      a(localFont);
      this.k.b();
      this.i.put(paramString, zarw.a + this.j);
    }
  }
  
  private void g()
    throws Exception
  {
    if (!this.c.getShowLegend()) {
      return;
    }
    Legend localLegend = this.c.getLegend();
    Color localColor = localLegend.getArea().getForegroundColor();
    Line localLine = localLegend.getBorder();
    Font localFont = localLegend.getFont();
    this.k.b("style:style");
    this.k.a("style", "name", null, zarw.a + ++this.j);
    this.k.a("style", "family", null, "chart");
    if (this.c.getLegend().m())
    {
      this.k.b("style:chart-properties");
      this.k.a("chart", "auto-position", null, "true");
      this.k.b();
    }
    a(localColor, localLine, localLegend.getArea().getFillFormat());
    a(localFont);
    this.k.b();
    this.i.put(this.u, zarw.a + this.j);
  }
  
  private void h()
    throws Exception
  {
    PlotArea localPlotArea = this.c.getPlotArea();
    this.k.b("style:style");
    this.k.a("style", "name", null, zarw.a + ++this.j);
    this.k.a("style", "family", null, "chart");
    m();
    a(this.c.getPlotArea().getArea().getForegroundColor(), this.c.getPlotArea().getBorder(), localPlotArea.getArea().getFillFormat());
    this.k.b();
    this.i.put(this.v, zarw.a + this.j);
  }
  
  private void i()
    throws Exception
  {
    for (int i1 = 0; i1 < this.c.getNSeries().getCount(); i1++)
    {
      Series localSeries = this.c.getNSeries().get(i1);
      this.k.b("style:style");
      this.k.a("style", "name", null, zarw.a + ++this.j);
      this.k.a("style", "family", null, "chart");
      this.k.b("style:chart-properties");
      if (localSeries.getFirstSliceAngle() != 0) {
        this.k.a("chart", "angle-offset", null, Short.toString(localSeries.getFirstSliceAngle()));
      }
      if (localSeries.getExplosion() != 0) {
        this.k.a("chart", "pie-offset", null, zp.a(localSeries.getExplosion()));
      }
      String str1 = a(localSeries.getBar3DShapeType());
      if (str1 != null) {
        this.k.a("chart", "solid-type", null, str1);
      }
      String str2 = zasp.a(localSeries.getMarker().getMarkerStyle(), localSeries.E());
      if (!"automatic".equals(str2)) {
        this.k.a("chart", "symbol-name", null, str2);
      }
      if ((localSeries.getMarker().getMarkerStyle() != 5) && (localSeries.getMarker().getMarkerStyle() != 0))
      {
        this.k.a("chart", "symbol-type", null, "named-symbol");
        this.k.a("chart", "symbol-width", null, zo.b(zasp.e(localSeries.getMarker().getMarkerSize())) + "cm");
        this.k.a("chart", "symbol-height", null, zo.b(zasp.e(localSeries.getMarker().getMarkerSize())) + "cm");
      }
      if ((localSeries.getDataLabels().getShowValue()) && (localSeries.getDataLabels().getShowPercentage())) {
        this.k.a("chart", "data-label-number", null, "value-and-percentage");
      } else if (localSeries.getDataLabels().getShowValue()) {
        this.k.a("chart", "data-label-number", null, "value");
      } else if (localSeries.getDataLabels().getShowPercentage()) {
        this.k.a("chart", "data-label-number", null, "percentage");
      }
      String str3;
      if ((!localSeries.getDataLabels().n) && (localSeries.getDataLabels().getPosition() != 9))
      {
        str3 = zauj.c(localSeries.getDataLabels().getPosition(), localSeries.u().j());
        if (str3 != null) {
          this.k.a("chart", "label-position", null, str3);
        }
      }
      if ((localSeries.getDataLabels().Q()) && (localSeries.getDataLabels().P() != 0))
      {
        str3 = localSeries.getDataLabels().getSeparatorValue();
        this.k.b("chart:label-separator");
        this.k.b("text:p");
        this.k.a(str3);
        this.k.b();
        this.k.b();
      }
      this.k.b();
      a(localSeries.getArea().getForegroundColor(), localSeries.getBorder(), localSeries.getArea().getFillFormat());
      this.k.b();
      this.i.put(this.J + i1, zarw.a + this.j);
      a(localSeries, i1);
    }
  }
  
  private void a(Series paramSeries, int paramInt)
    throws Exception
  {
    ChartPointCollection localChartPointCollection = paramSeries.getPoints();
    if ((localChartPointCollection == null) || (localChartPointCollection.getCount() < 1)) {
      return;
    }
    Object localObject = null;
    int i1 = localChartPointCollection.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      ChartPoint localChartPoint = localChartPointCollection.get(i2);
      if (a((ChartPoint)localObject, localChartPoint))
      {
        this.k.b("style:style");
        this.k.a("style", "name", null, zarw.a + ++this.j);
        this.k.a("style", "family", null, "chart");
        if (localChartPoint.getExplosion() != 0) {
          a(localChartPoint);
        }
        a(localChartPoint.getArea().getForegroundColor(), localChartPoint.getBorder(), localChartPoint.getArea().getFillFormat());
        this.k.b();
        this.i.put(this.K + paramInt + i2, zarw.a + this.j);
      }
      localObject = localChartPoint;
    }
  }
  
  private void a(ChartPoint paramChartPoint)
    throws Exception
  {
    this.k.b("style:chart-properties");
    this.k.a("chart", "pie-offset", null, zauj.z(paramChartPoint.getExplosion()));
    this.k.b();
  }
  
  private String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    default: 
      return null;
    case 4: 
    case 5: 
      return "cone";
    case 3: 
      return "cylinder";
    }
    return "pyramid";
  }
  
  private void j()
    throws Exception
  {
    if (this.c.getWalls() == null) {
      return;
    }
    this.k.b("style:style");
    this.k.a("style", "name", null, zarw.a + ++this.j);
    this.k.a("style", "family", null, "chart");
    a(this.c.getWalls().getForegroundColor(), this.c.getWalls().getBorder(), this.c.getWalls().getFillFormat());
    this.k.b();
    this.i.put(this.L, zarw.a + this.j);
  }
  
  private void k()
    throws Exception
  {
    if (this.c.getFloor() == null) {
      return;
    }
    this.k.b("style:style");
    this.k.a("style", "name", null, zarw.a + ++this.j);
    this.k.a("style", "family", null, "chart");
    a(this.c.getFloor().getForegroundColor(), this.c.getFloor().getBorder(), this.c.getFloor().getFillFormat());
    this.k.b();
    this.i.put(this.M, zarw.a + this.j);
  }
  
  private void l()
    throws Exception
  {
    Axis localAxis1 = this.c.getCategoryAxis();
    Axis localAxis2 = this.c.getValueAxis();
    Axis localAxis3 = this.c.getSeriesAxis();
    Axis localAxis4 = this.c.getSecondCategoryAxis();
    Axis localAxis5 = this.c.getSecondValueAxis();
    if (localAxis1.isVisible())
    {
      a(localAxis1, this.x);
      if (localAxis1.getMinorGridLines().getFormattingType() != 2) {
        a(localAxis1.getMinorGridLines(), this.E, true);
      }
      if (localAxis1.getMajorGridLines().getFormattingType() != 2) {
        a(localAxis1.getMajorGridLines(), this.D, true);
      }
      a(localAxis1.getTitle(), this.p);
    }
    if ((localAxis2.isVisible()) || (zasp.i(this.f)))
    {
      b(localAxis2, this.w);
      if (localAxis2.getMinorGridLines().getFormattingType() != 2) {
        a(localAxis2.getMinorGridLines(), this.C, true);
      }
      if (localAxis2.getMajorGridLines().getFormattingType() != 2) {
        a(localAxis2.getMajorGridLines(), this.B, true);
      }
      a(localAxis2.getTitle(), this.q);
    }
    if (localAxis3.isVisible())
    {
      b(localAxis3, this.y);
      if (localAxis3.getMinorGridLines().getFormattingType() != 2) {
        a(localAxis3.getMinorGridLines(), this.C, true);
      }
      if (localAxis3.getMajorGridLines().getFormattingType() != 2) {
        a(localAxis3.getMajorGridLines(), this.B, true);
      }
      a(localAxis3.getTitle(), this.t);
    }
    if (localAxis4.isVisible())
    {
      a(localAxis4, this.A);
      if (localAxis4.getMinorGridLines().getFormattingType() != 2) {
        a(localAxis4.getMinorGridLines(), this.I, true);
      }
      if (localAxis4.getMajorGridLines().getFormattingType() != 2) {
        a(localAxis4.getMajorGridLines(), this.H, true);
      }
      a(localAxis4.getTitle(), this.r);
    }
    if (localAxis5.isVisible())
    {
      b(localAxis5, this.z);
      if (localAxis5.getMinorGridLines().getFormattingType() != 2) {
        a(localAxis5.getMinorGridLines(), this.G, true);
      }
      if (localAxis5.getMajorGridLines().getFormattingType() != 2) {
        a(localAxis5.getMajorGridLines(), this.F, true);
      }
      a(localAxis5.getTitle(), this.s);
    }
  }
  
  private void a(Axis paramAxis, String paramString)
    throws Exception
  {
    this.k.b("style:style");
    this.k.a("style", "name", null, zarw.a + ++this.j);
    this.k.a("style", "family", null, "chart");
    this.k.a("style", "data-style-name", null, this.N);
    b(paramAxis);
    a(paramAxis.getArea().getForegroundColor(), paramAxis.getAxisLine(), paramAxis.getArea().getFillFormat());
    a(paramAxis.getTickLabels().getFont());
    this.k.b();
    this.i.put(paramString, zarw.a + this.j);
  }
  
  private void b(Axis paramAxis, String paramString)
    throws Exception
  {
    this.k.b("style:style");
    this.k.a("style", "name", null, zarw.a + ++this.j);
    this.k.a("style", "family", null, "chart");
    this.k.a("style", "data-style-name", null, this.O);
    a(paramAxis);
    a(paramAxis.getArea().getForegroundColor(), paramAxis.getAxisLine(), paramAxis.getArea().getFillFormat());
    a(paramAxis.getTickLabels().getFont());
    this.k.b();
    this.i.put(paramString, zarw.a + this.j);
  }
  
  private void a(Line paramLine, String paramString, boolean paramBoolean)
    throws Exception
  {
    this.k.b("style:style");
    this.k.a("style", "name", null, zarw.a + ++this.j);
    this.k.a("style", "family", null, "chart");
    a(paramLine.getColor(), paramLine, null, paramBoolean);
    this.k.b();
    this.i.put(paramString, zarw.a + this.j);
  }
  
  private String a(TickLabels paramTickLabels)
    throws Exception
  {
    String str1 = paramTickLabels.getNumberFormat();
    if (str1 == null) {
      return null;
    }
    int i1 = paramTickLabels.d();
    ArrayList localArrayList1 = a(i1, str1);
    String str2 = null;
    Iterator localIterator1 = localArrayList1.iterator();
    while (localIterator1.hasNext())
    {
      zasj localzasj = (zasj)localIterator1.next();
      this.k.b("number:" + zasp.l(localzasj.d) + "-style");
      this.k.a("style", "name", null, localzasj.a);
      if (str2 == null) {
        str2 = localzasj.a;
      }
      Iterator localIterator2 = localzasj.f.iterator();
      while (localIterator2.hasNext())
      {
        zasy localzasy = (zasy)localIterator2.next();
        String str3 = localzasy.c;
        ArrayList localArrayList2 = localzasy.b;
        int i2 = localzasy.a;
        this.k.b("number:" + zasp.m(i2));
        Iterator localIterator3 = localArrayList2.iterator();
        while (localIterator3.hasNext())
        {
          String[] arrayOfString = (String[])localIterator3.next();
          this.k.a("number", arrayOfString[0], null, arrayOfString[1]);
        }
        if (str3 != null) {
          this.k.a(str3);
        }
        this.k.b();
      }
      this.k.b();
    }
    return str2;
  }
  
  private ArrayList a(int paramInt, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if ((zasp.e(paramString)) && (paramInt > 0)) {
      paramString = this.c.getWorksheet().getWorkbook().getSettings().f().d(paramInt);
    }
    Object localObject;
    if (!zasp.e(paramString))
    {
      if (paramString.indexOf("General") != -1)
      {
        a(paramInt, localArrayList);
        return localArrayList;
      }
      localObject = zasp.l(paramString);
      zasj localzasj;
      if (localObject.length > 1)
      {
        localzasj = null;
        for (int i1 = 0; i1 < localObject.length; i1++)
        {
          String str = "N" + paramInt + "P" + i1;
          localzasj = new zasj();
          localzasj.a(str, paramInt, localObject[i1]);
          if (i1 != localObject.length - 1) {
            zf.a(localzasj.e, new String[] { "style:volatile", "true" });
          }
          zf.a(localArrayList, localzasj);
        }
        localzasj.b(localObject.length);
      }
      else
      {
        localzasj = new zasj();
        localzasj.a("N" + paramInt, paramInt, paramString);
        zf.a(localArrayList, localzasj);
      }
    }
    else if (paramInt > 0)
    {
      localObject = new zasj();
      ((zasj)localObject).a(paramInt);
      zf.a(localArrayList, localObject);
    }
    return localArrayList;
  }
  
  private void a(int paramInt, ArrayList paramArrayList)
  {
    zasj localzasj = new zasj();
    zf.a(paramArrayList, localzasj);
    localzasj.a = ("N" + paramInt);
    localzasj.d = 1;
    zasy localzasy = new zasy(4, null);
    zf.a(localzasj.f, localzasy);
    zf.a(localzasy.b, new String[] { "min-integer-digits", "1" });
  }
  
  private void a(Color paramColor, Line paramLine, FillFormat paramFillFormat)
    throws Exception
  {
    this.k.b("style:graphic-properties");
    this.k.a("draw", "stroke", null, a(paramLine, false));
    double d1 = paramLine.getWeightPt();
    if (d1 != 0.0D) {
      this.k.a("svg", "stroke-width", null, zo.b(zasp.a(this.c.n(), d1)) + "cm");
    }
    if ((paramLine.isVisible()) && (paramLine.getColor().c() != null) && (!paramLine.getColor().isEmpty())) {
      this.k.a("svg", "stroke-color", null, a(paramLine.getColor()));
    }
    if (!paramColor.isEmpty()) {
      this.k.a("draw", "fill-color", null, a(paramColor));
    }
    if (paramFillFormat != null) {
      if ((paramFillFormat.getFillType() != 0) && (!paramColor.isEmpty())) {
        this.k.a("draw", "fill", null, zasn.c(paramFillFormat.getFillType()));
      } else {
        this.k.a("draw", "fill", null, "none");
      }
    }
    double d2 = paramLine.getTransparency();
    if (d2 != 0.0D)
    {
      String str = (1.0D - d2) * 100.0D + "%";
      this.k.a("draw", "stroke-opacity", null, str);
      this.k.a("draw", "opacity", null, str);
    }
    this.k.b();
  }
  
  private void a(Color paramColor, Line paramLine, FillFormat paramFillFormat, boolean paramBoolean)
    throws Exception
  {
    this.k.b("style:graphic-properties");
    this.k.a("draw", "stroke", null, a(paramLine, paramBoolean));
    double d1 = paramLine.getWeightPt();
    if (d1 != 0.0D) {
      this.k.a("svg", "stroke-width", null, zo.b(zasp.a(this.c.n(), d1)) + "cm");
    }
    if ((paramLine.isVisible()) && (paramLine.getColor().c() != null) && (!paramLine.getColor().isEmpty())) {
      this.k.a("svg", "stroke-color", null, a(paramLine.getColor()));
    }
    if (!paramColor.isEmpty()) {
      this.k.a("draw", "fill-color", null, a(paramColor));
    }
    if (paramFillFormat != null) {
      this.k.a("draw", "fill", null, zasn.c(paramFillFormat.getFillType()));
    }
    double d2 = paramLine.getTransparency();
    if (d2 != 0.0D)
    {
      String str = (1.0D - d2) * 100.0D + "%";
      this.k.a("draw", "stroke-opacity", null, str);
      this.k.a("draw", "opacity", null, str);
    }
    this.k.b();
  }
  
  private String a(Color paramColor)
  {
    String str1 = zw.a(ze.a(paramColor.getR(), 16), 2, '0');
    String str2 = zw.a(ze.a(paramColor.getG(), 16), 2, '0');
    String str3 = zw.a(ze.a(paramColor.getB(), 16), 2, '0');
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("#");
    localStringBuilder.append(str1);
    localStringBuilder.append(str2);
    localStringBuilder.append(str3);
    return zs.a(localStringBuilder);
  }
  
  private void a(Font paramFont)
    throws Exception
  {
    this.k.b("style:text-properties");
    this.k.a("fo", "color", null, a(paramFont.getColor()));
    this.k.a("fo", "font-family", null, paramFont.getName());
    if (paramFont.isBold())
    {
      this.k.a("fo", "font-weight", null, "bold");
      this.k.a("style", "font-weight-asian", null, "bold");
      this.k.a("style", "font-weight-complex", null, "bold");
    }
    if (paramFont.isItalic())
    {
      this.k.a("fo", "font-style", null, "italic");
      this.k.a("fo", "font-style-asian", null, "italic");
      this.k.a("fo", "font-style-complex", null, "italic");
    }
    if (paramFont.getUnderline() == 1)
    {
      this.k.a("fo", "text-underline-style", null, "solid");
      this.k.a("fo", "text-underline-width", null, "auto");
    }
    String str = paramFont.getSize() + "pt";
    this.k.a("fo", "font-size", null, str);
    this.k.a("style", "font-size-asian", null, str);
    this.k.a("style", "font-size-complex", null, str);
    this.k.b();
  }
  
  private void m()
    throws Exception
  {
    this.k.b("style:chart-properties");
    if ((this.c.getType() == 34) || (this.c.getType() == 17) || (this.c.getType() == 56)) {
      this.k.a("chart", "deep", null, "true");
    }
    if (zasp.k(this.f)) {
      this.k.a("chart", "interpolation", null, "cubic-spline");
    }
    if (zasp.j(this.f)) {
      this.k.a("chart", "solid-type", null, "cylinder");
    }
    if (zasp.g(this.f))
    {
      this.k.a("chart", "vertical", null, "true");
      this.k.a("chart", "connect-bars", null, "false");
    }
    if (zasp.h(this.f)) {
      this.k.a("chart", "percentage", null, "true");
    } else if (zasp.f(this.f)) {
      this.k.a("chart", "stacked", null, "true");
    }
    this.k.a("chart", "treat-empty-cells", null, "leave-gap");
    this.k.a("chart", "include-hidden-cells", null, "false");
    if (this.c.getIs3D())
    {
      this.k.a("chart", "three-dimensional", null, "true");
      this.k.a("chart", "right-angled-axes", null, Boolean.toString(this.c.getRightAngleAxes()).toLowerCase());
    }
    this.k.b();
  }
  
  private void a(Axis paramAxis)
    throws Exception
  {
    this.k.b("style:chart-properties");
    if (zasp.i(this.c.getType())) {
      this.k.a("chart", "reverse-direction", null, paramAxis.isPlotOrderReversed() ? "false" : "true");
    } else {
      this.k.a("chart", "reverse-direction", null, paramAxis.isPlotOrderReversed() ? "true" : "false");
    }
    c(paramAxis);
    e(this.c.getCategoryAxis());
    this.k.b();
  }
  
  private void b(Axis paramAxis)
    throws Exception
  {
    this.k.b("style:chart-properties");
    this.k.a("chart", "reverse-direction", null, paramAxis.isPlotOrderReversed() ? "true" : "false");
    c(paramAxis);
    e(this.c.getValueAxis());
    this.k.b();
  }
  
  private void c(Axis paramAxis)
    throws Exception
  {
    this.k.a("chart", "logarithmic", null, paramAxis.isLogarithmic() ? "true" : "false");
    this.k.a("chart", "line-break", null, "false");
    this.k.a("chart", "text-overlap", null, "true");
    if (!paramAxis.isVisible()) {
      this.k.a("chart", "visible", null, "false");
    }
    d(paramAxis);
    h(paramAxis);
    g(paramAxis);
    f(paramAxis);
  }
  
  private void d(Axis paramAxis)
    throws Exception
  {
    if (!paramAxis.isAutomaticMajorUnit()) {
      this.k.a("chart", "interval-major", null, zo.b(paramAxis.getMajorUnit()));
    }
    if (!paramAxis.isAutomaticMinorUnit()) {
      this.k.a("chart", "interval-minor-divisor", null, zp.a((int)(paramAxis.getMajorUnit() / paramAxis.getMinorUnit() + 0.5D)));
    }
    if (!paramAxis.isAutomaticMaxValue()) {
      this.k.a("chart", "maximum", null, zs.a(paramAxis.getMaxValue()));
    }
    if (!paramAxis.isAutomaticMinValue()) {
      this.k.a("chart", "minimum", null, zs.a(paramAxis.getMinValue()));
    }
  }
  
  private void e(Axis paramAxis)
    throws Exception
  {
    switch (paramAxis.getCrossType())
    {
    case 0: 
    case 2: 
      this.k.a("chart", "axis-position", null, zo.b(paramAxis.getCrossAt()));
      break;
    case 1: 
      this.k.a("chart", "axis-position", null, "end");
      break;
    }
  }
  
  private void f(Axis paramAxis)
  {
    if (paramAxis.getTickMarkSpacing() == 1) {}
  }
  
  private void g(Axis paramAxis)
    throws Exception
  {
    switch (paramAxis.getTickLabelPosition())
    {
    case 2: 
    default: 
      this.k.a("chart", "display-label", null, "true");
      break;
    case 0: 
      this.k.a("chart", "axis-label-position", null, "outside-start");
      this.k.a("chart", "display-label", null, "true");
      break;
    case 1: 
      this.k.a("chart", "axis-label-position", null, "outside-end");
      this.k.a("chart", "display-label", null, "true");
      break;
    case 3: 
      this.k.a("chart", "display-label", null, "false");
    }
    this.k.a("style", "rotation-angle", null, zauj.z(paramAxis.getTickLabels().getRotationAngle()));
  }
  
  private void h(Axis paramAxis)
    throws Exception
  {
    switch (paramAxis.getMinorTickMark())
    {
    case 1: 
      this.k.a("chart", "tick-marks-minor-inner", null, "true");
      break;
    case 3: 
      this.k.a("chart", "tick-marks-minor-outer", null, "true");
      break;
    }
    switch (paramAxis.getMajorTickMark())
    {
    case 1: 
      this.k.a("chart", "tick-marks-major-inner", null, "true");
      break;
    case 3: 
      this.k.a("chart", "tick-marks-major-outer", null, "true");
      break;
    }
  }
  
  private void n()
    throws Exception
  {
    this.k.b("office:body");
    this.k.b("office:chart");
    o();
    this.k.b();
    this.k.b();
  }
  
  private void o()
    throws Exception
  {
    this.k.b("chart:chart");
    this.k.a("svg", "width", null, zasp.g(this.b.getWidthCM()) + "cm");
    this.k.a("svg", "height", null, zasp.g(this.b.getHeightCM()) + "cm");
    this.k.a("chart", "class", null, f(this.b.getChart().getType()));
    this.k.a("chart", "style-name", null, (String)this.i.get(this.n));
    b(this.c.getTitle(), this.o);
    p();
    q();
    this.k.b();
  }
  
  private void b(Title paramTitle, String paramString)
    throws Exception
  {
    if (a(paramTitle))
    {
      this.k.b("chart:title");
      this.k.a("svg", "x", null, zasp.g(h(paramTitle.getX())) + "in");
      this.k.a("svg", "y", null, zasp.g(i(paramTitle.getY())) + "in");
      this.k.a("chart", "style-name", null, (String)this.i.get(paramString));
      this.k.b("text:p");
      this.k.a(paramTitle.getText());
      this.k.b();
      this.k.b();
    }
  }
  
  private boolean a(Title paramTitle)
  {
    return (paramTitle != null) && (paramTitle.getText() != null) && (!paramTitle.isDeleted()) && (!"".equals(paramTitle.getText()));
  }
  
  /* Error */
  private void p()
    throws Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   4: invokevirtual 427	com/aspose/cells/Chart:getShowLegend	()Z
    //   7: ifne +4 -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield 361	com/aspose/cells/zaru:k	Lcom/aspose/cells/zcjz;
    //   15: ldc 69
    //   17: invokevirtual 650	com/aspose/cells/zcjz:b	(Ljava/lang/String;)V
    //   20: aload_0
    //   21: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   24: invokevirtual 420	com/aspose/cells/Chart:getLegend	()Lcom/aspose/cells/Legend;
    //   27: ifnull +309 -> 336
    //   30: aload_0
    //   31: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   34: invokevirtual 420	com/aspose/cells/Chart:getLegend	()Lcom/aspose/cells/Legend;
    //   37: invokevirtual 475	com/aspose/cells/Legend:getPosition	()I
    //   40: bipush 7
    //   42: if_icmpeq +29 -> 71
    //   45: aload_0
    //   46: getfield 361	com/aspose/cells/zaru:k	Lcom/aspose/cells/zcjz;
    //   49: ldc 58
    //   51: ldc -112
    //   53: aconst_null
    //   54: aload_0
    //   55: aload_0
    //   56: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   59: invokevirtual 420	com/aspose/cells/Chart:getLegend	()Lcom/aspose/cells/Legend;
    //   62: invokevirtual 475	com/aspose/cells/Legend:getPosition	()I
    //   65: invokespecial 596	com/aspose/cells/zaru:g	(I)Ljava/lang/String;
    //   68: invokevirtual 648	com/aspose/cells/zcjz:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   71: aload_0
    //   72: getfield 361	com/aspose/cells/zaru:k	Lcom/aspose/cells/zcjz;
    //   75: ldc -50
    //   77: ldc -3
    //   79: aconst_null
    //   80: new 320	java/lang/StringBuilder
    //   83: dup
    //   84: invokespecial 672	java/lang/StringBuilder:<init>	()V
    //   87: aload_0
    //   88: aload_0
    //   89: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   92: invokevirtual 420	com/aspose/cells/Chart:getLegend	()Lcom/aspose/cells/Legend;
    //   95: invokevirtual 477	com/aspose/cells/Legend:getX	()I
    //   98: invokespecial 599	com/aspose/cells/zaru:h	(I)D
    //   101: invokestatic 634	com/aspose/cells/zasp:g	(D)Ljava/lang/String;
    //   104: invokevirtual 675	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: ldc -121
    //   109: invokevirtual 675	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual 677	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokevirtual 648	com/aspose/cells/zcjz:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   118: aload_0
    //   119: getfield 361	com/aspose/cells/zaru:k	Lcom/aspose/cells/zcjz;
    //   122: ldc -50
    //   124: ldc_w 260
    //   127: aconst_null
    //   128: new 320	java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial 672	java/lang/StringBuilder:<init>	()V
    //   135: aload_0
    //   136: aload_0
    //   137: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   140: invokevirtual 420	com/aspose/cells/Chart:getLegend	()Lcom/aspose/cells/Legend;
    //   143: invokevirtual 478	com/aspose/cells/Legend:getY	()I
    //   146: invokespecial 602	com/aspose/cells/zaru:i	(I)D
    //   149: invokestatic 634	com/aspose/cells/zasp:g	(D)Ljava/lang/String;
    //   152: invokevirtual 675	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: ldc -121
    //   157: invokevirtual 675	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 677	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokevirtual 648	com/aspose/cells/zcjz:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   166: aload_0
    //   167: getfield 361	com/aspose/cells/zaru:k	Lcom/aspose/cells/zcjz;
    //   170: ldc 58
    //   172: ldc -56
    //   174: aconst_null
    //   175: aload_0
    //   176: getfield 359	com/aspose/cells/zaru:i	Ljava/util/HashMap;
    //   179: aload_0
    //   180: getfield 371	com/aspose/cells/zaru:u	Ljava/lang/String;
    //   183: invokevirtual 680	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   186: checkcast 319	java/lang/String
    //   189: invokevirtual 648	com/aspose/cells/zcjz:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   192: aload_0
    //   193: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   196: invokevirtual 420	com/aspose/cells/Chart:getLegend	()Lcom/aspose/cells/Legend;
    //   199: invokevirtual 476	com/aspose/cells/Legend:getWidth	()I
    //   202: ifle +62 -> 264
    //   205: aload_0
    //   206: getfield 361	com/aspose/cells/zaru:k	Lcom/aspose/cells/zcjz;
    //   209: ldc 78
    //   211: ldc -4
    //   213: aconst_null
    //   214: new 320	java/lang/StringBuilder
    //   217: dup
    //   218: invokespecial 672	java/lang/StringBuilder:<init>	()V
    //   221: aload_0
    //   222: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   225: invokevirtual 417	com/aspose/cells/Chart:getChartObject	()Lcom/aspose/cells/ChartShape;
    //   228: invokevirtual 446	com/aspose/cells/ChartShape:getWidthCM	()D
    //   231: aload_0
    //   232: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   235: invokevirtual 420	com/aspose/cells/Chart:getLegend	()Lcom/aspose/cells/Legend;
    //   238: invokevirtual 476	com/aspose/cells/Legend:getWidth	()I
    //   241: i2d
    //   242: dmul
    //   243: ldc2_w 331
    //   246: ddiv
    //   247: invokestatic 634	com/aspose/cells/zasp:g	(D)Ljava/lang/String;
    //   250: invokevirtual 675	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: ldc 81
    //   255: invokevirtual 675	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual 677	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   261: invokevirtual 648	com/aspose/cells/zcjz:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   264: aload_0
    //   265: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   268: invokevirtual 420	com/aspose/cells/Chart:getLegend	()Lcom/aspose/cells/Legend;
    //   271: invokevirtual 474	com/aspose/cells/Legend:getHeight	()I
    //   274: ifle +62 -> 336
    //   277: aload_0
    //   278: getfield 361	com/aspose/cells/zaru:k	Lcom/aspose/cells/zcjz;
    //   281: ldc 78
    //   283: ldc 119
    //   285: aconst_null
    //   286: new 320	java/lang/StringBuilder
    //   289: dup
    //   290: invokespecial 672	java/lang/StringBuilder:<init>	()V
    //   293: aload_0
    //   294: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   297: invokevirtual 417	com/aspose/cells/Chart:getChartObject	()Lcom/aspose/cells/ChartShape;
    //   300: invokevirtual 444	com/aspose/cells/ChartShape:getHeightCM	()D
    //   303: aload_0
    //   304: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   307: invokevirtual 420	com/aspose/cells/Chart:getLegend	()Lcom/aspose/cells/Legend;
    //   310: invokevirtual 474	com/aspose/cells/Legend:getHeight	()I
    //   313: i2d
    //   314: dmul
    //   315: ldc2_w 331
    //   318: ddiv
    //   319: invokestatic 634	com/aspose/cells/zasp:g	(D)Ljava/lang/String;
    //   322: invokevirtual 675	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: ldc 81
    //   327: invokevirtual 675	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: invokevirtual 677	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   333: invokevirtual 648	com/aspose/cells/zcjz:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   336: aload_0
    //   337: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   340: iconst_0
    //   341: invokevirtual 414	com/aspose/cells/Chart:c	(Z)V
    //   344: goto +26 -> 370
    //   347: astore_1
    //   348: aload_0
    //   349: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   352: iconst_0
    //   353: invokevirtual 414	com/aspose/cells/Chart:c	(Z)V
    //   356: goto +14 -> 370
    //   359: astore_2
    //   360: aload_0
    //   361: getfield 353	com/aspose/cells/zaru:c	Lcom/aspose/cells/Chart;
    //   364: iconst_0
    //   365: invokevirtual 414	com/aspose/cells/Chart:c	(Z)V
    //   368: aload_2
    //   369: athrow
    //   370: aload_0
    //   371: getfield 361	com/aspose/cells/zaru:k	Lcom/aspose/cells/zcjz;
    //   374: invokevirtual 649	com/aspose/cells/zcjz:b	()V
    //   377: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	378	0	this	zaru
    //   347	1	1	localException	Exception
    //   359	10	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   20	336	347	java/lang/Exception
    //   20	336	359	finally
  }
  
  private void q()
    throws Exception
  {
    this.k.b("chart:plot-area");
    String str = a(this.c);
    if (str != null) {
      this.k.a("table", "cell-range-address", null, str);
    }
    if ((this.c.getPlotArea() != null) || (this.c.getChartArea() != null)) {
      r();
    }
    Object localObject;
    if (this.g)
    {
      localObject = this.c.getPlotArea().F();
      if (localObject != null)
      {
        this.k.a("dr3d", "transform", null, (String)localObject);
        if (zasp.i(this.f))
        {
          this.k.a("dr3d", "vrp", null, x());
          this.k.a("dr3d", "vpn", null, y());
          this.k.a("dr3d", "vup", null, z());
        }
        this.k.a("dr3d", "ambient-color", null, "#cccccc");
        this.k.a("dr3d", "shade-mode", null, "flat");
        this.k.a("dr3d", "shadow-slant", null, "0");
        this.k.a("dr3d", "projection", null, "perspective");
      }
    }
    this.k.a("chart", "style-name", null, (String)this.i.get(this.v));
    s();
    v();
    w();
    if (b(this.f))
    {
      localObject = this.c.q().iterator();
      while (((Iterator)localObject).hasNext())
      {
        zka localzka = (zka)((Iterator)localObject).next();
        if (localzka.t())
        {
          a(true, localzka.u());
          a(false, localzka.v());
        }
        if (localzka.n()) {
          a(localzka.o());
        }
      }
    }
    this.k.b();
  }
  
  private void r()
    throws Exception
  {
    if (this.c.getPlotArea() != null)
    {
      double d1 = h(this.c.getPlotArea().getX());
      double d2 = j(this.c.getPlotArea().getWidth());
      double d3 = 0.0D;
      if (this.h[1] != null)
      {
        d3 += Math.abs(this.h[1][0]) * 2.0D;
        d1 -= d3;
      }
      if (this.h[3] != null) {
        d3 += Math.abs(this.h[3][0]) * 2.0D;
      }
      if (d1 < 0.0D) {
        d1 = 0.0D;
      }
      this.k.a("svg", "x", null, zasp.g(zasp.f(d1)) + "cm");
      d2 += d3;
      if (d2 > this.d) {
        d2 = this.d;
      }
      this.k.a("svg", "width", null, zasp.g(zasp.f(d2)) + "cm");
      d1 = i(this.c.getPlotArea().getY());
      d2 = k(this.c.getPlotArea().getHeight());
      d3 = 0.0D;
      if (this.h[2] != null)
      {
        d3 += Math.abs(this.h[2][1]) * 2.0D;
        d1 -= d3;
      }
      if (this.h[0] != null) {
        d3 += Math.abs(this.h[0][1]) * 2.0D;
      }
      if (d1 < 0.0D) {
        d1 = 0.0D;
      }
      this.k.a("svg", "y", null, zasp.g(zasp.f(d1)) + "cm");
      d2 += d3;
      if (d2 > this.e) {
        d2 = this.e;
      }
      this.k.a("svg", "height", null, zasp.g(zasp.f(d2)) + "cm");
    }
  }
  
  private void s()
    throws Exception
  {
    switch (this.f)
    {
    case 35: 
    case 36: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      t();
      u();
      return;
    }
    c(this.c.getCategoryAxis(), "primary-x");
    c(this.c.getValueAxis(), "primary-y");
    c(this.c.getSeriesAxis(), "primary-z");
    c(this.c.getSecondCategoryAxis(), "secondary-x");
    c(this.c.getSecondValueAxis(), "secondary-y");
  }
  
  private void t()
    throws Exception
  {
    if (this.c.getNSeries().getCount() < 1) {
      return;
    }
    if (!this.c.getCategoryAxis().isVisible()) {
      return;
    }
    this.k.b("chart:axis");
    this.k.a("chart", "dimension", null, "x");
    this.k.a("chart", "name", null, "primary-x");
    this.k.a("chart", "style-name", null, (String)this.i.get(this.x));
    if (this.c.getNSeries().getCount() > 0)
    {
      String str = this.c.getNSeries().get(0).getXValues();
      if ((str != null) && (!"".equals(str)))
      {
        this.k.b("chart:categories");
        this.k.a("table", "cell-range-address", null, a(str));
        this.k.a("chart", "style-name", null, (String)this.i.get(this.x));
        this.k.b();
      }
    }
    this.k.b();
  }
  
  private void u()
    throws Exception
  {
    this.k.b("chart:axis");
    this.k.a("chart", "dimension", null, "y");
    this.k.a("chart", "name", null, "primary-y");
    this.k.a("chart", "style-name", null, (String)this.i.get(this.w));
    this.k.b();
  }
  
  private void c(Axis paramAxis, String paramString)
    throws Exception
  {
    if (!paramAxis.isVisible()) {
      return;
    }
    this.k.b("chart:axis");
    this.k.a("chart", "name", null, paramString);
    if (paramAxis.b() == 1)
    {
      this.k.a("chart", "dimension", null, "y");
      this.k.a("chart", "style-name", null, (String)this.i.get(this.w));
    }
    else if (paramAxis.b() == 0)
    {
      this.k.a("chart", "dimension", null, "x");
      this.k.a("chart", "style-name", null, (String)this.i.get(this.x));
      if ((this.c.getNSeries().getCount() > 0) && (a(this.c.getNSeries().get(0).o())))
      {
        String str = this.c.getNSeries().get(0).getXValues();
        if ((str != null) && (!"".equals(str)))
        {
          this.k.b("chart:categories");
          this.k.a("table", "cell-range-address", null, a(str));
          this.k.a("chart", "style-name", null, (String)this.i.get(this.x));
          this.k.b();
        }
      }
    }
    else if (paramAxis.b() == 2)
    {
      this.k.a("chart", "dimension", null, "z");
      this.k.a("chart", "style-name", null, (String)this.i.get(this.y));
    }
    switch (Q.a(paramString))
    {
    case 0: 
      b(paramAxis.getTitle(), this.p);
      break;
    case 1: 
      b(paramAxis.getTitle(), this.q);
      break;
    case 2: 
      b(paramAxis.getTitle(), this.t);
      break;
    case 3: 
      b(paramAxis.getTitle(), this.r);
      break;
    case 4: 
      b(paramAxis.getTitle(), this.s);
    }
    if (paramAxis.getMajorGridLines().getFormattingType() != 2) {
      a(paramAxis.getMajorGridLines(), "major");
    }
    if (paramAxis.getMinorGridLines().getFormattingType() != 2) {
      a(paramAxis.getMinorGridLines(), "minor");
    }
    this.k.b();
  }
  
  private void a(Line paramLine, String paramString)
    throws Exception
  {
    this.k.b("chart:grid");
    this.k.a("chart", "class", null, paramString);
    if ("major".equals(paramString)) {
      this.k.a("chart", "style-name", null, (String)this.i.get(this.B));
    }
    if ("minor".equals(paramString)) {
      this.k.a("chart", "style-name", null, (String)this.i.get(this.C));
    }
    this.k.b();
  }
  
  private void v()
    throws Exception
  {
    SeriesCollection localSeriesCollection = this.c.getNSeries();
    int i1 = localSeriesCollection.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Series localSeries = localSeriesCollection.get(i2);
      a(localSeries, this.J + i2);
    }
  }
  
  static boolean a(zjk paramzjk)
  {
    return (paramzjk != null) && (paramzjk.a() == 2);
  }
  
  private void a(Series paramSeries, String paramString)
    throws Exception
  {
    this.k.b("chart:series");
    String str = "";
    if (a(paramSeries.m())) {
      str = b(paramSeries.m());
    }
    this.k.a("chart", "values-cell-range-address", null, str);
    if ((!b(this.f)) || (!c(paramSeries.u().j()))) {
      switch (paramSeries.u().j())
      {
      case 35: 
      case 36: 
        this.k.a("chart", "class", null, "circle");
        break;
      default: 
        this.k.a("chart", "class", null, zasp.e(paramSeries.getType()));
      }
    }
    if ((paramSeries.getName() != null) && (!"".equals(paramSeries.getName())) && (paramSeries.getName().startsWith("="))) {
      this.k.a("chart", "label-cell-address", null, a(paramSeries.getName()));
    }
    if ((paramSeries.getPlotOnSecondAxis()) && (this.c.getSecondValueAxis() != null) && (this.c.getSecondValueAxis().isVisible())) {
      this.k.a("chart", "attached-axis", null, "secondary-y");
    }
    this.k.a("chart", "style-name", null, (String)this.i.get(paramString));
    if (((d(paramSeries.u().j())) || (e(paramSeries.u().j()))) && (a(paramSeries.o())))
    {
      this.k.b("chart:domain");
      this.k.a("table", "cell-range-address", null, b(paramSeries.o()));
      this.k.b();
    }
    if ((paramSeries.getTrendLines() != null) && (paramSeries.getTrendLines().getCount() > 0)) {
      a(paramSeries.getTrendLines().get(0));
    }
    if (paramSeries.getYErrorBar().getDisplayType() != 2) {
      a(paramSeries.getYErrorBar());
    } else if (paramSeries.getXErrorBar().getDisplayType() != 2) {
      a(paramSeries.getXErrorBar());
    }
    a(paramSeries);
    this.k.b();
  }
  
  private void w()
    throws Exception
  {
    String str = (String)this.i.get(this.v);
    if (this.g)
    {
      if (this.c.getWalls() != null)
      {
        this.k.b("chart:wall");
        this.k.a("chart", "style-name", null, (String)this.i.get(this.L));
        this.k.b();
      }
      if (this.c.getFloor() != null)
      {
        this.k.b("chart:floor");
        this.k.a("chart", "style-name", null, (String)this.i.get(this.M));
        this.k.b();
      }
    }
    else if (str != null)
    {
      this.k.b("chart:wall");
      this.k.a("chart", "style-name", null, str);
      this.k.b();
    }
  }
  
  private boolean b(int paramInt)
  {
    return (this.f == 65) || (this.f == 66) || (this.f == 67) || (this.f == 68);
  }
  
  private boolean c(int paramInt)
  {
    return (this.f == 37) || (this.f == 39) || (this.f == 42) || (this.f == 43) || (this.f == 38) || (this.f == 41) || (this.f == 40);
  }
  
  private boolean d(int paramInt)
  {
    return (this.f == 12) || (this.f == 13);
  }
  
  private boolean e(int paramInt)
  {
    return (this.f == 60) || (this.f == 61) || (this.f == 62) || (this.f == 63) || (this.f == 64);
  }
  
  private void a(Series paramSeries)
    throws Exception
  {
    ChartPointCollection localChartPointCollection = paramSeries.getPoints();
    if ((localChartPointCollection == null) || (localChartPointCollection.getCount() < 1)) {
      return;
    }
    Object localObject = null;
    int i1 = localChartPointCollection.getCount();
    int i2 = 1;
    for (int i3 = 0; i3 < i1; i3++)
    {
      ChartPoint localChartPoint = localChartPointCollection.get(i3);
      if (a((ChartPoint)localObject, localChartPoint))
      {
        if (i3 != 0)
        {
          if (i2 > 1) {
            this.k.a("chart", "repeated", null, zp.a(i2));
          }
          this.k.b();
          i2 = 1;
        }
        if (i3 + 1 <= i1)
        {
          this.k.b("chart:data-point");
          this.k.a("chart", "style-name", null, (String)this.i.get(this.K + paramSeries.E() + i3));
        }
      }
      else
      {
        i2++;
      }
      localObject = localChartPoint;
    }
    if (i2 > 1) {
      this.k.a("chart", "repeated", null, zp.a(i2));
    }
    if (i1 > 0) {
      this.k.b();
    }
  }
  
  private boolean a(ChartPoint paramChartPoint1, ChartPoint paramChartPoint2)
  {
    return (paramChartPoint1 == null) || (!paramChartPoint2.getArea().getForegroundColor().equals(paramChartPoint1.getArea().getForegroundColor())) || (!paramChartPoint2.getBorder().getColor().equals(paramChartPoint1.getBorder().getColor())) || (paramChartPoint2.getBorder().getWeightPt() != paramChartPoint1.getBorder().getWeightPt());
  }
  
  private void a(Trendline paramTrendline)
    throws Exception
  {
    this.k.b("chart:regression-curve");
    int i1 = 0;
    if (paramTrendline.getDisplayRSquared())
    {
      this.k.a("chart", "display-r-square", null, "true");
      if (!paramTrendline.getDisplayEquation()) {
        this.k.a("chart", "display-equation", null, "false");
      }
      i1 = 1;
    }
    else if (paramTrendline.getDisplayEquation())
    {
      i1 = 1;
    }
    if (i1 != 0)
    {
      if (paramTrendline.getDataLabels() != null) {}
      this.k.b("chart:equation");
      this.k.b();
    }
    this.k.b();
  }
  
  private void a(ErrorBar paramErrorBar)
    throws Exception
  {
    if (paramErrorBar == null) {
      return;
    }
    this.k.b("chart:error-indicator");
    this.k.b();
  }
  
  private void a(boolean paramBoolean, DropBars paramDropBars)
    throws Exception
  {
    String str = paramBoolean ? "chart:stock-gain-marker" : "chart:stock-loss-marker";
    this.k.b(str);
    this.k.b();
  }
  
  private void a(Line paramLine)
    throws Exception
  {
    this.k.b("chart:stock-range-line");
    this.k.b();
  }
  
  private String x()
  {
    return "(22754.0383863584 13253.3437095935 31734.872606677)";
  }
  
  private String y()
  {
    return "(0.416199821709347 0.173649045905254 0.892537795986984)";
  }
  
  private String z()
  {
    return "(-0.0733876362771618 0.984807599917971 -0.157379306090273)";
  }
  
  private String f(int paramInt)
  {
    switch (paramInt)
    {
    }
    return zasp.e(paramInt);
  }
  
  private String a(Line paramLine, boolean paramBoolean)
  {
    if ((!paramLine.isVisible()) && (!paramBoolean)) {
      return "none";
    }
    int i1 = paramLine.getStyle();
    switch (i1)
    {
    case 0: 
    case 2: 
    case 3: 
    case 4: 
    case 6: 
    case 7: 
    case 8: 
      return "solid";
    case 1: 
      return "dash";
    }
    return "none";
  }
  
  private String g(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return "top";
    case 0: 
      return "bottom";
    case 4: 
      return "start";
    case 3: 
      return "end";
    case 1: 
      return "top-end";
    }
    return "";
  }
  
  private double h(int paramInt)
  {
    return this.d * paramInt / 4000.0D;
  }
  
  private double i(int paramInt)
  {
    return this.e * paramInt / 4000.0D;
  }
  
  private double j(int paramInt)
  {
    return this.d * paramInt / 4000.0D;
  }
  
  private double k(int paramInt)
  {
    return this.e * paramInt / 4000.0D;
  }
  
  static String a(Chart paramChart)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str = "";
    Iterator localIterator = paramChart.getNSeries().iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      localStringBuilder.append(str);
      if (a(localSeries.m()))
      {
        a(localSeries.m(), localStringBuilder);
        str = " ";
      }
      if (localSeries.getName().startsWith("="))
      {
        localStringBuilder.append(str);
        localStringBuilder.append(a(localSeries.getName()));
        str = " ";
      }
    }
    if (localStringBuilder.length() > 0) {
      return zs.a(localStringBuilder);
    }
    return null;
  }
  
  static void a(zjk paramzjk, StringBuilder paramStringBuilder)
  {
    if (paramzjk == null) {
      return;
    }
    switch (paramzjk.a())
    {
    case 2: 
      paramStringBuilder.append(b(paramzjk));
      break;
    }
  }
  
  static String b(zjk paramzjk)
  {
    String str = paramzjk.q();
    return a(str);
  }
  
  static String a(String paramString)
  {
    if (paramString.startsWith("="))
    {
      paramString = paramString.substring(1);
      paramString = zw.a(paramString, "$", "");
      if (paramString.indexOf("!") < 0) {
        return paramString;
      }
      String[] arrayOfString1 = zw.d(paramString, '!');
      String str1 = arrayOfString1[0];
      String[] arrayOfString2 = zw.d(arrayOfString1[1], ':');
      String str2 = "";
      String str3 = "";
      for (int i1 = 0; i1 < arrayOfString2.length; i1++)
      {
        str2 = str2 + str3 + str1 + "." + arrayOfString2[i1];
        str3 = ":";
      }
      return str2;
    }
    return paramString;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */