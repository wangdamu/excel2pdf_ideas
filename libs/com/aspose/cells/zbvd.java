package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.Iterator;

class zbvd
  extends zcd
{
  zbvd()
  {
    c(180);
  }
  
  void a(PivotFieldCollection paramPivotFieldCollection)
  {
    a((short)(paramPivotFieldCollection.getCount() * 2));
    this.b = new byte[d()];
    int i = 0;
    Iterator localIterator = paramPivotFieldCollection.a.iterator();
    while (localIterator.hasNext())
    {
      PivotField localPivotField = (PivotField)localIterator.next();
      System.arraycopy(zc.a((short)localPivotField.getBaseIndex()), 0, this.b, i, 2);
      i += 2;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */