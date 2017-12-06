package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.za;
import java.io.IOException;

class zavu
  extends zm
{
  private long a = 0L;
  private byte[] b;
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  
  public zavu()
    throws Exception
  {
    this(0);
  }
  
  public zavu(int paramInt)
    throws Exception
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("ArgRange_NonNegative\\r\\nParameter name: \"capacity");
    }
    this.b = new byte[paramInt];
    this.c = 0;
    this.d = paramInt;
    this.e = 0;
    this.f = 0;
    this.g = true;
    this.h = true;
    this.i = true;
    this.j = false;
  }
  
  public void a()
  {
    this.j = true;
  }
  
  public void b() {}
  
  private void m()
    throws Exception
  {
    if (this.j) {
      throw new IOException("IO_StreamClosed");
    }
  }
  
  private void n()
    throws Exception
  {
    if (this.j) {
      throw new IOException("IO_StreamClosed");
    }
    if (!this.h) {
      throw new IOException("IO_NotSupp_Write");
    }
  }
  
  private void a(int paramInt)
    throws Exception
  {
    if (!this.g) {
      throw new IOException("IO_FixedCapacity");
    }
    paramInt -= this.c;
    if (paramInt < 256) {
      paramInt = 256;
    }
    if (paramInt < (this.d - this.c) * 2) {
      paramInt = (this.d - this.c) * 2;
    }
    byte[] arrayOfByte = new byte[paramInt];
    if (this.f > this.c) {
      System.arraycopy(this.b, this.c, arrayOfByte, 0, this.f - this.c);
    }
    this.b = arrayOfByte;
    this.d = paramInt;
    this.e -= this.c;
    this.f -= this.c;
    this.c = 0;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    m();
    int k = this.f - this.e;
    if (k > paramInt2) {
      k = paramInt2;
    }
    if (k <= 0) {
      return 0;
    }
    System.arraycopy(this.b, this.e, paramArrayOfByte, paramInt1, k);
    this.e += k;
    return k;
  }
  
  public int c()
    throws Exception
  {
    if (!this.j)
    {
      if (this.e < this.f) {
        return this.b[(this.e++)];
      }
      return -1;
    }
    throw new IOException("IO_StreamClosed");
  }
  
  public long a(long paramLong, int paramInt)
    throws Exception
  {
    m();
    if (paramLong > 2147483647L) {
      throw new IOException("IO_InvalidSeekPosition");
    }
    if (paramInt == 0)
    {
      if (paramLong < 0L) {
        throw new IOException("IO_InvalidSeekPosition");
      }
      try
      {
        this.e = (this.c + (int)paramLong);
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        throw new IOException("IO_InvalidSeekPosition");
      }
    }
    else if (paramInt == 1)
    {
      if (paramLong + this.e < this.c) {
        throw new IOException("IO_InvalidSeekPosition");
      }
      try
      {
        this.e += (int)paramLong;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        throw new IOException("IO_InvalidSeekPosition");
      }
    }
    else if (paramInt == 2)
    {
      if (paramLong + this.f < this.c) {
        throw new IOException("IO_InvalidSeekPosition");
      }
      try
      {
        this.e = (this.f + (int)paramLong);
      }
      catch (NumberFormatException localNumberFormatException3)
      {
        throw new IOException("IO_InvalidSeekPosition");
      }
    }
    else
    {
      throw new IllegalArgumentException("IO_InvalidWhence");
    }
    return this.e;
  }
  
  public void a(long paramLong)
    throws Exception
  {
    if ((this.j) || (!this.h)) {
      throw new IOException("IO_NotSupp_SetLength");
    }
    if ((paramLong < 0L) || (paramLong > Integer.MAX_VALUE - this.c)) {
      throw new IOException("IO_InvalidLength");
    }
    int k = this.c + (int)paramLong;
    if (k > this.d) {
      a(k);
    } else if (k > this.f) {
      za.a(this.b, this.f, k - this.f);
    }
    this.f = k;
    if (this.e > k) {
      this.e = k;
    }
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    n();
    int k = this.e + paramInt2;
    if (k < 0) {
      throw new IOException("IO_WriteFailed");
    }
    if (k > this.f)
    {
      if (k > this.d) {
        a(k);
      } else if (this.e > this.f) {
        za.a(this.b, this.f, this.e - this.f);
      }
      this.f = k;
    }
    System.arraycopy(paramArrayOfByte, paramInt1, this.b, this.e, paramInt2);
    this.e = k;
  }
  
  public void a(byte paramByte)
    throws Exception
  {
    n();
    if (this.e == Integer.MAX_VALUE) {
      throw new IOException("IO_WriteFailed");
    }
    if (this.e >= this.f)
    {
      if (this.e >= this.d) {
        a(this.e + 1);
      } else if (this.e > this.f) {
        za.a(this.b, this.f, this.e - this.f);
      }
      this.f = (this.e + 1);
    }
    this.b[(this.e++)] = paramByte;
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    m();
    if (paramzm == null) {
      throw new IOException("stream");
    }
    paramzm.b(this.b, this.c, this.f - this.c);
  }
  
  public boolean d()
  {
    return !this.j;
  }
  
  public boolean e()
  {
    return !this.j;
  }
  
  public boolean f()
  {
    return (this.h) && (!this.j);
  }
  
  public void b_()
    throws Exception
  {
    this.a += h();
    this.c = 0;
    this.e = 0;
    this.f = 0;
  }
  
  public long h()
    throws Exception
  {
    m();
    return this.f - this.c;
  }
  
  public long i()
    throws Exception
  {
    m();
    return this.a + this.e - this.c;
  }
  
  public void b(long paramLong)
    throws Exception
  {
    m();
    if ((paramLong < 0L) || (paramLong > 2147483647L)) {
      throw new IOException("IO_InvalidSeekPosition");
    }
    try
    {
      this.e = (this.c + (int)paramLong);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new IOException("IO_InvalidSeekPosition");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */