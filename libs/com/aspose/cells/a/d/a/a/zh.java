package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import com.aspose.cells.a.d.a.zg;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;

public abstract class zh
  extends zg
{
  private Rectangle b;
  private int c;
  private Point[] d;
  
  protected zh(int paramInt1, int paramInt2, Rectangle paramRectangle, int paramInt3, Point[] paramArrayOfPoint)
  {
    super(paramInt1, paramInt2);
    this.b = paramRectangle;
    this.c = paramInt3;
    this.d = paramArrayOfPoint;
  }
  
  public void a(int paramInt, zb paramzb)
    throws IOException
  {
    paramzb.a(this.b);
    paramzb.b(this.c);
    paramzb.b(this.c, this.d);
  }
  
  protected Rectangle b()
  {
    return this.b;
  }
  
  protected int c()
  {
    return this.c;
  }
  
  protected Point[] d()
  {
    return this.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */