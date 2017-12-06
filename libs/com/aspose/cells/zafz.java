package com.aspose.cells;

import com.aspose.cells.b.a.b.zf;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

class zafz
{
  public static int a = 0;
  public static int b = 1;
  public static int c = 72;
  public static double d = 2.54D;
  public static int e = 96;
  public static int f = 65536;
  public static int g = 65535;
  public static int h = 256;
  public static int i = 409;
  private static final za j = new za(new String[] { "center", "distributed", "justify", "left", "right", "center-across", "fill", "general", "010", "121", "middle", "top", "bottom", "none", "single", "double", "single-accounting", "double-accounting", "gray-75", "gray-50", "gray-25", "gray-125", "gray-0625", "horz-stripe", "vert-stripe", "reverse-diag-stripe", "diag-stripe", "diag-cross", "thick-diag-cross", "thin-horz-stripe", "thin-vert-stripe", "thin-reverse-diag-stripe", "thin-diag-stripe", "thin-horz-cross", "thin-diag-cross", "Percent", "\"Percent\"", "Fixed", "\"Short Date\"", "\"Medium Date\"", "\"Long Date\"", "\"Short Time\"", "\"Medium Time\"", "\"Long Time\"", "\"Currency\"", "\"General Date\"", "\"Scientific\"", "Scientific" });
  
  public static int a(String paramString)
  {
    if ((paramString.indexOf('.') != -1) || (paramString.indexOf('-') != -1)) {
      return a;
    }
    if (zo.a(paramString) > 2.147483647E9D) {
      return a;
    }
    return b;
  }
  
  public static String b(String paramString)
  {
    String str = zw.a(zw.a(paramString, "T", " "), "Z", "");
    return str;
  }
  
  public static String c(String paramString)
  {
    String str = zw.a(paramString, "%20", " ");
    return zw.a(zw.a(str, "%26", "&"), "file:///", "");
  }
  
  private static String i(String paramString)
  {
    String str = zw.a(paramString, "\\\\\\\\\\\\/", "/");
    str = zw.a(str, "\\\\\\[ENG\\\\\\]", "");
    str = zw.a(str, "\\\\\\\\ ", " ");
    str = zw.a(str, "\\\\\\\\", "\r");
    str = zw.a(str, "\\\\", "");
    str = zw.a(str, "\r", "\\\\");
    str = zw.a(zw.a(str, "\"", ""), "0027", "'");
    str = zw.a(zw.a(str, "0022", "\\\""), "00A3", "");
    str = zw.a(str, "\\", "");
    return str;
  }
  
  public static int d(String paramString)
  {
    switch (j.a(paramString))
    {
    case 0: 
      return 1;
    case 1: 
      return 3;
    case 2: 
      return 6;
    case 3: 
      return 7;
    case 4: 
      return 8;
    case 5: 
      return 2;
    case 6: 
      return 4;
    case 7: 
      return 5;
    case 8: 
      return 6;
    case 9: 
      return 3;
    }
    return 5;
  }
  
  public static int e(String paramString)
  {
    switch (j.a(paramString))
    {
    case 10: 
      return 1;
    case 1: 
      return 3;
    case 2: 
      return 6;
    case 11: 
      return 9;
    case 12: 
      return 0;
    case 9: 
      return 3;
    }
    return 5;
  }
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 3: 
      return "single";
    case 2: 
    case 4: 
      return "double-accounting";
    }
    return "none";
  }
  
  public static void a(Font paramFont, String paramString)
  {
    switch (j.a(paramString))
    {
    case 13: 
      paramFont.setUnderline(0);
      break;
    case 14: 
      paramFont.setUnderline(1);
      break;
    case 15: 
      paramFont.setUnderline(2);
      break;
    case 16: 
      paramFont.setUnderline(3);
      break;
    case 17: 
      paramFont.setUnderline(4);
      break;
    }
  }
  
  public static int f(String paramString)
  {
    switch (j.a(paramString))
    {
    case 13: 
      return 0;
    case 14: 
      return 1;
    case 15: 
      return 2;
    case 17: 
      return 4;
    case 16: 
      return 3;
    }
    return 1;
  }
  
  public static void a(String paramString, Style paramStyle)
  {
    String[] arrayOfString = zw.d(paramString, ' ');
    if (arrayOfString.length == 2) {
      paramStyle.setPattern(h(arrayOfString[1]));
    }
  }
  
  public static void a(String paramString, Style paramStyle, Color paramColor)
  {
    String[] arrayOfString = zw.d(paramString, ' ');
    if (arrayOfString.length == 2)
    {
      paramStyle.setPattern(h(arrayOfString[1]));
      if ("auto none".equals(paramString))
      {
        paramStyle.setForegroundColor(paramColor);
      }
      else if (!"none".equals(arrayOfString[1]))
      {
        paramStyle.setForegroundColor(g(arrayOfString[0]));
        paramStyle.setBackgroundColor(paramColor);
      }
      else
      {
        paramStyle.setForegroundColor(paramColor);
      }
    }
  }
  
  public static Color g(String paramString)
  {
    if (paramString == null) {
      return Color.getEmpty();
    }
    paramString = zw.a(paramString, "!important", "").trim();
    if (paramString.startsWith("#")) {
      return zf.a(paramString);
    }
    Object localObject;
    int n;
    int i1;
    if (paramString.startsWith("rgb("))
    {
      int k = paramString.indexOf(')');
      localObject = paramString.substring(4, 4 + (k - 4));
      String[] arrayOfString = zw.d(((String)localObject).trim(), ',');
      int m = zauj.F(arrayOfString[0].trim());
      n = zauj.F(arrayOfString[1].trim());
      i1 = zauj.F(arrayOfString[2].trim());
      return Color.fromArgb(m, n, i1);
    }
    if (paramString.startsWith("rgba("))
    {
      String str = paramString.substring(5, 5 + (paramString.length() - 6));
      localObject = zw.d(str.trim(), ',');
      double d1 = zauj.C(localObject[3].trim());
      n = (int)(d1 * zauj.F(localObject[0].trim()) + 255.0D * (1.0D - d1));
      i1 = (int)(d1 * zauj.F(localObject[1].trim()) + 255.0D * (1.0D - d1));
      int i2 = (int)(d1 * zauj.F(localObject[2].trim()) + 255.0D * (1.0D - d1));
      return Color.fromArgb(n, i1, i2);
    }
    return Color.a(paramString);
  }
  
  public static int h(String paramString)
  {
    switch (j.a(paramString))
    {
    case 13: 
      return 1;
    case 18: 
      return 3;
    case 19: 
      return 2;
    case 20: 
      return 4;
    case 21: 
      return 17;
    case 22: 
      return 18;
    case 23: 
      return 5;
    case 24: 
      return 6;
    case 25: 
      return 7;
    case 26: 
      return 8;
    case 27: 
      return 9;
    case 28: 
      return 10;
    case 29: 
      return 11;
    case 30: 
      return 12;
    case 31: 
      return 13;
    case 32: 
      return 14;
    case 33: 
      return 15;
    case 34: 
      return 16;
    }
    return 0;
  }
  
  public static void a(Style paramStyle, String paramString)
  {
    String str = i(paramString);
    switch (j.a(paramString))
    {
    case 35: 
    case 36: 
      paramStyle.setNumber(10);
      break;
    case 37: 
      paramStyle.setNumber(2);
      break;
    case 38: 
      paramStyle.setNumber(14);
      break;
    case 39: 
      paramStyle.setNumber(15);
      break;
    case 40: 
      paramStyle.setNumber(31);
      break;
    case 41: 
      paramStyle.setNumber(20);
      break;
    case 42: 
      paramStyle.setNumber(18);
      break;
    case 43: 
      paramStyle.setNumber(19);
      break;
    case 44: 
      paramStyle.setNumber(43);
      break;
    case 45: 
      paramStyle.setNumber(22);
      break;
    case 46: 
      paramStyle.setNumber(48);
      break;
    case 47: 
      paramStyle.setNumber(11);
      break;
    default: 
      if (paramString.indexOf("Standard") != -1) {
        paramStyle.setNumber(4);
      } else {
        paramStyle.b(str);
      }
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */