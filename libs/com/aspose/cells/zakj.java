package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zakj
{
  private ContentTypePropertyCollection a = null;
  private int b = 0;
  private static final za c = new za(new String[] { "name", "index", "displayName", "internalName", "format", "default" });
  
  zakj(ContentTypePropertyCollection paramContentTypePropertyCollection)
  {
    this.a = paramContentTypePropertyCollection;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    HashMap localHashMap = null;
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("schema".equals(paramzcjy.q()))
      {
        String str = paramzcjy.a("targetNamespace");
        if ("http://schemas.microsoft.com/office/2006/metadata/properties".equals(str))
        {
          localHashMap = b(paramzcjy);
          continue;
        }
        if (localHashMap.get(str) != null)
        {
          a(paramzcjy, str);
          continue;
        }
      }
      paramzcjy.a();
    }
    this.a.b = this.b;
  }
  
  private HashMap b(zcjy paramzcjy)
    throws Exception
  {
    HashMap localHashMap = new HashMap();
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("import".equals(paramzcjy.q()))
      {
        String str = paramzcjy.a("namespace");
        localHashMap.put(str, str);
        this.a.a = str;
      }
      paramzcjy.a();
    }
    return localHashMap;
  }
  
  void a(zcjy paramzcjy, ContentTypeProperty paramContentTypeProperty)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("restriction".equals(paramzcjy.q()))
      {
        paramContentTypeProperty.d = paramzcjy.a("base");
        b(paramzcjy, paramContentTypeProperty);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  void b(zcjy paramzcjy, ContentTypeProperty paramContentTypeProperty)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("enumeration".equals(paramzcjy.q()))
      {
        String str = paramzcjy.a("value");
        zf.a(paramContentTypeProperty.f, str);
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  void c(zcjy paramzcjy, ContentTypeProperty paramContentTypeProperty)
    throws Exception
  {
    if (paramzcjy.n()) {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 0: 
          paramContentTypeProperty.setName(paramzcjy.t());
          break;
        case 1: 
          paramContentTypeProperty.b = zauj.F(paramzcjy.t());
          if (paramContentTypeProperty.b > this.b) {
            this.b = paramContentTypeProperty.b;
          }
          break;
        case 2: 
          paramContentTypeProperty.g = paramzcjy.t();
          break;
        case 3: 
          paramContentTypeProperty.h = paramzcjy.t();
          break;
        case 4: 
          paramContentTypeProperty.e = paramzcjy.t();
          break;
        case 5: 
          paramContentTypeProperty.i = paramzcjy.t();
          break;
        default: 
          paramContentTypeProperty.a().put(paramzcjy.p(), paramzcjy.t());
        }
      }
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("simpleType".equals(paramzcjy.q())) {
        a(paramzcjy, paramContentTypeProperty);
      } else if ("complexType".equals(paramzcjy.q())) {
        paramContentTypeProperty.l = paramzcjy.b();
      } else {
        paramzcjy.a();
      }
    }
  }
  
  void a(zcjy paramzcjy, String paramString)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("element".equals(paramzcjy.q()))
      {
        String str = paramzcjy.a("name");
        int i = this.a.add(str, null);
        ContentTypeProperty localContentTypeProperty = this.a.get(i);
        localContentTypeProperty.c = paramString;
        if (localContentTypeProperty != null) {
          c(paramzcjy, localContentTypeProperty);
        } else {
          paramzcjy.a();
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */