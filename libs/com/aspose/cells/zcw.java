package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcw
{
  private WorksheetCollection b;
  boolean a;
  private zcy c = null;
  private int d = 0;
  private int e = 0;
  
  zcw(WorksheetCollection paramWorksheetCollection)
  {
    this.b = paramWorksheetCollection;
  }
  
  void a(zwh paramzwh)
  {
    this.c = null;
    this.d = 0;
    this.e = 0;
    this.a = false;
    byte[] arrayOfByte1 = paramzwh.f();
    if ((arrayOfByte1 == null) || (arrayOfByte1.length < 4)) {
      return;
    }
    if (arrayOfByte1.length == 4)
    {
      paramzwh.a(new byte[2]);
      return;
    }
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length - 2];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 2);
    System.arraycopy(arrayOfByte1, 4, arrayOfByte2, 2, arrayOfByte1.length - 4);
    paramzwh.a(arrayOfByte2);
  }
  
  byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    this.c = null;
    this.d = 0;
    this.a = false;
    int i = paramArrayOfByte.length;
    int j = i;
    int k = 0;
    zcy localzcy = null;
    int m = paramInt;
    this.e = 0;
    if (m == -1)
    {
      m = 4;
      i = zc.a(paramArrayOfByte, 0);
      j = m + i;
      if (j < paramArrayOfByte.length)
      {
        this.e = zc.a(paramArrayOfByte, j);
        this.d = (j + 4);
      }
      k = 1;
      localzcy = new zcy(i + 4);
    }
    else
    {
      localzcy = new zcy(paramArrayOfByte.length);
    }
    if (this.d >= paramArrayOfByte.length) {
      this.e = 0;
    }
    ArrayList localArrayList = new ArrayList();
    m = a(paramArrayOfByte, m, j, localzcy, localArrayList);
    if (localArrayList.size() != 0) {
      for (n = 0; n < localArrayList.size(); n++)
      {
        localObject = (int[])localArrayList.get(n);
        localzcy.a(localObject[2], zc.a(localObject[1] - localObject[0] - localObject[3]), 0, 2);
      }
    }
    int n = localzcy.b();
    if (n > 65535) {
      return new byte[] { 2, 0, 28, 42 };
    }
    if (k != 0)
    {
      n += (this.e != 0 ? this.c.b() : 0);
      localObject = new byte[n + 2];
      System.arraycopy(zc.a(localzcy.b()), 0, localObject, 0, 2);
      localzcy.a((byte[])localObject, 2);
      if (this.e != 0)
      {
        int i1 = localzcy.b() + 2;
        this.c.a((byte[])localObject, i1);
      }
      return (byte[])localObject;
    }
    Object localObject = new byte[n];
    localzcy.a((byte[])localObject, 0);
    return (byte[])localObject;
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 == 0) && (paramInt3 == 1048575)) {
      return (paramInt2 > 255) || (paramInt4 > 255);
    }
    if ((paramInt2 == 0) && (paramInt4 == 16383)) {
      return (paramInt1 > 65535) || (paramInt3 > 65535);
    }
    return (paramInt1 <= 65535) && (paramInt3 <= 65535) && (paramInt2 <= 255) && (paramInt4 <= 255);
  }
  
  private static void a(ArrayList paramArrayList, int paramInt1, int paramInt2, zcy paramzcy)
  {
    int i = paramInt1;
    if (paramArrayList.size() == 0) {
      return;
    }
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      int[] arrayOfInt = (int[])paramArrayList.get(j);
      if (i >= arrayOfInt[0]) {
        if (i >= arrayOfInt[1])
        {
          if (arrayOfInt[3] != 0) {
            paramzcy.a(arrayOfInt[2], zc.a(arrayOfInt[1] - arrayOfInt[0] - arrayOfInt[3]), 0, 2);
          }
          paramArrayList.remove(j--);
        }
        else
        {
          arrayOfInt[3] += paramInt2;
        }
      }
    }
  }
  
  private int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, zcy paramzcy, ArrayList paramArrayList)
  {
    int i = paramInt1;
    int j = paramInt2;
    int[] arrayOfInt = new int[4];
    while (i < j)
    {
      int i2;
      int k;
      int n;
      int i5;
      int i6;
      int m;
      int i1;
      switch (paramArrayOfByte[i])
      {
      case 24: 
        if (paramArrayOfByte[(i + 1)] == 25)
        {
          i2 = zbvl.a(this.b, paramArrayOfByte, i, this.d);
          if (i2 != 0)
          {
            if (this.c == null) {
              this.c = new zcy(this.e);
            }
            this.c.a(paramArrayOfByte, this.d, i2);
            this.d += i2;
          }
          paramzcy.a(paramArrayOfByte, i, 14);
          i += 14;
        }
        else if (paramArrayOfByte[(i + 1)] == 29)
        {
          paramzcy.a(paramArrayOfByte, i, 6);
          i += 6;
        }
        else
        {
          paramzcy.a(paramArrayOfByte[i]);
          i++;
        }
        break;
      case 1: 
      case 2: 
        k = zc.a(paramArrayOfByte, i + 1);
        n = zcjb.a(paramArrayOfByte, i + 5);
        if ((k > 65535) || (n > 255))
        {
          paramzcy.a((byte)42);
          paramzcy.a(4);
        }
        else
        {
          paramzcy.a(paramArrayOfByte, i, 3);
          paramzcy.a(paramArrayOfByte, i + 5, 2);
        }
        i += 7;
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
        paramzcy.a(paramArrayOfByte[i]);
        i++;
        break;
      case 23: 
        i2 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        paramzcy.a(paramArrayOfByte[i]);
        paramzcy.a(paramArrayOfByte[(i + 1)]);
        paramzcy.a((byte)1);
        paramzcy.a(paramArrayOfByte, i + 3, i2 * 2);
        i += (i2 * 2 + 3 & 0xFFFF);
        break;
      case 25: 
        int i3 = 4;
        int i4 = 0;
        switch (paramArrayOfByte[(i + 1)])
        {
        case 2: 
        case 8: 
          paramzcy.a(paramArrayOfByte, i, i3);
          i4 = zc.e(paramArrayOfByte, i + 2) & 0xFFFF;
          i += 4;
          arrayOfInt = new int[4];
          arrayOfInt[0] = i;
          arrayOfInt[1] = (i + i4);
          arrayOfInt[2] = (paramzcy.b() - 2);
          zf.a(paramArrayList, arrayOfInt);
          break;
        case 4: 
          i5 = zc.e(paramArrayOfByte, i + 4);
          i3 = (i5 & 0xFFFF) + 4;
          paramzcy.a(paramArrayOfByte, i, i3);
          i6 = zc.e(paramArrayOfByte, i + 2) & 0xFFFF;
          int i7 = i + 4;
          for (int i8 = 0; i8 < i6; i8++)
          {
            int i9 = i + 6 + i8 * 2;
            arrayOfInt = new int[4];
            arrayOfInt[0] = i7;
            i4 = zc.e(paramArrayOfByte, i9) & 0xFFFF;
            arrayOfInt[1] = (i7 + i4);
            arrayOfInt[2] = (paramzcy.b() - (i6 - i8) * 2);
            zf.a(paramArrayList, arrayOfInt);
          }
          i += i3;
          break;
        default: 
          paramzcy.a(paramArrayOfByte, i, i3);
          i += i3;
        }
        break;
      case 28: 
      case 29: 
        paramzcy.a(paramArrayOfByte, i, 2);
        i += 2;
        break;
      case 31: 
        paramzcy.a(paramArrayOfByte, i, 9);
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        a(paramArrayList, i, 7, paramzcy);
        paramzcy.a(paramArrayOfByte, i, 8);
        i += 15;
        a(paramArrayOfByte);
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        a(zc.e(paramArrayOfByte, i + 1) & 0xFFFF);
        paramzcy.a(paramArrayOfByte, i, 3);
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        a(zc.e(paramArrayOfByte, i + 2) & 0xFFFF);
        paramzcy.a(paramArrayOfByte, i, 4);
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        paramzcy.a(paramArrayOfByte, i, 5);
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        a(paramArrayList, i, 2, paramzcy);
        k = zc.a(paramArrayOfByte, i + 1);
        n = zcjb.a(paramArrayOfByte, i + 5);
        if ((k > 65535) || (n > 255))
        {
          paramzcy.a((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          paramzcy.a(4);
        }
        else
        {
          paramzcy.a(paramArrayOfByte, i, 3);
          paramzcy.a(paramArrayOfByte, i + 5, 2);
        }
        i += 7;
        break;
      case 42: 
      case 74: 
      case 106: 
        a(paramArrayList, i, 2, paramzcy);
        paramzcy.a(paramArrayOfByte, i, 3);
        paramzcy.a(paramArrayOfByte, i + 5, 2);
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        a(paramArrayList, i, 4, paramzcy);
        k = zc.a(paramArrayOfByte, i + 1);
        m = zc.a(paramArrayOfByte, i + 5);
        n = zcjb.a(paramArrayOfByte, i + 9);
        i1 = zcjb.a(paramArrayOfByte, i + 11);
        if ((k == 0) && (m == 1048575))
        {
          if ((n == 0) && (i1 == 16383))
          {
            paramzcy.a(paramArrayOfByte, i, 3);
            paramzcy.a(paramArrayOfByte, i + 5, 2);
            paramzcy.a(paramArrayOfByte, i + 9, 3);
            paramzcy.a((byte)(paramArrayOfByte[(i + 12)] & 0xFF & 0xC0));
          }
          else if ((n > 255) || (i1 > 255))
          {
            paramzcy.a((byte)((paramArrayOfByte[i] & 0xFF) + 6));
            paramzcy.a(8);
          }
          else
          {
            paramzcy.a(paramArrayOfByte, i, 3);
            paramzcy.a(paramArrayOfByte, i + 5, 2);
            paramzcy.a(paramArrayOfByte, i + 9, 4);
          }
        }
        else if ((n == 0) && (i1 == 16383))
        {
          if ((k > 65535) || (k > 65535))
          {
            paramzcy.a((byte)((paramArrayOfByte[i] & 0xFF) + 6));
            paramzcy.a(8);
          }
          else
          {
            paramzcy.a(paramArrayOfByte, i, 3);
            paramzcy.a(paramArrayOfByte, i + 5, 2);
            paramzcy.a(paramArrayOfByte, i + 9, 3);
            paramzcy.a((byte)(paramArrayOfByte[(i + 12)] & 0xFF & 0xC0));
          }
        }
        else if (!a(k, n, m, i1))
        {
          paramzcy.a((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          paramzcy.a(8);
        }
        else
        {
          paramzcy.a(paramArrayOfByte, i, 3);
          paramzcy.a(paramArrayOfByte, i + 5, 2);
          paramzcy.a(paramArrayOfByte, i + 9, 4);
        }
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
        a(paramArrayList, i, 4, paramzcy);
        paramzcy.a(paramArrayOfByte, i, 3);
        paramzcy.a(paramArrayOfByte, i + 5, 2);
        paramzcy.a(paramArrayOfByte, i + 9, 4);
        i += 13;
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
        paramzcy.a(paramArrayOfByte, i, 5);
        i5 = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
        i6 = paramzcy.b();
        paramzcy.a(2);
        i += 7;
        i = a(paramArrayOfByte, i, i + i5, paramzcy, paramArrayList);
        paramzcy.a(i6, zc.a(paramzcy.b() - i6 - 2), 0, 2);
        break;
      case 41: 
      case 73: 
      case 105: 
        paramzcy.a(paramArrayOfByte[i]);
        i5 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i6 = paramzcy.b();
        paramzcy.a(2);
        i += 3;
        i = a(paramArrayOfByte, i, i + i5, paramzcy, paramArrayList);
        paramzcy.a(i6, zc.a(paramzcy.b() - i6 - 2), 0, 2);
        break;
      case 57: 
      case 89: 
      case 121: 
        paramzcy.a(paramArrayOfByte, i, 7);
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        a(paramArrayList, i, 2, paramzcy);
        k = zc.a(paramArrayOfByte, i + 3);
        n = zcjb.a(paramArrayOfByte, i + 7);
        if ((k > 65535) || (n > 255))
        {
          paramzcy.a((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          paramzcy.a(paramArrayOfByte, i + 1, 2);
          paramzcy.a(6);
        }
        else
        {
          paramzcy.a(paramArrayOfByte, i, 5);
          paramzcy.a(paramArrayOfByte, i + 7, 2);
        }
        i += 9;
        break;
      case 60: 
      case 92: 
      case 124: 
        a(paramArrayList, i, 2, paramzcy);
        paramzcy.a(paramArrayOfByte, i, 5);
        paramzcy.a(paramArrayOfByte, i + 7, 2);
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        a(paramArrayList, i, 4, paramzcy);
        k = zc.a(paramArrayOfByte, i + 3);
        m = zc.a(paramArrayOfByte, i + 7);
        n = zcjb.a(paramArrayOfByte, i + 11);
        i1 = zcjb.a(paramArrayOfByte, i + 13);
        if ((k == 0) && (m == 1048575))
        {
          if ((n == 0) && (i1 == 16383))
          {
            paramzcy.a(paramArrayOfByte, i, 5);
            paramzcy.a(paramArrayOfByte, i + 7, 2);
            paramzcy.a(paramArrayOfByte, i + 11, 3);
            paramzcy.a((byte)(paramArrayOfByte[(i + 14)] & 0xFF & 0xC0));
          }
          else if ((n > 255) || (i1 > 255))
          {
            paramzcy.a((byte)((paramArrayOfByte[i] & 0xFF) + 2));
            paramzcy.a(paramArrayOfByte, i + 1, 2);
            paramzcy.a(8);
          }
          else
          {
            paramzcy.a(paramArrayOfByte, i, 5);
            paramzcy.a(paramArrayOfByte, i + 7, 2);
            paramzcy.a(paramArrayOfByte, i + 11, 4);
          }
        }
        else if ((n == 0) && (i1 == 16383))
        {
          if ((k > 65535) || (k > 65535))
          {
            paramzcy.a((byte)((paramArrayOfByte[i] & 0xFF) + 2));
            paramzcy.a(paramArrayOfByte, i + 1, 2);
            paramzcy.a(8);
          }
          else
          {
            paramzcy.a(paramArrayOfByte, i, 5);
            paramzcy.a(paramArrayOfByte, i + 7, 2);
            paramzcy.a(paramArrayOfByte, i + 11, 3);
            paramzcy.a((byte)(paramArrayOfByte[(i + 14)] & 0xFF & 0xC0));
          }
        }
        else if (!a(k, n, m, i1))
        {
          paramzcy.a((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          paramzcy.a(paramArrayOfByte, i + 1, 2);
          paramzcy.a(8);
        }
        else
        {
          paramzcy.a(paramArrayOfByte, i, 5);
          paramzcy.a(paramArrayOfByte, i + 7, 2);
          paramzcy.a(paramArrayOfByte, i + 11, 4);
        }
        i += 15;
        break;
      case 61: 
      case 93: 
      case 125: 
        a(paramArrayList, i, 4, paramzcy);
        paramzcy.a(paramArrayOfByte, i, 5);
        paramzcy.a(paramArrayOfByte, i + 7, 2);
        paramzcy.a(paramArrayOfByte, i + 11, 4);
        i += 15;
        break;
      case 44: 
      case 76: 
      case 108: 
        a(paramArrayList, i, 2, paramzcy);
        paramzcy.a(paramArrayOfByte, i, 3);
        paramzcy.a(paramArrayOfByte[(i + 5)]);
        paramzcy.a((byte)(paramArrayOfByte[(i + 6)] & 0xFF & 0xC0));
        i += 7;
        break;
      case 45: 
      case 77: 
      case 109: 
        a(paramArrayList, i, 4, paramzcy);
        paramzcy.a(paramArrayOfByte, i, 3);
        paramzcy.a(paramArrayOfByte, i + 5, 2);
        paramzcy.a(paramArrayOfByte[(i + 9)]);
        paramzcy.a((byte)(paramArrayOfByte[(i + 10)] & 0xFF & 0xC0));
        paramzcy.a(paramArrayOfByte[(i + 11)]);
        paramzcy.a((byte)(paramArrayOfByte[(i + 12)] & 0xFF & 0xC0));
        i += 13;
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
        paramzcy.a(paramArrayOfByte[(i++)]);
      }
    }
    return i;
  }
  
  private void a(int paramInt)
  {
    if (this.a) {
      return;
    }
    if (paramInt >= 480) {
      this.a = true;
    }
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    if (this.c == null) {
      this.c = new zcy(this.e);
    }
    int i = zc.a(paramArrayOfByte, this.d);
    int j = zc.a(paramArrayOfByte, this.d + 4);
    this.d += 8;
    this.c.a((byte)(i - 1));
    this.c.a(zc.a(j - 1), 0, 2);
    for (int k = 0; k < j; k++) {
      for (int m = 0; m < i; m++) {
        switch (paramArrayOfByte[this.d])
        {
        case 0: 
          this.c.a((byte)1);
          this.c.a(paramArrayOfByte, this.d + 1, 8);
          this.d += 9;
          break;
        case 1: 
          int n = zc.e(paramArrayOfByte, this.d + 1) & 0xFFFF;
          this.c.a((byte)2);
          if (n == 0)
          {
            this.c.a(2);
          }
          else
          {
            this.c.a(paramArrayOfByte, this.d + 1, 2);
            this.c.a((byte)1);
            this.c.a(paramArrayOfByte, this.d + 3, n * 2);
          }
          this.d += 3 + n * 2;
          break;
        case 2: 
          this.c.a((byte)4);
          this.c.a(paramArrayOfByte[(this.d + 1)]);
          this.c.a(7);
          this.d += 2;
          break;
        case 4: 
          this.c.a((byte)16);
          this.c.a(paramArrayOfByte[(this.d + 1)]);
          this.c.a(7);
          this.d += 5;
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */