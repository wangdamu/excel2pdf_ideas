package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.a.c.zd;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.a.c.zw;
import com.aspose.cells.a.c.zx;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zs;
import java.util.HashMap;

public class zbp
{
  private static byte[] a = zw.f();
  private static HashMap b = new HashMap();
  private static Object c = new Object();
  
  public static byte[] a(zg paramzg)
    throws Exception
  {
    String str = c(paramzg);
    byte[] arrayOfByte;
    synchronized (c)
    {
      arrayOfByte = (byte[])b.get(str);
    }
    if (arrayOfByte == null) {
      synchronized (c)
      {
        arrayOfByte = (byte[])b.get(str);
        if (arrayOfByte == null)
        {
          arrayOfByte = b(paramzg);
          b.put(str, arrayOfByte);
        }
      }
    }
    return arrayOfByte;
  }
  
  private static byte[] b(zg paramzg)
    throws Exception
  {
    byte[] arrayOfByte1 = new byte[8];
    System.arraycopy(a, paramzg.d() * 8, arrayOfByte1, 0, 8);
    zd localzd = new zd(8, 8);
    try
    {
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++)
        {
          Color localColor = (arrayOfByte1[i] & 0xFF & 128 >> j) > 0 ? paramzg.c() : paramzg.b();
          localzd.a(j, 7 - i, localColor);
        }
      }
      zh localzh = new zh();
      localzd.a(localzh, 5);
      byte[] arrayOfByte2 = zx.a(localzh, false);
      return arrayOfByte2;
    }
    finally
    {
      if (localzd != null) {
        localzd.a();
      }
    }
  }
  
  private static String c(zg paramzg)
  {
    Integer localInteger = Integer.valueOf(paramzg.d());
    return zs.a(localInteger) + zp.c(paramzg.b().toArgb()) + zp.c(paramzg.c().toArgb());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */