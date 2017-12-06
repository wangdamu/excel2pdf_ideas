package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zafo
{
  ze a = new ze("[\\u001C-\\u001F\\u009F]");
  HashMap b = new HashMap();
  HashMap c = new HashMap();
  HashMap d = new HashMap();
  HashMap e = new HashMap();
  HashMap f = new HashMap();
  HashMap g = new HashMap();
  HashMap h = new HashMap();
  HashMap i = new HashMap();
  Workbook j = null;
  String k = null;
  String l = null;
  String m = null;
  String n = ".htm";
  String o = null;
  zm p = null;
  String q = null;
  String r = null;
  String s = null;
  ArrayList t = new ArrayList();
  ArrayList u = new ArrayList();
  private zafk A = null;
  private zpj B = null;
  private Style C = null;
  private HashMap D = null;
  private HashMap E = null;
  private boolean F = false;
  boolean v = false;
  String w = null;
  private HtmlSaveOptions G;
  IStreamProvider x;
  HashMap y = null;
  zaca z;
  private String H;
  private HashMap I = null;
  private ArrayList J = new ArrayList();
  
  boolean a()
  {
    return this.F;
  }
  
  boolean b()
  {
    return this.p != null;
  }
  
  HtmlSaveOptions c()
  {
    return this.G;
  }
  
  HashMap d()
  {
    return this.I;
  }
  
  private HashMap a(WorksheetCollection paramWorksheetCollection)
  {
    HashMap localHashMap1 = new HashMap();
    int i1 = paramWorksheetCollection.getCount();
    Worksheet localWorksheet = null;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localWorksheet = paramWorksheetCollection.get(i2);
      int i3 = localWorksheet.getHyperlinks().getCount();
      for (int i4 = 0; i4 < i3; i4++)
      {
        Hyperlink localHyperlink = localWorksheet.getHyperlinks().get(i4);
        String str1 = null;
        CellArea localCellArea = null;
        String[] arrayOfString = { str1 };
        CellArea[] arrayOfCellArea = { localCellArea };
        boolean bool = zagn.a(paramWorksheetCollection, localHyperlink, arrayOfString, arrayOfCellArea);
        str1 = arrayOfString[0];
        localCellArea = arrayOfCellArea[0];
        if ((bool) && (paramWorksheetCollection.get(str1) != null))
        {
          if (localHashMap1.get(str1) == null) {
            localHashMap1.put(str1, new HashMap());
          }
          Cell localCell = paramWorksheetCollection.get(str1).getCells().get(localCellArea.StartRow, localCellArea.StartColumn);
          String str2 = "";
          if (localHyperlink.getAddress().indexOf("!") == -1) {
            str2 = localHyperlink.getAddress();
          } else {
            str2 = "RANGE!" + zauj.a(localCellArea);
          }
          HashMap localHashMap2 = (HashMap)localHashMap1.get(str1);
          if (localHashMap2.get(localCell.getName()) == null) {
            localHashMap2.put(localCell.getName(), str2);
          }
        }
      }
    }
    return localHashMap1;
  }
  
  zafo(Workbook paramWorkbook, String paramString1, String paramString2, zm paramzm, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    this.G = paramHtmlSaveOptions;
    this.j = paramWorkbook;
    this.z = zla.a(paramWorkbook);
    this.y = new HashMap();
    this.A = new zafk(paramWorkbook);
    this.k = paramString2;
    this.p = paramzm;
    this.o = paramHtmlSaveOptions.getPageTitle();
    this.B = zpj.a(paramWorkbook);
    this.C = new Style(paramWorkbook.getWorksheets());
    this.C.copy(paramWorkbook.getWorksheets().Q());
    String str;
    if (paramString1 != null)
    {
      this.l = zk.c(paramString1);
      str = zk.d(paramString1);
      if ((".htm".equals(str.toLowerCase())) || (".html".equals(str.toLowerCase()))) {
        this.n = str;
      } else if ((".mht".equals(str.toLowerCase())) || (".mhtml".equals(str.toLowerCase()))) {
        this.l = zk.c(paramString1);
      } else {
        this.l = zk.b(paramString1);
      }
      this.m = (this.l + this.n);
      this.r = (this.l + "_files");
      this.s = (zk.e(paramString1) + zk.a);
      this.q = (this.s + this.r + zk.a);
    }
    else
    {
      str = this.G.getAttachedFilesDirectory();
      if ((str != null) && (str.length() > 1))
      {
        if (str.charAt(str.length() - 1) != zk.a) {
          str = str + zk.a;
        }
        this.r = zk.e(str);
        this.q = (zk.e(str) + zk.a);
      }
      else if (this.G.isExpImageToTempDir())
      {
        this.q = zk.a();
      }
      else if (this.G.getExportObjectListener() != null)
      {
        this.q = "";
      }
      else
      {
        this.q = null;
      }
      this.w = this.G.getAttachedFilesUrlPrefix();
    }
    this.x = paramHtmlSaveOptions.getStreamProvider();
    if (this.x == null) {
      if (this.r != null) {
        this.x = new zbsk(this.q, this.r.length() + 1);
      } else {
        this.x = new zbsk(this.q, 0);
      }
    }
    if (null == this.r) {
      this.r = "";
    }
    m();
    l();
  }
  
  private void l()
  {
    NameCollection localNameCollection = this.j.getWorksheets().getNames();
    Range localRange = null;
    String str = "";
    Iterator localIterator = localNameCollection.iterator();
    while (localIterator.hasNext())
    {
      Name localName = (Name)localIterator.next();
      localRange = localName.getRange(false);
      if ((null != localRange) && (localName.getRefersTo() != null) && (!"".equals(localName.getRefersTo())))
      {
        CellArea localCellArea = localRange.a();
        str = localRange.getWorksheet().getName() + "#" + localCellArea.StartColumn + "#" + localCellArea.StartRow;
        if (!this.c.containsKey(str)) {
          this.c.put(str, localName.getText());
        }
      }
    }
  }
  
  zafk e()
  {
    return this.A;
  }
  
  zpj f()
  {
    return this.B;
  }
  
  HashMap g()
  {
    return this.D;
  }
  
  void a(HashMap paramHashMap)
  {
    this.D = paramHashMap;
  }
  
  HashMap h()
  {
    return this.E;
  }
  
  void b(HashMap paramHashMap)
  {
    this.E = paramHashMap;
  }
  
  Style i()
  {
    return this.C;
  }
  
  private void m()
  {
    if ((this.k != null) && (this.k.length() > 0))
    {
      Worksheet localWorksheet1 = this.j.getWorksheets().get(this.k);
      if (localWorksheet1 == null) {
        throw new CellsException(15, "sheet " + this.k + " does not exist");
      }
      zf.a(this.u, localWorksheet1);
    }
    else
    {
      Worksheet localWorksheet2;
      for (i1 = 0; i1 < this.j.getWorksheets().getCount(); i1++)
      {
        localWorksheet2 = this.j.getWorksheets().get(i1);
        if ((localWorksheet2.isVisible()) && ((localWorksheet2.getType() == 1) || (localWorksheet2.getType() == 2))) {
          zf.a(this.u, localWorksheet2);
        }
      }
      if (this.G.getExportHiddenWorksheet()) {
        for (i1 = 0; i1 < this.j.getWorksheets().getCount(); i1++)
        {
          localWorksheet2 = this.j.getWorksheets().get(i1);
          if ((!localWorksheet2.isVisible()) && ((localWorksheet2.getType() == 1) || (localWorksheet2.getType() == 2))) {
            this.u.add(localWorksheet2.getIndex(), localWorksheet2);
          }
        }
      }
    }
    int i1 = this.u.size();
    if ((i1 == 1) || (i1 == 0)) {
      this.F = false;
    } else {
      this.F = true;
    }
    n();
  }
  
  zago a(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4, StreamProviderOptions paramStreamProviderOptions)
    throws Exception
  {
    if (paramzago == null)
    {
      String str1 = "tabstrip.htm";
      String str2 = this.r + "/" + str1;
      paramStreamProviderOptions.a = str2;
      this.x.initStream(paramStreamProviderOptions);
      zm localzm = paramStreamProviderOptions.c;
      Encoding localEncoding = c().getEncoding();
      if (localEncoding == null) {
        localEncoding = Encoding.getUTF8();
      }
      paramzago = new zago(localzm, localEncoding);
      this.y.put(str1, paramStreamProviderOptions.b == null ? paramStreamProviderOptions.a : paramStreamProviderOptions.b);
    }
    else
    {
      b(paramzago, paramString1, paramString2, paramString3, paramString4);
    }
    return paramzago;
  }
  
  zago a(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4)
    throws Exception
  {
    if (paramzago == null)
    {
      Encoding localEncoding = c().getEncoding();
      if (localEncoding == null) {
        localEncoding = Encoding.getUTF8();
      }
      if (this.p != null) {
        paramzago = new zago(this.p, localEncoding);
      } else {
        paramzago = new zago(this.s + this.l + this.n, localEncoding);
      }
    }
    else
    {
      b(paramzago, paramString1, paramString2, paramString3, paramString4);
    }
    return paramzago;
  }
  
  public static void b(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4)
    throws Exception
  {
    paramzago.g();
    paramzago.g();
    paramzago.b(paramString1);
    paramzago.b("Content-Location: " + paramString2);
    paramzago.b("Content-Transfer-Encoding: " + paramString3);
    paramzago.b("Content-Type: " + paramString4);
    paramzago.g();
    paramzago.g();
  }
  
  zago b(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4, StreamProviderOptions paramStreamProviderOptions)
    throws Exception
  {
    if (paramzago == null)
    {
      String str1 = "stylesheet.css";
      String str2 = this.r + "/" + str1;
      paramStreamProviderOptions.a = str2;
      this.x.initStream(paramStreamProviderOptions);
      zm localzm = paramStreamProviderOptions.c;
      Encoding localEncoding = c().getEncoding();
      if (localEncoding == null) {
        localEncoding = Encoding.getUTF8();
      }
      paramzago = new zago(localzm, localEncoding);
      this.y.put(str1, paramStreamProviderOptions.b == null ? paramStreamProviderOptions.a : paramStreamProviderOptions.b);
    }
    else
    {
      b(paramzago, paramString1, paramString2, paramString3, paramString4);
    }
    return paramzago;
  }
  
  zago c(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4, StreamProviderOptions paramStreamProviderOptions)
    throws Exception
  {
    if (paramzago == null)
    {
      String str1 = "filelist.xml";
      String str2 = this.r + "/" + str1;
      paramStreamProviderOptions.a = str2;
      this.x.initStream(paramStreamProviderOptions);
      zm localzm = paramStreamProviderOptions.c;
      Encoding localEncoding = c().getEncoding();
      if (localEncoding == null) {
        localEncoding = Encoding.getUTF8();
      }
      paramzago = new zago(localzm, localEncoding);
      this.y.put(str1, paramStreamProviderOptions.b == null ? paramStreamProviderOptions.a : paramStreamProviderOptions.b);
    }
    else
    {
      b(paramzago, paramString1, paramString2, paramString3, paramString4);
    }
    return paramzago;
  }
  
  zago a(String paramString1, zago paramzago, String paramString2, String paramString3, String paramString4, String paramString5, StreamProviderOptions paramStreamProviderOptions)
    throws Exception
  {
    this.H = paramString3;
    String str1 = this.q + paramString1;
    if (paramzago == null)
    {
      String str2 = paramString1;
      String str3 = this.r + "/" + str2;
      paramStreamProviderOptions.a = str3;
      this.x.initStream(paramStreamProviderOptions);
      zm localzm = paramStreamProviderOptions.c;
      Encoding localEncoding = c().getEncoding();
      if (localEncoding == null) {
        localEncoding = Encoding.getUTF8();
      }
      paramzago = new zago(localzm, localEncoding);
      this.y.put(str2, paramStreamProviderOptions.b == null ? paramStreamProviderOptions.a : paramStreamProviderOptions.b);
    }
    else
    {
      b(paramzago, paramString2, paramString3 + paramString1, paramString4, paramString5);
    }
    return paramzago;
  }
  
  String a(String paramString)
  {
    if (this.u.size() <= 1)
    {
      if ((this.G != null) && (this.G.getFilePathProvider() != null)) {
        return c().getFilePathProvider().getFullName(paramString);
      }
      return "";
    }
    for (int i1 = 0; i1 < this.u.size(); i1++)
    {
      Worksheet localWorksheet = (Worksheet)this.u.get(i1);
      if (zw.b(localWorksheet.getName(), paramString))
      {
        String str = "sheet" + zagn.a(i1 + 1, 3) + ".htm";
        return str;
      }
    }
    return "";
  }
  
  ArrayList j()
  {
    return this.J;
  }
  
  private void n()
  {
    for (int i1 = 0; i1 < this.u.size(); i1++)
    {
      Worksheet localWorksheet = (Worksheet)this.u.get(i1);
      if (localWorksheet.getHyperlinks().getCount() > 0) {
        for (int i2 = 0; i2 < localWorksheet.getHyperlinks().getCount(); i2++)
        {
          Hyperlink localHyperlink = localWorksheet.getHyperlinks().get(i2);
          try
          {
            if (localHyperlink.a(this.j.getWorksheets()) == 2) {
              zf.a(this.J, localHyperlink);
            }
          }
          catch (Exception localException) {}
        }
      }
    }
  }
  
  String b(String paramString)
  {
    if (this.q == null) {
      return "";
    }
    if ((b()) && (paramString == null))
    {
      if (this.w != null) {
        return this.w;
      }
      return this.q;
    }
    if (!a()) {
      return this.r + zk.a;
    }
    return "";
  }
  
  Workbook k()
  {
    return this.j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */