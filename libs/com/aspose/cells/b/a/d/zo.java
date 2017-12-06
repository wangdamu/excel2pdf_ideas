package com.aspose.cells.b.a.d;

import com.aspose.cells.Encoding;
import com.aspose.cells.b.a.g.zb;
import com.aspose.cells.b.a.zw;

public class zo
  extends zr
{
  zm a;
  private Encoding j;
  private zb k;
  byte[] b;
  char[] c;
  int d;
  int e;
  boolean f;
  private boolean l;
  private boolean m;
  
  static Encoding a()
  {
    return Encoding.getUTF8NoBOM();
  }
  
  zo() {}
  
  public zo(zm paramzm)
    throws Exception
  {
    this(paramzm, a(), 1024);
  }
  
  public zo(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    this(paramzm, paramEncoding, 1024);
  }
  
  public zo(zm paramzm, Encoding paramEncoding, int paramInt)
    throws Exception
  {
    if ((paramzm == null) || (paramEncoding == null)) {
      throw new NullPointerException(paramzm == null ? "stream" : "encoding");
    }
    if (!paramzm.f()) {
      throw new IllegalArgumentException("stream can't write");
    }
    if (paramInt <= 0) {
      throw new IndexOutOfBoundsException("bufferSize");
    }
    a(paramzm, paramEncoding, paramInt);
  }
  
  private void a(zm paramzm, Encoding paramEncoding, int paramInt)
    throws Exception
  {
    this.a = paramzm;
    this.j = paramEncoding;
    this.k = paramEncoding.e();
    if (paramInt < 128) {
      paramInt = 128;
    }
    this.c = new char[paramInt];
    this.b = new byte[paramEncoding.a(paramInt)];
    this.e = paramInt;
    if ((paramzm.e()) && (paramzm.i() > 0L)) {
      this.l = true;
    }
    this.m = true;
  }
  
  public void b()
    throws Exception
  {
    a(true);
  }
  
  /* Error */
  protected void a(boolean paramBoolean)
    throws Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 30	com/aspose/cells/b/a/d/zo:a	Lcom/aspose/cells/b/a/d/zm;
    //   4: ifnull +20 -> 24
    //   7: iload_1
    //   8: ifne +10 -> 18
    //   11: aload_0
    //   12: invokevirtual 55	com/aspose/cells/b/a/d/zo:e	()Z
    //   15: ifne +9 -> 24
    //   18: aload_0
    //   19: iconst_1
    //   20: iconst_1
    //   21: invokespecial 54	com/aspose/cells/b/a/d/zo:a	(ZZ)V
    //   24: aload_0
    //   25: invokevirtual 55	com/aspose/cells/b/a/d/zo:e	()Z
    //   28: ifeq +206 -> 234
    //   31: aload_0
    //   32: getfield 30	com/aspose/cells/b/a/d/zo:a	Lcom/aspose/cells/b/a/d/zm;
    //   35: ifnull +199 -> 234
    //   38: iload_1
    //   39: ifeq +10 -> 49
    //   42: aload_0
    //   43: getfield 30	com/aspose/cells/b/a/d/zo:a	Lcom/aspose/cells/b/a/d/zm;
    //   46: invokevirtual 45	com/aspose/cells/b/a/d/zm:a	()V
    //   49: aload_0
    //   50: aconst_null
    //   51: putfield 30	com/aspose/cells/b/a/d/zo:a	Lcom/aspose/cells/b/a/d/zm;
    //   54: aload_0
    //   55: aconst_null
    //   56: putfield 31	com/aspose/cells/b/a/d/zo:b	[B
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 32	com/aspose/cells/b/a/d/zo:c	[C
    //   64: aload_0
    //   65: aconst_null
    //   66: putfield 37	com/aspose/cells/b/a/d/zo:j	Lcom/aspose/cells/Encoding;
    //   69: aload_0
    //   70: aconst_null
    //   71: putfield 38	com/aspose/cells/b/a/d/zo:k	Lcom/aspose/cells/b/a/g/zb;
    //   74: aload_0
    //   75: iconst_0
    //   76: putfield 34	com/aspose/cells/b/a/d/zo:e	I
    //   79: aload_0
    //   80: iload_1
    //   81: invokespecial 57	com/aspose/cells/b/a/d/zr:a	(Z)V
    //   84: goto +41 -> 125
    //   87: astore_2
    //   88: aload_0
    //   89: aconst_null
    //   90: putfield 30	com/aspose/cells/b/a/d/zo:a	Lcom/aspose/cells/b/a/d/zm;
    //   93: aload_0
    //   94: aconst_null
    //   95: putfield 31	com/aspose/cells/b/a/d/zo:b	[B
    //   98: aload_0
    //   99: aconst_null
    //   100: putfield 32	com/aspose/cells/b/a/d/zo:c	[C
    //   103: aload_0
    //   104: aconst_null
    //   105: putfield 37	com/aspose/cells/b/a/d/zo:j	Lcom/aspose/cells/Encoding;
    //   108: aload_0
    //   109: aconst_null
    //   110: putfield 38	com/aspose/cells/b/a/d/zo:k	Lcom/aspose/cells/b/a/g/zb;
    //   113: aload_0
    //   114: iconst_0
    //   115: putfield 34	com/aspose/cells/b/a/d/zo:e	I
    //   118: aload_0
    //   119: iload_1
    //   120: invokespecial 57	com/aspose/cells/b/a/d/zr:a	(Z)V
    //   123: aload_2
    //   124: athrow
    //   125: goto +109 -> 234
    //   128: astore_3
    //   129: aload_0
    //   130: invokevirtual 55	com/aspose/cells/b/a/d/zo:e	()Z
    //   133: ifeq +99 -> 232
    //   136: aload_0
    //   137: getfield 30	com/aspose/cells/b/a/d/zo:a	Lcom/aspose/cells/b/a/d/zm;
    //   140: ifnull +92 -> 232
    //   143: iload_1
    //   144: ifeq +10 -> 154
    //   147: aload_0
    //   148: getfield 30	com/aspose/cells/b/a/d/zo:a	Lcom/aspose/cells/b/a/d/zm;
    //   151: invokevirtual 45	com/aspose/cells/b/a/d/zm:a	()V
    //   154: aload_0
    //   155: aconst_null
    //   156: putfield 30	com/aspose/cells/b/a/d/zo:a	Lcom/aspose/cells/b/a/d/zm;
    //   159: aload_0
    //   160: aconst_null
    //   161: putfield 31	com/aspose/cells/b/a/d/zo:b	[B
    //   164: aload_0
    //   165: aconst_null
    //   166: putfield 32	com/aspose/cells/b/a/d/zo:c	[C
    //   169: aload_0
    //   170: aconst_null
    //   171: putfield 37	com/aspose/cells/b/a/d/zo:j	Lcom/aspose/cells/Encoding;
    //   174: aload_0
    //   175: aconst_null
    //   176: putfield 38	com/aspose/cells/b/a/d/zo:k	Lcom/aspose/cells/b/a/g/zb;
    //   179: aload_0
    //   180: iconst_0
    //   181: putfield 34	com/aspose/cells/b/a/d/zo:e	I
    //   184: aload_0
    //   185: iload_1
    //   186: invokespecial 57	com/aspose/cells/b/a/d/zr:a	(Z)V
    //   189: goto +43 -> 232
    //   192: astore 4
    //   194: aload_0
    //   195: aconst_null
    //   196: putfield 30	com/aspose/cells/b/a/d/zo:a	Lcom/aspose/cells/b/a/d/zm;
    //   199: aload_0
    //   200: aconst_null
    //   201: putfield 31	com/aspose/cells/b/a/d/zo:b	[B
    //   204: aload_0
    //   205: aconst_null
    //   206: putfield 32	com/aspose/cells/b/a/d/zo:c	[C
    //   209: aload_0
    //   210: aconst_null
    //   211: putfield 37	com/aspose/cells/b/a/d/zo:j	Lcom/aspose/cells/Encoding;
    //   214: aload_0
    //   215: aconst_null
    //   216: putfield 38	com/aspose/cells/b/a/d/zo:k	Lcom/aspose/cells/b/a/g/zb;
    //   219: aload_0
    //   220: iconst_0
    //   221: putfield 34	com/aspose/cells/b/a/d/zo:e	I
    //   224: aload_0
    //   225: iload_1
    //   226: invokespecial 57	com/aspose/cells/b/a/d/zr:a	(Z)V
    //   229: aload 4
    //   231: athrow
    //   232: aload_3
    //   233: athrow
    //   234: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	this	zo
    //   0	235	1	paramBoolean	boolean
    //   87	37	2	localObject1	Object
    //   128	105	3	localObject2	Object
    //   192	38	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   38	49	87	finally
    //   0	24	128	finally
    //   143	154	192	finally
    //   192	194	192	finally
  }
  
  public void c()
    throws Exception
  {
    a(true, true);
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    if (this.a == null) {
      throw new IllegalStateException("StreamWriter already closed.");
    }
    if ((this.d == 0) && (!paramBoolean1) && (!paramBoolean2)) {
      return;
    }
    if (!this.l)
    {
      this.l = true;
      byte[] arrayOfByte = this.j.g();
      if (arrayOfByte.length > 0) {
        this.a.b(arrayOfByte, 0, arrayOfByte.length);
      }
    }
    int i = this.k.a(this.c, 0, this.d, this.b, 0, paramBoolean2);
    this.d = 0;
    if (i > 0) {
      this.a.b(this.b, 0, i);
    }
    if (paramBoolean1) {}
  }
  
  public void b(boolean paramBoolean)
    throws Exception
  {
    this.f = paramBoolean;
    if (paramBoolean) {
      a(true, false);
    }
  }
  
  public zm d()
  {
    return this.a;
  }
  
  boolean e()
  {
    return this.m;
  }
  
  public void a(char paramChar)
    throws Exception
  {
    if (this.d == this.e) {
      a(false, false);
    }
    this.c[this.d] = paramChar;
    this.d += 1;
    if (this.f) {
      a(true, false);
    }
  }
  
  public void a(char[] paramArrayOfChar)
    throws Exception
  {
    if (paramArrayOfChar == null) {
      return;
    }
    int i = 0;
    int n = paramArrayOfChar.length;
    while (n > 0)
    {
      if (this.d == this.e) {
        a(false, false);
      }
      int i1 = this.e - this.d;
      if (i1 > n) {
        i1 = n;
      }
      if ((!g) && (i1 <= 0)) {
        throw new AssertionError("StreamWriter::Write(char[]) isn't making progress!  This is most likely a race in user code.");
      }
      System.arraycopy(paramArrayOfChar, i, this.c, this.d, i1);
      this.d += i1;
      i += i1;
      n -= i1;
    }
    if (this.f) {
      a(true, false);
    }
  }
  
  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws Exception
  {
    if (paramArrayOfChar == null) {
      throw new NullPointerException("buffer");
    }
    if (paramInt1 < 0) {
      throw new IndexOutOfBoundsException("index");
    }
    if (paramInt2 < 0) {
      throw new IndexOutOfBoundsException("count");
    }
    if (paramArrayOfChar.length - paramInt1 < paramInt2) {
      throw new IllegalArgumentException("buffer.length - index < count");
    }
    while (paramInt2 > 0)
    {
      if (this.d == this.e) {
        a(false, false);
      }
      int i = this.e - this.d;
      if (i > paramInt2) {
        i = paramInt2;
      }
      if ((!g) && (i <= 0)) {
        throw new AssertionError("StreamWriter::Write(char[], int, int) isn't making progress!  This is most likely a race condition in user code.");
      }
      System.arraycopy(paramArrayOfChar, paramInt1, this.c, this.d, i);
      this.d += i;
      paramInt1 += i;
      paramInt2 -= i;
    }
    if (this.f) {
      a(true, false);
    }
  }
  
  public void a(String paramString)
    throws Exception
  {
    if (paramString != null)
    {
      int i = paramString.length();
      int n = 0;
      while (i > 0)
      {
        if (this.d == this.e) {
          a(false, false);
        }
        int i1 = this.e - this.d;
        if (i1 > i) {
          i1 = i;
        }
        if ((!g) && (i1 <= 0)) {
          throw new AssertionError("StreamWriter::Write(String) isn't making progress!  This is most likely a race condition in user code.");
        }
        zw.a(paramString, n, this.c, this.d, i1);
        this.d += i1;
        n += i1;
        i -= i1;
      }
      if (this.f) {
        a(true, false);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */