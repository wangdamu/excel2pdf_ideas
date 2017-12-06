package com.aspose.cells.b.a;

import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.g.ze;

public class zw
{
  public static String a = "";
  static final char[] b = { '\t', '\n', '\013', '\f', '\r', ' ', '', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '​', ' ', ' ', '　', 65279 };
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    if (paramString3 == null) {
      return paramString1.replace(paramString2, "");
    }
    return paramString1.replace(paramString2, paramString3);
  }
  
  public static String a(String paramString, int paramInt, char paramChar)
  {
    if (paramInt < paramString.length()) {
      throw new IllegalArgumentException("m$String->padLeft. totalWidth < str.length()");
    }
    StringBuffer localStringBuffer = new StringBuffer(paramInt);
    for (int i = 0; i < paramInt - paramString.length(); i++) {
      localStringBuffer.append(paramChar);
    }
    localStringBuffer.append(paramString);
    return localStringBuffer.toString();
  }
  
  public static int a(String paramString1, String paramString2)
  {
    return paramString1.compareTo(paramString2);
  }
  
  public static String a(String paramString)
  {
    for (int i = paramString.length(); (i > 0) && (a(b, paramString.charAt(i - 1))); i--) {}
    return i < paramString.length() ? paramString.substring(0, i) : paramString;
  }
  
  public static boolean b(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
  
  public static String a(String paramString, Object... paramVarArgs)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("format");
    }
    if (paramVarArgs == null) {
      paramVarArgs = new Object[] { null };
    }
    StringBuilder localStringBuilder = new StringBuilder(paramString.length() + paramVarArgs.length * 8);
    ze.a(localStringBuilder, paramString, paramVarArgs);
    return localStringBuilder.toString();
  }
  
  public static boolean b(String paramString1, String paramString2)
  {
    if (paramString1 == paramString2) {
      return true;
    }
    return (paramString1 != null) && (paramString2 != null) && (paramString1.equals(paramString2));
  }
  
  public static int c(String paramString1, String paramString2)
  {
    if (paramString1 == paramString2) {
      return 0;
    }
    if (paramString1 == null) {
      return -1;
    }
    if (paramString2 == null) {
      return 1;
    }
    return paramString1.compareTo(paramString2);
  }
  
  public static int a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return c(paramString1, paramString2);
    }
    if (paramString1 == paramString2) {
      return 0;
    }
    if (paramString1 == null) {
      return -1;
    }
    if (paramString2 == null) {
      return 1;
    }
    return paramString1.compareToIgnoreCase(paramString2);
  }
  
  public static int a(String paramString1, String paramString2, boolean paramBoolean, za paramza)
  {
    return a(paramString1, paramString2, paramBoolean);
  }
  
  public static String a(char paramChar, int paramInt)
  {
    if ((!c) && (paramInt < 0)) {
      throw new AssertionError("count must be greter than zero, but count = " + paramInt);
    }
    if (paramInt == 0) {
      return "";
    }
    char[] arrayOfChar = new char[paramInt];
    for (int i = 0; i < paramInt; i++) {
      arrayOfChar[i] = paramChar;
    }
    return new String(arrayOfChar);
  }
  
  public static String a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt1 + paramInt2 > paramString.length()) {
      throw new IndexOutOfBoundsException("String length = " + paramString.length() + ", but startIndex = " + paramInt1 + " and count = " + paramInt2);
    }
    return new StringBuilder(paramString).delete(paramInt1, paramInt1 + paramInt2).toString();
  }
  
  public static void a(String paramString, int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3)
  {
    paramString.getChars(paramInt1, paramInt1 + paramInt3, paramArrayOfChar, paramInt2);
  }
  
  public static int a(String paramString, char[] paramArrayOfChar)
  {
    for (int i = 0; i < paramArrayOfChar.length; i++)
    {
      int j = paramString.indexOf(paramArrayOfChar[i]);
      if (j >= 0) {
        return j;
      }
    }
    return -1;
  }
  
  public static String a(String paramString, char paramChar)
  {
    int i = paramString.length();
    for (int j = 0; (j < i) && (paramString.charAt(j) == paramChar); j++) {}
    return j > 0 ? paramString.substring(j) : paramString;
  }
  
  public static String c(String paramString)
  {
    return b(paramString, b);
  }
  
  public static String b(String paramString, char[] paramArrayOfChar)
  {
    int i = paramString.length();
    for (int j = 0; (j < i) && (a(paramArrayOfChar, paramString.charAt(j))); j++) {}
    return j > 0 ? paramString.substring(j) : paramString;
  }
  
  public static String b(String paramString, char paramChar)
  {
    for (int i = paramString.length(); (i > 0) && (paramString.charAt(i - 1) == paramChar); i--) {}
    return i < paramString.length() ? paramString.substring(0, i) : paramString;
  }
  
  public static String c(String paramString, char paramChar)
  {
    int i = paramString.length();
    for (int j = 0; (j < i) && (paramString.charAt(j) == paramChar); j++) {}
    while ((j < i) && (paramString.charAt(i - 1) == paramChar)) {
      i--;
    }
    return (j > 0) || (i < paramString.length()) ? paramString.substring(j, i) : paramString;
  }
  
  public static String c(String paramString, char[] paramArrayOfChar)
  {
    int i = paramString.length();
    for (int j = 0; (j < i) && (a(paramArrayOfChar, paramString.charAt(j))); j++) {}
    while ((j < i) && (a(paramArrayOfChar, paramString.charAt(i - 1)))) {
      i--;
    }
    return (j > 0) || (i < paramString.length()) ? paramString.substring(j, i) : paramString;
  }
  
  private static boolean a(char[] paramArrayOfChar, char paramChar)
  {
    for (int i = 0; i < paramArrayOfChar.length; i++) {
      if (paramArrayOfChar[i] == paramChar) {
        return true;
      }
    }
    return false;
  }
  
  public static String[] d(String paramString, char paramChar)
  {
    int[] arrayOfInt = new int[paramString.length()];
    int i = 0;
    for (int j = 0; j < paramString.length(); j++) {
      if (paramString.charAt(j) == paramChar) {
        arrayOfInt[(i++)] = j;
      }
    }
    String[] arrayOfString = new String[i + 1];
    if (i == 0)
    {
      arrayOfString[0] = paramString;
      return arrayOfString;
    }
    int k = 0;
    int m = 0;
    for (int n = 0; n < i; n++)
    {
      int i1 = arrayOfInt[n];
      arrayOfString[(k++)] = paramString.substring(m, i1);
      m = i1 + 1;
    }
    arrayOfString[k] = paramString.substring(m, paramString.length());
    return arrayOfString;
  }
  
  public static String[] d(String paramString, char[] paramArrayOfChar)
  {
    return a(paramString, paramArrayOfChar, Integer.MAX_VALUE);
  }
  
  public static String[] a(String paramString, char[] paramArrayOfChar, int paramInt)
  {
    if ((!c) && (paramInt < 0)) {
      throw new AssertionError();
    }
    if (paramInt == 0) {
      return new String[0];
    }
    if (paramInt == 1) {
      return new String[] { paramString };
    }
    int[] arrayOfInt = new int[paramString.length()];
    int i = 0;
    int j;
    if ((paramArrayOfChar == null) || (paramArrayOfChar.length == 0)) {
      for (j = 0; j < paramString.length(); j++) {
        if (zd.a(paramString.charAt(j)))
        {
          arrayOfInt[(i++)] = j;
          if (i >= paramInt - 1) {
            break;
          }
        }
      }
    } else {
      for (j = 0; j < paramString.length(); j++)
      {
        for (k = 0; k < paramArrayOfChar.length; k++) {
          if (paramString.charAt(j) == paramArrayOfChar[k])
          {
            arrayOfInt[(i++)] = j;
            break;
          }
        }
        if (i >= paramInt - 1) {
          break;
        }
      }
    }
    String[] arrayOfString = new String[i + 1];
    if (i == 0)
    {
      arrayOfString[0] = paramString;
      return arrayOfString;
    }
    int k = 0;
    int m = 0;
    for (int n = 0; n < i; n++)
    {
      int i1 = arrayOfInt[n];
      arrayOfString[(k++)] = paramString.substring(m, i1);
      m = i1 + 1;
    }
    arrayOfString[k] = paramString.substring(m, paramString.length());
    return arrayOfString;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */