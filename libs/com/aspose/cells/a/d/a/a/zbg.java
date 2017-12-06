package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import java.awt.Point;
import java.io.IOException;

public class zbg
  extends zg
{
  private int b;
  private int c;
  
  public zbg()
  {
    super(7, 1, null, null, (Point[][])null);
  }
  
  public void a(int paramInt, zb paramzb)
    throws IOException
  {
    int[] arrayOfInt = c();
    Point[][] arrayOfPoint = d();
    paramzb.a(b());
    paramzb.b(this.c - this.b + 1);
    int i = 0;
    for (int j = this.b; j < this.c + 1; j++) {
      i += arrayOfInt[j];
    }
    paramzb.b(i);
    for (j = this.b; j < this.c + 1; j++) {
      paramzb.b(arrayOfInt[j]);
    }
    for (j = this.b; j < this.c + 1; j++) {
      paramzb.b(arrayOfInt[j], arrayOfPoint[j]);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */