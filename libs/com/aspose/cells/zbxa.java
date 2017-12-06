package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.zl;
import com.aspose.cells.b.c.a.za;

class zbxa
{
  private static final za a = new za(new String[] { "#DIV/0!", "#N/A", "#NAME?", "#NULL!", "#NUM!", "#REF!", "#VALUE!" });
  
  public static DateTime a(double paramDouble, boolean paramBoolean)
  {
    if (paramDouble > 2958465.99D) {
      return DateTime.b;
    }
    if (paramBoolean) {
      paramDouble += 1462.0D;
    }
    if (paramDouble < 60.0D) {
      paramDouble += 1.0D;
    }
    return DateTime.b(paramDouble);
  }
  
  public static double a(DateTime paramDateTime, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localzl = zk.e(paramDateTime, znq.n);
      d = localzl.c();
      if (d < 0.0D) {
        return -1.0D;
      }
      return d;
    }
    zl localzl = zk.e(DateTime.b, paramDateTime);
    if (localzl.c() < 0.0D) {
      return -1.0D;
    }
    localzl = zk.e(paramDateTime, znq.m);
    if (localzl.c() >= 0.0D) {
      localzl = zk.e(paramDateTime, znq.o);
    } else {
      localzl = zk.e(paramDateTime, znq.p);
    }
    double d = localzl.c();
    return d < 0.0D ? -1.0D : d;
  }
  
  static boolean a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    if (paramString.charAt(0) != '#') {
      return false;
    }
    switch (a.a(paramString))
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */