package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbv
  extends zche
{
  zcbv()
  {
    this.d = 137;
  }
  
  void a(Worksheet paramWorksheet)
  {
    this.c = new byte[30];
    int i = 0;
    if (paramWorksheet.getShowFormulas()) {
      i = (byte)(i | 0x2);
    }
    if (paramWorksheet.isGridlinesVisible()) {
      i = (byte)(i | 0x4);
    }
    if (paramWorksheet.isRowColumnHeadersVisible()) {
      i = (byte)(i | 0x8);
    }
    if (paramWorksheet.getDisplayZeros()) {
      i = (byte)(i | 0x10);
    }
    if (paramWorksheet.getDisplayRightToLeft()) {
      i = (byte)(i | 0x20);
    }
    if (paramWorksheet.isSelected()) {
      i = (byte)(i | 0x40);
    }
    if (paramWorksheet.isPageBreakPreview()) {
      i = (byte)(i | 0x80);
    }
    this.c[0] = i;
    i = 0;
    if (paramWorksheet.isOutlineShown()) {
      i = (byte)(i | 0x1);
    }
    this.c[1] = i;
    switch (paramWorksheet.getViewType())
    {
    case 2: 
      this.c[2] = 2;
      break;
    case 0: 
      break;
    case 1: 
      this.c[2] = 1;
      break;
    }
    System.arraycopy(zc.a(paramWorksheet.getFirstVisibleRow()), 0, this.c, 6, 4);
    System.arraycopy(zc.a(paramWorksheet.getFirstVisibleColumn()), 0, this.c, 10, 4);
    System.arraycopy(zc.a(paramWorksheet.B()), 0, this.c, 14, 4);
    System.arraycopy(zc.a(paramWorksheet.getZoom()), 0, this.c, 18, 2);
    this.c[20] = 100;
    this.c[22] = 60;
    this.c[24] = 100;
    this.c[26] = 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */