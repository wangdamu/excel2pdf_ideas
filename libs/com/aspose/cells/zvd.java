package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Iterator;

class zvd
  extends ztp
{
  private zawp b;
  private zri c;
  private static final com.aspose.cells.b.c.a.za d = new com.aspose.cells.b.c.a.za(new String[] { "#DIV/0!", "#N/A", "#NAME?", "#NULL!", "#NUM!", "#REF!", "#VALUE!" });
  
  zvd(zri paramzri)
  {
    this.c = paramzri;
    this.b = paramzri.b;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    this.b.e.a.p().i();
    paramzcjz.a = true;
    paramzcjz.b(true);
    paramzcjz.b("pivotCacheDefinition");
    paramzcjz.a("xmlns", zaty.a);
    h(paramzcjz);
    e(paramzcjz);
    d(paramzcjz);
    c(paramzcjz);
    if (d()) {
      b(paramzcjz);
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private boolean d()
  {
    return this.b.c != -1;
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("extLst");
    if (this.b.c != -1)
    {
      paramzcjz.b("ext");
      paramzcjz.a("uri", "{725AE2AE-9491-48be-B2B4-4EB974FC3084}");
      paramzcjz.a("xmlns:x14", "http://schemas.microsoft.com/office/spreadsheetml/2009/9/main");
      paramzcjz.b("x14:pivotCacheDefinition");
      paramzcjz.a("pivotCacheId", zauj.z(this.b.c));
      paramzcjz.b();
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    if (this.b.m == null) {
      return;
    }
    int i = this.b.m.getCount();
    if (i == 0) {
      return;
    }
    paramzcjz.b("calculatedItems");
    paramzcjz.a("count", zauj.z(i));
    zawz localzawz = this.b.m;
    for (int j = 0; j < localzawz.getCount(); j++)
    {
      zaxa localzaxa = localzawz.a(j);
      a(paramzcjz, localzaxa);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zaxa paramzaxa)
    throws Exception
  {
    zbur localzbur = paramzaxa.g;
    ArrayList localArrayList = localzbur.e;
    int i = localArrayList.size();
    if (i == 0) {
      return;
    }
    paramzcjz.b("calculatedItem");
    String str = paramzaxa.b();
    if ((str != null) && (str.startsWith("="))) {
      str = str.substring(1);
    }
    if (str != null) {
      paramzcjz.a("formula", str);
    }
    paramzcjz.b("pivotArea");
    paramzcjz.a("cacheIndex", zauj.z(localzbur.e() ? 1 : 0));
    paramzcjz.a("outline", zauj.z(localzbur.h() ? 1 : 0));
    paramzcjz.a("fieldPosition", zauj.a(localzbur.a));
    paramzcjz.b("references");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      zbtz localzbtz = (zbtz)localArrayList.get(j);
      a(paramzcjz, localzbtz);
    }
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbtz paramzbtz)
    throws Exception
  {
    ArrayList localArrayList = paramzbtz.c;
    int i = localArrayList.size();
    if (i == 0) {
      return;
    }
    paramzcjz.b("reference");
    paramzcjz.a("field", zauj.z(paramzbtz.b() & 0xFFFF));
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      paramzcjz.b("x");
      paramzcjz.a("v", zauj.z(((Integer)paramzbtz.c.get(j)).intValue()));
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("cacheFields");
    if (this.b.i != null)
    {
      paramzcjz.a("count", zauj.z(this.b.i.size()));
      ArrayList localArrayList = this.b.i;
      for (int i = 0; i < localArrayList.size(); i++)
      {
        zbtv localzbtv = (zbtv)localArrayList.get(i);
        a(paramzcjz, localzbtv);
      }
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Object paramObject)
    throws Exception
  {
    if (paramObject == null) {
      return;
    }
    zbos localzbos = (zbos)paramObject;
    Object localObject = localzbos.a;
    boolean bool1 = localzbos.b;
    boolean bool2 = localzbos.c;
    if (localObject == null) {
      paramzcjz.b("m", null);
    }
    String str1;
    if ((localObject instanceof String))
    {
      str1 = (String)localObject;
      String str2 = zauj.a(str1);
      switch (d.a(str2))
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
        paramzcjz.b("e");
        paramzcjz.a("v", str2);
        if (bool1) {
          paramzcjz.a("f", "1");
        }
        if (bool2) {
          paramzcjz.a("u", "1");
        }
        paramzcjz.b();
        break;
      default: 
        paramzcjz.b("s");
        paramzcjz.a("v", str2);
        if (bool1) {
          paramzcjz.a("f", "1");
        }
        if (bool2) {
          paramzcjz.a("u", "1");
        }
        paramzcjz.b();
      }
    }
    else if ((localObject instanceof Double))
    {
      str1 = null;
      if (localzbos.d != null) {
        str1 = localzbos.d;
      } else {
        str1 = zauj.b(((Double)localObject).doubleValue());
      }
      paramzcjz.b("n");
      paramzcjz.a("v", str1);
      if (bool1) {
        paramzcjz.a("f", "1");
      }
      if (bool2) {
        paramzcjz.a("u", "1");
      }
      paramzcjz.b();
    }
    else if ((localObject instanceof Integer))
    {
      str1 = zauj.z(((Integer)localObject).intValue());
      paramzcjz.b("n");
      paramzcjz.a("v", str1);
      if (bool1) {
        paramzcjz.a("f", "1");
      }
      if (bool2) {
        paramzcjz.a("u", "1");
      }
      paramzcjz.b();
    }
    else if ((localObject instanceof Long))
    {
      str1 = zauj.a(((Long)localObject).longValue());
      paramzcjz.b("n");
      paramzcjz.a("v", str1);
      if (bool1) {
        paramzcjz.a("f", "1");
      }
      if (bool2) {
        paramzcjz.a("u", "1");
      }
      paramzcjz.b();
    }
    else if ((localObject instanceof DateTime))
    {
      str1 = ((DateTime)localObject).a("yyyy-MM-dd\\THH:mm:ss.fff", com.aspose.cells.b.a.c.za.b());
      paramzcjz.b("d");
      paramzcjz.a("v", str1);
      if (bool1) {
        paramzcjz.a("f", "1");
      }
      if (bool2) {
        paramzcjz.a("u", "1");
      }
      paramzcjz.b();
    }
    else if ((localObject instanceof Boolean))
    {
      str1 = ((Boolean)localObject).booleanValue() ? "1" : "0";
      paramzcjz.b("b");
      paramzcjz.a("v", str1);
      if (bool1) {
        paramzcjz.a("f", "1");
      }
      if (bool2) {
        paramzcjz.a("u", "1");
      }
      paramzcjz.b();
    }
  }
  
  private void b(zcjz paramzcjz, Object paramObject)
    throws Exception
  {
    if (paramObject == null) {
      return;
    }
    zbos localzbos = (zbos)paramObject;
    Object localObject = localzbos.a;
    boolean bool1 = localzbos.b;
    boolean bool2 = localzbos.c;
    if (localObject == null) {
      paramzcjz.b("m", null);
    }
    if ((localObject instanceof String))
    {
      paramzcjz.b("s");
      paramzcjz.a("v", (String)localObject);
      if (bool1) {
        paramzcjz.a("f", "1");
      }
      if (bool2) {
        paramzcjz.a("u", "1");
      }
      paramzcjz.b();
    }
    else
    {
      String str;
      if ((localObject instanceof Double))
      {
        str = zauj.b(((Double)localObject).doubleValue());
        paramzcjz.b("n");
        paramzcjz.a("v", str);
        if (bool1) {
          paramzcjz.a("f", "1");
        }
        if (bool2) {
          paramzcjz.a("u", "1");
        }
        paramzcjz.b();
      }
      else if ((localObject instanceof Integer))
      {
        str = zauj.z(((Integer)localObject).intValue());
        paramzcjz.b("n");
        paramzcjz.a("v", str);
        if (bool1) {
          paramzcjz.a("f", "1");
        }
        if (bool2) {
          paramzcjz.a("u", "1");
        }
        paramzcjz.b();
      }
      else if ((localObject instanceof Short))
      {
        str = zauj.a(((Short)localObject).shortValue());
        paramzcjz.b("n");
        paramzcjz.a("v", str);
        if (bool1) {
          paramzcjz.a("f", "1");
        }
        if (bool2) {
          paramzcjz.a("u", "1");
        }
        paramzcjz.b();
      }
      else if ((localObject instanceof DateTime))
      {
        str = ((DateTime)localObject).a("yyyy-MM-dd\\THH:mm:ss.fff", com.aspose.cells.b.a.c.za.b());
        paramzcjz.b("d");
        paramzcjz.a("v", str);
        if (bool1) {
          paramzcjz.a("f", "1");
        }
        if (bool2) {
          paramzcjz.a("u", "1");
        }
        paramzcjz.b();
      }
      else if ((localObject instanceof Boolean))
      {
        str = ((Boolean)localObject).booleanValue() ? "1" : "0";
        paramzcjz.b("b");
        paramzcjz.a("v", str);
        if (bool1) {
          paramzcjz.a("f", "1");
        }
        if (bool2) {
          paramzcjz.a("u", "1");
        }
        paramzcjz.b();
      }
    }
  }
  
  private void a(zcjz paramzcjz, zbtv paramzbtv)
    throws Exception
  {
    paramzcjz.b("cacheField");
    paramzcjz.a("name", paramzbtv.a);
    if (paramzbtv.q != -1) {
      paramzcjz.a("numFmtId", zauj.z(paramzbtv.q));
    }
    this.b.B = paramzbtv;
    String str1 = paramzbtv.b();
    if (str1 != null)
    {
      paramzcjz.a("formula", zauj.L(str1));
      paramzcjz.a("databaseField", "0");
    }
    else
    {
      if (paramzbtv.o) {
        paramzcjz.a("databaseField", "0");
      }
      paramzcjz.b("sharedItems");
      Iterator localIterator;
      Object localObject;
      if (paramzbtv.v())
      {
        if (paramzbtv.j())
        {
          if (!paramzbtv.k()) {
            paramzcjz.a("containsNonDate", "0");
          }
          paramzcjz.a("containsDate", "1");
        }
        paramzcjz.a("containsString", "0");
        paramzcjz.a("containsBlank", "1");
      }
      else
      {
        if (!paramzbtv.s()) {
          paramzcjz.a("containsSemiMixedTypes", "0");
        }
        if (paramzbtv.j())
        {
          if (!paramzbtv.k()) {
            paramzcjz.a("containsNonDate", "0");
          }
          paramzcjz.a("containsDate", "1");
        }
        if (!paramzbtv.i()) {
          paramzcjz.a("containsString", "0");
        }
        if (paramzbtv.u()) {
          paramzcjz.a("containsBlank", "1");
        }
        if (paramzbtv.r()) {
          paramzcjz.a("containsMixedTypes", "1");
        }
        if ((paramzbtv.f()) && (!paramzbtv.j()))
        {
          paramzcjz.a("containsNumber", "1");
          if ((paramzbtv.c != null) && (paramzbtv.c.size() > 0))
          {
            paramzbtv.c(true);
            localIterator = paramzbtv.c.iterator();
            while (localIterator.hasNext())
            {
              localObject = localIterator.next();
              zbos localzbos = (zbos)localObject;
              if (((localzbos.a instanceof Integer)) || ((localzbos.a instanceof Double)))
              {
                String str2 = localzbos.d;
                if ((str2 == null) || ("".equals(str2))) {
                  if ((localzbos.a instanceof Integer)) {
                    str2 = zauj.z(((Integer)localzbos.a).intValue());
                  } else {
                    str2 = zauj.b(((Double)localzbos.a).doubleValue());
                  }
                }
                if ((str2.indexOf('.') != -1) || (str2.indexOf("e") != -1) || (str2.indexOf("E") != -1))
                {
                  paramzbtv.c(false);
                  paramzbtv.d(true);
                  break;
                }
              }
            }
          }
        }
        if ((paramzbtv.g()) && (!paramzbtv.j())) {
          paramzcjz.a("containsInteger", "1");
        }
        if (paramzbtv.p) {
          paramzcjz.a("longText", "1");
        }
      }
      if (paramzbtv.k != null) {
        paramzcjz.a("minDate", paramzbtv.k);
      }
      if (paramzbtv.l != null) {
        paramzcjz.a("maxDate", paramzbtv.l);
      }
      if (paramzbtv.c != null)
      {
        paramzcjz.a("count", zauj.z(paramzbtv.c.size()));
        localIterator = paramzbtv.c.iterator();
        while (localIterator.hasNext())
        {
          localObject = localIterator.next();
          a(paramzcjz, localObject);
        }
      }
      paramzcjz.b();
    }
    if (paramzbtv.j != null) {
      b(paramzcjz, paramzbtv);
    }
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, zbtv paramzbtv)
    throws Exception
  {
    SxRng localSxRng = paramzbtv.j;
    paramzcjz.b("fieldGroup");
    if (localSxRng.l != -1) {
      paramzcjz.a("par", zauj.z(localSxRng.l));
    }
    if (localSxRng.k != -1) {
      paramzcjz.a("base", zauj.z(localSxRng.k));
    }
    if (localSxRng.n == null)
    {
      if (localSxRng.d != null)
      {
        paramzcjz.b("rangePr");
        paramzcjz.a("groupBy", zauj.aL(localSxRng.c));
        if (localSxRng.b) {
          paramzcjz.a("autoEnd", "1");
        } else {
          paramzcjz.a("autoEnd", "0");
        }
        if (localSxRng.a) {
          paramzcjz.a("autoStart", "1");
        } else {
          paramzcjz.a("autoStart", "0");
        }
        if (localSxRng.c == 0)
        {
          paramzcjz.a("startNum", zauj.b(localSxRng.h));
          paramzcjz.a("endNum", zauj.b(localSxRng.i));
        }
        else
        {
          if (localSxRng.f != null) {
            paramzcjz.a("startDate", localSxRng.f.a("yyyy-MM-dd\\THH:mm:ss.fff", com.aspose.cells.b.a.c.za.b()));
          }
          if (localSxRng.g != null) {
            paramzcjz.a("endDate", localSxRng.g.a("yyyy-MM-dd\\THH:mm:ss.fff", com.aspose.cells.b.a.c.za.b()));
          }
        }
        if (localSxRng.j != 1.0D) {
          paramzcjz.a("groupInterval", zauj.b(localSxRng.j));
        }
        paramzcjz.b();
      }
    }
    else
    {
      paramzcjz.b("discretePr");
      paramzcjz.a("count", zauj.z(localSxRng.n.size()));
      for (int i = 0; i < localSxRng.n.size(); i++)
      {
        paramzcjz.b("x");
        paramzcjz.a("v", zs.a(localSxRng.n.get(i)));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    if (localSxRng.d != null) {
      a(paramzcjz, localSxRng);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, SxRng paramSxRng)
    throws Exception
  {
    paramzcjz.b("groupItems");
    paramzcjz.a("count", zauj.z(paramSxRng.d.size()));
    Iterator localIterator = paramSxRng.d.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      b(paramzcjz, localObject);
    }
    paramzcjz.b();
  }
  
  private void e(zcjz paramzcjz)
    throws Exception
  {
    switch (this.b.f.c())
    {
    case 1: 
      g(paramzcjz);
      break;
    case 4: 
      f(paramzcjz);
      break;
    }
  }
  
  private void f(zcjz paramzcjz)
    throws Exception
  {
    zno localzno = (zno)this.b.f;
    paramzcjz.b("cacheSource");
    paramzcjz.a("type", "consolidation");
    paramzcjz.b("consolidation");
    if (!localzno.a) {
      paramzcjz.a("autoPage", "0");
    }
    if (localzno.c != null) {
      a(paramzcjz, localzno.c);
    }
    if (localzno.b != null) {
      a(paramzcjz, localzno.b);
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, String[][] paramArrayOfString)
    throws Exception
  {
    paramzcjz.b("pages");
    paramzcjz.a("count", zauj.z(paramArrayOfString.length));
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      String[] arrayOfString = paramArrayOfString[i];
      a(paramzcjz, arrayOfString);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, String[] paramArrayOfString)
    throws Exception
  {
    paramzcjz.b("page");
    paramzcjz.a("count", zauj.z(paramArrayOfString.length));
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      String str = paramArrayOfString[i];
      paramzcjz.b("pageItem");
      paramzcjz.a("name", str);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, znp[] paramArrayOfznp)
    throws Exception
  {
    paramzcjz.b("rangeSets");
    paramzcjz.a("count", zauj.z(paramArrayOfznp.length));
    for (int i = 0; i < paramArrayOfznp.length; i++)
    {
      int[] arrayOfInt = paramArrayOfznp[i].a;
      a(paramzcjz, arrayOfInt, this.c.e[i]);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, int[] paramArrayOfInt, zpg paramzpg)
    throws Exception
  {
    paramzcjz.b("rangeSet");
    if (paramArrayOfInt.length >= 4) {
      paramzcjz.a("i4", zauj.z(paramArrayOfInt[3]));
    }
    if (paramArrayOfInt.length >= 3) {
      paramzcjz.a("i3", zauj.z(paramArrayOfInt[2]));
    }
    if ((paramArrayOfInt.length >= 2) && (paramArrayOfInt[1] != -1)) {
      paramzcjz.a("i2", zauj.z(paramArrayOfInt[1]));
    }
    if (paramArrayOfInt.length >= 1) {
      paramzcjz.a("i1", zauj.z(paramArrayOfInt[0]));
    }
    if (paramzpg.c) {
      paramzcjz.a("ref", paramzpg.e);
    } else {
      paramzcjz.a("name", paramzpg.e);
    }
    if (paramzpg.a != null) {
      paramzcjz.a("sheet", paramzpg.a);
    }
    if (paramzpg.b != null) {
      paramzcjz.a("r:id", paramzpg.b);
    }
    paramzcjz.b();
  }
  
  private void g(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("cacheSource");
    paramzcjz.a("type", "worksheet");
    paramzcjz.b("worksheetSource");
    zpg localzpg = this.c.e[0];
    if (localzpg.c)
    {
      if ((localzpg.f.EndRow == 1048575) && (localzpg.f.StartRow == 0))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        CellsHelper.a(localStringBuilder, localzpg.f.StartRow, localzpg.f.StartColumn);
        localStringBuilder.append(":");
        CellsHelper.a(localStringBuilder, localzpg.f.EndRow, localzpg.f.EndColumn);
        paramzcjz.a("ref", zs.a(localStringBuilder));
      }
      else
      {
        paramzcjz.a("ref", localzpg.e);
      }
    }
    else {
      paramzcjz.a("name", localzpg.e);
    }
    if (localzpg.a != null) {
      paramzcjz.a("sheet", localzpg.a);
    }
    if (localzpg.b != null) {
      paramzcjz.a("r:id", localzpg.b);
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void h(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.a("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
    if (this.c.d != null) {
      paramzcjz.a("r:id", this.c.d);
    }
    if (this.b.t != -1) {
      paramzcjz.a("missingItemsLimit", zauj.z(this.b.t));
    }
    paramzcjz.a("createdVersion", this.b.o);
    if (this.b.p != null) {
      paramzcjz.a("refreshedVersion", this.b.p);
    }
    if (this.b.q != null) {
      paramzcjz.a("minRefreshableVersion", this.b.q);
    }
    if (this.b.i()) {
      paramzcjz.a("refreshOnLoad", "1");
    }
    if ((!this.b.c(1)) || (this.b.h == null) || (this.b.h.a == null)) {
      paramzcjz.a("saveData", "0");
    }
    paramzcjz.a("recordCount", zauj.z(this.b.d()));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */