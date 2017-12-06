package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcjb
{
  static int a(byte[] paramArrayOfByte, int paramInt)
  {
    return zc.e(paramArrayOfByte, paramInt) & 0xFFFF & 0x3FFF;
  }
  
  static int b(byte[] paramArrayOfByte, int paramInt)
  {
    return zc.a(paramArrayOfByte, paramInt) & 0xFFFFF;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte)
  {
    if ((paramByte & 0xFF & 0x80) == 0) {
      return zc.a(paramArrayOfByte, paramInt1);
    }
    int i = zc.a(paramArrayOfByte, paramInt1);
    if (i + paramInt2 > 1048575)
    {
      int j = i + paramInt2 - 1048575 - 1;
      return j;
    }
    return i + paramInt2;
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) || (!paramBoolean2))
    {
      System.arraycopy(zc.a(paramInt2), 0, paramArrayOfByte, paramInt1, 4);
    }
    else
    {
      int i = paramInt2 - paramInt3;
      byte[] arrayOfByte = zc.a(i);
      if (i < 0)
      {
        arrayOfByte[3] = 0;
        int tmp49_48 = 2;
        byte[] tmp49_46 = arrayOfByte;
        tmp49_46[tmp49_48] = ((byte)(tmp49_46[tmp49_48] & 0xF));
      }
      System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt1, 4);
    }
  }
  
  static void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    byte[] arrayOfByte = null;
    if ((paramBoolean1) || (!paramBoolean2)) {
      arrayOfByte = zc.a((short)paramInt2);
    } else {
      arrayOfByte = zc.a((short)(paramInt2 - paramInt3));
    }
    paramArrayOfByte[paramInt1] = arrayOfByte[0];
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(arrayOfByte[1] & 0xFF & 0x3F | paramArrayOfByte[(paramInt1 + 1)] & 0xFF & 0xC0));
  }
  
  static void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    byte[] arrayOfByte = null;
    if ((paramBoolean1) || (!paramBoolean2)) {
      arrayOfByte = zc.a((short)paramInt2);
    } else {
      arrayOfByte = zc.a((short)(paramInt2 - paramInt3));
    }
    paramArrayOfByte[paramInt1] = arrayOfByte[0];
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(arrayOfByte[1] & 0xFF & 0x3F | paramArrayOfByte[(paramInt1 + 1)] & 0xFF & 0xC0));
  }
  
  static int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte)
  {
    if ((paramByte & 0xFF & 0x40) == 0) {
      return zc.e(paramArrayOfByte, paramInt1) & 0xFFFF & 0x3FFF;
    }
    int i = zc.e(paramArrayOfByte, paramInt1) & 0xFFFF & 0x3FFF;
    if (i + paramInt2 > 16383)
    {
      int j = i + paramInt2 - 16383 - 1;
      return j;
    }
    return i + paramInt2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */