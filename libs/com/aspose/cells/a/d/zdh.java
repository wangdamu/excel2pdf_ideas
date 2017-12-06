package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zr;

public class zdh
{
  public static int a(int paramInt)
  {
    return (int)(a(paramInt) & 0xFFFFFFFF);
  }
  
  public static long a(long paramLong)
  {
    return (paramLong & 0xFFFFFFFF & 0xFF) << 24 | (paramLong & 0xFFFFFFFF & 0xFF00) << 8 | (paramLong & 0xFFFFFFFF & 0xFF0000) >> 8 | (paramLong & 0xFFFFFFFF & 0xFF000000) >> 24;
  }
  
  public static short a(short paramShort)
  {
    return (short)(b(paramShort) & 0xFFFF);
  }
  
  public static int b(int paramInt)
  {
    return (paramInt & 0xFFFF & 0xFF) << 8 | (paramInt & 0xFFFF & 0xFF00) >> 8;
  }
  
  public static void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    for (int i = 0; i < 4; i++)
    {
      paramArrayOfByte[(paramInt2 + i)] = ((byte)paramInt1);
      paramInt1 >>= 8;
    }
  }
  
  public static boolean b(long paramLong)
  {
    return (paramLong & 1L) != 0L;
  }
  
  public static int a(long paramLong, int paramInt)
  {
    long l = paramLong / paramInt;
    if (paramLong % paramInt != 0L) {
      l += 1L;
    }
    return (int)l;
  }
  
  public static int b(long paramLong, int paramInt)
  {
    return a(paramLong, paramInt) * paramInt;
  }
  
  public static void a(zm paramzm, int paramInt)
    throws Exception
  {
    int i = b(paramzm.i(), paramInt);
    if (paramzm.h() < i) {
      paramzm.a(i);
    }
    paramzm.b(i);
  }
  
  public static void a(zm paramzm1, zm paramzm2)
    throws Exception
  {
    if (paramzm1 == null) {
      throw new IllegalArgumentException("srcStream");
    }
    if (paramzm2 == null) {
      throw new IllegalArgumentException("dstStream");
    }
    byte[] arrayOfByte = new byte['က'];
    for (;;)
    {
      int i = paramzm1.a(arrayOfByte, 0, arrayOfByte.length);
      if (i == 0) {
        break;
      }
      paramzm2.b(arrayOfByte, 0, i);
    }
  }
  
  public static boolean a(String paramString)
  {
    return (paramString != null) && (!"".equals(paramString));
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (!a(paramString1)) {
      throw new IllegalArgumentException("The argument cannot be null or empty string.\\r\\nParameter name: \"" + paramString2);
    }
  }
  
  public static int a(double paramDouble)
  {
    return (int)zr.a(paramDouble);
  }
  
  public static int a(char paramChar)
  {
    if (paramChar > '9') {
      return (paramChar <= 'F' ? paramChar - 'A' : paramChar - 'a') + 10;
    }
    return paramChar - '0';
  }
  
  public static boolean b(char paramChar)
  {
    if (((paramChar < '0') || (paramChar > '9')) && ((paramChar < 'A') || (paramChar > 'F')))
    {
      if (paramChar >= 'a') {
        return paramChar <= 'f';
      }
      return false;
    }
    return true;
  }
  
  public static boolean a(zt paramzt1, zt paramzt2, double paramDouble)
  {
    if ((Math.abs(paramzt1.b() - paramzt2.b()) <= paramDouble) && (Math.abs(paramzt1.c() - paramzt2.c()) <= paramDouble)) {
      return true;
    }
    return (Math.abs(paramzt1.b() - paramzt2.c()) <= paramDouble) && (Math.abs(paramzt1.c() - paramzt2.b()) <= paramDouble);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */