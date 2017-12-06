package com.aspose.cells;

import java.util.Comparator;

class zbxe
  implements Comparator
{
  public int compare(Object x, Object y)
  {
    zbxf localzbxf1 = (zbxf)x;
    zbxf localzbxf2 = (zbxf)y;
    if (localzbxf1.u() > localzbxf2.u()) {
      return 1;
    }
    if (localzbxf1.u() == localzbxf2.u())
    {
      if (localzbxf1.t() < localzbxf2.t()) {
        return -1;
      }
      if (localzbxf1.t() > localzbxf2.t()) {
        return 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */