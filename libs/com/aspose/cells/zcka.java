package com.aspose.cells;

import java.io.IOException;
import java.io.InputStream;

class zcka
{
  protected zckc a = new zckc();
  protected int b = 512;
  protected int c = 0;
  protected byte[] d = new byte[this.b];
  protected byte[] e = new byte[1];
  protected boolean f;
  protected InputStream g = null;
  private boolean h = false;
  
  public zcka(InputStream paramInputStream)
  {
    this(paramInputStream, false);
  }
  
  public zcka(InputStream paramInputStream, boolean paramBoolean)
  {
    this.g = paramInputStream;
    this.a.a(paramBoolean);
    this.f = false;
    this.a.a = this.d;
    this.a.b = 0;
    this.a.c = 0;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt2 == 0) {
      return 0;
    }
    this.a.e = paramArrayOfByte;
    this.a.f = paramInt1;
    this.a.g = paramInt2;
    int i;
    do
    {
      if ((this.a.c == 0) && (!this.h))
      {
        this.a.b = 0;
        this.a.c = this.g.read(this.d, 0, this.b);
        if (this.a.c == -1)
        {
          this.a.c = 0;
          this.h = true;
        }
      }
      if (this.f) {
        i = this.a.b(this.c);
      } else {
        i = this.a.a(this.c);
      }
      if ((this.h) && (i == -5)) {
        return -1;
      }
      if ((i != 0) && (i != 1)) {
        throw new IOException((this.f ? "de" : "in") + "flating: " + this.a.i);
      }
      if (((this.h) || (i == 1)) && (this.a.g == paramInt2)) {
        return -1;
      }
    } while ((this.a.g == paramInt2) && (i == 0));
    return paramInt2 - this.a.g;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */