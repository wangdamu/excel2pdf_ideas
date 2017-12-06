package com.aspose.cells;

import java.util.Comparator;

class zbfg
  implements Comparator
{
  public int compare(Object x, Object y)
  {
    zbfc localzbfc1 = (zbfc)x;
    zbfc localzbfc2 = (zbfc)y;
    if (localzbfc1.ac() > localzbfc2.ac()) {
      return 1;
    }
    if (localzbfc1.ac() == localzbfc2.ac())
    {
      if (localzbfc1.ai() < localzbfc2.ai()) {
        return -1;
      }
      if (localzbfc1.ai() > localzbfc2.ai()) {
        return 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */