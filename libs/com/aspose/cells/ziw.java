package com.aspose.cells;

import java.util.Comparator;

class ziw
  implements Comparator
{
  public int compare(Object x, Object y)
  {
    int i = ((FontSetting)x).getStartIndex();
    int j = ((FontSetting)y).getStartIndex();
    return i - j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ziw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */