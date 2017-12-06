package com.aspose.cells.b.a.b;

import com.aspose.cells.Color;

public class zf
{
  public static Color a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.startsWith("#")) {
      return b(paramString);
    }
    return Color.a(paramString);
  }
  
  private static Color b(String paramString)
  {
    try
    {
      int i = 0;
      if (paramString.length() == 4)
      {
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append(paramString.charAt(0));
        localStringBuffer.append(paramString.charAt(1));
        localStringBuffer.append(paramString.charAt(1));
        localStringBuffer.append(paramString.charAt(2));
        localStringBuffer.append(paramString.charAt(2));
        localStringBuffer.append(paramString.charAt(3));
        localStringBuffer.append(paramString.charAt(3));
        paramString = localStringBuffer.toString();
      }
      if (paramString.startsWith("#")) {
        i = 1;
      }
      int j = Integer.parseInt(paramString.substring(i, i + 2), 16);
      int k = Integer.parseInt(paramString.substring(i + 2, i + 4), 16);
      int m = Integer.parseInt(paramString.substring(i + 4), 16);
      return Color.fromArgb(j, k, m);
    }
    catch (Exception localException) {}
    return Color.fromArgb(255, 255, 255);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */