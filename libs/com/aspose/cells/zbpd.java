package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.g.a.za;
import com.aspose.cells.b.a.g.a.zb;
import com.aspose.cells.b.a.g.a.zc;
import com.aspose.cells.b.a.g.a.zd;
import com.aspose.cells.b.a.zw;
import java.util.Iterator;

class zbpd
{
  private static com.aspose.cells.b.a.g.a.ze a = new com.aspose.cells.b.a.g.a.ze("&amp;\\#(\\d+);");
  
  static boolean a(String paramString)
  {
    return paramString.equals("Workbook");
  }
  
  static String b(String paramString)
  {
    zd localzd = a.b(paramString);
    Iterator localIterator = localzd.iterator();
    while (localIterator.hasNext())
    {
      zc localzc = (zc)localIterator.next();
      char c = (char)com.aspose.cells.b.a.ze.f(localzc.b().a(1).b());
      paramString = zw.a(paramString, localzc.a(), Character.toString(c));
    }
    return paramString;
  }
  
  static String c(String paramString)
  {
    return zw.a(paramString, "&", "&amp;");
  }
  
  static zh a(zh paramzh)
    throws Exception
  {
    zh localzh = new zh();
    zqj localzqj = new zqj(paramzh);
    byte[] arrayOfByte = new byte[2];
    int j = 0;
    for (;;)
    {
      int i = localzqj.b(arrayOfByte);
      if (localzqj.a())
      {
        localzh.b(0L);
        return localzh;
      }
      if ((j == 0) && ((i & 0xFFFF) == 92))
      {
        a(arrayOfByte, localzqj, localzh);
        j = 1;
      }
      else
      {
        b(arrayOfByte, localzqj, localzh);
      }
    }
  }
  
  private static void a(byte[] paramArrayOfByte, zqj paramzqj, zh paramzh)
    throws Exception
  {
    paramzh.b(paramArrayOfByte, 0, paramArrayOfByte.length);
    byte[] arrayOfByte = new byte[2];
    int i = paramzqj.b(arrayOfByte);
    paramzh.b(arrayOfByte, 0, arrayOfByte.length);
    paramzqj.a(i & 0xFFFF);
  }
  
  private static void b(byte[] paramArrayOfByte, zqj paramzqj, zh paramzh)
    throws Exception
  {
    paramzh.b(paramArrayOfByte, 0, paramArrayOfByte.length);
    byte[] arrayOfByte1 = new byte[2];
    int i = paramzqj.b(arrayOfByte1);
    paramzh.b(arrayOfByte1, 0, arrayOfByte1.length);
    if ((i & 0xFFFF) != 0)
    {
      byte[] arrayOfByte2 = new byte[i];
      paramzqj.a(arrayOfByte2);
      paramzh.b(arrayOfByte2, 0, arrayOfByte2.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */