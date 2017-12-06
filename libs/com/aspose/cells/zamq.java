package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zamq
  extends zcd
{
  zamq()
  {
    c(516);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    if ("".equals(paramString))
    {
      a((short)9);
      this.b = new byte[d()];
      System.arraycopy(zc.a(paramInt1), 0, this.b, 0, 2);
      System.arraycopy(zc.a(paramInt2), 0, this.b, 2, 2);
      System.arraycopy(zc.a(paramInt3), 0, this.b, 4, 2);
      return;
    }
    byte[] arrayOfByte = zct.c(paramString);
    a((short)(9 + arrayOfByte.length));
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramInt1), 0, this.b, 0, 2);
    System.arraycopy(zc.a(paramInt2), 0, this.b, 2, 2);
    System.arraycopy(zc.a(paramInt3), 0, this.b, 4, 2);
    System.arraycopy(zc.a(paramString.length()), 0, this.b, 6, 2);
    if (paramString.length() != arrayOfByte.length) {
      this.b[8] = 1;
    }
    System.arraycopy(arrayOfByte, 0, this.b, 9, arrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */