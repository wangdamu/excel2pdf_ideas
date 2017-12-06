package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import com.aspose.cells.a.d.a.zg;
import java.awt.Rectangle;
import java.io.IOException;

public class zan
  extends zg
{
  private Rectangle b;
  private int c;
  private zcy[] d;
  private zam[] e;
  
  public zan()
  {
    super(118, 1);
  }
  
  public void a(int paramInt, zb paramzb)
    throws IOException
  {
    paramzb.a(this.b);
    paramzb.b(this.d.length);
    paramzb.b(this.e.length);
    paramzb.e(this.c);
    for (int i = 0; i < this.d.length; i++) {
      this.d[i].a(paramzb);
    }
    for (i = 0; i < this.e.length; i++) {
      this.e[i].a(paramzb);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */