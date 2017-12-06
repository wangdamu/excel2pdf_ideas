package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcgr
  extends zche
{
  zcgr(PageSetup paramPageSetup, String paramString)
    throws Exception
  {
    this.d = 478;
    this.c = new byte[38 + (paramString == null ? 0 : paramString.length() * 2)];
    int i = 0;
    if (paramPageSetup.e())
    {
      if (paramPageSetup.getOrientation() == 0) {
        i |= 0x2;
      }
      System.arraycopy(zc.a(paramPageSetup.c()), 0, this.c, 0, 4);
      System.arraycopy(zc.a(paramPageSetup.getZoom()), 0, this.c, 4, 4);
      System.arraycopy(zc.a(paramPageSetup.f()), 0, this.c, 8, 4);
      System.arraycopy(zc.a(paramPageSetup.g()), 0, this.c, 12, 4);
      System.arraycopy(zc.a(paramPageSetup.getPrintCopies()), 0, this.c, 16, 4);
    }
    else
    {
      i |= 0x4;
    }
    if (!paramPageSetup.isAutoFirstPageNumber())
    {
      System.arraycopy(zc.a(paramPageSetup.getFirstPageNumber()), 0, this.c, 20, 4);
      i |= 0x80;
    }
    System.arraycopy(zc.a(paramPageSetup.getFitToPagesWide()), 0, this.c, 24, 4);
    System.arraycopy(zc.a(paramPageSetup.getFitToPagesTall()), 0, this.c, 28, 4);
    if (paramPageSetup.getOrder() == 1) {
      i |= 0x1;
    }
    if (paramPageSetup.getBlackAndWhite()) {
      i |= 0x8;
    }
    if (paramPageSetup.getPrintDraft()) {
      i |= 0x10;
    }
    if (paramPageSetup.getPrintComments() != 1)
    {
      i |= 0x20;
      if (paramPageSetup.getPrintComments() == 2) {
        i |= 0x100;
      }
    }
    switch (paramPageSetup.getPrintErrors())
    {
    case 0: 
      i |= 0x100;
      break;
    case 1: 
      i |= 0x200;
      break;
    case 2: 
      break;
    case 3: 
      i |= 0x300;
    }
    System.arraycopy(zc.a(i), 0, this.c, 32, 2);
    int j = zcgj.a(this.c, 34, paramString);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */