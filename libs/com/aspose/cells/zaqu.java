package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaqu
  extends zcd
{
  zaqu()
  {
    c(28);
  }
  
  void a(int paramInt1, byte paramByte, int paramInt2, boolean paramBoolean, String paramString)
  {
    byte[] arrayOfByte = Encoding.getUnicode().a(paramString);
    a((short)(12 + arrayOfByte.length));
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramInt1), 0, this.b, 0, 2);
    this.b[2] = paramByte;
    if (paramBoolean) {
      this.b[4] = 2;
    }
    System.arraycopy(zc.a(paramInt2), 0, this.b, 6, 2);
    System.arraycopy(zc.a(paramString.length()), 0, this.b, 8, 2);
    this.b[10] = 1;
    System.arraycopy(arrayOfByte, 0, this.b, 11, arrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */