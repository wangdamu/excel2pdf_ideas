package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.zw;

class zabq
{
  public static void a(zwp paramzwp, zahh paramzahh)
  {
    paramzahh.a("ExternalSheet");
    paramzahh.a(zi.a(paramzwp.b & 0xFFFF));
    if (paramzwp.c != paramzwp.b)
    {
      paramzahh.a(":");
      paramzahh.a(zi.a(paramzwp.c & 0xFFFF));
    }
  }
  
  public static void a(zaah paramzaah, zwp paramzwp, zahh paramzahh)
  {
    WorksheetCollection localWorksheetCollection = paramzaah.u;
    int i = paramzwp.a & 0xFFFF;
    if (i != localWorksheetCollection.v())
    {
      a(paramzaah, i, paramzwp.b & 0xFFFF, paramzwp.c & 0xFFFF, paramzahh);
      return;
    }
    int j = paramzwp.b & 0xFFFF;
    if (j == 65535)
    {
      paramzahh.a("#REF");
      return;
    }
    String str = null;
    if (j != 65534)
    {
      if (j < localWorksheetCollection.getCount())
      {
        str = localWorksheetCollection.get(j).getName();
        if ((j != (paramzwp.c & 0xFFFF)) && ((paramzwp.c & 0xFFFF) < localWorksheetCollection.getCount())) {
          str = str + ":" + localWorksheetCollection.get(paramzwp.c & 0xFFFF).getName();
        }
      }
      else
      {
        paramzahh.a("#REF");
      }
    }
    else
    {
      str = paramzaah.t.getFileName();
      if (str == null) {
        str = "Workbook.xls";
      }
    }
    if ((paramzaah.n == 14) && (paramzaah.a == 1)) {
      paramzahh.a('$');
    }
    paramzahh.a(paramzaah.b(str));
  }
  
  public static void a(zaah paramzaah, int paramInt1, int paramInt2, int paramInt3, zahh paramzahh)
  {
    WorksheetCollection localWorksheetCollection = paramzaah.u;
    zbti localzbti = localWorksheetCollection.w().a(paramInt1);
    if (paramInt2 == 65535)
    {
      paramzahh.a("#REF");
      return;
    }
    String str1 = null;
    if (paramInt2 != 65534) {
      if ((localzbti.c() != null) && (paramInt2 < localzbti.c().length))
      {
        str1 = localzbti.c()[paramInt2];
      }
      else
      {
        paramzahh.a("#REF");
        return;
      }
    }
    paramzahh.a('\'');
    if (paramzaah.c())
    {
      paramzahh.a('[');
      paramzahh.a(zi.a(paramzaah.a(paramInt1)));
      paramzahh.a(']');
    }
    else
    {
      String str2 = localzbti.a(localWorksheetCollection.p());
      str2 = str2.replace('/', '\\');
      int i = str2.lastIndexOf('\\');
      if ((i < 0) && (str2.length() > 2) && (str2.charAt(1) == ':')) {
        i = 2;
      }
      if (i < 0)
      {
        if (str1 != null)
        {
          paramzahh.a('[');
          paramzahh.a(str2);
          paramzahh.a(']');
        }
        else
        {
          paramzahh.a(str2);
        }
      }
      else
      {
        i++;
        paramzahh.a(str2.substring(0, 0 + i));
        if (str1 != null)
        {
          paramzahh.a('[');
          paramzahh.a(str2.substring(i));
          paramzahh.a(']');
        }
        else
        {
          paramzahh.a(str2.substring(i));
        }
      }
    }
    if (str1 != null)
    {
      if (str1.indexOf('\'') != -1) {
        str1 = zw.a(str1, "'", "''");
      }
      paramzahh.a(str1);
      if ((paramInt2 != paramInt3) && (paramInt3 > -1) && (paramInt3 < localzbti.c().length))
      {
        paramzahh.a(':');
        str1 = localzbti.c()[paramInt3];
        if (str1.indexOf('\'') != -1) {
          str1 = zw.a(str1, "'", "''");
        }
        paramzahh.a(str1);
      }
    }
    paramzahh.a('\'');
  }
  
  public static boolean a(String paramString, zaao paramzaao)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return false;
    }
    char[] arrayOfChar = paramString.toCharArray();
    if ((arrayOfChar[0] >= '0') && (arrayOfChar[0] <= '9')) {
      return true;
    }
    for (int i = 0; i < arrayOfChar.length; i++) {
      switch (arrayOfChar[i])
      {
      case ' ': 
      case '!': 
      case '#': 
      case '$': 
      case '%': 
      case '&': 
      case '\'': 
      case '(': 
      case ')': 
      case '+': 
      case ',': 
      case '-': 
      case '/': 
      case '<': 
      case '=': 
      case '>': 
      case '\\': 
      case '{': 
      case '|': 
      case '}': 
      case '~': 
        return true;
      }
    }
    return a(paramzaao, arrayOfChar, 0, arrayOfChar.length);
  }
  
  public static boolean a(zaao paramzaao, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    long l = zbbk.a(paramArrayOfChar, 0, paramArrayOfChar.length, paramzaao.w + 1, paramzaao.x + 1);
    if ((l & 0x30000000000000) == 0L) {
      return true;
    }
    l = zbbk.a(paramzaao, paramArrayOfChar, 0, paramArrayOfChar.length);
    return (l & 0x30000000000000) == 0L;
  }
  
  public static boolean a(String paramString)
  {
    return paramString.indexOf(' ') > -1;
  }
  
  public static boolean b(String paramString)
  {
    int i = 0;
    for (int j = 0; j < paramString.length(); j++) {
      switch (paramString.charAt(j))
      {
      case ' ': 
      case '!': 
      case '#': 
      case '$': 
      case '%': 
      case '&': 
      case '\'': 
      case '(': 
      case ')': 
      case '+': 
      case ',': 
      case '-': 
      case '<': 
      case '=': 
      case '>': 
      case '@': 
      case '\\': 
      case '{': 
      case '|': 
      case '}': 
      case '~': 
        return true;
      case '0': 
      case '1': 
      case '2': 
      case '3': 
      case '4': 
      case '5': 
      case '6': 
      case '7': 
      case '8': 
      case '9': 
        i++;
      }
    }
    return i == paramString.length();
  }
  
  public static String c(String paramString)
  {
    return zw.a(paramString, "'", "''");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */