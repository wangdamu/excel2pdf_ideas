package com.aspose.cells;

class zui
{
  static int a(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return 0;
    }
    byte[] arrayOfByte = Encoding.getASCII().a(paramString);
    int[] arrayOfInt = a(arrayOfByte);
    int i = arrayOfInt[0];
    for (int j = 1; j < arrayOfInt.length; j++) {
      i ^= arrayOfInt[j];
    }
    i ^= arrayOfInt.length;
    i ^= 0xCE4B;
    return i;
  }
  
  private static int[] a(byte[] paramArrayOfByte)
  {
    int[] arrayOfInt = new int[paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      for (int k = 1; k < i + 2; k++)
      {
        j <<= 1;
        if (j > 32767) {
          j -= 32767;
        }
      }
      arrayOfInt[i] = j;
    }
    return arrayOfInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */