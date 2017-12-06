package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

class zty
{
  private static final za a = new za(new String[] { "center", "centerGroup", "left", "right", "oMathPara", "oMath", "sSup", "e", "sup", "f", "den", "num", "func", "fName", "d", "nary", "sub", "rad", "sPre", "sSub", "deg", "acc", "bar", "box", "sSubSup", "borderBox", "lin", "noBar", "skw", "centered", "match", "subSup", "undOvr", "top", "bot" });
  
  static boolean a(String paramString)
  {
    return zw.a(paramString, "on", true) == 0;
  }
  
  static String a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return "1";
    }
    return "0";
  }
  
  static String b(boolean paramBoolean)
  {
    if (paramBoolean) {
      return "on";
    }
    return "off";
  }
  
  static int b(String paramString)
  {
    switch (a.a(paramString))
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    }
    return 1;
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "center";
    case 1: 
      return "centerGroup";
    case 2: 
      return "left";
    case 3: 
      return "right";
    }
    return "centerGroup";
  }
  
  static int c(String paramString)
  {
    switch (a.a(paramString))
    {
    case 4: 
      return 0;
    case 5: 
      return 1;
    case 6: 
      return 2;
    case 7: 
      return 3;
    case 8: 
      return 4;
    case 9: 
      return 5;
    case 10: 
      return 6;
    case 11: 
      return 7;
    case 12: 
      return 8;
    case 13: 
      return 9;
    case 14: 
      return 10;
    case 15: 
      return 11;
    case 16: 
      return 12;
    case 17: 
      return 13;
    case 18: 
      return 14;
    case 19: 
      return 15;
    case 20: 
      return 17;
    case 21: 
      return 18;
    case 22: 
      return 19;
    case 23: 
      return 21;
    case 24: 
      return 16;
    case 25: 
      return 20;
    }
    return 23;
  }
  
  static int d(String paramString)
  {
    switch (a.a(paramString))
    {
    case 22: 
      return 0;
    case 26: 
      return 1;
    case 27: 
      return 2;
    case 28: 
      return 3;
    }
    return 0;
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "bar";
    case 1: 
      return "lin";
    case 2: 
      return "noBar";
    case 3: 
      return "skw";
    }
    return "bar";
  }
  
  static int e(String paramString)
  {
    switch (a.a(paramString))
    {
    case 29: 
      return 0;
    case 30: 
      return 1;
    }
    return 0;
  }
  
  static String c(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "centered";
    case 1: 
      return "match";
    }
    return "centered";
  }
  
  static int f(String paramString)
  {
    switch (a.a(paramString))
    {
    case 31: 
      return 1;
    case 32: 
      return 0;
    }
    return 0;
  }
  
  static String d(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "subSup";
    case 0: 
      return "undOvr";
    }
    return "undOvr";
  }
  
  static int g(String paramString)
  {
    switch (a.a(paramString))
    {
    case 33: 
      return 0;
    case 34: 
      return 1;
    }
    return 0;
  }
  
  static String e(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "top";
    case 1: 
      return "bot";
    }
    return "top";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */