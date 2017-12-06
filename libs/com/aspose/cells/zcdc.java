package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcdc
  extends zche
{
  zcdc(String paramString)
  {
    this.d = 1081;
    int i = 4 + paramString.length() * 2 + 2;
    this.c = new byte[i];
    this.c[0] = 8;
    int j = 4;
    System.arraycopy(zc.a(paramString.length()), 0, this.c, j, 2);
    j += 2;
    byte[] arrayOfByte = Encoding.getUnicode().a(paramString);
    System.arraycopy(arrayOfByte, 0, this.c, j, arrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */