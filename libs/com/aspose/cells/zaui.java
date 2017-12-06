package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zaui
{
  private static final za a = new za(new String[] { "dbl", "sng", "thickThin", "thinThick", "tri", "dot", "sysDot", "sysDash", "dash", "dashDot", "lgDash", "lgDashDot", "lgDashDotDot", "solid", "flat", "rnd", "sq", "in", "arrow", "diamond", "none", "oval", "stealth", "triangle", "open", "classic", "block", "lg", "med", "sm" });
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
      return "dbl";
    case 0: 
      return "sng";
    case 3: 
      return "thickThin";
    case 2: 
      return "thinThick";
    case 1: 
      return "tri";
    }
    return "sng";
  }
  
  static int a(String paramString)
  {
    switch (a.a(paramString))
    {
    case 0: 
      return 4;
    case 1: 
      return 0;
    case 2: 
      return 3;
    case 3: 
      return 2;
    case 4: 
      return 1;
    }
    return 0;
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
      return "sysDot";
    case 7: 
      return "sysDash";
    case 0: 
      return "dash";
    case 1: 
      return "dashDot";
    case 3: 
      return "lgDash";
    case 4: 
      return "lgDashDot";
    case 2: 
      return "lgDashDotDot";
    case 6: 
      return "solid";
    }
    throw new CellsException(6, "Invalid MsoLineDashStyle val");
  }
  
  static int a(String paramString, int paramInt)
  {
    switch (a.a(paramString))
    {
    case 5: 
      if (paramInt == 1) {
        return 5;
      }
      return 7;
    case 6: 
      return 5;
    case 7: 
      return 7;
    case 8: 
      return 0;
    case 9: 
      return 1;
    case 10: 
      return 3;
    case 11: 
      return 4;
    case 12: 
      return 2;
    case 13: 
      return 6;
    }
    throw new CellsException(6, "Invalid MsoLineDashStyle string val");
  }
  
  static int b(String paramString)
  {
    switch (a.a(paramString))
    {
    case 14: 
      return 2;
    case 15: 
      return 1;
    case 16: 
      return 0;
    }
    return 3;
  }
  
  static String c(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return "flat";
    case 1: 
      return "rnd";
    case 0: 
      return "sq";
    }
    return "rnd";
  }
  
  static int c(String paramString)
  {
    switch (a.a(paramString))
    {
    case 17: 
      return 1;
    }
    return 0;
  }
  
  static String d(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "in";
    }
    return "ctr";
  }
  
  static int d(String paramString)
  {
    switch (a.a(paramString))
    {
    case 18: 
      return 5;
    case 19: 
      return 3;
    case 20: 
      return 0;
    case 21: 
      return 4;
    case 22: 
      return 2;
    case 23: 
      return 1;
    }
    return 0;
  }
  
  static String e(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
      return "arrow";
    case 3: 
      return "diamond";
    case 0: 
      return "none";
    case 4: 
      return "oval";
    case 2: 
      return "stealth";
    case 1: 
      return "triangle";
    }
    return "none";
  }
  
  static int e(String paramString)
  {
    switch (a.a(paramString))
    {
    case 24: 
      return 5;
    case 19: 
      return 3;
    case 20: 
      return 0;
    case 21: 
      return 4;
    case 25: 
      return 2;
    case 26: 
      return 1;
    }
    return 0;
  }
  
  static int f(String paramString)
  {
    switch (a.a(paramString))
    {
    case 27: 
      return 2;
    case 28: 
      return 1;
    case 29: 
      return 0;
    }
    return 1;
  }
  
  static String f(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return "lg";
    case 1: 
      return "med";
    case 0: 
      return "sm";
    }
    return "med";
  }
  
  static int g(String paramString)
  {
    switch (a.a(paramString))
    {
    case 27: 
      return 2;
    case 28: 
      return 1;
    case 29: 
      return 0;
    }
    return 1;
  }
  
  static String g(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return "lg";
    case 1: 
      return "med";
    case 0: 
      return "sm";
    }
    return "med";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */