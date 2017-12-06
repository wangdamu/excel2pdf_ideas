package com.aspose.cells;

import java.util.ArrayList;

class zwa
  extends ztp
{
  private Workbook b;
  
  zwa(zpt paramzpt)
  {
    this.b = paramzpt.a;
  }
  
  zwa(Workbook paramWorkbook)
  {
    this.b = paramWorkbook;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("MapInfo");
    XmlMapCollection localXmlMapCollection = this.b.getWorksheets().getXmlMaps();
    if ((localXmlMapCollection.c() != null) && (localXmlMapCollection.c().length() > 0)) {
      paramzcjz.a("xmlns", null, localXmlMapCollection.c());
    }
    if (localXmlMapCollection.b() != null) {
      paramzcjz.a("SelectionNamespaces", null, localXmlMapCollection.b());
    }
    Object localObject;
    for (int i = 0; i < localXmlMapCollection.a().size(); i++)
    {
      localObject = (String)localXmlMapCollection.a().get(i);
      paramzcjz.d((String)localObject);
    }
    for (i = 0; i < localXmlMapCollection.getCount(); i++)
    {
      localObject = localXmlMapCollection.get(i);
      a(paramzcjz, (XmlMap)localObject);
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void a(zcjz paramzcjz, XmlMap paramXmlMap)
    throws Exception
  {
    zcjk localzcjk = paramXmlMap.j();
    paramzcjz.b("Map");
    paramzcjz.a("ID", zauj.z(paramXmlMap.d()));
    paramzcjz.a("Name", paramXmlMap.getName());
    paramzcjz.a("RootElement", paramXmlMap.g());
    paramzcjz.a("SchemaID", paramXmlMap.h());
    paramzcjz.a("ShowImportExportValidationErrors", paramXmlMap.i() ? "true" : "false");
    paramzcjz.a("AutoFit", paramXmlMap.c() ? "true" : "false");
    paramzcjz.a("Append", paramXmlMap.b() ? "true" : "false");
    paramzcjz.a("PreserveSortAFLayout", paramXmlMap.f() ? "true" : "false");
    paramzcjz.a("PreserveFormat", paramXmlMap.e() ? "true" : "false");
    if (localzcjk != null)
    {
      paramzcjz.b("DataBinding");
      paramzcjz.a("FileBinding", localzcjk.c() ? "true" : "false");
      paramzcjz.a("ConnectionID", zauj.z(localzcjk.a()));
      paramzcjz.a("DataBindingLoadMode", zauj.aP(localzcjk.e()));
      if ((localzcjk.d() != null) && (localzcjk.d().length() > 0)) {
        paramzcjz.a("FileBindingName", localzcjk.d());
      }
      if ((localzcjk.b() != null) && (localzcjk.b().length() > 0)) {
        paramzcjz.a("DataBindingName", localzcjk.b());
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */