package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcfh
  extends zche
{
  zcfh(Protection paramProtection)
  {
    this.d = 669;
    this.c = new byte[10];
    System.arraycopy(zc.a(paramProtection.b()), 0, this.c, 0, 2);
    if (!paramProtection.getAllowEditingContent()) {
      this.c[2] = 1;
    }
    if (!paramProtection.getAllowEditingObject()) {
      this.c[6] = 1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */