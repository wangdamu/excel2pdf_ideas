package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcaw
  extends zche
{
  zcaw()
  {
    this.d = 1046;
  }
  
  void a(FormatConditionCollection paramFormatConditionCollection)
    throws Exception
  {
    zcfz localzcfz = new zcfz(paramFormatConditionCollection);
    int i = localzcfz.c() + 8;
    this.c = new byte[i];
    int j = localzcfz.b(this.c, 0);
    System.arraycopy(zc.a(paramFormatConditionCollection.getCount()), 0, this.c, j, 4);
    j += 4;
    if (paramFormatConditionCollection.d) {
      this.c[j] = 1;
    }
    j += 4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */