package com.aspose.cells;

import com.aspose.cells.b.a.zm;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.Comparator;

class zapa
  implements Comparator
{
  public int compare(Object x, Object y)
  {
    String str1 = (String)zm.a(x, String.class);
    String str2 = (String)zm.a(y, String.class);
    int i = zp.a(str1.length(), str2.length());
    if (i == 0) {
      return zw.a(str1.toUpperCase(), str2.toUpperCase());
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */