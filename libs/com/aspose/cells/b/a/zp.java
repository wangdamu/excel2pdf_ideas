package com.aspose.cells.b.a;

import com.aspose.cells.b.a.c.za;
import java.text.NumberFormat;
import java.text.ParseException;

public class zp
{
  public static int a(String paramString)
  {
    int i = paramString.indexOf(".");
    if (i == -1) {
      return Integer.parseInt(paramString);
    }
    double d = Double.parseDouble(paramString);
    if (d == d) {
      return (int)d;
    }
    throw new NumberFormatException("Failed to parse int:" + paramString);
  }
  
  public static int a(String paramString, int paramInt)
  {
    int i = 10;
    if ((paramInt == 7) || (paramInt == 111)) {
      i = 10;
    } else if ((paramInt == 515) || (paramInt == 512)) {
      i = 16;
    } else {
      throw new IllegalArgumentException("NumberStyle {}" + Integer.toString(paramInt) + " not supported");
    }
    return (int)Long.parseLong(paramString.trim(), i);
  }
  
  public static int a(String paramString, int paramInt, za paramza)
  {
    return a(paramString, paramInt);
  }
  
  public static int a(String paramString, za paramza)
  {
    try
    {
      if (paramza.c()) {
        return Integer.parseInt(paramString.trim());
      }
      NumberFormat localNumberFormat = NumberFormat.getInstance(paramza.h());
      return ((Long)localNumberFormat.parse(paramString.trim())).intValue();
    }
    catch (ParseException localParseException)
    {
      throw new NumberFormatException("Failed to parse string[]" + paramString + " into a number");
    }
  }
  
  public static String a(int paramInt)
  {
    return Integer.toString(paramInt);
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return 0;
    }
    if (paramInt1 > paramInt2) {
      return 1;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */