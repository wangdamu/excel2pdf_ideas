package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

class zalb
{
  private static Comparator a = new zrm();
  private static final za b = new za(new String[] { "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image" });
  
  static String a(String paramString)
  {
    String str1 = zu.b(paramString);
    String str2 = paramString.substring(0, 0 + (paramString.length() - str1.length()));
    String str3 = str2 + "_rels/" + str1 + ".rels";
    return str3;
  }
  
  static ArrayList a(zcjy paramzcjy)
    throws Exception
  {
    d(paramzcjy);
    if (paramzcjy.o()) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("Relationship".equals(paramzcjy.q()))
      {
        zrl localzrl = c(paramzcjy);
        zf.a(localArrayList, localzrl);
      }
      else
      {
        paramzcjy.a();
      }
    }
    return localArrayList;
  }
  
  static HashMap b(zcjy paramzcjy)
    throws Exception
  {
    d(paramzcjy);
    if (paramzcjy.o()) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("Relationship".equals(paramzcjy.q()))
      {
        zrl localzrl = c(paramzcjy);
        localHashMap.put(localzrl.b, localzrl);
      }
      else
      {
        paramzcjy.a();
      }
    }
    return localHashMap;
  }
  
  static HashMap a(zcjy paramzcjy, zqh paramzqh, Workbook paramWorkbook, zi paramzi, String paramString)
    throws Exception
  {
    HashMap localHashMap = b(paramzcjy);
    if (localHashMap == null) {
      return localHashMap;
    }
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      zrl localzrl = (zrl)localHashMap.get(str1);
      switch (b.a(localzrl.c))
      {
      case 0: 
        try
        {
          int i = -1;
          if (!"NULL".equals(localzrl.d))
          {
            String[] arrayOfString = zauj.a(paramString, localzrl.d, false);
            String str2 = arrayOfString[0];
            Object localObject = null;
            if (paramzqh != null) {
              localObject = paramzqh.f.get(str2);
            }
            if (localObject == null)
            {
              zh localzh = paramzi.a(str2);
              if ((localzh != null) && (localzh.a() > 0L))
              {
                zm localzm = paramzi.a(localzh);
                byte[] arrayOfByte = new byte[(int)localzh.a()];
                int j = localzm.a(arrayOfByte, 0, arrayOfByte.length);
                localzm.a();
                if (zcc.a(arrayOfByte) == 0) {
                  localzrl.h = arrayOfByte;
                } else {
                  i = paramWorkbook.getWorksheets().L().b().a(arrayOfByte);
                }
              }
              if (paramzqh != null) {
                paramzqh.f.put(str2, Integer.valueOf(i));
              }
            }
            else
            {
              i = ((Integer)localObject).intValue();
            }
          }
          localzrl.f = i;
          if (i != -1) {
            localzrl.g = paramWorkbook.getWorksheets().L().b().a(i);
          }
          if (paramWorkbook.a != null) {
            zf.a(paramWorkbook.a.f, zk.b(localzrl.d));
          }
        }
        catch (Exception localException) {}
      }
    }
    return localHashMap;
  }
  
  private static zrl c(zcjy paramzcjy)
    throws Exception
  {
    if (!paramzcjy.n()) {
      throw new CellsException(6, "Invalid Relationship element");
    }
    zrl localzrl = new zrl();
    while (paramzcjy.m()) {
      if ("Id".equals(paramzcjy.q())) {
        localzrl.b = paramzcjy.t();
      } else if ("Type".equals(paramzcjy.q())) {
        localzrl.c = paramzcjy.t();
      } else if ("Target".equals(paramzcjy.q())) {
        localzrl.d = paramzcjy.t();
      } else if ("TargetMode".equals(paramzcjy.q())) {
        localzrl.e = paramzcjy.t();
      }
    }
    paramzcjy.l();
    paramzcjy.a();
    return localzrl;
  }
  
  private static void d(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"Relationships".equals(paramzcjy.q()))) {
      throw new CellsException(6, "Relationships root element eror");
    }
  }
  
  static zrl a(HashMap paramHashMap, String paramString, boolean paramBoolean)
  {
    if ((paramHashMap == null) || (paramHashMap.size() == 0)) {
      return null;
    }
    Iterator localIterator = paramHashMap.values().iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      if (localzrl.c.equals(paramString))
      {
        localObject = localzrl;
        break;
      }
    }
    if ((paramBoolean) && (localObject != null)) {
      paramHashMap.remove(((zrl)localObject).b);
    }
    return (zrl)localObject;
  }
  
  static zrl a(HashMap paramHashMap, String paramString)
  {
    if ((paramHashMap == null) || (paramHashMap.size() == 0)) {
      return null;
    }
    Iterator localIterator = paramHashMap.values().iterator();
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      if (zw.b(localzrl.b, paramString)) {
        return localzrl;
      }
    }
    return null;
  }
  
  static ArrayList b(HashMap paramHashMap, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramHashMap == null) || (paramHashMap.size() == 0)) {
      return localArrayList;
    }
    Iterator localIterator = paramHashMap.values().iterator();
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      if ((localzrl.c != null) && (localzrl.c.equals(paramString))) {
        zf.a(localArrayList, localzrl);
      }
    }
    Collections.sort(localArrayList, a);
    return localArrayList;
  }
  
  static void a(HashMap paramHashMap, ArrayList paramArrayList, String paramString)
  {
    if ((paramHashMap == null) || (paramHashMap.size() == 0) || (paramArrayList == null)) {
      return;
    }
    Iterator localIterator = paramHashMap.values().iterator();
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      if (localzrl.c.equals(paramString)) {
        zf.a(paramArrayList, localzrl);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */