package com.aspose.cells;

import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.HashMap;

abstract class zacu
{
  private static HashMap a = new HashMap();
  
  public static zaif a(String paramString)
  {
    Object localObject1 = a.get(paramString);
    if (localObject1 != null) {
      return (zaif)localObject1;
    }
    Object localObject2;
    if (paramString.length() == 1)
    {
      localObject2 = new zacs(a(paramString.charAt(0)));
    }
    else
    {
      String[] arrayOfString = zw.d(paramString, '-');
      if (arrayOfString[2].length() != 1) {
        throw new CellsException(5, "Invalid parameter configuration: " + paramString);
      }
      if (arrayOfString.length > 5)
      {
        localObject2 = new zact(a(arrayOfString[2].charAt(0)), b(arrayOfString[3]), b(arrayOfString[4]), (byte)zp.a(arrayOfString[0]), (byte)zp.a(arrayOfString[1]), zp.a(arrayOfString[5]));
      }
      else
      {
        if ((arrayOfString[3].length() == 1) && (arrayOfString[4].length() == 1))
        {
          if (zw.b(arrayOfString[0], arrayOfString[1])) {
            return new zacq(a(arrayOfString[2].charAt(0)), a(arrayOfString[3].charAt(0)), a(arrayOfString[4].charAt(0)), (byte)zp.a(arrayOfString[0]));
          }
          return new zacr(a(arrayOfString[2].charAt(0)), a(arrayOfString[3].charAt(0)), a(arrayOfString[4].charAt(0)), (byte)zp.a(arrayOfString[0]), (byte)zp.a(arrayOfString[1]));
        }
        localObject2 = a(zp.a(arrayOfString[0]), zp.a(arrayOfString[1]), a(arrayOfString[2].charAt(0)), b(arrayOfString[3]), b(arrayOfString[4]));
      }
    }
    synchronized (zacu.class)
    {
      if (a.get(paramString) == null) {
        a.put(paramString, localObject2);
      }
    }
    return (zaif)localObject2;
  }
  
  private static int a(char paramChar)
  {
    switch (paramChar)
    {
    case 'R': 
      return 32;
    case 'A': 
      return 96;
    case 'V': 
      return 64;
    }
    throw new CellsException(5, "Invalid parameter configuration");
  }
  
  private static int[] b(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    int[] arrayOfInt = new int[arrayOfChar.length];
    for (int i = 0; i < arrayOfInt.length; i++) {
      arrayOfInt[i] = a(arrayOfChar[i]);
    }
    return arrayOfInt;
  }
  
  public static zaif a(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      return new zacs(paramInt3);
    }
    if ((paramArrayOfInt1.length == 1) && (paramArrayOfInt2.length == 1))
    {
      if (paramInt1 == paramInt2) {
        return new zacq(paramInt3, paramArrayOfInt1[0], paramArrayOfInt2[0], (byte)paramInt1);
      }
      return new zacr(paramInt3, paramArrayOfInt1[0], paramArrayOfInt2[0], (byte)paramInt1, (byte)paramInt2);
    }
    int i;
    int j;
    int[] arrayOfInt;
    if (paramArrayOfInt1.length > 7)
    {
      i = paramArrayOfInt1[(paramArrayOfInt1.length - 1)];
      j = paramArrayOfInt1.length - 2;
      if (paramArrayOfInt1[j] == i)
      {
        j--;
        while ((j > 0) && (paramArrayOfInt1[j] == i)) {
          j--;
        }
      }
      j += 2;
      if (j > 7) {
        return new zaco(new zacv(paramInt3, paramArrayOfInt1, paramArrayOfInt2), (byte)paramInt1, (byte)paramInt2);
      }
      arrayOfInt = new int[j];
      System.arraycopy(paramArrayOfInt1, 0, arrayOfInt, 0, j);
      paramArrayOfInt1 = arrayOfInt;
    }
    if (paramArrayOfInt2.length > 7)
    {
      i = paramArrayOfInt2[(paramArrayOfInt2.length - 1)];
      j = paramArrayOfInt2.length - 2;
      if (paramArrayOfInt2[j] == i)
      {
        j--;
        while ((j > 0) && (paramArrayOfInt2[j] == i)) {
          j--;
        }
      }
      j += 2;
      if (j > 7) {
        return new zaco(new zacv(paramInt3, paramArrayOfInt1, paramArrayOfInt2), (byte)paramInt1, (byte)paramInt2);
      }
      arrayOfInt = new int[j];
      System.arraycopy(paramArrayOfInt2, 0, arrayOfInt, 0, j);
      paramArrayOfInt2 = arrayOfInt;
    }
    if (paramInt1 == paramInt2) {
      return new zacq(paramInt3, paramArrayOfInt1, paramArrayOfInt2, (byte)paramInt1);
    }
    return new zacr(paramInt3, paramArrayOfInt1, paramArrayOfInt2, (byte)paramInt1, (byte)paramInt2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */