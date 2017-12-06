package com.aspose.cells.a.d;

public class zbd
{
  public static boolean a(String paramString)
  {
    return (0 <= paramString.indexOf("Symbol")) || (0 <= paramString.indexOf("Webdings")) || (0 <= paramString.indexOf("Wingdings")) || (0 <= paramString.indexOf("Dingbats"));
  }
  
  public static int a(int paramInt)
  {
    return b(paramInt) ? paramInt - 61440 : paramInt;
  }
  
  public static boolean b(int paramInt)
  {
    return (paramInt >= 61472) && (paramInt <= 61695);
  }
  
  public static int c(int paramInt)
  {
    return b(paramInt) ? paramInt : paramInt + 61440;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */