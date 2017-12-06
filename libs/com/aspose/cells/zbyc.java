package com.aspose.cells;

import java.util.Comparator;

class zbyc
  implements Comparator
{
  public int compare(Object a, Object b)
  {
    VerticalPageBreak localVerticalPageBreak1 = (VerticalPageBreak)a;
    VerticalPageBreak localVerticalPageBreak2 = (VerticalPageBreak)b;
    if (localVerticalPageBreak1.getColumn() > localVerticalPageBreak2.getColumn()) {
      return 1;
    }
    if (localVerticalPageBreak1.getColumn() == localVerticalPageBreak2.getColumn())
    {
      if (localVerticalPageBreak1.getStartRow() > localVerticalPageBreak2.getStartRow()) {
        return 1;
      }
      return -1;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */