package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.zs;

class zuu
  extends ztp
{
  private Workbook b;
  
  zuu(zpt paramzpt)
  {
    this.b = paramzpt.a;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c(true);
    paramzcjz.b(true);
    paramzcjz.b("Properties");
    paramzcjz.a("xmlns", null, "http://schemas.openxmlformats.org/officeDocument/2006/custom-properties");
    paramzcjz.a("xmlns", "vt", null, "http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes");
    CustomDocumentPropertyCollection localCustomDocumentPropertyCollection = this.b.getWorksheets().getCustomDocumentProperties();
    int i = 2;
    for (int j = 0; j < localCustomDocumentPropertyCollection.getCount(); j++)
    {
      DocumentProperty localDocumentProperty = localCustomDocumentPropertyCollection.get(j);
      if ((localDocumentProperty.getType() != 5) && (!zy.a(localDocumentProperty.getName(), "_PID_LINKBASE")) && (!localDocumentProperty.c())) {
        a(paramzcjz, localDocumentProperty, i++);
      }
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void a(zcjz paramzcjz, DocumentProperty paramDocumentProperty, int paramInt)
    throws Exception
  {
    paramzcjz.b("property");
    paramzcjz.a("fmtid", "{D5CDD505-2E9C-101B-9397-08002B2CF9AE}");
    paramzcjz.a("pid", zauj.z(paramInt));
    boolean bool = paramzcjz.h();
    paramzcjz.c(false);
    paramzcjz.a(null, "name", null, paramDocumentProperty.getName(), true);
    paramzcjz.c(bool);
    if (paramDocumentProperty.isLinkedToContent()) {
      paramzcjz.a("linkTarget", paramDocumentProperty.getSource());
    }
    String str1 = "lpwstr";
    String str2 = null;
    switch (paramDocumentProperty.getType())
    {
    case 0: 
      str1 = "bool";
      str2 = paramDocumentProperty.toBool() ? "true" : "false";
      break;
    case 1: 
      str1 = "filetime";
      str2 = ((DateTime)paramDocumentProperty.getValue()).a("yyyy-MM-dd\\THH:mm:ss\\Z", za.b());
      break;
    case 2: 
      str1 = "r8";
      str2 = zs.a(paramDocumentProperty);
      break;
    case 3: 
      long l = paramDocumentProperty.e();
      if (l < 2147483647L) {
        str1 = "i4";
      }
      str2 = zs.a(paramDocumentProperty);
      break;
    case 4: 
      str2 = zs.a(paramDocumentProperty);
    }
    paramzcjz.b("vt:" + str1);
    paramzcjz.a(str2);
    paramzcjz.b();
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */