package com.aspose.cells;

import com.aspose.cells.a.d.zap;

class zbxp
{
  static int a()
  {
    return (int)zap.b();
  }
  
  static int a(double paramDouble)
  {
    return (int)(paramDouble * a() + 0.5D);
  }
  
  static double b(double paramDouble)
  {
    return paramDouble / a();
  }
  
  static int c(double paramDouble)
  {
    return (int)(paramDouble * a() / 2.54D + 0.5D);
  }
  
  static double a(int paramInt)
  {
    return paramInt * 2.54D / a();
  }
  
  static double d(double paramDouble)
  {
    return paramDouble / 72.0D * 25.4D;
  }
  
  static double a(String paramString)
  {
    return a(paramString, "px", (int)CellsHelper.getDPI());
  }
  
  static double a(String paramString1, String paramString2, int paramInt)
  {
    String str = "px";
    if (paramString1.length() > 2)
    {
      int i = paramString1.charAt(paramString1.length() - 2);
      int j = paramString1.charAt(paramString1.length() - 1);
      if ((i < 48) || (i > 57) || (j < 48) || (j > 57))
      {
        str = paramString1.substring(paramString1.length() - 2);
        paramString1 = paramString1.substring(0, 0 + (paramString1.length() - 2));
      }
    }
    double d = zauj.C(paramString1);
    if ("px".equals(str)) {
      d = d * 72.0D / paramInt;
    } else if (!"pt".equals(str)) {
      if ("in".equals(str)) {
        d *= 72.0D;
      } else if ("mm".equals(str)) {
        d = d / 10.0D / 2.54D * 72.0D;
      } else if ("cm".equals(str)) {
        d = d / 2.54D * 72.0D;
      }
    }
    if ("px".equals(paramString2)) {
      d = d * paramInt / 72.0D;
    } else if ("in".equals(paramString2)) {
      d /= 72.0D;
    } else if ("mm".equals(paramString2)) {
      d = d / 72.0D * 2.54D * 10.0D;
    } else if ("cm".equals(paramString2)) {
      d = d / 72.0D * 2.54D;
    }
    return d;
  }
  
  static double b(int paramInt)
  {
    return paramInt * 0.001D / 2.54D * 72.0D;
  }
  
  static int e(double paramDouble)
  {
    return (int)(paramDouble / 72.0D * 2.54D * 1000.0D);
  }
  
  static double c(int paramInt)
  {
    return paramInt / znq.j;
  }
  
  static int f(double paramDouble)
  {
    return (int)(paramDouble * znq.j + 0.5D);
  }
  
  static int a(double paramDouble1, double paramDouble2)
  {
    return (int)(paramDouble1 * paramDouble2 / 72.0D + 0.5D);
  }
  
  static double g(double paramDouble)
  {
    return paramDouble / 72.0D;
  }
  
  static double a(double paramDouble, int paramInt)
  {
    return paramDouble / paramInt * 72.0D;
  }
  
  static double d(int paramInt)
  {
    return paramInt / znq.k;
  }
  
  static int h(double paramDouble)
  {
    return (int)(paramDouble * znq.k);
  }
  
  static int i(double paramDouble)
  {
    return (int)(paramDouble * 100.0D + 0.5D);
  }
  
  static double e(int paramInt)
  {
    return paramInt / 100.0D;
  }
  
  static int j(double paramDouble)
  {
    return (int)(paramDouble * 100000.0D + 0.5D);
  }
  
  static double k(double paramDouble)
  {
    return paramDouble / 100000.0D;
  }
  
  static int l(double paramDouble)
  {
    return (int)(paramDouble * 1000.0D + 0.5D);
  }
  
  static double m(double paramDouble)
  {
    return paramDouble / 1000.0D;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */