package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbuf
  extends zcd
{
  zbuf(ArrayList paramArrayList)
  {
    c(245);
    int i = 2 * paramArrayList.size();
    a((short)i);
    this.b = new byte[d()];
    int j = 0;
    for (int k = 0; k < paramArrayList.size(); k++)
    {
      System.arraycopy(zc.a(zi.a((Integer)paramArrayList.get(k))), 0, this.b, j, 2);
      j += 2;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbuf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */