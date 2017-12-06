package com.aspose.cells;

class zcdf
  extends zche
{
  zcdf(PivotTable paramPivotTable)
  {
    this.d = 1062;
    int i = 9;
    i += 12;
    this.c = new byte[i];
    int j = 0;
    if (!paramPivotTable.J) {
      j = (byte)(j | 0x10);
    }
    if (paramPivotTable.getEnableDataValueEditing()) {
      j = (byte)(j | 0x4);
    }
    this.c[4] = j;
    int k = 9;
    for (int m = k; m < i; m++) {
      this.c[m] = -1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */