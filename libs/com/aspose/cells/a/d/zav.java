package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zz;
import com.aspose.cells.b.a.a.zf;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

public class zav
{
  private Object a = new Object();
  private zaz[] b;
  private zaz[] c;
  private boolean d = true;
  private boolean e = false;
  private zaw f;
  private static zav g = new zav();
  
  private zav()
  {
    try
    {
      zaz[] arrayOfzaz = b();
      if (arrayOfzaz != null) {
        synchronized (this.a)
        {
          this.c = arrayOfzaz;
          this.f = null;
          this.d = false;
          this.e = true;
        }
      }
    }
    catch (Exception localException) {}
  }
  
  private static zaz[] b()
  {
    String str1 = zz.b("Aspose.Cells.FontDirExc");
    if ((str1 == null) || (str1.trim().length() == 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    zz.a(str1, Boolean.valueOf(false), localArrayList);
    zaz[] arrayOfzaz = new zaz[localArrayList.size()];
    int i = 0;
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      arrayOfzaz[(i++)] = new zau(str2);
    }
    return arrayOfzaz;
  }
  
  private void c()
  {
    ArrayList localArrayList = zz.a();
    this.b = new zaz[localArrayList.size()];
    int i = 0;
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.b[(i++)] = new zau(str);
    }
  }
  
  private zaw d()
  {
    if (this.f == null) {
      synchronized (this.a)
      {
        if (this.f == null) {
          this.f = e();
        }
      }
    }
    return this.f;
  }
  
  private zaw e()
  {
    ArrayList localArrayList = new ArrayList();
    zaz localzaz;
    if (this.d)
    {
      if (this.b == null) {
        c();
      }
      if (this.b != null) {
        for (localzaz : this.b) {
          zf.a(localArrayList, localzaz);
        }
      }
    }
    if (this.c != null) {
      for (localzaz : this.c) {
        zf.a(localArrayList, localzaz);
      }
    }
    ??? = new zaz[localArrayList.size()];
    for (??? = 0; ??? < localArrayList.size(); ???++) {
      ???[???] = ((zaz)localArrayList.get(???));
    }
    return new zax(???);
  }
  
  public zgs a(String paramString, int paramInt, boolean paramBoolean)
    throws Exception
  {
    zgs localzgs = null;
    try
    {
      localzgs = d().a(d().a(paramString), paramInt, paramBoolean);
    }
    catch (Exception localException)
    {
      localzgs = null;
    }
    return localzgs;
  }
  
  public zgs b(String paramString, int paramInt, boolean paramBoolean)
    throws Exception
  {
    return d().b(paramString, paramInt, paramBoolean);
  }
  
  public Font a(String paramString, int paramInt, float paramFloat, boolean paramBoolean)
    throws Exception
  {
    return d().a(paramString, paramInt, paramFloat, paramBoolean);
  }
  
  public boolean a(String paramString1, int paramInt, String paramString2)
    throws Exception
  {
    return a(paramString1, paramInt, paramString2, false);
  }
  
  public boolean a(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
    throws Exception
  {
    zgs localzgs = a(paramString1, paramInt, false);
    if (null == localzgs) {
      return false;
    }
    if ((paramBoolean) && ((paramInt & 0x1) != 0) && ((localzgs.f() & 0x1) == 0)) {
      return false;
    }
    zcd[] arrayOfzcd = zce.a().a(paramString2);
    for (int i = 0; i < arrayOfzcd.length; i++)
    {
      int j = arrayOfzcd[i].a;
      if ((j != 10) && (j != 13) && (!localzgs.e().c(j))) {
        return false;
      }
    }
    return true;
  }
  
  public zgs a(int paramInt1, int paramInt2)
    throws Exception
  {
    return d().a(paramInt1, paramInt2);
  }
  
  public zgs a(int paramInt, String paramString)
    throws Exception
  {
    return d().a(paramInt, paramString);
  }
  
  public String a(String paramString)
  {
    return d().a(paramString);
  }
  
  public void a(zaz[] paramArrayOfzaz, boolean paramBoolean)
  {
    if ((!this.e) || (paramBoolean)) {
      synchronized (this.a)
      {
        this.c = paramArrayOfzaz;
        this.e = true;
        this.f = null;
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if ((!this.e) && (paramBoolean != this.d)) {
      synchronized (this.a)
      {
        if (paramBoolean != this.d)
        {
          this.d = paramBoolean;
          this.f = null;
        }
      }
    }
  }
  
  public static zav a()
  {
    return g;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */