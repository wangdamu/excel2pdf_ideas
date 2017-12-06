package com.aspose.cells.b.a.d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class zi
  extends zm
{
  private InputStream a;
  private long b = -1L;
  private int c = 0;
  
  public zi(InputStream paramInputStream)
  {
    this.a = paramInputStream;
  }
  
  public zi(InputStream paramInputStream, long paramLong)
  {
    this.a = paramInputStream;
    this.b = paramLong;
  }
  
  public InputStream g()
    throws Exception
  {
    return this.a;
  }
  
  public OutputStream j()
    throws Exception
  {
    return null;
  }
  
  public boolean d()
  {
    return true;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public boolean f()
  {
    return false;
  }
  
  public boolean k()
  {
    return false;
  }
  
  public long h()
    throws IOException
  {
    if (this.b > -1L) {
      return this.b;
    }
    if (this.a.markSupported())
    {
      this.a.mark(Integer.MAX_VALUE);
      this.b = this.c;
      long l = 0L;
      for (;;)
      {
        l = this.a.skip(2147483647L);
        if (l <= 0L) {
          break;
        }
        this.b += l;
      }
      this.a.reset();
      return this.b;
    }
    throw new UnsupportedOperationException("getLength() is not supported for " + this.a.getClass().getName());
  }
  
  public long i()
    throws IOException
  {
    return this.c;
  }
  
  public void b(long paramLong)
    throws IOException
  {
    if (paramLong > this.c)
    {
      long l = 0L;
      while (this.c < paramLong)
      {
        l = this.a.skip(paramLong - this.c);
        if (l <= 0L) {
          throw new IOException("End of stream reached.");
        }
        this.c = ((int)(this.c + l));
      }
    }
    else if (paramLong == this.c)
    {
      return;
    }
    throw new UnsupportedOperationException("Cannot access common java.io.InputStream backward.");
  }
  
  public long a(long paramLong, int paramInt)
    throws IOException
  {
    switch (paramInt)
    {
    case 0: 
      b(paramLong);
      break;
    case 1: 
      b(this.c + paramLong);
      break;
    case 2: 
      b(h() + paramLong);
    }
    return this.c;
  }
  
  public void b()
    throws IOException
  {
    throw new UnsupportedOperationException("flush() is not supported for common java.io.InputStream.");
  }
  
  public void a()
    throws IOException
  {
    this.a.close();
  }
  
  public void a(long paramLong)
    throws IOException
  {
    throw new UnsupportedOperationException("setLength() is not supported for common java.io.InputStream.");
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = 0;
    while (i < paramInt2)
    {
      int j = this.a.read(paramArrayOfByte, paramInt1, paramInt2 - i);
      if (j <= 0) {
        break;
      }
      i += j;
      paramInt1 += j;
    }
    this.c += i;
    return i;
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    throw new UnsupportedOperationException("write() is not supported for common java.io.InputStream.");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */