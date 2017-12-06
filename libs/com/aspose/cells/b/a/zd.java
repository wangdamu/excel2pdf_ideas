package com.aspose.cells.b.a;

public final class zd
{
  public static boolean a(char paramChar)
  {
    if ((paramChar <= 'ÿ') && ((paramChar == ' ') || ((paramChar >= '\t') && (paramChar <= '\r')) || (paramChar == ' ') || (paramChar == ''))) {
      return true;
    }
    switch (Character.getType(paramChar))
    {
    case 12: 
    case 13: 
    case 14: 
      return true;
    }
    return false;
  }
  
  public static boolean a(String paramString, int paramInt)
  {
    if (paramString == null) {
      throw new NullPointerException("s");
    }
    if (paramInt >= paramString.length()) {
      throw new RuntimeException("index");
    }
    return a(paramString.charAt(paramInt));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */