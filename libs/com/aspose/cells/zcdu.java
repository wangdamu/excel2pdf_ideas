package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcdu
  extends zche
{
  private zbbv a;
  private Workbook b;
  
  zcdu(zbbv paramzbbv, Workbook paramWorkbook)
  {
    this.a = paramzbbv;
    this.b = paramWorkbook;
    this.d = 421;
    a();
  }
  
  private void a()
  {
    this.c = new byte[38];
    zbcn localzbcn = new zbcn(this.a);
    int i = localzbcn.a(this.c);
    System.arraycopy(zc.a(this.a.c), 0, this.c, i, 4);
    i += 4;
    System.arraycopy(zc.a(this.a.b), 0, this.c, i, 4);
    i += 4;
    zcgj.a(this.a.d, this.c, i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */