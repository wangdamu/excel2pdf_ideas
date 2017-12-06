package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zxa
  extends zcd
{
  zxa()
  {
    c(2152);
  }
  
  void a(ErrorCheckOption paramErrorCheckOption)
  {
    a((short)(paramErrorCheckOption.a.size() * 8 + 31));
    this.b = new byte[d()];
    int i = 0;
    this.b[i] = 104;
    this.b[(i + 1)] = 8;
    i += 12;
    this.b[i] = 3;
    i += 7;
    System.arraycopy(zc.a(paramErrorCheckOption.a.size()), 0, this.b, i, 2);
    i += 2;
    this.b[i] = 4;
    i += 6;
    Iterator localIterator = paramErrorCheckOption.a.iterator();
    while (localIterator.hasNext())
    {
      CellArea localCellArea = (CellArea)localIterator.next();
      System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, i, 2);
      System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, i + 2, 2);
      System.arraycopy(zc.a(localCellArea.StartColumn), 0, this.b, i + 4, 2);
      System.arraycopy(zc.a(localCellArea.EndColumn), 0, this.b, i + 6, 2);
      i += 8;
    }
    System.arraycopy(zc.a(paramErrorCheckOption.b), 0, this.b, i, 2);
    i += 4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */