package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zciz
{
  static byte[] a(Object paramObject)
  {
    byte[] arrayOfByte = null;
    switch (zaoj.a(paramObject.getClass()))
    {
    case 7: 
      arrayOfByte = new byte[17];
      arrayOfByte[0] = 9;
      arrayOfByte[4] = 31;
      System.arraycopy(zc.a(((Short)paramObject).shortValue()), 0, arrayOfByte, 5, 8);
      break;
    case 9: 
      arrayOfByte = new byte[17];
      arrayOfByte[0] = 9;
      arrayOfByte[4] = 31;
      System.arraycopy(zc.a(((Integer)paramObject).intValue()), 0, arrayOfByte, 5, 8);
      break;
    case 14: 
      arrayOfByte = new byte[17];
      arrayOfByte[0] = 9;
      arrayOfByte[4] = 31;
      System.arraycopy(zc.a(((Double)paramObject).doubleValue()), 0, arrayOfByte, 5, 8);
      break;
    case 16: 
      arrayOfByte = new byte[17];
      arrayOfByte[0] = 9;
      arrayOfByte[4] = 31;
      System.arraycopy(zc.a(CellsHelper.getDoubleFromDateTime((DateTime)paramObject, false)), 0, arrayOfByte, 5, 8);
      break;
    case 18: 
      String str = (String)paramObject;
      arrayOfByte = new byte[7 + 2 * str.length() + 4];
      System.arraycopy(zc.a(3 + 2 * str.length()), 0, arrayOfByte, 0, 4);
      arrayOfByte[4] = 23;
      System.arraycopy(zc.a(str.length()), 0, arrayOfByte, 5, 2);
      System.arraycopy(Encoding.getUnicode().a(str), 0, arrayOfByte, 7, str.length() * 2);
    }
    return arrayOfByte;
  }
  
  static Object a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    int j = paramArrayOfByte.length;
    if (i == -1)
    {
      j = zc.a(paramArrayOfByte, 0);
      i = 4;
    }
    if (j == 0) {
      return null;
    }
    switch (paramArrayOfByte[i])
    {
    case 23: 
      int k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
      if (k * 2 + 3 == j) {
        return Encoding.getUnicode().a(paramArrayOfByte, i + 3, 2 * k);
      }
      break;
    case 30: 
      if (j == 3) {
        return Integer.valueOf(zc.e(paramArrayOfByte, i + 1) & 0xFFFF);
      }
      break;
    case 31: 
      if (j == 9) {
        return Double.valueOf(zc.f(paramArrayOfByte, i + 1));
      }
      break;
    }
    return null;
  }
  
  static boolean a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    int i = paramInt;
    int j = paramArrayOfByte.length;
    if (i == -1)
    {
      j = zc.a(paramArrayOfByte, 0);
      i = 4;
    }
    switch (paramArrayOfByte[i])
    {
    case 23: 
      if (paramBoolean) {
        return false;
      }
      int k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
      return k * 2 + 3 == j;
    case 30: 
      return j == 3;
    case 31: 
      return j == 9;
    }
    return false;
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection1, WorksheetCollection paramWorksheetCollection2, int paramInt3, zbti paramzbti, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    int k = paramInt1;
    int m = paramInt2;
    if (k == -1)
    {
      k = 4;
      m = k + zc.a(paramArrayOfByte, 0);
    }
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    Cells localCells = null;
    Cell localCell = null;
    while (k < m)
    {
      int i6;
      int i8;
      switch (paramArrayOfByte[k])
      {
      case 24: 
        if (paramArrayOfByte[(k + 1)] == 25) {
          k += 14;
        } else if (paramArrayOfByte[(k + 1)] == 29) {
          k += 6;
        } else {
          k++;
        }
        break;
      case 1: 
      case 2: 
        k += 7;
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
        k++;
        break;
      case 23: 
        int i5 = zc.e(paramArrayOfByte, k + 1) & 0xFFFF;
        k += (i5 * 2 + 3 & 0xFFFF);
        break;
      case 25: 
        switch (paramArrayOfByte[(k + 1)])
        {
        case 1: 
          k += 4;
          break;
        case 2: 
          k += 4;
          break;
        case 4: 
          i6 = zc.e(paramArrayOfByte, k + 2);
          k += (i6 & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          k += 4;
          break;
        case 16: 
          k += 4;
          break;
        case 32: 
          k += 4;
          break;
        case 64: 
          k += 4;
          break;
        default: 
          k += 4;
        }
        break;
      case 28: 
      case 29: 
        k += 2;
        break;
      case 31: 
        k += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        k += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        k += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        k += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        k += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        k += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        k += 13;
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
        k += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        k += 3;
        break;
      case 42: 
      case 74: 
      case 106: 
        k += 7;
        break;
      case 43: 
      case 75: 
      case 107: 
        k += 13;
        break;
      case 44: 
      case 76: 
      case 108: 
        k += 7;
        break;
      case 45: 
      case 77: 
      case 109: 
        k += 13;
        break;
      case 57: 
      case 89: 
      case 121: 
        k += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        if (paramBoolean)
        {
          i6 = zc.e(paramArrayOfByte, k + 1) & 0xFFFF;
          i8 = zc.e(paramArrayOfByte, k + 3) & 0xFFFF;
          n = zc.e(paramArrayOfByte, k + 5) & 0xFFFF;
          i1 = paramArrayOfByte[(k + 7)] & 0xFF;
          i4 = i6;
        }
        else
        {
          i = zc.e(paramArrayOfByte, k + 1) & 0xFFFF;
          i4 = paramWorksheetCollection1.r().d(i, paramInt3);
          if ((i4 < 0) || (i4 >= paramWorksheetCollection2.getCount()))
          {
            k += 9;
            continue;
          }
          n = zc.a(paramArrayOfByte, k + 3);
          i1 = zcjb.a(paramArrayOfByte, k + 7);
        }
        localCells = paramWorksheetCollection2.get(i4).getCells();
        localCell = localCells.checkCell(n, i1);
        if (localCell != null)
        {
          zwr localzwr1 = paramzbti.b(i4);
          localzwr1.a(n, i1, localCell.getValue());
        }
        k += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        if (paramBoolean)
        {
          int i7 = zc.e(paramArrayOfByte, k + 1) & 0xFFFF;
          i8 = zc.e(paramArrayOfByte, k + 3) & 0xFFFF;
          n = zc.e(paramArrayOfByte, k + 5) & 0xFFFF;
          i2 = zc.e(paramArrayOfByte, k + 7) & 0xFFFF;
          i1 = zc.e(paramArrayOfByte, k + 9) & 0xFFFF & 0x3FFF;
          i3 = zc.e(paramArrayOfByte, k + 11) & 0xFFFF & 0x3FFF;
          i4 = i7;
        }
        else
        {
          i = zc.e(paramArrayOfByte, k + 1) & 0xFFFF;
          i4 = paramWorksheetCollection1.r().d(i, paramInt3);
          if ((i4 < 0) || (i4 >= paramWorksheetCollection2.getCount()))
          {
            k += 15;
            continue;
          }
          n = zc.a(paramArrayOfByte, k + 3);
          i2 = zc.a(paramArrayOfByte, k + 7);
          i1 = zcjb.a(paramArrayOfByte, k + 11);
          i3 = zcjb.a(paramArrayOfByte, k + 13);
        }
        localCells = paramWorksheetCollection2.get(i4).getCells();
        Object localObject;
        if (i1 == i3) {
          localObject = new zif(localCells, n, i2, i1, true, 4, false);
        } else {
          localObject = new zie(localCells, n, (short)i1, i2, (short)i3, true, 4, false);
        }
        zwr localzwr2 = paramzbti.b(i4);
        while (((zahe)localObject).hasNext())
        {
          zgs localzgs = ((zahe)localObject).e();
          localzwr2.a(((zahe)localObject).c().i(), localzgs.a, localzgs.e().d);
        }
        if (paramBoolean) {
          k += 13;
        } else {
          k += 15;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        k += 9;
        break;
      case 61: 
      case 93: 
      case 125: 
        if (paramBoolean) {
          k += 13;
        } else {
          k += 15;
        }
        break;
      }
    }
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = paramInt1;
    int k = paramInt2;
    if (j == -1)
    {
      j = 4;
      k = j + zc.a(paramArrayOfByte, 0);
    }
    while (j < k) {
      switch (paramArrayOfByte[j])
      {
      case 24: 
        if (paramArrayOfByte[(j + 1)] == 25)
        {
          i++;
          j += 14;
        }
        else if (paramArrayOfByte[(j + 1)] == 29)
        {
          j += 6;
        }
        else
        {
          j++;
        }
        break;
      case 1: 
        j += 7;
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
        j++;
        break;
      case 23: 
        int m = zc.e(paramArrayOfByte, j + 1) & 0xFFFF;
        j += (m * 2 + 3 & 0xFFFF);
        break;
      case 25: 
        switch (paramArrayOfByte[(j + 1)])
        {
        case 1: 
          j += 4;
          break;
        case 2: 
          j += 4;
          break;
        case 4: 
          int n = zc.e(paramArrayOfByte, j + 2);
          j += (n & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          j += 4;
          break;
        case 16: 
          j += 4;
          break;
        case 32: 
          j += 4;
          break;
        case 64: 
          j += 4;
          break;
        default: 
          j += 4;
        }
        break;
      case 28: 
      case 29: 
        j += 2;
        break;
      case 31: 
        j += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        j += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        j += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        j += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        j += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        j += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        j += 13;
        break;
      case 42: 
      case 74: 
      case 106: 
        j += 7;
        break;
      case 43: 
      case 75: 
      case 107: 
        j += 13;
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
        j += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        j += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        j += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        j += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        j += 15;
        break;
      case 60: 
      case 92: 
      case 124: 
        j += 9;
        break;
      case 61: 
      case 93: 
      case 125: 
        j += 15;
        break;
      case 44: 
      case 76: 
      case 108: 
        j += 7;
        break;
      case 45: 
      case 77: 
      case 109: 
        j += 13;
        break;
      case 2: 
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
        return i;
      }
    }
    return i;
  }
  
  static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    int i = paramInt2;
    int j = a(paramArrayOfByte, paramInt1, i);
    if (j == 0) {
      return paramArrayOfByte;
    }
    int k = paramInt1;
    byte[] arrayOfByte1 = new byte[paramArrayOfByte.length + j];
    int m = 0;
    if (k == -1)
    {
      k = 4;
      n = zc.a(paramArrayOfByte, 0);
      i = k + n;
      m = 4;
      int i1 = n + j * 1;
      System.arraycopy(zc.a(i1), 0, arrayOfByte1, 0, 4);
      if (i <= paramArrayOfByte.length) {
        System.arraycopy(paramArrayOfByte, i, arrayOfByte1, i1 + m, paramArrayOfByte.length - i);
      }
    }
    int n = paramWorksheet.c().r().b(paramWorksheet.c().v(), paramWorksheet.getIndex());
    byte[] arrayOfByte2 = new byte[3];
    arrayOfByte2[0] = 91;
    System.arraycopy(zc.a(n), 0, arrayOfByte2, 1, 2);
    while (k < i)
    {
      int i2;
      int i3;
      switch (paramArrayOfByte[k])
      {
      case 24: 
        if (paramArrayOfByte[(k + 1)] == 25)
        {
          i2 = zc.a(paramArrayOfByte, k + 6);
          i3 = zc.e(paramArrayOfByte, k + 10) & 0xFFFF;
          ListObject localListObject = paramWorksheet.getListObjects().a(i2);
          if ((localListObject == null) || (i3 >= localListObject.getListColumns().getCount()))
          {
            arrayOfByte1[m] = 61;
          }
          else
          {
            System.arraycopy(arrayOfByte2, 0, arrayOfByte1, m, 3);
            if ((paramArrayOfByte[(k + 5)] & 0xFF & 0x8) != 0) {
              arrayOfByte1[m] = 123;
            } else if ((paramArrayOfByte[(k + 5)] & 0xFF & 0x4) != 0) {
              arrayOfByte1[m] = 91;
            } else {
              arrayOfByte1[m] = 59;
            }
            int i4 = localListObject.getStartColumn() + i3;
            int i5 = localListObject.getStartRow();
            if (localListObject.x() > 0) {
              i5++;
            }
            int i6 = localListObject.getEndRow();
            if (localListObject.f()) {
              i6--;
            }
            zcjb.a(paramArrayOfByte, m + 3, i5, 0, true, false);
            zcjb.a(paramArrayOfByte, m + 7, i6, 0, true, false);
            zcjb.c(paramArrayOfByte, m + 11, i4, 0, true, false);
            zcjb.c(paramArrayOfByte, m + 13, i4, 0, true, false);
          }
          m += 15;
          k += 14;
        }
        else if (paramArrayOfByte[(k + 1)] == 29)
        {
          System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 6);
          m += 6;
          k += 6;
        }
        else
        {
          arrayOfByte1[(m++)] = paramArrayOfByte[(k++)];
        }
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
        arrayOfByte1[(m++)] = paramArrayOfByte[(k++)];
        break;
      case 23: 
        i2 = zc.e(paramArrayOfByte, k + 1) & 0xFFFF;
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, i2 * 2 + 3);
        m += i2 * 2 + 3;
        k += i2 * 2 + 3;
        break;
      case 25: 
        switch (paramArrayOfByte[(k + 1)])
        {
        case 4: 
          i3 = zc.e(paramArrayOfByte, k + 2);
          k += (i3 & 0xFFFF) * 2 + 6;
          break;
        default: 
          System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 4);
          m += 4;
          k += 4;
        }
        break;
      case 28: 
      case 29: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 2);
        m += 2;
        k += 2;
        break;
      case 32: 
      case 64: 
      case 96: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 15);
        m += 15;
        k += 15;
        break;
      case 30: 
      case 33: 
      case 41: 
      case 65: 
      case 73: 
      case 97: 
      case 105: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 3);
        m += 3;
        k += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 4);
        m += 4;
        k += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 5);
        m += 5;
        k += 5;
        break;
      case 1: 
      case 36: 
      case 42: 
      case 44: 
      case 68: 
      case 74: 
      case 76: 
      case 100: 
      case 106: 
      case 108: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 7);
        m += 7;
        k += 7;
        break;
      case 31: 
      case 37: 
      case 43: 
      case 45: 
      case 69: 
      case 75: 
      case 77: 
      case 101: 
      case 107: 
      case 109: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 13);
        m += 13;
        k += 13;
        break;
      case 38: 
      case 39: 
      case 40: 
      case 57: 
      case 70: 
      case 71: 
      case 72: 
      case 89: 
      case 102: 
      case 103: 
      case 104: 
      case 121: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 7);
        m += 7;
        k += 7;
        break;
      case 58: 
      case 60: 
      case 90: 
      case 92: 
      case 122: 
      case 124: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 9);
        m += 9;
        k += 9;
        break;
      case 59: 
      case 61: 
      case 91: 
      case 93: 
      case 123: 
      case 125: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 15);
        m += 15;
        k += 15;
        break;
      case 26: 
      case 27: 
        arrayOfByte1[(m++)] = paramArrayOfByte[(k++)];
        return arrayOfByte1;
      case 2: 
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
        return arrayOfByte1;
      }
    }
    return arrayOfByte1;
  }
  
  static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte, int paramInt7, int paramInt8)
  {
    int i = paramInt7;
    int j = paramInt8;
    if (i == -1)
    {
      i = 4;
      j = i + zc.a(paramArrayOfByte, 0);
    }
    byte b = 0;
    while (i < j)
    {
      int k;
      int m;
      switch (paramArrayOfByte[i])
      {
      case 1: 
        if (paramInt2 != 0)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          k += paramInt2;
          if (k < 0) {
            k = 0;
          } else if (k > 1048575) {
            k = 1048575;
          }
          zcjb.a(paramArrayOfByte, i + 1, k, 0, true, false);
        }
        if (paramInt5 != 0)
        {
          m = zcjb.a(paramArrayOfByte, i + 5);
          m += paramInt5;
          if (m < 0) {
            m = 0;
          } else if (m > 16383) {
            m = 16383;
          }
          zcjb.b(paramArrayOfByte, i + 5, paramInt4, 0, true, false);
        }
        i += 7;
        break;
      case 2: 
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
        i++;
        break;
      case 23: 
        int n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += n * 2 + 3;
        break;
      case 24: 
        if (paramArrayOfByte[(i + 1)] == 25) {
          i += 14;
        } else if (paramArrayOfByte[(i + 1)] == 29) {
          i += 6;
        } else {
          i++;
        }
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          int i1 = zc.e(paramArrayOfByte, i + 2);
          i += (i1 & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        b = (byte)(paramArrayOfByte[(i + 6)] & 0xFF & 0xC0);
        if ((paramInt2 != 0) && (zaaq.a(b)))
        {
          k = zc.a(paramArrayOfByte, i + 1);
          k += paramInt2;
          if (k > 1048575)
          {
            k = 1048575;
          }
          else
          {
            if (k < 0)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
              i += 7;
              continue;
            }
            zcjb.a(paramArrayOfByte, i + 1, k, 0, false, false);
          }
        }
        if ((paramInt5 != 0) && (zaaq.b(b)))
        {
          m = zcjb.a(paramArrayOfByte, i + 5) + paramInt5;
          if (m < 0)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
            i += 7;
          }
          else
          {
            if (m > 16383) {
              m = 16383;
            }
            zcjb.c(paramArrayOfByte, i + 5, m, 0, false, false);
          }
        }
        else
        {
          int tmp1138_1137 = (i + 6);
          byte[] tmp1138_1131 = paramArrayOfByte;
          tmp1138_1131[tmp1138_1137] = ((byte)(tmp1138_1131[tmp1138_1137] | b));
          i += 7;
        }
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramInt2 != 0)
        {
          b = paramArrayOfByte[(i + 10)];
          if (zaaq.a(b))
          {
            k = zc.a(paramArrayOfByte, i + 1);
            k += paramInt2;
            if (k > 1048575) {
              k = 1048575;
            } else if (k < 0) {
              k = 0;
            }
            zcjb.a(paramArrayOfByte, i + 1, k, 0, false, false);
          }
          b = paramArrayOfByte[(i + 12)];
          if (zaaq.a(b))
          {
            k = zc.a(paramArrayOfByte, i + 5);
            k += paramInt2;
            if (k > 1048575) {
              k = 1048575;
            } else if (k < 0) {
              k = 0;
            }
            zcjb.a(paramArrayOfByte, i + 5, k, 0, false, false);
          }
        }
        if (paramInt5 != 0)
        {
          b = (byte)(paramArrayOfByte[(i + 10)] & 0xFF & 0xC0);
          if (zaaq.b(b))
          {
            m = zcjb.a(paramArrayOfByte, i + 9) + paramInt5;
            if (m < 0) {
              m = 0;
            } else if (m > 16383) {
              m = 16383;
            }
            zcjb.c(paramArrayOfByte, i + 9, m, 0, false, false);
          }
          b = (byte)(paramArrayOfByte[(i + 12)] & 0xFF & 0xC0);
          if (zaaq.b(b))
          {
            m = zcjb.a(paramArrayOfByte, i + 11) + paramInt5;
            if (m < 0) {
              m = 0;
            } else if (m > 16383) {
              m = 16383;
            }
            zcjb.c(paramArrayOfByte, i + 11, m, 0, false, false);
          }
        }
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        if (paramInt2 != 0)
        {
          b = (byte)(paramArrayOfByte[(i + 8)] & 0xFF & 0xC0);
          if (zaaq.a(b))
          {
            k = zc.a(paramArrayOfByte, i + 3);
            k += paramInt2;
            if (k > 1048575) {
              k = 1048575;
            } else if (k < 0) {
              k = 0;
            }
            zcjb.a(paramArrayOfByte, i + 3, k, 0, false, false);
          }
        }
        if (paramInt5 != 0)
        {
          b = (byte)(paramArrayOfByte[(i + 8)] & 0xFF & 0xC0);
          if (zaaq.b(b))
          {
            m = zcjb.a(paramArrayOfByte, i + 7);
            m += paramInt5;
            if (m > 16383) {
              m = 16383;
            } else if (m < 0) {
              m = 0;
            }
            zcjb.c(paramArrayOfByte, i + 7, m, 0, false, false);
            int tmp1681_1680 = (i + 8);
            byte[] tmp1681_1674 = paramArrayOfByte;
            tmp1681_1674[tmp1681_1680] = ((byte)(tmp1681_1674[tmp1681_1680] | b));
          }
        }
        i += 9;
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        if (paramInt2 != 0)
        {
          b = (byte)(paramArrayOfByte[(i + 12)] & 0xFF & 0xC0);
          if (zaaq.a(b))
          {
            k = zc.a(paramArrayOfByte, i + 3);
            k += paramInt2;
            if (k > 1048575) {
              k = 1048575;
            } else if (k < 0) {
              k = 0;
            } else if (((k < paramInt3 ? 1 : 0) & (paramInt2 < 0 ? 1 : 0)) != 0) {
              k = paramInt3;
            }
            zcjb.a(paramArrayOfByte, i + 3, k, 0, false, false);
          }
          b = (byte)(paramArrayOfByte[(i + 14)] & 0xFF & 0xC0);
          if (zaaq.a(b))
          {
            k = zc.a(paramArrayOfByte, i + 7);
            k += paramInt2;
            if (k > 1048575) {
              k = 1048575;
            } else if (k < 0) {
              k = 0;
            } else if (((k < paramInt3 ? 1 : 0) & (paramInt2 < 0 ? 1 : 0)) != 0) {
              k = paramInt3;
            }
            zcjb.a(paramArrayOfByte, i + 7, k, 0, false, false);
          }
        }
        if (paramInt5 != 0)
        {
          b = (byte)(paramArrayOfByte[(i + 12)] & 0xFF & 0xC0);
          if (zaaq.b(b))
          {
            m = zcjb.a(paramArrayOfByte, i + 11);
            m += paramInt5;
            if (m > 16383) {
              m = 16383;
            } else if (m < 0) {
              m = 0;
            }
            if ((m < paramInt6) && (paramInt5 < 0)) {
              m = paramInt6;
            }
            zcjb.c(paramArrayOfByte, i + 11, m, 0, false, false);
            int tmp2039_2038 = (i + 12);
            byte[] tmp2039_2032 = paramArrayOfByte;
            tmp2039_2032[tmp2039_2038] = ((byte)(tmp2039_2032[tmp2039_2038] | b));
          }
          b = (byte)(paramArrayOfByte[(i + 14)] & 0xFF & 0xC0);
          if (zaaq.b(b))
          {
            m = zcjb.a(paramArrayOfByte, i + 13);
            m += paramInt5;
            if (m > 16383) {
              m = 16383;
            } else if (m < 0) {
              m = 0;
            }
            if ((m < paramInt6) && (paramInt5 < 0)) {
              m = paramInt6;
            }
            zcjb.c(paramArrayOfByte, i + 13, m, 0, false, false);
            int tmp2154_2153 = (i + 14);
            byte[] tmp2154_2147 = paramArrayOfByte;
            tmp2154_2147[tmp2154_2153] = ((byte)(tmp2154_2147[tmp2154_2153] | b));
          }
        }
        i += 15;
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 15;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 13;
        break;
      }
    }
  }
  
  static void a(Worksheet paramWorksheet, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
  {
    int m = paramInt5;
    int n = paramInt6;
    if (m == -1)
    {
      m = 4;
      n = m + zc.a(paramArrayOfByte, 0);
    }
    while (m < n)
    {
      int i;
      int[] arrayOfInt1;
      int k;
      boolean bool5;
      int j;
      boolean bool1;
      boolean bool4;
      int[] arrayOfInt4;
      switch (paramArrayOfByte[m])
      {
      case 1: 
      case 2: 
        if (paramBoolean)
        {
          i = zc.a(paramArrayOfByte, m + 1);
          if (i >= paramInt1)
          {
            i += paramInt2;
            if (i > 1048575) {
              i = 1048575;
            }
            zcjb.a(paramArrayOfByte, m + 1, i, 0, false, false);
          }
        }
        m += 7;
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
        m++;
        break;
      case 23: 
        int i1 = zc.e(paramArrayOfByte, m + 1) & 0xFFFF;
        m += i1 * 2 + 3;
        break;
      case 24: 
        if (paramArrayOfByte[(m + 1)] == 25) {
          m += 14;
        } else if (paramArrayOfByte[(m + 1)] == 29) {
          m += 6;
        } else {
          m++;
        }
        break;
      case 25: 
        switch (paramArrayOfByte[(m + 1)])
        {
        case 1: 
          m += 4;
          break;
        case 2: 
          m += 4;
          break;
        case 4: 
          int i2 = zc.e(paramArrayOfByte, m + 4);
          m += (i2 & 0xFFFF) + 4;
          break;
        case 8: 
          m += 4;
          break;
        case 16: 
          m += 4;
          break;
        case 32: 
          m += 4;
          break;
        case 64: 
          m += 4;
          break;
        default: 
          m += 4;
        }
        break;
      case 28: 
      case 29: 
        m += 2;
        break;
      case 31: 
        m += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        m += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        m += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        m += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        m += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        if (paramBoolean)
        {
          i = zc.a(paramArrayOfByte, m + 1);
          arrayOfInt1 = new int[] { i };
          boolean bool2 = a(paramInt1, paramInt2, arrayOfInt1, 1048575);
          i = arrayOfInt1[0];
          if (bool2) {
            paramArrayOfByte[m] = ((byte)((paramArrayOfByte[m] & 0xFF) + 6));
          } else {
            zcjb.a(paramArrayOfByte, m + 1, i, 0, false, false);
          }
        }
        m += 7;
        break;
      case 42: 
      case 74: 
      case 106: 
        m += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          i = zc.a(paramArrayOfByte, m + 1);
          k = zc.a(paramArrayOfByte, m + 5);
          if ((i == 0) && (k == 1048575))
          {
            m += 13;
            continue;
          }
          arrayOfInt1 = new int[] { i };
          int[] arrayOfInt2 = { k };
          bool5 = a(paramInt1, paramInt2, arrayOfInt1, arrayOfInt2, 1048575);
          i = arrayOfInt1[0];
          k = arrayOfInt2[0];
          if (bool5)
          {
            paramArrayOfByte[m] = ((byte)((paramArrayOfByte[m] & 0xFF) + 6));
          }
          else
          {
            zcjb.a(paramArrayOfByte, m + 1, i, 0, false, false);
            zcjb.a(paramArrayOfByte, m + 5, k, 0, false, false);
          }
        }
        m += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
        m += 13;
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
        m += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        m += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        m += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        j = zc.e(paramArrayOfByte, m + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(j, paramWorksheet))
        {
          m += 9;
        }
        else
        {
          i = zc.a(paramArrayOfByte, m + 3);
          arrayOfInt1 = new int[] { i };
          boolean bool3 = a(paramInt1, paramInt2, arrayOfInt1, 1048575);
          i = arrayOfInt1[0];
          if (bool3) {
            paramArrayOfByte[m] = ((byte)((paramArrayOfByte[m] & 0xFF) + 2));
          } else {
            zcjb.a(paramArrayOfByte, m + 3, i, 0, false, false);
          }
          m += 9;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        m += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        j = zc.e(paramArrayOfByte, m + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(j, paramWorksheet))
        {
          m += 15;
        }
        else
        {
          i = zc.a(paramArrayOfByte, m + 3);
          k = zc.a(paramArrayOfByte, m + 7);
          if ((i == 0) && (k == 1048575))
          {
            m += 15;
          }
          else
          {
            arrayOfInt1 = new int[] { i };
            int[] arrayOfInt3 = { k };
            bool5 = a(paramInt1, paramInt2, arrayOfInt1, arrayOfInt3, 1048575);
            i = arrayOfInt1[0];
            k = arrayOfInt3[0];
            if (bool5)
            {
              paramArrayOfByte[m] = ((byte)((paramArrayOfByte[m] & 0xFF) + 2));
            }
            else
            {
              zcjb.a(paramArrayOfByte, m + 3, i, 0, false, false);
              zcjb.a(paramArrayOfByte, m + 7, k, 0, false, false);
            }
            m += 15;
          }
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        m += 15;
        break;
      case 44: 
      case 76: 
      case 108: 
        if (paramBoolean)
        {
          bool1 = zaaq.a(paramArrayOfByte[(m + 6)]);
          i = zcjb.a(paramArrayOfByte, m + 1, paramInt3, paramArrayOfByte[(m + 6)]);
          bool4 = i == paramInt3;
          arrayOfInt4 = new int[] { i };
          boolean bool6 = a(paramInt1, paramInt2, arrayOfInt4, 1048575);
          i = arrayOfInt4[0];
          if (bool6)
          {
            if (!bool4) {
              paramArrayOfByte[m] = ((byte)((paramArrayOfByte[m] & 0xFF) - 2));
            }
          }
          else {
            zcjb.a(paramArrayOfByte, m + 1, i, paramInt4, !bool1, true);
          }
        }
        m += 7;
        break;
      case 45: 
      case 77: 
      case 109: 
        if (paramBoolean)
        {
          bool1 = zaaq.a(paramArrayOfByte[(m + 10)]);
          bool4 = zaaq.a(paramArrayOfByte[(m + 12)]);
          i = zcjb.a(paramArrayOfByte, m + 1, paramInt3, paramArrayOfByte[(m + 10)]);
          k = zcjb.a(paramArrayOfByte, m + 5, paramInt3, paramArrayOfByte[(m + 12)]);
          arrayOfInt4 = new int[] { i };
          int[] arrayOfInt5 = { k };
          boolean bool7 = a(paramInt1, paramInt2, arrayOfInt4, arrayOfInt5, 1048575);
          i = arrayOfInt4[0];
          k = arrayOfInt5[0];
          if (bool7)
          {
            paramArrayOfByte[m] = ((byte)((paramArrayOfByte[m] & 0xFF) - 2));
          }
          else
          {
            zcjb.a(paramArrayOfByte, m + 1, i, paramInt4, !bool1, true);
            zcjb.a(paramArrayOfByte, m + 5, k, paramInt4, !bool4, true);
          }
        }
        m += 13;
        break;
      }
    }
  }
  
  static void a(Worksheet paramWorksheet, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, byte[][] paramArrayOfByte)
  {
    int j = paramInt9;
    int k = paramInt10;
    if (j == -1)
    {
      j = 4;
      k = j + zc.a(paramArrayOfByte[0], 0);
    }
    while (j < k)
    {
      int m;
      int n;
      int[] arrayOfInt5;
      boolean bool6;
      int i;
      int i2;
      int[] arrayOfInt4;
      boolean bool1;
      switch (paramArrayOfByte[0][j])
      {
      case 1: 
      case 2: 
        if (paramBoolean)
        {
          if (paramInt2 != 0)
          {
            m = zc.a(paramArrayOfByte[0], j + 1);
            if (m >= paramInt1)
            {
              m += paramInt2;
              if (m > 1048575) {
                m = 1048575;
              }
              zcjb.a(paramArrayOfByte[0], j + 1, m, 0, false, false);
            }
          }
          if (paramInt6 != 0)
          {
            m = zcjb.a(paramArrayOfByte[0], j + 5);
            if (m >= paramInt5)
            {
              m += paramInt6;
              if (m > 16383) {
                m = 16383;
              }
              zcjb.c(paramArrayOfByte[0], j + 5, m, 0, false, false);
            }
          }
        }
        j += 7;
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
        j++;
        break;
      case 23: 
        m = zc.e(paramArrayOfByte[0], j + 1) & 0xFFFF;
        j += m * 2 + 3;
        break;
      case 24: 
        if (paramArrayOfByte[0][(j + 1)] == 25) {
          j += 14;
        } else if (paramArrayOfByte[0][(j + 1)] == 29) {
          j += 6;
        } else {
          j++;
        }
        break;
      case 25: 
        switch (paramArrayOfByte[0][(j + 1)])
        {
        case 1: 
          j += 4;
          break;
        case 2: 
          j += 4;
          break;
        case 4: 
          n = zc.e(paramArrayOfByte[0], j + 2);
          j += (n & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          j += 4;
          break;
        case 16: 
          j += 4;
          break;
        case 32: 
          j += 4;
          break;
        case 64: 
          j += 4;
          break;
        default: 
          j += 4;
        }
        break;
      case 28: 
      case 29: 
        j += 2;
        break;
      case 31: 
        j += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        j += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        j += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        j += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        j += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        if (paramBoolean)
        {
          int[] arrayOfInt1;
          boolean bool3;
          if ((paramInt2 != 0) && (zaaq.a(paramArrayOfByte[0][(j + 6)])))
          {
            n = zc.a(paramArrayOfByte[0], j + 1);
            arrayOfInt1 = new int[] { n };
            bool3 = a(paramInt1, paramInt2, arrayOfInt1, 1048575);
            n = arrayOfInt1[0];
            if (bool3) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 6));
            } else {
              zcjb.a(paramArrayOfByte[0], j + 1, n, 0, false, false);
            }
          }
          if ((paramInt6 != 0) && (zaaq.b(paramArrayOfByte[0][(j + 6)])))
          {
            n = zcjb.a(paramArrayOfByte[0], j + 5);
            arrayOfInt1 = new int[] { n };
            bool3 = a(paramInt5, paramInt6, arrayOfInt1, 16383);
            n = arrayOfInt1[0];
            if (bool3) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 6));
            } else {
              zcjb.c(paramArrayOfByte[0], j + 5, n, 0, false, false);
            }
          }
        }
        j += 7;
        break;
      case 42: 
      case 74: 
      case 106: 
        j += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          int i1;
          int[] arrayOfInt3;
          if (paramInt2 != 0)
          {
            n = zc.a(paramArrayOfByte[0], j + 1);
            i1 = zc.a(paramArrayOfByte[0], j + 5);
            arrayOfInt3 = new int[] { n };
            arrayOfInt5 = new int[] { i1 };
            bool6 = a(paramInt1, paramInt2, arrayOfInt3, paramArrayOfByte[0][(j + 10)], arrayOfInt5, paramArrayOfByte[0][(j + 12)], 1048575);
            n = arrayOfInt3[0];
            i1 = arrayOfInt5[0];
            if (bool6)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 6));
            }
            else
            {
              zcjb.a(paramArrayOfByte[0], j + 1, n, 0, false, false);
              zcjb.a(paramArrayOfByte[0], j + 5, i1, 0, false, false);
            }
          }
          if (paramInt6 != 0)
          {
            n = zcjb.a(paramArrayOfByte[0], j + 9);
            i1 = zcjb.a(paramArrayOfByte[0], j + 11);
            arrayOfInt3 = new int[] { n };
            arrayOfInt5 = new int[] { i1 };
            bool6 = a(paramInt5, paramInt6, arrayOfInt3, paramArrayOfByte[0][(j + 10)], arrayOfInt5, paramArrayOfByte[0][(j + 12)], 16383);
            n = arrayOfInt3[0];
            i1 = arrayOfInt5[0];
            if (bool6)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 6));
            }
            else
            {
              zcjb.c(paramArrayOfByte[0], j + 9, n, 0, false, false);
              zcjb.c(paramArrayOfByte[0], j + 11, i1, 0, false, false);
            }
          }
        }
        j += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
        j += 13;
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
        j += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        j += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        j += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        i = zc.e(paramArrayOfByte[0], j + 1) & 0xFFFF;
        if ((!paramWorksheet.c().r().a(i, paramWorksheet)) || (!zaaq.a(paramArrayOfByte[0][(j + 8)])))
        {
          j += 9;
        }
        else
        {
          int[] arrayOfInt2;
          boolean bool4;
          if (paramInt2 != 0)
          {
            n = zc.a(paramArrayOfByte[0], j + 3);
            arrayOfInt2 = new int[] { n };
            bool4 = a(paramInt1, paramInt2, arrayOfInt2, 1048575);
            n = arrayOfInt2[0];
            if (bool4) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 2));
            } else {
              zcjb.a(paramArrayOfByte[0], j + 3, n, 0, false, false);
            }
          }
          if (paramInt6 != 0)
          {
            n = zcjb.a(paramArrayOfByte[0], j + 7);
            arrayOfInt2 = new int[] { n };
            bool4 = a(paramInt5, paramInt6, arrayOfInt2, 16383);
            n = arrayOfInt2[0];
            if (bool4) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 2));
            } else {
              zcjb.c(paramArrayOfByte[0], j + 7, n, 0, false, false);
            }
          }
          j += 9;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        j += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        i = zc.e(paramArrayOfByte[0], j + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(i, paramWorksheet))
        {
          j += 15;
        }
        else
        {
          if (paramInt2 != 0)
          {
            n = zc.a(paramArrayOfByte[0], j + 3);
            i2 = zc.a(paramArrayOfByte[0], j + 7);
            arrayOfInt4 = new int[] { n };
            arrayOfInt5 = new int[] { i2 };
            bool6 = a(paramInt1, paramInt2, arrayOfInt4, paramArrayOfByte[0][(j + 12)], arrayOfInt5, paramArrayOfByte[0][(j + 14)], 1048575);
            n = arrayOfInt4[0];
            i2 = arrayOfInt5[0];
            if (bool6)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 2));
            }
            else
            {
              zcjb.a(paramArrayOfByte[0], j + 3, n, 0, false, false);
              zcjb.a(paramArrayOfByte[0], j + 7, i2, 0, false, false);
            }
          }
          if (paramInt6 != 0)
          {
            n = zcjb.a(paramArrayOfByte[0], j + 11);
            i2 = zcjb.a(paramArrayOfByte[0], j + 13);
            arrayOfInt4 = new int[] { n };
            arrayOfInt5 = new int[] { i2 };
            bool6 = a(paramInt5, paramInt6, arrayOfInt4, paramArrayOfByte[0][(j + 12)], arrayOfInt5, paramArrayOfByte[0][(j + 14)], 16383);
            n = arrayOfInt4[0];
            i2 = arrayOfInt5[0];
            if (bool6)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 2));
            }
            else
            {
              zcjb.c(paramArrayOfByte[0], j + 11, n, 0, false, false);
              zcjb.c(paramArrayOfByte[0], j + 13, i2, 0, false, false);
            }
          }
          j += 15;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        j += 15;
        break;
      case 44: 
      case 76: 
      case 108: 
        if (paramBoolean)
        {
          boolean bool5;
          if (paramInt2 != 0)
          {
            bool1 = zaaq.a(paramArrayOfByte[0][(j + 6)]);
            i2 = zcjb.a(paramArrayOfByte[0], j + 1, paramInt1, paramArrayOfByte[0][(j + 6)]);
            arrayOfInt4 = new int[] { i2 };
            bool5 = a(paramInt1, paramInt2, arrayOfInt4, 1048575);
            i2 = arrayOfInt4[0];
            if (bool5) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) - 2));
            } else {
              zcjb.a(paramArrayOfByte[0], j + 1, i2, paramInt1, !bool1, true);
            }
          }
          if (paramInt6 != 0)
          {
            bool1 = zaaq.b(paramArrayOfByte[0][(j + 6)]);
            i2 = zcjb.b(paramArrayOfByte[0], j + 5, paramInt5, paramArrayOfByte[0][(j + 6)]);
            arrayOfInt4 = new int[] { i2 };
            bool5 = a(paramInt5, paramInt6, arrayOfInt4, 16383);
            i2 = arrayOfInt4[0];
            if (bool5) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) - 2));
            } else {
              zcjb.c(paramArrayOfByte[0], j + 5, i2, paramInt5, !bool1, true);
            }
          }
        }
        j += 7;
        break;
      case 45: 
      case 77: 
      case 109: 
        if (paramBoolean)
        {
          boolean bool2;
          int i3;
          int i4;
          int[] arrayOfInt6;
          int[] arrayOfInt7;
          boolean bool7;
          if (paramInt2 != 0)
          {
            bool1 = zaaq.a(paramArrayOfByte[0][(j + 10)]);
            bool2 = zaaq.a(paramArrayOfByte[0][(j + 12)]);
            i3 = zcjb.a(paramArrayOfByte[0], j + 1, paramInt1, paramArrayOfByte[0][(j + 10)]);
            i4 = zcjb.a(paramArrayOfByte[0], j + 5, paramInt1, paramArrayOfByte[0][(j + 12)]);
            arrayOfInt6 = new int[] { i3 };
            arrayOfInt7 = new int[] { i4 };
            bool7 = a(paramInt1, paramInt2, arrayOfInt6, arrayOfInt7, 1048575);
            i3 = arrayOfInt6[0];
            i4 = arrayOfInt7[0];
            if (bool7)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) - 2));
            }
            else
            {
              zcjb.a(paramArrayOfByte[0], j + 1, i3, paramInt1, !bool1, true);
              zcjb.a(paramArrayOfByte[0], j + 5, i4, paramInt1, !bool2, true);
            }
          }
          if (paramInt2 != 0)
          {
            bool1 = zaaq.b(paramArrayOfByte[0][(j + 10)]);
            bool2 = zaaq.b(paramArrayOfByte[0][(j + 12)]);
            i3 = zcjb.b(paramArrayOfByte[0], j + 9, paramInt5, paramArrayOfByte[0][(j + 10)]);
            i4 = zcjb.b(paramArrayOfByte[0], j + 11, paramInt5, paramArrayOfByte[0][(j + 12)]);
            arrayOfInt6 = new int[] { i3 };
            arrayOfInt7 = new int[] { i4 };
            bool7 = a(paramInt5, paramInt6, arrayOfInt6, arrayOfInt7, 16383);
            i3 = arrayOfInt6[0];
            i4 = arrayOfInt7[0];
            if (bool7)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) - 2));
            }
            else
            {
              zcjb.c(paramArrayOfByte[0], j + 9, i3, paramInt5, !bool1, true);
              zcjb.c(paramArrayOfByte[0], j + 11, i4, paramInt5, !bool2, true);
            }
          }
        }
        j += 13;
        break;
      }
    }
  }
  
  static void b(Worksheet paramWorksheet, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
  {
    int i = paramInt5;
    int j = paramInt6;
    if (i == -1)
    {
      i = 4;
      j = i + zc.a(paramArrayOfByte, 0);
    }
    int n = 0;
    while (i < j)
    {
      int k;
      int i2;
      int[] arrayOfInt3;
      boolean bool6;
      int[] arrayOfInt2;
      int m;
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
        if (paramBoolean)
        {
          k = zcjb.a(paramArrayOfByte, i + 5);
          if (k >= paramInt1)
          {
            k += paramInt2;
            if (k > 1048575) {
              k = 1048575;
            }
            zcjb.b(paramArrayOfByte, i + 5, k, 0, false, false);
          }
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
        i++;
        break;
      case 23: 
        int i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += i1 * 2 + 3;
        break;
      case 24: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 25: 
          i2 = zc.e(paramArrayOfByte, i + 2) & 0xFFFF;
          int i3 = zc.e(paramArrayOfByte, i + 4);
          int i4 = zc.a(paramArrayOfByte, i + 6);
          int i5 = paramWorksheet.c().r().d(i2, paramWorksheet.c().v());
          if ((i5 < 0) || (i5 > paramWorksheet.c().getCount()) || (paramWorksheet.getIndex() != i5))
          {
            i += 14;
          }
          else
          {
            ListObject localListObject = paramWorksheet.c().get(i5).getListObjects().a(i4);
            if ((localListObject == null) || ((paramArrayOfByte[(i + 5)] & 0xFF & 0x30) != 0))
            {
              i += 14;
            }
            else
            {
              int i6 = zc.e(paramArrayOfByte, i + 10) & 0xFFFF;
              int i7 = zc.e(paramArrayOfByte, i + 12) & 0xFFFF;
              if (i6 >= localListObject.getListColumns().getCount())
              {
                i += 14;
              }
              else
              {
                if (i7 >= localListObject.getListColumns().getCount()) {
                  i7 = i6;
                }
                i6 += localListObject.getStartColumn();
                i7 += localListObject.getStartColumn();
                int[] arrayOfInt7 = { i6 };
                int[] arrayOfInt8 = { i7 };
                boolean bool8 = a(paramInt1, paramInt2, arrayOfInt7, arrayOfInt8, 16383);
                i6 = arrayOfInt7[0];
                i7 = arrayOfInt8[0];
                if (bool8)
                {
                  int tmp960_959 = (i + 5);
                  byte[] tmp960_954 = paramArrayOfByte;
                  tmp960_954[tmp960_959] = ((byte)(tmp960_954[tmp960_959] | 0x30));
                  paramArrayOfByte[(i + 6)] = -1;
                  paramArrayOfByte[(i + 7)] = -1;
                  paramArrayOfByte[(i + 8)] = -1;
                  paramArrayOfByte[(i + 9)] = -1;
                }
                else
                {
                  int i8 = localListObject.getStartColumn();
                  int i9 = localListObject.getEndColumn();
                  int[] arrayOfInt9 = { i8 };
                  int[] arrayOfInt10 = { i9 };
                  a(paramInt1, paramInt2, arrayOfInt9, arrayOfInt10, 16383);
                  i8 = arrayOfInt9[0];
                  i9 = arrayOfInt10[0];
                  i6 -= i8;
                  i7 -= i8;
                  System.arraycopy(zc.a(i6), 0, paramArrayOfByte, i + 10, 2);
                  System.arraycopy(zc.a(i7), 0, paramArrayOfByte, i + 12, 2);
                }
                i += 14;
              }
            }
          }
          break;
        case 29: 
          i += 5;
          break;
        default: 
          i++;
        }
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          i2 = zc.e(paramArrayOfByte, i + 4);
          i += (i2 & 0xFFFF) + 4;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        if (paramBoolean)
        {
          k = zcjb.a(paramArrayOfByte, i + 5);
          int[] arrayOfInt1 = { k };
          boolean bool3 = a(paramInt1, paramInt2, arrayOfInt1, 16383);
          k = arrayOfInt1[0];
          if (bool3) {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          } else {
            zcjb.b(paramArrayOfByte, i + 5, k, 0, false, false);
          }
        }
        i += 7;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 7;
        break;
      case 44: 
      case 76: 
      case 108: 
        if (paramBoolean)
        {
          boolean bool1 = zaaq.b(paramArrayOfByte[(i + 6)]);
          k = zcjb.b(paramArrayOfByte, i + 5, paramInt3, paramArrayOfByte[(i + 6)]);
          arrayOfInt3 = new int[] { k };
          bool6 = a(paramInt1, paramInt2, arrayOfInt3, 16383);
          k = arrayOfInt3[0];
          if (bool6) {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) - 2));
          } else {
            zcjb.b(paramArrayOfByte, i + 5, k, paramInt4, !bool1, true);
          }
        }
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          k = zcjb.a(paramArrayOfByte, i + 9);
          n = zcjb.a(paramArrayOfByte, i + 11);
          if ((k == 0) && (n == 16383))
          {
            i += 13;
            continue;
          }
          arrayOfInt2 = new int[] { k };
          arrayOfInt3 = new int[] { n };
          bool6 = a(paramInt1, paramInt2, arrayOfInt2, arrayOfInt3, 16383);
          k = arrayOfInt2[0];
          n = arrayOfInt3[0];
          if (bool6)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          }
          else
          {
            zcjb.b(paramArrayOfByte, i + 9, k, paramInt1, false, false);
            zcjb.b(paramArrayOfByte, i + 11, n, paramInt1, false, false);
          }
        }
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        m = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(m, paramWorksheet))
        {
          i += 9;
        }
        else
        {
          k = zcjb.a(paramArrayOfByte, i + 7);
          arrayOfInt2 = new int[] { k };
          boolean bool4 = a(paramInt1, paramInt2, arrayOfInt2, 16383);
          k = arrayOfInt2[0];
          if (bool4) {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          } else {
            zcjb.b(paramArrayOfByte, i + 7, k, 0, false, false);
          }
          i += 9;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        m = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(m, paramWorksheet))
        {
          i += 15;
        }
        else
        {
          k = zcjb.a(paramArrayOfByte, i + 11);
          n = zcjb.a(paramArrayOfByte, i + 13);
          if ((k == 0) && (n == 16383))
          {
            i += 15;
          }
          else
          {
            arrayOfInt2 = new int[] { k };
            int[] arrayOfInt4 = { n };
            bool6 = a(paramInt1, paramInt2, arrayOfInt2, arrayOfInt4, 16383);
            k = arrayOfInt2[0];
            n = arrayOfInt4[0];
            if (bool6)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
            }
            else
            {
              zcjb.b(paramArrayOfByte, i + 11, k, 0, false, false);
              zcjb.b(paramArrayOfByte, i + 13, n, 0, false, false);
            }
            i += 15;
          }
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 15;
        break;
      case 45: 
      case 77: 
      case 109: 
        if (paramBoolean)
        {
          boolean bool2 = zaaq.b(paramArrayOfByte[(i + 10)]);
          boolean bool5 = zaaq.b(paramArrayOfByte[(i + 12)]);
          k = zcjb.b(paramArrayOfByte, i + 9, paramInt3, paramArrayOfByte[(i + 10)]);
          n = zcjb.b(paramArrayOfByte, i + 11, paramInt3, paramArrayOfByte[(i + 12)]);
          int[] arrayOfInt5 = { k };
          int[] arrayOfInt6 = { n };
          boolean bool7 = a(paramInt1, paramInt2, arrayOfInt5, arrayOfInt6, 16383);
          k = arrayOfInt5[0];
          n = arrayOfInt6[0];
          if (bool7)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) - 2));
          }
          else
          {
            zcjb.b(paramArrayOfByte, i + 9, k, paramInt4, !bool2, true);
            zcjb.b(paramArrayOfByte, i + 11, n, paramInt4, !bool5, true);
          }
        }
        i += 13;
        break;
      }
    }
  }
  
  static boolean a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Cells paramCells, boolean paramBoolean, HashMap paramHashMap)
  {
    WorksheetCollection localWorksheetCollection = paramCells.p();
    int i = paramInt3;
    int j = paramInt4;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    while (i < j)
    {
      int i4;
      switch (paramArrayOfByte[i])
      {
      case 1: 
        m = zc.a(paramArrayOfByte, i + 1);
        n = zcjb.a(paramArrayOfByte, i + 5);
        Cell localCell = paramCells.checkCell(m, n);
        if (localCell != null)
        {
          zbf localzbf = localCell.F();
          paramArrayOfByte = localzbf.c();
          return a(paramInt1, paramInt2, paramArrayOfByte, paramInt3, j, paramInt5, paramInt6, paramInt7, paramCells, paramBoolean, paramHashMap);
        }
        i += 7;
        break;
      case 2: 
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
        i++;
        break;
      case 23: 
        int i3 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += i3 * 2 + 3;
        break;
      case 24: 
        if (paramArrayOfByte[(i + 1)] == 25) {
          i += 14;
        } else if (paramArrayOfByte[(i + 1)] == 29) {
          i += 6;
        } else {
          i++;
        }
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          i4 = zc.e(paramArrayOfByte, i + 2);
          i += (i4 & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i4 = (zc.e(paramArrayOfByte, i + 1) & 0xFFFF) - 1;
        if (paramHashMap.get(Integer.valueOf(i4)) != null) {
          return true;
        }
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        if (paramBoolean)
        {
          m = zc.a(paramArrayOfByte, i + 1);
          n = zcjb.a(paramArrayOfByte, i + 5);
          if ((m == paramInt5) && (n == paramInt6)) {
            return true;
          }
        }
        i += 7;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          m = zc.a(paramArrayOfByte, i + 1);
          i1 = zc.a(paramArrayOfByte, i + 5);
          n = zcjb.a(paramArrayOfByte, i + 9);
          i2 = zcjb.a(paramArrayOfByte, i + 11);
          if ((paramInt5 >= m) && (paramInt5 <= i1) && (paramInt6 >= n) && (paramInt6 <= i2)) {
            return true;
          }
        }
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (k == paramInt7)
        {
          m = zc.a(paramArrayOfByte, i + 3);
          n = zcjb.a(paramArrayOfByte, i + 7);
          if ((m == paramInt5) && (n == paramInt6)) {
            return true;
          }
        }
        i += 9;
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (k == paramInt7)
        {
          m = zc.a(paramArrayOfByte, i + 3);
          i1 = zc.a(paramArrayOfByte, i + 7);
          n = zcjb.a(paramArrayOfByte, i + 11);
          i2 = zcjb.a(paramArrayOfByte, i + 13);
          if ((paramInt5 >= m) && (paramInt5 <= i1) && (paramInt6 >= n) && (paramInt6 <= i2)) {
            return true;
          }
        }
        i += 15;
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 15;
        break;
      case 44: 
      case 76: 
      case 108: 
        if (paramBoolean)
        {
          m = zcjb.a(paramArrayOfByte, i + 1, paramInt1, paramArrayOfByte[(i + 6)]);
          n = zcjb.b(paramArrayOfByte, i + 5, paramInt2, paramArrayOfByte[(i + 6)]);
          if ((m == paramInt5) && (n == paramInt6)) {
            return true;
          }
        }
        i += 7;
        break;
      case 45: 
      case 77: 
      case 109: 
        if (paramBoolean)
        {
          m = zcjb.a(paramArrayOfByte, i + 1, paramInt1, paramArrayOfByte[(i + 10)]);
          i1 = zcjb.a(paramArrayOfByte, i + 5, paramInt1, paramArrayOfByte[(i + 12)]);
          n = zcjb.b(paramArrayOfByte, i + 9, paramInt2, paramArrayOfByte[(i + 10)]);
          i2 = zcjb.b(paramArrayOfByte, i + 11, paramInt2, paramArrayOfByte[(i + 12)]);
          if ((paramInt5 >= m) && (paramInt5 <= i1) && (paramInt6 >= n) && (paramInt6 <= i2)) {
            return true;
          }
        }
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
        return false;
      }
    }
    return false;
  }
  
  static boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection)
  {
    int i = paramInt1;
    int j = paramInt2;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    int k = 0;
    while (i < j) {
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
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
        i++;
        break;
      case 23: 
        int m = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += m * 2 + 3;
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          int n = zc.e(paramArrayOfByte, i + 2);
          i += (n & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        i += 7;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramWorksheetCollection.r().a(k, paramWorksheetCollection)) {
          return true;
        }
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramWorksheetCollection.r().c(k) != paramWorksheetCollection.v()) {
          return true;
        }
        i += 9;
        break;
      case 60: 
      case 92: 
      case 124: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramWorksheetCollection.r().c(k) != paramWorksheetCollection.v()) {
          return true;
        }
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramWorksheetCollection.r().c(k) != paramWorksheetCollection.v()) {
          return true;
        }
        i += 15;
        break;
      case 61: 
      case 93: 
      case 125: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramWorksheetCollection.r().c(k) != paramWorksheetCollection.v()) {
          return true;
        }
        i += 15;
        break;
      case 44: 
      case 76: 
      case 108: 
        i += 7;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 13;
        break;
      case 24: 
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
        return false;
      }
    }
    return false;
  }
  
  static boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection, HashMap paramHashMap1, HashMap paramHashMap2)
  {
    int i = paramInt1;
    int j = paramInt2;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    int k = 0;
    while (i < j)
    {
      int n;
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
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
        i++;
        break;
      case 23: 
        int m = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += m * 2 + 3;
        break;
      case 24: 
        if (paramArrayOfByte[(i + 1)] == 25)
        {
          n = zc.e(paramArrayOfByte, i + 2) & 0xFFFF;
          if ((paramHashMap1.get(Integer.valueOf(n)) != null) && (paramHashMap1.get(Integer.valueOf(n)) == znq.i)) {
            return true;
          }
          i += 14;
        }
        else if (paramArrayOfByte[(i + 1)] == 29)
        {
          i += 6;
        }
        else
        {
          i++;
        }
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          n = zc.e(paramArrayOfByte, i + 2);
          i += (n & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        n = (zc.e(paramArrayOfByte, i + 1) & 0xFFFF) - 1;
        if ((paramHashMap2.get(Integer.valueOf(n)) != null) && (((Boolean)paramHashMap2.get(Integer.valueOf(n))).booleanValue())) {
          return true;
        }
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        i += 7;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if ((paramHashMap1.get(Integer.valueOf(k)) != null) && (paramHashMap1.get(Integer.valueOf(k)) != znq.i)) {
          return true;
        }
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if ((paramHashMap1.get(Integer.valueOf(k)) != null) && (paramHashMap1.get(Integer.valueOf(k)) != znq.i)) {
          return true;
        }
        i += 9;
        break;
      case 60: 
      case 92: 
      case 124: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if ((paramHashMap1.get(Integer.valueOf(k)) != null) && (paramHashMap1.get(Integer.valueOf(k)) != znq.i)) {
          return true;
        }
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if ((paramHashMap1.get(Integer.valueOf(k)) != null) && (paramHashMap1.get(Integer.valueOf(k)) != znq.i)) {
          return true;
        }
        i += 15;
        break;
      case 61: 
      case 93: 
      case 125: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if ((paramHashMap1.get(Integer.valueOf(k)) != null) && (paramHashMap1.get(Integer.valueOf(k)) != znq.i)) {
          return true;
        }
        i += 15;
        break;
      case 44: 
      case 76: 
      case 108: 
        i += 7;
        break;
      case 45: 
      case 77: 
      case 109: 
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
        return false;
      }
    }
    return false;
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, HashMap paramHashMap, WorksheetCollection paramWorksheetCollection)
  {
    int i = paramInt1;
    int j = paramInt2;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    while (i < j)
    {
      int m;
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
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
        i++;
        break;
      case 23: 
        int k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += k * 2 + 3;
        break;
      case 24: 
        if (paramArrayOfByte[(i + 1)] == 25) {
          i += 14;
        } else if (paramArrayOfByte[(i + 1)] == 29) {
          i += 6;
        } else {
          i++;
        }
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          m = zc.e(paramArrayOfByte, i + 2);
          i += (m & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        m = (zc.e(paramArrayOfByte, i + 1) & 0xFFFF) - 1;
        if (paramHashMap.get(Integer.valueOf(m)) != null) {
          paramHashMap.put(Integer.valueOf(m), Boolean.valueOf(true));
        }
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        i += 7;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 7;
        break;
      case 37: 
      case 43: 
      case 45: 
      case 69: 
      case 75: 
      case 77: 
      case 101: 
      case 107: 
      case 109: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        int n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if ((paramWorksheetCollection.r().b(n).a & 0xFFFF) == paramWorksheetCollection.v())
        {
          int i1 = (zc.e(paramArrayOfByte, i + 3) & 0xFFFF) - 1;
          if (paramHashMap.get(Integer.valueOf(i1)) != null) {
            paramHashMap.put(Integer.valueOf(i1), Boolean.valueOf(true));
          }
        }
        i += 7;
        break;
      case 58: 
      case 60: 
      case 90: 
      case 92: 
      case 122: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 61: 
      case 91: 
      case 93: 
      case 123: 
      case 125: 
        i += 15;
        break;
      }
    }
  }
  
  static void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, HashMap paramHashMap, WorksheetCollection paramWorksheetCollection)
  {
    if ((paramHashMap == null) || (paramHashMap.size() == 0)) {
      return;
    }
    int i = paramInt1;
    int j = paramInt2;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    while (i < j)
    {
      int m;
      int n;
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
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
        i++;
        break;
      case 23: 
        int k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += k * 2 + 3;
        break;
      case 24: 
        if (paramArrayOfByte[(i + 1)] == 25) {
          i += 14;
        } else if (paramArrayOfByte[(i + 1)] == 29) {
          i += 6;
        } else {
          i++;
        }
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          m = zc.e(paramArrayOfByte, i + 2);
          i += (m & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        m = (zc.e(paramArrayOfByte, i + 1) & 0xFFFF) - 1;
        if (paramHashMap.get(Integer.valueOf(m)) != null)
        {
          n = ((Integer)paramHashMap.get(Integer.valueOf(m))).intValue();
          if ((n != m) && (n >= 0)) {
            System.arraycopy(zc.a(n + 1), 0, paramArrayOfByte, i + 1, 2);
          }
        }
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        i += 7;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 7;
        break;
      case 37: 
      case 43: 
      case 45: 
      case 69: 
      case 75: 
      case 77: 
      case 101: 
      case 107: 
      case 109: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        n = (zc.e(paramArrayOfByte, i + 3) & 0xFFFF) - 1;
        int i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if ((paramHashMap.get(Integer.valueOf(n)) != null) && (paramWorksheetCollection.r().c(i1) == paramWorksheetCollection.v()))
        {
          int i2 = ((Integer)paramHashMap.get(Integer.valueOf(n))).intValue();
          if ((i2 != n) && (i2 >= 0)) {
            System.arraycopy(zc.a(i2 + 1), 0, paramArrayOfByte, i + 3, 2);
          }
        }
        i += 7;
        break;
      case 58: 
      case 60: 
      case 90: 
      case 92: 
      case 122: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 61: 
      case 91: 
      case 93: 
      case 123: 
      case 125: 
        i += 15;
        break;
      }
    }
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt1;
    int j = paramInt2;
    if (i == -1)
    {
      i = 4;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
    }
    while (i < j)
    {
      byte b;
      int k;
      int m;
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
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
        i++;
        break;
      case 23: 
        int n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += n * 2 + 3;
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          int i1 = zc.e(paramArrayOfByte, i + 2);
          i += (i1 & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        i += 7;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 7;
        break;
      case 44: 
      case 76: 
      case 108: 
        int tmp785_783 = i;
        paramArrayOfByte[tmp785_783] = ((byte)(paramArrayOfByte[tmp785_783] & 0xF7));
        b = paramArrayOfByte[(i + 6)];
        if (zaaq.a(b))
        {
          k = zcjb.a(paramArrayOfByte, i + 1, paramInt3, b);
          zcjb.a(paramArrayOfByte, i + 1, k, paramInt3, false, false);
        }
        if (zaaq.b(b))
        {
          m = zcjb.b(paramArrayOfByte, i + 5, paramInt4, b);
          zcjb.b(paramArrayOfByte, i + 5, m, paramInt4, false, false);
        }
        i += 7;
        break;
      case 45: 
      case 77: 
      case 109: 
        int tmp881_879 = i;
        paramArrayOfByte[tmp881_879] = ((byte)(paramArrayOfByte[tmp881_879] & 0xF7));
        b = paramArrayOfByte[(i + 10)];
        if (zaaq.a(b))
        {
          k = zcjb.a(paramArrayOfByte, i + 1, paramInt3, b);
          zcjb.a(paramArrayOfByte, i + 1, k, paramInt3, false, false);
        }
        if (zaaq.b(b))
        {
          m = zcjb.b(paramArrayOfByte, i + 9, paramInt4, b);
          zcjb.b(paramArrayOfByte, i + 9, m, paramInt4, false, false);
        }
        b = paramArrayOfByte[(i + 12)];
        if (zaaq.a(b))
        {
          k = zcjb.a(paramArrayOfByte, i + 5, paramInt3, b);
          zcjb.a(paramArrayOfByte, i + 5, k, paramInt3, false, false);
        }
        if (zaaq.b(b))
        {
          m = zcjb.b(paramArrayOfByte, i + 11, paramInt4, b);
          zcjb.b(paramArrayOfByte, i + 11, m, paramInt4, false, false);
        }
        i += 13;
        break;
      case 37: 
      case 43: 
      case 69: 
      case 75: 
      case 101: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 60: 
      case 90: 
      case 92: 
      case 122: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 61: 
      case 91: 
      case 93: 
      case 123: 
      case 125: 
        i += 15;
        break;
      }
    }
  }
  
  static void a(CellArea paramCellArea, int paramInt1, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return;
    }
    int i = paramInt2;
    int j = paramInt3;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    int i1 = 0;
    while (i < j)
    {
      int k;
      int m;
      int n;
      switch (paramArrayOfByte[i])
      {
      case 1: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zcjb.a(paramArrayOfByte, i + 5);
          if ((k >= paramCellArea.StartRow) && (m >= paramCellArea.StartColumn) && (m <= paramCellArea.EndColumn))
          {
            k += paramInt1;
            zcjb.a(paramArrayOfByte, i + 1, k, 0, false, false);
          }
        }
        i += 7;
        break;
      case 2: 
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
        i++;
        break;
      case 23: 
        int i2 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += i2 * 2 + 3;
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          int i3 = zc.e(paramArrayOfByte, i + 2);
          i += (i3 & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zcjb.a(paramArrayOfByte, i + 5);
          if ((k >= paramCellArea.StartRow) && (m >= paramCellArea.StartColumn) && (m <= paramCellArea.EndColumn))
          {
            k += paramInt1;
            zcjb.a(paramArrayOfByte, i + 1, k, 0, false, false);
          }
        }
        i += 7;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          m = zcjb.a(paramArrayOfByte, i + 9);
          n = zcjb.a(paramArrayOfByte, i + 11);
          if ((paramCellArea.StartColumn <= m) && (paramCellArea.EndColumn >= n))
          {
            k = zc.a(paramArrayOfByte, i + 1);
            if (k >= paramCellArea.StartRow)
            {
              k += paramInt1;
              zcjb.a(paramArrayOfByte, i + 1, k, 0, false, false);
            }
            k = zc.a(paramArrayOfByte, i + 5);
            if (k >= paramCellArea.StartRow)
            {
              k += paramInt1;
              if (k > 1048575) {
                k = 1048575;
              }
              zcjb.a(paramArrayOfByte, i + 5, k, 0, false, false);
            }
          }
        }
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(i1, paramWorksheet))
        {
          i += 9;
        }
        else
        {
          k = zc.a(paramArrayOfByte, i + 3);
          m = zcjb.a(paramArrayOfByte, i + 7);
          if ((k >= paramCellArea.StartRow) && (m >= paramCellArea.StartColumn) && (m <= paramCellArea.EndColumn))
          {
            k += paramInt1;
            zcjb.a(paramArrayOfByte, i + 3, k, 0, false, false);
          }
          i += 9;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(i1, paramWorksheet))
        {
          i += 15;
        }
        else
        {
          m = zcjb.a(paramArrayOfByte, i + 11);
          n = zcjb.a(paramArrayOfByte, i + 13);
          if ((paramCellArea.StartColumn <= m) && (paramCellArea.EndColumn >= n))
          {
            k = zc.a(paramArrayOfByte, i + 3);
            if (k >= paramCellArea.StartRow)
            {
              k += paramInt1;
              zcjb.a(paramArrayOfByte, i + 3, k, 0, false, false);
            }
            k = zc.a(paramArrayOfByte, i + 7);
            if (k >= paramCellArea.StartRow)
            {
              k += paramInt1;
              if (k > 1048575) {
                k = 1048575;
              }
              zcjb.a(paramArrayOfByte, i + 7, k, 0, false, false);
            }
          }
          i += 15;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 15;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 13;
        break;
      }
    }
  }
  
  static void b(CellArea paramCellArea, int paramInt1, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return;
    }
    int i = paramInt2;
    int j = paramInt3;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    int n = 0;
    while (i < j)
    {
      int k;
      int m;
      int i2;
      int i3;
      int i4;
      int i5;
      boolean[] arrayOfBoolean1;
      boolean[] arrayOfBoolean2;
      CellArea localCellArea;
      switch (paramArrayOfByte[i])
      {
      case 1: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zcjb.a(paramArrayOfByte, i + 5);
          if ((k >= paramCellArea.StartRow) && (m >= paramCellArea.StartColumn) && (m <= paramCellArea.EndColumn))
          {
            k -= paramInt1;
            zcjb.a(paramArrayOfByte, i + 1, k, 0, false, false);
          }
        }
        i += 7;
        break;
      case 2: 
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
        i++;
        break;
      case 23: 
        int i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += i1 * 2 + 3;
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          i2 = zc.e(paramArrayOfByte, i + 2);
          i += (i2 & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zcjb.a(paramArrayOfByte, i + 5);
          if ((m >= paramCellArea.StartColumn) && (m <= paramCellArea.EndColumn)) {
            if (k > paramCellArea.EndRow)
            {
              k -= paramInt1;
              zcjb.a(paramArrayOfByte, i + 1, k, 0, false, false);
            }
            else if (k >= paramCellArea.StartRow)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
            }
          }
        }
        i += 7;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zcjb.a(paramArrayOfByte, i + 9);
          i2 = zc.a(paramArrayOfByte, i + 5);
          i3 = zcjb.a(paramArrayOfByte, i + 11);
          i4 = 0;
          i5 = 0;
          arrayOfBoolean1 = new boolean[] { i4 };
          arrayOfBoolean2 = new boolean[] { i5 };
          localCellArea = a(paramCellArea, paramInt1, k, m, i2, i3, arrayOfBoolean1, arrayOfBoolean2);
          i4 = arrayOfBoolean1[0];
          i5 = arrayOfBoolean2[0];
          if (i5 != 0)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          }
          else if (i4 != 0)
          {
            if (localCellArea.StartRow != k) {
              zcjb.a(paramArrayOfByte, i + 1, localCellArea.StartRow, 0, false, false);
            }
            if (localCellArea.EndRow != i2) {
              zcjb.a(paramArrayOfByte, i + 5, localCellArea.EndRow, 0, false, false);
            }
            zcjb.b(paramArrayOfByte, i + 9, localCellArea.StartColumn, 0, false, false);
            zcjb.b(paramArrayOfByte, i + 11, localCellArea.EndColumn, 0, false, false);
          }
        }
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(n, paramWorksheet))
        {
          i += 9;
        }
        else
        {
          k = zc.a(paramArrayOfByte, i + 3);
          m = zcjb.a(paramArrayOfByte, i + 7);
          if ((m >= paramCellArea.StartColumn) && (m <= paramCellArea.EndColumn)) {
            if (k > paramCellArea.EndRow)
            {
              k -= paramInt1;
              zcjb.a(paramArrayOfByte, i + 3, k, 0, false, false);
            }
            else if (k >= paramCellArea.StartRow)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
            }
          }
          i += 9;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(n, paramWorksheet))
        {
          i += 15;
        }
        else
        {
          k = zc.a(paramArrayOfByte, i + 3);
          m = zcjb.a(paramArrayOfByte, i + 11);
          i2 = zc.a(paramArrayOfByte, i + 7);
          i3 = zcjb.a(paramArrayOfByte, i + 13);
          i4 = 0;
          i5 = 0;
          arrayOfBoolean1 = new boolean[] { i4 };
          arrayOfBoolean2 = new boolean[] { i5 };
          localCellArea = a(paramCellArea, paramInt1, k, m, i2, i3, arrayOfBoolean1, arrayOfBoolean2);
          i4 = arrayOfBoolean1[0];
          i5 = arrayOfBoolean2[0];
          if (i5 != 0)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          }
          else if (i4 != 0)
          {
            if (localCellArea.StartRow != k) {
              zcjb.a(paramArrayOfByte, i + 3, localCellArea.StartRow, 0, false, false);
            }
            if (localCellArea.EndRow != i2) {
              zcjb.a(paramArrayOfByte, i + 7, localCellArea.EndRow, 0, false, false);
            }
            zcjb.b(paramArrayOfByte, i + 11, localCellArea.StartColumn, 0, false, false);
            zcjb.b(paramArrayOfByte, i + 13, localCellArea.EndColumn, 0, false, false);
          }
          i += 15;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 15;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 13;
        break;
      }
    }
  }
  
  static void a(CellArea paramCellArea, int paramInt1, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    int i = paramInt2;
    int j = paramInt3;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    int i1 = 0;
    while (i < j)
    {
      int k;
      int n;
      int m;
      switch (paramArrayOfByte[i])
      {
      case 1: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          n = zcjb.a(paramArrayOfByte, i + 5);
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (n >= paramCellArea.StartColumn))
          {
            n += paramInt1;
            zcjb.b(paramArrayOfByte, i + 5, n, 0, false, false);
          }
        }
        i += 7;
        break;
      case 2: 
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
        i++;
        break;
      case 23: 
        int i2 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += i2 * 2 + 3;
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          int i3 = zc.e(paramArrayOfByte, i + 2);
          i += (i3 & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          n = zcjb.a(paramArrayOfByte, i + 5);
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (n >= paramCellArea.StartColumn))
          {
            n += paramInt1;
            zcjb.b(paramArrayOfByte, i + 5, n, 0, false, false);
          }
        }
        i += 7;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zc.a(paramArrayOfByte, i + 5);
          if ((paramCellArea.StartRow <= k) && (paramCellArea.EndRow >= k))
          {
            n = zcjb.a(paramArrayOfByte, i + 9);
            if (n >= paramCellArea.StartColumn)
            {
              n += paramInt1;
              if (n > 16383) {
                n = 16383;
              }
              zcjb.b(paramArrayOfByte, i + 9, n, 0, false, false);
            }
            n = zcjb.a(paramArrayOfByte, i + 11);
            if (n >= paramCellArea.StartColumn)
            {
              n += paramInt1;
              if (n > 16383) {
                n = 16383;
              }
              zcjb.b(paramArrayOfByte, i + 11, n, 0, false, false);
            }
          }
        }
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(i1, paramWorksheet))
        {
          i += 9;
        }
        else
        {
          k = zc.a(paramArrayOfByte, i + 3);
          n = zcjb.a(paramArrayOfByte, i + 7);
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (n >= paramCellArea.StartColumn))
          {
            n += paramInt1;
            zcjb.b(paramArrayOfByte, i + 7, n, 0, false, false);
          }
          i += 9;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(i1, paramWorksheet))
        {
          i += 15;
        }
        else
        {
          k = zc.a(paramArrayOfByte, i + 3);
          m = zc.e(paramArrayOfByte, i + 7) & 0xFFFF;
          if ((paramCellArea.StartRow <= k) && (paramCellArea.EndRow >= m))
          {
            n = zcjb.a(paramArrayOfByte, i + 11);
            if (n >= paramCellArea.StartColumn)
            {
              n += paramInt1;
              if (n > 16383) {
                n = 16383;
              }
              zcjb.b(paramArrayOfByte, i + 11, n, 0, false, false);
            }
            n = zcjb.a(paramArrayOfByte, i + 13);
            if (n >= paramCellArea.StartColumn)
            {
              n += paramInt1;
              if (n > 16383) {
                n = 16383;
              }
              zcjb.b(paramArrayOfByte, i + 13, n, 0, false, false);
            }
          }
          i += 15;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 15;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 13;
        break;
      }
    }
  }
  
  static CellArea a(CellArea paramCellArea, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    CellArea localCellArea = new CellArea();
    paramArrayOfBoolean1[0] = false;
    paramArrayOfBoolean2[0] = false;
    if (paramCellArea.StartColumn > paramInt5) {
      return localCellArea;
    }
    if (paramCellArea.StartColumn > paramInt3)
    {
      if ((paramCellArea.StartRow <= paramInt2) && (paramCellArea.EndRow >= paramInt4))
      {
        paramArrayOfBoolean1[0] = true;
        localCellArea.StartRow = paramInt2;
        localCellArea.EndRow = paramInt4;
        localCellArea.StartColumn = paramInt3;
        localCellArea.EndColumn = (paramCellArea.StartColumn - 1);
        return localCellArea;
      }
    }
    else
    {
      if (paramCellArea.EndColumn < paramInt3) {
        return localCellArea;
      }
      if (paramCellArea.EndColumn < paramInt5)
      {
        if ((paramCellArea.StartRow <= paramInt2) && (paramCellArea.EndRow >= paramInt4))
        {
          paramArrayOfBoolean1[0] = true;
          localCellArea.StartRow = paramInt2;
          localCellArea.EndRow = paramInt4;
          localCellArea.StartColumn = (paramCellArea.EndColumn + 1);
          localCellArea.EndColumn = paramInt5;
          return localCellArea;
        }
      }
      else
      {
        if (paramCellArea.EndRow < paramInt2)
        {
          paramArrayOfBoolean1[0] = true;
          localCellArea.StartRow = (paramInt2 - paramInt1);
          localCellArea.EndRow = (paramInt4 - paramInt1);
          localCellArea.StartColumn = paramInt3;
          localCellArea.EndColumn = paramInt5;
          return localCellArea;
        }
        if (paramCellArea.EndRow < paramInt4)
        {
          paramArrayOfBoolean1[0] = true;
          if (paramCellArea.StartRow <= paramInt2) {
            localCellArea.StartRow = (paramCellArea.EndRow + 1 - paramInt1);
          } else {
            localCellArea.StartRow = paramInt2;
          }
          localCellArea.EndRow = (paramInt4 - paramInt1);
          localCellArea.StartColumn = paramInt3;
          localCellArea.EndColumn = paramInt5;
          return localCellArea;
        }
        if (paramCellArea.StartRow <= paramInt2)
        {
          paramArrayOfBoolean2[0] = true;
          return localCellArea;
        }
        if (paramCellArea.StartRow <= paramInt4)
        {
          paramArrayOfBoolean1[0] = true;
          localCellArea.StartRow = paramInt2;
          localCellArea.EndRow = (paramCellArea.StartRow - 1);
          localCellArea.StartColumn = paramInt3;
          localCellArea.EndColumn = paramInt5;
          return localCellArea;
        }
      }
    }
    return localCellArea;
  }
  
  static CellArea b(CellArea paramCellArea, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    CellArea localCellArea = new CellArea();
    paramArrayOfBoolean1[0] = false;
    paramArrayOfBoolean2[0] = false;
    if (paramCellArea.StartRow > paramInt4) {
      return localCellArea;
    }
    if (paramCellArea.StartRow > paramInt2)
    {
      if ((paramCellArea.EndRow >= paramInt4) && (paramCellArea.StartColumn <= paramInt3) && (paramCellArea.EndColumn >= paramInt5))
      {
        paramArrayOfBoolean1[0] = true;
        localCellArea.StartRow = paramInt2;
        localCellArea.EndRow = (paramCellArea.StartRow - 1);
        localCellArea.StartColumn = paramInt3;
        localCellArea.EndColumn = paramInt5;
        return localCellArea;
      }
    }
    else
    {
      if (paramCellArea.EndRow < paramInt2) {
        return localCellArea;
      }
      if (paramCellArea.EndRow < paramInt4)
      {
        if ((paramCellArea.StartColumn <= paramInt3) && (paramCellArea.EndColumn >= paramInt5))
        {
          paramArrayOfBoolean1[0] = true;
          localCellArea.StartRow = (paramCellArea.EndRow + 1);
          localCellArea.EndRow = paramInt4;
          localCellArea.StartColumn = paramInt3;
          localCellArea.EndColumn = paramInt5;
          return localCellArea;
        }
      }
      else
      {
        if (paramCellArea.EndColumn < paramInt3)
        {
          paramArrayOfBoolean1[0] = true;
          localCellArea.StartRow = paramInt2;
          localCellArea.EndRow = paramInt4;
          localCellArea.StartColumn = (paramInt3 - paramInt1);
          localCellArea.EndColumn = (paramInt5 - paramInt1);
          return localCellArea;
        }
        if (paramCellArea.EndColumn < paramInt5)
        {
          paramArrayOfBoolean1[0] = true;
          localCellArea.StartRow = paramInt2;
          localCellArea.EndRow = paramInt4;
          if (paramCellArea.StartColumn <= paramInt3) {
            localCellArea.StartColumn = (paramCellArea.EndColumn + 1 - paramInt1);
          } else {
            localCellArea.StartColumn = paramInt3;
          }
          localCellArea.EndColumn = (paramInt5 - paramInt1);
          return localCellArea;
        }
        if (paramCellArea.StartColumn <= paramInt3)
        {
          paramArrayOfBoolean2[0] = true;
          return localCellArea;
        }
        if (paramCellArea.StartColumn <= paramInt5)
        {
          paramArrayOfBoolean1[0] = true;
          localCellArea.StartRow = paramInt2;
          localCellArea.EndRow = paramInt4;
          localCellArea.StartColumn = paramInt3;
          localCellArea.EndColumn = (paramCellArea.StartColumn - 1);
          return localCellArea;
        }
      }
    }
    return localCellArea;
  }
  
  static void c(CellArea paramCellArea, int paramInt1, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    int j = paramInt3;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    int n = 0;
    while (i < j)
    {
      int k;
      int m;
      int i2;
      int i3;
      int i4;
      int i5;
      boolean[] arrayOfBoolean1;
      boolean[] arrayOfBoolean2;
      CellArea localCellArea;
      switch (paramArrayOfByte[i])
      {
      case 1: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zcjb.a(paramArrayOfByte, i + 5);
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (m >= paramCellArea.StartColumn))
          {
            m -= paramInt1;
            zcjb.b(paramArrayOfByte, i + 5, m, 0, false, false);
          }
        }
        i += 7;
        break;
      case 2: 
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
        i++;
        break;
      case 23: 
        int i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += i1 * 2 + 3;
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          i2 = zc.e(paramArrayOfByte, i + 2);
          i += (i2 & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zcjb.a(paramArrayOfByte, i + 5);
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow)) {
            if (m > paramCellArea.EndColumn)
            {
              m -= paramInt1;
              zcjb.b(paramArrayOfByte, i + 5, m, 0, false, false);
            }
            else if (m >= paramCellArea.StartColumn)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
            }
          }
        }
        i += 7;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zcjb.a(paramArrayOfByte, i + 9);
          i2 = zc.a(paramArrayOfByte, i + 5);
          i3 = zcjb.a(paramArrayOfByte, i + 11);
          i4 = 0;
          i5 = 0;
          arrayOfBoolean1 = new boolean[] { i4 };
          arrayOfBoolean2 = new boolean[] { i5 };
          localCellArea = b(paramCellArea, paramInt1, k, m, i2, i3, arrayOfBoolean1, arrayOfBoolean2);
          i4 = arrayOfBoolean1[0];
          i5 = arrayOfBoolean2[0];
          if (i5 != 0)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          }
          else if (i4 != 0)
          {
            if (k != localCellArea.StartRow) {
              zcjb.a(paramArrayOfByte, i + 1, localCellArea.StartRow, 0, false, false);
            }
            if (i2 != localCellArea.EndRow) {
              zcjb.a(paramArrayOfByte, i + 5, localCellArea.EndRow, 0, false, false);
            }
            zcjb.b(paramArrayOfByte, i + 9, localCellArea.StartColumn, 0, false, false);
            zcjb.b(paramArrayOfByte, i + 11, localCellArea.EndColumn, 0, false, false);
          }
        }
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(n, paramWorksheet))
        {
          i += 9;
        }
        else
        {
          k = zc.a(paramArrayOfByte, i + 3);
          m = zcjb.a(paramArrayOfByte, i + 7);
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (m >= paramCellArea.StartColumn)) {
            if (m > paramCellArea.EndColumn)
            {
              m -= paramInt1;
              zcjb.b(paramArrayOfByte, i + 7, m, 0, false, false);
            }
            else if (m >= paramCellArea.StartColumn)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
            }
          }
          i += 9;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(n, paramWorksheet))
        {
          i += 15;
        }
        else
        {
          k = zc.a(paramArrayOfByte, i + 3);
          m = zcjb.a(paramArrayOfByte, i + 11);
          i2 = zc.a(paramArrayOfByte, i + 7);
          i3 = zcjb.a(paramArrayOfByte, i + 13);
          i4 = 0;
          i5 = 0;
          arrayOfBoolean1 = new boolean[] { i4 };
          arrayOfBoolean2 = new boolean[] { i5 };
          localCellArea = b(paramCellArea, paramInt1, k, m, i2, i3, arrayOfBoolean1, arrayOfBoolean2);
          i4 = arrayOfBoolean1[0];
          i5 = arrayOfBoolean2[0];
          if (i5 != 0)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          }
          else if (i4 != 0)
          {
            if (k != localCellArea.StartRow) {
              zcjb.a(paramArrayOfByte, i + 3, localCellArea.StartRow, 0, false, false);
            }
            if (i2 != localCellArea.EndRow) {
              zcjb.a(paramArrayOfByte, i + 7, localCellArea.EndRow, 0, false, false);
            }
            zcjb.b(paramArrayOfByte, i + 11, localCellArea.StartColumn, 0, false, false);
            zcjb.b(paramArrayOfByte, i + 13, localCellArea.EndColumn, 0, false, false);
          }
          i += 15;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 15;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 13;
        break;
      }
    }
  }
  
  static void a(CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt3, int paramInt4)
  {
    int i = paramInt3;
    int j = paramInt4;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    int n = 0;
    int i1 = paramInt1 + paramCellArea.EndRow - paramCellArea.StartRow;
    int i2 = paramInt2 + paramCellArea.EndColumn - paramCellArea.StartColumn;
    while (i < j)
    {
      int i4;
      int k;
      int m;
      int i5;
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
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
        i++;
        break;
      case 23: 
        int i3 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += i3 * 2 + 3;
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          i4 = zc.e(paramArrayOfByte, i + 2);
          i += (i4 & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zcjb.a(paramArrayOfByte, i + 5);
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (m >= paramCellArea.StartColumn) && (m <= paramCellArea.EndColumn))
          {
            k = paramInt1 + k - paramCellArea.StartRow;
            m = paramInt2 + m - paramCellArea.StartColumn;
            zcjb.a(paramArrayOfByte, i + 1, k, 0, false, false);
            zcjb.b(paramArrayOfByte, i + 5, m, 0, false, false);
          }
          else if ((k >= paramInt1) && (k <= i1) && (m >= paramInt2) && (m <= i2))
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          }
        }
        i += 7;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          k = zc.a(paramArrayOfByte, i + 1);
          m = zcjb.a(paramArrayOfByte, i + 9);
          i4 = zc.a(paramArrayOfByte, i + 5);
          i5 = zcjb.a(paramArrayOfByte, i + 11);
          if ((k >= paramCellArea.StartRow) && (i4 <= paramCellArea.EndRow) && (m >= paramCellArea.StartColumn) && (i5 <= paramCellArea.EndColumn))
          {
            k = paramInt1 + k - paramCellArea.StartRow;
            m = paramInt2 + m - paramCellArea.StartColumn;
            zcjb.a(paramArrayOfByte, i + 1, k, 0, false, false);
            zcjb.b(paramArrayOfByte, i + 9, m, 0, false, false);
            i4 = paramInt1 + i4 - paramCellArea.StartRow;
            i5 = paramInt2 + i5 - paramCellArea.StartColumn;
            zcjb.a(paramArrayOfByte, i + 5, i4, 0, false, false);
            zcjb.b(paramArrayOfByte, i + 11, i5, 0, false, false);
          }
          else if ((k >= paramInt1) && (i4 <= i1) && (m >= paramInt2) && (i5 <= i2))
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          }
        }
        i += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(n, paramWorksheet))
        {
          i += 9;
        }
        else
        {
          k = zc.a(paramArrayOfByte, i + 3);
          m = zcjb.a(paramArrayOfByte, i + 7);
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (m >= paramCellArea.StartColumn) && (m <= paramCellArea.EndColumn))
          {
            k = paramInt1 + k - paramCellArea.StartRow;
            m = paramInt2 + m - paramCellArea.StartColumn;
            zcjb.a(paramArrayOfByte, i + 3, k, 0, false, false);
            zcjb.b(paramArrayOfByte, i + 7, m, 0, false, false);
          }
          else if ((k >= paramInt1) && (k <= i1) && (m >= paramInt2) && (m <= i2))
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          }
          i += 9;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(n, paramWorksheet))
        {
          i += 15;
        }
        else
        {
          k = zc.a(paramArrayOfByte, i + 3);
          m = zcjb.a(paramArrayOfByte, i + 11);
          i4 = zc.a(paramArrayOfByte, i + 7);
          i5 = zcjb.a(paramArrayOfByte, i + 13);
          if ((k >= paramCellArea.StartRow) && (i4 <= paramCellArea.EndRow) && (m >= paramCellArea.StartColumn) && (i5 <= paramCellArea.EndColumn))
          {
            k = paramInt1 + k - paramCellArea.StartRow;
            m = paramInt2 + m - paramCellArea.StartColumn;
            zcjb.a(paramArrayOfByte, i + 3, k, 0, false, false);
            zcjb.b(paramArrayOfByte, i + 11, m, 0, false, false);
            i4 = paramInt1 + i4 - paramCellArea.StartRow;
            i5 = paramInt2 + i5 - paramCellArea.StartColumn;
            zcjb.a(paramArrayOfByte, i + 7, i4, 0, false, false);
            zcjb.b(paramArrayOfByte, i + 13, i5, 0, false, false);
          }
          else if ((k >= paramInt1) && (i4 <= i1) && (m >= paramInt2) && (i5 <= i2))
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          }
          i += 15;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 15;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 13;
        break;
      }
    }
  }
  
  static boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    int j = paramInt2;
    if (i == -1)
    {
      i = 4;
      j = zc.a(paramArrayOfByte, 0) + i;
    }
    while (i < j) {
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
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
        i++;
        break;
      case 23: 
        int k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i += k * 2 + 3;
        break;
      case 25: 
        switch (paramArrayOfByte[(i + 1)])
        {
        case 1: 
          i += 4;
          break;
        case 2: 
          i += 4;
          break;
        case 4: 
          int m = zc.e(paramArrayOfByte, i + 2);
          i += (m & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i += 4;
          break;
        case 16: 
          i += 4;
          break;
        case 32: 
          i += 4;
          break;
        case 64: 
          i += 4;
          break;
        default: 
          i += 4;
        }
        break;
      case 28: 
      case 29: 
        i += 2;
        break;
      case 31: 
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        i += 7;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 7;
        break;
      case 37: 
      case 43: 
      case 69: 
      case 75: 
      case 101: 
      case 107: 
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        i += 9;
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        i += 15;
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 15;
        break;
      case 44: 
      case 45: 
      case 76: 
      case 77: 
      case 108: 
      case 109: 
        return true;
      }
    }
    return false;
  }
  
  static byte[] a(Worksheet paramWorksheet, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, int paramInt3, boolean paramBoolean3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
  {
    int m = 0;
    int n = 0;
    int i1 = paramInt5;
    int i2 = paramInt6;
    if (i1 == -1)
    {
      m = 1;
      i1 = 4;
      n = zc.a(paramArrayOfByte, 0);
      i2 = i1 + zc.a(paramArrayOfByte, 0);
    }
    zcy localzcy = new zcy(paramArrayOfByte);
    while (i1 < i2)
    {
      int i4;
      int i5;
      int j;
      int k;
      int i;
      switch (paramArrayOfByte[i1])
      {
      case 1: 
      case 2: 
        i1 += 7;
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
        i1++;
        break;
      case 23: 
        int i3 = zc.e(paramArrayOfByte, i1 + 1) & 0xFFFF;
        i1 += i3 * 2 + 3;
        break;
      case 25: 
        switch (paramArrayOfByte[(i1 + 1)])
        {
        case 1: 
          i1 += 4;
          break;
        case 2: 
          i1 += 4;
          break;
        case 4: 
          i4 = zc.e(paramArrayOfByte, i1 + 2);
          i1 += (i4 & 0xFFFF) * 2 + 6;
          break;
        case 8: 
          i1 += 4;
          break;
        case 16: 
          i1 += 4;
          break;
        case 32: 
          i1 += 4;
          break;
        case 64: 
          i1 += 4;
          break;
        default: 
          i1 += 4;
        }
        break;
      case 28: 
      case 29: 
        i1 += 2;
        break;
      case 31: 
        i1 += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        i1 += 15;
        break;
      case 30: 
      case 33: 
      case 65: 
      case 97: 
        i1 += 3;
        break;
      case 34: 
      case 66: 
      case 98: 
        i1 += 4;
        break;
      case 35: 
      case 67: 
      case 99: 
        i1 += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        i4 = zcjb.b(paramArrayOfByte, i1 + 1);
        i5 = zcjb.a(paramArrayOfByte, i1 + 5);
        if (((paramBoolean2) && (i4 == paramInt1)) || ((!paramBoolean2) && (i5 == paramInt2)))
        {
          localzcy.a(i1 + 7, 6);
          i2 += 6;
          paramArrayOfByte = localzcy.a;
          if (m != 0)
          {
            n += 6;
            System.arraycopy(zc.a(n), 0, paramArrayOfByte, 0, 4);
          }
          System.arraycopy(paramArrayOfByte, i1 + 5, paramArrayOfByte, i1 + 9, 2);
          System.arraycopy(paramArrayOfByte, i1 + 5, paramArrayOfByte, i1 + 11, 2);
          System.arraycopy(paramArrayOfByte, i1 + 1, paramArrayOfByte, i1 + 5, 4);
          int tmp944_942 = i1;
          byte[] tmp944_940 = paramArrayOfByte;
          tmp944_940[tmp944_942] = ((byte)(tmp944_940[tmp944_942] + 1));
          if (paramBoolean2)
          {
            i4 += paramInt3;
            zcjb.a(paramArrayOfByte, i1 + 5, i4, 0, false, false);
          }
          else
          {
            i5 += paramInt3;
            zcjb.b(paramArrayOfByte, i1 + 11, i5, 0, false, false);
          }
          i1 += 13;
        }
        else
        {
          i1 += 7;
        }
        break;
      case 42: 
      case 74: 
      case 106: 
        i1 += 7;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean1) {
          if (paramBoolean2)
          {
            j = zc.e(paramArrayOfByte, i1 + 5) & 0xFFFF;
            if (j == paramInt1) {
              if (paramBoolean3)
              {
                j += paramInt3;
                zcjb.a(paramArrayOfByte, i1 + 5, j, 0, false, false);
              }
              else
              {
                i4 = zcjb.a(paramArrayOfByte, i1 + 9);
                k = zcjb.a(paramArrayOfByte, i1 + 11);
                if ((paramInt2 <= i4) && (paramInt4 >= k))
                {
                  j += paramInt3;
                  zcjb.a(paramArrayOfByte, i1 + 5, j, 0, false, false);
                }
              }
            }
          }
          else
          {
            k = zcjb.a(paramArrayOfByte, i1 + 11);
            if (k == paramInt2)
            {
              k += paramInt3;
              zcjb.b(paramArrayOfByte, i1 + 11, k, 0, false, false);
            }
          }
        }
        i1 += 13;
        break;
      case 43: 
      case 75: 
      case 107: 
        i1 += 13;
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
        i1 += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i1 += 3;
        break;
      case 57: 
      case 89: 
      case 121: 
        i1 += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        i = zc.e(paramArrayOfByte, i1 + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(i, paramWorksheet))
        {
          i1 += 9;
        }
        else
        {
          i4 = zcjb.b(paramArrayOfByte, i1 + 3);
          i5 = zcjb.a(paramArrayOfByte, i1 + 7);
          if (((paramBoolean2) && (i4 == paramInt1)) || ((!paramBoolean2) && (i5 == paramInt2)))
          {
            localzcy.a(i1 + 9, 6);
            i2 += 6;
            paramArrayOfByte = localzcy.a;
            if (m != 0)
            {
              n += 6;
              System.arraycopy(zc.a(n), 0, paramArrayOfByte, 0, 4);
            }
            System.arraycopy(paramArrayOfByte, i1 + 5 + 2, paramArrayOfByte, i1 + 9 + 2, 2);
            System.arraycopy(paramArrayOfByte, i1 + 5 + 2, paramArrayOfByte, i1 + 11 + 2, 2);
            System.arraycopy(paramArrayOfByte, i1 + 1 + 2, paramArrayOfByte, i1 + 5 + 2, 4);
            int tmp1398_1396 = i1;
            byte[] tmp1398_1394 = paramArrayOfByte;
            tmp1398_1394[tmp1398_1396] = ((byte)(tmp1398_1394[tmp1398_1396] + 1));
            if (paramBoolean2)
            {
              i4 += paramInt3;
              zcjb.a(paramArrayOfByte, i1 + 7, i4, 0, false, false);
            }
            else
            {
              i5 += paramInt3;
              zcjb.b(paramArrayOfByte, i1 + 13, i5, 0, false, false);
            }
            i1 += 15;
          }
          else
          {
            i1 += 9;
          }
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i1 += 9;
        break;
      case 59: 
      case 91: 
      case 123: 
        i = zc.e(paramArrayOfByte, i1 + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(i, paramWorksheet))
        {
          i1 += 15;
        }
        else
        {
          if (paramBoolean2)
          {
            j = zc.e(paramArrayOfByte, i1 + 7) & 0xFFFF;
            if (j == paramInt1) {
              if (paramBoolean3)
              {
                j += paramInt3;
                zcjb.a(paramArrayOfByte, i1 + 7, j, 0, false, false);
              }
              else
              {
                i4 = zcjb.a(paramArrayOfByte, i1 + 11);
                k = zcjb.a(paramArrayOfByte, i1 + 13);
                if ((paramInt2 <= i4) && (paramInt4 >= k))
                {
                  j += paramInt3;
                  zcjb.a(paramArrayOfByte, i1 + 7, j, 0, false, false);
                }
              }
            }
          }
          else
          {
            k = zcjb.a(paramArrayOfByte, i1 + 13);
            if (k == paramInt2)
            {
              k += paramInt3;
              zcjb.b(paramArrayOfByte, i1 + 13, k, 0, false, false);
            }
          }
          i1 += 15;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i1 += 15;
        break;
      case 44: 
      case 76: 
      case 108: 
        i1 += 7;
        break;
      case 45: 
      case 77: 
      case 109: 
        i1 += 13;
        break;
      case 24: 
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
        return localzcy.a();
      }
    }
    return localzcy.a();
  }
  
  static boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if (paramArrayOfInt[0] >= paramInt1)
    {
      paramArrayOfInt[0] += paramInt2;
      if (paramArrayOfInt[0] < paramInt1) {
        return true;
      }
      if (paramArrayOfInt[0] > paramInt3) {
        paramArrayOfInt[0] = paramInt3;
      }
    }
    return false;
  }
  
  static boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    if (paramArrayOfInt1[0] >= paramInt1)
    {
      paramArrayOfInt1[0] += paramInt2;
      if (paramArrayOfInt1[0] < paramInt1) {
        paramArrayOfInt1[0] = paramInt1;
      } else if (paramArrayOfInt1[0] > paramInt3) {
        paramArrayOfInt1[0] = paramInt3;
      }
    }
    if (paramArrayOfInt2[0] >= paramInt1)
    {
      paramArrayOfInt2[0] += paramInt2;
      if (paramArrayOfInt2[0] < paramInt1) {
        paramArrayOfInt2[0] = (paramInt1 - 1);
      } else if (paramArrayOfInt2[0] > paramInt3) {
        paramArrayOfInt2[0] = paramInt3;
      }
    }
    return paramArrayOfInt2[0] < paramArrayOfInt1[0];
  }
  
  static boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, byte paramByte1, int[] paramArrayOfInt2, byte paramByte2, int paramInt3)
  {
    if ((zaaq.a(paramByte1)) && (paramArrayOfInt1[0] >= paramInt1))
    {
      paramArrayOfInt1[0] += paramInt2;
      if (paramArrayOfInt1[0] < paramInt1) {
        paramArrayOfInt1[0] = paramInt1;
      } else if (paramArrayOfInt1[0] > paramInt3) {
        paramArrayOfInt1[0] = paramInt3;
      }
    }
    if ((zaaq.a(paramByte2)) && (paramArrayOfInt2[0] >= paramInt1))
    {
      paramArrayOfInt2[0] += paramInt2;
      if (paramArrayOfInt2[0] < paramInt1) {
        paramArrayOfInt2[0] = (paramInt1 - 1);
      } else if (paramArrayOfInt2[0] > paramInt3) {
        paramArrayOfInt2[0] = paramInt3;
      }
    }
    return paramArrayOfInt2[0] < paramArrayOfInt1[0];
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zciz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */