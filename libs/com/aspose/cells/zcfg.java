package com.aspose.cells;

class zcfg
  extends zche
{
  zcfg()
  {
    this.d = 651;
  }
  
  void a(Worksheet paramWorksheet)
    throws Exception
  {
    String str = paramWorksheet.p;
    int i = 14;
    if (str != null) {
      i += str.length() * 2;
    }
    this.c = new byte[i];
    zche.a(this.c, 2, paramWorksheet.o, 64, paramWorksheet.d());
    int j = 10;
    j = zcgj.a(this.c, j, str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */