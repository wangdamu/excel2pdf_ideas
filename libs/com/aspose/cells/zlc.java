package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zlc
  extends zcd
{
  zlc()
  {
    c(125);
    b(12);
  }
  
  void a(Column paramColumn, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramInt3), 0, this.b, 0, 2);
    System.arraycopy(zc.a(paramInt4), 0, this.b, 2, 2);
    double d = paramColumn.getWidth();
    if (d > 255.0D) {
      d = 255.0D;
    }
    int i = 0;
    if (d >= 1.0D) {
      i = (int)(d * 256.0D + paramInt2 + 0.5D) & 0xFFFF;
    } else {
      i = (int)(d * (256.0D + paramInt2) + 0.5D) & 0xFFFF;
    }
    System.arraycopy(zc.a(i), 0, this.b, 4, 2);
    int j = 15;
    if (paramColumn.c() == -1) {
      j = 15;
    } else {
      j = paramColumn.c();
    }
    System.arraycopy(zc.a(j), 0, this.b, 6, 2);
    int k = 0;
    if (paramColumn.isHidden()) {
      k = (byte)(k | 0x1);
    }
    if (!paramColumn.i()) {
      k = (byte)(k | 0x2);
    }
    if (paramColumn.h()) {
      k = (byte)(k | 0x4);
    }
    this.b[8] = k;
    k = paramColumn.b();
    if (paramColumn.g()) {
      k = (byte)(k | 0x10);
    }
    this.b[9] = k;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */