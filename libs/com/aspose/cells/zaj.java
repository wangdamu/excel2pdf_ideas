package com.aspose.cells;

class zaj
{
  static byte[] a = { 64, 50, 5, -41, 105, -50, -51, 17, -89, 119, 0, -35, 1, 20, 60, 87 };
  static byte[] b = { 48, 29, -46, -117, 66, -20, -50, 17, -98, 13, 0, -86, 0, 96, 2, -13 };
  static byte[] c = { 64, 29, -46, -117, 66, -20, -50, 17, -98, 13, 0, -86, 0, 96, 2, -13 };
  static byte[] d = { 32, 29, -46, -117, 66, -20, -50, 17, -98, 13, 0, -86, 0, 96, 2, -13 };
  static byte[] e = { 16, 29, -46, -117, 66, -20, -50, 17, -98, 13, 0, -86, 0, 96, 2, -13 };
  static byte[] f = { -80, 111, 23, 121, -14, -73, -50, 17, -105, -17, 0, -86, 0, 109, 39, 118 };
  static byte[] g = { 80, 29, -46, -117, 66, -20, -50, 17, -98, 13, 0, -86, 0, 96, 2, -13 };
  static byte[] h = { 35, -98, -116, -105, -80, -44, -50, 17, -65, 45, 0, -86, 0, 63, 64, -48 };
  static byte[] i = { 65, -110, 89, 76, 38, 105, 27, 16, -103, -110, 0, 0, 11, 101, -58, -7 };
  static byte[] j = { 96, 29, -46, -117, 66, -20, -50, 17, -98, 13, 0, -86, 0, 96, 2, -13 };
  static byte[] k = { -32, -127, -47, -33, 47, 94, -50, 17, -92, 73, 0, -86, 0, 74, Byte.MIN_VALUE, 61 };
  static byte[] l = { 4, 82, -29, 11, -111, -113, -50, 17, -99, -29, 0, -86, 0, 75, -72, 81 };
  
  static int a(byte[] paramArrayOfByte)
  {
    int[] arrayOfInt1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int i1 : arrayOfInt1)
    {
      byte[] arrayOfByte = a(i1);
      if ((arrayOfByte[0] == paramArrayOfByte[0]) && (arrayOfByte[15] == paramArrayOfByte[15]))
      {
        int i2 = 1;
        for (int i3 = 0; i3 < arrayOfByte.length; i3++) {
          if (arrayOfByte[i3] != paramArrayOfByte[i3])
          {
            i2 = 0;
            break;
          }
        }
        if (i2 != 0) {
          return i1;
        }
      }
    }
    return 11;
  }
  
  static byte[] a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return a;
    case 1: 
      return b;
    case 2: 
      return c;
    case 3: 
      return d;
    case 4: 
      return e;
    case 5: 
      return f;
    case 6: 
      return g;
    case 7: 
      return h;
    case 8: 
      return i;
    case 9: 
      return j;
    case 10: 
      return k;
    }
    return null;
  }
  
  static int b(int paramInt)
  {
    switch (paramInt)
    {
    case 17: 
      return 1;
    case 18: 
      return 2;
    case 19: 
      return 4;
    case 20: 
      return 16;
    case 21: 
      return 32;
    case 22: 
      return 64;
    case 23: 
      return 128;
    }
    return 0;
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 2)
    {
      if (paramInt1 % 2 != 0) {
        return 1;
      }
    }
    else
    {
      int m = paramInt1 % 4;
      if (m != 0) {
        return 4 - m;
      }
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */