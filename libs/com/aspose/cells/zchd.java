package com.aspose.cells;

import com.aspose.cells.a.c.zx;
import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class zchd
  extends ze
{
  zchu d = null;
  private static final za e = new za(new String[] { "http://schemas.microsoft.com/office/2007/relationships/ui/extensibility", "http://schemas.microsoft.com/office/2006/relationships/ui/extensibility", "http://schemas.microsoft.com/office/2006/relationships/ui/userCustomization", "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument", "http://schemas.microsoft.com/office/2007/relationships/customDataProps", "http://schemas.microsoft.com/office/2006/relationships/attachedToolbars", "http://schemas.microsoft.com/office/2011/relationships/timelineCache", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slicerCache", "http://schemas.microsoft.com/office/2007/relationships/slicerCache", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/powerPivotData", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/sheetMetadata", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotTable", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheDefinition" });
  
  public void c()
  {
    dispose();
  }
  
  public void dispose()
  {
    if (this.b != null) {
      this.b.dispose();
    }
    this.b = null;
    this.a = null;
    this.c = null;
    this.d = null;
    zg.a(this);
  }
  
  static zcbw b(zi paramzi, String paramString)
    throws Exception
  {
    zh localzh = paramzi.a(paramString);
    if (localzh == null) {
      return null;
    }
    zm localzm = paramzi.a(localzh);
    byte[] arrayOfByte = new byte[(int)localzh.a()];
    localzm.a(arrayOfByte, 0, arrayOfByte.length);
    try
    {
      localzm.a();
    }
    catch (Exception localException) {}
    return new zcbw(arrayOfByte);
  }
  
  /* Error */
  static void a(Workbook paramWorkbook, LoadOptions paramLoadOptions)
    throws Exception
  {
    // Byte code:
    //   0: new 115	com/aspose/cells/zchd
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: invokespecial 309	com/aspose/cells/zchd:<init>	(Lcom/aspose/cells/Workbook;Lcom/aspose/cells/LoadOptions;)V
    //   9: astore_2
    //   10: aload_2
    //   11: invokevirtual 332	com/aspose/cells/zchd:d	()V
    //   14: aload_2
    //   15: ifnull +21 -> 36
    //   18: aload_2
    //   19: invokevirtual 328	com/aspose/cells/zchd:c	()V
    //   22: goto +14 -> 36
    //   25: astore_3
    //   26: aload_2
    //   27: ifnull +7 -> 34
    //   30: aload_2
    //   31: invokevirtual 328	com/aspose/cells/zchd:c	()V
    //   34: aload_3
    //   35: athrow
    //   36: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	paramWorkbook	Workbook
    //   0	37	1	paramLoadOptions	LoadOptions
    //   9	22	2	localzchd	zchd
    //   25	10	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	14	25	finally
  }
  
  zchd(Workbook paramWorkbook, LoadOptions paramLoadOptions)
  {
    super(paramWorkbook, paramLoadOptions);
  }
  
  byte[] a(zcbw paramzcbw)
  {
    int i = paramzcbw.b();
    return paramzcbw.a(i);
  }
  
  void d()
    throws Exception
  {
    f();
    String str1 = this.b.g;
    if (this.c.a(str1, true) == -1) {
      throw new CellsException(4, "Invalid Excel2007Xlsb file format");
    }
    zcjy localzcjy = null;
    try
    {
      g();
      zcim localzcim = new zcim(this);
      localzcim.a(b(this.c, str1), this.c);
      c(this.c);
      zalq.a(this.c, this.b);
      String str2 = "docProps/core.xml";
      zakn localzakn = new zakn(this.b);
      localzcjy = zauy.a(this.c, str2, false);
      if (localzcjy != null)
      {
        localzakn.a(localzcjy);
        localzcjy.c();
        localzcjy = null;
      }
      String str3 = "docProps/app.xml";
      if (this.c.a(str3, false) != -1)
      {
        localObject1 = new zakm(this.b);
        localzcjy = zauy.a(this.c, str3, true);
        ((zakm)localObject1).a(localzcjy);
        localzcjy.c();
      }
      if (this.b.k == Integer.MAX_VALUE) {
        b();
      }
      Object localObject1 = "docProps/custom.xml";
      if (this.c.a((String)localObject1, false) != -1)
      {
        localObject2 = new zako(this.b);
        localzcjy = zauy.a(this.c, (String)localObject1, true);
        ((zako)localObject2).a(localzcjy);
        localzcjy.c();
      }
      Object localObject2 = "xl/styles.bin";
      this.d = new zchu(this);
      this.d.a(b(this.c, (String)localObject2));
      String str4 = "xl/sharedStrings.bin";
      if (this.c.a(str4, false) != -1) {
        b(b(this.c, str4));
      }
      b(this.c);
      a(this.c);
      a();
      this.a.a.a(this.a);
      e();
      j();
      i();
      h();
      this.a.getWorksheets().W().a();
      a(this.a.a.g.d);
    }
    finally
    {
      if (localzcjy != null) {
        localzcjy.c();
      }
      this.a.a.a.a();
    }
  }
  
  private void e()
    throws Exception
  {
    zrl localzrl = zalb.a(this.b.b(), "http://schemas.openxmlformats.org/officeDocument/2006/relationships/connections", true);
    if (localzrl == null) {
      return;
    }
    String str = "xl/" + zk.b(localzrl.d);
    zcbw localzcbw = b(this.c, str);
    zcfp localzcfp = new zcfp(this);
    localzcfp.a(localzcbw);
  }
  
  private void f()
    throws Exception
  {
    this.b.g = "xl/workbook.bin";
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
      case 0: 
      case 1: 
        this.a.a.k = localzrl.d;
        break;
      case 2: 
      case 3: 
        zf.a(this.a.a.h, localzrl);
        break;
      case 4: 
        this.b.g = localzrl.d;
      }
    }
  }
  
  private void g()
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
  
  void a(ArrayList paramArrayList)
  {
    Iterator localIterator = this.b.b().values().iterator();
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      switch (e.a(localzrl.c))
      {
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
        zf.a(paramArrayList, localzrl);
        break;
      case 12: 
        zf.a(paramArrayList, localzrl);
        break;
      case 13: 
        if (!localzrl.i) {
          zf.a(paramArrayList, localzrl);
        }
        break;
      }
    }
  }
  
  private void h()
    throws Exception
  {
    zcbw localzcbw = null;
    String str1 = this.b.m;
    String str2 = this.b.n;
    if (str1 == null) {
      return;
    }
    zbcj localzbcj = this.a.getWorksheets().ag();
    if (this.c.a(str1, false) != -1)
    {
      localzcbw = b(this.c, str1);
      localObject1 = new zchf(localzbcj);
      ((zchf)localObject1).a(localzcbw);
    }
    if (this.c.a(str2, false) != -1)
    {
      localzcbw = b(this.c, str2);
      localObject1 = new zchi(localzbcj);
      ((zchi)localObject1).a(localzcbw);
    }
    Object localObject1 = null;
    String str3 = "xl/revisions/_rels/" + zk.b(str1) + ".rels";
    if (this.c.a(str3, false) != -1)
    {
      localObject2 = zauy.a(this.c, str3, true);
      localObject1 = zalb.b((zcjy)localObject2);
      ((zcjy)localObject2).c();
    }
    Object localObject2 = new zchh(this.b);
    for (int i = 0; i < localzbcj.getCount(); i++)
    {
      zbci localzbci = localzbcj.a(i);
      if ((localzbci.b.i != null) && (!"".equals(localzbci.b.i)))
      {
        zrl localzrl = (zrl)((HashMap)localObject1).get(localzbci.b.i);
        localzcbw = b(this.c, "xl/revisions/" + localzrl.d);
        ((zchh)localObject2).a(localzcbw, localzbci);
      }
    }
  }
  
  private void i()
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
  
  private void j()
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
      HashMap localHashMap2 = a(str1);
      zcgt localzcgt = new zcgt(this, localzri, localHashMap2);
      String str2 = "xl/pivotCache/" + str1;
      localzcgt.a(b(this.c, str2));
      if (localzri.b.b()) {
        localzri.b.u = zalq.a(this.c, str2);
      }
      String str3 = localzcgt.a;
      int j = localzcgt.b;
      a(localzri.b, str3, localHashMap2, j);
    }
  }
  
  void a(zawp paramzawp, String paramString, HashMap paramHashMap, int paramInt)
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
    zcgv localzcgv = new zcgv(this, this.b, paramzawp);
    String str = "xl/pivotCache/" + zk.b(localzrl.d);
    zcbw localzcbw = b(this.c, str);
    if (null == localzcbw) {
      return;
    }
    localzcgv.a(localzcbw, paramInt);
  }
  
  private HashMap a(String paramString)
    throws Exception
  {
    String str = "xl/pivotCache/_rels/" + paramString + ".rels";
    HashMap localHashMap = null;
    if (this.c.a(str, true) != -1)
    {
      zcjy localzcjy = zauy.a(this.c, str, true);
      localHashMap = zalb.b(localzcjy);
      localzcjy.c();
    }
    return localHashMap;
  }
  
  private void b(zi paramzi)
    throws Exception
  {
    Iterator localIterator = paramzi.iterator();
    while (localIterator.hasNext())
    {
      zh localzh = (zh)localIterator.next();
      if (!localzh.c())
      {
        String str1 = localzh.b();
        String str2 = zauj.an(str1);
        if ((!str1.endsWith(".rels")) && ((str2.equals("media")) || (str2.equals("customData"))))
        {
          zqo localzqo = new zqo();
          localzqo.b = str1;
          localzqo.a = str2;
          String str3 = zauj.ao(str1);
          if (paramzi.a(str3, true) != -1)
          {
            zcjy localzcjy = zauy.a(paramzi, str3, true);
            localzqo.d = zalb.a(localzcjy);
            localzcjy.c();
          }
          zf.a(this.a.a.i, localzqo);
        }
      }
    }
  }
  
  private void c(zi paramzi)
    throws Exception
  {
    String str = "[Content_Types].xml";
    zaki localzaki = new zaki(this.b);
    zcjy localzcjy = zauy.a(paramzi, str, true);
    localzaki.a(localzcjy);
    localzcjy.c();
  }
  
  void a(zi paramzi)
    throws Exception
  {
    Iterator localIterator = this.b.c.iterator();
    while (localIterator.hasNext())
    {
      zqi localzqi = (zqi)localIterator.next();
      if (!zw.b(localzqi.c))
      {
        localzqi.m = this.b;
        zrl localzrl = (zrl)this.b.b().get(localzqi.c);
        String str1 = zk.b(localzrl.d);
        if (localzrl.d.startsWith("worksheets/"))
        {
          b(localzqi, str1, paramzi);
          String str2 = "xl/worksheets/_rels/" + str1 + ".rels";
          if (paramzi.a(str2, false) != -1)
          {
            zcjy localzcjy = zauy.a(paramzi, str2, true);
            localzqi.e = zalb.b(localzcjy);
            localzcjy.c();
          }
        }
        else if ((localzrl.d.startsWith("chartsheets/")) && (zauj.b))
        {
          a(localzqi, str1, paramzi);
        }
        else
        {
          this.b.a.getWorksheets().removeAt(localzqi.d.getName());
        }
      }
    }
  }
  
  private void a(zqi paramzqi, String paramString, zi paramzi)
    throws Exception
  {
    a(paramzqi, 2, paramString, paramzi);
    String str = "xl/chartsheets/" + paramString;
    zcew localzcew = new zcew(this);
    localzcew.a(paramzqi, b(paramzi, str));
    c(paramzqi, "xl/chartsheets", paramzi);
    d(paramzqi, paramzi);
    if (paramzqi.i != null) {
      a(paramzqi, paramzi);
    }
  }
  
  private void b(zqi paramzqi, String paramString, zi paramzi)
    throws Exception
  {
    a(paramzqi, 1, paramString, paramzi);
    a(paramzqi, paramzqi.e, paramzqi.d);
    c(paramzqi, paramzi);
    b(paramzqi, paramzi);
    String str = paramzqi.a();
    if (str != null)
    {
      localObject = new zcfd(this);
      ((zcfd)localObject).a(paramzqi, b(paramzi, str));
    }
    Object localObject = "xl/worksheets/" + paramString;
    zcio localzcio = new zcio(this);
    localzcio.a(paramzqi, b(paramzi, (String)localObject));
    c(paramzqi, "xl/worksheets/", paramzi);
    d(paramzqi, paramzi);
    e(paramzqi, paramzi);
    if (paramzqi.i != null) {
      a(paramzqi, paramzi);
    }
    a(paramzqi);
    zaxj.a(paramzqi.d, true);
  }
  
  private void a(zqi paramzqi)
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
        localObject3 = this.c.a((zh)localObject2);
        localObject4 = zx.a((zm)localObject3, false);
        ((zm)localObject3).a();
        paramzqi.d.getPageSetup().setPrinterSettings((byte[])localObject4);
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
            zm localzm = this.c.a((zh)localObject4);
            byte[] arrayOfByte = zx.a(localzm, false);
            localzm.a();
            ((zoh)localObject1).e().setPrinterSettings(arrayOfByte);
            ((zoh)localObject1).b = null;
          }
        }
      }
    }
  }
  
  private void a(zqi paramzqi, zi paramzi)
    throws Exception
  {
    String str = zauj.aH(paramzqi.a(paramzqi.i));
    zh localzh = paramzi.a(str);
    zm localzm = paramzi.a(localzh);
    byte[] arrayOfByte = new byte[(int)localzh.a()];
    localzm.a(arrayOfByte, 0, (int)localzh.a());
    localzm.a();
    paramzqi.d.setBackgroundImage(arrayOfByte);
    zf.a(this.a.a.f, zk.b(str));
  }
  
  private void b(zqi paramzqi, zi paramzi)
    throws Exception
  {
    ArrayList localArrayList = zalb.b(paramzqi.e, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotTable");
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zrl localzrl = (zrl)localArrayList.get(i);
      String str = "xl/pivotTables/" + zk.b(localzrl.d);
      zcgx localzcgx = new zcgx(this);
      zcbw localzcbw = b(paramzi, str);
      if (localzcbw != null) {
        localzcgx.a(paramzqi, localzcbw);
      }
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
      zchb localzchb = new zchb(this, paramObject);
      zcbw localzcbw = b(this.c, str);
      if (localzcbw != null) {
        localzchb.a(paramzqi, localzcbw);
      }
      paramHashMap.remove(localzrl.b);
    }
  }
  
  private void c(zqi paramzqi, zi paramzi)
    throws Exception
  {
    ArrayList localArrayList = zalb.b(paramzqi.e, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/table");
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zrl localzrl = (zrl)localArrayList.get(i);
      String str1 = "xl/tables/" + zk.b(localzrl.d);
      zcid localzcid = new zcid(this);
      localzcid.a(paramzqi, b(paramzi, str1));
      zcjy localzcjy = null;
      HashMap localHashMap = null;
      String str2 = "xl/tables/_rels/" + zk.b(localzrl.d) + ".rels";
      if (paramzi.a(str2, false) != -1)
      {
        localzcjy = zauy.a(paramzi, str2, true);
        localHashMap = zalb.b(localzcjy);
        localzcjy.c();
      }
      a(paramzqi, localHashMap, localzcid.a());
    }
  }
  
  private void d(zqi paramzqi, zi paramzi)
    throws Exception
  {
    String str1 = paramzqi.a(paramzqi.f);
    if (str1 == null) {
      return;
    }
    zcjy localzcjy = null;
    String str2 = "xl/drawings/_rels/" + zk.b(str1) + ".rels";
    str1 = zauj.aH(str1);
    HashMap localHashMap = null;
    if (paramzi.a(str2, true) != -1)
    {
      localzcjy = zauy.a(paramzi, str2, true);
      localHashMap = zalb.b(localzcjy);
      localzcjy.c();
    }
    zalo localzalo = new zalo(paramzqi, localHashMap, paramzi, str1);
    localzalo.a();
  }
  
  private void e(zqi paramzqi, zi paramzi)
    throws Exception
  {
    String str1 = paramzqi.a(paramzqi.g);
    if (str1 != null)
    {
      str1 = zauj.aH(str1);
      zcjy localzcjy = zauy.a(paramzi, str1, true);
      zakt localzakt = new zakt();
      ArrayList localArrayList = localzakt.a(localzcjy);
      localzcjy.c();
      String str2 = "xl/drawings/_rels/" + zk.b(str1) + ".rels";
      if (localArrayList == null) {
        return;
      }
      if (paramzi.a(str2, true) == -1) {
        return;
      }
      localzcjy = zauy.a(paramzi, str2, true);
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
          zh localzh = paramzi.a(str3);
          zm localzm = paramzi.a(localzh);
          byte[] arrayOfByte = new byte[(int)localzh.a()];
          localzm.a(arrayOfByte, 0, (int)localzh.a());
          localzm.a();
          Picture localPicture = paramzqi.d.getPageSetup().a(localzqc.a, arrayOfByte);
          localzqc.a(localPicture, zbxp.a());
        }
      }
    }
  }
  
  private void c(zqi paramzqi, String paramString, zi paramzi)
    throws Exception
  {
    String str1 = paramzqi.a(paramzqi.h);
    if (str1 == null) {
      return;
    }
    zcjy localzcjy = null;
    String str2 = "xl/drawings/_rels/" + zk.b(str1) + ".rels";
    str1 = zauj.aH(str1);
    HashMap localHashMap = null;
    if (paramzi.a(str2, false) != -1)
    {
      localzcjy = zauy.a(paramzi, str2, true);
      localHashMap = zalb.a(localzcjy, this.b, this.b.a, paramzi, paramString);
      localzcjy.c();
    }
    zakp localzakp = new zakp(paramzqi, localHashMap, paramzi, str1);
    localzakp.a(false);
    if (localzakp.a().size() > 0) {
      paramzqi.d.w().a(localzakp.a());
    }
  }
  
  private void a(zqi paramzqi, int paramInt, String paramString, zi paramzi)
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
    if (paramzi.a(str, false) != -1)
    {
      zcjy localzcjy = zauy.a(paramzi, str, true);
      paramzqi.e = zalb.b(localzcjy);
      localzcjy.c();
      paramzqi.b(paramzqi.d.k.d);
    }
  }
  
  void b(zcbw paramzcbw)
    throws Exception
  {
    int i = paramzcbw.a();
    if (i != 159) {
      return;
    }
    zajl localzajl = this.a.getWorksheets().g;
    byte[] arrayOfByte1 = a(paramzcbw);
    int j = zc.a(arrayOfByte1, 0);
    int k = 0;
    int m = 0;
    String str = null;
    int n = 0;
    for (int i1 = 0; i1 < j; i1++)
    {
      i = paramzcbw.a();
      if (i != 19) {
        break;
      }
      arrayOfByte1 = a(paramzcbw);
      k = (arrayOfByte1[0] & 0xFF & 0x1) != 0 ? 1 : 0;
      m = (arrayOfByte1[0] & 0xFF & 0x2) != 0 ? 1 : 0;
      int i2 = 1;
      int[] arrayOfInt = { i2 };
      str = zcgj.a(arrayOfByte1, arrayOfInt);
      i2 = arrayOfInt[0];
      Object localObject;
      if (k != 0)
      {
        n = zc.a(arrayOfByte1, i2);
        byte[] arrayOfByte2 = new byte[n * 4];
        i2 += 4;
        for (int i3 = 0; i3 < n; i3++)
        {
          System.arraycopy(arrayOfByte1, i2, arrayOfByte2, i3 * 4, 4);
          int i4 = zc.e(arrayOfByte1, i2 + 2) & 0xFFFF;
          if (i4 < this.b.c().size())
          {
            int i5 = ((Integer)this.b.c().get(Integer.valueOf(i4))).intValue();
            System.arraycopy(zc.a(i5), 0, arrayOfByte2, i3 * 4 + 2, 2);
          }
          i2 += 4;
        }
        localObject = new zbdd(str, arrayOfByte2, 0);
      }
      else
      {
        localObject = new zbbj(str, 0);
      }
      ((zbbj)localObject).e = i1;
      localzajl.b((zbbj)localObject);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */