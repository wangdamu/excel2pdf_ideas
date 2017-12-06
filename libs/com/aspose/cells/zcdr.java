package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcdr
  extends zche
{
  zcdr(zbos paramzbos)
  {
    if ((paramzbos.b) || (paramzbos.c)) {
      this.d = 28;
    } else {
      this.d = 21;
    }
    int i = 8;
    if ((paramzbos.b) || (paramzbos.c)) {
      i = (short)(i + 6);
    }
    this.c = new byte[i];
    if ((paramzbos.a instanceof Integer))
    {
      double d = ((Integer)paramzbos.a).intValue();
      System.arraycopy(zc.a(d), 0, this.c, 0, 8);
    }
    else if ((paramzbos.a instanceof Double))
    {
      System.arraycopy(zc.a(((Double)paramzbos.a).doubleValue()), 0, this.c, 0, 8);
    }
    else
    {
      System.arraycopy(zc.a(((Long)paramzbos.a).longValue()), 0, this.c, 0, 8);
    }
    if (paramzbos.b) {
      this.c[8] = 2;
    }
    if (paramzbos.c)
    {
      byte[] tmp192_187 = this.c;
      tmp192_187[8] = ((byte)(tmp192_187[8] | 0x1));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */