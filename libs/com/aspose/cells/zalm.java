package com.aspose.cells;

class zalm
{
  private zqi a;
  private Worksheet b;
  
  zalm(zqi paramzqi)
  {
    this.a = paramzqi;
    this.b = paramzqi.d;
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"singleXmlCells".equals(paramzcjy.q()))) {
      throw new IllegalStateException("singleXmlCells root element error");
    }
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    if (!paramzcjy.n()) {
      return;
    }
    while (paramzcjy.m()) {}
    paramzcjy.l();
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    b(paramzcjy);
    c(paramzcjy);
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
      } else if ("singleXmlCell".equals(paramzcjy.q())) {
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
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    zbpn localzbpn = new zbpn(this.b);
    this.b.l().a(localzbpn);
    b(paramzcjy, localzbpn);
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
      } else if ("xmlCellPr".equals(paramzcjy.q())) {
        a(paramzcjy, localzbpn);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zbpn paramzbpn)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzbpn.a(new zcji());
    a(paramzcjy, paramzbpn.d());
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("xmlPr".equals(paramzcjy.q()))
      {
        XmlColumnProperty localXmlColumnProperty = new XmlColumnProperty();
        paramzbpn.d().a(localXmlColumnProperty);
        localXmlColumnProperty.a(zauj.F(paramzcjy.a("mapId")));
        localXmlColumnProperty.a(paramzcjy.a("xpath"));
        localXmlColumnProperty.b(ztr.a(paramzcjy.a("xmlDataType")));
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zcji paramzcji)
    throws Exception
  {
    if (!paramzcjy.n()) {
      return;
    }
    while (paramzcjy.m()) {
      if ("id".equals(paramzcjy.q())) {
        paramzcji.a(zauj.F(paramzcjy.t()));
      } else if ("uniqueName".equals(paramzcjy.q())) {
        paramzcji.a(paramzcjy.t());
      }
    }
    paramzcjy.l();
  }
  
  private void b(zcjy paramzcjy, zbpn paramzbpn)
    throws Exception
  {
    if (!paramzcjy.n()) {
      return;
    }
    while (paramzcjy.m()) {
      if ("id".equals(paramzcjy.q()))
      {
        paramzbpn.a(zauj.F(paramzcjy.t()));
        if (paramzbpn.a() > this.b.c().e) {
          this.b.c().e = paramzbpn.a();
        }
      }
      else if ("r".equals(paramzcjy.q()))
      {
        paramzbpn.a(paramzcjy.t());
      }
      else if ("connectionId".equals(paramzcjy.q()))
      {
        paramzbpn.b(zauj.F(paramzcjy.t()));
      }
    }
    paramzcjy.l();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */