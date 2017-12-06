package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zpt
  implements zj
{
  Workbook a;
  zadm b;
  ArrayList c;
  zpo d;
  zbbs e;
  HashMap f = new HashMap();
  HashMap g;
  ArrayList h;
  private HashMap G;
  ArrayList i = new ArrayList();
  int j = 1;
  int k = 1;
  int l = 0;
  boolean m = true;
  private int H = 1;
  zi n = null;
  ArrayList o = new ArrayList();
  String p = ".xml";
  String q = ".xml.rels";
  boolean r = true;
  private int I = 1;
  private int J = 1;
  private int K = 1;
  private int L = 1;
  private int M = 1;
  int s = 1;
  private int N = 1;
  int t = 0;
  private int O;
  HashMap u = new HashMap();
  zang v;
  int w = 1;
  int x = 1;
  int y = 1;
  zaca z;
  SaveOptions A;
  int B = 1;
  private zbbs P = new zbbs();
  String C = "../media/";
  zvq D = null;
  String E = null;
  private int Q = 1;
  private int R = 1;
  boolean F = false;
  private int S = 1;
  private static final za T = new za(new String[] { "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "xls", "xltx", "xltm", "xlsx", "xlsm", "doc", "dot", "docm", "docx", "dotm", "dotx", "ppt", "pptm", "pptx", "sldx", "application/vnd.openxmlformats-package.core-properties+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.revisionLog+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.userNames+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.revisionHeaders+xml" });
  
  public void dispose()
  {
    this.v = null;
    this.A = null;
    this.n = null;
    this.o = null;
    if (this.c != null) {
      for (int i1 = this.c.size() - 1; i1 >= 0; i1--) {
        ((zpu)this.c.get(i1)).dispose();
      }
    }
    this.c = null;
    this.h = null;
    this.G = null;
    this.u = null;
    if (this.z != null) {
      this.z.c();
    }
    this.z = null;
    this.b = null;
    this.g = null;
    this.f = null;
    this.d = null;
    this.a = null;
    this.e = null;
    zg.a(this);
  }
  
  zpt(Shape paramShape, SaveOptions paramSaveOptions)
    throws Exception
  {
    this.p = ".xml";
    this.r = true;
    this.A = paramSaveOptions;
    this.a = paramShape.P().p();
    this.G = new HashMap();
    a(paramShape);
  }
  
  private void a(Shape paramShape)
    throws Exception
  {
    this.C = "media/";
    zbbr localzbbr = new zbbr(this.P);
    a("_rels/.rels", localzbbr);
    a(true, "rels", "application/vnd.openxmlformats-package.relationships+xml");
    a(true, "xml", "application/xml");
    zph localzph = new zph(this, paramShape);
    zuq localzuq = new zuq(this);
    a("[Content_Types].xml", localzuq);
  }
  
  zpt(Workbook paramWorkbook, zi paramzi, boolean paramBoolean1, int paramInt, SaveOptions paramSaveOptions, boolean paramBoolean2)
    throws Exception
  {
    this.a = paramWorkbook;
    this.n = paramzi;
    this.m = paramBoolean1;
    this.r = (paramInt != 16);
    this.p = (this.r ? ".xml" : ".bin");
    this.q = (this.r ? ".xml.rels" : ".bin.rels");
    this.O = paramInt;
    this.A = paramSaveOptions;
    if (!paramBoolean2) {
      l();
    }
  }
  
  void a(String paramString1, String paramString2, String paramString3)
  {
    this.P.b(paramString1, paramString2, paramString3);
  }
  
  private void h()
  {
    if ((this.a.a != null) && (this.a.a.h.size() > 0)) {
      for (int i1 = 0; i1 < this.a.a.h.size(); i1++)
      {
        zrl localzrl = (zrl)this.a.a.h.get(i1);
        this.P.b(localzrl.c, localzrl.d, localzrl.e);
      }
    }
    zbbr localzbbr = new zbbr(this.P);
    a("_rels/.rels", localzbbr);
  }
  
  private void i()
  {
    if (!this.r) {
      return;
    }
    zbpq localzbpq = this.a.getWorksheets().I();
    if ((localzbpq == null) || (localzbpq.getCount() == 0)) {
      return;
    }
    int i1 = localzbpq.getCount();
    int i2 = 1;
    for (int i3 = 0; i3 < i1; i3++)
    {
      zbpp localzbpp = localzbpq.a(i3);
      zvp localzvp = new zvp(localzbpp);
      i2 = a("xl/slicerCaches/slicerCache", this.p, i2, localzvp);
      localzbpp.b = c("http://schemas.microsoft.com/office/2007/relationships/slicerCache", "slicerCaches/" + localzvp.c()).b;
      b(localzvp.b(), "application/vnd.ms-excel.slicerCache+xml");
    }
  }
  
  int a()
  {
    return this.I++;
  }
  
  int b()
  {
    return this.J++;
  }
  
  int c()
  {
    return this.N++;
  }
  
  int d()
  {
    return this.K++;
  }
  
  int e()
  {
    return this.L;
  }
  
  void a(int paramInt)
  {
    this.L = paramInt;
  }
  
  private void j()
    throws Exception
  {
    int i1 = 1;
    int i2 = 1;
    int i3 = 1;
    for (int i4 = 0; i4 < this.a.getWorksheets().getCount(); i4++)
    {
      Worksheet localWorksheet = this.a.getWorksheets().get(i4);
      zpu localzpu = null;
      String str1 = null;
      String str2 = null;
      String str3 = null;
      Object localObject = null;
      if (localWorksheet.getType() == 1)
      {
        localzpu = new zpu(this, localWorksheet, i1, i2);
        zf.a(this.c, localzpu);
        str1 = "worksheets/sheet" + zauj.z(i2) + this.p;
        localzpu.h = c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet", str1).b;
        i1++;
        i2++;
        str3 = this.r ? "application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml" : "application/vnd.ms-excel.worksheet";
        str2 = "xl/worksheets/_rels/sheet" + zauj.z(localzpu.d) + this.q;
        zaxj.a(localWorksheet, false);
        if (this.r) {
          localObject = new zvy(localzpu, this.d, (OoxmlSaveOptions)this.A, this.D);
        } else {
          localObject = new zcip(this, localzpu);
        }
      }
      else if (localWorksheet.getType() == 2)
      {
        if ((!zauj.a(localWorksheet.getCharts().get(0))) && (localWorksheet.k == null)) {
          continue;
        }
        localzpu = new zpu(this, localWorksheet, i1, i3);
        zf.a(this.c, localzpu);
        str1 = "chartsheets/sheet" + i3 + this.p;
        localzpu.h = c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/chartsheet", str1).b;
        i1++;
        i3++;
        str3 = this.r ? "application/vnd.openxmlformats-officedocument.spreadsheetml.chartsheet+xml" : "application/application/vnd.ms-excel.chartsheet";
        str2 = "xl/chartsheets/_rels/sheet" + zauj.z(localzpu.d) + this.q;
        if (this.r) {
          localObject = new zun(localzpu);
        } else {
          localObject = new zcex(this, localzpu);
        }
      }
      if (str1 != null)
      {
        b("/xl/" + str1, str3);
        a("xl/" + str1, (zp)localObject);
        zbbr localzbbr = new zbbr(localzpu.g);
        a(str2, localzbbr);
      }
    }
  }
  
  private void k()
  {
    zbth localzbth = this.a.getWorksheets().w();
    int i1 = 0;
    for (int i2 = 0; i2 < localzbth.getCount(); i2++)
    {
      zbti localzbti = localzbth.a(i2);
      String str1 = localzbti.l();
      if ((str1 != null) && (str1.trim().length() != 0) && ((localzbti.a() == 3) || (localzbti.a() == 0) || (localzbti.a() == 4)))
      {
        i1++;
        String str2 = "externalLink" + i1 + this.p;
        Object localObject1 = null;
        if (this.r)
        {
          b("/xl/externalLinks/" + str2, "application/vnd.openxmlformats-officedocument.spreadsheetml.externalLink+xml");
          localObject1 = new zuy(this, localzbti);
        }
        else
        {
          b("/xl/externalLinks/" + str2, "application/vnd.ms-excel.externalLink");
          localObject1 = new zcfx(localzbti);
        }
        if ((localzbti.a() == 0) || (localzbti.a() == 4))
        {
          localObject2 = null;
          String str3 = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/externalLinkPath";
          String str4;
          zbbs localzbbs;
          Object localObject3;
          if (localzbti.a() == 4)
          {
            str4 = null;
            localzbbs = null;
            localObject3 = new String[] { str4 };
            String[] arrayOfString = { localzbbs };
            localzbti.b((String[])localObject3, arrayOfString);
            str4 = localObject3[0];
            localzbbs = arrayOfString[0];
            localObject2 = localzbbs;
            str3 = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/oleObject";
          }
          else
          {
            localObject2 = localzbti.m();
          }
          if (!zw.b((String)localObject2))
          {
            if (this.r) {
              localObject2 = zbxt.d((String)localObject2);
            } else {
              localObject2 = zw.a((String)localObject2, " ", "%20");
            }
            str4 = "xl/externalLinks/_rels/" + str2 + ".rels";
            localzbbs = new zbbs();
            localzbbs.b(str3, (String)localObject2, "External");
            localObject3 = new zbbr(localzbbs);
            a(str4, (zp)localObject3);
          }
        }
        a("xl/externalLinks/" + str2, (zp)localObject1);
        Object localObject2 = c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/externalLink", "externalLinks/externalLink" + i1 + this.p);
        this.u.put(Integer.valueOf(i2), localObject2);
      }
    }
  }
  
  private void l()
    throws Exception
  {
    this.G = new HashMap();
    this.a.j();
    this.b = this.a.getWorksheets().a(this.A);
    if (this.b == null) {
      this.b = new zadm(this.a, this.A.getSaveFormat());
    }
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.m = false;
    localCalculationOptions.b = true;
    this.z = new zaca(this.a, 3, localCalculationOptions);
    v();
    this.c = new ArrayList();
    m();
    s();
    t();
    B();
    a(true);
    a(false);
    w();
    i();
    y();
    q();
    j();
    r();
    x();
    n();
    A();
    k();
    o();
    p();
    u();
    D();
    if ((this.A instanceof OoxmlSaveOptions))
    {
      LightCellsDataProvider localLightCellsDataProvider = ((OoxmlSaveOptions)this.A).getLightCellsDataProvider();
      if (localLightCellsDataProvider != null) {
        this.v = new zanh(this, localLightCellsDataProvider);
      }
    }
    z();
    h();
  }
  
  private void m()
  {
    a("rels", "application/vnd.openxmlformats-package.relationships+xml");
    a("xml", "application/xml");
    if (this.r)
    {
      this.E = C();
    }
    else
    {
      a("bin", "application/vnd.ms-excel.sheet.binary.macroEnabled.main");
      this.E = "application/vnd.ms-excel.sheet.binary.macroEnabled.main";
    }
    zuq localzuq = new zuq(this);
    a("[Content_Types].xml", localzuq);
  }
  
  private void n()
  {
    if (!this.r) {
      return;
    }
    if (zw.b(this.a.getRibbonXml())) {
      return;
    }
    String str = null;
    if (this.a.a != null) {
      str = this.a.a.k;
    }
    if (str == null) {
      str = "customUI/customUI.xml";
    }
    this.P.b("http://schemas.microsoft.com/office/2007/relationships/ui/extensibility", str, null);
    zbaq localzbaq = new zbaq(this.a.getRibbonXml());
    a(str, localzbaq);
  }
  
  private void o()
  {
    if ((this.a.g == null) || (this.a.g.getCount() == 0)) {
      return;
    }
    String str;
    Object localObject;
    if (this.r)
    {
      c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/connections", "connections.xml");
      str = "xl/connections.xml";
      localObject = new zup(this);
      a(str, (zp)localObject);
      b("/xl/connections.xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.connections+xml");
    }
    else
    {
      c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/connections", "connections.bin");
      str = "xl/connections.bin";
      localObject = new zcfq(this);
      a(str, (zp)localObject);
      b("/xl/connections.bin", "application/vnd.ms-excel.connections");
    }
  }
  
  private void p()
  {
    if (!this.r) {
      return;
    }
    if ((this.a.getWorksheets().getXmlMaps() == null) || (this.a.getWorksheets().getXmlMaps().getCount() == 0)) {
      return;
    }
    c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/xmlMaps", "xmlMaps.xml");
    String str = "xl/xmlMaps.xml";
    zwa localzwa = new zwa(this);
    a(str, localzwa);
  }
  
  private void q()
  {
    this.d = zpo.a(this);
    if (this.r) {
      this.D = new zvq(this.a, this.d);
    }
  }
  
  private void r()
  {
    if (this.r)
    {
      b("/xl/styles.xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml");
      a("xl/styles.xml", this.D);
    }
    else
    {
      b("/xl/styles.bin", "application/vnd.ms-excel.styles");
      a("xl/styles.bin", new zchv(this));
    }
    c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles", "styles" + this.p);
  }
  
  private void s()
  {
    this.P.b("http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument", this.r ? "xl/workbook.xml" : "xl/workbook.bin", null);
    this.e = new zbbs();
    String str = "xl/_rels/workbook" + this.p + ".rels";
    a(str, new zbbr(this.e));
    if ((this.a.a != null) && (this.a.a.g != null)) {
      this.e.a(this.a.a.g.d);
    }
    Object localObject;
    if (this.r)
    {
      if (this.m)
      {
        if (this.O == 9) {
          b("/xl/workbook.xml", "application/vnd.ms-excel.template.macroEnabled.main+xml");
        } else if (this.O == 10) {
          b("/xl/workbook.xml", "application/vnd.ms-excel.addin.macroEnabled.main+xml");
        } else {
          b("/xl/workbook.xml", "application/vnd.ms-excel.sheet.macroEnabled.main+xml");
        }
      }
      else if (this.O == 8) {
        b("/xl/workbook.xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.template.main+xml");
      } else {
        b("/xl/workbook.xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml");
      }
      localObject = new zvx(this);
      a("xl/workbook.xml", (zp)localObject);
    }
    else
    {
      localObject = new zcin(this);
      a("xl/workbook.bin", (zp)localObject);
    }
  }
  
  private void t()
    throws Exception
  {
    String str1 = "theme1.xml";
    String str2 = "xl/theme/" + str1;
    Object localObject = new zvt(this);
    a(str2, (zp)localObject);
    c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme", "theme/" + str1);
    b(((zp)localObject).b(), "application/vnd.openxmlformats-officedocument.theme+xml");
    zrs localzrs = this.a.d();
    if ((localzrs != null) && (localzrs.d != null))
    {
      String str3 = "xl/theme/_rels/" + str1 + ".rels";
      zbbs localzbbs = new zbbs();
      localzbbs.a(localzrs.d);
      localObject = new zbbr(localzbbs);
      a(str3, (zp)localObject);
      Iterator localIterator = localzrs.d.values().iterator();
      while (localIterator.hasNext())
      {
        zrl localzrl = (zrl)localIterator.next();
        switch (T.a(localzrl.c))
        {
        case 0: 
          byte[] arrayOfByte = localzrl.h;
          if (arrayOfByte != null)
          {
            localObject = a(arrayOfByte, zcc.b(zcc.a(arrayOfByte)));
            localzrl.d = ("../media/" + ((zp)localObject).c());
          }
          break;
        }
      }
    }
  }
  
  private void u()
    throws Exception
  {
    for (int i1 = 0; i1 < this.c.size(); i1++)
    {
      zpu localzpu = (zpu)this.c.get(i1);
      localzpu.b();
    }
  }
  
  private void v()
  {
    if ((this.a.a == null) || (this.a.a.i.size() == 0)) {
      return;
    }
    ArrayList localArrayList = this.a.a.i;
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      zqo localzqo = (zqo)localArrayList.get(i1);
      this.G.put(localzqo.b, new zth());
      if (localzqo.a.equals("pivotCache"))
      {
        localzqo.c = localzqo.b;
        b("/" + localzqo.c, "application/vnd.openxmlformats-officedocument.spreadsheetml.pivotCacheDefinition+xml");
      }
      else if (localzqo.a.equals("pivotTables"))
      {
        localzqo.c = localzqo.b;
        b("/" + localzqo.c, "application/vnd.openxmlformats-officedocument.spreadsheetml.pivotTable+xml");
      }
      else if (localzqo.a.equals("media"))
      {
        localzqo.c = localzqo.b;
      }
      else
      {
        localzqo.c = localzqo.b;
      }
    }
  }
  
  private void w()
  {
    zawq localzawq = this.a.getWorksheets().W();
    int i1 = localzawq.getCount();
    if (i1 == 0) {
      return;
    }
    for (int i2 = 0; i2 < i1; i2++)
    {
      zawp localzawp = localzawq.a(i2);
      b(localzawp);
    }
  }
  
  private void b(zawp paramzawp)
  {
    if (paramzawp.u != null) {
      if ((paramzawp.u[0] & 0xFF) == 179)
      {
        if (!this.r) {}
      }
      else if (!this.r) {
        return;
      }
    }
    zri localzri = null;
    String str1 = "xl/pivotCache/pivotCacheDefinition";
    localzri = new zri(paramzawp);
    zbbs localzbbs = localzri.a(this.r);
    Object localObject = null;
    if (paramzawp.u != null) {
      localObject = new zcz(paramzawp.u);
    } else if (this.r) {
      localObject = new zvd(localzri);
    } else {
      localObject = new zcgu(localzri);
    }
    this.Q = a(str1, this.p, this.Q, (zp)localObject);
    String str2 = ((zp)localObject).c();
    b(((zp)localObject).b(), this.r ? "application/vnd.openxmlformats-officedocument.spreadsheetml.pivotCacheDefinition+xml" : "application/vnd.ms-excel.pivotCacheDefinition");
    localzri.c = c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheDefinition", "pivotCache/" + str2).b;
    localzri.a = ((zp)localObject).a;
    if (this.h == null) {
      this.h = new ArrayList();
    }
    zf.a(this.h, localzri);
    if (((paramzawp.h != null) && (paramzawp.h.a != null)) || (paramzawp.v != null))
    {
      str1 = "xl/pivotCache/pivotCacheRecords";
      if (localzri.b.v != null) {
        localObject = new zcz(localzri.b.v);
      } else if (this.r) {
        localObject = new zve(localzri.b);
      } else {
        localObject = new zcgw(localzri.b);
      }
      this.R = a(str1, this.p, this.R, (zp)localObject);
      b(((zp)localObject).b(), this.r ? "application/vnd.openxmlformats-officedocument.spreadsheetml.pivotCacheRecords+xml" : "application/vnd.ms-excel.pivotCacheRecords");
      if (localzbbs == null) {
        localzbbs = new zbbs();
      }
      zrl localzrl = localzbbs.a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheRecords", ((zp)localObject).c());
      localzri.d = localzrl.b;
    }
    if ((localzbbs != null) && (localzbbs.a() > 0))
    {
      localObject = new zbbr(localzbbs);
      a("xl/pivotCache/_rels/" + str2 + ".rels", (zp)localObject);
    }
  }
  
  void a(String paramString1, String paramString2)
  {
    if (a(paramString1)) {
      return;
    }
    zpb localzpb = new zpb();
    localzpb.a = true;
    localzpb.b = paramString1;
    localzpb.d = paramString2;
    zf.a(this.o, localzpb);
  }
  
  private boolean a(String paramString)
  {
    for (int i1 = 0; i1 < this.o.size(); i1++)
    {
      zpb localzpb = (zpb)this.o.get(i1);
      if (zw.b(localzpb.b, paramString)) {
        return true;
      }
    }
    return false;
  }
  
  void b(String paramString1, String paramString2)
  {
    zpb localzpb = new zpb();
    localzpb.a = false;
    localzpb.c = paramString1;
    localzpb.d = paramString2;
    zf.a(this.o, localzpb);
  }
  
  void a(String paramString, ImageFormat paramImageFormat)
  {
    String str = null;
    if (paramImageFormat.equals(ImageFormat.getJpeg())) {
      str = "image/jpeg";
    } else if (paramImageFormat.equals(ImageFormat.getPng())) {
      str = "image/png";
    } else if (paramImageFormat.equals(ImageFormat.getEmf())) {
      str = "image/x-emf";
    } else if (paramImageFormat.equals(ImageFormat.getWmf())) {
      str = "image/x-wmf";
    } else if (paramImageFormat.equals(ImageFormat.getBmp())) {
      str = "image/bmp";
    } else if (paramImageFormat.equals(ImageFormat.getGif())) {
      str = "image/gif";
    } else if (paramImageFormat.equals(ImageFormat.getTiff())) {
      str = "image/tiff";
    } else {
      str = "image/bmp";
    }
    if (str != null) {
      a(paramString, str);
    }
  }
  
  private void x()
  {
    Object localObject;
    if (this.r)
    {
      c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/sharedStrings", "sharedStrings.xml");
      b("/xl/sharedStrings.xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml");
      localObject = new zvn(this, this.D);
      a("xl/sharedStrings.xml", (zp)localObject);
    }
    else
    {
      c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/sharedStrings", "sharedStrings.bin");
      b("/xl/sharedStrings.bin", "application/vnd.ms-excel.sharedStrings");
      localObject = new zcho(this.a);
      a("xl/sharedStrings.bin", (zp)localObject);
    }
  }
  
  private void y()
    throws Exception
  {
    VbaProject localVbaProject = this.a.getWorksheets().G();
    if (localVbaProject == null) {
      return;
    }
    if ((!this.a.hasMacro()) || (!this.m)) {
      return;
    }
    zm localzm = localVbaProject.a(null);
    if (localzm == null) {
      return;
    }
    zcz localzcz = new zcz(localzm);
    a("xl/vbaProject.bin", localzcz);
    this.e.a("http://schemas.microsoft.com/office/2006/relationships/vbaProject", "vbaProject.bin");
    b("/xl/vbaProject.bin", "application/vnd.ms-office.vbaProject");
    zbbs localzbbs = null;
    if ((localVbaProject.a != null) && (localVbaProject.a.size() > 0))
    {
      localzbbs = new zbbs();
      localzbbs.a(localVbaProject.a);
    }
    Object localObject;
    if (localVbaProject.a() != null)
    {
      localObject = new zcz(localVbaProject.a());
      a("xl/vbaProjectSignature.bin", (zp)localObject);
      b("/xl/vbaProjectSignature.bin", "application/vnd.ms-office.vbaProjectSignature");
      if (localzbbs == null) {
        localzbbs = new zbbs();
      }
      localzbbs.a("http://schemas.microsoft.com/office/2006/relationships/vbaProjectSignature", "vbaProjectSignature.bin");
    }
    if (localVbaProject.b != null)
    {
      localObject = new zcz(localVbaProject.b);
      a("xl/vbaProjectSignatureAgile.bin", (zp)localObject);
      b("/xl/vbaProjectSignatureAgile.bin", "application/vnd.ms-office.vbaProjectSignatureAgile");
      if (localzbbs == null) {
        localzbbs = new zbbs();
      }
      localzbbs.a("http://schemas.microsoft.com/office/2014/relationships/vbaProjectSignatureAgile", "vbaProjectSignatureAgile.bin");
    }
    if ((localzbbs != null) && (localzbbs.a() > 0))
    {
      localObject = new zbbr(localzbbs);
      a("xl/_rels/vbaProject.bin.rels", (zp)localObject);
    }
  }
  
  zpb a(boolean paramBoolean, String paramString1, String paramString2)
  {
    zpb localzpb = new zpb();
    if (paramBoolean) {
      localzpb.b = paramString1;
    } else {
      localzpb.c = paramString1;
    }
    localzpb.d = paramString2;
    localzpb.a = paramBoolean;
    zf.a(this.o, localzpb);
    return localzpb;
  }
  
  private void z()
  {
    zbcj localzbcj = this.a.getWorksheets().m;
    if ((localzbcj == null) || (localzbcj.getCount() == 0)) {
      return;
    }
    Object localObject = null;
    if (this.r)
    {
      localzbcj.a(false);
      c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/revisionHeaders", "revisions/revisionHeaders.xml");
      c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/usernames", "revisions/userNames.xml");
      b("/xl/revisions/revisionHeaders.xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.revisionHeaders+xml");
      localObject = new zvi(localzbcj);
      a("xl/revisions/revisionHeaders.xml", (zp)localObject);
      if (localzbcj.n != null)
      {
        b("/xl/revisions/userNames.xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.userNames+xml");
        localObject = new zvj(localzbcj.n);
        a("xl/revisions/userNames.xml", (zp)localObject);
      }
    }
    else
    {
      localzbcj.a(true);
      c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/revisionHeaders", "revisions/revisionHeaders.bin");
      c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/usernames", "revisions/userNames.bin");
      b("/xl/revisions/revisionHeaders.bin", "application/vnd.ms-excel.revisionHeaders");
      localObject = new zchg(localzbcj);
      a("xl/revisions/revisionHeaders.bin", (zp)localObject);
      if (localzbcj.n != null)
      {
        b("/xl/revisions/userNames.bin", "application/vnd.ms-excel.userNames");
        localObject = new zchj(localzbcj);
        a("xl/revisions/userNames.bin", (zp)localObject);
      }
    }
    zbbs localzbbs = new zbbs();
    for (int i1 = 0; i1 < localzbcj.getCount(); i1++)
    {
      zbci localzbci = localzbcj.a(i1);
      String str2 = zauj.z(i1 + 1);
      String str3 = "revisionLog" + str2 + this.p;
      if (this.r)
      {
        b("/xl/revisions/" + str3, "application/vnd.openxmlformats-officedocument.spreadsheetml.revisionLog+xml");
        localObject = new zvk(this, this.D, localzbci);
      }
      else
      {
        b("/xl/revisions/" + str3, "application/vnd.ms-excel.revisionLog");
        localObject = new zchk(this, localzbcj, localzbci);
      }
      a("xl/revisions/" + str3, (zp)localObject);
      String str4 = "rId" + str2;
      localzbci.b.i = str4;
      zrl localzrl = new zrl(str4, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/revisionLog", str3, null);
      localzbbs.a(localzrl);
    }
    if (localzbbs.a() != 0)
    {
      String str1 = this.r ? "xl/revisions/_rels/revisionHeaders.xml.rels" : "xl/revisions/_rels/revisionHeaders.bin.rels";
      localObject = new zbbr(localzbbs);
      a(str1, (zp)localObject);
    }
  }
  
  void a(zpl paramzpl)
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    if ((paramzpl.e != null) && (!"".equals(paramzpl.e)))
    {
      str1 = zk.d(paramzpl.e);
      if (str1.length() > 0) {
        str1 = str1.substring(1);
      }
      switch (T.a(str1))
      {
      case 1: 
      case 2: 
      case 3: 
        str2 = "application/vnd.ms-excel";
        break;
      case 4: 
        str2 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
        break;
      case 5: 
        str2 = "application/vnd.ms-excel.sheet.macroEnabled.12";
        break;
      case 6: 
      case 7: 
        str2 = "application/msword";
        break;
      case 8: 
        str2 = "application/vnd.ms-word.document.macroEnabled.12";
        break;
      case 9: 
        str2 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
        break;
      case 10: 
        str2 = "application/vnd.ms-word.template.macroEnabled.12";
        break;
      case 11: 
        str2 = "application/vnd.openxmlformats-officedocument.wordprocessingml.template";
        break;
      case 12: 
        str2 = "application/vnd.ms-powerpoint";
        break;
      case 13: 
        str2 = "application/vnd.ms-powerpoint.presentation.macroEnabled.12";
        break;
      case 14: 
        str2 = "application/vnd.openxmlformats-officedocument.presentationml.presentation";
        break;
      case 15: 
        str2 = "application/vnd.openxmlformats-officedocument.presentationml.slide";
        break;
      }
    }
    if (str2 != null)
    {
      if (!a(str1)) {
        a(str1, str2);
      }
    }
    else if (!paramzpl.a.isLink()) {
      b("/xl/embeddings/" + paramzpl.e, "application/vnd.openxmlformats-officedocument.oleObject");
    }
  }
  
  private void A()
    throws Exception
  {
    WorksheetCollection localWorksheetCollection = this.a.getWorksheets();
    if ((this.a.f == null) && (this.a.e == null) && (localWorksheetCollection.h() != null) && (localWorksheetCollection.h().a().b("MsoDataStore"))) {
      ContentTypePropertyCollection localContentTypePropertyCollection = this.a.getContentTypeProperties();
    }
    int i1 = 1;
    CustomXmlPartCollection localCustomXmlPartCollection = this.a.f;
    String str;
    if ((localCustomXmlPartCollection != null) && (localCustomXmlPartCollection.getCount() > 0)) {
      for (i1 = 1; i1 <= localCustomXmlPartCollection.getCount(); i1++)
      {
        CustomXmlPart localCustomXmlPart = localCustomXmlPartCollection.get(i1 - 1);
        str = zauj.z(i1);
        if (localCustomXmlPart.a != null) {
          c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXml", "../customXml/item" + str + ".xml");
        }
        if (localCustomXmlPart.b != null) {
          b("/customXml/itemProps" + str + ".xml", "application/vnd.openxmlformats-officedocument.customXmlProperties+xml");
        }
      }
    }
    if ((this.a.e != null) && (this.a.e.getCount() > 0)) {
      for (int i2 = 0; i2 < 3; i2++)
      {
        str = zauj.z(i1 + i2);
        c("http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXml", "../customXml/item" + str + ".xml");
        b("/customXml/itemProps" + str + ".xml", "application/vnd.openxmlformats-officedocument.customXmlProperties+xml");
      }
    }
  }
  
  private void B()
  {
    this.P.b("http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties", "docProps/core.xml", null);
    this.P.b("http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties", "docProps/app.xml", null);
    b("/docProps/app.xml", "application/vnd.openxmlformats-officedocument.extended-properties+xml");
    zus localzus = new zus(this);
    a("docProps/app.xml", localzus);
    b("/docProps/core.xml", "application/vnd.openxmlformats-package.core-properties+xml");
    zut localzut = new zut(this);
    a("docProps/core.xml", localzut);
    if (f())
    {
      this.P.b("http://schemas.openxmlformats.org/officeDocument/2006/relationships/custom-properties", "docProps/custom.xml", null);
      b("/docProps/custom.xml", "application/vnd.openxmlformats-officedocument.custom-properties+xml");
      zuu localzuu = new zuu(this);
      a("docProps/custom.xml", localzuu);
    }
  }
  
  private String C()
  {
    if (this.a.a == null) {
      return null;
    }
    ArrayList localArrayList = this.a.a.b;
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      zpb localzpb = (zpb)localArrayList.get(i1);
      if ((localzpb.b != null) && ("bin".equals(localzpb.b.toLowerCase()))) {
        return localzpb.d;
      }
    }
    return null;
  }
  
  /* Error */
  private void D()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 371	com/aspose/cells/zpt:a	Lcom/aspose/cells/Workbook;
    //   4: getfield 330	com/aspose/cells/Workbook:a	Lcom/aspose/cells/zqw;
    //   7: ifnonnull +4 -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield 371	com/aspose/cells/zpt:a	Lcom/aspose/cells/Workbook;
    //   15: getfield 330	com/aspose/cells/Workbook:a	Lcom/aspose/cells/zqw;
    //   18: getfield 404	com/aspose/cells/zqw:b	Ljava/util/ArrayList;
    //   21: astore_1
    //   22: iconst_0
    //   23: istore_2
    //   24: iload_2
    //   25: aload_1
    //   26: invokevirtual 612	java/util/ArrayList:size	()I
    //   29: if_icmpge +116 -> 145
    //   32: aload_1
    //   33: iload_2
    //   34: invokevirtual 610	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   37: checkcast 280	com/aspose/cells/zpb
    //   40: astore_3
    //   41: aload_3
    //   42: getfield 345	com/aspose/cells/zpb:a	Z
    //   45: ifeq +17 -> 62
    //   48: aload_0
    //   49: aload_3
    //   50: getfield 346	com/aspose/cells/zpb:b	Ljava/lang/String;
    //   53: invokespecial 537	com/aspose/cells/zpt:a	(Ljava/lang/String;)Z
    //   56: ifeq +6 -> 62
    //   59: goto +80 -> 139
    //   62: getstatic 370	com/aspose/cells/zpt:T	Lcom/aspose/cells/b/c/a/za;
    //   65: aload_3
    //   66: getfield 348	com/aspose/cells/zpb:d	Ljava/lang/String;
    //   69: invokevirtual 473	com/aspose/cells/b/c/a/za:a	(Ljava/lang/String;)I
    //   72: tableswitch	default:+58->130, 16:+32->104, 17:+42->114, 18:+42->114, 19:+42->114
    //   104: aload_0
    //   105: getfield 388	com/aspose/cells/zpt:r	Z
    //   108: ifne +22 -> 130
    //   111: goto +28 -> 139
    //   114: aload_0
    //   115: getfield 371	com/aspose/cells/zpt:a	Lcom/aspose/cells/Workbook;
    //   118: invokevirtual 443	com/aspose/cells/Workbook:getSettings	()Lcom/aspose/cells/WorkbookSettings;
    //   121: invokevirtual 447	com/aspose/cells/WorkbookSettings:k	()Z
    //   124: ifne +6 -> 130
    //   127: goto +12 -> 139
    //   130: aload_0
    //   131: getfield 385	com/aspose/cells/zpt:o	Ljava/util/ArrayList;
    //   134: aload_3
    //   135: invokestatic 466	com/aspose/cells/b/a/a/zf:a	(Ljava/util/ArrayList;Ljava/lang/Object;)I
    //   138: pop
    //   139: iinc 2 1
    //   142: goto -118 -> 24
    //   145: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	146	0	this	zpt
    //   21	12	1	localArrayList	ArrayList
    //   23	117	2	i1	int
    //   40	95	3	localzpb	zpb
  }
  
  private void a(boolean paramBoolean)
    throws Exception
  {
    zawd localzawd = new zawd();
    HashMap localHashMap = new HashMap();
    if (paramBoolean)
    {
      localzawd.b(this.a.getWorksheets());
      this.g = localHashMap;
    }
    else
    {
      localzawd.a(this.a.getWorksheets());
      this.f = localHashMap;
    }
    int i1 = localzawd.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      zawc localzawc = localzawd.a(i2);
      if (localzawc.a() != null)
      {
        zp localzp = a(localzawc.a(), localzawc.b());
        localHashMap.put(Integer.valueOf(i2 + 1), zu.b(localzp.a));
      }
    }
  }
  
  zri a(zawp paramzawp)
  {
    if ((this.h != null) && (this.h.size() > 0))
    {
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext())
      {
        zri localzri = (zri)localIterator.next();
        if (localzri.b == paramzawp) {
          return localzri;
        }
      }
    }
    return null;
  }
  
  boolean f()
  {
    return this.a.getWorksheets().getCustomDocumentProperties().getCount() > 0;
  }
  
  private zrl c(String paramString1, String paramString2)
  {
    zrl localzrl = this.e.a(paramString1, paramString2);
    return localzrl;
  }
  
  boolean g()
  {
    if ((this.r) && (this.A.e == 16)) {
      return true;
    }
    return (!this.r) && (this.A.e != 16);
  }
  
  void a(QueryTable paramQueryTable, zbbs paramzbbs)
  {
    Object localObject = null;
    if (this.r) {
      localObject = new zvg(paramQueryTable);
    } else {
      localObject = new zchc(paramQueryTable);
    }
    this.S = a("xl/queryTables/queryTable", this.p, this.S, (zp)localObject);
    b(((zp)localObject).b(), this.r ? "application/vnd.openxmlformats-officedocument.spreadsheetml.queryTable+xml" : "application/vnd.ms-excel.queryTable");
    paramzbbs.a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/queryTable", "../queryTables/" + ((zp)localObject).c());
  }
  
  zp a(byte[] paramArrayOfByte, ImageFormat paramImageFormat)
  {
    String str1 = this.A.getSaveFormat() == 5 ? "drs/media/image" : "xl/media/image";
    zcz localzcz = new zcz(paramArrayOfByte);
    String str2 = zcc.a(paramImageFormat);
    this.H = a(str1, "." + str2, this.H, localzcz);
    a(str2, paramImageFormat);
    return localzcz;
  }
  
  void a(String paramString, zp paramzp)
  {
    this.G.put(paramString, Integer.valueOf(this.i.size()));
    this.i.add(paramzp);
    paramzp.a = paramString;
  }
  
  int a(String paramString1, String paramString2, int paramInt, zp paramzp)
  {
    String str = null;
    for (;;)
    {
      str = paramString1 + paramInt + paramString2;
      if (this.G.get(str) == null) {
        break;
      }
      paramInt++;
    }
    this.G.put(str, Integer.valueOf(this.i.size()));
    this.i.add(paramzp);
    paramzp.a = str;
    return paramInt;
  }
  
  int a(String paramString1, zp paramzp, String paramString2, String paramString3, int paramInt)
  {
    if ((paramString1 == null) || ("".equals(paramString1)) || (this.G.get(paramString1) != null)) {
      return a(paramString2, paramString3, paramInt, paramzp);
    }
    Object localObject = this.G.get(paramString1);
    if (localObject == null)
    {
      this.G.put(paramString1, Integer.valueOf(this.i.size()));
      this.i.add(paramzp);
    }
    else
    {
      this.i.set(((Integer)localObject).intValue(), paramzp);
    }
    paramzp.a = paramString1;
    return paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */