package com.aspose.cells.a.d;

import com.aspose.cells.DateTime;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.zas;

public class zdj
{
  public static void a(zas paramzas, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, DateTime paramDateTime1, DateTime paramDateTime2, DateTime paramDateTime3, String paramString8)
    throws Exception
  {
    paramzas.a("cp:coreProperties");
    paramzas.c("xmlns:cp", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
    paramzas.c("xmlns:dc", "http://purl.org/dc/elements/1.1/");
    paramzas.c("xmlns:dcterms", "http://purl.org/dc/terms/");
    paramzas.c("xmlns:dcmitype", "http://purl.org/dc/dcmitype/");
    paramzas.c("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
    paramzas.b("dc:title", paramString1);
    paramzas.b("dc:subject", paramString2);
    paramzas.b("dc:creator", paramString3);
    paramzas.b("cp:keywords", paramString4);
    paramzas.b("dc:description", paramString5);
    paramzas.b("cp:lastModifiedBy", paramString6);
    paramzas.a("cp:revision", paramString7);
    paramzas.a("cp:lastPrinted", paramDateTime1);
    a(paramzas, "created", paramDateTime2);
    a(paramzas, "modified", paramDateTime3);
    paramzas.b("cp:category", paramString8);
    paramzas.b();
  }
  
  private static void a(zas paramzas, String paramString, DateTime paramDateTime)
    throws Exception
  {
    if (paramDateTime.getYear() > 1)
    {
      paramzas.b("dcterms:" + paramString);
      paramzas.c("xsi:type", "dcterms:W3CDTF");
      paramzas.c(zp.a(paramDateTime));
      paramzas.c();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */