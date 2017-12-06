package com.aspose.cells;

class zcef
  extends zche
{
  private Workbook a;
  private zbcb b;
  
  zcef(zbcb paramzbcb, Workbook paramWorkbook)
  {
    this.a = paramWorkbook;
    this.b = paramzbcb;
    this.d = 412;
    a();
  }
  
  private void a()
  {
    this.c = new byte[30];
    zbcn localzbcn = new zbcn(this.b);
    int i = localzbcn.a(this.c);
    System.arraycopy(this.b.b, 0, this.c, i, 16);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */