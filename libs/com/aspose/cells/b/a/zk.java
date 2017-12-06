package com.aspose.cells.b.a;

import com.aspose.cells.a.e.zg;

public class zk
{
  public static long a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    zg.a(paramString, "s");
    int i = paramArrayOfInt[0];
    int j;
    if (paramInt2 == 8192) {
      j = a(paramString, paramInt1, i);
    } else {
      j = paramString.length();
    }
    paramString = paramString.substring(i, j);
    paramArrayOfInt[0] = j;
    return Long.parseLong(paramString, paramInt1);
  }
  
  private static int a(String paramString, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (paramString.charAt(0) == '-') {
      i++;
    }
    while ((i < paramString.length()) && (Character.digit(paramString.charAt(i), paramInt1) != -1)) {
      i++;
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */