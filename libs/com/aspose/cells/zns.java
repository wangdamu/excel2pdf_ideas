package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;

class zns
  extends zcd
{
  zns()
  {
    c(2175);
    b(12);
  }
  
  void a(FilterColumn paramFilterColumn, Object paramObject)
  {
    String str = zs.a(paramObject);
    byte[] arrayOfByte = Encoding.getUnicode().a(str);
    b(d() + (short)(11 + arrayOfByte.length));
    this.b = new byte[d()];
    int i = a(paramFilterColumn.c().a().i());
    this.b[i] = 6;
    this.b[(i + 1)] = 2;
    this.b[(i + 2)] = ((byte)(arrayOfByte.length / 2));
    if ((str.indexOf('?') < 0) && (str.indexOf('*') < 0)) {
      this.b[(i + 3)] = 1;
    }
    i += 10;
    this.b[i] = 1;
    i++;
    System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
  }
  
  void a(FilterColumn paramFilterColumn, DateTimeGroupItem paramDateTimeGroupItem)
  {
    b(d() + 24);
    this.b = new byte[d()];
    int i = a(paramFilterColumn.c().a().i());
    System.arraycopy(zc.a((short)paramDateTimeGroupItem.getYear()), 0, this.b, i, 2);
    System.arraycopy(zc.a((short)paramDateTimeGroupItem.getMonth()), 0, this.b, i + 2, 2);
    System.arraycopy(zc.a(paramDateTimeGroupItem.getDay()), 0, this.b, i + 4, 4);
    System.arraycopy(zc.a((short)paramDateTimeGroupItem.getHour()), 0, this.b, i + 8, 2);
    System.arraycopy(zc.a((short)paramDateTimeGroupItem.getMinute()), 0, this.b, i + 10, 2);
    System.arraycopy(zc.a((short)paramDateTimeGroupItem.getSecond()), 0, this.b, i + 12, 2);
    i += 20;
    int j = 0;
    switch (paramDateTimeGroupItem.getDateTimeGroupingType())
    {
    case 3: 
      j = 1;
      break;
    case 0: 
      j = 2;
      break;
    case 1: 
      j = 3;
      break;
    case 2: 
      j = 4;
      break;
    case 4: 
      j = 5;
    }
    if (j != 0) {
      System.arraycopy(zc.a(paramDateTimeGroupItem.getDay()), 0, this.b, i, 4);
    }
  }
  
  void a(FilterColumn paramFilterColumn)
  {
    b(d() + 10);
    this.b = new byte[d()];
    int i = a(paramFilterColumn.c().a().i());
    this.b[i] = 12;
    this.b[(i + 1)] = 2;
  }
  
  private int a(CellArea paramCellArea)
  {
    this.b[0] = Byte.MAX_VALUE;
    this.b[1] = 8;
    this.b[2] = 1;
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, this.b, 4, 2);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, this.b, 6, 2);
    System.arraycopy(zc.a(paramCellArea.StartColumn), 0, this.b, 8, 2);
    System.arraycopy(zc.a(paramCellArea.EndColumn), 0, this.b, 10, 2);
    return 12;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */