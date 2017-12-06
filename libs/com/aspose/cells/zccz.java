package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zccz
  extends zche
{
  zccz(PivotFilter paramPivotFilter)
    throws Exception
  {
    this.d = 601;
    int i = 30;
    if (paramPivotFilter.j != null) {
      i += paramPivotFilter.j.length() * 2 + 4;
    }
    if (paramPivotFilter.getValue1() != null) {
      i += paramPivotFilter.getValue1().length() * 2 + 4;
    }
    if (paramPivotFilter.getValue2() != null) {
      i += paramPivotFilter.getValue2().length() * 2 + 4;
    }
    this.c = new byte[i];
    System.arraycopy(zc.a(paramPivotFilter.getFieldIndex()), 0, this.c, 0, 4);
    System.arraycopy(zc.a(paramPivotFilter.i), 0, this.c, 4, 4);
    System.arraycopy(zc.a(zcij.K(paramPivotFilter.getFilterType())), 0, this.c, 8, 4);
    System.arraycopy(zc.a(paramPivotFilter.getEvaluationOrder()), 0, this.c, 12, 4);
    System.arraycopy(zc.a(paramPivotFilter.c), 0, this.c, 16, 4);
    System.arraycopy(zc.a(paramPivotFilter.d), 0, this.c, 20, 4);
    this.c[24] = -1;
    this.c[25] = -1;
    this.c[26] = -1;
    this.c[27] = -1;
    short s = 0;
    if (paramPivotFilter.j != null) {
      s = (short)(s | 0x1);
    }
    if (paramPivotFilter.getValue1() != null) {
      s = (short)(s | 0x4);
    }
    if (paramPivotFilter.getValue2() != null) {
      s = (short)(s | 0x8);
    }
    System.arraycopy(zc.a(s), 0, this.c, 28, 2);
    int j = 30;
    if (paramPivotFilter.j != null) {
      j = zcgj.a(this.c, j, paramPivotFilter.j);
    }
    if (paramPivotFilter.getValue1() != null) {
      j = zcgj.a(this.c, j, paramPivotFilter.getValue1());
    }
    if (paramPivotFilter.getValue2() != null) {
      j = zcgj.a(this.c, j, paramPivotFilter.getValue2());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zccz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */