package com.aspose.cells;

import java.util.Comparator;

class zagg
  implements Comparator
{
  public int compare(Object o1, Object o2)
  {
    CellArea localCellArea1 = (CellArea)o1;
    CellArea localCellArea2 = (CellArea)o2;
    if (localCellArea1.StartColumn > localCellArea2.StartColumn) {
      return 1;
    }
    if (localCellArea1.StartColumn < localCellArea2.StartColumn) {
      return -1;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */