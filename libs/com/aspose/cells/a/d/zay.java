package com.aspose.cells.a.d;

public class zay
{
  public static int a(int paramInt1, int paramInt2)
  {
    int i = 1;
    if (paramInt1 < 0)
    {
      paramInt1 = -paramInt1;
      i = -1;
    }
    if (paramInt2 < 0)
    {
      paramInt2 = -paramInt2;
      i = -i;
    }
    int j = (int)(paramInt1 * paramInt2 + 32768L >> 16);
    return i > 0 ? j : -j;
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    int i = 1;
    if (paramInt1 < 0)
    {
      paramInt1 = -paramInt1;
      i = -1;
    }
    if (paramInt2 < 0)
    {
      paramInt2 = -paramInt2;
      i = -i;
    }
    long l;
    if (paramInt2 == 0) {
      l = 2147483647L;
    } else {
      l = ((paramInt1 << 16) + (paramInt2 >> 1)) / paramInt2;
    }
    return i < 0 ? -(int)(l & 0xFFFFFFFF) : (int)(l & 0xFFFFFFFF);
  }
  
  public static int a(int paramInt)
  {
    return paramInt & 0xFFFFFFC0;
  }
  
  public static int b(int paramInt)
  {
    return paramInt + 32 & 0xFFFFFFC0;
  }
  
  public static int c(int paramInt)
  {
    return paramInt + 63 & 0xFFFFFFC0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */