package com.aspose.cells.a.c;

import com.aspose.cells.a.e.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class zz
{
  public static zm a(String paramString)
  {
    com.aspose.cells.b.a.f.za localza = com.aspose.cells.b.a.f.za.a();
    zm localzm = localza.a(paramString);
    if (localzm == null) {
      throw new IllegalStateException(zw.a("Cannot find resource '{0}'.", new Object[] { paramString }));
    }
    return localzm;
  }
  
  public static void a(String paramString, Boolean paramBoolean, ArrayList paramArrayList)
  {
    if ((paramString == null) || (paramString.trim().length() == 0)) {
      return;
    }
    File localFile1 = new File(paramString);
    if (localFile1.exists())
    {
      File[] arrayOfFile1 = localFile1.listFiles();
      for (File localFile2 : arrayOfFile1) {
        if (localFile2.isFile()) {
          paramArrayList.add(localFile2.getAbsolutePath());
        } else if ((localFile2.isDirectory()) && (paramBoolean.booleanValue())) {
          a(localFile2.getAbsolutePath(), Boolean.valueOf(true), paramArrayList);
        }
      }
    }
  }
  
  public static ArrayList a()
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      a("c:\\windows\\fonts\\", Boolean.valueOf(false), localArrayList);
      a("c:\\winnt\\fonts\\", Boolean.valueOf(false), localArrayList);
      a("/usr/share/fonts", Boolean.valueOf(true), localArrayList);
      a("/usr/local/share/fonts", Boolean.valueOf(true), localArrayList);
      a("/Library/Fonts", Boolean.valueOf(false), localArrayList);
      String str1 = com.aspose.cells.a.za.a("com.aspose.cells.fontdir");
      if (str1 != null) {
        a(str1, Boolean.valueOf(false), localArrayList);
      }
      String str2 = com.aspose.cells.a.za.a("java.home");
      if (str2 != null) {
        a(str2 + "/lib/fonts", Boolean.valueOf(false), localArrayList);
      }
      switch (2)
      {
      case 1: 
      case 2: 
        if (com.aspose.cells.a.za.c < 3)
        {
          String str3 = com.aspose.cells.a.za.a("java.vendor");
          if ((str3 == null) || (str3.startsWith("Sun ")))
          {
            str3 = com.aspose.cells.a.za.a("Aspose.Cells.Disable");
            if ((str3 == null) || (str3.indexOf("SunFontManager") < 0)) {
              try
              {
                Class localClass = Class.forName("sun.font.FontManager");
                Method localMethod = localClass.getMethod("getFontPath", new Class[] { Boolean.TYPE });
                String str4 = (String)localMethod.invoke(null, new Object[] { Boolean.TRUE });
                if (str4 != null) {
                  for (String str5 : str4.split(File.pathSeparator)) {
                    a(str5, Boolean.valueOf(false), localArrayList);
                  }
                }
              }
              catch (Throwable localThrowable)
              {
                zf.a("SunFontManager Error", localThrowable);
              }
            }
          }
        }
        break;
      }
    }
    catch (Exception localException) {}
    return localArrayList;
  }
  
  public static String b(String paramString)
  {
    return com.aspose.cells.a.za.a(paramString);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */