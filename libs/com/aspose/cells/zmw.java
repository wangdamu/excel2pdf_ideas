package com.aspose.cells;

import java.util.Comparator;

class zmw
  implements Comparator
{
  public int compare(Object x, Object y)
  {
    Comment localComment1 = (Comment)x;
    Comment localComment2 = (Comment)y;
    if (localComment1.getRow() < localComment2.getRow()) {
      return -1;
    }
    if (localComment1.getRow() > localComment2.getRow()) {
      return 1;
    }
    return localComment1.getColumn() - localComment2.getColumn();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */