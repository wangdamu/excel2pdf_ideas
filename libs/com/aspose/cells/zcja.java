package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zp;

class zcja
{
  static boolean a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    if (paramInt == -1)
    {
      i = com.aspose.cells.b.a.zc.a(paramArrayOfByte, 0);
      paramInt = 4;
    }
    if (paramArrayOfByte[paramInt] != 23) {
      return false;
    }
    int j = com.aspose.cells.b.a.zc.e(paramArrayOfByte, paramInt + 1) & 0xFFFF;
    return i == j * 2 + 3;
  }
  
  private static boolean a(String paramString, int[] paramArrayOfInt)
  {
    paramArrayOfInt[0] = 0;
    if ((paramString == null) || (paramString.length() > 3)) {
      return false;
    }
    for (int i = 0; i < paramString.length(); i++) {
      if (Character.isLetter(paramString.charAt(i))) {
        paramArrayOfInt[0] = (paramArrayOfInt[0] * 26 + paramString.charAt(i) - 65 + 1);
      } else {
        return false;
      }
    }
    if (paramArrayOfInt[0] > 0) {
      paramArrayOfInt[0] -= 1;
    }
    return (paramArrayOfInt[0] <= 16383) && (paramArrayOfInt[0] >= 0);
  }
  
  static boolean a(String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2, boolean[] paramArrayOfBoolean3, boolean[] paramArrayOfBoolean4)
  {
    paramArrayOfInt1[0] = -1;
    paramArrayOfInt2[0] = -1;
    paramArrayOfBoolean1[0] = false;
    paramArrayOfBoolean2[0] = false;
    if (paramString == null) {
      return false;
    }
    paramString = paramString.toUpperCase();
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    for (int j = 0; j < arrayOfChar.length; j++) {
      if (Character.isLetter(arrayOfChar[j]))
      {
        if (paramArrayOfInt2[0] != -1) {
          return false;
        }
        i = j;
        if ((j != 0) && (arrayOfChar[(j - 1)] == '$')) {
          paramArrayOfBoolean2[0] = true;
        }
        while ((j < arrayOfChar.length) && (Character.isLetter(arrayOfChar[j]))) {
          j++;
        }
        if (!a(paramString.substring(i, i + (j - i)), paramArrayOfInt2)) {
          return false;
        }
        if (j != arrayOfChar.length) {
          j--;
        }
      }
      else if (Character.isDigit(arrayOfChar[j]))
      {
        if (paramArrayOfInt1[0] != -1) {
          return false;
        }
        i = j;
        if ((j != 0) && (arrayOfChar[(j - 1)] == '$')) {
          paramArrayOfBoolean1[0] = true;
        }
        while ((j < arrayOfChar.length) && (Character.isDigit(arrayOfChar[j]))) {
          j++;
        }
        paramArrayOfInt1[0] = (zp.a(paramString.substring(i, i + (j - i))) - 1);
        if (paramArrayOfInt1[0] > 1048575) {
          return false;
        }
        if (j != arrayOfChar.length) {
          return false;
        }
      }
      else if (arrayOfChar[j] == '$')
      {
        if (j == arrayOfChar.length - 1) {
          return false;
        }
        if ((j != 0) && (arrayOfChar[(j - 1)] == '$')) {
          return false;
        }
      }
      else
      {
        return false;
      }
    }
    paramArrayOfBoolean4[0] = (paramArrayOfInt1[0] == -1 ? 1 : false);
    paramArrayOfBoolean3[0] = (paramArrayOfInt2[0] == -1 ? 1 : false);
    return true;
  }
  
  public static boolean a(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    paramString = paramString.toUpperCase();
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    int j = -1;
    int k = -1;
    for (int m = 0; m < arrayOfChar.length; m++) {
      if (Character.isLetter(arrayOfChar[m]))
      {
        if (j != -1) {
          return false;
        }
        i = m;
        while ((m < arrayOfChar.length) && (Character.isLetter(arrayOfChar[m]))) {
          m++;
        }
        int[] arrayOfInt = { j };
        int n = !a(paramString.substring(i, i + (m - i)), arrayOfInt) ? 1 : 0;
        j = arrayOfInt[0];
        if (n != 0) {
          return false;
        }
        if (m == arrayOfChar.length) {
          return false;
        }
        m--;
      }
      else if (Character.isDigit(arrayOfChar[m]))
      {
        if (k != -1) {
          return false;
        }
        i = m;
        while ((m < arrayOfChar.length) && (Character.isDigit(arrayOfChar[m]))) {
          m++;
        }
        k = zp.a(paramString.substring(i, i + (m - i))) - 1;
        if (k > 1048575) {
          return false;
        }
        if (m != arrayOfChar.length) {
          return false;
        }
      }
      else if (arrayOfChar[m] == '$')
      {
        if (m == arrayOfChar.length - 1) {
          return false;
        }
        if ((m != 0) && (arrayOfChar[(m - 1)] == '$')) {
          return false;
        }
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  static byte[] a(WorksheetCollection paramWorksheetCollection, int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean[] paramArrayOfBoolean)
  {
    byte[] arrayOfByte = null;
    if (zy.a(paramString, "#REF!"))
    {
      paramArrayOfBoolean[0] = false;
      arrayOfByte = new byte[17];
      arrayOfByte[0] = 9;
      arrayOfByte[4] = 60;
      return arrayOfByte;
    }
    int i = -1;
    int j = -1;
    int k = -1;
    int m = -1;
    paramArrayOfBoolean[0] = true;
    if (paramString.charAt(0) == '=') {
      paramString = paramString.substring(1);
    }
    ze localze = new ze("!");
    com.aspose.cells.b.a.g.a.zc localzc = localze.a(paramString);
    int n = 0;
    if (localzc.c())
    {
      n = 1;
      localObject = paramString.substring(0, 0 + localzc.d()).trim();
      if ((((String)localObject).charAt(0) == '\'') && (((String)localObject).charAt(((String)localObject).length() - 1) == '\''))
      {
        localObject = ((String)localObject).substring(1, 1 + (((String)localObject).length() - 2));
        if ((localObject == null) || ("".equals(localObject))) {
          throw new CellsException(15, "Invalid worksheet name.");
        }
      }
      int[] arrayOfInt1 = zaap.a(paramWorksheetCollection, (String)localObject, false);
      k = arrayOfInt1[0];
      m = arrayOfInt1[1];
      i = arrayOfInt1[2];
      j = arrayOfInt1[3];
      if (k == -1) {
        throw new CellsException(15, "Invalid worksheet name.");
      }
      paramInt = i;
      paramString = paramString.substring(localzc.d() + 1).trim();
    }
    else
    {
      m = paramWorksheetCollection.v();
      k = paramWorksheetCollection.r().b(paramWorksheetCollection.v(), paramInt);
    }
    localze = new ze(":");
    Object localObject = localze.a(paramString);
    if (((com.aspose.cells.b.a.g.a.zc)localObject).c())
    {
      i1 = 0;
      i2 = 0;
      i3 = 0;
      i4 = 0;
      int i5 = 0;
      int i7 = 0;
      bool1 = true;
      int i9 = 0;
      int i10 = 0;
      int i11 = 0;
      int i12 = 0;
      int i13 = 0;
      int i14 = 0;
      boolean bool2 = true;
      String str1 = paramString.substring(0, 0 + ((com.aspose.cells.b.a.g.a.zc)localObject).d()).trim();
      String str2 = paramString.substring(((com.aspose.cells.b.a.g.a.zc)localObject).d() + 1).trim();
      int[] arrayOfInt4 = { i1 };
      int[] arrayOfInt5 = { i2 };
      boolean[] arrayOfBoolean5 = { i5 };
      boolean[] arrayOfBoolean6 = { i7 };
      boolean[] arrayOfBoolean7 = { i3 };
      boolean[] arrayOfBoolean8 = { i4 };
      bool1 = a(str1, arrayOfInt4, arrayOfInt5, arrayOfBoolean5, arrayOfBoolean6, arrayOfBoolean7, arrayOfBoolean8);
      i1 = arrayOfInt4[0];
      i2 = arrayOfInt5[0];
      i5 = arrayOfBoolean5[0];
      i7 = arrayOfBoolean6[0];
      i3 = arrayOfBoolean7[0];
      i4 = arrayOfBoolean8[0];
      if (!bool1) {
        throw new CellsException(6, "Invalid cell range.");
      }
      int[] arrayOfInt6 = { i9 };
      int[] arrayOfInt7 = { i10 };
      boolean[] arrayOfBoolean9 = { i13 };
      boolean[] arrayOfBoolean10 = { i14 };
      boolean[] arrayOfBoolean11 = { i11 };
      boolean[] arrayOfBoolean12 = { i12 };
      bool2 = a(str2, arrayOfInt6, arrayOfInt7, arrayOfBoolean9, arrayOfBoolean10, arrayOfBoolean11, arrayOfBoolean12);
      i9 = arrayOfInt6[0];
      i10 = arrayOfInt7[0];
      i13 = arrayOfBoolean9[0];
      i14 = arrayOfBoolean10[0];
      i11 = arrayOfBoolean11[0];
      i12 = arrayOfBoolean12[0];
      if (!bool2) {
        throw new CellsException(6, "Invalid cell range.");
      }
      if ((i3 != i11) || (i4 != i12)) {
        throw new CellsException(6, "Invalid cell range.");
      }
      int i15 = 1;
      if ((n != 0) || (paramBoolean1))
      {
        arrayOfByte = new byte[15];
        arrayOfByte[0] = 59;
        System.arraycopy(com.aspose.cells.b.a.zc.a(k), 0, arrayOfByte, 1, 2);
        i15 = 3;
      }
      else
      {
        arrayOfByte = new byte[13];
        arrayOfByte[0] = 37;
      }
      if (i3 != 0)
      {
        zcjb.a(arrayOfByte, i15, i1, 0, i5, false);
        zcjb.a(arrayOfByte, i15 + 4, i9, 0, i13, false);
        zcjb.c(arrayOfByte, i15 + 10, 16383, 0, i14, false);
      }
      else if (i4 != 0)
      {
        zcjb.a(arrayOfByte, i15 + 4, 1048575, 0, i13, false);
        zcjb.c(arrayOfByte, i15 + 8, i2, 0, i7, false);
        zcjb.c(arrayOfByte, i15 + 10, i10, 0, i14, false);
      }
      else
      {
        zcjb.a(arrayOfByte, i15, i1, 0, i5, false);
        zcjb.a(arrayOfByte, i15 + 4, i9, 0, i13, false);
        zcjb.c(arrayOfByte, i15 + 8, i2, 0, i7, false);
        zcjb.c(arrayOfByte, i15 + 10, i10, 0, i14, false);
      }
      return arrayOfByte;
    }
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i6 = 0;
    int i8 = 0;
    boolean bool1 = true;
    int[] arrayOfInt2 = { i1 };
    int[] arrayOfInt3 = { i2 };
    boolean[] arrayOfBoolean1 = { i6 };
    boolean[] arrayOfBoolean2 = { i8 };
    boolean[] arrayOfBoolean3 = { i3 };
    boolean[] arrayOfBoolean4 = { i4 };
    bool1 = a(paramString, arrayOfInt2, arrayOfInt3, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3, arrayOfBoolean4);
    i1 = arrayOfInt2[0];
    i2 = arrayOfInt3[0];
    i6 = arrayOfBoolean1[0];
    i8 = arrayOfBoolean2[0];
    i3 = arrayOfBoolean3[0];
    i4 = arrayOfBoolean4[0];
    if ((bool1) && (i3 == 0) && (i4 == 0))
    {
      if ((n != 0) || (paramBoolean1))
      {
        arrayOfByte = new byte[9];
        arrayOfByte[0] = 58;
        System.arraycopy(com.aspose.cells.b.a.zc.a(k), 0, arrayOfByte, 1, 2);
        zcjb.a(arrayOfByte, 3, i1, 0, i6, false);
        zcjb.c(arrayOfByte, 7, i2, 0, i8, false);
      }
      else
      {
        arrayOfByte = new byte[7];
        arrayOfByte[0] = 36;
        zcjb.a(arrayOfByte, 1, i1, 0, i6, false);
        zcjb.c(arrayOfByte, 5, i2, 0, i8, false);
      }
      return arrayOfByte;
    }
    if (!paramBoolean2)
    {
      paramArrayOfBoolean[0] = false;
      return null;
    }
    if ((paramString.length() > 0) && (paramString.charAt(0) == '\'')) {
      paramString = paramString.substring(1, 1 + (paramString.length() - 2));
    }
    if (m == paramWorksheetCollection.v())
    {
      i1 = paramWorksheetCollection.getNames().a(paramString, paramInt, n == 0);
      if (i1 == -1)
      {
        paramArrayOfBoolean[0] = false;
        return null;
      }
      Name localName = paramWorksheetCollection.getNames().get(i1);
      Range localRange = localName.getRange();
      if (localRange == null)
      {
        paramArrayOfBoolean[0] = false;
        return null;
      }
      if (n != 0)
      {
        arrayOfByte = new byte[7];
        arrayOfByte[0] = 57;
        System.arraycopy(com.aspose.cells.b.a.zc.a(k), 0, arrayOfByte, 1, 2);
        System.arraycopy(com.aspose.cells.b.a.zc.a((i1 & 0xFFFF) + 1), 0, arrayOfByte, 3, 2);
      }
      else if (paramBoolean3)
      {
        arrayOfByte = localName.u();
      }
      else
      {
        arrayOfByte = new byte[5];
        arrayOfByte[0] = 35;
        System.arraycopy(com.aspose.cells.b.a.zc.a((i1 & 0xFFFF) + 1), 0, arrayOfByte, 1, 2);
      }
    }
    else
    {
      arrayOfByte = zcjf.a(paramWorksheetCollection, m, k, paramInt, paramString, 1, 32);
    }
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */