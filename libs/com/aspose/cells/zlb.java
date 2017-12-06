package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zlb
  extends zcd
{
  zlb()
  {
    c(442);
  }
  
  void a(String paramString)
  {
    byte[] arrayOfByte = zct.c(paramString);
    a((short)((arrayOfByte == null ? 0 : arrayOfByte.length) + 3));
    this.b = new byte[d()];
    if (arrayOfByte != null)
    {
      System.arraycopy(zc.a(paramString.length()), 0, this.b, 0, 2);
      if (arrayOfByte.length != paramString.length()) {
        this.b[2] = 1;
      }
      System.arraycopy(arrayOfByte, 0, this.b, 3, d() - 3);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */