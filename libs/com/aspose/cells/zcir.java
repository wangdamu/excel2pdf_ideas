package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcir
  extends zche
{
  zcir(Worksheet paramWorksheet, Workbook paramWorkbook)
  {
    this.d = 485;
    this.c = new byte[12];
    double d = paramWorksheet.getCells().getColumns().b();
    int i = zlp.a(paramWorkbook.getWorksheets());
    int j = 0;
    if (d > 1.0D) {
      j = (int)Math.floor(d * 256.0D + i + 0.5D) & 0xFFFF;
    } else {
      j = (int)Math.floor(d * (256 + i) + 0.5D) & 0xFFFF;
    }
    System.arraycopy(zc.a(j), 0, this.c, 0, 4);
    System.arraycopy(zc.a((int)d), 0, this.c, 4, 2);
    System.arraycopy(zc.a(paramWorksheet.getCells().a()), 0, this.c, 6, 2);
    int k = 0;
    if (paramWorksheet.getCells().a() == 0) {
      k = (byte)(k | 0x2);
    }
    this.c[8] = k;
    this.c[10] = paramWorksheet.getCells().s();
    this.c[11] = paramWorksheet.getCells().r();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */