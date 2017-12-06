package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbus
  extends zcd
{
  zbus(zbur paramzbur)
  {
    c(240);
    b(8);
    if (paramzbur.j()) {
      b(d() + 4);
    }
    this.b = new byte[d()];
    this.b[0] = paramzbur.a;
    this.b[1] = paramzbur.b;
    System.arraycopy(zc.a(paramzbur.c), 0, this.b, 2, 2);
    if (paramzbur.e != null) {
      System.arraycopy(zc.a(paramzbur.e.size()), 0, this.b, 6, 2);
    }
    if (paramzbur.j())
    {
      this.b[8] = paramzbur.f;
      this.b[9] = paramzbur.g;
      this.b[10] = paramzbur.h;
      this.b[11] = paramzbur.i;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */