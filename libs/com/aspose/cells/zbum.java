package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbum
  extends zcd
{
  zbum(zbui paramzbui)
  {
    c(246);
    b(8);
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramzbui.a), 0, this.b, 0, 2);
    System.arraycopy(zc.a(paramzbui.b), 0, this.b, 2, 2);
    System.arraycopy(zc.a(paramzbui.c), 0, this.b, 4, 2);
    if (paramzbui.a() != null) {
      System.arraycopy(zc.a(paramzbui.b().getCount()), 0, this.b, 6, 2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */