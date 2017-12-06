package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcil
  extends zche
{
  zcil(zbyy paramzbyy)
  {
    this.d = 534;
    this.c = new byte[6];
    System.arraycopy(zc.a(paramzbyy.b()), 0, this.c, 0, 2);
    if (paramzbyy.b)
    {
      int tmp48_47 = 4;
      byte[] tmp48_44 = this.c;
      tmp48_44[tmp48_47] = ((byte)(tmp48_44[tmp48_47] | 0x1));
    }
    if (paramzbyy.a)
    {
      int tmp66_65 = 4;
      byte[] tmp66_62 = this.c;
      tmp66_62[tmp66_65] = ((byte)(tmp66_62[tmp66_65] | 0x2));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */