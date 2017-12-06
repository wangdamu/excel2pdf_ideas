package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.zs;

class zbxt
{
  static boolean a(String paramString)
  {
    return (paramString.startsWith("http://")) || (paramString.startsWith("https://")) || (paramString.startsWith("file://")) || (paramString.startsWith("ftp://"));
  }
  
  static String b(String paramString)
  {
    paramString = d(paramString);
    if ((paramString.length() > 1) && (paramString.charAt(1) == ':')) {
      paramString = "file:///" + paramString;
    }
    return paramString;
  }
  
  static String c(String paramString)
  {
    paramString = e(paramString);
    if ((paramString != null) && (paramString.startsWith("file:///"))) {
      paramString = paramString.substring("file:///".length());
    }
    return paramString;
  }
  
  static String d(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    char[] arrayOfChar = paramString.toCharArray();
    for (int i = 0; i < arrayOfChar.length; i++) {
      switch (arrayOfChar[i])
      {
      case ' ': 
      case '"': 
      case '[': 
      case ']': 
      case '{': 
      case '}': 
        if ((i >= 2) && (arrayOfChar[(i - 1)] == '\\') && (arrayOfChar[(i - 2)] == '\\'))
        {
          localStringBuilder.append(arrayOfChar[i]);
        }
        else
        {
          localStringBuilder.append('%');
          localStringBuilder.append(zp.b(arrayOfChar[i]));
        }
        break;
      default: 
        localStringBuilder.append(arrayOfChar[i]);
      }
    }
    return zs.a(localStringBuilder);
  }
  
  static String e(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    char[] arrayOfChar = paramString.toCharArray();
    for (int i = 0; i < arrayOfChar.length; i++) {
      if ((arrayOfChar[i] == '%') && (i + 2 < arrayOfChar.length))
      {
        if ((zarb.a(arrayOfChar[(i + 1)])) && (zarb.a(arrayOfChar[(i + 2)])))
        {
          int j = (zarb.b(arrayOfChar[(i + 1)]) << 4) + zarb.b(arrayOfChar[(i + 2)]);
          if (j > 127)
          {
            localStringBuilder.append(arrayOfChar[i]);
          }
          else
          {
            localStringBuilder.append((char)j);
            i += 2;
          }
        }
        else
        {
          localStringBuilder.append(arrayOfChar[i]);
        }
      }
      else {
        localStringBuilder.append(arrayOfChar[i]);
      }
    }
    return zs.a(localStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */