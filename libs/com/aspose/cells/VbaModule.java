package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

public class VbaModule
{
  String a;
  int b;
  String c;
  String d;
  int e;
  int f;
  int g = 255;
  int h;
  boolean i;
  boolean j;
  byte[] k;
  String l;
  zbyo m;
  zbyo n;
  byte[] o;
  static String p = "0{00020819-0000-0000-C000-000000000046}";
  VbaProject q;
  String r;
  private static final za s = new za(new String[] { "ClientHeight", "ClientLeft", "ClientTop", "ClientWidth" });
  
  VbaModule(VbaProject vbaProject)
  {
    this.q = vbaProject;
    this.m = new zbyo();
  }
  
  VbaModule(VbaProject vbaProject, int type, String name)
  {
    this.q = vbaProject;
    this.m = new zbyo();
    if (type == 3) {
      this.n = new zbyo();
    }
    this.a = name;
    this.h = type;
    this.c = name;
    this.l = zbyq.a(this);
  }
  
  public String getName()
  {
    return this.a;
  }
  
  public void setName(String value)
  {
    Workbook localWorkbook = this.q.p;
    if (zw.b(this.a, localWorkbook.getWorksheets().j()))
    {
      localWorkbook.getWorksheets().b(value);
    }
    else
    {
      Worksheet localWorksheet = localWorkbook.getWorksheets().getSheetByCodeName(this.a);
      localWorksheet.c(value);
    }
    this.a = value;
    this.c = value;
  }
  
  public int getType()
  {
    return this.h;
  }
  
  public String getCodes()
    throws Exception
  {
    if (this.l != null) {
      return this.l;
    }
    zm localzm = zbyq.a(new zh(this.k), this.e);
    localzm.a(0L, 0);
    zn localzn = new zn(localzm, this.q.d);
    this.l = localzn.e();
    this.k = null;
    this.e = 0;
    return this.l;
  }
  
  public void setCodes(String value)
  {
    this.l = value;
    this.k = null;
    this.e = 0;
    this.l = zbyq.a(this);
  }
  
  void a(VbaModule paramVbaModule)
  {
    if (paramVbaModule == null) {
      return;
    }
    if (zw.b(this.a))
    {
      this.a = paramVbaModule.a;
      this.c = paramVbaModule.c;
    }
    this.e = paramVbaModule.e;
    this.f = paramVbaModule.f;
    this.g = paramVbaModule.g;
    this.h = paramVbaModule.h;
    this.i = paramVbaModule.i;
    this.j = paramVbaModule.j;
    this.k = paramVbaModule.k;
    this.l = paramVbaModule.l;
    if (paramVbaModule.m != null)
    {
      this.m = new zbyo();
      this.m.a(paramVbaModule.m);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/VbaModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */