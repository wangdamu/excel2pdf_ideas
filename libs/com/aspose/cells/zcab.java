package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zcab
{
  Worksheet a;
  ArrayList b;
  
  zcab(Worksheet paramWorksheet)
  {
    this.a = paramWorksheet;
    a();
  }
  
  private void a()
  {
    if ((this.a.b != null) && (this.a.b.getCount() != 0))
    {
      this.b = new ArrayList();
      Iterator localIterator = this.a.b.iterator();
      while (localIterator.hasNext())
      {
        PivotTable localPivotTable = (PivotTable)localIterator.next();
        zrj localzrj = new zrj(localPivotTable, "0");
        zf.a(this.b, localzrj);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */