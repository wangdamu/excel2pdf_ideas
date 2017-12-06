package com.aspose.cells;

import java.util.Comparator;

class zadx
  implements Comparator
{
  public int compare(Object x, Object y)
  {
    zadt localzadt1 = (zadt)x;
    zadt localzadt2 = (zadt)y;
    if (localzadt1.c() < localzadt2.c()) {
      return -1;
    }
    if (localzadt1.c() > localzadt2.c()) {
      return 1;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zadx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */