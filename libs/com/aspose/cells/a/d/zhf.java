package com.aspose.cells.a.d;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

public class zhf
{
  private static char[] a = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
  
  public static boolean a(String paramString)
  {
    return paramString.indexOf(":/") > 0;
  }
  
  public static boolean b(String paramString)
  {
    return (c(paramString)) || (d(paramString));
  }
  
  public static boolean c(String paramString)
  {
    return (paramString.length() > 2) && (a(paramString.charAt(0))) && (paramString.charAt(1) == ':') && (paramString.charAt(2) == '\\');
  }
  
  public static boolean d(String paramString)
  {
    return paramString.startsWith("\\\\");
  }
  
  private static boolean a(char paramChar)
  {
    return ((paramChar >= 'a') && (paramChar <= 'z')) || ((paramChar >= 'A') && (paramChar <= 'Z'));
  }
  
  public static String a(String paramString1, String paramString2)
  {
    if (!zdh.a(paramString1)) {
      return paramString2;
    }
    String str;
    if (paramString1.indexOf("/") != -1) {
      str = "/";
    } else {
      str = "\\";
    }
    if (paramString1.endsWith(str)) {
      return paramString1 + paramString2;
    }
    return paramString1 + str + paramString2;
  }
  
  public static boolean e(String paramString)
  {
    return paramString.startsWith("#");
  }
  
  public static String f(String paramString)
  {
    return h(paramString) ? g(paramString) : paramString;
  }
  
  public static String g(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      if (b(c)) {
        localStringBuilder.append(c(c));
      } else {
        localStringBuilder.append(c);
      }
    }
    return zs.a(localStringBuilder);
  }
  
  private static boolean b(char paramChar)
  {
    return " <>{}|^[]`\"%".indexOf(paramChar) >= 0;
  }
  
  private static boolean h(String paramString)
  {
    if (!zdh.a(paramString)) {
      return false;
    }
    if ((c(paramString)) || (d(paramString))) {
      return false;
    }
    if (zw.a(paramString, " <>{}|^[]`\"".toCharArray()) >= 0) {
      return true;
    }
    for (int i = 0; i < paramString.length(); i++) {
      if ((paramString.charAt(i) == '%') && (i + 2 < paramString.length()) && (!i(paramString.substring(i, i + 3)))) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean i(String paramString)
  {
    if ((paramString.length() != 3) || (paramString.charAt(0) != '%') || (!zdh.b(paramString.charAt(1))) || (!zdh.b(paramString.charAt(2)))) {
      return false;
    }
    return " <>{}|^[]`\"%".indexOf(j(paramString)) >= 0;
  }
  
  private static char j(String paramString)
  {
    return (char)(zdh.a(paramString.charAt(1)) * 16 + zdh.a(paramString.charAt(2)));
  }
  
  private static String c(char paramChar)
  {
    StringBuilder localStringBuilder = new StringBuilder(3);
    localStringBuilder.setLength(3);
    localStringBuilder.setCharAt(0, '%');
    localStringBuilder.setCharAt(1, a[((paramChar & 0xF0) >> '\004')]);
    localStringBuilder.setCharAt(2, a[(paramChar & 0xF)]);
    return zs.a(localStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */