package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class zqi
{
  int a;
  String b;
  String c;
  Worksheet d;
  HashMap e;
  String f;
  String g;
  String h;
  String i;
  String j;
  HashMap k;
  ArrayList l = null;
  zqh m = null;
  ArrayList n = new ArrayList();
  HashMap o = new HashMap();
  HashMap p = new HashMap();
  private static final za q = new za(new String[] { "http://schemas.openxmlformats.org/officeDocument/2006/relationships/comments", "http://purl.oclc.org/ooxml/officeDocument/relationships/comments" });
  
  zqg a(String paramString1, String paramString2, boolean paramBoolean)
  {
    for (int i1 = 0; i1 < this.n.size(); i1++)
    {
      zqg localzqg = (zqg)this.n.get(i1);
      if (((paramString1 != null) && (zw.b(localzqg.d, paramString1))) || ((paramString2 != null) && (zw.b(localzqg.d, paramString2))))
      {
        if (paramBoolean) {
          this.n.remove(i1);
        }
        return localzqg;
      }
    }
    return null;
  }
  
  zqe a(String paramString1, String paramString2)
  {
    Object localObject = null;
    if (paramString2 != null) {
      localObject = (zqe)this.p.get(paramString2);
    }
    if ((localObject == null) && (paramString1 != null))
    {
      localObject = (zqe)this.p.get(paramString1);
      if ((localObject == null) && (!paramString1.startsWith("\000")))
      {
        Iterator localIterator = this.p.values().iterator();
        while (localIterator.hasNext())
        {
          zqe localzqe = (zqe)localIterator.next();
          if (zw.b(localzqe.a, paramString1))
          {
            localObject = localzqe;
            break;
          }
        }
      }
    }
    return (zqe)localObject;
  }
  
  zqi(zqh paramzqh, Worksheet paramWorksheet)
  {
    this.m = paramzqh;
    this.d = paramWorksheet;
  }
  
  String a()
  {
    if ((this.e == null) || (this.e.size() == 0)) {
      return null;
    }
    Iterator localIterator = this.e.values().iterator();
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      switch (q.a(localzrl.c))
      {
      case 0: 
      case 1: 
        String str = localzrl.d;
        if ((str == null) || ("".equals(str))) {
          return null;
        }
        if (str.charAt(0) == '/') {
          return str;
        }
        return "xl/" + str.substring(3);
      }
    }
    return null;
  }
  
  void a(ArrayList paramArrayList)
  {
    zalb.a(this.e, paramArrayList, "http://schemas.microsoft.com/office/2011/relationships/timeline");
  }
  
  void b(ArrayList paramArrayList)
  {
    zalb.a(this.e, paramArrayList, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slicer");
    zalb.a(this.e, paramArrayList, "http://schemas.microsoft.com/office/2007/relationships/slicer");
    zalb.a(this.e, paramArrayList, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image");
    zalb.a(this.e, paramArrayList, "http://schemas.microsoft.com/office/2011/relationships/timeline");
  }
  
  String a(String paramString)
  {
    if ((paramString == null) || (this.e == null) || (!this.e.containsKey(paramString))) {
      return null;
    }
    zrl localzrl = (zrl)this.e.get(paramString);
    return localzrl.d;
  }
  
  zrl b(String paramString)
  {
    if ((paramString == null) || (!this.e.containsKey(paramString))) {
      return null;
    }
    zrl localzrl = (zrl)this.e.get(paramString);
    return localzrl;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */