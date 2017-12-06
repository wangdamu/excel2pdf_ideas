package com.aspose.cells.a.c;

import com.aspose.cells.DateTime;
import com.aspose.cells.b.a.zl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class zk
{
  private static final DateFormat a = DateFormat.getDateInstance(1);
  private static final DateFormat b = DateFormat.getTimeInstance(1);
  
  public static boolean a(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    return paramDateTime1.compareTo(paramDateTime2) >= 0;
  }
  
  public static boolean b(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    return paramDateTime1.compareTo(paramDateTime2) > 0;
  }
  
  public static boolean c(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    return paramDateTime1.compareTo(paramDateTime2) <= 0;
  }
  
  public static boolean d(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    return paramDateTime1.compareTo(paramDateTime2) < 0;
  }
  
  public static zl e(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    return paramDateTime1.a(paramDateTime2);
  }
  
  public static DateTime a(DateTime paramDateTime, zl paramzl)
  {
    return paramDateTime.a(paramzl);
  }
  
  public static boolean a(Object paramObject)
  {
    return ((paramObject instanceof DateTime)) || ((paramObject instanceof Date)) || ((paramObject instanceof Calendar));
  }
  
  public static int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case 'D': 
    case 'E': 
    case 'F': 
    case 'G': 
    case 'H': 
    case 'K': 
    case 'M': 
    case 'S': 
    case 'W': 
    case 'Z': 
    case 'a': 
    case 'd': 
    case 'h': 
    case 'k': 
    case 'm': 
    case 's': 
    case 'w': 
    case 'y': 
    case 'z': 
      return paramInt1 + 1;
    }
    return paramInt1;
  }
  
  public static String a(int paramInt, short paramShort)
  {
    if (paramInt < 3) {
      return "GG";
    }
    return "GGGG";
  }
  
  public static String a()
  {
    return "E";
  }
  
  public static String b()
  {
    return "EEEE";
  }
  
  public static void a(StringBuilder paramStringBuilder, char paramChar)
  {
    switch (paramChar)
    {
    case '\'': 
      paramStringBuilder.append("''");
      break;
    default: 
      if ((paramStringBuilder.length() > 0) && (paramStringBuilder.charAt(paramStringBuilder.length() - 1) == '\'')) {
        paramStringBuilder.setLength(paramStringBuilder.length() - 1);
      } else {
        paramStringBuilder.append('\'');
      }
      paramStringBuilder.append(paramChar);
      paramStringBuilder.append('\'');
    }
  }
  
  public static void a(StringBuilder paramStringBuilder, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if ((paramStringBuilder.length() > 0) && (paramStringBuilder.charAt(paramStringBuilder.length() - 1) == '\''))
    {
      paramStringBuilder.setLength(paramStringBuilder.length() - 1);
      i = 1;
    }
    while (paramInt1 < paramInt2)
    {
      if (paramArrayOfChar[paramInt1] == '\'')
      {
        if (i != 0) {
          paramStringBuilder.append("'''");
        } else {
          paramStringBuilder.append("''");
        }
        i = 0;
      }
      else
      {
        if (i == 0)
        {
          paramStringBuilder.append('\'');
          i = 1;
        }
        paramStringBuilder.append(paramArrayOfChar[paramInt1]);
      }
      paramInt1++;
    }
    if (i != 0) {
      paramStringBuilder.append('\'');
    }
  }
  
  public static DateTime a(String paramString)
  {
    try
    {
      return new DateTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(paramString));
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException("Invalid UTC time value: [" + paramString + "]. Required format: yyyy-MM-ddTHH:mm:ssZ");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */