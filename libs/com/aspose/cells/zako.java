package com.aspose.cells;

class zako
{
  private zqh a = null;
  private CustomDocumentPropertyCollection b = null;
  private static final com.aspose.cells.b.c.a.za c = new com.aspose.cells.b.c.a.za(new String[] { "filetime", "i1", "i2", "i4", "r4", "r8", "bool", "lpwstr" });
  
  zako(zqh paramzqh)
  {
    this.a = paramzqh;
    this.b = this.a.a.getWorksheets().getCustomDocumentProperties();
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    c(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("property".equals(paramzcjy.q())) {
        b(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  void b(zcjy paramzcjy)
    throws Exception
  {
    String str1 = paramzcjy.a("name");
    if ((paramzcjy.o()) || (str1 == null) || (str1.length() == 0))
    {
      paramzcjy.a();
      return;
    }
    DocumentProperty localDocumentProperty = null;
    String str2 = paramzcjy.a("linkTarget");
    if (str2 != null) {
      localDocumentProperty = this.b.addLinkToContent(str1, str2);
    }
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
        String str3 = paramzcjy.q();
        if (!"vector".equals(str3))
        {
          String str4 = paramzcjy.a(true);
          a(localDocumentProperty, str1, str4, str3);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private void a(DocumentProperty paramDocumentProperty, String paramString1, String paramString2, String paramString3)
  {
    try
    {
      switch (c.a(paramString3))
      {
      case 0: 
        if (paramString2.charAt(paramString2.length() - 1) == 'Z') {
          paramString2 = paramString2.substring(0, 0 + (paramString2.length() - 1));
        }
        DateTime localDateTime = DateTime.a(paramString2, "yyyy-MM-dd\\THH:mm:ss", com.aspose.cells.b.a.c.za.b());
        if (paramDocumentProperty == null) {
          this.b.add(paramString1, localDateTime);
        } else {
          paramDocumentProperty.setValue(localDateTime);
        }
        break;
      case 1: 
      case 2: 
      case 3: 
        int i = zauj.F(paramString2);
        if (paramDocumentProperty == null) {
          this.b.add(paramString1, i);
        } else {
          paramDocumentProperty.setValue(Integer.valueOf(i));
        }
        break;
      case 4: 
      case 5: 
        double d = zauj.C(paramString2);
        if (paramDocumentProperty == null) {
          this.b.add(paramString1, d);
        } else {
          paramDocumentProperty.setValue(Double.valueOf(d));
        }
        break;
      case 6: 
        boolean bool = paramString2.toLowerCase().equals("true");
        if (paramDocumentProperty == null) {
          this.b.add(paramString1, bool);
        } else {
          paramDocumentProperty.setValue(Boolean.valueOf(bool));
        }
        break;
      case 7: 
      default: 
        if (paramDocumentProperty == null) {
          this.b.add(paramString1, paramString2);
        } else {
          paramDocumentProperty.setValue(paramString2);
        }
        break;
      }
    }
    catch (Exception localException)
    {
      if (paramDocumentProperty == null) {
        this.b.add(paramString1, paramString2);
      } else {
        paramDocumentProperty.setValue(paramString2);
      }
    }
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.f = false;
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"Properties".equals(paramzcjy.q()))) {
      throw new CellsException(6, "DocPropsCustom root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zako.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */