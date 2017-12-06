package com.aspose.cells;

class zaoh
{
  public static boolean a(String paramString1, String paramString2)
  {
    if (paramString2 == null) {
      return false;
    }
    return (paramString1.startsWith("--")) && (paramString1.substring(2).startsWith(paramString2));
  }
  
  public static String a(String paramString)
  {
    String str = paramString.substring(paramString.indexOf(":") + 1).trim();
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaoh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */