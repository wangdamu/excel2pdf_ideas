package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zej
  extends zche
{
  zej(WriteProtection paramWriteProtection)
    throws Exception
  {
    this.d = 548;
    String str = paramWriteProtection.a;
    if (str == null) {
      str = "Aspose";
    }
    int i = 8 + (str.length() << 1);
    this.c = new byte[i];
    if (paramWriteProtection.getRecommendReadOnly()) {
      this.c[0] = 1;
    }
    System.arraycopy(zc.a(paramWriteProtection.c()), 0, this.c, 2, 2);
    System.arraycopy(zc.a(str.length()), 0, this.c, 4, 2);
    zcgj.a(this.c, 4, str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */