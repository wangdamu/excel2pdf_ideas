package com.aspose.cells.b.a.d;

import java.io.IOException;
import java.io.InputStream;

class zf
  extends InputStream
{
  private boolean b = true;
  zm a;
  
  public zf(zm paramzm)
    throws Exception
  {
    this(paramzm, true);
  }
  
  public zf(zm paramzm, boolean paramBoolean)
    throws Exception
  {
    this.a = paramzm;
    this.a.b(0L);
    this.b = paramBoolean;
  }
  
  public int read()
    throws IOException
  {
    try
    {
      return this.a.c();
    }
    catch (Exception localException)
    {
      throw new IOException(localException.getMessage());
    }
  }
  
  public int read(byte[] b, int off, int len)
    throws IOException
  {
    try
    {
      int i = this.a.a(b, off, len);
      return i == 0 ? -1 : i;
    }
    catch (Exception localException1)
    {
      throw new IOException(localException1.getMessage());
    }
  }
  
  public long skip(long n)
    throws IOException
  {
    try
    {
      long l1 = this.a.i();
      long l2 = this.a.a(n, 1);
      return l2 - l1;
    }
    catch (Exception localException1)
    {
      throw new IOException(localException1.getMessage());
    }
  }
  
  public int available()
    throws IOException
  {
    try
    {
      return (int)(this.a.h() - this.a.i());
    }
    catch (Exception localException)
    {
      throw new IOException(localException.getMessage());
    }
  }
  
  public void close()
    throws IOException
  {
    if (!this.b) {
      return;
    }
    try
    {
      this.a.a();
    }
    catch (Exception localException)
    {
      throw new IOException(localException.getMessage());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */