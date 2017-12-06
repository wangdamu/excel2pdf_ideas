package com.aspose.cells.b.a;

import com.aspose.cells.b.a.c.za;
import java.text.NumberFormat;
import java.text.ParseException;

public class zq
{
  public static long a(String paramString, za paramza)
  {
    try
    {
      if (paramza.c()) {
        return Long.parseLong(paramString.trim());
      }
      NumberFormat localNumberFormat = NumberFormat.getInstance(paramza.h());
      return ((Long)localNumberFormat.parse(paramString.trim())).longValue();
    }
    catch (ParseException localParseException)
    {
      throw new NumberFormatException("Failed to parse string[]" + paramString + " into a number");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */