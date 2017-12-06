package com.aspose.cells.b.a.d;

import com.aspose.cells.Encoding;
import com.aspose.cells.b.a.g.za;

public class zn
  extends zq
{
  private zm b;
  private Encoding c;
  private za d;
  private byte[] e;
  private char[] f;
  private byte[] g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private boolean m;
  private boolean n;
  private boolean o;
  
  zn() {}
  
  public zn(zm paramzm)
  {
    this(paramzm, true);
  }
  
  public zn(zm paramzm, boolean paramBoolean)
  {
    this(paramzm, Encoding.getUTF8(), paramBoolean, 1024);
  }
  
  public zn(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    this(paramzm, paramEncoding, true, 1024);
  }
  
  public zn(zm paramzm, Encoding paramEncoding, boolean paramBoolean, int paramInt)
  {
    if ((paramzm == null) || (paramEncoding == null)) {
      throw new NullPointerException(paramzm == null ? "stream" : "encoding");
    }
    if (paramInt <= 0) {
      throw new IndexOutOfBoundsException("bufferSize");
    }
    a(paramzm, paramEncoding, paramBoolean, paramInt);
  }
  
  private void a(zm paramzm, Encoding paramEncoding, boolean paramBoolean, int paramInt)
  {
    this.b = paramzm;
    this.c = paramEncoding;
    this.d = paramEncoding.c();
    if (paramInt < 128) {
      paramInt = 128;
    }
    this.e = new byte[paramInt];
    this.l = (paramInt * 2);
    this.f = new char[this.l];
    this.j = 0;
    this.k = 0;
    this.m = paramBoolean;
    this.g = paramEncoding.g();
    this.n = (this.g.length > 0);
    this.o = false;
  }
  
  public void a()
    throws Exception
  {
    a(true);
  }
  
  /* Error */
  protected void a(boolean paramBoolean)
    throws Exception
  {
    // Byte code:
    //   0: iload_1
    //   1: ifeq +17 -> 18
    //   4: aload_0
    //   5: getfield 33	com/aspose/cells/b/a/d/zn:b	Lcom/aspose/cells/b/a/d/zm;
    //   8: ifnull +10 -> 18
    //   11: aload_0
    //   12: getfield 33	com/aspose/cells/b/a/d/zn:b	Lcom/aspose/cells/b/a/d/zm;
    //   15: invokevirtual 54	com/aspose/cells/b/a/d/zm:a	()V
    //   18: aload_0
    //   19: getfield 33	com/aspose/cells/b/a/d/zn:b	Lcom/aspose/cells/b/a/d/zm;
    //   22: ifnull +86 -> 108
    //   25: aload_0
    //   26: aconst_null
    //   27: putfield 33	com/aspose/cells/b/a/d/zn:b	Lcom/aspose/cells/b/a/d/zm;
    //   30: aload_0
    //   31: aconst_null
    //   32: putfield 34	com/aspose/cells/b/a/d/zn:c	Lcom/aspose/cells/Encoding;
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 35	com/aspose/cells/b/a/d/zn:d	Lcom/aspose/cells/b/a/g/za;
    //   40: aload_0
    //   41: aconst_null
    //   42: putfield 36	com/aspose/cells/b/a/d/zn:e	[B
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield 37	com/aspose/cells/b/a/d/zn:f	[C
    //   50: aload_0
    //   51: iconst_0
    //   52: putfield 39	com/aspose/cells/b/a/d/zn:h	I
    //   55: aload_0
    //   56: iconst_0
    //   57: putfield 40	com/aspose/cells/b/a/d/zn:i	I
    //   60: goto +48 -> 108
    //   63: astore_2
    //   64: aload_0
    //   65: getfield 33	com/aspose/cells/b/a/d/zn:b	Lcom/aspose/cells/b/a/d/zm;
    //   68: ifnull +38 -> 106
    //   71: aload_0
    //   72: aconst_null
    //   73: putfield 33	com/aspose/cells/b/a/d/zn:b	Lcom/aspose/cells/b/a/d/zm;
    //   76: aload_0
    //   77: aconst_null
    //   78: putfield 34	com/aspose/cells/b/a/d/zn:c	Lcom/aspose/cells/Encoding;
    //   81: aload_0
    //   82: aconst_null
    //   83: putfield 35	com/aspose/cells/b/a/d/zn:d	Lcom/aspose/cells/b/a/g/za;
    //   86: aload_0
    //   87: aconst_null
    //   88: putfield 36	com/aspose/cells/b/a/d/zn:e	[B
    //   91: aload_0
    //   92: aconst_null
    //   93: putfield 37	com/aspose/cells/b/a/d/zn:f	[C
    //   96: aload_0
    //   97: iconst_0
    //   98: putfield 39	com/aspose/cells/b/a/d/zn:h	I
    //   101: aload_0
    //   102: iconst_0
    //   103: putfield 40	com/aspose/cells/b/a/d/zn:i	I
    //   106: aload_2
    //   107: athrow
    //   108: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	zn
    //   0	109	1	paramBoolean	boolean
    //   63	44	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	18	63	finally
  }
  
  public zm b()
  {
    return this.b;
  }
  
  public int c()
    throws Exception
  {
    if (this.b == null) {
      throw new IllegalStateException("StreamReader Closed");
    }
    if ((this.h == this.i) && ((this.o) || (i() == 0))) {
      return -1;
    }
    return this.f[this.h];
  }
  
  public int d()
    throws Exception
  {
    if (this.b == null) {
      throw new IllegalStateException("StreamReader Closed");
    }
    if ((this.h == this.i) && (i() == 0)) {
      return -1;
    }
    int i1 = this.f[this.h];
    this.h += 1;
    return i1;
  }
  
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws Exception
  {
    if (this.b == null) {
      throw new IllegalStateException("StreamReader Closed");
    }
    if (paramArrayOfChar == null) {
      throw new NullPointerException("buffer");
    }
    if ((paramInt1 < 0) || (paramInt2 < 0)) {
      throw new IndexOutOfBoundsException(paramInt1 < 0 ? "index" : "count");
    }
    if (paramArrayOfChar.length - paramInt1 < paramInt2) {
      throw new IllegalArgumentException("index and count don't match buffer length");
    }
    int i1 = 0;
    boolean[] arrayOfBoolean = { false };
    while (paramInt2 > 0)
    {
      int i2 = this.i - this.h;
      if (i2 == 0) {
        i2 = a(paramArrayOfChar, paramInt1 + i1, paramInt2, arrayOfBoolean);
      }
      if (i2 == 0) {
        break;
      }
      if (i2 > paramInt2) {
        i2 = paramInt2;
      }
      if (arrayOfBoolean[0] == 0)
      {
        System.arraycopy(this.f, this.h, paramArrayOfChar, paramInt1 + i1, i2);
        this.h += i2;
      }
      i1 += i2;
      paramInt2 -= i2;
      if (this.o) {
        break;
      }
    }
    return i1;
  }
  
  public String e()
    throws Exception
  {
    if (this.b == null) {
      throw new IllegalStateException("StreamReader Closed");
    }
    StringBuilder localStringBuilder = new StringBuilder(this.i - this.h);
    do
    {
      localStringBuilder.append(this.f, this.h, this.i - this.h);
      this.h = this.i;
      i();
    } while (this.i > 0);
    return localStringBuilder.toString();
  }
  
  private void a(int paramInt)
  {
    if ((!a) && (this.j < paramInt)) {
      throw new AssertionError("CompressBuffer was called with a number of bytes greater than the current buffer length.  Are two threads using this StreamReader at the same time?");
    }
    System.arraycopy(this.e, paramInt, this.e, 0, this.j - paramInt);
    this.j -= paramInt;
  }
  
  private void g()
    throws Exception
  {
    if (this.j < 2) {
      return;
    }
    this.m = false;
    int i1 = 0;
    if ((this.e[0] == -2) && (this.e[1] == -1))
    {
      this.c = Encoding.a(true, true);
      a(2);
      i1 = 1;
    }
    else if ((this.e[0] == -1) && (this.e[1] == -2))
    {
      if ((this.j >= 4) && (this.e[2] == 0) && (this.e[3] == 0))
      {
        this.c = Encoding.b(false, true);
        a(4);
      }
      else
      {
        this.c = Encoding.a(false, true);
        a(2);
      }
      i1 = 1;
    }
    else if ((this.j >= 3) && (this.e[0] == -17) && (this.e[1] == -69) && (this.e[2] == -65))
    {
      this.c = Encoding.getUTF8();
      a(3);
      i1 = 1;
    }
    else if ((this.j >= 4) && (this.e[0] == 0) && (this.e[1] == 0) && (this.e[2] == -2) && (this.e[3] == -1))
    {
      this.c = Encoding.b(true, true);
      i1 = 1;
    }
    else if ((this.j >= 5) && (this.e[0] == 43) && (this.e[1] == 47) && (this.e[2] == 118) && (this.e[3] == 56) && (this.e[4] == 45))
    {
      if (!this.c.equals(Encoding.getUTF7()))
      {
        this.c = Encoding.getUTF7();
        i1 = 1;
      }
      a(5);
    }
    else if (this.j == 2)
    {
      this.m = true;
    }
    if (i1 != 0)
    {
      this.d = this.c.c();
      this.l = this.d.a(this.e.length + 2);
      this.f = new char[this.l];
    }
  }
  
  private boolean h()
  {
    if (!this.n) {
      return this.n;
    }
    if ((!a) && (this.k > this.g.length)) {
      throw new AssertionError("_compressPreamble was called with the current bytePos greater than the preamble buffer length.  Are two threads using this StreamReader at the same time?");
    }
    int i1 = this.j >= this.g.length ? this.g.length - this.k : this.j - this.k;
    int i2 = 0;
    while (i2 < i1)
    {
      if (this.e[this.k] != this.g[this.k])
      {
        this.k = 0;
        this.n = false;
        break;
      }
      i2++;
      this.k += 1;
    }
    if ((!a) && (this.k > this.g.length)) {
      throw new AssertionError("possible bug in _compressPreamble.  Are two threads using this StreamReader at the same time?");
    }
    if ((this.n) && (this.k == this.g.length))
    {
      a(this.g.length);
      this.k = 0;
      this.n = false;
      this.m = false;
    }
    return this.n;
  }
  
  private int i()
    throws Exception
  {
    this.i = 0;
    this.h = 0;
    if (!this.n) {
      this.j = 0;
    }
    do
    {
      if (this.n)
      {
        if ((!a) && (this.k > this.g.length)) {
          throw new AssertionError("possible bug in _compressPreamble.  Are two threads using this StreamReader at the same time?");
        }
        int i1 = this.b.a(this.e, this.k, this.e.length - this.k);
        if ((!a) && (i1 < 0)) {
          throw new AssertionError("Stream.Read returned a negative number!  This is a bug in your stream class.");
        }
        if (i1 == 0)
        {
          if (this.j > 0) {
            this.i += this.d.a(this.e, 0, this.j, this.f, this.i);
          }
          return this.i;
        }
        this.j += i1;
      }
      else
      {
        if ((!a) && (this.k != 0)) {
          throw new AssertionError("bytePos can be non zero only when we are trying to _checkPreamble.  Are two threads using this StreamReader at the same time?");
        }
        this.j = this.b.a(this.e, 0, this.e.length);
        if ((!a) && (this.j < 0)) {
          throw new AssertionError("Stream.Read returned a negative number!  This is a bug in your stream class.");
        }
        if (this.j == 0) {
          return this.i;
        }
      }
      this.o = (this.j < this.e.length);
      if (!h())
      {
        if ((this.m) && (this.j >= 2)) {
          g();
        }
        this.i += this.d.a(this.e, 0, this.j, this.f, this.i);
      }
    } while (this.i == 0);
    return this.i;
  }
  
  private int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
    throws Exception
  {
    this.i = 0;
    this.h = 0;
    if (!this.n) {
      this.j = 0;
    }
    int i1 = 0;
    paramArrayOfBoolean[0] = (paramInt2 >= this.l ? 1 : false);
    do
    {
      if (this.n)
      {
        if ((!a) && (this.k > this.g.length)) {
          throw new AssertionError("possible bug in _compressPreamble.  Are two threads using this StreamReader at the same time?");
        }
        int i2 = this.b.a(this.e, this.k, this.e.length - this.k);
        if ((!a) && (i2 < 0)) {
          throw new AssertionError("Stream.Read returned a negative number!  This is a bug in your stream class.");
        }
        if (i2 == 0)
        {
          if (this.j > 0) {
            if (paramArrayOfBoolean[0] != 0)
            {
              i1 += this.d.a(this.e, 0, this.j, paramArrayOfChar, paramInt1 + i1);
              this.i = 0;
            }
            else
            {
              i1 = this.d.a(this.e, 0, this.j, this.f, i1);
              this.i += i1;
            }
          }
          return i1;
        }
        this.j += i2;
      }
      else
      {
        if ((!a) && (this.k != 0)) {
          throw new AssertionError("bytePos can be non zero only when we are trying to _checkPreamble.  Are two threads using this StreamReader at the same time?");
        }
        this.j = this.b.a(this.e, 0, this.e.length);
        if ((!a) && (this.j < 0)) {
          throw new AssertionError("Stream.Read returned a negative number!  This is a bug in your stream class.");
        }
        if (this.j == 0) {
          return i1;
        }
      }
      this.o = (this.j < this.e.length);
      if (!h())
      {
        if ((this.m) && (this.j >= 2))
        {
          g();
          paramArrayOfBoolean[0] = (paramInt2 >= this.l ? 1 : false);
        }
        this.h = 0;
        if (paramArrayOfBoolean[0] != 0)
        {
          i1 += this.d.a(this.e, 0, this.j, paramArrayOfChar, paramInt1 + i1);
          this.i = 0;
        }
        else
        {
          i1 = this.d.a(this.e, 0, this.j, this.f, i1);
          this.i += i1;
        }
      }
    } while (i1 == 0);
    this.o &= i1 < paramInt2;
    return i1;
  }
  
  public String f()
    throws Exception
  {
    if (this.b == null) {
      throw new IllegalStateException("StreamReader Closed");
    }
    if ((this.h == this.i) && (i() == 0)) {
      return null;
    }
    StringBuilder localStringBuilder = null;
    do
    {
      int i1 = this.h;
      do
      {
        int i2 = this.f[i1];
        if ((i2 == 13) || (i2 == 10))
        {
          String str;
          if (localStringBuilder != null)
          {
            localStringBuilder.append(this.f, this.h, i1 - this.h);
            str = localStringBuilder.toString();
          }
          else
          {
            str = new String(this.f, this.h, i1 - this.h);
          }
          this.h = (i1 + 1);
          if ((i2 == 13) && ((this.h < this.i) || (i() > 0)) && (this.f[this.h] == '\n')) {
            this.h += 1;
          }
          return str;
        }
        i1++;
      } while (i1 < this.i);
      i1 = this.i - this.h;
      if (localStringBuilder == null) {
        localStringBuilder = new StringBuilder(i1 + 80);
      }
      localStringBuilder.append(this.f, this.h, i1);
    } while (i() > 0);
    return localStringBuilder.toString();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */