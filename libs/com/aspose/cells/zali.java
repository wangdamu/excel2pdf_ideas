package com.aspose.cells;

import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zali
{
  zqh a = null;
  private zqi b;
  private String c;
  private zbpr d;
  private zbpo e;
  private String f;
  private static final za g = new za(new String[] { "name", "cache", "caption", "startItem", "columnCount", "showCaption", "lockedPosition", "style", "rowHeight", "level" });
  
  zali(zqh paramzqh, zqi paramzqi, String paramString1, String paramString2)
  {
    this.a = paramzqh;
    this.b = paramzqi;
    this.c = paramString1;
    this.d = this.b.d.x();
    this.f = paramString2;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    d(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    if (("slicers".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
      c(paramzcjy);
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("slicer".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        b(paramzcjy);
      }
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    this.e = new zbpo(this.d);
    this.e.a = this.f;
    this.d.a(this.e);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 0: 
          this.e.b(paramzcjy.t());
          break;
        case 1: 
          this.e.c(paramzcjy.t());
          break;
        case 2: 
          this.e.d(paramzcjy.t());
          break;
        case 3: 
          this.e.a(zauj.F(paramzcjy.t()));
          break;
        case 4: 
          this.e.f = zauj.F(paramzcjy.t());
          break;
        case 5: 
          if ("0".equals(paramzcjy.t())) {
            this.e.a(false);
          } else {
            this.e.a(true);
          }
          break;
        case 6: 
          if ("0".equals(paramzcjy.t())) {
            this.e.b(false);
          } else {
            this.e.b(true);
          }
          break;
        case 7: 
          this.e.a(paramzcjy.t());
          break;
        case 8: 
          this.e.i = zauj.F(paramzcjy.t());
          break;
        case 9: 
          this.e.m = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    this.b.o.put(this.e.b, this.e.p);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("extLst".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        if (!paramzcjy.o()) {
          this.e.l = paramzcjy.v();
        }
      }
      else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.l();
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"slicers".equals(paramzcjy.q()))) {
      throw new IllegalStateException("slicers root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zali.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */