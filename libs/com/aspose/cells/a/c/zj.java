package com.aspose.cells.a.c;

import com.aspose.cells.b.a.c.za;
import com.aspose.cells.zamr;
import java.util.Locale;

public class zj
{
  public static za a(int paramInt)
  {
    return new za(b((short)paramInt));
  }
  
  public static Locale b(int paramInt)
  {
    return b(zamr.d(paramInt));
  }
  
  public static Locale a(za paramza)
  {
    return paramza == null ? null : paramza.h();
  }
  
  public static za a(Locale paramLocale)
  {
    return new za(paramLocale);
  }
  
  public static za a(short paramShort)
  {
    return new za(paramShort & 0xFFFF, true);
  }
  
  public static Locale b(short paramShort)
  {
    String str = zamr.b(paramShort);
    if (str == null)
    {
      paramShort = zamr.a(paramShort);
      if (paramShort == 0) {
        return Locale.getDefault();
      }
      str = zamr.b(paramShort);
      if (str == null) {
        return Locale.getDefault();
      }
    }
    String[] arrayOfString = str.split("-");
    switch (arrayOfString.length)
    {
    case 2: 
      return new Locale(arrayOfString[0], arrayOfString[1]);
    case 3: 
      return new Locale(arrayOfString[0], arrayOfString[2], arrayOfString[1]);
    }
    return new Locale(str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */