package com.aspose.cells;

import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.zc;

class zavc
  extends zcd
{
  zavc()
  {
    c(146);
    b(226);
  }
  
  void a(zava paramzava)
  {
    zd localzd = paramzava.b();
    this.b = new byte[d()];
    this.b[0] = 56;
    int i = 2;
    for (int j = 8; j < 64; j++)
    {
      System.arraycopy(zc.a(((Integer)localzd.d(Integer.valueOf(j))).intValue()), 0, this.b, i, 4);
      i += 4;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */