package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbl
  extends zche
{
  zcbl(int[] paramArrayOfInt)
  {
    this.d = 297;
    this.c = new byte[12];
    System.arraycopy(zc.a(paramArrayOfInt[0]), 0, this.c, 0, 2);
    this.c[2] = ((byte)(paramArrayOfInt[1] & 0xFF));
    System.arraycopy(zc.a(paramArrayOfInt[2] - paramArrayOfInt[0]), 0, this.c, 4, 4);
    this.c[8] = ((byte)(paramArrayOfInt[3] >> 1 & 0xFF));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */