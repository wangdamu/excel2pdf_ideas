package com.aspose.cells;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zbbs
{
  HashMap a = new HashMap();
  private int b = 1;
  
  static zbbs a(String paramString1, String paramString2, String paramString3)
  {
    zrl localzrl = new zrl("rId1", paramString1, paramString2, paramString3);
    zbbs localzbbs = new zbbs();
    localzbbs.a(localzrl);
    return localzbbs;
  }
  
  int a()
  {
    return this.a.size();
  }
  
  void a(zrl paramzrl)
  {
    this.a.put(paramzrl.b, paramzrl);
  }
  
  void a(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      this.a.put(localzrl.b, localzrl);
    }
  }
  
  void a(HashMap paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.a.put(str, paramHashMap.get(str));
    }
  }
  
  zrl b(String paramString1, String paramString2, String paramString3)
  {
    String str = null;
    for (;;)
    {
      str = "rId" + this.b;
      if (this.a.get(str) == null) {
        break;
      }
      this.b += 1;
    }
    zrl localzrl = new zrl(str, paramString1, paramString2, paramString3);
    this.a.put(str, localzrl);
    return localzrl;
  }
  
  zrl a(String paramString1, String paramString2)
  {
    return b(paramString1, paramString2, null);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */