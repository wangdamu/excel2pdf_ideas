package com.aspose.cells.a.c;

import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.zaux;
import java.io.InputStream;

public class zx
{
  public static byte[] a(String paramString)
  {
    try
    {
      ze localze = null;
      if (zd.c(paramString)) {
        localze = zd.b(paramString);
      }
      if (localze != null) {
        return a(localze, true);
      }
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static void a(zm paramzm1, zm paramzm2)
  {
    try
    {
      if (paramzm1 == null) {
        throw new IllegalArgumentException("srcStream");
      }
      if (paramzm2 == null) {
        throw new IllegalArgumentException("dstStream");
      }
      byte[] arrayOfByte = new byte['က'];
      for (;;)
      {
        int i = paramzm1.a(arrayOfByte, 0, arrayOfByte.length);
        if (i <= 0) {
          break;
        }
        paramzm2.b(arrayOfByte, 0, i);
      }
    }
    catch (Exception localException)
    {
      throw zaux.a(18, "Failed to copy stream", localException);
    }
  }
  
  public static byte[] a(zm paramzm, boolean paramBoolean)
  {
    try
    {
      byte[] arrayOfByte = null;
      if (paramzm.k())
      {
        paramzm.b(0L);
        arrayOfByte = new byte[(int)paramzm.h()];
        paramzm.a(arrayOfByte, 0, (int)paramzm.h());
      }
      else
      {
        zh localzh = new zh();
        a(paramzm, localzh);
        arrayOfByte = localzh.o();
      }
      if (paramBoolean) {
        paramzm.a();
      }
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      throw zaux.a(18, "Failed to read data from stream", localException);
    }
  }
  
  public static zh a(InputStream paramInputStream)
  {
    try
    {
      return new zh(paramInputStream);
    }
    catch (Exception localException)
    {
      throw zaux.a(18, "Failed to read data from InputStream", localException);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */