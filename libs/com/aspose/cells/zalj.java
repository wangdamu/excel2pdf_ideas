package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zalj
{
  private String a;
  private zqh b;
  private zbpq c;
  private zbpp d;
  private String e;
  private static final za f = new za(new String[] { "pivotCacheId", "sortOrder", "customListSort", "crossFilter", "showMissing", "x", "s", "nd", "tabId", "name", "sourceName" });
  
  zalj(zqh paramzqh, String paramString1, String paramString2)
  {
    this.e = paramString2;
    this.b = paramzqh;
    this.a = paramString1;
    this.c = paramzqh.a.getWorksheets().J();
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    this.d = new zbpp(this.c);
    this.d.a = this.e;
    this.c.a(this.d);
    f(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    if (("slicerCacheDefinition".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
      e(paramzcjy);
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("pivotTables".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        c(paramzcjy);
      } else if (("data".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        b(paramzcjy);
      } else if (("extLst".equals(paramzcjy.q())) && (paramzcjy.s() == 1) && (!paramzcjy.o())) {
        this.d.g = paramzcjy.v();
      }
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
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("tabular".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        this.d.h = 1;
        a(paramzcjy, this.d);
      }
      else if (("olap".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        if (!paramzcjy.o())
        {
          this.d.h = 0;
          this.d.p = paramzcjy.v();
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zbpp paramzbpp)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (f.a(paramzcjy.q()))
        {
        case 0: 
          paramzbpp.i = zauj.G(paramzcjy.t());
          break;
        case 1: 
          if ("descending".equals(paramzcjy.t())) {
            paramzbpp.j = 1;
          } else {
            paramzbpp.j = 0;
          }
          break;
        case 2: 
          if ("0".equals(paramzcjy.t())) {
            paramzbpp.k = false;
          } else {
            paramzbpp.k = true;
          }
          break;
        case 3: 
          if ("none".equals(paramzcjy.t())) {
            paramzbpp.l = 0;
          } else if ("showItemsWithNoData".equals(paramzcjy.t())) {
            paramzbpp.l = 2;
          } else {
            paramzbpp.l = 1;
          }
          break;
        case 4: 
          if ("0".equals(paramzcjy.t())) {
            paramzbpp.m = false;
          } else {
            paramzbpp.m = true;
          }
          break;
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
      if (("items".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        b(paramzcjy, paramzbpp);
      } else if (("extLst".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        if (!paramzcjy.o()) {
          paramzbpp.o = paramzcjy.v();
        }
      }
      else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void b(zcjy paramzcjy, zbpp paramzbpp)
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
      } else if (("i".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        c(paramzcjy, paramzbpp);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void c(zcjy paramzcjy, zbpp paramzbpp)
    throws Exception
  {
    zbps localzbps = new zbps(paramzbpp.e());
    paramzbpp.e().a(localzbps);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (f.a(paramzcjy.q()))
        {
        case 5: 
          localzbps.a = zauj.F(paramzcjy.t());
          break;
        case 6: 
          if ("1".equals(paramzcjy.t())) {
            localzbps.b = true;
          } else {
            localzbps.b = false;
          }
          break;
        case 7: 
          if ("1".equals(paramzcjy.t())) {
            localzbps.c = true;
          } else {
            localzbps.c = false;
          }
          break;
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
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
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("pivotTable".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        d(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    zbpu localzbpu = new zbpu(this.d.j());
    this.d.j().a(localzbpu);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (f.a(paramzcjy.q()))
        {
        case 8: 
          localzbpu.a(zauj.F(paramzcjy.t()));
          break;
        case 9: 
          localzbpu.a(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (f.a(paramzcjy.q()))
        {
        case 9: 
          this.d.a(paramzcjy.t());
          break;
        case 10: 
          this.d.f = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
  }
  
  private void f(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"slicerCacheDefinition".equals(paramzcjy.q()))) {
      throw new IllegalStateException("slicerCacheDefinition root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */