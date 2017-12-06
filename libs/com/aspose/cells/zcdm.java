package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcdm
  extends zche
{
  zcdm(zbcj paramzbcj)
  {
    this.d = 398;
    this.c = new byte[46];
    int i = 0;
    this.c[i] = 13;
    if (paramzbcj.a)
    {
      int tmp41_40 = i;
      byte[] tmp41_37 = this.c;
      tmp41_37[tmp41_40] = ((byte)(tmp41_37[tmp41_40] | 0x2));
    }
    i += 2;
    byte[] arrayOfByte = paramzbcj.l;
    System.arraycopy(paramzbcj.l, 0, this.c, i, 16);
    i += 16;
    arrayOfByte = paramzbcj.m;
    if (arrayOfByte == null) {
      arrayOfByte = paramzbcj.l;
    }
    System.arraycopy(arrayOfByte, 0, this.c, i, 16);
    i += 16;
    System.arraycopy(zc.a(paramzbcj.i), 0, this.c, i, 4);
    i += 4;
    System.arraycopy(zc.a(2), 0, this.c, i, 4);
    i += 4;
    int j = 0;
    if (!paramzbcj.d) {
      j |= 0x1;
    }
    if (paramzbcj.f) {
      j |= 0x2;
    }
    this.c[i] = ((byte)j);
    i += 2;
    System.arraycopy(zc.a(paramzbcj.e), 0, this.c, i, 2);
    i += 2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */