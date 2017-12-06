package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zccu
  extends zche
{
  zccu(zri paramzri)
    throws Exception
  {
    zawp localzawp = paramzri.b;
    this.d = 179;
    int i = 21;
    String str1 = "作者";
    i += str1.length() * 2 + 4;
    String str2 = paramzri.d;
    if (str2 != null) {
      i += str2.length() * 2 + 4;
    }
    i += 4;
    this.c = new byte[i];
    this.c[0] = 4;
    this.c[1] = 3;
    this.c[2] = 4;
    int j = 0;
    if ((!localzawp.c(1)) || (localzawp.h == null) || (localzawp.h.a == null)) {
      j = (byte)(j | 0x0);
    } else {
      j = (byte)(j | 0x1);
    }
    if (localzawp.i()) {
      j = (byte)(j | 0x4);
    }
    j = (byte)(j | 0x10);
    this.c[3] = j;
    System.arraycopy(zc.a(localzawp.t), 0, this.c, 4, 4);
    DateTime localDateTime = DateTime.getNow();
    int k = 8;
    System.arraycopy(zc.a(localDateTime.getYear()), 0, this.c, k, 2);
    k += 2;
    System.arraycopy(zc.a(localDateTime.getMonth()), 0, this.c, k, 2);
    k += 2;
    System.arraycopy(zc.a(localDateTime.getDay()), 0, this.c, k, 1);
    k++;
    System.arraycopy(zc.a(localDateTime.getHour()), 0, this.c, k, 1);
    k++;
    System.arraycopy(zc.a(localDateTime.getMinute()), 0, this.c, k, 1);
    k++;
    System.arraycopy(zc.a(localDateTime.getSecond()), 0, this.c, k, 1);
    k++;
    int m = 0;
    m = (byte)(m | 0x1);
    if ((str2 != null) && (!"".equals(str2))) {
      m = (byte)(m | 0x2);
    }
    this.c[16] = m;
    System.arraycopy(zc.a(localzawp.d()), 0, this.c, 17, 4);
    k = 21;
    k = zcgj.a(this.c, k, str1);
    if (str2 != null) {
      k = zcgj.a(this.c, k, str2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zccu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */