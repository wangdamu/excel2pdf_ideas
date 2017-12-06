package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zei
  extends zche
{
  zei(WriteProtection paramWriteProtection)
    throws Exception
  {
    this.d = 676;
    String str = paramWriteProtection.a;
    if (str == null) {
      str = "Aspose";
    }
    int i = 10 + (str.length() << 1);
    ztm localztm = paramWriteProtection.a();
    i += 4 + localztm.b.length;
    i += 4 + localztm.c.length;
    i += 4 + (localztm.a.length() << 1);
    this.c = new byte[i];
    int j = 0;
    System.arraycopy(zc.a(localztm.d), 0, this.c, j, 4);
    j += 4;
    if (paramWriteProtection.getRecommendReadOnly()) {
      this.c[j] = 1;
    }
    j += 2;
    j = zcgj.a(this.c, j, str);
    System.arraycopy(zc.a(localztm.b.length), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(localztm.b, 0, this.c, j, localztm.b.length);
    j += localztm.b.length;
    System.arraycopy(zc.a(localztm.c.length), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(localztm.c, 0, this.c, j, localztm.c.length);
    j += localztm.c.length;
    j = zcgj.a(this.c, j, localztm.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */