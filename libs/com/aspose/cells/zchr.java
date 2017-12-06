package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zchr
  extends zche
{
  zchr(Protection paramProtection)
  {
    this.d = 535;
    this.c = new byte[66];
    System.arraycopy(zc.a(paramProtection.b()), 0, this.c, 0, 2);
    if (!paramProtection.getAllowEditingContent()) {
      this.c[2] = 1;
    }
    if (paramProtection.getAllowEditingObject()) {
      this.c[6] = 1;
    }
    if (paramProtection.getAllowEditingScenario()) {
      this.c[10] = 1;
    }
    if (paramProtection.getAllowFormattingCell()) {
      this.c[14] = 1;
    }
    if (paramProtection.getAllowFormattingColumn()) {
      this.c[18] = 1;
    }
    if (paramProtection.getAllowFormattingRow()) {
      this.c[22] = 1;
    }
    if (paramProtection.getAllowInsertingColumn()) {
      this.c[26] = 1;
    }
    if (paramProtection.getAllowInsertingRow()) {
      this.c[30] = 1;
    }
    if (paramProtection.getAllowInsertingHyperlink()) {
      this.c[34] = 1;
    }
    if (paramProtection.getAllowDeletingColumn()) {
      this.c[38] = 1;
    }
    if (paramProtection.getAllowDeletingRow()) {
      this.c[42] = 1;
    }
    if (paramProtection.getAllowSelectingLockedCell()) {
      this.c[46] = 1;
    }
    if (paramProtection.getAllowSorting()) {
      this.c[50] = 1;
    }
    if (paramProtection.getAllowFiltering()) {
      this.c[54] = 1;
    }
    if (paramProtection.getAllowUsingPivotTable()) {
      this.c[58] = 1;
    }
    if (paramProtection.getAllowSelectingUnlockedCell()) {
      this.c[62] = 1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */