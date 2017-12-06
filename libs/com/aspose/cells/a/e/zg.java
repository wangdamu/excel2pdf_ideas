package com.aspose.cells.a.e;

public class zg
{
  public static void a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      throw new RuntimeException(b(paramString2));
    }
  }
  
  public static boolean a(String paramString)
  {
    return (paramString != null) && (paramString.length() != 0);
  }
  
  public static void b(String paramString1, String paramString2)
  {
    if (!a(paramString1)) {
      throw new RuntimeException(b(paramString2));
    }
  }
  
  private static String b(String paramString)
  {
    return paramString + " cann't be null.";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/e/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */