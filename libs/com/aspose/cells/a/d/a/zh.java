package com.aspose.cells.a.d.a;

import java.io.IOException;
import java.io.OutputStream;

public class zh
  extends za
{
  protected zi c;
  int d = 0;
  
  public zh(OutputStream paramOutputStream, int paramInt)
  {
    super(paramOutputStream, true);
    this.c = new zi(paramInt);
  }
  
  protected void a(int paramInt, long paramLong)
    throws IOException
  {
    a(paramInt);
    a(paramLong + 8L);
  }
  
  public void a(zg paramzg)
  {
    this.d += 1;
    int i = paramzg.a();
    if (!this.c.a(i)) {
      throw new RuntimeException(i + " is a invalid tagID.");
    }
    a(true);
    try
    {
      paramzg.a(i, this);
      int j = f();
      int k = (j - b() % j) % j;
      for (int m = 0; m < k; m++) {
        write(0);
      }
      m = b();
      a(false);
      a(i, m);
      a();
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
  
  public int g()
  {
    return this.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */