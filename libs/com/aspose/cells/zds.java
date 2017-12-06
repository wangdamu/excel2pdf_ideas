package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zds
  extends zche
{
  zds(znj paramznj)
    throws Exception
  {
    this.d = 205;
    int i = 6;
    if (paramznj.b != null) {
      i += 4 + paramznj.b.length() * 2;
    }
    this.c = new byte[i];
    int j = 0;
    this.c[j] = ((byte)paramznj.c);
    j++;
    System.arraycopy(zc.a(paramznj.a), 0, this.c, j, 4);
    j += 4;
    if (paramznj.b != null) {
      this.c[j] = 1;
    }
    j++;
    if (paramznj.b != null) {
      zcgj.a(this.c, j, paramznj.b);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */