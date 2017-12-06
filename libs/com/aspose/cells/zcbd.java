package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbd
  extends zche
{
  zcbd(int[] paramArrayOfInt)
  {
    this.d = 388;
    int i = (paramArrayOfInt[2] - paramArrayOfInt[0]) * 4;
    this.c = new byte[i];
    int j = paramArrayOfInt[0];
    int k = 0;
    for (int m = 4 + j; m < 4 + paramArrayOfInt[2]; m++)
    {
      System.arraycopy(zc.a(paramArrayOfInt[m]), 0, this.c, k, 4);
      k += 4;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */