package com.aspose.cells.a.d.a.b;

import com.aspose.cells.a.d.a.zb;
import java.io.IOException;

public class zj
  extends zi
{
  private int b;
  private int c;
  private int d;
  private boolean e = false;
  byte[] a;
  
  public zj(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public int a()
  {
    return 1;
  }
  
  public int c()
  {
    return 20 + this.a.length + (4 - this.a.length % 4) % 4;
  }
  
  public int a(zb paramzb)
    throws IOException
  {
    paramzb.b(this.b);
    paramzb.b(this.c);
    paramzb.b(this.e ? 0 : (this.d >> 19 & 0x1F) * this.b);
    paramzb.b(this.d);
    paramzb.b(this.e ? 1 : 0);
    paramzb.a(this.a);
    for (int i = (4 - this.a.length % 4) % 4; i > 0; i--) {
      paramzb.g(0);
    }
    return 20 + this.a.length + (4 - this.a.length % 4) % 4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/b/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */