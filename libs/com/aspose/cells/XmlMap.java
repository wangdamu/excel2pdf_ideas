package com.aspose.cells;

import java.util.HashMap;

public class XmlMap
{
  private boolean a;
  private boolean b;
  private int c;
  private String d;
  private boolean e;
  private boolean f;
  private String g;
  private String h;
  private boolean i;
  private zcjk j;
  private WorksheetCollection k;
  private HashMap l = null;
  
  XmlMap(WorksheetCollection sheets)
  {
    this.k = sheets;
  }
  
  WorksheetCollection a()
  {
    return this.k;
  }
  
  boolean b()
  {
    return this.a;
  }
  
  void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  boolean c()
  {
    return this.b;
  }
  
  void b(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  int d()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
    if (this.k.getXmlMaps().d() < this.c) {
      this.k.getXmlMaps().a(this.c);
    }
  }
  
  public String getName()
  {
    return this.d;
  }
  
  public void setName(String value)
  {
    this.d = value;
  }
  
  boolean e()
  {
    return this.e;
  }
  
  void c(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  boolean f()
  {
    return this.f;
  }
  
  void d(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  String g()
  {
    return this.g;
  }
  
  void a(String paramString)
  {
    this.g = paramString;
  }
  
  String h()
  {
    return this.h;
  }
  
  void b(String paramString)
  {
    this.h = paramString;
  }
  
  boolean i()
  {
    return this.i;
  }
  
  void e(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  zcjk j()
  {
    return this.j;
  }
  
  void a(zcjk paramzcjk)
  {
    this.j = paramzcjk;
  }
  
  HashMap k()
    throws Exception
  {
    zcjn localzcjn = this.k.getXmlMaps().d(this.h);
    if (localzcjn == null) {
      throw new CellsException(6, "Can't get schema: " + this.h);
    }
    zaoq localzaoq = new zaoq(localzcjn, this);
    return localzaoq.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/XmlMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */