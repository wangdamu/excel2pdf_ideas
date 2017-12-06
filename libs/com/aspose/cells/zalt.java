package com.aspose.cells;

class zalt
{
  private zqh a = null;
  
  zalt(zqh paramzqh)
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
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("sheets".equals(paramzcjy.q())) {
        b(paramzcjy);
      } else if ("definedNames".equals(paramzcjy.q())) {
        c(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    this.a.a.getWorksheets().clear();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    zug.a(this.a.a);
    int i = 0;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("sheet".equals(paramzcjy.q())) && (paramzcjy.n()))
      {
        String str1 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (paramzcjy.m()) {
          if ("name".equals(paramzcjy.q()))
          {
            str1 = paramzcjy.t();
          }
          else if ("sheetId".equals(paramzcjy.q()))
          {
            zauj.F(paramzcjy.t());
            str2 = paramzcjy.t();
          }
          else if ("id".equals(paramzcjy.q()))
          {
            str3 = paramzcjy.t();
          }
          else if ("type".equals(paramzcjy.q()))
          {
            str4 = paramzcjy.t();
          }
          else if ("state".equals(paramzcjy.q()))
          {
            str5 = paramzcjy.t();
          }
        }
        if ((str4 == null) || ("chartsheet".equals(str4)))
        {
          if ((str1 == null) || (str1.length() == 0) || (str3 == null) || (str3.length() == 0) || (str2 == null)) {
            throw new CellsException(6, "invalid sheet attributes data");
          }
          Worksheet localWorksheet = this.a.a.getWorksheets().get(this.a.a.getWorksheets().add());
          localWorksheet.b(str1);
          if (str5 != null) {
            if ("hidden".equals(str5)) {
              localWorksheet.a(false, false);
            } else if ("veryHidden".equals(str5)) {
              localWorksheet.a(false, true);
            }
          }
          this.a.a(localWorksheet, i, str2, str3);
        }
        paramzcjy.l();
        paramzcjy.a();
        i++;
      }
    }
    paramzcjy.h();
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    WorksheetCollection localWorksheetCollection = this.a.a.getWorksheets();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("definedName".equals(paramzcjy.q()))
      {
        int i = -1;
        boolean bool1 = false;
        String str1 = null;
        String str2 = null;
        if (paramzcjy.n())
        {
          while (paramzcjy.m()) {
            if ("name".equals(paramzcjy.q())) {
              str1 = paramzcjy.t();
            } else if ("localSheetId".equals(paramzcjy.q())) {
              i = zauj.F(paramzcjy.t());
            } else if ("hidden".equals(paramzcjy.q())) {
              bool1 = "1".equals(paramzcjy.t());
            }
          }
          paramzcjy.l();
        }
        str2 = paramzcjy.j();
        if ((str1 != null) && (str2 != null))
        {
          if ((str2.toUpperCase().indexOf("#REF") == -1) && (str2.indexOf('[') == -1))
          {
            String str3 = str1.toUpperCase();
            boolean bool2 = str3.startsWith("_XLNM.");
            if (bool2)
            {
              str1 = str1.substring(6);
              str3 = str1.toUpperCase();
            }
            if (i != -1) {
              i = this.a.a(i).getIndex();
            }
            int j = localWorksheetCollection.getNames().a(i, str1);
            Name localName = localWorksheetCollection.getNames().get(j);
            if (bool2) {
              localName.f(str3);
            }
            localName.setRefersTo("=" + str2);
            localName.a(bool1);
          }
        }
        else {
          throw new CellsException(6, "Invalid name data");
        }
      }
    }
    paramzcjy.h();
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"workbook".equals(paramzcjy.q()))) {
      throw new CellsException(6, "workbook root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */