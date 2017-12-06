package com.aspose.cells;

import java.util.Comparator;

class zael
  implements Comparator
{
  public int compare(Object a, Object b)
  {
    HorizontalPageBreak localHorizontalPageBreak1 = (HorizontalPageBreak)a;
    HorizontalPageBreak localHorizontalPageBreak2 = (HorizontalPageBreak)b;
    if (localHorizontalPageBreak1.getRow() > localHorizontalPageBreak2.getRow()) {
      return 1;
    }
    if (localHorizontalPageBreak1.getRow() == localHorizontalPageBreak2.getRow())
    {
      if (localHorizontalPageBreak1.getStartColumn() > localHorizontalPageBreak2.getStartColumn()) {
        return 1;
      }
      return -1;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zael.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */