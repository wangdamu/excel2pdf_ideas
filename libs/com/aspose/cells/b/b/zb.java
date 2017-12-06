package com.aspose.cells.b.b;

import com.aspose.cells.b.a.zw;

public class zb
{
  public static String a = "﻿";
  
  public static String a(int paramInt1, int paramInt2)
  {
    if ((!b) && (paramInt2 <= 0)) {
      throw new AssertionError();
    }
    String str = Integer.toString(paramInt1);
    return a(str, paramInt2);
  }
  
  private static String a(String paramString, int paramInt)
  {
    int i = paramString.length();
    if (i == paramInt) {
      return paramString;
    }
    if (i < paramInt) {
      return zw.a('0', paramInt - i) + paramString;
    }
    return paramString.substring(i - paramInt, i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/b/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */