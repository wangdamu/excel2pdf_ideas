package com.aspose.cells;

import java.util.Comparator;

class zafp
  implements Comparator
{
  public int compare(Object obj1, Object obj2)
  {
    CellArea localCellArea1 = ((Hyperlink)obj1).getArea();
    CellArea localCellArea2 = ((Hyperlink)obj2).getArea();
    if (localCellArea1.StartRow > localCellArea2.StartRow) {
      return 1;
    }
    if (localCellArea1.StartRow < localCellArea2.StartRow) {
      return -1;
    }
    if (localCellArea1.StartColumn > localCellArea2.StartColumn) {
      return 1;
    }
    if (localCellArea1.StartColumn < localCellArea2.StartColumn) {
      return -1;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */