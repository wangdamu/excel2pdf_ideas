package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcff
  extends zche
{
  zcff(PageSetup paramPageSetup)
  {
    this.d = 652;
    this.c = new byte[24];
    int i = 0;
    if (paramPageSetup.e())
    {
      if (paramPageSetup.getOrientation() == 0) {
        i |= 0x1;
      }
      System.arraycopy(zc.a(paramPageSetup.c()), 0, this.c, 0, 4);
      System.arraycopy(zc.a(paramPageSetup.f()), 0, this.c, 4, 4);
      System.arraycopy(zc.a(paramPageSetup.g()), 0, this.c, 8, 4);
      System.arraycopy(zc.a(paramPageSetup.getPrintCopies()), 0, this.c, 12, 4);
    }
    if (!paramPageSetup.isAutoFirstPageNumber())
    {
      System.arraycopy(zc.a(paramPageSetup.getFirstPageNumber()), 0, this.c, 16, 2);
      i |= 0x10;
    }
    if (paramPageSetup.getBlackAndWhite()) {
      i |= 0x4;
    }
    if (paramPageSetup.getPrintDraft()) {
      i |= 0x20;
    }
    System.arraycopy(zc.a(i), 0, this.c, 18, 2);
    byte[] arrayOfByte = { -1, -1, -1, -1 };
    System.arraycopy(arrayOfByte, 0, this.c, 20, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */