package com.aspose.cells;

class zcdz
  extends zche
{
  private Workbook a;
  private zbcg b;
  
  zcdz(zbcg paramzbcg, Workbook paramWorkbook)
  {
    this.d = 405;
    this.b = paramzbcg;
    this.a = paramWorkbook;
    a();
  }
  
  private void a()
  {
    int i = 31;
    this.c = new byte[i];
    zbcn localzbcn = new zbcn(this.b);
    int j = localzbcn.a(this.c);
    if (this.b.d) {
      this.c[j] = 1;
    }
    j++;
    zchk.a(this.b.f, this.c, j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */