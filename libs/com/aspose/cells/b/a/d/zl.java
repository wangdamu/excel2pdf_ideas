package com.aspose.cells.b.a.d;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UTFDataFormatException;

public class zl
  implements DataInput, DataOutput
{
  protected RandomAccessFile a;
  protected long b;
  protected byte[] c;
  protected long d;
  protected long e;
  protected int f;
  protected boolean g;
  protected int h;
  boolean i = false;
  private String j;
  
  public zl(String paramString1, String paramString2)
    throws IOException
  {
    this(paramString1, paramString2, 4096);
  }
  
  public zl(String paramString1, String paramString2, int paramInt)
    throws IOException
  {
    this(paramString1, "rw".equals(paramString2) ? 3 : "r".equals(paramString2) ? 1 : 0, paramInt);
  }
  
  public zl(File paramFile, String paramString)
    throws IOException
  {
    this(paramFile.getPath(), paramString);
  }
  
  public zl(String paramString, int paramInt1, int paramInt2)
    throws FileNotFoundException, IOException
  {
    this.h = paramInt1;
    paramInt1 |= 0x1;
    if ((this.h & 0x4) > 0) {
      this.h |= 0x2;
    }
    File localFile = new File(paramString);
    if (((this.h & 0x2) > 0) && (!localFile.exists())) {
      paramInt1 |= 0x4;
    }
    if (((this.h & 0x4) > 0) && (localFile.exists()) && (!localFile.delete())) {
      throw new IOException("Failed to delete " + paramString);
    }
    if ((this.h == 1) && (!new File(paramString).exists())) {
      throw new FileNotFoundException(paramString);
    }
    String str = (this.h & 0x2) > 0 ? "rw" : "r";
    this.a = new RandomAccessFile(paramString, str);
    this.d = 0L;
    this.e = 0L;
    this.f = 0;
    this.b = 0L;
    this.c = new byte[paramInt2];
    this.g = false;
    this.j = paramString;
  }
  
  public String a()
  {
    return this.j;
  }
  
  public void b()
    throws IOException
  {
    if (this.a == null) {
      return;
    }
    if (((this.h | 0x2) > 0) && (this.i))
    {
      this.a.seek(this.d);
      this.a.write(this.c, 0, this.f);
    }
    this.a.close();
    this.a = null;
    this.c = null;
  }
  
  public void a(long paramLong)
    throws IOException
  {
    if ((paramLong >= this.d) && (paramLong < this.e))
    {
      this.b = paramLong;
      return;
    }
    if (this.i) {
      e();
    }
    this.d = paramLong;
    this.b = paramLong;
    this.f = a(paramLong, this.c, 0, this.c.length);
    if (this.f < 0)
    {
      this.f = 0;
      this.g = true;
    }
    else
    {
      this.g = false;
    }
    this.e = (this.d + this.f);
  }
  
  public long c()
    throws IOException
  {
    return this.b;
  }
  
  public long d()
    throws IOException
  {
    long l = this.a.length();
    if (l < this.e) {
      return this.e;
    }
    return l;
  }
  
  public void b(long paramLong)
    throws IOException
  {
    if (this.i) {
      e();
    }
    this.a.setLength(paramLong);
    if (this.b > paramLong) {
      a(paramLong);
    }
  }
  
  public void e()
    throws IOException
  {
    if (this.i)
    {
      this.a.seek(this.d);
      this.a.write(this.c, 0, this.f);
      this.i = false;
    }
  }
  
  public final int f()
    throws IOException
  {
    if (this.b < this.e) {
      return this.c[((int)(this.b++ - this.d))] & 0xFF;
    }
    if (this.g) {
      return -1;
    }
    a(this.b);
    return f();
  }
  
  private int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (this.g) {
      return -1;
    }
    int k = (int)(this.e - this.b);
    if (k < 1)
    {
      a(this.b);
      return c(paramArrayOfByte, paramInt1, paramInt2);
    }
    int m = k >= paramInt2 ? paramInt2 : k;
    System.arraycopy(this.c, (int)(this.b - this.d), paramArrayOfByte, paramInt1, m);
    this.b += m;
    if (m < paramInt2)
    {
      int n = paramInt2 - m;
      if (n > this.c.length)
      {
        n = a(this.b, paramArrayOfByte, paramInt1 + m, paramInt2 - m);
      }
      else
      {
        a(this.b);
        if (!this.g)
        {
          n = n > this.f ? this.f : n;
          System.arraycopy(this.c, 0, paramArrayOfByte, paramInt1 + m, n);
        }
        else
        {
          n = -1;
        }
      }
      if (n > 0)
      {
        this.b += n;
        return m + n;
      }
    }
    return m;
  }
  
  protected int a(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.seek(paramLong);
    int k = this.a.read(paramArrayOfByte, paramInt1, paramInt2);
    return k;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    return c(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void readFully(byte[] b)
    throws IOException
  {
    readFully(b, 0, b.length);
  }
  
  public final void readFully(byte[] b, int off, int len)
    throws IOException
  {
    int k = 0;
    while (k < len)
    {
      int m = a(b, off + k, len - k);
      if (m < 0) {
        throw new EOFException();
      }
      k += m;
    }
  }
  
  public int skipBytes(int n)
    throws IOException
  {
    a(c() + n);
    return n;
  }
  
  public final void write(int b)
    throws IOException
  {
    if ((this.b >= this.d) && (this.b < this.d + this.c.length))
    {
      this.c[((int)(this.b - this.d))] = ((byte)b);
      this.i = true;
      if (this.b >= this.e)
      {
        this.f += 1;
        this.e += 1L;
      }
      this.b += 1L;
    }
    else
    {
      a(this.b);
      write(b);
    }
  }
  
  public final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt2 < this.c.length)
    {
      int k = 0;
      int m = 0;
      if (this.b >= this.d) {
        k = (int)(this.d + this.c.length - this.b);
      }
      long l;
      if (k > 0)
      {
        m = k > paramInt2 ? paramInt2 : k;
        System.arraycopy(paramArrayOfByte, paramInt1, this.c, (int)(this.b - this.d), m);
        this.i = true;
        l = this.b + m;
        this.e = (l > this.e ? l : this.e);
        this.f = ((int)(this.e - this.d));
        this.b += m;
      }
      if (m < paramInt2)
      {
        a(this.b);
        System.arraycopy(paramArrayOfByte, paramInt1 + m, this.c, (int)(this.b - this.d), paramInt2 - m);
        this.i = true;
        l = this.b + (paramInt2 - m);
        this.e = (l > this.e ? l : this.e);
        this.f = ((int)(this.e - this.d));
        this.b += paramInt2 - m;
      }
    }
    else
    {
      if (this.i)
      {
        e();
        this.d = (this.e = this.f = 0);
        this.a.seek(this.b);
      }
      this.a.write(paramArrayOfByte, paramInt1, paramInt2);
      this.b += paramInt2;
    }
  }
  
  public void write(byte[] b)
    throws IOException
  {
    b(b, 0, b.length);
  }
  
  public void write(byte[] b, int off, int len)
    throws IOException
  {
    b(b, off, len);
  }
  
  public final boolean readBoolean()
    throws IOException
  {
    int k = f();
    if (k < 0) {
      throw new EOFException();
    }
    return k != 0;
  }
  
  public final byte readByte()
    throws IOException
  {
    int k = f();
    if (k < 0) {
      throw new EOFException();
    }
    return (byte)k;
  }
  
  public final int readUnsignedByte()
    throws IOException
  {
    int k = f();
    if (k < 0) {
      throw new EOFException();
    }
    return k;
  }
  
  public final short readShort()
    throws IOException
  {
    int k = f();
    int m = f();
    if ((k | m) < 0) {
      throw new EOFException();
    }
    return (short)((k << 8) + (m << 0));
  }
  
  public final int readUnsignedShort()
    throws IOException
  {
    int k = f();
    int m = f();
    if ((k | m) < 0) {
      throw new EOFException();
    }
    return (k << 8) + (m << 0);
  }
  
  public final char readChar()
    throws IOException
  {
    int k = f();
    int m = f();
    if ((k | m) < 0) {
      throw new EOFException();
    }
    return (char)((k << 8) + (m << 0));
  }
  
  public final int readInt()
    throws IOException
  {
    int k = f();
    int m = f();
    int n = f();
    int i1 = f();
    if ((k | m | n | i1) < 0) {
      throw new EOFException();
    }
    return (k << 24) + (m << 16) + (n << 8) + (i1 << 0);
  }
  
  public final long readLong()
    throws IOException
  {
    return (readInt() << 32) + (readInt() & 0xFFFFFFFF);
  }
  
  public final float readFloat()
    throws IOException
  {
    return Float.intBitsToFloat(readInt());
  }
  
  public final double readDouble()
    throws IOException
  {
    return Double.longBitsToDouble(readLong());
  }
  
  public final String readLine()
    throws IOException
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int k;
    while (((k = f()) != -1) && (k != 10)) {
      localStringBuffer.append((char)k);
    }
    if ((k == -1) && (localStringBuffer.length() == 0)) {
      return null;
    }
    return localStringBuffer.toString();
  }
  
  public final String readUTF()
    throws IOException
  {
    return DataInputStream.readUTF(this);
  }
  
  public final void writeBoolean(boolean v)
    throws IOException
  {
    write(v ? 1 : 0);
  }
  
  public final void writeByte(int v)
    throws IOException
  {
    write(v);
  }
  
  public final void writeShort(int v)
    throws IOException
  {
    write(v >>> 8 & 0xFF);
    write(v >>> 0 & 0xFF);
  }
  
  public final void writeChar(int v)
    throws IOException
  {
    write(v >>> 8 & 0xFF);
    write(v >>> 0 & 0xFF);
  }
  
  public final void writeInt(int v)
    throws IOException
  {
    write(v >>> 24 & 0xFF);
    write(v >>> 16 & 0xFF);
    write(v >>> 8 & 0xFF);
    write(v >>> 0 & 0xFF);
  }
  
  public final void writeLong(long v)
    throws IOException
  {
    write((int)(v >>> 56) & 0xFF);
    write((int)(v >>> 48) & 0xFF);
    write((int)(v >>> 40) & 0xFF);
    write((int)(v >>> 32) & 0xFF);
    write((int)(v >>> 24) & 0xFF);
    write((int)(v >>> 16) & 0xFF);
    write((int)(v >>> 8) & 0xFF);
    write((int)(v >>> 0) & 0xFF);
  }
  
  public final void writeFloat(float v)
    throws IOException
  {
    writeInt(Float.floatToIntBits(v));
  }
  
  public final void writeDouble(double v)
    throws IOException
  {
    writeLong(Double.doubleToLongBits(v));
  }
  
  public final void writeBytes(String s)
    throws IOException
  {
    int k = s.length();
    for (int m = 0; m < k; m++) {
      write((byte)s.charAt(m));
    }
  }
  
  public final void writeChars(String s)
    throws IOException
  {
    int k = s.length();
    for (int m = 0; m < k; m++)
    {
      int n = s.charAt(m);
      write(n >>> 8 & 0xFF);
      write(n >>> 0 & 0xFF);
    }
  }
  
  public final void writeUTF(String str)
    throws IOException
  {
    int k = str.length();
    int m = 0;
    int i1;
    for (int n = 0; n < k; n++)
    {
      i1 = str.charAt(n);
      if ((i1 >= 1) && (i1 <= 127)) {
        m++;
      } else if (i1 > 2047) {
        m += 3;
      } else {
        m += 2;
      }
    }
    if (m > 65535) {
      throw new UTFDataFormatException();
    }
    write(m >>> 8 & 0xFF);
    write(m >>> 0 & 0xFF);
    for (n = 0; n < k; n++)
    {
      i1 = str.charAt(n);
      if ((i1 >= 1) && (i1 <= 127))
      {
        write(i1);
      }
      else if (i1 > 2047)
      {
        write(0xE0 | i1 >> 12 & 0xF);
        write(0x80 | i1 >> 6 & 0x3F);
        write(0x80 | i1 >> 0 & 0x3F);
      }
      else
      {
        write(0xC0 | i1 >> 6 & 0x1F);
        write(0x80 | i1 >> 0 & 0x3F);
      }
    }
  }
  
  public String toString()
  {
    return "fp=" + this.b + ", bs=" + this.d + ", de=" + this.e + ", ds=" + this.f + ", bl=" + this.c.length + ", m=" + this.h + ", bm=" + this.i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */