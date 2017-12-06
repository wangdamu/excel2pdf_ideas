package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;

class zccx
  extends zche
{
  zccx(PivotFormatCondition paramPivotFormatCondition)
  {
    this.d = 1147;
    this.c = new byte[32];
    FormatConditionCollection localFormatConditionCollection = paramPivotFormatCondition.a();
    if ((localFormatConditionCollection != null) && (localFormatConditionCollection.getCount() > 0)) {
      System.arraycopy(localFormatConditionCollection.get(0).b().a(), 0, this.c, 4, 16);
    }
    System.arraycopy(zc.a(zcij.M(paramPivotFormatCondition.d)), 0, this.c, 20, 4);
    System.arraycopy(zc.a(zcij.O(paramPivotFormatCondition.e)), 0, this.c, 24, 4);
    System.arraycopy(zc.a(paramPivotFormatCondition.c), 0, this.c, 28, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zccx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */