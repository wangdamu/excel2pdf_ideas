package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zg;
import com.aspose.cells.a.c.zl;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.a.c.zz;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class zaw
{
  private zgm b = a(paramArrayOfzaz);
  private HashMap c = zg.a();
  private HashMap d = zg.a();
  private HashMap e = zg.a();
  protected HashMap a = zg.a();
  private static zgs f = null;
  private static Object g = new Object();
  
  public zaw(zaz[] paramArrayOfzaz) {}
  
  private static zgs a()
    throws Exception
  {
    if (f == null) {
      synchronized (g)
      {
        if (f == null) {
          f = b();
        }
      }
    }
    return f;
  }
  
  private zgm a(zaz[] paramArrayOfzaz)
  {
    zgm localzgm = new zgm(false);
    for (zaz localzaz : paramArrayOfzaz) {
      try
      {
        zgu localzgu = new zgu();
        zba[] arrayOfzba = localzgu.a(localzaz);
        if (arrayOfzba != null)
        {
          Object localObject2;
          Object localObject3;
          for (localObject2 : arrayOfzba)
          {
            localObject3 = (zba)localzgm.d(((zba)localObject2).b());
            if ((localObject3 == null) || (((zba)localObject2).d())) {
              localzgm.b(((zba)localObject2).b(), localObject2);
            }
          }
          ??? = localzgu.l();
          synchronized (this.d)
          {
            Iterator localIterator1 = ((HashMap)???).keySet().iterator();
            while (localIterator1.hasNext())
            {
              localObject2 = localIterator1.next();
              if (!this.d.containsKey(localObject2)) {
                this.d.put(localObject2, zg.a());
              }
              localObject3 = (HashMap)this.d.get(localObject2);
              HashMap localHashMap = (HashMap)((HashMap)???).get(localObject2);
              if (localHashMap != null)
              {
                Iterator localIterator2 = localHashMap.keySet().iterator();
                while (localIterator2.hasNext())
                {
                  Object localObject4 = localIterator2.next();
                  ((HashMap)localObject3).put(localObject4, Integer.valueOf(0));
                }
              }
            }
          }
        }
      }
      catch (Exception localException)
      {
        zl.b(localException);
      }
    }
    return localzgm;
  }
  
  public zgs a(String paramString, int paramInt, boolean paramBoolean)
    throws Exception
  {
    zgs localzgs = c(paramString, paramInt, paramBoolean);
    return localzgs;
  }
  
  public zgs a(int paramInt, boolean paramBoolean)
    throws Exception
  {
    return c("Arial", paramInt, paramBoolean);
  }
  
  private zgs c(String paramString, int paramInt, boolean paramBoolean)
    throws Exception
  {
    zgt localzgt = (zgt)this.c.get(paramString);
    if (localzgt == null) {
      synchronized (this.c)
      {
        localzgt = (zgt)this.c.get(paramString);
        if (localzgt == null) {
          try
          {
            localzgt = b(paramString);
            this.c.put(paramString, localzgt);
          }
          catch (Exception localException)
          {
            return null;
          }
        }
      }
    }
    return localzgt.a(paramInt, paramBoolean);
  }
  
  private zgt b(String paramString)
    throws Exception
  {
    zgt localzgt = new zgt(paramString);
    Iterator localIterator = this.b.e().iterator();
    while (localIterator.hasNext())
    {
      zba localzba = (zba)localIterator.next();
      if (zy.a(paramString, localzba.a()))
      {
        zgu localzgu = new zgu();
        zgs localzgs = localzgu.a(localzba.c(), localzba.b());
        localzgt.a(localzgs);
      }
    }
    return localzgt;
  }
  
  public String a(String paramString)
  {
    paramString = zw.c(paramString, '\000');
    String str = (String)this.e.get(paramString);
    if (str == null) {
      synchronized (this.e)
      {
        if (this.e.size() == 0)
        {
          this.e.put("Arial", "Arial");
          this.e.put("MS Sans Serif", "Microsoft Sans Serif");
        }
        str = (String)this.e.get(paramString);
        if (str == null)
        {
          Iterator localIterator = this.d.keySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject1 = localIterator.next();
            HashMap localHashMap = (HashMap)this.d.get(localObject1);
            if (localHashMap.size() != 0) {
              if (localHashMap.containsKey(paramString))
              {
                str = zs.a(localObject1);
                break;
              }
            }
          }
          if ((str != null) && (str.length() > 0))
          {
            this.e.put(paramString, str);
          }
          else
          {
            str = paramString;
            this.e.put(paramString, str);
          }
        }
      }
    }
    return str;
  }
  
  public zgs b(String paramString, int paramInt, boolean paramBoolean)
    throws Exception
  {
    if (paramString.startsWith("UNHCR_Map_")) {
      paramString = "Wingdings";
    }
    String str = paramString + paramInt + (paramBoolean ? "T" : "F");
    zgs localzgs = (zgs)this.a.get(str);
    if (localzgs == null) {
      synchronized (this.a)
      {
        localzgs = (zgs)this.a.get(str);
        if (localzgs == null)
        {
          try
          {
            localzgs = a(a(paramString), paramInt, paramBoolean);
          }
          catch (Exception localException)
          {
            localzgs = a(paramInt, paramBoolean);
          }
          if (localzgs == null) {
            if (zff.a())
            {
              localzgs = a("Arial Unicode MS", paramInt, paramBoolean);
              if (localzgs == null) {
                localzgs = a(paramInt, paramBoolean);
              }
            }
            else
            {
              localzgs = a(paramInt, paramBoolean);
            }
          }
          if (localzgs == null) {
            localzgs = a();
          }
          this.a.put(str, localzgs);
        }
      }
    }
    return localzgs;
  }
  
  public Font a(String paramString, int paramInt, float paramFloat, boolean paramBoolean)
    throws Exception
  {
    return null;
  }
  
  public zgs a(int paramInt1, int paramInt2)
    throws Exception
  {
    zgs localzgs = null;
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      localzgs = b(zs.a(localObject), paramInt1, false);
      if (localzgs.e().c(paramInt2)) {
        break;
      }
      localzgs = null;
    }
    return localzgs;
  }
  
  public zgs a(int paramInt, String paramString)
    throws Exception
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    zgs localzgs = null;
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      localzgs = b(zs.a(localObject), paramInt, false);
      zcd[] arrayOfzcd = zce.a().a(paramString);
      for (int i = 0; i < arrayOfzcd.length; i++)
      {
        int j = arrayOfzcd[i].a;
        if ((j != 10) && (j != 13) && (!localzgs.e().c(j)))
        {
          localzgs = null;
          break;
        }
      }
      if ((i == arrayOfzcd.length) && (localzgs != null)) {
        break;
      }
    }
    return localzgs;
  }
  
  private static zgs b()
    throws Exception
  {
    zm localzm = zz.a("Aspose.Cells.geo_1.ttf");
    try
    {
      byte[] arrayOfByte = new byte[(int)localzm.h()];
      localzm.a(arrayOfByte, 0, arrayOfByte.length);
      zgu localzgu = new zgu();
      zgs localzgs1 = localzgu.a(arrayOfByte, null);
      localzgs1.e(true);
      zgs localzgs2 = localzgs1;
      return localzgs2;
    }
    finally
    {
      if (localzm != null) {
        localzm.a();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */