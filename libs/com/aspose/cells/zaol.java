package com.aspose.cells;

import com.aspose.cells.a.e.zf;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class zaol
{
  private zkt a = zks.a(zcke.b, zckh.c);
  private MessageDigest b;
  private byte[] c;
  
  zaol()
  {
    try
    {
      this.b = MessageDigest.getInstance("MD5");
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
  }
  
  void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    zf.a(paramArrayOfByte2.length == 16);
    byte[] arrayOfByte1 = a(paramArrayOfByte1);
    byte[] arrayOfByte2 = new byte[21];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 5);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte2, 5, paramArrayOfByte2.length);
    byte[] arrayOfByte3 = new byte['Ő'];
    for (int i = 0; i < 16; i++) {
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, i * arrayOfByte2.length, arrayOfByte2.length);
    }
    this.c = a(arrayOfByte3);
  }
  
  void b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    zf.a((paramArrayOfByte1.length == 16) && (paramArrayOfByte2.length == 16));
    if (!a(0)) {}
    byte[] arrayOfByte1 = new byte[16];
    byte[] arrayOfByte2 = new byte[16];
    zks.a(this.a, paramArrayOfByte1, 0, 16, arrayOfByte1, 0, arrayOfByte1.length);
    arrayOfByte1 = a(arrayOfByte1);
    zks.a(this.a, paramArrayOfByte2, 0, 16, arrayOfByte2, 0, arrayOfByte2.length);
    if (!zaoy.a(arrayOfByte1, arrayOfByte2, arrayOfByte2.length)) {
      throw new CellsException(2, "Invalid password.");
    }
  }
  
  boolean a(int paramInt)
  {
    byte[] arrayOfByte = new byte[9];
    System.arraycopy(this.c, 0, arrayOfByte, 0, 5);
    arrayOfByte[5] = ((byte)(int)((paramInt & 0xFFFFFFFF) >> 0 & 0xFF));
    arrayOfByte[6] = ((byte)(int)((paramInt & 0xFFFFFFFF) >> 8 & 0xFF));
    arrayOfByte[7] = ((byte)(int)((paramInt & 0xFFFFFFFF) >> 16 & 0xFF));
    arrayOfByte[8] = ((byte)(int)((paramInt & 0xFFFFFFFF) >> 24 & 0xFF));
    arrayOfByte = a(arrayOfByte);
    zckg localzckg = zks.b(this.a, zckf.b, arrayOfByte, 16, null, 0);
    return localzckg == zckg.a;
  }
  
  boolean b(int paramInt)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    int i = paramInt;
    boolean bool = true;
    while ((bool) && (i != 0))
    {
      int j = Math.min(i, arrayOfByte.length);
      bool = a(arrayOfByte, 0, j, arrayOfByte, 0, j);
      i -= j;
    }
    return bool;
  }
  
  boolean a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, int paramInt4)
  {
    zckg localzckg = zks.a(this.a, paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, paramInt3, paramInt4);
    return localzckg == zckg.a;
  }
  
  private byte[] a(byte[] paramArrayOfByte)
  {
    this.b.update(paramArrayOfByte);
    return this.b.digest();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */