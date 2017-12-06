package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbvq
  extends zcd
{
  zbvq(TableStyle paramTableStyle)
  {
    c(2191);
    b(20);
    if (paramTableStyle.getName() != null) {
      b(d() + (short)(paramTableStyle.getName().length() * 2));
    }
    this.b = new byte[d()];
    this.b[0] = -113;
    this.b[1] = 8;
    byte[] arrayOfByte1 = { -1, -1, -1, -1 };
    int i = 0;
    if (paramTableStyle.c()) {
      i = (byte)(i | 0x2);
    }
    if (paramTableStyle.d()) {
      i = (byte)(i | 0x4);
    }
    this.b[12] = i;
    TableStyleElementCollection localTableStyleElementCollection = paramTableStyle.getTableStyleElements();
    System.arraycopy(zc.a(localTableStyleElementCollection.getCount()), 0, this.b, 14, 4);
    int j = 20;
    if (paramTableStyle.getName() != null)
    {
      System.arraycopy(zc.a(paramTableStyle.getName().length()), 0, this.b, 18, 2);
      byte[] arrayOfByte2 = Encoding.getUnicode().a(paramTableStyle.getName());
      System.arraycopy(arrayOfByte2, 0, this.b, j, arrayOfByte2.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */