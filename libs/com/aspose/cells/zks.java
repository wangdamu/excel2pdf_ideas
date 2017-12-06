package com.aspose.cells;

import com.aspose.cells.a.e.zf;

class zks
{
  public static zkt a(zcke paramzcke, zckh paramzckh)
  {
    zkt localzkt = null;
    if (paramzcke == zcke.b) {
      localzkt = a(paramzckh);
    } else {
      zf.a(false);
    }
    return localzkt;
  }
  
  public static zckg a(zkt paramzkt, zckf paramzckf, byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2)
  {
    zkt localzkt = paramzkt;
    if (localzkt == null) {
      return zckg.b;
    }
    return c(paramzkt, paramzckf, paramArrayOfByte1, paramInt1, paramArrayOfByte2, paramInt2);
  }
  
  public static zckg b(zkt paramzkt, zckf paramzckf, byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2)
  {
    zkt localzkt = paramzkt;
    if (localzkt == null) {
      return zckg.b;
    }
    return d(paramzkt, paramzckf, paramArrayOfByte1, paramInt1, paramArrayOfByte2, paramInt2);
  }
  
  public static zckg a(zkt paramzkt, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, int paramInt4)
  {
    zkt localzkt = paramzkt;
    if (localzkt == null) {
      return zckg.b;
    }
    return c(paramzkt, paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, paramInt3, paramInt4);
  }
  
  public static zckg b(zkt paramzkt, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, int paramInt4)
  {
    zkt localzkt = paramzkt;
    if (localzkt == null) {
      return zckg.b;
    }
    return d(paramzkt, paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, paramInt3, paramInt4);
  }
  
  private static zkt a(zckh paramzckh)
  {
    zkt localzkt = null;
    if (paramzckh != zckh.c) {
      return null;
    }
    localzkt = new zkt();
    localzkt.a.a = zcke.b;
    localzkt.a.b = zckf.d;
    localzkt.a.c = zckh.c;
    return localzkt;
  }
  
  private static zckg c(zkt paramzkt, zckf paramzckf, byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2)
  {
    zkt localzkt = paramzkt;
    if ((localzkt == null) || (paramArrayOfByte1 == null)) {
      return zckg.b;
    }
    if (localzkt.a.a != zcke.b) {
      return zckg.c;
    }
    if (paramzckf != zckf.d) {
      localzkt.a.b = paramzckf;
    } else {
      return zckg.d;
    }
    return a(localzkt.b, paramArrayOfByte1, paramInt1, paramArrayOfByte2, paramInt2);
  }
  
  private static zckg a(znr paramznr, byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2)
  {
    int[] arrayOfInt1 = new int['Ā'];
    int[] arrayOfInt2 = paramznr.a;
    for (int i = 0; i < 256; i++) {
      arrayOfInt2[i] = i;
    }
    int k = 0;
    for (i = 0; i < 256; i += 16) {
      for (int j = 0; j < 16; j++)
      {
        k = (k + arrayOfInt2[(i + j)] + (paramArrayOfByte1[j] & 0xFF)) % 256;
        int m = arrayOfInt2[(i + j)];
        arrayOfInt2[(i + j)] = arrayOfInt2[k];
        arrayOfInt2[k] = m;
      }
    }
    paramznr.b = 0;
    paramznr.c = 0;
    return zckg.a;
  }
  
  private static zckg d(zkt paramzkt, zckf paramzckf, byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2)
  {
    zkt localzkt = paramzkt;
    if ((localzkt == null) || (paramArrayOfByte1 == null)) {
      return zckg.b;
    }
    if (localzkt.a.a != zcke.b) {
      return zckg.c;
    }
    if (paramzckf != zckf.d) {
      localzkt.a.b = paramzckf;
    } else {
      return zckg.d;
    }
    return b(localzkt.b, paramArrayOfByte1, paramInt1, paramArrayOfByte2, paramInt2);
  }
  
  private static zckg b(znr paramznr, byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2)
  {
    int[] arrayOfInt1 = new int['Ā'];
    int[] arrayOfInt2 = paramznr.a;
    for (int j = 0; j < 256; j++) {
      arrayOfInt2[j] = j;
    }
    int i = 0;
    int n = 256;
    while (n > paramInt1)
    {
      for (i1 = 0; i1 < paramInt1; i1++) {
        arrayOfInt1[(i + i1)] = paramArrayOfByte1[i1];
      }
      i += paramInt1;
      n -= paramInt1;
    }
    for (int i1 = 0; i1 < n; i1++) {
      arrayOfInt1[(i + i1)] = paramArrayOfByte1[i1];
    }
    j = 0;
    int k = 0;
    while (j < 256)
    {
      k = (k + (arrayOfInt2[j] & 0xFF) + (arrayOfInt1[j] & 0xFF)) % 256;
      int m = arrayOfInt2[j];
      arrayOfInt2[j] = arrayOfInt2[k];
      arrayOfInt2[k] = m;
      j++;
    }
    paramznr.b = 0;
    paramznr.c = 0;
    return zckg.a;
  }
  
  private static zckg c(zkt paramzkt, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, int paramInt4)
  {
    zkt localzkt = paramzkt;
    if (localzkt == null) {
      return zckg.b;
    }
    if (localzkt.a.a != zcke.b) {
      return zckg.c;
    }
    if (localzkt.a.b == zckf.d) {
      return zckg.d;
    }
    return a(localzkt.b, paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, paramInt3, paramInt4);
  }
  
  private static zckg a(znr paramznr, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, int paramInt4)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null)) {
      return zckg.b;
    }
    if ((0 >= paramInt2) || (paramInt2 > paramInt4)) {
      return zckg.f;
    }
    int[] arrayOfInt = paramznr.a;
    for (int m = 0; m < paramInt2; m++)
    {
      int i = paramznr.b;
      int j = paramznr.c;
      i = (i + 1) % 256;
      j = (j + arrayOfInt[i]) % 256;
      paramznr.b = i;
      paramznr.c = j;
      int k = arrayOfInt[i];
      arrayOfInt[i] = arrayOfInt[j];
      arrayOfInt[j] = k;
      k = (arrayOfInt[i] + arrayOfInt[j]) % 256;
      paramArrayOfByte2[(paramInt3 + m)] = ((byte)(paramArrayOfByte1[(paramInt1 + m)] ^ (byte)(arrayOfInt[k] & 0xFF)));
    }
    return zckg.a;
  }
  
  private static zckg d(zkt paramzkt, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, int paramInt4)
  {
    zkt localzkt = paramzkt;
    if (localzkt == null) {
      return zckg.b;
    }
    if (localzkt.a.a != zcke.b) {
      return zckg.c;
    }
    if (localzkt.a.b == zckf.d) {
      return zckg.d;
    }
    return a(localzkt.b, paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, paramInt3, paramInt4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */