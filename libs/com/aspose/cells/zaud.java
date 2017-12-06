package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaud
  extends zcd
{
  zaud()
  {
    c(4135);
    b(6);
    this.b = new byte[6];
  }
  
  void a(byte paramByte)
  {
    this.b[0] = paramByte;
  }
  
  void a(byte paramByte, int paramInt1, int paramInt2)
  {
    this.b[0] = paramByte;
    System.arraycopy(zc.a(paramInt1), 0, this.b, 2, 2);
    System.arraycopy(zc.a(paramInt2), 0, this.b, 4, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */