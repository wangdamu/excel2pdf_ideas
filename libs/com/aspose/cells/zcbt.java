package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbt
  extends zche
{
  zcbt(TableStyle paramTableStyle)
    throws Exception
  {
    this.d = 510;
    int i = 6;
    if (paramTableStyle.getName() != null) {
      i += 4 + paramTableStyle.getName().length() * 2;
    } else {
      i += 4;
    }
    this.c = new byte[i];
    byte[] arrayOfByte = { -1, -1, -1, -1 };
    int j = 0;
    if (paramTableStyle.c()) {
      j = (byte)(j | 0x2);
    }
    if (paramTableStyle.d()) {
      j = (byte)(j | 0x4);
    }
    this.c[0] = j;
    TableStyleElementCollection localTableStyleElementCollection = paramTableStyle.getTableStyleElements();
    System.arraycopy(zc.a(localTableStyleElementCollection.getCount()), 0, this.c, 2, 4);
    int k = 6;
    if (paramTableStyle.getName() != null)
    {
      k = zcgj.a(this.c, k, paramTableStyle.getName());
    }
    else
    {
      System.arraycopy(arrayOfByte, 0, this.c, k, 4);
      k += 4;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */