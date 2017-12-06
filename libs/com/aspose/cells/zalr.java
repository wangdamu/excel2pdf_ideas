package com.aspose.cells;

import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zj;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zalr
  implements zj
{
  private Workbook a = null;
  private zm b = null;
  private zqh c = null;
  private zi d = null;
  private zalh e = null;
  private LoadDataOption f = null;
  
  public void a()
  {
    dispose();
  }
  
  public void dispose()
  {
    this.a = null;
    this.b = null;
    if (this.c != null) {
      this.c.dispose();
    }
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
  }
  
  static void a(Workbook paramWorkbook, zm paramzm, LoadDataOption paramLoadDataOption)
    throws Exception
  {
    zalr localzalr = new zalr(paramWorkbook, paramzm, paramLoadDataOption);
    try
    {
      localzalr.b();
    }
    finally
    {
      if (localzalr != null) {
        localzalr.a();
      }
    }
  }
  
  static void a(Workbook paramWorkbook, zi paramzi, LoadDataOption paramLoadDataOption)
    throws Exception
  {
    zalr localzalr = new zalr(paramWorkbook, paramzi, paramLoadDataOption);
    try
    {
      localzalr.b();
    }
    finally
    {
      if (localzalr != null) {
        localzalr.a();
      }
    }
  }
  
  zalr(Workbook paramWorkbook, zm paramzm, LoadDataOption paramLoadDataOption)
  {
    this.a = paramWorkbook;
    this.b = paramzm;
    this.c = new zqh(paramWorkbook);
    this.f = paramLoadDataOption;
  }
  
  zalr(Workbook paramWorkbook, zi paramzi, LoadDataOption paramLoadDataOption)
  {
    this.a = paramWorkbook;
    this.d = paramzi;
    this.c = new zqh(paramWorkbook);
    this.f = paramLoadDataOption;
  }
  
  void b()
    throws Exception
  {
    f();
    e();
    h();
    c();
    d();
    g();
    if (this.f.getOnlyCreateWorksheet()) {
      return;
    }
    i();
    j();
    k();
    l();
    this.a.a = null;
    this.d.b();
  }
  
  private void c()
    throws Exception
  {
    String str = this.c.g;
    zals localzals = new zals(this.c);
    zcjy localzcjy = zauy.a(this.d, str, true);
    if (localzcjy == null) {
      return;
    }
    localzals.a(localzcjy);
    localzcjy.c();
  }
  
  private void d()
    throws Exception
  {
    ArrayList localArrayList = this.c.r;
    if (localArrayList.size() == 0) {
      return;
    }
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zqs localzqs = (zqs)localArrayList.get(i);
      if (localzqs.a.startsWith("/xl/")) {
        localzqs.a = localzqs.a.substring(4);
      }
      String str1 = "xl/" + localzqs.a;
      String str2 = "xl/" + zk.e(localzqs.a) + "/_rels/" + zk.b(localzqs.a) + ".rels";
      HashMap localHashMap = null;
      if (this.d.a(str2, true) != -1)
      {
        localzcjy = zauy.a(this.d, str2, true);
        localHashMap = zalb.b(localzcjy);
        localzcjy.c();
      }
      zcjy localzcjy = zauy.a(this.d, str1, true);
      zaks localzaks = new zaks(this.c, localHashMap);
      localzaks.a(localzcjy);
      localzcjy.c();
    }
  }
  
  private void e()
  {
    this.a.a = new zqw();
  }
  
  private void f()
  {
    String str = "xl/workbook.xml";
    try
    {
      if (this.d == null) {
        this.d = zi.a(this.b);
      }
      if (this.d.a(str, true) == -1) {
        throw new CellsException(4, "Invalid Excel2007Xlsx file format");
      }
    }
    catch (Exception localException)
    {
      throw new CellsException(4, "Invalid Excel2007Xlsx file format");
    }
  }
  
  private void g()
    throws Exception
  {
    String str = "xl/workbook.xml";
    zalt localzalt = new zalt(this.c);
    zcjy localzcjy = zauy.a(this.d, str, true);
    localzalt.a(localzcjy);
    localzcjy.c();
  }
  
  private void h()
    throws Exception
  {
    String str = "xl/_rels/workbook.xml.rels";
    zcjy localzcjy = zauy.a(this.d, str, true);
    HashMap localHashMap = zalb.b(localzcjy);
    this.c.a(localHashMap);
    localzcjy.c();
  }
  
  private void i()
    throws Exception
  {
    zrl localzrl = zalb.a(this.c.b(), "http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme", true);
    if (localzrl != null)
    {
      String str = "xl/theme/" + zk.b(localzrl.d);
      if (this.d.a(str, true) != -1)
      {
        zh localzh = this.d.a(str);
        zm localzm = this.d.a(localzh);
        zcjm localzcjm = zauz.a(localzm, null, true);
        localzm.a();
        zaln localzaln = new zaln(this.c.a);
        localzaln.a(localzcjm, true);
      }
    }
  }
  
  private void j()
    throws Exception
  {
    String str = "xl/styles.xml";
    zalk localzalk = new zalk(this.c);
    zcjy localzcjy = zauy.a(this.d, str, true);
    if (localzcjy == null) {
      return;
    }
    localzalk.a(localzcjy);
    localzcjy.c();
    localzcjy = zauy.a(this.d, str, true);
    localzalk.b(localzcjy);
    localzcjy.c();
  }
  
  private void k()
    throws Exception
  {
    String str = "xl/sharedStrings.xml";
    if (this.d.a(str, true) != -1)
    {
      this.e = new zalh(this.c);
      zcjy localzcjy = zauy.a(this.d, str, true);
      this.e.a(localzcjy);
      localzcjy.c();
    }
  }
  
  private void l()
    throws Exception
  {
    if (this.e == null) {
      this.e = new zalh(this.c);
    }
    HashMap localHashMap = this.c.b();
    Iterator localIterator = this.c.c.iterator();
    while (localIterator.hasNext())
    {
      zqi localzqi = (zqi)localIterator.next();
      zrl localzrl = (zrl)localHashMap.get(localzqi.c);
      String str = zk.b(localzrl.d);
      if (localzrl.d.indexOf("worksheets/") != -1)
      {
        if (a(localzqi)) {
          a(localzqi, str);
        }
      }
      else if ((localzrl.d.indexOf("chartsheets/") == -1) || (!zauj.b)) {}
    }
  }
  
  private boolean a(zqi paramzqi)
  {
    if (this.f == null) {
      return true;
    }
    if (this.f.getOnlyVisibleWorksheet()) {
      return paramzqi.d.isVisible();
    }
    int i;
    if (this.f.SheetIndexes != null)
    {
      for (i = 0; i < this.f.SheetIndexes.length; i++)
      {
        int j = this.f.SheetIndexes[i];
        if (paramzqi.a == j) {
          return true;
        }
      }
      return false;
    }
    if (this.f.SheetNames != null)
    {
      for (i = 0; i < this.f.SheetNames.length; i++)
      {
        String str = this.f.SheetNames[i];
        if ((str != null) && (zw.b(paramzqi.d.getName().toLowerCase(), str.toLowerCase()))) {
          return true;
        }
      }
      return false;
    }
    return true;
  }
  
  private void a(zqi paramzqi, String paramString)
    throws Exception
  {
    b(paramzqi, paramString);
  }
  
  private void b(zqi paramzqi, String paramString)
    throws Exception
  {
    boolean bool = true;
    if (this.f != null) {
      bool = this.f.getImportFormula();
    }
    String str = "xl/worksheets/" + paramString;
    zalw localzalw = new zalw(this.c, paramzqi, bool);
    zcjy localzcjy = zauy.a(this.d, str, true);
    localzalw.a(this.e);
    localzalw.a(localzcjy);
    localzcjy.c();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */