package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbvo
  extends zcd
{
  zbvo(TableStyleElement paramTableStyleElement)
  {
    c(2192);
    b(24);
    this.b = new byte[d()];
    this.b[0] = -112;
    this.b[1] = 8;
    System.arraycopy(zc.a(zcij.G(paramTableStyleElement.getType())), 0, this.b, 12, 4);
    System.arraycopy(zc.a(paramTableStyleElement.getSize()), 0, this.b, 16, 4);
    System.arraycopy(zc.a(paramTableStyleElement.a), 0, this.b, 20, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */