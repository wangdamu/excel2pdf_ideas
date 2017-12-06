package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zg;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;

public abstract class zb
  extends zg
{
  private Rectangle b;
  private Point c;
  private Point d;
  
  protected zb(int paramInt1, int paramInt2, Rectangle paramRectangle, Point paramPoint1, Point paramPoint2)
  {
    super(paramInt1, paramInt2);
    this.b = paramRectangle;
    this.c = paramPoint1;
    this.d = paramPoint2;
  }
  
  public void a(int paramInt, com.aspose.cells.a.d.a.zb paramzb)
    throws IOException
  {
    paramzb.a(this.b);
    paramzb.b(this.c);
    paramzb.b(this.d);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */