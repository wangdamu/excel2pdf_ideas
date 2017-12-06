package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zcae
{
  static byte[] a(Object paramObject)
  {
    byte[] arrayOfByte = null;
    switch (zaoj.a(paramObject.getClass()))
    {
    case 7: 
      arrayOfByte = new byte[11];
      arrayOfByte[0] = 9;
      arrayOfByte[2] = 31;
      System.arraycopy(zc.a(((Short)paramObject).shortValue()), 0, arrayOfByte, 3, 8);
      break;
    case 9: 
      arrayOfByte = new byte[11];
      arrayOfByte[0] = 9;
      arrayOfByte[2] = 31;
      System.arraycopy(zc.a(((Integer)paramObject).intValue()), 0, arrayOfByte, 3, 8);
      break;
    case 14: 
      arrayOfByte = new byte[11];
      arrayOfByte[0] = 9;
      arrayOfByte[2] = 31;
      System.arraycopy(zc.a(((Double)paramObject).doubleValue()), 0, arrayOfByte, 3, 8);
      break;
    case 16: 
      arrayOfByte = new byte[11];
      arrayOfByte[0] = 9;
      arrayOfByte[2] = 31;
      System.arraycopy(zc.a(CellsHelper.getDoubleFromDateTime((DateTime)paramObject, false)), 0, arrayOfByte, 3, 8);
      break;
    case 18: 
      String str = (String)paramObject;
      arrayOfByte = new byte[5 + str.length() * 2];
      System.arraycopy(zc.a(arrayOfByte.length - 2), 0, arrayOfByte, 0, 2);
      arrayOfByte[2] = 23;
      arrayOfByte[3] = ((byte)str.length());
      arrayOfByte[4] = 1;
      System.arraycopy(Encoding.getUnicode().a(str), 0, arrayOfByte, 5, str.length() * 2);
    }
    return arrayOfByte;
  }
  
  static Object a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int j = paramInt;
    if (j == -1)
    {
      i = zc.e(paramArrayOfByte, 0) & 0xFFFF;
      j = 2;
    }
    if (i == 0) {
      return null;
    }
    switch (paramArrayOfByte[j])
    {
    case 23: 
      int k = paramArrayOfByte[(j + 1)] & 0xFF;
      boolean bool = paramArrayOfByte[(j + 2)] == 0;
      if (bool)
      {
        if (k + 3 == i) {
          return zct.a(paramArrayOfByte, j + 3, bool, k);
        }
      }
      else if (k * 2 + 3 == i) {
        return zct.a(paramArrayOfByte, j + 3, bool, k);
      }
      break;
    case 30: 
      if (i == 3) {
        return Integer.valueOf(zc.e(paramArrayOfByte, j + 1) & 0xFFFF);
      }
      break;
    case 31: 
      if (i == 9) {
        return Double.valueOf(zc.f(paramArrayOfByte, j + 1));
      }
      break;
    }
    return null;
  }
  
  static boolean a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    int i = paramArrayOfByte.length;
    int j = paramInt;
    if (j == -1)
    {
      i = zc.e(paramArrayOfByte, 0) & 0xFFFF;
      j = 2;
    }
    switch (paramArrayOfByte[j])
    {
    case 23: 
      if (paramBoolean) {
        return false;
      }
      int k = paramArrayOfByte[(j + 1)] & 0xFF;
      int m = paramArrayOfByte[(j + 2)] == 0 ? 1 : 0;
      if (m != 0) {
        return k + 3 == i;
      }
      return k * 2 + 3 == i;
    case 30: 
      return i == 3;
    case 31: 
      return i == 9;
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
      k = 2;
      m = k + (zc.e(paramArrayOfByte, 0) & 0xFFFF);
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
        k += 5;
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
        int i5 = paramArrayOfByte[(k + 1)];
        if (paramArrayOfByte[(k + 2)] == 0) {
          k += ((i5 & 0xFF) + 3 & 0xFFFF);
        } else {
          k += ((i5 & 0xFF) * 2 + 3 & 0xFFFF);
        }
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
        k += 8;
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
        k += 5;
        break;
      case 37: 
      case 69: 
      case 101: 
        k += 9;
        break;
      case 42: 
      case 74: 
      case 106: 
        k += 5;
        break;
      case 43: 
      case 75: 
      case 107: 
        k += 9;
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
            k += 7;
            continue;
          }
          n = zc.e(paramArrayOfByte, k + 3) & 0xFFFF;
          i1 = paramArrayOfByte[(k + 5)] & 0xFF;
        }
        localCells = paramWorksheetCollection2.get(i4).getCells();
        localCell = localCells.checkCell(n, i1);
        if (localCell != null)
        {
          zwr localzwr1 = paramzbti.b(i4);
          localzwr1.a(n, i1, localCell.getValue());
        }
        if (paramBoolean) {
          k += 9;
        } else {
          k += 7;
        }
        break;
      case 59: 
      case 91: 
      case 123: 
        if (paramBoolean)
        {
          i7 = zc.e(paramArrayOfByte, k + 1) & 0xFFFF;
          i8 = zc.e(paramArrayOfByte, k + 3) & 0xFFFF;
          n = zc.e(paramArrayOfByte, k + 5) & 0xFFFF;
          i2 = zc.e(paramArrayOfByte, k + 7) & 0xFFFF;
          i1 = paramArrayOfByte[(k + 9)] & 0xFF;
          i3 = paramArrayOfByte[(k + 11)] & 0xFF;
          i4 = i7;
        }
        else
        {
          i = zc.e(paramArrayOfByte, k + 1) & 0xFFFF;
          i4 = paramWorksheetCollection1.r().d(i, paramInt3);
          if ((i4 < 0) || (i4 >= paramWorksheetCollection2.getCount()))
          {
            k += 11;
            continue;
          }
          n = zc.e(paramArrayOfByte, k + 3) & 0xFFFF;
          i2 = zc.e(paramArrayOfByte, k + 5) & 0xFFFF;
          i1 = paramArrayOfByte[(k + 7)] & 0xFF;
          i3 = paramArrayOfByte[(k + 9)] & 0xFF;
        }
        localCells = paramWorksheetCollection2.get(i4).getCells();
        for (int i7 = n; i7 <= i2; i7++)
        {
          Row localRow = localCells.checkRow(i7);
          if (localRow != null) {
            for (int i9 = i1; i9 <= i3; i9++)
            {
              localCell = localRow.getCellOrNull(i9);
              if (localCell != null)
              {
                zwr localzwr2 = paramzbti.b(i4);
                localzwr2.a(i7, i9, localCell.getValue());
              }
            }
          }
        }
        if (paramBoolean) {
          k += 13;
        } else {
          k += 11;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        if (paramBoolean) {
          k += 9;
        } else {
          k += 7;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        if (paramBoolean) {
          k += 13;
        } else {
          k += 11;
        }
        break;
      case 44: 
      case 76: 
      case 108: 
        k += 5;
        break;
      case 45: 
      case 77: 
      case 109: 
        k += 9;
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
      j = 2;
      k = j + (zc.e(paramArrayOfByte, 0) & 0xFFFF);
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
        j += 5;
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
        int m = paramArrayOfByte[(j + 1)];
        if (paramArrayOfByte[(j + 2)] == 0) {
          j += ((m & 0xFF) + 3 & 0xFFFF);
        } else {
          j += ((m & 0xFF) * 2 + 3 & 0xFFFF);
        }
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
        j += 8;
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
        j += 5;
        break;
      case 37: 
      case 69: 
      case 101: 
        j += 9;
        break;
      case 42: 
      case 74: 
      case 106: 
        j += 5;
        break;
      case 43: 
      case 75: 
      case 107: 
        j += 9;
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
        j += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        j += 11;
        break;
      case 60: 
      case 92: 
      case 124: 
        j += 7;
        break;
      case 61: 
      case 93: 
      case 125: 
        j += 11;
        break;
      case 44: 
      case 76: 
      case 108: 
        j += 5;
        break;
      case 45: 
      case 77: 
      case 109: 
        j += 9;
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
    byte[] arrayOfByte1 = new byte[paramArrayOfByte.length - j * 3];
    int m = 0;
    if (k == -1)
    {
      k = 2;
      n = zc.e(paramArrayOfByte, 0) & 0xFFFF;
      i = k + n;
      m = 2;
      int i1 = (short)(n - j * 3);
      System.arraycopy(zc.a(i1), 0, arrayOfByte1, 0, 2);
      if (i <= paramArrayOfByte.length) {
        System.arraycopy(paramArrayOfByte, i, arrayOfByte1, i1 + 2, paramArrayOfByte.length - i);
      }
    }
    int n = paramWorksheet.c().r().b(paramWorksheet.c().v(), paramWorksheet.getIndex());
    byte[] arrayOfByte2 = new byte[3];
    arrayOfByte2[0] = 91;
    System.arraycopy(zc.a(n), 0, arrayOfByte2, 1, 2);
    if (paramInt1 == -1) {
      m = 2;
    }
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
            System.arraycopy(zc.a(i5), 0, arrayOfByte1, m + 3, 2);
            System.arraycopy(zc.a(i6), 0, arrayOfByte1, m + 5, 2);
            arrayOfByte1[(m + 7)] = ((byte)i4);
            arrayOfByte1[(m + 9)] = ((byte)i4);
          }
          m += 11;
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
        i2 = paramArrayOfByte[(k + 1)];
        if (paramArrayOfByte[(k + 2)] == 0)
        {
          System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, (i2 & 0xFF) + 3);
          m += (i2 & 0xFF) + 3;
          k += ((i2 & 0xFF) + 3 & 0xFFFF);
        }
        else
        {
          System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, (i2 & 0xFF) * 2 + 3);
          m += (i2 & 0xFF) * 2 + 3;
          k += ((i2 & 0xFF) * 2 + 3 & 0xFFFF);
        }
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
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 8);
        m += 8;
        k += 8;
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
      case 1: 
      case 35: 
      case 36: 
      case 42: 
      case 44: 
      case 67: 
      case 68: 
      case 74: 
      case 76: 
      case 99: 
      case 100: 
      case 106: 
      case 108: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 5);
        m += 5;
        k += 5;
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
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 9);
        m += 9;
        k += 9;
        break;
      case 38: 
      case 39: 
      case 40: 
      case 57: 
      case 58: 
      case 60: 
      case 70: 
      case 71: 
      case 72: 
      case 89: 
      case 90: 
      case 92: 
      case 102: 
      case 103: 
      case 104: 
      case 121: 
      case 122: 
      case 124: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 7);
        m += 7;
        k += 7;
        break;
      case 59: 
      case 61: 
      case 91: 
      case 93: 
      case 123: 
      case 125: 
        System.arraycopy(paramArrayOfByte, k, arrayOfByte1, m, 11);
        m += 11;
        k += 11;
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
      i = 2;
      j = i + (zc.e(paramArrayOfByte, 0) & 0xFFFF);
    }
    int n = 0;
    while (i < j)
    {
      int k;
      int m;
      switch (paramArrayOfByte[i])
      {
      case 1: 
        if (paramInt2 != 0)
        {
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          k += paramInt2;
          if (k < 0) {
            k = 0;
          } else if (k > 65535) {
            k = 65535;
          }
          System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
        }
        if (paramInt5 != 0)
        {
          m = paramArrayOfByte[(i + 3)] & 0xFF;
          m += paramInt5;
          if (m < 0) {
            m = 0;
          } else if (m > 255) {
            m = 255;
          }
          paramArrayOfByte[(i + 3)] = ((byte)m);
        }
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
        i++;
        break;
      case 23: 
        int i1 = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((i1 & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((i1 & 0xFF) * 2 + 3 & 0xFFFF);
        }
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
          int i2 = zc.e(paramArrayOfByte, i + 2);
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
        i += 8;
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
        n = paramArrayOfByte[(i + 4)];
        if ((paramInt2 != 0) && ((n & 0xFF & 0x80) != 0))
        {
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          k += paramInt2;
          if (k > 65535)
          {
            k = 65535;
          }
          else
          {
            if (k < 0)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
              i += 5;
              continue;
            }
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
          }
        }
        if ((paramInt5 != 0) && ((n & 0xFF & 0x40) != 0))
        {
          m = (paramArrayOfByte[(i + 3)] & 0xFF) + paramInt5;
          if (m < 0)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
            i += 5;
          }
          else
          {
            if (m > 255) {
              m = 255;
            }
            paramArrayOfByte[(i + 3)] = ((byte)m);
          }
        }
        else
        {
          i += 5;
        }
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramInt2 != 0)
        {
          n = paramArrayOfByte[(i + 6)];
          if ((n & 0xFF & 0x80) != 0)
          {
            k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
            k += paramInt2;
            if (k > 65535) {
              k = 65535;
            } else if (k < 0) {
              k = 0;
            }
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
          }
          n = paramArrayOfByte[(i + 8)];
          if ((n & 0xFF & 0x80) != 0)
          {
            k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
            k += paramInt2;
            if (k > 65535) {
              k = 65535;
            }
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
          }
        }
        if (paramInt5 != 0)
        {
          n = paramArrayOfByte[(i + 6)];
          if ((n & 0xFF & 0x40) != 0)
          {
            m = (paramArrayOfByte[(i + 5)] & 0xFF) + paramInt5;
            if (m < 0)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
              i += 9;
              continue;
            }
            if (m > 255) {
              m = 255;
            }
            paramArrayOfByte[(i + 5)] = ((byte)m);
          }
          n = paramArrayOfByte[(i + 8)];
          if ((n & 0xFF & 0x40) != 0)
          {
            m = (paramArrayOfByte[(i + 7)] & 0xFF) + paramInt5;
            if (m < 0) {
              m = 0;
            } else if (m > 255) {
              m = 255;
            }
            paramArrayOfByte[(i + 7)] = ((byte)m);
          }
        }
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
        i += 7;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 5;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 43: 
      case 75: 
      case 107: 
        i += 9;
        break;
      case 44: 
      case 76: 
      case 108: 
        i += 5;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 9;
        break;
      case 57: 
      case 89: 
      case 121: 
        i += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        if ((paramInt2 != 0) && (zaaq.a(paramArrayOfByte[(i + 6)])))
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          k += paramInt2;
          if (k > 65535) {
            k = 65535;
          } else if (k < 0) {
            k = 0;
          }
          System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
        }
        if ((paramInt5 != 0) && (zaaq.b(paramArrayOfByte[(i + 6)])))
        {
          m = paramArrayOfByte[(i + 5)] & 0xFF;
          m += paramInt5;
          if (m < 0)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
            i += 7;
          }
          else
          {
            if (m > 255) {
              m = 255;
            }
            paramArrayOfByte[(i + 5)] = ((byte)m);
          }
        }
        else
        {
          i += 7;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        if (paramInt2 != 0)
        {
          if (zaaq.a(paramArrayOfByte[(i + 8)]))
          {
            k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
            k += paramInt2;
            if (k > 65535) {
              k = 65535;
            } else if (k < 0) {
              k = 0;
            } else if (((k < paramInt3 ? 1 : 0) & (paramInt2 < 0 ? 1 : 0)) != 0) {
              k = paramInt3;
            }
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
          }
          if (zaaq.a(paramArrayOfByte[(i + 10)]))
          {
            k = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
            if (k != 65535)
            {
              k += paramInt2;
              if (k > 65535) {
                k = 65535;
              }
              if (((k < paramInt3 ? 1 : 0) & (paramInt2 < 0 ? 1 : 0)) != 0) {
                k = paramInt3;
              }
              System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 5, 2);
            }
          }
        }
        if (paramInt5 != 0)
        {
          if (zaaq.b(paramArrayOfByte[(i + 8)]))
          {
            m = paramArrayOfByte[(i + 7)] & 0xFF;
            m += paramInt5;
            if (m < 0)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
              i += 11;
              continue;
            }
            if (m > 255) {
              m = 255;
            }
            paramArrayOfByte[(i + 7)] = ((byte)m);
          }
          if (zaaq.b(paramArrayOfByte[(i + 10)]))
          {
            m = paramArrayOfByte[(i + 9)] & 0xFF;
            m += paramInt5;
            if (m > 255) {
              m = 255;
            }
            if (m < paramInt6) {
              m = paramInt6;
            }
            paramArrayOfByte[(i + 9)] = ((byte)m);
          }
        }
        i += 11;
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 11;
        break;
      }
    }
  }
  
  static void a(Worksheet paramWorksheet, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
  {
    int i = paramInt5;
    int j = paramInt6;
    if (i == -1)
    {
      i = 2;
      j = i + (zc.e(paramArrayOfByte, 0) & 0xFFFF);
    }
    while (i < j)
    {
      int k;
      int[] arrayOfInt1;
      int n;
      boolean bool5;
      int m;
      boolean bool1;
      boolean bool4;
      int[] arrayOfInt4;
      switch (paramArrayOfByte[i])
      {
      case 1: 
        if (paramBoolean)
        {
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          if (k >= paramInt1)
          {
            k += paramInt2;
            if (k > 65535) {
              k = 65535;
            }
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
          }
        }
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
        i++;
        break;
      case 23: 
        int i1 = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((i1 & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((i1 & 0xFF) * 2 + 3 & 0xFFFF);
        }
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
          int i2 = zc.e(paramArrayOfByte, i + 4);
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
        i += 8;
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
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          arrayOfInt1 = new int[] { k };
          boolean bool2 = a(paramInt1, paramInt2, arrayOfInt1, 65535);
          k = arrayOfInt1[0];
          if (bool2) {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          } else {
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
          }
        }
        i += 5;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 5;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          n = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          if ((k == 0) && (n == 65535))
          {
            i += 9;
            continue;
          }
          arrayOfInt1 = new int[] { k };
          int[] arrayOfInt2 = { n };
          bool5 = a(paramInt1, paramInt2, arrayOfInt1, arrayOfInt2, 65535);
          k = arrayOfInt1[0];
          n = arrayOfInt2[0];
          if (bool5)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          }
          else
          {
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
            System.arraycopy(zc.a(n), 0, paramArrayOfByte, i + 3, 2);
          }
        }
        i += 9;
        break;
      case 43: 
      case 75: 
      case 107: 
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
          i += 7;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          arrayOfInt1 = new int[] { k };
          boolean bool3 = a(paramInt1, paramInt2, arrayOfInt1, 65535);
          k = arrayOfInt1[0];
          if (bool3) {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          } else {
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
          }
          i += 7;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        m = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(m, paramWorksheet))
        {
          i += 11;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          n = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
          if ((k == 0) && (n == 65535))
          {
            i += 11;
          }
          else
          {
            arrayOfInt1 = new int[] { k };
            int[] arrayOfInt3 = { n };
            bool5 = a(paramInt1, paramInt2, arrayOfInt1, arrayOfInt3, 65535);
            k = arrayOfInt1[0];
            n = arrayOfInt3[0];
            if (bool5)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
            }
            else
            {
              System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
              System.arraycopy(zc.a(n), 0, paramArrayOfByte, i + 5, 2);
            }
            i += 11;
          }
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 11;
        break;
      case 44: 
      case 76: 
      case 108: 
        if (paramBoolean)
        {
          bool1 = zaaq.a(paramArrayOfByte[(i + 4)]);
          if (bool1) {
            k = zc.b(paramArrayOfByte, i + 1) + paramInt3;
          } else {
            k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          }
          bool4 = k == paramInt3;
          arrayOfInt4 = new int[] { k };
          boolean bool6 = a(paramInt1, paramInt2, arrayOfInt4, 65535);
          k = arrayOfInt4[0];
          if (bool6)
          {
            if (!bool4) {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) - 2));
            }
          }
          else if (bool1) {
            System.arraycopy(zc.a((short)(k - paramInt4)), 0, paramArrayOfByte, i + 1, 2);
          } else {
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
          }
        }
        i += 5;
        break;
      case 45: 
      case 77: 
      case 109: 
        if (paramBoolean)
        {
          bool1 = zaaq.a(paramArrayOfByte[(i + 6)]);
          bool4 = zaaq.a(paramArrayOfByte[(i + 8)]);
          if (bool1) {
            k = zc.b(paramArrayOfByte, i + 1) + paramInt3;
          } else {
            k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          }
          if (bool4) {
            n = zc.b(paramArrayOfByte, i + 3) + paramInt3;
          } else {
            n = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          }
          arrayOfInt4 = new int[] { k };
          int[] arrayOfInt5 = { n };
          boolean bool7 = a(paramInt1, paramInt2, arrayOfInt4, arrayOfInt5, 65535);
          k = arrayOfInt4[0];
          n = arrayOfInt5[0];
          if (bool7)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) - 2));
          }
          else
          {
            if (bool1) {
              System.arraycopy(zc.a((short)(k - paramInt4)), 0, paramArrayOfByte, i + 1, 2);
            } else {
              System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
            }
            if (bool4) {
              System.arraycopy(zc.a((short)(n - paramInt4)), 0, paramArrayOfByte, i + 3, 2);
            } else {
              System.arraycopy(zc.a(n), 0, paramArrayOfByte, i + 3, 2);
            }
          }
        }
        i += 9;
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
      j = 2;
      k = j + (zc.e(paramArrayOfByte[0], 0) & 0xFFFF);
    }
    while (j < k)
    {
      int m;
      int n;
      int[] arrayOfInt6;
      boolean bool6;
      int i;
      int i3;
      int[] arrayOfInt4;
      boolean bool1;
      switch (paramArrayOfByte[0][j])
      {
      case 1: 
        if (paramBoolean)
        {
          if (paramInt2 != 0)
          {
            m = zc.e(paramArrayOfByte[0], j + 1) & 0xFFFF;
            if (m >= paramInt1)
            {
              m += paramInt2;
              if (m > 65535) {
                m = 65535;
              }
              System.arraycopy(zc.a(m), 0, paramArrayOfByte[0], j + 1, 2);
            }
          }
          if (paramInt6 != 0)
          {
            m = paramArrayOfByte[0][(j + 3)] & 0xFF;
            if (m >= paramInt5)
            {
              m += paramInt6;
              if (m > 255) {
                m = 255;
              }
              paramArrayOfByte[0][(j + 3)] = ((byte)m);
            }
          }
        }
        j += 5;
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
        m = paramArrayOfByte[0][(j + 1)];
        if (paramArrayOfByte[0][(j + 2)] == 0) {
          j += ((m & 0xFF) + 3 & 0xFFFF);
        } else {
          j += ((m & 0xFF) * 2 + 3 & 0xFFFF);
        }
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
        j += 8;
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
          if ((paramInt2 != 0) && (zaaq.a(paramArrayOfByte[0][(j + 4)])))
          {
            n = zc.e(paramArrayOfByte[0], j + 1) & 0xFFFF;
            arrayOfInt1 = new int[] { n };
            bool3 = a(paramInt1, paramInt2, arrayOfInt1, 65535);
            n = arrayOfInt1[0];
            if (bool3) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 6));
            } else {
              System.arraycopy(zc.a(n), 0, paramArrayOfByte[0], j + 1, 2);
            }
          }
          if ((paramInt6 != 0) && (zaaq.b(paramArrayOfByte[0][(j + 4)])))
          {
            n = paramArrayOfByte[0][(j + 3)] & 0xFF;
            arrayOfInt1 = new int[] { n };
            bool3 = a(paramInt5, paramInt6, arrayOfInt1, 255);
            n = arrayOfInt1[0];
            if (bool3) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 6));
            } else {
              paramArrayOfByte[0][(j + 3)] = ((byte)n);
            }
          }
        }
        j += 5;
        break;
      case 42: 
      case 74: 
      case 106: 
        j += 5;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          int i2;
          int[] arrayOfInt3;
          if (paramInt2 != 0)
          {
            n = zc.e(paramArrayOfByte[0], j + 1) & 0xFFFF;
            i2 = zc.e(paramArrayOfByte[0], j + 3) & 0xFFFF;
            arrayOfInt3 = new int[] { n };
            arrayOfInt6 = new int[] { i2 };
            bool6 = a(paramInt1, paramInt2, arrayOfInt3, paramArrayOfByte[0][(j + 6)], arrayOfInt6, paramArrayOfByte[0][(j + 8)], 255);
            n = arrayOfInt3[0];
            i2 = arrayOfInt6[0];
            if (bool6)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 6));
            }
            else
            {
              System.arraycopy(zc.a(n), 0, paramArrayOfByte[0], j + 1, 2);
              System.arraycopy(zc.a(i2), 0, paramArrayOfByte[0], j + 3, 2);
            }
          }
          if (paramInt2 != 0)
          {
            n = paramArrayOfByte[0][(j + 5)] & 0xFF;
            i2 = paramArrayOfByte[0][(j + 7)] & 0xFF;
            arrayOfInt3 = new int[] { n };
            arrayOfInt6 = new int[] { i2 };
            bool6 = a(paramInt5, paramInt6, arrayOfInt3, paramArrayOfByte[0][(j + 6)], arrayOfInt6, paramArrayOfByte[0][(j + 8)], 255);
            n = arrayOfInt3[0];
            i2 = arrayOfInt6[0];
            if (bool6)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 6));
            }
            else
            {
              paramArrayOfByte[0][(j + 5)] = ((byte)n);
              paramArrayOfByte[0][(j + 7)] = ((byte)i2);
            }
          }
        }
        j += 9;
        break;
      case 43: 
      case 75: 
      case 107: 
        j += 9;
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
        if (!paramWorksheet.c().r().a(i, paramWorksheet))
        {
          j += 7;
        }
        else
        {
          int[] arrayOfInt2;
          boolean bool4;
          if ((paramInt2 != 0) && (zaaq.a(paramArrayOfByte[0][(j + 6)])))
          {
            n = zc.e(paramArrayOfByte[0], j + 3) & 0xFFFF;
            arrayOfInt2 = new int[] { n };
            bool4 = a(paramInt1, paramInt2, arrayOfInt2, 65535);
            n = arrayOfInt2[0];
            if (bool4) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 2));
            } else {
              System.arraycopy(zc.a(n), 0, paramArrayOfByte[0], j + 3, 2);
            }
          }
          if ((paramInt6 != 0) && (zaaq.b(paramArrayOfByte[0][(j + 6)])))
          {
            n = paramArrayOfByte[0][(j + 5)] & 0xFF;
            arrayOfInt2 = new int[] { n };
            bool4 = a(paramInt5, paramInt6, arrayOfInt2, 255);
            n = arrayOfInt2[0];
            if (bool4) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 2));
            } else {
              paramArrayOfByte[0][(j + 5)] = ((byte)n);
            }
          }
          j += 7;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        j += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        i = zc.e(paramArrayOfByte[0], j + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(i, paramWorksheet))
        {
          j += 11;
        }
        else
        {
          if (paramInt2 != 0)
          {
            n = zc.e(paramArrayOfByte[0], j + 3) & 0xFFFF;
            i3 = zc.e(paramArrayOfByte[0], j + 5) & 0xFFFF;
            arrayOfInt4 = new int[] { n };
            arrayOfInt6 = new int[] { i3 };
            bool6 = a(paramInt1, paramInt2, arrayOfInt4, paramArrayOfByte[0][(j + 8)], arrayOfInt6, paramArrayOfByte[0][(j + 10)], 65535);
            n = arrayOfInt4[0];
            i3 = arrayOfInt6[0];
            if (bool6)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 2));
            }
            else
            {
              System.arraycopy(zc.a(n), 0, paramArrayOfByte[0], j + 3, 2);
              System.arraycopy(zc.a(i3), 0, paramArrayOfByte[0], j + 5, 2);
            }
          }
          if (paramInt6 != 0)
          {
            n = paramArrayOfByte[0][(j + 7)] & 0xFF;
            i3 = paramArrayOfByte[0][(j + 9)] & 0xFF;
            arrayOfInt4 = new int[] { n };
            arrayOfInt6 = new int[] { i3 };
            bool6 = a(paramInt5, paramInt6, arrayOfInt4, paramArrayOfByte[0][(j + 8)], arrayOfInt6, paramArrayOfByte[0][(j + 10)], 255);
            n = arrayOfInt4[0];
            i3 = arrayOfInt6[0];
            if (bool6)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) + 2));
            }
            else
            {
              paramArrayOfByte[0][(j + 7)] = ((byte)n);
              paramArrayOfByte[0][(j + 9)] = ((byte)i3);
            }
          }
          j += 11;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        j += 11;
        break;
      case 44: 
      case 76: 
      case 108: 
        if (paramBoolean)
        {
          boolean bool5;
          if (paramInt2 != 0)
          {
            bool1 = zaaq.a(paramArrayOfByte[0][(j + 4)]);
            i3 = 0;
            if (bool1) {
              i3 = zc.b(paramArrayOfByte[0], j + 1) + paramInt3;
            } else {
              i3 = zc.e(paramArrayOfByte[0], j + 1) & 0xFFFF;
            }
            arrayOfInt4 = new int[] { i3 };
            bool5 = a(paramInt1, paramInt2, arrayOfInt4, 65535);
            i3 = arrayOfInt4[0];
            if (bool5) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) - 2));
            } else if (bool1) {
              System.arraycopy(zc.a((short)(i3 - paramInt4)), 0, paramArrayOfByte[0], j + 1, 2);
            } else {
              System.arraycopy(zc.a(i3), 0, paramArrayOfByte[0], j + 1, 2);
            }
          }
          if (paramInt6 != 0)
          {
            bool1 = zaaq.b(paramArrayOfByte[0][(j + 4)]);
            i3 = zcad.b(paramArrayOfByte[0], j + 3, paramInt7, paramArrayOfByte[0][(j + 4)]);
            arrayOfInt4 = new int[] { i3 };
            bool5 = a(paramInt5, paramInt6, arrayOfInt4, 255);
            i3 = arrayOfInt4[0];
            if (bool5) {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) - 2));
            } else {
              zcad.a(paramArrayOfByte[0], j + 3, i3, paramInt8, paramArrayOfByte[0][(j + 4)]);
            }
          }
        }
        j += 5;
        break;
      case 45: 
      case 77: 
      case 109: 
        if (paramBoolean)
        {
          if (paramInt2 != 0)
          {
            bool1 = zaaq.a(paramArrayOfByte[0][(j + 6)]);
            boolean bool2 = zaaq.a(paramArrayOfByte[0][(j + 8)]);
            int i5 = bool1 ? zc.b(paramArrayOfByte[0], j + 1) + paramInt3 : zc.e(paramArrayOfByte[0], j + 1) & 0xFFFF;
            int i6 = bool2 ? zc.b(paramArrayOfByte[0], j + 3) + paramInt3 : zc.e(paramArrayOfByte[0], j + 3) & 0xFFFF;
            int[] arrayOfInt8 = { i5 };
            int[] arrayOfInt9 = { i6 };
            boolean bool8 = a(paramInt1, paramInt2, arrayOfInt8, arrayOfInt9, 65535);
            i5 = arrayOfInt8[0];
            i6 = arrayOfInt9[0];
            if (bool8)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) - 2));
            }
            else
            {
              if (bool1) {
                System.arraycopy(zc.a((short)(i5 - paramInt4)), 0, paramArrayOfByte[0], j + 1, 2);
              } else {
                System.arraycopy(zc.a(i5), 0, paramArrayOfByte[0], j + 1, 2);
              }
              if (bool2) {
                System.arraycopy(zc.a((short)(i6 - paramInt4)), 0, paramArrayOfByte[0], j + 3, 2);
              } else {
                System.arraycopy(zc.a(i6), 0, paramArrayOfByte[0], j + 3, 2);
              }
            }
          }
          if (paramInt2 != 0)
          {
            int i1 = zcad.b(paramArrayOfByte[0], j + 5, paramInt7, paramArrayOfByte[0][(j + 6)]);
            int i4 = zcad.b(paramArrayOfByte[0], j + 7, paramInt7, paramArrayOfByte[0][(j + 8)]);
            int[] arrayOfInt5 = { i1 };
            int[] arrayOfInt7 = { i4 };
            boolean bool7 = a(paramInt5, paramInt6, arrayOfInt5, arrayOfInt7, 255);
            i1 = arrayOfInt5[0];
            i4 = arrayOfInt7[0];
            if (bool7)
            {
              paramArrayOfByte[0][j] = ((byte)((paramArrayOfByte[0][j] & 0xFF) - 2));
            }
            else
            {
              zcad.a(paramArrayOfByte[0], j + 5, i1, paramInt8, paramArrayOfByte[0][(j + 6)]);
              zcad.a(paramArrayOfByte[0], j + 7, i4, paramInt8, paramArrayOfByte[0][(j + 8)]);
            }
          }
        }
        j += 9;
        break;
      }
    }
  }
  
  static void b(Worksheet paramWorksheet, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
  {
    int k = paramInt5;
    int m = paramInt6;
    if (k == -1)
    {
      k = 2;
      m = k + (zc.e(paramArrayOfByte, 0) & 0xFFFF);
    }
    int n = 0;
    while (k < m)
    {
      int i;
      int[] arrayOfInt3;
      boolean bool6;
      int[] arrayOfInt2;
      int j;
      switch (paramArrayOfByte[k])
      {
      case 1: 
        if (paramBoolean)
        {
          i = paramArrayOfByte[(k + 3)] & 0xFF;
          if (i >= paramInt1)
          {
            i += paramInt2;
            if (i > 255) {
              i = 255;
            }
            paramArrayOfByte[(k + 3)] = ((byte)i);
          }
        }
        k += 5;
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
        int i1 = paramArrayOfByte[(k + 1)];
        if (paramArrayOfByte[(k + 2)] == 0) {
          k += ((i1 & 0xFF) + 3 & 0xFFFF);
        } else {
          k += ((i1 & 0xFF) * 2 + 3 & 0xFFFF);
        }
        break;
      case 24: 
        if (paramArrayOfByte[(k + 1)] == 25) {
          k += 14;
        } else if (paramArrayOfByte[(k + 1)] == 29) {
          k += 6;
        } else {
          k++;
        }
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
          int i2 = zc.e(paramArrayOfByte, k + 4);
          k += (i2 & 0xFFFF) + 4;
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
        k += 8;
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
        if (paramBoolean)
        {
          i = paramArrayOfByte[(k + 3)] & 0xFF;
          int[] arrayOfInt1 = { i };
          boolean bool3 = a(paramInt1, paramInt2, arrayOfInt1, 255);
          i = arrayOfInt1[0];
          if (bool3) {
            paramArrayOfByte[k] = ((byte)((paramArrayOfByte[k] & 0xFF) + 6));
          } else {
            paramArrayOfByte[(k + 3)] = ((byte)i);
          }
        }
        k += 5;
        break;
      case 42: 
      case 74: 
      case 106: 
        k += 5;
        break;
      case 44: 
      case 76: 
      case 108: 
        if (paramBoolean)
        {
          boolean bool1 = zaaq.b(paramArrayOfByte[(k + 4)]);
          i = paramArrayOfByte[(k + 3)] & 0xFF;
          if (bool1) {
            if (i < 127) {
              i += paramInt3;
            } else {
              i = i - 255 - 1 + paramInt3;
            }
          }
          arrayOfInt3 = new int[] { i };
          bool6 = a(paramInt1, paramInt2, arrayOfInt3, 255);
          i = arrayOfInt3[0];
          if (bool6) {
            paramArrayOfByte[k] = ((byte)((paramArrayOfByte[k] & 0xFF) - 2));
          } else if (bool1)
          {
            if (i > paramInt4) {
              paramArrayOfByte[(k + 3)] = ((byte)(i - paramInt4));
            } else {
              paramArrayOfByte[(k + 3)] = ((byte)(255 - paramInt4 + i + 1));
            }
          }
          else {
            paramArrayOfByte[(k + 3)] = ((byte)i);
          }
        }
        k += 5;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          i = paramArrayOfByte[(k + 5)] & 0xFF;
          n = paramArrayOfByte[(k + 7)] & 0xFF;
          if ((i == 0) && (n == 255))
          {
            k += 9;
            continue;
          }
          arrayOfInt2 = new int[] { i };
          arrayOfInt3 = new int[] { n };
          bool6 = a(paramInt1, paramInt2, arrayOfInt2, arrayOfInt3, 255);
          i = arrayOfInt2[0];
          n = arrayOfInt3[0];
          if (bool6)
          {
            paramArrayOfByte[k] = ((byte)((paramArrayOfByte[k] & 0xFF) + 6));
          }
          else
          {
            paramArrayOfByte[(k + 5)] = ((byte)i);
            paramArrayOfByte[(k + 7)] = ((byte)n);
          }
        }
        k += 9;
        break;
      case 43: 
      case 75: 
      case 107: 
        k += 9;
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
      case 57: 
      case 89: 
      case 121: 
        k += 7;
        break;
      case 58: 
      case 90: 
      case 122: 
        j = zc.e(paramArrayOfByte, k + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(j, paramWorksheet))
        {
          k += 7;
        }
        else
        {
          i = paramArrayOfByte[(k + 5)] & 0xFF;
          arrayOfInt2 = new int[] { i };
          boolean bool4 = a(paramInt1, paramInt2, arrayOfInt2, 255);
          i = arrayOfInt2[0];
          if (bool4) {
            paramArrayOfByte[k] = ((byte)((paramArrayOfByte[k] & 0xFF) + 2));
          } else {
            paramArrayOfByte[(k + 5)] = ((byte)i);
          }
          k += 7;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        k += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        j = zc.e(paramArrayOfByte, k + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(j, paramWorksheet))
        {
          k += 11;
        }
        else
        {
          i = paramArrayOfByte[(k + 7)] & 0xFF;
          n = paramArrayOfByte[(k + 9)] & 0xFF;
          if ((i == 0) && (n == 255))
          {
            k += 11;
          }
          else
          {
            arrayOfInt2 = new int[] { i };
            int[] arrayOfInt4 = { n };
            bool6 = a(paramInt1, paramInt2, arrayOfInt2, arrayOfInt4, 255);
            i = arrayOfInt2[0];
            n = arrayOfInt4[0];
            if (bool6)
            {
              paramArrayOfByte[k] = ((byte)((paramArrayOfByte[k] & 0xFF) + 2));
            }
            else
            {
              paramArrayOfByte[(k + 7)] = ((byte)i);
              paramArrayOfByte[(k + 9)] = ((byte)n);
            }
            k += 11;
          }
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        k += 11;
        break;
      case 45: 
      case 77: 
      case 109: 
        if (paramBoolean)
        {
          boolean bool2 = zaaq.b(paramArrayOfByte[(k + 6)]);
          boolean bool5 = zaaq.b(paramArrayOfByte[(k + 8)]);
          i = paramArrayOfByte[(k + 5)] & 0xFF;
          if (bool2)
          {
            i = paramArrayOfByte[(k + 5)] & 0xFF;
            if (i < 127) {
              i += paramInt3;
            } else {
              i = i - 255 - 1 + paramInt3;
            }
          }
          n = paramArrayOfByte[(k + 7)] & 0xFF;
          if (bool2) {
            if (n < 127) {
              n += paramInt3;
            } else {
              n = n - 255 - 1 + paramInt3;
            }
          }
          int[] arrayOfInt5 = { i };
          int[] arrayOfInt6 = { n };
          boolean bool7 = a(paramInt1, paramInt2, arrayOfInt5, arrayOfInt6, 255);
          i = arrayOfInt5[0];
          n = arrayOfInt6[0];
          if (bool7)
          {
            paramArrayOfByte[k] = ((byte)((paramArrayOfByte[k] & 0xFF) - 2));
          }
          else
          {
            if (bool2)
            {
              if (i > paramInt4) {
                paramArrayOfByte[(k + 5)] = ((byte)(i - paramInt4));
              } else {
                paramArrayOfByte[(k + 5)] = ((byte)(255 - paramInt4 + i + 1));
              }
            }
            else {
              paramArrayOfByte[(k + 5)] = ((byte)i);
            }
            if (bool5)
            {
              if (n > paramInt4) {
                paramArrayOfByte[(k + 7)] = ((byte)(n - paramInt4));
              } else {
                paramArrayOfByte[(k + 7)] = ((byte)(255 - paramInt4 + n + 1));
              }
            }
            else {
              paramArrayOfByte[(k + 7)] = ((byte)n);
            }
          }
        }
        k += 9;
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
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + 2;
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
        m = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        n = paramArrayOfByte[(i + 3)] & 0xFF;
        Cell localCell = paramCells.checkCell(m, n);
        if (localCell != null)
        {
          zbf localzbf = localCell.F();
          paramArrayOfByte = localzbf.c();
          return a(paramInt1, paramInt2, paramArrayOfByte, -1, -1, paramInt5, paramInt6, paramInt7, paramCells, paramBoolean, paramHashMap);
        }
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
        i++;
        break;
      case 23: 
        int i3 = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((i3 & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((i3 & 0xFF) * 2 + 3 & 0xFFFF);
        }
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
        i += 8;
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
          m = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          n = paramArrayOfByte[(i + 3)] & 0xFF;
          if ((m == paramInt5) && (n == paramInt6)) {
            return true;
          }
        }
        i += 5;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 5;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          m = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          i1 = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          n = paramArrayOfByte[(i + 5)] & 0xFF;
          i2 = paramArrayOfByte[(i + 7)] & 0xFF;
          if ((paramInt5 >= m) && (paramInt5 <= i1) && (paramInt6 >= n) && (paramInt6 <= i2)) {
            return true;
          }
        }
        i += 9;
        break;
      case 43: 
      case 75: 
      case 107: 
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
          m = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          n = paramArrayOfByte[(i + 5)] & 0xFF;
          if ((m == paramInt5) && (n == paramInt6)) {
            return true;
          }
        }
        i += 7;
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramInt7 == k)
        {
          m = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          i1 = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
          n = paramArrayOfByte[(i + 7)] & 0xFF;
          i2 = paramArrayOfByte[(i + 9)] & 0xFF;
          if ((paramInt5 >= m) && (paramInt5 <= i1) && (paramInt6 >= n) && (paramInt6 <= i2)) {
            return true;
          }
        }
        i += 11;
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 11;
        break;
      case 44: 
      case 76: 
      case 108: 
        if (paramBoolean)
        {
          m = zcad.a(paramArrayOfByte, i + 1, paramInt1, paramArrayOfByte[(i + 4)]);
          n = zcad.b(paramArrayOfByte, i + 3, paramInt2, paramArrayOfByte[(i + 4)]);
          if ((m == paramInt5) && (n == paramInt6)) {
            return true;
          }
        }
        i += 5;
        break;
      case 45: 
      case 77: 
      case 109: 
        if (paramBoolean)
        {
          m = zcad.a(paramArrayOfByte, i + 1, paramInt1, paramArrayOfByte[(i + 6)]);
          i1 = zcad.a(paramArrayOfByte, i + 3, paramInt1, paramArrayOfByte[(i + 8)]);
          n = zcad.b(paramArrayOfByte, i + 5, paramInt2, paramArrayOfByte[(i + 6)]);
          i2 = zcad.b(paramArrayOfByte, i + 7, paramInt2, paramArrayOfByte[(i + 8)]);
          if ((paramInt5 >= m) && (paramInt5 <= i1) && (paramInt6 >= n) && (paramInt6 <= i2)) {
            return true;
          }
        }
        i += 9;
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
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + 2;
    }
    int k = 0;
    while (i < j) {
      switch (paramArrayOfByte[i])
      {
      case 1: 
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
        i++;
        break;
      case 23: 
        int m = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((m & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((m & 0xFF) * 2 + 3 & 0xFFFF);
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
        i += 8;
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
        i += 5;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 5;
        break;
      case 37: 
      case 69: 
      case 101: 
        i += 9;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 60: 
      case 92: 
      case 124: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramWorksheetCollection.r().c(k) != paramWorksheetCollection.v()) {
          return true;
        }
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramWorksheetCollection.r().c(k) != paramWorksheetCollection.v()) {
          return true;
        }
        i += 11;
        break;
      case 61: 
      case 93: 
      case 125: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramWorksheetCollection.r().c(k) != paramWorksheetCollection.v()) {
          return true;
        }
        i += 11;
        break;
      case 44: 
      case 76: 
      case 108: 
        i += 5;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 9;
        break;
      case 2: 
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
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + 2;
    }
    int k = 0;
    while (i < j)
    {
      int n;
      switch (paramArrayOfByte[i])
      {
      case 1: 
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
        i++;
        break;
      case 23: 
        int m = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((m & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((m & 0xFF) * 2 + 3 & 0xFFFF);
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
        i += 8;
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
        i += 5;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 5;
        break;
      case 37: 
      case 69: 
      case 101: 
        i += 9;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        i += 7;
        break;
      case 60: 
      case 92: 
      case 124: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if ((paramHashMap1.get(Integer.valueOf(k)) != null) && (paramHashMap1.get(Integer.valueOf(k)) != znq.i)) {
          return true;
        }
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if ((paramHashMap1.get(Integer.valueOf(k)) != null) && (paramHashMap1.get(Integer.valueOf(k)) != znq.i)) {
          return true;
        }
        i += 11;
        break;
      case 61: 
      case 93: 
      case 125: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if ((paramHashMap1.get(Integer.valueOf(k)) != null) && (paramHashMap1.get(Integer.valueOf(k)) != znq.i)) {
          return true;
        }
        i += 11;
        break;
      case 44: 
      case 76: 
      case 108: 
        i += 5;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 9;
        break;
      case 2: 
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
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, HashMap paramHashMap, WorksheetCollection paramWorksheetCollection)
  {
    int i = paramInt1;
    int j = paramInt2;
    if (i == -1)
    {
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
    }
    while (i < j)
    {
      int m;
      switch (paramArrayOfByte[i])
      {
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
        int k = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((k & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((k & 0xFF) * 2 + 3 & 0xFFFF);
        }
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
        i += 8;
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
        i += 5;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 5;
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
        i += 7;
        break;
      case 59: 
      case 61: 
      case 91: 
      case 93: 
      case 123: 
      case 125: 
        i += 11;
        break;
      }
    }
  }
  
  static void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, HashMap paramHashMap, WorksheetCollection paramWorksheetCollection)
  {
    int i = paramInt1;
    int j = paramInt2;
    if ((paramHashMap == null) || (paramHashMap.size() == 0)) {
      return;
    }
    if (i == -1)
    {
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
    }
    while (i < j)
    {
      int m;
      int n;
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
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
        i++;
        break;
      case 23: 
        int k = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((k & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((k & 0xFF) * 2 + 3 & 0xFFFF);
        }
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
        i += 8;
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
        i += 5;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 5;
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
        i += 7;
        break;
      case 59: 
      case 61: 
      case 91: 
      case 93: 
      case 123: 
      case 125: 
        i += 11;
        break;
      }
    }
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, HashMap paramHashMap1, HashMap paramHashMap2)
  {
    int i = paramInt1;
    int j = paramInt2;
    if (i == -1)
    {
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
    }
    while (i < j)
    {
      int m;
      int n;
      int i1;
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
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
        i++;
        break;
      case 23: 
        int k = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((k & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((k & 0xFF) * 2 + 3 & 0xFFFF);
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
        i += 8;
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
        if (paramHashMap2.get(Integer.valueOf(m)) != null)
        {
          n = ((Integer)paramHashMap2.get(Integer.valueOf(m))).intValue();
          if ((n != m) && (n >= 0)) {
            System.arraycopy(zc.a(n + 1), 0, paramArrayOfByte, i + 1, 2);
          }
        }
        i += 5;
        break;
      case 36: 
      case 68: 
      case 100: 
        i += 5;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 5;
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
        if (paramHashMap2.get(Integer.valueOf(n)) != null)
        {
          i1 = ((Integer)paramHashMap2.get(Integer.valueOf(n))).intValue();
          if ((i1 != n) && (i1 >= 0)) {
            System.arraycopy(zc.a(i1 + 1), 0, paramArrayOfByte, i + 3, 2);
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
        i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramHashMap1.get(Integer.valueOf(i1)) != null) {
          i1 = ((Integer)paramHashMap1.get(Integer.valueOf(i1))).intValue();
        } else {
          i1 = 0;
        }
        System.arraycopy(zc.a(i1), 0, paramArrayOfByte, i + 1, 2);
        i += 7;
        break;
      case 59: 
      case 61: 
      case 91: 
      case 93: 
      case 123: 
      case 125: 
        i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (paramHashMap1.get(Integer.valueOf(i1)) != null) {
          i1 = ((Integer)paramHashMap1.get(Integer.valueOf(i1))).intValue();
        } else {
          i1 = 0;
        }
        System.arraycopy(zc.a(i1), 0, paramArrayOfByte, i + 1, 2);
        i += 11;
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
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
    }
    while (i < j)
    {
      int n;
      int k;
      int m;
      switch (paramArrayOfByte[i])
      {
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
        int i1 = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((i1 & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((i1 & 0xFF) * 2 + 3 & 0xFFFF);
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
          int i2 = zc.e(paramArrayOfByte, i + 2);
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
        i += 8;
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
        i += 5;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 5;
        break;
      case 44: 
      case 76: 
      case 108: 
        int tmp801_799 = i;
        paramArrayOfByte[tmp801_799] = ((byte)(paramArrayOfByte[tmp801_799] & 0xF7));
        n = paramArrayOfByte[(i + 4)] & 0xFF & 0x80;
        if (n != 0)
        {
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          k += paramInt3;
          if (k > 65535) {
            k -= 65536;
          }
          System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
        }
        n = paramArrayOfByte[(i + 4)] & 0xFF & 0x40;
        if (n != 0)
        {
          m = paramArrayOfByte[(i + 3)] & 0xFF;
          m += paramInt4;
          if (m > 255) {
            m -= 256;
          }
          paramArrayOfByte[(i + 3)] = ((byte)m);
        }
        i += 5;
        break;
      case 45: 
      case 77: 
      case 109: 
        int tmp949_947 = i;
        paramArrayOfByte[tmp949_947] = ((byte)(paramArrayOfByte[tmp949_947] & 0xF7));
        n = paramArrayOfByte[(i + 6)] & 0xFF & 0x80;
        if (n != 0)
        {
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          k += paramInt3;
          if (k > 65535) {
            k -= 65536;
          }
          System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
        }
        n = paramArrayOfByte[(i + 6)] & 0xFF & 0x40;
        if (n != 0)
        {
          m = paramArrayOfByte[(i + 5)] & 0xFF;
          m += paramInt4;
          if (m > 255) {
            m -= 256;
          }
          paramArrayOfByte[(i + 5)] = ((byte)m);
        }
        n = paramArrayOfByte[(i + 8)] & 0xFF & 0x80;
        if (n != 0)
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          k += paramInt3;
          if (k > 65535) {
            k -= 65536;
          }
          System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
        }
        n = paramArrayOfByte[(i + 8)] & 0xFF & 0x40;
        if (n != 0)
        {
          m = paramArrayOfByte[(i + 7)] & 0xFF;
          m += paramInt4;
          if (m > 255) {
            m -= 256;
          }
          paramArrayOfByte[(i + 7)] = ((byte)m);
        }
        i += 9;
        break;
      case 37: 
      case 43: 
      case 69: 
      case 75: 
      case 101: 
      case 107: 
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
        i += 7;
        break;
      case 59: 
      case 61: 
      case 91: 
      case 93: 
      case 123: 
      case 125: 
        i += 11;
        break;
      }
    }
  }
  
  static void a(CellArea paramCellArea, int paramInt1, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    int j = paramInt3;
    if (paramInt1 == 0) {
      return;
    }
    if (i == -1)
    {
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
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
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = paramArrayOfByte[(i + 3)];
          if ((k >= paramCellArea.StartRow) && ((m & 0xFF) >= paramCellArea.StartColumn) && ((m & 0xFF) <= paramCellArea.EndColumn))
          {
            k += paramInt1;
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
          }
        }
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
        i++;
        break;
      case 23: 
        int i2 = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((i2 & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((i2 & 0xFF) * 2 + 3 & 0xFFFF);
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
        i += 8;
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
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = paramArrayOfByte[(i + 3)];
          if ((k >= paramCellArea.StartRow) && ((m & 0xFF) >= paramCellArea.StartColumn) && ((m & 0xFF) <= paramCellArea.EndColumn))
          {
            k += paramInt1;
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
          }
        }
        i += 5;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 5;
        break;
      case 37: 
      case 43: 
      case 69: 
      case 75: 
      case 101: 
      case 107: 
        if (paramBoolean)
        {
          m = paramArrayOfByte[(i + 5)];
          n = paramArrayOfByte[(i + 7)];
          if ((paramCellArea.StartColumn <= (m & 0xFF)) && (paramCellArea.EndColumn >= (n & 0xFF)))
          {
            k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
            if (k >= paramCellArea.StartRow)
            {
              k += paramInt1;
              System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
            }
            k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
            if (k >= paramCellArea.StartRow)
            {
              k += paramInt1;
              if (k > 65535) {
                k = 65535;
              }
              System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
            }
          }
        }
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
          i += 7;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          m = paramArrayOfByte[(i + 5)];
          if ((k >= paramCellArea.StartRow) && ((m & 0xFF) >= paramCellArea.StartColumn) && ((m & 0xFF) <= paramCellArea.EndColumn))
          {
            k += paramInt1;
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
          }
          i += 7;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(i1, paramWorksheet))
        {
          i += 11;
        }
        else
        {
          m = paramArrayOfByte[(i + 7)];
          n = paramArrayOfByte[(i + 9)];
          if ((paramCellArea.StartColumn <= (m & 0xFF)) && (paramCellArea.EndColumn >= (m & 0xFF)))
          {
            k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
            if (k >= paramCellArea.StartRow)
            {
              k += paramInt1;
              System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
            }
            k = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
            if (k >= paramCellArea.StartRow)
            {
              k += paramInt1;
              if (k > 65535) {
                k = 65535;
              }
              System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 5, 2);
            }
          }
          i += 11;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 11;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 9;
        break;
      }
    }
  }
  
  static void b(CellArea paramCellArea, int paramInt1, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    int j = paramInt3;
    if (paramInt1 == 0) {
      return;
    }
    if (i == -1)
    {
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
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
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = paramArrayOfByte[(i + 3)];
          if ((k >= paramCellArea.StartRow) && ((m & 0xFF) >= paramCellArea.StartColumn) && ((m & 0xFF) <= paramCellArea.EndColumn))
          {
            k -= paramInt1;
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
          }
        }
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
        i++;
        break;
      case 23: 
        int i1 = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((i1 & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((i1 & 0xFF) * 2 + 3 & 0xFFFF);
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
        i += 8;
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
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = paramArrayOfByte[(i + 3)];
          if (((m & 0xFF) >= paramCellArea.StartColumn) && ((m & 0xFF) <= paramCellArea.EndColumn)) {
            if (k > paramCellArea.EndRow)
            {
              k -= paramInt1;
              System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
            }
            else if (k >= paramCellArea.StartRow)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
            }
          }
        }
        i += 5;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 5;
        break;
      case 37: 
      case 43: 
      case 69: 
      case 75: 
      case 101: 
      case 107: 
        if (paramBoolean)
        {
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = paramArrayOfByte[(i + 5)];
          i2 = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          i3 = paramArrayOfByte[(i + 7)] & 0xFF;
          i4 = 0;
          i5 = 0;
          arrayOfBoolean1 = new boolean[] { i4 };
          arrayOfBoolean2 = new boolean[] { i5 };
          localCellArea = a(paramCellArea, paramInt1, k, m & 0xFF, i2, i3, arrayOfBoolean1, arrayOfBoolean2);
          i4 = arrayOfBoolean1[0];
          i5 = arrayOfBoolean2[0];
          if (i5 != 0)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          }
          else if (i4 != 0)
          {
            if (localCellArea.StartRow != k) {
              System.arraycopy(zc.a(localCellArea.StartRow), 0, paramArrayOfByte, i + 1, 2);
            }
            if (localCellArea.EndRow != i2) {
              System.arraycopy(zc.a(localCellArea.EndRow), 0, paramArrayOfByte, i + 3, 2);
            }
            paramArrayOfByte[(i + 5)] = ((byte)localCellArea.StartColumn);
            paramArrayOfByte[(i + 7)] = ((byte)localCellArea.EndColumn);
          }
        }
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
          i += 7;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          m = paramArrayOfByte[(i + 5)];
          if (((m & 0xFF) >= paramCellArea.StartColumn) && ((m & 0xFF) <= paramCellArea.EndColumn)) {
            if (k > paramCellArea.EndRow)
            {
              k -= paramInt1;
              System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
            }
            else if (k >= paramCellArea.StartRow)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
            }
          }
          i += 7;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(n, paramWorksheet))
        {
          i += 11;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          m = paramArrayOfByte[(i + 7)];
          i2 = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
          i3 = paramArrayOfByte[(i + 9)] & 0xFF;
          i4 = 0;
          i5 = 0;
          arrayOfBoolean1 = new boolean[] { i4 };
          arrayOfBoolean2 = new boolean[] { i5 };
          localCellArea = a(paramCellArea, paramInt1, k, m & 0xFF, i2, i3, arrayOfBoolean1, arrayOfBoolean2);
          i4 = arrayOfBoolean1[0];
          i5 = arrayOfBoolean2[0];
          if (i5 != 0)
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          }
          else if (i4 != 0)
          {
            if (localCellArea.StartRow != k) {
              System.arraycopy(zc.a(localCellArea.StartRow), 0, paramArrayOfByte, i + 3, 2);
            }
            if (localCellArea.EndRow != i2) {
              System.arraycopy(zc.a(localCellArea.EndRow), 0, paramArrayOfByte, i + 5, 2);
            }
            paramArrayOfByte[(i + 7)] = ((byte)localCellArea.StartColumn);
            paramArrayOfByte[(i + 9)] = ((byte)localCellArea.EndColumn);
          }
          i += 11;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 11;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 9;
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
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
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
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          n = paramArrayOfByte[(i + 3)] & 0xFF;
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (n >= paramCellArea.StartColumn))
          {
            n += paramInt1;
            paramArrayOfByte[(i + 3)] = ((byte)n);
          }
        }
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
        i++;
        break;
      case 23: 
        int i2 = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((i2 & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((i2 & 0xFF) * 2 + 3 & 0xFFFF);
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
        i += 8;
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
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          n = paramArrayOfByte[(i + 3)] & 0xFF;
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (n >= paramCellArea.StartColumn))
          {
            n += paramInt1;
            paramArrayOfByte[(i + 3)] = ((byte)n);
          }
        }
        i += 5;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 5;
        break;
      case 37: 
      case 43: 
      case 69: 
      case 75: 
      case 101: 
      case 107: 
        if (paramBoolean)
        {
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          if ((paramCellArea.StartRow <= k) && (paramCellArea.EndRow >= m))
          {
            n = paramArrayOfByte[(i + 5)] & 0xFF;
            if (n >= paramCellArea.StartColumn)
            {
              n += paramInt1;
              if (n > 255) {
                n = 255;
              }
              paramArrayOfByte[(i + 5)] = ((byte)n);
            }
            n = paramArrayOfByte[(i + 7)] & 0xFF;
            if (n >= paramCellArea.StartColumn)
            {
              n += paramInt1;
              if (n > 255) {
                n = 255;
              }
              paramArrayOfByte[(i + 7)] = ((byte)n);
            }
          }
        }
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
          i += 7;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          n = paramArrayOfByte[(i + 5)] & 0xFF;
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (n >= paramCellArea.StartColumn))
          {
            n += paramInt1;
            paramArrayOfByte[(i + 5)] = ((byte)n);
          }
          i += 7;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        i1 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(i1, paramWorksheet))
        {
          i += 11;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          m = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
          if ((paramCellArea.StartRow <= k) && (paramCellArea.EndRow >= m))
          {
            n = paramArrayOfByte[(i + 7)] & 0xFF;
            if (n >= paramCellArea.StartColumn)
            {
              n += paramInt1;
              if (n > 255) {
                n = 255;
              }
              paramArrayOfByte[(i + 7)] = ((byte)n);
            }
            n = paramArrayOfByte[(i + 9)] & 0xFF;
            if (n >= paramCellArea.StartColumn)
            {
              n += paramInt1;
              if (n > 255) {
                n = 255;
              }
              paramArrayOfByte[(i + 9)] = ((byte)n);
            }
          }
          i += 11;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 11;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 9;
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
      if ((paramCellArea.EndColumn >= paramInt5) && (paramCellArea.StartRow <= paramInt2) && (paramCellArea.EndRow >= paramInt4))
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
            localCellArea.StartRow = paramCellArea.StartRow;
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
            localCellArea.StartColumn = paramCellArea.StartColumn;
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
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
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
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = paramArrayOfByte[(i + 3)] & 0xFF;
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (m >= paramCellArea.StartColumn))
          {
            m -= paramInt1;
            paramArrayOfByte[(i + 3)] = ((byte)m);
          }
        }
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
        i++;
        break;
      case 23: 
        int i1 = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((i1 & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((i1 & 0xFF) * 2 + 3 & 0xFFFF);
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
        i += 8;
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
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = paramArrayOfByte[(i + 3)] & 0xFF;
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow)) {
            if (m > paramCellArea.EndColumn)
            {
              m -= paramInt1;
              paramArrayOfByte[(i + 3)] = ((byte)m);
            }
            else if (m >= paramCellArea.StartColumn)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
            }
          }
        }
        i += 5;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 5;
        break;
      case 37: 
      case 43: 
      case 69: 
      case 75: 
      case 101: 
      case 107: 
        if (paramBoolean)
        {
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = paramArrayOfByte[(i + 5)] & 0xFF;
          i2 = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          i3 = paramArrayOfByte[(i + 7)] & 0xFF;
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
              System.arraycopy(zc.a(localCellArea.StartRow), 0, paramArrayOfByte, i + 1, 2);
            }
            if (i2 != localCellArea.EndRow) {
              System.arraycopy(zc.a(localCellArea.EndRow), 0, paramArrayOfByte, i + 3, 2);
            }
            paramArrayOfByte[(i + 5)] = ((byte)localCellArea.StartColumn);
            paramArrayOfByte[(i + 7)] = ((byte)localCellArea.EndColumn);
          }
        }
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
          i += 7;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          m = paramArrayOfByte[(i + 5)] & 0xFF;
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && (m >= paramCellArea.StartColumn)) {
            if (m > paramCellArea.EndColumn)
            {
              m -= paramInt1;
              paramArrayOfByte[(i + 5)] = ((byte)m);
            }
            else if (m >= paramCellArea.StartColumn)
            {
              paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
            }
          }
          i += 7;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(n, paramWorksheet))
        {
          i += 11;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          m = paramArrayOfByte[(i + 7)] & 0xFF;
          i2 = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
          i3 = paramArrayOfByte[(i + 9)] & 0xFF;
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
              System.arraycopy(zc.a(localCellArea.StartRow), 0, paramArrayOfByte, i + 3, 2);
            }
            if (i2 != localCellArea.EndRow) {
              System.arraycopy(zc.a(localCellArea.EndRow), 0, paramArrayOfByte, i + 5, 2);
            }
            paramArrayOfByte[(i + 7)] = ((byte)localCellArea.StartColumn);
            paramArrayOfByte[(i + 9)] = ((byte)localCellArea.EndColumn);
          }
          i += 11;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 11;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 9;
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
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
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
        i++;
        break;
      case 23: 
        int i3 = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((i3 & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((i3 & 0xFF) * 2 + 3 & 0xFFFF);
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
        i += 8;
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
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = paramArrayOfByte[(i + 3)];
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && ((m & 0xFF) >= paramCellArea.StartColumn) && ((m & 0xFF) <= paramCellArea.EndColumn))
          {
            k = paramInt1 + k - paramCellArea.StartRow;
            m = (byte)(paramInt2 + (m & 0xFF) - paramCellArea.StartColumn);
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
            paramArrayOfByte[(i + 3)] = m;
          }
          else if ((k >= paramInt1) && (k <= i1) && ((m & 0xFF) >= paramInt2) && ((m & 0xFF) <= i2))
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          }
        }
        i += 5;
        break;
      case 42: 
      case 44: 
      case 74: 
      case 76: 
      case 106: 
      case 108: 
        i += 5;
        break;
      case 43: 
      case 75: 
      case 107: 
        i += 9;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean)
        {
          k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
          m = paramArrayOfByte[(i + 5)];
          i4 = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          i5 = paramArrayOfByte[(i + 7)] & 0xFF;
          if ((k >= paramCellArea.StartRow) && (i4 <= paramCellArea.EndRow) && ((m & 0xFF) >= paramCellArea.StartColumn) && (i5 <= paramCellArea.EndColumn))
          {
            k = paramInt1 + k - paramCellArea.StartRow;
            m = (byte)(paramInt2 + (m & 0xFF) - paramCellArea.StartColumn);
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 1, 2);
            paramArrayOfByte[(i + 5)] = m;
            i4 = paramInt1 + i4 - paramCellArea.StartRow;
            i5 = (byte)(paramInt2 + i5 - paramCellArea.StartColumn) & 0xFF;
            System.arraycopy(zc.a(i4), 0, paramArrayOfByte, i + 3, 2);
            paramArrayOfByte[(i + 7)] = ((byte)i5);
          }
          else if ((k >= paramInt1) && (i4 <= i1) && ((m & 0xFF) >= paramInt2) && (i5 <= i2))
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 6));
          }
        }
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
          i += 7;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          m = paramArrayOfByte[(i + 5)];
          if ((k >= paramCellArea.StartRow) && (k <= paramCellArea.EndRow) && ((m & 0xFF) >= paramCellArea.StartColumn) && ((m & 0xFF) <= paramCellArea.EndColumn))
          {
            k = paramInt1 + k - paramCellArea.StartRow;
            m = (byte)(paramInt2 + (m & 0xFF) - paramCellArea.StartColumn);
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
            paramArrayOfByte[(i + 5)] = m;
          }
          else if ((k >= paramInt1) && (k <= i1) && ((m & 0xFF) >= paramInt2) && ((m & 0xFF) <= i2))
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          }
          i += 7;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        n = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(n, paramWorksheet))
        {
          i += 11;
        }
        else
        {
          k = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          m = paramArrayOfByte[(i + 7)];
          i4 = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
          i5 = paramArrayOfByte[(i + 9)] & 0xFF;
          if ((k >= paramCellArea.StartRow) && (i4 <= paramCellArea.EndRow) && ((m & 0xFF) >= paramCellArea.StartColumn) && (i5 <= paramCellArea.EndColumn))
          {
            k = paramInt1 + k - paramCellArea.StartRow;
            m = (byte)(paramInt2 + (m & 0xFF) - paramCellArea.StartColumn);
            System.arraycopy(zc.a(k), 0, paramArrayOfByte, i + 3, 2);
            paramArrayOfByte[(i + 7)] = m;
            i4 = paramInt1 + i4 - paramCellArea.StartRow;
            i5 = (byte)(paramInt2 + i5 - paramCellArea.StartColumn) & 0xFF;
            System.arraycopy(zc.a(i4), 0, paramArrayOfByte, i + 5, 2);
            paramArrayOfByte[(i + 9)] = ((byte)i5);
          }
          else if ((k >= paramInt1) && (i4 <= i1) && ((m & 0xFF) >= paramInt2) && (i5 <= i2))
          {
            paramArrayOfByte[i] = ((byte)((paramArrayOfByte[i] & 0xFF) + 2));
          }
          i += 11;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 11;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 9;
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
      i = 2;
      j = (zc.e(paramArrayOfByte, 0) & 0xFFFF) + i;
    }
    while (i < j) {
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
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
        i++;
        break;
      case 23: 
        int k = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((k & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((k & 0xFF) * 2 + 3 & 0xFFFF);
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
          int m = zc.e(paramArrayOfByte, i + 4);
          i += (m & 0xFFFF) + 4;
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
        i += 8;
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
        i += 5;
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 5;
        break;
      case 37: 
      case 43: 
      case 69: 
      case 75: 
      case 101: 
      case 107: 
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
        i += 7;
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        i += 11;
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 11;
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
    int i = paramInt5;
    int j = paramInt6;
    int i1 = 0;
    int i2 = 0;
    if (i == -1)
    {
      i1 = 1;
      i2 = zc.e(paramArrayOfByte, 0) & 0xFFFF;
      i = 2;
      j = i + (zc.e(paramArrayOfByte, 0) & 0xFFFF);
    }
    zcy localzcy = new zcy(paramArrayOfByte);
    while (i < j)
    {
      int i4;
      int i5;
      int m;
      int n;
      int k;
      switch (paramArrayOfByte[i])
      {
      case 1: 
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
        i++;
        break;
      case 23: 
        int i3 = paramArrayOfByte[(i + 1)];
        if (paramArrayOfByte[(i + 2)] == 0) {
          i += ((i3 & 0xFF) + 3 & 0xFFFF);
        } else {
          i += ((i3 & 0xFF) * 2 + 3 & 0xFFFF);
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
        i += 8;
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
        i4 = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        i5 = paramArrayOfByte[(i + 3)] & 0xFF;
        if (((paramBoolean2) && (i4 == paramInt1)) || ((!paramBoolean2) && (i5 == paramInt2)))
        {
          localzcy.a(i + 5, 4);
          j += 4;
          paramArrayOfByte = localzcy.a;
          if (i1 != 0)
          {
            i2 += 4;
            System.arraycopy(zc.a(i2), 0, paramArrayOfByte, 0, 2);
          }
          System.arraycopy(paramArrayOfByte, i + 3, paramArrayOfByte, i + 5, 2);
          System.arraycopy(paramArrayOfByte, i + 3, paramArrayOfByte, i + 7, 2);
          System.arraycopy(paramArrayOfByte, i + 1, paramArrayOfByte, i + 3, 2);
          int tmp982_980 = i;
          byte[] tmp982_978 = paramArrayOfByte;
          tmp982_978[tmp982_980] = ((byte)(tmp982_978[tmp982_980] + 1));
          if (paramBoolean2)
          {
            i4 += paramInt3;
            System.arraycopy(zc.a(i4), 0, paramArrayOfByte, i + 3, 2);
          }
          else
          {
            i5 += paramInt3;
            paramArrayOfByte[(i + 7)] = ((byte)i5);
          }
          i += 9;
        }
        else
        {
          i += 5;
        }
        break;
      case 42: 
      case 74: 
      case 106: 
        i += 5;
        break;
      case 37: 
      case 69: 
      case 101: 
        if (paramBoolean1) {
          if (paramBoolean2)
          {
            m = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
            if (m == paramInt1) {
              if (paramBoolean3)
              {
                m += paramInt3;
                System.arraycopy(zc.a(m), 0, paramArrayOfByte, i + 3, 2);
              }
              else
              {
                i4 = paramArrayOfByte[(i + 5)] & 0xFF;
                n = paramArrayOfByte[(i + 7)] & 0xFF;
                if ((paramInt2 <= i4) && (paramInt4 >= n))
                {
                  m += paramInt3;
                  System.arraycopy(zc.a(m), 0, paramArrayOfByte, i + 3, 2);
                }
              }
            }
          }
          else
          {
            n = paramArrayOfByte[(i + 7)] & 0xFF;
            if (n == paramInt2)
            {
              n += paramInt3;
              paramArrayOfByte[(i + 7)] = ((byte)n);
            }
          }
        }
        i += 9;
        break;
      case 43: 
      case 75: 
      case 107: 
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
        if (!paramWorksheet.c().r().a(k, paramWorksheet))
        {
          i += 7;
        }
        else
        {
          i4 = zc.e(paramArrayOfByte, i + 3) & 0xFFFF;
          i5 = paramArrayOfByte[(i + 5)] & 0xFF;
          if (((paramBoolean2) && (i4 == paramInt1)) || ((!paramBoolean2) && (i5 == paramInt2)))
          {
            localzcy.a(i + 7, 4);
            j += 4;
            paramArrayOfByte = localzcy.a;
            if (i1 != 0)
            {
              i2 += 4;
              System.arraycopy(zc.a(i2), 0, paramArrayOfByte, 0, 2);
            }
            System.arraycopy(paramArrayOfByte, i + 5, paramArrayOfByte, i + 7, 2);
            System.arraycopy(paramArrayOfByte, i + 5, paramArrayOfByte, i + 9, 2);
            System.arraycopy(paramArrayOfByte, i + 3, paramArrayOfByte, i + 5, 2);
            int tmp1430_1428 = i;
            byte[] tmp1430_1426 = paramArrayOfByte;
            tmp1430_1426[tmp1430_1428] = ((byte)(tmp1430_1426[tmp1430_1428] + 1));
            if (paramBoolean2)
            {
              i4 += paramInt3;
              System.arraycopy(zc.a(i4), 0, paramArrayOfByte, i + 5, 2);
            }
            else
            {
              i5 += paramInt3;
              paramArrayOfByte[(i + 9)] = ((byte)i5);
            }
            i += 11;
          }
          else
          {
            i += 7;
          }
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        i += 7;
        break;
      case 59: 
      case 91: 
      case 123: 
        k = zc.e(paramArrayOfByte, i + 1) & 0xFFFF;
        if (!paramWorksheet.c().r().a(k, paramWorksheet))
        {
          i += 11;
        }
        else
        {
          if (paramBoolean2)
          {
            m = zc.e(paramArrayOfByte, i + 5) & 0xFFFF;
            if (m == paramInt1) {
              if (paramBoolean3)
              {
                m += paramInt3;
                System.arraycopy(zc.a(m), 0, paramArrayOfByte, i + 5, 2);
              }
              else
              {
                i4 = paramArrayOfByte[(i + 7)] & 0xFF;
                n = paramArrayOfByte[(i + 9)] & 0xFF;
                if ((paramInt2 <= i4) && (paramInt4 >= n))
                {
                  m += paramInt3;
                  System.arraycopy(zc.a(m), 0, paramArrayOfByte, i + 5, 2);
                }
              }
            }
          }
          else
          {
            n = paramArrayOfByte[(i + 9)] & 0xFF;
            if (n == paramInt2)
            {
              n += paramInt3;
              paramArrayOfByte[(i + 9)] = ((byte)n);
            }
          }
          i += 11;
        }
        break;
      case 61: 
      case 93: 
      case 125: 
        i += 11;
        break;
      case 44: 
      case 76: 
      case 108: 
        i += 5;
        break;
      case 45: 
      case 77: 
      case 109: 
        i += 9;
        break;
      case 2: 
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */