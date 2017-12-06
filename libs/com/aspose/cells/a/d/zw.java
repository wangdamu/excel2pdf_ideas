package com.aspose.cells.a.d;

public class zw
{
  public static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1;
    int j = paramInt1 + paramInt2 - 1;
    while (i <= j)
    {
      int k = i + j >> 1;
      int m = paramArrayOfInt[k];
      if (m == paramInt3) {
        return k;
      }
      if (m < paramInt3) {
        i = k + 1;
      } else {
        j = k - 1;
      }
    }
    return i ^ 0xFFFFFFFF;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */