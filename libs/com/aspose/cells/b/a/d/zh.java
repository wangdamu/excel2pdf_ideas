package com.aspose.cells.b.a.d;

import com.aspose.cells.b.a.za;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class zh
  extends zm
{
  private byte[] b;
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public int i_()
  {
    return this.e - this.c;
  }
  
  public zh()
  {
    this(0);
  }
  
  public zh(InputStream paramInputStream)
    throws Exception
  {
    this(0);
    for (;;)
    {
      byte[] arrayOfByte = new byte['ࠀ'];
      int k = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      if (k == -1) {
        break;
      }
      b(arrayOfByte, 0, k);
    }
    this.d = 0;
  }
  
  public zh(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("capacity");
    }
    this.b = new byte[paramInt];
    this.f = paramInt;
    this.g = true;
    this.h = true;
    this.i = true;
    this.c = 0;
    this.j = true;
  }
  
  public zh(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, true);
  }
  
  public zh(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("buffer");
    }
    this.b = paramArrayOfByte;
    this.e = (this.f = paramArrayOfByte.length);
    this.h = paramBoolean;
    this.i = true;
    this.c = 0;
    this.j = true;
  }
  
  public zh(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(paramArrayOfByte, paramInt1, paramInt2, true, true);
  }
  
  public zh(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("buffer");
    }
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("index");
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException("count");
    }
    if (paramArrayOfByte.length - paramInt1 < paramInt2) {
      throw new IllegalArgumentException("The buffer length minus index is less than count.");
    }
    this.b = paramArrayOfByte;
    this.c = (this.d = paramInt1);
    this.e = (this.f = paramInt1 + paramInt2);
    this.h = paramBoolean1;
    this.i = paramBoolean2;
    this.g = false;
    this.j = true;
  }
  
  public boolean d()
  {
    return true;
  }
  
  public boolean e()
  {
    return true;
  }
  
  public boolean f()
  {
    return this.h;
  }
  
  public void a()
    throws IOException
  {
    this.h = false;
    this.g = false;
  }
  
  public void b()
    throws Exception
  {}
  
  private boolean c(int paramInt)
    throws IOException
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("value");
    }
    if (paramInt > this.f)
    {
      int k = paramInt;
      if (k < 256) {
        k = 256;
      }
      if (k < this.f << 1) {
        k = this.f << 1;
      }
      b(k);
      return true;
    }
    return false;
  }
  
  public byte[] m()
  {
    if (!this.i) {
      throw new UnsupportedOperationException("UnauthorizedAccess_MemStreamBuffer");
    }
    return this.b;
  }
  
  public int n()
    throws IOException
  {
    if (!this.j) {
      p();
    }
    return this.f - this.c;
  }
  
  public void b(int paramInt)
    throws IOException
  {
    if (!this.j) {
      p();
    }
    if (paramInt != this.f)
    {
      if (!this.g) {
        throw new UnsupportedOperationException("This stream is not expandable.");
      }
      if (paramInt < this.e) {
        throw new IllegalArgumentException("capacity");
      }
      if (paramInt > 0)
      {
        byte[] arrayOfByte = new byte[paramInt];
        if (this.e > 0) {
          System.arraycopy(this.b, 0, arrayOfByte, 0, this.e);
        }
        this.b = arrayOfByte;
      }
      else
      {
        this.b = null;
      }
      this.f = paramInt;
    }
  }
  
  public long h()
    throws IOException
  {
    if (!this.j) {
      p();
    }
    return this.e - this.c;
  }
  
  public long i()
    throws IOException
  {
    if (!this.j) {
      p();
    }
    return this.d - this.c;
  }
  
  public void b(long paramLong)
    throws IOException
  {
    if (!this.j) {
      p();
    }
    if (paramLong < 0L) {
      throw new IllegalArgumentException("length");
    }
    if (paramLong > 2147483647L) {
      throw new IllegalArgumentException("length");
    }
    this.d = (this.c + (int)paramLong);
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
      b(i() + paramLong);
      break;
    case 2: 
      b(h() + paramLong);
      break;
    default: 
      throw new IllegalStateException("Unknown SeekOrigin type.");
    }
    if ((!a) && (this.d < 0)) {
      throw new AssertionError();
    }
    return this.d;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (!this.j) {
      p();
    }
    if (paramArrayOfByte == null) {
      throw new NullPointerException("buffer");
    }
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("offset");
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException("count");
    }
    if (paramArrayOfByte.length - paramInt1 < paramInt2) {
      throw new IllegalArgumentException("The buffer length minus index is less than count.");
    }
    int k = this.e - this.d;
    if (k > paramInt2) {
      k = paramInt2;
    }
    if (k <= 0) {
      return 0;
    }
    if ((!a) && (this.d + k < 0)) {
      throw new AssertionError("_position + n >= 0");
    }
    if (k <= 8)
    {
      int m = k;
      for (;;)
      {
        m--;
        if (m < 0) {
          break;
        }
        paramArrayOfByte[(paramInt1 + m)] = this.b[(this.d + m)];
      }
    }
    else
    {
      System.arraycopy(this.b, this.d, paramArrayOfByte, paramInt1, k);
    }
    this.d += k;
    return k;
  }
  
  public int c()
    throws IOException
  {
    if (!this.j) {
      p();
    }
    if (this.d >= this.e) {
      return -1;
    }
    return this.b[(this.d++)] & 0xFF;
  }
  
  public void a(long paramLong)
    throws IOException
  {
    if (!this.h) {
      q();
    }
    if (paramLong > 2147483647L) {
      throw new IllegalArgumentException("value");
    }
    if ((paramLong < 0L) || (paramLong > Integer.MAX_VALUE - this.c)) {
      throw new IllegalArgumentException("value");
    }
    int k = this.c + (int)paramLong;
    boolean bool = c(k);
    if ((!bool) && (k > this.e)) {
      za.a(this.b, this.e, k - this.e, (byte)0);
    }
    this.e = k;
    if (this.d > k) {
      this.d = k;
    }
  }
  
  public byte[] o()
  {
    byte[] arrayOfByte = new byte[this.e - this.c];
    System.arraycopy(this.b, this.c, arrayOfByte, 0, this.e - this.c);
    return arrayOfByte;
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (!this.j) {
      p();
    }
    if (!this.h) {
      q();
    }
    if (paramArrayOfByte == null) {
      throw new NullPointerException("buffer");
    }
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("offset");
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException("count");
    }
    if (paramArrayOfByte.length - paramInt1 < paramInt2) {
      throw new IllegalArgumentException("Argument_InvalidOffLen");
    }
    int k = this.d + paramInt2;
    if (k < 0) {
      throw new IOException("StreamTooLong");
    }
    int m;
    if (k > this.e)
    {
      m = this.d > this.e ? 1 : 0;
      if (k > this.f)
      {
        boolean bool = c(k);
        if (bool) {
          m = 0;
        }
      }
      if (m != 0) {
        za.a(this.b, this.e, k - this.e, (byte)0);
      }
      this.e = k;
    }
    if (paramInt2 <= 8)
    {
      m = paramInt2;
      for (;;)
      {
        m--;
        if (m < 0) {
          break;
        }
        this.b[(this.d + m)] = paramArrayOfByte[(paramInt1 + m)];
      }
    }
    else
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.b, this.d, paramInt2);
    }
    this.d = k;
  }
  
  public void a(byte paramByte)
    throws IOException
  {
    if (!this.j) {
      p();
    }
    if (!this.h) {
      q();
    }
    if (this.d >= this.e)
    {
      int k = this.d + 1;
      int m = this.d > this.e ? 1 : 0;
      if (k >= this.f)
      {
        boolean bool = c(k);
        if (bool) {
          m = 0;
        }
      }
      if (m != 0) {
        za.a(this.b, this.e, this.d - this.e);
      }
      this.e = k;
    }
    this.b[(this.d++)] = paramByte;
  }
  
  public void a(OutputStream paramOutputStream)
    throws Exception
  {
    paramOutputStream.write(this.b, this.c, this.e - this.c);
    paramOutputStream.flush();
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    if (!this.j) {
      p();
    }
    if (paramzm == null) {
      throw new IllegalArgumentException("stream");
    }
    paramzm.b(this.b, this.c, this.e - this.c);
    paramzm.b();
  }
  
  private void p()
    throws IOException
  {
    throw new IOException("The stream is closed.");
  }
  
  private void q()
  {
    throw new UnsupportedOperationException("The stream does not support write operations.");
  }
  
  public String toString()
  {
    return "";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */