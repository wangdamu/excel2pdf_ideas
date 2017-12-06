package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcfj
  extends zche
{
  zcfj()
  {
    this.d = 175;
  }
  
  void a(DateTimeGroupItem paramDateTimeGroupItem)
  {
    this.c = new byte[24];
    System.arraycopy(zc.a(paramDateTimeGroupItem.getYear()), 0, this.c, 0, 2);
    System.arraycopy(zc.a(paramDateTimeGroupItem.getMonth()), 0, this.c, 2, 2);
    System.arraycopy(zc.a(paramDateTimeGroupItem.getDay()), 0, this.c, 4, 4);
    System.arraycopy(zc.a(paramDateTimeGroupItem.getHour()), 0, this.c, 8, 2);
    System.arraycopy(zc.a(paramDateTimeGroupItem.getMinute()), 0, this.c, 10, 2);
    System.arraycopy(zc.a(paramDateTimeGroupItem.getSecond()), 0, this.c, 12, 2);
    System.arraycopy(zc.a(zcij.y(paramDateTimeGroupItem.getDateTimeGroupingType())), 0, this.c, 20, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */