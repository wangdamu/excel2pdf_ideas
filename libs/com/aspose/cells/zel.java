package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zel
  extends zche
{
  zel(Object paramObject)
  {
    this.d = 25;
    int i = 8;
    this.c = new byte[i];
    DateTime localDateTime = (DateTime)paramObject;
    int j = 0;
    System.arraycopy(zc.a(localDateTime.getYear()), 0, this.c, j, 2);
    j += 2;
    System.arraycopy(zc.a(localDateTime.getMonth()), 0, this.c, j, 2);
    j += 2;
    System.arraycopy(zc.a(localDateTime.getDay()), 0, this.c, j, 1);
    j++;
    System.arraycopy(zc.a(localDateTime.getHour()), 0, this.c, j, 1);
    j++;
    System.arraycopy(zc.a(localDateTime.getMinute()), 0, this.c, j, 1);
    j++;
    System.arraycopy(zc.a(localDateTime.getSecond()), 0, this.c, j, 1);
    j++;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */