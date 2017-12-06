package com.aspose.cells;

import java.util.Comparator;

class zady
  implements Comparator
{
  public int compare(Object x, Object y)
  {
    zaea localzaea1 = (zaea)x;
    zaea localzaea2 = (zaea)y;
    if (localzaea1.b() < localzaea2.b()) {
      return -1;
    }
    if (localzaea1.b() > localzaea2.b()) {
      return 1;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zady.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */