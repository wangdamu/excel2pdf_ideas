package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import java.awt.Point;
import java.io.IOException;

public class zbh
  extends zg
{
  private int b;
  
  public zbh()
  {
    super(90, 1, null, null, (Point[][])null);
  }
  
  public void a(int paramInt, zb paramzb)
    throws IOException
  {
    int[] arrayOfInt = c();
    Point[][] arrayOfPoint = d();
    paramzb.a(b());
    paramzb.b(this.b);
    int i = 0;
    for (int j = 0; j < this.b; j++) {
      i += arrayOfInt[j];
    }
    paramzb.b(i);
    for (j = 0; j < this.b; j++) {
      paramzb.b(arrayOfInt[j]);
    }
    for (j = 0; j < this.b; j++) {
      paramzb.a(arrayOfInt[j], arrayOfPoint[j]);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zbh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */