package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcax
  extends zche
{
  zcax()
  {
    this.d = 141;
  }
  
  void a(Worksheet paramWorksheet)
  {
    this.c = new byte[10];
    int i = 0;
    if (paramWorksheet.isSelected()) {
      i = (byte)(i | 0x1);
    }
    this.c[0] = i;
    System.arraycopy(zc.a(paramWorksheet.getZoom()), 0, this.c, 2, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */