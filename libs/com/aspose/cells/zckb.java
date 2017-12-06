package com.aspose.cells;

import java.io.IOException;
import java.io.OutputStream;

class zckb
  extends OutputStream
{
  protected zckc a = new zckc();
  protected int b = 512;
  protected int c = 0;
  protected byte[] d = new byte[this.b];
  protected byte[] e = new byte[1];
  protected boolean f;
  protected OutputStream g;
  
  public zckb(OutputStream paramOutputStream, int paramInt)
  {
    this(paramOutputStream, paramInt, false);
  }
  
  public zckb(OutputStream paramOutputStream, int paramInt, boolean paramBoolean)
  {
    this.g = paramOutputStream;
    this.a.b(paramInt, paramBoolean);
    this.f = true;
  }
  
  public void write(int b)
    throws IOException
  {
    this.e[0] = ((byte)b);
    write(this.e, 0, 1);
  }
  
  public void write(byte[] b, int off, int len)
    throws IOException
  {
    if (len == 0) {
      return;
    }
    this.a.a = b;
    this.a.b = off;
    this.a.c = len;
    do
    {
      this.a.e = this.d;
      this.a.f = 0;
      this.a.g = this.b;
      int i;
      if (this.f) {
        i = this.a.b(this.c);
      } else {
        i = this.a.a(this.c);
      }
      if (i != 0) {
        throw new IOException((this.f ? "de" : "in") + "flating: " + this.a.i);
      }
      this.g.write(this.d, 0, this.b - this.a.g);
    } while ((this.a.c > 0) || (this.a.g == 0));
  }
  
  public void a()
    throws IOException
  {
    do
    {
      this.a.e = this.d;
      this.a.f = 0;
      this.a.g = this.b;
      int i;
      if (this.f) {
        i = this.a.b(4);
      } else {
        i = this.a.a(4);
      }
      if ((i != 1) && (i != 0)) {
        throw new IOException((this.f ? "de" : "in") + "flating: " + this.a.i);
      }
      if (this.b - this.a.g > 0) {
        this.g.write(this.d, 0, this.b - this.a.g);
      }
    } while ((this.a.c > 0) || (this.a.g == 0));
    flush();
  }
  
  public void b()
  {
    if (this.a == null) {
      return;
    }
    if (this.f) {
      this.a.b();
    } else {
      this.a.a();
    }
    this.a.d();
    this.a = null;
  }
  
  /* Error */
  public void close()
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 27	com/aspose/cells/zckb:a	()V
    //   4: goto +4 -> 8
    //   7: astore_1
    //   8: aload_0
    //   9: invokevirtual 28	com/aspose/cells/zckb:b	()V
    //   12: aload_0
    //   13: getfield 18	com/aspose/cells/zckb:g	Ljava/io/OutputStream;
    //   16: invokevirtual 40	java/io/OutputStream:close	()V
    //   19: aload_0
    //   20: aconst_null
    //   21: putfield 18	com/aspose/cells/zckb:g	Ljava/io/OutputStream;
    //   24: goto +22 -> 46
    //   27: astore_2
    //   28: aload_0
    //   29: invokevirtual 28	com/aspose/cells/zckb:b	()V
    //   32: aload_0
    //   33: getfield 18	com/aspose/cells/zckb:g	Ljava/io/OutputStream;
    //   36: invokevirtual 40	java/io/OutputStream:close	()V
    //   39: aload_0
    //   40: aconst_null
    //   41: putfield 18	com/aspose/cells/zckb:g	Ljava/io/OutputStream;
    //   44: aload_2
    //   45: athrow
    //   46: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	zckb
    //   7	1	1	localIOException	IOException
    //   27	18	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	4	7	java/io/IOException
    //   0	8	27	finally
  }
  
  public void flush()
    throws IOException
  {
    this.g.flush();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zckb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */