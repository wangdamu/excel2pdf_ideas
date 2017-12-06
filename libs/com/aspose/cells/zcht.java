package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zp;

class zcht
  extends zche
{
  zcht()
  {
    this.d = 48;
  }
  
  void a(zoz paramzoz)
    throws Exception
  {
    String str1 = paramzoz.a;
    this.c = new byte[12 + str1.length() * 2];
    int i = 0;
    int j = str1.lastIndexOf('_');
    if ((j != -1) && (j != 0))
    {
      String str2 = str1.substring(j + 1);
      if ((zarb.b(str2)) && (str2.indexOf('.') == -1))
      {
        i = zp.a(str2);
        str1 = str1.substring(0, 0 + j);
      }
    }
    int k = zcij.a(str1);
    System.arraycopy(zc.a(paramzoz.b), 0, this.c, 0, 4);
    int m = 0;
    if (k != -1) {
      m |= 0x1;
    }
    this.c[4] = ((byte)m);
    if (k != -1) {
      this.c[6] = ((byte)k);
    }
    this.c[7] = ((byte)i);
    int n = 8;
    n = zcgj.a(this.c, n, paramzoz.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */