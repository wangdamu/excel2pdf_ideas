package com.aspose.cells.b.a.d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class zm
{
  public abstract boolean d()
    throws Exception;
  
  public abstract boolean e()
    throws Exception;
  
  public abstract boolean f()
    throws Exception;
  
  public abstract long h()
    throws Exception;
  
  public abstract long i()
    throws Exception;
  
  public abstract void b(long paramLong)
    throws Exception;
  
  public abstract long a(long paramLong, int paramInt)
    throws Exception;
  
  public abstract void b()
    throws Exception;
  
  public abstract void a()
    throws Exception;
  
  public abstract void a(long paramLong)
    throws Exception;
  
  public abstract int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception;
  
  public abstract void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception;
  
  public InputStream g()
    throws Exception
  {
    return new zf(this);
  }
  
  public OutputStream j()
    throws Exception
  {
    return new zg(this);
  }
  
  public void g_()
    throws IOException
  {}
  
  public boolean k()
  {
    return true;
  }
  
  public int c()
    throws Exception
  {
    throw new IllegalStateException("You must override the method in child classes.");
  }
  
  public void a(byte paramByte)
    throws Exception
  {
    throw new IllegalStateException("You must override the method in child classes.");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */