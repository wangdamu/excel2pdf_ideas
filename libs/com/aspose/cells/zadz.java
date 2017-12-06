package com.aspose.cells;

import java.util.Comparator;

class zadz
  implements Comparator
{
  public int compare(Object x, Object y)
  {
    zaeb localzaeb1 = (zaeb)x;
    zaeb localzaeb2 = (zaeb)y;
    if (localzaeb1.b() < localzaeb2.b()) {
      return -1;
    }
    if (localzaeb1.b() > localzaeb2.b()) {
      return 1;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zadz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */