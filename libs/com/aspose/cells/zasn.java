package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zasn
{
  private static final za a = new za(new String[] { "auto", "column", "page", "tb-rl", "tb-lr", "tb", "rl-tb", "rl", "lr-tb", "lr", "replace", "embed", "new", "other", "onload", "onrequest", "solid", "rect", "ellipse", "custom-shape" });
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "auto";
    case 1: 
      return "column";
    case 2: 
      return "page";
    }
    return "auto";
  }
  
  static int a(String paramString)
  {
    switch (a.a(paramString.toLowerCase()))
    {
    case 3: 
      return 2;
    case 4: 
      return 3;
    case 5: 
      return 6;
    case 6: 
      return 1;
    case 7: 
      return 5;
    case 2: 
      return 7;
    case 8: 
      return 0;
    case 9: 
      return 4;
    }
    return 0;
  }
  
  static int b(String paramString)
  {
    switch (a.a(paramString.toLowerCase()))
    {
    case 10: 
      return 0;
    case 11: 
      return 1;
    case 12: 
      return 2;
    case 13: 
      return 4;
    }
    return 3;
  }
  
  static int c(String paramString)
  {
    switch (a.a(paramString.toLowerCase()))
    {
    case 14: 
      return 0;
    case 15: 
      return 1;
    case 13: 
      return 3;
    }
    return 2;
  }
  
  static int d(String paramString)
  {
    switch (a.a(paramString))
    {
    case 17: 
      return 1;
    case 18: 
      return 3;
    case 19: 
      return 4095;
    }
    return 4095;
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "rect";
    case 3: 
      return "ellipse";
    case 4095: 
      return "custom-shape";
    }
    return "custom-shape";
  }
  
  static String c(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return "gradient";
    case 1: 
      return "none";
    case 5: 
      return "pattern";
    case 2: 
      return "solid";
    case 4: 
      return "texture";
    }
    return "automatic";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */