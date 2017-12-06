package com.aspose.cells.b.a.g;

import java.text.MessageFormat;

public final class ze
{
  public static StringBuilder a(StringBuilder paramStringBuilder, byte paramByte)
  {
    return paramStringBuilder.append(Byte.toString(paramByte));
  }
  
  public static StringBuilder a(StringBuilder paramStringBuilder, char paramChar, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      paramStringBuilder.append(paramChar);
    }
    return paramStringBuilder;
  }
  
  public static StringBuilder a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      throw new NullPointerException("oldStr");
    }
    if ("".equals(paramString1)) {
      throw new IllegalArgumentException("oldStr");
    }
    if (paramString2 == null) {
      paramString2 = "";
    }
    int i = 0;
    int j = paramString1.length();
    while ((i = paramStringBuilder.indexOf(paramString1, i)) >= 0) {
      paramStringBuilder.replace(i, i + j, paramString2);
    }
    return paramStringBuilder;
  }
  
  public static StringBuilder a(StringBuilder paramStringBuilder, String paramString, Object... paramVarArgs)
  {
    String str = MessageFormat.format(paramString, paramVarArgs);
    return paramStringBuilder.append(str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/g/ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */