package com.aspose.cells;

class zcap
  extends zche
{
  zcap(zbf paramzbf)
  {
    this.d = 426;
    int i = paramzbf.c().length;
    this.c = new byte[17 + i];
    zcgj.a(paramzbf.a(), this.c, 0);
    System.arraycopy(paramzbf.c(), 0, this.c, 17, i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */