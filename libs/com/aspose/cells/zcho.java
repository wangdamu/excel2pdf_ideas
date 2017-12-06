package com.aspose.cells;

class zcho
  extends zcfo
{
  private Workbook c;
  
  zcho(Workbook paramWorkbook)
  {
    this.c = paramWorkbook;
  }
  
  void d()
    throws Exception
  {
    zajl localzajl = this.c.getWorksheets().g;
    zcbi localzcbi = new zcbi();
    localzcbi.a(localzajl.b(), 0);
    localzcbi.a(this.b);
    zchm localzchm = new zchm();
    int i = localzajl.c();
    for (int j = 0; j < i; j++)
    {
      zbbj localzbbj = localzajl.a(j);
      if (localzbbj.f()) {
        localzchm.a((zbdd)localzbbj, this.c);
      } else {
        localzchm.a(localzbbj.c);
      }
      localzchm.a(this.b);
    }
    zche localzche = new zche(160);
    localzche.a(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */