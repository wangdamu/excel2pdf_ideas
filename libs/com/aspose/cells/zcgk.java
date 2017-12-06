package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcgk
  extends zche
{
  zcgk()
  {
    this.d = 169;
  }
  
  void a(IconFilter paramIconFilter)
  {
    this.c = new byte[8];
    System.arraycopy(zc.a(zcij.r(paramIconFilter.getIconSetType())), 0, this.c, 0, 4);
    System.arraycopy(zc.a(paramIconFilter.getIconId()), 0, this.c, 4, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */