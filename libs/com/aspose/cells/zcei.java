package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcei
  extends zche
{
  zcei(PivotTable paramPivotTable)
    throws Exception
  {
    this.d = 513;
    int i = 2;
    if (paramPivotTable.getPivotTableStyleName() != null) {
      i += paramPivotTable.getPivotTableStyleName().length() * 2 + 4;
    } else {
      i += 4;
    }
    this.c = new byte[i];
    int j = 0;
    if (paramPivotTable.getShowPivotStyleLastColumn()) {
      j = (byte)(j | 0x2);
    }
    if (paramPivotTable.getShowPivotStyleRowStripes()) {
      j = (byte)(j | 0x4);
    }
    if (paramPivotTable.getShowPivotStyleColumnStripes()) {
      j = (byte)(j | 0x8);
    }
    if (paramPivotTable.getShowPivotStyleRowHeader()) {
      j = (byte)(j | 0x10);
    }
    if (paramPivotTable.getShowPivotStyleColumnHeader()) {
      j = (byte)(j | 0x20);
    }
    this.c[0] = j;
    int k = 2;
    if (paramPivotTable.getPivotTableStyleName() != null) {
      k = zcgj.a(this.c, k, paramPivotTable.getPivotTableStyleName());
    } else {
      System.arraycopy(zc.a(-1), 0, this.c, k, 4);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */