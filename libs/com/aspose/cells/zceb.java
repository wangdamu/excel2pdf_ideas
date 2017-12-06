package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zceb
  extends zche
{
  private zbbz a;
  private Workbook b;
  
  zceb(zbbz paramzbbz, Workbook paramWorkbook)
  {
    this.a = paramzbbz;
    this.b = paramWorkbook;
    this.d = 407;
    a();
  }
  
  private void a()
  {
    int i = 48;
    this.c = new byte[i];
    zbcn localzbcn = new zbcn(this.a);
    int j = localzbcn.a(this.c);
    zcgj.a(this.a.b, this.c, j);
    j += 16;
    zcgj.a(this.a.c, this.c, j);
    j += 16;
    System.arraycopy(zc.a(this.a.g), 0, this.c, j, 2);
    j += 2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zceb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */