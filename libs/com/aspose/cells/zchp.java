package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zchp
  extends zche
{
  zchp()
  {
    this.d = 152;
  }
  
  void a(zbev paramzbev)
  {
    this.c = new byte[20 + paramzbev.b().size() * 16];
    this.c[0] = paramzbev.a();
    System.arraycopy(zc.a(paramzbev.c()), 0, this.c, 4, 4);
    System.arraycopy(zc.a(paramzbev.d()), 0, this.c, 8, 4);
    System.arraycopy(zc.a(paramzbev.e()), 0, this.c, 12, 4);
    zcgj.a(paramzbev.b(), this.c, 16);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */