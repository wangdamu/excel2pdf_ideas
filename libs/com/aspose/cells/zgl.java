package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zgl
  extends zcd
{
  zgl()
  {
    c(2134);
    b(12);
    this.b = new byte[12];
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    this.b[0] = 86;
    this.b[1] = 8;
    System.arraycopy(zc.a(paramInt), 0, this.b, 4, 2);
    this.b[6] = 2;
    if (paramBoolean) {
      this.b[8] = -7;
    } else {
      this.b[8] = -8;
    }
    this.b[9] = -125;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */