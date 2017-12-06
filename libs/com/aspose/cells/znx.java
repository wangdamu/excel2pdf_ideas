package com.aspose.cells;

import java.util.Comparator;

class znx
  implements Comparator
{
  public int compare(Object x, Object y)
  {
    int i = ((zbme)x).b() & 0xFFFF & 0x3FFF;
    int j = ((zbme)y).b() & 0xFFFF & 0x3FFF;
    return i - j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/znx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */