package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

class zalu
{
  private zqh a = null;
  private Worksheet b = null;
  private Cells c;
  private RowCollection d;
  private zv e;
  private zt f;
  private zqi g;
  private boolean h = false;
  private zbdm i;
  private zt j;
  private Row k;
  private int l;
  private LightCellsDataHandler m;
  private boolean n;
  private boolean o = true;
  private boolean p = true;
  private boolean q = true;
  private boolean r = true;
  private boolean s = true;
  private boolean t = true;
  private HashMap u;
  private ArrayList v;
  private zajl w = null;
  private boolean x = false;
  private zbdx y;
  private zbdx z = new zbdx();
  private zgs A = new zgs();
  private zgs B = new zgs();
  private zgs C;
  private int D = 0;
  private int E = 0;
  private int F = -1;
  private int[] G;
  private zalh H = null;
  private static final com.aspose.cells.b.c.a.za I = new com.aspose.cells.b.c.a.za(new String[] { "sheetViews", "sheetFormatPr", "cols", "sheetData", "scenarios", "mergeCells", "dataValidations", "hyperlinks", "printOptions", "pageMargins", "pageSetup", "headerFooter", "ignoredErrors", "smartTags", "rowBreaks", "colBreaks", "legacyDrawing", "drawing", "conditionalFormatting", "autoFilter", "sortState", "sheetProtection", "sheetPr", "controls", "oleObjects", "legacyDrawingHF", "picture", "customProperties", "customSheetViews", "extLst", "protectedRanges", "AlternateContent", "current", "show", "sqref", "comment", "hidden", "locked", "name", "user", "deleted", "numFmtId", "r", "undone", "val", "Choice", "numberStoredAsText", "emptyCellReference", "listDataValidation", "evalError", "twoDigitTextYear", "formulaRange", "unlockedFormula", "formula", "calculatedColumn", "key", "colorId", "guid", "filter", "filterUnique", "fitToPage", "hiddenColumns", "hiddenRows", "outlineSymbols", "printArea", "scale", "showAutoFilter", "showFormulas", "showGridLines", "showPageBreaks", "showRuler", "showRowCol", "showZeros", "view", "topLeftCell", "state", "pageLayout", "pageBreakPreview", "veryHidden", "pane", "selection", "oleObject", "control", "id", "autoPict", "altText", "top10", "customFilters", "filters", "dynamicFilter", "colorFilter", "iconFilter", "dateGroupItem", "dateTimeGrouping", "year", "month", "day", "hour", "minute", "second", "n", "s", "str", "d", "e", "b", "min", "max", "width", "style", "customWidth", "outlineLevel", "collapsed", "bestFit", "xmlns", "xmlns:r", "xmlns:xdr", "xmlns:x14", "xmlns:mc", "priority", "type", "dxfId", "operator", "stopIfTrue", "text", "rank", "timePeriod", "percent", "bottom", "aboveAverage", "equalAverage", "stdDev" });
  
  zalu(zqh paramzqh, zqi paramzqi)
  {
    this.a = paramzqh;
    this.g = paramzqi;
    this.b = paramzqi.d;
    this.c = this.b.getCells();
    this.e = this.c.e();
    this.d = this.c.getRows();
    this.u = new HashMap();
    this.v = new ArrayList(5);
    this.w = this.a.a.getWorksheets().g;
    this.o = (!this.a.a.getSettings().o);
    this.x = paramzqh.a.getSettings().p;
    this.G = new int['䀀'];
    for (int i1 = 0; i1 < this.G.length; i1++) {
      this.G[i1] = 15;
    }
    if (paramzqh.j == null)
    {
      this.l = Integer.MAX_VALUE;
      this.m = null;
      this.n = false;
    }
    else
    {
      this.l = paramzqh.k;
      this.m = paramzqh.j.getLightCellsDataHandler();
      this.n = (this.m != null);
      this.o = ((this.l & 0x1) != 0);
      this.p = ((this.l & 0x4) != 0);
      this.q = ((this.l & 0x40) != 0);
      this.r = ((this.l & 0x10) != 0);
      this.s = ((this.l & 0x8) != 0);
      this.t = ((this.l & 0x2) != 0);
    }
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    if (!F(paramzcjy)) {
      return;
    }
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        if (paramzcjy.s() == 4) {
          break;
        }
        paramzcjy.a();
      }
      else
      {
        switch (I.a(paramzcjy.q()))
        {
        case 0: 
          C(paramzcjy);
          break;
        case 1: 
          t(paramzcjy);
          break;
        case 2: 
          B(paramzcjy);
          break;
        case 3: 
          y(paramzcjy);
          break;
        case 4: 
          b(paramzcjy);
          break;
        case 5: 
          x(paramzcjy);
          break;
        case 6: 
          a(paramzcjy, false);
          break;
        case 7: 
          v(paramzcjy);
          break;
        case 8: 
          c(paramzcjy, this.b.getPageSetup());
          break;
        case 9: 
          b(paramzcjy, this.b.getPageSetup());
          break;
        case 10: 
          a(paramzcjy, this.b.getPageSetup(), null);
          break;
        case 11: 
          a(paramzcjy, this.b.getPageSetup());
          break;
        case 12: 
          e(paramzcjy);
          break;
        case 13: 
          f(paramzcjy);
          break;
        case 14: 
          a(paramzcjy, true, this.b.getHorizontalPageBreaks(), this.b.getVerticalPageBreaks());
          break;
        case 15: 
          a(paramzcjy, false, this.b.getHorizontalPageBreaks(), this.b.getVerticalPageBreaks());
          break;
        case 16: 
          u(paramzcjy);
          break;
        case 17: 
          p(paramzcjy);
          break;
        case 18: 
          b(paramzcjy, false);
          break;
        case 19: 
          a(paramzcjy, this.g.d.getAutoFilter());
          break;
        case 20: 
          a(paramzcjy, this.g.d.s());
          break;
        case 21: 
          o(paramzcjy);
          break;
        case 22: 
          r(paramzcjy);
          break;
        case 23: 
          d(paramzcjy, false);
          break;
        case 24: 
          n(paramzcjy);
          break;
        case 25: 
          q(paramzcjy);
          break;
        case 26: 
          m(paramzcjy);
          break;
        case 27: 
          l(paramzcjy);
          break;
        case 28: 
          j(paramzcjy);
          break;
        case 29: 
          i(paramzcjy);
          break;
        case 30: 
          h(paramzcjy);
          break;
        case 31: 
          d(paramzcjy);
          break;
        default: 
          paramzcjy.a();
        }
      }
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x8000) == 0)
    {
      paramzcjy.a();
      return;
    }
    ScenarioCollection localScenarioCollection = this.b.getScenarios();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (I.a(paramzcjy.q()))
        {
        case 32: 
          localScenarioCollection.a = zauj.F(paramzcjy.t());
          break;
        case 33: 
          localScenarioCollection.b = zauj.F(paramzcjy.t());
          break;
        case 34: 
          localScenarioCollection.c = new ArrayList();
          a(paramzcjy.t(), localScenarioCollection.c);
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
      if ("scenario".equals(paramzcjy.q())) {
        c(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    Scenario localScenario = new Scenario();
    this.b.getScenarios().a(localScenario);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (I.a(paramzcjy.q()))
        {
        case 35: 
          localScenario.a = paramzcjy.t();
          break;
        case 36: 
          localScenario.d = zauj.aB(paramzcjy.t());
          break;
        case 37: 
          localScenario.e = zauj.aB(paramzcjy.t());
          break;
        case 38: 
          localScenario.b = paramzcjy.t();
          break;
        case 39: 
          localScenario.c = paramzcjy.t();
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
    while (zauz.a(paramzcjy))
    {
      if ("inputCells".equals(paramzcjy.q()))
      {
        ScenarioInputCell localScenarioInputCell = new ScenarioInputCell();
        localScenario.getInputCells().a(localScenarioInputCell);
        if (paramzcjy.n()) {
          while (paramzcjy.m()) {
            switch (I.a(paramzcjy.q()))
            {
            case 40: 
              localScenarioInputCell.e = zauj.aB(paramzcjy.t());
              break;
            case 41: 
              localScenarioInputCell.d = zauj.F(paramzcjy.t());
              break;
            case 42: 
              localScenarioInputCell.a(paramzcjy.t());
              break;
            case 43: 
              localScenarioInputCell.f = zauj.aB(paramzcjy.t());
              break;
            case 44: 
              localScenarioInputCell.c = paramzcjy.t();
            }
          }
        }
      }
      paramzcjy.a();
    }
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x8000) == 0)
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
    while (zauz.a(paramzcjy)) {
      switch (I.a(paramzcjy.q()))
      {
      case 45: 
        a(paramzcjy, "controls", this.b.k.e);
        break;
      default: 
        String str = paramzcjy.v();
        if (str.length() > 27) {
          zf.a(this.b.k.f, str);
        }
        break;
      }
    }
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x8000) == 0)
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
    ErrorCheckOptionCollection localErrorCheckOptionCollection = this.b.getErrorCheckOptions();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        if ("ignoredError".equals(paramzcjy.q()))
        {
          int i1 = localErrorCheckOptionCollection.add();
          ErrorCheckOption localErrorCheckOption = localErrorCheckOptionCollection.get(i1);
          while (paramzcjy.m()) {
            switch (I.a(paramzcjy.q()))
            {
            case 34: 
              String str = paramzcjy.t();
              ArrayList localArrayList = new ArrayList();
              a(str, localArrayList);
              localErrorCheckOption.a = localArrayList;
              break;
            case 46: 
              localErrorCheckOption.setErrorCheck(4, !zauj.aB(paramzcjy.t()));
              break;
            case 47: 
              localErrorCheckOption.setErrorCheck(2, !zauj.aB(paramzcjy.t()));
              break;
            case 48: 
              localErrorCheckOption.setErrorCheck(128, !zauj.aB(paramzcjy.t()));
              break;
            case 49: 
              localErrorCheckOption.setErrorCheck(1, !zauj.aB(paramzcjy.t()));
              break;
            case 50: 
              localErrorCheckOption.setErrorCheck(32, !zauj.aB(paramzcjy.t()));
              break;
            case 51: 
              localErrorCheckOption.setErrorCheck(8, !zauj.aB(paramzcjy.t()));
              break;
            case 52: 
              localErrorCheckOption.setErrorCheck(64, !zauj.aB(paramzcjy.t()));
              break;
            case 53: 
              localErrorCheckOption.setErrorCheck(16, !zauj.aB(paramzcjy.t()));
              break;
            case 54: 
              localErrorCheckOption.setErrorCheck(129, !zauj.aB(paramzcjy.t()));
            }
          }
          paramzcjy.l();
        }
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void f(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x8000) == 0)
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
      } else if ("cellSmartTags".equals(paramzcjy.q())) {
        g(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void g(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    String str = paramzcjy.a("r");
    int i1 = this.b.getSmartTagSetting().add(str);
    SmartTagCollection localSmartTagCollection = this.b.getSmartTagSetting().get(i1);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("cellSmartTag".equals(paramzcjy.q())) {
        a(paramzcjy, localSmartTagCollection);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, SmartTagCollection paramSmartTagCollection)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    String str1 = paramzcjy.a("type");
    int i1 = zp.a(str1);
    if (i1 > this.b.c().aa().getCount())
    {
      paramzcjy.a();
      return;
    }
    SmartTag localSmartTag = new SmartTag(paramSmartTagCollection);
    localSmartTag.a(this.b.c().aa().a(i1));
    paramSmartTagCollection.a(localSmartTag);
    String str2 = paramzcjy.a("deleted");
    if ((str2 != null) && ("1".equals(str2))) {
      localSmartTag.setDeleted(true);
    }
    String str3 = paramzcjy.a("xmlBased");
    if ((str3 != null) && ("1".equals(str3))) {
      localSmartTag.a(true);
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
        if ("cellSmartTagPr".equals(paramzcjy.q()))
        {
          if (paramzcjy.n())
          {
            String str4 = null;
            String str5 = null;
            while (paramzcjy.m()) {
              switch (I.a(paramzcjy.q()))
              {
              case 55: 
                str4 = paramzcjy.t();
                break;
              case 44: 
                str5 = paramzcjy.t();
              }
            }
            if (str4 != null) {
              localSmartTag.getProperties().add(str4, str5);
            }
          }
          paramzcjy.l();
        }
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void h(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x8000) == 0)
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
      if ((paramzcjy.s() == 1) && ("protectedRange".equals(paramzcjy.q())))
      {
        String str1 = paramzcjy.a("name");
        String str2 = paramzcjy.a("sqref");
        String str3 = paramzcjy.a("password");
        String str4 = paramzcjy.a("securityDescriptor");
        if ((str1 != null) && (str2 != null) && (str2.length() > 0))
        {
          ArrayList localArrayList = new ArrayList();
          a(str2, localArrayList);
          int i1 = this.b.getAllowEditRanges().a(str1, localArrayList);
          ProtectedRange localProtectedRange = this.b.getAllowEditRanges().get(i1);
          if ((str3 != null) && (!"".equals(str3))) {
            localProtectedRange.a(zp.a(str3, 515, com.aspose.cells.b.a.c.za.b()));
          }
          localProtectedRange.setSecurityDescriptor(str4);
        }
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void i(zcjy paramzcjy)
    throws Exception
  {
    zalv localzalv = new zalv(this.a, this.g);
    localzalv.a(paramzcjy, this);
  }
  
  private void j(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x8000) == 0)
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
    while (zauz.a(paramzcjy)) {
      if ("customSheetView".equals(paramzcjy.q())) {
        k(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void k(zcjy paramzcjy)
    throws Exception
  {
    zoh localzoh = new zoh(this.b);
    this.b.K().a(localzoh);
    Object localObject;
    if (paramzcjy.n()) {
      while (paramzcjy.m()) {
        switch (I.a(paramzcjy.q()))
        {
        case 56: 
          localzoh.f(zauj.F(paramzcjy.t()));
          break;
        case 57: 
          localzoh.n = new zh(paramzcjy.t().substring(1, 1 + (paramzcjy.t().length() - 2)));
          break;
        case 58: 
          localzoh.f(zauj.aB(paramzcjy.t()));
          break;
        case 59: 
          localzoh.g(zauj.aB(paramzcjy.t()));
          break;
        case 60: 
          localzoh.e().setPercentScale(!zauj.aB(paramzcjy.t()));
          break;
        case 61: 
          localzoh.b(zauj.aB(paramzcjy.t()));
          break;
        case 62: 
          localzoh.a(zauj.aB(paramzcjy.t()));
          break;
        case 63: 
          localzoh.r(zauj.aB(paramzcjy.t()));
          break;
        case 64: 
          localzoh.h(zauj.aB(paramzcjy.t()));
          break;
        case 65: 
          localzoh.c(zauj.F(paramzcjy.t()));
          break;
        case 66: 
          localzoh.e(zauj.aB(paramzcjy.t()));
          break;
        case 67: 
          localzoh.l(zauj.aB(paramzcjy.t()));
          break;
        case 68: 
          localzoh.m(zauj.aB(paramzcjy.t()));
          break;
        case 69: 
          localzoh.d(zauj.aB(paramzcjy.t()));
          break;
        case 70: 
          localzoh.s(zauj.aB(paramzcjy.t()));
          break;
        case 71: 
          localzoh.n(zauj.aB(paramzcjy.t()));
          break;
        case 72: 
          localzoh.q(zauj.aB(paramzcjy.t()));
          break;
        case 73: 
          switch (I.a(paramzcjy.t()))
          {
          case 76: 
            localzoh.d(2);
            break;
          case 77: 
            localzoh.d(1);
          }
          break;
        case 74: 
          int i1 = 0;
          int i2 = 0;
          localObject = new int[] { i1 };
          int[] arrayOfInt = { i2 };
          CellsHelper.a(paramzcjy.t(), (int[])localObject, arrayOfInt);
          i1 = localObject[0];
          i2 = arrayOfInt[0];
          localzoh.a(i1);
          localzoh.b(i2);
          break;
        case 75: 
          switch (I.a(paramzcjy.t()))
          {
          case 36: 
            localzoh.e(1);
            break;
          case 78: 
            localzoh.e(2);
          }
          break;
        }
      }
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    zro localzro = new zro();
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (I.a(paramzcjy.q()))
      {
      case 19: 
        a(paramzcjy, localzoh.b());
        break;
      case 15: 
        a(paramzcjy, false, localzoh.f(), localzoh.g());
        break;
      case 14: 
        a(paramzcjy, true, localzoh.f(), localzoh.g());
        break;
      case 11: 
        a(paramzcjy, localzoh.e());
        break;
      case 9: 
        b(paramzcjy, localzoh.e());
        break;
      case 10: 
        a(paramzcjy, localzoh.e(), localzoh);
        break;
      case 79: 
        localzro.a = E(paramzcjy);
        break;
      case 80: 
        if (paramzcjy.n())
        {
          zrq localzrq = new zrq();
          localzrq.b = paramzcjy.a("activeCell");
          localzrq.d = paramzcjy.a("sqref");
          localzrq.a = paramzcjy.a("pane");
          localObject = paramzcjy.a("activeCellId");
          if (localObject != null) {
            localzrq.c = zauj.F((String)localObject);
          }
          zf.a(localzro.b, localzrq);
        }
        paramzcjy.a();
        break;
      case 8: 
        c(paramzcjy, localzoh.e());
        break;
      case 29: 
        localzoh.c = paramzcjy.v();
        break;
      default: 
        paramzcjy.a();
      }
    }
    localzro.a(localzoh);
  }
  
  private void l(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x80) == 0)
    {
      paramzcjy.a();
      return;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    this.g.k = new HashMap();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("customPr".equals(paramzcjy.q()))
      {
        String str1 = paramzcjy.a("name");
        String str2 = paramzcjy.a("id", null);
        this.g.k.put(str1, str2);
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void m(zcjy paramzcjy)
    throws Exception
  {
    this.g.i = paramzcjy.a("id", null);
    paramzcjy.a();
    if (this.g.i == null) {
      throw new CellsException(6, "Invalid Picture r:id element");
    }
  }
  
  private void n(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x200) == 0)
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
      } else if ("oleObject".equals(paramzcjy.q())) {
        c(paramzcjy, false);
      } else if ("AlternateContent".equals(paramzcjy.q())) {
        a(paramzcjy, true, "oleObject");
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, boolean paramBoolean, String paramString)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("Choice".equals(paramzcjy.q()))
      {
        if (paramBoolean) {
          a(paramzcjy, paramString, null);
        }
      }
      else if (("Fallback".equals(paramzcjy.q())) && (!paramBoolean))
      {
        a(paramzcjy, paramString, null);
        continue;
      }
      paramzcjy.a();
    }
  }
  
  private void a(zcjy paramzcjy, String paramString, ArrayList paramArrayList)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if (zw.b(paramzcjy.q(), paramString)) {
        switch (I.a(paramString))
        {
        case 81: 
          c(paramzcjy, true);
          break;
        case 82: 
          e(paramzcjy, true);
          break;
        case 23: 
          d(paramzcjy, true);
          break;
        default: 
          paramzcjy.a();
          break;
        }
      } else {
        switch (I.a(paramzcjy.q()))
        {
        case 16: 
          u(paramzcjy);
          break;
        default: 
          if (paramArrayList != null) {
            zf.a(paramArrayList, paramzcjy.v());
          } else {
            paramzcjy.a();
          }
          break;
        }
      }
    }
  }
  
  private void c(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return;
    }
    zqf localzqf = new zqf(paramBoolean);
    String str;
    zrl localzrl;
    while (paramzcjy.m()) {
      if ("progId".equals(paramzcjy.q()))
      {
        localzqf.g = paramzcjy.t();
      }
      else if ("id".equals(paramzcjy.q()))
      {
        str = paramzcjy.t();
        localzrl = this.g.b(str);
        if (localzrl != null) {
          localzqf.c = localzrl.d;
        }
      }
      else if ("shapeId".equals(paramzcjy.q()))
      {
        localzqf.b = paramzcjy.t();
      }
      else if ("link".equals(paramzcjy.q()))
      {
        localzqf.h = paramzcjy.t();
      }
      else if ("oleUpdate".equals(paramzcjy.q()))
      {
        localzqf.i = "OLEUPDATE_ALWAYS".equals(paramzcjy.t());
      }
      else if ("dvAspect".equals(paramzcjy.q()))
      {
        localzqf.j = "DVASPECT_ICON".equals(paramzcjy.t());
      }
      else if ("autoLoad".equals(paramzcjy.q()))
      {
        localzqf.k = zauj.aB(paramzcjy.t());
      }
    }
    paramzcjy.l();
    this.g.p.put("\000s" + localzqf.b, localzqf);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("objectPr".equals(paramzcjy.q()))
      {
        str = paramzcjy.a("id", null);
        localzrl = this.g.b(str);
        if (localzrl != null) {
          localzqf.d = localzrl.d;
        }
      }
      paramzcjy.a();
    }
  }
  
  private void d(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    if ((this.l & 0x200) == 0)
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
    while (zauz.a(paramzcjy)) {
      switch (I.a(paramzcjy.q()))
      {
      case 82: 
        e(paramzcjy, paramBoolean);
        break;
      case 31: 
        a(paramzcjy, true, "control");
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void e(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    zqn localzqn = null;
    Object localObject;
    if (paramzcjy.n())
    {
      localzqn = new zqn(paramBoolean);
      while (paramzcjy.m()) {
        if ("shapeId".equals(paramzcjy.q()))
        {
          localzqn.b = paramzcjy.t();
        }
        else if ("id".equals(paramzcjy.q()))
        {
          localObject = this.g.b(paramzcjy.t());
          if (localObject != null)
          {
            localzqn.c = ((zrl)localObject).d;
            localzqn.g = ((zrl)localObject).c;
          }
        }
        else if ("name".equals(paramzcjy.q()))
        {
          localzqn.a = paramzcjy.t();
        }
      }
      paramzcjy.l();
      this.g.p.put("\000s" + localzqn.b, localzqn);
    }
    if ((localzqn == null) || (paramzcjy.o()))
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("controlPr".equals(paramzcjy.q()))
      {
        while (paramzcjy.m()) {
          switch (I.a(paramzcjy.q()))
          {
          case 83: 
            localObject = paramzcjy.t();
            if (localObject != null)
            {
              zrl localzrl = this.g.b((String)localObject);
              if (localzrl != null) {
                localzqn.d = localzrl.d;
              }
            }
            break;
          case 84: 
            localzqn.h = paramzcjy.t();
            break;
          case 85: 
            localzqn.i = paramzcjy.t();
            break;
          case 37: 
            localzqn.j = zauj.b(paramzcjy.t(), false);
          }
        }
        paramzcjy.l();
        localzqn.e = paramzcjy.a(null, false);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private void a()
  {
    Protection localProtection = this.b.getProtection();
    localProtection.setAllowDeletingColumn(false);
    localProtection.setAllowDeletingRow(false);
    localProtection.setAllowEditingContent(true);
    localProtection.setAllowEditingObject(true);
    localProtection.setAllowEditingScenario(true);
    localProtection.setAllowFiltering(false);
    localProtection.setAllowFormattingCell(false);
    localProtection.setAllowFormattingColumn(false);
    localProtection.setAllowFormattingRow(false);
    localProtection.setAllowInsertingColumn(false);
    localProtection.setAllowInsertingHyperlink(false);
    localProtection.setAllowInsertingRow(false);
    localProtection.setAllowSelectingLockedCell(true);
    localProtection.setAllowSelectingUnlockedCell(true);
    localProtection.setAllowSorting(false);
    localProtection.setAllowUsingPivotTable(false);
  }
  
  private void o(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      a();
      Protection localProtection = this.b.getProtection();
      while (paramzcjy.m()) {
        if ("password".equals(paramzcjy.q())) {
          localProtection.a(zp.a(paramzcjy.t(), 515, com.aspose.cells.b.a.c.za.b()));
        } else if ("sheet".equals(paramzcjy.q())) {
          localProtection.setAllowEditingContent(!zauj.aB(paramzcjy.t()));
        } else if ("objects".equals(paramzcjy.q())) {
          localProtection.setAllowEditingObject(!zauj.aB(paramzcjy.t()));
        } else if ("scenarios".equals(paramzcjy.q())) {
          localProtection.setAllowEditingScenario(!zauj.aB(paramzcjy.t()));
        } else if ("formatCells".equals(paramzcjy.q())) {
          localProtection.setAllowFormattingCell(!zauj.aB(paramzcjy.t()));
        } else if ("formatColumns".equals(paramzcjy.q())) {
          localProtection.setAllowFormattingColumn(!zauj.aB(paramzcjy.t()));
        } else if ("formatRows".equals(paramzcjy.q())) {
          localProtection.setAllowFormattingRow(!zauj.aB(paramzcjy.t()));
        } else if ("insertColumns".equals(paramzcjy.q())) {
          localProtection.setAllowInsertingColumn(!zauj.aB(paramzcjy.t()));
        } else if ("insertRows".equals(paramzcjy.q())) {
          localProtection.setAllowInsertingRow(!zauj.aB(paramzcjy.t()));
        } else if ("insertHyperlinks".equals(paramzcjy.q())) {
          localProtection.setAllowInsertingHyperlink(!zauj.aB(paramzcjy.t()));
        } else if ("deleteColumns".equals(paramzcjy.q())) {
          localProtection.setAllowDeletingColumn(!zauj.aB(paramzcjy.t()));
        } else if ("deleteRows".equals(paramzcjy.q())) {
          localProtection.setAllowDeletingRow(!zauj.aB(paramzcjy.t()));
        } else if ("selectLockedCells".equals(paramzcjy.q())) {
          localProtection.setAllowSelectingLockedCell(!zauj.aB(paramzcjy.t()));
        } else if ("sort".equals(paramzcjy.q())) {
          localProtection.setAllowSorting(!zauj.aB(paramzcjy.t()));
        } else if ("autoFilter".equals(paramzcjy.q())) {
          localProtection.setAllowFiltering(!zauj.aB(paramzcjy.t()));
        } else if ("pivotTables".equals(paramzcjy.q())) {
          localProtection.setAllowUsingPivotTable(!zauj.aB(paramzcjy.t()));
        } else if ("selectUnlockedCells".equals(paramzcjy.q())) {
          localProtection.setAllowSelectingUnlockedCell(!zauj.aB(paramzcjy.t()));
        } else if ("algorithmName".equals(paramzcjy.q())) {
          localProtection.a().a = paramzcjy.t();
        } else if ("hashValue".equals(paramzcjy.q())) {
          localProtection.a().b = ze.b(paramzcjy.t());
        } else if ("saltValue".equals(paramzcjy.q())) {
          localProtection.a().c = ze.b(paramzcjy.t());
        } else if ("spinCount".equals(paramzcjy.q())) {
          localProtection.a().d = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  static void a(zcjy paramzcjy, DataSorter paramDataSorter)
    throws Exception
  {
    c(paramzcjy, paramDataSorter);
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
      } else if ("sortCondition".equals(paramzcjy.q())) {
        b(paramzcjy, paramDataSorter);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private static void b(zcjy paramzcjy, DataSorter paramDataSorter)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return;
    }
    zrr localzrr1 = new zrr(paramDataSorter);
    String str = null;
    while (paramzcjy.m()) {
      if ("customList".equals(paramzcjy.q()))
      {
        localzrr1.a(paramzcjy.t());
      }
      else if ("descending".equals(paramzcjy.q()))
      {
        localzrr1.a(zauj.aB(paramzcjy.t()) ? 1 : 0);
      }
      else if ("dxfId".equals(paramzcjy.q()))
      {
        int i1 = zauj.F(paramzcjy.t());
        if ((i1 >= 0) && (i1 <= paramDataSorter.a.getWorksheets().getDxfs().getCount()))
        {
          Style localStyle = new Style(paramDataSorter.a.getWorksheets());
          localStyle.copy(paramDataSorter.a.getWorksheets().getDxfs().get(i1));
          localzrr1.a(localStyle);
        }
      }
      else if ("iconId".equals(paramzcjy.q()))
      {
        localzrr1.a(localzrr1.h(), zauj.F(paramzcjy.t()));
      }
      else if ("iconSet".equals(paramzcjy.q()))
      {
        localzrr1.a(zauj.Z(paramzcjy.t()), localzrr1.i());
      }
      else if ("ref".equals(paramzcjy.q()))
      {
        str = paramzcjy.t();
      }
      else if ("sortBy".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.t();
        if ("value".equals(localObject)) {
          localzrr1.c(0);
        } else if ("cellColor".equals(localObject)) {
          localzrr1.c(1);
        } else if ("fontColor".equals(localObject)) {
          localzrr1.c(2);
        } else if ("icon".equals(localObject)) {
          localzrr1.c(3);
        }
      }
    }
    if (str == null) {
      return;
    }
    paramDataSorter.a(localzrr1);
    Object localObject = (CellArea)CellArea.a(str, true);
    int i2;
    int i3;
    if (localzrr1.a().getSortLeftToRight())
    {
      i2 = ((CellArea)localObject).StartRow;
      i3 = ((CellArea)localObject).EndRow;
    }
    else
    {
      i2 = ((CellArea)localObject).StartColumn;
      i3 = ((CellArea)localObject).EndColumn;
    }
    localzrr1.b(i2);
    while (i2 < i3)
    {
      i2++;
      zrr localzrr2 = new zrr(paramDataSorter);
      localzrr2.a(localzrr1);
      localzrr2.b(i2);
      paramDataSorter.a(localzrr2);
    }
    paramzcjy.l();
    paramzcjy.a();
  }
  
  private static void c(zcjy paramzcjy, DataSorter paramDataSorter)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return;
    }
    while (paramzcjy.m()) {
      if ("caseSensitive".equals(paramzcjy.q())) {
        paramDataSorter.setCaseSensitive(zauj.aB(paramzcjy.t()));
      } else if ("columnSort".equals(paramzcjy.q())) {
        paramDataSorter.setSortLeftToRight(zauj.aB(paramzcjy.t()));
      } else if ("ref".equals(paramzcjy.q())) {
        paramDataSorter.a((CellArea)CellArea.a(paramzcjy.t(), true));
      } else if ("sortMethod".equals(paramzcjy.q())) {
        paramDataSorter.b = paramzcjy.t();
      }
    }
    paramzcjy.l();
  }
  
  static void a(zcjy paramzcjy, AutoFilter paramAutoFilter)
    throws Exception
  {
    String str = paramzcjy.a("ref", "");
    if (str == null) {
      throw new CellsException(6, "Invalid autoFilter element");
    }
    paramAutoFilter.setRange(str);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("filterColumn".equals(paramzcjy.q())) {
        b(paramzcjy, paramAutoFilter);
      } else if ("sortState".equals(paramzcjy.q())) {
        a(paramzcjy, paramAutoFilter.getSorter());
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private static void b(zcjy paramzcjy, AutoFilter paramAutoFilter)
    throws Exception
  {
    int i1 = 0;
    String str1 = paramzcjy.a("colId", "");
    if (str1 != null) {
      i1 = zauj.F(str1);
    }
    String str2 = paramzcjy.a("hiddenButton");
    boolean bool1 = false;
    if (str2 != null) {
      bool1 = "1".equals(str2);
    }
    str2 = paramzcjy.a("showButton");
    boolean bool2 = true;
    if (str2 != null) {
      bool2 = "1".equals(str2);
    }
    FilterColumn localFilterColumn = null;
    if (paramzcjy.o())
    {
      localFilterColumn = new FilterColumn(paramAutoFilter.c, i1, bool1, bool2);
      localFilterColumn.setFilterType(6);
      paramAutoFilter.c.a(localFilterColumn);
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      Object localObject1;
      String str3;
      Object localObject2;
      Object localObject3;
      switch (I.a(paramzcjy.q()))
      {
      case 86: 
        localFilterColumn = new FilterColumn(paramAutoFilter.c, i1, bool1, bool2);
        localFilterColumn.setFilterType(5);
        localObject1 = paramzcjy.a("top");
        str3 = paramzcjy.a("percent");
        localObject2 = paramzcjy.a("val");
        localObject3 = paramzcjy.a("filterVal");
        boolean bool3 = !"0".equals(localObject1);
        boolean bool4 = "1".equals(str3);
        int i2 = 10;
        if (localObject2 != null) {
          i2 = zauj.F((String)localObject2);
        }
        Top10Filter localTop10Filter = new Top10Filter(bool3, bool4, i2);
        localFilterColumn.setFilter(localTop10Filter);
        try
        {
          localTop10Filter.setCriteria(Double.valueOf(zauj.C((String)localObject3)));
        }
        catch (Exception localException) {}
        paramzcjy.a();
        break;
      case 87: 
        localFilterColumn = new FilterColumn(paramAutoFilter.c, i1, bool1, bool2);
        localFilterColumn.setFilterType(1);
        localObject1 = new CustomFilterCollection();
        localFilterColumn.setFilter(localObject1);
        a(paramzcjy, (CustomFilterCollection)localObject1);
        break;
      case 88: 
        localFilterColumn = new FilterColumn(paramAutoFilter.c, i1, bool1, bool2);
        localFilterColumn.setFilterType(3);
        localObject1 = new MultipleFilterCollection();
        localFilterColumn.setFilter(localObject1);
        a(paramzcjy, (MultipleFilterCollection)localObject1);
        break;
      case 89: 
        localObject1 = paramzcjy.a("type");
        str3 = paramzcjy.a("val");
        localObject2 = paramzcjy.a("maxVal");
        localFilterColumn = new FilterColumn(paramAutoFilter.c, i1, bool1, bool2);
        localFilterColumn.setFilterType(2);
        localObject3 = new DynamicFilter();
        localFilterColumn.setFilter(localObject3);
        ((DynamicFilter)localObject3).setDynamicFilterType(zauj.aq((String)localObject1));
        if ((str3 != null) && (zarb.b(str3))) {
          ((DynamicFilter)localObject3).setValue(Double.valueOf(zauj.C(str3)));
        }
        if ((localObject2 != null) && (zarb.b((String)localObject2))) {
          ((DynamicFilter)localObject3).setMaxValue(Double.valueOf(zauj.C((String)localObject2)));
        }
        paramzcjy.a();
        break;
      case 90: 
        localObject1 = paramzcjy.a("cellColor");
        str3 = paramzcjy.a("dxfId");
        localFilterColumn = new FilterColumn(paramAutoFilter.c, i1, bool1, bool2);
        localFilterColumn.setFilterType(0);
        localObject2 = new ColorFilter(localFilterColumn);
        localFilterColumn.setFilter(localObject2);
        ((ColorFilter)localObject2).setFilterByFillColor((localObject1 == null) || ("1".equals(localObject1)));
        ((ColorFilter)localObject2).a(zauj.F(str3));
        paramzcjy.a();
        break;
      case 91: 
        localObject1 = paramzcjy.a("iconId");
        str3 = paramzcjy.a("iconSet");
        localFilterColumn = new FilterColumn(paramAutoFilter.c, i1, bool1, bool2);
        localFilterColumn.setFilterType(4);
        localObject2 = new IconFilter(localFilterColumn);
        localFilterColumn.setFilter(localObject2);
        if (str3 != null) {
          ((IconFilter)localObject2).setIconSetType(zauj.Z(str3));
        }
        if (localObject1 != null) {
          ((IconFilter)localObject2).setIconId(zauj.F((String)localObject1));
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
    if (localFilterColumn != null) {
      paramAutoFilter.c.a(localFilterColumn);
    }
  }
  
  private static void a(zcjy paramzcjy, MultipleFilterCollection paramMultipleFilterCollection)
    throws Exception
  {
    String str = paramzcjy.a("blank", "");
    if ("1".equals(str)) {
      paramMultipleFilterCollection.setMatchBlank(true);
    }
    paramMultipleFilterCollection.a = paramzcjy.a("calendarType");
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
      } else {
        switch (I.a(paramzcjy.q()))
        {
        case 58: 
          paramMultipleFilterCollection.b(paramzcjy.a("val"));
          paramzcjy.a();
          break;
        case 92: 
          DateTimeGroupItem localDateTimeGroupItem = new DateTimeGroupItem();
          paramMultipleFilterCollection.a(localDateTimeGroupItem);
          if (paramzcjy.n())
          {
            while (paramzcjy.m()) {
              switch (I.a(paramzcjy.q()))
              {
              case 93: 
                localDateTimeGroupItem.setDateTimeGroupingType(zauj.ar(paramzcjy.t()));
                break;
              case 94: 
                localDateTimeGroupItem.setYear(zauj.F(paramzcjy.t()));
                break;
              case 95: 
                localDateTimeGroupItem.setMonth(zauj.F(paramzcjy.t()));
                break;
              case 96: 
                localDateTimeGroupItem.setDay(zauj.F(paramzcjy.t()));
                break;
              case 97: 
                localDateTimeGroupItem.setHour(zauj.F(paramzcjy.t()));
                break;
              case 98: 
                localDateTimeGroupItem.setMinute(zauj.F(paramzcjy.t()));
                break;
              case 99: 
                localDateTimeGroupItem.setSecond(zauj.F(paramzcjy.t()));
              }
            }
            paramzcjy.l();
          }
          paramzcjy.a();
          break;
        default: 
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private static void a(zcjy paramzcjy, CustomFilterCollection paramCustomFilterCollection)
    throws Exception
  {
    String str1 = paramzcjy.a("and", "");
    paramCustomFilterCollection.setAnd("1".equals(str1));
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
      else if ("customFilter".equals(paramzcjy.q()))
      {
        String str2 = paramzcjy.a("operator");
        String str3 = paramzcjy.a("val");
        String str4 = str3.trim();
        CustomFilter localCustomFilter = new CustomFilter();
        paramCustomFilterCollection.a(localCustomFilter);
        localCustomFilter.setFilterOperatorType(zauj.at(str2));
        if ("".equals(str4)) {
          localCustomFilter.setCriteria(null);
        } else if (zarb.b(str3)) {
          localCustomFilter.setCriteria(Double.valueOf(zauj.C(str3)));
        } else {
          localCustomFilter.setCriteria(str3);
        }
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void p(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x300) == 0)
    {
      paramzcjy.a();
      return;
    }
    this.g.h = paramzcjy.a("id", null);
    paramzcjy.a();
  }
  
  private void q(zcjy paramzcjy)
    throws Exception
  {
    this.g.g = paramzcjy.a("id", null);
    paramzcjy.a();
    if (this.g.g == null) {
      throw new CellsException(6, "Invalid LegacyDrawingHFRid element");
    }
  }
  
  private void r(zcjy paramzcjy)
    throws Exception
  {
    String str1 = paramzcjy.a("codeName");
    if ((str1 != null) && (str1.length() > 0)) {
      this.b.p = str1;
    }
    this.b.k.a = paramzcjy.a("published");
    String str2 = paramzcjy.a("transitionEvaluation");
    if (str2 != null) {
      this.b.setTransitionEvaluation(zauj.b(str2, false));
    }
    String str3 = paramzcjy.a("transitionEntry");
    this.b.setTransitionEntry(zauj.b(str3, false));
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
      else if ("pageSetUpPr".equals(paramzcjy.q()))
      {
        String str4 = paramzcjy.a("fitToPage");
        if (str4 != null) {
          this.b.getPageSetup().setPercentScale(!zauj.b(str4, false));
        }
        paramzcjy.a();
      }
      else if ("tabColor".equals(paramzcjy.q()))
      {
        this.b.o = zalk.g(paramzcjy);
      }
      else if ("outlinePr".equals(paramzcjy.q()))
      {
        s(paramzcjy);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void s(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("summaryBelow".equals(paramzcjy.q()))
        {
          if ("0".equals(paramzcjy.t())) {
            this.b.getOutline().SummaryRowBelow = false;
          }
        }
        else if (("summaryRight".equals(paramzcjy.q())) && ("0".equals(paramzcjy.t()))) {
          this.b.getOutline().SummaryColumnRight = false;
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void a(double paramDouble, boolean paramBoolean)
  {
    if (Math.abs(paramDouble - 0.0D) < 1.0E-4D)
    {
      this.c.getColumns().a(0.0D);
    }
    else
    {
      int i1 = this.a.a.getWorksheets().U();
      double d1 = paramDouble * i1;
      if (paramBoolean) {
        d1 += 10.0D;
      }
      this.c.getColumns().a(zlp.a(d1, this.a.a.getWorksheets()));
    }
  }
  
  private void t(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x8000) == 0)
    {
      paramzcjy.a();
      return;
    }
    int i1 = 0;
    int i2 = 0;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("defaultRowHeight".equals(paramzcjy.q()))
        {
          this.c.setStandardHeight(zauj.C(paramzcjy.t()));
        }
        else
        {
          double d1;
          if ("defaultColWidth".equals(paramzcjy.q()))
          {
            d1 = zauj.C(paramzcjy.t());
            a(d1, false);
            i2 = 1;
          }
          else if ("baseColWidth".equals(paramzcjy.q()))
          {
            d1 = zauj.C(paramzcjy.t());
            if (d1 != 0.0D)
            {
              a(d1, true);
              i2 = 1;
            }
          }
          else if ("outlineLevelRow".equals(paramzcjy.q()))
          {
            this.c.c((byte)zauj.F(paramzcjy.t()));
          }
          else if ("outlineLevelCol".equals(paramzcjy.q()))
          {
            this.c.b((byte)zauj.F(paramzcjy.t()));
          }
          else if (("zeroHeight".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
          {
            this.c.setDefaultRowHidden(true);
          }
          else if (("customHeight".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
          {
            i1 = 1;
          }
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    if (i1 != 0) {
      this.c.setDefaultRowHeightMatched(false);
    } else {
      this.c.setDefaultRowHeightMatched(true);
    }
    if (i2 == 0) {
      this.c.getColumns().b = false;
    }
  }
  
  private void u(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x200) == 0)
    {
      paramzcjy.a();
      return;
    }
    this.g.f = paramzcjy.a("id", null);
    paramzcjy.a();
  }
  
  private void v(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x10000) == 0)
    {
      paramzcjy.a();
      return;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int i1 = zauj.a(paramzcjy);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("hyperlink".equals(paramzcjy.q())) {
        w(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void w(zcjy paramzcjy)
    throws Exception
  {
    if (!paramzcjy.n()) {
      throw new CellsException(6, "Invalid Hyperlink element");
    }
    String str1 = null;
    String str2 = null;
    Object localObject1 = null;
    String str3 = null;
    String str4 = null;
    while (paramzcjy.m()) {
      if ("ref".equals(paramzcjy.q())) {
        str1 = paramzcjy.t();
      } else if ("id".equals(paramzcjy.q())) {
        str2 = paramzcjy.t();
      } else if ("location".equals(paramzcjy.q())) {
        localObject1 = paramzcjy.t();
      } else if ("display".equals(paramzcjy.q())) {
        str3 = paramzcjy.t();
      } else if ("tooltip".equals(paramzcjy.q())) {
        str4 = paramzcjy.t();
      }
    }
    paramzcjy.l();
    paramzcjy.a();
    if (str1 == null) {
      throw new CellsException(6, "Invalid Hyperlink element");
    }
    CellArea localCellArea = (CellArea)CellArea.a(str1, true);
    if (str2 != null)
    {
      HashMap localHashMap = this.g.e;
      if ((localHashMap != null) && (localHashMap.containsKey(str2)))
      {
        localObject2 = (zrl)localHashMap.get(str2);
        String str5 = zbxt.c(((zrl)localObject2).d);
        if (localObject1 == null) {
          localObject1 = str5;
        } else {
          localObject1 = str5 + "#" + (String)localObject1;
        }
      }
    }
    int i1 = this.b.getHyperlinks().a(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow - localCellArea.StartRow + 1, localCellArea.EndColumn - localCellArea.StartColumn + 1, (String)localObject1);
    Object localObject2 = this.b.getHyperlinks().get(i1);
    if (str3 != null) {
      ((Hyperlink)localObject2).b(str3);
    }
    if (str4 != null) {
      ((Hyperlink)localObject2).setScreenTip(str4);
    }
  }
  
  void a(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    if ((this.l & 0x1000) == 0)
    {
      paramzcjy.a();
      return;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int i1 = zauj.a(paramzcjy);
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("dataValidation".equals(paramzcjy.q())) {
        a(paramzcjy, null, paramBoolean);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private String a(zcjy paramzcjy, Validation paramValidation, boolean paramBoolean)
    throws Exception
  {
    int i1 = 0;
    if (paramValidation == null)
    {
      i1 = 1;
      paramValidation = new Validation(this.b.getValidations());
      paramValidation.a = true;
      this.b.getValidations().add(paramValidation);
      paramValidation.setIgnoreBlank(false);
      paramValidation.setShowInput(false);
      paramValidation.setShowError(false);
      paramValidation.setOperator(0);
      if (paramzcjy.n())
      {
        while (paramzcjy.m()) {
          if ("errorStyle".equals(paramzcjy.q())) {
            paramValidation.setAlertStyle(zauj.m(paramzcjy.t()));
          } else if ("type".equals(paramzcjy.q())) {
            paramValidation.setType(zauj.g(paramzcjy.t()));
          } else if (("allowBlank".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t()))) {
            paramValidation.setIgnoreBlank(true);
          } else if (("showInputMessage".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t()))) {
            paramValidation.setShowInput(true);
          } else if (("showErrorMessage".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t()))) {
            paramValidation.setShowError(true);
          } else if ("promptTitle".equals(paramzcjy.q())) {
            paramValidation.setInputTitle(paramzcjy.t());
          } else if ("prompt".equals(paramzcjy.q())) {
            paramValidation.setInputMessage(paramzcjy.t());
          } else if ("errorTitle".equals(paramzcjy.q())) {
            paramValidation.setErrorTitle(paramzcjy.t());
          } else if ("error".equals(paramzcjy.q())) {
            paramValidation.setErrorMessage(paramzcjy.t());
          } else if ("imeMode".equals(paramzcjy.q())) {
            paramValidation.a(zauj.n(paramzcjy.t()));
          } else if ("sqref".equals(paramzcjy.q())) {
            a(paramzcjy.t(), paramValidation.getAreaList());
          } else if ("operator".equals(paramzcjy.q())) {
            paramValidation.setOperator(zauj.h(paramzcjy.t()));
          } else if (("showDropDown".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t()))) {
            paramValidation.setInCellDropDown(false);
          }
        }
        paramzcjy.l();
      }
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    paramzcjy.d();
    String str1 = null;
    String str2 = null;
    while (zauz.a(paramzcjy)) {
      if (paramzcjy.s() == 7)
      {
        paramzcjy.d();
      }
      else
      {
        paramzcjy.k();
        if (paramzcjy.s() != 1)
        {
          paramzcjy.a();
        }
        else if ("formula1".equals(paramzcjy.q()))
        {
          if (!paramBoolean)
          {
            str1 = paramzcjy.j();
            if ((str1 != null) && (!"".equals(str1)) && (str1.charAt(0) != '=')) {
              str1 = "=" + str1;
            }
          }
          else
          {
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
                str1 = paramzcjy.j();
                if ((str1 != null) && (!"".equals(str1)) && (str1.charAt(0) != '=')) {
                  str1 = "=" + str1;
                }
              }
              else
              {
                paramzcjy.a();
              }
            }
            paramzcjy.h();
          }
        }
        else if ("formula2".equals(paramzcjy.q()))
        {
          if (!paramBoolean)
          {
            str2 = paramzcjy.j();
            if ((str2 != null) && (!"".equals(str2)) && (str2.charAt(0) != '=')) {
              str2 = "=" + str2;
            }
          }
          else
          {
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
                str2 = paramzcjy.j();
                if ((str2 != null) && (!"".equals(str2)) && (str2.charAt(0) != '=')) {
                  str2 = "=" + str2;
                }
              }
              else
              {
                paramzcjy.a();
              }
            }
            paramzcjy.h();
          }
        }
        else
        {
          String str3;
          if ("sqref".equals(paramzcjy.q()))
          {
            str3 = paramzcjy.j();
            if ((str3 != null) && (str3.length() > 0)) {
              a(str3, paramValidation.getAreaList());
            }
          }
          else if ("list".equals(paramzcjy.q()))
          {
            str3 = paramzcjy.j();
            StringBuilder localStringBuilder = new StringBuilder();
            char[] arrayOfChar = str3.toCharArray();
            for (int i2 = 0; i2 < arrayOfChar.length; i2++) {
              if (arrayOfChar[i2] == ',')
              {
                localStringBuilder.append('\000');
              }
              else
              {
                if (arrayOfChar[i2] == '"')
                {
                  i2++;
                  while ((i2 < arrayOfChar.length) && (arrayOfChar[i2] != '"'))
                  {
                    localStringBuilder.append(arrayOfChar[i2]);
                    i2++;
                  }
                }
                localStringBuilder.append(arrayOfChar[i2]);
              }
            }
            str1 = zs.a(localStringBuilder);
          }
          else if ("AlternateContent".equals(paramzcjy.q()))
          {
            paramzcjy.d();
            while (zauz.a(paramzcjy)) {
              if ("Choice".equals(paramzcjy.q())) {
                str1 = a(paramzcjy, paramValidation, paramBoolean);
              } else {
                paramzcjy.a();
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
    if (i1 != 0) {
      paramValidation.a(str1, str2);
    } else {
      return str1;
    }
    return null;
  }
  
  private void a(String paramString, ArrayList paramArrayList)
  {
    String[] arrayOfString = zw.d(paramString, ' ');
    for (int i1 = 0; i1 < arrayOfString.length; i1++)
    {
      String str = arrayOfString[i1].trim();
      if ((str.length() > 0) && (str.charAt(0) != '#'))
      {
        CellArea localCellArea = (CellArea)CellArea.a(str, true);
        zf.a(paramArrayList, localCellArea);
      }
    }
  }
  
  private void a(zcjy paramzcjy, boolean paramBoolean, HorizontalPageBreakCollection paramHorizontalPageBreakCollection, VerticalPageBreakCollection paramVerticalPageBreakCollection)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int i1 = zauj.a(paramzcjy);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("brk".equals(paramzcjy.q()))
      {
        int[] arrayOfInt = a(paramzcjy, paramBoolean ? 1048575 : 16383);
        if (arrayOfInt != null)
        {
          int i2;
          int i3;
          int i4;
          if (paramBoolean)
          {
            i2 = arrayOfInt[0];
            i3 = arrayOfInt[1];
            i4 = arrayOfInt[2];
            if ((i3 != -1) || (i4 != -1))
            {
              if (i3 == -1) {
                i3 = 0;
              }
              if ((i4 == -1) || (i4 > 16383)) {
                i4 = 16383;
              }
              paramHorizontalPageBreakCollection.a(i2, i3, i4);
            }
            else
            {
              paramHorizontalPageBreakCollection.a(i2, 0);
            }
          }
          else
          {
            i2 = arrayOfInt[0];
            i3 = arrayOfInt[1];
            i4 = arrayOfInt[2];
            if ((i3 != -1) || (i4 != -1))
            {
              if (i3 == -1) {
                i3 = 0;
              }
              if ((i4 == -1) || (i4 > 1048575)) {
                i4 = 1048575;
              }
              paramVerticalPageBreakCollection.a(i3, i4, i2);
            }
            else
            {
              paramVerticalPageBreakCollection.a(0, i2);
            }
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
  
  private int[] a(zcjy paramzcjy, int paramInt)
    throws Exception
  {
    if (!paramzcjy.n()) {
      return null;
    }
    int[] arrayOfInt = { -1, -1, -1 };
    while (paramzcjy.m()) {
      if ("id".equals(paramzcjy.q()))
      {
        double d1 = zauj.C(paramzcjy.t());
        if (d1 <= paramInt) {
          arrayOfInt[0] = ((int)d1);
        }
      }
      else if ("min".equals(paramzcjy.q()))
      {
        arrayOfInt[1] = zauj.F(paramzcjy.t());
      }
      else if ("max".equals(paramzcjy.q()))
      {
        arrayOfInt[2] = zauj.F(paramzcjy.t());
      }
    }
    paramzcjy.l();
    paramzcjy.a();
    if (arrayOfInt[0] == -1) {
      return null;
    }
    return arrayOfInt;
  }
  
  private void a(zcjy paramzcjy, PageSetup paramPageSetup)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("differentOddEven".equals(paramzcjy.q())) {
          paramPageSetup.setHFDiffOddEven(zauj.aB(paramzcjy.t()));
        } else if ("differentFirst".equals(paramzcjy.q())) {
          paramPageSetup.setHFDiffFirst(zauj.aB(paramzcjy.t()));
        } else if ("scaleWithDoc".equals(paramzcjy.q())) {
          paramPageSetup.setHFScaleWithDoc(zauj.aB(paramzcjy.t()));
        } else if ("alignWithMargins".equals(paramzcjy.q())) {
          paramPageSetup.setHFAlignMargins(zauj.aB(paramzcjy.t()));
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
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String[] arrayOfString;
        int i1;
        if ("oddHeader".equals(paramzcjy.q()))
        {
          arrayOfString = a(paramzcjy.j());
          for (i1 = 0; i1 < 3; i1++) {
            if (arrayOfString[i1] != null) {
              paramPageSetup.setHeader(i1, arrayOfString[i1]);
            }
          }
        }
        else if ("oddFooter".equals(paramzcjy.q()))
        {
          arrayOfString = a(paramzcjy.j());
          for (i1 = 0; i1 < 3; i1++) {
            if (arrayOfString[i1] != null) {
              paramPageSetup.setFooter(i1, arrayOfString[i1]);
            }
          }
        }
        else if ("evenHeader".equals(paramzcjy.q()))
        {
          arrayOfString = a(paramzcjy.j());
          for (i1 = 0; i1 < 3; i1++) {
            if (arrayOfString[i1] != null) {
              paramPageSetup.setEvenHeader(i1, arrayOfString[i1]);
            }
          }
        }
        else if ("evenFooter".equals(paramzcjy.q()))
        {
          arrayOfString = a(paramzcjy.j());
          for (i1 = 0; i1 < 3; i1++) {
            if (arrayOfString[i1] != null) {
              paramPageSetup.setEvenFooter(i1, arrayOfString[i1]);
            }
          }
        }
        else if ("firstHeader".equals(paramzcjy.q()))
        {
          arrayOfString = a(paramzcjy.j());
          for (i1 = 0; i1 < 3; i1++) {
            if (arrayOfString[i1] != null) {
              paramPageSetup.setFirstPageHeader(i1, arrayOfString[i1]);
            }
          }
        }
        else if ("firstFooter".equals(paramzcjy.q()))
        {
          arrayOfString = a(paramzcjy.j());
          for (i1 = 0; i1 < 3; i1++) {
            if (arrayOfString[i1] != null) {
              paramPageSetup.setFirstPageFooter(i1, arrayOfString[i1]);
            }
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private static String[] a(String paramString)
  {
    String[] arrayOfString = new String[3];
    int i1 = 1;
    int i2 = 0;
    for (int i3 = 0; i3 < paramString.length(); i3++) {
      if ((paramString.charAt(i3) == '&') && (i3 + 1 < paramString.length()))
      {
        int i4;
        switch (paramString.charAt(i3 + 1))
        {
        case 'L': 
        case 'l': 
          i4 = 0;
          break;
        case 'C': 
        case 'c': 
          i4 = 1;
          break;
        case 'R': 
        case 'r': 
          i4 = 2;
          break;
        case '&': 
          i3++;
          break;
        }
        if (i3 - i2 > 0) {
          arrayOfString[i1] = paramString.substring(i2, i2 + (i3 - i2));
        }
        i1 = i4;
        i2 = i3 + 2;
      }
    }
    if (i2 < paramString.length()) {
      arrayOfString[i1] = paramString.substring(i2);
    }
    return arrayOfString;
  }
  
  private void a(zcjy paramzcjy, PageSetup paramPageSetup, zoh paramzoh)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return;
    }
    boolean bool = false;
    String str = null;
    while (paramzcjy.m()) {
      if ("id".equals(paramzcjy.q()))
      {
        if (paramzoh != null) {
          paramzoh.b = paramzcjy.t();
        } else {
          this.g.j = paramzcjy.t();
        }
      }
      else if ("blackAndWhite".equals(paramzcjy.q()))
      {
        paramPageSetup.setBlackAndWhite(zauj.aB(paramzcjy.t()));
      }
      else if ("cellComments".equals(paramzcjy.q()))
      {
        paramPageSetup.setPrintComments(zauj.d(paramzcjy.t()));
      }
      else if ("draft".equals(paramzcjy.q()))
      {
        paramPageSetup.setPrintDraft(zauj.aB(paramzcjy.t()));
      }
      else if ("errors".equals(paramzcjy.q()))
      {
        paramPageSetup.setPrintErrors(zauj.e(paramzcjy.t()));
      }
      else if ("useFirstPageNumber".equals(paramzcjy.q()))
      {
        bool = zauj.aB(paramzcjy.t());
      }
      else if ("firstPageNumber".equals(paramzcjy.q()))
      {
        str = paramzcjy.t();
      }
      else if ("fitToHeight".equals(paramzcjy.q()))
      {
        paramPageSetup.a(zauj.F(paramzcjy.t()));
      }
      else if ("fitToWidth".equals(paramzcjy.q()))
      {
        try
        {
          paramPageSetup.b(zauj.F(paramzcjy.t()));
        }
        catch (Exception localException1) {}
      }
      else if ("horizontalDpi".equals(paramzcjy.q()))
      {
        a(paramPageSetup, paramzcjy.t());
      }
      else if ("verticalDpi".equals(paramzcjy.q()))
      {
        a(paramPageSetup, paramzcjy.t());
      }
      else if ("orientation".equals(paramzcjy.q()))
      {
        paramPageSetup.setOrientation(zauj.c(paramzcjy.t()));
      }
      else if ("pageOrder".equals(paramzcjy.q()))
      {
        paramPageSetup.setOrder(zauj.f(paramzcjy.t()));
      }
      else if ("paperSize".equals(paramzcjy.q()))
      {
        paramPageSetup.setPaperSize(zauj.F(paramzcjy.t()));
      }
      else if ("copies".equals(paramzcjy.q()))
      {
        paramPageSetup.setPrintCopies(zauj.F(paramzcjy.t()));
      }
      else if ("scale".equals(paramzcjy.q()))
      {
        int i1 = zauj.F(paramzcjy.t());
        if ((i1 >= 10) && (i1 <= 400))
        {
          paramPageSetup.c(i1);
          if (paramPageSetup.isPercentScale()) {
            paramPageSetup.e(false);
          }
        }
      }
    }
    paramzcjy.l();
    paramzcjy.a();
    if ((bool) && (str != null)) {
      try
      {
        paramPageSetup.setFirstPageNumber(zauj.F(str));
      }
      catch (Exception localException2) {}
    }
  }
  
  private void a(PageSetup paramPageSetup, String paramString)
  {
    if (paramString.length() <= 5) {
      try
      {
        paramPageSetup.setPrintQuality(zauj.F(paramString));
      }
      catch (Exception localException) {}
    }
  }
  
  private void b(zcjy paramzcjy, PageSetup paramPageSetup)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return;
    }
    while (paramzcjy.m()) {
      if ("left".equals(paramzcjy.q())) {
        paramPageSetup.setLeftMarginInch(zauj.C(paramzcjy.t()));
      } else if ("right".equals(paramzcjy.q())) {
        paramPageSetup.setRightMarginInch(zauj.C(paramzcjy.t()));
      } else if ("top".equals(paramzcjy.q())) {
        paramPageSetup.setTopMarginInch(zauj.C(paramzcjy.t()));
      } else if ("bottom".equals(paramzcjy.q())) {
        paramPageSetup.setBottomMarginInch(zauj.C(paramzcjy.t()));
      } else if ("header".equals(paramzcjy.q())) {
        paramPageSetup.setHeaderMarginInch(zauj.C(paramzcjy.t()));
      } else if ("footer".equals(paramzcjy.q())) {
        paramPageSetup.setFooterMarginInch(zauj.C(paramzcjy.t()));
      }
    }
    paramzcjy.l();
    paramzcjy.a();
  }
  
  private void c(zcjy paramzcjy, PageSetup paramPageSetup)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return;
    }
    paramPageSetup.setPrintGridlines(false);
    paramPageSetup.setPrintHeadings(false);
    paramPageSetup.setCenterHorizontally(false);
    paramPageSetup.setCenterVertically(false);
    while (paramzcjy.m()) {
      if (("gridLines".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t()))) {
        paramPageSetup.setPrintGridlines(true);
      } else if (("headings".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t()))) {
        paramPageSetup.setPrintHeadings(true);
      } else if (("horizontalCentered".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t()))) {
        paramPageSetup.setCenterHorizontally(true);
      } else if (("verticalCentered".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t()))) {
        paramPageSetup.setCenterVertically(true);
      }
    }
    paramzcjy.l();
    paramzcjy.a();
  }
  
  private void x(zcjy paramzcjy)
    throws Exception
  {
    if ((this.l & 0x400) == 0)
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
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("mergeCell".equals(paramzcjy.q()))
      {
        String[] arrayOfString = zw.d(paramzcjy.a("ref"), ':');
        paramzcjy.a();
        CellArea localCellArea = new CellArea();
        int i1;
        int i2;
        int[] arrayOfInt2;
        if (arrayOfString.length > 1)
        {
          i1 = 0;
          i2 = 0;
          int i3 = localCellArea.StartRow;
          arrayOfInt2 = new int[] { i3 };
          int[] arrayOfInt3 = { i1 };
          CellsHelper.a(arrayOfString[0], arrayOfInt2, arrayOfInt3);
          i3 = arrayOfInt2[0];
          i1 = arrayOfInt3[0];
          localCellArea.StartRow = i3;
          int i4 = localCellArea.EndRow;
          int[] arrayOfInt4 = { i4 };
          int[] arrayOfInt5 = { i2 };
          CellsHelper.a(arrayOfString[1], arrayOfInt4, arrayOfInt5);
          i4 = arrayOfInt4[0];
          i2 = arrayOfInt5[0];
          localCellArea.EndRow = i4;
          localCellArea.StartColumn = i1;
          localCellArea.EndColumn = i2;
        }
        else
        {
          i1 = 0;
          i2 = 0;
          int[] arrayOfInt1 = { i1 };
          arrayOfInt2 = new int[] { i2 };
          CellsHelper.a(arrayOfString[0], arrayOfInt1, arrayOfInt2);
          i1 = arrayOfInt1[0];
          i2 = arrayOfInt2[0];
          localCellArea.StartRow = i1;
          localCellArea.StartColumn = i2;
          localCellArea.EndRow = localCellArea.StartRow;
          localCellArea.EndColumn = localCellArea.StartColumn;
        }
        this.c.o().a(localCellArea);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void y(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    if (this.n)
    {
      if (!this.m.startSheet(this.b)) {
        paramzcjy.a();
      }
    }
    else if ((this.l & 0x5F) == 0)
    {
      paramzcjy.a();
      return;
    }
    Workbook localWorkbook = this.b.c().p();
    if (this.n) {
      this.c.a(128, 128, 16);
    } else {
      this.c.a(8192, 32768, 64);
    }
    this.e = this.c.e();
    this.d = this.c.getRows();
    this.h = (this.e instanceof zbdm);
    this.i = new zbdm(1, 32, this.w, this.c.a);
    this.y = new zbdx();
    this.y.a(0, this.c);
    this.z = new zbdx();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("row".equals(paramzcjy.q()))
      {
        localWorkbook.i();
        z(paramzcjy);
        this.y.a += 1;
      }
      else
      {
        paramzcjy.a();
        throw new CellsException(6, "Invalid sheetData sub Element " + paramzcjy.q());
      }
    }
    paramzcjy.h();
    if (this.v.size() > 0) {
      for (;;)
      {
        c();
        if (this.v.size() < 1) {
          break;
        }
        this.y.a += 1;
      }
    }
    this.e.a(-10, 0, 0, 0);
    this.c.f();
    this.c.a((short)this.F);
  }
  
  private void z(zcjy paramzcjy)
    throws Exception
  {
    this.z.a(this.y);
    boolean bool1 = this.n;
    boolean bool2 = false;
    boolean bool3 = false;
    int i1 = 0;
    int i2 = -1;
    int i3 = 32;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("r".equals(paramzcjy.q()))
        {
          int i4 = zauj.F(paramzcjy.t()) - 1;
          if (i4 > this.z.a)
          {
            if (this.v.size() > 0) {
              while (this.y.a < i4)
              {
                c();
                if ((this.v.size() < 1) || (this.v.size() < 1)) {
                  break;
                }
                this.y.a += 1;
              }
            }
            this.y.a = i4;
            this.z.a = i4;
          }
          if (bool1)
          {
            if (!this.m.startRow(this.z.a))
            {
              paramzcjy.a();
              return;
            }
            bool1 = false;
          }
        }
        else if ("spans".equals(paramzcjy.q()))
        {
          String str1 = paramzcjy.t();
          if (str1 != null)
          {
            String[] arrayOfString1 = zw.d(str1, ' ');
            i3 = 0;
            for (String str2 : arrayOfString1)
            {
              int i7 = str2.indexOf(':');
              if (i7 > 0)
              {
                int i8 = zauj.F(str2.substring(0, 0 + i7));
                int i9 = zauj.F(str2.substring(i7 + 1));
                i3 += i9 - i8 + 1;
              }
            }
            if (i3 < 1) {
              i3 = 32;
            }
          }
        }
        else if ("s".equals(paramzcjy.q()))
        {
          i2 = zauj.F(paramzcjy.t());
        }
        else if ("customFormat".equals(paramzcjy.q()))
        {
          bool2 = zauj.aB(paramzcjy.t());
        }
        else if ("ht".equals(paramzcjy.q()))
        {
          if (zarb.b(paramzcjy.t()))
          {
            double d1 = zauj.C(paramzcjy.t());
            if (d1 > 409.5D) {
              d1 = 409.5D;
            }
            this.z.e = ((short)(int)(d1 * 20.0D + 0.5D));
            i1 = 1;
          }
        }
        else if ("customHeight".equals(paramzcjy.q()))
        {
          bool3 = zauj.aB(paramzcjy.t());
        }
        else if ("hidden".equals(paramzcjy.q()))
        {
          this.z.b(zauj.aB(paramzcjy.t()));
        }
        else if ("outlineLevel".equals(paramzcjy.q()))
        {
          this.z.a((byte)zauj.H(paramzcjy.t()));
        }
        else if ("collapsed".equals(paramzcjy.q()))
        {
          this.z.a(zauj.aB(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    if ((bool1) && (!this.m.startRow(this.z.a)))
    {
      paramzcjy.a();
      return;
    }
    if (bool2) {
      if (i2 != -1)
      {
        Object localObject = this.a.d.get(Integer.valueOf(i2));
        if (localObject != null)
        {
          this.z.d = ((Integer)localObject).intValue();
          this.z.d(true);
        }
      }
      else
      {
        this.z.d(true);
      }
    }
    if (i1 != 0) {
      this.z.c(!bool3);
    } else if (!bool3) {
      this.z.c(true);
    }
    a(this.z, i3);
    if ((this.n) && (!this.m.processRow(this.k)))
    {
      if (this.D > -1) {
        this.e.c(this.D, 1);
      }
      paramzcjy.a();
      return;
    }
    this.B.a(0);
    if (paramzcjy.o())
    {
      paramzcjy.a();
    }
    else
    {
      this.E = -1;
      paramzcjy.d();
      while (paramzcjy.s() != 4)
      {
        paramzcjy.k();
        if (paramzcjy.s() != 1)
        {
          paramzcjy.a();
        }
        else if ("c".equals(paramzcjy.q()))
        {
          A(paramzcjy);
          this.B.a(this.B.a + 1);
        }
        else
        {
          paramzcjy.a();
        }
      }
      paramzcjy.h();
    }
    if (this.v.size() > 0)
    {
      a(this.B.a, Integer.MAX_VALUE);
      if (this.v.size() > 0) {
        b();
      }
    }
    a(this.z);
  }
  
  private void a(zbdx paramzbdx, int paramInt)
  {
    this.i.e(-1);
    this.D = this.e.a(paramzbdx.a, this.D);
    if (this.D > -1)
    {
      this.f = this.e.f(this.D);
      int i1 = this.f.a();
      if (i1 > 0)
      {
        this.j = this.i.f(this.i.a(-1, paramzbdx, Math.max(paramInt, i1)));
        this.j.a(-1, this.f, -1, i1, false);
      }
      else
      {
        this.j = this.i.f(this.i.a(-1, paramzbdx, paramInt));
      }
    }
    else
    {
      this.j = this.i.f(this.i.a(-1, paramzbdx, paramInt));
    }
    this.k = new Row(this.c, this.d, this.j, false);
  }
  
  private void a(zbdx paramzbdx)
  {
    if ((!this.n) || (this.j.a() > 0)) {
      if (this.D < 0)
      {
        this.D = this.e.a(-this.D - 1, this.j, false);
        this.e.f(this.D).l(0, 0);
      }
      else
      {
        this.f.b(paramzbdx, 13);
        if (!this.h)
        {
          this.f.e(-1);
          this.f.a(-1, this.j, -1, this.j.a(), false);
        }
        this.f.l(0, 0);
      }
    }
  }
  
  private void b()
  {
    for (int i1 = this.v.size() - 1; i1 > -1; i1--)
    {
      zaai localzaai = (zaai)this.v.get(i1);
      CellArea localCellArea;
      if (localzaai.a() != null) {
        localCellArea = localzaai.a().a();
      } else {
        localCellArea = localzaai.b().a;
      }
      if (localCellArea.EndRow <= this.y.a) {
        this.v.remove(i1);
      }
    }
  }
  
  private void c()
  {
    if (this.n)
    {
      if (!this.m.startRow(this.y.a))
      {
        if (this.v.size() > 0) {
          b();
        }
        return;
      }
      a(this.y, 0);
      if (!this.m.processRow(this.k))
      {
        if (this.D > -1) {
          this.e.c(this.D, 1);
        }
        if (this.v.size() > 0) {
          b();
        }
      }
    }
    else
    {
      a(this.y, 0);
    }
    this.E = -1;
    for (int i2 = this.v.size() - 1; i2 > -1; i2--)
    {
      zaai localzaai = (zaai)this.v.get(i2);
      CellArea localCellArea;
      if (localzaai.a() != null) {
        localCellArea = localzaai.a().a();
      } else {
        localCellArea = localzaai.b().a;
      }
      int i1 = localCellArea.EndColumn;
      this.B.a(localCellArea.StartColumn);
      while (this.B.a <= i1)
      {
        d();
        a(localzaai, null, null);
        zgs tmp213_210 = this.B;
        tmp213_210.a = ((short)(tmp213_210.a + 1));
      }
      if (localCellArea.EndRow <= this.y.a) {
        this.v.remove(i2);
      }
    }
    if (this.v.size() > 0) {
      b();
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    for (int i2 = this.v.size() - 1; i2 > -1; i2--)
    {
      zaai localzaai = (zaai)this.v.get(i2);
      CellArea localCellArea;
      if (localzaai.a() != null) {
        localCellArea = localzaai.a().a();
      } else {
        localCellArea = localzaai.b().a;
      }
      if ((localCellArea.EndColumn >= paramInt1) && (localCellArea.StartColumn <= paramInt2))
      {
        int i1 = Math.min(localCellArea.EndColumn, paramInt2);
        this.B.a(Math.max(localCellArea.StartColumn, paramInt1));
        while (this.B.a <= i1)
        {
          d();
          a(localzaai, null, null);
          zgs tmp133_130 = this.B;
          tmp133_130.a = ((short)(tmp133_130.a + 1));
        }
        if ((i1 == localCellArea.EndColumn) && (localCellArea.EndRow <= this.z.a)) {
          this.v.remove(i2);
        }
      }
    }
  }
  
  void a(zalh paramzalh)
  {
    this.H = paramzalh;
  }
  
  private int b(String paramString)
  {
    int i1 = 0;
    for (int i3 = 0; i3 < paramString.length(); i3++)
    {
      int i2 = (char)(paramString.charAt(i3) | 0x20);
      if ((i2 >= 97) && (i2 <= 122))
      {
        i1 = i1 * 26 + i2 - 97 + 1;
      }
      else if (i2 != 36)
      {
        if (i3 != 0) {
          break;
        }
        return this.B.a;
      }
    }
    if (i1 > 0) {
      i1--;
    }
    return i1;
  }
  
  private void A(zcjy paramzcjy)
    throws Exception
  {
    boolean bool1 = this.n;
    int i1 = -1;
    String str1 = "n";
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if (paramzcjy.q().length() != 1)
        {
          if ("ph".equals(paramzcjy.q())) {
            this.B.e = zauj.aB(paramzcjy.t());
          }
        }
        else {
          switch (paramzcjy.q().charAt(0))
          {
          case 'r': 
            short s1 = (short)b(paramzcjy.t());
            if (s1 < this.B.a) {
              throw new CellsException(6, "Invalid cell name");
            }
            if (s1 > this.B.a)
            {
              if (this.v.size() > 0) {
                a(this.B.a, s1 - 1);
              }
              this.B.a = s1;
            }
            if (bool1)
            {
              if (!this.m.startCell(s1))
              {
                paramzcjy.a();
                return;
              }
              bool1 = false;
            }
            break;
          case 's': 
            i1 = zauj.F(paramzcjy.t());
            break;
          case 't': 
            str1 = paramzcjy.t();
          }
        }
      }
      paramzcjy.l();
    }
    if ((bool1) && (!this.m.startCell(this.B.a)))
    {
      paramzcjy.a();
      return;
    }
    Object localObject1;
    if (i1 != -1)
    {
      localObject1 = this.a.d.get(Integer.valueOf(i1));
      if (localObject1 != null)
      {
        int i2 = ((Integer)localObject1).intValue();
        this.B.b = i2;
      }
    }
    else
    {
      this.B.b = 15;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      if (this.v.size() > 0)
      {
        localObject1 = f();
        if (localObject1 != null)
        {
          d();
          a((zaai)localObject1, null, str1);
          return;
        }
      }
      if ((this.o) && ((!this.x) || (this.a.e.get(Integer.valueOf(i1)) == null)) && ((i1 == -1) || (this.B.b != 15)))
      {
        d();
        e();
      }
    }
    else
    {
      d();
      localObject1 = null;
      String str2 = null;
      paramzcjy.d();
      Object localObject2;
      while (paramzcjy.s() != 4)
      {
        paramzcjy.k();
        if (paramzcjy.s() != 1)
        {
          paramzcjy.a();
        }
        else if ("v".equals(paramzcjy.q()))
        {
          paramzcjy.a(1);
          str2 = paramzcjy.j();
          paramzcjy.a(0);
          if (paramzcjy.s() == 3) {
            paramzcjy.a();
          }
        }
        else if ("f".equals(paramzcjy.q()))
        {
          if (!this.q)
          {
            paramzcjy.a();
          }
          else
          {
            localObject2 = paramzcjy.a("t");
            String str3;
            Object localObject3;
            if (localObject2 == null)
            {
              str3 = paramzcjy.j();
              if (str3.length() != 0)
              {
                localObject3 = new Cell(this.k, this.E, this.C, this.C == this.B);
                ((Cell)localObject3).b(str3);
              }
            }
            else
            {
              Object localObject4;
              Object localObject5;
              if ("array".equals(localObject2))
              {
                str3 = paramzcjy.a("ref");
                localObject3 = paramzcjy.j();
                if ((str3 != null) && (localObject3 != null))
                {
                  localObject4 = new Cell(this.k, this.E, this.C, this.C == this.B);
                  localObject5 = (CellArea)CellArea.a(str3, true);
                  this.c.p().y().a((Cell)localObject4, "=" + ((String)localObject3).trim(), ((CellArea)localObject5).f(), ((CellArea)localObject5).g());
                  ((zaai)this.C.d).b(true);
                  if (!((CellArea)localObject5).c()) {
                    zf.a(this.v, this.C.d);
                  }
                }
              }
              else if ("shared".equals(localObject2))
              {
                str3 = paramzcjy.a("ref");
                localObject3 = paramzcjy.a("si");
                localObject4 = paramzcjy.j();
                if ((str3 != null) && (localObject4 != null) && (!((String)localObject4).equals("")))
                {
                  localObject5 = new Cell(this.k, this.E, this.C, this.C == this.B);
                  CellArea localCellArea = (CellArea)CellArea.a(str3, true);
                  this.c.p().y().b((Cell)localObject5, "=" + ((String)localObject4).trim(), localCellArea.f(), localCellArea.g());
                  ((zaaj)this.C.d).a().a(localCellArea);
                  if (localObject3 != null) {
                    this.u.put(localObject3, this.C.d);
                  }
                }
                else if (localObject3 != null)
                {
                  localObject1 = this.u.get(localObject3);
                }
              }
              else if ("dataTable".equals(localObject2))
              {
                str3 = paramzcjy.a("ref");
                localObject3 = (CellArea)CellArea.a(str3, true);
                boolean bool3 = false;
                localObject5 = paramzcjy.a("del1");
                if (localObject5 != null) {
                  bool3 = zauj.aB((String)localObject5);
                }
                boolean bool4 = false;
                localObject5 = paramzcjy.a("del2");
                if (localObject5 != null) {
                  bool4 = zauj.aB((String)localObject5);
                }
                boolean bool5 = false;
                localObject5 = paramzcjy.a("dt2D");
                if (localObject5 != null) {
                  bool5 = zauj.aB((String)localObject5);
                }
                boolean bool6 = false;
                localObject5 = paramzcjy.a("dtr");
                if (localObject5 != null) {
                  bool6 = zauj.aB((String)localObject5);
                }
                boolean bool7 = false;
                localObject5 = paramzcjy.a("aca");
                if (localObject5 != null) {
                  bool7 = zauj.aB((String)localObject5);
                }
                String str4 = paramzcjy.a("r1");
                String str5 = paramzcjy.a("r2");
                Cell localCell = new Cell(this.k, this.E, this.C, this.C == this.B);
                zaal localzaal = localCell.a((CellArea)localObject3, bool5, bool6, str4, str5, bool3, bool4);
                localzaal.b().a(bool7);
                this.C.c = 5;
                this.C.d = localzaal;
                this.c.a.a(localzaal);
                paramzcjy.a();
                if (!((CellArea)localObject3).c()) {
                  zf.a(this.v, localzaal);
                }
              }
              else
              {
                str3 = paramzcjy.j();
                if (str3.length() != 0)
                {
                  localObject3 = new Cell(this.k, this.E, this.C, this.C == this.B);
                  ((Cell)localObject3).b(str3);
                }
              }
            }
          }
        }
        else if ("is".equals(paramzcjy.q()))
        {
          if ((this.t) && ("inlineStr".equals(str1)) && (this.H != null))
          {
            localObject2 = this.H.b(paramzcjy);
            this.C.c = 4;
            this.C.d = localObject2;
          }
          else
          {
            paramzcjy.a();
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
      paramzcjy.h();
      if (localObject1 != null)
      {
        a((zaai)localObject1, str2, str1);
      }
      else if (this.C.c == 5)
      {
        if (str2 != null) {
          if (str2.equals(""))
          {
            localObject2 = (zaai)this.C.d;
            ((zaai)localObject2).c = 4;
            ((zaai)localObject2).d = "";
          }
          else
          {
            a(str2, str1);
          }
        }
        if (!e()) {
          this.c.a.b(((zaai)this.C.d).a);
        }
      }
      else if (this.C.c == 4)
      {
        e();
      }
      else
      {
        if (this.v.size() > 0)
        {
          localObject2 = f();
          if (localObject2 != null)
          {
            a((zaai)localObject2, str2, str1);
            return;
          }
        }
        boolean bool2;
        if (zw.b(str2)) {
          bool2 = this.o;
        } else {
          bool2 = a(str2, str1);
        }
        if (bool2) {
          bool2 = e();
        } else {
          this.j.c(this.E, 1);
        }
        if ((!bool2) && (this.C.c == 4) && ("str".equals(str1))) {
          this.w.b(((zbbj)this.C.d).e);
        }
      }
    }
  }
  
  private void d()
  {
    this.E = this.j.a(this.B.a, this.E);
    if (this.E < 0) {
      this.E = this.j.a(-this.E - 1, this.B);
    } else {
      this.j.b(this.E, this.B, 6);
    }
    this.C = this.j.a(this.E, this.B, 6);
  }
  
  private boolean e()
  {
    this.j.b(this.E, this.C, 6);
    if (this.n) {
      if (!this.m.processCell(new Cell(this.k, this.E, this.C, this.C == this.B)))
      {
        this.j.c(this.E, 1);
        return false;
      }
    }
    if (this.C.a > this.F) {
      this.F = this.C.a;
    }
    return true;
  }
  
  private void a(zaai paramzaai, String paramString1, String paramString2)
  {
    zaai localzaai = new zaai(this.z.a, this.C.a);
    this.C.c = 5;
    this.C.d = localzaai;
    this.c.a.a(localzaai);
    if (paramString1 != null) {
      if (paramString1.equals(""))
      {
        localzaai.c = 4;
        localzaai.d = "";
      }
      else
      {
        a(paramString1, paramString2);
      }
    }
    if (paramzaai.k()) {
      localzaai.b(true);
    }
    byte[] arrayOfByte1 = paramzaai.b;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    localzaai.b = arrayOfByte2;
    if (this.n)
    {
      byte[] arrayOfByte3 = paramzaai.b;
      int i1 = paramzaai.e;
      short s1 = paramzaai.f;
      int i2 = paramzaai.c;
      Object localObject = paramzaai.d;
      paramzaai.e = localzaai.e;
      paramzaai.f = localzaai.f;
      paramzaai.c = localzaai.c;
      paramzaai.d = localzaai.d;
      if (paramzaai.a(this.c)) {
        paramzaai.b = this.c.p().y().a().a((byte)2, localzaai.e, localzaai.f);
      } else {
        paramzaai.b = this.c.p().y().a().a((byte)1, localzaai.e, localzaai.f);
      }
      this.C.d = paramzaai;
      if (e())
      {
        this.C.d = localzaai;
        this.j.b(this.E, this.C);
      }
      else
      {
        this.c.a.b(localzaai.a);
      }
      paramzaai.b = arrayOfByte3;
      paramzaai.e = i1;
      paramzaai.f = s1;
      paramzaai.c = i2;
      paramzaai.d = localObject;
    }
    else
    {
      e();
    }
  }
  
  private zaai f()
  {
    for (int i1 = this.v.size() - 1; i1 > -1; i1--)
    {
      zaai localzaai = (zaai)this.v.get(i1);
      CellArea localCellArea;
      if (localzaai.a() != null) {
        localCellArea = localzaai.a().a();
      } else {
        localCellArea = localzaai.b().a;
      }
      if (localCellArea.EndRow < this.z.a)
      {
        this.v.remove(i1);
        return null;
      }
      if (localCellArea.EndColumn == this.B.a)
      {
        if (localCellArea.EndRow == this.z.a) {
          this.v.remove(i1);
        }
        return localzaai;
      }
      if ((localCellArea.StartColumn <= this.B.a) && (localCellArea.EndColumn > this.B.a)) {
        return localzaai;
      }
    }
    return null;
  }
  
  private void a(int paramInt, Object paramObject)
  {
    if (this.C.c == 5)
    {
      zaai localzaai = (zaai)this.C.d;
      localzaai.c = paramInt;
      localzaai.d = paramObject;
    }
    else
    {
      this.C.c = paramInt;
      this.C.d = paramObject;
    }
  }
  
  private boolean a(String paramString1, String paramString2)
  {
    Object localObject1;
    switch (I.a(paramString2))
    {
    case 100: 
      if (("Infinity".equals(paramString1)) || ("NaN".equals(paramString1)))
      {
        if ((this.s) || (this.C.c == 5))
        {
          zuf localzuf = zuf.c;
          a(3, Byte.valueOf(ztr.b(localzuf)));
          return true;
        }
        return false;
      }
      if ((this.p) || (this.C.c == 5))
      {
        zayi.a(paramString1, this.A);
        a(this.A.c, this.A.d);
        return true;
      }
      return false;
    case 101: 
      if ((this.t) || (this.C.c == 5))
      {
        int i1 = zauj.F(paramString1);
        if (i1 >= 0)
        {
          Object localObject2;
          if (this.C.c == 5)
          {
            localObject2 = (zaai)this.C.d;
            ((zaai)localObject2).c = 4;
            zbbj localzbbj = this.w.a(i1);
            if (localzbbj != null) {
              ((zaai)localObject2).d = localzbbj.c;
            }
          }
          else
          {
            this.C.c = 4;
            localObject2 = this.w.a(i1);
            localObject2.d += 1;
            this.C.d = localObject2;
          }
          return true;
        }
        if ((this.o) || (this.C.c == 5)) {
          return true;
        }
      }
      return false;
    case 102: 
      if (this.C.c != 5)
      {
        if (this.t)
        {
          this.C.c = 4;
          localObject1 = this.w.a(paramString1);
          localObject1.d += 1;
          this.C.d = localObject1;
          return true;
        }
      }
      else
      {
        localObject1 = (zaai)this.C.d;
        ((zaai)localObject1).c = 4;
        ((zaai)localObject1).d = paramString1;
        return true;
      }
      return false;
    case 103: 
      if ((this.p) || (this.C.c == 5)) {
        try
        {
          localObject1 = DateTime.a(paramString1);
          a(1, Double.valueOf(CellsHelper.getDoubleFromDateTime((DateTime)localObject1, this.c.p().p().getSettings().getDate1904())));
          return true;
        }
        catch (Exception localException)
        {
          if ((this.o) || (this.C.c == 5)) {
            return true;
          }
        }
      }
      return false;
    case 104: 
      if ((this.s) || (this.C.c == 5))
      {
        a(3, Byte.valueOf(ztr.b(paramString1)));
        return true;
      }
      return false;
    case 105: 
      if ((this.r) || (this.C.c == 5))
      {
        a(2, Boolean.valueOf("1".equals(paramString1)));
        return true;
      }
      return false;
    }
    return (this.o) || (this.C.c == 5);
  }
  
  private void B(zcjy paramzcjy)
    throws Exception
  {
    if ((paramzcjy.o()) || ((this.l & 0x8000) == 0))
    {
      paramzcjy.a();
      return;
    }
    int i1 = -1;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("col".equals(paramzcjy.q())) {
        i1 = b(paramzcjy, i1);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private int b(zcjy paramzcjy, int paramInt)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return paramInt;
    }
    int i1 = -1;
    int i2 = -1;
    int i3 = -1;
    int i4 = -1;
    double d1 = -1.0D;
    int i5 = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    while (paramzcjy.m()) {
      switch (I.a(paramzcjy.q()))
      {
      case 106: 
        i1 = zauj.F(paramzcjy.t()) - 1;
        if (i2 == -1) {
          i2 = i1;
        }
        break;
      case 107: 
        i2 = zauj.F(paramzcjy.t()) - 1;
        break;
      case 108: 
        d1 = zauj.C(paramzcjy.t());
        i5 = 1;
        break;
      case 109: 
        i3 = zauj.F(paramzcjy.t());
        break;
      case 36: 
        bool1 = zauj.aB(paramzcjy.t());
        break;
      case 110: 
        bool2 = zauj.aB(paramzcjy.t());
        break;
      case 111: 
        i4 = zauj.H(paramzcjy.t());
        break;
      case 112: 
        bool3 = zauj.aB(paramzcjy.t());
        break;
      case 113: 
        bool4 = zauj.aB(paramzcjy.t());
      }
    }
    paramzcjy.l();
    paramzcjy.a();
    ColumnCollection localColumnCollection = this.c.getColumns();
    double d2 = localColumnCollection.b();
    double d3 = i5 != 0 ? a(d1) : d2;
    int i6 = 15;
    if (i3 != -1)
    {
      Object localObject = this.a.d.get(Integer.valueOf(i3));
      if (localObject != null) {
        i6 = ((Integer)localObject).intValue();
      }
    }
    for (int i7 = i1; i7 <= i2; i7++)
    {
      Column localColumn = null;
      if (i2 >= 16383)
      {
        localColumn = localColumnCollection.a();
        localColumn.a(i1);
      }
      else
      {
        this.G[i7] = i6;
        if (i1 < paramInt) {
          localColumn = localColumnCollection.get(i7);
        } else {
          localColumn = localColumnCollection.d(i7);
        }
      }
      localColumn.e(!bool2);
      if (i5 != 0) {
        localColumn.setWidth(d3);
      }
      localColumn.c(i6);
      if (i4 != -1) {
        localColumn.a((byte)i4);
      }
      localColumn.b(bool1);
      localColumn.c(bool3);
      localColumn.d(bool4);
      if (i2 >= 16383) {
        break;
      }
    }
    return paramInt > i2 ? paramInt : i2;
  }
  
  private double a(double paramDouble)
  {
    WorksheetCollection localWorksheetCollection = this.a.a.getWorksheets();
    int i1 = (int)(paramDouble * localWorksheetCollection.U() + 0.5D);
    return zlp.a(i1, localWorksheetCollection);
  }
  
  private void C(zcjy paramzcjy)
    throws Exception
  {
    if ((paramzcjy.o()) || ((this.l & 0x8000) == 0))
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
      } else if ("sheetView".equals(paramzcjy.q())) {
        D(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void D(zcjy paramzcjy)
    throws Exception
  {
    int i1 = 100;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("showGridLines".equals(paramzcjy.q()))
        {
          this.b.setGridlinesVisible(zauj.aB(paramzcjy.t()));
        }
        else if ("showRowColHeaders".equals(paramzcjy.q()))
        {
          this.b.setRowColumnHeadersVisible(zauj.aB(paramzcjy.t()));
        }
        else if ("tabSelected".equals(paramzcjy.q()))
        {
          this.b.setSelected(zauj.aB(paramzcjy.t()));
        }
        else if ("view".equals(paramzcjy.q()))
        {
          this.b.n = zauj.aC(paramzcjy.t());
        }
        else if ("zoomScale".equals(paramzcjy.q()))
        {
          i1 = zauj.F(paramzcjy.t());
        }
        else if ("zoomScaleNormal".equals(paramzcjy.q()))
        {
          this.b.y()[0] = zauj.F(paramzcjy.t());
        }
        else if ("zoomScaleSheetLayoutView".equals(paramzcjy.q()))
        {
          this.b.y()[1] = zauj.F(paramzcjy.t());
        }
        else if ("zoomScalePageLayoutView".equals(paramzcjy.q()))
        {
          this.b.y()[2] = zauj.F(paramzcjy.t());
        }
        else if ("topLeftCell".equals(paramzcjy.q()))
        {
          localObject = paramzcjy.t();
          int i2 = 0;
          int i3 = 0;
          int[] arrayOfInt1 = { i2 };
          int[] arrayOfInt2 = { i3 };
          CellsHelper.a((String)localObject, arrayOfInt1, arrayOfInt2);
          i2 = arrayOfInt1[0];
          i3 = arrayOfInt2[0];
          this.b.setFirstVisibleRow(i2);
          this.b.setFirstVisibleColumn(i3);
        }
        else if ("showRuler".equals(paramzcjy.q()))
        {
          this.b.setRulerVisible(zauj.aB(paramzcjy.t()));
        }
        else if ("showZeros".equals(paramzcjy.q()))
        {
          this.b.setDisplayZeros(zauj.aB(paramzcjy.t()));
        }
        else if ("rightToLeft".equals(paramzcjy.q()))
        {
          this.b.setDisplayRightToLeft(zauj.aB(paramzcjy.t()));
        }
        else if ("showOutlineSymbols".equals(paramzcjy.q()))
        {
          this.b.setOutlineShown(zauj.aB(paramzcjy.t()));
        }
        else if (!"defaultGridColor".equals(paramzcjy.q()))
        {
          if ("colorId".equals(paramzcjy.q())) {
            this.b.d(zauj.F(paramzcjy.t()));
          } else if ("showFormulas".equals(paramzcjy.q())) {
            this.b.setShowFormulas(zauj.aB(paramzcjy.t()));
          }
        }
      }
      paramzcjy.l();
    }
    this.b.setZoom(i1);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    Object localObject = new zro();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("pane".equals(paramzcjy.q()))
      {
        ((zro)localObject).a = E(paramzcjy);
      }
      else if ("selection".equals(paramzcjy.q()))
      {
        if (paramzcjy.n())
        {
          zrq localzrq = new zrq();
          localzrq.b = paramzcjy.a("activeCell");
          localzrq.d = paramzcjy.a("sqref");
          localzrq.a = paramzcjy.a("pane");
          String str = paramzcjy.a("activeCellId");
          if (str != null) {
            localzrq.c = zauj.F(str);
          }
          zf.a(((zro)localObject).b, localzrq);
        }
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    ((zro)localObject).a(this.b);
  }
  
  private zrp E(zcjy paramzcjy)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return null;
    }
    zrp localzrp = new zrp();
    while (paramzcjy.m()) {
      if ("activePane".equals(paramzcjy.q())) {
        localzrp.e = paramzcjy.t();
      } else if ("state".equals(paramzcjy.q())) {
        localzrp.a = paramzcjy.t();
      } else if ("topLeftCell".equals(paramzcjy.q())) {
        localzrp.d = paramzcjy.t();
      } else if ("xSplit".equals(paramzcjy.q())) {
        localzrp.b = zauj.C(paramzcjy.t());
      } else if ("ySplit".equals(paramzcjy.q())) {
        localzrp.c = zauj.C(paramzcjy.t());
      }
    }
    paramzcjy.l();
    paramzcjy.a();
    return localzrp;
  }
  
  private boolean F(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.a(0);
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"worksheet".equals(paramzcjy.q()))) {
      throw new CellsException(6, "Absent root element: worksheet");
    }
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (I.a(paramzcjy.p()))
        {
        case 114: 
        case 115: 
        case 116: 
        case 117: 
        case 118: 
          break;
        default: 
          zf.a(this.b.k.c, new zou(paramzcjy.p(), paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    return true;
  }
  
  void b(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    if ((this.l & 0x800) == 0)
    {
      paramzcjy.a();
      return;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    FormatConditionCollection localFormatConditionCollection = new FormatConditionCollection(this.b);
    int i1 = 0;
    ArrayList localArrayList = new ArrayList();
    int i2 = 0;
    String str1 = paramzcjy.a("pivot", "");
    if (str1 != null) {
      localFormatConditionCollection.d = zauj.aB(str1);
    }
    ConditionalFormattingCollection localConditionalFormattingCollection;
    if (!paramBoolean)
    {
      String str2 = paramzcjy.a("sqref", "");
      if ((str2 != null) && (str2.length() > 0)) {
        a(str2, localArrayList);
      }
      zf.a(localFormatConditionCollection.b, localArrayList);
      i1 = this.b.getConditionalFormattings().a(localFormatConditionCollection);
      localConditionalFormattingCollection = this.b.getConditionalFormattings();
      localFormatConditionCollection.a = localConditionalFormattingCollection;
      paramzcjy.d();
      while (paramzcjy.s() != 4)
      {
        paramzcjy.k();
        if (paramzcjy.s() != 1)
        {
          paramzcjy.a();
        }
        else if ("cfRule".equals(paramzcjy.q()))
        {
          boolean bool2 = a(paramzcjy, localFormatConditionCollection, false);
          if ((i2 == 0) && (bool2)) {
            i2 = 1;
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
      paramzcjy.d();
      while (paramzcjy.s() != 4)
      {
        paramzcjy.k();
        if (paramzcjy.s() != 1)
        {
          paramzcjy.a();
        }
        else if ("cfRule".equals(paramzcjy.q()))
        {
          boolean bool1 = a(paramzcjy, localFormatConditionCollection, true);
          if ((i2 == 0) && (bool1)) {
            i2 = 1;
          }
        }
        else if ("sqref".equals(paramzcjy.q()))
        {
          String str3 = paramzcjy.j();
          if ((str3 != null) && (str3.length() > 0)) {
            a(str3, localArrayList);
          }
          zf.a(localFormatConditionCollection.b, localArrayList);
          if (localFormatConditionCollection.getCount() > 0)
          {
            i1 = this.b.getConditionalFormattings().a(localFormatConditionCollection);
            localConditionalFormattingCollection = this.b.getConditionalFormattings();
            localFormatConditionCollection.a = localConditionalFormattingCollection;
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
      paramzcjy.h();
    }
    if (i2 == 0) {
      this.b.getConditionalFormattings().removeAt(i1);
    }
  }
  
  private void a(zcjy paramzcjy, FormatCondition paramFormatCondition)
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
      else if ("ext".equals(paramzcjy.q()))
      {
        paramzcjy.d();
        while (paramzcjy.s() != 4)
        {
          paramzcjy.k();
          if (paramzcjy.s() != 1)
          {
            paramzcjy.a();
          }
          else if ("id".equals(paramzcjy.q()))
          {
            String str = paramzcjy.j();
            paramFormatCondition.a(new zh(str.substring(1, 1 + (str.length() - 2))));
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
  
  private boolean a(zcjy paramzcjy, FormatConditionCollection paramFormatConditionCollection, boolean paramBoolean)
    throws Exception
  {
    String str1 = null;
    int i2 = 6;
    boolean bool = false;
    String[] arrayOfString = new String[2];
    int i3 = -1;
    int i4 = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    String str8 = null;
    String str9 = null;
    String str10 = null;
    String str11 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (I.a(paramzcjy.q()))
        {
        case 119: 
          i4 = zauj.F(paramzcjy.t());
          break;
        case 120: 
          str1 = paramzcjy.t();
          break;
        case 121: 
          i3 = zauj.F(paramzcjy.t());
          break;
        case 122: 
          str11 = paramzcjy.t();
          break;
        case 123: 
          bool = true;
          break;
        case 124: 
          str2 = paramzcjy.t();
          break;
        case 125: 
          str4 = paramzcjy.t();
          break;
        case 126: 
          str3 = paramzcjy.t();
          break;
        case 127: 
          str5 = paramzcjy.t();
          break;
        case 128: 
          str6 = paramzcjy.t();
          break;
        case 129: 
          str7 = paramzcjy.t();
          break;
        case 130: 
          str8 = paramzcjy.t();
          break;
        case 131: 
          str9 = paramzcjy.t();
          break;
        case 83: 
          str10 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    int i1;
    if (zauj.J(str1))
    {
      i1 = zauj.K(str1);
    }
    else
    {
      paramzcjy.a();
      return false;
    }
    if ((str11 != null) && (("cellIs".equals(str1)) || ("expression".equals(str1)))) {
      i2 = zauj.h(str11);
    }
    int i5 = 0;
    IconSet localIconSet = null;
    ColorScale localColorScale = null;
    DataBar localDataBar = null;
    Style localStyle = null;
    if (!paramzcjy.o())
    {
      paramzcjy.d();
      int i6 = 0;
      while (paramzcjy.s() != 4)
      {
        paramzcjy.k();
        if (paramzcjy.s() != 1)
        {
          paramzcjy.a();
        }
        else if ((("formula".equals(paramzcjy.q())) || ("f".equals(paramzcjy.q()))) && (i6 < 2))
        {
          arrayOfString[(i6++)] = ("=" + paramzcjy.j());
        }
        else
        {
          Object localObject;
          if ("iconSet".equals(paramzcjy.q()))
          {
            i5 = paramFormatConditionCollection.addCondition(i1);
            localObject = paramFormatConditionCollection.get(i5);
            localIconSet = c(paramzcjy, (FormatCondition)localObject);
            ((FormatCondition)localObject).a(localIconSet);
          }
          else if ("colorScale".equals(paramzcjy.q()))
          {
            i5 = paramFormatConditionCollection.addCondition(i1);
            localObject = paramFormatConditionCollection.get(i5);
            localColorScale = d(paramzcjy, (FormatCondition)localObject);
            if (localColorScale != null) {
              ((FormatCondition)localObject).a(localColorScale);
            }
          }
          else if ("dataBar".equals(paramzcjy.q()))
          {
            if (!paramBoolean)
            {
              i5 = paramFormatConditionCollection.addCondition(i1);
              localObject = paramFormatConditionCollection.get(i5);
              localDataBar = a(paramzcjy, (FormatCondition)localObject, paramBoolean);
              ((FormatCondition)localObject).a(localDataBar);
            }
            else
            {
              localObject = null;
              int i7 = this.b.getConditionalFormattings().getCount();
              if ((i7 > 0) && (str10 != null))
              {
                zh localzh = new zh(str10.substring(1, 1 + (str10.length() - 2)));
                for (int i8 = 0; i8 < i7; i8++)
                {
                  FormatConditionCollection localFormatConditionCollection = this.b.getConditionalFormattings().get(i8);
                  for (int i9 = 0; i9 < localFormatConditionCollection.getCount(); i9++)
                  {
                    FormatCondition localFormatCondition2 = localFormatConditionCollection.get(i9);
                    if (localFormatCondition2.b().equals(localzh))
                    {
                      localObject = localFormatCondition2;
                      break;
                    }
                  }
                  if (localObject != null) {
                    break;
                  }
                }
                if (localObject != null)
                {
                  localDataBar = a(paramzcjy, (FormatCondition)localObject, paramBoolean);
                  ((FormatCondition)localObject).a(localDataBar);
                }
                else
                {
                  paramzcjy.a();
                }
              }
              else
              {
                paramzcjy.a();
              }
            }
          }
          else if ("dxf".equals(paramzcjy.q()))
          {
            localObject = zalk.a(this.b.c(), paramzcjy);
            localStyle = new Style(this.b.c());
            a(localStyle, (zpc)localObject);
          }
          else if (("extLst".equals(paramzcjy.q())) && (!paramBoolean))
          {
            localObject = paramFormatConditionCollection.get(i5);
            if (((FormatCondition)localObject).getType() == 3) {
              a(paramzcjy, (FormatCondition)localObject);
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
      paramzcjy.h();
    }
    else
    {
      paramzcjy.a();
    }
    if ((i1 == 0) || (i1 == 1))
    {
      i5 = paramFormatConditionCollection.addCondition(i1, i2, arrayOfString[0], arrayOfString[1]);
    }
    else if ((i1 != 4) && (i1 != 3) && (i1 != 2))
    {
      i5 = paramFormatConditionCollection.addCondition(i1);
      FormatCondition localFormatCondition1 = paramFormatConditionCollection.get(i5);
      if (i1 == 5)
      {
        if (str4 != null) {
          localFormatCondition1.getTop10().setRank(zauj.F(str4));
        }
        if ("1".equals(str6)) {
          localFormatCondition1.getTop10().setBottom(true);
        }
        if ("1".equals(str5)) {
          localFormatCondition1.getTop10().setPercent(true);
        }
      }
      else if (i1 == 17)
      {
        if ("0".equals(str7)) {
          localFormatCondition1.getAboveAverage().setAboveAverage(false);
        }
        if ("1".equals(str8)) {
          localFormatCondition1.getAboveAverage().setEqualAverage(true);
        }
        if (str9 != null) {
          localFormatCondition1.getAboveAverage().setStdDev(zauj.F(str9));
        }
      }
      if (str2 != null) {
        localFormatCondition1.setText(str2);
      }
      if (str3 != null) {
        localFormatCondition1.setTimePeriod(zauj.ad(str3));
      }
      if (arrayOfString[0] != null) {
        localFormatCondition1.setFormula1(arrayOfString[0]);
      }
      if (arrayOfString[1] != null) {
        localFormatCondition1.setFormula2(arrayOfString[1]);
      }
    }
    if (paramFormatConditionCollection.getCount() > 0)
    {
      paramFormatConditionCollection.get(i5).setStopIfTrue(bool);
      paramFormatConditionCollection.get(i5).setPriority((short)i4);
      if ((i3 != -1) && (i3 < this.b.c().getDxfs().getCount()))
      {
        paramFormatConditionCollection.get(i5).a(i3);
        paramFormatConditionCollection.get(i5).setStyle(new Style(this.b.c()));
        paramFormatConditionCollection.get(i5).getStyle().copy(this.b.c().getDxfs().get(i3));
      }
      else if (localStyle != null)
      {
        paramFormatConditionCollection.get(i5).setStyle(localStyle);
      }
    }
    if (i4 > paramFormatConditionCollection.e.f()) {
      paramFormatConditionCollection.e.a(i4);
    }
    return true;
  }
  
  private void a(zcjy paramzcjy, ConditionalFormattingIcon paramConditionalFormattingIcon)
    throws Exception
  {
    String str1 = paramzcjy.a("iconSet");
    String str2 = paramzcjy.a("iconId");
    paramConditionalFormattingIcon.setType(zauj.Z(str1));
    paramConditionalFormattingIcon.setIndex(ze.f(str2));
    paramzcjy.a();
  }
  
  private ConditionalFormattingValue b(zcjy paramzcjy, FormatCondition paramFormatCondition)
    throws Exception
  {
    ConditionalFormattingValue localConditionalFormattingValue = new ConditionalFormattingValue(paramFormatCondition);
    String str1 = paramzcjy.a("gte");
    if ("0".equals(str1)) {
      localConditionalFormattingValue.setGTE(false);
    }
    String str2 = paramzcjy.a("type");
    localConditionalFormattingValue.setType(zauj.ac(str2));
    if ("x14".equals(paramzcjy.r()))
    {
      if ((localConditionalFormattingValue.getType() != 2) && (localConditionalFormattingValue.getType() != 1) && (localConditionalFormattingValue.getType() != 6) && (localConditionalFormattingValue.getType() != 7))
      {
        paramzcjy.d();
        while (paramzcjy.s() != 4)
        {
          paramzcjy.k();
          if (paramzcjy.s() != 1) {
            paramzcjy.a();
          } else if ("f".equals(paramzcjy.q())) {
            localConditionalFormattingValue.a(paramzcjy.j());
          } else {
            paramzcjy.a();
          }
        }
        paramzcjy.h();
      }
      else
      {
        if (paramzcjy.a("type") != null) {
          localConditionalFormattingValue.setType(zauj.ac(paramzcjy.a("type")));
        }
        paramzcjy.a();
      }
    }
    else
    {
      if (paramzcjy.a("val") != null) {
        localConditionalFormattingValue.a(paramzcjy.a("val"));
      }
      paramzcjy.a();
    }
    return localConditionalFormattingValue;
  }
  
  private IconSet c(zcjy paramzcjy, FormatCondition paramFormatCondition)
    throws Exception
  {
    IconSet localIconSet = new IconSet(paramFormatCondition);
    String str1 = paramzcjy.a("iconSet");
    String str2 = paramzcjy.a("showValue");
    String str3 = paramzcjy.a("reverse");
    if (str1 != null) {
      localIconSet.a(zauj.Z(str1));
    }
    if ("0".equals(str2)) {
      localIconSet.setShowValue(false);
    }
    if ("1".equals(str3)) {
      localIconSet.b = true;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localIconSet;
    }
    int i1 = 0;
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
        if ("cfvo".equals(paramzcjy.q()))
        {
          localObject = b(paramzcjy, paramFormatCondition);
          localIconSet.getCfvos().a((ConditionalFormattingValue)localObject);
        }
        else if ("cfIcon".equals(paramzcjy.q()))
        {
          localObject = localIconSet.getCfIcons().get(i1);
          a(paramzcjy, (ConditionalFormattingIcon)localObject);
          i1++;
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    return localIconSet;
  }
  
  private ColorScale d(zcjy paramzcjy, FormatCondition paramFormatCondition)
    throws Exception
  {
    ColorScale localColorScale = new ColorScale(this.b.c().p(), paramFormatCondition);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    ConditionalFormattingValueCollection localConditionalFormattingValueCollection = new ConditionalFormattingValueCollection(paramFormatCondition);
    ArrayList localArrayList = new ArrayList(3);
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
        if ("cfvo".equals(paramzcjy.q()))
        {
          localObject = b(paramzcjy, paramFormatCondition);
          localConditionalFormattingValueCollection.a((ConditionalFormattingValue)localObject);
        }
        else if ("color".equals(paramzcjy.q()))
        {
          localObject = zalk.g(paramzcjy);
          zf.a(localArrayList, localObject);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (localConditionalFormattingValueCollection.getCount() == 2)
    {
      localColorScale.a = localConditionalFormattingValueCollection.get(0);
      localColorScale.c = localConditionalFormattingValueCollection.get(1);
      localColorScale.a((zaml)localArrayList.get(0));
      localColorScale.c((zaml)localArrayList.get(1));
    }
    else if (localConditionalFormattingValueCollection.getCount() == 3)
    {
      localColorScale.a = localConditionalFormattingValueCollection.get(0);
      localColorScale.b = localConditionalFormattingValueCollection.get(1);
      localColorScale.c = localConditionalFormattingValueCollection.get(2);
      localColorScale.a((zaml)localArrayList.get(0));
      localColorScale.b((zaml)localArrayList.get(1));
      if (localArrayList.size() > 2) {
        localColorScale.c((zaml)localArrayList.get(2));
      }
    }
    else
    {
      localColorScale = null;
    }
    return localColorScale;
  }
  
  private DataBar a(zcjy paramzcjy, FormatCondition paramFormatCondition, boolean paramBoolean)
    throws Exception
  {
    DataBar localDataBar = null;
    if (!paramBoolean) {
      localDataBar = new DataBar(this.b.c().p(), paramFormatCondition);
    } else {
      localDataBar = paramFormatCondition.getDataBar();
    }
    Object localObject;
    if (paramBoolean)
    {
      str1 = paramzcjy.a("gradient");
      str2 = paramzcjy.a("border");
      str3 = paramzcjy.a("direction");
      localObject = paramzcjy.a("negativeBarColorSameAsPositive");
      String str4 = paramzcjy.a("negativeBarBorderColorSameAsPositive");
      String str5 = paramzcjy.a("axisPosition");
      if (str1 != null) {
        localDataBar.setBarFillType(zauj.aB(str1) ? 1 : 0);
      }
      if (str2 != null) {
        localDataBar.getBarBorder().setType(zauj.aB(str2) ? 1 : 0);
      }
      if (str3 != null) {
        localDataBar.setDirection(zauj.aa(str3));
      }
      if (str5 != null) {
        localDataBar.setAxisPosition(zauj.ab(str5));
      } else {
        localDataBar.setAxisPosition(0);
      }
      if (localObject == null) {
        localDataBar.getNegativeBarFormat().setColorType(0);
      } else {
        localDataBar.getNegativeBarFormat().setColorType(zauj.aB((String)localObject) ? 1 : 0);
      }
      if (str4 != null) {
        localDataBar.getNegativeBarFormat().setBorderColorType(zauj.aB(str4) ? 1 : 0);
      }
    }
    String str1 = paramzcjy.a("minLength");
    String str2 = paramzcjy.a("maxLength");
    String str3 = paramzcjy.a("showValue");
    if (str1 != null) {
      localDataBar.setMinLength(zauj.F(str1));
    }
    if (str2 != null) {
      localDataBar.setMaxLength(zauj.F(str2));
    }
    if ("0".equals(str3)) {
      localDataBar.setShowValue(false);
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localDataBar;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("cfvo".equals(paramzcjy.q()))
      {
        localObject = b(paramzcjy, paramFormatCondition);
        if (((ConditionalFormattingValue)localObject).getType() == 7) {
          localDataBar.a = null;
        }
        if (localDataBar.a == null) {
          localDataBar.a = ((ConditionalFormattingValue)localObject);
        } else {
          localDataBar.b = ((ConditionalFormattingValue)localObject);
        }
      }
      else if ("color".equals(paramzcjy.q()))
      {
        localDataBar.b(zalk.g(paramzcjy));
      }
      else if ("negativeBorderColor".equals(paramzcjy.q()))
      {
        localDataBar.getNegativeBarFormat().a(zalk.g(paramzcjy));
      }
      else if ("negativeFillColor".equals(paramzcjy.q()))
      {
        localDataBar.getNegativeBarFormat().b(zalk.g(paramzcjy));
      }
      else if ("axisColor".equals(paramzcjy.q()))
      {
        localDataBar.a(zalk.g(paramzcjy));
      }
      else if ("borderColor".equals(paramzcjy.q()))
      {
        localDataBar.getBarBorder().a(zalk.g(paramzcjy));
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    return localDataBar;
  }
  
  static void a(Style paramStyle, zpc paramzpc)
  {
    paramStyle.a((byte)0);
    if (paramzpc.b != null) {
      if (paramzpc.b.c != null) {
        zoy.a(paramzpc.b.c, paramStyle);
      } else if (paramzpc.b.b != null) {
        paramzpc.b.b.b(paramStyle);
      }
    }
    if (paramzpc.a != null) {
      paramzpc.a.a(paramStyle);
    }
    if (paramzpc.c != null) {
      paramzpc.c.a(paramStyle);
    }
    if (paramzpc.d != null)
    {
      zzw localzzw = paramzpc.d;
      if ((localzzw.b() > 0) || ((localzzw.a() != null) && (localzzw.a().length() > 0))) {
        paramStyle.b(localzzw.b(), localzzw.a());
      }
    }
    if (paramzpc.e != null) {
      paramzpc.e.a(paramStyle, true);
    }
    if (paramzpc.f != null) {
      paramzpc.f.a(paramStyle);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */