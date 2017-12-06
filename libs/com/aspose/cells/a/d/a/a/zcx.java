package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;

public class zcx
  extends zcv
{
  public zcx(Point paramPoint, String paramString, int paramInt, Rectangle paramRectangle, int[] paramArrayOfInt)
  {
    super(paramPoint, paramString, paramInt, paramRectangle, paramArrayOfInt);
  }
  
  public void a(zb paramzb)
    throws IOException
  {
    paramzb.b(this.a);
    paramzb.b(this.b.length());
    paramzb.b(76);
    paramzb.b(this.c);
    paramzb.a(this.d);
    int i = 2 * this.b.length() % 4;
    if (i > 0) {
      i = 4 - i;
    }
    paramzb.b(76 + 2 * this.b.length() + i);
    paramzb.b(this.b.getBytes("UTF-16LE"));
    for (int j = 0; j < i; j++) {
      paramzb.g(0);
    }
    for (j = 0; j < this.b.length(); j++) {
      paramzb.b(this.e[j]);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */