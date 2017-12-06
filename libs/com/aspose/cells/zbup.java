package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.Iterator;

class zbup
  extends zcd
{
  zbup()
  {
    c(182);
  }
  
  void a(PivotFieldCollection paramPivotFieldCollection)
  {
    a((short)(6 * paramPivotFieldCollection.getCount()));
    this.b = new byte[d()];
    int i = 0;
    int j = paramPivotFieldCollection.d;
    Iterator localIterator = paramPivotFieldCollection.a.iterator();
    while (localIterator.hasNext())
    {
      PivotField localPivotField = (PivotField)localIterator.next();
      System.arraycopy(zc.a((short)localPivotField.getBaseIndex()), 0, this.b, i, 2);
      System.arraycopy(zc.a(localPivotField.j.b), 0, this.b, i + 2, 2);
      System.arraycopy(zc.a(j++), 0, this.b, i + 4, 2);
      i += 6;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */