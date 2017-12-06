package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcdo
  extends zche
{
  zcdo(zbos paramzbos)
  {
    if ((paramzbos.b) || (paramzbos.c)) {
      this.d = 32;
    } else {
      this.d = 25;
    }
    int i = 8;
    if ((paramzbos.b) || (paramzbos.c)) {
      i = (short)(i + 6);
    }
    this.c = new byte[i];
    DateTime localDateTime = (DateTime)paramzbos.a;
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
    if (paramzbos.b) {
      this.c[8] = 2;
    }
    if (paramzbos.c)
    {
      int tmp228_226 = j;
      byte[] tmp228_223 = this.c;
      tmp228_223[tmp228_226] = ((byte)(tmp228_223[tmp228_226] | 0x1));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */