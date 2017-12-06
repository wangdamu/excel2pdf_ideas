package com.aspose.cells.a.d;

import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.za;

public class zgk
{
  public static String a(String paramString)
  {
    if (!ze.b(paramString, "[\\uFB50-\\uFDFF\\uFE70-\\uFEFF\\u0590-\\u05FF]+", 66)) {
      return paramString;
    }
    String str = paramString;
    char[] arrayOfChar1 = str.toCharArray();
    str = "";
    za.a(arrayOfChar1);
    for (char c : arrayOfChar1) {
      str = str + c;
    }
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */