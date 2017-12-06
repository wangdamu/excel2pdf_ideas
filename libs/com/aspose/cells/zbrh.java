package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbrh
  extends zcd
{
  zbrh(double paramDouble, int paramInt)
  {
    c(153);
    b(2);
    this.b = new byte[2];
    if (paramDouble > 0.0D)
    {
      int i;
      if (paramDouble > 1.0D)
      {
        i = (int)Math.floor(paramDouble * 256.0D + paramInt + 0.5D);
        System.arraycopy(zc.a(i), 0, this.b, 0, 2);
      }
      else
      {
        i = (int)Math.floor(paramDouble * (256 + paramInt) + 0.5D);
        System.arraycopy(zc.a(i), 0, this.b, 0, 2);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */