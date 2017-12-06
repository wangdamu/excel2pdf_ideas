package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;

class zct
{
  static int a(String paramString)
  {
    return b(paramString) ? paramString.length() + 1 : paramString == null ? 0 : paramString.length() * 2 + 1;
  }
  
  static boolean b(String paramString)
  {
    boolean bool = true;
    if ((paramString != null) && (!"".equals(paramString)))
    {
      bool = true;
      byte[] arrayOfByte = Encoding.getUnicode().a(paramString);
      for (int i = 0; i < arrayOfByte.length / 2; i++) {
        if (arrayOfByte[(2 * i + 1)] != 0)
        {
          bool = false;
          break;
        }
      }
    }
    return bool;
  }
  
  static String a(byte[] paramArrayOfByte, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    String str = null;
    if (!paramBoolean)
    {
      str = Encoding.getUnicode().a(paramArrayOfByte, paramInt1, paramInt2 * 2);
    }
    else
    {
      byte[] arrayOfByte = new byte[2 * paramInt2];
      for (int i = 0; i < paramInt2; i++) {
        arrayOfByte[(2 * i)] = paramArrayOfByte[(paramInt1 + i)];
      }
      str = Encoding.getUnicode().a(arrayOfByte, 0, arrayOfByte.length);
    }
    return str;
  }
  
  static String a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = zc.e(paramArrayOfByte, paramInt) & 0xFFFF;
    String str = null;
    if (paramArrayOfByte[(paramInt + 2)] == 1)
    {
      str = Encoding.getUnicode().a(paramArrayOfByte, paramInt + 3, i * 2);
      paramInt += 3 + i * 2;
    }
    else
    {
      byte[] arrayOfByte = new byte[2 * i];
      for (int j = 0; j < i; j++) {
        arrayOfByte[(2 * j)] = paramArrayOfByte[(paramInt + 3 + j)];
      }
      str = Encoding.getUnicode().a(arrayOfByte, 0, arrayOfByte.length);
      paramInt += 3 + i;
    }
    return str;
  }
  
  static String a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    int i = zc.e(paramArrayOfByte, paramArrayOfInt[0]) & 0xFFFF;
    if (i == 0)
    {
      paramArrayOfInt[0] += 3;
      return null;
    }
    String str = null;
    if (paramArrayOfByte[(paramArrayOfInt[0] + 2)] == 1)
    {
      str = Encoding.getUnicode().a(paramArrayOfByte, paramArrayOfInt[0] + 3, i * 2);
      paramArrayOfInt[0] += 3 + i * 2;
    }
    else
    {
      byte[] arrayOfByte = new byte[2 * i];
      for (int j = 0; j < i; j++) {
        arrayOfByte[(2 * j)] = paramArrayOfByte[(paramArrayOfInt[0] + 3 + j)];
      }
      str = Encoding.getUnicode().a(arrayOfByte, 0, arrayOfByte.length);
      paramArrayOfInt[0] += 3 + i;
    }
    return str;
  }
  
  static String b(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = zc.e(paramArrayOfByte, i) & 0xFFFF;
    if (j == 0)
    {
      i += 3;
      paramArrayOfInt[0] = i;
      return null;
    }
    String str = null;
    if (paramArrayOfByte[(i + 2)] == 1)
    {
      str = Encoding.getUnicode().a(paramArrayOfByte, i + 3, j * 2);
      i += 3 + j * 2;
    }
    else
    {
      byte[] arrayOfByte = new byte[2 * j];
      for (int k = 0; k < j; k++) {
        arrayOfByte[(2 * k)] = paramArrayOfByte[(i + 3 + k)];
      }
      str = Encoding.getUnicode().a(arrayOfByte, 0, arrayOfByte.length);
      i += 3 + j;
    }
    paramArrayOfInt[0] = i;
    return str;
  }
  
  static byte[] c(String paramString)
  {
    if (zw.b(paramString)) {
      return null;
    }
    byte[] arrayOfByte1 = Encoding.getUnicode().a(paramString);
    for (int i = 0; i < arrayOfByte1.length / 2; i++) {
      if (arrayOfByte1[(2 * i + 1)] != 0) {
        return arrayOfByte1;
      }
    }
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length / 2];
    for (int j = 0; j < arrayOfByte1.length / 2; j++) {
      arrayOfByte2[j] = arrayOfByte1[(2 * j)];
    }
    return arrayOfByte2;
  }
  
  static String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[2 * paramInt2];
    for (int i = 0; i < paramInt2; i++) {
      arrayOfByte[(2 * i)] = paramArrayOfByte[(paramInt1 + i)];
    }
    return Encoding.getUnicode().a(arrayOfByte);
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    if (zw.b(paramString)) {
      return 3;
    }
    byte[] arrayOfByte = c(paramString);
    System.arraycopy(zc.a((short)paramString.length()), 0, paramArrayOfByte, paramInt, 2);
    paramInt += 2;
    int i = arrayOfByte.length == paramString.length() ? 1 : 0;
    paramArrayOfByte[(paramInt++)] = (i != 0 ? 0 : 1);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt, arrayOfByte.length);
    return 3 + arrayOfByte.length;
  }
  
  static int a(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2, String paramString)
  {
    if (paramString.length() == 0) {
      return 3;
    }
    System.arraycopy(zc.a((short)paramString.length()), 0, paramArrayOfByte1, paramInt, 2);
    paramInt += 2;
    int i = paramArrayOfByte2.length == paramString.length() ? 1 : 0;
    paramArrayOfByte1[(paramInt++)] = (i != 0 ? 0 : 1);
    System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte1, paramInt, paramArrayOfByte2.length);
    return 3 + paramArrayOfByte2.length;
  }
  
  static int b(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    byte[] arrayOfByte = c(paramString);
    if (arrayOfByte == null)
    {
      paramArrayOfByte[paramInt] = 0;
      return 1;
    }
    int i = arrayOfByte.length == paramString.length() ? 1 : 0;
    paramArrayOfByte[(paramInt++)] = (i != 0 ? 0 : 1);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt, arrayOfByte.length);
    return 1 + arrayOfByte.length;
  }
  
  static int a(byte[] paramArrayOfByte, int[] paramArrayOfInt, String paramString)
  {
    int i = 0;
    if (paramString == null)
    {
      int tmp9_8 = 0;
      int[] tmp9_7 = paramArrayOfInt;
      int tmp11_10 = tmp9_7[tmp9_8];
      tmp9_7[tmp9_8] = (tmp11_10 + 1);
      paramArrayOfByte[tmp11_10] = -1;
      int tmp20_19 = 0;
      int[] tmp20_18 = paramArrayOfInt;
      int tmp22_21 = tmp20_18[tmp20_19];
      tmp20_18[tmp20_19] = (tmp22_21 + 1);
      paramArrayOfByte[tmp22_21] = -1;
      i = 2;
    }
    else
    {
      System.arraycopy(zc.a((short)paramString.length()), 0, paramArrayOfByte, paramArrayOfInt[0], 2);
      paramArrayOfInt[0] += 2;
      int j = b(paramArrayOfByte, paramArrayOfInt[0], paramString);
      paramArrayOfInt[0] += j;
      i = 2 + j;
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */