package com.aspose.cells.b.a;

public final class zb
{
  private static final byte[] a = new byte['ÿ'];
  private static final char[] b = new char[64];
  
  protected static boolean a(char paramChar)
  {
    return (paramChar == ' ') || (paramChar == '\r') || (paramChar == '\n') || (paramChar == '\t');
  }
  
  protected static boolean b(char paramChar)
  {
    return paramChar == '=';
  }
  
  protected static boolean c(char paramChar)
  {
    return a[paramChar] != -1;
  }
  
  public static byte[] a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    char[] arrayOfChar = paramString.toCharArray();
    int i = a(arrayOfChar);
    if (i % 4 != 0) {
      return null;
    }
    int j = i / 4;
    if (j == 0) {
      return new byte[0];
    }
    byte[] arrayOfByte1 = null;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    char c1 = '\000';
    char c2 = '\000';
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    arrayOfByte1 = new byte[j * 3];
    while (i6 < j - 1)
    {
      if ((!c(i4 = arrayOfChar[(i8++)])) || (!c(i5 = arrayOfChar[(i8++)])) || (!c(c1 = arrayOfChar[(i8++)])) || (!c(c2 = arrayOfChar[(i8++)]))) {
        return null;
      }
      k = a[i4];
      m = a[i5];
      n = a[c1];
      i1 = a[c2];
      arrayOfByte1[(i7++)] = ((byte)(k << 2 | m >> 4));
      arrayOfByte1[(i7++)] = ((byte)((m & 0xF) << 4 | n >> 2 & 0xF));
      arrayOfByte1[(i7++)] = ((byte)(n << 6 | i1));
      i6++;
    }
    if ((!c(i4 = arrayOfChar[(i8++)])) || (!c(i5 = arrayOfChar[(i8++)]))) {
      return null;
    }
    k = a[i4];
    m = a[i5];
    c1 = arrayOfChar[(i8++)];
    c2 = arrayOfChar[(i8++)];
    if ((!c(c1)) || (!c(c2)))
    {
      byte[] arrayOfByte2;
      if ((b(c1)) && (b(c2)))
      {
        if ((m & 0xF) != 0) {
          return null;
        }
        arrayOfByte2 = new byte[i6 * 3 + 1];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i6 * 3);
        arrayOfByte2[i7] = ((byte)(k << 2 | m >> 4));
        return arrayOfByte2;
      }
      if ((!b(c1)) && (b(c2)))
      {
        n = a[c1];
        if ((n & 0x3) != 0) {
          return null;
        }
        arrayOfByte2 = new byte[i6 * 3 + 2];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i6 * 3);
        arrayOfByte2[(i7++)] = ((byte)(k << 2 | m >> 4));
        arrayOfByte2[i7] = ((byte)((m & 0xF) << 4 | n >> 2 & 0xF));
        return arrayOfByte2;
      }
      return null;
    }
    n = a[c1];
    i1 = a[c2];
    arrayOfByte1[(i7++)] = ((byte)(k << 2 | m >> 4));
    arrayOfByte1[(i7++)] = ((byte)((m & 0xF) << 4 | n >> 2 & 0xF));
    arrayOfByte1[(i7++)] = ((byte)(n << 6 | i1));
    return arrayOfByte1;
  }
  
  protected static int a(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {
      return 0;
    }
    int i = 0;
    int j = paramArrayOfChar.length;
    for (int k = 0; k < j; k++) {
      if (!a(paramArrayOfChar[k])) {
        paramArrayOfChar[(i++)] = paramArrayOfChar[k];
      }
    }
    return i;
  }
  
  static
  {
    for (int i = 0; i < 255; i++) {
      a[i] = -1;
    }
    for (i = 90; i >= 65; i--) {
      a[i] = ((byte)(i - 65));
    }
    for (i = 122; i >= 97; i--) {
      a[i] = ((byte)(i - 97 + 26));
    }
    for (i = 57; i >= 48; i--) {
      a[i] = ((byte)(i - 48 + 52));
    }
    a[43] = 62;
    a[47] = 63;
    for (i = 0; i <= 25; i++) {
      b[i] = ((char)(65 + i));
    }
    i = 26;
    for (int j = 0; i <= 51; j++)
    {
      b[i] = ((char)(97 + j));
      i++;
    }
    i = 52;
    for (j = 0; i <= 61; j++)
    {
      b[i] = ((char)(48 + j));
      i++;
    }
    b[62] = '+';
    b[63] = '/';
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */