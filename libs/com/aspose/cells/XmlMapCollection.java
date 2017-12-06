package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class XmlMapCollection
  extends CollectionBase
{
  private WorksheetCollection a;
  private ArrayList b = new ArrayList();
  private String c = "";
  private String d = "http://schemas.openxmlformats.org/spreadsheetml/2006/main";
  private int e = 0;
  
  ArrayList a()
  {
    return this.b;
  }
  
  String b()
  {
    return this.c;
  }
  
  void a(String paramString)
  {
    this.c = paramString;
  }
  
  String c()
  {
    return this.d;
  }
  
  void b(String paramString)
  {
    this.d = paramString;
  }
  
  int d()
  {
    return this.e;
  }
  
  void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  XmlMapCollection(WorksheetCollection sheets)
  {
    this.a = sheets;
  }
  
  int e()
  {
    XmlMap localXmlMap = new XmlMap(this.a);
    localXmlMap.a(++this.e);
    zf.a(this.InnerList, localXmlMap);
    return this.InnerList.size() - 1;
  }
  
  int a(XmlMap paramXmlMap)
  {
    if (this.e < paramXmlMap.d()) {
      this.e = paramXmlMap.d();
    }
    zf.a(this.InnerList, paramXmlMap);
    return this.InnerList.size() - 1;
  }
  
  public XmlMap get(int index)
  {
    return (XmlMap)this.InnerList.get(index);
  }
  
  XmlMap c(String paramString)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      XmlMap localXmlMap = (XmlMap)localIterator.next();
      if (localXmlMap.getName().equals(paramString)) {
        return localXmlMap;
      }
    }
    return null;
  }
  
  public int add(String url)
    throws Exception
  {
    zcjl localzcjl = new zcjl(url);
    return a(url, localzcjl);
  }
  
  int a(String paramString, zcjl paramzcjl)
    throws Exception
  {
    int i = this.a.p().getDataConnections().a(paramString);
    int j = this.a.p().getDataConnections().get(i).l;
    zcjn localzcjn = paramzcjl.b();
    int k = e();
    XmlMap localXmlMap = get(k);
    localXmlMap.b(b(localXmlMap.d()));
    localXmlMap.a(localzcjn.g);
    localXmlMap.setName(e(localzcjn.g));
    localXmlMap.a(new zcjk());
    localXmlMap.j().a(j);
    localXmlMap.j().a(true);
    zf.a(a(), paramzcjl.a(localXmlMap.h()));
    return this.InnerList.size() - 1;
  }
  
  private String e(String paramString)
  {
    String str1 = paramString + "_Map";
    String str2 = str1;
    int i = 0;
    int j = 1;
    while (j != 0)
    {
      j = 0;
      Iterator localIterator = iterator();
      while (localIterator.hasNext())
      {
        XmlMap localXmlMap = (XmlMap)localIterator.next();
        if ((localXmlMap.getName() != null) && (localXmlMap.getName().equals(str2)))
        {
          j = 1;
          i++;
          break;
        }
      }
      if (j != 0) {
        str2 = str1 + i;
      }
    }
    return str2;
  }
  
  private String b(int paramInt)
  {
    String str1 = "Schema";
    int i = paramInt;
    String str2 = str1 + i;
    int j = 1;
    while (j != 0)
    {
      j = 0;
      Iterator localIterator = iterator();
      while (localIterator.hasNext())
      {
        XmlMap localXmlMap = (XmlMap)localIterator.next();
        if ((localXmlMap.h() != null) && (localXmlMap.h().equals(str2)))
        {
          j = 1;
          i++;
          break;
        }
      }
      if (j != 0) {
        str2 = str1 + i;
      }
    }
    return str2;
  }
  
  zcjn d(String paramString)
    throws Exception
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      zcjm localzcjm = zauz.a(str1);
      zcjn localzcjn = localzcjm.f();
      String str2 = localzcjn.g;
      if ((str2 != null) && ("Schema".equals(str2)))
      {
        String str3 = localzcjn.a("ID");
        if ((str3 != null) && (zw.b(str3, paramString))) {
          return localzcjn;
        }
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/XmlMapCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */