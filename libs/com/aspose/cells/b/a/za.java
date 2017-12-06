package com.aspose.cells.b.a;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.zo;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public final class za
{
  public static void a(double[] paramArrayOfDouble)
  {
    Arrays.sort(paramArrayOfDouble);
  }
  
  public static void a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    Arrays.sort(paramArrayOfInt, paramInt1, paramInt1 + paramInt2);
  }
  
  public static void a(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    Arrays.sort(paramArrayOfDouble, paramInt1, paramInt1 + paramInt2);
  }
  
  public static void a(Object[] paramArrayOfObject, int paramInt1, int paramInt2, Comparator paramComparator)
  {
    Arrays.sort(paramArrayOfObject, paramInt1, paramInt1 + paramInt2, paramComparator);
  }
  
  public static void a(Object[] paramArrayOfObject, Comparator paramComparator)
  {
    Arrays.sort(paramArrayOfObject, paramComparator);
  }
  
  public static int a(int[] paramArrayOfInt, int paramInt)
  {
    return Arrays.binarySearch(paramArrayOfInt, paramInt);
  }
  
  public static int a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, double paramDouble)
  {
    if ((paramInt1 == 0) && (paramInt2 == paramArrayOfDouble.length)) {
      return Arrays.binarySearch(paramArrayOfDouble, paramDouble);
    }
    paramInt2 += paramInt1;
    while (paramInt1 < paramInt2)
    {
      if (paramArrayOfDouble[paramInt1] == paramDouble) {
        return paramInt1;
      }
      if (paramArrayOfDouble[paramInt1] > paramDouble) {
        return -paramInt1 - 1;
      }
      paramInt1++;
    }
    return -paramInt2 - 1;
  }
  
  public static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == 0) && (paramInt2 == paramArrayOfInt.length)) {
      return Arrays.binarySearch(paramArrayOfInt, paramInt3);
    }
    paramInt2 += paramInt1;
    while (paramInt1 < paramInt2)
    {
      if (paramArrayOfInt[paramInt1] == paramInt3) {
        return paramInt1;
      }
      if (paramArrayOfInt[paramInt1] > paramInt3) {
        return -paramInt1 - 1;
      }
      paramInt1++;
    }
    return -paramInt2 - 1;
  }
  
  public static int a(long[] paramArrayOfLong, int paramInt1, int paramInt2, long paramLong)
  {
    if ((paramInt1 == 0) && (paramInt2 == paramArrayOfLong.length)) {
      return Arrays.binarySearch(paramArrayOfLong, paramLong);
    }
    paramInt2 += paramInt1;
    while (paramInt1 < paramInt2)
    {
      if (paramArrayOfLong[paramInt1] == paramLong) {
        return paramInt1;
      }
      if (paramArrayOfLong[paramInt1] > paramLong) {
        return -paramInt1 - 1;
      }
      paramInt1++;
    }
    return -paramInt2 - 1;
  }
  
  public static int[] a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      return null;
    }
    int[] arrayOfInt = new int[paramArrayOfInt.length];
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      arrayOfInt[i] = paramArrayOfInt[i];
    }
    return arrayOfInt;
  }
  
  public static double[] b(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {
      return null;
    }
    double[] arrayOfDouble = new double[paramArrayOfDouble.length];
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      arrayOfDouble[i] = paramArrayOfDouble[i];
    }
    return arrayOfDouble;
  }
  
  public static float[] a(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null) {
      return null;
    }
    float[] arrayOfFloat = new float[paramArrayOfFloat.length];
    for (int i = 0; i < paramArrayOfFloat.length; i++) {
      arrayOfFloat[i] = paramArrayOfFloat[i];
    }
    return arrayOfFloat;
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte[i] = paramArrayOfByte[i];
    }
    return arrayOfByte;
  }
  
  public static zo[] a(zo[] paramArrayOfzo)
  {
    if (paramArrayOfzo == null) {
      return null;
    }
    zo[] arrayOfzo = new zo[paramArrayOfzo.length];
    for (int i = 0; i < paramArrayOfzo.length; i++) {
      arrayOfzo[i] = paramArrayOfzo[i];
    }
    return arrayOfzo;
  }
  
  public static Color[] a(Color[] paramArrayOfColor)
  {
    if (paramArrayOfColor == null) {
      return null;
    }
    Color[] arrayOfColor = new Color[paramArrayOfColor.length];
    for (int i = 0; i < paramArrayOfColor.length; i++) {
      arrayOfColor[i] = paramArrayOfColor[i];
    }
    return arrayOfColor;
  }
  
  public static Object a(Object paramObject, int paramInt)
  {
    return Array.get(paramObject, paramInt);
  }
  
  public static Object a(Object[] paramArrayOfObject, int paramInt)
  {
    return paramArrayOfObject[paramInt];
  }
  
  public static int a(Object[] paramArrayOfObject, Object paramObject, int paramInt1, int paramInt2)
  {
    if (paramArrayOfObject == null) {
      throw new NullPointerException("array");
    }
    if ((paramInt1 < 0) || (paramInt1 > paramArrayOfObject.length)) {
      throw new IndexOutOfBoundsException("startIndex");
    }
    int i = paramInt1 + paramInt2;
    if ((paramInt2 < 0) || (i > paramArrayOfObject.length)) {
      throw new IndexOutOfBoundsException("count");
    }
    int j;
    if (paramObject == null) {
      for (j = paramInt1; j < i; j++) {
        if (paramArrayOfObject[j] == null) {
          return j;
        }
      }
    } else {
      for (j = paramInt1; j < i; j++) {
        if (paramObject.equals(paramArrayOfObject[j])) {
          return j;
        }
      }
    }
    return -1;
  }
  
  public static void a(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      throw new NullPointerException("array");
    }
    int i = 0;
    int j = paramArrayOfObject.length;
    if ((i < 0) || (j < 0)) {
      throw new IndexOutOfBoundsException(i < 0 ? "index" : "length");
    }
    if (paramArrayOfObject.length - i < j) {
      throw new IndexOutOfBoundsException("length");
    }
    int k = i;
    for (int m = i + j - 1; k < m; m--)
    {
      Object localObject = paramArrayOfObject[k];
      paramArrayOfObject[k] = paramArrayOfObject[m];
      paramArrayOfObject[m] = localObject;
      k++;
    }
  }
  
  public static void a(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {
      throw new NullPointerException("array");
    }
    int i = 0;
    int j = paramArrayOfChar.length;
    if ((i < 0) || (j < 0)) {
      throw new IndexOutOfBoundsException(i < 0 ? "index" : "length");
    }
    if (paramArrayOfChar.length - i < j) {
      throw new IndexOutOfBoundsException("length");
    }
    int k = i;
    for (int m = i + j - 1; k < m; m--)
    {
      int n = paramArrayOfChar[k];
      paramArrayOfChar[k] = paramArrayOfChar[m];
      paramArrayOfChar[m] = n;
      k++;
    }
  }
  
  public static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Arrays.fill(paramArrayOfByte, paramInt1, paramInt1 + paramInt2, (byte)0);
  }
  
  public static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte)
  {
    Arrays.fill(paramArrayOfByte, paramInt1, paramInt1 + paramInt2, paramByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */