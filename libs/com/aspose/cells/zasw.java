package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.c.a.za;

class zasw
{
  private zasb a;
  private Workbook b;
  private zcjz c;
  private static final za d = new za(new String[] { "meta:editing-duration", "meta:editing-cycles", "meta:generator" });
  
  zasw(zasb paramzasb)
  {
    this.a = paramzasb;
    this.b = paramzasb.a;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    this.c = paramzcjz;
    paramzcjz.c();
    paramzcjz.b("office:document-meta");
    paramzcjz.a("xmlns", "office", null, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
    paramzcjz.a("xmlns", "xlink", null, "http://www.w3.org/1999/xlink");
    paramzcjz.a("xmlns", "dc", null, "http://purl.org/dc/elements/1.1/");
    paramzcjz.a("xmlns", "meta", null, "urn:oasis:names:tc:opendocument:xmlns:meta:1.0");
    paramzcjz.a("xmlns", "ooo", null, "http://openoffice.org/2004/office");
    a();
    paramzcjz.b();
    paramzcjz.d();
  }
  
  private void a()
    throws Exception
  {
    this.c.b("office:meta");
    BuiltInDocumentPropertyCollection localBuiltInDocumentPropertyCollection = this.b.getBuiltInDocumentProperties();
    if (!zbsn.a(localBuiltInDocumentPropertyCollection.getLastSavedBy())) {
      this.c.b("meta:generator", localBuiltInDocumentPropertyCollection.getLastSavedBy());
    }
    if (!zbsn.a(localBuiltInDocumentPropertyCollection.getAuthor())) {
      this.c.b("meta:initial-creator", localBuiltInDocumentPropertyCollection.getAuthor());
    }
    if (!zbsn.a(localBuiltInDocumentPropertyCollection.getSubject())) {
      this.c.b("dc:subject", localBuiltInDocumentPropertyCollection.getSubject());
    }
    if (!zbsn.a(localBuiltInDocumentPropertyCollection.getKeywords())) {
      this.c.b("meta:keyword", localBuiltInDocumentPropertyCollection.getKeywords());
    }
    if (!zbsn.a(localBuiltInDocumentPropertyCollection.getTitle())) {
      this.c.b("dc:title", localBuiltInDocumentPropertyCollection.getTitle());
    }
    if (!zbsn.a(localBuiltInDocumentPropertyCollection.getComments())) {
      this.c.b("dc:description", localBuiltInDocumentPropertyCollection.getComments());
    }
    if (localBuiltInDocumentPropertyCollection.contains("CreateTime")) {
      this.c.b("meta:creation-date", localBuiltInDocumentPropertyCollection.getCreatedTime().b("yyyy-MM-dd'T'hh:mm:ss"));
    }
    if (localBuiltInDocumentPropertyCollection.contains("LastSavedTime")) {
      this.c.b("dc:date", localBuiltInDocumentPropertyCollection.getLastSavedTime().b("yyyy-MM-dd'T'hh:mm:ss"));
    }
    if (localBuiltInDocumentPropertyCollection.contains("LastPrinted")) {
      this.c.b("meta:print-date", localBuiltInDocumentPropertyCollection.getLastPrinted().b("yyyy-MM-dd'T'hh:mm:ss"));
    }
    CustomDocumentPropertyCollection localCustomDocumentPropertyCollection = this.b.getCustomDocumentProperties();
    for (int i = 0; i < localCustomDocumentPropertyCollection.getCount(); i++)
    {
      DocumentProperty localDocumentProperty = localCustomDocumentPropertyCollection.get(i);
      switch (d.a(localDocumentProperty.getName()))
      {
      case 0: 
      case 1: 
      case 2: 
        this.c.b(localDocumentProperty.getName(), zs.a(localDocumentProperty));
        break;
      default: 
        a(localDocumentProperty);
      }
    }
    this.c.b();
  }
  
  private void a(DocumentProperty paramDocumentProperty)
    throws Exception
  {
    this.c.b("meta:user-defined");
    this.c.a("meta:name", paramDocumentProperty.getName());
    String str1 = null;
    String str2 = null;
    switch (paramDocumentProperty.getType())
    {
    case 2: 
    case 3: 
      str1 = "float";
      str2 = zs.a(paramDocumentProperty);
      break;
    case 0: 
      str1 = "boolean";
      str2 = ((Boolean)paramDocumentProperty.getValue()).booleanValue() ? "true" : "false";
      break;
    case 1: 
      str1 = "date";
      str2 = ((DateTime)paramDocumentProperty.getValue()).b("yyyy-MM-dd'T'hh:mm:ss");
      break;
    default: 
      str2 = zs.a(paramDocumentProperty);
    }
    if (str1 != null) {
      this.c.a("meta:value-type", str1);
    }
    this.c.a(str2);
    this.c.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */