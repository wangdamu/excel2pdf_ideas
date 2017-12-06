package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcad
{
  static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte)
  {
    if ((paramByte & 0xFF & 0x80) == 0) {
      return zc.e(paramArrayOfByte, paramInt1);
    }
    int i = zc.b(paramArrayOfByte, paramInt1);
    int j = i + paramInt2;
    if (j > 65535) {
      j = j - 65535 - 1;
    }
    return j;
  }
  
  static int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte)
  {
    if ((paramByte & 0xFF & 0x40) == 0) {
      return paramArrayOfByte[paramInt1] & 0xFF & 0xFF;
    }
    int i = paramArrayOfByte[paramInt1] & 0xFF & 0xFF;
    int j = i + paramInt2;
    if (j > 255) {
      j = j - 255 - 1;
    }
    return j;
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, byte paramByte)
  {
    if ((paramByte & 0xFF & 0x40) != 0)
    {
      if (paramInt2 > paramInt3) {
        paramArrayOfByte[paramInt1] = ((byte)(paramInt2 - paramInt3));
      } else {
        paramArrayOfByte[paramInt1] = ((byte)(255 - paramInt3 + paramInt2 + 1));
      }
    }
    else {
      paramArrayOfByte[paramInt1] = ((byte)paramInt2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */