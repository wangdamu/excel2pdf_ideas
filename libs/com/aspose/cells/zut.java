package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.c.za;

class zut
  extends ztp
{
  private Workbook b;
  private zpt c;
  
  zut(zpt paramzpt)
  {
    this.b = paramzpt.a;
    this.c = paramzpt;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c(false);
    paramzcjz.b(true);
    paramzcjz.b("cp:coreProperties");
    paramzcjz.a("xmlns", "cp", null, "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
    paramzcjz.a("xmlns", "dc", null, "http://purl.org/dc/elements/1.1/");
    paramzcjz.a("xmlns", "dcterms", null, "http://purl.org/dc/terms/");
    paramzcjz.a("xmlns", "dcmitype", null, "http://purl.org/dc/dcmitype/");
    paramzcjz.a("xmlns", "xsi", null, "http://www.w3.org/2001/XMLSchema-instance");
    BuiltInDocumentPropertyCollection localBuiltInDocumentPropertyCollection = this.b.getWorksheets().getBuiltInDocumentProperties();
    paramzcjz.b("dc:title", localBuiltInDocumentPropertyCollection.getTitle());
    paramzcjz.b("dc:subject", localBuiltInDocumentPropertyCollection.getSubject());
    paramzcjz.b("dc:creator", localBuiltInDocumentPropertyCollection.getAuthor());
    paramzcjz.b("cp:keywords", localBuiltInDocumentPropertyCollection.getKeywords());
    paramzcjz.b("dc:description", localBuiltInDocumentPropertyCollection.getComments());
    paramzcjz.b("cp:lastModifiedBy", localBuiltInDocumentPropertyCollection.getLastSavedBy());
    if (zk.b(localBuiltInDocumentPropertyCollection.getLastPrinted(), DateTime.a))
    {
      paramzcjz.c("cp:lastPrinted", null);
      paramzcjz.a(localBuiltInDocumentPropertyCollection.getLastPrinted().a("yyyy-MM-dd\\THH:mm:ss\\Z", za.b()));
      paramzcjz.b();
    }
    if (zk.b(localBuiltInDocumentPropertyCollection.getCreatedTime(), DateTime.a))
    {
      paramzcjz.c("dcterms:created", null);
      paramzcjz.a("xsi:type", null, "dcterms:W3CDTF");
      paramzcjz.a(zaac.a(localBuiltInDocumentPropertyCollection.getCreatedTime()));
      paramzcjz.b();
    }
    if (zk.b(localBuiltInDocumentPropertyCollection.getLastSavedTime(), DateTime.a))
    {
      paramzcjz.c("dcterms:modified", null);
      paramzcjz.a("xsi:type", null, "dcterms:W3CDTF");
      paramzcjz.a(zaac.a(localBuiltInDocumentPropertyCollection.getLastSavedTime()));
      paramzcjz.b();
    }
    paramzcjz.b("cp:category", localBuiltInDocumentPropertyCollection.getCategory());
    paramzcjz.b("cp:contentType", localBuiltInDocumentPropertyCollection.getContentType());
    paramzcjz.b("cp:contentStatus", localBuiltInDocumentPropertyCollection.getContentStatus());
    if (!"0".equals(localBuiltInDocumentPropertyCollection.getRevision())) {
      paramzcjz.b("cp:revision", localBuiltInDocumentPropertyCollection.getRevision());
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */