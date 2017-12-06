package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zaka
{
  private zqi a = null;
  private zqh b = null;
  private WorksheetCollection c = null;
  private Chart d = null;
  private HashMap e = new HashMap();
  private ArrayList f = new ArrayList();
  private HashMap g = null;
  private ArrayList h = new ArrayList();
  private boolean i = false;
  private ArrayList j = new ArrayList();
  private static final za k = new za(new String[] { "{781A3756-C4B2-4CAC-9D66-4F8BD8637D16}", "{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}", "{02D57815-91ED-43cb-92C2-25804820EDAC}", "numRef", "strRef", "multiLvlStrRef", "numLit", "strLit", "f", "numCache", "strCache", "multiLvlStrCache", "v", "rich", "txData", "eaVert", "wordArtVert", "wordArtVertRtl", "SERIESNAME", "CATEGORYNAME", "VALUE", "CELLRANGE", "PERCENTAGE", "spcPct", "spcPts" });
  
  zaka(zqh paramzqh, zqi paramzqi, Chart paramChart, HashMap paramHashMap)
  {
    this.b = paramzqh;
    this.a = paramzqi;
    this.d = paramChart;
    this.c = this.b.a.getWorksheets();
    this.g = paramHashMap;
  }
  
  private void a()
  {
    int m = 0;
    int n = this.d.getNSeries().getCount();
    LegendEntryCollection localLegendEntryCollection = this.d.getLegend().F();
    Object localObject;
    if (localLegendEntryCollection != null)
    {
      Iterator localIterator = localLegendEntryCollection.iterator();
      while (localIterator.hasNext())
      {
        localObject = (LegendEntry)localIterator.next();
        if ((((LegendEntry)localObject).c() >= 0) && (((LegendEntry)localObject).c() < n))
        {
          Series localSeries = (Series)this.h.get(((LegendEntry)localObject).c());
          ((LegendEntry)localObject).b(localSeries.E());
        }
      }
    }
    for (int i1 = 0; i1 < n; i1++)
    {
      localObject = this.d.getNSeries().get(i1);
      if (((Series)localObject).q() != null) {
        for (int i2 = 0; i2 < ((Series)localObject).getTrendLines().getCount(); i2++) {
          ((Series)localObject).getTrendLines().get(i2).p(m++);
        }
      }
    }
    this.d.q = m;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    w(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ("spPr".equals(paramzcjy.q()))
      {
        b(paramzcjy, this.d.getChartArea().getShapeProperties());
      }
      else if ("txPr".equals(paramzcjy.q()))
      {
        zru localzru = b(paramzcjy, this.d);
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
      }
      else if ("lang".equals(paramzcjy.q()))
      {
        this.d.a(t(paramzcjy));
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  void b(zcjy paramzcjy)
    throws Exception
  {
    this.d.f(1);
    this.d.getPivotOptions().a = false;
    w(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ("chart".equals(paramzcjy.q()))
      {
        if (paramzcjy.o()) {
          throw new CellsException(6, "Invalid chart element");
        }
        c(paramzcjy);
      }
      else
      {
        Object localObject;
        if ("roundedCorners".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if ((localObject != null) && ("1".equals(localObject))) {
            this.d.setRectangularCornered(false);
          }
        }
        else if ("userShapes".equals(paramzcjy.q()))
        {
          this.d.a.b = paramzcjy.a("id", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
          paramzcjy.a();
        }
        else if ("style".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            int m = zauj.F((String)localObject);
            if ((m >= 1) && (m <= 48)) {
              a(m);
            }
          }
        }
        else if (("pivotSource".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          d(paramzcjy);
        }
        else if ("AlternateContent".equals(paramzcjy.q()))
        {
          this.d.a.e = paramzcjy.v();
          localObject = zauy.a(this.d.a.e, false);
          ((zcjy)localObject).d();
          ((zcjy)localObject).k();
          if ((((zcjy)localObject).s() == 1) && ("AlternateContent".equals(((zcjy)localObject).q())))
          {
            ((zcjy)localObject).d();
            ((zcjy)localObject).k();
            if ((((zcjy)localObject).s() == 1) && ("Choice".equals(((zcjy)localObject).q())))
            {
              ((zcjy)localObject).d();
              ((zcjy)localObject).k();
              if ((((zcjy)localObject).s() == 1) && ("style".equals(((zcjy)localObject).q())))
              {
                ((zcjy)localObject).a();
                ((zcjy)localObject).d();
                ((zcjy)localObject).k();
                if ((((zcjy)localObject).s() == 1) && ("Fallback".equals(((zcjy)localObject).q())))
                {
                  ((zcjy)localObject).d();
                  ((zcjy)localObject).k();
                  if ((((zcjy)localObject).s() == 1) && ("style".equals(((zcjy)localObject).q())))
                  {
                    String str = t((zcjy)localObject);
                    if (str != null)
                    {
                      int n = zauj.F(str);
                      if ((n >= 1) && (n <= 48))
                      {
                        a(n);
                        this.d.a.e = null;
                      }
                    }
                  }
                }
              }
            }
          }
          ((zcjy)localObject).c();
        }
        else if ("extLst".equals(paramzcjy.q()))
        {
          e(paramzcjy);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    a();
  }
  
  private void a(int paramInt)
  {
    this.d.a(paramInt);
    switch (paramInt)
    {
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
      if (!this.d.getChartArea().getFont().f(16)) {
        this.d.getChartArea().getFont().setColor(Color.getWhite());
      }
      this.d.getChartArea().getArea().setFormatting(2);
      this.d.getChartArea().getArea().setForegroundColor(Color.getBlack());
      break;
    }
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("name".equals(paramzcjy.q()))
      {
        String str = paramzcjy.j();
        if ((str != null) && (str.length() > 0))
        {
          str = str.trim();
          if (str.charAt(0) == '[')
          {
            int m = str.indexOf(']');
            if (m != -1) {
              if (str.length() > m + 1) {
                str = str.substring(m + 1);
              } else {
                str = null;
              }
            }
          }
          if ((str != null) && (str.length() > 0)) {
            this.d.setPivotSource(str);
          }
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
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
      if ("ext".equals(paramzcjy.q())) {
        f(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void f(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    String str = paramzcjy.a("uri");
    switch (k.a(str))
    {
    case 0: 
      break;
    default: 
      zf.a(this.d.a.b(), paramzcjy.v());
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("pivotOptions".equals(paramzcjy.q())) {
        g(paramzcjy);
      } else {
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
    this.d.getPivotOptions().a = true;
    this.d.getPivotOptions().a();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str;
        if ("dropZoneFilter".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          this.d.getPivotOptions().DropZoneFilter = (!"0".equals(str));
        }
        else if ("dropZoneCategories".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          this.d.getPivotOptions().DropZoneCategories = (!"0".equals(str));
        }
        else if ("dropZoneData".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          this.d.getPivotOptions().DropZoneData = (!"0".equals(str));
        }
        else if ("dropZoneSeries".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          this.d.getPivotOptions().DropZoneSeries = (!"0".equals(str));
        }
        else if ("dropZonesVisible".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          this.d.getPivotOptions().DropZonesVisible = (!"0".equals(str));
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  void c(zcjy paramzcjy)
    throws Exception
  {
    this.d.setPlotVisibleCells(false);
    int m = 1;
    paramzcjy.d();
    int n = 0;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("title".equals(paramzcjy.q()))
      {
        n = 1;
        if (!paramzcjy.o()) {
          a(paramzcjy, this.d.getTitle(), true);
        } else {
          paramzcjy.a();
        }
      }
      else
      {
        String str;
        if ("autoTitleDeleted".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          this.d.getTitle().setDeleted(!"0".equals(str));
        }
        else if (("plotArea".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          j(paramzcjy);
        }
        else if (("view3D".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          h(paramzcjy);
        }
        else if (("floor".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          a(paramzcjy, this.d.v().j());
        }
        else if (("backWall".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          a(paramzcjy, this.d.z().j());
        }
        else if (("sideWall".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          a(paramzcjy, this.d.B().j());
        }
        else if (("legend".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          m = 0;
          i(paramzcjy);
        }
        else if ("plotVisOnly".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            this.d.setPlotVisibleCells(zauj.aB(str));
          } else {
            this.d.setPlotVisibleCells(true);
          }
        }
        else if ("dispBlanksAs".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            this.d.setPlotEmptyCellsType(zauj.aD(str));
          }
        }
        else if ("showDLblsOverMax".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            this.d.a(zauj.aB(str));
          }
        }
        else if ("pivotFmts".equals(paramzcjy.q()))
        {
          this.d.a.f = paramzcjy.v();
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (m != 0) {
      this.d.setShowLegend(false);
    }
    if ((!this.i) && ((this.d.getType() == 45) || (this.d.getType() == 48))) {
      this.d.setRotationAngle(0);
    }
    if (n == 0) {
      this.d.getTitle().setDeleted(true);
    }
    if ((this.d.h) && (this.d.e() != null)) {
      this.d.a(true);
    }
  }
  
  private void h(zcjy paramzcjy)
    throws Exception
  {
    int m = 1;
    paramzcjy.d();
    int n = 0;
    int i1 = 0;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str;
        if ("rotX".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            this.d.setElevation(zauj.F(str));
          }
        }
        else if ("hPercent".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null)
          {
            this.d.setHeightPercent(zauj.H(str));
            m = 0;
          }
        }
        else if ("rotY".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null)
          {
            this.d.setRotationAngle(zauj.F(str));
            this.i = true;
          }
        }
        else if ("depthPercent".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            this.d.setDepthPercent(zauj.F(str));
          }
        }
        else if ("rAngAx".equals(paramzcjy.q()))
        {
          n = 1;
          str = t(paramzcjy);
          this.d.setRightAngleAxes(zauj.aB(str));
        }
        else if ("perspective".equals(paramzcjy.q()))
        {
          i1 = 1;
          str = t(paramzcjy);
          if (str != null) {
            this.d.setPerspective((short)(zauj.H(str) / 2));
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if ((n == 0) && (i1 != 0)) {
      this.d.setRightAngleAxes(false);
    }
    if (m == 0) {
      this.d.setAutoScaling(false);
    }
  }
  
  private void i(zcjy paramzcjy)
    throws Exception
  {
    Legend localLegend = this.d.getLegend();
    int m = 0;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if (("layout".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = u(paramzcjy);
          if (localObject != null) {
            ((zrb)localObject).a(this.d, localLegend);
          }
        }
        else if ("legendPos".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localLegend.a(zauj.t((String)localObject));
          }
        }
        else if (("legendEntry".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          a(paramzcjy, localLegend);
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, localLegend.getShapeProperties());
        }
        else if (("txPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = b(paramzcjy, this.d);
          if (((zru)localObject).g != null)
          {
            ((zru)localObject).a(this.d, false);
            if (((zru)localObject).g.h() == null) {
              ((zru)localObject).g.d("Calibri");
            }
            localLegend.c(zauj.a(((zru)localObject).g, this.c));
          }
        }
        else if ("overlay".equals(paramzcjy.q()))
        {
          m = 1;
          localObject = t(paramzcjy);
          localLegend.setOverLay(localObject == null ? false : zauj.aB((String)localObject));
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (m == 0) {
      localLegend.setOverLay(false);
    }
  }
  
  private void j(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.d();
    this.d.getSeriesAxis().setVisible(false);
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() != 1) || (paramzcjy.o()))
      {
        paramzcjy.a();
      }
      else if ("layout".equals(paramzcjy.q()))
      {
        zrb localzrb = u(paramzcjy);
        if ((localzrb != null) && (localzrb.a())) {
          localzrb.a(this.d);
        }
      }
      else
      {
        boolean bool;
        if (("barChart".equals(paramzcjy.q())) || ("bar3DChart".equals(paramzcjy.q())))
        {
          bool = paramzcjy.q().indexOf("3D") != -1;
          e(paramzcjy, bool);
        }
        else if (("lineChart".equals(paramzcjy.q())) || ("line3DChart".equals(paramzcjy.q())))
        {
          bool = paramzcjy.q().indexOf("3D") != -1;
          d(paramzcjy, bool);
        }
        else if (("pieChart".equals(paramzcjy.q())) || ("pie3DChart".equals(paramzcjy.q())))
        {
          bool = paramzcjy.q().indexOf("3D") != -1;
          b(paramzcjy, bool);
        }
        else if ("ofPieChart".equals(paramzcjy.q()))
        {
          k(paramzcjy);
        }
        else if (("areaChart".equals(paramzcjy.q())) || ("area3DChart".equals(paramzcjy.q())))
        {
          bool = paramzcjy.q().indexOf("3D") != -1;
          a(paramzcjy, bool);
        }
        else if ("scatterChart".equals(paramzcjy.q()))
        {
          m(paramzcjy);
        }
        else if ("doughnutChart".equals(paramzcjy.q()))
        {
          o(paramzcjy);
        }
        else if ("radarChart".equals(paramzcjy.q()))
        {
          p(paramzcjy);
        }
        else if ("bubbleChart".equals(paramzcjy.q()))
        {
          n(paramzcjy);
        }
        else if ("stockChart".equals(paramzcjy.q()))
        {
          q(paramzcjy);
        }
        else if (("surfaceChart".equals(paramzcjy.q())) || ("surface3DChart".equals(paramzcjy.q())))
        {
          bool = paramzcjy.q().indexOf("3D") != -1;
          c(paramzcjy, bool);
        }
        else if ("dateAx".equals(paramzcjy.q()))
        {
          a(paramzcjy, "dateAx");
        }
        else if ("catAx".equals(paramzcjy.q()))
        {
          a(paramzcjy, "catAx");
        }
        else if ("valAx".equals(paramzcjy.q()))
        {
          a(paramzcjy, "valAx");
        }
        else if ("serAx".equals(paramzcjy.q()))
        {
          this.d.getSeriesAxis().setVisible(true);
          a(paramzcjy, "serAx");
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, this.d.getPlotArea().getShapeProperties());
        }
        else if ("dTable".equals(paramzcjy.q()))
        {
          this.d.setShowDataTable(true);
          ChartDataTable localChartDataTable = this.d.getChartDataTable();
          a(paramzcjy, localChartDataTable);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    b();
    if (this.f.size() > 0) {
      c();
    }
  }
  
  private void b()
  {
    int m = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    for (int n = 0; n < this.d.i.getCount(); n++)
    {
      zka localzka2 = this.d.i.a(n);
      if (b(localzka2.j())) {
        localObject1 = localzka2;
      } else if (c(localzka2.j())) {
        localObject2 = localzka2;
      } else {
        m = 1;
      }
    }
    if ((localObject1 != null) || (localObject2 != null))
    {
      zka localzka1 = this.d.i.a(0);
      if (m != 0)
      {
        if ((b(localzka1.j())) || (b(localzka1.j())))
        {
          for (int i1 = 1; i1 < this.d.i.getCount(); i1++)
          {
            zka localzka3 = this.d.i.a(i1);
            if ((!b(localzka3.j())) && (!b(localzka3.j())) && (!localzka3.m())) {
              localzka3.a(true);
            }
          }
        }
        else
        {
          if ((localObject1 != null) && (!((zka)localObject1).m())) {
            ((zka)localObject1).a(true);
          }
          if ((localObject2 != null) && (!((zka)localObject2).m())) {
            ((zka)localObject2).a(true);
          }
        }
      }
      else if ((localObject1 != null) && (localObject2 != null)) {
        if (b(localzka1.j()))
        {
          if (!((zka)localObject2).m()) {
            ((zka)localObject2).a(true);
          }
        }
        else if (!((zka)localObject1).m()) {
          ((zka)localObject1).a(true);
        }
      }
    }
  }
  
  private boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 44: 
    case 46: 
    case 47: 
    case 49: 
      return true;
    }
    return false;
  }
  
  private boolean c(int paramInt)
  {
    switch (paramInt)
    {
    case 35: 
    case 36: 
      return true;
    }
    return false;
  }
  
  private void k(zcjy paramzcjy)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.o(false);
    localzka.a(46);
    this.d.q().a(localzka);
    boolean bool = false;
    StringBuilder localStringBuilder = new StringBuilder(20);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if ("ofPieType".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            if ("pie".equals(localObject)) {
              localzka.a(46);
            } else if ("bar".equals(localObject)) {
              localzka.a(49);
            }
          }
        }
        else if ("gapWidth".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.c(zauj.F((String)localObject));
          }
        }
        else if ("splitType".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.g(zauj.U((String)localObject));
          }
        }
        else if ("custSplit".equals(paramzcjy.q()))
        {
          localzka.a(l(paramzcjy));
        }
        else if ("splitPos".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.a(zauj.C((String)localObject));
          }
        }
        else if ("secondPieSize".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.f(zauj.F((String)localObject));
          }
        }
        else if ("serLines".equals(paramzcjy.q()))
        {
          a(paramzcjy, localzka.T());
        }
        else if ("varyColors".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            bool = zauj.aB((String)localObject);
          }
        }
        else if ("ser".equals(paramzcjy.q()))
        {
          b(paramzcjy, localzka);
        }
        else if ("firstSliceAng".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.d(zauj.F((String)localObject));
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    this.d.d(localzka.j());
    localzka.k(bool);
  }
  
  private int[] l(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    paramzcjy.d();
    ArrayList localArrayList = new ArrayList();
    Object localObject;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("secondPiePt".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        zf.a(localArrayList, Integer.valueOf(ze.f(localObject)));
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    if (localArrayList.size() > 0)
    {
      localObject = new int[localArrayList.size()];
      for (int m = 0; m < localArrayList.size(); m++) {
        localObject[m] = ze.f(localArrayList.get(m));
      }
      return (int[])localObject;
    }
    return null;
  }
  
  private void a(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.a(0);
    this.d.q().a(localzka);
    String str = "standard";
    StringBuilder localStringBuilder = new StringBuilder(20);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("grouping".equals(paramzcjy.q()))
      {
        str = t(paramzcjy);
      }
      else
      {
        Object localObject;
        if ("varyColors".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.k(zauj.aB((String)localObject));
          }
        }
        else if ("ser".equals(paramzcjy.q()))
        {
          b(paramzcjy, localzka);
        }
        else if ("dropLines".equals(paramzcjy.q()))
        {
          localzka.g(true);
          a(paramzcjy, localzka.U());
        }
        else if ("axId".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append(" ");
            }
            localStringBuilder.append((String)localObject);
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject);
        }
        else if ("gapDepth".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            this.d.setGapDepth(zauj.F((String)localObject));
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    localzka.a(zauj.a(str, paramBoolean));
    this.e.put(localzka, zs.a(localStringBuilder));
    this.d.d(localzka.j());
  }
  
  private void b(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.a(44);
    localzka.o(false);
    this.d.q().a(localzka);
    boolean bool = false;
    paramzcjy.d();
    ArrayList localArrayList = new ArrayList();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if ("varyColors".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          bool = zauj.b((String)localObject, false);
        }
        else if ("ser".equals(paramzcjy.q()))
        {
          localObject = b(paramzcjy, localzka);
          if (paramBoolean) {
            ((Series)localObject).setFirstSliceAngle((short)this.d.getRotationAngle());
          }
          zf.a(localArrayList, localObject);
        }
        else if ("firstSliceAng".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.d(zauj.F((String)localObject));
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    int m = 0;
    SeriesCollection localSeriesCollection = this.d.getNSeries();
    for (int n = 0; n < localSeriesCollection.getCount(); n++)
    {
      Series localSeries = localSeriesCollection.get(n);
      if (localSeries.getExplosion() > 0)
      {
        m = 1;
        break;
      }
    }
    if (m != 0)
    {
      if (paramBoolean) {
        localzka.b(48);
      } else {
        localzka.b(47);
      }
    }
    else if (paramBoolean) {
      localzka.b(45);
    } else {
      localzka.b(44);
    }
    this.d.d(localzka.j());
    localzka.k(bool);
  }
  
  private void m(zcjy paramzcjy)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.a(63);
    this.d.q().a(localzka);
    int m = 0;
    String str = "marker";
    StringBuilder localStringBuilder = new StringBuilder(20);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("scatterStyle".equals(paramzcjy.q()))
      {
        str = t(paramzcjy);
      }
      else
      {
        Object localObject;
        if ("varyColors".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.k(zauj.aB((String)localObject));
          }
        }
        else if ("ser".equals(paramzcjy.q()))
        {
          localObject = b(paramzcjy, localzka);
          if ((m == 0) && (((Series)localObject).getBorder().isVisible())) {
            m = 1;
          }
        }
        else if ("axId".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append(" ");
            }
            localStringBuilder.append((String)localObject);
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    int n = zauj.V(str);
    switch (n)
    {
    case 60: 
    case 61: 
    case 62: 
      break;
    case 63: 
      if (m == 0) {
        n = 60;
      }
      break;
    case 64: 
      if (m == 0) {
        n = 60;
      }
      break;
    }
    localzka.b(n);
    this.e.put(localzka, zs.a(localStringBuilder));
    this.d.d(n);
  }
  
  private void n(zcjy paramzcjy)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.a(12);
    this.d.q().a(localzka);
    StringBuilder localStringBuilder = new StringBuilder(20);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if ("bubbleScale".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.h(zauj.F((String)localObject));
          }
        }
        else if ("varyColors".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.k(zauj.aB((String)localObject));
          }
        }
        else if ("ser".equals(paramzcjy.q()))
        {
          b(paramzcjy, localzka);
        }
        else if ("showNegBubbles".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          localzka.l(zauj.aB((String)localObject));
        }
        else if ("sizeRepresents".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if ("w".equals(localObject)) {
            localzka.i(1);
          }
        }
        else if ("axId".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append(" ");
            }
            localStringBuilder.append((String)localObject);
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    int m = 1;
    SeriesCollection localSeriesCollection = this.d.getNSeries();
    for (int n = 0; n < localSeriesCollection.getCount(); n++)
    {
      Series localSeries = localSeriesCollection.get(n);
      if ((localSeries.u() == localzka) && (!localSeries.getHas3DEffect()))
      {
        m = 0;
        break;
      }
    }
    if (m != 0) {
      localzka.a(13);
    } else {
      localzka.a(12);
    }
    this.e.put(localzka, zs.a(localStringBuilder));
    this.d.d(localzka.j());
  }
  
  private void o(zcjy paramzcjy)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.a(44);
    this.d.q().a(localzka);
    localzka.o(false);
    boolean bool = false;
    StringBuilder localStringBuilder = new StringBuilder(20);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if ("varyColors".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            bool = zauj.aB((String)localObject);
          }
        }
        else if ("ser".equals(paramzcjy.q()))
        {
          b(paramzcjy, localzka);
        }
        else if ("firstSliceAng".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.d(zauj.F((String)localObject));
          }
        }
        else if ("holeSize".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.j(zauj.F((String)localObject));
          }
        }
        else if ("axId".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append(" ");
            }
            localStringBuilder.append((String)localObject);
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    int m = 0;
    SeriesCollection localSeriesCollection = this.d.getNSeries();
    for (int n = 0; (n < localSeriesCollection.getCount()) && (m == 0); n++)
    {
      Series localSeries = localSeriesCollection.get(n);
      if (localSeries.getExplosion() > 0) {
        m = 1;
      }
    }
    if (m != 0) {
      localzka.b(36);
    } else {
      localzka.b(35);
    }
    localzka.k(bool);
    this.d.d(localzka.j());
  }
  
  private void p(zcjy paramzcjy)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.a(60);
    this.d.q().a(localzka);
    String str = "standard";
    StringBuilder localStringBuilder = new StringBuilder(20);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("radarStyle".equals(paramzcjy.q()))
      {
        str = t(paramzcjy);
        if (str != null) {
          localzka.a(zauj.W(str));
        }
      }
      else
      {
        Object localObject;
        if ("varyColors".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.k(zauj.aB((String)localObject));
          }
        }
        else if ("ser".equals(paramzcjy.q()))
        {
          b(paramzcjy, localzka);
        }
        else if ("axId".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append(" ");
            }
            localStringBuilder.append((String)localObject);
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    localzka.a(zauj.W(str));
    this.e.put(localzka, zs.a(localStringBuilder));
    this.d.d(localzka.j());
  }
  
  private void q(zcjy paramzcjy)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.a(37);
    this.d.q().a(localzka);
    StringBuilder localStringBuilder = new StringBuilder(20);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("ser".equals(paramzcjy.q()))
      {
        b(paramzcjy, localzka);
      }
      else if ("hiLowLines".equals(paramzcjy.q()))
      {
        localzka.c(true);
        a(paramzcjy, localzka.V());
      }
      else if ("upDownBars".equals(paramzcjy.q()))
      {
        localzka.i(true);
        a(paramzcjy, localzka);
      }
      else
      {
        Object localObject;
        if ("axId".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append(" ");
            }
            localStringBuilder.append((String)localObject);
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    this.e.put(localzka, zs.a(localStringBuilder));
    this.d.d(localzka.j());
  }
  
  private void c(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.a(69);
    this.d.q().a(localzka);
    boolean bool = false;
    StringBuilder localStringBuilder = new StringBuilder(20);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if ("wireframe".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            bool = zauj.aB((String)localObject);
          }
        }
        else if ("ser".equals(paramzcjy.q()))
        {
          b(paramzcjy, localzka);
        }
        else if ("bandFmts".equals(paramzcjy.q()))
        {
          this.d.e = paramzcjy.v();
        }
        else if ("axId".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append(" ");
            }
            localStringBuilder.append((String)localObject);
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (bool)
    {
      if (paramBoolean) {
        localzka.a(70);
      } else {
        localzka.a(72);
      }
    }
    else if (paramBoolean) {
      localzka.a(69);
    } else {
      localzka.a(71);
    }
    this.e.put(localzka, zs.a(localStringBuilder));
    this.d.d(localzka.j());
  }
  
  private void d(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.a(40);
    this.d.q().a(localzka);
    if (paramBoolean) {
      localzka.a(43);
    }
    String str = "standard";
    StringBuilder localStringBuilder = new StringBuilder(20);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("grouping".equals(paramzcjy.q()))
      {
        str = t(paramzcjy);
      }
      else
      {
        Object localObject;
        if ("varyColors".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localzka.k(zauj.aB((String)localObject));
          }
        }
        else if ("ser".equals(paramzcjy.q()))
        {
          b(paramzcjy, localzka);
        }
        else if ("dropLines".equals(paramzcjy.q()))
        {
          localzka.g(true);
          a(paramzcjy, localzka.U());
        }
        else if ("hiLowLines".equals(paramzcjy.q()))
        {
          localzka.c(true);
          a(paramzcjy, localzka.V());
        }
        else if ("upDownBars".equals(paramzcjy.q()))
        {
          localzka.i(true);
          a(paramzcjy, localzka);
        }
        else if ("axId".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append(" ");
            }
            localStringBuilder.append((String)localObject);
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject);
        }
        else if ("gapDepth".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            this.d.setGapDepth(zauj.F((String)localObject));
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    boolean bool = false;
    SeriesCollection localSeriesCollection = this.d.getNSeries();
    for (int m = 0; (m < localSeriesCollection.getCount()) && (!bool); m++)
    {
      Series localSeries = localSeriesCollection.get(m);
      if (localSeries.u() == localzka) {
        if (localSeries.x() == null) {
          bool = true;
        } else if (localSeries.x().getMarkerStyle() != 5) {
          bool = true;
        }
      }
    }
    if (paramBoolean) {
      localzka.a(43);
    } else {
      localzka.a(zauj.a(bool, str));
    }
    this.e.put(localzka, zs.a(localStringBuilder));
    this.d.d(localzka.j());
  }
  
  private void a(zcjy paramzcjy, zka paramzka)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("gapWidth".equals(paramzcjy.q()))
      {
        String str = t(paramzcjy);
        if (str != null) {
          paramzka.c(zauj.F(str));
        }
      }
      else if ("upBars".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramzka.u().c());
      }
      else if ("downBars".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramzka.v().c());
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private boolean a(zcjy paramzcjy, ShapePropertyCollection paramShapePropertyCollection)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return false;
    }
    boolean bool = false;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() == 1) && ("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        b(paramzcjy, paramShapePropertyCollection);
        bool = true;
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    return bool;
  }
  
  private void e(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    zka localzka = new zka(this.d.q());
    localzka.a(6);
    this.d.q().a(localzka);
    String str1 = "col";
    String str2 = "clustered";
    Object localObject1 = "box";
    StringBuilder localStringBuilder = new StringBuilder(20);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("barDir".equals(paramzcjy.q()))
      {
        str1 = t(paramzcjy);
      }
      else if ("grouping".equals(paramzcjy.q()))
      {
        str2 = t(paramzcjy);
      }
      else
      {
        Object localObject2;
        if ("varyColors".equals(paramzcjy.q()))
        {
          localObject2 = t(paramzcjy);
          if (localObject2 != null) {
            localzka.k(zauj.aB((String)localObject2));
          }
        }
        else if ("ser".equals(paramzcjy.q()))
        {
          b(paramzcjy, localzka);
        }
        else if ("overlap".equals(paramzcjy.q()))
        {
          localObject2 = t(paramzcjy);
          if (localObject2 != null) {
            localzka.e(zauj.F((String)localObject2));
          }
        }
        else if ("gapWidth".equals(paramzcjy.q()))
        {
          localObject2 = t(paramzcjy);
          if (localObject2 != null) {
            localzka.c(zauj.F((String)localObject2));
          }
        }
        else if ("gapDepth".equals(paramzcjy.q()))
        {
          localObject2 = t(paramzcjy);
          if (localObject2 != null) {
            this.d.setGapDepth(zauj.F((String)localObject2));
          }
        }
        else if ("axId".equals(paramzcjy.q()))
        {
          localObject2 = t(paramzcjy);
          if (localObject2 != null)
          {
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append(" ");
            }
            localStringBuilder.append((String)localObject2);
          }
        }
        else if ("shape".equals(paramzcjy.q()))
        {
          localObject2 = t(paramzcjy);
          if (localObject2 != null) {
            localObject1 = localObject2;
          }
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject2 = new DataLabels(this.d, this.d);
          a(paramzcjy, (DataLabels)localObject2, null, false);
          this.d.getNSeries().a(localzka, (DataLabels)localObject2);
        }
        else if ("serLines".equals(paramzcjy.q()))
        {
          a(paramzcjy, localzka.T());
          localzka.f(true);
        }
        else if ("extLst".equals(paramzcjy.q()))
        {
          localzka.a = paramzcjy.v();
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    localzka.b(zauj.a(str1, str2, paramBoolean, (String)localObject1));
    if ((paramBoolean) && (localObject1 != null))
    {
      if (localzka.d() == null) {
        localzka.a(new zpz(localzka));
      }
      localzka.d().b(zauj.X((String)localObject1));
    }
    this.e.put(localzka, zs.a(localStringBuilder));
    this.d.d(localzka.j());
  }
  
  private Series b(zcjy paramzcjy, zka paramzka)
    throws Exception
  {
    Series localSeries = new Series(this.c, this.d.getNSeries(), 0);
    localSeries.a(paramzka);
    String str1 = null;
    String str2 = null;
    PicFormatOption localPicFormatOption = null;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("idx".equals(paramzcjy.q()))
      {
        str1 = t(paramzcjy);
      }
      else if ("order".equals(paramzcjy.q()))
      {
        str2 = t(paramzcjy);
      }
      else if ("tx".equals(paramzcjy.q()))
      {
        i(paramzcjy, localSeries);
      }
      else
      {
        String str3;
        if ("explosion".equals(paramzcjy.q()))
        {
          str3 = t(paramzcjy);
          if (str3 != null) {
            localSeries.setExplosion(zauj.F(str3));
          }
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, localSeries.getShapeProperties());
        }
        else if ("extLst".equals(paramzcjy.q()))
        {
          a(paramzcjy, localSeries);
        }
        else if ("invertIfNegative".equals(paramzcjy.q()))
        {
          str3 = t(paramzcjy);
          if (str3 != null) {
            localSeries.getArea().setInvertIfNegative(zauj.aB(str3));
          }
        }
        else if (("marker".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localSeries.setShadow(a(paramzcjy, localSeries.getMarker()));
        }
        else if (("dPt".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          h(paramzcjy, localSeries);
        }
        else if (("dLbls".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          a(paramzcjy, localSeries.getDataLabels(), localSeries, false);
        }
        else if (("trendline".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          g(paramzcjy, localSeries);
        }
        else if (("errBars".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          f(paramzcjy, localSeries);
        }
        else if (("cat".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localSeries.b(s(paramzcjy));
        }
        else if (("val".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localSeries.a(s(paramzcjy));
        }
        else if (("xVal".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localSeries.b(s(paramzcjy));
        }
        else if (("yVal".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localSeries.a(s(paramzcjy));
        }
        else if (("bubbleSize".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localSeries.c(s(paramzcjy));
        }
        else if ("smooth".equals(paramzcjy.q()))
        {
          str3 = t(paramzcjy);
          if (str3 != null) {
            localSeries.setSmooth(zauj.aB(str3));
          }
        }
        else if ("bubble3D".equals(paramzcjy.q()))
        {
          str3 = t(paramzcjy);
          if (str3 != null) {
            localSeries.setHas3DEffect(zauj.aB(str3));
          }
        }
        else if ("shape".equals(paramzcjy.q()))
        {
          str3 = t(paramzcjy);
          if (str3 != null) {
            localSeries.c(zauj.X(str3));
          }
        }
        else if ("pictureOptions".equals(paramzcjy.q()))
        {
          localPicFormatOption = r(paramzcjy);
          if (localPicFormatOption != null) {
            localSeries.getArea().getFillFormat().getTextureFill().setPicFormatOption(localPicFormatOption);
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (str1 != null) {
      localSeries.a(zauj.F(str1));
    }
    if (localPicFormatOption != null) {
      localSeries.getArea().getFillFormat().getTextureFill().setPicFormatOption(localPicFormatOption);
    }
    if (str2 != null)
    {
      int m = zauj.F(str2);
      localSeries.e(m);
      this.d.getNSeries().a(localSeries);
    }
    else
    {
      this.d.getNSeries().a(localSeries);
    }
    zf.a(this.h, localSeries);
    return localSeries;
  }
  
  private void a(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("ext".equals(paramzcjy.q())) {
        b(paramzcjy, paramSeries);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    String str = paramzcjy.a("uri");
    switch (k.a(str))
    {
    case 1: 
    case 2: 
      break;
    default: 
      zf.a(paramSeries.b.b(), paramzcjy.v());
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("invertSolidFillFmt".equals(paramzcjy.q())) {
        d(paramzcjy, paramSeries);
      } else if ("datalabelsRange".equals(paramzcjy.q())) {
        c(paramzcjy, paramSeries);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void c(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    zjk localzjk = new zjk(this.d);
    while (zauz.a(paramzcjy)) {
      if ("f".equals(paramzcjy.q()))
      {
        String str1 = paramzcjy.j();
        if ((str1 != null) && (str1.charAt(0) != '(') && (str1.indexOf('!') == -1) && (str1.indexOf(',') != -1) && (str1.charAt(0) != '{')) {
          str1 = "{" + str1 + "}";
        }
        String str2 = str1;
        if (str2.indexOf("[0]!") != -1) {
          str2 = str2.substring(4);
        }
        try
        {
          localzjk.b(str2);
        }
        catch (Exception localException) {}
      }
      else if ("dlblRangeCache".equals(paramzcjy.q()))
      {
        a(paramzcjy, localzjk, true, false);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramSeries.getDataLabels().i = localzjk;
  }
  
  private void d(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("spPr".equals(paramzcjy.q())) {
        e(paramzcjy, paramSeries);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void e(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("solidFill".equals(paramzcjy.q()))
      {
        zaml localzaml = zakf.a(paramzcjy);
        if ((!localzaml.b()) && (paramSeries.getArea().getFillFormat().getFillType() == 2)) {
          paramSeries.getArea().getFillFormat().getSolidFill().b = localzaml;
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private PicFormatOption r(zcjy paramzcjy)
    throws Exception
  {
    PicFormatOption localPicFormatOption = new PicFormatOption();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str;
        if ("pictureFormat".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localPicFormatOption.setType(zauj.av(str));
          }
        }
        else if ("pictureStackUnit".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localPicFormatOption.setScale(zauj.C(str));
          }
        }
        else if ("applyToFront".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          localPicFormatOption.b(zauj.aB(str));
        }
        else if ("applyToSides".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          localPicFormatOption.a(zauj.aB(str));
        }
        else if ("applyToEnd".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          localPicFormatOption.c(zauj.aB(str));
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    return localPicFormatOption;
  }
  
  private void f(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    ErrorBar localErrorBar = new ErrorBar(paramSeries, true);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str;
        if ("errDir".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if ("y".equals(str)) {
            localErrorBar.a(true);
          } else {
            localErrorBar.a(false);
          }
        }
        else if ("errBarType".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localErrorBar.a(zauj.R(str));
          }
        }
        else if ("errValType".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localErrorBar.setType(zauj.S(str));
          }
        }
        else if (("plus".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localErrorBar.a(s(paramzcjy));
        }
        else if (("minus".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localErrorBar.b(s(paramzcjy));
        }
        else if ("val".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localErrorBar.setAmount(zauj.C(str));
          }
        }
        else if ("noEndCap".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localErrorBar.setShowMarkerTTop(!zauj.aB(str));
          }
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, localErrorBar.e());
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    paramSeries.a(localErrorBar);
  }
  
  private zjk s(zcjy paramzcjy)
    throws Exception
  {
    zjk localzjk = null;
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (k.a(paramzcjy.q()))
      {
      case 3: 
      case 4: 
      case 5: 
        localzjk = c(paramzcjy, this.d);
        break;
      case 6: 
        localzjk = new zjk(this.d);
        a(paramzcjy, localzjk, false, true);
        break;
      case 7: 
        localzjk = new zjk(this.d);
        a(paramzcjy, localzjk, true, true);
        break;
      default: 
        paramzcjy.a();
      }
    }
    return localzjk;
  }
  
  private static zjk c(zcjy paramzcjy, Chart paramChart)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    zjk localzjk = new zjk(paramChart);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() != 1) || (paramzcjy.o()))
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject1;
        switch (k.a(paramzcjy.q()))
        {
        case 8: 
          localObject1 = paramzcjy.j();
          if (!"".equals(localObject1))
          {
            if ((((String)localObject1).charAt(0) != '(') && (((String)localObject1).indexOf('!') == -1) && (((String)localObject1).indexOf(',') != -1) && (((String)localObject1).charAt(0) != '{')) {
              localObject1 = "{" + (String)localObject1 + "}";
            }
            Object localObject2 = localObject1;
            if (((String)localObject2).indexOf("[0]!") != -1) {
              localObject2 = ((String)localObject2).substring(4);
            }
            try
            {
              localzjk.b((String)localObject2);
            }
            catch (Exception localException) {}
          }
          break;
        case 9: 
          a(paramzcjy, localzjk, false, false);
          break;
        case 10: 
          a(paramzcjy, localzjk, true, false);
          break;
        case 11: 
          a(paramzcjy, localzjk);
          break;
        case 12: 
          localObject1 = new ArrayList();
          zf.a((ArrayList)localObject1, paramzcjy.j());
          localzjk.b = ((ArrayList)localObject1);
          if (localzjk.a() == 0) {
            localzjk.a(3);
          }
          break;
        default: 
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    return localzjk;
  }
  
  private static void a(zcjy paramzcjy, zjk paramzjk)
    throws Exception
  {
    paramzcjy.d();
    int m = 0;
    ArrayList localArrayList1 = new ArrayList();
    int n = -1;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        int i1;
        if ("lvl".equals(paramzcjy.q()))
        {
          n++;
          if (paramzcjy.o())
          {
            paramzcjy.a();
          }
          else
          {
            paramzcjy.d();
            i1 = -1;
            while (paramzcjy.s() != 4)
            {
              paramzcjy.k();
              if (paramzcjy.s() != 1)
              {
                paramzcjy.a();
              }
              else if ("pt".equals(paramzcjy.q()))
              {
                String str = null;
                int i3 = zp.a(paramzcjy.a("idx"));
                paramzcjy.d();
                while (paramzcjy.s() != 4)
                {
                  paramzcjy.k();
                  if ((paramzcjy.s() == 1) && ("v".equals(paramzcjy.q())) && (!paramzcjy.o())) {
                    str = paramzcjy.j();
                  } else {
                    paramzcjy.a();
                  }
                }
                paramzcjy.h();
                int i4;
                if (i3 >= localArrayList1.size()) {
                  for (i4 = localArrayList1.size() - 1; i4 < i3; i4++) {
                    zf.a(localArrayList1, "");
                  }
                }
                if (i3 - i1 > 1) {
                  for (i4 = i1 + 1; i4 < i3; i4++) {
                    if (n > 0) {
                      localArrayList1.set(i4, (String)localArrayList1.get(i4) + "\n");
                    }
                  }
                }
                if (n > 0) {
                  localArrayList1.set(i3, (String)localArrayList1.get(i3) + "\n");
                }
                if (str != null) {
                  localArrayList1.set(i3, (String)localArrayList1.get(i3) + str);
                }
                i1 = i3;
              }
              else
              {
                paramzcjy.a();
              }
            }
            paramzcjy.h();
          }
        }
        else if ("ptCount".equals(paramzcjy.q()))
        {
          m = zp.a(paramzcjy.a("val"));
          for (i1 = 0; i1 < m; i1++) {
            zf.a(localArrayList1, "");
          }
          paramzcjy.a();
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    ArrayList localArrayList2 = new ArrayList();
    for (int i2 = 0; i2 < localArrayList1.size(); i2++) {
      zf.a(localArrayList2, a((String)localArrayList1.get(i2), '\n'));
    }
    paramzjk.b = localArrayList2;
  }
  
  private static String a(String paramString, char paramChar)
  {
    while ((paramString.length() > 0) && (paramString.charAt(paramString.length() - 1) == paramChar)) {
      paramString = paramString.substring(0, 0 + (paramString.length() - 1));
    }
    return paramString;
  }
  
  private static void a(zcjy paramzcjy, zjk paramzjk, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    paramzcjy.d();
    int m = 0;
    ArrayList localArrayList = new ArrayList();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("pt".equals(paramzcjy.q()))
      {
        Object localObject = null;
        int i1 = zp.a(paramzcjy.a("idx"));
        paramzcjy.d();
        while (paramzcjy.s() != 4)
        {
          paramzcjy.k();
          if ((paramzcjy.s() == 1) && ("v".equals(paramzcjy.q())) && (!paramzcjy.o()))
          {
            String str = paramzcjy.j();
            localObject = str;
            if ((!paramBoolean1) && (zarb.b(str))) {
              localObject = Double.valueOf(zauj.C(str));
            }
          }
          else
          {
            paramzcjy.a();
          }
        }
        paramzcjy.h();
        if (i1 >= localArrayList.size()) {
          for (int i2 = localArrayList.size() - 1; i2 < i1; i2++) {
            zf.a(localArrayList, "");
          }
        }
        localArrayList.set(i1, localObject);
      }
      else if ("formatCode".equals(paramzcjy.q()))
      {
        paramzjk.a(paramzcjy.j());
      }
      else if ("ptCount".equals(paramzcjy.q()))
      {
        m = zp.a(paramzcjy.a("val"));
        for (int n = 0; n < m; n++) {
          zf.a(localArrayList, "");
        }
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    paramzjk.b = localArrayList;
    if ((paramBoolean2) || (paramzjk.c == null)) {
      if (paramBoolean1) {
        paramzjk.a(3);
      } else {
        paramzjk.a(1);
      }
    }
  }
  
  private void g(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    Trendline localTrendline = new Trendline(paramSeries);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("name".equals(paramzcjy.q()))
      {
        localTrendline.setName(paramzcjy.j());
      }
      else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        b(paramzcjy, localTrendline.e());
      }
      else
      {
        String str;
        if ("trendlineType".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localTrendline.a(zauj.Q(str));
          }
        }
        else if ("order".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localTrendline.setOrder(zauj.F(str));
          }
        }
        else if ("period".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localTrendline.o(zauj.F(str));
          }
        }
        else if ("forward".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localTrendline.setForward(zauj.C(str));
          }
        }
        else if ("backward".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localTrendline.a(zauj.C(str));
          }
        }
        else if ("intercept".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localTrendline.setIntercept(zauj.C(str));
          }
        }
        else if ("dispEq".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localTrendline.setDisplayEquation(zauj.aB(str));
          }
        }
        else if ("dispRSqr".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            localTrendline.setDisplayRSquared(zauj.aB(str));
          }
        }
        else if ("trendlineLbl".equals(paramzcjy.q()))
        {
          a(paramzcjy, localTrendline.getDataLabels());
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    paramSeries.getTrendLines().a(localTrendline);
  }
  
  private void a(zcjy paramzcjy, DataLabels paramDataLabels)
    throws Exception
  {
    paramzcjy.d();
    int m = 0;
    int n = 0;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if ("numFmt".equals(paramzcjy.q()))
        {
          m = 1;
          localObject = paramzcjy.a("formatCode");
          if (localObject != null) {
            paramDataLabels.d((String)localObject);
          }
          localObject = paramzcjy.a("sourceLinked");
          if (localObject != null) {
            paramDataLabels.n(zauj.aB((String)localObject));
          }
          paramzcjy.a();
        }
        else if ("txPr".equals(paramzcjy.q()))
        {
          n = 1;
          localObject = b(paramzcjy, this.d);
          if (paramDataLabels != null) {
            ((zru)localObject).a(paramDataLabels, this.c);
          }
        }
        else if ("tx".equals(paramzcjy.q()))
        {
          localObject = a(paramzcjy, this.d);
          if ((localObject != null) && (paramDataLabels != null)) {
            ((zru)localObject).a(paramDataLabels, this.c);
          }
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, paramDataLabels.getShapeProperties());
        }
        else if ("layout".equals(paramzcjy.q()))
        {
          localObject = u(paramzcjy);
          if (localObject != null) {
            ((zrb)localObject).a(this.d, paramDataLabels);
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (paramDataLabels == null) {
      b("trendlineLbl");
    } else if ((m == 0) && (n != 0)) {
      paramDataLabels.o(true);
    }
  }
  
  private void a(zcjy paramzcjy, DataLabels paramDataLabels, Series paramSeries, boolean paramBoolean)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    zru localzru = null;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str1;
        if (("dLbl".equals(paramzcjy.q())) && (paramSeries != null))
        {
          str1 = paramzcjy.b();
          DataLabels localDataLabels1 = a(new zcjy(str1, false), paramSeries, null, false);
          zf.a(localArrayList2, localDataLabels1);
          zf.a(localArrayList1, str1);
        }
        else if ("numFmt".equals(paramzcjy.q()))
        {
          bool2 = true;
          str1 = paramzcjy.a("formatCode");
          if (str1 != null) {
            paramDataLabels.d(str1);
          }
          str1 = paramzcjy.a("sourceLinked");
          if (str1 != null) {
            paramDataLabels.n(zauj.aB(str1));
          }
          paramzcjy.a();
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          bool1 = true;
          if ((!paramBoolean) && (paramDataLabels.w() == null)) {
            b(paramzcjy, paramDataLabels.getShapeProperties());
          } else {
            paramzcjy.a();
          }
        }
        else if ("txPr".equals(paramzcjy.q()))
        {
          localzru = b(paramzcjy, this.d);
          localzru.a(paramDataLabels, this.c);
        }
        else if ("dLblPos".equals(paramzcjy.q()))
        {
          str1 = t(paramzcjy);
          if (str1 != null) {
            paramDataLabels.n(zauj.O(str1));
          }
        }
        else if ("delete".equals(paramzcjy.q()))
        {
          str1 = t(paramzcjy);
          if (str1 != null) {
            paramDataLabels.setDeleted(zauj.aB(str1));
          }
        }
        else
        {
          boolean bool4;
          if ("showLegendKey".equals(paramzcjy.q()))
          {
            str1 = t(paramzcjy);
            if (str1 != null)
            {
              bool4 = zauj.aB(str1);
              paramDataLabels.m(bool4);
            }
          }
          else if ("showVal".equals(paramzcjy.q()))
          {
            str1 = t(paramzcjy);
            if (str1 != null)
            {
              bool4 = zauj.aB(str1);
              paramDataLabels.a(1, bool4);
            }
          }
          else if ("showBubbleSize".equals(paramzcjy.q()))
          {
            str1 = t(paramzcjy);
            if ((str1 != null) && (paramDataLabels != null)) {
              paramDataLabels.setShowBubbleSize(zauj.aB(str1));
            }
          }
          else if ("showCatName".equals(paramzcjy.q()))
          {
            str1 = t(paramzcjy);
            if (str1 != null)
            {
              bool4 = zauj.aB(str1);
              paramDataLabels.a(3, bool4);
            }
          }
          else if ("showSerName".equals(paramzcjy.q()))
          {
            str1 = t(paramzcjy);
            if (str1 != null)
            {
              bool4 = zauj.aB(str1);
              paramDataLabels.a(5, bool4);
            }
          }
          else if ("showPercent".equals(paramzcjy.q()))
          {
            str1 = t(paramzcjy);
            if (str1 != null)
            {
              bool4 = zauj.aB(str1);
              paramDataLabels.a(2, bool4);
            }
          }
          else if ("separator".equals(paramzcjy.q()))
          {
            paramzcjy.a(1);
            str1 = paramzcjy.j();
            if (str1 != null)
            {
              bool3 = true;
              paramDataLabels.setSeparatorValue(str1);
            }
            paramzcjy.a(0);
          }
          else if (("showLeaderLines".equals(paramzcjy.q())) && (paramSeries != null))
          {
            str1 = t(paramzcjy);
            paramSeries.setHasLeaderLines(zauj.aB(str1));
          }
          else if ("showDataLabelsRange".equals(paramzcjy.q()))
          {
            str1 = t(paramzcjy);
            paramDataLabels.setShowCellRange(zauj.b(str1, false));
          }
          else if ("leaderLines".equals(paramzcjy.q()))
          {
            a(paramzcjy, paramSeries.u().W());
          }
          else if ("extLst".equals(paramzcjy.q()))
          {
            if (paramzcjy.o())
            {
              paramzcjy.a();
            }
            else
            {
              paramzcjy.d();
              while (zauz.a(paramzcjy)) {
                if ("ext".equals(paramzcjy.q()))
                {
                  str1 = paramzcjy.a("uri");
                  if ("{CE6537A1-D6FC-4f65-9D91-7224C49458BB}".equals(str1))
                  {
                    a(paramzcjy, paramDataLabels, paramSeries, true);
                  }
                  else
                  {
                    if (paramDataLabels.k == null) {
                      paramDataLabels.k = new ArrayList();
                    }
                    zf.a(paramDataLabels.k, paramzcjy.v());
                  }
                }
                else
                {
                  paramzcjy.a();
                }
              }
            }
          }
          else
          {
            paramzcjy.a();
          }
        }
      }
    }
    if (!paramBoolean) {
      for (int m = 0; m < localArrayList2.size(); m++)
      {
        DataLabels localDataLabels2 = (DataLabels)localArrayList2.get(m);
        String str2 = (String)localArrayList1.get(m);
        a(str2, paramDataLabels, localDataLabels2, bool1, bool2, bool3, localzru);
      }
    }
    paramzcjy.h();
  }
  
  private DataLabels a(zcjy paramzcjy, Series paramSeries, DataLabels paramDataLabels, boolean paramBoolean)
    throws Exception
  {
    ChartPoint localChartPoint = null;
    paramzcjy.d();
    int m = 0;
    int n = 0;
    while (zauz.a(paramzcjy))
    {
      Object localObject;
      if ("idx".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        if (localObject != null)
        {
          int i1 = zauj.F((String)localObject);
          localChartPoint = paramSeries.getPoints().a(i1);
          paramDataLabels = localChartPoint.getDataLabels();
        }
      }
      else if ("delete".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        if (localObject != null) {
          paramDataLabels.setDeleted(zauj.aB((String)localObject));
        } else {
          paramDataLabels.setDeleted(true);
        }
      }
      else if ("numFmt".equals(paramzcjy.q()))
      {
        m = 1;
        paramDataLabels.o(true);
        localObject = paramzcjy.a("formatCode");
        if (localObject != null) {
          paramDataLabels.d((String)localObject);
        }
        localObject = paramzcjy.a("sourceLinked");
        if (localObject != null) {
          paramDataLabels.n(zauj.aB((String)localObject));
        }
        paramzcjy.a();
      }
      else if ("showLegendKey".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        if ((localObject != null) && (paramDataLabels != null)) {
          paramDataLabels.setShowLegendKey(zauj.aB((String)localObject));
        }
      }
      else if ("showVal".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        if ((localObject != null) && (paramDataLabels != null)) {
          paramDataLabels.setShowValue(zauj.aB((String)localObject));
        }
      }
      else if ("showBubbleSize".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        if ((localObject != null) && (paramDataLabels != null)) {
          paramDataLabels.setShowBubbleSize(zauj.aB((String)localObject));
        }
      }
      else if ("showCatName".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        if ((localObject != null) && (paramDataLabels != null)) {
          paramDataLabels.setShowCategoryName(zauj.aB((String)localObject));
        }
      }
      else if ("showSerName".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        if ((localObject != null) && (paramDataLabels != null)) {
          paramDataLabels.setShowSeriesName(zauj.aB((String)localObject));
        }
      }
      else if ("showPercent".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        if ((localObject != null) && (paramDataLabels != null)) {
          paramDataLabels.setShowPercentage(zauj.aB((String)localObject));
        }
      }
      else if ("showDataLabelsRange".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        if (paramDataLabels != null) {
          paramDataLabels.setShowCellRange(zauj.b((String)localObject, false));
        }
      }
      else if ("separator".equals(paramzcjy.q()))
      {
        paramzcjy.a(1);
        localObject = paramzcjy.j();
        if ((localObject != null) && (paramDataLabels != null)) {
          paramDataLabels.setSeparatorValue((String)localObject);
        }
        paramzcjy.a(0);
      }
      else if ("txPr".equals(paramzcjy.q()))
      {
        n = 1;
        localObject = b(paramzcjy, this.d);
        if (paramDataLabels != null) {
          ((zru)localObject).a(paramDataLabels, this.c);
        }
      }
      else if ("tx".equals(paramzcjy.q()))
      {
        localObject = a(paramzcjy, this.d);
        if ((localObject != null) && (paramDataLabels != null)) {
          ((zru)localObject).a(paramDataLabels, this.c);
        }
      }
      else if ("dLblPos".equals(paramzcjy.q()))
      {
        localObject = t(paramzcjy);
        if (localObject != null)
        {
          paramDataLabels.n(zauj.O((String)localObject));
          paramDataLabels.o(paramDataLabels.getPosition());
        }
      }
      else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        b(paramzcjy, paramDataLabels.getShapeProperties());
      }
      else if (("layout".equals(paramzcjy.q())) && (paramSeries != null))
      {
        localObject = u(paramzcjy);
        if (localObject != null) {
          if (!paramBoolean) {
            ((zrb)localObject).a(this.d, paramDataLabels);
          } else {
            ((zrb)localObject).b(this.d, paramDataLabels);
          }
        }
      }
      else if ("extLst".equals(paramzcjy.q()))
      {
        paramzcjy.d();
        while (zauz.a(paramzcjy)) {
          if ("ext".equals(paramzcjy.q()))
          {
            localObject = paramzcjy.a("uri");
            if ("{CE6537A1-D6FC-4f65-9D91-7224C49458BB}".equals(localObject)) {
              a(paramzcjy, paramSeries, paramDataLabels, true);
            } else {
              paramzcjy.a();
            }
          }
          else
          {
            paramzcjy.a();
          }
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    if (paramBoolean) {
      return paramDataLabels;
    }
    if (paramDataLabels == null) {
      b("dLbl");
    } else if ((m == 0) && (n != 0)) {
      paramDataLabels.o(true);
    }
    return paramDataLabels;
  }
  
  private void a(String paramString, DataLabels paramDataLabels1, DataLabels paramDataLabels2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, zru paramzru)
  {
    if ((paramString.indexOf("txPr") < 0) && (paramString.indexOf("spPr") < 0) && (paramBoolean1)) {
      paramDataLabels2.b(paramDataLabels1, null);
    }
    if ((paramString.indexOf("txPr") < 0) && (paramString.indexOf("spPr") < 0) && (paramzru != null)) {
      paramzru.a(paramDataLabels2, this.c);
    }
    if ((paramString.indexOf("txPr") < 0) && (paramString.indexOf("spPr") < 0) && (paramString.indexOf("numFmt") < 0) && (paramBoolean2)) {
      paramDataLabels2.a(paramDataLabels1);
    }
    if ((paramString.indexOf("showLegendKey") < 0) && (paramString.indexOf("showVal") < 0) && (paramString.indexOf("showBubbleSize") < 0) && (paramString.indexOf("showCatName") < 0) && (paramString.indexOf("showSerName") < 0) && (paramString.indexOf("showPercent") < 0) && (paramString.indexOf("dLblPos") < 0)) {
      paramDataLabels2.c(paramDataLabels1);
    }
    if ((paramString.indexOf("separator") < 0) && (paramBoolean3)) {
      paramDataLabels2.b(paramDataLabels1);
    }
  }
  
  private void h(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    ChartPoint localChartPoint = new ChartPoint(paramSeries, 0);
    String str1 = null;
    paramzcjy.d();
    int m = 0;
    PicFormatOption localPicFormatOption = null;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("idx".equals(paramzcjy.q()))
      {
        str1 = t(paramzcjy);
      }
      else
      {
        String str2;
        if ("explosion".equals(paramzcjy.q()))
        {
          str2 = t(paramzcjy);
          if (str2 != null) {
            localChartPoint.setExplosion(zauj.F(str2));
          }
          m = 1;
        }
        else if ("invertIfNegative".equals(paramzcjy.q()))
        {
          str2 = t(paramzcjy);
          localChartPoint.getArea().setInvertIfNegative(zauj.aB(str2));
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, localChartPoint.getShapeProperties());
        }
        else if (("marker".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localChartPoint.setShadow(a(paramzcjy, localChartPoint.getMarker()));
        }
        else if (("pictureOptions".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localPicFormatOption = r(paramzcjy);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (str1 == null) {
      b("dpt");
    }
    int n = zauj.F(str1);
    if (m == 0) {
      localChartPoint.setExplosion(paramSeries.getExplosion());
    }
    localChartPoint.a = n;
    if (localPicFormatOption != null) {
      localChartPoint.getArea().getFillFormat().getTextureFill().setPicFormatOption(localPicFormatOption);
    }
    paramSeries.getPoints().a(localChartPoint);
  }
  
  private boolean a(zcjy paramzcjy, Marker paramMarker)
    throws Exception
  {
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str;
        if ("symbol".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            paramMarker.setMarkerStyle(zauj.T(str));
          }
        }
        else if ("size".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            paramMarker.setMarkerSize(zauj.F(str));
          }
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, paramMarker.i());
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    return paramMarker.i().h();
  }
  
  private void i(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() != 1) || (paramzcjy.o()))
      {
        paramzcjy.a();
      }
      else if ("v".equals(paramzcjy.q()))
      {
        paramSeries.a(zauj.b(paramzcjy.j()));
      }
      else if ("strRef".equals(paramzcjy.q()))
      {
        paramzcjy.d();
        while (paramzcjy.s() != 4)
        {
          paramzcjy.k();
          if ((paramzcjy.s() == 1) && ("f".equals(paramzcjy.q())) && (!paramzcjy.o()))
          {
            String str = paramzcjy.j();
            try
            {
              if (str.toUpperCase().indexOf("#REF") == -1) {
                paramSeries.a("=" + str);
              }
            }
            catch (Exception localException)
            {
              zl.b(localException);
            }
          }
          else if ((paramzcjy.s() == 1) && ("strCache".equals(paramzcjy.q())) && (!paramzcjy.o()))
          {
            j(paramzcjy, paramSeries);
          }
          else
          {
            paramzcjy.a();
          }
        }
        paramzcjy.h();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void j(zcjy paramzcjy, Series paramSeries)
    throws Exception
  {
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() != 1) || (paramzcjy.o()))
      {
        paramzcjy.a();
      }
      else if ("pt".equals(paramzcjy.q()))
      {
        paramzcjy.d();
        while (paramzcjy.s() != 4)
        {
          paramzcjy.k();
          if ((paramzcjy.s() != 1) || (paramzcjy.o()))
          {
            paramzcjy.a();
          }
          else if ("v".equals(paramzcjy.q()))
          {
            String str = paramzcjy.j();
            if (paramSeries.l() == null) {
              paramSeries.a(str);
            } else {
              paramSeries.c = str;
            }
          }
          else
          {
            paramzcjy.a();
          }
        }
        paramzcjy.h();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, Title paramTitle, boolean paramBoolean)
    throws Exception
  {
    paramTitle.m(false);
    zru localzru1 = null;
    zru localzru2 = null;
    int m = 0;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if ("overlay".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if ("1".equals(localObject)) {
            paramTitle.setOverLay(true);
          } else {
            paramTitle.setOverLay(false);
          }
        }
        else if (paramzcjy.o())
        {
          paramzcjy.a();
        }
        else if ("tx".equals(paramzcjy.q()))
        {
          localzru1 = a(paramzcjy, this.d);
          m = 1;
        }
        else if ("txPr".equals(paramzcjy.q()))
        {
          localzru2 = b(paramzcjy, this.d);
        }
        else if ("layout".equals(paramzcjy.q()))
        {
          localObject = u(paramzcjy);
          if (localObject != null) {
            ((zrb)localObject).a(this.d, paramTitle);
          }
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, paramTitle.getShapeProperties());
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (localzru2 != null) {
      localzru2.a(paramTitle, this.c, paramBoolean);
    }
    if (m != 0)
    {
      if (localzru1 != null) {
        localzru1.a(localzru2 == null ? null : localzru2.g, paramTitle, this.c, paramBoolean);
      }
      if ((paramTitle.E() == null) && (paramTitle.getText() == null)) {
        paramTitle.setText("");
      }
    }
    else
    {
      paramTitle.setAutoText(true);
    }
    if ((localzru2 == null) && (localzru1 == null)) {
      if (paramBoolean)
      {
        paramTitle.setAutoText(true);
        if (!this.d.getChartArea().getFont().f(17)) {
          paramTitle.getFont().setBold(true);
        }
        if (this.d.getChartArea().getFont().f(12)) {
          paramTitle.getFont().setDoubleSize(this.d.getChartArea().getFont().getDoubleSize() * 1.2D);
        } else {
          switch (this.d.getStyle())
          {
          case 41: 
          case 42: 
          case 43: 
          case 44: 
          case 45: 
          case 46: 
          case 47: 
          case 48: 
            paramTitle.getFont().setDoubleSize(18.0D);
            paramTitle.getFont().setColor(Color.getWhite());
            break;
          case -1: 
          case 2: 
            paramTitle.getFont().setDoubleSize(18.0D);
            break;
          default: 
            paramTitle.getFont().setDoubleSize(18.0D);
            break;
          }
        }
      }
      else
      {
        switch (this.d.getStyle())
        {
        case 41: 
        case 42: 
        case 43: 
        case 44: 
        case 45: 
        case 46: 
        case 47: 
        case 48: 
          paramTitle.getFont().setColor(Color.getWhite());
          break;
        }
      }
    }
  }
  
  private static String t(zcjy paramzcjy)
    throws Exception
  {
    String str = paramzcjy.a("val");
    paramzcjy.a();
    return str;
  }
  
  private void b(zcjy paramzcjy, ShapePropertyCollection paramShapePropertyCollection)
    throws Exception
  {
    zakq localzakq = new zakq(paramShapePropertyCollection, this.a, this.d, this.g);
    localzakq.a(paramzcjy, paramShapePropertyCollection.a);
  }
  
  private zrb u(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    zrb localzrb = null;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() == 1) && ("manualLayout".equals(paramzcjy.q())) && (!paramzcjy.o())) {
        localzrb = v(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    return localzrb;
  }
  
  private zrb v(zcjy paramzcjy)
    throws Exception
  {
    zrb localzrb = new zrb();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("layoutTarget".equals(paramzcjy.q())) {
        localzrb.a = t(paramzcjy);
      } else if ("xMode".equals(paramzcjy.q())) {
        localzrb.b = t(paramzcjy);
      } else if ("yMode".equals(paramzcjy.q())) {
        localzrb.c = t(paramzcjy);
      } else if ("wMode".equals(paramzcjy.q())) {
        localzrb.d = t(paramzcjy);
      } else if ("hMode".equals(paramzcjy.q())) {
        localzrb.e = t(paramzcjy);
      } else if ("x".equals(paramzcjy.q())) {
        localzrb.f = t(paramzcjy);
      } else if ("y".equals(paramzcjy.q())) {
        localzrb.g = t(paramzcjy);
      } else if ("w".equals(paramzcjy.q())) {
        localzrb.h = t(paramzcjy);
      } else if ("h".equals(paramzcjy.q())) {
        localzrb.i = t(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    return localzrb;
  }
  
  static zru a(zcjy paramzcjy, Chart paramChart)
    throws Exception
  {
    zru localzru = null;
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (k.a(paramzcjy.q()))
      {
      case 13: 
        localzru = b(paramzcjy, paramChart);
        break;
      case 3: 
      case 4: 
      case 5: 
      case 14: 
        zjk localzjk = c(paramzcjy, paramChart);
        if ((localzjk.b != null) || (localzjk.q() != null))
        {
          localzru = new zru();
          localzru.a(localzjk, paramChart);
        }
        break;
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      default: 
        paramzcjy.a();
      }
    }
    return localzru;
  }
  
  static zru b(zcjy paramzcjy, Chart paramChart)
    throws Exception
  {
    int m = paramChart.f();
    zru localzru = new zru();
    paramzcjy.d();
    boolean bool = true;
    Object localObject = null;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("bodyPr".equals(paramzcjy.q()))
      {
        a(paramzcjy, localzru);
      }
      else if ("p".equals(paramzcjy.q()))
      {
        zpw localzpw = a(paramzcjy, localzru, bool, (zpw)localObject, m, paramChart);
        if (bool) {
          bool = false;
        }
        localObject = localzpw;
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    return localzru;
  }
  
  static void a(zcjy paramzcjy, zru paramzru)
    throws Exception
  {
    String str1 = paramzcjy.a("rot");
    String str2 = paramzcjy.a("vert");
    if (str2 == null) {
      str2 = "horz";
    }
    if (str2 != null) {
      switch (k.a(str2))
      {
      case 15: 
        paramzru.b(true);
        paramzru.a = -90;
        break;
      case 16: 
        paramzru.a(true);
        paramzru.a = 255;
        paramzru.j = 1;
        break;
      case 17: 
        paramzru.a(true);
        paramzru.a = 255;
        paramzru.j = 2;
        break;
      default: 
        if (str1 != null)
        {
          int m = zauj.F(str1) / -60000;
          if (Math.abs(m) < 720) {
            paramzru.a = (m % 360);
          }
        }
        break;
      }
    }
    String str3 = paramzcjy.a("wrap");
    paramzru.e = (!"none".equals(str3));
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("spAutoFit".equals(paramzcjy.q()))
      {
        paramzru.f = true;
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  static zpw a(zcjy paramzcjy, zru paramzru, boolean paramBoolean, zpw paramzpw, int paramInt, Chart paramChart)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    zpw localzpw = null;
    Object localObject = null;
    paramzcjy.d();
    zrn localzrn;
    while (zauz.a(paramzcjy)) {
      if ("pPr".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramzru, paramInt, paramChart);
      }
      else if ("r".equals(paramzcjy.q()))
      {
        localzrn = a(paramzcjy, paramInt, paramChart);
        if (paramzru.i == null) {
          paramzru.i = new ArrayList();
        }
        zf.a(paramzru.i, localzrn);
        if (localObject == null) {
          localObject = localzrn;
        }
      }
      else if ("br".equals(paramzcjy.q()))
      {
        localzrn = new zrn();
        localzrn.b = "\n";
        if (paramzru.i == null) {
          paramzru.i = new ArrayList();
        }
        zf.a(paramzru.i, localzrn);
        paramzcjy.a();
      }
      else if ("defRPr".equals(paramzcjy.q()))
      {
        paramzru.g = b(paramzcjy, paramInt, paramChart);
        if (paramzru.g == null) {
          paramzru.h = true;
        }
      }
      else if ("fld".equals(paramzcjy.q()))
      {
        localzrn = a(paramzcjy, paramInt, paramChart);
        if (localzrn.c != null) {
          switch (k.a(localzrn.c))
          {
          case 18: 
            localzrn.b = "[SERIES NAME]";
            break;
          case 19: 
            localzrn.b = "[CATEGORY NAME]";
            break;
          case 20: 
            localzrn.b = "[VALUE]";
            break;
          case 21: 
            localzrn.b = "[CELLRANGE]";
            break;
          case 22: 
            localzrn.b = "[PERCENTAGE]";
          }
        }
        if (paramzru.i == null) {
          paramzru.i = new ArrayList();
        }
        zf.a(paramzru.i, localzrn);
        if (localObject == null) {
          localObject = localzrn;
        }
      }
      else if ("endParaRPr".equals(paramzcjy.q()))
      {
        if (localObject == null) {
          localzpw = b(paramzcjy, paramInt, paramChart);
        } else {
          paramzru.k = paramzcjy.v();
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    if (!paramBoolean) {
      if (localObject != null)
      {
        if (paramzpw == null)
        {
          ((zrn)localObject).b = ("\n" + ((zrn)localObject).b);
        }
        else
        {
          localzrn = new zrn();
          localzrn.b = "\n";
          localzrn.a = paramzpw;
          if (paramzru.i == null) {
            paramzru.i = new ArrayList();
          }
          paramzru.i.add(0, localzrn);
        }
      }
      else
      {
        localzrn = new zrn();
        localzrn.b = "\n";
        localzrn.a = localzpw;
        if (paramzru.i == null) {
          paramzru.i = new ArrayList();
        }
        zf.a(paramzru.i, localzrn);
      }
    }
    return localzpw;
  }
  
  private static void a(zcjy paramzcjy, zru paramzru, int paramInt, Chart paramChart)
    throws Exception
  {
    String str1 = paramzcjy.a("rtl");
    String str2 = paramzcjy.a("algn");
    String str3 = paramzcjy.a("marL");
    String str4 = paramzcjy.a("indent");
    if ((str1 != null) && ("1".equals(str1))) {
      paramzru.j = 2;
    }
    if (str2 != null)
    {
      int m = zauj.N(str2);
      paramzru.a(zauj.N(str2));
    }
    if (str3 != null) {
      paramzru.b(zauj.F(str3));
    }
    if (str4 != null) {
      paramzru.c(zauj.F(str4));
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("defRPr".equals(paramzcjy.q()))
      {
        paramzru.g = b(paramzcjy, paramInt, paramChart);
        if (paramzru.g == null) {
          paramzru.h = true;
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private static zrn a(zcjy paramzcjy, int paramInt, Chart paramChart)
    throws Exception
  {
    zrn localzrn = new zrn();
    localzrn.c = paramzcjy.a("type", null);
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("rPr".equals(paramzcjy.q()))
      {
        zpw localzpw = b(paramzcjy, paramInt, paramChart);
        localzrn.a = localzpw;
      }
      else if ("t".equals(paramzcjy.q()))
      {
        paramzcjy.a(1);
        localzrn.b = zauj.b(paramzcjy.j());
        paramzcjy.a(0);
      }
      else
      {
        paramzcjy.a();
      }
    }
    return localzrn;
  }
  
  private static zpw b(zcjy paramzcjy, int paramInt, Chart paramChart)
    throws Exception
  {
    zpw localzpw = new zpw();
    int m = 0;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("lang".equals(paramzcjy.q()))
        {
          localzpw.b(paramzcjy.t());
          paramInt = zamr.a(paramzcjy.t());
          m = 1;
        }
        else if ("altLang".equals(paramzcjy.q()))
        {
          localzpw.c(paramzcjy.t());
          paramInt = zamr.a(paramzcjy.t());
          m = 1;
        }
        else if ("sz".equals(paramzcjy.q()))
        {
          localzpw.f(zauj.F(paramzcjy.t()) / 5);
        }
        else if ("b".equals(paramzcjy.q()))
        {
          localzpw.b("1".equals(paramzcjy.t()));
        }
        else if ("i".equals(paramzcjy.q()))
        {
          localzpw.a("1".equals(paramzcjy.t()));
        }
        else if ("u".equals(paramzcjy.q()))
        {
          localzpw.a(zauj.A(paramzcjy.t()));
        }
        else if ("strike".equals(paramzcjy.q()))
        {
          if ("sngStrike".equals(paramzcjy.t())) {
            localzpw.c(true);
          }
          if ("dblStrike".equals(paramzcjy.t())) {
            localzpw.d(true);
          }
        }
        else if ("baseline".equals(paramzcjy.q()))
        {
          double d1 = zauj.C(paramzcjy.t());
          if (d1 != 0.0D)
          {
            if (d1 > 10000.0D) {
              localzpw.f(true);
            } else if (d1 < -10000.0D) {
              localzpw.e(true);
            }
            localzpw.b((int)d1);
          }
        }
        else if ("cap".equals(paramzcjy.q()))
        {
          if ("small".equals(paramzcjy.t())) {
            localzpw.h(true);
          } else if ("all".equals(paramzcjy.t())) {
            localzpw.i(true);
          }
        }
        else if (("normalizeH".equals(paramzcjy.q())) && (zauj.aB(paramzcjy.t())))
        {
          localzpw.g(true);
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      if ((localzpw.t()) && (m == 0)) {
        return null;
      }
      return localzpw;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("solidFill".equals(paramzcjy.q()))
      {
        localzpw.a(zakf.a(paramzcjy));
      }
      else if ("noFill".equals(paramzcjy.q()))
      {
        localzpw.i().a(true);
        paramzcjy.a();
      }
      else
      {
        String str;
        if ("latin".equals(paramzcjy.q()))
        {
          str = paramzcjy.a("typeface");
          if ((str != null) && (localzpw.h() == null))
          {
            localzpw.d(a(str, paramInt, paramChart));
            localzpw.a(a(str));
          }
          paramzcjy.a();
        }
        else if ("ea".equals(paramzcjy.q()))
        {
          str = paramzcjy.a("typeface");
          if ((str != null) && (zamr.b(paramInt)) && ((localzpw.h() == null) || (localzpw.h().startsWith("("))))
          {
            localzpw.d(a(str, paramInt, paramChart));
            localzpw.a(a(str));
          }
          paramzcjy.a();
        }
        else if ("cs".equals(paramzcjy.q()))
        {
          str = paramzcjy.a("typeface");
          if ((str != null) && (localzpw.h() == null))
          {
            localzpw.d(a(str, paramInt, paramChart));
            localzpw.a(a(str));
          }
          paramzcjy.a();
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    if (localzpw.t()) {
      return null;
    }
    return localzpw;
  }
  
  private static String a(String paramString, int paramInt, Chart paramChart)
  {
    if ((paramString != null) && (paramChart != null))
    {
      if (paramString.indexOf("+mj-") >= 0) {
        return paramChart.O().f.b(paramInt, true);
      }
      if (paramString.indexOf("+mn-") >= 0) {
        return paramChart.O().f.b(paramInt, false);
      }
    }
    return paramString;
  }
  
  private static String a(String paramString)
  {
    if (paramString != null)
    {
      if (paramString.indexOf("+mj-") >= 0) {
        return "major";
      }
      if (paramString.indexOf("+mn-") >= 0) {
        return "minor";
      }
    }
    return null;
  }
  
  private void b(String paramString)
  {
    throw new CellsException(6, "Miss or invalid idx element of " + paramString);
  }
  
  private void a(zqd paramzqd1, zqd paramzqd2)
  {
    if (paramzqd1.e != null) {
      paramzqd2.a.setCrossType(zauj.w(paramzqd1.e));
    }
    if (paramzqd1.f != null) {
      paramzqd2.a.c(zauj.C(paramzqd1.f));
    }
    if (paramzqd1.g == null)
    {
      if (ChartCollection.p(this.d.getType())) {
        paramzqd2.a.setAxisBetweenCategories(false);
      }
    }
    else {
      paramzqd2.a.setAxisBetweenCategories("between".equals(paramzqd1.g));
    }
  }
  
  private zqd c(String paramString)
  {
    for (int m = 0; m < this.f.size(); m++)
    {
      zqd localzqd = (zqd)this.f.get(m);
      if (zw.b(localzqd.c, paramString)) {
        return localzqd;
      }
    }
    return null;
  }
  
  private zqd a(zqd paramzqd)
  {
    for (int m = 0; m < this.f.size(); m++)
    {
      zqd localzqd = (zqd)this.f.get(m);
      if (zw.b(localzqd.c, paramzqd.d))
      {
        localzqd.b = paramzqd.a;
        paramzqd.b = localzqd.a;
        return localzqd;
      }
    }
    return null;
  }
  
  private Axis d(String paramString)
  {
    int m = 0;
    if ("catAx".equals(paramString)) {
      m = 0;
    } else if ("valAx".equals(paramString)) {
      m = 1;
    } else if ("dateAx".equals(paramString)) {
      m = 0;
    } else if ("serAx".equals(paramString)) {
      m = 2;
    }
    Axis localAxis = new Axis(m, true, this.d);
    if ("dateAx".equals(paramString)) {
      localAxis.setCategoryType(2);
    } else if ("catAx".equals(paramString)) {
      localAxis.setCategoryType(1);
    }
    localAxis.setMajorTickMark(3);
    localAxis.setMinorTickMark(2);
    return localAxis;
  }
  
  private void a(zcjy paramzcjy, ChartDataTable paramChartDataTable)
    throws Exception
  {
    paramChartDataTable.setShowLegendKey(false);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if ("showHorzBorder".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            paramChartDataTable.setHasBorderHorizontal(zauj.aB((String)localObject));
          }
        }
        else if ("showVertBorder".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            paramChartDataTable.setHasBorderVertical(zauj.aB((String)localObject));
          }
        }
        else if ("showOutline".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            paramChartDataTable.setHasBorderOutline(zauj.aB((String)localObject));
          }
        }
        else if ("showKeys".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            paramChartDataTable.setShowLegendKey(zauj.aB((String)localObject));
          }
        }
        else if ("txPr".equals(paramzcjy.q()))
        {
          localObject = b(paramzcjy, this.d);
          if (((zru)localObject).g != null)
          {
            ((zru)localObject).a(this.d, false);
            paramChartDataTable.a(zauj.a(((zru)localObject).g, this.c));
          }
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, paramChartDataTable.d());
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private void c()
  {
    boolean bool = false;
    int m = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    for (int n = 0; n < this.d.i.getCount(); n++)
    {
      zka localzka = this.d.i.a(n);
      if (b(localzka.j())) {
        localObject1 = localzka;
      } else if (c(localzka.j())) {
        localObject2 = localzka;
      } else {
        m = 1;
      }
    }
    if ((m != 0) && ((localObject1 != null) || (localObject2 != null)))
    {
      n = 0;
      if ((localObject1 != null) && (!((zka)localObject1).m())) {
        n = 1;
      }
      if ((localObject2 != null) && (!((zka)localObject2).m())) {
        n = 1;
      }
      if (n != 0)
      {
        bool = true;
        this.d.getCategoryAxis().setVisible(false);
        this.d.getValueAxis().setVisible(false);
      }
    }
    n = Math.min(this.f.size(), 4);
    Object localObject3;
    Object localObject4;
    for (int i1 = 0; i1 < n; i1++)
    {
      localObject3 = (zqd)this.f.get(i1);
      if (((zqd)localObject3).b == null)
      {
        localObject4 = a((zqd)localObject3);
        if (localObject4 == null) {
          throw new CellsException(6, "axis " + ((zqd)localObject3).d + " not found!");
        }
        a((zqd)localObject3, (zqd)localObject4);
        a((zqd)localObject4, (zqd)localObject3);
        if (((zqd)localObject3).a.b() == 2)
        {
          this.d.a(false, ((zqd)localObject3).a);
        }
        else
        {
          this.d.a(bool, ((zqd)localObject3).a, ((zqd)localObject4).a);
          ((zqd)localObject3).h = (!bool);
          ((zqd)localObject4).h = (!bool);
          if (!bool) {
            bool = true;
          }
        }
      }
    }
    zc localzc = zg.a(this.e);
    while (localzc.c())
    {
      localObject3 = (zka)localzc.a();
      localObject4 = (String)localzc.b();
      if ((localObject4 != null) && (!"".equals(localObject4)))
      {
        String[] arrayOfString = zw.d((String)localObject4, ' ');
        zqd localzqd1 = c(arrayOfString[0]);
        zqd localzqd2 = c(arrayOfString[1]);
        if (localzqd1 == null) {
          throw new CellsException(6, "axis " + arrayOfString[0] + " not found!");
        }
        if (localzqd2 == null) {
          throw new CellsException(6, "axis " + arrayOfString[1] + " not found!");
        }
        if (((zka)localObject3).m() != (!localzqd1.h)) {
          ((zka)localObject3).a(!localzqd1.h);
        }
        if (localzqd1.a.b() != 2) {
          if (a((zka)localObject3))
          {
            zqd localzqd3 = localzqd1;
            if (localzqd1.a.b() == 0) {
              localzqd3 = localzqd2;
            }
            if (localzqd3.a.b() != 1) {
              localzqd3 = a(localzqd1);
            }
            if (!localzqd3.i)
            {
              Axis localAxis = localzqd3.a;
              if (localAxis.getMajorUnit() > 0.0D) {
                localAxis.setMajorUnit(100.0D * localAxis.getMajorUnit());
              }
              if (localAxis.getMinorUnit() > 0.0D) {
                localAxis.setMinorUnit(100.0D * localAxis.getMinorUnit());
              }
              if ((localAxis.getCrossType() == 2) && (localAxis.getCrossAt() != 0.0D)) {
                localAxis.setCrossAt(100.0D * localAxis.getCrossAt());
              }
              if (!localAxis.f()) {
                localAxis.setMaxValue(Double.valueOf(100.0D * ((Double)localAxis.getMaxValue()).doubleValue()));
              }
              if (!localAxis.e()) {
                localAxis.setMinValue(Double.valueOf(100.0D * ((Double)localAxis.getMinValue()).doubleValue()));
              }
              localzqd3.i = true;
            }
          }
        }
      }
    }
  }
  
  private boolean a(zka paramzka)
  {
    switch (paramzka.j())
    {
    case 2: 
    case 5: 
    case 8: 
    case 11: 
    case 16: 
    case 20: 
    case 23: 
    case 26: 
    case 30: 
    case 33: 
    case 39: 
    case 42: 
    case 52: 
    case 55: 
      return true;
    }
    return false;
  }
  
  private Axis a(zcjy paramzcjy, String paramString)
    throws Exception
  {
    Axis localAxis = d(paramString);
    localAxis.d = paramString;
    zqd localzqd = new zqd();
    localzqd.a = localAxis;
    zf.a(this.f, localzqd);
    int m = 0;
    int n = 0;
    int i1 = 0;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("axId".equals(paramzcjy.q()))
      {
        localzqd.c = t(paramzcjy);
      }
      else if ("scaling".equals(paramzcjy.q()))
      {
        b(paramzcjy, localAxis);
      }
      else
      {
        Object localObject;
        boolean bool;
        if ("axPos".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          localAxis.e = ((String)localObject);
          if (("b".equals(localObject)) || ("t".equals(localObject)))
          {
            bool = true;
            if (this.d.i.getCount() == 0) {
              bool = false;
            }
            for (int i2 = 0; i2 < this.d.i.getCount(); i2++)
            {
              zka localzka = this.d.i.a(i2);
              if ((!ChartCollection.k(localzka.j())) && (!ChartCollection.q(localzka.j()))) {
                bool = false;
              }
            }
            if (bool) {
              localAxis.a(0);
            }
          }
        }
        else if (("title".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localAxis.getTitle().setAutoText(true);
          if (this.d.getType() == 6) {
            if ("catAx".equals(paramString)) {
              localAxis.getTitle().setRotationAngle(90);
            } else if ("valAx".equals(paramString)) {
              localAxis.getTitle().setRotationAngle(0);
            }
          }
          a(paramzcjy, localAxis.getTitle(), false);
        }
        else if ("majorGridlines".equals(paramzcjy.q()))
        {
          n = 1;
          localObject = localAxis.getMajorGridLines();
          bool = a(paramzcjy, localAxis.s());
          if (!bool)
          {
            ((Line)localObject).a(this.d.O().e());
            ((Line)localObject).n(0);
          }
        }
        else if ("minorGridlines".equals(paramzcjy.q()))
        {
          i1 = 1;
          localObject = localAxis.getMinorGridLines();
          bool = a(paramzcjy, localAxis.t());
          if (!bool)
          {
            ((Line)localObject).a(this.d.O().e());
            ((Line)localObject).n(0);
          }
        }
        else if ("numFmt".equals(paramzcjy.q()))
        {
          localObject = paramzcjy.a("formatCode");
          if (localObject != null) {
            localAxis.getTickLabels().setNumberFormat((String)localObject);
          }
          localObject = paramzcjy.a("sourceLinked");
          if (localObject != null) {
            localAxis.getTickLabels().setNumberFormatLinked(zauj.aB((String)localObject));
          }
          paramzcjy.a();
        }
        else if ("delete".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          localAxis.setVisible(!zauj.aB((String)localObject));
        }
        else if ("majorTickMark".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localAxis.setMajorTickMark(zauj.u((String)localObject));
          }
        }
        else if ("minorTickMark".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localAxis.setMinorTickMark(zauj.u((String)localObject));
          }
        }
        else if ("tickLblPos".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            localAxis.setTickLabelPosition(zauj.v((String)localObject));
            if (("none".equals(localObject)) && (zauj.O(this.d.getType())) && (localAxis.b() == 0) && (this.d.i.getCount() > 0)) {
              this.d.i.a(0).n(false);
            }
          }
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, localAxis.r());
          m = 1;
        }
        else if ("txPr".equals(paramzcjy.q()))
        {
          localObject = b(paramzcjy, this.d);
          ((zru)localObject).a(localAxis.getTickLabels(), this.d, this.c);
        }
        else if ("crossAx".equals(paramzcjy.q()))
        {
          localzqd.d = t(paramzcjy);
        }
        else if ("crosses".equals(paramzcjy.q()))
        {
          localzqd.e = t(paramzcjy);
        }
        else if ("crossesAt".equals(paramzcjy.q()))
        {
          localzqd.f = t(paramzcjy);
        }
        else if ("auto".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            if ("1".equals(localObject)) {
              localAxis.setCategoryType(0);
            } else if ("dateAx".equals(paramString)) {
              localAxis.setCategoryType(2);
            } else {
              localAxis.setCategoryType(1);
            }
            localAxis.g = true;
          }
        }
        else if ("lblAlgn".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
        }
        else if ("baseTimeUnit".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localAxis.setBaseUnitScale(zauj.P((String)localObject));
          }
        }
        else if ("majorUnit".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            double d1 = zauj.C((String)localObject);
            if (d1 != 0.0D) {
              localAxis.setMajorUnit(d1);
            }
          }
        }
        else if ("majorTimeUnit".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localAxis.e(zauj.P((String)localObject));
          }
        }
        else if ("minorUnit".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localAxis.setMinorUnit(zauj.C((String)localObject));
          }
        }
        else if ("minorTimeUnit".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localAxis.f(zauj.P((String)localObject));
          }
        }
        else if ("lblOffset".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localAxis.getTickLabels().setOffset(zauj.F((String)localObject));
          }
        }
        else if ("tickLblSkip".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localAxis.setTickLabelSpacing(zauj.F((String)localObject));
          }
        }
        else if ("tickMarkSkip".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null) {
            localAxis.setTickMarkSpacing(zauj.F((String)localObject));
          }
        }
        else if ("crossBetween".equals(paramzcjy.q()))
        {
          localzqd.g = t(paramzcjy);
        }
        else if ("dispUnits".equals(paramzcjy.q()))
        {
          localAxis.b(false);
          a(paramzcjy, localAxis);
        }
        else if ("noMultiLvlLbl".equals(paramzcjy.q()))
        {
          localAxis.setHasMultiLevelLabels("0".equals(t(paramzcjy)));
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (m == 0) {
      localAxis.getAxisLine().a(this.d.O().e());
    }
    if (n == 0) {
      localAxis.getMajorGridLines().setVisible(false);
    }
    if (i1 == 0) {
      localAxis.getMinorGridLines().setVisible(false);
    }
    return localAxis;
  }
  
  private void a(zcjy paramzcjy, Axis paramAxis)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str;
        if ("builtInUnit".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          paramAxis.setDisplayUnit(zauj.as(str));
        }
        else if ("custUnit".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null) {
            paramAxis.setCustUnit(zauj.F(str));
          }
        }
        else if (("dispUnitsLbl".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          a(paramzcjy, paramAxis.getDisplayUnitLabel());
          paramAxis.b(true);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, DisplayUnitLabel paramDisplayUnitLabel)
    throws Exception
  {
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if ("tx".equals(paramzcjy.q()))
        {
          localObject = a(paramzcjy, this.d);
          if (localObject != null) {
            ((zru)localObject).a(paramDisplayUnitLabel, this.c);
          }
        }
        else if ("txPr".equals(paramzcjy.q()))
        {
          localObject = b(paramzcjy, this.d);
          if (((zru)localObject).g != null)
          {
            if (paramDisplayUnitLabel.j() != null)
            {
              if ((((zru)localObject).g.h() != null) && (("+mj-lt".equals(((zru)localObject).g.h())) || ("+mn-lt".equals(((zru)localObject).g.h())))) {
                ((zru)localObject).g.d(this.d.getChartArea().getFont().getName());
              }
              ((zru)localObject).g.b(paramDisplayUnitLabel.getFont());
            }
            else
            {
              ((zru)localObject).a(this.d, false);
              paramDisplayUnitLabel.c(zauj.a(((zru)localObject).g, this.c));
            }
            Font localFont = paramDisplayUnitLabel.getFont();
          }
        }
        else if (("layout".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localObject = u(paramzcjy);
          if (localObject != null) {
            ((zrb)localObject).a(this.d, paramDisplayUnitLabel);
          }
        }
        else if (("spPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          b(paramzcjy, paramDisplayUnitLabel.getShapeProperties());
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private void b(zcjy paramzcjy, Axis paramAxis)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str;
        if ("logBase".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if (str != null)
          {
            paramAxis.setLogarithmic(true);
            paramAxis.setLogBase(zauj.C(str));
          }
        }
        else if ("orientation".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          if ("maxMin".equals(str)) {
            paramAxis.setPlotOrderReversed(true);
          } else if ("minMax".equals(str)) {
            paramAxis.setPlotOrderReversed(false);
          }
        }
        else if ("max".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          paramAxis.setMaxValue(Double.valueOf(zauj.C(str)));
        }
        else if ("min".equals(paramzcjy.q()))
        {
          str = t(paramzcjy);
          paramAxis.setMinValue(Double.valueOf(zauj.C(str)));
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, Legend paramLegend)
    throws Exception
  {
    LegendEntry localLegendEntry = null;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        Object localObject;
        if ("idx".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if (localObject != null)
          {
            int m = zauj.F((String)localObject);
            localLegendEntry = paramLegend.getLegendEntries().get(m);
          }
        }
        else if ("delete".equals(paramzcjy.q()))
        {
          localObject = t(paramzcjy);
          if ((localLegendEntry != null) && (!"0".equals(localObject))) {
            localLegendEntry.setDeleted(true);
          }
        }
        else if ("txPr".equals(paramzcjy.q()))
        {
          localObject = b(paramzcjy, this.d);
          if ((((zru)localObject).g != null) && (localLegendEntry != null))
          {
            ((zru)localObject).a(this.d, false);
            localLegendEntry.a(zauj.a(((zru)localObject).g, this.c));
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (localLegendEntry == null) {
      b("legendEntry");
    }
  }
  
  private void w(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */