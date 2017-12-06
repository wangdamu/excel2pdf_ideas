package com.aspose.cells;

class zced
  extends zche
{
  private Workbook a;
  private zbco b;
  
  zced(zbco paramzbco, Workbook paramWorkbook)
    throws Exception
  {
    this.d = 413;
    this.a = paramWorkbook;
    this.b = paramzbco;
    a();
  }
  
  private void a()
    throws Exception
  {
    int i = 22 + this.b.b.length() * 2 + this.b.c.length() * 2;
    this.c = new byte[i];
    zbcn localzbcn = new zbcn(this.b);
    int j = localzbcn.a(this.c);
    zcgj.a(this.c, j, this.b.c);
    j += this.b.c.length() * 2 + 4;
    zcgj.a(this.c, j, this.b.b);
    j += this.b.b.length() * 2 + 4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zced.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */