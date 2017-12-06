package com.aspose.cells;

import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zq;
import com.aspose.cells.b.a.zw;

class zayi
{
  static double a(byte[] paramArrayOfByte, int paramInt)
  {
    return a(zc.a(paramArrayOfByte, paramInt));
  }
  
  static double a(int paramInt)
  {
    switch (paramInt & 0x3)
    {
    case 1: 
      return Double.longBitsToDouble((paramInt & 0xFFFFFFFC) << 32) / 100.0D;
    case 2: 
      return paramInt >> 2;
    case 3: 
      return (paramInt >> 2) / 100.0D;
    }
    return Double.longBitsToDouble(paramInt << 32);
  }
  
  static String b(int paramInt)
  {
    String str;
    switch (paramInt & 0x3)
    {
    case 1: 
      str = com.aspose.cells.a.c.zp.b(Double.longBitsToDouble((paramInt & 0xFFFFFFFC) << 32));
      int i = str.indexOf('.');
      if (i < 0) {
        return a(str);
      }
      if (i == 1)
      {
        if (str.charAt(0) == '-') {
          return "-0.00" + str.substring(2);
        }
        return "0.0" + str.charAt(0) + str.substring(2);
      }
      return a(str.substring(0, 0 + i)) + str.substring(i + 1);
    case 2: 
      return com.aspose.cells.b.a.zp.a(paramInt >> 2);
    case 3: 
      str = com.aspose.cells.b.a.zp.a(paramInt >> 2);
      return a(str);
    }
    return com.aspose.cells.a.c.zp.b(Double.longBitsToDouble(paramInt << 32));
  }
  
  private static String a(String paramString)
  {
    switch (paramString.length())
    {
    case 0: 
      return "0.00";
    case 1: 
      return "0.0" + paramString;
    case 2: 
      if (paramString.charAt(0) == '-') {
        return "-0.0" + paramString.charAt(1);
      }
      return "0." + paramString;
    case 3: 
      if (paramString.charAt(0) == '-') {
        return "-0." + paramString.substring(1);
      }
      return paramString.charAt(0) + "." + paramString.substring(1);
    }
    int i = paramString.length() - 2;
    return paramString.substring(0, 0 + i) + "." + paramString.substring(i, i + 2);
  }
  
  static void a(long paramLong, zgs paramzgs)
  {
    if ((paramLong <= 536870911L) && (paramLong >= -536870912L))
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf((int)paramLong << 2 | 0x2);
      return;
    }
    long l = Double.doubleToRawLongBits(paramLong);
    if ((l & 0x3FFFFFFFF) == 0L)
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf((int)(l >> 32));
      return;
    }
    l = Double.doubleToRawLongBits(paramLong * 100.0D);
    if ((l & 0x3FFFFFFFF) == 0L)
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf((int)(l >> 32) | 0x1);
      return;
    }
    paramzgs.c = 1;
    paramzgs.d = Double.valueOf(paramLong);
  }
  
  static void a(double paramDouble, zgs paramzgs)
  {
    if ((paramDouble == 5.36870911E8D) || (paramDouble == -5.36870912E8D))
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf((int)paramDouble << 2 | 0x2);
      return;
    }
    if ((paramDouble < 5.36870911E8D) && (paramDouble > -5.36870912E8D))
    {
      int i = (int)paramDouble;
      if (Math.abs(paramDouble - i) < Double.MIN_VALUE)
      {
        i <<= 2;
        i |= 0x2;
        paramzgs.c = 6;
        paramzgs.d = Integer.valueOf(i);
        return;
      }
    }
    long l = Double.doubleToRawLongBits(paramDouble);
    if ((l & 0x3FFFFFFFF) == 0L)
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf((int)(l >> 32));
      return;
    }
    if ((paramDouble <= 1.7976931348623156E306D) && (paramDouble >= -1.7976931348623156E306D))
    {
      String str = com.aspose.cells.a.c.zp.b(paramDouble);
      int j = str.indexOf('E') + 1;
      if (j > 0)
      {
        str = str.substring(0, 0 + j) + (com.aspose.cells.b.a.zp.a(str.substring(j), za.b()) + 2);
      }
      else
      {
        j = str.indexOf('.');
        if (j < 0) {
          str = str + "00";
        } else {
          switch (str.length() - j)
          {
          case 1: 
            str = str.substring(0, 0 + j) + "00";
            break;
          case 2: 
            str = str.substring(0, 0 + j) + str.charAt(j + 1) + "0";
            break;
          case 3: 
            str = str.substring(0, 0 + j) + str.substring(j + 1);
            break;
          default: 
            str = str.substring(0, 0 + j) + str.substring(j + 1, j + 1 + 2) + "." + str.substring(j + 3);
          }
        }
      }
      double d = zo.a(str, za.b());
      if ((d == 5.36870911E8D) || (d == -5.36870912E8D))
      {
        paramzgs.c = 6;
        paramzgs.d = Integer.valueOf((int)d << 2 | 0x3);
        return;
      }
      if ((d < 5.36870911E8D) && (d > -5.36870912E8D))
      {
        int k = (int)d;
        if (Math.abs(d - k) < Double.MIN_VALUE)
        {
          k <<= 2;
          k |= 0x3;
          paramzgs.c = 6;
          paramzgs.d = Integer.valueOf(k);
          return;
        }
      }
      l = Double.doubleToRawLongBits(d);
      if ((l & 0x3FFFFFFFF) == 0L)
      {
        paramzgs.c = 6;
        paramzgs.d = Integer.valueOf((int)(l >> 32) | 0x1);
        return;
      }
    }
    paramzgs.c = 1;
    paramzgs.d = Double.valueOf(paramDouble);
  }
  
  static void a(String paramString1, String paramString2, zgs paramzgs)
  {
    if (paramString2.length() < 3)
    {
      b(paramString1 + paramString2, paramzgs);
      return;
    }
    double d1 = zo.a(paramString1 + "." + paramString2, za.b());
    long l = Double.doubleToRawLongBits(d1);
    if ((l & 0x3FFFFFFFF) == 0L)
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf((int)(l >> 32));
      return;
    }
    if (paramString2.length() > 2)
    {
      double d2 = zo.a(paramString1 + paramString2.substring(0, 2) + "." + paramString2.substring(2), za.b());
      l = Double.doubleToRawLongBits(d2);
      if ((l & 0x3FFFFFFFF) == 0L)
      {
        paramzgs.c = 6;
        paramzgs.d = Integer.valueOf((int)(l >> 32) | 0x1);
        return;
      }
    }
    paramzgs.c = 1;
    paramzgs.d = Double.valueOf(d1);
  }
  
  static void a(String paramString, zgs paramzgs)
  {
    int i = paramString.indexOf('E');
    if (i < 0) {
      i = paramString.indexOf('e');
    }
    if (i < 0)
    {
      i = paramString.indexOf('.');
      if (i < 0)
      {
        c(paramString, paramzgs);
        return;
      }
      for (j = paramString.length() - 1; j > i; j--) {
        if (paramString.charAt(j) != '0')
        {
          a(paramString.substring(0, 0 + i), paramString.substring(i + 1, i + 1 + (j - i)), paramzgs);
          return;
        }
      }
      if (i == 0)
      {
        paramzgs.c = 6;
        paramzgs.d = Integer.valueOf(2);
        return;
      }
      c(paramString.substring(0, 0 + i), paramzgs);
      return;
    }
    int j = com.aspose.cells.b.a.zp.a(paramString.charAt(i + 1) == '+' ? paramString.substring(i + 2) : paramString.substring(i + 1), za.b());
    int k;
    if (j == 0)
    {
      k = paramString.indexOf('.');
      if ((k > -1) && (k < i))
      {
        i--;
        while (i > k)
        {
          if (paramString.charAt(i) != '0')
          {
            a(paramString.substring(0, 0 + k), paramString.substring(k + 1, k + 1 + (i - k)), paramzgs);
            return;
          }
          i--;
        }
      }
      c(paramString.substring(0, 0 + i), paramzgs);
      return;
    }
    if (j < 0)
    {
      if (j > -20)
      {
        k = paramString.indexOf('.');
        if ((k > -1) && (k < i))
        {
          i--;
          while (i > k)
          {
            if (paramString.charAt(i) != '0')
            {
              if (paramString.charAt(0) == '-')
              {
                if (k > 1 - j) {
                  a(paramString.substring(0, 0 + (k + j)), paramString.substring(k + j, k + j + -j) + paramString.substring(k + 1, k + 1 + (i - k)), paramzgs);
                } else if (k == 1 - j) {
                  a("-0", paramString.substring(1, 1 + (k - 1)) + paramString.substring(k + 1, k + 1 + (i - k)), paramzgs);
                } else {
                  a("-0", zw.a('0', 1 - j - k) + paramString.substring(1, 1 + (k - 1)) + paramString.substring(k + 1, k + 1 + (i - k)), paramzgs);
                }
              }
              else if (k > -j) {
                a(paramString.substring(0, 0 + (k + j)), paramString.substring(k + j, k + j + -j) + paramString.substring(k + 1, k + 1 + (i - k)), paramzgs);
              } else if (k == -j) {
                a("0", paramString.substring(0, 0 + k) + paramString.substring(k + 1, k + 1 + (i - k)), paramzgs);
              } else {
                a("0", zw.a('0', -j - k) + paramString.substring(0, 0 + k) + paramString.substring(k + 1, k + 1 + (i - k)), paramzgs);
              }
              return;
            }
            i--;
          }
        }
        i--;
        if (paramString.charAt(0) == '-') {
          while (i > 0)
          {
            if (paramString.charAt(i) != '0')
            {
              i++;
              if (i > 1 - j) {
                a(paramString.substring(0, 0 + (i + j)), paramString.substring(i + j, i + j + -j), paramzgs);
              } else if (i == 1 - j) {
                a("-0", paramString.substring(1, 1 + (i - 1)), paramzgs);
              } else {
                a("-0", zw.a('0', 1 - j - i) + paramString.substring(1, 1 + (i - 1)), paramzgs);
              }
              return;
            }
            j++;
            if (j == 0)
            {
              c(paramString.substring(0, 0 + i), paramzgs);
              return;
            }
            i--;
          }
        }
        while (i > -1)
        {
          if (paramString.charAt(i) != '0')
          {
            i++;
            if (i > -j) {
              a(paramString.substring(0, 0 + (i + j)), paramString.substring(i + j, i + j + -j), paramzgs);
            } else if (i == -j) {
              a("0", paramString.substring(0, 0 + i), paramzgs);
            } else {
              a("0", zw.a('0', -j - i) + paramString.substring(0, 0 + i), paramzgs);
            }
            return;
          }
          j++;
          if (j == 0)
          {
            c(paramString.substring(0, 0 + i), paramzgs);
            return;
          }
          i--;
        }
        paramzgs.c = 6;
        paramzgs.d = Integer.valueOf(2);
      }
    }
    else if (j < 20)
    {
      k = paramString.indexOf('.');
      if ((k < 0) || (k > i))
      {
        c(paramString.substring(0, 0 + i) + zw.a('0', j), paramzgs);
        return;
      }
      int m = i - k - 1;
      if (j > m) {
        c(paramString.substring(0, 0 + k) + paramString.substring(k + 1, k + 1 + m) + zw.a('0', j - m), paramzgs);
      } else if (j == m) {
        c(paramString.substring(0, 0 + k) + paramString.substring(k + 1, k + 1 + m), paramzgs);
      } else {
        a(paramString.substring(0, 0 + k) + paramString.substring(k + 1, k + 1 + j), paramString.substring(k + 1 + j, k + 1 + j + (m - j)), paramzgs);
      }
      return;
    }
    double d1 = zo.a(paramString, za.b());
    long l = Double.doubleToRawLongBits(d1);
    if ((l & 0x3FFFFFFFF) == 0L)
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf((int)(l >> 32));
      return;
    }
    if (j < 306)
    {
      double d2 = zo.a(paramString.substring(0, 0 + i) + "E" + (j + 2), za.b());
      l = Double.doubleToRawLongBits(d1);
      if ((l & 0x3FFFFFFFF) == 0L)
      {
        paramzgs.c = 6;
        paramzgs.d = Integer.valueOf((int)(l >> 32) | 0x1);
        return;
      }
    }
    paramzgs.c = 1;
    paramzgs.d = Double.valueOf(d1);
  }
  
  private static void b(String paramString, zgs paramzgs)
  {
    if (b(paramString))
    {
      l = zq.a(paramString, za.b());
      if ((l <= 536870911L) && (l >= -536870912L))
      {
        paramzgs.c = 6;
        paramzgs.d = Integer.valueOf((int)l << 2 | 0x3);
        return;
      }
      l = Double.doubleToRawLongBits(l);
    }
    else
    {
      l = Double.doubleToRawLongBits(zo.a(paramString, za.b()));
    }
    if ((l & 0x3FFFFFFFF) == 0L)
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf((int)(l >> 32) | 0x1);
      return;
    }
    double d = zo.a(paramString.substring(0, 0 + (paramString.length() - 2)) + "." + paramString.substring(paramString.length() - 2), za.b());
    long l = Double.doubleToRawLongBits(d);
    if ((l & 0x3FFFFFFFF) == 0L)
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf((int)(l >> 32));
      return;
    }
    paramzgs.c = 1;
    paramzgs.d = Double.valueOf(d);
  }
  
  private static void c(String paramString, zgs paramzgs)
  {
    if (b(paramString))
    {
      a(zq.a(paramString, za.b()), paramzgs);
      return;
    }
    double d = zo.a(paramString, za.b());
    long l = Double.doubleToRawLongBits(d);
    if ((l & 0x3FFFFFFFF) == 0L)
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf((int)(l >> 32));
      return;
    }
    if ((d <= 1.7976931348623156E306D) && (d >= -1.7976931348623156E306D))
    {
      l = Double.doubleToRawLongBits(zo.a(paramString + "00", za.b()));
      if ((l & 0x3FFFFFFFF) == 0L)
      {
        paramzgs.c = 6;
        paramzgs.d = Integer.valueOf((int)(l >> 32) | 0x1);
        return;
      }
    }
    paramzgs.c = 1;
    paramzgs.d = Double.valueOf(d);
  }
  
  static int a(double paramDouble, byte[] paramArrayOfByte, int paramInt)
  {
    int i;
    if ((paramDouble == 5.36870911E8D) || (paramDouble == -5.36870912E8D))
    {
      i = (int)paramDouble << 2;
      i |= 0x2;
      paramArrayOfByte[paramInt] = ((byte)(i & 0xFF));
      paramArrayOfByte[(paramInt + 1)] = ((byte)(i >> 8 & 0xFF));
      paramArrayOfByte[(paramInt + 2)] = ((byte)(i >> 16 & 0xFF));
      paramArrayOfByte[(paramInt + 3)] = ((byte)(i >> 24));
      return 4;
    }
    if ((paramDouble < 5.36870911E8D) && (paramDouble > -5.36870912E8D))
    {
      i = (int)paramDouble;
      if (Math.abs(paramDouble - i) < Double.MIN_VALUE)
      {
        i <<= 2;
        i |= 0x2;
        paramArrayOfByte[paramInt] = ((byte)(i & 0xFF));
        paramArrayOfByte[(paramInt + 1)] = ((byte)(i >> 8 & 0xFF));
        paramArrayOfByte[(paramInt + 2)] = ((byte)(i >> 16 & 0xFF));
        paramArrayOfByte[(paramInt + 3)] = ((byte)(i >> 24));
        return 4;
      }
    }
    long l1 = Double.doubleToRawLongBits(paramDouble);
    int j;
    if ((l1 & 0x3FFFFFFFF) == 0L)
    {
      j = (int)(l1 >> 32);
      paramArrayOfByte[paramInt] = ((byte)(j & 0xFF));
      paramArrayOfByte[(paramInt + 1)] = ((byte)(j >> 8 & 0xFF));
      paramArrayOfByte[(paramInt + 2)] = ((byte)(j >> 16 & 0xFF));
      paramArrayOfByte[(paramInt + 3)] = ((byte)(j >> 24));
      return 4;
    }
    if ((paramDouble <= 1.7976931348623156E306D) && (paramDouble >= -1.7976931348623156E306D))
    {
      paramDouble *= 100.0D;
      if ((paramDouble == 5.36870911E8D) || (paramDouble == -5.36870912E8D))
      {
        j = (int)paramDouble << 2;
        j |= 0x3;
        paramArrayOfByte[paramInt] = ((byte)(j & 0xFF));
        paramArrayOfByte[(paramInt + 1)] = ((byte)(j >> 8 & 0xFF));
        paramArrayOfByte[(paramInt + 2)] = ((byte)(j >> 16 & 0xFF));
        paramArrayOfByte[(paramInt + 3)] = ((byte)(j >> 24));
        return 4;
      }
      if ((paramDouble < 5.36870911E8D) && (paramDouble > -5.36870912E8D))
      {
        j = (int)paramDouble;
        if (Math.abs(paramDouble - j) < Double.MIN_VALUE)
        {
          j <<= 2;
          j |= 0x3;
          paramArrayOfByte[paramInt] = ((byte)(j & 0xFF));
          paramArrayOfByte[(paramInt + 1)] = ((byte)(j >> 8 & 0xFF));
          paramArrayOfByte[(paramInt + 2)] = ((byte)(j >> 16 & 0xFF));
          paramArrayOfByte[(paramInt + 3)] = ((byte)(j >> 24));
          return 4;
        }
      }
      long l2 = Double.doubleToRawLongBits(paramDouble);
      if ((l2 & 0x3FFFFFFFF) == 0L)
      {
        int k = (int)(l2 >> 32) | 0x1;
        paramArrayOfByte[paramInt] = ((byte)(k & 0xFF));
        paramArrayOfByte[(paramInt + 1)] = ((byte)(k >> 8 & 0xFF));
        paramArrayOfByte[(paramInt + 2)] = ((byte)(k >> 16 & 0xFF));
        paramArrayOfByte[(paramInt + 3)] = ((byte)(k >> 24));
        return 4;
      }
    }
    paramArrayOfByte[paramInt] = ((byte)(int)(l1 & 0xFF));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(int)(l1 >> 8 & 0xFF));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(int)(l1 >> 16 & 0xFF));
    paramArrayOfByte[(paramInt + 3)] = ((byte)(int)(l1 >> 24 & 0xFF));
    paramArrayOfByte[(paramInt + 4)] = ((byte)(int)(l1 >> 32 & 0xFF));
    paramArrayOfByte[(paramInt + 5)] = ((byte)(int)(l1 >> 40 & 0xFF));
    paramArrayOfByte[(paramInt + 6)] = ((byte)(int)(l1 >> 48 & 0xFF));
    paramArrayOfByte[(paramInt + 7)] = ((byte)(int)(l1 >> 56));
    return 8;
  }
  
  private static boolean b(String paramString)
  {
    if (paramString.length() < 19) {
      return true;
    }
    int i = 0;
    if (paramString.charAt(0) == '-') {}
    for (i = 1; i < paramString.length(); i++) {
      switch (paramString.charAt(i))
      {
      case '0': 
        break;
      case '9': 
        return paramString.length() - i < 19;
      default: 
        return paramString.length() - i < 20;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */