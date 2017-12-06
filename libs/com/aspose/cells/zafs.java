package com.aspose.cells;

import java.util.Comparator;

class zafs
  implements Comparator
{
  public int compare(Object obj1, Object obj2)
  {
    zafr localzafr1 = (zafr)obj1;
    zafr localzafr2 = (zafr)obj2;
    if (localzafr1.a() > localzafr2.a()) {
      return 1;
    }
    if (localzafr1.a() < localzafr2.a()) {
      return -1;
    }
    if (localzafr1.c() > localzafr2.c()) {
      return 1;
    }
    if (localzafr1.c() < localzafr2.c()) {
      return -1;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */