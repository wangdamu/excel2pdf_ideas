package com.aspose.cells;

class zcis
  extends zche
{
  zcis()
  {
    this.d = 147;
  }
  
  void a(Worksheet paramWorksheet)
    throws Exception
  {
    String str = paramWorksheet.p;
    int i = 23;
    if (str != null) {
      i += str.length() * 2;
    }
    this.c = new byte[i];
    int j = 0;
    if (!paramWorksheet.getPageSetup().isPercentScale()) {
      j |= 0x1;
    }
    if (paramWorksheet.isOutlineShown()) {
      j |= 0x4;
    }
    this.c[0] = -55;
    this.c[1] = ((byte)j);
    zche.a(this.c, 3, paramWorksheet.o, 64, paramWorksheet.d());
    for (int k = 11; k <= 18; k++) {
      this.c[k] = -1;
    }
    k = 19;
    k = zcgj.a(this.c, k, str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */