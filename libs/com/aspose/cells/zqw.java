package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class zqw
  implements zj
{
  zqr a = null;
  ArrayList b = new ArrayList();
  boolean c = false;
  boolean d = false;
  String e = null;
  ArrayList f = new ArrayList();
  zql g = null;
  ArrayList h = new ArrayList();
  ArrayList i = new ArrayList();
  zqk j = new zqk();
  String k;
  
  public void dispose()
  {
    this.a = null;
    this.g = null;
    this.k = null;
    this.b = null;
    this.i = null;
    this.h = null;
    this.f = null;
    this.j = null;
    this.e = null;
    zg.a(this);
  }
  
  void a(zqw paramzqw)
  {
    this.a = paramzqw.a;
    this.g = paramzqw.g;
    this.k = paramzqw.k;
    if (paramzqw.b != null) {
      this.b = ((ArrayList)paramzqw.b.clone());
    }
    if (paramzqw.i != null) {
      this.i = ((ArrayList)paramzqw.i.clone());
    }
    if (paramzqw.h != null) {
      this.h = ((ArrayList)paramzqw.h.clone());
    }
    if (paramzqw.f != null) {
      this.f = ((ArrayList)paramzqw.f.clone());
    }
    if (paramzqw.j != null)
    {
      this.j = new zqk();
      this.j.a(paramzqw.j);
    }
    this.e = paramzqw.e;
    this.c = paramzqw.c;
    this.d = paramzqw.d;
  }
  
  void a(Workbook paramWorkbook)
    throws Exception
  {
    for (int m = 0; m < this.f.size(); m++)
    {
      String str = (String)this.f.get(m);
      if ((!b(str)) && (!a(str, paramWorkbook))) {
        a(str);
      }
    }
  }
  
  private boolean b(String paramString)
    throws Exception
  {
    paramString = zk.b(paramString);
    for (int m = 0; m < this.i.size(); m++)
    {
      zqo localzqo = (zqo)this.i.get(m);
      for (int n = 0; n < localzqo.d.size(); n++)
      {
        zrl localzrl = (zrl)localzqo.d.get(n);
        String str = zk.b(localzrl.d);
        if (zw.b(paramString, str)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private boolean a(ShapeCollection paramShapeCollection, String paramString)
    throws Exception
  {
    if (paramShapeCollection != null)
    {
      ArrayList localArrayList = paramShapeCollection.a();
      if (localArrayList != null) {
        for (int m = 0; m < localArrayList.size(); m++)
        {
          zrl localzrl = (zrl)localArrayList.get(m);
          String str = zk.b(localzrl.d);
          if (zw.b(paramString, str)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private boolean a(String paramString, Workbook paramWorkbook)
    throws Exception
  {
    paramString = zk.b(paramString);
    WorksheetCollection localWorksheetCollection = paramWorkbook.getWorksheets();
    Iterator localIterator = localWorksheetCollection.iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      if (a(localWorksheet.w(), paramString)) {
        return true;
      }
      if (localWorksheet.getCharts() != null) {
        for (int m = 0; m < localWorksheet.getCharts().getCount(); m++)
        {
          Chart localChart = localWorksheet.getCharts().get(0);
          if (a(localChart.p(), paramString)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  void a(String paramString)
    throws Exception
  {
    Object localObject = null;
    for (int m = 0; m < this.i.size(); m++)
    {
      zqo localzqo = (zqo)this.i.get(m);
      if ((zw.b(localzqo.b, paramString)) || (zw.b(zk.b(localzqo.b), paramString)))
      {
        localObject = localzqo;
        break;
      }
    }
    if (localObject != null) {
      this.i.remove(localObject);
    }
  }
  
  void a(Collection paramCollection)
    throws Exception
  {
    if (paramCollection == null) {
      return;
    }
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      String str1 = zk.b(localzrl.d);
      String str2 = zauj.an(localzrl.d);
      ArrayList localArrayList = this.i;
      for (int m = 0; m < localArrayList.size(); m++)
      {
        zqo localzqo = (zqo)localArrayList.get(m);
        String str3 = zk.b(localzqo.b);
        String str4 = zauj.an(localzqo.b);
        if ((zw.b(str1, str3)) && (zw.b(str2, str4)))
        {
          String str5 = zk.b(localzqo.c);
          localzrl.d = zauj.a(localzrl.d, str5);
        }
      }
    }
  }
  
  void b(Workbook paramWorkbook)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject;
    for (int m = 0; m < this.b.size(); m++)
    {
      localObject = (zpb)this.b.get(m);
      if (("application/vnd.openxmlformats-package.digital-signature-origin".equals(((zpb)localObject).d)) || ("application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml".equals(((zpb)localObject).d))) {
        zf.a(localArrayList, localObject);
      }
    }
    Iterator localIterator1 = localArrayList.iterator();
    while (localIterator1.hasNext())
    {
      localObject = localIterator1.next();
      this.b.remove(localObject);
    }
    localArrayList.clear();
    for (int n = 0; n < this.h.size(); n++)
    {
      localObject = (zrl)this.h.get(n);
      if ("http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin".equals(((zrl)localObject).c)) {
        zf.a(localArrayList, localObject);
      }
    }
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
    {
      localObject = localIterator2.next();
      this.h.remove(localObject);
    }
    paramWorkbook.getSettings().h = false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */