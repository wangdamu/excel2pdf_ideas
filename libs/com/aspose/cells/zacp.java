package com.aspose.cells;

abstract class zacp
  implements zaif
{
  private int a;
  
  public zacp(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = a(paramInt1, 0, 0);
    for (int j = 28; j > 1; j -= 4)
    {
      i = a(paramInt3, j, i);
      i = a(paramInt2, j - 2, i);
    }
    this.a = i;
  }
  
  public zacp(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i = a(paramInt, 0, 0);
    int j = 2;
    int k = 64;
    int m = 64;
    for (int n = 0; n < 7; n++)
    {
      if (n < paramArrayOfInt1.length) {
        k = paramArrayOfInt1[n];
      }
      i = a(k, j, i);
      j += 2;
      if (n < paramArrayOfInt2.length) {
        m = paramArrayOfInt2[n];
      }
      i = a(m, j, i);
      j += 2;
    }
    this.a = i;
  }
  
  public int a()
  {
    return c(0);
  }
  
  public int a(int paramInt)
  {
    return c((paramInt < 7 ? paramInt : 6) * 4 + 2);
  }
  
  public int b(int paramInt)
  {
    return c((paramInt < 7 ? paramInt : 6) * 4 + 4);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt1)
    {
    case 96: 
      paramInt3 |= 2 << paramInt2;
      break;
    case 32: 
      paramInt3 |= 1 << paramInt2;
    }
    return paramInt3;
  }
  
  private int c(int paramInt)
  {
    switch ((this.a & 3 << paramInt) >> paramInt)
    {
    case 0: 
      return 64;
    case 2: 
      return 96;
    }
    return 32;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */