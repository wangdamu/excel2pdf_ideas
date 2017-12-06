package com.aspose.cells;

class zca
{
  private static final byte[] a = { -69, -1, -1, -70, -1, -1, -71, Byte.MIN_VALUE, 0, -66, 15, 0, -65, 15, 0 };
  private byte[] b;
  
  public zca(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new IllegalArgumentException("The password cannot be null or empty.");
    }
    if (paramString.length() > 15) {
      throw new IllegalArgumentException("The password cannot be more than 15 characters.");
    }
    char[] arrayOfChar = paramString.toCharArray();
    this.b = a(arrayOfChar, b(arrayOfChar));
  }
  
  public byte[] a(byte[] paramArrayOfByte, int paramInt, short paramShort)
  {
    int i = (byte)(paramInt + paramShort & 0xF);
    byte[] arrayOfByte = new byte[paramShort];
    for (short s = 0; s < paramShort; s++)
    {
      int j = (byte)(paramArrayOfByte[s] ^ this.b[i]);
      int k = (byte)(j << 5);
      j = (byte)(j >>> 3 & 0x1F);
      j = (byte)(j | k);
      arrayOfByte[s] = j;
      i = (byte)(i + 1 & 0xF);
    }
    return arrayOfByte;
  }
  
  public byte[] b(byte[] paramArrayOfByte, int paramInt, short paramShort)
  {
    int i = (byte)(paramInt + paramShort & 0xF);
    byte[] arrayOfByte = new byte[paramShort];
    for (short s = 0; s < paramShort; s++)
    {
      int j = paramArrayOfByte[s];
      int k = (byte)(j >>> 5 & 0x7);
      j = (byte)(j << 3);
      j = (byte)(j | k);
      arrayOfByte[s] = ((byte)(j ^ this.b[i]));
      i = (byte)(i + 1 & 0xF);
    }
    return arrayOfByte;
  }
  
  public static boolean a(String paramString, int paramInt1, int paramInt2)
  {
    char[] arrayOfChar = paramString.toCharArray();
    return (a(arrayOfChar) == paramInt1) && (b(arrayOfChar) == paramInt2);
  }
  
  public static int a(String paramString)
  {
    return a(paramString.toCharArray());
  }
  
  public static int a(char[] paramArrayOfChar)
  {
    int i = 0;
    int j = 0;
    while (j < paramArrayOfChar.length)
    {
      int k = paramArrayOfChar[j];
      j++;
      int m = k & 0x8000;
      int n = j % 15;
      k = (char)(k & 0x7FFF);
      int i1 = k >> 15 - n;
      k = (char)(k << n);
      k = (char)(k | i1);
      k = (char)(k & 0x7FFF);
      k = (char)(k | m);
      i = (char)(i ^ k);
    }
    return i ^ paramArrayOfChar.length ^ 0xCE4B;
  }
  
  public static int b(String paramString)
  {
    return b(paramString.toCharArray());
  }
  
  public static int b(char[] paramArrayOfChar)
  {
    int i = 0;
    int j = 32768;
    int k = 65535;
    int m = paramArrayOfChar.length;
    for (int n = 0; n < m; n++)
    {
      int i1 = paramArrayOfChar[(m - 1 - n)];
      i1 &= 0x7F;
      for (int i2 = 0; i2 < 8; i2++)
      {
        int i3 = j >> 15;
        j = (char)(j << 1);
        j = (char)(j | i3);
        if (i3 != 0) {
          j = (char)(j ^ 0x1020);
        }
        i3 = k >> 15;
        k = (char)(k << 1);
        k = (char)(k | i3);
        if (i3 != 0) {
          k = (char)(k ^ 0x1020);
        }
        if ((i1 & 1 << i2) != 0) {
          i = (char)(i ^ j);
        }
      }
    }
    return i ^ k;
  }
  
  private static byte[] a(char[] paramArrayOfChar, int paramInt)
  {
    byte[] arrayOfByte = new byte[16];
    for (int i = 0; i < paramArrayOfChar.length; i++) {
      arrayOfByte[i] = ((byte)paramArrayOfChar[i]);
    }
    for (i = paramArrayOfChar.length; i < 16; i++) {
      arrayOfByte[i] = a[(i - paramArrayOfChar.length)];
    }
    i = (byte)paramInt;
    int j = (byte)(paramInt >> 8);
    for (int k = 0; k < 16; k += 2)
    {
      int tmp75_73 = k;
      byte[] tmp75_72 = arrayOfByte;
      tmp75_72[tmp75_73] = ((byte)(tmp75_72[tmp75_73] ^ i));
      int tmp86_85 = (k + 1);
      byte[] tmp86_81 = arrayOfByte;
      tmp86_81[tmp86_85] = ((byte)(tmp86_81[tmp86_85] ^ j));
    }
    for (k = 0; k < arrayOfByte.length; k++)
    {
      int m = (byte)(arrayOfByte[k] >>> 6 & 0x3);
      int tmp124_122 = k;
      byte[] tmp124_121 = arrayOfByte;
      tmp124_121[tmp124_122] = ((byte)(tmp124_121[tmp124_122] << 2));
      int tmp133_131 = k;
      byte[] tmp133_130 = arrayOfByte;
      tmp133_130[tmp133_131] = ((byte)(tmp133_130[tmp133_131] | m));
    }
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */