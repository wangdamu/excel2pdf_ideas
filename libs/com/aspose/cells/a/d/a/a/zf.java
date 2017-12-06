package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zg;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class zf
  extends zg
{
  private Rectangle b;
  private int[] c;
  private Point[][] d;
  
  protected zf(int paramInt1, int paramInt2, Rectangle paramRectangle, int[] paramArrayOfInt, Point[][] paramArrayOfPoint)
  {
    super(paramInt1, paramInt2);
    this.b = paramRectangle;
    this.c = paramArrayOfInt;
    this.d = paramArrayOfPoint;
  }
  
  protected Rectangle b()
  {
    return this.b;
  }
  
  protected int[] c()
  {
    return this.c;
  }
  
  protected Point[][] d()
  {
    return this.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */