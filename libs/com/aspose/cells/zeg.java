package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;

class zeg
  extends zche
{
  zeg(zoh paramzoh)
  {
    this.d = 423;
    this.c = new byte[48];
    int i = 0;
    System.arraycopy(paramzoh.n.a(), 0, this.c, i, 16);
    i += 16;
    System.arraycopy(zc.a(paramzoh.q), 0, this.c, i, 4);
    i += 4;
    System.arraycopy(zc.a(paramzoh.D()), 0, this.c, i, 4);
    i += 4;
    System.arraycopy(zc.a(paramzoh.I()), 0, this.c, i, 4);
    i += 4;
    int j = 0;
    j |= (paramzoh.n() ? 1 : 0);
    j |= (paramzoh.v() ? 2 : 0);
    j |= (paramzoh.w() ? 4 : 0);
    j |= (paramzoh.x() ? 8 : 0);
    j |= (paramzoh.B() ? 16 : 0);
    j |= (paramzoh.A() ? 32 : 0);
    j |= (paramzoh.e().getCenterHorizontally() ? 64 : 0);
    j |= (paramzoh.e().getCenterVertically() ? 128 : 0);
    j |= (paramzoh.e().getPrintHeadings() ? 256 : 0);
    j |= (paramzoh.e().getPrintGridlines() ? 512 : 0);
    j |= (paramzoh.e().isPercentScale() ? 1024 : 0);
    j |= (paramzoh.r() ? 2048 : 0);
    j |= (paramzoh.s() ? 4096 : 0);
    j |= (paramzoh.p() ? 8192 : 0);
    j |= (paramzoh.o() ? 16384 : 0);
    j |= (paramzoh.u() ? 131072 : 0);
    j |= (paramzoh.t() ? 262144 : 0);
    j |= (paramzoh.k() ? 524288 : 0);
    j |= (paramzoh.l() ? 2097152 : 0);
    switch (paramzoh.F())
    {
    case 0: 
      break;
    case 1: 
      j |= 0x400000;
      break;
    case 2: 
      j |= 0x800000;
    }
    j |= (paramzoh.q() ? 33554432 : 0);
    switch (paramzoh.E())
    {
    case 0: 
      break;
    case 1: 
      j |= 0x4000000;
      break;
    case 2: 
      j |= 0x8000000;
    }
    j |= (paramzoh.G() ? 536870912 : 0);
    System.arraycopy(zc.a(j), 0, this.c, i, 4);
    i += 4;
    zcgj.a(CellArea.createCellArea(paramzoh.i(), paramzoh.j(), paramzoh.i(), paramzoh.j()), this.c, i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zeg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */