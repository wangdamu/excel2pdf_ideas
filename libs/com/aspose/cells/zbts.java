package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbts
  extends zcd
{
  zbts()
  {
    c(197);
  }
  
  void a(zbtq paramzbtq)
  {
    a((short)(14 + (paramzbtq.g == null ? 0 : zct.a(paramzbtq.b()))));
    this.b = new byte[d()];
    int i = 0;
    System.arraycopy(zc.a((short)paramzbtq.h.getBaseIndex()), 0, this.b, i, 2);
    System.arraycopy(zc.a((short)paramzbtq.a), 0, this.b, i + 2, 2);
    System.arraycopy(zc.a(paramzbtq.b), 0, this.b, i + 4, 2);
    System.arraycopy(zc.a((short)paramzbtq.c), 0, this.b, i + 6, 2);
    if (paramzbtq.h.getBaseItemPosition() == 0) {
      System.arraycopy(zc.a(32763), 0, this.b, i + 8, 2);
    } else if (paramzbtq.h.getBaseItemPosition() == 1) {
      System.arraycopy(zc.a(32764), 0, this.b, i + 8, 2);
    } else {
      System.arraycopy(zc.a((short)paramzbtq.d), 0, this.b, i + 8, 2);
    }
    System.arraycopy(zc.a(paramzbtq.e), 0, this.b, i + 10, 2);
    i += 12;
    if (paramzbtq.g == null)
    {
      this.b[(i++)] = -1;
      this.b[(i++)] = -1;
    }
    else
    {
      String str = paramzbtq.b();
      System.arraycopy(zc.a((short)str.length()), 0, this.b, i, 2);
      i += 2;
      i += zct.b(this.b, i, str);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */