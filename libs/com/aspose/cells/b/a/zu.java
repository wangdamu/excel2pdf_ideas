package com.aspose.cells.b.a;

import com.aspose.cells.b.a.c.za;
import java.text.NumberFormat;
import java.text.ParseException;

public class zu
{
  public static short a(String paramString, za paramza)
  {
    NumberFormat localNumberFormat = NumberFormat.getInstance(paramza.h());
    try
    {
      return ((Long)localNumberFormat.parse(paramString.trim())).shortValue();
    }
    catch (ParseException localParseException)
    {
      throw new NumberFormatException("Failed to parse string[]" + paramString + " into a number");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */