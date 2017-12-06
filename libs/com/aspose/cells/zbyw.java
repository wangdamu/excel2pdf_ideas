package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbyw
  extends zcd
{
  zbyw(WorksheetCollection paramWorksheetCollection)
  {
    c(61);
    b(18);
    this.b = new byte[18];
    WorkbookSettings localWorkbookSettings = paramWorksheetCollection.p().getSettings();
    System.arraycopy(zc.a(localWorkbookSettings.s()), 0, this.b, 0, 2);
    System.arraycopy(zc.a(localWorkbookSettings.t()), 0, this.b, 2, 2);
    System.arraycopy(zc.a(localWorkbookSettings.u()), 0, this.b, 4, 2);
    System.arraycopy(zc.a(localWorkbookSettings.v()), 0, this.b, 6, 2);
    this.b[14] = 1;
    this.b[16] = 88;
    this.b[17] = 2;
    System.arraycopy(zc.a(paramWorksheetCollection.getActiveSheetIndex()), 0, this.b, 10, 2);
    System.arraycopy(zc.a(paramWorksheetCollection.P()), 0, this.b, 12, 2);
    System.arraycopy(zc.a(localWorkbookSettings.getSheetTabBarWidth()), 0, this.b, 16, 2);
    if (localWorkbookSettings.isHidden())
    {
      byte[] tmp193_188 = this.b;
      tmp193_188[8] = ((byte)(tmp193_188[8] | 0x1));
    }
    if (localWorkbookSettings.isMinimized())
    {
      byte[] tmp212_207 = this.b;
      tmp212_207[8] = ((byte)(tmp212_207[8] | 0x2));
    }
    if (localWorkbookSettings.isHScrollBarVisible())
    {
      byte[] tmp231_226 = this.b;
      tmp231_226[8] = ((byte)(tmp231_226[8] | 0x8));
    }
    if (localWorkbookSettings.isVScrollBarVisible())
    {
      byte[] tmp251_246 = this.b;
      tmp251_246[8] = ((byte)(tmp251_246[8] | 0x10));
    }
    if (localWorkbookSettings.getShowTabs())
    {
      byte[] tmp271_266 = this.b;
      tmp271_266[8] = ((byte)(tmp271_266[8] | 0x20));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */