package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaqf
  extends zcd
{
  zaqf()
  {
    c(2196);
  }
  
  void a(Name paramName)
  {
    String str1 = paramName.k();
    String str2 = paramName.getComment();
    b(16);
    byte[] arrayOfByte1 = zct.c(str1);
    byte[] arrayOfByte2 = zct.c(str2);
    b(d() + (short)(2 + arrayOfByte1.length + arrayOfByte2.length));
    this.b = new byte[d()];
    this.b[0] = -108;
    this.b[1] = 8;
    int i = 12;
    System.arraycopy(zc.a(str1.length()), 0, this.b, i, 2);
    System.arraycopy(zc.a(str2.length()), 0, this.b, i + 2, 2);
    i += 4;
    if (arrayOfByte1.length == str1.length()) {
      this.b[(i++)] = 0;
    } else {
      this.b[(i++)] = 1;
    }
    System.arraycopy(arrayOfByte1, 0, this.b, i, arrayOfByte1.length);
    i += arrayOfByte1.length;
    if (arrayOfByte2.length == str2.length()) {
      this.b[(i++)] = 0;
    } else {
      this.b[(i++)] = 1;
    }
    System.arraycopy(arrayOfByte2, 0, this.b, i, arrayOfByte2.length);
    i += arrayOfByte2.length;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */