package com.aspose.cells.a.d.a.b;

import com.aspose.cells.a.d.a.zb;
import java.awt.Color;
import java.awt.Rectangle;
import java.io.IOException;

public class ze
  extends zs
{
  private int a;
  private int b;
  private int c;
  private String d;
  private Rectangle e;
  
  public ze(Color paramColor, int paramInt1, int paramInt2, String paramString, Rectangle paramRectangle)
  {
    this.a = paramColor.getRGB();
    this.c = paramInt2;
    this.d = paramString;
    this.e = paramRectangle;
    this.b = (0x8000 | paramInt1);
  }
  
  public int b()
  {
    return 16412;
  }
  
  public int c()
  {
    return ((this.d.length() & 0x1) != 0 ? 42 : 40) + (this.d.length() << 1);
  }
  
  public int a(zb paramzb)
    throws IOException
  {
    paramzb.c(16412);
    paramzb.c(this.b);
    int i = c();
    paramzb.b(i);
    paramzb.b(i - 12);
    paramzb.b(this.a);
    paramzb.b(this.c);
    paramzb.b(this.d.length());
    paramzb.a(this.e);
    paramzb.a(this.d);
    if ((this.d.length() & 0x1) != 0) {
      paramzb.c(0);
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/b/ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */