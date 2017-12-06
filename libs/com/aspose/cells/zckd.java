package com.aspose.cells;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class zckd
{
  static byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    zckb localzckb = new zckb(localByteArrayOutputStream, 9);
    try
    {
      localzckb.write(paramArrayOfByte, 0, paramArrayOfByte.length);
      localzckb.close();
    }
    catch (IOException localIOException)
    {
      throw new CellsException(18, "Failed to read image data", localIOException);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  static byte[] a(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte, int paramInt4)
  {
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    zcka localzcka = new zcka(localByteArrayInputStream);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte1 = new byte['Ȁ'];
    try
    {
      for (i = localzcka.a(arrayOfByte1, 0, arrayOfByte1.length); i > -1; i = localzcka.a(arrayOfByte1, 0, arrayOfByte1.length)) {
        localByteArrayOutputStream.write(arrayOfByte1, 0, i);
      }
    }
    catch (IOException localIOException)
    {
      throw new CellsException(18, "Failed to read image data", localIOException);
    }
    int i = 0;
    if (paramBoolean1) {
      i = 22;
    } else if (paramBoolean2) {
      i = 512;
    }
    Object localObject = localByteArrayOutputStream.toByteArray();
    if (paramBoolean1)
    {
      byte[] arrayOfByte2 = new byte[i + localObject.length];
      System.arraycopy(localObject, 0, arrayOfByte2, 22, localObject.length);
      localObject = arrayOfByte2;
      zamp.a(arrayOfByte2, 0, -1698247209);
      int j = 22289;
      int k = Math.round(paramInt1 * paramInt3 / 96.0F);
      zamp.b(arrayOfByte2, 10, k);
      j ^= k;
      k = Math.round(paramInt2 * paramInt3 / 96.0F);
      zamp.b(arrayOfByte2, 12, k);
      j ^= k;
      k = paramInt3;
      zamp.b(arrayOfByte2, 14, k);
      j ^= k;
      zamp.b(arrayOfByte2, 20, j);
    }
    return (byte[])localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zckd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */