package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zd;
import com.aspose.cells.a.c.zw;
import com.aspose.cells.a.c.zx;
import com.aspose.cells.b.a.d.zh;

public class zho
{
  public static byte[] a(byte[] paramArrayOfByte)
    throws Exception
  {
    if (e(paramArrayOfByte)) {
      return paramArrayOfByte;
    }
    try
    {
      zd localzd = new zd(paramArrayOfByte);
      try
      {
        byte[] arrayOfByte = a(localzd);
        return arrayOfByte;
      }
      finally
      {
        if (localzd != null) {
          localzd.a();
        }
      }
      return zw.j();
    }
    catch (Exception localException) {}
  }
  
  public static byte[] a(zd paramzd)
    throws Exception
  {
    zh localzh = new zh();
    switch (paramzd.b())
    {
    case 4: 
    case 5: 
    case 8: 
      paramzd.a(localzh, paramzd.b());
      break;
    case 7: 
      paramzd.a(localzh, 5);
      break;
    case 6: 
    default: 
      paramzd.b(localzh, 100);
    }
    return zx.a(localzh, false);
  }
  
  private static boolean e(byte[] paramArrayOfByte)
    throws Exception
  {
    int i = zcc.a(paramArrayOfByte);
    switch (i)
    {
    case 4: 
      return b(paramArrayOfByte);
    case 5: 
      return c(paramArrayOfByte);
    case 8: 
      return d(paramArrayOfByte);
    }
    return false;
  }
  
  public static boolean b(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!a) && (!zcc.d(paramArrayOfByte))) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      zz localzz = new zz(localzh);
      localzz.e();
      for (int i = localzz.e(); ((i & 0xFFFF & 0xFFF0) != 65472) || ((i & 0xFFFF) == 65476) || ((i & 0xFFFF) == 65484); i = localzz.e())
      {
        switch (i)
        {
        case 65504: 
        case 65505: 
        case 65506: 
        case 65517: 
        case 65518: 
          boolean bool = true;
          return bool;
        }
        int j = localzz.e();
        localzh.a((j & 0xFFFF) - 2, 1);
      }
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
    return false;
  }
  
  public static boolean c(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!a) && (!zcc.e(paramArrayOfByte))) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      zz localzz = new zz(localzh);
      int i = 8;
      localzh.b(i);
      Object localObject1 = "";
      Object localObject2 = "";
      int j = 1;
      while (localzh.i() <= localzh.h() - 8L)
      {
        long l = localzz.c();
        String str = new String(localzz.b(4));
        if (j != 0)
        {
          localObject1 = str;
          j = 0;
        }
        localObject2 = str;
        localzh.a((l & 0xFFFFFFFF) + 4L, 1);
      }
      boolean bool = ("IHDR".equals(localObject1)) && ("IEND".equals(localObject2));
      return bool;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static boolean d(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!a) && (!zcc.c(paramArrayOfByte))) {
      throw new AssertionError();
    }
    zhd localzhd = new zhd(paramArrayOfByte);
    return localzhd.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */