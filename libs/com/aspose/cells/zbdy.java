package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbdy
  extends zcd
{
  zbdy()
  {
    c(520);
    b(16);
    this.b = new byte[d()];
  }
  
  void a(zbdx paramzbdx, int paramInt1, int paramInt2)
  {
    System.arraycopy(zc.a(paramzbdx.a), 0, this.b, 0, 2);
    System.arraycopy(zc.a(paramInt1), 0, this.b, 2, 2);
    System.arraycopy(zc.a(paramInt2), 0, this.b, 4, 2);
    System.arraycopy(zc.a(paramzbdx.e), 0, this.b, 6, 2);
    this.b[12] = paramzbdx.b;
    this.b[13] = 1;
    this.b[14] = ((byte)(paramzbdx.d & 0xFF));
    this.b[15] = ((byte)(paramzbdx.c & 0xFF & 0xF0 | paramzbdx.d >> 8 & 0xF));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */