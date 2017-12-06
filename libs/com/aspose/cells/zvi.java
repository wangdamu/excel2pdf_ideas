package com.aspose.cells;

import com.aspose.cells.b.a.c.za;
import java.util.Iterator;

class zvi
  extends ztp
{
  private zbcj b;
  
  zvi(zbcj paramzbcj)
  {
    this.b = paramzbcj;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("headers");
    paramzcjz.a("xmlns", zaty.a);
    paramzcjz.a("xmlns:r", zaty.e);
    paramzcjz.a("guid", zauj.a(this.b.l));
    if (!this.b.g) {
      paramzcjz.a("shared", "0");
    }
    if (this.b.b) {
      paramzcjz.a("exclusive", "1");
    }
    if (!this.b.c) {
      paramzcjz.a("history", "0");
    }
    if (!this.b.h) {
      paramzcjz.a("trackRevisions", "0");
    }
    if (!this.b.d) {
      paramzcjz.a("keepChangeHistory", "0");
    }
    if (this.b.f) {
      paramzcjz.a("protected", "1");
    }
    if (this.b.e != 30) {
      paramzcjz.a("preserveHistory", zauj.z(this.b.e));
    }
    if (this.b.a) {
      paramzcjz.a("diskRevisions", "1");
    }
    if (this.b.i != 0) {
      paramzcjz.a("revisionId", zauj.z(this.b.i));
    }
    if (this.b.j != 1) {
      paramzcjz.a("version", zauj.z(this.b.j));
    }
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      zbci localzbci = (zbci)localIterator.next();
      zbce localzbce = localzbci.b;
      a(paramzcjz, localzbce);
    }
    paramzcjz.b();
    paramzcjz.e();
  }
  
  private void a(zcjz paramzcjz, zbce paramzbce)
    throws Exception
  {
    paramzcjz.b("header");
    paramzcjz.a("guid", zauj.a(paramzbce.b));
    paramzcjz.a("dateTime", paramzbce.a.a("yyyy-MM-dd\\THH:mm:ss", za.b()));
    paramzcjz.a("r:id", paramzbce.i);
    paramzcjz.a("maxSheetId", zauj.z(paramzbce.e));
    paramzcjz.a("userName", paramzbce.f);
    if (paramzbce.d != 0) {
      paramzcjz.a("minRId", zauj.z(paramzbce.d));
    }
    if (paramzbce.c != 0) {
      paramzcjz.a("maxRId", zauj.z(paramzbce.c));
    }
    int k;
    if (paramzbce.g != null)
    {
      paramzcjz.b("sheetIdMap");
      paramzcjz.a("count", zauj.z(paramzbce.g.length));
      for (k : paramzbce.g)
      {
        paramzcjz.b("sheetId");
        paramzcjz.a("val", zauj.z(k));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    if ((paramzbce.h != null) && (paramzbce.h.length > 0))
    {
      paramzcjz.b("reviewedList");
      paramzcjz.a("count", zauj.z(paramzbce.h.length));
      for (k : paramzbce.h)
      {
        paramzcjz.b("reviewed");
        paramzcjz.a("rId", zauj.z(k));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */