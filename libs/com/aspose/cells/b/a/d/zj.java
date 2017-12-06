package com.aspose.cells.b.a.d;

import java.io.IOException;
import java.io.OutputStream;

public class zj
  extends zm
{
  private OutputStream a;
  private int b = 0;
  
  public zj(OutputStream paramOutputStream)
  {
    this.a = paramOutputStream;
  }
  
  public OutputStream j()
    throws Exception
  {
    return this.a;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long h()
    throws IOException
  {
    return this.b;
  }
  
  public long i()
    throws IOException
  {
    return this.b;
  }
  
  public void b(long paramLong)
    throws IOException
  {}
  
  public long a(long paramLong, int paramInt)
    throws IOException
  {
    return 0L;
  }
  
  public void b()
    throws IOException
  {
    this.a.flush();
  }
  
  public void a()
    throws IOException
  {
    this.a.close();
  }
  
  public void a(long paramLong)
    throws IOException
  {
    throw new UnsupportedOperationException("setLength() is not supported for common java.io.OutputStream.");
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    throw new UnsupportedOperationException("seek() is not supported for common java.io.OutputStream.");
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.write(paramArrayOfByte, paramInt1, paramInt2);
    this.b += paramInt2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */