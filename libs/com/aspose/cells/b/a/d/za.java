package com.aspose.cells.b.a.d;

import com.aspose.cells.Encoding;

public class za
{
  private zm b;
  private byte[] c;
  private Encoding d = Encoding.getUnicode();
  
  public za(zm paramzm)
  {
    if ((!a) && (paramzm == null)) {
      throw new AssertionError();
    }
    this.b = paramzm;
    this.c = new byte[16];
  }
  
  public za(zm paramzm, Encoding paramEncoding)
  {
    this(paramzm);
    if ((!a) && (paramEncoding == null)) {
      throw new AssertionError();
    }
  }
  
  public zm k()
  {
    return this.b;
  }
  
  public void l()
    throws Exception
  {
    this.b.a();
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    return this.b.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public byte[] f(int paramInt)
    throws Exception
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("count");
    }
    Object localObject = new byte[paramInt];
    int i = 0;
    do
    {
      int j = this.b.a((byte[])localObject, i, paramInt);
      if (j == 0) {
        break;
      }
      i += j;
      paramInt -= j;
    } while (paramInt > 0);
    if (i != localObject.length)
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(localObject, 0, arrayOfByte, 0, i);
      localObject = arrayOfByte;
    }
    return (byte[])localObject;
  }
  
  public byte m()
    throws Exception
  {
    a(1);
    return this.c[0];
  }
  
  public short n()
    throws Exception
  {
    a(2);
    return (short)(this.c[0] & 0xFF | (this.c[1] & 0xFF) << 8);
  }
  
  public boolean o()
    throws Exception
  {
    a(1);
    return this.c[0] != 0;
  }
  
  public int p()
    throws Exception
  {
    return n() & 0xFFFF;
  }
  
  public int q()
    throws Exception
  {
    a(4);
    return this.c[0] & 0xFF | (this.c[1] & 0xFF) << 8 | (this.c[2] & 0xFF) << 16 | (this.c[3] & 0xFF) << 24;
  }
  
  public long r()
    throws Exception
  {
    return q() & 0xFFFFFFFF;
  }
  
  public long s()
    throws Exception
  {
    long l1 = r();
    long l2 = r();
    return l2 << 32 | l1;
  }
  
  public float t()
    throws Exception
  {
    return Float.intBitsToFloat(q());
  }
  
  public double u()
    throws Exception
  {
    return Double.longBitsToDouble(s());
  }
  
  private void a(int paramInt)
    throws Exception
  {
    if ((paramInt <= 0) || (paramInt > this.c.length)) {
      throw new IllegalArgumentException("numBytes");
    }
    int i = 0;
    do
    {
      int j = this.b.a(this.c, i, paramInt - i);
      if (j == 0) {
        throw new IllegalStateException("End of file reached.");
      }
      i += j;
    } while (i < paramInt);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */