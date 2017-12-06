package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcav
  extends zche
{
  zcav()
  {
    this.d = 461;
  }
  
  void a(FormatConditionCollection paramFormatConditionCollection)
  {
    int i = 12 + paramFormatConditionCollection.b.size() * 16;
    this.c = new byte[i];
    System.arraycopy(zc.a(paramFormatConditionCollection.getCount()), 0, this.c, 0, 4);
    if (paramFormatConditionCollection.d) {
      this.c[4] = 1;
    }
    zcgj.a(paramFormatConditionCollection.b, this.c, 8);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */