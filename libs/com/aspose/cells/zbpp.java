package com.aspose.cells;

import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zbpp
{
  String a = "{BBE1A952-AA13-448e-AADC-164F8A28A991}";
  String b = null;
  zbpr c;
  zbpv d;
  String e;
  String f;
  String g;
  int h;
  long i;
  int j;
  boolean k;
  int l;
  boolean m;
  zbpt n;
  String o;
  String p;
  zbpq q;
  
  zbpp(zbpq paramzbpq)
  {
    this.q = paramzbpq;
    this.j = 0;
    this.k = true;
    this.l = 1;
    this.m = true;
  }
  
  WorksheetCollection a()
  {
    return this.q.a();
  }
  
  boolean b()
  {
    return this.h == 0;
  }
  
  boolean c()
  {
    return this.h == 1;
  }
  
  zbpr d()
  {
    if (null == this.c) {
      this.c = new zbpr();
    }
    return this.c;
  }
  
  public zbpt e()
  {
    if (null == this.n) {
      this.n = new zbpt(this);
    }
    return this.n;
  }
  
  public String f()
  {
    return this.e;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public String g()
  {
    return this.f;
  }
  
  void h()
  {
    ArrayList localArrayList = e().a();
    PivotItemCollection localPivotItemCollection = i();
    if ((localArrayList == null) || (localPivotItemCollection == null))
    {
      this.q.b(this);
      return;
    }
    localArrayList = a(localArrayList);
    zbos localzbos = null;
    PivotItem localPivotItem = null;
    this.n = new zbpt(this);
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      localzbos = (zbos)localArrayList.get(i1);
      zbps localzbps = new zbps(e());
      localzbps.c = localzbos.c;
      localPivotItem = localPivotItemCollection.get(zbqb.a(localzbos.a));
      if (localPivotItem != null)
      {
        localzbps.a = localPivotItem.getIndex();
        localzbps.b = (!localPivotItem.isHidden());
      }
      this.n.a(localzbps);
    }
  }
  
  private ArrayList a(ArrayList paramArrayList)
  {
    if (paramArrayList == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    zbos localzbos = null;
    boolean bool = this.j == 0;
    zd localzd = new zd(new zbqi(bool, localHashMap));
    int i1 = -1;
    for (int i2 = 0; i2 < paramArrayList.size(); i2++)
    {
      localzbos = (zbos)paramArrayList.get(i2);
      if (localzbos.a != null) {
        localzd.a(localzbos.a, Integer.valueOf(i2));
      } else {
        i1 = i2;
      }
    }
    ArrayList localArrayList = new ArrayList();
    if ((!bool) && (i1 >= 0)) {
      zf.a(localArrayList, paramArrayList.get(i1));
    }
    Iterator localIterator = localzd.f().iterator();
    while (localIterator.hasNext()) {
      zf.a(localArrayList, paramArrayList.get(((Integer)localIterator.next()).intValue()));
    }
    if ((bool) && (i1 >= 0)) {
      zf.a(localArrayList, paramArrayList.get(i1));
    }
    return localArrayList;
  }
  
  PivotItemCollection i()
  {
    int i1 = j().getCount();
    if (i1 == 0) {
      return null;
    }
    zbpu localzbpu = null;
    Worksheet localWorksheet = null;
    PivotTable localPivotTable = null;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localzbpu = j().a(i2);
      localWorksheet = j().a.a().a(localzbpu.a());
      if (localWorksheet != null)
      {
        localPivotTable = localWorksheet.getPivotTables().get(localzbpu.b());
        if (localPivotTable != null)
        {
          PivotField localPivotField = localPivotTable.getBaseFields().get(g());
          if (localPivotField != null) {
            return localPivotField.getPivotItems();
          }
        }
      }
    }
    return null;
  }
  
  public zbpv j()
  {
    if (null == this.d) {
      this.d = new zbpv(this);
    }
    return this.d;
  }
  
  void k()
  {
    if (d().getCount() == 0) {
      return;
    }
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      for (int i1 = 0; i1 < this.c.getCount(); i1++)
      {
        localWorksheet.x().b(this.c.a(i1));
        this.c.b(this.c.a(i1));
        i1--;
      }
    }
    this.c.clear();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */