package com.aspose.cells.b.a;

public class zc
{
  public static byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    a(arrayOfByte, 0, 4, paramInt);
    return arrayOfByte;
  }
  
  public static int a(byte[] paramArrayOfByte, int paramInt)
  {
    return (int)a(paramArrayOfByte, paramInt, 4);
  }
  
  public static byte[] a(short paramShort)
  {
    byte[] arrayOfByte = new byte[2];
    a(arrayOfByte, 0, 2, paramShort);
    return arrayOfByte;
  }
  
  public static short b(byte[] paramArrayOfByte, int paramInt)
  {
    return (short)(int)a(paramArrayOfByte, paramInt, 2);
  }
  
  public static byte[] a(long paramLong)
  {
    byte[] arrayOfByte = new byte[8];
    a(arrayOfByte, 0, 8, paramLong);
    return arrayOfByte;
  }
  
  public static long c(byte[] paramArrayOfByte, int paramInt)
  {
    return a(paramArrayOfByte, paramInt, 8);
  }
  
  public static long d(byte[] paramArrayOfByte, int paramInt)
  {
    int i = a(paramArrayOfByte, paramInt);
    long l;
    if (i < 0) {
      l = i & 0xFFFFFFFF;
    } else {
      l = i;
    }
    return l;
  }
  
  public static int e(byte[] paramArrayOfByte, int paramInt)
  {
    int i = b(paramArrayOfByte, paramInt);
    int j;
    if (i < 0) {
      j = i & 0xFFFF;
    } else {
      j = i;
    }
    return j;
  }
  
  public static byte[] a(double paramDouble)
  {
    return a(Double.doubleToLongBits(paramDouble));
  }
  
  public static double f(byte[] paramArrayOfByte, int paramInt)
  {
    long l = c(paramArrayOfByte, paramInt);
    return Double.longBitsToDouble(l);
  }
  
  private static long a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l = 0L;
    for (int i = paramInt1 + paramInt2 - 1; i >= paramInt1; i--)
    {
      l <<= 8;
      l |= paramArrayOfByte[i] & 0xFF;
    }
    return l;
  }
  
  private static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong)
  {
    for (int i = paramInt1; i < paramInt2 + paramInt1; i++)
    {
      paramArrayOfByte[i] = ((byte)(int)(paramLong & 0xFF));
      paramLong >>= 8;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */