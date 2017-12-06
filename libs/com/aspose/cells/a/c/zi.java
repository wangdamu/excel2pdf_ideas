package com.aspose.cells.a.c;

public class zi
{
  public static long a(Object paramObject)
  {
    return ((Number)paramObject).longValue();
  }
  
  public static double b(Object paramObject)
  {
    return ((Number)paramObject).doubleValue();
  }
  
  public static int c(Object paramObject)
  {
    return ((Number)paramObject).intValue();
  }
  
  public static boolean d(Object paramObject)
  {
    return ((Boolean)paramObject).booleanValue();
  }
  
  public static short a(Integer paramInteger)
  {
    return paramInteger.shortValue();
  }
  
  public static String a(int paramInt)
  {
    return Integer.toString(paramInt);
  }
  
  public static String a(double paramDouble)
  {
    return Double.toString(paramDouble);
  }
  
  public static Object a(byte paramByte)
  {
    return Byte.valueOf(paramByte);
  }
  
  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1++)] = ((byte)(paramInt2 & 0xFF));
    paramArrayOfByte[(paramInt1++)] = ((byte)(paramInt2 >> 8 & 0xFF));
    paramArrayOfByte[(paramInt1++)] = ((byte)(paramInt2 >> 16 & 0xFF));
    paramArrayOfByte[(paramInt1++)] = ((byte)(paramInt2 >> 24 & 0xFF));
    return 4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */