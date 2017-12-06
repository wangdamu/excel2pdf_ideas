package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcgn
  extends zche
{
  zcgn(PageSetup paramPageSetup)
  {
    this.d = 476;
    this.c = new byte[48];
    System.arraycopy(zc.a(paramPageSetup.getLeftMarginInch()), 0, this.c, 0, 8);
    System.arraycopy(zc.a(paramPageSetup.getRightMarginInch()), 0, this.c, 8, 8);
    System.arraycopy(zc.a(paramPageSetup.getTopMarginInch()), 0, this.c, 16, 8);
    System.arraycopy(zc.a(paramPageSetup.getBottomMarginInch()), 0, this.c, 24, 8);
    System.arraycopy(zc.a(paramPageSetup.getHeaderMarginInch()), 0, this.c, 32, 8);
    System.arraycopy(zc.a(paramPageSetup.getFooterMarginInch()), 0, this.c, 40, 8);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */