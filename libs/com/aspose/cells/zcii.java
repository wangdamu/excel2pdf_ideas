package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcii
  extends zche
{
  zcii()
  {
    this.d = 170;
  }
  
  void a(Top10Filter paramTop10Filter)
  {
    this.c = new byte[17];
    int i = 0;
    if (paramTop10Filter.isTop()) {
      i = (byte)(i | 0x1);
    }
    if (paramTop10Filter.isPercent()) {
      i = (byte)(i | 0x2);
    }
    if (paramTop10Filter.getCriteria() != null) {
      i = (byte)(i | 0x4);
    }
    this.c[0] = i;
    System.arraycopy(zc.a(paramTop10Filter.getItems()), 0, this.c, 1, 8);
    if (paramTop10Filter.getCriteria() != null) {
      System.arraycopy(zc.a(((Double)paramTop10Filter.getCriteria()).doubleValue()), 0, this.c, 9, 8);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */