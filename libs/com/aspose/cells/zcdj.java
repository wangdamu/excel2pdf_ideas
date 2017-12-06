package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcdj
  extends zche
{
  zcdj(WorksheetCollection paramWorksheetCollection)
  {
    this.d = 362;
    int i = 0;
    int j = paramWorksheetCollection.r().getCount();
    this.c = new byte[4 + j * 12];
    System.arraycopy(zc.a(j), 0, this.c, 0, 4);
    i += 4;
    for (int k = 0; k < j; k++)
    {
      zwp localzwp = paramWorksheetCollection.r().b(k);
      System.arraycopy(zc.a((short)(localzwp.a & 0xFFFF)), 0, this.c, i, 4);
      i += 4;
      System.arraycopy(zc.a((short)(localzwp.b & 0xFFFF)), 0, this.c, i, 4);
      i += 4;
      System.arraycopy(zc.a((short)(localzwp.c & 0xFFFF)), 0, this.c, i, 4);
      i += 4;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */