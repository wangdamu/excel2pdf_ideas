package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zawl
  extends zcd
{
  zawl(zka paramzka)
  {
    c(4121);
    b(6);
    this.b = new byte[6];
    System.arraycopy(zc.a(paramzka.A()), 0, this.b, 0, 2);
    System.arraycopy(zc.a(paramzka.K()), 0, this.b, 2, 2);
    this.b[4] = 2;
    if (paramzka.L())
    {
      int tmp78_77 = 4;
      byte[] tmp78_74 = this.b;
      tmp78_74[tmp78_77] = ((byte)(tmp78_74[tmp78_77] | 0x1));
    }
    if (!paramzka.N())
    {
      int tmp96_95 = 4;
      byte[] tmp96_92 = this.b;
      tmp96_92[tmp96_95] = ((byte)(tmp96_92[tmp96_95] & 0xFD));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */