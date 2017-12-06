package com.aspose.cells;

final class zap
{
  long a(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      return 1L;
    }
    long l1 = paramLong & 0xFFFF;
    for (long l2 = paramLong >> 16 & 0xFFFF; paramInt2 > 0; l2 %= 65521L)
    {
      int i = paramInt2 < 5552 ? paramInt2 : 5552;
      paramInt2 -= i;
      while (i >= 16)
      {
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
        l2 += l1;
        i -= 16;
      }
      if (i != 0) {
        do
        {
          l1 += (paramArrayOfByte[(paramInt1++)] & 0xFF);
          l2 += l1;
          i--;
        } while (i != 0);
      }
      l1 %= 65521L;
    }
    return l2 << 16 | l1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */