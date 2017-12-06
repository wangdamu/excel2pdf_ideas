package com.aspose.cells.b.a;

import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.c.zc;

public class zv
{
  public static String a(float paramFloat)
  {
    if ((float)paramFloat == paramFloat) {
      return Long.toString(paramFloat);
    }
    String str = Float.toString(paramFloat);
    if (str.indexOf('.') > -1)
    {
      char c = za.a().d().c().charAt(0);
      if (c != '.') {
        str = str.replace('.', c);
      }
    }
    return str;
  }
  
  public static boolean b(float paramFloat)
  {
    return (Float.isInfinite(paramFloat)) && (paramFloat > 0.0F);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */