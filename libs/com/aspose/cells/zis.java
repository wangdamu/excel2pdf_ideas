package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zcn;
import com.aspose.cells.a.d.zhb;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class zis
  extends zhb
{
  private static String a = "EUDC";
  private String b = null;
  private String c = null;
  
  public zis()
  {
    this(null, null);
  }
  
  public zis(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public String a(String paramString)
  {
    boolean bool = zax.b(paramString);
    if (!bool) {
      return paramString;
    }
    try
    {
      ArrayList localArrayList = new ArrayList();
      zqb localzqb1 = new zqb();
      localzqb1.a = paramString;
      localzqb1.b = null;
      zf.a(localArrayList, localzqb1);
      zcr localzcr = new zcr();
      localzcr.a(localArrayList, bool);
      paramString = "";
      Collections.reverse(localArrayList);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        zqb localzqb2 = (zqb)localIterator.next();
        paramString = paramString + localzqb2.a;
      }
      return paramString;
    }
    catch (Exception localException) {}
    return paramString;
  }
  
  public String a(String paramString1, int paramInt, boolean paramBoolean, String paramString2)
    throws Exception
  {
    if (zav.a().a(a, paramInt, paramString2, false)) {
      return a;
    }
    String[] arrayOfString = FontConfigs.getFontSubstitutes(paramString1);
    if (arrayOfString == null) {
      arrayOfString = FontConfigs.getFontSubstitutes(zav.a().a(paramString1));
    }
    if (arrayOfString != null) {
      for (String str2 : arrayOfString) {
        if (zav.a().a(str2, paramInt, paramString2, paramBoolean)) {
          return str2;
        }
      }
    }
    if (FontConfigs.a()) {
      try
      {
        ??? = new zh(paramString1);
        return ((zh)???).b();
      }
      catch (Exception localException) {}
    }
    if ((this.b != null) && (zav.a().a(this.b, paramInt, paramString2, paramBoolean))) {
      return this.b;
    }
    if ((this.c != null) && (zav.a().a(this.c, paramInt, paramString2, paramBoolean))) {
      return this.c;
    }
    String str1 = FontConfigs.getDefaultFontName();
    if ((str1 != null) && (zav.a().a(str1, paramInt, paramString2, paramBoolean))) {
      return str1;
    }
    if (zav.a().a(zcn.a, paramInt, paramString2, paramBoolean)) {
      return zcn.a;
    }
    if ((paramBoolean) && (zav.a().a(zcn.d, paramInt, paramString2, paramBoolean))) {
      return zcn.d;
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */