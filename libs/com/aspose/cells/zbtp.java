package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbtp
  extends zcd
{
  zbtp(zawp paramzawp)
  {
    c(198);
    int i = 0;
    boolean bool = zct.b(paramzawp.n);
    a((short)(21 + (bool ? paramzawp.n.length() : paramzawp.n.length() * 2)));
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramzawp.d()), 0, this.b, i, 4);
    if (paramzawp.b == 0) {
      System.arraycopy(zc.a(1), 0, this.b, i + 4, 2);
    } else {
      System.arraycopy(zc.a(paramzawp.b), 0, this.b, i + 4, 2);
    }
    System.arraycopy(zc.a(paramzawp.g), 0, this.b, i + 6, 2);
    i += 8;
    System.arraycopy(zc.a(paramzawp.r), 0, this.b, i, 2);
    System.arraycopy(zc.a(paramzawp.c()), 0, this.b, i + 2, 2);
    if (paramzawp.i != null) {
      System.arraycopy(zc.a(paramzawp.i.size()), 0, this.b, i + 4, 2);
    }
    System.arraycopy(zc.a(1), 0, this.b, i + 6, 2);
    i += 8;
    System.arraycopy(zc.a(paramzawp.a()), 0, this.b, i, 2);
    i += 2;
    String str = paramzawp.n;
    System.arraycopy(zc.a((short)str.length()), 0, this.b, i, 2);
    i += 2;
    i += zct.b(this.b, i, str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */