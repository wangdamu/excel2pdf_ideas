package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcec
  extends zche
{
  private zbbx a;
  private Workbook b;
  
  zcec(zbbx paramzbbx, Workbook paramWorkbook)
    throws Exception
  {
    this.a = paramzbbx;
    this.b = paramWorkbook;
    this.d = 416;
    a();
  }
  
  private void a()
    throws Exception
  {
    int i = 50 + (4 + (this.a.b() == null ? 0 : this.a.b().length() * 2));
    this.c = new byte[i];
    zbcn localzbcn = new zbcn(this.a);
    int j = localzbcn.a(this.c);
    System.arraycopy(zc.a(this.a.e), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(this.a.f), 0, this.c, j, 4);
    j += 4;
    this.c[j] = ((byte)(this.a.b == 0 ? 1 : 2));
    j += 2;
    int k = 0;
    if (this.a.c) {
      k |= 0x2;
    }
    if (this.a.g) {
      k |= 0x80;
    }
    if (this.a.h) {
      k |= 0x100;
    }
    k |= 0x800;
    System.arraycopy(zc.a(k), 0, this.c, j, 2);
    j += 2;
    System.arraycopy(this.a.d, 0, this.c, j, 16);
    j += 16;
    System.arraycopy(zc.a(this.a.k), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(this.a.i - this.a.k), 0, this.c, j, 4);
    j += 4;
    zcgj.a(this.c, j, this.a.b());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */