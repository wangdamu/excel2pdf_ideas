package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcv
{
  static void a(zwh paramzwh)
  {
    byte[] arrayOfByte1 = paramzwh.f();
    if ((arrayOfByte1 == null) || (arrayOfByte1.length < 2)) {
      return;
    }
    if (arrayOfByte1.length == 2)
    {
      paramzwh.a(new byte[4]);
      return;
    }
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 2];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 2);
    System.arraycopy(arrayOfByte1, 2, arrayOfByte2, 4, arrayOfByte1.length - 2);
    paramzwh.a(arrayOfByte2);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, zbcq paramzbcq)
  {
    int i = paramArrayOfByte.length;
    int j = i;
    int k = j;
    int m = 0;
    zcy localzcy1 = null;
    zcy localzcy2 = null;
    int n = paramInt1;
    if (n == -1)
    {
      n = 2;
      i = zc.e(paramArrayOfByte, 0) & 0xFFFF;
      k = j = i + n;
      localzcy1 = new zcy(i * 2);
      if (k != paramArrayOfByte.length) {
        localzcy2 = new zcy(paramArrayOfByte.length - k);
      }
      m = 1;
    }
    else
    {
      localzcy1 = new zcy(i * 2);
    }
    a(paramArrayOfByte, n, k, j, localzcy1, localzcy2, paramInt2, paramInt3, paramBoolean, paramzbcq);
    if (m != 0)
    {
      int i1 = 4 + localzcy1.b() + 4 + (localzcy2 == null ? 0 : localzcy2.b());
      byte[] arrayOfByte2 = new byte[i1];
      System.arraycopy(zc.a(localzcy1.b()), 0, arrayOfByte2, 0, 4);
      localzcy1.a(arrayOfByte2, 4);
      int i2 = 4 + localzcy1.b();
      if (localzcy2 != null)
      {
        System.arraycopy(zc.a(localzcy2.b()), 0, arrayOfByte2, i2, 4);
        localzcy2.a(arrayOfByte2, i2 + 4);
      }
      return arrayOfByte2;
    }
    byte[] arrayOfByte1 = new byte[localzcy1.b()];
    localzcy1.a(arrayOfByte1, 0);
    return arrayOfByte1;
  }
  
  private static int[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zcy paramzcy1, zcy paramzcy2, int paramInt4, int paramInt5, boolean paramBoolean, zbcq paramzbcq)
  {
    int i = paramInt1;
    int j = paramInt2;
    while (i < paramInt3)
    {
      int n;
      int i1;
      int[] arrayOfInt;
      switch (paramArrayOfByte[i])
      {
      case 24: 
        if (paramArrayOfByte[(i + 1)] == 25)
        {
          paramzcy1.a(paramArrayOfByte, i, 14);
          i += 14;
        }
        else if (paramArrayOfByte[(i + 1)] == 29)
        {
          paramzcy1.a(paramArrayOfByte, i, 6);
          i += 6;
        }
        else
        {
          paramzcy1.a(paramArrayOfByte[i]);
          i++;
        }
        break;
      case 1: 
      case 2: 
        paramzcy1.a(paramArrayOfByte, i, 3);
        paramzcy1.a(2);
        paramzcy1.a(paramArrayOfByte, i + 3, 2);
        i += 5;
        break;
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 14: 
      case 15: 
      case 16: 
      case 17: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
        paramzcy1.a(paramArrayOfByte[i]);
        i++;
        break;
      case 23: 
        int k = paramArrayOfByte[(i + 1)];
        if (k == 0)
        {
          paramzcy1.a(paramArrayOfByte, i, 2);
          paramzcy1.a((byte)0);
          i += 3;
        }
        else if (paramArrayOfByte[(i + 2)] == 0)
        {
          paramzcy1.a(paramArrayOfByte, i, 3);
          byte[] arrayOfByte = new byte[(k & 0xFF) * 2];
          for (n = 0; n < (k & 0xFF); n++) {
            arrayOfByte[(n * 2)] = paramArrayOfByte[(i + 3 + n)];
          }
          paramzcy1.a(arrayOfByte, 0, arrayOfByte.length);
          i += ((k & 0xFF) + 3 & 0xFFFF);
        }
        else
        {
          paramzcy1.a(paramArrayOfByte, i, 2);
          paramzcy1.a((byte)0);
          paramzcy1.a(paramArrayOfByte, i + 3, (k & 0xFF) * 2);
          i += (k & 0xFF) * 2 + 3;
        }
        break;
      case 25: 
        int m = 0;
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          m = 4;
          paramzcy1.a(paramArrayOfByte, i, m);
          break;
        case 2: 
          m = 4;
          break;
        case 4: 
          n = zc.e(paramArrayOfByte, i + 4);
          m = (n & 0xFFFF) + 4;
          break;
        case 8: 
          m = 4;
          break;
        case 16: 
          m = 4;
          paramzcy1.a(paramArrayOfByte, i, m);
          break;
        case 32: 
          m = 4;
          break;
        case 64: 
          m = 4;
          break;
        default: 
          m = 4;
        }
        i += m;
        break;
      case 28: 
      case 29: 
        paramzcy1.a(paramArrayOfByte, i, 2);
        i += 2;
        break;
      case 31: 
        paramzcy1.a(paramArrayOfByte, i, 9);
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        paramzcy1.a(paramArrayOfByte[i]);
        paramzcy1.a(14);
        j = a(paramArrayOfByte, j, paramzcy2);
        i += 8;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        paramzcy1.a(paramArrayOfByte, i, 3);
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        paramzcy1.a(paramArrayOfByte, i, 4);
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        if (paramzbcq != null) {
          j = paramzbcq.a(paramArrayOfByte, i, j, paramzcy2);
        }
        paramzcy1.a(paramArrayOfByte, i, 5);
        i += 5;
        break;
      case 36: 
      case 42: 
      case 68: 
      case 74: 
      case 100: 
      case 106: 
        paramzcy1.a(paramArrayOfByte, i, 3);
        paramzcy1.a(2);
        paramzcy1.a(paramArrayOfByte, i + 3, 2);
        i += 5;
        break;
      case 37: 
      case 69: 
      case 101: 
        paramzcy1.a(paramArrayOfByte, i, 3);
        paramzcy1.a(2);
        paramzcy1.a(paramArrayOfByte, i + 3, 2);
        if ((paramArrayOfByte[(i + 1)] == 0) && (paramArrayOfByte[(i + 2)] == 0) && ((paramArrayOfByte[(i + 3)] & 0xFF) == 255) && ((paramArrayOfByte[(i + 4)] & 0xFF) == 255))
        {
          paramzcy1.a((byte)15);
          paramzcy1.a(1);
        }
        else
        {
          paramzcy1.a(2);
        }
        if ((paramArrayOfByte[(i + 5)] == 0) && ((paramArrayOfByte[(i + 7)] & 0xFF) == 255))
        {
          paramzcy1.a(paramArrayOfByte, i + 5, 3);
          paramzcy1.a((byte)(paramArrayOfByte[(i + 8)] & 0xFF | 0x3F));
        }
        else
        {
          paramzcy1.a(paramArrayOfByte, i + 5, 4);
        }
        i += 9;
        break;
      case 43: 
      case 75: 
      case 107: 
        paramzcy1.a(paramArrayOfByte, i, 3);
        paramzcy1.a(2);
        paramzcy1.a(paramArrayOfByte, i + 3, 2);
        paramzcy1.a(2);
        paramzcy1.a(paramArrayOfByte, i + 5, 4);
        i += 9;
        break;
      case 38: 
      case 39: 
      case 40: 
      case 70: 
      case 71: 
      case 72: 
      case 102: 
      case 103: 
      case 104: 
        paramzcy1.a(paramArrayOfByte, i, 5);
        n = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
        i1 = paramzcy1.b();
        paramzcy1.a(2);
        i += 7;
        arrayOfInt = a(paramArrayOfByte, i, j, i + n, paramzcy1, paramzcy2, paramInt4, paramInt5, paramBoolean, paramzbcq);
        i = arrayOfInt[0];
        j = arrayOfInt[1];
        paramzcy1.a(i1, zc.a(paramzcy1.b() - i1 - 2), 0, 2);
        break;
      case 41: 
      case 73: 
      case 105: 
        paramzcy1.a(paramArrayOfByte[i]);
        n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i1 = paramzcy1.b();
        paramzcy1.a(2);
        i += 3;
        arrayOfInt = a(paramArrayOfByte, i, j, i + n, paramzcy1, paramzcy2, paramInt4, paramInt5, paramBoolean, paramzbcq);
        i = arrayOfInt[0];
        j = arrayOfInt[1];
        paramzcy1.a(i1, zc.a(paramzcy1.b() - i1 - 2), 0, 2);
        break;
      case 57: 
      case 89: 
      case 121: 
        if (paramzbcq != null) {
          j = paramzbcq.a(paramArrayOfByte, i, j, paramzcy2);
        }
        paramzcy1.a(paramArrayOfByte, i, 7);
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        if (paramzbcq != null) {
          j = paramzbcq.a(paramArrayOfByte, i, j, paramzcy2);
        }
        if (paramBoolean)
        {
          paramzcy1.a(paramArrayOfByte, i, 3);
          i += 3;
          a(paramArrayOfByte, i, paramzcy1, paramInt4, paramInt5);
          i += 4;
        }
        else
        {
          paramzcy1.a(paramArrayOfByte, i, 5);
          paramzcy1.a(2);
          paramzcy1.a(paramArrayOfByte, i + 5, 2);
          i += 7;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        if (paramzbcq != null) {
          j = paramzbcq.a(paramArrayOfByte, i, j, paramzcy2);
        }
        paramzcy1.a(paramArrayOfByte, i, 5);
        paramzcy1.a(2);
        paramzcy1.a(paramArrayOfByte, i + 5, 2);
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        if (paramzbcq != null) {
          j = paramzbcq.a(paramArrayOfByte, i, j, paramzcy2);
        }
        paramzcy1.a(paramArrayOfByte, i, 5);
        paramzcy1.a(2);
        paramzcy1.a(paramArrayOfByte, i + 5, 2);
        if ((paramArrayOfByte[(i + 3)] == 0) && (paramArrayOfByte[(i + 4)] == 0) && ((paramArrayOfByte[(i + 5)] & 0xFF) == 255) && ((paramArrayOfByte[(i + 6)] & 0xFF) == 255))
        {
          paramzcy1.a((byte)15);
          paramzcy1.a(1);
        }
        else
        {
          paramzcy1.a(2);
        }
        if ((paramArrayOfByte[(i + 7)] == 0) && ((paramArrayOfByte[(i + 9)] & 0xFF) == 255))
        {
          paramzcy1.a(paramArrayOfByte, i + 7, 3);
          paramzcy1.a((byte)(paramArrayOfByte[(i + 10)] & 0xFF | 0x3F));
        }
        else
        {
          paramzcy1.a(paramArrayOfByte, i + 7, 4);
        }
        i += 11;
        break;
      case 61: 
      case 93: 
      case 125: 
        if (paramzbcq != null) {
          j = paramzbcq.a(paramArrayOfByte, i, j, paramzcy2);
        }
        paramzcy1.a(paramArrayOfByte, i, 5);
        paramzcy1.a(2);
        paramzcy1.a(paramArrayOfByte, i + 5, 2);
        paramzcy1.a(2);
        paramzcy1.a(paramArrayOfByte, i + 7, 4);
        i += 11;
        break;
      case 44: 
      case 76: 
      case 108: 
        paramzcy1.a(paramArrayOfByte[i]);
        i++;
        a(paramArrayOfByte, i, paramzcy1, paramInt4, paramInt5);
        i += 4;
        break;
      case 45: 
      case 77: 
      case 109: 
        b(paramArrayOfByte, i, paramzcy1, paramInt4, paramInt5);
        i += 9;
        break;
      case 26: 
      case 27: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
      case 51: 
      case 52: 
      case 53: 
      case 54: 
      case 55: 
      case 56: 
      case 62: 
      case 63: 
      case 78: 
      case 79: 
      case 80: 
      case 81: 
      case 82: 
      case 83: 
      case 84: 
      case 85: 
      case 86: 
      case 87: 
      case 88: 
      case 94: 
      case 95: 
      case 110: 
      case 111: 
      case 112: 
      case 113: 
      case 114: 
      case 115: 
      case 116: 
      case 117: 
      case 118: 
      case 119: 
      case 120: 
      default: 
        paramzcy1.a(paramArrayOfByte[(i++)]);
      }
    }
    return new int[] { i, j };
  }
  
  private static void a(byte[] paramArrayOfByte, int paramInt1, zcy paramzcy, int paramInt2, int paramInt3)
  {
    int i = paramInt1;
    int j = (paramArrayOfByte[(i + 3)] & 0xFF & 0x80) == 0 ? 1 : 0;
    int k = (paramArrayOfByte[(i + 3)] & 0xFF & 0x40) == 0 ? 1 : 0;
    int m = zc.e(paramArrayOfByte, i) & 0xFFFF;
    if ((j == 0) && (m + paramInt2 > 65535))
    {
      paramzcy.a(paramArrayOfByte, i, 2);
      paramzcy.a((byte)15);
      paramzcy.a(1);
    }
    else
    {
      paramzcy.a(paramArrayOfByte, i, 2);
      paramzcy.a(2);
    }
    i += 2;
    if ((k == 0) && ((paramArrayOfByte[i] & 0xFF) + paramInt3 > 255))
    {
      paramzcy.a(paramArrayOfByte[i]);
      paramzcy.a((byte)(paramArrayOfByte[(i + 1)] & 0xFF | 0x3F));
    }
    else
    {
      paramzcy.a(paramArrayOfByte, i, 2);
    }
  }
  
  private static void b(byte[] paramArrayOfByte, int paramInt1, zcy paramzcy, int paramInt2, int paramInt3)
  {
    int i = paramInt1;
    paramzcy.a(paramArrayOfByte[i]);
    i++;
    int j = (paramArrayOfByte[(i + 5)] & 0xFF & 0x80) == 0 ? 1 : 0;
    int k = (paramArrayOfByte[(i + 5)] & 0xFF & 0x40) == 0 ? 1 : 0;
    int m = (paramArrayOfByte[(i + 7)] & 0xFF & 0x80) == 0 ? 1 : 0;
    int n = (paramArrayOfByte[(i + 7)] & 0xFF & 0x40) == 0 ? 1 : 0;
    int i1 = zc.e(paramArrayOfByte, i) & 0xFFFF;
    if ((j == 0) && (paramInt2 + i1 > 65535))
    {
      paramzcy.a(paramArrayOfByte, i, 2);
      paramzcy.a((byte)15);
      paramzcy.a(1);
    }
    else
    {
      paramzcy.a(paramArrayOfByte, i, 2);
      paramzcy.a(2);
    }
    i += 2;
    i1 = zc.e(paramArrayOfByte, i) & 0xFFFF;
    if ((m == 0) && (paramInt2 + i1 > 65535))
    {
      paramzcy.a(paramArrayOfByte, i, 2);
      paramzcy.a((byte)15);
      paramzcy.a(1);
    }
    else
    {
      paramzcy.a(paramArrayOfByte, i, 2);
      paramzcy.a(2);
    }
    i += 2;
    if ((k == 0) && ((paramArrayOfByte[i] & 0xFF) + paramInt3 > 255))
    {
      paramzcy.a(paramArrayOfByte[i]);
      paramzcy.a((byte)(paramArrayOfByte[(i + 1)] & 0xFF | 0x3F));
    }
    else
    {
      paramzcy.a(paramArrayOfByte, i, 2);
    }
    i += 2;
    if ((n == 0) && ((paramArrayOfByte[i] & 0xFF) + paramInt3 > 255))
    {
      paramzcy.a(paramArrayOfByte[i]);
      paramzcy.a((byte)(paramArrayOfByte[(i + 1)] & 0xFF | 0x3F));
    }
    else
    {
      paramzcy.a(paramArrayOfByte, i, 2);
    }
    i += 2;
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt, zcy paramzcy)
  {
    int i = paramInt;
    int j = (paramArrayOfByte[i] & 0xFF) + 1;
    int k = (zc.e(paramArrayOfByte, i + 1) & 0xFFFF) + 1;
    i += 3;
    paramzcy.a(zc.a(j), 0, 4);
    paramzcy.a(zc.a(k), 0, 4);
    for (int m = 0; m < k; m++) {
      for (int n = 0; n < j; n++) {
        switch (paramArrayOfByte[i])
        {
        case 0: 
          paramzcy.a((byte)1);
          paramzcy.a(2);
          i += 9;
          break;
        case 1: 
          i++;
          paramzcy.a((byte)0);
          paramzcy.a(paramArrayOfByte, i, 8);
          i += 8;
          break;
        case 2: 
          i++;
          int i1 = zc.e(paramArrayOfByte, i) & 0xFFFF;
          if (i1 != 0)
          {
            paramzcy.a((byte)1);
            String str = null;
            if (paramArrayOfByte[(i + 2)] == 0)
            {
              str = Encoding.getASCII().a(paramArrayOfByte, i + 3, i1);
              i += 3 + i1;
            }
            else
            {
              str = Encoding.getUnicode().a(paramArrayOfByte, i + 3, i1 * 2);
              i += 3 + i1 * 2;
            }
            paramzcy.a(zc.a(i1), 0, 2);
            paramzcy.a(Encoding.getUnicode().a(str), 0, i1 * 2);
          }
          else
          {
            paramzcy.a((byte)1);
            paramzcy.a(2);
            i += 3;
          }
          break;
        case 4: 
          paramzcy.a((byte)2);
          paramzcy.a(paramArrayOfByte[(i + 1)]);
          i += 9;
          break;
        case 16: 
          paramzcy.a((byte)4);
          paramzcy.a(paramArrayOfByte[(i + 1)]);
          paramzcy.a(3);
          i += 9;
        }
      }
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */