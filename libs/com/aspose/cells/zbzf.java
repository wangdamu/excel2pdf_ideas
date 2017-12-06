package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbzf
  extends zcd
{
  zbzf()
  {
    c(2172);
    b(20);
    this.b = new byte[d()];
  }
  
  void a(int paramInt, long paramLong)
  {
    this.b[0] = 124;
    this.b[1] = 8;
    System.arraycopy(zc.a(paramInt), 0, this.b, 14, 2);
    System.arraycopy(zc.a(paramLong), 0, this.b, 16, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */