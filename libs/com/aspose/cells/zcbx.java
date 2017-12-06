package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbx
  extends zche
{
  zcbx()
  {
    this.d = 158;
  }
  
  void a(Workbook paramWorkbook)
  {
    WorksheetCollection localWorksheetCollection = paramWorkbook.getWorksheets();
    WorkbookSettings localWorkbookSettings = paramWorkbook.getSettings();
    this.c = new byte[29];
    System.arraycopy(zc.a(localWorkbookSettings.s()), 0, this.c, 0, 4);
    System.arraycopy(zc.a(localWorkbookSettings.t()), 0, this.c, 4, 4);
    System.arraycopy(zc.a(localWorkbookSettings.u()), 0, this.c, 8, 4);
    System.arraycopy(zc.a(localWorkbookSettings.v()), 0, this.c, 12, 4);
    System.arraycopy(zc.a(localWorkbookSettings.getSheetTabBarWidth()), 0, this.c, 16, 4);
    System.arraycopy(zc.a(localWorksheetCollection.P()), 0, this.c, 20, 4);
    System.arraycopy(zc.a(localWorksheetCollection.getActiveSheetIndex()), 0, this.c, 24, 4);
    int i = 64;
    if (localWorkbookSettings.isHidden()) {
      i |= 0x1;
    }
    if (localWorkbookSettings.isMinimized()) {
      i |= 0x4;
    }
    if (localWorkbookSettings.isHScrollBarVisible()) {
      i |= 0x8;
    }
    if (localWorkbookSettings.isVScrollBarVisible()) {
      i |= 0x10;
    }
    if (localWorkbookSettings.getShowTabs()) {
      i |= 0x20;
    }
    this.c[28] = ((byte)i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */