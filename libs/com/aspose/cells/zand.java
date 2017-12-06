package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zand
  extends zcd
{
  zand(boolean paramBoolean, int paramInt)
  {
    c(4163);
    b(4);
    this.b = new byte[4];
    if (paramBoolean)
    {
      int tmp32_31 = 2;
      byte[] tmp32_28 = this.b;
      tmp32_28[tmp32_31] = ((byte)(tmp32_28[tmp32_31] | 0x1));
    }
    else
    {
      this.b[2] = 2;
    }
    System.arraycopy(zc.a(paramInt), 0, this.b, 0, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */