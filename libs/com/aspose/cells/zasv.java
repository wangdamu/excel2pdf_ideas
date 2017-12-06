package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zasv
{
  private zasg a;
  private WorksheetCollection b;
  private zcjy c;
  private CustomDocumentPropertyCollection d;
  private BuiltInDocumentPropertyCollection e;
  private static final za f = new za(new String[] { "meta", "user-defined", "creator", "initial-creator", "subject", "keyword", "title", "description", "creation-date", "date", "print-date", "editing-duration", "editing-cycles", "generator" });
  
  zasv(zasg paramzasg)
  {
    this.a = paramzasg;
    this.b = paramzasg.b.getWorksheets();
    this.d = this.b.getCustomDocumentProperties();
    this.e = this.b.getBuiltInDocumentProperties();
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    this.c = paramzcjy;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.k();
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (f.a(paramzcjy.q().toLowerCase()))
      {
      case 0: 
        b(paramzcjy);
      }
    }
  }
  
  void b(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      String str1 = paramzcjy.p();
      String str2 = paramzcjy.q();
      String str3;
      switch (f.a(str2.toLowerCase()))
      {
      case 1: 
        str3 = paramzcjy.a("name");
        String str4 = paramzcjy.a("value-type");
        String str5 = paramzcjy.j();
        if (str4 == null)
        {
          this.d.add(str3, str5);
        }
        else if ("float".equals(str4))
        {
          double d1 = zauj.C(str5);
          this.d.add(str3, d1);
        }
        else if ("date".equals(str4))
        {
          DateTime localDateTime1 = zasp.p(str5);
          this.d.add(str3, localDateTime1);
        }
        else if ("time".equals(str4))
        {
          try
          {
            double d2 = zasp.q(str5);
            DateTime localDateTime2 = CellsHelper.getDateTimeFromDouble(d2, this.a.b.getSettings().getDate1904());
            this.d.add(str3, localDateTime2);
          }
          catch (Exception localException2) {}
        }
        else if ("boolean".equals(str4))
        {
          this.d.add(str3, "true".equals(str5));
        }
        else
        {
          this.d.add(str3, str5);
        }
        break;
      case 2: 
        str3 = paramzcjy.j();
        this.e.setLastSavedBy(str3);
        break;
      case 3: 
        str3 = paramzcjy.j();
        this.e.setAuthor(str3);
        break;
      case 4: 
        str3 = paramzcjy.j();
        this.e.setSubject(str3);
        break;
      case 5: 
        str3 = paramzcjy.j();
        this.e.setKeywords(str3);
        break;
      case 6: 
        str3 = paramzcjy.j();
        this.e.setTitle(str3);
        break;
      case 7: 
        str3 = paramzcjy.j();
        this.e.setComments(str3);
        break;
      case 8: 
        str3 = paramzcjy.j();
        this.e.setCreatedTime(zasp.p(str3));
        break;
      case 9: 
        str3 = paramzcjy.j();
        try
        {
          this.e.setLastSavedTime(zasp.p(str3));
        }
        catch (Exception localException1) {}
        break;
      case 10: 
        str3 = paramzcjy.j();
        this.e.setLastPrinted(zasp.p(str3));
        break;
      case 11: 
      case 12: 
      case 13: 
        str3 = paramzcjy.j();
        this.d.add(str1, str3);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */