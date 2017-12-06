package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zwl
{
  private static final za a = new za(new String[] { "integrated", "none", "prompt", "stored", "cell", "value", "all", "rtf" });
  
  static int a(String paramString)
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
    return 0;
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "integrated";
    case 1: 
      return "none";
    case 2: 
      return "prompt";
    case 3: 
      return "stored";
    }
    return "integrated";
  }
  
  static int b(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    }
    return 1;
  }
  
  static int c(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    }
    return 1;
  }
  
  static ExternalConnection a(int paramInt, ExternalConnectionCollection paramExternalConnectionCollection)
  {
    Object localObject = null;
    switch (d(paramInt))
    {
    case 4: 
      localObject = new WebQueryConnection(paramExternalConnectionCollection);
      break;
    case 6: 
      localObject = new zbvu(paramExternalConnectionCollection);
      break;
    case 1: 
    case 2: 
    case 3: 
    case 5: 
    case 7: 
    case 8: 
      localObject = new DBConnection(paramExternalConnectionCollection);
      break;
    case 100: 
    case 101: 
    case 102: 
    case 103: 
      localObject = new zre(paramExternalConnectionCollection);
      break;
    default: 
      localObject = new zbxr(paramExternalConnectionCollection);
    }
    return (ExternalConnection)localObject;
  }
  
  static int d(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 6;
    case 7: 
      return 7;
    case 8: 
      return 8;
    case 100: 
      return 100;
    case 101: 
      return 101;
    case 102: 
      return 102;
    case 103: 
      return 103;
    }
    return 255;
  }
  
  static int e(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 6;
    case 7: 
      return 7;
    case 8: 
      return 8;
    case 100: 
      return 100;
    case 101: 
      return 101;
    case 102: 
      return 102;
    case 103: 
      return 103;
    }
    return 255;
  }
  
  static int f(int paramInt)
  {
    switch (paramInt)
    {
    case -22: 
      return -22;
    case -20: 
      return -20;
    case -11: 
      return -11;
    case -10: 
      return -10;
    case -9: 
      return -9;
    case -8: 
      return -8;
    case -7: 
      return -7;
    case -6: 
      return -6;
    case -5: 
      return -5;
    case -4: 
      return -4;
    case -3: 
      return -3;
    case -2: 
      return -2;
    case -1: 
      return -1;
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 6;
    case 7: 
      return 7;
    case 8: 
      return 8;
    case 9: 
      return 9;
    case 10: 
      return 10;
    case 11: 
      return 11;
    case 12: 
      return 12;
    case 101: 
      return 101;
    case 102: 
      return 102;
    case 103: 
      return 103;
    case 104: 
      return 104;
    case 105: 
      return 105;
    case 106: 
      return 106;
    case 107: 
      return 107;
    case 108: 
      return 108;
    case 109: 
      return 109;
    case 110: 
      return 110;
    case 111: 
      return 111;
    case 112: 
      return 112;
    case 113: 
      return 113;
    }
    return 0;
  }
  
  static int g(int paramInt)
  {
    switch (paramInt)
    {
    case -22: 
      return -22;
    case -20: 
      return -20;
    case -11: 
      return -11;
    case -10: 
      return -10;
    case -9: 
      return -9;
    case -8: 
      return -8;
    case -7: 
      return -7;
    case -6: 
      return -6;
    case -5: 
      return -5;
    case -4: 
      return -4;
    case -3: 
      return -3;
    case -2: 
      return -2;
    case -1: 
      return -1;
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 6;
    case 7: 
      return 7;
    case 8: 
      return 8;
    case 9: 
      return 9;
    case 10: 
      return 10;
    case 11: 
      return 11;
    case 12: 
      return 12;
    case 101: 
      return 101;
    case 102: 
      return 102;
    case 103: 
      return 103;
    case 104: 
      return 104;
    case 105: 
      return 105;
    case 106: 
      return 106;
    case 107: 
      return 107;
    case 108: 
      return 108;
    case 109: 
      return 109;
    case 110: 
      return 110;
    case 111: 
      return 111;
    case 112: 
      return 112;
    case 113: 
      return 113;
    }
    return 0;
  }
  
  static int h(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    }
    return 2;
  }
  
  static int i(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    }
    return 2;
  }
  
  static int b(String paramString)
  {
    switch (a.a(paramString))
    {
    case 4: 
      return 0;
    case 2: 
      return 1;
    case 5: 
      return 2;
    }
    return 1;
  }
  
  static String j(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "cell";
    case 1: 
      return "prompt";
    case 2: 
      return "value";
    }
    return "prompt";
  }
  
  static int c(String paramString)
  {
    switch (a.a(paramString))
    {
    case 6: 
      return 0;
    case 7: 
      return 2;
    }
    return 1;
  }
  
  static String k(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "all";
    case 2: 
      return "rtf";
    }
    return "none";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */