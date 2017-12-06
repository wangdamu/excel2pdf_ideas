package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcfn
  extends zche
{
  zcfn()
  {
    this.d = 171;
  }
  
  void a(DynamicFilter paramDynamicFilter)
  {
    this.c = new byte[21];
    System.arraycopy(zc.a(zcij.u(paramDynamicFilter.getDynamicFilterType())), 0, this.c, 0, 4);
    if (paramDynamicFilter.getMaxValue() != null) {
      this.c[4] = 1;
    }
    System.arraycopy(zc.a(((Double)paramDynamicFilter.getValue()).doubleValue()), 0, this.c, 5, 8);
    if (paramDynamicFilter.getMaxValue() != null) {
      System.arraycopy(zc.a(((Double)paramDynamicFilter.getMaxValue()).doubleValue()), 0, this.c, 13, 8);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */