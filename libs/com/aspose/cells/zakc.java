package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zakc
{
  private zqi a = null;
  private zqh b = null;
  private WorksheetCollection c = null;
  private Chart d = null;
  private HashMap e = new HashMap();
  private ArrayList f = new ArrayList();
  private HashMap g = null;
  private ArrayList h = new ArrayList();
  private ArrayList i = new ArrayList();
  private zjn j = new zjn();
  private zru k;
  private zru l;
  private String m = null;
  private String n = null;
  private boolean o = false;
  private double p = 0.0D;
  private static final za q = new za(new String[] { "chartData", "chart", "printSettings", "spPr", "txPr", "headerFooter", "pageMargins", "pageSetup", "data", "strDim", "numDim", "f", "lvl", "pt", "title", "plotArea", "legend", "extLst", "overlay", "pos", "align", "l", "t", "r", "b", "tx", "plotAreaRegion", "axis", "series", "boxWhisker", "clusteredColumn", "funnel", "paretoLine", "sunburst", "treemap", "waterfall", "layoutId", "hidden", "formatIdx", "ownerIdx", "dataPt", "dataLabels", "dataId", "layoutPr", "axisId", "visibility", "numFmt", "separator", "dataLabel", "dataLabelHidden", "seriesName", "categoryName", "value", "parentLabelLayout", "aggregation", "binning", "statistics", "subtotals", "banner", "overlapping", "none", "idx", "intervalClosed", "connectorLines", "meanLine", "meanMarker", "nonoutliers", "outliers", "id", "catScaling", "valScaling", "units", "majorGridlines", "minorGridlines", "majorTickMarks", "minorTickMarks", "tickLabels", "unitsLabel", "max", "min", "majorUnit", "minorUnit" });
  
  zakc(zqh paramzqh, zqi paramzqi, Chart paramChart, HashMap paramHashMap)
  {
    this.b = paramzqh;
    this.a = paramzqi;
    this.d = paramChart;
    this.c = this.b.a.getWorksheets();
    this.g = paramHashMap;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    l(paramzcjy);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 0: 
        c(paramzcjy);
        break;
      case 1: 
        e(paramzcjy);
        break;
      case 2: 
        b(paramzcjy);
        break;
      case 3: 
        a(paramzcjy, this.d.getChartArea().getShapeProperties());
        break;
      case 4: 
        zru localzru = zaka.b(paramzcjy, this.d);
        if (localzru.g != null)
        {
          String str = this.d.O().f.a(this.d.n().p().getSettings().getRegion(), false);
          Font localFont = new Font(this.d.n(), null, false);
          if (str != null) {
            localFont.f = str;
          }
          localFont.b(10.0D);
          localzru.g.a(localFont);
          this.d.getChartArea().c(zauj.a(localFont, this.d.n()));
          this.d.a.g = localzru.g;
        }
        break;
      default: 
        paramzcjy.a();
      }
    }
    a();
  }
  
  private void a()
  {
    if (this.d.getNSeries().getCount() > 0) {
      this.d.d(this.d.getNSeries().get(0).getType());
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 5: 
        zakd.a(paramzcjy, this.d.getPageSetup());
        break;
      case 6: 
        zakd.b(paramzcjy, this.d.getPageSetup());
        break;
      case 7: 
        zakd.a(paramzcjy, this.d.getPageSetup(), this.a);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 8: 
        d(paramzcjy);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private zjm d(zcjy paramzcjy)
    throws Exception
  {
    zjm localzjm = new zjm();
    localzjm.a = zauj.F(paramzcjy.a("id"));
    this.j.add(localzjm);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 9: 
      case 10: 
        zjl localzjl = new zjl();
        a(paramzcjy, localzjl);
        localzjm.a(localzjl);
        break;
      default: 
        paramzcjy.a();
      }
    }
    return localzjm;
  }
  
  private void a(zcjy paramzcjy, zjl paramzjl)
    throws Exception
  {
    paramzjl.a = paramzcjy.a("type");
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 11: 
        paramzjl.c = paramzcjy.a("dir");
        paramzjl.b = paramzcjy.j();
        break;
      case 12: 
        paramzjl.d = new ArrayList();
        a(paramzcjy, paramzjl.d);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, ArrayList paramArrayList)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 13: 
        int i1 = zauj.F(paramzcjy.a("idx"));
        paramArrayList.add(i1, paramzcjy.j());
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 14: 
        a(paramzcjy, this.d.getTitle(), true);
        break;
      case 15: 
        f(paramzcjy);
        break;
      case 16: 
        k(paramzcjy);
        break;
      case 17: 
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, Title paramTitle, boolean paramBoolean)
    throws Exception
  {
    paramTitle.m(false);
    int i1 = 0;
    this.k = (this.l = null);
    String str1 = null;
    String str2 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (q.a(paramzcjy.q()))
        {
        case 18: 
          paramTitle.setOverLay(zauj.b(paramzcjy.t(), false));
          break;
        case 19: 
          str1 = paramzcjy.t();
          break;
        case 20: 
          str2 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    if (str2 != null) {
      paramTitle.l = ztr.e(str2);
    }
    if (str1 != null)
    {
      int i2 = 3;
      switch (q.a(str1))
      {
      case 21: 
        i2 = 4;
        break;
      case 22: 
        i2 = 2;
        break;
      case 23: 
        i2 = 3;
        if (paramTitle.l == 0) {
          i2 = 1;
        }
        break;
      case 24: 
        i2 = 0;
        break;
      }
      paramTitle.m = i2;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 25: 
        this.k = zaka.a(paramzcjy, this.d);
        i1 = 1;
        break;
      case 4: 
        this.l = zaka.b(paramzcjy, this.d);
        break;
      case 3: 
        a(paramzcjy, paramTitle.getShapeProperties());
        break;
      case 17: 
      default: 
        paramzcjy.a();
      }
    }
    if (this.l != null)
    {
      this.l.a(paramTitle, this.c, paramBoolean);
    }
    else if (i1 != 0)
    {
      if (this.k != null) {
        this.k.a(this.l == null ? null : this.l.g, paramTitle, this.c, paramBoolean);
      }
      if ((paramTitle.E() == null) && (paramTitle.getText() == null)) {
        paramTitle.setText("");
      }
    }
    else
    {
      paramTitle.setAutoText(true);
    }
  }
  
  private void a(zcjy paramzcjy, ShapePropertyCollection paramShapePropertyCollection)
    throws Exception
  {
    zakq localzakq = new zakq(paramShapePropertyCollection, this.a, this.d, this.g);
    localzakq.a(paramzcjy, paramShapePropertyCollection.a);
  }
  
  private void f(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 26: 
        g(paramzcjy);
        break;
      case 27: 
        i(paramzcjy);
        break;
      case 3: 
        a(paramzcjy, this.d.getPlotArea().getShapeProperties());
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void g(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    zka localzka = new zka(this.d.q());
    localzka.a(14);
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 28: 
        a(paramzcjy, localzka);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static int a(String paramString)
  {
    switch (q.a(paramString))
    {
    case 29: 
      return 73;
    case 30: 
      return 79;
    case 31: 
      return 74;
    case 32: 
      return 75;
    case 33: 
      return 76;
    case 34: 
      return 77;
    case 35: 
      return 78;
    }
    return 78;
  }
  
  private void a(zcjy paramzcjy, zka paramzka)
    throws Exception
  {
    Series localSeries = new Series(this.c, this.d.getNSeries(), 0);
    int i1 = -1;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (q.a(paramzcjy.q()))
        {
        case 36: 
          int i2 = a(paramzcjy.t());
          if (i2 != paramzka.j())
          {
            if (paramzka.j() != 75)
            {
              paramzka.a(i2);
              this.d.d(i2);
            }
            if ((i2 == 75) || (i2 == 79))
            {
              if (this.d.i.getCount() == 0) {
                this.d.q().a(paramzka);
              }
            }
            else {
              this.d.q().a(paramzka);
            }
          }
          localSeries.a(paramzka);
          break;
        case 37: 
          localSeries.a = zauj.b(paramzcjy.t(), false);
          break;
        case 38: 
          localSeries.e = zauj.F(paramzcjy.t());
          break;
        case 39: 
          i1 = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 25: 
        zru localzru = zaka.a(paramzcjy, this.d);
        localzru.a(localSeries);
        break;
      case 3: 
        a(paramzcjy, localSeries.getShapeProperties());
        break;
      case 40: 
        a(paramzcjy, localSeries);
        break;
      case 41: 
        a(paramzcjy, localSeries.getDataLabels(), localSeries);
        break;
      case 42: 
        int i3 = zauj.F(a(paramzcjy, "val"));
        a(localSeries, i3);
        break;
      case 43: 
        b(paramzcjy, localSeries);
        break;
      case 17: 
      case 44: 
      default: 
        paramzcjy.a();
      }
    }
    if (i1 >= 0)
    {
      if (localSeries.G() != null) {
        this.d.getNSeries().a = localSeries.G();
      }
    }
    else {
      this.d.getNSeries().a(localSeries);
    }
  }
  
  private void a(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    ChartPoint localChartPoint = new ChartPoint(paramSeries, 0);
    String str = paramzcjy.a("idx");
    int i1 = zauj.F(str);
    localChartPoint.a = i1;
    paramSeries.getPoints().a(localChartPoint);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 3: 
        a(paramzcjy, localChartPoint.getShapeProperties());
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void a(Series paramSeries, int paramInt)
  {
    zjm localzjm = this.j.a(paramInt);
    if (localzjm.a(0) != null) {
      paramSeries.b(localzjm.a(0).a(this.d));
    }
    if (localzjm.a(1) != null) {
      paramSeries.a(localzjm.a(1).a(this.d));
    }
    if (localzjm.a(2) != null) {
      paramSeries.c(localzjm.a(2).a(this.d));
    }
  }
  
  private void a(zcjy paramzcjy, DataLabels paramDataLabels, Series paramSeries)
    throws Exception
  {
    ChartPoint localChartPoint = null;
    String str1 = paramzcjy.a("idx");
    if (str1 != null)
    {
      int i1 = zauj.F(str1);
      localChartPoint = paramSeries.getPoints().a(i1);
      paramDataLabels = localChartPoint.getDataLabels();
    }
    String str2 = paramzcjy.a("pos");
    if (str2 != null) {
      paramDataLabels.n(zauj.O(str2));
    }
    if (paramzcjy.o())
    {
      paramDataLabels.setShowCategoryName(true);
      paramzcjy.a();
      return;
    }
    ArrayList localArrayList = new ArrayList();
    paramzcjy.d();
    Object localObject;
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 45: 
        a(paramzcjy, paramDataLabels);
        break;
      case 46: 
        j(paramzcjy);
        paramDataLabels.setNumberFormat(this.m);
        if (this.n != null) {
          paramDataLabels.setNumberFormatLinked(zauj.aB(this.n));
        }
        break;
      case 3: 
        a(paramzcjy, paramDataLabels.getShapeProperties());
        break;
      case 4: 
        zru localzru = zaka.b(paramzcjy, this.d);
        localzru.a(paramDataLabels, this.c);
        break;
      case 47: 
        paramzcjy.a(1);
        str1 = paramzcjy.j();
        if (str1 != null) {
          paramDataLabels.setSeparatorValue(str1);
        }
        paramzcjy.a(0);
        break;
      case 48: 
        String str3 = paramzcjy.b();
        zf.a(localArrayList, str3);
        break;
      case 49: 
        str1 = paramzcjy.a("idx");
        int i3 = zauj.F(str1);
        localChartPoint = paramSeries.getPoints().a(i3);
        localObject = localChartPoint.getDataLabels();
        ((DataLabels)localObject).setDeleted(true);
        break;
      default: 
        paramzcjy.a();
      }
    }
    for (int i2 = 0; i2 < localArrayList.size(); i2++)
    {
      String str4 = (String)localArrayList.get(i2);
      localObject = new zcjy(str4, false);
      a((zcjy)localObject, paramDataLabels, paramSeries);
    }
  }
  
  private void a(zcjy paramzcjy, DataLabels paramDataLabels)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (q.a(paramzcjy.q()))
        {
        case 50: 
          paramDataLabels.setShowSeriesName(zauj.aB(paramzcjy.t()));
          break;
        case 51: 
          paramDataLabels.setShowCategoryName(zauj.aB(paramzcjy.t()));
          break;
        case 52: 
          paramDataLabels.setShowValue(zauj.aB(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void b(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    zbfi localzbfi = paramSeries.a();
    while (zauz.a(paramzcjy))
    {
      String str;
      switch (q.a(paramzcjy.q()))
      {
      case 53: 
        str = paramzcjy.a("val");
        localzbfi.b(1);
        if (str != null) {
          switch (q.a(str))
          {
          case 58: 
            localzbfi.b(0);
            break;
          case 59: 
            localzbfi.b(2);
            break;
          case 60: 
            localzbfi.b(1);
            break;
          }
        }
        paramzcjy.a();
        break;
      case 45: 
        b(paramzcjy, localzbfi);
        break;
      case 54: 
        paramzcjy.a();
        break;
      case 55: 
        a(paramzcjy, localzbfi);
        break;
      case 56: 
        str = paramzcjy.a("quartileMethod");
        if (str != null) {
          localzbfi.a("exclusive".equals(str) ? 0 : 1);
        }
        paramzcjy.a();
        break;
      case 57: 
        localzbfi.a(h(paramzcjy));
        break;
      case 17: 
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private int[] h(zcjy paramzcjy)
    throws Exception
  {
    int[] arrayOfInt = new int[0];
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return arrayOfInt;
    }
    ArrayList localArrayList = new ArrayList();
    paramzcjy.d();
    int i1;
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 61: 
        i1 = zauj.F(paramzcjy.a("val"));
        zf.a(localArrayList, Integer.valueOf(i1));
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
    if (localArrayList.size() > 0)
    {
      arrayOfInt = new int[localArrayList.size()];
      for (i1 = 0; i1 < localArrayList.size(); i1++) {
        arrayOfInt[i1] = ((Integer)localArrayList.get(i1)).intValue();
      }
    }
    return arrayOfInt;
  }
  
  private void a(zcjy paramzcjy, zbfi paramzbfi)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (q.a(paramzcjy.q()))
        {
        case 62: 
          paramzbfi.f("l".equals(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void b(zcjy paramzcjy, zbfi paramzbfi)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (q.a(paramzcjy.q()))
        {
        case 63: 
          paramzbfi.a(zauj.aB(paramzcjy.t()));
          break;
        case 64: 
          paramzbfi.b(zauj.aB(paramzcjy.t()));
          break;
        case 65: 
          paramzbfi.d(zauj.aB(paramzcjy.t()));
          break;
        case 66: 
          paramzbfi.e(zauj.aB(paramzcjy.t()));
          break;
        case 67: 
          paramzbfi.c(zauj.aB(paramzcjy.t()));
        }
      }
      paramzcjy.m();
    }
    paramzcjy.a();
  }
  
  private void i(zcjy paramzcjy)
    throws Exception
  {
    int i1 = 0;
    int i2 = 0;
    boolean bool1 = false;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (q.a(paramzcjy.q()))
        {
        case 68: 
          i2 = zauj.F(paramzcjy.t());
          break;
        case 37: 
          bool1 = zauj.b(paramzcjy.t(), false);
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    Axis localAxis = new Axis(0, !bool1, this.d);
    localAxis.setMajorTickMark(2);
    localAxis.setMinorTickMark(2);
    int i3 = 0;
    while (zauz.a(paramzcjy))
    {
      Object localObject;
      boolean bool2;
      switch (q.a(paramzcjy.q()))
      {
      case 69: 
        a(paramzcjy, localAxis, i2);
        break;
      case 70: 
        b(paramzcjy, localAxis, i2);
        break;
      case 14: 
        a(paramzcjy, localAxis.getTitle(), false);
        break;
      case 71: 
        a(paramzcjy, localAxis);
        break;
      case 72: 
        localObject = localAxis.getMajorGridLines();
        bool2 = b(paramzcjy, localAxis.s());
        if (!bool2)
        {
          ((Line)localObject).a(this.d.O().e());
          ((Line)localObject).n(0);
        }
        break;
      case 73: 
        localObject = localAxis.getMinorGridLines();
        bool2 = b(paramzcjy, localAxis.t());
        if (!bool2)
        {
          ((Line)localObject).a(this.d.O().e());
          ((Line)localObject).n(0);
        }
        break;
      case 74: 
        localObject = a(paramzcjy, "type");
        if (localObject != null) {
          localAxis.setMajorTickMark(zauj.u((String)localObject));
        }
        break;
      case 75: 
        localObject = a(paramzcjy, "type");
        if (localObject != null) {
          localAxis.setMinorTickMark(zauj.u((String)localObject));
        }
        break;
      case 46: 
        j(paramzcjy);
        localAxis.getTickLabels().setNumberFormat(this.m);
        if (this.n != null) {
          localAxis.getTickLabels().setNumberFormatLinked(zauj.aB(this.n));
        }
        break;
      case 3: 
        a(paramzcjy, localAxis.r());
        i1 = 1;
        break;
      case 4: 
        localObject = zaka.b(paramzcjy, this.d);
        ((zru)localObject).a(localAxis.getTickLabels(), this.d, this.c);
        break;
      case 76: 
        i3 = 1;
        localAxis.getTickLabels().b = true;
        paramzcjy.a();
        break;
      case 17: 
      default: 
        paramzcjy.a();
      }
    }
    if (i3 == 0) {
      localAxis.getTickLabels().b = false;
    }
    if (i1 == 0) {
      localAxis.getAxisLine().a(this.d.O().e());
    }
  }
  
  private void j(zcjy paramzcjy)
    throws Exception
  {
    this.m = paramzcjy.a("formatCode");
    this.n = paramzcjy.a("sourceLinked");
    paramzcjy.a();
  }
  
  private static String a(zcjy paramzcjy, String paramString)
    throws Exception
  {
    String str = paramzcjy.a(paramString);
    paramzcjy.a();
    return str;
  }
  
  private boolean b(zcjy paramzcjy, ShapePropertyCollection paramShapePropertyCollection)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return false;
    }
    boolean bool = false;
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        a(paramzcjy, paramShapePropertyCollection);
        bool = true;
      }
      else
      {
        paramzcjy.a();
      }
    }
    return bool;
  }
  
  private void a(zcjy paramzcjy, Axis paramAxis)
    throws Exception
  {
    String str = paramzcjy.a("unit");
    paramAxis.setDisplayUnit(zauj.as(str));
    paramAxis.b(false);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 77: 
        paramAxis.b(true);
        a(paramzcjy, paramAxis.getDisplayUnitLabel());
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, DisplayUnitLabel paramDisplayUnitLabel)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 25: 
        this.k = zaka.a(paramzcjy, this.d);
        break;
      case 3: 
        a(paramzcjy, paramDisplayUnitLabel.getShapeProperties());
        break;
      case 4: 
        this.l = zaka.b(paramzcjy, this.d);
        break;
      case 17: 
      default: 
        paramzcjy.a();
      }
    }
    if (this.k != null)
    {
      this.k.a(paramDisplayUnitLabel, this.c);
    }
    else if ((this.l != null) && (this.l.g != null))
    {
      if (paramDisplayUnitLabel.j() != null)
      {
        if ((this.l.g.h() != null) && (("+mj-lt".equals(this.l.g.h())) || ("+mn-lt".equals(this.l.g.h())))) {
          this.l.g.d(this.d.getChartArea().getFont().getName());
        }
        this.l.g.b(paramDisplayUnitLabel.getFont());
      }
      else
      {
        this.l.a(this.d, false);
        paramDisplayUnitLabel.c(zauj.a(this.l.g, this.c));
      }
      Font localFont = paramDisplayUnitLabel.getFont();
    }
  }
  
  private void a(zcjy paramzcjy, Axis paramAxis, int paramInt)
    throws Exception
  {
    this.d.j = paramAxis;
    paramAxis.a(0);
    String str = paramzcjy.a("gapWidth");
    double d1 = 1.0D;
    if (str != null) {
      d1 = zauj.C(str);
    }
    this.d.getNSeries().get(0).setGapWidth((short)(int)(d1 * 100.0D + 0.5D));
    paramzcjy.a();
  }
  
  private void b(zcjy paramzcjy, Axis paramAxis, int paramInt)
    throws Exception
  {
    if (paramInt > 1)
    {
      this.d.l = paramAxis;
      this.d.l.setVisible(true);
    }
    else
    {
      this.d.k = paramAxis;
    }
    paramAxis.a(1);
    if (paramzcjy.n()) {
      while (paramzcjy.m()) {
        switch (q.a(paramzcjy.q()))
        {
        case 78: 
          b(paramzcjy.t());
          if (!this.o) {
            paramAxis.setMaxValue(Double.valueOf(this.p));
          }
          break;
        case 79: 
          b(paramzcjy.t());
          if (!this.o) {
            paramAxis.setMinValue(Double.valueOf(this.p));
          }
          break;
        case 80: 
          b(paramzcjy.t());
          if (!this.o) {
            paramAxis.setMajorUnit(this.p);
          }
          break;
        case 81: 
          b(paramzcjy.t());
          if (!this.o) {
            paramAxis.setMinorUnit(this.p);
          }
          break;
        }
      }
    }
    paramzcjy.a();
  }
  
  private void b(String paramString)
  {
    this.o = false;
    if ("auto".equals(paramString)) {
      this.o = true;
    } else {
      this.p = zauj.C(paramString);
    }
  }
  
  private void k(zcjy paramzcjy)
    throws Exception
  {
    Legend localLegend = this.d.getLegend();
    this.k = (this.l = null);
    String str1 = null;
    String str2 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (q.a(paramzcjy.q()))
        {
        case 18: 
          localLegend.setOverLay(zauj.b(paramzcjy.t(), false));
          break;
        case 19: 
          str1 = paramzcjy.t();
          break;
        case 20: 
          str2 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    if (str2 != null) {
      localLegend.i = ztr.e(str2);
    }
    if (str1 != null)
    {
      int i1 = 3;
      switch (q.a(str1))
      {
      case 21: 
        i1 = 4;
        break;
      case 22: 
        i1 = 2;
        break;
      case 23: 
        i1 = 3;
        if (localLegend.i == 0) {
          i1 = 1;
        }
        break;
      case 24: 
        i1 = 0;
        break;
      }
      localLegend.setPosition(i1);
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q()))
      {
      case 4: 
        this.l = zaka.b(paramzcjy, this.d);
        if (this.l.g != null)
        {
          this.l.a(this.d, false);
          if (this.l.g.h() == null) {
            this.l.g.d("Calibri");
          }
          localLegend.c(zauj.a(this.l.g, this.c));
        }
        break;
      case 3: 
        a(paramzcjy, localLegend.getShapeProperties());
        break;
      case 17: 
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void l(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */