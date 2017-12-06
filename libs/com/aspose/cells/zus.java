package com.aspose.cells;

import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;

class zus
  extends ztp
{
  private Workbook b;
  
  zus(zpt paramzpt)
  {
    this.b = paramzpt.a;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c(true);
    paramzcjz.b(true);
    paramzcjz.b("Properties");
    paramzcjz.a("xmlns", null, "http://schemas.openxmlformats.org/officeDocument/2006/extended-properties");
    paramzcjz.a("xmlns", "vt", null, "http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes");
    BuiltInDocumentPropertyCollection localBuiltInDocumentPropertyCollection = this.b.getWorksheets().getBuiltInDocumentProperties();
    paramzcjz.b("Application", localBuiltInDocumentPropertyCollection.getNameOfApplication());
    Object localObject = "14.0300";
    if (localBuiltInDocumentPropertyCollection.contains("Version"))
    {
      DocumentProperty localDocumentProperty = localBuiltInDocumentPropertyCollection.get("Version");
      String str = zs.a(localDocumentProperty);
      int i = str.indexOf(".");
      if (i != -1)
      {
        int j = zp.a(str.substring(0, 0 + i));
        if (j >= 12) {
          localObject = str;
        }
      }
    }
    if ((localObject == null) || ("".equals(localObject))) {
      localObject = "14.0300";
    }
    paramzcjz.b("AppVersion", (String)localObject);
    paramzcjz.b("DocSecurity", zauj.z(localBuiltInDocumentPropertyCollection.a()));
    if (localBuiltInDocumentPropertyCollection.contains("ScaleCrop")) {
      paramzcjz.b("ScaleCrop", localBuiltInDocumentPropertyCollection.getScaleCrop() ? "true" : "false");
    }
    paramzcjz.b("Template", localBuiltInDocumentPropertyCollection.getTemplate());
    paramzcjz.b("Manager", localBuiltInDocumentPropertyCollection.getManager());
    paramzcjz.b("Company", localBuiltInDocumentPropertyCollection.getCompany());
    if (localBuiltInDocumentPropertyCollection.getPages() > 0) {
      paramzcjz.b("Pages", zauj.z(localBuiltInDocumentPropertyCollection.getPages()));
    }
    if (localBuiltInDocumentPropertyCollection.getWords() > 0) {
      paramzcjz.b("Words", zauj.z(localBuiltInDocumentPropertyCollection.getWords()));
    }
    if (localBuiltInDocumentPropertyCollection.getCharacters() > 0) {
      paramzcjz.b("Characters", zauj.z(localBuiltInDocumentPropertyCollection.getCharacters()));
    }
    if (localBuiltInDocumentPropertyCollection.getLines() > 0) {
      paramzcjz.b("Lines", zauj.z(localBuiltInDocumentPropertyCollection.getLines()));
    }
    if (localBuiltInDocumentPropertyCollection.getParagraphs() > 0) {
      paramzcjz.b("Paragraphs", zauj.z(localBuiltInDocumentPropertyCollection.getParagraphs()));
    }
    if (localBuiltInDocumentPropertyCollection.getTotalEditingTime() > 0.0D) {
      paramzcjz.b("TotalTime", zauj.z((int)(localBuiltInDocumentPropertyCollection.getTotalEditingTime() * 60.0D)));
    }
    if (localBuiltInDocumentPropertyCollection.getCharactersWithSpaces() > 0) {
      paramzcjz.b("CharactersWithSpaces", zauj.z(localBuiltInDocumentPropertyCollection.getCharactersWithSpaces()));
    }
    if ((localBuiltInDocumentPropertyCollection.contains("HyperlinkBase")) && (!"".equals(localBuiltInDocumentPropertyCollection.getHyperlinkBase()))) {
      paramzcjz.b("HyperlinkBase", localBuiltInDocumentPropertyCollection.getHyperlinkBase());
    }
    if (localBuiltInDocumentPropertyCollection.contains("LinksUpToDate")) {
      paramzcjz.b("LinksUpToDate", localBuiltInDocumentPropertyCollection.getLinksUpToDate() ? "true" : "false");
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */