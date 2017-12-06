package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;

class zbrg
{
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
      if (i <= 0) {
        break;
      }
      paramzm2.b(arrayOfByte, 0, i);
    }
  }
  
  public static DateTime a(long paramLong, String paramString)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("Parameter name: " + paramString);
    }
    long l = paramLong + 504911232000000000L;
    return new DateTime(l, 1L);
  }
  
  public static long a(DateTime paramDateTime, String paramString)
  {
    long l = paramDateTime.e() - 504911232000000000L;
    if (l < 0L) {
      throw new IllegalArgumentException("Parameter name: " + paramString);
    }
    return l;
  }
  
  public static boolean a(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0);
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (!a(paramString1)) {
      throw new IllegalArgumentException("The argument cannot be null or empty string.\\r\\nParameter name: \"" + paramString2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */