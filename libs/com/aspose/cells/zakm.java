package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zakm
{
  private zqh a = null;
  private static final za b = new za(new String[] { "Application", "Manager", "Company", "HyperlinkBase", "AppVersion", "DocSecurity", "Template", "Pages", "Words", "Characters", "Lines", "Paragraphs", "TotalTime", "CharactersWithSpaces", "ScaleCrop", "LinksUpToDate" });
  
  zakm(zqh paramzqh)
  {
    this.a = paramzqh;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    d(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    BuiltInDocumentPropertyCollection localBuiltInDocumentPropertyCollection = this.a.a.getWorksheets().getBuiltInDocumentProperties();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        int i;
        switch (b.a(paramzcjy.q()))
        {
        case 0: 
          localBuiltInDocumentPropertyCollection.setNameOfApplication(paramzcjy.j());
          break;
        case 1: 
          localBuiltInDocumentPropertyCollection.setManager(paramzcjy.j());
          break;
        case 2: 
          localBuiltInDocumentPropertyCollection.setCompany(paramzcjy.j());
          break;
        case 3: 
          localBuiltInDocumentPropertyCollection.setHyperlinkBase(paramzcjy.j());
          break;
        case 4: 
          localBuiltInDocumentPropertyCollection.setVersion(paramzcjy.j());
          break;
        case 5: 
          i = b(paramzcjy);
          if (i != -1) {
            localBuiltInDocumentPropertyCollection.a(i);
          }
          break;
        case 6: 
          localBuiltInDocumentPropertyCollection.setTemplate(paramzcjy.j());
          break;
        case 7: 
          i = b(paramzcjy);
          if (i != -1) {
            localBuiltInDocumentPropertyCollection.setPages(i);
          }
          break;
        case 8: 
          i = b(paramzcjy);
          if (i != -1) {
            localBuiltInDocumentPropertyCollection.setWords(i);
          }
          break;
        case 9: 
          i = b(paramzcjy);
          if (i != -1) {
            localBuiltInDocumentPropertyCollection.setCharacters(i);
          }
          break;
        case 10: 
          i = b(paramzcjy);
          if (i != -1) {
            localBuiltInDocumentPropertyCollection.setLines(i);
          }
          break;
        case 11: 
          i = b(paramzcjy);
          if (i != -1) {
            localBuiltInDocumentPropertyCollection.setParagraphs(i);
          }
          break;
        case 12: 
          i = b(paramzcjy);
          if (i != -1) {
            localBuiltInDocumentPropertyCollection.setTotalEditingTime(i / 60.0D);
          }
          break;
        case 13: 
          i = b(paramzcjy);
          if (i != -1) {
            localBuiltInDocumentPropertyCollection.setCharactersWithSpaces(i);
          }
          break;
        case 14: 
          localBuiltInDocumentPropertyCollection.setScaleCrop(c(paramzcjy));
          break;
        case 15: 
          localBuiltInDocumentPropertyCollection.setLinksUpToDate(c(paramzcjy));
          break;
        default: 
          paramzcjy.a();
        }
      }
    }
  }
  
  private int b(zcjy paramzcjy)
    throws Exception
  {
    int i = -1;
    String str = paramzcjy.j();
    try
    {
      i = zauj.F(str);
    }
    catch (Exception localException)
    {
      i = -1;
    }
    return i;
  }
  
  private boolean c(zcjy paramzcjy)
    throws Exception
  {
    String str = paramzcjy.j();
    return zauj.b(str, true);
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"Properties".equals(paramzcjy.q()))) {
      throw new CellsException(6, "DocPropsApp root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */