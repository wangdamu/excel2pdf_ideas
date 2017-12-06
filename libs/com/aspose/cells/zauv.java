package com.aspose.cells;

import com.aspose.cells.a.d.zbh;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;

class zauv
  implements Printable
{
  boolean a;
  zbh b;
  zat c;
  
  zauv(zat paramzat, zbh paramzbh, boolean paramBoolean)
  {
    this.c = paramzat;
    this.b = paramzbh;
    this.a = paramBoolean;
  }
  
  public int print(Graphics graphic, PageFormat arg1, int pageIndex)
  {
    Graphics2D localGraphics2D = (Graphics2D)graphic;
    localGraphics2D.scale(0.75D, 0.75D);
    try
    {
      if (this.a) {
        this.b.c();
      }
      this.b.b(this.c, localGraphics2D);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zauv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */