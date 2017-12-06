package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbty
  extends zcd
{
  zbty(zaxa paramzaxa)
  {
    c(249);
    if (paramzaxa.c != null) {
      a((short)(paramzaxa.c.length + 4));
    } else {
      b(4);
    }
    this.b = new byte[d()];
    if (paramzaxa.c != null) {
      System.arraycopy(zc.a(paramzaxa.c.length), 0, this.b, 0, 2);
    }
    if (paramzaxa.e != null) {
      System.arraycopy(zc.a(paramzaxa.e.getCount()), 0, this.b, 2, 2);
    }
    if (paramzaxa.c != null) {
      System.arraycopy(paramzaxa.c, 0, this.b, 4, paramzaxa.c.length);
    }
  }
  
  zbty(zbtv paramzbtv)
  {
    c(249);
    if (paramzbtv.e != null) {
      a((short)(paramzbtv.e.length + 4));
    } else {
      b(4);
    }
    this.b = new byte[d()];
    if (paramzbtv.e != null) {
      System.arraycopy(zc.a(paramzbtv.e.length), 0, this.b, 0, 2);
    }
    if (paramzbtv.f != null) {
      System.arraycopy(zc.a(paramzbtv.f.size()), 0, this.b, 2, 2);
    }
    if (paramzbtv.e != null) {
      System.arraycopy(paramzbtv.e, 0, this.b, 4, paramzbtv.e.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */