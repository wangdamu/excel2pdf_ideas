package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zeh
  extends zche
{
  zeh(WorkbookSettings paramWorkbookSettings)
  {
    this.d = 157;
    this.c = new byte[26];
    int i = 0;
    if (!paramWorkbookSettings.getReCalculateOnOpen()) {
      System.arraycopy(zc.a(zauj.F(paramWorkbookSettings.b)), 0, this.c, i, 4);
    }
    i += 4;
    switch (paramWorkbookSettings.getCalcMode())
    {
    case 0: 
      this.c[i] = 1;
      break;
    case 1: 
      this.c[i] = 2;
      break;
    }
    i += 4;
    if (paramWorkbookSettings.getIteration())
    {
      System.arraycopy(zc.a(paramWorkbookSettings.getMaxIteration()), 0, this.c, i, 4);
      System.arraycopy(zc.a(paramWorkbookSettings.getMaxChange()), 0, this.c, i + 4, 8);
    }
    i += 12;
    this.c[i] = 1;
    i += 4;
    int j = 0;
    if (paramWorkbookSettings.getReCalculateOnOpen()) {
      j |= 0x1;
    }
    if (!paramWorkbookSettings.e()) {
      j |= 0x2;
    }
    if (paramWorkbookSettings.getIteration()) {
      j |= 0x4;
    }
    if (!paramWorkbookSettings.getPrecisionAsDisplayed()) {
      j |= 0x8;
    }
    if (paramWorkbookSettings.getRecalculateBeforeSave()) {
      j |= 0x20;
    }
    System.arraycopy(zc.a(j), 0, this.c, i, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zeh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */