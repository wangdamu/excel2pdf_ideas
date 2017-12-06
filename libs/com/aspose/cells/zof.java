package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zof
  extends zcd
{
  zof()
  {
    c(2206);
  }
  
  void a(byte[] paramArrayOfByte)
  {
    a((short)(16 + paramArrayOfByte.length));
    this.b = new byte[d()];
    this.b[0] = -98;
    this.b[1] = 8;
    System.arraycopy(zc.a(paramArrayOfByte.length - 4), 0, this.b, 12, 4);
    System.arraycopy(paramArrayOfByte, 0, this.b, 16, paramArrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */