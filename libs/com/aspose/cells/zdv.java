package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zdv
  extends zche
{
  zdv(zbvu paramzbvu)
    throws Exception
  {
    this.d = 538;
    int i = 16 + paramzbvu.y.length() * 2;
    this.c = new byte[i];
    int j = 0;
    int k = paramzbvu.A;
    k &= 0xF003;
    k |= zbvu.c(paramzbvu.d) << 2;
    System.arraycopy(zc.a(k), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(paramzbvu.n()), 0, this.c, j, 2);
    j += 2;
    System.arraycopy(zc.a(paramzbvu.B), 0, this.c, j, 4);
    j += 4;
    this.c[j] = ((byte)paramzbvu.a);
    j++;
    this.c[j] = ((byte)paramzbvu.b);
    j++;
    zcgj.a(this.c, j, paramzbvu.y);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */