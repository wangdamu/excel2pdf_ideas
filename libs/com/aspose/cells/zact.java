package com.aspose.cells;

class zact
  implements zaif
{
  private int a;
  private byte b;
  private byte c;
  
  public zact(int paramInt1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, byte paramByte1, byte paramByte2, int paramInt2)
  {
    int i = paramInt2 - 2;
    i = a(paramInt1, 2, i);
    int j = 4;
    int k = 64;
    for (int m = 0; m < 6; m++)
    {
      if (m < paramArrayOfInt1.length) {
        k = paramArrayOfInt1[m];
      } else {
        k = paramArrayOfInt1[(paramArrayOfInt1.length - (paramInt2 - (m - paramArrayOfInt1.length) % paramInt2))];
      }
      i = a(k, j, i);
      j += 2;
      if (m < paramArrayOfInt2.length) {
        k = paramArrayOfInt2[m];
      } else {
        k = paramArrayOfInt2[(paramArrayOfInt2.length - (paramInt2 - (m - paramArrayOfInt2.length) % paramInt2))];
      }
      i = a(k, j, i);
      j += 2;
    }
    this.a = i;
    this.b = paramByte1;
    this.c = paramByte2;
  }
  
  public int a()
  {
    return c(2);
  }
  
  public int a(int paramInt)
  {
    if (paramInt >= 6)
    {
      int i = (this.a & 0x3) + 2;
      paramInt = 6 - (i - (paramInt - 6) % i);
    }
    return c(paramInt * 4 + 4);
  }
  
  public int b(int paramInt)
  {
    if (paramInt >= 6)
    {
      int i = (this.a & 0x3) + 2;
      paramInt = 6 - (i - (paramInt - 6) % i);
    }
    return c(paramInt * 4 + 6);
  }
  
  public int b()
  {
    return this.c & 0xFF & 0xFF;
  }
  
  public int c()
  {
    return this.b & 0xFF & 0xFF;
  }
  
  public boolean d()
  {
    return false;
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zact.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */