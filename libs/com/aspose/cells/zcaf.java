package com.aspose.cells;

import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zp;

class zcaf
{
  static boolean a(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt == -1) {
      paramInt = 2;
    }
    if (paramArrayOfByte[paramInt] != 23) {
      return false;
    }
    int i = paramArrayOfByte[(paramInt + 1)] & 0xFF;
    if (paramArrayOfByte[(paramInt + 2)] == 0) {
      return i + 3 == paramArrayOfByte.length - paramInt;
    }
    return i * 2 + 3 == paramArrayOfByte.length - paramInt;
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
      localObject1 = paramString.substring(0, 0 + localzc.d()).trim();
      if ((((String)localObject1).charAt(0) == '\'') && (((String)localObject1).charAt(((String)localObject1).length() - 1) == '\''))
      {
        localObject1 = ((String)localObject1).substring(1, 1 + (((String)localObject1).length() - 2));
        if ((localObject1 == null) || ("".equals(localObject1))) {
          throw new CellsException(15, "Invalid worksheet name.");
        }
      }
      int[] arrayOfInt1 = zaap.a(paramWorksheetCollection, (String)localObject1, false);
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
    Object localObject1 = localze.a(paramString);
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    boolean bool = true;
    byte[] arrayOfByte = null;
    Object localObject4;
    if (((com.aspose.cells.b.a.g.a.zc)localObject1).c())
    {
      boolean[] arrayOfBoolean4;
      if ((n != 0) || (paramBoolean1))
      {
        arrayOfByte = new byte[11];
        arrayOfByte[0] = 59;
        System.arraycopy(com.aspose.cells.b.a.zc.a(k), 0, arrayOfByte, 1, 2);
        localObject2 = paramString.substring(0, 0 + ((com.aspose.cells.b.a.g.a.zc)localObject1).d()).trim();
        arrayOfInt2 = new int[] { i1 };
        localObject3 = new int[] { i2 };
        arrayOfBoolean1 = new boolean[] { i5 };
        arrayOfBoolean2 = new boolean[] { i6 };
        arrayOfBoolean3 = new boolean[] { i3 };
        arrayOfBoolean4 = new boolean[] { i4 };
        bool = a((String)localObject2, arrayOfInt2, (int[])localObject3, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3, arrayOfBoolean4);
        i1 = arrayOfInt2[0];
        i2 = localObject3[0];
        i5 = arrayOfBoolean1[0];
        i6 = arrayOfBoolean2[0];
        i3 = arrayOfBoolean3[0];
        i4 = arrayOfBoolean4[0];
        if (bool)
        {
          if (i4 == 0) {
            System.arraycopy(com.aspose.cells.b.a.zc.a(i1), 0, arrayOfByte, 3, 2);
          }
          if (i3 == 0) {
            arrayOfByte[7] = ((byte)i2);
          }
        }
        else
        {
          throw new CellsException(6, "Invalid cell range.");
        }
        localObject4 = paramString.substring(((com.aspose.cells.b.a.g.a.zc)localObject1).d() + 1).trim();
        arrayOfInt2[0] = i1;
        localObject3[0] = i2;
        arrayOfBoolean1[0] = i5;
        arrayOfBoolean2[0] = i6;
        arrayOfBoolean3[0] = i3;
        arrayOfBoolean4[0] = i4;
        bool = a((String)localObject4, arrayOfInt2, (int[])localObject3, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3, arrayOfBoolean4);
        i1 = arrayOfInt2[0];
        i2 = localObject3[0];
        i5 = arrayOfBoolean1[0];
        i6 = arrayOfBoolean2[0];
        i3 = arrayOfBoolean3[0];
        i4 = arrayOfBoolean4[0];
        if (bool)
        {
          if (i4 == 0) {
            System.arraycopy(com.aspose.cells.b.a.zc.a(i1), 0, arrayOfByte, 5, 2);
          } else {
            System.arraycopy(com.aspose.cells.b.a.zc.a(65535), 0, arrayOfByte, 5, 2);
          }
          if (i3 == 0) {
            arrayOfByte[9] = ((byte)i2);
          } else {
            arrayOfByte[9] = -1;
          }
        }
        else
        {
          throw new CellsException(6, "Invalid cell range.");
        }
      }
      else
      {
        arrayOfByte = new byte[9];
        arrayOfByte[0] = 37;
        localObject2 = paramString.substring(0, 0 + ((com.aspose.cells.b.a.g.a.zc)localObject1).d()).trim();
        arrayOfInt2 = new int[] { i1 };
        localObject3 = new int[] { i2 };
        arrayOfBoolean1 = new boolean[] { i5 };
        arrayOfBoolean2 = new boolean[] { i6 };
        arrayOfBoolean3 = new boolean[] { i3 };
        arrayOfBoolean4 = new boolean[] { i4 };
        bool = a((String)localObject2, arrayOfInt2, (int[])localObject3, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3, arrayOfBoolean4);
        i1 = arrayOfInt2[0];
        i2 = localObject3[0];
        i5 = arrayOfBoolean1[0];
        i6 = arrayOfBoolean2[0];
        i3 = arrayOfBoolean3[0];
        i4 = arrayOfBoolean4[0];
        if (bool)
        {
          if (i4 == 0) {
            System.arraycopy(com.aspose.cells.b.a.zc.a(i1), 0, arrayOfByte, 1, 2);
          }
          if (i3 == 0) {
            arrayOfByte[5] = ((byte)i2);
          }
        }
        else
        {
          throw new CellsException(6, "Invalid cell range.");
        }
        localObject4 = paramString.substring(((com.aspose.cells.b.a.g.a.zc)localObject1).d() + 1).trim();
        arrayOfInt2[0] = i1;
        localObject3[0] = i2;
        arrayOfBoolean1[0] = i5;
        arrayOfBoolean2[0] = i6;
        arrayOfBoolean3[0] = i3;
        arrayOfBoolean4[0] = i4;
        bool = a((String)localObject4, arrayOfInt2, (int[])localObject3, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3, arrayOfBoolean4);
        i1 = arrayOfInt2[0];
        i2 = localObject3[0];
        i5 = arrayOfBoolean1[0];
        i6 = arrayOfBoolean2[0];
        i3 = arrayOfBoolean3[0];
        i4 = arrayOfBoolean4[0];
        if (bool)
        {
          if (i4 == 0) {
            System.arraycopy(com.aspose.cells.b.a.zc.a(i1), 0, arrayOfByte, 3, 2);
          } else {
            System.arraycopy(com.aspose.cells.b.a.zc.a(65535), 0, arrayOfByte, 3, 2);
          }
          if (i3 == 0) {
            arrayOfByte[7] = ((byte)i2);
          } else {
            arrayOfByte[7] = -1;
          }
        }
        else
        {
          throw new CellsException(6, "Invalid cell range.");
        }
      }
      return arrayOfByte;
    }
    Object localObject2 = { i1 };
    int[] arrayOfInt2 = { i2 };
    Object localObject3 = { i5 };
    boolean[] arrayOfBoolean1 = { i6 };
    boolean[] arrayOfBoolean2 = { i3 };
    boolean[] arrayOfBoolean3 = { i4 };
    bool = a(paramString, (int[])localObject2, arrayOfInt2, (boolean[])localObject3, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3);
    i1 = localObject2[0];
    i2 = arrayOfInt2[0];
    i5 = localObject3[0];
    i6 = arrayOfBoolean1[0];
    i3 = arrayOfBoolean2[0];
    i4 = arrayOfBoolean3[0];
    if ((bool) && (i3 == 0) && (i4 == 0))
    {
      if ((n != 0) || (paramBoolean1))
      {
        arrayOfByte = new byte[7];
        arrayOfByte[0] = 58;
        System.arraycopy(com.aspose.cells.b.a.zc.a(k), 0, arrayOfByte, 1, 2);
        System.arraycopy(com.aspose.cells.b.a.zc.a(i1), 0, arrayOfByte, 3, 2);
        arrayOfByte[5] = ((byte)i2);
      }
      else
      {
        arrayOfByte = new byte[5];
        arrayOfByte[0] = 36;
        System.arraycopy(com.aspose.cells.b.a.zc.a(i1), 0, arrayOfByte, 1, 2);
        arrayOfByte[3] = ((byte)i2);
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
      int i7 = paramWorksheetCollection.getNames().a(paramString, paramInt, n == 0);
      if (i7 == -1)
      {
        paramArrayOfBoolean[0] = false;
        return null;
      }
      localObject4 = paramWorksheetCollection.getNames().get(i7);
      Range localRange = ((Name)localObject4).getRange();
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
        System.arraycopy(com.aspose.cells.b.a.zc.a((i7 & 0xFFFF) + 1), 0, arrayOfByte, 3, 2);
      }
      else if (paramBoolean3)
      {
        arrayOfByte = ((Name)localObject4).u();
      }
      else
      {
        arrayOfByte = new byte[5];
        arrayOfByte[0] = 35;
        System.arraycopy(com.aspose.cells.b.a.zc.a((i7 & 0xFFFF) + 1), 0, arrayOfByte, 1, 2);
      }
    }
    else
    {
      arrayOfByte = zcak.a(paramWorksheetCollection, m, k, paramInt, paramString, 1, 32);
    }
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */