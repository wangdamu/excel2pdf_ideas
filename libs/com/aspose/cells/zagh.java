package com.aspose.cells;

class zagh
{
  public static int a(String paramString)
  {
    for (int i = 0; i < paramString.length(); i++)
    {
      int j = paramString.charAt(i);
      if ((j >= 48) && (j <= 57)) {
        return zauj.F(paramString.substring(i)) - 1;
      }
    }
    return -1;
  }
  
  public static int b(String paramString)
  {
    int i = 0;
    for (int j = 0; j < paramString.length(); j++)
    {
      int k = paramString.charAt(j);
      if ((k < 65) || (k > 90)) {
        break;
      }
      i = i * 26 + k - 65 + 1;
    }
    return i - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */