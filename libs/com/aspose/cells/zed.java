package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zed
  extends zche
{
  zed(QueryTable paramQueryTable)
    throws Exception
  {
    this.d = 447;
    this.c = new byte[14 + paramQueryTable.f.length() * 2];
    int i = 0;
    System.arraycopy(zc.a(paramQueryTable.c), 0, this.c, i, 4);
    i += 4;
    System.arraycopy(zc.a(paramQueryTable.d), 0, this.c, i, 2);
    i += 2;
    System.arraycopy(zc.a(paramQueryTable.e), 0, this.c, i, 4);
    i += 4;
    zcgj.a(this.c, i, paramQueryTable.f);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */