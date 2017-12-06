package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcgg
  extends zche
{
  zcgg()
  {
    this.d = 43;
  }
  
  void a(Font paramFont, Workbook paramWorkbook)
    throws Exception
  {
    int i = 25 + paramFont.getName().length() * 2;
    this.c = new byte[i];
    System.arraycopy(zc.a(paramFont.j()), 0, this.c, 0, 2);
    int j = 0;
    if (paramFont.isItalic()) {
      j |= 0x2;
    }
    if (paramFont.isStrikeout()) {
      j |= 0x8;
    }
    System.arraycopy(zc.a(j), 0, this.c, 2, 2);
    System.arraycopy(zc.a(paramFont.g()), 0, this.c, 4, 2);
    this.c[6] = paramFont.e();
    this.c[8] = ((byte)zcij.d(paramFont.getUnderline()));
    this.c[9] = paramFont.h();
    this.c[10] = ((byte)paramFont.getCharset());
    zche.a(this.c, 12, paramFont.b(), 64, paramWorkbook);
    this.c[20] = zcij.b(paramFont.a());
    int k = 21;
    k = zcgj.a(this.c, k, paramFont.getName());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */