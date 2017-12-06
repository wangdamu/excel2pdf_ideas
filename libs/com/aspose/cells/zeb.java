package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zeb
  extends zche
{
  zeb(zaye paramzaye)
    throws Exception
  {
    this.d = 457;
    int i = 12;
    paramzaye.d &= 0xFFFFFFEF;
    if (paramzaye.b != null)
    {
      paramzaye.d |= 0x10;
      i += 4 + paramzaye.b.length() * 2;
    }
    this.c = new byte[i];
    i = 0;
    System.arraycopy(zc.a(paramzaye.d), 0, this.c, i, 4);
    i += 4;
    System.arraycopy(zc.a(paramzaye.a), 0, this.c, i, 4);
    i += 4;
    System.arraycopy(zc.a(paramzaye.c), 0, this.c, i, 4);
    i += 4;
    if (paramzaye.b != null) {
      zcgj.a(this.c, i, paramzaye.b);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zeb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */