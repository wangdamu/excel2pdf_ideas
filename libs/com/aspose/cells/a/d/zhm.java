package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.a.c.zx;
import com.aspose.cells.b.a.d.zk;

public class zhm
{
  public static zdm a(zgw paramzgw, String paramString)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    byte[] arrayOfByte;
    try
    {
      paramzgw.a(localzh, true, false);
      arrayOfByte = zx.a(localzh, false);
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
    return a(arrayOfByte, paramString);
  }
  
  private static zdm a(byte[] paramArrayOfByte, String paramString)
    throws Exception
  {
    byte[] arrayOfByte = b(paramArrayOfByte, paramString);
    zdm localzdm = new zdm(paramString, "application/vnd.ms-package.obfuscated-opentype");
    localzdm.d().b(arrayOfByte, 0, arrayOfByte.length);
    return localzdm;
  }
  
  private static byte[] b(byte[] paramArrayOfByte, String paramString)
    throws Exception
  {
    byte[] arrayOfByte = a(paramString);
    for (int i = 0; i < 32; i++)
    {
      int j = arrayOfByte.length - i % arrayOfByte.length - 1;
      int tmp26_25 = i;
      paramArrayOfByte[tmp26_25] = ((byte)(paramArrayOfByte[tmp26_25] ^ arrayOfByte[j]));
    }
    return paramArrayOfByte;
  }
  
  private static byte[] a(String paramString)
    throws Exception
  {
    String str1 = zk.c(paramString);
    String str2 = new com.aspose.cells.b.a.zh(str1).a("N");
    byte[] arrayOfByte = new byte[16];
    for (int i = 0; i < arrayOfByte.length; i++) {
      arrayOfByte[i] = ((byte)zp.c(str2.substring(i * 2, i * 2 + 2)));
    }
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */