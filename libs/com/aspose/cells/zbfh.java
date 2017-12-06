package com.aspose.cells;

import java.util.Comparator;

class zbfh
  implements Comparator
{
  public int compare(Object x, Object y)
  {
    zbfd localzbfd1 = (zbfd)x;
    zbfd localzbfd2 = (zbfd)y;
    if (localzbfd1.ae() > localzbfd2.ae()) {
      return 1;
    }
    if (localzbfd1.ae() == localzbfd2.ae())
    {
      if (localzbfd1.ak() < localzbfd2.ak()) {
        return -1;
      }
      if (localzbfd1.ak() > localzbfd2.ak()) {
        return 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */