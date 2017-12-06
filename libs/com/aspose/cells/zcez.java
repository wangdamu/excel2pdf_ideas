package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcez
  extends zche
{
  zcez()
  {
    this.d = 168;
  }
  
  void a(ColorFilter paramColorFilter)
  {
    this.c = new byte[8];
    System.arraycopy(zc.a(paramColorFilter.a()), 0, this.c, 0, 4);
    if (paramColorFilter.getFilterByFillColor()) {
      this.c[4] = 1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */