package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcgq
  extends zche
{
  zcgq(zpl paramzpl)
    throws Exception
  {
    this.d = 639;
    int i = 14;
    byte[] arrayOfByte = null;
    if (paramzpl.a.isLink()) {
      arrayOfByte = paramzpl.a.r();
    }
    if ((paramzpl.a.getProgID() != null) && (paramzpl.a.getProgID().length() > 0)) {
      i += 4 + paramzpl.a.getProgID().length() * 2;
    } else {
      i += 4;
    }
    if (paramzpl.a.isLink()) {
      i += arrayOfByte.length;
    } else {
      i += 4 + paramzpl.c.length() * 2;
    }
    this.c = new byte[i];
    this.c[0] = ((byte)(paramzpl.a.getDisplayAsIcon() ? 4 : 1));
    if (paramzpl.a.getAutoUpdate()) {
      this.c[4] = 1;
    }
    System.arraycopy(zc.a(zauj.F(paramzpl.b)), 0, this.c, 8, 4);
    int j = 0;
    if (paramzpl.a.isLink()) {
      j = (byte)(j | 0x1);
    }
    if (paramzpl.a.getAutoLoad()) {
      j = (byte)(j | 0x2);
    }
    this.c[12] = j;
    int k = 14;
    if ((paramzpl.a.getProgID() != null) && (paramzpl.a.getProgID().length() > 0)) {
      k = zcgj.a(this.c, k, paramzpl.a.getProgID());
    } else {
      k += 4;
    }
    if (paramzpl.a.isLink()) {
      System.arraycopy(arrayOfByte, 0, this.c, k, arrayOfByte.length);
    } else {
      k = zcgj.a(this.c, k, paramzpl.c);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */