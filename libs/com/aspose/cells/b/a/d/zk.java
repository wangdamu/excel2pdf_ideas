package com.aspose.cells.b.a.d;

import com.aspose.cells.a.e.zg;
import com.aspose.cells.a.e.zj;
import java.io.File;
import java.io.IOException;

public final class zk
{
  public static final char a = File.separatorChar;
  public static final String b = File.separator;
  private static final char[] c = { '"', '<', '>', '|', '\000', '\001', '\002', '\003', '\004', '\005', '\006', '\007', '\b', '\t', '\n', '\013', '\f', '\r', '\016', '\017', '\020', '\021', '\022', '\023', '\024', '\025', '\026', '\027', '\030', '\031', '\032', '\033', '\034', '\035', '\036', '\037' };
  private static String d;
  
  public static String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.indexOf(":");
    if (i != -1) {
      return paramString.substring(0, i + 1) + b;
    }
    if ((paramString.charAt(0) == '/') || (paramString.charAt(0) == '\\')) {
      return b;
    }
    return "";
  }
  
  public static String b(String paramString)
  {
    if (!zg.a(paramString)) {
      return "";
    }
    char c1 = paramString.charAt(paramString.length() - 1);
    if (a(c1)) {
      return "";
    }
    File localFile = new File(paramString);
    return localFile.getName();
  }
  
  public static String c(String paramString)
  {
    if (!zg.a(paramString)) {
      return "";
    }
    char c1 = paramString.charAt(paramString.length() - 1);
    if (a(c1)) {
      return "";
    }
    File localFile = new File(paramString);
    String str = localFile.getName();
    int i = str.lastIndexOf('.');
    if (i > 0) {
      return str.substring(0, i);
    }
    return str;
  }
  
  public static String d(String paramString)
  {
    if (!zg.a(paramString)) {
      return "";
    }
    File localFile = new File(paramString);
    String str = localFile.getName();
    int i = str.lastIndexOf('.');
    if (i > 0) {
      return str.substring(i);
    }
    if (i == 0) {
      return str;
    }
    return "";
  }
  
  public static String e(String paramString)
  {
    if (!zg.a(paramString)) {
      return "";
    }
    File localFile = new File(paramString);
    char c1 = paramString.charAt(paramString.length() - 1);
    if ((a(c1)) && (zg.a(localFile.getName()))) {
      return localFile.getPath();
    }
    String str = localFile.getParent();
    return str == null ? "" : str;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      throw new NullPointerException("parent");
    }
    if (paramString2 == null) {
      throw new NullPointerException("child");
    }
    if (zj.a(paramString2)) {
      return paramString2;
    }
    if ("".equals(paramString1)) {
      paramString1 = null;
    }
    try
    {
      File localFile = new File(paramString1, paramString2);
      if (localFile.isAbsolute()) {
        return localFile.getCanonicalPath();
      }
      return localFile.getPath();
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException);
    }
  }
  
  public static String a()
  {
    if (d == null) {
      d = System.getProperty("java.io.tmpdir");
    }
    return d;
  }
  
  public static boolean f(String paramString)
  {
    return new File(paramString).isAbsolute();
  }
  
  private static boolean a(char paramChar)
  {
    return (paramChar == '\\') || (paramChar == '/');
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */