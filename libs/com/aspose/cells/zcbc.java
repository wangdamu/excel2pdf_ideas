package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.Iterator;

class zcbc
  extends zche
{
  zcbc(int paramInt, PivotFieldCollection paramPivotFieldCollection)
  {
    this.d = paramInt;
    int i = 4 + paramPivotFieldCollection.getCount() * 4;
    this.c = new byte[i];
    System.arraycopy(zc.a(paramPivotFieldCollection.getCount()), 0, this.c, 0, 4);
    int j = 4;
    Iterator localIterator = paramPivotFieldCollection.a.iterator();
    while (localIterator.hasNext())
    {
      PivotField localPivotField = (PivotField)localIterator.next();
      System.arraycopy(zc.a(localPivotField.getBaseIndex()), 0, this.c, j, 4);
      j += 4;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */