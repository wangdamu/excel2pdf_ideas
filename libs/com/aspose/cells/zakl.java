package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import java.util.HashMap;

class zakl
{
  private Workbook a;
  private zcjm b = null;
  private HashMap c = null;
  private zi d = null;
  private String e = null;
  private boolean f;
  
  zakl(Workbook paramWorkbook, zi paramzi, String paramString, boolean paramBoolean)
  {
    this.a = paramWorkbook;
    this.d = paramzi;
    this.e = paramString;
    this.f = paramBoolean;
  }
  
  private void a()
    throws Exception
  {
    if ((this.e == null) || (this.b != null)) {
      return;
    }
    int i = zauj.ae(this.e);
    if (i == -1)
    {
      this.e = null;
      return;
    }
    String str1 = zw.a(zu.d(this.e), "\\", "/");
    String str2 = str1 + "/data" + i + ".xml";
    String str3 = str1 + "/_rels/" + zu.b(str2) + ".rels";
    zh localzh = this.d.a(str2);
    zm localzm = this.d.a(localzh);
    if (localzh == null)
    {
      this.e = null;
      return;
    }
    this.b = zauz.a(localzm, null, true);
    localzm.a();
    if (this.d.a(str3, false) != -1)
    {
      zcjy localzcjy = zauy.a(this.d, str3, true);
      this.c = zalb.a(localzcjy, null, this.a, this.d, str1 + "/");
      localzcjy.c();
    }
  }
  
  void a(String paramString, Shape paramShape)
    throws Exception
  {
    a();
    if (this.b == null) {
      return;
    }
    zcjn localzcjn = a(paramString);
    if (localzcjn == null) {
      return;
    }
    if (a(paramShape, localzcjn)) {
      return;
    }
    String str = null;
    for (zcjs localzcjs = localzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if ((localzcjs.e == 1) && ("prSet".equals(localzcjs.g)))
      {
        str = ((zcjn)localzcjs).a("presAssocID");
        break;
      }
    }
    if (str != null)
    {
      localzcjn = a(str);
      if (localzcjn == null) {
        return;
      }
      a(paramShape, localzcjn);
    }
  }
  
  private boolean a(Shape paramShape, zcjn paramzcjn)
  {
    paramzcjn = zauj.b(paramzcjn, "extLst");
    if (paramzcjn == null) {
      return false;
    }
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if ((localzcjs.e == 1) && ("ext".equals(localzcjs.g)))
      {
        zcjn localzcjn1 = zauj.b(localzcjs, "cNvPr");
        if (localzcjn1 != null)
        {
          zcjn localzcjn2 = zauj.b(localzcjn1, "hlinkClick");
          zakp.a(localzcjn2, paramShape, this.c);
          return true;
        }
      }
    }
    return false;
  }
  
  zcjn a(String paramString)
  {
    zcjn localzcjn1 = zauj.b(this.b.d_(), "ptLst");
    if (localzcjn1 != null) {
      for (zcjs localzcjs = localzcjn1.m(); localzcjs != null; localzcjs = localzcjs.n()) {
        if ((localzcjs.e == 1) && ("pt".equals(localzcjs.g)))
        {
          zcjn localzcjn2 = (zcjn)localzcjs;
          String str = localzcjn2.a("modelId");
          if (zw.b(str, paramString)) {
            return localzcjn2;
          }
        }
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */