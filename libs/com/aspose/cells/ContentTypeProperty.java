package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ContentTypeProperty
{
  ContentTypePropertyCollection a;
  int b;
  String c;
  String d;
  String e;
  ArrayList f;
  private String m;
  String g = null;
  String h = null;
  String i = null;
  HashMap j = null;
  Object k;
  String l;
  
  HashMap a()
  {
    if (this.j == null) {
      this.j = new HashMap();
    }
    return this.j;
  }
  
  ContentTypeProperty(ContentTypePropertyCollection ctps)
  {
    this.a = ctps;
    this.f = new ArrayList();
    this.c = ctps.a;
    ctps.b += 1;
    this.b = ctps.b;
  }
  
  void a(ContentTypeProperty paramContentTypeProperty)
  {
    this.i = paramContentTypeProperty.i;
    this.g = paramContentTypeProperty.g;
    this.b = paramContentTypeProperty.b;
    this.h = paramContentTypeProperty.h;
    this.d = paramContentTypeProperty.d;
    zf.a(this.f, paramContentTypeProperty.f);
    this.e = paramContentTypeProperty.e;
    this.l = paramContentTypeProperty.l;
    this.m = paramContentTypeProperty.m;
    this.c = paramContentTypeProperty.c;
    this.k = paramContentTypeProperty.k;
    Iterator localIterator = paramContentTypeProperty.j.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a().put(str, paramContentTypeProperty.a().get(str));
    }
  }
  
  public String getName()
  {
    return this.m;
  }
  
  public void setName(String value)
  {
    this.m = value;
  }
  
  public String getValue()
  {
    if (this.k != null) {
      return zs.a(this.k);
    }
    return "";
  }
  
  public void setValue(String value)
  {
    this.k = value;
  }
  
  public String getType()
  {
    if ((this.d != null) && (this.d.startsWith("dms:"))) {
      return this.d.substring(4);
    }
    return this.d;
  }
  
  public void setType(String value)
  {
    String str = value;
    if ((str != null) && (str.indexOf(":") == -1)) {
      str = "dms:" + str;
    }
    this.d = str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ContentTypeProperty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */