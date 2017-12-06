package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcif
  extends zche
{
  zcif(TableStyleElement paramTableStyleElement)
  {
    this.d = 512;
    this.c = new byte[12];
    if (paramTableStyleElement.getType() == 29) {
      System.arraycopy(zc.a(zcij.G(10)), 0, this.c, 0, 4);
    } else if (paramTableStyleElement.getType() == 28) {
      System.arraycopy(zc.a(zcij.G(7)), 0, this.c, 0, 4);
    } else {
      System.arraycopy(zc.a(zcij.G(paramTableStyleElement.getType())), 0, this.c, 0, 4);
    }
    System.arraycopy(zc.a(paramTableStyleElement.getSize()), 0, this.c, 4, 4);
    System.arraycopy(zc.a(paramTableStyleElement.a), 0, this.c, 8, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */