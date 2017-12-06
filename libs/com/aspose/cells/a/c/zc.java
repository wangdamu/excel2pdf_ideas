package com.aspose.cells.a.c;

import java.lang.reflect.Array;
import java.util.Arrays;

public class zc
{
  public static boolean a(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    return paramObject.getClass().isArray();
  }
  
  public static int a(Object paramObject, int paramInt)
  {
    if (paramInt == 0) {
      return Array.getLength(paramObject);
    }
    return a(Array.get(paramObject, 0), paramInt - 1);
  }
  
  public static int a(Object[][] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return paramArrayOfObject.length - 1;
    }
    if (paramInt == 1) {
      return paramArrayOfObject[0].length - 1;
    }
    throw new IllegalArgumentException("Dimension must be 0 or 1 ");
  }
  
  public static int a(int[][] paramArrayOfInt, int paramInt)
  {
    if (paramInt == 0) {
      return paramArrayOfInt.length - 1;
    }
    if (paramInt == 1) {
      return paramArrayOfInt[0].length - 1;
    }
    throw new IllegalArgumentException("Dimension must be 0 or 1 ");
  }
  
  public static int a(double[][] paramArrayOfDouble, int paramInt)
  {
    if (paramInt == 0) {
      return paramArrayOfDouble.length - 1;
    }
    if (paramInt == 1) {
      return paramArrayOfDouble[0].length - 1;
    }
    throw new IllegalArgumentException("Dimension must be 0 or 1 ");
  }
  
  public static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte)
  {
    Arrays.fill(paramArrayOfByte, paramInt1, paramInt2, paramByte);
  }
  
  public static void a(char[] paramArrayOfChar, int paramInt1, int paramInt2, char paramChar)
  {
    Arrays.fill(paramArrayOfChar, paramInt1, paramInt2, paramChar);
  }
  
  public static void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    Arrays.fill(paramArrayOfInt, paramInt1, paramInt2, paramInt3);
  }
  
  public static void a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, double paramDouble)
  {
    Arrays.fill(paramArrayOfDouble, paramInt1, paramInt2, paramDouble);
  }
  
  public static void a(boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Arrays.fill(paramArrayOfBoolean, paramInt1, paramInt2, paramBoolean);
  }
  
  public static void a(Object[] paramArrayOfObject, int paramInt1, int paramInt2, Object paramObject)
  {
    Arrays.fill(paramArrayOfObject, paramInt1, paramInt2, paramObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */