package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.zl;
import com.aspose.cells.b.a.zr;

abstract class zfu
{
  static double a(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble)
  {
    double d1 = 0.0D;
    double d2 = a(paramDateTime1, paramDateTime2);
    if (d2 > 182.0D)
    {
      double d3 = (100.0D - paramDouble * 100.0D * d2 / 360.0D) / 100.0D;
      double d4 = 0.0D;
      if (d2 == 366.0D) {
        d4 = 366.0D;
      } else {
        d4 = 365.0D;
      }
      double d5 = Math.pow(d2 / d4, 2.0D) - (2.0D * d2 / d4 - 1.0D) * (1.0D - 1.0D / d3);
      double d6 = Math.sqrt(d5);
      double d7 = 2.0D * d2 / d4 - 1.0D;
      d1 = 2.0D * (d6 - d2 / d4) / d7;
    }
    else
    {
      d1 = 365.0D * paramDouble / (360.0D - paramDouble * d2);
    }
    return d1;
  }
  
  static double b(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble)
  {
    double d1 = 0.0D;
    double d2 = a(paramDateTime1, paramDateTime2);
    d1 = 100.0D * (1.0D - paramDouble * d2 / 360.0D);
    return d1;
  }
  
  static double c(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble)
  {
    double d1 = 0.0D;
    double d2 = a(paramDateTime1, paramDateTime2);
    d1 = (100.0D - paramDouble) / paramDouble * 360.0D / d2;
    return d1;
  }
  
  private static double a(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    zl localzl = paramDateTime2.a(paramDateTime1);
    return localzl.b();
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = a(paramDouble1, paramDouble2, paramDouble3, 0.0D, paramInt3);
    int i = 1;
    if (paramInt3 == 1)
    {
      paramDouble3 += d4;
      i++;
    }
    while (i <= paramInt2)
    {
      d3 = paramDouble3 * paramDouble1;
      d1 = d4 + d3;
      paramDouble3 += d1;
      if (paramInt1 <= i) {
        d2 += d3;
      }
      i++;
    }
    return -d2;
  }
  
  static double b(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3)
  {
    double d = a(paramDouble1, paramDouble2, paramDouble3, paramInt1, paramInt2, paramInt3);
    return (paramInt2 - paramInt1 + 1) * a(paramDouble1, paramDouble2, paramDouble3, 0.0D, paramInt3) - d;
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    double d1 = 0.0D;
    if (paramDouble1 == 0.0D)
    {
      d1 = -(paramDouble4 + paramDouble3) / paramDouble2;
    }
    else
    {
      double d2 = Math.pow(1.0D + paramDouble1, paramDouble2);
      if (Double.isInfinite(d2))
      {
        d1 = -paramDouble3 * paramDouble1 / (1.0D + paramDouble1 * paramDouble5);
      }
      else
      {
        d1 = -paramDouble4;
        d1 = (d1 - paramDouble3 * d2) / ((1.0D + paramDouble5 * paramDouble1) * ((d2 - 1.0D) / paramDouble1));
      }
    }
    return d1;
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    double d1 = a(paramDouble1, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
    double d2 = d1;
    double d3 = 0.0D;
    if (paramDouble6 == 1.0D)
    {
      paramDouble2 -= 1.0D;
      paramDouble4 += d1;
    }
    for (int i = 0; i < paramDouble2; i++)
    {
      d3 = paramDouble4 * paramDouble1;
      d2 = d1 + d3;
      paramDouble4 += d2;
    }
    return d2;
  }
  
  static double b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    double d1 = a(paramDouble1, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
    double d2 = 0.0D;
    double d3 = 0.0D;
    if (paramDouble6 == 1.0D)
    {
      paramDouble2 -= 1.0D;
      paramDouble4 += d1;
    }
    for (int i = 0; i < paramDouble2; i++)
    {
      d3 = paramDouble4 * paramDouble1;
      d2 = d1 + d3;
      paramDouble4 += d2;
    }
    return -d3;
  }
  
  static double b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    double d1 = 0.0D;
    if (paramDouble1 == 0.0D)
    {
      d1 = -paramDouble4 - paramDouble3 * paramDouble2;
    }
    else
    {
      d1 = -paramDouble4;
      double d2 = Math.pow(1.0D + paramDouble1, paramDouble2);
      if (Double.isInfinite(d2))
      {
        d1 = -paramDouble3 * (1.0D + paramDouble1 * paramDouble5) / paramDouble1;
      }
      else
      {
        d1 -= paramDouble3 * (1.0D + paramDouble5 * paramDouble1) * ((d2 - 1.0D) / paramDouble1);
        d1 /= d2;
      }
    }
    return d1;
  }
  
  static double c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    double d1 = 0.0D;
    if (paramDouble1 == 0.0D)
    {
      d1 = -paramDouble4 - paramDouble3 * paramDouble2;
    }
    else
    {
      double d2 = a(1.0D + paramDouble1, paramDouble2);
      d1 = -paramDouble4 * d2;
      d1 -= paramDouble3 * (1.0D + paramDouble5 * paramDouble1) * (d2 - 1.0D) / paramDouble1;
    }
    return d1;
  }
  
  private static double a(double paramDouble1, double paramDouble2)
  {
    if (paramDouble2 < 0.0D) {
      return 1.0D / a(paramDouble1, -paramDouble2);
    }
    int i = (int)paramDouble2;
    if (paramDouble2 != i) {
      return Math.pow(paramDouble1, paramDouble2);
    }
    return a(paramDouble1, i);
  }
  
  private static double a(double paramDouble, int paramInt)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    if (paramInt == 0) {
      return 1.0D;
    }
    double d = 1.0D;
    while (paramInt != 0)
    {
      int i = paramInt % 2;
      int j = paramInt / 2;
      if (i != 0) {
        d *= paramDouble;
      }
      paramDouble *= paramDouble;
      paramInt = j;
    }
    return d;
  }
  
  static double d(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    double d1 = 1.0D - Math.pow(paramDouble2 / paramDouble1, 1.0D / paramDouble3);
    d1 = Math.floor(d1 * 1000.0D + 0.5D) / 1000.0D;
    double d2 = paramDouble1 * d1 * paramDouble5 / 12.0D;
    if (paramDouble4 <= 1.0D) {
      return d2 * paramDouble4;
    }
    if (paramDouble4 > 2.0D) {
      for (int i = 2; i < paramDouble4; i++) {
        d2 += (paramDouble1 - d2) * d1;
      }
    }
    if (paramDouble4 > paramDouble3) {
      return (paramDouble1 - d2) * d1 * (12.0D - paramDouble5) / 12.0D;
    }
    return (paramDouble1 - d2) * d1;
  }
  
  static double e(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    for (int i = 0; i < paramDouble4; i++)
    {
      d1 = (paramDouble1 - d2) * paramDouble5 / paramDouble3;
      if (d1 > paramDouble1 - paramDouble2 - d2)
      {
        d1 = paramDouble1 - paramDouble2 - d2;
        if (i != paramDouble4 - 1.0D) {
          return 0.0D;
        }
        return d1;
      }
      d2 += d1;
    }
    return d1;
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, boolean paramBoolean)
  {
    if (paramDouble5 > paramDouble3 + 1.0D) {
      return 0.0D;
    }
    double d1 = paramDouble6 / paramDouble3;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    int i = (int)(paramDouble5 + 0.5D);
    for (int j = 1; j <= i; j++)
    {
      d4 = Math.min((paramDouble1 - d2) * d1, paramDouble1 - d2 - paramDouble2);
      if (paramDouble4 < j) {
        d3 += d4;
      }
      d2 += d4;
    }
    return d3 - d4 * (i - paramDouble5);
  }
  
  static zaie f(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    if (paramDouble1 == 0.0D)
    {
      if (paramDouble2 == 0.0D) {
        return zabc.b;
      }
      if (-paramDouble3 - paramDouble4 == 0.0D) {
        return zabb.a;
      }
      return new zabb((-paramDouble3 - paramDouble4) / paramDouble2);
    }
    double d = paramDouble3 + paramDouble2 * (1.0D + paramDouble1 * paramDouble5) / paramDouble1;
    if (d == 0.0D) {
      return zabc.b;
    }
    return new zabb(zr.a((paramDouble2 * (1.0D + paramDouble1 * paramDouble5) / paramDouble1 - paramDouble4) / d, 1.0D + paramDouble1));
  }
  
  static zaie c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    if (paramDouble1 == 0.0D) {
      return zabc.b;
    }
    if (paramDouble3 + paramDouble4 + paramDouble2 * paramDouble1 == 0.0D) {
      return new zabb(0.0D);
    }
    if ((paramDouble2 < 0.0D) && (paramDouble4 == 0.0D))
    {
      double d = -paramDouble2 / paramDouble3;
      if (Math.abs(d) < Math.abs(paramDouble6)) {
        paramDouble6 = d;
      }
    }
    return zaqx.a(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
  }
  
  static double a(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 0: 
      return a(e(paramDateTime1, paramDateTime2, paramInt1, paramInt2), paramDateTime1, false);
    case 1: 
      return a(e(paramDateTime1, paramDateTime2, paramInt1, paramInt2), paramDateTime1);
    case 2: 
      return a(e(paramDateTime1, paramDateTime2, paramInt1, paramInt2), paramDateTime1);
    case 3: 
      return a(e(paramDateTime1, paramDateTime2, paramInt1, paramInt2), paramDateTime1);
    case 4: 
      return b(e(paramDateTime1, paramDateTime2, paramInt1, paramInt2), paramDateTime1);
    }
    return 0.0D;
  }
  
  static double b(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 0: 
      return 360.0D / paramInt1;
    case 1: 
      return a(paramDateTime1, paramDateTime2, paramInt1);
    case 2: 
      return 360.0D / paramInt1;
    case 3: 
      return 365.0D / paramInt1;
    case 4: 
      return 360.0D / paramInt1;
    }
    return 0.0D;
  }
  
  static double c(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 0: 
      DateTime localDateTime1 = e(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
      DateTime localDateTime2 = d(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
      double d1 = a(localDateTime1, localDateTime2, true);
      double d2 = a(localDateTime1, paramDateTime1, false);
      return d1 - d2;
    case 1: 
      return a(paramDateTime1, d(paramDateTime1, paramDateTime2, paramInt1, paramInt2));
    case 2: 
      return a(paramDateTime1, d(paramDateTime1, paramDateTime2, paramInt1, paramInt2));
    case 3: 
      return a(paramDateTime1, d(paramDateTime1, paramDateTime2, paramInt1, paramInt2));
    case 4: 
      return b(d(paramDateTime1, paramDateTime2, paramInt1, paramInt2), paramDateTime1);
    }
    return 0.0D;
  }
  
  static DateTime d(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    int i = a(paramDateTime1.getYear(), paramDateTime1.getMonth());
    if (i == paramDateTime1.getDay()) {
      bool = true;
    }
    int j = -12 / paramInt1;
    return a(paramDateTime1, paramDateTime2, j, paramInt2, 0.0D, bool);
  }
  
  static DateTime e(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt1, int paramInt2)
  {
    boolean bool = a(paramDateTime2);
    int i = -12 / paramInt1;
    int j = 0;
    if (i > 0) {
      j = zk.a(paramDateTime1, paramDateTime2) ? 0 : 1;
    } else {
      j = zk.a(paramDateTime2, paramDateTime1) ? 0 : 1;
    }
    if (j != 0) {
      return paramDateTime1;
    }
    DateTime localDateTime = paramDateTime2;
    while (zk.b(localDateTime, paramDateTime1))
    {
      localDateTime = a(localDateTime, i, paramInt2, bool);
      if (zk.a(localDateTime, paramDateTime2)) {
        localDateTime = paramDateTime1;
      }
    }
    return localDateTime;
  }
  
  static double f(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt1, int paramInt2)
  {
    DateTime localDateTime = e(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
    double d = (paramDateTime2.getYear() - localDateTime.getYear()) * 12 + (paramDateTime2.getMonth() - localDateTime.getMonth());
    return d * paramInt1 / 12.0D;
  }
  
  static zaie a(DateTime paramDateTime1, DateTime paramDateTime2, DateTime paramDateTime3, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    int j = 12 / i;
    DateTime localDateTime1;
    if (zk.b(paramDateTime3, paramDateTime2)) {
      localDateTime1 = e(paramDateTime2, paramDateTime3, j, paramInt2);
    } else {
      localDateTime1 = a(paramDateTime2, -j, paramInt2, true);
    }
    if (zk.a(localDateTime1, paramDateTime2)) {
      return zabc.b;
    }
    DateTime localDateTime2 = zk.b(paramDateTime1, localDateTime1) ? paramDateTime1 : localDateTime1;
    double d1 = a(localDateTime2, paramDateTime3, (byte)1, paramInt2);
    double d2 = b(localDateTime1, paramDateTime2, i, paramInt2);
    double d3 = d1 / d2;
    if (zk.b(localDateTime1, paramDateTime1))
    {
      if (paramInt2 == 0)
      {
        d1 = a(paramDateTime1, localDateTime2, zk.c(paramDateTime1, localDateTime1)) - 1.0D;
        d2 = b(localDateTime1, paramDateTime2, i, paramInt2);
      }
      else
      {
        d1 = a(paramDateTime1, localDateTime2, (byte)1, paramInt2);
        if (paramInt2 == 2) {
          d2 = b(localDateTime1, paramDateTime2, i, paramInt2);
        } else if (paramInt2 == 3) {
          d2 = 365.0D / i;
        } else {
          d2 = b(localDateTime1, paramDateTime2, i, paramInt2) - 2.0D;
        }
      }
      d3 += d1 / d2;
    }
    return new zabb(paramDouble2 * paramDouble1 / i * d3);
  }
  
  static double a(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, int paramInt)
  {
    double d1 = a(paramDateTime1, paramDateTime2, (byte)1, paramInt);
    double d2 = b(paramDateTime1, paramDateTime2, paramInt);
    return paramDouble2 * paramDouble1 * d1 / d2;
  }
  
  static double b(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, int paramInt)
  {
    double d1 = b(paramDateTime1, paramDateTime2, paramInt);
    double d2 = a(paramDateTime1, paramDateTime2, (byte)1, paramInt);
    double d3 = 1.0D - paramDouble1 / paramDouble2;
    double d4 = d3 * d1 / d2;
    return d4;
  }
  
  static double c(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, int paramInt)
  {
    double d1 = b(paramDateTime1, paramDateTime2, paramInt);
    double d2 = a(paramDateTime1, paramDateTime2, (byte)1, paramInt);
    return (paramDouble2 - paramDouble1) / paramDouble1 * d1 / d2;
  }
  
  static double d(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, int paramInt)
  {
    double d1 = b(paramDateTime1, paramDateTime2, paramInt);
    double d2 = a(paramDateTime1, paramDateTime2, (byte)1, paramInt);
    return paramDouble2 - paramDouble1 * paramDouble2 * d2 / d1;
  }
  
  static double e(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, int paramInt)
  {
    double d1 = b(paramDateTime1, paramDateTime2, paramInt);
    double d2 = a(paramDateTime1, paramDateTime2, (byte)1, paramInt);
    double d3 = paramDouble2 * d2 / d1;
    return paramDouble1 / (1.0D - d3);
  }
  
  static double f(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, int paramInt)
  {
    double d1 = b(paramDateTime1, paramDateTime2, paramInt);
    double d2 = a(paramDateTime1, paramDateTime2, (byte)1, paramInt);
    return (paramDouble2 - paramDouble1) / paramDouble1 * d1 / d2;
  }
  
  static double a(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    double d1 = a(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
    double d2 = b(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
    double d3 = f(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
    double d4 = d2 - d1;
    double d5 = d4 / d2;
    double d6 = d5 + d3 - 1.0D;
    double d7 = paramDouble2 / paramInt1 + 1.0D;
    double d8 = Math.pow(d7, d6);
    double d9 = d6 * 100.0D / d8;
    double d10 = 100.0D / d8;
    double d11 = 0.0D;
    double d12 = 0.0D;
    for (int i = 1; i <= d3; i++)
    {
      double d14 = i - 1 + d5;
      double d16 = Math.pow(d7, d14);
      double d17 = 100.0D * paramDouble1 / paramInt1 / d16;
      d11 += d17 * d14;
      d12 += d17;
    }
    double d13 = d9 + d11;
    double d15 = d10 + d12;
    if (paramBoolean) {
      return d13 / d15 / paramInt1 / d7;
    }
    return d13 / d15 / paramInt1;
  }
  
  static double a(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2)
  {
    double d1 = f(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
    DateTime localDateTime = e(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
    double d2 = a(localDateTime, paramDateTime1, (byte)1, paramInt2);
    double d3 = b(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
    double d4 = d3 - d2;
    double d5 = 100.0D * paramDouble1 / paramInt1;
    double d6 = d5 * d2 / d3;
    if (d1 == 1.0D) {
      return (paramDouble3 + d5) / (1.0D + d4 / d3 * paramDouble2 / paramInt1) - d6;
    }
    double d7 = paramDouble3 / Math.pow(1.0D + paramDouble2 / paramInt1, d1 - 1.0D + d4 / d3);
    double d8 = 0.0D;
    for (int i = 1; i <= d1; i++) {
      d8 += d5 / Math.pow(1.0D + paramDouble2 / paramInt1, i - 1 + d4 / d3);
    }
    return d7 + d8 - d6;
  }
  
  static zaie b(DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2)
  {
    if (f(paramDateTime1, paramDateTime2, paramInt1, paramInt2) <= 1.0D)
    {
      DateTime localDateTime = e(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
      double d1 = a(localDateTime, paramDateTime1, (byte)1, paramInt2);
      double d2 = b(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
      double d3 = paramDouble3 / 100.0D + paramDouble1 / paramInt1;
      double d4 = paramDouble2 / 100.0D + d1 / d2 * paramDouble1 / paramInt1;
      return new zabb((d3 / d4 - 1.0D) * paramInt1 * d2 / (paramInt2 == 0 ? d2 - d1 + 1.0D : d2 - d1));
    }
    return zaqz.a(paramDateTime1, paramDateTime2, paramDouble1, paramDouble2, (int)paramDouble3, paramInt1, paramInt2, 0.001D, 0.05D);
  }
  
  static double a(DateTime paramDateTime1, DateTime paramDateTime2, DateTime paramDateTime3, double paramDouble1, double paramDouble2, int paramInt)
  {
    double d1 = b(paramDateTime3, paramDateTime1, paramInt);
    double d2 = a(paramDateTime3, paramDateTime2, (byte)1, paramInt);
    double d3 = a(paramDateTime3, paramDateTime1, (byte)1, paramInt);
    double d4 = d2 - d3;
    double d5 = 100.0D + d2 / d1 * paramDouble1 * 100.0D;
    double d6 = 1.0D + d4 / d1 * paramDouble2;
    double d7 = d3 / d1 * paramDouble1 * 100.0D;
    return d5 / d6 - d7;
  }
  
  static double b(DateTime paramDateTime1, DateTime paramDateTime2, DateTime paramDateTime3, double paramDouble1, double paramDouble2, int paramInt)
  {
    double d1 = b(paramDateTime3, paramDateTime1, paramInt);
    double d2 = a(paramDateTime3, paramDateTime2, (byte)1, paramInt);
    double d3 = a(paramDateTime3, paramDateTime1, (byte)1, paramInt);
    double d4 = d2 - d3;
    double d5 = d2 / d1 * paramDouble1 + 1.0D - paramDouble2 / 100.0D - d3 / d1 * paramDouble1;
    double d6 = paramDouble2 / 100.0D + d3 / d1 * paramDouble1;
    double d7 = d1 / d4;
    return d5 / d6 * d7;
  }
  
  static double a(DateTime paramDateTime1, DateTime paramDateTime2, DateTime paramDateTime3, DateTime paramDateTime4, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2)
  {
    int i = 12 / paramInt1;
    int j = -i;
    double d1 = b(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
    double d2 = f(paramDateTime1, paramDateTime2, paramInt1, paramInt2);
    double d3 = paramInt1;
    double d4 = c(paramDateTime3, paramDateTime4, paramInt2);
    double d18;
    if (d4 < d1)
    {
      d5 = c(paramDateTime1, paramDateTime4, paramInt2);
      double d6 = c(paramDateTime3, paramDateTime1, paramInt2);
      double d8 = paramDouble2 / d3 + 1.0D;
      double d10 = d5 / d1;
      double d12 = d8;
      double d14 = Math.pow(d12, d2 - 1.0D + d10);
      double d16 = paramDouble3 / d14;
      d18 = 100.0D * paramDouble1 / d3 * d4 / d1 / Math.pow(d12, d10);
      double d20 = 0.0D;
      for (int k = 2; k <= d2; k++)
      {
        d23 = 100.0D * paramDouble1 / d3 / Math.pow(d12, k - 1 + d10);
        d20 += d23;
      }
      double d22 = paramDouble1 / d3;
      double d24 = d6 / d1 * d22 * 100.0D;
      return d16 + d18 + d20 - d24;
    }
    double d5 = f(paramDateTime3, paramDateTime4, paramInt1, paramInt2);
    Object localObject1 = paramDateTime4;
    double d7 = 0.0D;
    double d9 = 0.0D;
    double d11 = 0.0D;
    double d13 = 0.0D;
    DateTime localDateTime;
    for (double d15 = d5; d15 >= 1.0D; d15 -= 1.0D)
    {
      localDateTime = a((DateTime)localObject1, j, paramInt2, true);
      d18 = 0.0D;
      if (paramInt2 == 1) {
        d18 = c(localDateTime, (DateTime)localObject1, paramInt2);
      } else {
        d18 = d1;
      }
      if (d15 > 1.0D) {
        d11 = d18;
      } else {
        d11 = c(paramDateTime3, (DateTime)localObject1, paramInt2);
      }
      Object localObject2 = zk.b(paramDateTime3, localDateTime) ? paramDateTime3 : localDateTime;
      Object localObject3 = zk.d(paramDateTime1, (DateTime)localObject1) ? paramDateTime1 : localObject1;
      d13 = c((DateTime)localObject2, (DateTime)localObject3, paramInt2);
      localObject1 = localDateTime;
      d7 += d11 / d18;
      d9 += d13 / d18;
    }
    d15 = 0.0D;
    if ((paramInt2 == 2) || (paramInt2 == 3))
    {
      localDateTime = d(paramDateTime1, paramDateTime4, paramInt1, paramInt2);
      d15 = c(paramDateTime1, localDateTime, paramInt2);
    }
    else
    {
      localDateTime = e(paramDateTime1, paramDateTime4, paramInt1, paramInt2);
      d18 = a(localDateTime, paramDateTime1, (byte)1, paramInt2);
      d15 = d1 - d18;
    }
    double d17 = a(paramDateTime4, paramDateTime1, i, paramInt2, true);
    double d19 = f(paramDateTime4, paramDateTime2, paramInt1, paramInt2);
    double d21 = paramDouble2 / d3 + 1.0D;
    double d23 = d15 / d1;
    double d25 = d21;
    double d26 = Math.pow(d25, d23 + d17 + d19);
    double d27 = paramDouble3 / d26;
    double d28 = 100.0D * paramDouble1 / d3 * d7 / Math.pow(d25, d17 + d23);
    double d29 = 0.0D;
    for (int m = 1; m <= d19; m++)
    {
      double d31 = 100.0D * paramDouble1 / d3 / Math.pow(d25, m + d17 + d23);
      d29 += d31;
    }
    double d30 = 100.0D * paramDouble1 / d3 * d9;
    return d27 + d28 + d29 - d30;
  }
  
  static double a(DateTime paramDateTime1, DateTime paramDateTime2, DateTime paramDateTime3, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    double d1 = paramInt1;
    int i = 12 / paramInt1;
    DateTime localDateTime1 = paramDateTime3;
    double d2 = f(localDateTime1, paramDateTime2, paramInt1, paramInt2);
    Object localObject1 = localDateTime1;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    for (double d8 = 1.0D; d8 <= d2; d8 += 1.0D)
    {
      DateTime localDateTime2 = a((DateTime)localObject1, i, paramInt2, true);
      double d10 = d((DateTime)localObject1, localDateTime2, paramInt2);
      if (d8 < d2) {
        d5 = d10;
      } else {
        d5 = d((DateTime)localObject1, paramDateTime2, paramInt2);
      }
      if (zk.d(localDateTime2, paramDateTime1)) {
        d6 = d5;
      } else if (zk.d((DateTime)localObject1, paramDateTime1)) {
        d6 = c((DateTime)localObject1, paramDateTime1, paramInt2);
      } else {
        d6 = 0.0D;
      }
      Object localObject2 = zk.b(paramDateTime1, (DateTime)localObject1) ? paramDateTime1 : localObject1;
      DateTime localDateTime3 = zk.d(paramDateTime2, localDateTime2) ? paramDateTime2 : localDateTime2;
      double d13 = c((DateTime)localObject2, localDateTime3, paramInt2);
      localObject1 = localDateTime2;
      d3 += d5 / d10;
      d4 += d6 / d10;
      d7 += d13 / d10;
    }
    d8 = 100.0D * paramDouble1 / d1;
    double d9 = d3 * d8 + paramDouble3;
    double d11 = 0.0D;
    double d12 = 0.0D;
    if (paramBoolean)
    {
      d11 = d7 * paramDouble2 / d1 + 1.0D;
      d12 = d4 * d8;
      return d9 / d11 - d12;
    }
    d11 = d4 * d8 + paramDouble2;
    d12 = d1 / d7;
    return (d9 - d11) / d11 * d12;
  }
  
  static zaie a(double paramDouble1, DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble2 < 0.0D) || (paramDouble2 >= paramDouble1) || (paramDouble3 < 0.0D) || (zk.a(paramDateTime1, paramDateTime2)) || (paramDouble4 < 0.0D) || (paramInt == 2)) {
      return zabc.b;
    }
    double d1 = 1.0D / paramDouble4;
    if (((d1 > 0.0D) && (d1 < 3.0D)) || ((d1 > 4.0D) && (d1 < 5.0D))) {
      return zabc.b;
    }
    double d2 = Math.ceil(d1);
    if ((paramDouble1 == paramDouble2) || (paramDouble3 > d2)) {
      return zabb.a;
    }
    double d3 = b(d2);
    double d4 = paramDouble4 * d3;
    double d5 = a(paramDateTime1, paramInt);
    DateTime localDateTime1 = b(paramDateTime1, paramInt);
    DateTime localDateTime2 = b(paramDateTime2, paramInt);
    double d6 = a(localDateTime1, localDateTime2, (byte)1, paramInt);
    double d7 = d6 / d5 * d4 * paramDouble1;
    double d8 = 0.0D;
    if (d7 == 0.0D) {
      d8 = paramDouble1 * d4;
    } else {
      d8 = d7;
    }
    double d9 = 0.0D;
    if (d7 == 0.0D) {
      d9 = d2;
    } else {
      d9 = d2 + 1.0D;
    }
    double d10 = paramDouble1 - paramDouble2;
    double d11 = 0.0D;
    if (d8 > d10) {
      d11 = d10;
    } else {
      d11 = d8;
    }
    double d12 = c(d11);
    double d13 = 0.0D;
    if (paramDouble3 == 0.0D) {
      d13 = d12;
    } else {
      d13 = a(1.0D, 0.0D, d4, paramDouble1 - d12, d9, paramDouble3, paramDouble2);
    }
    return new zabb(d13);
  }
  
  static zaie b(double paramDouble1, DateTime paramDateTime1, DateTime paramDateTime2, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt)
  {
    if ((paramDouble1 < 0.0D) || (paramDouble2 < 0.0D) || (paramDouble2 >= paramDouble1) || (paramDouble3 < 0.0D) || (zk.a(paramDateTime1, paramDateTime2)) || (paramDouble4 < 0.0D) || (paramInt == 2)) {
      return zabc.b;
    }
    double d1 = Math.ceil(1.0D / paramDouble4);
    double d2 = a(paramDateTime1, paramInt);
    DateTime localDateTime1 = b(paramDateTime1, paramInt);
    DateTime localDateTime2 = b(paramDateTime2, paramInt);
    double d3 = a(localDateTime1, localDateTime2, (byte)1, paramInt);
    double d4 = d3 / d2 * paramDouble4 * paramDouble1;
    double d5 = 0.0D;
    if (d4 == 0.0D) {
      d5 = paramDouble1 * paramDouble4;
    } else {
      d5 = d4;
    }
    double d6 = 0.0D;
    if (d4 == 0.0D) {
      d6 = d1;
    } else {
      d6 = d1 + 1.0D;
    }
    double d7 = paramDouble1 - paramDouble2;
    double d8 = 0.0D;
    if (d5 > d7) {
      d8 = d7;
    } else {
      d8 = d5;
    }
    double d9 = 0.0D;
    if ((paramDouble1 == paramDouble2) || (paramDouble3 > d6))
    {
      d9 = 0.0D;
    }
    else if (paramDouble3 == 0.0D)
    {
      d9 = d8;
    }
    else
    {
      double d10 = paramDouble4 * paramDouble1;
      double d11 = paramDouble1 - paramDouble2 - d8;
      d9 = a(1.0D, d10, d11, paramDouble3);
    }
    return new zabb(d9);
  }
  
  static zaie a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
  {
    int i = 0;
    for (int j = paramInt1; j < paramInt2; j++) {
      if (paramArrayOfDouble[j] < 0.0D) {
        i++;
      }
    }
    if ((i == 0) || (i == paramInt2 - paramInt1)) {
      return zabc.a;
    }
    double[] arrayOfDouble1 = new double[paramInt2 - paramInt1 - i];
    double[] arrayOfDouble2 = new double[i];
    int k = 0;
    int m = 0;
    for (int n = paramInt1; n < paramInt2; n++) {
      if (paramArrayOfDouble[n] < 0.0D) {
        arrayOfDouble2[(m++)] = paramArrayOfDouble[n];
      } else {
        arrayOfDouble1[(k++)] = paramArrayOfDouble[n];
      }
    }
    double d1 = -a(paramDouble2, arrayOfDouble1) * Math.pow(1.0D + paramDouble2, arrayOfDouble1.length);
    double d2 = a(paramDouble1, arrayOfDouble2) * (1.0D + paramDouble1);
    return new zabb(Math.pow(d1 / d2, 1.0D / (paramInt2 - paramInt1 - 1)) - 1.0D);
  }
  
  private static double a(double paramDouble, double[] paramArrayOfDouble)
  {
    double d1 = paramDouble + 1.0D;
    double d2 = 0.0D;
    for (int i = 0; i < paramArrayOfDouble.length; i++)
    {
      d2 += paramArrayOfDouble[i] / d1;
      d1 *= (paramDouble + 1.0D);
    }
    return d2;
  }
  
  private static double a(DateTime paramDateTime1, DateTime paramDateTime2, boolean paramBoolean)
  {
    if ((paramDateTime2.getDay() == 31) && ((paramBoolean) || (paramDateTime1.getDay() >= 30))) {
      paramDateTime2 = new DateTime(paramDateTime2.getYear(), paramDateTime2.getMonth(), 30);
    }
    if (paramDateTime1.getDay() == 31) {
      paramDateTime1 = new DateTime(paramDateTime1.getYear(), paramDateTime1.getMonth(), 30);
    }
    return c(paramDateTime1, paramDateTime2);
  }
  
  private static double b(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    int i = paramDateTime2.getDay();
    int j = paramDateTime1.getDay();
    if (j == 31) {
      j = 30;
    }
    if (i == 31) {
      i = 30;
    }
    return c(new DateTime(paramDateTime1.getYear(), paramDateTime1.getMonth(), j), new DateTime(paramDateTime2.getYear(), paramDateTime2.getMonth(), i));
  }
  
  private static double c(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    double d1 = paramDateTime2.getYear() - paramDateTime1.getYear();
    double d2 = paramDateTime2.getMonth() - paramDateTime1.getMonth();
    double d3 = paramDateTime2.getDay() - paramDateTime1.getDay();
    return d1 * 360.0D + d2 * 30.0D + d3;
  }
  
  private static double d(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    DateTime localDateTime1 = paramDateTime1;
    DateTime localDateTime2 = paramDateTime2;
    if ((paramDateTime1.getDay() > 28) && (paramDateTime1.getMonth() == 2)) {
      localDateTime1 = new DateTime(localDateTime1.getYear(), localDateTime1.getMonth(), 28);
    }
    if ((paramDateTime2.getDay() > 28) && (paramDateTime2.getMonth() == 2)) {
      localDateTime2 = new DateTime(localDateTime2.getYear(), localDateTime2.getMonth(), 28);
    }
    DateTime localDateTime3 = new DateTime(localDateTime2.getYear(), localDateTime1.getMonth(), localDateTime1.getDay());
    return (localDateTime2.getYear() - localDateTime1.getYear()) * 365 + a(localDateTime3, localDateTime2);
  }
  
  private static boolean a(DateTime paramDateTime)
  {
    int i = paramDateTime.getMonth();
    paramDateTime = paramDateTime.addDays(1.0D);
    return paramDateTime.getMonth() != i;
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 4: 
    case 6: 
    case 9: 
    case 11: 
      return 30;
    case 2: 
      DateTime localDateTime = new DateTime(paramInt1, paramInt2 + 1, 1);
      return localDateTime.addDays(-1.0D).getDay();
    }
    return 31;
  }
  
  private static double a(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt)
  {
    DateTime localDateTime1 = e(paramDateTime1, paramDateTime2, paramInt, 1);
    DateTime localDateTime2 = d(paramDateTime1, paramDateTime2, paramInt, 1);
    return a(localDateTime1, localDateTime2);
  }
  
  private static DateTime a(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt1, int paramInt2, double paramDouble, boolean paramBoolean)
  {
    int i = 0;
    if (paramInt1 > 0) {
      i = zk.a(paramDateTime1, paramDateTime2) ? 0 : 1;
    } else {
      i = zk.a(paramDateTime2, paramDateTime1) ? 0 : 1;
    }
    if (i != 0) {
      return paramDateTime1;
    }
    DateTime localDateTime1 = paramDateTime2;
    DateTime localDateTime2 = paramDateTime2;
    while (zk.b(localDateTime1, paramDateTime1))
    {
      localDateTime2 = localDateTime1;
      localDateTime1 = a(localDateTime1, paramInt1, paramInt2, true);
      if (zk.a(localDateTime1, paramDateTime2)) {
        localDateTime1 = paramDateTime1;
      }
    }
    return localDateTime2;
  }
  
  private static DateTime a(DateTime paramDateTime, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    DateTime localDateTime = paramDateTime.addMonths(paramInt1);
    if ((paramBoolean) && (paramInt2 == 1) && (a(paramDateTime)) && (!a(localDateTime))) {
      return new DateTime(localDateTime.getYear(), localDateTime.getMonth(), a(localDateTime.getYear(), localDateTime.getMonth()));
    }
    return localDateTime;
  }
  
  private static double a(DateTime paramDateTime1, DateTime paramDateTime2, byte paramByte, int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return a(paramDateTime1, paramDateTime2, false);
    case 1: 
      return a(paramDateTime1, paramDateTime2);
    case 2: 
      if (paramByte == 1) {
        return a(paramDateTime1, paramDateTime2);
      }
      return a(paramDateTime1, paramDateTime2, false);
    case 3: 
      if (paramByte == 1) {
        return a(paramDateTime1, paramDateTime2);
      }
      return d(paramDateTime1, paramDateTime2);
    case 4: 
      return b(paramDateTime1, paramDateTime2);
    }
    return 0.0D;
  }
  
  private static double b(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 360.0D;
    case 1: 
      if (!e(paramDateTime1, paramDateTime2))
      {
        double d1 = paramDateTime2.getYear() - paramDateTime1.getYear() + 1;
        double d2 = a(new DateTime(paramDateTime1.getYear(), 1, 1), new DateTime(paramDateTime2.getYear() + 1, 1, 1));
        return d2 / d1;
      }
      if (f(paramDateTime1, paramDateTime2)) {
        return 366.0D;
      }
      return 365.0D;
    case 2: 
      return 360.0D;
    case 3: 
      return 365.0D;
    case 4: 
      return 360.0D;
    }
    return 360.0D;
  }
  
  private static boolean e(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    return (paramDateTime1.getYear() == paramDateTime2.getYear()) || ((paramDateTime2.getYear() == paramDateTime1.getYear() + 1) && ((paramDateTime1.getMonth() > paramDateTime2.getMonth()) || ((paramDateTime1.getMonth() == paramDateTime2.getMonth()) && (paramDateTime1.getDay() >= paramDateTime2.getDay()))));
  }
  
  private static boolean f(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    return ((paramDateTime1.getYear() == paramDateTime2.getYear()) && (a(paramDateTime1.getYear()))) || ((paramDateTime2.getMonth() == 2) && (paramDateTime2.getDay() == 29)) || (g(paramDateTime1, paramDateTime2));
  }
  
  private static boolean g(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    if ((paramDateTime1.getYear() == paramDateTime2.getYear()) && (a(paramDateTime1.getYear()))) {
      return (paramDateTime1.getMonth() <= 2) && (paramDateTime2.getMonth() > 2);
    }
    if (paramDateTime1.getYear() == paramDateTime2.getYear()) {
      return false;
    }
    if (paramDateTime2.getYear() == paramDateTime1.getYear() + 1)
    {
      if (a(paramDateTime1.getYear())) {
        return paramDateTime1.getMonth() <= 2;
      }
      if (a(paramDateTime2.getYear())) {
        return paramDateTime2.getMonth() > 2;
      }
      return false;
    }
    return false;
  }
  
  private static boolean a(double paramDouble)
  {
    return ((paramDouble % 4.0D == 0.0D) && (paramDouble % 100.0D != 0.0D)) || (paramDouble % 400.0D == 0.0D);
  }
  
  private static double a(DateTime paramDateTime, int paramInt)
  {
    if (paramInt == 1)
    {
      if (a(paramDateTime.getYear())) {
        return 366.0D;
      }
      return 365.0D;
    }
    return b(paramDateTime, paramDateTime, paramInt);
  }
  
  private static DateTime b(DateTime paramDateTime, int paramInt)
  {
    if (((paramInt == 1) || (paramInt == 3)) && (a(paramDateTime.getYear())) && (paramDateTime.getMonth() == 2) && (paramDateTime.getDay() >= 28)) {
      return new DateTime(paramDateTime.getYear(), paramDateTime.getMonth(), 28);
    }
    return paramDateTime;
  }
  
  private static double c(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt)
  {
    return Math.max(a(paramDateTime1, paramDateTime2, (byte)1, paramInt), 0.0D);
  }
  
  private static int a(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i;
    if (paramInt1 > 0) {
      i = zk.a(paramDateTime1, paramDateTime2) ? 0 : 1;
    } else {
      i = zk.a(paramDateTime2, paramDateTime1) ? 0 : 1;
    }
    if (i != 0) {
      return 0;
    }
    int j = -1;
    DateTime localDateTime = paramDateTime2;
    while (zk.d(localDateTime, paramDateTime1))
    {
      localDateTime = a(localDateTime, paramInt1, paramInt2, true);
      j++;
    }
    return j;
  }
  
  private static double d(DateTime paramDateTime1, DateTime paramDateTime2, int paramInt)
  {
    if (paramInt == 0) {
      return h(paramDateTime1, paramDateTime2);
    }
    return c(paramDateTime1, paramDateTime2, paramInt);
  }
  
  private static double h(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    return Math.max(a(paramDateTime1, paramDateTime2, true), 0.0D);
  }
  
  private static double b(double paramDouble)
  {
    if ((paramDouble >= 3.0D) && (paramDouble <= 4.0D)) {
      return 1.5D;
    }
    if ((paramDouble >= 5.0D) && (paramDouble <= 6.0D)) {
      return 2.0D;
    }
    if (paramDouble > 6.0D) {
      return 2.5D;
    }
    return 1.0D;
  }
  
  private static double c(double paramDouble)
  {
    if (paramDouble > 0.0D) {
      return Math.floor(paramDouble + 0.5D);
    }
    return Math.ceil(paramDouble - 0.5D);
  }
  
  private static boolean b(double paramDouble1, double paramDouble2)
  {
    return Math.abs(paramDouble1 - paramDouble2) < 1.0E-4D;
  }
  
  private static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7)
  {
    if (paramDouble1 > paramDouble6) {
      return c(paramDouble2);
    }
    paramDouble1 += 1.0D;
    double d1 = paramDouble5 - paramDouble1;
    double d2 = b(d1, 2.0D) ? paramDouble4 * 0.5D : paramDouble4 * paramDouble3;
    paramDouble3 = b(d1, 2.0D) ? 1.0D : paramDouble3;
    if (paramDouble4 < paramDouble7)
    {
      if (paramDouble4 - paramDouble7 < 0.0D) {
        paramDouble2 = 0.0D;
      } else {
        paramDouble2 = paramDouble4 - paramDouble7;
      }
    }
    else {
      paramDouble2 = d2;
    }
    paramDouble4 -= paramDouble2;
    return a(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramDouble7);
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    if (paramDouble1 > paramDouble4) {
      return paramDouble2;
    }
    paramDouble2 = paramDouble2 > paramDouble3 ? paramDouble3 : paramDouble2;
    double d = paramDouble3 - paramDouble2;
    paramDouble3 = d < 0.0D ? 0.0D : d;
    return a(paramDouble1 + 1.0D, paramDouble2, paramDouble3, paramDouble4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */