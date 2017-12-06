package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zccl
  extends zche
{
  zccl(zbui paramzbui)
  {
    this.d = 255;
    this.c = new byte[6];
    System.arraycopy(zc.a((short)(paramzbui.b & 0xFFFF)), 0, this.c, 0, 4);
    if ((paramzbui.c & 0xFFFF) == 65535) {
      this.c[4] = 1;
    } else {
      System.arraycopy(zc.a(paramzbui.c), 0, this.c, 4, 1);
    }
    if ((paramzbui.a & 0xFFFF & 0x2) != 0) {
      this.c[5] = 1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zccl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */