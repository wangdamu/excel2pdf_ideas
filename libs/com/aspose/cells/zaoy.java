package com.aspose.cells;

class zaoy
{
  public static void a(int[] paramArrayOfInt, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramInt1 / 4;
    int j = paramInt1 % 4;
    for (int k = 0; k < paramInt3; k++)
    {
      paramArrayOfInt[i] &= (255 << j * 8 ^ 0xFFFFFFFF);
      paramArrayOfInt[i] |= paramArrayOfByte[(paramInt2 + k)] << j * 8;
      j++;
      if (j == 4)
      {
        i++;
        j = 0;
      }
    }
  }
  
  public static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaoy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */