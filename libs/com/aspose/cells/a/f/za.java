package com.aspose.cells.a.f;

import com.aspose.cells.zaux;
import java.util.Iterator;

abstract class za
  implements zc
{
  protected String[] a;
  protected long[] b;
  
  public int a()
  {
    return this.a.length;
  }
  
  public zh a(int paramInt)
  {
    zh localzh = new zh(this.a[paramInt]);
    localzh.a(false);
    localzh.a(b(paramInt));
    localzh.a(null);
    return localzh;
  }
  
  public Iterator<zh> b()
  {
    return new zb(this);
  }
  
  protected void a(long paramLong)
  {
    if (paramLong > 2147483647L) {
      throw zaux.a(10, "File size exceeds limit of Java array: " + paramLong);
    }
  }
  
  public long a(String paramString)
    throws Exception
  {
    int i = b(paramString);
    if (i < 0) {
      return -1L;
    }
    return b(i);
  }
  
  public long b(int paramInt)
  {
    return this.b[paramInt];
  }
  
  protected int b(String paramString)
  {
    if (paramString.charAt(0) == '/') {
      paramString = paramString.substring(1);
    }
    for (int i = 0; i < this.a.length; i++) {
      if (paramString.equalsIgnoreCase(this.a[i])) {
        return i;
      }
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/f/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */