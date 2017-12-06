package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

class zafy
{
  private static final za a = new za(new String[] { ".5pt solid", "0.5pt solid", "1px solid", "1.0pt solid", "2px solid", ".5pt dashed", "0.5pt dashed", "1px dashed", ".5pt dotted", "0.5pt dotted", "1px dotted", "1.5pt solid", "3px solid", "2.0pt double", "4px double", "1.5pt double", "3px double", ".5pt hairline", "0.5pt hairline", "1px hairline", "1.0pt dashed", "2px dashed", ".5pt dot-dash", "0.5pt dot-dash", "1px dot-dash", "1.0pt dot-dash", "2px dot-dash", ".5pt dot-dot-dash", "0.5pt dot-dot-dash", "1px dot-dot-dash", "1.0pt dot-dot-dash", "2px dot-dot-dash", "1.0pt dot-dash-slanted", "2px dot-dash-slanted", "solid", "dashed", "dotted", "double", "hairline", "dot-dash", "dot-dot-dash", "dot-dash-slanted", "border-top", "border-right", "border-bottom", "border-left", "mso-diagonal-up", "mso-diagonal-down" });
  
  public static int a(String paramString)
  {
    switch (a.a(paramString))
    {
    case 0: 
    case 1: 
    case 2: 
      return 1;
    case 3: 
    case 4: 
      return 2;
    case 5: 
    case 6: 
    case 7: 
      return 3;
    case 8: 
    case 9: 
    case 10: 
      return 4;
    case 11: 
    case 12: 
      return 5;
    case 13: 
    case 14: 
    case 15: 
    case 16: 
      return 6;
    case 17: 
    case 18: 
    case 19: 
      return 7;
    case 20: 
    case 21: 
      return 8;
    case 22: 
    case 23: 
    case 24: 
      return 9;
    case 25: 
    case 26: 
      return 10;
    case 27: 
    case 28: 
    case 29: 
      return 11;
    case 30: 
    case 31: 
      return 12;
    case 32: 
    case 33: 
      return 13;
    }
    return b(paramString);
  }
  
  private static int b(String paramString)
  {
    String[] arrayOfString = zw.d(paramString.toLowerCase(), ' ');
    if (arrayOfString.length == 2) {
      switch (a.a(arrayOfString[1]))
      {
      case 34: 
        String str1 = arrayOfString[0];
        double d;
        if (str1.indexOf("pt") != -1)
        {
          d = zp.a(str1.substring(0, 0 + (str1.length() - str1.substring(str1.indexOf("pt")).length())));
          if (d < 1.0D) {
            return 1;
          }
          if (d < 1.5D) {
            return 2;
          }
          return 5;
        }
        if (str1.indexOf("px") != -1)
        {
          d = zp.a(str1.substring(0, 0 + (str1.length() - str1.substring(str1.indexOf("px")).length())));
          if (d < 2.0D) {
            return 1;
          }
          if (d < 3.0D) {
            return 2;
          }
          return 5;
        }
        return 1;
      case 35: 
        String str2 = arrayOfString[0];
        if (str2.indexOf("pt") != -1)
        {
          if (zp.a(str2.substring(0, 0 + (str2.length() - str2.substring(str2.indexOf("pt")).length()))) < 1.0D) {
            return 3;
          }
          return 8;
        }
        if (str2.indexOf("px") != -1)
        {
          if (zp.a(str2.substring(0, 0 + (str2.length() - str2.substring(str2.indexOf("px")).length()))) < 2.0D) {
            return 3;
          }
          return 8;
        }
        return 3;
      case 36: 
        return 4;
      case 37: 
        return 6;
      case 38: 
        return 7;
      case 39: 
        String str3 = arrayOfString[0];
        if (str3.indexOf("pt") != -1)
        {
          if (zp.a(str3.substring(0, 0 + (str3.length() - str3.substring(str3.indexOf("pt")).length()))) < 1.0D) {
            return 9;
          }
          return 10;
        }
        if (str3.indexOf("px") != -1)
        {
          if (zp.a(str3.substring(0, 0 + (str3.length() - str3.substring(str3.indexOf("px")).length()))) < 2.0D) {
            return 9;
          }
          return 10;
        }
        return 9;
      case 40: 
        String str4 = arrayOfString[0];
        if (str4.indexOf("pt") != -1)
        {
          if (zp.a(str4.substring(0, 0 + (str4.length() - str4.substring(str4.indexOf("pt")).length()))) < 1.0D) {
            return 11;
          }
          return 12;
        }
        if (str4.indexOf("px") != -1)
        {
          if (zp.a(str4.substring(0, 0 + (str4.length() - str4.substring(str4.indexOf("px")).length()))) < 2.0D) {
            return 11;
          }
          return 12;
        }
        return 11;
      case 41: 
        return 13;
      }
    }
    return 0;
  }
  
  private static int c(String paramString)
  {
    switch (a.a(paramString))
    {
    case 42: 
      return 4;
    case 43: 
      return 2;
    case 44: 
      return 8;
    case 45: 
      return 1;
    case 46: 
      return 32;
    case 47: 
      return 16;
    }
    return 64;
  }
  
  private static boolean d(String paramString)
  {
    switch (a.a(paramString))
    {
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
      return true;
    }
    return false;
  }
  
  private static boolean e(String paramString)
  {
    return (paramString.endsWith("px")) || (paramString.endsWith("pt")) || (paramString.endsWith("in"));
  }
  
  private static void a(String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String[] paramArrayOfString4)
  {
    paramArrayOfString2[0] = null;
    paramArrayOfString3[0] = null;
    paramArrayOfString4[0] = null;
    int i = paramArrayOfString1.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString1[j].trim();
      if (d(str.toLowerCase())) {
        paramArrayOfString2[0] = str;
      } else if (e(str.toLowerCase())) {
        paramArrayOfString3[0] = str;
      } else {
        paramArrayOfString4[0] = str;
      }
    }
  }
  
  public static void a(String paramString1, String paramString2, Style paramStyle)
  {
    int i = paramString2.indexOf(" ");
    if (i != -1)
    {
      String[] arrayOfString1 = zw.d(paramString2, new char[] { ' ' });
      String str1 = null;
      String str2 = null;
      String str3 = null;
      String[] arrayOfString2 = { str1 };
      String[] arrayOfString3 = { str2 };
      String[] arrayOfString4 = { str3 };
      a(arrayOfString1, arrayOfString2, arrayOfString3, arrayOfString4);
      str1 = arrayOfString2[0];
      str2 = arrayOfString3[0];
      str3 = arrayOfString4[0];
      int k;
      if ((str3 != null) && (str1 != null) && (str2 != null))
      {
        k = a(str2 + " " + str1);
        if (!paramString1.equals("border"))
        {
          int m = c(paramString1);
          paramStyle.getBorders().getByBorderType(m).setColor(zafz.g(str3));
          paramStyle.getBorders().getByBorderType(m).setLineStyle(k);
        }
        else
        {
          paramStyle.getBorders().getByBorderType(8).setColor(zafz.g(str3));
          paramStyle.getBorders().getByBorderType(8).setLineStyle(k);
          paramStyle.getBorders().getByBorderType(1).setColor(zafz.g(str3));
          paramStyle.getBorders().getByBorderType(1).setLineStyle(k);
          paramStyle.getBorders().getByBorderType(2).setColor(zafz.g(str3));
          paramStyle.getBorders().getByBorderType(2).setLineStyle(k);
          paramStyle.getBorders().getByBorderType(4).setColor(zafz.g(str3));
          paramStyle.getBorders().getByBorderType(4).setLineStyle(k);
        }
      }
      else if ((str1 != null) && (str2 != null))
      {
        k = a(str2 + " " + str1);
        paramStyle.getBorders().getByBorderType(8).setLineStyle(k);
        paramStyle.getBorders().getByBorderType(4).setLineStyle(k);
        paramStyle.getBorders().getByBorderType(1).setLineStyle(k);
        paramStyle.getBorders().getByBorderType(2).setLineStyle(k);
      }
    }
    else if (paramString2.equals("none"))
    {
      if (!paramString1.equals("border"))
      {
        int j = c(paramString1);
        paramStyle.getBorders().getByBorderType(j).setLineStyle(0);
      }
      else
      {
        paramStyle.getBorders().getByBorderType(8).setLineStyle(0);
        paramStyle.getBorders().getByBorderType(4).setLineStyle(0);
        paramStyle.getBorders().getByBorderType(1).setLineStyle(0);
        paramStyle.getBorders().getByBorderType(2).setLineStyle(0);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */