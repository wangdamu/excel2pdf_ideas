package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import com.aspose.cells.a.d.a.zg;
import java.awt.Rectangle;
import java.io.IOException;

public abstract class zd
  extends zg
{
  private Rectangle b;
  private int c;
  private float d;
  private float e;
  
  protected zd(int paramInt1, int paramInt2, Rectangle paramRectangle, int paramInt3, float paramFloat1, float paramFloat2)
  {
    super(paramInt1, paramInt2);
    this.b = paramRectangle;
    this.c = paramInt3;
    this.d = paramFloat1;
    this.e = paramFloat2;
  }
  
  public abstract zcv b();
  
  public void a(int paramInt, zb paramzb)
    throws IOException
  {
    paramzb.a(this.b);
    paramzb.b(this.c);
    paramzb.a(this.d);
    paramzb.a(this.e);
    b().a(paramzb);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */