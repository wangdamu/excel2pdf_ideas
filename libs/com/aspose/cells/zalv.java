package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zalv
{
  private zqh a = null;
  private Worksheet b = null;
  private zqi c;
  private static final za d = new za(new String[] { "{7E03D99C-DC04-49d9-9315-930204A7B6E9}", "sparklineGroups", "conditionalFormattings", "dataValidations", "slicerList" });
  
  zalv(zqh paramzqh, zqi paramzqi)
  {
    this.a = paramzqh;
    this.c = paramzqi;
    this.b = paramzqi.d;
  }
  
  void a(zcjy paramzcjy, zalu paramzalu)
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
        b(paramzcjy, paramzalu);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, String paramString, zalu paramzalu)
    throws Exception
  {
    if ((this.a.k & 0x2000) == 0)
    {
      paramzcjy.a();
      return;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("slicer".equals(paramzcjy.q()))
      {
        zrl localzrl = (zrl)this.c.e.get(paramzcjy.a("id"));
        localzrl.a = paramString;
        if (this.c.l == null) {
          this.c.l = new ArrayList();
        }
        zf.a(this.c.l, localzrl);
      }
      paramzcjy.a();
    }
  }
  
  private void a(zcjy paramzcjy, zalu paramzalu, boolean paramBoolean)
    throws Exception
  {
    if ((this.a.k & 0x800) == 0)
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
      } else if ("conditionalFormatting".equals(paramzcjy.q())) {
        paramzalu.b(paramzcjy, paramBoolean);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  void b(zcjy paramzcjy, zalu paramzalu)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    String str = paramzcjy.a("uri");
    switch (d.a(str))
    {
    case 0: 
      if (this.b.k.b == null) {
        this.b.k.b = new HashMap();
      }
      this.b.k.b.put(str, paramzcjy.v());
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (d.a(paramzcjy.q()))
      {
      case 1: 
        b(paramzcjy);
        break;
      case 2: 
        a(paramzcjy, paramzalu, true);
        break;
      case 3: 
        paramzalu.a(paramzcjy, true);
        break;
      case 4: 
        a(paramzcjy, str, paramzalu);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  CellsColor a(zcjy paramzcjy)
    throws Exception
  {
    CellsColor localCellsColor = this.a.a.createCellsColor();
    zaml localzaml = zalk.g(paramzcjy);
    localCellsColor.a = localzaml;
    return localCellsColor;
  }
  
  void b(zcjy paramzcjy)
    throws Exception
  {
    if ((this.a.k & 0x100) == 0)
    {
      paramzcjy.a();
      return;
    }
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
      } else if (("sparklineGroup".equals(paramzcjy.q())) && (!paramzcjy.o())) {
        c(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  void c(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    SparklineGroup localSparklineGroup = new SparklineGroup(this.b.getSparklineGroupCollection());
    this.b.getSparklineGroupCollection().a(localSparklineGroup);
    a(paramzcjy, localSparklineGroup);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("colorSeries".equals(paramzcjy.q())) {
        localSparklineGroup.setSeriesColor(a(paramzcjy));
      } else if ("colorNegative".equals(paramzcjy.q())) {
        localSparklineGroup.setNegativePointsColor(a(paramzcjy));
      } else if ("colorAxis".equals(paramzcjy.q())) {
        localSparklineGroup.setHorizontalAxisColor(a(paramzcjy));
      } else if ("colorMarkers".equals(paramzcjy.q())) {
        localSparklineGroup.setMarkersColor(a(paramzcjy));
      } else if ("colorFirst".equals(paramzcjy.q())) {
        localSparklineGroup.setFirstPointColor(a(paramzcjy));
      } else if ("colorLast".equals(paramzcjy.q())) {
        localSparklineGroup.setLastPointColor(a(paramzcjy));
      } else if ("colorHigh".equals(paramzcjy.q())) {
        localSparklineGroup.setHighPointColor(a(paramzcjy));
      } else if ("colorLow".equals(paramzcjy.q())) {
        localSparklineGroup.setLowPointColor(a(paramzcjy));
      } else if ("f".equals(paramzcjy.q())) {
        localSparklineGroup.setHorizontalAxisDateRange(paramzcjy.j());
      } else if ("sparklines".equals(paramzcjy.q())) {
        b(paramzcjy, localSparklineGroup);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  void a(zcjy paramzcjy, SparklineGroup paramSparklineGroup)
    throws Exception
  {
    paramSparklineGroup.setType(0);
    paramSparklineGroup.setPlotEmptyCellsType(1);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("manualMax".equals(paramzcjy.q())) {
          paramSparklineGroup.c = zauj.C(paramzcjy.t());
        } else if ("manualMin".equals(paramzcjy.q())) {
          paramSparklineGroup.d = zauj.C(paramzcjy.t());
        } else if ("type".equals(paramzcjy.q())) {
          paramSparklineGroup.setType(zauj.aO(paramzcjy.t()));
        } else if ("lineWeight".equals(paramzcjy.q())) {
          paramSparklineGroup.setLineWeight(zauj.C(paramzcjy.t()));
        } else if ("displayEmptyCellsAs".equals(paramzcjy.q())) {
          paramSparklineGroup.setPlotEmptyCellsType(zauj.aD(paramzcjy.t()));
        } else if ("markers".equals(paramzcjy.q())) {
          paramSparklineGroup.setShowMarkers(!"0".equals(paramzcjy.t()));
        } else if ("high".equals(paramzcjy.q())) {
          paramSparklineGroup.setShowHighPoint(!"0".equals(paramzcjy.t()));
        } else if ("low".equals(paramzcjy.q())) {
          paramSparklineGroup.setShowLowPoint(!"0".equals(paramzcjy.t()));
        } else if ("first".equals(paramzcjy.q())) {
          paramSparklineGroup.setShowFirstPoint(!"0".equals(paramzcjy.t()));
        } else if ("last".equals(paramzcjy.q())) {
          paramSparklineGroup.setShowLastPoint(!"0".equals(paramzcjy.t()));
        } else if ("negative".equals(paramzcjy.q())) {
          paramSparklineGroup.setShowNegativePoints(!"0".equals(paramzcjy.t()));
        } else if ("displayXAxis".equals(paramzcjy.q())) {
          paramSparklineGroup.setShowHorizontalAxis(!"0".equals(paramzcjy.t()));
        } else if ("displayHidden".equals(paramzcjy.q())) {
          paramSparklineGroup.setDisplayHidden(!"0".equals(paramzcjy.t()));
        } else if ("minAxisType".equals(paramzcjy.q())) {
          paramSparklineGroup.setVerticalAxisMinValueType(zauj.aP(paramzcjy.t()));
        } else if ("maxAxisType".equals(paramzcjy.q())) {
          paramSparklineGroup.setVerticalAxisMaxValueType(zauj.aP(paramzcjy.t()));
        } else if ("rightToLeft".equals(paramzcjy.q())) {
          paramSparklineGroup.setPlotRightToLeft(!"0".equals(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
  }
  
  void b(zcjy paramzcjy, SparklineGroup paramSparklineGroup)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    SparklineCollection localSparklineCollection = paramSparklineGroup.getSparklineCollection();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("sparkline".equals(paramzcjy.q())) {
        a(paramzcjy, localSparklineCollection);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  void a(zcjy paramzcjy, SparklineCollection paramSparklineCollection)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    Sparkline localSparkline = new Sparkline(paramSparklineCollection);
    paramSparklineCollection.a(localSparkline);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("f".equals(paramzcjy.q()))
      {
        localSparkline.setDataRange(paramzcjy.j());
      }
      else if ("sqref".equals(paramzcjy.q()))
      {
        int i = 0;
        int j = 0;
        int[] arrayOfInt1 = { i };
        int[] arrayOfInt2 = { j };
        CellsHelper.a(paramzcjy.j(), arrayOfInt1, arrayOfInt2);
        i = arrayOfInt1[0];
        j = arrayOfInt2[0];
        localSparkline.a(i);
        localSparkline.b(j);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */