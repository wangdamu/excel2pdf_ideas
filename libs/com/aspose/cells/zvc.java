package com.aspose.cells;

import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zvc
{
  private zi a;
  private zf b;
  private HashMap c;
  private HashMap d;
  private ArrayList e;
  private String f = ".xml";
  private HashMap g;
  private zj h;
  private static final za i = new za(new String[] { "Override", "Default" });
  
  zvc(zf paramzf)
    throws Exception
  {
    this.b = paramzf;
    this.b.b();
    this.h = paramzf.c;
    if (!this.b.d.r) {
      this.f = ".bin";
    }
    this.a = paramzf.f;
    this.c = new HashMap();
    this.d = new HashMap();
    this.e = new ArrayList();
    this.g = new HashMap();
  }
  
  void a()
    throws Exception
  {
    g();
    k();
    i();
    this.b.c.f_();
  }
  
  private void g()
    throws Exception
  {
    this.c.put("[Content_Types].xml", znq.g);
    this.c.put("_rels/.rels", znq.g);
    h();
    j();
    a("_rels/.rels");
  }
  
  private void h()
  {
    this.d.put("application/vnd.openxmlformats-officedocument.extended-properties+xml", znq.g);
    this.d.put("application/vnd.openxmlformats-package.core-properties+xml", znq.g);
    this.d.put("application/vnd.openxmlformats-officedocument.custom-properties+xml", znq.g);
    this.d.put("http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties", znq.g);
    this.d.put("http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties", znq.g);
    this.d.put("http://schemas.openxmlformats.org/officeDocument/2006/relationships/custom-properties", znq.g);
  }
  
  private void i()
    throws Exception
  {
    c();
    this.b.d.o = this.e;
    b();
    String str = "_rels/.rels";
    zcjz localzcjz = zauy.a(str, this.b.c, true);
    ArrayList localArrayList = new ArrayList();
    com.aspose.cells.b.a.a.zf.a(localArrayList, this.g.values());
    zvh.a(localzcjz, localArrayList);
    localzcjz.e();
  }
  
  void b()
    throws Exception
  {
    zcjz localzcjz = zauy.a("[Content_Types].xml", this.h, true);
    zuq localzuq = new zuq(this.b.d);
    localzuq.a(localzcjz);
    localzcjz.e();
  }
  
  void c()
    throws Exception
  {
    int j = 1;
    f();
    e();
    j = a(this.g, j, "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties", "docProps/core.xml", null);
    j = a(this.g, j, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties", "docProps/app.xml", null);
    a(false, "/docProps/core.xml", "application/vnd.openxmlformats-package.core-properties+xml", null);
    a(false, "/docProps/app.xml", "application/vnd.openxmlformats-officedocument.extended-properties+xml", null);
    if (this.b.d.f())
    {
      a(false, "/docProps/custom.xml", "application/vnd.openxmlformats-officedocument.custom-properties+xml", null);
      j = a(this.g, j, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/custom-properties", "docProps/custom.xml", null);
      d();
    }
  }
  
  void d()
    throws Exception
  {
    String str = "docProps/custom.xml";
    zcjz localzcjz = zauy.a(str, this.h, true);
    zuu localzuu = new zuu(this.b.d);
    localzuu.a(localzcjz);
    localzcjz.e();
  }
  
  void e()
    throws Exception
  {
    String str = "docProps/app.xml";
    zcjz localzcjz = zauy.a(str, this.h, true);
    zus localzus = new zus(this.b.d);
    localzus.a(localzcjz);
    localzcjz.e();
  }
  
  void f()
    throws Exception
  {
    String str = "docProps/core.xml";
    zcjz localzcjz = zauy.a(str, this.h, false);
    zut localzut = new zut(this.b.d);
    localzut.a(localzcjz);
    localzcjz.e();
  }
  
  private void a(String paramString)
    throws Exception
  {
    if (this.a.a(paramString, true) == -1) {
      return;
    }
    zcjy localzcjy = zauy.a(this.a, paramString, true);
    HashMap localHashMap = zalb.b(localzcjy);
    localzcjy.c();
    Iterator localIterator = localHashMap.values().iterator();
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      if (this.d.get(localzrl.c) == null) {
        this.g.put(localzrl.b, localzrl);
      }
    }
  }
  
  private void j()
    throws Exception
  {
    String str1 = "[Content_Types].xml";
    zcjy localzcjy = zauy.a(this.a, str1, true);
    if (localzcjy.o()) {
      return;
    }
    localzcjy.k();
    localzcjy.d();
    while (zauz.a(localzcjy))
    {
      boolean bool = false;
      String str2 = null;
      String str3 = null;
      String str4 = null;
      switch (i.a(localzcjy.q()))
      {
      case 0: 
        str2 = localzcjy.a("PartName");
        str3 = localzcjy.a("ContentType");
        break;
      case 1: 
        str4 = localzcjy.a("Extension").toLowerCase();
        str3 = localzcjy.a("ContentType");
        bool = true;
        break;
      }
      if (str3 != null) {
        if (this.d.get(str3) == null) {
          a(bool, str2, str3, str4);
        } else if (str2 != null) {
          this.c.put(str2.substring(1), znq.g);
        }
      }
      localzcjy.a();
    }
  }
  
  private void a(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    zpb localzpb = new zpb();
    localzpb.a = paramBoolean;
    localzpb.c = paramString1;
    localzpb.b = paramString3;
    localzpb.d = paramString2;
    com.aspose.cells.b.a.a.zf.a(this.e, localzpb);
  }
  
  private static int a(HashMap paramHashMap, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    int j = paramInt;
    String str = null;
    for (;;)
    {
      str = "rId" + j;
      if (paramHashMap.get(str) == null) {
        break;
      }
      j++;
    }
    zrl localzrl = new zrl(str, paramString1, paramString2, paramString3);
    paramHashMap.put(str, localzrl);
    return j;
  }
  
  private void k()
    throws Exception
  {
    if (this.a == null) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      zh localzh = (zh)localIterator.next();
      if (this.c.get(localzh.b()) == null) {
        zvw.a(this.a, localzh, this.b.c, localzh.b());
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */