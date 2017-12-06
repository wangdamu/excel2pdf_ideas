package com.aspose.cells;

import com.aspose.cells.a.c.zg;
import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zaz;
import com.aspose.cells.a.d.zbj;
import com.aspose.cells.a.d.zdh;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zc;
import com.aspose.cells.b.a.d.zd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FontConfigs
{
  private static ArrayList a = new ArrayList();
  private static ArrayList b = new ArrayList();
  private static FontSourceBase[] c = null;
  private static Object d = new Object();
  private static String e = null;
  private static HashMap f = zg.a();
  private static Object g = new Object();
  private static boolean h = false;
  
  public static String getDefaultFontName()
  {
    return e;
  }
  
  public static void setDefaultFontName(String value)
  {
    synchronized (g)
    {
      e = value;
    }
  }
  
  static boolean a()
  {
    return h;
  }
  
  public static void setFontSubstitutes(String originalFontName, String[] substituteFontNames)
  {
    synchronized (g)
    {
      f.put(originalFontName, substituteFontNames);
    }
  }
  
  public static String[] getFontSubstitutes(String originalFontName)
  {
    return (String[])f.get(originalFontName);
  }
  
  public static void setFontFolder(String fontFolder, boolean recursive)
  {
    setFontSources(new FontSourceBase[] { new FolderFontSource(fontFolder, recursive) });
  }
  
  public static void setFontFolders(String[] fontFolders, boolean recursive)
  {
    FontSourceBase[] arrayOfFontSourceBase = new FontSourceBase[fontFolders.length];
    for (int i = 0; i < arrayOfFontSourceBase.length; i++) {
      arrayOfFontSourceBase[i] = new FolderFontSource(fontFolders[i], recursive);
    }
    setFontSources(arrayOfFontSourceBase);
  }
  
  public static void setFontSources(FontSourceBase[] sources)
  {
    a(sources, false);
  }
  
  public static void setFontExclusiveSources(FontSourceBase[] exclusiveSources)
  {
    zav.a().a(false);
    a(exclusiveSources, true);
  }
  
  static void a(FontSourceBase[] paramArrayOfFontSourceBase, boolean paramBoolean)
  {
    synchronized (d)
    {
      c = paramArrayOfFontSourceBase;
    }
    a(paramBoolean);
  }
  
  public static FontSourceBase[] getFontSources()
  {
    ArrayList localArrayList = new ArrayList();
    synchronized (d)
    {
      String str;
      if ((b != null) && (b.size() > 0)) {
        try
        {
          Iterator localIterator1 = b.iterator();
          while (localIterator1.hasNext())
          {
            str = (String)localIterator1.next();
            if ((zdh.a(str)) && (zd.c(str))) {
              zf.a(localArrayList, new FileFontSource(str));
            }
          }
        }
        catch (Exception localException1) {}
      }
      if ((a != null) && (a.size() > 0)) {
        try
        {
          Iterator localIterator2 = a.iterator();
          while (localIterator2.hasNext())
          {
            str = (String)localIterator2.next();
            if ((zdh.a(str)) && (zc.a(str))) {
              zf.a(localArrayList, new FolderFontSource(str, false));
            }
          }
        }
        catch (Exception localException2) {}
      }
      if ((c != null) && (c.length > 0)) {
        for (FontSourceBase localFontSourceBase : c) {
          zf.a(localArrayList, localFontSourceBase.a());
        }
      }
    }
    ??? = new FontSourceBase[localArrayList.size()];
    for (int i = 0; i < localArrayList.size(); i++) {
      ???[i] = ((FontSourceBase)localArrayList.get(i));
    }
    return (FontSourceBase[])???;
  }
  
  static zaz[] b()
  {
    ArrayList localArrayList1 = new ArrayList();
    FontSourceBase[] arrayOfFontSourceBase = getFontSources();
    for (Object localObject2 : arrayOfFontSourceBase)
    {
      ArrayList localArrayList2 = ((FontSourceBase)localObject2).b();
      Iterator localIterator = localArrayList2.iterator();
      while (localIterator.hasNext())
      {
        zaz localzaz = (zaz)localIterator.next();
        zf.a(localArrayList1, localzaz);
      }
    }
    ??? = new zaz[localArrayList1.size()];
    for (??? = 0; ??? < localArrayList1.size(); ???++) {
      ???[???] = ((zaz)localArrayList1.get(???));
    }
    return (zaz[])???;
  }
  
  private static void a(boolean paramBoolean)
  {
    zav.a().a(b(), paramBoolean);
    zbj.l();
  }
  
  static void a(String paramString)
  {
    synchronized (d)
    {
      a = new ArrayList();
      zf.a(a, paramString);
    }
    a(false);
  }
  
  static String c()
  {
    if (a.size() == 0) {
      return "";
    }
    return (String)a.get(0);
  }
  
  static void a(ArrayList paramArrayList)
  {
    synchronized (d)
    {
      a = paramArrayList;
    }
    a(false);
  }
  
  static ArrayList d()
  {
    return a;
  }
  
  static void b(ArrayList paramArrayList)
  {
    synchronized (d)
    {
      b = paramArrayList;
    }
    a(false);
  }
  
  static ArrayList e()
  {
    return b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FontConfigs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */