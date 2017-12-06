package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import com.aspose.cells.a.d.a.zg;
import java.awt.geom.AffineTransform;
import java.io.IOException;

public class zat
  extends zg
{
  private AffineTransform b;
  private int c;
  
  public zat()
  {
    super(36, 1);
  }
  
  public zat(AffineTransform paramAffineTransform, int paramInt)
  {
    this();
    this.b = paramAffineTransform;
    this.c = paramInt;
  }
  
  public void a(int paramInt, zb paramzb)
    throws IOException
  {
    paramzb.a(this.b);
    paramzb.b(this.c);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */