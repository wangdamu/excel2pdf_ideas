package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

class znc
{
  private static final za a = new za(new String[] { "=", "<", ">", "<>", "<=", ">=" });
  
  static int a(double paramDouble1, double paramDouble2, String paramString)
  {
    switch (a.a(paramString))
    {
    case 0: 
      if (Math.abs(paramDouble1 - paramDouble2) < Double.MIN_VALUE) {
        return 1;
      }
      break;
    case 1: 
      if (paramDouble1 < paramDouble2) {
        return 1;
      }
      break;
    case 2: 
      if (paramDouble1 > paramDouble2) {
        return 1;
      }
      break;
    case 3: 
      if (Math.abs(paramDouble1 - paramDouble2) > Double.MIN_VALUE) {
        return 1;
      }
      break;
    case 4: 
      if ((paramDouble1 < paramDouble2) || (Math.abs(paramDouble1 - paramDouble2) < Double.MIN_VALUE)) {
        return 1;
      }
      break;
    case 5: 
      if ((paramDouble1 > paramDouble2) || (Math.abs(paramDouble1 - paramDouble2) < Double.MIN_VALUE)) {
        return 1;
      }
      break;
    }
    return 0;
  }
  
  static int a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    switch (a.a(paramString3))
    {
    case 0: 
      if (paramBoolean) {
        if ((zw.a(paramString2, new char[] { '*', '?' }) != -1) && (zbsn.a(paramString2, paramString1, true) == 0)) {
          return 1;
        }
      }
      if (zw.a(paramString1, paramString2, true) == 0) {
        return 1;
      }
      break;
    case 1: 
      if (zw.a(paramString1, paramString2, true) < 0) {
        return 1;
      }
      break;
    case 2: 
      if (zw.a(paramString1, paramString2, true) > 0) {
        return 1;
      }
      break;
    case 4: 
      if (zw.a(paramString1, paramString2, true) <= 0) {
        return 1;
      }
      break;
    case 5: 
      if (zw.a(paramString1, paramString2, true) >= 0) {
        return 1;
      }
      break;
    case 3: 
      if (zw.a(paramString1, paramString2, true) != 0) {
        return 1;
      }
      break;
    }
    return 0;
  }
  
  static double a(Object paramObject, boolean paramBoolean)
  {
    if (paramObject == null) {
      return 0.0D;
    }
    if ((paramObject instanceof zuf)) {
      return 1.0D;
    }
    switch (zaoj.a(paramObject.getClass()))
    {
    case 3: 
      if (((Boolean)paramObject).booleanValue()) {
        return 1.0D;
      }
      return 0.0D;
    case 14: 
      return ((Double)paramObject).doubleValue();
    case 16: 
      return CellsHelper.getDoubleFromDateTime((DateTime)paramObject, paramBoolean);
    case 9: 
      return ((Integer)paramObject).intValue();
    case 18: 
      String str = (String)paramObject;
      if ("".equals(str)) {
        return 0.0D;
      }
      return 1.0D;
    }
    return 1.0D;
  }
  
  static Object a(Object paramObject1, Object paramObject2, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramObject1 != null) && ((paramObject1 instanceof zuf))) {
      return paramObject1;
    }
    if ((paramObject2 != null) && ((paramObject2 instanceof zuf))) {
      return paramObject2;
    }
    if ((paramObject1 == null) || (paramObject2 == null))
    {
      double d1 = a(paramObject1, paramBoolean1);
      double d3 = a(paramObject2, paramBoolean1);
      switch (a.a(paramString))
      {
      case 0: 
        return Boolean.valueOf(d1 == d3);
      case 3: 
        return Boolean.valueOf(d1 != d3);
      case 5: 
        return Boolean.valueOf(d1 >= d3);
      case 4: 
        return Boolean.valueOf(d1 <= d3);
      case 2: 
        return Boolean.valueOf(d1 > d3);
      case 1: 
        return Boolean.valueOf(d1 < d3);
      }
      return Boolean.valueOf(false);
    }
    double d6;
    double d7;
    double d4;
    String str3;
    String str1;
    switch (zaoj.a(paramObject1.getClass()))
    {
    case 11: 
      double d5 = ((Long)paramObject1).longValue();
      switch (zaoj.a(paramObject2.getClass()))
      {
      case 11: 
        d6 = ((Long)paramObject2).longValue();
        return Boolean.valueOf(b(d5, d6, paramString));
      case 9: 
        d7 = ((Integer)paramObject2).intValue();
        return Boolean.valueOf(b(d5, d7, paramString));
      case 14: 
        return Boolean.valueOf(b(d5, ((Double)paramObject2).doubleValue(), paramString));
      case 16: 
        d4 = CellsHelper.getDoubleFromDateTime((DateTime)paramObject2, paramBoolean1);
        return Boolean.valueOf(b(d5, d4, paramString));
      case 18: 
        str3 = (String)paramObject2;
        switch (a.a(paramString))
        {
        case 0: 
        case 2: 
        case 5: 
          return Boolean.valueOf(false);
        case 1: 
        case 3: 
        case 4: 
          return Boolean.valueOf(true);
        }
        i = a(zs.a(paramObject1), zs.a(paramObject2), paramString, paramBoolean2);
        if (i == 1) {
          return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
      }
      i = a(zs.a(paramObject1), zs.a(paramObject2), paramString, paramBoolean2);
      if (i == 1) {
        return Boolean.valueOf(true);
      }
      return Boolean.valueOf(false);
    case 9: 
      d6 = ((Integer)paramObject1).intValue();
      switch (zaoj.a(paramObject2.getClass()))
      {
      case 9: 
        d7 = ((Integer)paramObject2).intValue();
        return Boolean.valueOf(b(d6, d7, paramString));
      case 14: 
        return Boolean.valueOf(b(d6, ((Double)paramObject2).doubleValue(), paramString));
      case 16: 
        d4 = CellsHelper.getDoubleFromDateTime((DateTime)paramObject2, paramBoolean1);
        return Boolean.valueOf(b(d6, d4, paramString));
      case 18: 
        str3 = (String)paramObject2;
        switch (a.a(paramString))
        {
        case 0: 
        case 2: 
        case 5: 
          return Boolean.valueOf(false);
        case 1: 
        case 3: 
        case 4: 
          return Boolean.valueOf(true);
        }
        i = a(zs.a(paramObject1), zs.a(paramObject2), paramString, paramBoolean2);
        if (i == 1) {
          return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
      }
      i = a(zs.a(paramObject1), zs.a(paramObject2), paramString, paramBoolean2);
      if (i == 1) {
        return Boolean.valueOf(true);
      }
      return Boolean.valueOf(false);
    case 14: 
      switch (zaoj.a(paramObject2.getClass()))
      {
      case 14: 
        return Boolean.valueOf(b(((Double)paramObject1).doubleValue(), ((Double)paramObject2).doubleValue(), paramString));
      case 16: 
        d4 = CellsHelper.getDoubleFromDateTime((DateTime)paramObject2, paramBoolean1);
        return Boolean.valueOf(b(((Double)paramObject1).doubleValue(), d4, paramString));
      case 18: 
        str1 = (String)paramObject2;
        switch (a.a(paramString))
        {
        case 0: 
        case 2: 
        case 5: 
          return Boolean.valueOf(false);
        case 1: 
        case 3: 
        case 4: 
          return Boolean.valueOf(true);
        }
        i = a(zs.a(paramObject1), zs.a(paramObject2), paramString, paramBoolean2);
        if (i == 1) {
          return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
      }
      i = a(zs.a(paramObject1), zs.a(paramObject2), paramString, paramBoolean2);
      if (i == 1) {
        return Boolean.valueOf(true);
      }
      return Boolean.valueOf(false);
    case 16: 
      double d2;
      switch (zaoj.a(paramObject2.getClass()))
      {
      case 14: 
        d2 = CellsHelper.getDoubleFromDateTime((DateTime)paramObject1, paramBoolean1);
        return Boolean.valueOf(b(d2, ((Double)paramObject2).doubleValue(), paramString));
      case 16: 
        d2 = CellsHelper.getDoubleFromDateTime((DateTime)paramObject1, paramBoolean1);
        d4 = CellsHelper.getDoubleFromDateTime((DateTime)paramObject2, paramBoolean1);
        return Boolean.valueOf(b(d2, d4, paramString));
      case 18: 
        str1 = (String)paramObject2;
        paramObject2 = zaap.a(str1, paramBoolean1);
        if ((paramObject2 instanceof Double))
        {
          d2 = CellsHelper.getDoubleFromDateTime((DateTime)paramObject1, paramBoolean1);
          return Boolean.valueOf(b(d2, ((Double)paramObject2).doubleValue(), paramString));
        }
        i = a(zs.a(paramObject1), str1, paramString, paramBoolean2);
        if (i == 1) {
          return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
      }
      i = a(zs.a(paramObject1), zs.a(paramObject2), paramString, paramBoolean2);
      if (i == 1) {
        return Boolean.valueOf(true);
      }
      return Boolean.valueOf(false);
    case 18: 
      switch (zaoj.a(paramObject2.getClass()))
      {
      case 14: 
      case 16: 
        switch (a.a(paramString))
        {
        case 2: 
        case 3: 
        case 5: 
          return Boolean.valueOf(true);
        case 0: 
        case 1: 
        case 4: 
          return Boolean.valueOf(false);
        }
        i = a((String)paramObject1, zs.a(paramObject2), paramString, paramBoolean2);
        if (i == 1) {
          return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
      case 3: 
        switch (a.a(paramString))
        {
        case 3: 
          return Boolean.valueOf(true);
        case 0: 
        case 2: 
        case 5: 
          return Boolean.valueOf(false);
        case 1: 
        case 4: 
          return Boolean.valueOf(true);
        }
        i = a((String)paramObject1, zs.a(paramObject2), paramString, paramBoolean2);
        if (i == 1) {
          return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
      }
      str1 = (String)paramObject1;
      String str2 = zs.a(paramObject2);
      if (str2.length() == 0)
      {
        double d8 = str1.length() == 0 ? 0.0D : 1.0D;
        i = a(d8, 0.0D, paramString);
      }
      else
      {
        i = a(str1, str2, paramString, paramBoolean2);
      }
      if (i == 1) {
        return Boolean.valueOf(true);
      }
      return Boolean.valueOf(false);
    }
    int i = a(zs.a(paramObject1), zs.a(paramObject2), paramString, paramBoolean2);
    if (i == 1) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  static Object a(Object paramObject1, Object paramObject2, String paramString, boolean paramBoolean)
  {
    return a(paramObject1, paramObject2, paramString, paramBoolean, false);
  }
  
  static boolean b(double paramDouble1, double paramDouble2, String paramString)
  {
    switch (a.a(paramString))
    {
    case 0: 
      if (zbh.a(paramDouble1, paramDouble2)) {
        return true;
      }
      return Math.abs(paramDouble1 - paramDouble2) <= 1.0E-16D;
    case 1: 
      if (zbh.a(paramDouble1, paramDouble2)) {
        return false;
      }
      return paramDouble1 < paramDouble2;
    case 2: 
      if (zbh.a(paramDouble1, paramDouble2)) {
        return false;
      }
      return paramDouble1 > paramDouble2;
    case 4: 
      if (zbh.a(paramDouble1, paramDouble2)) {
        return true;
      }
      return (paramDouble1 < paramDouble2) || (Math.abs(paramDouble1 - paramDouble2) <= 1.0E-16D);
    case 5: 
      return (paramDouble1 > paramDouble2) || (Math.abs(paramDouble1 - paramDouble2) <= 1.0E-16D);
    case 3: 
      if (zbh.a(paramDouble1, paramDouble2)) {
        return false;
      }
      return Math.abs(paramDouble1 - paramDouble2) > 1.0E-16D;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/znc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */