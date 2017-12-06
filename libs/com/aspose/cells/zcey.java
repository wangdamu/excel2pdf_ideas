package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zcey
  extends zche
{
  zcey()
  {
    this.d = 60;
  }
  
  void a(Column paramColumn, int paramInt1, int paramInt2, HashMap paramHashMap)
  {
    this.c = new byte[18];
    System.arraycopy(zc.a(paramColumn.getIndex()), 0, this.c, 0, 4);
    System.arraycopy(zc.a(paramInt1), 0, this.c, 4, 4);
    int i = 0;
    if (paramColumn.getWidth() >= 1.0D) {
      i = (int)(paramColumn.getWidth() * 256.0D + paramInt2 + 0.5D);
    } else {
      i = (int)(paramColumn.getWidth() * (256.0D + paramInt2) + 0.5D);
    }
    System.arraycopy(zc.a(i), 0, this.c, 8, 4);
    int j = ((Integer)paramHashMap.get(Integer.valueOf(paramColumn.c() == -1 ? 15 : paramColumn.c()))).intValue();
    System.arraycopy(zc.a(j), 0, this.c, 12, 4);
    int k = 0;
    if (paramColumn.isHidden()) {
      k |= 0x1;
    }
    if ((paramColumn.b() & 0xFF) > 0) {
      k |= (paramColumn.b() & 0xFF) << 8;
    }
    if (paramColumn.g()) {
      k |= 0x1000;
    }
    k |= 0x2;
    System.arraycopy(zc.a(k), 0, this.c, 16, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */