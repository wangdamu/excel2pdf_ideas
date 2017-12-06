package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;

class zbxv
  extends zcd
{
  public zbxv()
  {
    c(426);
    b(64);
  }
  
  void a(zoh paramzoh)
  {
    this.b = new byte[64];
    int i = 0;
    System.arraycopy(paramzoh.n.a(), 0, this.b, i, 16);
    i += 16;
    System.arraycopy(zc.a(paramzoh.q), 0, this.b, i, 2);
    i += 4;
    System.arraycopy(zc.a(paramzoh.D()), 0, this.b, i, 2);
    i += 4;
    System.arraycopy(zc.a(paramzoh.H()), 0, this.b, i, 2);
    i += 4;
    this.b[i] = paramzoh.c().a();
    i += 4;
    int j = 0;
    if (paramzoh.n()) {
      j |= 0x1;
    }
    if (paramzoh.v()) {
      j |= 0x2;
    }
    if (paramzoh.w()) {
      j |= 0x4;
    }
    if (paramzoh.x()) {
      j |= 0x8;
    }
    if (paramzoh.B()) {
      j |= 0x10;
    }
    if (paramzoh.A()) {
      j |= 0x20;
    }
    if (paramzoh.e().getCenterHorizontally()) {
      j |= 0x40;
    }
    if (paramzoh.e().getCenterVertically()) {
      j |= 0x80;
    }
    if (paramzoh.e().getPrintHeadings()) {
      j |= 0x100;
    }
    if (paramzoh.e().getPrintGridlines()) {
      j |= 0x200;
    }
    if (paramzoh.e().isPercentScale()) {
      j |= 0x400;
    }
    if (paramzoh.r()) {
      j |= 0x800;
    }
    if (paramzoh.s()) {
      j |= 0x1000;
    }
    if (paramzoh.m()) {
      j |= 0x2000;
    }
    if (paramzoh.o()) {
      j |= 0x4000;
    }
    if (paramzoh.y()) {
      j |= 0x8000;
    }
    if (!paramzoh.z()) {
      j |= 0x10000;
    }
    if (paramzoh.u()) {
      j |= 0x20000;
    }
    if (paramzoh.t()) {
      j |= 0x40000;
    }
    if (paramzoh.k()) {
      j |= 0x80000;
    }
    if (paramzoh.l()) {
      j |= 0x200000;
    }
    if (paramzoh.q()) {
      j |= 0x2000000;
    }
    switch (paramzoh.E())
    {
    case 1: 
      j |= 0x4000000;
      break;
    case 2: 
      j |= 0x8000000;
    }
    if ((paramzoh.G()) && (paramzoh.E() == 1)) {
      j |= 0x20000000;
    }
    System.arraycopy(zc.a(j), 0, this.b, i, 4);
    i += 4;
    System.arraycopy(zc.a(paramzoh.p.StartRow), 0, this.b, i, 2);
    System.arraycopy(zc.a(paramzoh.p.EndRow), 0, this.b, i + 2, 2);
    System.arraycopy(zc.a(paramzoh.p.StartColumn), 0, this.b, i + 4, 2);
    System.arraycopy(zc.a(paramzoh.p.EndColumn), 0, this.b, i + 6, 2);
    i += 8;
    if (paramzoh.e > 0.0D) {
      System.arraycopy(zc.a(paramzoh.e), 0, this.b, i, 8);
    }
    if (paramzoh.f > 0.0D) {
      System.arraycopy(zc.a(paramzoh.f), 0, this.b, i + 8, 8);
    }
    i += 16;
    if (!paramzoh.g)
    {
      this.b[i] = (this.b[(i + 1)] = this.b[(i + 2)] = this.b[(i + 3)] = -1);
    }
    else
    {
      System.arraycopy(zc.a(paramzoh.c().getFirstVisibleColumnOfRightPane()), 0, this.b, i, 2);
      System.arraycopy(zc.a(paramzoh.c().getFirstVisibleRowOfBottomPane()), 0, this.b, i + 2, 2);
    }
    i += 4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */