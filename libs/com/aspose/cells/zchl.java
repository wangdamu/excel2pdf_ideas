package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zchl
  extends zche
{
  zchl()
  {
    this.d = 0;
  }
  
  void a(zt paramzt, int paramInt1, int paramInt2, HashMap paramHashMap)
  {
    this.c = new byte[25];
    zbdx localzbdx = paramzt.a(new zbdx(), 15);
    System.arraycopy(zc.a(localzbdx.a), 0, this.c, 0, 4);
    int i = ((Integer)paramHashMap.get(Integer.valueOf(localzbdx.d() ? localzbdx.d : 15))).intValue();
    System.arraycopy(zc.a(i), 0, this.c, 4, 4);
    System.arraycopy(zc.a(localzbdx.e), 0, this.c, 8, 2);
    int j = localzbdx.e();
    if (localzbdx.a()) {
      j = (byte)(j | 0x8);
    }
    if (localzbdx.b()) {
      j = (byte)(j | 0x10);
    }
    if (!localzbdx.c()) {
      j = (byte)(j | 0x20);
    }
    if (localzbdx.d()) {
      j = (byte)(j | 0x40);
    }
    this.c[11] = j;
    System.arraycopy(zc.a(1), 0, this.c, 13, 4);
    System.arraycopy(zc.a(paramInt1), 0, this.c, 17, 4);
    System.arraycopy(zc.a(paramInt2), 0, this.c, 21, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */