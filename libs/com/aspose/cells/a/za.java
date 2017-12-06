package com.aspose.cells.a;

import com.aspose.cells.a.e.zf;

public abstract class za
{
  public static final boolean a = !"Cells".equals("Android");
  public static final boolean b;
  public static final byte c;
  private static final boolean d;
  
  public static final String a(String paramString)
  {
    if (d) {
      return System.getProperty(paramString);
    }
    return null;
  }
  
  static
  {
    boolean bool1 = false;
    boolean bool2 = false;
    byte b1 = 2;
    try
    {
      String str = System.getProperty("Aspose.Cells.CheckSysProperty");
      bool2 = "DYNAMIC".equals(str);
      bool1 = true;
      str = System.getProperty("java.version");
      if (str != null) {
        if (str.startsWith("1.8")) {
          b1 = 4;
        } else if (str.startsWith("1.7")) {
          b1 = 3;
        } else if (str.startsWith("1.6")) {
          b1 = 2;
        } else if (str.startsWith("1.5")) {
          b1 = 1;
        } else if (str.startsWith("1.4")) {
          b1 = 0;
        } else {
          b1 = 4;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      zf.a("Unable to access System properties: " + localThrowable.getMessage());
    }
    b = bool2;
    d = bool1;
    c = b1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */