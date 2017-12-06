package com.aspose.cells.a.d;

public class zab
{
  public static long a(long paramLong)
  {
    return (paramLong & 0xFFFFFFFF & 0xFF) << 24 | (paramLong & 0xFFFFFFFF & 0xFF00) << 8 | (paramLong & 0xFFFFFFFF & 0xFF0000) >> 8 | (paramLong & 0xFFFFFFFF & 0xFF000000) >> 24;
  }
  
  public static short a(short paramShort)
  {
    return (short)(a(paramShort) & 0xFFFF);
  }
  
  public static int a(int paramInt)
  {
    return (paramInt & 0xFFFF & 0xFF) << 8 | (paramInt & 0xFFFF & 0xFF00) >> 8;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */