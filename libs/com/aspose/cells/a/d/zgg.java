package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zm;

public abstract class zgg
{
  public zm a;
  public byte[] b = new byte[8];
  private int c = 0;
  
  public void a(zm paramzm)
    throws Exception
  {
    this.a = paramzm;
    int i = 0;
    i = this.a.a(this.b, 0, this.b.length);
    if (i < 8) {
      return;
    }
    if ((this.b[0] != -119) || (this.b[1] != 80) || (this.b[2] != 78) || (this.b[3] != 71) || (this.b[4] != 13) || (this.b[5] != 10) || (this.b[6] != 26) || (this.b[7] != 10)) {
      return;
    }
    this.c += 8;
    for (;;)
    {
      i = this.a.a(this.b, 0, this.b.length);
      if (i <= 0) {
        return;
      }
      if (i < 8) {
        return;
      }
      int j = 8 + b() + 4;
      boolean bool = a();
      this.c += j;
      if (!bool) {
        break;
      }
    }
  }
  
  protected abstract boolean a()
    throws Exception;
  
  protected int b()
  {
    int i = 0;
    for (int j = 0; j < 4; j++) {
      i += ((this.b[j] & 0xFF & 0xFF) << 24 - j * 8);
    }
    return i;
  }
  
  protected void c()
    throws Exception
  {
    int i = b() + 4;
    a(i);
  }
  
  protected void a(long paramLong)
    throws Exception
  {
    while (paramLong > 0L)
    {
      long l = this.a.a(paramLong, 1);
      if (l <= 0L) {
        return;
      }
      paramLong -= l;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */