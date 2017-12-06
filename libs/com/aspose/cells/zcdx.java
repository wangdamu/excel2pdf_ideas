package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcdx
  extends zche
{
  private Workbook a;
  private zbcd b;
  
  zcdx(zbcd paramzbcd, Workbook paramWorkbook)
  {
    this.d = 419;
    this.a = paramWorkbook;
    this.b = paramzbcd;
    a();
  }
  
  private void a()
  {
    int i = 27;
    if ((this.b.f != null) && (this.b.f.size() > 0)) {
      i += 16 * this.b.f.size();
    }
    this.c = new byte[i];
    zbcn localzbcn = new zbcn(this.b);
    int j = localzbcn.a(this.c);
    int k = 0;
    if (this.b.h)
    {
      k |= 0x1;
      if (this.b.b != null) {
        k |= 0x2;
      }
    }
    if (this.b.d) {
      k |= 0x4;
    }
    this.c[j] = ((byte)k);
    j++;
    System.arraycopy(zc.a(this.b.g), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(this.b.c), 0, this.c, j, 4);
    j += 4;
    zchk.a(this.b.f, this.c, j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */