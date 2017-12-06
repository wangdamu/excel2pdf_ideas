package com.aspose.cells;

import java.util.Comparator;

class zrm
  implements Comparator
{
  public int compare(Object obj1, Object obj2)
  {
    zrl localzrl1 = (zrl)obj1;
    zrl localzrl2 = (zrl)obj2;
    int i = zauj.af(localzrl1.b);
    int j = zauj.af(localzrl2.b);
    if (i > j) {
      return 1;
    }
    if (j > i) {
      return -1;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */