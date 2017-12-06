package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zala
{
  private zqi a = null;
  private Worksheet b = null;
  private Object c = null;
  private String d = null;
  private zcjm e = null;
  private QueryTable f = null;
  private static final za g = new za(new String[] { "queryTable", "preserveFormatting", "adjustColumnWidth", "applyAlignmentFormats", "applyBorderFormats", "applyFontFormats", "applyNumberFormats", "applyPatternFormats", "applyProtectionFormats", "applyWidthHeightFormats", "autoFormatId", "disableRefresh", "disableEdit", "fillFormulas", "growShrinkType", "headers", "name", "refreshOnLoad", "removeDataOnSave", "rowNumbers", "backgroundRefresh", "firstBackgroundRefresh", "intermediate", "connectionId", "insertClear", "insertDelete", "overwriteClear", "queryTableRefresh", "extLst", "nextId", "unboundColumnsRight", "unboundColumnsLeft", "queryTableFields", "queryTableDeletedFields", "sortState", "queryTableField", "deletedField", "id", "tableColumnId", "clipped", "dataBound" });
  
  zala(zqi paramzqi, Object paramObject, String paramString)
  {
    this.c = paramObject;
    this.a = paramzqi;
    this.b = paramzqi.d;
    this.d = paramString;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    this.f = new QueryTable(this.c);
    this.f.b = this.d;
    if ((this.c instanceof ListObject)) {
      ((ListObject)this.c).b = this.f;
    } else {
      this.b.getQueryTables().a(this.f);
    }
    paramzcjy.k();
    while (zauz.a(paramzcjy)) {
      switch (g.a(paramzcjy.q()))
      {
      case 0: 
        b(paramzcjy);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 1: 
          this.f.setPreserveFormatting(zauj.b(paramzcjy.t(), true));
          break;
        case 2: 
          this.f.setAdjustColumnWidth(zauj.b(paramzcjy.t(), true));
          break;
        case 3: 
          this.f.m(zauj.b(paramzcjy.t(), false));
          break;
        case 4: 
          this.f.n(zauj.b(paramzcjy.t(), false));
          break;
        case 5: 
          this.f.l(zauj.b(paramzcjy.t(), false));
          break;
        case 6: 
          this.f.k(zauj.b(paramzcjy.t(), false));
          break;
        case 7: 
          this.f.o(zauj.b(paramzcjy.t(), false));
          break;
        case 8: 
          this.f.p(zauj.b(paramzcjy.t(), false));
          break;
        case 9: 
          this.f.q(zauj.b(paramzcjy.t(), false));
          break;
        case 10: 
          this.f.d = zauj.F(paramzcjy.t());
          break;
        case 11: 
          this.f.c(zauj.b(paramzcjy.t(), false));
          break;
        case 12: 
          this.f.i(zauj.b(paramzcjy.t(), false));
          break;
        case 13: 
          this.f.g(zauj.b(paramzcjy.t(), false));
          break;
        case 14: 
          switch (g.a(paramzcjy.t()))
          {
          case 24: 
            this.f.a(1);
            break;
          case 25: 
            this.f.a(1);
            break;
          case 26: 
            this.f.a(2);
          }
          break;
        case 15: 
          this.f.a(zauj.b(paramzcjy.t(), false));
          break;
        case 16: 
          this.f.f = paramzcjy.t();
          break;
        case 17: 
          this.f.f(zauj.b(paramzcjy.t(), false));
          break;
        case 18: 
          this.f.h(!zauj.b(paramzcjy.t(), false));
          break;
        case 19: 
          this.f.b(!zauj.b(paramzcjy.t(), false));
          break;
        case 20: 
          this.f.d(zauj.b(paramzcjy.t(), true));
          break;
        case 21: 
          this.f.e(zauj.b(paramzcjy.t(), false));
          break;
        case 22: 
          this.f.j(zauj.b(paramzcjy.t(), false));
          break;
        case 23: 
          this.f.e = zauj.F(paramzcjy.t());
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
      switch (g.a(paramzcjy.q()))
      {
      case 27: 
        c(paramzcjy);
        break;
      case 28: 
        this.f.j = paramzcjy.i();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n()) {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 29: 
          this.f.k = zauj.F(paramzcjy.t());
          break;
        case 30: 
          this.f.n = zauj.F(paramzcjy.t());
          break;
        case 31: 
          this.f.m = zauj.F(paramzcjy.t());
        }
      }
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (g.a(paramzcjy.q()))
      {
      case 32: 
        a(paramzcjy, this.f.c());
        break;
      case 33: 
        a(paramzcjy, this.f.d());
        break;
      case 34: 
        zalu.a(paramzcjy, this.f.b());
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, zayf paramzayf)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (g.a(paramzcjy.q()))
      {
      case 35: 
      case 36: 
        b(paramzcjy, paramzayf);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private zaye b(zcjy paramzcjy, zayf paramzayf)
    throws Exception
  {
    zaye localzaye = new zaye();
    paramzayf.a(localzaye);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 37: 
          localzaye.a = zauj.F(paramzcjy.t());
          break;
        case 16: 
          localzaye.b = paramzcjy.t();
          break;
        case 38: 
          localzaye.c = zauj.F(paramzcjy.t());
          break;
        case 39: 
          localzaye.d(zauj.b(paramzcjy.t(), false));
          break;
        case 40: 
          localzaye.a(zauj.b(paramzcjy.t(), true));
          break;
        case 19: 
          localzaye.c(zauj.b(paramzcjy.t(), false));
          break;
        case 13: 
          localzaye.b(zauj.b(paramzcjy.t(), false));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzaye;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zala.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */