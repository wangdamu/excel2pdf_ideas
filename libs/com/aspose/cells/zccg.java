package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zccg
  extends zche
{
  zccg(int[] paramArrayOfInt, zpg paramzpg)
    throws Exception
  {
    this.d = 217;
    zcci localzcci = new zcci(paramzpg);
    int i = 16 + localzcci.c.length;
    this.c = new byte[i];
    System.arraycopy(zc.a(paramArrayOfInt[0]), 0, this.c, 0, 4);
    if (paramArrayOfInt.length > 1) {
      System.arraycopy(zc.a(paramArrayOfInt[1]), 0, this.c, 4, 4);
    }
    if (paramArrayOfInt.length > 2) {
      System.arraycopy(zc.a(paramArrayOfInt[2]), 0, this.c, 8, 4);
    }
    if (paramArrayOfInt.length > 3) {
      System.arraycopy(zc.a(paramArrayOfInt[3]), 0, this.c, 12, 4);
    }
    System.arraycopy(localzcci.c, 0, this.c, 16, localzcci.c.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zccg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */