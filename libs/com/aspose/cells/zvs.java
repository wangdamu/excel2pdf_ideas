package com.aspose.cells;

import java.util.Iterator;

class zvs
  extends ztp
{
  private zpu b;
  private Worksheet c;
  
  zvs(zpu paramzpu)
  {
    this.b = paramzpu;
    this.c = paramzpu.a;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("singleXmlCells");
    paramzcjz.a("xmlns", zaty.a);
    Iterator localIterator = this.c.l().iterator();
    while (localIterator.hasNext())
    {
      zbpn localzbpn = (zbpn)localIterator.next();
      a(paramzcjz, localzbpn);
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void a(zcjz paramzcjz, zbpn paramzbpn)
    throws Exception
  {
    paramzcjz.b("singleXmlCell");
    paramzcjz.a("id", zauj.z(paramzbpn.a()));
    paramzcjz.a("r", paramzbpn.b());
    paramzcjz.a("connectionId", zauj.z(paramzbpn.c()));
    a(paramzcjz, paramzbpn.d());
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zcji paramzcji)
    throws Exception
  {
    paramzcjz.b("xmlCellPr");
    paramzcjz.a("id", zauj.z(paramzcji.a()));
    if ((paramzcji.b() != null) && (paramzcji.b().length() > 0)) {
      paramzcjz.a("uniqueName", paramzcji.b());
    }
    a(paramzcjz, paramzcji.c());
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, XmlColumnProperty paramXmlColumnProperty)
    throws Exception
  {
    paramzcjz.b("xmlPr");
    paramzcjz.a("mapId", zauj.z(paramXmlColumnProperty.a()));
    paramzcjz.a("xpath", paramXmlColumnProperty.b());
    paramzcjz.a("xmlDataType", ztr.a(paramXmlColumnProperty.c()));
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */