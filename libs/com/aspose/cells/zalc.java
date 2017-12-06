package com.aspose.cells;

import com.aspose.cells.b.a.zh;

class zalc
{
  private zbcj a;
  private static final com.aspose.cells.b.c.a.za b = new com.aspose.cells.b.c.a.za(new String[] { "diskRevisions", "exclusive", "history", "guid", "lastGuid", "keepChangeHistory", "preserveHistory", "protected", "revisionId", "shared", "trackRevisions", "version", "dateTime", "id", "maxRId", "maxSheetId", "minRId", "userName" });
  
  zalc(zbcj paramzbcj)
  {
    this.a = paramzbcj;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (b.a(paramzcjy.q()))
        {
        case 0: 
          this.a.a = zauj.aB(paramzcjy.t());
          break;
        case 1: 
          this.a.b = zauj.aB(paramzcjy.t());
          break;
        case 2: 
          this.a.c = zauj.aB(paramzcjy.t());
          break;
        case 3: 
          this.a.l = zauj.aX(paramzcjy.t()).a();
          break;
        case 4: 
          this.a.m = zauj.aX(paramzcjy.t()).a();
          break;
        case 5: 
          this.a.d = zauj.aB(paramzcjy.t());
          break;
        case 6: 
          this.a.e = zauj.F(paramzcjy.t());
          break;
        case 7: 
          this.a.f = zauj.aB(paramzcjy.t());
          break;
        case 8: 
          this.a.i = zauj.F(paramzcjy.t());
          break;
        case 9: 
          this.a.g = zauj.aB(paramzcjy.t());
          break;
        case 10: 
          this.a.h = zauj.aB(paramzcjy.t());
          break;
        case 11: 
          this.a.j = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("header".equals(paramzcjy.q())) {
        b(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  void b(zcjy paramzcjy)
    throws Exception
  {
    zbci localzbci = new zbci(this.a);
    this.a.a(localzbci);
    zbce localzbce = localzbci.b;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (b.a(paramzcjy.q()))
        {
        case 12: 
          localzbce.a = DateTime.a(paramzcjy.t(), "yyyy-MM-dd\\THH:mm:ss", com.aspose.cells.b.a.c.za.b());
          break;
        case 3: 
          localzbce.b = zauj.aX(paramzcjy.t()).a();
          break;
        case 13: 
          localzbce.i = paramzcjy.t();
          break;
        case 14: 
          localzbce.c = zauj.F(paramzcjy.t());
          break;
        case 15: 
          localzbce.e = zauj.F(paramzcjy.t());
          break;
        case 16: 
          localzbce.d = zauj.F(paramzcjy.t());
          if (localzbce.c < localzbce.d) {
            localzbce.c = localzbce.d;
          }
          break;
        case 17: 
          localzbce.f = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("sheetIdMap".equals(paramzcjy.q())) {
        a(paramzcjy, localzbce);
      } else if ("reviewedList".equals(paramzcjy.q())) {
        b(paramzcjy, localzbce);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  void a(zcjy paramzcjy, zbce paramzbce)
    throws Exception
  {
    int i = zauj.F(paramzcjy.a("count"));
    paramzbce.g = new int[i];
    int j = 0;
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("sheetId".equals(paramzcjy.q())) {
        paramzbce.g[(j++)] = zauj.F(paramzcjy.a("val"));
      }
      paramzcjy.a();
    }
  }
  
  void b(zcjy paramzcjy, zbce paramzbce)
    throws Exception
  {
    int i = zauj.F(paramzcjy.a("count"));
    paramzbce.h = new int[i];
    int j = 0;
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("reviewed".equals(paramzcjy.q())) {
        paramzbce.h[(j++)] = zauj.F(paramzcjy.a("rId"));
      }
      paramzcjy.a();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */