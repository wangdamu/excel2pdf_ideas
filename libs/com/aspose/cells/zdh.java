package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zdh
  extends zcd
{
  zdh()
  {
    c(517);
    b(8);
    this.b = new byte[8];
  }
  
  void a(int paramInt1, byte paramByte1, int paramInt2, byte paramByte2, boolean paramBoolean)
  {
    System.arraycopy(zc.a(paramInt1), 0, this.b, 0, 2);
    this.b[2] = paramByte1;
    System.arraycopy(zc.a(paramInt2), 0, this.b, 4, 2);
    this.b[6] = paramByte2;
    if (paramBoolean) {
      this.b[7] = 1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */