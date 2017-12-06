package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;
import java.util.ArrayList;
import java.util.HashMap;

class zqh
  implements zj
{
  Workbook a;
  private HashMap s;
  HashMap b;
  ArrayList c;
  HashMap d;
  HashMap e;
  HashMap f;
  String g = "xl/workbook.xml";
  ArrayList h = new ArrayList();
  ArrayList i;
  LoadOptions j;
  int k;
  boolean l;
  String m;
  String n;
  String o;
  boolean p = true;
  ArrayList q;
  private HashMap t = new HashMap();
  ArrayList r = new ArrayList();
  
  public void a()
  {
    dispose();
  }
  
  public void dispose()
  {
    this.s = null;
    this.i = null;
    this.j = null;
    this.h = null;
    this.f = null;
    this.r = null;
    this.t = null;
    this.e = null;
    this.b = null;
    this.c = null;
    this.q = null;
    this.a = null;
    this.d = null;
    zg.a(this);
  }
  
  zqh(Workbook paramWorkbook)
  {
    this(paramWorkbook, null);
  }
  
  zqh(Workbook paramWorkbook, LoadOptions paramLoadOptions)
  {
    this.a = paramWorkbook;
    this.c = new ArrayList();
    this.b = new HashMap();
    this.f = new HashMap();
    this.j = paramLoadOptions;
    if (paramLoadOptions == null)
    {
      this.k = Integer.MAX_VALUE;
      this.l = false;
    }
    else
    {
      this.k = paramLoadOptions.getLoadFilter().getLoadDataFilterOptions();
      this.l = (paramLoadOptions.getLightCellsDataHandler() != null);
    }
  }
  
  void a(Worksheet paramWorksheet, int paramInt, String paramString1, String paramString2)
  {
    int i1 = zauj.F(paramString1);
    if (i1 < 1) {
      throw new IllegalStateException("Invalid SheetId " + paramString1);
    }
    zqi localzqi = new zqi(this, paramWorksheet);
    localzqi.a = paramInt;
    localzqi.b = paramString1;
    localzqi.c = paramString2;
    zf.a(this.c, localzqi);
    this.b.put(Integer.valueOf(paramInt), localzqi);
  }
  
  Worksheet a(int paramInt)
  {
    if (!this.b.containsKey(Integer.valueOf(paramInt))) {
      throw new IllegalStateException("Invalid localSheetId");
    }
    return ((zqi)this.b.get(Integer.valueOf(paramInt))).d;
  }
  
  HashMap b()
  {
    return this.s;
  }
  
  void a(HashMap paramHashMap)
  {
    this.s = paramHashMap;
  }
  
  HashMap c()
  {
    return this.t;
  }
  
  void b(HashMap paramHashMap)
  {
    this.t = paramHashMap;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */