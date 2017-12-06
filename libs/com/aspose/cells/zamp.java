package com.aspose.cells;

final class zamp
{
  public static void a(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    a(paramArrayOfByte, paramInt, 8, paramLong);
  }
  
  public static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(paramArrayOfByte, paramInt1, 4, paramInt2);
  }
  
  public static void a(byte[] paramArrayOfByte, int paramInt, short paramShort)
  {
    a(paramArrayOfByte, paramInt, 2, paramShort);
  }
  
  public static void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(paramArrayOfByte, paramInt1, 2, paramInt2);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */