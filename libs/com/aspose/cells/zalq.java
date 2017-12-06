package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.c.zx;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class zalq
  extends ze
{
  private zalh d = null;
  private static final za e = new za(new String[] { "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheDefinition", "http://schemas.microsoft.com/office/2007/relationships/customDataProps", "http://schemas.microsoft.com/office/2006/relationships/attachedToolbars", "http://schemas.microsoft.com/office/2011/relationships/timelineCache", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/powerPivotData", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/sheetMetadata", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotTable", "http://schemas.microsoft.com/office/2007/relationships/ui/extensibility", "http://schemas.microsoft.com/office/2006/relationships/ui/extensibility", "http://schemas.microsoft.com/office/2006/relationships/ui/userCustomization", "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin", "http://schemas.microsoft.com/office/2011/relationships/webextensiontaskpanes", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image" });
  
  public void dispose()
  {
    if (this.b != null) {
      this.b.dispose();
    }
    this.b = null;
    this.d = null;
    this.a = null;
    this.c = null;
    com.aspose.cells.b.a.zg.a(this);
  }
  
  zalq(Workbook paramWorkbook, LoadOptions paramLoadOptions)
  {
    super(paramWorkbook, paramLoadOptions);
  }
  
  void c()
    throws Exception
  {
    l();
    h();
    m();
    j();
    k();
    i();
    a();
    if ((this.b.k & 0x8000) != 0)
    {
      b();
      n();
    }
    if ((this.b.k & 0x80) != 0)
    {
      q();
      r();
      s();
      if (this.b.k == 128) {
        return;
      }
    }
    if ((this.b.l) || ((this.b.k & 0x20) != 0))
    {
      a(this.c, this.b);
      t();
    }
    else
    {
      this.b.d = new HashMap();
      this.b.e = new HashMap();
    }
    if ((this.b.l) || ((this.b.k & 0x2) != 0)) {
      u();
    }
    if ((this.b.k & 0x20000) != 0)
    {
      p();
      w();
    }
    if ((this.b.l) || (this.b.k != 0))
    {
      g();
      v();
    }
    this.a.a.a(this.a);
    this.a.getWorksheets().getNames().a(true);
    if (this.a.isDigitallySigned()) {
      this.a.i = new zatz(this.c);
    }
    if ((this.b.k & 0x4000) != 0) {
      e();
    }
    if ((this.b.k & 0x2000) != 0)
    {
      y();
      f();
      x();
      d();
    }
    if ((this.b.k & 0x8000) != 0) {
      o();
    }
    if ((this.b.k & 0x2000) != 0) {
      this.a.getWorksheets().W().a();
    }
    a(this.a.a.g.d);
  }
  
  void a(ArrayList paramArrayList)
    throws Exception
  {
    if (this.b.b() == null) {
      return;
    }
    Iterator localIterator = this.b.b().values().iterator();
    zql localzql = this.a.a.g;
    HashMap localHashMap = new HashMap();
    zrl localzrl;
    String str;
    while (localIterator.hasNext())
    {
      localzrl = (zrl)localIterator.next();
      if (localzrl.i) {
        switch (e.a(localzrl.c))
        {
        case 0: 
          str = localzrl.d;
          localHashMap.put(str, str);
        }
      }
    }
    localIterator = this.b.b().values().iterator();
    while (localIterator.hasNext())
    {
      localzrl = (zrl)localIterator.next();
      switch (e.a(localzrl.c))
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        zf.a(paramArrayList, localzrl);
        break;
      case 6: 
        str = localzrl.d;
        if (str.startsWith("pivotTables/")) {
          str = "xl/" + str;
        }
        zf.a(paramArrayList, localzrl);
        a(str, null, this.c, this.a);
        break;
      case 0: 
        str = localzrl.d;
        if (localHashMap.get(str) == null) {
          if (!localzrl.i)
          {
            if (str.startsWith("pivotCache/")) {
              str = "xl/" + str;
            }
            zf.a(paramArrayList, localzrl);
            a(str, null, this.c, this.a);
          }
        }
        break;
      }
    }
  }
  
  private void d()
  {
    WorksheetCollection localWorksheetCollection = this.a.getWorksheets();
    zbpo localzbpo = null;
    zbpp localzbpp = null;
    int i = localWorksheetCollection.J().getCount();
    Iterator localIterator = localWorksheetCollection.iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      int j = localWorksheet.x().getCount();
      for (int k = 0; k < j; k++)
      {
        localzbpo = localWorksheet.x().a(k);
        for (int m = 0; m < i; m++)
        {
          localzbpp = localWorksheetCollection.J().a(m);
          if (localzbpo.b().equals(localzbpp.f()))
          {
            localzbpp.d().a(localzbpo);
            localzbpo.o = localzbpp;
          }
        }
      }
    }
  }
  
  private void e()
  {
    for (int i = 0; i < this.a.getWorksheets().getCount(); i++)
    {
      Worksheet localWorksheet = this.a.getWorksheets().get(i);
      if ((localWorksheet.getListObjects() != null) && (localWorksheet.getListObjects().getCount() > 0)) {
        localWorksheet.getListObjects().e();
      }
    }
  }
  
  private void f()
  {
    Iterator localIterator = this.a.getWorksheets().iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      if ((localWorksheet.b != null) && (localWorksheet.b.getCount() > 0)) {
        for (int i = 0; i < localWorksheet.b.getCount(); i++)
        {
          PivotTable localPivotTable = localWorksheet.b.get(i);
          localPivotTable.d = this.b.a.getWorksheets().W().b(localPivotTable.aa);
          if ((localPivotTable.d != null) && (localPivotTable.d.i != null))
          {
            for (int j = 0; j < localPivotTable.d.i.size(); j++) {
              localPivotTable.getBaseFields().get(j).h = ((zbtv)localPivotTable.d.i.get(j));
            }
            a(localPivotTable);
          }
        }
      }
    }
  }
  
  private void a(PivotTable paramPivotTable)
  {
    for (int i = 0; i < paramPivotTable.getBaseFields().getCount(); i++)
    {
      PivotField localPivotField = paramPivotTable.getBaseFields().get(i);
      if ((localPivotField.l()) && (paramPivotTable.d.m != null))
      {
        zawz localzawz = paramPivotTable.d.m;
        for (int j = 0; j < localzawz.getCount(); j++)
        {
          zaxa localzaxa = localzawz.a(j);
          zbtz localzbtz = (zbtz)localzaxa.g.e.get(0);
          if ((localzbtz.b() & 0xFFFF) == localPivotField.t)
          {
            if (localPivotField.m == 2) {
              localzbtz.a = 2;
            } else if (localPivotField.m == 4) {
              localzbtz.a = 4;
            } else if (localPivotField.m == 8) {
              localzbtz.a = 8;
            }
            localzaxa.a(localzaxa.a(), localzaxa.c());
          }
        }
      }
    }
  }
  
  private void g()
    throws Exception
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      com.aspose.cells.a.f.zh localzh = (com.aspose.cells.a.f.zh)localIterator.next();
      if (!localzh.c())
      {
        String str1 = localzh.b();
        String str2 = zauj.an(str1);
        if ((!str1.endsWith(".rels")) && ((str2.equals("media")) || (str2.equals("customData")))) {
          a(str1, str2, this.c, this.a);
        }
      }
    }
  }
  
  static zqo a(String paramString1, String paramString2, zi paramzi, Workbook paramWorkbook)
    throws Exception
  {
    zqo localzqo = new zqo();
    localzqo.b = paramString1;
    if (paramString2 == null) {
      paramString2 = zauj.an(paramString1);
    }
    localzqo.a = paramString2;
    String str = zauj.ao(paramString1);
    if (paramzi.a(str, true) != -1)
    {
      zcjy localzcjy = zauy.a(paramzi, str, true);
      localzqo.d = zalb.a(localzcjy);
      localzcjy.c();
    }
    zf.a(paramWorkbook.a.i, localzqo);
    return localzqo;
  }
  
  private void h()
    throws Exception
  {
    String str = "_rels/.rels";
    if (this.c.a(str, true) == -1) {
      return;
    }
    zcjy localzcjy = zauy.a(this.c, str, true);
    HashMap localHashMap = zalb.b(localzcjy);
    localzcjy.c();
    Iterator localIterator = localHashMap.values().iterator();
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      switch (e.a(localzrl.c))
      {
      case 7: 
      case 8: 
        this.a.a.k = localzrl.d;
        break;
      case 9: 
      case 10: 
      case 11: 
        zf.a(this.a.a.h, localzrl);
        break;
      case 12: 
        this.b.g = localzrl.d;
      }
    }
  }
  
  private void i()
    throws Exception
  {
    String str = this.b.g;
    zals localzals = new zals(this.b);
    zcjy localzcjy = zauy.a(this.c, str, true);
    if (localzcjy == null) {
      return;
    }
    localzals.a(localzcjy, true);
    localzcjy.c();
  }
  
  private void j()
    throws Exception
  {
    String str = this.b.g;
    zals localzals = new zals(this.b);
    zcjy localzcjy = zauy.a(this.c, str, true);
    if (localzcjy == null) {
      return;
    }
    localzals.a(localzcjy);
    localzcjy.c();
  }
  
  private void k()
    throws Exception
  {
    ArrayList localArrayList = this.b.r;
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
      if (this.c.a(str2, true) != -1)
      {
        localzcjy = zauy.a(this.c, str2, true);
        localHashMap = zalb.b(localzcjy);
        localzcjy.c();
      }
      zcjy localzcjy = zauy.a(this.c, str1, true);
      zaks localzaks = new zaks(this.b, localHashMap);
      localzaks.a(localzcjy);
      localzcjy.c();
    }
  }
  
  private void l()
    throws Exception
  {
    String str = "[Content_Types].xml";
    zaki localzaki = new zaki(this.b);
    zcjy localzcjy = zauy.a(this.c, str, true);
    if (!localzaki.a(localzcjy)) {
      throw new CellsException(4, "This file's format is not supported or you don't specify a correct format.");
    }
    localzcjy.c();
  }
  
  private void m()
    throws Exception
  {
    String str1 = this.b.g;
    int i = str1.lastIndexOf('/');
    if (i != -1) {
      str1 = str1.substring(i + 1);
    }
    String str2 = "xl/_rels/" + str1 + ".rels";
    zcjy localzcjy = zauy.a(this.c, str2, true);
    HashMap localHashMap = zalb.b(localzcjy);
    this.b.a(localHashMap);
    localzcjy.c();
  }
  
  static void a(zi paramzi, zqh paramzqh)
    throws Exception
  {
    zrl localzrl1 = zalb.a(paramzqh.b(), "http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme", true);
    if (localzrl1 == null)
    {
      paramzqh.a.a.c = false;
      return;
    }
    String str1 = "xl/theme/" + zu.b(localzrl1.d);
    paramzqh.a.a.e = str1;
    Object localObject3;
    Object localObject4;
    if (paramzi.a(str1, true) != -1)
    {
      paramzqh.a.a.c = true;
      localObject1 = paramzi.a(str1);
      localObject2 = paramzi.a((com.aspose.cells.a.f.zh)localObject1);
      localObject3 = zauz.a((zm)localObject2, null, true);
      ((zm)localObject2).a();
      localObject4 = new zaln(paramzqh.a);
      ((zaln)localObject4).a((zcjm)localObject3, true);
    }
    Object localObject1 = "xl/theme/_rels/" + zu.b(localzrl1.d) + ".rels";
    Object localObject2 = zauy.a(paramzi, (String)localObject1, true);
    if (localObject2 != null)
    {
      localObject3 = zalb.b((zcjy)localObject2);
      paramzqh.a.d().d = ((HashMap)localObject3);
      ((zcjy)localObject2).c();
      localObject4 = ((HashMap)localObject3).values().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        zrl localzrl2 = (zrl)((Iterator)localObject4).next();
        switch (e.a(localzrl2.c))
        {
        case 13: 
          String str2 = zauj.aH(localzrl2.d);
          localzrl2.h = a(paramzi, str2);
          zf.a(paramzqh.a.a.f, zk.b(str2));
        }
      }
    }
  }
  
  private void n()
    throws Exception
  {
    String str = this.a.a.k;
    if ((str != null) && (this.c.a(str, true) != -1))
    {
      zcjy localzcjy = zauy.a(this.c, str, true);
      localzcjy.k();
      if (localzcjy.s() != 0) {
        this.a.setRibbonXml(localzcjy.v());
      }
      localzcjy.c();
    }
  }
  
  private void o()
    throws Exception
  {
    zcjy localzcjy = null;
    String str1 = this.b.m;
    String str2 = this.b.n;
    if (str1 == null) {
      return;
    }
    zbcj localzbcj = this.a.getWorksheets().ag();
    if (this.c.a(str1, false) != -1)
    {
      localzcjy = zauy.a(this.c, str1, true);
      localObject = new zalc(localzbcj);
      ((zalc)localObject).a(localzcjy);
    }
    if (this.c.a(str2, false) != -1)
    {
      localzcjy = zauy.a(this.c, str2, true);
      localObject = new zale(localzbcj);
      ((zale)localObject).a(localzcjy);
    }
    Object localObject = null;
    String str3 = "xl/revisions/_rels/" + zk.b(str1) + ".rels";
    if (this.c.a(str3, false) != -1)
    {
      localzcjy = zauy.a(this.c, str3, true);
      localObject = zalb.b(localzcjy);
      localzcjy.c();
    }
    zald localzald = new zald(this.b);
    for (int i = 0; i < localzbcj.getCount(); i++)
    {
      zbci localzbci = localzbcj.a(i);
      if ((localzbci.b.i != null) && (!"".equals(localzbci.b.i)))
      {
        zrl localzrl = (zrl)((HashMap)localObject).get(localzbci.b.i);
        localzcjy = zauy.a(this.c, "xl/revisions/" + localzrl.d, true);
        if (localzcjy != null)
        {
          localzald.a(localzcjy, localzbci);
          localzcjy.c();
        }
      }
    }
  }
  
  private void p()
    throws Exception
  {
    String str = "xl/xmlMaps.xml";
    if (this.c.a(str, true) != -1)
    {
      zaly localzaly = new zaly(this.b);
      zcjy localzcjy = zauy.a(this.c, str, true);
      localzaly.a(localzcjy);
      localzcjy.c();
    }
  }
  
  private void q()
    throws Exception
  {
    String str = "docProps/core.xml";
    if (this.c.a(str, true) != -1)
    {
      zakn localzakn = new zakn(this.b);
      zcjy localzcjy = zauy.a(this.c, str, false);
      localzakn.a(localzcjy);
      localzcjy.c();
    }
  }
  
  private void r()
    throws Exception
  {
    String str = "docProps/app.xml";
    if (this.c.a(str, true) != -1)
    {
      zakm localzakm = new zakm(this.b);
      zcjy localzcjy = zauy.a(this.c, str, true);
      localzakm.a(localzcjy);
      localzcjy.c();
    }
  }
  
  private void s()
    throws Exception
  {
    String str = "docProps/custom.xml";
    if (this.c.a(str, true) != -1)
    {
      zako localzako = new zako(this.b);
      zcjy localzcjy = zauy.a(this.c, str, true);
      localzako.a(localzcjy);
      localzcjy.c();
    }
  }
  
  private void t()
    throws Exception
  {
    zrl localzrl = zalb.a(this.b.b(), "http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles", true);
    String str = "xl/styles.xml";
    if (localzrl != null) {
      str = "xl/" + zu.b(localzrl.d);
    }
    if (this.c.a(str, true) != -1)
    {
      zalk localzalk = new zalk(this.b);
      zcjy localzcjy = zauy.a(this.c, str, true);
      localzalk.a(localzcjy);
      localzcjy.c();
      localzcjy = zauy.a(this.c, str, true);
      localzalk.b(localzcjy);
      localzcjy.c();
    }
  }
  
  private void u()
    throws Exception
  {
    String str = this.b.o;
    if (str == null) {
      str = "xl/sharedStrings.xml";
    } else if (str.startsWith("/")) {
      str = str.substring(1);
    }
    if (this.c.a(str, true) != -1)
    {
      this.d = new zalh(this.b);
      zcjy localzcjy = zauy.a(this.c, str, true);
      this.d.a(localzcjy);
      localzcjy.c();
    }
  }
  
  private void v()
    throws Exception
  {
    if (this.d == null) {
      this.d = new zalh(this.b);
    }
    HashMap localHashMap = this.b.b();
    Iterator localIterator = this.b.c.iterator();
    zqi localzqi;
    zrl localzrl;
    String str;
    while (localIterator.hasNext())
    {
      localzqi = (zqi)localIterator.next();
      if ((localzqi.c != null) && (!"".equals(localzqi.c)))
      {
        localzrl = (zrl)localHashMap.get(localzqi.c);
        str = zk.b(localzrl.d);
        if (localzrl.d.indexOf("worksheets/") != -1) {
          a(localzqi, str);
        }
      }
    }
    localIterator = this.b.c.iterator();
    while (localIterator.hasNext())
    {
      localzqi = (zqi)localIterator.next();
      if ((localzqi.c != null) && (!"".equals(localzqi.c)))
      {
        localzrl = (zrl)localHashMap.get(localzqi.c);
        str = zk.b(localzrl.d);
        if (localzrl.d.indexOf("worksheets/") != -1) {
          b(localzqi, str);
        } else if ((localzrl.d.indexOf("chartsheets/") != -1) && (zauj.b) && ((this.b.k & 0x100) != 0)) {
          c(localzqi, str);
        }
      }
    }
  }
  
  private void a(zqi paramzqi, String paramString)
    throws Exception
  {
    a(paramzqi, 1, paramString);
    if ((this.b.k & 0x4000) != 0)
    {
      a(paramzqi, paramzqi.e, paramzqi.d);
      c(paramzqi);
    }
    a(paramzqi);
  }
  
  private void a(zqi paramzqi)
    throws Exception
  {
    ArrayList localArrayList = zalb.b(paramzqi.e, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/tableSingleCells");
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zrl localzrl = (zrl)localArrayList.get(i);
      String str = "xl/tables/" + zk.b(localzrl.d);
      zcjy localzcjy = zauy.a(this.c, str, true);
      zalm localzalm = new zalm(paramzqi);
      localzalm.a(localzcjy);
      localzcjy.c();
    }
  }
  
  private void a(zqi paramzqi, HashMap paramHashMap, Object paramObject)
    throws Exception
  {
    ArrayList localArrayList = zalb.b(paramHashMap, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/queryTable");
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zrl localzrl = (zrl)localArrayList.get(i);
      String str = "xl/queryTables/" + zk.b(localzrl.d);
      if (this.c.a(str, true) != -1)
      {
        zcjy localzcjy = zauy.a(this.c, str, true);
        zala localzala = new zala(paramzqi, paramObject, str);
        localzala.a(localzcjy);
      }
      paramHashMap.remove(localzrl.b);
    }
  }
  
  private void b(zqi paramzqi, String paramString)
    throws Exception
  {
    String str1 = "xl/worksheets/" + paramString;
    String str2 = "xl/worksheets";
    this.a.i();
    if ((this.b.k & 0x2000) != 0) {
      g(paramzqi);
    }
    this.a.i();
    if ((this.b.k & 0x200) != 0) {
      i(paramzqi);
    }
    this.a.i();
    d(paramzqi, str1);
    if ((this.b.k & 0x2000) != 0) {
      h(paramzqi);
    }
    this.a.i();
    if ((this.b.k & 0x300) != 0)
    {
      zlx localzlx = null;
      zajb localzajb = null;
      String str3 = paramzqi.a(paramzqi.h);
      Cells localCells;
      if (str3 != null)
      {
        localCells = paramzqi.d.getCells();
        localzlx = new zlx(localCells, 16383);
        localCells.b = localzlx;
        localCells.getRows().b(0);
        localzajb = localCells.getRows().b;
        a(paramzqi, str2, str3, false);
      }
      this.a.i();
      str3 = paramzqi.a(paramzqi.f);
      if (str3 != null)
      {
        if (localzlx == null)
        {
          localCells = paramzqi.d.getCells();
          localzlx = new zlx(localCells, 16383);
          localCells.b = localzlx;
          localCells.getRows().b(0);
          localzajb = localCells.getRows().b;
        }
        f(paramzqi, str3);
      }
      if (localzlx != null)
      {
        localCells = paramzqi.d.getCells();
        localCells.k();
        localCells.getRows().b();
      }
    }
    if (paramzqi.g != null) {
      f(paramzqi);
    }
    if (paramzqi.i != null) {
      e(paramzqi);
    }
    b(paramzqi);
    if (paramzqi.k != null) {
      d(paramzqi);
    }
    zaxj.a(paramzqi.d, true);
  }
  
  private void b(zqi paramzqi)
    throws Exception
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (paramzqi.j != null)
    {
      String str = paramzqi.a(paramzqi.j);
      if (str != null)
      {
        localObject1 = zauj.aH(str);
        localObject2 = this.c.a((String)localObject1);
        localObject3 = this.c.a((com.aspose.cells.a.f.zh)localObject2);
        localObject4 = zx.a((zm)localObject3, false);
        ((zm)localObject3).a();
        if (paramzqi.d.getType() == 2) {
          paramzqi.d.getCharts().get(0).getPageSetup().setPrinterSettings((byte[])localObject4);
        } else {
          paramzqi.d.getPageSetup().setPrinterSettings((byte[])localObject4);
        }
      }
    }
    if ((paramzqi.d.s != null) && (paramzqi.d.s.getCount() > 0)) {
      for (int i = 0; i < paramzqi.d.s.getCount(); i++)
      {
        localObject1 = paramzqi.d.s.a(i);
        if (((zoh)localObject1).b != null)
        {
          localObject2 = paramzqi.a(((zoh)localObject1).b);
          if (localObject2 != null)
          {
            localObject3 = zauj.aH((String)localObject2);
            localObject4 = this.c.a((String)localObject3);
            zm localzm = this.c.a((com.aspose.cells.a.f.zh)localObject4);
            byte[] arrayOfByte = zx.a(localzm, false);
            localzm.a();
            ((zoh)localObject1).e().setPrinterSettings(arrayOfByte);
            ((zoh)localObject1).b = null;
          }
        }
      }
    }
  }
  
  private void c(zqi paramzqi)
    throws Exception
  {
    ArrayList localArrayList = zalb.b(paramzqi.e, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/table");
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zrl localzrl = (zrl)localArrayList.get(i);
      String str1 = "xl/tables/" + zk.b(localzrl.d);
      zcjy localzcjy = zauy.a(this.c, str1, true);
      zall localzall = new zall(paramzqi);
      localzall.a(localzcjy);
      localzcjy.c();
      String str2 = "xl/tables/_rels/" + zk.b(localzrl.d) + ".rels";
      if (this.c.a(str2, false) != -1)
      {
        localzcjy = zauy.a(this.c, str2, true);
        localzcjy.c();
        HashMap localHashMap = zalb.b(localzcjy);
        a(paramzqi, localHashMap, localzall.a());
        if ((localHashMap != null) && (localHashMap.size() > 0)) {
          localzall.a().c = localHashMap;
        }
      }
    }
  }
  
  private void d(zqi paramzqi)
    throws Exception
  {
    zc localzc = com.aspose.cells.b.a.a.zg.a(paramzqi.k);
    while (localzc.c())
    {
      String str1 = (String)localzc.a();
      String str2 = (String)localzc.b();
      String str3 = paramzqi.a(str2);
      if (str3 != null)
      {
        str3 = zauj.aH(str3);
        com.aspose.cells.a.f.zh localzh = this.c.a(str3);
        zm localzm = this.c.a(localzh);
        byte[] arrayOfByte = new byte[(int)localzh.a()];
        localzm.a(arrayOfByte, 0, (int)localzh.a());
        localzm.a();
        String str4 = Encoding.getUnicode().a(arrayOfByte);
        paramzqi.d.getCustomProperties().add(str1, str4);
      }
    }
  }
  
  private void e(zqi paramzqi)
    throws Exception
  {
    String str = zauj.aH(paramzqi.a(paramzqi.i));
    com.aspose.cells.a.f.zh localzh = this.c.a(str);
    zm localzm = this.c.a(localzh);
    byte[] arrayOfByte = new byte[(int)localzh.a()];
    localzm.a(arrayOfByte, 0, (int)localzh.a());
    localzm.a();
    paramzqi.d.setBackgroundImage(arrayOfByte);
    zf.a(this.a.a.f, zk.b(str));
  }
  
  private void f(zqi paramzqi)
    throws Exception
  {
    String str1 = paramzqi.a(paramzqi.g);
    if (str1 != null)
    {
      str1 = zauj.aH(str1);
      zcjy localzcjy = zauy.a(this.c, str1, true);
      zakt localzakt = new zakt();
      ArrayList localArrayList = localzakt.a(localzcjy);
      localzcjy.c();
      String str2 = "xl/drawings/_rels/" + zk.b(str1) + ".rels";
      if (localArrayList == null) {
        return;
      }
      if (this.c.a(str2, true) == -1) {
        return;
      }
      localzcjy = zauy.a(this.c, str2, true);
      HashMap localHashMap = zalb.b(localzcjy);
      localzcjy.c();
      if ((localHashMap == null) || (localHashMap.size() == 0)) {
        throw new CellsException(6, str2 + " does not exist or is empty");
      }
      for (int i = 0; i < localArrayList.size(); i++)
      {
        zqc localzqc = (zqc)localArrayList.get(i);
        if (localzqc.b != null)
        {
          if (!localHashMap.containsKey(localzqc.b)) {
            throw new CellsException(6, str2 + " does not contains relId " + localzqc.b);
          }
          zrl localzrl = (zrl)localHashMap.get(localzqc.b);
          String str3 = zauj.aH(localzrl.d);
          com.aspose.cells.a.f.zh localzh = this.c.a(str3);
          zm localzm = this.c.a(localzh);
          byte[] arrayOfByte = new byte[(int)localzh.a()];
          localzm.a(arrayOfByte, 0, (int)localzh.a());
          localzm.a();
          Picture localPicture = paramzqi.d.getPageSetup().a(localzqc.a, arrayOfByte);
          localzqc.a(localPicture, zbxp.a());
          zf.a(this.a.a.f, zk.b(str3));
        }
      }
    }
  }
  
  private void c(zqi paramzqi, String paramString)
    throws Exception
  {
    String str1 = "xl/chartsheets/" + paramString;
    String str2 = "xl/chartsheets/";
    a(paramzqi, 2, paramString);
    this.a.i();
    g(paramzqi, str1);
    this.a.i();
    String str3 = paramzqi.a(paramzqi.h);
    if (str3 != null) {
      a(paramzqi, str2, str3, false);
    }
    this.a.i();
    str3 = paramzqi.a(paramzqi.f);
    if (str3 != null) {
      f(paramzqi, str3);
    }
    if (paramzqi.g != null) {
      f(paramzqi);
    }
    if (paramzqi.i != null) {
      e(paramzqi);
    }
    if (paramzqi.j != null) {
      b(paramzqi);
    }
  }
  
  private void d(zqi paramzqi, String paramString)
    throws Exception
  {
    this.b.j.getLoadFilter().startSheet(paramzqi.d);
    this.b.k = this.b.j.getLoadFilter().getLoadDataFilterOptions();
    if (this.b.k == 0) {
      return;
    }
    zalu localzalu = new zalu(this.b, paramzqi);
    zcjy localzcjy = zauy.a(this.c, paramString, true);
    localzalu.a(this.d);
    localzalu.a(localzcjy);
    localzcjy.c();
    e(paramzqi, paramString);
  }
  
  private void e(zqi paramzqi, String paramString)
    throws Exception
  {
    if ((paramzqi.p != null) && (paramzqi.p.size() > 0))
    {
      Iterator localIterator = paramzqi.p.values().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if ((localObject instanceof zqn))
        {
          zqn localzqn = (zqn)localObject;
          if (localzqn.a()) {
            localzqn.k = zauj.a(this.c, localzqn.c);
          }
        }
      }
    }
  }
  
  private void a(zqi paramzqi, int paramInt, String paramString)
    throws Exception
  {
    String str = null;
    if (paramInt == 1) {
      str = "xl/worksheets/_rels/" + paramString + ".rels";
    } else if (paramInt == 2) {
      str = "xl/chartsheets/_rels/" + paramString + ".rels";
    } else {
      throw new CellsException(16, "Cells Internal error, unsupported sheet type");
    }
    if (this.c.a(str, true) != -1)
    {
      zcjy localzcjy = zauy.a(this.c, str, true);
      paramzqi.e = zalb.b(localzcjy);
      localzcjy.c();
      paramzqi.a(paramzqi.d.k.d);
    }
  }
  
  private void w()
    throws Exception
  {
    zrl localzrl = zalb.a(this.b.b(), "http://schemas.openxmlformats.org/officeDocument/2006/relationships/connections", true);
    if (localzrl == null) {
      return;
    }
    String str = "xl/" + zk.b(localzrl.d);
    zcjy localzcjy = zauy.a(this.c, str, true);
    zakh localzakh = new zakh(this.b);
    localzakh.a(localzcjy);
  }
  
  private void x()
    throws Exception
  {
    ArrayList localArrayList = this.b.q;
    if (localArrayList == null) {
      return;
    }
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zrl localzrl = (zrl)localArrayList.get(i);
      String str1 = zu.b(localzrl.d);
      zalj localzalj = new zalj(this.b, str1, localzrl.a);
      String str2 = "xl/slicerCaches/" + str1;
      zcjy localzcjy = zauy.a(this.c, str2, true);
      if (null != localzcjy)
      {
        localzalj.a(localzcjy);
        localzcjy.c();
      }
    }
  }
  
  private HashMap a(String paramString)
    throws Exception
  {
    HashMap localHashMap = null;
    if (this.c.a(paramString, true) != -1)
    {
      zcjy localzcjy = zauy.a(this.c, paramString, true);
      localHashMap = zalb.b(localzcjy);
      localzcjy.c();
    }
    return localHashMap;
  }
  
  private void y()
    throws Exception
  {
    HashMap localHashMap1 = this.b.b();
    ArrayList localArrayList = this.b.h;
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zri localzri = (zri)localArrayList.get(i);
      if (!localHashMap1.containsKey(localzri.c)) {
        throw new CellsException(6, "pivotCache rid " + localzri.c + " not found in workbook rels file");
      }
      zrl localzrl = (zrl)localHashMap1.get(localzri.c);
      localzrl.i = true;
      String str1 = zk.b(localzrl.d);
      String str2 = "xl/pivotCache/_rels/" + str1 + ".rels";
      HashMap localHashMap2 = a(str2);
      zakx localzakx = new zakx(localzri, localHashMap2);
      String str3 = "xl/pivotCache/" + str1;
      zcjy localzcjy = zauy.a(this.c, str3, true);
      localzakx.a(localzcjy);
      if (localzri.b.b()) {
        localzri.b.u = a(this.c, str3);
      }
      int j = localzakx.b;
      a(localzri.b, localHashMap2, localzakx.a, j);
    }
  }
  
  private void a(zawp paramzawp, HashMap paramHashMap, String paramString, int paramInt)
    throws Exception
  {
    if ((paramHashMap == null) || (paramString == null)) {
      return;
    }
    if (!paramHashMap.containsKey(paramString)) {
      throw new CellsException(6, "pivotCacheRecord rid " + paramString + " not found in pivotCache rels file");
    }
    zrl localzrl = (zrl)paramHashMap.get(paramString);
    paramHashMap.remove(paramString);
    zaky localzaky = new zaky(paramzawp);
    String str = "xl/pivotCache/" + zk.b(localzrl.d);
    if (paramzawp.b()) {
      paramzawp.v = a(this.c, str);
    }
    zcjy localzcjy = zauy.a(this.c, str, true);
    if (localzcjy == null) {
      return;
    }
    localzaky.a(localzcjy, paramInt);
  }
  
  private void g(zqi paramzqi)
    throws Exception
  {
    if ((paramzqi.e == null) || (paramzqi.e.size() == 0)) {
      return;
    }
    paramzqi.d.b = new PivotTableCollection(paramzqi.d);
    ArrayList localArrayList = zalb.b(paramzqi.e, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotTable");
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zrl localzrl = (zrl)localArrayList.get(i);
      String str = "xl/pivotTables/" + zk.b(localzrl.d);
      zcjy localzcjy = zauy.a(this.c, str, true);
      if (localzcjy != null)
      {
        zakz localzakz = new zakz(this.b, paramzqi, localzrl.d);
        localzakz.a(localzcjy);
        localzcjy.c();
      }
    }
  }
  
  private void h(zqi paramzqi)
    throws Exception
  {
    if ((paramzqi.l == null) || (paramzqi.l.size() == 0)) {
      return;
    }
    ArrayList localArrayList = paramzqi.l;
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zrl localzrl = (zrl)localArrayList.get(i);
      String str = "xl/slicers/" + zk.b(localzrl.d);
      zcjy localzcjy = zauy.a(this.c, str, true);
      if (null != localzcjy)
      {
        zali localzali = new zali(this.b, paramzqi, localzrl.d, localzrl.a);
        localzali.a(localzcjy);
        localzcjy.c();
      }
    }
  }
  
  private void f(zqi paramzqi, String paramString)
    throws Exception
  {
    zcjy localzcjy = null;
    String str = "xl/drawings/_rels/" + zk.b(paramString) + ".rels";
    paramString = zauj.aH(paramString);
    HashMap localHashMap = null;
    if (this.c.a(str, true) != -1)
    {
      localzcjy = zauy.a(this.c, str, true);
      localHashMap = zalb.b(localzcjy);
      localzcjy.c();
    }
    zalo localzalo = new zalo(paramzqi, localHashMap, this.c, paramString);
    localzalo.a();
  }
  
  private void i(zqi paramzqi)
    throws Exception
  {
    String str = paramzqi.a();
    if (str != null)
    {
      zcjy localzcjy = zauy.a(this.c, str, true);
      zakg localzakg = new zakg(this.b, paramzqi);
      localzakg.a(localzcjy);
      localzcjy.c();
    }
  }
  
  private void g(zqi paramzqi, String paramString)
    throws Exception
  {
    zakd localzakd = new zakd(this.b, paramzqi);
    zcjy localzcjy = zauy.a(this.c, paramString, true);
    localzakd.a(localzcjy);
    localzcjy.c();
  }
  
  void a(zqi paramzqi, String paramString1, String paramString2, boolean paramBoolean)
    throws Exception
  {
    String[] arrayOfString = zauj.a(paramString1, paramString2, true);
    zcjy localzcjy = null;
    paramString2 = arrayOfString[0];
    String str = arrayOfString[1];
    HashMap localHashMap = null;
    if (this.c.a(str, false) != -1)
    {
      localzcjy = zauy.a(this.c, str, true);
      localHashMap = zalb.a(localzcjy, this.b, this.a, this.c, arrayOfString[2]);
      localzcjy.c();
    }
    zakp localzakp = new zakp(paramzqi, localHashMap, this.c, paramString2);
    localzakp.a(paramBoolean);
    if (localzakp.a().size() > 0) {
      paramzqi.d.w().a(localzakp.a());
    }
  }
  
  static Shape a(Shape paramShape)
    throws Exception
  {
    zi localzi = null;
    boolean bool = false;
    Workbook localWorkbook = paramShape.P().p();
    if ((localWorkbook.a != null) && (localWorkbook.a.a != null))
    {
      localzi = localWorkbook.a.a.b;
    }
    else
    {
      localObject1 = paramShape.R().b();
      if (localObject1 == null) {
        return null;
      }
      localzi = zi.a(new com.aspose.cells.b.a.d.zh((byte[])localObject1));
      bool = true;
    }
    Object localObject1 = paramShape.o;
    String str1 = zw.a(zu.d((String)localObject1), "\\", "/");
    zcjy localzcjy = null;
    String str2 = str1 + "/_rels/" + zu.b((String)localObject1) + (bool ? ".rel" : ".rels");
    if (localzi.a((String)localObject1, false) == -1) {
      return null;
    }
    HashMap localHashMap = null;
    if (localzi.a(str2, false) != -1)
    {
      localzcjy = zauy.a(localzi, str2, true);
      localHashMap = zalb.a(localzcjy, null, localWorkbook, localzi, str1 + "/");
      localzcjy.c();
    }
    Worksheet localWorksheet = paramShape.Q();
    zqh localzqh = new zqh(localWorkbook);
    try
    {
      zqi localzqi = new zqi(localzqh, localWorksheet);
      zakp localzakp = new zakp(localzqi, localHashMap, localzi, (String)localObject1);
      zakl localzakl = new zakl(localWorkbook, localzi, (String)localObject1, bool);
      ShapeCollection localShapeCollection = new ShapeCollection(localWorksheet.c(), localWorksheet, new zse(localWorksheet.c(), 0), localWorksheet, -1);
      localzakp.b = localShapeCollection;
      Shape localShape1 = localzakp.a(paramShape, localzakl);
      localShape1.v = paramShape.v;
      Shape localShape2 = localShape1;
      return localShape2;
    }
    finally
    {
      if (localzqh != null) {
        localzqh.a();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */