package com.aspose.cells.b.a.d;

import java.io.IOException;
import java.io.OutputStream;

class zg
  extends OutputStream
{
  zm a;
  
  public zg(zm paramzm)
    throws Exception
  {
    this.a = paramzm;
    this.a.b(0L);
  }
  
  public void write(int b)
    throws IOException
  {
    try
    {
      this.a.a((byte)b);
    }
    catch (Exception localException)
    {
      throw new IOException(localException.getMessage());
    }
  }
  
  public void write(byte[] b, int off, int len)
    throws IOException
  {
    try
    {
      this.a.b(b, off, len);
    }
    catch (Exception localException)
    {
      throw new IOException(localException.getMessage());
    }
  }
  
  public void close()
    throws IOException
  {
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */