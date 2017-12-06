package com.aspose.cells.a.d;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class zgv
{
  private HashMap a = new HashMap();
  private HashMap b = new HashMap();
  private HashMap c = new HashMap();
  private HashMap d = new HashMap();
  
  public void a(int paramInt1, int paramInt2, String paramString)
  {
    if (!zdh.a(paramString)) {
      return;
    }
    HashMap localHashMap = c(paramInt1);
    if (localHashMap != null) {
      localHashMap.put(Integer.valueOf(paramInt2), paramString);
    }
  }
  
  public String a(int paramInt)
  {
    HashMap localHashMap = c(paramInt);
    if (localHashMap == null) {
      return null;
    }
    if (localHashMap.size() <= 0) {
      return null;
    }
    String str = (String)localHashMap.get(Integer.valueOf(1033));
    if (str == null) {
      str = (String)a(localHashMap);
    }
    return str;
  }
  
  public String[] b(int paramInt)
  {
    HashMap localHashMap = c(paramInt);
    if (localHashMap == null) {
      return null;
    }
    String[] arrayOfString = new String[localHashMap.size()];
    int i = 0;
    Iterator localIterator = localHashMap.values().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      arrayOfString[i] = str;
      i++;
    }
    return arrayOfString;
  }
  
  public zba[] a()
  {
    HashMap localHashMap1 = c(4);
    HashMap localHashMap2 = c(1);
    if ((localHashMap1.size() == 0) || (localHashMap2.size() == 0)) {
      return null;
    }
    zba[] arrayOfzba = new zba[localHashMap1.size()];
    int i = 0;
    Iterator localIterator = localHashMap1.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      String str = (String)localHashMap2.get(localObject);
      if (str == null) {
        str = (String)localHashMap2.get(Integer.valueOf(1033));
      }
      if (str == null) {
        str = (String)a(localHashMap2);
      }
      arrayOfzba[(i++)] = new zba(str, (String)localHashMap1.get(localObject));
    }
    return arrayOfzba;
  }
  
  private HashMap c(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return this.a;
    case 2: 
      return this.b;
    case 4: 
      return this.c;
    case 6: 
      return this.d;
    }
    return null;
  }
  
  private static Object a(HashMap paramHashMap)
  {
    Iterator localIterator = paramHashMap.values().iterator();
    if (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      return localObject;
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */