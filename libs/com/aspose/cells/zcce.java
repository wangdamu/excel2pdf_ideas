package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcce
  extends zche
{
  zcce(zbtv paramzbtv)
    throws Exception
  {
    this.d = 183;
    int i = 20;
    if (paramzbtv.a != null) {
      i += paramzbtv.a.length() * 2 + 4;
    }
    if (paramzbtv.e != null) {
      i += 4 + paramzbtv.e.length + 4;
    }
    this.c = new byte[i];
    if (!paramzbtv.o) {
      this.c[0] = 4;
    }
    if (paramzbtv.e != null) {
      this.c[1] = 1;
    }
    if (paramzbtv.q != -1) {
      System.arraycopy(zc.a(paramzbtv.q), 0, this.c, 2, 4);
    }
    int j = 20;
    if (paramzbtv.a != null) {
      j = zcgj.a(this.c, j, paramzbtv.a);
    }
    if (paramzbtv.e != null)
    {
      System.arraycopy(zc.a(paramzbtv.e.length), 0, this.c, j, 4);
      j += 4;
      System.arraycopy(paramzbtv.e, 0, this.c, j, paramzbtv.e.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */