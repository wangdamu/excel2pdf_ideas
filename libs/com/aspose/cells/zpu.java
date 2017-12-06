package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zpu
  implements com.aspose.cells.b.a.zj
{
  Worksheet a;
  Workbook b;
  int c;
  int d;
  zpt e;
  ArrayList f;
  zbbs g;
  String h = null;
  zpp i = new zpp();
  zph j = null;
  zpp k = null;
  ArrayList l = new ArrayList();
  ArrayList m = new ArrayList();
  String n;
  String o;
  ArrayList p = new ArrayList();
  ArrayList q = new ArrayList();
  HashMap r = new HashMap();
  boolean s = false;
  int t = 1;
  String u = null;
  String v = null;
  HashMap w;
  
  public void dispose()
  {
    this.a.getCells().l();
    if (this.s)
    {
      this.a.getCells().k();
      this.a.getCells().getRows().b();
    }
    this.r = null;
    this.p = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.w = null;
    this.q = null;
    this.b = null;
    this.a = null;
    this.j = null;
    this.i = null;
    this.k = null;
    this.m = null;
    this.l = null;
    zg.a(this);
  }
  
  zpu(zpt paramzpt, Worksheet paramWorksheet)
  {
    this.e = paramzpt;
    this.b = paramzpt.a;
    this.a = paramWorksheet;
  }
  
  zpu(zpt paramzpt, Worksheet paramWorksheet, int paramInt1, int paramInt2)
    throws Exception
  {
    this.s = ((paramWorksheet.w() != null) && (paramWorksheet.w().getCount() > 0));
    this.e = paramzpt;
    this.b = paramzpt.a;
    this.a = paramWorksheet;
    boolean bool = ".bin".equals(this.e.p);
    this.c = paramInt1;
    this.d = paramInt2;
    this.g = new zbbs();
    l();
    n();
    g();
    c();
    a(this.a.a);
    a(bool);
    a();
    m();
    i();
    h();
    f();
    b(bool);
    if (this.a.getType() == 1) {
      e();
    }
    j();
    k();
  }
  
  void a(QueryTableCollection paramQueryTableCollection)
  {
    if (this.e.g()) {
      return;
    }
    if ((paramQueryTableCollection != null) && (paramQueryTableCollection.getCount() != 0)) {
      for (int i1 = 0; i1 < paramQueryTableCollection.getCount(); i1++)
      {
        Object localObject = null;
        if (this.e.r) {
          localObject = new zvg(paramQueryTableCollection.get(i1));
        } else {
          localObject = new zchc(paramQueryTableCollection.get(i1));
        }
        this.t = this.e.a("xl/queryTables/queryTable", this.e.p, this.t, (zp)localObject);
        this.e.b(((zp)localObject).b(), this.e.r ? "application/vnd.openxmlformats-officedocument.spreadsheetml.queryTable+xml" : "application/vnd.ms-excel.queryTable");
        zrl localzrl = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/queryTable", "../queryTables/" + ((zp)localObject).c());
      }
    }
  }
  
  void a(boolean paramBoolean)
  {
    String str1 = paramBoolean ? "application/vnd.ms-excel.table" : "application/vnd.openxmlformats-officedocument.spreadsheetml.table+xml";
    ListObjectCollection localListObjectCollection = this.a.d;
    if (localListObjectCollection != null) {
      for (int i1 = 0; i1 < localListObjectCollection.getCount(); i1++)
      {
        ListObject localListObject = localListObjectCollection.get(i1);
        if ((localListObject.d == null) || (localListObject.d.length <= 0))
        {
          String str2 = "/tables/table" + this.e.d() + this.e.p;
          zrl localzrl = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/table", ".." + str2);
          this.e.b("/xl" + str2, str1);
          zrc localzrc = new zrc(localListObject, localzrl);
          zf.a(this.q, localzrc);
          if (this.e.r) {
            this.e.a("xl" + str2, new zvr(this, localListObject, this.e.A));
          } else {
            this.e.a("xl" + str2, new zcih(localListObject));
          }
          zbbs localzbbs = new zbbs();
          if (localListObject.c != null) {
            localzbbs.a(localListObject.c);
          }
          Object localObject;
          if (localListObject.getDataSourceType() == 3)
          {
            localObject = localListObject.getQueryTable();
            if (localObject != null) {
              this.e.a((QueryTable)localObject, localzbbs);
            }
          }
          if (localzbbs.a() > 0)
          {
            localObject = "xl/tables/_rels/" + zu.b(str2) + ".rels";
            this.e.a((String)localObject, new zbbr(localzbbs));
          }
        }
      }
    }
  }
  
  void a()
  {
    if (!this.e.r) {
      return;
    }
    if (this.a.l().getCount() > 0)
    {
      int i1 = this.e.e();
      zvs localzvs = new zvs(this);
      i1 = this.e.a("xl/tables/tableSingleCells", this.e.p, i1, localzvs);
      String str = this.e.r ? "application/vnd.openxmlformats-officedocument.spreadsheetml.tableSingleCells+xml" : "application/vnd.ms-excel.tableSingleCells";
      this.e.b(localzvs.b(), str);
      a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/tableSingleCells", "../tables/" + localzvs.c());
      this.e.a(i1);
    }
  }
  
  void b()
    throws Exception
  {
    if (this.b.a == null) {
      return;
    }
    if (this.a.w() != null) {
      this.b.a.a(this.a.w().a());
    }
    for (int i1 = 0; i1 < this.a.getCharts().getCount(); i1++)
    {
      Chart localChart = this.a.getCharts().get(i1);
      if (localChart.p() != null) {
        this.b.a.a(localChart.p().a());
      }
    }
  }
  
  private void e()
    throws Exception
  {
    if (!this.e.r) {
      return;
    }
    if (this.a.I() == null) {
      return;
    }
    int i1 = this.a.I().getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      CustomProperty localCustomProperty = this.a.getCustomProperties().get(i2);
      zpn localzpn = new zpn();
      localzpn.a = localCustomProperty.getName();
      String str = "customProperty" + this.e.c() + ".bin";
      localzpn.b = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/customProperty", "../" + str).b;
      zf.a(this.p, localzpn);
      this.e.a("xl/" + str, new zcz(Encoding.getUnicode().a(localCustomProperty.getValue())));
      zpb localzpb = new zpb();
      localzpb.d = "application/vnd.openxmlformats-officedocument.spreadsheetml.customProperty";
      localzpb.c = ("/xl/" + str);
      zf.a(this.e.o, localzpb);
    }
  }
  
  private void f()
    throws Exception
  {
    byte[] arrayOfByte = this.a.getBackgroundImage();
    if (arrayOfByte == null) {
      return;
    }
    int i1 = zcc.a(arrayOfByte);
    if (i1 == 6) {
      try
      {
        zh localzh = new zh(arrayOfByte);
        a(com.aspose.cells.b.a.b.zj.a(localzh));
        arrayOfByte = localzh.o();
        i1 = 5;
        localzh.a();
      }
      catch (Exception localException) {}
    }
    zp localzp = this.e.a(arrayOfByte, zcc.b(zcc.a(arrayOfByte)));
    this.n = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "../media/" + localzp.c()).b;
  }
  
  private static byte[] a(com.aspose.cells.b.a.b.zj paramzj)
    throws Exception
  {
    try
    {
      za localza = new za(paramzj);
      zh localzh = new zh();
      localza.a(localzh, ImageFormat.getPng());
      localzh.b(0L);
      int i1 = (int)localzh.h();
      byte[] arrayOfByte = new byte[i1];
      localzh.a(arrayOfByte, 0, i1);
      return arrayOfByte;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private void a(byte[] paramArrayOfByte, zoh paramzoh, boolean paramBoolean)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      String str1 = "/printerSettings/printerSettings" + this.e.w++ + ".bin";
      String str2 = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/printerSettings", ".." + str1).b;
      if (paramzoh != null) {
        paramzoh.b = str2;
      } else {
        this.o = str2;
      }
      this.e.a("xl" + str1, new zcz(paramArrayOfByte));
      if (paramBoolean)
      {
        this.e.a(false, "/xl" + str1, "application/vnd.openxmlformats-officedocument.spreadsheetml.printerSettings");
      }
      else
      {
        if (this.e.E == null)
        {
          zpb localzpb = this.e.a(true, "bin", "application/vnd.openxmlformats-officedocument.spreadsheetml.printerSettings");
          this.e.E = localzpb.d;
        }
        if (!"application/vnd.openxmlformats-officedocument.spreadsheetml.printerSettings".equals(this.e.E)) {
          this.e.a(false, "/xl" + str1, "application/vnd.openxmlformats-officedocument.spreadsheetml.printerSettings");
        }
      }
    }
  }
  
  private void b(boolean paramBoolean)
  {
    byte[] arrayOfByte = this.a.getType() == 2 ? this.a.getCharts().get(0).getPageSetup().getPrinterSettings() : this.a.getPageSetup().getPrinterSettings();
    a(arrayOfByte, null, paramBoolean);
    if ((this.a.s != null) && (this.a.s.getCount() != 0)) {
      for (int i1 = 0; i1 < this.a.s.getCount(); i1++)
      {
        arrayOfByte = this.a.s.a(i1).e().getPrinterSettings();
        a(arrayOfByte, this.a.s.a(i1), paramBoolean);
      }
    }
  }
  
  private void g()
  {
    if (d())
    {
      String str = "comments" + zauj.z(this.c) + this.e.p;
      a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/comments", "../" + str);
      this.e.b("/xl/" + str, this.e.r ? "application/vnd.openxmlformats-officedocument.spreadsheetml.comments+xml" : "application/vnd.ms-excel.comments");
      Object localObject = null;
      if (this.e.r) {
        localObject = new zuo(this);
      } else {
        localObject = new zcfe(this);
      }
      this.e.a("xl/" + str, (zp)localObject);
    }
  }
  
  private void h()
  {
    if ((this.e.g == null) || (this.e.g.size() == 0)) {
      return;
    }
    this.i = new zpp();
    ShapeCollection localShapeCollection = this.a.getPageSetup().j();
    if ((localShapeCollection == null) || (localShapeCollection.getCount() == 0)) {
      return;
    }
    Iterator localIterator = localShapeCollection.iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      Picture localPicture = (Picture)localShape;
      if ((this.e.g.containsKey(Integer.valueOf(localPicture.b()))) && (!this.i.b.containsKey(Integer.valueOf(localPicture.b()))))
      {
        String str1 = "../media/" + (String)this.e.g.get(Integer.valueOf(localPicture.b()));
        String str2 = this.i.a.b("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", str1, null).b;
        this.i.b.put(Integer.valueOf(localPicture.b()), str2);
      }
    }
    if (this.i.a.a() == 0) {
      this.i = null;
    } else {
      this.u = a(this.i, true);
    }
  }
  
  private String a(zpp paramzpp, boolean paramBoolean)
  {
    String str1 = "vmlDrawing" + zauj.z(this.e.a()) + ".vml";
    String str2 = "xl/drawings/" + str1;
    Object localObject = null;
    if (paramBoolean) {
      localObject = new zuz(this);
    } else {
      localObject = new zvu(this);
    }
    this.e.a(str2, (zp)localObject);
    String str3 = "xl/drawings/_rels/" + str1 + ".rels";
    zbbr localzbbr = new zbbr(paramzpp.a);
    this.e.a(str3, localzbbr);
    if (!this.e.F)
    {
      this.e.a("vml", "application/vnd.openxmlformats-officedocument.vmlDrawing");
      this.e.F = true;
    }
    str2 = "../drawings/" + str1;
    return a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/vmlDrawing", str2).b;
  }
  
  private void i()
    throws Exception
  {
    this.k = new zpp(this);
    if (!this.k.a()) {
      this.k = null;
    } else {
      this.v = a(this.k, false);
    }
  }
  
  void c()
    throws Exception
  {
    ShapeCollection localShapeCollection = this.a.w();
    if ((localShapeCollection == null) || (localShapeCollection.getCount() <= 0)) {
      return;
    }
    for (int i1 = 0; i1 < localShapeCollection.getCount(); i1++)
    {
      Shape localShape = localShapeCollection.get(i1);
      zqn localzqn = localShape.z;
      if (localzqn != null)
      {
        int i2 = 0;
        Object localObject1 = this.m.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          zpf localzpf = (zpf)((Iterator)localObject1).next();
          if (localzpf.a == localzqn)
          {
            i2 = 1;
            break;
          }
        }
        localObject1 = new zpf(localzqn, localShape);
        Object localObject2;
        Object localObject3;
        if (localzqn.a())
        {
          if ((i2 == 0) && (this.e.r))
          {
            int i3 = this.e.y;
            localObject2 = "/ctrProps/ctrProp" + i3 + ".xml";
            this.e.a(false, "/xl" + (String)localObject2, "application/vnd.ms-excel.controlproperties+xml");
            String str1 = ".." + (String)localObject2;
            ((zpf)localObject1).c = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/ctrlProp", str1).b;
            this.e.y += 1;
            this.m.add(localObject1);
            localObject3 = new zog((zpf)localObject1);
            this.e.a("xl" + (String)localObject2, (zp)localObject3);
          }
        }
        else
        {
          if (localShape.getMsoDrawingType() == 8)
          {
            Picture localPicture = (Picture)localShape;
            localObject2 = "../media/" + (String)this.e.f.get(Integer.valueOf(localPicture.b()));
            ((zpf)localObject1).d = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", (String)localObject2, null);
          }
          if (i2 == 0)
          {
            if (localzqn.l == null) {
              zah.a(localzqn, localShape, this.e.a);
            }
            if (localzqn.l != null)
            {
              int i4 = 1;
              localObject2 = null;
              int i5 = 0;
              this.m.add(localObject1);
              if (localzqn.l.getType() == 11)
              {
                localObject3 = (UnknownControl)localzqn.l;
                i4 = ((UnknownControl)localObject3).g == 3 ? 1 : 0;
                localObject2 = ((UnknownControl)localObject3).h;
                if (((UnknownControl)localObject3).h != null) {
                  i5 = ((UnknownControl)localObject3).h.size();
                }
              }
              if (i4 != 0) {
                i5 = 1;
              }
              ((zpf)localObject1).e = this.e.x;
              this.e.a(false, "/xl/activeX/activeX" + ((zpf)localObject1).e + ".xml", "application/vnd.ms-office.activeX+xml");
              localObject3 = "../activeX/activeX" + ((zpf)localObject1).e + ".xml";
              ((zpf)localObject1).c = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/control", (String)localObject3).b;
              if (i5 > 0)
              {
                if (this.e.E == null)
                {
                  zpb localzpb = this.e.a(true, "bin", "application/vnd.ms-office.activeX");
                  this.e.E = localzpb.d;
                }
                if (!"application/vnd.ms-office.activeX".equals(this.e.E)) {
                  for (int i6 = 0; i6 < i5; i6++)
                  {
                    localObject3 = "/xl/activeX/activeX" + (((zpf)localObject1).e + i6) + ".bin";
                    this.e.a(false, (String)localObject3, "application/vnd.ms-office.activeX");
                  }
                }
              }
              this.e.x += (i5 == 0 ? 1 : i5);
              byte[] arrayOfByte = localzqn.l.getData();
              if (arrayOfByte != null)
              {
                String str2;
                zbbs localzbbs;
                Object localObject4;
                if (i4 != 0)
                {
                  str2 = "xl/activeX/activeX" + ((zpf)localObject1).e + ".bin";
                  this.e.a(str2, new zcz(arrayOfByte));
                  str2 = "xl/activeX/activeX" + ((zpf)localObject1).e + ".xml";
                  this.e.a(str2, new zak(arrayOfByte));
                  String str3 = "xl/activeX/_rels/activeX" + ((zpf)localObject1).e + ".xml.rels";
                  localzbbs = new zbbs();
                  localObject4 = new zrl("rId1", "http://schemas.microsoft.com/office/2006/relationships/activeXControlBinary", "activeX" + ((zpf)localObject1).e + ".bin", null);
                  localzbbs.a((zrl)localObject4);
                  this.e.a(str3, new zbbr(localzbbs));
                }
                else
                {
                  str2 = "xl/activeX/activeX" + ((zpf)localObject1).e + ".xml";
                  this.e.a(str2, new zcz(arrayOfByte));
                  if (localObject2 != null)
                  {
                    int i7 = 0;
                    localzbbs = new zbbs();
                    localObject4 = ((HashMap)localObject2).keySet().iterator();
                    while (((Iterator)localObject4).hasNext())
                    {
                      String str4 = (String)((Iterator)localObject4).next();
                      int i8 = ((zpf)localObject1).e + i7;
                      str2 = "xl/activeX/activeX" + i8 + ".bin";
                      arrayOfByte = (byte[])((HashMap)localObject2).get(str4);
                      this.e.a(str2, new zcz(arrayOfByte));
                      zrl localzrl = new zrl(str4, "http://schemas.microsoft.com/office/2006/relationships/activeXControlBinary", "activeX" + i8 + ".bin", null);
                      localzbbs.a(localzrl);
                      i7++;
                    }
                    localObject4 = "xl/activeX/_rels/activeX" + ((zpf)localObject1).e + ".xml.rels";
                    this.e.a((String)localObject4, new zbbr(localzbbs));
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void j()
  {
    if ((this.a.b == null) || (this.a.b.getCount() == 0)) {
      return;
    }
    int i1 = this.e.j;
    for (int i2 = 0; i2 < this.a.b.getCount(); i2++)
    {
      PivotTable localPivotTable = this.a.b.get(i2);
      zri localzri = this.e.a(localPivotTable.d);
      if (localzri != null)
      {
        String str1 = "xl/pivotTables/pivotTable";
        Object localObject = null;
        if (this.e.r) {
          localObject = new zvf(localPivotTable, zauj.z(localPivotTable.d.b));
        } else {
          localObject = new zcgy(localPivotTable, localPivotTable.d.b);
        }
        i1 = this.e.a(str1, this.e.p, i1, (zp)localObject);
        String str2 = ((zp)localObject).c();
        String str3 = "../pivotCache/" + zu.b(localzri.a);
        zbbs localzbbs = zbbs.a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheDefinition", str3, null);
        this.e.a("xl/pivotTables/_rels/" + str2 + ".rels", new zbbr(localzbbs));
        str3 = "../pivotTables/" + str2;
        a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotTable", str3);
        this.e.b(((zp)localObject).b(), this.e.r ? "application/vnd.openxmlformats-officedocument.spreadsheetml.pivotTable+xml" : "application/vnd.ms-excel.pivotTable");
      }
    }
    this.e.j = i1;
  }
  
  private void k()
  {
    if (!this.e.r) {
      return;
    }
    if (0 == this.a.x().getCount()) {
      return;
    }
    this.w = new HashMap();
    int i1 = this.e.k;
    Iterator localIterator = this.a.x().iterator();
    while (localIterator.hasNext())
    {
      zbpo localzbpo = (zbpo)localIterator.next();
      if (this.w.get(localzbpo.a) == null)
      {
        String str = "xl/slicers/slicer";
        zvo localzvo = new zvo(this.a.x(), localzbpo.a);
        i1 = this.e.a(str, this.e.p, i1, localzvo);
        zrl localzrl = a("http://schemas.microsoft.com/office/2007/relationships/slicer", "../slicers/" + localzvo.c());
        this.w.put(localzbpo.a, localzrl);
        this.e.b(localzvo.b(), "application/vnd.ms-excel.slicer+xml");
      }
    }
    this.e.k = i1;
  }
  
  private void l()
  {
    if (this.a.k == null) {
      return;
    }
    ArrayList localArrayList = this.a.k.d;
    this.g.a(localArrayList);
  }
  
  private void m()
    throws Exception
  {
    this.j = new zph(this);
    if (this.j.b != null) {
      this.j.a = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/drawing", "../drawings/" + this.j.b).b;
    }
  }
  
  boolean d()
  {
    return (this.a.getComments() != null) && (this.a.getComments().getCount() > 0);
  }
  
  private void n()
  {
    if ((this.a.getHyperlinks() == null) || (this.a.getHyperlinks().getCount() < 1)) {
      return;
    }
    int i1 = this.a.getHyperlinks().getCount();
    this.f = new ArrayList(i1);
    for (int i2 = 0; i2 < i1; i2++)
    {
      Hyperlink localHyperlink = this.a.getHyperlinks().get(i2);
      zpk localzpk = new zpk();
      localzpk.b = localHyperlink;
      localzpk.c = localHyperlink.getAddress();
      localzpk.d = localHyperlink.a(this.b.getWorksheets());
      if ((localzpk.d == 0) || (localzpk.d == 1))
      {
        String str1 = zbxt.b(localHyperlink.getAddress());
        if ((localzpk.d == 1) && (!str1.startsWith("file:///")) && ((str1.indexOf(":") != -1) || (str1.startsWith("\\\\")))) {
          str1 = "file:///" + str1;
        }
        localzpk.a = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", str1, "External");
      }
      else if (localzpk.d == 2)
      {
        int i3 = zaap.b(localzpk.c, '#');
        if (i3 != -1)
        {
          String str2 = localzpk.c.substring(0, 0 + i3);
          localzpk.a = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", str2, "External");
          localzpk.c = localzpk.c.substring(i3 + 1);
        }
      }
      zf.a(this.f, localzpk);
    }
  }
  
  zrl a(String paramString1, String paramString2)
  {
    zrl localzrl = this.g.a(paramString1, paramString2);
    return localzrl;
  }
  
  private String a(String paramString1, String paramString2, String paramString3)
  {
    return this.g.b(paramString1, paramString2, paramString3).b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */