package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbm
  extends zche
{
  zcbm(PivotTable paramPivotTable)
  {
    this.d = 314;
    int i = 36;
    this.c = new byte[i];
    System.arraycopy(zc.a(paramPivotTable.i), 0, this.c, 0, 4);
    System.arraycopy(zc.a(paramPivotTable.j), 0, this.c, 4, 4);
    System.arraycopy(zc.a(paramPivotTable.k), 0, this.c, 8, 4);
    System.arraycopy(zc.a(paramPivotTable.l), 0, this.c, 12, 4);
    System.arraycopy(zc.a(paramPivotTable.m), 0, this.c, 16, 4);
    System.arraycopy(zc.a(paramPivotTable.n), 0, this.c, 20, 4);
    System.arraycopy(zc.a(paramPivotTable.o), 0, this.c, 24, 4);
    if ((paramPivotTable.getPageFieldWrapCount() == paramPivotTable.getPageFields().getCount()) || (paramPivotTable.getPageFieldWrapCount() == 0))
    {
      System.arraycopy(zc.a(paramPivotTable.getPageFields().getCount()), 0, this.c, 28, 4);
      if (paramPivotTable.getPageFields().getCount() > 0) {
        System.arraycopy(zc.a(1), 0, this.c, 32, 4);
      }
    }
    else
    {
      System.arraycopy(zc.a(paramPivotTable.getPageFieldWrapCount()), 0, this.c, 28, 4);
      int j = paramPivotTable.getPageFields().getCount();
      if ((j > 0) && (paramPivotTable.getPageFieldWrapCount() > 0))
      {
        int k = j / paramPivotTable.getPageFieldWrapCount() + (j % paramPivotTable.getPageFieldWrapCount() != 0 ? 1 : 0);
        System.arraycopy(zc.a(k), 0, this.c, 32, 4);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */