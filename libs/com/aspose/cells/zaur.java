package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaur
  extends zcd
{
  zaur()
  {
    c(2187);
  }
  
  void a(Worksheet paramWorksheet)
  {
    b(16);
    this.b = new byte[d()];
    this.b[0] = -117;
    this.b[1] = 8;
    if (paramWorksheet.y() != null) {
      System.arraycopy(zc.a(paramWorksheet.y()[2]), 0, this.b, 12, 2);
    } else {
      this.b[12] = 100;
    }
    this.b[14] = 64;
    if (paramWorksheet.getViewType() == 2)
    {
      byte[] tmp94_89 = this.b;
      tmp94_89[14] = ((byte)(tmp94_89[14] | 0x1));
    }
    if (paramWorksheet.isRulerVisible())
    {
      byte[] tmp113_108 = this.b;
      tmp113_108[14] = ((byte)(tmp113_108[14] | 0x2));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */