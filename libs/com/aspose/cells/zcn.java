package com.aspose.cells;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

class zcn
{
  protected static final byte[] a = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  protected static final byte[] b = new byte['Ā'];
  
  public static byte[] a(String paramString1, String paramString2)
    throws UnsupportedEncodingException
  {
    return a(paramString1.getBytes(paramString2));
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    int j = paramArrayOfByte.length;
    int i;
    if ((i = j % 4) != 0) {
      j += 4 - i;
    }
    j = j * 3 / 4;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(j);
    try
    {
      a(localByteArrayInputStream, localByteArrayOutputStream, false);
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  private static final int a(InputStream paramInputStream, boolean paramBoolean)
    throws IOException
  {
    int j = 0;
    int i;
    do
    {
      i = paramInputStream.read();
      if (i == -1) {
        return -1;
      }
      i = b[((byte)i)];
      if ((paramBoolean) && ((i == -1) || ((j > 0) && (i > -1)))) {
        throw new IOException("Unexpected character");
      }
      if (i == -3) {
        j++;
      }
    } while (i <= -1);
    return i;
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean)
    throws IOException
  {
    int[] arrayOfInt = new int[4];
    int i = 0;
    while ((i == 0) && ((arrayOfInt[0] = a(paramInputStream, paramBoolean)) != -1) && ((arrayOfInt[1] = a(paramInputStream, paramBoolean)) != -1))
    {
      arrayOfInt[2] = a(paramInputStream, paramBoolean);
      arrayOfInt[3] = a(paramInputStream, paramBoolean);
      paramOutputStream.write(arrayOfInt[0] << 2 | arrayOfInt[1] >> 4);
      if (arrayOfInt[2] != -1)
      {
        paramOutputStream.write(arrayOfInt[1] << 4 | arrayOfInt[2] >> 2);
        if (arrayOfInt[3] != -1) {
          paramOutputStream.write(arrayOfInt[2] << 6 | arrayOfInt[3]);
        } else {
          i = 1;
        }
      }
      else
      {
        i = 1;
      }
    }
    paramOutputStream.flush();
  }
  
  static
  {
    for (int i = 0; i < b.length; i++) {
      b[i] = -1;
    }
    for (i = 0; i < a.length; i = (byte)(i + 1)) {
      b[a[i]] = i;
    }
    b[32] = -2;
    b[10] = -2;
    b[13] = -2;
    b[9] = -2;
    b[12] = -2;
    b[61] = -3;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */